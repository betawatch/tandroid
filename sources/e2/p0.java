package e2;

import ag.b1;
import android.text.TextUtils;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Cells.a2;
import org.telegram.ui.Cells.d2;
import org.telegram.ui.Components.s2;
import org.telegram.ui.Wallet.r2;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class p0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ p0(Object obj, Object obj2, boolean z10, boolean z11, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.b = z10;
        this.c = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String o10;
        switch (this.a) {
            case 0:
                bc.a aVar = (bc.a) this.d;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.e;
                aVar.getClass();
                atomicBoolean.set(false);
                n4.s.c((n4.s) aVar.c, this.b, this.c);
                break;
            case 1:
                ((CameraController) this.d).lambda$stopVideoRecording$17(this.e, this.b, this.c);
                break;
            case 2:
                a2 a2Var = (a2) this.d;
                String str = (String) this.e;
                d2 d2Var = a2Var.b;
                d2Var.d0 = false;
                d2Var.e0 = str;
                if (str == null) {
                    d2Var.e0 = "";
                }
                d2Var.f0 = this.b;
                d2Var.f(this.c, true);
                break;
            case 3:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.e;
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) l0Var.e;
                org.telegram.ui.Wallet.p0 p0Var = l0Var.c;
                if (p0Var == null || !TextUtils.equals(p0Var.c, tL_walletState.address) || !l0Var.c.f(tL_walletState.public_key)) {
                    l0Var.y(new org.telegram.ui.Wallet.j((Object) l0Var, (Object) callback, (Object) tL_walletState, 4), this.b, this.c);
                    break;
                } else {
                    callback.run(null);
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.l0 l0Var2 = (org.telegram.ui.Wallet.l0) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.e;
                org.telegram.ui.Wallet.l0.F("getSecretPhrase: ready!");
                TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) l0Var2.e;
                if (!l0Var2.c.f(tL_walletState2.public_key)) {
                    Object obj = null;
                    if (!tL_walletState2.backup_enabled) {
                        org.telegram.ui.Wallet.l0.i("getSecretPhrase: no server backup!");
                        callback2.run(null, "NO_LOCAL_BACKUP");
                        break;
                    } else {
                        org.telegram.ui.Wallet.l0.F("getSecretPhrase: exportSecretPhrase through password request");
                        r2.a(l0Var2.a, new ai.d0(12), null, null, null, new di.c0(4, l0Var2, callback2), this.b, this.c, new b1(obj, 2));
                        break;
                    }
                } else {
                    org.telegram.ui.Wallet.l0.F("getSecretPhrase: device has secured phrase, requesting");
                    org.telegram.ui.Wallet.p0 p0Var2 = l0Var2.c;
                    byte[] bArr = tL_walletState2.public_key;
                    org.telegram.ui.Wallet.k kVar = new org.telegram.ui.Wallet.k(callback2, 1);
                    if (bArr == null) {
                        o10 = "";
                    } else {
                        p0Var2.getClass();
                        o10 = org.telegram.ui.Wallet.p0.o(bArr);
                    }
                    String str2 = o10;
                    org.telegram.ui.Wallet.p0.h.execute(new s2(p0Var2, p0Var2.l(), str2, true, (Utilities.Callback) kVar));
                    break;
                }
        }
    }

    public /* synthetic */ p0(a2 a2Var, String str, File file, boolean z10, boolean z11) {
        this.a = 2;
        this.d = a2Var;
        this.e = str;
        this.b = z10;
        this.c = z11;
    }
}
