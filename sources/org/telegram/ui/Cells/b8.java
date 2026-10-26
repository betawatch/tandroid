package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class b8 {
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
