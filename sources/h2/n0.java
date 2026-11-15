package h2;

import android.text.TextUtils;
import bg.u0;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.mb;
import org.telegram.messenger.pb;
import org.telegram.messenger.s10;
import org.telegram.messenger.t7;
import org.telegram.messenger.w7;
import org.telegram.messenger.y8;
import org.telegram.messenger.z10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Cells.e2;
import org.telegram.ui.Cells.h2;
import org.telegram.ui.Components.i2;
import org.telegram.ui.Wallet.f3;
import org.telegram.ui.Wallet.p0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class n0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n0(Object obj, Object obj2, boolean z10, boolean z11, int i7) {
        this.a = i7;
        this.d = obj;
        this.e = obj2;
        this.b = z10;
        this.c = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y8 y8Var;
        y8 y8Var2;
        String o4;
        switch (this.a) {
            case 0:
                o0 o0Var = (o0) this.d;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.e;
                boolean z10 = this.b;
                boolean z11 = this.c;
                o0Var.getClass();
                atomicBoolean.set(false);
                wf.b.o((wf.b) o0Var.d, z10, z11);
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
                pb pbVar = t7Var.d.F;
                if (pbVar != null) {
                    Utilities.d.c(new mb(pbVar, pbVar.a, str, z12));
                }
                if (!z13) {
                    w7 w7Var = t7Var.d;
                    int i7 = w7Var.r - 1;
                    w7Var.r = i7;
                    if (i7 < 1 && (y8Var = (y8) w7Var.e.poll()) != null) {
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
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) this.d;
                z10 z10Var = (z10) this.e;
                boolean z16 = this.b;
                boolean z17 = this.c;
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) l0Var.e;
                p0 p0Var = l0Var.c;
                if (p0Var == null || !TextUtils.equals(p0Var.c, tL_walletState.address) || !l0Var.c.f(tL_walletState.public_key)) {
                    l0Var.z(new org.telegram.ui.Wallet.j((Object) l0Var, (Object) z10Var, (Object) tL_walletState, 6), z16, z17);
                    break;
                } else {
                    z10Var.a(null);
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.l0 l0Var2 = (org.telegram.ui.Wallet.l0) this.d;
                s10 s10Var = (s10) this.e;
                boolean z18 = this.b;
                boolean z19 = this.c;
                org.telegram.ui.Wallet.l0.H("getSecretPhrase: ready!");
                TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) l0Var2.e;
                if (!l0Var2.c.f(tL_walletState2.public_key)) {
                    Object obj = null;
                    if (!tL_walletState2.backup_enabled) {
                        org.telegram.ui.Wallet.l0.j("getSecretPhrase: no server backup!");
                        s10Var.a(null, "NO_LOCAL_BACKUP");
                        break;
                    } else {
                        org.telegram.ui.Wallet.l0.H("getSecretPhrase: exportSecretPhrase through password request");
                        f3.a(l0Var2.a, new ci.x(9), null, null, null, new fi.b0(4, l0Var2, s10Var), z18, z19, new u0(obj, 2));
                        break;
                    }
                } else {
                    org.telegram.ui.Wallet.l0.H("getSecretPhrase: device has secured phrase, requesting");
                    p0 p0Var2 = l0Var2.c;
                    byte[] bArr = tL_walletState2.public_key;
                    org.telegram.ui.Wallet.k kVar = new org.telegram.ui.Wallet.k(s10Var, 1);
                    if (bArr == null) {
                        o4 = "";
                    } else {
                        p0Var2.getClass();
                        o4 = p0.o(bArr);
                    }
                    p0.h.execute(new i2(p0Var2, p0Var2.l(), o4, true, (z10) kVar));
                    break;
                }
        }
    }

    public /* synthetic */ n0(t7 t7Var, boolean z10, String str, boolean z11) {
        this.a = 1;
        this.d = t7Var;
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
