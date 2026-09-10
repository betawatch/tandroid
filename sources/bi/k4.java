package bi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class k4 extends View {
    public int a;
    public final /* synthetic */ p4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(p4 p4Var, Context context) {
        super(context);
        this.b = p4Var;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        p4 p4Var = this.b;
        x3 x3Var = p4Var.e;
        ArrayList arrayList = p4Var.b0;
        int size = View.MeasureSpec.getSize(i10);
        int i13 = this.a;
        if (i13 != -1) {
            setMeasuredDimension(size, i13);
            return;
        }
        if (p4Var.e0 == p4.j0) {
            i12 = arrayList.size();
        } else {
            ArrayList arrayList2 = p4Var.f0;
            if (arrayList2 != null) {
                i12 = (p4Var.d0 ? arrayList.size() : 0) + arrayList2.size() + (p4Var.c0 ? 1 : 0);
            } else {
                i12 = 0;
            }
        }
        setMeasuredDimension(size, Math.max(0, (AndroidUtilities.displaySize.y - AndroidUtilities.dp(62.0f)) - (((int) (((int) (size / x3Var.J)) * p4Var.O)) * ((int) Math.ceil(i12 / x3Var.J)))));
    }
}
