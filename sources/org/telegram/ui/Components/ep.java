package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class ep extends View {
    public final CheckBoxBase a;
    public Drawable b;
    public int c;

    public ep(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.a = new CheckBoxBase(i10, this, p6Var);
    }

    public final void a(boolean z10, boolean z11) {
        this.a.f(-1, z10, z11);
    }

    public final void b(int i10, int i11, int i12) {
        this.a.h(i10, i11, i12);
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
        paint.setStrokeWidth(org.telegram.messenger.i0.L(1.2f));
        paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.U6, false));
        canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth - org.telegram.messenger.i0.L(1.5f), paint);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.a.q);
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.a.e(0, 0, i12 - i10, i13 - i11);
    }

    public void setCirclePaintProvider(org.telegram.messenger.l9 l9Var) {
        CheckBoxBase checkBoxBase = this.a;
        if (checkBoxBase.G == l9Var) {
            return;
        }
        checkBoxBase.G = l9Var;
        checkBoxBase.b();
    }

    public void setDrawBackgroundAsArc(int i10) {
        this.a.d(i10);
    }

    public void setDrawUnchecked(boolean z10) {
        this.a.k(z10);
    }

    public void setDuration(long j10) {
        this.a.H = j10;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        CheckBoxBase checkBoxBase = this.a;
        if (checkBoxBase.k != z10) {
            checkBoxBase.k = z10;
            checkBoxBase.b();
        }
        super.setEnabled(z10);
    }

    public void setForbidden(boolean z10) {
        CheckBoxBase checkBoxBase = this.a;
        if (checkBoxBase.n == z10) {
            return;
        }
        checkBoxBase.n = z10;
        checkBoxBase.b();
    }

    public void setIcon(int i10) {
        if (i10 != this.c) {
            this.c = i10;
            if (i10 == 0) {
                this.b = null;
                return;
            }
            Drawable mutate = getContext().getDrawable(i10).mutate();
            this.b = mutate;
            org.telegram.ui.ActionBar.a7.y(this, mutate, org.telegram.ui.ActionBar.t6.U6, null, PorterDuff.Mode.MULTIPLY);
        }
    }

    public void setNum(int i10) {
        String str;
        CheckBoxBase checkBoxBase = this.a;
        if (i10 >= 0) {
            checkBoxBase.getClass();
            str = "" + (i10 + 1);
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

    public void setProgressDelegate(fp fpVar) {
        this.a.D = fpVar;
    }
}
