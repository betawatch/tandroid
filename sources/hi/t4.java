package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class t4 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ u9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(u9 u9Var, Context context, int i7) {
        super(context);
        this.a = i7;
        switch (i7) {
            case 1:
                this.b = u9Var;
                super(context);
                break;
            default:
                this.b = u9Var;
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
                u9 u9Var = this.b;
                Paint paint = u9Var.b1;
                tg.e1 e1Var = u9Var.V0;
                paint.setAlpha((int) ((1.0f - u9Var.d1) * e1Var.getAlpha() * 20.0f));
                RectF rectF = org.telegram.messenger.g0.P;
                e1Var.b(rectF);
                float translationY = e1Var.getTranslationY() + u9Var.D0.getTranslationY() + e1Var.getTop() + r4.getTop();
                float f10 = rectF.left;
                tg.j1 j1Var = u9Var.W0;
                rectF.set(org.telegram.messenger.g0.T1(f10, j1Var.getLeft(), u9Var.d1), org.telegram.messenger.g0.T1(rectF.top + translationY, j1Var.getTop() - j1Var.getTranslationY(), u9Var.d1), org.telegram.messenger.g0.T1(rectF.right, j1Var.getRight(), u9Var.d1), org.telegram.messenger.g0.T1(translationY + rectF.bottom, j1Var.getBottom() - j1Var.getTranslationY(), u9Var.d1));
                float L = org.telegram.messenger.g0.L(org.telegram.messenger.g0.W1(u9Var.d1, 32, 16));
                Paint paint2 = u9Var.c1;
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (alpha * u9Var.d1));
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
                    u9 u9Var = this.b;
                    if (u9Var.e1) {
                        u9Var.M0(false);
                        return true;
                    }
                }
                return super.onTouchEvent(motionEvent);
            default:
                return false;
        }
    }
}
