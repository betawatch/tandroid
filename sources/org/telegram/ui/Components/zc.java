package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zc implements Runnable {
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

    public /* synthetic */ zc(nf nfVar, Object obj, org.telegram.messenger.ye yeVar, boolean z10, int i3, int i10, boolean z11, Long l10, String str, Object obj2) {
        this.r = nfVar;
        this.b = obj;
        this.s = yeVar;
        this.c = z10;
        this.d = i3;
        this.e = i10;
        this.f = z11;
        this.h = l10;
        this.n = str;
        this.w = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        org.telegram.messenger.zi threadMessage;
        org.telegram.messenger.zi threadMessage2;
        org.telegram.messenger.zi threadMessage3;
        org.telegram.messenger.zi threadMessage4;
        String str;
        switch (this.a) {
            case 0:
                ChatActivityEnterView.f((ChatActivityEnterView) this.r, (TLRPC.Document) this.s, this.n, (org.telegram.messenger.vi) this.w, this.c, this.d, this.e, this.b, this.h, this.f);
                break;
            default:
                nf nfVar = (nf) this.r;
                org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) this.s;
                ChatActivityEnterView chatActivityEnterView = nfVar.a;
                boolean z11 = chatActivityEnterView.A3;
                org.telegram.ui.wm wmVar = chatActivityEnterView.Q2;
                boolean z12 = false;
                if (z11) {
                    if (chatActivityEnterView.S1 != 0) {
                        chatActivityEnterView.V0.A();
                    }
                    chatActivityEnterView.m1(false, true, false, true);
                }
                uf ufVar = chatActivityEnterView.a3;
                TL_stories.StoryItem R0 = ufVar != null ? ufVar.R0() : null;
                Object obj = this.b;
                boolean z13 = obj instanceof TLRPC.Document;
                boolean z14 = this.c;
                int i3 = this.d;
                int i10 = this.e;
                Long l10 = this.h;
                int i11 = i3;
                String str2 = this.n;
                Object obj2 = this.w;
                if (z13) {
                    TLRPC.Document document = (TLRPC.Document) obj;
                    org.telegram.messenger.b20 b20Var = yeVar != null ? yeVar.s : null;
                    if (b20Var != null && yeVar != null) {
                        b20Var.s = true;
                        boolean c2 = b20Var.c();
                        b20Var.s = false;
                        b20Var.t = true;
                        z12 = c2;
                    }
                    boolean z15 = this.f;
                    if (z12) {
                        ArrayList arrayList = new ArrayList();
                        org.telegram.messenger.xy xyVar = new org.telegram.messenger.xy();
                        if (yeVar.b || (str = yeVar.h) == null) {
                            String str3 = yeVar.I;
                            if (str3 != null) {
                                xyVar.c = str3;
                            }
                        } else {
                            xyVar.c = str;
                            if (yeVar.c()) {
                                xyVar.y = yeVar.clone();
                            }
                        }
                        xyVar.e = yeVar.c;
                        xyVar.f = yeVar.g;
                        xyVar.g = yeVar.e;
                        xyVar.p = yeVar.d();
                        xyVar.o = yeVar.b;
                        xyVar.q = yeVar.j();
                        xyVar.z = yeVar.m;
                        xyVar.A = yeVar.P;
                        CharSequence charSequence = yeVar.a;
                        xyVar.d = charSequence != null ? charSequence.toString() : null;
                        xyVar.i = yeVar.n;
                        xyVar.j = yeVar.r;
                        xyVar.h = yeVar.x;
                        xyVar.k = yeVar.s;
                        xyVar.r = yeVar.L;
                        xyVar.t = org.telegram.messenger.yy.h(yeVar.a);
                        xyVar.u = yeVar.M;
                        xyVar.w = yeVar.N;
                        xyVar.x = yeVar.c();
                        arrayList.add(xyVar);
                        yeVar.e();
                        org.telegram.messenger.c a10 = org.telegram.messenger.c.a(chatActivityEnterView.R);
                        long j10 = chatActivityEnterView.R2;
                        org.telegram.messenger.zi ziVar = chatActivityEnterView.U2;
                        threadMessage4 = chatActivityEnterView.getThreadMessage();
                        org.telegram.messenger.yy.X(a10, arrayList, j10, ziVar, threadMessage4, null, chatActivityEnterView.W2, false, false, chatActivityEnterView.a2, null, z14, i11, i10, false, null, wmVar != null ? wmVar.W8() : null, chatActivityEnterView.T4, z15, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), null, false);
                        z10 = z14;
                        i11 = i11;
                    } else {
                        org.telegram.messenger.yy C = org.telegram.messenger.yy.C(chatActivityEnterView.R);
                        long j11 = chatActivityEnterView.R2;
                        CharSequence charSequence2 = yeVar != null ? yeVar.a : null;
                        TL_stories.StoryItem storyItem = R0;
                        org.telegram.messenger.zi ziVar2 = chatActivityEnterView.U2;
                        threadMessage3 = chatActivityEnterView.getThreadMessage();
                        C.u0(document, str2, j11, charSequence2, b20Var, ziVar2, threadMessage3, storyItem, chatActivityEnterView.W2, null, z14, i11, i10, false, obj2, wmVar != null ? wmVar.W8() : null, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), z15);
                        z10 = z14;
                        i11 = i11;
                        org.telegram.messenger.li.b0(chatActivityEnterView.R).c(document, (int) (System.currentTimeMillis() / 1000), true);
                        if (org.telegram.messenger.m5.C(chatActivityEnterView.R2)) {
                            org.telegram.messenger.hp.s1(chatActivityEnterView.S.a).t4(obj2, document);
                        }
                    }
                } else {
                    z10 = z14;
                    TL_stories.StoryItem storyItem2 = R0;
                    if (obj instanceof TLRPC.BotInlineResult) {
                        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj;
                        if (botInlineResult.document != null) {
                            org.telegram.messenger.li.b0(chatActivityEnterView.R).c(botInlineResult.document, (int) (System.currentTimeMillis() / 1000), false);
                            if (org.telegram.messenger.m5.C(chatActivityEnterView.R2)) {
                                org.telegram.messenger.hp.s1(chatActivityEnterView.S.a).t4(obj2, botInlineResult.document);
                            }
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("id", botInlineResult.id);
                        hashMap.put("query_id", "" + botInlineResult.query_id);
                        hashMap.put("force_gif", "1");
                        if (storyItem2 == null) {
                            org.telegram.ui.wm wmVar2 = chatActivityEnterView.Q2;
                            org.telegram.messenger.c cVar = chatActivityEnterView.S;
                            long j12 = chatActivityEnterView.R2;
                            org.telegram.messenger.zi ziVar3 = chatActivityEnterView.U2;
                            threadMessage2 = chatActivityEnterView.getThreadMessage();
                            org.telegram.messenger.yy.S(i11, j12, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), hashMap, cVar, ziVar3, threadMessage2, wmVar != null ? wmVar.W8() : null, botInlineResult, null, wmVar2, chatActivityEnterView.W2, z10);
                            i11 = i11;
                            z10 = z10;
                        } else {
                            org.telegram.messenger.yy C2 = org.telegram.messenger.yy.C(chatActivityEnterView.R);
                            TLRPC.Document document2 = botInlineResult.document;
                            long j13 = chatActivityEnterView.R2;
                            org.telegram.messenger.zi ziVar4 = chatActivityEnterView.U2;
                            threadMessage = chatActivityEnterView.getThreadMessage();
                            C2.v0(document2, str2, j13, ziVar4, threadMessage, storyItem2, chatActivityEnterView.W2, null, z10, i11, i10, false, obj2, wmVar != null ? wmVar.W8() : null, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                        }
                        if (chatActivityEnterView.S1 != 0) {
                            chatActivityEnterView.l1(0, true);
                            chatActivityEnterView.V0.t(true);
                            chatActivityEnterView.V0.A();
                        }
                    }
                }
                uf ufVar2 = chatActivityEnterView.a3;
                if (ufVar2 != null) {
                    ufVar2.G(null, z10, i11, 0, 0L);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ zc(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.vi viVar, boolean z10, int i3, int i10, Object obj, Long l10, boolean z11) {
        this.r = chatActivityEnterView;
        this.s = document;
        this.n = str;
        this.w = viVar;
        this.c = z10;
        this.d = i3;
        this.e = i10;
        this.b = obj;
        this.h = l10;
        this.f = z11;
    }
}
