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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public abstract class m11 extends org.telegram.ui.Components.y9 implements NotificationCenter.NotificationCenterDelegate {
    public boolean B;
    public final Rect C;
    public final xy0 D;
    public final k11 h;
    public final org.telegram.ui.Components.l81 n;
    public final oh.h6 r;
    public final l11 s;
    public int v;
    public boolean w;
    public ValueAnimator x;
    public float y;

    public m11(Context context, org.telegram.ui.Components.qv0 qv0Var, oh.h6 h6Var, final org.telegram.ui.Components.sr0 sr0Var) {
        super(context, qv0Var);
        this.C = new Rect();
        this.r = h6Var;
        Objects.requireNonNull(h6Var);
        this.D = new xy0(h6Var, 7);
        final org.telegram.ui.Components.tr0 tr0Var = (org.telegram.ui.Components.tr0) this;
        k11 k11Var = new k11(tr0Var, context, sr0Var);
        this.h = k11Var;
        k11Var.setAllowDisallowInterceptTouch(true);
        l11 l11Var = new l11(tr0Var);
        this.s = l11Var;
        l11Var.a = h6Var.a();
        k11Var.setAdapter(l11Var);
        k11Var.setTranslationY(AndroidUtilities.dp(42.0f));
        org.telegram.ui.Components.l81 n10 = k11Var.n(10, true);
        this.n = n10;
        int i10 = org.telegram.ui.ActionBar.k6.Gh;
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        int i12 = org.telegram.ui.ActionBar.k6.Eh;
        int i13 = org.telegram.ui.ActionBar.k6.Hh;
        int i14 = org.telegram.ui.ActionBar.k6.s8;
        n10.M = i10;
        n10.N = i11;
        n10.O = i12;
        n10.P = i13;
        n10.Q = i14;
        n10.L.setColor(org.telegram.ui.ActionBar.k6.v0(i10, n10.g0));
        n10.r = 12;
        final int i15 = 0;
        n10.setPreTabClick(new Utilities.Callback2Return() { // from class: org.telegram.ui.i11
            @Override // org.telegram.messenger.Utilities.Callback2Return
            public final Object run(Object obj, Object obj2) {
                oh.t6 storiesController;
                Integer num = (Integer) obj;
                switch (i15) {
                    case 0:
                        if (!tr0Var.w) {
                            if (num.intValue() != -1) {
                                break;
                            } else {
                                org.telegram.ui.Components.sr0 sr0Var2 = sr0Var;
                                org.telegram.ui.Components.z4.S(sr0Var2.a, sr0Var2.b, sr0Var2.c, new org.telegram.ui.Components.hv(sr0Var2, 19));
                                break;
                            }
                        } else {
                            break;
                        }
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !tr0Var.w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.sr0 sr0Var3 = sr0Var;
                            org.telegram.ui.Components.zu0 zu0Var = sr0Var3.d;
                            org.telegram.ui.ActionBar.p2 p2Var = zu0Var.s1;
                            storiesController = zu0Var.getStoriesController();
                            if (storiesController.i(zu0Var.g1)) {
                                org.telegram.ui.Components.q70 H = org.telegram.ui.Components.q70.H(p2Var, view);
                                H.W(new lh.s2(sr0Var3));
                                final int i16 = 0;
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() { // from class: org.telegram.ui.Components.qr0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i16) {
                                            case 0:
                                                zu0 zu0Var2 = sr0Var3.d;
                                                zu0Var2.O0(zu0Var2.s1, zu0Var2.g1, intValue);
                                                break;
                                            case 1:
                                                zu0 zu0Var3 = sr0Var3.d;
                                                zu0Var3.Q0(zu0Var3.s1, zu0Var3.g1, intValue);
                                                break;
                                            case 2:
                                                sr0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                zu0 zu0Var4 = sr0Var3.d;
                                                zu0Var4.P0(zu0Var4.s1, zu0Var4.g1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                zu0Var.x(H, p2Var, zu0Var.g1, intValue);
                                final int i17 = 1;
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() { // from class: org.telegram.ui.Components.qr0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i17) {
                                            case 0:
                                                zu0 zu0Var2 = sr0Var3.d;
                                                zu0Var2.O0(zu0Var2.s1, zu0Var2.g1, intValue);
                                                break;
                                            case 1:
                                                zu0 zu0Var3 = sr0Var3.d;
                                                zu0Var3.Q0(zu0Var3.s1, zu0Var3.g1, intValue);
                                                break;
                                            case 2:
                                                sr0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                zu0 zu0Var4 = sr0Var3.d;
                                                zu0Var4.P0(zu0Var4.s1, zu0Var4.g1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i18 = 2;
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() { // from class: org.telegram.ui.Components.qr0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i18) {
                                            case 0:
                                                zu0 zu0Var2 = sr0Var3.d;
                                                zu0Var2.O0(zu0Var2.s1, zu0Var2.g1, intValue);
                                                break;
                                            case 1:
                                                zu0 zu0Var3 = sr0Var3.d;
                                                zu0Var3.Q0(zu0Var3.s1, zu0Var3.g1, intValue);
                                                break;
                                            case 2:
                                                sr0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                zu0 zu0Var4 = sr0Var3.d;
                                                zu0Var4.P0(zu0Var4.s1, zu0Var4.g1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i19 = 3;
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() { // from class: org.telegram.ui.Components.qr0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i19) {
                                            case 0:
                                                zu0 zu0Var2 = sr0Var3.d;
                                                zu0Var2.O0(zu0Var2.s1, zu0Var2.g1, intValue);
                                                break;
                                            case 1:
                                                zu0 zu0Var3 = sr0Var3.d;
                                                zu0Var3.Q0(zu0Var3.s1, zu0Var3.g1, intValue);
                                                break;
                                            case 2:
                                                sr0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                zu0 zu0Var4 = sr0Var3.d;
                                                zu0Var4.P0(zu0Var4.s1, zu0Var4.g1, intValue);
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
        n10.setOnTabLongClick(new Utilities.Callback2Return() { // from class: org.telegram.ui.i11
            @Override // org.telegram.messenger.Utilities.Callback2Return
            public final Object run(Object obj, Object obj2) {
                oh.t6 storiesController;
                Integer num = (Integer) obj;
                switch (i16) {
                    case 0:
                        if (!tr0Var.w) {
                            if (num.intValue() != -1) {
                                break;
                            } else {
                                org.telegram.ui.Components.sr0 sr0Var2 = sr0Var;
                                org.telegram.ui.Components.z4.S(sr0Var2.a, sr0Var2.b, sr0Var2.c, new org.telegram.ui.Components.hv(sr0Var2, 19));
                                break;
                            }
                        } else {
                            break;
                        }
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !tr0Var.w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.sr0 sr0Var3 = sr0Var;
                            org.telegram.ui.Components.zu0 zu0Var = sr0Var3.d;
                            org.telegram.ui.ActionBar.p2 p2Var = zu0Var.s1;
                            storiesController = zu0Var.getStoriesController();
                            if (storiesController.i(zu0Var.g1)) {
                                org.telegram.ui.Components.q70 H = org.telegram.ui.Components.q70.H(p2Var, view);
                                H.W(new lh.s2(sr0Var3));
                                final int i162 = 0;
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() { // from class: org.telegram.ui.Components.qr0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i162) {
                                            case 0:
                                                zu0 zu0Var2 = sr0Var3.d;
                                                zu0Var2.O0(zu0Var2.s1, zu0Var2.g1, intValue);
                                                break;
                                            case 1:
                                                zu0 zu0Var3 = sr0Var3.d;
                                                zu0Var3.Q0(zu0Var3.s1, zu0Var3.g1, intValue);
                                                break;
                                            case 2:
                                                sr0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                zu0 zu0Var4 = sr0Var3.d;
                                                zu0Var4.P0(zu0Var4.s1, zu0Var4.g1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                zu0Var.x(H, p2Var, zu0Var.g1, intValue);
                                final int i17 = 1;
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() { // from class: org.telegram.ui.Components.qr0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i17) {
                                            case 0:
                                                zu0 zu0Var2 = sr0Var3.d;
                                                zu0Var2.O0(zu0Var2.s1, zu0Var2.g1, intValue);
                                                break;
                                            case 1:
                                                zu0 zu0Var3 = sr0Var3.d;
                                                zu0Var3.Q0(zu0Var3.s1, zu0Var3.g1, intValue);
                                                break;
                                            case 2:
                                                sr0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                zu0 zu0Var4 = sr0Var3.d;
                                                zu0Var4.P0(zu0Var4.s1, zu0Var4.g1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i18 = 2;
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() { // from class: org.telegram.ui.Components.qr0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i18) {
                                            case 0:
                                                zu0 zu0Var2 = sr0Var3.d;
                                                zu0Var2.O0(zu0Var2.s1, zu0Var2.g1, intValue);
                                                break;
                                            case 1:
                                                zu0 zu0Var3 = sr0Var3.d;
                                                zu0Var3.Q0(zu0Var3.s1, zu0Var3.g1, intValue);
                                                break;
                                            case 2:
                                                sr0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                zu0 zu0Var4 = sr0Var3.d;
                                                zu0Var4.P0(zu0Var4.s1, zu0Var4.g1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i19 = 3;
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() { // from class: org.telegram.ui.Components.qr0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i19) {
                                            case 0:
                                                zu0 zu0Var2 = sr0Var3.d;
                                                zu0Var2.O0(zu0Var2.s1, zu0Var2.g1, intValue);
                                                break;
                                            case 1:
                                                zu0 zu0Var3 = sr0Var3.d;
                                                zu0Var3.Q0(zu0Var3.s1, zu0Var3.g1, intValue);
                                                break;
                                            case 2:
                                                sr0Var3.d.d1(intValue);
                                                break;
                                            default:
                                                zu0 zu0Var4 = sr0Var3.d;
                                                zu0Var4.P0(zu0Var4.s1, zu0Var4.g1, intValue);
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
        addView(n10, k7.c6.e(-1, 42, 48));
        b(!h6Var.h.isEmpty(), false, true);
    }

    public abstract void a();

    public final void b(boolean z4, boolean z10, boolean z11) {
        if (this.B != z4 || z11) {
            this.B = z4;
            setEnabled(z4);
            ValueAnimator valueAnimator = this.x;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.x = null;
            }
            if (!z10) {
                this.y = z4 ? 1.0f : 0.0f;
                a();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y, z4 ? 1.0f : 0.0f);
            this.x = ofFloat;
            ofFloat.setDuration(480L);
            this.x.setInterpolator(org.telegram.ui.Components.pr.h);
            this.x.addUpdateListener(new j11(this, 0));
            this.x.start();
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storyAlbumsCollectionsUpdate) {
            long longValue = ((Long) objArr[0]).longValue();
            oh.h6 h6Var = this.r;
            if (longValue != h6Var.b) {
                return;
            }
            org.telegram.ui.Components.l81 l81Var = this.n;
            int currentTabId = l81Var != null ? l81Var.getCurrentTabId() : 0;
            boolean a2 = h6Var.a();
            l11 l11Var = this.s;
            l11Var.a = a2;
            this.h.o(true);
            b(!h6Var.h.isEmpty(), true, false);
            int i12 = this.v;
            if (i12 > 0) {
                if (l11Var.i(i12) != -1) {
                    AndroidUtilities.runOnUIThread(new h11(this, this.v, 1), 500L);
                    this.v = 0;
                    return;
                }
                return;
            }
            if (l81Var == null || currentTabId <= 0 || h6Var.b(currentTabId) != null) {
                return;
            }
            l81Var.d(0, 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.B && super.dispatchTouchEvent(motionEvent);
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

    @Override // org.telegram.ui.Components.y9, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.r.a).addObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override // org.telegram.ui.Components.y9, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.r.a).removeObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        int measuredWidth = getMeasuredWidth();
        int visualHeight = (int) getVisualHeight();
        Rect rect = this.C;
        rect.set(0, 0, measuredWidth, visualHeight);
        setClipBounds(rect);
    }

    public void setInitialTabId(int i10) {
        if (this.s.i(i10) != -1) {
            AndroidUtilities.runOnUIThread(new h11(this, i10, 0), 500L);
        } else {
            this.v = i10;
        }
    }

    public void setReorderingAlbums(boolean z4) {
        if (this.w == z4) {
            return;
        }
        this.w = z4;
        org.telegram.ui.Components.l81 l81Var = this.n;
        l81Var.setReordering(z4);
        boolean z10 = this.w;
        org.telegram.ui.Components.tr0 tr0Var = (org.telegram.ui.Components.tr0) this;
        org.telegram.ui.Components.zu0 zu0Var = tr0Var.E;
        TextView textView = zu0Var.n0;
        textView.setVisibility(0);
        textView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.4f).scaleY(z10 ? 1.0f : 0.4f).withEndAction(new kh.f(28, tr0Var, z10)).start();
        zu0Var.q1(true);
        if (z4) {
            org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
            if (U instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) U;
                profileActivity.G4(false);
                AndroidUtilities.runOnUIThread(new pb0(profileActivity, 27));
            }
        }
        if (z4) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.D);
        oh.h6 h6Var = this.r;
        h6Var.e();
        h6Var.f(false);
        int currentPosition = l81Var.getCurrentPosition();
        l11 l11Var = this.s;
        int f10 = l11Var.f(currentPosition);
        this.h.o(true);
        int i10 = l11Var.i(f10);
        l81Var.e(0.0f, i10, i10);
    }
}
