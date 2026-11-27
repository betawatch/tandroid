// default package

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class gr2 extends h2 {
    public static final /* synthetic */ xh4 f;
    public List e;

    static {
        u84 u84Var = new u84(gr2.class, "CompositionTimeToSample.java");
        u84Var.e(u84Var.d("getEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "", "", "java.util.List"));
        f = u84Var.e(u84Var.d("setEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "java.util.List", "entries", "void"));
    }

    @Override // h2, z1
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a = cvd.a(zpe.g(byteBuffer));
        this.e = new ArrayList(a);
        for (int i = 0; i < a; i++) {
            this.e.add(new fr2(cvd.a(zpe.g(byteBuffer)), byteBuffer.getInt()));
        }
    }

    @Override // h2, z1
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.e.size());
        for (fr2 fr2Var : this.e) {
            byteBuffer.putInt(fr2Var.a);
            byteBuffer.putInt(fr2Var.b);
        }
    }

    @Override // z1
    public final long getContentSize() {
        return (this.e.size() << 3) + 8;
    }
}
