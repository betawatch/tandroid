package o2;

import android.net.Uri;
import d2.g0;
import d2.h1;
import g2.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c implements v2.a {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final e5.a i;
    public final g0 j;
    public final Uri k;
    public final i l;
    public final List m;

    public c(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, i iVar, e5.a aVar, g0 g0Var, Uri uri, ArrayList arrayList) {
        this.a = j10;
        this.b = j11;
        this.c = j12;
        this.d = z10;
        this.e = j13;
        this.f = j14;
        this.g = j15;
        this.h = j16;
        this.l = iVar;
        this.i = aVar;
        this.k = uri;
        this.j = g0Var;
        this.m = arrayList;
    }

    @Override // v2.a
    public final Object a(List list) {
        long j10;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new h1(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j11 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= this.m.size()) {
                break;
            }
            if (((h1) linkedList.peek()).a != i3) {
                long c2 = c(i3);
                if (c2 != -9223372036854775807L) {
                    j11 += c2;
                }
            } else {
                h b10 = b(i3);
                List list2 = b10.c;
                h1 h1Var = (h1) linkedList.poll();
                int i10 = h1Var.a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i11 = h1Var.b;
                    a aVar = (a) list2.get(i11);
                    List list3 = aVar.c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(h1Var.c));
                        h1Var = (h1) linkedList.poll();
                        if (h1Var.a != i10) {
                            break;
                        }
                    } while (h1Var.b == i11);
                    j10 = j11;
                    arrayList2.add(new a(aVar.a, aVar.b, arrayList3, aVar.d, aVar.e, aVar.f));
                    if (h1Var.a != i10) {
                        break;
                    }
                    j11 = j10;
                }
                linkedList.addFirst(h1Var);
                arrayList.add(new h(b10.a, b10.b - j10, arrayList2, b10.d));
                j11 = j10;
            }
            i3++;
        }
        long j12 = j11;
        long j13 = this.b;
        return new c(this.a, j13 != -9223372036854775807L ? j13 - j12 : -9223372036854775807L, this.c, this.d, this.e, this.f, this.g, this.h, this.l, this.i, this.j, this.k, arrayList);
    }

    public final h b(int i3) {
        return (h) this.m.get(i3);
    }

    public final long c(int i3) {
        long j10;
        long j11;
        List list = this.m;
        if (i3 == list.size() - 1) {
            j10 = this.b;
            if (j10 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j11 = ((h) list.get(i3)).b;
        } else {
            j10 = ((h) list.get(i3 + 1)).b;
            j11 = ((h) list.get(i3)).b;
        }
        return j10 - j11;
    }

    public final long d(int i3) {
        return n0.S(c(i3));
    }
}
