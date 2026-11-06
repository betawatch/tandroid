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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public abstract class kx0 extends FrameLayout implements org.telegram.messenger.ls {
    public final ei.a a;
    public final org.telegram.ui.Components.u61 b;
    public final di.m6 c;
    public final jx0 d;
    public int e;
    public boolean f;
    public ValueAnimator h;
    public float n;
    public boolean r;
    public final Rect s;
    public final ru0 w;

    public kx0(Context context, di.m6 m6Var, final org.telegram.ui.Components.xp0 xp0Var) {
        super(context);
        this.s = new Rect();
        this.c = m6Var;
        Objects.requireNonNull(m6Var);
        this.w = new ru0(m6Var, 8);
        final org.telegram.ui.Components.yp0 yp0Var = (org.telegram.ui.Components.yp0) this;
        ei.a aVar = new ei.a(yp0Var, context, xp0Var, 1);
        this.a = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        jx0 jx0Var = new jx0(yp0Var);
        this.d = jx0Var;
        jx0Var.a = m6Var.a();
        aVar.setAdapter(jx0Var);
        aVar.setTranslationY(org.telegram.messenger.g0.L(42.0f));
        org.telegram.ui.Components.u61 n10 = aVar.n(10, true);
        this.b = n10;
        n10.g(org.telegram.ui.ActionBar.k6.ui, org.telegram.ui.ActionBar.k6.G6, org.telegram.ui.ActionBar.k6.si, org.telegram.ui.ActionBar.k6.vi, org.telegram.ui.ActionBar.k6.s8);
        n10.r = 12;
        final int i7 = 0;
        n10.setPreTabClick(new org.telegram.messenger.w10() { // from class: org.telegram.ui.hx0
            @Override // org.telegram.messenger.w10
            public final Object d(Number number, Object obj) {
                di.y6 storiesController;
                int i10 = i7;
                final org.telegram.ui.Components.xp0 xp0Var2 = xp0Var;
                org.telegram.ui.Components.yp0 yp0Var2 = yp0Var;
                Integer num = (Integer) number;
                switch (i10) {
                    case 0:
                        if (!yp0Var2.f) {
                            if (num.intValue() != -1) {
                                break;
                            } else {
                                org.telegram.ui.Components.v4.P(xp0Var2.a, xp0Var2.b, xp0Var2.c, new org.telegram.ui.Components.ax(xp0Var2, 20));
                                break;
                            }
                        } else {
                            break;
                        }
                    default:
                        View view = (View) obj;
                        if (num.intValue() != -1 && num.intValue() != 0 && !yp0Var2.f) {
                            final int intValue = num.intValue();
                            org.telegram.ui.Components.xs0 xs0Var = xp0Var2.d;
                            org.telegram.ui.ActionBar.f2 f2Var = xs0Var.x1;
                            storiesController = xs0Var.getStoriesController();
                            if (storiesController.i(xs0Var.l1)) {
                                org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(f2Var, view);
                                H.W(new org.telegram.ui.Components.wp0(xp0Var2));
                                final int i11 = 0;
                                H.c(R.drawable.menu_add_stories, org.telegram.messenger.hd.M0(2131744799, null), new Runnable() { // from class: org.telegram.ui.Components.vp0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i11) {
                                            case 0:
                                                xs0 xs0Var2 = xp0Var2.d;
                                                xs0Var2.Y0(xs0Var2.x1, xs0Var2.l1, intValue);
                                                break;
                                            case 1:
                                                xs0 xs0Var3 = xp0Var2.d;
                                                xs0Var3.a1(xs0Var3.x1, xs0Var3.l1, intValue);
                                                break;
                                            case 2:
                                                xp0Var2.d.q1(intValue);
                                                break;
                                            default:
                                                xs0 xs0Var4 = xp0Var2.d;
                                                xs0Var4.Z0(xs0Var4.x1, xs0Var4.l1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                xs0Var.B(new org.telegram.ui.Components.n(H), f2Var, xs0Var.l1, intValue);
                                final int i12 = 1;
                                H.c(R.drawable.msg_edit, org.telegram.messenger.hd.M0(2131744794, null), new Runnable() { // from class: org.telegram.ui.Components.vp0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                xs0 xs0Var2 = xp0Var2.d;
                                                xs0Var2.Y0(xs0Var2.x1, xs0Var2.l1, intValue);
                                                break;
                                            case 1:
                                                xs0 xs0Var3 = xp0Var2.d;
                                                xs0Var3.a1(xs0Var3.x1, xs0Var3.l1, intValue);
                                                break;
                                            case 2:
                                                xp0Var2.d.q1(intValue);
                                                break;
                                            default:
                                                xs0 xs0Var4 = xp0Var2.d;
                                                xs0Var4.Z0(xs0Var4.x1, xs0Var4.l1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i13 = 2;
                                H.c(R.drawable.tabs_reorder, org.telegram.messenger.hd.M0(2131744791, null), new Runnable() { // from class: org.telegram.ui.Components.vp0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                xs0 xs0Var2 = xp0Var2.d;
                                                xs0Var2.Y0(xs0Var2.x1, xs0Var2.l1, intValue);
                                                break;
                                            case 1:
                                                xs0 xs0Var3 = xp0Var2.d;
                                                xs0Var3.a1(xs0Var3.x1, xs0Var3.l1, intValue);
                                                break;
                                            case 2:
                                                xp0Var2.d.q1(intValue);
                                                break;
                                            default:
                                                xs0 xs0Var4 = xp0Var2.d;
                                                xs0Var4.Z0(xs0Var4.x1, xs0Var4.l1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i14 = 3;
                                H.c(R.drawable.msg_delete, org.telegram.messenger.hd.M0(2131744797, null), new Runnable() { // from class: org.telegram.ui.Components.vp0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                xs0 xs0Var2 = xp0Var2.d;
                                                xs0Var2.Y0(xs0Var2.x1, xs0Var2.l1, intValue);
                                                break;
                                            case 1:
                                                xs0 xs0Var3 = xp0Var2.d;
                                                xs0Var3.a1(xs0Var3.x1, xs0Var3.l1, intValue);
                                                break;
                                            case 2:
                                                xp0Var2.d.q1(intValue);
                                                break;
                                            default:
                                                xs0 xs0Var4 = xp0Var2.d;
                                                xs0Var4.Z0(xs0Var4.x1, xs0Var4.l1, intValue);
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
        final int i10 = 1;
        n10.setOnTabLongClick(new org.telegram.messenger.w10() { // from class: org.telegram.ui.hx0
            @Override // org.telegram.messenger.w10
            public final Object d(Number number, Object obj) {
                di.y6 storiesController;
                int i102 = i10;
                final org.telegram.ui.Components.xp0 xp0Var2 = xp0Var;
                org.telegram.ui.Components.yp0 yp0Var2 = yp0Var;
                Integer num = (Integer) number;
                switch (i102) {
                    case 0:
                        if (!yp0Var2.f) {
                            if (num.intValue() != -1) {
                                break;
                            } else {
                                org.telegram.ui.Components.v4.P(xp0Var2.a, xp0Var2.b, xp0Var2.c, new org.telegram.ui.Components.ax(xp0Var2, 20));
                                break;
                            }
                        } else {
                            break;
                        }
                    default:
                        View view = (View) obj;
                        if (num.intValue() != -1 && num.intValue() != 0 && !yp0Var2.f) {
                            final int intValue = num.intValue();
                            org.telegram.ui.Components.xs0 xs0Var = xp0Var2.d;
                            org.telegram.ui.ActionBar.f2 f2Var = xs0Var.x1;
                            storiesController = xs0Var.getStoriesController();
                            if (storiesController.i(xs0Var.l1)) {
                                org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(f2Var, view);
                                H.W(new org.telegram.ui.Components.wp0(xp0Var2));
                                final int i11 = 0;
                                H.c(R.drawable.menu_add_stories, org.telegram.messenger.hd.M0(2131744799, null), new Runnable() { // from class: org.telegram.ui.Components.vp0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i11) {
                                            case 0:
                                                xs0 xs0Var2 = xp0Var2.d;
                                                xs0Var2.Y0(xs0Var2.x1, xs0Var2.l1, intValue);
                                                break;
                                            case 1:
                                                xs0 xs0Var3 = xp0Var2.d;
                                                xs0Var3.a1(xs0Var3.x1, xs0Var3.l1, intValue);
                                                break;
                                            case 2:
                                                xp0Var2.d.q1(intValue);
                                                break;
                                            default:
                                                xs0 xs0Var4 = xp0Var2.d;
                                                xs0Var4.Z0(xs0Var4.x1, xs0Var4.l1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                xs0Var.B(new org.telegram.ui.Components.n(H), f2Var, xs0Var.l1, intValue);
                                final int i12 = 1;
                                H.c(R.drawable.msg_edit, org.telegram.messenger.hd.M0(2131744794, null), new Runnable() { // from class: org.telegram.ui.Components.vp0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                xs0 xs0Var2 = xp0Var2.d;
                                                xs0Var2.Y0(xs0Var2.x1, xs0Var2.l1, intValue);
                                                break;
                                            case 1:
                                                xs0 xs0Var3 = xp0Var2.d;
                                                xs0Var3.a1(xs0Var3.x1, xs0Var3.l1, intValue);
                                                break;
                                            case 2:
                                                xp0Var2.d.q1(intValue);
                                                break;
                                            default:
                                                xs0 xs0Var4 = xp0Var2.d;
                                                xs0Var4.Z0(xs0Var4.x1, xs0Var4.l1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i13 = 2;
                                H.c(R.drawable.tabs_reorder, org.telegram.messenger.hd.M0(2131744791, null), new Runnable() { // from class: org.telegram.ui.Components.vp0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                xs0 xs0Var2 = xp0Var2.d;
                                                xs0Var2.Y0(xs0Var2.x1, xs0Var2.l1, intValue);
                                                break;
                                            case 1:
                                                xs0 xs0Var3 = xp0Var2.d;
                                                xs0Var3.a1(xs0Var3.x1, xs0Var3.l1, intValue);
                                                break;
                                            case 2:
                                                xp0Var2.d.q1(intValue);
                                                break;
                                            default:
                                                xs0 xs0Var4 = xp0Var2.d;
                                                xs0Var4.Z0(xs0Var4.x1, xs0Var4.l1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i14 = 3;
                                H.c(R.drawable.msg_delete, org.telegram.messenger.hd.M0(2131744797, null), new Runnable() { // from class: org.telegram.ui.Components.vp0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                xs0 xs0Var2 = xp0Var2.d;
                                                xs0Var2.Y0(xs0Var2.x1, xs0Var2.l1, intValue);
                                                break;
                                            case 1:
                                                xs0 xs0Var3 = xp0Var2.d;
                                                xs0Var3.a1(xs0Var3.x1, xs0Var3.l1, intValue);
                                                break;
                                            case 2:
                                                xp0Var2.d.q1(intValue);
                                                break;
                                            default:
                                                xs0 xs0Var4 = xp0Var2.d;
                                                xs0Var4.Z0(xs0Var4.x1, xs0Var4.l1, intValue);
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
        addView(n10, c8.ha.e(-1, 42, 48));
        c(!m6Var.h.isEmpty(), false, true);
    }

    public final void a() {
        org.telegram.ui.Components.u61 u61Var = this.b;
        int currentTabId = u61Var != null ? u61Var.getCurrentTabId() : 0;
        di.m6 m6Var = this.c;
        boolean a10 = m6Var.a();
        jx0 jx0Var = this.d;
        jx0Var.a = a10;
        this.a.o(true);
        c(!m6Var.h.isEmpty(), true, false);
        int i7 = this.e;
        if (i7 > 0) {
            if (jx0Var.i(i7) != -1) {
                org.telegram.messenger.g0.i3(new ix0(this, this.e, 1), 500L);
                this.e = 0;
                return;
            }
            return;
        }
        if (u61Var == null || currentTabId <= 0 || m6Var.b(currentTabId) != null) {
            return;
        }
        u61Var.d(0, 0);
    }

    public abstract void b();

    public final void c(boolean z9, boolean z10, boolean z11) {
        if (this.r != z9 || z11) {
            this.r = z9;
            setEnabled(z9);
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.h = null;
            }
            if (!z10) {
                this.n = z9 ? 1.0f : 0.0f;
                b();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n, z9 ? 1.0f : 0.0f);
            this.h = ofFloat;
            ofFloat.setDuration(480L);
            this.h.setInterpolator(org.telegram.ui.Components.xq.h);
            this.h.addUpdateListener(new a3(this, 28));
            this.h.start();
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.j3 && ((Long) objArr[0]).longValue() == this.c.b) {
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
        di.m6 m6Var = this.c;
        org.telegram.messenger.qs.f(m6Var.a).c(this, org.telegram.messenger.qs.j3);
        if (this.r == m6Var.h.isEmpty() || this.d.a != m6Var.a()) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.f(this.c.a).n(this, org.telegram.messenger.qs.j3);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        int measuredWidth = getMeasuredWidth();
        int visualHeight = (int) getVisualHeight();
        Rect rect = this.s;
        rect.set(0, 0, measuredWidth, visualHeight);
        setClipBounds(rect);
    }

    public void setInitialTabId(int i7) {
        if (this.d.i(i7) != -1) {
            org.telegram.messenger.g0.i3(new ix0(this, i7, 0), 500L);
        } else {
            this.e = i7;
        }
    }

    public void setReorderingAlbums(boolean z9) {
        if (this.f == z9) {
            return;
        }
        this.f = z9;
        org.telegram.ui.Components.u61 u61Var = this.b;
        u61Var.setReordering(z9);
        boolean z10 = this.f;
        org.telegram.ui.Components.yp0 yp0Var = (org.telegram.ui.Components.yp0) this;
        org.telegram.ui.Components.xs0 xs0Var = yp0Var.x;
        TextView textView = xs0Var.s0;
        textView.setVisibility(0);
        textView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.4f).scaleY(z10 ? 1.0f : 0.4f).withEndAction(new org.telegram.ui.Components.tp0(1, yp0Var, z10)).start();
        xs0Var.G1(true);
        if (z9) {
            org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
            if (T instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) T;
                profileActivity.U4(false);
                org.telegram.messenger.g0.h3(new j90(profileActivity, 28));
            }
        }
        if (z9) {
            return;
        }
        org.telegram.messenger.g0.r(this.w);
        di.m6 m6Var = this.c;
        m6Var.e();
        m6Var.f(false);
        int currentPosition = u61Var.getCurrentPosition();
        jx0 jx0Var = this.d;
        int f10 = jx0Var.f(currentPosition);
        this.a.o(true);
        int i7 = jx0Var.i(f10);
        u61Var.e(0.0f, i7, i7);
    }
}
