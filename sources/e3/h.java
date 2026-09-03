package e3;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import androidx.recyclerview.widget.RecyclerView;
import c2.p;
import com.google.firebase.messaging.r;
import eg.c1;
import eg.e2;
import eg.j2;
import eg.k1;
import eg.l2;
import eg.n0;
import eg.u2;
import eg.v0;
import f2.i0;
import gg.d1;
import gg.e1;
import gg.t0;
import gg.x0;
import h5.b0;
import j3.c0;
import j3.c2;
import j3.f0;
import j3.k0;
import j3.n;
import java.util.Collections;
import jh.u;
import kh.g2;
import kh.m0;
import kh.s;
import kh.u1;
import kh.w3;
import lh.wa;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.vk;
import org.telegram.ui.Components.w51;
import org.telegram.ui.oa1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h(c0 c0Var, SurfaceTexture surfaceTexture) {
        this.a = 17;
        this.b = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        f6 f6Var;
        switch (this.a) {
            case 0:
                r rVar = (r) this.b;
                ((f3.h) ((g3.c) rVar.d)).f(new a1.c(rVar, 25));
                return;
            case 1:
                ((df.b) ((p) this.b).c).a(false);
                return;
            case 2:
                v0 v0Var = ((n0) this.b).c;
                v0Var.n.presentFragment(oa1.d0(v0Var.s1(), true));
                return;
            case 3:
                jj0 jj0Var = ((c1) this.b).y;
                jj0Var.getAnimatedDrawable().L(0, true, false);
                jj0Var.d();
                return;
            case 4:
                ((k1) this.b).b.y();
                return;
            case 5:
                j2 j2Var = (j2) this.b;
                int size = 1073741823 - (1073741823 % j2Var.U2.size());
                i0 i0Var = j2Var.V2;
                j2Var.i3 = size;
                i0Var.h1(size, (j2Var.getMeasuredHeight() - j2Var.getChildAt(0).getMeasuredHeight()) >> 1);
                j2Var.v1(null, false);
                return;
            case 6:
                ((l2) this.b).invalidate();
                return;
            case 7:
                ((u2) this.b).a();
                return;
            case 8:
                RecyclerView recyclerView = (RecyclerView) this.b;
                if (recyclerView.getAdapter() != null) {
                    recyclerView.getAdapter().l();
                    return;
                }
                return;
            case 9:
                CharSequence charSequence = (CharSequence) this.b;
                qc X = qc.X();
                if (X != null) {
                    X.Q(R.raw.forward, 30, charSequence).j();
                    return;
                }
                return;
            case 10:
                ((x0) this.b).run(null);
                return;
            case 11:
                ((vk) this.b).run(Collections.EMPTY_LIST);
                return;
            case 12:
                ((t0) this.b).run(null);
                return;
            case 13:
                e1 e1Var = ((d1) this.b).r;
                p2 p2Var = e1Var.n;
                i10 = ((g3) e1Var).currentAccount;
                f6Var = ((g3) e1Var).resourcesProvider;
                e2 e2Var = new e2(p2Var, i10, null, null, null, f6Var);
                e2Var.G0 = true;
                e2Var.Z = true;
                e1Var.n.showDialog(e2Var);
                return;
            case 14:
                ((g3) this.b).dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedMultiGiftsSelector, new Object[0]);
                AndroidUtilities.runOnUIThread(new cg.n0(6), 220L);
                return;
            case 15:
                ((gh.f) this.b).a0.N(true);
                return;
            case 16:
                ((b0) this.b).getClass();
                return;
            case 17:
                f0 f0Var = ((c0) this.b).a;
                f0Var.Z(null);
                f0Var.T(0, 0);
                return;
            case 18:
                try {
                    k0.b((c2) this.b);
                    return;
                } catch (n e) {
                    h5.a.p("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                    throw new RuntimeException(e);
                }
            case 19:
                u uVar = (u) this.b;
                uVar.f();
                uVar.e(true);
                return;
            case 20:
                k3.f fVar = (k3.f) this.b;
                k3.a k10 = fVar.k();
                fVar.q(k10, 1028, new k3.c(k10, 29));
                fVar.f.d();
                return;
            case 21:
                try {
                    ((Bitmap) this.b).recycle();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 22:
                kf.p pVar = (kf.p) this.b;
                long j10 = pVar.b;
                if (j10 > 0) {
                    long j11 = j10 - 1;
                    pVar.b = j11;
                    pVar.a.e(j11);
                }
                if (pVar.b <= 0) {
                    pVar.c = false;
                }
                if (pVar.c) {
                    AndroidUtilities.runOnUIThread(pVar.d, 1000L);
                    return;
                }
                return;
            case 23:
                ((kg.c) this.b).f();
                return;
            case 24:
                s sVar = (s) this.b;
                sVar.e0.setTranslationX(sVar.d0.getAnimatedWidth() + AndroidUtilities.dp(28.0f));
                return;
            case 25:
                ((m0) this.b).onBackPressed();
                return;
            case 26:
                w51 w51Var = ((g2) this.b).V;
                if (w51Var != null) {
                    w51Var.N(false);
                    return;
                }
                return;
            case 27:
                ((u1) this.b).c();
                return;
            case 28:
                kh.c2 c2Var = (kh.c2) this.b;
                wa waVar = c2Var.e;
                if (waVar != null) {
                    waVar.d();
                    c2Var.invalidateSelf();
                    return;
                }
                return;
            default:
                ((w3) this.b).o();
                return;
        }
    }

    public /* synthetic */ h(k0 k0Var, c2 c2Var) {
        this.a = 18;
        this.b = c2Var;
    }

    public /* synthetic */ h(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
