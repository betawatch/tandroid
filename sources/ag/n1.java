package ag;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import h7.z5;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.er;
import org.telegram.ui.ta0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class n1 extends FrameLayout implements l1 {
    public final c6 a;
    public final ArrayList b;
    public final m1 c;
    public final m1 d;
    public final m1 e;
    public final boolean f;

    public n1(Context context, c6 c6Var) {
        super(context);
        this.b = new ArrayList();
        this.a = c6Var;
        for (ta0 ta0Var : ta0.values()) {
            if (ta0Var.e) {
                this.b.add(ta0Var);
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

    public final m1 a(Context context, int i10) {
        ta0 ta0Var = (ta0) this.b.get(i10);
        m1 m1Var = new m1(context);
        j3 j3Var = new j3(20);
        m1Var.e = j3Var;
        Paint paint = new Paint(1);
        m1Var.f = paint;
        j3Var.r = 12;
        j3Var.s = 8;
        j3Var.t = 6;
        if (i10 == 1) {
            j3Var.N = 1001;
        }
        if (i10 == 0) {
            j3Var.N = 1002;
        }
        j3Var.O = this.a;
        j3Var.P = g6.Zj;
        j3Var.c();
        paint.setColor(-1);
        m1Var.setLayoutParams(z5.d(-2, -2.0f, 17, 0.0f, 52.0f, 0.0f, 0.0f));
        m1Var.setForeground(ta0Var.c);
        m1Var.setBackgroundResource(ta0Var.b);
        m1Var.setPadding(AndroidUtilities.dp(8.0f));
        m1Var.setBackgroundOuterPadding(AndroidUtilities.dp(32.0f));
        addView(m1Var);
        return m1Var;
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

    @Override // ag.l1
    public void setOffset(float f10) {
        if (this.f) {
            return;
        }
        float abs = Math.abs(f10 / getMeasuredWidth());
        float interpolation = er.i.getInterpolation(abs);
        int right = getRight();
        m1 m1Var = this.e;
        m1Var.setTranslationX(((m1Var.getWidth() * 1.5f) + (right - m1Var.getRight()) + AndroidUtilities.dp(32.0f)) * interpolation);
        m1Var.setTranslationY(AndroidUtilities.dp(16.0f) * interpolation);
        float clamp = Utilities.clamp(AndroidUtilities.lerp(1.0f, 1.5f, interpolation), 1.0f, 0.0f);
        m1Var.setScaleX(clamp);
        m1Var.setScaleY(clamp);
        int top = getTop();
        m1 m1Var2 = this.c;
        m1Var2.setTranslationY((((top - m1Var2.getTop()) - (m1Var2.getHeight() * 1.8f)) - AndroidUtilities.dp(32.0f)) * abs);
        m1Var2.setTranslationX(AndroidUtilities.dp(16.0f) * abs);
        float clamp2 = Utilities.clamp(AndroidUtilities.lerp(1.0f, 1.8f, abs), 1.0f, 0.0f);
        m1Var2.setScaleX(clamp2);
        m1Var2.setScaleY(clamp2);
        float interpolation2 = er.g.getInterpolation(abs);
        int left = getLeft();
        m1 m1Var3 = this.d;
        m1Var3.setTranslationX((((left - m1Var3.getLeft()) - (m1Var3.getWidth() * 2.5f)) + AndroidUtilities.dp(32.0f)) * interpolation2);
        m1Var3.setTranslationY(((m1Var3.getHeight() * 2.5f) + (getBottom() - m1Var3.getBottom()) + AndroidUtilities.dp(32.0f)) * interpolation2);
        float clamp3 = Utilities.clamp(AndroidUtilities.lerp(1.0f, 2.5f, abs), 1.0f, 0.0f);
        m1Var3.setScaleX(clamp3);
        m1Var3.setScaleY(clamp3);
        float f11 = abs < 0.4f ? abs / 0.4f : 1.0f;
        m1Var.h = f11;
        m1Var2.h = f11;
        m1Var3.h = f11;
    }
}
