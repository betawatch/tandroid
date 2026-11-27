// default package

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class gs9 extends ax2 implements nm4 {
    public final nm4 a;
    public final mx2 b;
    public final int c;
    public mx2 d;
    public zw2 e;

    public gs9(nm4 nm4Var, mx2 mx2Var) {
        super(xp2.c, u24.a);
        this.a = nm4Var;
        this.b = mx2Var;
        this.c = ((Number) mx2Var.fold(0, new xm2((byte) 5))).intValue();
    }

    @Override // nm4
    public final Object c(Object obj, zw2 zw2Var) {
        try {
            Object d = d(zw2Var, obj);
            return d == vx2.a ? d : f9c.a;
        } catch (Throwable th) {
            this.d = new uq3(zw2Var.getContext(), th);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0193 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(zw2 zw2Var, Object obj) {
        List list;
        Comparable comparable;
        String str;
        mx2 context = zw2Var.getContext();
        gqe.a(context);
        mx2 mx2Var = this.d;
        if (mx2Var != context) {
            int i = 0;
            if (mx2Var instanceof uq3) {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((uq3) mx2Var).b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                a56 a56Var = new a56(str2);
                if (a56Var.hasNext()) {
                    Object next = a56Var.next();
                    if (a56Var.hasNext()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(next);
                        while (a56Var.hasNext()) {
                            arrayList.add(a56Var.next());
                        }
                        list = arrayList;
                    } else {
                        list = tl2.a(next);
                    }
                } else {
                    list = x24.a;
                }
                List list2 = list;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    if (!ddb.h((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(ul2.c(arrayList2, 10));
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
                    if ((i != 0 && i != size2) || !ddb.h(str4)) {
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
                            bya.a(qd4.n(intValue, "Requested character count ", " is less than zero."));
                        }
                    }
                    str = null;
                    if (str == null) {
                    }
                    i = i4;
                }
                StringBuilder sb = new StringBuilder(length2);
                sl2.e(arrayList4, sb, "\n", "", "", "...", null);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (((Number) context.fold(0, new is4() { // from class: js9
                /* JADX WARN: Code restructure failed: missing block: B:26:0x002e, code lost:
                
                    if (r4 != null) goto L15;
                 */
                @Override // is4
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj5, Object obj6) {
                    int intValue2 = ((Integer) obj5).intValue();
                    kx2 kx2Var = (kx2) obj6;
                    lx2 key = kx2Var.getKey();
                    kx2 kx2Var2 = gs9.this.b.get(key);
                    if (key != qf5.c) {
                        if (kx2Var != kx2Var2) {
                            intValue2 = TLObject.FLAG_31;
                        }
                        intValue2++;
                    } else {
                        ev5 ev5Var = (ev5) kx2Var2;
                        ev5 ev5Var2 = (ev5) kx2Var;
                        while (true) {
                            if (ev5Var2 != null) {
                                if (ev5Var2 == ev5Var || !(ev5Var2 instanceof ju9)) {
                                    break;
                                }
                                xg2 xg2Var = (xg2) fx.a.getObjectVolatile((ju9) ev5Var2, sv5.a);
                                ev5Var2 = xg2Var != null ? xg2Var.getParent() : null;
                            } else {
                                ev5Var2 = null;
                                break;
                            }
                        }
                        if (ev5Var2 != ev5Var) {
                            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + ev5Var2 + ", expected child of " + ev5Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                        }
                    }
                    return Integer.valueOf(intValue2);
                }
            })).intValue() != this.c) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.d = context;
        }
        this.e = zw2Var;
        ks4 ks4Var = is9.a;
        nm4 nm4Var = this.a;
        nm4Var.getClass();
        Object a = ks4Var.a(nm4Var, obj, this);
        if (!ur5.a(a, vx2.a)) {
            this.e = null;
        }
        return a;
    }

    @Override // qf0, wx2
    public final wx2 getCallerFrame() {
        zw2 zw2Var = this.e;
        if (zw2Var instanceof wx2) {
            return (wx2) zw2Var;
        }
        return null;
    }

    @Override // ax2, zw2
    public final mx2 getContext() {
        mx2 mx2Var = this.d;
        return mx2Var == null ? u24.a : mx2Var;
    }

    @Override // qf0
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        Throwable a = he9.a(obj);
        if (a != null) {
            this.d = new uq3(getContext(), a);
        }
        zw2 zw2Var = this.e;
        if (zw2Var != null) {
            zw2Var.resumeWith(obj);
        }
        return vx2.a;
    }
}
