package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class x4 extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ o5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x4(o5 o5Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = o5Var;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                o5 o5Var = this.b;
                o5Var.Y.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, size - AndroidUtilities.dp(24.0f)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(size, AndroidUtilities.dp(36.0f) + o5Var.Y.getMeasuredHeight());
                break;
            default:
                o5 o5Var2 = this.b;
                o5Var2.d.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(View.MeasureSpec.getSize(i10), o5Var2.d.getMeasuredHeight());
                break;
        }
    }
}
