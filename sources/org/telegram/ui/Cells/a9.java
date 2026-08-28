package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class a9 extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final ImageView c;
    public boolean d;
    public boolean e;

    public a9(Context context) {
        super(context);
        TextView textView = new TextView(context);
        this.a = textView;
        ll.s(textView, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false), 1, 16.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        addView(textView, g7.e6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 21.0f, 10.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.z6, false));
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        addView(textView2, g7.e6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 21.0f, 35.0f, 21.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.m6, false), PorterDuff.Mode.MULTIPLY));
        imageView.setVisibility(8);
        addView(imageView, g7.e6.d(52, 52.0f, (LocaleController.isRTL ? 5 : 3) | 48, 8.0f, 6.0f, 8.0f, 0.0f));
    }

    public final void a(String str, String str2, boolean z10) {
        this.a.setText(str);
        this.b.setText(str2);
        this.d = z10;
        this.c.setVisibility(8);
        setWillNotDraw(!z10);
    }

    public final void b(int i9, String str, String str2, boolean z10) {
        TextView textView = this.a;
        textView.setText(str);
        TextView textView2 = this.b;
        textView2.setText(str2);
        ImageView imageView = this.c;
        imageView.setImageResource(i9);
        imageView.setVisibility(0);
        textView.setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(50.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(50.0f) : 0, 0);
        textView2.setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(50.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(50.0f) : 0, this.e ? AndroidUtilities.dp(12.0f) : 0);
        this.d = z10;
        setWillNotDraw(!z10);
    }

    public TextView getTextView() {
        return this.a;
    }

    public TextView getValueTextView() {
        return this.b;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float dp;
        int i9;
        if (!this.d || org.telegram.ui.ActionBar.f6.k0 == null) {
            return;
        }
        boolean z10 = LocaleController.isRTL;
        ImageView imageView = this.c;
        if (z10) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(imageView.getVisibility() == 0 ? 71.0f : 20.0f);
        }
        float measuredHeight = getMeasuredHeight() - 1;
        int measuredWidth = getMeasuredWidth();
        if (LocaleController.isRTL) {
            i9 = AndroidUtilities.dp(imageView.getVisibility() == 0 ? 71.0f : 20.0f);
        } else {
            i9 = 0;
        }
        canvas.drawLine(dp, measuredHeight, measuredWidth - i9, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.k0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        if (this.e) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.d ? 1 : 0), TLObject.FLAG_30));
        }
    }

    public void setMultilineDetail(boolean z10) {
        this.e = z10;
        TextView textView = this.b;
        if (z10) {
            textView.setLines(0);
            textView.setMaxLines(0);
            textView.setSingleLine(false);
            textView.setPadding(0, 0, 0, AndroidUtilities.dp(12.0f));
            return;
        }
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setPadding(0, 0, 0, 0);
    }

    public void setValue(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
