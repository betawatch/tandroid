package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class xj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mp b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ xj(mp mpVar, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = mpVar;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g0.g3(new xj(this.b, this.c, 2));
                break;
            case 1:
                this.b.getNotificationsController().K(this.c, true, false, null);
                break;
            case 2:
                this.b.getNotificationsController().K(this.c, true, false, null);
                break;
            case 3:
                g0.g3(new xj(this.b, this.c, 5));
                break;
            case 4:
                mp mpVar = this.b;
                mpVar.getClass();
                int i7 = 0;
                while (true) {
                    ArrayList arrayList = this.c;
                    if (i7 >= arrayList.size()) {
                        break;
                    } else {
                        mpVar.j4(mpVar.l1(-((Long) arrayList.get(i7)).longValue()), 0L);
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
                g0.g3(new xj(this.b, this.c, 1));
                break;
        }
    }
}
