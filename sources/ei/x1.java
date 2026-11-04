package ei;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.qr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x1 implements org.telegram.ui.ActionBar.p1, mh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ j4 b;

    public /* synthetic */ x1(j4 j4Var, int i3) {
        this.a = i3;
        this.b = j4Var;
    }

    @Override // mh.a
    public void d(int i3) {
        if (i3 == 0) {
            this.b.N0();
        }
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
    /* JADX WARN: Type inference failed for: r4v9, types: [org.telegram.messenger.qr] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, org.telegram.tgnet.tl.TL_stories$PeerStories] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        long j10;
        TLRPC.ChatFull chatFull;
        ?? r9;
        ?? r12;
        boolean z10;
        boolean z11;
        TL_stories.StoryItem storyItem;
        int i10 = this.a;
        j4 j4Var = this.b;
        switch (i10) {
            case 0:
                s2 s2Var = j4Var.L1;
                if (s2Var != null) {
                    s2Var.x();
                    break;
                }
                break;
            default:
                h4 h4Var = j4Var.y1;
                int i11 = 0;
                boolean z12 = true;
                TLRPC.ChatFull chatFull2 = null;
                if (h4Var.f && (storyItem = h4Var.a) != null) {
                    TLRPC.MessageMedia messageMedia = storyItem.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        g1 g1Var = g1.X;
                        if (g1Var != null && g1Var.f(inputGroupCall)) {
                            g1.X.e();
                            if (g1.X != null) {
                                g1.X = null;
                                hs.f(j4Var.m2).k(hs.G2, Long.valueOf(g1.X.g()));
                            }
                        }
                    }
                }
                TL_stories.StoryItem storyItem2 = h4Var.a;
                if (storyItem2 instanceof j6) {
                    k6 k6Var = ((j6) storyItem2).a;
                    TLRPC.MessageMedia messageMedia2 = storyItem2.media;
                    k6Var.getClass();
                    k6Var.F(new ArrayList(Arrays.asList(messageMedia2)));
                } else if (storyItem2 != null) {
                    j4 j4Var2 = h4Var.k;
                    z6 z6Var = j4Var2.C1;
                    long j11 = j4Var2.l1;
                    a0.h hVar = z6Var.i;
                    int i12 = z6Var.a;
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
                                TLRPC.UserFull b22 = hp.s1(i12).b2(j11);
                                if (b22 != null) {
                                    j10 = 0;
                                    chatFull = chatFull2;
                                    r12 = b22;
                                    r9 = b22.stories;
                                } else {
                                    j10 = 0;
                                    chatFull = chatFull2;
                                    r12 = b22;
                                    r9 = chatFull;
                                }
                            } else {
                                j10 = 0;
                                TLRPC.ChatFull N0 = hp.s1(i12).N0(-j11);
                                if (N0 != null) {
                                    chatFull = N0;
                                    r9 = N0.stories;
                                    r12 = chatFull2;
                                } else {
                                    TLRPC.ChatFull chatFull4 = chatFull2;
                                    chatFull = N0;
                                    r9 = chatFull4;
                                    r12 = chatFull4;
                                }
                            }
                            if (r9 != 0) {
                                int i14 = i11;
                                while (true) {
                                    if (i14 < r9.stories.size()) {
                                        if (r9.stories.get(i14).id == storyItem2.id) {
                                            r9.stories.remove(i14);
                                            if (r9.stories.size() == 0) {
                                                if (!z6Var.M(j11)) {
                                                    hVar.l(j11);
                                                    z6Var.g.remove(r9);
                                                    z6Var.h.remove(r9);
                                                }
                                                if (j11 > j10) {
                                                    TLRPC.User a22 = hp.s1(i12).a2(Long.valueOf(j11));
                                                    if (a22 != null) {
                                                        a22.stories_unavailable = z12;
                                                    }
                                                } else {
                                                    TLRPC.Chat M0 = hp.s1(i12).M0(Long.valueOf(-j11));
                                                    if (M0 != null) {
                                                        M0.stories_unavailable = true;
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
                                qr.a0(i12).N1(chatFull, false);
                            } else {
                                z10 = false;
                            }
                            if (r12 != 0) {
                                qr.a0(i12).j2(r12, z10);
                            }
                            i13++;
                            i11 = 0;
                            z12 = true;
                            chatFull2 = null;
                        }
                        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
                        tL_stories_deleteStories.peer = hp.s1(i12).j1(j11);
                        tL_stories_deleteStories.id.add(Integer.valueOf(storyItem2.id));
                        ConnectionsManager.getInstance(i12).sendRequest(tL_stories_deleteStories, new x5(z6Var, 4));
                        m7 m7Var = z6Var.k;
                        m7Var.b.a.c(new j7(m7Var, j11, storyItem2.id, 1));
                        hs.f(i12).k(hs.v5, new Object[0]);
                        hp.s1(i12).D();
                        z6Var.n0(j11, Arrays.asList(storyItem2));
                    }
                } else {
                    y6 y6Var = h4Var.b;
                    if (y6Var != null) {
                        y6Var.a();
                    }
                }
                j4Var.h1();
                if (!j4Var.u1 || j4Var.k1 != 0) {
                    int i15 = j4Var.t1;
                    int i16 = j4Var.k1;
                    if (i15 >= i16) {
                        j4Var.t1 = i16 - 1;
                        z11 = false;
                    } else {
                        z11 = false;
                        if (i15 < 0) {
                            j4Var.t1 = 0;
                        }
                    }
                    j4Var.d1(z11);
                    r9 r9Var = j4Var.t0;
                    if (r9Var != null) {
                        r9Var.C();
                        break;
                    }
                } else {
                    ((i9) j4Var.A1).j();
                    break;
                }
                break;
        }
    }
}
