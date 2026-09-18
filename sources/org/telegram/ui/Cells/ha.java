package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.qr;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ha extends t1 {
    public final GestureDetector Ge;
    public final org.telegram.ui.Components.f5 He;
    public final org.telegram.ui.Components.f5 Ie;
    public final /* synthetic */ int Je;
    public final /* synthetic */ ja Ke;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha(ja jaVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, Context context2, int i11) {
        super(context, i10, false, null, f6Var);
        this.Ke = jaVar;
        this.Je = i11;
        this.Ge = new GestureDetector(context2, new ga(this));
        qr qrVar = qr.g;
        this.He = new org.telegram.ui.Components.f5(this, 180L, qrVar, 0);
        this.Ie = new org.telegram.ui.Components.f5(this, 180L, qrVar, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int v02;
        int v03;
        MessageObject messageObject = getMessageObject();
        org.telegram.ui.Components.f5 f5Var = this.Ie;
        org.telegram.ui.Components.f5 f5Var2 = this.He;
        org.telegram.ui.Components.f9 f9Var = this.n9;
        if (messageObject == null || getMessageObject().overrideLinkColor < 0) {
            f5Var2.a(f9Var.b(), false);
            f5Var.a(f9Var.c(), false);
        } else {
            int i10 = getMessageObject().overrideLinkColor;
            if (i10 >= 14) {
                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                MessagesController.PeerColors peerColors = messagesController != null ? messagesController.peerColors : null;
                MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(i10) : null;
                if (color != null) {
                    int color1 = color.getColor1();
                    v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p8[org.telegram.ui.Components.f9.f(color1)], this.Id);
                    v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q8[org.telegram.ui.Components.f9.f(color1)], this.Id);
                } else {
                    long j3 = i10;
                    v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p8[org.telegram.ui.Components.f9.e(j3)], this.Id);
                    v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q8[org.telegram.ui.Components.f9.e(j3)], this.Id);
                }
            } else {
                long j10 = i10;
                v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p8[org.telegram.ui.Components.f9.e(j10)], this.Id);
                v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q8[org.telegram.ui.Components.f9.e(j10)], this.Id);
            }
            f9Var.i(f5Var2.a(v02, false), f5Var.a(v03, false));
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

    @Override // org.telegram.ui.Cells.t1, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.Ke.a()) {
            return super.onTouchEvent(motionEvent);
        }
        this.Ge.onTouchEvent(motionEvent);
        return true;
    }
}
