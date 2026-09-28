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

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class gc0 extends View {
    public final o6 a;
    public final cc0 b;
    public boolean c;
    public boolean d;
    public final String e;
    public final String f;
    public final int h;

    public gc0(Context context, int i10, String str, int i11, String str2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.c = true;
        this.e = str;
        this.f = str2;
        setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.i6, d6Var), 2, -1));
        o6 o6Var = new o6(true, true, true, false);
        this.a = o6Var;
        o6Var.k(0.35f, 300L, sr.h);
        o6Var.t(AndroidUtilities.dp(16.0f));
        o6Var.r(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.E8, d6Var));
        o6Var.setCallback(this);
        o6Var.n(!LocaleController.isRTL);
        if (LocaleController.isRTL) {
            o6Var.b = 5;
        }
        float dp = AndroidUtilities.dp(77.0f);
        TextPaint textPaint = o6Var.a;
        int max = (int) (Math.max(textPaint.measureText(str), textPaint.measureText(str2)) + dp);
        this.h = max;
        o6Var.G = max;
        cc0 cc0Var = new cc0(0);
        kj0 kj0Var = new kj0(i10, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        cc0Var.c = kj0Var;
        kj0Var.R(this);
        kj0Var.J(true);
        kj0Var.h = true;
        kj0Var.K(0);
        kj0 kj0Var2 = new kj0(i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        cc0Var.d = kj0Var2;
        kj0Var2.R(this);
        kj0Var2.J(true);
        kj0Var2.h = true;
        kj0Var2.K(0);
        cc0Var.e = kj0Var;
        this.b = cc0Var;
        cc0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.F8, d6Var), PorterDuff.Mode.SRC_IN));
    }

    public final void a(boolean z10, boolean z11) {
        if (this.c || z10 != this.d) {
            this.d = z10;
            String str = z10 ? this.e : this.f;
            boolean z12 = z11 && !LocaleController.isRTL;
            o6 o6Var = this.a;
            o6Var.q(str, z12, true);
            cc0 cc0Var = this.b;
            kj0 kj0Var = (kj0) cc0Var.d;
            kj0 kj0Var2 = (kj0) cc0Var.c;
            cc0Var.b = z10;
            if (z11) {
                cc0Var.e = z10 ? kj0Var2 : kj0Var;
                kj0Var2.M(0);
                kj0Var.M(0);
                ((kj0) cc0Var.e).start();
            } else {
                if (z10) {
                    kj0Var = kj0Var2;
                }
                cc0Var.e = kj0Var;
                kj0Var.M(kj0Var.e[0] - 1);
            }
            this.c = false;
            setContentDescription(o6Var.g);
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = LocaleController.isRTL;
        o6 o6Var = this.a;
        cc0 cc0Var = this.b;
        if (z10) {
            cc0Var.setBounds(getMeasuredWidth() - AndroidUtilities.dp(41.0f), org.telegram.messenger.ok.A(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - AndroidUtilities.dp(17.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            o6Var.setBounds(0, 0, getMeasuredWidth() - AndroidUtilities.dp(59.0f), getMeasuredHeight());
        } else {
            cc0Var.setBounds(AndroidUtilities.dp(17.0f), org.telegram.messenger.ok.A(24.0f, getMeasuredHeight(), 2), AndroidUtilities.dp(41.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            o6Var.setBounds(AndroidUtilities.dp(59.0f), 0, getMeasuredWidth(), getMeasuredHeight());
        }
        o6Var.draw(canvas);
        cc0Var.draw(canvas);
    }

    public boolean getState() {
        return this.d;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int i12 = this.h;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(mode == 1073741824 ? Math.max(View.MeasureSpec.getSize(i10), i12) : Math.min(View.MeasureSpec.getSize(i10), i12), mode), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
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
