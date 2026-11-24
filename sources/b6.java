// default package

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class b6 extends e6 {
    public final /* synthetic */ byte d = 1;
    public final /* synthetic */ FrameLayout e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(oh3 oh3Var, Context context, xf4 xf4Var) {
        super(context, null, xf4Var);
        this.e = oh3Var;
    }

    @Override // e6, j79
    public final void f(k79 k79Var) {
        byte b = this.d;
        FrameLayout frameLayout = this.e;
        switch (b) {
            case 0:
                super.f(k79Var);
                float totalVisibility = getTotalVisibility();
                a6 a6Var = ((x10) frameLayout).G0;
                if (a6Var != null) {
                    a6Var.setTranslationY(totalVisibility * gl.L(-11.0f));
                    break;
                }
                break;
            default:
                super.f(k79Var);
                ((oh3) frameLayout).invalidate();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(x10 x10Var, Context context, wjb wjbVar, xf4 xf4Var) {
        super(context, wjbVar, xf4Var);
        this.e = x10Var;
    }
}
