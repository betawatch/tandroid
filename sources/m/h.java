package m;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.e9;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.fp0;
import org.telegram.ui.Components.ir0;
import org.telegram.ui.Components.j91;
import org.telegram.ui.Components.l91;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.u6;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.hc1;
import v7.i8;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class h implements l.w, l.i, k1.f, fp0, ne.f, bh.h, j91, com.google.android.gms.common.api.internal.s, s4.d0, n5.b, v0.i, y2.g {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ h() {
        this.a = 21;
    }

    @Override // y2.g
    public void A(y2.i iVar, long j10, long j11) {
        boolean z10;
        l2.d dVar = (l2.d) this.b;
        synchronized (z2.b.b) {
            z10 = z2.b.c;
        }
        if (z10) {
            dVar.a();
        } else {
            dVar.a.y(new IOException(new ConcurrentModificationException()));
        }
    }

    @Override // s4.d0
    public void D(int i10, int i11) {
        ((s4.g0) this.b).p(i10, i11);
    }

    @Override // s4.d0
    public void O0(int i10, int i11) {
        ((s4.g0) this.b).t(i10, i11);
    }

    @Override // org.telegram.ui.Components.fp0
    public void X(float f7, boolean z10) {
        switch (this.a) {
            case 3:
                ng.h hVar = (ng.h) this.b;
                float f10 = hVar.b;
                float y3 = com.google.android.gms.internal.play_billing.k3.y(hVar.c, f10, f7, f10);
                hVar.d = y3;
                if (z10) {
                    u6 u6Var = hVar.e;
                    u6Var.getClass();
                    u6Var.c(null, y3);
                }
                hVar.invalidate();
                break;
            default:
                hc1 hc1Var = (hc1) ((org.telegram.ui.Cells.k0) this.b);
                int i10 = (int) (g6.q * 100.0f);
                int i11 = (int) (f7 * 100.0f);
                g6.q = f7;
                if (i10 != i11) {
                    ThemeActivity themeActivity = hc1Var.e.e;
                    wl0 wl0Var = (wl0) themeActivity.b.K(themeActivity.f0);
                    if (wl0Var != null) {
                        ((e9) wl0Var.a).setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (g6.q * 100.0f))));
                    }
                    g6.E(true);
                    break;
                }
                break;
        }
    }

    @Override // k1.f
    public Object a(td.p pVar, md.c cVar) {
        return ((k1.z) this.b).a(new n1.c(pVar, null, 0), cVar);
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 14:
                g8.e eVar = (g8.e) this.b;
                r7.z zVar = (r7.z) ((r7.k) obj).u();
                r7.f fVar = new r7.f(1, (TaskCompletionSource) obj2);
                Parcel N0 = zVar.N0();
                r7.d.c(N0, eVar);
                r7.d.d(N0, fVar);
                N0.writeString(null);
                zVar.R0(N0, 63);
                return;
            default:
                v8.j jVar = (v8.j) this.b;
                e8.b bVar = (e8.b) obj;
                Bundle G = bVar.G();
                G.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
                e8.a aVar = new e8.a(0, (TaskCompletionSource) obj2);
                try {
                    e8.i iVar = (e8.i) bVar.u();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i10 = e8.c.a;
                    obtain.writeInt(1);
                    jVar.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    G.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(aVar);
                    try {
                        iVar.a.transact(19, obtain, null, 1);
                        obtain.recycle();
                        return;
                    } catch (Throwable th2) {
                        obtain.recycle();
                        throw th2;
                    }
                } catch (RemoteException e) {
                    Log.e("WalletClientImpl", "RemoteException getting payment data", e);
                    Bundle bundle = Bundle.EMPTY;
                    aVar.O(Status.h, null);
                    return;
                }
        }
    }

    public boolean b(int i10) {
        d91 d91Var = ((l91) this.b).L;
        if (d91Var == null) {
            return false;
        }
        return d91Var.c(i10);
    }

    @Override // l.w
    public void d(l.k kVar, boolean z10) {
        if (kVar instanceof l.d0) {
            ((l.d0) kVar).z.k().c(false);
        }
        l.w wVar = ((i) this.b).e;
        if (wVar != null) {
            wVar.d(kVar, z10);
        }
    }

    public void e(float f7) {
        l91 l91Var = (l91) this.b;
        if (f7 == 1.0f) {
            View[] viewArr = l91Var.e;
            View[] viewArr2 = l91Var.e;
            if (viewArr[1] != null) {
                l91Var.F();
                l91Var.h.put(l91Var.f[1], viewArr2[1]);
                l91Var.removeView(viewArr2[1]);
                l91Var.E(viewArr2[0], 0.0f);
                viewArr2[1] = null;
            }
            l91Var.z(l91Var.b);
            return;
        }
        View[] viewArr3 = l91Var.e;
        View[] viewArr4 = l91Var.e;
        View view = viewArr3[1];
        if (view == null) {
            return;
        }
        if (l91Var.y) {
            l91Var.E(view, (1.0f - f7) * viewArr3[0].getMeasuredWidth());
            l91Var.E(viewArr4[0], (-r1.getMeasuredWidth()) * f7);
        } else {
            l91Var.E(view, (1.0f - f7) * (-viewArr3[0].getMeasuredWidth()));
            l91Var.E(viewArr4[0], r1.getMeasuredWidth() * f7);
        }
        l91Var.w(false);
    }

    public void f(p4.p pVar, p4.m mVar, Collection collection) {
        p4.e eVar = (p4.e) this.b;
        if (pVar != eVar.y || mVar == null) {
            if (pVar == eVar.e) {
                if (mVar != null) {
                    eVar.n(eVar.d, mVar);
                }
                eVar.d.n(collection);
                return;
            }
            return;
        }
        p4.u uVar = eVar.x.a;
        String d = mVar.d();
        p4.v vVar = new p4.v(uVar, d, eVar.b(uVar, d), false);
        vVar.i(mVar);
        if (eVar.d == vVar) {
            return;
        }
        eVar.h(eVar, vVar, eVar.y, 3, eVar.x, collection);
        eVar.x = null;
        eVar.y = null;
    }

    @Override // hd.a
    public Object get() {
        String packageName = ((Context) ((hd.a) this.b).get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // org.telegram.ui.Components.fp0
    public CharSequence getContentDescription() {
        switch (this.a) {
            case 3:
                ng.h hVar = (ng.h) this.b;
                float f7 = hVar.b;
                return String.valueOf(Math.round((hVar.a.getProgress() * (hVar.c - f7)) + f7));
            default:
                return " ";
        }
    }

    @Override // k1.f
    public ee.b getData() {
        return ((k1.z) this.b).c;
    }

    @Override // ne.f
    public /* synthetic */ boolean i() {
        return false;
    }

    @Override // ne.f
    public /* synthetic */ boolean j(float f7) {
        return false;
    }

    @Override // s4.d0
    public void j0(int i10, int i11) {
        ((s4.g0) this.b).s(i10, i11);
    }

    @Override // bh.h
    public void k(Canvas canvas) {
        ir0 ir0Var = (ir0) this.b;
        canvas.drawColor(ir0Var.getThemedColor(g6.d6));
        if (SharedConfig.chatBlurEnabled()) {
            ir0Var.O0.b(canvas, -2);
        }
    }

    @Override // org.telegram.ui.Components.fp0
    public /* synthetic */ int k0() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // l.i
    public void l(l.k kVar) {
        Toolbar toolbar = (Toolbar) this.b;
        i iVar = toolbar.a.J;
        if (iVar == null || !iVar.g()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.W.c).iterator();
            while (it.hasNext()) {
                ((androidx.fragment.app.a0) it.next()).a.t();
            }
        }
    }

    @Override // bh.h
    public void m0(bh.a aVar) {
        aVar.a(((ir0) this.b).getThemedColor(g6.d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override // s4.d0
    public void m1(int i10, int i11) {
        ((s4.g0) this.b).r(i10, i11, null);
    }

    @Override // l.i
    public boolean o(l.k kVar, MenuItem menuItem) {
        ((Toolbar) this.b).getClass();
        return false;
    }

    @Override // v0.i
    public void onError(Object obj) {
        w0.d e = (w0.d) obj;
        kotlin.jvm.internal.i.e(e, "e");
        be.m mVar = (be.m) this.b;
        if (mVar.w()) {
            mVar.resumeWith(i8.a(e));
        }
    }

    @Override // v0.i
    public void onResult(Object obj) {
        v0.c result = (v0.c) obj;
        kotlin.jvm.internal.i.e(result, "result");
        be.m mVar = (be.m) this.b;
        if (mVar.w()) {
            mVar.resumeWith(result);
        }
    }

    @Override // l.w
    public boolean q(l.k kVar) {
        i iVar = (i) this.b;
        if (kVar == iVar.c) {
            return false;
        }
        ((l.d0) kVar).A.getClass();
        iVar.getClass();
        l.w wVar = iVar.e;
        if (wVar != null) {
            return wVar.q(kVar);
        }
        return false;
    }

    @Override // ne.f
    public void t() {
        ((p9) this.b).a.invalidate();
    }

    @Override // y2.g
    public k4.d w(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        ((l2.d) this.b).a.y(iOException);
        return y2.l.e;
    }

    @Override // org.telegram.ui.Components.fp0
    public void z() {
        int i10 = this.a;
    }

    public /* synthetic */ h(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public h(TextView textView) {
        this.a = 13;
        this.b = new q1.g(textView);
    }

    public h(int i10, int i11) {
        this.a = 9;
        this.b = ApplicationLoader.applicationContext.getSharedPreferences(a1.g.l(i10, i11, "pip_layout_", "_"), 0);
    }

    private final void g() {
    }

    private final void n() {
    }

    @Override // ne.f
    public /* synthetic */ void c() {
    }

    @Override // ne.f
    public /* synthetic */ void m() {
    }

    @Override // ne.f
    public /* synthetic */ void h(boolean z10) {
    }

    @Override // y2.g
    public void X0(y2.i iVar, long j10, long j11, boolean z10) {
    }

    @Override // y2.g
    public /* synthetic */ void y(y2.i iVar, long j10, long j11, int i10) {
    }
}
