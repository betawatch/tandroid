// default package

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class js3 extends e2 {
    public static final /* synthetic */ z24 n;
    public static final /* synthetic */ z24 r;

    static {
        z74 z74Var = new z74(js3.class, "ESDescriptorBox.java");
        z74Var.e(z74Var.d("getEsDescriptor", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "", "", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor"));
        z74Var.e(z74Var.d("setEsDescriptor", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor", "esDescriptor", "void"));
        n = z74Var.e(z74Var.d("equals", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "java.lang.Object", "o", "boolean"));
        r = z74Var.e(z74Var.d("hashCode", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "", "", "int"));
    }

    public final boolean equals(Object obj) {
        oo1.r(z74.c(n, this, this, obj));
        if (this == obj) {
            return true;
        }
        if (obj == null || js3.class != obj.getClass()) {
            return false;
        }
        ByteBuffer byteBuffer = this.e;
        ByteBuffer byteBuffer2 = ((js3) obj).e;
        return byteBuffer != null ? byteBuffer.equals(byteBuffer2) : byteBuffer2 == null;
    }

    public final int hashCode() {
        oo1.r(z74.b(r, this, this));
        ByteBuffer byteBuffer = this.e;
        if (byteBuffer != null) {
            return byteBuffer.hashCode();
        }
        return 0;
    }
}
