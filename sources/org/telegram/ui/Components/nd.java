package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nd implements org.telegram.messenger.u10 {
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

    public /* synthetic */ nd(nf nfVar, Object obj, org.telegram.messenger.ye yeVar, boolean z10, int i3, int i10, boolean z11, String str, Object obj2) {
        this.h = nfVar;
        this.b = obj;
        this.i = yeVar;
        this.c = z10;
        this.d = i3;
        this.e = i10;
        this.f = z11;
        this.g = str;
        this.j = obj2;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        int i3 = this.a;
        Object obj2 = this.i;
        Object obj3 = this.h;
        switch (i3) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i10 = ChatActivityEnterView.t5;
                zc zcVar = new zc(chatActivityEnterView, (TLRPC.Document) obj2, this.g, (org.telegram.messenger.vi) this.j, this.c, this.d, this.e, this.b, (Long) obj, this.f);
                if (!chatActivityEnterView.q1(zcVar)) {
                    zcVar.run();
                    break;
                }
                break;
            default:
                nf nfVar = (nf) obj3;
                zc zcVar2 = new zc(nfVar, this.b, (org.telegram.messenger.ye) obj2, this.c, this.d, this.e, this.f, (Long) obj, this.g, this.j);
                if (!nfVar.a.q1(zcVar2)) {
                    zcVar2.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ nd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.vi viVar, boolean z10, int i3, int i10, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.i = document;
        this.g = str;
        this.j = viVar;
        this.c = z10;
        this.d = i3;
        this.e = i10;
        this.b = obj;
        this.f = z11;
    }
}
