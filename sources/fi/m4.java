package fi;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.ui.Components.tl0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class m4 extends tl0 {
    public l4 f;
    public final /* synthetic */ b5 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(b5 b5Var, Context context, b bVar) {
        super(context, 13.0f, bVar);
        this.h = b5Var;
    }

    @Override // org.telegram.ui.Components.tl0
    public final void a(String str) {
        l4 l4Var = this.f;
        if (l4Var != null) {
            org.telegram.messenger.g0.r(l4Var);
        }
        this.f = new l4(0, this, str);
        if (TextUtils.isEmpty(str)) {
            this.f.run();
        } else {
            org.telegram.messenger.g0.h3(this.f, 300L);
        }
        if (this.f != null) {
            b5 b5Var = this.h;
            if (b5Var.R) {
                return;
            }
            b5Var.R = true;
            b5Var.x.E();
            b5Var.y.h1(0, -b5Var.r.getPaddingTop());
        }
    }
}
