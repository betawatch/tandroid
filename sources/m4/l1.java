package m4;

import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class l1 {
    public static final e9.a1 d = e9.i0.z(40010);
    public static final e9.a1 e;
    public static final String f;
    public static final String g;
    public static final String h;
    public final int a;
    public final String b;
    public final Bundle c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        e9.q.d(7, objArr);
        e = e9.i0.t(7, objArr);
        String str = e2.d0.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
    }

    public l1(int i10) {
        e2.d.a("commandCode shouldn't be COMMAND_CODE_CUSTOM", i10 != 0);
        this.a = i10;
        this.b = "";
        this.c = Bundle.EMPTY;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return this.a == l1Var.a && TextUtils.equals(this.b, l1Var.b);
    }

    public final int hashCode() {
        return Objects.hash(this.b, Integer.valueOf(this.a));
    }

    public l1(String str, Bundle bundle) {
        this.a = 0;
        this.b = str;
        bundle.getClass();
        this.c = new Bundle(bundle);
    }
}
