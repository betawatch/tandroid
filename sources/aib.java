// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class aib extends FrameLayout {
    public final ImageView a;
    public final jia b;
    public final wjb c;
    public boolean d;

    public aib(Context context, wjb wjbVar) {
        super(context);
        this.c = wjbVar;
        jia jiaVar = new jia(context);
        this.b = jiaVar;
        zkb.W(jiaVar, bkb.i5, wjbVar);
        jiaVar.setTextSize(16);
        jiaVar.setGravity(19);
        addView(jiaVar, nme.d(-1, 48.0f, 16, 22.0f, 0.0f, 56.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        zkb.s(imageView, bkb.B6, wjbVar, PorterDuff.Mode.SRC_IN);
        addView(imageView, nme.d(24, 24.0f, 8388629, 0.0f, 0.0f, 16.0f, 0.0f));
        int i = bkb.g5;
        int i2 = sjb.a;
        int w0 = bkb.w0(null, i, false);
        setBackground(sjb.d(w0, sjb.b(w0), new float[0]));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            wjb wjbVar = this.c;
            Paint d = wjbVar != null ? wjbVar.d("paintDivider") : null;
            if (d == null) {
                d = bkb.j0;
            }
            canvas.drawLine(gl.L(22.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, d);
        }
    }

    public void setDivider(boolean z) {
        this.d = z;
    }
}
