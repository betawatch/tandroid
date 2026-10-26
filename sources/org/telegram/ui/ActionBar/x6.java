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
import org.telegram.ui.Components.uc0;
import org.telegram.ui.Components.x9;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class x6 implements NotificationCenter.NotificationCenterDelegate {
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
    public r6 i0;
    public int j0;
    public boolean n;
    public int r;
    public int s;
    public int v;
    public int w;
    public int x;
    public int y;

    public x6() {
        this.x = 45;
        this.G = true;
        this.U = true;
        this.Z = -1;
        this.d0 = new LongSparseArray();
        this.e0 = 0;
        this.f0 = 100;
        this.j0 = -1;
    }

    public static boolean a(w6 w6Var, TLRPC.ThemeSettings themeSettings) {
        boolean z10;
        boolean z11;
        long j10;
        long j11;
        long j12;
        int i10;
        int i11;
        String str;
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
            j10 = 0;
            j11 = 0;
            j12 = 0;
            i10 = 0;
            i11 = 0;
        } else {
            i10 = y6.Z0(wallPaperSettings.background_color);
            j10 = themeSettings.wallpaper.settings.second_background_color == 0 ? 4294967296L : y6.Z0(r11);
            j11 = themeSettings.wallpaper.settings.third_background_color == 0 ? 4294967296L : y6.Z0(r11);
            j12 = themeSettings.wallpaper.settings.fourth_background_color != 0 ? y6.Z0(r11) : 4294967296L;
            i11 = AndroidUtilities.getWallpaperRotation(themeSettings.wallpaper.settings.rotation, false);
            z10 = false;
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            z11 = true;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                str = wallPaper2.slug;
                f7 = wallPaper2.settings.intensity / 100.0f;
                return (themeSettings.accent_color != w6Var.c && themeSettings.outbox_accent_color == w6Var.d && intValue == w6Var.e && intValue2 == w6Var.f && intValue3 == w6Var.g && intValue4 == w6Var.h && themeSettings.message_colors_animated == w6Var.i && ((long) i10) == w6Var.j && j10 == w6Var.k && j11 == w6Var.l && j12 == w6Var.m && i11 == w6Var.n && TextUtils.equals(str, w6Var.o) && ((double) Math.abs(f7 - w6Var.p)) < 0.001d) ? z11 : z10;
            }
        }
        str = null;
        f7 = 0.0f;
        if (themeSettings.accent_color != w6Var.c) {
        }
    }

    public static void b(x6 x6Var, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, String[] strArr, int[] iArr9, int[] iArr10) {
        x6Var.W = iArr.length;
        x6Var.b0 = new ArrayList();
        x6Var.a0 = new SparseArray();
        x6Var.c0 = new LongSparseArray();
        for (int i10 = 0; i10 < iArr.length; i10++) {
            w6 w6Var = new w6();
            w6Var.a = iArr8[i10];
            if (y6.j1(w6Var)) {
                w6Var.z = true;
            }
            w6Var.c = iArr[i10];
            w6Var.b = x6Var;
            w6Var.e = iArr2[i10];
            w6Var.f = iArr3[i10];
            long j10 = iArr4[i10];
            w6Var.j = j10;
            boolean z10 = x6Var.S;
            if (z10 && w6Var.a == y6.n) {
                w6Var.j = 4294967296L;
            } else {
                w6Var.j = j10;
            }
            if (z10 && w6Var.a == y6.n) {
                w6Var.k = 4294967296L;
            } else {
                w6Var.k = iArr5[i10];
            }
            if (iArr6 != null) {
                if (z10 && w6Var.a == y6.n) {
                    w6Var.l = 4294967296L;
                } else {
                    w6Var.l = iArr6[i10];
                }
            }
            if (iArr7 != null) {
                if (z10 && w6Var.a == y6.n) {
                    w6Var.m = 4294967296L;
                } else {
                    w6Var.m = iArr7[i10];
                }
            }
            w6Var.p = iArr10[i10] / 100.0f;
            w6Var.n = iArr9[i10];
            w6Var.o = strArr[i10];
            if ((y6.j1(w6Var) && x6Var.a.equals("Dark Blue")) || x6Var.a.equals("Night")) {
                w6Var.e = -14316059;
                w6Var.f = -12422433;
                w6Var.g = -8304937;
                w6Var.h = -6340950;
                if (x6Var.a.equals("Night")) {
                    w6Var.p = -0.57f;
                    w6Var.j = -9666650L;
                    w6Var.k = -13749173L;
                    w6Var.l = -8883033L;
                    w6Var.m = -13421992L;
                }
            }
            x6Var.a0.put(w6Var.a, w6Var);
            x6Var.b0.add(w6Var);
        }
        x6Var.X = ((w6) x6Var.a0.get(0)).c;
    }

    public static void c(x6 x6Var, SharedPreferences sharedPreferences) {
        ArrayList arrayList = x6Var.b0;
        if (arrayList == null || arrayList.isEmpty()) {
            x6Var.r(sharedPreferences, null, a1.g.s(new StringBuilder(), x6Var.a, "_owp"));
            return;
        }
        int size = x6Var.b0.size();
        for (int i10 = 0; i10 < size; i10++) {
            w6 w6Var = (w6) x6Var.b0.get(i10);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(x6Var.a);
            sb2.append("_");
            x6Var.r(sharedPreferences, w6Var, a1.g.n(w6Var.a, "_owp", sb2));
        }
    }

    public static x6 g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            x6 x6Var = new x6();
            x6Var.a = jSONObject.getString("name");
            x6Var.b = jSONObject.getString("path");
            if (jSONObject.has("account")) {
                x6Var.E = jSONObject.getInt("account");
            }
            if (jSONObject.has("info")) {
                try {
                    SerializedData serializedData = new SerializedData(Utilities.hexToBytes(jSONObject.getString("info")));
                    x6Var.F = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (jSONObject.has("loaded")) {
                x6Var.G = jSONObject.getBoolean("loaded");
            }
            return x6Var;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static x6 h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("\\|");
        if (split.length != 2) {
            return null;
        }
        x6 x6Var = new x6();
        x6Var.a = split[0];
        x6Var.b = split[1];
        return x6Var;
    }

    public static void i(w6 w6Var, TLRPC.ThemeSettings themeSettings) {
        TLRPC.WallPaperSettings wallPaperSettings;
        w6Var.c = themeSettings.accent_color;
        w6Var.d = themeSettings.outbox_accent_color;
        w6Var.e = themeSettings.message_colors.size() > 0 ? themeSettings.message_colors.get(0).intValue() | (-16777216) : 0;
        int intValue = themeSettings.message_colors.size() > 1 ? themeSettings.message_colors.get(1).intValue() | (-16777216) : 0;
        w6Var.f = intValue;
        if (w6Var.e == intValue) {
            w6Var.f = 0;
        }
        w6Var.g = themeSettings.message_colors.size() > 2 ? themeSettings.message_colors.get(2).intValue() | (-16777216) : 0;
        w6Var.h = themeSettings.message_colors.size() > 3 ? themeSettings.message_colors.get(3).intValue() | (-16777216) : 0;
        w6Var.i = themeSettings.message_colors_animated;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null) {
            return;
        }
        if (wallPaperSettings.background_color == 0) {
            w6Var.j = 4294967296L;
        } else {
            w6Var.j = y6.Z0(r0);
        }
        TLRPC.WallPaperSettings wallPaperSettings2 = themeSettings.wallpaper.settings;
        if ((wallPaperSettings2.flags & 16) == 0 || wallPaperSettings2.second_background_color != 0) {
            w6Var.k = y6.Z0(wallPaperSettings2.second_background_color);
        } else {
            w6Var.k = 4294967296L;
        }
        TLRPC.WallPaperSettings wallPaperSettings3 = themeSettings.wallpaper.settings;
        if ((wallPaperSettings3.flags & 32) == 0 || wallPaperSettings3.third_background_color != 0) {
            w6Var.l = y6.Z0(wallPaperSettings3.third_background_color);
        } else {
            w6Var.l = 4294967296L;
        }
        TLRPC.WallPaperSettings wallPaperSettings4 = themeSettings.wallpaper.settings;
        if ((wallPaperSettings4.flags & 64) == 0 || wallPaperSettings4.fourth_background_color != 0) {
            w6Var.m = y6.Z0(wallPaperSettings4.fourth_background_color);
        } else {
            w6Var.m = 4294967296L;
        }
        w6Var.n = AndroidUtilities.getWallpaperRotation(themeSettings.wallpaper.settings.rotation, false);
        TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
        if ((wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) || !wallPaper2.pattern) {
            return;
        }
        w6Var.o = wallPaper2.slug;
        TLRPC.WallPaperSettings wallPaperSettings5 = wallPaper2.settings;
        w6Var.p = wallPaperSettings5.intensity / 100.0f;
        w6Var.q = wallPaperSettings5.motion;
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
                    patternColor = uc0.g(this.r, this.s, i10, this.w);
                } else {
                    int i11 = this.s;
                    if (i11 != 0) {
                        patternColor = AndroidUtilities.getAverageColor(this.r, i11);
                        GradientDrawable gradientDrawable = new GradientDrawable(x9.d(this.x), new int[]{this.r, this.s});
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
                Utilities.globalQueue.postRunnable(new org.telegram.messenger.voip.m0(9, this, (File) objArr[1]));
                return;
            }
            if (str.equals(FileLoader.getAttachFileName(this.F.document))) {
                t();
                if (i10 == i12) {
                    File file = new File(this.b);
                    TLRPC.TL_theme tL_theme2 = this.F;
                    x6 l02 = y6.l0(file, tL_theme2.title, tL_theme2);
                    if (l02 == null || l02.c == null || new File(l02.c).exists()) {
                        s();
                        return;
                    }
                    this.r = l02.r;
                    this.s = l02.s;
                    this.v = l02.v;
                    this.w = l02.w;
                    this.x = l02.x;
                    this.h = l02.h;
                    this.y = l02.y;
                    this.h0 = l02.c;
                    TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                    tL_inputWallPaperSlug.slug = l02.e;
                    getwallpaper.wallpaper = tL_inputWallPaperSlug;
                    ConnectionsManager.getInstance(l02.E).sendRequest(getwallpaper, new bi.j(29, this, l02));
                }
            }
        }
    }

    public final w6 e(long j10, TLRPC.ThemeSettings themeSettings, TLRPC.TL_theme tL_theme, int i10, boolean z10) {
        if (z10) {
            LongSparseArray longSparseArray = this.d0;
            w6 w6Var = (w6) longSparseArray.get(j10);
            if (w6Var != null) {
                return w6Var;
            }
            int i11 = this.e0 + 1;
            this.e0 = i11;
            w6 w6Var2 = new w6();
            i(w6Var2, themeSettings);
            w6Var2.b = this;
            w6Var2.a = i11;
            w6Var2.r = tL_theme;
            w6Var2.t = i10;
            longSparseArray.put(i11, w6Var2);
            return w6Var2;
        }
        w6 w6Var3 = (w6) this.c0.get(j10);
        if (w6Var3 != null) {
            return w6Var3;
        }
        int i12 = this.f0 + 1;
        this.f0 = i12;
        w6 w6Var4 = new w6();
        i(w6Var4, themeSettings);
        w6Var4.b = this;
        w6Var4.a = i12;
        w6Var4.r = tL_theme;
        w6Var4.t = i10;
        this.a0.put(i12, w6Var4);
        this.b0.add(0, w6Var4);
        y6.G1(this);
        this.c0.put(j10, w6Var4);
        return w6Var4;
    }

    public final w6 f(TLRPC.TL_theme tL_theme, int i10, int i11) {
        if (tL_theme == null) {
            return null;
        }
        return e(tL_theme.id, i11 < tL_theme.settings.size() ? tL_theme.settings.get(i11) : null, tL_theme, i10, false);
    }

    public final String j(w6 w6Var, boolean z10) {
        String n10;
        if (w6Var == null) {
            w6Var = k(false);
        }
        if (w6Var == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z10 ? a1.g.s(new StringBuilder(), this.a, "_wp_o") : a1.g.s(new StringBuilder(), this.a, "_wp"));
            sb2.append(Utilities.random.nextInt());
            sb2.append(".jpg");
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        if (z10) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.a);
            sb4.append("_");
            n10 = a1.g.n(w6Var.a, "_wp_o", sb4);
        } else {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(this.a);
            sb5.append("_");
            n10 = a1.g.n(w6Var.a, "_wp", sb5);
        }
        sb3.append(n10);
        sb3.append(Utilities.random.nextInt());
        sb3.append(".jpg");
        return sb3.toString();
    }

    public final w6 k(boolean z10) {
        w6 w6Var;
        if (this.b0 == null || (w6Var = (w6) this.a0.get(this.Y)) == null) {
            return null;
        }
        if (!z10) {
            return w6Var;
        }
        int i10 = this.f0 + 1;
        this.f0 = i10;
        w6 w6Var2 = new w6();
        w6Var2.c = w6Var.c;
        w6Var2.d = w6Var.d;
        w6Var2.e = w6Var.e;
        w6Var2.f = w6Var.f;
        w6Var2.g = w6Var.g;
        w6Var2.h = w6Var.h;
        w6Var2.i = w6Var.i;
        w6Var2.j = w6Var.j;
        w6Var2.k = w6Var.k;
        w6Var2.l = w6Var.l;
        w6Var2.m = w6Var.m;
        w6Var2.n = w6Var.n;
        w6Var2.o = w6Var.o;
        w6Var2.p = w6Var.p;
        w6Var2.q = w6Var.q;
        w6Var2.b = this;
        r6 r6Var = this.i0;
        if (r6Var != null) {
            r6 r6Var2 = new r6();
            r6Var2.a = "";
            r6Var2.b = "";
            r6Var2.c = "";
            r6Var2.c = r6Var.c;
            r6Var2.d = r6Var.d;
            r6Var2.e = r6Var.e;
            r6Var2.f = r6Var.f;
            r6Var2.g = r6Var.g;
            r6Var2.h = r6Var.h;
            r6Var2.i = r6Var.i;
            r6Var2.j = r6Var.j;
            r6Var2.k = r6Var.k;
            r6Var2.p = this;
            r6Var2.q = w6Var2;
            if (TextUtils.isEmpty(r6Var.a)) {
                r6Var2.a = "";
            } else {
                try {
                    File file = new File(ApplicationLoader.getFilesDirFixed(), r6Var.a);
                    File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                    String j10 = r6Var2.p.j(r6Var2.q, false);
                    r6Var2.a = j10;
                    AndroidUtilities.copyFile(file, new File(filesDirFixed, j10));
                } catch (Exception e) {
                    r6Var2.a = "";
                    FileLog.e(e);
                }
            }
            if (TextUtils.isEmpty(r6Var.b)) {
                r6Var2.b = "";
            } else if (r6Var.b.equals(r6Var.a)) {
                r6Var2.b = r6Var2.a;
            } else {
                try {
                    File file2 = new File(ApplicationLoader.getFilesDirFixed(), r6Var.b);
                    File filesDirFixed2 = ApplicationLoader.getFilesDirFixed();
                    String j11 = r6Var2.p.j(r6Var2.q, true);
                    r6Var2.b = j11;
                    AndroidUtilities.copyFile(file2, new File(filesDirFixed2, j11));
                } catch (Exception e10) {
                    r6Var2.b = "";
                    FileLog.e(e10);
                }
            }
            w6Var2.y = r6Var2;
        }
        this.Z = this.Y;
        w6Var2.a = i10;
        this.Y = i10;
        this.i0 = w6Var2.y;
        this.a0.put(i10, w6Var2);
        this.b0.add(0, w6Var2);
        y6.G1(this);
        return w6Var2;
    }

    public final int l(int i10) {
        w6 w6Var = (w6) this.a0.get(i10);
        if (w6Var != null) {
            return w6Var.c;
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
        if (this.S && this.Y == y6.n) {
            return -3155485;
        }
        return this.L;
    }

    public final int p() {
        if (this.S && this.Y == y6.n) {
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
            y6.G(y6.S0(new File(this.b), null, new String[1]), this);
        }
        return this.j0 == 1;
    }

    public final void r(SharedPreferences sharedPreferences, w6 w6Var, String str) {
        try {
            String string = sharedPreferences.getString(str, null);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(string);
            r6 r6Var = new r6();
            r6Var.a = jSONObject.getString("wall");
            r6Var.b = jSONObject.getString("owall");
            r6Var.d = jSONObject.getInt("pColor");
            r6Var.e = jSONObject.getInt("pGrColor");
            r6Var.f = jSONObject.optInt("pGrColor2");
            r6Var.g = jSONObject.optInt("pGrColor3");
            r6Var.h = jSONObject.getInt("pGrAngle");
            r6Var.c = jSONObject.getString("wallSlug");
            r6Var.i = jSONObject.getBoolean("wBlur");
            r6Var.j = jSONObject.getBoolean("wMotion");
            r6Var.k = (float) jSONObject.getDouble("pIntensity");
            r6Var.p = this;
            r6Var.q = w6Var;
            if (w6Var != null) {
                w6Var.y = r6Var;
            } else {
                this.i0 = r6Var;
            }
            if (jSONObject.has("wallId") && jSONObject.getLong("wallId") == 1000001) {
                r6Var.c = "d";
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    public final void s() {
        this.G = true;
        this.T = false;
        y6.v1(true, false);
        if (this == y6.I && y6.M == null) {
            y6.H1(this, this == y6.J, -1, null);
        }
    }

    public final void t() {
        NotificationCenter.getInstance(this.E).removeObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.E).removeObserver(this, NotificationCenter.fileLoadFailed);
    }

    public final void u(int i10) {
        this.Y = i10;
        w6 k10 = k(false);
        if (k10 != null) {
            this.i0 = k10.y;
        }
    }

    public final void v(r6 r6Var) {
        if (this.i0 == r6Var) {
            return;
        }
        w6 k10 = k(false);
        r6 r6Var2 = this.i0;
        if (r6Var2 != null) {
            r6.a(r6Var2);
        }
        if (r6Var != null) {
            r6Var.q = k10;
            r6Var.p = this;
            r6Var.c();
        }
        this.i0 = r6Var;
        if (k10 != null) {
            k10.y = r6Var;
        }
    }

    public x6(x6 x6Var) {
        this.x = 45;
        this.G = true;
        this.U = true;
        this.Z = -1;
        this.d0 = new LongSparseArray();
        this.e0 = 0;
        this.f0 = 100;
        this.j0 = -1;
        this.a = x6Var.a;
        this.b = x6Var.b;
        this.c = x6Var.c;
        this.d = x6Var.d;
        this.e = x6Var.e;
        this.f = x6Var.f;
        this.h = x6Var.h;
        this.n = x6Var.n;
        this.r = x6Var.r;
        this.s = x6Var.s;
        this.v = x6Var.v;
        this.w = x6Var.w;
        this.x = x6Var.x;
        this.y = x6Var.y;
        this.E = x6Var.E;
        this.F = x6Var.F;
        this.G = x6Var.G;
        this.H = x6Var.H;
        this.I = x6Var.I;
        this.J = x6Var.J;
        this.K = x6Var.K;
        this.L = x6Var.L;
        this.M = x6Var.M;
        this.N = x6Var.N;
        this.O = x6Var.O;
        this.P = x6Var.P;
        this.Q = x6Var.Q;
        this.R = x6Var.R;
        this.S = x6Var.S;
        this.T = x6Var.T;
        this.U = x6Var.U;
        this.V = x6Var.V;
        this.W = x6Var.W;
        this.X = x6Var.X;
        this.Y = x6Var.Y;
        this.Z = x6Var.Z;
        this.a0 = x6Var.a0;
        this.b0 = x6Var.b0;
        this.c0 = x6Var.c0;
        this.f0 = x6Var.f0;
        this.g0 = x6Var.g0;
        this.h0 = x6Var.h0;
        this.i0 = x6Var.i0;
    }
}
