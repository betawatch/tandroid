package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class jp implements f70 {
    public final /* synthetic */ sp a;

    public jp(sp spVar) {
        this.a = spVar;
    }

    @Override // org.telegram.ui.f70
    public final void a(g70 g70Var, long j10) {
        sp spVar = this.a;
        spVar.Y(spVar.getMessagesController().getChat(Long.valueOf(j10)), g70Var);
    }
}
