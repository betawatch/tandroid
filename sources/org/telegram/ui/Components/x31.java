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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class x31 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.p6 a;
    public boolean b;
    public final u31 c;
    public final TextView d;
    public final FrameLayout.LayoutParams e;
    public final v31 f;
    public boolean h;
    public final ImageView n;
    public int r;
    public final t5 s;

    public x31(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.r = -1;
        this.s = new t5(this, 0L, 320L, gr.h);
        this.a = p6Var;
        setClipToPadding(false);
        setPadding(org.telegram.messenger.i0.L(20.0f), 0, org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(16.0f));
        u31 u31Var = new u31(this, context);
        this.c = u31Var;
        org.telegram.messenger.at.i(u31Var);
        u31Var.setTextSize(1, 16.0f);
        u31Var.setMaxLines(1);
        u31Var.setSingleLine();
        u31Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(u31Var, w7.b6.c(-2.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setText(org.telegram.messenger.dd.L0(2131751462, null));
        textView.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
        textView.setGravity(17);
        w7.e6.a(textView);
        addView(textView, w7.b6.d(-2, 18.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        v31 v31Var = new v31(context);
        this.f = v31Var;
        org.telegram.messenger.at.i(v31Var);
        v31Var.setTextSize(1, 16.0f);
        v31Var.setTextIsSelectable(true);
        FrameLayout.LayoutParams c10 = w7.b6.c(-2.0f, -1);
        this.e = c10;
        addView(v31Var, c10);
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        imageView.setImageResource(R.drawable.msg_copy);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(org.telegram.messenger.dd.L0(2131751767, null));
        w7.e6.a(imageView);
        addView(imageView, w7.b6.d(38, 38.0f, 85, 0.0f, 0.0f, -16.0f, -12.0f));
        imageView.setVisibility(8);
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ig));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.jg));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ci));
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
            Paint W0 = org.telegram.ui.ActionBar.t6.W0("paintDivider", this.a);
            if (W0 == null) {
                W0 = org.telegram.ui.ActionBar.t6.k0;
            }
            Paint paint = W0;
            if (org.telegram.messenger.dd.X) {
                canvas.drawRect(0.0f, getMeasuredHeight() - 1, view.getRight(), getMeasuredHeight(), paint);
            } else {
                canvas.drawRect(view.getLeft(), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), paint);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.r = getMeasuredHeight();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30);
        FrameLayout.LayoutParams layoutParams = this.e;
        layoutParams.bottomMargin = 0;
        super.onMeasure(makeMeasureSpec, i11);
        if (this.n.getVisibility() == 0) {
            Layout layout = this.f.getLayout();
            if (layout.getLineCount() > 0 && layout.getLineRight(layout.getLineCount() - 1) > layout.getWidth() - org.telegram.messenger.i0.L(42.0f)) {
                layoutParams.bottomMargin = org.telegram.messenger.i0.L(26.0f);
                super.onMeasure(makeMeasureSpec, i11);
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

    public void setHandlesColor(int i10) {
        v31 v31Var = this.f;
        if (Build.VERSION.SDK_INT < 29 || org.telegram.messenger.d6.i()) {
            return;
        }
        try {
            Drawable textSelectHandleLeft = v31Var.getTextSelectHandleLeft();
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            textSelectHandleLeft.setColorFilter(i10, mode);
            v31Var.setTextSelectHandleLeft(textSelectHandleLeft);
            Drawable textSelectHandle = v31Var.getTextSelectHandle();
            textSelectHandle.setColorFilter(i10, mode);
            v31Var.setTextSelectHandle(textSelectHandle);
            Drawable textSelectHandleRight = v31Var.getTextSelectHandleRight();
            textSelectHandleRight.setColorFilter(i10, mode);
            v31Var.setTextSelectHandleRight(textSelectHandleRight);
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.p6 p6Var = this.a;
        this.c.setTextColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        int i11 = org.telegram.ui.ActionBar.t6.L6;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
        TextView textView = this.d;
        textView.setTextColor(w02);
        textView.setBackground(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(9.0f), org.telegram.ui.ActionBar.t6.r1(0.1f, org.telegram.ui.ActionBar.t6.w0(i11, p6Var))));
        int w03 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        v31 v31Var = this.f;
        v31Var.setTextColor(w03);
        v31Var.setLinkTextColor(org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        v31Var.setHighlightColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ig, p6Var));
        setHandlesColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.jg, p6Var));
        int i12 = org.telegram.ui.ActionBar.t6.Ci;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(i12, p6Var), PorterDuff.Mode.SRC_IN);
        ImageView imageView = this.n;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.r1(0.1f, org.telegram.ui.ActionBar.t6.w0(i12, p6Var)), 1, -1));
    }
}
