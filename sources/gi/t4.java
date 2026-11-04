package gi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class t4 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ x9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(x9 x9Var, Context context, int i3) {
        super(context);
        this.a = i3;
        switch (i3) {
            case 1:
                this.b = x9Var;
                super(context);
                break;
            default:
                this.b = x9Var;
                setWillNotDraw(false);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                if (this.b.W1) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                super.onDraw(canvas);
                x9 x9Var = this.b;
                Paint paint = x9Var.b1;
                ug.d1 d1Var = x9Var.V0;
                paint.setAlpha((int) ((1.0f - x9Var.d1) * d1Var.getAlpha() * 20.0f));
                RectF rectF = org.telegram.messenger.g0.P;
                d1Var.b(rectF);
                float translationY = d1Var.getTranslationY() + x9Var.D0.getTranslationY() + d1Var.getTop() + r4.getTop();
                float f10 = rectF.left;
                ug.i1 i1Var = x9Var.W0;
                rectF.set(org.telegram.messenger.g0.T1(f10, i1Var.getLeft(), x9Var.d1), org.telegram.messenger.g0.T1(rectF.top + translationY, i1Var.getTop() - i1Var.getTranslationY(), x9Var.d1), org.telegram.messenger.g0.T1(rectF.right, i1Var.getRight(), x9Var.d1), org.telegram.messenger.g0.T1(translationY + rectF.bottom, i1Var.getBottom() - i1Var.getTranslationY(), x9Var.d1));
                float L = org.telegram.messenger.g0.L(org.telegram.messenger.g0.W1(x9Var.d1, 32, 16));
                Paint paint2 = x9Var.c1;
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (alpha * x9Var.d1));
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
                    x9 x9Var = this.b;
                    if (x9Var.e1) {
                        x9Var.M0(false);
                        return true;
                    }
                }
                return super.onTouchEvent(motionEvent);
            default:
                return false;
        }
    }
}
