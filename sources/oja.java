// default package

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class oja extends ra9 implements eq4 {
    public Object b;
    public Iterator c;
    public int d;
    public int e;
    public byte f;
    public /* synthetic */ Object h;
    public final /* synthetic */ Iterator n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oja(Iterator it, fw2 fw2Var) {
        super(2, fw2Var);
        this.n = it;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        oja ojaVar = new oja(this.n, fw2Var);
        ojaVar.h = obj;
        return ojaVar;
    }

    @Override // eq4
    public final Object invoke(Object obj, Object obj2) {
        return ((oja) create((o4a) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        byte b;
        int i;
        int i2;
        ArrayList arrayList;
        Iterator it;
        int i3;
        int i4;
        int i5;
        fj9 fj9Var;
        o4a o4aVar = (o4a) this.h;
        byte b2 = this.f;
        boolean z = true;
        bx2 bx2Var = bx2.a;
        if (b2 == 0) {
            b = 1;
            qse.b(obj);
            i = 0;
            i2 = 0;
            arrayList = new ArrayList(20);
            it = this.n;
            i3 = 20;
        } else {
            if (b2 != 1) {
                if (b2 != 2) {
                    if (b2 == 3) {
                        i4 = this.e;
                        int i6 = this.d;
                        Iterator it2 = this.c;
                        fj9 fj9Var2 = (fj9) this.b;
                        qse.b(obj);
                        fj9Var2.i();
                        while (true) {
                            int i7 = fj9Var2.b;
                            Object[] objArr = fj9Var2.a;
                            if (!it2.hasNext()) {
                                i5 = i6;
                                fj9Var = fj9Var2;
                                break;
                            }
                            Object next = it2.next();
                            boolean z2 = z;
                            if (fj9Var2.h() == i7) {
                                sc8.j("ring buffer is full");
                                return null;
                            }
                            int i8 = fj9Var2.c;
                            int i9 = fj9Var2.d;
                            objArr[(i8 + i9) % i7] = next;
                            fj9Var2.d = i9 + 1;
                            if (fj9Var2.h() == i7) {
                                if (fj9Var2.d >= 20) {
                                    ArrayList arrayList2 = new ArrayList(fj9Var2);
                                    this.h = o4aVar;
                                    this.b = fj9Var2;
                                    this.c = it2;
                                    this.d = i6;
                                    this.e = i4;
                                    this.f = (byte) 3;
                                    o4aVar.c(arrayList2, this);
                                    return bx2Var;
                                }
                                int i10 = i7 + (i7 >> 1) + 1;
                                if (i10 > 20) {
                                    i10 = 20;
                                }
                                fj9Var2 = new fj9(fj9Var2.d, fj9Var2.c == 0 ? Arrays.copyOf(objArr, i10) : fj9Var2.toArray(new Object[i10]));
                            }
                            z = z2;
                        }
                    } else if (b2 == 4) {
                        i4 = this.e;
                        i5 = this.d;
                        fj9Var = (fj9) this.b;
                        qse.b(obj);
                        fj9Var.i();
                    } else {
                        if (b2 != 5) {
                            sc8.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    if (fj9Var.d > 20) {
                        ArrayList arrayList3 = new ArrayList(fj9Var);
                        this.h = o4aVar;
                        this.b = fj9Var;
                        this.c = null;
                        this.d = i5;
                        this.e = i4;
                        this.f = (byte) 4;
                        o4aVar.c(arrayList3, this);
                        return bx2Var;
                    }
                    if (!fj9Var.isEmpty()) {
                        this.h = null;
                        this.b = null;
                        this.c = null;
                        this.d = i5;
                        this.e = i4;
                        this.f = (byte) 5;
                        o4aVar.c(fj9Var, this);
                        return bx2Var;
                    }
                    return g5c.a;
                }
                qse.b(obj);
                return g5c.a;
            }
            b = 1;
            i = this.e;
            int i11 = this.d;
            Iterator it3 = this.c;
            qse.b(obj);
            arrayList = new ArrayList(20);
            it = it3;
            i3 = i11;
            i2 = i;
        }
        while (it.hasNext()) {
            Object next2 = it.next();
            if (i > 0) {
                i--;
            } else {
                arrayList.add(next2);
                if (arrayList.size() == 20) {
                    this.h = o4aVar;
                    this.b = arrayList;
                    this.c = it;
                    this.d = i3;
                    this.e = i2;
                    this.f = b;
                    o4aVar.c(arrayList, this);
                    return bx2Var;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.h = null;
            this.b = null;
            this.c = null;
            this.d = i3;
            this.e = i2;
            this.f = (byte) 2;
            o4aVar.c(arrayList, this);
            return bx2Var;
        }
        return g5c.a;
    }
}
