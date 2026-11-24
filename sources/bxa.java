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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bxa extends FrameLayout {
    public final ylb a;
    public final Drawable b;
    public final Drawable c;
    public final TextView d;
    public final io e;
    public SpannableString f;
    public boolean h;
    public int n;
    public final ln r;

    public bxa(Context context, ylb ylbVar) {
        super(context);
        this.r = new ln(this, 0L, 500L, d53.h);
        this.a = ylbVar;
        Drawable d = b10.d(context, R.drawable.star_small_outline);
        this.b = d;
        anb.x(this, d, cmb.g5, ylbVar, PorterDuff.Mode.SRC_IN);
        this.c = b10.d(context, R.drawable.star_small_inner);
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.d = textView;
        wi8.v(textView, 1, 15.0f);
        anb.X(textView, cmb.F6, ylbVar);
        addView(textView, qoe.i(-2.0f, -2.0f, 8388627, 48.0f, 0.0f, 0.0f, 0.0f));
        io ioVar = new io(context, false, false, false);
        this.e = ioVar;
        ioVar.setTextSize(gm.L(15.0f));
        anb.U(ioVar, cmb.y6, ylbVar);
        ioVar.setGravity(jb6.a0 ? 3 : 5);
        addView(ioVar, qoe.i(-2.0f, 21.0f, 8388629, 0.0f, 0.0f, 19.0f, 0.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float e = this.r.e(false, this.n);
        float f = jb6.a0 ? -1.0f : 1.0f;
        float L = gm.L(24.0f);
        float L2 = gm.L(24.0f);
        float L3 = gm.L(2.5f);
        float width = jb6.a0 ? (getWidth() - gm.L(19.0f)) - L : gm.L(19.0f);
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
            ylb ylbVar = this.a;
            Paint d = ylbVar != null ? ylbVar.d("paintDivider") : null;
            if (d == null) {
                d = cmb.j0;
            }
            canvas.drawRect(jb6.a0 ? 0.0f : gm.L(22.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (jb6.a0 ? gm.L(22.0f) : 0), getMeasuredHeight(), d);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), TLObject.FLAG_30));
    }
}
