// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class au7 extends View {
    public int a;
    public float b;
    public final /* synthetic */ bu7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au7(bu7 bu7Var, Context context) {
        super(context);
        this.c = bu7Var;
        setPadding(gm.L(4.0f), gm.L(4.0f), gm.L(4.0f), gm.L(4.0f));
        setLayoutParams(new g69(-2, 0));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        bu7 bu7Var = this.c;
        Paint paint = bu7Var.g3;
        bu7Var.f3.setColor(this.a);
        float min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f;
        if (this.b != 0.0f) {
            min -= (paint.getStrokeWidth() + gm.L(3.0f)) * this.b;
        }
        float width = ((getWidth() / 2.0f) + getPaddingLeft()) - getPaddingRight();
        float height = ((getHeight() / 2.0f) + getPaddingTop()) - getPaddingBottom();
        bu7.A1(width, height, min, this.a, canvas);
        if (this.b != 0.0f) {
            paint.setColor(this.a);
            paint.setAlpha(nm7.d4);
            canvas.drawCircle(width, height, (Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) - gm.L(2.0f), paint);
        }
    }
}
