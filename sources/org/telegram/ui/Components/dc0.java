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

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class dc0 extends View {
    public final o6 a;
    public final zb0 b;
    public boolean c;
    public boolean d;
    public final String e;
    public final String f;
    public final int h;

    public dc0(Context context, int i10, String str, int i11, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.c = true;
        this.e = str;
        this.f = str2;
        setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, e6Var), 2, -1));
        o6 o6Var = new o6(true, true, true, false);
        this.a = o6Var;
        o6Var.k(0.35f, 300L, qr.h);
        o6Var.t(AndroidUtilities.dp(16.0f));
        o6Var.r(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, e6Var));
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
        zb0 zb0Var = new zb0(0);
        ij0 ij0Var = new ij0(i10, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        zb0Var.c = ij0Var;
        ij0Var.R(this);
        ij0Var.J(true);
        ij0Var.h = true;
        ij0Var.K(0);
        ij0 ij0Var2 = new ij0(i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        zb0Var.d = ij0Var2;
        ij0Var2.R(this);
        ij0Var2.J(true);
        ij0Var2.h = true;
        ij0Var2.K(0);
        zb0Var.e = ij0Var;
        this.b = zb0Var;
        zb0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, e6Var), PorterDuff.Mode.SRC_IN));
    }

    public final void a(boolean z10, boolean z11) {
        if (this.c || z10 != this.d) {
            this.d = z10;
            String str = z10 ? this.e : this.f;
            boolean z12 = z11 && !LocaleController.isRTL;
            o6 o6Var = this.a;
            o6Var.q(str, z12, true);
            zb0 zb0Var = this.b;
            ij0 ij0Var = (ij0) zb0Var.d;
            ij0 ij0Var2 = (ij0) zb0Var.c;
            zb0Var.b = z10;
            if (z11) {
                zb0Var.e = z10 ? ij0Var2 : ij0Var;
                ij0Var2.M(0);
                ij0Var.M(0);
                ((ij0) zb0Var.e).start();
            } else {
                if (z10) {
                    ij0Var = ij0Var2;
                }
                zb0Var.e = ij0Var;
                ij0Var.M(ij0Var.e[0] - 1);
            }
            this.c = false;
            setContentDescription(o6Var.g);
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = LocaleController.isRTL;
        o6 o6Var = this.a;
        zb0 zb0Var = this.b;
        if (z10) {
            zb0Var.setBounds(getMeasuredWidth() - AndroidUtilities.dp(41.0f), org.telegram.messenger.wh.A(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - AndroidUtilities.dp(17.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            o6Var.setBounds(0, 0, getMeasuredWidth() - AndroidUtilities.dp(59.0f), getMeasuredHeight());
        } else {
            zb0Var.setBounds(AndroidUtilities.dp(17.0f), org.telegram.messenger.wh.A(24.0f, getMeasuredHeight(), 2), AndroidUtilities.dp(41.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            o6Var.setBounds(AndroidUtilities.dp(59.0f), 0, getMeasuredWidth(), getMeasuredHeight());
        }
        o6Var.draw(canvas);
        zb0Var.draw(canvas);
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
