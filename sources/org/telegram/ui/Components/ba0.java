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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ba0 extends yu0 {
    public AnimatorSet c2;
    public final /* synthetic */ FrameLayout d2;
    public final /* synthetic */ y90 e2;
    public final /* synthetic */ ea0 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba0(ea0 ea0Var, Context context, long j10, qu0 qu0Var, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i10, ea0 ea0Var2, aa0 aa0Var, org.telegram.ui.ActionBar.f6 f6Var, FrameLayout frameLayout, y90 y90Var) {
        super(context, j10, qu0Var, 0, null, chatFull, userFull, i10, 0, ea0Var2, aa0Var, 0, f6Var, null);
        this.f2 = ea0Var;
        this.d2 = frameLayout;
        this.e2 = y90Var;
    }

    @Override // org.telegram.ui.Components.yu0
    public final boolean D() {
        int i10 = this.f2.a;
        return (i10 == 1 || i10 == 2) ? false : true;
    }

    @Override // org.telegram.ui.Components.yu0
    public final void D0(SparseArray sparseArray) {
        int size = sparseArray.size();
        ea0 ea0Var = this.f2;
        ea0Var.F = sparseArray;
        int i10 = ea0Var.a;
        if (i10 == 1 || i10 == 2) {
            ea0Var.C.a();
            ea0Var.C.c(LocaleController.formatPluralString("StoriesSelected", size, new Object[0]), !LocaleController.isRTL, true);
            ph.d dVar = ea0Var.Q;
            if (dVar != null) {
                dVar.setEnabled(size > 0);
                ea0Var.Q.c(size, true);
                if (ea0Var.S.getClosestTab() == 8) {
                    ea0Var.Q.g(LocaleController.formatPluralString("ArchiveStories", size, new Object[0]), true, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.yu0
    public final void K0(boolean z4) {
        int i10;
        ea0 ea0Var = this.f2;
        Activity parentActivity = ea0Var.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.p2) ea0Var).classGuid;
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
        ea0 ea0Var = this.f2;
        if (ea0Var.a != 1) {
            return;
        }
        float f11 = f10 - 8.0f;
        da0 da0Var = ea0Var.O;
        if (da0Var != null) {
            da0Var.setProgress(f11);
        }
        float f12 = 1.0f - f11;
        ea0Var.v[0].setAlpha(f12);
        ea0Var.v[0].setTranslationX(AndroidUtilities.dp(-12.0f) * f11);
        ea0Var.v[1].setAlpha(f11);
        ea0Var.v[1].setTranslationX(AndroidUtilities.dp(12.0f) * f12);
    }

    @Override // org.telegram.ui.Components.yu0
    public final boolean N() {
        int i10 = this.f2.a;
        return i10 == 1 || i10 == 2 || i10 == 3;
    }

    @Override // org.telegram.ui.Components.yu0
    public final void N0(boolean z4) {
        da0 da0Var = this.f2.O;
        if (da0Var != null) {
            da0Var.setScrolling(z4);
        }
    }

    @Override // org.telegram.ui.Components.yu0
    public final void P(Canvas canvas, float f10, Rect rect, Paint paint) {
        this.e2.J(canvas, getY() + f10, rect, paint, true);
    }

    @Override // org.telegram.ui.Components.yu0
    public final void b1(boolean z4) {
        ea0 ea0Var = this.f2;
        if (ea0Var.a == 0) {
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
        int i10 = ea0Var.a;
        if (i10 == 1 || i10 == 2) {
            if (z4) {
                g1(null);
            }
            this.I1 = z4;
        }
        if (z4) {
            ea0Var.C.setVisibility(0);
            FrameLayout frameLayout = ea0Var.P;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
        } else {
            ea0Var.s.setVisibility(0);
        }
        float f10 = 0.0f;
        ea0Var.B.c(z4 ? 1.0f : 0.0f, true);
        this.c2 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        k6 k6Var = ea0Var.C;
        float[] fArr = {z4 ? 1.0f : 0.0f};
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(k6Var, (Property<k6, Float>) property, fArr));
        arrayList.add(ObjectAnimator.ofFloat(ea0Var.s, (Property<FrameLayout, Float>) property, z4 ? 0.0f : 1.0f));
        FrameLayout frameLayout2 = ea0Var.P;
        if (frameLayout2 != null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property, z4 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(ea0Var.P, (Property<FrameLayout, Float>) View.TRANSLATION_Y, z4 ? 0.0f : r6.getMeasuredHeight()));
        }
        org.telegram.ui.ActionBar.w0 w0Var = ea0Var.E;
        if (w0Var != null) {
            w0Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(ea0Var.E, (Property<org.telegram.ui.ActionBar.w0, Float>) property, z4 ? 1.0f : 0.0f));
        }
        boolean z10 = c0(getClosestTab()) == 0;
        org.telegram.ui.ActionBar.w0 w0Var2 = ea0Var.D;
        if (w0Var2 != null) {
            w0Var2.setVisibility(0);
            org.telegram.ui.ActionBar.w0 w0Var3 = ea0Var.D;
            if (!z4 && !z10) {
                f10 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(w0Var3, (Property<org.telegram.ui.ActionBar.w0, Float>) property, f10));
        }
        da0 da0Var = ea0Var.O;
        if (da0Var != null) {
            arrayList.add(ObjectAnimator.ofFloat(da0Var, (Property<da0, Float>) property, z4 ? 0.4f : 1.0f));
        }
        this.c2.playTogether(arrayList);
        this.c2.setDuration(300L);
        this.c2.setInterpolator(mr.h);
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
        ea0 ea0Var = this.f2;
        return ea0Var.a == 0 && ea0Var.e == ea0Var.getUserConfig().getClientUserId() && ea0Var.f == 0;
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
