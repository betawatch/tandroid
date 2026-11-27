// default package

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class bt3 extends f2 {
    public static final /* synthetic */ xh4 n;
    public static final /* synthetic */ xh4 r;

    static {
        u84 u84Var = new u84(bt3.class, "ESDescriptorBox.java");
        u84Var.e(u84Var.d("getEsDescriptor", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "", "", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor"));
        u84Var.e(u84Var.d("setEsDescriptor", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor", "esDescriptor", "void"));
        n = u84Var.e(u84Var.d("equals", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "java.lang.Object", "o", "boolean"));
        r = u84Var.e(u84Var.d("hashCode", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "", "", "int"));
    }

    public final boolean equals(Object obj) {
        bp1.r(u84.c(n, this, this, obj));
        if (this == obj) {
            return true;
        }
        if (obj == null || bt3.class != obj.getClass()) {
            return false;
        }
        ByteBuffer byteBuffer = this.e;
        ByteBuffer byteBuffer2 = ((bt3) obj).e;
        return byteBuffer != null ? byteBuffer.equals(byteBuffer2) : byteBuffer2 == null;
    }

    public final int hashCode() {
        bp1.r(u84.b(r, this, this));
        ByteBuffer byteBuffer = this.e;
        if (byteBuffer != null) {
            return byteBuffer.hashCode();
        }
        return 0;
    }
}
