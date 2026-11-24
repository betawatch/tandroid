// default package

import java.io.ByteArrayOutputStream;
import java.util.HashMap;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class it8 implements r24 {
    public final /* synthetic */ byte a;
    public final HashMap b;
    public final HashMap c;

    public it8(byte b) {
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

    @Override // r24
    public final /* bridge */ /* synthetic */ r24 a(Class cls, zn7 zn7Var) {
        byte b = this.a;
        HashMap hashMap = this.c;
        HashMap hashMap2 = this.b;
        switch (b) {
            case 1:
                hashMap2.put(cls, zn7Var);
                hashMap.remove(cls);
                break;
            case 2:
                hashMap2.put(cls, zn7Var);
                hashMap.remove(cls);
                break;
            default:
                hashMap2.put(cls, zn7Var);
                hashMap.remove(cls);
                break;
        }
        return this;
    }

    public final void b(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = this.c;
        HashMap hashMap2 = this.b;
        ht8 ht8Var = new ht8(byteArrayOutputStream, hashMap2, hashMap);
        if (obj == null) {
            return;
        }
        zn7 zn7Var = (zn7) hashMap2.get(obj.getClass());
        if (zn7Var != null) {
            zn7Var.a(obj, ht8Var);
            return;
        }
        throw new t24("No encoder for " + obj.getClass());
    }

    public it8(HashMap hashMap, HashMap hashMap2) {
        this.a = (byte) 0;
        this.b = hashMap;
        this.c = hashMap2;
    }
}
