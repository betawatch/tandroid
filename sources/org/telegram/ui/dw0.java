package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class dw0 extends ClickableSpan {
    public final /* synthetic */ TLRPC.TL_username a;
    public final /* synthetic */ String b;
    public final /* synthetic */ lw0 c;

    public dw0(lw0 lw0Var, TLRPC.TL_username tL_username, String str) {
        this.c = lw0Var;
        this.a = tL_username;
        this.b = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        ProfileActivity profileActivity = this.c.e;
        TLRPC.TL_username tL_username = this.a;
        if (!tL_username.editable) {
            if (profileActivity.o5 == this) {
                return;
            }
            profileActivity.h5(this);
            TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo = new TL_fragment.TL_getCollectibleInfo();
            TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername = new TL_fragment.TL_inputCollectibleUsername();
            tL_inputCollectibleUsername.username = tL_username.username;
            tL_getCollectibleInfo.collectible = tL_inputCollectibleUsername;
            profileActivity.getConnectionsManager().bindRequestToGuid(profileActivity.getConnectionsManager().sendRequest(tL_getCollectibleInfo, new e00(26, this, tL_username)), profileActivity.getClassGuid());
            return;
        }
        profileActivity.h5(null);
        String str = profileActivity.getMessagesController().X2 + "/" + this.b;
        TLRPC.Chat chat = profileActivity.F2;
        if (chat == null || !chat.noforwards) {
            org.telegram.messenger.g0.g(str);
            profileActivity.M.j(56, 0L, null);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(textPaint.linkColor);
    }
}
