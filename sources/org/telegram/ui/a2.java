package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class a2 extends View implements org.telegram.ui.Cells.j9, c3 {
    public final l60 a;
    public final f4 b;
    public z2 c;
    public int d;
    public int e;
    public TL_iv.pageBlockParagraph f;

    public a2(Context context, l60 l60Var, f4 f4Var) {
        super(context);
        this.a = l60Var;
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
        return org.telegram.messenger.a30.a(this);
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
        if (this.f == null) {
            return;
        }
        z2 z2Var = this.c;
        l60 l60Var = this.a;
        if (z2Var != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            h4.t(l60Var, canvas, this, 0);
            this.c.d(canvas, this);
            canvas.restore();
        }
        h4.s(canvas, l60Var, this.f, getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        z2 z2Var = this.c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(h4.h(this.a, this.b, z2Var));
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment a2;
        int L;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockParagraph pageblockparagraph = this.f;
        if (pageblockparagraph != null) {
            int i13 = pageblockparagraph.level;
            l60 l60Var = this.a;
            i12 = 0;
            if (i13 == 0) {
                l60Var.getClass();
                this.e = org.telegram.messenger.i0.L(8);
                l60Var.getClass();
                this.d = org.telegram.messenger.i0.L(18);
            } else {
                this.e = 0;
                l60Var.getClass();
                this.d = org.telegram.messenger.i0.L((this.f.level * 14) + 18);
            }
            if (this.f.text instanceof TL_iv.textMath) {
                a2 = Layout.Alignment.ALIGN_CENTER;
            } else {
                f4 f4Var = this.b;
                a2 = (f4Var == null || !f4Var.G) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.pv0.a();
            }
            Layout.Alignment alignment = a2;
            TL_iv.RichText richText = this.f.text;
            l60 l60Var2 = this.a;
            l60Var2.getClass();
            z2 n10 = h4.n(l60Var2, this, null, richText, (size - org.telegram.messenger.i0.L(18)) - this.d, this.e, this.f, alignment, 0, this.b);
            this.c = n10;
            if (n10 != null) {
                int height = n10.d.getHeight();
                if (this.f.level > 0) {
                    l60Var.getClass();
                    L = org.telegram.messenger.i0.L(8);
                } else {
                    l60Var.getClass();
                    L = org.telegram.messenger.i0.L(16);
                }
                i12 = L + height;
                z2 z2Var = this.c;
                z2Var.s = this.d;
                z2Var.w = this.e;
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

    public void setBlock(TL_iv.pageBlockParagraph pageblockparagraph) {
        this.f = pageblockparagraph;
        requestLayout();
    }
}
