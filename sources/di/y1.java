package di;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y1 implements org.telegram.ui.ActionBar.b2, lh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ q4 b;

    public /* synthetic */ y1(q4 q4Var, int i10) {
        this.a = i10;
        this.b = q4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [org.telegram.tgnet.TLRPC$UserFull] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v9, types: [org.telegram.messenger.MessagesStorage] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, org.telegram.tgnet.tl.TL_stories$PeerStories] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        long j10;
        TLRPC.ChatFull chatFull;
        ?? r92;
        ?? r12;
        boolean z10;
        boolean z11;
        TL_stories.StoryItem storyItem;
        int i11 = this.a;
        q4 q4Var = this.b;
        switch (i11) {
            case 0:
                u2 u2Var = q4Var.Q1;
                if (u2Var != null) {
                    u2Var.x();
                    break;
                }
                break;
            default:
                o4 o4Var = q4Var.D1;
                int i12 = 0;
                boolean z12 = true;
                TLRPC.ChatFull chatFull2 = null;
                if (o4Var.f && (storyItem = o4Var.a) != null) {
                    TLRPC.MessageMedia messageMedia = storyItem.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        h1 h1Var = h1.W;
                        if (h1Var != null && h1Var.f(inputGroupCall)) {
                            h1.W.e();
                            if (h1.W != null) {
                                h1.W = null;
                                NotificationCenter.getInstance(q4Var.r2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(h1.W.g()));
                            }
                        }
                    }
                }
                TL_stories.StoryItem storyItem2 = o4Var.a;
                if (storyItem2 instanceof r6) {
                    s6 s6Var = ((r6) storyItem2).a;
                    TLRPC.MessageMedia messageMedia2 = storyItem2.media;
                    s6Var.getClass();
                    s6Var.F(new ArrayList(Arrays.asList(messageMedia2)));
                } else if (storyItem2 != null) {
                    q4 q4Var2 = o4Var.k;
                    h7 h7Var = q4Var2.H1;
                    long j11 = q4Var2.q1;
                    a0.h hVar = h7Var.i;
                    int i13 = h7Var.a;
                    if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted)) {
                        int i14 = 0;
                        while (i14 < 2) {
                            if (i14 == 0) {
                                j10 = 0;
                                TLRPC.ChatFull chatFull3 = chatFull2;
                                chatFull = chatFull3;
                                r92 = (TL_stories.PeerStories) hVar.f(j11);
                                r12 = chatFull3;
                            } else if (j11 >= 0) {
                                TLRPC.UserFull userFull = MessagesController.getInstance(i13).getUserFull(j11);
                                if (userFull != null) {
                                    j10 = 0;
                                    chatFull = chatFull2;
                                    r12 = userFull;
                                    r92 = userFull.stories;
                                } else {
                                    j10 = 0;
                                    chatFull = chatFull2;
                                    r12 = userFull;
                                    r92 = chatFull;
                                }
                            } else {
                                j10 = 0;
                                TLRPC.ChatFull chatFull4 = MessagesController.getInstance(i13).getChatFull(-j11);
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
                                int i15 = i12;
                                while (true) {
                                    if (i15 < r92.stories.size()) {
                                        if (r92.stories.get(i15).id == storyItem2.id) {
                                            r92.stories.remove(i15);
                                            if (r92.stories.size() == 0) {
                                                if (!h7Var.K(j11)) {
                                                    hVar.l(j11);
                                                    h7Var.g.remove(r92);
                                                    h7Var.h.remove(r92);
                                                }
                                                if (j11 > j10) {
                                                    TLRPC.User user = MessagesController.getInstance(i13).getUser(Long.valueOf(j11));
                                                    if (user != null) {
                                                        user.stories_unavailable = z12;
                                                    }
                                                } else {
                                                    TLRPC.Chat chat = MessagesController.getInstance(i13).getChat(Long.valueOf(-j11));
                                                    if (chat != null) {
                                                        chat.stories_unavailable = true;
                                                    }
                                                }
                                            }
                                        } else {
                                            i15++;
                                            z12 = true;
                                        }
                                    }
                                }
                            }
                            if (chatFull != null) {
                                z10 = false;
                                MessagesStorage.getInstance(i13).updateChatInfo(chatFull, false);
                            } else {
                                z10 = false;
                            }
                            if (r12 != 0) {
                                MessagesStorage.getInstance(i13).updateUserInfo(r12, z10);
                            }
                            i14++;
                            i12 = 0;
                            z12 = true;
                            chatFull2 = null;
                        }
                        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
                        tL_stories_deleteStories.peer = MessagesController.getInstance(i13).getInputPeer(j11);
                        tL_stories_deleteStories.id.add(Integer.valueOf(storyItem2.id));
                        ConnectionsManager.getInstance(i13).sendRequest(tL_stories_deleteStories, new g6(h7Var, 5));
                        u7 u7Var = h7Var.k;
                        u7Var.b.getStorageQueue().postRunnable(new r7(u7Var, j11, storyItem2.id, 1));
                        NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                        MessagesController.getInstance(i13).checkArchiveFolder();
                        h7Var.k0(j11, Arrays.asList(storyItem2));
                    }
                } else {
                    g7 g7Var = o4Var.b;
                    if (g7Var != null) {
                        g7Var.a();
                    }
                }
                q4Var.h1();
                if (!q4Var.z1 || q4Var.p1 != 0) {
                    int i16 = q4Var.y1;
                    int i17 = q4Var.p1;
                    if (i16 >= i17) {
                        q4Var.y1 = i17 - 1;
                        z11 = false;
                    } else {
                        z11 = false;
                        if (i16 < 0) {
                            q4Var.y1 = 0;
                        }
                    }
                    q4Var.d1(z11);
                    y9 y9Var = q4Var.y0;
                    if (y9Var != null) {
                        y9Var.p();
                        break;
                    }
                } else {
                    ((p9) q4Var.F1).j();
                    break;
                }
                break;
        }
    }

    @Override // lh.a
    public void i(int i10) {
        if (i10 == 0) {
            this.b.N0();
        }
    }
}
