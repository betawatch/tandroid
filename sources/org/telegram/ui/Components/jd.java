package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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

    public /* synthetic */ jd(ig igVar, Object obj, org.telegram.messenger.ff ffVar, boolean z10, int i7, int i10, boolean z11, Long l10, String str, Object obj2) {
        this.r = igVar;
        this.b = obj;
        this.s = ffVar;
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
        org.telegram.messenger.gj threadMessage;
        org.telegram.messenger.gj threadMessage2;
        org.telegram.messenger.gj threadMessage3;
        org.telegram.messenger.gj threadMessage4;
        String str;
        switch (this.a) {
            case 0:
                ChatActivityEnterView.f((ChatActivityEnterView) this.r, (TLRPC.Document) this.s, this.n, (org.telegram.messenger.cj) this.w, this.c, this.d, this.e, this.b, this.h, this.f);
                break;
            default:
                ig igVar = (ig) this.r;
                org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) this.s;
                ChatActivityEnterView chatActivityEnterView = igVar.a;
                boolean z11 = chatActivityEnterView.p4;
                org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
                boolean z12 = false;
                if (z11) {
                    if (chatActivityEnterView.H2 != 0) {
                        chatActivityEnterView.V0.A();
                    }
                    chatActivityEnterView.Q1(false, true, false, true);
                }
                ng ngVar = chatActivityEnterView.P3;
                TL_stories.StoryItem c12 = ngVar != null ? ngVar.c1() : null;
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
                    org.telegram.messenger.f20 f20Var = ffVar != null ? ffVar.s : null;
                    if (f20Var != null && ffVar != null) {
                        f20Var.s = true;
                        boolean c10 = f20Var.c();
                        f20Var.s = false;
                        f20Var.t = true;
                        z12 = c10;
                    }
                    boolean z15 = this.f;
                    if (z12) {
                        ArrayList arrayList = new ArrayList();
                        org.telegram.messenger.zy zyVar = new org.telegram.messenger.zy();
                        if (ffVar.b || (str = ffVar.h) == null) {
                            String str3 = ffVar.I;
                            if (str3 != null) {
                                zyVar.c = str3;
                            }
                        } else {
                            zyVar.c = str;
                            if (ffVar.c()) {
                                zyVar.y = ffVar.clone();
                            }
                        }
                        zyVar.e = ffVar.c;
                        zyVar.f = ffVar.g;
                        zyVar.g = ffVar.e;
                        zyVar.p = ffVar.d();
                        zyVar.o = ffVar.b;
                        zyVar.q = ffVar.j();
                        zyVar.z = ffVar.m;
                        zyVar.A = ffVar.P;
                        CharSequence charSequence = ffVar.a;
                        zyVar.d = charSequence != null ? charSequence.toString() : null;
                        zyVar.i = ffVar.n;
                        zyVar.j = ffVar.r;
                        zyVar.h = ffVar.x;
                        zyVar.k = ffVar.s;
                        zyVar.r = ffVar.L;
                        zyVar.t = org.telegram.messenger.az.h(ffVar.a);
                        zyVar.u = ffVar.M;
                        zyVar.w = ffVar.N;
                        zyVar.x = ffVar.c();
                        arrayList.add(zyVar);
                        ffVar.e();
                        org.telegram.messenger.c a10 = org.telegram.messenger.c.a(chatActivityEnterView.R);
                        long j3 = chatActivityEnterView.G3;
                        org.telegram.messenger.gj gjVar = chatActivityEnterView.J3;
                        threadMessage4 = chatActivityEnterView.getThreadMessage();
                        org.telegram.messenger.az.X(a10, arrayList, j3, gjVar, threadMessage4, null, chatActivityEnterView.L3, false, false, chatActivityEnterView.P2, null, z14, i11, i10, false, null, bnVar != null ? bnVar.Y8() : null, chatActivityEnterView.P6, z15, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), null, false);
                        z10 = z14;
                        i11 = i11;
                    } else {
                        org.telegram.messenger.az C = org.telegram.messenger.az.C(chatActivityEnterView.R);
                        long j10 = chatActivityEnterView.G3;
                        CharSequence charSequence2 = ffVar != null ? ffVar.a : null;
                        TL_stories.StoryItem storyItem = c12;
                        org.telegram.messenger.gj gjVar2 = chatActivityEnterView.J3;
                        threadMessage3 = chatActivityEnterView.getThreadMessage();
                        C.u0(document, str2, j10, charSequence2, f20Var, gjVar2, threadMessage3, storyItem, chatActivityEnterView.L3, null, z14, i11, i10, false, obj2, bnVar != null ? bnVar.Y8() : null, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), z15);
                        z10 = z14;
                        i11 = i11;
                        org.telegram.messenger.si.d0(chatActivityEnterView.R).c(document, (int) (System.currentTimeMillis() / 1000), true);
                        if (org.telegram.messenger.n5.C(chatActivityEnterView.G3)) {
                            org.telegram.messenger.np.u1(chatActivityEnterView.S.a).C4(obj2, document);
                        }
                    }
                } else {
                    z10 = z14;
                    TL_stories.StoryItem storyItem2 = c12;
                    if (obj instanceof TLRPC.BotInlineResult) {
                        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj;
                        if (botInlineResult.document != null) {
                            org.telegram.messenger.si.d0(chatActivityEnterView.R).c(botInlineResult.document, (int) (System.currentTimeMillis() / 1000), false);
                            if (org.telegram.messenger.n5.C(chatActivityEnterView.G3)) {
                                org.telegram.messenger.np.u1(chatActivityEnterView.S.a).C4(obj2, botInlineResult.document);
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
                            org.telegram.messenger.gj gjVar3 = chatActivityEnterView.J3;
                            threadMessage2 = chatActivityEnterView.getThreadMessage();
                            org.telegram.messenger.az.S(i11, j11, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), hashMap, cVar, gjVar3, threadMessage2, bnVar != null ? bnVar.Y8() : null, botInlineResult, null, bnVar2, chatActivityEnterView.L3, z10);
                            i11 = i11;
                            z10 = z10;
                        } else {
                            org.telegram.messenger.az C2 = org.telegram.messenger.az.C(chatActivityEnterView.R);
                            TLRPC.Document document2 = botInlineResult.document;
                            long j12 = chatActivityEnterView.G3;
                            org.telegram.messenger.gj gjVar4 = chatActivityEnterView.J3;
                            threadMessage = chatActivityEnterView.getThreadMessage();
                            C2.v0(document2, str2, j12, gjVar4, threadMessage, storyItem2, chatActivityEnterView.L3, null, z10, i11, i10, false, obj2, bnVar != null ? bnVar.Y8() : null, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                        }
                        if (chatActivityEnterView.H2 != 0) {
                            chatActivityEnterView.P1(0, true);
                            chatActivityEnterView.V0.t(true);
                            chatActivityEnterView.V0.A();
                        }
                    }
                }
                ng ngVar2 = chatActivityEnterView.P3;
                if (ngVar2 != null) {
                    ngVar2.H(null, z10, i11, 0, 0L);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ jd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.cj cjVar, boolean z10, int i7, int i10, Object obj, Long l10, boolean z11) {
        this.r = chatActivityEnterView;
        this.s = document;
        this.n = str;
        this.w = cjVar;
        this.c = z10;
        this.d = i7;
        this.e = i10;
        this.b = obj;
        this.h = l10;
        this.f = z11;
    }
}
