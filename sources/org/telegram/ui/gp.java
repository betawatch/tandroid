package org.telegram.ui;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class gp implements y60 {
    public final /* synthetic */ pp a;

    public gp(pp ppVar) {
        this.a = ppVar;
    }

    @Override // org.telegram.ui.y60
    public final void a(z60 z60Var, long j10) {
        pp ppVar = this.a;
        ppVar.Z(ppVar.getMessagesController().getChat(Long.valueOf(j10)), z60Var);
    }
}
