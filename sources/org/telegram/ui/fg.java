package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class fg implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;

    public /* synthetic */ fg(un unVar, int i10) {
        this.a = i10;
        this.b = unVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                un unVar = this.b;
                unVar.getClass();
                if (num.intValue() != 0) {
                    unVar.Vc(true);
                    unVar.k(num.intValue(), 0, false, 0, true, 0);
                    break;
                } else {
                    unVar.z1 = 0;
                    unVar.Vc(true);
                    unVar.getMessagesController().q3(unVar.j6, unVar.b());
                    break;
                }
            case 1:
                Integer num2 = (Integer) obj;
                un unVar2 = this.b;
                unVar2.getClass();
                if (num2.intValue() != 0) {
                    int i10 = unVar2.A1 - 1;
                    unVar2.A1 = i10;
                    if (i10 <= 0) {
                        unVar2.getMessagesController().p3(unVar2.j6, unVar2.b());
                    }
                    unVar2.Uc(true);
                    unVar2.k(num2.intValue(), 0, false, 0, true, 0);
                    break;
                } else {
                    unVar2.A1 = 0;
                    unVar2.Uc(true);
                    unVar2.getMessagesController().p3(unVar2.j6, unVar2.b());
                    break;
                }
            default:
                un unVar3 = this.b;
                unVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                unVar3.v7 = booleanValue;
                if (!booleanValue) {
                    unVar3.C8();
                    break;
                }
                break;
        }
    }
}
