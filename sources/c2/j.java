package c2;

import e9.n0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import v7.u6;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class j {
    public final n0 a;
    public final ArrayList b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public boolean d;

    public j(n0 n0Var) {
        this.a = n0Var;
        k kVar = k.e;
        this.d = false;
    }

    public final void a() {
        l lVar = l.b;
        ArrayList arrayList = this.b;
        arrayList.clear();
        this.d = false;
        long j10 = lVar.a;
        int i10 = 0;
        while (true) {
            n0 n0Var = this.a;
            if (i10 >= n0Var.size()) {
                break;
            }
            n nVar = (n) n0Var.get(i10);
            nVar.d(new l(j10));
            if (nVar.isActive()) {
                j10 = nVar.g(j10);
                u6.p(j10 >= 0);
                arrayList.add(nVar);
            }
            i10++;
        }
        this.c = new ByteBuffer[arrayList.size()];
        for (int i11 = 0; i11 <= b(); i11++) {
            this.c[i11] = ((n) arrayList.get(i11)).a();
        }
    }

    public final int b() {
        return this.c.length - 1;
    }

    public final boolean c() {
        return this.d && ((n) this.b.get(b())).b() && !this.c[b()].hasRemaining();
    }

    public final boolean d() {
        return !this.b.isEmpty();
    }

    public final void e(ByteBuffer byteBuffer) {
        boolean z10;
        for (boolean z11 = true; z11; z11 = z10) {
            z10 = false;
            int i10 = 0;
            while (i10 <= b()) {
                if (!this.c[i10].hasRemaining()) {
                    ArrayList arrayList = this.b;
                    n nVar = (n) arrayList.get(i10);
                    if (!nVar.b()) {
                        ByteBuffer byteBuffer2 = i10 > 0 ? this.c[i10 - 1] : byteBuffer.hasRemaining() ? byteBuffer : n.a;
                        long remaining = byteBuffer2.remaining();
                        nVar.c(byteBuffer2);
                        this.c[i10] = nVar.a();
                        z10 |= remaining - ((long) byteBuffer2.remaining()) > 0 || this.c[i10].hasRemaining();
                    } else if (!this.c[i10].hasRemaining() && i10 < b()) {
                        ((n) arrayList.get(i10 + 1)).f();
                    }
                }
                i10++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        n0 n0Var = ((j) obj).a;
        n0 n0Var2 = this.a;
        if (n0Var2.size() != n0Var.size()) {
            return false;
        }
        for (int i10 = 0; i10 < n0Var2.size(); i10++) {
            if (n0Var2.get(i10) != n0Var.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
