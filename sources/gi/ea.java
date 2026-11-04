package gi;

import android.animation.ValueAnimator;
import org.telegram.messenger.cs;
import org.telegram.ui.cm0;
import org.telegram.ui.l71;
import org.telegram.ui.pc;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ea implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public boolean b = false;
    public final /* synthetic */ cs c;

    public /* synthetic */ ea(cs csVar, int i3) {
        this.a = i3;
        this.c = csVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                va vaVar = (va) this.c;
                vaVar.E2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                da daVar = vaVar.D2;
                if (daVar != null) {
                    daVar.invalidate();
                }
                if (!this.b && vaVar.E2 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            case 1:
                pc pcVar = (pc) this.c;
                pcVar.o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pcVar.n0.invalidate();
                if (!this.b && pcVar.o0 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            case 2:
                cm0 cm0Var = (cm0) this.c;
                cm0Var.Z = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cm0Var.Y.invalidate();
                if (!this.b && cm0Var.Z > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            default:
                l71 l71Var = (l71) this.c;
                l71Var.k2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l71Var.j2.invalidate();
                if (!this.b && l71Var.k2 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
        }
    }
}
