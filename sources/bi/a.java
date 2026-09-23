package bi;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.mr0;
import org.telegram.ui.Components.rr0;
import org.telegram.ui.Components.tr0;
import org.telegram.ui.Components.yu0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class a extends h81 {
    public final /* synthetic */ int T = 0;
    public Object U;
    public final /* synthetic */ FrameLayout V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(tr0 tr0Var, Context context, rr0 rr0Var) {
        super(context, null);
        this.V = tr0Var;
        this.U = rr0Var;
    }

    @Override // org.telegram.ui.Components.h81
    public boolean i(MotionEvent motionEvent) {
        switch (this.T) {
            case 0:
                return !((mr0) this.V).G.C1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.h81
    public final void w(boolean z10) {
        switch (this.T) {
            case 0:
                mr0 mr0Var = (mr0) this.V;
                String currentLang = mr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    mr0Var.G.L0();
                    break;
                }
                break;
            default:
                rr0 rr0Var = (rr0) this.U;
                rr0Var.d.J0(((tr0) this.V).n.getAnimatingIndicatorProgress());
                break;
        }
    }

    @Override // org.telegram.ui.Components.h81
    public void x(int i10) {
        switch (this.T) {
            case 0:
                mr0 mr0Var = (mr0) this.V;
                String currentLang = mr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    mr0Var.G.L0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.h81
    public void y(int i10, boolean z10) {
        switch (this.T) {
            case 1:
                rr0 rr0Var = (rr0) this.U;
                int i11 = ((tr0) this.V).n.b0.get(i10, -1);
                yu0 yu0Var = rr0Var.d;
                if (i11 > 0) {
                    yu0.t(yu0Var, yu0Var.i1(i11).a, z10);
                    break;
                } else {
                    yu0.t(yu0Var, 8, z10);
                    break;
                }
            default:
                super.y(i10, z10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.h81
    public final void z(int i10) {
        switch (this.T) {
            case 0:
                mr0 mr0Var = (mr0) this.V;
                String currentLang = mr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    mr0Var.G.L0();
                    break;
                }
                break;
            default:
                rr0 rr0Var = (rr0) this.U;
                ((tr0) this.V).n.b0.get(i10, -1);
                rr0Var.d.J0(1.0f);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(mr0 mr0Var, Context context) {
        super(context, null);
        this.V = mr0Var;
    }
}
