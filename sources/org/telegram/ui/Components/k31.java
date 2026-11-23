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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class k31 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.i6 a;
    public boolean b;
    public final h31 c;
    public final TextView d;
    public final FrameLayout.LayoutParams e;
    public final i31 f;
    public boolean h;
    public final ImageView n;
    public int r;
    public final c6 s;

    public k31(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.r = -1;
        this.s = new c6(this, 0L, 320L, kr.h);
        this.a = i6Var;
        setClipToPadding(false);
        setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f));
        h31 h31Var = new h31(this, context);
        this.c = h31Var;
        org.telegram.messenger.ks.i(h31Var);
        h31Var.setTextSize(1, 16.0f);
        h31Var.setMaxLines(1);
        h31Var.setSingleLine();
        h31Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(h31Var, c8.na.c(-2.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        org.telegram.messenger.m10.l(14.0f, 2131751449, 1, textView, null);
        textView.setIncludeFontPadding(false);
        textView.setGravity(17);
        Rect rect = new Rect();
        Paint.FontMetrics fontMetrics = textView.getPaint().getFontMetrics();
        textView.getPaint().getTextBounds("x", 0, 1, rect);
        float f10 = (rect.top / 2.0f) - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f);
        int round = Math.round(Math.abs(f10) * 2.0f);
        textView.setPadding(org.telegram.messenger.g0.L(8.0f), f10 < 0.0f ? round : 0, org.telegram.messenger.g0.L(8.0f), f10 <= 0.0f ? 0 : round);
        c8.sa.a(textView);
        Paint.FontMetrics fontMetrics2 = h31Var.getPaint().getFontMetrics();
        h31Var.getPaint().getTextBounds("x", 0, 1, rect);
        addView(textView, c8.na.d(-2, 18.0f, 53, 0.0f, Math.max(0.0f, (((rect.top / 2.0f) + (-(h31Var.getIncludeFontPadding() ? fontMetrics2.top : fontMetrics2.ascent))) - org.telegram.messenger.g0.L(9.0f)) / org.telegram.messenger.g0.p), 0.0f, 0.0f));
        i31 i31Var = new i31(context);
        this.f = i31Var;
        org.telegram.messenger.ks.i(i31Var);
        i31Var.setTextSize(1, 16.0f);
        i31Var.setTextIsSelectable(true);
        FrameLayout.LayoutParams c10 = c8.na.c(-2.0f, -1);
        this.e = c10;
        addView(i31Var, c10);
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        imageView.setImageResource(R.drawable.msg_copy);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(org.telegram.messenger.gd.N0(2131751755, null));
        c8.sa.a(imageView);
        addView(imageView, c8.na.d(38, 38.0f, 85, 0.0f, 0.0f, -16.0f, -12.0f));
        imageView.setVisibility(8);
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.lg));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.mg));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Fi));
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
            Paint W0 = org.telegram.ui.ActionBar.n6.W0("paintDivider", this.a);
            if (W0 == null) {
                W0 = org.telegram.ui.ActionBar.n6.k0;
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
        i31 i31Var = this.f;
        if (Build.VERSION.SDK_INT < 29 || org.telegram.messenger.c6.i()) {
            return;
        }
        try {
            Drawable textSelectHandleLeft = i31Var.getTextSelectHandleLeft();
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            textSelectHandleLeft.setColorFilter(i7, mode);
            i31Var.setTextSelectHandleLeft(textSelectHandleLeft);
            Drawable textSelectHandle = i31Var.getTextSelectHandle();
            textSelectHandle.setColorFilter(i7, mode);
            i31Var.setTextSelectHandle(textSelectHandle);
            Drawable textSelectHandleRight = i31Var.getTextSelectHandleRight();
            textSelectHandleRight.setColorFilter(i7, mode);
            i31Var.setTextSelectHandleRight(textSelectHandleRight);
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.i6 i6Var = this.a;
        this.c.setTextColor(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        int i10 = org.telegram.ui.ActionBar.n6.L6;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i10, i6Var);
        TextView textView = this.d;
        textView.setTextColor(w02);
        textView.setBackground(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(9.0f), org.telegram.ui.ActionBar.n6.r1(0.1f, org.telegram.ui.ActionBar.n6.w0(i10, i6Var))));
        int w03 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
        i31 i31Var = this.f;
        i31Var.setTextColor(w03);
        i31Var.setLinkTextColor(org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
        i31Var.setHighlightColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.lg, i6Var));
        setHandlesColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.mg, i6Var));
        int i11 = org.telegram.ui.ActionBar.n6.Fi;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.w0(i11, i6Var), PorterDuff.Mode.SRC_IN);
        ImageView imageView = this.n;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.r1(0.1f, org.telegram.ui.ActionBar.n6.w0(i11, i6Var)), 1, -1));
    }
}
