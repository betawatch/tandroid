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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class cx0 extends FrameLayout implements org.telegram.messenger.cs {
    public final ai.q3 a;
    public final org.telegram.ui.Components.m61 b;
    public final ei.n6 c;
    public final bx0 d;
    public int e;
    public boolean f;
    public ValueAnimator h;
    public float n;
    public boolean r;
    public final Rect s;
    public final pu0 w;

    public cx0(Context context, ei.n6 n6Var, final org.telegram.ui.Components.xp0 xp0Var) {
        super(context);
        this.s = new Rect();
        this.c = n6Var;
        Objects.requireNonNull(n6Var);
        this.w = new pu0(n6Var, 7);
        final org.telegram.ui.Components.yp0 yp0Var = (org.telegram.ui.Components.yp0) this;
        ai.q3 q3Var = new ai.q3(yp0Var, context, xp0Var, 2);
        this.a = q3Var;
        q3Var.setAllowDisallowInterceptTouch(true);
        bx0 bx0Var = new bx0(yp0Var);
        this.d = bx0Var;
        bx0Var.a = n6Var.a();
        q3Var.setAdapter(bx0Var);
        q3Var.setTranslationY(org.telegram.messenger.g0.L(42.0f));
        org.telegram.ui.Components.m61 j10 = q3Var.j(10, true);
        this.b = j10;
        j10.g(org.telegram.ui.ActionBar.k6.ui, org.telegram.ui.ActionBar.k6.G6, org.telegram.ui.ActionBar.k6.si, org.telegram.ui.ActionBar.k6.vi, org.telegram.ui.ActionBar.k6.s8);
        j10.r = 12;
        final int i3 = 0;
        j10.setPreTabClick(new org.telegram.messenger.o10() { // from class: org.telegram.ui.zw0
            @Override // org.telegram.messenger.o10
            public final Object d(Number number, Object obj) {
                ei.z6 storiesController;
                int i10 = i3;
                final org.telegram.ui.Components.xp0 xp0Var2 = xp0Var;
                org.telegram.ui.Components.yp0 yp0Var2 = yp0Var;
                Integer num = (Integer) number;
                switch (i10) {
                    case 0:
                        if (!yp0Var2.f) {
                            if (num.intValue() != -1) {
                                break;
                            } else {
                                org.telegram.ui.Components.t4.R(xp0Var2.a, xp0Var2.b, xp0Var2.c, new org.telegram.ui.Components.zw(xp0Var2, 20));
                                break;
                            }
                        } else {
                            break;
                        }
                    default:
                        View view = (View) obj;
                        if (num.intValue() != -1 && num.intValue() != 0 && !yp0Var2.f) {
                            final int intValue = num.intValue();
                            org.telegram.ui.Components.ws0 ws0Var = xp0Var2.d;
                            org.telegram.ui.ActionBar.d2 d2Var = ws0Var.y1;
                            storiesController = ws0Var.getStoriesController();
                            if (storiesController.i(ws0Var.m1)) {
                                org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(d2Var, view);
                                H.W(new ai.s3(xp0Var2));
                                final int i11 = 0;
                                H.c(R.drawable.menu_add_stories, org.telegram.messenger.bd.M0(2131744808, null), new Runnable() { // from class: org.telegram.ui.Components.wp0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i11) {
                                            case 0:
                                                ws0 ws0Var2 = xp0Var2.d;
                                                ws0Var2.Y0(ws0Var2.y1, ws0Var2.m1, intValue);
                                                break;
                                            case 1:
                                                ws0 ws0Var3 = xp0Var2.d;
                                                ws0Var3.a1(ws0Var3.y1, ws0Var3.m1, intValue);
                                                break;
                                            case 2:
                                                xp0Var2.d.q1(intValue);
                                                break;
                                            default:
                                                ws0 ws0Var4 = xp0Var2.d;
                                                ws0Var4.Z0(ws0Var4.y1, ws0Var4.m1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                ws0Var.B(new org.telegram.ui.Components.y00(H), d2Var, ws0Var.m1, intValue);
                                final int i12 = 1;
                                H.c(R.drawable.msg_edit, org.telegram.messenger.bd.M0(2131744803, null), new Runnable() { // from class: org.telegram.ui.Components.wp0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                ws0 ws0Var2 = xp0Var2.d;
                                                ws0Var2.Y0(ws0Var2.y1, ws0Var2.m1, intValue);
                                                break;
                                            case 1:
                                                ws0 ws0Var3 = xp0Var2.d;
                                                ws0Var3.a1(ws0Var3.y1, ws0Var3.m1, intValue);
                                                break;
                                            case 2:
                                                xp0Var2.d.q1(intValue);
                                                break;
                                            default:
                                                ws0 ws0Var4 = xp0Var2.d;
                                                ws0Var4.Z0(ws0Var4.y1, ws0Var4.m1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i13 = 2;
                                H.c(R.drawable.tabs_reorder, org.telegram.messenger.bd.M0(2131744800, null), new Runnable() { // from class: org.telegram.ui.Components.wp0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                ws0 ws0Var2 = xp0Var2.d;
                                                ws0Var2.Y0(ws0Var2.y1, ws0Var2.m1, intValue);
                                                break;
                                            case 1:
                                                ws0 ws0Var3 = xp0Var2.d;
                                                ws0Var3.a1(ws0Var3.y1, ws0Var3.m1, intValue);
                                                break;
                                            case 2:
                                                xp0Var2.d.q1(intValue);
                                                break;
                                            default:
                                                ws0 ws0Var4 = xp0Var2.d;
                                                ws0Var4.Z0(ws0Var4.y1, ws0Var4.m1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i14 = 3;
                                H.c(R.drawable.msg_delete, org.telegram.messenger.bd.M0(2131744806, null), new Runnable() { // from class: org.telegram.ui.Components.wp0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                ws0 ws0Var2 = xp0Var2.d;
                                                ws0Var2.Y0(ws0Var2.y1, ws0Var2.m1, intValue);
                                                break;
                                            case 1:
                                                ws0 ws0Var3 = xp0Var2.d;
                                                ws0Var3.a1(ws0Var3.y1, ws0Var3.m1, intValue);
                                                break;
                                            case 2:
                                                xp0Var2.d.q1(intValue);
                                                break;
                                            default:
                                                ws0 ws0Var4 = xp0Var2.d;
                                                ws0Var4.Z0(ws0Var4.y1, ws0Var4.m1, intValue);
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
        j10.setOnTabLongClick(new org.telegram.messenger.o10() { // from class: org.telegram.ui.zw0
            @Override // org.telegram.messenger.o10
            public final Object d(Number number, Object obj) {
                ei.z6 storiesController;
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
                                org.telegram.ui.Components.t4.R(xp0Var2.a, xp0Var2.b, xp0Var2.c, new org.telegram.ui.Components.zw(xp0Var2, 20));
                                break;
                            }
                        } else {
                            break;
                        }
                    default:
                        View view = (View) obj;
                        if (num.intValue() != -1 && num.intValue() != 0 && !yp0Var2.f) {
                            final int intValue = num.intValue();
                            org.telegram.ui.Components.ws0 ws0Var = xp0Var2.d;
                            org.telegram.ui.ActionBar.d2 d2Var = ws0Var.y1;
                            storiesController = ws0Var.getStoriesController();
                            if (storiesController.i(ws0Var.m1)) {
                                org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(d2Var, view);
                                H.W(new ai.s3(xp0Var2));
                                final int i11 = 0;
                                H.c(R.drawable.menu_add_stories, org.telegram.messenger.bd.M0(2131744808, null), new Runnable() { // from class: org.telegram.ui.Components.wp0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i11) {
                                            case 0:
                                                ws0 ws0Var2 = xp0Var2.d;
                                                ws0Var2.Y0(ws0Var2.y1, ws0Var2.m1, intValue);
                                                break;
                                            case 1:
                                                ws0 ws0Var3 = xp0Var2.d;
                                                ws0Var3.a1(ws0Var3.y1, ws0Var3.m1, intValue);
                                                break;
                                            case 2:
                                                xp0Var2.d.q1(intValue);
                                                break;
                                            default:
                                                ws0 ws0Var4 = xp0Var2.d;
                                                ws0Var4.Z0(ws0Var4.y1, ws0Var4.m1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                ws0Var.B(new org.telegram.ui.Components.y00(H), d2Var, ws0Var.m1, intValue);
                                final int i12 = 1;
                                H.c(R.drawable.msg_edit, org.telegram.messenger.bd.M0(2131744803, null), new Runnable() { // from class: org.telegram.ui.Components.wp0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                ws0 ws0Var2 = xp0Var2.d;
                                                ws0Var2.Y0(ws0Var2.y1, ws0Var2.m1, intValue);
                                                break;
                                            case 1:
                                                ws0 ws0Var3 = xp0Var2.d;
                                                ws0Var3.a1(ws0Var3.y1, ws0Var3.m1, intValue);
                                                break;
                                            case 2:
                                                xp0Var2.d.q1(intValue);
                                                break;
                                            default:
                                                ws0 ws0Var4 = xp0Var2.d;
                                                ws0Var4.Z0(ws0Var4.y1, ws0Var4.m1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i13 = 2;
                                H.c(R.drawable.tabs_reorder, org.telegram.messenger.bd.M0(2131744800, null), new Runnable() { // from class: org.telegram.ui.Components.wp0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                ws0 ws0Var2 = xp0Var2.d;
                                                ws0Var2.Y0(ws0Var2.y1, ws0Var2.m1, intValue);
                                                break;
                                            case 1:
                                                ws0 ws0Var3 = xp0Var2.d;
                                                ws0Var3.a1(ws0Var3.y1, ws0Var3.m1, intValue);
                                                break;
                                            case 2:
                                                xp0Var2.d.q1(intValue);
                                                break;
                                            default:
                                                ws0 ws0Var4 = xp0Var2.d;
                                                ws0Var4.Z0(ws0Var4.y1, ws0Var4.m1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i14 = 3;
                                H.c(R.drawable.msg_delete, org.telegram.messenger.bd.M0(2131744806, null), new Runnable() { // from class: org.telegram.ui.Components.wp0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                ws0 ws0Var2 = xp0Var2.d;
                                                ws0Var2.Y0(ws0Var2.y1, ws0Var2.m1, intValue);
                                                break;
                                            case 1:
                                                ws0 ws0Var3 = xp0Var2.d;
                                                ws0Var3.a1(ws0Var3.y1, ws0Var3.m1, intValue);
                                                break;
                                            case 2:
                                                xp0Var2.d.q1(intValue);
                                                break;
                                            default:
                                                ws0 ws0Var4 = xp0Var2.d;
                                                ws0Var4.Z0(ws0Var4.y1, ws0Var4.m1, intValue);
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
        addView(j10, b8.mf.e(-1, 42, 48));
        c(!n6Var.h.isEmpty(), false, true);
    }

    public final void a() {
        org.telegram.ui.Components.m61 m61Var = this.b;
        int currentTabId = m61Var != null ? m61Var.getCurrentTabId() : 0;
        ei.n6 n6Var = this.c;
        boolean a10 = n6Var.a();
        bx0 bx0Var = this.d;
        bx0Var.a = a10;
        this.a.k(true);
        c(!n6Var.h.isEmpty(), true, false);
        int i3 = this.e;
        if (i3 > 0) {
            if (bx0Var.i(i3) != -1) {
                org.telegram.messenger.g0.i3(new ax0(this, this.e, 1), 500L);
                this.e = 0;
                return;
            }
            return;
        }
        if (m61Var == null || currentTabId <= 0 || n6Var.b(currentTabId) != null) {
            return;
        }
        m61Var.d(0, 0);
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
            this.h.setInterpolator(org.telegram.ui.Components.xq.h);
            this.h.addUpdateListener(new b3(this, 28));
            this.h.start();
        }
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.j3 && ((Long) objArr[0]).longValue() == this.c.b) {
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
        ei.n6 n6Var = this.c;
        org.telegram.messenger.hs.f(n6Var.a).c(this, org.telegram.messenger.hs.j3);
        if (this.r == n6Var.h.isEmpty() || this.d.a != n6Var.a()) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.hs.f(this.c.a).n(this, org.telegram.messenger.hs.j3);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        int measuredWidth = getMeasuredWidth();
        int visualHeight = (int) getVisualHeight();
        Rect rect = this.s;
        rect.set(0, 0, measuredWidth, visualHeight);
        setClipBounds(rect);
    }

    public void setInitialTabId(int i3) {
        if (this.d.i(i3) != -1) {
            org.telegram.messenger.g0.i3(new ax0(this, i3, 0), 500L);
        } else {
            this.e = i3;
        }
    }

    public void setReorderingAlbums(boolean z10) {
        if (this.f == z10) {
            return;
        }
        this.f = z10;
        org.telegram.ui.Components.m61 m61Var = this.b;
        m61Var.setReordering(z10);
        boolean z11 = this.f;
        org.telegram.ui.Components.yp0 yp0Var = (org.telegram.ui.Components.yp0) this;
        org.telegram.ui.Components.ws0 ws0Var = yp0Var.x;
        TextView textView = ws0Var.t0;
        textView.setVisibility(0);
        textView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.4f).scaleY(z11 ? 1.0f : 0.4f).withEndAction(new org.telegram.ui.Components.up0(1, yp0Var, z11)).start();
        ws0Var.G1(true);
        if (z10) {
            org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
            if (T instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) T;
                profileActivity.U4(false);
                org.telegram.messenger.g0.h3(new g90(profileActivity, 28));
            }
        }
        if (z10) {
            return;
        }
        org.telegram.messenger.g0.r(this.w);
        ei.n6 n6Var = this.c;
        n6Var.e();
        n6Var.f(false);
        int currentPosition = m61Var.getCurrentPosition();
        bx0 bx0Var = this.d;
        int f10 = bx0Var.f(currentPosition);
        this.a.k(true);
        int i3 = bx0Var.i(f10);
        m61Var.e(0.0f, i3, i3);
    }
}
