package org.telegram.messenger;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m6 {
    public final String a;
    public final String b;

    public /* synthetic */ m6(String str, String str2, boolean z10) {
        this.a = str;
        this.b = str2;
    }

    public m6(String str, String str2) {
        Object[] objArr = {str, 23};
        if (!(str.length() <= 23)) {
            throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
        }
        this.a = str;
        this.b = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
