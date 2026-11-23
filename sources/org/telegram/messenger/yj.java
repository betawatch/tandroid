package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class yj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ yj(np npVar, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = npVar;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g0.g3(new yj(this.b, this.c, 2));
                break;
            case 1:
                this.b.getNotificationsController().K(this.c, true, false, null);
                break;
            case 2:
                this.b.getNotificationsController().K(this.c, true, false, null);
                break;
            case 3:
                g0.g3(new yj(this.b, this.c, 5));
                break;
            case 4:
                np npVar = this.b;
                npVar.getClass();
                int i7 = 0;
                while (true) {
                    ArrayList arrayList = this.c;
                    if (i7 >= arrayList.size()) {
                        break;
                    } else {
                        npVar.j4(npVar.l1(-((Long) arrayList.get(i7)).longValue()), 0L);
                        i7++;
                    }
                }
            case 5:
                this.b.getNotificationsController().K(this.c, true, false, null);
                break;
            case 6:
                this.b.getNotificationsController().K(this.c, true, false, null);
                break;
            default:
                g0.g3(new yj(this.b, this.c, 1));
                break;
        }
    }
}
