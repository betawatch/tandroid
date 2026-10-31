package org.telegram.messenger;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class ep {
    public final int a;
    public final int b;

    public ep(int i10, int i11) {
        this.a = i10;
        this.b = i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ep)) {
            return false;
        }
        ep epVar = (ep) obj;
        return this.a == epVar.a && this.b == epVar.b;
    }
}
