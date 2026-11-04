package org.telegram.ui;

import java.util.Collections;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uw b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ pu(uw uwVar, long j10, boolean z10, int i3) {
        this.a = i3;
        this.b = uwVar;
        this.c = j10;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        TLRPC.Chat chat;
        int i3 = this.a;
        boolean z10 = this.d;
        long j10 = this.c;
        uw uwVar = this.b;
        switch (i3) {
            case 0:
                uw uwVar2 = this.b;
                ei.z6 P1 = uwVar2.getMessagesController().P1();
                long j11 = this.c;
                boolean z11 = this.d;
                P1.l0(j11, z11, false);
                m2.t tVar = new m2.t(12, false);
                tVar.b = new pu(uwVar2, j11, z11, 1);
                tVar.c = new pu(uwVar2, j11, z11, 2);
                if (j11 >= 0) {
                    TLRPC.User a22 = uwVar2.getMessagesController().a2(Long.valueOf(j11));
                    str = org.telegram.messenger.g5.m(15, a22.first_name, null);
                    chat = a22;
                } else {
                    TLRPC.Chat M0 = uwVar2.getMessagesController().M0(Long.valueOf(-j11));
                    str = M0.title;
                    chat = M0;
                }
                uwVar2.T = org.telegram.ui.Components.fc.X().V(Collections.singletonList(chat), uwVar2.q4() ? org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("StoriesMovedToDialogs", null, 2131744768, str)) : org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("StoriesMovedToContacts", null, 2131744769, org.telegram.messenger.g5.m(15, str, null))), null, tVar).j();
                break;
            case 1:
                uwVar.getMessagesController().P1().l0(j10, !z10, false);
                break;
            default:
                uwVar.getMessagesController().P1().l0(j10, z10, true);
                break;
        }
    }
}
