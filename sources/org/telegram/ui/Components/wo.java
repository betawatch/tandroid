package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public class wo extends View {
    public final CheckBoxBase a;
    public Drawable b;
    public int c;

    public wo(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = new CheckBoxBase(i7, this, f6Var);
    }

    public final void a(boolean z9, boolean z10) {
        this.a.f(-1, z9, z10);
    }

    public final void b(int i7, int i10, int i11) {
        this.a.h(i7, i10, i11);
    }

    public CheckBoxBase getCheckBoxBase() {
        return this.a;
    }

    public boolean getDrawUnchecked() {
        return this.a.z;
    }

    public float getProgress() {
        return this.a.getProgress();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.l = true;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.l = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.b == null) {
            this.a.a(canvas);
            return;
        }
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() >> 1;
        Drawable drawable = this.b;
        drawable.setBounds(org.telegram.ui.Cells.f1.z(2, measuredWidth, drawable), org.telegram.ui.Cells.f1.y(2, measuredHeight, this.b), org.telegram.ui.Cells.f1.w(2, measuredWidth, this.b), org.telegram.ui.Cells.f1.f(2, measuredHeight, this.b));
        this.b.draw(canvas);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.2f));
        paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.U6, false));
        canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth - org.telegram.messenger.g0.L(1.5f), paint);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.a.q);
    }

    @Override // android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        this.a.e(0, 0, i11 - i7, i12 - i10);
    }

    public void setCirclePaintProvider(org.telegram.messenger.k9 k9Var) {
        CheckBoxBase checkBoxBase = this.a;
        if (checkBoxBase.G == k9Var) {
            return;
        }
        checkBoxBase.G = k9Var;
        checkBoxBase.b();
    }

    public void setDrawBackgroundAsArc(int i7) {
        this.a.d(i7);
    }

    public void setDrawUnchecked(boolean z9) {
        this.a.k(z9);
    }

    public void setDuration(long j3) {
        this.a.H = j3;
    }

    @Override // android.view.View
    public void setEnabled(boolean z9) {
        CheckBoxBase checkBoxBase = this.a;
        if (checkBoxBase.k != z9) {
            checkBoxBase.k = z9;
            checkBoxBase.b();
        }
        super.setEnabled(z9);
    }

    public void setForbidden(boolean z9) {
        CheckBoxBase checkBoxBase = this.a;
        if (checkBoxBase.n == z9) {
            return;
        }
        checkBoxBase.n = z9;
        checkBoxBase.b();
    }

    public void setIcon(int i7) {
        if (i7 != this.c) {
            this.c = i7;
            if (i7 == 0) {
                this.b = null;
                return;
            }
            Drawable mutate = getContext().getDrawable(i7).mutate();
            this.b = mutate;
            org.telegram.ui.ActionBar.r6.y(this, mutate, org.telegram.ui.ActionBar.k6.U6, null, PorterDuff.Mode.MULTIPLY);
        }
    }

    public void setNum(int i7) {
        String str;
        CheckBoxBase checkBoxBase = this.a;
        if (i7 >= 0) {
            checkBoxBase.getClass();
            str = "" + (i7 + 1);
        } else {
            str = checkBoxBase.p != null ? checkBoxBase.C : null;
        }
        String str2 = checkBoxBase.C;
        if (str2 == null) {
            if (str == null) {
                return;
            }
        } else if (str2.equals(str)) {
            return;
        }
        checkBoxBase.C = str;
        checkBoxBase.b();
    }

    public void setProgressDelegate(xo xoVar) {
        this.a.D = xoVar;
    }
}
