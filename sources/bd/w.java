package bd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class w extends ed.i implements ld.p {
    public Object b;
    public Iterator c;
    public int d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Iterator h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Iterator it, cd.c cVar) {
        super(cVar);
        this.h = it;
    }

    @Override // ed.a
    public final cd.c create(Object obj, cd.c cVar) {
        w wVar = new w(this.h, cVar);
        wVar.f = obj;
        return wVar;
    }

    @Override // ld.p
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((qd.c) obj, (cd.c) obj2)).invokeSuspend(ad.j.a);
    }

    @Override // ed.a
    public final Object invokeSuspend(Object obj) {
        qd.c cVar;
        ArrayList arrayList;
        Iterator it;
        int i10;
        v vVar;
        qd.c cVar2;
        Object[] array;
        dd.a aVar = dd.a.a;
        int i11 = this.e;
        if (i11 == 0) {
            l9.b.b(obj);
            cVar = (qd.c) this.f;
            arrayList = new ArrayList(20);
            it = this.h;
            i10 = 0;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        Iterator it2 = this.c;
                        v vVar2 = (v) this.b;
                        qd.c cVar3 = (qd.c) this.f;
                        l9.b.b(obj);
                        vVar2.m();
                        while (true) {
                            int i12 = vVar2.b;
                            Object[] objArr = vVar2.a;
                            if (!it2.hasNext()) {
                                vVar = vVar2;
                                cVar2 = cVar3;
                                break;
                            }
                            Object next = it2.next();
                            if (vVar2.l() == i12) {
                                throw new IllegalStateException("ring buffer is full");
                            }
                            int i13 = vVar2.c;
                            int i14 = vVar2.d;
                            objArr[(i13 + i14) % i12] = next;
                            vVar2.d = i14 + 1;
                            if (vVar2.l() == i12) {
                                if (vVar2.d >= 20) {
                                    ArrayList arrayList2 = new ArrayList(vVar2);
                                    this.f = cVar3;
                                    this.b = vVar2;
                                    this.c = it2;
                                    this.e = 3;
                                    cVar3.b(arrayList2, this);
                                    dd.a aVar2 = dd.a.a;
                                    return aVar;
                                }
                                int i15 = i12 + (i12 >> 1) + 1;
                                if (i15 > 20) {
                                    i15 = 20;
                                }
                                if (vVar2.c == 0) {
                                    array = Arrays.copyOf(objArr, i15);
                                    kotlin.jvm.internal.i.d(array, "copyOf(...)");
                                } else {
                                    array = vVar2.toArray(new Object[i15]);
                                }
                                vVar2 = new v(vVar2.d, array);
                            }
                        }
                    } else if (i11 == 4) {
                        vVar = (v) this.b;
                        cVar2 = (qd.c) this.f;
                        l9.b.b(obj);
                        vVar.m();
                    } else if (i11 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    if (vVar.d > 20) {
                        ArrayList arrayList3 = new ArrayList(vVar);
                        this.f = cVar2;
                        this.b = vVar;
                        this.c = null;
                        this.e = 4;
                        cVar2.b(arrayList3, this);
                        dd.a aVar3 = dd.a.a;
                        return aVar;
                    }
                    if (!vVar.isEmpty()) {
                        this.f = null;
                        this.b = null;
                        this.c = null;
                        this.e = 5;
                        cVar2.b(vVar, this);
                        dd.a aVar4 = dd.a.a;
                        return aVar;
                    }
                    return ad.j.a;
                }
                l9.b.b(obj);
                return ad.j.a;
            }
            i10 = this.d;
            it = this.c;
            cVar = (qd.c) this.f;
            l9.b.b(obj);
            arrayList = new ArrayList(20);
        }
        qd.c cVar4 = cVar;
        Iterator it3 = it;
        int i16 = i10;
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (i10 > 0) {
                i10--;
            } else {
                arrayList.add(next2);
                if (arrayList.size() == 20) {
                    this.f = cVar4;
                    this.b = arrayList;
                    this.c = it3;
                    this.d = i16;
                    this.e = 1;
                    cVar4.b(arrayList, this);
                    dd.a aVar5 = dd.a.a;
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
            dd.a aVar6 = dd.a.a;
            return aVar;
        }
        return ad.j.a;
    }
}
