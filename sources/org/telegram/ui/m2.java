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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class m2 extends View implements org.telegram.ui.Cells.m9, h3 {
    public final a70 a;
    public final j4 b;
    public e3 c;
    public final int d;
    public int e;
    public TL_iv.pageBlockRelatedArticles f;

    public m2(Context context, a70 a70Var, j4 j4Var) {
        super(context);
        this.d = AndroidUtilities.dp(18.0f);
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
        if (this.f == null || this.c == null) {
            return;
        }
        canvas.save();
        canvas.translate(this.d, this.e);
        l4.v(this.a, canvas, this, 0);
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
        e3 e3Var = this.c;
        if (e3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.i(R.string.AccDescrIVRelatedArticles, l4.j(this.a, this.b, e3Var)));
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        m2 m2Var;
        int size = View.MeasureSpec.getSize(i9);
        TL_iv.pageBlockRelatedArticles pageblockrelatedarticles = this.f;
        if (pageblockrelatedarticles != null) {
            m2Var = this;
            e3 p6 = l4.p(this.a, m2Var, null, pageblockrelatedarticles.title, size - AndroidUtilities.dp(52.0f), 0, this.f, Layout.Alignment.ALIGN_NORMAL, 1, this.b);
            m2Var.c = p6;
            if (p6 != null) {
                m2Var.e = ((AndroidUtilities.dp(32.0f) - m2Var.c.d.getHeight()) / 2) + AndroidUtilities.dp(6.0f);
            }
        } else {
            m2Var = this;
        }
        if (m2Var.c == null) {
            setMeasuredDimension(size, 1);
            return;
        }
        setMeasuredDimension(size, AndroidUtilities.dp(38.0f));
        e3 e3Var = m2Var.c;
        e3Var.s = m2Var.d;
        e3Var.v = m2Var.e;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return l4.l(this.a, this.b, motionEvent, this, this.c, this.d, this.e) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockRelatedArticles pageblockrelatedarticles) {
        this.f = pageblockrelatedarticles;
        requestLayout();
    }
}
