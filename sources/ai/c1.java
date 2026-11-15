package ai;

import java.util.Locale;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class c1 {
    public final String a;
    public final float b;
    public final boolean c;

    public c1(String str, float f10, boolean z10) {
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
