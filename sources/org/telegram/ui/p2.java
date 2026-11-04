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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class p2 extends FrameLayout implements org.telegram.ui.Cells.g9, org.telegram.ui.ActionBar.z5 {
    public final /* synthetic */ i4 E;
    public int a;
    public final k2 b;
    public final n2 c;
    public final o2 d;
    public TL_iv.pageBlockSlideshow e;
    public a3 f;
    public a3 h;
    public final int n;
    public int r;
    public int s;
    public float w;
    public int x;
    public final g4 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(i4 i4Var, Context context, g4 g4Var) {
        super(context);
        this.E = i4Var;
        this.n = org.telegram.messenger.g0.L(18.0f);
        this.y = g4Var;
        if (i4.D1 == null) {
            Paint paint = new Paint(1);
            i4.D1 = paint;
            paint.setColor(-1);
        }
        k2 k2Var = new k2(this, context);
        this.b = k2Var;
        k2Var.b(new l2(this, 0));
        n2 n2Var = new n2(this);
        this.c = n2Var;
        k2Var.setAdapter(n2Var);
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false);
        this.a = x02;
        org.telegram.messenger.g0.C3(k2Var, x02);
        addView(k2Var);
        o2 o2Var = new o2(this, context);
        this.d = o2Var;
        addView(o2Var);
        setWillNotDraw(false);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d6));
    }

    @Override // org.telegram.ui.Cells.g9
    public final void k(ArrayList arrayList) {
        a3 a3Var = this.f;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
        a3 a3Var2 = this.h;
        if (a3Var2 != null) {
            arrayList.add(a3Var2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f;
        if (a3Var != null) {
            a3Var.i(this);
        }
        a3 a3Var2 = this.h;
        if (a3Var2 != null) {
            a3Var2.i(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f;
        if (a3Var != null) {
            a3Var.f(this);
        }
        a3 a3Var2 = this.h;
        if (a3Var2 != null) {
            a3Var2.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.e == null) {
            return;
        }
        a3 a3Var = this.f;
        i4 i4Var = this.E;
        int i3 = this.n;
        int i10 = 0;
        if (a3Var != null) {
            canvas.save();
            canvas.translate(i3, this.r);
            i4.t(i4Var, canvas, this, 0);
            this.f.d(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.h != null) {
            canvas.save();
            canvas.translate(i3, this.r + this.s);
            i4.t(i4Var, canvas, this, i10);
            this.h.d(canvas, this);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.bd.M0(2131754856, null));
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
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int L = org.telegram.messenger.g0.L(8.0f);
        k2 k2Var = this.b;
        k2Var.layout(0, L, k2Var.getMeasuredWidth(), k2Var.getMeasuredHeight() + org.telegram.messenger.g0.L(8.0f));
        int bottom = k2Var.getBottom() - org.telegram.messenger.g0.L(23.0f);
        o2 o2Var = this.d;
        o2Var.layout(0, bottom, o2Var.getMeasuredWidth(), o2Var.getMeasuredHeight() + bottom);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i3);
        if (this.e != null) {
            int L = org.telegram.messenger.g0.L(310.0f);
            this.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_30));
            this.e.items.size();
            this.d.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(10.0f), TLObject.FLAG_30));
            int L2 = size - org.telegram.messenger.g0.L(36.0f);
            int L3 = org.telegram.messenger.g0.L(16.0f) + L;
            this.r = L3;
            TL_iv.pageBlockSlideshow pageblockslideshow = this.e;
            TL_iv.RichText richText = pageblockslideshow.caption.text;
            HashSet hashSet = i4.d1;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            i4 i4Var = this.E;
            a3 n4 = i4.n(i4Var, this, null, richText, L2, L3, pageblockslideshow, alignment, 0, this.y);
            this.f = n4;
            int i12 = this.n;
            if (n4 != null) {
                int height = this.f.d.getHeight() + org.telegram.messenger.g0.L(4.0f);
                this.s = height;
                L = org.telegram.messenger.k5.C(4.0f, height, L);
                a3 a3Var = this.f;
                a3Var.s = i12;
                a3Var.w = this.r;
            } else {
                this.s = 0;
            }
            TL_iv.pageBlockSlideshow pageblockslideshow2 = this.e;
            TL_iv.RichText richText2 = pageblockslideshow2.caption.credit;
            if (this.y.H) {
                alignment = org.telegram.ui.Components.lu0.a();
            }
            a3 n10 = i4.n(i4Var, this, null, richText2, L2, 0, pageblockslideshow2, alignment, 0, this.y);
            this.h = n10;
            if (n10 != null) {
                L += this.h.d.getHeight() + org.telegram.messenger.g0.L(4.0f);
                a3 a3Var2 = this.h;
                a3Var2.s = i12;
                a3Var2.w = this.r + this.s;
            }
            i11 = org.telegram.messenger.g0.L(16.0f) + L;
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a3 a3Var = this.f;
        int i3 = this.n;
        int i10 = this.r;
        i4 i4Var = this.E;
        if (i4.j(i4Var, this.y, motionEvent, this, a3Var, i3, i10)) {
            return true;
        }
        return i4.j(i4Var, this.y, motionEvent, this, this.h, this.n, this.r + this.s) || super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        k2 k2Var = this.b;
        if (k2Var == null) {
            return;
        }
        try {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false);
            if (x02 != this.a) {
                this.a = x02;
                org.telegram.messenger.g0.C3(k2Var, x02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
