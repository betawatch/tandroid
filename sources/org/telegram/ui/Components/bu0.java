package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public class bu0 extends ia implements ai.s9 {
    public int d3;
    public int e3;

    @Override // ai.s9
    public final void a(int[] iArr) {
        iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.d3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.e3;
    }
}
