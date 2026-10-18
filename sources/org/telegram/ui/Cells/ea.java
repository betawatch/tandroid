package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.bs;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class ea extends u1 {
    public final GestureDetector Ge;
    public final org.telegram.ui.Components.i5 He;
    public final org.telegram.ui.Components.i5 Ie;
    public final /* synthetic */ int Je;
    public final /* synthetic */ fa Ke;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea(fa faVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, Context context2, int i11) {
        super(context, i10, false, null, d6Var);
        this.Ke = faVar;
        this.Je = i11;
        this.Ge = new GestureDetector(context2, new da(this));
        bs bsVar = bs.g;
        this.He = new org.telegram.ui.Components.i5(this, 180L, bsVar, 0);
        this.Ie = new org.telegram.ui.Components.i5(this, 180L, bsVar, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int w02;
        int w03;
        MessageObject messageObject = getMessageObject();
        org.telegram.ui.Components.i5 i5Var = this.Ie;
        org.telegram.ui.Components.i5 i5Var2 = this.He;
        org.telegram.ui.Components.h9 h9Var = this.n9;
        if (messageObject == null || getMessageObject().overrideLinkColor < 0) {
            i5Var2.a(h9Var.b(), false);
            i5Var.a(h9Var.c(), false);
        } else {
            int i10 = getMessageObject().overrideLinkColor;
            if (i10 >= 14) {
                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                MessagesController.PeerColors peerColors = messagesController != null ? messagesController.peerColors : null;
                MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(i10) : null;
                if (color != null) {
                    int color1 = color.getColor1();
                    w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.p8[org.telegram.ui.Components.h9.f(color1)], this.Id);
                    w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.q8[org.telegram.ui.Components.h9.f(color1)], this.Id);
                } else {
                    long j10 = i10;
                    w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.p8[org.telegram.ui.Components.h9.e(j10)], this.Id);
                    w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.q8[org.telegram.ui.Components.h9.e(j10)], this.Id);
                }
            } else {
                long j11 = i10;
                w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.p8[org.telegram.ui.Components.h9.e(j11)], this.Id);
                w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.q8[org.telegram.ui.Components.h9.e(j11)], this.Id);
            }
            h9Var.i(i5Var2.a(w02, false), i5Var.a(w03, false));
        }
        if (getAvatarImage() != null && getAvatarImage().getImageHeight() != 0.0f) {
            getAvatarImage().setImageCoords(getAvatarImage().getImageX(), (getMeasuredHeight() - getAvatarImage().getImageHeight()) - AndroidUtilities.dp(4.0f), getAvatarImage().getImageWidth(), getAvatarImage().getImageHeight());
            getAvatarImage().setRoundRadius((int) (getAvatarImage().getImageHeight() / 2.0f));
            getAvatarImage().draw(canvas);
        } else if (this.Je == 2) {
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Cells.u1, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.Ke.a()) {
            return super.onTouchEvent(motionEvent);
        }
        this.Ge.onTouchEvent(motionEvent);
        return true;
    }
}
