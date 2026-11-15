package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ad implements Runnable {
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

    public /* synthetic */ ad(wf wfVar, Object obj, org.telegram.messenger.ff ffVar, boolean z10, int i7, int i10, boolean z11, Long l10, String str, Object obj2) {
        this.r = wfVar;
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
                wf wfVar = (wf) this.r;
                org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) this.s;
                ChatActivityEnterView chatActivityEnterView = wfVar.a;
                boolean z11 = chatActivityEnterView.h4;
                org.telegram.ui.an anVar = chatActivityEnterView.x3;
                boolean z12 = false;
                if (z11) {
                    if (chatActivityEnterView.z2 != 0) {
                        chatActivityEnterView.V0.A();
                    }
                    chatActivityEnterView.E1(false, true, false, true);
                }
                cg cgVar = chatActivityEnterView.H3;
                TL_stories.StoryItem c12 = cgVar != null ? cgVar.c1() : null;
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
                    org.telegram.messenger.g20 g20Var = ffVar != null ? ffVar.s : null;
                    if (g20Var != null && ffVar != null) {
                        g20Var.s = true;
                        boolean c10 = g20Var.c();
                        g20Var.s = false;
                        g20Var.t = true;
                        z12 = c10;
                    }
                    boolean z15 = this.f;
                    if (z12) {
                        ArrayList arrayList = new ArrayList();
                        org.telegram.messenger.dz dzVar = new org.telegram.messenger.dz();
                        if (ffVar.b || (str = ffVar.h) == null) {
                            String str3 = ffVar.I;
                            if (str3 != null) {
                                dzVar.c = str3;
                            }
                        } else {
                            dzVar.c = str;
                            if (ffVar.c()) {
                                dzVar.y = ffVar.clone();
                            }
                        }
                        dzVar.e = ffVar.c;
                        dzVar.f = ffVar.g;
                        dzVar.g = ffVar.e;
                        dzVar.p = ffVar.d();
                        dzVar.o = ffVar.b;
                        dzVar.q = ffVar.j();
                        dzVar.z = ffVar.m;
                        dzVar.A = ffVar.P;
                        CharSequence charSequence = ffVar.a;
                        dzVar.d = charSequence != null ? charSequence.toString() : null;
                        dzVar.i = ffVar.n;
                        dzVar.j = ffVar.r;
                        dzVar.h = ffVar.x;
                        dzVar.k = ffVar.s;
                        dzVar.r = ffVar.L;
                        dzVar.t = org.telegram.messenger.ez.h(ffVar.a);
                        dzVar.u = ffVar.M;
                        dzVar.w = ffVar.N;
                        dzVar.x = ffVar.c();
                        arrayList.add(dzVar);
                        ffVar.e();
                        org.telegram.messenger.c a10 = org.telegram.messenger.c.a(chatActivityEnterView.R);
                        long j3 = chatActivityEnterView.y3;
                        org.telegram.messenger.gj gjVar = chatActivityEnterView.B3;
                        threadMessage4 = chatActivityEnterView.getThreadMessage();
                        org.telegram.messenger.ez.X(a10, arrayList, j3, gjVar, threadMessage4, null, chatActivityEnterView.D3, false, false, chatActivityEnterView.H2, null, z14, i11, i10, false, null, anVar != null ? anVar.Y8() : null, chatActivityEnterView.n6, z15, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), null, false);
                        z10 = z14;
                        i11 = i11;
                    } else {
                        org.telegram.messenger.ez C = org.telegram.messenger.ez.C(chatActivityEnterView.R);
                        long j10 = chatActivityEnterView.y3;
                        CharSequence charSequence2 = ffVar != null ? ffVar.a : null;
                        TL_stories.StoryItem storyItem = c12;
                        org.telegram.messenger.gj gjVar2 = chatActivityEnterView.B3;
                        threadMessage3 = chatActivityEnterView.getThreadMessage();
                        C.u0(document, str2, j10, charSequence2, g20Var, gjVar2, threadMessage3, storyItem, chatActivityEnterView.D3, null, z14, i11, i10, false, obj2, anVar != null ? anVar.Y8() : null, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), z15);
                        z10 = z14;
                        i11 = i11;
                        org.telegram.messenger.si.b0(chatActivityEnterView.R).c(document, (int) (System.currentTimeMillis() / 1000), true);
                        if (org.telegram.messenger.m5.C(chatActivityEnterView.y3)) {
                            org.telegram.messenger.np.s1(chatActivityEnterView.S.a).t4(obj2, document);
                        }
                    }
                } else {
                    z10 = z14;
                    TL_stories.StoryItem storyItem2 = c12;
                    if (obj instanceof TLRPC.BotInlineResult) {
                        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj;
                        if (botInlineResult.document != null) {
                            org.telegram.messenger.si.b0(chatActivityEnterView.R).c(botInlineResult.document, (int) (System.currentTimeMillis() / 1000), false);
                            if (org.telegram.messenger.m5.C(chatActivityEnterView.y3)) {
                                org.telegram.messenger.np.s1(chatActivityEnterView.S.a).t4(obj2, botInlineResult.document);
                            }
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("id", botInlineResult.id);
                        hashMap.put("query_id", "" + botInlineResult.query_id);
                        hashMap.put("force_gif", "1");
                        if (storyItem2 == null) {
                            org.telegram.ui.an anVar2 = chatActivityEnterView.x3;
                            org.telegram.messenger.c cVar = chatActivityEnterView.S;
                            long j11 = chatActivityEnterView.y3;
                            org.telegram.messenger.gj gjVar3 = chatActivityEnterView.B3;
                            threadMessage2 = chatActivityEnterView.getThreadMessage();
                            org.telegram.messenger.ez.S(i11, j11, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), hashMap, cVar, gjVar3, threadMessage2, anVar != null ? anVar.Y8() : null, botInlineResult, null, anVar2, chatActivityEnterView.D3, z10);
                            i11 = i11;
                            z10 = z10;
                        } else {
                            org.telegram.messenger.ez C2 = org.telegram.messenger.ez.C(chatActivityEnterView.R);
                            TLRPC.Document document2 = botInlineResult.document;
                            long j12 = chatActivityEnterView.y3;
                            org.telegram.messenger.gj gjVar4 = chatActivityEnterView.B3;
                            threadMessage = chatActivityEnterView.getThreadMessage();
                            C2.v0(document2, str2, j12, gjVar4, threadMessage, storyItem2, chatActivityEnterView.D3, null, z10, i11, i10, false, obj2, anVar != null ? anVar.Y8() : null, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                        }
                        if (chatActivityEnterView.z2 != 0) {
                            chatActivityEnterView.D1(0, true);
                            chatActivityEnterView.V0.t(true);
                            chatActivityEnterView.V0.A();
                        }
                    }
                }
                cg cgVar2 = chatActivityEnterView.H3;
                if (cgVar2 != null) {
                    cgVar2.M(null, z10, i11, 0, 0L);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ad(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.cj cjVar, boolean z10, int i7, int i10, Object obj, Long l10, boolean z11) {
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
