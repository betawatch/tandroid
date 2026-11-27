// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class l61 extends w71 {
    public final /* synthetic */ byte I = 1;
    public final /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l61(df3 df3Var, Context context, e eVar) {
        super(context, eVar, null, null);
        this.J = df3Var;
    }

    public final void f(boolean z) {
        jla jlaVar;
        jla jlaVar2;
        z61 z61Var = (z61) this.J;
        if (!z) {
            jlaVar = ((e) z61Var).simpleActionBar;
            jlaVar.y();
            return;
        }
        fm0 fm0Var = z61Var.T;
        if (fm0Var != null) {
            fm0Var.a(true, true);
        }
        jlaVar2 = ((e) z61Var).simpleActionBar;
        jlaVar2.L();
    }

    @Override // w71, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.I) {
            case 1:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((((df3) this.J).q1 - a.getCurrentActionBarHeight()) - hl.m, TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l61(z61 z61Var, Context context, z61 z61Var2, vy4 vy4Var, wka wkaVar) {
        super(context, z61Var2, vy4Var, wkaVar);
        this.J = z61Var;
    }
}
