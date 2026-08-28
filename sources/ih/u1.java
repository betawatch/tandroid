package ih;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u1 implements org.telegram.ui.ActionBar.b2, rg.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ i4 b;

    public /* synthetic */ u1(i4 i4Var, int i9) {
        this.a = i9;
        this.b = i4Var;
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
    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        long j10;
        TLRPC.ChatFull chatFull;
        ?? r92;
        ?? r12;
        boolean z10;
        boolean z11;
        TL_stories.StoryItem storyItem;
        int i10 = this.a;
        i4 i4Var = this.b;
        switch (i10) {
            case 0:
                p2 p2Var = i4Var.X1;
                if (p2Var != null) {
                    p2Var.A();
                    break;
                }
                break;
            default:
                g4 g4Var = i4Var.K1;
                boolean z12 = true;
                TLRPC.ChatFull chatFull2 = null;
                if (g4Var.f && (storyItem = g4Var.a) != null) {
                    TLRPC.MessageMedia messageMedia = storyItem.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        f1 f1Var = f1.S;
                        if (f1Var != null && f1Var.f(inputGroupCall)) {
                            f1.S.e();
                            if (f1.S != null) {
                                f1.S = null;
                                NotificationCenter.getInstance(i4Var.y2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(f1.S.g()));
                            }
                        }
                    }
                }
                TL_stories.StoryItem storyItem2 = g4Var.a;
                if (storyItem2 instanceof e6) {
                    f6 f6Var = ((e6) storyItem2).a;
                    TLRPC.MessageMedia messageMedia2 = storyItem2.media;
                    f6Var.getClass();
                    f6Var.F(new ArrayList(Arrays.asList(messageMedia2)));
                } else if (storyItem2 != null) {
                    i4 i4Var2 = g4Var.k;
                    v6 v6Var = i4Var2.O1;
                    long j11 = i4Var2.x1;
                    a0.h hVar = v6Var.i;
                    int i11 = v6Var.a;
                    if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted)) {
                        int i12 = 0;
                        while (i12 < 2) {
                            if (i12 == 0) {
                                j10 = 0;
                                TLRPC.ChatFull chatFull3 = chatFull2;
                                chatFull = chatFull3;
                                r92 = (TL_stories.PeerStories) hVar.f(j11);
                                r12 = chatFull3;
                            } else if (j11 >= 0) {
                                TLRPC.UserFull userFull = MessagesController.getInstance(i11).getUserFull(j11);
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
                                TLRPC.ChatFull chatFull4 = MessagesController.getInstance(i11).getChatFull(-j11);
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
                                int i13 = 0;
                                while (true) {
                                    if (i13 < r92.stories.size()) {
                                        if (r92.stories.get(i13).id == storyItem2.id) {
                                            r92.stories.remove(i13);
                                            if (r92.stories.size() == 0) {
                                                if (!v6Var.K(j11)) {
                                                    hVar.l(j11);
                                                    v6Var.g.remove(r92);
                                                    v6Var.h.remove(r92);
                                                }
                                                if (j11 > j10) {
                                                    TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(j11));
                                                    if (user != null) {
                                                        user.stories_unavailable = z12;
                                                    }
                                                } else {
                                                    TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-j11));
                                                    if (chat != null) {
                                                        chat.stories_unavailable = true;
                                                    }
                                                }
                                            }
                                        } else {
                                            i13++;
                                            z12 = true;
                                        }
                                    }
                                }
                            }
                            if (chatFull != null) {
                                z10 = false;
                                MessagesStorage.getInstance(i11).updateChatInfo(chatFull, false);
                            } else {
                                z10 = false;
                            }
                            if (r12 != 0) {
                                MessagesStorage.getInstance(i11).updateUserInfo(r12, z10);
                            }
                            i12++;
                            z12 = true;
                            chatFull2 = null;
                        }
                        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
                        tL_stories_deleteStories.peer = MessagesController.getInstance(i11).getInputPeer(j11);
                        tL_stories_deleteStories.id.add(Integer.valueOf(storyItem2.id));
                        ConnectionsManager.getInstance(i11).sendRequest(tL_stories_deleteStories, new t5(v6Var, 5));
                        i7 i7Var = v6Var.k;
                        i7Var.b.getStorageQueue().postRunnable(new g7(i7Var, j11, storyItem2.id, 0));
                        NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                        MessagesController.getInstance(i11).checkArchiveFolder();
                        v6Var.k0(j11, Arrays.asList(storyItem2));
                    }
                } else {
                    u6 u6Var = g4Var.b;
                    if (u6Var != null) {
                        u6Var.a();
                    }
                }
                i4Var.j1();
                if (!i4Var.G1 || i4Var.w1 != 0) {
                    int i14 = i4Var.F1;
                    int i15 = i4Var.w1;
                    if (i14 >= i15) {
                        i4Var.F1 = i15 - 1;
                        z11 = false;
                    } else {
                        z11 = false;
                        if (i14 < 0) {
                            i4Var.F1 = 0;
                        }
                    }
                    i4Var.f1(z11);
                    m9 m9Var = i4Var.F0;
                    if (m9Var != null) {
                        m9Var.p();
                        break;
                    }
                } else {
                    ((d9) i4Var.M1).j();
                    break;
                }
                break;
        }
    }

    @Override // rg.a
    public void k(int i9) {
        if (i9 == 0) {
            this.b.P0();
        }
    }
}
