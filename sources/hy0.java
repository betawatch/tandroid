// default package

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class hy0 {
    public static final byte[] a = {-75, 0, 60, 0, 1, 4};

    public static Object a(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(hy0.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static void b(ByteBuffer byteBuffer, boolean z) {
        ArrayList b = eqe.b(byteBuffer.asReadOnlyBuffer());
        int size = b.size();
        int i = 0;
        while (i < size) {
            Object obj = b.get(i);
            i++;
            eo7 eo7Var = (eo7) obj;
            byte b2 = eo7Var.a;
            ByteBuffer byteBuffer2 = eo7Var.b;
            if (b2 == 5) {
                try {
                    gre.f(b2 == 5);
                    ByteBuffer asReadOnlyBuffer = byteBuffer2.asReadOnlyBuffer();
                    if (eqe.a(asReadOnlyBuffer) == 4) {
                        if (z && asReadOnlyBuffer.remaining() >= 6) {
                            int position = asReadOnlyBuffer.position();
                            for (int i2 = 0; i2 < 6; i2++) {
                                if (asReadOnlyBuffer.get(position + i2) == a[i2]) {
                                }
                            }
                        }
                        byteBuffer.put(byteBuffer2.position(), (byte) 31);
                        break;
                    }
                } catch (BufferUnderflowException unused) {
                }
            }
        }
    }
}
