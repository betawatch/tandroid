package ge;

import ae.k;
import c3.h0;
import ce.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ud.q;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class g extends nd.c implements fe.c {
    public final fe.c a;
    public final ld.h b;
    public final int c;
    public ld.h d;
    public nd.c e;

    public g(fe.c cVar, ld.h hVar) {
        super(d.a, ld.i.a);
        this.a = cVar;
        this.b = hVar;
        this.c = ((Number) hVar.fold(0, f.b)).intValue();
    }

    @Override // fe.c
    public final Object b(Object obj, nd.c cVar) {
        try {
            Object c10 = c(cVar, obj);
            return c10 == md.a.a ? c10 : jd.i.a;
        } catch (Throwable th2) {
            this.d = new c(th2, cVar.getContext());
            throw th2;
        }
    }

    public final Object c(nd.c cVar, Object obj) {
        Comparable comparable;
        String str;
        ld.h context = cVar.getContext();
        f0.h(context);
        ld.h hVar = this.d;
        if (hVar != context) {
            int i10 = 0;
            if (hVar instanceof c) {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((c) hVar).a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                kotlin.jvm.internal.i.e(str2, "<this>");
                List a2 = zd.d.a(new ae.j(str2, 0));
                List list = a2;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!k.e((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(kd.i.d(arrayList));
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = arrayList.get(i11);
                    i11++;
                    String str3 = (String) obj3;
                    int length = str3.length();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= length) {
                            i12 = -1;
                            break;
                        }
                        char charAt = str3.charAt(i12);
                        if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                            break;
                        }
                        i12++;
                    }
                    if (i12 == -1) {
                        i12 = str3.length();
                    }
                    arrayList2.add(Integer.valueOf(i12));
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
                a2.size();
                int b10 = kd.h.b(a2);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : list) {
                    int i13 = i10 + 1;
                    if (i10 < 0) {
                        throw new ArithmeticException("Index overflow has happened.");
                    }
                    String str4 = (String) obj4;
                    if ((i10 == 0 || i10 == b10) && k.e(str4)) {
                        str = null;
                    } else {
                        kotlin.jvm.internal.i.e(str4, "<this>");
                        if (intValue < 0) {
                            throw new IllegalArgumentException(ic.a.j(intValue, "Requested character count ", " is less than zero.").toString());
                        }
                        int length3 = str4.length();
                        if (intValue <= length3) {
                            length3 = intValue;
                        }
                        str = str4.substring(length3);
                        kotlin.jvm.internal.i.d(str, "substring(...)");
                    }
                    if (str != null) {
                        arrayList3.add(str);
                    }
                    i10 = i13;
                }
                StringBuilder sb2 = new StringBuilder(length2);
                kd.g.g(arrayList3, sb2, "\n", "", "", "...", null);
                throw new IllegalStateException(sb2.toString().toString());
            }
            if (((Number) context.fold(0, new j(this))).intValue() != this.c) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.d = context;
        }
        this.e = cVar;
        q qVar = i.a;
        fe.c cVar2 = this.a;
        kotlin.jvm.internal.i.c(cVar2, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object a10 = qVar.a(cVar2, obj, this);
        if (!kotlin.jvm.internal.i.a(a10, md.a.a)) {
            this.e = null;
        }
        return a10;
    }

    @Override // nd.a, nd.d
    public final nd.d getCallerFrame() {
        nd.c cVar = this.e;
        if (h0.t(cVar)) {
            return cVar;
        }
        return null;
    }

    @Override // nd.c, ld.c
    public final ld.h getContext() {
        ld.h hVar = this.d;
        return hVar == null ? ld.i.a : hVar;
    }

    @Override // nd.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        Throwable a2 = jd.f.a(obj);
        if (a2 != null) {
            this.d = new c(a2, getContext());
        }
        nd.c cVar = this.e;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return md.a.a;
    }
}
