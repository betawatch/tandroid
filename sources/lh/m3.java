package lh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class m3 extends View {
    public int a;
    public final /* synthetic */ p3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(p3 p3Var, Context context) {
        super(context);
        this.b = p3Var;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        p3 p3Var = this.b;
        z2 z2Var = p3Var.e;
        ArrayList arrayList = p3Var.U;
        int size = View.MeasureSpec.getSize(i10);
        int i13 = this.a;
        if (i13 != -1) {
            setMeasuredDimension(size, i13);
            return;
        }
        if (p3Var.a0 == p3.f0) {
            i12 = arrayList.size();
        } else {
            ArrayList arrayList2 = p3Var.b0;
            if (arrayList2 != null) {
                i12 = (p3Var.W ? arrayList.size() : 0) + arrayList2.size() + (p3Var.V ? 1 : 0);
            } else {
                i12 = 0;
            }
        }
        setMeasuredDimension(size, Math.max(0, (AndroidUtilities.displaySize.y - AndroidUtilities.dp(62.0f)) - (((int) (((int) (size / z2Var.J)) * p3Var.K)) * ((int) Math.ceil(i12 / z2Var.J)))));
    }
}
