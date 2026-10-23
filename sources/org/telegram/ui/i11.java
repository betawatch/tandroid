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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public abstract class i11 extends org.telegram.ui.Components.ga implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public final Rect F;
    public final my0 G;
    public final di.a h;
    public final org.telegram.ui.Components.k91 n;
    public final ci.v6 r;
    public final h11 s;
    public int v;
    public boolean w;
    public ValueAnimator x;
    public float y;

    public i11(Context context, org.telegram.ui.Components.ow0 ow0Var, ci.v6 v6Var, final org.telegram.ui.Components.rs0 rs0Var) {
        super(context, ow0Var);
        this.F = new Rect();
        this.r = v6Var;
        Objects.requireNonNull(v6Var);
        this.G = new my0(v6Var, 8);
        final org.telegram.ui.Components.ss0 ss0Var = (org.telegram.ui.Components.ss0) this;
        di.a aVar = new di.a(ss0Var, context, rs0Var);
        this.h = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        h11 h11Var = new h11(ss0Var);
        this.s = h11Var;
        h11Var.a = v6Var.a();
        aVar.setAdapter(h11Var);
        aVar.setTranslationY(AndroidUtilities.dp(42.0f));
        org.telegram.ui.Components.k91 n10 = aVar.n(10, true);
        this.n = n10;
        n10.g(org.telegram.ui.ActionBar.k6.Gh, org.telegram.ui.ActionBar.k6.G6, org.telegram.ui.ActionBar.k6.Eh, org.telegram.ui.ActionBar.k6.Hh, org.telegram.ui.ActionBar.k6.s8);
        n10.r = 12;
        final int i10 = 0;
        n10.setPreTabClick(new Utilities.Callback2Return() { // from class: org.telegram.ui.f11
            @Override // org.telegram.messenger.Utilities.Callback2Return
            public final Object run(Object obj, Object obj2) {
                ci.h7 storiesController;
                Integer num = (Integer) obj;
                switch (i10) {
                    case 0:
                        if (!ss0Var.w) {
                            if (num.intValue() != -1) {
                                break;
                            } else {
                                org.telegram.ui.Components.rs0 rs0Var2 = rs0Var;
                                org.telegram.ui.Components.f5.S(rs0Var2.a, rs0Var2.b, rs0Var2.c, new org.telegram.ui.Components.tv(rs0Var2, 20));
                                break;
                            }
                        } else {
                            break;
                        }
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !ss0Var.w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.rs0 rs0Var3 = rs0Var;
                            org.telegram.ui.Components.xv0 xv0Var = rs0Var3.d;
                            org.telegram.ui.ActionBar.o2 o2Var = xv0Var.v1;
                            storiesController = xv0Var.getStoriesController();
                            if (storiesController.i(xv0Var.j1)) {
                                org.telegram.ui.Components.j80 H = org.telegram.ui.Components.j80.H(o2Var, view);
                                H.W(new org.telegram.ui.Components.qs0(rs0Var3));
                                final int i11 = 0;
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() { // from class: org.telegram.ui.Components.os0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i11) {
                                            case 0:
                                                xv0 xv0Var2 = rs0Var3.d;
                                                xv0Var2.R0(xv0Var2.v1, xv0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                xv0 xv0Var3 = rs0Var3.d;
                                                xv0Var3.T0(xv0Var3.v1, xv0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                rs0Var3.d.g1(intValue);
                                                break;
                                            default:
                                                xv0 xv0Var4 = rs0Var3.d;
                                                xv0Var4.S0(xv0Var4.v1, xv0Var4.j1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                xv0Var.x(H, o2Var, xv0Var.j1, intValue);
                                final int i12 = 1;
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() { // from class: org.telegram.ui.Components.os0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                xv0 xv0Var2 = rs0Var3.d;
                                                xv0Var2.R0(xv0Var2.v1, xv0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                xv0 xv0Var3 = rs0Var3.d;
                                                xv0Var3.T0(xv0Var3.v1, xv0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                rs0Var3.d.g1(intValue);
                                                break;
                                            default:
                                                xv0 xv0Var4 = rs0Var3.d;
                                                xv0Var4.S0(xv0Var4.v1, xv0Var4.j1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i13 = 2;
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() { // from class: org.telegram.ui.Components.os0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                xv0 xv0Var2 = rs0Var3.d;
                                                xv0Var2.R0(xv0Var2.v1, xv0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                xv0 xv0Var3 = rs0Var3.d;
                                                xv0Var3.T0(xv0Var3.v1, xv0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                rs0Var3.d.g1(intValue);
                                                break;
                                            default:
                                                xv0 xv0Var4 = rs0Var3.d;
                                                xv0Var4.S0(xv0Var4.v1, xv0Var4.j1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i14 = 3;
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() { // from class: org.telegram.ui.Components.os0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                xv0 xv0Var2 = rs0Var3.d;
                                                xv0Var2.R0(xv0Var2.v1, xv0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                xv0 xv0Var3 = rs0Var3.d;
                                                xv0Var3.T0(xv0Var3.v1, xv0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                rs0Var3.d.g1(intValue);
                                                break;
                                            default:
                                                xv0 xv0Var4 = rs0Var3.d;
                                                xv0Var4.S0(xv0Var4.v1, xv0Var4.j1, intValue);
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
        n10.setOnTabLongClick(new Utilities.Callback2Return() { // from class: org.telegram.ui.f11
            @Override // org.telegram.messenger.Utilities.Callback2Return
            public final Object run(Object obj, Object obj2) {
                ci.h7 storiesController;
                Integer num = (Integer) obj;
                switch (i11) {
                    case 0:
                        if (!ss0Var.w) {
                            if (num.intValue() != -1) {
                                break;
                            } else {
                                org.telegram.ui.Components.rs0 rs0Var2 = rs0Var;
                                org.telegram.ui.Components.f5.S(rs0Var2.a, rs0Var2.b, rs0Var2.c, new org.telegram.ui.Components.tv(rs0Var2, 20));
                                break;
                            }
                        } else {
                            break;
                        }
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !ss0Var.w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.rs0 rs0Var3 = rs0Var;
                            org.telegram.ui.Components.xv0 xv0Var = rs0Var3.d;
                            org.telegram.ui.ActionBar.o2 o2Var = xv0Var.v1;
                            storiesController = xv0Var.getStoriesController();
                            if (storiesController.i(xv0Var.j1)) {
                                org.telegram.ui.Components.j80 H = org.telegram.ui.Components.j80.H(o2Var, view);
                                H.W(new org.telegram.ui.Components.qs0(rs0Var3));
                                final int i112 = 0;
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() { // from class: org.telegram.ui.Components.os0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i112) {
                                            case 0:
                                                xv0 xv0Var2 = rs0Var3.d;
                                                xv0Var2.R0(xv0Var2.v1, xv0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                xv0 xv0Var3 = rs0Var3.d;
                                                xv0Var3.T0(xv0Var3.v1, xv0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                rs0Var3.d.g1(intValue);
                                                break;
                                            default:
                                                xv0 xv0Var4 = rs0Var3.d;
                                                xv0Var4.S0(xv0Var4.v1, xv0Var4.j1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                xv0Var.x(H, o2Var, xv0Var.j1, intValue);
                                final int i12 = 1;
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() { // from class: org.telegram.ui.Components.os0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                xv0 xv0Var2 = rs0Var3.d;
                                                xv0Var2.R0(xv0Var2.v1, xv0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                xv0 xv0Var3 = rs0Var3.d;
                                                xv0Var3.T0(xv0Var3.v1, xv0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                rs0Var3.d.g1(intValue);
                                                break;
                                            default:
                                                xv0 xv0Var4 = rs0Var3.d;
                                                xv0Var4.S0(xv0Var4.v1, xv0Var4.j1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i13 = 2;
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() { // from class: org.telegram.ui.Components.os0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                xv0 xv0Var2 = rs0Var3.d;
                                                xv0Var2.R0(xv0Var2.v1, xv0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                xv0 xv0Var3 = rs0Var3.d;
                                                xv0Var3.T0(xv0Var3.v1, xv0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                rs0Var3.d.g1(intValue);
                                                break;
                                            default:
                                                xv0 xv0Var4 = rs0Var3.d;
                                                xv0Var4.S0(xv0Var4.v1, xv0Var4.j1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i14 = 3;
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() { // from class: org.telegram.ui.Components.os0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                xv0 xv0Var2 = rs0Var3.d;
                                                xv0Var2.R0(xv0Var2.v1, xv0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                xv0 xv0Var3 = rs0Var3.d;
                                                xv0Var3.T0(xv0Var3.v1, xv0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                rs0Var3.d.g1(intValue);
                                                break;
                                            default:
                                                xv0 xv0Var4 = rs0Var3.d;
                                                xv0Var4.S0(xv0Var4.v1, xv0Var4.j1, intValue);
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
        c(!v6Var.h.isEmpty(), false, true);
    }

    public final void a() {
        org.telegram.ui.Components.k91 k91Var = this.n;
        int currentTabId = k91Var != null ? k91Var.getCurrentTabId() : 0;
        ci.v6 v6Var = this.r;
        boolean a2 = v6Var.a();
        h11 h11Var = this.s;
        h11Var.a = a2;
        this.h.o(true);
        c(!v6Var.h.isEmpty(), true, false);
        int i10 = this.v;
        if (i10 > 0) {
            if (h11Var.i(i10) != -1) {
                AndroidUtilities.runOnUIThread(new e11(this, this.v, 1), 500L);
                this.v = 0;
                return;
            }
            return;
        }
        if (k91Var == null || currentTabId <= 0 || v6Var.b(currentTabId) != null) {
            return;
        }
        k91Var.d(0, 0);
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
            this.x.addUpdateListener(new g11(this, 0));
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
        ci.v6 v6Var = this.r;
        NotificationCenter.getInstance(v6Var.a).addObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
        if (this.E == v6Var.h.isEmpty() || this.s.a != v6Var.a()) {
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
            AndroidUtilities.runOnUIThread(new e11(this, i10, 0), 500L);
        } else {
            this.v = i10;
        }
    }

    public void setReorderingAlbums(boolean z10) {
        if (this.w == z10) {
            return;
        }
        this.w = z10;
        org.telegram.ui.Components.k91 k91Var = this.n;
        k91Var.setReordering(z10);
        boolean z11 = this.w;
        org.telegram.ui.Components.ss0 ss0Var = (org.telegram.ui.Components.ss0) this;
        org.telegram.ui.Components.xv0 xv0Var = ss0Var.H;
        TextView textView = xv0Var.q0;
        textView.setVisibility(0);
        textView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.4f).scaleY(z11 ? 1.0f : 0.4f).withEndAction(new org.telegram.ui.Components.b60(5, ss0Var, z11)).start();
        xv0Var.u1(true);
        if (z10) {
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (U instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) U;
                profileActivity.I4(false);
                AndroidUtilities.runOnUIThread(new ib0(profileActivity, 27));
            }
        }
        if (z10) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.G);
        ci.v6 v6Var = this.r;
        v6Var.e();
        v6Var.f(false);
        int currentPosition = k91Var.getCurrentPosition();
        h11 h11Var = this.s;
        int f7 = h11Var.f(currentPosition);
        this.h.o(true);
        int i10 = h11Var.i(f7);
        k91Var.e(0.0f, i10, i10);
    }
}
