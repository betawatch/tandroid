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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class bv extends View implements eib, dw {
    public final vg5 a;
    public final dx b;
    public bw c;
    public int d;
    public int e;
    public TL_iv.pageBlockParagraph f;

    public bv(Activity activity, vg5 vg5Var, dx dxVar) {
        super(activity);
        this.a = vg5Var;
        this.b = dxVar;
    }

    @Override // dw
    public int getBoundLeft() {
        bw bwVar = this.c;
        if (bwVar == null) {
            return -1;
        }
        return ug8.h(this.a, 18.0f, bwVar.k() + bwVar.s);
    }

    @Override // dw
    public int getBoundRight() {
        bw bwVar = this.c;
        if (bwVar == null) {
            return -1;
        }
        return ug8.C(this.a, 18.0f, bwVar.l() + bwVar.s);
    }

    @Override // dw
    public int getLastLineBoundRight() {
        bw bwVar = this.c;
        if (bwVar == null) {
            return -1;
        }
        return ug8.C(this.a, 18.0f, bwVar.m() + bwVar.s);
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return ug8.a(this);
    }

    @Override // eib
    public final void k(ArrayList arrayList) {
        bw bwVar = this.c;
        if (bwVar != null) {
            arrayList.add(bwVar);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bw bwVar = this.c;
        if (bwVar != null) {
            bwVar.i(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bw bwVar = this.c;
        if (bwVar != null) {
            bwVar.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f == null) {
            return;
        }
        bw bwVar = this.c;
        vg5 vg5Var = this.a;
        if (bwVar != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            o.s(vg5Var, canvas, this, 0);
            this.c.d(canvas, this);
            canvas.restore();
        }
        o.r(canvas, vg5Var, this.f, getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        bw bwVar = this.c;
        if (bwVar == null) {
            return;
        }
        accessibilityNodeInfo.setText(o.g(this.a, this.b, bwVar));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        Layout.Alignment a;
        int size = View.MeasureSpec.getSize(i);
        TL_iv.pageBlockParagraph pageblockparagraph = this.f;
        if (pageblockparagraph != null) {
            int i4 = pageblockparagraph.level;
            vg5 vg5Var = this.a;
            i3 = 0;
            if (i4 == 0) {
                vg5Var.getClass();
                this.e = gl.L(8.0f);
                vg5Var.getClass();
                this.d = gl.L(18.0f);
            } else {
                this.e = 0;
                vg5Var.getClass();
                this.d = gl.L((this.f.level * 14) + 18);
            }
            if (this.f.text instanceof TL_iv.textMath) {
                a = Layout.Alignment.ALIGN_CENTER;
            } else {
                dx dxVar = this.b;
                a = (dxVar == null || !dxVar.H) ? Layout.Alignment.ALIGN_NORMAL : lwa.a();
            }
            Layout.Alignment alignment = a;
            TL_iv.RichText richText = this.f.text;
            vg5 vg5Var2 = this.a;
            bw n = o.n(vg5Var2, this, null, richText, ug8.h(vg5Var2, 18.0f, size) - this.d, this.e, this.f, alignment, 0, this.b);
            this.c = n;
            if (n != null) {
                int height = n.d.getHeight();
                i3 = this.f.level > 0 ? ug8.C(vg5Var, 8.0f, height) : ug8.C(vg5Var, 16.0f, height);
                bw bwVar = this.c;
                bwVar.s = this.d;
                bwVar.w = this.e;
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
