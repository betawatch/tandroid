package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class hf1 extends org.telegram.ui.Cells.r2 {
    public boolean T4;
    public int U4;
    public TLRPC.TL_forumTopic V4;
    public org.telegram.ui.Components.l5 W4;
    public Drawable X4;
    public boolean Y4;
    public boolean Z4;
    public boolean a5;
    public Boolean b5;
    public float c5;
    public ValueAnimator d5;
    public final /* synthetic */ kf1 e5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf1(kf1 kf1Var, Context context, boolean z4) {
        super(context, z4);
        this.e5 = kf1Var;
        this.U4 = -1;
        this.x = false;
        this.F = kf1Var.isInPreviewMode() ? 11 : 50;
        this.R = 24.0f;
        this.G = 64;
        this.H = 76;
        this.k1 = true;
    }

    @Override // org.telegram.ui.Cells.r2
    public final boolean E() {
        return this.a5;
    }

    public final void f0() {
        Drawable drawable = this.X4;
        boolean z4 = drawable instanceof ag.e;
        kf1 kf1Var = this.e5;
        if (z4) {
            ((ag.e) drawable).a(i0.a.d(this.c5, kf1Var.getThemedColor(org.telegram.ui.ActionBar.j6.R9), kf1Var.getThemedColor(org.telegram.ui.ActionBar.j6.L7)));
        }
        Drawable[] drawableArr = this.e0;
        if (drawableArr != null) {
            Drawable drawable2 = drawableArr[0];
            if (drawable2 instanceof ag.e) {
                ((ag.e) drawable2).a(i0.a.d(this.c5, kf1Var.getThemedColor(org.telegram.ui.ActionBar.j6.R9), kf1Var.getThemedColor(org.telegram.ui.ActionBar.j6.L7)));
            }
        }
        invalidate();
    }

    public final void g0(boolean z4) {
        boolean z10 = this.b5 != null;
        ValueAnimator valueAnimator = this.d5;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.d5 = null;
        }
        this.b5 = Boolean.valueOf(z4);
        if (!z10) {
            this.c5 = z4 ? 1.0f : 0.0f;
            f0();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.c5, z4 ? 1.0f : 0.0f);
        this.d5 = ofFloat;
        ofFloat.addUpdateListener(new h11(this, 18));
        this.d5.setInterpolator(org.telegram.ui.Components.nr.g);
        this.d5.start();
    }

    @Override // org.telegram.ui.Cells.r2
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // org.telegram.ui.Cells.r2, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Y4 = true;
        org.telegram.ui.Components.l5 l5Var = this.W4;
        if (l5Var != null) {
            l5Var.a(this);
        }
    }

    @Override // org.telegram.ui.Cells.r2, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Y4 = false;
        org.telegram.ui.Components.l5 l5Var = this.W4;
        if (l5Var != null) {
            l5Var.o(this);
        }
    }

    @Override // org.telegram.ui.Cells.r2, android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Components.pi0 pi0Var;
        org.telegram.ui.Cells.k2 k2Var;
        kf1 kf1Var = this.e5;
        if (kf1Var.getMessagesController().isMonoForum(-kf1Var.a)) {
            super.onDraw(canvas);
            return;
        }
        this.C3 = (!this.h0 || (k2Var = this.n2) == null) ? 0.0f : k2Var.getProgress() * AndroidUtilities.dp(30.0f);
        canvas.save();
        float f10 = this.C3;
        int i10 = -AndroidUtilities.dp(4.0f);
        this.B3 = i10;
        canvas.translate(f10, i10);
        canvas.drawColor(kf1Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        super.onDraw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(this.t1, 0.0f);
        if (this.T4) {
            int dp = this.q2 ? 0 : AndroidUtilities.dp(this.F);
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f - this.t1, getMeasuredHeight() - 1, getMeasuredWidth() - dp, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.k0);
            } else {
                canvas.drawLine(dp - this.t1, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.k0);
            }
        }
        if ((!this.Z4 || (pi0Var = this.b2) == null || pi0Var.C != 0.0f) && (this.W4 != null || this.X4 != null)) {
            int dp2 = AndroidUtilities.dp(10.0f);
            int dp3 = AndroidUtilities.dp(10.0f);
            int dp4 = AndroidUtilities.dp(28.0f);
            org.telegram.ui.Components.l5 l5Var = this.W4;
            if (l5Var != null) {
                if (LocaleController.isRTL) {
                    l5Var.setBounds((getWidth() - dp2) - dp4, dp3, getWidth() - dp2, dp4 + dp3);
                } else {
                    l5Var.setBounds(dp2, dp3, dp2 + dp4, dp4 + dp3);
                }
                this.W4.draw(canvas);
            } else {
                if (LocaleController.isRTL) {
                    this.X4.setBounds((getWidth() - dp2) - dp4, dp3, getWidth() - dp2, dp4 + dp3);
                } else {
                    this.X4.setBounds(dp2, dp3, dp2 + dp4, dp4 + dp3);
                }
                this.X4.draw(canvas);
            }
        }
        canvas.restore();
    }

    public void setAnimatedEmojiDrawable(org.telegram.ui.Components.l5 l5Var) {
        org.telegram.ui.Components.l5 l5Var2 = this.W4;
        if (l5Var2 == l5Var) {
            return;
        }
        if (l5Var2 != null && this.Y4) {
            l5Var2.o(this);
        }
        if (l5Var != null) {
            l5Var.setColorFilter(org.telegram.ui.ActionBar.j6.v3);
        }
        this.W4 = l5Var;
        if (l5Var == null || !this.Y4) {
            return;
        }
        l5Var.a(this);
    }

    public void setForumIcon(Drawable drawable) {
        this.X4 = drawable;
    }

    public void setTopicIcon(TLRPC.TL_forumTopic tL_forumTopic) {
        int i10;
        this.V4 = tL_forumTopic;
        boolean z4 = false;
        this.a5 = tL_forumTopic != null && tL_forumTopic.closed;
        if (this.h0) {
            g0(tL_forumTopic != null && tL_forumTopic.hidden);
        }
        this.Z4 = tL_forumTopic != null && tL_forumTopic.id == 1;
        kf1 kf1Var = this.e5;
        if (tL_forumTopic != null && this != kf1Var.Y0) {
            if (tL_forumTopic.hidden) {
                this.I1 = true;
                this.J1 = org.telegram.ui.ActionBar.j6.d9;
                this.K1 = org.telegram.ui.ActionBar.j6.c9;
                this.L1 = "Unhide";
                this.M1 = R.string.Unhide;
                this.N1 = org.telegram.ui.ActionBar.j6.y1;
            } else {
                this.I1 = true;
                this.J1 = org.telegram.ui.ActionBar.j6.c9;
                this.K1 = org.telegram.ui.ActionBar.j6.d9;
                this.L1 = "Hide";
                this.M1 = R.string.Hide;
                this.N1 = org.telegram.ui.ActionBar.j6.x1;
            }
            invalidate();
        }
        if (this.h0) {
            return;
        }
        if (tL_forumTopic != null && tL_forumTopic.id == 1) {
            setAnimatedEmojiDrawable(null);
            setForumIcon(ag.f.c(getContext(), 1.0f, kf1Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ac), false));
        } else if (tL_forumTopic == null || tL_forumTopic.icon_emoji_id == 0) {
            setAnimatedEmojiDrawable(null);
            setForumIcon(ag.f.e(tL_forumTopic));
        } else {
            setForumIcon(null);
            org.telegram.ui.Components.l5 l5Var = this.W4;
            if (l5Var == null || l5Var.i() != tL_forumTopic.icon_emoji_id) {
                int i11 = kf1Var.r0 ? 13 : 10;
                i10 = ((org.telegram.ui.ActionBar.p2) kf1Var).currentAccount;
                setAnimatedEmojiDrawable(new org.telegram.ui.Components.l5(i11, i10, tL_forumTopic.icon_emoji_id));
            }
        }
        if (tL_forumTopic != null && tL_forumTopic.hidden) {
            z4 = true;
        }
        g0(z4);
        t();
    }

    @Override // org.telegram.ui.Cells.r2
    public final void t() {
        super.t();
        f0();
    }
}
