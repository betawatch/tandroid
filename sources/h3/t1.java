package h3;

import java.io.IOException;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class t1 extends IOException {
    public final boolean a;
    public final int b;

    public t1(String str, Throwable th, boolean z10, int i10) {
        super(str, th);
        this.a = z10;
        this.b = i10;
    }

    public static t1 a(String str, Exception exc) {
        return new t1(str, exc, true, 1);
    }

    public static t1 b(String str, Exception exc) {
        return new t1(str, exc, true, 4);
    }

    public static t1 c(String str) {
        return new t1(str, null, false, 1);
    }
}
