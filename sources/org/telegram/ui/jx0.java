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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class jx0 extends FrameLayout implements org.telegram.messenger.is {
    public final bi.f3 a;
    public final org.telegram.ui.Components.v61 b;
    public final fi.g6 c;
    public final ix0 d;
    public int e;
    public boolean f;
    public ValueAnimator h;
    public float n;
    public boolean r;
    public final Rect s;
    public final pu0 w;

    public jx0(Context context, fi.g6 g6Var, final org.telegram.ui.Components.yp0 yp0Var) {
        super(context);
        this.s = new Rect();
        this.c = g6Var;
        Objects.requireNonNull(g6Var);
        this.w = new pu0(g6Var, 8);
        final org.telegram.ui.Components.zp0 zp0Var = (org.telegram.ui.Components.zp0) this;
        bi.f3 f3Var = new bi.f3(zp0Var, context, yp0Var, 2);
        this.a = f3Var;
        f3Var.setAllowDisallowInterceptTouch(true);
        ix0 ix0Var = new ix0(zp0Var);
        this.d = ix0Var;
        ix0Var.a = g6Var.a();
        f3Var.setAdapter(ix0Var);
        f3Var.setTranslationY(org.telegram.messenger.g0.L(42.0f));
        org.telegram.ui.Components.v61 i7 = f3Var.i(10, true);
        this.b = i7;
        i7.g(org.telegram.ui.ActionBar.j6.xi, org.telegram.ui.ActionBar.j6.G6, org.telegram.ui.ActionBar.j6.vi, org.telegram.ui.ActionBar.j6.yi, org.telegram.ui.ActionBar.j6.s8);
        i7.r = 12;
        final int i10 = 0;
        i7.setPreTabClick(new org.telegram.messenger.t10() { // from class: org.telegram.ui.gx0
            @Override // org.telegram.messenger.t10
            public final Object d(Number number, Object obj) {
                fi.s6 storiesController;
                int i11 = i10;
                final org.telegram.ui.Components.yp0 yp0Var2 = yp0Var;
                org.telegram.ui.Components.zp0 zp0Var2 = zp0Var;
                Integer num = (Integer) number;
                switch (i11) {
                    case 0:
                        if (!zp0Var2.f) {
                            if (num.intValue() != -1) {
                                break;
                            } else {
                                org.telegram.ui.Components.t4.P(yp0Var2.a, yp0Var2.b, yp0Var2.c, new org.telegram.ui.Components.gx(yp0Var2, 20));
                                break;
                            }
                        } else {
                            break;
                        }
                    default:
                        View view = (View) obj;
                        if (num.intValue() != -1 && num.intValue() != 0 && !zp0Var2.f) {
                            final int intValue = num.intValue();
                            org.telegram.ui.Components.ys0 ys0Var = yp0Var2.d;
                            org.telegram.ui.ActionBar.e2 e2Var = ys0Var.y1;
                            storiesController = ys0Var.getStoriesController();
                            if (storiesController.i(ys0Var.m1)) {
                                org.telegram.ui.Components.m60 H = org.telegram.ui.Components.m60.H(e2Var, view);
                                H.W(new bi.h3(yp0Var2));
                                final int i12 = 0;
                                H.c(R.drawable.menu_add_stories, org.telegram.messenger.hd.M0(2131744798, null), new Runnable() { // from class: org.telegram.ui.Components.xp0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                ys0 ys0Var2 = yp0Var2.d;
                                                ys0Var2.a1(ys0Var2.y1, ys0Var2.m1, intValue);
                                                break;
                                            case 1:
                                                ys0 ys0Var3 = yp0Var2.d;
                                                ys0Var3.c1(ys0Var3.y1, ys0Var3.m1, intValue);
                                                break;
                                            case 2:
                                                yp0Var2.d.s1(intValue);
                                                break;
                                            default:
                                                ys0 ys0Var4 = yp0Var2.d;
                                                ys0Var4.b1(ys0Var4.y1, ys0Var4.m1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                ys0Var.B(new org.telegram.ui.Components.cf(H), e2Var, ys0Var.m1, intValue);
                                final int i13 = 1;
                                H.c(R.drawable.msg_edit, org.telegram.messenger.hd.M0(2131744793, null), new Runnable() { // from class: org.telegram.ui.Components.xp0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                ys0 ys0Var2 = yp0Var2.d;
                                                ys0Var2.a1(ys0Var2.y1, ys0Var2.m1, intValue);
                                                break;
                                            case 1:
                                                ys0 ys0Var3 = yp0Var2.d;
                                                ys0Var3.c1(ys0Var3.y1, ys0Var3.m1, intValue);
                                                break;
                                            case 2:
                                                yp0Var2.d.s1(intValue);
                                                break;
                                            default:
                                                ys0 ys0Var4 = yp0Var2.d;
                                                ys0Var4.b1(ys0Var4.y1, ys0Var4.m1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i14 = 2;
                                H.c(R.drawable.tabs_reorder, org.telegram.messenger.hd.M0(2131744790, null), new Runnable() { // from class: org.telegram.ui.Components.xp0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                ys0 ys0Var2 = yp0Var2.d;
                                                ys0Var2.a1(ys0Var2.y1, ys0Var2.m1, intValue);
                                                break;
                                            case 1:
                                                ys0 ys0Var3 = yp0Var2.d;
                                                ys0Var3.c1(ys0Var3.y1, ys0Var3.m1, intValue);
                                                break;
                                            case 2:
                                                yp0Var2.d.s1(intValue);
                                                break;
                                            default:
                                                ys0 ys0Var4 = yp0Var2.d;
                                                ys0Var4.b1(ys0Var4.y1, ys0Var4.m1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i15 = 3;
                                H.c(R.drawable.msg_delete, org.telegram.messenger.hd.M0(2131744796, null), new Runnable() { // from class: org.telegram.ui.Components.xp0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i15) {
                                            case 0:
                                                ys0 ys0Var2 = yp0Var2.d;
                                                ys0Var2.a1(ys0Var2.y1, ys0Var2.m1, intValue);
                                                break;
                                            case 1:
                                                ys0 ys0Var3 = yp0Var2.d;
                                                ys0Var3.c1(ys0Var3.y1, ys0Var3.m1, intValue);
                                                break;
                                            case 2:
                                                yp0Var2.d.s1(intValue);
                                                break;
                                            default:
                                                ys0 ys0Var4 = yp0Var2.d;
                                                ys0Var4.b1(ys0Var4.y1, ys0Var4.m1, intValue);
                                                break;
                                        }
                                    }
                                }, true);
                                H.Z();
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
        i7.setOnTabLongClick(new org.telegram.messenger.t10() { // from class: org.telegram.ui.gx0
            @Override // org.telegram.messenger.t10
            public final Object d(Number number, Object obj) {
                fi.s6 storiesController;
                int i112 = i11;
                final org.telegram.ui.Components.yp0 yp0Var2 = yp0Var;
                org.telegram.ui.Components.zp0 zp0Var2 = zp0Var;
                Integer num = (Integer) number;
                switch (i112) {
                    case 0:
                        if (!zp0Var2.f) {
                            if (num.intValue() != -1) {
                                break;
                            } else {
                                org.telegram.ui.Components.t4.P(yp0Var2.a, yp0Var2.b, yp0Var2.c, new org.telegram.ui.Components.gx(yp0Var2, 20));
                                break;
                            }
                        } else {
                            break;
                        }
                    default:
                        View view = (View) obj;
                        if (num.intValue() != -1 && num.intValue() != 0 && !zp0Var2.f) {
                            final int intValue = num.intValue();
                            org.telegram.ui.Components.ys0 ys0Var = yp0Var2.d;
                            org.telegram.ui.ActionBar.e2 e2Var = ys0Var.y1;
                            storiesController = ys0Var.getStoriesController();
                            if (storiesController.i(ys0Var.m1)) {
                                org.telegram.ui.Components.m60 H = org.telegram.ui.Components.m60.H(e2Var, view);
                                H.W(new bi.h3(yp0Var2));
                                final int i12 = 0;
                                H.c(R.drawable.menu_add_stories, org.telegram.messenger.hd.M0(2131744798, null), new Runnable() { // from class: org.telegram.ui.Components.xp0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                ys0 ys0Var2 = yp0Var2.d;
                                                ys0Var2.a1(ys0Var2.y1, ys0Var2.m1, intValue);
                                                break;
                                            case 1:
                                                ys0 ys0Var3 = yp0Var2.d;
                                                ys0Var3.c1(ys0Var3.y1, ys0Var3.m1, intValue);
                                                break;
                                            case 2:
                                                yp0Var2.d.s1(intValue);
                                                break;
                                            default:
                                                ys0 ys0Var4 = yp0Var2.d;
                                                ys0Var4.b1(ys0Var4.y1, ys0Var4.m1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                ys0Var.B(new org.telegram.ui.Components.cf(H), e2Var, ys0Var.m1, intValue);
                                final int i13 = 1;
                                H.c(R.drawable.msg_edit, org.telegram.messenger.hd.M0(2131744793, null), new Runnable() { // from class: org.telegram.ui.Components.xp0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                ys0 ys0Var2 = yp0Var2.d;
                                                ys0Var2.a1(ys0Var2.y1, ys0Var2.m1, intValue);
                                                break;
                                            case 1:
                                                ys0 ys0Var3 = yp0Var2.d;
                                                ys0Var3.c1(ys0Var3.y1, ys0Var3.m1, intValue);
                                                break;
                                            case 2:
                                                yp0Var2.d.s1(intValue);
                                                break;
                                            default:
                                                ys0 ys0Var4 = yp0Var2.d;
                                                ys0Var4.b1(ys0Var4.y1, ys0Var4.m1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i14 = 2;
                                H.c(R.drawable.tabs_reorder, org.telegram.messenger.hd.M0(2131744790, null), new Runnable() { // from class: org.telegram.ui.Components.xp0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                ys0 ys0Var2 = yp0Var2.d;
                                                ys0Var2.a1(ys0Var2.y1, ys0Var2.m1, intValue);
                                                break;
                                            case 1:
                                                ys0 ys0Var3 = yp0Var2.d;
                                                ys0Var3.c1(ys0Var3.y1, ys0Var3.m1, intValue);
                                                break;
                                            case 2:
                                                yp0Var2.d.s1(intValue);
                                                break;
                                            default:
                                                ys0 ys0Var4 = yp0Var2.d;
                                                ys0Var4.b1(ys0Var4.y1, ys0Var4.m1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i15 = 3;
                                H.c(R.drawable.msg_delete, org.telegram.messenger.hd.M0(2131744796, null), new Runnable() { // from class: org.telegram.ui.Components.xp0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i15) {
                                            case 0:
                                                ys0 ys0Var2 = yp0Var2.d;
                                                ys0Var2.a1(ys0Var2.y1, ys0Var2.m1, intValue);
                                                break;
                                            case 1:
                                                ys0 ys0Var3 = yp0Var2.d;
                                                ys0Var3.c1(ys0Var3.y1, ys0Var3.m1, intValue);
                                                break;
                                            case 2:
                                                yp0Var2.d.s1(intValue);
                                                break;
                                            default:
                                                ys0 ys0Var4 = yp0Var2.d;
                                                ys0Var4.b1(ys0Var4.y1, ys0Var4.m1, intValue);
                                                break;
                                        }
                                    }
                                }, true);
                                H.Z();
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
        addView(i7, c8.ja.e(-1, 42, 48));
        c(!g6Var.h.isEmpty(), false, true);
    }

    public final void a() {
        org.telegram.ui.Components.v61 v61Var = this.b;
        int currentTabId = v61Var != null ? v61Var.getCurrentTabId() : 0;
        fi.g6 g6Var = this.c;
        boolean a10 = g6Var.a();
        ix0 ix0Var = this.d;
        ix0Var.a = a10;
        this.a.k(true);
        c(!g6Var.h.isEmpty(), true, false);
        int i7 = this.e;
        if (i7 > 0) {
            if (ix0Var.i(i7) != -1) {
                org.telegram.messenger.g0.i3(new hx0(this, this.e, 1), 500L);
                this.e = 0;
                return;
            }
            return;
        }
        if (v61Var == null || currentTabId <= 0 || g6Var.b(currentTabId) != null) {
            return;
        }
        v61Var.d(0, 0);
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
            this.h.setInterpolator(org.telegram.ui.Components.er.h);
            this.h.addUpdateListener(new a3(this, 28));
            this.h.start();
        }
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.j3 && ((Long) objArr[0]).longValue() == this.c.b) {
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
        fi.g6 g6Var = this.c;
        org.telegram.messenger.ns.f(g6Var.a).c(this, org.telegram.messenger.ns.j3);
        if (this.r == g6Var.h.isEmpty() || this.d.a != g6Var.a()) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ns.f(this.c.a).n(this, org.telegram.messenger.ns.j3);
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
            org.telegram.messenger.g0.i3(new hx0(this, i7, 0), 500L);
        } else {
            this.e = i7;
        }
    }

    public void setReorderingAlbums(boolean z10) {
        if (this.f == z10) {
            return;
        }
        this.f = z10;
        org.telegram.ui.Components.v61 v61Var = this.b;
        v61Var.setReordering(z10);
        boolean z11 = this.f;
        org.telegram.ui.Components.zp0 zp0Var = (org.telegram.ui.Components.zp0) this;
        org.telegram.ui.Components.ys0 ys0Var = zp0Var.x;
        TextView textView = ys0Var.t0;
        textView.setVisibility(0);
        textView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.4f).scaleY(z11 ? 1.0f : 0.4f).withEndAction(new org.telegram.ui.Components.fp0(2, zp0Var, z11)).start();
        ys0Var.I1(true);
        ys0Var.W0();
        if (z10) {
            org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
            if (T instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) T;
                profileActivity.W4(false);
                org.telegram.messenger.g0.h3(new k90(profileActivity, 28));
            }
        }
        if (z10) {
            return;
        }
        org.telegram.messenger.g0.r(this.w);
        fi.g6 g6Var = this.c;
        g6Var.e();
        g6Var.f(false);
        int currentPosition = v61Var.getCurrentPosition();
        ix0 ix0Var = this.d;
        int f10 = ix0Var.f(currentPosition);
        this.a.k(true);
        int i7 = ix0Var.i(f10);
        v61Var.e(0.0f, i7, i7);
    }
}
