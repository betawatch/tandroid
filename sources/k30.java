// default package

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class k30 {
    public final y79 a;
    public final ArrayList b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public boolean d;

    public k30(y79 y79Var) {
        this.a = y79Var;
        l30 l30Var = l30.e;
        this.d = false;
    }

    public final int a() {
        return this.c.length - 1;
    }

    public final boolean b() {
        return this.d && ((p30) this.b.get(a())).a() && !this.c[a()].hasRemaining();
    }

    public final boolean c() {
        return !this.b.isEmpty();
    }

    public final void d(ByteBuffer byteBuffer) {
        boolean z;
        for (boolean z2 = true; z2; z2 = z) {
            z = false;
            int i = 0;
            while (i <= a()) {
                if (!this.c[i].hasRemaining()) {
                    ArrayList arrayList = this.b;
                    p30 p30Var = (p30) arrayList.get(i);
                    if (!p30Var.a()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : p30.a;
                        long remaining = byteBuffer2.remaining();
                        p30Var.d(byteBuffer2);
                        this.c[i] = p30Var.b();
                        z |= remaining - ((long) byteBuffer2.remaining()) > 0 || this.c[i].hasRemaining();
                    } else if (!this.c[i].hasRemaining() && i < a()) {
                        ((p30) arrayList.get(i + 1)).f();
                    }
                }
                i++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k30) {
            y79 y79Var = ((k30) obj).a;
            y79 y79Var2 = this.a;
            if (y79Var2.d == y79Var.d) {
                for (int i = 0; i < y79Var2.d; i++) {
                    if (y79Var2.get(i) == y79Var.get(i)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
