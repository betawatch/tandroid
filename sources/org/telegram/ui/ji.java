package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class ji extends uh0 {
    public final /* synthetic */ wn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji(wn wnVar, Context context, int i10, MessageObject messageObject) {
        super(context);
        this.e = wnVar;
        this.a = null;
        if (!messageObject.isRoundVideo()) {
            messageObject.isVoice();
        }
        org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
        this.c = u00Var;
        u00Var.f(org.telegram.ui.ActionBar.h6.G8, org.telegram.ui.ActionBar.h6.i6, -1);
        u00Var.setViewType(13);
        u00Var.setIsSingleCell(false);
        addView(u00Var, w7.y5.c(-1.0f, -2));
        org.telegram.ui.Components.n90 n90Var = new org.telegram.ui.Components.n90(context, null);
        this.b = n90Var;
        n90Var.setTextSize(1, 14.0f);
        n90Var.setGravity(19);
        n90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.E8, false));
        n90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.gc, false));
        n90Var.setEllipsize(TextUtils.TruncateAt.END);
        n90Var.setSingleLine();
        n90Var.setLines(1);
        n90Var.setMaxLines(1);
        addView(n90Var, w7.y5.d(-1, -2.0f, 19, 12.0f, 0.0f, 12.0f, 0.0f));
        TLRPC.TL_channels_getMessageAuthor tL_channels_getMessageAuthor = new TLRPC.TL_channels_getMessageAuthor();
        tL_channels_getMessageAuthor.channel = MessagesController.getInstance(i10).getInputChannel(-messageObject.getDialogId());
        tL_channels_getMessageAuthor.id = messageObject.getId();
        n90Var.setAlpha(0.0f);
        ConnectionsManager.getInstance(i10).sendRequest(tL_channels_getMessageAuthor, new ai.i8(this, i10, 6));
        setBackground(org.telegram.ui.ActionBar.h6.Y(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.I5, false), 6, 0));
        setEnabled(false);
    }
}
