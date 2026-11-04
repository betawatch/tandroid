package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
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
public final class i1 extends FrameLayout implements org.telegram.ui.Cells.g9 {
    public final ci.j1 a;
    public final f1 b;
    public a3 c;
    public a3 d;
    public int e;
    public int f;
    public int h;
    public int n;
    public boolean r;
    public TL_iv.pageBlockCollage s;
    public final h1 w;
    public final g4 x;
    public final /* synthetic */ i4 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(i4 i4Var, Context context, g4 g4Var) {
        super(context);
        this.y = i4Var;
        this.w = new h1(this);
        this.x = g4Var;
        ci.j1 j1Var = new ci.j1(6, context, this);
        this.a = j1Var;
        j1Var.i(new c1(this));
        d1 d1Var = new d1(this);
        d1Var.O = new e1(this);
        j1Var.setLayoutManager(d1Var);
        f1 f1Var = new f1(this);
        this.b = f1Var;
        j1Var.setAdapter(f1Var);
        addView(j1Var, b8.mf.c(-2.0f, -1));
        setWillNotDraw(false);
    }

    @Override // org.telegram.ui.Cells.g9
    public final void k(ArrayList arrayList) {
        a3 a3Var = this.c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            arrayList.add(a3Var2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.c;
        if (a3Var != null) {
            a3Var.i(this);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            a3Var2.i(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.c;
        if (a3Var != null) {
            a3Var.f(this);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            a3Var2.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.s == null) {
            return;
        }
        a3 a3Var = this.c;
        i4 i4Var = this.y;
        int i3 = 0;
        if (a3Var != null) {
            canvas.save();
            canvas.translate(this.f, this.h);
            i4.t(i4Var, canvas, this, 0);
            this.c.d(canvas, this);
            canvas.restore();
            i3 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f, this.h + this.n);
            i4.t(i4Var, canvas, this, i3);
            this.d.d(canvas, this);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.bd.M0(2131754895, null));
        if (this.c != null) {
            sb2.append(", ");
            sb2.append(this.c.d.getText());
        }
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13 = this.e;
        int L = org.telegram.messenger.g0.L(8.0f);
        int i14 = this.e;
        ci.j1 j1Var = this.a;
        j1Var.layout(i13, L, j1Var.getMeasuredWidth() + i14, org.telegram.messenger.g0.L(8.0f) + j1Var.getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        i1 i1Var;
        int L;
        int i11;
        int i12 = 1;
        this.r = true;
        int size = View.MeasureSpec.getSize(i3);
        TL_iv.pageBlockCollage pageblockcollage = this.s;
        if (pageblockcollage != null) {
            if (pageblockcollage.level > 0) {
                int L2 = org.telegram.messenger.g0.L(18.0f) + org.telegram.messenger.g0.L(r15 * 14);
                this.e = L2;
                this.f = L2;
                i11 = org.telegram.messenger.camera.q.w(18.0f, L2, size);
                L = i11;
            } else {
                this.e = 0;
                this.f = org.telegram.messenger.g0.L(18.0f);
                L = size - org.telegram.messenger.g0.L(36.0f);
                i11 = size;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            ci.j1 j1Var = this.a;
            j1Var.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredHeight = j1Var.getMeasuredHeight();
            int L3 = org.telegram.messenger.g0.L(8.0f) + measuredHeight;
            this.h = L3;
            TL_iv.pageBlockCollage pageblockcollage2 = this.s;
            TL_iv.RichText richText = pageblockcollage2.caption.text;
            HashSet hashSet = i4.d1;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            i4 i4Var = this.y;
            i1Var = this;
            a3 n4 = i4.n(i4Var, i1Var, null, richText, L, L3, pageblockcollage2, alignment, 0, this.x);
            i1Var.c = n4;
            if (n4 != null) {
                int height = i1Var.c.d.getHeight() + org.telegram.messenger.g0.L(4.0f);
                i1Var.n = height;
                measuredHeight = org.telegram.messenger.k5.C(4.0f, height, measuredHeight);
                a3 a3Var = i1Var.c;
                a3Var.s = i1Var.f;
                a3Var.w = i1Var.h;
            } else {
                i1Var.n = 0;
            }
            TL_iv.pageBlockCollage pageblockcollage3 = i1Var.s;
            TL_iv.RichText richText2 = pageblockcollage3.caption.credit;
            if (i1Var.x.H) {
                alignment = org.telegram.ui.Components.lu0.a();
            }
            a3 n10 = i4.n(i4Var, i1Var, null, richText2, L, 0, pageblockcollage3, alignment, 0, i1Var.x);
            i1Var.d = n10;
            if (n10 != null) {
                measuredHeight += i1Var.d.d.getHeight() + org.telegram.messenger.g0.L(4.0f);
                a3 a3Var2 = i1Var.d;
                a3Var2.s = i1Var.f;
                a3Var2.w = i1Var.h + i1Var.n;
            }
            int L4 = org.telegram.messenger.g0.L(16.0f) + measuredHeight;
            TL_iv.pageBlockCollage pageblockcollage4 = i1Var.s;
            i12 = (pageblockcollage4.level <= 0 || pageblockcollage4.bottom) ? L4 : org.telegram.messenger.g0.L(8.0f) + L4;
        } else {
            i1Var = this;
        }
        setMeasuredDimension(size, i12);
        i1Var.r = false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a3 a3Var = this.c;
        int i3 = this.f;
        int i10 = this.h;
        i4 i4Var = this.y;
        if (i4.j(i4Var, this.x, motionEvent, this, a3Var, i3, i10)) {
            return true;
        }
        return i4.j(i4Var, this.x, motionEvent, this, this.d, this.f, this.h + this.n) || super.onTouchEvent(motionEvent);
    }
}
