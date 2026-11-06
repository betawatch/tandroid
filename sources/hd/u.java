package hd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class u extends kd.i implements rd.p {
    public Object b;
    public Iterator c;
    public int d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Iterator h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Iterator it, id.c cVar) {
        super(2, cVar);
        this.h = it;
    }

    @Override // kd.a
    public final id.c create(Object obj, id.c cVar) {
        u uVar = new u(this.h, cVar);
        uVar.f = obj;
        return uVar;
    }

    @Override // rd.p
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((wd.c) obj, (id.c) obj2)).invokeSuspend(gd.k.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        wd.c cVar;
        ArrayList arrayList;
        Iterator it;
        int i7;
        t tVar;
        wd.c cVar2;
        Object[] array;
        jd.a aVar = jd.a.a;
        int i10 = this.e;
        if (i10 == 0) {
            af.b.c(obj);
            cVar = (wd.c) this.f;
            arrayList = new ArrayList(20);
            it = this.h;
            i7 = 0;
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        Iterator it2 = this.c;
                        t tVar2 = (t) this.b;
                        wd.c cVar3 = (wd.c) this.f;
                        af.b.c(obj);
                        tVar2.i();
                        while (true) {
                            int i11 = tVar2.b;
                            Object[] objArr = tVar2.a;
                            if (!it2.hasNext()) {
                                tVar = tVar2;
                                cVar2 = cVar3;
                                break;
                            }
                            Object next = it2.next();
                            if (tVar2.f() == i11) {
                                throw new IllegalStateException("ring buffer is full");
                            }
                            int i12 = tVar2.c;
                            int i13 = tVar2.d;
                            objArr[(i12 + i13) % i11] = next;
                            tVar2.d = i13 + 1;
                            if (tVar2.f() == i11) {
                                if (tVar2.d >= 20) {
                                    ArrayList arrayList2 = new ArrayList(tVar2);
                                    this.f = cVar3;
                                    this.b = tVar2;
                                    this.c = it2;
                                    this.e = 3;
                                    cVar3.b(arrayList2, this);
                                    jd.a aVar2 = jd.a.a;
                                    return aVar;
                                }
                                int i14 = i11 + (i11 >> 1) + 1;
                                if (i14 > 20) {
                                    i14 = 20;
                                }
                                if (tVar2.c == 0) {
                                    array = Arrays.copyOf(objArr, i14);
                                    kotlin.jvm.internal.j.d(array, "copyOf(...)");
                                } else {
                                    array = tVar2.toArray(new Object[i14]);
                                }
                                tVar2 = new t(tVar2.d, array);
                            }
                        }
                    } else if (i10 == 4) {
                        tVar = (t) this.b;
                        cVar2 = (wd.c) this.f;
                        af.b.c(obj);
                        tVar.i();
                    } else if (i10 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    if (tVar.d > 20) {
                        ArrayList arrayList3 = new ArrayList(tVar);
                        this.f = cVar2;
                        this.b = tVar;
                        this.c = null;
                        this.e = 4;
                        cVar2.b(arrayList3, this);
                        jd.a aVar3 = jd.a.a;
                        return aVar;
                    }
                    if (!tVar.isEmpty()) {
                        this.f = null;
                        this.b = null;
                        this.c = null;
                        this.e = 5;
                        cVar2.b(tVar, this);
                        jd.a aVar4 = jd.a.a;
                        return aVar;
                    }
                    return gd.k.a;
                }
                af.b.c(obj);
                return gd.k.a;
            }
            i7 = this.d;
            it = this.c;
            cVar = (wd.c) this.f;
            af.b.c(obj);
            arrayList = new ArrayList(20);
        }
        wd.c cVar4 = cVar;
        Iterator it3 = it;
        int i15 = i7;
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (i7 > 0) {
                i7--;
            } else {
                arrayList.add(next2);
                if (arrayList.size() == 20) {
                    this.f = cVar4;
                    this.b = arrayList;
                    this.c = it3;
                    this.d = i15;
                    this.e = 1;
                    cVar4.b(arrayList, this);
                    jd.a aVar5 = jd.a.a;
                    return aVar;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.f = null;
            this.b = null;
            this.c = null;
            this.e = 2;
            cVar4.b(arrayList, this);
            jd.a aVar6 = jd.a.a;
            return aVar;
        }
        return gd.k.a;
    }
}
