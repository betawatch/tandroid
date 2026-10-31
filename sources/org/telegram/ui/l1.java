package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.AnimatedArrowDrawable;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l1 extends View implements Drawable.Callback, org.telegram.ui.Cells.j9 {
    public final m60 a;
    public final f4 b;
    public z2 c;
    public int d;
    public int e;
    public final AnimatedArrowDrawable f;
    public TL_iv.pageBlockDetails h;

    public l1(Context context, m60 m60Var, f4 f4Var) {
        super(context);
        this.a = m60Var;
        this.b = f4Var;
        this.f = new AnimatedArrowDrawable(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.y6, false), true);
    }

    @Override // org.telegram.ui.Cells.j9
    public final void h(ArrayList arrayList) {
        z2 z2Var = this.c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidate();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.h == null) {
            return;
        }
        canvas.save();
        m60 m60Var = this.a;
        m60Var.getClass();
        canvas.translate(org.telegram.messenger.i0.L(18), ((getMeasuredHeight() - org.telegram.messenger.i0.L(13.0f)) - 1) / 2);
        this.f.draw(canvas);
        canvas.restore();
        if (this.c != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            h4.t(m60Var, canvas, this, 0);
            this.c.d(canvas, this);
            canvas.restore();
        }
        float measuredHeight = getMeasuredHeight() - 1;
        canvas.drawLine(0.0f, measuredHeight, getMeasuredWidth(), measuredHeight, h4.s1);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence h;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        z2 z2Var = this.c;
        if (z2Var != null && (h = h4.h(this.a, this.b, z2Var)) != null) {
            spannableStringBuilder.append(h).append((CharSequence) ", ");
        }
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.cd.L0(2131754869, null)).append((CharSequence) ", ");
        TL_iv.pageBlockDetails pageblockdetails = this.h;
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.cd.L0((pageblockdetails == null || !pageblockdetails.open) ? 2131754870 : 2131754866, null));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int L = org.telegram.messenger.i0.L(39.0f);
        this.d = org.telegram.messenger.i0.L(50.0f);
        this.e = org.telegram.messenger.i0.L(11.0f) + 1;
        TL_iv.pageBlockDetails pageblockdetails = this.h;
        if (pageblockdetails != null) {
            TL_iv.RichText richText = pageblockdetails.title;
            m60 m60Var = this.a;
            m60Var.getClass();
            int L2 = size - org.telegram.messenger.i0.L(54);
            TL_iv.pageBlockDetails pageblockdetails2 = this.h;
            f4 f4Var = this.b;
            z2 n10 = h4.n(m60Var, this, null, richText, L2, 0, pageblockdetails2, (f4Var == null || !f4Var.G) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.ov0.a(), 0, this.b);
            this.c = n10;
            if (n10 != null) {
                L = Math.max(L, this.c.d.getHeight() + org.telegram.messenger.i0.L(21.0f));
                int L3 = ((org.telegram.messenger.i0.L(21.0f) + this.c.d.getHeight()) - this.c.d.getHeight()) / 2;
                this.e = L3;
                z2 z2Var = this.c;
                z2Var.s = this.d;
                z2Var.w = L3;
            }
        }
        setMeasuredDimension(size, L + 1);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return h4.j(this.a, this.b, motionEvent, this, this.c, this.d, this.e) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockDetails pageblockdetails) {
        this.h = pageblockdetails;
        float f7 = pageblockdetails.open ? 0.0f : 1.0f;
        AnimatedArrowDrawable animatedArrowDrawable = this.f;
        animatedArrowDrawable.setAnimationProgress(f7);
        animatedArrowDrawable.setCallback(this);
        requestLayout();
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
    }
}
