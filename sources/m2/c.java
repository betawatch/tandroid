package m2;

import android.net.Uri;
import b2.i0;
import b2.i1;
import e2.l0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c implements t2.a {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final c5.a i;
    public final i0 j;
    public final Uri k;
    public final i l;
    public final List m;

    public c(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, i iVar, c5.a aVar, i0 i0Var, Uri uri, ArrayList arrayList) {
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
        this.j = i0Var;
        this.m = arrayList;
    }

    @Override // t2.a
    public final Object a(List list) {
        long j10;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new i1(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j11 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= this.m.size()) {
                break;
            }
            if (((i1) linkedList.peek()).a != i10) {
                long c10 = c(i10);
                if (c10 != -9223372036854775807L) {
                    j11 += c10;
                }
            } else {
                h b10 = b(i10);
                List list2 = b10.c;
                i1 i1Var = (i1) linkedList.poll();
                int i11 = i1Var.a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i12 = i1Var.b;
                    a aVar = (a) list2.get(i12);
                    List list3 = aVar.c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(i1Var.c));
                        i1Var = (i1) linkedList.poll();
                        if (i1Var.a != i11) {
                            break;
                        }
                    } while (i1Var.b == i12);
                    j10 = j11;
                    arrayList2.add(new a(aVar.a, aVar.b, arrayList3, aVar.d, aVar.e, aVar.f));
                    if (i1Var.a != i11) {
                        break;
                    }
                    j11 = j10;
                }
                linkedList.addFirst(i1Var);
                arrayList.add(new h(b10.a, b10.b - j10, arrayList2, b10.d));
                j11 = j10;
            }
            i10++;
        }
        long j12 = j11;
        long j13 = this.b;
        return new c(this.a, j13 != -9223372036854775807L ? j13 - j12 : -9223372036854775807L, this.c, this.d, this.e, this.f, this.g, this.h, this.l, this.i, this.j, this.k, arrayList);
    }

    public final h b(int i10) {
        return (h) this.m.get(i10);
    }

    public final long c(int i10) {
        long j10;
        long j11;
        List list = this.m;
        if (i10 == list.size() - 1) {
            j10 = this.b;
            if (j10 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j11 = ((h) list.get(i10)).b;
        } else {
            j10 = ((h) list.get(i10 + 1)).b;
            j11 = ((h) list.get(i10)).b;
        }
        return j10 - j11;
    }

    public final long d(int i10) {
        return l0.S(c(i10));
    }
}
