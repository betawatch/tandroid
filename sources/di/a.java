package di;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.e91;
import org.telegram.ui.Components.js0;
import org.telegram.ui.Components.os0;
import org.telegram.ui.Components.ps0;
import org.telegram.ui.Components.uv0;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class a extends e91 {
    public final /* synthetic */ int T = 0;
    public Object U;
    public final /* synthetic */ FrameLayout V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ps0 ps0Var, Context context, os0 os0Var) {
        super(context, null);
        this.V = ps0Var;
        this.U = os0Var;
    }

    @Override // org.telegram.ui.Components.e91
    public boolean i(MotionEvent motionEvent) {
        switch (this.T) {
            case 0:
                return !((js0) this.V).G.C1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.e91
    public final void w(boolean z10) {
        switch (this.T) {
            case 0:
                js0 js0Var = (js0) this.V;
                String currentLang = js0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    js0Var.G.N0();
                    break;
                }
                break;
            default:
                os0 os0Var = (os0) this.U;
                os0Var.d.L0(((ps0) this.V).n.getAnimatingIndicatorProgress());
                break;
        }
    }

    @Override // org.telegram.ui.Components.e91
    public void x(int i10) {
        switch (this.T) {
            case 0:
                js0 js0Var = (js0) this.V;
                String currentLang = js0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    js0Var.G.N0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.e91
    public void y(int i10, boolean z10) {
        switch (this.T) {
            case 1:
                os0 os0Var = (os0) this.U;
                int i11 = ((ps0) this.V).n.b0.get(i10, -1);
                uv0 uv0Var = os0Var.d;
                if (i11 > 0) {
                    uv0.u(uv0Var, uv0Var.k1(i11).a, z10);
                    break;
                } else {
                    uv0.u(uv0Var, 8, z10);
                    break;
                }
            default:
                super.y(i10, z10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.e91
    public final void z(int i10) {
        switch (this.T) {
            case 0:
                js0 js0Var = (js0) this.V;
                String currentLang = js0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    js0Var.G.N0();
                    break;
                }
                break;
            default:
                os0 os0Var = (os0) this.U;
                ((ps0) this.V).n.b0.get(i10, -1);
                os0Var.d.L0(1.0f);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(js0 js0Var, Context context) {
        super(context, null);
        this.V = js0Var;
    }
}
