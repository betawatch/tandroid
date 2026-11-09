package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class v21 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 a;
    public boolean b;
    public final s21 c;
    public final TextView d;
    public final FrameLayout.LayoutParams e;
    public final t21 f;
    public boolean h;
    public final ImageView n;
    public int r;
    public final w5 s;

    public v21(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.r = -1;
        this.s = new w5(this, 0L, 320L, xq.h);
        this.a = g6Var;
        setClipToPadding(false);
        setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f));
        s21 s21Var = new s21(this, context);
        this.c = s21Var;
        org.telegram.messenger.qs.i(s21Var);
        s21Var.setTextSize(1, 16.0f);
        s21Var.setMaxLines(1);
        s21Var.setSingleLine();
        s21Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(s21Var, c8.ha.c(-2.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setText(org.telegram.messenger.id.M0(2131751461, null));
        textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        textView.setGravity(17);
        c8.ka.a(textView);
        addView(textView, c8.ha.d(-2, 18.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        t21 t21Var = new t21(context);
        this.f = t21Var;
        org.telegram.messenger.qs.i(t21Var);
        t21Var.setTextSize(1, 16.0f);
        t21Var.setTextIsSelectable(true);
        FrameLayout.LayoutParams c10 = c8.ha.c(-2.0f, -1);
        this.e = c10;
        addView(t21Var, c10);
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        imageView.setImageResource(R.drawable.msg_copy);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(org.telegram.messenger.id.M0(2131751767, null));
        c8.ka.a(imageView);
        addView(imageView, c8.ha.d(38, 38.0f, 85, 0.0f, 0.0f, -16.0f, -12.0f));
        imageView.setVisibility(8);
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.ig));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.jg));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Ci));
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
            Paint W0 = org.telegram.ui.ActionBar.l6.W0("paintDivider", this.a);
            if (W0 == null) {
                W0 = org.telegram.ui.ActionBar.l6.k0;
            }
            Paint paint = W0;
            if (org.telegram.messenger.id.a0) {
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
        t21 t21Var = this.f;
        if (Build.VERSION.SDK_INT < 29 || org.telegram.messenger.as.i()) {
            return;
        }
        try {
            Drawable textSelectHandleLeft = t21Var.getTextSelectHandleLeft();
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            textSelectHandleLeft.setColorFilter(i7, mode);
            t21Var.setTextSelectHandleLeft(textSelectHandleLeft);
            Drawable textSelectHandle = t21Var.getTextSelectHandle();
            textSelectHandle.setColorFilter(i7, mode);
            t21Var.setTextSelectHandle(textSelectHandle);
            Drawable textSelectHandleRight = t21Var.getTextSelectHandleRight();
            textSelectHandleRight.setColorFilter(i7, mode);
            t21Var.setTextSelectHandleRight(textSelectHandleRight);
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.l6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.a;
        this.c.setTextColor(org.telegram.ui.ActionBar.l6.w0(i7, g6Var));
        int i10 = org.telegram.ui.ActionBar.l6.L6;
        int w02 = org.telegram.ui.ActionBar.l6.w0(i10, g6Var);
        TextView textView = this.d;
        textView.setTextColor(w02);
        textView.setBackground(org.telegram.ui.ActionBar.l6.d0(org.telegram.messenger.g0.L(9.0f), org.telegram.ui.ActionBar.l6.r1(0.1f, org.telegram.ui.ActionBar.l6.w0(i10, g6Var))));
        int w03 = org.telegram.ui.ActionBar.l6.w0(i7, g6Var);
        t21 t21Var = this.f;
        t21Var.setTextColor(w03);
        t21Var.setLinkTextColor(org.telegram.ui.ActionBar.l6.w0(i10, g6Var));
        t21Var.setHighlightColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.ig, g6Var));
        setHandlesColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.jg, g6Var));
        int i11 = org.telegram.ui.ActionBar.l6.Ci;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.l6.w0(i11, g6Var), PorterDuff.Mode.SRC_IN);
        ImageView imageView = this.n;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.r1(0.1f, org.telegram.ui.ActionBar.l6.w0(i11, g6Var)), 1, -1));
    }
}
