package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class jd implements org.telegram.messenger.q20 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ String g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ jd(lf lfVar, Object obj, org.telegram.messenger.ef efVar, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = lfVar;
        this.b = obj;
        this.i = efVar;
        this.c = z10;
        this.d = i10;
        this.e = i11;
        this.f = z11;
        this.g = str;
        this.j = obj2;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        int i10 = this.a;
        Object obj2 = this.i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.s5;
                uc ucVar = new uc(chatActivityEnterView, (TLRPC.Document) obj2, this.g, (org.telegram.messenger.fj) this.j, this.c, this.d, this.e, this.b, (Long) obj, this.f);
                if (!chatActivityEnterView.p1(ucVar)) {
                    ucVar.run();
                    break;
                }
                break;
            default:
                lf lfVar = (lf) obj3;
                uc ucVar2 = new uc(lfVar, this.b, (org.telegram.messenger.ef) obj2, this.c, this.d, this.e, this.f, (Long) obj, this.g, this.j);
                if (!lfVar.a.p1(ucVar2)) {
                    ucVar2.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ jd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.fj fjVar, boolean z10, int i10, int i11, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.i = document;
        this.g = str;
        this.j = fjVar;
        this.c = z10;
        this.d = i10;
        this.e = i11;
        this.b = obj;
        this.f = z11;
    }
}
