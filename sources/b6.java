// default package

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class b6 extends e6 {
    public final /* synthetic */ byte d = 1;
    public final /* synthetic */ FrameLayout e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(aj3 aj3Var, Context context, yh4 yh4Var) {
        super(context, null, yh4Var);
        this.e = aj3Var;
    }

    @Override // e6, l99
    public final void e(m99 m99Var) {
        byte b = this.d;
        FrameLayout frameLayout = this.e;
        switch (b) {
            case 0:
                super.e(m99Var);
                float totalVisibility = getTotalVisibility();
                a6 a6Var = ((x20) frameLayout).G0;
                if (a6Var != null) {
                    a6Var.setTranslationY(totalVisibility * gm.L(-11.0f));
                    break;
                }
                break;
            default:
                super.e(m99Var);
                ((aj3) frameLayout).invalidate();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(x20 x20Var, Context context, ylb ylbVar, yh4 yh4Var) {
        super(context, ylbVar, yh4Var);
        this.e = x20Var;
    }
}
