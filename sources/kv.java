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
public final class kv extends View implements zlb, ew {
    public final xi5 a;
    public final ex b;
    public cw c;
    public final int d;
    public int e;
    public TL_iv.pageBlockRelatedArticles f;

    public kv(Activity activity, xi5 xi5Var, ex exVar) {
        super(activity);
        this.d = hl.L(18.0f);
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
        if (this.f == null || this.c == null) {
            return;
        }
        canvas.save();
        canvas.translate(this.d, this.e);
        o.s(this.a, canvas, this, 0);
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
        cw cwVar = this.c;
        if (cwVar == null) {
            return;
        }
        accessibilityNodeInfo.setText(o.f(2131754852, o.g(this.a, this.b, cwVar)));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        kv kvVar;
        int size = View.MeasureSpec.getSize(i);
        TL_iv.pageBlockRelatedArticles pageblockrelatedarticles = this.f;
        if (pageblockrelatedarticles != null) {
            kvVar = this;
            cw n = o.n(this.a, kvVar, null, pageblockrelatedarticles.title, size - hl.L(52.0f), 0, this.f, Layout.Alignment.ALIGN_NORMAL, 1, this.b);
            kvVar.c = n;
            if (n != null) {
                kvVar.e = ((hl.L(32.0f) - kvVar.c.d.getHeight()) / 2) + hl.L(6.0f);
            }
        } else {
            kvVar = this;
        }
        if (kvVar.c == null) {
            kvVar.setMeasuredDimension(size, 1);
            return;
        }
        kvVar.setMeasuredDimension(size, hl.L(38.0f));
        cw cwVar = kvVar.c;
        cwVar.s = kvVar.d;
        cwVar.w = kvVar.e;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return o.i(this.a, this.b, motionEvent, this, this.c, this.d, this.e) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockRelatedArticles pageblockrelatedarticles) {
        this.f = pageblockrelatedarticles;
        requestLayout();
    }
}
