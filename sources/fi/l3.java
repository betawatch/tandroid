package fi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class l3 extends View {
    public int a;
    public final /* synthetic */ o3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(o3 o3Var, Context context) {
        super(context);
        this.b = o3Var;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        o3 o3Var = this.b;
        y2 y2Var = o3Var.e;
        ArrayList arrayList = o3Var.b0;
        int size = View.MeasureSpec.getSize(i10);
        int i13 = this.a;
        if (i13 != -1) {
            setMeasuredDimension(size, i13);
            return;
        }
        if (o3Var.e0 == o3.j0) {
            i12 = arrayList.size();
        } else {
            ArrayList arrayList2 = o3Var.f0;
            if (arrayList2 != null) {
                i12 = (o3Var.d0 ? arrayList.size() : 0) + arrayList2.size() + (o3Var.c0 ? 1 : 0);
            } else {
                i12 = 0;
            }
        }
        setMeasuredDimension(size, Math.max(0, (AndroidUtilities.displaySize.y - AndroidUtilities.dp(62.0f)) - (((int) (((int) (size / y2Var.J)) * o3Var.O)) * ((int) Math.ceil(i12 / y2Var.J)))));
    }
}
