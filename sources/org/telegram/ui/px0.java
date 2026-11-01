package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class px0 extends ClickableSpan {
    public final /* synthetic */ TLRPC.TL_username a;
    public final /* synthetic */ String b;
    public final /* synthetic */ wx0 c;

    public px0(wx0 wx0Var, TLRPC.TL_username tL_username, String str) {
        this.c = wx0Var;
        this.a = tL_username;
        this.b = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        ProfileActivity profileActivity = this.c.e;
        TLRPC.TL_username tL_username = this.a;
        if (!tL_username.editable) {
            if (profileActivity.i5 == this) {
                return;
            }
            profileActivity.e5(this);
            TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo = new TL_fragment.TL_getCollectibleInfo();
            TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername = new TL_fragment.TL_inputCollectibleUsername();
            tL_inputCollectibleUsername.username = tL_username.username;
            tL_getCollectibleInfo.collectible = tL_inputCollectibleUsername;
            profileActivity.getConnectionsManager().bindRequestToGuid(profileActivity.getConnectionsManager().sendRequest(tL_getCollectibleInfo, new sl0(8, this, tL_username)), profileActivity.getClassGuid());
            return;
        }
        profileActivity.e5(null);
        String str = profileActivity.getMessagesController().U2 + "/" + this.b;
        TLRPC.Chat chat = profileActivity.D2;
        if (chat == null || !chat.noforwards) {
            org.telegram.messenger.i0.g(str);
            profileActivity.L.j(56, 0L, null);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(textPaint.linkColor);
    }
}
