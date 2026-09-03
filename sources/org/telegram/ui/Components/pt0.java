package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class pt0 extends aa implements nh.a7 {
    public int a3;
    public int b3;

    @Override // nh.a7
    public final void a(int[] iArr) {
        iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.a3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.b3;
    }
}
