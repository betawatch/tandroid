package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class o2 extends FrameLayout implements org.telegram.ui.Cells.j9, org.telegram.ui.ActionBar.k6 {
    public final /* synthetic */ h4 D;
    public int a;
    public final j2 b;
    public final m2 c;
    public final n2 d;
    public TL_iv.pageBlockSlideshow e;
    public z2 f;
    public z2 h;
    public final int n;
    public int r;
    public int s;
    public float w;
    public int x;
    public final f4 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(h4 h4Var, Context context, f4 f4Var) {
        super(context);
        this.D = h4Var;
        this.n = org.telegram.messenger.i0.L(18.0f);
        this.y = f4Var;
        if (h4.C1 == null) {
            Paint paint = new Paint(1);
            h4.C1 = paint;
            paint.setColor(-1);
        }
        j2 j2Var = new j2(this, context);
        this.b = j2Var;
        j2Var.b(new k2(this, 0));
        m2 m2Var = new m2(this);
        this.c = m2Var;
        j2Var.setAdapter(m2Var);
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false);
        this.a = x02;
        org.telegram.messenger.i0.B3(j2Var, x02);
        addView(j2Var);
        n2 n2Var = new n2(this, context);
        this.d = n2Var;
        addView(n2Var);
        setWillNotDraw(false);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d6));
    }

    @Override // org.telegram.ui.Cells.j9
    public final void h(ArrayList arrayList) {
        z2 z2Var = this.f;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
        z2 z2Var2 = this.h;
        if (z2Var2 != null) {
            arrayList.add(z2Var2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f;
        if (z2Var != null) {
            z2Var.i(this);
        }
        z2 z2Var2 = this.h;
        if (z2Var2 != null) {
            z2Var2.i(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f;
        if (z2Var != null) {
            z2Var.f(this);
        }
        z2 z2Var2 = this.h;
        if (z2Var2 != null) {
            z2Var2.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.e == null) {
            return;
        }
        z2 z2Var = this.f;
        h4 h4Var = this.D;
        int i10 = this.n;
        int i11 = 0;
        if (z2Var != null) {
            canvas.save();
            canvas.translate(i10, this.r);
            h4.t(h4Var, canvas, this, 0);
            this.f.d(canvas, this);
            canvas.restore();
            i11 = 1;
        }
        if (this.h != null) {
            canvas.save();
            canvas.translate(i10, this.r + this.s);
            h4.t(h4Var, canvas, this, i11);
            this.h.d(canvas, this);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.cd.L0(2131754856, null));
        if (this.f != null) {
            sb2.append(", ");
            sb2.append(this.f.d.getText());
        }
        if (this.h != null) {
            sb2.append(", ");
            sb2.append(this.h.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int L = org.telegram.messenger.i0.L(8.0f);
        j2 j2Var = this.b;
        j2Var.layout(0, L, j2Var.getMeasuredWidth(), j2Var.getMeasuredHeight() + org.telegram.messenger.i0.L(8.0f));
        int bottom = j2Var.getBottom() - org.telegram.messenger.i0.L(23.0f);
        n2 n2Var = this.d;
        n2Var.layout(0, bottom, n2Var.getMeasuredWidth(), n2Var.getMeasuredHeight() + bottom);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        if (this.e != null) {
            int L = org.telegram.messenger.i0.L(310.0f);
            this.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_30));
            this.e.items.size();
            this.d.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(10.0f), TLObject.FLAG_30));
            int L2 = size - org.telegram.messenger.i0.L(36.0f);
            int L3 = org.telegram.messenger.i0.L(16.0f) + L;
            this.r = L3;
            TL_iv.pageBlockSlideshow pageblockslideshow = this.e;
            TL_iv.RichText richText = pageblockslideshow.caption.text;
            HashSet hashSet = h4.c1;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            h4 h4Var = this.D;
            z2 n10 = h4.n(h4Var, this, null, richText, L2, L3, pageblockslideshow, alignment, 0, this.y);
            this.f = n10;
            int i13 = this.n;
            if (n10 != null) {
                int height = this.f.d.getHeight() + org.telegram.messenger.i0.L(4.0f);
                this.s = height;
                L = org.telegram.messenger.m5.C(4.0f, height, L);
                z2 z2Var = this.f;
                z2Var.s = i13;
                z2Var.w = this.r;
            } else {
                this.s = 0;
            }
            TL_iv.pageBlockSlideshow pageblockslideshow2 = this.e;
            TL_iv.RichText richText2 = pageblockslideshow2.caption.credit;
            if (this.y.G) {
                alignment = org.telegram.ui.Components.ov0.a();
            }
            z2 n11 = h4.n(h4Var, this, null, richText2, L2, 0, pageblockslideshow2, alignment, 0, this.y);
            this.h = n11;
            if (n11 != null) {
                L += this.h.d.getHeight() + org.telegram.messenger.i0.L(4.0f);
                z2 z2Var2 = this.h;
                z2Var2.s = i13;
                z2Var2.w = this.r + this.s;
            }
            i12 = org.telegram.messenger.i0.L(16.0f) + L;
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        z2 z2Var = this.f;
        int i10 = this.n;
        int i11 = this.r;
        h4 h4Var = this.D;
        if (h4.j(h4Var, this.y, motionEvent, this, z2Var, i10, i11)) {
            return true;
        }
        return h4.j(h4Var, this.y, motionEvent, this, this.h, this.n, this.r + this.s) || super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        j2 j2Var = this.b;
        if (j2Var == null) {
            return;
        }
        try {
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false);
            if (x02 != this.a) {
                this.a = x02;
                org.telegram.messenger.i0.B3(j2Var, x02);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
