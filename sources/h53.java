// default package

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class h53 implements ie4 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final ce3 i;
    public final vq6 j;
    public final ks8 k;
    public final List l;
    public final mm5 m;

    public h53(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, ks8 ks8Var, ce3 ce3Var, vq6 vq6Var, ArrayList arrayList, List list) {
        mm5 q;
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = j7;
        this.k = ks8Var;
        this.i = ce3Var;
        this.j = vq6Var;
        this.l = arrayList;
        if (list == null) {
            km5 km5Var = mm5.b;
            q = w59.e;
        } else {
            q = mm5.q(list);
        }
        this.m = q;
        if (list == null || list.isEmpty()) {
            return;
        }
        Uri uri = ((s96) jle.b(list)).a;
    }

    @Override // ie4
    public final Object a(List list) {
        int i;
        long j;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new t8b(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j2 = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= this.l.size()) {
                break;
            }
            t8b t8bVar = (t8b) linkedList.peek();
            t8bVar.getClass();
            if (t8bVar.a != i2) {
                long c = c(i2);
                if (c != -9223372036854775807L) {
                    j2 += c;
                }
            } else {
                f38 b = b(i2);
                List list2 = b.c;
                t8b t8bVar2 = (t8b) linkedList.poll();
                t8bVar2.getClass();
                int i3 = t8bVar2.a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i4 = t8bVar2.b;
                    ea eaVar = (ea) list2.get(i4);
                    List list3 = eaVar.c;
                    ArrayList arrayList3 = new ArrayList();
                    while (true) {
                        arrayList3.add((i89) list3.get(t8bVar2.c));
                        t8bVar2 = (t8b) linkedList.poll();
                        t8bVar2.getClass();
                        i = t8bVar2.a;
                        j = j2;
                        if (i != i3 || t8bVar2.b != i4) {
                            break;
                        }
                        j2 = j;
                    }
                    arrayList2.add(new ea(eaVar.a, eaVar.b, arrayList3, eaVar.d, eaVar.e, eaVar.f));
                    if (i != i3) {
                        break;
                    }
                    j2 = j;
                }
                linkedList.addFirst(t8bVar2);
                arrayList.add(new f38(b.a, b.b - j, arrayList2, b.d));
                j2 = j;
            }
            i2++;
        }
        long j3 = j2;
        long j4 = this.b;
        return new h53(this.a, j4 != -9223372036854775807L ? j4 - j3 : -9223372036854775807L, this.c, this.d, this.e, this.f, this.g, this.h, this.k, this.i, this.j, arrayList, this.m);
    }

    public final f38 b(int i) {
        return (f38) this.l.get(i);
    }

    public final long c(int i) {
        long j;
        long j2;
        List list = this.l;
        if (i == list.size() - 1) {
            j = this.b;
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j2 = ((f38) list.get(i)).b;
        } else {
            j = ((f38) list.get(i + 1)).b;
            j2 = ((f38) list.get(i)).b;
        }
        return j - j2;
    }

    public final long d(int i) {
        return g8c.T(c(i));
    }
}
