// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ocb extends hn7 {
    public final /* synthetic */ pcb z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ocb(pcb pcbVar, Context context) {
        super(13, null, context);
        this.z0 = pcbVar;
    }

    @Override // hn7, android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        int w0 = bkb.w0(null, bkb.i5, false);
        pcb pcbVar = this.z0;
        Paint paint = pcbVar.e;
        if (w0 != pcbVar.a) {
            pcbVar.a = w0;
            setTextColor(w0);
        }
        super.onDraw(canvas);
        float L = gl.L(31.0f);
        paint.setColor(bkb.w0(null, bkb.g7, false));
        canvas.drawLine(gl.L(2.0f), L, getMeasuredWidth() - gl.L(2.0f), L, paint);
        float measuredHeight = getMeasuredHeight() - gl.L(31.0f);
        canvas.drawLine(gl.L(2.0f), measuredHeight, getMeasuredWidth() - gl.L(2.0f), measuredHeight, paint);
    }
}
