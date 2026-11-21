package org.telegram.messenger;

import android.location.Location;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class kd implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ qd b;

    public /* synthetic */ kd(qd qdVar, int i7) {
        this.a = i7;
        this.b = qdVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.m((Location) obj);
                break;
            default:
                qd qdVar = this.b;
                Integer num = (Integer) obj;
                qdVar.getClass();
                int intValue = num.intValue();
                boolean z10 = true;
                if (intValue == 0) {
                    Utilities.d.c(new i10(3, qdVar, z10));
                    break;
                } else if (intValue == 1) {
                    Utilities.d.c(new ld(qdVar, num, 0));
                    break;
                } else if (intValue == 2) {
                    Utilities.d.c(new hd(qdVar, 4));
                    break;
                }
                break;
        }
    }
}
