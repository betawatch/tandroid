package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
