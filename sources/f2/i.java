package f2;

import a8.ja;
import h9.i0;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class i {
    public final i0 a;
    public final ArrayList b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public boolean d;

    public i(i0 i0Var) {
        this.a = i0Var;
        j jVar = j.e;
        this.d = false;
    }

    public final void a() {
        k kVar = k.b;
        ArrayList arrayList = this.b;
        arrayList.clear();
        this.d = false;
        long j3 = kVar.a;
        int i7 = 0;
        while (true) {
            i0 i0Var = this.a;
            if (i7 >= i0Var.size()) {
                break;
            }
            m mVar = (m) i0Var.get(i7);
            mVar.d(new k(j3));
            if (mVar.isActive()) {
                j3 = mVar.g(j3);
                ja.p(j3 >= 0);
                arrayList.add(mVar);
            }
            i7++;
        }
        this.c = new ByteBuffer[arrayList.size()];
        for (int i10 = 0; i10 <= b(); i10++) {
            this.c[i10] = ((m) arrayList.get(i10)).b();
        }
    }

    public final int b() {
        return this.c.length - 1;
    }

    public final boolean c() {
        return this.d && ((m) this.b.get(b())).a() && !this.c[b()].hasRemaining();
    }

    public final boolean d() {
        return !this.b.isEmpty();
    }

    public final void e(ByteBuffer byteBuffer) {
        boolean z10;
        for (boolean z11 = true; z11; z11 = z10) {
            z10 = false;
            int i7 = 0;
            while (i7 <= b()) {
                if (!this.c[i7].hasRemaining()) {
                    ArrayList arrayList = this.b;
                    m mVar = (m) arrayList.get(i7);
                    if (!mVar.a()) {
                        ByteBuffer byteBuffer2 = i7 > 0 ? this.c[i7 - 1] : byteBuffer.hasRemaining() ? byteBuffer : m.a;
                        long remaining = byteBuffer2.remaining();
                        mVar.c(byteBuffer2);
                        this.c[i7] = mVar.b();
                        z10 |= remaining - ((long) byteBuffer2.remaining()) > 0 || this.c[i7].hasRemaining();
                    } else if (!this.c[i7].hasRemaining() && i7 < b()) {
                        ((m) arrayList.get(i7 + 1)).f();
                    }
                }
                i7++;
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
        i0 i0Var = ((i) obj).a;
        i0 i0Var2 = this.a;
        if (i0Var2.size() != i0Var.size()) {
            return false;
        }
        for (int i7 = 0; i7 < i0Var2.size(); i7++) {
            if (i0Var2.get(i7) != i0Var.get(i7)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
