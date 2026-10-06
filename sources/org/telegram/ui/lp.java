package org.telegram.ui;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
