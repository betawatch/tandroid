package j$.util.function;

import java.util.function.Function;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function b;
    public final /* synthetic */ Function c;

    public /* synthetic */ d(Function function, Function function2, byte b) {
        this.a = b;
        this.b = function;
        this.c = function2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        switch (this.a) {
        }
        return Function$-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return this.c.apply(this.b.apply(obj));
            default:
                return this.b.apply(this.c.apply(obj));
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
        }
        return Function$-CC.$default$compose(this, function);
    }
}
