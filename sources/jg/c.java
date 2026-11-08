package jg;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.p5;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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

    public c(boolean z9, boolean z10) {
        this.d = z9;
        this.e = z10;
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
            p5 p5Var = Utilities.g;
            a aVar = new a((s0) this, str, 0);
            this.r = aVar;
            p5Var.d(aVar, 400L);
        }
    }
}
