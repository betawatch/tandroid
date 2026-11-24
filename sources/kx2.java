// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class kx2 extends View {
    public final jx2 a;

    public kx2(Context context, wjb wjbVar) {
        super(context);
        setVisibility(8);
        jx2 jx2Var = new jx2(this, true, wjbVar);
        this.a = jx2Var;
        jx2Var.F = true;
    }

    public float getEnterProgress() {
        int i;
        jx2 jx2Var = this.a;
        float f = jx2Var.l;
        return (f == 1.0f || !((i = jx2Var.c) == 0 || i == 1)) ? jx2Var.h == 0 ? 0.0f : 1.0f : i == 0 ? f : 1.0f - f;
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
