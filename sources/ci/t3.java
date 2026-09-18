package ci;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final class t3 extends View {
    public int a;
    public final /* synthetic */ x3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(x3 x3Var, Context context) {
        super(context);
        this.b = x3Var;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        x3 x3Var = this.b;
        g3 g3Var = x3Var.e;
        ArrayList arrayList = x3Var.b0;
        int size = View.MeasureSpec.getSize(i10);
        int i13 = this.a;
        if (i13 != -1) {
            setMeasuredDimension(size, i13);
            return;
        }
        if (x3Var.e0 == x3.j0) {
            i12 = arrayList.size();
        } else {
            ArrayList arrayList2 = x3Var.f0;
            if (arrayList2 != null) {
                i12 = (x3Var.d0 ? arrayList.size() : 0) + arrayList2.size() + (x3Var.c0 ? 1 : 0);
            } else {
                i12 = 0;
            }
        }
        setMeasuredDimension(size, Math.max(0, (AndroidUtilities.displaySize.y - AndroidUtilities.dp(62.0f)) - (((int) (((int) (size / g3Var.J)) * x3Var.O)) * ((int) Math.ceil(i12 / g3Var.J)))));
    }
}
