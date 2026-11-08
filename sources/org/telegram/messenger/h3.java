package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class h3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h3(int i7, int i10, long j3, Object obj, Object obj2) {
        this.a = i10;
        this.d = obj;
        this.b = i7;
        this.e = obj2;
        this.c = j3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                i3 i3Var = (i3) this.d;
                ij ijVar = (ij) this.e;
                if (tLObject != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    TL_stories.StoryItem storyItem = tL_stories_stories.stories.size() > 0 ? tL_stories_stories.stories.get(0) : null;
                    if (storyItem == null) {
                        storyItem = new TL_stories.TL_storyItemDeleted();
                    }
                    TL_stories.StoryItem storyItem2 = storyItem;
                    storyItem2.lastUpdateTime = System.currentTimeMillis();
                    storyItem2.id = this.b;
                    g0.h3(new jm(i3Var, ijVar, this.c, storyItem2, 2));
                    break;
                }
                break;
            case 1:
                g0.h3(new z1((ui) this.d, tLObject, this.b, (c20) this.e, this.c));
                break;
            default:
                qp qpVar = (qp) this.d;
                TLRPC.TL_help_promoData tL_help_promoData = (TLRPC.TL_help_promoData) this.e;
                if (this.b == qpVar.w2) {
                    qpVar.v2 = 0;
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    if (tL_messages_peerDialogs == null || tL_messages_peerDialogs.dialogs.isEmpty()) {
                        g0.h3(new vj(qpVar, 24));
                    } else {
                        qpVar.getMessagesStorage().m1(tL_help_promoData.users, tL_help_promoData.chats, true, true);
                        TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                        tL_messages_dialogs.chats = tL_messages_peerDialogs.chats;
                        tL_messages_dialogs.users = tL_messages_peerDialogs.users;
                        tL_messages_dialogs.dialogs = tL_messages_peerDialogs.dialogs;
                        tL_messages_dialogs.messages = tL_messages_peerDialogs.messages;
                        qpVar.getMessagesStorage().d1(tL_messages_dialogs, 2);
                        g0.h3(new jm(qpVar, tL_help_promoData, tL_messages_peerDialogs, this.c, 1));
                    }
                    qpVar.u2 = false;
                    break;
                }
                break;
        }
    }
}
