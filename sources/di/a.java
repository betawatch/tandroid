package di;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.c91;
import org.telegram.ui.Components.hs0;
import org.telegram.ui.Components.ms0;
import org.telegram.ui.Components.ns0;
import org.telegram.ui.Components.sv0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class a extends c91 {
    public final /* synthetic */ int T = 0;
    public Object U;
    public final /* synthetic */ FrameLayout V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ns0 ns0Var, Context context, ms0 ms0Var) {
        super(context, null);
        this.V = ns0Var;
        this.U = ms0Var;
    }

    @Override // org.telegram.ui.Components.c91
    public boolean i(MotionEvent motionEvent) {
        switch (this.T) {
            case 0:
                return !((hs0) this.V).G.C1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.c91
    public final void w(boolean z10) {
        switch (this.T) {
            case 0:
                hs0 hs0Var = (hs0) this.V;
                String currentLang = hs0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    hs0Var.G.N0();
                    break;
                }
                break;
            default:
                ms0 ms0Var = (ms0) this.U;
                ms0Var.d.L0(((ns0) this.V).n.getAnimatingIndicatorProgress());
                break;
        }
    }

    @Override // org.telegram.ui.Components.c91
    public void x(int i10) {
        switch (this.T) {
            case 0:
                hs0 hs0Var = (hs0) this.V;
                String currentLang = hs0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    hs0Var.G.N0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.c91
    public void y(int i10, boolean z10) {
        switch (this.T) {
            case 1:
                ms0 ms0Var = (ms0) this.U;
                int i11 = ((ns0) this.V).n.b0.get(i10, -1);
                sv0 sv0Var = ms0Var.d;
                if (i11 > 0) {
                    sv0.u(sv0Var, sv0Var.k1(i11).a, z10);
                    break;
                } else {
                    sv0.u(sv0Var, 8, z10);
                    break;
                }
            default:
                super.y(i10, z10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.c91
    public final void z(int i10) {
        switch (this.T) {
            case 0:
                hs0 hs0Var = (hs0) this.V;
                String currentLang = hs0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    hs0Var.G.N0();
                    break;
                }
                break;
            default:
                ms0 ms0Var = (ms0) this.U;
                ((ns0) this.V).n.b0.get(i10, -1);
                ms0Var.d.L0(1.0f);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(hs0 hs0Var, Context context) {
        super(context, null);
        this.V = hs0Var;
    }
}
