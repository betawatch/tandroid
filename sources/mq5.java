// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class mq5 extends o39 {
    public int f3;
    public final /* synthetic */ zq5 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mq5(zq5 zq5Var, Context context) {
        super(context, null);
        this.g3 = zq5Var;
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        zq5 zq5Var = this.g3;
        mq5 mq5Var = zq5Var.P1;
        if (this.f3 != View.MeasureSpec.getSize(i2)) {
            this.f3 = View.MeasureSpec.getSize(i2);
            zq5Var.U1 = true;
            mq5Var.setPadding(0, 0, 0, 0);
            zq5Var.U1 = false;
            measure(i, View.MeasureSpec.makeMeasureSpec(i2, TLObject.FLAG_31));
            int measuredHeight = getMeasuredHeight();
            int i3 = this.f3;
            int i4 = (int) ((i3 / 5.0f) * 2.0f);
            if (i4 < gl.L(60.0f) + (i3 - measuredHeight)) {
                i4 = this.f3 - measuredHeight;
            }
            zq5Var.U1 = true;
            mq5Var.setPadding(0, i4, 0, 0);
            zq5Var.U1 = false;
            measure(i, View.MeasureSpec.makeMeasureSpec(i2, TLObject.FLAG_31));
        }
        super.onMeasure(i, i2);
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.g3.U1) {
            return;
        }
        super.requestLayout();
    }
}
