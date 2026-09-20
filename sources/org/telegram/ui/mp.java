package org.telegram.ui;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
