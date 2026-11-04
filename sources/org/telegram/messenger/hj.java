package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class hj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hp b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ hj(hp hpVar, ArrayList arrayList, int i3) {
        this.a = i3;
        this.b = hpVar;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.getNotificationsController().K(this.c, true, false, null);
                break;
            case 1:
                g0.h3(new hj(this.b, this.c, 3));
                break;
            case 2:
                g0.h3(new hj(this.b, this.c, 4));
                break;
            case 3:
                this.b.getNotificationsController().K(this.c, true, false, null);
                break;
            case 4:
                this.b.getNotificationsController().K(this.c, true, false, null);
                break;
            case 5:
                hp hpVar = this.b;
                hpVar.getClass();
                int i3 = 0;
                while (true) {
                    ArrayList arrayList = this.c;
                    if (i3 >= arrayList.size()) {
                        break;
                    } else {
                        hpVar.b4(hpVar.j1(-((Long) arrayList.get(i3)).longValue()), 0L);
                        i3++;
                    }
                }
            case 6:
                this.b.getNotificationsController().K(this.c, true, false, null);
                break;
            default:
                g0.h3(new hj(this.b, this.c, 0));
                break;
        }
    }
}
