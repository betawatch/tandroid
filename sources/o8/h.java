package o8;

import h7.f0;
import java.util.Iterator;
import java.util.NoSuchElementException;
import m1.j;
import m5.o;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class h implements Iterator {
    public String b;
    public final CharSequence c;
    public final a d;
    public int f;
    public final /* synthetic */ o h;
    public int a = 2;
    public int e = 0;

    public h(o oVar, b6.a aVar, CharSequence charSequence) {
        this.h = oVar;
        this.d = (a) aVar.b;
        this.f = aVar.c;
        this.c = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        a aVar;
        int i10 = this.a;
        if (i10 == 4) {
            throw new IllegalStateException();
        }
        int b10 = j.b(i10);
        if (b10 == 0) {
            return true;
        }
        if (b10 == 2) {
            return false;
        }
        this.a = 4;
        int i11 = this.e;
        while (true) {
            int i12 = this.e;
            if (i12 == -1) {
                this.a = 3;
                str = null;
                break;
            }
            b bVar = (b) this.h.b;
            CharSequence charSequence = this.c;
            int length = charSequence.length();
            f0.c(i12, length);
            while (true) {
                if (i12 >= length) {
                    i12 = -1;
                    break;
                }
                if (bVar.a(charSequence.charAt(i12))) {
                    break;
                }
                i12++;
            }
            if (i12 == -1) {
                i12 = charSequence.length();
                this.e = -1;
            } else {
                this.e = i12 + 1;
            }
            int i13 = this.e;
            if (i13 == i11) {
                int i14 = i13 + 1;
                this.e = i14;
                if (i14 > charSequence.length()) {
                    this.e = -1;
                }
            } else {
                while (true) {
                    aVar = this.d;
                    if (i11 >= i12 || !aVar.a(charSequence.charAt(i11))) {
                        break;
                    }
                    i11++;
                }
                while (i12 > i11 && aVar.a(charSequence.charAt(i12 - 1))) {
                    i12--;
                }
                int i15 = this.f;
                if (i15 == 1) {
                    i12 = charSequence.length();
                    this.e = -1;
                    while (i12 > i11 && aVar.a(charSequence.charAt(i12 - 1))) {
                        i12--;
                    }
                } else {
                    this.f = i15 - 1;
                }
                str = charSequence.subSequence(i11, i12).toString();
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
