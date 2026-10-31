package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class hp implements b60 {
    public final /* synthetic */ qp a;

    public hp(qp qpVar) {
        this.a = qpVar;
    }

    @Override // org.telegram.ui.b60
    public final void f(c60 c60Var, long j10) {
        qp qpVar = this.a;
        qpVar.c0(qpVar.getMessagesController().L0(Long.valueOf(j10)), c60Var);
    }
}
