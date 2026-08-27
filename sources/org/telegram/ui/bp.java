package org.telegram.ui;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class bp implements t60 {
    public final /* synthetic */ jp a;

    public bp(jp jpVar) {
        this.a = jpVar;
    }

    @Override // org.telegram.ui.t60
    public final void a(u60 u60Var, long j10) {
        jp jpVar = this.a;
        jpVar.Y(jpVar.getMessagesController().getChat(Long.valueOf(j10)), u60Var);
    }
}
