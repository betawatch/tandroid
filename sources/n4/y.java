package n4;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import ji.a4;
import ji.g6;
import ji.h1;
import ji.i3;
import ji.j4;
import ji.s3;
import ji.t3;
import ji.u3;
import ji.u4;
import ji.v3;
import m.p3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.vi;
import p4.t0;
import r0.l0;
import v7.t7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class y implements OnCompleteListener, ce.b, ea.a, g6.n, c3.i, t3, le.f, n5.b {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ y(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    public static void F(Bundle bundle) {
        if (bundle != null) {
            ClassLoader classLoader = y.class.getClassLoader();
            classLoader.getClass();
            bundle.setClassLoader(classLoader);
        }
    }

    public static String N(y yVar) {
        Collection<String> collection = (Collection) yVar.c;
        StringBuilder sb2 = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = (String) yVar.b;
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
                g6.a.b(str2);
                if (!z10) {
                    sb2.append(",");
                }
                if (!g6.a.a.matcher(str2).matches()) {
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

    public void A() {
        this.b = null;
        this.c = null;
    }

    public i9.w B(byte[] bArr) {
        byte[] bArr2;
        m2.t tVar = (m2.t) this.c;
        if (tVar != null && (bArr2 = (byte[]) tVar.b) != null && Arrays.equals(bArr2, bArr)) {
            i9.w wVar = (i9.w) ((m2.t) this.c).d;
            e2.d.h(wVar);
            return wVar;
        }
        g2.i iVar = (g2.i) this.b;
        i9.w a2 = ((i9.y) iVar.a).a(new com.google.firebase.messaging.h(1, iVar, bArr));
        this.c = new m2.t(bArr, a2);
        return a2;
    }

    @Override // ea.a
    public StackTraceElement[] C(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        ea.a[] aVarArr = (ea.a[]) this.b;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i10 = 0; i10 < 1; i10++) {
            ea.a aVar = aVarArr[i10];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = aVar.C(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > 1024 ? ((t7.u) this.c).C(stackTraceElementArr2) : stackTraceElementArr2;
    }

    public void D(i2.h hVar) {
        synchronized (hVar) {
        }
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new k2.g(this, hVar, 0));
        }
    }

    public byte[] E(n3.a aVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.c;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.b;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(aVar.a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(aVar.b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.c);
            dataOutputStream.writeLong(aVar.d);
            dataOutputStream.write(aVar.e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }

    public c3.o G(Object... objArr) {
        Constructor a2;
        synchronized (((AtomicBoolean) this.c)) {
            if (!((AtomicBoolean) this.c).get()) {
                try {
                    a2 = ((androidx.emoji2.text.w) this.b).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.c).set(true);
                } catch (Exception e7) {
                    throw new RuntimeException("Error instantiating extension", e7);
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

    public synchronized Map H() {
        try {
            if (((Map) this.c) == null) {
                this.c = DesugarCollections.unmodifiableMap(new HashMap((HashMap) this.b));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Map) this.c;
    }

    public void I(k.a aVar) {
        fg.f fVar = (fg.f) this.b;
        ((ActionMode.Callback) fVar.a).onDestroyActionMode(fVar.p(aVar));
        g.s sVar = (g.s) this.c;
        if (sVar.E != null) {
            sVar.f.getDecorView().removeCallbacks(sVar.F);
        }
        if (sVar.y != null) {
            l0 l0Var = sVar.G;
            if (l0Var != null) {
                l0Var.b();
            }
            l0 a2 = r0.i0.a(sVar.y);
            a2.a(0.0f);
            sVar.G = a2;
            a2.d(new g.j(this, 2));
        }
        sVar.x = null;
        ViewGroup viewGroup = sVar.J;
        WeakHashMap weakHashMap = r0.i0.a;
        r0.y.c(viewGroup);
        sVar.y();
    }

    public boolean J(k.a aVar, Menu menu) {
        ViewGroup viewGroup = ((g.s) this.c).J;
        WeakHashMap weakHashMap = r0.i0.a;
        r0.y.c(viewGroup);
        fg.f fVar = (fg.f) this.b;
        ActionMode.Callback callback = (ActionMode.Callback) fVar.a;
        k.e p5 = fVar.p(aVar);
        a0.l lVar = (a0.l) fVar.d;
        Menu menu2 = (Menu) lVar.get(menu);
        if (menu2 == null) {
            menu2 = new l.b0((Context) fVar.b, (l.l) menu);
            lVar.put(menu, menu2);
        }
        return callback.onPrepareActionMode(p5, menu2);
    }

    public void K(p pVar, Handler handler) {
        r rVar = (r) this.b;
        synchronized (rVar.d) {
            rVar.m = pVar;
            rVar.a.setCallback(pVar.b, handler);
            pVar.C(rVar, handler);
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.AbstractCollection, java.util.List] */
    public void L(h0 h0Var) {
        r rVar = (r) this.b;
        rVar.g = h0Var;
        synchronized (rVar.d) {
            for (int beginBroadcast = rVar.f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((f) rVar.f.getBroadcastItem(beginBroadcast)).t(h0Var);
                } catch (RemoteException | SecurityException e7) {
                    Log.e("MediaSessionCompat", "Dead object in setPlaybackState.", e7);
                }
            }
            rVar.f.finishBroadcast();
        }
        MediaSession mediaSession = rVar.a;
        if (h0Var.w == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(h0Var.a, h0Var.b, h0Var.d, h0Var.n);
            builder.setBufferedPosition(h0Var.c);
            builder.setActions(h0Var.e);
            builder.setErrorMessage(h0Var.h);
            for (g0 g0Var : h0Var.r) {
                g0Var.getClass();
                PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(g0Var.a, g0Var.b, g0Var.c);
                builder2.setExtras(g0Var.d);
                PlaybackState.CustomAction build = builder2.build();
                if (build != null) {
                    builder.addCustomAction(build);
                }
            }
            builder.setActiveQueueItemId(h0Var.s);
            if (Build.VERSION.SDK_INT >= 22) {
                f0.a(builder, h0Var.v);
            }
            h0Var.w = builder.build();
        }
        mediaSession.setPlaybackState(h0Var.w);
    }

    public int M(Context context, com.google.android.gms.common.api.c cVar) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        n6.l.h(context);
        n6.l.h(cVar);
        int i10 = 0;
        if (!cVar.k()) {
            return 0;
        }
        int l4 = cVar.l();
        int i11 = sparseIntArray.get(l4, -1);
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        while (true) {
            if (i12 >= sparseIntArray.size()) {
                i10 = -1;
                break;
            }
            int keyAt = sparseIntArray.keyAt(i12);
            if (keyAt > l4 && sparseIntArray.get(keyAt) == 0) {
                break;
            }
            i12++;
        }
        if (i10 == -1) {
            i10 = ((k6.e) this.c).d(context, l4);
        }
        sparseIntArray.put(l4, i10);
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0023 A[RETURN] */
    @Override // ji.t3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(float f7) {
        boolean z10;
        a4 a4Var = ((ji.r) this.c).s;
        if (a4Var != null) {
            FrameLayout frameLayout = a4Var.H;
            if (frameLayout != null) {
                frameLayout.getLocationOnScreen(new int[2]);
                if (f7 >= r4[1]) {
                    z10 = true;
                    a4Var.e(z10, true);
                    if (!z10) {
                        return true;
                    }
                }
            }
            z10 = false;
            a4Var.e(z10, true);
            if (!z10) {
            }
        }
        return false;
    }

    @Override // ji.t3
    public void b(s3 s3Var, View view) {
        ji.r rVar = (ji.r) this.c;
        n70 n70Var = new n70(rVar, (f6) this.b, view, false, false, true);
        n70Var.Q = true;
        rVar.H = j4.c(n70Var, rVar.b.f0, rVar.getContext(), (f6) this.b, s3Var, true);
    }

    @Override // le.f
    public void c() {
        ((le.k) this.b).c();
    }

    @Override // ji.t3
    public void d(u3 u3Var, View view) {
        ji.r rVar = (ji.r) this.c;
        n70 n70Var = new n70(rVar, (f6) this.b, view, false, false, true);
        n70Var.Q = true;
        n2 n2Var = rVar.b.f0;
        rVar.getContext();
        rVar.H = j4.b(n70Var, n2Var, u3Var, true);
    }

    @Override // ji.t3
    public void e(int i10) {
        ji.r.O((ji.r) this.c, 74, i10);
    }

    @Override // ji.t3
    public void f() {
        ji.r rVar = (ji.r) this.c;
        v3 v3Var = rVar.r;
        a4 a4Var = rVar.s;
        if (a4Var != null) {
            i3 i3Var = v3Var.n3;
            int i10 = (i3Var != null && i3Var.y() && v3Var.B4()) ? 1 : 0;
            if (a4Var.a0 == 2) {
                a4Var.b0 = i10;
            } else {
                a4Var.f(i10, true);
            }
            if (i10 != 0) {
                rVar.W();
            }
        }
        rVar.Z();
    }

    @Override // c3.i
    public c3.h g(c3.p pVar, long j3) {
        long position = pVar.getPosition();
        int min = (int) Math.min(20000L, pVar.getLength() - position);
        e2.v vVar = (e2.v) this.c;
        vVar.G(min);
        pVar.b(0, min, vVar.a);
        int i10 = -1;
        long j10 = -9223372036854775807L;
        int i11 = -1;
        while (vVar.a() >= 4) {
            if (h3.a.a(vVar.b, vVar.a) != 442) {
                vVar.K(1);
            } else {
                vVar.K(4);
                long c10 = j4.x.c(vVar);
                if (c10 != -9223372036854775807L) {
                    long b10 = ((e2.b0) this.b).b(c10);
                    if (b10 > j3) {
                        return j10 == -9223372036854775807L ? new c3.h(-1, b10, position) : new c3.h(0, -9223372036854775807L, position + i11);
                    }
                    if (b10 + 100000 > j3) {
                        return new c3.h(0, -9223372036854775807L, position + vVar.b);
                    }
                    j10 = b10;
                    i11 = vVar.b;
                }
                int i12 = vVar.c;
                if (vVar.a() >= 10) {
                    vVar.K(9);
                    int x10 = vVar.x() & 7;
                    if (vVar.a() >= x10) {
                        vVar.K(x10);
                        if (vVar.a() >= 4) {
                            if (h3.a.a(vVar.b, vVar.a) == 443) {
                                vVar.K(4);
                                int D = vVar.D();
                                if (vVar.a() < D) {
                                    vVar.J(i12);
                                } else {
                                    vVar.K(D);
                                }
                            }
                            while (true) {
                                if (vVar.a() < 4) {
                                    break;
                                }
                                int a2 = h3.a.a(vVar.b, vVar.a);
                                if (a2 == 442 || a2 == 441 || (a2 >>> 8) != 1) {
                                    break;
                                }
                                vVar.K(4);
                                if (vVar.a() < 2) {
                                    vVar.J(i12);
                                    break;
                                }
                                vVar.J(Math.min(vVar.c, vVar.b + vVar.D()));
                            }
                        } else {
                            vVar.J(i12);
                        }
                    } else {
                        vVar.J(i12);
                    }
                } else {
                    vVar.J(i12);
                }
                i10 = vVar.b;
            }
        }
        return j10 != -9223372036854775807L ? new c3.h(-2, j10, position + i10) : c3.h.d;
    }

    @Override // fd.a
    public Object get() {
        return new m5.d((Context) ((l.d) this.b).b, (m2.t) ((u4) this.c).get());
    }

    @Override // le.f
    public boolean i() {
        return false;
    }

    @Override // le.f
    public boolean j(float f7) {
        return false;
    }

    @Override // ji.t3
    public void l() {
        a4 a4Var = ((ji.r) this.c).s;
        if (a4Var != null) {
            int i10 = a4Var.a0;
            if (i10 == 2) {
                i10 = 0;
            }
            a4Var.b0 = i10;
            a4Var.e(false, false);
            a4Var.f(2, true);
        }
    }

    @Override // g6.n
    public void m(String str, long j3, long j10, long j11) {
        g6.n nVar = (g6.n) this.b;
        if (nVar != null) {
            nVar.m(str, j3, j10, j11);
        }
    }

    @Override // ji.t3
    public void n() {
        ji.r rVar = (ji.r) this.c;
        if (rVar.getCurrentItemTop() != rVar.I) {
            rVar.b.X1(rVar, 0);
        }
        rVar.a0();
        ji.r.K(rVar);
    }

    @Override // ji.t3
    public void o(int i10) {
        ji.r rVar = (ji.r) this.c;
        rVar.b.X1(rVar, i10);
        rVar.a0();
        ji.r.K(rVar);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        a9.e eVar = (a9.e) this.b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
        synchronized (eVar.f) {
            eVar.e.remove(taskCompletionSource);
        }
    }

    @Override // ji.t3
    public void onContentChanged() {
        ji.r rVar = (ji.r) this.c;
        a4 a4Var = rVar.s;
        if (a4Var != null) {
            a4Var.setSendLoading(rVar.r.l3());
        }
        rVar.V(true);
        rVar.Y();
        ji.d dVar = rVar.P;
        AndroidUtilities.cancelRunOnUIThread(dVar);
        AndroidUtilities.runOnUIThread(dVar, 1000L);
    }

    @Override // ji.t3
    public void p(ji.a aVar) {
        ji.r rVar = (ji.r) this.c;
        vi viVar = rVar.b;
        n2 n2Var = viVar.f0;
        if (n2Var != null && aVar != null && (aVar.b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(n2Var)) {
            vi viVar2 = new vi(rVar.getContext(), viVar.f0, false, false, false, null);
            viVar2.Z1 = new rb.a(11);
            viVar2.P = true;
            viVar2.x1.setVisibility(8);
            viVar2.t2 = new androidx.car.app.utils.a(rVar, aVar, viVar2, 10);
            viVar2.r1();
            viVar2.show();
        }
    }

    @Override // le.f
    public void q() {
        ((le.k) this.b).e((le.l) this.c);
    }

    @Override // ji.t3
    public void r() {
        a4 a4Var = ((ji.r) this.c).s;
        if (a4Var != null) {
            a4Var.e(false, true);
            int i10 = a4Var.b0;
            a4Var.f(i10 != 2 ? i10 : 0, true);
        }
    }

    @Override // g6.n
    public void s(String str, long j3, int i10, Object obj, long j10, long j11) {
        int i11;
        g6.m mVar = (g6.m) this.c;
        if (((g6.n) this.b) != null) {
            if (i10 == 2001) {
                Object[] objArr = {Integer.valueOf(mVar.i)};
                g6.b bVar = mVar.a;
                Log.w(bVar.a, bVar.d("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", objArr));
                Iterator it = ((e6.h) mVar.h.b).i.iterator();
                while (it.hasNext()) {
                    ((e6.g) it.next()).o();
                }
                i11 = 2001;
            } else {
                i11 = i10;
            }
            ((g6.n) this.b).s(str, j3, i11, obj, j10, j11);
        }
    }

    @Override // ji.t3
    public n70 t(View view) {
        ji.r rVar = (ji.r) this.c;
        n70 n70Var = new n70(rVar, (f6) this.b, view, false, false, true);
        rVar.H = n70Var;
        return n70Var;
    }

    public String toString() {
        switch (this.a) {
            case 28:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.c.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    sb2.append((String) arrayList.get(i10));
                    if (i10 < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override // ji.t3
    public void u() {
        ji.r rVar = (ji.r) this.c;
        rVar.X();
        rVar.Y();
    }

    @Override // ji.t3
    public void v(h1 h1Var, boolean z10) {
        ((ji.r) this.c).b.t1(h1Var, z10);
    }

    @Override // c3.i
    public void w() {
        e2.v vVar = (e2.v) this.c;
        byte[] bArr = e2.d0.b;
        vVar.getClass();
        vVar.H(bArr.length, bArr);
    }

    @Override // ji.t3
    public void x(g6 g6Var, String str) {
        ji.r rVar = (ji.r) this.c;
        if (rVar.v == null) {
            f6 f6Var = (f6) this.b;
            rVar.v = new p3(new ah.i0(20, this, f6Var), f6Var);
        }
        rVar.v.d(g6Var, str);
    }

    public void y(Object obj, String str) {
        ((ArrayList) this.b).add(a4.a.C(str, "=", String.valueOf(obj)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r2.c(r6, r7, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // ce.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object z(ce.c cVar, kd.c cVar2) {
        ce.d dVar;
        int i10;
        y yVar;
        Throwable th2;
        if (cVar2 instanceof ce.d) {
            dVar = (ce.d) cVar2;
            int i11 = dVar.b;
            if ((i11 & TLObject.FLAG_31) != 0) {
                dVar.b = i11 - TLObject.FLAG_31;
                Object obj = dVar.a;
                Object obj2 = jd.a.a;
                i10 = dVar.b;
                if (i10 != 0) {
                    t7.b(obj);
                    ce.b bVar = (ce.b) this.b;
                    dVar.d = this;
                    dVar.e = cVar;
                    dVar.b = 1;
                    obj = ce.o.a(bVar, cVar, dVar);
                    if (obj != obj2) {
                        yVar = this;
                    }
                    return obj2;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t7.b(obj);
                    return gd.i.a;
                }
                cVar = dVar.e;
                yVar = dVar.d;
                t7.b(obj);
                th2 = (Throwable) obj;
                if (th2 != null) {
                    za.w wVar = (za.w) yVar.c;
                    dVar.d = null;
                    dVar.e = null;
                    dVar.b = 2;
                }
                return gd.i.a;
            }
        }
        dVar = new ce.d(this, cVar2);
        Object obj3 = dVar.a;
        Object obj22 = jd.a.a;
        i10 = dVar.b;
        if (i10 != 0) {
        }
        th2 = (Throwable) obj3;
        if (th2 != null) {
        }
        return gd.i.a;
    }

    public /* synthetic */ y(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.b = obj;
    }

    public /* synthetic */ y(int i10, boolean z10) {
        this.a = i10;
    }

    public /* synthetic */ y(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = null;
    }

    public /* synthetic */ y(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public y(int i10) {
        this.a = i10;
        switch (i10) {
            case 15:
                this.b = new HashMap();
                break;
            case 27:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.b = byteArrayOutputStream;
                this.c = new DataOutputStream(byteArrayOutputStream);
                break;
            default:
                this.b = new ConcurrentHashMap(16, 0.75f, 10);
                this.c = new ReferenceQueue();
                break;
        }
    }

    public y(IBinder iBinder) {
        this.a = 20;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (interfaceDescriptor != "android.os.IMessenger" && (interfaceDescriptor == null || !interfaceDescriptor.equals("android.os.IMessenger"))) {
            if (interfaceDescriptor != "com.google.android.gms.iid.IMessengerCompat" && (interfaceDescriptor == null || !interfaceDescriptor.equals("com.google.android.gms.iid.IMessengerCompat"))) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.c = new j6.f(iBinder);
            this.b = null;
            return;
        }
        this.b = new Messenger(iBinder);
        this.c = null;
    }

    public /* synthetic */ y(Object obj) {
        this.a = 28;
        this.c = obj;
        this.b = new ArrayList();
    }

    public y(m6.a aVar) {
        this.a = 13;
        this.b = aVar == null ? null : aVar.b;
    }

    @Override // le.f
    public void k() {
    }

    public y(k6.e eVar) {
        this.a = 29;
        this.b = new SparseIntArray();
        n6.l.h(eVar);
        this.c = eVar;
    }

    public y(ea.a[] aVarArr) {
        this.a = 12;
        this.b = aVarArr;
        this.c = new t7.u(7);
    }

    @Override // le.f
    public void h(boolean z10) {
    }

    public y(e2.b0 b0Var) {
        this.a = 19;
        this.b = b0Var;
        this.c = new e2.v();
    }

    public y(Handler handler, k2.j jVar) {
        this.a = 22;
        if (jVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.b = handler;
        this.c = jVar;
    }

    public y(Animator animator) {
        this.a = 4;
        this.b = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.c = animatorSet;
        animatorSet.play(animator);
    }

    public y(a3.f fVar) {
        this.a = 1;
        this.c = fVar;
    }

    public y(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
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
                        Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
                    }
                    componentName = null;
                }
                if (componentName == null) {
                    Log.i("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
                }
            }
            if (componentName != null && pendingIntent == null) {
                Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                intent2.setComponent(componentName);
                pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 29) {
                this.b = new u(context, str, bundle);
            } else if (i11 >= 28) {
                this.b = new t(context, str, bundle);
            } else if (i11 >= 22) {
                this.b = new s(context, str, bundle);
            } else {
                this.b = new r(context, str, bundle);
            }
            Looper myLooper = Looper.myLooper();
            K(new n(), new Handler(myLooper == null ? Looper.getMainLooper() : myLooper));
            ((r) this.b).a.setMediaButtonReceiver(pendingIntent);
            this.c = new k2.g0(context, this);
            return;
        }
        throw new IllegalArgumentException("tag must not be null or empty");
    }

    public y(androidx.emoji2.text.w wVar) {
        this.a = 6;
        this.b = wVar;
        this.c = new AtomicBoolean(false);
    }
}
