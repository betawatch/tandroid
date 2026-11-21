package ai;

import java.util.Locale;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class f1 {
    public final String a;
    public final float b;
    public final boolean c;

    public f1(String str, float f10, boolean z10) {
        this.a = str;
        this.b = f10;
        this.c = z10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.a);
        sb2.append(String.format(Locale.US, " %.2f", Float.valueOf(this.b)));
        sb2.append(this.c ? " sure" : "");
        return sb2.toString();
    }
}
