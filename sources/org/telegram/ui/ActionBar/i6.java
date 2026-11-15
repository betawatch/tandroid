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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.ra0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class i6 implements is {
    public int E;
    public int F;
    public TLRPC.TL_theme G;
    public boolean H;
    public String I;
    public String J;
    public TLRPC.InputFile K;
    public TLRPC.InputFile L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public String a;
    public int a0;
    public String b;
    public SparseArray b0;
    public String c;
    public ArrayList c0;
    public String d;
    public LongSparseArray d0;
    public String e;
    public final LongSparseArray e0;
    public boolean f;
    public int f0;
    public int g0;
    public boolean h;
    public String h0;
    public String i0;
    public b6 j0;
    public int k0;
    public boolean n;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;

    public i6() {
        this.y = 45;
        this.H = true;
        this.V = true;
        this.a0 = -1;
        this.e0 = new LongSparseArray();
        this.f0 = 0;
        this.g0 = 100;
        this.k0 = -1;
    }

    public static boolean a(g6 g6Var, TLRPC.ThemeSettings themeSettings) {
        boolean z10;
        boolean z11;
        long j3;
        long j10;
        long j11;
        int i7;
        int i10;
        String str;
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
            j3 = 0;
            j10 = 0;
            j11 = 0;
            i7 = 0;
            i10 = 0;
        } else {
            i7 = j6.a1(wallPaperSettings.background_color);
            j3 = themeSettings.wallpaper.settings.second_background_color == 0 ? 4294967296L : j6.a1(r11);
            j10 = themeSettings.wallpaper.settings.third_background_color == 0 ? 4294967296L : j6.a1(r11);
            j11 = themeSettings.wallpaper.settings.fourth_background_color != 0 ? j6.a1(r11) : 4294967296L;
            i10 = org.telegram.messenger.g0.s1(themeSettings.wallpaper.settings.rotation, false);
            z10 = false;
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            z11 = true;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                str = wallPaper2.slug;
                f10 = wallPaper2.settings.intensity / 100.0f;
                return (themeSettings.accent_color != g6Var.c && themeSettings.outbox_accent_color == g6Var.d && intValue == g6Var.e && intValue2 == g6Var.f && intValue3 == g6Var.g && intValue4 == g6Var.h && themeSettings.message_colors_animated == g6Var.i && ((long) i7) == g6Var.j && j3 == g6Var.k && j10 == g6Var.l && j11 == g6Var.m && i10 == g6Var.n && TextUtils.equals(str, g6Var.o) && ((double) Math.abs(f10 - g6Var.p)) < 0.001d) ? z11 : z10;
            }
        }
        str = null;
        f10 = 0.0f;
        if (themeSettings.accent_color != g6Var.c) {
        }
    }

    public static void b(i6 i6Var, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, String[] strArr, int[] iArr9, int[] iArr10) {
        i6Var.X = iArr.length;
        i6Var.c0 = new ArrayList();
        i6Var.b0 = new SparseArray();
        i6Var.d0 = new LongSparseArray();
        for (int i7 = 0; i7 < iArr.length; i7++) {
            g6 g6Var = new g6();
            g6Var.a = iArr8[i7];
            if (j6.l1(g6Var)) {
                g6Var.z = true;
            }
            g6Var.c = iArr[i7];
            g6Var.b = i6Var;
            g6Var.e = iArr2[i7];
            g6Var.f = iArr3[i7];
            long j3 = iArr4[i7];
            g6Var.j = j3;
            boolean z10 = i6Var.T;
            if (z10 && g6Var.a == j6.n) {
                g6Var.j = 4294967296L;
            } else {
                g6Var.j = j3;
            }
            if (z10 && g6Var.a == j6.n) {
                g6Var.k = 4294967296L;
            } else {
                g6Var.k = iArr5[i7];
            }
            if (iArr6 != null) {
                if (z10 && g6Var.a == j6.n) {
                    g6Var.l = 4294967296L;
                } else {
                    g6Var.l = iArr6[i7];
                }
            }
            if (iArr7 != null) {
                if (z10 && g6Var.a == j6.n) {
                    g6Var.m = 4294967296L;
                } else {
                    g6Var.m = iArr7[i7];
                }
            }
            g6Var.p = iArr10[i7] / 100.0f;
            g6Var.n = iArr9[i7];
            g6Var.o = strArr[i7];
            if ((j6.l1(g6Var) && i6Var.a.equals("Dark Blue")) || i6Var.a.equals("Night")) {
                g6Var.e = -14316059;
                g6Var.f = -12422433;
                g6Var.g = -8304937;
                g6Var.h = -6340950;
                if (i6Var.a.equals("Night")) {
                    g6Var.p = -0.57f;
                    g6Var.j = -9666650L;
                    g6Var.k = -13749173L;
                    g6Var.l = -8883033L;
                    g6Var.m = -13421992L;
                }
            }
            i6Var.b0.put(g6Var.a, g6Var);
            i6Var.c0.add(g6Var);
        }
        i6Var.Y = ((g6) i6Var.b0.get(0)).c;
    }

    public static void c(i6 i6Var, SharedPreferences sharedPreferences) {
        ArrayList arrayList = i6Var.c0;
        if (arrayList == null || arrayList.isEmpty()) {
            i6Var.r(sharedPreferences, null, a8.p0.s(new StringBuilder(), i6Var.a, "_owp"));
            return;
        }
        int size = i6Var.c0.size();
        for (int i7 = 0; i7 < size; i7++) {
            g6 g6Var = (g6) i6Var.c0.get(i7);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i6Var.a);
            sb2.append("_");
            i6Var.r(sharedPreferences, g6Var, a8.p0.n(g6Var.a, "_owp", sb2));
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
                i6Var.F = jSONObject.getInt("account");
            }
            if (jSONObject.has("info")) {
                try {
                    SerializedData serializedData = new SerializedData(Utilities.v(jSONObject.getString("info")));
                    i6Var.G = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
            }
            if (jSONObject.has("loaded")) {
                i6Var.H = jSONObject.getBoolean("loaded");
            }
            return i6Var;
        } catch (Exception e10) {
            a8.g(e10, true);
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

    public static void i(g6 g6Var, TLRPC.ThemeSettings themeSettings) {
        TLRPC.WallPaperSettings wallPaperSettings;
        g6Var.c = themeSettings.accent_color;
        g6Var.d = themeSettings.outbox_accent_color;
        g6Var.e = themeSettings.message_colors.size() > 0 ? themeSettings.message_colors.get(0).intValue() | (-16777216) : 0;
        int intValue = themeSettings.message_colors.size() > 1 ? themeSettings.message_colors.get(1).intValue() | (-16777216) : 0;
        g6Var.f = intValue;
        if (g6Var.e == intValue) {
            g6Var.f = 0;
        }
        g6Var.g = themeSettings.message_colors.size() > 2 ? themeSettings.message_colors.get(2).intValue() | (-16777216) : 0;
        g6Var.h = themeSettings.message_colors.size() > 3 ? themeSettings.message_colors.get(3).intValue() | (-16777216) : 0;
        g6Var.i = themeSettings.message_colors_animated;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null) {
            return;
        }
        if (wallPaperSettings.background_color == 0) {
            g6Var.j = 4294967296L;
        } else {
            g6Var.j = j6.a1(r0);
        }
        TLRPC.WallPaperSettings wallPaperSettings2 = themeSettings.wallpaper.settings;
        if ((wallPaperSettings2.flags & 16) == 0 || wallPaperSettings2.second_background_color != 0) {
            g6Var.k = j6.a1(wallPaperSettings2.second_background_color);
        } else {
            g6Var.k = 4294967296L;
        }
        TLRPC.WallPaperSettings wallPaperSettings3 = themeSettings.wallpaper.settings;
        if ((wallPaperSettings3.flags & 32) == 0 || wallPaperSettings3.third_background_color != 0) {
            g6Var.l = j6.a1(wallPaperSettings3.third_background_color);
        } else {
            g6Var.l = 4294967296L;
        }
        TLRPC.WallPaperSettings wallPaperSettings4 = themeSettings.wallpaper.settings;
        if ((wallPaperSettings4.flags & 64) == 0 || wallPaperSettings4.fourth_background_color != 0) {
            g6Var.m = j6.a1(wallPaperSettings4.fourth_background_color);
        } else {
            g6Var.m = 4294967296L;
        }
        g6Var.n = org.telegram.messenger.g0.s1(themeSettings.wallpaper.settings.rotation, false);
        TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
        if ((wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) || !wallPaper2.pattern) {
            return;
        }
        g6Var.o = wallPaper2.slug;
        TLRPC.WallPaperSettings wallPaperSettings5 = wallPaper2.settings;
        g6Var.p = wallPaperSettings5.intensity / 100.0f;
        g6Var.q = wallPaperSettings5.motion;
    }

    public final boolean d(File file, String str) {
        int V0;
        try {
            Bitmap e12 = org.telegram.messenger.g0.e1(org.telegram.messenger.g0.L(640.0f), org.telegram.messenger.g0.L(360.0f), file.getAbsolutePath(), null, 0);
            if (e12 != null && this.r != 0) {
                Bitmap createBitmap = Bitmap.createBitmap(e12.getWidth(), e12.getHeight(), e12.getConfig());
                Canvas canvas = new Canvas(createBitmap);
                int i7 = this.w;
                if (i7 != 0) {
                    V0 = ra0.g(this.r, this.s, i7, this.x);
                } else {
                    int i10 = this.s;
                    if (i10 != 0) {
                        V0 = org.telegram.messenger.g0.w0(this.r, i10);
                        GradientDrawable gradientDrawable = new GradientDrawable(h9.d(this.y), new int[]{this.r, this.s});
                        gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        gradientDrawable.draw(canvas);
                    } else {
                        V0 = org.telegram.messenger.g0.V0(this.r, false);
                        canvas.drawColor(this.r);
                    }
                }
                Paint paint = new Paint(2);
                paint.setColorFilter(new PorterDuffColorFilter(V0, PorterDuff.Mode.SRC_IN));
                paint.setAlpha((int) ((this.E / 100.0f) * 255.0f));
                canvas.drawBitmap(e12, 0.0f, 0.0f, paint);
                canvas.setBitmap(null);
                e12 = createBitmap;
            }
            if (this.h) {
                e12 = Utilities.e(e12);
            }
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            e12.compress(this.w != 0 ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
            fileOutputStream.close();
            return true;
        } catch (Throwable th2) {
            a8.g(th2, true);
            return false;
        }
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ns.Y1;
        if (i7 == i11 || i7 == ns.Z1) {
            String str = (String) objArr[0];
            TLRPC.TL_theme tL_theme = this.G;
            if (tL_theme == null || tL_theme.document == null) {
                return;
            }
            if (str.equals(this.h0)) {
                this.h0 = null;
                Utilities.e.c(new oi.u4(23, this, (File) objArr[1]));
                return;
            }
            if (str.equals(w7.r(null, this.G.document))) {
                t();
                if (i7 == i11) {
                    File file = new File(this.b);
                    TLRPC.TL_theme tL_theme2 = this.G;
                    i6 m0 = j6.m0(file, tL_theme2.title, tL_theme2);
                    if (m0 == null || m0.c == null || new File(m0.c).exists()) {
                        s();
                        return;
                    }
                    this.r = m0.r;
                    this.s = m0.s;
                    this.w = m0.w;
                    this.x = m0.x;
                    this.y = m0.y;
                    this.h = m0.h;
                    this.E = m0.E;
                    this.i0 = m0.c;
                    TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                    tL_inputWallPaperSlug.slug = m0.e;
                    getwallpaper.wallpaper = tL_inputWallPaperSlug;
                    ConnectionsManager.getInstance(m0.F).sendRequest(getwallpaper, new bi.v2(29, this, m0));
                }
            }
        }
    }

    public final g6 e(long j3, TLRPC.ThemeSettings themeSettings, TLRPC.TL_theme tL_theme, int i7, boolean z10) {
        if (z10) {
            LongSparseArray longSparseArray = this.e0;
            g6 g6Var = (g6) longSparseArray.get(j3);
            if (g6Var != null) {
                return g6Var;
            }
            int i10 = this.f0 + 1;
            this.f0 = i10;
            g6 g6Var2 = new g6();
            i(g6Var2, themeSettings);
            g6Var2.b = this;
            g6Var2.a = i10;
            g6Var2.r = tL_theme;
            g6Var2.t = i7;
            longSparseArray.put(i10, g6Var2);
            return g6Var2;
        }
        g6 g6Var3 = (g6) this.d0.get(j3);
        if (g6Var3 != null) {
            return g6Var3;
        }
        int i11 = this.g0 + 1;
        this.g0 = i11;
        g6 g6Var4 = new g6();
        i(g6Var4, themeSettings);
        g6Var4.b = this;
        g6Var4.a = i11;
        g6Var4.r = tL_theme;
        g6Var4.t = i7;
        this.b0.put(i11, g6Var4);
        this.c0.add(0, g6Var4);
        j6.J1(this);
        this.d0.put(j3, g6Var4);
        return g6Var4;
    }

    public final g6 f(TLRPC.TL_theme tL_theme, int i7, int i10) {
        if (tL_theme == null) {
            return null;
        }
        return e(tL_theme.id, i10 < tL_theme.settings.size() ? tL_theme.settings.get(i10) : null, tL_theme, i7, false);
    }

    public final String j(g6 g6Var, boolean z10) {
        String n10;
        if (g6Var == null) {
            g6Var = k(false);
        }
        if (g6Var == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z10 ? a8.p0.s(new StringBuilder(), this.a, "_wp_o") : a8.p0.s(new StringBuilder(), this.a, "_wp"));
            sb2.append(Utilities.b.nextInt());
            sb2.append(".jpg");
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        if (z10) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.a);
            sb4.append("_");
            n10 = a8.p0.n(g6Var.a, "_wp_o", sb4);
        } else {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(this.a);
            sb5.append("_");
            n10 = a8.p0.n(g6Var.a, "_wp", sb5);
        }
        sb3.append(n10);
        sb3.append(Utilities.b.nextInt());
        sb3.append(".jpg");
        return sb3.toString();
    }

    public final g6 k(boolean z10) {
        g6 g6Var;
        if (this.c0 == null || (g6Var = (g6) this.b0.get(this.Z)) == null) {
            return null;
        }
        if (!z10) {
            return g6Var;
        }
        int i7 = this.g0 + 1;
        this.g0 = i7;
        g6 g6Var2 = new g6();
        g6Var2.c = g6Var.c;
        g6Var2.d = g6Var.d;
        g6Var2.e = g6Var.e;
        g6Var2.f = g6Var.f;
        g6Var2.g = g6Var.g;
        g6Var2.h = g6Var.h;
        g6Var2.i = g6Var.i;
        g6Var2.j = g6Var.j;
        g6Var2.k = g6Var.k;
        g6Var2.l = g6Var.l;
        g6Var2.m = g6Var.m;
        g6Var2.n = g6Var.n;
        g6Var2.o = g6Var.o;
        g6Var2.p = g6Var.p;
        g6Var2.q = g6Var.q;
        g6Var2.b = this;
        b6 b6Var = this.j0;
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
            b6Var2.q = g6Var2;
            if (TextUtils.isEmpty(b6Var.a)) {
                b6Var2.a = "";
            } else {
                try {
                    File file = new File(org.telegram.messenger.t0.h(), b6Var.a);
                    File h = org.telegram.messenger.t0.h();
                    String j3 = b6Var2.p.j(b6Var2.q, false);
                    b6Var2.a = j3;
                    org.telegram.messenger.g0.E(file, new File(h, j3));
                } catch (Exception e10) {
                    b6Var2.a = "";
                    a8.g(e10, true);
                }
            }
            if (TextUtils.isEmpty(b6Var.b)) {
                b6Var2.b = "";
            } else if (b6Var.b.equals(b6Var.a)) {
                b6Var2.b = b6Var2.a;
            } else {
                try {
                    File file2 = new File(org.telegram.messenger.t0.h(), b6Var.b);
                    File h7 = org.telegram.messenger.t0.h();
                    String j10 = b6Var2.p.j(b6Var2.q, true);
                    b6Var2.b = j10;
                    org.telegram.messenger.g0.E(file2, new File(h7, j10));
                } catch (Exception e11) {
                    b6Var2.b = "";
                    a8.g(e11, true);
                }
            }
            g6Var2.y = b6Var2;
        }
        this.a0 = this.Z;
        g6Var2.a = i7;
        this.Z = i7;
        this.j0 = g6Var2.y;
        this.b0.put(i7, g6Var2);
        this.c0.add(0, g6Var2);
        j6.J1(this);
        return g6Var2;
    }

    public final int l(int i7) {
        g6 g6Var = (g6) this.b0.get(i7);
        if (g6Var != null) {
            return g6Var.c;
        }
        return 0;
    }

    public final String m() {
        if (this.G == null) {
            return this.a;
        }
        return "remote" + this.G.id;
    }

    public final String n() {
        if ("Blue".equals(this.a)) {
            return hd.M0(2131744186, null);
        }
        if ("Dark Blue".equals(this.a)) {
            return hd.M0(2131744183, null);
        }
        if ("Arctic Blue".equals(this.a)) {
            return hd.M0(2131744187, null);
        }
        if ("Day".equals(this.a)) {
            return hd.M0(2131744182, null);
        }
        if ("Night".equals(this.a)) {
            return hd.M0(2131744175, null);
        }
        TLRPC.TL_theme tL_theme = this.G;
        return tL_theme != null ? tL_theme.title : this.a;
    }

    public final int o() {
        if (this.T && this.Z == j6.n) {
            return -3155485;
        }
        return this.M;
    }

    public final int p() {
        if (this.T && this.Z == j6.n) {
            return -983328;
        }
        return this.S;
    }

    public final boolean q() {
        int i7 = this.k0;
        if (i7 != -1) {
            return i7 == 1;
        }
        if ("Dark Blue".equals(this.a) || "Night".equals(this.a)) {
            this.k0 = 1;
        } else if ("Blue".equals(this.a) || "Arctic Blue".equals(this.a) || "Day".equals(this.a)) {
            this.k0 = 0;
        }
        if (this.k0 == -1) {
            j6.H(j6.T0(new File(this.b), null, new String[1]), this);
        }
        return this.k0 == 1;
    }

    public final void r(SharedPreferences sharedPreferences, g6 g6Var, String str) {
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
            b6Var.q = g6Var;
            if (g6Var != null) {
                g6Var.y = b6Var;
            } else {
                this.j0 = b6Var;
            }
            if (jSONObject.has("wallId") && jSONObject.getLong("wallId") == 1000001) {
                b6Var.c = "d";
            }
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    public final void s() {
        this.H = true;
        this.U = false;
        j6.y1(true, false);
        if (this == j6.I && j6.M == null) {
            j6.K1(this, this == j6.J, -1, null);
        }
    }

    public final void t() {
        ns.f(this.F).n(this, ns.Y1);
        ns.f(this.F).n(this, ns.Z1);
    }

    public final void u(int i7) {
        this.Z = i7;
        g6 k10 = k(false);
        if (k10 != null) {
            this.j0 = k10.y;
        }
    }

    public final void v(b6 b6Var) {
        if (this.j0 == b6Var) {
            return;
        }
        g6 k10 = k(false);
        b6 b6Var2 = this.j0;
        if (b6Var2 != null) {
            b6.a(b6Var2);
        }
        if (b6Var != null) {
            b6Var.q = k10;
            b6Var.p = this;
            b6Var.c();
        }
        this.j0 = b6Var;
        if (k10 != null) {
            k10.y = b6Var;
        }
    }

    public i6(i6 i6Var) {
        this.y = 45;
        this.H = true;
        this.V = true;
        this.a0 = -1;
        this.e0 = new LongSparseArray();
        this.f0 = 0;
        this.g0 = 100;
        this.k0 = -1;
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
        this.d0 = i6Var.d0;
        this.g0 = i6Var.g0;
        this.h0 = i6Var.h0;
        this.i0 = i6Var.i0;
        this.j0 = i6Var.j0;
    }
}
