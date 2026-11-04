package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pf implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm b;

    public /* synthetic */ pf(wm wmVar, int i3) {
        this.a = i3;
        this.b = wmVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                wm wmVar = this.b;
                wmVar.getClass();
                if (num.intValue() != 0) {
                    wmVar.fd(true);
                    wmVar.l(num.intValue(), 0, false, 0, true, 0);
                    break;
                } else {
                    wmVar.A1 = 0;
                    wmVar.fd(true);
                    wmVar.getMessagesController().t3(wmVar.k6, wmVar.b());
                    break;
                }
            case 1:
                Integer num2 = (Integer) obj;
                wm wmVar2 = this.b;
                wmVar2.getClass();
                if (num2.intValue() != 0) {
                    int i3 = wmVar2.B1 - 1;
                    wmVar2.B1 = i3;
                    if (i3 <= 0) {
                        wmVar2.getMessagesController().s3(wmVar2.k6, wmVar2.b());
                    }
                    wmVar2.ed(true);
                    wmVar2.l(num2.intValue(), 0, false, 0, true, 0);
                    break;
                } else {
                    wmVar2.B1 = 0;
                    wmVar2.ed(true);
                    wmVar2.getMessagesController().s3(wmVar2.k6, wmVar2.b());
                    break;
                }
            default:
                wm wmVar3 = this.b;
                wmVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                wmVar3.w7 = booleanValue;
                if (!booleanValue) {
                    wmVar3.J8();
                    break;
                }
                break;
        }
    }
}
