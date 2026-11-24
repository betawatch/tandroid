// default package

import java.util.AbstractMap;
import java.util.Iterator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class bq2 implements Iterator {
    public final /* synthetic */ byte a = 0;
    public int b;
    public int c;
    public int d;
    public final /* synthetic */ AbstractMap e;

    public bq2(dq2 dq2Var, byte b) {
        this.e = dq2Var;
        this.b = dq2Var.f;
        this.c = dq2Var.isEmpty() ? -1 : 0;
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
                dq2 dq2Var = (dq2) abstractMap;
                if (dq2Var.f != this.b) {
                    zg.b();
                    break;
                } else if (!hasNext()) {
                    u36.g();
                    break;
                } else {
                    int i = this.c;
                    this.d = i;
                    obj = a(i);
                    int i2 = this.c + 1;
                    this.c = i2 < dq2Var.h ? i2 : -1;
                    break;
                }
            case 1:
                dq2 dq2Var2 = (dq2) abstractMap;
                if (dq2Var2.f != this.b) {
                    zg.b();
                    break;
                } else if (!hasNext()) {
                    u36.g();
                    break;
                } else {
                    int i3 = this.c;
                    this.d = i3;
                    obj = b(i3);
                    int i4 = this.c + 1;
                    this.c = i4 < dq2Var2.h ? i4 : -1;
                    break;
                }
            default:
                dq2 dq2Var3 = (dq2) abstractMap;
                if (dq2Var3.f != this.b) {
                    zg.b();
                    break;
                } else if (!hasNext()) {
                    u36.g();
                    break;
                } else {
                    int i5 = this.c;
                    this.d = i5;
                    obj = b(i5);
                    int i6 = this.c + 1;
                    this.c = i6 < dq2Var3.h ? i6 : -1;
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
                dq2 dq2Var = (dq2) abstractMap;
                if (dq2Var.f != this.b) {
                    zg.b();
                    break;
                } else {
                    jte.o("no calls to next() since the last call to remove()", this.d >= 0);
                    this.b += 32;
                    int i = this.d;
                    Object obj = dq2.w;
                    dq2Var.remove(dq2Var.g(i));
                    this.c--;
                    this.d = -1;
                    break;
                }
            case 1:
                dq2 dq2Var2 = (dq2) abstractMap;
                int i2 = dq2Var2.f;
                int i3 = this.b;
                if (i2 != i3) {
                    zg.b();
                    break;
                } else {
                    int i4 = this.d;
                    if (!(i4 >= 0)) {
                        dq9.m("no calls to next() since the last call to remove()");
                        break;
                    } else {
                        this.b = i3 + 32;
                        Object[] objArr = dq2Var2.d;
                        objArr.getClass();
                        dq2Var2.remove(objArr[i4]);
                        this.c--;
                        this.d = -1;
                        break;
                    }
                }
            default:
                dq2 dq2Var3 = (dq2) abstractMap;
                int i5 = dq2Var3.f;
                int i6 = this.b;
                if (i5 != i6) {
                    zg.b();
                    break;
                } else {
                    int i7 = this.d;
                    if (!(i7 >= 0)) {
                        dq9.m("no calls to next() since the last call to remove()");
                        break;
                    } else {
                        this.b = i6 + 32;
                        Object[] objArr2 = dq2Var3.d;
                        objArr2.getClass();
                        dq2Var3.remove(objArr2[i7]);
                        this.c--;
                        this.d = -1;
                        break;
                    }
                }
        }
    }

    public bq2(dq2 dq2Var, char c) {
        this.e = dq2Var;
        this.b = dq2Var.f;
        this.c = dq2Var.isEmpty() ? -1 : 0;
        this.d = -1;
    }

    public bq2(dq2 dq2Var) {
        this.e = dq2Var;
        this.b = dq2Var.f;
        this.c = dq2Var.isEmpty() ? -1 : 0;
        this.d = -1;
    }
}
