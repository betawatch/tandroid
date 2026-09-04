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
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.w9;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class i6 implements NotificationCenter.NotificationCenterDelegate {
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
    public b6 i0;
    public int j0;
    public boolean n;
    public int r;
    public int s;
    public int v;
    public int w;
    public int x;
    public int y;

    public i6() {
        this.x = 45;
        this.G = true;
        this.U = true;
        this.Z = -1;
        this.d0 = new LongSparseArray();
        this.e0 = 0;
        this.f0 = 100;
        this.j0 = -1;
    }

    public static boolean a(h6 h6Var, TLRPC.ThemeSettings themeSettings) {
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
            i10 = j6.X0(wallPaperSettings.background_color);
            j3 = themeSettings.wallpaper.settings.second_background_color == 0 ? 4294967296L : j6.X0(r11);
            j10 = themeSettings.wallpaper.settings.third_background_color == 0 ? 4294967296L : j6.X0(r11);
            j11 = themeSettings.wallpaper.settings.fourth_background_color != 0 ? j6.X0(r11) : 4294967296L;
            i11 = AndroidUtilities.getWallpaperRotation(themeSettings.wallpaper.settings.rotation, false);
            z10 = false;
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            z11 = true;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                str = wallPaper2.slug;
                f7 = wallPaper2.settings.intensity / 100.0f;
                return (themeSettings.accent_color != h6Var.c && themeSettings.outbox_accent_color == h6Var.d && intValue == h6Var.e && intValue2 == h6Var.f && intValue3 == h6Var.g && intValue4 == h6Var.h && themeSettings.message_colors_animated == h6Var.i && ((long) i10) == h6Var.j && j3 == h6Var.k && j10 == h6Var.l && j11 == h6Var.m && i11 == h6Var.n && TextUtils.equals(str, h6Var.o) && ((double) Math.abs(f7 - h6Var.p)) < 0.001d) ? z11 : z10;
            }
            str = null;
        }
        f7 = 0.0f;
        if (themeSettings.accent_color != h6Var.c) {
        }
    }

    public static void b(i6 i6Var, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, String[] strArr, int[] iArr9, int[] iArr10) {
        i6Var.W = iArr.length;
        i6Var.b0 = new ArrayList();
        i6Var.a0 = new SparseArray();
        i6Var.c0 = new LongSparseArray();
        for (int i10 = 0; i10 < iArr.length; i10++) {
            h6 h6Var = new h6();
            h6Var.a = iArr8[i10];
            if (j6.g1(h6Var)) {
                h6Var.z = true;
            }
            h6Var.c = iArr[i10];
            h6Var.b = i6Var;
            h6Var.e = iArr2[i10];
            h6Var.f = iArr3[i10];
            long j3 = iArr4[i10];
            h6Var.j = j3;
            boolean z10 = i6Var.S;
            if (z10 && h6Var.a == j6.n) {
                h6Var.j = 4294967296L;
            } else {
                h6Var.j = j3;
            }
            if (z10 && h6Var.a == j6.n) {
                h6Var.k = 4294967296L;
            } else {
                h6Var.k = iArr5[i10];
            }
            if (iArr6 != null) {
                if (z10 && h6Var.a == j6.n) {
                    h6Var.l = 4294967296L;
                } else {
                    h6Var.l = iArr6[i10];
                }
            }
            if (iArr7 != null) {
                if (z10 && h6Var.a == j6.n) {
                    h6Var.m = 4294967296L;
                } else {
                    h6Var.m = iArr7[i10];
                }
            }
            h6Var.p = iArr10[i10] / 100.0f;
            h6Var.n = iArr9[i10];
            h6Var.o = strArr[i10];
            if ((j6.g1(h6Var) && i6Var.a.equals("Dark Blue")) || i6Var.a.equals("Night")) {
                h6Var.e = -14316059;
                h6Var.f = -12422433;
                h6Var.g = -8304937;
                h6Var.h = -6340950;
                if (i6Var.a.equals("Night")) {
                    h6Var.p = -0.57f;
                    h6Var.j = -9666650L;
                    h6Var.k = -13749173L;
                    h6Var.l = -8883033L;
                    h6Var.m = -13421992L;
                }
            }
            i6Var.a0.put(h6Var.a, h6Var);
            i6Var.b0.add(h6Var);
        }
        i6Var.X = ((h6) i6Var.a0.get(0)).c;
    }

    public static void c(i6 i6Var, SharedPreferences sharedPreferences) {
        ArrayList arrayList = i6Var.b0;
        if (arrayList == null || arrayList.isEmpty()) {
            i6Var.r(sharedPreferences, null, a4.a.s(new StringBuilder(), i6Var.a, "_owp"));
            return;
        }
        int size = i6Var.b0.size();
        for (int i10 = 0; i10 < size; i10++) {
            h6 h6Var = (h6) i6Var.b0.get(i10);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i6Var.a);
            sb2.append("_");
            i6Var.r(sharedPreferences, h6Var, a4.a.n(h6Var.a, "_owp", sb2));
        }
    }

    public static i6 g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            i6 i6Var = new i6();
            i6Var.a = jSONObject.getString("name");
            i6Var.b = jSONObject.getString("path");
            if (jSONObject.has("account")) {
                i6Var.E = jSONObject.getInt("account");
            }
            if (jSONObject.has("info")) {
                try {
                    SerializedData serializedData = new SerializedData(Utilities.hexToBytes(jSONObject.getString("info")));
                    i6Var.F = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (jSONObject.has("loaded")) {
                i6Var.G = jSONObject.getBoolean("loaded");
            }
            return i6Var;
        } catch (Exception e7) {
            FileLog.e(e7);
            return null;
        }
    }

    public static i6 h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("\\|");
        if (split.length != 2) {
            return null;
        }
        i6 i6Var = new i6();
        i6Var.a = split[0];
        i6Var.b = split[1];
        return i6Var;
    }

    public static void i(h6 h6Var, TLRPC.ThemeSettings themeSettings) {
        TLRPC.WallPaperSettings wallPaperSettings;
        h6Var.c = themeSettings.accent_color;
        h6Var.d = themeSettings.outbox_accent_color;
        h6Var.e = themeSettings.message_colors.size() > 0 ? themeSettings.message_colors.get(0).intValue() | (-16777216) : 0;
        int intValue = themeSettings.message_colors.size() > 1 ? themeSettings.message_colors.get(1).intValue() | (-16777216) : 0;
        h6Var.f = intValue;
        if (h6Var.e == intValue) {
            h6Var.f = 0;
        }
        h6Var.g = themeSettings.message_colors.size() > 2 ? themeSettings.message_colors.get(2).intValue() | (-16777216) : 0;
        h6Var.h = themeSettings.message_colors.size() > 3 ? themeSettings.message_colors.get(3).intValue() | (-16777216) : 0;
        h6Var.i = themeSettings.message_colors_animated;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null) {
            return;
        }
        if (wallPaperSettings.background_color == 0) {
            h6Var.j = 4294967296L;
        } else {
            h6Var.j = j6.X0(r0);
        }
        TLRPC.WallPaperSettings wallPaperSettings2 = themeSettings.wallpaper.settings;
        if ((wallPaperSettings2.flags & 16) == 0 || wallPaperSettings2.second_background_color != 0) {
            h6Var.k = j6.X0(wallPaperSettings2.second_background_color);
        } else {
            h6Var.k = 4294967296L;
        }
        TLRPC.WallPaperSettings wallPaperSettings3 = themeSettings.wallpaper.settings;
        if ((wallPaperSettings3.flags & 32) == 0 || wallPaperSettings3.third_background_color != 0) {
            h6Var.l = j6.X0(wallPaperSettings3.third_background_color);
        } else {
            h6Var.l = 4294967296L;
        }
        TLRPC.WallPaperSettings wallPaperSettings4 = themeSettings.wallpaper.settings;
        if ((wallPaperSettings4.flags & 64) == 0 || wallPaperSettings4.fourth_background_color != 0) {
            h6Var.m = j6.X0(wallPaperSettings4.fourth_background_color);
        } else {
            h6Var.m = 4294967296L;
        }
        h6Var.n = AndroidUtilities.getWallpaperRotation(themeSettings.wallpaper.settings.rotation, false);
        TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
        if ((wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) || !wallPaper2.pattern) {
            return;
        }
        h6Var.o = wallPaper2.slug;
        TLRPC.WallPaperSettings wallPaperSettings5 = wallPaper2.settings;
        h6Var.p = wallPaperSettings5.intensity / 100.0f;
        h6Var.q = wallPaperSettings5.motion;
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
                    patternColor = dc0.g(this.r, this.s, i10, this.w);
                } else {
                    int i11 = this.s;
                    if (i11 != 0) {
                        patternColor = AndroidUtilities.getAverageColor(this.r, i11);
                        GradientDrawable gradientDrawable = new GradientDrawable(w9.d(this.x), new int[]{this.r, this.s});
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
                Utilities.globalQueue.postRunnable(new c6(2, this, (File) objArr[1]));
                return;
            }
            if (str.equals(FileLoader.getAttachFileName(this.F.document))) {
                t();
                if (i10 == i12) {
                    File file = new File(this.b);
                    TLRPC.TL_theme tL_theme2 = this.F;
                    i6 k02 = j6.k0(file, tL_theme2.title, tL_theme2);
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
                    ConnectionsManager.getInstance(k02.E).sendRequest(getwallpaper, new bi.m1(21, this, k02));
                }
            }
        }
    }

    public final h6 e(long j3, TLRPC.ThemeSettings themeSettings, TLRPC.TL_theme tL_theme, int i10, boolean z10) {
        if (z10) {
            LongSparseArray longSparseArray = this.d0;
            h6 h6Var = (h6) longSparseArray.get(j3);
            if (h6Var != null) {
                return h6Var;
            }
            int i11 = this.e0 + 1;
            this.e0 = i11;
            h6 h6Var2 = new h6();
            i(h6Var2, themeSettings);
            h6Var2.b = this;
            h6Var2.a = i11;
            h6Var2.r = tL_theme;
            h6Var2.t = i10;
            longSparseArray.put(i11, h6Var2);
            return h6Var2;
        }
        h6 h6Var3 = (h6) this.c0.get(j3);
        if (h6Var3 != null) {
            return h6Var3;
        }
        int i12 = this.f0 + 1;
        this.f0 = i12;
        h6 h6Var4 = new h6();
        i(h6Var4, themeSettings);
        h6Var4.b = this;
        h6Var4.a = i12;
        h6Var4.r = tL_theme;
        h6Var4.t = i10;
        this.a0.put(i12, h6Var4);
        this.b0.add(0, h6Var4);
        j6.D1(this);
        this.c0.put(j3, h6Var4);
        return h6Var4;
    }

    public final h6 f(TLRPC.TL_theme tL_theme, int i10, int i11) {
        if (tL_theme == null) {
            return null;
        }
        return e(tL_theme.id, i11 < tL_theme.settings.size() ? tL_theme.settings.get(i11) : null, tL_theme, i10, false);
    }

    public final String j(h6 h6Var, boolean z10) {
        String n10;
        if (h6Var == null) {
            h6Var = k(false);
        }
        if (h6Var == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z10 ? a4.a.s(new StringBuilder(), this.a, "_wp_o") : a4.a.s(new StringBuilder(), this.a, "_wp"));
            sb2.append(Utilities.random.nextInt());
            sb2.append(".jpg");
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        if (z10) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.a);
            sb4.append("_");
            n10 = a4.a.n(h6Var.a, "_wp_o", sb4);
        } else {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(this.a);
            sb5.append("_");
            n10 = a4.a.n(h6Var.a, "_wp", sb5);
        }
        sb3.append(n10);
        sb3.append(Utilities.random.nextInt());
        sb3.append(".jpg");
        return sb3.toString();
    }

    public final h6 k(boolean z10) {
        h6 h6Var;
        if (this.b0 == null || (h6Var = (h6) this.a0.get(this.Y)) == null) {
            return null;
        }
        if (!z10) {
            return h6Var;
        }
        int i10 = this.f0 + 1;
        this.f0 = i10;
        h6 h6Var2 = new h6();
        h6Var2.c = h6Var.c;
        h6Var2.d = h6Var.d;
        h6Var2.e = h6Var.e;
        h6Var2.f = h6Var.f;
        h6Var2.g = h6Var.g;
        h6Var2.h = h6Var.h;
        h6Var2.i = h6Var.i;
        h6Var2.j = h6Var.j;
        h6Var2.k = h6Var.k;
        h6Var2.l = h6Var.l;
        h6Var2.m = h6Var.m;
        h6Var2.n = h6Var.n;
        h6Var2.o = h6Var.o;
        h6Var2.p = h6Var.p;
        h6Var2.q = h6Var.q;
        h6Var2.b = this;
        b6 b6Var = this.i0;
        if (b6Var != null) {
            b6 b6Var2 = new b6();
            b6Var2.a = "";
            b6Var2.b = "";
            b6Var2.c = "";
            b6Var2.c = b6Var.c;
            b6Var2.d = b6Var.d;
            b6Var2.e = b6Var.e;
            b6Var2.f = b6Var.f;
            b6Var2.g = b6Var.g;
            b6Var2.h = b6Var.h;
            b6Var2.i = b6Var.i;
            b6Var2.j = b6Var.j;
            b6Var2.k = b6Var.k;
            b6Var2.p = this;
            b6Var2.q = h6Var2;
            if (TextUtils.isEmpty(b6Var.a)) {
                b6Var2.a = "";
            } else {
                try {
                    File file = new File(ApplicationLoader.getFilesDirFixed(), b6Var.a);
                    File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                    String j3 = b6Var2.p.j(b6Var2.q, false);
                    b6Var2.a = j3;
                    AndroidUtilities.copyFile(file, new File(filesDirFixed, j3));
                } catch (Exception e7) {
                    b6Var2.a = "";
                    FileLog.e(e7);
                }
            }
            if (TextUtils.isEmpty(b6Var.b)) {
                b6Var2.b = "";
            } else if (b6Var.b.equals(b6Var.a)) {
                b6Var2.b = b6Var2.a;
            } else {
                try {
                    File file2 = new File(ApplicationLoader.getFilesDirFixed(), b6Var.b);
                    File filesDirFixed2 = ApplicationLoader.getFilesDirFixed();
                    String j10 = b6Var2.p.j(b6Var2.q, true);
                    b6Var2.b = j10;
                    AndroidUtilities.copyFile(file2, new File(filesDirFixed2, j10));
                } catch (Exception e10) {
                    b6Var2.b = "";
                    FileLog.e(e10);
                }
            }
            h6Var2.y = b6Var2;
        }
        this.Z = this.Y;
        h6Var2.a = i10;
        this.Y = i10;
        this.i0 = h6Var2.y;
        this.a0.put(i10, h6Var2);
        this.b0.add(0, h6Var2);
        j6.D1(this);
        return h6Var2;
    }

    public final int l(int i10) {
        h6 h6Var = (h6) this.a0.get(i10);
        if (h6Var != null) {
            return h6Var.c;
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
        if (this.S && this.Y == j6.n) {
            return -3155485;
        }
        return this.L;
    }

    public final int p() {
        if (this.S && this.Y == j6.n) {
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
            j6.G(j6.Q0(new File(this.b), null, new String[1]), this);
        }
        return this.j0 == 1;
    }

    public final void r(SharedPreferences sharedPreferences, h6 h6Var, String str) {
        try {
            String string = sharedPreferences.getString(str, null);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(string);
            b6 b6Var = new b6();
            b6Var.a = jSONObject.getString("wall");
            b6Var.b = jSONObject.getString("owall");
            b6Var.d = jSONObject.getInt("pColor");
            b6Var.e = jSONObject.getInt("pGrColor");
            b6Var.f = jSONObject.optInt("pGrColor2");
            b6Var.g = jSONObject.optInt("pGrColor3");
            b6Var.h = jSONObject.getInt("pGrAngle");
            b6Var.c = jSONObject.getString("wallSlug");
            b6Var.i = jSONObject.getBoolean("wBlur");
            b6Var.j = jSONObject.getBoolean("wMotion");
            b6Var.k = (float) jSONObject.getDouble("pIntensity");
            b6Var.p = this;
            b6Var.q = h6Var;
            if (h6Var != null) {
                h6Var.y = b6Var;
            } else {
                this.i0 = b6Var;
            }
            if (jSONObject.has("wallId") && jSONObject.getLong("wallId") == 1000001) {
                b6Var.c = "d";
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    public final void s() {
        this.G = true;
        this.T = false;
        j6.s1(true, false);
        if (this == j6.I && j6.M == null) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, this, Boolean.valueOf(this == j6.J), null, -1, j6.ol);
        }
    }

    public final void t() {
        NotificationCenter.getInstance(this.E).removeObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.E).removeObserver(this, NotificationCenter.fileLoadFailed);
    }

    public final void u(int i10) {
        this.Y = i10;
        h6 k10 = k(false);
        if (k10 != null) {
            this.i0 = k10.y;
        }
    }

    public final void v(b6 b6Var) {
        if (this.i0 == b6Var) {
            return;
        }
        h6 k10 = k(false);
        b6 b6Var2 = this.i0;
        if (b6Var2 != null) {
            b6.a(b6Var2);
        }
        if (b6Var != null) {
            b6Var.q = k10;
            b6Var.p = this;
            b6Var.c();
        }
        this.i0 = b6Var;
        if (k10 != null) {
            k10.y = b6Var;
        }
    }

    public i6(i6 i6Var) {
        this.x = 45;
        this.G = true;
        this.U = true;
        this.Z = -1;
        this.d0 = new LongSparseArray();
        this.e0 = 0;
        this.f0 = 100;
        this.j0 = -1;
        this.a = i6Var.a;
        this.b = i6Var.b;
        this.c = i6Var.c;
        this.d = i6Var.d;
        this.e = i6Var.e;
        this.f = i6Var.f;
        this.h = i6Var.h;
        this.n = i6Var.n;
        this.r = i6Var.r;
        this.s = i6Var.s;
        this.v = i6Var.v;
        this.w = i6Var.w;
        this.x = i6Var.x;
        this.y = i6Var.y;
        this.E = i6Var.E;
        this.F = i6Var.F;
        this.G = i6Var.G;
        this.H = i6Var.H;
        this.I = i6Var.I;
        this.J = i6Var.J;
        this.K = i6Var.K;
        this.L = i6Var.L;
        this.M = i6Var.M;
        this.N = i6Var.N;
        this.O = i6Var.O;
        this.P = i6Var.P;
        this.Q = i6Var.Q;
        this.R = i6Var.R;
        this.S = i6Var.S;
        this.T = i6Var.T;
        this.U = i6Var.U;
        this.V = i6Var.V;
        this.W = i6Var.W;
        this.X = i6Var.X;
        this.Y = i6Var.Y;
        this.Z = i6Var.Z;
        this.a0 = i6Var.a0;
        this.b0 = i6Var.b0;
        this.c0 = i6Var.c0;
        this.f0 = i6Var.f0;
        this.g0 = i6Var.g0;
        this.h0 = i6Var.h0;
        this.i0 = i6Var.i0;
    }
}
