package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ea extends t1 {
    public final GestureDetector Be;
    public final org.telegram.ui.Components.b5 Ce;
    public final org.telegram.ui.Components.b5 De;
    public final /* synthetic */ int Ee;
    public final /* synthetic */ fa Fe;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea(fa faVar, Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var, Context context2, int i10) {
        super(context, i9, false, null, b6Var);
        this.Fe = faVar;
        this.Ee = i10;
        this.Be = new GestureDetector(context2, new da(this));
        gr grVar = gr.g;
        this.Ce = new org.telegram.ui.Components.b5(this, 180L, grVar, 0);
        this.De = new org.telegram.ui.Components.b5(this, 180L, grVar, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int v02;
        int v03;
        MessageObject messageObject = getMessageObject();
        org.telegram.ui.Components.b5 b5Var = this.De;
        org.telegram.ui.Components.b5 b5Var2 = this.Ce;
        org.telegram.ui.Components.z8 z8Var = this.j9;
        if (messageObject == null || getMessageObject().overrideLinkColor < 0) {
            b5Var2.a(z8Var.b(), false);
            b5Var.a(z8Var.c(), false);
        } else {
            int i9 = getMessageObject().overrideLinkColor;
            if (i9 >= 14) {
                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                MessagesController.PeerColors peerColors = messagesController != null ? messagesController.peerColors : null;
                MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(i9) : null;
                if (color != null) {
                    int color1 = color.getColor1();
                    v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.p8[org.telegram.ui.Components.z8.f(color1)], this.Ed);
                    v03 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.q8[org.telegram.ui.Components.z8.f(color1)], this.Ed);
                } else {
                    long j10 = i9;
                    v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.p8[org.telegram.ui.Components.z8.e(j10)], this.Ed);
                    v03 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.q8[org.telegram.ui.Components.z8.e(j10)], this.Ed);
                }
            } else {
                long j11 = i9;
                v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.p8[org.telegram.ui.Components.z8.e(j11)], this.Ed);
                v03 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.q8[org.telegram.ui.Components.z8.e(j11)], this.Ed);
            }
            z8Var.i(b5Var2.a(v02, false), b5Var.a(v03, false));
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

    @Override // org.telegram.ui.Cells.t1, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.Fe.a()) {
            return super.onTouchEvent(motionEvent);
        }
        this.Be.onTouchEvent(motionEvent);
        return true;
    }
}
