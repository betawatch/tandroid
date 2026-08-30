package org.telegram.ui;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ip implements d70 {
    public final /* synthetic */ qp a;

    public ip(qp qpVar) {
        this.a = qpVar;
    }

    @Override // org.telegram.ui.d70
    public final void a(e70 e70Var, long j10) {
        qp qpVar = this.a;
        qpVar.Y(qpVar.getMessagesController().getChat(Long.valueOf(j10)), e70Var);
    }
}
