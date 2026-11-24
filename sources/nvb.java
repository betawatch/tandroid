// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class nvb extends ue3 {
    public boolean b5;
    public int c5;
    public TLRPC.TL_forumTopic d5;
    public vl e5;
    public Drawable f5;
    public boolean g5;
    public boolean h5;
    public boolean i5;
    public Boolean j5;
    public float k5;
    public ValueAnimator l5;
    public final /* synthetic */ qvb m5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nvb(qvb qvbVar, Context context, boolean z) {
        super(context, z);
        this.m5 = qvbVar;
        this.c5 = -1;
        this.y = false;
        this.J = qvbVar.isInPreviewMode() ? (byte) 11 : (byte) 50;
        this.V = 24.0f;
        this.K = (byte) 64;
        this.L = (byte) 76;
        this.o1 = true;
    }

    @Override // ue3
    public final boolean O() {
        return this.i5;
    }

    public final void o0() {
        Drawable drawable = this.f5;
        boolean z = drawable instanceof lm4;
        qvb qvbVar = this.m5;
        if (z) {
            ((lm4) drawable).a(bm2.f(this.k5, qvbVar.getThemedColor(bkb.Q9), qvbVar.getThemedColor(bkb.K7)));
        }
        Drawable[] drawableArr = this.i0;
        if (drawableArr != null) {
            Drawable drawable2 = drawableArr[0];
            if (drawable2 instanceof lm4) {
                ((lm4) drawable2).a(bm2.f(this.k5, qvbVar.getThemedColor(bkb.Q9), qvbVar.getThemedColor(bkb.K7)));
            }
        }
        invalidate();
    }

    @Override // ue3, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.g5 = true;
        vl vlVar = this.e5;
        if (vlVar != null) {
            vlVar.b(this);
        }
    }

    @Override // ue3, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.g5 = false;
        vl vlVar = this.e5;
        if (vlVar != null) {
            vlVar.o(this);
        }
    }

    @Override // ue3, android.view.View
    public final void onDraw(Canvas canvas) {
        vu8 vu8Var;
        ya yaVar;
        qvb qvbVar = this.m5;
        if (qvbVar.getMessagesController().x2(-qvbVar.a)) {
            super.onDraw(canvas);
            return;
        }
        this.G3 = (!this.l0 || (yaVar = this.r2) == null) ? 0.0f : yaVar.getProgress() * gl.L(30.0f);
        canvas.save();
        float f = this.G3;
        int i = -gl.L(4.0f);
        this.F3 = i;
        canvas.translate(f, i);
        canvas.drawColor(qvbVar.getThemedColor(bkb.c6));
        super.onDraw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(this.x1, 0.0f);
        if (this.b5) {
            int L = this.u2 ? 0 : gl.L(this.J);
            boolean z = k96.a0;
            float f2 = this.x1;
            if (z) {
                canvas.drawLine(0.0f - f2, getMeasuredHeight() - 1, getMeasuredWidth() - L, getMeasuredHeight() - 1, bkb.j0);
            } else {
                canvas.drawLine(L - f2, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, bkb.j0);
            }
        }
        if ((!this.h5 || (vu8Var = this.f2) == null || vu8Var.C != 0.0f) && (this.e5 != null || this.f5 != null)) {
            int L2 = gl.L(10.0f);
            int L3 = gl.L(10.0f);
            int L4 = gl.L(28.0f);
            vl vlVar = this.e5;
            boolean z2 = k96.a0;
            if (vlVar != null) {
                if (z2) {
                    vlVar.setBounds((getWidth() - L2) - L4, L3, getWidth() - L2, L4 + L3);
                } else {
                    vlVar.setBounds(L2, L3, L2 + L4, L4 + L3);
                }
                this.e5.draw(canvas);
            } else {
                Drawable drawable = this.f5;
                if (z2) {
                    drawable.setBounds((getWidth() - L2) - L4, L3, getWidth() - L2, L4 + L3);
                } else {
                    drawable.setBounds(L2, L3, L2 + L4, L4 + L3);
                }
                this.f5.draw(canvas);
            }
        }
        canvas.restore();
    }

    public final void p0(boolean z) {
        boolean z2 = this.j5 != null;
        ValueAnimator valueAnimator = this.l5;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.l5 = null;
        }
        this.j5 = Boolean.valueOf(z);
        if (!z2) {
            this.k5 = z ? 1.0f : 0.0f;
            o0();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.k5, z ? 1.0f : 0.0f);
        this.l5 = ofFloat;
        ofFloat.addUpdateListener(new gja(this, (byte) 28));
        this.l5.setInterpolator(s33.g);
        this.l5.start();
    }

    public void setAnimatedEmojiDrawable(vl vlVar) {
        vl vlVar2 = this.e5;
        if (vlVar2 != vlVar) {
            if (vlVar2 != null && this.g5) {
                vlVar2.o(this);
            }
            if (vlVar != null) {
                vlVar.setColorFilter(bkb.u3);
            }
            this.e5 = vlVar;
            if (vlVar == null || !this.g5) {
                return;
            }
            vlVar.b(this);
        }
    }

    public void setForumIcon(Drawable drawable) {
        this.f5 = drawable;
    }

    public void setTopicIcon(TLRPC.TL_forumTopic tL_forumTopic) {
        int i;
        this.d5 = tL_forumTopic;
        boolean z = false;
        this.i5 = tL_forumTopic != null && tL_forumTopic.closed;
        if (this.l0) {
            p0(tL_forumTopic != null && tL_forumTopic.hidden);
        }
        this.h5 = tL_forumTopic != null && tL_forumTopic.id == 1;
        qvb qvbVar = this.m5;
        if (tL_forumTopic != null && this != qvbVar.d1) {
            if (tL_forumTopic.hidden) {
                this.M1 = true;
                this.N1 = bkb.c9;
                this.O1 = bkb.b9;
                this.P1 = "Unhide";
                this.Q1 = 2131743645;
                this.R1 = bkb.x1;
            } else {
                this.M1 = true;
                this.N1 = bkb.b9;
                this.O1 = bkb.c9;
                this.P1 = "Hide";
                this.Q1 = 2131749133;
                this.R1 = bkb.w1;
            }
            invalidate();
        }
        if (this.l0) {
            return;
        }
        if (tL_forumTopic != null) {
            if (tL_forumTopic.id == 1) {
                setAnimatedEmojiDrawable(null);
                setForumIcon(mm4.d(getContext(), 1.0f, qvbVar.getThemedColor(bkb.qd), false));
            } else if (tL_forumTopic.icon_emoji_id != 0) {
                setForumIcon(null);
                vl vlVar = this.e5;
                if (vlVar == null || vlVar.h() != tL_forumTopic.icon_emoji_id) {
                    int i2 = qvbVar.v0 ? 13 : 10;
                    i = ((d) qvbVar).currentAccount;
                    setAnimatedEmojiDrawable(new vl(i2, i, tL_forumTopic.icon_emoji_id));
                }
            }
            if (tL_forumTopic != null && tL_forumTopic.hidden) {
                z = true;
            }
            p0(z);
            z();
        }
        setAnimatedEmojiDrawable(null);
        setForumIcon(mm4.f(tL_forumTopic));
        if (tL_forumTopic != null) {
            z = true;
        }
        p0(z);
        z();
    }

    @Override // ue3, tjb
    public final void updateColors() {
        super.updateColors();
        try {
            if (this.j5 != null) {
                o0();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // ue3
    public final void z() {
        super.z();
        o0();
    }
}
