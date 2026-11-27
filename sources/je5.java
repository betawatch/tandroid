// default package

import j$.util.DesugarCollections;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class je5 extends h2 {
    public static final /* synthetic */ xh4 E;
    public static final /* synthetic */ xh4 F;
    public static final /* synthetic */ xh4 G;
    public static final /* synthetic */ xh4 x;
    public static final /* synthetic */ xh4 y;
    public String e;
    public String f;
    public long h;
    public long n;
    public long r;
    public boolean s;
    public long w;

    static {
        u84 u84Var = new u84(je5.class, "HandlerBox.java");
        x = u84Var.e(u84Var.d("getHandlerType", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"));
        y = u84Var.e(u84Var.d("setName", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "name", "void"));
        E = u84Var.e(u84Var.d("setHandlerType", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "handlerType", "void"));
        F = u84Var.e(u84Var.d("getName", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"));
        u84Var.e(u84Var.d("getHumanReadableTrackType", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"));
        G = u84Var.e(u84Var.d("toString", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"));
        HashMap hashMap = new HashMap();
        hashMap.put("odsm", "ObjectDescriptorStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("crsm", "ClockReferenceStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("sdsm", "SceneDescriptionStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("m7sm", "MPEG7Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("ocsm", "ObjectContentInfoStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("ipsm", "IPMP Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("mjsm", "MPEG-J Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("mdir", "Apple Meta Data iTunes Reader");
        hashMap.put("mp7b", "MPEG-7 binary XML");
        hashMap.put("mp7t", "MPEG-7 XML");
        hashMap.put("vide", "Video Track");
        hashMap.put("soun", "Sound Track");
        hashMap.put("hint", "Hint Track");
        hashMap.put("appl", "Apple specific");
        hashMap.put("meta", "Timed Metadata track - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        DesugarCollections.unmodifiableMap(hashMap);
    }

    @Override // h2, z1
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.w = zpe.g(byteBuffer);
        this.e = zpe.b(byteBuffer);
        this.h = zpe.g(byteBuffer);
        this.n = zpe.g(byteBuffer);
        this.r = zpe.g(byteBuffer);
        if (byteBuffer.remaining() <= 0) {
            this.s = false;
            return;
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        try {
            String str = new String(bArr, "UTF-8");
            this.f = str;
            if (!str.endsWith(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR)) {
                this.s = false;
            } else {
                this.f = bs2.n(1, 0, this.f);
                this.s = true;
            }
        } catch (UnsupportedEncodingException e) {
            throw new Error(e);
        }
    }

    @Override // h2, z1
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt((int) this.w);
        byteBuffer.put(qt5.d(this.e));
        byteBuffer.putInt((int) this.h);
        byteBuffer.putInt((int) this.n);
        byteBuffer.putInt((int) this.r);
        String str = this.f;
        if (str != null) {
            byteBuffer.put(h2f.a(str));
        }
        if (this.s) {
            byteBuffer.put((byte) 0);
        }
    }

    @Override // z1
    public final long getContentSize() {
        boolean z = this.s;
        String str = this.f;
        return z ? h2f.b(str) + 25 : h2f.b(str) + 24;
    }

    public final String toString() {
        lyc b = u84.b(G, this, this);
        zb9.a().getClass();
        zb9.b(b);
        StringBuilder sb = new StringBuilder("HandlerBox[handlerType=");
        bp1.r(u84.b(x, this, this));
        sb.append(this.e);
        sb.append(";name=");
        bp1.r(u84.b(F, this, this));
        return c00.k(sb, this.f, "]");
    }
}
