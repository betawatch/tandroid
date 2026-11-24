// default package

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class fy3 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final e7a b;
    public volatile byte c = 0;

    public fy3(e7a e7aVar, int i) {
        this.b = e7aVar;
        this.a = i;
    }

    public final int a(int i) {
        qf7 b = b();
        int a = b.a(16);
        if (a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = b.b;
        int i2 = a + b.a;
        return byteBuffer.getInt(byteBuffer.getInt(i2) + i2 + 4 + (i << 2));
    }

    public final qf7 b() {
        ThreadLocal threadLocal = d;
        qf7 qf7Var = (qf7) threadLocal.get();
        if (qf7Var == null) {
            qf7Var = new qf7();
            threadLocal.set(qf7Var);
        }
        rf7 rf7Var = (rf7) this.b.a;
        int a = rf7Var.a(6);
        if (a != 0) {
            int i = a + rf7Var.a;
            int i2 = rf7Var.b.getInt(i) + i + 4 + (this.a << 2);
            int i3 = rf7Var.b.getInt(i2) + i2;
            ByteBuffer byteBuffer = rf7Var.b;
            qf7Var.b = byteBuffer;
            if (byteBuffer != null) {
                qf7Var.a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                qf7Var.c = i4;
                qf7Var.d = qf7Var.b.getShort(i4);
                return qf7Var;
            }
            qf7Var.a = 0;
            qf7Var.c = 0;
            qf7Var.d = 0;
        }
        return qf7Var;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        qf7 b = b();
        int a = b.a(4);
        sb.append(Integer.toHexString(a != 0 ? b.b.getInt(a + b.a) : 0));
        sb.append(", codepoints:");
        qf7 b2 = b();
        int a2 = b2.a(16);
        if (a2 != 0) {
            int i2 = a2 + b2.a;
            i = b2.b.getInt(b2.b.getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
