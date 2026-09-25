package org.telegram.ui;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class jp implements f70 {
    public final /* synthetic */ rp a;

    public jp(rp rpVar) {
        this.a = rpVar;
    }

    @Override // org.telegram.ui.f70
    public final void a(g70 g70Var, long j3) {
        rp rpVar = this.a;
        rpVar.Y(rpVar.getMessagesController().getChat(Long.valueOf(j3)), g70Var);
    }
}
