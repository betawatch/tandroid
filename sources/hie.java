// default package

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class hie {
    protected int zza;

    public static void a(List list, List list2) {
        Charset charset = xse.a;
        list.getClass();
        if (list instanceof vve) {
            List zzd = ((vve) list).zzd();
            vve vveVar = (vve) list2;
            int size = list2.size();
            for (Object obj : zzd) {
                if (obj == null) {
                    int size2 = vveVar.size() - size;
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(size2);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    for (int size3 = vveVar.size() - 1; size3 >= size; size3--) {
                        vveVar.remove(size3);
                    }
                    p3d.h(sb2);
                    return;
                }
                if (obj instanceof jne) {
                    vveVar.e((jne) obj);
                } else {
                    vveVar.add((String) obj);
                }
            }
            return;
        }
        if (list instanceof p0f) {
            list2.addAll(list);
            return;
        }
        if ((list2 instanceof ArrayList) && (list instanceof Collection)) {
            ((ArrayList) list2).ensureCapacity(list.size() + list2.size());
        }
        int size4 = list2.size();
        for (Object obj2 : list) {
            if (obj2 == null) {
                int size5 = list2.size() - size4;
                StringBuilder sb3 = new StringBuilder(37);
                sb3.append("Element at index ");
                sb3.append(size5);
                sb3.append(" is null.");
                String sb4 = sb3.toString();
                for (int size6 = list2.size() - 1; size6 >= size4; size6--) {
                    list2.remove(size6);
                }
                p3d.h(sb4);
                return;
            }
            list2.add(obj2);
        }
    }

    public abstract void b(int i);

    public abstract int c();
}
