package j$.util.stream;

import java.util.function.Consumer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes4.dex */
public final class s extends e5 {
    public final /* synthetic */ byte l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(f5 f5Var, Consumer consumer) {
        super(f5Var, 0);
        this.l = (byte) 3;
        this.m = consumer;
    }

    @Override // j$.util.stream.a
    public final n5 M(int i, n5 n5Var) {
        switch (this.l) {
            case 0:
                return new p(this, n5Var, (byte) 0);
            case 1:
                return new v0(this, n5Var, (byte) 0);
            case 2:
                return new e1(this, n5Var, (byte) 0);
            case 3:
                return new a5(this, n5Var, (byte) 0);
            case 4:
                return new a5(this, n5Var, (byte) 1);
            case 5:
                return new a5(this, n5Var, (byte) 2);
            default:
                return new m(this, n5Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(a aVar, int i, Object obj, byte b) {
        super(aVar, i);
        this.l = b;
        this.m = obj;
    }
}
