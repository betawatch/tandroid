package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class ht0 extends fa implements lh.z6 {
    public int Z2;
    public int a3;

    @Override // lh.z6
    public final void a(int[] iArr) {
        iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.Z2;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.a3;
    }
}
