package org.telegram.ui;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
