package ld;

import hd.f0;
import j3.r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import zc.q;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g extends sc.c implements kd.c {
    public final kd.c a;
    public final qc.h b;
    public final int c;
    public qc.h d;
    public sc.c e;

    public g(kd.c cVar, qc.h hVar) {
        super(d.a, qc.i.a);
        this.a = cVar;
        this.b = hVar;
        this.c = ((Number) hVar.fold(0, f.b)).intValue();
    }

    @Override // kd.c
    public final Object c(Object obj, sc.c cVar) {
        try {
            Object d = d(cVar, obj);
            return d == rc.a.a ? d : oc.i.a;
        } catch (Throwable th) {
            this.d = new c(th, cVar.getContext());
            throw th;
        }
    }

    public final Object d(sc.c cVar, Object obj) {
        Comparable comparable;
        String str;
        qc.h context = cVar.getContext();
        f0.h(context);
        qc.h hVar = this.d;
        if (hVar != context) {
            int i9 = 0;
            if (hVar instanceof c) {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((c) hVar).a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                kotlin.jvm.internal.i.e(str2, "<this>");
                List a2 = ed.d.a(new ed.e(str2, 2));
                List list = a2;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!fd.j.e((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(pc.i.d(arrayList));
                int size = arrayList.size();
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
                a2.size();
                int b10 = pc.h.b(a2);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : list) {
                    int i12 = i9 + 1;
                    if (i9 < 0) {
                        throw new ArithmeticException("Index overflow has happened.");
                    }
                    String str4 = (String) obj4;
                    if ((i9 == 0 || i9 == b10) && fd.j.e(str4)) {
                        str = null;
                    } else {
                        kotlin.jvm.internal.i.e(str4, "<this>");
                        if (intValue < 0) {
                            throw new IllegalArgumentException(r0.m(intValue, "Requested character count ", " is less than zero.").toString());
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
                    i9 = i12;
                }
                StringBuilder sb2 = new StringBuilder(length2);
                pc.g.g(arrayList3, sb2, "\n", "", "", "...", null);
                throw new IllegalStateException(sb2.toString().toString());
            }
            if (((Number) context.fold(0, new j(this))).intValue() != this.c) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.d = context;
        }
        this.e = cVar;
        q qVar = i.a;
        kd.c cVar2 = this.a;
        kotlin.jvm.internal.i.c(cVar2, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object a3 = qVar.a(cVar2, obj, this);
        if (!kotlin.jvm.internal.i.a(a3, rc.a.a)) {
            this.e = null;
        }
        return a3;
    }

    @Override // sc.a, sc.d
    public final sc.d getCallerFrame() {
        sc.c cVar = this.e;
        if (e2.c.v(cVar)) {
            return cVar;
        }
        return null;
    }

    @Override // sc.c, qc.c
    public final qc.h getContext() {
        qc.h hVar = this.d;
        return hVar == null ? qc.i.a : hVar;
    }

    @Override // sc.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // sc.a
    public final Object invokeSuspend(Object obj) {
        Throwable a2 = oc.f.a(obj);
        if (a2 != null) {
            this.d = new c(a2, getContext());
        }
        sc.c cVar = this.e;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return rc.a.a;
    }
}
