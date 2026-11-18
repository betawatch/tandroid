package a8;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public abstract class w8 {
    public static int a(int i7, int i10) {
        if (i10 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int i11 = i7 + (i7 >> 1) + 1;
        if (i11 < i10) {
            int highestOneBit = Integer.highestOneBit(i10 - 1);
            i11 = highestOneBit + highestOneBit;
        }
        return i11 < 0 ? ConnectionsManager.DEFAULT_DATACENTER_ID : i11;
    }
}
