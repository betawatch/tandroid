package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.b80;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class l7 extends FrameLayout {
    public final Paint a;
    public final ImageView b;
    public final ImageView c;
    public final org.telegram.ui.Components.j6 d;
    public final org.telegram.ui.Components.j6 e;
    public final ImageView f;
    public final SpannableString h;
    public final SpannableString n;

    public l7(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        setWillNotDraw(false);
        paint.setColor(-16777216);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.filled_link);
        imageView.setColorFilter(new PorterDuffColorFilter(-15033089, PorterDuff.Mode.SRC_IN));
        addView(imageView, c8.ha.d(48, 48.0f, 19, 9.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setBackground(new j7(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(2.4f), -15033089));
        addView(imageView2, c8.ha.d(48, 48.0f, 19, 9.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, false, false);
        this.d = j6Var;
        j6Var.setTextColor(-15033089);
        j6Var.setTextSize(org.telegram.messenger.g0.L(14.21f));
        j6Var.setTypeface(org.telegram.messenger.g0.o());
        j6Var.setEllipsizeByGradient(true);
        org.telegram.ui.Components.i6 drawable = j6Var.getDrawable();
        Point point = org.telegram.messenger.g0.q;
        drawable.M = point.x;
        addView(j6Var, c8.ha.d(-1, 24.0f, 55, 57.0f, 2.33f, 48.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(context, false, false, false);
        this.e = j6Var2;
        j6Var2.setTextColor(-8355712);
        j6Var2.setTextSize(org.telegram.messenger.g0.L(14.21f));
        j6Var2.setEllipsizeByGradient(true);
        j6Var2.getDrawable().M = point.x;
        addView(j6Var2, c8.ha.d(-1, 24.0f, 55, 57.0f, 20.66f, 48.0f, 0.0f));
        int textColor = j6Var.getTextColor();
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        b80 b80Var = new b80(org.telegram.messenger.g0.L(200.0f), j6Var);
        b80Var.e = 0.8f;
        b80Var.a(org.telegram.ui.ActionBar.k6.r1(0.4f, textColor), org.telegram.ui.ActionBar.k6.r1(0.08f, textColor));
        spannableString.setSpan(b80Var, 0, spannableString.length(), 33);
        int textColor2 = j6Var2.getTextColor();
        SpannableString spannableString2 = new SpannableString("x");
        this.n = spannableString2;
        b80 b80Var2 = new b80(org.telegram.messenger.g0.L(140.0f), j6Var2);
        b80Var2.e = 0.8f;
        b80Var2.a(org.telegram.ui.ActionBar.k6.r1(0.4f, textColor2), org.telegram.ui.ActionBar.k6.r1(0.08f, textColor2));
        spannableString2.setSpan(b80Var2, 0, spannableString2.length(), 33);
        ImageView imageView3 = new ImageView(context);
        this.f = imageView3;
        imageView3.setColorFilter(new PorterDuffColorFilter(1694498815, PorterDuff.Mode.MULTIPLY));
        imageView3.setImageResource(R.drawable.input_clear);
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(org.telegram.ui.ActionBar.k6.h0(436207615, 1, org.telegram.messenger.g0.L(18.0f)));
        addView(imageView3, c8.ha.d(48, 48.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth();
        float f12 = org.telegram.messenger.g0.f1();
        Paint paint = this.a;
        canvas.drawRect(0.0f, 0.0f, width, f12, paint);
        canvas.drawRect(0.0f, getHeight() - org.telegram.messenger.g0.f1(), getWidth(), getHeight(), paint);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
    }
}
