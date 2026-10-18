package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class c0 implements Runnable {
    public volatile boolean a;
    public Runnable b;
    public final /* synthetic */ String c;
    public final /* synthetic */ TL_wallet.nftItem d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Utilities.Callback2 f;
    public final /* synthetic */ m0 h;

    public c0(m0 m0Var, String str, TL_wallet.nftItem nftitem, String str2, Utilities.Callback2 callback2) {
        this.h = m0Var;
        this.c = str;
        this.d = nftitem;
        this.e = str2;
        this.f = callback2;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        try {
            try {
                if (this.a) {
                    return;
                }
                WalletEngine2 walletEngine2 = this.h.b;
                String str = this.c;
                TL_wallet.nftItem nftitem = this.d;
                String str2 = nftitem.address;
                String str3 = this.e;
                this.b = walletEngine2.emulateSendNFT(str, str2, str3, new q(this, nftitem, str3, this.f, 4));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }
}
