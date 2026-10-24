package org.telegram.ui;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class cp implements v60 {
    public final /* synthetic */ kp a;

    public cp(kp kpVar) {
        this.a = kpVar;
    }

    @Override // org.telegram.ui.v60
    public final void a(w60 w60Var, long j10) {
        kp kpVar = this.a;
        kpVar.Y(kpVar.getMessagesController().getChat(Long.valueOf(j10)), w60Var);
    }
}
