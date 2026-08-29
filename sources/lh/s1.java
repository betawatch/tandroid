package lh;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s1 implements org.telegram.ui.ActionBar.b2, ug.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ d4 b;

    public /* synthetic */ s1(d4 d4Var, int i10) {
        this.a = i10;
        this.b = d4Var;
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
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        long j10;
        TLRPC.ChatFull chatFull;
        ?? r9;
        ?? r12;
        boolean z10;
        boolean z11;
        TL_stories.StoryItem storyItem;
        int i11 = this.a;
        d4 d4Var = this.b;
        switch (i11) {
            case 0:
                n2 n2Var = d4Var.X1;
                if (n2Var != null) {
                    n2Var.B();
                    break;
                }
                break;
            default:
                b4 b4Var = d4Var.K1;
                boolean z12 = true;
                TLRPC.ChatFull chatFull2 = null;
                if (b4Var.f && (storyItem = b4Var.a) != null) {
                    TLRPC.MessageMedia messageMedia = storyItem.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        d1 d1Var = d1.S;
                        if (d1Var != null && d1Var.f(inputGroupCall)) {
                            d1.S.e();
                            if (d1.S != null) {
                                d1.S = null;
                                NotificationCenter.getInstance(d4Var.y2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(d1.S.g()));
                            }
                        }
                    }
                }
                TL_stories.StoryItem storyItem2 = b4Var.a;
                if (storyItem2 instanceof b6) {
                    c6 c6Var = ((b6) storyItem2).a;
                    TLRPC.MessageMedia messageMedia2 = storyItem2.media;
                    c6Var.getClass();
                    c6Var.F(new ArrayList(Arrays.asList(messageMedia2)));
                } else if (storyItem2 != null) {
                    d4 d4Var2 = b4Var.k;
                    s6 s6Var = d4Var2.O1;
                    long j11 = d4Var2.x1;
                    a0.h hVar = s6Var.i;
                    int i12 = s6Var.a;
                    if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted)) {
                        int i13 = 0;
                        while (i13 < 2) {
                            if (i13 == 0) {
                                j10 = 0;
                                TLRPC.ChatFull chatFull3 = chatFull2;
                                chatFull = chatFull3;
                                r9 = (TL_stories.PeerStories) hVar.f(j11);
                                r12 = chatFull3;
                            } else if (j11 >= 0) {
                                TLRPC.UserFull userFull = MessagesController.getInstance(i12).getUserFull(j11);
                                if (userFull != null) {
                                    j10 = 0;
                                    chatFull = chatFull2;
                                    r12 = userFull;
                                    r9 = userFull.stories;
                                } else {
                                    j10 = 0;
                                    chatFull = chatFull2;
                                    r12 = userFull;
                                    r9 = chatFull;
                                }
                            } else {
                                j10 = 0;
                                TLRPC.ChatFull chatFull4 = MessagesController.getInstance(i12).getChatFull(-j11);
                                if (chatFull4 != null) {
                                    chatFull = chatFull4;
                                    r9 = chatFull4.stories;
                                    r12 = chatFull2;
                                } else {
                                    TLRPC.ChatFull chatFull5 = chatFull2;
                                    chatFull = chatFull4;
                                    r9 = chatFull5;
                                    r12 = chatFull5;
                                }
                            }
                            if (r9 != 0) {
                                int i14 = 0;
                                while (true) {
                                    if (i14 < r9.stories.size()) {
                                        if (r9.stories.get(i14).id == storyItem2.id) {
                                            r9.stories.remove(i14);
                                            if (r9.stories.size() == 0) {
                                                if (!s6Var.K(j11)) {
                                                    hVar.l(j11);
                                                    s6Var.g.remove(r9);
                                                    s6Var.h.remove(r9);
                                                }
                                                if (j11 > j10) {
                                                    TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(j11));
                                                    if (user != null) {
                                                        user.stories_unavailable = z12;
                                                    }
                                                } else {
                                                    TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-j11));
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
                        tL_stories_deleteStories.peer = MessagesController.getInstance(i12).getInputPeer(j11);
                        tL_stories_deleteStories.id.add(Integer.valueOf(storyItem2.id));
                        ConnectionsManager.getInstance(i12).sendRequest(tL_stories_deleteStories, new r5(s6Var, 5));
                        f7 f7Var = s6Var.k;
                        f7Var.b.getStorageQueue().postRunnable(new d7(f7Var, j11, storyItem2.id, 0));
                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                        MessagesController.getInstance(i12).checkArchiveFolder();
                        s6Var.k0(j11, Arrays.asList(storyItem2));
                    }
                } else {
                    r6 r6Var = b4Var.b;
                    if (r6Var != null) {
                        r6Var.a();
                    }
                }
                d4Var.j1();
                if (!d4Var.G1 || d4Var.w1 != 0) {
                    int i15 = d4Var.F1;
                    int i16 = d4Var.w1;
                    if (i15 >= i16) {
                        d4Var.F1 = i16 - 1;
                        z11 = false;
                    } else {
                        z11 = false;
                        if (i15 < 0) {
                            d4Var.F1 = 0;
                        }
                    }
                    d4Var.f1(z11);
                    i9 i9Var = d4Var.F0;
                    if (i9Var != null) {
                        i9Var.p();
                        break;
                    }
                } else {
                    ((z8) d4Var.M1).j();
                    break;
                }
                break;
        }
    }

    @Override // ug.a
    public void k(int i10) {
        if (i10 == 0) {
            this.b.P0();
        }
    }
}
