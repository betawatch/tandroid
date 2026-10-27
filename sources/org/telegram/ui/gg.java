package org.telegram.ui;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gg implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;

    public /* synthetic */ gg(wn wnVar, int i10) {
        this.a = i10;
        this.b = wnVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                wn wnVar = this.b;
                wnVar.getClass();
                if (num.intValue() != 0) {
                    wnVar.Sc(true);
                    wnVar.j(num.intValue(), 0, false, 0, true, 0);
                    break;
                } else {
                    wnVar.x1 = 0;
                    wnVar.Sc(true);
                    wnVar.getMessagesController().markReactionsAsRead(wnVar.j6, wnVar.b());
                    break;
                }
            case 1:
                Integer num2 = (Integer) obj;
                wn wnVar2 = this.b;
                wnVar2.getClass();
                if (num2.intValue() != 0) {
                    int i10 = wnVar2.y1 - 1;
                    wnVar2.y1 = i10;
                    if (i10 <= 0) {
                        wnVar2.getMessagesController().markPollVotesAsRead(wnVar2.j6, wnVar2.b());
                    }
                    wnVar2.Rc(true);
                    wnVar2.j(num2.intValue(), 0, false, 0, true, 0);
                    break;
                } else {
                    wnVar2.y1 = 0;
                    wnVar2.Rc(true);
                    wnVar2.getMessagesController().markPollVotesAsRead(wnVar2.j6, wnVar2.b());
                    break;
                }
            default:
                wn wnVar3 = this.b;
                wnVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                wnVar3.v7 = booleanValue;
                if (!booleanValue) {
                    wnVar3.C8();
                    break;
                }
                break;
        }
    }
}
