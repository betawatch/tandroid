package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class i6 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.h6 a;
    public final org.telegram.ui.Components.k0 b;
    public final TextView[] c;
    public int d;
    public boolean e;
    public final org.telegram.ui.Components.d6 f;
    public final Paint h;

    public i6(Context context, CharSequence[] charSequenceArr, k kVar, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.d = 0;
        this.e = false;
        this.h = new Paint(1);
        this.a = h6Var;
        org.telegram.ui.Components.k0 k0Var = new org.telegram.ui.Components.k0(this, context, h6Var);
        this.b = k0Var;
        this.f = new org.telegram.ui.Components.d6(new h6(this, 0), 420L, nr.h);
        k0Var.setOrientation(0);
        k0Var.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        this.c = new TextView[charSequenceArr.length];
        int i7 = 0;
        while (i7 < charSequenceArr.length) {
            TextView textView = new TextView(context);
            textView.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f));
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setTextSize(1, 14.0f);
            textView.setText(charSequenceArr[i7]);
            textView.setOnClickListener(new bi.h5(this, kVar, i7, 22));
            c8.ra.a(textView);
            this.b.addView(textView, c8.ma.q(-2, -2, 0.0f, 19, i7 == 0 ? 0 : 3, 0, 0, 0));
            this.c[i7] = textView;
            i7++;
        }
        addView(this.b, c8.ma.e(-2, -2, 17));
        updateColors();
    }

    public final void a() {
        int i7 = 0;
        float e10 = this.f.e(false, this.d);
        while (true) {
            TextView[] textViewArr = this.c;
            if (i7 >= textViewArr.length) {
                this.b.invalidate();
                return;
            }
            float l10 = Utilities.l(1.0f - Math.abs(e10 - i7));
            TextView textView = textViewArr[i7];
            int i10 = org.telegram.ui.ActionBar.m6.z6;
            org.telegram.ui.ActionBar.h6 h6Var = this.a;
            textView.setTextColor(i0.a.f(l10, org.telegram.ui.ActionBar.m6.w0(i10, h6Var), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fi, h6Var)));
            i7++;
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.d6));
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.Components.k0 k0Var;
        if (this.e && view == (k0Var = this.b)) {
            float N = org.telegram.messenger.g0.N(1.67f);
            float N2 = org.telegram.messenger.g0.N(0.67f);
            Paint paint = this.h;
            paint.setShadowLayer(N, 0.0f, N2, 520093696);
            paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, this.a));
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(k0Var.getX(), k0Var.getY(), k0Var.getX() + k0Var.getWidth(), k0Var.getY() + k0Var.getHeight());
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), paint);
        }
        return super.drawChild(canvas, view, j3);
    }

    public void setSelected(int i7) {
        if (this.d == i7) {
            return;
        }
        this.d = i7;
        a();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        a();
        this.b.setBackground(this.e ? null : org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(18.0f), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, this.a)));
    }
}
