package d9;

import java.util.Iterator;
import java.util.NoSuchElementException;
import v7.u6;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class t implements Iterator {
    public String b;
    public final CharSequence c;
    public final i d;
    public int f;
    public final /* synthetic */ ya.c h;
    public int a = 2;
    public int e = 0;

    public t(ya.c cVar, a5.a aVar, CharSequence charSequence) {
        this.h = cVar;
        this.d = (i) aVar.c;
        this.f = aVar.b;
        this.c = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        i iVar;
        u6.p(this.a != 4);
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
                u6.m(i11, length);
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
