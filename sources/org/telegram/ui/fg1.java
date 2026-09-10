package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class fg1 extends org.telegram.ui.Cells.r2 {
    public boolean W4;
    public int X4;
    public TLRPC.TL_forumTopic Y4;
    public org.telegram.ui.Components.p5 Z4;
    public Drawable a5;
    public boolean b5;
    public boolean c5;
    public boolean d5;
    public Boolean e5;
    public float f5;
    public ValueAnimator g5;
    public final /* synthetic */ ig1 h5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fg1(ig1 ig1Var, Context context, boolean z10) {
        super(context, z10);
        this.h5 = ig1Var;
        this.X4 = -1;
        this.x = false;
        this.I = ig1Var.isInPreviewMode() ? 11 : 50;
        this.U = 24.0f;
        this.J = 64;
        this.K = 76;
        this.n1 = true;
    }

    @Override // org.telegram.ui.Cells.r2
    public final boolean E() {
        return this.d5;
    }

    public final void f0() {
        Drawable drawable = this.a5;
        boolean z10 = drawable instanceof mg.c;
        ig1 ig1Var = this.h5;
        if (z10) {
            ((mg.c) drawable).a(i0.a.d(this.f5, ig1Var.getThemedColor(org.telegram.ui.ActionBar.j6.R9), ig1Var.getThemedColor(org.telegram.ui.ActionBar.j6.L7)));
        }
        Drawable[] drawableArr = this.h0;
        if (drawableArr != null) {
            Drawable drawable2 = drawableArr[0];
            if (drawable2 instanceof mg.c) {
                ((mg.c) drawable2).a(i0.a.d(this.f5, ig1Var.getThemedColor(org.telegram.ui.ActionBar.j6.R9), ig1Var.getThemedColor(org.telegram.ui.ActionBar.j6.L7)));
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
        ofFloat.addUpdateListener(new f21(this, 18));
        this.g5.setInterpolator(org.telegram.ui.Components.wr.g);
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
        org.telegram.ui.Components.p5 p5Var = this.Z4;
        if (p5Var != null) {
            p5Var.a(this);
        }
    }

    @Override // org.telegram.ui.Cells.r2, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b5 = false;
        org.telegram.ui.Components.p5 p5Var = this.Z4;
        if (p5Var != null) {
            p5Var.o(this);
        }
    }

    @Override // org.telegram.ui.Cells.r2, android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Components.si0 si0Var;
        bi.h4 h4Var;
        ig1 ig1Var = this.h5;
        if (ig1Var.getMessagesController().isMonoForum(-ig1Var.a)) {
            super.onDraw(canvas);
            return;
        }
        this.F3 = (!this.k0 || (h4Var = this.q2) == null) ? 0.0f : h4Var.getProgress() * AndroidUtilities.dp(30.0f);
        canvas.save();
        float f7 = this.F3;
        int i10 = -AndroidUtilities.dp(4.0f);
        this.E3 = i10;
        canvas.translate(f7, i10);
        canvas.drawColor(ig1Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
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
        if ((!this.c5 || (si0Var = this.e2) == null || si0Var.C != 0.0f) && (this.Z4 != null || this.a5 != null)) {
            int dp2 = AndroidUtilities.dp(10.0f);
            int dp3 = AndroidUtilities.dp(10.0f);
            int dp4 = AndroidUtilities.dp(28.0f);
            org.telegram.ui.Components.p5 p5Var = this.Z4;
            if (p5Var != null) {
                if (LocaleController.isRTL) {
                    p5Var.setBounds((getWidth() - dp2) - dp4, dp3, getWidth() - dp2, dp4 + dp3);
                } else {
                    p5Var.setBounds(dp2, dp3, dp2 + dp4, dp4 + dp3);
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

    public void setAnimatedEmojiDrawable(org.telegram.ui.Components.p5 p5Var) {
        org.telegram.ui.Components.p5 p5Var2 = this.Z4;
        if (p5Var2 == p5Var) {
            return;
        }
        if (p5Var2 != null && this.b5) {
            p5Var2.o(this);
        }
        if (p5Var != null) {
            p5Var.setColorFilter(org.telegram.ui.ActionBar.j6.v3);
        }
        this.Z4 = p5Var;
        if (p5Var == null || !this.b5) {
            return;
        }
        p5Var.a(this);
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
        ig1 ig1Var = this.h5;
        if (tL_forumTopic != null && this != ig1Var.b1) {
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
            setForumIcon(mg.d.c(getContext(), 1.0f, ig1Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ac), false));
        } else if (tL_forumTopic == null || tL_forumTopic.icon_emoji_id == 0) {
            setAnimatedEmojiDrawable(null);
            setForumIcon(mg.d.e(tL_forumTopic));
        } else {
            setForumIcon(null);
            org.telegram.ui.Components.p5 p5Var = this.Z4;
            if (p5Var == null || p5Var.i() != tL_forumTopic.icon_emoji_id) {
                int i11 = ig1Var.u0 ? 13 : 10;
                i10 = ((org.telegram.ui.ActionBar.p2) ig1Var).currentAccount;
                setAnimatedEmojiDrawable(new org.telegram.ui.Components.p5(i11, i10, tL_forumTopic.icon_emoji_id));
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
