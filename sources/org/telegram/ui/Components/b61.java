package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.ApplicationLoaderImpl;
import org.telegram.ui.IUpdateLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b61 extends IUpdateLayout {
    public FrameLayout a;
    public RadialProgress2 b;
    public org.telegram.ui.Cells.a2 c;
    public final Activity d;
    public final ViewGroup e;

    public b61(Activity activity, ViewGroup viewGroup) {
        super(activity, viewGroup);
        this.d = activity;
        this.e = viewGroup;
    }

    @Override // org.telegram.ui.IUpdateLayout
    public final void createUpdateUI(int i10) {
        ViewGroup viewGroup = this.e;
        if (viewGroup == null || this.a != null) {
            return;
        }
        Activity activity = this.d;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.a = frameLayout;
        frameLayout.setVisibility(4);
        this.a.setTranslationY(org.telegram.messenger.i0.L(44.0f));
        this.a.setBackground(org.telegram.ui.ActionBar.t6.h0(1090519039, 2, -1));
        viewGroup.addView(this.a, w7.b6.e(-1, 44, 83));
        this.a.setOnClickListener(new bh.f(this, i10, 14));
        org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(this, activity);
        this.c = a2Var;
        a2Var.setTextSize(org.telegram.messenger.i0.L(15.0f));
        this.c.setTypeface(org.telegram.messenger.i0.o());
        this.c.setTextColor(-1);
        this.c.setGravity(17);
        this.a.addView(this.c, w7.b6.g());
        this.c.c(org.telegram.messenger.cd.L0(2131754229, null), false, true);
        RadialProgress2 radialProgress2 = new RadialProgress2(this.c, null);
        this.b = radialProgress2;
        int i11 = org.telegram.ui.ActionBar.t6.Ci;
        radialProgress2.setColors(-1, -1, org.telegram.ui.ActionBar.t6.x0(null, i11, false), org.telegram.ui.ActionBar.t6.x0(null, i11, false));
        this.b.r(0, 0, org.telegram.messenger.i0.L(22.0f), org.telegram.messenger.i0.L(22.0f));
        this.b.setCircleRadius(org.telegram.messenger.i0.L(11.0f));
        this.b.setAsMini();
    }

    @Override // org.telegram.ui.IUpdateLayout
    public final void updateAppUpdateViews(int i10, boolean z10) {
        org.telegram.messenger.k1 e;
        String str;
        int i11;
        if (this.e == null) {
            return;
        }
        if (((!((ApplicationLoaderImpl) org.telegram.messenger.w0.a).q() || (str = (e = org.telegram.messenger.k1.e()).a) == null || (i11 = e.b) == 0) ? null : new org.telegram.messenger.g1(str, i11, e.c)) == null) {
            FrameLayout frameLayout = this.a;
            if (frameLayout == null || frameLayout.getTag() == null) {
                return;
            }
            this.a.setTag(null);
            if (z10) {
                this.a.animate().translationY(org.telegram.messenger.i0.L(44.0f)).setInterpolator(gr.g).setListener(new p11(this, 5)).setDuration(180L).start();
                return;
            } else {
                this.a.setTranslationY(org.telegram.messenger.i0.L(44.0f));
                this.a.setVisibility(4);
                return;
            }
        }
        createUpdateUI(i10);
        File g10 = org.telegram.messenger.w0.a.g();
        if (g10 == null || !g10.exists()) {
            if (!((ApplicationLoaderImpl) org.telegram.messenger.w0.a).q() ? false : org.telegram.messenger.k1.e().j) {
                this.b.setIcon(3, true, z10);
                this.b.p(true, !((ApplicationLoaderImpl) org.telegram.messenger.w0.a).q() ? 0.0f : org.telegram.messenger.k1.e().k);
                this.c.c(org.telegram.messenger.cd.a0(null, null, 2131754226, Integer.valueOf((int) ((!((ApplicationLoaderImpl) org.telegram.messenger.w0.a).q() ? 0.0f : org.telegram.messenger.k1.e().k) * 100.0f))), z10, true);
            } else {
                this.b.setIcon(2, true, z10);
                this.c.c(org.telegram.messenger.cd.L0(2131754229, null), z10, true);
            }
        } else {
            this.b.setIcon(15, true, z10);
            this.c.c(org.telegram.messenger.cd.L0(2131754225, null), z10, true);
        }
        if (this.a.getTag() != null) {
            return;
        }
        this.a.setVisibility(0);
        this.a.setTag(1);
        if (z10) {
            this.a.animate().translationY(0.0f).setInterpolator(gr.g).setListener(null).setDuration(180L).start();
        } else {
            this.a.setTranslationY(0.0f);
        }
    }

    @Override // org.telegram.ui.IUpdateLayout
    public final void updateFileProgress(Object[] objArr) {
        if (this.a == null || this.c == null) {
            return;
        }
        if (!((ApplicationLoaderImpl) org.telegram.messenger.w0.a).q() ? false : org.telegram.messenger.k1.e().j) {
            float f7 = !((ApplicationLoaderImpl) org.telegram.messenger.w0.a).q() ? 0.0f : org.telegram.messenger.k1.e().k;
            this.b.p(true, f7);
            this.c.setText(org.telegram.messenger.cd.a0(null, null, 2131754226, Integer.valueOf((int) (f7 * 100.0f))));
            this.a.invalidate();
        }
    }
}
