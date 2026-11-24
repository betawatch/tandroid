// default package

import android.content.Context;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class b75 extends o75 {
    public final /* synthetic */ byte h = 0;
    public final /* synthetic */ n39 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b75(r95 r95Var, Context context) {
        super(context, true);
        this.n = r95Var;
    }

    @Override // o75, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        byte b = this.h;
        n39 n39Var = this.n;
        switch (b) {
            case 0:
                super.onAttachedToWindow();
                h75 h75Var = ((c75) n39Var).N;
                if (h75Var.J1.getVisibility() == 0 && h75Var.F4) {
                    h75Var.E0(this, true);
                    break;
                }
                break;
            default:
                super.onAttachedToWindow();
                r95 r95Var = (r95) n39Var;
                if (r95Var.r && getParticipant() != null) {
                    r95Var.E(this, true);
                    break;
                }
                break;
        }
    }

    @Override // o75, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        byte b = this.h;
        n39 n39Var = this.n;
        switch (b) {
            case 0:
                super.onDetachedFromWindow();
                h75 h75Var = ((c75) n39Var).N;
                h75 h75Var2 = h75.s5;
                h75Var.E0(this, false);
                break;
            default:
                super.onDetachedFromWindow();
                ((r95) n39Var).E(this, false);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b75(c75 c75Var, LaunchActivity launchActivity) {
        super(launchActivity, false);
        this.n = c75Var;
    }
}
