package org.telegram.ui;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
