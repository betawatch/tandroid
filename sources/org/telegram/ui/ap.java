package org.telegram.ui;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
