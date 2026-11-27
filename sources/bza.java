// default package

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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class bza extends FrameLayout {
    public final vnb a;
    public final Drawable b;
    public final Drawable c;
    public final TextView d;
    public final in e;
    public SpannableString f;
    public boolean h;
    public int n;
    public final mm r;

    public bza(Context context, vnb vnbVar) {
        super(context);
        this.r = new mm(this, 0L, 500L, k43.h);
        this.a = vnbVar;
        Drawable e = c00.e(context, R.drawable.star_small_outline);
        this.b = e;
        yob.x(this, e, aob.h5, vnbVar, PorterDuff.Mode.SRC_IN);
        this.c = c00.e(context, R.drawable.star_small_inner);
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.d = textView;
        ik8.v(textView, 1, 15.0f);
        yob.X(textView, aob.G6, vnbVar);
        addView(textView, tre.i(-2.0f, -2.0f, 8388627, 48.0f, 0.0f, 0.0f, 0.0f));
        in inVar = new in(context, false, false, false);
        this.e = inVar;
        inVar.setTextSize(hl.L(15.0f));
        yob.U(inVar, aob.z6, vnbVar);
        inVar.setGravity(ob6.a0 ? 3 : 5);
        addView(inVar, tre.i(-2.0f, 21.0f, 8388629, 0.0f, 0.0f, 19.0f, 0.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float e = this.r.e(false, this.n);
        float f = ob6.a0 ? -1.0f : 1.0f;
        float L = hl.L(24.0f);
        float L2 = hl.L(24.0f);
        float L3 = hl.L(2.5f);
        float width = ob6.a0 ? (getWidth() - hl.L(19.0f)) - L : hl.L(19.0f);
        int ceil = (int) Math.ceil(e);
        while (true) {
            ceil--;
            if (ceil < 0) {
                break;
            }
            float i = Utilities.i(e - ceil, 1.0f, 0.0f);
            float f2 = (((ceil - 1) - (1.0f - i)) * L3 * f) + width;
            float measuredHeight = (getMeasuredHeight() - L2) / 2.0f;
            int i2 = (int) f2;
            int i3 = (int) measuredHeight;
            int i4 = (int) (f2 + L);
            int i5 = (int) (measuredHeight + L2);
            Drawable drawable = this.b;
            drawable.setBounds(i2, i3, i4, i5);
            int i6 = (int) (i * 255.0f);
            drawable.setAlpha(i6);
            drawable.draw(canvas);
            Drawable drawable2 = this.c;
            drawable2.setBounds(i2, i3, i4, i5);
            drawable2.setAlpha(i6);
            drawable2.draw(canvas);
        }
        if (this.h) {
            vnb vnbVar = this.a;
            Paint d = vnbVar != null ? vnbVar.d("paintDivider") : null;
            if (d == null) {
                d = aob.j0;
            }
            canvas.drawRect(ob6.a0 ? 0.0f : hl.L(22.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (ob6.a0 ? hl.L(22.0f) : 0), getMeasuredHeight(), d);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), TLObject.FLAG_30));
    }
}
