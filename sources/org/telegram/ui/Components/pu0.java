package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public class pu0 extends ka implements bi.e9 {
    public int b3;
    public int c3;

    @Override // bi.e9
    public final void a(int[] iArr) {
        iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.b3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.c3;
    }
}
