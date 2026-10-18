package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.SpannableStringBuilder;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class c7 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public static volatile boolean k0 = false;
    public static long l0;
    public static Long m0;
    public static Long n0;
    public static Long o0;
    public long E;
    public long F;
    public long G;
    public long H;
    public long I;
    public long J;
    public final long K;
    public boolean L;
    public boolean M;
    public z6 N;
    public int[] O;
    public float[] P;
    public y6 Q;
    public n6 R;
    public s6 S;
    public xu T;
    public long U;
    public k6 V;
    public org.telegram.ui.ActionBar.e1 W;
    public org.telegram.ui.ActionBar.e1 X;
    public bi.c Y;
    public final ArrayList Z;
    public a7 a;
    public final ArrayList a0;
    public ai.u1 b;
    public boolean b0;
    public s4.b0 c;
    public org.telegram.ui.ActionBar.y c0;
    public org.telegram.ui.ActionBar.b2 d;
    public org.telegram.ui.Components.q6 d0;
    public final boolean[] e;
    public org.telegram.ui.Components.q6 e0;
    public long f;
    public TextView f0;
    public ValueAnimator g0;
    public long h;
    public float h0;
    public boolean i0;
    public float j0;
    public long n;
    public long r;
    public long s;
    public long v;
    public long w;
    public long x;
    public long y;

    public c7() {
        super(null);
        this.e = new boolean[]{true, true, true, true, true, true, true, true, true, true, true};
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
        this.K = -1L;
        this.L = true;
        this.M = true;
        this.Z = new ArrayList();
        this.a0 = new ArrayList();
        this.j0 = 1.0f;
    }

    public static void U(c7 c7Var, boolean z10, long j10, q6 q6Var) {
        if (z10) {
            ImageLoader.getInstance().clearMemory();
        }
        try {
            org.telegram.ui.ActionBar.b2 b2Var = c7Var.d;
            if (b2Var != null) {
                b2Var.dismiss();
                c7Var.d = null;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        c7Var.getMediaDataController().ringtoneDataStore.b();
        AndroidUtilities.runOnUIThread(new ai.t3(c7Var, j10, 22), 150L);
        MediaDataController.getInstance(c7Var.currentAccount).checkAllMedia(true);
        c7Var.getFileLoader().getFileDatabase().getQueue().postRunnable(new g6(c7Var, 1));
        q6Var.run();
    }

    public static void V(c7 c7Var, boolean z10) {
        if (c7Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(c7Var.getParentActivity(), 3, null);
        c7Var.d = b2Var;
        b2Var.g0 = false;
        b2Var.q(500L);
        MessagesController.getInstance(c7Var.currentAccount).clearQueryTime();
        if (z10) {
            c7Var.getMessagesStorage().fullReset();
        } else {
            c7Var.getMessagesStorage().clearLocalDatabase();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void W(c7 c7Var, p6 p6Var, q6 q6Var) {
        int i10;
        int i11;
        ai.xb xbVar;
        int i12;
        char c10;
        char c11;
        int i13;
        File checkDirectory;
        char c12;
        int i14 = 1;
        int[] iArr = {0};
        boolean[] zArr = c7Var.e;
        int i15 = 2;
        int i16 = 3;
        char c13 = 4;
        char c14 = 5;
        int i17 = (zArr[0] ? 2 : 0) + (zArr[1] ? 2 : 0) + (zArr[2] ? 2 : 0) + (zArr[3] ? 2 : 0) + (zArr[4] ? 1 : 0) + (zArr[5] ? 2 : 0) + (zArr[6] ? 1 : 0) + (zArr[7] ? 1 : 0) + (zArr[8] ? 1 : 0) + (zArr[9] ? 1 : 0);
        long currentTimeMillis = System.currentTimeMillis();
        gi.g4 g4Var = new gi.g4(p6Var, iArr, i17, 2);
        ai.xb xbVar2 = new ai.xb(p6Var, iArr, i17, currentTimeMillis, 14);
        long j10 = 0;
        boolean z10 = true;
        int i18 = 0;
        int i19 = 0;
        while (i18 < 10) {
            if (zArr[i18]) {
                if (i18 == 0) {
                    j10 += c7Var.y;
                    i11 = i14;
                    xbVar = xbVar2;
                    i12 = 9;
                    i15 = 0;
                    i16 = 0;
                } else {
                    if (i18 == i14) {
                        j10 += c7Var.E;
                        i11 = i14;
                        xbVar = xbVar2;
                        i16 = i15;
                    } else {
                        if (i18 == i15) {
                            j10 += c7Var.s;
                            i15 = i14;
                            i11 = i15;
                        } else if (i18 == i16) {
                            j10 += c7Var.x;
                            i11 = i14;
                        } else if (i18 == 4) {
                            j10 += c7Var.v;
                            i16 = i14;
                            i11 = i16;
                            xbVar = xbVar2;
                        } else if (i18 == 5) {
                            j10 += c7Var.w;
                            i11 = i14;
                            xbVar = xbVar2;
                            i12 = 9;
                            i15 = 0;
                            i16 = 6;
                        } else if (i18 == 6) {
                            j10 += c7Var.G;
                            i11 = i14;
                            xbVar = xbVar2;
                            i12 = 9;
                            i15 = 0;
                            i16 = 100;
                        } else {
                            i10 = 7;
                            if (i18 == 7) {
                                i11 = i14;
                                xbVar = xbVar2;
                                j10 += c7Var.h;
                                i12 = 9;
                                i15 = 5;
                            } else {
                                i11 = i14;
                                xbVar = xbVar2;
                                if (i18 == 8) {
                                    j10 += c7Var.r;
                                    i12 = 9;
                                    i15 = 4;
                                } else {
                                    i12 = 9;
                                    if (i18 == 9) {
                                        j10 += c7Var.F;
                                        i15 = i11;
                                        i16 = 0;
                                    } else {
                                        i16 = -1;
                                        i15 = 0;
                                    }
                                    if (i16 != -1) {
                                        if (i18 == i10) {
                                            try {
                                                k0(ApplicationLoader.getFilesDirFixed("rasterized/wallpaper").getAbsolutePath(), 0, null, null);
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
                                            k0(checkDirectory.getAbsolutePath(), i15, null, g4Var);
                                        }
                                        iArr[0] = iArr[0] + 1;
                                        xbVar.run();
                                        if (i16 == 100) {
                                            File checkDirectory2 = FileLoader.checkDirectory(4);
                                            if (checkDirectory2 != null) {
                                                k0(checkDirectory2.getAbsolutePath(), 3, null, g4Var);
                                            }
                                            iArr[0] = iArr[0] + 1;
                                            xbVar.run();
                                        }
                                        if (i16 == 0 || i16 == 2) {
                                            File checkDirectory3 = FileLoader.checkDirectory(i16 == 0 ? 100 : 101);
                                            if (checkDirectory3 != null) {
                                                k0(checkDirectory3.getAbsolutePath(), i15, null, g4Var);
                                            }
                                            c12 = 0;
                                            iArr[0] = iArr[0] + 1;
                                            xbVar.run();
                                        } else {
                                            c12 = 0;
                                        }
                                        if (i16 == 3) {
                                            File checkDirectory4 = FileLoader.checkDirectory(5);
                                            if (checkDirectory4 != null) {
                                                k0(checkDirectory4.getAbsolutePath(), i15, null, g4Var);
                                            }
                                            iArr[c12] = iArr[c12] + 1;
                                            xbVar.run();
                                        }
                                        if (i18 == i12) {
                                            c7Var.F = q0(i13, AndroidUtilities.getLogsDir());
                                        } else {
                                            int i20 = i13;
                                            if (i16 == 4) {
                                                c7Var.h = q0(5, FileLoader.checkDirectory(4));
                                                c7Var.r = q0(4, FileLoader.checkDirectory(4));
                                                i19 = i20;
                                            } else if (i16 == i20) {
                                                c7Var.v = q0(i15, FileLoader.checkDirectory(i20));
                                            } else if (i16 == 6) {
                                                c7Var.w = q0(i15, FileLoader.checkDirectory(6));
                                            } else {
                                                if (i16 != 3) {
                                                    c10 = 5;
                                                    if (i16 == 0) {
                                                        long q02 = q0(i15, FileLoader.checkDirectory(0));
                                                        c7Var.y = q02;
                                                        c7Var.y = q0(i15, FileLoader.checkDirectory(100)) + q02;
                                                        i19 = 1;
                                                    } else if (i16 == 2) {
                                                        long q03 = q0(i15, FileLoader.checkDirectory(2));
                                                        c7Var.E = q03;
                                                        c7Var.E = q0(i15, FileLoader.checkDirectory(101)) + q03;
                                                    } else if (i16 == 100) {
                                                        c11 = 4;
                                                        c7Var.G = q0(i15, new File(FileLoader.checkDirectory(4), "acache"));
                                                        long q04 = q0(3, FileLoader.checkDirectory(4));
                                                        c7Var.n = q04;
                                                        c7Var.G += q04;
                                                        i19 = 1;
                                                    }
                                                } else if (i15 == i20) {
                                                    long q05 = q0(i15, FileLoader.checkDirectory(3));
                                                    c7Var.s = q05;
                                                    c10 = 5;
                                                    c7Var.s = q0(i15, FileLoader.checkDirectory(5)) + q05;
                                                } else {
                                                    c10 = 5;
                                                    long q06 = q0(i15, FileLoader.checkDirectory(3));
                                                    c7Var.x = q06;
                                                    c7Var.x = q0(i15, FileLoader.checkDirectory(5)) + q06;
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
                        xbVar = xbVar2;
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
                xbVar = xbVar2;
                c11 = c13;
                c10 = c14;
                z10 = false;
            }
            i18++;
            c14 = c10;
            c13 = c11;
            xbVar2 = xbVar;
            i14 = 1;
            i15 = 2;
            i16 = 3;
        }
        long j11 = c7Var.h + c7Var.r + c7Var.F + c7Var.E + c7Var.v + c7Var.y + c7Var.s + c7Var.x + c7Var.G + c7Var.w;
        m0 = Long.valueOf(j11);
        c7Var.H = j11;
        l0 = System.currentTimeMillis();
        Arrays.fill(zArr, true);
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong();
        c7Var.I = statFs.getBlockCountLong() * blockSizeLong;
        c7Var.J = availableBlocksLong * blockSizeLong;
        if (z10) {
            FileLoader.getInstance(c7Var.currentAccount).clearFilePaths();
        }
        FileLoader.getInstance(c7Var.currentAccount).checkCurrentDownloadsFiles();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.p8((Object) c7Var, (boolean) i19, j10, (Object) q6Var, 8));
    }

    public static void X(c7 c7Var, ValueAnimator valueAnimator) {
        c7Var.h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c7Var.actionBar.setTitleColor(i0.a.o(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false), (int) (c7Var.h0 * 255.0f)));
        c7Var.actionBar.setBackgroundColor(i0.a.o(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false), (int) (c7Var.h0 * 255.0f)));
        c7Var.fragmentView.invalidate();
    }

    public static /* synthetic */ void Y(c7 c7Var, org.telegram.ui.ActionBar.b2 b2Var) {
        FileLoader.getInstance(c7Var.currentAccount).checkCurrentDownloadsFiles();
        try {
            b2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void b0(c7 c7Var, boolean z10) {
        if (z10 != c7Var.i0) {
            ValueAnimator valueAnimator = c7Var.g0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f7 = c7Var.h0;
            c7Var.i0 = z10;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, z10 ? 1.0f : 0.0f);
            c7Var.g0 = ofFloat;
            ofFloat.addUpdateListener(new e3(c7Var, 2));
            c7Var.g0.setInterpolator(org.telegram.ui.Components.bs.h);
            c7Var.g0.setDuration(380L);
            c7Var.g0.start();
        }
    }

    public static String c0(c7 c7Var, float f7) {
        if (f7 < 0.001f) {
            return String.format("<%.1f%%", Float.valueOf(0.1f));
        }
        float round = Math.round(f7 * 100.0f);
        return round <= 0.0f ? String.format("<%d%%", 1) : String.format("%d%%", Integer.valueOf((int) round));
    }

    public static void f0(c7 c7Var, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c7Var.getParentActivity());
        String string = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.R = string;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.LocalDatabaseClearText));
        spannableStringBuilder.append((CharSequence) "\n\n");
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("LocalDatabaseClearText2", R.string.LocalDatabaseClearText2, AndroidUtilities.formatFileSize(c7Var.f))));
        b2Var.T = spannableStringBuilder;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.CacheClear), new ci.f(5, c7Var, z10));
        c7Var.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q7, false));
        }
    }

    public static void g0(c7 c7Var) {
        String formatPluralString;
        if (c7Var.Y.j.size() <= 0) {
            c7Var.N.e(false);
            return;
        }
        if (c7Var.N != null) {
            if (c7Var.Y.l.isEmpty()) {
                formatPluralString = LocaleController.formatPluralString("Files", c7Var.Y.j.size(), Integer.valueOf(c7Var.Y.j.size()));
            } else {
                ArrayList arrayList = c7Var.Y.b;
                int size = arrayList.size();
                int i10 = 0;
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    v6 v6Var = (v6) obj;
                    if (c7Var.Y.l.contains(Long.valueOf(v6Var.a))) {
                        i10 += v6Var.b;
                    }
                }
                int size2 = c7Var.Y.j.size() - i10;
                formatPluralString = size2 > 0 ? a1.g.C(LocaleController.formatPluralString("Chats", c7Var.Y.l.size(), Integer.valueOf(c7Var.Y.l.size())), ", ", LocaleController.formatPluralString("Files", size2, Integer.valueOf(size2))) : LocaleController.formatPluralString("Chats", c7Var.Y.l.size(), Integer.valueOf(c7Var.Y.l.size()));
            }
            c7Var.d0.c(AndroidUtilities.formatFileSize(c7Var.Y.k), !LocaleController.isRTL, true);
            c7Var.e0.c(formatPluralString, !LocaleController.isRTL, true);
            c7Var.N.e(true);
        }
    }

    public static void j0(Utilities.Callback callback) {
        Long l4 = m0;
        if (l4 != null) {
            callback.run(l4);
            if (System.currentTimeMillis() - l0 < 5000) {
                return;
            }
        }
        Utilities.cacheClearQueue.postRunnable(new ut0(callback, 15));
    }

    public static void k0(String str, int i10, int[] iArr, Utilities.Callback callback) {
        File[] listFiles;
        int n02 = n0(i10, str);
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
                        callback.run(Float.valueOf(i11 / n02));
                    }
                } else if (!"drafts".equals(file2.getName())) {
                    k0(a1.g.C(str, "/", name), i10, iArr, callback);
                }
            }
        }
    }

    public static int n0(int i10, String str) {
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
                i11 = file2.isDirectory() ? i11 + n0(i10, str + "/" + name) : i11 + 1;
            }
        }
        return i11;
    }

    public static void p0(g5 g5Var) {
        Long l4;
        Long l10 = n0;
        if (l10 == null || (l4 = o0) == null) {
            Utilities.cacheClearQueue.postRunnable(new ut0(g5Var, 14));
        } else {
            g5Var.run(l10, l4);
        }
    }

    public static long q0(int i10, File file) {
        if (file != null && !k0) {
            if (file.isDirectory()) {
                return Utilities.getDirSize(file.getAbsolutePath(), i10, false);
            }
            if (file.isFile()) {
                return file.length();
            }
        }
        return 0L;
    }

    public static boolean s0(int i10, String str) {
        if (str == null || FileLoader.checkDirectory(i10) == null) {
            return false;
        }
        return str.contains(FileLoader.checkDirectory(i10).getAbsolutePath());
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.actionBar.setBackgroundDrawable(null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        int i10 = 1;
        this.actionBar.setOccupyStatusBar(true);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        kVar.setTitleColor(i0.a.o(org.telegram.ui.ActionBar.h6.x0(null, i11, false), 0));
        this.actionBar.C(org.telegram.ui.ActionBar.h6.x0(null, i11, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.i6, false), false);
        i2.d.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.StorageUsage));
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 25));
        this.c0 = this.actionBar.j(null);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c0.addView(frameLayout, w7.z5.m(1.0f, 0, -1, 72, 0, 0));
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, true, true, true);
        this.d0 = q6Var;
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
        q6Var.b(0.35f, 350L, bsVar);
        this.d0.setTextSize(AndroidUtilities.dp(18.0f));
        this.d0.setTypeface(AndroidUtilities.bold());
        this.d0.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        frameLayout.addView(this.d0, w7.z5.d(-1, 18.0f, 19, 0.0f, -11.0f, 18.0f, 0.0f));
        org.telegram.ui.Components.q6 q6Var2 = new org.telegram.ui.Components.q6(context, true, true, true);
        this.e0 = q6Var2;
        q6Var2.b(0.35f, 350L, bsVar);
        this.e0.setTextSize(AndroidUtilities.dp(14.0f));
        this.e0.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.y6, false));
        frameLayout.addView(this.e0, w7.z5.d(-1, 18.0f, 19, 0.0f, 10.0f, 18.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f0 = textView;
        textView.setTextSize(1, 14.0f);
        this.f0.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        this.f0.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false));
        this.f0.setBackground(org.telegram.ui.ActionBar.x5.f(new float[]{6.0f}, org.telegram.ui.ActionBar.h6.Oh));
        this.f0.setTypeface(AndroidUtilities.bold());
        this.f0.setGravity(17);
        this.f0.setText(LocaleController.getString(R.string.CacheClear));
        this.f0.setOnClickListener(new a(this, 5));
        if (LocaleController.isRTL) {
            frameLayout.addView(this.f0, w7.z5.d(-2, 28.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            frameLayout.addView(this.f0, w7.z5.d(-2, 28.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        }
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.n().a(2, R.drawable.ic_ab_other);
        org.telegram.ui.ActionBar.e1 e = a2.e(3, R.drawable.msg_delete, LocaleController.getString(R.string.ClearLocalDatabase));
        this.W = e;
        int i12 = org.telegram.ui.ActionBar.h6.p7;
        e.setIconColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        org.telegram.ui.ActionBar.e1 e1Var = this.W;
        int i13 = org.telegram.ui.ActionBar.h6.q7;
        e1Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
        this.W.setSelectorColor(org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.x0(null, i12, false)));
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            org.telegram.ui.ActionBar.e1 e7 = a2.e(4, R.drawable.msg_delete, "Full Reset Database");
            this.X = e7;
            e7.setIconColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
            this.X.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
            this.X.setSelectorColor(org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.x0(null, i12, false)));
        }
        if (this.W != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ClearLocalDatabase));
            this.W.setText(spannableStringBuilder);
        }
        this.a = new a7(this, context);
        k6 k6Var = new k6(this, context);
        this.V = k6Var;
        this.fragmentView = k6Var;
        k6Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.a7, false));
        ai.u1 u1Var = new ai.u1(this, context, 6);
        this.b = u1Var;
        u1Var.p1();
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setPadding(0, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) + AndroidUtilities.statusBarHeight, 0, 0);
        this.b.setClipToPadding(false);
        ai.u1 u1Var2 = this.b;
        s4.b0 b0Var = new s4.b0(1, false);
        this.c = b0Var;
        u1Var2.setLayoutManager(b0Var);
        k6Var.addView(this.b, w7.z5.c(-1.0f, -1));
        this.b.setAdapter(this.a);
        l6 l6Var = new l6(this);
        l6Var.n(350L);
        l6Var.o(bsVar);
        l6Var.C = false;
        l6Var.m = false;
        this.b.setItemAnimator(l6Var);
        this.b.setOnItemClickListener(new f6(this));
        this.b.j(new ei.e9(this, i10));
        k6Var.addView(this.actionBar, w7.z5.c(-2.0f, -1));
        this.V.setTargetListView(this.b);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didClearDatabase) {
            try {
                org.telegram.ui.ActionBar.b2 b2Var = this.d;
                if (b2Var != null) {
                    b2Var.dismiss();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            this.d = null;
            if (this.a != null) {
                this.f = MessagesStorage.getInstance(this.currentAccount).getDatabaseSize();
                if (this.W != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ClearLocalDatabase));
                    this.W.setText(spannableStringBuilder);
                }
                w0(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        e eVar = new e(this, 1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 16, new Class[]{org.telegram.ui.Cells.ba.class, org.telegram.ui.Components.nw0.class, org.telegram.ui.Components.xy0.class, org.telegram.ui.Cells.l4.class}, null, null, null, org.telegram.ui.ActionBar.h6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.i6));
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.h6.I6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 0, new Class[]{org.telegram.ui.Components.xy0.class}, new String[]{"paintFill"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Ti));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 0, new Class[]{org.telegram.ui.Components.xy0.class}, new String[]{"paintProgress"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Vi));
        int i12 = org.telegram.ui.ActionBar.h6.y6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 0, new Class[]{org.telegram.ui.Components.xy0.class}, new String[]{"telegramCacheTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 0, new Class[]{org.telegram.ui.Components.xy0.class}, new String[]{"freeSizeTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 0, new Class[]{org.telegram.ui.Components.xy0.class}, new String[]{"calculationgTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 0, new Class[]{org.telegram.ui.Components.nw0.class}, null, null, null, org.telegram.ui.ActionBar.h6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 0, new Class[]{org.telegram.ui.Components.nw0.class}, null, null, null, org.telegram.ui.ActionBar.h6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 0, new Class[]{org.telegram.ui.Components.nw0.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, new Class[]{org.telegram.ui.Cells.a2.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, new Class[]{org.telegram.ui.Cells.a2.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, new Class[]{org.telegram.ui.Cells.a2.class}, org.telegram.ui.ActionBar.h6.k0, null, null, org.telegram.ui.ActionBar.h6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, new Class[]{org.telegram.ui.Components.vy0.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.hj));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.ij));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.jj));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.kj));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.lj));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.mj));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.nj));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.oj));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        return !this.b0 ? super.isLightStatusBar() : AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.a7, false)) > 0.721f;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        z6 z6Var = this.N;
        if (z6Var == null || motionEvent == null) {
            return true;
        }
        Rect rect = AndroidUtilities.rectTmp2;
        z6Var.getHitRect(rect);
        return !rect.contains((int) motionEvent.getX(), ((int) motionEvent.getY()) - this.actionBar.getMeasuredHeight()) || this.N.h.b == 0;
    }

    public final void l0(v6 v6Var, org.telegram.ui.Components.uy0[] uy0VarArr, bi.c cVar) {
        w6 w6Var;
        HashSet hashSet;
        long j10;
        org.telegram.ui.Components.uy0 uy0Var;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, null);
        b2Var.g0 = false;
        b2Var.q(500L);
        HashSet hashSet2 = new HashSet();
        long j11 = this.H;
        int i10 = 0;
        while (i10 < 8) {
            if ((uy0VarArr == null || ((uy0Var = uy0VarArr[i10]) != null && uy0Var.c)) && (w6Var = (w6) v6Var.d.get(i10)) != null) {
                ArrayList arrayList = w6Var.b;
                hashSet2.addAll(arrayList);
                hashSet = hashSet2;
                long j12 = v6Var.c;
                j10 = j11;
                long j13 = w6Var.a;
                v6Var.c = j12 - j13;
                this.H -= j13;
                this.J += j13;
                v6Var.d.delete(i10);
                if (i10 == 0) {
                    this.y -= w6Var.a;
                } else if (i10 == 1) {
                    this.E -= w6Var.a;
                } else if (i10 == 2) {
                    this.s -= w6Var.a;
                } else if (i10 == 3) {
                    this.x -= w6Var.a;
                } else if (i10 == 4) {
                    this.v -= w6Var.a;
                } else if (i10 == 5) {
                    this.G -= w6Var.a;
                } else if (i10 == 7) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        bi.b bVar = (bi.b) arrayList.get(i11);
                        String absolutePath = ((bi.b) arrayList.get(i11)).a.getAbsolutePath();
                        char c10 = 6;
                        if (s0(6, absolutePath)) {
                            c10 = 7;
                        } else if (s0(0, absolutePath) || s0(100, absolutePath)) {
                            c10 = 0;
                        } else if (s0(2, absolutePath) || s0(101, absolutePath)) {
                            c10 = 1;
                        }
                        if (c10 == 7) {
                            this.w -= bVar.c;
                        } else if (c10 == 0) {
                            this.y -= bVar.c;
                        } else if (c10 == 1) {
                            this.E -= bVar.c;
                        } else {
                            this.h -= bVar.c;
                        }
                    }
                } else {
                    this.h -= w6Var.a;
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
        if (v6Var.d.size() == 0) {
            this.Y.b.remove(v6Var);
        }
        w0(true);
        if (cVar != null) {
            Iterator it = cVar.j.iterator();
            while (it.hasNext()) {
                bi.b bVar2 = (bi.b) it.next();
                HashSet hashSet4 = hashSet3;
                if (!hashSet4.contains(bVar2)) {
                    long j15 = this.H;
                    long j16 = bVar2.c;
                    this.H = j15 - j16;
                    this.J += j16;
                    hashSet4.add(bVar2);
                    v6Var.b(bVar2);
                    int i12 = bVar2.d;
                    if (i12 == 0) {
                        this.y -= bVar2.c;
                    } else if (i12 == 1) {
                        this.E -= bVar2.c;
                    } else if (i12 == 2) {
                        this.s -= bVar2.c;
                    } else if (i12 == 3) {
                        this.x -= bVar2.c;
                    } else if (i12 == 4) {
                        this.v -= bVar2.c;
                    }
                }
                hashSet3 = hashSet4;
            }
        }
        HashSet hashSet5 = hashSet3;
        Iterator it2 = hashSet5.iterator();
        while (it2.hasNext()) {
            bi.b bVar3 = (bi.b) it2.next();
            bi.c cVar2 = this.Y;
            if (cVar2.j.remove(bVar3)) {
                cVar2.k -= bVar3.c;
            }
            ArrayList e = cVar2.e(bVar3.d);
            if (e != null) {
                e.remove(bVar3);
            }
        }
        org.telegram.ui.Components.qc Q = org.telegram.ui.Components.xc.a0(this).Q(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j14 - this.H)));
        Q.r = false;
        Q.j();
        ArrayList arrayList2 = new ArrayList(hashSet5);
        getFileLoader().getFileDatabase().removeFiles(arrayList2);
        getFileLoader().cancelLoadAllFiles();
        getFileLoader().getFileLoaderQueue().postRunnable(new t1(this, arrayList2, b2Var, 3));
    }

    public final void m0() {
        if (this.Y.j.size() == 0 || getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearCache);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearCacheForChats);
        alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new f6(this));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q7, false));
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final void o0(File file, int i10, LongSparseArray longSparseArray, bi.c cVar) {
        File[] listFiles;
        if (file != null && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (k0) {
                    break;
                }
                if (file2.isDirectory()) {
                    o0(file2, i10, longSparseArray, cVar);
                } else if (!file2.getName().equals(".nomedia")) {
                    FilePathDatabase.FileMeta fileDialogId = getFileLoader().getFileDatabase().getFileDialogId(file2, null);
                    String lowerCase = file2.getName().toLowerCase();
                    int i11 = (lowerCase.endsWith(".mp3") || lowerCase.endsWith(".m4a")) ? 3 : i10;
                    bi.b bVar = new bi.b(file2);
                    long length = file2.length();
                    bVar.c = length;
                    if (fileDialogId != null) {
                        bVar.b = fileDialogId.dialogId;
                        bVar.g = fileDialogId.messageId;
                        int i12 = fileDialogId.messageType;
                        bVar.h = i12;
                        if (i12 == 23 && length > 0) {
                            i11 = 7;
                        }
                    }
                    bVar.d = i11;
                    long j10 = bVar.b;
                    if (j10 != 0) {
                        v6 v6Var = (v6) longSparseArray.get(j10, null);
                        if (v6Var == null) {
                            v6Var = new v6(bVar.b);
                            longSparseArray.put(bVar.b, v6Var);
                        }
                        v6Var.a(bVar, i11);
                    }
                    if (i11 != 6) {
                        cVar.e(i11).add(bVar);
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        bi.c cVar = this.Y;
        if (cVar == null || cVar.j.isEmpty()) {
            return super.onBackPressed(z10);
        }
        if (z10) {
            this.Y.d();
            z6 z6Var = this.N;
            if (z6Var != null) {
                z6Var.e(false);
                this.N.d();
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        k0 = false;
        getNotificationCenter().addObserver(this, NotificationCenter.didClearDatabase);
        this.f = MessagesStorage.getInstance(this.currentAccount).getDatabaseSize();
        Utilities.globalQueue.postRunnable(new g6(this, 2));
        this.U = System.currentTimeMillis();
        w0(false);
        v0();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.didClearDatabase);
        try {
            org.telegram.ui.ActionBar.b2 b2Var = this.d;
            if (b2Var != null) {
                b2Var.dismiss();
            }
        } catch (Exception unused) {
        }
        this.d = null;
        k0 = true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.b.setPadding(0, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) + AndroidUtilities.statusBarHeight, 0, i13);
        this.b.setClipToPadding(false);
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
        if (f7 > 0.5f && !this.b0) {
            this.b0 = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        super.onTransitionAnimationProgress(z10, f7);
    }

    public final boolean r0() {
        int i10;
        boolean[] zArr = this.e;
        int length = zArr.length;
        boolean[] zArr2 = new boolean[length];
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.a0;
            if (i11 >= arrayList.size()) {
                break;
            }
            x6 x6Var = (x6) arrayList.get(i11);
            if (x6Var.a == 11 && !x6Var.i && (i10 = x6Var.f) >= 0) {
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

    public final long t0(int i10) {
        switch (i10) {
            case 0:
                return this.y;
            case 1:
                return this.E;
            case 2:
                return this.s;
            case 3:
                return this.x;
            case 4:
                return this.v;
            case 5:
                return this.w;
            case 6:
                return this.G;
            case 7:
                return this.h;
            case 8:
                return this.r;
            case 9:
                return this.F;
            default:
                return 0L;
        }
    }

    public final void u0(View view) {
        int i10;
        int i11;
        int i12;
        boolean r02 = r0();
        boolean[] zArr = this.e;
        ArrayList arrayList = this.a0;
        if (r02) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                x6 x6Var = (x6) arrayList.get(i13);
                if (x6Var.a != 11 || x6Var.i || (i12 = x6Var.f) < 0 || !zArr[i12]) {
                }
            }
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            if (view != null) {
                AndroidUtilities.shakeViewSpring(view, -3.0f);
                return;
            }
            return;
        }
        if (this.M) {
            int length = zArr.length;
            boolean[] zArr2 = new boolean[length];
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                x6 x6Var2 = (x6) arrayList.get(i14);
                if (x6Var2.a == 11 && !x6Var2.i && (i11 = x6Var2.f) >= 0) {
                    zArr2[i11] = true;
                }
            }
            for (int i15 = 0; i15 < length; i15++) {
                if (!zArr2[i15]) {
                    zArr[i15] = !r02;
                }
            }
        } else {
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                x6 x6Var3 = (x6) arrayList.get(i16);
                if (x6Var3.a == 11 && x6Var3.i && (i10 = x6Var3.f) >= 0) {
                    zArr[i10] = !r02;
                }
            }
        }
        for (int i17 = 0; i17 < this.b.getChildCount(); i17++) {
            View childAt = this.b.getChildAt(i17);
            if (childAt instanceof org.telegram.ui.Cells.a2) {
                this.b.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    x6 x6Var4 = (x6) arrayList.get(R);
                    if (x6Var4.a == 11) {
                        int i18 = x6Var4.f;
                        if (i18 < 0) {
                            ((org.telegram.ui.Cells.a2) childAt).c(!r02, true);
                        } else {
                            ((org.telegram.ui.Cells.a2) childAt).c(zArr[i18], true);
                        }
                    }
                }
            }
        }
        v0();
    }

    public final void v0() {
        y6 y6Var = this.Q;
        boolean z10 = false;
        if (y6Var != null) {
            boolean z11 = this.L;
            if (!z11 && this.H > 0) {
                org.telegram.ui.Components.cd[] cdVarArr = new org.telegram.ui.Components.cd[11];
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.a0;
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    x6 x6Var = (x6) arrayList.get(i10);
                    if (x6Var.a == 11) {
                        int i11 = x6Var.f;
                        boolean[] zArr = this.e;
                        if (i11 >= 0) {
                            long j10 = x6Var.g;
                            boolean z12 = zArr[i11];
                            org.telegram.ui.Components.cd cdVar = new org.telegram.ui.Components.cd();
                            cdVar.c = j10;
                            cdVar.b = z12;
                            cdVarArr[i11] = cdVar;
                        } else if (this.M) {
                            long j11 = x6Var.g;
                            boolean z13 = zArr[10];
                            org.telegram.ui.Components.cd cdVar2 = new org.telegram.ui.Components.cd();
                            cdVar2.c = j11;
                            cdVar2.b = z13;
                            cdVarArr[10] = cdVar2;
                        }
                    }
                    i10++;
                }
                if (System.currentTimeMillis() - this.U < 80) {
                    this.Q.n.d(0.0f, true);
                }
                this.Q.f(this.H, true, cdVarArr);
            } else if (z11) {
                y6Var.f(-1L, true, new org.telegram.ui.Components.cd[0]);
            } else {
                y6Var.f(0L, true, new org.telegram.ui.Components.cd[0]);
            }
        }
        s6 s6Var = this.S;
        if (s6Var == null || this.L) {
            return;
        }
        c7 c7Var = s6Var.d;
        boolean[] zArr2 = c7Var.e;
        long j12 = (zArr2[0] ? c7Var.y : 0L) + (zArr2[1] ? c7Var.E : 0L) + (zArr2[2] ? c7Var.s : 0L) + (zArr2[3] ? c7Var.x : 0L) + (zArr2[4] ? c7Var.v : 0L) + (zArr2[5] ? c7Var.w : 0L) + (zArr2[6] ? c7Var.G : 0L) + (zArr2[7] ? c7Var.h : 0L) + (zArr2[8] ? c7Var.r : 0L) + (zArr2[9] ? c7Var.F : 0L);
        ArrayList arrayList2 = c7Var.a0;
        int i12 = 0;
        while (true) {
            if (i12 >= arrayList2.size()) {
                z10 = true;
                break;
            }
            x6 x6Var2 = (x6) arrayList2.get(i12);
            if (x6Var2.a == 11) {
                int i13 = x6Var2.f;
                if (i13 < 0) {
                    i13 = zArr2.length - 1;
                }
                if (!zArr2[i13]) {
                    break;
                }
            }
            i12++;
        }
        s6Var.a(j12, z10);
    }

    public final void w0(boolean z10) {
        char c10;
        long j10;
        boolean z11;
        float[] fArr;
        bi.c cVar;
        boolean z12 = (!z10 || System.currentTimeMillis() - this.U >= 80) ? z10 : false;
        ArrayList arrayList = this.Z;
        arrayList.clear();
        ArrayList arrayList2 = this.a0;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.add(new x6(9, (String) null));
        arrayList2.add(new x6(10, (String) null));
        arrayList2.size();
        if (this.L) {
            arrayList2.add(new x6(12, (String) null));
            arrayList2.add(new x6(12, (String) null));
            arrayList2.add(new x6(12, (String) null));
            arrayList2.add(new x6(12, (String) null));
            arrayList2.add(new x6(12, (String) null));
            z11 = true;
            j10 = 0;
        } else {
            ArrayList arrayList3 = new ArrayList();
            if (this.y > 0) {
                c10 = '\n';
                arrayList3.add(x6.b(0, this.y, LocaleController.getString(R.string.LocalPhotoCache), org.telegram.ui.ActionBar.h6.lj));
            } else {
                c10 = '\n';
            }
            if (this.E > 0) {
                arrayList3.add(x6.b(1, this.E, LocaleController.getString(R.string.LocalVideoCache), org.telegram.ui.ActionBar.h6.hj));
            }
            if (this.s > 0) {
                arrayList3.add(x6.b(2, this.s, LocaleController.getString(R.string.LocalDocumentCache), org.telegram.ui.ActionBar.h6.ij));
            }
            if (this.x > 0) {
                arrayList3.add(x6.b(3, this.x, LocaleController.getString(R.string.LocalMusicCache), org.telegram.ui.ActionBar.h6.pj));
            }
            if (this.v > 0) {
                j10 = 0;
                arrayList3.add(x6.b(4, this.v, LocaleController.getString(R.string.LocalAudioCache), org.telegram.ui.ActionBar.h6.mj));
            } else {
                j10 = 0;
            }
            if (this.w > j10) {
                arrayList3.add(x6.b(5, this.w, LocaleController.getString(R.string.LocalStoriesCache), org.telegram.ui.ActionBar.h6.jj));
            }
            if (this.G > j10) {
                arrayList3.add(x6.b(6, this.G, LocaleController.getString(R.string.LocalStickersCache), org.telegram.ui.ActionBar.h6.nj));
            }
            if (this.h > j10) {
                arrayList3.add(x6.b(7, this.h, LocaleController.getString(R.string.LocalProfilePhotosCache), org.telegram.ui.ActionBar.h6.qj));
            }
            if (this.r > j10) {
                arrayList3.add(x6.b(8, this.r, LocaleController.getString(R.string.LocalMiscellaneousCache), org.telegram.ui.ActionBar.h6.pj));
            }
            if (this.F > j10) {
                arrayList3.add(x6.b(9, this.F, LocaleController.getString(R.string.LocalLogsCache), org.telegram.ui.ActionBar.h6.kj));
            }
            if (arrayList3.isEmpty()) {
                z11 = false;
            } else {
                Collections.sort(arrayList3, new org.telegram.ui.ActionBar.i4(5));
                ((x6) arrayList3.get(arrayList3.size() - 1)).j = true;
                if (this.P == null) {
                    this.P = new float[11];
                }
                int i10 = 0;
                while (true) {
                    fArr = this.P;
                    if (i10 >= fArr.length) {
                        break;
                    }
                    fArr[i10] = t0(i10);
                    i10++;
                }
                if (this.O == null) {
                    this.O = new int[11];
                }
                AndroidUtilities.roundPercents(fArr, this.O);
                if (arrayList3.size() > 5) {
                    arrayList2.addAll(arrayList3.subList(0, 4));
                    int i11 = 0;
                    long j11 = j10;
                    for (int i12 = 4; i12 < arrayList3.size(); i12++) {
                        ((x6) arrayList3.get(i12)).i = true;
                        j11 += ((x6) arrayList3.get(i12)).g;
                        i11 += this.O[((x6) arrayList3.get(i12)).f];
                    }
                    this.O[c10] = i11;
                    arrayList2.add(x6.b(-1, j11, LocaleController.getString(R.string.LocalOther), org.telegram.ui.ActionBar.h6.kj));
                    if (!this.M) {
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
            arrayList2.add(new x6(13, (String) null));
            String string = LocaleController.getString(R.string.StorageUsageInfo);
            x6 x6Var = new x6(1);
            x6Var.e = string;
            arrayList2.add(x6Var);
        }
        arrayList2.add(new x6(3, LocaleController.getString(R.string.AutoDeleteCachedMedia)));
        arrayList2.add(new x6(0, 0));
        arrayList2.add(new x6(1, 0));
        arrayList2.add(new x6(2, 0));
        arrayList2.add(new x6(3, 0));
        String string2 = LocaleController.getString(R.string.KeepMediaInfoPart);
        x6 x6Var2 = new x6(1);
        x6Var2.e = string2;
        arrayList2.add(x6Var2);
        if (this.I > j10) {
            arrayList2.add(new x6(3, LocaleController.getString(R.string.MaxCacheSize)));
            arrayList2.add(new x6(14));
            String string3 = LocaleController.getString(R.string.MaxCacheSizeInfo);
            x6 x6Var3 = new x6(1);
            x6Var3.e = string3;
            arrayList2.add(x6Var3);
        }
        if (z11 && (cVar = this.Y) != null && !cVar.h()) {
            arrayList2.add(new x6(8, (String) null));
        }
        a7 a7Var = this.a;
        if (a7Var != null) {
            if (z12) {
                a7Var.E(arrayList, arrayList2);
            } else {
                a7Var.l();
            }
        }
        z6 z6Var = this.N;
        if (z6Var != null) {
            z6Var.c();
        }
    }
}
