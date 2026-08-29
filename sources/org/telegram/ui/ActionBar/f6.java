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
import org.telegram.ui.Components.s9;
import org.telegram.ui.Components.yb0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class f6 implements NotificationCenter.NotificationCenterDelegate {
    public int A;
    public TLRPC.TL_theme B;
    public boolean C;
    public String D;
    public String E;
    public TLRPC.InputFile F;
    public TLRPC.InputFile G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public SparseArray W;
    public ArrayList X;
    public LongSparseArray Y;
    public final LongSparseArray Z;
    public String a;
    public int a0;
    public String b;
    public int b0;
    public String c;
    public String c0;
    public String d;
    public String d0;
    public String e;
    public z5 e0;
    public boolean f;
    public int f0;
    public boolean h;
    public boolean n;
    public int r;
    public int s;
    public int v;
    public int w;
    public int x;
    public int y;

    public f6() {
        this.x = 45;
        this.C = true;
        this.Q = true;
        this.V = -1;
        this.Z = new LongSparseArray();
        this.a0 = 0;
        this.b0 = 100;
        this.f0 = -1;
    }

    public static boolean a(e6 e6Var, TLRPC.ThemeSettings themeSettings) {
        boolean z10;
        boolean z11;
        long j10;
        long j11;
        long j12;
        String str;
        int i10;
        int i11;
        float f9;
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
            j10 = 0;
            j11 = 0;
            j12 = 0;
            str = null;
            i10 = 0;
            i11 = 0;
        } else {
            i10 = g6.X0(wallPaperSettings.background_color);
            j10 = themeSettings.wallpaper.settings.second_background_color == 0 ? 4294967296L : g6.X0(r11);
            j11 = themeSettings.wallpaper.settings.third_background_color == 0 ? 4294967296L : g6.X0(r11);
            j12 = themeSettings.wallpaper.settings.fourth_background_color != 0 ? g6.X0(r11) : 4294967296L;
            i11 = AndroidUtilities.getWallpaperRotation(themeSettings.wallpaper.settings.rotation, false);
            z10 = false;
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            z11 = true;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                str = wallPaper2.slug;
                f9 = wallPaper2.settings.intensity / 100.0f;
                return (themeSettings.accent_color != e6Var.c && themeSettings.outbox_accent_color == e6Var.d && intValue == e6Var.e && intValue2 == e6Var.f && intValue3 == e6Var.g && intValue4 == e6Var.h && themeSettings.message_colors_animated == e6Var.i && ((long) i10) == e6Var.j && j10 == e6Var.k && j11 == e6Var.l && j12 == e6Var.m && i11 == e6Var.n && TextUtils.equals(str, e6Var.o) && ((double) Math.abs(f9 - e6Var.p)) < 0.001d) ? z11 : z10;
            }
            str = null;
        }
        f9 = 0.0f;
        if (themeSettings.accent_color != e6Var.c) {
        }
    }

    public static void b(f6 f6Var, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, String[] strArr, int[] iArr9, int[] iArr10) {
        f6Var.S = iArr.length;
        f6Var.X = new ArrayList();
        f6Var.W = new SparseArray();
        f6Var.Y = new LongSparseArray();
        for (int i10 = 0; i10 < iArr.length; i10++) {
            e6 e6Var = new e6();
            e6Var.a = iArr8[i10];
            if (g6.g1(e6Var)) {
                e6Var.z = true;
            }
            e6Var.c = iArr[i10];
            e6Var.b = f6Var;
            e6Var.e = iArr2[i10];
            e6Var.f = iArr3[i10];
            long j10 = iArr4[i10];
            e6Var.j = j10;
            boolean z10 = f6Var.O;
            if (z10 && e6Var.a == g6.n) {
                e6Var.j = 4294967296L;
            } else {
                e6Var.j = j10;
            }
            if (z10 && e6Var.a == g6.n) {
                e6Var.k = 4294967296L;
            } else {
                e6Var.k = iArr5[i10];
            }
            if (iArr6 != null) {
                if (z10 && e6Var.a == g6.n) {
                    e6Var.l = 4294967296L;
                } else {
                    e6Var.l = iArr6[i10];
                }
            }
            if (iArr7 != null) {
                if (z10 && e6Var.a == g6.n) {
                    e6Var.m = 4294967296L;
                } else {
                    e6Var.m = iArr7[i10];
                }
            }
            e6Var.p = iArr10[i10] / 100.0f;
            e6Var.n = iArr9[i10];
            e6Var.o = strArr[i10];
            if ((g6.g1(e6Var) && f6Var.a.equals("Dark Blue")) || f6Var.a.equals("Night")) {
                e6Var.e = -14316059;
                e6Var.f = -12422433;
                e6Var.g = -8304937;
                e6Var.h = -6340950;
                if (f6Var.a.equals("Night")) {
                    e6Var.p = -0.57f;
                    e6Var.j = -9666650L;
                    e6Var.k = -13749173L;
                    e6Var.l = -8883033L;
                    e6Var.m = -13421992L;
                }
            }
            f6Var.W.put(e6Var.a, e6Var);
            f6Var.X.add(e6Var);
        }
        f6Var.T = ((e6) f6Var.W.get(0)).c;
    }

    public static void c(f6 f6Var, SharedPreferences sharedPreferences) {
        ArrayList arrayList = f6Var.X;
        if (arrayList == null || arrayList.isEmpty()) {
            f6Var.r(sharedPreferences, null, a4.w.q(new StringBuilder(), f6Var.a, "_owp"));
            return;
        }
        int size = f6Var.X.size();
        for (int i10 = 0; i10 < size; i10++) {
            e6 e6Var = (e6) f6Var.X.get(i10);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f6Var.a);
            sb2.append("_");
            f6Var.r(sharedPreferences, e6Var, a4.w.l(e6Var.a, "_owp", sb2));
        }
    }

    public static f6 g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            f6 f6Var = new f6();
            f6Var.a = jSONObject.getString("name");
            f6Var.b = jSONObject.getString("path");
            if (jSONObject.has("account")) {
                f6Var.A = jSONObject.getInt("account");
            }
            if (jSONObject.has("info")) {
                try {
                    SerializedData serializedData = new SerializedData(Utilities.hexToBytes(jSONObject.getString("info")));
                    f6Var.B = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (jSONObject.has("loaded")) {
                f6Var.C = jSONObject.getBoolean("loaded");
            }
            return f6Var;
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public static f6 h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("\\|");
        if (split.length != 2) {
            return null;
        }
        f6 f6Var = new f6();
        f6Var.a = split[0];
        f6Var.b = split[1];
        return f6Var;
    }

    public static void i(e6 e6Var, TLRPC.ThemeSettings themeSettings) {
        TLRPC.WallPaperSettings wallPaperSettings;
        e6Var.c = themeSettings.accent_color;
        e6Var.d = themeSettings.outbox_accent_color;
        e6Var.e = themeSettings.message_colors.size() > 0 ? themeSettings.message_colors.get(0).intValue() | (-16777216) : 0;
        int intValue = themeSettings.message_colors.size() > 1 ? themeSettings.message_colors.get(1).intValue() | (-16777216) : 0;
        e6Var.f = intValue;
        if (e6Var.e == intValue) {
            e6Var.f = 0;
        }
        e6Var.g = themeSettings.message_colors.size() > 2 ? themeSettings.message_colors.get(2).intValue() | (-16777216) : 0;
        e6Var.h = themeSettings.message_colors.size() > 3 ? themeSettings.message_colors.get(3).intValue() | (-16777216) : 0;
        e6Var.i = themeSettings.message_colors_animated;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null) {
            return;
        }
        if (wallPaperSettings.background_color == 0) {
            e6Var.j = 4294967296L;
        } else {
            e6Var.j = g6.X0(r0);
        }
        TLRPC.WallPaperSettings wallPaperSettings2 = themeSettings.wallpaper.settings;
        if ((wallPaperSettings2.flags & 16) == 0 || wallPaperSettings2.second_background_color != 0) {
            e6Var.k = g6.X0(wallPaperSettings2.second_background_color);
        } else {
            e6Var.k = 4294967296L;
        }
        TLRPC.WallPaperSettings wallPaperSettings3 = themeSettings.wallpaper.settings;
        if ((wallPaperSettings3.flags & 32) == 0 || wallPaperSettings3.third_background_color != 0) {
            e6Var.l = g6.X0(wallPaperSettings3.third_background_color);
        } else {
            e6Var.l = 4294967296L;
        }
        TLRPC.WallPaperSettings wallPaperSettings4 = themeSettings.wallpaper.settings;
        if ((wallPaperSettings4.flags & 64) == 0 || wallPaperSettings4.fourth_background_color != 0) {
            e6Var.m = g6.X0(wallPaperSettings4.fourth_background_color);
        } else {
            e6Var.m = 4294967296L;
        }
        e6Var.n = AndroidUtilities.getWallpaperRotation(themeSettings.wallpaper.settings.rotation, false);
        TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
        if ((wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) || !wallPaper2.pattern) {
            return;
        }
        e6Var.o = wallPaper2.slug;
        TLRPC.WallPaperSettings wallPaperSettings5 = wallPaper2.settings;
        e6Var.p = wallPaperSettings5.intensity / 100.0f;
        e6Var.q = wallPaperSettings5.motion;
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
                    patternColor = yb0.g(this.r, this.s, i10, this.w);
                } else {
                    int i11 = this.s;
                    if (i11 != 0) {
                        patternColor = AndroidUtilities.getAverageColor(this.r, i11);
                        GradientDrawable gradientDrawable = new GradientDrawable(s9.d(this.x), new int[]{this.r, this.s});
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
            TLRPC.TL_theme tL_theme = this.B;
            if (tL_theme == null || tL_theme.document == null) {
                return;
            }
            if (str.equals(this.c0)) {
                this.c0 = null;
                Utilities.globalQueue.postRunnable(new c(5, this, (File) objArr[1]));
                return;
            }
            if (str.equals(FileLoader.getAttachFileName(this.B.document))) {
                t();
                if (i10 == i12) {
                    File file = new File(this.b);
                    TLRPC.TL_theme tL_theme2 = this.B;
                    f6 k02 = g6.k0(file, tL_theme2.title, tL_theme2);
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
                    this.d0 = k02.c;
                    TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                    tL_inputWallPaperSlug.slug = k02.e;
                    getwallpaper.wallpaper = tL_inputWallPaperSlug;
                    ConnectionsManager.getInstance(k02.A).sendRequest(getwallpaper, new bg.h3(24, this, k02));
                }
            }
        }
    }

    public final e6 e(long j10, TLRPC.ThemeSettings themeSettings, TLRPC.TL_theme tL_theme, int i10, boolean z10) {
        if (z10) {
            LongSparseArray longSparseArray = this.Z;
            e6 e6Var = (e6) longSparseArray.get(j10);
            if (e6Var != null) {
                return e6Var;
            }
            int i11 = this.a0 + 1;
            this.a0 = i11;
            e6 e6Var2 = new e6();
            i(e6Var2, themeSettings);
            e6Var2.b = this;
            e6Var2.a = i11;
            e6Var2.r = tL_theme;
            e6Var2.t = i10;
            longSparseArray.put(i11, e6Var2);
            return e6Var2;
        }
        e6 e6Var3 = (e6) this.Y.get(j10);
        if (e6Var3 != null) {
            return e6Var3;
        }
        int i12 = this.b0 + 1;
        this.b0 = i12;
        e6 e6Var4 = new e6();
        i(e6Var4, themeSettings);
        e6Var4.b = this;
        e6Var4.a = i12;
        e6Var4.r = tL_theme;
        e6Var4.t = i10;
        this.W.put(i12, e6Var4);
        this.X.add(0, e6Var4);
        g6.D1(this);
        this.Y.put(j10, e6Var4);
        return e6Var4;
    }

    public final e6 f(TLRPC.TL_theme tL_theme, int i10, int i11) {
        if (tL_theme == null) {
            return null;
        }
        return e(tL_theme.id, i11 < tL_theme.settings.size() ? tL_theme.settings.get(i11) : null, tL_theme, i10, false);
    }

    public final String j(e6 e6Var, boolean z10) {
        String l10;
        if (e6Var == null) {
            e6Var = k(false);
        }
        if (e6Var == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z10 ? a4.w.q(new StringBuilder(), this.a, "_wp_o") : a4.w.q(new StringBuilder(), this.a, "_wp"));
            sb2.append(Utilities.random.nextInt());
            sb2.append(".jpg");
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        if (z10) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.a);
            sb4.append("_");
            l10 = a4.w.l(e6Var.a, "_wp_o", sb4);
        } else {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(this.a);
            sb5.append("_");
            l10 = a4.w.l(e6Var.a, "_wp", sb5);
        }
        sb3.append(l10);
        sb3.append(Utilities.random.nextInt());
        sb3.append(".jpg");
        return sb3.toString();
    }

    public final e6 k(boolean z10) {
        e6 e6Var;
        if (this.X == null || (e6Var = (e6) this.W.get(this.U)) == null) {
            return null;
        }
        if (!z10) {
            return e6Var;
        }
        int i10 = this.b0 + 1;
        this.b0 = i10;
        e6 e6Var2 = new e6();
        e6Var2.c = e6Var.c;
        e6Var2.d = e6Var.d;
        e6Var2.e = e6Var.e;
        e6Var2.f = e6Var.f;
        e6Var2.g = e6Var.g;
        e6Var2.h = e6Var.h;
        e6Var2.i = e6Var.i;
        e6Var2.j = e6Var.j;
        e6Var2.k = e6Var.k;
        e6Var2.l = e6Var.l;
        e6Var2.m = e6Var.m;
        e6Var2.n = e6Var.n;
        e6Var2.o = e6Var.o;
        e6Var2.p = e6Var.p;
        e6Var2.q = e6Var.q;
        e6Var2.b = this;
        z5 z5Var = this.e0;
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
            z5Var2.q = e6Var2;
            if (TextUtils.isEmpty(z5Var.a)) {
                z5Var2.a = "";
            } else {
                try {
                    File file = new File(ApplicationLoader.getFilesDirFixed(), z5Var.a);
                    File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                    String j10 = z5Var2.p.j(z5Var2.q, false);
                    z5Var2.a = j10;
                    AndroidUtilities.copyFile(file, new File(filesDirFixed, j10));
                } catch (Exception e10) {
                    z5Var2.a = "";
                    FileLog.e(e10);
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
                    String j11 = z5Var2.p.j(z5Var2.q, true);
                    z5Var2.b = j11;
                    AndroidUtilities.copyFile(file2, new File(filesDirFixed2, j11));
                } catch (Exception e11) {
                    z5Var2.b = "";
                    FileLog.e(e11);
                }
            }
            e6Var2.y = z5Var2;
        }
        this.V = this.U;
        e6Var2.a = i10;
        this.U = i10;
        this.e0 = e6Var2.y;
        this.W.put(i10, e6Var2);
        this.X.add(0, e6Var2);
        g6.D1(this);
        return e6Var2;
    }

    public final int l(int i10) {
        e6 e6Var = (e6) this.W.get(i10);
        if (e6Var != null) {
            return e6Var.c;
        }
        return 0;
    }

    public final String m() {
        if (this.B == null) {
            return this.a;
        }
        return "remote" + this.B.id;
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
        TLRPC.TL_theme tL_theme = this.B;
        return tL_theme != null ? tL_theme.title : this.a;
    }

    public final int o() {
        if (this.O && this.U == g6.n) {
            return -3155485;
        }
        return this.H;
    }

    public final int p() {
        if (this.O && this.U == g6.n) {
            return -983328;
        }
        return this.N;
    }

    public final boolean q() {
        int i10 = this.f0;
        if (i10 != -1) {
            return i10 == 1;
        }
        if ("Dark Blue".equals(this.a) || "Night".equals(this.a)) {
            this.f0 = 1;
        } else if ("Blue".equals(this.a) || "Arctic Blue".equals(this.a) || "Day".equals(this.a)) {
            this.f0 = 0;
        }
        if (this.f0 == -1) {
            g6.G(g6.Q0(new File(this.b), null, new String[1]), this);
        }
        return this.f0 == 1;
    }

    public final void r(SharedPreferences sharedPreferences, e6 e6Var, String str) {
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
            z5Var.q = e6Var;
            if (e6Var != null) {
                e6Var.y = z5Var;
            } else {
                this.e0 = z5Var;
            }
            if (jSONObject.has("wallId") && jSONObject.getLong("wallId") == 1000001) {
                z5Var.c = "d";
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    public final void s() {
        this.C = true;
        this.P = false;
        g6.s1(true, false);
        if (this == g6.I && g6.M == null) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, this, Boolean.valueOf(this == g6.J), null, -1, g6.ol);
        }
    }

    public final void t() {
        NotificationCenter.getInstance(this.A).removeObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.A).removeObserver(this, NotificationCenter.fileLoadFailed);
    }

    public final void u(int i10) {
        this.U = i10;
        e6 k9 = k(false);
        if (k9 != null) {
            this.e0 = k9.y;
        }
    }

    public final void v(z5 z5Var) {
        if (this.e0 == z5Var) {
            return;
        }
        e6 k9 = k(false);
        z5 z5Var2 = this.e0;
        if (z5Var2 != null) {
            z5.a(z5Var2);
        }
        if (z5Var != null) {
            z5Var.q = k9;
            z5Var.p = this;
            z5Var.c();
        }
        this.e0 = z5Var;
        if (k9 != null) {
            k9.y = z5Var;
        }
    }

    public f6(f6 f6Var) {
        this.x = 45;
        this.C = true;
        this.Q = true;
        this.V = -1;
        this.Z = new LongSparseArray();
        this.a0 = 0;
        this.b0 = 100;
        this.f0 = -1;
        this.a = f6Var.a;
        this.b = f6Var.b;
        this.c = f6Var.c;
        this.d = f6Var.d;
        this.e = f6Var.e;
        this.f = f6Var.f;
        this.h = f6Var.h;
        this.n = f6Var.n;
        this.r = f6Var.r;
        this.s = f6Var.s;
        this.v = f6Var.v;
        this.w = f6Var.w;
        this.x = f6Var.x;
        this.y = f6Var.y;
        this.A = f6Var.A;
        this.B = f6Var.B;
        this.C = f6Var.C;
        this.D = f6Var.D;
        this.E = f6Var.E;
        this.F = f6Var.F;
        this.G = f6Var.G;
        this.H = f6Var.H;
        this.I = f6Var.I;
        this.J = f6Var.J;
        this.K = f6Var.K;
        this.L = f6Var.L;
        this.M = f6Var.M;
        this.N = f6Var.N;
        this.O = f6Var.O;
        this.P = f6Var.P;
        this.Q = f6Var.Q;
        this.R = f6Var.R;
        this.S = f6Var.S;
        this.T = f6Var.T;
        this.U = f6Var.U;
        this.V = f6Var.V;
        this.W = f6Var.W;
        this.X = f6Var.X;
        this.Y = f6Var.Y;
        this.b0 = f6Var.b0;
        this.c0 = f6Var.c0;
        this.d0 = f6Var.d0;
        this.e0 = f6Var.e0;
    }
}
