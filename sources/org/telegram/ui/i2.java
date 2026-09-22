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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class i2 extends View implements org.telegram.ui.Cells.p9, d3 {
    public final u70 a;
    public final f4 b;
    public a3 c;
    public final int d;
    public int e;
    public TL_iv.pageBlockRelatedArticles f;

    public i2(Context context, u70 u70Var, f4 f4Var) {
        super(context);
        this.d = AndroidUtilities.dp(18.0f);
        this.a = u70Var;
        this.b = f4Var;
    }

    @Override // org.telegram.ui.Cells.p9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override // org.telegram.ui.d3
    public int getBoundLeft() {
        a3 a3Var = this.c;
        if (a3Var == null) {
            return -1;
        }
        int a2 = a3Var.a() + a3Var.s;
        this.a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override // org.telegram.ui.d3
    public int getBoundRight() {
        a3 a3Var = this.c;
        if (a3Var == null) {
            return -1;
        }
        int b10 = a3Var.b() + a3Var.s;
        this.a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override // org.telegram.ui.d3
    public int getLastLineBoundRight() {
        a3 a3Var = this.c;
        if (a3Var == null) {
            return -1;
        }
        int c10 = a3Var.c() + a3Var.s;
        this.a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return org.telegram.messenger.vl.b(this);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.c;
        if (a3Var != null) {
            a3Var.attach(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.c;
        if (a3Var != null) {
            a3Var.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f == null || this.c == null) {
            return;
        }
        canvas.save();
        canvas.translate(this.d, this.e);
        h4.v(this.a, canvas, this, 0);
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
        a3 a3Var = this.c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(h4.i(R.string.AccDescrIVRelatedArticles, h4.j(this.a, this.b, a3Var)));
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        i2 i2Var;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockRelatedArticles pageblockrelatedarticles = this.f;
        if (pageblockrelatedarticles != null) {
            i2Var = this;
            a3 p5 = h4.p(this.a, i2Var, null, pageblockrelatedarticles.title, size - AndroidUtilities.dp(52.0f), 0, this.f, Layout.Alignment.ALIGN_NORMAL, 1, this.b);
            i2Var.c = p5;
            if (p5 != null) {
                i2Var.e = ((AndroidUtilities.dp(32.0f) - i2Var.c.d.getHeight()) / 2) + AndroidUtilities.dp(6.0f);
            }
        } else {
            i2Var = this;
        }
        if (i2Var.c == null) {
            setMeasuredDimension(size, 1);
            return;
        }
        setMeasuredDimension(size, AndroidUtilities.dp(38.0f));
        a3 a3Var = i2Var.c;
        a3Var.s = i2Var.d;
        a3Var.v = i2Var.e;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return h4.l(this.a, this.b, motionEvent, this, this.c, this.d, this.e) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockRelatedArticles pageblockrelatedarticles) {
        this.f = pageblockrelatedarticles;
        requestLayout();
    }
}
