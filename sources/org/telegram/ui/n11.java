package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class n11 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final ei.a a;
    public final org.telegram.ui.Components.u91 b;
    public final di.v6 c;
    public final m11 d;
    public int e;
    public boolean f;
    public ValueAnimator h;
    public float n;
    public boolean r;
    public final Rect s;
    public final oy0 v;

    public n11(Context context, di.v6 v6Var, final org.telegram.ui.Components.zs0 zs0Var) {
        super(context);
        this.s = new Rect();
        this.c = v6Var;
        Objects.requireNonNull(v6Var);
        this.v = new oy0(v6Var, 9);
        final org.telegram.ui.Components.at0 at0Var = (org.telegram.ui.Components.at0) this;
        ei.a aVar = new ei.a(at0Var, context, zs0Var);
        this.a = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        m11 m11Var = new m11(at0Var);
        this.d = m11Var;
        m11Var.a = v6Var.a();
        aVar.setAdapter(m11Var);
        aVar.setTranslationY(AndroidUtilities.dp(42.0f));
        org.telegram.ui.Components.u91 n10 = aVar.n(10, true);
        this.b = n10;
        n10.g(org.telegram.ui.ActionBar.y6.Gh, org.telegram.ui.ActionBar.y6.G6, org.telegram.ui.ActionBar.y6.Eh, org.telegram.ui.ActionBar.y6.Hh, org.telegram.ui.ActionBar.y6.s8);
        n10.r = 12;
        final int i10 = 0;
        n10.setPreTabClick(new Utilities.Callback2Return() { // from class: org.telegram.ui.k11
            @Override // org.telegram.messenger.Utilities.Callback2Return
            public final Object run(Object obj, Object obj2) {
                di.h7 storiesController;
                Integer num = (Integer) obj;
                switch (i10) {
                    case 0:
                        if (!at0Var.f) {
                            if (num.intValue() != -1) {
                                break;
                            } else {
                                org.telegram.ui.Components.zs0 zs0Var2 = zs0Var;
                                org.telegram.ui.Components.g5.R(zs0Var2.a, zs0Var2.b, zs0Var2.c, new org.telegram.ui.Components.tv(zs0Var2, 22));
                                break;
                            }
                        } else {
                            break;
                        }
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !at0Var.f) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.zs0 zs0Var3 = zs0Var;
                            org.telegram.ui.Components.bw0 bw0Var = zs0Var3.d;
                            org.telegram.ui.ActionBar.r2 r2Var = bw0Var.x1;
                            storiesController = bw0Var.getStoriesController();
                            if (storiesController.i(bw0Var.l1)) {
                                org.telegram.ui.Components.l80 H = org.telegram.ui.Components.l80.H(r2Var, view);
                                H.W(new org.telegram.ui.Components.ys0(zs0Var3));
                                final int i11 = 0;
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() { // from class: org.telegram.ui.Components.xs0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i11) {
                                            case 0:
                                                bw0 bw0Var2 = zs0Var3.d;
                                                bw0Var2.U0(bw0Var2.x1, bw0Var2.l1, intValue);
                                                break;
                                            case 1:
                                                bw0 bw0Var3 = zs0Var3.d;
                                                bw0Var3.W0(bw0Var3.x1, bw0Var3.l1, intValue);
                                                break;
                                            case 2:
                                                zs0Var3.d.m1(intValue);
                                                break;
                                            default:
                                                bw0 bw0Var4 = zs0Var3.d;
                                                bw0Var4.V0(bw0Var4.x1, bw0Var4.l1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                bw0Var.A(new jg.s0(H, 22), r2Var, bw0Var.l1, intValue);
                                final int i12 = 1;
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() { // from class: org.telegram.ui.Components.xs0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                bw0 bw0Var2 = zs0Var3.d;
                                                bw0Var2.U0(bw0Var2.x1, bw0Var2.l1, intValue);
                                                break;
                                            case 1:
                                                bw0 bw0Var3 = zs0Var3.d;
                                                bw0Var3.W0(bw0Var3.x1, bw0Var3.l1, intValue);
                                                break;
                                            case 2:
                                                zs0Var3.d.m1(intValue);
                                                break;
                                            default:
                                                bw0 bw0Var4 = zs0Var3.d;
                                                bw0Var4.V0(bw0Var4.x1, bw0Var4.l1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i13 = 2;
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() { // from class: org.telegram.ui.Components.xs0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                bw0 bw0Var2 = zs0Var3.d;
                                                bw0Var2.U0(bw0Var2.x1, bw0Var2.l1, intValue);
                                                break;
                                            case 1:
                                                bw0 bw0Var3 = zs0Var3.d;
                                                bw0Var3.W0(bw0Var3.x1, bw0Var3.l1, intValue);
                                                break;
                                            case 2:
                                                zs0Var3.d.m1(intValue);
                                                break;
                                            default:
                                                bw0 bw0Var4 = zs0Var3.d;
                                                bw0Var4.V0(bw0Var4.x1, bw0Var4.l1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i14 = 3;
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() { // from class: org.telegram.ui.Components.xs0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                bw0 bw0Var2 = zs0Var3.d;
                                                bw0Var2.U0(bw0Var2.x1, bw0Var2.l1, intValue);
                                                break;
                                            case 1:
                                                bw0 bw0Var3 = zs0Var3.d;
                                                bw0Var3.W0(bw0Var3.x1, bw0Var3.l1, intValue);
                                                break;
                                            case 2:
                                                zs0Var3.d.m1(intValue);
                                                break;
                                            default:
                                                bw0 bw0Var4 = zs0Var3.d;
                                                bw0Var4.V0(bw0Var4.x1, bw0Var4.l1, intValue);
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
                }
                return Boolean.FALSE;
            }
        });
        final int i11 = 1;
        n10.setOnTabLongClick(new Utilities.Callback2Return() { // from class: org.telegram.ui.k11
            @Override // org.telegram.messenger.Utilities.Callback2Return
            public final Object run(Object obj, Object obj2) {
                di.h7 storiesController;
                Integer num = (Integer) obj;
                switch (i11) {
                    case 0:
                        if (!at0Var.f) {
                            if (num.intValue() != -1) {
                                break;
                            } else {
                                org.telegram.ui.Components.zs0 zs0Var2 = zs0Var;
                                org.telegram.ui.Components.g5.R(zs0Var2.a, zs0Var2.b, zs0Var2.c, new org.telegram.ui.Components.tv(zs0Var2, 22));
                                break;
                            }
                        } else {
                            break;
                        }
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !at0Var.f) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.zs0 zs0Var3 = zs0Var;
                            org.telegram.ui.Components.bw0 bw0Var = zs0Var3.d;
                            org.telegram.ui.ActionBar.r2 r2Var = bw0Var.x1;
                            storiesController = bw0Var.getStoriesController();
                            if (storiesController.i(bw0Var.l1)) {
                                org.telegram.ui.Components.l80 H = org.telegram.ui.Components.l80.H(r2Var, view);
                                H.W(new org.telegram.ui.Components.ys0(zs0Var3));
                                final int i112 = 0;
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() { // from class: org.telegram.ui.Components.xs0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i112) {
                                            case 0:
                                                bw0 bw0Var2 = zs0Var3.d;
                                                bw0Var2.U0(bw0Var2.x1, bw0Var2.l1, intValue);
                                                break;
                                            case 1:
                                                bw0 bw0Var3 = zs0Var3.d;
                                                bw0Var3.W0(bw0Var3.x1, bw0Var3.l1, intValue);
                                                break;
                                            case 2:
                                                zs0Var3.d.m1(intValue);
                                                break;
                                            default:
                                                bw0 bw0Var4 = zs0Var3.d;
                                                bw0Var4.V0(bw0Var4.x1, bw0Var4.l1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                bw0Var.A(new jg.s0(H, 22), r2Var, bw0Var.l1, intValue);
                                final int i12 = 1;
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() { // from class: org.telegram.ui.Components.xs0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                bw0 bw0Var2 = zs0Var3.d;
                                                bw0Var2.U0(bw0Var2.x1, bw0Var2.l1, intValue);
                                                break;
                                            case 1:
                                                bw0 bw0Var3 = zs0Var3.d;
                                                bw0Var3.W0(bw0Var3.x1, bw0Var3.l1, intValue);
                                                break;
                                            case 2:
                                                zs0Var3.d.m1(intValue);
                                                break;
                                            default:
                                                bw0 bw0Var4 = zs0Var3.d;
                                                bw0Var4.V0(bw0Var4.x1, bw0Var4.l1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i13 = 2;
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() { // from class: org.telegram.ui.Components.xs0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                bw0 bw0Var2 = zs0Var3.d;
                                                bw0Var2.U0(bw0Var2.x1, bw0Var2.l1, intValue);
                                                break;
                                            case 1:
                                                bw0 bw0Var3 = zs0Var3.d;
                                                bw0Var3.W0(bw0Var3.x1, bw0Var3.l1, intValue);
                                                break;
                                            case 2:
                                                zs0Var3.d.m1(intValue);
                                                break;
                                            default:
                                                bw0 bw0Var4 = zs0Var3.d;
                                                bw0Var4.V0(bw0Var4.x1, bw0Var4.l1, intValue);
                                                break;
                                        }
                                    }
                                }, false);
                                final int i14 = 3;
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() { // from class: org.telegram.ui.Components.xs0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                bw0 bw0Var2 = zs0Var3.d;
                                                bw0Var2.U0(bw0Var2.x1, bw0Var2.l1, intValue);
                                                break;
                                            case 1:
                                                bw0 bw0Var3 = zs0Var3.d;
                                                bw0Var3.W0(bw0Var3.x1, bw0Var3.l1, intValue);
                                                break;
                                            case 2:
                                                zs0Var3.d.m1(intValue);
                                                break;
                                            default:
                                                bw0 bw0Var4 = zs0Var3.d;
                                                bw0Var4.V0(bw0Var4.x1, bw0Var4.l1, intValue);
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
                }
                return Boolean.FALSE;
            }
        });
        addView(n10, org.telegram.ui.Components.kb1.i(-1, 42, 48));
        c(!v6Var.h.isEmpty(), false, true);
    }

    public final void a() {
        org.telegram.ui.Components.u91 u91Var = this.b;
        int currentTabId = u91Var != null ? u91Var.getCurrentTabId() : 0;
        di.v6 v6Var = this.c;
        boolean a2 = v6Var.a();
        m11 m11Var = this.d;
        m11Var.a = a2;
        this.a.o(true);
        c(!v6Var.h.isEmpty(), true, false);
        int i10 = this.e;
        if (i10 > 0) {
            if (m11Var.i(i10) != -1) {
                AndroidUtilities.runOnUIThread(new l11(this, this.e, 1), 500L);
                this.e = 0;
                return;
            }
            return;
        }
        if (u91Var == null || currentTabId <= 0 || v6Var.b(currentTabId) != null) {
            return;
        }
        u91Var.d(0, 0);
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
            this.h.setInterpolator(org.telegram.ui.Components.ds.h);
            this.h.addUpdateListener(new b3(this, 29));
            this.h.start();
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storyAlbumsCollectionsUpdate && ((Long) objArr[0]).longValue() == this.c.b) {
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
        di.v6 v6Var = this.c;
        NotificationCenter.getInstance(v6Var.a).addWeakObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
        if (this.r == v6Var.h.isEmpty() || this.d.a != v6Var.a()) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.c.a).removeObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int measuredWidth = getMeasuredWidth();
        int visualHeight = (int) getVisualHeight();
        Rect rect = this.s;
        rect.set(0, 0, measuredWidth, visualHeight);
        setClipBounds(rect);
    }

    public void setInitialTabId(int i10) {
        if (this.d.i(i10) != -1) {
            AndroidUtilities.runOnUIThread(new l11(this, i10, 0), 500L);
        } else {
            this.e = i10;
        }
    }

    public void setReorderingAlbums(boolean z10) {
        if (this.f == z10) {
            return;
        }
        this.f = z10;
        org.telegram.ui.Components.u91 u91Var = this.b;
        u91Var.setReordering(z10);
        boolean z11 = this.f;
        org.telegram.ui.Components.at0 at0Var = (org.telegram.ui.Components.at0) this;
        org.telegram.ui.Components.bw0 bw0Var = at0Var.w;
        TextView textView = bw0Var.s0;
        textView.setVisibility(0);
        textView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.4f).scaleY(z11 ? 1.0f : 0.4f).withEndAction(new org.telegram.ui.Components.d60(5, at0Var, z11)).start();
        bw0Var.C1(true);
        if (z10) {
            org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
            if (U instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) U;
                profileActivity.O4(false);
                AndroidUtilities.runOnUIThread(new hb0(profileActivity, 28));
            }
        }
        if (z10) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.v);
        di.v6 v6Var = this.c;
        v6Var.e();
        v6Var.f(false);
        int currentPosition = u91Var.getCurrentPosition();
        m11 m11Var = this.d;
        int f7 = m11Var.f(currentPosition);
        this.a.o(true);
        int i10 = m11Var.i(f7);
        u91Var.e(0.0f, i10, i10);
    }
}
