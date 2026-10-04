package org.telegram.ui;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class lp implements j70 {
    public final /* synthetic */ tp a;

    public lp(tp tpVar) {
        this.a = tpVar;
    }

    @Override // org.telegram.ui.j70
    public final void a(k70 k70Var, long j3) {
        tp tpVar = this.a;
        tpVar.X(tpVar.getMessagesController().getChat(Long.valueOf(j3)), k70Var);
    }
}
