// default package

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ina extends fe9 implements is4 {
    public Object b;
    public Iterator c;
    public int d;
    public int e;
    public byte f;
    public /* synthetic */ Object h;
    public final /* synthetic */ Iterator n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ina(Iterator it, zw2 zw2Var) {
        super(2, zw2Var);
        this.n = it;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        ina inaVar = new ina(this.n, zw2Var);
        inaVar.h = obj;
        return inaVar;
    }

    @Override // is4
    public final Object invoke(Object obj, Object obj2) {
        return ((ina) create((g8a) obj, (zw2) obj2)).invokeSuspend(g9c.a);
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        byte b;
        int i;
        int i2;
        ArrayList arrayList;
        Iterator it;
        int i3;
        int i4;
        int i5;
        tm9 tm9Var;
        g8a g8aVar = (g8a) this.h;
        byte b2 = this.f;
        boolean z = true;
        vx2 vx2Var = vx2.a;
        if (b2 == 0) {
            b = 1;
            ixe.b(obj);
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
                        tm9 tm9Var2 = (tm9) this.b;
                        ixe.b(obj);
                        tm9Var2.i();
                        while (true) {
                            int i7 = tm9Var2.b;
                            Object[] objArr = tm9Var2.a;
                            if (!it2.hasNext()) {
                                i5 = i6;
                                tm9Var = tm9Var2;
                                break;
                            }
                            Object next = it2.next();
                            boolean z2 = z;
                            if (tm9Var2.h() == i7) {
                                grb.i("ring buffer is full");
                                return null;
                            }
                            int i8 = tm9Var2.c;
                            int i9 = tm9Var2.d;
                            objArr[(i8 + i9) % i7] = next;
                            tm9Var2.d = i9 + 1;
                            if (tm9Var2.h() == i7) {
                                if (tm9Var2.d >= 20) {
                                    ArrayList arrayList2 = new ArrayList(tm9Var2);
                                    this.h = g8aVar;
                                    this.b = tm9Var2;
                                    this.c = it2;
                                    this.d = i6;
                                    this.e = i4;
                                    this.f = (byte) 3;
                                    g8aVar.c(arrayList2, this);
                                    return vx2Var;
                                }
                                int i10 = i7 + (i7 >> 1) + 1;
                                if (i10 > 20) {
                                    i10 = 20;
                                }
                                tm9Var2 = new tm9(tm9Var2.d, tm9Var2.c == 0 ? Arrays.copyOf(objArr, i10) : tm9Var2.toArray(new Object[i10]));
                            }
                            z = z2;
                        }
                    } else if (b2 == 4) {
                        i4 = this.e;
                        i5 = this.d;
                        tm9Var = (tm9) this.b;
                        ixe.b(obj);
                        tm9Var.i();
                    } else {
                        if (b2 != 5) {
                            grb.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    if (tm9Var.d > 20) {
                        ArrayList arrayList3 = new ArrayList(tm9Var);
                        this.h = g8aVar;
                        this.b = tm9Var;
                        this.c = null;
                        this.d = i5;
                        this.e = i4;
                        this.f = (byte) 4;
                        g8aVar.c(arrayList3, this);
                        return vx2Var;
                    }
                    if (!tm9Var.isEmpty()) {
                        this.h = null;
                        this.b = null;
                        this.c = null;
                        this.d = i5;
                        this.e = i4;
                        this.f = (byte) 5;
                        g8aVar.c(tm9Var, this);
                        return vx2Var;
                    }
                    return g9c.a;
                }
                ixe.b(obj);
                return g9c.a;
            }
            b = 1;
            i = this.e;
            int i11 = this.d;
            Iterator it3 = this.c;
            ixe.b(obj);
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
                    this.h = g8aVar;
                    this.b = arrayList;
                    this.c = it;
                    this.d = i3;
                    this.e = i2;
                    this.f = b;
                    g8aVar.c(arrayList, this);
                    return vx2Var;
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
            g8aVar.c(arrayList, this);
            return vx2Var;
        }
        return g9c.a;
    }
}
