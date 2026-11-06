package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class ja extends FrameLayout {
    public final TextView a;
    public final ImageView b;
    public w6 c;
    public float d;
    public float e;
    public boolean f;

    public ja(Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setSingleLine(true);
        textView.setIncludeFontPadding(false);
        textView.setGravity(21);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        addView(textView);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImportantForAccessibility(2);
        addView(imageView, c8.ha.c(16.0f, 16));
    }

    public final void a() {
        float height = (((getHeight() * 0.5f) - org.telegram.messenger.g0.L(19.0f)) * this.d) + org.telegram.messenger.g0.L(19.0f);
        float width = getWidth() - (c() * 0.5f);
        TextView textView = this.a;
        textView.setPivotX(textView.getWidth());
        textView.setPivotY(textView.getHeight() * 0.5f);
        textView.setScaleX((this.d * 0.42857146f) + 1.0f);
        textView.setScaleY((this.d * 0.42857146f) + 1.0f);
        textView.setTranslationX(((getWidth() - c()) - b()) - textView.getWidth());
        textView.setTranslationY(height - (textView.getHeight() * 0.5f));
        ImageView imageView = this.b;
        imageView.setTranslationX(width - org.telegram.messenger.g0.L(8.0f));
        imageView.setTranslationY(height - org.telegram.messenger.g0.L(8.0f));
        imageView.setAlpha(1.0f - this.d);
        w6 w6Var = this.c;
        if (w6Var != null) {
            w6Var.setTranslationX(width - org.telegram.messenger.g0.L(20.0f));
            this.c.setTranslationY(height - org.telegram.messenger.g0.L(20.0f));
            this.c.setPivotX(org.telegram.messenger.g0.L(20.0f));
            this.c.setPivotY(org.telegram.messenger.g0.L(20.0f));
            this.c.setScaleX(((this.d * 0.4f) + 0.6f) * ((this.e * 0.12f) + 1.0f));
            this.c.setScaleY(((this.d * 0.4f) + 0.6f) * (1.0f - (this.e * 0.18f)));
            this.c.setAlpha(this.f ? 0.0f : this.d);
        }
    }

    public final float b() {
        return ((org.telegram.messenger.g0.L(7.0f) - org.telegram.messenger.g0.L(2.0f)) * this.d) + org.telegram.messenger.g0.L(2.0f);
    }

    public final float c() {
        return ((org.telegram.messenger.g0.L(23.0f) - org.telegram.messenger.g0.L(16.0f)) * this.d) + org.telegram.messenger.g0.L(16.0f);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        TextView textView = this.a;
        textView.layout(0, 0, textView.getMeasuredWidth(), textView.getMeasuredHeight());
        this.b.layout(0, 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        w6 w6Var = this.c;
        if (w6Var != null) {
            w6Var.layout(0, 0, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f));
        }
        a();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (Math.max(0, View.MeasureSpec.getSize(i7) - Math.round(b() + c())) / ((this.d * 0.42857146f) + 1.0f)), TLObject.FLAG_31);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(16.0f), TLObject.FLAG_30);
        this.a.measure(makeMeasureSpec, makeMeasureSpec2);
        this.b.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(16.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(16.0f), TLObject.FLAG_30));
        w6 w6Var = this.c;
        if (w6Var != null) {
            w6Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(40.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(40.0f), TLObject.FLAG_30));
        }
        setMeasuredDimension(View.resolveSize((int) Math.ceil(c() + b() + com.google.android.recaptcha.internal.a.B(this.d, 0.42857146f, 1.0f, r6.getMeasuredWidth())), i7), View.resolveSize(org.telegram.messenger.g0.L(40.0f), i10));
    }
}
