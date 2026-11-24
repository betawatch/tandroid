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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class jv extends View implements eib, dw {
    public final vg5 a;
    public final dx b;
    public bw c;
    public final int d;
    public int e;
    public TL_iv.pageBlockRelatedArticles f;

    public jv(Activity activity, vg5 vg5Var, dx dxVar) {
        super(activity);
        this.d = gl.L(18.0f);
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
        bw bwVar = this.c;
        if (bwVar == null) {
            return;
        }
        accessibilityNodeInfo.setText(o.f(2131754856, o.g(this.a, this.b, bwVar)));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        jv jvVar;
        int size = View.MeasureSpec.getSize(i);
        TL_iv.pageBlockRelatedArticles pageblockrelatedarticles = this.f;
        if (pageblockrelatedarticles != null) {
            jvVar = this;
            bw n = o.n(this.a, jvVar, null, pageblockrelatedarticles.title, size - gl.L(52.0f), 0, this.f, Layout.Alignment.ALIGN_NORMAL, 1, this.b);
            jvVar.c = n;
            if (n != null) {
                jvVar.e = ((gl.L(32.0f) - jvVar.c.d.getHeight()) / 2) + gl.L(6.0f);
            }
        } else {
            jvVar = this;
        }
        if (jvVar.c == null) {
            jvVar.setMeasuredDimension(size, 1);
            return;
        }
        jvVar.setMeasuredDimension(size, gl.L(38.0f));
        bw bwVar = jvVar.c;
        bwVar.s = jvVar.d;
        bwVar.w = jvVar.e;
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
