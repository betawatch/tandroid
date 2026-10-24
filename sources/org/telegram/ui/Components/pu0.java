package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
