// default package

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class db3 implements h84 {
    public static final int[] e = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final lh2 f = new lh2(new da3((byte) 10));
    public static final lh2 h = new lh2(new da3((byte) 11));
    public j99 a;
    public uif b = new uif(17);
    public boolean c;
    public boolean d;

    public final void a(int i, ArrayList arrayList) {
        switch (i) {
            case 0:
                arrayList.add(new f4());
                break;
            case 1:
                arrayList.add(new h4());
                break;
            case 2:
                arrayList.add(new lb(1));
                break;
            case 3:
                arrayList.add(new qj(1));
                break;
            case 4:
                e84 s = f.s(0);
                if (s == null) {
                    arrayList.add(new ek4());
                    break;
                } else {
                    arrayList.add(s);
                    break;
                }
            case 5:
                arrayList.add(new hn4());
                break;
            case 6:
                arrayList.add(new vl6(this.b, 0));
                break;
            case 7:
                arrayList.add(new qh7(1));
                break;
            case 8:
                uif uifVar = this.b;
                int g = 512 | hr4.g(3);
                no5 no5Var = po5.b;
                arrayList.add(new hr4(uifVar, g, null, j99.e, null));
                arrayList.add(new yh7(this.b, jn7.p2));
                break;
            case 9:
                arrayList.add(new hr7());
                break;
            case 10:
                arrayList.add(new rx8());
                break;
            case 11:
                if (this.a == null) {
                    no5 no5Var2 = po5.b;
                    this.a = j99.e;
                }
                arrayList.add(new j6c(1, 0, this.b, new usb(0L), new ed(0, this.a, (byte) 6)));
                break;
            case 12:
                gwc gwcVar = new gwc();
                gwcVar.c = (byte) 0;
                gwcVar.d = -1L;
                gwcVar.f = -1;
                gwcVar.g = -1L;
                arrayList.add(gwcVar);
                break;
            case 14:
                arrayList.add(new xf5(this.c ? 1 : 0, (byte) 1));
                break;
            case 15:
                e84 s2 = h.s(new Object[0]);
                if (s2 != null) {
                    arrayList.add(s2);
                    break;
                }
                break;
            case 16:
                arrayList.add(new sc0(0, this.b));
                break;
            case 17:
                arrayList.add(new zl0((byte) 1));
                break;
            case 18:
                arrayList.add(new vc0((byte) 1));
                break;
            case 19:
                arrayList.add(new zl0((byte) 0));
                break;
            case 20:
                arrayList.add(new xf5(this.d ? 1 : 0, (byte) 0));
                break;
            case 21:
                arrayList.add(new vc0((byte) 0));
                break;
        }
    }

    @Override // h84
    public final synchronized e84[] b(Uri uri, Map map) {
        ArrayList arrayList;
        int[] iArr = e;
        arrayList = new ArrayList(21);
        List list = (List) map.get("Content-Type");
        int a = zke.a((list == null || list.isEmpty()) ? null : (String) list.get(0));
        if (a != -1) {
            a(a, arrayList);
        }
        int b = zke.b(uri);
        if (b != -1 && b != a) {
            a(b, arrayList);
        }
        for (int i = 0; i < 21; i++) {
            int i2 = iArr[i];
            if (i2 != a && i2 != b) {
                a(i2, arrayList);
            }
        }
        return (e84[]) arrayList.toArray(new e84[0]);
    }
}
