// default package

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class e38 implements ee, v51 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a58 b;

    public /* synthetic */ e38(a58 a58Var, byte b) {
        this.a = b;
        this.b = a58Var;
    }

    @Override // v51
    public final void h(int i) {
        if (i == 0) {
            this.b.J0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [org.telegram.tgnet.TLRPC$UserFull] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v8, types: [cf7] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object, org.telegram.tgnet.tl.TL_stories$PeerStories] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    @Override // ee
    public final void r(he heVar, int i) {
        TLRPC.ChatFull chatFull;
        ?? r8;
        ?? r14;
        TL_stories.StoryItem storyItem;
        byte b = this.a;
        a58 a58Var = this.b;
        switch (b) {
            case 0:
                t38 t38Var = a58Var.R1;
                if (t38Var != null) {
                    t38Var.E();
                    break;
                }
                break;
            default:
                z48 z48Var = a58Var.E1;
                TLRPC.ChatFull chatFull2 = null;
                if (z48Var.f && (storyItem = z48Var.a) != null) {
                    TLRPC.MessageMedia messageMedia = storyItem.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        s96 s96Var = s96.N;
                        if (s96Var != null && s96Var.i(inputGroupCall)) {
                            s96.N.h();
                            if (s96.N != null) {
                                s96.N = null;
                                nm7.f(a58Var.s2).k(nm7.G2, Long.valueOf(s96.N.j()));
                            }
                        }
                    }
                }
                TL_stories.StoryItem storyItem2 = z48Var.a;
                if (storyItem2 instanceof s3b) {
                    t3b t3bVar = ((s3b) storyItem2).a;
                    TLRPC.MessageMedia messageMedia2 = storyItem2.media;
                    t3bVar.getClass();
                    t3bVar.F(new ArrayList(Arrays.asList(messageMedia2)));
                } else if (storyItem2 != null) {
                    a58 a58Var2 = z48Var.k;
                    h4b h4bVar = a58Var2.I1;
                    long j = a58Var2.r1;
                    vh6 vh6Var = h4bVar.i;
                    int i2 = h4bVar.a;
                    if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted)) {
                        int i3 = 0;
                        while (i3 < 2) {
                            if (i3 == 0) {
                                TLRPC.ChatFull chatFull3 = chatFull2;
                                chatFull = chatFull3;
                                r8 = (TL_stories.PeerStories) vh6Var.f(j);
                                r14 = chatFull3;
                            } else if (j >= 0) {
                                TLRPC.UserFull X1 = oc7.r1(i2).X1(j);
                                if (X1 != null) {
                                    r14 = X1;
                                    r8 = X1.stories;
                                    chatFull = chatFull2;
                                } else {
                                    chatFull = chatFull2;
                                    r14 = X1;
                                    r8 = chatFull;
                                }
                            } else {
                                TLRPC.ChatFull M0 = oc7.r1(i2).M0(-j);
                                if (M0 != null) {
                                    chatFull = M0;
                                    r8 = M0.stories;
                                    r14 = chatFull2;
                                } else {
                                    TLRPC.ChatFull chatFull4 = chatFull2;
                                    chatFull = M0;
                                    r8 = chatFull4;
                                    r14 = chatFull4;
                                }
                            }
                            if (r8 != 0) {
                                int i4 = 0;
                                while (true) {
                                    if (i4 < r8.stories.size()) {
                                        if (r8.stories.get(i4).id == storyItem2.id) {
                                            r8.stories.remove(i4);
                                            if (r8.stories.size() == 0) {
                                                if (!h4bVar.L(j)) {
                                                    vh6Var.l(j);
                                                    h4bVar.g.remove(r8);
                                                    h4bVar.h.remove(r8);
                                                }
                                                if (j > 0) {
                                                    TLRPC.User W1 = oc7.r1(i2).W1(Long.valueOf(j));
                                                    if (W1 != null) {
                                                        W1.stories_unavailable = true;
                                                    }
                                                } else {
                                                    TLRPC.Chat L0 = oc7.r1(i2).L0(Long.valueOf(-j));
                                                    if (L0 != null) {
                                                        L0.stories_unavailable = true;
                                                    }
                                                }
                                            }
                                        } else {
                                            i4++;
                                        }
                                    }
                                }
                            }
                            if (chatFull != null) {
                                cf7.Y(i2).K1(chatFull, false);
                            }
                            if (r14 != 0) {
                                cf7.Y(i2).g2(r14, false);
                            }
                            i3++;
                            chatFull2 = null;
                        }
                        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
                        tL_stories_deleteStories.peer = oc7.r1(i2).i1(j);
                        tL_stories_deleteStories.id.add(Integer.valueOf(storyItem2.id));
                        ConnectionsManager.getInstance(i2).sendRequest(tL_stories_deleteStories, new k3b(h4bVar, (byte) 4));
                        t4b t4bVar = h4bVar.k;
                        t4bVar.b.a.c(new r4b(t4bVar, j, storyItem2.id, (byte) 1));
                        nm7.f(i2).k(nm7.z5, new Object[0]);
                        oc7.r1(i2).z();
                        h4bVar.n0(j, Arrays.asList(storyItem2));
                    }
                } else {
                    g4b g4bVar = z48Var.b;
                    if (g4bVar != null) {
                        g4bVar.a();
                    }
                }
                a58Var.h1();
                if (!a58Var.A1 || a58Var.q1 != 0) {
                    int i5 = a58Var.z1;
                    int i6 = a58Var.q1;
                    if (i5 >= i6) {
                        a58Var.z1 = i6 - 1;
                    } else if (i5 < 0) {
                        a58Var.z1 = 0;
                    }
                    a58Var.c1(false);
                    oab oabVar = a58Var.z0;
                    if (oabVar != null) {
                        oabVar.m();
                        break;
                    }
                } else {
                    ((fab) a58Var.G1).j();
                    break;
                }
                break;
        }
    }
}
