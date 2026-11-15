package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class mk implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ mk(int i7, long j3, long j10, np npVar) {
        this.a = 0;
        this.b = npVar;
        this.d = j3;
        this.c = i7;
        this.e = j10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Chat chat;
        switch (this.a) {
            case 0:
                np npVar = this.b;
                long j3 = this.d;
                long j10 = this.e;
                if (tLObject != null) {
                    TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) tLObject;
                    a0.h hVar = new a0.h();
                    int i7 = 0;
                    for (int i10 = 0; i10 < updates_channeldifference.users.size(); i10++) {
                        TLRPC.User user = updates_channeldifference.users.get(i10);
                        hVar.k(user, user.id);
                    }
                    int i11 = 0;
                    while (true) {
                        if (i11 < updates_channeldifference.chats.size()) {
                            chat = updates_channeldifference.chats.get(i11);
                            if (chat.id != j3) {
                                i11++;
                            }
                        } else {
                            chat = null;
                        }
                    }
                    TLRPC.Chat chat2 = chat;
                    ArrayList arrayList = new ArrayList();
                    if (!updates_channeldifference.other_updates.isEmpty()) {
                        while (i7 < updates_channeldifference.other_updates.size()) {
                            TLRPC.Update update = updates_channeldifference.other_updates.get(i7);
                            if (update instanceof TL_update.TL_updateMessageID) {
                                arrayList.add((TL_update.TL_updateMessageID) update);
                                updates_channeldifference.other_updates.remove(i7);
                                i7--;
                            }
                            i7++;
                        }
                    }
                    npVar.getMessagesStorage().m1(updates_channeldifference.users, updates_channeldifference.chats, true, true);
                    g0.h3(new fi(16, npVar, updates_channeldifference));
                    npVar.getMessagesStorage().a.c(new ok(npVar, arrayList, j3, updates_channeldifference, chat2, hVar, this.c, j10));
                    break;
                } else if (tL_error != null) {
                    g0.h3(new wl(npVar, tL_error, j3, 0));
                    npVar.a1.e(j3);
                    if (j10 != 0) {
                        npVar.getMessagesStorage().q1(j10);
                        break;
                    }
                }
                break;
            case 1:
                g0.h3(new tk(this.b, this.c, this.d, this.e, 0));
                break;
            default:
                g0.h3(new tk(this.b, this.c, this.d, this.e, 2));
                break;
        }
    }

    public /* synthetic */ mk(np npVar, int i7, long j3, long j10, int i10) {
        this.a = i10;
        this.b = npVar;
        this.c = i7;
        this.d = j3;
        this.e = j10;
    }
}
