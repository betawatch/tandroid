package org.telegram.ui.Wallet;

import java.util.concurrent.CountDownLatch;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class k7 {
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
