package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class iq0 extends org.telegram.ui.Components.b10 {
    public final /* synthetic */ int U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iq0(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.U = i10;
    }

    @Override // org.telegram.ui.Components.b10
    public int getColumnsCount() {
        switch (this.U) {
            case 0:
                return 3;
            default:
                return super.getColumnsCount();
        }
    }

    @Override // org.telegram.ui.Components.b10
    public int getViewType() {
        switch (this.U) {
            case 0:
                return 2;
            default:
                return super.getViewType();
        }
    }

    @Override // org.telegram.ui.Components.b10, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.U) {
            case 1:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(104.0f));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }
}
