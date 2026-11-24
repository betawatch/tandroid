// default package

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class hj extends LinearLayout {
    public boolean a;
    public final /* synthetic */ lp7 b;
    public final /* synthetic */ lp7 c;
    public final /* synthetic */ lp7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj(Context context, lp7 lp7Var, lp7 lp7Var2, lp7 lp7Var3) {
        super(context);
        this.b = lp7Var;
        this.c = lp7Var2;
        this.d = lp7Var3;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.a = true;
        Point point = gm.q;
        int i3 = point.x > point.y ? 3 : 5;
        lp7 lp7Var = this.b;
        lp7Var.setItemCount(i3);
        lp7 lp7Var2 = this.c;
        lp7Var2.setItemCount(i3);
        lp7 lp7Var3 = this.d;
        lp7Var3.setItemCount(i3);
        lp7Var.getLayoutParams().height = gm.L(42.0f) * i3;
        lp7Var2.getLayoutParams().height = gm.L(42.0f) * i3;
        lp7Var3.getLayoutParams().height = gm.L(42.0f) * i3;
        this.a = false;
        super.onMeasure(i, i2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.a) {
            return;
        }
        super.requestLayout();
    }
}
