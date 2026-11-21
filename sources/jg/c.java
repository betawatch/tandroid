package jg;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.q5;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public abstract class c extends rg.b {
    public final boolean d;
    public final boolean e;
    public final ArrayList f = new ArrayList();
    public String h;
    public b n;
    public a r;
    public int s;
    public boolean w;

    public c(boolean z10, boolean z11) {
        this.d = z10;
        this.e = z11;
    }

    public final void F() {
        if (this.r != null) {
            Utilities.g.a(this.r);
            this.r = null;
        }
        this.s++;
    }

    public final void G(String str) {
        F();
        if (TextUtils.isEmpty(str)) {
            this.f.clear();
            this.w = false;
            f();
        } else {
            this.w = true;
            q5 q5Var = Utilities.g;
            a aVar = new a((s0) this, str, 0);
            this.r = aVar;
            q5Var.d(aVar, 400L);
        }
    }
}
