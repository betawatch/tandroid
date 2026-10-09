package fd;

import cf.s;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class k implements ff.a {
    public final char a;
    public int b = 0;
    public final LinkedList c = new LinkedList();

    public k(char c10) {
        this.a = c10;
    }

    @Override // ff.a
    public final int a(ze.b bVar, ze.b bVar2) {
        ff.a aVar;
        int i10 = bVar.g;
        LinkedList linkedList = this.c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = (ff.a) linkedList.getFirst();
                break;
            }
            aVar = (ff.a) it.next();
            if (aVar.d() <= i10) {
                break;
            }
        }
        return aVar.a(bVar, bVar2);
    }

    @Override // ff.a
    public final void b(s sVar, s sVar2, int i10) {
        ff.a aVar;
        LinkedList linkedList = this.c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = (ff.a) linkedList.getFirst();
                break;
            } else {
                aVar = (ff.a) it.next();
                if (aVar.d() <= i10) {
                    break;
                }
            }
        }
        aVar.b(sVar, sVar2, i10);
    }

    @Override // ff.a
    public final char c() {
        return this.a;
    }

    @Override // ff.a
    public final int d() {
        return this.b;
    }

    @Override // ff.a
    public final char e() {
        return this.a;
    }

    public final void f(ff.a aVar) {
        int d = aVar.d();
        LinkedList linkedList = this.c;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int d10 = ((ff.a) listIterator.next()).d();
            if (d > d10) {
                listIterator.previous();
                listIterator.add(aVar);
                return;
            } else if (d == d10) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.a + "' and minimum length " + d);
            }
        }
        linkedList.add(aVar);
        this.b = d;
    }
}
