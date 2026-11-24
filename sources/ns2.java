// default package

import android.view.View;
import java.util.HashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class ns2 {
    public int a = 1;
    public Object b;
    public Object c;

    public abstract int a(View view);

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l(View view);

    public abstract int m(View view);

    public final void n() {
        this.a = 2;
    }

    public final void o(String str) {
        this.b = str;
    }

    public abstract void p(int i);

    public final void q(bt2 bt2Var, qs2 qs2Var) {
        String str = (String) this.c;
        if (str != null && !str.isEmpty()) {
            qs2Var.b = (String) this.c;
        }
        HashMap hashMap = bt2Var.a;
        String str2 = qs2Var.a;
        if (hashMap.containsKey(str2)) {
            dq9.m(b10.h("Config key registered twice: ", str2));
        } else if (bt2Var.b.add(qs2Var.e())) {
            hashMap.put(str2, qs2Var);
        } else {
            zo4.r(qs2Var.e(), "Config storage key used twice: ");
        }
    }

    public final void r(boolean z, Number number) {
        if (z) {
            return;
        }
        throw new IllegalStateException("Config key " + s() + ": default " + number + " is outside its range");
    }

    public final String s() {
        String str = (String) this.b;
        if (str != null && !str.isEmpty()) {
            return (String) this.b;
        }
        dq9.m("Config key without a name");
        return null;
    }

    public final void t(String str) {
        this.c = str;
    }
}
