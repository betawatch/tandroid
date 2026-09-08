package ed;

import bf.s;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class k implements ef.a {
    public final char a;
    public int b = 0;
    public final LinkedList c = new LinkedList();

    public k(char c10) {
        this.a = c10;
    }

    @Override // ef.a
    public final char a() {
        return this.a;
    }

    @Override // ef.a
    public final int b(ye.b bVar, ye.b bVar2) {
        ef.a aVar;
        int i10 = bVar.g;
        LinkedList linkedList = this.c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = (ef.a) linkedList.getFirst();
                break;
            }
            aVar = (ef.a) it.next();
            if (aVar.c() <= i10) {
                break;
            }
        }
        return aVar.b(bVar, bVar2);
    }

    @Override // ef.a
    public final int c() {
        return this.b;
    }

    @Override // ef.a
    public final void d(s sVar, s sVar2, int i10) {
        ef.a aVar;
        LinkedList linkedList = this.c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = (ef.a) linkedList.getFirst();
                break;
            } else {
                aVar = (ef.a) it.next();
                if (aVar.c() <= i10) {
                    break;
                }
            }
        }
        aVar.d(sVar, sVar2, i10);
    }

    @Override // ef.a
    public final char e() {
        return this.a;
    }

    public final void f(ef.a aVar) {
        int c10 = aVar.c();
        LinkedList linkedList = this.c;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int c11 = ((ef.a) listIterator.next()).c();
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
