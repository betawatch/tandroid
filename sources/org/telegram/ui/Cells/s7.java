package org.telegram.ui.Cells;

import org.telegram.messenger.w10;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class s7 {
    public int a;
    public int b;
    public int[] c = null;
    public int d = 1;
    public w10 e;

    public final int a() {
        int[] iArr = this.c;
        return iArr != null ? iArr[iArr.length - 1] : this.b;
    }

    public final int b() {
        int[] iArr = this.c;
        return iArr != null ? iArr[0] : this.a;
    }
}
