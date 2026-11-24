// default package

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class hye {
    public static final hye c = new hye();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ni6 a = new ni6((byte) 1);

    public final zye a(Class cls) {
        zye l;
        Class cls2;
        Charset charset = iqe.a;
        if (cls == null) {
            gxc.d("messageType");
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        zye zyeVar = (zye) concurrentHashMap.get(cls);
        if (zyeVar != null) {
            return zyeVar;
        }
        Class cls3 = hze.a;
        if (!qpe.class.isAssignableFrom(cls) && (cls2 = hze.a) != null && !cls2.isAssignableFrom(cls)) {
            u36.j("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        uye zzb = ((yue) this.a.b).zzb(cls);
        if ((zzb.d & 2) == 2) {
            if (qpe.class.isAssignableFrom(cls)) {
                l = new axe(hze.d, hne.a, zzb.a);
            } else {
                o1f o1fVar = hze.b;
                yme ymeVar = hne.b;
                if (ymeVar == null) {
                    dq9.m("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                l = new axe(o1fVar, ymeVar, zzb.a);
            }
        } else if (qpe.class.isAssignableFrom(cls)) {
            l = (zzb.d & 1) == 1 ? swe.l(zzb, rxe.b, cte.b, hze.d, hne.a, xve.b) : swe.l(zzb, rxe.b, cte.b, hze.d, null, xve.b);
        } else if ((zzb.d & 1) == 1) {
            vxe vxeVar = rxe.a;
            mte mteVar = cte.a;
            o1f o1fVar2 = hze.b;
            yme ymeVar2 = hne.b;
            if (ymeVar2 == null) {
                dq9.m("Protobuf runtime is not correctly loaded.");
                return null;
            }
            l = swe.l(zzb, vxeVar, mteVar, o1fVar2, ymeVar2, xve.a);
        } else {
            l = swe.l(zzb, rxe.a, cte.a, hze.c, null, xve.a);
        }
        zye zyeVar2 = (zye) concurrentHashMap.putIfAbsent(cls, l);
        return zyeVar2 != null ? zyeVar2 : l;
    }
}
