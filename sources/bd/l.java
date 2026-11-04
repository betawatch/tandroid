package bd;

import gf.s;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class l implements kf.a {
    public final char a;
    public int b = 0;
    public final LinkedList c = new LinkedList();

    public l(char c2) {
        this.a = c2;
    }

    @Override // kf.a
    public final int a(df.e eVar, df.e eVar2) {
        kf.a aVar;
        int i3 = eVar.g;
        LinkedList linkedList = this.c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = (kf.a) linkedList.getFirst();
                break;
            }
            aVar = (kf.a) it.next();
            if (aVar.d() <= i3) {
                break;
            }
        }
        return aVar.a(eVar, eVar2);
    }

    @Override // kf.a
    public final char b() {
        return this.a;
    }

    @Override // kf.a
    public final void c(s sVar, s sVar2, int i3) {
        kf.a aVar;
        LinkedList linkedList = this.c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = (kf.a) linkedList.getFirst();
                break;
            } else {
                aVar = (kf.a) it.next();
                if (aVar.d() <= i3) {
                    break;
                }
            }
        }
        aVar.c(sVar, sVar2, i3);
    }

    @Override // kf.a
    public final int d() {
        return this.b;
    }

    @Override // kf.a
    public final char e() {
        return this.a;
    }

    public final void f(kf.a aVar) {
        int d = aVar.d();
        LinkedList linkedList = this.c;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int d10 = ((kf.a) listIterator.next()).d();
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
