// default package

import java.util.Locale;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class fo3 {
    public final String a;
    public final float b;
    public final boolean c;

    public fo3(String str, float f, boolean z) {
        this.a = str;
        this.b = f;
        this.c = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(String.format(Locale.US, " %.2f", Float.valueOf(this.b)));
        sb.append(this.c ? " sure" : "");
        return sb.toString();
    }
}
