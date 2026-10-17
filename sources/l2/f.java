package l2;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.b0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.internal.cast.a6;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.d9;
import org.telegram.ui.Cells.k0;
import org.telegram.ui.Components.a91;
import org.telegram.ui.Components.bp0;
import org.telegram.ui.Components.c91;
import org.telegram.ui.Components.dr0;
import org.telegram.ui.Components.m9;
import org.telegram.ui.Components.s6;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.u81;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.ra1;
import p4.u;
import p4.v;
import r7.z;
import v7.i8;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class f implements l.i, i, bp0, ne.f, bh.h, a91, r, n5.b, v0.i, y2.g {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ f(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public void A(p4.p pVar, p4.m mVar, Collection collection) {
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
        u uVar = eVar.x.a;
        String d = mVar.d();
        v vVar = new v(uVar, d, eVar.b(uVar, d), false);
        vVar.i(mVar);
        if (eVar.d == vVar) {
            return;
        }
        eVar.h(eVar, vVar, eVar.y, 3, eVar.x, collection);
        eVar.x = null;
        eVar.y = null;
    }

    @Override // ne.f
    public void D() {
        ((m9) this.b).a.invalidate();
    }

    @Override // bh.h
    public void H(bh.a aVar) {
        aVar.a(((dr0) this.b).getThemedColor(h6.d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override // org.telegram.ui.Components.bp0
    public void L(float f7, boolean z10) {
        switch (this.a) {
            case 4:
                ng.h hVar = (ng.h) this.b;
                float f10 = hVar.b;
                float x10 = a6.x(hVar.c, f10, f7, f10);
                hVar.d = x10;
                if (z10) {
                    s6 s6Var = hVar.e;
                    s6Var.getClass();
                    s6Var.c(null, x10);
                }
                hVar.invalidate();
                break;
            default:
                ra1 ra1Var = (ra1) ((k0) this.b);
                int i10 = (int) (h6.q * 100.0f);
                int i11 = (int) (f7 * 100.0f);
                h6.q = f7;
                if (i10 != i11) {
                    ThemeActivity themeActivity = ra1Var.e.e;
                    sl0 sl0Var = (sl0) themeActivity.b.K(themeActivity.f0);
                    if (sl0Var != null) {
                        ((d9) sl0Var.a).setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (h6.q * 100.0f))));
                    }
                    h6.E(true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.bp0
    public /* synthetic */ int Y() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // l2.i
    public long a(long j10) {
        return 0L;
    }

    @Override // com.google.android.gms.common.api.internal.r
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 15:
                g8.e eVar = (g8.e) this.b;
                z zVar = (z) ((r7.k) obj).u();
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

    @Override // l.i
    public void b(l.k kVar) {
        k0.b bVar = ((ActionMenuView) this.b).K;
        if (bVar != null) {
            bVar.b(kVar);
        }
    }

    @Override // l2.i
    public long e(long j10, long j11) {
        return 0L;
    }

    @Override // l2.i
    public long f(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // l2.i
    public m2.j g(long j10) {
        return (m2.j) this.b;
    }

    @Override // hd.a
    public Object get() {
        return new s5.i((Context) ((hd.a) this.b).get(), "com.google.android.datatransport.events", Integer.valueOf(s5.i.d).intValue());
    }

    @Override // org.telegram.ui.Components.bp0
    public CharSequence getContentDescription() {
        switch (this.a) {
            case 4:
                ng.h hVar = (ng.h) this.b;
                float f7 = hVar.b;
                return String.valueOf(Math.round((hVar.a.getProgress() * (hVar.c - f7)) + f7));
            default:
                return " ";
        }
    }

    @Override // ne.f
    public /* synthetic */ boolean i() {
        return false;
    }

    @Override // y2.g
    public k4.d j(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        ((d) this.b).a.y(iOException);
        return y2.l.e;
    }

    @Override // ne.f
    public /* synthetic */ boolean k(float f7) {
        return false;
    }

    @Override // y2.g
    public void n(y2.i iVar, long j10, long j11) {
        boolean z10;
        d dVar = (d) this.b;
        synchronized (z2.b.b) {
            z10 = z2.b.c;
        }
        if (z10) {
            dVar.a();
        } else {
            dVar.a.y(new IOException(new ConcurrentModificationException()));
        }
    }

    @Override // l2.i
    public long o(long j10, long j11) {
        return 0L;
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

    @Override // l.i
    public boolean p(l.k kVar, MenuItem menuItem) {
        m.l lVar = ((ActionMenuView) this.b).P;
        if (lVar == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((le.b) lVar).b).W.c).iterator();
        while (it.hasNext()) {
            if (((b0) it.next()).a.p()) {
                return true;
            }
        }
        return false;
    }

    public boolean q(int i10) {
        u81 u81Var = ((c91) this.b).L;
        if (u81Var == null) {
            return false;
        }
        return u81Var.c(i10);
    }

    @Override // bh.h
    public void r(Canvas canvas) {
        dr0 dr0Var = (dr0) this.b;
        canvas.drawColor(dr0Var.getThemedColor(h6.d6));
        if (SharedConfig.chatBlurEnabled()) {
            dr0Var.O0.b(canvas, -3);
        }
    }

    @Override // l2.i
    public boolean s() {
        return true;
    }

    public void t(Runnable runnable) {
        Runnable runnable2 = (Runnable) ((HashMap) this.b).remove(runnable);
        if (runnable2 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable2);
        }
    }

    @Override // l2.i
    public long u() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.bp0
    public void v() {
        int i10 = this.a;
    }

    @Override // l2.i
    public long w(long j10) {
        return 1L;
    }

    @Override // l2.i
    public long x(long j10, long j11) {
        return 1L;
    }

    public void y() {
        HashMap hashMap = (HashMap) this.b;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            AndroidUtilities.cancelRunOnUIThread((Runnable) ((Map.Entry) it.next()).getValue());
        }
        hashMap.clear();
    }

    public void z(float f7) {
        c91 c91Var = (c91) this.b;
        if (f7 == 1.0f) {
            View[] viewArr = c91Var.e;
            View[] viewArr2 = c91Var.e;
            if (viewArr[1] != null) {
                c91Var.F();
                c91Var.h.put(c91Var.f[1], viewArr2[1]);
                c91Var.removeView(viewArr2[1]);
                c91Var.E(viewArr2[0], 0.0f);
                viewArr2[1] = null;
            }
            c91Var.z(c91Var.b);
            return;
        }
        View[] viewArr3 = c91Var.e;
        View[] viewArr4 = c91Var.e;
        View view = viewArr3[1];
        if (view == null) {
            return;
        }
        if (c91Var.y) {
            c91Var.E(view, (1.0f - f7) * viewArr3[0].getMeasuredWidth());
            c91Var.E(viewArr4[0], (-r1.getMeasuredWidth()) * f7);
        } else {
            c91Var.E(view, (1.0f - f7) * (-viewArr3[0].getMeasuredWidth()));
            c91Var.E(viewArr4[0], r1.getMeasuredWidth() * f7);
        }
        c91Var.w(false);
    }

    public f(int i10) {
        this.a = i10;
        switch (i10) {
            case 23:
                break;
            default:
                this.b = new HashMap();
                break;
        }
    }

    public f(TextView textView) {
        this.a = 14;
        this.b = new q1.g(textView);
    }

    private final void B() {
    }

    private final void C() {
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

    @Override // l2.i
    public long d(long j10, long j11) {
        return j11;
    }

    @Override // y2.g
    public void I(y2.i iVar, long j10, long j11, boolean z10) {
    }

    @Override // y2.g
    public /* synthetic */ void l(y2.i iVar, long j10, long j11, int i10) {
    }
}
