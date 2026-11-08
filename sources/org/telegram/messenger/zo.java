package org.telegram.messenger;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class zo {
    public final int a;
    public final int b;

    public zo(int i7, int i10) {
        this.a = i7;
        this.b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zo)) {
            return false;
        }
        zo zoVar = (zo) obj;
        return this.a == zoVar.a && this.b == zoVar.b;
    }
}
