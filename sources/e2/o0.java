package e2;

import android.text.TextUtils;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Cells.f2;
import org.telegram.ui.Components.r2;
import org.telegram.ui.Wallet.q2;
import org.telegram.ui.nb0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                qf.b.s((qf.b) aVar.c, this.b, this.c);
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
                org.telegram.ui.Wallet.j0 j0Var = (org.telegram.ui.Wallet.j0) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.e;
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) j0Var.e;
                org.telegram.ui.Wallet.o0 o0Var = j0Var.c;
                if (o0Var == null || !TextUtils.equals(o0Var.c, tL_walletState.address) || !j0Var.c.f(tL_walletState.public_key)) {
                    j0Var.x(new org.telegram.ui.Wallet.i((Object) j0Var, (Object) callback, (Object) tL_walletState, 4), this.b, this.c);
                    break;
                } else {
                    callback.run(null);
                    break;
                }
            default:
                org.telegram.ui.Wallet.j0 j0Var2 = (org.telegram.ui.Wallet.j0) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.e;
                org.telegram.ui.Wallet.j0.E("getSecretPhrase: ready!");
                TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) j0Var2.e;
                if (!j0Var2.c.f(tL_walletState2.public_key)) {
                    Object obj = null;
                    if (!tL_walletState2.backup_enabled) {
                        org.telegram.ui.Wallet.j0.i("getSecretPhrase: no server backup!");
                        callback2.run(null, "NO_LOCAL_BACKUP");
                        break;
                    } else {
                        org.telegram.ui.Wallet.j0.E("getSecretPhrase: exportSecretPhrase through password request");
                        q2.a(j0Var2.a, new fi.c(7), null, null, null, new bi.j0(4, j0Var2, callback2), this.b, this.c, new nb0(obj, 1));
                        break;
                    }
                } else {
                    org.telegram.ui.Wallet.j0.E("getSecretPhrase: device has secured phrase, requesting");
                    org.telegram.ui.Wallet.o0 o0Var2 = j0Var2.c;
                    byte[] bArr = tL_walletState2.public_key;
                    org.telegram.ui.Wallet.j jVar = new org.telegram.ui.Wallet.j(callback2, 1);
                    if (bArr == null) {
                        o10 = "";
                    } else {
                        o0Var2.getClass();
                        o10 = org.telegram.ui.Wallet.o0.o(bArr);
                    }
                    String str2 = o10;
                    org.telegram.ui.Wallet.o0.h.execute(new r2(o0Var2, o0Var2.l(), str2, true, (Utilities.Callback) jVar));
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
