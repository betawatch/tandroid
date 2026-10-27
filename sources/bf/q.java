package bf;

import ef.s;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class q implements hf.a {
    public final char a;
    public int b = 0;
    public final LinkedList c = new LinkedList();

    public q(char c10) {
        this.a = c10;
    }

    @Override // hf.a
    public final int a(e eVar, e eVar2) {
        hf.a aVar;
        int i10 = eVar.g;
        LinkedList linkedList = this.c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = (hf.a) linkedList.getFirst();
                break;
            }
            aVar = (hf.a) it.next();
            if (aVar.c() <= i10) {
                break;
            }
        }
        return aVar.a(eVar, eVar2);
    }

    @Override // hf.a
    public final char b() {
        return this.a;
    }

    @Override // hf.a
    public final int c() {
        return this.b;
    }

    @Override // hf.a
    public final void d(s sVar, s sVar2, int i10) {
        hf.a aVar;
        LinkedList linkedList = this.c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = (hf.a) linkedList.getFirst();
                break;
            } else {
                aVar = (hf.a) it.next();
                if (aVar.c() <= i10) {
                    break;
                }
            }
        }
        aVar.d(sVar, sVar2, i10);
    }

    @Override // hf.a
    public final char e() {
        return this.a;
    }

    public final void f(hf.a aVar) {
        int c10 = aVar.c();
        LinkedList linkedList = this.c;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int c11 = ((hf.a) listIterator.next()).c();
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
