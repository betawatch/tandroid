package c3;

import a8.u1;
import android.net.Uri;
import f9.s1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class m implements r {
    public static final int[] h = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final n4.s n = new n4.s(new c2.i(1));
    public static final n4.s r = new n4.s(new c2.i(2));
    public s1 a;
    public int e;
    public int f;
    public qb.a c = new qb.a(28);
    public boolean b = true;
    public int d = 3;

    public final void a(int i10, ArrayList arrayList) {
        switch (i10) {
            case 0:
                arrayList.add(new j4.a());
                break;
            case 1:
                arrayList.add(new j4.c());
                break;
            case 2:
                arrayList.add(new j4.d(1));
                break;
            case 3:
                arrayList.add(new d3.a(1));
                break;
            case 4:
                o w10 = n.w(0);
                if (w10 == null) {
                    arrayList.add(new h3.b());
                    break;
                } else {
                    arrayList.add(w10);
                    break;
                }
            case 5:
                arrayList.add(new i3.b());
                break;
            case 6:
                arrayList.add(new u3.f(this.c, this.b ? 0 : 2));
                break;
            case 7:
                arrayList.add(new v3.d(1));
                break;
            case 8:
                qb.a aVar = this.c;
                int g7 = w3.h.g(this.d) | (this.b ? 0 : 32);
                f9.g0 g0Var = f9.i0.b;
                arrayList.add(new w3.h(aVar, g7, null, s1.e, null));
                qb.a aVar2 = this.c;
                int i11 = this.d;
                int i12 = (i11 & 1) == 0 ? 0 : 32;
                if ((2 & i11) != 0) {
                    i12 |= 128;
                }
                arrayList.add(new w3.l(aVar2, i12 | (this.b ? 0 : 16)));
                break;
            case 9:
                arrayList.add(new x3.d());
                break;
            case 10:
                arrayList.add(new j4.z());
                break;
            case 11:
                if (this.a == null) {
                    f9.g0 g0Var2 = f9.i0.b;
                    this.a = s1.e;
                }
                arrayList.add(new j4.d0(1, !this.b ? 1 : 0, this.c, new e2.k0(0L), new j4.f(0, this.a)));
                break;
            case 12:
                k4.c cVar = new k4.c();
                cVar.c = 0;
                cVar.d = -1L;
                cVar.f = -1;
                cVar.g = -1L;
                arrayList.add(cVar);
                break;
            case 14:
                arrayList.add(new k3.a(this.e));
                break;
            case 15:
                o w11 = r.w(new Object[0]);
                if (w11 != null) {
                    arrayList.add(w11);
                    break;
                }
                break;
            case 16:
                arrayList.add(new e3.b(!this.b ? 1 : 0, this.c));
                break;
            case 17:
                arrayList.add(new g3.a(1));
                break;
            case 18:
                arrayList.add(new f3.a(1));
                break;
            case 19:
                arrayList.add(new g3.a(0));
                break;
            case 20:
                arrayList.add(new j3.b(this.f));
                break;
            case 21:
                arrayList.add(new f3.a(0));
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:3:0x0001, B:5:0x0015, B:8:0x001c, B:9:0x0024, B:11:0x002b, B:12:0x0031, B:15:0x0039, B:18:0x003f, B:21:0x0045, B:23:0x0048, B:27:0x004b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:3:0x0001, B:5:0x0015, B:8:0x001c, B:9:0x0024, B:11:0x002b, B:12:0x0031, B:15:0x0039, B:18:0x003f, B:21:0x0045, B:23:0x0048, B:27:0x004b), top: B:2:0x0001 }] */
    @Override // c3.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized o[] d(Uri uri, Map map) {
        ArrayList arrayList;
        String str;
        int a2;
        int b10;
        int i10;
        try {
            int[] iArr = h;
            arrayList = new ArrayList(21);
            List list = (List) map.get("Content-Type");
            if (list != null && !list.isEmpty()) {
                str = (String) list.get(0);
                a2 = u1.a(str);
                if (a2 != -1) {
                    a(a2, arrayList);
                }
                b10 = u1.b(uri);
                if (b10 != -1 && b10 != a2) {
                    a(b10, arrayList);
                }
                for (i10 = 0; i10 < 21; i10++) {
                    int i11 = iArr[i10];
                    if (i11 != a2 && i11 != b10) {
                        a(i11, arrayList);
                    }
                }
            }
            str = null;
            a2 = u1.a(str);
            if (a2 != -1) {
            }
            b10 = u1.b(uri);
            if (b10 != -1) {
                a(b10, arrayList);
            }
            while (i10 < 21) {
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (o[]) arrayList.toArray(new o[0]);
    }
}
