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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class uc0 extends View {
    public final q6 a;
    public final qc0 b;
    public boolean c;
    public boolean d;
    public final String e;
    public final String f;
    public final int h;

    public uc0(Context context, int i10, String str, int i11, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.c = true;
        this.e = str;
        this.f = str2;
        setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.i6, e6Var), 2, -1));
        q6 q6Var = new q6(true, true, true);
        this.a = q6Var;
        q6Var.n(0.35f, 300L, hs.h);
        q6Var.w(AndroidUtilities.dp(16.0f));
        q6Var.u(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.E8, e6Var));
        q6Var.setCallback(this);
        q6Var.q(!LocaleController.isRTL);
        if (LocaleController.isRTL) {
            q6Var.b = 5;
        }
        float dp = AndroidUtilities.dp(77.0f);
        TextPaint textPaint = q6Var.a;
        int max = (int) (Math.max(textPaint.measureText(str), textPaint.measureText(str2)) + dp);
        this.h = max;
        q6Var.M = max;
        qc0 qc0Var = new qc0(0);
        ck0 ck0Var = new ck0(i10, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        qc0Var.c = ck0Var;
        ck0Var.R(this);
        ck0Var.J(true);
        ck0Var.h = true;
        ck0Var.K(0);
        ck0 ck0Var2 = new ck0(i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        qc0Var.d = ck0Var2;
        ck0Var2.R(this);
        ck0Var2.J(true);
        ck0Var2.h = true;
        ck0Var2.K(0);
        qc0Var.e = ck0Var;
        this.b = qc0Var;
        qc0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.F8, e6Var), PorterDuff.Mode.SRC_IN));
    }

    public final void a(boolean z10, boolean z11) {
        if (this.c || z10 != this.d) {
            this.d = z10;
            String str = z10 ? this.e : this.f;
            boolean z12 = z11 && !LocaleController.isRTL;
            q6 q6Var = this.a;
            q6Var.t(str, z12, true);
            qc0 qc0Var = this.b;
            ck0 ck0Var = (ck0) qc0Var.d;
            ck0 ck0Var2 = (ck0) qc0Var.c;
            qc0Var.b = z10;
            if (z11) {
                qc0Var.e = z10 ? ck0Var2 : ck0Var;
                ck0Var2.M(0);
                ck0Var.M(0);
                ((ck0) qc0Var.e).start();
            } else {
                if (z10) {
                    ck0Var = ck0Var2;
                }
                qc0Var.e = ck0Var;
                ck0Var.M(ck0Var.e[0] - 1);
            }
            this.c = false;
            setContentDescription(q6Var.i);
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = LocaleController.isRTL;
        q6 q6Var = this.a;
        qc0 qc0Var = this.b;
        if (z10) {
            qc0Var.setBounds(getMeasuredWidth() - AndroidUtilities.dp(41.0f), org.telegram.messenger.bi.A(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - AndroidUtilities.dp(17.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            q6Var.setBounds(0, 0, getMeasuredWidth() - AndroidUtilities.dp(59.0f), getMeasuredHeight());
        } else {
            qc0Var.setBounds(AndroidUtilities.dp(17.0f), org.telegram.messenger.bi.A(24.0f, getMeasuredHeight(), 2), AndroidUtilities.dp(41.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            q6Var.setBounds(AndroidUtilities.dp(59.0f), 0, getMeasuredWidth(), getMeasuredHeight());
        }
        q6Var.draw(canvas);
        qc0Var.draw(canvas);
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
