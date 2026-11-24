// default package

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ld3 extends dia implements lab {
    public final String r;
    public final uab s;

    public ld3(String str, uab uabVar) {
        super(new qab[2], new rab[2]);
        this.r = str;
        q(1024);
        this.s = uabVar;
    }

    @Override // dia
    public final z83 f() {
        return new qab();
    }

    @Override // dia
    public final b93 g() {
        return new iia(this);
    }

    @Override // u83
    public final String getName() {
        return this.r;
    }

    @Override // dia
    public final x83 h(Throwable th) {
        return new mab("Unexpected decode error", th);
    }

    @Override // dia
    public final x83 i(z83 z83Var, b93 b93Var, boolean z) {
        qab qabVar = (qab) z83Var;
        rab rabVar = (rab) b93Var;
        try {
            ByteBuffer byteBuffer = qabVar.c;
            byteBuffer.getClass();
            byte[] array = byteBuffer.array();
            int limit = byteBuffer.limit();
            uab uabVar = this.s;
            if (z) {
                uabVar.reset();
            }
            kab f = uabVar.f(0, limit, array);
            long j = qabVar.e;
            long j2 = qabVar.r;
            rabVar.timeUs = j;
            rabVar.a = f;
            if (j2 != Long.MAX_VALUE) {
                j = j2;
            }
            rabVar.b = j;
            rabVar.shouldBeSkipped = false;
            return null;
        } catch (mab e) {
            return e;
        }
    }

    @Override // lab
    public final void b(long j) {
    }
}
