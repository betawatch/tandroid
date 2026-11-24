// default package

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class kje {
    public static int a(ByteBuffer byteBuffer, int i, int i2) {
        int i3 = 0;
        while (i < i2) {
            int i4 = byteBuffer.get(i) & 255;
            if (i3 >= 2 && i4 == 1) {
                return i - 2;
            }
            i3 = i4 == 0 ? i3 + 1 : 0;
            i++;
        }
        return i2;
    }
}
