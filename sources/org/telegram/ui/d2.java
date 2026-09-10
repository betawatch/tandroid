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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class d2 extends View implements org.telegram.ui.Cells.r9, f3 {
    public final t70 a;
    public final h4 b;
    public c3 c;
    public int d;
    public int e;
    public TL_iv.pageBlockParagraph f;

    public d2(Context context, t70 t70Var, h4 h4Var) {
        super(context);
        this.a = t70Var;
        this.b = h4Var;
    }

    @Override // org.telegram.ui.Cells.r9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        c3 c3Var = this.c;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
    }

    @Override // org.telegram.ui.f3
    public int getBoundLeft() {
        c3 c3Var = this.c;
        if (c3Var == null) {
            return -1;
        }
        int a2 = c3Var.a() + c3Var.s;
        this.a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override // org.telegram.ui.f3
    public int getBoundRight() {
        c3 c3Var = this.c;
        if (c3Var == null) {
            return -1;
        }
        int b10 = c3Var.b() + c3Var.s;
        this.a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override // org.telegram.ui.f3
    public int getLastLineBoundRight() {
        c3 c3Var = this.c;
        if (c3Var == null) {
            return -1;
        }
        int c10 = c3Var.c() + c3Var.s;
        this.a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return org.telegram.messenger.em.b(this);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.c;
        if (c3Var != null) {
            c3Var.attach(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3 c3Var = this.c;
        if (c3Var != null) {
            c3Var.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f == null) {
            return;
        }
        c3 c3Var = this.c;
        t70 t70Var = this.a;
        if (c3Var != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            j4.v(t70Var, canvas, this, 0);
            this.c.draw(canvas, this);
            canvas.restore();
        }
        j4.u(canvas, t70Var, this.f, getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        c3 c3Var = this.c;
        if (c3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(j4.j(this.a, this.b, c3Var));
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
            t70 t70Var = this.a;
            i12 = 0;
            if (i13 == 0) {
                t70Var.getClass();
                this.e = AndroidUtilities.dp(8);
                t70Var.getClass();
                this.d = AndroidUtilities.dp(18);
            } else {
                this.e = 0;
                t70Var.getClass();
                this.d = AndroidUtilities.dp((this.f.level * 14) + 18);
            }
            if (this.f.text instanceof TL_iv.textMath) {
                a2 = Layout.Alignment.ALIGN_CENTER;
            } else {
                h4 h4Var = this.b;
                a2 = (h4Var == null || !h4Var.G) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.uw0.a();
            }
            Layout.Alignment alignment = a2;
            TL_iv.RichText richText = this.f.text;
            t70 t70Var2 = this.a;
            t70Var2.getClass();
            c3 p5 = j4.p(t70Var2, this, null, richText, (size - AndroidUtilities.dp(18)) - this.d, this.e, this.f, alignment, 0, this.b);
            this.c = p5;
            if (p5 != null) {
                int height = p5.d.getHeight();
                if (this.f.level > 0) {
                    t70Var.getClass();
                    dp = AndroidUtilities.dp(8);
                } else {
                    t70Var.getClass();
                    dp = AndroidUtilities.dp(16);
                }
                i12 = dp + height;
                c3 c3Var = this.c;
                c3Var.s = this.d;
                c3Var.v = this.e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return j4.l(this.a, this.b, motionEvent, this, this.c, this.d, this.e) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockParagraph pageblockparagraph) {
        this.f = pageblockparagraph;
        requestLayout();
    }
}
