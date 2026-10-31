package org.telegram.ui.Wallet;

import java.util.concurrent.CountDownLatch;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p7 {
    public final CountDownLatch a = new CountDownLatch(1);
    public int b;
    public byte[] c;
    public WalletEngine2.HttpTransport.HostException d;

    public final synchronized void a(byte[] bArr, WalletEngine2.HttpTransport.HostException hostException) {
        if (this.a.getCount() == 0) {
            return;
        }
        this.c = bArr;
        this.d = hostException;
        this.a.countDown();
    }
}
