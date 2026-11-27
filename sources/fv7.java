// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class fv7 extends View {
    public int a;
    public float b;
    public final /* synthetic */ gv7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv7(gv7 gv7Var, Context context) {
        super(context);
        this.c = gv7Var;
        setPadding(hl.L(4.0f), hl.L(4.0f), hl.L(4.0f), hl.L(4.0f));
        setLayoutParams(new r79(-2, 0));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        gv7 gv7Var = this.c;
        Paint paint = gv7Var.g3;
        gv7Var.f3.setColor(this.a);
        float min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f;
        if (this.b != 0.0f) {
            min -= (paint.getStrokeWidth() + hl.L(3.0f)) * this.b;
        }
        float width = ((getWidth() / 2.0f) + getPaddingLeft()) - getPaddingRight();
        float height = ((getHeight() / 2.0f) + getPaddingTop()) - getPaddingBottom();
        gv7.B1(width, height, min, this.a, canvas);
        if (this.b != 0.0f) {
            paint.setColor(this.a);
            paint.setAlpha(jn7.d4);
            canvas.drawCircle(width, height, (Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) - hl.L(2.0f), paint);
        }
    }
}
