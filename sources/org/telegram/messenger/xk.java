package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class xk implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ vp b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ xk(int i10, long j10, long j11, vp vpVar) {
        this.a = 0;
        this.b = vpVar;
        this.d = j10;
        this.c = i10;
        this.e = j11;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Chat chat;
        switch (this.a) {
            case 0:
                vp vpVar = this.b;
                long j10 = this.d;
                long j11 = this.e;
                if (tLObject != null) {
                    TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) tLObject;
                    a0.h hVar = new a0.h();
                    int i10 = 0;
                    for (int i11 = 0; i11 < updates_channeldifference.users.size(); i11++) {
                        TLRPC.User user = updates_channeldifference.users.get(i11);
                        hVar.k(user, user.id);
                    }
                    int i12 = 0;
                    while (true) {
                        if (i12 < updates_channeldifference.chats.size()) {
                            chat = updates_channeldifference.chats.get(i12);
                            if (chat.id != j10) {
                                i12++;
                            }
                        } else {
                            chat = null;
                        }
                    }
                    TLRPC.Chat chat2 = chat;
                    ArrayList arrayList = new ArrayList();
                    if (!updates_channeldifference.other_updates.isEmpty()) {
                        while (i10 < updates_channeldifference.other_updates.size()) {
                            TLRPC.Update update = updates_channeldifference.other_updates.get(i10);
                            if (update instanceof TL_update.TL_updateMessageID) {
                                arrayList.add((TL_update.TL_updateMessageID) update);
                                updates_channeldifference.other_updates.remove(i10);
                                i10--;
                            }
                            i10++;
                        }
                    }
                    vpVar.getMessagesStorage().m1(updates_channeldifference.users, updates_channeldifference.chats, true, true);
                    i0.g3(new oi(11, vpVar, updates_channeldifference));
                    vpVar.getMessagesStorage().a.c(new zk(vpVar, arrayList, j10, updates_channeldifference, chat2, hVar, this.c, j11));
                    break;
                } else if (tL_error != null) {
                    i0.g3(new nl(vpVar, tL_error, j10, 0));
                    vpVar.Z0.e(j10);
                    if (j11 != 0) {
                        vpVar.getMessagesStorage().q1(j11);
                        break;
                    }
                }
                break;
            case 1:
                i0.g3(new fk(this.b, this.c, this.d, this.e, 2));
                break;
            default:
                i0.g3(new fk(this.b, this.c, this.d, this.e, 0));
                break;
        }
    }

    public /* synthetic */ xk(vp vpVar, int i10, long j10, long j11, int i11) {
        this.a = i11;
        this.b = vpVar;
        this.c = i10;
        this.d = j10;
        this.e = j11;
    }
}
