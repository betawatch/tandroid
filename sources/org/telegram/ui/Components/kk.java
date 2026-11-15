package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class kk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qk b;

    public /* synthetic */ kk(qk qkVar, int i7) {
        this.a = i7;
        this.b = qkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b0();
                break;
            case 1:
                qk qkVar = this.b;
                EditTextBoldCursor editTextBoldCursor = qkVar.T;
                if (!qkVar.L && !qkVar.O0 && !qkVar.b.J && qkVar.M0 && qkVar.U0 == null && editTextBoldCursor.hasFocus() && qkVar.isShown()) {
                    org.telegram.messenger.g0.J3(editTextBoldCursor);
                    break;
                }
                break;
            case 2:
                qk qkVar2 = this.b;
                if (!qkVar2.L && qkVar2.M0 && qkVar2.isShown()) {
                    qkVar2.e0();
                    break;
                }
                break;
            case 3:
                qk qkVar3 = this.b;
                if (!qkVar3.L) {
                    float f10 = qkVar3.n0;
                    if (f10 < 1.0f && qkVar3.m0 == null) {
                        r1.g gVar = new r1.g(new r1.f(f10));
                        qkVar3.m0 = gVar;
                        r1.h hVar = new r1.h(1.0f);
                        hVar.a(0.55f);
                        hVar.b(65.0f);
                        gVar.m = hVar;
                        qkVar3.m0.f(0.001f);
                        qkVar3.m0.b(new c7(qkVar3, 4));
                        qkVar3.m0.a(new pa(qkVar3, 2));
                        qkVar3.m0.h();
                        break;
                    }
                }
                break;
            case 4:
                qk qkVar4 = this.b;
                if (qkVar4.M0 && !qkVar4.L) {
                    qkVar4.d0();
                    if (qkVar4.N0) {
                        qkVar4.e0();
                        break;
                    }
                }
                break;
            default:
                qk qkVar5 = this.b;
                if (!qkVar5.q0) {
                    qkVar5.p0.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
