package n4;

import a3.k0;
import a3.m0;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.PowerManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.ViewGroup;
import b2.b2;
import com.google.android.gms.internal.cast.a1;
import com.google.android.gms.internal.cast.a2;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e0.e0;
import f9.s1;
import j$.util.DesugarCollections;
import j4.b0;
import j4.d0;
import j4.f0;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p4.t0;
import r0.i0;
import r0.l0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class s implements OnCompleteListener, com.google.android.gms.internal.clearcut.h, e9.k, h6.n, ff.b, j4.a0 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ s(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    public static String K(s sVar) {
        Collection<String> collection = (Collection) sVar.c;
        StringBuilder sb2 = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = (String) sVar.b;
        if (str != null) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            if (!upperCase.matches("[A-F0-9]+")) {
                throw new IllegalArgumentException("Invalid application ID: ".concat(str));
            }
            sb2.append("/");
            sb2.append(upperCase);
        }
        if (collection != null) {
            if (collection.isEmpty()) {
                throw new IllegalArgumentException("Must specify at least one namespace");
            }
            if (str == null) {
                sb2.append("/");
            }
            sb2.append("/");
            boolean z10 = true;
            for (String str2 : collection) {
                h6.a.b(str2);
                if (!z10) {
                    sb2.append(",");
                }
                if (!h6.a.a.matcher(str2).matches()) {
                    StringBuilder sb3 = new StringBuilder(str2.length());
                    for (int i10 = 0; i10 < str2.length(); i10++) {
                        char charAt = str2.charAt(i10);
                        if ((charAt < 'A' || charAt > 'Z') && ((charAt < 'a' || charAt > 'z') && !((charAt >= '0' && charAt <= '9') || charAt == '_' || charAt == '-' || charAt == '.' || charAt == ':'))) {
                            sb3.append(String.format("%%%04x", Integer.valueOf(charAt)));
                        } else {
                            sb3.append(charAt);
                        }
                    }
                    str2 = sb3.toString();
                }
                sb2.append(str2);
                z10 = false;
            }
        }
        if (str == null && collection == null) {
            sb2.append("/");
        }
        if (collection == null) {
            sb2.append("/");
        }
        sb2.append("//ALLOW_IPV6");
        return sb2.toString();
    }

    public static void c(s sVar, boolean z10, boolean z11) {
        synchronized (sVar) {
            boolean z12 = false;
            if (z10) {
                if (((PowerManager.WakeLock) sVar.c) == null) {
                    if (((Context) sVar.b).checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                        e2.a.l("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                        return;
                    }
                    PowerManager powerManager = (PowerManager) ((Context) sVar.b).getSystemService("power");
                    if (powerManager == null) {
                        e2.a.l("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                        return;
                    } else {
                        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                        sVar.c = newWakeLock;
                        newWakeLock.setReferenceCounted(false);
                    }
                }
            }
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sVar.c;
            if (wakeLock == null) {
                return;
            }
            if (z10 && z11) {
                z12 = true;
            }
            if (z12) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }

    public static boolean f(Editable editable, KeyEvent keyEvent, boolean z10) {
        androidx.emoji2.text.v[] vVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (vVarArr = (androidx.emoji2.text.v[]) editable.getSpans(selectionStart, selectionEnd, androidx.emoji2.text.v.class)) != null && vVarArr.length > 0) {
                for (androidx.emoji2.text.v vVar : vVarArr) {
                    int spanStart = editable.getSpanStart(vVar);
                    int spanEnd = editable.getSpanEnd(vVar);
                    if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void A(k.a aVar) {
        ti.e eVar = (ti.e) this.b;
        ((ActionMode.Callback) eVar.b).onDestroyActionMode(eVar.h(aVar));
        g.r rVar = (g.r) this.c;
        if (rVar.E != null) {
            rVar.f.getDecorView().removeCallbacks(rVar.F);
        }
        if (rVar.y != null) {
            l0 l0Var = rVar.G;
            if (l0Var != null) {
                l0Var.b();
            }
            l0 a2 = i0.a(rVar.y);
            a2.a(0.0f);
            rVar.G = a2;
            a2.d(new g.i(this, 2));
        }
        rVar.x = null;
        ViewGroup viewGroup = rVar.J;
        WeakHashMap weakHashMap = i0.a;
        r0.y.c(viewGroup);
        rVar.x();
    }

    @Override // ff.b
    public ff.a B(s sVar) {
        List list = (List) this.c;
        List list2 = (List) sVar.b;
        int size = list2 != null ? list2.size() : 0;
        if (size > 0) {
            ArrayList arrayList = new ArrayList(list.size() + size);
            arrayList.addAll(list);
            arrayList.addAll(list2);
            list = arrayList;
        }
        return new hd.i(sVar, (List) this.b, list);
    }

    public boolean C(k.a aVar, Menu menu) {
        ViewGroup viewGroup = ((g.r) this.c).J;
        WeakHashMap weakHashMap = i0.a;
        r0.y.c(viewGroup);
        ti.e eVar = (ti.e) this.b;
        ActionMode.Callback callback = (ActionMode.Callback) eVar.b;
        k.e h = eVar.h(aVar);
        a0.l lVar = (a0.l) eVar.e;
        Menu menu2 = (Menu) lVar.get(menu);
        if (menu2 == null) {
            menu2 = new l.a0((Context) eVar.c, (l.k) menu);
            lVar.put(menu, menu2);
        }
        return callback.onPrepareActionMode(h, menu2);
    }

    public void D(androidx.mediarouter.app.r rVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (!((Set) this.c).add(rVar)) {
            Log.w("MediaControllerCompat", "the callback has already been registered");
            return;
        }
        Handler handler = new Handler();
        rVar.f(handler);
        android.support.v4.media.session.h hVar = (android.support.v4.media.session.h) this.b;
        hVar.a.registerCallback(rVar.a, handler);
        synchronized (hVar.b) {
            if (hVar.e.a() != null) {
                android.support.v4.media.session.g gVar = new android.support.v4.media.session.g(rVar);
                hVar.d.put(rVar, gVar);
                rVar.c = gVar;
                try {
                    hVar.e.a().o(gVar);
                    rVar.e(13, null, null);
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                }
            } else {
                rVar.c = null;
                hVar.c.add(rVar);
            }
        }
    }

    public void E(Object obj) {
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new a3.i0(this, obj, SystemClock.elapsedRealtime(), 0));
        }
    }

    public void F(l lVar, Handler handler) {
        n nVar = (n) this.b;
        synchronized (nVar.d) {
            nVar.l = lVar;
            nVar.a.setCallback(lVar.b, handler);
            lVar.C(nVar, handler);
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.AbstractCollection, java.util.List] */
    public void G(z zVar) {
        n nVar = (n) this.b;
        nVar.g = zVar;
        synchronized (nVar.d) {
            for (int beginBroadcast = nVar.f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((b) nVar.f.getBroadcastItem(beginBroadcast)).r(zVar);
                } catch (RemoteException | SecurityException e) {
                    e2.a.d("MediaSessionCompat", "Dead object in setPlaybackState.", e);
                }
            }
            nVar.f.finishBroadcast();
        }
        MediaSession mediaSession = nVar.a;
        if (zVar.w == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(zVar.a, zVar.b, zVar.d, zVar.n);
            builder.setBufferedPosition(zVar.c);
            builder.setActions(zVar.e);
            builder.setErrorMessage(zVar.h);
            for (y yVar : zVar.r) {
                yVar.getClass();
                PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(yVar.a, yVar.b, yVar.c);
                builder2.setExtras(yVar.d);
                PlaybackState.CustomAction build = builder2.build();
                if (build != null) {
                    builder.addCustomAction(build);
                }
            }
            builder.setActiveQueueItemId(zVar.s);
            builder.setExtras(zVar.v);
            zVar.w = builder.build();
        }
        mediaSession.setPlaybackState(zVar.w);
    }

    public void H(androidx.mediarouter.app.r rVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (!((Set) this.c).remove(rVar)) {
            Log.w("MediaControllerCompat", "the callback has never been registered");
            return;
        }
        try {
            ((android.support.v4.media.session.h) this.b).b(rVar);
        } finally {
            rVar.f(null);
        }
    }

    public void I(ArrayList arrayList) {
        f2.t tVar;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((f2.s) arrayList.get(i10)).a == 1) {
                try {
                    tVar = new f2.t((f2.s) arrayList.get(i10));
                } catch (f2.r unused) {
                    tVar = null;
                }
                this.c = tVar;
            }
        }
    }

    public void J(b2 b2Var) {
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new a1.f(4, this, b2Var));
        }
    }

    @Override // j4.a0
    public void a(e2.x xVar) {
        d0 d0Var = (d0) this.c;
        SparseArray sparseArray = d0Var.h;
        a4.g gVar = (a4.g) this.b;
        if (xVar.A() == 0 && (xVar.A() & 128) != 0) {
            xVar.O(6);
            int a2 = xVar.a() / 4;
            for (int i10 = 0; i10 < a2; i10++) {
                xVar.k(0, 4, gVar.b);
                gVar.m(0);
                int g7 = gVar.g(16);
                gVar.o(3);
                if (g7 == 0) {
                    gVar.o(13);
                } else {
                    int g10 = gVar.g(13);
                    if (sparseArray.get(g10) == null) {
                        sparseArray.put(g10, new b0(new e0(d0Var, g10)));
                        d0Var.n++;
                    }
                }
            }
            if (d0Var.a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    @Override // e9.k
    public Object apply(Object obj) {
        return ((e9.k) ((b6.i) this.b).b).apply(obj);
    }

    public void d() {
        this.b = null;
        this.c = null;
    }

    public boolean e(int i10) {
        return ((b2.v) this.b).a.get(i10);
    }

    public void g(i2.e eVar) {
        synchronized (eVar) {
        }
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new k0(this, eVar, 1));
        }
    }

    @Override // h6.n
    public void h(String str, long j10, long j11, long j12) {
        h6.n nVar = (h6.n) this.b;
        if (nVar != null) {
            nVar.h(str, j10, j11, j12);
        }
    }

    public void i(androidx.fragment.app.r f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.r rVar = ((androidx.fragment.app.i0) this.b).y;
        if (rVar != null) {
            rVar.p().o.i(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void j(androidx.fragment.app.r f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.i0 i0Var = (androidx.fragment.app.i0) this.b;
        androidx.fragment.app.u uVar = i0Var.w.b;
        androidx.fragment.app.r rVar = i0Var.y;
        if (rVar != null) {
            rVar.p().o.j(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void k(androidx.fragment.app.r f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.r rVar = ((androidx.fragment.app.i0) this.b).y;
        if (rVar != null) {
            rVar.p().o.k(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void l(androidx.fragment.app.r f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.r rVar = ((androidx.fragment.app.i0) this.b).y;
        if (rVar != null) {
            rVar.p().o.l(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void m(androidx.fragment.app.r f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.r rVar = ((androidx.fragment.app.i0) this.b).y;
        if (rVar != null) {
            rVar.p().o.m(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void n(androidx.fragment.app.r f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.r rVar = ((androidx.fragment.app.i0) this.b).y;
        if (rVar != null) {
            rVar.p().o.n(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void o(androidx.fragment.app.r f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.i0 i0Var = (androidx.fragment.app.i0) this.b;
        androidx.fragment.app.u uVar = i0Var.w.b;
        androidx.fragment.app.r rVar = i0Var.y;
        if (rVar != null) {
            rVar.p().o.o(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        boolean z10;
        e6.b bVar;
        switch (this.a) {
            case 7:
                b9.d dVar = (b9.d) this.b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                synchronized (dVar.f) {
                    dVar.e.remove(taskCompletionSource);
                }
                return;
            default:
                com.google.android.gms.internal.cast.p pVar = (com.google.android.gms.internal.cast.p) this.b;
                e6.b bVar2 = (e6.b) this.c;
                p4.x xVar = pVar.c;
                h6.b bVar3 = com.google.android.gms.internal.cast.p.j;
                if (task.isSuccessful()) {
                    Bundle bundle = (Bundle) task.getResult();
                    boolean z11 = bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
                    bVar3.b("The module-to-client output switcher flag %s", true != z11 ? "not existed" : "existed");
                    if (z11) {
                        z10 = bundle.getBoolean("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
                        Log.i(bVar3.a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.x)));
                        boolean z12 = !z10 && bVar2.x;
                        if (xVar != null || (bVar = pVar.d) == null) {
                            return;
                        }
                        boolean z13 = bVar.v;
                        boolean z14 = bVar.s;
                        p4.y yVar = new p4.y();
                        int i10 = Build.VERSION.SDK_INT;
                        if (i10 >= 30) {
                            yVar.b = z12;
                        }
                        if (i10 >= 30) {
                            yVar.d = z13;
                        }
                        if (i10 >= 30) {
                            yVar.c = z14;
                        }
                        p4.x.i(new p4.z(yVar));
                        Log.i(bVar3.a, bVar3.d("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(pVar.i), Boolean.valueOf(z12), Boolean.valueOf(z13), Boolean.valueOf(z14)));
                        if (z13) {
                            com.google.android.gms.internal.cast.s sVar = pVar.f;
                            o6.l.h(sVar);
                            com.google.android.gms.internal.cast.o oVar = new com.google.android.gms.internal.cast.o(sVar);
                            p4.x.b();
                            p4.x.c().f = oVar;
                            a2.a(a1.b0);
                            return;
                        }
                        return;
                    }
                }
                z10 = true;
                Log.i(bVar3.a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.x)));
                if (z10) {
                }
                if (xVar != null) {
                    return;
                } else {
                    return;
                }
        }
    }

    public void p(androidx.fragment.app.r f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.r rVar = ((androidx.fragment.app.i0) this.b).y;
        if (rVar != null) {
            rVar.p().o.p(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void q(androidx.fragment.app.r f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.r rVar = ((androidx.fragment.app.i0) this.b).y;
        if (rVar != null) {
            rVar.p().o.q(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void r(androidx.fragment.app.r f7, Bundle bundle, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.r rVar = ((androidx.fragment.app.i0) this.b).y;
        if (rVar != null) {
            rVar.p().o.r(f7, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void s(androidx.fragment.app.r f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.r rVar = ((androidx.fragment.app.i0) this.b).y;
        if (rVar != null) {
            rVar.p().o.s(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    @Override // h6.n
    public void t(String str, long j10, int i10, Object obj, long j11, long j12) {
        int i11;
        h6.m mVar = (h6.m) this.c;
        if (((h6.n) this.b) != null) {
            if (i10 == 2001) {
                Object[] objArr = {Integer.valueOf(mVar.i)};
                h6.b bVar = mVar.a;
                Log.w(bVar.a, bVar.d("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", objArr));
                Iterator it = ((f6.h) mVar.h.b).i.iterator();
                while (it.hasNext()) {
                    ((f6.g) it.next()).o();
                }
                i11 = 2001;
            } else {
                i11 = i10;
            }
            ((h6.n) this.b).t(str, j10, i11, obj, j11, j12);
        }
    }

    public String toString() {
        switch (this.a) {
            case 15:
                try {
                    if (((fc.b) this.c) == null) {
                        this.c = ((fc.e) this.b).a();
                    }
                    return ((fc.b) this.c).toString();
                } catch (ec.e unused) {
                    return "";
                }
            default:
                return super.toString();
        }
    }

    public void u(androidx.fragment.app.r f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.r rVar = ((androidx.fragment.app.i0) this.b).y;
        if (rVar != null) {
            rVar.p().o.u(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void v(androidx.fragment.app.r f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.r rVar = ((androidx.fragment.app.i0) this.b).y;
        if (rVar != null) {
            rVar.p().o.v(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public c3.o w(Object... objArr) {
        Constructor a2;
        synchronized (((AtomicBoolean) this.c)) {
            if (!((AtomicBoolean) this.c).get()) {
                try {
                    a2 = ((c2.i) this.b).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.c).set(true);
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            a2 = null;
        }
        if (a2 == null) {
            return null;
        }
        try {
            return (c3.o) a2.newInstance(objArr);
        } catch (Exception e10) {
            throw new IllegalStateException("Unexpected error creating extractor", e10);
        }
    }

    public synchronized Map x() {
        try {
            if (((Map) this.c) == null) {
                this.c = DesugarCollections.unmodifiableMap(new HashMap((HashMap) this.b));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Map) this.c;
    }

    public android.support.v4.media.session.m y() {
        MediaController.TransportControls transportControls = ((android.support.v4.media.session.h) this.b).a.getTransportControls();
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 29 ? new android.support.v4.media.session.o(transportControls) : i10 >= 24 ? new android.support.v4.media.session.n(transportControls) : new android.support.v4.media.session.m(transportControls);
    }

    public boolean z(CharSequence charSequence, int i10, int i11, androidx.emoji2.text.o oVar) {
        if (oVar.c == 0) {
            androidx.emoji2.text.h hVar = (androidx.emoji2.text.h) this.c;
            p1.a b10 = oVar.b();
            int a2 = b10.a(8);
            if (a2 != 0) {
                ((ByteBuffer) b10.d).getShort(a2 + b10.a);
            }
            androidx.emoji2.text.d dVar = (androidx.emoji2.text.d) hVar;
            dVar.getClass();
            ThreadLocal threadLocal = androidx.emoji2.text.d.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb2 = (StringBuilder) threadLocal.get();
            sb2.setLength(0);
            while (i10 < i11) {
                sb2.append(charSequence.charAt(i10));
                i10++;
            }
            TextPaint textPaint = dVar.a;
            String sb3 = sb2.toString();
            int i12 = i0.c.a;
            oVar.c = textPaint.hasGlyph(sb3) ? 2 : 1;
        }
        return oVar.c == 2;
    }

    @Override // com.google.android.gms.internal.clearcut.h
    public Object zzp() {
        com.google.android.gms.internal.clearcut.d dVar = (com.google.android.gms.internal.clearcut.d) this.b;
        com.google.android.gms.internal.clearcut.b bVar = (com.google.android.gms.internal.clearcut.b) this.c;
        bVar.getClass();
        Map b10 = com.google.android.gms.internal.clearcut.d.e() ? ((Boolean) com.google.android.gms.internal.clearcut.d.c(new com.google.android.gms.internal.clearcut.e("gms:phenotype:phenotype_flag:debug_disable_caching"))).booleanValue() : false ? bVar.b() : bVar.e;
        if (b10 == null) {
            synchronized (bVar.d) {
                try {
                    HashMap hashMap = bVar.e;
                    b10 = hashMap;
                    if (hashMap == null) {
                        HashMap b11 = bVar.b();
                        bVar.e = b11;
                        b10 = b11;
                    }
                } finally {
                }
            }
        }
        if (b10 == null) {
            b10 = Collections.EMPTY_MAP;
        }
        return (String) b10.get(dVar.b);
    }

    public /* synthetic */ s(int i10, boolean z10) {
        this.a = i10;
    }

    public /* synthetic */ s(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public /* synthetic */ s(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.b = obj2;
        this.c = obj;
    }

    public s(IBinder iBinder) {
        this.a = 27;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (interfaceDescriptor != "android.os.IMessenger" && (interfaceDescriptor == null || !interfaceDescriptor.equals("android.os.IMessenger"))) {
            if (interfaceDescriptor != "com.google.android.gms.iid.IMessengerCompat" && (interfaceDescriptor == null || !interfaceDescriptor.equals("com.google.android.gms.iid.IMessengerCompat"))) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.c = new k6.g(iBinder);
            this.b = null;
            return;
        }
        this.b = new Messenger(iBinder);
        this.c = null;
    }

    public s(n6.a aVar) {
        this.a = 20;
        this.b = aVar == null ? null : aVar.b;
    }

    public s(androidx.fragment.app.i0 i0Var) {
        this.a = 6;
        this.b = i0Var;
        this.c = new CopyOnWriteArrayList();
    }

    public s(int i10) {
        this.a = i10;
        switch (i10) {
            case 19:
                this.b = new HashMap();
                break;
            default:
                this.b = ByteBuffer.allocateDirect(500);
                break;
        }
    }

    public s(b2.v vVar, SparseArray sparseArray) {
        this.a = 25;
        this.b = vVar;
        SparseBooleanArray sparseBooleanArray = vVar.a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
            int a2 = vVar.a(i10);
            j2.a aVar = (j2.a) sparseArray.get(a2);
            aVar.getClass();
            sparseArray2.append(a2, aVar);
        }
        this.c = sparseArray2;
    }

    public s(com.google.firebase.messaging.q qVar, pa.d dVar, androidx.emoji2.text.d dVar2) {
        this.a = 5;
        this.b = qVar;
        this.c = dVar2;
    }

    public s(String str) {
        this.a = 28;
        this.c = null;
        this.b = str;
    }

    public s(Handler handler, m0 m0Var) {
        this.a = 2;
        if (m0Var != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.b = handler;
        this.c = m0Var;
    }

    public s(ArrayList arrayList, ArrayList arrayList2) {
        this.a = 21;
        int size = arrayList.size();
        this.b = new int[size];
        this.c = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            ((int[]) this.b)[i10] = ((Integer) arrayList.get(i10)).intValue();
            ((float[]) this.c)[i10] = ((Float) arrayList2.get(i10)).floatValue();
        }
    }

    public s(int i10, int i11) {
        this.a = 21;
        this.b = new int[]{i10, i11};
        this.c = new float[]{0.0f, 1.0f};
    }

    public s(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.a = 4;
        if (mediaSessionCompat$Token != null) {
            this.c = DesugarCollections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                this.b = new android.support.v4.media.session.i(context, mediaSessionCompat$Token);
                return;
            } else {
                this.b = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
                return;
            }
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    public s(int i10, int i11, int i12) {
        this.a = 21;
        this.b = new int[]{i10, i11, i12};
        this.c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public s(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this.a = 0;
        if (!TextUtils.isEmpty(str)) {
            if (componentName == null) {
                int i10 = t0.b;
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setPackage(context.getPackageName());
                List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
                if (queryBroadcastReceivers.size() == 1) {
                    ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
                    componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                } else {
                    if (queryBroadcastReceivers.size() > 1) {
                        e2.a.l("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
                    }
                    componentName = null;
                }
                if (componentName == null) {
                    e2.a.g("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
                }
            }
            if (componentName != null && pendingIntent == null) {
                Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                intent2.setComponent(componentName);
                pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 29) {
                this.b = new p(context, str, bundle);
            } else if (i11 >= 28) {
                this.b = new o(context, str, bundle);
            } else {
                this.b = new n(context, str, bundle);
            }
            Looper myLooper = Looper.myLooper();
            F(new j(), new Handler(myLooper == null ? Looper.getMainLooper() : myLooper));
            ((n) this.b).a.setMediaButtonReceiver(pendingIntent);
            r rVar = ((n) this.b).c;
            w wVar = new w();
            DesugarCollections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                wVar.a = new g(context, rVar);
            } else {
                wVar.a = new f(context, rVar);
            }
            this.c = wVar;
            return;
        }
        throw new IllegalArgumentException("tag must not be null or empty");
    }

    @Override // j4.a0
    public void b(e2.k0 k0Var, c3.q qVar, f0 f0Var) {
    }

    public s(s1 s1Var, int[] iArr) {
        this.a = 16;
        this.b = f9.i0.u(s1Var);
        this.c = iArr;
    }

    public s(d0 d0Var) {
        this.a = 26;
        this.c = d0Var;
        this.b = new a4.g(new byte[4], 4);
    }

    public s(c2.i iVar) {
        this.a = 9;
        this.b = iVar;
        this.c = new AtomicBoolean(false);
    }
}
