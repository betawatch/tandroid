package hf;

import a3.i0;
import a3.k0;
import ad.j;
import android.content.Context;
import android.media.session.MediaController;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.PowerManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.a0;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import androidx.emoji2.text.v;
import androidx.fragment.app.j0;
import androidx.mediarouter.app.q;
import b2.b2;
import b2.u;
import bi.j4;
import bi.m0;
import bi.m1;
import bi.n0;
import bi.n1;
import c5.b0;
import c5.m;
import c6.e0;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.c1;
import com.google.android.gms.internal.cast.c2;
import com.google.android.gms.internal.cast.t;
import com.google.android.gms.internal.play_billing.a4;
import com.google.android.gms.internal.play_billing.b4;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.l3;
import com.google.android.gms.internal.play_billing.o3;
import com.google.android.gms.internal.play_billing.p3;
import com.google.android.gms.internal.play_billing.t3;
import com.google.android.gms.internal.play_billing.v3;
import com.google.android.gms.internal.play_billing.w3;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d6.h;
import e2.x;
import fe.g;
import fe.l;
import g2.o;
import g2.p;
import g6.n;
import g6.w;
import hh.i;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j4.c0;
import j4.g0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import jg.r0;
import k2.r;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.ef;
import org.telegram.messenger.f8;
import org.telegram.messenger.w0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.mg;
import org.telegram.ui.PhotoViewer;
import p4.y;
import p4.z;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class b implements h, wd.b, m1, b0, s, OnCompleteListener, com.google.android.gms.internal.clearcut.h, g, g2.g, n, fe.e, j4.b0, Continuation, ai {
    public static volatile b d;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ b(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    public static void J(b bVar, boolean z10, boolean z11) {
        synchronized (bVar) {
            boolean z12 = false;
            if (z10) {
                if (((PowerManager.WakeLock) bVar.c) == null) {
                    if (((Context) bVar.b).checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                        e2.a.l("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                        return;
                    }
                    PowerManager powerManager = (PowerManager) ((Context) bVar.b).getSystemService("power");
                    if (powerManager == null) {
                        e2.a.l("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                        return;
                    } else {
                        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                        bVar.c = newWakeLock;
                        newWakeLock.setReferenceCounted(false);
                    }
                }
            }
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) bVar.c;
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

    public static boolean O(Editable editable, KeyEvent keyEvent, boolean z10) {
        v[] vVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (vVarArr = (v[]) editable.getSpans(selectionStart, selectionEnd, v.class)) != null && vVarArr.length > 0) {
                for (v vVar : vVarArr) {
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

    private final void Q(i2.d dVar) {
        synchronized (dVar) {
        }
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new k0(this, dVar, 1));
        }
    }

    public static b e0() {
        b bVar;
        b bVar2 = d;
        if (bVar2 != null) {
            return bVar2;
        }
        synchronized (b.class) {
            try {
                bVar = d;
                if (bVar == null) {
                    bVar = new b(0);
                    d = bVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    @Override // d6.h
    public void A(d6.f fVar) {
        Log.d("CAST_SESSION", "onSessionEnding " + ((d6.c) fVar).a());
    }

    public void A0(g3 g3Var, p3 p3Var) {
        if (g3Var == null) {
            return;
        }
        try {
            w3 t10 = x3.t();
            t10.d(p3Var);
            t10.c();
            x3.n((x3) t10.b, g3Var);
            ((u) this.c).i((x3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // bi.m1
    public void B(Editable editable) {
        ((n0) this.c).i();
        ((m0) this.b).W();
    }

    public void B0(i3 i3Var, p3 p3Var) {
        try {
            w3 t10 = x3.t();
            t10.d(p3Var);
            t10.c();
            x3.o((x3) t10.b, i3Var);
            ((u) this.c).i((x3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // org.telegram.ui.Components.ai
    public void C(mg mgVar) {
        mgVar.run();
    }

    @Override // org.telegram.ui.Components.ai
    public /* synthetic */ boolean D() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    @Override // fe.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void E(float f7, int i10) {
        boolean z10;
        i iVar = (i) this.c;
        boolean z11 = true;
        if ((iVar.c() == 0.0f && iVar.s == 2) || iVar.s == 3) {
            iVar.s = 1;
            z10 = true;
        } else {
            z10 = false;
        }
        if (f7 == 1.0f) {
            int i11 = iVar.x;
            int i12 = iVar.w;
            if (i11 != i12) {
                iVar.x = i12;
                if (z11) {
                    ((Runnable) this.b).run();
                }
                iVar.a();
            }
        }
        z11 = z10;
        if (z11) {
        }
        iVar.a();
    }

    @Override // d6.h
    public void F(d6.f fVar, String str) {
        d6.c cVar = (d6.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarted " + cVar.a() + " " + str);
        o0(cVar);
    }

    @Override // d6.h
    public void G(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionStartSuspended " + ((d6.c) fVar).a() + " " + i10);
    }

    @Override // bi.m1
    public /* synthetic */ boolean H(boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Components.ai
    public void H0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        bi biVar = (bi) this.b;
        try {
            HashMap<Object, Object> selectedPhotos = biVar.a2.getSelectedPhotos();
            if (selectedPhotos.isEmpty()) {
                return;
            }
            ef efVar = (ef) selectedPhotos.values().iterator().next();
            String str = efVar.h;
            if (str == null) {
                str = efVar.I;
            }
            r0 r0Var = (r0) this.c;
            r0Var.d0(r0Var.f0(str, true));
            biVar.dismiss();
        } catch (Throwable th2) {
            f8.g(th2, true);
        }
    }

    @Override // bi.m1
    public /* synthetic */ boolean I(n1 n1Var) {
        return false;
    }

    public c5.d K() {
        if (((m) this.b) != null) {
            return new c5.d(this);
        }
        throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
    }

    public void L() {
        this.b = null;
        this.c = null;
    }

    public boolean M(int i10) {
        return ((b2.v) this.b).a.get(i10);
    }

    public void P(i2.d dVar) {
        switch (this.a) {
            case 2:
                Q(dVar);
                break;
            default:
                synchronized (dVar) {
                }
                Handler handler = (Handler) this.b;
                if (handler != null) {
                    handler.post(new r(this, dVar, 0));
                    break;
                }
                break;
        }
    }

    public void R(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.R(f7, true);
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

    public void S(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        j0 j0Var = (j0) this.b;
        androidx.fragment.app.v vVar = j0Var.w.b;
        androidx.fragment.app.s sVar = j0Var.y;
        if (sVar != null) {
            sVar.p().o.S(f7, true);
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

    public void T(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.T(f7, true);
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

    public void U(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.U(f7, true);
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

    public void V(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.V(f7, true);
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

    public void W(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.W(f7, true);
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

    public void X(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        j0 j0Var = (j0) this.b;
        androidx.fragment.app.v vVar = j0Var.w.b;
        androidx.fragment.app.s sVar = j0Var.y;
        if (sVar != null) {
            sVar.p().o.X(f7, true);
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

    public void Y(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.Y(f7, true);
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

    public void Z(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.Z(f7, true);
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

    @Override // fe.g
    public void a() {
        ((l) this.b).a();
    }

    public void a0(androidx.fragment.app.s f7, Bundle bundle, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.a0(f7, bundle, true);
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

    @Override // org.telegram.ui.Components.ai
    public boolean a1() {
        System.currentTimeMillis();
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        e0 e0Var = (e0) this.b;
        String str = (String) this.c;
        w wVar = (w) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        n6.l.i("Not connected to device", e0Var.F == 2);
        g6.f fVar = (g6.f) wVar.v();
        Parcel P0 = fVar.P0();
        P0.writeString(str);
        fVar.U0(P0, 5);
        synchronized (e0Var.s) {
            try {
                if (e0Var.p != null) {
                    taskCompletionSource.setException(n6.l.l(new Status(2001, null, null, null)));
                } else {
                    e0Var.p = taskCompletionSource;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // bi.m1
    public void b(n1 n1Var) {
        ((m0) this.b).b(n1Var);
    }

    public void b0(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.b0(f7, true);
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

    @Override // j4.b0
    public void c(x xVar) {
        j4.e0 e0Var = (j4.e0) this.c;
        SparseArray sparseArray = e0Var.h;
        a4.g gVar = (a4.g) this.b;
        if (xVar.A() == 0 && (xVar.A() & 128) != 0) {
            xVar.O(6);
            int a2 = xVar.a() / 4;
            for (int i10 = 0; i10 < a2; i10++) {
                xVar.k(0, 4, (byte[]) gVar.b);
                gVar.d0(0);
                int i11 = gVar.i(16);
                gVar.f0(3);
                if (i11 == 0) {
                    gVar.f0(13);
                } else {
                    int i12 = gVar.i(13);
                    if (sparseArray.get(i12) == null) {
                        sparseArray.put(i12, new c0(new cc.f(e0Var, i12)));
                        e0Var.n++;
                    }
                }
            }
            if (e0Var.a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    public void c0(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.c0(f7, true);
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

    @Override // g2.g
    public g2.h createDataSource() {
        return new o((Context) this.b, ((p) this.c).createDataSource());
    }

    public void d0(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.d0(f7, true);
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

    @Override // bi.m1
    public void e(n1 n1Var) {
        ((m0) this.b).j();
    }

    @Override // bi.m1
    public boolean f() {
        return ((m0) this.b).O();
    }

    public android.support.v4.media.session.m f0() {
        MediaController.TransportControls transportControls = ((android.support.v4.media.session.h) this.b).a.getTransportControls();
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 29 ? new android.support.v4.media.session.o(transportControls) : i10 >= 24 ? new android.support.v4.media.session.n(transportControls) : new android.support.v4.media.session.m(transportControls);
    }

    public boolean g0(CharSequence charSequence, int i10, int i11, androidx.emoji2.text.o oVar) {
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
            int i12 = i0.d.a;
            oVar.c = textPaint.hasGlyph(sb3) ? 2 : 1;
        }
        return oVar.c == 2;
    }

    @Override // bi.m1
    public void h(int i10, int i11) {
        ((m0) this.b).R(i10, i11);
    }

    public boolean h0() {
        return ((a) ((a0) this.b).d) != null;
    }

    @Override // bi.m1
    public void i(n1 n1Var, int i10, int i11) {
        k9 y3;
        m0 m0Var = (m0) this.b;
        if (((n0) this.c).d || i10 == i11 || (y3 = m0Var.y()) == null) {
            return;
        }
        if (y3.x() && y3.W == m0Var.J()) {
            return;
        }
        n1Var.post(new bi.k0(this, n1Var, i11, y3, m0Var, i10));
    }

    public void i0(q qVar) {
        if (qVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (!((Set) this.c).add(qVar)) {
            Log.w("MediaControllerCompat", "the callback has already been registered");
            return;
        }
        Handler handler = new Handler();
        qVar.f(handler);
        android.support.v4.media.session.h hVar = (android.support.v4.media.session.h) this.b;
        hVar.a.registerCallback(qVar.a, handler);
        synchronized (hVar.b) {
            if (hVar.e.a() != null) {
                android.support.v4.media.session.g gVar = new android.support.v4.media.session.g(qVar);
                hVar.d.put(qVar, gVar);
                qVar.c = gVar;
                try {
                    hVar.e.a().p(gVar);
                    qVar.e(13, null, null);
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                }
            } else {
                qVar.c = null;
                hVar.c.add(qVar);
            }
        }
    }

    @Override // d6.h
    public void j(d6.f fVar, String str) {
        Log.d("CAST_SESSION", "onSessionResuming " + ((d6.c) fVar).a() + " " + str);
    }

    @Override // d6.h
    public void k(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionStartFailed " + ((d6.c) fVar).a() + " " + i10);
    }

    public void k0(Object obj) {
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new i0(this, obj, SystemClock.elapsedRealtime(), 0));
        }
    }

    @Override // fe.g
    public boolean l() {
        return false;
    }

    public void l0(j4 j4Var) {
        d dVar;
        j4 j4Var2;
        int i10;
        Log.d("CAST_CONTROLLER", "set current media");
        a0 a0Var = (a0) this.b;
        j4 j4Var3 = (j4) a0Var.c;
        if (b5.d.u()) {
            if (j4Var3 == null && j4Var == null) {
                return;
            }
            if (j4Var3 != null) {
                ArrayList arrayList = j4Var3.a;
                if (j4Var != null && arrayList.size() == j4Var.a.size()) {
                    for (0; i10 < arrayList.size(); i10 + 1) {
                        f c10 = j4Var3.c(i10);
                        f c11 = j4Var.c(i10);
                        i10 = ((c10 == null && c11 == null) || (c10 != null && c11 != null && Objects.equals(c10.a, c11.a) && Objects.equals(c10.b, c11.b) && Objects.equals(c10.c, c11.c) && Objects.equals(c10.d, c11.d) && c10.e == c11.e && c10.f == c11.f)) ? i10 + 1 : 0;
                    }
                    return;
                }
            }
        }
        if (((a) a0Var.d) != null && j4Var != null) {
            a0Var.e(j4Var);
        }
        if (((a) a0Var.d) != null && (j4Var2 = (j4) a0Var.c) != null) {
            a0Var.w(j4Var2);
        }
        if (j4Var != null && j4Var.a.size() > 0 && !j4Var.c(0).a.startsWith("audio/") && (dVar = (d) a0Var.b) != null) {
            dVar.l(null, null);
        }
        a aVar = (a) a0Var.d;
        if (aVar != null && j4Var != null) {
            aVar.d = j4Var;
            aVar.g = 0;
            aVar.h = 0;
            aVar.p();
        }
        a0Var.c = j4Var;
    }

    @Override // fe.g
    public boolean m(float f7) {
        return false;
    }

    public void m0(m mVar) {
        this.b = mVar;
        if (mVar.a() != null) {
            mVar.a().getClass();
            String str = mVar.a().d;
            if (str != null) {
                this.c = str;
            }
        }
    }

    @Override // d6.h
    public void o(d6.f fVar, boolean z10) {
        Log.d("CAST_SESSION", "onSessionResumed " + ((d6.c) fVar).a() + " " + z10);
    }

    public void o0(d6.c cVar) {
        a0 a0Var = (a0) this.b;
        if (cVar == null) {
            return;
        }
        n6.l.d("Must be called from the main thread.");
        e6.h hVar = cVar.j;
        String a2 = cVar.a();
        if (TextUtils.isEmpty(a2) || hVar == null) {
            return;
        }
        a aVar = (a) a0Var.d;
        if (aVar == null || !TextUtils.equals(aVar.c.a(), a2)) {
            a0Var.A(new a(cVar, (d6.g) this.c, hVar));
            n6.l.d("Must be called from the main thread.");
            CastDevice castDevice = cVar.k;
            String str = castDevice != null ? castDevice.d : null;
            PhotoViewer v12 = PhotoViewer.v1();
            d.i();
            if (v12.E == null || v12.e0 == null || !v12.U1()) {
                return;
            }
            new cc(v12.e0, new th.b()).Q(R.raw.forward, 36, !TextUtils.isEmpty(str) ? cd.a0(null, null, 2131752102, str) : cd.L0(2131752103, null)).j();
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        boolean z10;
        d6.b bVar;
        com.google.android.gms.internal.cast.q qVar = (com.google.android.gms.internal.cast.q) this.b;
        d6.b bVar2 = (d6.b) this.c;
        y yVar = qVar.c;
        g6.b bVar3 = com.google.android.gms.internal.cast.q.j;
        if (task.isSuccessful()) {
            Bundle bundle = (Bundle) task.getResult();
            boolean z11 = bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
            bVar3.b("The module-to-client output switcher flag %s", true != z11 ? "not existed" : "existed");
            if (z11) {
                z10 = bundle.getBoolean("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
                Log.i(bVar3.a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.y)));
                boolean z12 = !z10 && bVar2.y;
                if (yVar != null || (bVar = qVar.d) == null) {
                }
                boolean z13 = bVar.w;
                boolean z14 = bVar.s;
                z zVar = new z();
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 30) {
                    zVar.b = z12;
                }
                if (i10 >= 30) {
                    zVar.d = z13;
                }
                if (i10 >= 30) {
                    zVar.c = z14;
                }
                y.i(new p4.a0(zVar));
                Log.i(bVar3.a, bVar3.d("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(qVar.i), Boolean.valueOf(z12), Boolean.valueOf(z13), Boolean.valueOf(z14)));
                if (z13) {
                    t tVar = qVar.f;
                    n6.l.g(tVar);
                    com.google.android.gms.internal.cast.p pVar = new com.google.android.gms.internal.cast.p(tVar);
                    y.b();
                    y.c().f = pVar;
                    c2.a(c1.b0);
                    return;
                }
                return;
            }
        }
        z10 = true;
        Log.i(bVar3.a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.y)));
        if (z10) {
        }
        if (yVar != null) {
        }
    }

    @Override // wd.b
    public Object p(wd.c cVar, ed.c cVar2) {
        Object p5 = ((u9.b) this.b).p(new bb.a0(cVar, (bb.c0) this.c), cVar2);
        return p5 == dd.a.a ? p5 : j.a;
    }

    public void p0(q qVar) {
        if (qVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (!((Set) this.c).remove(qVar)) {
            Log.w("MediaControllerCompat", "the callback has never been registered");
            return;
        }
        try {
            ((android.support.v4.media.session.h) this.b).b(qVar);
        } finally {
            qVar.f(null);
        }
    }

    @Override // d6.h
    public void q(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionEnded " + ((d6.c) fVar).a() + " " + i10);
        ((a0) this.b).A(null);
    }

    public void q0(ArrayList arrayList) {
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

    public void r0(b2 b2Var) {
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new a1.f(4, this, b2Var));
        }
    }

    @Override // g6.n
    public void s(String str, long j10, long j11, long j12) {
        n nVar = (n) this.b;
        if (nVar != null) {
            nVar.s(str, j10, j11, j12);
        }
    }

    public void s0(g3 g3Var) {
        try {
            A0(g3Var, (p3) this.b);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // d6.h
    public void t(d6.f fVar) {
        d6.c cVar = (d6.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarting " + cVar.a());
        o0(cVar);
    }

    public void t0(g3 g3Var, int i10, long j10) {
        try {
            o3 o3Var = (o3) ((p3) this.b).g();
            o3Var.c();
            p3.p((p3) o3Var.b, i10);
            p3 p3Var = (p3) o3Var.a();
            this.b = p3Var;
            if (j10 != 0) {
                o3 o3Var2 = (o3) p3Var.g();
                o3Var2.c();
                p3.r((p3) o3Var2.b, j10);
                p3Var = (p3) o3Var2.a();
            }
            A0(g3Var, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        j6.a aVar = (j6.a) this.b;
        Bundle bundle = (Bundle) this.c;
        aVar.getClass();
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        return (bundle2 == null || !bundle2.containsKey("google.messenger")) ? task : aVar.a(bundle).onSuccessTask(j6.n.a, j6.b.b);
    }

    @Override // d6.h
    public void u(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionResumeFailed " + ((d6.c) fVar).a() + " " + i10);
    }

    public void u0(g3 g3Var, long j10, boolean z10) {
        p3 p3Var;
        try {
            f3 f3Var = (f3) g3Var.g();
            t3 t3Var = (t3) g3Var.o().g();
            t3Var.c();
            v3.n((v3) t3Var.b, z10);
            f3Var.c();
            g3.r((g3) f3Var.b, (v3) t3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j10 == 0) {
                p3Var = (p3) this.b;
            } else {
                o3 o3Var = (o3) ((p3) this.b).g();
                o3Var.c();
                p3.r((p3) o3Var.b, j10);
                p3Var = (p3) o3Var.a();
            }
            A0(g3Var2, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // fe.e
    public void v(int i10, float f7, float f10, fe.f fVar) {
        i iVar = (i) this.c;
        iVar.c.a(f7);
        iVar.d.a(f7);
        iVar.b.a(f7);
        ((Runnable) this.b).run();
    }

    @Override // bi.m1
    public void w(CharSequence charSequence) {
        ((m0) this.b).F(charSequence);
    }

    public void w0(g3 g3Var, int i10, long j10, boolean z10) {
        p3 p3Var;
        try {
            o3 o3Var = (o3) ((p3) this.b).g();
            o3Var.c();
            p3.p((p3) o3Var.b, i10);
            this.b = (p3) o3Var.a();
            f3 f3Var = (f3) g3Var.g();
            t3 t3Var = (t3) g3Var.o().g();
            t3Var.c();
            v3.n((v3) t3Var.b, z10);
            f3Var.c();
            g3.r((g3) f3Var.b, (v3) t3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j10 == 0) {
                p3Var = (p3) this.b;
            } else {
                o3 o3Var2 = (o3) ((p3) this.b).g();
                o3Var2.c();
                p3.r((p3) o3Var2.b, j10);
                p3Var = (p3) o3Var2.a();
            }
            A0(g3Var2, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // bi.m1
    public /* synthetic */ boolean x(n1 n1Var) {
        return false;
    }

    public void x0(l3 l3Var) {
        try {
            w3 t10 = x3.t();
            t10.d((p3) this.b);
            t10.c();
            x3.p((x3) t10.b, l3Var);
            ((u) this.c).i((x3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // g6.n
    public void y(String str, long j10, int i10, Object obj, long j11, long j12) {
        ((g6.m) this.c).g = null;
        n nVar = (n) this.b;
        if (nVar != null) {
            nVar.y(str, j10, i10, obj, j11, j12);
        }
    }

    public void y0(a4 a4Var) {
        try {
            u uVar = (u) this.c;
            w3 t10 = x3.t();
            t10.d((p3) this.b);
            t10.c();
            x3.r((x3) t10.b, a4Var);
            uVar.i((x3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // fe.g
    public void z() {
        ((l) this.b).b((fe.m) this.c);
    }

    public void z0(b4 b4Var) {
        if (b4Var == null) {
            return;
        }
        try {
            w3 t10 = x3.t();
            t10.d((p3) this.b);
            t10.c();
            x3.s((x3) t10.b, b4Var);
            ((u) this.c).i((x3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.google.android.gms.internal.clearcut.h
    public Object zzp() {
        com.google.android.gms.internal.clearcut.d dVar = (com.google.android.gms.internal.clearcut.d) this.b;
        com.google.android.gms.internal.clearcut.b bVar = (com.google.android.gms.internal.clearcut.b) this.c;
        bVar.getClass();
        Map b10 = com.google.android.gms.internal.clearcut.d.e() ? ((Boolean) com.google.android.gms.internal.clearcut.d.c(new com.google.android.gms.internal.clearcut.e("gms:phenotype:phenotype_flag:debug_disable_caching", 0))).booleanValue() : false ? bVar.b() : bVar.e;
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

    public /* synthetic */ b(int i10, boolean z10) {
        this.a = i10;
    }

    public /* synthetic */ b(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public /* synthetic */ b(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public b(Context context, p3 p3Var) {
        this.a = 10;
        u uVar = new u(1);
        try {
            l5.s.b(context);
            uVar.c = l5.s.a().c(j5.a.e).a("PLAY_BILLING_LIBRARY", new i5.c("proto"), new t7.u(4));
        } catch (Throwable unused) {
            uVar.b = true;
        }
        this.c = uVar;
        this.b = p3Var;
    }

    public b(m6.a aVar) {
        this.a = 17;
        this.b = aVar == null ? null : aVar.b;
    }

    public b(j0 j0Var) {
        this.a = 5;
        this.b = j0Var;
        this.c = new CopyOnWriteArrayList();
    }

    public b(int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.b = ByteBuffer.allocateDirect(500);
                break;
            default:
                d6.a c10 = d6.a.c(w0.b);
                d2.c cVar = new d2.c(12);
                c10.getClass();
                n6.l.d("Must be called from the main thread.");
                d6.g gVar = c10.c;
                gVar.getClass();
                try {
                    d6.y yVar = gVar.a;
                    d6.j jVar = new d6.j(cVar);
                    Parcel P0 = yVar.P0();
                    com.google.android.gms.internal.cast.u.d(P0, jVar);
                    yVar.T0(P0, 4);
                } catch (RemoteException e) {
                    d6.g.c.a(e, "Unable to call %s on %s.", "addCastStateListener", d6.y.class.getSimpleName());
                }
                this.b = new a0(19);
                d6.g b10 = c10.b();
                this.c = b10;
                b10.a(this);
                o0(b10.c());
                break;
        }
    }

    @Override // org.telegram.ui.Components.ai
    public /* synthetic */ void N() {
    }

    @Override // org.telegram.ui.Components.ai
    public /* synthetic */ void j0() {
    }

    @Override // fe.g
    public void n() {
    }

    @Override // bi.m1
    public /* synthetic */ void r() {
    }

    @Override // fe.g
    public void g(boolean z10) {
    }

    @Override // org.telegram.ui.Components.ai
    public /* synthetic */ void n0(Object obj) {
    }

    @Override // org.telegram.ui.Components.ai
    public /* synthetic */ void v0(TLRPC.User user) {
    }

    public b(Context context) {
        this.a = 19;
        p pVar = new p();
        this.b = context.getApplicationContext();
        this.c = pVar;
    }

    public b(b2.v vVar, SparseArray sparseArray) {
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

    public b(ji.f fVar, hb.a aVar, androidx.emoji2.text.d dVar) {
        this.a = 4;
        this.b = fVar;
        this.c = dVar;
    }

    public b(Handler handler, a3.m0 m0Var) {
        this.a = 2;
        if (m0Var != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.b = handler;
        this.c = m0Var;
    }

    public b(Handler handler, k2.w wVar) {
        this.a = 29;
        if (wVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.b = handler;
        this.c = wVar;
    }

    public b(ArrayList arrayList, ArrayList arrayList2) {
        this.a = 21;
        int size = arrayList.size();
        this.b = new int[size];
        this.c = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            ((int[]) this.b)[i10] = ((Integer) arrayList.get(i10)).intValue();
            ((float[]) this.c)[i10] = ((Float) arrayList2.get(i10)).floatValue();
        }
    }

    public b(int i10, int i11) {
        this.a = 21;
        this.b = new int[]{i10, i11};
        this.c = new float[]{0.0f, 1.0f};
    }

    @Override // j4.b0
    public void d(e2.k0 k0Var, c3.q qVar, g0 g0Var) {
    }

    public b(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.a = 3;
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

    public b(int i10, int i11, int i12) {
        this.a = 21;
        this.b = new int[]{i10, i11, i12};
        this.c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public b(j4.e0 e0Var) {
        this.a = 26;
        this.c = e0Var;
        this.b = new a4.g(new byte[4], 4);
    }

    @Override // org.telegram.ui.Components.ai
    public /* synthetic */ void b1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
