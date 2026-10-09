package ci;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class r3 extends View {
    public int a;
    public final /* synthetic */ v3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(v3 v3Var, Context context) {
        super(context);
        this.b = v3Var;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        v3 v3Var = this.b;
        e3 e3Var = v3Var.e;
        ArrayList arrayList = v3Var.b0;
        int size = View.MeasureSpec.getSize(i10);
        int i13 = this.a;
        if (i13 != -1) {
            setMeasuredDimension(size, i13);
            return;
        }
        if (v3Var.e0 == v3.j0) {
            i12 = arrayList.size();
        } else {
            ArrayList arrayList2 = v3Var.f0;
            if (arrayList2 != null) {
                i12 = (v3Var.d0 ? arrayList.size() : 0) + arrayList2.size() + (v3Var.c0 ? 1 : 0);
            } else {
                i12 = 0;
            }
        }
        setMeasuredDimension(size, Math.max(0, (AndroidUtilities.displaySize.y - AndroidUtilities.dp(62.0f)) - (((int) (((int) (size / e3Var.J)) * v3Var.O)) * ((int) Math.ceil(i12 / e3Var.J)))));
    }
}
