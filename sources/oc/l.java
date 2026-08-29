package oc;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import le.s;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class l implements oe.a {
    public final char a;
    public int b = 0;
    public final LinkedList c = new LinkedList();

    public l(char c3) {
        this.a = c3;
    }

    @Override // oe.a
    public final void a(s sVar, s sVar2, int i10) {
        oe.a aVar;
        LinkedList linkedList = this.c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = (oe.a) linkedList.getFirst();
                break;
            } else {
                aVar = (oe.a) it.next();
                if (aVar.d() <= i10) {
                    break;
                }
            }
        }
        aVar.a(sVar, sVar2, i10);
    }

    @Override // oe.a
    public final char b() {
        return this.a;
    }

    @Override // oe.a
    public final int c(ie.c cVar, ie.c cVar2) {
        oe.a aVar;
        int i10 = cVar.g;
        LinkedList linkedList = this.c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = (oe.a) linkedList.getFirst();
                break;
            }
            aVar = (oe.a) it.next();
            if (aVar.d() <= i10) {
                break;
            }
        }
        return aVar.c(cVar, cVar2);
    }

    @Override // oe.a
    public final int d() {
        return this.b;
    }

    @Override // oe.a
    public final char e() {
        return this.a;
    }

    public final void f(oe.a aVar) {
        int d = aVar.d();
        LinkedList linkedList = this.c;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int d10 = ((oe.a) listIterator.next()).d();
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
