package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class n80 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ org.telegram.ui.ActionBar.h3 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n80(ab abVar, Object obj, long j3, int i10) {
        this.a = i10;
        this.c = abVar;
        this.d = obj;
        this.b = j3;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                q80.m((q80) this.c, this.b, (TLRPC.TL_messages_importChatInvite) this.d, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                wh.g4.V((wh.g4) this.c, (TL_stars.TL_starGiftUnique) this.d, this.b, (xh.a3) obj, (nf.e) obj2);
                break;
            default:
                xh.k7.Q((xh.k7) this.c, (v51) this.d, this.b, (Boolean) obj, (String) obj2);
                break;
        }
    }

    public /* synthetic */ n80(q80 q80Var, long j3, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.a = 0;
        this.c = q80Var;
        this.b = j3;
        this.d = tL_messages_importChatInvite;
    }
}
