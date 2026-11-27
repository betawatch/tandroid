// default package

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ldc extends mdc {
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
    public ldc(ldc ldcVar, qs qsVar) {
        jdc jdcVar;
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
        this.c = ldcVar.c;
        this.d = ldcVar.d;
        this.e = ldcVar.e;
        this.f = ldcVar.f;
        this.g = ldcVar.g;
        this.h = ldcVar.h;
        this.i = ldcVar.i;
        String str = ldcVar.k;
        this.k = str;
        if (str != null) {
            qsVar.put(str, this);
        }
        matrix.set(ldcVar.j);
        ArrayList arrayList = ldcVar.b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof ldc) {
                this.b.add(new ldc((ldc) obj, qsVar));
            } else {
                if (obj instanceof kdc) {
                    kdc kdcVar = (kdc) obj;
                    kdc kdcVar2 = new kdc(kdcVar);
                    kdcVar2.e = 0.0f;
                    kdcVar2.g = 1.0f;
                    kdcVar2.h = 1.0f;
                    kdcVar2.i = 0.0f;
                    kdcVar2.j = 1.0f;
                    kdcVar2.k = 0.0f;
                    kdcVar2.l = Paint.Cap.BUTT;
                    kdcVar2.m = Paint.Join.MITER;
                    kdcVar2.n = 4.0f;
                    kdcVar2.d = kdcVar.d;
                    kdcVar2.e = kdcVar.e;
                    kdcVar2.g = kdcVar.g;
                    kdcVar2.f = kdcVar.f;
                    kdcVar2.c = kdcVar.c;
                    kdcVar2.h = kdcVar.h;
                    kdcVar2.i = kdcVar.i;
                    kdcVar2.j = kdcVar.j;
                    kdcVar2.k = kdcVar.k;
                    kdcVar2.l = kdcVar.l;
                    kdcVar2.m = kdcVar.m;
                    kdcVar2.n = kdcVar.n;
                    jdcVar = kdcVar2;
                } else {
                    if (!(obj instanceof jdc)) {
                        grb.i("Unknown object in the tree!");
                        throw null;
                    }
                    jdcVar = new jdc((jdc) obj);
                }
                this.b.add(jdcVar);
                Object obj2 = jdcVar.b;
                if (obj2 != null) {
                    qsVar.put(obj2, jdcVar);
                }
            }
        }
    }

    @Override // mdc
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((mdc) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // mdc
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return z;
            }
            z |= ((mdc) arrayList.get(i)).b(iArr);
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

    public ldc() {
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
