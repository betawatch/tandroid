package eh;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import androidx.recyclerview.widget.RecyclerView;
import f2.j0;
import fg.b1;
import fg.d2;
import fg.i2;
import fg.j1;
import fg.k2;
import fg.n0;
import fg.t2;
import fg.v0;
import h5.b0;
import hg.d1;
import hg.e1;
import hg.t0;
import hg.x0;
import j3.c0;
import j3.c2;
import j3.f0;
import j3.k0;
import java.util.Collections;
import lh.g2;
import lh.m0;
import lh.u1;
import mh.wa;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.xk;
import org.telegram.ui.ha1;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m(c0 c0Var, SurfaceTexture surfaceTexture) {
        this.a = 18;
        this.b = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        g6 g6Var;
        switch (this.a) {
            case 0:
                ((v) this.b).c.V2.N(true);
                return;
            case 1:
                ((u) this.b).a();
                return;
            case 2:
                RecyclerView recyclerView = (RecyclerView) this.b;
                if (recyclerView.getAdapter() != null) {
                    recyclerView.getAdapter().l();
                    return;
                }
                return;
            case 3:
                ((ef.b) ((c2.p) this.b).c).a(false);
                return;
            case 4:
                v0 v0Var = ((n0) this.b).c;
                v0Var.n.presentFragment(ha1.d0(v0Var.s1(), true));
                return;
            case 5:
                lj0 lj0Var = ((b1) this.b).y;
                lj0Var.getAnimatedDrawable().L(0, true, false);
                lj0Var.d();
                return;
            case 6:
                ((j1) this.b).b.y();
                return;
            case 7:
                i2 i2Var = (i2) this.b;
                int size = 1073741823 - (1073741823 % i2Var.U2.size());
                j0 j0Var = i2Var.V2;
                i2Var.i3 = size;
                j0Var.h1(size, (i2Var.getMeasuredHeight() - i2Var.getChildAt(0).getMeasuredHeight()) >> 1);
                i2Var.w1(null, false);
                return;
            case 8:
                ((k2) this.b).invalidate();
                return;
            case 9:
                ((t2) this.b).a();
                return;
            case 10:
                ((b0) this.b).getClass();
                return;
            case 11:
                CharSequence charSequence = (CharSequence) this.b;
                qc X = qc.X();
                if (X != null) {
                    X.Q(R.raw.forward, 30, charSequence).j();
                    return;
                }
                return;
            case 12:
                ((x0) this.b).run(null);
                return;
            case 13:
                ((xk) this.b).run(Collections.EMPTY_LIST);
                return;
            case 14:
                ((t0) this.b).run(null);
                return;
            case 15:
                e1 e1Var = ((d1) this.b).r;
                p2 p2Var = e1Var.n;
                i10 = ((h3) e1Var).currentAccount;
                g6Var = ((h3) e1Var).resourcesProvider;
                d2 d2Var = new d2(p2Var, i10, null, null, null, g6Var);
                d2Var.G0 = true;
                d2Var.Z = true;
                e1Var.n.showDialog(d2Var);
                return;
            case 16:
                ((h3) this.b).dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedMultiGiftsSelector, new Object[0]);
                AndroidUtilities.runOnUIThread(new ag.f(8), 220L);
                return;
            case 17:
                ((hh.f) this.b).a0.N(true);
                return;
            case 18:
                f0 f0Var = ((c0) this.b).a;
                f0Var.Z(null);
                f0Var.T(0, 0);
                return;
            case 19:
                try {
                    k0.c((c2) this.b);
                    return;
                } catch (j3.n e6) {
                    h5.a.p("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e6);
                    throw new RuntimeException(e6);
                }
            case 20:
                k3.f fVar = (k3.f) this.b;
                k3.a l10 = fVar.l();
                fVar.q(l10, 1028, new k3.c(l10, 28));
                fVar.f.d();
                return;
            case 21:
                kh.u uVar = (kh.u) this.b;
                uVar.f();
                uVar.e(true);
                return;
            case 22:
                try {
                    ((Bitmap) this.b).recycle();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 23:
                lf.p pVar = (lf.p) this.b;
                long j10 = pVar.b;
                if (j10 > 0) {
                    long j11 = j10 - 1;
                    pVar.b = j11;
                    pVar.a.d(j11);
                }
                if (pVar.b <= 0) {
                    pVar.c = false;
                }
                if (pVar.c) {
                    AndroidUtilities.runOnUIThread(pVar.d, 1000L);
                    return;
                }
                return;
            case 24:
                ((lg.c) this.b).f();
                return;
            case 25:
                lh.s sVar = (lh.s) this.b;
                sVar.e0.setTranslationX(sVar.d0.getAnimatedWidth() + AndroidUtilities.dp(28.0f));
                return;
            case 26:
                ((m0) this.b).onBackPressed();
                return;
            case 27:
                x51 x51Var = ((g2) this.b).V;
                if (x51Var != null) {
                    x51Var.N(false);
                    return;
                }
                return;
            case 28:
                ((u1) this.b).c();
                return;
            default:
                lh.c2 c2Var = (lh.c2) this.b;
                wa waVar = c2Var.e;
                if (waVar != null) {
                    waVar.d();
                    c2Var.invalidateSelf();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ m(k0 k0Var, c2 c2Var) {
        this.a = 19;
        this.b = c2Var;
    }

    public /* synthetic */ m(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
