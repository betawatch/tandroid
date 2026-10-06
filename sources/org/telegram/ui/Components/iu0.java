package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public class iu0 extends ja implements ai.s9 {
    public int k3;
    public int l3;

    @Override // ai.s9
    public final void a(int[] iArr) {
        iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.k3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.l3;
    }
}
