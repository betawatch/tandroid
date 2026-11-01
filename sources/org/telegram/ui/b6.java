package org.telegram.ui;

import android.os.StatFs;
import android.text.TextUtils;
import android.util.LongSparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y6 b;

    public /* synthetic */ b6(y6 y6Var, int i10) {
        this.a = i10;
        this.b = y6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = 0;
        int i11 = 1;
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
                sh.b bVar = new sh.b(false);
                LongSparseArray longSparseArray = new LongSparseArray();
                y6Var2.q0(org.telegram.messenger.b8.j(4), 6, longSparseArray, bVar);
                y6Var2.q0(org.telegram.messenger.b8.j(0), 0, longSparseArray, bVar);
                y6Var2.q0(org.telegram.messenger.b8.j(100), 0, longSparseArray, bVar);
                y6Var2.q0(org.telegram.messenger.b8.j(2), 1, longSparseArray, bVar);
                y6Var2.q0(org.telegram.messenger.b8.j(101), 1, longSparseArray, bVar);
                y6Var2.q0(org.telegram.messenger.b8.j(1), 4, longSparseArray, bVar);
                y6Var2.q0(org.telegram.messenger.b8.j(6), 6, longSparseArray, bVar);
                y6Var2.q0(org.telegram.messenger.b8.j(3), 2, longSparseArray, bVar);
                y6Var2.q0(org.telegram.messenger.b8.j(5), 2, longSparseArray, bVar);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                while (i10 < longSparseArray.size()) {
                    s6 s6Var = (s6) longSparseArray.valueAt(i10);
                    arrayList.add(s6Var);
                    if (y6Var2.getMessagesController().d2(((s6) arrayList.get(i10)).a) == null) {
                        long j10 = s6Var.a;
                        if (j10 > 0) {
                            arrayList2.add(Long.valueOf(j10));
                        } else {
                            arrayList3.add(Long.valueOf(j10));
                        }
                    }
                    i10++;
                }
                Collections.sort(bVar.d, new dx0(17));
                Collections.sort(bVar.e, new dx0(17));
                Collections.sort(bVar.f, new dx0(17));
                Collections.sort(bVar.g, new dx0(17));
                Collections.sort(bVar.h, new dx0(17));
                y6Var2.getMessagesStorage().a.c(new d6(y6Var2, arrayList2, arrayList3, arrayList, bVar, 0));
                break;
            default:
                y6 y6Var3 = this.b;
                y6Var3.f = y6.s0(org.telegram.messenger.b8.j(4), 5);
                if (!y6.h0) {
                    y6Var3.n = y6.s0(org.telegram.messenger.b8.j(4), 4);
                    if (!y6.h0) {
                        long s02 = y6.s0(org.telegram.messenger.b8.j(0), 0);
                        y6Var3.y = s02;
                        y6Var3.y = y6.s0(org.telegram.messenger.b8.j(100), 0) + s02;
                        if (!y6.h0) {
                            long s03 = y6.s0(org.telegram.messenger.b8.j(2), 0);
                            y6Var3.D = s03;
                            y6Var3.D = y6.s0(org.telegram.messenger.b8.j(101), 0) + s03;
                            if (!y6.h0) {
                                y6Var3.E = y6.s0(org.telegram.messenger.i0.P0(), 1);
                                boolean z10 = org.telegram.messenger.v2.a;
                                if (!y6.h0) {
                                    long s04 = y6.s0(org.telegram.messenger.b8.j(3), 1);
                                    y6Var3.r = s04;
                                    y6Var3.r = y6.s0(org.telegram.messenger.b8.j(5), 1) + s04;
                                    if (!y6.h0) {
                                        long s05 = y6.s0(org.telegram.messenger.b8.j(3), 2);
                                        y6Var3.x = s05;
                                        y6Var3.x = y6.s0(org.telegram.messenger.b8.j(5), 2) + s05;
                                        if (!y6.h0) {
                                            y6Var3.F = y6.s0(new File(org.telegram.messenger.b8.j(4), "acache"), 0);
                                            if (!y6.h0) {
                                                y6Var3.h = y6.s0(org.telegram.messenger.b8.j(4), 3);
                                                if (!y6.h0) {
                                                    y6Var3.F += y6Var3.h;
                                                    y6Var3.s = y6.s0(org.telegram.messenger.b8.j(1), 0);
                                                    y6Var3.w = y6.s0(org.telegram.messenger.b8.j(6), 0);
                                                    if (!y6.h0) {
                                                        long j11 = y6Var3.f + y6Var3.n + y6Var3.D + y6Var3.E + y6Var3.s + y6Var3.y + y6Var3.r + y6Var3.x + y6Var3.w + y6Var3.F;
                                                        y6.j0 = Long.valueOf(j11);
                                                        y6Var3.G = j11;
                                                        y6.i0 = System.currentTimeMillis();
                                                        ArrayList d12 = org.telegram.messenger.i0.d1();
                                                        File file = (File) d12.get(0);
                                                        file.getAbsolutePath();
                                                        if (!TextUtils.isEmpty(org.telegram.messenger.uz.h0)) {
                                                            int size = d12.size();
                                                            for (int i12 = 0; i12 < size; i12++) {
                                                                File file2 = (File) d12.get(i12);
                                                                if (file2.getAbsolutePath().startsWith(org.telegram.messenger.uz.h0)) {
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
                                                        } catch (Exception e) {
                                                            org.telegram.messenger.f8.g(e, true);
                                                        }
                                                        org.telegram.messenger.i0.g3(new b6(y6Var3, i10));
                                                        org.telegram.messenger.k8 k8Var = y6Var3.getFileLoader().d;
                                                        k8Var.d();
                                                        k8Var.a.c(new b6(y6Var3, i11));
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
