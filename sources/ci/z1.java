package ci;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z1 implements org.telegram.ui.ActionBar.a2, kh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ q4 b;

    public /* synthetic */ z1(q4 q4Var, int i10) {
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
    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
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
                v2 v2Var = q4Var.b2;
                if (v2Var != null) {
                    v2Var.z();
                    break;
                }
                break;
            default:
                o4 o4Var = q4Var.O1;
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
                                NotificationCenter.getInstance(q4Var.C2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(h1.W.g()));
                            }
                        }
                    }
                }
                TL_stories.StoryItem storyItem2 = o4Var.a;
                if (storyItem2 instanceof s6) {
                    t6 t6Var = ((s6) storyItem2).a;
                    TLRPC.MessageMedia messageMedia2 = storyItem2.media;
                    t6Var.getClass();
                    t6Var.F(new ArrayList(Arrays.asList(messageMedia2)));
                } else if (storyItem2 != null) {
                    q4 q4Var2 = o4Var.k;
                    i7 i7Var = q4Var2.S1;
                    long j11 = q4Var2.B1;
                    a0.h hVar = i7Var.i;
                    int i13 = i7Var.a;
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
                                                if (!i7Var.K(j11)) {
                                                    hVar.l(j11);
                                                    i7Var.g.remove(r92);
                                                    i7Var.h.remove(r92);
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
                        ConnectionsManager.getInstance(i13).sendRequest(tL_stories_deleteStories, new h6(i7Var, 5));
                        w7 w7Var = i7Var.k;
                        w7Var.b.getStorageQueue().postRunnable(new s7(w7Var, j11, storyItem2.id, 1));
                        NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                        MessagesController.getInstance(i13).checkArchiveFolder();
                        i7Var.k0(j11, Arrays.asList(storyItem2));
                    }
                } else {
                    h7 h7Var = o4Var.b;
                    if (h7Var != null) {
                        h7Var.a();
                    }
                }
                q4Var.j1();
                if (!q4Var.K1 || q4Var.A1 != 0) {
                    int i16 = q4Var.J1;
                    int i17 = q4Var.A1;
                    if (i16 >= i17) {
                        q4Var.J1 = i17 - 1;
                        z11 = false;
                    } else {
                        z11 = false;
                        if (i16 < 0) {
                            q4Var.J1 = 0;
                        }
                    }
                    q4Var.f1(z11);
                    aa aaVar = q4Var.J0;
                    if (aaVar != null) {
                        aaVar.p();
                        break;
                    }
                } else {
                    ((r9) q4Var.Q1).j();
                    break;
                }
                break;
        }
    }

    @Override // kh.a
    public void j(int i10) {
        if (i10 == 0) {
            this.b.P0();
        }
    }
}
