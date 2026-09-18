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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class y90 extends zu0 {
    public AnimatorSet f2;
    public final /* synthetic */ FrameLayout g2;
    public final /* synthetic */ v90 h2;
    public final /* synthetic */ ba0 i2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y90(ba0 ba0Var, Context context, long j3, ru0 ru0Var, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i10, ba0 ba0Var2, x90 x90Var, org.telegram.ui.ActionBar.f6 f6Var, FrameLayout frameLayout, v90 v90Var) {
        super(context, j3, ru0Var, 0, null, chatFull, userFull, i10, 0, ba0Var2, x90Var, 0, f6Var, null);
        this.i2 = ba0Var;
        this.g2 = frameLayout;
        this.h2 = v90Var;
    }

    @Override // org.telegram.ui.Components.zu0
    public final boolean D() {
        int i10 = this.i2.a;
        return (i10 == 1 || i10 == 2) ? false : true;
    }

    @Override // org.telegram.ui.Components.zu0
    public final void D0(SparseArray sparseArray) {
        int size = sparseArray.size();
        ba0 ba0Var = this.i2;
        ba0Var.I = sparseArray;
        int i10 = ba0Var.a;
        if (i10 == 1 || i10 == 2) {
            ba0Var.F.a();
            ba0Var.F.c(LocaleController.formatPluralString("StoriesSelected", size, new Object[0]), !LocaleController.isRTL, true);
            ci.d dVar = ba0Var.T;
            if (dVar != null) {
                dVar.setEnabled(size > 0);
                ba0Var.T.b(size, true);
                if (ba0Var.V.getClosestTab() == 8) {
                    ba0Var.T.g(LocaleController.formatPluralString("ArchiveStories", size, new Object[0]), true, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.zu0
    public final void K0(boolean z10) {
        int i10;
        ba0 ba0Var = this.i2;
        Activity parentActivity = ba0Var.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.o2) ba0Var).classGuid;
        AndroidUtilities.removeAdjustResize(parentActivity, i10);
        AndroidUtilities.updateViewVisibilityAnimated(this.g2, !z10, 0.95f, true);
    }

    @Override // org.telegram.ui.Components.zu0
    public final void L0() {
        super.L0();
        this.i2.a0();
    }

    @Override // org.telegram.ui.Components.zu0
    public final void M0(float f7) {
        ba0 ba0Var = this.i2;
        if (ba0Var.a != 1) {
            return;
        }
        float f10 = f7 - 8.0f;
        aa0 aa0Var = ba0Var.R;
        if (aa0Var != null) {
            aa0Var.setProgress(f10);
        }
        float f11 = 1.0f - f10;
        ba0Var.v[0].setAlpha(f11);
        ba0Var.v[0].setTranslationX(AndroidUtilities.dp(-12.0f) * f10);
        ba0Var.v[1].setAlpha(f10);
        ba0Var.v[1].setTranslationX(AndroidUtilities.dp(12.0f) * f11);
    }

    @Override // org.telegram.ui.Components.zu0
    public final boolean N() {
        int i10 = this.i2.a;
        return i10 == 1 || i10 == 2 || i10 == 3;
    }

    @Override // org.telegram.ui.Components.zu0
    public final void N0(boolean z10) {
        aa0 aa0Var = this.i2.R;
        if (aa0Var != null) {
            aa0Var.setScrolling(z10);
        }
    }

    @Override // org.telegram.ui.Components.zu0
    public final void P(Canvas canvas, float f7, Rect rect, Paint paint) {
        this.h2.J(canvas, getY() + f7, rect, paint, true);
    }

    @Override // org.telegram.ui.Components.zu0
    public final void b1(boolean z10) {
        ba0 ba0Var = this.i2;
        if (ba0Var.a == 0) {
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
        int i10 = ba0Var.a;
        if (i10 == 1 || i10 == 2) {
            if (z10) {
                g1(null);
            }
            this.L1 = z10;
        }
        if (z10) {
            ba0Var.F.setVisibility(0);
            FrameLayout frameLayout = ba0Var.S;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
        } else {
            ba0Var.s.setVisibility(0);
        }
        float f7 = 0.0f;
        ba0Var.E.c(z10 ? 1.0f : 0.0f, true);
        this.f2 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        n6 n6Var = ba0Var.F;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(n6Var, (Property<n6, Float>) property, fArr));
        arrayList.add(ObjectAnimator.ofFloat(ba0Var.s, (Property<FrameLayout, Float>) property, z10 ? 0.0f : 1.0f));
        FrameLayout frameLayout2 = ba0Var.S;
        if (frameLayout2 != null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(ba0Var.S, (Property<FrameLayout, Float>) View.TRANSLATION_Y, z10 ? 0.0f : r6.getMeasuredHeight()));
        }
        org.telegram.ui.ActionBar.w0 w0Var = ba0Var.H;
        if (w0Var != null) {
            w0Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(ba0Var.H, (Property<org.telegram.ui.ActionBar.w0, Float>) property, z10 ? 1.0f : 0.0f));
        }
        boolean z11 = c0(getClosestTab()) == 0;
        org.telegram.ui.ActionBar.w0 w0Var2 = ba0Var.G;
        if (w0Var2 != null) {
            w0Var2.setVisibility(0);
            org.telegram.ui.ActionBar.w0 w0Var3 = ba0Var.G;
            if (!z10 && !z11) {
                f7 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(w0Var3, (Property<org.telegram.ui.ActionBar.w0, Float>) property, f7));
        }
        aa0 aa0Var = ba0Var.R;
        if (aa0Var != null) {
            arrayList.add(ObjectAnimator.ofFloat(aa0Var, (Property<aa0, Float>) property, z10 ? 0.4f : 1.0f));
        }
        this.f2.playTogether(arrayList);
        this.f2.setDuration(300L);
        this.f2.setInterpolator(qr.h);
        this.f2.addListener(new org.telegram.ui.ActionBar.g(this, z10, z11, 4));
        this.f2.start();
    }

    @Override // org.telegram.ui.Components.zu0
    public final int getInitialTab() {
        return this.i2.W;
    }

    @Override // org.telegram.ui.Components.zu0
    public final String getStoriesHashtag() {
        return this.i2.h;
    }

    @Override // org.telegram.ui.Components.zu0
    public final String getStoriesHashtagUsername() {
        return this.i2.n;
    }

    @Override // org.telegram.ui.Components.zu0
    public final boolean l0() {
        ba0 ba0Var = this.i2;
        return ba0Var.a == 0 && ba0Var.e == ba0Var.getUserConfig().getClientUserId() && ba0Var.f == 0;
    }

    @Override // org.telegram.ui.Components.zu0
    public final boolean m0() {
        int i10 = this.i2.a;
        return i10 == 1 || i10 == 2;
    }

    @Override // org.telegram.ui.Components.zu0
    public final void o0() {
        this.h2.M();
    }

    @Override // org.telegram.ui.Components.zu0
    public final boolean q0() {
        return this.i2.a == 2;
    }

    @Override // org.telegram.ui.Components.zu0
    public final boolean v0() {
        int i10 = this.i2.a;
        return i10 == 1 || i10 == 2;
    }
}
