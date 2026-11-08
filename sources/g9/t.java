package g9;

import a8.ia;
import a8.wa;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class t implements Iterator {
    public String b;
    public final CharSequence c;
    public final i d;
    public int f;
    public final /* synthetic */ d6.i h;
    public int a = 2;
    public int e = 0;

    public t(d6.i iVar, wa waVar, CharSequence charSequence) {
        this.h = iVar;
        this.d = (i) waVar.c;
        this.f = waVar.b;
        this.c = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        i iVar;
        ia.p(this.a != 4);
        int c10 = p1.g.c(this.a);
        if (c10 == 0) {
            return true;
        }
        if (c10 != 2) {
            this.a = 4;
            int i7 = this.e;
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
                ia.m(i10, length);
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
                if (i11 == i7) {
                    int i12 = i11 + 1;
                    this.e = i12;
                    if (i12 > charSequence.length()) {
                        this.e = -1;
                    }
                } else {
                    while (true) {
                        iVar = this.d;
                        if (i7 >= i10 || !iVar.c(charSequence.charAt(i7))) {
                            break;
                        }
                        i7++;
                    }
                    while (i10 > i7 && iVar.c(charSequence.charAt(i10 - 1))) {
                        i10--;
                    }
                    int i13 = this.f;
                    if (i13 == 1) {
                        i10 = charSequence.length();
                        this.e = -1;
                        while (i10 > i7 && iVar.c(charSequence.charAt(i10 - 1))) {
                            i10--;
                        }
                    } else {
                        this.f = i13 - 1;
                    }
                    str = charSequence.subSequence(i7, i10).toString();
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
