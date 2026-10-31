package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i2 extends View implements org.telegram.ui.Cells.j9, c3 {
    public final m60 a;
    public final f4 b;
    public z2 c;
    public final int d;
    public int e;
    public TL_iv.pageBlockRelatedArticles f;

    public i2(Context context, m60 m60Var, f4 f4Var) {
        super(context);
        this.d = org.telegram.messenger.i0.L(18.0f);
        this.a = m60Var;
        this.b = f4Var;
    }

    @Override // org.telegram.ui.c3
    public int getBoundLeft() {
        z2 z2Var = this.c;
        if (z2Var == null) {
            return -1;
        }
        int k10 = z2Var.k() + z2Var.s;
        this.a.getClass();
        return k10 - org.telegram.messenger.i0.L(18);
    }

    @Override // org.telegram.ui.c3
    public int getBoundRight() {
        z2 z2Var = this.c;
        if (z2Var == null) {
            return -1;
        }
        int l4 = z2Var.l() + z2Var.s;
        this.a.getClass();
        return org.telegram.messenger.i0.L(18) + l4;
    }

    @Override // org.telegram.ui.c3
    public int getLastLineBoundRight() {
        z2 z2Var = this.c;
        if (z2Var == null) {
            return -1;
        }
        int m10 = z2Var.m() + z2Var.s;
        this.a.getClass();
        return org.telegram.messenger.i0.L(18) + m10;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return org.telegram.messenger.z20.a(this);
    }

    @Override // org.telegram.ui.Cells.j9
    public final void h(ArrayList arrayList) {
        z2 z2Var = this.c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
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
        if (this.f == null || this.c == null) {
            return;
        }
        canvas.save();
        canvas.translate(this.d, this.e);
        h4.t(this.a, canvas, this, 0);
        this.c.d(canvas, this);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        z2 z2Var = this.c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(h4.g(2131754857, h4.h(this.a, this.b, z2Var)));
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        i2 i2Var;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockRelatedArticles pageblockrelatedarticles = this.f;
        if (pageblockrelatedarticles != null) {
            i2Var = this;
            z2 n10 = h4.n(this.a, i2Var, null, pageblockrelatedarticles.title, size - org.telegram.messenger.i0.L(52.0f), 0, this.f, Layout.Alignment.ALIGN_NORMAL, 1, this.b);
            i2Var.c = n10;
            if (n10 != null) {
                i2Var.e = ((org.telegram.messenger.i0.L(32.0f) - i2Var.c.d.getHeight()) / 2) + org.telegram.messenger.i0.L(6.0f);
            }
        } else {
            i2Var = this;
        }
        if (i2Var.c == null) {
            setMeasuredDimension(size, 1);
            return;
        }
        setMeasuredDimension(size, org.telegram.messenger.i0.L(38.0f));
        z2 z2Var = i2Var.c;
        z2Var.s = i2Var.d;
        z2Var.w = i2Var.e;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return h4.j(this.a, this.b, motionEvent, this, this.c, this.d, this.e) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockRelatedArticles pageblockrelatedarticles) {
        this.f = pageblockrelatedarticles;
        requestLayout();
    }
}
