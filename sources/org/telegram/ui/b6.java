package org.telegram.ui;

import android.os.StatFs;
import android.text.TextUtils;
import android.util.LongSparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y6 b;

    public /* synthetic */ b6(y6 y6Var, int i7) {
        this.a = i7;
        this.b = y6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = 0;
        int i10 = 1;
        switch (this.a) {
            case 0:
                y6 y6Var = this.b;
                y6Var.resumeDelayedFragmentAnimation();
                y6Var.K = false;
                y6Var.A0(true);
                y6Var.y0();
                break;
            case 1:
                y6 y6Var2 = this.b;
                y6Var2.getFileLoader().d.c();
                ci.c cVar = new ci.c(false);
                LongSparseArray longSparseArray = new LongSparseArray();
                y6Var2.q0(org.telegram.messenger.w7.j(4), 6, longSparseArray, cVar);
                y6Var2.q0(org.telegram.messenger.w7.j(0), 0, longSparseArray, cVar);
                y6Var2.q0(org.telegram.messenger.w7.j(100), 0, longSparseArray, cVar);
                y6Var2.q0(org.telegram.messenger.w7.j(2), 1, longSparseArray, cVar);
                y6Var2.q0(org.telegram.messenger.w7.j(101), 1, longSparseArray, cVar);
                y6Var2.q0(org.telegram.messenger.w7.j(1), 4, longSparseArray, cVar);
                y6Var2.q0(org.telegram.messenger.w7.j(6), 6, longSparseArray, cVar);
                y6Var2.q0(org.telegram.messenger.w7.j(3), 2, longSparseArray, cVar);
                y6Var2.q0(org.telegram.messenger.w7.j(5), 2, longSparseArray, cVar);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                while (i7 < longSparseArray.size()) {
                    s6 s6Var = (s6) longSparseArray.valueAt(i7);
                    arrayList.add(s6Var);
                    if (y6Var2.getMessagesController().e2(((s6) arrayList.get(i7)).a) == null) {
                        long j3 = s6Var.a;
                        if (j3 > 0) {
                            arrayList2.add(Long.valueOf(j3));
                        } else {
                            arrayList3.add(Long.valueOf(j3));
                        }
                    }
                    i7++;
                }
                Collections.sort(cVar.d, new a3.c(17));
                Collections.sort(cVar.e, new a3.c(17));
                Collections.sort(cVar.f, new a3.c(17));
                Collections.sort(cVar.g, new a3.c(17));
                Collections.sort(cVar.h, new a3.c(17));
                y6Var2.getMessagesStorage().a.c(new d6(y6Var2, arrayList2, arrayList3, arrayList, cVar, 0));
                break;
            default:
                y6 y6Var3 = this.b;
                y6Var3.f = y6.s0(org.telegram.messenger.w7.j(4), 5);
                if (!y6.h0) {
                    y6Var3.n = y6.s0(org.telegram.messenger.w7.j(4), 4);
                    if (!y6.h0) {
                        long s02 = y6.s0(org.telegram.messenger.w7.j(0), 0);
                        y6Var3.y = s02;
                        y6Var3.y = y6.s0(org.telegram.messenger.w7.j(100), 0) + s02;
                        if (!y6.h0) {
                            long s03 = y6.s0(org.telegram.messenger.w7.j(2), 0);
                            y6Var3.D = s03;
                            y6Var3.D = y6.s0(org.telegram.messenger.w7.j(101), 0) + s03;
                            if (!y6.h0) {
                                y6Var3.E = y6.s0(org.telegram.messenger.g0.P0(), 1);
                                boolean z9 = org.telegram.messenger.r2.a;
                                if (!y6.h0) {
                                    long s04 = y6.s0(org.telegram.messenger.w7.j(3), 1);
                                    y6Var3.r = s04;
                                    y6Var3.r = y6.s0(org.telegram.messenger.w7.j(5), 1) + s04;
                                    if (!y6.h0) {
                                        long s05 = y6.s0(org.telegram.messenger.w7.j(3), 2);
                                        y6Var3.x = s05;
                                        y6Var3.x = y6.s0(org.telegram.messenger.w7.j(5), 2) + s05;
                                        if (!y6.h0) {
                                            y6Var3.F = y6.s0(new File(org.telegram.messenger.w7.j(4), "acache"), 0);
                                            if (!y6.h0) {
                                                y6Var3.h = y6.s0(org.telegram.messenger.w7.j(4), 3);
                                                if (!y6.h0) {
                                                    y6Var3.F += y6Var3.h;
                                                    y6Var3.s = y6.s0(org.telegram.messenger.w7.j(1), 0);
                                                    y6Var3.w = y6.s0(org.telegram.messenger.w7.j(6), 0);
                                                    if (!y6.h0) {
                                                        long j10 = y6Var3.f + y6Var3.n + y6Var3.D + y6Var3.E + y6Var3.s + y6Var3.y + y6Var3.r + y6Var3.x + y6Var3.w + y6Var3.F;
                                                        y6.j0 = Long.valueOf(j10);
                                                        y6Var3.G = j10;
                                                        y6.i0 = System.currentTimeMillis();
                                                        ArrayList d12 = org.telegram.messenger.g0.d1();
                                                        File file = (File) d12.get(0);
                                                        file.getAbsolutePath();
                                                        if (!TextUtils.isEmpty(org.telegram.messenger.iz.h0)) {
                                                            int size = d12.size();
                                                            for (int i11 = 0; i11 < size; i11++) {
                                                                File file2 = (File) d12.get(i11);
                                                                if (file2.getAbsolutePath().startsWith(org.telegram.messenger.iz.h0)) {
                                                                    file = file2;
                                                                }
                                                            }
                                                        }
                                                        try {
                                                            StatFs statFs = new StatFs(file.getPath());
                                                            long blockSizeLong = statFs.getBlockSizeLong();
                                                            long availableBlocksLong = statFs.getAvailableBlocksLong();
                                                            y6Var3.H = statFs.getBlockCountLong() * blockSizeLong;
                                                            y6Var3.I = availableBlocksLong * blockSizeLong;
                                                        } catch (Exception e10) {
                                                            org.telegram.messenger.a8.g(e10, true);
                                                        }
                                                        org.telegram.messenger.g0.h3(new b6(y6Var3, i7));
                                                        org.telegram.messenger.f8 f8Var = y6Var3.getFileLoader().d;
                                                        f8Var.d();
                                                        f8Var.a.c(new b6(y6Var3, i10));
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                break;
        }
    }
}
