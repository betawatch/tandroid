package com.google.common.collect;

import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
abstract class Hashing {
    static int closedTableSize(int i, double d) {
        int max = Math.max(i, 2);
        int highestOneBit = Integer.highestOneBit(max);
        double d2 = highestOneBit;
        Double.isNaN(d2);
        if (max <= ((int) (d * d2))) {
            return highestOneBit;
        }
        int i2 = highestOneBit << 1;
        return i2 > 0 ? i2 : TLObject.FLAG_30;
    }

    static int smear(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    static int smearedHash(Object obj) {
        return smear(obj == null ? 0 : obj.hashCode());
    }
}
