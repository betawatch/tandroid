package di;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.do0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class d5 extends do0 {
    public b4 f;
    public final /* synthetic */ t5 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(t5 t5Var, Context context, b bVar) {
        super(context, 13.0f, bVar);
        this.h = t5Var;
    }

    @Override // org.telegram.ui.Components.do0
    public final void a(String str) {
        b4 b4Var = this.f;
        if (b4Var != null) {
            AndroidUtilities.cancelRunOnUIThread(b4Var);
        }
        this.f = new b4(1, this, str);
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
