// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.o;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class cv extends View implements zlb, ew {
    public final xi5 a;
    public final ex b;
    public cw c;
    public int d;
    public int e;
    public TL_iv.pageBlockParagraph f;

    public cv(Activity activity, xi5 xi5Var, ex exVar) {
        super(activity);
        this.a = xi5Var;
        this.b = exVar;
    }

    @Override // ew
    public int getBoundLeft() {
        cw cwVar = this.c;
        if (cwVar == null) {
            return -1;
        }
        return ik8.h(this.a, 18.0f, cwVar.k() + cwVar.s);
    }

    @Override // ew
    public int getBoundRight() {
        cw cwVar = this.c;
        if (cwVar == null) {
            return -1;
        }
        return ik8.C(this.a, 18.0f, cwVar.l() + cwVar.s);
    }

    @Override // ew
    public int getLastLineBoundRight() {
        cw cwVar = this.c;
        if (cwVar == null) {
            return -1;
        }
        return ik8.C(this.a, 18.0f, cwVar.m() + cwVar.s);
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return ik8.a(this);
    }

    @Override // zlb
    public final void k(ArrayList arrayList) {
        cw cwVar = this.c;
        if (cwVar != null) {
            arrayList.add(cwVar);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        cw cwVar = this.c;
        if (cwVar != null) {
            cwVar.i(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cw cwVar = this.c;
        if (cwVar != null) {
            cwVar.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f == null) {
            return;
        }
        cw cwVar = this.c;
        xi5 xi5Var = this.a;
        if (cwVar != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            o.s(xi5Var, canvas, this, 0);
            this.c.d(canvas, this);
            canvas.restore();
        }
        o.r(canvas, xi5Var, this.f, getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        cw cwVar = this.c;
        if (cwVar == null) {
            return;
        }
        accessibilityNodeInfo.setText(o.g(this.a, this.b, cwVar));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        Layout.Alignment a;
        int size = View.MeasureSpec.getSize(i);
        TL_iv.pageBlockParagraph pageblockparagraph = this.f;
        if (pageblockparagraph != null) {
            int i4 = pageblockparagraph.level;
            xi5 xi5Var = this.a;
            i3 = 0;
            if (i4 == 0) {
                xi5Var.getClass();
                this.e = hl.L(8.0f);
                xi5Var.getClass();
                this.d = hl.L(18.0f);
            } else {
                this.e = 0;
                xi5Var.getClass();
                this.d = hl.L((this.f.level * 14) + 18);
            }
            if (this.f.text instanceof TL_iv.textMath) {
                a = Layout.Alignment.ALIGN_CENTER;
            } else {
                ex exVar = this.b;
                a = (exVar == null || !exVar.H) ? Layout.Alignment.ALIGN_NORMAL : o0b.a();
            }
            Layout.Alignment alignment = a;
            TL_iv.RichText richText = this.f.text;
            xi5 xi5Var2 = this.a;
            cw n = o.n(xi5Var2, this, null, richText, ik8.h(xi5Var2, 18.0f, size) - this.d, this.e, this.f, alignment, 0, this.b);
            this.c = n;
            if (n != null) {
                int height = n.d.getHeight();
                i3 = this.f.level > 0 ? ik8.C(xi5Var, 8.0f, height) : ik8.C(xi5Var, 16.0f, height);
                cw cwVar = this.c;
                cwVar.s = this.d;
                cwVar.w = this.e;
            }
        } else {
            i3 = 1;
        }
        setMeasuredDimension(size, i3);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return o.i(this.a, this.b, motionEvent, this, this.c, this.d, this.e) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockParagraph pageblockparagraph) {
        this.f = pageblockparagraph;
        requestLayout();
    }
}
