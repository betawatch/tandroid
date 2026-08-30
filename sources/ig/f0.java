package ig;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.a9;
import org.telegram.ui.Components.nq;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class f0 extends a9 {
    public final f6 v;

    public f0(Context context, f6 f6Var) {
        super(context, f6Var);
        this.v = f6Var;
    }

    public void setBackground(boolean z4) {
        Context context = getContext();
        int i10 = z4 ? R.drawable.greydivider_bottom : R.drawable.greydivider;
        int i11 = j6.b7;
        f6 f6Var = this.v;
        nq nqVar = new nq(new ColorDrawable(j6.v0(j6.a7, f6Var)), j6.U0(context, i10, j6.v0(i11, f6Var)), 0, 0);
        nqVar.w = true;
        setBackground(nqVar);
    }
}
