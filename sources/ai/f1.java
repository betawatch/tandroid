package ai;

import java.util.Locale;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
