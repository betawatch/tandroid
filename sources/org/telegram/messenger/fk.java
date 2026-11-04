package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class fk implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ hp b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ fk(int i3, long j10, long j11, hp hpVar) {
        this.a = 0;
        this.b = hpVar;
        this.d = j10;
        this.c = i3;
        this.e = j11;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Chat chat;
        switch (this.a) {
            case 0:
                hp hpVar = this.b;
                long j10 = this.d;
                long j11 = this.e;
                if (tLObject != null) {
                    TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) tLObject;
                    a0.h hVar = new a0.h();
                    int i3 = 0;
                    for (int i10 = 0; i10 < updates_channeldifference.users.size(); i10++) {
                        TLRPC.User user = updates_channeldifference.users.get(i10);
                        hVar.k(user, user.id);
                    }
                    int i11 = 0;
                    while (true) {
                        if (i11 < updates_channeldifference.chats.size()) {
                            chat = updates_channeldifference.chats.get(i11);
                            if (chat.id != j10) {
                                i11++;
                            }
                        } else {
                            chat = null;
                        }
                    }
                    TLRPC.Chat chat2 = chat;
                    ArrayList arrayList = new ArrayList();
                    if (!updates_channeldifference.other_updates.isEmpty()) {
                        while (i3 < updates_channeldifference.other_updates.size()) {
                            TLRPC.Update update = updates_channeldifference.other_updates.get(i3);
                            if (update instanceof TL_update.TL_updateMessageID) {
                                arrayList.add((TL_update.TL_updateMessageID) update);
                                updates_channeldifference.other_updates.remove(i3);
                                i3--;
                            }
                            i3++;
                        }
                    }
                    hpVar.getMessagesStorage().m1(updates_channeldifference.users, updates_channeldifference.chats, true, true);
                    g0.h3(new yh(16, hpVar, updates_channeldifference));
                    hpVar.getMessagesStorage().a.c(new hk(hpVar, arrayList, j10, updates_channeldifference, chat2, hVar, this.c, j11));
                    break;
                } else if (tL_error != null) {
                    g0.h3(new pl(hpVar, tL_error, j10, 0));
                    hpVar.a1.e(j10);
                    if (j11 != 0) {
                        hpVar.getMessagesStorage().q1(j11);
                        break;
                    }
                }
                break;
            case 1:
                g0.h3(new mk(this.b, this.c, this.d, this.e, 0));
                break;
            default:
                g0.h3(new mk(this.b, this.c, this.d, this.e, 2));
                break;
        }
    }

    public /* synthetic */ fk(hp hpVar, int i3, long j10, long j11, int i10) {
        this.a = i10;
        this.b = hpVar;
        this.c = i3;
        this.d = j10;
        this.e = j11;
    }
}
