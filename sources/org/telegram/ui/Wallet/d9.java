package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class d9 extends FrameLayout {
    public final TextView a;
    public final ImageView b;
    public c6 c;
    public float d;
    public float e;
    public boolean f;

    public d9(Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setSingleLine(true);
        textView.setIncludeFontPadding(false);
        textView.setGravity(21);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        addView(textView);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImportantForAccessibility(2);
        addView(imageView, w7.x5.d(16.0f, 16));
    }

    public final void a() {
        float height = (((getHeight() * 0.5f) - AndroidUtilities.dp(19.0f)) * this.d) + AndroidUtilities.dp(19.0f);
        float width = getWidth() - (c() * 0.5f);
        TextView textView = this.a;
        textView.setPivotX(textView.getWidth());
        textView.setPivotY(textView.getHeight() * 0.5f);
        textView.setScaleX((this.d * 0.42857146f) + 1.0f);
        textView.setScaleY((this.d * 0.42857146f) + 1.0f);
        textView.setTranslationX(((getWidth() - c()) - b()) - textView.getWidth());
        textView.setTranslationY(height - (textView.getHeight() * 0.5f));
        ImageView imageView = this.b;
        imageView.setTranslationX(width - AndroidUtilities.dp(8.0f));
        imageView.setTranslationY(height - AndroidUtilities.dp(8.0f));
        imageView.setAlpha(1.0f - this.d);
        c6 c6Var = this.c;
        if (c6Var != null) {
            c6Var.setTranslationX(width - AndroidUtilities.dp(20.0f));
            this.c.setTranslationY(height - AndroidUtilities.dp(20.0f));
            this.c.setPivotX(AndroidUtilities.dp(20.0f));
            this.c.setPivotY(AndroidUtilities.dp(20.0f));
            this.c.setScaleX(((this.d * 0.4f) + 0.6f) * ((this.e * 0.12f) + 1.0f));
            this.c.setScaleY(((this.d * 0.4f) + 0.6f) * (1.0f - (this.e * 0.18f)));
            this.c.setAlpha(this.f ? 0.0f : this.d);
        }
    }

    public final float b() {
        return ((AndroidUtilities.dp(7.0f) - AndroidUtilities.dp(2.0f)) * this.d) + AndroidUtilities.dp(2.0f);
    }

    public final float c() {
        return ((AndroidUtilities.dp(23.0f) - AndroidUtilities.dp(16.0f)) * this.d) + AndroidUtilities.dp(16.0f);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        TextView textView = this.a;
        textView.layout(0, 0, textView.getMeasuredWidth(), textView.getMeasuredHeight());
        this.b.layout(0, 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        c6 c6Var = this.c;
        if (c6Var != null) {
            c6Var.layout(0, 0, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
        }
        a();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (Math.max(0, View.MeasureSpec.getSize(i10) - Math.round(b() + c())) / ((this.d * 0.42857146f) + 1.0f)), TLObject.FLAG_31);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.0f), TLObject.FLAG_30);
        this.a.measure(makeMeasureSpec, makeMeasureSpec2);
        this.b.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.0f), TLObject.FLAG_30));
        c6 c6Var = this.c;
        if (c6Var != null) {
            c6Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), TLObject.FLAG_30));
        }
        setMeasuredDimension(View.resolveSize((int) Math.ceil(c() + b() + com.google.android.gms.internal.vision.e2.A(this.d, 0.42857146f, 1.0f, r6.getMeasuredWidth())), i10), View.resolveSize(AndroidUtilities.dp(40.0f), i11));
    }
}
