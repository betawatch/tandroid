package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public class cu0 extends ia implements ai.s9 {
    public int d3;
    public int e3;

    @Override // ai.s9
    public final void a(int[] iArr) {
        iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.d3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.e3;
    }
}
