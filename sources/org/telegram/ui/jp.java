package org.telegram.ui;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
