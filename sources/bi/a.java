package bi;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.o91;
import org.telegram.ui.Components.qs0;
import org.telegram.ui.Components.vs0;
import org.telegram.ui.Components.ws0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class a extends o91 {
    public final /* synthetic */ int T = 0;
    public Object U;
    public final /* synthetic */ FrameLayout V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ws0 ws0Var, Context context, vs0 vs0Var) {
        super(context, null);
        this.V = ws0Var;
        this.U = vs0Var;
    }

    @Override // org.telegram.ui.Components.o91
    public boolean i(MotionEvent motionEvent) {
        switch (this.T) {
            case 0:
                return !((qs0) this.V).G.C1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.o91
    public final void w(boolean z10) {
        switch (this.T) {
            case 0:
                qs0 qs0Var = (qs0) this.V;
                String currentLang = qs0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    qs0Var.G.L0();
                    break;
                }
                break;
            default:
                vs0 vs0Var = (vs0) this.U;
                vs0Var.d.J0(((ws0) this.V).n.getAnimatingIndicatorProgress());
                break;
        }
    }

    @Override // org.telegram.ui.Components.o91
    public void x(int i10) {
        switch (this.T) {
            case 0:
                qs0 qs0Var = (qs0) this.V;
                String currentLang = qs0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    qs0Var.G.L0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.o91
    public void y(int i10, boolean z10) {
        switch (this.T) {
            case 1:
                vs0 vs0Var = (vs0) this.U;
                int i11 = ((ws0) this.V).n.b0.get(i10, -1);
                bw0 bw0Var = vs0Var.d;
                if (i11 > 0) {
                    bw0.t(bw0Var, bw0Var.i1(i11).a, z10);
                    break;
                } else {
                    bw0.t(bw0Var, 8, z10);
                    break;
                }
            default:
                super.y(i10, z10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.o91
    public final void z(int i10) {
        switch (this.T) {
            case 0:
                qs0 qs0Var = (qs0) this.V;
                String currentLang = qs0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    qs0Var.G.L0();
                    break;
                }
                break;
            default:
                vs0 vs0Var = (vs0) this.U;
                ((ws0) this.V).n.b0.get(i10, -1);
                vs0Var.d.J0(1.0f);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(qs0 qs0Var, Context context) {
        super(context, null);
        this.V = qs0Var;
    }
}
