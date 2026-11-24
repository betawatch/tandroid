// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class h77 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oc7 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ h77(oc7 oc7Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = oc7Var;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.c;
        oc7 oc7Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new h77(oc7Var, arrayList, (byte) 2));
                return;
            case 1:
                gm.c3(new h77(oc7Var, arrayList, (byte) 3));
                return;
            case 2:
                oc7Var.getNotificationsController().K(arrayList, true, false, null);
                return;
            case 3:
                oc7Var.getNotificationsController().K(arrayList, true, false, null);
                return;
            case 4:
                break;
            case 5:
                oc7Var.getNotificationsController().K(arrayList, true, false, null);
                return;
            case 6:
                gm.c3(new h77(oc7Var, arrayList, (byte) 7));
                return;
            default:
                oc7Var.getNotificationsController().K(arrayList, true, false, null);
                return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            oc7Var.h4(oc7Var.i1(-((Long) arrayList.get(i)).longValue()), 0L);
        }
    }
}
