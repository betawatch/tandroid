package bi;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.fs0;
import org.telegram.ui.Components.gs0;
import org.telegram.ui.Components.lv0;
import org.telegram.ui.Components.z81;
import org.telegram.ui.Components.zr0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class a extends z81 {
    public final /* synthetic */ int U = 1;
    public Object V;
    public final /* synthetic */ FrameLayout W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(gs0 gs0Var, Context context, fs0 fs0Var) {
        super(context, null);
        this.W = gs0Var;
        this.V = fs0Var;
    }

    @Override // org.telegram.ui.Components.z81
    public final void A(int i10) {
        switch (this.U) {
            case 0:
                zr0 zr0Var = (zr0) this.W;
                String currentLang = zr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.V, currentLang)) {
                    this.V = currentLang;
                    zr0Var.G.L0();
                    break;
                }
                break;
            default:
                fs0 fs0Var = (fs0) this.V;
                ((gs0) this.W).n.b0.get(i10, -1);
                fs0Var.d.J0(1.0f);
                break;
        }
    }

    @Override // org.telegram.ui.Components.z81
    public boolean i(MotionEvent motionEvent) {
        switch (this.U) {
            case 0:
                return !((zr0) this.W).G.C1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.z81
    public final void w(boolean z10) {
        switch (this.U) {
            case 0:
                zr0 zr0Var = (zr0) this.W;
                String currentLang = zr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.V, currentLang)) {
                    this.V = currentLang;
                    zr0Var.G.L0();
                    break;
                }
                break;
            default:
                fs0 fs0Var = (fs0) this.V;
                fs0Var.d.J0(((gs0) this.W).n.getAnimatingIndicatorProgress());
                break;
        }
    }

    @Override // org.telegram.ui.Components.z81
    public void y(int i10) {
        switch (this.U) {
            case 0:
                zr0 zr0Var = (zr0) this.W;
                String currentLang = zr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.V, currentLang)) {
                    this.V = currentLang;
                    zr0Var.G.L0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.z81
    public void z(int i10, boolean z10) {
        switch (this.U) {
            case 1:
                fs0 fs0Var = (fs0) this.V;
                int i11 = ((gs0) this.W).n.b0.get(i10, -1);
                lv0 lv0Var = fs0Var.d;
                if (i11 > 0) {
                    lv0.t(lv0Var, lv0Var.i1(i11).a, z10);
                    break;
                } else {
                    lv0.t(lv0Var, 8, z10);
                    break;
                }
            default:
                super.z(i10, z10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(zr0 zr0Var, Context context) {
        super(context, null);
        this.W = zr0Var;
    }
}
