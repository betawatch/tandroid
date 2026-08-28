package fe;

import ie.s;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class p implements le.a {
    public final char a;
    public int b = 0;
    public final LinkedList c = new LinkedList();

    public p(char c10) {
        this.a = c10;
    }

    @Override // le.a
    public final int a(c cVar, c cVar2) {
        le.a aVar;
        int i9 = cVar.g;
        LinkedList linkedList = this.c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = (le.a) linkedList.getFirst();
                break;
            }
            aVar = (le.a) it.next();
            if (aVar.d() <= i9) {
                break;
            }
        }
        return aVar.a(cVar, cVar2);
    }

    @Override // le.a
    public final void b(s sVar, s sVar2, int i9) {
        le.a aVar;
        LinkedList linkedList = this.c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = (le.a) linkedList.getFirst();
                break;
            } else {
                aVar = (le.a) it.next();
                if (aVar.d() <= i9) {
                    break;
                }
            }
        }
        aVar.b(sVar, sVar2, i9);
    }

    @Override // le.a
    public final char c() {
        return this.a;
    }

    @Override // le.a
    public final int d() {
        return this.b;
    }

    @Override // le.a
    public final char e() {
        return this.a;
    }

    public final void f(le.a aVar) {
        int d = aVar.d();
        LinkedList linkedList = this.c;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int d9 = ((le.a) listIterator.next()).d();
            if (d > d9) {
                listIterator.previous();
                listIterator.add(aVar);
                return;
            } else if (d == d9) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.a + "' and minimum length " + d);
            }
        }
        linkedList.add(aVar);
        this.b = d;
    }
}
