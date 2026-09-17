package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
