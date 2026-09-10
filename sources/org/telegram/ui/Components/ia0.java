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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ia0 extends iv0 {
    public AnimatorSet f2;
    public final /* synthetic */ FrameLayout g2;
    public final /* synthetic */ fa0 h2;
    public final /* synthetic */ la0 i2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia0(la0 la0Var, Context context, long j3, av0 av0Var, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i10, la0 la0Var2, ha0 ha0Var, org.telegram.ui.ActionBar.f6 f6Var, FrameLayout frameLayout, fa0 fa0Var) {
        super(context, j3, av0Var, 0, null, chatFull, userFull, i10, 0, la0Var2, ha0Var, 0, f6Var, null);
        this.i2 = la0Var;
        this.g2 = frameLayout;
        this.h2 = fa0Var;
    }

    @Override // org.telegram.ui.Components.iv0
    public final boolean D() {
        int i10 = this.i2.a;
        return (i10 == 1 || i10 == 2) ? false : true;
    }

    @Override // org.telegram.ui.Components.iv0
    public final void D0(SparseArray sparseArray) {
        int size = sparseArray.size();
        la0 la0Var = this.i2;
        la0Var.I = sparseArray;
        int i10 = la0Var.a;
        if (i10 == 1 || i10 == 2) {
            la0Var.F.a();
            la0Var.F.c(LocaleController.formatPluralString("StoriesSelected", size, new Object[0]), !LocaleController.isRTL, true);
            bi.d dVar = la0Var.T;
            if (dVar != null) {
                dVar.setEnabled(size > 0);
                la0Var.T.b(size, true);
                if (la0Var.V.getClosestTab() == 8) {
                    la0Var.T.g(LocaleController.formatPluralString("ArchiveStories", size, new Object[0]), true, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.iv0
    public final void K0(boolean z10) {
        int i10;
        la0 la0Var = this.i2;
        Activity parentActivity = la0Var.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.p2) la0Var).classGuid;
        AndroidUtilities.removeAdjustResize(parentActivity, i10);
        AndroidUtilities.updateViewVisibilityAnimated(this.g2, !z10, 0.95f, true);
    }

    @Override // org.telegram.ui.Components.iv0
    public final void L0() {
        super.L0();
        this.i2.a0();
    }

    @Override // org.telegram.ui.Components.iv0
    public final void M0(float f7) {
        la0 la0Var = this.i2;
        if (la0Var.a != 1) {
            return;
        }
        float f10 = f7 - 8.0f;
        ka0 ka0Var = la0Var.R;
        if (ka0Var != null) {
            ka0Var.setProgress(f10);
        }
        float f11 = 1.0f - f10;
        la0Var.v[0].setAlpha(f11);
        la0Var.v[0].setTranslationX(AndroidUtilities.dp(-12.0f) * f10);
        la0Var.v[1].setAlpha(f10);
        la0Var.v[1].setTranslationX(AndroidUtilities.dp(12.0f) * f11);
    }

    @Override // org.telegram.ui.Components.iv0
    public final boolean N() {
        int i10 = this.i2.a;
        return i10 == 1 || i10 == 2 || i10 == 3;
    }

    @Override // org.telegram.ui.Components.iv0
    public final void N0(boolean z10) {
        ka0 ka0Var = this.i2.R;
        if (ka0Var != null) {
            ka0Var.setScrolling(z10);
        }
    }

    @Override // org.telegram.ui.Components.iv0
    public final void P(Canvas canvas, float f7, Rect rect, Paint paint) {
        this.h2.J(canvas, getY() + f7, rect, paint, true);
    }

    @Override // org.telegram.ui.Components.iv0
    public final void b1(boolean z10) {
        la0 la0Var = this.i2;
        if (la0Var.a == 0) {
            super.b1(z10);
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
        int i10 = la0Var.a;
        if (i10 == 1 || i10 == 2) {
            if (z10) {
                g1(null);
            }
            this.L1 = z10;
        }
        if (z10) {
            la0Var.F.setVisibility(0);
            FrameLayout frameLayout = la0Var.S;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
        } else {
            la0Var.s.setVisibility(0);
        }
        float f7 = 0.0f;
        la0Var.E.c(z10 ? 1.0f : 0.0f, true);
        this.f2 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        o6 o6Var = la0Var.F;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(o6Var, (Property<o6, Float>) property, fArr));
        arrayList.add(ObjectAnimator.ofFloat(la0Var.s, (Property<FrameLayout, Float>) property, z10 ? 0.0f : 1.0f));
        FrameLayout frameLayout2 = la0Var.S;
        if (frameLayout2 != null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(la0Var.S, (Property<FrameLayout, Float>) View.TRANSLATION_Y, z10 ? 0.0f : r6.getMeasuredHeight()));
        }
        org.telegram.ui.ActionBar.w0 w0Var = la0Var.H;
        if (w0Var != null) {
            w0Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(la0Var.H, (Property<org.telegram.ui.ActionBar.w0, Float>) property, z10 ? 1.0f : 0.0f));
        }
        boolean z11 = c0(getClosestTab()) == 0;
        org.telegram.ui.ActionBar.w0 w0Var2 = la0Var.G;
        if (w0Var2 != null) {
            w0Var2.setVisibility(0);
            org.telegram.ui.ActionBar.w0 w0Var3 = la0Var.G;
            if (!z10 && !z11) {
                f7 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(w0Var3, (Property<org.telegram.ui.ActionBar.w0, Float>) property, f7));
        }
        ka0 ka0Var = la0Var.R;
        if (ka0Var != null) {
            arrayList.add(ObjectAnimator.ofFloat(ka0Var, (Property<ka0, Float>) property, z10 ? 0.4f : 1.0f));
        }
        this.f2.playTogether(arrayList);
        this.f2.setDuration(300L);
        this.f2.setInterpolator(wr.h);
        this.f2.addListener(new org.telegram.ui.ActionBar.g(this, z10, z11, 4));
        this.f2.start();
    }

    @Override // org.telegram.ui.Components.iv0
    public final int getInitialTab() {
        return this.i2.W;
    }

    @Override // org.telegram.ui.Components.iv0
    public final String getStoriesHashtag() {
        return this.i2.h;
    }

    @Override // org.telegram.ui.Components.iv0
    public final String getStoriesHashtagUsername() {
        return this.i2.n;
    }

    @Override // org.telegram.ui.Components.iv0
    public final boolean l0() {
        la0 la0Var = this.i2;
        return la0Var.a == 0 && la0Var.e == la0Var.getUserConfig().getClientUserId() && la0Var.f == 0;
    }

    @Override // org.telegram.ui.Components.iv0
    public final boolean m0() {
        int i10 = this.i2.a;
        return i10 == 1 || i10 == 2;
    }

    @Override // org.telegram.ui.Components.iv0
    public final void o0() {
        this.h2.M();
    }

    @Override // org.telegram.ui.Components.iv0
    public final boolean q0() {
        return this.i2.a == 2;
    }

    @Override // org.telegram.ui.Components.iv0
    public final boolean v0() {
        int i10 = this.i2.a;
        return i10 == 1 || i10 == 2;
    }
}
