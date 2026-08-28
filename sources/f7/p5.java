package f7;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class p5 {
    public static int a(int i9, int i10) {
        if (i10 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int i11 = i9 + (i9 >> 1) + 1;
        if (i11 < i10) {
            int highestOneBit = Integer.highestOneBit(i10 - 1);
            i11 = highestOneBit + highestOneBit;
        }
        return i11 < 0 ? ConnectionsManager.DEFAULT_DATACENTER_ID : i11;
    }
}
