package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import j$.util.Objects;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public abstract class nx0 extends FrameLayout implements org.telegram.messenger.fs {
    public final bi.n5 a;
    public final org.telegram.ui.Components.f71 b;
    public final fi.d6 c;
    public final mx0 d;
    public int e;
    public boolean f;
    public ValueAnimator h;
    public float n;
    public boolean r;
    public final Rect s;
    public final ru0 w;

    public nx0(Context context, fi.d6 d6Var, final org.telegram.ui.Components.gq0 gq0Var) {
        super(context);
        this.s = new Rect();
        this.c = d6Var;
        Objects.requireNonNull(d6Var);
        this.w = new ru0(d6Var, 8);
        final org.telegram.ui.Components.hq0 hq0Var = (org.telegram.ui.Components.hq0) this;
        bi.n5 n5Var = new bi.n5(hq0Var, context, gq0Var, 2);
        this.a = n5Var;
        n5Var.setAllowDisallowInterceptTouch(true);
        mx0 mx0Var = new mx0(hq0Var);
        this.d = mx0Var;
        mx0Var.a = d6Var.a();
        n5Var.setAdapter(mx0Var);
        n5Var.setTranslationY(org.telegram.messenger.g0.L(42.0f));
        org.telegram.ui.Components.f71 i7 = n5Var.i(10, true);
        this.b = i7;
        i7.h(org.telegram.ui.ActionBar.n6.xi, org.telegram.ui.ActionBar.n6.G6, org.telegram.ui.ActionBar.n6.vi, org.telegram.ui.ActionBar.n6.yi, org.telegram.ui.ActionBar.n6.s8);
        i7.r = 12;
        final int i10 = 0;
        i7.setPreTabClick(new org.telegram.messenger.r10() { // from class: org.telegram.ui.kx0
            @Override // org.telegram.messenger.r10
            public final Object g(Number number, Object obj) {
                fi.p6 storiesController;
                int i11 = i10;
                final org.telegram.ui.Components.gq0 gq0Var2 = gq0Var;
                org.telegram.ui.Components.hq0 hq0Var2 = hq0Var;
                Integer num = (Integer) number;
                switch (i11) {
                    case 0:
                        if (!hq0Var2.f) {
                            if (num.intValue() != -1) {
                                break;
                            } else {
                                org.telegram.ui.Components.b5.P(gq0Var2.a, gq0Var2.b, gq0Var2.c, new org.telegram.ui.Components.iy(gq0Var2, 19));
                                break;
                            }
                        } else {
                            break;
                        }
                    default:
                        View view = (View) obj;
                        if (num.intValue() != -1 && num.intValue() != 0 && !hq0Var2.f) {
                            final int intValue = num.intValue();
                            org.telegram.ui.Components.gt0 gt0Var = gq0Var2.d;
                            org.telegram.ui.ActionBar.h2 h2Var = gt0Var.y1;
                            storiesController = gt0Var.getStoriesController();
                            if (storiesController.i(gt0Var.m1)) {
                                org.telegram.ui.Components.y60 I = org.telegram.ui.Components.y60.I(h2Var, view);
                                I.X(new bi.p5(gq0Var2));
                                final int i12 = 0;
                                I.c(R.drawable.menu_add_stories, org.telegram.messenger.gd.M0(2131744563, null), new Runnable() { // from class: org.telegram.ui.Components.fq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                gt0 gt0Var2 = gq0Var2.d;
                                                org.telegram.ui.ActionBar.h2 h2Var2 = gt0Var2.y1;
                                                gt0Var2.a1(intValue, gt0Var2.m1, h2Var2);
                                                break;
                                            case 1:
                                                gt0 gt0Var3 = gq0Var2.d;
                                                org.telegram.ui.ActionBar.h2 h2Var3 = gt0Var3.y1;
                                                gt0Var3.c1(intValue, gt0Var3.m1, h2Var3);
                                                break;
                                            case 2:
                                                gq0Var2.d.s1(intValue);
                                                break;
                                            default:
                                                gt0 gt0Var4 = gq0Var2.d;
                                                org.telegram.ui.ActionBar.h2 h2Var4 = gt0Var4.y1;
                                                gt0Var4.b1(intValue, gt0Var4.m1, h2Var4);
                                                break;
                                        }
                                    }
                                }, false);
                                gt0Var.B(new org.telegram.ui.Cells.b5(I), h2Var, gt0Var.m1, intValue);
                                final int i13 = 1;
                                I.c(R.drawable.msg_edit, org.telegram.messenger.gd.M0(2131744558, null), new Runnable() { // from class: org.telegram.ui.Components.fq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                gt0 gt0Var2 = gq0Var2.d;
                                                org.telegram.ui.ActionBar.h2 h2Var2 = gt0Var2.y1;
                                                gt0Var2.a1(intValue, gt0Var2.m1, h2Var2);
                                                break;
                                            case 1:
                                                gt0 gt0Var3 = gq0Var2.d;
                                                org.telegram.ui.ActionBar.h2 h2Var3 = gt0Var3.y1;
                                                gt0Var3.c1(intValue, gt0Var3.m1, h2Var3);
                                                break;
                                            case 2:
                                                gq0Var2.d.s1(intValue);
                                                break;
                                            default:
                                                gt0 gt0Var4 = gq0Var2.d;
                                                org.telegram.ui.ActionBar.h2 h2Var4 = gt0Var4.y1;
                                                gt0Var4.b1(intValue, gt0Var4.m1, h2Var4);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i14 = 2;
                                I.c(R.drawable.tabs_reorder, org.telegram.messenger.gd.M0(2131744555, null), new Runnable() { // from class: org.telegram.ui.Components.fq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                gt0 gt0Var2 = gq0Var2.d;
                                                org.telegram.ui.ActionBar.h2 h2Var2 = gt0Var2.y1;
                                                gt0Var2.a1(intValue, gt0Var2.m1, h2Var2);
                                                break;
                                            case 1:
                                                gt0 gt0Var3 = gq0Var2.d;
                                                org.telegram.ui.ActionBar.h2 h2Var3 = gt0Var3.y1;
                                                gt0Var3.c1(intValue, gt0Var3.m1, h2Var3);
                                                break;
                                            case 2:
                                                gq0Var2.d.s1(intValue);
                                                break;
                                            default:
                                                gt0 gt0Var4 = gq0Var2.d;
                                                org.telegram.ui.ActionBar.h2 h2Var4 = gt0Var4.y1;
                                                gt0Var4.b1(intValue, gt0Var4.m1, h2Var4);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i15 = 3;
                                I.c(R.drawable.msg_delete, org.telegram.messenger.gd.M0(2131744561, null), new Runnable() { // from class: org.telegram.ui.Components.fq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i15) {
                                            case 0:
                                                gt0 gt0Var2 = gq0Var2.d;
                                                org.telegram.ui.ActionBar.h2 h2Var2 = gt0Var2.y1;
                                                gt0Var2.a1(intValue, gt0Var2.m1, h2Var2);
                                                break;
                                            case 1:
                                                gt0 gt0Var3 = gq0Var2.d;
                                                org.telegram.ui.ActionBar.h2 h2Var3 = gt0Var3.y1;
                                                gt0Var3.c1(intValue, gt0Var3.m1, h2Var3);
                                                break;
                                            case 2:
                                                gq0Var2.d.s1(intValue);
                                                break;
                                            default:
                                                gt0 gt0Var4 = gq0Var2.d;
                                                org.telegram.ui.ActionBar.h2 h2Var4 = gt0Var4.y1;
                                                gt0Var4.b1(intValue, gt0Var4.m1, h2Var4);
                                                break;
                                        }
                                    }
                                }, true);
                                I.a0();
                            }
                            break;
                        } else {
                            break;
                        }
                        break;
                }
                return Boolean.FALSE;
            }
        });
        final int i11 = 1;
        i7.setOnTabLongClick(new org.telegram.messenger.r10() { // from class: org.telegram.ui.kx0
            @Override // org.telegram.messenger.r10
            public final Object g(Number number, Object obj) {
                fi.p6 storiesController;
                int i112 = i11;
                final org.telegram.ui.Components.gq0 gq0Var2 = gq0Var;
                org.telegram.ui.Components.hq0 hq0Var2 = hq0Var;
                Integer num = (Integer) number;
                switch (i112) {
                    case 0:
                        if (!hq0Var2.f) {
                            if (num.intValue() != -1) {
                                break;
                            } else {
                                org.telegram.ui.Components.b5.P(gq0Var2.a, gq0Var2.b, gq0Var2.c, new org.telegram.ui.Components.iy(gq0Var2, 19));
                                break;
                            }
                        } else {
                            break;
                        }
                    default:
                        View view = (View) obj;
                        if (num.intValue() != -1 && num.intValue() != 0 && !hq0Var2.f) {
                            final int intValue = num.intValue();
                            org.telegram.ui.Components.gt0 gt0Var = gq0Var2.d;
                            org.telegram.ui.ActionBar.h2 h2Var = gt0Var.y1;
                            storiesController = gt0Var.getStoriesController();
                            if (storiesController.i(gt0Var.m1)) {
                                org.telegram.ui.Components.y60 I = org.telegram.ui.Components.y60.I(h2Var, view);
                                I.X(new bi.p5(gq0Var2));
                                final int i12 = 0;
                                I.c(R.drawable.menu_add_stories, org.telegram.messenger.gd.M0(2131744563, null), new Runnable() { // from class: org.telegram.ui.Components.fq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                gt0 gt0Var2 = gq0Var2.d;
                                                org.telegram.ui.ActionBar.h2 h2Var2 = gt0Var2.y1;
                                                gt0Var2.a1(intValue, gt0Var2.m1, h2Var2);
                                                break;
                                            case 1:
                                                gt0 gt0Var3 = gq0Var2.d;
                                                org.telegram.ui.ActionBar.h2 h2Var3 = gt0Var3.y1;
                                                gt0Var3.c1(intValue, gt0Var3.m1, h2Var3);
                                                break;
                                            case 2:
                                                gq0Var2.d.s1(intValue);
                                                break;
                                            default:
                                                gt0 gt0Var4 = gq0Var2.d;
                                                org.telegram.ui.ActionBar.h2 h2Var4 = gt0Var4.y1;
                                                gt0Var4.b1(intValue, gt0Var4.m1, h2Var4);
                                                break;
                                        }
                                    }
                                }, false);
                                gt0Var.B(new org.telegram.ui.Cells.b5(I), h2Var, gt0Var.m1, intValue);
                                final int i13 = 1;
                                I.c(R.drawable.msg_edit, org.telegram.messenger.gd.M0(2131744558, null), new Runnable() { // from class: org.telegram.ui.Components.fq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                gt0 gt0Var2 = gq0Var2.d;
                                                org.telegram.ui.ActionBar.h2 h2Var2 = gt0Var2.y1;
                                                gt0Var2.a1(intValue, gt0Var2.m1, h2Var2);
                                                break;
                                            case 1:
                                                gt0 gt0Var3 = gq0Var2.d;
                                                org.telegram.ui.ActionBar.h2 h2Var3 = gt0Var3.y1;
                                                gt0Var3.c1(intValue, gt0Var3.m1, h2Var3);
                                                break;
                                            case 2:
                                                gq0Var2.d.s1(intValue);
                                                break;
                                            default:
                                                gt0 gt0Var4 = gq0Var2.d;
                                                org.telegram.ui.ActionBar.h2 h2Var4 = gt0Var4.y1;
                                                gt0Var4.b1(intValue, gt0Var4.m1, h2Var4);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i14 = 2;
                                I.c(R.drawable.tabs_reorder, org.telegram.messenger.gd.M0(2131744555, null), new Runnable() { // from class: org.telegram.ui.Components.fq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                gt0 gt0Var2 = gq0Var2.d;
                                                org.telegram.ui.ActionBar.h2 h2Var2 = gt0Var2.y1;
                                                gt0Var2.a1(intValue, gt0Var2.m1, h2Var2);
                                                break;
                                            case 1:
                                                gt0 gt0Var3 = gq0Var2.d;
                                                org.telegram.ui.ActionBar.h2 h2Var3 = gt0Var3.y1;
                                                gt0Var3.c1(intValue, gt0Var3.m1, h2Var3);
                                                break;
                                            case 2:
                                                gq0Var2.d.s1(intValue);
                                                break;
                                            default:
                                                gt0 gt0Var4 = gq0Var2.d;
                                                org.telegram.ui.ActionBar.h2 h2Var4 = gt0Var4.y1;
                                                gt0Var4.b1(intValue, gt0Var4.m1, h2Var4);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i15 = 3;
                                I.c(R.drawable.msg_delete, org.telegram.messenger.gd.M0(2131744561, null), new Runnable() { // from class: org.telegram.ui.Components.fq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i15) {
                                            case 0:
                                                gt0 gt0Var2 = gq0Var2.d;
                                                org.telegram.ui.ActionBar.h2 h2Var2 = gt0Var2.y1;
                                                gt0Var2.a1(intValue, gt0Var2.m1, h2Var2);
                                                break;
                                            case 1:
                                                gt0 gt0Var3 = gq0Var2.d;
                                                org.telegram.ui.ActionBar.h2 h2Var3 = gt0Var3.y1;
                                                gt0Var3.c1(intValue, gt0Var3.m1, h2Var3);
                                                break;
                                            case 2:
                                                gq0Var2.d.s1(intValue);
                                                break;
                                            default:
                                                gt0 gt0Var4 = gq0Var2.d;
                                                org.telegram.ui.ActionBar.h2 h2Var4 = gt0Var4.y1;
                                                gt0Var4.b1(intValue, gt0Var4.m1, h2Var4);
                                                break;
                                        }
                                    }
                                }, true);
                                I.a0();
                            }
                            break;
                        } else {
                            break;
                        }
                        break;
                }
                return Boolean.FALSE;
            }
        });
        addView(i7, c8.ma.e(-1, 42, 48));
        c(!d6Var.h.isEmpty(), false, true);
    }

    public final void a() {
        org.telegram.ui.Components.f71 f71Var = this.b;
        int currentTabId = f71Var != null ? f71Var.getCurrentTabId() : 0;
        fi.d6 d6Var = this.c;
        boolean a10 = d6Var.a();
        mx0 mx0Var = this.d;
        mx0Var.a = a10;
        this.a.j(true);
        c(!d6Var.h.isEmpty(), true, false);
        int i7 = this.e;
        if (i7 > 0) {
            if (mx0Var.i(i7) != -1) {
                org.telegram.messenger.g0.h3(new lx0(this, this.e, 1), 500L);
                this.e = 0;
                return;
            }
            return;
        }
        if (f71Var == null || currentTabId <= 0 || d6Var.b(currentTabId) != null) {
            return;
        }
        f71Var.e(0, 0);
    }

    public abstract void b();

    public final void c(boolean z10, boolean z11, boolean z12) {
        if (this.r != z10 || z12) {
            this.r = z10;
            setEnabled(z10);
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.h = null;
            }
            if (!z11) {
                this.n = z10 ? 1.0f : 0.0f;
                b();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n, z10 ? 1.0f : 0.0f);
            this.h = ofFloat;
            ofFloat.setDuration(480L);
            this.h.setInterpolator(org.telegram.ui.Components.lr.h);
            this.h.addUpdateListener(new a3(this, 28));
            this.h.start();
        }
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.l3 && ((Long) objArr[0]).longValue() == this.c.b) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.r && super.dispatchTouchEvent(motionEvent);
    }

    public int getCurrentAlbumId() {
        return this.d.f(this.b.getCurrentPosition());
    }

    public float getVisibilityFactor() {
        return this.n;
    }

    public float getVisualHeight() {
        return getMeasuredHeight() * this.n;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        fi.d6 d6Var = this.c;
        org.telegram.messenger.ks.f(d6Var.a).c(this, org.telegram.messenger.ks.l3);
        if (this.r == d6Var.h.isEmpty() || this.d.a != d6Var.a()) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ks.f(this.c.a).n(this, org.telegram.messenger.ks.l3);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        int measuredWidth = getMeasuredWidth();
        int visualHeight = (int) getVisualHeight();
        Rect rect = this.s;
        rect.set(0, 0, measuredWidth, visualHeight);
        setClipBounds(rect);
    }

    public void setInitialTabId(int i7) {
        if (this.d.i(i7) != -1) {
            org.telegram.messenger.g0.h3(new lx0(this, i7, 0), 500L);
        } else {
            this.e = i7;
        }
    }

    public void setReorderingAlbums(boolean z10) {
        if (this.f == z10) {
            return;
        }
        this.f = z10;
        org.telegram.ui.Components.f71 f71Var = this.b;
        f71Var.setReordering(z10);
        boolean z11 = this.f;
        org.telegram.ui.Components.hq0 hq0Var = (org.telegram.ui.Components.hq0) this;
        org.telegram.ui.Components.gt0 gt0Var = hq0Var.x;
        TextView textView = gt0Var.t0;
        textView.setVisibility(0);
        textView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.4f).scaleY(z11 ? 1.0f : 0.4f).withEndAction(new org.telegram.ui.Components.pp0(2, hq0Var, z11)).start();
        gt0Var.I1(true);
        gt0Var.W0();
        if (z10) {
            org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
            if (T instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) T;
                profileActivity.X4(false);
                org.telegram.messenger.g0.g3(new m90(profileActivity, 28));
            }
        }
        if (z10) {
            return;
        }
        org.telegram.messenger.g0.r(this.w);
        fi.d6 d6Var = this.c;
        d6Var.e();
        d6Var.f(false);
        int currentPosition = f71Var.getCurrentPosition();
        mx0 mx0Var = this.d;
        int f10 = mx0Var.f(currentPosition);
        this.a.j(true);
        int i7 = mx0Var.i(f10);
        f71Var.f(0.0f, i7, i7);
    }
}
