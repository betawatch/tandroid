package nd;

import bd.q;
import j7.l1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jd.e0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class g extends uc.c implements md.c {
    public final md.c a;
    public final sc.h b;
    public final int c;
    public sc.h d;
    public uc.c e;

    public g(md.c cVar, sc.h hVar) {
        super(d.a, sc.i.a);
        this.a = cVar;
        this.b = hVar;
        this.c = ((Number) hVar.fold(0, f.b)).intValue();
    }

    @Override // md.c
    public final Object c(Object obj, uc.c cVar) {
        try {
            Object d = d(cVar, obj);
            return d == tc.a.a ? d : qc.i.a;
        } catch (Throwable th2) {
            this.d = new c(th2, cVar.getContext());
            throw th2;
        }
    }

    public final Object d(uc.c cVar, Object obj) {
        Comparable comparable;
        String str;
        sc.h context = cVar.getContext();
        e0.h(context);
        sc.h hVar = this.d;
        if (hVar != context) {
            int i10 = 0;
            if (hVar instanceof c) {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((c) hVar).a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                kotlin.jvm.internal.j.e(str2, "<this>");
                List a2 = gd.d.a(new gd.e(str2, 2));
                List list = a2;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!hd.j.e((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(rc.i.d(arrayList));
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
                int b10 = rc.h.b(a2);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : list) {
                    int i13 = i10 + 1;
                    if (i10 < 0) {
                        throw new ArithmeticException("Index overflow has happened.");
                    }
                    String str4 = (String) obj4;
                    if ((i10 == 0 || i10 == b10) && hd.j.e(str4)) {
                        str = null;
                    } else {
                        kotlin.jvm.internal.j.e(str4, "<this>");
                        if (intValue < 0) {
                            throw new IllegalArgumentException(l1.l(intValue, "Requested character count ", " is less than zero.").toString());
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
                    i10 = i13;
                }
                StringBuilder sb2 = new StringBuilder(length2);
                rc.g.g(arrayList3, sb2, "\n", "", "", "...", null);
                throw new IllegalStateException(sb2.toString().toString());
            }
            if (((Number) context.fold(0, new j(this))).intValue() != this.c) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.d = context;
        }
        this.e = cVar;
        q qVar = i.a;
        md.c cVar2 = this.a;
        kotlin.jvm.internal.j.c(cVar2, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object b11 = qVar.b(cVar2, obj, this);
        if (!kotlin.jvm.internal.j.a(b11, tc.a.a)) {
            this.e = null;
        }
        return b11;
    }

    @Override // uc.a, uc.d
    public final uc.d getCallerFrame() {
        uc.c cVar = this.e;
        if (com.google.android.recaptcha.internal.a.u(cVar)) {
            return cVar;
        }
        return null;
    }

    @Override // uc.c, sc.c
    public final sc.h getContext() {
        sc.h hVar = this.d;
        return hVar == null ? sc.i.a : hVar;
    }

    @Override // uc.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // uc.a
    public final Object invokeSuspend(Object obj) {
        Throwable a2 = qc.f.a(obj);
        if (a2 != null) {
            this.d = new c(a2, getContext());
        }
        uc.c cVar = this.e;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return tc.a.a;
    }
}
