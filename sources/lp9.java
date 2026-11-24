// default package

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class lp9 extends g2 {
    public static final /* synthetic */ z24 f;
    public static final /* synthetic */ z24 h;
    public static final /* synthetic */ z24 n;
    public List e;

    static {
        z74 z74Var = new z74(lp9.class, "SampleToChunkBox.java");
        f = z74Var.e(z74Var.d("getEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "java.util.List"));
        h = z74Var.e(z74Var.d("setEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "java.util.List", "entries", "void"));
        n = z74Var.e(z74Var.d("toString", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "java.lang.String"));
        z74Var.e(z74Var.d("blowup", "com.coremedia.iso.boxes.SampleToChunkBox", "int", "chunkCount", "[J"));
    }

    @Override // g2, y1
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a = mqd.a(hle.g(byteBuffer));
        this.e = new ArrayList(a);
        for (int i = 0; i < a; i++) {
            this.e.add(new kp9(hle.g(byteBuffer), hle.g(byteBuffer), hle.g(byteBuffer)));
        }
    }

    @Override // g2, y1
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.e.size());
        for (kp9 kp9Var : this.e) {
            byteBuffer.putInt((int) kp9Var.a);
            byteBuffer.putInt((int) kp9Var.b);
            byteBuffer.putInt((int) kp9Var.c);
        }
    }

    @Override // y1
    public final long getContentSize() {
        return (this.e.size() * 12) + 8;
    }

    public final String toString() {
        c5a b = z74.b(n, this, this);
        n89.a().getClass();
        n89.b(b);
        return "SampleToChunkBox[entryCount=" + this.e.size() + "]";
    }
}
