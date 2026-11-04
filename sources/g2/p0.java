package g2;

import android.text.TextUtils;
import cg.u0;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.gb;
import org.telegram.messenger.jb;
import org.telegram.messenger.n10;
import org.telegram.messenger.t7;
import org.telegram.messenger.u10;
import org.telegram.messenger.w7;
import org.telegram.messenger.y8;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Cells.e2;
import org.telegram.ui.Cells.h2;
import org.telegram.ui.Wallet.g3;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class p0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ p0(Object obj, Object obj2, boolean z10, boolean z11, int i3) {
        this.a = i3;
        this.d = obj;
        this.e = obj2;
        this.b = z10;
        this.c = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y8 y8Var;
        y8 y8Var2;
        String o10;
        switch (this.a) {
            case 0:
                q0 q0Var = (q0) this.d;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.e;
                boolean z10 = this.b;
                boolean z11 = this.c;
                q0Var.getClass();
                atomicBoolean.set(false);
                p4.q.c((p4.q) q0Var.d, z10, z11);
                break;
            case 1:
                t7 t7Var = (t7) this.d;
                boolean z12 = this.b;
                String str = (String) this.e;
                boolean z13 = this.c;
                if (z12) {
                    t7Var.d.n.remove(str);
                } else {
                    t7Var.d.h.remove(str);
                }
                jb jbVar = t7Var.d.F;
                if (jbVar != null) {
                    Utilities.d.c(new gb(jbVar, jbVar.a, str, z12));
                }
                if (!z13) {
                    w7 w7Var = t7Var.d;
                    int i3 = w7Var.r - 1;
                    w7Var.r = i3;
                    if (i3 < 1 && (y8Var = (y8) w7Var.e.poll()) != null) {
                        t7Var.d.r++;
                        y8Var.c();
                        break;
                    }
                } else {
                    w7 w7Var2 = t7Var.d;
                    int i10 = w7Var2.s - 1;
                    w7Var2.s = i10;
                    if (i10 < 1 && (y8Var2 = (y8) w7Var2.f.poll()) != null) {
                        t7Var.d.s++;
                        y8Var2.c();
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
                h2Var.f0 = false;
                h2Var.g0 = str2;
                if (str2 == null) {
                    h2Var.g0 = "";
                }
                h2Var.h0 = z14;
                h2Var.f(z15, true);
                break;
            case 4:
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.d;
                u10 u10Var = (u10) this.e;
                boolean z16 = this.b;
                boolean z17 = this.c;
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) k0Var.e;
                org.telegram.ui.Wallet.o0 o0Var = k0Var.c;
                if (o0Var == null || !TextUtils.equals(o0Var.c, tL_walletState.address) || !k0Var.c.f(tL_walletState.public_key)) {
                    k0Var.z(new org.telegram.ui.Wallet.j((Object) k0Var, (Object) u10Var, (Object) tL_walletState, 6), z16, z17);
                    break;
                } else {
                    u10Var.a(null);
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.k0 k0Var2 = (org.telegram.ui.Wallet.k0) this.d;
                n10 n10Var = (n10) this.e;
                boolean z18 = this.b;
                boolean z19 = this.c;
                org.telegram.ui.Wallet.k0.H("getSecretPhrase: ready!");
                TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) k0Var2.e;
                if (!k0Var2.c.f(tL_walletState2.public_key)) {
                    Object obj = null;
                    if (!tL_walletState2.backup_enabled) {
                        org.telegram.ui.Wallet.k0.j("getSecretPhrase: no server backup!");
                        n10Var.a(null, "NO_LOCAL_BACKUP");
                        break;
                    } else {
                        org.telegram.ui.Wallet.k0.H("getSecretPhrase: exportSecretPhrase through password request");
                        g3.a(k0Var2.a, new bi.x(9), null, null, null, new ei.d0(4, k0Var2, n10Var), z18, z19, new u0(obj, 2));
                        break;
                    }
                } else {
                    org.telegram.ui.Wallet.k0.H("getSecretPhrase: device has secured phrase, requesting");
                    org.telegram.ui.Wallet.o0 o0Var2 = k0Var2.c;
                    byte[] bArr = tL_walletState2.public_key;
                    org.telegram.ui.Wallet.k kVar = new org.telegram.ui.Wallet.k(n10Var, 1);
                    if (bArr == null) {
                        o10 = "";
                    } else {
                        o0Var2.getClass();
                        o10 = org.telegram.ui.Wallet.o0.o(bArr);
                    }
                    org.telegram.ui.Wallet.o0.h.execute(new org.telegram.ui.Components.h2(o0Var2, o0Var2.l(), o10, true, (u10) kVar));
                    break;
                }
        }
    }

    public /* synthetic */ p0(t7 t7Var, boolean z10, String str, boolean z11) {
        this.a = 1;
        this.d = t7Var;
        this.b = z10;
        this.e = str;
        this.c = z11;
    }

    public /* synthetic */ p0(e2 e2Var, String str, File file, boolean z10, boolean z11) {
        this.a = 3;
        this.d = e2Var;
        this.e = str;
        this.b = z10;
        this.c = z11;
    }
}
