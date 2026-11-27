// default package

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ee3 extends yla implements ieb {
    public final String r;
    public final reb s;

    public ee3(String str, reb rebVar) {
        super(new neb[2], new oeb[2]);
        this.r = str;
        q(1024);
        this.s = rebVar;
    }

    @Override // yla
    public final s93 f() {
        return new neb();
    }

    @Override // yla
    public final u93 g() {
        return new dma(this);
    }

    @Override // n93
    public final String getName() {
        return this.r;
    }

    @Override // yla
    public final q93 h(Throwable th) {
        return new jeb("Unexpected decode error", th);
    }

    @Override // yla
    public final q93 i(s93 s93Var, u93 u93Var, boolean z) {
        neb nebVar = (neb) s93Var;
        oeb oebVar = (oeb) u93Var;
        try {
            ByteBuffer byteBuffer = nebVar.c;
            byteBuffer.getClass();
            byte[] array = byteBuffer.array();
            int limit = byteBuffer.limit();
            reb rebVar = this.s;
            if (z) {
                rebVar.reset();
            }
            heb j = rebVar.j(0, limit, array);
            long j2 = nebVar.e;
            long j3 = nebVar.r;
            oebVar.timeUs = j2;
            oebVar.a = j;
            if (j3 != Long.MAX_VALUE) {
                j2 = j3;
            }
            oebVar.b = j2;
            oebVar.shouldBeSkipped = false;
            return null;
        } catch (jeb e) {
            return e;
        }
    }

    @Override // ieb
    public final void b(long j) {
    }
}
