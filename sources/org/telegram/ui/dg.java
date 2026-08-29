package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dg implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ tn b;

    public /* synthetic */ dg(tn tnVar, int i10) {
        this.a = i10;
        this.b = tnVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                tn tnVar = this.b;
                tnVar.getClass();
                if (num.intValue() != 0) {
                    tnVar.Bc(true);
                    tnVar.j(num.intValue(), 0, false, 0, true, 0);
                    break;
                } else {
                    tnVar.h1 = 0;
                    tnVar.Bc(true);
                    tnVar.getMessagesController().markReactionsAsRead(tnVar.P5, tnVar.b());
                    break;
                }
            case 1:
                Integer num2 = (Integer) obj;
                tn tnVar2 = this.b;
                tnVar2.getClass();
                if (num2.intValue() != 0) {
                    int i10 = tnVar2.i1 - 1;
                    tnVar2.i1 = i10;
                    if (i10 <= 0) {
                        tnVar2.getMessagesController().markPollVotesAsRead(tnVar2.P5, tnVar2.b());
                    }
                    tnVar2.Ac(true);
                    tnVar2.j(num2.intValue(), 0, false, 0, true, 0);
                    break;
                } else {
                    tnVar2.i1 = 0;
                    tnVar2.Ac(true);
                    tnVar2.getMessagesController().markPollVotesAsRead(tnVar2.P5, tnVar2.b());
                    break;
                }
            default:
                tn tnVar3 = this.b;
                tnVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                tnVar3.b7 = booleanValue;
                if (!booleanValue) {
                    tnVar3.r8();
                    break;
                }
                break;
        }
    }
}
