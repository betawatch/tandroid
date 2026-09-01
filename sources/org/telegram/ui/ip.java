package org.telegram.ui;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ip implements e70 {
    public final /* synthetic */ rp a;

    public ip(rp rpVar) {
        this.a = rpVar;
    }

    @Override // org.telegram.ui.e70
    public final void a(f70 f70Var, long j10) {
        rp rpVar = this.a;
        rpVar.Y(rpVar.getMessagesController().getChat(Long.valueOf(j10)), f70Var);
    }
}
