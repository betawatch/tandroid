// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class at extends ja {
    public final String c;
    public final byte d;

    /* JADX WARN: Multi-variable type inference failed */
    public at(int i, int i2, String str) {
        super(i, false);
        this.d = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || at.class != obj.getClass()) {
            return false;
        }
        at atVar = (at) obj;
        return this.d == atVar.d && this.c.equals(atVar.c);
    }
}
