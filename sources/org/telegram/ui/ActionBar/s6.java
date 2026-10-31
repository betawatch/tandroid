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
import org.telegram.messenger.b8;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.jb0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class s6 implements us {
    public int D;
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
    public m6 i0;
    public int j0;
    public boolean n;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;

    public s6() {
        this.y = 45;
        this.G = true;
        this.U = true;
        this.Z = -1;
        this.d0 = new LongSparseArray();
        this.e0 = 0;
        this.f0 = 100;
        this.j0 = -1;
    }

    public static boolean a(r6 r6Var, TLRPC.ThemeSettings themeSettings) {
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
            i10 = t6.a1(wallPaperSettings.background_color);
            j10 = themeSettings.wallpaper.settings.second_background_color == 0 ? 4294967296L : t6.a1(r11);
            j11 = themeSettings.wallpaper.settings.third_background_color == 0 ? 4294967296L : t6.a1(r11);
            j12 = themeSettings.wallpaper.settings.fourth_background_color != 0 ? t6.a1(r11) : 4294967296L;
            i11 = org.telegram.messenger.i0.s1(themeSettings.wallpaper.settings.rotation, false);
            z10 = false;
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            z11 = true;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                str = wallPaper2.slug;
                f7 = wallPaper2.settings.intensity / 100.0f;
                return (themeSettings.accent_color != r6Var.c && themeSettings.outbox_accent_color == r6Var.d && intValue == r6Var.e && intValue2 == r6Var.f && intValue3 == r6Var.g && intValue4 == r6Var.h && themeSettings.message_colors_animated == r6Var.i && ((long) i10) == r6Var.j && j10 == r6Var.k && j11 == r6Var.l && j12 == r6Var.m && i11 == r6Var.n && TextUtils.equals(str, r6Var.o) && ((double) Math.abs(f7 - r6Var.p)) < 0.001d) ? z11 : z10;
            }
        }
        str = null;
        f7 = 0.0f;
        if (themeSettings.accent_color != r6Var.c) {
        }
    }

    public static void b(s6 s6Var, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, String[] strArr, int[] iArr9, int[] iArr10) {
        s6Var.W = iArr.length;
        s6Var.b0 = new ArrayList();
        s6Var.a0 = new SparseArray();
        s6Var.c0 = new LongSparseArray();
        for (int i10 = 0; i10 < iArr.length; i10++) {
            r6 r6Var = new r6();
            r6Var.a = iArr8[i10];
            if (t6.l1(r6Var)) {
                r6Var.z = true;
            }
            r6Var.c = iArr[i10];
            r6Var.b = s6Var;
            r6Var.e = iArr2[i10];
            r6Var.f = iArr3[i10];
            long j10 = iArr4[i10];
            r6Var.j = j10;
            boolean z10 = s6Var.S;
            if (z10 && r6Var.a == t6.n) {
                r6Var.j = 4294967296L;
            } else {
                r6Var.j = j10;
            }
            if (z10 && r6Var.a == t6.n) {
                r6Var.k = 4294967296L;
            } else {
                r6Var.k = iArr5[i10];
            }
            if (iArr6 != null) {
                if (z10 && r6Var.a == t6.n) {
                    r6Var.l = 4294967296L;
                } else {
                    r6Var.l = iArr6[i10];
                }
            }
            if (iArr7 != null) {
                if (z10 && r6Var.a == t6.n) {
                    r6Var.m = 4294967296L;
                } else {
                    r6Var.m = iArr7[i10];
                }
            }
            r6Var.p = iArr10[i10] / 100.0f;
            r6Var.n = iArr9[i10];
            r6Var.o = strArr[i10];
            if ((t6.l1(r6Var) && s6Var.a.equals("Dark Blue")) || s6Var.a.equals("Night")) {
                r6Var.e = -14316059;
                r6Var.f = -12422433;
                r6Var.g = -8304937;
                r6Var.h = -6340950;
                if (s6Var.a.equals("Night")) {
                    r6Var.p = -0.57f;
                    r6Var.j = -9666650L;
                    r6Var.k = -13749173L;
                    r6Var.l = -8883033L;
                    r6Var.m = -13421992L;
                }
            }
            s6Var.a0.put(r6Var.a, r6Var);
            s6Var.b0.add(r6Var);
        }
        s6Var.X = ((r6) s6Var.a0.get(0)).c;
    }

    public static void c(s6 s6Var, SharedPreferences sharedPreferences) {
        ArrayList arrayList = s6Var.b0;
        if (arrayList == null || arrayList.isEmpty()) {
            s6Var.r(sharedPreferences, null, a1.g.r(new StringBuilder(), s6Var.a, "_owp"));
            return;
        }
        int size = s6Var.b0.size();
        for (int i10 = 0; i10 < size; i10++) {
            r6 r6Var = (r6) s6Var.b0.get(i10);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(s6Var.a);
            sb2.append("_");
            s6Var.r(sharedPreferences, r6Var, a1.g.p(sb2, r6Var.a, "_owp"));
        }
    }

    public static s6 g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            s6 s6Var = new s6();
            s6Var.a = jSONObject.getString("name");
            s6Var.b = jSONObject.getString("path");
            if (jSONObject.has("account")) {
                s6Var.E = jSONObject.getInt("account");
            }
            if (jSONObject.has("info")) {
                try {
                    SerializedData serializedData = new SerializedData(Utilities.v(jSONObject.getString("info")));
                    s6Var.F = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                } catch (Throwable th2) {
                    f8.g(th2, true);
                }
            }
            if (jSONObject.has("loaded")) {
                s6Var.G = jSONObject.getBoolean("loaded");
            }
            return s6Var;
        } catch (Exception e) {
            f8.g(e, true);
            return null;
        }
    }

    public static s6 h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("\\|");
        if (split.length != 2) {
            return null;
        }
        s6 s6Var = new s6();
        s6Var.a = split[0];
        s6Var.b = split[1];
        return s6Var;
    }

    public static void i(r6 r6Var, TLRPC.ThemeSettings themeSettings) {
        TLRPC.WallPaperSettings wallPaperSettings;
        r6Var.c = themeSettings.accent_color;
        r6Var.d = themeSettings.outbox_accent_color;
        r6Var.e = themeSettings.message_colors.size() > 0 ? themeSettings.message_colors.get(0).intValue() | (-16777216) : 0;
        int intValue = themeSettings.message_colors.size() > 1 ? themeSettings.message_colors.get(1).intValue() | (-16777216) : 0;
        r6Var.f = intValue;
        if (r6Var.e == intValue) {
            r6Var.f = 0;
        }
        r6Var.g = themeSettings.message_colors.size() > 2 ? themeSettings.message_colors.get(2).intValue() | (-16777216) : 0;
        r6Var.h = themeSettings.message_colors.size() > 3 ? themeSettings.message_colors.get(3).intValue() | (-16777216) : 0;
        r6Var.i = themeSettings.message_colors_animated;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null) {
            return;
        }
        if (wallPaperSettings.background_color == 0) {
            r6Var.j = 4294967296L;
        } else {
            r6Var.j = t6.a1(r0);
        }
        TLRPC.WallPaperSettings wallPaperSettings2 = themeSettings.wallpaper.settings;
        if ((wallPaperSettings2.flags & 16) == 0 || wallPaperSettings2.second_background_color != 0) {
            r6Var.k = t6.a1(wallPaperSettings2.second_background_color);
        } else {
            r6Var.k = 4294967296L;
        }
        TLRPC.WallPaperSettings wallPaperSettings3 = themeSettings.wallpaper.settings;
        if ((wallPaperSettings3.flags & 32) == 0 || wallPaperSettings3.third_background_color != 0) {
            r6Var.l = t6.a1(wallPaperSettings3.third_background_color);
        } else {
            r6Var.l = 4294967296L;
        }
        TLRPC.WallPaperSettings wallPaperSettings4 = themeSettings.wallpaper.settings;
        if ((wallPaperSettings4.flags & 64) == 0 || wallPaperSettings4.fourth_background_color != 0) {
            r6Var.m = t6.a1(wallPaperSettings4.fourth_background_color);
        } else {
            r6Var.m = 4294967296L;
        }
        r6Var.n = org.telegram.messenger.i0.s1(themeSettings.wallpaper.settings.rotation, false);
        TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
        if ((wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) || !wallPaper2.pattern) {
            return;
        }
        r6Var.o = wallPaper2.slug;
        TLRPC.WallPaperSettings wallPaperSettings5 = wallPaper2.settings;
        r6Var.p = wallPaperSettings5.intensity / 100.0f;
        r6Var.q = wallPaperSettings5.motion;
    }

    public final boolean d(File file, String str) {
        int V0;
        try {
            Bitmap e12 = org.telegram.messenger.i0.e1(org.telegram.messenger.i0.L(640.0f), org.telegram.messenger.i0.L(360.0f), file.getAbsolutePath(), null, 0);
            if (e12 != null && this.r != 0) {
                Bitmap createBitmap = Bitmap.createBitmap(e12.getWidth(), e12.getHeight(), e12.getConfig());
                Canvas canvas = new Canvas(createBitmap);
                int i10 = this.w;
                if (i10 != 0) {
                    V0 = jb0.g(this.r, this.s, i10, this.x);
                } else {
                    int i11 = this.s;
                    if (i11 != 0) {
                        V0 = org.telegram.messenger.i0.w0(this.r, i11);
                        GradientDrawable gradientDrawable = new GradientDrawable(f9.d(this.y), new int[]{this.r, this.s});
                        gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        gradientDrawable.draw(canvas);
                    } else {
                        V0 = org.telegram.messenger.i0.V0(this.r, false);
                        canvas.drawColor(this.r);
                    }
                }
                Paint paint = new Paint(2);
                paint.setColorFilter(new PorterDuffColorFilter(V0, PorterDuff.Mode.SRC_IN));
                paint.setAlpha((int) ((this.D / 100.0f) * 255.0f));
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
            f8.g(th2, true);
            return false;
        }
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = zs.Y1;
        if (i10 == i12 || i10 == zs.Z1) {
            String str = (String) objArr[0];
            TLRPC.TL_theme tL_theme = this.F;
            if (tL_theme == null || tL_theme.document == null) {
                return;
            }
            if (str.equals(this.g0)) {
                this.g0 = null;
                Utilities.e.c(new mh.k(28, this, (File) objArr[1]));
                return;
            }
            if (str.equals(b8.r(null, this.F.document))) {
                t();
                if (i10 == i12) {
                    File file = new File(this.b);
                    TLRPC.TL_theme tL_theme2 = this.F;
                    s6 m0 = t6.m0(file, tL_theme2.title, tL_theme2);
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
                    this.D = m0.D;
                    this.h0 = m0.c;
                    TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                    tL_inputWallPaperSlug.slug = m0.e;
                    getwallpaper.wallpaper = tL_inputWallPaperSlug;
                    ConnectionsManager.getInstance(m0.E).sendRequest(getwallpaper, new ag.k0(11, this, m0));
                }
            }
        }
    }

    public final r6 e(long j10, TLRPC.ThemeSettings themeSettings, TLRPC.TL_theme tL_theme, int i10, boolean z10) {
        if (z10) {
            LongSparseArray longSparseArray = this.d0;
            r6 r6Var = (r6) longSparseArray.get(j10);
            if (r6Var != null) {
                return r6Var;
            }
            int i11 = this.e0 + 1;
            this.e0 = i11;
            r6 r6Var2 = new r6();
            i(r6Var2, themeSettings);
            r6Var2.b = this;
            r6Var2.a = i11;
            r6Var2.r = tL_theme;
            r6Var2.t = i10;
            longSparseArray.put(i11, r6Var2);
            return r6Var2;
        }
        r6 r6Var3 = (r6) this.c0.get(j10);
        if (r6Var3 != null) {
            return r6Var3;
        }
        int i12 = this.f0 + 1;
        this.f0 = i12;
        r6 r6Var4 = new r6();
        i(r6Var4, themeSettings);
        r6Var4.b = this;
        r6Var4.a = i12;
        r6Var4.r = tL_theme;
        r6Var4.t = i10;
        this.a0.put(i12, r6Var4);
        this.b0.add(0, r6Var4);
        t6.J1(this);
        this.c0.put(j10, r6Var4);
        return r6Var4;
    }

    public final r6 f(TLRPC.TL_theme tL_theme, int i10, int i11) {
        if (tL_theme == null) {
            return null;
        }
        return e(tL_theme.id, i11 < tL_theme.settings.size() ? tL_theme.settings.get(i11) : null, tL_theme, i10, false);
    }

    public final String j(r6 r6Var, boolean z10) {
        String p5;
        if (r6Var == null) {
            r6Var = k(false);
        }
        if (r6Var == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z10 ? a1.g.r(new StringBuilder(), this.a, "_wp_o") : a1.g.r(new StringBuilder(), this.a, "_wp"));
            sb2.append(Utilities.b.nextInt());
            sb2.append(".jpg");
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        if (z10) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.a);
            sb4.append("_");
            p5 = a1.g.p(sb4, r6Var.a, "_wp_o");
        } else {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(this.a);
            sb5.append("_");
            p5 = a1.g.p(sb5, r6Var.a, "_wp");
        }
        sb3.append(p5);
        sb3.append(Utilities.b.nextInt());
        sb3.append(".jpg");
        return sb3.toString();
    }

    public final r6 k(boolean z10) {
        r6 r6Var;
        if (this.b0 == null || (r6Var = (r6) this.a0.get(this.Y)) == null) {
            return null;
        }
        if (!z10) {
            return r6Var;
        }
        int i10 = this.f0 + 1;
        this.f0 = i10;
        r6 r6Var2 = new r6();
        r6Var2.c = r6Var.c;
        r6Var2.d = r6Var.d;
        r6Var2.e = r6Var.e;
        r6Var2.f = r6Var.f;
        r6Var2.g = r6Var.g;
        r6Var2.h = r6Var.h;
        r6Var2.i = r6Var.i;
        r6Var2.j = r6Var.j;
        r6Var2.k = r6Var.k;
        r6Var2.l = r6Var.l;
        r6Var2.m = r6Var.m;
        r6Var2.n = r6Var.n;
        r6Var2.o = r6Var.o;
        r6Var2.p = r6Var.p;
        r6Var2.q = r6Var.q;
        r6Var2.b = this;
        m6 m6Var = this.i0;
        if (m6Var != null) {
            m6 m6Var2 = new m6();
            m6Var2.a = "";
            m6Var2.b = "";
            m6Var2.c = "";
            m6Var2.c = m6Var.c;
            m6Var2.d = m6Var.d;
            m6Var2.e = m6Var.e;
            m6Var2.f = m6Var.f;
            m6Var2.g = m6Var.g;
            m6Var2.h = m6Var.h;
            m6Var2.i = m6Var.i;
            m6Var2.j = m6Var.j;
            m6Var2.k = m6Var.k;
            m6Var2.p = this;
            m6Var2.q = r6Var2;
            if (TextUtils.isEmpty(m6Var.a)) {
                m6Var2.a = "";
            } else {
                try {
                    File file = new File(org.telegram.messenger.w0.h(), m6Var.a);
                    File h = org.telegram.messenger.w0.h();
                    String j10 = m6Var2.p.j(m6Var2.q, false);
                    m6Var2.a = j10;
                    org.telegram.messenger.i0.E(file, new File(h, j10));
                } catch (Exception e) {
                    m6Var2.a = "";
                    f8.g(e, true);
                }
            }
            if (TextUtils.isEmpty(m6Var.b)) {
                m6Var2.b = "";
            } else if (m6Var.b.equals(m6Var.a)) {
                m6Var2.b = m6Var2.a;
            } else {
                try {
                    File file2 = new File(org.telegram.messenger.w0.h(), m6Var.b);
                    File h10 = org.telegram.messenger.w0.h();
                    String j11 = m6Var2.p.j(m6Var2.q, true);
                    m6Var2.b = j11;
                    org.telegram.messenger.i0.E(file2, new File(h10, j11));
                } catch (Exception e7) {
                    m6Var2.b = "";
                    f8.g(e7, true);
                }
            }
            r6Var2.y = m6Var2;
        }
        this.Z = this.Y;
        r6Var2.a = i10;
        this.Y = i10;
        this.i0 = r6Var2.y;
        this.a0.put(i10, r6Var2);
        this.b0.add(0, r6Var2);
        t6.J1(this);
        return r6Var2;
    }

    public final int l(int i10) {
        r6 r6Var = (r6) this.a0.get(i10);
        if (r6Var != null) {
            return r6Var.c;
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
            return cd.L0(2131744211, null);
        }
        if ("Dark Blue".equals(this.a)) {
            return cd.L0(2131744208, null);
        }
        if ("Arctic Blue".equals(this.a)) {
            return cd.L0(2131744212, null);
        }
        if ("Day".equals(this.a)) {
            return cd.L0(2131744207, null);
        }
        if ("Night".equals(this.a)) {
            return cd.L0(2131744200, null);
        }
        TLRPC.TL_theme tL_theme = this.F;
        return tL_theme != null ? tL_theme.title : this.a;
    }

    public final int o() {
        if (this.S && this.Y == t6.n) {
            return -3155485;
        }
        return this.L;
    }

    public final int p() {
        if (this.S && this.Y == t6.n) {
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
            t6.H(t6.T0(new File(this.b), null, new String[1]), this);
        }
        return this.j0 == 1;
    }

    public final void r(SharedPreferences sharedPreferences, r6 r6Var, String str) {
        try {
            String string = sharedPreferences.getString(str, null);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(string);
            m6 m6Var = new m6();
            m6Var.a = jSONObject.getString("wall");
            m6Var.b = jSONObject.getString("owall");
            m6Var.d = jSONObject.getInt("pColor");
            m6Var.e = jSONObject.getInt("pGrColor");
            m6Var.f = jSONObject.optInt("pGrColor2");
            m6Var.g = jSONObject.optInt("pGrColor3");
            m6Var.h = jSONObject.getInt("pGrAngle");
            m6Var.c = jSONObject.getString("wallSlug");
            m6Var.i = jSONObject.getBoolean("wBlur");
            m6Var.j = jSONObject.getBoolean("wMotion");
            m6Var.k = (float) jSONObject.getDouble("pIntensity");
            m6Var.p = this;
            m6Var.q = r6Var;
            if (r6Var != null) {
                r6Var.y = m6Var;
            } else {
                this.i0 = m6Var;
            }
            if (jSONObject.has("wallId") && jSONObject.getLong("wallId") == 1000001) {
                m6Var.c = "d";
            }
        } catch (Throwable th2) {
            f8.g(th2, true);
        }
    }

    public final void s() {
        this.G = true;
        this.T = false;
        t6.y1(true, false);
        if (this == t6.I && t6.M == null) {
            t6.K1(this, this == t6.J, -1, null);
        }
    }

    public final void t() {
        zs.f(this.E).n(this, zs.Y1);
        zs.f(this.E).n(this, zs.Z1);
    }

    public final void u(int i10) {
        this.Y = i10;
        r6 k10 = k(false);
        if (k10 != null) {
            this.i0 = k10.y;
        }
    }

    public final void v(m6 m6Var) {
        if (this.i0 == m6Var) {
            return;
        }
        r6 k10 = k(false);
        m6 m6Var2 = this.i0;
        if (m6Var2 != null) {
            m6.a(m6Var2);
        }
        if (m6Var != null) {
            m6Var.q = k10;
            m6Var.p = this;
            m6Var.c();
        }
        this.i0 = m6Var;
        if (k10 != null) {
            k10.y = m6Var;
        }
    }

    public s6(s6 s6Var) {
        this.y = 45;
        this.G = true;
        this.U = true;
        this.Z = -1;
        this.d0 = new LongSparseArray();
        this.e0 = 0;
        this.f0 = 100;
        this.j0 = -1;
        this.a = s6Var.a;
        this.b = s6Var.b;
        this.c = s6Var.c;
        this.d = s6Var.d;
        this.e = s6Var.e;
        this.f = s6Var.f;
        this.h = s6Var.h;
        this.n = s6Var.n;
        this.r = s6Var.r;
        this.s = s6Var.s;
        this.w = s6Var.w;
        this.x = s6Var.x;
        this.y = s6Var.y;
        this.D = s6Var.D;
        this.E = s6Var.E;
        this.F = s6Var.F;
        this.G = s6Var.G;
        this.H = s6Var.H;
        this.I = s6Var.I;
        this.J = s6Var.J;
        this.K = s6Var.K;
        this.L = s6Var.L;
        this.M = s6Var.M;
        this.N = s6Var.N;
        this.O = s6Var.O;
        this.P = s6Var.P;
        this.Q = s6Var.Q;
        this.R = s6Var.R;
        this.S = s6Var.S;
        this.T = s6Var.T;
        this.U = s6Var.U;
        this.V = s6Var.V;
        this.W = s6Var.W;
        this.X = s6Var.X;
        this.Y = s6Var.Y;
        this.Z = s6Var.Z;
        this.a0 = s6Var.a0;
        this.b0 = s6Var.b0;
        this.c0 = s6Var.c0;
        this.f0 = s6Var.f0;
        this.g0 = s6Var.g0;
        this.h0 = s6Var.h0;
        this.i0 = s6Var.i0;
    }
}
