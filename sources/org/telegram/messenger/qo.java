package org.telegram.messenger;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class qo {
    public final int a;
    public final int b;

    public qo(int i3, int i10) {
        this.a = i3;
        this.b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qo)) {
            return false;
        }
        qo qoVar = (qo) obj;
        return this.a == qoVar.a && this.b == qoVar.b;
    }
}
