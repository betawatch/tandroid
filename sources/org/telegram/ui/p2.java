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
public final class p2 extends View implements org.telegram.ui.Cells.j9, c3 {
    public final m60 a;
    public final f4 b;
    public z2 c;
    public int d;
    public int e;
    public TL_iv.pageBlockSubheader f;

    public p2(Context context, m60 m60Var, f4 f4Var) {
        super(context);
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
        accessibilityNodeInfo.setEnabled(true);
        z2 z2Var = this.c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(h4.g(2131754863, h4.h(this.a, this.b, z2Var)));
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        m60 m60Var = this.a;
        m60Var.getClass();
        this.d = org.telegram.messenger.i0.L(18);
        m60Var.getClass();
        this.e = org.telegram.messenger.i0.L(8);
        TL_iv.pageBlockSubheader pageblocksubheader = this.f;
        if (pageblocksubheader != null) {
            TL_iv.RichText richText = pageblocksubheader.text;
            m60 m60Var2 = this.a;
            m60Var2.getClass();
            int L = size - org.telegram.messenger.i0.L(36);
            TL_iv.pageBlockSubheader pageblocksubheader2 = this.f;
            f4 f4Var = this.b;
            z2 n10 = h4.n(m60Var2, this, null, richText, L, 0, pageblocksubheader2, (f4Var == null || !f4Var.G) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.ov0.a(), 0, this.b);
            this.c = n10;
            if (n10 != null) {
                int height = n10.d.getHeight() + this.e;
                int i13 = this.e;
                i12 = height + i13;
                z2 z2Var = this.c;
                z2Var.s = this.d;
                z2Var.w = i13;
            } else {
                i12 = 0;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return h4.j(this.a, this.b, motionEvent, this, this.c, this.d, this.e) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockSubheader pageblocksubheader) {
        this.f = pageblocksubheader;
        requestLayout();
    }
}
