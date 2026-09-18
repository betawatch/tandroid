package bi;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.j81;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.sr0;
import org.telegram.ui.Components.ur0;
import org.telegram.ui.Components.zu0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class a extends j81 {
    public final /* synthetic */ int U = 0;
    public Object V;
    public final /* synthetic */ FrameLayout W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ur0 ur0Var, Context context, sr0 sr0Var) {
        super(context, null);
        this.W = ur0Var;
        this.V = sr0Var;
    }

    @Override // org.telegram.ui.Components.j81
    public final void A(int i10) {
        switch (this.U) {
            case 0:
                nr0 nr0Var = (nr0) this.W;
                String currentLang = nr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.V, currentLang)) {
                    this.V = currentLang;
                    nr0Var.G.L0();
                    break;
                }
                break;
            default:
                sr0 sr0Var = (sr0) this.V;
                ((ur0) this.W).n.b0.get(i10, -1);
                sr0Var.d.J0(1.0f);
                break;
        }
    }

    @Override // org.telegram.ui.Components.j81
    public boolean i(MotionEvent motionEvent) {
        switch (this.U) {
            case 0:
                return !((nr0) this.W).G.C1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.j81
    public final void w(boolean z10) {
        switch (this.U) {
            case 0:
                nr0 nr0Var = (nr0) this.W;
                String currentLang = nr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.V, currentLang)) {
                    this.V = currentLang;
                    nr0Var.G.L0();
                    break;
                }
                break;
            default:
                sr0 sr0Var = (sr0) this.V;
                sr0Var.d.J0(((ur0) this.W).n.getAnimatingIndicatorProgress());
                break;
        }
    }

    @Override // org.telegram.ui.Components.j81
    public void y(int i10) {
        switch (this.U) {
            case 0:
                nr0 nr0Var = (nr0) this.W;
                String currentLang = nr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.V, currentLang)) {
                    this.V = currentLang;
                    nr0Var.G.L0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.j81
    public void z(int i10, boolean z10) {
        switch (this.U) {
            case 1:
                sr0 sr0Var = (sr0) this.V;
                int i11 = ((ur0) this.W).n.b0.get(i10, -1);
                zu0 zu0Var = sr0Var.d;
                if (i11 > 0) {
                    zu0.t(zu0Var, zu0Var.i1(i11).a, z10);
                    break;
                } else {
                    zu0.t(zu0Var, 8, z10);
                    break;
                }
            default:
                super.z(i10, z10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(nr0 nr0Var, Context context) {
        super(context, null);
        this.W = nr0Var;
    }
}
