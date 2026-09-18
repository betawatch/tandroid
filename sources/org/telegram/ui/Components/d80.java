package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d80 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ org.telegram.ui.ActionBar.g3 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d80(za zaVar, Object obj, long j3, int i10) {
        this.a = i10;
        this.c = zaVar;
        this.d = obj;
        this.b = j3;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                g80.m((g80) this.c, this.b, (TLRPC.TL_messages_importChatInvite) this.d, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                xh.g4.V((xh.g4) this.c, (TL_stars.TL_starGiftUnique) this.d, this.b, (yh.d3) obj, (nf.e) obj2);
                break;
            default:
                yh.j7.Q((yh.j7) this.c, (j51) this.d, this.b, (Boolean) obj, (String) obj2);
                break;
        }
    }

    public /* synthetic */ d80(g80 g80Var, long j3, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.a = 0;
        this.c = g80Var;
        this.b = j3;
        this.d = tL_messages_importChatInvite;
    }
}
