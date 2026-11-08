package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pd implements org.telegram.messenger.c20 {
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

    public /* synthetic */ pd(pf pfVar, Object obj, org.telegram.messenger.gf gfVar, boolean z9, int i7, int i10, boolean z10, String str, Object obj2) {
        this.h = pfVar;
        this.b = obj;
        this.i = gfVar;
        this.c = z9;
        this.d = i7;
        this.e = i10;
        this.f = z10;
        this.g = str;
        this.j = obj2;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        int i7 = this.a;
        Object obj2 = this.i;
        Object obj3 = this.h;
        switch (i7) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i10 = ChatActivityEnterView.s5;
                bd bdVar = new bd(chatActivityEnterView, (TLRPC.Document) obj2, this.g, (org.telegram.messenger.ej) this.j, this.c, this.d, this.e, this.b, (Long) obj, this.f);
                if (!chatActivityEnterView.r1(bdVar)) {
                    bdVar.run();
                    break;
                }
                break;
            default:
                pf pfVar = (pf) obj3;
                bd bdVar2 = new bd(pfVar, this.b, (org.telegram.messenger.gf) obj2, this.c, this.d, this.e, this.f, (Long) obj, this.g, this.j);
                if (!pfVar.a.r1(bdVar2)) {
                    bdVar2.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ pd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.ej ejVar, boolean z9, int i7, int i10, Object obj, boolean z10) {
        this.h = chatActivityEnterView;
        this.i = document;
        this.g = str;
        this.j = ejVar;
        this.c = z9;
        this.d = i7;
        this.e = i10;
        this.b = obj;
        this.f = z10;
    }
}
