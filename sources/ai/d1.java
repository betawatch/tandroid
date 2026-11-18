package ai;

import java.util.Locale;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class d1 {
    public final String a;
    public final float b;
    public final boolean c;

    public d1(String str, float f10, boolean z10) {
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
