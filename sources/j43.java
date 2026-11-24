// default package

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class j43 extends ViewOutlineProvider {
    public final Rect a = new Rect();
    public final RectF b = new RectF();
    public final RectF c = new RectF();
    public final /* synthetic */ m43 d;

    public j43(m43 m43Var) {
        this.d = m43Var;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        m43 m43Var = this.d;
        float R1 = gl.R1(m43Var.e, gl.L(8.0f), m43Var.j);
        float measuredWidth = view.getMeasuredWidth();
        float measuredHeight = view.getMeasuredHeight();
        RectF rectF = this.b;
        rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        RectF rectF2 = m43Var.f;
        float f = m43Var.j;
        RectF rectF3 = this.c;
        gl.X1(rectF2, rectF, f, rectF3);
        Rect rect = this.a;
        rectF3.round(rect);
        outline.setRoundRect(rect, R1);
    }
}
