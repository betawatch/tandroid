package cg;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import i7.f6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.jr;
import org.telegram.ui.sa0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class a1 extends FrameLayout implements y0 {
    public final c6 a;
    public final ArrayList b;
    public final z0 c;
    public final z0 d;
    public final z0 e;
    public final boolean f;

    public a1(Context context, c6 c6Var) {
        super(context);
        this.b = new ArrayList();
        this.a = c6Var;
        for (sa0 sa0Var : sa0.values()) {
            if (sa0Var.e) {
                this.b.add(sa0Var);
            }
            if (this.b.size() == 3) {
                break;
            }
        }
        if (this.b.size() < 3) {
            FileLog.e(new IllegalArgumentException("There should be at least 3 premium icons!"));
            this.f = true;
        } else {
            this.c = a(context, 0);
            this.d = a(context, 1);
            this.e = a(context, 2);
            setClipChildren(false);
        }
    }

    public final z0 a(Context context, int i10) {
        sa0 sa0Var = (sa0) this.b.get(i10);
        z0 z0Var = new z0(context);
        r2 r2Var = new r2(20);
        z0Var.e = r2Var;
        Paint paint = new Paint(1);
        z0Var.f = paint;
        r2Var.r = 12;
        r2Var.s = 8;
        r2Var.t = 6;
        if (i10 == 1) {
            r2Var.N = 1001;
        }
        if (i10 == 0) {
            r2Var.N = 1002;
        }
        r2Var.O = this.a;
        r2Var.P = g6.Zj;
        r2Var.c();
        paint.setColor(-1);
        z0Var.setLayoutParams(f6.d(-2, -2.0f, 17, 0.0f, 52.0f, 0.0f, 0.0f));
        z0Var.setForeground(sa0Var.c);
        z0Var.setBackgroundResource(sa0Var.b);
        z0Var.setPadding(AndroidUtilities.dp(8.0f));
        z0Var.setBackgroundOuterPadding(AndroidUtilities.dp(32.0f));
        addView(z0Var);
        return z0Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f) {
            return;
        }
        int min = Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        int dp = AndroidUtilities.dp(76.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c.getLayoutParams();
        layoutParams.height = dp;
        layoutParams.width = dp;
        float f9 = dp;
        layoutParams.bottomMargin = (int) ((min * 0.1f) + f9);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams2.height = dp;
        layoutParams2.width = dp;
        int i12 = (int) (f9 * 0.95f);
        layoutParams2.rightMargin = i12;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.e.getLayoutParams();
        layoutParams3.height = dp;
        layoutParams3.width = dp;
        layoutParams3.leftMargin = i12;
    }

    @Override // cg.y0
    public void setOffset(float f9) {
        if (this.f) {
            return;
        }
        float abs = Math.abs(f9 / getMeasuredWidth());
        float interpolation = jr.i.getInterpolation(abs);
        int right = getRight();
        z0 z0Var = this.e;
        z0Var.setTranslationX(((z0Var.getWidth() * 1.5f) + (right - z0Var.getRight()) + AndroidUtilities.dp(32.0f)) * interpolation);
        z0Var.setTranslationY(AndroidUtilities.dp(16.0f) * interpolation);
        float clamp = Utilities.clamp(AndroidUtilities.lerp(1.0f, 1.5f, interpolation), 1.0f, 0.0f);
        z0Var.setScaleX(clamp);
        z0Var.setScaleY(clamp);
        int top = getTop();
        z0 z0Var2 = this.c;
        z0Var2.setTranslationY((((top - z0Var2.getTop()) - (z0Var2.getHeight() * 1.8f)) - AndroidUtilities.dp(32.0f)) * abs);
        z0Var2.setTranslationX(AndroidUtilities.dp(16.0f) * abs);
        float clamp2 = Utilities.clamp(AndroidUtilities.lerp(1.0f, 1.8f, abs), 1.0f, 0.0f);
        z0Var2.setScaleX(clamp2);
        z0Var2.setScaleY(clamp2);
        float interpolation2 = jr.g.getInterpolation(abs);
        int left = getLeft();
        z0 z0Var3 = this.d;
        z0Var3.setTranslationX((((left - z0Var3.getLeft()) - (z0Var3.getWidth() * 2.5f)) + AndroidUtilities.dp(32.0f)) * interpolation2);
        z0Var3.setTranslationY(((z0Var3.getHeight() * 2.5f) + (getBottom() - z0Var3.getBottom()) + AndroidUtilities.dp(32.0f)) * interpolation2);
        float clamp3 = Utilities.clamp(AndroidUtilities.lerp(1.0f, 2.5f, abs), 1.0f, 0.0f);
        z0Var3.setScaleX(clamp3);
        z0Var3.setScaleY(clamp3);
        float f10 = abs < 0.4f ? abs / 0.4f : 1.0f;
        z0Var.h = f10;
        z0Var2.h = f10;
        z0Var3.h = f10;
    }
}
