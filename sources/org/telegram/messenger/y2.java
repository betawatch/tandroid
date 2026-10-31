package org.telegram.messenger;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class y2 {
    public final int a;
    public boolean b = false;
    public final int[] c = {-1, -1, -1, -1};

    public y2(int i10) {
        this.a = i10;
    }

    public static long a(int i10) {
        if (i10 == 0) {
            return 604800L;
        }
        if (i10 == 1) {
            return 2592000L;
        }
        if (i10 == 3) {
            return 86400L;
        }
        if (i10 == 6) {
            return 172800L;
        }
        if (i10 != 5) {
            return Long.MAX_VALUE;
        }
        boolean z10 = v2.a;
        return Long.MAX_VALUE;
    }

    public static int b(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 0;
        }
        if (i10 == 3) {
            return 6;
        }
        return tz.G;
    }

    public static String f(int i10) {
        return i10 == 5 ? cd.G(1, "Minutes", new Object[0]) : i10 == 3 ? cd.G(1, "Days", new Object[0]) : i10 == 6 ? cd.G(2, "Days", new Object[0]) : i10 == 0 ? cd.G(1, "Weeks", new Object[0]) : i10 == 1 ? cd.G(1, "Months", new Object[0]) : cd.L0(2131753851, null);
    }

    public final int c(int i10) {
        boolean z10 = this.b;
        int[] iArr = this.c;
        if (!z10) {
            this.b = true;
            for (int i11 = 0; i11 < 4; i11++) {
                iArr[i11] = tz.q().getInt(i0.a.i(i11, "keep_media_type_"), b(i11));
            }
        }
        int i12 = iArr[i10];
        return i12 == -1 ? tz.G : i12;
    }

    public final ArrayList d(int i10) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        String string = d20.i(this.a).k().getString("keep_media_exceptions_" + i10, "");
        if (TextUtils.isEmpty(string)) {
            return arrayList;
        }
        ByteBuffer wrap = ByteBuffer.wrap(Utilities.v(string));
        int i11 = wrap.getInt();
        for (int i12 = 0; i12 < i11; i12++) {
            long j10 = wrap.getLong();
            w2 w2Var = new w2(j10, wrap.getInt());
            if (!hashSet.contains(Long.valueOf(j10))) {
                hashSet.add(Long.valueOf(j10));
                arrayList.add(w2Var);
            }
        }
        wrap.clear();
        return arrayList;
    }

    public final LongSparseArray e() {
        LongSparseArray longSparseArray = new LongSparseArray();
        for (int i10 = 0; i10 < 3; i10++) {
            ArrayList d = d(i10);
            for (int i11 = 0; i11 < d.size(); i11++) {
                longSparseArray.put(((w2) d.get(i11)).a, (w2) d.get(i11));
            }
        }
        return longSparseArray;
    }

    public final void g(ArrayList arrayList) {
        int i10;
        int i11 = this.a;
        k8 k8Var = b8.G(i11).d;
        k8Var.getClass();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        LongSparseArray longSparseArray = new LongSparseArray();
        k8Var.h(new ul(k8Var, arrayList, longSparseArray, countDownLatch, 7));
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            f8.g(e, true);
        }
        LongSparseArray e7 = e();
        for (int i12 = 0; i12 < longSparseArray.size(); i12++) {
            long keyAt = longSparseArray.keyAt(i12);
            ArrayList arrayList2 = (ArrayList) longSparseArray.valueAt(i12);
            if (keyAt >= 0) {
                i10 = 0;
            } else {
                long j10 = -keyAt;
                TLRPC.Chat L0 = vp.r1(i11).L0(Long.valueOf(j10));
                if (L0 == null) {
                    L0 = hs.a0(i11).P(j10);
                }
                i10 = L0 == null ? -1 : w3.T(L0) ? 2 : 1;
            }
            w2 w2Var = (w2) e7.get(keyAt);
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                x2 x2Var = (x2) arrayList2.get(i13);
                if (i10 >= 0) {
                    x2Var.c = i10;
                }
                if (w2Var != null) {
                    x2Var.b = w2Var.b;
                }
            }
        }
    }

    public final void h(int i10, ArrayList arrayList) {
        String i11 = i0.a.i(i10, "keep_media_exceptions_");
        boolean isEmpty = arrayList.isEmpty();
        int i12 = this.a;
        if (isEmpty) {
            d20.i(i12).k().edit().remove(i11).apply();
            return;
        }
        int size = arrayList.size();
        ByteBuffer allocate = ByteBuffer.allocate((size * 12) + 4);
        allocate.putInt(size);
        for (int i13 = 0; i13 < size; i13++) {
            allocate.putLong(((w2) arrayList.get(i13)).a);
            allocate.putInt(((w2) arrayList.get(i13)).b);
        }
        d20.i(i12).k().edit().putString(i11, Utilities.f(allocate.array())).apply();
        allocate.clear();
    }
}
