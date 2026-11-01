package org.telegram.messenger;

import android.location.Location;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class id implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ od b;

    public /* synthetic */ id(od odVar, int i10) {
        this.a = i10;
        this.b = odVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.m((Location) obj);
                break;
            default:
                od odVar = this.b;
                Integer num = (Integer) obj;
                odVar.getClass();
                int intValue = num.intValue();
                boolean z10 = true;
                if (intValue == 0) {
                    Utilities.d.c(new d20(3, odVar, z10));
                    break;
                } else if (intValue == 1) {
                    Utilities.d.c(new jd(odVar, num, 0));
                    break;
                } else if (intValue == 2) {
                    Utilities.d.c(new fd(odVar, 4));
                    break;
                }
                break;
        }
    }
}
