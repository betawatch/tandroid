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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class ta0 extends sv0 {
    public AnimatorSet f2;
    public final /* synthetic */ FrameLayout g2;
    public final /* synthetic */ qa0 h2;
    public final /* synthetic */ wa0 i2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta0(wa0 wa0Var, Context context, long j10, kv0 kv0Var, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i10, wa0 wa0Var2, sa0 sa0Var, org.telegram.ui.ActionBar.d6 d6Var, FrameLayout frameLayout, qa0 qa0Var) {
        super(context, j10, kv0Var, 0, null, chatFull, userFull, i10, 0, wa0Var2, sa0Var, 0, d6Var, null);
        this.i2 = wa0Var;
        this.g2 = frameLayout;
        this.h2 = qa0Var;
    }

    @Override // org.telegram.ui.Components.sv0
    public final boolean D() {
        int i10 = this.i2.a;
        return (i10 == 1 || i10 == 2) ? false : true;
    }

    @Override // org.telegram.ui.Components.sv0
    public final void F0(SparseArray sparseArray) {
        int size = sparseArray.size();
        wa0 wa0Var = this.i2;
        wa0Var.I = sparseArray;
        int i10 = wa0Var.a;
        if (i10 == 1 || i10 == 2) {
            wa0Var.F.a();
            wa0Var.F.c(LocaleController.formatPluralString("StoriesSelected", size, new Object[0]), !LocaleController.isRTL, true);
            ei.d dVar = wa0Var.T;
            if (dVar != null) {
                dVar.setEnabled(size > 0);
                wa0Var.T.b(size, true);
                if (wa0Var.V.getClosestTab() == 8) {
                    wa0Var.T.g(LocaleController.formatPluralString("ArchiveStories", size, new Object[0]), true, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.sv0
    public final void M0(boolean z10) {
        int i10;
        wa0 wa0Var = this.i2;
        Activity parentActivity = wa0Var.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) wa0Var).classGuid;
        AndroidUtilities.removeAdjustResize(parentActivity, i10);
        AndroidUtilities.updateViewVisibilityAnimated(this.g2, !z10, 0.95f, true);
    }

    @Override // org.telegram.ui.Components.sv0
    public final boolean N() {
        int i10 = this.i2.a;
        return i10 == 1 || i10 == 2 || i10 == 3;
    }

    @Override // org.telegram.ui.Components.sv0
    public final void N0() {
        super.N0();
        this.i2.a0();
    }

    @Override // org.telegram.ui.Components.sv0
    public final void O0(float f7) {
        wa0 wa0Var = this.i2;
        if (wa0Var.a != 1) {
            return;
        }
        float f10 = f7 - 8.0f;
        va0 va0Var = wa0Var.R;
        if (va0Var != null) {
            va0Var.setProgress(f10);
        }
        float f11 = 1.0f - f10;
        wa0Var.v[0].setAlpha(f11);
        wa0Var.v[0].setTranslationX(AndroidUtilities.dp(-12.0f) * f10);
        wa0Var.v[1].setAlpha(f10);
        wa0Var.v[1].setTranslationX(AndroidUtilities.dp(12.0f) * f11);
    }

    @Override // org.telegram.ui.Components.sv0
    public final void P(Canvas canvas, float f7, Rect rect, Paint paint) {
        this.h2.J(canvas, getY() + f7, rect, paint, true);
    }

    @Override // org.telegram.ui.Components.sv0
    public final void P0(boolean z10) {
        va0 va0Var = this.i2.R;
        if (va0Var != null) {
            va0Var.setScrolling(z10);
        }
    }

    @Override // org.telegram.ui.Components.sv0
    public final void d1(boolean z10) {
        wa0 wa0Var = this.i2;
        if (wa0Var.a == 0) {
            super.d1(z10);
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
        int i10 = wa0Var.a;
        if (i10 == 1 || i10 == 2) {
            if (z10) {
                i1(null);
            }
            this.L1 = z10;
        }
        if (z10) {
            wa0Var.F.setVisibility(0);
            FrameLayout frameLayout = wa0Var.S;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
        } else {
            wa0Var.s.setVisibility(0);
        }
        float f7 = 0.0f;
        wa0Var.E.c(z10 ? 1.0f : 0.0f, true);
        this.f2 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        q6 q6Var = wa0Var.F;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(q6Var, (Property<q6, Float>) property, fArr));
        arrayList.add(ObjectAnimator.ofFloat(wa0Var.s, (Property<FrameLayout, Float>) property, z10 ? 0.0f : 1.0f));
        FrameLayout frameLayout2 = wa0Var.S;
        if (frameLayout2 != null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(wa0Var.S, (Property<FrameLayout, Float>) View.TRANSLATION_Y, z10 ? 0.0f : r6.getMeasuredHeight()));
        }
        org.telegram.ui.ActionBar.u0 u0Var = wa0Var.H;
        if (u0Var != null) {
            u0Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(wa0Var.H, (Property<org.telegram.ui.ActionBar.u0, Float>) property, z10 ? 1.0f : 0.0f));
        }
        boolean z11 = c0(getClosestTab()) == 0;
        org.telegram.ui.ActionBar.u0 u0Var2 = wa0Var.G;
        if (u0Var2 != null) {
            u0Var2.setVisibility(0);
            org.telegram.ui.ActionBar.u0 u0Var3 = wa0Var.G;
            if (!z10 && !z11) {
                f7 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(u0Var3, (Property<org.telegram.ui.ActionBar.u0, Float>) property, f7));
        }
        va0 va0Var = wa0Var.R;
        if (va0Var != null) {
            arrayList.add(ObjectAnimator.ofFloat(va0Var, (Property<va0, Float>) property, z10 ? 0.4f : 1.0f));
        }
        this.f2.playTogether(arrayList);
        this.f2.setDuration(300L);
        this.f2.setInterpolator(bs.h);
        this.f2.addListener(new org.telegram.ui.ActionBar.g(this, z10, z11, 4));
        this.f2.start();
    }

    @Override // org.telegram.ui.Components.sv0
    public final int getInitialTab() {
        return this.i2.W;
    }

    @Override // org.telegram.ui.Components.sv0
    public final String getStoriesHashtag() {
        return this.i2.h;
    }

    @Override // org.telegram.ui.Components.sv0
    public final String getStoriesHashtagUsername() {
        return this.i2.n;
    }

    @Override // org.telegram.ui.Components.sv0
    public final boolean m0() {
        wa0 wa0Var = this.i2;
        return wa0Var.a == 0 && wa0Var.e == wa0Var.getUserConfig().getClientUserId() && wa0Var.f == 0;
    }

    @Override // org.telegram.ui.Components.sv0
    public final boolean n0() {
        int i10 = this.i2.a;
        return i10 == 1 || i10 == 2;
    }

    @Override // org.telegram.ui.Components.sv0
    public final void p0() {
        this.h2.M();
    }

    @Override // org.telegram.ui.Components.sv0
    public final boolean r0() {
        return this.i2.a == 2;
    }

    @Override // org.telegram.ui.Components.sv0
    public final boolean x0() {
        int i10 = this.i2.a;
        return i10 == 1 || i10 == 2;
    }
}
