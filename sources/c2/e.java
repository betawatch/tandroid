package c2;

import e9.i0;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class e {
    public final i0 a;
    public final ArrayList b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public boolean d;

    public e(i0 i0Var) {
        this.a = i0Var;
        f fVar = f.e;
        this.d = false;
    }

    public final void a() {
        ArrayList arrayList = this.b;
        arrayList.clear();
        this.d = false;
        int i10 = 0;
        while (true) {
            i0 i0Var = this.a;
            if (i10 >= i0Var.size()) {
                break;
            }
            h hVar = (h) i0Var.get(i10);
            hVar.flush();
            if (hVar.isActive()) {
                arrayList.add(hVar);
            }
            i10++;
        }
        this.c = new ByteBuffer[arrayList.size()];
        for (int i11 = 0; i11 <= b(); i11++) {
            this.c[i11] = ((h) arrayList.get(i11)).a();
        }
    }

    public final int b() {
        return this.c.length - 1;
    }

    public final boolean c() {
        return this.d && ((h) this.b.get(b())).b() && !this.c[b()].hasRemaining();
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
                    h hVar = (h) arrayList.get(i10);
                    if (!hVar.b()) {
                        ByteBuffer byteBuffer2 = i10 > 0 ? this.c[i10 - 1] : byteBuffer.hasRemaining() ? byteBuffer : h.a;
                        long remaining = byteBuffer2.remaining();
                        hVar.c(byteBuffer2);
                        this.c[i10] = hVar.a();
                        z10 |= remaining - ((long) byteBuffer2.remaining()) > 0 || this.c[i10].hasRemaining();
                    } else if (!this.c[i10].hasRemaining() && i10 < b()) {
                        ((h) arrayList.get(i10 + 1)).e();
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
        if (!(obj instanceof e)) {
            return false;
        }
        i0 i0Var = ((e) obj).a;
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
