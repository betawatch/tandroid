package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class oj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ oj(np npVar, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = npVar;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.getNotificationsController().K(this.c, true, false, null);
                break;
            case 1:
                g0.h3(new oj(this.b, this.c, 3));
                break;
            case 2:
                g0.h3(new oj(this.b, this.c, 4));
                break;
            case 3:
                this.b.getNotificationsController().K(this.c, true, false, null);
                break;
            case 4:
                this.b.getNotificationsController().K(this.c, true, false, null);
                break;
            case 5:
                np npVar = this.b;
                npVar.getClass();
                int i7 = 0;
                while (true) {
                    ArrayList arrayList = this.c;
                    if (i7 >= arrayList.size()) {
                        break;
                    } else {
                        npVar.b4(npVar.j1(-((Long) arrayList.get(i7)).longValue()), 0L);
                        i7++;
                    }
                }
            case 6:
                this.b.getNotificationsController().K(this.c, true, false, null);
                break;
            default:
                g0.h3(new oj(this.b, this.c, 0));
                break;
        }
    }
}
