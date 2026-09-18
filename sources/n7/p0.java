package n7;

import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class p0 implements Comparator {
    public static final p0 a;
    public static final /* synthetic */ p0[] b;

    static {
        p0 p0Var = new p0("INSTANCE", 0);
        a = p0Var;
        b = new p0[]{p0Var};
    }

    public static p0[] values() {
        return (p0[]) b.clone();
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int min = Math.min(bArr.length, bArr2.length);
        for (int i10 = 0; i10 < min; i10++) {
            int i11 = (bArr[i10] & 255) - (bArr2[i10] & 255);
            if (i11 != 0) {
                return i11;
            }
        }
        return bArr.length - bArr2.length;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
    }
}
