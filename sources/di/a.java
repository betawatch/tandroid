package di;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.is0;
import org.telegram.ui.Components.ns0;
import org.telegram.ui.Components.os0;
import org.telegram.ui.Components.tv0;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class a extends d91 {
    public final /* synthetic */ int T = 0;
    public Object U;
    public final /* synthetic */ FrameLayout V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(os0 os0Var, Context context, ns0 ns0Var) {
        super(context, null);
        this.V = os0Var;
        this.U = ns0Var;
    }

    @Override // org.telegram.ui.Components.d91
    public boolean i(MotionEvent motionEvent) {
        switch (this.T) {
            case 0:
                return !((is0) this.V).G.C1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.d91
    public final void w(boolean z10) {
        switch (this.T) {
            case 0:
                is0 is0Var = (is0) this.V;
                String currentLang = is0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    is0Var.G.N0();
                    break;
                }
                break;
            default:
                ns0 ns0Var = (ns0) this.U;
                ns0Var.d.L0(((os0) this.V).n.getAnimatingIndicatorProgress());
                break;
        }
    }

    @Override // org.telegram.ui.Components.d91
    public void x(int i10) {
        switch (this.T) {
            case 0:
                is0 is0Var = (is0) this.V;
                String currentLang = is0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    is0Var.G.N0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.d91
    public void y(int i10, boolean z10) {
        switch (this.T) {
            case 1:
                ns0 ns0Var = (ns0) this.U;
                int i11 = ((os0) this.V).n.b0.get(i10, -1);
                tv0 tv0Var = ns0Var.d;
                if (i11 > 0) {
                    tv0.u(tv0Var, tv0Var.k1(i11).a, z10);
                    break;
                } else {
                    tv0.u(tv0Var, 8, z10);
                    break;
                }
            default:
                super.y(i10, z10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.d91
    public final void z(int i10) {
        switch (this.T) {
            case 0:
                is0 is0Var = (is0) this.V;
                String currentLang = is0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    is0Var.G.N0();
                    break;
                }
                break;
            default:
                ns0 ns0Var = (ns0) this.U;
                ((os0) this.V).n.b0.get(i10, -1);
                ns0Var.d.L0(1.0f);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(is0 is0Var, Context context) {
        super(context, null);
        this.V = is0Var;
    }
}
