package jh;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.eu0;
import org.telegram.ui.Components.n71;
import org.telegram.ui.Components.uq0;
import org.telegram.ui.Components.yq0;
import org.telegram.ui.Components.zq0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class a extends n71 {
    public final /* synthetic */ int P = 0;
    public Object Q;
    public final /* synthetic */ FrameLayout R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(zq0 zq0Var, Context context, yq0 yq0Var) {
        super(context, null);
        this.R = zq0Var;
        this.Q = yq0Var;
    }

    @Override // org.telegram.ui.Components.n71
    public boolean i(MotionEvent motionEvent) {
        switch (this.P) {
            case 0:
                return !((uq0) this.R).C.y1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.n71
    public final void w(boolean z10) {
        switch (this.P) {
            case 0:
                uq0 uq0Var = (uq0) this.R;
                String currentLang = uq0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.Q, currentLang)) {
                    this.Q = currentLang;
                    uq0Var.C.L0();
                    break;
                }
                break;
            default:
                yq0 yq0Var = (yq0) this.Q;
                yq0Var.d.J0(((zq0) this.R).n.getAnimatingIndicatorProgress());
                break;
        }
    }

    @Override // org.telegram.ui.Components.n71
    public void x(int i9) {
        switch (this.P) {
            case 0:
                uq0 uq0Var = (uq0) this.R;
                String currentLang = uq0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.Q, currentLang)) {
                    this.Q = currentLang;
                    uq0Var.C.L0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.n71
    public void y(int i9, boolean z10) {
        switch (this.P) {
            case 1:
                yq0 yq0Var = (yq0) this.Q;
                int i10 = ((zq0) this.R).n.U.get(i9, -1);
                eu0 eu0Var = yq0Var.d;
                if (i10 > 0) {
                    eu0.t(eu0Var, eu0Var.i1(i10).a, z10);
                    break;
                } else {
                    eu0.t(eu0Var, 8, z10);
                    break;
                }
            default:
                super.y(i9, z10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.n71
    public final void z(int i9) {
        switch (this.P) {
            case 0:
                uq0 uq0Var = (uq0) this.R;
                String currentLang = uq0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.Q, currentLang)) {
                    this.Q = currentLang;
                    uq0Var.C.L0();
                    break;
                }
                break;
            default:
                yq0 yq0Var = (yq0) this.Q;
                ((zq0) this.R).n.U.get(i9, -1);
                yq0Var.d.J0(1.0f);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(uq0 uq0Var, Context context) {
        super(context, null);
        this.R = uq0Var;
    }
}
