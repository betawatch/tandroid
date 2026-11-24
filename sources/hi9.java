// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class hi9 extends ViewGroup {
    public final int a;
    public final /* synthetic */ ii9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi9(ii9 ii9Var, Context context) {
        super(context);
        this.b = ii9Var;
        this.a = gl.L(16.0f);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ki9 ki9Var = this.b.w;
        int measuredWidth = ki9Var.getMeasuredWidth();
        int measuredHeight = ki9Var.getMeasuredHeight();
        int i5 = this.a;
        ki9Var.layout(-i5, 0, measuredWidth - i5, measuredHeight);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.a;
        int max = Math.max(0, size + i3);
        ki9 ki9Var = this.b.w;
        ki9Var.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), i2);
        int measuredWidth = ki9Var.getMeasuredWidth();
        setMeasuredDimension(Math.max(0, measuredWidth - i3), ki9Var.getMeasuredHeight());
    }
}
