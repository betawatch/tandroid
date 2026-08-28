package f2;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.lang.ref.SoftReference;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.messenger.BuildVars;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b {
    public static boolean i = true;
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Serializable d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public /* synthetic */ b(int i9) {
        this.a = i9;
    }

    public z9.a a() {
        String str = this.b == 0 ? " registrationStatus" : "";
        if (((Long) this.f) == null) {
            str = str.concat(" expiresInSecs");
        }
        if (((Long) this.g) == null) {
            str = ta.b.j(str, " tokenCreationEpochInSecs");
        }
        if (str.isEmpty()) {
            return new z9.a((String) this.c, this.b, (String) this.d, (String) this.e, ((Long) this.f).longValue(), ((Long) this.g).longValue(), (String) this.h);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public boolean b(int i9) {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) arrayList.get(i10);
            int i11 = aVar.a;
            if (i11 != 8) {
                if (i11 == 1) {
                    int i12 = aVar.b;
                    int i13 = aVar.d + i12;
                    while (i12 < i13) {
                        if (g(i12, i10 + 1) == i9) {
                            return true;
                        }
                        i12++;
                    }
                } else {
                    continue;
                }
            } else {
                if (g(aVar.d, i10 + 1) == i9) {
                    return true;
                }
            }
        }
        return false;
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((android.support.v4.media.c) this.g).F((a) arrayList.get(i9));
        }
        m(arrayList);
        this.b = 0;
    }

    public void d() {
        android.support.v4.media.c cVar = (android.support.v4.media.c) this.g;
        c();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            a aVar = (a) arrayList.get(i9);
            int i10 = aVar.a;
            if (i10 == 1) {
                cVar.F(aVar);
                cVar.K(aVar.b, aVar.d);
            } else if (i10 == 2) {
                cVar.F(aVar);
                int i11 = aVar.b;
                int i12 = aVar.d;
                RecyclerView recyclerView = (RecyclerView) cVar.b;
                recyclerView.e0(i11, i12, true);
                recyclerView.s0 = true;
                recyclerView.p0.c += i12;
            } else if (i10 == 4) {
                cVar.F(aVar);
                cVar.J(aVar.b, aVar.d, aVar.c);
            } else if (i10 == 8) {
                cVar.F(aVar);
                cVar.L(aVar.b, aVar.d);
            }
        }
        m(arrayList);
        this.b = 0;
    }

    public void e(a aVar) {
        int i9;
        n2.w wVar = (n2.w) this.c;
        int i10 = aVar.a;
        if (i10 == 1 || i10 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int o6 = o(aVar.b, i10);
        int i11 = aVar.b;
        int i12 = aVar.a;
        if (i12 == 2) {
            i9 = 0;
        } else {
            if (i12 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + aVar);
            }
            i9 = 1;
        }
        int i13 = 1;
        for (int i14 = 1; i14 < aVar.d; i14++) {
            int o9 = o((i9 * i14) + aVar.b, aVar.a);
            int i15 = aVar.a;
            if (i15 == 2 ? o9 != o6 : !(i15 == 4 && o9 == o6 + 1)) {
                a j10 = j(i15, o6, aVar.c, i13);
                f(j10, i11);
                j10.c = null;
                wVar.h(j10);
                if (aVar.a == 4) {
                    i11 += i13;
                }
                o6 = o9;
                i13 = 1;
            } else {
                i13++;
            }
        }
        Object obj = aVar.c;
        aVar.c = null;
        wVar.h(aVar);
        if (i13 > 0) {
            a j11 = j(aVar.a, o6, obj, i13);
            f(j11, i11);
            j11.c = null;
            wVar.h(j11);
        }
    }

    public void f(a aVar, int i9) {
        android.support.v4.media.c cVar = (android.support.v4.media.c) this.g;
        cVar.F(aVar);
        int i10 = aVar.a;
        if (i10 != 2) {
            if (i10 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            cVar.J(i9, aVar.d, aVar.c);
        } else {
            int i11 = aVar.d;
            RecyclerView recyclerView = (RecyclerView) cVar.b;
            recyclerView.e0(i9, i11, true);
            recyclerView.s0 = true;
            recyclerView.p0.c += i11;
        }
    }

    public int g(int i9, int i10) {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        while (i10 < size) {
            a aVar = (a) arrayList.get(i10);
            int i11 = aVar.a;
            if (i11 == 8) {
                int i12 = aVar.b;
                if (i12 == i9) {
                    i9 = aVar.d;
                } else {
                    if (i12 < i9) {
                        i9--;
                    }
                    if (aVar.d <= i9) {
                        i9++;
                    }
                }
            } else {
                int i13 = aVar.b;
                if (i13 > i9) {
                    continue;
                } else if (i11 == 2) {
                    int i14 = aVar.d;
                    if (i9 < i13 + i14) {
                        return -1;
                    }
                    i9 -= i14;
                } else if (i11 == 1) {
                    i9 += aVar.d;
                }
            }
            i10++;
        }
        return i9;
    }

    public boolean h() {
        return ((ArrayList) this.d).size() > 0;
    }

    public void i(String str) {
        int i9;
        ArrayList arrayList = (ArrayList) this.f;
        if (arrayList == null) {
            return;
        }
        while (true) {
            if (arrayList.size() <= 5) {
                break;
            } else {
                arrayList.remove(0);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(new Date().toString());
        sb2.append("  ");
        sb2.append(str);
        sb2.append("\n");
        StackTraceElement[] stackTrace = new Exception().getStackTrace();
        int i10 = 0;
        for (i9 = 0; i9 < stackTrace.length && i10 < 5; i9++) {
            String stackTraceElement = stackTrace[i9].toString();
            if (!stackTraceElement.startsWith("androidx.recyclerview.widget.") || i10 != 0) {
                sb2.append("\n");
                sb2.append(stackTraceElement);
                sb2.append("\n");
                i10++;
            }
        }
        arrayList.add(sb2.toString());
    }

    public a j(int i9, int i10, Object obj, int i11) {
        a aVar = (a) ((n2.w) this.c).a();
        if (aVar != null) {
            aVar.a = i9;
            aVar.b = i10;
            aVar.d = i11;
            aVar.c = obj;
            return aVar;
        }
        a aVar2 = new a();
        aVar2.a = i9;
        aVar2.b = i10;
        aVar2.d = i11;
        aVar2.c = obj;
        return aVar2;
    }

    public void k(a aVar) {
        android.support.v4.media.c cVar = (android.support.v4.media.c) this.g;
        ((ArrayList) this.e).add(aVar);
        int i9 = aVar.a;
        if (i9 == 1) {
            cVar.K(aVar.b, aVar.d);
            return;
        }
        if (i9 == 2) {
            int i10 = aVar.b;
            int i11 = aVar.d;
            RecyclerView recyclerView = (RecyclerView) cVar.b;
            recyclerView.e0(i10, i11, false);
            recyclerView.s0 = true;
            return;
        }
        if (i9 == 4) {
            cVar.J(aVar.b, aVar.d, aVar.c);
        } else if (i9 == 8) {
            cVar.L(aVar.b, aVar.d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + aVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x021d, code lost:
    
        if (((java.util.ArrayList) r15.e.d).contains(r8.a) != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x028e, code lost:
    
        if (((java.util.ArrayList) r13.e.d).contains(r15.a) != false) goto L165;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0129 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void l() {
        int i9;
        int i10;
        boolean z10;
        char c10;
        a j10;
        int i11;
        int i12;
        a j11;
        boolean z11;
        boolean z12;
        Object obj;
        a aVar;
        n2.w wVar = (n2.w) this.c;
        android.support.v4.media.c cVar = (android.support.v4.media.c) this.g;
        xa.c cVar2 = (xa.c) this.h;
        ArrayList arrayList = (ArrayList) this.d;
        cVar2.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z13 = false;
            while (true) {
                i9 = 8;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((a) arrayList.get(size)).a != 8) {
                    z13 = true;
                } else if (z13) {
                    break;
                }
                size--;
            }
            i10 = 2;
            if (size == -1) {
                break;
            }
            int i13 = size + 1;
            b bVar = (b) cVar2.b;
            n2.w wVar2 = (n2.w) bVar.c;
            a aVar2 = (a) arrayList.get(size);
            a aVar3 = (a) arrayList.get(i13);
            int i14 = aVar3.a;
            if (i14 == 1) {
                int i15 = aVar2.d;
                int i16 = aVar3.b;
                int i17 = i15 < i16 ? -1 : 0;
                int i18 = aVar2.b;
                if (i18 < i16) {
                    i17++;
                }
                if (i16 <= i18) {
                    aVar2.b = i18 + aVar3.d;
                }
                int i19 = aVar3.b;
                if (i19 <= i15) {
                    aVar2.d = i15 + aVar3.d;
                }
                aVar3.b = i19 + i17;
                arrayList.set(size, aVar3);
                arrayList.set(i13, aVar2);
            } else if (i14 == 2) {
                int i20 = aVar2.b;
                int i21 = aVar2.d;
                if (i20 < i21) {
                    if (aVar3.b == i20 && aVar3.d == i21 - i20) {
                        z11 = false;
                        z12 = true;
                    } else {
                        z11 = false;
                        z12 = false;
                    }
                } else if (aVar3.b == i21 + 1 && aVar3.d == i20 - i21) {
                    z11 = true;
                    z12 = true;
                } else {
                    z11 = true;
                    z12 = false;
                }
                int i22 = aVar3.b;
                if (i21 < i22) {
                    aVar3.b = i22 - 1;
                } else {
                    int i23 = aVar3.d;
                    if (i21 < i22 + i23) {
                        aVar3.d = i23 - 1;
                        aVar2.a = 2;
                        aVar2.d = 1;
                        if (aVar3.d == 0) {
                            arrayList.remove(i13);
                            aVar3.c = null;
                            wVar2.h(aVar3);
                        }
                    }
                }
                int i24 = aVar2.b;
                int i25 = aVar3.b;
                if (i24 <= i25) {
                    aVar3.b = i25 + 1;
                } else {
                    int i26 = i25 + aVar3.d;
                    if (i24 < i26) {
                        obj = null;
                        a j12 = bVar.j(2, i24 + 1, null, i26 - i24);
                        aVar3.d = aVar2.b - aVar3.b;
                        aVar = j12;
                        if (z12) {
                            if (z11) {
                                if (aVar != null) {
                                    int i27 = aVar2.b;
                                    if (i27 > aVar.b) {
                                        aVar2.b = i27 - aVar.d;
                                    }
                                    int i28 = aVar2.d;
                                    if (i28 > aVar.b) {
                                        aVar2.d = i28 - aVar.d;
                                    }
                                }
                                int i29 = aVar2.b;
                                if (i29 > aVar3.b) {
                                    aVar2.b = i29 - aVar3.d;
                                }
                                int i30 = aVar2.d;
                                if (i30 > aVar3.b) {
                                    aVar2.d = i30 - aVar3.d;
                                }
                            } else {
                                if (aVar != null) {
                                    int i31 = aVar2.b;
                                    if (i31 >= aVar.b) {
                                        aVar2.b = i31 - aVar.d;
                                    }
                                    int i32 = aVar2.d;
                                    if (i32 >= aVar.b) {
                                        aVar2.d = i32 - aVar.d;
                                    }
                                }
                                int i33 = aVar2.b;
                                if (i33 >= aVar3.b) {
                                    aVar2.b = i33 - aVar3.d;
                                }
                                int i34 = aVar2.d;
                                if (i34 >= aVar3.b) {
                                    aVar2.d = i34 - aVar3.d;
                                }
                            }
                            arrayList.set(size, aVar3);
                            if (aVar2.b != aVar2.d) {
                                arrayList.set(i13, aVar2);
                            } else {
                                arrayList.remove(i13);
                            }
                            if (aVar != null) {
                                arrayList.add(size, aVar);
                            }
                        } else {
                            arrayList.set(size, aVar3);
                            arrayList.remove(i13);
                            aVar2.c = obj;
                            wVar2.h(aVar2);
                        }
                    }
                }
                obj = null;
                aVar = null;
                if (z12) {
                }
            } else if (i14 == 4) {
                int i35 = aVar2.d;
                int i36 = aVar3.b;
                if (i35 < i36) {
                    aVar3.b = i36 - 1;
                } else {
                    int i37 = aVar3.d;
                    if (i35 < i36 + i37) {
                        aVar3.d = i37 - 1;
                        j10 = bVar.j(4, aVar2.b, aVar3.c, 1);
                        i11 = aVar2.b;
                        i12 = aVar3.b;
                        if (i11 > i12) {
                            aVar3.b = i12 + 1;
                        } else {
                            int i38 = i12 + aVar3.d;
                            if (i11 < i38) {
                                int i39 = i38 - i11;
                                j11 = bVar.j(4, i11 + 1, aVar3.c, i39);
                                aVar3.d -= i39;
                                arrayList.set(i13, aVar2);
                                if (aVar3.d > 0) {
                                    arrayList.set(size, aVar3);
                                } else {
                                    arrayList.remove(size);
                                    aVar3.c = null;
                                    wVar2.h(aVar3);
                                }
                                if (j10 != null) {
                                    arrayList.add(size, j10);
                                }
                                if (j11 != null) {
                                    arrayList.add(size, j11);
                                }
                            }
                        }
                        j11 = null;
                        arrayList.set(i13, aVar2);
                        if (aVar3.d > 0) {
                        }
                        if (j10 != null) {
                        }
                        if (j11 != null) {
                        }
                    }
                }
                j10 = null;
                i11 = aVar2.b;
                i12 = aVar3.b;
                if (i11 > i12) {
                }
                j11 = null;
                arrayList.set(i13, aVar2);
                if (aVar3.d > 0) {
                }
                if (j10 != null) {
                }
                if (j11 != null) {
                }
            }
        }
        int size2 = arrayList.size();
        int i40 = 0;
        while (i40 < size2) {
            a aVar4 = (a) arrayList.get(i40);
            int i41 = aVar4.a;
            if (i41 == 1) {
                k(aVar4);
            } else if (i41 == i10) {
                int i42 = aVar4.b;
                int i43 = aVar4.d + i42;
                int i44 = i42;
                int i45 = 0;
                char c11 = 65535;
                while (i44 < i43) {
                    RecyclerView recyclerView = (RecyclerView) cVar.b;
                    q1 L = recyclerView.L(i44, true);
                    if (L != null) {
                    }
                    L = null;
                    if (L != null || b(i44)) {
                        if (c11 == 0) {
                            e(j(2, i42, null, i45));
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        c10 = 1;
                    } else {
                        if (c11 == 1) {
                            k(j(2, i42, null, i45));
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        c10 = 0;
                    }
                    if (z10) {
                        i44 -= i45;
                        i43 -= i45;
                        i45 = 1;
                    } else {
                        i45++;
                    }
                    i44++;
                    c11 = c10;
                }
                if (i45 != aVar4.d) {
                    aVar4.c = null;
                    wVar.h(aVar4);
                    aVar4 = j(2, i42, null, i45);
                }
                if (c11 == 0) {
                    e(aVar4);
                } else {
                    k(aVar4);
                }
            } else if (i41 == 4) {
                int i46 = aVar4.b;
                int i47 = aVar4.d + i46;
                int i48 = i46;
                int i49 = 0;
                char c12 = 65535;
                while (i46 < i47) {
                    RecyclerView recyclerView2 = (RecyclerView) cVar.b;
                    q1 L2 = recyclerView2.L(i46, true);
                    if (L2 != null) {
                    }
                    L2 = null;
                    if (L2 != null || b(i46)) {
                        if (c12 == 0) {
                            e(j(4, i48, aVar4.c, i49));
                            i48 = i46;
                            i49 = 0;
                        }
                        c12 = 1;
                    } else {
                        if (c12 == 1) {
                            k(j(4, i48, aVar4.c, i49));
                            i48 = i46;
                            i49 = 0;
                        }
                        c12 = 0;
                    }
                    i49++;
                    i46++;
                }
                if (i49 != aVar4.d) {
                    Object obj2 = aVar4.c;
                    aVar4.c = null;
                    wVar.h(aVar4);
                    aVar4 = j(4, i48, obj2, i49);
                }
                if (c12 == 0) {
                    e(aVar4);
                } else {
                    k(aVar4);
                }
            } else if (i41 == i9) {
                k(aVar4);
            }
            i40++;
            i10 = 2;
            i9 = 8;
        }
        arrayList.clear();
    }

    public void m(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            a aVar = (a) arrayList.get(i9);
            aVar.c = null;
            ((n2.w) this.c).h(aVar);
        }
        arrayList.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String n() {
        String str;
        zd.c cVar = zd.c.e;
        if (i) {
            n5.e0 e0Var = (n5.e0) this.f;
            if (e0Var == null) {
                try {
                    n5.e0 e0Var2 = new n5.e0(28);
                    e0Var2.b = new SoftReference(new String[3]);
                    this.f = e0Var2;
                } catch (Throwable unused) {
                    i = false;
                }
            } else {
                String[] strArr = (String[]) ((SoftReference) e0Var.b).get();
                if (strArr != null) {
                    str = strArr[0];
                    if (str == null) {
                        StringBuffer stringBuffer = new StringBuffer();
                        int i9 = this.b;
                        if (i9 == -1) {
                            throw null;
                        }
                        String str2 = "";
                        if (cVar.c) {
                            String modifier = Modifier.toString(i9);
                            if (modifier.length() != 0) {
                                str2 = modifier.concat(" ");
                            }
                        }
                        stringBuffer.append(str2);
                        if (cVar.b) {
                            ((Class) this.h).getClass();
                            Class cls = (Class) this.h;
                            stringBuffer.append(zd.c.a(cls.getName(), cls, cVar.a));
                        }
                        if (cVar.b) {
                            stringBuffer.append(" ");
                        }
                        ((Class) this.e).getClass();
                        Class cls2 = (Class) this.e;
                        if (((String) this.d) == null) {
                            cls2.getClass();
                            this.d = ((Class) this.e).getName();
                        }
                        stringBuffer.append(zd.c.a((String) this.d, cls2, cVar.d));
                        stringBuffer.append(".");
                        ((String) this.c).getClass();
                        stringBuffer.append((String) this.c);
                        Class[] clsArr = (Class[]) this.g;
                        if (cVar.b) {
                            stringBuffer.append("(");
                            for (int i10 = 0; i10 < clsArr.length; i10++) {
                                if (i10 > 0) {
                                    stringBuffer.append(", ");
                                }
                                Class cls3 = clsArr[i10];
                                stringBuffer.append(zd.c.a(cls3.getName(), cls3, cVar.a));
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
                        n5.e0 e0Var3 = (n5.e0) this.f;
                        String[] strArr2 = (String[]) ((SoftReference) e0Var3.b).get();
                        if (strArr2 == null) {
                            strArr2 = new String[3];
                            e0Var3.b = new SoftReference(strArr2);
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

    public int o(int i9, int i10) {
        int i11;
        int i12;
        n2.w wVar = (n2.w) this.c;
        ArrayList arrayList = (ArrayList) this.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            int i13 = aVar.a;
            if (i13 == 8) {
                int i14 = aVar.b;
                int i15 = aVar.d;
                if (i14 < i15) {
                    i12 = i14;
                    i11 = i15;
                } else {
                    i11 = i14;
                    i12 = i15;
                }
                if (i9 < i12 || i9 > i11) {
                    if (i9 < i14) {
                        if (i10 == 1) {
                            aVar.b = i14 + 1;
                            aVar.d = i15 + 1;
                        } else if (i10 == 2) {
                            aVar.b = i14 - 1;
                            aVar.d = i15 - 1;
                        }
                    }
                } else if (i12 == i14) {
                    if (i10 == 1) {
                        aVar.d = i15 + 1;
                    } else if (i10 == 2) {
                        aVar.d = i15 - 1;
                    }
                    i9++;
                } else {
                    if (i10 == 1) {
                        aVar.b = i14 + 1;
                    } else if (i10 == 2) {
                        aVar.b = i14 - 1;
                    }
                    i9--;
                }
            } else {
                int i16 = aVar.b;
                if (i16 <= i9) {
                    if (i13 == 1) {
                        i9 -= aVar.d;
                    } else if (i13 == 2) {
                        i9 += aVar.d;
                    }
                } else if (i10 == 1) {
                    aVar.b = i16 + 1;
                } else if (i10 == 2) {
                    aVar.b = i16 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            a aVar2 = (a) arrayList.get(size2);
            if (aVar2.a == 8) {
                int i17 = aVar2.d;
                if (i17 == aVar2.b || i17 < 0) {
                    arrayList.remove(size2);
                    aVar2.c = null;
                    wVar.h(aVar2);
                }
            } else if (aVar2.d <= 0) {
                arrayList.remove(size2);
                aVar2.c = null;
                wVar.h(aVar2);
            }
        }
        return i9;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                zd.c cVar = zd.c.e;
                return n();
            default:
                return super.toString();
        }
    }

    public b(android.support.v4.media.c cVar) {
        this.a = 0;
        this.c = new n2.w(30);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.b = 0;
        this.f = BuildVars.DEBUG_VERSION ? new ArrayList() : null;
        this.g = cVar;
        this.h = new xa.c(this, 13);
    }
}
