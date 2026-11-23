package h2;

import android.text.TextUtils;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.mb;
import org.telegram.messenger.pb;
import org.telegram.messenger.t7;
import org.telegram.messenger.w7;
import org.telegram.messenger.y10;
import org.telegram.messenger.y8;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Cells.f2;
import org.telegram.ui.Cells.i2;
import org.telegram.ui.Wallet.u0;
import org.telegram.ui.Wallet.z0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
        switch (this.a) {
            case 0:
                o0 o0Var = (o0) this.d;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.e;
                boolean z10 = this.b;
                boolean z11 = this.c;
                o0Var.getClass();
                atomicBoolean.set(false);
                wf.b.p((wf.b) o0Var.d, z10, z11);
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
                f2 f2Var = (f2) this.d;
                String str2 = (String) this.e;
                boolean z14 = this.b;
                boolean z15 = this.c;
                i2 i2Var = f2Var.b;
                i2Var.f0 = false;
                i2Var.g0 = str2;
                if (str2 == null) {
                    i2Var.g0 = "";
                }
                i2Var.h0 = z14;
                i2Var.f(z15, true);
                break;
            default:
                u0 u0Var = (u0) this.d;
                y10 y10Var = (y10) this.e;
                boolean z16 = this.b;
                boolean z17 = this.c;
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) u0Var.e;
                z0 z0Var = u0Var.c;
                if (z0Var == null || !TextUtils.equals(z0Var.c, tL_walletState.address) || !u0Var.c.f(tL_walletState.public_key)) {
                    u0Var.F(z16, z17, false, new org.telegram.ui.Wallet.j((Object) u0Var, (Object) y10Var, (Object) tL_walletState, 2));
                    break;
                } else {
                    y10Var.a(null);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ n0(t7 t7Var, boolean z10, String str, boolean z11) {
        this.a = 1;
        this.d = t7Var;
        this.b = z10;
        this.e = str;
        this.c = z11;
    }

    public /* synthetic */ n0(f2 f2Var, String str, File file, boolean z10, boolean z11) {
        this.a = 3;
        this.d = f2Var;
        this.e = str;
        this.b = z10;
        this.c = z11;
    }
}
