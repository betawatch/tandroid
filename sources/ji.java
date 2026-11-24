// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ji extends LinearLayout {
    public final /* synthetic */ byte a = 1;
    public boolean b;
    public final /* synthetic */ hn7 c;
    public final Object d;
    public final /* synthetic */ hn7 e;
    public final /* synthetic */ hn7 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji(Context context, fj fjVar, hn7 hn7Var, wm0 wm0Var, xm0 xm0Var) {
        super(context);
        this.c = hn7Var;
        this.e = wm0Var;
        this.f = xm0Var;
        this.b = false;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        setWillNotDraw(false);
        de9.p(textPaint, gl.L(20.0f));
        textPaint.setColor(fjVar.a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.onDraw(canvas);
                canvas.drawText(":", ((wm0) this.e).getRight() - gl.L(12.0f), (getHeight() / 2.0f) - gl.L(11.0f), (TextPaint) this.d);
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
        hn7 hn7Var = this.c;
        hn7 hn7Var2 = this.e;
        hn7 hn7Var3 = this.f;
        switch (b) {
            case 0:
                hn7 hn7Var4 = (hn7) this.d;
                this.b = true;
                Point point = gl.q;
                i3 = point.x > point.y ? 3 : 5;
                hn7Var.setItemCount(i3);
                hn7Var4.setItemCount(i3);
                hn7Var2.setItemCount(i3);
                hn7Var3.setItemCount(i3);
                hn7Var.getLayoutParams().height = gl.L(42.0f) * i3;
                hn7Var4.getLayoutParams().height = gl.L(42.0f) * i3;
                hn7Var2.getLayoutParams().height = gl.L(42.0f) * i3;
                hn7Var3.getLayoutParams().height = gl.L(42.0f) * i3;
                this.b = false;
                super.onMeasure(i, i2);
                break;
            default:
                xm0 xm0Var = (xm0) hn7Var3;
                wm0 wm0Var = (wm0) hn7Var2;
                this.b = true;
                Point point2 = gl.q;
                i3 = point2.x > point2.y ? 3 : 5;
                hn7Var.setItemCount(i3);
                wm0Var.setItemCount(i3);
                xm0Var.setItemCount(i3);
                hn7Var.getLayoutParams().height = gl.L(42.0f) * i3;
                wm0Var.getLayoutParams().height = gl.L(42.0f) * i3;
                xm0Var.getLayoutParams().height = gl.L(42.0f) * i3;
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
    public ji(Context context, hn7 hn7Var, hn7 hn7Var2, hn7 hn7Var3, hn7 hn7Var4) {
        super(context);
        this.c = hn7Var;
        this.d = hn7Var2;
        this.e = hn7Var3;
        this.f = hn7Var4;
        this.b = false;
    }
}
