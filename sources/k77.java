// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class k77 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uc7 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ k77(uc7 uc7Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = uc7Var;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.c;
        uc7 uc7Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new k77(uc7Var, arrayList, (byte) 2));
                return;
            case 1:
                hl.c3(new k77(uc7Var, arrayList, (byte) 3));
                return;
            case 2:
                uc7Var.getNotificationsController().K(arrayList, true, false, null);
                return;
            case 3:
                uc7Var.getNotificationsController().K(arrayList, true, false, null);
                return;
            case 4:
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    uc7Var.getNotificationCenter().k(80, arrayList.get(i));
                }
                return;
            case 5:
                break;
            case 6:
                uc7Var.getNotificationsController().K(arrayList, true, false, null);
                return;
            case 7:
                hl.c3(new k77(uc7Var, arrayList, (byte) 8));
                return;
            default:
                uc7Var.getNotificationsController().K(arrayList, true, false, null);
                return;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            uc7Var.n4(uc7Var.j1(-((Long) arrayList.get(i2)).longValue()), 0L);
        }
    }
}
