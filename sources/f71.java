// default package

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class f71 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y71 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ c81 f;

    public /* synthetic */ f71(y71 y71Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, c81 c81Var, byte b) {
        this.a = b;
        this.b = y71Var;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f = c81Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0155 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [int] */
    /* JADX WARN: Type inference failed for: r15v9 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        int i2;
        ?? r15;
        boolean z;
        t71 t71Var;
        boolean z2 = true;
        switch (this.a) {
            case 0:
                y71 y71Var = this.b;
                ArrayList arrayList = this.c;
                ArrayList arrayList2 = this.d;
                ArrayList arrayList3 = this.e;
                c81 c81Var = this.f;
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                if (arrayList.isEmpty()) {
                    i = 0;
                } else {
                    try {
                        i = 0;
                    } catch (Exception e) {
                        e = e;
                        i = 0;
                    }
                    try {
                        y71Var.getMessagesStorage().k0(arrayList, arrayList4, false);
                    } catch (Exception e2) {
                        e = e2;
                        fc4.g(e, true);
                        if (!arrayList2.isEmpty()) {
                        }
                        i2 = i;
                        while (i2 < arrayList3.size()) {
                        }
                        Collections.sort(arrayList3, new sa((byte) 12));
                        gm.c3(new f71(y71Var, arrayList4, arrayList5, arrayList3, c81Var, (byte) 1));
                        return;
                    }
                }
                if (!arrayList2.isEmpty()) {
                    try {
                        y71Var.getMessagesStorage().P(TextUtils.join(",", arrayList2), arrayList5);
                    } catch (Exception e3) {
                        fc4.g(e3, true);
                    }
                }
                i2 = i;
                while (i2 < arrayList3.size()) {
                    if (((s71) arrayList3.get(i2)).c <= 0) {
                        arrayList3.remove(i2);
                        i2--;
                    }
                    i2++;
                }
                Collections.sort(arrayList3, new sa((byte) 12));
                gm.c3(new f71(y71Var, arrayList4, arrayList5, arrayList3, c81Var, (byte) 1));
            default:
                y71 y71Var2 = this.b;
                ArrayList arrayList6 = this.c;
                ArrayList arrayList7 = this.d;
                ArrayList arrayList8 = this.e;
                c81 c81Var2 = this.f;
                y71Var2.getMessagesController().d4(arrayList6, true);
                y71Var2.getMessagesController().X3(arrayList7, true);
                boolean z3 = false;
                s71 s71Var = null;
                int i3 = 0;
                while (i3 < arrayList8.size()) {
                    s71 s71Var2 = (s71) arrayList8.get(i3);
                    if (y71Var2.getMessagesController().a2(s71Var2.a) == null) {
                        s71Var2.a = Long.MAX_VALUE;
                        if (s71Var != null) {
                            SparseArray sparseArray = s71Var.d;
                            int i4 = 0;
                            while (true) {
                                SparseArray sparseArray2 = s71Var2.d;
                                if (i4 < sparseArray2.size()) {
                                    int keyAt = sparseArray2.keyAt(i4);
                                    t71 t71Var2 = (t71) sparseArray2.valueAt(i4);
                                    t71 t71Var3 = (t71) sparseArray.get(keyAt, z3);
                                    if (t71Var3 == null) {
                                        t71Var = new t71();
                                        sparseArray.put(keyAt, t71Var);
                                    } else {
                                        t71Var = t71Var3;
                                    }
                                    t71Var2.getClass();
                                    t71Var.a += t71Var2.a;
                                    s71Var.c += t71Var2.a;
                                    t71Var.b.addAll(t71Var2.b);
                                    i4++;
                                    z2 = z2;
                                    z3 = false;
                                } else {
                                    boolean z4 = z2;
                                    s71Var.b += s71Var2.b;
                                    arrayList8.remove(i3);
                                    i3--;
                                    z = z4 ? 1 : 0;
                                    r15 = z4;
                                }
                            }
                        } else {
                            r15 = z2;
                            s71Var = s71Var2;
                            z = false;
                        }
                        if (z) {
                            Collections.sort(arrayList8, new sa((byte) 12));
                        }
                    } else {
                        r15 = z2;
                    }
                    i3 += r15;
                    z2 = r15;
                    z3 = false;
                }
                boolean z5 = z2;
                c81Var2.b = arrayList8;
                LongSparseArray longSparseArray = c81Var2.c;
                longSparseArray.clear();
                int size = arrayList8.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayList8.get(i5);
                    i5++;
                    s71 s71Var3 = (s71) obj;
                    longSparseArray.put(s71Var3.a, s71Var3);
                }
                if (!y71.i0) {
                    y71Var2.e0 = c81Var2;
                    k71 k71Var = y71Var2.N;
                    if (k71Var != null) {
                        k71Var.setCacheModel(c81Var2);
                    }
                    y71Var2.A0(z5);
                    y71Var2.y0();
                    if (y71Var2.Y != null && !y71Var2.L && System.currentTimeMillis() - y71Var2.b0 > 120) {
                        m71 m71Var = y71Var2.Y;
                        long j = y71Var2.H;
                        boolean z6 = j > 0;
                        long j2 = y71Var2.I;
                        float f = 0.0f;
                        float f2 = j2 <= 0 ? 0.0f : j / j2;
                        if (y71Var2.J > 0 && j2 > 0) {
                            f = (j2 - r8) / j2;
                        }
                        m71Var.b(f2, f, z6);
                        break;
                    }
                }
                break;
        }
    }
}
