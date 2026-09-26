package org.telegram.ui;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
