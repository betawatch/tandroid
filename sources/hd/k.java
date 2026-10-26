package hd;

import ef.s;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class k implements hf.a {
    public final char a;
    public int b = 0;
    public final LinkedList c = new LinkedList();

    public k(char c10) {
        this.a = c10;
    }

    @Override // hf.a
    public final int a(bf.e eVar, bf.e eVar2) {
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
