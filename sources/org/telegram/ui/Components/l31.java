package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class l31 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.h6 a;
    public boolean b;
    public final i31 c;
    public final TextView d;
    public final FrameLayout.LayoutParams e;
    public final j31 f;
    public boolean h;
    public final ImageView n;
    public int r;
    public final d6 s;

    public l31(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.r = -1;
        this.s = new d6(this, 0L, 320L, nr.h);
        this.a = h6Var;
        setClipToPadding(false);
        setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f));
        i31 i31Var = new i31(this, context);
        this.c = i31Var;
        org.telegram.messenger.ks.i(i31Var);
        i31Var.setTextSize(1, 16.0f);
        i31Var.setMaxLines(1);
        i31Var.setSingleLine();
        i31Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(i31Var, c8.ma.c(-2.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        org.telegram.messenger.n10.l(14.0f, 2131751449, 1, textView, null);
        textView.setIncludeFontPadding(false);
        textView.setGravity(17);
        Rect rect = new Rect();
        Paint.FontMetrics fontMetrics = textView.getPaint().getFontMetrics();
        textView.getPaint().getTextBounds("x", 0, 1, rect);
        float f10 = (rect.top / 2.0f) - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f);
        int round = Math.round(Math.abs(f10) * 2.0f);
        textView.setPadding(org.telegram.messenger.g0.L(8.0f), f10 < 0.0f ? round : 0, org.telegram.messenger.g0.L(8.0f), f10 <= 0.0f ? 0 : round);
        c8.ra.a(textView);
        Paint.FontMetrics fontMetrics2 = i31Var.getPaint().getFontMetrics();
        i31Var.getPaint().getTextBounds("x", 0, 1, rect);
        addView(textView, c8.ma.d(-2, 18.0f, 53, 0.0f, Math.max(0.0f, (((rect.top / 2.0f) + (-(i31Var.getIncludeFontPadding() ? fontMetrics2.top : fontMetrics2.ascent))) - org.telegram.messenger.g0.L(9.0f)) / org.telegram.messenger.g0.p), 0.0f, 0.0f));
        j31 j31Var = new j31(context);
        this.f = j31Var;
        org.telegram.messenger.ks.i(j31Var);
        j31Var.setTextSize(1, 16.0f);
        j31Var.setTextIsSelectable(true);
        FrameLayout.LayoutParams c10 = c8.ma.c(-2.0f, -1);
        this.e = c10;
        addView(j31Var, c10);
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        imageView.setImageResource(R.drawable.msg_copy);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(org.telegram.messenger.gd.N0(2131751755, null));
        c8.ra.a(imageView);
        addView(imageView, c8.ma.d(38, 38.0f, 85, 0.0f, 0.0f, -16.0f, -12.0f));
        imageView.setVisibility(8);
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.lg));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.mg));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Fi));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), this.s.e(false, this.r));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.b) {
            View view = this.h ? this.c : this.f;
            Paint W0 = org.telegram.ui.ActionBar.m6.W0("paintDivider", this.a);
            if (W0 == null) {
                W0 = org.telegram.ui.ActionBar.m6.k0;
            }
            Paint paint = W0;
            if (org.telegram.messenger.gd.a0) {
                canvas.drawRect(0.0f, getMeasuredHeight() - 1, view.getRight(), getMeasuredHeight(), paint);
            } else {
                canvas.drawRect(view.getLeft(), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), paint);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        this.r = getMeasuredHeight();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30);
        FrameLayout.LayoutParams layoutParams = this.e;
        layoutParams.bottomMargin = 0;
        super.onMeasure(makeMeasureSpec, i10);
        if (this.n.getVisibility() == 0) {
            Layout layout = this.f.getLayout();
            if (layout.getLineCount() > 0 && layout.getLineRight(layout.getLineCount() - 1) > layout.getWidth() - org.telegram.messenger.g0.L(42.0f)) {
                layoutParams.bottomMargin = org.telegram.messenger.g0.L(26.0f);
                super.onMeasure(makeMeasureSpec, i10);
            }
        }
        if (getMeasuredHeight() > this.r && !this.h) {
            this.r = getMeasuredHeight();
            invalidate();
        } else {
            int measuredHeight = getMeasuredHeight();
            this.r = measuredHeight;
            this.s.e(true, measuredHeight);
        }
    }

    public void setHandlesColor(int i7) {
        j31 j31Var = this.f;
        if (Build.VERSION.SDK_INT < 29 || org.telegram.messenger.c6.i()) {
            return;
        }
        try {
            Drawable textSelectHandleLeft = j31Var.getTextSelectHandleLeft();
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            textSelectHandleLeft.setColorFilter(i7, mode);
            j31Var.setTextSelectHandleLeft(textSelectHandleLeft);
            Drawable textSelectHandle = j31Var.getTextSelectHandle();
            textSelectHandle.setColorFilter(i7, mode);
            j31Var.setTextSelectHandle(textSelectHandle);
            Drawable textSelectHandleRight = j31Var.getTextSelectHandleRight();
            textSelectHandleRight.setColorFilter(i7, mode);
            j31Var.setTextSelectHandleRight(textSelectHandleRight);
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.h6 h6Var = this.a;
        this.c.setTextColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        int i10 = org.telegram.ui.ActionBar.m6.L6;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
        TextView textView = this.d;
        textView.setTextColor(w02);
        textView.setBackground(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(9.0f), org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(i10, h6Var))));
        int w03 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        j31 j31Var = this.f;
        j31Var.setTextColor(w03);
        j31Var.setLinkTextColor(org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        j31Var.setHighlightColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.lg, h6Var));
        setHandlesColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.mg, h6Var));
        int i11 = org.telegram.ui.ActionBar.m6.Fi;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.w0(i11, h6Var), PorterDuff.Mode.SRC_IN);
        ImageView imageView = this.n;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(i11, h6Var)), 1, -1));
    }
}
