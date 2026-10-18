package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public class ku0 extends ia implements ci.p7 {
    public int b3;
    public int c3;

    @Override // ci.p7
    public final void a(int[] iArr) {
        iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.b3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.c3;
    }
}
