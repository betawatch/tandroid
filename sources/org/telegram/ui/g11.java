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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public abstract class g11 extends org.telegram.ui.Components.ga implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public final Rect F;
    public final sy0 G;
    public final di.a h;
    public final org.telegram.ui.Components.b91 n;
    public final ci.w6 r;
    public final f11 s;
    public int v;
    public boolean w;
    public ValueAnimator x;
    public float y;

    public g11(Context context, org.telegram.ui.Components.jw0 jw0Var, ci.w6 w6Var, final org.telegram.ui.Components.ms0 ms0Var) {
        super(context, jw0Var);
        this.F = new Rect();
        this.r = w6Var;
        Objects.requireNonNull(w6Var);
        this.G = new sy0(w6Var, 7);
        final org.telegram.ui.Components.ns0 ns0Var = (org.telegram.ui.Components.ns0) this;
        di.a aVar = new di.a(ns0Var, context, ms0Var);
        this.h = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        f11 f11Var = new f11(ns0Var);
        this.s = f11Var;
        f11Var.a = w6Var.a();
        aVar.setAdapter(f11Var);
        aVar.setTranslationY(AndroidUtilities.dp(42.0f));
        org.telegram.ui.Components.b91 n10 = aVar.n(10, true);
        this.n = n10;
        n10.g(org.telegram.ui.ActionBar.h6.Gh, org.telegram.ui.ActionBar.h6.G6, org.telegram.ui.ActionBar.h6.Eh, org.telegram.ui.ActionBar.h6.Hh, org.telegram.ui.ActionBar.h6.s8);
        n10.r = 12;
        final int i10 = 0;
        n10.setPreTabClick(new Utilities.Callback2Return() { // from class: org.telegram.ui.d11
            @Override // org.telegram.messenger.Utilities.Callback2Return
            public final Object run(Object obj, Object obj2) {
                ci.i7 storiesController;
                Integer num = (Integer) obj;
                switch (i10) {
                    case 0:
                        if (!ns0Var.w) {
                            if (num.intValue() != -1) {
                                break;
                            } else {
                                org.telegram.ui.Components.ms0 ms0Var2 = ms0Var;
                                org.telegram.ui.Components.f5.R(ms0Var2.a, ms0Var2.b, ms0Var2.c, new org.telegram.ui.Components.tv(ms0Var2, 20));
                                break;
                            }
                        } else {
                            break;
                        }
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !ns0Var.w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.ms0 ms0Var3 = ms0Var;
                            org.telegram.ui.Components.sv0 sv0Var = ms0Var3.d;
                            org.telegram.ui.ActionBar.n2 n2Var = sv0Var.v1;
                            storiesController = sv0Var.getStoriesController();
                            if (storiesController.i(sv0Var.j1)) {
                                org.telegram.ui.Components.i80 H = org.telegram.ui.Components.i80.H(n2Var, view);
                                H.W(new org.telegram.ui.Components.ls0(ms0Var3));
                                final int i11 = 0;
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() { // from class: org.telegram.ui.Components.js0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i11) {
                                            case 0:
                                                sv0 sv0Var2 = ms0Var3.d;
                                                sv0Var2.Q0(sv0Var2.v1, sv0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                sv0 sv0Var3 = ms0Var3.d;
                                                sv0Var3.S0(sv0Var3.v1, sv0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                ms0Var3.d.f1(intValue);
                                                break;
                                            default:
                                                sv0 sv0Var4 = ms0Var3.d;
                                                sv0Var4.R0(sv0Var4.v1, sv0Var4.j1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                sv0Var.x(H, n2Var, sv0Var.j1, intValue);
                                final int i12 = 1;
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() { // from class: org.telegram.ui.Components.js0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                sv0 sv0Var2 = ms0Var3.d;
                                                sv0Var2.Q0(sv0Var2.v1, sv0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                sv0 sv0Var3 = ms0Var3.d;
                                                sv0Var3.S0(sv0Var3.v1, sv0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                ms0Var3.d.f1(intValue);
                                                break;
                                            default:
                                                sv0 sv0Var4 = ms0Var3.d;
                                                sv0Var4.R0(sv0Var4.v1, sv0Var4.j1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i13 = 2;
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() { // from class: org.telegram.ui.Components.js0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                sv0 sv0Var2 = ms0Var3.d;
                                                sv0Var2.Q0(sv0Var2.v1, sv0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                sv0 sv0Var3 = ms0Var3.d;
                                                sv0Var3.S0(sv0Var3.v1, sv0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                ms0Var3.d.f1(intValue);
                                                break;
                                            default:
                                                sv0 sv0Var4 = ms0Var3.d;
                                                sv0Var4.R0(sv0Var4.v1, sv0Var4.j1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i14 = 3;
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() { // from class: org.telegram.ui.Components.js0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                sv0 sv0Var2 = ms0Var3.d;
                                                sv0Var2.Q0(sv0Var2.v1, sv0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                sv0 sv0Var3 = ms0Var3.d;
                                                sv0Var3.S0(sv0Var3.v1, sv0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                ms0Var3.d.f1(intValue);
                                                break;
                                            default:
                                                sv0 sv0Var4 = ms0Var3.d;
                                                sv0Var4.R0(sv0Var4.v1, sv0Var4.j1, intValue);
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
        n10.setOnTabLongClick(new Utilities.Callback2Return() { // from class: org.telegram.ui.d11
            @Override // org.telegram.messenger.Utilities.Callback2Return
            public final Object run(Object obj, Object obj2) {
                ci.i7 storiesController;
                Integer num = (Integer) obj;
                switch (i11) {
                    case 0:
                        if (!ns0Var.w) {
                            if (num.intValue() != -1) {
                                break;
                            } else {
                                org.telegram.ui.Components.ms0 ms0Var2 = ms0Var;
                                org.telegram.ui.Components.f5.R(ms0Var2.a, ms0Var2.b, ms0Var2.c, new org.telegram.ui.Components.tv(ms0Var2, 20));
                                break;
                            }
                        } else {
                            break;
                        }
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !ns0Var.w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.ms0 ms0Var3 = ms0Var;
                            org.telegram.ui.Components.sv0 sv0Var = ms0Var3.d;
                            org.telegram.ui.ActionBar.n2 n2Var = sv0Var.v1;
                            storiesController = sv0Var.getStoriesController();
                            if (storiesController.i(sv0Var.j1)) {
                                org.telegram.ui.Components.i80 H = org.telegram.ui.Components.i80.H(n2Var, view);
                                H.W(new org.telegram.ui.Components.ls0(ms0Var3));
                                final int i112 = 0;
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() { // from class: org.telegram.ui.Components.js0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i112) {
                                            case 0:
                                                sv0 sv0Var2 = ms0Var3.d;
                                                sv0Var2.Q0(sv0Var2.v1, sv0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                sv0 sv0Var3 = ms0Var3.d;
                                                sv0Var3.S0(sv0Var3.v1, sv0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                ms0Var3.d.f1(intValue);
                                                break;
                                            default:
                                                sv0 sv0Var4 = ms0Var3.d;
                                                sv0Var4.R0(sv0Var4.v1, sv0Var4.j1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                sv0Var.x(H, n2Var, sv0Var.j1, intValue);
                                final int i12 = 1;
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() { // from class: org.telegram.ui.Components.js0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                sv0 sv0Var2 = ms0Var3.d;
                                                sv0Var2.Q0(sv0Var2.v1, sv0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                sv0 sv0Var3 = ms0Var3.d;
                                                sv0Var3.S0(sv0Var3.v1, sv0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                ms0Var3.d.f1(intValue);
                                                break;
                                            default:
                                                sv0 sv0Var4 = ms0Var3.d;
                                                sv0Var4.R0(sv0Var4.v1, sv0Var4.j1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i13 = 2;
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() { // from class: org.telegram.ui.Components.js0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                sv0 sv0Var2 = ms0Var3.d;
                                                sv0Var2.Q0(sv0Var2.v1, sv0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                sv0 sv0Var3 = ms0Var3.d;
                                                sv0Var3.S0(sv0Var3.v1, sv0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                ms0Var3.d.f1(intValue);
                                                break;
                                            default:
                                                sv0 sv0Var4 = ms0Var3.d;
                                                sv0Var4.R0(sv0Var4.v1, sv0Var4.j1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i14 = 3;
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() { // from class: org.telegram.ui.Components.js0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                sv0 sv0Var2 = ms0Var3.d;
                                                sv0Var2.Q0(sv0Var2.v1, sv0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                sv0 sv0Var3 = ms0Var3.d;
                                                sv0Var3.S0(sv0Var3.v1, sv0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                ms0Var3.d.f1(intValue);
                                                break;
                                            default:
                                                sv0 sv0Var4 = ms0Var3.d;
                                                sv0Var4.R0(sv0Var4.v1, sv0Var4.j1, intValue);
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
        org.telegram.ui.Components.b91 b91Var = this.n;
        int currentTabId = b91Var != null ? b91Var.getCurrentTabId() : 0;
        ci.w6 w6Var = this.r;
        boolean a2 = w6Var.a();
        f11 f11Var = this.s;
        f11Var.a = a2;
        this.h.o(true);
        c(!w6Var.h.isEmpty(), true, false);
        int i10 = this.v;
        if (i10 > 0) {
            if (f11Var.i(i10) != -1) {
                AndroidUtilities.runOnUIThread(new c11(this, this.v, 1), 500L);
                this.v = 0;
                return;
            }
            return;
        }
        if (b91Var == null || currentTabId <= 0 || w6Var.b(currentTabId) != null) {
            return;
        }
        b91Var.d(0, 0);
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
            this.x.addUpdateListener(new e11(this, 0));
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
            AndroidUtilities.runOnUIThread(new c11(this, i10, 0), 500L);
        } else {
            this.v = i10;
        }
    }

    public void setReorderingAlbums(boolean z10) {
        if (this.w == z10) {
            return;
        }
        this.w = z10;
        org.telegram.ui.Components.b91 b91Var = this.n;
        b91Var.setReordering(z10);
        boolean z11 = this.w;
        org.telegram.ui.Components.ns0 ns0Var = (org.telegram.ui.Components.ns0) this;
        org.telegram.ui.Components.sv0 sv0Var = ns0Var.H;
        TextView textView = sv0Var.q0;
        textView.setVisibility(0);
        textView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.4f).scaleY(z11 ? 1.0f : 0.4f).withEndAction(new org.telegram.ui.Components.b60(5, ns0Var, z11)).start();
        sv0Var.s1(true);
        if (z10) {
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            if (U instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) U;
                profileActivity.G4(false);
                AndroidUtilities.runOnUIThread(new eb0(profileActivity, 27));
            }
        }
        if (z10) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.G);
        ci.w6 w6Var = this.r;
        w6Var.e();
        w6Var.f(false);
        int currentPosition = b91Var.getCurrentPosition();
        f11 f11Var = this.s;
        int f7 = f11Var.f(currentPosition);
        this.h.o(true);
        int i10 = f11Var.i(f7);
        b91Var.e(0.0f, i10, i10);
    }
}
