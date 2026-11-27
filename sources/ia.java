// default package

import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.lang.ref.SoftReference;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Date;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ia {
    public static boolean i = true;
    public final /* synthetic */ byte a;
    public int b;
    public Object c;
    public Serializable d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public ia(l09 l09Var) {
        this.a = (byte) 0;
        this.c = new ed(30, (byte) 12);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.b = 0;
        boolean z = f11.a;
        this.f = new ArrayList();
        this.g = l09Var;
        this.h = new kj4((Object) this, (byte) 21);
    }

    public final boolean a(int i2) {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ha haVar = (ha) arrayList.get(i3);
            byte b = haVar.a;
            if (b != 8) {
                if (b == 1) {
                    int i4 = haVar.b;
                    int i5 = haVar.d + i4;
                    while (i4 < i5) {
                        if (f(i4, i3 + 1) == i2) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (f(haVar.d, i3 + 1) == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b() {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((l09) this.g).o2((ha) arrayList.get(i2));
        }
        l(arrayList);
        this.b = 0;
    }

    public final void c() {
        l09 l09Var = (l09) this.g;
        b();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ha haVar = (ha) arrayList.get(i2);
            byte b = haVar.a;
            if (b == 1) {
                l09Var.o2(haVar);
                l09Var.q2(haVar.b, haVar.d);
            } else if (b == 2) {
                l09Var.o2(haVar);
                int i3 = haVar.b;
                int i4 = haVar.d;
                RecyclerView recyclerView = (RecyclerView) l09Var.b;
                recyclerView.h0(i3, i4, true);
                recyclerView.y0 = true;
                recyclerView.v0.c += i4;
            } else if (b == 4) {
                l09Var.o2(haVar);
                l09Var.p2(haVar.b, haVar.d, haVar.c);
            } else if (b == 8) {
                l09Var.o2(haVar);
                l09Var.r2(haVar.b, haVar.d);
            }
        }
        l(arrayList);
        this.b = 0;
    }

    public final void d(ha haVar) {
        int i2;
        ed edVar = (ed) this.c;
        byte b = haVar.a;
        if (b == 1 || b == 8) {
            lq5.j("should not dispatch add or move for pre layout");
            return;
        }
        int n = n(haVar.b, b);
        int i3 = haVar.b;
        byte b2 = haVar.a;
        if (b2 == 2) {
            i2 = 0;
        } else {
            if (b2 != 4) {
                lq5.q(haVar, "op should be remove or update.");
                return;
            }
            i2 = 1;
        }
        int i4 = 1;
        for (int i5 = 1; i5 < haVar.d; i5++) {
            int n2 = n((i2 * i5) + haVar.b, haVar.a);
            byte b3 = haVar.a;
            if (b3 == 2 ? n2 != n : !(b3 == 4 && n2 == n + 1)) {
                ha i6 = i(haVar.c, b3, n, i4);
                e(i6, i3);
                i6.c = null;
                edVar.r0(i6);
                if (haVar.a == 4) {
                    i3 += i4;
                }
                i4 = 1;
                n = n2;
            } else {
                i4++;
            }
        }
        Object obj = haVar.c;
        haVar.c = null;
        edVar.r0(haVar);
        if (i4 > 0) {
            ha i7 = i(obj, haVar.a, n, i4);
            e(i7, i3);
            i7.c = null;
            edVar.r0(i7);
        }
    }

    public final void e(ha haVar, int i2) {
        l09 l09Var = (l09) this.g;
        l09Var.o2(haVar);
        byte b = haVar.a;
        if (b != 2) {
            if (b == 4) {
                l09Var.p2(i2, haVar.d, haVar.c);
                return;
            } else {
                lq5.j("only remove and update ops can be dispatched in first pass");
                return;
            }
        }
        int i3 = haVar.d;
        RecyclerView recyclerView = (RecyclerView) l09Var.b;
        recyclerView.h0(i2, i3, true);
        recyclerView.y0 = true;
        recyclerView.v0.c += i3;
    }

    public final int f(int i2, int i3) {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        while (i3 < size) {
            ha haVar = (ha) arrayList.get(i3);
            byte b = haVar.a;
            int i4 = haVar.b;
            if (b == 8) {
                if (i4 == i2) {
                    i2 = haVar.d;
                } else {
                    if (i4 < i2) {
                        i2--;
                    }
                    if (haVar.d <= i2) {
                        i2++;
                    }
                }
            } else if (i4 > i2) {
                continue;
            } else if (b == 2) {
                int i5 = haVar.d;
                if (i2 < i4 + i5) {
                    return -1;
                }
                i2 -= i5;
            } else if (b == 1) {
                i2 += haVar.d;
            }
            i3++;
        }
        return i2;
    }

    public final boolean g() {
        return ((ArrayList) this.d).size() > 0;
    }

    public final void h(String str) {
        int i2;
        ArrayList arrayList = (ArrayList) this.f;
        while (true) {
            if (arrayList.size() <= 5) {
                break;
            } else {
                arrayList.remove(0);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(new Date().toString());
        sb.append("  ");
        sb.append(str);
        sb.append("\n");
        StackTraceElement[] stackTrace = new Exception().getStackTrace();
        int i3 = 0;
        for (i2 = 0; i2 < stackTrace.length && i3 < 5; i2++) {
            String stackTraceElement = stackTrace[i2].toString();
            if (!stackTraceElement.startsWith("androidx.recyclerview.widget.") || i3 != 0) {
                sb.append("\n");
                sb.append(stackTraceElement);
                sb.append("\n");
                i3++;
            }
        }
        arrayList.add(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ha i(Object obj, int i2, int i3, int i4) {
        ha haVar = (ha) ((ed) this.c).U();
        if (haVar != null) {
            haVar.a = i2;
            haVar.b = i3;
            haVar.d = i4;
            haVar.c = obj;
            return haVar;
        }
        ha haVar2 = new ha();
        haVar2.a = i2;
        haVar2.b = i3;
        haVar2.d = i4;
        haVar2.c = obj;
        return haVar2;
    }

    public final void j(ha haVar) {
        l09 l09Var = (l09) this.g;
        ((ArrayList) this.e).add(haVar);
        byte b = haVar.a;
        if (b == 1) {
            l09Var.q2(haVar.b, haVar.d);
            return;
        }
        if (b == 2) {
            int i2 = haVar.b;
            int i3 = haVar.d;
            RecyclerView recyclerView = (RecyclerView) l09Var.b;
            recyclerView.h0(i2, i3, false);
            recyclerView.y0 = true;
            return;
        }
        if (b == 4) {
            l09Var.p2(haVar.b, haVar.d, haVar.c);
        } else if (b == 8) {
            l09Var.r2(haVar.b, haVar.d);
        } else {
            lq5.q(haVar, "Unknown update op type for ");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x0210, code lost:
    
        if (((java.util.ArrayList) r2.e.d).contains(r15.a) != false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x027a, code lost:
    
        if (((java.util.ArrayList) r2.e.d).contains(r13.a) != false) goto L158;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0016 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0126 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k() {
        byte b;
        boolean z;
        char c;
        ha i2;
        int i3;
        int i4;
        ha i5;
        boolean z2;
        boolean z3;
        Object obj;
        ha haVar;
        ed edVar = (ed) this.c;
        RecyclerView recyclerView = (RecyclerView) ((l09) this.g).b;
        kj4 kj4Var = (kj4) this.h;
        ArrayList arrayList = (ArrayList) this.d;
        while (true) {
            int size = arrayList.size() - 1;
            boolean z4 = false;
            while (true) {
                b = 8;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((ha) arrayList.get(size)).a != 8) {
                    z4 = true;
                } else if (z4) {
                    break;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i6 = size + 1;
            ia iaVar = (ia) kj4Var.b;
            ed edVar2 = (ed) iaVar.c;
            ha haVar2 = (ha) arrayList.get(size);
            ha haVar3 = (ha) arrayList.get(i6);
            byte b2 = haVar3.a;
            if (b2 == 1) {
                int i7 = haVar2.d;
                int i8 = haVar3.b;
                int i9 = i7 < i8 ? -1 : 0;
                int i10 = haVar2.b;
                if (i10 < i8) {
                    i9++;
                } else {
                    haVar2.b = i10 + haVar3.d;
                }
                int i11 = haVar3.b;
                if (i11 <= i7) {
                    haVar2.d = i7 + haVar3.d;
                }
                haVar3.b = i11 + i9;
                arrayList.set(size, haVar3);
                arrayList.set(i6, haVar2);
            } else if (b2 == 2) {
                int i12 = haVar2.b;
                int i13 = haVar2.d;
                int i14 = haVar3.b;
                if (i12 < i13) {
                    if (i14 == i12 && haVar3.d == i13 - i12) {
                        z2 = false;
                        z3 = true;
                    } else {
                        z2 = false;
                        z3 = false;
                    }
                } else if (i14 == i13 + 1 && haVar3.d == i12 - i13) {
                    z2 = true;
                    z3 = true;
                } else {
                    z2 = true;
                    z3 = false;
                }
                if (i13 < i14) {
                    i14--;
                    haVar3.b = i14;
                } else {
                    int i15 = haVar3.d;
                    if (i13 < i14 + i15) {
                        haVar3.d = i15 - 1;
                        haVar2.a = (byte) 2;
                        haVar2.d = 1;
                        if (haVar3.d == 0) {
                            arrayList.remove(i6);
                            haVar3.c = null;
                            edVar2.r0(haVar3);
                        }
                    }
                }
                int i16 = haVar2.b;
                if (i16 <= i14) {
                    haVar3.b = i14 + 1;
                } else {
                    int i17 = i14 + haVar3.d;
                    if (i16 < i17) {
                        obj = null;
                        ha i18 = iaVar.i(null, 2, i16 + 1, i17 - i16);
                        haVar3.d = haVar2.b - haVar3.b;
                        haVar = i18;
                        if (z3) {
                            if (z2) {
                                if (haVar != null) {
                                    int i19 = haVar2.b;
                                    if (i19 > haVar.b) {
                                        haVar2.b = i19 - haVar.d;
                                    }
                                    int i20 = haVar2.d;
                                    if (i20 > haVar.b) {
                                        haVar2.d = i20 - haVar.d;
                                    }
                                }
                                int i21 = haVar2.b;
                                if (i21 > haVar3.b) {
                                    haVar2.b = i21 - haVar3.d;
                                }
                                int i22 = haVar2.d;
                                if (i22 > haVar3.b) {
                                    haVar2.d = i22 - haVar3.d;
                                }
                            } else {
                                if (haVar != null) {
                                    int i23 = haVar2.b;
                                    if (i23 >= haVar.b) {
                                        haVar2.b = i23 - haVar.d;
                                    }
                                    int i24 = haVar2.d;
                                    if (i24 >= haVar.b) {
                                        haVar2.d = i24 - haVar.d;
                                    }
                                }
                                int i25 = haVar2.b;
                                if (i25 >= haVar3.b) {
                                    haVar2.b = i25 - haVar3.d;
                                }
                                int i26 = haVar2.d;
                                if (i26 >= haVar3.b) {
                                    haVar2.d = i26 - haVar3.d;
                                }
                            }
                            arrayList.set(size, haVar3);
                            if (haVar2.b != haVar2.d) {
                                arrayList.set(i6, haVar2);
                            } else {
                                arrayList.remove(i6);
                            }
                            if (haVar != null) {
                                arrayList.add(size, haVar);
                            }
                        } else {
                            arrayList.set(size, haVar3);
                            arrayList.remove(i6);
                            haVar2.c = obj;
                            edVar2.r0(haVar2);
                        }
                    }
                }
                obj = null;
                haVar = null;
                if (z3) {
                }
            } else if (b2 == 4) {
                int i27 = haVar2.d;
                int i28 = haVar3.b;
                if (i27 < i28) {
                    haVar3.b = i28 - 1;
                } else {
                    int i29 = haVar3.d;
                    if (i27 < i28 + i29) {
                        haVar3.d = i29 - 1;
                        i2 = iaVar.i(haVar3.c, 4, haVar2.b, 1);
                        i3 = haVar2.b;
                        i4 = haVar3.b;
                        if (i3 > i4) {
                            haVar3.b = i4 + 1;
                        } else {
                            int i30 = i4 + haVar3.d;
                            if (i3 < i30) {
                                int i31 = i30 - i3;
                                i5 = iaVar.i(haVar3.c, 4, i3 + 1, i31);
                                haVar3.d -= i31;
                                arrayList.set(i6, haVar2);
                                if (haVar3.d > 0) {
                                    arrayList.set(size, haVar3);
                                } else {
                                    arrayList.remove(size);
                                    haVar3.c = null;
                                    edVar2.r0(haVar3);
                                }
                                if (i2 != null) {
                                    arrayList.add(size, i2);
                                }
                                if (i5 != null) {
                                    arrayList.add(size, i5);
                                }
                            }
                        }
                        i5 = null;
                        arrayList.set(i6, haVar2);
                        if (haVar3.d > 0) {
                        }
                        if (i2 != null) {
                        }
                        if (i5 != null) {
                        }
                    }
                }
                i2 = null;
                i3 = haVar2.b;
                i4 = haVar3.b;
                if (i3 > i4) {
                }
                i5 = null;
                arrayList.set(i6, haVar2);
                if (haVar3.d > 0) {
                }
                if (i2 != null) {
                }
                if (i5 != null) {
                }
            }
        }
        int size2 = arrayList.size();
        int i32 = 0;
        while (i32 < size2) {
            ha haVar4 = (ha) arrayList.get(i32);
            byte b3 = haVar4.a;
            if (b3 == 1) {
                j(haVar4);
            } else if (b3 == 2) {
                int i33 = haVar4.b;
                int i34 = haVar4.d + i33;
                int i35 = i33;
                int i36 = 0;
                char c2 = 65535;
                while (i35 < i34) {
                    f89 M = recyclerView.M(i35, true);
                    if (M != null) {
                    }
                    M = null;
                    if (M != null || a(i35)) {
                        if (c2 == 0) {
                            d(i(null, 2, i33, i36));
                            z = true;
                        } else {
                            z = false;
                        }
                        c = 1;
                    } else {
                        if (c2 == 1) {
                            j(i(null, 2, i33, i36));
                            z = true;
                        } else {
                            z = false;
                        }
                        c = 0;
                    }
                    if (z) {
                        i35 -= i36;
                        i34 -= i36;
                        i36 = 1;
                    } else {
                        i36++;
                    }
                    i35++;
                    c2 = c;
                }
                if (i36 != haVar4.d) {
                    haVar4.c = null;
                    edVar.r0(haVar4);
                    haVar4 = i(null, 2, i33, i36);
                }
                if (c2 == 0) {
                    d(haVar4);
                } else {
                    j(haVar4);
                }
            } else if (b3 == 4) {
                int i37 = haVar4.b;
                int i38 = haVar4.d + i37;
                int i39 = i37;
                int i40 = 0;
                char c3 = 65535;
                while (i37 < i38) {
                    f89 M2 = recyclerView.M(i37, true);
                    if (M2 != null) {
                    }
                    M2 = null;
                    if (M2 != null || a(i37)) {
                        if (c3 == 0) {
                            d(i(haVar4.c, 4, i39, i40));
                            i39 = i37;
                            i40 = 0;
                        }
                        c3 = 1;
                    } else {
                        if (c3 == 1) {
                            j(i(haVar4.c, 4, i39, i40));
                            i39 = i37;
                            i40 = 0;
                        }
                        c3 = 0;
                    }
                    i40++;
                    i37++;
                }
                if (i40 != haVar4.d) {
                    Object obj2 = haVar4.c;
                    haVar4.c = null;
                    edVar.r0(haVar4);
                    haVar4 = i(obj2, 4, i39, i40);
                }
                if (c3 == 0) {
                    d(haVar4);
                } else {
                    j(haVar4);
                }
            } else if (b3 == b) {
                j(haVar4);
            }
            i32++;
            b = 8;
        }
        arrayList.clear();
    }

    public final void l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ha haVar = (ha) arrayList.get(i2);
            haVar.c = null;
            ((ed) this.c).r0(haVar);
        }
        arrayList.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m() {
        String str;
        ycb ycbVar = ycb.e;
        if (i) {
            l09 l09Var = (l09) this.f;
            if (l09Var == null) {
                try {
                    l09 l09Var2 = new l09((byte) 10);
                    l09Var2.b = new SoftReference(new String[3]);
                    this.f = l09Var2;
                } catch (Throwable unused) {
                    i = false;
                }
            } else {
                String[] strArr = (String[]) ((SoftReference) l09Var.b).get();
                if (strArr != null) {
                    str = strArr[0];
                    if (str == null) {
                        StringBuffer stringBuffer = new StringBuffer();
                        int i2 = this.b;
                        if (i2 == -1) {
                            throw null;
                        }
                        String str2 = "";
                        if (ycbVar.c) {
                            String modifier = Modifier.toString(i2);
                            if (modifier.length() != 0) {
                                str2 = modifier.concat(" ");
                            }
                        }
                        stringBuffer.append(str2);
                        if (ycbVar.b) {
                            ((Class) this.h).getClass();
                            Class cls = (Class) this.h;
                            stringBuffer.append(ycb.a(cls.getName(), cls, ycbVar.a));
                        }
                        if (ycbVar.b) {
                            stringBuffer.append(" ");
                        }
                        ((Class) this.e).getClass();
                        Class cls2 = (Class) this.e;
                        String str3 = (String) this.d;
                        if (str3 == null) {
                            cls2.getClass();
                            str3 = ((Class) this.e).getName();
                            this.d = str3;
                        }
                        stringBuffer.append(ycb.a(str3, cls2, ycbVar.d));
                        stringBuffer.append(".");
                        ((String) this.c).getClass();
                        stringBuffer.append((String) this.c);
                        Class[] clsArr = (Class[]) this.g;
                        if (ycbVar.b) {
                            stringBuffer.append("(");
                            for (int i3 = 0; i3 < clsArr.length; i3++) {
                                if (i3 > 0) {
                                    stringBuffer.append(", ");
                                }
                                Class cls3 = clsArr[i3];
                                stringBuffer.append(ycb.a(cls3.getName(), cls3, ycbVar.a));
                            }
                            stringBuffer.append(")");
                        } else if (clsArr.length == 0) {
                            stringBuffer.append("()");
                        } else {
                            stringBuffer.append("(..)");
                        }
                        str = stringBuffer.toString();
                    }
                    if (i) {
                        l09 l09Var3 = (l09) this.f;
                        String[] strArr2 = (String[]) ((SoftReference) l09Var3.b).get();
                        if (strArr2 == null) {
                            strArr2 = new String[3];
                            l09Var3.b = new SoftReference(strArr2);
                        }
                        strArr2[0] = str;
                    }
                    return str;
                }
            }
        }
        str = null;
        if (str == null) {
        }
        if (i) {
        }
        return str;
    }

    public final int n(int i2, int i3) {
        int i4;
        int i5;
        ed edVar = (ed) this.c;
        ArrayList arrayList = (ArrayList) this.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ha haVar = (ha) arrayList.get(size);
            byte b = haVar.a;
            int i6 = haVar.b;
            if (b == 8) {
                int i7 = haVar.d;
                if (i6 < i7) {
                    i5 = i7;
                    i4 = i6;
                } else {
                    i4 = i7;
                    i5 = i6;
                }
                if (i2 < i4 || i2 > i5) {
                    if (i2 < i6) {
                        if (i3 == 1) {
                            haVar.b = i6 + 1;
                            haVar.d = i7 + 1;
                        } else if (i3 == 2) {
                            haVar.b = i6 - 1;
                            haVar.d = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i3 == 1) {
                        haVar.d = i7 + 1;
                    } else if (i3 == 2) {
                        haVar.d = i7 - 1;
                    }
                    i2++;
                } else {
                    if (i3 == 1) {
                        haVar.b = i6 + 1;
                    } else if (i3 == 2) {
                        haVar.b = i6 - 1;
                    }
                    i2--;
                }
            } else if (i6 <= i2) {
                if (b == 1) {
                    i2 -= haVar.d;
                } else if (b == 2) {
                    i2 += haVar.d;
                }
            } else if (i3 == 1) {
                haVar.b = i6 + 1;
            } else if (i3 == 2) {
                haVar.b = i6 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ha haVar2 = (ha) arrayList.get(size2);
            byte b2 = haVar2.a;
            int i8 = haVar2.d;
            if (b2 == 8) {
                if (i8 == haVar2.b || i8 < 0) {
                    arrayList.remove(size2);
                    haVar2.c = null;
                    edVar.r0(haVar2);
                }
            } else if (i8 <= 0) {
                arrayList.remove(size2);
                haVar2.c = null;
                edVar.r0(haVar2);
            }
        }
        return i2;
    }

    public final String toString() {
        switch (this.a) {
            case 2:
                ycb ycbVar = ycb.e;
                return m();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ ia(byte b) {
        this.a = b;
    }
}
