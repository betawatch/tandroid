// default package

import android.graphics.RectF;
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
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class k09 implements hf9, cj2, mm4, tw8, la6, esb, ty9, rb2, d27, rv9, fzc, g6d, p6d, s99, ydd, z76, OnCompleteListener {
    public final /* synthetic */ byte a;
    public Object b;

    public /* synthetic */ k09(i09 i09Var) {
        this.a = (byte) 0;
        this.b = (vjd) i09Var.b;
    }

    @Override // rb2
    public final boolean A1(hm hmVar) {
        return false;
    }

    @Override // d27
    public final boolean B(f27 f27Var, MenuItem menuItem) {
        return false;
    }

    @Override // hf9
    public final void B1() {
        ki9 ki9Var = ((xf9) this.b).T;
        if (ki9Var != null) {
            pi9 pi9Var = ki9Var.a;
            ch9 ch9Var = pi9Var.R3;
            if (ch9Var != null) {
                ch9Var.g();
            }
            pi9Var.p3.onContentChanged();
        }
    }

    @Override // rv9
    public final boolean C1(int i) {
        return true;
    }

    @Override // rv9
    public final zh6 D0() {
        return null;
    }

    @Override // cj2
    public final void D1(View view, float f, float f2) {
        byte b = this.a;
    }

    @Override // rb2
    public final boolean E(wb2 wb2Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // hf9
    public final amb E0() {
        ki9 ki9Var = ((xf9) this.b).T;
        if (ki9Var == null) {
            return null;
        }
        return ki9Var.a.getTextSelectionHelper();
    }

    @Override // rb2
    public final boolean G0(wb2 wb2Var, TLRPC.TodoItem todoItem, boolean z) {
        return false;
    }

    @Override // rb2
    public final void H(wb2 wb2Var, int i, float f, float f2, boolean z) {
        sqb sqbVar = (sqb) this.b;
        s8b s8bVar = sqbVar.E;
        if (sqbVar.a()) {
            sqbVar.y = 0;
            wb2Var.invalidate();
            hl.r(s8bVar);
            hl.d3(s8bVar, 5000L);
        }
    }

    @Override // g6d
    public final void H1() {
        i6d i6dVar = (i6d) this.b;
        Iterator it = ((ks) i6dVar.f.values()).iterator();
        while (it.hasNext()) {
            ((d05) it.next()).c();
        }
        i6dVar.o.G = Collections.EMPTY_SET;
    }

    @Override // cj2
    public final void I(float f, float f2) {
        hl9 hl9Var;
        rb2 rb2Var;
        switch (this.a) {
            case 5:
                fk9 fk9Var = (fk9) this.b;
                ek9 ek9Var = fk9Var.b0;
                if (ek9Var != null && (rb2Var = (hl9Var = fk9Var.a).F) != null) {
                    rb2Var.I0(hl9Var.E, ek9Var.c);
                    break;
                }
                break;
            default:
                Runnable runnable = ((fac) this.b).j;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }

    @Override // rb2
    public final de8 J1() {
        return null;
    }

    @Override // rb2
    public final boolean K() {
        return false;
    }

    @Override // hf9
    public final void L0(CharSequence charSequence) {
        ki9 ki9Var = ((xf9) this.b).T;
        if (ki9Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        ki9Var.a.v4(charSequence.toString());
    }

    @Override // rb2
    public final boolean L1(long j) {
        return false;
    }

    @Override // rb2
    public final boolean M() {
        return false;
    }

    @Override // rb2
    public final String M0(wb2 wb2Var) {
        return null;
    }

    @Override // rb2
    public final int N() {
        return 0;
    }

    @Override // fzc
    public final String[] O0() {
        return ((WebViewProviderFactoryBoundaryInterface) this.b).getSupportedFeatures();
    }

    @Override // rb2
    public final int P(wb2 wb2Var) {
        return 0;
    }

    @Override // rb2
    public final boolean P0(wb2 wb2Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // d27
    public final void Q1(f27 f27Var) {
        Toolbar toolbar = (Toolbar) this.b;
        c9 c9Var = toolbar.a.K;
        if (c9Var == null || !c9Var.g()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.a0.c).iterator();
            while (it.hasNext()) {
                ((dq4) it.next()).a.t();
            }
        }
    }

    @Override // z76
    public final void R(Object obj) {
        y76 y76Var;
        rx rxVar = ((uqd) this.b).b;
        synchronized (rxVar) {
            rxVar.b = false;
            y76Var = ((a86) rxVar.c).b;
        }
        if (y76Var != null) {
            ((qa4) rxVar.d).c(y76Var, 2441);
        }
    }

    @Override // la6
    public final void R0(oa6 oa6Var, long j, long j2, int i) {
        switch (this.a) {
            case 11:
                break;
            default:
                jy7 jy7Var = (jy7) oa6Var;
                ny8 ny8Var = (ny8) this.b;
                if (ny8Var.a) {
                    ja6 a = ny8.a(jy7Var, j, j2);
                    lp lpVar = (lp) ny8Var.g;
                    lpVar.getClass();
                    lpVar.v(a, 8, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
                    break;
                }
                break;
        }
    }

    @Override // rb2
    public final boolean R1(r47 r47Var) {
        return true;
    }

    @Override // rb2
    public final iv1 S() {
        return null;
    }

    @Override // hf9
    public final zlb S0() {
        return (xf9) this.b;
    }

    @Override // cj2
    public final boolean T0(float f, float f2) {
        switch (this.a) {
            case 5:
                fk9 fk9Var = (fk9) this.b;
                ek9 h0 = fk9Var.h0(f, f2);
                if (h0 == null || h0.b) {
                    h0 = null;
                }
                fk9Var.b0 = h0;
                return h0 != null;
            default:
                int L = hl.L(9.0f);
                RectF rectF = ((fac) this.b).g;
                float f3 = -L;
                rectF.inset(f3, f3);
                boolean contains = rectF.contains(f, f2);
                float f4 = L;
                rectF.inset(f4, f4);
                return contains;
        }
    }

    @Override // rb2
    public final boolean V1(wb2 wb2Var, TLRPC.User user) {
        return false;
    }

    @Override // cj2
    public final boolean W0(View view, float f, float f2) {
        switch (this.a) {
            case 5:
                fk9 fk9Var = (fk9) this.b;
                if (fk9Var.b0 != null) {
                    ek9 h0 = fk9Var.h0(f, f2);
                    ek9 ek9Var = fk9Var.b0;
                    if (h0 == ek9Var) {
                        hl9 hl9Var = fk9Var.a;
                        rb2 rb2Var = hl9Var.F;
                        if (rb2Var != null) {
                            rb2Var.l0(hl9Var.E, ek9Var.c);
                            break;
                        }
                    }
                }
                break;
        }
        return false;
    }

    @Override // rb2
    public final boolean W1(wb2 wb2Var) {
        return false;
    }

    @Override // esb
    public final void X(boolean z, float f) {
        ((l8b) this.b).a(Boolean.FALSE, Float.valueOf(f));
    }

    @Override // hf9
    public final mk0 X0() {
        return ((xf9) this.b).a;
    }

    @Override // cj2
    public final boolean Y1() {
        switch (this.a) {
            case 5:
                return true;
            default:
                return false;
        }
    }

    @Override // rb2
    public final boolean Z() {
        return false;
    }

    @Override // rv9
    public final zh6 Z0() {
        return null;
    }

    @Override // g6d
    public final void a() {
        i6d i6dVar = (i6d) this.b;
        ReentrantLock reentrantLock = i6dVar.a;
        reentrantLock.lock();
        try {
            i6dVar.m = new a6d(i6dVar, i6dVar.j, i6dVar.k, i6dVar.d, i6dVar.l, reentrantLock, i6dVar.c);
            i6dVar.m.H1();
            i6dVar.b.signalAll();
        } finally {
            i6dVar.a.unlock();
        }
    }

    @Override // rb2
    public final CharacterStyle a0(wb2 wb2Var) {
        return null;
    }

    @Override // s99
    public final void accept(Object obj, Object obj2) {
        byte b = this.a;
        byte b2 = 0;
        Object obj3 = this.b;
        switch (b) {
            case 25:
                v18 v18Var = (v18) obj3;
                nad nadVar = (nad) obj;
                Bundle B = nadVar.B();
                B.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
                ead eadVar = new ead((TaskCompletionSource) obj2, b2);
                try {
                    mhf mhfVar = (mhf) nadVar.k();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i = rld.a;
                    obtain.writeInt(1);
                    v18Var.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    B.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(eadVar);
                    try {
                        mhfVar.a.transact(19, obtain, null, 1);
                        obtain.recycle();
                        return;
                    } catch (Throwable th) {
                        obtain.recycle();
                        throw th;
                    }
                } catch (RemoteException e) {
                    Log.e("WalletClientImpl", "RemoteException getting payment data", e);
                    Bundle bundle = Bundle.EMPTY;
                    eadVar.R(Status.h, null);
                    return;
                }
            default:
                q7f q7fVar = (q7f) ((hsd) obj).k();
                yod yodVar = new yod((TaskCompletionSource) obj2, (byte) 1);
                Parcel R = q7fVar.R();
                int i2 = ild.a;
                R.writeInt(1);
                ((nd6) obj3).writeToParcel(R, 0);
                ild.c(R, yodVar);
                R.writeString(null);
                q7fVar.V(R, 63);
                return;
        }
    }

    @Override // rb2
    public final boolean b() {
        return ((sqb) this.b).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039 A[LOOP:0: B:8:0x0033->B:10:0x0039, LOOP_END] */
    @Override // ydd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b0(String str, long j, int i, kdd kddVar, long j2, long j3) {
        int i2;
        Iterator it;
        fid fidVar = (fid) this.b;
        try {
            i2 = i;
            try {
                fidVar.a(new ohd(new Status(i2, null, null, null), (byte) 2));
            } catch (IllegalStateException e) {
                e = e;
                he6 he6Var = v99.k;
                Log.e(he6Var.a, he6Var.d("Result already set when calling onRequestCompleted", new Object[0]), e);
                it = fidVar.q.i.iterator();
                while (it.hasNext()) {
                }
            }
        } catch (IllegalStateException e2) {
            e = e2;
            i2 = i;
        }
        it = fidVar.q.i.iterator();
        while (it.hasNext()) {
            ((u99) it.next()).h(str, j, i2, j2, j3);
            i2 = i;
        }
    }

    @Override // g6d
    public final jg0 c(jg0 jg0Var) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // rb2
    public final boolean c0() {
        return ((sqb) this.b).a();
    }

    @Override // la6
    public final ma6 c2(oa6 oa6Var, long j, long j2, IOException iOException, int i) {
        long j3;
        switch (this.a) {
            case 11:
                ((f63) this.b).a.y(iOException);
                return rx6.y;
            default:
                jy7 jy7Var = (jy7) oa6Var;
                ma6 ma6Var = rx6.y;
                ny8 ny8Var = (ny8) this.b;
                if (ny8Var.a) {
                    int i2 = iOException instanceof ni5 ? ((ni5) iOException).c : ConnectionsManager.DEFAULT_DATACENTER_ID;
                    boolean z = false;
                    if (i2 == 410) {
                        rx6 rx6Var = (rx6) ny8Var.j;
                        rx6Var.getClass();
                        rx6Var.g0(null);
                        xgb xgbVar = (xgb) ny8Var.i;
                        xgbVar.getClass();
                        xgbVar.f();
                        j3 = -9223372036854775807L;
                    } else {
                        j3 = 300000;
                        if (i2 == 429) {
                            List list = (List) jy7Var.d.d.get("Retry-After");
                            if (list != null) {
                                try {
                                    j3 = 1000 * Long.parseLong((String) list.get(0));
                                } catch (NumberFormatException unused) {
                                    efd.f("SteeringManifestTracker", "Retry-After header string doesn't contain a parsable long");
                                }
                            }
                        } else {
                            j2b j2bVar = (j2b) ny8Var.h;
                            if (j2bVar != null) {
                                long j4 = j2bVar.b;
                                if (j4 != -9223372036854775807L) {
                                    j3 = j4;
                                }
                            }
                        }
                    }
                    byte b = 1;
                    if (j3 != -9223372036854775807L) {
                        xgb xgbVar2 = (xgb) ny8Var.i;
                        xgbVar2.getClass();
                        xgbVar2.a.postDelayed(new k2b(ny8Var, b), j3);
                    } else {
                        z = true;
                    }
                    ((xgb) ny8Var.d).e(new q38(this, iOException, z));
                    ja6 a = ny8.a(jy7Var, j, j2);
                    lp lpVar = (lp) ny8Var.g;
                    lpVar.getClass();
                    lpVar.s(a, 8, iOException, z);
                }
                return ma6Var;
        }
    }

    @Override // fzc
    public final WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) py0.a(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).createWebView(webView));
    }

    @Override // hf9
    public final boolean d1() {
        ki9 ki9Var = ((xf9) this.b).T;
        return ki9Var != null && ki9Var.a.W4();
    }

    @Override // hf9, cg9
    public final void e(dg9 dg9Var) {
        ki9 ki9Var = ((xf9) this.b).T;
        if (ki9Var != null) {
            pi9 pi9Var = ki9Var.a;
            pi9Var.j4(dg9Var);
            pi9Var.p3.j(dg9Var, true);
        }
    }

    @Override // cj2
    public final boolean e0() {
        byte b = this.a;
        return true;
    }

    @Override // la6
    public final void f(oa6 oa6Var, long j, long j2, boolean z) {
        switch (this.a) {
            case 11:
                break;
            default:
                jy7 jy7Var = (jy7) oa6Var;
                ny8 ny8Var = (ny8) this.b;
                if (ny8Var.a) {
                    ja6 a = ny8.a(jy7Var, j, j2);
                    lp lpVar = (lp) ny8Var.g;
                    lpVar.getClass();
                    lpVar.o(a, 8, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
                    break;
                }
                break;
        }
    }

    @Override // la6
    public final void f0(oa6 oa6Var, long j, long j2) {
        boolean z;
        switch (this.a) {
            case 11:
                f63 f63Var = (f63) this.b;
                synchronized (rhd.b) {
                    z = rhd.c;
                }
                if (z) {
                    f63Var.a();
                    return;
                } else {
                    f63Var.a.y(new IOException(new ConcurrentModificationException()));
                    return;
                }
            default:
                jy7 jy7Var = (jy7) oa6Var;
                if (((ny8) this.b).a) {
                    j2b j2bVar = (j2b) jy7Var.f;
                    j2bVar.getClass();
                    ny8 ny8Var = (ny8) this.b;
                    ny8Var.h = j2bVar;
                    ((xgb) ny8Var.d).e(new ida((Object) this, (Object) j2bVar, (byte) 27));
                    ny8 ny8Var2 = (ny8) this.b;
                    Uri uri = (Uri) ny8Var2.e;
                    uri.getClass();
                    Uri uri2 = j2bVar.c;
                    byte b = 0;
                    if (uri2 != null) {
                        String uri3 = uri2.toString();
                        uri = (uri3 == null || d2f.a(uri3)[0] == -1) ? d2f.d(uri.toString(), uri2.toString()) : uri2;
                    }
                    ny8Var2.e = uri;
                    long j3 = j2bVar.b;
                    if (j3 == -9223372036854775807L) {
                        j3 = 300000;
                    }
                    xgb xgbVar = (xgb) ((ny8) this.b).i;
                    xgbVar.getClass();
                    xgbVar.a.postDelayed(new k2b((ny8) this.b, b), j3);
                    ja6 a = ny8.a(jy7Var, j, j2);
                    lp lpVar = (lp) ((ny8) this.b).g;
                    lpVar.getClass();
                    lpVar.p(a, 8);
                    return;
                }
                return;
        }
    }

    @Override // hf9
    public final void f2() {
        ki9 ki9Var = ((xf9) this.b).T;
        if (ki9Var != null) {
            ki9Var.a.X3();
        }
    }

    @Override // p6d
    public final void g1(Bundle bundle) {
        b8d b8dVar = (b8d) this.b;
        ReentrantLock reentrantLock = b8dVar.o;
        reentrantLock.lock();
        try {
            Bundle bundle2 = b8dVar.k;
            if (bundle2 == null) {
                b8dVar.k = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            b8dVar.l = ws2.f;
            b8dVar.j();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // uw8
    public final Object get() {
        return new p9a((z9a) ((tw8) this.b).get());
    }

    @Override // ty9
    public final CharSequence getContentDescription() {
        return String.valueOf(Math.round((((lob) this.b).a.getProgress() * r1.b) + 0.0f));
    }

    @Override // cj2
    public final long getLongPressDuration() {
        byte b = this.a;
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // fzc
    public final StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) py0.a(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).getStatics());
    }

    @Override // rb2, al1
    public final boolean h() {
        return true;
    }

    @Override // ty9
    public final int i0() {
        return ((lob) this.b).b;
    }

    @Override // rb2
    public final boolean i1() {
        return false;
    }

    @Override // rb2
    public final boolean i2(int i) {
        return false;
    }

    @Override // cj2
    public final void j(View view, float f, float f2) {
        byte b = this.a;
    }

    @Override // rb2
    public final /* synthetic */ boolean j1(r47 r47Var) {
        return bp1.a(r47Var);
    }

    @Override // rb2
    public final boolean j2(wb2 wb2Var, r47 r47Var) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // mm4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(nm4 nm4Var, zw2 zw2Var) {
        g2 g2Var;
        int i;
        gs9 gs9Var;
        if (zw2Var instanceof g2) {
            g2Var = (g2) zw2Var;
            int i2 = g2Var.d;
            if ((i2 & TLObject.FLAG_31) != 0) {
                g2Var.d = i2 - TLObject.FLAG_31;
                Object obj = g2Var.b;
                i = g2Var.d;
                f9c f9cVar = f9c.a;
                if (i != 0) {
                    ixe.b(obj);
                    gs9 gs9Var2 = new gs9(nm4Var, g2Var.getContext());
                    try {
                        g2Var.a = gs9Var2;
                        g2Var.d = 1;
                        try {
                            Object invoke = ((is4) this.b).invoke(gs9Var2, g2Var);
                            vx2 vx2Var = vx2.a;
                            if (invoke != vx2Var) {
                                invoke = f9cVar;
                            }
                            if (invoke == vx2Var) {
                                return vx2Var;
                            }
                            gs9Var = gs9Var2;
                        } catch (Throwable th) {
                            th = th;
                            gs9Var = gs9Var2;
                            gs9Var.releaseIntercepted();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    if (i != 1) {
                        grb.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gs9Var = g2Var.a;
                    try {
                        ixe.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        gs9Var.releaseIntercepted();
                        throw th;
                    }
                }
                gs9Var.releaseIntercepted();
                return f9cVar;
            }
        }
        g2Var = new g2(this, zw2Var);
        Object obj2 = g2Var.b;
        i = g2Var.d;
        f9c f9cVar2 = f9c.a;
        if (i != 0) {
        }
        gs9Var.releaseIntercepted();
        return f9cVar2;
    }

    @Override // rb2
    public final boolean k0(wb2 wb2Var, boolean z) {
        return false;
    }

    @Override // rb2
    public final boolean k1(wb2 wb2Var, int i) {
        return i == ((sqb) this.b).y;
    }

    @Override // rb2
    public final bmb l2() {
        return null;
    }

    @Override // g6d
    public final boolean m1() {
        return true;
    }

    @Override // cj2
    public final void n(float f, float f2) {
        switch (this.a) {
            case 5:
                fk9 fk9Var = (fk9) this.b;
                ek9 h0 = fk9Var.h0(f, f2);
                ek9 ek9Var = fk9Var.b0;
                if (h0 != ek9Var) {
                    ek9Var = null;
                }
                fk9Var.k0(ek9Var);
                break;
        }
    }

    public final int n2(int[] iArr, int i) {
        int[] iArr2;
        int[] iArr3;
        int i2;
        int i3;
        lu4 lu4Var = (lu4) this.b;
        if (iArr.length == 0) {
            iy8.d();
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
            int i7 = lu4Var.a[(lu4Var.g ? 1 : 0) + i6];
            if (i7 == 0) {
                i3 = iArr2[iArr2.length - 1];
            } else {
                if (i7 == 1) {
                    i2 = 0;
                    for (int i8 : iArr2) {
                        lu4 lu4Var2 = lu4.h;
                        i2 ^= i8;
                    }
                } else {
                    i2 = iArr2[0];
                    int length2 = iArr2.length;
                    for (int i9 = 1; i9 < length2; i9++) {
                        i2 = lu4Var.c(i7, i2) ^ iArr2[i9];
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
        mu4 mu4Var = new mu4(lu4Var, iArr5);
        mu4 a = lu4Var.a(i, 1);
        mu4 mu4Var2 = lu4Var.c;
        if (a.d() >= mu4Var.d()) {
            a = mu4Var;
            mu4Var = a;
        }
        mu4 mu4Var3 = lu4Var.d;
        mu4 mu4Var4 = a;
        mu4 mu4Var5 = mu4Var;
        mu4 mu4Var6 = mu4Var4;
        mu4 mu4Var7 = mu4Var2;
        while ((mu4Var6.d() << 1) >= i) {
            if (mu4Var6.e()) {
                throw new l89("r_{i-1} was zero");
            }
            int b = lu4Var.b(mu4Var6.c(mu4Var6.d()));
            mu4 mu4Var8 = mu4Var2;
            while (mu4Var5.d() >= mu4Var6.d() && !mu4Var5.e()) {
                int d = mu4Var5.d() - mu4Var6.d();
                int c = lu4Var.c(mu4Var5.c(mu4Var5.d()), b);
                mu4Var8 = mu4Var8.a(lu4Var.a(d, c));
                mu4Var5 = mu4Var5.a(mu4Var6.h(d, c));
            }
            mu4 a2 = mu4Var8.g(mu4Var3).a(mu4Var7);
            if (mu4Var5.d() >= mu4Var6.d()) {
                throw new IllegalStateException("Division algorithm failed to reduce polynomial? r: " + mu4Var5 + ", rLast: " + mu4Var6);
            }
            mu4 mu4Var9 = mu4Var5;
            mu4Var5 = mu4Var6;
            mu4Var6 = mu4Var9;
            mu4Var7 = mu4Var3;
            mu4Var3 = a2;
        }
        int c2 = mu4Var3.c(0);
        if (c2 == 0) {
            throw new l89("sigmaTilde(0) was zero");
        }
        int b2 = lu4Var.b(c2);
        mu4[] mu4VarArr = {mu4Var3.f(b2), mu4Var6.f(b2)};
        mu4 mu4Var10 = mu4VarArr[0];
        mu4 mu4Var11 = mu4VarArr[1];
        int d2 = mu4Var10.d();
        if (d2 == 1) {
            iArr3 = new int[]{mu4Var10.c(1)};
        } else {
            int[] iArr6 = new int[d2];
            int i10 = 0;
            for (int i11 = 1; i11 < lu4Var.e && i10 < d2; i11++) {
                if (mu4Var10.b(i11) == 0) {
                    iArr6[i10] = lu4Var.b(i11);
                    i10++;
                }
            }
            if (i10 != d2) {
                throw new l89("Error locator degree does not match number of roots");
            }
            iArr3 = iArr6;
        }
        int length3 = iArr3.length;
        int[] iArr7 = new int[length3];
        for (int i12 = 0; i12 < length3; i12++) {
            int b3 = lu4Var.b(iArr3[i12]);
            int i13 = 1;
            for (int i14 = 0; i14 < length3; i14++) {
                if (i12 != i14) {
                    int c3 = lu4Var.c(iArr3[i14], b3);
                    i13 = lu4Var.c(i13, (c3 & 1) == 0 ? c3 | 1 : c3 & (-2));
                }
            }
            int c4 = lu4Var.c(mu4Var11.b(b3), lu4Var.b(i13));
            iArr7[i12] = c4;
            if (lu4Var.g) {
                iArr7[i12] = lu4Var.c(c4, b3);
            }
        }
        for (int i15 = 0; i15 < iArr3.length; i15++) {
            int length4 = iArr.length - 1;
            int i16 = iArr3[i15];
            if (i16 == 0) {
                iy8.d();
                return 0;
            }
            int i17 = length4 - lu4Var.b[i16];
            if (i17 < 0) {
                throw new l89("Bad error location");
            }
            iArr[i17] = iArr[i17] ^ iArr7[i15];
        }
        return iArr3.length;
    }

    @Override // ty9
    public final void o(boolean z, float f) {
        ((lob) this.b).e.C0(Math.round((r0.b * f) + 0.0f), false);
    }

    @Override // rb2
    public final boolean o0(wb2 wb2Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // hf9
    public final void o1(int i, int i2) {
        ch9 ch9Var;
        ki9 ki9Var = ((xf9) this.b).T;
        if (ki9Var == null || (ch9Var = ki9Var.a.R3) == null) {
            return;
        }
        ch9Var.f(i, i2);
    }

    public final void o2(ha haVar) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        byte b = haVar.a;
        if (b == 1) {
            recyclerView.y.U(recyclerView, haVar.b, haVar.d);
            return;
        }
        if (b == 2) {
            recyclerView.y.X(recyclerView, haVar.b, haVar.d);
        } else if (b == 4) {
            recyclerView.y.Z(recyclerView, haVar.b, haVar.d, haVar.c);
        } else {
            if (b != 8) {
                return;
            }
            recyclerView.y.W(recyclerView, haVar.b, haVar.d);
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final /* synthetic */ void onComplete(Task task) {
        ((CountDownLatch) this.b).countDown();
    }

    @Override // rv9
    public final void p(int i) {
        muc mucVar = (muc) this.b;
        if (mucVar.r || i != mucVar.K) {
            return;
        }
        mucVar.i0(mucVar.O.getText().toString().trim());
    }

    @Override // cj2
    public final void p0() {
        switch (this.a) {
            case 5:
                fk9 fk9Var = (fk9) this.b;
                fk9Var.k0(fk9Var.b0);
                break;
            default:
                ((fac) this.b).h.c(true);
                break;
        }
    }

    public final void p2(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int T = recyclerView.e.T();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < T; i6++) {
            View S = recyclerView.e.S(i6);
            f89 V = RecyclerView.V(S);
            if (V != null && !V.r() && (i4 = V.c) >= i && i4 < i5) {
                V.a(2);
                if (obj == null) {
                    V.a(1024);
                } else if ((V.l & 1024) == 0) {
                    if (V.m == null) {
                        ArrayList arrayList = new ArrayList();
                        V.m = arrayList;
                        V.n = DesugarCollections.unmodifiableList(arrayList);
                    }
                    V.m.add(obj);
                }
                ((r79) S.getLayoutParams()).c = true;
            }
        }
        oh2 oh2Var = recyclerView.b;
        ArrayList arrayList2 = (ArrayList) oh2Var.e;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            f89 f89Var = (f89) arrayList2.get(size);
            if (f89Var != null && (i3 = f89Var.c) >= i && i3 < i5) {
                f89Var.a(2);
                oh2Var.g(size);
            }
        }
        recyclerView.z0 = true;
    }

    @Override // hf9
    public final void q() {
        xf9 xf9Var = (xf9) this.b;
        ki9 ki9Var = xf9Var.T;
        if (ki9Var != null) {
            ki9Var.a.U3(xf9Var.a);
        }
    }

    @Override // rb2
    public final void q1(wb2 wb2Var, int i) {
        sqb sqbVar = (sqb) this.b;
        s8b s8bVar = sqbVar.E;
        if (sqbVar.a()) {
            sqbVar.y = 2;
            wb2Var.invalidate();
            hl.r(s8bVar);
            hl.d3(s8bVar, 5000L);
        }
    }

    public final void q2(int i, int i2) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int T = recyclerView.e.T();
        for (int i3 = 0; i3 < T; i3++) {
            f89 V = RecyclerView.V(recyclerView.e.S(i3));
            if (V != null && !V.r() && V.c >= i) {
                V.n(i2, false);
                recyclerView.v0.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.b.e;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            f89 f89Var = (f89) arrayList.get(i4);
            if (f89Var != null && f89Var.c >= i) {
                f89Var.n(i2, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.y0 = true;
    }

    public final void r2(int i, int i2) {
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
            f89 V = RecyclerView.V(recyclerView.e.S(i11));
            if (V != null && (i9 = V.c) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    V.n(i2 - i, false);
                } else {
                    V.n(i5, false);
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
            f89 f89Var = (f89) arrayList.get(i12);
            if (f89Var != null && (i8 = f89Var.c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    f89Var.n(i2 - i, false);
                } else {
                    f89Var.n(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.y0 = true;
    }

    @Override // cj2
    public final void s(View view, float f, float f2) {
        byte b = this.a;
    }

    @Override // rb2
    public final boolean s0(wb2 wb2Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // ydd
    public final void t0(String str, long j, long j2, long j3) {
        fid fidVar = (fid) this.b;
        try {
            fidVar.a(new ohd(new Status(2103, null, null, null), (byte) 1));
        } catch (IllegalStateException e) {
            he6 he6Var = v99.k;
            Log.e(he6Var.a, he6Var.d("Result already set when calling onRequestReplaced", new Object[0]), e);
        }
        Iterator it = fidVar.q.i.iterator();
        while (it.hasNext()) {
            ((u99) it.next()).h(str, j, 2103, j2, j3);
        }
    }

    @Override // rb2
    public final void t1(r47 r47Var, String str, String str2, String str3, String str4, int i, int i2) {
        sqb sqbVar = (sqb) this.b;
        s8b s8bVar = sqbVar.E;
        if (sqbVar.a()) {
            sqbVar.y = 2;
            hl.r(s8bVar);
            hl.d3(s8bVar, 5000L);
        }
    }

    @Override // rb2
    public final String u(long j) {
        return null;
    }

    @Override // rb2
    public final void u1(wb2 wb2Var, TLRPC.WebPage webPage, String str, boolean z) {
        m01.u(wb2Var.getContext(), str);
    }

    @Override // p6d
    public final void w(ws2 ws2Var) {
        b8d b8dVar = (b8d) this.b;
        ReentrantLock reentrantLock = b8dVar.o;
        reentrantLock.lock();
        try {
            b8dVar.l = ws2Var;
            b8dVar.j();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // rb2
    public final boolean w0(wb2 wb2Var) {
        return false;
    }

    @Override // rb2
    public final boolean w1() {
        return false;
    }

    @Override // cj2
    public final void x0() {
        switch (this.a) {
            case 5:
                fk9 fk9Var = (fk9) this.b;
                fk9Var.k0(null);
                fk9Var.b0 = null;
                break;
            default:
                ((fac) this.b).h.c(false);
                break;
        }
    }

    @Override // rb2
    public final boolean y0(long j) {
        return false;
    }

    @Override // p6d
    public final void z0(int i) {
        ws2 ws2Var;
        b8d b8dVar = (b8d) this.b;
        ReentrantLock reentrantLock = b8dVar.o;
        reentrantLock.lock();
        try {
            if (b8dVar.n || (ws2Var = b8dVar.m) == null || !ws2Var.c()) {
                b8dVar.n = false;
                b8dVar.b.z0(i);
                b8dVar.m = null;
                b8dVar.l = null;
            } else {
                b8dVar.n = true;
                b8dVar.e.onConnectionSuspended(i);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public /* synthetic */ k09(byte b) {
        this.a = b;
    }

    public /* synthetic */ k09(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // rb2
    public final void Q0() {
    }

    @Override // esb
    public final void S1() {
    }

    @Override // esb
    public final void V() {
    }

    @Override // rb2
    public final void d() {
    }

    @Override // rb2
    public final void d2() {
    }

    @Override // rb2
    public final void i() {
    }

    @Override // rb2
    public final void k2() {
    }

    @Override // rb2
    public final void r() {
    }

    @Override // rb2
    public final void r0() {
    }

    @Override // ty9
    public final void x() {
    }

    @Override // rb2
    public final void z1() {
    }

    @Override // rb2
    public final void A(wb2 wb2Var) {
    }

    @Override // rb2
    public final void C0(wb2 wb2Var) {
    }

    @Override // esb
    public final void E1(float f) {
    }

    @Override // g6d
    public final void F0(int i) {
    }

    @Override // rb2
    public final void G(wb2 wb2Var) {
    }

    @Override // rb2
    public final void G1(wb2 wb2Var) {
    }

    @Override // esb
    public final void H0(float f) {
    }

    @Override // rb2
    public final void I1(wb2 wb2Var) {
    }

    @Override // g6d
    public final void J(Bundle bundle) {
    }

    @Override // rb2
    public final void J0(wb2 wb2Var) {
    }

    @Override // rb2
    public final void N0(wb2 wb2Var) {
    }

    @Override // rb2
    public final void N1(wb2 wb2Var) {
    }

    @Override // rb2
    public final void O(wb2 wb2Var) {
    }

    @Override // esb
    public final void P1(float f) {
    }

    @Override // rb2
    public final void Q(wb2 wb2Var) {
    }

    @Override // rb2
    public final void T(r47 r47Var) {
    }

    @Override // rb2
    public final void U0(wb2 wb2Var) {
    }

    @Override // rv9
    public final void X1(ArrayList arrayList) {
    }

    @Override // rb2
    public final void Y(int i) {
    }

    @Override // rb2
    public final void Y0(wb2 wb2Var) {
    }

    @Override // esb
    public final void Z1(float f) {
    }

    @Override // rb2
    public final void a1(wb2 wb2Var) {
    }

    @Override // esb
    public final void b1(long j) {
    }

    @Override // rb2
    public final void d0(r47 r47Var) {
    }

    @Override // esb
    public final void e1(boolean z) {
    }

    @Override // rb2
    public final void e2(wb2 wb2Var) {
    }

    @Override // esb
    public final void g(int i) {
    }

    @Override // rb2
    public final void g0(String str) {
    }

    @Override // esb
    public final void g2(long j) {
    }

    @Override // rb2
    public final void h1(wb2 wb2Var) {
    }

    @Override // rb2
    public final void j0(wb2 wb2Var) {
    }

    @Override // rb2
    public final void l(wb2 wb2Var) {
    }

    @Override // esb
    public final void m0(float f) {
    }

    @Override // rb2
    public final void m2(wb2 wb2Var) {
    }

    @Override // rb2
    public final void n1(o47 o47Var) {
    }

    @Override // esb
    public final void s1(float f) {
    }

    @Override // esb
    public final void t(float f) {
    }

    @Override // esb
    public final void v0(boolean z) {
    }

    @Override // rb2
    public final void v1(wb2 wb2Var) {
    }

    @Override // esb
    public final void y(float f) {
    }

    private final void s2(float f, float f2) {
    }

    @Override // rb2
    public final void A0(wb2 wb2Var, boolean z) {
    }

    @Override // esb
    public final void B0(float f, int i) {
    }

    @Override // esb
    public final void C(long j, boolean z) {
    }

    @Override // rb2
    public final void I0(wb2 wb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // rb2
    public final void K1(String str, String str2) {
    }

    @Override // rb2
    public final void M1(wb2 wb2Var, q38 q38Var) {
    }

    @Override // esb
    public final void O1(float f, int i) {
    }

    @Override // rb2
    public final void U(wb2 wb2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // rb2
    public final void U1(wb2 wb2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // esb
    public final void b2(int i, long j) {
    }

    @Override // rb2
    public final void h0(wb2 wb2Var, int i) {
    }

    @Override // rb2
    public final void l0(wb2 wb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // rb2
    public final void l1(wb2 wb2Var, boolean z) {
    }

    @Override // esb
    public final void p1(float f, int i) {
    }

    @Override // rb2
    public final void u0(wb2 wb2Var, long j) {
    }

    @Override // rb2
    public final void y1(wb2 wb2Var, iq0 iq0Var) {
    }

    private final void A2(View view, float f, float f2) {
    }

    private final void v2(View view, float f, float f2) {
    }

    private final void w2(View view, float f, float f2) {
    }

    private final void x2(View view, float f, float f2) {
    }

    private final void y2(View view, float f, float f2) {
    }

    private final void z2(View view, float f, float f2) {
    }

    @Override // rb2
    public final void F(wb2 wb2Var, TLRPC.Document document, RectF rectF) {
    }

    @Override // rb2
    public final void F1(wb2 wb2Var, TLObject tLObject, boolean z) {
    }

    @Override // rb2
    public final void K0(wb2 wb2Var, float f, float f2) {
    }

    @Override // rb2
    public final void L(wb2 wb2Var, CharacterStyle characterStyle, boolean z) {
    }

    @Override // rb2
    public final void a2(wb2 wb2Var, float f, float f2) {
    }

    @Override // rb2
    public final void f1(wb2 wb2Var, float f, float f2) {
    }

    @Override // rb2
    public final void h2(wb2 wb2Var, boolean z, boolean z2) {
    }

    @Override // rb2
    public final void n0(wb2 wb2Var, int i, int i2) {
    }

    @Override // rb2
    public final void r1(wb2 wb2Var, boolean z, boolean z2) {
    }

    @Override // rb2
    public final void v(wb2 wb2Var, float f, float f2) {
    }

    @Override // g6d
    public final void x1(ws2 ws2Var, zn znVar, boolean z) {
    }

    private final void t2(oa6 oa6Var, long j, long j2, boolean z) {
    }

    private final void u2(oa6 oa6Var, long j, long j2, int i) {
    }

    @Override // rb2
    public final void W(wb2 wb2Var, TLRPC.User user, float f, float f2) {
    }

    @Override // rb2
    public final void m(wb2 wb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    @Override // rb2
    public final void q0(wb2 wb2Var, float f, float f2, boolean z) {
    }

    @Override // rb2
    public final void z(wb2 wb2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // rb2
    public final void V0(wb2 wb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
    }

    @Override // rb2
    public final void c1(wb2 wb2Var, ArrayList arrayList, int i, int i2, int i3) {
    }

    @Override // rb2
    public final void T1(wb2 wb2Var, TLRPC.Chat chat, int i, float f, float f2, boolean z) {
    }
}
