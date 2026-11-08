package di;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s1 implements org.telegram.ui.ActionBar.r1, lh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ i4 b;

    public /* synthetic */ s1(i4 i4Var, int i7) {
        this.a = i7;
        this.b = i4Var;
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
    /* JADX WARN: Type inference failed for: r4v9, types: [org.telegram.messenger.yr] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, org.telegram.tgnet.tl.TL_stories$PeerStories] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        long j3;
        TLRPC.ChatFull chatFull;
        ?? r92;
        ?? r12;
        boolean z9;
        boolean z10;
        TL_stories.StoryItem storyItem;
        int i10 = this.a;
        i4 i4Var = this.b;
        switch (i10) {
            case 0:
                o2 o2Var = i4Var.K1;
                if (o2Var != null) {
                    o2Var.x();
                    break;
                }
                break;
            default:
                g4 g4Var = i4Var.x1;
                int i11 = 0;
                boolean z11 = true;
                TLRPC.ChatFull chatFull2 = null;
                if (g4Var.f && (storyItem = g4Var.a) != null) {
                    TLRPC.MessageMedia messageMedia = storyItem.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        g1 g1Var = g1.W;
                        if (g1Var != null && g1Var.f(inputGroupCall)) {
                            g1.W.e();
                            if (g1.W != null) {
                                g1.W = null;
                                qs.f(i4Var.l2).k(qs.G2, Long.valueOf(g1.W.g()));
                            }
                        }
                    }
                }
                TL_stories.StoryItem storyItem2 = g4Var.a;
                if (storyItem2 instanceof i6) {
                    j6 j6Var = ((i6) storyItem2).a;
                    TLRPC.MessageMedia messageMedia2 = storyItem2.media;
                    j6Var.getClass();
                    j6Var.F(new ArrayList(Arrays.asList(messageMedia2)));
                } else if (storyItem2 != null) {
                    i4 i4Var2 = g4Var.k;
                    y6 y6Var = i4Var2.B1;
                    long j10 = i4Var2.k1;
                    a0.h hVar = y6Var.i;
                    int i12 = y6Var.a;
                    if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted)) {
                        int i13 = 0;
                        while (i13 < 2) {
                            if (i13 == 0) {
                                j3 = 0;
                                TLRPC.ChatFull chatFull3 = chatFull2;
                                chatFull = chatFull3;
                                r92 = (TL_stories.PeerStories) hVar.f(j10);
                                r12 = chatFull3;
                            } else if (j10 >= 0) {
                                TLRPC.UserFull b22 = qp.s1(i12).b2(j10);
                                if (b22 != null) {
                                    j3 = 0;
                                    chatFull = chatFull2;
                                    r12 = b22;
                                    r92 = b22.stories;
                                } else {
                                    j3 = 0;
                                    chatFull = chatFull2;
                                    r12 = b22;
                                    r92 = chatFull;
                                }
                            } else {
                                j3 = 0;
                                TLRPC.ChatFull N0 = qp.s1(i12).N0(-j10);
                                if (N0 != null) {
                                    chatFull = N0;
                                    r92 = N0.stories;
                                    r12 = chatFull2;
                                } else {
                                    TLRPC.ChatFull chatFull4 = chatFull2;
                                    chatFull = N0;
                                    r92 = chatFull4;
                                    r12 = chatFull4;
                                }
                            }
                            if (r92 != 0) {
                                int i14 = i11;
                                while (true) {
                                    if (i14 < r92.stories.size()) {
                                        if (r92.stories.get(i14).id == storyItem2.id) {
                                            r92.stories.remove(i14);
                                            if (r92.stories.size() == 0) {
                                                if (!y6Var.M(j10)) {
                                                    hVar.l(j10);
                                                    y6Var.g.remove(r92);
                                                    y6Var.h.remove(r92);
                                                }
                                                if (j10 > j3) {
                                                    TLRPC.User a22 = qp.s1(i12).a2(Long.valueOf(j10));
                                                    if (a22 != null) {
                                                        a22.stories_unavailable = z11;
                                                    }
                                                } else {
                                                    TLRPC.Chat M0 = qp.s1(i12).M0(Long.valueOf(-j10));
                                                    if (M0 != null) {
                                                        M0.stories_unavailable = true;
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
                                z9 = false;
                                yr.a0(i12).N1(chatFull, false);
                            } else {
                                z9 = false;
                            }
                            if (r12 != 0) {
                                yr.a0(i12).j2(r12, z9);
                            }
                            i13++;
                            i11 = 0;
                            z11 = true;
                            chatFull2 = null;
                        }
                        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
                        tL_stories_deleteStories.peer = qp.s1(i12).j1(j10);
                        tL_stories_deleteStories.id.add(Integer.valueOf(storyItem2.id));
                        ConnectionsManager.getInstance(i12).sendRequest(tL_stories_deleteStories, new x5(y6Var, 4));
                        l7 l7Var = y6Var.k;
                        l7Var.b.a.c(new i7(l7Var, j10, storyItem2.id, 1));
                        qs.f(i12).k(qs.v5, new Object[0]);
                        qp.s1(i12).D();
                        y6Var.n0(j10, Arrays.asList(storyItem2));
                    }
                } else {
                    x6 x6Var = g4Var.b;
                    if (x6Var != null) {
                        x6Var.a();
                    }
                }
                i4Var.h1();
                if (!i4Var.t1 || i4Var.j1 != 0) {
                    int i15 = i4Var.s1;
                    int i16 = i4Var.j1;
                    if (i15 >= i16) {
                        i4Var.s1 = i16 - 1;
                        z10 = false;
                    } else {
                        z10 = false;
                        if (i15 < 0) {
                            i4Var.s1 = 0;
                        }
                    }
                    i4Var.d1(z10);
                    p9 p9Var = i4Var.s0;
                    if (p9Var != null) {
                        p9Var.r();
                        break;
                    }
                } else {
                    ((g9) i4Var.z1).j();
                    break;
                }
                break;
        }
    }

    @Override // lh.a
    public void h(int i7) {
        if (i7 == 0) {
            this.b.N0();
        }
    }
}
