package ed;

import b8.ib;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class v extends hd.i implements od.p {
    public Object b;
    public Iterator c;
    public int d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Iterator h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Iterator it, fd.c cVar) {
        super(2, cVar);
        this.h = it;
    }

    @Override // hd.a
    public final fd.c create(Object obj, fd.c cVar) {
        v vVar = new v(this.h, cVar);
        vVar.f = obj;
        return vVar;
    }

    @Override // od.p
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((td.c) obj, (fd.c) obj2)).invokeSuspend(dd.k.a);
    }

    @Override // hd.a
    public final Object invokeSuspend(Object obj) {
        td.c cVar;
        ArrayList arrayList;
        Iterator it;
        int i3;
        u uVar;
        td.c cVar2;
        Object[] array;
        gd.a aVar = gd.a.a;
        int i10 = this.e;
        if (i10 == 0) {
            ib.b(obj);
            cVar = (td.c) this.f;
            arrayList = new ArrayList(20);
            it = this.h;
            i3 = 0;
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        Iterator it2 = this.c;
                        u uVar2 = (u) this.b;
                        td.c cVar3 = (td.c) this.f;
                        ib.b(obj);
                        uVar2.i();
                        while (true) {
                            int i11 = uVar2.b;
                            Object[] objArr = uVar2.a;
                            if (!it2.hasNext()) {
                                uVar = uVar2;
                                cVar2 = cVar3;
                                break;
                            }
                            Object next = it2.next();
                            if (uVar2.h() == i11) {
                                throw new IllegalStateException("ring buffer is full");
                            }
                            int i12 = uVar2.c;
                            int i13 = uVar2.d;
                            objArr[(i12 + i13) % i11] = next;
                            uVar2.d = i13 + 1;
                            if (uVar2.h() == i11) {
                                if (uVar2.d >= 20) {
                                    ArrayList arrayList2 = new ArrayList(uVar2);
                                    this.f = cVar3;
                                    this.b = uVar2;
                                    this.c = it2;
                                    this.e = 3;
                                    cVar3.b(arrayList2, this);
                                    gd.a aVar2 = gd.a.a;
                                    return aVar;
                                }
                                int i14 = i11 + (i11 >> 1) + 1;
                                if (i14 > 20) {
                                    i14 = 20;
                                }
                                if (uVar2.c == 0) {
                                    array = Arrays.copyOf(objArr, i14);
                                    kotlin.jvm.internal.j.d(array, "copyOf(...)");
                                } else {
                                    array = uVar2.toArray(new Object[i14]);
                                }
                                uVar2 = new u(uVar2.d, array);
                            }
                        }
                    } else if (i10 == 4) {
                        uVar = (u) this.b;
                        cVar2 = (td.c) this.f;
                        ib.b(obj);
                        uVar.i();
                    } else if (i10 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    if (uVar.d > 20) {
                        ArrayList arrayList3 = new ArrayList(uVar);
                        this.f = cVar2;
                        this.b = uVar;
                        this.c = null;
                        this.e = 4;
                        cVar2.b(arrayList3, this);
                        gd.a aVar3 = gd.a.a;
                        return aVar;
                    }
                    if (!uVar.isEmpty()) {
                        this.f = null;
                        this.b = null;
                        this.c = null;
                        this.e = 5;
                        cVar2.b(uVar, this);
                        gd.a aVar4 = gd.a.a;
                        return aVar;
                    }
                    return dd.k.a;
                }
                ib.b(obj);
                return dd.k.a;
            }
            i3 = this.d;
            it = this.c;
            cVar = (td.c) this.f;
            ib.b(obj);
            arrayList = new ArrayList(20);
        }
        td.c cVar4 = cVar;
        Iterator it3 = it;
        int i15 = i3;
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (i3 > 0) {
                i3--;
            } else {
                arrayList.add(next2);
                if (arrayList.size() == 20) {
                    this.f = cVar4;
                    this.b = arrayList;
                    this.c = it3;
                    this.d = i15;
                    this.e = 1;
                    cVar4.b(arrayList, this);
                    gd.a aVar5 = gd.a.a;
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
            gd.a aVar6 = gd.a.a;
            return aVar;
        }
        return dd.k.a;
    }
}
