package ci;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.lr0;
import org.telegram.ui.Components.rr0;
import org.telegram.ui.Components.sr0;
import org.telegram.ui.Components.xu0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class a extends i81 {
    public final /* synthetic */ int T = 0;
    public Object U;
    public final /* synthetic */ FrameLayout V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(sr0 sr0Var, Context context, rr0 rr0Var) {
        super(context, null);
        this.V = sr0Var;
        this.U = rr0Var;
    }

    @Override // org.telegram.ui.Components.i81
    public boolean i(MotionEvent motionEvent) {
        switch (this.T) {
            case 0:
                return !((lr0) this.V).G.C1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.i81
    public final void w(boolean z10) {
        switch (this.T) {
            case 0:
                lr0 lr0Var = (lr0) this.V;
                String currentLang = lr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    lr0Var.G.L0();
                    break;
                }
                break;
            default:
                rr0 rr0Var = (rr0) this.U;
                rr0Var.d.J0(((sr0) this.V).n.getAnimatingIndicatorProgress());
                break;
        }
    }

    @Override // org.telegram.ui.Components.i81
    public void x(int i10) {
        switch (this.T) {
            case 0:
                lr0 lr0Var = (lr0) this.V;
                String currentLang = lr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    lr0Var.G.L0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.i81
    public void y(int i10, boolean z10) {
        switch (this.T) {
            case 1:
                rr0 rr0Var = (rr0) this.U;
                int i11 = ((sr0) this.V).n.b0.get(i10, -1);
                xu0 xu0Var = rr0Var.d;
                if (i11 > 0) {
                    xu0.t(xu0Var, xu0Var.i1(i11).a, z10);
                    break;
                } else {
                    xu0.t(xu0Var, 8, z10);
                    break;
                }
            default:
                super.y(i10, z10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.i81
    public final void z(int i10) {
        switch (this.T) {
            case 0:
                lr0 lr0Var = (lr0) this.V;
                String currentLang = lr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    lr0Var.G.L0();
                    break;
                }
                break;
            default:
                rr0 rr0Var = (rr0) this.U;
                ((sr0) this.V).n.b0.get(i10, -1);
                rr0Var.d.J0(1.0f);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(lr0 lr0Var, Context context) {
        super(context, null);
        this.V = lr0Var;
    }
}
