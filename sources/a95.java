// default package

import android.content.Context;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class a95 extends n95 {
    public final /* synthetic */ byte h = 0;
    public final /* synthetic */ q59 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a95(pb5 pb5Var, Context context) {
        super(context, true);
        this.n = pb5Var;
    }

    @Override // n95, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        byte b = this.h;
        q59 q59Var = this.n;
        switch (b) {
            case 0:
                super.onAttachedToWindow();
                g95 g95Var = ((b95) q59Var).N;
                if (g95Var.J1.getVisibility() == 0 && g95Var.F4) {
                    g95Var.E0(this, true);
                    break;
                }
                break;
            default:
                super.onAttachedToWindow();
                pb5 pb5Var = (pb5) q59Var;
                if (pb5Var.r && getParticipant() != null) {
                    pb5Var.E(this, true);
                    break;
                }
                break;
        }
    }

    @Override // n95, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        byte b = this.h;
        q59 q59Var = this.n;
        switch (b) {
            case 0:
                super.onDetachedFromWindow();
                g95 g95Var = ((b95) q59Var).N;
                g95 g95Var2 = g95.s5;
                g95Var.E0(this, false);
                break;
            default:
                super.onDetachedFromWindow();
                ((pb5) q59Var).E(this, false);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a95(b95 b95Var, LaunchActivity launchActivity) {
        super(launchActivity, false);
        this.n = b95Var;
    }
}
