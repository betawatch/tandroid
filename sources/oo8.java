// default package

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class oo8 implements o7, ln5, rd9, uj2, im4, lv8, ga6, fqb, cx9, mc2, w17, au9, qwc, r3d, a4d, h89, hbd {
    public final /* synthetic */ byte a;
    public Object b;

    public /* synthetic */ oo8(ai4 ai4Var) {
        this.a = (byte) 3;
        this.b = (fhd) ai4Var.b;
    }

    @Override // mc2
    public final boolean A0(long j) {
        return false;
    }

    @Override // w17
    public final boolean B(y17 y17Var, MenuItem menuItem) {
        return false;
    }

    @Override // a4d
    public final void C0(int i) {
        ot2 ot2Var;
        m5d m5dVar = (m5d) this.b;
        ReentrantLock reentrantLock = m5dVar.o;
        reentrantLock.lock();
        try {
            if (m5dVar.n || (ot2Var = m5dVar.m) == null || !ot2Var.c()) {
                m5dVar.n = false;
                m5dVar.b.C0(i);
                m5dVar.m = null;
                m5dVar.l = null;
            } else {
                m5dVar.n = true;
                m5dVar.e.onConnectionSuspended(i);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // mc2
    public final boolean D1(gn gnVar) {
        return false;
    }

    @Override // mc2
    public final boolean E(rc2 rc2Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // rd9
    public final void E1() {
        xg9 xg9Var = ((he9) this.b).T;
        if (xg9Var != null) {
            ch9 ch9Var = xg9Var.a;
            of9 of9Var = ch9Var.R3;
            if (of9Var != null) {
                of9Var.g();
            }
            ch9Var.p3.onContentChanged();
        }
    }

    @Override // au9
    public final boolean F1(int i) {
        return true;
    }

    @Override // au9
    public final vh6 G0() {
        return null;
    }

    @Override // uj2
    public final void G1(View view, float f, float f2) {
        byte b = this.a;
    }

    @Override // mc2
    public final void H(rc2 rc2Var, int i, float f, float f2, boolean z) {
        uob uobVar = (uob) this.b;
        zcb zcbVar = uobVar.E;
        if (uobVar.a()) {
            uobVar.y = 0;
            rc2Var.invalidate();
            gm.r(zcbVar);
            gm.d3(zcbVar, 5000L);
        }
    }

    @Override // rd9
    public final gkb H0() {
        xg9 xg9Var = ((he9) this.b).T;
        if (xg9Var == null) {
            return null;
        }
        return xg9Var.a.getTextSelectionHelper();
    }

    @Override // uj2
    public final void I(float f, float f2) {
        uj9 uj9Var;
        mc2 mc2Var;
        switch (this.a) {
            case 8:
                si9 si9Var = (si9) this.b;
                ri9 ri9Var = si9Var.b0;
                if (ri9Var != null && (mc2Var = (uj9Var = si9Var.a).F) != null) {
                    mc2Var.L0(uj9Var.E, ri9Var.c);
                    break;
                }
                break;
            default:
                Runnable runnable = ((g8c) this.b).j;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }

    @Override // mc2
    public final boolean J0(rc2 rc2Var, TLRPC.TodoItem todoItem, boolean z) {
        return false;
    }

    @Override // mc2
    public final boolean K() {
        return false;
    }

    @Override // r3d
    public final void K1() {
        t3d t3dVar = (t3d) this.b;
        Iterator it = ((kt) t3dVar.f.values()).iterator();
        while (it.hasNext()) {
            ((zz4) it.next()).c();
        }
        t3dVar.o.G = Collections.EMPTY_SET;
    }

    @Override // ln5
    public final void L(ImageReceiver imageReceiver) {
        pr8 pr8Var = ((sr8) this.b).h.H0;
        if (pr8Var != null) {
            pr8Var.d();
        }
    }

    @Override // mc2
    public final pc8 M1() {
        return null;
    }

    @Override // mc2
    public final boolean N() {
        return false;
    }

    @Override // mc2
    public final int O() {
        return 0;
    }

    @Override // rd9
    public final void O0(CharSequence charSequence) {
        xg9 xg9Var = ((he9) this.b).T;
        if (xg9Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        xg9Var.a.u4(charSequence.toString());
    }

    @Override // mc2
    public final boolean O1(long j) {
        return false;
    }

    @Override // mc2
    public final String P0(rc2 rc2Var) {
        return null;
    }

    @Override // mc2
    public final int Q(rc2 rc2Var) {
        return 0;
    }

    @Override // qwc
    public final String[] R0() {
        return ((WebViewProviderFactoryBoundaryInterface) this.b).getSupportedFeatures();
    }

    @Override // mc2
    public final hw1 S() {
        return null;
    }

    @Override // mc2
    public final boolean S0(rc2 rc2Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // w17
    public final void T1(y17 y17Var) {
        Toolbar toolbar = (Toolbar) this.b;
        b9 b9Var = toolbar.a.K;
        if (b9Var == null || !b9Var.f()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.a0.c).iterator();
            while (it.hasNext()) {
                ((aq4) it.next()).a.t();
            }
        }
    }

    @Override // mc2
    public final boolean U1(k47 k47Var) {
        return true;
    }

    @Override // ga6
    public final void W0(ja6 ja6Var, long j, long j2, int i) {
        switch (this.a) {
            case 14:
                break;
            default:
                dx7 dx7Var = (dx7) ja6Var;
                dx8 dx8Var = (dx8) this.b;
                if (dx8Var.a) {
                    ea6 a = dx8.a(dx7Var, j, j2);
                    kq kqVar = (kq) dx8Var.g;
                    kqVar.getClass();
                    kqVar.u(a, 8, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
                    break;
                }
                break;
        }
    }

    @Override // fqb
    public final void X(boolean z, float f) {
        ((o6b) this.b).a(Boolean.FALSE, Float.valueOf(f));
    }

    @Override // rd9
    public final fkb Y0() {
        return (he9) this.b;
    }

    @Override // mc2
    public final boolean Y1(rc2 rc2Var, TLRPC.User user) {
        return false;
    }

    @Override // mc2
    public final boolean Z() {
        return false;
    }

    @Override // mc2
    public final boolean Z1(rc2 rc2Var) {
        return false;
    }

    @Override // r3d
    public final void a() {
        t3d t3dVar = (t3d) this.b;
        ReentrantLock reentrantLock = t3dVar.a;
        reentrantLock.lock();
        try {
            t3dVar.m = new l3d(t3dVar, t3dVar.j, t3dVar.k, t3dVar.d, t3dVar.l, reentrantLock, t3dVar.c);
            t3dVar.m.K1();
            t3dVar.b.signalAll();
        } finally {
            t3dVar.a.unlock();
        }
    }

    @Override // mc2
    public final CharacterStyle a0(rc2 rc2Var) {
        return null;
    }

    @Override // uj2
    public final boolean a1(float f, float f2) {
        switch (this.a) {
            case 8:
                si9 si9Var = (si9) this.b;
                ri9 h0 = si9Var.h0(f, f2);
                if (h0 == null || h0.b) {
                    h0 = null;
                }
                si9Var.b0 = h0;
                return h0 != null;
            default:
                int L = gm.L(9.0f);
                RectF rectF = ((g8c) this.b).g;
                float f3 = -L;
                rectF.inset(f3, f3);
                boolean contains = rectF.contains(f, f2);
                float f4 = L;
                rectF.inset(f4, f4);
                return contains;
        }
    }

    @Override // h89
    public final void accept(Object obj, Object obj2) {
        r08 r08Var = (r08) this.b;
        w7d w7dVar = (w7d) obj;
        Bundle B = w7dVar.B();
        B.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        n7d n7dVar = new n7d((TaskCompletionSource) obj2, (byte) 0);
        try {
            xef xefVar = (xef) w7dVar.k();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            int i = bjd.a;
            obtain.writeInt(1);
            r08Var.writeToParcel(obtain, 0);
            obtain.writeInt(1);
            B.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(n7dVar);
            try {
                xefVar.a.transact(19, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException getting payment data", e);
            Bundle bundle = Bundle.EMPTY;
            n7dVar.R(Status.h, null);
        }
    }

    @Override // mc2
    public final boolean b() {
        return ((uob) this.b).a();
    }

    @Override // uj2
    public final boolean b2() {
        switch (this.a) {
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039 A[LOOP:0: B:8:0x0033->B:10:0x0039, LOOP_END] */
    @Override // hbd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c0(String str, long j, int i, tad tadVar, long j2, long j3) {
        int i2;
        Iterator it;
        pfd pfdVar = (pfd) this.b;
        try {
            i2 = i;
            try {
                pfdVar.a(new xed(new Status(i2, null, null, null), (byte) 2));
            } catch (IllegalStateException e) {
                e = e;
                ce6 ce6Var = k89.k;
                Log.e(ce6Var.a, ce6Var.d("Result already set when calling onRequestCompleted", new Object[0]), e);
                it = pfdVar.q.i.iterator();
                while (it.hasNext()) {
                }
            }
        } catch (IllegalStateException e2) {
            e = e2;
            i2 = i;
        }
        it = pfdVar.q.i.iterator();
        while (it.hasNext()) {
            ((j89) it.next()).h(str, j, i2, j2, j3);
            i2 = i;
        }
    }

    @Override // uj2
    public final boolean c1(View view, float f, float f2) {
        switch (this.a) {
            case 8:
                si9 si9Var = (si9) this.b;
                if (si9Var.b0 != null) {
                    ri9 h0 = si9Var.h0(f, f2);
                    ri9 ri9Var = si9Var.b0;
                    if (h0 == ri9Var) {
                        uj9 uj9Var = si9Var.a;
                        mc2 mc2Var = uj9Var.F;
                        if (mc2Var != null) {
                            mc2Var.m0(uj9Var.E, ri9Var.c);
                            break;
                        }
                    }
                }
                break;
        }
        return false;
    }

    @Override // qwc
    public final WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) oz0.a(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).createWebView(webView));
    }

    @Override // rd9
    public final void d(ne9 ne9Var) {
        xg9 xg9Var = ((he9) this.b).T;
        if (xg9Var != null) {
            ch9 ch9Var = xg9Var.a;
            ch9Var.i4(ne9Var);
            ch9Var.p3.j(ne9Var, true);
        }
    }

    @Override // mc2
    public final boolean d0() {
        return ((uob) this.b).a();
    }

    @Override // rd9
    public final ll0 d1() {
        return ((he9) this.b).a;
    }

    @Override // r3d
    public final jh0 e(jh0 jh0Var) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // au9
    public final vh6 e1() {
        return null;
    }

    @Override // mc2
    public final boolean f() {
        return true;
    }

    @Override // uj2
    public final boolean f0() {
        byte b = this.a;
        return true;
    }

    @Override // ga6
    public final ha6 f2(ja6 ja6Var, long j, long j2, IOException iOException, int i) {
        long j3;
        switch (this.a) {
            case 14:
                ((z63) this.b).a.y(iOException);
                return mx6.y;
            default:
                dx7 dx7Var = (dx7) ja6Var;
                ha6 ha6Var = mx6.y;
                dx8 dx8Var = (dx8) this.b;
                if (dx8Var.a) {
                    int i2 = iOException instanceof ki5 ? ((ki5) iOException).c : ConnectionsManager.DEFAULT_DATACENTER_ID;
                    boolean z = false;
                    if (i2 == 410) {
                        mx6 mx6Var = (mx6) dx8Var.j;
                        mx6Var.getClass();
                        mx6Var.e0(null);
                        dfb dfbVar = (dfb) dx8Var.i;
                        dfbVar.getClass();
                        dfbVar.f();
                        j3 = -9223372036854775807L;
                    } else {
                        j3 = 300000;
                        if (i2 == 429) {
                            List list = (List) dx7Var.d.d.get("Retry-After");
                            if (list != null) {
                                try {
                                    j3 = 1000 * Long.parseLong((String) list.get(0));
                                } catch (NumberFormatException unused) {
                                    ncd.f("SteeringManifestTracker", "Retry-After header string doesn't contain a parsable long");
                                }
                            }
                        } else {
                            k0b k0bVar = (k0b) dx8Var.h;
                            if (k0bVar != null) {
                                long j4 = k0bVar.b;
                                if (j4 != -9223372036854775807L) {
                                    j3 = j4;
                                }
                            }
                        }
                    }
                    byte b = 1;
                    if (j3 != -9223372036854775807L) {
                        dfb dfbVar2 = (dfb) dx8Var.i;
                        dfbVar2.getClass();
                        dfbVar2.a.postDelayed(new l0b(dx8Var, b), j3);
                    } else {
                        z = true;
                    }
                    ((dfb) dx8Var.d).e(new n28(this, iOException, z));
                    ea6 a = dx8.a(dx7Var, j, j2);
                    kq kqVar = (kq) dx8Var.g;
                    kqVar.getClass();
                    kqVar.s(a, 8, iOException, z);
                }
                return ha6Var;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // im4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(jm4 jm4Var, px2 px2Var) {
        f2 f2Var;
        int i;
        pq9 pq9Var;
        if (px2Var instanceof f2) {
            f2Var = (f2) px2Var;
            int i2 = f2Var.d;
            if ((i2 & TLObject.FLAG_31) != 0) {
                f2Var.d = i2 - TLObject.FLAG_31;
                Object obj = f2Var.b;
                i = f2Var.d;
                g7c g7cVar = g7c.a;
                if (i != 0) {
                    tue.b(obj);
                    pq9 pq9Var2 = new pq9(jm4Var, f2Var.getContext());
                    try {
                        f2Var.a = pq9Var2;
                        f2Var.d = 1;
                        try {
                            Object invoke = ((fs4) this.b).invoke(pq9Var2, f2Var);
                            ly2 ly2Var = ly2.a;
                            if (invoke != ly2Var) {
                                invoke = g7cVar;
                            }
                            if (invoke == ly2Var) {
                                return ly2Var;
                            }
                            pq9Var = pq9Var2;
                        } catch (Throwable th) {
                            th = th;
                            pq9Var = pq9Var2;
                            pq9Var.releaseIntercepted();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    if (i != 1) {
                        dq9.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pq9Var = f2Var.a;
                    try {
                        tue.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        pq9Var.releaseIntercepted();
                        throw th;
                    }
                }
                pq9Var.releaseIntercepted();
                return g7cVar;
            }
        }
        f2Var = new f2(this, px2Var);
        Object obj2 = f2Var.b;
        i = f2Var.d;
        g7c g7cVar2 = g7c.a;
        if (i != 0) {
        }
        pq9Var.releaseIntercepted();
        return g7cVar2;
    }

    @Override // ga6
    public final void g0(ja6 ja6Var, long j, long j2) {
        boolean z;
        switch (this.a) {
            case 14:
                z63 z63Var = (z63) this.b;
                synchronized (afd.b) {
                    z = afd.c;
                }
                if (z) {
                    z63Var.a();
                    return;
                } else {
                    z63Var.a.y(new IOException(new ConcurrentModificationException()));
                    return;
                }
            default:
                dx7 dx7Var = (dx7) ja6Var;
                if (((dx8) this.b).a) {
                    k0b k0bVar = (k0b) dx7Var.f;
                    k0bVar.getClass();
                    dx8 dx8Var = (dx8) this.b;
                    dx8Var.h = k0bVar;
                    ((dfb) dx8Var.d).e(new uva(this, k0bVar, (byte) 2));
                    dx8 dx8Var2 = (dx8) this.b;
                    Uri uri = (Uri) dx8Var2.e;
                    uri.getClass();
                    Uri uri2 = k0bVar.c;
                    byte b = 0;
                    if (uri2 != null) {
                        String uri3 = uri2.toString();
                        uri = (uri3 == null || lze.a(uri3)[0] == -1) ? lze.d(uri.toString(), uri2.toString()) : uri2;
                    }
                    dx8Var2.e = uri;
                    long j3 = k0bVar.b;
                    if (j3 == -9223372036854775807L) {
                        j3 = 300000;
                    }
                    dfb dfbVar = (dfb) ((dx8) this.b).i;
                    dfbVar.getClass();
                    dfbVar.a.postDelayed(new l0b((dx8) this.b, b), j3);
                    ea6 a = dx8.a(dx7Var, j, j2);
                    kq kqVar = (kq) ((dx8) this.b).g;
                    kqVar.getClass();
                    kqVar.p(a, 8);
                    return;
                }
                return;
        }
    }

    @Override // rd9
    public final boolean g1() {
        xg9 xg9Var = ((he9) this.b).T;
        return xg9Var != null && xg9Var.a.V4();
    }

    @Override // mv8
    public final Object get() {
        return new z7a((j8a) ((lv8) this.b).get());
    }

    @Override // cx9
    public final CharSequence getContentDescription() {
        return String.valueOf(Math.round((((nmb) this.b).a.getProgress() * r1.b) + 0.0f));
    }

    @Override // uj2
    public final long getLongPressDuration() {
        byte b = this.a;
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // qwc
    public final StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) oz0.a(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).getStatics());
    }

    @Override // o7
    public final void h2() {
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        RectF rectF = ProfileActivity.e7;
        vs9.d(new vh8(profileActivity, (byte) 3));
    }

    @Override // uj2
    public final void j(View view, float f, float f2) {
        byte b = this.a;
    }

    @Override // cx9
    public final int j0() {
        return ((nmb) this.b).b;
    }

    @Override // a4d
    public final void j1(Bundle bundle) {
        m5d m5dVar = (m5d) this.b;
        ReentrantLock reentrantLock = m5dVar.o;
        reentrantLock.lock();
        try {
            Bundle bundle2 = m5dVar.k;
            if (bundle2 == null) {
                m5dVar.k = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            m5dVar.l = ot2.f;
            m5dVar.j();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // rd9
    public final void j2() {
        xg9 xg9Var = ((he9) this.b).T;
        if (xg9Var != null) {
            xg9Var.a.W3();
        }
    }

    @Override // uj2
    public final void l(float f, float f2) {
        switch (this.a) {
            case 8:
                si9 si9Var = (si9) this.b;
                ri9 h0 = si9Var.h0(f, f2);
                ri9 ri9Var = si9Var.b0;
                if (h0 != ri9Var) {
                    ri9Var = null;
                }
                si9Var.k0(ri9Var);
                break;
        }
    }

    @Override // mc2
    public final boolean l0(rc2 rc2Var, boolean z) {
        return false;
    }

    @Override // mc2
    public final boolean l1() {
        return false;
    }

    @Override // mc2
    public final /* synthetic */ boolean m1(k47 k47Var) {
        return aq1.a(k47Var);
    }

    @Override // mc2
    public final boolean m2(int i) {
        return false;
    }

    @Override // cx9
    public final void n(boolean z, float f) {
        ((nmb) this.b).e.C0(Math.round((r0.b * f) + 0.0f), false);
    }

    @Override // mc2
    public final boolean n1(rc2 rc2Var, int i) {
        return i == ((uob) this.b).y;
    }

    @Override // mc2
    public final boolean n2(rc2 rc2Var, k47 k47Var) {
        return false;
    }

    @Override // au9
    public final void o(int i) {
        asc ascVar = (asc) this.b;
        if (ascVar.r || i != ascVar.K) {
            return;
        }
        ascVar.j0(ascVar.O.getText().toString().trim());
    }

    @Override // rd9
    public final void p() {
        he9 he9Var = (he9) this.b;
        xg9 xg9Var = he9Var.T;
        if (xg9Var != null) {
            xg9Var.a.T3(he9Var.a);
        }
    }

    @Override // mc2
    public final boolean p0(rc2 rc2Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // r3d
    public final boolean p1() {
        return true;
    }

    @Override // mc2
    public final hkb p2() {
        return null;
    }

    @Override // uj2
    public final void q0() {
        switch (this.a) {
            case 8:
                si9 si9Var = (si9) this.b;
                si9Var.k0(si9Var.b0);
                break;
            default:
                ((g8c) this.b).h.c(true);
                break;
        }
    }

    @Override // uj2
    public final void r(View view, float f, float f2) {
        byte b = this.a;
    }

    @Override // rd9
    public final void r1(int i, int i2) {
        of9 of9Var;
        xg9 xg9Var = ((he9) this.b).T;
        if (xg9Var == null || (of9Var = xg9Var.a.R3) == null) {
            return;
        }
        of9Var.f(i, i2);
    }

    public final int r2(int[] iArr, int i) {
        int[] iArr2;
        int[] iArr3;
        int i2;
        int i3;
        iu4 iu4Var = (iu4) this.b;
        if (iArr.length == 0) {
            i98.g();
            return 0;
        }
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            iArr2 = iArr;
        } else {
            int i4 = 1;
            while (i4 < length && iArr[i4] == 0) {
                i4++;
            }
            if (i4 == length) {
                iArr2 = new int[]{0};
            } else {
                int i5 = length - i4;
                int[] iArr4 = new int[i5];
                System.arraycopy(iArr, i4, iArr4, 0, i5);
                iArr2 = iArr4;
            }
        }
        int[] iArr5 = new int[i];
        int i6 = 0;
        boolean z = true;
        while (i6 < i) {
            int i7 = iu4Var.a[(iu4Var.g ? 1 : 0) + i6];
            if (i7 == 0) {
                i3 = iArr2[iArr2.length - 1];
            } else {
                if (i7 == 1) {
                    i2 = 0;
                    for (int i8 : iArr2) {
                        iu4 iu4Var2 = iu4.h;
                        i2 ^= i8;
                    }
                } else {
                    i2 = iArr2[0];
                    int length2 = iArr2.length;
                    for (int i9 = 1; i9 < length2; i9++) {
                        i2 = iu4Var.c(i7, i2) ^ iArr2[i9];
                    }
                }
                i3 = i2;
            }
            iArr5[(i - 1) - i6] = i3;
            if (i3 != 0) {
                z = false;
            }
            i6++;
            z = z;
        }
        if (z) {
            return 0;
        }
        ju4 ju4Var = new ju4(iu4Var, iArr5);
        ju4 a = iu4Var.a(i, 1);
        ju4 ju4Var2 = iu4Var.c;
        if (a.d() >= ju4Var.d()) {
            a = ju4Var;
            ju4Var = a;
        }
        ju4 ju4Var3 = iu4Var.d;
        ju4 ju4Var4 = a;
        ju4 ju4Var5 = ju4Var;
        ju4 ju4Var6 = ju4Var4;
        ju4 ju4Var7 = ju4Var2;
        while ((ju4Var6.d() << 1) >= i) {
            if (ju4Var6.e()) {
                throw new a79("r_{i-1} was zero");
            }
            int b = iu4Var.b(ju4Var6.c(ju4Var6.d()));
            ju4 ju4Var8 = ju4Var2;
            while (ju4Var5.d() >= ju4Var6.d() && !ju4Var5.e()) {
                int d = ju4Var5.d() - ju4Var6.d();
                int c = iu4Var.c(ju4Var5.c(ju4Var5.d()), b);
                ju4Var8 = ju4Var8.a(iu4Var.a(d, c));
                ju4Var5 = ju4Var5.a(ju4Var6.h(d, c));
            }
            ju4 a2 = ju4Var8.g(ju4Var3).a(ju4Var7);
            if (ju4Var5.d() >= ju4Var6.d()) {
                throw new IllegalStateException("Division algorithm failed to reduce polynomial? r: " + ju4Var5 + ", rLast: " + ju4Var6);
            }
            ju4 ju4Var9 = ju4Var5;
            ju4Var5 = ju4Var6;
            ju4Var6 = ju4Var9;
            ju4Var7 = ju4Var3;
            ju4Var3 = a2;
        }
        int c2 = ju4Var3.c(0);
        if (c2 == 0) {
            throw new a79("sigmaTilde(0) was zero");
        }
        int b2 = iu4Var.b(c2);
        ju4[] ju4VarArr = {ju4Var3.f(b2), ju4Var6.f(b2)};
        ju4 ju4Var10 = ju4VarArr[0];
        ju4 ju4Var11 = ju4VarArr[1];
        int d2 = ju4Var10.d();
        if (d2 == 1) {
            iArr3 = new int[]{ju4Var10.c(1)};
        } else {
            int[] iArr6 = new int[d2];
            int i10 = 0;
            for (int i11 = 1; i11 < iu4Var.e && i10 < d2; i11++) {
                if (ju4Var10.b(i11) == 0) {
                    iArr6[i10] = iu4Var.b(i11);
                    i10++;
                }
            }
            if (i10 != d2) {
                throw new a79("Error locator degree does not match number of roots");
            }
            iArr3 = iArr6;
        }
        int length3 = iArr3.length;
        int[] iArr7 = new int[length3];
        for (int i12 = 0; i12 < length3; i12++) {
            int b3 = iu4Var.b(iArr3[i12]);
            int i13 = 1;
            for (int i14 = 0; i14 < length3; i14++) {
                if (i12 != i14) {
                    int c3 = iu4Var.c(iArr3[i14], b3);
                    i13 = iu4Var.c(i13, (c3 & 1) == 0 ? c3 | 1 : c3 & (-2));
                }
            }
            int c4 = iu4Var.c(ju4Var11.b(b3), iu4Var.b(i13));
            iArr7[i12] = c4;
            if (iu4Var.g) {
                iArr7[i12] = iu4Var.c(c4, b3);
            }
        }
        for (int i15 = 0; i15 < iArr3.length; i15++) {
            int length4 = iArr.length - 1;
            int i16 = iArr3[i15];
            if (i16 == 0) {
                i98.g();
                return 0;
            }
            int i17 = length4 - iu4Var.b[i16];
            if (i17 < 0) {
                throw new a79("Bad error location");
            }
            iArr[i17] = iArr[i17] ^ iArr7[i15];
        }
        return iArr3.length;
    }

    public final void s2(ga gaVar) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        byte b = gaVar.a;
        if (b == 1) {
            recyclerView.y.U(recyclerView, gaVar.b, gaVar.d);
            return;
        }
        if (b == 2) {
            recyclerView.y.X(recyclerView, gaVar.b, gaVar.d);
        } else if (b == 4) {
            recyclerView.y.Z(recyclerView, gaVar.b, gaVar.d, gaVar.c);
        } else {
            if (b != 8) {
                return;
            }
            recyclerView.y.W(recyclerView, gaVar.b, gaVar.d);
        }
    }

    @Override // mc2
    public final String t(long j) {
        return null;
    }

    @Override // mc2
    public final boolean t0(rc2 rc2Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // mc2
    public final void t1(rc2 rc2Var, int i) {
        uob uobVar = (uob) this.b;
        zcb zcbVar = uobVar.E;
        if (uobVar.a()) {
            uobVar.y = 2;
            rc2Var.invalidate();
            gm.r(zcbVar);
            gm.d3(zcbVar, 5000L);
        }
    }

    public final void t2(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int T = recyclerView.e.T();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < T; i6++) {
            View S = recyclerView.e.S(i6);
            u69 U = RecyclerView.U(S);
            if (U != null && !U.r() && (i4 = U.c) >= i && i4 < i5) {
                U.a(2);
                if (obj == null) {
                    U.a(1024);
                } else if ((U.l & 1024) == 0) {
                    if (U.m == null) {
                        ArrayList arrayList = new ArrayList();
                        U.m = arrayList;
                        U.n = DesugarCollections.unmodifiableList(arrayList);
                    }
                    U.m.add(obj);
                }
                ((g69) S.getLayoutParams()).c = true;
            }
        }
        ki2 ki2Var = recyclerView.b;
        ArrayList arrayList2 = (ArrayList) ki2Var.e;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            u69 u69Var = (u69) arrayList2.get(size);
            if (u69Var != null && (i3 = u69Var.c) >= i && i3 < i5) {
                u69Var.a(2);
                ki2Var.g(size);
            }
        }
        recyclerView.z0 = true;
    }

    @Override // hbd
    public final void u0(String str, long j, long j2, long j3) {
        pfd pfdVar = (pfd) this.b;
        try {
            pfdVar.a(new xed(new Status(2103, null, null, null), (byte) 1));
        } catch (IllegalStateException e) {
            ce6 ce6Var = k89.k;
            Log.e(ce6Var.a, ce6Var.d("Result already set when calling onRequestReplaced", new Object[0]), e);
        }
        Iterator it = pfdVar.q.i.iterator();
        while (it.hasNext()) {
            ((j89) it.next()).h(str, j, 2103, j2, j3);
        }
    }

    public final void u2(int i, int i2) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int T = recyclerView.e.T();
        for (int i3 = 0; i3 < T; i3++) {
            u69 U = RecyclerView.U(recyclerView.e.S(i3));
            if (U != null && !U.r() && U.c >= i) {
                U.n(i2, false);
                recyclerView.v0.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.b.e;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            u69 u69Var = (u69) arrayList.get(i4);
            if (u69Var != null && u69Var.c >= i) {
                u69Var.n(i2, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.y0 = true;
    }

    @Override // a4d
    public final void v(ot2 ot2Var) {
        m5d m5dVar = (m5d) this.b;
        ReentrantLock reentrantLock = m5dVar.o;
        reentrantLock.lock();
        try {
            m5dVar.l = ot2Var;
            m5dVar.j();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void v2(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int T = recyclerView.e.T();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < T; i11++) {
            u69 U = RecyclerView.U(recyclerView.e.S(i11));
            if (U != null && (i9 = U.c) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    U.n(i2 - i, false);
                } else {
                    U.n(i5, false);
                }
                recyclerView.v0.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.b.e;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            u69 u69Var = (u69) arrayList.get(i12);
            if (u69Var != null && (i8 = u69Var.c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    u69Var.n(i2 - i, false);
                } else {
                    u69Var.n(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.y0 = true;
    }

    @Override // ga6
    public final void w(ja6 ja6Var, long j, long j2, boolean z) {
        switch (this.a) {
            case 14:
                break;
            default:
                dx7 dx7Var = (dx7) ja6Var;
                dx8 dx8Var = (dx8) this.b;
                if (dx8Var.a) {
                    ea6 a = dx8.a(dx7Var, j, j2);
                    kq kqVar = (kq) dx8Var.g;
                    kqVar.getClass();
                    kqVar.o(a, 8, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
                    break;
                }
                break;
        }
    }

    @Override // mc2
    public final void w1(k47 k47Var, String str, String str2, String str3, String str4, int i, int i2) {
        uob uobVar = (uob) this.b;
        zcb zcbVar = uobVar.E;
        if (uobVar.a()) {
            uobVar.y = 2;
            gm.r(zcbVar);
            gm.d3(zcbVar, 5000L);
        }
    }

    @Override // mc2
    public final boolean x0(rc2 rc2Var) {
        return false;
    }

    @Override // mc2
    public final void x1(rc2 rc2Var, TLRPC.WebPage webPage, String str, boolean z) {
        l11.u(rc2Var.getContext(), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x2(int i) {
        TLRPC.TL_exportedNoPaidMessagesToken c;
        my8 my8Var = ((iy8) this.b).e;
        if (my8Var == null || my8Var.d == i) {
            return;
        }
        byte b = i;
        b = i;
        if (my8Var.c.d && i == 2) {
            b = 1;
        }
        my8Var.d = b;
        my8Var.f().edit().putBoolean("qrNoPaidPermanent", my8Var.d == 2).apply();
        byte b2 = my8Var.d;
        if (b2 == 0) {
            if (my8Var.n != 0) {
                ConnectionsManager.getInstance(my8Var.a).cancelRequest(my8Var.n, true);
                my8Var.n = 0;
                return;
            }
            return;
        }
        if (b2 == 2 && (c = my8Var.c()) != null) {
            my8Var.f = c;
            my8Var.b.setFreeLink(my8Var.d(c));
        }
        my8Var.n(false, my8Var.d == 1);
    }

    @Override // uj2
    public final void y0() {
        switch (this.a) {
            case 8:
                si9 si9Var = (si9) this.b;
                si9Var.k0(null);
                si9Var.b0 = null;
                break;
            default:
                ((g8c) this.b).h.c(false);
                break;
        }
    }

    @Override // mc2
    public final boolean z1() {
        return false;
    }

    public /* synthetic */ oo8(byte b) {
        this.a = b;
    }

    public /* synthetic */ oo8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // mc2
    public final void C1() {
    }

    @Override // mc2
    public final void T0() {
    }

    @Override // fqb
    public final void V() {
    }

    @Override // fqb
    public final void V1() {
    }

    @Override // mc2
    public final void c() {
    }

    @Override // mc2
    public final void g2() {
    }

    @Override // mc2
    public final void i() {
    }

    @Override // mc2
    public final void o2() {
    }

    @Override // mc2
    public final void q() {
    }

    @Override // mc2
    public final void s0() {
    }

    @Override // cx9
    public final void x() {
    }

    @Override // o7
    public final void z0() {
    }

    @Override // mc2
    public final void A(rc2 rc2Var) {
    }

    @Override // mc2
    public final void F0(rc2 rc2Var) {
    }

    @Override // mc2
    public final void G(rc2 rc2Var) {
    }

    @Override // fqb
    public final void H1(float f) {
    }

    @Override // r3d
    public final void I0(int i) {
    }

    @Override // r3d
    public final void J(Bundle bundle) {
    }

    @Override // mc2
    public final void J1(rc2 rc2Var) {
    }

    @Override // fqb
    public final void K0(float f) {
    }

    @Override // mc2
    public final void L1(rc2 rc2Var) {
    }

    @Override // mc2
    public final void M0(rc2 rc2Var) {
    }

    @Override // mc2
    public final void P(rc2 rc2Var) {
    }

    @Override // mc2
    public final void Q0(rc2 rc2Var) {
    }

    @Override // mc2
    public final void Q1(rc2 rc2Var) {
    }

    @Override // mc2
    public final void R(rc2 rc2Var) {
    }

    @Override // fqb
    public final void S1(float f) {
    }

    @Override // mc2
    public final void T(k47 k47Var) {
    }

    @Override // mc2
    public final void U0(rc2 rc2Var) {
    }

    @Override // mc2
    public final void X0(rc2 rc2Var) {
    }

    @Override // mc2
    public final void Y(int i) {
    }

    @Override // mc2
    public final void Z0(rc2 rc2Var) {
    }

    @Override // au9
    public final void a2(ArrayList arrayList) {
    }

    @Override // fqb
    public final void c2(float f) {
    }

    @Override // mc2
    public final void e0(k47 k47Var) {
    }

    @Override // fqb
    public final void f1(long j) {
    }

    @Override // fqb
    public final void h(int i) {
    }

    @Override // mc2
    public final void h0(String str) {
    }

    @Override // fqb
    public final void h1(boolean z) {
    }

    @Override // mc2
    public final void i2(rc2 rc2Var) {
    }

    @Override // mc2
    public final void k(rc2 rc2Var) {
    }

    @Override // mc2
    public final void k0(rc2 rc2Var) {
    }

    @Override // mc2
    public final void k1(rc2 rc2Var) {
    }

    @Override // fqb
    public final void k2(long j) {
    }

    @Override // fqb
    public final void n0(float f) {
    }

    @Override // mc2
    public final void q1(h47 h47Var) {
    }

    @Override // mc2
    public final void q2(rc2 rc2Var) {
    }

    @Override // fqb
    public final void s(float f) {
    }

    @Override // fqb
    public final void v1(float f) {
    }

    @Override // fqb
    public final void w0(boolean z) {
    }

    @Override // fqb
    public final void y(float f) {
    }

    @Override // mc2
    public final void y1(rc2 rc2Var) {
    }

    private final void w2(float f, float f2) {
    }

    @Override // ln5
    public final void B0(int i, Drawable drawable) {
    }

    @Override // mc2
    public final void B1(rc2 rc2Var, ir0 ir0Var) {
    }

    @Override // fqb
    public final void C(long j, boolean z) {
    }

    @Override // mc2
    public final void D0(rc2 rc2Var, boolean z) {
    }

    @Override // fqb
    public final void E0(float f, int i) {
    }

    @Override // mc2
    public final void L0(rc2 rc2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // mc2
    public final void N1(String str, String str2) {
    }

    @Override // mc2
    public final void P1(rc2 rc2Var, n28 n28Var) {
    }

    @Override // fqb
    public final void R1(float f, int i) {
    }

    @Override // mc2
    public final void U(rc2 rc2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // mc2
    public final void X1(rc2 rc2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // fqb
    public final void e2(int i, long j) {
    }

    @Override // mc2
    public final void i0(rc2 rc2Var, int i) {
    }

    @Override // mc2
    public final void m0(rc2 rc2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // mc2
    public final void o1(rc2 rc2Var, boolean z) {
    }

    @Override // fqb
    public final void s1(float f, int i) {
    }

    @Override // mc2
    public final void v0(rc2 rc2Var, long j) {
    }

    private final void A2(View view, float f, float f2) {
    }

    private final void B2(View view, float f, float f2) {
    }

    private final void C2(View view, float f, float f2) {
    }

    private final void D2(View view, float f, float f2) {
    }

    private final void E2(View view, float f, float f2) {
    }

    private final void F2(View view, float f, float f2) {
    }

    @Override // r3d
    public final void A1(ot2 ot2Var, zo zoVar, boolean z) {
    }

    @Override // mc2
    public final void F(rc2 rc2Var, TLRPC.Document document, RectF rectF) {
    }

    @Override // mc2
    public final void I1(rc2 rc2Var, TLObject tLObject, boolean z) {
    }

    @Override // mc2
    public final void M(rc2 rc2Var, CharacterStyle characterStyle, boolean z) {
    }

    @Override // mc2
    public final void N0(rc2 rc2Var, float f, float f2) {
    }

    @Override // mc2
    public final void d2(rc2 rc2Var, float f, float f2) {
    }

    @Override // mc2
    public final void i1(rc2 rc2Var, float f, float f2) {
    }

    @Override // mc2
    public final void l2(rc2 rc2Var, boolean z, boolean z2) {
    }

    @Override // mc2
    public final void o0(rc2 rc2Var, int i, int i2) {
    }

    @Override // mc2
    public final void u(rc2 rc2Var, float f, float f2) {
    }

    @Override // mc2
    public final void u1(rc2 rc2Var, boolean z, boolean z2) {
    }

    private final void y2(ja6 ja6Var, long j, long j2, boolean z) {
    }

    private final void z2(ja6 ja6Var, long j, long j2, int i) {
    }

    @Override // mc2
    public final void W(rc2 rc2Var, TLRPC.User user, float f, float f2) {
    }

    @Override // ln5
    public final void b0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
    }

    @Override // mc2
    public final void m(rc2 rc2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    @Override // mc2
    public final void r0(rc2 rc2Var, float f, float f2, boolean z) {
    }

    @Override // mc2
    public final void z(rc2 rc2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // mc2
    public final void V0(rc2 rc2Var, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
    }

    @Override // mc2
    public final void b1(rc2 rc2Var, ArrayList arrayList, int i, int i2, int i3) {
    }

    @Override // mc2
    public final void W1(rc2 rc2Var, TLRPC.Chat chat, int i, float f, float f2, boolean z) {
    }
}
