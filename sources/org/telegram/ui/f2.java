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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class f2 extends View implements org.telegram.ui.Cells.j9, i3 {
    public final d70 a;
    public final k4 b;
    public f3 c;
    public int d;
    public int e;
    public TL_iv.pageBlockParagraph f;

    public f2(Context context, d70 d70Var, k4 k4Var) {
        super(context);
        this.a = d70Var;
        this.b = k4Var;
    }

    @Override // org.telegram.ui.Cells.j9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.c;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
    }

    @Override // org.telegram.ui.i3
    public int getBoundLeft() {
        f3 f3Var = this.c;
        if (f3Var == null) {
            return -1;
        }
        int a2 = f3Var.a() + f3Var.s;
        this.a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override // org.telegram.ui.i3
    public int getBoundRight() {
        f3 f3Var = this.c;
        if (f3Var == null) {
            return -1;
        }
        int b10 = f3Var.b() + f3Var.s;
        this.a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override // org.telegram.ui.i3
    public int getLastLineBoundRight() {
        f3 f3Var = this.c;
        if (f3Var == null) {
            return -1;
        }
        int c3 = f3Var.c() + f3Var.s;
        this.a.getClass();
        return AndroidUtilities.dp(18) + c3;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return b.b(this);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.c;
        if (f3Var != null) {
            f3Var.attach(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.c;
        if (f3Var != null) {
            f3Var.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f == null) {
            return;
        }
        f3 f3Var = this.c;
        d70 d70Var = this.a;
        if (f3Var != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            m4.v(d70Var, canvas, this, 0);
            this.c.draw(canvas, this);
            canvas.restore();
        }
        m4.u(canvas, d70Var, this.f, getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        f3 f3Var = this.c;
        if (f3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(m4.j(this.a, this.b, f3Var));
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment a2;
        int dp;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockParagraph pageblockparagraph = this.f;
        if (pageblockparagraph != null) {
            int i13 = pageblockparagraph.level;
            d70 d70Var = this.a;
            i12 = 0;
            if (i13 == 0) {
                d70Var.getClass();
                this.e = AndroidUtilities.dp(8);
                d70Var.getClass();
                this.d = AndroidUtilities.dp(18);
            } else {
                this.e = 0;
                d70Var.getClass();
                this.d = AndroidUtilities.dp((this.f.level * 14) + 18);
            }
            if (this.f.text instanceof TL_iv.textMath) {
                a2 = Layout.Alignment.ALIGN_CENTER;
            } else {
                k4 k4Var = this.b;
                a2 = (k4Var == null || !k4Var.C) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.bw0.a();
            }
            Layout.Alignment alignment = a2;
            TL_iv.RichText richText = this.f.text;
            d70 d70Var2 = this.a;
            d70Var2.getClass();
            f3 p10 = m4.p(d70Var2, this, null, richText, (size - AndroidUtilities.dp(18)) - this.d, this.e, this.f, alignment, 0, this.b);
            this.c = p10;
            if (p10 != null) {
                int height = p10.d.getHeight();
                if (this.f.level > 0) {
                    d70Var.getClass();
                    dp = AndroidUtilities.dp(8);
                } else {
                    d70Var.getClass();
                    dp = AndroidUtilities.dp(16);
                }
                i12 = dp + height;
                f3 f3Var = this.c;
                f3Var.s = this.d;
                f3Var.v = this.e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return m4.l(this.a, this.b, motionEvent, this, this.c, this.d, this.e) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockParagraph pageblockparagraph) {
        this.f = pageblockparagraph;
        requestLayout();
    }
}
