package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class jd implements Runnable {
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

    public /* synthetic */ jd(hg hgVar, Object obj, org.telegram.messenger.ef efVar, boolean z10, int i7, int i10, boolean z11, Long l10, String str, Object obj2) {
        this.r = hgVar;
        this.b = obj;
        this.s = efVar;
        this.c = z10;
        this.d = i7;
        this.e = i10;
        this.f = z11;
        this.h = l10;
        this.n = str;
        this.w = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        org.telegram.messenger.fj threadMessage;
        org.telegram.messenger.fj threadMessage2;
        org.telegram.messenger.fj threadMessage3;
        org.telegram.messenger.fj threadMessage4;
        String str;
        switch (this.a) {
            case 0:
                ChatActivityEnterView.f((ChatActivityEnterView) this.r, (TLRPC.Document) this.s, this.n, (org.telegram.messenger.bj) this.w, this.c, this.d, this.e, this.b, this.h, this.f);
                break;
            default:
                hg hgVar = (hg) this.r;
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) this.s;
                ChatActivityEnterView chatActivityEnterView = hgVar.a;
                boolean z11 = chatActivityEnterView.p4;
                org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
                boolean z12 = false;
                if (z11) {
                    if (chatActivityEnterView.H2 != 0) {
                        chatActivityEnterView.V0.A();
                    }
                    chatActivityEnterView.S1(false, true, false, true);
                }
                mg mgVar = chatActivityEnterView.P3;
                TL_stories.StoryItem Y0 = mgVar != null ? mgVar.Y0() : null;
                Object obj = this.b;
                boolean z13 = obj instanceof TLRPC.Document;
                boolean z14 = this.c;
                int i7 = this.d;
                int i10 = this.e;
                Long l10 = this.h;
                int i11 = i7;
                String str2 = this.n;
                Object obj2 = this.w;
                if (z13) {
                    TLRPC.Document document = (TLRPC.Document) obj;
                    org.telegram.messenger.d20 d20Var = efVar != null ? efVar.s : null;
                    if (d20Var != null && efVar != null) {
                        d20Var.s = true;
                        boolean c10 = d20Var.c();
                        d20Var.s = false;
                        d20Var.t = true;
                        z12 = c10;
                    }
                    boolean z15 = this.f;
                    if (z12) {
                        ArrayList arrayList = new ArrayList();
                        org.telegram.messenger.yy yyVar = new org.telegram.messenger.yy();
                        if (efVar.b || (str = efVar.h) == null) {
                            String str3 = efVar.I;
                            if (str3 != null) {
                                yyVar.c = str3;
                            }
                        } else {
                            yyVar.c = str;
                            if (efVar.c()) {
                                yyVar.y = efVar.clone();
                            }
                        }
                        yyVar.e = efVar.c;
                        yyVar.f = efVar.g;
                        yyVar.g = efVar.e;
                        yyVar.p = efVar.d();
                        yyVar.o = efVar.b;
                        yyVar.q = efVar.j();
                        yyVar.z = efVar.m;
                        yyVar.A = efVar.P;
                        CharSequence charSequence = efVar.a;
                        yyVar.d = charSequence != null ? charSequence.toString() : null;
                        yyVar.i = efVar.n;
                        yyVar.j = efVar.r;
                        yyVar.h = efVar.x;
                        yyVar.k = efVar.s;
                        yyVar.r = efVar.L;
                        yyVar.t = org.telegram.messenger.zy.h(efVar.a);
                        yyVar.u = efVar.M;
                        yyVar.w = efVar.N;
                        yyVar.x = efVar.c();
                        arrayList.add(yyVar);
                        efVar.e();
                        org.telegram.messenger.c a10 = org.telegram.messenger.c.a(chatActivityEnterView.R);
                        long j3 = chatActivityEnterView.G3;
                        org.telegram.messenger.fj fjVar = chatActivityEnterView.J3;
                        threadMessage4 = chatActivityEnterView.getThreadMessage();
                        org.telegram.messenger.zy.X(a10, arrayList, j3, fjVar, threadMessage4, null, chatActivityEnterView.L3, false, false, chatActivityEnterView.P2, null, z14, i11, i10, false, null, bnVar != null ? bnVar.Y8() : null, chatActivityEnterView.P6, z15, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), null, false);
                        z10 = z14;
                        i11 = i11;
                    } else {
                        org.telegram.messenger.zy C = org.telegram.messenger.zy.C(chatActivityEnterView.R);
                        long j10 = chatActivityEnterView.G3;
                        CharSequence charSequence2 = efVar != null ? efVar.a : null;
                        TL_stories.StoryItem storyItem = Y0;
                        org.telegram.messenger.fj fjVar2 = chatActivityEnterView.J3;
                        threadMessage3 = chatActivityEnterView.getThreadMessage();
                        C.u0(document, str2, j10, charSequence2, d20Var, fjVar2, threadMessage3, storyItem, chatActivityEnterView.L3, null, z14, i11, i10, false, obj2, bnVar != null ? bnVar.Y8() : null, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), z15);
                        z10 = z14;
                        i11 = i11;
                        org.telegram.messenger.ri.d0(chatActivityEnterView.R).c(document, (int) (System.currentTimeMillis() / 1000), true);
                        if (org.telegram.messenger.n5.C(chatActivityEnterView.G3)) {
                            org.telegram.messenger.mp.u1(chatActivityEnterView.S.a).C4(obj2, document);
                        }
                    }
                } else {
                    z10 = z14;
                    TL_stories.StoryItem storyItem2 = Y0;
                    if (obj instanceof TLRPC.BotInlineResult) {
                        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj;
                        if (botInlineResult.document != null) {
                            org.telegram.messenger.ri.d0(chatActivityEnterView.R).c(botInlineResult.document, (int) (System.currentTimeMillis() / 1000), false);
                            if (org.telegram.messenger.n5.C(chatActivityEnterView.G3)) {
                                org.telegram.messenger.mp.u1(chatActivityEnterView.S.a).C4(obj2, botInlineResult.document);
                            }
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("id", botInlineResult.id);
                        hashMap.put("query_id", "" + botInlineResult.query_id);
                        hashMap.put("force_gif", "1");
                        if (storyItem2 == null) {
                            org.telegram.ui.bn bnVar2 = chatActivityEnterView.F3;
                            org.telegram.messenger.c cVar = chatActivityEnterView.S;
                            long j11 = chatActivityEnterView.G3;
                            org.telegram.messenger.fj fjVar3 = chatActivityEnterView.J3;
                            threadMessage2 = chatActivityEnterView.getThreadMessage();
                            org.telegram.messenger.zy.S(i11, j11, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), hashMap, cVar, fjVar3, threadMessage2, bnVar != null ? bnVar.Y8() : null, botInlineResult, null, bnVar2, chatActivityEnterView.L3, z10);
                            i11 = i11;
                            z10 = z10;
                        } else {
                            org.telegram.messenger.zy C2 = org.telegram.messenger.zy.C(chatActivityEnterView.R);
                            TLRPC.Document document2 = botInlineResult.document;
                            long j12 = chatActivityEnterView.G3;
                            org.telegram.messenger.fj fjVar4 = chatActivityEnterView.J3;
                            threadMessage = chatActivityEnterView.getThreadMessage();
                            C2.v0(document2, str2, j12, fjVar4, threadMessage, storyItem2, chatActivityEnterView.L3, null, z10, i11, i10, false, obj2, bnVar != null ? bnVar.Y8() : null, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                        }
                        if (chatActivityEnterView.H2 != 0) {
                            chatActivityEnterView.R1(0, true);
                            chatActivityEnterView.V0.t(true);
                            chatActivityEnterView.V0.A();
                        }
                    }
                }
                mg mgVar2 = chatActivityEnterView.P3;
                if (mgVar2 != null) {
                    mgVar2.G(null, z10, i11, 0, 0L);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ jd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.bj bjVar, boolean z10, int i7, int i10, Object obj, Long l10, boolean z11) {
        this.r = chatActivityEnterView;
        this.s = document;
        this.n = str;
        this.w = bjVar;
        this.c = z10;
        this.d = i7;
        this.e = i10;
        this.b = obj;
        this.h = l10;
        this.f = z11;
    }
}
