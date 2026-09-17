package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class y7 {
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
