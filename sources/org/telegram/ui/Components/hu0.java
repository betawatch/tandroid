package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public class hu0 extends ja implements ai.s9 {
    public int k3;
    public int l3;

    @Override // ai.s9
    public final void a(int[] iArr) {
        iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.k3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.l3;
    }
}
