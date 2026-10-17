package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.bs;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class g5 extends FrameLayout implements org.telegram.ui.ActionBar.y5 {
    public final org.telegram.ui.ActionBar.d6 a;
    public final f5 b;
    public final TextView[] c;
    public int d;
    public boolean e;
    public final org.telegram.ui.Components.f6 f;
    public final Paint h;

    public g5(Context context, CharSequence[] charSequenceArr, l lVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.d = 0;
        this.e = false;
        this.h = new Paint(1);
        this.a = d6Var;
        f5 f5Var = new f5(this, context, d6Var);
        this.b = f5Var;
        this.f = new org.telegram.ui.Components.f6(new e5(this, 0), 420L, bs.h);
        f5Var.setOrientation(0);
        f5Var.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        this.c = new TextView[charSequenceArr.length];
        int i10 = 0;
        while (i10 < charSequenceArr.length) {
            TextView textView = new TextView(context);
            textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 14.0f);
            textView.setText(charSequenceArr[i10]);
            textView.setOnClickListener(new ai.ga(this, lVar, i10, 18));
            w7.b6.a(textView);
            this.b.addView(textView, w7.z5.p(-2, -2, 0.0f, 19, i10 == 0 ? 0 : 3, 0, 0, 0));
            this.c[i10] = textView;
            i10++;
        }
        addView(this.b, w7.z5.e(-2, -2, 17));
        d();
    }

    public final void a() {
        int i10 = 0;
        float d = this.f.d(this.d, false);
        while (true) {
            TextView[] textViewArr = this.c;
            if (i10 >= textViewArr.length) {
                this.b.invalidate();
                return;
            }
            float clamp01 = Utilities.clamp01(1.0f - Math.abs(d - i10));
            TextView textView = textViewArr[i10];
            int i11 = org.telegram.ui.ActionBar.h6.z6;
            org.telegram.ui.ActionBar.d6 d6Var = this.a;
            textView.setTextColor(i0.b.f(clamp01, org.telegram.ui.ActionBar.h6.w0(i11, d6Var), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var)));
            i10++;
        }
    }

    @Override // org.telegram.ui.ActionBar.y5
    public final void d() {
        a();
        this.b.setBackground(this.e ? null : org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.d6, this.a)));
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        f5 f5Var;
        if (this.e && view == (f5Var = this.b)) {
            float dpf2 = AndroidUtilities.dpf2(1.67f);
            float dpf22 = AndroidUtilities.dpf2(0.67f);
            Paint paint = this.h;
            paint.setShadowLayer(dpf2, 0.0f, dpf22, 520093696);
            paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.d6, this.a));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(f5Var.getX(), f5Var.getY(), f5Var.getX() + f5Var.getWidth(), f5Var.getY() + f5Var.getHeight());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
        }
        return super.drawChild(canvas, view, j10);
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public void setSelected(int i10) {
        if (this.d == i10) {
            return;
        }
        this.d = i10;
        a();
    }
}
