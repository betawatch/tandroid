package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import b8.pf;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class r5 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 a;
    public final org.telegram.ui.Components.b0 b;
    public final TextView[] c;
    public int d;
    public boolean e;
    public final org.telegram.ui.Components.u5 f;
    public final Paint h;

    public r5(Context context, CharSequence[] charSequenceArr, k kVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.d = 0;
        this.e = false;
        this.h = new Paint(1);
        this.a = e6Var;
        org.telegram.ui.Components.b0 b0Var = new org.telegram.ui.Components.b0(this, context, e6Var);
        this.b = b0Var;
        this.f = new org.telegram.ui.Components.u5(new q5(this, 0), 420L, xq.h);
        b0Var.setOrientation(0);
        b0Var.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        this.c = new TextView[charSequenceArr.length];
        int i3 = 0;
        while (i3 < charSequenceArr.length) {
            TextView textView = new TextView(context);
            textView.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f));
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setTextSize(1, 14.0f);
            textView.setText(charSequenceArr[i3]);
            textView.setOnClickListener(new ai.h3(this, kVar, i3, 21));
            pf.a(textView);
            this.b.addView(textView, mf.q(-2, -2, 0.0f, 19, i3 == 0 ? 0 : 3, 0, 0, 0));
            this.c[i3] = textView;
            i3++;
        }
        addView(this.b, mf.e(-2, -2, 17));
        updateColors();
    }

    public final void a() {
        int i3 = 0;
        float e10 = this.f.e(false, this.d);
        while (true) {
            TextView[] textViewArr = this.c;
            if (i3 >= textViewArr.length) {
                this.b.invalidate();
                return;
            }
            float l10 = Utilities.l(1.0f - Math.abs(e10 - i3));
            TextView textView = textViewArr[i3];
            int i10 = org.telegram.ui.ActionBar.k6.z6;
            org.telegram.ui.ActionBar.e6 e6Var = this.a;
            textView.setTextColor(i0.a.f(l10, org.telegram.ui.ActionBar.k6.w0(i10, e6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var)));
            i3++;
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d6));
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Components.b0 b0Var;
        if (this.e && view == (b0Var = this.b)) {
            float N = org.telegram.messenger.g0.N(1.67f);
            float N2 = org.telegram.messenger.g0.N(0.67f);
            Paint paint = this.h;
            paint.setShadowLayer(N, 0.0f, N2, 520093696);
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.a));
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(b0Var.getX(), b0Var.getY(), b0Var.getX() + b0Var.getWidth(), b0Var.getY() + b0Var.getHeight());
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), paint);
        }
        return super.drawChild(canvas, view, j10);
    }

    public void setSelected(int i3) {
        if (this.d == i3) {
            return;
        }
        this.d = i3;
        a();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        a();
        this.b.setBackground(this.e ? null : org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(18.0f), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.a)));
    }
}
