// default package

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class fwe {
    public static final fwe c = new fwe();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final l69 a = new l69((byte) 2);

    public final xwe a(Class cls) {
        xwe l;
        Class cls2;
        Charset charset = foe.a;
        if (cls == null) {
            fvc.f("messageType");
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        xwe xweVar = (xwe) concurrentHashMap.get(cls);
        if (xweVar != null) {
            return xweVar;
        }
        Class cls3 = fxe.a;
        if (!nne.class.isAssignableFrom(cls) && (cls2 = fxe.a) != null && !cls2.isAssignableFrom(cls)) {
            w26.j("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        swe zzb = ((vse) this.a.b).zzb(cls);
        if ((zzb.d & 2) == 2) {
            if (nne.class.isAssignableFrom(cls)) {
                l = new yue(fxe.d, fle.a, zzb.a);
            } else {
                mze mzeVar = fxe.b;
                wke wkeVar = fle.b;
                if (wkeVar == null) {
                    sc8.j("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                l = new yue(mzeVar, wkeVar, zzb.a);
            }
        } else if (nne.class.isAssignableFrom(cls)) {
            l = (zzb.d & 1) == 1 ? que.l(zzb, pve.b, zqe.b, fxe.d, fle.a, ute.b) : que.l(zzb, pve.b, zqe.b, fxe.d, null, ute.b);
        } else if ((zzb.d & 1) == 1) {
            tve tveVar = pve.a;
            jre jreVar = zqe.a;
            mze mzeVar2 = fxe.b;
            wke wkeVar2 = fle.b;
            if (wkeVar2 == null) {
                sc8.j("Protobuf runtime is not correctly loaded.");
                return null;
            }
            l = que.l(zzb, tveVar, jreVar, mzeVar2, wkeVar2, ute.a);
        } else {
            l = que.l(zzb, pve.a, zqe.a, fxe.c, null, ute.a);
        }
        xwe xweVar2 = (xwe) concurrentHashMap.putIfAbsent(cls, l);
        return xweVar2 != null ? xweVar2 : l;
    }
}
