package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public class qt0 extends aa implements oh.a7 {
    public int a3;
    public int b3;

    @Override // oh.a7
    public final void a(int[] iArr) {
        iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.a3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.b3;
    }
}
