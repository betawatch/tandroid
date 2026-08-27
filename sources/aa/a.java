package aa;

import androidx.recyclerview.widget.RecyclerView;
import f2.o1;
import java.io.Serializable;
import java.lang.ref.SoftReference;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Date;
import n2.v;
import org.telegram.messenger.BuildVars;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a {
    public static boolean i = true;
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Serializable d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    public b a() {
        String str = this.b == 0 ? " registrationStatus" : "";
        if (((Long) this.g) == null) {
            str = str.concat(" expiresInSecs");
        }
        if (((Long) this.h) == null) {
            str = s3.c.l(str, " tokenCreationEpochInSecs");
        }
        if (str.isEmpty()) {
            return new b((String) this.c, this.b, (String) this.d, (String) this.e, ((Long) this.g).longValue(), ((Long) this.h).longValue(), (String) this.f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public boolean b(int i10) {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            f2.a aVar = (f2.a) arrayList.get(i11);
            int i12 = aVar.a;
            if (i12 != 8) {
                if (i12 == 1) {
                    int i13 = aVar.b;
                    int i14 = aVar.d + i13;
                    while (i13 < i14) {
                        if (g(i13, i11 + 1) == i10) {
                            return true;
                        }
                        i13++;
                    }
                } else {
                    continue;
                }
            } else {
                if (g(aVar.d, i11 + 1) == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((ae.b) this.f).G((f2.a) arrayList.get(i10));
        }
        m(arrayList);
        this.b = 0;
    }

    public void d() {
        ae.b bVar = (ae.b) this.f;
        c();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            f2.a aVar = (f2.a) arrayList.get(i10);
            int i11 = aVar.a;
            if (i11 == 1) {
                bVar.G(aVar);
                bVar.V(aVar.b, aVar.d);
            } else if (i11 == 2) {
                bVar.G(aVar);
                int i12 = aVar.b;
                int i13 = aVar.d;
                RecyclerView recyclerView = (RecyclerView) bVar.b;
                recyclerView.e0(i12, i13, true);
                recyclerView.s0 = true;
                recyclerView.p0.c += i13;
            } else if (i11 == 4) {
                bVar.G(aVar);
                bVar.T(aVar.b, aVar.d, aVar.c);
            } else if (i11 == 8) {
                bVar.G(aVar);
                bVar.W(aVar.b, aVar.d);
            }
        }
        m(arrayList);
        this.b = 0;
    }

    public void e(f2.a aVar) {
        int i10;
        v vVar = (v) this.c;
        int i11 = aVar.a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int o10 = o(aVar.b, i11);
        int i12 = aVar.b;
        int i13 = aVar.a;
        if (i13 == 2) {
            i10 = 0;
        } else {
            if (i13 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + aVar);
            }
            i10 = 1;
        }
        int i14 = 1;
        for (int i15 = 1; i15 < aVar.d; i15++) {
            int o11 = o((i10 * i15) + aVar.b, aVar.a);
            int i16 = aVar.a;
            if (i16 == 2 ? o11 != o10 : !(i16 == 4 && o11 == o10 + 1)) {
                f2.a j10 = j(i16, o10, aVar.c, i14);
                f(j10, i12);
                j10.c = null;
                vVar.j(j10);
                if (aVar.a == 4) {
                    i12 += i14;
                }
                o10 = o11;
                i14 = 1;
            } else {
                i14++;
            }
        }
        Object obj = aVar.c;
        aVar.c = null;
        vVar.j(aVar);
        if (i14 > 0) {
            f2.a j11 = j(aVar.a, o10, obj, i14);
            f(j11, i12);
            j11.c = null;
            vVar.j(j11);
        }
    }

    public void f(f2.a aVar, int i10) {
        ae.b bVar = (ae.b) this.f;
        bVar.G(aVar);
        int i11 = aVar.a;
        if (i11 != 2) {
            if (i11 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            bVar.T(i10, aVar.d, aVar.c);
        } else {
            int i12 = aVar.d;
            RecyclerView recyclerView = (RecyclerView) bVar.b;
            recyclerView.e0(i10, i12, true);
            recyclerView.s0 = true;
            recyclerView.p0.c += i12;
        }
    }

    public int g(int i10, int i11) {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        while (i11 < size) {
            f2.a aVar = (f2.a) arrayList.get(i11);
            int i12 = aVar.a;
            if (i12 == 8) {
                int i13 = aVar.b;
                if (i13 == i10) {
                    i10 = aVar.d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (aVar.d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = aVar.b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = aVar.d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += aVar.d;
                }
            }
            i11++;
        }
        return i10;
    }

    public boolean h() {
        return ((ArrayList) this.d).size() > 0;
    }

    public void i(String str) {
        int i10;
        ArrayList arrayList = (ArrayList) this.h;
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
        int i11 = 0;
        for (i10 = 0; i10 < stackTrace.length && i11 < 5; i10++) {
            String stackTraceElement = stackTrace[i10].toString();
            if (!stackTraceElement.startsWith("androidx.recyclerview.widget.") || i11 != 0) {
                sb2.append("\n");
                sb2.append(stackTraceElement);
                sb2.append("\n");
                i11++;
            }
        }
        arrayList.add(sb2.toString());
    }

    public f2.a j(int i10, int i11, Object obj, int i12) {
        f2.a aVar = (f2.a) ((v) this.c).b();
        if (aVar != null) {
            aVar.a = i10;
            aVar.b = i11;
            aVar.d = i12;
            aVar.c = obj;
            return aVar;
        }
        f2.a aVar2 = new f2.a();
        aVar2.a = i10;
        aVar2.b = i11;
        aVar2.d = i12;
        aVar2.c = obj;
        return aVar2;
    }

    public void k(f2.a aVar) {
        ae.b bVar = (ae.b) this.f;
        ((ArrayList) this.e).add(aVar);
        int i10 = aVar.a;
        if (i10 == 1) {
            bVar.V(aVar.b, aVar.d);
            return;
        }
        if (i10 == 2) {
            int i11 = aVar.b;
            int i12 = aVar.d;
            RecyclerView recyclerView = (RecyclerView) bVar.b;
            recyclerView.e0(i11, i12, false);
            recyclerView.s0 = true;
            return;
        }
        if (i10 == 4) {
            bVar.T(aVar.b, aVar.d, aVar.c);
        } else if (i10 == 8) {
            bVar.W(aVar.b, aVar.d);
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
        int i10;
        int i11;
        boolean z10;
        char c10;
        f2.a j10;
        int i12;
        int i13;
        f2.a j11;
        boolean z11;
        boolean z12;
        Object obj;
        f2.a aVar;
        v vVar = (v) this.c;
        ae.b bVar = (ae.b) this.f;
        ga.c cVar = (ga.c) this.g;
        ArrayList arrayList = (ArrayList) this.d;
        cVar.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z13 = false;
            while (true) {
                i10 = 8;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((f2.a) arrayList.get(size)).a != 8) {
                    z13 = true;
                } else if (z13) {
                    break;
                }
                size--;
            }
            i11 = 2;
            if (size == -1) {
                break;
            }
            int i14 = size + 1;
            a aVar2 = (a) cVar.b;
            v vVar2 = (v) aVar2.c;
            f2.a aVar3 = (f2.a) arrayList.get(size);
            f2.a aVar4 = (f2.a) arrayList.get(i14);
            int i15 = aVar4.a;
            if (i15 == 1) {
                int i16 = aVar3.d;
                int i17 = aVar4.b;
                int i18 = i16 < i17 ? -1 : 0;
                int i19 = aVar3.b;
                if (i19 < i17) {
                    i18++;
                }
                if (i17 <= i19) {
                    aVar3.b = i19 + aVar4.d;
                }
                int i20 = aVar4.b;
                if (i20 <= i16) {
                    aVar3.d = i16 + aVar4.d;
                }
                aVar4.b = i20 + i18;
                arrayList.set(size, aVar4);
                arrayList.set(i14, aVar3);
            } else if (i15 == 2) {
                int i21 = aVar3.b;
                int i22 = aVar3.d;
                if (i21 < i22) {
                    if (aVar4.b == i21 && aVar4.d == i22 - i21) {
                        z11 = false;
                        z12 = true;
                    } else {
                        z11 = false;
                        z12 = false;
                    }
                } else if (aVar4.b == i22 + 1 && aVar4.d == i21 - i22) {
                    z11 = true;
                    z12 = true;
                } else {
                    z11 = true;
                    z12 = false;
                }
                int i23 = aVar4.b;
                if (i22 < i23) {
                    aVar4.b = i23 - 1;
                } else {
                    int i24 = aVar4.d;
                    if (i22 < i23 + i24) {
                        aVar4.d = i24 - 1;
                        aVar3.a = 2;
                        aVar3.d = 1;
                        if (aVar4.d == 0) {
                            arrayList.remove(i14);
                            aVar4.c = null;
                            vVar2.j(aVar4);
                        }
                    }
                }
                int i25 = aVar3.b;
                int i26 = aVar4.b;
                if (i25 <= i26) {
                    aVar4.b = i26 + 1;
                } else {
                    int i27 = i26 + aVar4.d;
                    if (i25 < i27) {
                        obj = null;
                        f2.a j12 = aVar2.j(2, i25 + 1, null, i27 - i25);
                        aVar4.d = aVar3.b - aVar4.b;
                        aVar = j12;
                        if (z12) {
                            if (z11) {
                                if (aVar != null) {
                                    int i28 = aVar3.b;
                                    if (i28 > aVar.b) {
                                        aVar3.b = i28 - aVar.d;
                                    }
                                    int i29 = aVar3.d;
                                    if (i29 > aVar.b) {
                                        aVar3.d = i29 - aVar.d;
                                    }
                                }
                                int i30 = aVar3.b;
                                if (i30 > aVar4.b) {
                                    aVar3.b = i30 - aVar4.d;
                                }
                                int i31 = aVar3.d;
                                if (i31 > aVar4.b) {
                                    aVar3.d = i31 - aVar4.d;
                                }
                            } else {
                                if (aVar != null) {
                                    int i32 = aVar3.b;
                                    if (i32 >= aVar.b) {
                                        aVar3.b = i32 - aVar.d;
                                    }
                                    int i33 = aVar3.d;
                                    if (i33 >= aVar.b) {
                                        aVar3.d = i33 - aVar.d;
                                    }
                                }
                                int i34 = aVar3.b;
                                if (i34 >= aVar4.b) {
                                    aVar3.b = i34 - aVar4.d;
                                }
                                int i35 = aVar3.d;
                                if (i35 >= aVar4.b) {
                                    aVar3.d = i35 - aVar4.d;
                                }
                            }
                            arrayList.set(size, aVar4);
                            if (aVar3.b != aVar3.d) {
                                arrayList.set(i14, aVar3);
                            } else {
                                arrayList.remove(i14);
                            }
                            if (aVar != null) {
                                arrayList.add(size, aVar);
                            }
                        } else {
                            arrayList.set(size, aVar4);
                            arrayList.remove(i14);
                            aVar3.c = obj;
                            vVar2.j(aVar3);
                        }
                    }
                }
                obj = null;
                aVar = null;
                if (z12) {
                }
            } else if (i15 == 4) {
                int i36 = aVar3.d;
                int i37 = aVar4.b;
                if (i36 < i37) {
                    aVar4.b = i37 - 1;
                } else {
                    int i38 = aVar4.d;
                    if (i36 < i37 + i38) {
                        aVar4.d = i38 - 1;
                        j10 = aVar2.j(4, aVar3.b, aVar4.c, 1);
                        i12 = aVar3.b;
                        i13 = aVar4.b;
                        if (i12 > i13) {
                            aVar4.b = i13 + 1;
                        } else {
                            int i39 = i13 + aVar4.d;
                            if (i12 < i39) {
                                int i40 = i39 - i12;
                                j11 = aVar2.j(4, i12 + 1, aVar4.c, i40);
                                aVar4.d -= i40;
                                arrayList.set(i14, aVar3);
                                if (aVar4.d > 0) {
                                    arrayList.set(size, aVar4);
                                } else {
                                    arrayList.remove(size);
                                    aVar4.c = null;
                                    vVar2.j(aVar4);
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
                        arrayList.set(i14, aVar3);
                        if (aVar4.d > 0) {
                        }
                        if (j10 != null) {
                        }
                        if (j11 != null) {
                        }
                    }
                }
                j10 = null;
                i12 = aVar3.b;
                i13 = aVar4.b;
                if (i12 > i13) {
                }
                j11 = null;
                arrayList.set(i14, aVar3);
                if (aVar4.d > 0) {
                }
                if (j10 != null) {
                }
                if (j11 != null) {
                }
            }
        }
        int size2 = arrayList.size();
        int i41 = 0;
        while (i41 < size2) {
            f2.a aVar5 = (f2.a) arrayList.get(i41);
            int i42 = aVar5.a;
            if (i42 == 1) {
                k(aVar5);
            } else if (i42 == i11) {
                int i43 = aVar5.b;
                int i44 = aVar5.d + i43;
                int i45 = i43;
                int i46 = 0;
                char c11 = 65535;
                while (i45 < i44) {
                    RecyclerView recyclerView = (RecyclerView) bVar.b;
                    o1 L = recyclerView.L(i45, true);
                    if (L != null) {
                    }
                    L = null;
                    if (L != null || b(i45)) {
                        if (c11 == 0) {
                            e(j(2, i43, null, i46));
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        c10 = 1;
                    } else {
                        if (c11 == 1) {
                            k(j(2, i43, null, i46));
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        c10 = 0;
                    }
                    if (z10) {
                        i45 -= i46;
                        i44 -= i46;
                        i46 = 1;
                    } else {
                        i46++;
                    }
                    i45++;
                    c11 = c10;
                }
                if (i46 != aVar5.d) {
                    aVar5.c = null;
                    vVar.j(aVar5);
                    aVar5 = j(2, i43, null, i46);
                }
                if (c11 == 0) {
                    e(aVar5);
                } else {
                    k(aVar5);
                }
            } else if (i42 == 4) {
                int i47 = aVar5.b;
                int i48 = aVar5.d + i47;
                int i49 = i47;
                int i50 = 0;
                char c12 = 65535;
                while (i47 < i48) {
                    RecyclerView recyclerView2 = (RecyclerView) bVar.b;
                    o1 L2 = recyclerView2.L(i47, true);
                    if (L2 != null) {
                    }
                    L2 = null;
                    if (L2 != null || b(i47)) {
                        if (c12 == 0) {
                            e(j(4, i49, aVar5.c, i50));
                            i49 = i47;
                            i50 = 0;
                        }
                        c12 = 1;
                    } else {
                        if (c12 == 1) {
                            k(j(4, i49, aVar5.c, i50));
                            i49 = i47;
                            i50 = 0;
                        }
                        c12 = 0;
                    }
                    i50++;
                    i47++;
                }
                if (i50 != aVar5.d) {
                    Object obj2 = aVar5.c;
                    aVar5.c = null;
                    vVar.j(aVar5);
                    aVar5 = j(4, i49, obj2, i50);
                }
                if (c12 == 0) {
                    e(aVar5);
                } else {
                    k(aVar5);
                }
            } else if (i42 == i10) {
                k(aVar5);
            }
            i41++;
            i11 = 2;
            i10 = 8;
        }
        arrayList.clear();
    }

    public void m(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            f2.a aVar = (f2.a) arrayList.get(i10);
            aVar.c = null;
            ((v) this.c).j(aVar);
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
        ae.c cVar = ae.c.e;
        if (i) {
            ga.c cVar2 = (ga.c) this.f;
            if (cVar2 == null) {
                try {
                    ga.c cVar3 = new ga.c(1, false);
                    cVar3.b = new SoftReference(new String[3]);
                    this.f = cVar3;
                } catch (Throwable unused) {
                    i = false;
                }
            } else {
                String[] strArr = (String[]) ((SoftReference) cVar2.b).get();
                if (strArr != null) {
                    str = strArr[0];
                    if (str == null) {
                        StringBuffer stringBuffer = new StringBuffer();
                        int i10 = this.b;
                        if (i10 == -1) {
                            throw null;
                        }
                        String str2 = "";
                        if (cVar.c) {
                            String modifier = Modifier.toString(i10);
                            if (modifier.length() != 0) {
                                str2 = modifier.concat(" ");
                            }
                        }
                        stringBuffer.append(str2);
                        if (cVar.b) {
                            ((Class) this.h).getClass();
                            Class cls = (Class) this.h;
                            stringBuffer.append(ae.c.a(cls.getName(), cls, cVar.a));
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
                        stringBuffer.append(ae.c.a((String) this.d, cls2, cVar.d));
                        stringBuffer.append(".");
                        ((String) this.c).getClass();
                        stringBuffer.append((String) this.c);
                        Class[] clsArr = (Class[]) this.g;
                        if (cVar.b) {
                            stringBuffer.append("(");
                            for (int i11 = 0; i11 < clsArr.length; i11++) {
                                if (i11 > 0) {
                                    stringBuffer.append(", ");
                                }
                                Class cls3 = clsArr[i11];
                                stringBuffer.append(ae.c.a(cls3.getName(), cls3, cVar.a));
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
                        ga.c cVar4 = (ga.c) this.f;
                        String[] strArr2 = (String[]) ((SoftReference) cVar4.b).get();
                        if (strArr2 == null) {
                            strArr2 = new String[3];
                            cVar4.b = new SoftReference(strArr2);
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

    public int o(int i10, int i11) {
        int i12;
        int i13;
        v vVar = (v) this.c;
        ArrayList arrayList = (ArrayList) this.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f2.a aVar = (f2.a) arrayList.get(size);
            int i14 = aVar.a;
            if (i14 == 8) {
                int i15 = aVar.b;
                int i16 = aVar.d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 < i13 || i10 > i12) {
                    if (i10 < i15) {
                        if (i11 == 1) {
                            aVar.b = i15 + 1;
                            aVar.d = i16 + 1;
                        } else if (i11 == 2) {
                            aVar.b = i15 - 1;
                            aVar.d = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        aVar.d = i16 + 1;
                    } else if (i11 == 2) {
                        aVar.d = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        aVar.b = i15 + 1;
                    } else if (i11 == 2) {
                        aVar.b = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = aVar.b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= aVar.d;
                    } else if (i14 == 2) {
                        i10 += aVar.d;
                    }
                } else if (i11 == 1) {
                    aVar.b = i17 + 1;
                } else if (i11 == 2) {
                    aVar.b = i17 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            f2.a aVar2 = (f2.a) arrayList.get(size2);
            if (aVar2.a == 8) {
                int i18 = aVar2.d;
                if (i18 == aVar2.b || i18 < 0) {
                    arrayList.remove(size2);
                    aVar2.c = null;
                    vVar.j(aVar2);
                }
            } else if (aVar2.d <= 0) {
                arrayList.remove(size2);
                aVar2.c = null;
                vVar.j(aVar2);
            }
        }
        return i10;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                ae.c cVar = ae.c.e;
                return n();
            default:
                return super.toString();
        }
    }

    public a(ae.b bVar) {
        this.a = 3;
        this.c = new v(30);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.b = 0;
        this.h = BuildVars.DEBUG_VERSION ? new ArrayList() : null;
        this.f = bVar;
        this.g = new ga.c(this, 11);
    }
}
