package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public class pu0 extends ia implements ci.o7 {
    public int e3;
    public int f3;

    public pu0(Context context) {
        super(context, null);
    }

    @Override // ci.o7
    public final void a(int[] iArr) {
        iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.e3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.f3;
    }
}
