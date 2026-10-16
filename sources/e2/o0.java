package e2;

import android.text.TextUtils;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Cells.f2;
import org.telegram.ui.Wallet.p0;
import org.telegram.ui.Wallet.r2;
import org.telegram.ui.mb0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o0(Object obj, Object obj2, boolean z10, boolean z11, int i10) {
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
                ac.a aVar = (ac.a) this.d;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.e;
                aVar.getClass();
                atomicBoolean.set(false);
                qf.b.q((qf.b) aVar.c, this.b, this.c);
                break;
            case 1:
                ((CameraController) this.d).lambda$stopVideoRecording$17(this.e, this.b, this.c);
                break;
            case 2:
                c2 c2Var = (c2) this.d;
                String str = (String) this.e;
                f2 f2Var = c2Var.b;
                f2Var.d0 = false;
                f2Var.e0 = str;
                if (str == null) {
                    f2Var.e0 = "";
                }
                f2Var.f0 = this.b;
                f2Var.f(this.c, true);
                break;
            case 3:
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.e;
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) k0Var.e;
                p0 p0Var = k0Var.c;
                if (p0Var == null || !TextUtils.equals(p0Var.c, tL_walletState.address) || !k0Var.c.f(tL_walletState.public_key)) {
                    k0Var.x(new org.telegram.ui.Wallet.j((Object) k0Var, (Object) callback, (Object) tL_walletState, 4), this.b, this.c);
                    break;
                } else {
                    callback.run(null);
                    break;
                }
            default:
                org.telegram.ui.Wallet.k0 k0Var2 = (org.telegram.ui.Wallet.k0) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.e;
                org.telegram.ui.Wallet.k0.E("getSecretPhrase: ready!");
                TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) k0Var2.e;
                if (!k0Var2.c.f(tL_walletState2.public_key)) {
                    Object obj = null;
                    if (!tL_walletState2.backup_enabled) {
                        org.telegram.ui.Wallet.k0.i("getSecretPhrase: no server backup!");
                        callback2.run(null, "NO_LOCAL_BACKUP");
                        break;
                    } else {
                        org.telegram.ui.Wallet.k0.E("getSecretPhrase: exportSecretPhrase through password request");
                        r2.a(k0Var2.a, new fi.c(7), null, null, null, new bi.j0(4, k0Var2, callback2), this.b, this.c, new mb0(obj, 1));
                        break;
                    }
                } else {
                    org.telegram.ui.Wallet.k0.E("getSecretPhrase: device has secured phrase, requesting");
                    p0 p0Var2 = k0Var2.c;
                    byte[] bArr = tL_walletState2.public_key;
                    org.telegram.ui.Wallet.k kVar = new org.telegram.ui.Wallet.k(callback2, 1);
                    if (bArr == null) {
                        o10 = "";
                    } else {
                        p0Var2.getClass();
                        o10 = p0.o(bArr);
                    }
                    String str2 = o10;
                    p0.h.execute(new org.telegram.ui.Components.r2(p0Var2, p0Var2.l(), str2, true, (Utilities.Callback) kVar));
                    break;
                }
        }
    }

    public /* synthetic */ o0(c2 c2Var, String str, File file, boolean z10, boolean z11) {
        this.a = 2;
        this.d = c2Var;
        this.e = str;
        this.b = z10;
        this.c = z11;
    }
}
