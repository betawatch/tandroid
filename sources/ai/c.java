package ai;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.as0;
import org.telegram.ui.Components.cs0;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.v81;
import org.telegram.ui.Components.vr0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class c extends v81 {
    public final /* synthetic */ int T = 1;
    public Object U;
    public final /* synthetic */ FrameLayout V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(cs0 cs0Var, Context context, as0 as0Var) {
        super(context, null);
        this.V = cs0Var;
        this.U = as0Var;
    }

    @Override // org.telegram.ui.Components.v81
    public boolean i(MotionEvent motionEvent) {
        switch (this.T) {
            case 0:
                return !((vr0) this.V).G.C1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.v81
    public final void w(boolean z10) {
        switch (this.T) {
            case 0:
                vr0 vr0Var = (vr0) this.V;
                String currentLang = vr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    vr0Var.G.L0();
                    break;
                }
                break;
            default:
                as0 as0Var = (as0) this.U;
                as0Var.d.J0(((cs0) this.V).n.getAnimatingIndicatorProgress());
                break;
        }
    }

    @Override // org.telegram.ui.Components.v81
    public void x(int i10) {
        switch (this.T) {
            case 0:
                vr0 vr0Var = (vr0) this.V;
                String currentLang = vr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    vr0Var.G.L0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.v81
    public void y(int i10, boolean z10) {
        switch (this.T) {
            case 1:
                as0 as0Var = (as0) this.U;
                int i11 = ((cs0) this.V).n.b0.get(i10, -1);
                iv0 iv0Var = as0Var.d;
                if (i11 > 0) {
                    iv0.t(iv0Var, iv0Var.i1(i11).a, z10);
                    break;
                } else {
                    iv0.t(iv0Var, 8, z10);
                    break;
                }
            default:
                super.y(i10, z10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.v81
    public final void z(int i10) {
        switch (this.T) {
            case 0:
                vr0 vr0Var = (vr0) this.V;
                String currentLang = vr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    vr0Var.G.L0();
                    break;
                }
                break;
            default:
                as0 as0Var = (as0) this.U;
                ((cs0) this.V).n.b0.get(i10, -1);
                as0Var.d.J0(1.0f);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(vr0 vr0Var, Context context) {
        super(context, null);
        this.V = vr0Var;
    }
}
