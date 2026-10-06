package bi;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.es0;
import org.telegram.ui.Components.h91;
import org.telegram.ui.Components.ks0;
import org.telegram.ui.Components.ls0;
import org.telegram.ui.Components.qv0;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final class a extends h91 {
    public final /* synthetic */ int V = 0;
    public Object W;
    public final /* synthetic */ FrameLayout a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ls0 ls0Var, Context context, ks0 ks0Var) {
        super(context, null);
        this.a0 = ls0Var;
        this.W = ks0Var;
    }

    @Override // org.telegram.ui.Components.h91
    public final void A(int i10) {
        switch (this.V) {
            case 0:
                es0 es0Var = (es0) this.a0;
                String currentLang = es0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.W, currentLang)) {
                    this.W = currentLang;
                    es0Var.G.L0();
                    break;
                }
                break;
            default:
                ks0 ks0Var = (ks0) this.W;
                ((ls0) this.a0).n.b0.get(i10, -1);
                ks0Var.d.J0(1.0f);
                break;
        }
    }

    @Override // org.telegram.ui.Components.h91
    public boolean i(MotionEvent motionEvent) {
        switch (this.V) {
            case 0:
                return !((es0) this.a0).G.C1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.h91
    public final void w(boolean z10) {
        switch (this.V) {
            case 0:
                es0 es0Var = (es0) this.a0;
                String currentLang = es0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.W, currentLang)) {
                    this.W = currentLang;
                    es0Var.G.L0();
                    break;
                }
                break;
            default:
                ks0 ks0Var = (ks0) this.W;
                ks0Var.d.J0(((ls0) this.a0).n.getAnimatingIndicatorProgress());
                break;
        }
    }

    @Override // org.telegram.ui.Components.h91
    public void y(int i10) {
        switch (this.V) {
            case 0:
                es0 es0Var = (es0) this.a0;
                String currentLang = es0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.W, currentLang)) {
                    this.W = currentLang;
                    es0Var.G.L0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.h91
    public void z(int i10, boolean z10) {
        switch (this.V) {
            case 1:
                ks0 ks0Var = (ks0) this.W;
                int i11 = ((ls0) this.a0).n.b0.get(i10, -1);
                qv0 qv0Var = ks0Var.d;
                if (i11 > 0) {
                    qv0.t(qv0Var, qv0Var.i1(i11).a, z10);
                    break;
                } else {
                    qv0.t(qv0Var, 8, z10);
                    break;
                }
            default:
                super.z(i10, z10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(es0 es0Var, Context context) {
        super(context, null);
        this.a0 = es0Var;
    }
}
