package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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

    public /* synthetic */ uc(lf lfVar, Object obj, org.telegram.messenger.ef efVar, boolean z10, int i10, int i11, boolean z11, Long l4, String str, Object obj2) {
        this.r = lfVar;
        this.b = obj;
        this.s = efVar;
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
        org.telegram.messenger.jj threadMessage;
        org.telegram.messenger.jj threadMessage2;
        org.telegram.messenger.jj threadMessage3;
        org.telegram.messenger.jj threadMessage4;
        String str;
        switch (this.a) {
            case 0:
                ChatActivityEnterView.f((ChatActivityEnterView) this.r, (TLRPC.Document) this.s, this.n, (org.telegram.messenger.fj) this.w, this.c, this.d, this.e, this.b, this.h, this.f);
                break;
            default:
                lf lfVar = (lf) this.r;
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) this.s;
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
                    org.telegram.messenger.x20 x20Var = efVar != null ? efVar.s : null;
                    if (x20Var != null && efVar != null) {
                        x20Var.s = true;
                        boolean c10 = x20Var.c();
                        x20Var.s = false;
                        x20Var.t = true;
                        z12 = c10;
                    }
                    boolean z15 = this.f;
                    if (z12) {
                        ArrayList arrayList = new ArrayList();
                        org.telegram.messenger.pz pzVar = new org.telegram.messenger.pz();
                        if (efVar.b || (str = efVar.h) == null) {
                            String str3 = efVar.I;
                            if (str3 != null) {
                                pzVar.c = str3;
                            }
                        } else {
                            pzVar.c = str;
                            if (efVar.c()) {
                                pzVar.y = efVar.clone();
                            }
                        }
                        pzVar.e = efVar.c;
                        pzVar.f = efVar.g;
                        pzVar.g = efVar.e;
                        pzVar.p = efVar.d();
                        pzVar.o = efVar.b;
                        pzVar.q = efVar.i();
                        pzVar.z = efVar.m;
                        pzVar.A = efVar.P;
                        CharSequence charSequence = efVar.a;
                        pzVar.d = charSequence != null ? charSequence.toString() : null;
                        pzVar.i = efVar.n;
                        pzVar.j = efVar.r;
                        pzVar.h = efVar.x;
                        pzVar.k = efVar.s;
                        pzVar.r = efVar.L;
                        pzVar.t = org.telegram.messenger.qz.h(efVar.a);
                        pzVar.u = efVar.M;
                        pzVar.w = efVar.N;
                        pzVar.x = efVar.c();
                        arrayList.add(pzVar);
                        efVar.e();
                        org.telegram.messenger.c a2 = org.telegram.messenger.c.a(chatActivityEnterView.Q);
                        long j10 = chatActivityEnterView.Q2;
                        org.telegram.messenger.jj jjVar = chatActivityEnterView.T2;
                        threadMessage4 = chatActivityEnterView.getThreadMessage();
                        org.telegram.messenger.qz.X(a2, arrayList, j10, jjVar, threadMessage4, null, chatActivityEnterView.V2, false, false, chatActivityEnterView.Z1, null, z14, i12, i11, false, null, unVar != null ? unVar.P8() : null, chatActivityEnterView.S4, z15, l4.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), null, false);
                        z10 = z14;
                        i12 = i12;
                    } else {
                        org.telegram.messenger.qz C = org.telegram.messenger.qz.C(chatActivityEnterView.Q);
                        long j11 = chatActivityEnterView.Q2;
                        CharSequence charSequence2 = efVar != null ? efVar.a : null;
                        TL_stories.StoryItem storyItem = P0;
                        org.telegram.messenger.jj jjVar2 = chatActivityEnterView.T2;
                        threadMessage3 = chatActivityEnterView.getThreadMessage();
                        C.u0(document, str2, j11, charSequence2, x20Var, jjVar2, threadMessage3, storyItem, chatActivityEnterView.V2, null, z14, i12, i11, false, obj2, unVar != null ? unVar.P8() : null, l4.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), z15);
                        z10 = z14;
                        i12 = i12;
                        org.telegram.messenger.ui.b0(chatActivityEnterView.Q).c(document, (int) (System.currentTimeMillis() / 1000), true);
                        if (org.telegram.messenger.o5.C(chatActivityEnterView.Q2)) {
                            org.telegram.messenger.vp.r1(chatActivityEnterView.R.a).q4(obj2, document);
                        }
                    }
                } else {
                    z10 = z14;
                    TL_stories.StoryItem storyItem2 = P0;
                    if (obj instanceof TLRPC.BotInlineResult) {
                        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj;
                        if (botInlineResult.document != null) {
                            org.telegram.messenger.ui.b0(chatActivityEnterView.Q).c(botInlineResult.document, (int) (System.currentTimeMillis() / 1000), false);
                            if (org.telegram.messenger.o5.C(chatActivityEnterView.Q2)) {
                                org.telegram.messenger.vp.r1(chatActivityEnterView.R.a).q4(obj2, botInlineResult.document);
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
                            org.telegram.messenger.jj jjVar3 = chatActivityEnterView.T2;
                            threadMessage2 = chatActivityEnterView.getThreadMessage();
                            org.telegram.messenger.qz.S(i12, j12, l4.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), hashMap, cVar, jjVar3, threadMessage2, unVar != null ? unVar.P8() : null, botInlineResult, null, unVar2, chatActivityEnterView.V2, z10);
                            i12 = i12;
                            z10 = z10;
                        } else {
                            org.telegram.messenger.qz C2 = org.telegram.messenger.qz.C(chatActivityEnterView.Q);
                            TLRPC.Document document2 = botInlineResult.document;
                            long j13 = chatActivityEnterView.Q2;
                            org.telegram.messenger.jj jjVar4 = chatActivityEnterView.T2;
                            threadMessage = chatActivityEnterView.getThreadMessage();
                            C2.v0(document2, str2, j13, jjVar4, threadMessage, storyItem2, chatActivityEnterView.V2, null, z10, i12, i11, false, obj2, unVar != null ? unVar.P8() : null, l4.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
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

    public /* synthetic */ uc(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.fj fjVar, boolean z10, int i10, int i11, Object obj, Long l4, boolean z11) {
        this.r = chatActivityEnterView;
        this.s = document;
        this.n = str;
        this.w = fjVar;
        this.c = z10;
        this.d = i10;
        this.e = i11;
        this.b = obj;
        this.h = l4;
        this.f = z11;
    }
}
