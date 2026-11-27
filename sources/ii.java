// default package

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ii extends LinearLayout {
    public boolean a;
    public final /* synthetic */ hq7 b;
    public final /* synthetic */ hq7 c;
    public final /* synthetic */ hq7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii(Context context, hq7 hq7Var, hq7 hq7Var2, hq7 hq7Var3) {
        super(context);
        this.b = hq7Var;
        this.c = hq7Var2;
        this.d = hq7Var3;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.a = true;
        Point point = hl.q;
        int i3 = point.x > point.y ? 3 : 5;
        hq7 hq7Var = this.b;
        hq7Var.setItemCount(i3);
        hq7 hq7Var2 = this.c;
        hq7Var2.setItemCount(i3);
        hq7 hq7Var3 = this.d;
        hq7Var3.setItemCount(i3);
        hq7Var.getLayoutParams().height = hl.L(42.0f) * i3;
        hq7Var2.getLayoutParams().height = hl.L(42.0f) * i3;
        hq7Var3.getLayoutParams().height = hl.L(42.0f) * i3;
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
