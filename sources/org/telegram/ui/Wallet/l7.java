package org.telegram.ui.Wallet;

import java.util.concurrent.CountDownLatch;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class l7 {
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
