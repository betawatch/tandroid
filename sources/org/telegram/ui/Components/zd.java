package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class zd implements org.telegram.messenger.w10 {
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

    public /* synthetic */ zd(hg hgVar, Object obj, org.telegram.messenger.ef efVar, boolean z10, int i7, int i10, boolean z11, String str, Object obj2) {
        this.h = hgVar;
        this.b = obj;
        this.i = efVar;
        this.c = z10;
        this.d = i7;
        this.e = i10;
        this.f = z11;
        this.g = str;
        this.j = obj2;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        int i7 = this.a;
        Object obj2 = this.i;
        Object obj3 = this.h;
        switch (i7) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i10 = ChatActivityEnterView.s7;
                jd jdVar = new jd(chatActivityEnterView, (TLRPC.Document) obj2, this.g, (org.telegram.messenger.bj) this.j, this.c, this.d, this.e, this.b, (Long) obj, this.f);
                if (!chatActivityEnterView.X1(jdVar)) {
                    jdVar.run();
                    break;
                }
                break;
            default:
                hg hgVar = (hg) obj3;
                jd jdVar2 = new jd(hgVar, this.b, (org.telegram.messenger.ef) obj2, this.c, this.d, this.e, this.f, (Long) obj, this.g, this.j);
                if (!hgVar.a.X1(jdVar2)) {
                    jdVar2.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ zd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.bj bjVar, boolean z10, int i7, int i10, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.i = document;
        this.g = str;
        this.j = bjVar;
        this.c = z10;
        this.d = i7;
        this.e = i10;
        this.b = obj;
        this.f = z11;
    }
}
