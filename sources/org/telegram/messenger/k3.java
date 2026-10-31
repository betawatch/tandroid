package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class k3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ k3(int i10, int i11, long j10, Object obj, Object obj2) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.e = obj2;
        this.c = j10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                l3 l3Var = (l3) this.d;
                jj jjVar = (jj) this.e;
                if (tLObject != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    TL_stories.StoryItem storyItem = tL_stories_stories.stories.size() > 0 ? tL_stories_stories.stories.get(0) : null;
                    if (storyItem == null) {
                        storyItem = new TL_stories.TL_storyItemDeleted();
                    }
                    TL_stories.StoryItem storyItem2 = storyItem;
                    storyItem2.lastUpdateTime = System.currentTimeMillis();
                    storyItem2.id = this.b;
                    i0.g3(new wm(l3Var, jjVar, this.c, storyItem2, 2));
                    break;
                }
                break;
            case 1:
                i0.g3(new d2((ui) this.d, tLObject, this.b, (q20) this.e, this.c));
                break;
            default:
                vp vpVar = (vp) this.d;
                TLRPC.TL_help_promoData tL_help_promoData = (TLRPC.TL_help_promoData) this.e;
                if (this.b == vpVar.w2) {
                    vpVar.v2 = 0;
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    if (tL_messages_peerDialogs == null || tL_messages_peerDialogs.dialogs.isEmpty()) {
                        i0.g3(new zj(vpVar, 21));
                    } else {
                        vpVar.getMessagesStorage().m1(tL_help_promoData.users, tL_help_promoData.chats, true, true);
                        TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                        tL_messages_dialogs.chats = tL_messages_peerDialogs.chats;
                        tL_messages_dialogs.users = tL_messages_peerDialogs.users;
                        tL_messages_dialogs.dialogs = tL_messages_peerDialogs.dialogs;
                        tL_messages_dialogs.messages = tL_messages_peerDialogs.messages;
                        vpVar.getMessagesStorage().d1(tL_messages_dialogs, 2);
                        i0.g3(new wm(vpVar, tL_help_promoData, tL_messages_peerDialogs, this.c, 1));
                    }
                    vpVar.u2 = false;
                    break;
                }
                break;
        }
    }
}
