package de;

import ee.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.telegram.tgnet.TLObject;
import rd.p;
import zd.a1;
import zd.b0;
import zd.n1;
import zd.y;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class h extends kd.c implements ce.d {
    public final ce.d a;
    public final id.h b;
    public final int c;
    public id.h d;
    public id.c e;

    public h(ce.d dVar, id.h hVar) {
        super(f.a, id.i.a);
        this.a = dVar;
        this.b = hVar;
        this.c = ((Number) hVar.fold(0, new b1.e(3))).intValue();
    }

    @Override // ce.d
    public final Object a(Object obj, id.c cVar) {
        try {
            Object c10 = c(cVar, obj);
            return c10 == jd.a.a ? c10 : gd.k.a;
        } catch (Throwable th2) {
            this.d = new d(cVar.getContext(), th2);
            throw th2;
        }
    }

    public final Object c(id.c cVar, Object obj) {
        Comparable comparable;
        String str;
        id.h context = cVar.getContext();
        b0.g(context);
        id.h hVar = this.d;
        if (hVar != context) {
            if (hVar instanceof d) {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((d) hVar).b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                kotlin.jvm.internal.j.e(str2, "<this>");
                List a10 = wd.d.a(new wd.e(str2, 2));
                List list = a10;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!xd.d.j((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(hd.h.d(arrayList, 10));
                int size = arrayList.size();
                int i7 = 0;
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
                int b10 = hd.g.b(a10);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : list) {
                    int i12 = i7 + 1;
                    if (i7 < 0) {
                        throw new ArithmeticException("Index overflow has happened.");
                    }
                    String str4 = (String) obj4;
                    if ((i7 == 0 || i7 == b10) && xd.d.j(str4)) {
                        str = null;
                    } else {
                        kotlin.jvm.internal.j.e(str4, "<this>");
                        if (intValue < 0) {
                            throw new IllegalArgumentException(jg.g.k(intValue, "Requested character count ", " is less than zero.").toString());
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
                    i7 = i12;
                }
                StringBuilder sb2 = new StringBuilder(length2);
                hd.f.f(arrayList3, sb2, "\n", "", "", "...", null);
                throw new IllegalStateException(sb2.toString().toString());
            }
            if (((Number) context.fold(0, new p() { // from class: de.k
                /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
                
                    if (r1 == null) goto L17;
                 */
                @Override // rd.p
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj5, Object obj6) {
                    int intValue2 = ((Integer) obj5).intValue();
                    id.f fVar = (id.f) obj6;
                    id.g key = fVar.getKey();
                    id.f fVar2 = h.this.b.get(key);
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
                                if (a1Var2 == a1Var || !(a1Var2 instanceof q)) {
                                    break;
                                }
                                zd.p pVar = (zd.p) n1.b.get((q) a1Var2);
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
        rd.q qVar = j.a;
        ce.d dVar = this.a;
        kotlin.jvm.internal.j.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object b11 = qVar.b(dVar, obj, this);
        if (!kotlin.jvm.internal.j.a(b11, jd.a.a)) {
            this.e = null;
        }
        return b11;
    }

    @Override // kd.a, kd.d
    public final kd.d getCallerFrame() {
        id.c cVar = this.e;
        if (cVar instanceof kd.d) {
            return (kd.d) cVar;
        }
        return null;
    }

    @Override // kd.c, id.c
    public final id.h getContext() {
        id.h hVar = this.d;
        return hVar == null ? id.i.a : hVar;
    }

    @Override // kd.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        Throwable a10 = gd.g.a(obj);
        if (a10 != null) {
            this.d = new d(getContext(), a10);
        }
        id.c cVar = this.e;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return jd.a.a;
    }
}
