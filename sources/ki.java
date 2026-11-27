// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ki extends LinearLayout {
    public final /* synthetic */ byte a = 1;
    public boolean b;
    public final /* synthetic */ hq7 c;
    public final Object d;
    public final /* synthetic */ hq7 e;
    public final /* synthetic */ hq7 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ki(Context context, gj gjVar, hq7 hq7Var, wm0 wm0Var, xm0 xm0Var) {
        super(context);
        this.c = hq7Var;
        this.e = wm0Var;
        this.f = xm0Var;
        this.b = false;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        setWillNotDraw(false);
        uh9.p(textPaint, hl.L(20.0f));
        textPaint.setColor(gjVar.a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.onDraw(canvas);
                canvas.drawText(":", ((wm0) this.e).getRight() - hl.L(12.0f), (getHeight() / 2.0f) - hl.L(11.0f), (TextPaint) this.d);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        byte b = this.a;
        hq7 hq7Var = this.c;
        hq7 hq7Var2 = this.e;
        hq7 hq7Var3 = this.f;
        switch (b) {
            case 0:
                hq7 hq7Var4 = (hq7) this.d;
                this.b = true;
                Point point = hl.q;
                i3 = point.x > point.y ? 3 : 5;
                hq7Var.setItemCount(i3);
                hq7Var4.setItemCount(i3);
                hq7Var2.setItemCount(i3);
                hq7Var3.setItemCount(i3);
                hq7Var.getLayoutParams().height = hl.L(42.0f) * i3;
                hq7Var4.getLayoutParams().height = hl.L(42.0f) * i3;
                hq7Var2.getLayoutParams().height = hl.L(42.0f) * i3;
                hq7Var3.getLayoutParams().height = hl.L(42.0f) * i3;
                this.b = false;
                super.onMeasure(i, i2);
                break;
            default:
                xm0 xm0Var = (xm0) hq7Var3;
                wm0 wm0Var = (wm0) hq7Var2;
                this.b = true;
                Point point2 = hl.q;
                i3 = point2.x > point2.y ? 3 : 5;
                hq7Var.setItemCount(i3);
                wm0Var.setItemCount(i3);
                xm0Var.setItemCount(i3);
                hq7Var.getLayoutParams().height = hl.L(42.0f) * i3;
                wm0Var.getLayoutParams().height = hl.L(42.0f) * i3;
                xm0Var.getLayoutParams().height = hl.L(42.0f) * i3;
                this.b = false;
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        switch (this.a) {
            case 0:
                if (!this.b) {
                    super.requestLayout();
                    break;
                }
                break;
            default:
                if (!this.b) {
                    super.requestLayout();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ki(Context context, hq7 hq7Var, hq7 hq7Var2, hq7 hq7Var3, hq7 hq7Var4) {
        super(context);
        this.c = hq7Var;
        this.d = hq7Var2;
        this.e = hq7Var3;
        this.f = hq7Var4;
        this.b = false;
    }
}
