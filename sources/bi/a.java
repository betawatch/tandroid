package bi;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ds0;
import org.telegram.ui.Components.g91;
import org.telegram.ui.Components.js0;
import org.telegram.ui.Components.ks0;
import org.telegram.ui.Components.pv0;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final class a extends g91 {
    public final /* synthetic */ int U = 0;
    public Object V;
    public final /* synthetic */ FrameLayout W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ks0 ks0Var, Context context, js0 js0Var) {
        super(context, null);
        this.W = ks0Var;
        this.V = js0Var;
    }

    @Override // org.telegram.ui.Components.g91
    public final void A(int i10) {
        switch (this.U) {
            case 0:
                ds0 ds0Var = (ds0) this.W;
                String currentLang = ds0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.V, currentLang)) {
                    this.V = currentLang;
                    ds0Var.G.L0();
                    break;
                }
                break;
            default:
                js0 js0Var = (js0) this.V;
                ((ks0) this.W).n.b0.get(i10, -1);
                js0Var.d.J0(1.0f);
                break;
        }
    }

    @Override // org.telegram.ui.Components.g91
    public boolean i(MotionEvent motionEvent) {
        switch (this.U) {
            case 0:
                return !((ds0) this.W).G.C1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.g91
    public final void w(boolean z10) {
        switch (this.U) {
            case 0:
                ds0 ds0Var = (ds0) this.W;
                String currentLang = ds0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.V, currentLang)) {
                    this.V = currentLang;
                    ds0Var.G.L0();
                    break;
                }
                break;
            default:
                js0 js0Var = (js0) this.V;
                js0Var.d.J0(((ks0) this.W).n.getAnimatingIndicatorProgress());
                break;
        }
    }

    @Override // org.telegram.ui.Components.g91
    public void y(int i10) {
        switch (this.U) {
            case 0:
                ds0 ds0Var = (ds0) this.W;
                String currentLang = ds0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.V, currentLang)) {
                    this.V = currentLang;
                    ds0Var.G.L0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.g91
    public void z(int i10, boolean z10) {
        switch (this.U) {
            case 1:
                js0 js0Var = (js0) this.V;
                int i11 = ((ks0) this.W).n.b0.get(i10, -1);
                pv0 pv0Var = js0Var.d;
                if (i11 > 0) {
                    pv0.t(pv0Var, pv0Var.i1(i11).a, z10);
                    break;
                } else {
                    pv0.t(pv0Var, 8, z10);
                    break;
                }
            default:
                super.z(i10, z10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ds0 ds0Var, Context context) {
        super(context, null);
        this.W = ds0Var;
    }
}
