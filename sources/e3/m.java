package e3;

import android.net.Uri;
import b8.eb;
import d2.t1;
import g2.l0;
import g9.s1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m implements r {
    public static final int[] h = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final p4.q n = new p4.q(new t1(12));
    public static final p4.q r = new p4.q(new t1(13));
    public s1 a;
    public int e;
    public int f;
    public mb.b c = new mb.b(4);
    public boolean b = true;
    public int d = 3;

    public final void a(int i3, ArrayList arrayList) {
        switch (i3) {
            case 0:
                arrayList.add(new l4.a());
                break;
            case 1:
                arrayList.add(new l4.c());
                break;
            case 2:
                arrayList.add(new l4.d(1));
                break;
            case 3:
                arrayList.add(new f3.a(1));
                break;
            case 4:
                o v = n.v(0);
                if (v == null) {
                    arrayList.add(new j3.b());
                    break;
                } else {
                    arrayList.add(v);
                    break;
                }
            case 5:
                arrayList.add(new k3.b());
                break;
            case 6:
                arrayList.add(new w3.f(this.c, this.b ? 0 : 2));
                break;
            case 7:
                arrayList.add(new x3.d(1));
                break;
            case 8:
                mb.b bVar = this.c;
                int g7 = y3.i.g(this.d) | (this.b ? 0 : 32);
                g9.g0 g0Var = g9.i0.b;
                arrayList.add(new y3.i(bVar, g7, null, s1.e, null));
                mb.b bVar2 = this.c;
                int i10 = this.d;
                int i11 = (i10 & 1) == 0 ? 0 : 32;
                if ((2 & i10) != 0) {
                    i11 |= 128;
                }
                arrayList.add(new y3.m(bVar2, i11 | (this.b ? 0 : 16)));
                break;
            case 9:
                arrayList.add(new z3.d());
                break;
            case 10:
                arrayList.add(new l4.z());
                break;
            case 11:
                if (this.a == null) {
                    g9.g0 g0Var2 = g9.i0.b;
                    this.a = s1.e;
                }
                arrayList.add(new l4.d0(1, !this.b ? 1 : 0, this.c, new l0(0L), new l4.f(0, this.a)));
                break;
            case 12:
                m4.c cVar = new m4.c();
                cVar.c = 0;
                cVar.d = -1L;
                cVar.f = -1;
                cVar.g = -1L;
                arrayList.add(cVar);
                break;
            case 14:
                arrayList.add(new m3.a(this.e));
                break;
            case 15:
                o v10 = r.v(new Object[0]);
                if (v10 != null) {
                    arrayList.add(v10);
                    break;
                }
                break;
            case 16:
                arrayList.add(new g3.b(!this.b ? 1 : 0, this.c));
                break;
            case 17:
                arrayList.add(new a4.a(0));
                break;
            case 18:
                arrayList.add(new h3.a(1));
                break;
            case 19:
                arrayList.add(new a4.a(1));
                break;
            case 20:
                arrayList.add(new l3.b(this.f));
                break;
            case 21:
                arrayList.add(new h3.a(0));
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:3:0x0001, B:5:0x0015, B:8:0x001c, B:9:0x0024, B:11:0x002b, B:12:0x0031, B:15:0x0039, B:18:0x003f, B:21:0x0045, B:23:0x0048, B:27:0x004b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:3:0x0001, B:5:0x0015, B:8:0x001c, B:9:0x0024, B:11:0x002b, B:12:0x0031, B:15:0x0039, B:18:0x003f, B:21:0x0045, B:23:0x0048, B:27:0x004b), top: B:2:0x0001 }] */
    @Override // e3.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized o[] b(Uri uri, Map map) {
        ArrayList arrayList;
        String str;
        int a10;
        int b10;
        int i3;
        try {
            int[] iArr = h;
            arrayList = new ArrayList(21);
            List list = (List) map.get("Content-Type");
            if (list != null && !list.isEmpty()) {
                str = (String) list.get(0);
                a10 = eb.a(str);
                if (a10 != -1) {
                    a(a10, arrayList);
                }
                b10 = eb.b(uri);
                if (b10 != -1 && b10 != a10) {
                    a(b10, arrayList);
                }
                for (i3 = 0; i3 < 21; i3++) {
                    int i10 = iArr[i3];
                    if (i10 != a10 && i10 != b10) {
                        a(i10, arrayList);
                    }
                }
            }
            str = null;
            a10 = eb.a(str);
            if (a10 != -1) {
            }
            b10 = eb.b(uri);
            if (b10 != -1) {
                a(b10, arrayList);
            }
            while (i3 < 21) {
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (o[]) arrayList.toArray(new o[0]);
    }
}
