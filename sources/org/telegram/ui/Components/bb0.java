package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class bb0 extends View {
    public final i6 a;
    public final xa0 b;
    public boolean c;
    public boolean d;
    public final String e;
    public final String f;
    public final int h;

    public bb0(Context context, int i9, String str, int i10, String str2, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.c = true;
        this.e = str;
        this.f = str2;
        setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.i6, b6Var), 2, -1));
        i6 i6Var = new i6(true, true, true, false);
        this.a = i6Var;
        i6Var.k(0.35f, 300L, gr.h);
        i6Var.t(AndroidUtilities.dp(16.0f));
        i6Var.r(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, b6Var));
        i6Var.setCallback(this);
        i6Var.n(!LocaleController.isRTL);
        if (LocaleController.isRTL) {
            i6Var.b = 5;
        }
        float dp = AndroidUtilities.dp(77.0f);
        TextPaint textPaint = i6Var.a;
        int max = (int) (Math.max(textPaint.measureText(str), textPaint.measureText(str2)) + dp);
        this.h = max;
        i6Var.G = max;
        xa0 xa0Var = new xa0(0);
        mi0 mi0Var = new mi0(i9, AndroidUtilities.dp(24.0f), j3.r0.l(i9, ""), AndroidUtilities.dp(24.0f));
        xa0Var.c = mi0Var;
        mi0Var.r0 = this;
        mi0Var.H(true);
        mi0Var.h = true;
        mi0Var.I(0);
        mi0 mi0Var2 = new mi0(i10, AndroidUtilities.dp(24.0f), j3.r0.l(i10, ""), AndroidUtilities.dp(24.0f));
        xa0Var.d = mi0Var2;
        mi0Var2.r0 = this;
        mi0Var2.H(true);
        mi0Var2.h = true;
        mi0Var2.I(0);
        xa0Var.e = mi0Var;
        this.b = xa0Var;
        xa0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.F8, b6Var), PorterDuff.Mode.SRC_IN));
    }

    public final void a(boolean z10, boolean z11) {
        if (this.c || z10 != this.d) {
            this.d = z10;
            String str = z10 ? this.e : this.f;
            boolean z12 = z11 && !LocaleController.isRTL;
            i6 i6Var = this.a;
            i6Var.q(str, z12, true);
            xa0 xa0Var = this.b;
            mi0 mi0Var = (mi0) xa0Var.d;
            mi0 mi0Var2 = (mi0) xa0Var.c;
            xa0Var.b = z10;
            if (z11) {
                xa0Var.e = z10 ? mi0Var2 : mi0Var;
                mi0Var2.K(0);
                mi0Var.K(0);
                ((mi0) xa0Var.e).start();
            } else {
                if (z10) {
                    mi0Var = mi0Var2;
                }
                xa0Var.e = mi0Var;
                mi0Var.K(mi0Var.e[0] - 1);
            }
            this.c = false;
            setContentDescription(i6Var.g);
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = LocaleController.isRTL;
        i6 i6Var = this.a;
        xa0 xa0Var = this.b;
        if (z10) {
            xa0Var.setBounds(getMeasuredWidth() - AndroidUtilities.dp(41.0f), org.telegram.messenger.ll.y(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - AndroidUtilities.dp(17.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            i6Var.setBounds(0, 0, getMeasuredWidth() - AndroidUtilities.dp(59.0f), getMeasuredHeight());
        } else {
            xa0Var.setBounds(AndroidUtilities.dp(17.0f), org.telegram.messenger.ll.y(24.0f, getMeasuredHeight(), 2), AndroidUtilities.dp(41.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            i6Var.setBounds(AndroidUtilities.dp(59.0f), 0, getMeasuredWidth(), getMeasuredHeight());
        }
        i6Var.draw(canvas);
        xa0Var.draw(canvas);
    }

    public boolean getState() {
        return this.d;
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        int mode = View.MeasureSpec.getMode(i9);
        int i11 = this.h;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(mode == 1073741824 ? Math.max(View.MeasureSpec.getSize(i9), i11) : Math.min(View.MeasureSpec.getSize(i9), i11), mode), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getVisibility() != 0 || getAlpha() < 0.5f) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a || super.verifyDrawable(drawable);
    }
}
