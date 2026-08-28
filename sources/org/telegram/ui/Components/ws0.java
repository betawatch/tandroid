package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class ws0 extends aa implements ih.c7 {
    public int Z2;
    public int a3;

    @Override // ih.c7
    public final void a(int[] iArr) {
        iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.Z2;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.a3;
    }
}
