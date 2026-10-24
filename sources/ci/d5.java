package ci;

import ai.qa;
import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.yn0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class d5 extends yn0 {
    public qa f;
    public final /* synthetic */ t5 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(t5 t5Var, Context context, b bVar) {
        super(context, 13.0f, bVar);
        this.h = t5Var;
    }

    @Override // org.telegram.ui.Components.yn0
    public final void a(String str) {
        qa qaVar = this.f;
        if (qaVar != null) {
            AndroidUtilities.cancelRunOnUIThread(qaVar);
        }
        this.f = new qa(17, this, str);
        if (TextUtils.isEmpty(str)) {
            this.f.run();
        } else {
            AndroidUtilities.runOnUIThread(this.f, 300L);
        }
        if (this.f != null) {
            t5 t5Var = this.h;
            if (t5Var.Q) {
                return;
            }
            t5Var.Q = true;
            t5Var.w.E();
            t5Var.x.h1(0, -t5Var.r.getPaddingTop());
        }
    }
}
