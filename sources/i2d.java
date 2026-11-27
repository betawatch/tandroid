// default package

import android.os.Build;
import android.view.View;
import j$.util.Objects;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class i2d {
    public static final l2d b;
    public final l2d a;

    static {
        int i = Build.VERSION.SDK_INT;
        b = (i >= 34 ? new a2d() : i >= 30 ? new z1d() : i >= 29 ? new y1d() : new x1d()).b().a.a().a.b().a.c();
    }

    public i2d(l2d l2dVar) {
        this.a = l2dVar;
    }

    public l2d a() {
        return this.a;
    }

    public l2d b() {
        return this.a;
    }

    public l2d c() {
        return this.a;
    }

    public cp3 e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2d)) {
            return false;
        }
        i2d i2dVar = (i2d) obj;
        return o() == i2dVar.o() && n() == i2dVar.n() && Objects.equals(k(), i2dVar.k()) && Objects.equals(i(), i2dVar.i()) && Objects.equals(e(), i2dVar.e());
    }

    public mq5 f(int i) {
        return mq5.e;
    }

    public mq5 g(int i) {
        if ((i & 8) == 0) {
            return mq5.e;
        }
        lq5.j("Unable to query the maximum insets for IME");
        return null;
    }

    public mq5 h() {
        return k();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), e());
    }

    public mq5 i() {
        return mq5.e;
    }

    public mq5 j() {
        return k();
    }

    public mq5 k() {
        return mq5.e;
    }

    public mq5 l() {
        return k();
    }

    public l2d m(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean n() {
        return false;
    }

    public boolean o() {
        return false;
    }

    public boolean p(int i) {
        return true;
    }

    public void d(View view) {
    }

    public void q(mq5[] mq5VarArr) {
    }

    public void r(l2d l2dVar) {
    }

    public void s(mq5 mq5Var) {
    }

    public void t(int i) {
    }
}
