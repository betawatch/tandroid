package org.telegram.ui;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
