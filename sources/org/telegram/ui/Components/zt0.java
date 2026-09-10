package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public class zt0 extends ha implements zh.q5 {
    public int d3;
    public int e3;

    @Override // zh.q5
    public final void a(int[] iArr) {
        iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.d3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.e3;
    }
}
