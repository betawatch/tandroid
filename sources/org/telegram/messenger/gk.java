package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class gk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vp b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ gk(vp vpVar, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = vpVar;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.getNotificationsController().K(this.c, true, false, null);
                break;
            case 1:
                i0.g3(new gk(this.b, this.c, 3));
                break;
            case 2:
                i0.g3(new gk(this.b, this.c, 5));
                break;
            case 3:
                this.b.getNotificationsController().K(this.c, true, false, null);
                break;
            case 4:
                vp vpVar = this.b;
                vpVar.getClass();
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.c;
                    if (i10 >= arrayList.size()) {
                        break;
                    } else {
                        vpVar.Y3(vpVar.i1(-((Long) arrayList.get(i10)).longValue()), 0L);
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
                i0.g3(new gk(this.b, this.c, 0));
                break;
        }
    }
}
