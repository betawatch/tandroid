package ai;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jn0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class t6 extends jn0 {
    public a1.e h;
    public final /* synthetic */ j7 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(j7 j7Var, Context context, d dVar) {
        super(context, 13.0f, dVar);
        this.n = j7Var;
    }

    @Override // org.telegram.ui.Components.jn0
    public final void a(String str) {
        a1.e eVar = this.h;
        if (eVar != null) {
            AndroidUtilities.cancelRunOnUIThread(eVar);
        }
        this.h = new a1.e(13, this, str);
        if (TextUtils.isEmpty(str)) {
            this.h.run();
        } else {
            AndroidUtilities.runOnUIThread(this.h, 300L);
        }
        if (this.h != null) {
            j7 j7Var = this.n;
            if (j7Var.Q) {
                return;
            }
            j7Var.Q = true;
            j7Var.w.E();
            j7Var.x.h1(0, -j7Var.r.getPaddingTop());
        }
    }
}
