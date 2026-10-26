package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hg implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;

    public /* synthetic */ hg(un unVar, int i10) {
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
                    unVar.Oc(true);
                    unVar.j(num.intValue(), 0, false, 0, true, 0);
                    break;
                } else {
                    unVar.x1 = 0;
                    unVar.Oc(true);
                    unVar.getMessagesController().markReactionsAsRead(unVar.f6, unVar.b());
                    break;
                }
            case 1:
                Integer num2 = (Integer) obj;
                un unVar2 = this.b;
                unVar2.getClass();
                if (num2.intValue() != 0) {
                    int i10 = unVar2.y1 - 1;
                    unVar2.y1 = i10;
                    if (i10 <= 0) {
                        unVar2.getMessagesController().markPollVotesAsRead(unVar2.f6, unVar2.b());
                    }
                    unVar2.Nc(true);
                    unVar2.j(num2.intValue(), 0, false, 0, true, 0);
                    break;
                } else {
                    unVar2.y1 = 0;
                    unVar2.Nc(true);
                    unVar2.getMessagesController().markPollVotesAsRead(unVar2.f6, unVar2.b());
                    break;
                }
            default:
                un unVar3 = this.b;
                unVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                unVar3.r7 = booleanValue;
                if (!booleanValue) {
                    unVar3.z8();
                    break;
                }
                break;
        }
    }
}
