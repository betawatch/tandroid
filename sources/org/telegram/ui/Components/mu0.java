package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public class mu0 extends ia implements ci.p7 {
    public int b3;
    public int c3;

    @Override // ci.p7
    public final void a(int[] iArr) {
        iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.b3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.c3;
    }
}
