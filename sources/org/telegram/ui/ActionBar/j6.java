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
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.o9;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class j6 implements NotificationCenter.NotificationCenterDelegate {
    public int B;
    public TLRPC.TL_theme C;
    public boolean D;
    public String E;
    public String F;
    public TLRPC.InputFile G;
    public TLRPC.InputFile H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public SparseArray X;
    public ArrayList Y;
    public LongSparseArray Z;
    public String a;
    public final LongSparseArray a0;
    public String b;
    public int b0;
    public String c;
    public int c0;
    public String d;
    public String d0;
    public String e;
    public String e0;
    public boolean f;
    public d6 f0;
    public int g0;
    public boolean h;
    public boolean n;
    public int r;
    public int s;
    public int v;
    public int w;
    public int x;
    public int y;

    public j6() {
        this.x = 45;
        this.D = true;
        this.R = true;
        this.W = -1;
        this.a0 = new LongSparseArray();
        this.b0 = 0;
        this.c0 = 100;
        this.g0 = -1;
    }

    public static boolean a(i6 i6Var, TLRPC.ThemeSettings themeSettings) {
        boolean z4;
        boolean z10;
        long j10;
        long j11;
        long j12;
        String str;
        int i10;
        int i11;
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
            z4 = false;
            z10 = true;
            j10 = 0;
            j11 = 0;
            j12 = 0;
            str = null;
            i10 = 0;
            i11 = 0;
        } else {
            i10 = k6.X0(wallPaperSettings.background_color);
            j10 = themeSettings.wallpaper.settings.second_background_color == 0 ? 4294967296L : k6.X0(r11);
            j11 = themeSettings.wallpaper.settings.third_background_color == 0 ? 4294967296L : k6.X0(r11);
            j12 = themeSettings.wallpaper.settings.fourth_background_color != 0 ? k6.X0(r11) : 4294967296L;
            i11 = AndroidUtilities.getWallpaperRotation(themeSettings.wallpaper.settings.rotation, false);
            z4 = false;
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            z10 = true;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                str = wallPaper2.slug;
                f10 = wallPaper2.settings.intensity / 100.0f;
                return (themeSettings.accent_color != i6Var.c && themeSettings.outbox_accent_color == i6Var.d && intValue == i6Var.e && intValue2 == i6Var.f && intValue3 == i6Var.g && intValue4 == i6Var.h && themeSettings.message_colors_animated == i6Var.i && ((long) i10) == i6Var.j && j10 == i6Var.k && j11 == i6Var.l && j12 == i6Var.m && i11 == i6Var.n && TextUtils.equals(str, i6Var.o) && ((double) Math.abs(f10 - i6Var.p)) < 0.001d) ? z10 : z4;
            }
            str = null;
        }
        f10 = 0.0f;
        if (themeSettings.accent_color != i6Var.c) {
        }
    }

    public static void b(j6 j6Var, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, String[] strArr, int[] iArr9, int[] iArr10) {
        j6Var.T = iArr.length;
        j6Var.Y = new ArrayList();
        j6Var.X = new SparseArray();
        j6Var.Z = new LongSparseArray();
        for (int i10 = 0; i10 < iArr.length; i10++) {
            i6 i6Var = new i6();
            i6Var.a = iArr8[i10];
            if (k6.g1(i6Var)) {
                i6Var.z = true;
            }
            i6Var.c = iArr[i10];
            i6Var.b = j6Var;
            i6Var.e = iArr2[i10];
            i6Var.f = iArr3[i10];
            long j10 = iArr4[i10];
            i6Var.j = j10;
            boolean z4 = j6Var.P;
            if (z4 && i6Var.a == k6.n) {
                i6Var.j = 4294967296L;
            } else {
                i6Var.j = j10;
            }
            if (z4 && i6Var.a == k6.n) {
                i6Var.k = 4294967296L;
            } else {
                i6Var.k = iArr5[i10];
            }
            if (iArr6 != null) {
                if (z4 && i6Var.a == k6.n) {
                    i6Var.l = 4294967296L;
                } else {
                    i6Var.l = iArr6[i10];
                }
            }
            if (iArr7 != null) {
                if (z4 && i6Var.a == k6.n) {
                    i6Var.m = 4294967296L;
                } else {
                    i6Var.m = iArr7[i10];
                }
            }
            i6Var.p = iArr10[i10] / 100.0f;
            i6Var.n = iArr9[i10];
            i6Var.o = strArr[i10];
            if ((k6.g1(i6Var) && j6Var.a.equals("Dark Blue")) || j6Var.a.equals("Night")) {
                i6Var.e = -14316059;
                i6Var.f = -12422433;
                i6Var.g = -8304937;
                i6Var.h = -6340950;
                if (j6Var.a.equals("Night")) {
                    i6Var.p = -0.57f;
                    i6Var.j = -9666650L;
                    i6Var.k = -13749173L;
                    i6Var.l = -8883033L;
                    i6Var.m = -13421992L;
                }
            }
            j6Var.X.put(i6Var.a, i6Var);
            j6Var.Y.add(i6Var);
        }
        j6Var.U = ((i6) j6Var.X.get(0)).c;
    }

    public static void c(j6 j6Var, SharedPreferences sharedPreferences) {
        ArrayList arrayList = j6Var.Y;
        if (arrayList == null || arrayList.isEmpty()) {
            j6Var.r(sharedPreferences, null, android.support.v4.media.a.r(new StringBuilder(), j6Var.a, "_owp"));
            return;
        }
        int size = j6Var.Y.size();
        for (int i10 = 0; i10 < size; i10++) {
            i6 i6Var = (i6) j6Var.Y.get(i10);
            StringBuilder sb = new StringBuilder();
            sb.append(j6Var.a);
            sb.append("_");
            j6Var.r(sharedPreferences, i6Var, android.support.v4.media.a.m(i6Var.a, "_owp", sb));
        }
    }

    public static j6 g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            j6 j6Var = new j6();
            j6Var.a = jSONObject.getString("name");
            j6Var.b = jSONObject.getString("path");
            if (jSONObject.has("account")) {
                j6Var.B = jSONObject.getInt("account");
            }
            if (jSONObject.has("info")) {
                try {
                    SerializedData serializedData = new SerializedData(Utilities.hexToBytes(jSONObject.getString("info")));
                    j6Var.C = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (jSONObject.has("loaded")) {
                j6Var.D = jSONObject.getBoolean("loaded");
            }
            return j6Var;
        } catch (Exception e6) {
            FileLog.e(e6);
            return null;
        }
    }

    public static j6 h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("\\|");
        if (split.length != 2) {
            return null;
        }
        j6 j6Var = new j6();
        j6Var.a = split[0];
        j6Var.b = split[1];
        return j6Var;
    }

    public static void i(i6 i6Var, TLRPC.ThemeSettings themeSettings) {
        TLRPC.WallPaperSettings wallPaperSettings;
        i6Var.c = themeSettings.accent_color;
        i6Var.d = themeSettings.outbox_accent_color;
        i6Var.e = themeSettings.message_colors.size() > 0 ? themeSettings.message_colors.get(0).intValue() | (-16777216) : 0;
        int intValue = themeSettings.message_colors.size() > 1 ? themeSettings.message_colors.get(1).intValue() | (-16777216) : 0;
        i6Var.f = intValue;
        if (i6Var.e == intValue) {
            i6Var.f = 0;
        }
        i6Var.g = themeSettings.message_colors.size() > 2 ? themeSettings.message_colors.get(2).intValue() | (-16777216) : 0;
        i6Var.h = themeSettings.message_colors.size() > 3 ? themeSettings.message_colors.get(3).intValue() | (-16777216) : 0;
        i6Var.i = themeSettings.message_colors_animated;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null) {
            return;
        }
        if (wallPaperSettings.background_color == 0) {
            i6Var.j = 4294967296L;
        } else {
            i6Var.j = k6.X0(r0);
        }
        TLRPC.WallPaperSettings wallPaperSettings2 = themeSettings.wallpaper.settings;
        if ((wallPaperSettings2.flags & 16) == 0 || wallPaperSettings2.second_background_color != 0) {
            i6Var.k = k6.X0(wallPaperSettings2.second_background_color);
        } else {
            i6Var.k = 4294967296L;
        }
        TLRPC.WallPaperSettings wallPaperSettings3 = themeSettings.wallpaper.settings;
        if ((wallPaperSettings3.flags & 32) == 0 || wallPaperSettings3.third_background_color != 0) {
            i6Var.l = k6.X0(wallPaperSettings3.third_background_color);
        } else {
            i6Var.l = 4294967296L;
        }
        TLRPC.WallPaperSettings wallPaperSettings4 = themeSettings.wallpaper.settings;
        if ((wallPaperSettings4.flags & 64) == 0 || wallPaperSettings4.fourth_background_color != 0) {
            i6Var.m = k6.X0(wallPaperSettings4.fourth_background_color);
        } else {
            i6Var.m = 4294967296L;
        }
        i6Var.n = AndroidUtilities.getWallpaperRotation(themeSettings.wallpaper.settings.rotation, false);
        TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
        if ((wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) || !wallPaper2.pattern) {
            return;
        }
        i6Var.o = wallPaper2.slug;
        TLRPC.WallPaperSettings wallPaperSettings5 = wallPaper2.settings;
        i6Var.p = wallPaperSettings5.intensity / 100.0f;
        i6Var.q = wallPaperSettings5.motion;
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
                    patternColor = fc0.g(this.r, this.s, i10, this.w);
                } else {
                    int i11 = this.s;
                    if (i11 != 0) {
                        patternColor = AndroidUtilities.getAverageColor(this.r, i11);
                        GradientDrawable gradientDrawable = new GradientDrawable(o9.d(this.x), new int[]{this.r, this.s});
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
            TLRPC.TL_theme tL_theme = this.C;
            if (tL_theme == null || tL_theme.document == null) {
                return;
            }
            if (str.equals(this.d0)) {
                this.d0 = null;
                Utilities.globalQueue.postRunnable(new org.telegram.messenger.voip.h(13, this, (File) objArr[1]));
                return;
            }
            if (str.equals(FileLoader.getAttachFileName(this.C.document))) {
                t();
                if (i10 == i12) {
                    File file = new File(this.b);
                    TLRPC.TL_theme tL_theme2 = this.C;
                    j6 k02 = k6.k0(file, tL_theme2.title, tL_theme2);
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
                    this.e0 = k02.c;
                    TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                    tL_inputWallPaperSlug.slug = k02.e;
                    getwallpaper.wallpaper = tL_inputWallPaperSlug;
                    ConnectionsManager.getInstance(k02.B).sendRequest(getwallpaper, new eg.b3(21, this, k02));
                }
            }
        }
    }

    public final i6 e(long j10, TLRPC.ThemeSettings themeSettings, TLRPC.TL_theme tL_theme, int i10, boolean z4) {
        if (z4) {
            LongSparseArray longSparseArray = this.a0;
            i6 i6Var = (i6) longSparseArray.get(j10);
            if (i6Var != null) {
                return i6Var;
            }
            int i11 = this.b0 + 1;
            this.b0 = i11;
            i6 i6Var2 = new i6();
            i(i6Var2, themeSettings);
            i6Var2.b = this;
            i6Var2.a = i11;
            i6Var2.r = tL_theme;
            i6Var2.t = i10;
            longSparseArray.put(i11, i6Var2);
            return i6Var2;
        }
        i6 i6Var3 = (i6) this.Z.get(j10);
        if (i6Var3 != null) {
            return i6Var3;
        }
        int i12 = this.c0 + 1;
        this.c0 = i12;
        i6 i6Var4 = new i6();
        i(i6Var4, themeSettings);
        i6Var4.b = this;
        i6Var4.a = i12;
        i6Var4.r = tL_theme;
        i6Var4.t = i10;
        this.X.put(i12, i6Var4);
        this.Y.add(0, i6Var4);
        k6.D1(this);
        this.Z.put(j10, i6Var4);
        return i6Var4;
    }

    public final i6 f(TLRPC.TL_theme tL_theme, int i10, int i11) {
        if (tL_theme == null) {
            return null;
        }
        return e(tL_theme.id, i11 < tL_theme.settings.size() ? tL_theme.settings.get(i11) : null, tL_theme, i10, false);
    }

    public final String j(i6 i6Var, boolean z4) {
        String m9;
        if (i6Var == null) {
            i6Var = k(false);
        }
        if (i6Var == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(z4 ? android.support.v4.media.a.r(new StringBuilder(), this.a, "_wp_o") : android.support.v4.media.a.r(new StringBuilder(), this.a, "_wp"));
            sb.append(Utilities.random.nextInt());
            sb.append(".jpg");
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        if (z4) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.a);
            sb3.append("_");
            m9 = android.support.v4.media.a.m(i6Var.a, "_wp_o", sb3);
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.a);
            sb4.append("_");
            m9 = android.support.v4.media.a.m(i6Var.a, "_wp", sb4);
        }
        sb2.append(m9);
        sb2.append(Utilities.random.nextInt());
        sb2.append(".jpg");
        return sb2.toString();
    }

    public final i6 k(boolean z4) {
        i6 i6Var;
        if (this.Y == null || (i6Var = (i6) this.X.get(this.V)) == null) {
            return null;
        }
        if (!z4) {
            return i6Var;
        }
        int i10 = this.c0 + 1;
        this.c0 = i10;
        i6 i6Var2 = new i6();
        i6Var2.c = i6Var.c;
        i6Var2.d = i6Var.d;
        i6Var2.e = i6Var.e;
        i6Var2.f = i6Var.f;
        i6Var2.g = i6Var.g;
        i6Var2.h = i6Var.h;
        i6Var2.i = i6Var.i;
        i6Var2.j = i6Var.j;
        i6Var2.k = i6Var.k;
        i6Var2.l = i6Var.l;
        i6Var2.m = i6Var.m;
        i6Var2.n = i6Var.n;
        i6Var2.o = i6Var.o;
        i6Var2.p = i6Var.p;
        i6Var2.q = i6Var.q;
        i6Var2.b = this;
        d6 d6Var = this.f0;
        if (d6Var != null) {
            d6 d6Var2 = new d6();
            d6Var2.a = "";
            d6Var2.b = "";
            d6Var2.c = "";
            d6Var2.c = d6Var.c;
            d6Var2.d = d6Var.d;
            d6Var2.e = d6Var.e;
            d6Var2.f = d6Var.f;
            d6Var2.g = d6Var.g;
            d6Var2.h = d6Var.h;
            d6Var2.i = d6Var.i;
            d6Var2.j = d6Var.j;
            d6Var2.k = d6Var.k;
            d6Var2.p = this;
            d6Var2.q = i6Var2;
            if (TextUtils.isEmpty(d6Var.a)) {
                d6Var2.a = "";
            } else {
                try {
                    File file = new File(ApplicationLoader.getFilesDirFixed(), d6Var.a);
                    File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                    String j10 = d6Var2.p.j(d6Var2.q, false);
                    d6Var2.a = j10;
                    AndroidUtilities.copyFile(file, new File(filesDirFixed, j10));
                } catch (Exception e6) {
                    d6Var2.a = "";
                    FileLog.e(e6);
                }
            }
            if (TextUtils.isEmpty(d6Var.b)) {
                d6Var2.b = "";
            } else if (d6Var.b.equals(d6Var.a)) {
                d6Var2.b = d6Var2.a;
            } else {
                try {
                    File file2 = new File(ApplicationLoader.getFilesDirFixed(), d6Var.b);
                    File filesDirFixed2 = ApplicationLoader.getFilesDirFixed();
                    String j11 = d6Var2.p.j(d6Var2.q, true);
                    d6Var2.b = j11;
                    AndroidUtilities.copyFile(file2, new File(filesDirFixed2, j11));
                } catch (Exception e10) {
                    d6Var2.b = "";
                    FileLog.e(e10);
                }
            }
            i6Var2.y = d6Var2;
        }
        this.W = this.V;
        i6Var2.a = i10;
        this.V = i10;
        this.f0 = i6Var2.y;
        this.X.put(i10, i6Var2);
        this.Y.add(0, i6Var2);
        k6.D1(this);
        return i6Var2;
    }

    public final int l(int i10) {
        i6 i6Var = (i6) this.X.get(i10);
        if (i6Var != null) {
            return i6Var.c;
        }
        return 0;
    }

    public final String m() {
        if (this.C == null) {
            return this.a;
        }
        return "remote" + this.C.id;
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
        TLRPC.TL_theme tL_theme = this.C;
        return tL_theme != null ? tL_theme.title : this.a;
    }

    public final int o() {
        if (this.P && this.V == k6.n) {
            return -3155485;
        }
        return this.I;
    }

    public final int p() {
        if (this.P && this.V == k6.n) {
            return -983328;
        }
        return this.O;
    }

    public final boolean q() {
        int i10 = this.g0;
        if (i10 != -1) {
            return i10 == 1;
        }
        if ("Dark Blue".equals(this.a) || "Night".equals(this.a)) {
            this.g0 = 1;
        } else if ("Blue".equals(this.a) || "Arctic Blue".equals(this.a) || "Day".equals(this.a)) {
            this.g0 = 0;
        }
        if (this.g0 == -1) {
            k6.G(k6.Q0(new File(this.b), null, new String[1]), this);
        }
        return this.g0 == 1;
    }

    public final void r(SharedPreferences sharedPreferences, i6 i6Var, String str) {
        try {
            String string = sharedPreferences.getString(str, null);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(string);
            d6 d6Var = new d6();
            d6Var.a = jSONObject.getString("wall");
            d6Var.b = jSONObject.getString("owall");
            d6Var.d = jSONObject.getInt("pColor");
            d6Var.e = jSONObject.getInt("pGrColor");
            d6Var.f = jSONObject.optInt("pGrColor2");
            d6Var.g = jSONObject.optInt("pGrColor3");
            d6Var.h = jSONObject.getInt("pGrAngle");
            d6Var.c = jSONObject.getString("wallSlug");
            d6Var.i = jSONObject.getBoolean("wBlur");
            d6Var.j = jSONObject.getBoolean("wMotion");
            d6Var.k = (float) jSONObject.getDouble("pIntensity");
            d6Var.p = this;
            d6Var.q = i6Var;
            if (i6Var != null) {
                i6Var.y = d6Var;
            } else {
                this.f0 = d6Var;
            }
            if (jSONObject.has("wallId") && jSONObject.getLong("wallId") == 1000001) {
                d6Var.c = "d";
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    public final void s() {
        this.D = true;
        this.Q = false;
        k6.s1(true, false);
        if (this == k6.I && k6.M == null) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, this, Boolean.valueOf(this == k6.J), null, -1, k6.ol);
        }
    }

    public final void t() {
        NotificationCenter.getInstance(this.B).removeObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.B).removeObserver(this, NotificationCenter.fileLoadFailed);
    }

    public final void u(int i10) {
        this.V = i10;
        i6 k10 = k(false);
        if (k10 != null) {
            this.f0 = k10.y;
        }
    }

    public final void v(d6 d6Var) {
        if (this.f0 == d6Var) {
            return;
        }
        i6 k10 = k(false);
        d6 d6Var2 = this.f0;
        if (d6Var2 != null) {
            d6.a(d6Var2);
        }
        if (d6Var != null) {
            d6Var.q = k10;
            d6Var.p = this;
            d6Var.c();
        }
        this.f0 = d6Var;
        if (k10 != null) {
            k10.y = d6Var;
        }
    }

    public j6(j6 j6Var) {
        this.x = 45;
        this.D = true;
        this.R = true;
        this.W = -1;
        this.a0 = new LongSparseArray();
        this.b0 = 0;
        this.c0 = 100;
        this.g0 = -1;
        this.a = j6Var.a;
        this.b = j6Var.b;
        this.c = j6Var.c;
        this.d = j6Var.d;
        this.e = j6Var.e;
        this.f = j6Var.f;
        this.h = j6Var.h;
        this.n = j6Var.n;
        this.r = j6Var.r;
        this.s = j6Var.s;
        this.v = j6Var.v;
        this.w = j6Var.w;
        this.x = j6Var.x;
        this.y = j6Var.y;
        this.B = j6Var.B;
        this.C = j6Var.C;
        this.D = j6Var.D;
        this.E = j6Var.E;
        this.F = j6Var.F;
        this.G = j6Var.G;
        this.H = j6Var.H;
        this.I = j6Var.I;
        this.J = j6Var.J;
        this.K = j6Var.K;
        this.L = j6Var.L;
        this.M = j6Var.M;
        this.N = j6Var.N;
        this.O = j6Var.O;
        this.P = j6Var.P;
        this.Q = j6Var.Q;
        this.R = j6Var.R;
        this.S = j6Var.S;
        this.T = j6Var.T;
        this.U = j6Var.U;
        this.V = j6Var.V;
        this.W = j6Var.W;
        this.X = j6Var.X;
        this.Y = j6Var.Y;
        this.Z = j6Var.Z;
        this.c0 = j6Var.c0;
        this.d0 = j6Var.d0;
        this.e0 = j6Var.e0;
        this.f0 = j6Var.f0;
    }
}
