package id;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import v7.a8;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class u extends ld.i implements sd.p {
    public Object b;
    public Iterator c;
    public int d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Iterator h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Iterator it, jd.c cVar) {
        super(cVar);
        this.h = it;
    }

    @Override // ld.a
    public final jd.c create(Object obj, jd.c cVar) {
        u uVar = new u(this.h, cVar);
        uVar.f = obj;
        return uVar;
    }

    @Override // sd.p
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((xd.c) obj, (jd.c) obj2)).invokeSuspend(hd.i.a);
    }

    @Override // ld.a
    public final Object invokeSuspend(Object obj) {
        xd.c cVar;
        ArrayList arrayList;
        Iterator it;
        int i10;
        t tVar;
        xd.c cVar2;
        Object[] array;
        kd.a aVar = kd.a.a;
        int i11 = this.e;
        if (i11 == 0) {
            a8.b(obj);
            cVar = (xd.c) this.f;
            arrayList = new ArrayList(20);
            it = this.h;
            i10 = 0;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        Iterator it2 = this.c;
                        t tVar2 = (t) this.b;
                        xd.c cVar3 = (xd.c) this.f;
                        a8.b(obj);
                        tVar2.n();
                        while (true) {
                            int i12 = tVar2.b;
                            Object[] objArr = tVar2.a;
                            if (!it2.hasNext()) {
                                tVar = tVar2;
                                cVar2 = cVar3;
                                break;
                            }
                            Object next = it2.next();
                            if (tVar2.i() == i12) {
                                throw new IllegalStateException("ring buffer is full");
                            }
                            int i13 = tVar2.c;
                            int i14 = tVar2.d;
                            objArr[(i13 + i14) % i12] = next;
                            tVar2.d = i14 + 1;
                            if (tVar2.i() == i12) {
                                if (tVar2.d >= 20) {
                                    ArrayList arrayList2 = new ArrayList(tVar2);
                                    this.f = cVar3;
                                    this.b = tVar2;
                                    this.c = it2;
                                    this.e = 3;
                                    cVar3.c(arrayList2, this);
                                    kd.a aVar2 = kd.a.a;
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
                        cVar2 = (xd.c) this.f;
                        a8.b(obj);
                        tVar.n();
                    } else if (i11 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    if (tVar.d > 20) {
                        ArrayList arrayList3 = new ArrayList(tVar);
                        this.f = cVar2;
                        this.b = tVar;
                        this.c = null;
                        this.e = 4;
                        cVar2.c(arrayList3, this);
                        kd.a aVar3 = kd.a.a;
                        return aVar;
                    }
                    if (!tVar.isEmpty()) {
                        this.f = null;
                        this.b = null;
                        this.c = null;
                        this.e = 5;
                        cVar2.c(tVar, this);
                        kd.a aVar4 = kd.a.a;
                        return aVar;
                    }
                    return hd.i.a;
                }
                a8.b(obj);
                return hd.i.a;
            }
            i10 = this.d;
            it = this.c;
            cVar = (xd.c) this.f;
            a8.b(obj);
            arrayList = new ArrayList(20);
        }
        xd.c cVar4 = cVar;
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
                    cVar4.c(arrayList, this);
                    kd.a aVar5 = kd.a.a;
                    return aVar;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.f = null;
            this.b = null;
            this.c = null;
            this.e = 2;
            cVar4.c(arrayList, this);
            kd.a aVar6 = kd.a.a;
            return aVar;
        }
        return hd.i.a;
    }
}
