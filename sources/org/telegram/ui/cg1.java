package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class cg1 extends org.telegram.ui.Cells.s2 {
    public boolean a5;
    public int b5;
    public TLRPC.TL_forumTopic c5;
    public org.telegram.ui.Components.s5 d5;
    public Drawable e5;
    public boolean f5;
    public boolean g5;
    public boolean h5;
    public Boolean i5;
    public float j5;
    public ValueAnimator k5;
    public final /* synthetic */ fg1 l5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg1(fg1 fg1Var, Context context, boolean z10) {
        super(context, z10);
        this.l5 = fg1Var;
        this.b5 = -1;
        this.x = false;
        this.I = fg1Var.isInPreviewMode() ? 11 : 50;
        this.U = 24.0f;
        this.J = 64;
        this.K = 76;
        this.n1 = true;
    }

    @Override // org.telegram.ui.Cells.s2
    public final boolean F() {
        return this.h5;
    }

    public final void f0() {
        Drawable drawable = this.e5;
        boolean z10 = drawable instanceof ng.c;
        fg1 fg1Var = this.l5;
        if (z10) {
            ((ng.c) drawable).a(i0.a.d(this.j5, fg1Var.getThemedColor(org.telegram.ui.ActionBar.i6.R9), fg1Var.getThemedColor(org.telegram.ui.ActionBar.i6.L7)));
        }
        Drawable[] drawableArr = this.h0;
        if (drawableArr != null) {
            Drawable drawable2 = drawableArr[0];
            if (drawable2 instanceof ng.c) {
                ((ng.c) drawable2).a(i0.a.d(this.j5, fg1Var.getThemedColor(org.telegram.ui.ActionBar.i6.R9), fg1Var.getThemedColor(org.telegram.ui.ActionBar.i6.L7)));
            }
        }
        invalidate();
    }

    public final void g0(boolean z10) {
        boolean z11 = this.i5 != null;
        ValueAnimator valueAnimator = this.k5;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.k5 = null;
        }
        this.i5 = Boolean.valueOf(z10);
        if (!z11) {
            this.j5 = z10 ? 1.0f : 0.0f;
            f0();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.j5, z10 ? 1.0f : 0.0f);
        this.k5 = ofFloat;
        ofFloat.addUpdateListener(new y11(this, 18));
        this.k5.setInterpolator(org.telegram.ui.Components.hs.g);
        this.k5.start();
    }

    @Override // org.telegram.ui.Cells.s2
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // org.telegram.ui.Cells.s2, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5 = true;
        org.telegram.ui.Components.s5 s5Var = this.d5;
        if (s5Var != null) {
            s5Var.a(this);
        }
    }

    @Override // org.telegram.ui.Cells.s2, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5 = false;
        org.telegram.ui.Components.s5 s5Var = this.d5;
        if (s5Var != null) {
            s5Var.o(this);
        }
    }

    @Override // org.telegram.ui.Cells.s2, android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Components.nj0 nj0Var;
        ci.o3 o3Var;
        fg1 fg1Var = this.l5;
        if (fg1Var.getMessagesController().isMonoForum(-fg1Var.a)) {
            super.onDraw(canvas);
            return;
        }
        this.F3 = (!this.k0 || (o3Var = this.q2) == null) ? 0.0f : o3Var.getProgress() * AndroidUtilities.dp(30.0f);
        canvas.save();
        float f7 = this.F3;
        int i10 = -AndroidUtilities.dp(4.0f);
        this.E3 = i10;
        canvas.translate(f7, i10);
        canvas.drawColor(fg1Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
        super.onDraw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(this.w1, 0.0f);
        if (this.a5) {
            int dp = this.t2 ? 0 : AndroidUtilities.dp(this.I);
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f - this.w1, getMeasuredHeight() - 1, getMeasuredWidth() - dp, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.i6.k0);
            } else {
                canvas.drawLine(dp - this.w1, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.i6.k0);
            }
        }
        if ((!this.g5 || (nj0Var = this.e2) == null || nj0Var.C != 0.0f) && (this.d5 != null || this.e5 != null)) {
            int dp2 = AndroidUtilities.dp(10.0f);
            int dp3 = AndroidUtilities.dp(10.0f);
            int dp4 = AndroidUtilities.dp(28.0f);
            org.telegram.ui.Components.s5 s5Var = this.d5;
            if (s5Var != null) {
                if (LocaleController.isRTL) {
                    s5Var.setBounds((getWidth() - dp2) - dp4, dp3, getWidth() - dp2, dp4 + dp3);
                } else {
                    s5Var.setBounds(dp2, dp3, dp2 + dp4, dp4 + dp3);
                }
                this.d5.draw(canvas);
            } else {
                if (LocaleController.isRTL) {
                    this.e5.setBounds((getWidth() - dp2) - dp4, dp3, getWidth() - dp2, dp4 + dp3);
                } else {
                    this.e5.setBounds(dp2, dp3, dp2 + dp4, dp4 + dp3);
                }
                this.e5.draw(canvas);
            }
        }
        canvas.restore();
    }

    public void setAnimatedEmojiDrawable(org.telegram.ui.Components.s5 s5Var) {
        org.telegram.ui.Components.s5 s5Var2 = this.d5;
        if (s5Var2 == s5Var) {
            return;
        }
        if (s5Var2 != null && this.f5) {
            s5Var2.o(this);
        }
        if (s5Var != null) {
            s5Var.setColorFilter(org.telegram.ui.ActionBar.i6.v3);
        }
        this.d5 = s5Var;
        if (s5Var == null || !this.f5) {
            return;
        }
        s5Var.a(this);
    }

    public void setForumIcon(Drawable drawable) {
        this.e5 = drawable;
    }

    public void setTopicIcon(TLRPC.TL_forumTopic tL_forumTopic) {
        int i10;
        this.c5 = tL_forumTopic;
        boolean z10 = false;
        this.h5 = tL_forumTopic != null && tL_forumTopic.closed;
        if (this.k0) {
            g0(tL_forumTopic != null && tL_forumTopic.hidden);
        }
        this.g5 = tL_forumTopic != null && tL_forumTopic.id == 1;
        fg1 fg1Var = this.l5;
        if (tL_forumTopic != null && this != fg1Var.b1) {
            if (tL_forumTopic.hidden) {
                this.L1 = true;
                this.M1 = org.telegram.ui.ActionBar.i6.d9;
                this.N1 = org.telegram.ui.ActionBar.i6.c9;
                this.O1 = "Unhide";
                this.P1 = R.string.Unhide;
                this.Q1 = org.telegram.ui.ActionBar.i6.y1;
            } else {
                this.L1 = true;
                this.M1 = org.telegram.ui.ActionBar.i6.c9;
                this.N1 = org.telegram.ui.ActionBar.i6.d9;
                this.O1 = "Hide";
                this.P1 = R.string.Hide;
                this.Q1 = org.telegram.ui.ActionBar.i6.x1;
            }
            invalidate();
        }
        if (this.k0) {
            return;
        }
        if (tL_forumTopic != null && tL_forumTopic.id == 1) {
            setAnimatedEmojiDrawable(null);
            setForumIcon(ng.d.c(getContext(), 1.0f, fg1Var.getThemedColor(org.telegram.ui.ActionBar.i6.Ac), false));
        } else if (tL_forumTopic == null || tL_forumTopic.icon_emoji_id == 0) {
            setAnimatedEmojiDrawable(null);
            setForumIcon(ng.d.e(tL_forumTopic));
        } else {
            setForumIcon(null);
            org.telegram.ui.Components.s5 s5Var = this.d5;
            if (s5Var == null || s5Var.i() != tL_forumTopic.icon_emoji_id) {
                int i11 = fg1Var.u0 ? 13 : 10;
                i10 = ((org.telegram.ui.ActionBar.n2) fg1Var).currentAccount;
                setAnimatedEmojiDrawable(new org.telegram.ui.Components.s5(i11, i10, tL_forumTopic.icon_emoji_id));
            }
        }
        if (tL_forumTopic != null && tL_forumTopic.hidden) {
            z10 = true;
        }
        g0(z10);
        u();
    }

    @Override // org.telegram.ui.Cells.s2
    public final void u() {
        super.u();
        f0();
    }
}
