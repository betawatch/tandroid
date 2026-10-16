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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public abstract class h21 extends org.telegram.ui.Components.ia implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public final Rect F;
    public final tz0 G;
    public final ci.a h;
    public final org.telegram.ui.Components.k91 n;
    public final bi.i8 r;
    public final g21 s;
    public int v;
    public boolean w;
    public ValueAnimator x;
    public float y;

    public h21(Context context, org.telegram.ui.Components.ow0 ow0Var, bi.i8 i8Var, final org.telegram.ui.Components.rs0 rs0Var) {
        super(context, ow0Var);
        this.F = new Rect();
        this.r = i8Var;
        Objects.requireNonNull(i8Var);
        this.G = new tz0(i8Var, 7);
        final org.telegram.ui.Components.ss0 ss0Var = (org.telegram.ui.Components.ss0) this;
        ci.a aVar = new ci.a(ss0Var, context, rs0Var);
        this.h = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        g21 g21Var = new g21(ss0Var);
        this.s = g21Var;
        g21Var.a = i8Var.a();
        aVar.setAdapter(g21Var);
        aVar.setTranslationY(AndroidUtilities.dp(42.0f));
        org.telegram.ui.Components.k91 n10 = aVar.n(10, true);
        this.n = n10;
        n10.g(org.telegram.ui.ActionBar.g6.Gh, org.telegram.ui.ActionBar.g6.G6, org.telegram.ui.ActionBar.g6.Eh, org.telegram.ui.ActionBar.g6.Hh, org.telegram.ui.ActionBar.g6.s8);
        n10.r = 12;
        final int i10 = 0;
        n10.setPreTabClick(new Utilities.Callback2Return() { // from class: org.telegram.ui.e21
            @Override // org.telegram.messenger.Utilities.Callback2Return
            public final Object run(Object obj, Object obj2) {
                bi.x8 storiesController;
                Integer num = (Integer) obj;
                switch (i10) {
                    case 0:
                        if (!ss0Var.w) {
                            if (num.intValue() != -1) {
                                break;
                            } else {
                                org.telegram.ui.Components.rs0 rs0Var2 = rs0Var;
                                org.telegram.ui.Components.g5.R(rs0Var2.a, rs0Var2.b, rs0Var2.c, new org.telegram.ui.Components.xv(rs0Var2, 20));
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
                            org.telegram.ui.ActionBar.m2 m2Var = xv0Var.v1;
                            storiesController = xv0Var.getStoriesController();
                            if (storiesController.i(xv0Var.j1)) {
                                org.telegram.ui.Components.l80 H = org.telegram.ui.Components.l80.H(m2Var, view);
                                H.W(new org.telegram.ui.Components.qs0(rs0Var3));
                                final int i11 = 0;
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() { // from class: org.telegram.ui.Components.os0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i11) {
                                            case 0:
                                                xv0 xv0Var2 = rs0Var3.d;
                                                xv0Var2.P0(xv0Var2.v1, xv0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                xv0 xv0Var3 = rs0Var3.d;
                                                xv0Var3.R0(xv0Var3.v1, xv0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                rs0Var3.d.e1(intValue);
                                                break;
                                            default:
                                                xv0 xv0Var4 = rs0Var3.d;
                                                xv0Var4.Q0(xv0Var4.v1, xv0Var4.j1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                xv0Var.x(H, m2Var, xv0Var.j1, intValue);
                                final int i12 = 1;
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() { // from class: org.telegram.ui.Components.os0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                xv0 xv0Var2 = rs0Var3.d;
                                                xv0Var2.P0(xv0Var2.v1, xv0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                xv0 xv0Var3 = rs0Var3.d;
                                                xv0Var3.R0(xv0Var3.v1, xv0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                rs0Var3.d.e1(intValue);
                                                break;
                                            default:
                                                xv0 xv0Var4 = rs0Var3.d;
                                                xv0Var4.Q0(xv0Var4.v1, xv0Var4.j1, intValue);
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
                                                xv0Var2.P0(xv0Var2.v1, xv0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                xv0 xv0Var3 = rs0Var3.d;
                                                xv0Var3.R0(xv0Var3.v1, xv0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                rs0Var3.d.e1(intValue);
                                                break;
                                            default:
                                                xv0 xv0Var4 = rs0Var3.d;
                                                xv0Var4.Q0(xv0Var4.v1, xv0Var4.j1, intValue);
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
                                                xv0Var2.P0(xv0Var2.v1, xv0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                xv0 xv0Var3 = rs0Var3.d;
                                                xv0Var3.R0(xv0Var3.v1, xv0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                rs0Var3.d.e1(intValue);
                                                break;
                                            default:
                                                xv0 xv0Var4 = rs0Var3.d;
                                                xv0Var4.Q0(xv0Var4.v1, xv0Var4.j1, intValue);
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
        n10.setOnTabLongClick(new Utilities.Callback2Return() { // from class: org.telegram.ui.e21
            @Override // org.telegram.messenger.Utilities.Callback2Return
            public final Object run(Object obj, Object obj2) {
                bi.x8 storiesController;
                Integer num = (Integer) obj;
                switch (i11) {
                    case 0:
                        if (!ss0Var.w) {
                            if (num.intValue() != -1) {
                                break;
                            } else {
                                org.telegram.ui.Components.rs0 rs0Var2 = rs0Var;
                                org.telegram.ui.Components.g5.R(rs0Var2.a, rs0Var2.b, rs0Var2.c, new org.telegram.ui.Components.xv(rs0Var2, 20));
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
                            org.telegram.ui.ActionBar.m2 m2Var = xv0Var.v1;
                            storiesController = xv0Var.getStoriesController();
                            if (storiesController.i(xv0Var.j1)) {
                                org.telegram.ui.Components.l80 H = org.telegram.ui.Components.l80.H(m2Var, view);
                                H.W(new org.telegram.ui.Components.qs0(rs0Var3));
                                final int i112 = 0;
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() { // from class: org.telegram.ui.Components.os0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i112) {
                                            case 0:
                                                xv0 xv0Var2 = rs0Var3.d;
                                                xv0Var2.P0(xv0Var2.v1, xv0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                xv0 xv0Var3 = rs0Var3.d;
                                                xv0Var3.R0(xv0Var3.v1, xv0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                rs0Var3.d.e1(intValue);
                                                break;
                                            default:
                                                xv0 xv0Var4 = rs0Var3.d;
                                                xv0Var4.Q0(xv0Var4.v1, xv0Var4.j1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                xv0Var.x(H, m2Var, xv0Var.j1, intValue);
                                final int i12 = 1;
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() { // from class: org.telegram.ui.Components.os0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                xv0 xv0Var2 = rs0Var3.d;
                                                xv0Var2.P0(xv0Var2.v1, xv0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                xv0 xv0Var3 = rs0Var3.d;
                                                xv0Var3.R0(xv0Var3.v1, xv0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                rs0Var3.d.e1(intValue);
                                                break;
                                            default:
                                                xv0 xv0Var4 = rs0Var3.d;
                                                xv0Var4.Q0(xv0Var4.v1, xv0Var4.j1, intValue);
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
                                                xv0Var2.P0(xv0Var2.v1, xv0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                xv0 xv0Var3 = rs0Var3.d;
                                                xv0Var3.R0(xv0Var3.v1, xv0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                rs0Var3.d.e1(intValue);
                                                break;
                                            default:
                                                xv0 xv0Var4 = rs0Var3.d;
                                                xv0Var4.Q0(xv0Var4.v1, xv0Var4.j1, intValue);
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
                                                xv0Var2.P0(xv0Var2.v1, xv0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                xv0 xv0Var3 = rs0Var3.d;
                                                xv0Var3.R0(xv0Var3.v1, xv0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                rs0Var3.d.e1(intValue);
                                                break;
                                            default:
                                                xv0 xv0Var4 = rs0Var3.d;
                                                xv0Var4.Q0(xv0Var4.v1, xv0Var4.j1, intValue);
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
        b(!i8Var.h.isEmpty(), false, true);
    }

    public abstract void a();

    public final void b(boolean z10, boolean z11, boolean z12) {
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
                a();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y, z10 ? 1.0f : 0.0f);
            this.x = ofFloat;
            ofFloat.setDuration(480L);
            this.x.setInterpolator(org.telegram.ui.Components.es.h);
            this.x.addUpdateListener(new f21(this, 0));
            this.x.start();
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storyAlbumsCollectionsUpdate) {
            long longValue = ((Long) objArr[0]).longValue();
            bi.i8 i8Var = this.r;
            if (longValue != i8Var.b) {
                return;
            }
            org.telegram.ui.Components.k91 k91Var = this.n;
            int currentTabId = k91Var != null ? k91Var.getCurrentTabId() : 0;
            boolean a2 = i8Var.a();
            g21 g21Var = this.s;
            g21Var.a = a2;
            this.h.o(true);
            b(!i8Var.h.isEmpty(), true, false);
            int i12 = this.v;
            if (i12 > 0) {
                if (g21Var.i(i12) != -1) {
                    AndroidUtilities.runOnUIThread(new d21(this, this.v, 1), 500L);
                    this.v = 0;
                    return;
                }
                return;
            }
            if (k91Var == null || currentTabId <= 0 || i8Var.b(currentTabId) != null) {
                return;
            }
            k91Var.d(0, 0);
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

    @Override // org.telegram.ui.Components.ia, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.r.a).addObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override // org.telegram.ui.Components.ia, android.view.ViewGroup, android.view.View
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
            AndroidUtilities.runOnUIThread(new d21(this, i10, 0), 500L);
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
        textView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.4f).scaleY(z11 ? 1.0f : 0.4f).withEndAction(new org.telegram.ui.Components.zr0(2, ss0Var, z11)).start();
        xv0Var.r1(true);
        if (z10) {
            org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
            if (U instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) U;
                profileActivity.G4(false);
                AndroidUtilities.runOnUIThread(new bc0(profileActivity, 27));
            }
        }
        if (z10) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.G);
        bi.i8 i8Var = this.r;
        i8Var.e();
        i8Var.f(false);
        int currentPosition = k91Var.getCurrentPosition();
        g21 g21Var = this.s;
        int f7 = g21Var.f(currentPosition);
        this.h.o(true);
        int i10 = g21Var.i(f7);
        k91Var.e(0.0f, i10, i10);
    }
}
