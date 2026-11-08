package bi;

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
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class qc extends FrameLayout {
    public final org.telegram.ui.ActionBar.f6 a;
    public final Drawable b;
    public final Drawable c;
    public final TextView d;
    public final org.telegram.ui.Components.j6 e;
    public SpannableString f;
    public boolean h;
    public int n;
    public final org.telegram.ui.Components.w5 r;

    public qc(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.r = new org.telegram.ui.Components.w5(this, 0L, 500L, xq.h);
        this.a = f6Var;
        Drawable h = jg.g.h(context, R.drawable.star_small_outline);
        this.b = h;
        org.telegram.ui.ActionBar.r6.y(this, h, org.telegram.ui.ActionBar.k6.h5, f6Var, PorterDuff.Mode.SRC_IN);
        this.c = jg.g.h(context, R.drawable.star_small_inner);
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.d = textView;
        org.telegram.messenger.camera.q.m(textView, 1, 15.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, f6Var);
        addView(textView, c8.ha.i(-2.0f, -2.0f, 8388627, 48.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, false, false);
        this.e = j6Var;
        j6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.r6.Z(j6Var, org.telegram.ui.ActionBar.k6.z6, f6Var);
        j6Var.setGravity(org.telegram.messenger.id.a0 ? 3 : 5);
        addView(j6Var, c8.ha.i(-2.0f, 21.0f, 8388629, 0.0f, 0.0f, 19.0f, 0.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float e10 = this.r.e(false, this.n);
        float f10 = org.telegram.messenger.id.a0 ? -1.0f : 1.0f;
        float L = org.telegram.messenger.g0.L(24.0f);
        float L2 = org.telegram.messenger.g0.L(24.0f);
        float L3 = org.telegram.messenger.g0.L(2.5f);
        float width = org.telegram.messenger.id.a0 ? (getWidth() - org.telegram.messenger.g0.L(19.0f)) - L : org.telegram.messenger.g0.L(19.0f);
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
            org.telegram.ui.ActionBar.f6 f6Var = this.a;
            Paint d = f6Var != null ? f6Var.d("paintDivider") : null;
            if (d == null) {
                d = org.telegram.ui.ActionBar.k6.k0;
            }
            canvas.drawRect(org.telegram.messenger.id.a0 ? 0.0f : org.telegram.messenger.g0.L(22.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.id.a0 ? org.telegram.messenger.g0.L(22.0f) : 0), getMeasuredHeight(), d);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
    }
}
