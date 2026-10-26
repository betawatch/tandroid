package ei;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.u91;
import org.telegram.ui.Components.us0;
import org.telegram.ui.Components.ys0;
import org.telegram.ui.Components.zs0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class a extends u91 {
    public final /* synthetic */ int V = 0;
    public Object W;
    public final /* synthetic */ FrameLayout a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(zs0 zs0Var, Context context, ys0 ys0Var) {
        super(context, null);
        this.a0 = zs0Var;
        this.W = ys0Var;
    }

    @Override // org.telegram.ui.Components.u91
    public final void A(int i10) {
        switch (this.V) {
            case 0:
                us0 us0Var = (us0) this.a0;
                String currentLang = us0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.W, currentLang)) {
                    this.W = currentLang;
                    us0Var.G.S0();
                    break;
                }
                break;
            default:
                ys0 ys0Var = (ys0) this.W;
                ((zs0) this.a0).b.b0.get(i10, -1);
                ys0Var.d.Q0(1.0f);
                break;
        }
    }

    @Override // org.telegram.ui.Components.u91
    public boolean i(MotionEvent motionEvent) {
        switch (this.V) {
            case 0:
                return !((us0) this.a0).G.E1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.u91
    public final void w(boolean z10) {
        switch (this.V) {
            case 0:
                us0 us0Var = (us0) this.a0;
                String currentLang = us0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.W, currentLang)) {
                    this.W = currentLang;
                    us0Var.G.S0();
                    break;
                }
                break;
            default:
                ys0 ys0Var = (ys0) this.W;
                ys0Var.d.Q0(((zs0) this.a0).b.getAnimatingIndicatorProgress());
                break;
        }
    }

    @Override // org.telegram.ui.Components.u91
    public void y(int i10) {
        switch (this.V) {
            case 0:
                us0 us0Var = (us0) this.a0;
                String currentLang = us0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.W, currentLang)) {
                    this.W = currentLang;
                    us0Var.G.S0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.u91
    public void z(int i10, boolean z10) {
        switch (this.V) {
            case 1:
                ys0 ys0Var = (ys0) this.W;
                int i11 = ((zs0) this.a0).b.b0.get(i10, -1);
                aw0 aw0Var = ys0Var.d;
                if (i11 > 0) {
                    aw0.u(aw0Var, aw0Var.r1(i11).a, z10);
                    break;
                } else {
                    aw0.u(aw0Var, 8, z10);
                    break;
                }
            default:
                super.z(i10, z10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(us0 us0Var, Context context) {
        super(context, null);
        this.a0 = us0Var;
    }
}
