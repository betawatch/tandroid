package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class mb1 extends org.telegram.ui.Cells.v2 {
    public boolean a5;
    public int b5;
    public TLRPC.TL_forumTopic c5;
    public org.telegram.ui.Components.f5 d5;
    public Drawable e5;
    public boolean f5;
    public boolean g5;
    public boolean h5;
    public Boolean i5;
    public float j5;
    public ValueAnimator k5;
    public final /* synthetic */ pb1 l5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb1(pb1 pb1Var, Context context, boolean z10) {
        super(context, z10);
        this.l5 = pb1Var;
        this.b5 = -1;
        this.y = false;
        this.I = pb1Var.isInPreviewMode() ? 11 : 50;
        this.U = 24.0f;
        this.J = 64;
        this.K = 76;
        this.n1 = true;
    }

    @Override // org.telegram.ui.Cells.v2
    public final boolean L() {
        return this.h5;
    }

    public final void m0() {
        Drawable drawable = this.e5;
        boolean z10 = drawable instanceof gg.d;
        pb1 pb1Var = this.l5;
        if (z10) {
            ((gg.d) drawable).a(i0.b.f(this.j5, pb1Var.getThemedColor(org.telegram.ui.ActionBar.t6.R9), pb1Var.getThemedColor(org.telegram.ui.ActionBar.t6.L7)));
        }
        Drawable[] drawableArr = this.h0;
        if (drawableArr != null) {
            Drawable drawable2 = drawableArr[0];
            if (drawable2 instanceof gg.d) {
                ((gg.d) drawable2).a(i0.b.f(this.j5, pb1Var.getThemedColor(org.telegram.ui.ActionBar.t6.R9), pb1Var.getThemedColor(org.telegram.ui.ActionBar.t6.L7)));
            }
        }
        invalidate();
    }

    public final void n0(boolean z10) {
        boolean z11 = this.i5 != null;
        ValueAnimator valueAnimator = this.k5;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.k5 = null;
        }
        this.i5 = Boolean.valueOf(z10);
        if (!z11) {
            this.j5 = z10 ? 1.0f : 0.0f;
            m0();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.j5, z10 ? 1.0f : 0.0f);
        this.k5 = ofFloat;
        ofFloat.addUpdateListener(new u01(this, 14));
        this.k5.setInterpolator(org.telegram.ui.Components.gr.g);
        this.k5.start();
    }

    @Override // org.telegram.ui.Cells.v2, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5 = true;
        org.telegram.ui.Components.f5 f5Var = this.d5;
        if (f5Var != null) {
            f5Var.a(this);
        }
    }

    @Override // org.telegram.ui.Cells.v2, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5 = false;
        org.telegram.ui.Components.f5 f5Var = this.d5;
        if (f5Var != null) {
            f5Var.n(this);
        }
    }

    @Override // org.telegram.ui.Cells.v2, android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Components.mh0 mh0Var;
        org.telegram.ui.Cells.n2 n2Var;
        pb1 pb1Var = this.l5;
        if (pb1Var.getMessagesController().x2(-pb1Var.a)) {
            super.onDraw(canvas);
            return;
        }
        this.F3 = (!this.k0 || (n2Var = this.q2) == null) ? 0.0f : n2Var.getProgress() * org.telegram.messenger.i0.L(30.0f);
        canvas.save();
        float f7 = this.F3;
        int i10 = -org.telegram.messenger.i0.L(4.0f);
        this.E3 = i10;
        canvas.translate(f7, i10);
        canvas.drawColor(pb1Var.getThemedColor(org.telegram.ui.ActionBar.t6.d6));
        super.onDraw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(this.w1, 0.0f);
        if (this.a5) {
            int L = this.t2 ? 0 : org.telegram.messenger.i0.L(this.I);
            if (org.telegram.messenger.cd.X) {
                canvas.drawLine(0.0f - this.w1, getMeasuredHeight() - 1, getMeasuredWidth() - L, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.k0);
            } else {
                canvas.drawLine(L - this.w1, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.k0);
            }
        }
        if ((!this.g5 || (mh0Var = this.e2) == null || mh0Var.C != 0.0f) && (this.d5 != null || this.e5 != null)) {
            int L2 = org.telegram.messenger.i0.L(10.0f);
            int L3 = org.telegram.messenger.i0.L(10.0f);
            int L4 = org.telegram.messenger.i0.L(28.0f);
            org.telegram.ui.Components.f5 f5Var = this.d5;
            if (f5Var != null) {
                if (org.telegram.messenger.cd.X) {
                    f5Var.setBounds((getWidth() - L2) - L4, L3, getWidth() - L2, L4 + L3);
                } else {
                    f5Var.setBounds(L2, L3, L2 + L4, L4 + L3);
                }
                this.d5.draw(canvas);
            } else {
                if (org.telegram.messenger.cd.X) {
                    this.e5.setBounds((getWidth() - L2) - L4, L3, getWidth() - L2, L4 + L3);
                } else {
                    this.e5.setBounds(L2, L3, L2 + L4, L4 + L3);
                }
                this.e5.draw(canvas);
            }
        }
        canvas.restore();
    }

    public void setAnimatedEmojiDrawable(org.telegram.ui.Components.f5 f5Var) {
        org.telegram.ui.Components.f5 f5Var2 = this.d5;
        if (f5Var2 == f5Var) {
            return;
        }
        if (f5Var2 != null && this.f5) {
            f5Var2.n(this);
        }
        if (f5Var != null) {
            f5Var.setColorFilter(org.telegram.ui.ActionBar.t6.v3);
        }
        this.d5 = f5Var;
        if (f5Var == null || !this.f5) {
            return;
        }
        f5Var.a(this);
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
            n0(tL_forumTopic != null && tL_forumTopic.hidden);
        }
        this.g5 = tL_forumTopic != null && tL_forumTopic.id == 1;
        pb1 pb1Var = this.l5;
        if (tL_forumTopic != null && this != pb1Var.c1) {
            if (tL_forumTopic.hidden) {
                this.L1 = true;
                this.M1 = org.telegram.ui.ActionBar.t6.d9;
                this.N1 = org.telegram.ui.ActionBar.t6.c9;
                this.O1 = "Unhide";
                this.P1 = 2131743909;
                this.Q1 = org.telegram.ui.ActionBar.t6.y1;
            } else {
                this.L1 = true;
                this.M1 = org.telegram.ui.ActionBar.t6.c9;
                this.N1 = org.telegram.ui.ActionBar.t6.d9;
                this.O1 = "Hide";
                this.P1 = 2131749334;
                this.Q1 = org.telegram.ui.ActionBar.t6.x1;
            }
            invalidate();
        }
        if (this.k0) {
            return;
        }
        if (tL_forumTopic != null && tL_forumTopic.id == 1) {
            setAnimatedEmojiDrawable(null);
            setForumIcon(gg.e.c(getContext(), 1.0f, pb1Var.getThemedColor(org.telegram.ui.ActionBar.t6.od), false));
        } else if (tL_forumTopic == null || tL_forumTopic.icon_emoji_id == 0) {
            setAnimatedEmojiDrawable(null);
            setForumIcon(gg.e.e(tL_forumTopic));
        } else {
            setForumIcon(null);
            org.telegram.ui.Components.f5 f5Var = this.d5;
            if (f5Var == null || f5Var.h() != tL_forumTopic.icon_emoji_id) {
                int i11 = pb1Var.u0 ? 13 : 10;
                i10 = ((org.telegram.ui.ActionBar.k2) pb1Var).currentAccount;
                setAnimatedEmojiDrawable(new org.telegram.ui.Components.f5(i11, i10, tL_forumTopic.icon_emoji_id));
            }
        }
        if (tL_forumTopic != null && tL_forumTopic.hidden) {
            z10 = true;
        }
        n0(z10);
        z();
    }

    @Override // org.telegram.ui.Cells.v2, org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        super.updateColors();
        try {
            if (this.i5 != null) {
                m0();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.Cells.v2
    public final void z() {
        super.z();
        m0();
    }
}
