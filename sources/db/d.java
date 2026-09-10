package db;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class d extends u {
    public final /* synthetic */ int a;

    @Override // db.u
    public final Object read(lb.a aVar) {
        switch (this.a) {
            case 0:
                if (aVar.x() != 9) {
                    return Double.valueOf(aVar.o());
                }
                aVar.t();
                return null;
            case 1:
                if (aVar.x() != 9) {
                    return Float.valueOf((float) aVar.o());
                }
                aVar.t();
                return null;
            default:
                aVar.C();
                return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "AnonymousOrNonStaticLocalClassAdapter";
            default:
                return super.toString();
        }
    }

    @Override // db.u
    public final void write(lb.b bVar, Object obj) {
        switch (this.a) {
            case 0:
                Number number = (Number) obj;
                if (number != null) {
                    double doubleValue = number.doubleValue();
                    g.a(doubleValue);
                    bVar.n(doubleValue);
                    break;
                } else {
                    bVar.i();
                    break;
                }
            case 1:
                Number number2 = (Number) obj;
                if (number2 != null) {
                    float floatValue = number2.floatValue();
                    g.a(floatValue);
                    if (!(number2 instanceof Float)) {
                        number2 = Float.valueOf(floatValue);
                    }
                    bVar.q(number2);
                    break;
                } else {
                    bVar.i();
                    break;
                }
            default:
                bVar.i();
                break;
        }
    }
}
