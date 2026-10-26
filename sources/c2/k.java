package c2;

import a8.yb;
import f9.i0;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class k {
    public final i0 a;
    public final ArrayList b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public boolean d;

    public k(i0 i0Var) {
        this.a = i0Var;
        l lVar = l.e;
        this.d = false;
    }

    public final void a() {
        m mVar = m.b;
        ArrayList arrayList = this.b;
        arrayList.clear();
        this.d = false;
        long j10 = mVar.a;
        int i10 = 0;
        while (true) {
            i0 i0Var = this.a;
            if (i10 >= i0Var.size()) {
                break;
            }
            o oVar = (o) i0Var.get(i10);
            oVar.d(new m(j10));
            if (oVar.isActive()) {
                j10 = oVar.g(j10);
                yb.p(j10 >= 0);
                arrayList.add(oVar);
            }
            i10++;
        }
        this.c = new ByteBuffer[arrayList.size()];
        for (int i11 = 0; i11 <= b(); i11++) {
            this.c[i11] = ((o) arrayList.get(i11)).a();
        }
    }

    public final int b() {
        return this.c.length - 1;
    }

    public final boolean c() {
        return this.d && ((o) this.b.get(b())).c() && !this.c[b()].hasRemaining();
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
                    o oVar = (o) arrayList.get(i10);
                    if (!oVar.c()) {
                        ByteBuffer byteBuffer2 = i10 > 0 ? this.c[i10 - 1] : byteBuffer.hasRemaining() ? byteBuffer : o.a;
                        long remaining = byteBuffer2.remaining();
                        oVar.b(byteBuffer2);
                        this.c[i10] = oVar.a();
                        z10 |= remaining - ((long) byteBuffer2.remaining()) > 0 || this.c[i10].hasRemaining();
                    } else if (!this.c[i10].hasRemaining() && i10 < b()) {
                        ((o) arrayList.get(i10 + 1)).f();
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
        if (!(obj instanceof k)) {
            return false;
        }
        i0 i0Var = ((k) obj).a;
        i0 i0Var2 = this.a;
        if (i0Var2.size() != i0Var.size()) {
            return false;
        }
        for (int i10 = 0; i10 < i0Var2.size(); i10++) {
            if (i0Var2.get(i10) != i0Var.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
