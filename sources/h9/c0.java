package h9;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class c0 {
    public static int b(int i7, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
        }
        if (i10 <= i7) {
            return i7;
        }
        int i11 = i7 + (i7 >> 1) + 1;
        if (i11 < i10) {
            i11 = Integer.highestOneBit(i10 - 1) << 1;
        }
        return i11 < 0 ? ConnectionsManager.DEFAULT_DATACENTER_ID : i11;
    }

    public abstract c0 a(Object obj);
}
