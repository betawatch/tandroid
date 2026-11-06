package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bd implements Runnable {
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

    public /* synthetic */ bd(pf pfVar, Object obj, org.telegram.messenger.gf gfVar, boolean z9, int i7, int i10, boolean z10, Long l10, String str, Object obj2) {
        this.r = pfVar;
        this.b = obj;
        this.s = gfVar;
        this.c = z9;
        this.d = i7;
        this.e = i10;
        this.f = z10;
        this.h = l10;
        this.n = str;
        this.w = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z9;
        org.telegram.messenger.ij threadMessage;
        org.telegram.messenger.ij threadMessage2;
        org.telegram.messenger.ij threadMessage3;
        org.telegram.messenger.ij threadMessage4;
        String str;
        switch (this.a) {
            case 0:
                ChatActivityEnterView.f((ChatActivityEnterView) this.r, (TLRPC.Document) this.s, this.n, (org.telegram.messenger.ej) this.w, this.c, this.d, this.e, this.b, this.h, this.f);
                break;
            default:
                pf pfVar = (pf) this.r;
                org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) this.s;
                ChatActivityEnterView chatActivityEnterView = pfVar.a;
                boolean z10 = chatActivityEnterView.z3;
                org.telegram.ui.an anVar = chatActivityEnterView.P2;
                boolean z11 = false;
                if (z10) {
                    if (chatActivityEnterView.R1 != 0) {
                        chatActivityEnterView.U0.A();
                    }
                    chatActivityEnterView.n1(false, true, false, true);
                }
                wf wfVar = chatActivityEnterView.Z2;
                TL_stories.StoryItem T0 = wfVar != null ? wfVar.T0() : null;
                Object obj = this.b;
                boolean z12 = obj instanceof TLRPC.Document;
                boolean z13 = this.c;
                int i7 = this.d;
                int i10 = this.e;
                Long l10 = this.h;
                int i11 = i7;
                String str2 = this.n;
                Object obj2 = this.w;
                if (z12) {
                    TLRPC.Document document = (TLRPC.Document) obj;
                    org.telegram.messenger.j20 j20Var = gfVar != null ? gfVar.s : null;
                    if (j20Var != null && gfVar != null) {
                        j20Var.s = true;
                        boolean c10 = j20Var.c();
                        j20Var.s = false;
                        j20Var.t = true;
                        z11 = c10;
                    }
                    boolean z14 = this.f;
                    if (z11) {
                        ArrayList arrayList = new ArrayList();
                        org.telegram.messenger.fz fzVar = new org.telegram.messenger.fz();
                        if (gfVar.b || (str = gfVar.h) == null) {
                            String str3 = gfVar.I;
                            if (str3 != null) {
                                fzVar.c = str3;
                            }
                        } else {
                            fzVar.c = str;
                            if (gfVar.c()) {
                                fzVar.y = gfVar.clone();
                            }
                        }
                        fzVar.e = gfVar.c;
                        fzVar.f = gfVar.g;
                        fzVar.g = gfVar.e;
                        fzVar.p = gfVar.d();
                        fzVar.o = gfVar.b;
                        fzVar.q = gfVar.j();
                        fzVar.z = gfVar.m;
                        fzVar.A = gfVar.P;
                        CharSequence charSequence = gfVar.a;
                        fzVar.d = charSequence != null ? charSequence.toString() : null;
                        fzVar.i = gfVar.n;
                        fzVar.j = gfVar.r;
                        fzVar.h = gfVar.x;
                        fzVar.k = gfVar.s;
                        fzVar.r = gfVar.L;
                        fzVar.t = org.telegram.messenger.gz.h(gfVar.a);
                        fzVar.u = gfVar.M;
                        fzVar.w = gfVar.N;
                        fzVar.x = gfVar.c();
                        arrayList.add(fzVar);
                        gfVar.e();
                        org.telegram.messenger.c a10 = org.telegram.messenger.c.a(chatActivityEnterView.Q);
                        long j3 = chatActivityEnterView.Q2;
                        org.telegram.messenger.ij ijVar = chatActivityEnterView.T2;
                        threadMessage4 = chatActivityEnterView.getThreadMessage();
                        org.telegram.messenger.gz.X(a10, arrayList, j3, ijVar, threadMessage4, null, chatActivityEnterView.V2, false, false, chatActivityEnterView.Z1, null, z13, i11, i10, false, null, anVar != null ? anVar.W8() : null, chatActivityEnterView.S4, z14, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), null, false);
                        z9 = z13;
                        i11 = i11;
                    } else {
                        org.telegram.messenger.gz C = org.telegram.messenger.gz.C(chatActivityEnterView.Q);
                        long j10 = chatActivityEnterView.Q2;
                        CharSequence charSequence2 = gfVar != null ? gfVar.a : null;
                        TL_stories.StoryItem storyItem = T0;
                        org.telegram.messenger.ij ijVar2 = chatActivityEnterView.T2;
                        threadMessage3 = chatActivityEnterView.getThreadMessage();
                        C.u0(document, str2, j10, charSequence2, j20Var, ijVar2, threadMessage3, storyItem, chatActivityEnterView.V2, null, z13, i11, i10, false, obj2, anVar != null ? anVar.W8() : null, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), z14);
                        z9 = z13;
                        i11 = i11;
                        org.telegram.messenger.ui.b0(chatActivityEnterView.Q).c(document, (int) (System.currentTimeMillis() / 1000), true);
                        if (org.telegram.messenger.m5.C(chatActivityEnterView.Q2)) {
                            org.telegram.messenger.qp.s1(chatActivityEnterView.R.a).t4(obj2, document);
                        }
                    }
                } else {
                    z9 = z13;
                    TL_stories.StoryItem storyItem2 = T0;
                    if (obj instanceof TLRPC.BotInlineResult) {
                        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj;
                        if (botInlineResult.document != null) {
                            org.telegram.messenger.ui.b0(chatActivityEnterView.Q).c(botInlineResult.document, (int) (System.currentTimeMillis() / 1000), false);
                            if (org.telegram.messenger.m5.C(chatActivityEnterView.Q2)) {
                                org.telegram.messenger.qp.s1(chatActivityEnterView.R.a).t4(obj2, botInlineResult.document);
                            }
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("id", botInlineResult.id);
                        hashMap.put("query_id", "" + botInlineResult.query_id);
                        hashMap.put("force_gif", "1");
                        if (storyItem2 == null) {
                            org.telegram.ui.an anVar2 = chatActivityEnterView.P2;
                            org.telegram.messenger.c cVar = chatActivityEnterView.R;
                            long j11 = chatActivityEnterView.Q2;
                            org.telegram.messenger.ij ijVar3 = chatActivityEnterView.T2;
                            threadMessage2 = chatActivityEnterView.getThreadMessage();
                            org.telegram.messenger.gz.S(i11, j11, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), hashMap, cVar, ijVar3, threadMessage2, anVar != null ? anVar.W8() : null, botInlineResult, null, anVar2, chatActivityEnterView.V2, z9);
                            i11 = i11;
                            z9 = z9;
                        } else {
                            org.telegram.messenger.gz C2 = org.telegram.messenger.gz.C(chatActivityEnterView.Q);
                            TLRPC.Document document2 = botInlineResult.document;
                            long j12 = chatActivityEnterView.Q2;
                            org.telegram.messenger.ij ijVar4 = chatActivityEnterView.T2;
                            threadMessage = chatActivityEnterView.getThreadMessage();
                            C2.v0(document2, str2, j12, ijVar4, threadMessage, storyItem2, chatActivityEnterView.V2, null, z9, i11, i10, false, obj2, anVar != null ? anVar.W8() : null, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                        }
                        if (chatActivityEnterView.R1 != 0) {
                            chatActivityEnterView.m1(0, true);
                            chatActivityEnterView.U0.t(true);
                            chatActivityEnterView.U0.A();
                        }
                    }
                }
                wf wfVar2 = chatActivityEnterView.Z2;
                if (wfVar2 != null) {
                    wfVar2.F(null, z9, i11, 0, 0L);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ bd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.ej ejVar, boolean z9, int i7, int i10, Object obj, Long l10, boolean z10) {
        this.r = chatActivityEnterView;
        this.s = document;
        this.n = str;
        this.w = ejVar;
        this.c = z9;
        this.d = i7;
        this.e = i10;
        this.b = obj;
        this.h = l10;
        this.f = z10;
    }
}
