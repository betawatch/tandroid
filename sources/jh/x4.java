package jh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.u10;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class x4 extends FrameLayout {
    public final o1 a;
    public final w4 b;
    public final w4 c;
    public final w4 d;
    public boolean e;
    public final u10 f;
    public final RectF h;

    public x4(Context context, org.telegram.ui.ActionBar.c6 c6Var, o1 o1Var) {
        super(context);
        this.f = new u10();
        this.h = new RectF();
        this.a = o1Var;
        w4 w4Var = new w4(context, c6Var);
        this.b = w4Var;
        w4 w4Var2 = new w4(context, c6Var);
        this.c = w4Var2;
        w4 w4Var3 = new w4(context, c6Var);
        this.d = w4Var3;
        addView(w4Var, i7.f6.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(w4Var2, i7.f6.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(w4Var3, i7.f6.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
    }

    public final void a(n4 n4Var, float f9, boolean z10, n4 n4Var2, float f10, boolean z11, n4 n4Var3, float f11, boolean z12) {
        o1 o1Var = this.a;
        w4 w4Var = this.b;
        if (n4Var != null) {
            if (z10) {
                f9 = Math.max(0.5f, f9);
            }
            w4Var.setVisibility(0);
            w4Var.e(n4Var.a, n4Var.b, o1Var);
            w4Var.setTranslationY(AndroidUtilities.dp(36.0f) * ((f9 - 0.5f) / 1.5f));
        } else {
            w4Var.setVisibility(4);
        }
        w4 w4Var2 = this.c;
        if (n4Var2 != null) {
            float f12 = f10;
            if (z11) {
                f12 = Math.max(0.5f, f12);
            }
            float f13 = (f12 - 0.5f) / 1.5f;
            w4Var2.setVisibility(0);
            w4Var2.e(n4Var2.a, n4Var2.b, o1Var);
            w4Var2.setTranslationY(AndroidUtilities.dp(36.0f) * f13);
            if (z11 && f13 <= 0.0f && !this.e) {
                this.e = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new bg.q1(w4Var2, 14));
                ofFloat.setDuration(180L);
                ofFloat.start();
            }
        } else {
            w4Var2.setVisibility(4);
        }
        w4 w4Var3 = this.d;
        if (n4Var3 == null) {
            w4Var3.setVisibility(4);
            return;
        }
        float f14 = f11;
        if (z12) {
            f14 = Math.max(0.5f, f14);
        }
        w4Var3.setVisibility(0);
        w4Var3.e(n4Var3.a, n4Var3.b, o1Var);
        w4Var3.setTranslationY(AndroidUtilities.dp(36.0f) * ((f14 - 0.5f) / 1.5f));
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
        u10 u10Var = this.f;
        u10Var.b(canvas, rectF, 1, 1.0f);
        rectF.set(0.0f, getHeight() - AndroidUtilities.dp(8.0f), getWidth(), getHeight());
        u10Var.b(canvas, rectF, 3, 1.0f);
        canvas.restore();
        canvas.restore();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(37.66f), TLObject.FLAG_30));
    }
}
