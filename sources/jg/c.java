package jg;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.p5;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
