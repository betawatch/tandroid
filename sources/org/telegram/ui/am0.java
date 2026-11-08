package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class am0 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final TextView a;
    public org.telegram.ui.Components.my0 b;
    public final org.telegram.ui.Components.g5 c;
    public final /* synthetic */ bm0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am0(bm0 bm0Var, Context context) {
        super(context);
        this.d = bm0Var;
        int i7 = org.telegram.ui.ActionBar.k6.d6;
        hm0 hm0Var = bm0Var.p0;
        org.telegram.ui.ActionBar.r6.i(i7, this, hm0Var.getResourceProvider());
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        boolean z9 = hm0Var.a;
        org.telegram.ui.ActionBar.r6.V(textView, i10, hm0Var.getResourceProvider());
        if (bm0Var.m0 == 1) {
            textView.setText(org.telegram.messenger.id.M0(z9 ? 2131752312 : 2131743733, null));
        } else {
            textView.setText(org.telegram.messenger.id.M0(z9 ? 2131752321 : 2131743736, null));
        }
        addView(textView, c8.ha.d(-1, -2.0f, 23, 20.0f, 0.0f, 20.0f, 0.0f));
        this.c = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(24.0f), 13, this, false);
    }

    public final int a() {
        int i7;
        org.telegram.messenger.gp gpVar;
        org.telegram.messenger.fp d;
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        org.telegram.ui.ActionBar.f6 f6Var4;
        bm0 bm0Var = this.d;
        hm0 hm0Var = bm0Var.p0;
        int i11 = bm0Var.h;
        if (i11 >= 0) {
            if (i11 < 7) {
                return hm0Var.getThemedColor(org.telegram.ui.ActionBar.k6.r8[i11]);
            }
            if (bm0Var.m0 == 1) {
                i10 = ((org.telegram.ui.ActionBar.f2) hm0Var).currentAccount;
                gpVar = org.telegram.messenger.qp.s1(i10).q4;
            } else {
                i7 = ((org.telegram.ui.ActionBar.f2) hm0Var).currentAccount;
                gpVar = org.telegram.messenger.qp.s1(i7).r4;
            }
            return (gpVar == null || (d = gpVar.d(bm0Var.h)) == null) ? hm0Var.getThemedColor(org.telegram.ui.ActionBar.k6.r8[0]) : d.f();
        }
        int i12 = org.telegram.ui.ActionBar.k6.s8;
        if (org.telegram.messenger.g0.B(hm0Var.getThemedColor(i12)) > 0.8f) {
            int i13 = org.telegram.ui.ActionBar.k6.n6;
            f6Var4 = ((org.telegram.ui.ActionBar.f2) hm0Var).resourceProvider;
            return org.telegram.ui.ActionBar.k6.w0(i13, f6Var4);
        }
        if (org.telegram.messenger.g0.B(hm0Var.getThemedColor(i12)) < 0.2f) {
            int i14 = org.telegram.ui.ActionBar.k6.A8;
            f6Var3 = ((org.telegram.ui.ActionBar.f2) hm0Var).resourceProvider;
            return org.telegram.ui.ActionBar.k6.r1(0.5f, org.telegram.ui.ActionBar.k6.w0(i14, f6Var3));
        }
        int i15 = org.telegram.ui.ActionBar.k6.d6;
        f6Var = ((org.telegram.ui.ActionBar.f2) hm0Var).resourceProvider;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i15, f6Var);
        f6Var2 = ((org.telegram.ui.ActionBar.f2) hm0Var).resourceProvider;
        return org.telegram.ui.ActionBar.k6.w(w02, org.telegram.ui.ActionBar.k6.r1(0.7f, hm0.B0(org.telegram.ui.ActionBar.k6.w0(i12, f6Var2))));
    }

    public final void b(boolean z9) {
        bm0 bm0Var = this.d;
        long j3 = bm0Var.n;
        org.telegram.ui.Components.g5 g5Var = this.c;
        if (j3 != 0) {
            g5Var.j(j3, z9);
            this.b = null;
        } else {
            g5Var.g(null, z9);
            if (this.b == null) {
                this.b = new org.telegram.ui.Components.my0(org.telegram.messenger.id.M0(bm0Var.p0.a ? 2131752311 : 2131743732, null), 16.0f, null);
            }
        }
    }

    public final void c() {
        boolean z9 = org.telegram.messenger.id.a0;
        org.telegram.ui.Components.g5 g5Var = this.c;
        g5Var.setBounds(z9 ? org.telegram.messenger.g0.L(21.0f) : (getWidth() - g5Var.s) - org.telegram.messenger.g0.L(21.0f), (getHeight() - g5Var.s) / 2, org.telegram.messenger.id.a0 ? org.telegram.messenger.g0.L(21.0f) + g5Var.s : getWidth() - org.telegram.messenger.g0.L(21.0f), (getHeight() + g5Var.s) / 2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c();
        Integer valueOf = Integer.valueOf(a());
        org.telegram.ui.Components.g5 g5Var = this.c;
        g5Var.k(valueOf);
        org.telegram.ui.Components.my0 my0Var = this.b;
        if (my0Var != null) {
            my0Var.c((getMeasuredWidth() - this.b.k()) - org.telegram.messenger.g0.L(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.p0.getThemedColor(org.telegram.ui.ActionBar.k6.q6), canvas);
        } else {
            g5Var.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        bm0 bm0Var = this.d;
        setBackgroundColor(bm0Var.p0.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
        this.a.setTextColor(bm0Var.p0.getThemedColor(org.telegram.ui.ActionBar.k6.G6));
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
