// default package

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class k20 {
    public final w59 a;
    public final ArrayList b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public boolean d;

    public k20(w59 w59Var) {
        this.a = w59Var;
        l20 l20Var = l20.e;
        this.d = false;
    }

    public final int a() {
        return this.c.length - 1;
    }

    public final boolean b() {
        return this.d && ((p20) this.b.get(a())).a() && !this.c[a()].hasRemaining();
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
                    p20 p20Var = (p20) arrayList.get(i);
                    if (!p20Var.a()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : p20.a;
                        long remaining = byteBuffer2.remaining();
                        p20Var.d(byteBuffer2);
                        this.c[i] = p20Var.b();
                        z |= remaining - ((long) byteBuffer2.remaining()) > 0 || this.c[i].hasRemaining();
                    } else if (!this.c[i].hasRemaining() && i < a()) {
                        ((p20) arrayList.get(i + 1)).f();
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
        if (obj instanceof k20) {
            w59 w59Var = ((k20) obj).a;
            w59 w59Var2 = this.a;
            if (w59Var2.d == w59Var.d) {
                for (int i = 0; i < w59Var2.d; i++) {
                    if (w59Var2.get(i) == w59Var.get(i)) {
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
