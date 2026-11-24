// default package

import j$.util.DesugarCollections;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ge5 extends g2 {
    public static final /* synthetic */ ai4 E;
    public static final /* synthetic */ ai4 F;
    public static final /* synthetic */ ai4 G;
    public static final /* synthetic */ ai4 x;
    public static final /* synthetic */ ai4 y;
    public String e;
    public String f;
    public long h;
    public long n;
    public long r;
    public boolean s;
    public long w;

    static {
        i94 i94Var = new i94(ge5.class, "HandlerBox.java");
        x = i94Var.e(i94Var.d("getHandlerType", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"));
        y = i94Var.e(i94Var.d("setName", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "name", "void"));
        E = i94Var.e(i94Var.d("setHandlerType", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "handlerType", "void"));
        F = i94Var.e(i94Var.d("getName", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"));
        i94Var.e(i94Var.d("getHumanReadableTrackType", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"));
        G = i94Var.e(i94Var.d("toString", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"));
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

    @Override // g2, y1
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.w = jne.g(byteBuffer);
        this.e = jne.b(byteBuffer);
        this.h = jne.g(byteBuffer);
        this.n = jne.g(byteBuffer);
        this.r = jne.g(byteBuffer);
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
                this.f = ts2.m(1, 0, this.f);
                this.s = true;
            }
        } catch (UnsupportedEncodingException e) {
            throw new Error(e);
        }
    }

    @Override // g2, y1
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt((int) this.w);
        byteBuffer.put(nt5.d(this.e));
        byteBuffer.putInt((int) this.h);
        byteBuffer.putInt((int) this.n);
        byteBuffer.putInt((int) this.r);
        String str = this.f;
        if (str != null) {
            byteBuffer.put(rze.a(str));
        }
        if (this.s) {
            byteBuffer.put((byte) 0);
        }
    }

    @Override // y1
    public final long getContentSize() {
        boolean z = this.s;
        String str = this.f;
        return z ? rze.b(str) + 25 : rze.b(str) + 24;
    }

    public final String toString() {
        xvc b = i94.b(G, this, this);
        pa9.a().getClass();
        pa9.b(b);
        StringBuilder sb = new StringBuilder("HandlerBox[handlerType=");
        aq1.r(i94.b(x, this, this));
        sb.append(this.e);
        sb.append(";name=");
        aq1.r(i94.b(F, this, this));
        return b10.j(sb, this.f, "]");
    }
}
