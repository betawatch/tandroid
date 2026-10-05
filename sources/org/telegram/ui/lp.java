package org.telegram.ui;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
