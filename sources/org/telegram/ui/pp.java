package org.telegram.ui;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class pp implements k70 {
    public final /* synthetic */ xp a;

    public pp(xp xpVar) {
        this.a = xpVar;
    }

    @Override // org.telegram.ui.k70
    public final void a(l70 l70Var, long j3) {
        xp xpVar = this.a;
        xpVar.Y(xpVar.getMessagesController().getChat(Long.valueOf(j3)), l70Var);
    }
}
