package kh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class s3 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new s3());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        f90 f90Var = (f90) view;
        f90Var.setGravity(i51Var.z);
        f90Var.setTextColor((int) i51Var.B);
        f90Var.setTextSize(1, i51Var.A);
        f90Var.setTypeface(i51Var.q ? AndroidUtilities.bold() : null);
        int i10 = i51Var.i;
        f90Var.setPadding(i10, 0, i10, i51Var.k);
        f90Var.setText(i51Var.l);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, rl0 rl0Var, int i10, int i11, f6 f6Var) {
        return new eg.b2(context, 1, null);
    }
}
