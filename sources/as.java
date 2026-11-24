// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class as extends ja {
    public final String c;
    public final byte d;

    /* JADX WARN: Multi-variable type inference failed */
    public as(int i, int i2, String str) {
        super(i, false);
        this.d = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || as.class != obj.getClass()) {
            return false;
        }
        as asVar = (as) obj;
        return this.d == asVar.d && this.c.equals(asVar.c);
    }
}
