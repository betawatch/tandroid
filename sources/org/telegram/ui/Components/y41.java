package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.ApplicationLoaderImpl;
import org.telegram.ui.IUpdateLayout;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class y41 extends IUpdateLayout {
    public FrameLayout a;
    public RadialProgress2 b;
    public org.telegram.ui.Cells.a2 c;
    public final Activity d;
    public final ViewGroup e;

    public y41(Activity activity, ViewGroup viewGroup) {
        super(activity, viewGroup);
        this.d = activity;
        this.e = viewGroup;
    }

    @Override // org.telegram.ui.IUpdateLayout
    public final void createUpdateUI(int i7) {
        ViewGroup viewGroup = this.e;
        if (viewGroup == null || this.a != null) {
            return;
        }
        Activity activity = this.d;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.a = frameLayout;
        frameLayout.setVisibility(4);
        this.a.setTranslationY(org.telegram.messenger.g0.L(44.0f));
        this.a.setBackground(org.telegram.ui.ActionBar.k6.h0(1090519039, 2, -1));
        viewGroup.addView(this.a, c8.ha.e(-1, 44, 83));
        this.a.setOnClickListener(new ai.v(this, i7, 19));
        org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(this, activity);
        this.c = a2Var;
        a2Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        this.c.setTypeface(org.telegram.messenger.g0.o());
        this.c.setTextColor(-1);
        this.c.setGravity(17);
        this.a.addView(this.c, c8.ha.g());
        this.c.c(org.telegram.messenger.id.M0(2131754229, null), false, true);
        RadialProgress2 radialProgress2 = new RadialProgress2(this.c, null);
        this.b = radialProgress2;
        int i10 = org.telegram.ui.ActionBar.k6.Ci;
        radialProgress2.setColors(-1, -1, org.telegram.ui.ActionBar.k6.x0(null, i10, false), org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        this.b.r(0, 0, org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f));
        this.b.setCircleRadius(org.telegram.messenger.g0.L(11.0f));
        this.b.setAsMini();
    }

    @Override // org.telegram.ui.IUpdateLayout
    public final void updateAppUpdateViews(int i7, boolean z9) {
        org.telegram.messenger.h1 e10;
        String str;
        int i10;
        if (this.e == null) {
            return;
        }
        if (((!((ApplicationLoaderImpl) org.telegram.messenger.t0.a).q() || (str = (e10 = org.telegram.messenger.h1.e()).a) == null || (i10 = e10.b) == 0) ? null : new org.telegram.messenger.d1(str, i10, e10.c)) == null) {
            FrameLayout frameLayout = this.a;
            if (frameLayout == null || frameLayout.getTag() == null) {
                return;
            }
            this.a.setTag(null);
            if (z9) {
                this.a.animate().translationY(org.telegram.messenger.g0.L(44.0f)).setInterpolator(xq.g).setListener(new f11(this, 4)).setDuration(180L).start();
                return;
            } else {
                this.a.setTranslationY(org.telegram.messenger.g0.L(44.0f));
                this.a.setVisibility(4);
                return;
            }
        }
        createUpdateUI(i7);
        File g10 = org.telegram.messenger.t0.a.g();
        if (g10 == null || !g10.exists()) {
            if (!((ApplicationLoaderImpl) org.telegram.messenger.t0.a).q() ? false : org.telegram.messenger.h1.e().j) {
                this.b.setIcon(3, true, z9);
                this.b.p(true, !((ApplicationLoaderImpl) org.telegram.messenger.t0.a).q() ? 0.0f : org.telegram.messenger.h1.e().k);
                this.c.c(org.telegram.messenger.id.a0(null, null, 2131754226, Integer.valueOf((int) ((!((ApplicationLoaderImpl) org.telegram.messenger.t0.a).q() ? 0.0f : org.telegram.messenger.h1.e().k) * 100.0f))), z9, true);
            } else {
                this.b.setIcon(2, true, z9);
                this.c.c(org.telegram.messenger.id.M0(2131754229, null), z9, true);
            }
        } else {
            this.b.setIcon(15, true, z9);
            this.c.c(org.telegram.messenger.id.M0(2131754225, null), z9, true);
        }
        if (this.a.getTag() != null) {
            return;
        }
        this.a.setVisibility(0);
        this.a.setTag(1);
        if (z9) {
            this.a.animate().translationY(0.0f).setInterpolator(xq.g).setListener(null).setDuration(180L).start();
        } else {
            this.a.setTranslationY(0.0f);
        }
    }

    @Override // org.telegram.ui.IUpdateLayout
    public final void updateFileProgress(Object[] objArr) {
        if (this.a == null || this.c == null) {
            return;
        }
        if (!((ApplicationLoaderImpl) org.telegram.messenger.t0.a).q() ? false : org.telegram.messenger.h1.e().j) {
            float f10 = !((ApplicationLoaderImpl) org.telegram.messenger.t0.a).q() ? 0.0f : org.telegram.messenger.h1.e().k;
            this.b.p(true, f10);
            this.c.setText(org.telegram.messenger.id.a0(null, null, 2131754226, Integer.valueOf((int) (f10 * 100.0f))));
            this.a.invalidate();
        }
    }
}
