package m2;

import android.net.Uri;
import b2.d0;
import b2.e1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
    public final u i;
    public final d0 j;
    public final Uri k;
    public final i l;
    public final List m;

    public c(long j3, long j10, long j11, boolean z10, long j12, long j13, long j14, long j15, i iVar, u uVar, d0 d0Var, Uri uri, ArrayList arrayList) {
        this.a = j3;
        this.b = j10;
        this.c = j11;
        this.d = z10;
        this.e = j12;
        this.f = j13;
        this.g = j14;
        this.h = j15;
        this.l = iVar;
        this.i = uVar;
        this.k = uri;
        this.j = d0Var;
        this.m = arrayList;
    }

    @Override // t2.a
    public final Object a(List list) {
        long j3;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new e1(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j10 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= this.m.size()) {
                break;
            }
            if (((e1) linkedList.peek()).a != i10) {
                long c10 = c(i10);
                if (c10 != -9223372036854775807L) {
                    j10 += c10;
                }
            } else {
                h b10 = b(i10);
                List list2 = b10.c;
                e1 e1Var = (e1) linkedList.poll();
                int i11 = e1Var.a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i12 = e1Var.b;
                    a aVar = (a) list2.get(i12);
                    List list3 = aVar.c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(e1Var.c));
                        e1Var = (e1) linkedList.poll();
                        if (e1Var.a != i11) {
                            break;
                        }
                    } while (e1Var.b == i12);
                    j3 = j10;
                    arrayList2.add(new a(aVar.a, aVar.b, arrayList3, aVar.d, aVar.e, aVar.f));
                    if (e1Var.a != i11) {
                        break;
                    }
                    j10 = j3;
                }
                linkedList.addFirst(e1Var);
                arrayList.add(new h(b10.a, b10.b - j3, arrayList2, b10.d));
                j10 = j3;
            }
            i10++;
        }
        long j11 = j10;
        long j12 = this.b;
        return new c(this.a, j12 != -9223372036854775807L ? j12 - j11 : -9223372036854775807L, this.c, this.d, this.e, this.f, this.g, this.h, this.l, this.i, this.j, this.k, arrayList);
    }

    public final h b(int i10) {
        return (h) this.m.get(i10);
    }

    public final long c(int i10) {
        List list = this.m;
        if (i10 != list.size() - 1) {
            return ((h) list.get(i10 + 1)).b - ((h) list.get(i10)).b;
        }
        long j3 = this.b;
        if (j3 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j3 - ((h) list.get(i10)).b;
    }

    public final long d(int i10) {
        return e2.d0.Q(c(i10));
    }
}
