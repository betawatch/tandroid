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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class h21 extends org.telegram.ui.Components.fa implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public final Rect F;
    public final k01 G;
    public final ai.c h;
    public final org.telegram.ui.Components.u81 n;
    public final zh.w4 r;
    public final g21 s;
    public int v;
    public boolean w;
    public ValueAnimator x;
    public float y;

    public h21(Context context, org.telegram.ui.Components.aw0 aw0Var, zh.w4 w4Var, final org.telegram.ui.Components.as0 as0Var) {
        super(context, aw0Var);
        this.F = new Rect();
        this.r = w4Var;
        Objects.requireNonNull(w4Var);
        this.G = new k01(w4Var, 6);
        final org.telegram.ui.Components.cs0 cs0Var = (org.telegram.ui.Components.cs0) this;
        ai.c cVar = new ai.c(cs0Var, context, as0Var);
        this.h = cVar;
        cVar.setAllowDisallowInterceptTouch(true);
        g21 g21Var = new g21(cs0Var);
        this.s = g21Var;
        g21Var.a = w4Var.a();
        cVar.setAdapter(g21Var);
        cVar.setTranslationY(AndroidUtilities.dp(42.0f));
        org.telegram.ui.Components.u81 n10 = cVar.n(10, true);
        this.n = n10;
        int i10 = org.telegram.ui.ActionBar.j6.Gh;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        int i12 = org.telegram.ui.ActionBar.j6.Eh;
        int i13 = org.telegram.ui.ActionBar.j6.Hh;
        int i14 = org.telegram.ui.ActionBar.j6.s8;
        n10.P = i10;
        n10.Q = i11;
        n10.R = i12;
        n10.S = i13;
        n10.T = i14;
        n10.O.setColor(org.telegram.ui.ActionBar.j6.v0(i10, n10.j0));
        n10.r = 12;
        final int i15 = 0;
        n10.setPreTabClick(new Utilities.Callback2Return() { // from class: org.telegram.ui.e21
            @Override // org.telegram.messenger.Utilities.Callback2Return
            public final Object run(Object obj, Object obj2) {
                zh.i5 storiesController;
                Integer num = (Integer) obj;
                switch (i15) {
                    case 0:
                        if (!cs0Var.w) {
                            if (num.intValue() != -1) {
                                break;
                            } else {
                                org.telegram.ui.Components.as0 as0Var2 = as0Var;
                                org.telegram.ui.Components.d5.S(as0Var2.a, as0Var2.b, as0Var2.c, new org.telegram.ui.Components.pv(as0Var2, 19));
                                break;
                            }
                        } else {
                            break;
                        }
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !cs0Var.w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.as0 as0Var3 = as0Var;
                            org.telegram.ui.Components.iv0 iv0Var = as0Var3.d;
                            org.telegram.ui.ActionBar.p2 p2Var = iv0Var.v1;
                            storiesController = iv0Var.getStoriesController();
                            if (storiesController.i(iv0Var.j1)) {
                                org.telegram.ui.Components.w70 H = org.telegram.ui.Components.w70.H(p2Var, view);
                                H.W(new org.telegram.ui.Components.zr0(as0Var3));
                                final int i16 = 0;
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() { // from class: org.telegram.ui.Components.xr0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i16) {
                                            case 0:
                                                iv0 iv0Var2 = as0Var3.d;
                                                iv0Var2.O0(iv0Var2.v1, iv0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                iv0 iv0Var3 = as0Var3.d;
                                                iv0Var3.Q0(iv0Var3.v1, iv0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                as0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                iv0 iv0Var4 = as0Var3.d;
                                                iv0Var4.P0(iv0Var4.v1, iv0Var4.j1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                iv0Var.x(H, p2Var, iv0Var.j1, intValue);
                                final int i17 = 1;
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() { // from class: org.telegram.ui.Components.xr0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i17) {
                                            case 0:
                                                iv0 iv0Var2 = as0Var3.d;
                                                iv0Var2.O0(iv0Var2.v1, iv0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                iv0 iv0Var3 = as0Var3.d;
                                                iv0Var3.Q0(iv0Var3.v1, iv0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                as0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                iv0 iv0Var4 = as0Var3.d;
                                                iv0Var4.P0(iv0Var4.v1, iv0Var4.j1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i18 = 2;
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() { // from class: org.telegram.ui.Components.xr0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i18) {
                                            case 0:
                                                iv0 iv0Var2 = as0Var3.d;
                                                iv0Var2.O0(iv0Var2.v1, iv0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                iv0 iv0Var3 = as0Var3.d;
                                                iv0Var3.Q0(iv0Var3.v1, iv0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                as0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                iv0 iv0Var4 = as0Var3.d;
                                                iv0Var4.P0(iv0Var4.v1, iv0Var4.j1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i19 = 3;
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() { // from class: org.telegram.ui.Components.xr0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i19) {
                                            case 0:
                                                iv0 iv0Var2 = as0Var3.d;
                                                iv0Var2.O0(iv0Var2.v1, iv0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                iv0 iv0Var3 = as0Var3.d;
                                                iv0Var3.Q0(iv0Var3.v1, iv0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                as0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                iv0 iv0Var4 = as0Var3.d;
                                                iv0Var4.P0(iv0Var4.v1, iv0Var4.j1, intValue);
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
        final int i16 = 1;
        n10.setOnTabLongClick(new Utilities.Callback2Return() { // from class: org.telegram.ui.e21
            @Override // org.telegram.messenger.Utilities.Callback2Return
            public final Object run(Object obj, Object obj2) {
                zh.i5 storiesController;
                Integer num = (Integer) obj;
                switch (i16) {
                    case 0:
                        if (!cs0Var.w) {
                            if (num.intValue() != -1) {
                                break;
                            } else {
                                org.telegram.ui.Components.as0 as0Var2 = as0Var;
                                org.telegram.ui.Components.d5.S(as0Var2.a, as0Var2.b, as0Var2.c, new org.telegram.ui.Components.pv(as0Var2, 19));
                                break;
                            }
                        } else {
                            break;
                        }
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !cs0Var.w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.as0 as0Var3 = as0Var;
                            org.telegram.ui.Components.iv0 iv0Var = as0Var3.d;
                            org.telegram.ui.ActionBar.p2 p2Var = iv0Var.v1;
                            storiesController = iv0Var.getStoriesController();
                            if (storiesController.i(iv0Var.j1)) {
                                org.telegram.ui.Components.w70 H = org.telegram.ui.Components.w70.H(p2Var, view);
                                H.W(new org.telegram.ui.Components.zr0(as0Var3));
                                final int i162 = 0;
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() { // from class: org.telegram.ui.Components.xr0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i162) {
                                            case 0:
                                                iv0 iv0Var2 = as0Var3.d;
                                                iv0Var2.O0(iv0Var2.v1, iv0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                iv0 iv0Var3 = as0Var3.d;
                                                iv0Var3.Q0(iv0Var3.v1, iv0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                as0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                iv0 iv0Var4 = as0Var3.d;
                                                iv0Var4.P0(iv0Var4.v1, iv0Var4.j1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                iv0Var.x(H, p2Var, iv0Var.j1, intValue);
                                final int i17 = 1;
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() { // from class: org.telegram.ui.Components.xr0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i17) {
                                            case 0:
                                                iv0 iv0Var2 = as0Var3.d;
                                                iv0Var2.O0(iv0Var2.v1, iv0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                iv0 iv0Var3 = as0Var3.d;
                                                iv0Var3.Q0(iv0Var3.v1, iv0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                as0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                iv0 iv0Var4 = as0Var3.d;
                                                iv0Var4.P0(iv0Var4.v1, iv0Var4.j1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i18 = 2;
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() { // from class: org.telegram.ui.Components.xr0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i18) {
                                            case 0:
                                                iv0 iv0Var2 = as0Var3.d;
                                                iv0Var2.O0(iv0Var2.v1, iv0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                iv0 iv0Var3 = as0Var3.d;
                                                iv0Var3.Q0(iv0Var3.v1, iv0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                as0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                iv0 iv0Var4 = as0Var3.d;
                                                iv0Var4.P0(iv0Var4.v1, iv0Var4.j1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i19 = 3;
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() { // from class: org.telegram.ui.Components.xr0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i19) {
                                            case 0:
                                                iv0 iv0Var2 = as0Var3.d;
                                                iv0Var2.O0(iv0Var2.v1, iv0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                iv0 iv0Var3 = as0Var3.d;
                                                iv0Var3.Q0(iv0Var3.v1, iv0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                as0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                iv0 iv0Var4 = as0Var3.d;
                                                iv0Var4.P0(iv0Var4.v1, iv0Var4.j1, intValue);
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
        addView(n10, w7.a6.e(-1, 42, 48));
        b(!w4Var.h.isEmpty(), false, true);
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
            this.x.setInterpolator(org.telegram.ui.Components.wr.h);
            this.x.addUpdateListener(new f21(this, 0));
            this.x.start();
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storyAlbumsCollectionsUpdate) {
            long longValue = ((Long) objArr[0]).longValue();
            zh.w4 w4Var = this.r;
            if (longValue != w4Var.b) {
                return;
            }
            org.telegram.ui.Components.u81 u81Var = this.n;
            int currentTabId = u81Var != null ? u81Var.getCurrentTabId() : 0;
            boolean a2 = w4Var.a();
            g21 g21Var = this.s;
            g21Var.a = a2;
            this.h.o(true);
            b(!w4Var.h.isEmpty(), true, false);
            int i12 = this.v;
            if (i12 > 0) {
                if (g21Var.i(i12) != -1) {
                    AndroidUtilities.runOnUIThread(new d21(this, this.v, 1), 500L);
                    this.v = 0;
                    return;
                }
                return;
            }
            if (u81Var == null || currentTabId <= 0 || w4Var.b(currentTabId) != null) {
                return;
            }
            u81Var.d(0, 0);
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

    @Override // org.telegram.ui.Components.fa, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.r.a).addObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override // org.telegram.ui.Components.fa, android.view.ViewGroup, android.view.View
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
        org.telegram.ui.Components.u81 u81Var = this.n;
        u81Var.setReordering(z10);
        boolean z11 = this.w;
        org.telegram.ui.Components.cs0 cs0Var = (org.telegram.ui.Components.cs0) this;
        org.telegram.ui.Components.iv0 iv0Var = cs0Var.H;
        TextView textView = iv0Var.q0;
        textView.setVisibility(0);
        textView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.4f).scaleY(z11 ? 1.0f : 0.4f).withEndAction(new org.telegram.ui.Components.bs0(0, cs0Var, z11)).start();
        iv0Var.q1(true);
        if (z10) {
            org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
            if (U instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) U;
                profileActivity.G4(false);
                AndroidUtilities.runOnUIThread(new yb0(profileActivity, 27));
            }
        }
        if (z10) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.G);
        zh.w4 w4Var = this.r;
        w4Var.e();
        w4Var.f(false);
        int currentPosition = u81Var.getCurrentPosition();
        g21 g21Var = this.s;
        int f7 = g21Var.f(currentPosition);
        this.h.o(true);
        int i10 = g21Var.i(f7);
        u81Var.e(0.0f, i10, i10);
    }
}
