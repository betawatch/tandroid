package e9;

import a8.ng;
import a8.yb;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class s implements Iterator {
    public String b;
    public final CharSequence c;
    public final i d;
    public int f;
    public final /* synthetic */ za.c h;
    public int a = 2;
    public int e = 0;

    public s(za.c cVar, ng ngVar, CharSequence charSequence) {
        this.h = cVar;
        this.d = (i) ngVar.c;
        this.f = ngVar.b;
        this.c = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        i iVar;
        yb.p(this.a != 4);
        int c10 = m1.j.c(this.a);
        if (c10 == 0) {
            return true;
        }
        if (c10 != 2) {
            this.a = 4;
            int i10 = this.e;
            while (true) {
                int i11 = this.e;
                if (i11 == -1) {
                    this.a = 3;
                    str = null;
                    break;
                }
                e eVar = (e) this.h.b;
                CharSequence charSequence = this.c;
                int length = charSequence.length();
                yb.m(i11, length);
                while (true) {
                    if (i11 >= length) {
                        i11 = -1;
                        break;
                    }
                    if (eVar.c(charSequence.charAt(i11))) {
                        break;
                    }
                    i11++;
                }
                if (i11 == -1) {
                    i11 = charSequence.length();
                    this.e = -1;
                } else {
                    this.e = i11 + 1;
                }
                int i12 = this.e;
                if (i12 == i10) {
                    int i13 = i12 + 1;
                    this.e = i13;
                    if (i13 > charSequence.length()) {
                        this.e = -1;
                    }
                } else {
                    while (true) {
                        iVar = this.d;
                        if (i10 >= i11 || !iVar.c(charSequence.charAt(i10))) {
                            break;
                        }
                        i10++;
                    }
                    while (i11 > i10 && iVar.c(charSequence.charAt(i11 - 1))) {
                        i11--;
                    }
                    int i14 = this.f;
                    if (i14 == 1) {
                        i11 = charSequence.length();
                        this.e = -1;
                        while (i11 > i10 && iVar.c(charSequence.charAt(i11 - 1))) {
                            i11--;
                        }
                    } else {
                        this.f = i14 - 1;
                    }
                    str = charSequence.subSequence(i10, i11).toString();
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
