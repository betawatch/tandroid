package org.telegram.ui;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class op implements k70 {
    public final /* synthetic */ wp a;

    public op(wp wpVar) {
        this.a = wpVar;
    }

    @Override // org.telegram.ui.k70
    public final void a(l70 l70Var, long j3) {
        wp wpVar = this.a;
        wpVar.Y(wpVar.getMessagesController().getChat(Long.valueOf(j3)), l70Var);
    }
}
