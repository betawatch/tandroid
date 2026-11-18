package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class yd implements org.telegram.messenger.x10 {
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

    public /* synthetic */ yd(fg fgVar, Object obj, org.telegram.messenger.ef efVar, boolean z10, int i7, int i10, boolean z11, String str, Object obj2) {
        this.h = fgVar;
        this.b = obj;
        this.i = efVar;
        this.c = z10;
        this.d = i7;
        this.e = i10;
        this.f = z11;
        this.g = str;
        this.j = obj2;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        int i7 = this.a;
        Object obj2 = this.i;
        Object obj3 = this.h;
        switch (i7) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i10 = ChatActivityEnterView.n7;
                jd jdVar = new jd(chatActivityEnterView, (TLRPC.Document) obj2, this.g, (org.telegram.messenger.bj) this.j, this.c, this.d, this.e, this.b, (Long) obj, this.f);
                if (!chatActivityEnterView.R1(jdVar)) {
                    jdVar.run();
                    break;
                }
                break;
            default:
                fg fgVar = (fg) obj3;
                jd jdVar2 = new jd(fgVar, this.b, (org.telegram.messenger.ef) obj2, this.c, this.d, this.e, this.f, (Long) obj, this.g, this.j);
                if (!fgVar.a.R1(jdVar2)) {
                    jdVar2.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ yd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.bj bjVar, boolean z10, int i7, int i10, Object obj, boolean z11) {
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
