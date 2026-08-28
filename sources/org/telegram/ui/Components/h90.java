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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class h90 extends eu0 {
    public AnimatorSet b2;
    public final /* synthetic */ FrameLayout c2;
    public final /* synthetic */ e90 d2;
    public final /* synthetic */ k90 e2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h90(k90 k90Var, Context context, long j10, wt0 wt0Var, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i9, k90 k90Var2, g90 g90Var, org.telegram.ui.ActionBar.b6 b6Var, FrameLayout frameLayout, e90 e90Var) {
        super(context, j10, wt0Var, 0, null, chatFull, userFull, i9, 0, k90Var2, g90Var, 0, b6Var, null);
        this.e2 = k90Var;
        this.c2 = frameLayout;
        this.d2 = e90Var;
    }

    @Override // org.telegram.ui.Components.eu0
    public final boolean D() {
        int i9 = this.e2.a;
        return (i9 == 1 || i9 == 2) ? false : true;
    }

    @Override // org.telegram.ui.Components.eu0
    public final void D0(SparseArray sparseArray) {
        int size = sparseArray.size();
        k90 k90Var = this.e2;
        k90Var.E = sparseArray;
        int i9 = k90Var.a;
        if (i9 == 1 || i9 == 2) {
            k90Var.B.a();
            k90Var.B.c(LocaleController.formatPluralString("StoriesSelected", size, new Object[0]), !LocaleController.isRTL, true);
            kh.d dVar = k90Var.P;
            if (dVar != null) {
                dVar.setEnabled(size > 0);
                k90Var.P.c(size, true);
                if (k90Var.R.getClosestTab() == 8) {
                    k90Var.P.g(LocaleController.formatPluralString("ArchiveStories", size, new Object[0]), true, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.eu0
    public final void K0(boolean z10) {
        int i9;
        k90 k90Var = this.e2;
        Activity parentActivity = k90Var.getParentActivity();
        i9 = ((org.telegram.ui.ActionBar.o2) k90Var).classGuid;
        AndroidUtilities.removeAdjustResize(parentActivity, i9);
        AndroidUtilities.updateViewVisibilityAnimated(this.c2, !z10, 0.95f, true);
    }

    @Override // org.telegram.ui.Components.eu0
    public final void L0() {
        super.L0();
        this.e2.Z();
    }

    @Override // org.telegram.ui.Components.eu0
    public final void M0(float f10) {
        k90 k90Var = this.e2;
        if (k90Var.a != 1) {
            return;
        }
        float f11 = f10 - 8.0f;
        j90 j90Var = k90Var.N;
        if (j90Var != null) {
            j90Var.setProgress(f11);
        }
        float f12 = 1.0f - f11;
        k90Var.v[0].setAlpha(f12);
        k90Var.v[0].setTranslationX(AndroidUtilities.dp(-12.0f) * f11);
        k90Var.v[1].setAlpha(f11);
        k90Var.v[1].setTranslationX(AndroidUtilities.dp(12.0f) * f12);
    }

    @Override // org.telegram.ui.Components.eu0
    public final boolean N() {
        int i9 = this.e2.a;
        return i9 == 1 || i9 == 2 || i9 == 3;
    }

    @Override // org.telegram.ui.Components.eu0
    public final void N0(boolean z10) {
        j90 j90Var = this.e2.N;
        if (j90Var != null) {
            j90Var.setScrolling(z10);
        }
    }

    @Override // org.telegram.ui.Components.eu0
    public final void P(Canvas canvas, float f10, Rect rect, Paint paint) {
        this.d2.J(canvas, getY() + f10, rect, paint, true);
    }

    @Override // org.telegram.ui.Components.eu0
    public final void b1(boolean z10) {
        k90 k90Var = this.e2;
        if (k90Var.a == 0) {
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
        int i9 = k90Var.a;
        if (i9 == 1 || i9 == 2) {
            if (z10) {
                g1(null);
            }
            this.H1 = z10;
        }
        if (z10) {
            k90Var.B.setVisibility(0);
            FrameLayout frameLayout = k90Var.O;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
        } else {
            k90Var.s.setVisibility(0);
        }
        float f10 = 0.0f;
        k90Var.A.c(z10 ? 1.0f : 0.0f, true);
        this.b2 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        j6 j6Var = k90Var.B;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(j6Var, (Property<j6, Float>) property, fArr));
        arrayList.add(ObjectAnimator.ofFloat(k90Var.s, (Property<FrameLayout, Float>) property, z10 ? 0.0f : 1.0f));
        FrameLayout frameLayout2 = k90Var.O;
        if (frameLayout2 != null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(k90Var.O, (Property<FrameLayout, Float>) View.TRANSLATION_Y, z10 ? 0.0f : r6.getMeasuredHeight()));
        }
        org.telegram.ui.ActionBar.w0 w0Var = k90Var.D;
        if (w0Var != null) {
            w0Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(k90Var.D, (Property<org.telegram.ui.ActionBar.w0, Float>) property, z10 ? 1.0f : 0.0f));
        }
        boolean z11 = c0(getClosestTab()) == 0;
        org.telegram.ui.ActionBar.w0 w0Var2 = k90Var.C;
        if (w0Var2 != null) {
            w0Var2.setVisibility(0);
            org.telegram.ui.ActionBar.w0 w0Var3 = k90Var.C;
            if (!z10 && !z11) {
                f10 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(w0Var3, (Property<org.telegram.ui.ActionBar.w0, Float>) property, f10));
        }
        j90 j90Var = k90Var.N;
        if (j90Var != null) {
            arrayList.add(ObjectAnimator.ofFloat(j90Var, (Property<j90, Float>) property, z10 ? 0.4f : 1.0f));
        }
        this.b2.playTogether(arrayList);
        this.b2.setDuration(300L);
        this.b2.setInterpolator(gr.h);
        this.b2.addListener(new org.telegram.ui.ActionBar.g(this, z10, z11, 4));
        this.b2.start();
    }

    @Override // org.telegram.ui.Components.eu0
    public final int getInitialTab() {
        return this.e2.S;
    }

    @Override // org.telegram.ui.Components.eu0
    public final String getStoriesHashtag() {
        return this.e2.h;
    }

    @Override // org.telegram.ui.Components.eu0
    public final String getStoriesHashtagUsername() {
        return this.e2.n;
    }

    @Override // org.telegram.ui.Components.eu0
    public final boolean l0() {
        k90 k90Var = this.e2;
        return k90Var.a == 0 && k90Var.e == k90Var.getUserConfig().getClientUserId() && k90Var.f == 0;
    }

    @Override // org.telegram.ui.Components.eu0
    public final boolean m0() {
        int i9 = this.e2.a;
        return i9 == 1 || i9 == 2;
    }

    @Override // org.telegram.ui.Components.eu0
    public final void o0() {
        this.d2.M();
    }

    @Override // org.telegram.ui.Components.eu0
    public final boolean q0() {
        return this.e2.a == 2;
    }

    @Override // org.telegram.ui.Components.eu0
    public final boolean v0() {
        int i9 = this.e2.a;
        return i9 == 1 || i9 == 2;
    }
}
