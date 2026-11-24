// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class iv7 extends FrameLayout {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z8b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv7(z8b z8bVar, Context context, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 1:
                this.b = z8bVar;
                super(context);
                break;
            default:
                this.b = z8bVar;
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
                z8b z8bVar = this.b;
                Paint paint = z8bVar.h1;
                iu7 iu7Var = z8bVar.b1;
                paint.setAlpha((int) ((1.0f - z8bVar.j1) * iu7Var.getAlpha() * 20.0f));
                RectF rectF = gm.P;
                iu7Var.b(rectF);
                float translationY = iu7Var.getTranslationY() + z8bVar.J0.getTranslationY() + iu7Var.getTop() + r3.getTop();
                float f = rectF.left;
                tu7 tu7Var = z8bVar.c1;
                rectF.set(gm.R1(f, tu7Var.getLeft(), z8bVar.j1), gm.R1(rectF.top + translationY, tu7Var.getTop() - tu7Var.getTranslationY(), z8bVar.j1), gm.R1(rectF.right, tu7Var.getRight(), z8bVar.j1), gm.R1(translationY + rectF.bottom, tu7Var.getBottom() - tu7Var.getTranslationY(), z8bVar.j1));
                float L = gm.L(gm.U1(z8bVar.j1, 32, 16));
                Paint paint2 = z8bVar.i1;
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (alpha * z8bVar.j1));
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
                    z8b z8bVar = this.b;
                    if (z8bVar.k1) {
                        z8bVar.P0(false);
                        return true;
                    }
                }
                return super.onTouchEvent(motionEvent);
            default:
                return false;
        }
    }
}
