// default package

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class g61 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z61 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ d71 f;

    public /* synthetic */ g61(z61 z61Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, d71 d71Var, byte b) {
        this.a = b;
        this.b = z61Var;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f = d71Var;
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
        u61 u61Var;
        boolean z2 = true;
        switch (this.a) {
            case 0:
                z61 z61Var = this.b;
                ArrayList arrayList = this.c;
                ArrayList arrayList2 = this.d;
                ArrayList arrayList3 = this.e;
                d71 d71Var = this.f;
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
                        z61Var.getMessagesStorage().m0(arrayList, arrayList4, false);
                    } catch (Exception e2) {
                        e = e2;
                        cc4.g(e, true);
                        if (!arrayList2.isEmpty()) {
                        }
                        i2 = i;
                        while (i2 < arrayList3.size()) {
                        }
                        Collections.sort(arrayList3, new ta((byte) 12));
                        hl.c3(new g61(z61Var, arrayList4, arrayList5, arrayList3, d71Var, (byte) 1));
                        return;
                    }
                }
                if (!arrayList2.isEmpty()) {
                    try {
                        z61Var.getMessagesStorage().R(TextUtils.join(",", arrayList2), arrayList5);
                    } catch (Exception e3) {
                        cc4.g(e3, true);
                    }
                }
                i2 = i;
                while (i2 < arrayList3.size()) {
                    if (((t61) arrayList3.get(i2)).c <= 0) {
                        arrayList3.remove(i2);
                        i2--;
                    }
                    i2++;
                }
                Collections.sort(arrayList3, new ta((byte) 12));
                hl.c3(new g61(z61Var, arrayList4, arrayList5, arrayList3, d71Var, (byte) 1));
            default:
                z61 z61Var2 = this.b;
                ArrayList arrayList6 = this.c;
                ArrayList arrayList7 = this.d;
                ArrayList arrayList8 = this.e;
                d71 d71Var2 = this.f;
                z61Var2.getMessagesController().j4(arrayList6, true);
                z61Var2.getMessagesController().c4(arrayList7, true);
                boolean z3 = false;
                t61 t61Var = null;
                int i3 = 0;
                while (i3 < arrayList8.size()) {
                    t61 t61Var2 = (t61) arrayList8.get(i3);
                    if (z61Var2.getMessagesController().b2(t61Var2.a) == null) {
                        t61Var2.a = Long.MAX_VALUE;
                        if (t61Var != null) {
                            SparseArray sparseArray = t61Var.d;
                            int i4 = 0;
                            while (true) {
                                SparseArray sparseArray2 = t61Var2.d;
                                if (i4 < sparseArray2.size()) {
                                    int keyAt = sparseArray2.keyAt(i4);
                                    u61 u61Var2 = (u61) sparseArray2.valueAt(i4);
                                    u61 u61Var3 = (u61) sparseArray.get(keyAt, z3);
                                    if (u61Var3 == null) {
                                        u61Var = new u61();
                                        sparseArray.put(keyAt, u61Var);
                                    } else {
                                        u61Var = u61Var3;
                                    }
                                    u61Var2.getClass();
                                    u61Var.a += u61Var2.a;
                                    t61Var.c += u61Var2.a;
                                    u61Var.b.addAll(u61Var2.b);
                                    i4++;
                                    z2 = z2;
                                    z3 = false;
                                } else {
                                    boolean z4 = z2;
                                    t61Var.b += t61Var2.b;
                                    arrayList8.remove(i3);
                                    i3--;
                                    z = z4 ? 1 : 0;
                                    r15 = z4;
                                }
                            }
                        } else {
                            r15 = z2;
                            t61Var = t61Var2;
                            z = false;
                        }
                        if (z) {
                            Collections.sort(arrayList8, new ta((byte) 12));
                        }
                    } else {
                        r15 = z2;
                    }
                    i3 += r15;
                    z2 = r15;
                    z3 = false;
                }
                boolean z5 = z2;
                d71Var2.b = arrayList8;
                LongSparseArray longSparseArray = d71Var2.c;
                longSparseArray.clear();
                int size = arrayList8.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayList8.get(i5);
                    i5++;
                    t61 t61Var3 = (t61) obj;
                    longSparseArray.put(t61Var3.a, t61Var3);
                }
                if (!z61.i0) {
                    z61Var2.e0 = d71Var2;
                    l61 l61Var = z61Var2.N;
                    if (l61Var != null) {
                        l61Var.setCacheModel(d71Var2);
                    }
                    z61Var2.A0(z5);
                    z61Var2.y0();
                    if (z61Var2.Y != null && !z61Var2.L && System.currentTimeMillis() - z61Var2.b0 > 120) {
                        n61 n61Var = z61Var2.Y;
                        long j = z61Var2.H;
                        boolean z6 = j > 0;
                        long j2 = z61Var2.I;
                        float f = 0.0f;
                        float f2 = j2 <= 0 ? 0.0f : j / j2;
                        if (z61Var2.J > 0 && j2 > 0) {
                            f = (j2 - r8) / j2;
                        }
                        n61Var.b(f2, f, z6);
                        break;
                    }
                }
                break;
        }
    }
}
