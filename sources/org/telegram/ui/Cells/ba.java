package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ba extends s1 {
    public final GestureDetector Be;
    public final org.telegram.ui.Components.f5 Ce;
    public final org.telegram.ui.Components.f5 De;
    public final /* synthetic */ int Ee;
    public final /* synthetic */ ca Fe;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba(ca caVar, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, Context context2, int i11) {
        super(context, i10, false, null, c6Var);
        this.Fe = caVar;
        this.Ee = i11;
        this.Be = new GestureDetector(context2, new aa(this));
        jr jrVar = jr.g;
        this.Ce = new org.telegram.ui.Components.f5(this, 180L, jrVar, 0);
        this.De = new org.telegram.ui.Components.f5(this, 180L, jrVar, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int v02;
        int v03;
        MessageObject messageObject = getMessageObject();
        org.telegram.ui.Components.f5 f5Var = this.De;
        org.telegram.ui.Components.f5 f5Var2 = this.Ce;
        org.telegram.ui.Components.e9 e9Var = this.j9;
        if (messageObject == null || getMessageObject().overrideLinkColor < 0) {
            f5Var2.a(e9Var.b(), false);
            f5Var.a(e9Var.c(), false);
        } else {
            int i10 = getMessageObject().overrideLinkColor;
            if (i10 >= 14) {
                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                MessagesController.PeerColors peerColors = messagesController != null ? messagesController.peerColors : null;
                MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(i10) : null;
                if (color != null) {
                    int color1 = color.getColor1();
                    v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.p8[org.telegram.ui.Components.e9.f(color1)], this.Ed);
                    v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q8[org.telegram.ui.Components.e9.f(color1)], this.Ed);
                } else {
                    long j10 = i10;
                    v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.p8[org.telegram.ui.Components.e9.e(j10)], this.Ed);
                    v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q8[org.telegram.ui.Components.e9.e(j10)], this.Ed);
                }
            } else {
                long j11 = i10;
                v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.p8[org.telegram.ui.Components.e9.e(j11)], this.Ed);
                v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q8[org.telegram.ui.Components.e9.e(j11)], this.Ed);
            }
            e9Var.i(f5Var2.a(v02, false), f5Var.a(v03, false));
        }
        if (getAvatarImage() != null && getAvatarImage().getImageHeight() != 0.0f) {
            getAvatarImage().setImageCoords(getAvatarImage().getImageX(), (getMeasuredHeight() - getAvatarImage().getImageHeight()) - AndroidUtilities.dp(4.0f), getAvatarImage().getImageWidth(), getAvatarImage().getImageHeight());
            getAvatarImage().setRoundRadius((int) (getAvatarImage().getImageHeight() / 2.0f));
            getAvatarImage().draw(canvas);
        } else if (this.Ee == 2) {
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Cells.s1, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.Fe.a()) {
            return super.onTouchEvent(motionEvent);
        }
        this.Be.onTouchEvent(motionEvent);
        return true;
    }
}
