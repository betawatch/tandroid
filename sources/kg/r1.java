package kg;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.cv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class r1 extends cv {
    public final /* synthetic */ v1 N1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(v1 v1Var, q1 q1Var, Context context, p6 p6Var, ArrayList arrayList) {
        super(q1Var, context, p6Var, arrayList);
        this.N1 = v1Var;
    }

    @Override // org.telegram.ui.Components.cv
    public final void L0() {
        this.N1.dismiss();
    }
}
