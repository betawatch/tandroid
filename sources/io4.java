// default package

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class io4 {
    public static final int[][] c = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};
    public final g54 a;
    public final byte b;

    public io4(int i) {
        int i2 = (i >> 3) & 3;
        if (i2 < 0 || i2 >= 4) {
            i98.g();
            throw null;
        }
        this.a = g54.e[i2];
        this.b = (byte) (i & 7);
    }

    public static io4 a(int i, int i2) {
        int bitCount;
        int i3 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i4 = 0;
        for (int i5 = 0; i5 < 32; i5++) {
            int[] iArr = c[i5];
            int i6 = iArr[0];
            if (i6 == i || i6 == i2) {
                return new io4(iArr[1]);
            }
            int bitCount2 = Integer.bitCount(i ^ i6);
            if (bitCount2 < i3) {
                i4 = iArr[1];
                i3 = bitCount2;
            }
            if (i != i2 && (bitCount = Integer.bitCount(i6 ^ i2)) < i3) {
                i4 = iArr[1];
                i3 = bitCount;
            }
        }
        if (i3 <= 3) {
            return new io4(i4);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof io4)) {
            return false;
        }
        io4 io4Var = (io4) obj;
        return this.a == io4Var.a && this.b == io4Var.b;
    }

    public final int hashCode() {
        return (this.a.ordinal() << 3) | this.b;
    }
}
