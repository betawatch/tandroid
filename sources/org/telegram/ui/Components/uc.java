package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uc implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Long h;
    public final /* synthetic */ String n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object w;

    public /* synthetic */ uc(lf lfVar, Object obj, org.telegram.messenger.ff ffVar, boolean z10, int i10, int i11, boolean z11, Long l4, String str, Object obj2) {
        this.r = lfVar;
        this.b = obj;
        this.s = ffVar;
        this.c = z10;
        this.d = i10;
        this.e = i11;
        this.f = z11;
        this.h = l4;
        this.n = str;
        this.w = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        org.telegram.messenger.kj threadMessage;
        org.telegram.messenger.kj threadMessage2;
        org.telegram.messenger.kj threadMessage3;
        org.telegram.messenger.kj threadMessage4;
        String str;
        switch (this.a) {
            case 0:
                ChatActivityEnterView.f((ChatActivityEnterView) this.r, (TLRPC.Document) this.s, this.n, (org.telegram.messenger.gj) this.w, this.c, this.d, this.e, this.b, this.h, this.f);
                break;
            default:
                lf lfVar = (lf) this.r;
                org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) this.s;
                ChatActivityEnterView chatActivityEnterView = lfVar.a;
                boolean z11 = chatActivityEnterView.z3;
                org.telegram.ui.un unVar = chatActivityEnterView.P2;
                boolean z12 = false;
                if (z11) {
                    if (chatActivityEnterView.R1 != 0) {
                        chatActivityEnterView.U0.B();
                    }
                    chatActivityEnterView.l1(false, true, false, true);
                }
                sf sfVar = chatActivityEnterView.Z2;
                TL_stories.StoryItem P0 = sfVar != null ? sfVar.P0() : null;
                Object obj = this.b;
                boolean z13 = obj instanceof TLRPC.Document;
                boolean z14 = this.c;
                int i10 = this.d;
                int i11 = this.e;
                Long l4 = this.h;
                int i12 = i10;
                String str2 = this.n;
                Object obj2 = this.w;
                if (z13) {
                    TLRPC.Document document = (TLRPC.Document) obj;
                    org.telegram.messenger.y20 y20Var = ffVar != null ? ffVar.s : null;
                    if (y20Var != null && ffVar != null) {
                        y20Var.s = true;
                        boolean c10 = y20Var.c();
                        y20Var.s = false;
                        y20Var.t = true;
                        z12 = c10;
                    }
                    boolean z15 = this.f;
                    if (z12) {
                        ArrayList arrayList = new ArrayList();
                        org.telegram.messenger.qz qzVar = new org.telegram.messenger.qz();
                        if (ffVar.b || (str = ffVar.h) == null) {
                            String str3 = ffVar.I;
                            if (str3 != null) {
                                qzVar.c = str3;
                            }
                        } else {
                            qzVar.c = str;
                            if (ffVar.c()) {
                                qzVar.y = ffVar.clone();
                            }
                        }
                        qzVar.e = ffVar.c;
                        qzVar.f = ffVar.g;
                        qzVar.g = ffVar.e;
                        qzVar.p = ffVar.d();
                        qzVar.o = ffVar.b;
                        qzVar.q = ffVar.i();
                        qzVar.z = ffVar.m;
                        qzVar.A = ffVar.P;
                        CharSequence charSequence = ffVar.a;
                        qzVar.d = charSequence != null ? charSequence.toString() : null;
                        qzVar.i = ffVar.n;
                        qzVar.j = ffVar.r;
                        qzVar.h = ffVar.x;
                        qzVar.k = ffVar.s;
                        qzVar.r = ffVar.L;
                        qzVar.t = org.telegram.messenger.rz.h(ffVar.a);
                        qzVar.u = ffVar.M;
                        qzVar.w = ffVar.N;
                        qzVar.x = ffVar.c();
                        arrayList.add(qzVar);
                        ffVar.e();
                        org.telegram.messenger.c a2 = org.telegram.messenger.c.a(chatActivityEnterView.Q);
                        long j10 = chatActivityEnterView.Q2;
                        org.telegram.messenger.kj kjVar = chatActivityEnterView.T2;
                        threadMessage4 = chatActivityEnterView.getThreadMessage();
                        org.telegram.messenger.rz.X(a2, arrayList, j10, kjVar, threadMessage4, null, chatActivityEnterView.V2, false, false, chatActivityEnterView.Z1, null, z14, i12, i11, false, null, unVar != null ? unVar.T8() : null, chatActivityEnterView.S4, z15, l4.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), null, false);
                        z10 = z14;
                        i12 = i12;
                    } else {
                        org.telegram.messenger.rz C = org.telegram.messenger.rz.C(chatActivityEnterView.Q);
                        long j11 = chatActivityEnterView.Q2;
                        CharSequence charSequence2 = ffVar != null ? ffVar.a : null;
                        TL_stories.StoryItem storyItem = P0;
                        org.telegram.messenger.kj kjVar2 = chatActivityEnterView.T2;
                        threadMessage3 = chatActivityEnterView.getThreadMessage();
                        C.u0(document, str2, j11, charSequence2, y20Var, kjVar2, threadMessage3, storyItem, chatActivityEnterView.V2, null, z14, i12, i11, false, obj2, unVar != null ? unVar.T8() : null, l4.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), z15);
                        z10 = z14;
                        i12 = i12;
                        org.telegram.messenger.vi.b0(chatActivityEnterView.Q).c(document, (int) (System.currentTimeMillis() / 1000), true);
                        if (org.telegram.messenger.o5.C(chatActivityEnterView.Q2)) {
                            org.telegram.messenger.wp.r1(chatActivityEnterView.R.a).q4(obj2, document);
                        }
                    }
                } else {
                    z10 = z14;
                    TL_stories.StoryItem storyItem2 = P0;
                    if (obj instanceof TLRPC.BotInlineResult) {
                        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj;
                        if (botInlineResult.document != null) {
                            org.telegram.messenger.vi.b0(chatActivityEnterView.Q).c(botInlineResult.document, (int) (System.currentTimeMillis() / 1000), false);
                            if (org.telegram.messenger.o5.C(chatActivityEnterView.Q2)) {
                                org.telegram.messenger.wp.r1(chatActivityEnterView.R.a).q4(obj2, botInlineResult.document);
                            }
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("id", botInlineResult.id);
                        hashMap.put("query_id", "" + botInlineResult.query_id);
                        hashMap.put("force_gif", "1");
                        if (storyItem2 == null) {
                            org.telegram.ui.un unVar2 = chatActivityEnterView.P2;
                            org.telegram.messenger.c cVar = chatActivityEnterView.R;
                            long j12 = chatActivityEnterView.Q2;
                            org.telegram.messenger.kj kjVar3 = chatActivityEnterView.T2;
                            threadMessage2 = chatActivityEnterView.getThreadMessage();
                            org.telegram.messenger.rz.S(i12, j12, l4.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), hashMap, cVar, kjVar3, threadMessage2, unVar != null ? unVar.T8() : null, botInlineResult, null, unVar2, chatActivityEnterView.V2, z10);
                            i12 = i12;
                            z10 = z10;
                        } else {
                            org.telegram.messenger.rz C2 = org.telegram.messenger.rz.C(chatActivityEnterView.Q);
                            TLRPC.Document document2 = botInlineResult.document;
                            long j13 = chatActivityEnterView.Q2;
                            org.telegram.messenger.kj kjVar4 = chatActivityEnterView.T2;
                            threadMessage = chatActivityEnterView.getThreadMessage();
                            C2.v0(document2, str2, j13, kjVar4, threadMessage, storyItem2, chatActivityEnterView.V2, null, z10, i12, i11, false, obj2, unVar != null ? unVar.T8() : null, l4.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                        }
                        if (chatActivityEnterView.R1 != 0) {
                            chatActivityEnterView.k1(0, true);
                            chatActivityEnterView.U0.t(true);
                            chatActivityEnterView.U0.B();
                        }
                    }
                }
                sf sfVar2 = chatActivityEnterView.Z2;
                if (sfVar2 != null) {
                    sfVar2.E(null, z10, i12, 0, 0L);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ uc(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.gj gjVar, boolean z10, int i10, int i11, Object obj, Long l4, boolean z11) {
        this.r = chatActivityEnterView;
        this.s = document;
        this.n = str;
        this.w = gjVar;
        this.c = z10;
        this.d = i10;
        this.e = i11;
        this.b = obj;
        this.h = l4;
        this.f = z11;
    }
}
