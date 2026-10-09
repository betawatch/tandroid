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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public abstract class a21 extends org.telegram.ui.Components.ja implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public final Rect F;
    public final nz0 G;
    public final bi.a h;
    public final org.telegram.ui.Components.n91 n;
    public final ai.y8 r;
    public final z11 s;
    public int v;
    public boolean w;
    public ValueAnimator x;
    public float y;

    public a21(Context context, org.telegram.ui.Components.sw0 sw0Var, ai.y8 y8Var, final org.telegram.ui.Components.vs0 vs0Var) {
        super(context, sw0Var);
        this.F = new Rect();
        this.r = y8Var;
        Objects.requireNonNull(y8Var);
        this.G = new nz0(y8Var, 7);
        final org.telegram.ui.Components.ws0 ws0Var = (org.telegram.ui.Components.ws0) this;
        bi.a aVar = new bi.a(ws0Var, context, vs0Var);
        this.h = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        z11 z11Var = new z11(ws0Var);
        this.s = z11Var;
        z11Var.a = y8Var.a();
        aVar.setAdapter(z11Var);
        aVar.setTranslationY(AndroidUtilities.dp(42.0f));
        org.telegram.ui.Components.n91 n10 = aVar.n(10, true);
        this.n = n10;
        n10.g(org.telegram.ui.ActionBar.i6.Gh, org.telegram.ui.ActionBar.i6.G6, org.telegram.ui.ActionBar.i6.Eh, org.telegram.ui.ActionBar.i6.Hh, org.telegram.ui.ActionBar.i6.s8);
        n10.r = 12;
        final int i10 = 0;
        n10.setPreTabClick(new Utilities.Callback2Return() { // from class: org.telegram.ui.x11
            @Override // org.telegram.messenger.Utilities.Callback2Return
            public final Object run(Object obj, Object obj2) {
                ai.m9 storiesController;
                Integer num = (Integer) obj;
                switch (i10) {
                    case 0:
                        if (!ws0Var.w) {
                            if (num.intValue() != -1) {
                                break;
                            } else {
                                org.telegram.ui.Components.vs0 vs0Var2 = vs0Var;
                                org.telegram.ui.Components.g5.R(vs0Var2.a, vs0Var2.b, vs0Var2.c, new org.telegram.ui.Components.bw(vs0Var2, 20));
                                break;
                            }
                        } else {
                            break;
                        }
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !ws0Var.w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.vs0 vs0Var3 = vs0Var;
                            org.telegram.ui.Components.bw0 bw0Var = vs0Var3.d;
                            org.telegram.ui.ActionBar.n2 n2Var = bw0Var.v1;
                            storiesController = bw0Var.getStoriesController();
                            if (storiesController.i(bw0Var.j1)) {
                                org.telegram.ui.Components.p80 H = org.telegram.ui.Components.p80.H(n2Var, view);
                                H.W(new org.telegram.ui.Components.us0(vs0Var3));
                                final int i11 = 0;
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() { // from class: org.telegram.ui.Components.ss0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i11) {
                                            case 0:
                                                bw0 bw0Var2 = vs0Var3.d;
                                                bw0Var2.O0(bw0Var2.v1, bw0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                bw0 bw0Var3 = vs0Var3.d;
                                                bw0Var3.Q0(bw0Var3.v1, bw0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                vs0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                bw0 bw0Var4 = vs0Var3.d;
                                                bw0Var4.P0(bw0Var4.v1, bw0Var4.j1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                bw0Var.x(H, n2Var, bw0Var.j1, intValue);
                                final int i12 = 1;
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() { // from class: org.telegram.ui.Components.ss0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                bw0 bw0Var2 = vs0Var3.d;
                                                bw0Var2.O0(bw0Var2.v1, bw0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                bw0 bw0Var3 = vs0Var3.d;
                                                bw0Var3.Q0(bw0Var3.v1, bw0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                vs0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                bw0 bw0Var4 = vs0Var3.d;
                                                bw0Var4.P0(bw0Var4.v1, bw0Var4.j1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i13 = 2;
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() { // from class: org.telegram.ui.Components.ss0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                bw0 bw0Var2 = vs0Var3.d;
                                                bw0Var2.O0(bw0Var2.v1, bw0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                bw0 bw0Var3 = vs0Var3.d;
                                                bw0Var3.Q0(bw0Var3.v1, bw0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                vs0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                bw0 bw0Var4 = vs0Var3.d;
                                                bw0Var4.P0(bw0Var4.v1, bw0Var4.j1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i14 = 3;
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() { // from class: org.telegram.ui.Components.ss0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                bw0 bw0Var2 = vs0Var3.d;
                                                bw0Var2.O0(bw0Var2.v1, bw0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                bw0 bw0Var3 = vs0Var3.d;
                                                bw0Var3.Q0(bw0Var3.v1, bw0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                vs0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                bw0 bw0Var4 = vs0Var3.d;
                                                bw0Var4.P0(bw0Var4.v1, bw0Var4.j1, intValue);
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
        n10.setOnTabLongClick(new Utilities.Callback2Return() { // from class: org.telegram.ui.x11
            @Override // org.telegram.messenger.Utilities.Callback2Return
            public final Object run(Object obj, Object obj2) {
                ai.m9 storiesController;
                Integer num = (Integer) obj;
                switch (i11) {
                    case 0:
                        if (!ws0Var.w) {
                            if (num.intValue() != -1) {
                                break;
                            } else {
                                org.telegram.ui.Components.vs0 vs0Var2 = vs0Var;
                                org.telegram.ui.Components.g5.R(vs0Var2.a, vs0Var2.b, vs0Var2.c, new org.telegram.ui.Components.bw(vs0Var2, 20));
                                break;
                            }
                        } else {
                            break;
                        }
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !ws0Var.w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.vs0 vs0Var3 = vs0Var;
                            org.telegram.ui.Components.bw0 bw0Var = vs0Var3.d;
                            org.telegram.ui.ActionBar.n2 n2Var = bw0Var.v1;
                            storiesController = bw0Var.getStoriesController();
                            if (storiesController.i(bw0Var.j1)) {
                                org.telegram.ui.Components.p80 H = org.telegram.ui.Components.p80.H(n2Var, view);
                                H.W(new org.telegram.ui.Components.us0(vs0Var3));
                                final int i112 = 0;
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() { // from class: org.telegram.ui.Components.ss0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i112) {
                                            case 0:
                                                bw0 bw0Var2 = vs0Var3.d;
                                                bw0Var2.O0(bw0Var2.v1, bw0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                bw0 bw0Var3 = vs0Var3.d;
                                                bw0Var3.Q0(bw0Var3.v1, bw0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                vs0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                bw0 bw0Var4 = vs0Var3.d;
                                                bw0Var4.P0(bw0Var4.v1, bw0Var4.j1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                bw0Var.x(H, n2Var, bw0Var.j1, intValue);
                                final int i12 = 1;
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() { // from class: org.telegram.ui.Components.ss0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                bw0 bw0Var2 = vs0Var3.d;
                                                bw0Var2.O0(bw0Var2.v1, bw0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                bw0 bw0Var3 = vs0Var3.d;
                                                bw0Var3.Q0(bw0Var3.v1, bw0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                vs0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                bw0 bw0Var4 = vs0Var3.d;
                                                bw0Var4.P0(bw0Var4.v1, bw0Var4.j1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i13 = 2;
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() { // from class: org.telegram.ui.Components.ss0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                bw0 bw0Var2 = vs0Var3.d;
                                                bw0Var2.O0(bw0Var2.v1, bw0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                bw0 bw0Var3 = vs0Var3.d;
                                                bw0Var3.Q0(bw0Var3.v1, bw0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                vs0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                bw0 bw0Var4 = vs0Var3.d;
                                                bw0Var4.P0(bw0Var4.v1, bw0Var4.j1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i14 = 3;
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() { // from class: org.telegram.ui.Components.ss0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                bw0 bw0Var2 = vs0Var3.d;
                                                bw0Var2.O0(bw0Var2.v1, bw0Var2.j1, intValue);
                                                break;
                                            case 1:
                                                bw0 bw0Var3 = vs0Var3.d;
                                                bw0Var3.Q0(bw0Var3.v1, bw0Var3.j1, intValue);
                                                break;
                                            case 2:
                                                vs0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                bw0 bw0Var4 = vs0Var3.d;
                                                bw0Var4.P0(bw0Var4.v1, bw0Var4.j1, intValue);
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
        addView(n10, w7.x5.e(-1, 42, 48));
        b(!y8Var.h.isEmpty(), false, true);
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
            this.x.setInterpolator(org.telegram.ui.Components.hs.h);
            this.x.addUpdateListener(new y11(this, 0));
            this.x.start();
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storyAlbumsCollectionsUpdate) {
            long longValue = ((Long) objArr[0]).longValue();
            ai.y8 y8Var = this.r;
            if (longValue != y8Var.b) {
                return;
            }
            org.telegram.ui.Components.n91 n91Var = this.n;
            int currentTabId = n91Var != null ? n91Var.getCurrentTabId() : 0;
            boolean a2 = y8Var.a();
            z11 z11Var = this.s;
            z11Var.a = a2;
            this.h.o(true);
            b(!y8Var.h.isEmpty(), true, false);
            int i12 = this.v;
            if (i12 > 0) {
                if (z11Var.i(i12) != -1) {
                    AndroidUtilities.runOnUIThread(new w11(this, this.v, 1), 500L);
                    this.v = 0;
                    return;
                }
                return;
            }
            if (n91Var == null || currentTabId <= 0 || y8Var.b(currentTabId) != null) {
                return;
            }
            n91Var.d(0, 0);
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

    @Override // org.telegram.ui.Components.ja, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.r.a).addObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override // org.telegram.ui.Components.ja, android.view.ViewGroup, android.view.View
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
            AndroidUtilities.runOnUIThread(new w11(this, i10, 0), 500L);
        } else {
            this.v = i10;
        }
    }

    public void setReorderingAlbums(boolean z10) {
        if (this.w == z10) {
            return;
        }
        this.w = z10;
        org.telegram.ui.Components.n91 n91Var = this.n;
        n91Var.setReordering(z10);
        boolean z11 = this.w;
        org.telegram.ui.Components.ws0 ws0Var = (org.telegram.ui.Components.ws0) this;
        org.telegram.ui.Components.bw0 bw0Var = ws0Var.H;
        TextView textView = bw0Var.q0;
        textView.setVisibility(0);
        textView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.4f).scaleY(z11 ? 1.0f : 0.4f).withEndAction(new org.telegram.ui.Components.ds0(2, ws0Var, z11)).start();
        bw0Var.q1(true);
        if (z10) {
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            if (U instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) U;
                profileActivity.G4(false);
                AndroidUtilities.runOnUIThread(new xb0(profileActivity, 27));
            }
        }
        if (z10) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.G);
        ai.y8 y8Var = this.r;
        y8Var.e();
        y8Var.f(false);
        int currentPosition = n91Var.getCurrentPosition();
        z11 z11Var = this.s;
        int f7 = z11Var.f(currentPosition);
        this.h.o(true);
        int i10 = z11Var.i(f7);
        n91Var.e(0.0f, i10, i10);
    }
}
