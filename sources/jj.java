// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jj extends LinearLayout {
    public final /* synthetic */ byte a = 1;
    public boolean b;
    public final /* synthetic */ lp7 c;
    public final Object d;
    public final /* synthetic */ lp7 e;
    public final /* synthetic */ lp7 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj(Context context, fk fkVar, lp7 lp7Var, wn0 wn0Var, xn0 xn0Var) {
        super(context);
        this.c = lp7Var;
        this.e = wn0Var;
        this.f = xn0Var;
        this.b = false;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        setWillNotDraw(false);
        hg9.o(textPaint, gm.L(20.0f));
        textPaint.setColor(fkVar.a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.onDraw(canvas);
                canvas.drawText(":", ((wn0) this.e).getRight() - gm.L(12.0f), (getHeight() / 2.0f) - gm.L(11.0f), (TextPaint) this.d);
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
        lp7 lp7Var = this.c;
        lp7 lp7Var2 = this.e;
        lp7 lp7Var3 = this.f;
        switch (b) {
            case 0:
                lp7 lp7Var4 = (lp7) this.d;
                this.b = true;
                Point point = gm.q;
                i3 = point.x > point.y ? 3 : 5;
                lp7Var.setItemCount(i3);
                lp7Var4.setItemCount(i3);
                lp7Var2.setItemCount(i3);
                lp7Var3.setItemCount(i3);
                lp7Var.getLayoutParams().height = gm.L(42.0f) * i3;
                lp7Var4.getLayoutParams().height = gm.L(42.0f) * i3;
                lp7Var2.getLayoutParams().height = gm.L(42.0f) * i3;
                lp7Var3.getLayoutParams().height = gm.L(42.0f) * i3;
                this.b = false;
                super.onMeasure(i, i2);
                break;
            default:
                xn0 xn0Var = (xn0) lp7Var3;
                wn0 wn0Var = (wn0) lp7Var2;
                this.b = true;
                Point point2 = gm.q;
                i3 = point2.x > point2.y ? 3 : 5;
                lp7Var.setItemCount(i3);
                wn0Var.setItemCount(i3);
                xn0Var.setItemCount(i3);
                lp7Var.getLayoutParams().height = gm.L(42.0f) * i3;
                wn0Var.getLayoutParams().height = gm.L(42.0f) * i3;
                xn0Var.getLayoutParams().height = gm.L(42.0f) * i3;
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
    public jj(Context context, lp7 lp7Var, lp7 lp7Var2, lp7 lp7Var3, lp7 lp7Var4) {
        super(context);
        this.c = lp7Var;
        this.d = lp7Var2;
        this.e = lp7Var3;
        this.f = lp7Var4;
        this.b = false;
    }
}
