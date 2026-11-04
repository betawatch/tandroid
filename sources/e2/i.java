package e2;

import b8.zb;
import g9.i0;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
        long j10 = kVar.a;
        int i3 = 0;
        while (true) {
            i0 i0Var = this.a;
            if (i3 >= i0Var.size()) {
                break;
            }
            m mVar = (m) i0Var.get(i3);
            mVar.e(new k(j10));
            if (mVar.isActive()) {
                j10 = mVar.g(j10);
                zb.p(j10 >= 0);
                arrayList.add(mVar);
            }
            i3++;
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
            int i3 = 0;
            while (i3 <= b()) {
                if (!this.c[i3].hasRemaining()) {
                    ArrayList arrayList = this.b;
                    m mVar = (m) arrayList.get(i3);
                    if (!mVar.a()) {
                        ByteBuffer byteBuffer2 = i3 > 0 ? this.c[i3 - 1] : byteBuffer.hasRemaining() ? byteBuffer : m.a;
                        long remaining = byteBuffer2.remaining();
                        mVar.c(byteBuffer2);
                        this.c[i3] = mVar.b();
                        z10 |= remaining - ((long) byteBuffer2.remaining()) > 0 || this.c[i3].hasRemaining();
                    } else if (!this.c[i3].hasRemaining() && i3 < b()) {
                        ((m) arrayList.get(i3 + 1)).f();
                    }
                }
                i3++;
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
        for (int i3 = 0; i3 < i0Var2.size(); i3++) {
            if (i0Var2.get(i3) != i0Var.get(i3)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
