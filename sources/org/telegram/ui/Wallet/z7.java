package org.telegram.ui.Wallet;

import java.util.concurrent.CountDownLatch;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class z7 {
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
