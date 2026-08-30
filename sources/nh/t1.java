package nh;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t1 implements org.telegram.ui.ActionBar.c2, wg.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ d4 b;

    public /* synthetic */ t1(d4 d4Var, int i10) {
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
    @Override // org.telegram.ui.ActionBar.c2
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        long j10;
        TLRPC.ChatFull chatFull;
        ?? r92;
        ?? r12;
        boolean z4;
        boolean z10;
        TL_stories.StoryItem storyItem;
        int i11 = this.a;
        d4 d4Var = this.b;
        switch (i11) {
            case 0:
                o2 o2Var = d4Var.Y1;
                if (o2Var != null) {
                    o2Var.B();
                    break;
                }
                break;
            default:
                b4 b4Var = d4Var.L1;
                boolean z11 = true;
                TLRPC.ChatFull chatFull2 = null;
                if (b4Var.f && (storyItem = b4Var.a) != null) {
                    TLRPC.MessageMedia messageMedia = storyItem.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        e1 e1Var = e1.T;
                        if (e1Var != null && e1Var.f(inputGroupCall)) {
                            e1.T.e();
                            if (e1.T != null) {
                                e1.T = null;
                                NotificationCenter.getInstance(d4Var.z2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(e1.T.g()));
                            }
                        }
                    }
                }
                TL_stories.StoryItem storyItem2 = b4Var.a;
                if (storyItem2 instanceof c6) {
                    d6 d6Var = ((c6) storyItem2).a;
                    TLRPC.MessageMedia messageMedia2 = storyItem2.media;
                    d6Var.getClass();
                    d6Var.F(new ArrayList(Arrays.asList(messageMedia2)));
                } else if (storyItem2 != null) {
                    d4 d4Var2 = b4Var.k;
                    t6 t6Var = d4Var2.P1;
                    long j11 = d4Var2.y1;
                    a0.h hVar = t6Var.i;
                    int i12 = t6Var.a;
                    if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted)) {
                        int i13 = 0;
                        while (i13 < 2) {
                            if (i13 == 0) {
                                j10 = 0;
                                TLRPC.ChatFull chatFull3 = chatFull2;
                                chatFull = chatFull3;
                                r92 = (TL_stories.PeerStories) hVar.f(j11);
                                r12 = chatFull3;
                            } else if (j11 >= 0) {
                                TLRPC.UserFull userFull = MessagesController.getInstance(i12).getUserFull(j11);
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
                                TLRPC.ChatFull chatFull4 = MessagesController.getInstance(i12).getChatFull(-j11);
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
                                                if (!t6Var.K(j11)) {
                                                    hVar.l(j11);
                                                    t6Var.g.remove(r92);
                                                    t6Var.h.remove(r92);
                                                }
                                                if (j11 > j10) {
                                                    TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(j11));
                                                    if (user != null) {
                                                        user.stories_unavailable = z11;
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
                                            z11 = true;
                                        }
                                    }
                                }
                            }
                            if (chatFull != null) {
                                z4 = false;
                                MessagesStorage.getInstance(i12).updateChatInfo(chatFull, false);
                            } else {
                                z4 = false;
                            }
                            if (r12 != 0) {
                                MessagesStorage.getInstance(i12).updateUserInfo(r12, z4);
                            }
                            i13++;
                            z11 = true;
                            chatFull2 = null;
                        }
                        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
                        tL_stories_deleteStories.peer = MessagesController.getInstance(i12).getInputPeer(j11);
                        tL_stories_deleteStories.id.add(Integer.valueOf(storyItem2.id));
                        ConnectionsManager.getInstance(i12).sendRequest(tL_stories_deleteStories, new s5(t6Var, 5));
                        g7 g7Var = t6Var.k;
                        g7Var.b.getStorageQueue().postRunnable(new e7(g7Var, j11, storyItem2.id, 0));
                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                        MessagesController.getInstance(i12).checkArchiveFolder();
                        t6Var.k0(j11, Arrays.asList(storyItem2));
                    }
                } else {
                    s6 s6Var = b4Var.b;
                    if (s6Var != null) {
                        s6Var.a();
                    }
                }
                d4Var.j1();
                if (!d4Var.H1 || d4Var.x1 != 0) {
                    int i15 = d4Var.G1;
                    int i16 = d4Var.x1;
                    if (i15 >= i16) {
                        d4Var.G1 = i16 - 1;
                        z10 = false;
                    } else {
                        z10 = false;
                        if (i15 < 0) {
                            d4Var.G1 = 0;
                        }
                    }
                    d4Var.f1(z10);
                    i9 i9Var = d4Var.G0;
                    if (i9Var != null) {
                        i9Var.p();
                        break;
                    }
                } else {
                    ((z8) d4Var.N1).j();
                    break;
                }
                break;
        }
    }

    @Override // wg.a
    public void k(int i10) {
        if (i10 == 0) {
            this.b.P0();
        }
    }
}
