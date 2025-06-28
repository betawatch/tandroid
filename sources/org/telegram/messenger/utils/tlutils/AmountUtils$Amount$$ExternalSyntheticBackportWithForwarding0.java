package org.telegram.messenger.utils.tlutils;

import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class AmountUtils$Amount$$ExternalSyntheticBackportWithForwarding0 {
    public static /* synthetic */ BigDecimal m(BigDecimal bigDecimal) {
        return bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros();
    }
}
