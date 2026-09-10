package de;

import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rd.q;
import zd.e0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class g extends kd.c implements ce.c {
    public final ce.c a;
    public final id.h b;
    public final int c;
    public id.h d;
    public kd.c e;

    public g(ce.c cVar, id.h hVar) {
        super(d.a, id.i.a);
        this.a = cVar;
        this.b = hVar;
        this.c = ((Number) hVar.fold(0, f.b)).intValue();
    }

    @Override // ce.c
    public final Object a(Object obj, kd.c cVar) {
        try {
            Object d = d(cVar, obj);
            return d == jd.a.a ? d : gd.i.a;
        } catch (Throwable th2) {
            this.d = new c(cVar.getContext(), th2);
            throw th2;
        }
    }

    public final Object d(kd.c cVar, Object obj) {
        Comparable comparable;
        String str;
        id.h context = cVar.getContext();
        e0.h(context);
        id.h hVar = this.d;
        if (hVar != context) {
            int i10 = 0;
            if (hVar instanceof c) {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((c) hVar).a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                kotlin.jvm.internal.i.e(str2, "<this>");
                List a2 = wd.d.a(new wd.e(str2, 2));
                List list = a2;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!xd.j.e((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(hd.i.d(arrayList));
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
                int a10 = hd.h.a(a2);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : list) {
                    int i13 = i10 + 1;
                    if (i10 < 0) {
                        throw new ArithmeticException("Index overflow has happened.");
                    }
                    String str4 = (String) obj4;
                    if ((i10 == 0 || i10 == a10) && xd.j.e(str4)) {
                        str = null;
                    } else {
                        kotlin.jvm.internal.i.e(str4, "<this>");
                        if (intValue < 0) {
                            throw new IllegalArgumentException(hc.b.k(intValue, "Requested character count ", " is less than zero.").toString());
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
                hd.g.g(arrayList3, sb2, "\n", "", "", "...", null);
                throw new IllegalStateException(sb2.toString().toString());
            }
            if (((Number) context.fold(0, new j(this))).intValue() != this.c) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.d = context;
        }
        this.e = cVar;
        q qVar = i.a;
        ce.c cVar2 = this.a;
        kotlin.jvm.internal.i.c(cVar2, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object c10 = qVar.c(cVar2, obj, this);
        if (!kotlin.jvm.internal.i.a(c10, jd.a.a)) {
            this.e = null;
        }
        return c10;
    }

    @Override // kd.a, kd.d
    public final kd.d getCallerFrame() {
        kd.c cVar = this.e;
        if (e2.u(cVar)) {
            return cVar;
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
        Throwable a2 = gd.f.a(obj);
        if (a2 != null) {
            this.d = new c(getContext(), a2);
        }
        kd.c cVar = this.e;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return jd.a.a;
    }
}
