// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ey2 extends View {
    public final dy2 a;

    public ey2(Context context, vnb vnbVar) {
        super(context);
        setVisibility(8);
        dy2 dy2Var = new dy2(this, true, vnbVar);
        this.a = dy2Var;
        dy2Var.F = true;
    }

    public float getEnterProgress() {
        int i;
        dy2 dy2Var = this.a;
        float f = dy2Var.l;
        return (f == 1.0f || !((i = dy2Var.c) == 0 || i == 1)) ? dy2Var.h == 0 ? 0.0f : 1.0f : i == 0 ? f : 1.0f - f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.a.a(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.a.d(getMeasuredHeight(), getMeasuredWidth());
    }

    public void setGravity(int i) {
        this.a.z = i;
    }

    public void setReverse(boolean z) {
        this.a.C = z;
    }
}
