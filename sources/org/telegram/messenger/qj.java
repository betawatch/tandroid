package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class qj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qp b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ qj(qp qpVar, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = qpVar;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.getNotificationsController().K(this.c, true, false, null);
                break;
            case 1:
                g0.h3(new qj(this.b, this.c, 3));
                break;
            case 2:
                g0.h3(new qj(this.b, this.c, 4));
                break;
            case 3:
                this.b.getNotificationsController().K(this.c, true, false, null);
                break;
            case 4:
                this.b.getNotificationsController().K(this.c, true, false, null);
                break;
            case 5:
                qp qpVar = this.b;
                qpVar.getClass();
                int i7 = 0;
                while (true) {
                    ArrayList arrayList = this.c;
                    if (i7 >= arrayList.size()) {
                        break;
                    } else {
                        qpVar.b4(qpVar.j1(-((Long) arrayList.get(i7)).longValue()), 0L);
                        i7++;
                    }
                }
            case 6:
                this.b.getNotificationsController().K(this.c, true, false, null);
                break;
            default:
                g0.h3(new qj(this.b, this.c, 0));
                break;
        }
    }
}
