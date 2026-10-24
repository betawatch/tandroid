package b2;

import android.os.Bundle;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public abstract class y0 extends Exception {
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String h;
    public static final String n;
    public static final String r;
    public final int a;
    public final long b;
    public final Bundle c;

    static {
        String str = e2.m0.a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
        n = Integer.toString(4, 36);
        r = Integer.toString(5, 36);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(String str, Throwable th2, int i10, long j10) {
        super(str, th2);
        Bundle bundle = Bundle.EMPTY;
        this.a = i10;
        this.c = bundle;
        this.b = j10;
    }
}
