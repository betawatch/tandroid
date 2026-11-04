package f9;

import b8.kg;
import b8.zb;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class s implements Iterator {
    public String b;
    public final CharSequence c;
    public final i d;
    public int f;
    public final /* synthetic */ bb.c h;
    public int a = 2;
    public int e = 0;

    public s(bb.c cVar, kg kgVar, CharSequence charSequence) {
        this.h = cVar;
        this.d = (i) kgVar.c;
        this.f = kgVar.b;
        this.c = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        i iVar;
        zb.p(this.a != 4);
        int c2 = o1.g.c(this.a);
        if (c2 == 0) {
            return true;
        }
        if (c2 != 2) {
            this.a = 4;
            int i3 = this.e;
            while (true) {
                int i10 = this.e;
                if (i10 == -1) {
                    this.a = 3;
                    str = null;
                    break;
                }
                e eVar = (e) this.h.b;
                CharSequence charSequence = this.c;
                int length = charSequence.length();
                zb.m(i10, length);
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    }
                    if (eVar.c(charSequence.charAt(i10))) {
                        break;
                    }
                    i10++;
                }
                if (i10 == -1) {
                    i10 = charSequence.length();
                    this.e = -1;
                } else {
                    this.e = i10 + 1;
                }
                int i11 = this.e;
                if (i11 == i3) {
                    int i12 = i11 + 1;
                    this.e = i12;
                    if (i12 > charSequence.length()) {
                        this.e = -1;
                    }
                } else {
                    while (true) {
                        iVar = this.d;
                        if (i3 >= i10 || !iVar.c(charSequence.charAt(i3))) {
                            break;
                        }
                        i3++;
                    }
                    while (i10 > i3 && iVar.c(charSequence.charAt(i10 - 1))) {
                        i10--;
                    }
                    int i13 = this.f;
                    if (i13 == 1) {
                        i10 = charSequence.length();
                        this.e = -1;
                        while (i10 > i3 && iVar.c(charSequence.charAt(i10 - 1))) {
                            i10--;
                        }
                    } else {
                        this.f = i13 - 1;
                    }
                    str = charSequence.subSequence(i3, i10).toString();
                }
            }
            this.b = str;
            if (this.a != 3) {
                this.a = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = 2;
        String str = this.b;
        this.b = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
