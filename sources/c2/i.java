package c2;

import e9.n0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class i {
    public final n0 a;
    public final ArrayList b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public boolean d;

    public i(n0 n0Var) {
        this.a = n0Var;
        j jVar = j.e;
        this.d = false;
    }

    public final void a() {
        k kVar = k.b;
        ArrayList arrayList = this.b;
        arrayList.clear();
        this.d = false;
        long j10 = kVar.a;
        int i10 = 0;
        while (true) {
            n0 n0Var = this.a;
            if (i10 >= n0Var.size()) {
                break;
            }
            m mVar = (m) n0Var.get(i10);
            mVar.d(new k(j10));
            if (mVar.isActive()) {
                j10 = mVar.g(j10);
                t6.p(j10 >= 0);
                arrayList.add(mVar);
            }
            i10++;
        }
        this.c = new ByteBuffer[arrayList.size()];
        for (int i11 = 0; i11 <= b(); i11++) {
            this.c[i11] = ((m) arrayList.get(i11)).a();
        }
    }

    public final int b() {
        return this.c.length - 1;
    }

    public final boolean c() {
        return this.d && ((m) this.b.get(b())).c() && !this.c[b()].hasRemaining();
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
                    m mVar = (m) arrayList.get(i10);
                    if (!mVar.c()) {
                        ByteBuffer byteBuffer2 = i10 > 0 ? this.c[i10 - 1] : byteBuffer.hasRemaining() ? byteBuffer : m.a;
                        long remaining = byteBuffer2.remaining();
                        mVar.b(byteBuffer2);
                        this.c[i10] = mVar.a();
                        z10 |= remaining - ((long) byteBuffer2.remaining()) > 0 || this.c[i10].hasRemaining();
                    } else if (!this.c[i10].hasRemaining() && i10 < b()) {
                        ((m) arrayList.get(i10 + 1)).f();
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
        if (!(obj instanceof i)) {
            return false;
        }
        n0 n0Var = ((i) obj).a;
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
