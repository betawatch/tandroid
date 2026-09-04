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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class c2 extends View implements org.telegram.ui.Cells.p9, e3 {
    public final v70 a;
    public final g4 b;
    public b3 c;
    public int d;
    public int e;
    public TL_iv.pageBlockParagraph f;

    public c2(Context context, v70 v70Var, g4 g4Var) {
        super(context);
        this.a = v70Var;
        this.b = g4Var;
    }

    @Override // org.telegram.ui.Cells.p9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override // org.telegram.ui.e3
    public int getBoundLeft() {
        b3 b3Var = this.c;
        if (b3Var == null) {
            return -1;
        }
        int a2 = b3Var.a() + b3Var.s;
        this.a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override // org.telegram.ui.e3
    public int getBoundRight() {
        b3 b3Var = this.c;
        if (b3Var == null) {
            return -1;
        }
        int b10 = b3Var.b() + b3Var.s;
        this.a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override // org.telegram.ui.e3
    public int getLastLineBoundRight() {
        b3 b3Var = this.c;
        if (b3Var == null) {
            return -1;
        }
        int c10 = b3Var.c() + b3Var.s;
        this.a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return org.telegram.messenger.wl.b(this);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f == null) {
            return;
        }
        b3 b3Var = this.c;
        v70 v70Var = this.a;
        if (b3Var != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            i4.v(v70Var, canvas, this, 0);
            this.c.draw(canvas, this);
            canvas.restore();
        }
        i4.u(canvas, v70Var, this.f, getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        b3 b3Var = this.c;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.j(this.a, this.b, b3Var));
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
            v70 v70Var = this.a;
            i12 = 0;
            if (i13 == 0) {
                v70Var.getClass();
                this.e = AndroidUtilities.dp(8);
                v70Var.getClass();
                this.d = AndroidUtilities.dp(18);
            } else {
                this.e = 0;
                v70Var.getClass();
                this.d = AndroidUtilities.dp((this.f.level * 14) + 18);
            }
            if (this.f.text instanceof TL_iv.textMath) {
                a2 = Layout.Alignment.ALIGN_CENTER;
            } else {
                g4 g4Var = this.b;
                a2 = (g4Var == null || !g4Var.G) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.iw0.a();
            }
            Layout.Alignment alignment = a2;
            TL_iv.RichText richText = this.f.text;
            v70 v70Var2 = this.a;
            v70Var2.getClass();
            b3 p5 = i4.p(v70Var2, this, null, richText, (size - AndroidUtilities.dp(18)) - this.d, this.e, this.f, alignment, 0, this.b);
            this.c = p5;
            if (p5 != null) {
                int height = p5.d.getHeight();
                if (this.f.level > 0) {
                    v70Var.getClass();
                    dp = AndroidUtilities.dp(8);
                } else {
                    v70Var.getClass();
                    dp = AndroidUtilities.dp(16);
                }
                i12 = dp + height;
                b3 b3Var = this.c;
                b3Var.s = this.d;
                b3Var.v = this.e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return i4.l(this.a, this.b, motionEvent, this, this.c, this.d, this.e) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockParagraph pageblockparagraph) {
        this.f = pageblockparagraph;
        requestLayout();
    }
}
