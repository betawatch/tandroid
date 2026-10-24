package e9;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public abstract class h0 {
    public static int b(int i10, int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
        }
        if (i11 <= i10) {
            return i10;
        }
        int i12 = i10 + (i10 >> 1) + 1;
        if (i12 < i11) {
            i12 = Integer.highestOneBit(i11 - 1) << 1;
        }
        return i12 < 0 ? ConnectionsManager.DEFAULT_DATACENTER_ID : i12;
    }

    public abstract h0 a(Object obj);
}
