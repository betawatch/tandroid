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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class dc0 extends View {
    public final n6 a;
    public final zb0 b;
    public boolean c;
    public boolean d;
    public final String e;
    public final String f;
    public final int h;

    public dc0(Context context, int i10, String str, int i11, String str2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.c = true;
        this.e = str;
        this.f = str2;
        setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var), 2, -1));
        n6 n6Var = new n6(true, true, true, false);
        this.a = n6Var;
        n6Var.k(0.35f, 300L, wr.h);
        n6Var.t(AndroidUtilities.dp(16.0f));
        n6Var.r(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var));
        n6Var.setCallback(this);
        n6Var.n(!LocaleController.isRTL);
        if (LocaleController.isRTL) {
            n6Var.b = 5;
        }
        float dp = AndroidUtilities.dp(77.0f);
        TextPaint textPaint = n6Var.a;
        int max = (int) (Math.max(textPaint.measureText(str), textPaint.measureText(str2)) + dp);
        this.h = max;
        n6Var.G = max;
        zb0 zb0Var = new zb0(0);
        hj0 hj0Var = new hj0(i10, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        zb0Var.c = hj0Var;
        hj0Var.v0 = this;
        hj0Var.J(true);
        hj0Var.h = true;
        hj0Var.K(0);
        hj0 hj0Var2 = new hj0(i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        zb0Var.d = hj0Var2;
        hj0Var2.v0 = this;
        hj0Var2.J(true);
        hj0Var2.h = true;
        hj0Var2.K(0);
        zb0Var.e = hj0Var;
        this.b = zb0Var;
        zb0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, f6Var), PorterDuff.Mode.SRC_IN));
    }

    public final void a(boolean z10, boolean z11) {
        if (this.c || z10 != this.d) {
            this.d = z10;
            String str = z10 ? this.e : this.f;
            boolean z12 = z11 && !LocaleController.isRTL;
            n6 n6Var = this.a;
            n6Var.q(str, z12, true);
            zb0 zb0Var = this.b;
            hj0 hj0Var = (hj0) zb0Var.d;
            hj0 hj0Var2 = (hj0) zb0Var.c;
            zb0Var.b = z10;
            if (z11) {
                zb0Var.e = z10 ? hj0Var2 : hj0Var;
                hj0Var2.M(0);
                hj0Var.M(0);
                ((hj0) zb0Var.e).start();
            } else {
                if (z10) {
                    hj0Var = hj0Var2;
                }
                zb0Var.e = hj0Var;
                hj0Var.M(hj0Var.e[0] - 1);
            }
            this.c = false;
            setContentDescription(n6Var.g);
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = LocaleController.isRTL;
        n6 n6Var = this.a;
        zb0 zb0Var = this.b;
        if (z10) {
            zb0Var.setBounds(getMeasuredWidth() - AndroidUtilities.dp(41.0f), org.telegram.messenger.em.y(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - AndroidUtilities.dp(17.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            n6Var.setBounds(0, 0, getMeasuredWidth() - AndroidUtilities.dp(59.0f), getMeasuredHeight());
        } else {
            zb0Var.setBounds(AndroidUtilities.dp(17.0f), org.telegram.messenger.em.y(24.0f, getMeasuredHeight(), 2), AndroidUtilities.dp(41.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            n6Var.setBounds(AndroidUtilities.dp(59.0f), 0, getMeasuredWidth(), getMeasuredHeight());
        }
        n6Var.draw(canvas);
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
