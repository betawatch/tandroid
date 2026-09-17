package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public class pt0 extends ia implements bi.b9 {
    public int d3;
    public int e3;

    @Override // bi.b9
    public final void a(int[] iArr) {
        iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.d3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.e3;
    }
}
