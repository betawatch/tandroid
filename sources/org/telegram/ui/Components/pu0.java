package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
