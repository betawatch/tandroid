package c3;

import android.net.Uri;
import e9.a1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class m implements r {
    public static final int[] e = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final n4.y f = new n4.y(new androidx.emoji2.text.w(18));
    public static final n4.y h = new n4.y(new androidx.emoji2.text.w(19));
    public a1 a;
    public int d;
    public rb.a c = new rb.a(28);
    public boolean b = true;

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
                o G = f.G(0);
                if (G == null) {
                    arrayList.add(new h3.b());
                    break;
                } else {
                    arrayList.add(G);
                    break;
                }
            case 5:
                arrayList.add(new i3.b());
                break;
            case 6:
                arrayList.add(new u3.d(this.c, this.b ? 0 : 2));
                break;
            case 7:
                arrayList.add(new v3.d(1));
                break;
            case 8:
                rb.a aVar = this.c;
                int i11 = this.b ? 0 : 32;
                e9.g0 g0Var = e9.i0.b;
                arrayList.add(new w3.h(aVar, i11, null, a1.e, null));
                arrayList.add(new w3.k(this.c, this.b ? 0 : 16));
                break;
            case 9:
                arrayList.add(new x3.d());
                break;
            case 10:
                arrayList.add(new j4.z());
                break;
            case 11:
                if (this.a == null) {
                    e9.g0 g0Var2 = e9.i0.b;
                    this.a = a1.e;
                }
                arrayList.add(new j4.d0(1, !this.b ? 1 : 0, this.c, new e2.b0(0L), new j4.f(0, this.a)));
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
                arrayList.add(new k3.a(this.d));
                break;
            case 15:
                o G2 = h.G(new Object[0]);
                if (G2 != null) {
                    arrayList.add(G2);
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
                arrayList.add(new f3.a(2));
                break;
            case 19:
                arrayList.add(new g3.a(0));
                break;
            case 20:
                arrayList.add(new f3.a(1));
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
    public final synchronized o[] c(Uri uri, Map map) {
        ArrayList arrayList;
        String str;
        int a2;
        int b10;
        int i10;
        try {
            int[] iArr = e;
            arrayList = new ArrayList(21);
            List list = (List) map.get("Content-Type");
            if (list != null && !list.isEmpty()) {
                str = (String) list.get(0);
                a2 = v7.g0.a(str);
                if (a2 != -1) {
                    a(a2, arrayList);
                }
                b10 = v7.g0.b(uri);
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
            a2 = v7.g0.a(str);
            if (a2 != -1) {
            }
            b10 = v7.g0.b(uri);
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
