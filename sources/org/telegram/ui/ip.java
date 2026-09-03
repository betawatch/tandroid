package org.telegram.ui;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
