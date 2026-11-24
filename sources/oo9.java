// default package

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class oo9 extends gw2 implements ik4 {
    public final ik4 a;
    public final sw2 b;
    public final int c;
    public sw2 d;
    public fw2 e;

    public oo9(ik4 ik4Var, sw2 sw2Var) {
        super(ep2.c, z14.a);
        this.a = ik4Var;
        this.b = sw2Var;
        this.c = ((Number) sw2Var.fold(0, new dm2((byte) 5))).intValue();
    }

    @Override // ik4
    public final Object c(Object obj, fw2 fw2Var) {
        try {
            Object d = d(fw2Var, obj);
            return d == bx2.a ? d : g5c.a;
        } catch (Throwable th) {
            this.d = new dq3(fw2Var.getContext(), th);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0193 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(fw2 fw2Var, Object obj) {
        List list;
        Comparable comparable;
        String str;
        sw2 context = fw2Var.getContext();
        nle.a(context);
        sw2 sw2Var = this.d;
        if (sw2Var != context) {
            int i = 0;
            if (sw2Var instanceof dq3) {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((dq3) sw2Var).b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                x26 x26Var = new x26(str2);
                if (x26Var.hasNext()) {
                    Object next = x26Var.next();
                    if (x26Var.hasNext()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(next);
                        while (x26Var.hasNext()) {
                            arrayList.add(x26Var.next());
                        }
                        list = arrayList;
                    } else {
                        list = zk2.a(next);
                    }
                } else {
                    list = c24.a;
                }
                List list2 = list;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    if (!f9b.h((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(al2.c(arrayList2, 10));
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj3 = arrayList2.get(i2);
                    i2++;
                    String str3 = (String) obj3;
                    int length = str3.length();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            i3 = -1;
                            break;
                        }
                        char charAt = str3.charAt(i3);
                        if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 == -1) {
                        i3 = str3.length();
                    }
                    arrayList3.add(Integer.valueOf(i3));
                }
                Iterator it = arrayList3.iterator();
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
                list.size();
                int size2 = list.size() - 1;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : list2) {
                    int i4 = i + 1;
                    if (i < 0) {
                        throw new ArithmeticException("Index overflow has happened.");
                    }
                    String str4 = (String) obj4;
                    if ((i != 0 && i != size2) || !f9b.h(str4)) {
                        str4.getClass();
                        if (intValue >= 0) {
                            int length3 = str4.length();
                            if (intValue <= length3) {
                                length3 = intValue;
                            }
                            str = str4.substring(length3);
                            if (str == null) {
                                arrayList4.add(str);
                            }
                            i = i4;
                        } else {
                            v0b.a(tb4.n(intValue, "Requested character count ", " is less than zero."));
                        }
                    }
                    str = null;
                    if (str == null) {
                    }
                    i = i4;
                }
                StringBuilder sb = new StringBuilder(length2);
                yk2.e(arrayList4, sb, "\n", "", "", "...", null);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (((Number) context.fold(0, new eq4() { // from class: ro9
                /* JADX WARN: Code restructure failed: missing block: B:26:0x002e, code lost:
                
                    if (r4 != null) goto L15;
                 */
                @Override // eq4
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj5, Object obj6) {
                    int intValue2 = ((Integer) obj5).intValue();
                    qw2 qw2Var = (qw2) obj6;
                    rw2 key = qw2Var.getKey();
                    qw2 qw2Var2 = oo9.this.b.get(key);
                    if (key != pd5.c) {
                        if (qw2Var != qw2Var2) {
                            intValue2 = TLObject.FLAG_31;
                        }
                        intValue2++;
                    } else {
                        bt5 bt5Var = (bt5) qw2Var2;
                        bt5 bt5Var2 = (bt5) qw2Var;
                        while (true) {
                            if (bt5Var2 != null) {
                                if (bt5Var2 == bt5Var || !(bt5Var2 instanceof rq9)) {
                                    break;
                                }
                                fg2 fg2Var = (fg2) ex.a.getObjectVolatile((rq9) bt5Var2, pt5.a);
                                bt5Var2 = fg2Var != null ? fg2Var.getParent() : null;
                            } else {
                                bt5Var2 = null;
                                break;
                            }
                        }
                        if (bt5Var2 != bt5Var) {
                            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + bt5Var2 + ", expected child of " + bt5Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                        }
                    }
                    return Integer.valueOf(intValue2);
                }
            })).intValue() != this.c) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.d = context;
        }
        this.e = fw2Var;
        gq4 gq4Var = qo9.a;
        ik4 ik4Var = this.a;
        ik4Var.getClass();
        Object a = gq4Var.a(ik4Var, obj, this);
        if (!rp5.a(a, bx2.a)) {
            this.e = null;
        }
        return a;
    }

    @Override // of0, cx2
    public final cx2 getCallerFrame() {
        fw2 fw2Var = this.e;
        if (fw2Var instanceof cx2) {
            return (cx2) fw2Var;
        }
        return null;
    }

    @Override // gw2, fw2
    public final sw2 getContext() {
        sw2 sw2Var = this.d;
        return sw2Var == null ? z14.a : sw2Var;
    }

    @Override // of0
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        Throwable a = ta9.a(obj);
        if (a != null) {
            this.d = new dq3(getContext(), a);
        }
        fw2 fw2Var = this.e;
        if (fw2Var != null) {
            fw2Var.resumeWith(obj);
        }
        return bx2.a;
    }
}
