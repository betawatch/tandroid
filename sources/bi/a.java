package bi;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.fs0;
import org.telegram.ui.Components.gs0;
import org.telegram.ui.Components.lv0;
import org.telegram.ui.Components.y81;
import org.telegram.ui.Components.zr0;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes4.dex */
public final class a extends y81 {
    public final /* synthetic */ int T = 1;
    public Object U;
    public final /* synthetic */ FrameLayout V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(gs0 gs0Var, Context context, fs0 fs0Var) {
        super(context, null);
        this.V = gs0Var;
        this.U = fs0Var;
    }

    @Override // org.telegram.ui.Components.y81
    public boolean i(MotionEvent motionEvent) {
        switch (this.T) {
            case 0:
                return !((zr0) this.V).G.C1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.y81
    public final void w(boolean z10) {
        switch (this.T) {
            case 0:
                zr0 zr0Var = (zr0) this.V;
                String currentLang = zr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    zr0Var.G.L0();
                    break;
                }
                break;
            default:
                fs0 fs0Var = (fs0) this.U;
                fs0Var.d.J0(((gs0) this.V).n.getAnimatingIndicatorProgress());
                break;
        }
    }

    @Override // org.telegram.ui.Components.y81
    public void x(int i10) {
        switch (this.T) {
            case 0:
                zr0 zr0Var = (zr0) this.V;
                String currentLang = zr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    zr0Var.G.L0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.y81
    public void y(int i10, boolean z10) {
        switch (this.T) {
            case 1:
                fs0 fs0Var = (fs0) this.U;
                int i11 = ((gs0) this.V).n.b0.get(i10, -1);
                lv0 lv0Var = fs0Var.d;
                if (i11 > 0) {
                    lv0.t(lv0Var, lv0Var.i1(i11).a, z10);
                    break;
                } else {
                    lv0.t(lv0Var, 8, z10);
                    break;
                }
            default:
                super.y(i10, z10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.y81
    public final void z(int i10) {
        switch (this.T) {
            case 0:
                zr0 zr0Var = (zr0) this.V;
                String currentLang = zr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    zr0Var.G.L0();
                    break;
                }
                break;
            default:
                fs0 fs0Var = (fs0) this.U;
                ((gs0) this.V).n.b0.get(i10, -1);
                fs0Var.d.J0(1.0f);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(zr0 zr0Var, Context context) {
        super(context, null);
        this.V = zr0Var;
    }
}
