package m4;

import android.os.Bundle;
import android.text.TextUtils;
import e9.x1;
import j$.util.Objects;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class p1 {
    public static final x1 d = e9.n0.y(40010);
    public static final x1 e;
    public static final String f;
    public static final String g;
    public static final String h;
    public final int a;
    public final String b;
    public final Bundle c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        e9.s.d(7, objArr);
        e = e9.n0.s(7, objArr);
        String str = e2.l0.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
    }

    public p1(int i10) {
        t6.e("commandCode shouldn't be COMMAND_CODE_CUSTOM", i10 != 0);
        this.a = i10;
        this.b = "";
        this.c = Bundle.EMPTY;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(f, this.a);
        bundle.putString(g, this.b);
        bundle.putBundle(h, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return this.a == p1Var.a && TextUtils.equals(this.b, p1Var.b);
    }

    public final int hashCode() {
        return Objects.hash(this.b, Integer.valueOf(this.a));
    }

    public p1(String str, Bundle bundle) {
        this.a = 0;
        str.getClass();
        this.b = str;
        bundle.getClass();
        this.c = new Bundle(bundle);
    }
}
