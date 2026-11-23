package ai;

import java.util.Locale;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class a1 {
    public final String a;
    public final float b;
    public final boolean c;

    public a1(String str, float f10, boolean z10) {
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
