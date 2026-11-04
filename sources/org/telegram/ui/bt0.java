package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class bt0 extends FrameLayout {
    public org.telegram.ui.Components.h9 a;
    public final org.telegram.ui.Cells.q1 b;
    public Drawable c;
    public final Drawable d;
    public final org.telegram.messenger.zi e;
    public final /* synthetic */ PrivacyControlActivity f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bt0(PrivacyControlActivity privacyControlActivity, Context context) {
        super(context);
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        this.f = privacyControlActivity;
        setWillNotDraw(false);
        setClipToPadding(false);
        this.d = org.telegram.ui.ActionBar.k6.Y0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
        setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f));
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        i3 = ((org.telegram.ui.ActionBar.d2) privacyControlActivity).currentAccount;
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i3);
        i10 = ((org.telegram.ui.ActionBar.d2) privacyControlActivity).currentAccount;
        TLRPC.User a22 = s12.a2(Long.valueOf(org.telegram.messenger.h10.i(i10).e()));
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.message = org.telegram.messenger.bd.M0(2131746840, null);
        tL_message.date = currentTimeMillis - 3540;
        tL_message.dialog_id = 1L;
        tL_message.flags = org.telegram.messenger.hs.k4;
        tL_message.from_id = new TLRPC.TL_peerUser();
        tL_message.id = 1;
        TLRPC.TL_messageFwdHeader tL_messageFwdHeader = new TLRPC.TL_messageFwdHeader();
        tL_message.fwd_from = tL_messageFwdHeader;
        tL_messageFwdHeader.from_name = org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name);
        tL_message.media = new TLRPC.TL_messageMediaEmpty();
        tL_message.out = false;
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_message.peer_id = tL_peerUser;
        i11 = ((org.telegram.ui.ActionBar.d2) privacyControlActivity).currentAccount;
        tL_peerUser.user_id = org.telegram.messenger.h10.i(i11).e();
        i12 = ((org.telegram.ui.ActionBar.d2) privacyControlActivity).currentAccount;
        org.telegram.messenger.zi ziVar = new org.telegram.messenger.zi(i12, tL_message, true, false);
        this.e = ziVar;
        ziVar.T = 1L;
        ziVar.Q1 = false;
        i13 = ((org.telegram.ui.ActionBar.d2) privacyControlActivity).currentAccount;
        org.telegram.ui.Cells.q1 q1Var = new org.telegram.ui.Cells.q1(context, i13);
        this.b = q1Var;
        q1Var.setDelegate(new mb.b(19));
        q1Var.e6 = false;
        q1Var.setFullyDraw(true);
        q1Var.u3(ziVar, null, false, false, false, false);
        addView(q1Var, b8.mf.o(-1, -2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        PrivacyControlActivity.w0(this.f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.b.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        PrivacyControlActivity.w0(this.f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        PrivacyControlActivity.w0(this.f);
        org.telegram.ui.Components.h9 h9Var = this.a;
        if (h9Var != null) {
            h9Var.dispose();
            this.a = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable t02 = org.telegram.ui.ActionBar.k6.t0();
        if (t02 != null && this.c != t02) {
            org.telegram.ui.Components.h9 h9Var = this.a;
            if (h9Var != null) {
                h9Var.dispose();
                this.a = null;
            }
            this.c = t02;
        }
        Drawable drawable = this.c;
        if ((drawable instanceof ColorDrawable) || (drawable instanceof GradientDrawable) || (drawable instanceof org.telegram.ui.Components.la0)) {
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            Drawable drawable2 = this.c;
            if (drawable2 instanceof org.telegram.ui.Components.j9) {
                this.a = ((org.telegram.ui.Components.j9) drawable2).c(canvas, this);
            } else {
                drawable2.draw(canvas);
            }
        } else if (drawable instanceof BitmapDrawable) {
            if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                canvas.save();
                float f10 = 2.0f / org.telegram.messenger.g0.p;
                canvas.scale(f10, f10);
                this.c.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f10), (int) Math.ceil(getMeasuredHeight() / f10));
            } else {
                int measuredHeight = getMeasuredHeight();
                float max = Math.max(getMeasuredWidth() / this.c.getIntrinsicWidth(), measuredHeight / this.c.getIntrinsicHeight());
                int ceil = (int) Math.ceil(this.c.getIntrinsicWidth() * max);
                int ceil2 = (int) Math.ceil(this.c.getIntrinsicHeight() * max);
                int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                int i3 = (measuredHeight - ceil2) / 2;
                canvas.save();
                canvas.clipRect(0, 0, ceil, getMeasuredHeight());
                this.c.setBounds(measuredWidth, i3, ceil + measuredWidth, ceil2 + i3);
            }
            this.c.draw(canvas);
            canvas.restore();
        } else {
            super.onDraw(canvas);
        }
        if ((getParent() instanceof org.telegram.ui.Components.tj0) && ((org.telegram.ui.Components.tj0) getParent()).b1()) {
            return;
        }
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        Drawable drawable3 = this.d;
        drawable3.setBounds(0, 0, measuredWidth2, measuredHeight2);
        drawable3.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSetPressed(boolean z10) {
    }
}
