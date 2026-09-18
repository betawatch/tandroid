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

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class ha0 extends kv0 {
    public AnimatorSet f2;
    public final /* synthetic */ FrameLayout g2;
    public final /* synthetic */ ea0 h2;
    public final /* synthetic */ ka0 i2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha0(ka0 ka0Var, Context context, long j3, cv0 cv0Var, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i10, ka0 ka0Var2, ga0 ga0Var, org.telegram.ui.ActionBar.e6 e6Var, FrameLayout frameLayout, ea0 ea0Var) {
        super(context, j3, cv0Var, 0, null, chatFull, userFull, i10, 0, ka0Var2, ga0Var, 0, e6Var, null);
        this.i2 = ka0Var;
        this.g2 = frameLayout;
        this.h2 = ea0Var;
    }

    @Override // org.telegram.ui.Components.kv0
    public final boolean D() {
        int i10 = this.i2.a;
        return (i10 == 1 || i10 == 2) ? false : true;
    }

    @Override // org.telegram.ui.Components.kv0
    public final void D0(SparseArray sparseArray) {
        int size = sparseArray.size();
        ka0 ka0Var = this.i2;
        ka0Var.I = sparseArray;
        int i10 = ka0Var.a;
        if (i10 == 1 || i10 == 2) {
            ka0Var.F.a();
            ka0Var.F.c(LocaleController.formatPluralString("StoriesSelected", size, new Object[0]), !LocaleController.isRTL, true);
            ci.d dVar = ka0Var.T;
            if (dVar != null) {
                dVar.setEnabled(size > 0);
                ka0Var.T.b(size, true);
                if (ka0Var.V.getClosestTab() == 8) {
                    ka0Var.T.g(LocaleController.formatPluralString("ArchiveStories", size, new Object[0]), true, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.kv0
    public final void K0(boolean z10) {
        int i10;
        ka0 ka0Var = this.i2;
        Activity parentActivity = ka0Var.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) ka0Var).classGuid;
        AndroidUtilities.removeAdjustResize(parentActivity, i10);
        AndroidUtilities.updateViewVisibilityAnimated(this.g2, !z10, 0.95f, true);
    }

    @Override // org.telegram.ui.Components.kv0
    public final void L0() {
        super.L0();
        this.i2.a0();
    }

    @Override // org.telegram.ui.Components.kv0
    public final void M0(float f7) {
        ka0 ka0Var = this.i2;
        if (ka0Var.a != 1) {
            return;
        }
        float f10 = f7 - 8.0f;
        ja0 ja0Var = ka0Var.R;
        if (ja0Var != null) {
            ja0Var.setProgress(f10);
        }
        float f11 = 1.0f - f10;
        ka0Var.v[0].setAlpha(f11);
        ka0Var.v[0].setTranslationX(AndroidUtilities.dp(-12.0f) * f10);
        ka0Var.v[1].setAlpha(f10);
        ka0Var.v[1].setTranslationX(AndroidUtilities.dp(12.0f) * f11);
    }

    @Override // org.telegram.ui.Components.kv0
    public final boolean N() {
        int i10 = this.i2.a;
        return i10 == 1 || i10 == 2 || i10 == 3;
    }

    @Override // org.telegram.ui.Components.kv0
    public final void N0(boolean z10) {
        ja0 ja0Var = this.i2.R;
        if (ja0Var != null) {
            ja0Var.setScrolling(z10);
        }
    }

    @Override // org.telegram.ui.Components.kv0
    public final void P(Canvas canvas, float f7, Rect rect, Paint paint) {
        this.h2.J(canvas, getY() + f7, rect, paint, true);
    }

    @Override // org.telegram.ui.Components.kv0
    public final void b1(boolean z10) {
        ka0 ka0Var = this.i2;
        if (ka0Var.a == 0) {
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
        int i10 = ka0Var.a;
        if (i10 == 1 || i10 == 2) {
            if (z10) {
                g1(null);
            }
            this.L1 = z10;
        }
        if (z10) {
            ka0Var.F.setVisibility(0);
            FrameLayout frameLayout = ka0Var.S;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
        } else {
            ka0Var.s.setVisibility(0);
        }
        float f7 = 0.0f;
        ka0Var.E.c(z10 ? 1.0f : 0.0f, true);
        this.f2 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        p6 p6Var = ka0Var.F;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(p6Var, (Property<p6, Float>) property, fArr));
        arrayList.add(ObjectAnimator.ofFloat(ka0Var.s, (Property<FrameLayout, Float>) property, z10 ? 0.0f : 1.0f));
        FrameLayout frameLayout2 = ka0Var.S;
        if (frameLayout2 != null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(ka0Var.S, (Property<FrameLayout, Float>) View.TRANSLATION_Y, z10 ? 0.0f : r6.getMeasuredHeight()));
        }
        org.telegram.ui.ActionBar.v0 v0Var = ka0Var.H;
        if (v0Var != null) {
            v0Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(ka0Var.H, (Property<org.telegram.ui.ActionBar.v0, Float>) property, z10 ? 1.0f : 0.0f));
        }
        boolean z11 = c0(getClosestTab()) == 0;
        org.telegram.ui.ActionBar.v0 v0Var2 = ka0Var.G;
        if (v0Var2 != null) {
            v0Var2.setVisibility(0);
            org.telegram.ui.ActionBar.v0 v0Var3 = ka0Var.G;
            if (!z10 && !z11) {
                f7 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(v0Var3, (Property<org.telegram.ui.ActionBar.v0, Float>) property, f7));
        }
        ja0 ja0Var = ka0Var.R;
        if (ja0Var != null) {
            arrayList.add(ObjectAnimator.ofFloat(ja0Var, (Property<ja0, Float>) property, z10 ? 0.4f : 1.0f));
        }
        this.f2.playTogether(arrayList);
        this.f2.setDuration(300L);
        this.f2.setInterpolator(qr.h);
        this.f2.addListener(new org.telegram.ui.ActionBar.g(this, z10, z11, 4));
        this.f2.start();
    }

    @Override // org.telegram.ui.Components.kv0
    public final int getInitialTab() {
        return this.i2.W;
    }

    @Override // org.telegram.ui.Components.kv0
    public final String getStoriesHashtag() {
        return this.i2.h;
    }

    @Override // org.telegram.ui.Components.kv0
    public final String getStoriesHashtagUsername() {
        return this.i2.n;
    }

    @Override // org.telegram.ui.Components.kv0
    public final boolean l0() {
        ka0 ka0Var = this.i2;
        return ka0Var.a == 0 && ka0Var.e == ka0Var.getUserConfig().getClientUserId() && ka0Var.f == 0;
    }

    @Override // org.telegram.ui.Components.kv0
    public final boolean m0() {
        int i10 = this.i2.a;
        return i10 == 1 || i10 == 2;
    }

    @Override // org.telegram.ui.Components.kv0
    public final void o0() {
        this.h2.M();
    }

    @Override // org.telegram.ui.Components.kv0
    public final boolean q0() {
        return this.i2.a == 2;
    }

    @Override // org.telegram.ui.Components.kv0
    public final boolean v0() {
        int i10 = this.i2.a;
        return i10 == 1 || i10 == 2;
    }
}
