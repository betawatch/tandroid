package ei;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.vf;
import org.telegram.ui.Components.xq;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.zm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c3 extends ImageReceiver {
    public final /* synthetic */ int K1;
    public final /* synthetic */ Object L1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c3(Object obj, int i3) {
        super(null);
        this.K1 = i3;
        this.L1 = obj;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public void L0(int[] iArr) {
        th.e eVar;
        switch (this.K1) {
            case 2:
                super.L0(iArr);
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.L1;
                int[] iArr2 = q1Var.T0;
                iArr2[0] = iArr[0];
                iArr2[1] = iArr[1];
                int L = org.telegram.messenger.g0.L(6.0f);
                iArr2[3] = L;
                iArr2[2] = L;
                org.telegram.ui.Cells.w1 w1Var = q1Var.w2;
                if (w1Var != null && (eVar = w1Var.m) != null) {
                    eVar.b.L0(iArr2);
                    break;
                }
                break;
            default:
                super.L0(iArr);
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver, org.telegram.ui.Components.m5
    public void invalidate() {
        int i3 = this.K1;
        Object obj = this.L1;
        switch (i3) {
            case 3:
                View view = ((zm) obj).b;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 4:
                ((org.telegram.ui.Components.g5) obj).j();
                super.invalidate();
                break;
            case 5:
            default:
                super.invalidate();
                break;
            case 6:
                super.invalidate();
                org.telegram.ui.Wallet.b8 b8Var = ((org.telegram.ui.Wallet.a8) obj).d0;
                int i10 = org.telegram.ui.Wallet.b8.H1;
                b8Var.f0();
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver
    public boolean x0(Drawable drawable, String str, int i3, boolean z10, int i10) {
        Runnable runnable;
        int i11 = this.K1;
        Object obj = this.L1;
        switch (i11) {
            case 0:
                j4 j4Var = (j4) obj;
                boolean x02 = super.x0(drawable, str, i3, z10, i10);
                if (i3 == 1 && (runnable = j4Var.S0) != null) {
                    runnable.run();
                    j4Var.S0 = null;
                }
                return x02;
            case 1:
                if (drawable != null && i3 != 1) {
                    org.telegram.messenger.camera.q.l(((lg.b1) ((d4) obj).I).h.animate().alpha(1.0f).translationY(0.0f), xq.k, 250L);
                }
                return super.x0(drawable, str, i3, z10, i10);
            case 2:
            case 3:
            case 6:
            default:
                return super.x0(drawable, str, i3, z10, i10);
            case 4:
                org.telegram.ui.Components.g5 g5Var = (org.telegram.ui.Components.g5) obj;
                g5Var.j();
                boolean x03 = super.x0(drawable, str, i3, z10, i10);
                if (g5Var.m && J()) {
                    g5Var.m = false;
                    org.telegram.messenger.g0.h3(new vf(g5Var, 4));
                }
                return x03;
            case 5:
                boolean x04 = super.x0(drawable, str, i3, z10, i10);
                ((PhotoViewer) obj).p2();
                return x04;
            case 7:
                boolean x05 = super.x0(drawable, str, i3, z10, i10);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
                duration.addUpdateListener(new gi.j3(this, 22));
                duration.start();
                return x05;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c3(Object obj, View view, int i3) {
        super(view);
        this.K1 = i3;
        this.L1 = obj;
    }
}
