package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.bs;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class i5 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 a;
    public final h5 b;
    public final TextView[] c;
    public int d;
    public boolean e;
    public final org.telegram.ui.Components.f6 f;
    public final Paint h;

    public i5(Context context, CharSequence[] charSequenceArr, k kVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.d = 0;
        this.e = false;
        this.h = new Paint(1);
        this.a = g6Var;
        h5 h5Var = new h5(this, context, g6Var);
        this.b = h5Var;
        this.f = new org.telegram.ui.Components.f6(new g5(this, 0), 420L, bs.h);
        h5Var.setOrientation(0);
        h5Var.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        this.c = new TextView[charSequenceArr.length];
        int i10 = 0;
        while (i10 < charSequenceArr.length) {
            TextView textView = new TextView(context);
            textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 14.0f);
            textView.setText(charSequenceArr[i10]);
            textView.setOnClickListener(new ai.ia(this, kVar, i10, 18));
            w7.b6.a(textView);
            this.b.addView(textView, w7.z5.p(-2, -2, 0.0f, 19, i10 == 0 ? 0 : 3, 0, 0, 0));
            this.c[i10] = textView;
            i10++;
        }
        addView(this.b, w7.z5.e(-2, -2, 17));
        updateColors();
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
            int i11 = org.telegram.ui.ActionBar.k6.z6;
            org.telegram.ui.ActionBar.g6 g6Var = this.a;
            textView.setTextColor(i0.a.f(clamp01, org.telegram.ui.ActionBar.k6.w0(i11, g6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, g6Var)));
            i10++;
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Oh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d6));
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        h5 h5Var;
        if (this.e && view == (h5Var = this.b)) {
            float dpf2 = AndroidUtilities.dpf2(1.67f);
            float dpf22 = AndroidUtilities.dpf2(0.67f);
            Paint paint = this.h;
            paint.setShadowLayer(dpf2, 0.0f, dpf22, 520093696);
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.a));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(h5Var.getX(), h5Var.getY(), h5Var.getX() + h5Var.getWidth(), h5Var.getY() + h5Var.getHeight());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
        }
        return super.drawChild(canvas, view, j10);
    }

    public void setSelected(int i10) {
        if (this.d == i10) {
            return;
        }
        this.d = i10;
        a();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        a();
        this.b.setBackground(this.e ? null : org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.a)));
    }
}
