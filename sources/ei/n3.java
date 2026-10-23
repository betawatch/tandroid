package ei;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final class n3 extends View {
    public int a;
    public final /* synthetic */ q3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(q3 q3Var, Context context) {
        super(context);
        this.b = q3Var;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        q3 q3Var = this.b;
        a3 a3Var = q3Var.e;
        ArrayList arrayList = q3Var.b0;
        int size = View.MeasureSpec.getSize(i10);
        int i13 = this.a;
        if (i13 != -1) {
            setMeasuredDimension(size, i13);
            return;
        }
        if (q3Var.e0 == q3.j0) {
            i12 = arrayList.size();
        } else {
            ArrayList arrayList2 = q3Var.f0;
            if (arrayList2 != null) {
                i12 = (q3Var.d0 ? arrayList.size() : 0) + arrayList2.size() + (q3Var.c0 ? 1 : 0);
            } else {
                i12 = 0;
            }
        }
        setMeasuredDimension(size, Math.max(0, (AndroidUtilities.displaySize.y - AndroidUtilities.dp(62.0f)) - (((int) (((int) (size / a3Var.J)) * q3Var.O)) * ((int) Math.ceil(i12 / a3Var.J)))));
    }
}
