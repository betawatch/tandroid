package i5;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class j extends com.googlecode.mp4parser.a {
    public static final /* synthetic */ v4.b d;
    public static final /* synthetic */ v4.b e;
    public String a;
    public long b;
    public LinkedList c;

    static {
        ze.a aVar = new ze.a(j.class, "FileTypeBox.java");
        d = aVar.e(aVar.d("getMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("setMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "java.lang.String", "majorBrand", "void"));
        aVar.e(aVar.d("setMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "long", "minorVersion", "void"));
        e = aVar.e(aVar.d("getMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "", "", "long"));
        aVar.e(aVar.d("getCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "", "", "java.util.List"));
        aVar.e(aVar.d("setCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "java.util.List", "compatibleBrands", "void"));
    }

    @Override // com.googlecode.mp4parser.a
    public final void _parseDetails(ByteBuffer byteBuffer) {
        this.a = h5.b.d(byteBuffer);
        this.b = h5.b.i(byteBuffer);
        int remaining = byteBuffer.remaining() / 4;
        this.c = new LinkedList();
        for (int i7 = 0; i7 < remaining; i7++) {
            this.c.add(h5.b.d(byteBuffer));
        }
    }

    @Override // com.googlecode.mp4parser.a
    public final void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(h5.c.d(this.a));
        byteBuffer.putInt((int) this.b);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            byteBuffer.put(h5.c.d((String) it.next()));
        }
    }

    @Override // com.googlecode.mp4parser.a
    public final long getContentSize() {
        return (this.c.size() * 4) + 8;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FileTypeBox[majorBrand=");
        c.w(ze.a.b(d, this, this));
        sb2.append(this.a);
        sb2.append(";minorVersion=");
        c.w(ze.a.b(e, this, this));
        sb2.append(this.b);
        for (String str : this.c) {
            sb2.append(";compatibleBrand=");
            sb2.append(str);
        }
        sb2.append("]");
        return sb2.toString();
    }
}
