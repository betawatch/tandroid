package ed;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import kf.s;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class k implements nf.a {
    public final char a;
    public int b = 0;
    public final LinkedList c = new LinkedList();

    public k(char c10) {
        this.a = c10;
    }

    @Override // nf.a
    public final void a(s sVar, s sVar2, int i7) {
        nf.a aVar;
        LinkedList linkedList = this.c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = (nf.a) linkedList.getFirst();
                break;
            } else {
                aVar = (nf.a) it.next();
                if (aVar.d() <= i7) {
                    break;
                }
            }
        }
        aVar.a(sVar, sVar2, i7);
    }

    @Override // nf.a
    public final char b() {
        return this.a;
    }

    @Override // nf.a
    public final int c(gf.e eVar, gf.e eVar2) {
        nf.a aVar;
        int i7 = eVar.g;
        LinkedList linkedList = this.c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = (nf.a) linkedList.getFirst();
                break;
            }
            aVar = (nf.a) it.next();
            if (aVar.d() <= i7) {
                break;
            }
        }
        return aVar.c(eVar, eVar2);
    }

    @Override // nf.a
    public final int d() {
        return this.b;
    }

    @Override // nf.a
    public final char e() {
        return this.a;
    }

    public final void f(nf.a aVar) {
        int d = aVar.d();
        LinkedList linkedList = this.c;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int d2 = ((nf.a) listIterator.next()).d();
            if (d > d2) {
                listIterator.previous();
                listIterator.add(aVar);
                return;
            } else if (d == d2) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.a + "' and minimum length " + d);
            }
        }
        linkedList.add(aVar);
        this.b = d;
    }
}
