package ei;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.at0;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.v91;
import org.telegram.ui.Components.vs0;
import org.telegram.ui.Components.zs0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class a extends v91 {
    public final /* synthetic */ int V = 1;
    public Object W;
    public final /* synthetic */ FrameLayout a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(at0 at0Var, Context context, zs0 zs0Var) {
        super(context, null);
        this.a0 = at0Var;
        this.W = zs0Var;
    }

    @Override // org.telegram.ui.Components.v91
    public final void A(int i10) {
        switch (this.V) {
            case 0:
                vs0 vs0Var = (vs0) this.a0;
                String currentLang = vs0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.W, currentLang)) {
                    this.W = currentLang;
                    vs0Var.G.S0();
                    break;
                }
                break;
            default:
                zs0 zs0Var = (zs0) this.W;
                ((at0) this.a0).b.b0.get(i10, -1);
                zs0Var.d.Q0(1.0f);
                break;
        }
    }

    @Override // org.telegram.ui.Components.v91
    public boolean i(MotionEvent motionEvent) {
        switch (this.V) {
            case 0:
                return !((vs0) this.a0).G.E1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.v91
    public final void w(boolean z10) {
        switch (this.V) {
            case 0:
                vs0 vs0Var = (vs0) this.a0;
                String currentLang = vs0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.W, currentLang)) {
                    this.W = currentLang;
                    vs0Var.G.S0();
                    break;
                }
                break;
            default:
                zs0 zs0Var = (zs0) this.W;
                zs0Var.d.Q0(((at0) this.a0).b.getAnimatingIndicatorProgress());
                break;
        }
    }

    @Override // org.telegram.ui.Components.v91
    public void y(int i10) {
        switch (this.V) {
            case 0:
                vs0 vs0Var = (vs0) this.a0;
                String currentLang = vs0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.W, currentLang)) {
                    this.W = currentLang;
                    vs0Var.G.S0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.v91
    public void z(int i10, boolean z10) {
        switch (this.V) {
            case 1:
                zs0 zs0Var = (zs0) this.W;
                int i11 = ((at0) this.a0).b.b0.get(i10, -1);
                bw0 bw0Var = zs0Var.d;
                if (i11 > 0) {
                    bw0.u(bw0Var, bw0Var.r1(i11).a, z10);
                    break;
                } else {
                    bw0.u(bw0Var, 8, z10);
                    break;
                }
            default:
                super.z(i10, z10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(vs0 vs0Var, Context context) {
        super(context, null);
        this.a0 = vs0Var;
    }
}
