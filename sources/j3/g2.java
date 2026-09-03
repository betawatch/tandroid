package j3;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class g2 {
    public static final g2 b = new g2(false);
    public final boolean a;

    public g2(boolean z4) {
        this.a = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && g2.class == obj.getClass() && this.a == ((g2) obj).a;
    }

    public final int hashCode() {
        return !this.a ? 1 : 0;
    }
}
