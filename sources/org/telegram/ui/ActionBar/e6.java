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
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.n9;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class e6 implements NotificationCenter.NotificationCenterDelegate {
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
    public y5 e0;
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

    public e6() {
        this.x = 45;
        this.C = true;
        this.Q = true;
        this.V = -1;
        this.Z = new LongSparseArray();
        this.a0 = 0;
        this.b0 = 100;
        this.f0 = -1;
    }

    public static boolean a(d6 d6Var, TLRPC.ThemeSettings themeSettings) {
        boolean z10;
        boolean z11;
        long j10;
        long j11;
        long j12;
        String str;
        int i9;
        int i10;
        float f10;
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
            i9 = 0;
            i10 = 0;
        } else {
            i9 = f6.X0(wallPaperSettings.background_color);
            j10 = themeSettings.wallpaper.settings.second_background_color == 0 ? 4294967296L : f6.X0(r11);
            j11 = themeSettings.wallpaper.settings.third_background_color == 0 ? 4294967296L : f6.X0(r11);
            j12 = themeSettings.wallpaper.settings.fourth_background_color != 0 ? f6.X0(r11) : 4294967296L;
            i10 = AndroidUtilities.getWallpaperRotation(themeSettings.wallpaper.settings.rotation, false);
            z10 = false;
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            z11 = true;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                str = wallPaper2.slug;
                f10 = wallPaper2.settings.intensity / 100.0f;
                return (themeSettings.accent_color != d6Var.c && themeSettings.outbox_accent_color == d6Var.d && intValue == d6Var.e && intValue2 == d6Var.f && intValue3 == d6Var.g && intValue4 == d6Var.h && themeSettings.message_colors_animated == d6Var.i && ((long) i9) == d6Var.j && j10 == d6Var.k && j11 == d6Var.l && j12 == d6Var.m && i10 == d6Var.n && TextUtils.equals(str, d6Var.o) && ((double) Math.abs(f10 - d6Var.p)) < 0.001d) ? z11 : z10;
            }
            str = null;
        }
        f10 = 0.0f;
        if (themeSettings.accent_color != d6Var.c) {
        }
    }

    public static void b(e6 e6Var, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, String[] strArr, int[] iArr9, int[] iArr10) {
        e6Var.S = iArr.length;
        e6Var.X = new ArrayList();
        e6Var.W = new SparseArray();
        e6Var.Y = new LongSparseArray();
        for (int i9 = 0; i9 < iArr.length; i9++) {
            d6 d6Var = new d6();
            d6Var.a = iArr8[i9];
            if (f6.g1(d6Var)) {
                d6Var.z = true;
            }
            d6Var.c = iArr[i9];
            d6Var.b = e6Var;
            d6Var.e = iArr2[i9];
            d6Var.f = iArr3[i9];
            long j10 = iArr4[i9];
            d6Var.j = j10;
            boolean z10 = e6Var.O;
            if (z10 && d6Var.a == f6.n) {
                d6Var.j = 4294967296L;
            } else {
                d6Var.j = j10;
            }
            if (z10 && d6Var.a == f6.n) {
                d6Var.k = 4294967296L;
            } else {
                d6Var.k = iArr5[i9];
            }
            if (iArr6 != null) {
                if (z10 && d6Var.a == f6.n) {
                    d6Var.l = 4294967296L;
                } else {
                    d6Var.l = iArr6[i9];
                }
            }
            if (iArr7 != null) {
                if (z10 && d6Var.a == f6.n) {
                    d6Var.m = 4294967296L;
                } else {
                    d6Var.m = iArr7[i9];
                }
            }
            d6Var.p = iArr10[i9] / 100.0f;
            d6Var.n = iArr9[i9];
            d6Var.o = strArr[i9];
            if ((f6.g1(d6Var) && e6Var.a.equals("Dark Blue")) || e6Var.a.equals("Night")) {
                d6Var.e = -14316059;
                d6Var.f = -12422433;
                d6Var.g = -8304937;
                d6Var.h = -6340950;
                if (e6Var.a.equals("Night")) {
                    d6Var.p = -0.57f;
                    d6Var.j = -9666650L;
                    d6Var.k = -13749173L;
                    d6Var.l = -8883033L;
                    d6Var.m = -13421992L;
                }
            }
            e6Var.W.put(d6Var.a, d6Var);
            e6Var.X.add(d6Var);
        }
        e6Var.T = ((d6) e6Var.W.get(0)).c;
    }

    public static void c(e6 e6Var, SharedPreferences sharedPreferences) {
        ArrayList arrayList = e6Var.X;
        if (arrayList == null || arrayList.isEmpty()) {
            e6Var.r(sharedPreferences, null, aa.d.r(new StringBuilder(), e6Var.a, "_owp"));
            return;
        }
        int size = e6Var.X.size();
        for (int i9 = 0; i9 < size; i9++) {
            d6 d6Var = (d6) e6Var.X.get(i9);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(e6Var.a);
            sb2.append("_");
            e6Var.r(sharedPreferences, d6Var, aa.d.l(d6Var.a, "_owp", sb2));
        }
    }

    public static e6 g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            e6 e6Var = new e6();
            e6Var.a = jSONObject.getString("name");
            e6Var.b = jSONObject.getString("path");
            if (jSONObject.has("account")) {
                e6Var.A = jSONObject.getInt("account");
            }
            if (jSONObject.has("info")) {
                try {
                    SerializedData serializedData = new SerializedData(Utilities.hexToBytes(jSONObject.getString("info")));
                    e6Var.B = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            }
            if (jSONObject.has("loaded")) {
                e6Var.C = jSONObject.getBoolean("loaded");
            }
            return e6Var;
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public static e6 h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("\\|");
        if (split.length != 2) {
            return null;
        }
        e6 e6Var = new e6();
        e6Var.a = split[0];
        e6Var.b = split[1];
        return e6Var;
    }

    public static void i(d6 d6Var, TLRPC.ThemeSettings themeSettings) {
        TLRPC.WallPaperSettings wallPaperSettings;
        d6Var.c = themeSettings.accent_color;
        d6Var.d = themeSettings.outbox_accent_color;
        d6Var.e = themeSettings.message_colors.size() > 0 ? themeSettings.message_colors.get(0).intValue() | (-16777216) : 0;
        int intValue = themeSettings.message_colors.size() > 1 ? themeSettings.message_colors.get(1).intValue() | (-16777216) : 0;
        d6Var.f = intValue;
        if (d6Var.e == intValue) {
            d6Var.f = 0;
        }
        d6Var.g = themeSettings.message_colors.size() > 2 ? themeSettings.message_colors.get(2).intValue() | (-16777216) : 0;
        d6Var.h = themeSettings.message_colors.size() > 3 ? themeSettings.message_colors.get(3).intValue() | (-16777216) : 0;
        d6Var.i = themeSettings.message_colors_animated;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null) {
            return;
        }
        if (wallPaperSettings.background_color == 0) {
            d6Var.j = 4294967296L;
        } else {
            d6Var.j = f6.X0(r0);
        }
        TLRPC.WallPaperSettings wallPaperSettings2 = themeSettings.wallpaper.settings;
        if ((wallPaperSettings2.flags & 16) == 0 || wallPaperSettings2.second_background_color != 0) {
            d6Var.k = f6.X0(wallPaperSettings2.second_background_color);
        } else {
            d6Var.k = 4294967296L;
        }
        TLRPC.WallPaperSettings wallPaperSettings3 = themeSettings.wallpaper.settings;
        if ((wallPaperSettings3.flags & 32) == 0 || wallPaperSettings3.third_background_color != 0) {
            d6Var.l = f6.X0(wallPaperSettings3.third_background_color);
        } else {
            d6Var.l = 4294967296L;
        }
        TLRPC.WallPaperSettings wallPaperSettings4 = themeSettings.wallpaper.settings;
        if ((wallPaperSettings4.flags & 64) == 0 || wallPaperSettings4.fourth_background_color != 0) {
            d6Var.m = f6.X0(wallPaperSettings4.fourth_background_color);
        } else {
            d6Var.m = 4294967296L;
        }
        d6Var.n = AndroidUtilities.getWallpaperRotation(themeSettings.wallpaper.settings.rotation, false);
        TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
        if ((wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) || !wallPaper2.pattern) {
            return;
        }
        d6Var.o = wallPaper2.slug;
        TLRPC.WallPaperSettings wallPaperSettings5 = wallPaper2.settings;
        d6Var.p = wallPaperSettings5.intensity / 100.0f;
        d6Var.q = wallPaperSettings5.motion;
    }

    public final boolean d(File file, String str) {
        int patternColor;
        try {
            Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(AndroidUtilities.dp(640.0f), AndroidUtilities.dp(360.0f), file.getAbsolutePath(), null, 0);
            if (scaledBitmap != null && this.r != 0) {
                Bitmap createBitmap = Bitmap.createBitmap(scaledBitmap.getWidth(), scaledBitmap.getHeight(), scaledBitmap.getConfig());
                Canvas canvas = new Canvas(createBitmap);
                int i9 = this.v;
                if (i9 != 0) {
                    patternColor = jb0.g(this.r, this.s, i9, this.w);
                } else {
                    int i10 = this.s;
                    if (i10 != 0) {
                        patternColor = AndroidUtilities.getAverageColor(this.r, i10);
                        GradientDrawable gradientDrawable = new GradientDrawable(n9.d(this.x), new int[]{this.r, this.s});
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
        } catch (Throwable th) {
            FileLog.e(th);
            return false;
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        int i11 = NotificationCenter.fileLoaded;
        if (i9 == i11 || i9 == NotificationCenter.fileLoadFailed) {
            String str = (String) objArr[0];
            TLRPC.TL_theme tL_theme = this.B;
            if (tL_theme == null || tL_theme.document == null) {
                return;
            }
            if (str.equals(this.c0)) {
                this.c0 = null;
                Utilities.globalQueue.postRunnable(new org.telegram.messenger.voip.l0(8, this, (File) objArr[1]));
                return;
            }
            if (str.equals(FileLoader.getAttachFileName(this.B.document))) {
                t();
                if (i9 == i11) {
                    File file = new File(this.b);
                    TLRPC.TL_theme tL_theme2 = this.B;
                    e6 k02 = f6.k0(file, tL_theme2.title, tL_theme2);
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
                    ConnectionsManager.getInstance(k02.A).sendRequest(getwallpaper, new bg.j0(28, this, k02));
                }
            }
        }
    }

    public final d6 e(long j10, TLRPC.ThemeSettings themeSettings, TLRPC.TL_theme tL_theme, int i9, boolean z10) {
        if (z10) {
            LongSparseArray longSparseArray = this.Z;
            d6 d6Var = (d6) longSparseArray.get(j10);
            if (d6Var != null) {
                return d6Var;
            }
            int i10 = this.a0 + 1;
            this.a0 = i10;
            d6 d6Var2 = new d6();
            i(d6Var2, themeSettings);
            d6Var2.b = this;
            d6Var2.a = i10;
            d6Var2.r = tL_theme;
            d6Var2.t = i9;
            longSparseArray.put(i10, d6Var2);
            return d6Var2;
        }
        d6 d6Var3 = (d6) this.Y.get(j10);
        if (d6Var3 != null) {
            return d6Var3;
        }
        int i11 = this.b0 + 1;
        this.b0 = i11;
        d6 d6Var4 = new d6();
        i(d6Var4, themeSettings);
        d6Var4.b = this;
        d6Var4.a = i11;
        d6Var4.r = tL_theme;
        d6Var4.t = i9;
        this.W.put(i11, d6Var4);
        this.X.add(0, d6Var4);
        f6.D1(this);
        this.Y.put(j10, d6Var4);
        return d6Var4;
    }

    public final d6 f(TLRPC.TL_theme tL_theme, int i9, int i10) {
        if (tL_theme == null) {
            return null;
        }
        return e(tL_theme.id, i10 < tL_theme.settings.size() ? tL_theme.settings.get(i10) : null, tL_theme, i9, false);
    }

    public final String j(d6 d6Var, boolean z10) {
        String l10;
        if (d6Var == null) {
            d6Var = k(false);
        }
        if (d6Var == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z10 ? aa.d.r(new StringBuilder(), this.a, "_wp_o") : aa.d.r(new StringBuilder(), this.a, "_wp"));
            sb2.append(Utilities.random.nextInt());
            sb2.append(".jpg");
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        if (z10) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.a);
            sb4.append("_");
            l10 = aa.d.l(d6Var.a, "_wp_o", sb4);
        } else {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(this.a);
            sb5.append("_");
            l10 = aa.d.l(d6Var.a, "_wp", sb5);
        }
        sb3.append(l10);
        sb3.append(Utilities.random.nextInt());
        sb3.append(".jpg");
        return sb3.toString();
    }

    public final d6 k(boolean z10) {
        d6 d6Var;
        if (this.X == null || (d6Var = (d6) this.W.get(this.U)) == null) {
            return null;
        }
        if (!z10) {
            return d6Var;
        }
        int i9 = this.b0 + 1;
        this.b0 = i9;
        d6 d6Var2 = new d6();
        d6Var2.c = d6Var.c;
        d6Var2.d = d6Var.d;
        d6Var2.e = d6Var.e;
        d6Var2.f = d6Var.f;
        d6Var2.g = d6Var.g;
        d6Var2.h = d6Var.h;
        d6Var2.i = d6Var.i;
        d6Var2.j = d6Var.j;
        d6Var2.k = d6Var.k;
        d6Var2.l = d6Var.l;
        d6Var2.m = d6Var.m;
        d6Var2.n = d6Var.n;
        d6Var2.o = d6Var.o;
        d6Var2.p = d6Var.p;
        d6Var2.q = d6Var.q;
        d6Var2.b = this;
        y5 y5Var = this.e0;
        if (y5Var != null) {
            y5 y5Var2 = new y5();
            y5Var2.a = "";
            y5Var2.b = "";
            y5Var2.c = "";
            y5Var2.c = y5Var.c;
            y5Var2.d = y5Var.d;
            y5Var2.e = y5Var.e;
            y5Var2.f = y5Var.f;
            y5Var2.g = y5Var.g;
            y5Var2.h = y5Var.h;
            y5Var2.i = y5Var.i;
            y5Var2.j = y5Var.j;
            y5Var2.k = y5Var.k;
            y5Var2.p = this;
            y5Var2.q = d6Var2;
            if (TextUtils.isEmpty(y5Var.a)) {
                y5Var2.a = "";
            } else {
                try {
                    File file = new File(ApplicationLoader.getFilesDirFixed(), y5Var.a);
                    File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                    String j10 = y5Var2.p.j(y5Var2.q, false);
                    y5Var2.a = j10;
                    AndroidUtilities.copyFile(file, new File(filesDirFixed, j10));
                } catch (Exception e10) {
                    y5Var2.a = "";
                    FileLog.e(e10);
                }
            }
            if (TextUtils.isEmpty(y5Var.b)) {
                y5Var2.b = "";
            } else if (y5Var.b.equals(y5Var.a)) {
                y5Var2.b = y5Var2.a;
            } else {
                try {
                    File file2 = new File(ApplicationLoader.getFilesDirFixed(), y5Var.b);
                    File filesDirFixed2 = ApplicationLoader.getFilesDirFixed();
                    String j11 = y5Var2.p.j(y5Var2.q, true);
                    y5Var2.b = j11;
                    AndroidUtilities.copyFile(file2, new File(filesDirFixed2, j11));
                } catch (Exception e11) {
                    y5Var2.b = "";
                    FileLog.e(e11);
                }
            }
            d6Var2.y = y5Var2;
        }
        this.V = this.U;
        d6Var2.a = i9;
        this.U = i9;
        this.e0 = d6Var2.y;
        this.W.put(i9, d6Var2);
        this.X.add(0, d6Var2);
        f6.D1(this);
        return d6Var2;
    }

    public final int l(int i9) {
        d6 d6Var = (d6) this.W.get(i9);
        if (d6Var != null) {
            return d6Var.c;
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
        if (this.O && this.U == f6.n) {
            return -3155485;
        }
        return this.H;
    }

    public final int p() {
        if (this.O && this.U == f6.n) {
            return -983328;
        }
        return this.N;
    }

    public final boolean q() {
        int i9 = this.f0;
        if (i9 != -1) {
            return i9 == 1;
        }
        if ("Dark Blue".equals(this.a) || "Night".equals(this.a)) {
            this.f0 = 1;
        } else if ("Blue".equals(this.a) || "Arctic Blue".equals(this.a) || "Day".equals(this.a)) {
            this.f0 = 0;
        }
        if (this.f0 == -1) {
            f6.G(f6.Q0(new File(this.b), null, new String[1]), this);
        }
        return this.f0 == 1;
    }

    public final void r(SharedPreferences sharedPreferences, d6 d6Var, String str) {
        try {
            String string = sharedPreferences.getString(str, null);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(string);
            y5 y5Var = new y5();
            y5Var.a = jSONObject.getString("wall");
            y5Var.b = jSONObject.getString("owall");
            y5Var.d = jSONObject.getInt("pColor");
            y5Var.e = jSONObject.getInt("pGrColor");
            y5Var.f = jSONObject.optInt("pGrColor2");
            y5Var.g = jSONObject.optInt("pGrColor3");
            y5Var.h = jSONObject.getInt("pGrAngle");
            y5Var.c = jSONObject.getString("wallSlug");
            y5Var.i = jSONObject.getBoolean("wBlur");
            y5Var.j = jSONObject.getBoolean("wMotion");
            y5Var.k = (float) jSONObject.getDouble("pIntensity");
            y5Var.p = this;
            y5Var.q = d6Var;
            if (d6Var != null) {
                d6Var.y = y5Var;
            } else {
                this.e0 = y5Var;
            }
            if (jSONObject.has("wallId") && jSONObject.getLong("wallId") == 1000001) {
                y5Var.c = "d";
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public final void s() {
        this.C = true;
        this.P = false;
        f6.s1(true, false);
        if (this == f6.I && f6.M == null) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, this, Boolean.valueOf(this == f6.J), null, -1, f6.ol);
        }
    }

    public final void t() {
        NotificationCenter.getInstance(this.A).removeObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.A).removeObserver(this, NotificationCenter.fileLoadFailed);
    }

    public final void u(int i9) {
        this.U = i9;
        d6 k10 = k(false);
        if (k10 != null) {
            this.e0 = k10.y;
        }
    }

    public final void v(y5 y5Var) {
        if (this.e0 == y5Var) {
            return;
        }
        d6 k10 = k(false);
        y5 y5Var2 = this.e0;
        if (y5Var2 != null) {
            y5.a(y5Var2);
        }
        if (y5Var != null) {
            y5Var.q = k10;
            y5Var.p = this;
            y5Var.c();
        }
        this.e0 = y5Var;
        if (k10 != null) {
            k10.y = y5Var;
        }
    }

    public e6(e6 e6Var) {
        this.x = 45;
        this.C = true;
        this.Q = true;
        this.V = -1;
        this.Z = new LongSparseArray();
        this.a0 = 0;
        this.b0 = 100;
        this.f0 = -1;
        this.a = e6Var.a;
        this.b = e6Var.b;
        this.c = e6Var.c;
        this.d = e6Var.d;
        this.e = e6Var.e;
        this.f = e6Var.f;
        this.h = e6Var.h;
        this.n = e6Var.n;
        this.r = e6Var.r;
        this.s = e6Var.s;
        this.v = e6Var.v;
        this.w = e6Var.w;
        this.x = e6Var.x;
        this.y = e6Var.y;
        this.A = e6Var.A;
        this.B = e6Var.B;
        this.C = e6Var.C;
        this.D = e6Var.D;
        this.E = e6Var.E;
        this.F = e6Var.F;
        this.G = e6Var.G;
        this.H = e6Var.H;
        this.I = e6Var.I;
        this.J = e6Var.J;
        this.K = e6Var.K;
        this.L = e6Var.L;
        this.M = e6Var.M;
        this.N = e6Var.N;
        this.O = e6Var.O;
        this.P = e6Var.P;
        this.Q = e6Var.Q;
        this.R = e6Var.R;
        this.S = e6Var.S;
        this.T = e6Var.T;
        this.U = e6Var.U;
        this.V = e6Var.V;
        this.W = e6Var.W;
        this.X = e6Var.X;
        this.Y = e6Var.Y;
        this.b0 = e6Var.b0;
        this.c0 = e6Var.c0;
        this.d0 = e6Var.d0;
        this.e0 = e6Var.e0;
    }
}
