package e2;

import android.os.Bundle;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public abstract class v0 extends Exception {
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
        String str = h2.l0.a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
        n = Integer.toString(4, 36);
        r = Integer.toString(5, 36);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(String str, Throwable th2, int i7, long j3) {
        super(str, th2);
        Bundle bundle = Bundle.EMPTY;
        this.a = i7;
        this.c = bundle;
        this.b = j3;
    }
}
