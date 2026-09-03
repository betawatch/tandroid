package l3;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class k {
    public final s8.v a;
    public final ArrayList b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public boolean d;

    public k(s8.v vVar) {
        this.a = vVar;
        l lVar = l.e;
        this.d = false;
    }

    public final void a() {
        ArrayList arrayList = this.b;
        arrayList.clear();
        this.d = false;
        int i10 = 0;
        while (true) {
            s8.v vVar = this.a;
            if (i10 >= vVar.size()) {
                break;
            }
            n nVar = (n) vVar.get(i10);
            nVar.flush();
            if (nVar.isActive()) {
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
        return this.d && ((n) this.b.get(b())).d() && !this.c[b()].hasRemaining();
    }

    public final boolean d() {
        return !this.b.isEmpty();
    }

    public final void e(ByteBuffer byteBuffer) {
        boolean z4;
        for (boolean z10 = true; z10; z10 = z4) {
            z4 = false;
            int i10 = 0;
            while (i10 <= b()) {
                if (!this.c[i10].hasRemaining()) {
                    ArrayList arrayList = this.b;
                    n nVar = (n) arrayList.get(i10);
                    if (!nVar.d()) {
                        ByteBuffer byteBuffer2 = i10 > 0 ? this.c[i10 - 1] : byteBuffer.hasRemaining() ? byteBuffer : n.a;
                        long remaining = byteBuffer2.remaining();
                        nVar.b(byteBuffer2);
                        this.c[i10] = nVar.a();
                        z4 |= remaining - ((long) byteBuffer2.remaining()) > 0 || this.c[i10].hasRemaining();
                    } else if (!this.c[i10].hasRemaining() && i10 < b()) {
                        ((n) arrayList.get(i10 + 1)).c();
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
        s8.v vVar = ((k) obj).a;
        s8.v vVar2 = this.a;
        if (vVar2.size() != vVar.size()) {
            return false;
        }
        for (int i10 = 0; i10 < vVar2.size(); i10++) {
            if (vVar2.get(i10) != vVar.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
