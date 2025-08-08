package com.google.android.gms.internal.play_billing;

import org.telegram.tgnet.ConnectionsManager;

/* loaded from: classes.dex */
public abstract class zzci {
    zzci() {
    }

    static int zzc(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
        }
        if (i2 <= i) {
            return i;
        }
        int i3 = i + (i >> 1) + 1;
        if (i3 < i2) {
            int highestOneBit = Integer.highestOneBit(i2 - 1);
            i3 = highestOneBit + highestOneBit;
        }
        return i3 < 0 ? ConnectionsManager.DEFAULT_DATACENTER_ID : i3;
    }
}
