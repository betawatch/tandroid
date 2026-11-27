// default package

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class c6 extends f6 {
    public final /* synthetic */ byte d = 1;
    public final /* synthetic */ FrameLayout e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(ii3 ii3Var, Context context, vh4 vh4Var) {
        super(context, null, vh4Var);
        this.e = ii3Var;
    }

    @Override // f6, wa9
    public final void f(xa9 xa9Var) {
        byte b = this.d;
        FrameLayout frameLayout = this.e;
        switch (b) {
            case 0:
                super.f(xa9Var);
                float totalVisibility = getTotalVisibility();
                b6 b6Var = ((y10) frameLayout).G0;
                if (b6Var != null) {
                    b6Var.setTranslationY(totalVisibility * hl.L(-11.0f));
                    break;
                }
                break;
            default:
                super.f(xa9Var);
                ((ii3) frameLayout).invalidate();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(y10 y10Var, Context context, vnb vnbVar, vh4 vh4Var) {
        super(context, vnbVar, vh4Var);
        this.e = y10Var;
    }
}
