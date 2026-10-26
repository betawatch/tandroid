package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class c7 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public static volatile boolean i0 = false;
    public static long j0;
    public static Long k0;
    public static Long l0;
    public static Long m0;
    public long E;
    public long F;
    public long G;
    public long H;
    public long I;
    public final long J;
    public boolean K;
    public boolean L;
    public m6 M;
    public FrameLayout N;
    public View O;
    public int P;
    public int Q;
    public int R;
    public oe.b S;
    public oe.b T;
    public int[] U;
    public float[] V;
    public z6 W;
    public o6 X;
    public t6 Y;
    public vu Z;
    public a7 a;
    public long a0;
    public bi.r1 b;
    public org.telegram.ui.Components.lw0 b0;
    public org.telegram.ui.ActionBar.e2 c;
    public org.telegram.ui.ActionBar.g1 c0;
    public final boolean[] d;
    public org.telegram.ui.ActionBar.g1 d0;
    public long e;
    public ci.b e0;
    public long f;
    public final ArrayList f0;
    public final ArrayList g0;
    public long h;
    public boolean h0;
    public long n;
    public long r;
    public long s;
    public long v;
    public long w;
    public long x;
    public long y;

    public c7() {
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

    public static void V(c7 c7Var, boolean z10, long j10, r6 r6Var) {
        if (z10) {
            ImageLoader.getInstance().clearMemory();
        }
        try {
            org.telegram.ui.ActionBar.e2 e2Var = c7Var.c;
            if (e2Var != null) {
                e2Var.dismiss();
                c7Var.c = null;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        c7Var.getMediaDataController().ringtoneDataStore.b();
        AndroidUtilities.runOnUIThread(new bi.r3(c7Var, j10, 22), 150L);
        MediaDataController.getInstance(c7Var.currentAccount).checkAllMedia(true);
        c7Var.getFileLoader().getFileDatabase().getQueue().postRunnable(new g6(c7Var, 1));
        r6Var.run();
    }

    public static /* synthetic */ void W(c7 c7Var, float f7) {
        c7Var.simpleActionBar.setTitlesAlpha(f7);
        c7Var.v0();
        c7Var.fragmentView.invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void X(c7 c7Var, q6 q6Var, r6 r6Var) {
        int i10;
        int i11;
        bi.da daVar;
        int i12;
        char c10;
        char c11;
        int i13;
        File checkDirectory;
        char c12;
        int i14 = 1;
        int[] iArr = {0};
        boolean[] zArr = c7Var.d;
        int i15 = 2;
        int i16 = 3;
        char c13 = 4;
        char c14 = 5;
        int i17 = (zArr[0] ? 2 : 0) + (zArr[1] ? 2 : 0) + (zArr[2] ? 2 : 0) + (zArr[3] ? 2 : 0) + (zArr[4] ? 1 : 0) + (zArr[5] ? 2 : 0) + (zArr[6] ? 1 : 0) + (zArr[7] ? 1 : 0) + (zArr[8] ? 1 : 0) + (zArr[9] ? 1 : 0);
        long currentTimeMillis = System.currentTimeMillis();
        hi.p4 p4Var = new hi.p4(q6Var, iArr, i17, 3);
        bi.da daVar2 = new bi.da(q6Var, iArr, i17, currentTimeMillis, 15);
        long j10 = 0;
        boolean z10 = true;
        int i18 = 0;
        int i19 = 0;
        while (i18 < 10) {
            if (zArr[i18]) {
                if (i18 == 0) {
                    j10 += c7Var.x;
                    i11 = i14;
                    daVar = daVar2;
                    i12 = 9;
                    i15 = 0;
                    i16 = 0;
                } else {
                    if (i18 == i14) {
                        j10 += c7Var.y;
                        i11 = i14;
                        daVar = daVar2;
                        i16 = i15;
                    } else {
                        if (i18 == i15) {
                            j10 += c7Var.r;
                            i15 = i14;
                            i11 = i15;
                        } else if (i18 == i16) {
                            j10 += c7Var.w;
                            i11 = i14;
                        } else if (i18 == 4) {
                            j10 += c7Var.s;
                            i16 = i14;
                            i11 = i16;
                            daVar = daVar2;
                        } else if (i18 == 5) {
                            j10 += c7Var.v;
                            i11 = i14;
                            daVar = daVar2;
                            i12 = 9;
                            i15 = 0;
                            i16 = 6;
                        } else if (i18 == 6) {
                            j10 += c7Var.F;
                            i11 = i14;
                            daVar = daVar2;
                            i12 = 9;
                            i15 = 0;
                            i16 = 100;
                        } else {
                            i10 = 7;
                            if (i18 == 7) {
                                i11 = i14;
                                daVar = daVar2;
                                j10 += c7Var.f;
                                i12 = 9;
                                i15 = 5;
                            } else {
                                i11 = i14;
                                daVar = daVar2;
                                if (i18 == 8) {
                                    j10 += c7Var.n;
                                    i12 = 9;
                                    i15 = 4;
                                } else {
                                    i12 = 9;
                                    if (i18 == 9) {
                                        j10 += c7Var.E;
                                        i15 = i11;
                                        i16 = 0;
                                    } else {
                                        i16 = -1;
                                        i15 = 0;
                                    }
                                    if (i16 != -1) {
                                        if (i18 == i10) {
                                            try {
                                                j0(ApplicationLoader.getFilesDirFixed("rasterized/wallpaper").getAbsolutePath(), 0, null, null);
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                            }
                                        }
                                        if (i18 == i12) {
                                            checkDirectory = AndroidUtilities.getLogsDir();
                                            i13 = i11;
                                        } else if (i16 == 100) {
                                            i13 = i11;
                                            checkDirectory = new File(FileLoader.checkDirectory(4), "acache");
                                        } else {
                                            i13 = i11;
                                            checkDirectory = FileLoader.checkDirectory(i16);
                                        }
                                        if (checkDirectory != null) {
                                            j0(checkDirectory.getAbsolutePath(), i15, null, p4Var);
                                        }
                                        iArr[0] = iArr[0] + 1;
                                        daVar.run();
                                        if (i16 == 100) {
                                            File checkDirectory2 = FileLoader.checkDirectory(4);
                                            if (checkDirectory2 != null) {
                                                j0(checkDirectory2.getAbsolutePath(), 3, null, p4Var);
                                            }
                                            iArr[0] = iArr[0] + 1;
                                            daVar.run();
                                        }
                                        if (i16 == 0 || i16 == 2) {
                                            File checkDirectory3 = FileLoader.checkDirectory(i16 == 0 ? 100 : 101);
                                            if (checkDirectory3 != null) {
                                                j0(checkDirectory3.getAbsolutePath(), i15, null, p4Var);
                                            }
                                            c12 = 0;
                                            iArr[0] = iArr[0] + 1;
                                            daVar.run();
                                        } else {
                                            c12 = 0;
                                        }
                                        if (i16 == 3) {
                                            File checkDirectory4 = FileLoader.checkDirectory(5);
                                            if (checkDirectory4 != null) {
                                                j0(checkDirectory4.getAbsolutePath(), i15, null, p4Var);
                                            }
                                            iArr[c12] = iArr[c12] + 1;
                                            daVar.run();
                                        }
                                        if (i18 == i12) {
                                            c7Var.E = o0(i13, AndroidUtilities.getLogsDir());
                                        } else {
                                            int i20 = i13;
                                            if (i16 == 4) {
                                                c7Var.f = o0(5, FileLoader.checkDirectory(4));
                                                c7Var.n = o0(4, FileLoader.checkDirectory(4));
                                                i19 = i20;
                                            } else if (i16 == i20) {
                                                c7Var.s = o0(i15, FileLoader.checkDirectory(i20));
                                            } else if (i16 == 6) {
                                                c7Var.v = o0(i15, FileLoader.checkDirectory(6));
                                            } else {
                                                if (i16 != 3) {
                                                    c10 = 5;
                                                    if (i16 == 0) {
                                                        long o02 = o0(i15, FileLoader.checkDirectory(0));
                                                        c7Var.x = o02;
                                                        c7Var.x = o0(i15, FileLoader.checkDirectory(100)) + o02;
                                                        i19 = 1;
                                                    } else if (i16 == 2) {
                                                        long o03 = o0(i15, FileLoader.checkDirectory(2));
                                                        c7Var.y = o03;
                                                        c7Var.y = o0(i15, FileLoader.checkDirectory(101)) + o03;
                                                    } else if (i16 == 100) {
                                                        c11 = 4;
                                                        c7Var.F = o0(i15, new File(FileLoader.checkDirectory(4), "acache"));
                                                        long o04 = o0(3, FileLoader.checkDirectory(4));
                                                        c7Var.h = o04;
                                                        c7Var.F += o04;
                                                        i19 = 1;
                                                    }
                                                } else if (i15 == i20) {
                                                    long o05 = o0(i15, FileLoader.checkDirectory(3));
                                                    c7Var.r = o05;
                                                    c10 = 5;
                                                    c7Var.r = o0(i15, FileLoader.checkDirectory(5)) + o05;
                                                } else {
                                                    c10 = 5;
                                                    long o06 = o0(i15, FileLoader.checkDirectory(3));
                                                    c7Var.w = o06;
                                                    c7Var.w = o0(i15, FileLoader.checkDirectory(5)) + o06;
                                                }
                                                c11 = 4;
                                            }
                                        }
                                    }
                                    c10 = 5;
                                    c11 = 4;
                                }
                            }
                            i16 = 4;
                            if (i16 != -1) {
                            }
                            c10 = 5;
                            c11 = 4;
                        }
                        daVar = daVar2;
                        i12 = 9;
                    }
                    i12 = 9;
                    i15 = 0;
                }
                i10 = 7;
                if (i16 != -1) {
                }
                c10 = 5;
                c11 = 4;
            } else {
                daVar = daVar2;
                c11 = c13;
                c10 = c14;
                z10 = false;
            }
            i18++;
            c14 = c10;
            c13 = c11;
            daVar2 = daVar;
            i14 = 1;
            i15 = 2;
            i16 = 3;
        }
        long j11 = c7Var.f + c7Var.n + c7Var.E + c7Var.y + c7Var.s + c7Var.x + c7Var.r + c7Var.w + c7Var.F + c7Var.v;
        k0 = Long.valueOf(j11);
        c7Var.G = j11;
        j0 = System.currentTimeMillis();
        Arrays.fill(zArr, true);
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong();
        c7Var.H = statFs.getBlockCountLong() * blockSizeLong;
        c7Var.I = availableBlocksLong * blockSizeLong;
        if (z10) {
            FileLoader.getInstance(c7Var.currentAccount).clearFilePaths();
        }
        FileLoader.getInstance(c7Var.currentAccount).checkCurrentDownloadsFiles();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.u8((Object) c7Var, (boolean) i19, j10, (Object) r6Var, 8));
    }

    public static /* synthetic */ void Y(c7 c7Var, org.telegram.ui.ActionBar.e2 e2Var) {
        FileLoader.getInstance(c7Var.currentAccount).checkCurrentDownloadsFiles();
        try {
            e2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void Z(c7 c7Var, boolean z10) {
        if (c7Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(c7Var.getParentActivity(), 3, null);
        c7Var.c = e2Var;
        e2Var.i0 = false;
        e2Var.r(500L);
        MessagesController.getInstance(c7Var.currentAccount).clearQueryTime();
        if (z10) {
            c7Var.getMessagesStorage().fullReset();
        } else {
            c7Var.getMessagesStorage().clearLocalDatabase();
        }
    }

    public static void e0(c7 c7Var) {
        String formatPluralString;
        boolean z10 = false;
        if (c7Var.e0.j.size() <= 0) {
            c7Var.M.f(false);
            return;
        }
        if (c7Var.M != null) {
            if (c7Var.e0.l.isEmpty()) {
                formatPluralString = LocaleController.formatPluralString("Files", c7Var.e0.j.size(), Integer.valueOf(c7Var.e0.j.size()));
            } else {
                ArrayList arrayList = c7Var.e0.b;
                int size = arrayList.size();
                int i10 = 0;
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    w6 w6Var = (w6) obj;
                    if (c7Var.e0.l.contains(Long.valueOf(w6Var.a))) {
                        i10 += w6Var.b;
                    }
                }
                int size2 = c7Var.e0.j.size() - i10;
                formatPluralString = size2 > 0 ? a1.g.D(LocaleController.formatPluralString("Chats", c7Var.e0.l.size(), Integer.valueOf(c7Var.e0.l.size())), ", ", LocaleController.formatPluralString("Files", size2, Integer.valueOf(size2))) : LocaleController.formatPluralString("Chats", c7Var.e0.l.size(), Integer.valueOf(c7Var.e0.l.size()));
            }
            String formatFileSize = AndroidUtilities.formatFileSize(c7Var.e0.k);
            org.telegram.ui.ActionBar.r5 r5Var = c7Var.simpleActionBar;
            boolean z11 = LocaleController.isRTL;
            r5Var.h();
            r5Var.f.c(formatFileSize, !z11 && r5Var.p() && r5Var.G, true);
            org.telegram.ui.ActionBar.r5 r5Var2 = c7Var.simpleActionBar;
            boolean z12 = LocaleController.isRTL;
            r5Var2.h();
            if (r5Var2.h == null) {
                if (!TextUtils.isEmpty(formatPluralString)) {
                    org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(r5Var2.getContext(), true, true, true);
                    r5Var2.h = s6Var;
                    s6Var.setTextSize(AndroidUtilities.dp(14.0f));
                    r5Var2.h.setTextColor(r5Var2.c0);
                    r5Var2.h.setGravity(19);
                    r5Var2.h.setEllipsizeByGradient(true);
                    r5Var2.h.b(0.35f, 320L, org.telegram.ui.Components.ds.h);
                    r5Var2.addView(r5Var2.h, r5Var2.indexOfChild(r5Var2.b), org.telegram.ui.Components.gb1.i(-1, 18, 51));
                    r5Var2.c();
                }
                c7Var.M.f(true);
            }
            org.telegram.ui.Components.s6 s6Var2 = r5Var2.h;
            boolean z13 = (s6Var2 == null || s6Var2.getTag() == null) ? false : true;
            r5Var2.h.c(formatPluralString, !z12 && r5Var2.p() && r5Var2.G, true);
            r5Var2.h.setTag(TextUtils.isEmpty(formatPluralString) ? null : 1);
            org.telegram.ui.Components.s6 s6Var3 = r5Var2.h;
            if (s6Var3 != null && s6Var3.getTag() != null) {
                z10 = true;
            }
            if (z13 != z10) {
                r5Var2.requestLayout();
            }
            c7Var.M.f(true);
        }
    }

    public static String f0(c7 c7Var, float f7) {
        if (f7 < 0.001f) {
            return String.format("<%.1f%%", Float.valueOf(0.1f));
        }
        float round = Math.round(f7 * 100.0f);
        return round <= 0.0f ? String.format("<%d%%", 1) : String.format("%d%%", Integer.valueOf((int) round));
    }

    public static void g0(c7 c7Var) {
        if (c7Var.e0.j.size() == 0 || c7Var.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c7Var.getParentActivity());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearCache);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearCacheForChats);
        alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new d6(c7Var, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
        c7Var.showDialog(e2Var);
        TextView textView = (TextView) e2Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, null);
        }
    }

    public static void h0(c7 c7Var, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c7Var.getParentActivity());
        String string = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
        e2Var.R = string;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.LocalDatabaseClearText));
        spannableStringBuilder.append((CharSequence) "\n\n");
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("LocalDatabaseClearText2", R.string.LocalDatabaseClearText2, AndroidUtilities.formatFileSize(c7Var.e))));
        e2Var.T = spannableStringBuilder;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.CacheClear), new di.f(5, c7Var, z10));
        c7Var.showDialog(e2Var);
        TextView textView = (TextView) e2Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, null);
        }
    }

    public static void i0(Utilities.Callback callback) {
        Long l4 = k0;
        if (l4 != null) {
            callback.run(l4);
            if (System.currentTimeMillis() - j0 < 5000) {
                return;
            }
        }
        Utilities.cacheClearQueue.postRunnable(new zt0(callback, 15));
    }

    public static void j0(String str, int i10, int[] iArr, Utilities.Callback callback) {
        File[] listFiles;
        int l02 = l0(i10, str);
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
                        callback.run(Float.valueOf(i11 / l02));
                    }
                } else if (!"drafts".equals(file2.getName())) {
                    j0(a1.g.D(str, "/", name), i10, iArr, callback);
                }
            }
        }
    }

    public static int l0(int i10, String str) {
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
                i11 = file2.isDirectory() ? i11 + l0(i10, str + "/" + name) : i11 + 1;
            }
        }
        return i11;
    }

    public static void n0(e5 e5Var) {
        Long l4;
        Long l10 = l0;
        if (l10 == null || (l4 = m0) == null) {
            Utilities.cacheClearQueue.postRunnable(new zt0(e5Var, 14));
        } else {
            e5Var.run(l10, l4);
        }
    }

    public static long o0(int i10, File file) {
        if (file != null && !i0) {
            if (file.isDirectory()) {
                return Utilities.getDirSize(file.getAbsolutePath(), i10, false);
            }
            if (file.isFile()) {
                return file.length();
            }
        }
        return 0L;
    }

    public static boolean q0(int i10, String str) {
        if (str == null || FileLoader.checkDirectory(i10) == null) {
            return false;
        }
        return str.contains(FileLoader.checkDirectory(i10).getAbsolutePath());
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.N6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.M6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Vi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.s8));
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        this.simpleActionBar.setBackground(null);
        this.simpleActionBar.setTitlesAlpha(0.0f);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.j2(false));
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.StorageUsage));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bh.m(this, 25));
        this.simpleActionBar.h().b(1, 0, LocaleController.getString(R.string.CacheClear), null, 0, null).getTextView().setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Oh, false));
        org.telegram.ui.ActionBar.y5 a2 = this.simpleActionBar.j().a(2, R.drawable.ic_ab_other);
        org.telegram.ui.ActionBar.g1 e = a2.e(3, R.drawable.msg_delete, LocaleController.getString(R.string.ClearLocalDatabase));
        this.c0 = e;
        int i10 = org.telegram.ui.ActionBar.y6.p7;
        e.setIconColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        org.telegram.ui.ActionBar.g1 g1Var = this.c0;
        int i11 = org.telegram.ui.ActionBar.y6.q7;
        g1Var.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
        this.c0.h(0.12f, i10);
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            org.telegram.ui.ActionBar.g1 e10 = a2.e(4, R.drawable.msg_delete, "Full Reset Database");
            this.d0 = e10;
            e10.setIconColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
            this.d0.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
            this.d0.h(0.12f, i10);
        }
        if (this.c0 != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ClearLocalDatabase));
            this.c0.setText(spannableStringBuilder);
        }
        this.a = new a7(this, context);
        org.telegram.ui.Components.lw0 lw0Var = new org.telegram.ui.Components.lw0(context);
        this.b0 = lw0Var;
        lw0Var.setDebugLoggingEnabled(true);
        this.b0.setCommonInsetsManagedExternally(true);
        this.b0.setGeometry(new k6(this));
        org.telegram.ui.Components.lw0 lw0Var2 = this.b0;
        this.fragmentView = lw0Var2;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.a7, lw0Var2, null);
        bi.r1 r1Var = new bi.r1(this, context, 6);
        this.b = r1Var;
        r1Var.u1();
        this.b.setClipToPadding(false);
        this.b.setVerticalScrollBarEnabled(false);
        bi.r1 r1Var2 = this.b;
        org.telegram.ui.Components.lw0 lw0Var3 = this.b0;
        lw0Var3.getClass();
        r1Var2.setLayoutManager(new ig.j0(5, lw0Var3, false));
        this.b0.u(this.b, new d6(this, 3));
        this.b.setAdapter(this.a);
        l6 l6Var = new l6(this);
        l6Var.n(350L);
        org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
        l6Var.o(dsVar);
        l6Var.C = false;
        l6Var.m = false;
        this.b.setItemAnimator(l6Var);
        this.b.setOnItemClickListener(new d6(this, 4));
        this.b.j(new i3(this, 3));
        View view = new View(context);
        this.O = view;
        lw0Var2.addView(view, org.telegram.ui.Components.gb1.i(-1, 0, 48));
        this.S = new oe.b(0, new d6(this, 5), dsVar, 380L, false);
        this.T = new oe.b(1, new d6(this, 0), dsVar, 380L, false);
        v0();
        getBaseSimpleGlass().e(lw0Var2, this.b, this.simpleActionBar, this.resourceProvider);
        m6 m6Var = new m6(this, context, this, this.glassEngine, this.b0);
        this.M = m6Var;
        m6Var.y = true;
        FrameLayout frameLayout = m6Var.c;
        AndroidUtilities.removeFromParent(frameLayout);
        frameLayout.setTranslationY(0.0f);
        this.N = frameLayout;
        eh.d c10 = getBaseSimpleGlass().c.c(this.N, null, false);
        c10.v(gh.c.m(this.resourceProvider));
        c10.w(AndroidUtilities.dp(9.66f));
        c10.x(AndroidUtilities.dp(18.0f));
        frameLayout.setBackground(c10);
        org.telegram.ui.Components.lw0 lw0Var4 = this.b0;
        m6 m6Var2 = this.M;
        org.telegram.ui.Components.u91 viewPager = m6Var2.getViewPager();
        m6 m6Var3 = this.M;
        Objects.requireNonNull(m6Var3);
        lw0Var4.x(m6Var2, viewPager, new y0(m6Var3, 8));
        this.b0.y(this.N);
        this.N.setLayoutParams(org.telegram.ui.Components.gb1.h(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        this.simpleActionBar.bringToFront();
        this.N.bringToFront();
        this.M.setDelegate(new k6(this));
        this.M.setCacheModel(this.e0);
        getBaseSimpleGlass().i = new bi.g(5, this, new e6(0, lw0Var2));
        this.O.setBackground(getBaseSimpleGlass().a(this.O));
        this.simpleActionBar.setBackground(null);
        r0(this.P, this.Q);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didClearDatabase) {
            try {
                org.telegram.ui.ActionBar.e2 e2Var = this.c;
                if (e2Var != null) {
                    e2Var.dismiss();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            this.c = null;
            if (this.a != null) {
                this.e = MessagesStorage.getInstance(this.currentAccount).getDatabaseSize();
                if (this.c0 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ClearLocalDatabase));
                    this.c0.setText(spannableStringBuilder);
                }
                w0(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        j6 j6Var = new j6(0, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.b, 16, new Class[]{org.telegram.ui.Cells.ga.class, org.telegram.ui.Components.zw0.class, org.telegram.ui.Components.lz0.class, org.telegram.ui.Cells.q4.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.b, 0, new Class[]{org.telegram.ui.Components.lz0.class}, new String[]{"paintFill"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Ti));
        int i10 = org.telegram.ui.ActionBar.y6.y6;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.b, 0, new Class[]{org.telegram.ui.Components.lz0.class}, new String[]{"calculationgTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.hj));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.ij));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.jj));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.kj));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.lj));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.mj));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.nj));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.oj));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isLightStatusBar() {
        return !this.h0 ? super.isLightStatusBar() : AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.a7, false)) > 0.721f;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        org.telegram.ui.Components.lw0 lw0Var;
        return this.M == null || motionEvent == null || (lw0Var = this.b0) == null || !lw0Var.c() || this.b0.j(motionEvent.getX(), motionEvent.getY()) || this.M.getViewPager().b == 0;
    }

    public final void k0(w6 w6Var, org.telegram.ui.Components.iz0[] iz0VarArr, ci.b bVar) {
        x6 x6Var;
        HashSet hashSet;
        long j10;
        org.telegram.ui.Components.iz0 iz0Var;
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(getParentActivity(), 3, null);
        e2Var.i0 = false;
        e2Var.r(500L);
        HashSet hashSet2 = new HashSet();
        long j11 = this.G;
        int i10 = 0;
        while (i10 < 8) {
            if ((iz0VarArr == null || ((iz0Var = iz0VarArr[i10]) != null && iz0Var.c)) && (x6Var = (x6) w6Var.d.get(i10)) != null) {
                ArrayList arrayList = x6Var.b;
                hashSet2.addAll(arrayList);
                hashSet = hashSet2;
                long j12 = w6Var.c;
                j10 = j11;
                long j13 = x6Var.a;
                w6Var.c = j12 - j13;
                this.G -= j13;
                this.I += j13;
                w6Var.d.delete(i10);
                if (i10 == 0) {
                    this.x -= x6Var.a;
                } else if (i10 == 1) {
                    this.y -= x6Var.a;
                } else if (i10 == 2) {
                    this.r -= x6Var.a;
                } else if (i10 == 3) {
                    this.w -= x6Var.a;
                } else if (i10 == 4) {
                    this.s -= x6Var.a;
                } else if (i10 == 5) {
                    this.F -= x6Var.a;
                } else if (i10 == 7) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        ci.a aVar = (ci.a) arrayList.get(i11);
                        String absolutePath = ((ci.a) arrayList.get(i11)).a.getAbsolutePath();
                        char c10 = 6;
                        if (q0(6, absolutePath)) {
                            c10 = 7;
                        } else if (q0(0, absolutePath) || q0(100, absolutePath)) {
                            c10 = 0;
                        } else if (q0(2, absolutePath) || q0(101, absolutePath)) {
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
                    this.f -= x6Var.a;
                }
            } else {
                hashSet = hashSet2;
                j10 = j11;
            }
            i10++;
            hashSet2 = hashSet;
            j11 = j10;
        }
        HashSet hashSet3 = hashSet2;
        long j14 = j11;
        if (w6Var.d.size() == 0) {
            this.e0.b.remove(w6Var);
        }
        w0(true);
        if (bVar != null) {
            Iterator it = bVar.j.iterator();
            while (it.hasNext()) {
                ci.a aVar2 = (ci.a) it.next();
                HashSet hashSet4 = hashSet3;
                if (!hashSet4.contains(aVar2)) {
                    long j15 = this.G;
                    long j16 = aVar2.c;
                    this.G = j15 - j16;
                    this.I += j16;
                    hashSet4.add(aVar2);
                    w6Var.b(aVar2);
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
            ci.a aVar3 = (ci.a) it2.next();
            ci.b bVar2 = this.e0;
            if (bVar2.j.remove(aVar3)) {
                bVar2.k -= aVar3.c;
            }
            ArrayList e = bVar2.e(aVar3.d);
            if (e != null) {
                e.remove(aVar3);
            }
        }
        org.telegram.ui.Components.qc R = org.telegram.ui.Components.wc.b0(this).R(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j14 - this.G)));
        R.s = false;
        R.j();
        ArrayList arrayList2 = new ArrayList(hashSet5);
        getFileLoader().getFileDatabase().removeFiles(arrayList2);
        getFileLoader().cancelLoadAllFiles();
        getFileLoader().getFileLoaderQueue().postRunnable(new q1(this, arrayList2, e2Var, 3));
    }

    public final void m0(File file, int i10, LongSparseArray longSparseArray, ci.b bVar) {
        File[] listFiles;
        if (file != null && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (i0) {
                    break;
                }
                if (file2.isDirectory()) {
                    m0(file2, i10, longSparseArray, bVar);
                } else if (!file2.getName().equals(".nomedia")) {
                    FilePathDatabase.FileMeta fileDialogId = getFileLoader().getFileDatabase().getFileDialogId(file2, null);
                    String lowerCase = file2.getName().toLowerCase();
                    int i11 = (lowerCase.endsWith(".mp3") || lowerCase.endsWith(".m4a")) ? 3 : i10;
                    ci.a aVar = new ci.a(file2);
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
                    long j10 = aVar.b;
                    if (j10 != 0) {
                        w6 w6Var = (w6) longSparseArray.get(j10, null);
                        if (w6Var == null) {
                            w6Var = new w6(aVar.b);
                            longSparseArray.put(aVar.b, w6Var);
                        }
                        w6Var.a(aVar, i11);
                    }
                    if (i11 != 6) {
                        bVar.e(i11).add(aVar);
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onBackPressed(boolean z10) {
        ci.b bVar = this.e0;
        if (bVar == null || bVar.j.isEmpty()) {
            return super.onBackPressed(z10);
        }
        if (z10) {
            this.e0.d();
            m6 m6Var = this.M;
            if (m6Var != null) {
                m6Var.f(false);
                this.M.e();
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        i0 = false;
        getNotificationCenter().addObserver(this, NotificationCenter.didClearDatabase);
        this.e = MessagesStorage.getInstance(this.currentAccount).getDatabaseSize();
        Utilities.globalQueue.postRunnable(new g6(this, 2));
        this.a0 = System.currentTimeMillis();
        w0(false);
        u0();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.didClearDatabase);
        try {
            org.telegram.ui.ActionBar.e2 e2Var = this.c;
            if (e2Var != null) {
                e2Var.dismiss();
            }
        } catch (Exception unused) {
        }
        this.c = null;
        i0 = true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        r0(i11, i13);
    }

    @Override // org.telegram.ui.ActionBar.r2
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

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        this.a.l();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.g1 g1Var = this.c0;
            if (g1Var != null) {
                g1Var.setIconColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.p7, false));
            }
            vu vuVar = this.Z;
            if (vuVar != null) {
                vuVar.setBackgroundColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.h5, false));
            }
            try {
                org.telegram.ui.ActionBar.g1 g1Var2 = this.c0;
                if (g1Var2 != null) {
                    g1Var2.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.q7, false));
                }
                org.telegram.ui.ActionBar.g1 g1Var3 = this.d0;
                if (g1Var3 != null) {
                    g1Var3.setIconColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.p7, false));
                    this.d0.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.q7, false));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        if (f7 > 0.5f && !this.h0) {
            this.h0 = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        super.onTransitionAnimationProgress(z10, f7);
    }

    public final boolean p0() {
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
            y6 y6Var = (y6) arrayList.get(i11);
            if (y6Var.a == 11 && !y6Var.i && (i10 = y6Var.f) >= 0) {
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

    public final void r0(int i10, int i11) {
        this.P = i10;
        this.Q = i11;
        bi.r1 r1Var = this.b;
        if (r1Var == null) {
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2;
        int g7 = d3.g(48.0f, i10, -AndroidUtilities.dp(8.0f));
        int g10 = d3.g(48.0f, i11, -AndroidUtilities.dp(8.0f));
        AndroidUtilities.setViewLayoutMargins(r1Var, 0, g7, 0, g10);
        r1Var.setPadding(0, (currentActionBarHeight + i10) - g7, 0, i11 - g10);
        View view = this.O;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = AndroidUtilities.dp(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10;
            this.O.setLayoutParams(layoutParams);
            v0();
        }
        if (this.b0 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b.getLayoutParams();
            this.b0.z(-marginLayoutParams.topMargin, -marginLayoutParams.bottomMargin);
            org.telegram.ui.Components.lw0 lw0Var = this.b0;
            lw0Var.B();
            lw0Var.requestLayout();
            lw0Var.invalidate();
        }
    }

    public final long s0(int i10) {
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

    public final void t0(View view) {
        int i10;
        int i11;
        int i12;
        boolean p02 = p0();
        boolean[] zArr = this.d;
        ArrayList arrayList = this.g0;
        if (p02) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                y6 y6Var = (y6) arrayList.get(i13);
                if (y6Var.a != 11 || y6Var.i || (i12 = y6Var.f) < 0 || !zArr[i12]) {
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
                y6 y6Var2 = (y6) arrayList.get(i14);
                if (y6Var2.a == 11 && !y6Var2.i && (i11 = y6Var2.f) >= 0) {
                    zArr2[i11] = true;
                }
            }
            for (int i15 = 0; i15 < length; i15++) {
                if (!zArr2[i15]) {
                    zArr[i15] = !p02;
                }
            }
        } else {
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                y6 y6Var3 = (y6) arrayList.get(i16);
                if (y6Var3.a == 11 && y6Var3.i && (i10 = y6Var3.f) >= 0) {
                    zArr[i10] = !p02;
                }
            }
        }
        for (int i17 = 0; i17 < this.b.getChildCount(); i17++) {
            View childAt = this.b.getChildAt(i17);
            if (childAt instanceof org.telegram.ui.Cells.y1) {
                this.b.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    y6 y6Var4 = (y6) arrayList.get(R);
                    if (y6Var4.a == 11) {
                        int i18 = y6Var4.f;
                        if (i18 < 0) {
                            ((org.telegram.ui.Cells.y1) childAt).c(!p02, true);
                        } else {
                            ((org.telegram.ui.Cells.y1) childAt).c(zArr[i18], true);
                        }
                    }
                }
            }
        }
        u0();
    }

    public final void u0() {
        z6 z6Var = this.W;
        boolean z10 = false;
        if (z6Var != null) {
            boolean z11 = this.K;
            if (!z11 && this.G > 0) {
                org.telegram.ui.Components.bd[] bdVarArr = new org.telegram.ui.Components.bd[11];
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.g0;
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    y6 y6Var = (y6) arrayList.get(i10);
                    if (y6Var.a == 11) {
                        int i11 = y6Var.f;
                        boolean[] zArr = this.d;
                        if (i11 >= 0) {
                            long j10 = y6Var.g;
                            boolean z12 = zArr[i11];
                            org.telegram.ui.Components.bd bdVar = new org.telegram.ui.Components.bd();
                            bdVar.c = j10;
                            bdVar.b = z12;
                            bdVarArr[i11] = bdVar;
                        } else if (this.L) {
                            long j11 = y6Var.g;
                            boolean z13 = zArr[10];
                            org.telegram.ui.Components.bd bdVar2 = new org.telegram.ui.Components.bd();
                            bdVar2.c = j11;
                            bdVar2.b = z13;
                            bdVarArr[10] = bdVar2;
                        }
                    }
                    i10++;
                }
                if (System.currentTimeMillis() - this.a0 < 80) {
                    this.W.n.d(0.0f, true);
                }
                this.W.f(this.G, true, bdVarArr);
            } else if (z11) {
                z6Var.f(-1L, true, new org.telegram.ui.Components.bd[0]);
            } else {
                z6Var.f(0L, true, new org.telegram.ui.Components.bd[0]);
            }
        }
        t6 t6Var = this.Y;
        if (t6Var == null || this.K) {
            return;
        }
        c7 c7Var = t6Var.d;
        boolean[] zArr2 = c7Var.d;
        long j12 = (zArr2[0] ? c7Var.x : 0L) + (zArr2[1] ? c7Var.y : 0L) + (zArr2[2] ? c7Var.r : 0L) + (zArr2[3] ? c7Var.w : 0L) + (zArr2[4] ? c7Var.s : 0L) + (zArr2[5] ? c7Var.v : 0L) + (zArr2[6] ? c7Var.F : 0L) + (zArr2[7] ? c7Var.f : 0L) + (zArr2[8] ? c7Var.n : 0L) + (zArr2[9] ? c7Var.E : 0L);
        ArrayList arrayList2 = c7Var.g0;
        int i12 = 0;
        while (true) {
            if (i12 >= arrayList2.size()) {
                z10 = true;
                break;
            }
            y6 y6Var2 = (y6) arrayList2.get(i12);
            if (y6Var2.a == 11) {
                int i13 = y6Var2.f;
                if (i13 < 0) {
                    i13 = zArr2.length - 1;
                }
                if (!zArr2[i13]) {
                    break;
                }
            }
            i12++;
        }
        t6Var.a(j12, z10);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0() {
        View view = this.O;
        if (view == null) {
            return;
        }
        oe.b bVar = this.S;
        float f7 = bVar == null ? 0.0f : bVar.e;
        oe.b bVar2 = this.T;
        view.setTranslationY(((-(1.0f - f7)) * org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - ((1.0f - (bVar2 != null ? bVar2.e : 0.0f)) * AndroidUtilities.dp(44.0f)));
    }

    public final void w0(boolean z10) {
        long j10;
        boolean z11;
        float[] fArr;
        ci.b bVar;
        org.telegram.ui.Components.lw0 lw0Var = this.b0;
        boolean z12 = lw0Var != null && lw0Var.e0;
        boolean z13 = (!z10 || System.currentTimeMillis() - this.a0 >= 80) ? z10 : false;
        ArrayList arrayList = this.f0;
        arrayList.clear();
        ArrayList arrayList2 = this.g0;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.add(new y6(9, (String) null));
        arrayList2.add(new y6(10, (String) null));
        arrayList2.size();
        if (this.K) {
            arrayList2.add(new y6(12, (String) null));
            arrayList2.add(new y6(12, (String) null));
            arrayList2.add(new y6(12, (String) null));
            arrayList2.add(new y6(12, (String) null));
            arrayList2.add(new y6(12, (String) null));
            z11 = true;
            j10 = 0;
        } else {
            ArrayList arrayList3 = new ArrayList();
            if (this.x > 0) {
                arrayList3.add(y6.b(0, this.x, LocaleController.getString(R.string.LocalPhotoCache), org.telegram.ui.ActionBar.y6.lj));
            }
            if (this.y > 0) {
                arrayList3.add(y6.b(1, this.y, LocaleController.getString(R.string.LocalVideoCache), org.telegram.ui.ActionBar.y6.hj));
            }
            if (this.r > 0) {
                arrayList3.add(y6.b(2, this.r, LocaleController.getString(R.string.LocalDocumentCache), org.telegram.ui.ActionBar.y6.ij));
            }
            if (this.w > 0) {
                j10 = 0;
                arrayList3.add(y6.b(3, this.w, LocaleController.getString(R.string.LocalMusicCache), org.telegram.ui.ActionBar.y6.pj));
            } else {
                j10 = 0;
            }
            if (this.s > j10) {
                arrayList3.add(y6.b(4, this.s, LocaleController.getString(R.string.LocalAudioCache), org.telegram.ui.ActionBar.y6.mj));
            }
            if (this.v > j10) {
                arrayList3.add(y6.b(5, this.v, LocaleController.getString(R.string.LocalStoriesCache), org.telegram.ui.ActionBar.y6.jj));
            }
            if (this.F > j10) {
                arrayList3.add(y6.b(6, this.F, LocaleController.getString(R.string.LocalStickersCache), org.telegram.ui.ActionBar.y6.nj));
            }
            if (this.f > j10) {
                arrayList3.add(y6.b(7, this.f, LocaleController.getString(R.string.LocalProfilePhotosCache), org.telegram.ui.ActionBar.y6.qj));
            }
            if (this.n > j10) {
                arrayList3.add(y6.b(8, this.n, LocaleController.getString(R.string.LocalMiscellaneousCache), org.telegram.ui.ActionBar.y6.pj));
            }
            if (this.E > j10) {
                arrayList3.add(y6.b(9, this.E, LocaleController.getString(R.string.LocalLogsCache), org.telegram.ui.ActionBar.y6.kj));
            }
            if (arrayList3.isEmpty()) {
                z11 = false;
            } else {
                Collections.sort(arrayList3, new org.telegram.ui.ActionBar.n4(5));
                ((y6) arrayList3.get(arrayList3.size() - 1)).j = true;
                if (this.V == null) {
                    this.V = new float[11];
                }
                int i10 = 0;
                while (true) {
                    fArr = this.V;
                    if (i10 >= fArr.length) {
                        break;
                    }
                    fArr[i10] = s0(i10);
                    i10++;
                }
                if (this.U == null) {
                    this.U = new int[11];
                }
                AndroidUtilities.roundPercents(fArr, this.U);
                if (arrayList3.size() > 5) {
                    arrayList2.addAll(arrayList3.subList(0, 4));
                    long j11 = j10;
                    int i11 = 0;
                    for (int i12 = 4; i12 < arrayList3.size(); i12++) {
                        ((y6) arrayList3.get(i12)).i = true;
                        j11 += ((y6) arrayList3.get(i12)).g;
                        i11 += this.U[((y6) arrayList3.get(i12)).f];
                    }
                    this.U[10] = i11;
                    arrayList2.add(y6.b(-1, j11, LocaleController.getString(R.string.LocalOther), org.telegram.ui.ActionBar.y6.kj));
                    if (!this.L) {
                        arrayList2.addAll(arrayList3.subList(4, arrayList3.size()));
                    }
                } else {
                    arrayList2.addAll(arrayList3);
                }
                z11 = true;
            }
        }
        if (z11) {
            arrayList2.size();
            arrayList2.add(new y6(13, (String) null));
            String string = LocaleController.getString(R.string.StorageUsageInfo);
            y6 y6Var = new y6(1);
            y6Var.e = string;
            arrayList2.add(y6Var);
        }
        arrayList2.add(new y6(3, LocaleController.getString(R.string.AutoDeleteCachedMedia)));
        arrayList2.add(new y6(0, 0));
        arrayList2.add(new y6(1, 0));
        arrayList2.add(new y6(2, 0));
        arrayList2.add(new y6(3, 0));
        String string2 = LocaleController.getString(R.string.KeepMediaInfoPart);
        y6 y6Var2 = new y6(1);
        y6Var2.e = string2;
        arrayList2.add(y6Var2);
        if (this.H > j10) {
            arrayList2.add(new y6(3, LocaleController.getString(R.string.MaxCacheSize)));
            arrayList2.add(new y6(14));
            String string3 = LocaleController.getString(R.string.MaxCacheSizeInfo);
            y6 y6Var3 = new y6(1);
            y6Var3.e = string3;
            arrayList2.add(y6Var3);
        }
        this.R = -1;
        if (z11 && (bVar = this.e0) != null && !bVar.h()) {
            this.R = arrayList2.size();
            arrayList2.add(new y6(8, (String) null));
        }
        a7 a7Var = this.a;
        if (a7Var != null) {
            if (z13) {
                a7Var.E(arrayList, arrayList2);
            } else {
                a7Var.l();
            }
        }
        m6 m6Var = this.M;
        if (m6Var != null) {
            m6Var.d();
        }
        org.telegram.ui.Components.lw0 lw0Var2 = this.b0;
        if (lw0Var2 != null) {
            if (z12 && this.R != -1) {
                lw0Var2.a();
            }
            org.telegram.ui.Components.lw0 lw0Var3 = this.b0;
            lw0Var3.B();
            lw0Var3.requestLayout();
            lw0Var3.invalidate();
        }
    }
}
