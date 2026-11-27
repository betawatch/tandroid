// default package

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class id4 extends z1 {
    public static final /* synthetic */ xh4 d;
    public static final /* synthetic */ xh4 e;
    public String a;
    public long b;
    public LinkedList c;

    static {
        u84 u84Var = new u84(id4.class, "FileTypeBox.java");
        d = u84Var.e(u84Var.d("getMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "", "", "java.lang.String"));
        u84Var.e(u84Var.d("setMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "java.lang.String", "majorBrand", "void"));
        u84Var.e(u84Var.d("setMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "long", "minorVersion", "void"));
        e = u84Var.e(u84Var.d("getMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "", "", "long"));
        u84Var.e(u84Var.d("getCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "", "", "java.util.List"));
        u84Var.e(u84Var.d("setCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "java.util.List", "compatibleBrands", "void"));
    }

    @Override // z1
    public final void _parseDetails(ByteBuffer byteBuffer) {
        this.a = zpe.b(byteBuffer);
        this.b = zpe.g(byteBuffer);
        int remaining = byteBuffer.remaining() / 4;
        this.c = new LinkedList();
        for (int i = 0; i < remaining; i++) {
            this.c.add(zpe.b(byteBuffer));
        }
    }

    @Override // z1
    public final void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(qt5.d(this.a));
        byteBuffer.putInt((int) this.b);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            byteBuffer.put(qt5.d((String) it.next()));
        }
    }

    @Override // z1
    public final long getContentSize() {
        return (this.c.size() << 2) + 8;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FileTypeBox[majorBrand=");
        bp1.r(u84.b(d, this, this));
        sb.append(this.a);
        sb.append(";minorVersion=");
        bp1.r(u84.b(e, this, this));
        sb.append(this.b);
        for (String str : this.c) {
            sb.append(";compatibleBrand=");
            sb.append(str);
        }
        sb.append("]");
        return sb.toString();
    }
}
