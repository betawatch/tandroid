// default package

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class io5 {
    public static int b(int i, int i2) {
        if (i2 < 0) {
            lq5.j("cannot store more than MAX_VALUE elements");
            return 0;
        }
        if (i2 <= i) {
            return i;
        }
        int i3 = i + (i >> 1) + 1;
        if (i3 < i2) {
            i3 = Integer.highestOneBit(i2 - 1) << 1;
        }
        return i3 < 0 ? ConnectionsManager.DEFAULT_DATACENTER_ID : i3;
    }

    public abstract io5 a(Object obj);
}
