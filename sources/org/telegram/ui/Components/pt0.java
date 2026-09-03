package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public class pt0 extends aa implements oh.a7 {
    public int a3;
    public int b3;

    @Override // oh.a7
    public final void a(int[] iArr) {
        iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.a3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.b3;
    }
}
