package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class cp implements s60 {
    public final /* synthetic */ kp a;

    public cp(kp kpVar) {
        this.a = kpVar;
    }

    @Override // org.telegram.ui.s60
    public final void a(t60 t60Var, long j10) {
        kp kpVar = this.a;
        kpVar.Y(kpVar.getMessagesController().getChat(Long.valueOf(j10)), t60Var);
    }
}
