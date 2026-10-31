package e2;

import android.text.TextUtils;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.b8;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.d9;
import org.telegram.messenger.j20;
import org.telegram.messenger.nb;
import org.telegram.messenger.q20;
import org.telegram.messenger.rb;
import org.telegram.messenger.y7;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Cells.e2;
import org.telegram.ui.Cells.h2;
import org.telegram.ui.Components.k2;
import org.telegram.ui.Wallet.h3;
import org.telegram.ui.Wallet.p0;
import org.telegram.ui.aa0;
import org.telegram.ui.jo;
import org.telegram.ui.zh;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class n0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n0(Object obj, Object obj2, boolean z10, boolean z11, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.b = z10;
        this.c = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d9 d9Var;
        d9 d9Var2;
        String o10;
        switch (this.a) {
            case 0:
                o0 o0Var = (o0) this.d;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.e;
                boolean z10 = this.b;
                boolean z11 = this.c;
                o0Var.getClass();
                atomicBoolean.set(false);
                hf.b.J((hf.b) o0Var.c, z10, z11);
                break;
            case 1:
                y7 y7Var = (y7) this.d;
                boolean z12 = this.b;
                String str = (String) this.e;
                boolean z13 = this.c;
                if (z12) {
                    y7Var.d.n.remove(str);
                } else {
                    y7Var.d.h.remove(str);
                }
                rb rbVar = y7Var.d.E;
                if (rbVar != null) {
                    Utilities.d.c(new nb(rbVar, rbVar.a, str, z12));
                }
                if (!z13) {
                    b8 b8Var = y7Var.d;
                    int i10 = b8Var.r - 1;
                    b8Var.r = i10;
                    if (i10 < 1 && (d9Var = (d9) b8Var.e.poll()) != null) {
                        y7Var.d.r++;
                        d9Var.c();
                        break;
                    }
                } else {
                    b8 b8Var2 = y7Var.d;
                    int i11 = b8Var2.s - 1;
                    b8Var2.s = i11;
                    if (i11 < 1 && (d9Var2 = (d9) b8Var2.f.poll()) != null) {
                        y7Var.d.s++;
                        d9Var2.c();
                        break;
                    }
                }
                break;
            case 2:
                ((CameraController) this.d).lambda$stopVideoRecording$17(this.e, this.b, this.c);
                break;
            case 3:
                e2 e2Var = (e2) this.d;
                String str2 = (String) this.e;
                boolean z14 = this.b;
                boolean z15 = this.c;
                h2 h2Var = e2Var.b;
                h2Var.e0 = false;
                h2Var.f0 = str2;
                if (str2 == null) {
                    h2Var.f0 = "";
                }
                h2Var.g0 = z14;
                h2Var.f(z15, true);
                break;
            case 4:
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.d;
                q20 q20Var = (q20) this.e;
                boolean z16 = this.b;
                boolean z17 = this.c;
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) k0Var.e;
                p0 p0Var = k0Var.c;
                if (p0Var == null || !TextUtils.equals(p0Var.c, tL_walletState.address) || !k0Var.c.f(tL_walletState.public_key)) {
                    k0Var.z(new org.telegram.ui.Wallet.j((Object) k0Var, (Object) q20Var, (Object) tL_walletState, 6), z16, z17);
                    break;
                } else {
                    q20Var.a(null);
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.k0 k0Var2 = (org.telegram.ui.Wallet.k0) this.d;
                j20 j20Var = (j20) this.e;
                boolean z18 = this.b;
                boolean z19 = this.c;
                org.telegram.ui.Wallet.k0.H("getSecretPhrase: ready!");
                TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) k0Var2.e;
                if (!k0Var2.c.f(tL_walletState2.public_key)) {
                    Object obj = null;
                    if (!tL_walletState2.backup_enabled) {
                        org.telegram.ui.Wallet.k0.j("getSecretPhrase: no server backup!");
                        j20Var.a(null, "NO_LOCAL_BACKUP");
                        break;
                    } else {
                        org.telegram.ui.Wallet.k0.H("getSecretPhrase: exportSecretPhrase through password request");
                        h3.a(k0Var2.a, new zh(6), null, null, null, new jo(1, k0Var2, j20Var), z18, z19, new aa0(obj, 1));
                        break;
                    }
                } else {
                    org.telegram.ui.Wallet.k0.H("getSecretPhrase: device has secured phrase, requesting");
                    p0 p0Var2 = k0Var2.c;
                    byte[] bArr = tL_walletState2.public_key;
                    org.telegram.ui.Wallet.k kVar = new org.telegram.ui.Wallet.k(j20Var, 1);
                    if (bArr == null) {
                        o10 = "";
                    } else {
                        p0Var2.getClass();
                        o10 = p0.o(bArr);
                    }
                    p0.h.execute(new k2(p0Var2, p0Var2.l(), o10, true, (q20) kVar));
                    break;
                }
        }
    }

    public /* synthetic */ n0(y7 y7Var, boolean z10, String str, boolean z11) {
        this.a = 1;
        this.d = y7Var;
        this.b = z10;
        this.e = str;
        this.c = z11;
    }

    public /* synthetic */ n0(e2 e2Var, String str, File file, boolean z10, boolean z11) {
        this.a = 3;
        this.d = e2Var;
        this.e = str;
        this.b = z10;
        this.c = z11;
    }
}
