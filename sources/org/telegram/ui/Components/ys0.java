package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class ys0 extends y9 implements jh.z6 {
    public int Z2;
    public int a3;

    @Override // jh.z6
    public final void a(int[] iArr) {
        iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.Z2;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.a3;
    }
}
