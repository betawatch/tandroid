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
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Components.hs;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class u4 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 a;
    public final t4 b;
    public final TextView[] c;
    public int d;
    public boolean e;
    public final org.telegram.ui.Components.g6 f;
    public final Paint h;

    public u4(Context context, CharSequence[] charSequenceArr, j jVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.d = 0;
        this.e = false;
        this.h = new Paint(1);
        this.a = e6Var;
        t4 t4Var = new t4(this, context, e6Var);
        this.b = t4Var;
        this.f = new org.telegram.ui.Components.g6(new s4(this, 0), 420L, hs.h);
        t4Var.setOrientation(0);
        t4Var.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        this.c = new TextView[charSequenceArr.length];
        int i10 = 0;
        while (i10 < charSequenceArr.length) {
            TextView textView = new TextView(context);
            textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 14.0f);
            textView.setText(charSequenceArr[i10]);
            textView.setOnClickListener(new sa(this, jVar, i10, 17));
            w7.z5.a(textView);
            this.b.addView(textView, w7.x5.p(-2, -2, 0.0f, 19, i10 == 0 ? 0 : 3, 0, 0, 0));
            this.c[i10] = textView;
            i10++;
        }
        addView(this.b, w7.x5.e(-2, -2, 17));
        e();
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
            int i11 = org.telegram.ui.ActionBar.i6.z6;
            org.telegram.ui.ActionBar.e6 e6Var = this.a;
            textView.setTextColor(i0.a.d(clamp01, org.telegram.ui.ActionBar.i6.w0(i11, e6Var), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, e6Var)));
            i10++;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        t4 t4Var;
        if (this.e && view == (t4Var = this.b)) {
            float dpf2 = AndroidUtilities.dpf2(1.67f);
            float dpf22 = AndroidUtilities.dpf2(0.67f);
            Paint paint = this.h;
            paint.setShadowLayer(dpf2, 0.0f, dpf22, 520093696);
            paint.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.d6, this.a));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(t4Var.getX(), t4Var.getY(), t4Var.getX() + t4Var.getWidth(), t4Var.getY() + t4Var.getHeight());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void e() {
        a();
        this.b.setBackground(this.e ? null : org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.d6, this.a)));
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
