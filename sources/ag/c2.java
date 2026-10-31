package ag;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.z20;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.tf;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Wallet.g8;
import org.telegram.ui.Wallet.h8;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c2 extends ImageReceiver {
    public final /* synthetic */ int J1;
    public final /* synthetic */ Object K1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c2(int i10, View view, Object obj) {
        super(view);
        this.J1 = i10;
        this.K1 = obj;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public void L0(int[] iArr) {
        ih.h hVar;
        switch (this.J1) {
            case 1:
                super.L0(iArr);
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.K1;
                int[] iArr2 = q1Var.S0;
                iArr2[0] = iArr[0];
                iArr2[1] = iArr[1];
                int L = org.telegram.messenger.i0.L(6.0f);
                iArr2[3] = L;
                iArr2[2] = L;
                org.telegram.ui.Cells.w1 w1Var = q1Var.v2;
                if (w1Var != null && (hVar = w1Var.m) != null) {
                    hVar.b.L0(iArr2);
                    break;
                }
                break;
            default:
                super.L0(iArr);
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver, org.telegram.ui.Components.l5
    public void invalidate() {
        int i10 = this.J1;
        Object obj = this.K1;
        switch (i10) {
            case 2:
                View view = ((xn) obj).b;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 3:
                ((f5) obj).j();
                super.invalidate();
                break;
            case 4:
            default:
                super.invalidate();
                break;
            case 5:
                super.invalidate();
                h8 h8Var = ((g8) obj).d0;
                int i11 = h8.G1;
                h8Var.f0();
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver
    public boolean x0(Drawable drawable, String str, int i10, boolean z10, int i11) {
        Runnable runnable;
        int i12 = this.J1;
        Object obj = this.K1;
        switch (i12) {
            case 0:
                if (drawable != null && i10 != 1) {
                    z20.m(((f2) ((d2) obj).H).h.animate().alpha(1.0f).translationY(0.0f), gr.k, 250L);
                }
                return super.x0(drawable, str, i10, z10, i11);
            case 1:
            case 2:
            case 5:
            default:
                return super.x0(drawable, str, i10, z10, i11);
            case 3:
                f5 f5Var = (f5) obj;
                f5Var.j();
                boolean x02 = super.x0(drawable, str, i10, z10, i11);
                if (f5Var.m && J()) {
                    f5Var.m = false;
                    org.telegram.messenger.i0.g3(new tf(f5Var, 5));
                }
                return x02;
            case 4:
                boolean x03 = super.x0(drawable, str, i10, z10, i11);
                ((PhotoViewer) obj).p2();
                return x03;
            case 6:
                boolean x04 = super.x0(drawable, str, i10, z10, i11);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
                duration.addUpdateListener(new bg.k(this, 25));
                duration.start();
                return x04;
            case 7:
                th.z2 z2Var = (th.z2) obj;
                boolean x05 = super.x0(drawable, str, i10, z10, i11);
                if (i10 == 1 && (runnable = z2Var.R0) != null) {
                    runnable.run();
                    z2Var.R0 = null;
                }
                return x05;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c2(Object obj, int i10) {
        super(null);
        this.J1 = i10;
        this.K1 = obj;
    }
}
