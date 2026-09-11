package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public class pt0 extends ia implements bi.b9 {
    public int d3;
    public int e3;

    @Override // bi.b9
    public final void a(int[] iArr) {
        iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.d3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.e3;
    }
}
