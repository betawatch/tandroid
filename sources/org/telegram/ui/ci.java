package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ci extends mh0 {
    public final /* synthetic */ rn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci(rn rnVar, Context context, int i10, MessageObject messageObject) {
        super(context);
        this.e = rnVar;
        this.a = null;
        if (!messageObject.isRoundVideo()) {
            messageObject.isVoice();
        }
        org.telegram.ui.Components.h00 h00Var = new org.telegram.ui.Components.h00(context, null);
        this.c = h00Var;
        h00Var.f(org.telegram.ui.ActionBar.g6.G8, org.telegram.ui.ActionBar.g6.i6, -1);
        h00Var.setViewType(13);
        h00Var.setIsSingleCell(false);
        addView(h00Var, h7.z5.c(-1.0f, -2));
        org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80(context, null);
        this.b = p80Var;
        p80Var.setTextSize(1, 14.0f);
        p80Var.setGravity(19);
        p80Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false));
        p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.gc, false));
        p80Var.setEllipsize(TextUtils.TruncateAt.END);
        p80Var.setSingleLine();
        p80Var.setLines(1);
        p80Var.setMaxLines(1);
        addView(p80Var, h7.z5.d(-1, -2.0f, 19, 12.0f, 0.0f, 12.0f, 0.0f));
        TLRPC.TL_channels_getMessageAuthor tL_channels_getMessageAuthor = new TLRPC.TL_channels_getMessageAuthor();
        tL_channels_getMessageAuthor.channel = MessagesController.getInstance(i10).getInputChannel(-messageObject.getDialogId());
        tL_channels_getMessageAuthor.id = messageObject.getId();
        p80Var.setAlpha(0.0f);
        ConnectionsManager.getInstance(i10).sendRequest(tL_channels_getMessageAuthor, new hh.u1(this, i10, 8));
        setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I5, false), 6, 0));
        setEnabled(false);
    }
}
