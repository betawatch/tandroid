package org.telegram.ui.Wallet;

import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d(WalletEngine2.SendCallbacks sendCallbacks, WalletEngine2.SendPhase sendPhase, String str, String str2) {
        this.a = (byte) 2;
        this.b = sendCallbacks;
        this.d = sendPhase;
        this.c = str;
        this.e = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.e;
        String str = this.c;
        Object obj2 = this.d;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ((WalletEngine2) obj3).lambda$prepareRotateKey$37((m8c) obj2, (WalletEngine2.PreparedRotation) obj, str);
                break;
            case 1:
                ((WalletEngine2) obj3).lambda$rotateKey$55((WalletEngine2.RotationCallbacks) obj2, (byte[]) obj, str);
                break;
            default:
                ((WalletEngine2.SendCallbacks) obj3).lambda$dispatch$0((WalletEngine2.SendPhase) obj2, str, (String) obj);
                break;
        }
    }

    public /* synthetic */ d(WalletEngine2 walletEngine2, Object obj, Object obj2, String str, byte b) {
        this.a = b;
        this.b = walletEngine2;
        this.d = obj;
        this.e = obj2;
        this.c = str;
    }
}
