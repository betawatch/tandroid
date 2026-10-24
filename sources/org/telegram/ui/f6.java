package org.telegram.ui;

import android.os.StatFs;
import android.text.TextUtils;
import android.util.LongSparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class f6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c7 b;

    public /* synthetic */ f6(c7 c7Var, int i10) {
        this.a = i10;
        this.b = c7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c7 c7Var = this.b;
                c7Var.resumeDelayedFragmentAnimation();
                c7Var.L = false;
                c7Var.x0(true);
                c7Var.w0();
                break;
            case 1:
                c7 c7Var2 = this.b;
                c7Var2.getFileLoader().getFileDatabase().ensureDatabaseCreated();
                bi.c cVar = new bi.c(false);
                LongSparseArray longSparseArray = new LongSparseArray();
                c7Var2.p0(FileLoader.checkDirectory(4), 6, longSparseArray, cVar);
                c7Var2.p0(FileLoader.checkDirectory(0), 0, longSparseArray, cVar);
                c7Var2.p0(FileLoader.checkDirectory(100), 0, longSparseArray, cVar);
                c7Var2.p0(FileLoader.checkDirectory(2), 1, longSparseArray, cVar);
                c7Var2.p0(FileLoader.checkDirectory(101), 1, longSparseArray, cVar);
                c7Var2.p0(FileLoader.checkDirectory(1), 4, longSparseArray, cVar);
                c7Var2.p0(FileLoader.checkDirectory(6), 6, longSparseArray, cVar);
                c7Var2.p0(FileLoader.checkDirectory(3), 2, longSparseArray, cVar);
                c7Var2.p0(FileLoader.checkDirectory(5), 2, longSparseArray, cVar);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
                    v6 v6Var = (v6) longSparseArray.valueAt(i10);
                    arrayList.add(v6Var);
                    if (c7Var2.getMessagesController().getUserOrChat(((v6) arrayList.get(i10)).a) == null) {
                        long j10 = v6Var.a;
                        if (j10 > 0) {
                            arrayList2.add(Long.valueOf(j10));
                        } else {
                            arrayList3.add(Long.valueOf(j10));
                        }
                    }
                }
                Collections.sort(cVar.d, new a4.d(6));
                Collections.sort(cVar.e, new a4.d(6));
                Collections.sort(cVar.f, new a4.d(6));
                Collections.sort(cVar.g, new a4.d(6));
                Collections.sort(cVar.h, new a4.d(6));
                c7Var2.getMessagesStorage().getStorageQueue().postRunnable(new g6(c7Var2, arrayList2, arrayList3, arrayList, cVar, 0));
                break;
            default:
                c7 c7Var3 = this.b;
                c7Var3.h = c7.r0(5, FileLoader.checkDirectory(4));
                if (!c7.k0) {
                    c7Var3.r = c7.r0(4, FileLoader.checkDirectory(4));
                    if (!c7.k0) {
                        long r02 = c7.r0(0, FileLoader.checkDirectory(0));
                        c7Var3.y = r02;
                        c7Var3.y = c7.r0(0, FileLoader.checkDirectory(100)) + r02;
                        if (!c7.k0) {
                            long r03 = c7.r0(0, FileLoader.checkDirectory(2));
                            c7Var3.E = r03;
                            c7Var3.E = c7.r0(0, FileLoader.checkDirectory(101)) + r03;
                            if (!c7.k0) {
                                long r04 = c7.r0(1, AndroidUtilities.getLogsDir());
                                c7Var3.F = r04;
                                if (!BuildVars.DEBUG_VERSION && r04 < 268435456) {
                                    c7Var3.F = 0L;
                                }
                                if (!c7.k0) {
                                    long r05 = c7.r0(1, FileLoader.checkDirectory(3));
                                    c7Var3.s = r05;
                                    c7Var3.s = c7.r0(1, FileLoader.checkDirectory(5)) + r05;
                                    if (!c7.k0) {
                                        long r06 = c7.r0(2, FileLoader.checkDirectory(3));
                                        c7Var3.x = r06;
                                        c7Var3.x = c7.r0(2, FileLoader.checkDirectory(5)) + r06;
                                        if (!c7.k0) {
                                            c7Var3.G = c7.r0(0, new File(FileLoader.checkDirectory(4), "acache"));
                                            if (!c7.k0) {
                                                c7Var3.n = c7.r0(3, FileLoader.checkDirectory(4));
                                                if (!c7.k0) {
                                                    c7Var3.G += c7Var3.n;
                                                    c7Var3.v = c7.r0(0, FileLoader.checkDirectory(1));
                                                    c7Var3.w = c7.r0(0, FileLoader.checkDirectory(6));
                                                    if (!c7.k0) {
                                                        long j11 = c7Var3.h + c7Var3.r + c7Var3.E + c7Var3.F + c7Var3.v + c7Var3.y + c7Var3.s + c7Var3.x + c7Var3.w + c7Var3.G;
                                                        c7.m0 = Long.valueOf(j11);
                                                        c7Var3.H = j11;
                                                        c7.l0 = System.currentTimeMillis();
                                                        ArrayList<File> rootDirs = AndroidUtilities.getRootDirs();
                                                        File file = rootDirs.get(0);
                                                        file.getAbsolutePath();
                                                        if (!TextUtils.isEmpty(SharedConfig.storageCacheDir)) {
                                                            int size = rootDirs.size();
                                                            for (int i11 = 0; i11 < size; i11++) {
                                                                File file2 = rootDirs.get(i11);
                                                                if (file2.getAbsolutePath().startsWith(SharedConfig.storageCacheDir)) {
                                                                    file = file2;
                                                                }
                                                            }
                                                        }
                                                        try {
                                                            StatFs statFs = new StatFs(file.getPath());
                                                            long blockSizeLong = statFs.getBlockSizeLong();
                                                            long availableBlocksLong = statFs.getAvailableBlocksLong();
                                                            c7Var3.I = statFs.getBlockCountLong() * blockSizeLong;
                                                            c7Var3.J = availableBlocksLong * blockSizeLong;
                                                        } catch (Exception e) {
                                                            FileLog.e(e);
                                                        }
                                                        AndroidUtilities.runOnUIThread(new f6(c7Var3, 0));
                                                        c7Var3.getFileLoader().getFileDatabase().getQueue().postRunnable(new f6(c7Var3, 1));
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
