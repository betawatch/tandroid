package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class c5 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ pa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(pa paVar, Context context, int i7) {
        super(context);
        this.a = i7;
        switch (i7) {
            case 1:
                this.b = paVar;
                super(context);
                break;
            default:
                this.b = paVar;
                setWillNotDraw(false);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                if (this.b.a2) {
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
                pa paVar = this.b;
                Paint paint = paVar.b1;
                tg.j1 j1Var = paVar.V0;
                paint.setAlpha((int) ((1.0f - paVar.d1) * j1Var.getAlpha() * 20.0f));
                RectF rectF = org.telegram.messenger.g0.P;
                j1Var.b(rectF);
                float translationY = j1Var.getTranslationY() + paVar.D0.getTranslationY() + j1Var.getTop() + r4.getTop();
                float f10 = rectF.left;
                tg.o1 o1Var = paVar.W0;
                rectF.set(org.telegram.messenger.g0.T1(f10, o1Var.getLeft(), paVar.d1), org.telegram.messenger.g0.T1(rectF.top + translationY, o1Var.getTop() - o1Var.getTranslationY(), paVar.d1), org.telegram.messenger.g0.T1(rectF.right, o1Var.getRight(), paVar.d1), org.telegram.messenger.g0.T1(translationY + rectF.bottom, o1Var.getBottom() - o1Var.getTranslationY(), paVar.d1));
                float L = org.telegram.messenger.g0.L(org.telegram.messenger.g0.W1(paVar.d1, 32, 16));
                Paint paint2 = paVar.c1;
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (alpha * paVar.d1));
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
                    pa paVar = this.b;
                    if (paVar.e1) {
                        paVar.P0(false);
                        return true;
                    }
                }
                return super.onTouchEvent(motionEvent);
            default:
                return false;
        }
    }
}
