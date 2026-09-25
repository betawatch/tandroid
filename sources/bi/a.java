package bi;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ds0;
import org.telegram.ui.Components.es0;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.w81;
import org.telegram.ui.Components.xr0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class a extends w81 {
    public final /* synthetic */ int T = 1;
    public Object U;
    public final /* synthetic */ FrameLayout V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(es0 es0Var, Context context, ds0 ds0Var) {
        super(context, null);
        this.V = es0Var;
        this.U = ds0Var;
    }

    @Override // org.telegram.ui.Components.w81
    public boolean i(MotionEvent motionEvent) {
        switch (this.T) {
            case 0:
                return !((xr0) this.V).G.C1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.w81
    public final void w(boolean z10) {
        switch (this.T) {
            case 0:
                xr0 xr0Var = (xr0) this.V;
                String currentLang = xr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    xr0Var.G.L0();
                    break;
                }
                break;
            default:
                ds0 ds0Var = (ds0) this.U;
                ds0Var.d.J0(((es0) this.V).n.getAnimatingIndicatorProgress());
                break;
        }
    }

    @Override // org.telegram.ui.Components.w81
    public void x(int i10) {
        switch (this.T) {
            case 0:
                xr0 xr0Var = (xr0) this.V;
                String currentLang = xr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    xr0Var.G.L0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.w81
    public void y(int i10, boolean z10) {
        switch (this.T) {
            case 1:
                ds0 ds0Var = (ds0) this.U;
                int i11 = ((es0) this.V).n.b0.get(i10, -1);
                jv0 jv0Var = ds0Var.d;
                if (i11 > 0) {
                    jv0.t(jv0Var, jv0Var.i1(i11).a, z10);
                    break;
                } else {
                    jv0.t(jv0Var, 8, z10);
                    break;
                }
            default:
                super.y(i10, z10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.w81
    public final void z(int i10) {
        switch (this.T) {
            case 0:
                xr0 xr0Var = (xr0) this.V;
                String currentLang = xr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    xr0Var.G.L0();
                    break;
                }
                break;
            default:
                ds0 ds0Var = (ds0) this.U;
                ((es0) this.V).n.b0.get(i10, -1);
                ds0Var.d.J0(1.0f);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(xr0 xr0Var, Context context) {
        super(context, null);
        this.V = xr0Var;
    }
}
