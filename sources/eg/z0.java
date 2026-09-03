package eg;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.mr;
import org.telegram.ui.cb0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class z0 extends FrameLayout implements x0 {
    public final f6 a;
    public final ArrayList b;
    public final y0 c;
    public final y0 d;
    public final y0 e;
    public final boolean f;

    public z0(Context context, f6 f6Var) {
        super(context);
        this.b = new ArrayList();
        this.a = f6Var;
        for (cb0 cb0Var : cb0.values()) {
            if (cb0Var.e) {
                this.b.add(cb0Var);
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

    public final y0 a(Context context, int i10) {
        cb0 cb0Var = (cb0) this.b.get(i10);
        y0 y0Var = new y0(context);
        p2 p2Var = new p2(20);
        y0Var.e = p2Var;
        Paint paint = new Paint(1);
        y0Var.f = paint;
        p2Var.r = 12;
        p2Var.s = 8;
        p2Var.t = 6;
        if (i10 == 1) {
            p2Var.N = 1001;
        }
        if (i10 == 0) {
            p2Var.N = 1002;
        }
        p2Var.O = this.a;
        p2Var.P = j6.Zj;
        p2Var.c();
        paint.setColor(-1);
        y0Var.setLayoutParams(b6.d(-2, -2.0f, 17, 0.0f, 52.0f, 0.0f, 0.0f));
        y0Var.setForeground(cb0Var.c);
        y0Var.setBackgroundResource(cb0Var.b);
        y0Var.setPadding(AndroidUtilities.dp(8.0f));
        y0Var.setBackgroundOuterPadding(AndroidUtilities.dp(32.0f));
        addView(y0Var);
        return y0Var;
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
        float f10 = dp;
        layoutParams.bottomMargin = (int) ((min * 0.1f) + f10);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams2.height = dp;
        layoutParams2.width = dp;
        int i12 = (int) (f10 * 0.95f);
        layoutParams2.rightMargin = i12;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.e.getLayoutParams();
        layoutParams3.height = dp;
        layoutParams3.width = dp;
        layoutParams3.leftMargin = i12;
    }

    @Override // eg.x0
    public void setOffset(float f10) {
        if (this.f) {
            return;
        }
        float abs = Math.abs(f10 / getMeasuredWidth());
        float interpolation = mr.i.getInterpolation(abs);
        int right = getRight();
        y0 y0Var = this.e;
        y0Var.setTranslationX(((y0Var.getWidth() * 1.5f) + (right - y0Var.getRight()) + AndroidUtilities.dp(32.0f)) * interpolation);
        y0Var.setTranslationY(AndroidUtilities.dp(16.0f) * interpolation);
        float clamp = Utilities.clamp(AndroidUtilities.lerp(1.0f, 1.5f, interpolation), 1.0f, 0.0f);
        y0Var.setScaleX(clamp);
        y0Var.setScaleY(clamp);
        int top = getTop();
        y0 y0Var2 = this.c;
        y0Var2.setTranslationY((((top - y0Var2.getTop()) - (y0Var2.getHeight() * 1.8f)) - AndroidUtilities.dp(32.0f)) * abs);
        y0Var2.setTranslationX(AndroidUtilities.dp(16.0f) * abs);
        float clamp2 = Utilities.clamp(AndroidUtilities.lerp(1.0f, 1.8f, abs), 1.0f, 0.0f);
        y0Var2.setScaleX(clamp2);
        y0Var2.setScaleY(clamp2);
        float interpolation2 = mr.g.getInterpolation(abs);
        int left = getLeft();
        y0 y0Var3 = this.d;
        y0Var3.setTranslationX((((left - y0Var3.getLeft()) - (y0Var3.getWidth() * 2.5f)) + AndroidUtilities.dp(32.0f)) * interpolation2);
        y0Var3.setTranslationY(((y0Var3.getHeight() * 2.5f) + (getBottom() - y0Var3.getBottom()) + AndroidUtilities.dp(32.0f)) * interpolation2);
        float clamp3 = Utilities.clamp(AndroidUtilities.lerp(1.0f, 2.5f, abs), 1.0f, 0.0f);
        y0Var3.setScaleX(clamp3);
        y0Var3.setScaleY(clamp3);
        float f11 = abs < 0.4f ? abs / 0.4f : 1.0f;
        y0Var.h = f11;
        y0Var2.h = f11;
        y0Var3.h = f11;
    }
}
