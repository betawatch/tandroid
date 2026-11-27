// default package

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class l20 {
    public final j99 a;
    public final ArrayList b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public boolean d;

    public l20(j99 j99Var) {
        this.a = j99Var;
        m20 m20Var = m20.e;
        this.d = false;
    }

    public final int a() {
        return this.c.length - 1;
    }

    public final boolean b() {
        return this.d && ((q20) this.b.get(a())).a() && !this.c[a()].hasRemaining();
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
                    q20 q20Var = (q20) arrayList.get(i);
                    if (!q20Var.a()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : q20.a;
                        long remaining = byteBuffer2.remaining();
                        q20Var.d(byteBuffer2);
                        this.c[i] = q20Var.b();
                        z |= remaining - ((long) byteBuffer2.remaining()) > 0 || this.c[i].hasRemaining();
                    } else if (!this.c[i].hasRemaining() && i < a()) {
                        ((q20) arrayList.get(i + 1)).f();
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
        if (obj instanceof l20) {
            j99 j99Var = ((l20) obj).a;
            j99 j99Var2 = this.a;
            if (j99Var2.d == j99Var.d) {
                for (int i = 0; i < j99Var2.d; i++) {
                    if (j99Var2.get(i) == j99Var.get(i)) {
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
