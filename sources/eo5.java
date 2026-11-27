// default package

import java.util.Set;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class eo5 extends lp {
    public final i99 D() {
        if (this.b == 0) {
            return i99.r;
        }
        return new i99(this.b, (Object[]) this.c);
    }

    public final void F(t1c t1cVar, String str) {
        super.x(t1cVar, str);
    }

    public final void G(Set set) {
        super.y(set);
    }

    @Override // lp
    public final to5 e() {
        throw new UnsupportedOperationException("Not supported for bimaps");
    }

    @Override // lp
    public final lp x(Object obj, Object obj2) {
        super.x(obj, obj2);
        return this;
    }

    @Override // lp
    public final lp y(Set set) {
        super.y(set);
        return this;
    }
}
