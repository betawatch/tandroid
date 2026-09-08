package hd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import v7.t7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
        super(cVar);
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
        return ((u) create((wd.c) obj, (id.c) obj2)).invokeSuspend(gd.i.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        int i10;
        wd.c cVar;
        Iterator it;
        int i11;
        t tVar;
        wd.c cVar2;
        Object[] array;
        jd.a aVar = jd.a.a;
        int i12 = this.e;
        if (i12 == 0) {
            t7.b(obj);
            wd.c cVar3 = (wd.c) this.f;
            arrayList = new ArrayList(20);
            i10 = 0;
            cVar = cVar3;
            it = this.h;
            i11 = 0;
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        Iterator it2 = this.c;
                        t tVar2 = (t) this.b;
                        wd.c cVar4 = (wd.c) this.f;
                        t7.b(obj);
                        tVar2.n();
                        while (true) {
                            int i13 = tVar2.b;
                            Object[] objArr = tVar2.a;
                            if (!it2.hasNext()) {
                                tVar = tVar2;
                                cVar2 = cVar4;
                                break;
                            }
                            Object next = it2.next();
                            if (tVar2.i() == i13) {
                                throw new IllegalStateException("ring buffer is full");
                            }
                            int i14 = tVar2.c;
                            int i15 = tVar2.d;
                            objArr[(i14 + i15) % i13] = next;
                            tVar2.d = i15 + 1;
                            if (tVar2.i() == i13) {
                                if (tVar2.d >= 20) {
                                    ArrayList arrayList2 = new ArrayList(tVar2);
                                    this.f = cVar4;
                                    this.b = tVar2;
                                    this.c = it2;
                                    this.e = 3;
                                    cVar4.c(arrayList2, this);
                                    jd.a aVar2 = jd.a.a;
                                    return aVar;
                                }
                                int i16 = i13 + (i13 >> 1) + 1;
                                if (i16 > 20) {
                                    i16 = 20;
                                }
                                if (tVar2.c == 0) {
                                    array = Arrays.copyOf(objArr, i16);
                                    kotlin.jvm.internal.i.d(array, "copyOf(...)");
                                } else {
                                    array = tVar2.toArray(new Object[i16]);
                                }
                                tVar2 = new t(tVar2.d, array);
                            }
                        }
                    } else if (i12 == 4) {
                        tVar = (t) this.b;
                        cVar2 = (wd.c) this.f;
                        t7.b(obj);
                        tVar.n();
                    } else if (i12 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    if (tVar.d > 20) {
                        ArrayList arrayList3 = new ArrayList(tVar);
                        this.f = cVar2;
                        this.b = tVar;
                        this.c = null;
                        this.e = 4;
                        cVar2.c(arrayList3, this);
                        jd.a aVar3 = jd.a.a;
                        return aVar;
                    }
                    if (!tVar.isEmpty()) {
                        this.f = null;
                        this.b = null;
                        this.c = null;
                        this.e = 5;
                        cVar2.c(tVar, this);
                        jd.a aVar4 = jd.a.a;
                        return aVar;
                    }
                    return gd.i.a;
                }
                t7.b(obj);
                return gd.i.a;
            }
            i10 = this.d;
            Iterator it3 = this.c;
            wd.c cVar5 = (wd.c) this.f;
            t7.b(obj);
            arrayList = new ArrayList(20);
            cVar = cVar5;
            it = it3;
            i11 = i10;
        }
        while (it.hasNext()) {
            Object next2 = it.next();
            if (i10 > 0) {
                i10--;
            } else {
                arrayList.add(next2);
                if (arrayList.size() == 20) {
                    this.f = cVar;
                    this.b = arrayList;
                    this.c = it;
                    this.d = i11;
                    this.e = 1;
                    cVar.c(arrayList, this);
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
            cVar.c(arrayList, this);
            jd.a aVar6 = jd.a.a;
            return aVar;
        }
        return gd.i.a;
    }
}
