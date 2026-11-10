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
import org.telegram.ui.Components.wq;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class u5 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.h6 a;
    public final org.telegram.ui.Components.c0 b;
    public final TextView[] c;
    public int d;
    public boolean e;
    public final org.telegram.ui.Components.v5 f;
    public final Paint h;

    public u5(Context context, CharSequence[] charSequenceArr, k kVar, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.d = 0;
        this.e = false;
        this.h = new Paint(1);
        this.a = h6Var;
        org.telegram.ui.Components.c0 c0Var = new org.telegram.ui.Components.c0(this, context, h6Var);
        this.b = c0Var;
        this.f = new org.telegram.ui.Components.v5(new t5(this, 0), 420L, wq.h);
        c0Var.setOrientation(0);
        c0Var.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        this.c = new TextView[charSequenceArr.length];
        int i7 = 0;
        while (i7 < charSequenceArr.length) {
            TextView textView = new TextView(context);
            textView.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f));
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setTextSize(1, 14.0f);
            textView.setText(charSequenceArr[i7]);
            textView.setOnClickListener(new bi.la(this, kVar, i7, 19));
            c8.ka.a(textView);
            this.b.addView(textView, c8.ha.q(-2, -2, 0.0f, 19, i7 == 0 ? 0 : 3, 0, 0, 0));
            this.c[i7] = textView;
            i7++;
        }
        addView(this.b, c8.ha.e(-2, -2, 17));
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
            textView.setTextColor(i0.a.f(l10, org.telegram.ui.ActionBar.m6.w0(i10, h6Var), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, h6Var)));
            i7++;
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.d6));
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.Components.c0 c0Var;
        if (this.e && view == (c0Var = this.b)) {
            float N = org.telegram.messenger.g0.N(1.67f);
            float N2 = org.telegram.messenger.g0.N(0.67f);
            Paint paint = this.h;
            paint.setShadowLayer(N, 0.0f, N2, 520093696);
            paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, this.a));
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(c0Var.getX(), c0Var.getY(), c0Var.getX() + c0Var.getWidth(), c0Var.getY() + c0Var.getHeight());
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

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        a();
        this.b.setBackground(this.e ? null : org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(18.0f), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, this.a)));
    }
}
