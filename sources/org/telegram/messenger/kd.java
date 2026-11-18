package org.telegram.messenger;

import android.location.Location;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
