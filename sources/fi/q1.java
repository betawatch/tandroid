package fi;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.vr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class q1 implements org.telegram.ui.ActionBar.q1, lh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ b4 b;

    public /* synthetic */ q1(b4 b4Var, int i7) {
        this.a = i7;
        this.b = b4Var;
    }

    @Override // lh.a
    public void g(int i7) {
        if (i7 == 0) {
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
    /* JADX WARN: Type inference failed for: r4v9, types: [org.telegram.messenger.vr] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, org.telegram.tgnet.tl.TL_stories$PeerStories] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        long j3;
        TLRPC.ChatFull chatFull;
        ?? r92;
        ?? r12;
        boolean z10;
        boolean z11;
        TL_stories.StoryItem storyItem;
        int i10 = this.a;
        b4 b4Var = this.b;
        switch (i10) {
            case 0:
                k2 k2Var = b4Var.L1;
                if (k2Var != null) {
                    k2Var.D();
                    break;
                }
                break;
            default:
                z3 z3Var = b4Var.y1;
                int i11 = 0;
                boolean z12 = true;
                TLRPC.ChatFull chatFull2 = null;
                if (z3Var.f && (storyItem = z3Var.a) != null) {
                    TLRPC.MessageMedia messageMedia = storyItem.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        e1 e1Var = e1.X;
                        if (e1Var != null && e1Var.f(inputGroupCall)) {
                            e1.X.e();
                            if (e1.X != null) {
                                e1.X = null;
                                ns.f(b4Var.m2).k(ns.G2, Long.valueOf(e1.X.g()));
                            }
                        }
                    }
                }
                TL_stories.StoryItem storyItem2 = z3Var.a;
                if (storyItem2 instanceof b6) {
                    c6 c6Var = ((b6) storyItem2).a;
                    TLRPC.MessageMedia messageMedia2 = storyItem2.media;
                    c6Var.getClass();
                    c6Var.F(new ArrayList(Arrays.asList(messageMedia2)));
                } else if (storyItem2 != null) {
                    b4 b4Var2 = z3Var.k;
                    s6 s6Var = b4Var2.C1;
                    long j10 = b4Var2.l1;
                    a0.h hVar = s6Var.i;
                    int i12 = s6Var.a;
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
                                TLRPC.UserFull b22 = np.s1(i12).b2(j10);
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
                                TLRPC.ChatFull N0 = np.s1(i12).N0(-j10);
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
                                                if (!s6Var.M(j10)) {
                                                    hVar.l(j10);
                                                    s6Var.g.remove(r92);
                                                    s6Var.h.remove(r92);
                                                }
                                                if (j10 > j3) {
                                                    TLRPC.User a22 = np.s1(i12).a2(Long.valueOf(j10));
                                                    if (a22 != null) {
                                                        a22.stories_unavailable = z12;
                                                    }
                                                } else {
                                                    TLRPC.Chat M0 = np.s1(i12).M0(Long.valueOf(-j10));
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
                                vr.a0(i12).N1(chatFull, false);
                            } else {
                                z10 = false;
                            }
                            if (r12 != 0) {
                                vr.a0(i12).j2(r12, z10);
                            }
                            i13++;
                            i11 = 0;
                            z12 = true;
                            chatFull2 = null;
                        }
                        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
                        tL_stories_deleteStories.peer = np.s1(i12).j1(j10);
                        tL_stories_deleteStories.id.add(Integer.valueOf(storyItem2.id));
                        ConnectionsManager.getInstance(i12).sendRequest(tL_stories_deleteStories, new p5(s6Var, 4));
                        f7 f7Var = s6Var.k;
                        f7Var.b.a.c(new c7(f7Var, j10, storyItem2.id, 1));
                        ns.f(i12).k(ns.v5, new Object[0]);
                        np.s1(i12).D();
                        s6Var.n0(j10, Arrays.asList(storyItem2));
                    }
                } else {
                    r6 r6Var = z3Var.b;
                    if (r6Var != null) {
                        r6Var.a();
                    }
                }
                b4Var.h1();
                if (!b4Var.u1 || b4Var.k1 != 0) {
                    int i15 = b4Var.t1;
                    int i16 = b4Var.k1;
                    if (i15 >= i16) {
                        b4Var.t1 = i16 - 1;
                        z11 = false;
                    } else {
                        z11 = false;
                        if (i15 < 0) {
                            b4Var.t1 = 0;
                        }
                    }
                    b4Var.d1(z11);
                    i9 i9Var = b4Var.t0;
                    if (i9Var != null) {
                        i9Var.r();
                        break;
                    }
                } else {
                    ((z8) b4Var.A1).j();
                    break;
                }
                break;
        }
    }
}
