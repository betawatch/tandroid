// default package

import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class dge extends the {
    public final boolean a;

    public dge(boolean z) {
        this.a = z;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        the theVar = (the) obj;
        int zza = theVar.zza();
        int c = the.c((byte) -32);
        if (c != zza) {
            return c - theVar.zza();
        }
        return (true != this.a ? 20 : 21) - (true != ((dge) theVar).a ? 20 : 21);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && dge.class == obj.getClass() && this.a == ((dge) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(the.c((byte) -32)), Boolean.valueOf(this.a)});
    }

    public final String toString() {
        return Boolean.toString(this.a);
    }

    @Override // the
    public final int zza() {
        return the.c((byte) -32);
    }
}
