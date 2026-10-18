package org.telegram.ui;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class cp implements t60 {
    public final /* synthetic */ kp a;

    public cp(kp kpVar) {
        this.a = kpVar;
    }

    @Override // org.telegram.ui.t60
    public final void a(u60 u60Var, long j10) {
        kp kpVar = this.a;
        kpVar.Y(kpVar.getMessagesController().getChat(Long.valueOf(j10)), u60Var);
    }
}
