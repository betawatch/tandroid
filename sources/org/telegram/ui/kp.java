package org.telegram.ui;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class kp implements h70 {
    public final /* synthetic */ sp a;

    public kp(sp spVar) {
        this.a = spVar;
    }

    @Override // org.telegram.ui.h70
    public final void a(i70 i70Var, long j3) {
        sp spVar = this.a;
        spVar.Y(spVar.getMessagesController().getChat(Long.valueOf(j3)), i70Var);
    }
}
