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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class v90 extends qu0 {
    public AnimatorSet b2;
    public final /* synthetic */ FrameLayout c2;
    public final /* synthetic */ s90 d2;
    public final /* synthetic */ y90 e2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v90(y90 y90Var, Context context, long j10, iu0 iu0Var, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i10, y90 y90Var2, u90 u90Var, org.telegram.ui.ActionBar.c6 c6Var, FrameLayout frameLayout, s90 s90Var) {
        super(context, j10, iu0Var, 0, null, chatFull, userFull, i10, 0, y90Var2, u90Var, 0, c6Var, null);
        this.e2 = y90Var;
        this.c2 = frameLayout;
        this.d2 = s90Var;
    }

    @Override // org.telegram.ui.Components.qu0
    public final boolean D() {
        int i10 = this.e2.a;
        return (i10 == 1 || i10 == 2) ? false : true;
    }

    @Override // org.telegram.ui.Components.qu0
    public final void D0(SparseArray sparseArray) {
        int size = sparseArray.size();
        y90 y90Var = this.e2;
        y90Var.E = sparseArray;
        int i10 = y90Var.a;
        if (i10 == 1 || i10 == 2) {
            y90Var.B.a();
            y90Var.B.c(LocaleController.formatPluralString("StoriesSelected", size, new Object[0]), !LocaleController.isRTL, true);
            nh.d dVar = y90Var.P;
            if (dVar != null) {
                dVar.setEnabled(size > 0);
                y90Var.P.c(size, true);
                if (y90Var.R.getClosestTab() == 8) {
                    y90Var.P.g(LocaleController.formatPluralString("ArchiveStories", size, new Object[0]), true, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.qu0
    public final void K0(boolean z10) {
        int i10;
        y90 y90Var = this.e2;
        Activity parentActivity = y90Var.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.o2) y90Var).classGuid;
        AndroidUtilities.removeAdjustResize(parentActivity, i10);
        AndroidUtilities.updateViewVisibilityAnimated(this.c2, !z10, 0.95f, true);
    }

    @Override // org.telegram.ui.Components.qu0
    public final void L0() {
        super.L0();
        this.e2.a0();
    }

    @Override // org.telegram.ui.Components.qu0
    public final void M0(float f9) {
        y90 y90Var = this.e2;
        if (y90Var.a != 1) {
            return;
        }
        float f10 = f9 - 8.0f;
        x90 x90Var = y90Var.N;
        if (x90Var != null) {
            x90Var.setProgress(f10);
        }
        float f11 = 1.0f - f10;
        y90Var.v[0].setAlpha(f11);
        y90Var.v[0].setTranslationX(AndroidUtilities.dp(-12.0f) * f10);
        y90Var.v[1].setAlpha(f10);
        y90Var.v[1].setTranslationX(AndroidUtilities.dp(12.0f) * f11);
    }

    @Override // org.telegram.ui.Components.qu0
    public final boolean N() {
        int i10 = this.e2.a;
        return i10 == 1 || i10 == 2 || i10 == 3;
    }

    @Override // org.telegram.ui.Components.qu0
    public final void N0(boolean z10) {
        x90 x90Var = this.e2.N;
        if (x90Var != null) {
            x90Var.setScrolling(z10);
        }
    }

    @Override // org.telegram.ui.Components.qu0
    public final void P(Canvas canvas, float f9, Rect rect, Paint paint) {
        this.d2.J(canvas, getY() + f9, rect, paint, true);
    }

    @Override // org.telegram.ui.Components.qu0
    public final void b1(boolean z10) {
        y90 y90Var = this.e2;
        if (y90Var.a == 0) {
            super.b1(z10);
            return;
        }
        if (this.y1 == z10) {
            return;
        }
        this.y1 = z10;
        AnimatorSet animatorSet = this.b2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        int i10 = y90Var.a;
        if (i10 == 1 || i10 == 2) {
            if (z10) {
                g1(null);
            }
            this.H1 = z10;
        }
        if (z10) {
            y90Var.B.setVisibility(0);
            FrameLayout frameLayout = y90Var.O;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
        } else {
            y90Var.s.setVisibility(0);
        }
        float f9 = 0.0f;
        y90Var.A.c(z10 ? 1.0f : 0.0f, true);
        this.b2 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        o6 o6Var = y90Var.B;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(o6Var, (Property<o6, Float>) property, fArr));
        arrayList.add(ObjectAnimator.ofFloat(y90Var.s, (Property<FrameLayout, Float>) property, z10 ? 0.0f : 1.0f));
        FrameLayout frameLayout2 = y90Var.O;
        if (frameLayout2 != null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(y90Var.O, (Property<FrameLayout, Float>) View.TRANSLATION_Y, z10 ? 0.0f : r6.getMeasuredHeight()));
        }
        org.telegram.ui.ActionBar.w0 w0Var = y90Var.D;
        if (w0Var != null) {
            w0Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(y90Var.D, (Property<org.telegram.ui.ActionBar.w0, Float>) property, z10 ? 1.0f : 0.0f));
        }
        boolean z11 = c0(getClosestTab()) == 0;
        org.telegram.ui.ActionBar.w0 w0Var2 = y90Var.C;
        if (w0Var2 != null) {
            w0Var2.setVisibility(0);
            org.telegram.ui.ActionBar.w0 w0Var3 = y90Var.C;
            if (!z10 && !z11) {
                f9 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(w0Var3, (Property<org.telegram.ui.ActionBar.w0, Float>) property, f9));
        }
        x90 x90Var = y90Var.N;
        if (x90Var != null) {
            arrayList.add(ObjectAnimator.ofFloat(x90Var, (Property<x90, Float>) property, z10 ? 0.4f : 1.0f));
        }
        this.b2.playTogether(arrayList);
        this.b2.setDuration(300L);
        this.b2.setInterpolator(jr.h);
        this.b2.addListener(new org.telegram.ui.ActionBar.h(this, z10, z11, 4));
        this.b2.start();
    }

    @Override // org.telegram.ui.Components.qu0
    public final int getInitialTab() {
        return this.e2.S;
    }

    @Override // org.telegram.ui.Components.qu0
    public final String getStoriesHashtag() {
        return this.e2.h;
    }

    @Override // org.telegram.ui.Components.qu0
    public final String getStoriesHashtagUsername() {
        return this.e2.n;
    }

    @Override // org.telegram.ui.Components.qu0
    public final boolean l0() {
        y90 y90Var = this.e2;
        return y90Var.a == 0 && y90Var.e == y90Var.getUserConfig().getClientUserId() && y90Var.f == 0;
    }

    @Override // org.telegram.ui.Components.qu0
    public final boolean m0() {
        int i10 = this.e2.a;
        return i10 == 1 || i10 == 2;
    }

    @Override // org.telegram.ui.Components.qu0
    public final void o0() {
        this.d2.M();
    }

    @Override // org.telegram.ui.Components.qu0
    public final boolean q0() {
        return this.e2.a == 2;
    }

    @Override // org.telegram.ui.Components.qu0
    public final boolean v0() {
        int i10 = this.e2.a;
        return i10 == 1 || i10 == 2;
    }
}
