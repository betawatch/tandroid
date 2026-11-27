// default package

import android.os.Handler;
import android.text.TextUtils;
import j$.util.Objects;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class ba1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ba1(tw2 tw2Var, String str, File file, boolean z, boolean z2) {
        this.a = (byte) 1;
        this.d = tw2Var;
        this.e = str;
        this.b = z;
        this.c = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nd4 nd4Var;
        nd4 nd4Var2;
        NativeInstance nativeInstance;
        switch (this.a) {
            case 0:
                ((CameraController) this.d).lambda$stopVideoRecording$17(this.e, this.b, this.c);
                break;
            case 1:
                tw2 tw2Var = (tw2) this.d;
                String str = (String) this.e;
                boolean z = this.b;
                boolean z2 = this.c;
                vw2 vw2Var = tw2Var.b;
                vw2Var.f0 = false;
                vw2Var.g0 = str;
                if (str == null) {
                    vw2Var.g0 = "";
                }
                vw2Var.h0 = z;
                vw2Var.f(z2, true);
                break;
            case 2:
                ub4 ub4Var = (ub4) this.d;
                boolean z3 = this.b;
                String str2 = (String) this.e;
                boolean z4 = this.c;
                xb4 xb4Var = ub4Var.d;
                if (z3) {
                    xb4Var.n.remove(str2);
                } else {
                    xb4Var.h.remove(str2);
                }
                sm5 sm5Var = ub4Var.d.F;
                if (sm5Var != null) {
                    Utilities.d.c(new ps1((Object) sm5Var, sm5Var.a, (Object) str2, z3, (byte) 5));
                }
                xb4 xb4Var2 = ub4Var.d;
                if (!z4) {
                    int i = xb4Var2.r - 1;
                    xb4Var2.r = i;
                    if (i < 1 && (nd4Var = (nd4) xb4Var2.e.poll()) != null) {
                        ub4Var.d.r++;
                        nd4Var.c();
                        break;
                    }
                } else {
                    int i2 = xb4Var2.s - 1;
                    xb4Var2.s = i2;
                    if (i2 < 1 && (nd4Var2 = (nd4) xb4Var2.f.poll()) != null) {
                        ub4Var.d.s++;
                        nd4Var2.c();
                        break;
                    }
                }
                break;
            case 3:
                c cVar = (c) this.d;
                pcc pccVar = (pcc) this.e;
                boolean z5 = this.b;
                boolean z6 = this.c;
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) cVar.e;
                k35 k35Var = cVar.c;
                if (k35Var == null || !TextUtils.equals(k35Var.c, tL_walletState.address) || !cVar.c.f(tL_walletState.public_key)) {
                    cVar.E(z5, z6, false, new p((Object) cVar, (Object) pccVar, (Object) tL_walletState, (byte) 14));
                    break;
                } else {
                    pccVar.a(null);
                    break;
                }
            case 4:
                dq9 dq9Var = (dq9) this.d;
                NativeInstance nativeInstance2 = (NativeInstance) this.e;
                boolean z7 = this.b;
                boolean z8 = this.c;
                boolean z9 = dq9Var.w;
                if (!z9 && (nativeInstance = dq9Var.P) == nativeInstance2 && !z7 && !dq9Var.h) {
                    if (!z8) {
                        g01 g01Var = dq9Var.Y;
                        if (g01Var != null) {
                            g01Var.k();
                            dq9Var.Y = null;
                        }
                        dq9Var.Z = false;
                        break;
                    } else if (!z9 && nativeInstance != null && dq9Var.Y == null) {
                        g01 g01Var2 = new g01(dq9Var.e, dq9Var.f, dq9Var.k(), dq9Var.P, new wp9(dq9Var, nativeInstance));
                        dq9Var.Y = g01Var2;
                        g01Var2.b.post(new xac((byte) 6, g01Var2, a.o()));
                        dq9Var.N();
                        g01 g01Var3 = dq9Var.Y;
                        Handler handler = g01Var3.b;
                        xz0 xz0Var = g01Var3.d;
                        Objects.requireNonNull(xz0Var);
                        handler.post(new gz0(xz0Var, (byte) 6));
                        break;
                    }
                }
                break;
            default:
                qoc qocVar = (qoc) this.d;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.e;
                boolean z10 = this.b;
                boolean z11 = this.c;
                atomicBoolean.set(false);
                ((zhc) qocVar.c).d(z10, z11);
                break;
        }
    }

    public /* synthetic */ ba1(ub4 ub4Var, boolean z, String str, boolean z2) {
        this.a = (byte) 2;
        this.d = ub4Var;
        this.b = z;
        this.e = str;
        this.c = z2;
    }

    public /* synthetic */ ba1(Object obj, Object obj2, boolean z, boolean z2, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = z;
        this.c = z2;
    }
}
