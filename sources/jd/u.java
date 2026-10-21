package jd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import v7.i8;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class u extends md.h implements td.p {
    public Object b;
    public Iterator c;
    public int d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Iterator h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Iterator it, kd.c cVar) {
        super(cVar);
        this.h = it;
    }

    @Override // md.a
    public final kd.c create(Object obj, kd.c cVar) {
        u uVar = new u(this.h, cVar);
        uVar.f = obj;
        return uVar;
    }

    @Override // td.p
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((yd.c) obj, (kd.c) obj2)).invokeSuspend(id.i.a);
    }

    @Override // md.a
    public final Object invokeSuspend(Object obj) {
        yd.c cVar;
        ArrayList arrayList;
        Iterator it;
        int i10;
        t tVar;
        yd.c cVar2;
        Object[] array;
        ld.a aVar = ld.a.a;
        int i11 = this.e;
        if (i11 == 0) {
            i8.b(obj);
            cVar = (yd.c) this.f;
            arrayList = new ArrayList(20);
            it = this.h;
            i10 = 0;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        Iterator it2 = this.c;
                        t tVar2 = (t) this.b;
                        yd.c cVar3 = (yd.c) this.f;
                        i8.b(obj);
                        tVar2.m();
                        while (true) {
                            int i12 = tVar2.b;
                            Object[] objArr = tVar2.a;
                            if (!it2.hasNext()) {
                                tVar = tVar2;
                                cVar2 = cVar3;
                                break;
                            }
                            Object next = it2.next();
                            if (tVar2.h() == i12) {
                                throw new IllegalStateException("ring buffer is full");
                            }
                            int i13 = tVar2.c;
                            int i14 = tVar2.d;
                            objArr[(i13 + i14) % i12] = next;
                            tVar2.d = i14 + 1;
                            if (tVar2.h() == i12) {
                                if (tVar2.d >= 20) {
                                    ArrayList arrayList2 = new ArrayList(tVar2);
                                    this.f = cVar3;
                                    this.b = tVar2;
                                    this.c = it2;
                                    this.e = 3;
                                    cVar3.b(arrayList2, this);
                                    ld.a aVar2 = ld.a.a;
                                    return aVar;
                                }
                                int i15 = i12 + (i12 >> 1) + 1;
                                if (i15 > 20) {
                                    i15 = 20;
                                }
                                if (tVar2.c == 0) {
                                    array = Arrays.copyOf(objArr, i15);
                                    kotlin.jvm.internal.i.d(array, "copyOf(...)");
                                } else {
                                    array = tVar2.toArray(new Object[i15]);
                                }
                                tVar2 = new t(tVar2.d, array);
                            }
                        }
                    } else if (i11 == 4) {
                        tVar = (t) this.b;
                        cVar2 = (yd.c) this.f;
                        i8.b(obj);
                        tVar.m();
                    } else if (i11 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    if (tVar.d > 20) {
                        ArrayList arrayList3 = new ArrayList(tVar);
                        this.f = cVar2;
                        this.b = tVar;
                        this.c = null;
                        this.e = 4;
                        cVar2.b(arrayList3, this);
                        ld.a aVar3 = ld.a.a;
                        return aVar;
                    }
                    if (!tVar.isEmpty()) {
                        this.f = null;
                        this.b = null;
                        this.c = null;
                        this.e = 5;
                        cVar2.b(tVar, this);
                        ld.a aVar4 = ld.a.a;
                        return aVar;
                    }
                    return id.i.a;
                }
                i8.b(obj);
                return id.i.a;
            }
            i10 = this.d;
            it = this.c;
            cVar = (yd.c) this.f;
            i8.b(obj);
            arrayList = new ArrayList(20);
        }
        yd.c cVar4 = cVar;
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
                    ld.a aVar5 = ld.a.a;
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
            ld.a aVar6 = ld.a.a;
            return aVar;
        }
        return id.i.a;
    }
}
