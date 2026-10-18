package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class x7 {
    public int a;
    public int b;
    public int[] c = null;
    public int d = 1;
    public Utilities.Callback2Return e;

    public final int a() {
        int[] iArr = this.c;
        return iArr != null ? iArr[iArr.length - 1] : this.b;
    }

    public final int b() {
        int[] iArr = this.c;
        return iArr != null ? iArr[0] : this.a;
    }
}
