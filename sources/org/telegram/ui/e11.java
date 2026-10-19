package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public abstract class e11 extends org.telegram.ui.Components.ga implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public final Rect F;
    public final qy0 G;
    public final di.a h;
    public final org.telegram.ui.Components.c91 n;
    public final ci.w6 r;
    public final d11 s;
    public int v;
    public boolean w;
    public ValueAnimator x;
    public float y;

    public e11(Context context, org.telegram.ui.Components.kw0 kw0Var, ci.w6 w6Var, final org.telegram.ui.Components.ns0 ns0Var) {
        super(context, kw0Var);
        this.F = new Rect();
        this.r = w6Var;
        Objects.requireNonNull(w6Var);
        this.G = new qy0(w6Var, 7);
        final org.telegram.ui.Components.os0 os0Var = (org.telegram.ui.Components.os0) this;
        di.a aVar = new di.a(os0Var, context, ns0Var);
        this.h = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        d11 d11Var = new d11(os0Var);
        this.s = d11Var;
        d11Var.a = w6Var.a();
        aVar.setAdapter(d11Var);
        aVar.setTranslationY(AndroidUtilities.dp(42.0f));
        org.telegram.ui.Components.c91 n10 = aVar.n(10, true);
        this.n = n10;
        n10.g(org.telegram.ui.ActionBar.h6.Gh, org.telegram.ui.ActionBar.h6.G6, org.telegram.ui.ActionBar.h6.Eh, org.telegram.ui.ActionBar.h6.Hh, org.telegram.ui.ActionBar.h6.s8);
        n10.r = 12;
        final int i10 = 0;
        n10.setPreTabClick(new Utilities.Callback2Return() { // from class: org.telegram.ui.b11
            @Override // org.telegram.messenger.Utilities.Callback2Return
            public final Object run(Object obj, Object obj2) {
                ci.i7 storiesController;
                Integer num = (Integer) obj;
                switch (i10) {
                    case 0:
                        if (!os0Var.w) {
                            if (num.intValue() != -1) {
                                break;
                            } else {
                                org.telegram.ui.Components.ns0 ns0Var2 = ns0Var;
                                org.telegram.ui.Components.f5.R(ns0Var2.a, ns0Var2.b, ns0Var2.c, new org.telegram.ui.Components.tv(ns0Var2, 20));
                                break;
                            }
                        } else {
                            break;
                        }
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !os0Var.w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.ns0 ns0Var3 = ns0Var;
                            org.telegram.ui.Components.tv0 tv0Var = ns0Var3.d;
                            org.telegram.ui.ActionBar.n2 n2Var = tv0Var.v1;
                            storiesController = tv0Var.getStoriesController();
                            if (storiesController.i(tv0Var.j1)) {
                                org.telegram.ui.Components.i80 H = org.telegram.ui.Components.i80.H(n2Var, view);
                                H.W(new org.telegram.ui.Components.ms0(ns0Var3));
                                final int i11 = 0;
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() { // from class: org.telegram.ui.Components.ks0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i11) {
                                            case 0:
                                                tv0 tv0Var2 = ns0Var3.d;
                                                tv0Var2.Q0(tv0Var2.v1, tv0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                tv0 tv0Var3 = ns0Var3.d;
                                                tv0Var3.S0(tv0Var3.v1, tv0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                ns0Var3.d.f1(intValue);
                                                break;
                                            default:
                                                tv0 tv0Var4 = ns0Var3.d;
                                                tv0Var4.R0(tv0Var4.v1, tv0Var4.j1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                tv0Var.x(H, n2Var, tv0Var.j1, intValue);
                                final int i12 = 1;
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() { // from class: org.telegram.ui.Components.ks0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                tv0 tv0Var2 = ns0Var3.d;
                                                tv0Var2.Q0(tv0Var2.v1, tv0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                tv0 tv0Var3 = ns0Var3.d;
                                                tv0Var3.S0(tv0Var3.v1, tv0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                ns0Var3.d.f1(intValue);
                                                break;
                                            default:
                                                tv0 tv0Var4 = ns0Var3.d;
                                                tv0Var4.R0(tv0Var4.v1, tv0Var4.j1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i13 = 2;
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() { // from class: org.telegram.ui.Components.ks0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                tv0 tv0Var2 = ns0Var3.d;
                                                tv0Var2.Q0(tv0Var2.v1, tv0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                tv0 tv0Var3 = ns0Var3.d;
                                                tv0Var3.S0(tv0Var3.v1, tv0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                ns0Var3.d.f1(intValue);
                                                break;
                                            default:
                                                tv0 tv0Var4 = ns0Var3.d;
                                                tv0Var4.R0(tv0Var4.v1, tv0Var4.j1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i14 = 3;
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() { // from class: org.telegram.ui.Components.ks0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                tv0 tv0Var2 = ns0Var3.d;
                                                tv0Var2.Q0(tv0Var2.v1, tv0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                tv0 tv0Var3 = ns0Var3.d;
                                                tv0Var3.S0(tv0Var3.v1, tv0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                ns0Var3.d.f1(intValue);
                                                break;
                                            default:
                                                tv0 tv0Var4 = ns0Var3.d;
                                                tv0Var4.R0(tv0Var4.v1, tv0Var4.j1, intValue);
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
        n10.setOnTabLongClick(new Utilities.Callback2Return() { // from class: org.telegram.ui.b11
            @Override // org.telegram.messenger.Utilities.Callback2Return
            public final Object run(Object obj, Object obj2) {
                ci.i7 storiesController;
                Integer num = (Integer) obj;
                switch (i11) {
                    case 0:
                        if (!os0Var.w) {
                            if (num.intValue() != -1) {
                                break;
                            } else {
                                org.telegram.ui.Components.ns0 ns0Var2 = ns0Var;
                                org.telegram.ui.Components.f5.R(ns0Var2.a, ns0Var2.b, ns0Var2.c, new org.telegram.ui.Components.tv(ns0Var2, 20));
                                break;
                            }
                        } else {
                            break;
                        }
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !os0Var.w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.ns0 ns0Var3 = ns0Var;
                            org.telegram.ui.Components.tv0 tv0Var = ns0Var3.d;
                            org.telegram.ui.ActionBar.n2 n2Var = tv0Var.v1;
                            storiesController = tv0Var.getStoriesController();
                            if (storiesController.i(tv0Var.j1)) {
                                org.telegram.ui.Components.i80 H = org.telegram.ui.Components.i80.H(n2Var, view);
                                H.W(new org.telegram.ui.Components.ms0(ns0Var3));
                                final int i112 = 0;
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() { // from class: org.telegram.ui.Components.ks0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i112) {
                                            case 0:
                                                tv0 tv0Var2 = ns0Var3.d;
                                                tv0Var2.Q0(tv0Var2.v1, tv0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                tv0 tv0Var3 = ns0Var3.d;
                                                tv0Var3.S0(tv0Var3.v1, tv0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                ns0Var3.d.f1(intValue);
                                                break;
                                            default:
                                                tv0 tv0Var4 = ns0Var3.d;
                                                tv0Var4.R0(tv0Var4.v1, tv0Var4.j1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                tv0Var.x(H, n2Var, tv0Var.j1, intValue);
                                final int i12 = 1;
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() { // from class: org.telegram.ui.Components.ks0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                tv0 tv0Var2 = ns0Var3.d;
                                                tv0Var2.Q0(tv0Var2.v1, tv0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                tv0 tv0Var3 = ns0Var3.d;
                                                tv0Var3.S0(tv0Var3.v1, tv0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                ns0Var3.d.f1(intValue);
                                                break;
                                            default:
                                                tv0 tv0Var4 = ns0Var3.d;
                                                tv0Var4.R0(tv0Var4.v1, tv0Var4.j1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i13 = 2;
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() { // from class: org.telegram.ui.Components.ks0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                tv0 tv0Var2 = ns0Var3.d;
                                                tv0Var2.Q0(tv0Var2.v1, tv0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                tv0 tv0Var3 = ns0Var3.d;
                                                tv0Var3.S0(tv0Var3.v1, tv0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                ns0Var3.d.f1(intValue);
                                                break;
                                            default:
                                                tv0 tv0Var4 = ns0Var3.d;
                                                tv0Var4.R0(tv0Var4.v1, tv0Var4.j1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i14 = 3;
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() { // from class: org.telegram.ui.Components.ks0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                tv0 tv0Var2 = ns0Var3.d;
                                                tv0Var2.Q0(tv0Var2.v1, tv0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                tv0 tv0Var3 = ns0Var3.d;
                                                tv0Var3.S0(tv0Var3.v1, tv0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                ns0Var3.d.f1(intValue);
                                                break;
                                            default:
                                                tv0 tv0Var4 = ns0Var3.d;
                                                tv0Var4.R0(tv0Var4.v1, tv0Var4.j1, intValue);
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
        addView(n10, w7.z5.e(-1, 42, 48));
        c(!w6Var.h.isEmpty(), false, true);
    }

    public final void a() {
        org.telegram.ui.Components.c91 c91Var = this.n;
        int currentTabId = c91Var != null ? c91Var.getCurrentTabId() : 0;
        ci.w6 w6Var = this.r;
        boolean a2 = w6Var.a();
        d11 d11Var = this.s;
        d11Var.a = a2;
        this.h.o(true);
        c(!w6Var.h.isEmpty(), true, false);
        int i10 = this.v;
        if (i10 > 0) {
            if (d11Var.i(i10) != -1) {
                AndroidUtilities.runOnUIThread(new a11(this, this.v, 1), 500L);
                this.v = 0;
                return;
            }
            return;
        }
        if (c91Var == null || currentTabId <= 0 || w6Var.b(currentTabId) != null) {
            return;
        }
        c91Var.d(0, 0);
    }

    public abstract void b();

    public final void c(boolean z10, boolean z11, boolean z12) {
        if (this.E != z10 || z12) {
            this.E = z10;
            setEnabled(z10);
            ValueAnimator valueAnimator = this.x;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.x = null;
            }
            if (!z11) {
                this.y = z10 ? 1.0f : 0.0f;
                b();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y, z10 ? 1.0f : 0.0f);
            this.x = ofFloat;
            ofFloat.setDuration(480L);
            this.x.setInterpolator(org.telegram.ui.Components.bs.h);
            this.x.addUpdateListener(new c11(this, 0));
            this.x.start();
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storyAlbumsCollectionsUpdate && ((Long) objArr[0]).longValue() == this.r.b) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.E && super.dispatchTouchEvent(motionEvent);
    }

    public int getCurrentAlbumId() {
        return this.s.f(this.n.getCurrentPosition());
    }

    public float getVisibilityFactor() {
        return this.y;
    }

    public float getVisualHeight() {
        return getMeasuredHeight() * this.y;
    }

    @Override // org.telegram.ui.Components.ga, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ci.w6 w6Var = this.r;
        NotificationCenter.getInstance(w6Var.a).addObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
        if (this.E == w6Var.h.isEmpty() || this.s.a != w6Var.a()) {
            a();
        }
    }

    @Override // org.telegram.ui.Components.ga, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.r.a).removeObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int measuredWidth = getMeasuredWidth();
        int visualHeight = (int) getVisualHeight();
        Rect rect = this.F;
        rect.set(0, 0, measuredWidth, visualHeight);
        setClipBounds(rect);
    }

    public void setInitialTabId(int i10) {
        if (this.s.i(i10) != -1) {
            AndroidUtilities.runOnUIThread(new a11(this, i10, 0), 500L);
        } else {
            this.v = i10;
        }
    }

    public void setReorderingAlbums(boolean z10) {
        if (this.w == z10) {
            return;
        }
        this.w = z10;
        org.telegram.ui.Components.c91 c91Var = this.n;
        c91Var.setReordering(z10);
        boolean z11 = this.w;
        org.telegram.ui.Components.os0 os0Var = (org.telegram.ui.Components.os0) this;
        org.telegram.ui.Components.tv0 tv0Var = os0Var.H;
        TextView textView = tv0Var.q0;
        textView.setVisibility(0);
        textView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.4f).scaleY(z11 ? 1.0f : 0.4f).withEndAction(new org.telegram.ui.Components.b60(5, os0Var, z11)).start();
        tv0Var.s1(true);
        if (z10) {
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            if (U instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) U;
                profileActivity.G4(false);
                AndroidUtilities.runOnUIThread(new cb0(profileActivity, 27));
            }
        }
        if (z10) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.G);
        ci.w6 w6Var = this.r;
        w6Var.e();
        w6Var.f(false);
        int currentPosition = c91Var.getCurrentPosition();
        d11 d11Var = this.s;
        int f7 = d11Var.f(currentPosition);
        this.h.o(true);
        int i10 = d11Var.i(f7);
        c91Var.e(0.0f, i10, i10);
    }
}
