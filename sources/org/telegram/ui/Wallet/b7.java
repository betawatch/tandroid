package org.telegram.ui.Wallet;

import java.util.concurrent.CountDownLatch;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class b7 {
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
