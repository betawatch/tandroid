// default package

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class hi extends LinearLayout {
    public boolean a;
    public final /* synthetic */ hn7 b;
    public final /* synthetic */ hn7 c;
    public final /* synthetic */ hn7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi(Context context, hn7 hn7Var, hn7 hn7Var2, hn7 hn7Var3) {
        super(context);
        this.b = hn7Var;
        this.c = hn7Var2;
        this.d = hn7Var3;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.a = true;
        Point point = gl.q;
        int i3 = point.x > point.y ? 3 : 5;
        hn7 hn7Var = this.b;
        hn7Var.setItemCount(i3);
        hn7 hn7Var2 = this.c;
        hn7Var2.setItemCount(i3);
        hn7 hn7Var3 = this.d;
        hn7Var3.setItemCount(i3);
        hn7Var.getLayoutParams().height = gl.L(42.0f) * i3;
        hn7Var2.getLayoutParams().height = gl.L(42.0f) * i3;
        hn7Var3.getLayoutParams().height = gl.L(42.0f) * i3;
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
