package ci;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.k91;
import org.telegram.ui.Components.ms0;
import org.telegram.ui.Components.rs0;
import org.telegram.ui.Components.ss0;
import org.telegram.ui.Components.xv0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class a extends k91 {
    public final /* synthetic */ int T = 0;
    public Object U;
    public final /* synthetic */ FrameLayout V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ss0 ss0Var, Context context, rs0 rs0Var) {
        super(context, null);
        this.V = ss0Var;
        this.U = rs0Var;
    }

    @Override // org.telegram.ui.Components.k91
    public boolean i(MotionEvent motionEvent) {
        switch (this.T) {
            case 0:
                return !((ms0) this.V).G.C1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.k91
    public final void w(boolean z10) {
        switch (this.T) {
            case 0:
                ms0 ms0Var = (ms0) this.V;
                String currentLang = ms0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    ms0Var.G.L0();
                    break;
                }
                break;
            default:
                rs0 rs0Var = (rs0) this.U;
                rs0Var.d.J0(((ss0) this.V).n.getAnimatingIndicatorProgress());
                break;
        }
    }

    @Override // org.telegram.ui.Components.k91
    public void x(int i10) {
        switch (this.T) {
            case 0:
                ms0 ms0Var = (ms0) this.V;
                String currentLang = ms0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    ms0Var.G.L0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.k91
    public void y(int i10, boolean z10) {
        switch (this.T) {
            case 1:
                rs0 rs0Var = (rs0) this.U;
                int i11 = ((ss0) this.V).n.b0.get(i10, -1);
                xv0 xv0Var = rs0Var.d;
                if (i11 > 0) {
                    xv0.t(xv0Var, xv0Var.i1(i11).a, z10);
                    break;
                } else {
                    xv0.t(xv0Var, 8, z10);
                    break;
                }
            default:
                super.y(i10, z10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.k91
    public final void z(int i10) {
        switch (this.T) {
            case 0:
                ms0 ms0Var = (ms0) this.V;
                String currentLang = ms0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    ms0Var.G.L0();
                    break;
                }
                break;
            default:
                rs0 rs0Var = (rs0) this.U;
                ((ss0) this.V).n.b0.get(i10, -1);
                rs0Var.d.J0(1.0f);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ms0 ms0Var, Context context) {
        super(context, null);
        this.V = ms0Var;
    }
}
