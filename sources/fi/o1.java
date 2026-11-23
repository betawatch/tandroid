package fi;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.tr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class o1 implements org.telegram.ui.ActionBar.q1, lh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ z3 b;

    public /* synthetic */ o1(z3 z3Var, int i7) {
        this.a = i7;
        this.b = z3Var;
    }

    @Override // lh.a
    public void h(int i7) {
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
    /* JADX WARN: Type inference failed for: r4v9, types: [org.telegram.messenger.tr] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, org.telegram.tgnet.tl.TL_stories$PeerStories] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        long j3;
        TLRPC.ChatFull chatFull;
        ?? r92;
        ?? r12;
        boolean z10;
        boolean z11;
        TL_stories.StoryItem storyItem;
        int i10 = this.a;
        z3 z3Var = this.b;
        switch (i10) {
            case 0:
                i2 i2Var = z3Var.L1;
                if (i2Var != null) {
                    i2Var.F();
                    break;
                }
                break;
            default:
                x3 x3Var = z3Var.y1;
                int i11 = 0;
                boolean z12 = true;
                TLRPC.ChatFull chatFull2 = null;
                if (x3Var.f && (storyItem = x3Var.a) != null) {
                    TLRPC.MessageMedia messageMedia = storyItem.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        c1 c1Var = c1.X;
                        if (c1Var != null && c1Var.f(inputGroupCall)) {
                            c1.X.e();
                            if (c1.X != null) {
                                c1.X = null;
                                ks.f(z3Var.m2).k(ks.G2, Long.valueOf(c1.X.g()));
                            }
                        }
                    }
                }
                TL_stories.StoryItem storyItem2 = x3Var.a;
                if (storyItem2 instanceof z5) {
                    a6 a6Var = ((z5) storyItem2).a;
                    TLRPC.MessageMedia messageMedia2 = storyItem2.media;
                    a6Var.getClass();
                    a6Var.F(new ArrayList(Arrays.asList(messageMedia2)));
                } else if (storyItem2 != null) {
                    z3 z3Var2 = x3Var.k;
                    p6 p6Var = z3Var2.C1;
                    long j10 = z3Var2.l1;
                    a0.h hVar = p6Var.i;
                    int i12 = p6Var.a;
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
                                TLRPC.UserFull d2 = mp.u1(i12).d2(j10);
                                if (d2 != null) {
                                    j3 = 0;
                                    chatFull = chatFull2;
                                    r12 = d2;
                                    r92 = d2.stories;
                                } else {
                                    j3 = 0;
                                    chatFull = chatFull2;
                                    r12 = d2;
                                    r92 = chatFull;
                                }
                            } else {
                                j3 = 0;
                                TLRPC.ChatFull P0 = mp.u1(i12).P0(-j10);
                                if (P0 != null) {
                                    chatFull = P0;
                                    r92 = P0.stories;
                                    r12 = chatFull2;
                                } else {
                                    TLRPC.ChatFull chatFull4 = chatFull2;
                                    chatFull = P0;
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
                                                if (!p6Var.M(j10)) {
                                                    hVar.l(j10);
                                                    p6Var.g.remove(r92);
                                                    p6Var.h.remove(r92);
                                                }
                                                if (j10 > j3) {
                                                    TLRPC.User c22 = mp.u1(i12).c2(Long.valueOf(j10));
                                                    if (c22 != null) {
                                                        c22.stories_unavailable = z12;
                                                    }
                                                } else {
                                                    TLRPC.Chat O0 = mp.u1(i12).O0(Long.valueOf(-j10));
                                                    if (O0 != null) {
                                                        O0.stories_unavailable = true;
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
                                tr.a0(i12).N1(chatFull, false);
                            } else {
                                z10 = false;
                            }
                            if (r12 != 0) {
                                tr.a0(i12).j2(r12, z10);
                            }
                            i13++;
                            i11 = 0;
                            z12 = true;
                            chatFull2 = null;
                        }
                        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
                        tL_stories_deleteStories.peer = mp.u1(i12).l1(j10);
                        tL_stories_deleteStories.id.add(Integer.valueOf(storyItem2.id));
                        ConnectionsManager.getInstance(i12).sendRequest(tL_stories_deleteStories, new o5(p6Var, 4));
                        c7 c7Var = p6Var.k;
                        c7Var.b.a.c(new z6(c7Var, j10, storyItem2.id, 1));
                        ks.f(i12).k(ks.y5, new Object[0]);
                        mp.u1(i12).D();
                        p6Var.n0(j10, Arrays.asList(storyItem2));
                    }
                } else {
                    o6 o6Var = x3Var.b;
                    if (o6Var != null) {
                        o6Var.a();
                    }
                }
                z3Var.h1();
                if (!z3Var.u1 || z3Var.k1 != 0) {
                    int i15 = z3Var.t1;
                    int i16 = z3Var.k1;
                    if (i15 >= i16) {
                        z3Var.t1 = i16 - 1;
                        z11 = false;
                    } else {
                        z11 = false;
                        if (i15 < 0) {
                            z3Var.t1 = 0;
                        }
                    }
                    z3Var.d1(z11);
                    f9 f9Var = z3Var.t0;
                    if (f9Var != null) {
                        f9Var.r();
                        break;
                    }
                } else {
                    ((w8) z3Var.A1).j();
                    break;
                }
                break;
        }
    }
}
