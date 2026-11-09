package a5;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class k extends l {
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

    public k() {
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

    @Override // a5.l
    public final boolean a() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i7 >= arrayList.size()) {
                return false;
            }
            if (((l) arrayList.get(i7)).a()) {
                return true;
            }
            i7++;
        }
    }

    @Override // a5.l
    public final boolean b(int[] iArr) {
        int i7 = 0;
        boolean z9 = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i7 >= arrayList.size()) {
                return z9;
            }
            z9 |= ((l) arrayList.get(i7)).b(iArr);
            i7++;
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

    public void setPivotX(float f10) {
        if (f10 != this.d) {
            this.d = f10;
            c();
        }
    }

    public void setPivotY(float f10) {
        if (f10 != this.e) {
            this.e = f10;
            c();
        }
    }

    public void setRotation(float f10) {
        if (f10 != this.c) {
            this.c = f10;
            c();
        }
    }

    public void setScaleX(float f10) {
        if (f10 != this.f) {
            this.f = f10;
            c();
        }
    }

    public void setScaleY(float f10) {
        if (f10 != this.g) {
            this.g = f10;
            c();
        }
    }

    public void setTranslateX(float f10) {
        if (f10 != this.h) {
            this.h = f10;
            c();
        }
    }

    public void setTranslateY(float f10) {
        if (f10 != this.i) {
            this.i = f10;
            c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(k kVar, a0.f fVar) {
        i iVar;
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
        this.c = kVar.c;
        this.d = kVar.d;
        this.e = kVar.e;
        this.f = kVar.f;
        this.g = kVar.g;
        this.h = kVar.h;
        this.i = kVar.i;
        String str = kVar.k;
        this.k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(kVar.j);
        ArrayList arrayList = kVar.b;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            Object obj = arrayList.get(i7);
            if (obj instanceof k) {
                this.b.add(new k((k) obj, fVar));
            } else {
                if (obj instanceof j) {
                    j jVar = (j) obj;
                    j jVar2 = new j(jVar);
                    jVar2.e = 0.0f;
                    jVar2.g = 1.0f;
                    jVar2.h = 1.0f;
                    jVar2.i = 0.0f;
                    jVar2.j = 1.0f;
                    jVar2.k = 0.0f;
                    jVar2.l = Paint.Cap.BUTT;
                    jVar2.m = Paint.Join.MITER;
                    jVar2.n = 4.0f;
                    jVar2.d = jVar.d;
                    jVar2.e = jVar.e;
                    jVar2.g = jVar.g;
                    jVar2.f = jVar.f;
                    jVar2.c = jVar.c;
                    jVar2.h = jVar.h;
                    jVar2.i = jVar.i;
                    jVar2.j = jVar.j;
                    jVar2.k = jVar.k;
                    jVar2.l = jVar.l;
                    jVar2.m = jVar.m;
                    jVar2.n = jVar.n;
                    iVar = jVar2;
                } else if (obj instanceof i) {
                    iVar = new i((i) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.b.add(iVar);
                Object obj2 = iVar.b;
                if (obj2 != null) {
                    fVar.put(obj2, iVar);
                }
            }
        }
    }
}
