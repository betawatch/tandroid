// default package

import android.content.Context;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class cx3 extends qx3 {
    public final /* synthetic */ qx3 Q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx3(qx3 qx3Var, d dVar, Context context, wjb wjbVar, ArrayList arrayList) {
        super(dVar, context, wjbVar, arrayList);
        this.Q1 = qx3Var;
    }

    @Override // qx3
    public final void G0() {
        this.Q1.dismiss();
    }
}
