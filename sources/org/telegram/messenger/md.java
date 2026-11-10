package org.telegram.messenger;

import android.location.Location;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class md implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ sd b;

    public /* synthetic */ md(sd sdVar, int i7) {
        this.a = i7;
        this.b = sdVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.m((Location) obj);
                break;
            default:
                sd sdVar = this.b;
                Integer num = (Integer) obj;
                sdVar.getClass();
                int intValue = num.intValue();
                boolean z9 = true;
                if (intValue == 0) {
                    Utilities.d.c(new o10(3, sdVar, z9));
                    break;
                } else if (intValue == 1) {
                    Utilities.d.c(new nd(sdVar, num, 0));
                    break;
                } else if (intValue == 2) {
                    Utilities.d.c(new jd(sdVar, 4));
                    break;
                }
                break;
        }
    }
}
