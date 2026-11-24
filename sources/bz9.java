// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bz9 extends FrameLayout {
    public final TextView a;
    public final s09 b;
    public final ImageView c;
    public float d;
    public ValueAnimator e;
    public final /* synthetic */ vz9 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bz9(vz9 vz9Var, Context context, boolean z) {
        super(context);
        this.f = vz9Var;
        LinearLayout i = hg9.i(context, 0);
        addView(i, qoe.e(-2, -2, z ? 3 : 17));
        s09 s09Var = new s09(context);
        this.b = s09Var;
        s09Var.f(R.raw.unlock_icon, 20, 20, null);
        int i2 = cmb.Kf;
        ylb ylbVar = vz9Var.a1;
        anb.s(s09Var, i2, ylbVar, PorterDuff.Mode.SRC_ATOP);
        i.addView(s09Var, qoe.o(20, 20));
        TextView textView = new TextView(context);
        this.a = textView;
        anb.X(textView, i2, ylbVar);
        textView.setTypeface(gm.o());
        textView.setTextSize(1, 14.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        i.addView(textView, qoe.r(-2, -2, 17));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        anb.s(imageView, cmb.Mf, ylbVar, PorterDuff.Mode.MULTIPLY);
        addView(imageView, qoe.e(24, 24, 21));
    }

    public final void a(String str, boolean z) {
        this.a.setText(str);
        b(z);
    }

    public final void b(boolean z) {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.e = null;
        }
        this.d = z ? 1.0f : 0.0f;
        float L = (1.0f - this.d) * gm.L(-8.0f);
        s09 s09Var = this.b;
        s09Var.setTranslationX(L);
        this.a.setTranslationX((1.0f - this.d) * gm.L(-8.0f));
        s09Var.setAlpha(this.d);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(30.0f), TLObject.FLAG_30));
    }
}
