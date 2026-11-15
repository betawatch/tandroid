package h9;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
