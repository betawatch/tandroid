// default package

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.RLottieNative;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class ny8 extends oy8 {
    public volatile RLottieNative V0;
    public boolean W0;
    public boolean X0;
    public volatile boolean Y0;
    public boolean Z0;
    public final int a1;
    public int b1;

    public ny8(String str, int i, int i2) {
        super(i, i2);
        String v2;
        this.a1 = -1;
        this.K = (byte) 1;
        if ("🎲".equals(str)) {
            v2 = gl.v2(null, R.raw.diceloop);
            this.a1 = 60;
        } else {
            v2 = "🎯".equals(str) ? gl.v2(null, R.raw.dartloop) : null;
        }
        getPaint().setFlags(2);
        if (TextUtils.isEmpty(v2)) {
            return;
        }
        this.n0 = RLottieNative.b(v2, this.e, null, null);
    }

    @Override // oy8
    public void d() {
        byte b = this.K;
        if (b != 1) {
            if (b == 2) {
                int i = this.b0 + 1;
                if (i < this.b1) {
                    this.b0 = i;
                    return;
                } else {
                    this.O = true;
                    this.N++;
                    return;
                }
            }
            return;
        }
        int i2 = this.b0 + 1;
        int i3 = this.a1;
        if (i3 == -1) {
            i3 = this.e[0];
        }
        if (i2 < i3) {
            this.b0 = i2;
            return;
        }
        this.b0 = 0;
        this.O = false;
        if (this.V0 != null) {
            this.K = (byte) 2;
        }
        if (this.E) {
            this.y = null;
            this.E = false;
        }
    }

    @Override // oy8
    public int e() {
        if (this.m0) {
            return 3;
        }
        return (this.n0 == null || (this.K == 2 && this.V0 == null)) ? 2 : 1;
    }

    @Override // oy8
    public void k() {
        if (this.W) {
            i();
            if (this.Q == null && this.n0 != null) {
                y(true);
            }
        }
        if (this.n0 == null && this.V0 == null && this.C0 == null) {
            z();
            return;
        }
        this.U = true;
        if (!q()) {
            stop();
        }
        if (this.l0) {
            D();
        }
    }

    @Override // oy8
    public final boolean r() {
        return this.Z0;
    }

    @Override // oy8
    public final boolean u() {
        return false;
    }

    @Override // oy8
    public int w(Bitmap bitmap, boolean z) {
        RLottieNative rLottieNative;
        byte b = this.K;
        if (b == 1) {
            rLottieNative = this.n0;
        } else if (b == 2) {
            rLottieNative = this.V0;
            if (this.Y0) {
                this.b0 = this.b1 - 1;
            }
        } else {
            rLottieNative = this.n0;
        }
        return rLottieNative.c(this.b0, bitmap, z) < 0 ? 2 : 1;
    }

    @Override // oy8
    public void x(boolean z) {
        this.l0 = false;
        this.m0 = true;
        i();
        g();
        if (this.Z0 || this.W0) {
            this.X0 = true;
            return;
        }
        if (this.Q != null || this.y0) {
            this.W = true;
            return;
        }
        y(z);
        dk0 dk0Var = this.C0;
        if (dk0Var != null) {
            RandomAccessFile randomAccessFile = dk0Var.s;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                dk0Var.s = null;
            }
            dk0Var.r = true;
            this.C0 = null;
        }
        z();
    }

    @Override // oy8
    public final void y(boolean z) {
        RLottieNative rLottieNative = this.n0;
        RLottieNative rLottieNative2 = this.V0;
        this.n0 = null;
        this.V0 = null;
        if (rLottieNative == null && rLottieNative2 == null) {
            return;
        }
        lw8 lw8Var = new lw8(rLottieNative, rLottieNative2, (byte) 6);
        if (z) {
            eo3.a(lw8Var);
        } else {
            Utilities.e.c(lw8Var);
        }
    }
}
