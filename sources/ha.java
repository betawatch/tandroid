// default package

import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.lang.ref.SoftReference;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Date;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ha {
    public static boolean i = true;
    public final /* synthetic */ byte a;
    public int b;
    public Object c;
    public Serializable d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public ha(oo8 oo8Var) {
        this.a = (byte) 0;
        this.c = new de(30, (byte) 12);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.b = 0;
        boolean z = e21.a;
        this.f = new ArrayList();
        this.g = oo8Var;
        this.h = new k44(this, (byte) 20);
    }

    public final boolean a(int i2) {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ga gaVar = (ga) arrayList.get(i3);
            byte b = gaVar.a;
            if (b != 8) {
                if (b == 1) {
                    int i4 = gaVar.b;
                    int i5 = gaVar.d + i4;
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
                if (f(gaVar.d, i3 + 1) == i2) {
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
            ((oo8) this.g).s2((ga) arrayList.get(i2));
        }
        l(arrayList);
        this.b = 0;
    }

    public final void c() {
        oo8 oo8Var = (oo8) this.g;
        b();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ga gaVar = (ga) arrayList.get(i2);
            byte b = gaVar.a;
            if (b == 1) {
                oo8Var.s2(gaVar);
                oo8Var.u2(gaVar.b, gaVar.d);
            } else if (b == 2) {
                oo8Var.s2(gaVar);
                int i3 = gaVar.b;
                int i4 = gaVar.d;
                RecyclerView recyclerView = (RecyclerView) oo8Var.b;
                recyclerView.g0(i3, i4, true);
                recyclerView.y0 = true;
                recyclerView.v0.c += i4;
            } else if (b == 4) {
                oo8Var.s2(gaVar);
                oo8Var.t2(gaVar.b, gaVar.d, gaVar.c);
            } else if (b == 8) {
                oo8Var.s2(gaVar);
                oo8Var.v2(gaVar.b, gaVar.d);
            }
        }
        l(arrayList);
        this.b = 0;
    }

    public final void d(ga gaVar) {
        int i2;
        de deVar = (de) this.c;
        byte b = gaVar.a;
        if (b == 1 || b == 8) {
            u36.j("should not dispatch add or move for pre layout");
            return;
        }
        int n = n(gaVar.b, b);
        int i3 = gaVar.b;
        byte b2 = gaVar.a;
        if (b2 == 2) {
            i2 = 0;
        } else {
            if (b2 != 4) {
                u36.i(gaVar, "op should be remove or update.");
                return;
            }
            i2 = 1;
        }
        int i4 = 1;
        for (int i5 = 1; i5 < gaVar.d; i5++) {
            int n2 = n((i2 * i5) + gaVar.b, gaVar.a);
            byte b3 = gaVar.a;
            if (b3 == 2 ? n2 != n : !(b3 == 4 && n2 == n + 1)) {
                ga i6 = i(gaVar.c, b3, n, i4);
                e(i6, i3);
                i6.c = null;
                deVar.p0(i6);
                if (gaVar.a == 4) {
                    i3 += i4;
                }
                i4 = 1;
                n = n2;
            } else {
                i4++;
            }
        }
        Object obj = gaVar.c;
        gaVar.c = null;
        deVar.p0(gaVar);
        if (i4 > 0) {
            ga i7 = i(obj, gaVar.a, n, i4);
            e(i7, i3);
            i7.c = null;
            deVar.p0(i7);
        }
    }

    public final void e(ga gaVar, int i2) {
        oo8 oo8Var = (oo8) this.g;
        oo8Var.s2(gaVar);
        byte b = gaVar.a;
        if (b != 2) {
            if (b == 4) {
                oo8Var.t2(i2, gaVar.d, gaVar.c);
                return;
            } else {
                u36.j("only remove and update ops can be dispatched in first pass");
                return;
            }
        }
        int i3 = gaVar.d;
        RecyclerView recyclerView = (RecyclerView) oo8Var.b;
        recyclerView.g0(i2, i3, true);
        recyclerView.y0 = true;
        recyclerView.v0.c += i3;
    }

    public final int f(int i2, int i3) {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        while (i3 < size) {
            ga gaVar = (ga) arrayList.get(i3);
            byte b = gaVar.a;
            int i4 = gaVar.b;
            if (b == 8) {
                if (i4 == i2) {
                    i2 = gaVar.d;
                } else {
                    if (i4 < i2) {
                        i2--;
                    }
                    if (gaVar.d <= i2) {
                        i2++;
                    }
                }
            } else if (i4 > i2) {
                continue;
            } else if (b == 2) {
                int i5 = gaVar.d;
                if (i2 < i4 + i5) {
                    return -1;
                }
                i2 -= i5;
            } else if (b == 1) {
                i2 += gaVar.d;
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
    public final ga i(Object obj, int i2, int i3, int i4) {
        ga gaVar = (ga) ((de) this.c).U();
        if (gaVar != null) {
            gaVar.a = i2;
            gaVar.b = i3;
            gaVar.d = i4;
            gaVar.c = obj;
            return gaVar;
        }
        ga gaVar2 = new ga();
        gaVar2.a = i2;
        gaVar2.b = i3;
        gaVar2.d = i4;
        gaVar2.c = obj;
        return gaVar2;
    }

    public final void j(ga gaVar) {
        oo8 oo8Var = (oo8) this.g;
        ((ArrayList) this.e).add(gaVar);
        byte b = gaVar.a;
        if (b == 1) {
            oo8Var.u2(gaVar.b, gaVar.d);
            return;
        }
        if (b == 2) {
            int i2 = gaVar.b;
            int i3 = gaVar.d;
            RecyclerView recyclerView = (RecyclerView) oo8Var.b;
            recyclerView.g0(i2, i3, false);
            recyclerView.y0 = true;
            return;
        }
        if (b == 4) {
            oo8Var.t2(gaVar.b, gaVar.d, gaVar.c);
        } else if (b == 8) {
            oo8Var.v2(gaVar.b, gaVar.d);
        } else {
            u36.i(gaVar, "Unknown update op type for ");
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
        ga i2;
        int i3;
        int i4;
        ga i5;
        boolean z2;
        boolean z3;
        Object obj;
        ga gaVar;
        de deVar = (de) this.c;
        RecyclerView recyclerView = (RecyclerView) ((oo8) this.g).b;
        k44 k44Var = (k44) this.h;
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
                if (((ga) arrayList.get(size)).a != 8) {
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
            ha haVar = (ha) k44Var.b;
            de deVar2 = (de) haVar.c;
            ga gaVar2 = (ga) arrayList.get(size);
            ga gaVar3 = (ga) arrayList.get(i6);
            byte b2 = gaVar3.a;
            if (b2 == 1) {
                int i7 = gaVar2.d;
                int i8 = gaVar3.b;
                int i9 = i7 < i8 ? -1 : 0;
                int i10 = gaVar2.b;
                if (i10 < i8) {
                    i9++;
                } else {
                    gaVar2.b = i10 + gaVar3.d;
                }
                int i11 = gaVar3.b;
                if (i11 <= i7) {
                    gaVar2.d = i7 + gaVar3.d;
                }
                gaVar3.b = i11 + i9;
                arrayList.set(size, gaVar3);
                arrayList.set(i6, gaVar2);
            } else if (b2 == 2) {
                int i12 = gaVar2.b;
                int i13 = gaVar2.d;
                int i14 = gaVar3.b;
                if (i12 < i13) {
                    if (i14 == i12 && gaVar3.d == i13 - i12) {
                        z2 = false;
                        z3 = true;
                    } else {
                        z2 = false;
                        z3 = false;
                    }
                } else if (i14 == i13 + 1 && gaVar3.d == i12 - i13) {
                    z2 = true;
                    z3 = true;
                } else {
                    z2 = true;
                    z3 = false;
                }
                if (i13 < i14) {
                    i14--;
                    gaVar3.b = i14;
                } else {
                    int i15 = gaVar3.d;
                    if (i13 < i14 + i15) {
                        gaVar3.d = i15 - 1;
                        gaVar2.a = (byte) 2;
                        gaVar2.d = 1;
                        if (gaVar3.d == 0) {
                            arrayList.remove(i6);
                            gaVar3.c = null;
                            deVar2.p0(gaVar3);
                        }
                    }
                }
                int i16 = gaVar2.b;
                if (i16 <= i14) {
                    gaVar3.b = i14 + 1;
                } else {
                    int i17 = i14 + gaVar3.d;
                    if (i16 < i17) {
                        obj = null;
                        ga i18 = haVar.i(null, 2, i16 + 1, i17 - i16);
                        gaVar3.d = gaVar2.b - gaVar3.b;
                        gaVar = i18;
                        if (z3) {
                            if (z2) {
                                if (gaVar != null) {
                                    int i19 = gaVar2.b;
                                    if (i19 > gaVar.b) {
                                        gaVar2.b = i19 - gaVar.d;
                                    }
                                    int i20 = gaVar2.d;
                                    if (i20 > gaVar.b) {
                                        gaVar2.d = i20 - gaVar.d;
                                    }
                                }
                                int i21 = gaVar2.b;
                                if (i21 > gaVar3.b) {
                                    gaVar2.b = i21 - gaVar3.d;
                                }
                                int i22 = gaVar2.d;
                                if (i22 > gaVar3.b) {
                                    gaVar2.d = i22 - gaVar3.d;
                                }
                            } else {
                                if (gaVar != null) {
                                    int i23 = gaVar2.b;
                                    if (i23 >= gaVar.b) {
                                        gaVar2.b = i23 - gaVar.d;
                                    }
                                    int i24 = gaVar2.d;
                                    if (i24 >= gaVar.b) {
                                        gaVar2.d = i24 - gaVar.d;
                                    }
                                }
                                int i25 = gaVar2.b;
                                if (i25 >= gaVar3.b) {
                                    gaVar2.b = i25 - gaVar3.d;
                                }
                                int i26 = gaVar2.d;
                                if (i26 >= gaVar3.b) {
                                    gaVar2.d = i26 - gaVar3.d;
                                }
                            }
                            arrayList.set(size, gaVar3);
                            if (gaVar2.b != gaVar2.d) {
                                arrayList.set(i6, gaVar2);
                            } else {
                                arrayList.remove(i6);
                            }
                            if (gaVar != null) {
                                arrayList.add(size, gaVar);
                            }
                        } else {
                            arrayList.set(size, gaVar3);
                            arrayList.remove(i6);
                            gaVar2.c = obj;
                            deVar2.p0(gaVar2);
                        }
                    }
                }
                obj = null;
                gaVar = null;
                if (z3) {
                }
            } else if (b2 == 4) {
                int i27 = gaVar2.d;
                int i28 = gaVar3.b;
                if (i27 < i28) {
                    gaVar3.b = i28 - 1;
                } else {
                    int i29 = gaVar3.d;
                    if (i27 < i28 + i29) {
                        gaVar3.d = i29 - 1;
                        i2 = haVar.i(gaVar3.c, 4, gaVar2.b, 1);
                        i3 = gaVar2.b;
                        i4 = gaVar3.b;
                        if (i3 > i4) {
                            gaVar3.b = i4 + 1;
                        } else {
                            int i30 = i4 + gaVar3.d;
                            if (i3 < i30) {
                                int i31 = i30 - i3;
                                i5 = haVar.i(gaVar3.c, 4, i3 + 1, i31);
                                gaVar3.d -= i31;
                                arrayList.set(i6, gaVar2);
                                if (gaVar3.d > 0) {
                                    arrayList.set(size, gaVar3);
                                } else {
                                    arrayList.remove(size);
                                    gaVar3.c = null;
                                    deVar2.p0(gaVar3);
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
                        arrayList.set(i6, gaVar2);
                        if (gaVar3.d > 0) {
                        }
                        if (i2 != null) {
                        }
                        if (i5 != null) {
                        }
                    }
                }
                i2 = null;
                i3 = gaVar2.b;
                i4 = gaVar3.b;
                if (i3 > i4) {
                }
                i5 = null;
                arrayList.set(i6, gaVar2);
                if (gaVar3.d > 0) {
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
            ga gaVar4 = (ga) arrayList.get(i32);
            byte b3 = gaVar4.a;
            if (b3 == 1) {
                j(gaVar4);
            } else if (b3 == 2) {
                int i33 = gaVar4.b;
                int i34 = gaVar4.d + i33;
                int i35 = i33;
                int i36 = 0;
                char c2 = 65535;
                while (i35 < i34) {
                    u69 L = recyclerView.L(i35, true);
                    if (L != null) {
                    }
                    L = null;
                    if (L != null || a(i35)) {
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
                if (i36 != gaVar4.d) {
                    gaVar4.c = null;
                    deVar.p0(gaVar4);
                    gaVar4 = i(null, 2, i33, i36);
                }
                if (c2 == 0) {
                    d(gaVar4);
                } else {
                    j(gaVar4);
                }
            } else if (b3 == 4) {
                int i37 = gaVar4.b;
                int i38 = gaVar4.d + i37;
                int i39 = i37;
                int i40 = 0;
                char c3 = 65535;
                while (i37 < i38) {
                    u69 L2 = recyclerView.L(i37, true);
                    if (L2 != null) {
                    }
                    L2 = null;
                    if (L2 != null || a(i37)) {
                        if (c3 == 0) {
                            d(i(gaVar4.c, 4, i39, i40));
                            i39 = i37;
                            i40 = 0;
                        }
                        c3 = 1;
                    } else {
                        if (c3 == 1) {
                            j(i(gaVar4.c, 4, i39, i40));
                            i39 = i37;
                            i40 = 0;
                        }
                        c3 = 0;
                    }
                    i40++;
                    i37++;
                }
                if (i40 != gaVar4.d) {
                    Object obj2 = gaVar4.c;
                    gaVar4.c = null;
                    deVar.p0(gaVar4);
                    gaVar4 = i(obj2, 4, i39, i40);
                }
                if (c3 == 0) {
                    d(gaVar4);
                } else {
                    j(gaVar4);
                }
            } else if (b3 == b) {
                j(gaVar4);
            }
            i32++;
            b = 8;
        }
        arrayList.clear();
    }

    public final void l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ga gaVar = (ga) arrayList.get(i2);
            gaVar.c = null;
            ((de) this.c).p0(gaVar);
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
        cbb cbbVar = cbb.e;
        if (i) {
            oo8 oo8Var = (oo8) this.f;
            if (oo8Var == null) {
                try {
                    oo8 oo8Var2 = new oo8((byte) 13);
                    oo8Var2.b = new SoftReference(new String[3]);
                    this.f = oo8Var2;
                } catch (Throwable unused) {
                    i = false;
                }
            } else {
                String[] strArr = (String[]) ((SoftReference) oo8Var.b).get();
                if (strArr != null) {
                    str = strArr[0];
                    if (str == null) {
                        StringBuffer stringBuffer = new StringBuffer();
                        int i2 = this.b;
                        if (i2 == -1) {
                            throw null;
                        }
                        String str2 = "";
                        if (cbbVar.c) {
                            String modifier = Modifier.toString(i2);
                            if (modifier.length() != 0) {
                                str2 = modifier.concat(" ");
                            }
                        }
                        stringBuffer.append(str2);
                        if (cbbVar.b) {
                            ((Class) this.h).getClass();
                            Class cls = (Class) this.h;
                            stringBuffer.append(cbb.a(cls.getName(), cls, cbbVar.a));
                        }
                        if (cbbVar.b) {
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
                        stringBuffer.append(cbb.a(str3, cls2, cbbVar.d));
                        stringBuffer.append(".");
                        ((String) this.c).getClass();
                        stringBuffer.append((String) this.c);
                        Class[] clsArr = (Class[]) this.g;
                        if (cbbVar.b) {
                            stringBuffer.append("(");
                            for (int i3 = 0; i3 < clsArr.length; i3++) {
                                if (i3 > 0) {
                                    stringBuffer.append(", ");
                                }
                                Class cls3 = clsArr[i3];
                                stringBuffer.append(cbb.a(cls3.getName(), cls3, cbbVar.a));
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
                        oo8 oo8Var3 = (oo8) this.f;
                        String[] strArr2 = (String[]) ((SoftReference) oo8Var3.b).get();
                        if (strArr2 == null) {
                            strArr2 = new String[3];
                            oo8Var3.b = new SoftReference(strArr2);
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
        de deVar = (de) this.c;
        ArrayList arrayList = (ArrayList) this.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ga gaVar = (ga) arrayList.get(size);
            byte b = gaVar.a;
            int i6 = gaVar.b;
            if (b == 8) {
                int i7 = gaVar.d;
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
                            gaVar.b = i6 + 1;
                            gaVar.d = i7 + 1;
                        } else if (i3 == 2) {
                            gaVar.b = i6 - 1;
                            gaVar.d = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i3 == 1) {
                        gaVar.d = i7 + 1;
                    } else if (i3 == 2) {
                        gaVar.d = i7 - 1;
                    }
                    i2++;
                } else {
                    if (i3 == 1) {
                        gaVar.b = i6 + 1;
                    } else if (i3 == 2) {
                        gaVar.b = i6 - 1;
                    }
                    i2--;
                }
            } else if (i6 <= i2) {
                if (b == 1) {
                    i2 -= gaVar.d;
                } else if (b == 2) {
                    i2 += gaVar.d;
                }
            } else if (i3 == 1) {
                gaVar.b = i6 + 1;
            } else if (i3 == 2) {
                gaVar.b = i6 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ga gaVar2 = (ga) arrayList.get(size2);
            byte b2 = gaVar2.a;
            int i8 = gaVar2.d;
            if (b2 == 8) {
                if (i8 == gaVar2.b || i8 < 0) {
                    arrayList.remove(size2);
                    gaVar2.c = null;
                    deVar.p0(gaVar2);
                }
            } else if (i8 <= 0) {
                arrayList.remove(size2);
                gaVar2.c = null;
                deVar.p0(gaVar2);
            }
        }
        return i2;
    }

    public final String toString() {
        switch (this.a) {
            case 2:
                cbb cbbVar = cbb.e;
                return m();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ ha(byte b) {
        this.a = b;
    }
}
