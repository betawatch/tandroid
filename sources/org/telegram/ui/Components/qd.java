package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class qd implements org.telegram.messenger.z10 {
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

    public /* synthetic */ qd(wf wfVar, Object obj, org.telegram.messenger.ff ffVar, boolean z10, int i7, int i10, boolean z11, String str, Object obj2) {
        this.h = wfVar;
        this.b = obj;
        this.i = ffVar;
        this.c = z10;
        this.d = i7;
        this.e = i10;
        this.f = z11;
        this.g = str;
        this.j = obj2;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        int i7 = this.a;
        Object obj2 = this.i;
        Object obj3 = this.h;
        switch (i7) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i10 = ChatActivityEnterView.N6;
                ad adVar = new ad(chatActivityEnterView, (TLRPC.Document) obj2, this.g, (org.telegram.messenger.cj) this.j, this.c, this.d, this.e, this.b, (Long) obj, this.f);
                if (!chatActivityEnterView.J1(adVar)) {
                    adVar.run();
                    break;
                }
                break;
            default:
                wf wfVar = (wf) obj3;
                ad adVar2 = new ad(wfVar, this.b, (org.telegram.messenger.ff) obj2, this.c, this.d, this.e, this.f, (Long) obj, this.g, this.j);
                if (!wfVar.a.J1(adVar2)) {
                    adVar2.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ qd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.cj cjVar, boolean z10, int i7, int i10, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.i = document;
        this.g = str;
        this.j = cjVar;
        this.c = z10;
        this.d = i7;
        this.e = i10;
        this.b = obj;
        this.f = z11;
    }
}
