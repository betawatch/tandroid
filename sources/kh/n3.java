package kh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
    public final void onMeasure(int i9, int i10) {
        int i11;
        q3 q3Var = this.b;
        a3 a3Var = q3Var.e;
        ArrayList arrayList = q3Var.U;
        int size = View.MeasureSpec.getSize(i9);
        int i12 = this.a;
        if (i12 != -1) {
            setMeasuredDimension(size, i12);
            return;
        }
        if (q3Var.a0 == q3.f0) {
            i11 = arrayList.size();
        } else {
            ArrayList arrayList2 = q3Var.b0;
            if (arrayList2 != null) {
                i11 = (q3Var.W ? arrayList.size() : 0) + arrayList2.size() + (q3Var.V ? 1 : 0);
            } else {
                i11 = 0;
            }
        }
        setMeasuredDimension(size, Math.max(0, (AndroidUtilities.displaySize.y - AndroidUtilities.dp(62.0f)) - (((int) (((int) (size / a3Var.J)) * q3Var.K)) * ((int) Math.ceil(i11 / a3Var.J)))));
    }
}
