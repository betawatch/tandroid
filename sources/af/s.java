package af;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class s implements gf.a {
    public final char a;
    public int b = 0;
    public final LinkedList c = new LinkedList();

    public s(char c10) {
        this.a = c10;
    }

    @Override // gf.a
    public final char a() {
        return this.a;
    }

    @Override // gf.a
    public final void b(df.s sVar, df.s sVar2, int i10) {
        gf.a aVar;
        LinkedList linkedList = this.c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = (gf.a) linkedList.getFirst();
                break;
            } else {
                aVar = (gf.a) it.next();
                if (aVar.c() <= i10) {
                    break;
                }
            }
        }
        aVar.b(sVar, sVar2, i10);
    }

    @Override // gf.a
    public final int c() {
        return this.b;
    }

    @Override // gf.a
    public final int d(f fVar, f fVar2) {
        gf.a aVar;
        int i10 = fVar.g;
        LinkedList linkedList = this.c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = (gf.a) linkedList.getFirst();
                break;
            }
            aVar = (gf.a) it.next();
            if (aVar.c() <= i10) {
                break;
            }
        }
        return aVar.d(fVar, fVar2);
    }

    @Override // gf.a
    public final char e() {
        return this.a;
    }

    public final void f(gf.a aVar) {
        int c10 = aVar.c();
        LinkedList linkedList = this.c;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int c11 = ((gf.a) listIterator.next()).c();
            if (c10 > c11) {
                listIterator.previous();
                listIterator.add(aVar);
                return;
            } else if (c10 == c11) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.a + "' and minimum length " + c10);
            }
        }
        linkedList.add(aVar);
        this.b = c10;
    }
}
