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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class za0 extends xv0 {
    public AnimatorSet f2;
    public final /* synthetic */ FrameLayout g2;
    public final /* synthetic */ wa0 h2;
    public final /* synthetic */ cb0 i2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za0(cb0 cb0Var, Context context, long j10, pv0 pv0Var, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i10, cb0 cb0Var2, ya0 ya0Var, org.telegram.ui.ActionBar.c6 c6Var, FrameLayout frameLayout, wa0 wa0Var) {
        super(context, j10, pv0Var, 0, null, chatFull, userFull, i10, 0, cb0Var2, ya0Var, 0, c6Var, null);
        this.i2 = cb0Var;
        this.g2 = frameLayout;
        this.h2 = wa0Var;
    }

    @Override // org.telegram.ui.Components.xv0
    public final boolean D() {
        int i10 = this.i2.a;
        return (i10 == 1 || i10 == 2) ? false : true;
    }

    @Override // org.telegram.ui.Components.xv0
    public final void E0(SparseArray sparseArray) {
        int size = sparseArray.size();
        cb0 cb0Var = this.i2;
        cb0Var.I = sparseArray;
        int i10 = cb0Var.a;
        if (i10 == 1 || i10 == 2) {
            cb0Var.F.a();
            cb0Var.F.c(LocaleController.formatPluralString("StoriesSelected", size, new Object[0]), !LocaleController.isRTL, true);
            di.d dVar = cb0Var.T;
            if (dVar != null) {
                dVar.setEnabled(size > 0);
                cb0Var.T.b(size, true);
                if (cb0Var.V.getClosestTab() == 8) {
                    cb0Var.T.g(LocaleController.formatPluralString("ArchiveStories", size, new Object[0]), true, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.xv0
    public final void L0(boolean z10) {
        int i10;
        cb0 cb0Var = this.i2;
        Activity parentActivity = cb0Var.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.m2) cb0Var).classGuid;
        AndroidUtilities.removeAdjustResize(parentActivity, i10);
        AndroidUtilities.updateViewVisibilityAnimated(this.g2, !z10, 0.95f, true);
    }

    @Override // org.telegram.ui.Components.xv0
    public final void M0() {
        super.M0();
        this.i2.a0();
    }

    @Override // org.telegram.ui.Components.xv0
    public final boolean N() {
        int i10 = this.i2.a;
        return i10 == 1 || i10 == 2 || i10 == 3;
    }

    @Override // org.telegram.ui.Components.xv0
    public final void N0(float f7) {
        cb0 cb0Var = this.i2;
        if (cb0Var.a != 1) {
            return;
        }
        float f10 = f7 - 8.0f;
        bb0 bb0Var = cb0Var.R;
        if (bb0Var != null) {
            bb0Var.setProgress(f10);
        }
        float f11 = 1.0f - f10;
        cb0Var.v[0].setAlpha(f11);
        cb0Var.v[0].setTranslationX(AndroidUtilities.dp(-12.0f) * f10);
        cb0Var.v[1].setAlpha(f10);
        cb0Var.v[1].setTranslationX(AndroidUtilities.dp(12.0f) * f11);
    }

    @Override // org.telegram.ui.Components.xv0
    public final void O0(boolean z10) {
        bb0 bb0Var = this.i2.R;
        if (bb0Var != null) {
            bb0Var.setScrolling(z10);
        }
    }

    @Override // org.telegram.ui.Components.xv0
    public final void P(Canvas canvas, float f7, Rect rect, Paint paint) {
        this.h2.J(canvas, getY() + f7, rect, paint, true);
    }

    @Override // org.telegram.ui.Components.xv0
    public final void c1(boolean z10) {
        cb0 cb0Var = this.i2;
        if (cb0Var.a == 0) {
            super.c1(z10);
            return;
        }
        if (this.C1 == z10) {
            return;
        }
        this.C1 = z10;
        AnimatorSet animatorSet = this.f2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        int i10 = cb0Var.a;
        if (i10 == 1 || i10 == 2) {
            if (z10) {
                h1(null);
            }
            this.L1 = z10;
        }
        if (z10) {
            cb0Var.F.setVisibility(0);
            FrameLayout frameLayout = cb0Var.S;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
        } else {
            cb0Var.s.setVisibility(0);
        }
        float f7 = 0.0f;
        cb0Var.E.c(z10 ? 1.0f : 0.0f, true);
        this.f2 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        s6 s6Var = cb0Var.F;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(s6Var, (Property<s6, Float>) property, fArr));
        arrayList.add(ObjectAnimator.ofFloat(cb0Var.s, (Property<FrameLayout, Float>) property, z10 ? 0.0f : 1.0f));
        FrameLayout frameLayout2 = cb0Var.S;
        if (frameLayout2 != null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(cb0Var.S, (Property<FrameLayout, Float>) View.TRANSLATION_Y, z10 ? 0.0f : r6.getMeasuredHeight()));
        }
        org.telegram.ui.ActionBar.u0 u0Var = cb0Var.H;
        if (u0Var != null) {
            u0Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(cb0Var.H, (Property<org.telegram.ui.ActionBar.u0, Float>) property, z10 ? 1.0f : 0.0f));
        }
        boolean z11 = c0(getClosestTab()) == 0;
        org.telegram.ui.ActionBar.u0 u0Var2 = cb0Var.G;
        if (u0Var2 != null) {
            u0Var2.setVisibility(0);
            org.telegram.ui.ActionBar.u0 u0Var3 = cb0Var.G;
            if (!z10 && !z11) {
                f7 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(u0Var3, (Property<org.telegram.ui.ActionBar.u0, Float>) property, f7));
        }
        bb0 bb0Var = cb0Var.R;
        if (bb0Var != null) {
            arrayList.add(ObjectAnimator.ofFloat(bb0Var, (Property<bb0, Float>) property, z10 ? 0.4f : 1.0f));
        }
        this.f2.playTogether(arrayList);
        this.f2.setDuration(300L);
        this.f2.setInterpolator(es.h);
        this.f2.addListener(new org.telegram.ui.ActionBar.g(this, z10, z11, 4));
        this.f2.start();
    }

    @Override // org.telegram.ui.Components.xv0
    public final int getInitialTab() {
        return this.i2.W;
    }

    @Override // org.telegram.ui.Components.xv0
    public final String getStoriesHashtag() {
        return this.i2.h;
    }

    @Override // org.telegram.ui.Components.xv0
    public final String getStoriesHashtagUsername() {
        return this.i2.n;
    }

    @Override // org.telegram.ui.Components.xv0
    public final boolean l0() {
        cb0 cb0Var = this.i2;
        return cb0Var.a == 0 && cb0Var.e == cb0Var.getUserConfig().getClientUserId() && cb0Var.f == 0;
    }

    @Override // org.telegram.ui.Components.xv0
    public final boolean m0() {
        int i10 = this.i2.a;
        return i10 == 1 || i10 == 2;
    }

    @Override // org.telegram.ui.Components.xv0
    public final void o0() {
        this.h2.M();
    }

    @Override // org.telegram.ui.Components.xv0
    public final boolean q0() {
        return this.i2.a == 2;
    }

    @Override // org.telegram.ui.Components.xv0
    public final boolean w0() {
        int i10 = this.i2.a;
        return i10 == 1 || i10 == 2;
    }
}
