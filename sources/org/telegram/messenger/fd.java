package org.telegram.messenger;

import android.location.Location;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class fd implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ ld b;

    public /* synthetic */ fd(ld ldVar, int i3) {
        this.a = i3;
        this.b = ldVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.m((Location) obj);
                break;
            default:
                ld ldVar = this.b;
                Integer num = (Integer) obj;
                ldVar.getClass();
                int intValue = num.intValue();
                boolean z10 = true;
                if (intValue == 0) {
                    Utilities.d.c(new g10(3, ldVar, z10));
                    break;
                } else if (intValue == 1) {
                    Utilities.d.c(new gd(ldVar, num, 0));
                    break;
                } else if (intValue == 2) {
                    Utilities.d.c(new cd(ldVar, 4));
                    break;
                }
                break;
        }
    }
}
