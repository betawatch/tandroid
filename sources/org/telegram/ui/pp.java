package org.telegram.ui;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
