// default package

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class f64 {
    public static final short E;
    public static final boolean F;
    public boolean A;
    public final String B;
    public final boolean C;
    public final boolean D;
    public final Context a;
    public final vgb b;
    public mfb c;
    public final mfb d;
    public mfb e;
    public mfb f;
    public final b00 g;
    public final p31 h;
    public Looper i;
    public final int j;
    public final oz k;
    public final boolean l;
    public final boolean m;
    public final az9 n;
    public final fv9 o;
    public final short p;
    public final short q;
    public final short r;
    public final cc3 s;
    public final short t;
    public final short u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final boolean z;

    static {
        String str = gcc.a;
        String c = jrd.c(Build.DEVICE);
        E = (c.contains("emulator") || c.contains("emu64a") || c.contains("emu64x") || c.contains("generic") || c.contains("vsoc")) ? (short) 30000 : (short) 10000;
        F = true;
    }

    public f64(Context context, mfb mfbVar, mfb mfbVar2) {
        b00 b00Var = new b00(context, (byte) 4);
        m40 m40Var = new m40((byte) 3);
        b00 b00Var2 = new b00(context, (byte) 5);
        p31 p31Var = new p31((byte) 6);
        context.getClass();
        this.a = context;
        this.c = mfbVar;
        this.d = mfbVar2;
        this.e = b00Var;
        this.f = m40Var;
        this.g = b00Var2;
        this.h = p31Var;
        this.i = gcc.z();
        this.k = oz.i;
        this.l = true;
        this.m = true;
        this.n = az9.f;
        this.p = (short) 5000;
        this.q = (short) 15000;
        this.r = (short) 3000;
        this.o = fv9.b;
        this.s = new cc3(gcc.T(20L), gcc.T(500L));
        this.b = vgb.a;
        this.t = (short) 500;
        this.u = (short) 2000;
        this.v = 600000;
        int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
        boolean z = F;
        this.w = z ? E : (short) 2147483647;
        this.x = z ? 60000 : i;
        this.y = 600000;
        this.z = true;
        this.B = "";
        this.j = -1000;
        new rj2();
        this.C = true;
        this.D = true;
    }

    public final s64 a() {
        yve.p(!this.A);
        this.A = true;
        return new s64(this);
    }

    public final void b(ec3 ec3Var) {
        yve.p(!this.A);
        this.f = new hc3(ec3Var, (byte) 1);
    }

    public f64(Context context) {
        this(context, new b00(context, (byte) 2), new b00(context, (byte) 3));
    }
}
