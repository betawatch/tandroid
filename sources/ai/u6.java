package ai;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.co0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class u6 extends co0 {
    public a1.f h;
    public final /* synthetic */ l7 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6(l7 l7Var, Context context, d dVar) {
        super(context, 13.0f, dVar);
        this.n = l7Var;
    }

    @Override // org.telegram.ui.Components.co0
    public final void a(String str) {
        a1.f fVar = this.h;
        if (fVar != null) {
            AndroidUtilities.cancelRunOnUIThread(fVar);
        }
        this.h = new a1.f(13, this, str);
        if (TextUtils.isEmpty(str)) {
            this.h.run();
        } else {
            AndroidUtilities.runOnUIThread(this.h, 300L);
        }
        if (this.h != null) {
            l7 l7Var = this.n;
            if (l7Var.Q) {
                return;
            }
            l7Var.Q = true;
            l7Var.w.E();
            l7Var.x.h1(0, -l7Var.r.getPaddingTop());
        }
    }
}
