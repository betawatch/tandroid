package org.telegram.ui;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class op implements m70 {
    public final /* synthetic */ wp a;

    public op(wp wpVar) {
        this.a = wpVar;
    }

    @Override // org.telegram.ui.m70
    public final void a(n70 n70Var, long j3) {
        wp wpVar = this.a;
        wpVar.Y(wpVar.getMessagesController().getChat(Long.valueOf(j3)), n70Var);
    }
}
