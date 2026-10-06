package org.telegram.ui;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.SpannableStringBuilder;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FilePathDatabase;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class a7 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public static volatile boolean m0 = false;
    public static long n0;
    public static Long o0;
    public static Long p0;
    public static Long q0;
    public long E;
    public long F;
    public long G;
    public long H;
    public long I;
    public final long J;
    public boolean K;
    public boolean L;
    public k6 M;
    public FrameLayout N;
    public View O;
    public int P;
    public int Q;
    public int R;
    public le.b S;
    public le.b T;
    public int[] U;
    public float[] V;
    public x6 W;
    public m6 X;
    public r6 Y;
    public jv Z;
    public y6 a;
    public long a0;
    public ai.w0 b;
    public org.telegram.ui.Components.bw0 b0;
    public org.telegram.ui.ActionBar.b2 c;
    public org.telegram.ui.ActionBar.f1 c0;
    public final boolean[] d;
    public org.telegram.ui.ActionBar.f1 d0;
    public long e;
    public zh.b e0;
    public long f;
    public final ArrayList f0;
    public final ArrayList g0;
    public long h;
    public boolean h0;
    public org.telegram.ui.ActionBar.z i0;
    public org.telegram.ui.Components.p6 j0;
    public org.telegram.ui.Components.p6 k0;
    public TextView l0;
    public long n;
    public long r;
    public long s;
    public long v;
    public long w;
    public long x;
    public long y;

    public a7() {
        super(null);
        this.d = new boolean[]{true, true, true, true, true, true, true, true, true, true, true};
        this.e = -1L;
        this.f = -1L;
        this.h = -1L;
        this.n = -1L;
        this.r = -1L;
        this.s = -1L;
        this.v = -1L;
        this.w = -1L;
        this.x = -1L;
        this.y = -1L;
        this.E = -1L;
        this.F = -1L;
        this.G = -1L;
        this.H = -1L;
        this.I = -1L;
        this.J = -1L;
        this.K = true;
        this.L = true;
        this.R = -1;
        this.f0 = new ArrayList();
        this.g0 = new ArrayList();
    }

    public static void S(a7 a7Var, boolean z10) {
        if (a7Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(a7Var.getParentActivity(), 3, null);
        a7Var.c = b2Var;
        b2Var.g0 = false;
        b2Var.q(500L);
        MessagesController.getInstance(a7Var.currentAccount).clearQueryTime();
        if (z10) {
            a7Var.getMessagesStorage().fullReset();
        } else {
            a7Var.getMessagesStorage().clearLocalDatabase();
        }
    }

    public static void T(a7 a7Var, boolean z10, long j3, p6 p6Var) {
        if (z10) {
            ImageLoader.getInstance().clearMemory();
        }
        try {
            org.telegram.ui.ActionBar.b2 b2Var = a7Var.c;
            if (b2Var != null) {
                b2Var.dismiss();
                a7Var.c = null;
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        a7Var.getMediaDataController().ringtoneDataStore.b();
        AndroidUtilities.runOnUIThread(new ai.j(a7Var, j3, 19), 150L);
        MediaDataController.getInstance(a7Var.currentAccount).checkAllMedia(true);
        a7Var.getFileLoader().getFileDatabase().getQueue().postRunnable(new f6(a7Var, 1));
        p6Var.run();
    }

    public static /* synthetic */ void U(a7 a7Var, org.telegram.ui.ActionBar.b2 b2Var) {
        FileLoader.getInstance(a7Var.currentAccount).checkCurrentDownloadsFiles();
        try {
            b2Var.dismiss();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public static void W(a7 a7Var, float f7) {
        int i10 = (int) (f7 * 255.0f);
        a7Var.actionBar.setTitleColor(i0.a.k(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.G6, false), i10));
        a7Var.actionBar.setGlassCenterAlpha(i10);
        a7Var.u0();
        a7Var.fragmentView.invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void X(a7 a7Var, o6 o6Var, p6 p6Var) {
        int i10;
        org.telegram.messenger.g7 g7Var;
        int i11;
        char c10;
        int i12 = 1;
        int[] iArr = {0};
        boolean[] zArr = a7Var.d;
        int i13 = 2;
        int i14 = 3;
        int i15 = (zArr[0] ? 2 : 0) + (zArr[1] ? 2 : 0) + (zArr[2] ? 2 : 0) + (zArr[3] ? 2 : 0) + (zArr[4] ? 1 : 0) + (zArr[5] ? 2 : 0) + (zArr[6] ? 1 : 0) + (zArr[7] ? 1 : 0) + (zArr[8] ? 1 : 0) + (zArr[9] ? 1 : 0);
        long currentTimeMillis = System.currentTimeMillis();
        ei.s4 s4Var = new ei.s4(o6Var, iArr, i15, 2);
        org.telegram.messenger.g7 g7Var2 = new org.telegram.messenger.g7(o6Var, iArr, i15, currentTimeMillis, 13);
        long j3 = 0;
        int i16 = 0;
        boolean z10 = false;
        boolean z11 = true;
        while (i16 < 10) {
            if (zArr[i16]) {
                if (i16 == 0) {
                    j3 += a7Var.x;
                    g7Var = g7Var2;
                    i11 = 9;
                    i13 = 0;
                    i14 = 0;
                } else if (i16 == i12) {
                    j3 += a7Var.y;
                    g7Var = g7Var2;
                    i11 = 9;
                    i13 = 0;
                    i14 = 2;
                } else if (i16 == i13) {
                    j3 += a7Var.r;
                    g7Var = g7Var2;
                    i11 = 9;
                    i13 = 1;
                } else if (i16 == i14) {
                    j3 += a7Var.w;
                    g7Var = g7Var2;
                    i11 = 9;
                } else if (i16 == 4) {
                    j3 += a7Var.s;
                    g7Var = g7Var2;
                    i11 = 9;
                    i13 = 0;
                    i14 = 1;
                } else if (i16 == 5) {
                    j3 += a7Var.v;
                    g7Var = g7Var2;
                    i11 = 9;
                    i13 = 0;
                    i14 = 6;
                } else if (i16 == 6) {
                    j3 += a7Var.F;
                    g7Var = g7Var2;
                    i11 = 9;
                    i13 = 0;
                    i14 = 100;
                } else {
                    i10 = 7;
                    if (i16 == 7) {
                        g7Var = g7Var2;
                        j3 += a7Var.f;
                        i11 = 9;
                        i13 = 5;
                    } else {
                        g7Var = g7Var2;
                        if (i16 == 8) {
                            j3 += a7Var.n;
                            i11 = 9;
                            i13 = 4;
                        } else {
                            i11 = 9;
                            if (i16 == 9) {
                                j3 += a7Var.E;
                                i13 = 1;
                                i14 = 0;
                            } else {
                                i13 = 0;
                                i14 = -1;
                            }
                            if (i14 != -1) {
                                if (i16 == i10) {
                                    try {
                                        h0(ApplicationLoader.getFilesDirFixed("rasterized/wallpaper").getAbsolutePath(), 0, null, null);
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                }
                                File logsDir = i16 == i11 ? AndroidUtilities.getLogsDir() : i14 == 100 ? new File(FileLoader.checkDirectory(4), "acache") : FileLoader.checkDirectory(i14);
                                if (logsDir != null) {
                                    h0(logsDir.getAbsolutePath(), i13, null, s4Var);
                                }
                                iArr[0] = iArr[0] + 1;
                                g7Var.run();
                                if (i14 == 100) {
                                    File checkDirectory = FileLoader.checkDirectory(4);
                                    if (checkDirectory != null) {
                                        h0(checkDirectory.getAbsolutePath(), 3, null, s4Var);
                                    }
                                    iArr[0] = iArr[0] + 1;
                                    g7Var.run();
                                }
                                if (i14 == 0 || i14 == 2) {
                                    File checkDirectory2 = FileLoader.checkDirectory(i14 == 0 ? 100 : 101);
                                    if (checkDirectory2 != null) {
                                        h0(checkDirectory2.getAbsolutePath(), i13, null, s4Var);
                                    }
                                    c10 = 0;
                                    iArr[0] = iArr[0] + 1;
                                    g7Var.run();
                                } else {
                                    c10 = 0;
                                }
                                if (i14 == 3) {
                                    File checkDirectory3 = FileLoader.checkDirectory(5);
                                    if (checkDirectory3 != null) {
                                        h0(checkDirectory3.getAbsolutePath(), i13, null, s4Var);
                                    }
                                    iArr[c10] = iArr[c10] + 1;
                                    g7Var.run();
                                }
                                if (i16 == i11) {
                                    a7Var.E = n0(1, AndroidUtilities.getLogsDir());
                                } else if (i14 == 4) {
                                    a7Var.f = n0(5, FileLoader.checkDirectory(4));
                                    a7Var.n = n0(4, FileLoader.checkDirectory(4));
                                    z10 = true;
                                } else if (i14 == 1) {
                                    a7Var.s = n0(i13, FileLoader.checkDirectory(1));
                                } else if (i14 == 6) {
                                    a7Var.v = n0(i13, FileLoader.checkDirectory(6));
                                } else {
                                    if (i14 == 3) {
                                        if (i13 == 1) {
                                            long n02 = n0(i13, FileLoader.checkDirectory(3));
                                            a7Var.r = n02;
                                            a7Var.r = n0(i13, FileLoader.checkDirectory(5)) + n02;
                                        } else {
                                            long n03 = n0(i13, FileLoader.checkDirectory(3));
                                            a7Var.w = n03;
                                            a7Var.w = n0(i13, FileLoader.checkDirectory(5)) + n03;
                                        }
                                    } else if (i14 == 0) {
                                        long n04 = n0(i13, FileLoader.checkDirectory(0));
                                        a7Var.x = n04;
                                        a7Var.x = n0(i13, FileLoader.checkDirectory(100)) + n04;
                                        z10 = true;
                                    } else if (i14 == 2) {
                                        long n05 = n0(i13, FileLoader.checkDirectory(2));
                                        a7Var.y = n05;
                                        a7Var.y = n0(i13, FileLoader.checkDirectory(101)) + n05;
                                    } else if (i14 == 100) {
                                        a7Var.F = n0(i13, new File(FileLoader.checkDirectory(4), "acache"));
                                        long n06 = n0(3, FileLoader.checkDirectory(4));
                                        a7Var.h = n06;
                                        a7Var.F += n06;
                                        z10 = true;
                                        i16++;
                                        g7Var2 = g7Var;
                                        i12 = 1;
                                        i13 = 2;
                                        i14 = 3;
                                    }
                                    i16++;
                                    g7Var2 = g7Var;
                                    i12 = 1;
                                    i13 = 2;
                                    i14 = 3;
                                }
                            }
                        }
                    }
                    i14 = 4;
                    if (i14 != -1) {
                    }
                }
                i10 = 7;
                if (i14 != -1) {
                }
            } else {
                g7Var = g7Var2;
                z11 = false;
            }
            i16++;
            g7Var2 = g7Var;
            i12 = 1;
            i13 = 2;
            i14 = 3;
        }
        long j10 = a7Var.f + a7Var.n + a7Var.E + a7Var.y + a7Var.s + a7Var.x + a7Var.r + a7Var.w + a7Var.F + a7Var.v;
        o0 = Long.valueOf(j10);
        a7Var.G = j10;
        n0 = System.currentTimeMillis();
        Arrays.fill(zArr, true);
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong();
        a7Var.H = statFs.getBlockCountLong() * blockSizeLong;
        a7Var.I = availableBlocksLong * blockSizeLong;
        if (z11) {
            FileLoader.getInstance(a7Var.currentAccount).clearFilePaths();
        }
        FileLoader.getInstance(a7Var.currentAccount).checkCurrentDownloadsFiles();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.o8(a7Var, z10, j3, p6Var, 8));
    }

    public static void d0(a7 a7Var) {
        String formatPluralString;
        if (a7Var.e0.j.size() <= 0) {
            a7Var.M.f(false);
            return;
        }
        if (a7Var.M != null) {
            if (a7Var.e0.l.isEmpty()) {
                formatPluralString = LocaleController.formatPluralString("Files", a7Var.e0.j.size(), Integer.valueOf(a7Var.e0.j.size()));
            } else {
                ArrayList arrayList = a7Var.e0.b;
                int size = arrayList.size();
                int i10 = 0;
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    u6 u6Var = (u6) obj;
                    if (a7Var.e0.l.contains(Long.valueOf(u6Var.a))) {
                        i10 += u6Var.b;
                    }
                }
                int size2 = a7Var.e0.j.size() - i10;
                formatPluralString = size2 > 0 ? a4.a.D(LocaleController.formatPluralString("Chats", a7Var.e0.l.size(), Integer.valueOf(a7Var.e0.l.size())), ", ", LocaleController.formatPluralString("Files", size2, Integer.valueOf(size2))) : LocaleController.formatPluralString("Chats", a7Var.e0.l.size(), Integer.valueOf(a7Var.e0.l.size()));
            }
            a7Var.j0.c(AndroidUtilities.formatFileSize(a7Var.e0.k), !LocaleController.isRTL, true);
            a7Var.k0.c(formatPluralString, !LocaleController.isRTL, true);
            a7Var.M.f(true);
        }
    }

    public static String e0(a7 a7Var, float f7) {
        if (f7 < 0.001f) {
            return String.format("<%.1f%%", Float.valueOf(0.1f));
        }
        float round = Math.round(f7 * 100.0f);
        return round <= 0.0f ? String.format("<%d%%", 1) : String.format("%d%%", Integer.valueOf((int) round));
    }

    public static void f0(a7 a7Var, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(a7Var.getParentActivity());
        String string = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.R = string;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.LocalDatabaseClearText));
        spannableStringBuilder.append((CharSequence) "\n\n");
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("LocalDatabaseClearText2", R.string.LocalDatabaseClearText2, AndroidUtilities.formatFileSize(a7Var.e))));
        b2Var.T = spannableStringBuilder;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.CacheClear), new ai.k(5, a7Var, z10));
        a7Var.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q7, false));
        }
    }

    public static void g0(Utilities.Callback callback) {
        Long l4 = o0;
        if (l4 != null) {
            callback.run(l4);
            if (System.currentTimeMillis() - n0 < 5000) {
                return;
            }
        }
        Utilities.cacheClearQueue.postRunnable(new hu0(callback, 15));
    }

    public static void h0(String str, int i10, int[] iArr, Utilities.Callback callback) {
        File[] listFiles;
        int k02 = k0(i10, str);
        if (iArr == null) {
            iArr = new int[]{0};
        }
        File file = new File(str);
        if (!file.exists() || (listFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : listFiles) {
            String name = file2.getName();
            if (!".".equals(name)) {
                if (i10 > 0 && name.length() >= 4) {
                    String lowerCase = name.toLowerCase();
                    boolean z10 = lowerCase.endsWith(".mp3") || lowerCase.endsWith(".m4a");
                    boolean z11 = lowerCase.endsWith(".tgs") || lowerCase.endsWith(".webm");
                    boolean z12 = lowerCase.endsWith(".tmp") || lowerCase.endsWith(".temp") || lowerCase.endsWith(".preload");
                    if (z10) {
                        if (i10 == 1) {
                        }
                    }
                    if (!z10) {
                        if (i10 == 2) {
                        }
                    }
                    if (z11) {
                        if (i10 == 5) {
                        }
                    }
                    if (!z11) {
                        if (i10 == 3) {
                        }
                    }
                    if (z12) {
                        if (i10 == 5) {
                        }
                    }
                    if (!z12 && i10 == 4) {
                    }
                }
                if (!file2.isDirectory()) {
                    file2.delete();
                    int i11 = iArr[0] + 1;
                    iArr[0] = i11;
                    if (callback != null) {
                        callback.run(Float.valueOf(i11 / k02));
                    }
                } else if (!"drafts".equals(file2.getName())) {
                    h0(a4.a.D(str, "/", name), i10, iArr, callback);
                }
            }
        }
    }

    public static int k0(int i10, String str) {
        File[] listFiles;
        File file = new File(str);
        if (!file.exists() || (listFiles = file.listFiles()) == null) {
            return 0;
        }
        int i11 = 0;
        for (File file2 : listFiles) {
            String name = file2.getName();
            if (!".".equals(name)) {
                if (i10 > 0 && name.length() >= 4) {
                    String lowerCase = name.toLowerCase();
                    boolean z10 = lowerCase.endsWith(".mp3") || lowerCase.endsWith(".m4a");
                    boolean z11 = lowerCase.endsWith(".tgs") || lowerCase.endsWith(".webm");
                    boolean z12 = lowerCase.endsWith(".tmp") || lowerCase.endsWith(".temp") || lowerCase.endsWith(".preload");
                    if (z10) {
                        if (i10 == 1) {
                        }
                    }
                    if (!z10) {
                        if (i10 == 2) {
                        }
                    }
                    if (z11) {
                        if (i10 == 5) {
                        }
                    }
                    if (!z11) {
                        if (i10 == 3) {
                        }
                    }
                    if (z12) {
                        if (i10 == 5) {
                        }
                    }
                    if (!z12 && i10 == 4) {
                    }
                }
                i11 = file2.isDirectory() ? i11 + k0(i10, str + "/" + name) : i11 + 1;
            }
        }
        return i11;
    }

    public static void m0(c5 c5Var) {
        Long l4;
        Long l10 = p0;
        if (l10 == null || (l4 = q0) == null) {
            Utilities.cacheClearQueue.postRunnable(new hu0(c5Var, 14));
        } else {
            c5Var.run(l10, l4);
        }
    }

    public static long n0(int i10, File file) {
        if (file != null && !m0) {
            if (file.isDirectory()) {
                return Utilities.getDirSize(file.getAbsolutePath(), i10, false);
            }
            if (file.isFile()) {
                return file.length();
            }
        }
        return 0L;
    }

    public static boolean p0(int i10, String str) {
        if (str == null || FileLoader.checkDirectory(i10) == null) {
            return false;
        }
        return str.contains(FileLoader.checkDirectory(i10).getAbsolutePath());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.actionBar.setBackgroundDrawable(null);
        boolean z10 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        int i10 = 1;
        this.actionBar.setOccupyStatusBar(true);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        kVar.setTitleColor(i0.a.k(org.telegram.ui.ActionBar.i6.w0(null, i11, false), 0));
        this.actionBar.A(org.telegram.ui.ActionBar.i6.w0(null, i11, false), false);
        this.actionBar.z(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.i6, false), false);
        hg.c.u(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.StorageUsage));
        this.actionBar.setActionBarMenuOnItemClick(new ei.u(this, 22));
        this.i0 = this.actionBar.j(null);
        FrameLayout frameLayout = new FrameLayout(context);
        this.i0.addView(frameLayout, w7.z5.m(1.0f, 0, -1, 72, 0, 0));
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, true, true, true);
        this.j0 = p6Var;
        org.telegram.ui.Components.tr trVar = org.telegram.ui.Components.tr.h;
        p6Var.b(0.35f, 350L, trVar);
        this.j0.setTextSize(AndroidUtilities.dp(18.0f));
        this.j0.setTypeface(AndroidUtilities.bold());
        this.j0.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        frameLayout.addView(this.j0, w7.z5.d(-1, 18.0f, 19, 0.0f, -11.0f, 18.0f, 0.0f));
        org.telegram.ui.Components.p6 p6Var2 = new org.telegram.ui.Components.p6(context, true, true, true);
        this.k0 = p6Var2;
        p6Var2.b(0.35f, 350L, trVar);
        this.k0.setTextSize(AndroidUtilities.dp(14.0f));
        this.k0.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.y6, false));
        frameLayout.addView(this.k0, w7.z5.d(-1, 18.0f, 19, 0.0f, 10.0f, 18.0f, 0.0f));
        TextView textView = new TextView(context);
        this.l0 = textView;
        textView.setTextSize(1, 14.0f);
        this.l0.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        this.l0.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Sh, false));
        this.l0.setBackground(org.telegram.ui.ActionBar.x5.f(new float[]{6.0f}, org.telegram.ui.ActionBar.i6.Oh));
        this.l0.setTypeface(AndroidUtilities.bold());
        this.l0.setGravity(17);
        this.l0.setText(LocaleController.getString(R.string.CacheClear));
        int i12 = 5;
        this.l0.setOnClickListener(new a(this, i12));
        if (LocaleController.isRTL) {
            frameLayout.addView(this.l0, w7.z5.d(-2, 28.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            frameLayout.addView(this.l0, w7.z5.d(-2, 28.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        }
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(2, R.drawable.ic_ab_other);
        org.telegram.ui.ActionBar.f1 e7 = a2.e(3, R.drawable.msg_delete, LocaleController.getString(R.string.ClearLocalDatabase));
        this.c0 = e7;
        int i13 = org.telegram.ui.ActionBar.i6.p7;
        e7.setIconColor(org.telegram.ui.ActionBar.i6.w0(null, i13, false));
        org.telegram.ui.ActionBar.f1 f1Var = this.c0;
        int i14 = org.telegram.ui.ActionBar.i6.q7;
        f1Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i14, false));
        this.c0.setSelectorColor(org.telegram.ui.ActionBar.i6.l1(0.12f, org.telegram.ui.ActionBar.i6.w0(null, i13, false)));
        int i15 = 4;
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            org.telegram.ui.ActionBar.f1 e10 = a2.e(4, R.drawable.msg_delete, "Full Reset Database");
            this.d0 = e10;
            e10.setIconColor(org.telegram.ui.ActionBar.i6.w0(null, i13, false));
            this.d0.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i14, false));
            this.d0.setSelectorColor(org.telegram.ui.ActionBar.i6.l1(0.12f, org.telegram.ui.ActionBar.i6.w0(null, i13, false)));
        }
        if (this.c0 != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ClearLocalDatabase));
            this.c0.setText(spannableStringBuilder);
        }
        this.a = new y6(this, context);
        org.telegram.ui.Components.bw0 bw0Var = new org.telegram.ui.Components.bw0(context);
        this.b0 = bw0Var;
        bw0Var.setDebugLoggingEnabled(true);
        this.b0.setCommonInsetsManagedExternally(true);
        this.b0.setGeometry(new i6(this));
        org.telegram.ui.Components.bw0 bw0Var2 = this.b0;
        this.fragmentView = bw0Var2;
        bw0Var2.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.a7, false));
        ai.w0 w0Var = new ai.w0(this, context, i12);
        this.b = w0Var;
        w0Var.r1();
        this.b.setClipToPadding(false);
        this.b.setVerticalScrollBarEnabled(false);
        ai.w0 w0Var2 = this.b;
        org.telegram.ui.Components.bw0 bw0Var3 = this.b0;
        bw0Var3.getClass();
        w0Var2.setLayoutManager(new gg.j0(i12, bw0Var3, z10));
        this.b0.u(this.b, new c6(this, i15));
        this.b.setAdapter(this.a);
        j6 j6Var = new j6(this);
        j6Var.n(350L);
        j6Var.o(trVar);
        j6Var.C = false;
        j6Var.m = false;
        this.b.setItemAnimator(j6Var);
        this.b.setOnItemClickListener(new c6(this, i12));
        this.b.j(new i3(this, 3));
        View view = new View(context);
        this.O = view;
        bw0Var2.addView(view, w7.z5.e(-1, 0, 48));
        this.S = new le.b(0, new c6(this, objArr2 == true ? 1 : 0), trVar, 380L, false);
        this.T = new le.b(1, new c6(this, i10), trVar, 380L, false);
        u0();
        bw0Var2.addView(this.actionBar, w7.z5.c(-2.0f, -1));
        getBaseSimpleGlass().d(bw0Var2, this.b, this.actionBar, this.resourceProvider);
        k6 k6Var = new k6(this, context, this, this.glassEngine, this.b0);
        this.M = k6Var;
        k6Var.x = true;
        FrameLayout frameLayout2 = k6Var.b;
        AndroidUtilities.removeFromParent(frameLayout2);
        frameLayout2.setTranslationY(0.0f);
        this.N = frameLayout2;
        ch.d c10 = getBaseSimpleGlass().c.c(this.N, null, false);
        c10.w(eh.b.m(this.resourceProvider));
        c10.x(AndroidUtilities.dp(9.66f));
        c10.y(AndroidUtilities.dp(18.0f));
        frameLayout2.setBackground(c10);
        org.telegram.ui.Components.bw0 bw0Var4 = this.b0;
        k6 k6Var2 = this.M;
        org.telegram.ui.Components.h91 viewPager = k6Var2.getViewPager();
        k6 k6Var3 = this.M;
        Objects.requireNonNull(k6Var3);
        bw0Var4.x(k6Var2, viewPager, new z0(k6Var3, 8));
        this.b0.y(this.N);
        this.N.setLayoutParams(w7.z5.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        this.actionBar.bringToFront();
        this.N.bringToFront();
        this.M.setDelegate(new i6(this));
        this.M.setCacheModel(this.e0);
        getBaseSimpleGlass().i = new di.f(3, this, new d6(objArr == true ? 1 : 0, bw0Var2));
        this.O.setBackground(getBaseSimpleGlass().a(this.O));
        this.actionBar.setGlassCenterAlpha(0);
        this.actionBar.setBackground(null);
        q0(this.P, this.Q);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didClearDatabase) {
            try {
                org.telegram.ui.ActionBar.b2 b2Var = this.c;
                if (b2Var != null) {
                    b2Var.dismiss();
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            this.c = null;
            if (this.a != null) {
                this.e = MessagesStorage.getInstance(this.currentAccount).getDatabaseSize();
                if (this.c0 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ClearLocalDatabase));
                    this.c0.setText(spannableStringBuilder);
                }
                v0(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        e eVar = new e(this, 1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 16, new Class[]{org.telegram.ui.Cells.ea.class, org.telegram.ui.Components.qw0.class, org.telegram.ui.Components.bz0.class, org.telegram.ui.Cells.m4.class}, null, null, null, org.telegram.ui.ActionBar.i6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.i6));
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.i6.I6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{org.telegram.ui.Components.bz0.class}, new String[]{"paintFill"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Ti));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{org.telegram.ui.Components.bz0.class}, new String[]{"paintProgress"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Vi));
        int i12 = org.telegram.ui.ActionBar.i6.y6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{org.telegram.ui.Components.bz0.class}, new String[]{"telegramCacheTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{org.telegram.ui.Components.bz0.class}, new String[]{"freeSizeTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{org.telegram.ui.Components.bz0.class}, new String[]{"calculationgTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{org.telegram.ui.Components.qw0.class}, null, null, null, org.telegram.ui.ActionBar.i6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{org.telegram.ui.Components.qw0.class}, null, null, null, org.telegram.ui.ActionBar.i6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{org.telegram.ui.Components.qw0.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, new Class[]{org.telegram.ui.Cells.a2.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, new Class[]{org.telegram.ui.Cells.a2.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, new Class[]{org.telegram.ui.Cells.a2.class}, org.telegram.ui.ActionBar.i6.k0, null, null, org.telegram.ui.ActionBar.i6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, new Class[]{org.telegram.ui.Components.zy0.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.hj));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.ij));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.jj));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.kj));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.lj));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.mj));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.nj));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.oj));
        return arrayList;
    }

    public final void i0(u6 u6Var, org.telegram.ui.Components.yy0[] yy0VarArr, zh.b bVar) {
        v6 v6Var;
        HashSet hashSet;
        long j3;
        org.telegram.ui.Components.yy0 yy0Var;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, null);
        b2Var.g0 = false;
        b2Var.q(500L);
        HashSet hashSet2 = new HashSet();
        long j10 = this.G;
        int i10 = 0;
        while (i10 < 8) {
            if ((yy0VarArr == null || ((yy0Var = yy0VarArr[i10]) != null && yy0Var.c)) && (v6Var = (v6) u6Var.d.get(i10)) != null) {
                ArrayList arrayList = v6Var.b;
                hashSet2.addAll(arrayList);
                hashSet = hashSet2;
                long j11 = u6Var.c;
                j3 = j10;
                long j12 = v6Var.a;
                u6Var.c = j11 - j12;
                this.G -= j12;
                this.I += j12;
                u6Var.d.delete(i10);
                if (i10 == 0) {
                    this.x -= v6Var.a;
                } else if (i10 == 1) {
                    this.y -= v6Var.a;
                } else if (i10 == 2) {
                    this.r -= v6Var.a;
                } else if (i10 == 3) {
                    this.w -= v6Var.a;
                } else if (i10 == 4) {
                    this.s -= v6Var.a;
                } else if (i10 == 5) {
                    this.F -= v6Var.a;
                } else if (i10 == 7) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        zh.a aVar = (zh.a) arrayList.get(i11);
                        String absolutePath = ((zh.a) arrayList.get(i11)).a.getAbsolutePath();
                        char c10 = 6;
                        if (p0(6, absolutePath)) {
                            c10 = 7;
                        } else if (p0(0, absolutePath) || p0(100, absolutePath)) {
                            c10 = 0;
                        } else if (p0(2, absolutePath) || p0(101, absolutePath)) {
                            c10 = 1;
                        }
                        if (c10 == 7) {
                            this.v -= aVar.c;
                        } else if (c10 == 0) {
                            this.x -= aVar.c;
                        } else if (c10 == 1) {
                            this.y -= aVar.c;
                        } else {
                            this.f -= aVar.c;
                        }
                    }
                } else {
                    this.f -= v6Var.a;
                }
            } else {
                hashSet = hashSet2;
                j3 = j10;
            }
            i10++;
            hashSet2 = hashSet;
            j10 = j3;
        }
        HashSet hashSet3 = hashSet2;
        long j13 = j10;
        if (u6Var.d.size() == 0) {
            this.e0.b.remove(u6Var);
        }
        v0(true);
        if (bVar != null) {
            Iterator it = bVar.j.iterator();
            while (it.hasNext()) {
                zh.a aVar2 = (zh.a) it.next();
                HashSet hashSet4 = hashSet3;
                if (!hashSet4.contains(aVar2)) {
                    long j14 = this.G;
                    long j15 = aVar2.c;
                    this.G = j14 - j15;
                    this.I += j15;
                    hashSet4.add(aVar2);
                    u6Var.b(aVar2);
                    int i12 = aVar2.d;
                    if (i12 == 0) {
                        this.x -= aVar2.c;
                    } else if (i12 == 1) {
                        this.y -= aVar2.c;
                    } else if (i12 == 2) {
                        this.r -= aVar2.c;
                    } else if (i12 == 3) {
                        this.w -= aVar2.c;
                    } else if (i12 == 4) {
                        this.s -= aVar2.c;
                    }
                }
                hashSet3 = hashSet4;
            }
        }
        HashSet hashSet5 = hashSet3;
        Iterator it2 = hashSet5.iterator();
        while (it2.hasNext()) {
            zh.a aVar3 = (zh.a) it2.next();
            zh.b bVar2 = this.e0;
            if (bVar2.j.remove(aVar3)) {
                bVar2.k -= aVar3.c;
            }
            ArrayList e7 = bVar2.e(aVar3.d);
            if (e7 != null) {
                e7.remove(aVar3);
            }
        }
        org.telegram.ui.Components.rc Q = org.telegram.ui.Components.yc.a0(this).Q(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j13 - this.G)));
        Q.r = false;
        Q.j();
        ArrayList arrayList2 = new ArrayList(hashSet5);
        getFileLoader().getFileDatabase().removeFiles(arrayList2);
        getFileLoader().cancelLoadAllFiles();
        getFileLoader().getFileLoaderQueue().postRunnable(new r1(this, arrayList2, b2Var, 3));
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        return !this.h0 ? super.isLightStatusBar() : AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.a7, false)) > 0.721f;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        org.telegram.ui.Components.bw0 bw0Var;
        return this.M == null || motionEvent == null || (bw0Var = this.b0) == null || !bw0Var.c() || this.b0.j(motionEvent.getX(), motionEvent.getY()) || this.M.getViewPager().b == 0;
    }

    public final void j0() {
        if (this.e0.j.size() == 0 || getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearCache);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearCacheForChats);
        alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new c6(this, 3));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q7, false));
        }
    }

    public final void l0(File file, int i10, LongSparseArray longSparseArray, zh.b bVar) {
        File[] listFiles;
        if (file != null && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (m0) {
                    break;
                }
                if (file2.isDirectory()) {
                    l0(file2, i10, longSparseArray, bVar);
                } else if (!file2.getName().equals(".nomedia")) {
                    FilePathDatabase.FileMeta fileDialogId = getFileLoader().getFileDatabase().getFileDialogId(file2, null);
                    String lowerCase = file2.getName().toLowerCase();
                    int i11 = (lowerCase.endsWith(".mp3") || lowerCase.endsWith(".m4a")) ? 3 : i10;
                    zh.a aVar = new zh.a(file2);
                    long length = file2.length();
                    aVar.c = length;
                    if (fileDialogId != null) {
                        aVar.b = fileDialogId.dialogId;
                        aVar.g = fileDialogId.messageId;
                        int i12 = fileDialogId.messageType;
                        aVar.h = i12;
                        if (i12 == 23 && length > 0) {
                            i11 = 7;
                        }
                    }
                    aVar.d = i11;
                    long j3 = aVar.b;
                    if (j3 != 0) {
                        u6 u6Var = (u6) longSparseArray.get(j3, null);
                        if (u6Var == null) {
                            u6Var = new u6(aVar.b);
                            longSparseArray.put(aVar.b, u6Var);
                        }
                        u6Var.a(aVar, i11);
                    }
                    if (i11 != 6) {
                        bVar.e(i11).add(aVar);
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final boolean o0() {
        int i10;
        boolean[] zArr = this.d;
        int length = zArr.length;
        boolean[] zArr2 = new boolean[length];
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.g0;
            if (i11 >= arrayList.size()) {
                break;
            }
            w6 w6Var = (w6) arrayList.get(i11);
            if (w6Var.a == 11 && !w6Var.i && (i10 = w6Var.f) >= 0) {
                zArr2[i10] = true;
            }
            i11++;
        }
        for (int i12 = 0; i12 < length; i12++) {
            if (!zArr2[i12] && !zArr[i12]) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        zh.b bVar = this.e0;
        if (bVar == null || bVar.j.isEmpty()) {
            return super.onBackPressed(z10);
        }
        if (z10) {
            this.e0.d();
            k6 k6Var = this.M;
            if (k6Var != null) {
                k6Var.f(false);
                this.M.e();
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        m0 = false;
        getNotificationCenter().addObserver(this, NotificationCenter.didClearDatabase);
        this.e = MessagesStorage.getInstance(this.currentAccount).getDatabaseSize();
        Utilities.globalQueue.postRunnable(new f6(this, 2));
        this.a0 = System.currentTimeMillis();
        v0(false);
        t0();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.didClearDatabase);
        try {
            org.telegram.ui.ActionBar.b2 b2Var = this.c;
            if (b2Var != null) {
                b2Var.dismiss();
            }
        } catch (Exception unused) {
        }
        this.c = null;
        m0 = true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        q0(i11, i13);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        FilesMigrationService.FilesMigrationBottomSheet filesMigrationBottomSheet;
        if (i10 == 4) {
            for (int i11 : iArr) {
                if (i11 != 0) {
                    return;
                }
            }
            if (Build.VERSION.SDK_INT < 30 || (filesMigrationBottomSheet = FilesMigrationService.filesMigrationBottomSheet) == null) {
                return;
            }
            filesMigrationBottomSheet.migrateOldFolder();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        this.a.l();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        if (f7 > 0.5f && !this.h0) {
            this.h0 = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        super.onTransitionAnimationProgress(z10, f7);
    }

    public final void q0(int i10, int i11) {
        this.P = i10;
        this.Q = i11;
        ai.w0 w0Var = this.b;
        if (w0Var == null) {
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2;
        int C = org.telegram.messenger.bi.C(48.0f, i10, -AndroidUtilities.dp(8.0f));
        int C2 = org.telegram.messenger.bi.C(48.0f, i11, -AndroidUtilities.dp(8.0f));
        AndroidUtilities.setViewLayoutMargins(w0Var, 0, C, 0, C2);
        w0Var.setPadding(0, (currentActionBarHeight + i10) - C, 0, i11 - C2);
        View view = this.O;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = AndroidUtilities.dp(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10;
            this.O.setLayoutParams(layoutParams);
            u0();
        }
        if (this.b0 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b.getLayoutParams();
            this.b0.z(-marginLayoutParams.topMargin, -marginLayoutParams.bottomMargin);
            org.telegram.ui.Components.bw0 bw0Var = this.b0;
            bw0Var.B();
            bw0Var.requestLayout();
            bw0Var.invalidate();
        }
    }

    public final long r0(int i10) {
        switch (i10) {
            case 0:
                return this.x;
            case 1:
                return this.y;
            case 2:
                return this.r;
            case 3:
                return this.w;
            case 4:
                return this.s;
            case 5:
                return this.v;
            case 6:
                return this.F;
            case 7:
                return this.f;
            case 8:
                return this.n;
            case 9:
                return this.E;
            default:
                return 0L;
        }
    }

    public final void s0(View view) {
        int i10;
        int i11;
        int i12;
        boolean o02 = o0();
        boolean[] zArr = this.d;
        ArrayList arrayList = this.g0;
        if (o02) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                w6 w6Var = (w6) arrayList.get(i13);
                if (w6Var.a != 11 || w6Var.i || (i12 = w6Var.f) < 0 || !zArr[i12]) {
                }
            }
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            if (view != null) {
                AndroidUtilities.shakeViewSpring(view, -3.0f);
                return;
            }
            return;
        }
        if (this.L) {
            int length = zArr.length;
            boolean[] zArr2 = new boolean[length];
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                w6 w6Var2 = (w6) arrayList.get(i14);
                if (w6Var2.a == 11 && !w6Var2.i && (i11 = w6Var2.f) >= 0) {
                    zArr2[i11] = true;
                }
            }
            for (int i15 = 0; i15 < length; i15++) {
                if (!zArr2[i15]) {
                    zArr[i15] = !o02;
                }
            }
        } else {
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                w6 w6Var3 = (w6) arrayList.get(i16);
                if (w6Var3.a == 11 && w6Var3.i && (i10 = w6Var3.f) >= 0) {
                    zArr[i10] = !o02;
                }
            }
        }
        for (int i17 = 0; i17 < this.b.getChildCount(); i17++) {
            View childAt = this.b.getChildAt(i17);
            if (childAt instanceof org.telegram.ui.Cells.a2) {
                this.b.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    w6 w6Var4 = (w6) arrayList.get(R);
                    if (w6Var4.a == 11) {
                        int i18 = w6Var4.f;
                        if (i18 < 0) {
                            ((org.telegram.ui.Cells.a2) childAt).c(!o02, true);
                        } else {
                            ((org.telegram.ui.Cells.a2) childAt).c(zArr[i18], true);
                        }
                    }
                }
            }
        }
        t0();
    }

    public final void t0() {
        x6 x6Var = this.W;
        boolean z10 = false;
        if (x6Var != null) {
            boolean z11 = this.K;
            if (!z11 && this.G > 0) {
                org.telegram.ui.Components.dd[] ddVarArr = new org.telegram.ui.Components.dd[11];
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.g0;
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    w6 w6Var = (w6) arrayList.get(i10);
                    if (w6Var.a == 11) {
                        int i11 = w6Var.f;
                        boolean[] zArr = this.d;
                        if (i11 >= 0) {
                            long j3 = w6Var.g;
                            boolean z12 = zArr[i11];
                            org.telegram.ui.Components.dd ddVar = new org.telegram.ui.Components.dd();
                            ddVar.c = j3;
                            ddVar.b = z12;
                            ddVarArr[i11] = ddVar;
                        } else if (this.L) {
                            long j10 = w6Var.g;
                            boolean z13 = zArr[10];
                            org.telegram.ui.Components.dd ddVar2 = new org.telegram.ui.Components.dd();
                            ddVar2.c = j10;
                            ddVar2.b = z13;
                            ddVarArr[10] = ddVar2;
                        }
                    }
                    i10++;
                }
                if (System.currentTimeMillis() - this.a0 < 80) {
                    this.W.n.d(0.0f, true);
                }
                this.W.f(this.G, true, ddVarArr);
            } else if (z11) {
                x6Var.f(-1L, true, new org.telegram.ui.Components.dd[0]);
            } else {
                x6Var.f(0L, true, new org.telegram.ui.Components.dd[0]);
            }
        }
        r6 r6Var = this.Y;
        if (r6Var == null || this.K) {
            return;
        }
        a7 a7Var = r6Var.d;
        boolean[] zArr2 = a7Var.d;
        long j11 = (zArr2[0] ? a7Var.x : 0L) + (zArr2[1] ? a7Var.y : 0L) + (zArr2[2] ? a7Var.r : 0L) + (zArr2[3] ? a7Var.w : 0L) + (zArr2[4] ? a7Var.s : 0L) + (zArr2[5] ? a7Var.v : 0L) + (zArr2[6] ? a7Var.F : 0L) + (zArr2[7] ? a7Var.f : 0L) + (zArr2[8] ? a7Var.n : 0L) + (zArr2[9] ? a7Var.E : 0L);
        ArrayList arrayList2 = a7Var.g0;
        int i12 = 0;
        while (true) {
            if (i12 >= arrayList2.size()) {
                z10 = true;
                break;
            }
            w6 w6Var2 = (w6) arrayList2.get(i12);
            if (w6Var2.a == 11) {
                int i13 = w6Var2.f;
                if (i13 < 0) {
                    i13 = zArr2.length - 1;
                }
                if (!zArr2[i13]) {
                    break;
                }
            }
            i12++;
        }
        r6Var.a(j11, z10);
    }

    public final void u0() {
        View view = this.O;
        if (view == null) {
            return;
        }
        le.b bVar = this.S;
        float f7 = bVar == null ? 0.0f : bVar.e;
        le.b bVar2 = this.T;
        view.setTranslationY(((-(1.0f - f7)) * org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - ((1.0f - (bVar2 != null ? bVar2.e : 0.0f)) * AndroidUtilities.dp(44.0f)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v0(boolean z10) {
        long j3;
        boolean z11;
        float[] fArr;
        y6 y6Var;
        k6 k6Var;
        org.telegram.ui.Components.bw0 bw0Var;
        zh.b bVar;
        org.telegram.ui.Components.bw0 bw0Var2 = this.b0;
        boolean z12 = bw0Var2 != null && bw0Var2.e0;
        boolean z13 = (!z10 || System.currentTimeMillis() - this.a0 >= 80) ? z10 : false;
        ArrayList arrayList = this.f0;
        arrayList.clear();
        ArrayList arrayList2 = this.g0;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.add(new w6(9, (String) null));
        arrayList2.add(new w6(10, (String) null));
        arrayList2.size();
        if (this.K) {
            arrayList2.add(new w6(12, (String) null));
            arrayList2.add(new w6(12, (String) null));
            arrayList2.add(new w6(12, (String) null));
            arrayList2.add(new w6(12, (String) null));
            arrayList2.add(new w6(12, (String) null));
            j3 = 0;
        } else {
            ArrayList arrayList3 = new ArrayList();
            if (this.x > 0) {
                arrayList3.add(w6.b(0, this.x, LocaleController.getString(R.string.LocalPhotoCache), org.telegram.ui.ActionBar.i6.lj));
            }
            if (this.y > 0) {
                arrayList3.add(w6.b(1, this.y, LocaleController.getString(R.string.LocalVideoCache), org.telegram.ui.ActionBar.i6.hj));
            }
            if (this.r > 0) {
                arrayList3.add(w6.b(2, this.r, LocaleController.getString(R.string.LocalDocumentCache), org.telegram.ui.ActionBar.i6.ij));
            }
            if (this.w > 0) {
                j3 = 0;
                arrayList3.add(w6.b(3, this.w, LocaleController.getString(R.string.LocalMusicCache), org.telegram.ui.ActionBar.i6.pj));
            } else {
                j3 = 0;
            }
            if (this.s > j3) {
                arrayList3.add(w6.b(4, this.s, LocaleController.getString(R.string.LocalAudioCache), org.telegram.ui.ActionBar.i6.mj));
            }
            if (this.v > j3) {
                arrayList3.add(w6.b(5, this.v, LocaleController.getString(R.string.LocalStoriesCache), org.telegram.ui.ActionBar.i6.jj));
            }
            if (this.F > j3) {
                arrayList3.add(w6.b(6, this.F, LocaleController.getString(R.string.LocalStickersCache), org.telegram.ui.ActionBar.i6.nj));
            }
            if (this.f > j3) {
                arrayList3.add(w6.b(7, this.f, LocaleController.getString(R.string.LocalProfilePhotosCache), org.telegram.ui.ActionBar.i6.qj));
            }
            if (this.n > j3) {
                arrayList3.add(w6.b(8, this.n, LocaleController.getString(R.string.LocalMiscellaneousCache), org.telegram.ui.ActionBar.i6.pj));
            }
            if (this.E > j3) {
                arrayList3.add(w6.b(9, this.E, LocaleController.getString(R.string.LocalLogsCache), org.telegram.ui.ActionBar.i6.kj));
            }
            if (arrayList3.isEmpty()) {
                z11 = false;
                if (z11) {
                    arrayList2.size();
                    arrayList2.add(new w6(13, (String) null));
                    String string = LocaleController.getString(R.string.StorageUsageInfo);
                    w6 w6Var = new w6(1);
                    w6Var.e = string;
                    arrayList2.add(w6Var);
                }
                arrayList2.add(new w6(3, LocaleController.getString(R.string.AutoDeleteCachedMedia)));
                arrayList2.add(new w6(0, 0));
                arrayList2.add(new w6(1, 0));
                arrayList2.add(new w6(2, 0));
                arrayList2.add(new w6(3, 0));
                String string2 = LocaleController.getString(R.string.KeepMediaInfoPart);
                w6 w6Var2 = new w6(1);
                w6Var2.e = string2;
                arrayList2.add(w6Var2);
                if (this.H > j3) {
                    arrayList2.add(new w6(3, LocaleController.getString(R.string.MaxCacheSize)));
                    arrayList2.add(new w6(14));
                    String string3 = LocaleController.getString(R.string.MaxCacheSizeInfo);
                    w6 w6Var3 = new w6(1);
                    w6Var3.e = string3;
                    arrayList2.add(w6Var3);
                }
                this.R = -1;
                if (z11 && (bVar = this.e0) != null && !bVar.h()) {
                    this.R = arrayList2.size();
                    arrayList2.add(new w6(8, (String) null));
                }
                y6Var = this.a;
                if (y6Var != null) {
                    if (z13) {
                        y6Var.E(arrayList, arrayList2);
                    } else {
                        y6Var.l();
                    }
                }
                k6Var = this.M;
                if (k6Var != null) {
                    k6Var.d();
                }
                bw0Var = this.b0;
                if (bw0Var == null) {
                    if (z12 && this.R != -1) {
                        bw0Var.a();
                    }
                    org.telegram.ui.Components.bw0 bw0Var3 = this.b0;
                    bw0Var3.B();
                    bw0Var3.requestLayout();
                    bw0Var3.invalidate();
                    return;
                }
                return;
            }
            Collections.sort(arrayList3, new a4.e(28));
            ((w6) arrayList3.get(arrayList3.size() - 1)).j = true;
            if (this.V == null) {
                this.V = new float[11];
            }
            int i10 = 0;
            while (true) {
                fArr = this.V;
                if (i10 >= fArr.length) {
                    break;
                }
                fArr[i10] = r0(i10);
                i10++;
            }
            if (this.U == null) {
                this.U = new int[11];
            }
            AndroidUtilities.roundPercents(fArr, this.U);
            if (arrayList3.size() > 5) {
                arrayList2.addAll(arrayList3.subList(0, 4));
                long j10 = j3;
                int i11 = 0;
                for (int i12 = 4; i12 < arrayList3.size(); i12++) {
                    ((w6) arrayList3.get(i12)).i = true;
                    j10 += ((w6) arrayList3.get(i12)).g;
                    i11 += this.U[((w6) arrayList3.get(i12)).f];
                }
                this.U[10] = i11;
                arrayList2.add(w6.b(-1, j10, LocaleController.getString(R.string.LocalOther), org.telegram.ui.ActionBar.i6.kj));
                if (!this.L) {
                    arrayList2.addAll(arrayList3.subList(4, arrayList3.size()));
                }
            } else {
                arrayList2.addAll(arrayList3);
            }
        }
        z11 = true;
        if (z11) {
        }
        arrayList2.add(new w6(3, LocaleController.getString(R.string.AutoDeleteCachedMedia)));
        arrayList2.add(new w6(0, 0));
        arrayList2.add(new w6(1, 0));
        arrayList2.add(new w6(2, 0));
        arrayList2.add(new w6(3, 0));
        String string22 = LocaleController.getString(R.string.KeepMediaInfoPart);
        w6 w6Var22 = new w6(1);
        w6Var22.e = string22;
        arrayList2.add(w6Var22);
        if (this.H > j3) {
        }
        this.R = -1;
        if (z11) {
            this.R = arrayList2.size();
            arrayList2.add(new w6(8, (String) null));
        }
        y6Var = this.a;
        if (y6Var != null) {
        }
        k6Var = this.M;
        if (k6Var != null) {
        }
        bw0Var = this.b0;
        if (bw0Var == null) {
        }
    }
}
