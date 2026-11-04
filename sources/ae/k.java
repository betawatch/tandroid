package ae;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k2.p1;
import org.telegram.tgnet.TLObject;
import wd.a1;
import wd.b0;
import wd.n1;
import wd.y;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class k extends hd.c implements zd.c {
    public final zd.c a;
    public final fd.h b;
    public final int c;
    public fd.h d;
    public fd.c e;

    public k(zd.c cVar, fd.h hVar) {
        super(h.a, fd.i.a);
        this.a = cVar;
        this.b = hVar;
        this.c = ((Number) hVar.fold(0, new j(0))).intValue();
    }

    @Override // zd.c
    public final Object b(Object obj, fd.c cVar) {
        try {
            Object c2 = c(cVar, obj);
            return c2 == gd.a.a ? c2 : dd.k.a;
        } catch (Throwable th2) {
            this.d = new f(cVar.getContext(), th2);
            throw th2;
        }
    }

    public final Object c(fd.c cVar, Object obj) {
        Comparable comparable;
        String str;
        fd.h context = cVar.getContext();
        b0.g(context);
        fd.h hVar = this.d;
        if (hVar != context) {
            if (hVar instanceof f) {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((f) hVar).b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                kotlin.jvm.internal.j.e(str2, "<this>");
                List a10 = td.d.a(new td.e(str2, 2));
                List list = a10;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!ud.d.j((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(ed.i.d(arrayList, 10));
                int size = arrayList.size();
                int i3 = 0;
                int i10 = 0;
                while (i10 < size) {
                    Object obj3 = arrayList.get(i10);
                    i10++;
                    String str3 = (String) obj3;
                    int length = str3.length();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            i11 = -1;
                            break;
                        }
                        char charAt = str3.charAt(i11);
                        if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                            break;
                        }
                        i11++;
                    }
                    if (i11 == -1) {
                        i11 = str3.length();
                    }
                    arrayList2.add(Integer.valueOf(i11));
                }
                Iterator it = arrayList2.iterator();
                if (it.hasNext()) {
                    comparable = (Comparable) it.next();
                    while (it.hasNext()) {
                        Comparable comparable2 = (Comparable) it.next();
                        if (comparable.compareTo(comparable2) > 0) {
                            comparable = comparable2;
                        }
                    }
                } else {
                    comparable = null;
                }
                Integer num = (Integer) comparable;
                int intValue = num != null ? num.intValue() : 0;
                int length2 = str2.length();
                a10.size();
                int b10 = ed.h.b(a10);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : list) {
                    int i12 = i3 + 1;
                    if (i3 < 0) {
                        throw new ArithmeticException("Index overflow has happened.");
                    }
                    String str4 = (String) obj4;
                    if ((i3 == 0 || i3 == b10) && ud.d.j(str4)) {
                        str = null;
                    } else {
                        kotlin.jvm.internal.j.e(str4, "<this>");
                        if (intValue < 0) {
                            throw new IllegalArgumentException(p1.j(intValue, "Requested character count ", " is less than zero.").toString());
                        }
                        int length3 = str4.length();
                        if (intValue <= length3) {
                            length3 = intValue;
                        }
                        str = str4.substring(length3);
                        kotlin.jvm.internal.j.d(str, "substring(...)");
                    }
                    if (str != null) {
                        arrayList3.add(str);
                    }
                    i3 = i12;
                }
                StringBuilder sb2 = new StringBuilder(length2);
                ed.g.f(arrayList3, sb2, "\n", "", "", "...", null);
                throw new IllegalStateException(sb2.toString().toString());
            }
            if (((Number) context.fold(0, new od.p() { // from class: ae.n
                /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
                
                    if (r1 == null) goto L17;
                 */
                @Override // od.p
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj5, Object obj6) {
                    int intValue2 = ((Integer) obj5).intValue();
                    fd.f fVar = (fd.f) obj6;
                    fd.g key = fVar.getKey();
                    fd.f fVar2 = k.this.b.get(key);
                    if (key != y.b) {
                        if (fVar != fVar2) {
                            intValue2 = TLObject.FLAG_31;
                        }
                        intValue2++;
                    } else {
                        a1 a1Var = (a1) fVar2;
                        a1 a1Var2 = (a1) fVar;
                        while (true) {
                            if (a1Var2 != null) {
                                if (a1Var2 == a1Var || !(a1Var2 instanceof be.q)) {
                                    break;
                                }
                                wd.p pVar = (wd.p) n1.b.get((be.q) a1Var2);
                                a1Var2 = pVar != null ? pVar.getParent() : null;
                            } else {
                                a1Var2 = null;
                                break;
                            }
                        }
                        if (a1Var2 != a1Var) {
                            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + a1Var2 + ", expected child of " + a1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                        }
                    }
                    return Integer.valueOf(intValue2);
                }
            })).intValue() != this.c) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.d = context;
        }
        this.e = cVar;
        od.q qVar = m.a;
        zd.c cVar2 = this.a;
        kotlin.jvm.internal.j.c(cVar2, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object a11 = qVar.a(cVar2, obj, this);
        if (!kotlin.jvm.internal.j.a(a11, gd.a.a)) {
            this.e = null;
        }
        return a11;
    }

    @Override // hd.a, hd.d
    public final hd.d getCallerFrame() {
        fd.c cVar = this.e;
        if (cVar instanceof hd.d) {
            return (hd.d) cVar;
        }
        return null;
    }

    @Override // hd.c, fd.c
    public final fd.h getContext() {
        fd.h hVar = this.d;
        return hVar == null ? fd.i.a : hVar;
    }

    @Override // hd.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // hd.a
    public final Object invokeSuspend(Object obj) {
        Throwable a10 = dd.g.a(obj);
        if (a10 != null) {
            this.d = new f(getContext(), a10);
        }
        fd.c cVar = this.e;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return gd.a.a;
    }
}
