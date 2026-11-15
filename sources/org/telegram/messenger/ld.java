package org.telegram.messenger;

import android.location.Location;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class ld implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ rd b;

    public /* synthetic */ ld(rd rdVar, int i7) {
        this.a = i7;
        this.b = rdVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.m((Location) obj);
                break;
            default:
                rd rdVar = this.b;
                Integer num = (Integer) obj;
                rdVar.getClass();
                int intValue = num.intValue();
                boolean z10 = true;
                if (intValue == 0) {
                    Utilities.d.c(new l10(3, rdVar, z10));
                    break;
                } else if (intValue == 1) {
                    Utilities.d.c(new md(rdVar, num, 0));
                    break;
                } else if (intValue == 2) {
                    Utilities.d.c(new id(rdVar, 4));
                    break;
                }
                break;
        }
    }
}
