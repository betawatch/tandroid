// default package

import android.content.Context;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class d95 extends q95 {
    public final /* synthetic */ byte h = 0;
    public final /* synthetic */ c79 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d95(sb5 sb5Var, Context context) {
        super(context, true);
        this.n = sb5Var;
    }

    @Override // q95, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        byte b = this.h;
        c79 c79Var = this.n;
        switch (b) {
            case 0:
                super.onAttachedToWindow();
                j95 j95Var = ((e95) c79Var).N;
                if (j95Var.J1.getVisibility() == 0 && j95Var.F4) {
                    j95Var.F0(this, true);
                    break;
                }
                break;
            default:
                super.onAttachedToWindow();
                sb5 sb5Var = (sb5) c79Var;
                if (sb5Var.r && getParticipant() != null) {
                    sb5Var.E(this, true);
                    break;
                }
                break;
        }
    }

    @Override // q95, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        byte b = this.h;
        c79 c79Var = this.n;
        switch (b) {
            case 0:
                super.onDetachedFromWindow();
                j95 j95Var = ((e95) c79Var).N;
                j95 j95Var2 = j95.s5;
                j95Var.F0(this, false);
                break;
            default:
                super.onDetachedFromWindow();
                ((sb5) c79Var).E(this, false);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d95(e95 e95Var, LaunchActivity launchActivity) {
        super(launchActivity, false);
        this.n = e95Var;
    }
}
