// default package

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class h2 extends z1 {
    public static final /* synthetic */ xh4 c;
    public static final /* synthetic */ xh4 d;
    public int a;
    public int b;

    static {
        u84 u84Var = new u84(h2.class, "AbstractFullBox.java");
        c = u84Var.e(u84Var.d("setVersion", "com.googlecode.mp4parser.AbstractFullBox", "int", "version", "void"));
        d = u84Var.e(u84Var.d("setFlags", "com.googlecode.mp4parser.AbstractFullBox", "int", "flags", "void"));
    }

    @Override // z1
    public void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
    }

    public final int d() {
        if (!this.isParsed) {
            parseDetails();
        }
        return this.b;
    }

    public final int e() {
        if (!this.isParsed) {
            parseDetails();
        }
        return this.a;
    }

    public final void f(ByteBuffer byteBuffer) {
        this.a = zpe.i(byteBuffer);
        this.b = zpe.a(byteBuffer.get()) + (zpe.f(byteBuffer) << 8);
    }

    public final void g(int i) {
        bp1.r(u84.c(d, this, this, new Integer(i)));
        this.b = i;
    }

    @Override // z1
    public void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
    }

    public final void h() {
        bp1.r(u84.c(c, this, this, new Integer(1)));
        this.a = 1;
    }

    public final void i(ByteBuffer byteBuffer) {
        aqe.f(this.a, byteBuffer);
        aqe.e(this.b, byteBuffer);
    }
}
