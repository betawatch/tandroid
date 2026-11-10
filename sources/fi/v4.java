package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class v4 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ x9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(x9 x9Var, Context context, int i7) {
        super(context);
        this.a = i7;
        switch (i7) {
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
                if (this.b.V1) {
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
                Paint paint = x9Var.a1;
                tg.e1 e1Var = x9Var.U0;
                paint.setAlpha((int) ((1.0f - x9Var.c1) * e1Var.getAlpha() * 20.0f));
                RectF rectF = org.telegram.messenger.g0.P;
                e1Var.b(rectF);
                float translationY = e1Var.getTranslationY() + x9Var.C0.getTranslationY() + e1Var.getTop() + r4.getTop();
                float f10 = rectF.left;
                tg.j1 j1Var = x9Var.V0;
                rectF.set(org.telegram.messenger.g0.T1(f10, j1Var.getLeft(), x9Var.c1), org.telegram.messenger.g0.T1(rectF.top + translationY, j1Var.getTop() - j1Var.getTranslationY(), x9Var.c1), org.telegram.messenger.g0.T1(rectF.right, j1Var.getRight(), x9Var.c1), org.telegram.messenger.g0.T1(translationY + rectF.bottom, j1Var.getBottom() - j1Var.getTranslationY(), x9Var.c1));
                float L = org.telegram.messenger.g0.L(org.telegram.messenger.g0.W1(x9Var.c1, 32, 16));
                Paint paint2 = x9Var.b1;
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (alpha * x9Var.c1));
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
                    if (x9Var.d1) {
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
