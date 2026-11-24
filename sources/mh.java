// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class mh implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ mh(int i, b61 b61Var, my0 my0Var, long j) {
        this.a = (byte) 0;
        this.b = i;
        this.d = b61Var;
        this.e = my0Var;
        this.c = j;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                gm.c3(new vf(tLObject, this.b, (b61) obj2, (my0) obj, this.c, tL_error));
                break;
            case 1:
                gm.c3(new wz(obj2, obj, this.b, (Object) tLObject, this.c, (byte) 2));
                break;
            case 2:
                bd2 bd2Var = (bd2) obj2;
                k47 k47Var = (k47) obj;
                if (tLObject != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    TL_stories.StoryItem storyItem = tL_stories_stories.stories.size() > 0 ? tL_stories_stories.stories.get(0) : null;
                    if (storyItem == null) {
                        storyItem = new TL_stories.TL_storyItemDeleted();
                    }
                    TL_stories.StoryItem storyItem2 = storyItem;
                    storyItem2.lastUpdateTime = System.currentTimeMillis();
                    storyItem2.id = i;
                    gm.c3(new p97((Object) bd2Var, (Object) k47Var, this.c, (Object) storyItem2, (byte) 6));
                    break;
                }
                break;
            case 3:
                gm.c3(new wz(obj2, (Object) tLObject, this.b, obj, this.c, (byte) 5));
                break;
            case 4:
                gm.c3(new vf((t57) obj2, tL_error, tLObject, this.c, this.b, (TLRPC.Chat) obj));
                break;
            case 5:
                oc7 oc7Var = (oc7) obj2;
                TLRPC.TL_help_promoData tL_help_promoData = (TLRPC.TL_help_promoData) obj;
                if (i == oc7Var.p2) {
                    oc7Var.o2 = 0;
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    byte b2 = 2;
                    if (tL_messages_peerDialogs == null || tL_messages_peerDialogs.dialogs.isEmpty()) {
                        gm.c3(new ba7(oc7Var, b2));
                    } else {
                        oc7Var.getMessagesStorage().j1(tL_help_promoData.users, tL_help_promoData.chats, true, true);
                        TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                        tL_messages_dialogs.chats = tL_messages_peerDialogs.chats;
                        tL_messages_dialogs.users = tL_messages_peerDialogs.users;
                        tL_messages_dialogs.dialogs = tL_messages_peerDialogs.dialogs;
                        tL_messages_dialogs.messages = tL_messages_peerDialogs.messages;
                        oc7Var.getMessagesStorage().a1(tL_messages_dialogs, 2);
                        gm.c3(new p97((Object) oc7Var, (Object) tL_help_promoData, (Object) tL_messages_peerDialogs, this.c, (byte) 1));
                    }
                    oc7Var.n2 = false;
                    break;
                }
                break;
            case 6:
                gm.c3(new o77(obj2, obj, this.b, this.c, (byte) 18));
                break;
            default:
                gm.c3(new wz(obj2, (Object) tLObject, this.b, obj, this.c, (byte) 13));
                break;
        }
    }

    public /* synthetic */ mh(t57 t57Var, long j, int i, TLRPC.Chat chat) {
        this.a = (byte) 4;
        this.d = t57Var;
        this.c = j;
        this.b = i;
        this.e = chat;
    }

    public /* synthetic */ mh(Object obj, int i, Object obj2, long j, byte b) {
        this.a = b;
        this.d = obj;
        this.b = i;
        this.e = obj2;
        this.c = j;
    }

    public /* synthetic */ mh(Object obj, Object obj2, int i, long j, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = i;
        this.c = j;
    }
}
