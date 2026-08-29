package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class di extends jh0 {
    public final /* synthetic */ tn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di(tn tnVar, Context context, int i10, MessageObject messageObject) {
        super(context);
        this.e = tnVar;
        this.a = null;
        if (!messageObject.isRoundVideo()) {
            messageObject.isVoice();
        }
        org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(context, null);
        this.c = p00Var;
        p00Var.f(org.telegram.ui.ActionBar.g6.G8, org.telegram.ui.ActionBar.g6.i6, -1);
        p00Var.setViewType(13);
        p00Var.setIsSingleCell(false);
        addView(p00Var, i7.f6.c(-1.0f, -2));
        org.telegram.ui.Components.y80 y80Var = new org.telegram.ui.Components.y80(context, null);
        this.b = y80Var;
        y80Var.setTextSize(1, 14.0f);
        y80Var.setGravity(19);
        y80Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false));
        y80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.gc, false));
        y80Var.setEllipsize(TextUtils.TruncateAt.END);
        y80Var.setSingleLine();
        y80Var.setLines(1);
        y80Var.setMaxLines(1);
        addView(y80Var, i7.f6.d(-1, -2.0f, 19, 12.0f, 0.0f, 12.0f, 0.0f));
        TLRPC.TL_channels_getMessageAuthor tL_channels_getMessageAuthor = new TLRPC.TL_channels_getMessageAuthor();
        tL_channels_getMessageAuthor.channel = MessagesController.getInstance(i10).getInputChannel(-messageObject.getDialogId());
        tL_channels_getMessageAuthor.id = messageObject.getId();
        y80Var.setAlpha(0.0f);
        ConnectionsManager.getInstance(i10).sendRequest(tL_channels_getMessageAuthor, new jh.s1(this, i10, 7));
        setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I5, false), 6, 0));
        setEnabled(false);
    }
}
