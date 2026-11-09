package f3;

import a8.v9;
import android.net.Uri;
import di.a1;
import h9.t1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class m implements r {
    public static final int[] h = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final wf.b n = new wf.b(new a1(19));
    public static final wf.b r = new wf.b(new a1(20));
    public t1 a;
    public int e;
    public int f;
    public w7.s c = new w7.s(5, false);
    public boolean b = true;
    public int d = 3;

    public final void a(int i7, ArrayList arrayList) {
        switch (i7) {
            case 0:
                arrayList.add(new m4.a());
                break;
            case 1:
                arrayList.add(new m4.c());
                break;
            case 2:
                arrayList.add(new m4.d(1));
                break;
            case 3:
                arrayList.add(new g3.a(1));
                break;
            case 4:
                o Y = n.Y(0);
                if (Y == null) {
                    arrayList.add(new k3.b());
                    break;
                } else {
                    arrayList.add(Y);
                    break;
                }
            case 5:
                arrayList.add(new l3.b());
                break;
            case 6:
                arrayList.add(new x3.f(this.c, this.b ? 0 : 2));
                break;
            case 7:
                arrayList.add(new y3.d(1));
                break;
            case 8:
                w7.s sVar = this.c;
                int g10 = z3.h.g(this.d) | (this.b ? 0 : 32);
                h9.g0 g0Var = h9.i0.b;
                arrayList.add(new z3.h(sVar, g10, null, t1.e, null));
                w7.s sVar2 = this.c;
                int i10 = this.d;
                int i11 = (i10 & 1) == 0 ? 0 : 32;
                if ((2 & i10) != 0) {
                    i11 |= 128;
                }
                arrayList.add(new z3.m(sVar2, i11 | (this.b ? 0 : 16)));
                break;
            case 9:
                arrayList.add(new a4.e());
                break;
            case 10:
                arrayList.add(new m4.z());
                break;
            case 11:
                if (this.a == null) {
                    h9.g0 g0Var2 = h9.i0.b;
                    this.a = t1.e;
                }
                arrayList.add(new m4.e0(1, !this.b ? 1 : 0, this.c, new h2.k0(0L), new m4.f(0, this.a)));
                break;
            case 12:
                n4.c cVar = new n4.c();
                cVar.c = 0;
                cVar.d = -1L;
                cVar.f = -1;
                cVar.g = -1L;
                arrayList.add(cVar);
                break;
            case 14:
                arrayList.add(new n3.a(this.e));
                break;
            case 15:
                o Y2 = r.Y(new Object[0]);
                if (Y2 != null) {
                    arrayList.add(Y2);
                    break;
                }
                break;
            case 16:
                arrayList.add(new h3.b(!this.b ? 1 : 0, this.c));
                break;
            case 17:
                arrayList.add(new b4.a(0));
                break;
            case 18:
                arrayList.add(new i3.a(1));
                break;
            case 19:
                arrayList.add(new b4.a(1));
                break;
            case 20:
                arrayList.add(new m3.b(this.f));
                break;
            case 21:
                arrayList.add(new i3.a(0));
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:3:0x0001, B:5:0x0015, B:8:0x001c, B:9:0x0024, B:11:0x002b, B:12:0x0031, B:15:0x0039, B:18:0x003f, B:21:0x0045, B:23:0x0048, B:27:0x004b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:3:0x0001, B:5:0x0015, B:8:0x001c, B:9:0x0024, B:11:0x002b, B:12:0x0031, B:15:0x0039, B:18:0x003f, B:21:0x0045, B:23:0x0048, B:27:0x004b), top: B:2:0x0001 }] */
    @Override // f3.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized o[] e(Uri uri, Map map) {
        ArrayList arrayList;
        String str;
        int a10;
        int b10;
        int i7;
        try {
            int[] iArr = h;
            arrayList = new ArrayList(21);
            List list = (List) map.get("Content-Type");
            if (list != null && !list.isEmpty()) {
                str = (String) list.get(0);
                a10 = v9.a(str);
                if (a10 != -1) {
                    a(a10, arrayList);
                }
                b10 = v9.b(uri);
                if (b10 != -1 && b10 != a10) {
                    a(b10, arrayList);
                }
                for (i7 = 0; i7 < 21; i7++) {
                    int i10 = iArr[i7];
                    if (i10 != a10 && i10 != b10) {
                        a(i10, arrayList);
                    }
                }
            }
            str = null;
            a10 = v9.a(str);
            if (a10 != -1) {
            }
            b10 = v9.b(uri);
            if (b10 != -1) {
                a(b10, arrayList);
            }
            while (i7 < 21) {
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (o[]) arrayList.toArray(new o[0]);
    }
}
