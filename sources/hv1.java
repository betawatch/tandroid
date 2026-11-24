// default package

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class hv1 implements Runnable {
    public final /* synthetic */ byte a = 1;
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

    public /* synthetic */ hv1(ay1 ay1Var, Object obj, jm6 jm6Var, boolean z, int i, int i2, boolean z2, Long l, String str, Object obj2) {
        this.r = ay1Var;
        this.b = obj;
        this.s = jm6Var;
        this.c = z;
        this.d = i;
        this.e = i2;
        this.f = z2;
        this.h = l;
        this.n = str;
        this.w = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        k27 threadMessage;
        k27 threadMessage2;
        k27 threadMessage3;
        k27 threadMessage4;
        String str;
        byte b = this.a;
        Object obj = this.s;
        Object obj2 = this.r;
        switch (b) {
            case 0:
                g27 g27Var = (g27) this.w;
                int i = ChatActivityEnterView.r7;
                ((ChatActivityEnterView) obj2).X0((TLRPC.Document) obj, this.n, g27Var, this.c, this.d, this.e, this.b, this.h, this.f);
                break;
            default:
                jm6 jm6Var = (jm6) obj;
                ChatActivityEnterView chatActivityEnterView = ((ay1) obj2).a;
                boolean z2 = chatActivityEnterView.p4;
                mu1 mu1Var = chatActivityEnterView.F3;
                boolean z3 = false;
                if (z2) {
                    if (chatActivityEnterView.H2 != 0) {
                        chatActivityEnterView.V0.z();
                    }
                    chatActivityEnterView.P1(false, true, false, true);
                }
                hy1 hy1Var = chatActivityEnterView.P3;
                TL_stories.StoryItem t0 = hy1Var != null ? hy1Var.t0() : null;
                Object obj3 = this.b;
                boolean z4 = obj3 instanceof TLRPC.Document;
                boolean z5 = this.c;
                int i2 = this.d;
                int i3 = this.e;
                Long l = this.h;
                int i4 = i2;
                String str2 = this.n;
                Object obj4 = this.w;
                if (z4) {
                    TLRPC.Document document = (TLRPC.Document) obj3;
                    oac oacVar = jm6Var != null ? jm6Var.s : null;
                    if (oacVar != null && jm6Var != null) {
                        oacVar.s = true;
                        boolean b2 = oacVar.b();
                        oacVar.s = false;
                        oacVar.t = true;
                        z3 = b2;
                    }
                    boolean z6 = this.f;
                    if (z3) {
                        ArrayList arrayList = new ArrayList();
                        y3a y3aVar = new y3a();
                        if (jm6Var.b || (str = jm6Var.h) == null) {
                            String str3 = jm6Var.I;
                            if (str3 != null) {
                                y3aVar.c = str3;
                            }
                        } else {
                            y3aVar.c = str;
                            if (jm6Var.c()) {
                                y3aVar.y = jm6Var.clone();
                            }
                        }
                        y3aVar.e = jm6Var.c;
                        y3aVar.f = jm6Var.g;
                        y3aVar.g = jm6Var.e;
                        y3aVar.p = jm6Var.d();
                        y3aVar.o = jm6Var.b;
                        y3aVar.q = jm6Var.j();
                        y3aVar.z = jm6Var.m;
                        y3aVar.A = jm6Var.P;
                        CharSequence charSequence = jm6Var.a;
                        y3aVar.d = charSequence != null ? charSequence.toString() : null;
                        y3aVar.i = jm6Var.n;
                        y3aVar.j = jm6Var.r;
                        y3aVar.h = jm6Var.x;
                        y3aVar.k = jm6Var.s;
                        y3aVar.r = jm6Var.L;
                        y3aVar.t = z3a.h(jm6Var.a);
                        y3aVar.u = jm6Var.M;
                        y3aVar.w = jm6Var.N;
                        y3aVar.x = jm6Var.c();
                        arrayList.add(y3aVar);
                        jm6Var.e();
                        j5 a = j5.a(chatActivityEnterView.R);
                        long j = chatActivityEnterView.G3;
                        k27 k27Var = chatActivityEnterView.J3;
                        threadMessage4 = chatActivityEnterView.getThreadMessage();
                        z3a.W(a, arrayList, j, k27Var, threadMessage4, null, chatActivityEnterView.L3, false, false, chatActivityEnterView.P2, null, z5, i4, i3, false, null, mu1Var != null ? mu1Var.Q6() : null, chatActivityEnterView.O6, z6, l.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), null, false);
                        z = z5;
                        i4 = i4;
                    } else {
                        z3a B = z3a.B(chatActivityEnterView.R);
                        long j2 = chatActivityEnterView.G3;
                        CharSequence charSequence2 = jm6Var != null ? jm6Var.a : null;
                        TL_stories.StoryItem storyItem = t0;
                        k27 k27Var2 = chatActivityEnterView.J3;
                        threadMessage3 = chatActivityEnterView.getThreadMessage();
                        B.u0(document, str2, j2, charSequence2, oacVar, k27Var2, threadMessage3, storyItem, chatActivityEnterView.L3, null, z5, i4, i3, false, obj4, mu1Var != null ? mu1Var.Q6() : null, l.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), z6);
                        z = z5;
                        i4 = i4;
                        hq6.d0(chatActivityEnterView.R).c(document, (int) (System.currentTimeMillis() / 1000), true);
                        if (cf3.B(chatActivityEnterView.G3)) {
                            na7.q1(chatActivityEnterView.S.a).w4(obj4, document);
                        }
                    }
                } else {
                    z = z5;
                    TL_stories.StoryItem storyItem2 = t0;
                    if (obj3 instanceof TLRPC.BotInlineResult) {
                        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj3;
                        if (botInlineResult.document != null) {
                            hq6.d0(chatActivityEnterView.R).c(botInlineResult.document, (int) (System.currentTimeMillis() / 1000), false);
                            if (cf3.B(chatActivityEnterView.G3)) {
                                na7.q1(chatActivityEnterView.S.a).w4(obj4, botInlineResult.document);
                            }
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("id", botInlineResult.id);
                        hashMap.put("query_id", String.valueOf(botInlineResult.query_id));
                        hashMap.put("force_gif", "1");
                        if (storyItem2 == null) {
                            mu1 mu1Var2 = chatActivityEnterView.F3;
                            j5 j5Var = chatActivityEnterView.S;
                            long j3 = chatActivityEnterView.G3;
                            k27 k27Var3 = chatActivityEnterView.J3;
                            threadMessage2 = chatActivityEnterView.getThreadMessage();
                            z3a.R(i4, j3, l.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), j5Var, chatActivityEnterView.L3, k27Var3, threadMessage2, mu1Var != null ? mu1Var.Q6() : null, hashMap, botInlineResult, null, mu1Var2, z);
                            i4 = i4;
                            z = z;
                        } else {
                            z3a B2 = z3a.B(chatActivityEnterView.R);
                            TLRPC.Document document2 = botInlineResult.document;
                            long j4 = chatActivityEnterView.G3;
                            k27 k27Var4 = chatActivityEnterView.J3;
                            threadMessage = chatActivityEnterView.getThreadMessage();
                            B2.t0(document2, str2, j4, k27Var4, threadMessage, storyItem2, chatActivityEnterView.L3, null, z, i4, i3, false, obj4, mu1Var != null ? mu1Var.Q6() : null, l.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                        }
                        if (chatActivityEnterView.H2 != 0) {
                            chatActivityEnterView.O1(0, true);
                            chatActivityEnterView.V0.s(true);
                            chatActivityEnterView.V0.z();
                        }
                    }
                }
                hy1 hy1Var2 = chatActivityEnterView.P3;
                if (hy1Var2 != null) {
                    hy1Var2.u(null, z, i4, 0, 0L);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ hv1(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, g27 g27Var, boolean z, int i, int i2, Object obj, Long l, boolean z2) {
        this.r = chatActivityEnterView;
        this.s = document;
        this.n = str;
        this.w = g27Var;
        this.c = z;
        this.d = i;
        this.e = i2;
        this.b = obj;
        this.h = l;
        this.f = z2;
    }
}
