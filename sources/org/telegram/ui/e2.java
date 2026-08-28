package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class e2 extends View implements org.telegram.ui.Cells.m9, h3 {
    public final a70 a;
    public final j4 b;
    public e3 c;
    public int d;
    public int e;
    public TL_iv.pageBlockParagraph f;

    public e2(Context context, a70 a70Var, j4 j4Var) {
        super(context);
        this.a = a70Var;
        this.b = j4Var;
    }

    @Override // org.telegram.ui.Cells.m9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        e3 e3Var = this.c;
        if (e3Var != null) {
            arrayList.add(e3Var);
        }
    }

    @Override // org.telegram.ui.h3
    public int getBoundLeft() {
        e3 e3Var = this.c;
        if (e3Var == null) {
            return -1;
        }
        int a2 = e3Var.a() + e3Var.s;
        this.a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override // org.telegram.ui.h3
    public int getBoundRight() {
        e3 e3Var = this.c;
        if (e3Var == null) {
            return -1;
        }
        int b10 = e3Var.b() + e3Var.s;
        this.a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override // org.telegram.ui.h3
    public int getLastLineBoundRight() {
        e3 e3Var = this.c;
        if (e3Var == null) {
            return -1;
        }
        int c10 = e3Var.c() + e3Var.s;
        this.a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return org.telegram.messenger.ll.b(this);
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
        if (this.f == null) {
            return;
        }
        e3 e3Var = this.c;
        a70 a70Var = this.a;
        if (e3Var != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            l4.v(a70Var, canvas, this, 0);
            this.c.draw(canvas, this);
            canvas.restore();
        }
        l4.u(canvas, a70Var, this.f, getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        e3 e3Var = this.c;
        if (e3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.j(this.a, this.b, e3Var));
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11;
        Layout.Alignment a2;
        int dp;
        int size = View.MeasureSpec.getSize(i9);
        TL_iv.pageBlockParagraph pageblockparagraph = this.f;
        if (pageblockparagraph != null) {
            int i12 = pageblockparagraph.level;
            a70 a70Var = this.a;
            i11 = 0;
            if (i12 == 0) {
                a70Var.getClass();
                this.e = AndroidUtilities.dp(8);
                a70Var.getClass();
                this.d = AndroidUtilities.dp(18);
            } else {
                this.e = 0;
                a70Var.getClass();
                this.d = AndroidUtilities.dp((this.f.level * 14) + 18);
            }
            if (this.f.text instanceof TL_iv.textMath) {
                a2 = Layout.Alignment.ALIGN_CENTER;
            } else {
                j4 j4Var = this.b;
                a2 = (j4Var == null || !j4Var.C) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.rv0.a();
            }
            Layout.Alignment alignment = a2;
            TL_iv.RichText richText = this.f.text;
            a70 a70Var2 = this.a;
            a70Var2.getClass();
            e3 p6 = l4.p(a70Var2, this, null, richText, (size - AndroidUtilities.dp(18)) - this.d, this.e, this.f, alignment, 0, this.b);
            this.c = p6;
            if (p6 != null) {
                int height = p6.d.getHeight();
                if (this.f.level > 0) {
                    a70Var.getClass();
                    dp = AndroidUtilities.dp(8);
                } else {
                    a70Var.getClass();
                    dp = AndroidUtilities.dp(16);
                }
                i11 = dp + height;
                e3 e3Var = this.c;
                e3Var.s = this.d;
                e3Var.v = this.e;
            }
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return l4.l(this.a, this.b, motionEvent, this, this.c, this.d, this.e) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockParagraph pageblockparagraph) {
        this.f = pageblockparagraph;
        requestLayout();
    }
}
