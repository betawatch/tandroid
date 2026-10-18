package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public class ku0 extends ia implements ci.o7 {
    public int b3;
    public int c3;

    @Override // ci.o7
    public final void a(int[] iArr) {
        iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.b3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.c3;
    }
}
