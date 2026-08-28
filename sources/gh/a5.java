package gh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.s10;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a5 extends FrameLayout {
    public final q1 a;
    public final z4 b;
    public final z4 c;
    public final z4 d;
    public boolean e;
    public final s10 f;
    public final RectF h;

    public a5(Context context, org.telegram.ui.ActionBar.b6 b6Var, q1 q1Var) {
        super(context);
        this.f = new s10();
        this.h = new RectF();
        this.a = q1Var;
        z4 z4Var = new z4(context, b6Var);
        this.b = z4Var;
        z4 z4Var2 = new z4(context, b6Var);
        this.c = z4Var2;
        z4 z4Var3 = new z4(context, b6Var);
        this.d = z4Var3;
        addView(z4Var, g7.e6.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(z4Var2, g7.e6.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(z4Var3, g7.e6.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
    }

    public final void a(q4 q4Var, float f10, boolean z10, q4 q4Var2, float f11, boolean z11, q4 q4Var3, float f12, boolean z12) {
        q1 q1Var = this.a;
        z4 z4Var = this.b;
        if (q4Var != null) {
            if (z10) {
                f10 = Math.max(0.5f, f10);
            }
            z4Var.setVisibility(0);
            z4Var.e(q4Var.a, q4Var.b, q1Var);
            z4Var.setTranslationY(AndroidUtilities.dp(36.0f) * ((f10 - 0.5f) / 1.5f));
        } else {
            z4Var.setVisibility(4);
        }
        z4 z4Var2 = this.c;
        if (q4Var2 != null) {
            float f13 = f11;
            if (z11) {
                f13 = Math.max(0.5f, f13);
            }
            float f14 = (f13 - 0.5f) / 1.5f;
            z4Var2.setVisibility(0);
            z4Var2.e(q4Var2.a, q4Var2.b, q1Var);
            z4Var2.setTranslationY(AndroidUtilities.dp(36.0f) * f14);
            if (z11 && f14 <= 0.0f && !this.e) {
                this.e = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new bg.b(z4Var2, 5));
                ofFloat.setDuration(180L);
                ofFloat.start();
            }
        } else {
            z4Var2.setVisibility(4);
        }
        z4 z4Var3 = this.d;
        if (q4Var3 == null) {
            z4Var3.setVisibility(4);
            return;
        }
        float f15 = f12;
        if (z12) {
            f15 = Math.max(0.5f, f15);
        }
        z4Var3.setVisibility(0);
        z4Var3.e(q4Var3.a, q4Var3.b, q1Var);
        z4Var3.setTranslationY(AndroidUtilities.dp(36.0f) * ((f15 - 0.5f) / 1.5f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float width = getWidth();
        float dp = AndroidUtilities.dp(8.0f);
        RectF rectF = this.h;
        rectF.set(0.0f, 0.0f, width, dp);
        s10 s10Var = this.f;
        s10Var.b(canvas, rectF, 1, 1.0f);
        rectF.set(0.0f, getHeight() - AndroidUtilities.dp(8.0f), getWidth(), getHeight());
        s10Var.b(canvas, rectF, 3, 1.0f);
        canvas.restore();
        canvas.restore();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(37.66f), TLObject.FLAG_30));
    }
}
