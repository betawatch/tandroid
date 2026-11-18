package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public class mp extends View {
    public final CheckBoxBase a;
    public Drawable b;
    public int c;

    public mp(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.a = new CheckBoxBase(i7, this, i6Var);
    }

    public final void a(boolean z10, boolean z11) {
        this.a.f(-1, z10, z11);
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
        drawable.setBounds(org.telegram.ui.Cells.c0.C(2, measuredWidth, drawable), org.telegram.ui.Cells.c0.A(2, measuredHeight, this.b), org.telegram.ui.Cells.c0.y(2, measuredWidth, this.b), org.telegram.ui.Cells.c0.j(2, measuredHeight, this.b));
        this.b.draw(canvas);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.2f));
        paint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.U6, false));
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
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.a.e(0, 0, i11 - i7, i12 - i10);
    }

    public void setCirclePaintProvider(org.telegram.messenger.i9 i9Var) {
        CheckBoxBase checkBoxBase = this.a;
        if (checkBoxBase.G == i9Var) {
            return;
        }
        checkBoxBase.G = i9Var;
        checkBoxBase.b();
    }

    public void setDrawBackgroundAsArc(int i7) {
        this.a.d(i7);
    }

    public void setDrawUnchecked(boolean z10) {
        this.a.k(z10);
    }

    public void setDuration(long j3) {
        this.a.H = j3;
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

    public void setIcon(int i7) {
        if (i7 != this.c) {
            this.c = i7;
            if (i7 == 0) {
                this.b = null;
                return;
            }
            Drawable mutate = getContext().getDrawable(i7).mutate();
            this.b = mutate;
            org.telegram.ui.ActionBar.u6.x(this, mutate, org.telegram.ui.ActionBar.n6.U6, null, PorterDuff.Mode.MULTIPLY);
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

    public void setProgressDelegate(np npVar) {
        this.a.D = npVar;
    }
}
