package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public class lu0 extends ia implements ci.p7 {
    public int b3;
    public int c3;

    @Override // ci.p7
    public final void a(int[] iArr) {
        iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.b3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.c3;
    }
}
