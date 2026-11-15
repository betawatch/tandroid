package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ya extends FrameLayout {
    public final org.telegram.ui.ActionBar.e6 a;
    public final Drawable b;
    public final Drawable c;
    public final TextView d;
    public final org.telegram.ui.Components.h6 e;
    public SpannableString f;
    public boolean h;
    public int n;
    public final org.telegram.ui.Components.u5 r;

    public ya(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.r = new org.telegram.ui.Components.u5(this, 0L, 500L, er.h);
        this.a = e6Var;
        Drawable g10 = i5.c.g(context, R.drawable.star_small_outline);
        this.b = g10;
        org.telegram.ui.ActionBar.q6.x(this, g10, org.telegram.ui.ActionBar.j6.h5, e6Var, PorterDuff.Mode.SRC_IN);
        this.c = i5.c.g(context, R.drawable.star_small_inner);
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.d = textView;
        i20.o(textView, 1, 15.0f);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.G6, e6Var);
        addView(textView, c8.ja.i(-2.0f, -2.0f, 8388627, 48.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, false, false);
        this.e = h6Var;
        h6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.q6.Y(h6Var, org.telegram.ui.ActionBar.j6.z6, e6Var);
        h6Var.setGravity(hd.a0 ? 3 : 5);
        addView(h6Var, c8.ja.i(-2.0f, 21.0f, 8388629, 0.0f, 0.0f, 19.0f, 0.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float e10 = this.r.e(false, this.n);
        float f10 = hd.a0 ? -1.0f : 1.0f;
        float L = org.telegram.messenger.g0.L(24.0f);
        float L2 = org.telegram.messenger.g0.L(24.0f);
        float L3 = org.telegram.messenger.g0.L(2.5f);
        float width = hd.a0 ? (getWidth() - org.telegram.messenger.g0.L(19.0f)) - L : org.telegram.messenger.g0.L(19.0f);
        int ceil = ((int) Math.ceil(e10)) - 1;
        while (true) {
            if (ceil < 0) {
                break;
            }
            float i7 = Utilities.i(e10 - ceil, 1.0f, 0.0f);
            float f11 = (((ceil - 1) - (1.0f - i7)) * L3 * f10) + width;
            float measuredHeight = (getMeasuredHeight() - L2) / 2.0f;
            int i10 = (int) f11;
            int i11 = (int) measuredHeight;
            int i12 = (int) (f11 + L);
            int i13 = (int) (measuredHeight + L2);
            Drawable drawable = this.b;
            drawable.setBounds(i10, i11, i12, i13);
            int i14 = (int) (i7 * 255.0f);
            drawable.setAlpha(i14);
            drawable.draw(canvas);
            Drawable drawable2 = this.c;
            drawable2.setBounds(i10, i11, i12, i13);
            drawable2.setAlpha(i14);
            drawable2.draw(canvas);
            ceil--;
        }
        if (this.h) {
            org.telegram.ui.ActionBar.e6 e6Var = this.a;
            Paint d = e6Var != null ? e6Var.d("paintDivider") : null;
            if (d == null) {
                d = org.telegram.ui.ActionBar.j6.k0;
            }
            canvas.drawRect(hd.a0 ? 0.0f : org.telegram.messenger.g0.L(22.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (hd.a0 ? org.telegram.messenger.g0.L(22.0f) : 0), getMeasuredHeight(), d);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
    }
}
