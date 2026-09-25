package ci;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class s3 extends View {
    public int a;
    public final /* synthetic */ w3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(w3 w3Var, Context context) {
        super(context);
        this.b = w3Var;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        w3 w3Var = this.b;
        f3 f3Var = w3Var.e;
        ArrayList arrayList = w3Var.b0;
        int size = View.MeasureSpec.getSize(i10);
        int i13 = this.a;
        if (i13 != -1) {
            setMeasuredDimension(size, i13);
            return;
        }
        if (w3Var.e0 == w3.j0) {
            i12 = arrayList.size();
        } else {
            ArrayList arrayList2 = w3Var.f0;
            if (arrayList2 != null) {
                i12 = (w3Var.d0 ? arrayList.size() : 0) + arrayList2.size() + (w3Var.c0 ? 1 : 0);
            } else {
                i12 = 0;
            }
        }
        setMeasuredDimension(size, Math.max(0, (AndroidUtilities.displaySize.y - AndroidUtilities.dp(62.0f)) - (((int) (((int) (size / f3Var.J)) * w3Var.O)) * ((int) Math.ceil(i12 / f3Var.J)))));
    }
}
