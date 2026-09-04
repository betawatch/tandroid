package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class bg1 extends org.telegram.ui.Cells.r2 {
    public boolean W4;
    public int X4;
    public TLRPC.TL_forumTopic Y4;
    public org.telegram.ui.Components.q5 Z4;
    public Drawable a5;
    public boolean b5;
    public boolean c5;
    public boolean d5;
    public Boolean e5;
    public float f5;
    public ValueAnimator g5;
    public final /* synthetic */ eg1 h5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg1(eg1 eg1Var, Context context, boolean z10) {
        super(context, z10);
        this.h5 = eg1Var;
        this.X4 = -1;
        this.x = false;
        this.I = eg1Var.isInPreviewMode() ? 11 : 50;
        this.U = 24.0f;
        this.J = 64;
        this.K = 76;
        this.n1 = true;
    }

    @Override // org.telegram.ui.Cells.r2
    public final boolean F() {
        return this.d5;
    }

    public final void f0() {
        Drawable drawable = this.a5;
        boolean z10 = drawable instanceof og.c;
        eg1 eg1Var = this.h5;
        if (z10) {
            ((og.c) drawable).a(i0.a.d(this.f5, eg1Var.getThemedColor(org.telegram.ui.ActionBar.j6.R9), eg1Var.getThemedColor(org.telegram.ui.ActionBar.j6.L7)));
        }
        Drawable[] drawableArr = this.h0;
        if (drawableArr != null) {
            Drawable drawable2 = drawableArr[0];
            if (drawable2 instanceof og.c) {
                ((og.c) drawable2).a(i0.a.d(this.f5, eg1Var.getThemedColor(org.telegram.ui.ActionBar.j6.R9), eg1Var.getThemedColor(org.telegram.ui.ActionBar.j6.L7)));
            }
        }
        invalidate();
    }

    public final void g0(boolean z10) {
        boolean z11 = this.e5 != null;
        ValueAnimator valueAnimator = this.g5;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.g5 = null;
        }
        this.e5 = Boolean.valueOf(z10);
        if (!z11) {
            this.f5 = z10 ? 1.0f : 0.0f;
            f0();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f5, z10 ? 1.0f : 0.0f);
        this.g5 = ofFloat;
        ofFloat.addUpdateListener(new b21(this, 18));
        this.g5.setInterpolator(org.telegram.ui.Components.pr.g);
        this.g5.start();
    }

    @Override // org.telegram.ui.Cells.r2
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // org.telegram.ui.Cells.r2, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b5 = true;
        org.telegram.ui.Components.q5 q5Var = this.Z4;
        if (q5Var != null) {
            q5Var.a(this);
        }
    }

    @Override // org.telegram.ui.Cells.r2, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b5 = false;
        org.telegram.ui.Components.q5 q5Var = this.Z4;
        if (q5Var != null) {
            q5Var.o(this);
        }
    }

    @Override // org.telegram.ui.Cells.r2, android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Components.ii0 ii0Var;
        di.q3 q3Var;
        eg1 eg1Var = this.h5;
        if (eg1Var.getMessagesController().isMonoForum(-eg1Var.a)) {
            super.onDraw(canvas);
            return;
        }
        this.F3 = (!this.k0 || (q3Var = this.q2) == null) ? 0.0f : q3Var.getProgress() * AndroidUtilities.dp(30.0f);
        canvas.save();
        float f7 = this.F3;
        int i10 = -AndroidUtilities.dp(4.0f);
        this.E3 = i10;
        canvas.translate(f7, i10);
        canvas.drawColor(eg1Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        super.onDraw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(this.w1, 0.0f);
        if (this.W4) {
            int dp = this.t2 ? 0 : AndroidUtilities.dp(this.I);
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f - this.w1, getMeasuredHeight() - 1, getMeasuredWidth() - dp, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.k0);
            } else {
                canvas.drawLine(dp - this.w1, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.k0);
            }
        }
        if ((!this.c5 || (ii0Var = this.e2) == null || ii0Var.C != 0.0f) && (this.Z4 != null || this.a5 != null)) {
            int dp2 = AndroidUtilities.dp(10.0f);
            int dp3 = AndroidUtilities.dp(10.0f);
            int dp4 = AndroidUtilities.dp(28.0f);
            org.telegram.ui.Components.q5 q5Var = this.Z4;
            if (q5Var != null) {
                if (LocaleController.isRTL) {
                    q5Var.setBounds((getWidth() - dp2) - dp4, dp3, getWidth() - dp2, dp4 + dp3);
                } else {
                    q5Var.setBounds(dp2, dp3, dp2 + dp4, dp4 + dp3);
                }
                this.Z4.draw(canvas);
            } else {
                if (LocaleController.isRTL) {
                    this.a5.setBounds((getWidth() - dp2) - dp4, dp3, getWidth() - dp2, dp4 + dp3);
                } else {
                    this.a5.setBounds(dp2, dp3, dp2 + dp4, dp4 + dp3);
                }
                this.a5.draw(canvas);
            }
        }
        canvas.restore();
    }

    public void setAnimatedEmojiDrawable(org.telegram.ui.Components.q5 q5Var) {
        org.telegram.ui.Components.q5 q5Var2 = this.Z4;
        if (q5Var2 == q5Var) {
            return;
        }
        if (q5Var2 != null && this.b5) {
            q5Var2.o(this);
        }
        if (q5Var != null) {
            q5Var.setColorFilter(org.telegram.ui.ActionBar.j6.v3);
        }
        this.Z4 = q5Var;
        if (q5Var == null || !this.b5) {
            return;
        }
        q5Var.a(this);
    }

    public void setForumIcon(Drawable drawable) {
        this.a5 = drawable;
    }

    public void setTopicIcon(TLRPC.TL_forumTopic tL_forumTopic) {
        int i10;
        this.Y4 = tL_forumTopic;
        boolean z10 = false;
        this.d5 = tL_forumTopic != null && tL_forumTopic.closed;
        if (this.k0) {
            g0(tL_forumTopic != null && tL_forumTopic.hidden);
        }
        this.c5 = tL_forumTopic != null && tL_forumTopic.id == 1;
        eg1 eg1Var = this.h5;
        if (tL_forumTopic != null && this != eg1Var.b1) {
            if (tL_forumTopic.hidden) {
                this.L1 = true;
                this.M1 = org.telegram.ui.ActionBar.j6.d9;
                this.N1 = org.telegram.ui.ActionBar.j6.c9;
                this.O1 = "Unhide";
                this.P1 = R.string.Unhide;
                this.Q1 = org.telegram.ui.ActionBar.j6.y1;
            } else {
                this.L1 = true;
                this.M1 = org.telegram.ui.ActionBar.j6.c9;
                this.N1 = org.telegram.ui.ActionBar.j6.d9;
                this.O1 = "Hide";
                this.P1 = R.string.Hide;
                this.Q1 = org.telegram.ui.ActionBar.j6.x1;
            }
            invalidate();
        }
        if (this.k0) {
            return;
        }
        if (tL_forumTopic != null && tL_forumTopic.id == 1) {
            setAnimatedEmojiDrawable(null);
            setForumIcon(og.d.c(getContext(), 1.0f, eg1Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ac), false));
        } else if (tL_forumTopic == null || tL_forumTopic.icon_emoji_id == 0) {
            setAnimatedEmojiDrawable(null);
            setForumIcon(og.d.e(tL_forumTopic));
        } else {
            setForumIcon(null);
            org.telegram.ui.Components.q5 q5Var = this.Z4;
            if (q5Var == null || q5Var.i() != tL_forumTopic.icon_emoji_id) {
                int i11 = eg1Var.u0 ? 13 : 10;
                i10 = ((org.telegram.ui.ActionBar.n2) eg1Var).currentAccount;
                setAnimatedEmojiDrawable(new org.telegram.ui.Components.q5(i11, i10, tL_forumTopic.icon_emoji_id));
            }
        }
        if (tL_forumTopic != null && tL_forumTopic.hidden) {
            z10 = true;
        }
        g0(z10);
        t();
    }

    @Override // org.telegram.ui.Cells.r2
    public final void t() {
        super.t();
        f0();
    }
}
