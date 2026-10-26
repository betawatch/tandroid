package b2;

import android.os.Bundle;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class z0 extends Exception {
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
        String str = e2.n0.a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
        n = Integer.toString(4, 36);
        r = Integer.toString(5, 36);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(String str, Throwable th2, int i10, long j10) {
        super(str, th2);
        Bundle bundle = Bundle.EMPTY;
        this.a = i10;
        this.c = bundle;
        this.b = j10;
    }
}
