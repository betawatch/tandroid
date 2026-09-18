package org.telegram.ui;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class mp implements k70 {
    public final /* synthetic */ up a;

    public mp(up upVar) {
        this.a = upVar;
    }

    @Override // org.telegram.ui.k70
    public final void a(l70 l70Var, long j3) {
        up upVar = this.a;
        upVar.Y(upVar.getMessagesController().getChat(Long.valueOf(j3)), l70Var);
    }
}
