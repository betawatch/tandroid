// default package

import java.io.ByteArrayOutputStream;
import java.util.HashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class jv8 implements c44 {
    public final /* synthetic */ byte a;
    public final HashMap b;
    public final HashMap c;

    public jv8(byte b) {
        this.a = b;
        switch (b) {
            case 2:
                this.b = new HashMap();
                this.c = new HashMap();
                break;
            case 3:
                this.b = new HashMap();
                this.c = new HashMap();
                break;
            default:
                this.b = new HashMap();
                this.c = new HashMap();
                break;
        }
    }

    @Override // c44
    public final /* bridge */ /* synthetic */ c44 a(Class cls, cq7 cq7Var) {
        byte b = this.a;
        HashMap hashMap = this.c;
        HashMap hashMap2 = this.b;
        switch (b) {
            case 1:
                hashMap2.put(cls, cq7Var);
                hashMap.remove(cls);
                break;
            case 2:
                hashMap2.put(cls, cq7Var);
                hashMap.remove(cls);
                break;
            default:
                hashMap2.put(cls, cq7Var);
                hashMap.remove(cls);
                break;
        }
        return this;
    }

    public final void b(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = this.c;
        HashMap hashMap2 = this.b;
        iv8 iv8Var = new iv8(byteArrayOutputStream, hashMap2, hashMap);
        if (obj == null) {
            return;
        }
        cq7 cq7Var = (cq7) hashMap2.get(obj.getClass());
        if (cq7Var != null) {
            cq7Var.a(obj, iv8Var);
            return;
        }
        throw new e44("No encoder for " + obj.getClass());
    }

    public jv8(HashMap hashMap, HashMap hashMap2) {
        this.a = (byte) 0;
        this.b = hashMap;
        this.c = hashMap2;
    }
}
