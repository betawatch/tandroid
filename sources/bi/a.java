package bi;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ds0;
import org.telegram.ui.Components.fs0;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.x81;
import org.telegram.ui.Components.yr0;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final class a extends x81 {
    public final /* synthetic */ int U = 1;
    public Object V;
    public final /* synthetic */ FrameLayout W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(fs0 fs0Var, Context context, ds0 ds0Var) {
        super(context, null);
        this.W = fs0Var;
        this.V = ds0Var;
    }

    @Override // org.telegram.ui.Components.x81
    public final void A(int i10) {
        switch (this.U) {
            case 0:
                yr0 yr0Var = (yr0) this.W;
                String currentLang = yr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.V, currentLang)) {
                    this.V = currentLang;
                    yr0Var.G.L0();
                    break;
                }
                break;
            default:
                ds0 ds0Var = (ds0) this.V;
                ((fs0) this.W).n.b0.get(i10, -1);
                ds0Var.d.J0(1.0f);
                break;
        }
    }

    @Override // org.telegram.ui.Components.x81
    public boolean i(MotionEvent motionEvent) {
        switch (this.U) {
            case 0:
                return !((yr0) this.W).G.C1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.x81
    public final void w(boolean z10) {
        switch (this.U) {
            case 0:
                yr0 yr0Var = (yr0) this.W;
                String currentLang = yr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.V, currentLang)) {
                    this.V = currentLang;
                    yr0Var.G.L0();
                    break;
                }
                break;
            default:
                ds0 ds0Var = (ds0) this.V;
                ds0Var.d.J0(((fs0) this.W).n.getAnimatingIndicatorProgress());
                break;
        }
    }

    @Override // org.telegram.ui.Components.x81
    public void y(int i10) {
        switch (this.U) {
            case 0:
                yr0 yr0Var = (yr0) this.W;
                String currentLang = yr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.V, currentLang)) {
                    this.V = currentLang;
                    yr0Var.G.L0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.x81
    public void z(int i10, boolean z10) {
        switch (this.U) {
            case 1:
                ds0 ds0Var = (ds0) this.V;
                int i11 = ((fs0) this.W).n.b0.get(i10, -1);
                kv0 kv0Var = ds0Var.d;
                if (i11 > 0) {
                    kv0.t(kv0Var, kv0Var.i1(i11).a, z10);
                    break;
                } else {
                    kv0.t(kv0Var, 8, z10);
                    break;
                }
            default:
                super.z(i10, z10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(yr0 yr0Var, Context context) {
        super(context, null);
        this.W = yr0Var;
    }
}
