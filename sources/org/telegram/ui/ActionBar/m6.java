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
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.p9;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class m6 implements fs {
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
    public e6 j0;
    public int k0;
    public boolean n;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;

    public m6() {
        this.y = 45;
        this.H = true;
        this.V = true;
        this.a0 = -1;
        this.e0 = new LongSparseArray();
        this.f0 = 0;
        this.g0 = 100;
        this.k0 = -1;
    }

    public static boolean a(k6 k6Var, TLRPC.ThemeSettings themeSettings) {
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
            i7 = n6.a1(wallPaperSettings.background_color);
            j3 = themeSettings.wallpaper.settings.second_background_color == 0 ? 4294967296L : n6.a1(r11);
            j10 = themeSettings.wallpaper.settings.third_background_color == 0 ? 4294967296L : n6.a1(r11);
            j11 = themeSettings.wallpaper.settings.fourth_background_color != 0 ? n6.a1(r11) : 4294967296L;
            i10 = org.telegram.messenger.g0.s1(themeSettings.wallpaper.settings.rotation, false);
            z10 = false;
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            z11 = true;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                str = wallPaper2.slug;
                f10 = wallPaper2.settings.intensity / 100.0f;
                return (themeSettings.accent_color != k6Var.c && themeSettings.outbox_accent_color == k6Var.d && intValue == k6Var.e && intValue2 == k6Var.f && intValue3 == k6Var.g && intValue4 == k6Var.h && themeSettings.message_colors_animated == k6Var.i && ((long) i7) == k6Var.j && j3 == k6Var.k && j10 == k6Var.l && j11 == k6Var.m && i10 == k6Var.n && TextUtils.equals(str, k6Var.o) && ((double) Math.abs(f10 - k6Var.p)) < 0.001d) ? z11 : z10;
            }
        }
        str = null;
        f10 = 0.0f;
        if (themeSettings.accent_color != k6Var.c) {
        }
    }

    public static void b(m6 m6Var, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, String[] strArr, int[] iArr9, int[] iArr10) {
        m6Var.X = iArr.length;
        m6Var.c0 = new ArrayList();
        m6Var.b0 = new SparseArray();
        m6Var.d0 = new LongSparseArray();
        for (int i7 = 0; i7 < iArr.length; i7++) {
            k6 k6Var = new k6();
            k6Var.a = iArr8[i7];
            if (n6.l1(k6Var)) {
                k6Var.z = true;
            }
            k6Var.c = iArr[i7];
            k6Var.b = m6Var;
            k6Var.e = iArr2[i7];
            k6Var.f = iArr3[i7];
            long j3 = iArr4[i7];
            k6Var.j = j3;
            boolean z10 = m6Var.T;
            if (z10 && k6Var.a == n6.n) {
                k6Var.j = 4294967296L;
            } else {
                k6Var.j = j3;
            }
            if (z10 && k6Var.a == n6.n) {
                k6Var.k = 4294967296L;
            } else {
                k6Var.k = iArr5[i7];
            }
            if (iArr6 != null) {
                if (z10 && k6Var.a == n6.n) {
                    k6Var.l = 4294967296L;
                } else {
                    k6Var.l = iArr6[i7];
                }
            }
            if (iArr7 != null) {
                if (z10 && k6Var.a == n6.n) {
                    k6Var.m = 4294967296L;
                } else {
                    k6Var.m = iArr7[i7];
                }
            }
            k6Var.p = iArr10[i7] / 100.0f;
            k6Var.n = iArr9[i7];
            k6Var.o = strArr[i7];
            if ((n6.l1(k6Var) && m6Var.a.equals("Dark Blue")) || m6Var.a.equals("Night")) {
                k6Var.e = -14316059;
                k6Var.f = -12422433;
                k6Var.g = -8304937;
                k6Var.h = -6340950;
                if (m6Var.a.equals("Night")) {
                    k6Var.p = -0.57f;
                    k6Var.j = -9666650L;
                    k6Var.k = -13749173L;
                    k6Var.l = -8883033L;
                    k6Var.m = -13421992L;
                }
            }
            m6Var.b0.put(k6Var.a, k6Var);
            m6Var.c0.add(k6Var);
        }
        m6Var.Y = ((k6) m6Var.b0.get(0)).c;
    }

    public static void c(m6 m6Var, SharedPreferences sharedPreferences) {
        ArrayList arrayList = m6Var.c0;
        if (arrayList == null || arrayList.isEmpty()) {
            m6Var.r(sharedPreferences, null, a8.p0.s(new StringBuilder(), m6Var.a, "_owp"));
            return;
        }
        int size = m6Var.c0.size();
        for (int i7 = 0; i7 < size; i7++) {
            k6 k6Var = (k6) m6Var.c0.get(i7);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m6Var.a);
            sb2.append("_");
            m6Var.r(sharedPreferences, k6Var, a8.p0.n(k6Var.a, "_owp", sb2));
        }
    }

    public static m6 g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            m6 m6Var = new m6();
            m6Var.a = jSONObject.getString("name");
            m6Var.b = jSONObject.getString("path");
            if (jSONObject.has("account")) {
                m6Var.F = jSONObject.getInt("account");
            }
            if (jSONObject.has("info")) {
                try {
                    SerializedData serializedData = new SerializedData(Utilities.v(jSONObject.getString("info")));
                    m6Var.G = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
            }
            if (jSONObject.has("loaded")) {
                m6Var.H = jSONObject.getBoolean("loaded");
            }
            return m6Var;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static m6 h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("\\|");
        if (split.length != 2) {
            return null;
        }
        m6 m6Var = new m6();
        m6Var.a = split[0];
        m6Var.b = split[1];
        return m6Var;
    }

    public static void i(k6 k6Var, TLRPC.ThemeSettings themeSettings) {
        TLRPC.WallPaperSettings wallPaperSettings;
        k6Var.c = themeSettings.accent_color;
        k6Var.d = themeSettings.outbox_accent_color;
        k6Var.e = themeSettings.message_colors.size() > 0 ? themeSettings.message_colors.get(0).intValue() | (-16777216) : 0;
        int intValue = themeSettings.message_colors.size() > 1 ? themeSettings.message_colors.get(1).intValue() | (-16777216) : 0;
        k6Var.f = intValue;
        if (k6Var.e == intValue) {
            k6Var.f = 0;
        }
        k6Var.g = themeSettings.message_colors.size() > 2 ? themeSettings.message_colors.get(2).intValue() | (-16777216) : 0;
        k6Var.h = themeSettings.message_colors.size() > 3 ? themeSettings.message_colors.get(3).intValue() | (-16777216) : 0;
        k6Var.i = themeSettings.message_colors_animated;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null) {
            return;
        }
        if (wallPaperSettings.background_color == 0) {
            k6Var.j = 4294967296L;
        } else {
            k6Var.j = n6.a1(r0);
        }
        TLRPC.WallPaperSettings wallPaperSettings2 = themeSettings.wallpaper.settings;
        if ((wallPaperSettings2.flags & 16) == 0 || wallPaperSettings2.second_background_color != 0) {
            k6Var.k = n6.a1(wallPaperSettings2.second_background_color);
        } else {
            k6Var.k = 4294967296L;
        }
        TLRPC.WallPaperSettings wallPaperSettings3 = themeSettings.wallpaper.settings;
        if ((wallPaperSettings3.flags & 32) == 0 || wallPaperSettings3.third_background_color != 0) {
            k6Var.l = n6.a1(wallPaperSettings3.third_background_color);
        } else {
            k6Var.l = 4294967296L;
        }
        TLRPC.WallPaperSettings wallPaperSettings4 = themeSettings.wallpaper.settings;
        if ((wallPaperSettings4.flags & 64) == 0 || wallPaperSettings4.fourth_background_color != 0) {
            k6Var.m = n6.a1(wallPaperSettings4.fourth_background_color);
        } else {
            k6Var.m = 4294967296L;
        }
        k6Var.n = org.telegram.messenger.g0.s1(themeSettings.wallpaper.settings.rotation, false);
        TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
        if ((wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) || !wallPaper2.pattern) {
            return;
        }
        k6Var.o = wallPaper2.slug;
        TLRPC.WallPaperSettings wallPaperSettings5 = wallPaper2.settings;
        k6Var.p = wallPaperSettings5.intensity / 100.0f;
        k6Var.q = wallPaperSettings5.motion;
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
                    V0 = bb0.g(this.r, this.s, i7, this.x);
                } else {
                    int i10 = this.s;
                    if (i10 != 0) {
                        V0 = org.telegram.messenger.g0.w0(this.r, i10);
                        GradientDrawable gradientDrawable = new GradientDrawable(p9.d(this.y), new int[]{this.r, this.s});
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

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ks.Y1;
        if (i7 == i11 || i7 == ks.Z1) {
            String str = (String) objArr[0];
            TLRPC.TL_theme tL_theme = this.G;
            if (tL_theme == null || tL_theme.document == null) {
                return;
            }
            if (str.equals(this.h0)) {
                this.h0 = null;
                Utilities.e.c(new a2(8, this, (File) objArr[1]));
                return;
            }
            if (str.equals(w7.r(null, this.G.document))) {
                t();
                if (i7 == i11) {
                    File file = new File(this.b);
                    TLRPC.TL_theme tL_theme2 = this.G;
                    m6 m0 = n6.m0(file, tL_theme2.title, tL_theme2);
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
                    ConnectionsManager.getInstance(m0.F).sendRequest(getwallpaper, new f6(this, m0, 1));
                }
            }
        }
    }

    public final k6 e(long j3, TLRPC.ThemeSettings themeSettings, TLRPC.TL_theme tL_theme, int i7, boolean z10) {
        if (z10) {
            LongSparseArray longSparseArray = this.e0;
            k6 k6Var = (k6) longSparseArray.get(j3);
            if (k6Var != null) {
                return k6Var;
            }
            int i10 = this.f0 + 1;
            this.f0 = i10;
            k6 k6Var2 = new k6();
            i(k6Var2, themeSettings);
            k6Var2.b = this;
            k6Var2.a = i10;
            k6Var2.r = tL_theme;
            k6Var2.t = i7;
            longSparseArray.put(i10, k6Var2);
            return k6Var2;
        }
        k6 k6Var3 = (k6) this.d0.get(j3);
        if (k6Var3 != null) {
            return k6Var3;
        }
        int i11 = this.g0 + 1;
        this.g0 = i11;
        k6 k6Var4 = new k6();
        i(k6Var4, themeSettings);
        k6Var4.b = this;
        k6Var4.a = i11;
        k6Var4.r = tL_theme;
        k6Var4.t = i7;
        this.b0.put(i11, k6Var4);
        this.c0.add(0, k6Var4);
        n6.J1(this);
        this.d0.put(j3, k6Var4);
        return k6Var4;
    }

    public final k6 f(TLRPC.TL_theme tL_theme, int i7, int i10) {
        if (tL_theme == null) {
            return null;
        }
        return e(tL_theme.id, i10 < tL_theme.settings.size() ? tL_theme.settings.get(i10) : null, tL_theme, i7, false);
    }

    public final String j(k6 k6Var, boolean z10) {
        String n10;
        if (k6Var == null) {
            k6Var = k(false);
        }
        if (k6Var == null) {
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
            n10 = a8.p0.n(k6Var.a, "_wp_o", sb4);
        } else {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(this.a);
            sb5.append("_");
            n10 = a8.p0.n(k6Var.a, "_wp", sb5);
        }
        sb3.append(n10);
        sb3.append(Utilities.b.nextInt());
        sb3.append(".jpg");
        return sb3.toString();
    }

    public final k6 k(boolean z10) {
        k6 k6Var;
        if (this.c0 == null || (k6Var = (k6) this.b0.get(this.Z)) == null) {
            return null;
        }
        if (!z10) {
            return k6Var;
        }
        int i7 = this.g0 + 1;
        this.g0 = i7;
        k6 k6Var2 = new k6();
        k6Var2.c = k6Var.c;
        k6Var2.d = k6Var.d;
        k6Var2.e = k6Var.e;
        k6Var2.f = k6Var.f;
        k6Var2.g = k6Var.g;
        k6Var2.h = k6Var.h;
        k6Var2.i = k6Var.i;
        k6Var2.j = k6Var.j;
        k6Var2.k = k6Var.k;
        k6Var2.l = k6Var.l;
        k6Var2.m = k6Var.m;
        k6Var2.n = k6Var.n;
        k6Var2.o = k6Var.o;
        k6Var2.p = k6Var.p;
        k6Var2.q = k6Var.q;
        k6Var2.b = this;
        e6 e6Var = this.j0;
        if (e6Var != null) {
            e6 e6Var2 = new e6();
            e6Var2.a = "";
            e6Var2.b = "";
            e6Var2.c = "";
            e6Var2.c = e6Var.c;
            e6Var2.d = e6Var.d;
            e6Var2.e = e6Var.e;
            e6Var2.f = e6Var.f;
            e6Var2.g = e6Var.g;
            e6Var2.h = e6Var.h;
            e6Var2.i = e6Var.i;
            e6Var2.j = e6Var.j;
            e6Var2.k = e6Var.k;
            e6Var2.p = this;
            e6Var2.q = k6Var2;
            if (TextUtils.isEmpty(e6Var.a)) {
                e6Var2.a = "";
            } else {
                try {
                    File file = new File(org.telegram.messenger.t0.h(), e6Var.a);
                    File h = org.telegram.messenger.t0.h();
                    String j3 = e6Var2.p.j(e6Var2.q, false);
                    e6Var2.a = j3;
                    org.telegram.messenger.g0.E(file, new File(h, j3));
                } catch (Exception e10) {
                    e6Var2.a = "";
                    a8.g(e10, true);
                }
            }
            if (TextUtils.isEmpty(e6Var.b)) {
                e6Var2.b = "";
            } else if (e6Var.b.equals(e6Var.a)) {
                e6Var2.b = e6Var2.a;
            } else {
                try {
                    File file2 = new File(org.telegram.messenger.t0.h(), e6Var.b);
                    File h7 = org.telegram.messenger.t0.h();
                    String j10 = e6Var2.p.j(e6Var2.q, true);
                    e6Var2.b = j10;
                    org.telegram.messenger.g0.E(file2, new File(h7, j10));
                } catch (Exception e11) {
                    e6Var2.b = "";
                    a8.g(e11, true);
                }
            }
            k6Var2.y = e6Var2;
        }
        this.a0 = this.Z;
        k6Var2.a = i7;
        this.Z = i7;
        this.j0 = k6Var2.y;
        this.b0.put(i7, k6Var2);
        this.c0.add(0, k6Var2);
        n6.J1(this);
        return k6Var2;
    }

    public final int l(int i7) {
        k6 k6Var = (k6) this.b0.get(i7);
        if (k6Var != null) {
            return k6Var.c;
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
            return gd.M0(2131743951, null);
        }
        if ("Dark Blue".equals(this.a)) {
            return gd.M0(2131743948, null);
        }
        if ("Arctic Blue".equals(this.a)) {
            return gd.M0(2131743952, null);
        }
        if ("Day".equals(this.a)) {
            return gd.M0(2131743947, null);
        }
        if ("Night".equals(this.a)) {
            return gd.M0(2131743940, null);
        }
        TLRPC.TL_theme tL_theme = this.G;
        return tL_theme != null ? tL_theme.title : this.a;
    }

    public final int o() {
        if (this.T && this.Z == n6.n) {
            return -3155485;
        }
        return this.M;
    }

    public final int p() {
        if (this.T && this.Z == n6.n) {
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
            n6.H(n6.T0(new File(this.b), null, new String[1]), this);
        }
        return this.k0 == 1;
    }

    public final void r(SharedPreferences sharedPreferences, k6 k6Var, String str) {
        try {
            String string = sharedPreferences.getString(str, null);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(string);
            e6 e6Var = new e6();
            e6Var.a = jSONObject.getString("wall");
            e6Var.b = jSONObject.getString("owall");
            e6Var.d = jSONObject.getInt("pColor");
            e6Var.e = jSONObject.getInt("pGrColor");
            e6Var.f = jSONObject.optInt("pGrColor2");
            e6Var.g = jSONObject.optInt("pGrColor3");
            e6Var.h = jSONObject.getInt("pGrAngle");
            e6Var.c = jSONObject.getString("wallSlug");
            e6Var.i = jSONObject.getBoolean("wBlur");
            e6Var.j = jSONObject.getBoolean("wMotion");
            e6Var.k = (float) jSONObject.getDouble("pIntensity");
            e6Var.p = this;
            e6Var.q = k6Var;
            if (k6Var != null) {
                k6Var.y = e6Var;
            } else {
                this.j0 = e6Var;
            }
            if (jSONObject.has("wallId") && jSONObject.getLong("wallId") == 1000001) {
                e6Var.c = "d";
            }
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    public final void s() {
        this.H = true;
        this.U = false;
        n6.y1(true, false);
        if (this == n6.I && n6.M == null) {
            n6.K1(this, this == n6.J, -1, null);
        }
    }

    public final void t() {
        ks.f(this.F).n(this, ks.Y1);
        ks.f(this.F).n(this, ks.Z1);
    }

    public final void u(int i7) {
        this.Z = i7;
        k6 k10 = k(false);
        if (k10 != null) {
            this.j0 = k10.y;
        }
    }

    public final void v(e6 e6Var) {
        if (this.j0 == e6Var) {
            return;
        }
        k6 k10 = k(false);
        e6 e6Var2 = this.j0;
        if (e6Var2 != null) {
            e6.a(e6Var2);
        }
        if (e6Var != null) {
            e6Var.q = k10;
            e6Var.p = this;
            e6Var.c();
        }
        this.j0 = e6Var;
        if (k10 != null) {
            k10.y = e6Var;
        }
    }

    public m6(m6 m6Var) {
        this.y = 45;
        this.H = true;
        this.V = true;
        this.a0 = -1;
        this.e0 = new LongSparseArray();
        this.f0 = 0;
        this.g0 = 100;
        this.k0 = -1;
        this.a = m6Var.a;
        this.b = m6Var.b;
        this.c = m6Var.c;
        this.d = m6Var.d;
        this.e = m6Var.e;
        this.f = m6Var.f;
        this.h = m6Var.h;
        this.n = m6Var.n;
        this.r = m6Var.r;
        this.s = m6Var.s;
        this.w = m6Var.w;
        this.x = m6Var.x;
        this.y = m6Var.y;
        this.E = m6Var.E;
        this.F = m6Var.F;
        this.G = m6Var.G;
        this.H = m6Var.H;
        this.I = m6Var.I;
        this.J = m6Var.J;
        this.K = m6Var.K;
        this.L = m6Var.L;
        this.M = m6Var.M;
        this.N = m6Var.N;
        this.O = m6Var.O;
        this.P = m6Var.P;
        this.Q = m6Var.Q;
        this.R = m6Var.R;
        this.S = m6Var.S;
        this.T = m6Var.T;
        this.U = m6Var.U;
        this.V = m6Var.V;
        this.W = m6Var.W;
        this.X = m6Var.X;
        this.Y = m6Var.Y;
        this.Z = m6Var.Z;
        this.a0 = m6Var.a0;
        this.b0 = m6Var.b0;
        this.c0 = m6Var.c0;
        this.d0 = m6Var.d0;
        this.g0 = m6Var.g0;
        this.h0 = m6Var.h0;
        this.i0 = m6Var.i0;
        this.j0 = m6Var.j0;
    }
}
