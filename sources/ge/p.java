package ge;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import je.s;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class p implements me.a {
    public final char a;
    public int b = 0;
    public final LinkedList c = new LinkedList();

    public p(char c10) {
        this.a = c10;
    }

    @Override // me.a
    public final char a() {
        return this.a;
    }

    @Override // me.a
    public final void b(s sVar, s sVar2, int i10) {
        me.a aVar;
        LinkedList linkedList = this.c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = (me.a) linkedList.getFirst();
                break;
            } else {
                aVar = (me.a) it.next();
                if (aVar.d() <= i10) {
                    break;
                }
            }
        }
        aVar.b(sVar, sVar2, i10);
    }

    @Override // me.a
    public final int c(c cVar, c cVar2) {
        me.a aVar;
        int i10 = cVar.g;
        LinkedList linkedList = this.c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = (me.a) linkedList.getFirst();
                break;
            }
            aVar = (me.a) it.next();
            if (aVar.d() <= i10) {
                break;
            }
        }
        return aVar.c(cVar, cVar2);
    }

    @Override // me.a
    public final int d() {
        return this.b;
    }

    @Override // me.a
    public final char e() {
        return this.a;
    }

    public final void f(me.a aVar) {
        int d = aVar.d();
        LinkedList linkedList = this.c;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int d10 = ((me.a) listIterator.next()).d();
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
