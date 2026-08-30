package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class aa0 extends yu0 {
    public AnimatorSet c2;
    public final /* synthetic */ FrameLayout d2;
    public final /* synthetic */ x90 e2;
    public final /* synthetic */ da0 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa0(da0 da0Var, Context context, long j10, qu0 qu0Var, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i10, da0 da0Var2, z90 z90Var, org.telegram.ui.ActionBar.f6 f6Var, FrameLayout frameLayout, x90 x90Var) {
        super(context, j10, qu0Var, 0, null, chatFull, userFull, i10, 0, da0Var2, z90Var, 0, f6Var, null);
        this.f2 = da0Var;
        this.d2 = frameLayout;
        this.e2 = x90Var;
    }

    @Override // org.telegram.ui.Components.yu0
    public final boolean D() {
        int i10 = this.f2.a;
        return (i10 == 1 || i10 == 2) ? false : true;
    }

    @Override // org.telegram.ui.Components.yu0
    public final void D0(SparseArray sparseArray) {
        int size = sparseArray.size();
        da0 da0Var = this.f2;
        da0Var.F = sparseArray;
        int i10 = da0Var.a;
        if (i10 == 1 || i10 == 2) {
            da0Var.C.a();
            da0Var.C.c(LocaleController.formatPluralString("StoriesSelected", size, new Object[0]), !LocaleController.isRTL, true);
            ph.d dVar = da0Var.Q;
            if (dVar != null) {
                dVar.setEnabled(size > 0);
                da0Var.Q.c(size, true);
                if (da0Var.S.getClosestTab() == 8) {
                    da0Var.Q.g(LocaleController.formatPluralString("ArchiveStories", size, new Object[0]), true, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.yu0
    public final void K0(boolean z4) {
        int i10;
        da0 da0Var = this.f2;
        Activity parentActivity = da0Var.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.p2) da0Var).classGuid;
        AndroidUtilities.removeAdjustResize(parentActivity, i10);
        AndroidUtilities.updateViewVisibilityAnimated(this.d2, !z4, 0.95f, true);
    }

    @Override // org.telegram.ui.Components.yu0
    public final void L0() {
        super.L0();
        this.f2.a0();
    }

    @Override // org.telegram.ui.Components.yu0
    public final void M0(float f10) {
        da0 da0Var = this.f2;
        if (da0Var.a != 1) {
            return;
        }
        float f11 = f10 - 8.0f;
        ca0 ca0Var = da0Var.O;
        if (ca0Var != null) {
            ca0Var.setProgress(f11);
        }
        float f12 = 1.0f - f11;
        da0Var.v[0].setAlpha(f12);
        da0Var.v[0].setTranslationX(AndroidUtilities.dp(-12.0f) * f11);
        da0Var.v[1].setAlpha(f11);
        da0Var.v[1].setTranslationX(AndroidUtilities.dp(12.0f) * f12);
    }

    @Override // org.telegram.ui.Components.yu0
    public final boolean N() {
        int i10 = this.f2.a;
        return i10 == 1 || i10 == 2 || i10 == 3;
    }

    @Override // org.telegram.ui.Components.yu0
    public final void N0(boolean z4) {
        ca0 ca0Var = this.f2.O;
        if (ca0Var != null) {
            ca0Var.setScrolling(z4);
        }
    }

    @Override // org.telegram.ui.Components.yu0
    public final void P(Canvas canvas, float f10, Rect rect, Paint paint) {
        this.e2.J(canvas, getY() + f10, rect, paint, true);
    }

    @Override // org.telegram.ui.Components.yu0
    public final void b1(boolean z4) {
        da0 da0Var = this.f2;
        if (da0Var.a == 0) {
            super.b1(z4);
            return;
        }
        if (this.z1 == z4) {
            return;
        }
        this.z1 = z4;
        AnimatorSet animatorSet = this.c2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        int i10 = da0Var.a;
        if (i10 == 1 || i10 == 2) {
            if (z4) {
                g1(null);
            }
            this.I1 = z4;
        }
        if (z4) {
            da0Var.C.setVisibility(0);
            FrameLayout frameLayout = da0Var.P;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
        } else {
            da0Var.s.setVisibility(0);
        }
        float f10 = 0.0f;
        da0Var.B.c(z4 ? 1.0f : 0.0f, true);
        this.c2 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        k6 k6Var = da0Var.C;
        float[] fArr = {z4 ? 1.0f : 0.0f};
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(k6Var, (Property<k6, Float>) property, fArr));
        arrayList.add(ObjectAnimator.ofFloat(da0Var.s, (Property<FrameLayout, Float>) property, z4 ? 0.0f : 1.0f));
        FrameLayout frameLayout2 = da0Var.P;
        if (frameLayout2 != null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property, z4 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(da0Var.P, (Property<FrameLayout, Float>) View.TRANSLATION_Y, z4 ? 0.0f : r6.getMeasuredHeight()));
        }
        org.telegram.ui.ActionBar.w0 w0Var = da0Var.E;
        if (w0Var != null) {
            w0Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(da0Var.E, (Property<org.telegram.ui.ActionBar.w0, Float>) property, z4 ? 1.0f : 0.0f));
        }
        boolean z10 = c0(getClosestTab()) == 0;
        org.telegram.ui.ActionBar.w0 w0Var2 = da0Var.D;
        if (w0Var2 != null) {
            w0Var2.setVisibility(0);
            org.telegram.ui.ActionBar.w0 w0Var3 = da0Var.D;
            if (!z4 && !z10) {
                f10 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(w0Var3, (Property<org.telegram.ui.ActionBar.w0, Float>) property, f10));
        }
        ca0 ca0Var = da0Var.O;
        if (ca0Var != null) {
            arrayList.add(ObjectAnimator.ofFloat(ca0Var, (Property<ca0, Float>) property, z4 ? 0.4f : 1.0f));
        }
        this.c2.playTogether(arrayList);
        this.c2.setDuration(300L);
        this.c2.setInterpolator(nr.h);
        this.c2.addListener(new org.telegram.ui.ActionBar.g(this, z4, z10, 4));
        this.c2.start();
    }

    @Override // org.telegram.ui.Components.yu0
    public final int getInitialTab() {
        return this.f2.T;
    }

    @Override // org.telegram.ui.Components.yu0
    public final String getStoriesHashtag() {
        return this.f2.h;
    }

    @Override // org.telegram.ui.Components.yu0
    public final String getStoriesHashtagUsername() {
        return this.f2.n;
    }

    @Override // org.telegram.ui.Components.yu0
    public final boolean l0() {
        da0 da0Var = this.f2;
        return da0Var.a == 0 && da0Var.e == da0Var.getUserConfig().getClientUserId() && da0Var.f == 0;
    }

    @Override // org.telegram.ui.Components.yu0
    public final boolean m0() {
        int i10 = this.f2.a;
        return i10 == 1 || i10 == 2;
    }

    @Override // org.telegram.ui.Components.yu0
    public final void o0() {
        this.e2.M();
    }

    @Override // org.telegram.ui.Components.yu0
    public final boolean q0() {
        return this.f2.a == 2;
    }

    @Override // org.telegram.ui.Components.yu0
    public final boolean v0() {
        int i10 = this.f2.a;
        return i10 == 1 || i10 == 2;
    }
}
