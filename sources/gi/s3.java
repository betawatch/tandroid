package gi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.t61;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class s3 extends f61 {
    public static final /* synthetic */ int a = 0;

    static {
        f61.setup(new s3());
    }

    @Override // org.telegram.ui.Components.f61
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        t3 t3Var = (t3) view;
        CharSequence charSequence = g61Var.l;
        CharSequence charSequence2 = g61Var.m;
        t3Var.setText(charSequence);
        t3Var.r.setText(charSequence2);
    }

    @Override // org.telegram.ui.Components.f61
    public final View createView(Context context, im0 im0Var, int i10, int i11, d6 d6Var) {
        return new t3(context, d6Var);
    }

    @Override // org.telegram.ui.Components.f61
    public final boolean isClickable() {
        return false;
    }
}
