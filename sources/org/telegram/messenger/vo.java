package org.telegram.messenger;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class vo {
    public final int a;
    public final int b;

    public vo(int i7, int i10) {
        this.a = i7;
        this.b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vo)) {
            return false;
        }
        vo voVar = (vo) obj;
        return this.a == voVar.a && this.b == voVar.b;
    }
}
