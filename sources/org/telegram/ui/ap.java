package org.telegram.ui;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
