// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class ht7 extends FrameLayout {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x6b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht7(x6b x6bVar, Context context, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 1:
                this.b = x6bVar;
                super(context);
                break;
            default:
                this.b = x6bVar;
                setWillNotDraw(false);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                if (this.b.g2) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                super.onDraw(canvas);
                x6b x6bVar = this.b;
                Paint paint = x6bVar.h1;
                hs7 hs7Var = x6bVar.b1;
                paint.setAlpha((int) ((1.0f - x6bVar.j1) * hs7Var.getAlpha() * 20.0f));
                RectF rectF = gl.P;
                hs7Var.b(rectF);
                float translationY = hs7Var.getTranslationY() + x6bVar.J0.getTranslationY() + hs7Var.getTop() + r3.getTop();
                float f = rectF.left;
                ss7 ss7Var = x6bVar.c1;
                rectF.set(gl.R1(f, ss7Var.getLeft(), x6bVar.j1), gl.R1(rectF.top + translationY, ss7Var.getTop() - ss7Var.getTranslationY(), x6bVar.j1), gl.R1(rectF.right, ss7Var.getRight(), x6bVar.j1), gl.R1(translationY + rectF.bottom, ss7Var.getBottom() - ss7Var.getTranslationY(), x6bVar.j1));
                float L = gl.L(gl.U1(x6bVar.j1, 32, 16));
                Paint paint2 = x6bVar.i1;
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (alpha * x6bVar.j1));
                canvas.drawRoundRect(rectF, L, L, paint2);
                paint2.setAlpha(alpha);
                canvas.drawRoundRect(rectF, L, L, paint);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                if (motionEvent.getActionMasked() == 0) {
                    x6b x6bVar = this.b;
                    if (x6bVar.k1) {
                        x6bVar.P0(false);
                        return true;
                    }
                }
                return super.onTouchEvent(motionEvent);
            default:
                return false;
        }
    }
}
