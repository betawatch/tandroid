package nh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class k3 extends View {
    public int a;
    public final /* synthetic */ n3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(n3 n3Var, Context context) {
        super(context);
        this.b = n3Var;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        n3 n3Var = this.b;
        x2 x2Var = n3Var.e;
        ArrayList arrayList = n3Var.U;
        int size = View.MeasureSpec.getSize(i10);
        int i13 = this.a;
        if (i13 != -1) {
            setMeasuredDimension(size, i13);
            return;
        }
        if (n3Var.a0 == n3.f0) {
            i12 = arrayList.size();
        } else {
            ArrayList arrayList2 = n3Var.b0;
            if (arrayList2 != null) {
                i12 = (n3Var.W ? arrayList.size() : 0) + arrayList2.size() + (n3Var.V ? 1 : 0);
            } else {
                i12 = 0;
            }
        }
        setMeasuredDimension(size, Math.max(0, (AndroidUtilities.displaySize.y - AndroidUtilities.dp(62.0f)) - (((int) (((int) (size / x2Var.J)) * n3Var.K)) * ((int) Math.ceil(i12 / x2Var.J)))));
    }
}
