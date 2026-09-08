package bi;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class m2 implements org.telegram.ui.ActionBar.a2, kh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ o5 b;

    public /* synthetic */ m2(o5 o5Var, int i10) {
        this.a = i10;
        this.b = o5Var;
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
    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        long j3;
        TLRPC.ChatFull chatFull;
        ?? r92;
        ?? r12;
        boolean z10;
        boolean z11;
        TL_stories.StoryItem storyItem;
        int i11 = this.a;
        o5 o5Var = this.b;
        switch (i11) {
            case 0:
                n3 n3Var = o5Var.b2;
                if (n3Var != null) {
                    n3Var.B();
                    break;
                }
                break;
            default:
                m5 m5Var = o5Var.O1;
                boolean z12 = true;
                TLRPC.ChatFull chatFull2 = null;
                if (m5Var.f && (storyItem = m5Var.a) != null) {
                    TLRPC.MessageMedia messageMedia = storyItem.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        t1 t1Var = t1.W;
                        if (t1Var != null && t1Var.f(inputGroupCall)) {
                            t1.W.e();
                            if (t1.W != null) {
                                t1.W = null;
                                NotificationCenter.getInstance(o5Var.C2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(t1.W.g()));
                            }
                        }
                    }
                }
                TL_stories.StoryItem storyItem2 = m5Var.a;
                if (storyItem2 instanceof a8) {
                    b8 b8Var = ((a8) storyItem2).a;
                    TLRPC.MessageMedia messageMedia2 = storyItem2.media;
                    b8Var.getClass();
                    b8Var.F(new ArrayList(Arrays.asList(messageMedia2)));
                } else if (storyItem2 != null) {
                    o5 o5Var2 = m5Var.k;
                    u8 u8Var = o5Var2.S1;
                    long j10 = o5Var2.B1;
                    a0.i iVar = u8Var.i;
                    int i12 = u8Var.a;
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
                                                if (!u8Var.K(j10)) {
                                                    iVar.l(j10);
                                                    u8Var.g.remove(r92);
                                                    u8Var.h.remove(r92);
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
                        ConnectionsManager.getInstance(i12).sendRequest(tL_stories_deleteStories, new g7(u8Var, 5));
                        h9 h9Var = u8Var.k;
                        h9Var.b.getStorageQueue().postRunnable(new f9(h9Var, j10, storyItem2.id, 0));
                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                        MessagesController.getInstance(i12).checkArchiveFolder();
                        u8Var.k0(j10, Arrays.asList(storyItem2));
                    }
                } else {
                    t8 t8Var = m5Var.b;
                    if (t8Var != null) {
                        t8Var.a();
                    }
                }
                o5Var.j1();
                if (!o5Var.K1 || o5Var.A1 != 0) {
                    int i15 = o5Var.J1;
                    int i16 = o5Var.A1;
                    if (i15 >= i16) {
                        o5Var.J1 = i16 - 1;
                        z11 = false;
                    } else {
                        z11 = false;
                        if (i15 < 0) {
                            o5Var.J1 = 0;
                        }
                    }
                    o5Var.f1(z11);
                    pb pbVar = o5Var.J0;
                    if (pbVar != null) {
                        pbVar.p();
                        break;
                    }
                } else {
                    ((gb) o5Var.Q1).j();
                    break;
                }
                break;
        }
    }

    @Override // kh.a
    public void k(int i10) {
        if (i10 == 0) {
            this.b.P0();
        }
    }
}
