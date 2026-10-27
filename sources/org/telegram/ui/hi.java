package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class hi extends oh0 {
    public final /* synthetic */ wn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi(wn wnVar, Context context, int i10, MessageObject messageObject) {
        super(context);
        this.f = wnVar;
        this.a = null;
        if (!messageObject.isRoundVideo()) {
            messageObject.isVoice();
        }
        org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(context, null);
        this.c = c10Var;
        c10Var.e(org.telegram.ui.ActionBar.y6.G8, org.telegram.ui.ActionBar.y6.i6, -1);
        c10Var.setViewType(13);
        c10Var.setIsSingleCell(false);
        addView(c10Var, org.telegram.ui.Components.kb1.g(-1.0f, -2));
        org.telegram.ui.Components.aa0 aa0Var = new org.telegram.ui.Components.aa0(context, null);
        this.b = aa0Var;
        aa0Var.setTextSize(1, 14.0f);
        aa0Var.setGravity(19);
        org.telegram.ui.ActionBar.f7.V(aa0Var, org.telegram.ui.ActionBar.y6.E8, null);
        org.telegram.ui.ActionBar.f7.H(aa0Var, org.telegram.ui.ActionBar.y6.gc, null);
        aa0Var.setEllipsize(TextUtils.TruncateAt.END);
        aa0Var.setSingleLine();
        aa0Var.setLines(1);
        aa0Var.setMaxLines(1);
        addView(aa0Var, org.telegram.ui.Components.kb1.h(-1, -2.0f, 19, 12.0f, 0.0f, 12.0f, 0.0f));
        TLRPC.TL_channels_getMessageAuthor tL_channels_getMessageAuthor = new TLRPC.TL_channels_getMessageAuthor();
        tL_channels_getMessageAuthor.channel = MessagesController.getInstance(i10).getInputChannel(-messageObject.getDialogId());
        tL_channels_getMessageAuthor.id = messageObject.getId();
        aa0Var.setAlpha(0.0f);
        ConnectionsManager.getInstance(i10).sendRequest(tL_channels_getMessageAuthor, new bi.l2(this, i10, 8));
        setBackground(org.telegram.ui.ActionBar.y6.Z(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.I5, false), 6, 0));
        setEnabled(false);
    }
}
