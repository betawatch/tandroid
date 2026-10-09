package org.telegram.ui;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class mp implements i70 {
    public final /* synthetic */ up a;

    public mp(up upVar) {
        this.a = upVar;
    }

    @Override // org.telegram.ui.i70
    public final void a(j70 j70Var, long j3) {
        up upVar = this.a;
        upVar.Y(upVar.getMessagesController().getChat(Long.valueOf(j3)), j70Var);
    }
}
