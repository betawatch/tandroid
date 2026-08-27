package ag;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.cv;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class s2 extends cv {
    public final /* synthetic */ y2 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(y2 y2Var, r2 r2Var, Context context, c6 c6Var, ArrayList arrayList) {
        super(r2Var, context, c6Var, arrayList);
        this.S = y2Var;
    }

    @Override // org.telegram.ui.Components.cv
    public final void Y() {
        this.S.dismiss();
    }
}
