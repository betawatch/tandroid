// default package

import java.util.AbstractMap;
import java.util.Iterator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class jp2 implements Iterator {
    public final /* synthetic */ byte a = 0;
    public int b;
    public int c;
    public int d;
    public final /* synthetic */ AbstractMap e;

    public jp2(lp2 lp2Var, byte b) {
        this.e = lp2Var;
        this.b = lp2Var.f;
        this.c = lp2Var.isEmpty() ? -1 : 0;
        this.d = -1;
    }

    public abstract Object a(int i);

    public abstract Object b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.c >= 0) {
                }
                break;
            case 1:
                if (this.c >= 0) {
                }
                break;
            default:
                if (this.c >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.a;
        AbstractMap abstractMap = this.e;
        Object obj = null;
        switch (b) {
            case 0:
                lp2 lp2Var = (lp2) abstractMap;
                if (lp2Var.f != this.b) {
                    bg.b();
                    break;
                } else if (!hasNext()) {
                    lq5.n();
                    break;
                } else {
                    int i = this.c;
                    this.d = i;
                    obj = a(i);
                    int i2 = this.c + 1;
                    this.c = i2 < lp2Var.h ? i2 : -1;
                    break;
                }
            case 1:
                lp2 lp2Var2 = (lp2) abstractMap;
                if (lp2Var2.f != this.b) {
                    bg.b();
                    break;
                } else if (!hasNext()) {
                    lq5.n();
                    break;
                } else {
                    int i3 = this.c;
                    this.d = i3;
                    obj = b(i3);
                    int i4 = this.c + 1;
                    this.c = i4 < lp2Var2.h ? i4 : -1;
                    break;
                }
            default:
                lp2 lp2Var3 = (lp2) abstractMap;
                if (lp2Var3.f != this.b) {
                    bg.b();
                    break;
                } else if (!hasNext()) {
                    lq5.n();
                    break;
                } else {
                    int i5 = this.c;
                    this.d = i5;
                    obj = b(i5);
                    int i6 = this.c + 1;
                    this.c = i6 < lp2Var3.h ? i6 : -1;
                    break;
                }
        }
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        byte b = this.a;
        AbstractMap abstractMap = this.e;
        switch (b) {
            case 0:
                lp2 lp2Var = (lp2) abstractMap;
                if (lp2Var.f != this.b) {
                    bg.b();
                    break;
                } else {
                    yve.o("no calls to next() since the last call to remove()", this.d >= 0);
                    this.b += 32;
                    int i = this.d;
                    Object obj = lp2.w;
                    lp2Var.remove(lp2Var.g(i));
                    this.c--;
                    this.d = -1;
                    break;
                }
            case 1:
                lp2 lp2Var2 = (lp2) abstractMap;
                int i2 = lp2Var2.f;
                int i3 = this.b;
                if (i2 != i3) {
                    bg.b();
                    break;
                } else {
                    int i4 = this.d;
                    if (!(i4 >= 0)) {
                        grb.i("no calls to next() since the last call to remove()");
                        break;
                    } else {
                        this.b = i3 + 32;
                        Object[] objArr = lp2Var2.d;
                        objArr.getClass();
                        lp2Var2.remove(objArr[i4]);
                        this.c--;
                        this.d = -1;
                        break;
                    }
                }
            default:
                lp2 lp2Var3 = (lp2) abstractMap;
                int i5 = lp2Var3.f;
                int i6 = this.b;
                if (i5 != i6) {
                    bg.b();
                    break;
                } else {
                    int i7 = this.d;
                    if (!(i7 >= 0)) {
                        grb.i("no calls to next() since the last call to remove()");
                        break;
                    } else {
                        this.b = i6 + 32;
                        Object[] objArr2 = lp2Var3.d;
                        objArr2.getClass();
                        lp2Var3.remove(objArr2[i7]);
                        this.c--;
                        this.d = -1;
                        break;
                    }
                }
        }
    }

    public jp2(lp2 lp2Var, char c) {
        this.e = lp2Var;
        this.b = lp2Var.f;
        this.c = lp2Var.isEmpty() ? -1 : 0;
        this.d = -1;
    }

    public jp2(lp2 lp2Var) {
        this.e = lp2Var;
        this.b = lp2Var.f;
        this.c = lp2Var.isEmpty() ? -1 : 0;
        this.d = -1;
    }
}
