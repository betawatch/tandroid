package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class hk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wp b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ hk(wp wpVar, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = wpVar;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.getNotificationsController().K(this.c, true, false, null);
                break;
            case 1:
                i0.g3(new hk(this.b, this.c, 3));
                break;
            case 2:
                i0.g3(new hk(this.b, this.c, 5));
                break;
            case 3:
                this.b.getNotificationsController().K(this.c, true, false, null);
                break;
            case 4:
                wp wpVar = this.b;
                wpVar.getClass();
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.c;
                    if (i10 >= arrayList.size()) {
                        break;
                    } else {
                        wpVar.Y3(wpVar.i1(-((Long) arrayList.get(i10)).longValue()), 0L);
                        i10++;
                    }
                }
            case 5:
                this.b.getNotificationsController().K(this.c, true, false, null);
                break;
            case 6:
                this.b.getNotificationsController().K(this.c, true, false, null);
                break;
            default:
                i0.g3(new hk(this.b, this.c, 0));
                break;
        }
    }
}
