package d2;

import android.graphics.Color;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c {
    public static final a f = new a(0);
    public static final d g = new d();
    public final Object a;
    public final Object b;
    public final Object c;
    public final Cloneable d;
    public final Object e;

    /* JADX WARN: Multi-variable type inference failed */
    public c(int[] iArr, int i10, d[] dVarArr) {
        b bVar;
        this.e = new float[3];
        this.d = dVarArr;
        int[] iArr2 = new int[32768];
        this.b = iArr2;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            int i12 = iArr[i11];
            int b10 = b(Color.blue(i12), 8, 5) | (b(Color.red(i12), 8, 5) << 10) | (b(Color.green(i12), 8, 5) << 5);
            iArr[i11] = b10;
            iArr2[b10] = iArr2[b10] + 1;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < 32768; i14++) {
            if (iArr2[i14] > 0) {
                int rgb = Color.rgb(b((i14 >> 10) & 31, 5, 8), b((i14 >> 5) & 31, 5, 8), b(i14 & 31, 5, 8));
                float[] fArr = (float[]) this.e;
                ThreadLocal threadLocal = i0.a.a;
                i0.a.b(fArr, Color.red(rgb), Color.green(rgb), Color.blue(rgb));
                if (c(fArr)) {
                    iArr2[i14] = 0;
                }
            }
            if (iArr2[i14] > 0) {
                i13++;
            }
        }
        int[] iArr3 = new int[i13];
        this.a = iArr3;
        int i15 = 0;
        for (int i16 = 0; i16 < 32768; i16++) {
            if (iArr2[i16] > 0) {
                iArr3[i15] = i16;
                i15++;
            }
        }
        if (i13 <= i10) {
            this.c = new ArrayList();
            for (int i17 = 0; i17 < i13; i17++) {
                int i18 = iArr3[i17];
                ((ArrayList) this.c).add(new e(Color.rgb(b((i18 >> 10) & 31, 5, 8), b((i18 >> 5) & 31, 5, 8), b(i18 & 31, 5, 8)), iArr2[i18]));
            }
            return;
        }
        PriorityQueue priorityQueue = new PriorityQueue(i10, f);
        priorityQueue.offer(new b(this, 0, ((int[]) this.a).length - 1));
        while (priorityQueue.size() < i10 && (bVar = (b) priorityQueue.poll()) != null) {
            int i19 = bVar.b;
            int i20 = bVar.a;
            if ((i19 + 1) - i20 <= 1) {
                break;
            }
            c cVar = bVar.j;
            if ((i19 + 1) - i20 <= 1) {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
            int i21 = bVar.e - bVar.d;
            int i22 = bVar.g - bVar.f;
            int i23 = bVar.i - bVar.h;
            int i24 = (i21 < i22 || i21 < i23) ? (i22 < i21 || i22 < i23) ? -1 : -2 : -3;
            int[] iArr4 = (int[]) cVar.a;
            int[] iArr5 = (int[]) cVar.b;
            a(i24, i20, i19, iArr4);
            Arrays.sort(iArr4, i20, bVar.b + 1);
            a(i24, i20, bVar.b, iArr4);
            int i25 = bVar.c / 2;
            int i26 = i20;
            int i27 = 0;
            while (true) {
                int i28 = bVar.b;
                if (i26 > i28) {
                    break;
                }
                i27 += iArr5[iArr4[i26]];
                if (i27 >= i25) {
                    i20 = Math.min(i28 - 1, i26);
                    break;
                }
                i26++;
            }
            b bVar2 = new b(cVar, i20 + 1, bVar.b);
            bVar.b = i20;
            bVar.a();
            priorityQueue.offer(bVar2);
            priorityQueue.offer(bVar);
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            b bVar3 = (b) it.next();
            c cVar2 = bVar3.j;
            int[] iArr6 = (int[]) cVar2.a;
            int[] iArr7 = (int[]) cVar2.b;
            int i29 = 0;
            int i30 = 0;
            int i31 = 0;
            int i32 = 0;
            for (int i33 = bVar3.a; i33 <= bVar3.b; i33++) {
                int i34 = iArr6[i33];
                int i35 = iArr7[i34];
                i30 += i35;
                i29 = (((i34 >> 10) & 31) * i35) + i29;
                i31 = (((i34 >> 5) & 31) * i35) + i31;
                i32 += i35 * (i34 & 31);
            }
            float f9 = i30;
            e eVar = new e(Color.rgb(b(Math.round(i29 / f9), 5, 8), b(Math.round(i31 / f9), 5, 8), b(Math.round(i32 / f9), 5, 8)), i30);
            if (!c(eVar.b())) {
                arrayList.add(eVar);
            }
        }
        this.c = arrayList;
    }

    public static void a(int i10, int i11, int i12, int[] iArr) {
        if (i10 == -2) {
            while (i11 <= i12) {
                int i13 = iArr[i11];
                iArr[i11] = (i13 & 31) | (((i13 >> 5) & 31) << 10) | (((i13 >> 10) & 31) << 5);
                i11++;
            }
            return;
        }
        if (i10 != -1) {
            return;
        }
        while (i11 <= i12) {
            int i14 = iArr[i11];
            iArr[i11] = ((i14 >> 10) & 31) | ((i14 & 31) << 10) | (((i14 >> 5) & 31) << 5);
            i11++;
        }
    }

    public static int b(int i10, int i11, int i12) {
        return (i12 > i11 ? i10 << (i12 - i11) : i10 >> (i11 - i12)) & ((1 << i12) - 1);
    }

    public boolean c(float[] fArr) {
        d[] dVarArr = (d[]) this.d;
        if (dVarArr != null && dVarArr.length > 0) {
            for (d dVar : dVarArr) {
                dVar.getClass();
                float f9 = fArr[2];
                if (f9 < 0.95f && f9 > 0.05f) {
                    float f10 = fArr[0];
                    if (f10 < 10.0f || f10 > 37.0f || fArr[1] > 0.82f) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public c(ArrayList arrayList, List list) {
        this.a = list;
        this.b = arrayList;
        this.d = new SparseBooleanArray();
        this.c = new a0.f(0);
        int size = list.size();
        int i10 = TLObject.FLAG_31;
        e eVar = null;
        for (int i11 = 0; i11 < size; i11++) {
            e eVar2 = (e) list.get(i11);
            int i12 = eVar2.e;
            if (i12 > i10) {
                eVar = eVar2;
                i10 = i12;
            }
        }
        this.e = eVar;
    }
}
