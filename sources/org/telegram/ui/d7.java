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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class d7 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public static volatile boolean h0 = false;
    public static long i0;
    public static Long j0;
    public static Long k0;
    public static Long l0;
    public long B;
    public long C;
    public long D;
    public long E;
    public long F;
    public long G;
    public final long H;
    public boolean I;
    public boolean J;
    public a7 K;
    public int[] L;
    public float[] M;
    public z6 N;
    public p6 O;
    public u6 P;
    public iv Q;
    public long R;
    public l6 S;
    public org.telegram.ui.ActionBar.g1 T;
    public org.telegram.ui.ActionBar.g1 U;
    public mh.b V;
    public final ArrayList W;
    public final ArrayList X;
    public boolean Y;
    public org.telegram.ui.ActionBar.z Z;
    public b7 a;
    public org.telegram.ui.Components.k6 a0;
    public lh.e1 b;
    public org.telegram.ui.Components.k6 b0;
    public f2.i0 c;
    public TextView c0;
    public org.telegram.ui.ActionBar.d2 d;
    public ValueAnimator d0;
    public final boolean[] e;
    public float e0;
    public long f;
    public boolean f0;
    public float g0;
    public long h;
    public long n;
    public long r;
    public long s;
    public long v;
    public long w;
    public long x;
    public long y;

    public d7() {
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
        this.B = -1L;
        this.C = -1L;
        this.D = -1L;
        this.E = -1L;
        this.F = -1L;
        this.G = -1L;
        this.H = -1L;
        this.I = true;
        this.J = true;
        this.W = new ArrayList();
        this.X = new ArrayList();
        this.g0 = 1.0f;
    }

    public static void U(d7 d7Var, boolean z4, long j10, s6 s6Var) {
        if (z4) {
            ImageLoader.getInstance().clearMemory();
        }
        try {
            org.telegram.ui.ActionBar.d2 d2Var = d7Var.d;
            if (d2Var != null) {
                d2Var.dismiss();
                d7Var.d = null;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        d7Var.getMediaDataController().ringtoneDataStore.b();
        AndroidUtilities.runOnUIThread(new gg.y1(d7Var, j10, 15), 150L);
        MediaDataController.getInstance(d7Var.currentAccount).checkAllMedia(true);
        d7Var.getFileLoader().getFileDatabase().getQueue().postRunnable(new h6(d7Var, 1));
        s6Var.run();
    }

    public static void V(d7 d7Var, boolean z4) {
        if (d7Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(d7Var.getParentActivity(), 3, null);
        d7Var.d = d2Var;
        d2Var.d0 = false;
        d2Var.q(500L);
        MessagesController.getInstance(d7Var.currentAccount).clearQueryTime();
        if (z4) {
            d7Var.getMessagesStorage().fullReset();
        } else {
            d7Var.getMessagesStorage().clearLocalDatabase();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void W(d7 d7Var, r6 r6Var, s6 s6Var) {
        int i10;
        lh.y8 y8Var;
        int i11;
        char c3;
        int i12 = 1;
        int[] iArr = {0};
        boolean[] zArr = d7Var.e;
        int i13 = 2;
        int i14 = 3;
        int i15 = (zArr[0] ? 2 : 0) + (zArr[1] ? 2 : 0) + (zArr[2] ? 2 : 0) + (zArr[3] ? 2 : 0) + (zArr[4] ? 1 : 0) + (zArr[5] ? 2 : 0) + (zArr[6] ? 1 : 0) + (zArr[7] ? 1 : 0) + (zArr[8] ? 1 : 0) + (zArr[9] ? 1 : 0);
        long currentTimeMillis = System.currentTimeMillis();
        dg.j3 j3Var = new dg.j3(r6Var, iArr, i15, 2);
        lh.y8 y8Var2 = new lh.y8(r6Var, iArr, i15, currentTimeMillis, 13);
        long j10 = 0;
        int i16 = 0;
        boolean z4 = false;
        boolean z10 = true;
        while (i16 < 10) {
            if (zArr[i16]) {
                if (i16 == 0) {
                    j10 += d7Var.y;
                    y8Var = y8Var2;
                    i11 = 9;
                    i13 = 0;
                    i14 = 0;
                } else if (i16 == i12) {
                    j10 += d7Var.B;
                    y8Var = y8Var2;
                    i11 = 9;
                    i13 = 0;
                    i14 = 2;
                } else if (i16 == i13) {
                    j10 += d7Var.s;
                    y8Var = y8Var2;
                    i11 = 9;
                    i13 = 1;
                } else if (i16 == i14) {
                    j10 += d7Var.x;
                    y8Var = y8Var2;
                    i11 = 9;
                } else if (i16 == 4) {
                    j10 += d7Var.v;
                    y8Var = y8Var2;
                    i11 = 9;
                    i13 = 0;
                    i14 = 1;
                } else if (i16 == 5) {
                    j10 += d7Var.w;
                    y8Var = y8Var2;
                    i11 = 9;
                    i13 = 0;
                    i14 = 6;
                } else if (i16 == 6) {
                    j10 += d7Var.D;
                    y8Var = y8Var2;
                    i11 = 9;
                    i13 = 0;
                    i14 = 100;
                } else {
                    i10 = 7;
                    if (i16 == 7) {
                        y8Var = y8Var2;
                        j10 += d7Var.h;
                        i11 = 9;
                        i13 = 5;
                    } else {
                        y8Var = y8Var2;
                        if (i16 == 8) {
                            j10 += d7Var.r;
                            i11 = 9;
                            i13 = 4;
                        } else {
                            i11 = 9;
                            if (i16 == 9) {
                                j10 += d7Var.C;
                                i13 = 1;
                                i14 = 0;
                            } else {
                                i13 = 0;
                                i14 = -1;
                            }
                            if (i14 != -1) {
                                if (i16 == i10) {
                                    try {
                                        k0(ApplicationLoader.getFilesDirFixed("rasterized/wallpaper").getAbsolutePath(), 0, null, null);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                }
                                File logsDir = i16 == i11 ? AndroidUtilities.getLogsDir() : i14 == 100 ? new File(FileLoader.checkDirectory(4), "acache") : FileLoader.checkDirectory(i14);
                                if (logsDir != null) {
                                    k0(logsDir.getAbsolutePath(), i13, null, j3Var);
                                }
                                iArr[0] = iArr[0] + 1;
                                y8Var.run();
                                if (i14 == 100) {
                                    File checkDirectory = FileLoader.checkDirectory(4);
                                    if (checkDirectory != null) {
                                        k0(checkDirectory.getAbsolutePath(), 3, null, j3Var);
                                    }
                                    iArr[0] = iArr[0] + 1;
                                    y8Var.run();
                                }
                                if (i14 == 0 || i14 == 2) {
                                    File checkDirectory2 = FileLoader.checkDirectory(i14 == 0 ? 100 : 101);
                                    if (checkDirectory2 != null) {
                                        k0(checkDirectory2.getAbsolutePath(), i13, null, j3Var);
                                    }
                                    c3 = 0;
                                    iArr[0] = iArr[0] + 1;
                                    y8Var.run();
                                } else {
                                    c3 = 0;
                                }
                                if (i14 == 3) {
                                    File checkDirectory3 = FileLoader.checkDirectory(5);
                                    if (checkDirectory3 != null) {
                                        k0(checkDirectory3.getAbsolutePath(), i13, null, j3Var);
                                    }
                                    iArr[c3] = iArr[c3] + 1;
                                    y8Var.run();
                                }
                                if (i16 == i11) {
                                    d7Var.C = q0(1, AndroidUtilities.getLogsDir());
                                } else if (i14 == 4) {
                                    d7Var.h = q0(5, FileLoader.checkDirectory(4));
                                    d7Var.r = q0(4, FileLoader.checkDirectory(4));
                                    z4 = true;
                                } else if (i14 == 1) {
                                    d7Var.v = q0(i13, FileLoader.checkDirectory(1));
                                } else if (i14 == 6) {
                                    d7Var.w = q0(i13, FileLoader.checkDirectory(6));
                                } else {
                                    if (i14 == 3) {
                                        if (i13 == 1) {
                                            long q02 = q0(i13, FileLoader.checkDirectory(3));
                                            d7Var.s = q02;
                                            d7Var.s = q0(i13, FileLoader.checkDirectory(5)) + q02;
                                        } else {
                                            long q03 = q0(i13, FileLoader.checkDirectory(3));
                                            d7Var.x = q03;
                                            d7Var.x = q0(i13, FileLoader.checkDirectory(5)) + q03;
                                        }
                                    } else if (i14 == 0) {
                                        long q04 = q0(i13, FileLoader.checkDirectory(0));
                                        d7Var.y = q04;
                                        d7Var.y = q0(i13, FileLoader.checkDirectory(100)) + q04;
                                        z4 = true;
                                    } else if (i14 == 2) {
                                        long q05 = q0(i13, FileLoader.checkDirectory(2));
                                        d7Var.B = q05;
                                        d7Var.B = q0(i13, FileLoader.checkDirectory(101)) + q05;
                                    } else if (i14 == 100) {
                                        d7Var.D = q0(i13, new File(FileLoader.checkDirectory(4), "acache"));
                                        long q06 = q0(3, FileLoader.checkDirectory(4));
                                        d7Var.n = q06;
                                        d7Var.D += q06;
                                        z4 = true;
                                        i16++;
                                        y8Var2 = y8Var;
                                        i12 = 1;
                                        i13 = 2;
                                        i14 = 3;
                                    }
                                    i16++;
                                    y8Var2 = y8Var;
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
                y8Var = y8Var2;
                z10 = false;
            }
            i16++;
            y8Var2 = y8Var;
            i12 = 1;
            i13 = 2;
            i14 = 3;
        }
        long j11 = d7Var.h + d7Var.r + d7Var.C + d7Var.B + d7Var.v + d7Var.y + d7Var.s + d7Var.x + d7Var.D + d7Var.w;
        j0 = Long.valueOf(j11);
        d7Var.E = j11;
        i0 = System.currentTimeMillis();
        Arrays.fill(zArr, true);
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong();
        d7Var.F = statFs.getBlockCountLong() * blockSizeLong;
        d7Var.G = availableBlocksLong * blockSizeLong;
        if (z10) {
            FileLoader.getInstance(d7Var.currentAccount).clearFilePaths();
        }
        FileLoader.getInstance(d7Var.currentAccount).checkCurrentDownloadsFiles();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.w8(d7Var, z4, j10, s6Var, 8));
    }

    public static void X(d7 d7Var, ValueAnimator valueAnimator) {
        d7Var.e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        d7Var.actionBar.setTitleColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), (int) (d7Var.e0 * 255.0f)));
        d7Var.actionBar.setBackgroundColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false), (int) (d7Var.e0 * 255.0f)));
        d7Var.fragmentView.invalidate();
    }

    public static /* synthetic */ void Y(d7 d7Var, org.telegram.ui.ActionBar.d2 d2Var) {
        FileLoader.getInstance(d7Var.currentAccount).checkCurrentDownloadsFiles();
        try {
            d2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void b0(d7 d7Var, boolean z4) {
        if (z4 != d7Var.f0) {
            ValueAnimator valueAnimator = d7Var.d0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = d7Var.e0;
            d7Var.f0 = z4;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, z4 ? 1.0f : 0.0f);
            d7Var.d0 = ofFloat;
            ofFloat.addUpdateListener(new g3(d7Var, 2));
            d7Var.d0.setInterpolator(org.telegram.ui.Components.mr.h);
            d7Var.d0.setDuration(380L);
            d7Var.d0.start();
        }
    }

    public static String c0(d7 d7Var, float f10) {
        if (f10 < 0.001f) {
            return String.format("<%.1f%%", Float.valueOf(0.1f));
        }
        float round = Math.round(f10 * 100.0f);
        return round <= 0.0f ? String.format("<%d%%", 1) : String.format("%d%%", Integer.valueOf((int) round));
    }

    public static void f0(d7 d7Var, boolean z4) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d7Var.getParentActivity());
        String string = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.O = string;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.LocalDatabaseClearText));
        spannableStringBuilder.append((CharSequence) "\n\n");
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("LocalDatabaseClearText2", R.string.LocalDatabaseClearText2, AndroidUtilities.formatFileSize(d7Var.f))));
        d2Var.Q = spannableStringBuilder;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.CacheClear), new ih.q(2, d7Var, z4));
        d7Var.showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
        }
    }

    public static void g0(d7 d7Var) {
        String formatPluralString;
        if (d7Var.V.j.size() <= 0) {
            d7Var.K.e(false);
            return;
        }
        if (d7Var.K != null) {
            if (d7Var.V.l.isEmpty()) {
                formatPluralString = LocaleController.formatPluralString("Files", d7Var.V.j.size(), Integer.valueOf(d7Var.V.j.size()));
            } else {
                ArrayList arrayList = d7Var.V.b;
                int size = arrayList.size();
                int i10 = 0;
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    w6 w6Var = (w6) obj;
                    if (d7Var.V.l.contains(Long.valueOf(w6Var.a))) {
                        i10 += w6Var.b;
                    }
                }
                int size2 = d7Var.V.j.size() - i10;
                formatPluralString = size2 > 0 ? android.support.v4.media.a.z(LocaleController.formatPluralString("Chats", d7Var.V.l.size(), Integer.valueOf(d7Var.V.l.size())), ", ", LocaleController.formatPluralString("Files", size2, Integer.valueOf(size2))) : LocaleController.formatPluralString("Chats", d7Var.V.l.size(), Integer.valueOf(d7Var.V.l.size()));
            }
            d7Var.a0.c(AndroidUtilities.formatFileSize(d7Var.V.k), !LocaleController.isRTL, true);
            d7Var.b0.c(formatPluralString, !LocaleController.isRTL, true);
            d7Var.K.e(true);
        }
    }

    public static void j0(Utilities.Callback callback) {
        Long l10 = j0;
        if (l10 != null) {
            callback.run(l10);
            if (System.currentTimeMillis() - i0 < 5000) {
                return;
            }
        }
        Utilities.cacheClearQueue.postRunnable(new yt0(callback, 15));
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
                    boolean z4 = lowerCase.endsWith(".mp3") || lowerCase.endsWith(".m4a");
                    boolean z10 = lowerCase.endsWith(".tgs") || lowerCase.endsWith(".webm");
                    boolean z11 = lowerCase.endsWith(".tmp") || lowerCase.endsWith(".temp") || lowerCase.endsWith(".preload");
                    if (z4) {
                        if (i10 == 1) {
                        }
                    }
                    if (!z4) {
                        if (i10 == 2) {
                        }
                    }
                    if (z10) {
                        if (i10 == 5) {
                        }
                    }
                    if (!z10) {
                        if (i10 == 3) {
                        }
                    }
                    if (z11) {
                        if (i10 == 5) {
                        }
                    }
                    if (!z11 && i10 == 4) {
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
                    k0(android.support.v4.media.a.z(str, "/", name), i10, iArr, callback);
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
                    boolean z4 = lowerCase.endsWith(".mp3") || lowerCase.endsWith(".m4a");
                    boolean z10 = lowerCase.endsWith(".tgs") || lowerCase.endsWith(".webm");
                    boolean z11 = lowerCase.endsWith(".tmp") || lowerCase.endsWith(".temp") || lowerCase.endsWith(".preload");
                    if (z4) {
                        if (i10 == 1) {
                        }
                    }
                    if (!z4) {
                        if (i10 == 2) {
                        }
                    }
                    if (z10) {
                        if (i10 == 5) {
                        }
                    }
                    if (!z10) {
                        if (i10 == 3) {
                        }
                    }
                    if (z11) {
                        if (i10 == 5) {
                        }
                    }
                    if (!z11 && i10 == 4) {
                    }
                }
                i11 = file2.isDirectory() ? i11 + n0(i10, str + "/" + name) : i11 + 1;
            }
        }
        return i11;
    }

    public static void p0(f5 f5Var) {
        Long l10;
        Long l11 = k0;
        if (l11 == null || (l10 = l0) == null) {
            Utilities.cacheClearQueue.postRunnable(new yt0(f5Var, 14));
        } else {
            f5Var.run(l11, l10);
        }
    }

    public static long q0(int i10, File file) {
        if (file != null && !h0) {
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

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.actionBar.setBackgroundDrawable(null);
        int i10 = 0;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(true);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        kVar.setTitleColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, i11, false), 0));
        this.actionBar.C(org.telegram.ui.ActionBar.j6.w0(null, i11, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), false);
        ai.z(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.StorageUsage));
        this.actionBar.setActionBarMenuOnItemClick(new eg.m1(this, 9));
        this.Z = this.actionBar.j(null);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Z.addView(frameLayout, k7.b6.m(1.0f, 0, -1, 72, 0, 0));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, true, true, true);
        this.a0 = k6Var;
        org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.mr.h;
        k6Var.b(0.35f, 350L, mrVar);
        this.a0.setTextSize(AndroidUtilities.dp(18.0f));
        this.a0.setTypeface(AndroidUtilities.bold());
        this.a0.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        frameLayout.addView(this.a0, k7.b6.d(-1, 18.0f, 19, 0.0f, -11.0f, 18.0f, 0.0f));
        org.telegram.ui.Components.k6 k6Var2 = new org.telegram.ui.Components.k6(context, true, true, true);
        this.b0 = k6Var2;
        k6Var2.b(0.35f, 350L, mrVar);
        this.b0.setTextSize(AndroidUtilities.dp(14.0f));
        this.b0.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.y6, false));
        frameLayout.addView(this.b0, k7.b6.d(-1, 18.0f, 19, 0.0f, 10.0f, 18.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c0 = textView;
        textView.setTextSize(1, 14.0f);
        this.c0.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        this.c0.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
        this.c0.setBackground(org.telegram.ui.ActionBar.z5.f(new float[]{6.0f}, org.telegram.ui.ActionBar.j6.Oh));
        this.c0.setTypeface(AndroidUtilities.bold());
        this.c0.setGravity(17);
        this.c0.setText(LocaleController.getString(R.string.CacheClear));
        this.c0.setOnClickListener(new a(this, 5));
        if (LocaleController.isRTL) {
            frameLayout.addView(this.c0, k7.b6.d(-2, 28.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            frameLayout.addView(this.c0, k7.b6.d(-2, 28.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        }
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(2, R.drawable.ic_ab_other);
        int i12 = 3;
        org.telegram.ui.ActionBar.g1 e = a2.e(3, R.drawable.msg_delete, LocaleController.getString(R.string.ClearLocalDatabase));
        this.T = e;
        int i13 = org.telegram.ui.ActionBar.j6.p7;
        e.setIconColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        org.telegram.ui.ActionBar.g1 g1Var = this.T;
        int i14 = org.telegram.ui.ActionBar.j6.q7;
        g1Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        this.T.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(null, i13, false)));
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            org.telegram.ui.ActionBar.g1 e6 = a2.e(4, R.drawable.msg_delete, "Full Reset Database");
            this.U = e6;
            e6.setIconColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
            this.U.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
            this.U.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(null, i13, false)));
        }
        if (this.T != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ClearLocalDatabase));
            this.T.setText(spannableStringBuilder);
        }
        this.a = new b7(this, context);
        l6 l6Var = new l6(this, context);
        this.S = l6Var;
        this.fragmentView = l6Var;
        l6Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
        lh.e1 e1Var = new lh.e1(this, context, i12);
        this.b = e1Var;
        e1Var.o1();
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setPadding(0, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) + AndroidUtilities.statusBarHeight, 0, 0);
        this.b.setClipToPadding(false);
        lh.e1 e1Var2 = this.b;
        f2.i0 i0Var = new f2.i0(1, false);
        this.c = i0Var;
        e1Var2.setLayoutManager(i0Var);
        l6Var.addView(this.b, k7.b6.c(-1.0f, -1));
        this.b.setAdapter(this.a);
        m6 m6Var = new m6(this);
        m6Var.n(350L);
        m6Var.o(mrVar);
        m6Var.C = false;
        m6Var.m = false;
        this.b.setItemAnimator(m6Var);
        this.b.setOnItemClickListener(new g6(this));
        this.b.j(new n6(this, i10));
        l6Var.addView(this.actionBar, k7.b6.c(-2.0f, -1));
        this.S.setTargetListView(this.b);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didClearDatabase) {
            try {
                org.telegram.ui.ActionBar.d2 d2Var = this.d;
                if (d2Var != null) {
                    d2Var.dismiss();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            this.d = null;
            if (this.a != null) {
                this.f = MessagesStorage.getInstance(this.currentAccount).getDatabaseSize();
                if (this.T != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ClearLocalDatabase));
                    this.T.setText(spannableStringBuilder);
                }
                w0(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        f fVar = new f(this, 1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 16, new Class[]{org.telegram.ui.Cells.z9.class, org.telegram.ui.Components.uv0.class, org.telegram.ui.Components.hy0.class, org.telegram.ui.Cells.l4.class}, null, null, null, org.telegram.ui.ActionBar.j6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.z9.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.I6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.z9.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Components.hy0.class}, new String[]{"paintFill"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Ti));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Components.hy0.class}, new String[]{"paintProgress"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Vi));
        int i12 = org.telegram.ui.ActionBar.j6.y6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Components.hy0.class}, new String[]{"telegramCacheTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Components.hy0.class}, new String[]{"freeSizeTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Components.hy0.class}, new String[]{"calculationgTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Components.uv0.class}, null, null, null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Components.uv0.class}, null, null, null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Components.uv0.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.y1.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.y1.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.y1.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Components.fy0.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.hj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.ij));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.jj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.kj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.lj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.mj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.nj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.oj));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isLightStatusBar() {
        return !this.Y ? super.isLightStatusBar() : AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false)) > 0.721f;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        a7 a7Var = this.K;
        if (a7Var == null || motionEvent == null) {
            return true;
        }
        Rect rect = AndroidUtilities.rectTmp2;
        a7Var.getHitRect(rect);
        return !rect.contains((int) motionEvent.getX(), ((int) motionEvent.getY()) - this.actionBar.getMeasuredHeight()) || this.K.h.b == 0;
    }

    public final void l0(w6 w6Var, org.telegram.ui.Components.ey0[] ey0VarArr, mh.b bVar) {
        x6 x6Var;
        HashSet hashSet;
        long j10;
        org.telegram.ui.Components.ey0 ey0Var;
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(getParentActivity(), 3, null);
        d2Var.d0 = false;
        d2Var.q(500L);
        HashSet hashSet2 = new HashSet();
        long j11 = this.E;
        int i10 = 0;
        while (i10 < 8) {
            if ((ey0VarArr == null || ((ey0Var = ey0VarArr[i10]) != null && ey0Var.c)) && (x6Var = (x6) w6Var.d.get(i10)) != null) {
                ArrayList arrayList = x6Var.b;
                hashSet2.addAll(arrayList);
                hashSet = hashSet2;
                long j12 = w6Var.c;
                j10 = j11;
                long j13 = x6Var.a;
                w6Var.c = j12 - j13;
                this.E -= j13;
                this.G += j13;
                w6Var.d.delete(i10);
                if (i10 == 0) {
                    this.y -= x6Var.a;
                } else if (i10 == 1) {
                    this.B -= x6Var.a;
                } else if (i10 == 2) {
                    this.s -= x6Var.a;
                } else if (i10 == 3) {
                    this.x -= x6Var.a;
                } else if (i10 == 4) {
                    this.v -= x6Var.a;
                } else if (i10 == 5) {
                    this.D -= x6Var.a;
                } else if (i10 == 7) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        mh.a aVar = (mh.a) arrayList.get(i11);
                        String absolutePath = ((mh.a) arrayList.get(i11)).a.getAbsolutePath();
                        char c3 = 6;
                        if (s0(6, absolutePath)) {
                            c3 = 7;
                        } else if (s0(0, absolutePath) || s0(100, absolutePath)) {
                            c3 = 0;
                        } else if (s0(2, absolutePath) || s0(101, absolutePath)) {
                            c3 = 1;
                        }
                        if (c3 == 7) {
                            this.w -= aVar.c;
                        } else if (c3 == 0) {
                            this.y -= aVar.c;
                        } else if (c3 == 1) {
                            this.B -= aVar.c;
                        } else {
                            this.h -= aVar.c;
                        }
                    }
                } else {
                    this.h -= x6Var.a;
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
            this.V.b.remove(w6Var);
        }
        w0(true);
        if (bVar != null) {
            Iterator it = bVar.j.iterator();
            while (it.hasNext()) {
                mh.a aVar2 = (mh.a) it.next();
                HashSet hashSet4 = hashSet3;
                if (!hashSet4.contains(aVar2)) {
                    long j15 = this.E;
                    long j16 = aVar2.c;
                    this.E = j15 - j16;
                    this.G += j16;
                    hashSet4.add(aVar2);
                    w6Var.b(aVar2);
                    int i12 = aVar2.d;
                    if (i12 == 0) {
                        this.y -= aVar2.c;
                    } else if (i12 == 1) {
                        this.B -= aVar2.c;
                    } else if (i12 == 2) {
                        this.s -= aVar2.c;
                    } else if (i12 == 3) {
                        this.x -= aVar2.c;
                    } else if (i12 == 4) {
                        this.v -= aVar2.c;
                    }
                }
                hashSet3 = hashSet4;
            }
        }
        HashSet hashSet5 = hashSet3;
        Iterator it2 = hashSet5.iterator();
        while (it2.hasNext()) {
            mh.a aVar3 = (mh.a) it2.next();
            mh.b bVar2 = this.V;
            if (bVar2.j.remove(aVar3)) {
                bVar2.k -= aVar3.c;
            }
            ArrayList e = bVar2.e(aVar3.d);
            if (e != null) {
                e.remove(aVar3);
            }
        }
        org.telegram.ui.Components.ic Q = org.telegram.ui.Components.qc.a0(this).Q(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j14 - this.E)));
        Q.r = false;
        Q.j();
        ArrayList arrayList2 = new ArrayList(hashSet5);
        getFileLoader().getFileDatabase().removeFiles(arrayList2);
        getFileLoader().cancelLoadAllFiles();
        getFileLoader().getFileLoaderQueue().postRunnable(new u1(this, arrayList2, d2Var, 3));
    }

    public final void m0() {
        if (this.V.j.size() == 0 || getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.O = LocaleController.getString(R.string.ClearCache);
        alertDialog$Builder.a.Q = LocaleController.getString(R.string.ClearCacheForChats);
        alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new g6(this));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final void o0(File file, int i10, LongSparseArray longSparseArray, mh.b bVar) {
        File[] listFiles;
        if (file != null && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (h0) {
                    break;
                }
                if (file2.isDirectory()) {
                    o0(file2, i10, longSparseArray, bVar);
                } else if (!file2.getName().equals(".nomedia")) {
                    FilePathDatabase.FileMeta fileDialogId = getFileLoader().getFileDatabase().getFileDialogId(file2, null);
                    String lowerCase = file2.getName().toLowerCase();
                    int i11 = (lowerCase.endsWith(".mp3") || lowerCase.endsWith(".m4a")) ? 3 : i10;
                    mh.a aVar = new mh.a(file2);
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

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z4) {
        mh.b bVar = this.V;
        if (bVar == null || bVar.j.isEmpty()) {
            return super.onBackPressed(z4);
        }
        if (z4) {
            this.V.d();
            a7 a7Var = this.K;
            if (a7Var != null) {
                a7Var.e(false);
                this.K.d();
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        h0 = false;
        getNotificationCenter().addObserver(this, NotificationCenter.didClearDatabase);
        this.f = MessagesStorage.getInstance(this.currentAccount).getDatabaseSize();
        Utilities.globalQueue.postRunnable(new h6(this, 2));
        this.R = System.currentTimeMillis();
        w0(false);
        v0();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.didClearDatabase);
        try {
            org.telegram.ui.ActionBar.d2 d2Var = this.d;
            if (d2Var != null) {
                d2Var.dismiss();
            }
        } catch (Exception unused) {
        }
        this.d = null;
        h0 = true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.b.setPadding(0, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) + AndroidUtilities.statusBarHeight, 0, i13);
        this.b.setClipToPadding(false);
    }

    @Override // org.telegram.ui.ActionBar.p2
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

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        this.a.l();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationProgress(boolean z4, float f10) {
        if (f10 > 0.5f && !this.Y) {
            this.Y = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        super.onTransitionAnimationProgress(z4, f10);
    }

    public final boolean r0() {
        int i10;
        boolean[] zArr = this.e;
        int length = zArr.length;
        boolean[] zArr2 = new boolean[length];
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.X;
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

    public final long t0(int i10) {
        switch (i10) {
            case 0:
                return this.y;
            case 1:
                return this.B;
            case 2:
                return this.s;
            case 3:
                return this.x;
            case 4:
                return this.v;
            case 5:
                return this.w;
            case 6:
                return this.D;
            case 7:
                return this.h;
            case 8:
                return this.r;
            case 9:
                return this.C;
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
        ArrayList arrayList = this.X;
        if (r02) {
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
        if (this.J) {
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
                    zArr[i15] = !r02;
                }
            }
        } else {
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                y6 y6Var3 = (y6) arrayList.get(i16);
                if (y6Var3.a == 11 && y6Var3.i && (i10 = y6Var3.f) >= 0) {
                    zArr[i10] = !r02;
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
                            ((org.telegram.ui.Cells.y1) childAt).c(!r02, true);
                        } else {
                            ((org.telegram.ui.Cells.y1) childAt).c(zArr[i18], true);
                        }
                    }
                }
            }
        }
        v0();
    }

    public final void v0() {
        z6 z6Var = this.N;
        boolean z4 = false;
        if (z6Var != null) {
            boolean z10 = this.I;
            if (!z10 && this.E > 0) {
                org.telegram.ui.Components.vc[] vcVarArr = new org.telegram.ui.Components.vc[11];
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.X;
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    y6 y6Var = (y6) arrayList.get(i10);
                    if (y6Var.a == 11) {
                        int i11 = y6Var.f;
                        boolean[] zArr = this.e;
                        if (i11 >= 0) {
                            long j10 = y6Var.g;
                            boolean z11 = zArr[i11];
                            org.telegram.ui.Components.vc vcVar = new org.telegram.ui.Components.vc();
                            vcVar.c = j10;
                            vcVar.b = z11;
                            vcVarArr[i11] = vcVar;
                        } else if (this.J) {
                            long j11 = y6Var.g;
                            boolean z12 = zArr[10];
                            org.telegram.ui.Components.vc vcVar2 = new org.telegram.ui.Components.vc();
                            vcVar2.c = j11;
                            vcVar2.b = z12;
                            vcVarArr[10] = vcVar2;
                        }
                    }
                    i10++;
                }
                if (System.currentTimeMillis() - this.R < 80) {
                    this.N.n.d(0.0f, true);
                }
                this.N.f(this.E, true, vcVarArr);
            } else if (z10) {
                z6Var.f(-1L, true, new org.telegram.ui.Components.vc[0]);
            } else {
                z6Var.f(0L, true, new org.telegram.ui.Components.vc[0]);
            }
        }
        u6 u6Var = this.P;
        if (u6Var == null || this.I) {
            return;
        }
        d7 d7Var = u6Var.d;
        boolean[] zArr2 = d7Var.e;
        long j12 = (zArr2[0] ? d7Var.y : 0L) + (zArr2[1] ? d7Var.B : 0L) + (zArr2[2] ? d7Var.s : 0L) + (zArr2[3] ? d7Var.x : 0L) + (zArr2[4] ? d7Var.v : 0L) + (zArr2[5] ? d7Var.w : 0L) + (zArr2[6] ? d7Var.D : 0L) + (zArr2[7] ? d7Var.h : 0L) + (zArr2[8] ? d7Var.r : 0L) + (zArr2[9] ? d7Var.C : 0L);
        ArrayList arrayList2 = d7Var.X;
        int i12 = 0;
        while (true) {
            if (i12 >= arrayList2.size()) {
                z4 = true;
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
        u6Var.a(j12, z4);
    }

    public final void w0(boolean z4) {
        char c3;
        long j10;
        boolean z10;
        float[] fArr;
        mh.b bVar;
        boolean z11 = (!z4 || System.currentTimeMillis() - this.R >= 80) ? z4 : false;
        ArrayList arrayList = this.W;
        arrayList.clear();
        ArrayList arrayList2 = this.X;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.add(new y6(9, (String) null));
        arrayList2.add(new y6(10, (String) null));
        arrayList2.size();
        if (this.I) {
            arrayList2.add(new y6(12, (String) null));
            arrayList2.add(new y6(12, (String) null));
            arrayList2.add(new y6(12, (String) null));
            arrayList2.add(new y6(12, (String) null));
            arrayList2.add(new y6(12, (String) null));
            z10 = true;
            j10 = 0;
        } else {
            ArrayList arrayList3 = new ArrayList();
            if (this.y > 0) {
                c3 = '\n';
                arrayList3.add(y6.b(0, this.y, LocaleController.getString(R.string.LocalPhotoCache), org.telegram.ui.ActionBar.j6.lj));
            } else {
                c3 = '\n';
            }
            if (this.B > 0) {
                arrayList3.add(y6.b(1, this.B, LocaleController.getString(R.string.LocalVideoCache), org.telegram.ui.ActionBar.j6.hj));
            }
            if (this.s > 0) {
                arrayList3.add(y6.b(2, this.s, LocaleController.getString(R.string.LocalDocumentCache), org.telegram.ui.ActionBar.j6.ij));
            }
            if (this.x > 0) {
                arrayList3.add(y6.b(3, this.x, LocaleController.getString(R.string.LocalMusicCache), org.telegram.ui.ActionBar.j6.pj));
            }
            if (this.v > 0) {
                arrayList3.add(y6.b(4, this.v, LocaleController.getString(R.string.LocalAudioCache), org.telegram.ui.ActionBar.j6.mj));
            }
            if (this.w > 0) {
                j10 = 0;
                arrayList3.add(y6.b(5, this.w, LocaleController.getString(R.string.LocalStoriesCache), org.telegram.ui.ActionBar.j6.jj));
            } else {
                j10 = 0;
            }
            if (this.D > j10) {
                arrayList3.add(y6.b(6, this.D, LocaleController.getString(R.string.LocalStickersCache), org.telegram.ui.ActionBar.j6.nj));
            }
            if (this.h > j10) {
                arrayList3.add(y6.b(7, this.h, LocaleController.getString(R.string.LocalProfilePhotosCache), org.telegram.ui.ActionBar.j6.qj));
            }
            if (this.r > j10) {
                arrayList3.add(y6.b(8, this.r, LocaleController.getString(R.string.LocalMiscellaneousCache), org.telegram.ui.ActionBar.j6.pj));
            }
            if (this.C > j10) {
                arrayList3.add(y6.b(9, this.C, LocaleController.getString(R.string.LocalLogsCache), org.telegram.ui.ActionBar.j6.kj));
            }
            if (arrayList3.isEmpty()) {
                z10 = false;
            } else {
                Collections.sort(arrayList3, new nh.e4(9));
                ((y6) arrayList3.get(arrayList3.size() - 1)).j = true;
                if (this.M == null) {
                    this.M = new float[11];
                }
                int i10 = 0;
                while (true) {
                    fArr = this.M;
                    if (i10 >= fArr.length) {
                        break;
                    }
                    fArr[i10] = t0(i10);
                    i10++;
                }
                if (this.L == null) {
                    this.L = new int[11];
                }
                AndroidUtilities.roundPercents(fArr, this.L);
                if (arrayList3.size() > 5) {
                    arrayList2.addAll(arrayList3.subList(0, 4));
                    long j11 = j10;
                    int i11 = 0;
                    for (int i12 = 4; i12 < arrayList3.size(); i12++) {
                        ((y6) arrayList3.get(i12)).i = true;
                        j11 += ((y6) arrayList3.get(i12)).g;
                        i11 += this.L[((y6) arrayList3.get(i12)).f];
                    }
                    this.L[c3] = i11;
                    arrayList2.add(y6.b(-1, j11, LocaleController.getString(R.string.LocalOther), org.telegram.ui.ActionBar.j6.kj));
                    if (!this.J) {
                        arrayList2.addAll(arrayList3.subList(4, arrayList3.size()));
                    }
                } else {
                    arrayList2.addAll(arrayList3);
                }
                z10 = true;
            }
        }
        if (z10) {
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
        if (this.F > j10) {
            arrayList2.add(new y6(3, LocaleController.getString(R.string.MaxCacheSize)));
            arrayList2.add(new y6(14));
            String string3 = LocaleController.getString(R.string.MaxCacheSizeInfo);
            y6 y6Var3 = new y6(1);
            y6Var3.e = string3;
            arrayList2.add(y6Var3);
        }
        if (z10 && (bVar = this.V) != null && !bVar.h()) {
            arrayList2.add(new y6(8, (String) null));
        }
        b7 b7Var = this.a;
        if (b7Var != null) {
            if (z11) {
                b7Var.E(arrayList, arrayList2);
            } else {
                b7Var.l();
            }
        }
        a7 a7Var = this.K;
        if (a7Var != null) {
            a7Var.c();
        }
    }
}
