package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o80 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e3 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o80(bb bbVar, Object obj, long j3, int i10) {
        this.a = i10;
        this.c = bbVar;
        this.d = obj;
        this.b = j3;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                r80.m((r80) this.c, this.b, (TLRPC.TL_messages_importChatInvite) this.d, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                xh.h4.V((xh.h4) this.c, (TL_stars.TL_starGiftUnique) this.d, this.b, (yh.a3) obj, (nf.e) obj2);
                break;
            default:
                yh.h7.Q((yh.h7) this.c, (v51) this.d, this.b, (Boolean) obj, (String) obj2);
                break;
        }
    }

    public /* synthetic */ o80(r80 r80Var, long j3, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.a = 0;
        this.c = r80Var;
        this.b = j3;
        this.d = tL_messages_importChatInvite;
    }
}
