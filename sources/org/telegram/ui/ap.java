package org.telegram.ui;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class ap implements r60 {
    public final /* synthetic */ ip a;

    public ap(ip ipVar) {
        this.a = ipVar;
    }

    @Override // org.telegram.ui.r60
    public final void a(s60 s60Var, long j10) {
        ip ipVar = this.a;
        ipVar.Y(ipVar.getMessagesController().getChat(Long.valueOf(j10)), s60Var);
    }
}
