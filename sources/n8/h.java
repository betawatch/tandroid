package n8;

import g7.d0;
import java.util.Iterator;
import java.util.NoSuchElementException;
import m1.j;
import n5.e0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class h implements Iterator {
    public String b;
    public final CharSequence c;
    public final a d;
    public int f;
    public final /* synthetic */ e0 h;
    public int a = 2;
    public int e = 0;

    public h(e0 e0Var, a6.a aVar, CharSequence charSequence) {
        this.h = e0Var;
        this.d = (a) aVar.b;
        this.f = aVar.c;
        this.c = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        a aVar;
        int i9 = this.a;
        if (i9 == 4) {
            throw new IllegalStateException();
        }
        int b10 = j.b(i9);
        if (b10 == 0) {
            return true;
        }
        if (b10 == 2) {
            return false;
        }
        this.a = 4;
        int i10 = this.e;
        while (true) {
            int i11 = this.e;
            if (i11 == -1) {
                this.a = 3;
                str = null;
                break;
            }
            b bVar = (b) this.h.b;
            CharSequence charSequence = this.c;
            int length = charSequence.length();
            d0.c(i11, length);
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                }
                if (bVar.a(charSequence.charAt(i11))) {
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
                    aVar = this.d;
                    if (i10 >= i11 || !aVar.a(charSequence.charAt(i10))) {
                        break;
                    }
                    i10++;
                }
                while (i11 > i10 && aVar.a(charSequence.charAt(i11 - 1))) {
                    i11--;
                }
                int i14 = this.f;
                if (i14 == 1) {
                    i11 = charSequence.length();
                    this.e = -1;
                    while (i11 > i10 && aVar.a(charSequence.charAt(i11 - 1))) {
                        i11--;
                    }
                } else {
                    this.f = i14 - 1;
                }
                str = charSequence.subSequence(i10, i11).toString();
            }
        }
        this.b = str;
        if (this.a == 3) {
            return false;
        }
        this.a = 1;
        return true;
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
