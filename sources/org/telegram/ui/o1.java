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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.AnimatedArrowDrawable;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class o1 extends View implements Drawable.Callback, org.telegram.ui.Cells.m9 {
    public final a70 a;
    public final j4 b;
    public e3 c;
    public int d;
    public int e;
    public final AnimatedArrowDrawable f;
    public TL_iv.pageBlockDetails h;

    public o1(Context context, a70 a70Var, j4 j4Var) {
        super(context);
        this.a = a70Var;
        this.b = j4Var;
        this.f = new AnimatedArrowDrawable(a70Var.a(), true);
    }

    @Override // org.telegram.ui.Cells.m9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        e3 e3Var = this.c;
        if (e3Var != null) {
            arrayList.add(e3Var);
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidate();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e3 e3Var = this.c;
        if (e3Var != null) {
            e3Var.attach(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e3 e3Var = this.c;
        if (e3Var != null) {
            e3Var.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.h == null) {
            return;
        }
        canvas.save();
        a70 a70Var = this.a;
        a70Var.getClass();
        canvas.translate(AndroidUtilities.dp(18), ((getMeasuredHeight() - AndroidUtilities.dp(13.0f)) - 1) / 2);
        this.f.draw(canvas);
        canvas.restore();
        if (this.c != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            l4.v(a70Var, canvas, this, 0);
            this.c.draw(canvas, this);
            canvas.restore();
        }
        float measuredHeight = getMeasuredHeight() - 1;
        canvas.drawLine(0.0f, measuredHeight, getMeasuredWidth(), measuredHeight, l4.n1);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence j10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        e3 e3Var = this.c;
        if (e3Var != null && (j10 = l4.j(this.a, this.b, e3Var)) != null) {
            spannableStringBuilder.append(j10).append((CharSequence) ", ");
        }
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AccDescrIVDetails)).append((CharSequence) ", ");
        TL_iv.pageBlockDetails pageblockdetails = this.h;
        spannableStringBuilder.append((CharSequence) LocaleController.getString((pageblockdetails == null || !pageblockdetails.open) ? R.string.AccDescrIVCollapsed : R.string.AccDescrIVExpanded));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int dp = AndroidUtilities.dp(39.0f);
        this.d = AndroidUtilities.dp(50.0f);
        this.e = AndroidUtilities.dp(11.0f) + 1;
        TL_iv.pageBlockDetails pageblockdetails = this.h;
        if (pageblockdetails != null) {
            TL_iv.RichText richText = pageblockdetails.title;
            a70 a70Var = this.a;
            a70Var.getClass();
            int dp2 = size - AndroidUtilities.dp(54);
            TL_iv.pageBlockDetails pageblockdetails2 = this.h;
            j4 j4Var = this.b;
            e3 p6 = l4.p(a70Var, this, null, richText, dp2, 0, pageblockdetails2, (j4Var == null || !j4Var.C) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.rv0.a(), 0, this.b);
            this.c = p6;
            if (p6 != null) {
                dp = Math.max(dp, this.c.d.getHeight() + AndroidUtilities.dp(21.0f));
                int dp3 = ((AndroidUtilities.dp(21.0f) + this.c.d.getHeight()) - this.c.d.getHeight()) / 2;
                this.e = dp3;
                e3 e3Var = this.c;
                e3Var.s = this.d;
                e3Var.v = dp3;
            }
        }
        setMeasuredDimension(size, dp + 1);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return l4.l(this.a, this.b, motionEvent, this, this.c, this.d, this.e) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockDetails pageblockdetails) {
        this.h = pageblockdetails;
        float f10 = pageblockdetails.open ? 0.0f : 1.0f;
        AnimatedArrowDrawable animatedArrowDrawable = this.f;
        animatedArrowDrawable.setAnimationProgress(f10);
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
