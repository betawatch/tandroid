package ai;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z2 implements org.telegram.ui.ActionBar.a2, jh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;

    public /* synthetic */ z2(f6 f6Var, int i10) {
        this.a = i10;
        this.b = f6Var;
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
    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        long j3;
        TLRPC.ChatFull chatFull;
        ?? r92;
        ?? r12;
        boolean z10;
        boolean z11;
        TL_stories.StoryItem storyItem;
        int i11 = this.a;
        f6 f6Var = this.b;
        switch (i11) {
            case 0:
                b4 b4Var = f6Var.b2;
                if (b4Var != null) {
                    b4Var.z();
                    break;
                }
                break;
            default:
                d6 d6Var = f6Var.O1;
                int i12 = 0;
                boolean z12 = true;
                TLRPC.ChatFull chatFull2 = null;
                if (d6Var.f && (storyItem = d6Var.a) != null) {
                    TLRPC.MessageMedia messageMedia = storyItem.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        d2 d2Var = d2.W;
                        if (d2Var != null && d2Var.f(inputGroupCall)) {
                            d2.W.e();
                            if (d2.W != null) {
                                d2.W = null;
                                NotificationCenter.getInstance(f6Var.C2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(d2.W.g()));
                            }
                        }
                    }
                }
                TL_stories.StoryItem storyItem2 = d6Var.a;
                if (storyItem2 instanceof u8) {
                    v8 v8Var = ((u8) storyItem2).a;
                    TLRPC.MessageMedia messageMedia2 = storyItem2.media;
                    v8Var.getClass();
                    v8Var.F(new ArrayList(Arrays.asList(messageMedia2)));
                } else if (storyItem2 != null) {
                    f6 f6Var2 = d6Var.k;
                    m9 m9Var = f6Var2.S1;
                    long j10 = f6Var2.B1;
                    a0.i iVar = m9Var.i;
                    int i13 = m9Var.a;
                    if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted)) {
                        int i14 = 0;
                        while (i14 < 2) {
                            if (i14 == 0) {
                                j3 = 0;
                                TLRPC.ChatFull chatFull3 = chatFull2;
                                chatFull = chatFull3;
                                r92 = (TL_stories.PeerStories) iVar.f(j10);
                                r12 = chatFull3;
                            } else if (j10 >= 0) {
                                TLRPC.UserFull userFull = MessagesController.getInstance(i13).getUserFull(j10);
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
                                TLRPC.ChatFull chatFull4 = MessagesController.getInstance(i13).getChatFull(-j10);
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
                                                if (!m9Var.K(j10)) {
                                                    iVar.l(j10);
                                                    m9Var.g.remove(r92);
                                                    m9Var.h.remove(r92);
                                                }
                                                if (j10 > j3) {
                                                    TLRPC.User user = MessagesController.getInstance(i13).getUser(Long.valueOf(j10));
                                                    if (user != null) {
                                                        user.stories_unavailable = z12;
                                                    }
                                                } else {
                                                    TLRPC.Chat chat = MessagesController.getInstance(i13).getChat(Long.valueOf(-j10));
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
                        tL_stories_deleteStories.peer = MessagesController.getInstance(i13).getInputPeer(j10);
                        tL_stories_deleteStories.id.add(Integer.valueOf(storyItem2.id));
                        ConnectionsManager.getInstance(i13).sendRequest(tL_stories_deleteStories, new z7(m9Var, 5));
                        z9 z9Var = m9Var.k;
                        z9Var.b.getStorageQueue().postRunnable(new w9(z9Var, j10, storyItem2.id, 1));
                        NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                        MessagesController.getInstance(i13).checkArchiveFolder();
                        m9Var.k0(j10, Arrays.asList(storyItem2));
                    }
                } else {
                    l9 l9Var = d6Var.b;
                    if (l9Var != null) {
                        l9Var.a();
                    }
                }
                f6Var.j1();
                if (!f6Var.K1 || f6Var.A1 != 0) {
                    int i16 = f6Var.J1;
                    int i17 = f6Var.A1;
                    if (i16 >= i17) {
                        f6Var.J1 = i17 - 1;
                        z11 = false;
                    } else {
                        z11 = false;
                        if (i16 < 0) {
                            f6Var.J1 = 0;
                        }
                    }
                    f6Var.f1(z11);
                    kc kcVar = f6Var.J0;
                    if (kcVar != null) {
                        kcVar.p();
                        break;
                    }
                } else {
                    ((bc) f6Var.Q1).j();
                    break;
                }
                break;
        }
    }

    @Override // jh.a
    public void h(int i10) {
        if (i10 == 0) {
            this.b.P0();
        }
    }
}
