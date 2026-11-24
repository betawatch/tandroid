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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bw extends View implements fkb, dx {
    public final ui5 a;
    public final ey b;
    public bx c;
    public int d;
    public int e;
    public TL_iv.pageBlockParagraph f;

    public bw(Activity activity, ui5 ui5Var, ey eyVar) {
        super(activity);
        this.a = ui5Var;
        this.b = eyVar;
    }

    @Override // dx
    public int getBoundLeft() {
        bx bxVar = this.c;
        if (bxVar == null) {
            return -1;
        }
        return wi8.h(this.a, 18.0f, bxVar.k() + bxVar.s);
    }

    @Override // dx
    public int getBoundRight() {
        bx bxVar = this.c;
        if (bxVar == null) {
            return -1;
        }
        return wi8.C(this.a, 18.0f, bxVar.l() + bxVar.s);
    }

    @Override // dx
    public int getLastLineBoundRight() {
        bx bxVar = this.c;
        if (bxVar == null) {
            return -1;
        }
        return wi8.C(this.a, 18.0f, bxVar.m() + bxVar.s);
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return wi8.a(this);
    }

    @Override // fkb
    public final void k(ArrayList arrayList) {
        bx bxVar = this.c;
        if (bxVar != null) {
            arrayList.add(bxVar);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bx bxVar = this.c;
        if (bxVar != null) {
            bxVar.i(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bx bxVar = this.c;
        if (bxVar != null) {
            bxVar.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f == null) {
            return;
        }
        bx bxVar = this.c;
        ui5 ui5Var = this.a;
        if (bxVar != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            o.s(ui5Var, canvas, this, 0);
            this.c.d(canvas, this);
            canvas.restore();
        }
        o.r(canvas, ui5Var, this.f, getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        bx bxVar = this.c;
        if (bxVar == null) {
            return;
        }
        accessibilityNodeInfo.setText(o.g(this.a, this.b, bxVar));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        Layout.Alignment a;
        int size = View.MeasureSpec.getSize(i);
        TL_iv.pageBlockParagraph pageblockparagraph = this.f;
        if (pageblockparagraph != null) {
            int i4 = pageblockparagraph.level;
            ui5 ui5Var = this.a;
            i3 = 0;
            if (i4 == 0) {
                ui5Var.getClass();
                this.e = gm.L(8.0f);
                ui5Var.getClass();
                this.d = gm.L(18.0f);
            } else {
                this.e = 0;
                ui5Var.getClass();
                this.d = gm.L((this.f.level * 14) + 18);
            }
            if (this.f.text instanceof TL_iv.textMath) {
                a = Layout.Alignment.ALIGN_CENTER;
            } else {
                ey eyVar = this.b;
                a = (eyVar == null || !eyVar.H) ? Layout.Alignment.ALIGN_NORMAL : oya.a();
            }
            Layout.Alignment alignment = a;
            TL_iv.RichText richText = this.f.text;
            ui5 ui5Var2 = this.a;
            bx n = o.n(ui5Var2, this, null, richText, wi8.h(ui5Var2, 18.0f, size) - this.d, this.e, this.f, alignment, 0, this.b);
            this.c = n;
            if (n != null) {
                int height = n.d.getHeight();
                i3 = this.f.level > 0 ? wi8.C(ui5Var, 8.0f, height) : wi8.C(ui5Var, 16.0f, height);
                bx bxVar = this.c;
                bxVar.s = this.d;
                bxVar.w = this.e;
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
