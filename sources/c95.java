// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class c95 extends FrameLayout {
    public final /* synthetic */ f65 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c95(f65 f65Var, Context context) {
        super(context);
        this.a = f65Var;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.a.D0();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z = View.MeasureSpec.getSize(i) > View.MeasureSpec.getSize(i2);
        f65 f65Var = this.a;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) f65Var.m1.getLayoutParams();
        if (z) {
            int L = gl.L(80.0f);
            marginLayoutParams.leftMargin = L;
            marginLayoutParams.rightMargin = L;
        } else {
            int L2 = gl.L(16.0f);
            marginLayoutParams.leftMargin = L2;
            marginLayoutParams.rightMargin = L2;
        }
        int D = ug8.D(200.0f, View.MeasureSpec.getSize(i), 2);
        f65Var.l1.setPadding(D, 0, D, 0);
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(370.0f), TLObject.FLAG_30));
        measureChildWithMargins(f65Var.n1, 0, 0, View.MeasureSpec.makeMeasureSpec(gl.L(64.0f), TLObject.FLAG_30), 0);
    }
}
