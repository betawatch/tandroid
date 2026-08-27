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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class l90 extends hu0 {
    public AnimatorSet b2;
    public final /* synthetic */ FrameLayout c2;
    public final /* synthetic */ i90 d2;
    public final /* synthetic */ o90 e2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l90(o90 o90Var, Context context, long j10, zt0 zt0Var, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i10, o90 o90Var2, k90 k90Var, org.telegram.ui.ActionBar.c6 c6Var, FrameLayout frameLayout, i90 i90Var) {
        super(context, j10, zt0Var, 0, null, chatFull, userFull, i10, 0, o90Var2, k90Var, 0, c6Var, null);
        this.e2 = o90Var;
        this.c2 = frameLayout;
        this.d2 = i90Var;
    }

    @Override // org.telegram.ui.Components.hu0
    public final boolean D() {
        int i10 = this.e2.a;
        return (i10 == 1 || i10 == 2) ? false : true;
    }

    @Override // org.telegram.ui.Components.hu0
    public final void D0(SparseArray sparseArray) {
        int size = sparseArray.size();
        o90 o90Var = this.e2;
        o90Var.E = sparseArray;
        int i10 = o90Var.a;
        if (i10 == 1 || i10 == 2) {
            o90Var.B.a();
            o90Var.B.c(LocaleController.formatPluralString("StoriesSelected", size, new Object[0]), !LocaleController.isRTL, true);
            lh.d dVar = o90Var.P;
            if (dVar != null) {
                dVar.setEnabled(size > 0);
                o90Var.P.c(size, true);
                if (o90Var.R.getClosestTab() == 8) {
                    o90Var.P.g(LocaleController.formatPluralString("ArchiveStories", size, new Object[0]), true, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.hu0
    public final void K0(boolean z10) {
        int i10;
        o90 o90Var = this.e2;
        Activity parentActivity = o90Var.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) o90Var).classGuid;
        AndroidUtilities.removeAdjustResize(parentActivity, i10);
        AndroidUtilities.updateViewVisibilityAnimated(this.c2, !z10, 0.95f, true);
    }

    @Override // org.telegram.ui.Components.hu0
    public final void L0() {
        super.L0();
        this.e2.a0();
    }

    @Override // org.telegram.ui.Components.hu0
    public final void M0(float f10) {
        o90 o90Var = this.e2;
        if (o90Var.a != 1) {
            return;
        }
        float f11 = f10 - 8.0f;
        n90 n90Var = o90Var.N;
        if (n90Var != null) {
            n90Var.setProgress(f11);
        }
        float f12 = 1.0f - f11;
        o90Var.v[0].setAlpha(f12);
        o90Var.v[0].setTranslationX(AndroidUtilities.dp(-12.0f) * f11);
        o90Var.v[1].setAlpha(f11);
        o90Var.v[1].setTranslationX(AndroidUtilities.dp(12.0f) * f12);
    }

    @Override // org.telegram.ui.Components.hu0
    public final boolean N() {
        int i10 = this.e2.a;
        return i10 == 1 || i10 == 2 || i10 == 3;
    }

    @Override // org.telegram.ui.Components.hu0
    public final void N0(boolean z10) {
        n90 n90Var = this.e2.N;
        if (n90Var != null) {
            n90Var.setScrolling(z10);
        }
    }

    @Override // org.telegram.ui.Components.hu0
    public final void P(Canvas canvas, float f10, Rect rect, Paint paint) {
        this.d2.J(canvas, getY() + f10, rect, paint, true);
    }

    @Override // org.telegram.ui.Components.hu0
    public final void b1(boolean z10) {
        o90 o90Var = this.e2;
        if (o90Var.a == 0) {
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
        int i10 = o90Var.a;
        if (i10 == 1 || i10 == 2) {
            if (z10) {
                g1(null);
            }
            this.H1 = z10;
        }
        if (z10) {
            o90Var.B.setVisibility(0);
            FrameLayout frameLayout = o90Var.O;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
        } else {
            o90Var.s.setVisibility(0);
        }
        float f10 = 0.0f;
        o90Var.A.c(z10 ? 1.0f : 0.0f, true);
        this.b2 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        j6 j6Var = o90Var.B;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(j6Var, (Property<j6, Float>) property, fArr));
        arrayList.add(ObjectAnimator.ofFloat(o90Var.s, (Property<FrameLayout, Float>) property, z10 ? 0.0f : 1.0f));
        FrameLayout frameLayout2 = o90Var.O;
        if (frameLayout2 != null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(o90Var.O, (Property<FrameLayout, Float>) View.TRANSLATION_Y, z10 ? 0.0f : r6.getMeasuredHeight()));
        }
        org.telegram.ui.ActionBar.v0 v0Var = o90Var.D;
        if (v0Var != null) {
            v0Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(o90Var.D, (Property<org.telegram.ui.ActionBar.v0, Float>) property, z10 ? 1.0f : 0.0f));
        }
        boolean z11 = c0(getClosestTab()) == 0;
        org.telegram.ui.ActionBar.v0 v0Var2 = o90Var.C;
        if (v0Var2 != null) {
            v0Var2.setVisibility(0);
            org.telegram.ui.ActionBar.v0 v0Var3 = o90Var.C;
            if (!z10 && !z11) {
                f10 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(v0Var3, (Property<org.telegram.ui.ActionBar.v0, Float>) property, f10));
        }
        n90 n90Var = o90Var.N;
        if (n90Var != null) {
            arrayList.add(ObjectAnimator.ofFloat(n90Var, (Property<n90, Float>) property, z10 ? 0.4f : 1.0f));
        }
        this.b2.playTogether(arrayList);
        this.b2.setDuration(300L);
        this.b2.setInterpolator(er.h);
        this.b2.addListener(new org.telegram.ui.ActionBar.g(this, z10, z11, 4));
        this.b2.start();
    }

    @Override // org.telegram.ui.Components.hu0
    public final int getInitialTab() {
        return this.e2.S;
    }

    @Override // org.telegram.ui.Components.hu0
    public final String getStoriesHashtag() {
        return this.e2.h;
    }

    @Override // org.telegram.ui.Components.hu0
    public final String getStoriesHashtagUsername() {
        return this.e2.n;
    }

    @Override // org.telegram.ui.Components.hu0
    public final boolean l0() {
        o90 o90Var = this.e2;
        return o90Var.a == 0 && o90Var.e == o90Var.getUserConfig().getClientUserId() && o90Var.f == 0;
    }

    @Override // org.telegram.ui.Components.hu0
    public final boolean m0() {
        int i10 = this.e2.a;
        return i10 == 1 || i10 == 2;
    }

    @Override // org.telegram.ui.Components.hu0
    public final void o0() {
        this.d2.M();
    }

    @Override // org.telegram.ui.Components.hu0
    public final boolean q0() {
        return this.e2.a == 2;
    }

    @Override // org.telegram.ui.Components.hu0
    public final boolean v0() {
        int i10 = this.e2.a;
        return i10 == 1 || i10 == 2;
    }
}
