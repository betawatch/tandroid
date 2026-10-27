package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.pa;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class g5 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.ActionBar.u6 a;
    public final f5 b;
    public final TextView[] c;
    public int d;
    public boolean e;
    public final org.telegram.ui.Components.h6 f;
    public final Paint h;

    public g5(Context context, CharSequence[] charSequenceArr, k kVar, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.d = 0;
        this.e = false;
        this.h = new Paint(1);
        this.a = u6Var;
        f5 f5Var = new f5(this, context, u6Var);
        this.b = f5Var;
        this.f = new org.telegram.ui.Components.h6(new e5(this, 0), 420L, ds.h);
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
            textView.setOnClickListener(new pa(this, kVar, i10, 19));
            kb1.b(textView);
            this.b.addView(textView, kb1.t(-2, -2, 0.0f, 19, i10 == 0 ? 0 : 3, 0, 0, 0));
            this.c[i10] = textView;
            i10++;
        }
        addView(this.b, kb1.i(-2, -2, 17));
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
            int i11 = org.telegram.ui.ActionBar.y6.z6;
            org.telegram.ui.ActionBar.u6 u6Var = this.a;
            textView.setTextColor(i0.a.f(clamp01, org.telegram.ui.ActionBar.y6.w0(i11, u6Var), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var)));
            i10++;
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Oh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d6));
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        f5 f5Var;
        if (this.e && view == (f5Var = this.b)) {
            float dpf2 = AndroidUtilities.dpf2(1.67f);
            float dpf22 = AndroidUtilities.dpf2(0.67f);
            Paint paint = this.h;
            paint.setShadowLayer(dpf2, 0.0f, dpf22, 520093696);
            paint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.d6, this.a));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(f5Var.getX(), f5Var.getY(), f5Var.getX() + f5Var.getWidth(), f5Var.getY() + f5Var.getHeight());
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

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        a();
        this.b.setBackground(this.e ? null : org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.d6, this.a)));
    }
}
