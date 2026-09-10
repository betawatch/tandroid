package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class k2 extends View implements org.telegram.ui.Cells.r9, f3 {
    public final t70 a;
    public final h4 b;
    public c3 c;
    public final int d;
    public int e;
    public TL_iv.pageBlockRelatedArticles f;

    public k2(Context context, t70 t70Var, h4 h4Var) {
        super(context);
        this.d = AndroidUtilities.dp(18.0f);
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
        if (this.f == null || this.c == null) {
            return;
        }
        canvas.save();
        canvas.translate(this.d, this.e);
        j4.v(this.a, canvas, this, 0);
        this.c.draw(canvas, this);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        c3 c3Var = this.c;
        if (c3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(j4.i(R.string.AccDescrIVRelatedArticles, j4.j(this.a, this.b, c3Var)));
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        k2 k2Var;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockRelatedArticles pageblockrelatedarticles = this.f;
        if (pageblockrelatedarticles != null) {
            k2Var = this;
            c3 p5 = j4.p(this.a, k2Var, null, pageblockrelatedarticles.title, size - AndroidUtilities.dp(52.0f), 0, this.f, Layout.Alignment.ALIGN_NORMAL, 1, this.b);
            k2Var.c = p5;
            if (p5 != null) {
                k2Var.e = ((AndroidUtilities.dp(32.0f) - k2Var.c.d.getHeight()) / 2) + AndroidUtilities.dp(6.0f);
            }
        } else {
            k2Var = this;
        }
        if (k2Var.c == null) {
            setMeasuredDimension(size, 1);
            return;
        }
        setMeasuredDimension(size, AndroidUtilities.dp(38.0f));
        c3 c3Var = k2Var.c;
        c3Var.s = k2Var.d;
        c3Var.v = k2Var.e;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return j4.l(this.a, this.b, motionEvent, this, this.c, this.d, this.e) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockRelatedArticles pageblockrelatedarticles) {
        this.f = pageblockrelatedarticles;
        requestLayout();
    }
}
