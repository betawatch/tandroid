package e2;

import android.text.TextUtils;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Cells.b2;
import org.telegram.ui.Cells.e2;
import org.telegram.ui.Components.q2;
import org.telegram.ui.Wallet.p0;
import org.telegram.ui.Wallet.r2;
import org.telegram.ui.ta0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
                qf.b.o((qf.b) aVar.c, this.b, this.c);
                break;
            case 1:
                ((CameraController) this.d).lambda$stopVideoRecording$17(this.e, this.b, this.c);
                break;
            case 2:
                b2 b2Var = (b2) this.d;
                String str = (String) this.e;
                e2 e2Var = b2Var.b;
                e2Var.d0 = false;
                e2Var.e0 = str;
                if (str == null) {
                    e2Var.e0 = "";
                }
                e2Var.f0 = this.b;
                e2Var.f(this.c, true);
                break;
            case 3:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.e;
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) l0Var.e;
                p0 p0Var = l0Var.c;
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
                        r2.a(l0Var2.a, new gi.c(8), null, null, null, new ci.c0(4, l0Var2, callback2), this.b, this.c, new ta0(obj, 1));
                        break;
                    }
                } else {
                    org.telegram.ui.Wallet.l0.F("getSecretPhrase: device has secured phrase, requesting");
                    p0 p0Var2 = l0Var2.c;
                    byte[] bArr = tL_walletState2.public_key;
                    org.telegram.ui.Wallet.k kVar = new org.telegram.ui.Wallet.k(callback2, 1);
                    if (bArr == null) {
                        o10 = "";
                    } else {
                        p0Var2.getClass();
                        o10 = p0.o(bArr);
                    }
                    String str2 = o10;
                    p0.h.execute(new q2(p0Var2, p0Var2.l(), str2, true, (Utilities.Callback) kVar));
                    break;
                }
        }
    }

    public /* synthetic */ o0(b2 b2Var, String str, File file, boolean z10, boolean z11) {
        this.a = 2;
        this.d = b2Var;
        this.e = str;
        this.b = z10;
        this.c = z11;
    }
}
