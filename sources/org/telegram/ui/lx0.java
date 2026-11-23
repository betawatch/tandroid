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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public abstract class lx0 extends FrameLayout implements org.telegram.messenger.fs {
    public final bi.s5 a;
    public final org.telegram.ui.Components.j71 b;
    public final fi.d6 c;
    public final kx0 d;
    public int e;
    public boolean f;
    public ValueAnimator h;
    public float n;
    public boolean r;
    public final Rect s;
    public final qu0 w;

    public lx0(Context context, fi.d6 d6Var, final org.telegram.ui.Components.hq0 hq0Var) {
        super(context);
        this.s = new Rect();
        this.c = d6Var;
        Objects.requireNonNull(d6Var);
        this.w = new qu0(d6Var, 8);
        final org.telegram.ui.Components.iq0 iq0Var = (org.telegram.ui.Components.iq0) this;
        bi.s5 s5Var = new bi.s5(iq0Var, context, hq0Var, 2);
        this.a = s5Var;
        s5Var.setAllowDisallowInterceptTouch(true);
        kx0 kx0Var = new kx0(iq0Var);
        this.d = kx0Var;
        kx0Var.a = d6Var.a();
        s5Var.setAdapter(kx0Var);
        s5Var.setTranslationY(org.telegram.messenger.g0.L(42.0f));
        org.telegram.ui.Components.j71 k10 = s5Var.k(10, true);
        this.b = k10;
        k10.h(org.telegram.ui.ActionBar.n6.xi, org.telegram.ui.ActionBar.n6.G6, org.telegram.ui.ActionBar.n6.vi, org.telegram.ui.ActionBar.n6.yi, org.telegram.ui.ActionBar.n6.s8);
        k10.r = 12;
        final int i7 = 0;
        k10.setPreTabClick(new org.telegram.messenger.q10() { // from class: org.telegram.ui.ix0
            @Override // org.telegram.messenger.q10
            public final Object d(Number number, Object obj) {
                fi.p6 storiesController;
                int i10 = i7;
                final org.telegram.ui.Components.hq0 hq0Var2 = hq0Var;
                org.telegram.ui.Components.iq0 iq0Var2 = iq0Var;
                Integer num = (Integer) number;
                switch (i10) {
                    case 0:
                        if (!iq0Var2.f) {
                            if (num.intValue() != -1) {
                                break;
                            } else {
                                org.telegram.ui.Components.b5.P(hq0Var2.a, hq0Var2.b, hq0Var2.c, new org.telegram.ui.Components.hy(hq0Var2, 19));
                                break;
                            }
                        } else {
                            break;
                        }
                    default:
                        View view = (View) obj;
                        if (num.intValue() != -1 && num.intValue() != 0 && !iq0Var2.f) {
                            final int intValue = num.intValue();
                            org.telegram.ui.Components.it0 it0Var = hq0Var2.d;
                            org.telegram.ui.ActionBar.g2 g2Var = it0Var.y1;
                            storiesController = it0Var.getStoriesController();
                            if (storiesController.i(it0Var.m1)) {
                                org.telegram.ui.Components.x60 I = org.telegram.ui.Components.x60.I(g2Var, view);
                                I.X(new bi.u5(hq0Var2));
                                final int i11 = 0;
                                I.c(R.drawable.menu_add_stories, org.telegram.messenger.gd.N0(2131744557, null), new Runnable() { // from class: org.telegram.ui.Components.gq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i11) {
                                            case 0:
                                                it0 it0Var2 = hq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var2 = it0Var2.y1;
                                                it0Var2.a1(intValue, it0Var2.m1, g2Var2);
                                                break;
                                            case 1:
                                                it0 it0Var3 = hq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var3 = it0Var3.y1;
                                                it0Var3.c1(intValue, it0Var3.m1, g2Var3);
                                                break;
                                            case 2:
                                                hq0Var2.d.s1(intValue);
                                                break;
                                            default:
                                                it0 it0Var4 = hq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var4 = it0Var4.y1;
                                                it0Var4.b1(intValue, it0Var4.m1, g2Var4);
                                                break;
                                        }
                                    }
                                }, false);
                                it0Var.B(new org.telegram.ui.ActionBar.i5(I), g2Var, it0Var.m1, intValue);
                                final int i12 = 1;
                                I.c(R.drawable.msg_edit, org.telegram.messenger.gd.N0(2131744552, null), new Runnable() { // from class: org.telegram.ui.Components.gq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                it0 it0Var2 = hq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var2 = it0Var2.y1;
                                                it0Var2.a1(intValue, it0Var2.m1, g2Var2);
                                                break;
                                            case 1:
                                                it0 it0Var3 = hq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var3 = it0Var3.y1;
                                                it0Var3.c1(intValue, it0Var3.m1, g2Var3);
                                                break;
                                            case 2:
                                                hq0Var2.d.s1(intValue);
                                                break;
                                            default:
                                                it0 it0Var4 = hq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var4 = it0Var4.y1;
                                                it0Var4.b1(intValue, it0Var4.m1, g2Var4);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i13 = 2;
                                I.c(R.drawable.tabs_reorder, org.telegram.messenger.gd.N0(2131744549, null), new Runnable() { // from class: org.telegram.ui.Components.gq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                it0 it0Var2 = hq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var2 = it0Var2.y1;
                                                it0Var2.a1(intValue, it0Var2.m1, g2Var2);
                                                break;
                                            case 1:
                                                it0 it0Var3 = hq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var3 = it0Var3.y1;
                                                it0Var3.c1(intValue, it0Var3.m1, g2Var3);
                                                break;
                                            case 2:
                                                hq0Var2.d.s1(intValue);
                                                break;
                                            default:
                                                it0 it0Var4 = hq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var4 = it0Var4.y1;
                                                it0Var4.b1(intValue, it0Var4.m1, g2Var4);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i14 = 3;
                                I.c(R.drawable.msg_delete, org.telegram.messenger.gd.N0(2131744555, null), new Runnable() { // from class: org.telegram.ui.Components.gq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                it0 it0Var2 = hq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var2 = it0Var2.y1;
                                                it0Var2.a1(intValue, it0Var2.m1, g2Var2);
                                                break;
                                            case 1:
                                                it0 it0Var3 = hq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var3 = it0Var3.y1;
                                                it0Var3.c1(intValue, it0Var3.m1, g2Var3);
                                                break;
                                            case 2:
                                                hq0Var2.d.s1(intValue);
                                                break;
                                            default:
                                                it0 it0Var4 = hq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var4 = it0Var4.y1;
                                                it0Var4.b1(intValue, it0Var4.m1, g2Var4);
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
        final int i10 = 1;
        k10.setOnTabLongClick(new org.telegram.messenger.q10() { // from class: org.telegram.ui.ix0
            @Override // org.telegram.messenger.q10
            public final Object d(Number number, Object obj) {
                fi.p6 storiesController;
                int i102 = i10;
                final org.telegram.ui.Components.hq0 hq0Var2 = hq0Var;
                org.telegram.ui.Components.iq0 iq0Var2 = iq0Var;
                Integer num = (Integer) number;
                switch (i102) {
                    case 0:
                        if (!iq0Var2.f) {
                            if (num.intValue() != -1) {
                                break;
                            } else {
                                org.telegram.ui.Components.b5.P(hq0Var2.a, hq0Var2.b, hq0Var2.c, new org.telegram.ui.Components.hy(hq0Var2, 19));
                                break;
                            }
                        } else {
                            break;
                        }
                    default:
                        View view = (View) obj;
                        if (num.intValue() != -1 && num.intValue() != 0 && !iq0Var2.f) {
                            final int intValue = num.intValue();
                            org.telegram.ui.Components.it0 it0Var = hq0Var2.d;
                            org.telegram.ui.ActionBar.g2 g2Var = it0Var.y1;
                            storiesController = it0Var.getStoriesController();
                            if (storiesController.i(it0Var.m1)) {
                                org.telegram.ui.Components.x60 I = org.telegram.ui.Components.x60.I(g2Var, view);
                                I.X(new bi.u5(hq0Var2));
                                final int i11 = 0;
                                I.c(R.drawable.menu_add_stories, org.telegram.messenger.gd.N0(2131744557, null), new Runnable() { // from class: org.telegram.ui.Components.gq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i11) {
                                            case 0:
                                                it0 it0Var2 = hq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var2 = it0Var2.y1;
                                                it0Var2.a1(intValue, it0Var2.m1, g2Var2);
                                                break;
                                            case 1:
                                                it0 it0Var3 = hq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var3 = it0Var3.y1;
                                                it0Var3.c1(intValue, it0Var3.m1, g2Var3);
                                                break;
                                            case 2:
                                                hq0Var2.d.s1(intValue);
                                                break;
                                            default:
                                                it0 it0Var4 = hq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var4 = it0Var4.y1;
                                                it0Var4.b1(intValue, it0Var4.m1, g2Var4);
                                                break;
                                        }
                                    }
                                }, false);
                                it0Var.B(new org.telegram.ui.ActionBar.i5(I), g2Var, it0Var.m1, intValue);
                                final int i12 = 1;
                                I.c(R.drawable.msg_edit, org.telegram.messenger.gd.N0(2131744552, null), new Runnable() { // from class: org.telegram.ui.Components.gq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                it0 it0Var2 = hq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var2 = it0Var2.y1;
                                                it0Var2.a1(intValue, it0Var2.m1, g2Var2);
                                                break;
                                            case 1:
                                                it0 it0Var3 = hq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var3 = it0Var3.y1;
                                                it0Var3.c1(intValue, it0Var3.m1, g2Var3);
                                                break;
                                            case 2:
                                                hq0Var2.d.s1(intValue);
                                                break;
                                            default:
                                                it0 it0Var4 = hq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var4 = it0Var4.y1;
                                                it0Var4.b1(intValue, it0Var4.m1, g2Var4);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i13 = 2;
                                I.c(R.drawable.tabs_reorder, org.telegram.messenger.gd.N0(2131744549, null), new Runnable() { // from class: org.telegram.ui.Components.gq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                it0 it0Var2 = hq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var2 = it0Var2.y1;
                                                it0Var2.a1(intValue, it0Var2.m1, g2Var2);
                                                break;
                                            case 1:
                                                it0 it0Var3 = hq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var3 = it0Var3.y1;
                                                it0Var3.c1(intValue, it0Var3.m1, g2Var3);
                                                break;
                                            case 2:
                                                hq0Var2.d.s1(intValue);
                                                break;
                                            default:
                                                it0 it0Var4 = hq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var4 = it0Var4.y1;
                                                it0Var4.b1(intValue, it0Var4.m1, g2Var4);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i14 = 3;
                                I.c(R.drawable.msg_delete, org.telegram.messenger.gd.N0(2131744555, null), new Runnable() { // from class: org.telegram.ui.Components.gq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                it0 it0Var2 = hq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var2 = it0Var2.y1;
                                                it0Var2.a1(intValue, it0Var2.m1, g2Var2);
                                                break;
                                            case 1:
                                                it0 it0Var3 = hq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var3 = it0Var3.y1;
                                                it0Var3.c1(intValue, it0Var3.m1, g2Var3);
                                                break;
                                            case 2:
                                                hq0Var2.d.s1(intValue);
                                                break;
                                            default:
                                                it0 it0Var4 = hq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var4 = it0Var4.y1;
                                                it0Var4.b1(intValue, it0Var4.m1, g2Var4);
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
        addView(k10, c8.na.e(-1, 42, 48));
        c(!d6Var.h.isEmpty(), false, true);
    }

    public final void a() {
        org.telegram.ui.Components.j71 j71Var = this.b;
        int currentTabId = j71Var != null ? j71Var.getCurrentTabId() : 0;
        fi.d6 d6Var = this.c;
        boolean a10 = d6Var.a();
        kx0 kx0Var = this.d;
        kx0Var.a = a10;
        this.a.l(true);
        c(!d6Var.h.isEmpty(), true, false);
        int i7 = this.e;
        if (i7 > 0) {
            if (kx0Var.i(i7) != -1) {
                org.telegram.messenger.g0.h3(new jx0(this, this.e, 1), 500L);
                this.e = 0;
                return;
            }
            return;
        }
        if (j71Var == null || currentTabId <= 0 || d6Var.b(currentTabId) != null) {
            return;
        }
        j71Var.e(0, 0);
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
            this.h.setInterpolator(org.telegram.ui.Components.kr.h);
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
            org.telegram.messenger.g0.h3(new jx0(this, i7, 0), 500L);
        } else {
            this.e = i7;
        }
    }

    public void setReorderingAlbums(boolean z10) {
        if (this.f == z10) {
            return;
        }
        this.f = z10;
        org.telegram.ui.Components.j71 j71Var = this.b;
        j71Var.setReordering(z10);
        boolean z11 = this.f;
        org.telegram.ui.Components.iq0 iq0Var = (org.telegram.ui.Components.iq0) this;
        org.telegram.ui.Components.it0 it0Var = iq0Var.x;
        TextView textView = it0Var.t0;
        textView.setVisibility(0);
        textView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.4f).scaleY(z11 ? 1.0f : 0.4f).withEndAction(new org.telegram.ui.Components.qp0(2, iq0Var, z11)).start();
        it0Var.I1(true);
        it0Var.W0();
        if (z10) {
            org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
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
        int currentPosition = j71Var.getCurrentPosition();
        kx0 kx0Var = this.d;
        int f10 = kx0Var.f(currentPosition);
        this.a.l(true);
        int i7 = kx0Var.i(f10);
        j71Var.f(0.0f, i7, i7);
    }
}
