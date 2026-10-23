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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class ua0 extends xv0 {
    public AnimatorSet i2;
    public final /* synthetic */ FrameLayout j2;
    public final /* synthetic */ ra0 k2;
    public final /* synthetic */ xa0 l2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua0(xa0 xa0Var, Context context, long j10, pv0 pv0Var, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i10, xa0 xa0Var2, ta0 ta0Var, org.telegram.ui.ActionBar.g6 g6Var, FrameLayout frameLayout, ra0 ra0Var) {
        super(context, j10, pv0Var, 0, null, chatFull, userFull, i10, 0, xa0Var2, ta0Var, 0, g6Var, null);
        this.l2 = xa0Var;
        this.j2 = frameLayout;
        this.k2 = ra0Var;
    }

    @Override // org.telegram.ui.Components.xv0
    public final boolean E() {
        int i10 = this.l2.a;
        return (i10 == 1 || i10 == 2) ? false : true;
    }

    @Override // org.telegram.ui.Components.xv0
    public final void G0(SparseArray sparseArray) {
        int size = sparseArray.size();
        xa0 xa0Var = this.l2;
        xa0Var.I = sparseArray;
        int i10 = xa0Var.a;
        if (i10 == 1 || i10 == 2) {
            xa0Var.F.a();
            xa0Var.F.c(LocaleController.formatPluralString("StoriesSelected", size, new Object[0]), !LocaleController.isRTL, true);
            ei.d dVar = xa0Var.T;
            if (dVar != null) {
                dVar.setEnabled(size > 0);
                xa0Var.T.b(size, true);
                if (xa0Var.V.getClosestTab() == 8) {
                    xa0Var.T.i(LocaleController.formatPluralString("ArchiveStories", size, new Object[0]), true, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.xv0
    public final void N0(boolean z10) {
        int i10;
        xa0 xa0Var = this.l2;
        Activity parentActivity = xa0Var.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.o2) xa0Var).classGuid;
        AndroidUtilities.removeAdjustResize(parentActivity, i10);
        AndroidUtilities.updateViewVisibilityAnimated(this.j2, !z10, 0.95f, true);
    }

    @Override // org.telegram.ui.Components.xv0
    public final boolean O() {
        int i10 = this.l2.a;
        return i10 == 1 || i10 == 2 || i10 == 3;
    }

    @Override // org.telegram.ui.Components.xv0
    public final void O0() {
        super.O0();
        this.l2.a0();
    }

    @Override // org.telegram.ui.Components.xv0
    public final void P0(float f7) {
        xa0 xa0Var = this.l2;
        if (xa0Var.a != 1) {
            return;
        }
        float f10 = f7 - 8.0f;
        wa0 wa0Var = xa0Var.R;
        if (wa0Var != null) {
            wa0Var.setProgress(f10);
        }
        float f11 = 1.0f - f10;
        xa0Var.v[0].setAlpha(f11);
        xa0Var.v[0].setTranslationX(AndroidUtilities.dp(-12.0f) * f10);
        xa0Var.v[1].setAlpha(f10);
        xa0Var.v[1].setTranslationX(AndroidUtilities.dp(12.0f) * f11);
    }

    @Override // org.telegram.ui.Components.xv0
    public final void Q(Canvas canvas, float f7, Rect rect, Paint paint) {
        this.k2.I(canvas, getY() + f7, rect, paint, true);
    }

    @Override // org.telegram.ui.Components.xv0
    public final void Q0(boolean z10) {
        wa0 wa0Var = this.l2.R;
        if (wa0Var != null) {
            wa0Var.setScrolling(z10);
        }
    }

    @Override // org.telegram.ui.Components.xv0
    public final void e1(boolean z10) {
        xa0 xa0Var = this.l2;
        if (xa0Var.a == 0) {
            super.e1(z10);
            return;
        }
        if (this.C1 == z10) {
            return;
        }
        this.C1 = z10;
        AnimatorSet animatorSet = this.i2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        int i10 = xa0Var.a;
        if (i10 == 1 || i10 == 2) {
            if (z10) {
                j1(null);
            }
            this.M1 = z10;
        }
        if (z10) {
            xa0Var.F.setVisibility(0);
            FrameLayout frameLayout = xa0Var.S;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
        } else {
            xa0Var.s.setVisibility(0);
        }
        float f7 = 0.0f;
        xa0Var.E.c(z10 ? 1.0f : 0.0f, true);
        this.i2 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        q6 q6Var = xa0Var.F;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(q6Var, (Property<q6, Float>) property, fArr));
        arrayList.add(ObjectAnimator.ofFloat(xa0Var.s, (Property<FrameLayout, Float>) property, z10 ? 0.0f : 1.0f));
        FrameLayout frameLayout2 = xa0Var.S;
        if (frameLayout2 != null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(xa0Var.S, (Property<FrameLayout, Float>) View.TRANSLATION_Y, z10 ? 0.0f : r6.getMeasuredHeight()));
        }
        org.telegram.ui.ActionBar.u0 u0Var = xa0Var.H;
        if (u0Var != null) {
            u0Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(xa0Var.H, (Property<org.telegram.ui.ActionBar.u0, Float>) property, z10 ? 1.0f : 0.0f));
        }
        boolean z11 = d0(getClosestTab()) == 0;
        org.telegram.ui.ActionBar.u0 u0Var2 = xa0Var.G;
        if (u0Var2 != null) {
            u0Var2.setVisibility(0);
            org.telegram.ui.ActionBar.u0 u0Var3 = xa0Var.G;
            if (!z10 && !z11) {
                f7 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(u0Var3, (Property<org.telegram.ui.ActionBar.u0, Float>) property, f7));
        }
        wa0 wa0Var = xa0Var.R;
        if (wa0Var != null) {
            arrayList.add(ObjectAnimator.ofFloat(wa0Var, (Property<wa0, Float>) property, z10 ? 0.4f : 1.0f));
        }
        this.i2.playTogether(arrayList);
        this.i2.setDuration(300L);
        this.i2.setInterpolator(bs.h);
        this.i2.addListener(new org.telegram.ui.ActionBar.g(this, z10, z11, 4));
        this.i2.start();
    }

    @Override // org.telegram.ui.Components.xv0
    public final int getInitialTab() {
        return this.l2.W;
    }

    @Override // org.telegram.ui.Components.xv0
    public final String getStoriesHashtag() {
        return this.l2.h;
    }

    @Override // org.telegram.ui.Components.xv0
    public final String getStoriesHashtagUsername() {
        return this.l2.n;
    }

    @Override // org.telegram.ui.Components.xv0
    public final boolean n0() {
        xa0 xa0Var = this.l2;
        return xa0Var.a == 0 && xa0Var.e == xa0Var.getUserConfig().getClientUserId() && xa0Var.f == 0;
    }

    @Override // org.telegram.ui.Components.xv0
    public final boolean o0() {
        int i10 = this.l2.a;
        return i10 == 1 || i10 == 2;
    }

    @Override // org.telegram.ui.Components.xv0
    public final void q0() {
        this.k2.L();
    }

    @Override // org.telegram.ui.Components.xv0
    public final boolean s0() {
        return this.l2.a == 2;
    }

    @Override // org.telegram.ui.Components.xv0
    public final boolean y0() {
        int i10 = this.l2.a;
        return i10 == 1 || i10 == 2;
    }
}
