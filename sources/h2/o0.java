package h2;

import android.text.TextUtils;
import bg.v0;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.nb;
import org.telegram.messenger.qb;
import org.telegram.messenger.t7;
import org.telegram.messenger.v10;
import org.telegram.messenger.w7;
import org.telegram.messenger.y8;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Cells.e2;
import org.telegram.ui.Cells.h2;
import org.telegram.ui.Components.j2;
import org.telegram.ui.Wallet.h3;
import org.telegram.ui.Wallet.q0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o0(Object obj, Object obj2, boolean z9, boolean z10, int i7) {
        this.a = i7;
        this.d = obj;
        this.e = obj2;
        this.b = z9;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y8 y8Var;
        y8 y8Var2;
        String o4;
        switch (this.a) {
            case 0:
                p0 p0Var = (p0) this.d;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.e;
                boolean z9 = this.b;
                boolean z10 = this.c;
                p0Var.getClass();
                atomicBoolean.set(false);
                wf.b.w((wf.b) p0Var.d, z9, z10);
                break;
            case 1:
                t7 t7Var = (t7) this.d;
                boolean z11 = this.b;
                String str = (String) this.e;
                boolean z12 = this.c;
                if (z11) {
                    t7Var.d.n.remove(str);
                } else {
                    t7Var.d.h.remove(str);
                }
                qb qbVar = t7Var.d.E;
                if (qbVar != null) {
                    Utilities.d.c(new nb(qbVar, qbVar.a, str, z11));
                }
                if (!z12) {
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
                boolean z13 = this.b;
                boolean z14 = this.c;
                h2 h2Var = e2Var.b;
                h2Var.e0 = false;
                h2Var.f0 = str2;
                if (str2 == null) {
                    h2Var.f0 = "";
                }
                h2Var.g0 = z13;
                h2Var.f(z14, true);
                break;
            case 4:
                org.telegram.ui.Wallet.m0 m0Var = (org.telegram.ui.Wallet.m0) this.d;
                c20 c20Var = (c20) this.e;
                boolean z15 = this.b;
                boolean z16 = this.c;
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) m0Var.e;
                q0 q0Var = m0Var.c;
                if (q0Var == null || !TextUtils.equals(q0Var.c, tL_walletState.address) || !m0Var.c.f(tL_walletState.public_key)) {
                    m0Var.z(new org.telegram.ui.Wallet.j((Object) m0Var, (Object) c20Var, (Object) tL_walletState, 6), z15, z16);
                    break;
                } else {
                    c20Var.a(null);
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.m0 m0Var2 = (org.telegram.ui.Wallet.m0) this.d;
                v10 v10Var = (v10) this.e;
                boolean z17 = this.b;
                boolean z18 = this.c;
                org.telegram.ui.Wallet.m0.H("getSecretPhrase: ready!");
                TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) m0Var2.e;
                if (!m0Var2.c.f(tL_walletState2.public_key)) {
                    Object obj = null;
                    if (!tL_walletState2.backup_enabled) {
                        org.telegram.ui.Wallet.m0.j("getSecretPhrase: no server backup!");
                        v10Var.a(null, "NO_LOCAL_BACKUP");
                        break;
                    } else {
                        org.telegram.ui.Wallet.m0.H("getSecretPhrase: exportSecretPhrase through password request");
                        h3.a(m0Var2.a, new ai.c0(9), null, null, null, new di.b0(4, m0Var2, v10Var), z17, z18, new v0(obj, 2));
                        break;
                    }
                } else {
                    org.telegram.ui.Wallet.m0.H("getSecretPhrase: device has secured phrase, requesting");
                    q0 q0Var2 = m0Var2.c;
                    byte[] bArr = tL_walletState2.public_key;
                    org.telegram.ui.Wallet.k kVar = new org.telegram.ui.Wallet.k(v10Var, 1);
                    if (bArr == null) {
                        o4 = "";
                    } else {
                        q0Var2.getClass();
                        o4 = q0.o(bArr);
                    }
                    q0.h.execute(new j2(q0Var2, q0Var2.l(), o4, true, (c20) kVar));
                    break;
                }
        }
    }

    public /* synthetic */ o0(t7 t7Var, boolean z9, String str, boolean z10) {
        this.a = 1;
        this.d = t7Var;
        this.b = z9;
        this.e = str;
        this.c = z10;
    }

    public /* synthetic */ o0(e2 e2Var, String str, File file, boolean z9, boolean z10) {
        this.a = 3;
        this.d = e2Var;
        this.e = str;
        this.b = z9;
        this.c = z10;
    }
}
