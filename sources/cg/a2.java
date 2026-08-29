package cg;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.jv;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class a2 extends jv {
    public final /* synthetic */ f2 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(f2 f2Var, z1 z1Var, Context context, c6 c6Var, ArrayList arrayList) {
        super(z1Var, context, c6Var, arrayList);
        this.S = f2Var;
    }

    @Override // org.telegram.ui.Components.jv
    public final void Y() {
        this.S.dismiss();
    }
}
