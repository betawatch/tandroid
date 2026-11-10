package f2;

import a8.ia;
import h9.i0;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class j {
    public final i0 a;
    public final ArrayList b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public boolean d;

    public j(i0 i0Var) {
        this.a = i0Var;
        k kVar = k.e;
        this.d = false;
    }

    public final void a() {
        l lVar = l.b;
        ArrayList arrayList = this.b;
        arrayList.clear();
        this.d = false;
        long j3 = lVar.a;
        int i7 = 0;
        while (true) {
            i0 i0Var = this.a;
            if (i7 >= i0Var.size()) {
                break;
            }
            n nVar = (n) i0Var.get(i7);
            nVar.d(new l(j3));
            if (nVar.isActive()) {
                j3 = nVar.g(j3);
                ia.p(j3 >= 0);
                arrayList.add(nVar);
            }
            i7++;
        }
        this.c = new ByteBuffer[arrayList.size()];
        for (int i10 = 0; i10 <= b(); i10++) {
            this.c[i10] = ((n) arrayList.get(i10)).b();
        }
    }

    public final int b() {
        return this.c.length - 1;
    }

    public final boolean c() {
        return this.d && ((n) this.b.get(b())).a() && !this.c[b()].hasRemaining();
    }

    public final boolean d() {
        return !this.b.isEmpty();
    }

    public final void e(ByteBuffer byteBuffer) {
        boolean z9;
        for (boolean z10 = true; z10; z10 = z9) {
            z9 = false;
            int i7 = 0;
            while (i7 <= b()) {
                if (!this.c[i7].hasRemaining()) {
                    ArrayList arrayList = this.b;
                    n nVar = (n) arrayList.get(i7);
                    if (!nVar.a()) {
                        ByteBuffer byteBuffer2 = i7 > 0 ? this.c[i7 - 1] : byteBuffer.hasRemaining() ? byteBuffer : n.a;
                        long remaining = byteBuffer2.remaining();
                        nVar.c(byteBuffer2);
                        this.c[i7] = nVar.b();
                        z9 |= remaining - ((long) byteBuffer2.remaining()) > 0 || this.c[i7].hasRemaining();
                    } else if (!this.c[i7].hasRemaining() && i7 < b()) {
                        ((n) arrayList.get(i7 + 1)).f();
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
        if (!(obj instanceof j)) {
            return false;
        }
        i0 i0Var = ((j) obj).a;
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
