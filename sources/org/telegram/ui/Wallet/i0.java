package org.telegram.ui.Wallet;

import org.telegram.messenger.q10;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class i0 implements Runnable {
    public volatile boolean a;
    public Runnable b;
    public final /* synthetic */ String c;
    public final /* synthetic */ TL_wallet.nftItem d;
    public final /* synthetic */ String e;
    public final /* synthetic */ q10 f;
    public final /* synthetic */ u0 h;

    public i0(u0 u0Var, String str, TL_wallet.nftItem nftitem, String str2, q10 q10Var) {
        this.h = u0Var;
        this.c = str;
        this.d = nftitem;
        this.e = str2;
        this.f = q10Var;
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
                this.b = walletEngine2.emulateSendNFT(str, str2, str3, new s(this, nftitem, str3, this.f, 4));
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
