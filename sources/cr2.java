// default package

import android.view.View;
import java.util.HashMap;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class cr2 {
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

    public final void q(qr2 qr2Var, fr2 fr2Var) {
        String str = (String) this.c;
        if (str != null && !str.isEmpty()) {
            fr2Var.b = (String) this.c;
        }
        HashMap hashMap = qr2Var.a;
        String str2 = fr2Var.a;
        if (hashMap.containsKey(str2)) {
            sc8.j(b00.h("Config key registered twice: ", str2));
        } else if (qr2Var.b.add(fr2Var.e())) {
            hashMap.put(str2, fr2Var);
        } else {
            wn4.p(fr2Var.e(), "Config storage key used twice: ");
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
        sc8.j("Config key without a name");
        return null;
    }

    public final void t(String str) {
        this.c = str;
    }
}
