package org.telegram.messenger;

import android.location.Location;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class hd implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ nd b;

    public /* synthetic */ hd(nd ndVar, int i10) {
        this.a = i10;
        this.b = ndVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.m((Location) obj);
                break;
            default:
                nd ndVar = this.b;
                Integer num = (Integer) obj;
                ndVar.getClass();
                int intValue = num.intValue();
                boolean z10 = true;
                if (intValue == 0) {
                    Utilities.d.c(new c20(3, ndVar, z10));
                    break;
                } else if (intValue == 1) {
                    Utilities.d.c(new id(ndVar, num, 0));
                    break;
                } else if (intValue == 2) {
                    Utilities.d.c(new ed(ndVar, 4));
                    break;
                }
                break;
        }
    }
}
