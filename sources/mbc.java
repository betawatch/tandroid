// default package

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class mbc extends nbc {
    public final Matrix a;
    public final ArrayList b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final Matrix j;
    public String k;

    /* JADX WARN: Multi-variable type inference failed */
    public mbc(mbc mbcVar, qt qtVar) {
        kbc kbcVar;
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.k = null;
        this.c = mbcVar.c;
        this.d = mbcVar.d;
        this.e = mbcVar.e;
        this.f = mbcVar.f;
        this.g = mbcVar.g;
        this.h = mbcVar.h;
        this.i = mbcVar.i;
        String str = mbcVar.k;
        this.k = str;
        if (str != null) {
            qtVar.put(str, this);
        }
        matrix.set(mbcVar.j);
        ArrayList arrayList = mbcVar.b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof mbc) {
                this.b.add(new mbc((mbc) obj, qtVar));
            } else {
                if (obj instanceof lbc) {
                    lbc lbcVar = (lbc) obj;
                    lbc lbcVar2 = new lbc(lbcVar);
                    lbcVar2.e = 0.0f;
                    lbcVar2.g = 1.0f;
                    lbcVar2.h = 1.0f;
                    lbcVar2.i = 0.0f;
                    lbcVar2.j = 1.0f;
                    lbcVar2.k = 0.0f;
                    lbcVar2.l = Paint.Cap.BUTT;
                    lbcVar2.m = Paint.Join.MITER;
                    lbcVar2.n = 4.0f;
                    lbcVar2.d = lbcVar.d;
                    lbcVar2.e = lbcVar.e;
                    lbcVar2.g = lbcVar.g;
                    lbcVar2.f = lbcVar.f;
                    lbcVar2.c = lbcVar.c;
                    lbcVar2.h = lbcVar.h;
                    lbcVar2.i = lbcVar.i;
                    lbcVar2.j = lbcVar.j;
                    lbcVar2.k = lbcVar.k;
                    lbcVar2.l = lbcVar.l;
                    lbcVar2.m = lbcVar.m;
                    lbcVar2.n = lbcVar.n;
                    kbcVar = lbcVar2;
                } else {
                    if (!(obj instanceof kbc)) {
                        dq9.m("Unknown object in the tree!");
                        throw null;
                    }
                    kbcVar = new kbc((kbc) obj);
                }
                this.b.add(kbcVar);
                Object obj2 = kbcVar.b;
                if (obj2 != null) {
                    qtVar.put(obj2, kbcVar);
                }
            }
        }
    }

    @Override // nbc
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((nbc) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // nbc
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return z;
            }
            z |= ((nbc) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f, this.g);
        matrix.postRotate(this.c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.e);
    }

    public String getGroupName() {
        return this.k;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            c();
        }
    }

    public void setPivotY(float f) {
        if (f != this.e) {
            this.e = f;
            c();
        }
    }

    public void setRotation(float f) {
        if (f != this.c) {
            this.c = f;
            c();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            c();
        }
    }

    public void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            c();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.h) {
            this.h = f;
            c();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            c();
        }
    }

    public mbc() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.k = null;
    }
}
