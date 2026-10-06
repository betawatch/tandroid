package org.telegram.ui;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class lp implements j70 {
    public final /* synthetic */ tp a;

    public lp(tp tpVar) {
        this.a = tpVar;
    }

    @Override // org.telegram.ui.j70
    public final void a(k70 k70Var, long j3) {
        tp tpVar = this.a;
        tpVar.X(tpVar.getMessagesController().getChat(Long.valueOf(j3)), k70Var);
    }
}
