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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class p21 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 a;
    public boolean b;
    public final m21 c;
    public final TextView d;
    public final FrameLayout.LayoutParams e;
    public final n21 f;
    public boolean h;
    public final ImageView n;
    public int r;
    public final u5 s;

    public p21(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.r = -1;
        this.s = new u5(this, 0L, 320L, xq.h);
        this.a = e6Var;
        setClipToPadding(false);
        setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f));
        m21 m21Var = new m21(this, context);
        this.c = m21Var;
        org.telegram.messenger.hs.i(m21Var);
        m21Var.setTextSize(1, 16.0f);
        m21Var.setMaxLines(1);
        m21Var.setSingleLine();
        m21Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(m21Var, b8.mf.c(-2.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setText(org.telegram.messenger.bd.M0(2131751462, null));
        textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        textView.setGravity(17);
        b8.pf.a(textView);
        addView(textView, b8.mf.d(-2, 18.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        n21 n21Var = new n21(context);
        this.f = n21Var;
        org.telegram.messenger.hs.i(n21Var);
        n21Var.setTextSize(1, 16.0f);
        n21Var.setTextIsSelectable(true);
        FrameLayout.LayoutParams c2 = b8.mf.c(-2.0f, -1);
        this.e = c2;
        addView(n21Var, c2);
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        imageView.setImageResource(R.drawable.msg_copy);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(org.telegram.messenger.bd.M0(2131751767, null));
        b8.pf.a(imageView);
        addView(imageView, b8.mf.d(38, 38.0f, 85, 0.0f, 0.0f, -16.0f, -12.0f));
        imageView.setVisibility(8);
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ig));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.jg));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ci));
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
            Paint W0 = org.telegram.ui.ActionBar.k6.W0("paintDivider", this.a);
            if (W0 == null) {
                W0 = org.telegram.ui.ActionBar.k6.k0;
            }
            Paint paint = W0;
            if (org.telegram.messenger.bd.a0) {
                canvas.drawRect(0.0f, getMeasuredHeight() - 1, view.getRight(), getMeasuredHeight(), paint);
            } else {
                canvas.drawRect(view.getLeft(), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), paint);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        this.r = getMeasuredHeight();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30);
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

    public void setHandlesColor(int i3) {
        n21 n21Var = this.f;
        if (Build.VERSION.SDK_INT < 29 || org.telegram.messenger.sr.i()) {
            return;
        }
        try {
            Drawable textSelectHandleLeft = n21Var.getTextSelectHandleLeft();
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            textSelectHandleLeft.setColorFilter(i3, mode);
            n21Var.setTextSelectHandleLeft(textSelectHandleLeft);
            Drawable textSelectHandle = n21Var.getTextSelectHandle();
            textSelectHandle.setColorFilter(i3, mode);
            n21Var.setTextSelectHandle(textSelectHandle);
            Drawable textSelectHandleRight = n21Var.getTextSelectHandleRight();
            textSelectHandleRight.setColorFilter(i3, mode);
            n21Var.setTextSelectHandleRight(textSelectHandleRight);
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        this.c.setTextColor(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        int i10 = org.telegram.ui.ActionBar.k6.L6;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, e6Var);
        TextView textView = this.d;
        textView.setTextColor(w02);
        textView.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(9.0f), org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(i10, e6Var))));
        int w03 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
        n21 n21Var = this.f;
        n21Var.setTextColor(w03);
        n21Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
        n21Var.setHighlightColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ig, e6Var));
        setHandlesColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.jg, e6Var));
        int i11 = org.telegram.ui.ActionBar.k6.Ci;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i11, e6Var), PorterDuff.Mode.SRC_IN);
        ImageView imageView = this.n;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(i11, e6Var)), 1, -1));
    }
}
