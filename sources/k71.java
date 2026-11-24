// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class k71 extends w81 {
    public final /* synthetic */ byte I = 1;
    public final /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k71(wf3 wf3Var, Context context, d dVar) {
        super(context, dVar, null, null);
        this.J = wf3Var;
    }

    public final void f(boolean z) {
        rja rjaVar;
        rja rjaVar2;
        y71 y71Var = (y71) this.J;
        if (!z) {
            rjaVar = ((d) y71Var).simpleActionBar;
            rjaVar.w();
            return;
        }
        fn0 fn0Var = y71Var.T;
        if (fn0Var != null) {
            fn0Var.a(true, true);
        }
        rjaVar2 = ((d) y71Var).simpleActionBar;
        rjaVar2.J();
    }

    @Override // w81, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.I) {
            case 1:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((((wf3) this.J).q1 - a.getCurrentActionBarHeight()) - gm.m, TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k71(y71 y71Var, Context context, y71 y71Var2, sy4 sy4Var, fja fjaVar) {
        super(context, y71Var2, sy4Var, fjaVar);
        this.J = y71Var;
    }
}
