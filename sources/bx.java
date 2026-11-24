// default package

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.o;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class bx extends FrameLayout {
    public final av9 a;
    public final byte b;
    public final byte c;
    public int d;
    public final TextPaint e;
    public final /* synthetic */ o f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx(o oVar, Context context) {
        super(context);
        this.f = oVar;
        this.b = (byte) 12;
        this.c = (byte) 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        textPaint.setTextSize(gl.L(16.0f));
        av9 av9Var = new av9(null, context, false);
        this.a = av9Var;
        av9Var.setReportChanges(true);
        av9Var.setSeparatorsCount(19);
        av9Var.setDelegate(new qx4(this));
        addView(av9Var, nme.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int w0 = bkb.w0(null, bkb.H6, false);
        TextPaint textPaint = this.e;
        textPaint.setColor(w0);
        canvas.drawText(String.valueOf(gba.W0), getMeasuredWidth() - gl.L(39.0f), gl.L(28.0f), textPaint);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        if (this.d != size) {
            int i3 = gba.W0;
            byte b = this.b;
            this.a.setProgress((i3 - b) / (this.c - b));
            this.d = size;
        }
    }
}
