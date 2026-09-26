package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.mc0;
import org.telegram.ui.Components.v9;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class g6 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public TLRPC.TL_theme F;
    public boolean G;
    public String H;
    public String I;
    public TLRPC.InputFile J;
    public TLRPC.InputFile K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public boolean U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public String a;
    public SparseArray a0;
    public String b;
    public ArrayList b0;
    public String c;
    public LongSparseArray c0;
    public String d;
    public final LongSparseArray d0;
    public String e;
    public int e0;
    public boolean f;
    public int f0;
    public String g0;
    public boolean h;
    public String h0;
    public z5 i0;
    public int j0;
    public boolean n;
    public int r;
    public int s;
    public int v;
    public int w;
    public int x;
    public int y;

    public g6() {
        this.x = 45;
        this.G = true;
        this.U = true;
        this.Z = -1;
        this.d0 = new LongSparseArray();
        this.e0 = 0;
        this.f0 = 100;
        this.j0 = -1;
    }

    public static boolean a(f6 f6Var, TLRPC.ThemeSettings themeSettings) {
        boolean z10;
        boolean z11;
        long j3;
        long j10;
        long j11;
        String str;
        int i10;
        int i11;
        float f7;
        TLRPC.WallPaperSettings wallPaperSettings;
        int intValue = themeSettings.message_colors.size() > 0 ? themeSettings.message_colors.get(0).intValue() | (-16777216) : 0;
        int intValue2 = themeSettings.message_colors.size() > 1 ? themeSettings.message_colors.get(1).intValue() | (-16777216) : 0;
        if (intValue == intValue2) {
            intValue2 = 0;
        }
        int intValue3 = themeSettings.message_colors.size() > 2 ? themeSettings.message_colors.get(2).intValue() | (-16777216) : 0;
        int intValue4 = themeSettings.message_colors.size() > 3 ? (-16777216) | themeSettings.message_colors.get(3).intValue() : 0;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null) {
            z10 = false;
            z11 = true;
            j3 = 0;
            j10 = 0;
            j11 = 0;
            str = null;
            i10 = 0;
            i11 = 0;
        } else {
            i10 = h6.X0(wallPaperSettings.background_color);
            j3 = themeSettings.wallpaper.settings.second_background_color == 0 ? 4294967296L : h6.X0(r11);
            j10 = themeSettings.wallpaper.settings.third_background_color == 0 ? 4294967296L : h6.X0(r11);
            j11 = themeSettings.wallpaper.settings.fourth_background_color != 0 ? h6.X0(r11) : 4294967296L;
            i11 = AndroidUtilities.getWallpaperRotation(themeSettings.wallpaper.settings.rotation, false);
            z10 = false;
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            z11 = true;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                str = wallPaper2.slug;
                f7 = wallPaper2.settings.intensity / 100.0f;
                return (themeSettings.accent_color != f6Var.c && themeSettings.outbox_accent_color == f6Var.d && intValue == f6Var.e && intValue2 == f6Var.f && intValue3 == f6Var.g && intValue4 == f6Var.h && themeSettings.message_colors_animated == f6Var.i && ((long) i10) == f6Var.j && j3 == f6Var.k && j10 == f6Var.l && j11 == f6Var.m && i11 == f6Var.n && TextUtils.equals(str, f6Var.o) && ((double) Math.abs(f7 - f6Var.p)) < 0.001d) ? z11 : z10;
            }
            str = null;
        }
        f7 = 0.0f;
        if (themeSettings.accent_color != f6Var.c) {
        }
    }

    public static void b(g6 g6Var, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, String[] strArr, int[] iArr9, int[] iArr10) {
        g6Var.W = iArr.length;
        g6Var.b0 = new ArrayList();
        g6Var.a0 = new SparseArray();
        g6Var.c0 = new LongSparseArray();
        for (int i10 = 0; i10 < iArr.length; i10++) {
            f6 f6Var = new f6();
            f6Var.a = iArr8[i10];
            if (h6.g1(f6Var)) {
                f6Var.z = true;
            }
            f6Var.c = iArr[i10];
            f6Var.b = g6Var;
            f6Var.e = iArr2[i10];
            f6Var.f = iArr3[i10];
            long j3 = iArr4[i10];
            f6Var.j = j3;
            boolean z10 = g6Var.S;
            if (z10 && f6Var.a == h6.n) {
                f6Var.j = 4294967296L;
            } else {
                f6Var.j = j3;
            }
            if (z10 && f6Var.a == h6.n) {
                f6Var.k = 4294967296L;
            } else {
                f6Var.k = iArr5[i10];
            }
            if (iArr6 != null) {
                if (z10 && f6Var.a == h6.n) {
                    f6Var.l = 4294967296L;
                } else {
                    f6Var.l = iArr6[i10];
                }
            }
            if (iArr7 != null) {
                if (z10 && f6Var.a == h6.n) {
                    f6Var.m = 4294967296L;
                } else {
                    f6Var.m = iArr7[i10];
                }
            }
            f6Var.p = iArr10[i10] / 100.0f;
            f6Var.n = iArr9[i10];
            f6Var.o = strArr[i10];
            if ((h6.g1(f6Var) && g6Var.a.equals("Dark Blue")) || g6Var.a.equals("Night")) {
                f6Var.e = -14316059;
                f6Var.f = -12422433;
                f6Var.g = -8304937;
                f6Var.h = -6340950;
                if (g6Var.a.equals("Night")) {
                    f6Var.p = -0.57f;
                    f6Var.j = -9666650L;
                    f6Var.k = -13749173L;
                    f6Var.l = -8883033L;
                    f6Var.m = -13421992L;
                }
            }
            g6Var.a0.put(f6Var.a, f6Var);
            g6Var.b0.add(f6Var);
        }
        g6Var.X = ((f6) g6Var.a0.get(0)).c;
    }

    public static void c(g6 g6Var, SharedPreferences sharedPreferences) {
        ArrayList arrayList = g6Var.b0;
        if (arrayList == null || arrayList.isEmpty()) {
            g6Var.r(sharedPreferences, null, a4.a.t(new StringBuilder(), g6Var.a, "_owp"));
            return;
        }
        int size = g6Var.b0.size();
        for (int i10 = 0; i10 < size; i10++) {
            f6 f6Var = (f6) g6Var.b0.get(i10);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(g6Var.a);
            sb2.append("_");
            g6Var.r(sharedPreferences, f6Var, a4.a.o(f6Var.a, "_owp", sb2));
        }
    }

    public static g6 g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            g6 g6Var = new g6();
            g6Var.a = jSONObject.getString("name");
            g6Var.b = jSONObject.getString("path");
            if (jSONObject.has("account")) {
                g6Var.E = jSONObject.getInt("account");
            }
            if (jSONObject.has("info")) {
                try {
                    SerializedData serializedData = new SerializedData(Utilities.hexToBytes(jSONObject.getString("info")));
                    g6Var.F = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (jSONObject.has("loaded")) {
                g6Var.G = jSONObject.getBoolean("loaded");
            }
            return g6Var;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static g6 h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("\\|");
        if (split.length != 2) {
            return null;
        }
        g6 g6Var = new g6();
        g6Var.a = split[0];
        g6Var.b = split[1];
        return g6Var;
    }

    public static void i(f6 f6Var, TLRPC.ThemeSettings themeSettings) {
        TLRPC.WallPaperSettings wallPaperSettings;
        f6Var.c = themeSettings.accent_color;
        f6Var.d = themeSettings.outbox_accent_color;
        f6Var.e = themeSettings.message_colors.size() > 0 ? themeSettings.message_colors.get(0).intValue() | (-16777216) : 0;
        int intValue = themeSettings.message_colors.size() > 1 ? themeSettings.message_colors.get(1).intValue() | (-16777216) : 0;
        f6Var.f = intValue;
        if (f6Var.e == intValue) {
            f6Var.f = 0;
        }
        f6Var.g = themeSettings.message_colors.size() > 2 ? themeSettings.message_colors.get(2).intValue() | (-16777216) : 0;
        f6Var.h = themeSettings.message_colors.size() > 3 ? themeSettings.message_colors.get(3).intValue() | (-16777216) : 0;
        f6Var.i = themeSettings.message_colors_animated;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null) {
            return;
        }
        if (wallPaperSettings.background_color == 0) {
            f6Var.j = 4294967296L;
        } else {
            f6Var.j = h6.X0(r0);
        }
        TLRPC.WallPaperSettings wallPaperSettings2 = themeSettings.wallpaper.settings;
        if ((wallPaperSettings2.flags & 16) == 0 || wallPaperSettings2.second_background_color != 0) {
            f6Var.k = h6.X0(wallPaperSettings2.second_background_color);
        } else {
            f6Var.k = 4294967296L;
        }
        TLRPC.WallPaperSettings wallPaperSettings3 = themeSettings.wallpaper.settings;
        if ((wallPaperSettings3.flags & 32) == 0 || wallPaperSettings3.third_background_color != 0) {
            f6Var.l = h6.X0(wallPaperSettings3.third_background_color);
        } else {
            f6Var.l = 4294967296L;
        }
        TLRPC.WallPaperSettings wallPaperSettings4 = themeSettings.wallpaper.settings;
        if ((wallPaperSettings4.flags & 64) == 0 || wallPaperSettings4.fourth_background_color != 0) {
            f6Var.m = h6.X0(wallPaperSettings4.fourth_background_color);
        } else {
            f6Var.m = 4294967296L;
        }
        f6Var.n = AndroidUtilities.getWallpaperRotation(themeSettings.wallpaper.settings.rotation, false);
        TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
        if ((wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) || !wallPaper2.pattern) {
            return;
        }
        f6Var.o = wallPaper2.slug;
        TLRPC.WallPaperSettings wallPaperSettings5 = wallPaper2.settings;
        f6Var.p = wallPaperSettings5.intensity / 100.0f;
        f6Var.q = wallPaperSettings5.motion;
    }

    public final boolean d(File file, String str) {
        int patternColor;
        try {
            Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(AndroidUtilities.dp(640.0f), AndroidUtilities.dp(360.0f), file.getAbsolutePath(), null, 0);
            if (scaledBitmap != null && this.r != 0) {
                Bitmap createBitmap = Bitmap.createBitmap(scaledBitmap.getWidth(), scaledBitmap.getHeight(), scaledBitmap.getConfig());
                Canvas canvas = new Canvas(createBitmap);
                int i10 = this.v;
                if (i10 != 0) {
                    patternColor = mc0.g(this.r, this.s, i10, this.w);
                } else {
                    int i11 = this.s;
                    if (i11 != 0) {
                        patternColor = AndroidUtilities.getAverageColor(this.r, i11);
                        GradientDrawable gradientDrawable = new GradientDrawable(v9.d(this.x), new int[]{this.r, this.s});
                        gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        gradientDrawable.draw(canvas);
                    } else {
                        patternColor = AndroidUtilities.getPatternColor(this.r);
                        canvas.drawColor(this.r);
                    }
                }
                Paint paint = new Paint(2);
                paint.setColorFilter(new PorterDuffColorFilter(patternColor, PorterDuff.Mode.SRC_IN));
                paint.setAlpha((int) ((this.y / 100.0f) * 255.0f));
                canvas.drawBitmap(scaledBitmap, 0.0f, 0.0f, paint);
                canvas.setBitmap(null);
                scaledBitmap = createBitmap;
            }
            if (this.h) {
                scaledBitmap = Utilities.blurWallpaper(scaledBitmap);
            }
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            scaledBitmap.compress(this.v != 0 ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
            fileOutputStream.close();
            return true;
        } catch (Throwable th2) {
            FileLog.e(th2);
            return false;
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.fileLoaded;
        if (i10 == i12 || i10 == NotificationCenter.fileLoadFailed) {
            String str = (String) objArr[0];
            TLRPC.TL_theme tL_theme = this.F;
            if (tL_theme == null || tL_theme.document == null) {
                return;
            }
            if (str.equals(this.g0)) {
                this.g0 = null;
                Utilities.globalQueue.postRunnable(new a6(1, this, (File) objArr[1]));
                return;
            }
            if (str.equals(FileLoader.getAttachFileName(this.F.document))) {
                t();
                if (i10 == i12) {
                    File file = new File(this.b);
                    TLRPC.TL_theme tL_theme2 = this.F;
                    g6 k02 = h6.k0(file, tL_theme2.title, tL_theme2);
                    if (k02 == null || k02.c == null || new File(k02.c).exists()) {
                        s();
                        return;
                    }
                    this.r = k02.r;
                    this.s = k02.s;
                    this.v = k02.v;
                    this.w = k02.w;
                    this.x = k02.x;
                    this.h = k02.h;
                    this.y = k02.y;
                    this.h0 = k02.c;
                    TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                    tL_inputWallPaperSlug.slug = k02.e;
                    getwallpaper.wallpaper = tL_inputWallPaperSlug;
                    ConnectionsManager.getInstance(k02.E).sendRequest(getwallpaper, new ai.v1(21, this, k02));
                }
            }
        }
    }

    public final f6 e(long j3, TLRPC.ThemeSettings themeSettings, TLRPC.TL_theme tL_theme, int i10, boolean z10) {
        if (z10) {
            LongSparseArray longSparseArray = this.d0;
            f6 f6Var = (f6) longSparseArray.get(j3);
            if (f6Var != null) {
                return f6Var;
            }
            int i11 = this.e0 + 1;
            this.e0 = i11;
            f6 f6Var2 = new f6();
            i(f6Var2, themeSettings);
            f6Var2.b = this;
            f6Var2.a = i11;
            f6Var2.r = tL_theme;
            f6Var2.t = i10;
            longSparseArray.put(i11, f6Var2);
            return f6Var2;
        }
        f6 f6Var3 = (f6) this.c0.get(j3);
        if (f6Var3 != null) {
            return f6Var3;
        }
        int i12 = this.f0 + 1;
        this.f0 = i12;
        f6 f6Var4 = new f6();
        i(f6Var4, themeSettings);
        f6Var4.b = this;
        f6Var4.a = i12;
        f6Var4.r = tL_theme;
        f6Var4.t = i10;
        this.a0.put(i12, f6Var4);
        this.b0.add(0, f6Var4);
        h6.D1(this);
        this.c0.put(j3, f6Var4);
        return f6Var4;
    }

    public final f6 f(TLRPC.TL_theme tL_theme, int i10, int i11) {
        if (tL_theme == null) {
            return null;
        }
        return e(tL_theme.id, i11 < tL_theme.settings.size() ? tL_theme.settings.get(i11) : null, tL_theme, i10, false);
    }

    public final String j(f6 f6Var, boolean z10) {
        String o9;
        if (f6Var == null) {
            f6Var = k(false);
        }
        if (f6Var == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z10 ? a4.a.t(new StringBuilder(), this.a, "_wp_o") : a4.a.t(new StringBuilder(), this.a, "_wp"));
            sb2.append(Utilities.random.nextInt());
            sb2.append(".jpg");
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        if (z10) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.a);
            sb4.append("_");
            o9 = a4.a.o(f6Var.a, "_wp_o", sb4);
        } else {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(this.a);
            sb5.append("_");
            o9 = a4.a.o(f6Var.a, "_wp", sb5);
        }
        sb3.append(o9);
        sb3.append(Utilities.random.nextInt());
        sb3.append(".jpg");
        return sb3.toString();
    }

    public final f6 k(boolean z10) {
        f6 f6Var;
        if (this.b0 == null || (f6Var = (f6) this.a0.get(this.Y)) == null) {
            return null;
        }
        if (!z10) {
            return f6Var;
        }
        int i10 = this.f0 + 1;
        this.f0 = i10;
        f6 f6Var2 = new f6();
        f6Var2.c = f6Var.c;
        f6Var2.d = f6Var.d;
        f6Var2.e = f6Var.e;
        f6Var2.f = f6Var.f;
        f6Var2.g = f6Var.g;
        f6Var2.h = f6Var.h;
        f6Var2.i = f6Var.i;
        f6Var2.j = f6Var.j;
        f6Var2.k = f6Var.k;
        f6Var2.l = f6Var.l;
        f6Var2.m = f6Var.m;
        f6Var2.n = f6Var.n;
        f6Var2.o = f6Var.o;
        f6Var2.p = f6Var.p;
        f6Var2.q = f6Var.q;
        f6Var2.b = this;
        z5 z5Var = this.i0;
        if (z5Var != null) {
            z5 z5Var2 = new z5();
            z5Var2.a = "";
            z5Var2.b = "";
            z5Var2.c = "";
            z5Var2.c = z5Var.c;
            z5Var2.d = z5Var.d;
            z5Var2.e = z5Var.e;
            z5Var2.f = z5Var.f;
            z5Var2.g = z5Var.g;
            z5Var2.h = z5Var.h;
            z5Var2.i = z5Var.i;
            z5Var2.j = z5Var.j;
            z5Var2.k = z5Var.k;
            z5Var2.p = this;
            z5Var2.q = f6Var2;
            if (TextUtils.isEmpty(z5Var.a)) {
                z5Var2.a = "";
            } else {
                try {
                    File file = new File(ApplicationLoader.getFilesDirFixed(), z5Var.a);
                    File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                    String j3 = z5Var2.p.j(z5Var2.q, false);
                    z5Var2.a = j3;
                    AndroidUtilities.copyFile(file, new File(filesDirFixed, j3));
                } catch (Exception e) {
                    z5Var2.a = "";
                    FileLog.e(e);
                }
            }
            if (TextUtils.isEmpty(z5Var.b)) {
                z5Var2.b = "";
            } else if (z5Var.b.equals(z5Var.a)) {
                z5Var2.b = z5Var2.a;
            } else {
                try {
                    File file2 = new File(ApplicationLoader.getFilesDirFixed(), z5Var.b);
                    File filesDirFixed2 = ApplicationLoader.getFilesDirFixed();
                    String j10 = z5Var2.p.j(z5Var2.q, true);
                    z5Var2.b = j10;
                    AndroidUtilities.copyFile(file2, new File(filesDirFixed2, j10));
                } catch (Exception e7) {
                    z5Var2.b = "";
                    FileLog.e(e7);
                }
            }
            f6Var2.y = z5Var2;
        }
        this.Z = this.Y;
        f6Var2.a = i10;
        this.Y = i10;
        this.i0 = f6Var2.y;
        this.a0.put(i10, f6Var2);
        this.b0.add(0, f6Var2);
        h6.D1(this);
        return f6Var2;
    }

    public final int l(int i10) {
        f6 f6Var = (f6) this.a0.get(i10);
        if (f6Var != null) {
            return f6Var.c;
        }
        return 0;
    }

    public final String m() {
        if (this.F == null) {
            return this.a;
        }
        return "remote" + this.F.id;
    }

    public final String n() {
        if ("Blue".equals(this.a)) {
            return LocaleController.getString(R.string.ThemeClassic);
        }
        if ("Dark Blue".equals(this.a)) {
            return LocaleController.getString(R.string.ThemeDark);
        }
        if ("Arctic Blue".equals(this.a)) {
            return LocaleController.getString(R.string.ThemeArcticBlue);
        }
        if ("Day".equals(this.a)) {
            return LocaleController.getString(R.string.ThemeDay);
        }
        if ("Night".equals(this.a)) {
            return LocaleController.getString(R.string.ThemeNight);
        }
        TLRPC.TL_theme tL_theme = this.F;
        return tL_theme != null ? tL_theme.title : this.a;
    }

    public final int o() {
        if (this.S && this.Y == h6.n) {
            return -3155485;
        }
        return this.L;
    }

    public final int p() {
        if (this.S && this.Y == h6.n) {
            return -983328;
        }
        return this.R;
    }

    public final boolean q() {
        int i10 = this.j0;
        if (i10 != -1) {
            return i10 == 1;
        }
        if ("Dark Blue".equals(this.a) || "Night".equals(this.a)) {
            this.j0 = 1;
        } else if ("Blue".equals(this.a) || "Arctic Blue".equals(this.a) || "Day".equals(this.a)) {
            this.j0 = 0;
        }
        if (this.j0 == -1) {
            h6.G(h6.Q0(new File(this.b), null, new String[1]), this);
        }
        return this.j0 == 1;
    }

    public final void r(SharedPreferences sharedPreferences, f6 f6Var, String str) {
        try {
            String string = sharedPreferences.getString(str, null);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(string);
            z5 z5Var = new z5();
            z5Var.a = jSONObject.getString("wall");
            z5Var.b = jSONObject.getString("owall");
            z5Var.d = jSONObject.getInt("pColor");
            z5Var.e = jSONObject.getInt("pGrColor");
            z5Var.f = jSONObject.optInt("pGrColor2");
            z5Var.g = jSONObject.optInt("pGrColor3");
            z5Var.h = jSONObject.getInt("pGrAngle");
            z5Var.c = jSONObject.getString("wallSlug");
            z5Var.i = jSONObject.getBoolean("wBlur");
            z5Var.j = jSONObject.getBoolean("wMotion");
            z5Var.k = (float) jSONObject.getDouble("pIntensity");
            z5Var.p = this;
            z5Var.q = f6Var;
            if (f6Var != null) {
                f6Var.y = z5Var;
            } else {
                this.i0 = z5Var;
            }
            if (jSONObject.has("wallId") && jSONObject.getLong("wallId") == 1000001) {
                z5Var.c = "d";
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    public final void s() {
        this.G = true;
        this.T = false;
        h6.s1(true, false);
        if (this == h6.I && h6.M == null) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, this, Boolean.valueOf(this == h6.J), null, -1, h6.ol);
        }
    }

    public final void t() {
        NotificationCenter.getInstance(this.E).removeObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.E).removeObserver(this, NotificationCenter.fileLoadFailed);
    }

    public final void u(int i10) {
        this.Y = i10;
        f6 k10 = k(false);
        if (k10 != null) {
            this.i0 = k10.y;
        }
    }

    public final void v(z5 z5Var) {
        if (this.i0 == z5Var) {
            return;
        }
        f6 k10 = k(false);
        z5 z5Var2 = this.i0;
        if (z5Var2 != null) {
            z5.a(z5Var2);
        }
        if (z5Var != null) {
            z5Var.q = k10;
            z5Var.p = this;
            z5Var.c();
        }
        this.i0 = z5Var;
        if (k10 != null) {
            k10.y = z5Var;
        }
    }

    public g6(g6 g6Var) {
        this.x = 45;
        this.G = true;
        this.U = true;
        this.Z = -1;
        this.d0 = new LongSparseArray();
        this.e0 = 0;
        this.f0 = 100;
        this.j0 = -1;
        this.a = g6Var.a;
        this.b = g6Var.b;
        this.c = g6Var.c;
        this.d = g6Var.d;
        this.e = g6Var.e;
        this.f = g6Var.f;
        this.h = g6Var.h;
        this.n = g6Var.n;
        this.r = g6Var.r;
        this.s = g6Var.s;
        this.v = g6Var.v;
        this.w = g6Var.w;
        this.x = g6Var.x;
        this.y = g6Var.y;
        this.E = g6Var.E;
        this.F = g6Var.F;
        this.G = g6Var.G;
        this.H = g6Var.H;
        this.I = g6Var.I;
        this.J = g6Var.J;
        this.K = g6Var.K;
        this.L = g6Var.L;
        this.M = g6Var.M;
        this.N = g6Var.N;
        this.O = g6Var.O;
        this.P = g6Var.P;
        this.Q = g6Var.Q;
        this.R = g6Var.R;
        this.S = g6Var.S;
        this.T = g6Var.T;
        this.U = g6Var.U;
        this.V = g6Var.V;
        this.W = g6Var.W;
        this.X = g6Var.X;
        this.Y = g6Var.Y;
        this.Z = g6Var.Z;
        this.a0 = g6Var.a0;
        this.b0 = g6Var.b0;
        this.c0 = g6Var.c0;
        this.f0 = g6Var.f0;
        this.g0 = g6Var.g0;
        this.h0 = g6Var.h0;
        this.i0 = g6Var.i0;
    }
}
