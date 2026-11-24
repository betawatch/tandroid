// default package

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ld4 extends y1 {
    public static final /* synthetic */ ai4 d;
    public static final /* synthetic */ ai4 e;
    public String a;
    public long b;
    public LinkedList c;

    static {
        i94 i94Var = new i94(ld4.class, "FileTypeBox.java");
        d = i94Var.e(i94Var.d("getMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "", "", "java.lang.String"));
        i94Var.e(i94Var.d("setMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "java.lang.String", "majorBrand", "void"));
        i94Var.e(i94Var.d("setMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "long", "minorVersion", "void"));
        e = i94Var.e(i94Var.d("getMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "", "", "long"));
        i94Var.e(i94Var.d("getCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "", "", "java.util.List"));
        i94Var.e(i94Var.d("setCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "java.util.List", "compatibleBrands", "void"));
    }

    @Override // y1
    public final void _parseDetails(ByteBuffer byteBuffer) {
        this.a = jne.b(byteBuffer);
        this.b = jne.g(byteBuffer);
        int remaining = byteBuffer.remaining() / 4;
        this.c = new LinkedList();
        for (int i = 0; i < remaining; i++) {
            this.c.add(jne.b(byteBuffer));
        }
    }

    @Override // y1
    public final void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(nt5.d(this.a));
        byteBuffer.putInt((int) this.b);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            byteBuffer.put(nt5.d((String) it.next()));
        }
    }

    @Override // y1
    public final long getContentSize() {
        return (this.c.size() << 2) + 8;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FileTypeBox[majorBrand=");
        aq1.r(i94.b(d, this, this));
        sb.append(this.a);
        sb.append(";minorVersion=");
        aq1.r(i94.b(e, this, this));
        sb.append(this.b);
        for (String str : this.c) {
            sb.append(";compatibleBrand=");
            sb.append(str);
        }
        sb.append("]");
        return sb.toString();
    }
}
