package ai;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y2 implements org.telegram.ui.ActionBar.z1, jh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ e6 b;

    public /* synthetic */ y2(e6 e6Var, int i10) {
        this.a = i10;
        this.b = e6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [org.telegram.tgnet.TLRPC$UserFull] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v8, types: [org.telegram.messenger.MessagesStorage] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, org.telegram.tgnet.tl.TL_stories$PeerStories] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        long j3;
        TLRPC.ChatFull chatFull;
        ?? r92;
        ?? r12;
        boolean z10;
        boolean z11;
        TL_stories.StoryItem storyItem;
        int i11 = this.a;
        e6 e6Var = this.b;
        switch (i11) {
            case 0:
                a4 a4Var = e6Var.b2;
                if (a4Var != null) {
                    a4Var.A();
                    break;
                }
                break;
            default:
                c6 c6Var = e6Var.O1;
                boolean z12 = true;
                TLRPC.ChatFull chatFull2 = null;
                if (c6Var.f && (storyItem = c6Var.a) != null) {
                    TLRPC.MessageMedia messageMedia = storyItem.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        d2 d2Var = d2.W;
                        if (d2Var != null && d2Var.f(inputGroupCall)) {
                            d2.W.e();
                            if (d2.W != null) {
                                d2.W = null;
                                NotificationCenter.getInstance(e6Var.C2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(d2.W.g()));
                            }
                        }
                    }
                }
                TL_stories.StoryItem storyItem2 = c6Var.a;
                if (storyItem2 instanceof t8) {
                    u8 u8Var = ((t8) storyItem2).a;
                    TLRPC.MessageMedia messageMedia2 = storyItem2.media;
                    u8Var.getClass();
                    u8Var.F(new ArrayList(Arrays.asList(messageMedia2)));
                } else if (storyItem2 != null) {
                    e6 e6Var2 = c6Var.k;
                    l9 l9Var = e6Var2.S1;
                    long j10 = e6Var2.B1;
                    a0.i iVar = l9Var.i;
                    int i12 = l9Var.a;
                    if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted)) {
                        int i13 = 0;
                        while (i13 < 2) {
                            if (i13 == 0) {
                                j3 = 0;
                                TLRPC.ChatFull chatFull3 = chatFull2;
                                chatFull = chatFull3;
                                r92 = (TL_stories.PeerStories) iVar.f(j10);
                                r12 = chatFull3;
                            } else if (j10 >= 0) {
                                TLRPC.UserFull userFull = MessagesController.getInstance(i12).getUserFull(j10);
                                if (userFull != null) {
                                    j3 = 0;
                                    chatFull = chatFull2;
                                    r12 = userFull;
                                    r92 = userFull.stories;
                                } else {
                                    j3 = 0;
                                    chatFull = chatFull2;
                                    r12 = userFull;
                                    r92 = chatFull;
                                }
                            } else {
                                j3 = 0;
                                TLRPC.ChatFull chatFull4 = MessagesController.getInstance(i12).getChatFull(-j10);
                                if (chatFull4 != null) {
                                    chatFull = chatFull4;
                                    r92 = chatFull4.stories;
                                    r12 = chatFull2;
                                } else {
                                    TLRPC.ChatFull chatFull5 = chatFull2;
                                    chatFull = chatFull4;
                                    r92 = chatFull5;
                                    r12 = chatFull5;
                                }
                            }
                            if (r92 != 0) {
                                int i14 = 0;
                                while (true) {
                                    if (i14 < r92.stories.size()) {
                                        if (r92.stories.get(i14).id == storyItem2.id) {
                                            r92.stories.remove(i14);
                                            if (r92.stories.size() == 0) {
                                                if (!l9Var.K(j10)) {
                                                    iVar.l(j10);
                                                    l9Var.g.remove(r92);
                                                    l9Var.h.remove(r92);
                                                }
                                                if (j10 > j3) {
                                                    TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(j10));
                                                    if (user != null) {
                                                        user.stories_unavailable = z12;
                                                    }
                                                } else {
                                                    TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-j10));
                                                    if (chat != null) {
                                                        chat.stories_unavailable = true;
                                                    }
                                                }
                                            }
                                        } else {
                                            i14++;
                                            z12 = true;
                                        }
                                    }
                                }
                            }
                            if (chatFull != null) {
                                z10 = false;
                                MessagesStorage.getInstance(i12).updateChatInfo(chatFull, false);
                            } else {
                                z10 = false;
                            }
                            if (r12 != 0) {
                                MessagesStorage.getInstance(i12).updateUserInfo(r12, z10);
                            }
                            i13++;
                            z12 = true;
                            chatFull2 = null;
                        }
                        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
                        tL_stories_deleteStories.peer = MessagesController.getInstance(i12).getInputPeer(j10);
                        tL_stories_deleteStories.id.add(Integer.valueOf(storyItem2.id));
                        ConnectionsManager.getInstance(i12).sendRequest(tL_stories_deleteStories, new y7(l9Var, 5));
                        y9 y9Var = l9Var.k;
                        y9Var.b.getStorageQueue().postRunnable(new v9(y9Var, j10, storyItem2.id, 1));
                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                        MessagesController.getInstance(i12).checkArchiveFolder();
                        l9Var.k0(j10, Arrays.asList(storyItem2));
                    }
                } else {
                    k9 k9Var = c6Var.b;
                    if (k9Var != null) {
                        k9Var.a();
                    }
                }
                e6Var.j1();
                if (!e6Var.K1 || e6Var.A1 != 0) {
                    int i15 = e6Var.J1;
                    int i16 = e6Var.A1;
                    if (i15 >= i16) {
                        e6Var.J1 = i16 - 1;
                        z11 = false;
                    } else {
                        z11 = false;
                        if (i15 < 0) {
                            e6Var.J1 = 0;
                        }
                    }
                    e6Var.f1(z11);
                    jc jcVar = e6Var.J0;
                    if (jcVar != null) {
                        jcVar.p();
                        break;
                    }
                } else {
                    ((ac) e6Var.Q1).j();
                    break;
                }
                break;
        }
    }

    @Override // jh.a
    public void j(int i10) {
        if (i10 == 0) {
            this.b.P0();
        }
    }
}
