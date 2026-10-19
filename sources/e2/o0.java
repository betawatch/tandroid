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
import org.telegram.ui.Wallet.q0;
import org.telegram.ui.Wallet.s2;
import org.telegram.ui.na0;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
                qf.b.y((qf.b) aVar.c, this.b, this.c);
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
                org.telegram.ui.Wallet.m0 m0Var = (org.telegram.ui.Wallet.m0) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.e;
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) m0Var.e;
                q0 q0Var = m0Var.c;
                if (q0Var == null || !TextUtils.equals(q0Var.c, tL_walletState.address) || !m0Var.c.f(tL_walletState.public_key)) {
                    m0Var.y(new org.telegram.ui.Wallet.k((Object) m0Var, (Object) callback, (Object) tL_walletState, 4), this.b, this.c);
                    break;
                } else {
                    callback.run(null);
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.m0 m0Var2 = (org.telegram.ui.Wallet.m0) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.e;
                org.telegram.ui.Wallet.m0.F("getSecretPhrase: ready!");
                TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) m0Var2.e;
                if (!m0Var2.c.f(tL_walletState2.public_key)) {
                    Object obj = null;
                    if (!tL_walletState2.backup_enabled) {
                        org.telegram.ui.Wallet.m0.i("getSecretPhrase: no server backup!");
                        callback2.run(null, "NO_LOCAL_BACKUP");
                        break;
                    } else {
                        org.telegram.ui.Wallet.m0.F("getSecretPhrase: exportSecretPhrase through password request");
                        s2.a(m0Var2.a, new gi.c(8), null, null, null, new ci.c0(4, m0Var2, callback2), this.b, this.c, new na0(obj, 1));
                        break;
                    }
                } else {
                    org.telegram.ui.Wallet.m0.F("getSecretPhrase: device has secured phrase, requesting");
                    q0 q0Var2 = m0Var2.c;
                    byte[] bArr = tL_walletState2.public_key;
                    org.telegram.ui.Wallet.l lVar = new org.telegram.ui.Wallet.l(callback2, 1);
                    if (bArr == null) {
                        o10 = "";
                    } else {
                        q0Var2.getClass();
                        o10 = q0.o(bArr);
                    }
                    String str2 = o10;
                    q0.h.execute(new r2(q0Var2, q0Var2.l(), str2, true, (Utilities.Callback) lVar));
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
