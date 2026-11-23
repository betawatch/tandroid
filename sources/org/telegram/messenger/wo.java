package org.telegram.messenger;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class wo {
    public final int a;
    public final int b;

    public wo(int i7, int i10) {
        this.a = i7;
        this.b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wo)) {
            return false;
        }
        wo woVar = (wo) obj;
        return this.a == woVar.a && this.b == woVar.b;
    }
}
