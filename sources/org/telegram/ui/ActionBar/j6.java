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
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.qa0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class j6 implements ls {
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
    public c6 i0;
    public int j0;
    public boolean n;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;

    public j6() {
        this.y = 45;
        this.G = true;
        this.U = true;
        this.Z = -1;
        this.d0 = new LongSparseArray();
        this.e0 = 0;
        this.f0 = 100;
        this.j0 = -1;
    }

    public static boolean a(h6 h6Var, TLRPC.ThemeSettings themeSettings) {
        boolean z9;
        boolean z10;
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
            z9 = false;
            z10 = true;
            j3 = 0;
            j10 = 0;
            j11 = 0;
            i7 = 0;
            i10 = 0;
        } else {
            i7 = k6.a1(wallPaperSettings.background_color);
            j3 = themeSettings.wallpaper.settings.second_background_color == 0 ? 4294967296L : k6.a1(r11);
            j10 = themeSettings.wallpaper.settings.third_background_color == 0 ? 4294967296L : k6.a1(r11);
            j11 = themeSettings.wallpaper.settings.fourth_background_color != 0 ? k6.a1(r11) : 4294967296L;
            i10 = org.telegram.messenger.g0.s1(themeSettings.wallpaper.settings.rotation, false);
            z9 = false;
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            z10 = true;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                str = wallPaper2.slug;
                f10 = wallPaper2.settings.intensity / 100.0f;
                return (themeSettings.accent_color != h6Var.c && themeSettings.outbox_accent_color == h6Var.d && intValue == h6Var.e && intValue2 == h6Var.f && intValue3 == h6Var.g && intValue4 == h6Var.h && themeSettings.message_colors_animated == h6Var.i && ((long) i7) == h6Var.j && j3 == h6Var.k && j10 == h6Var.l && j11 == h6Var.m && i10 == h6Var.n && TextUtils.equals(str, h6Var.o) && ((double) Math.abs(f10 - h6Var.p)) < 0.001d) ? z10 : z9;
            }
        }
        str = null;
        f10 = 0.0f;
        if (themeSettings.accent_color != h6Var.c) {
        }
    }

    public static void b(j6 j6Var, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, String[] strArr, int[] iArr9, int[] iArr10) {
        j6Var.W = iArr.length;
        j6Var.b0 = new ArrayList();
        j6Var.a0 = new SparseArray();
        j6Var.c0 = new LongSparseArray();
        for (int i7 = 0; i7 < iArr.length; i7++) {
            h6 h6Var = new h6();
            h6Var.a = iArr8[i7];
            if (k6.l1(h6Var)) {
                h6Var.z = true;
            }
            h6Var.c = iArr[i7];
            h6Var.b = j6Var;
            h6Var.e = iArr2[i7];
            h6Var.f = iArr3[i7];
            long j3 = iArr4[i7];
            h6Var.j = j3;
            boolean z9 = j6Var.S;
            if (z9 && h6Var.a == k6.n) {
                h6Var.j = 4294967296L;
            } else {
                h6Var.j = j3;
            }
            if (z9 && h6Var.a == k6.n) {
                h6Var.k = 4294967296L;
            } else {
                h6Var.k = iArr5[i7];
            }
            if (iArr6 != null) {
                if (z9 && h6Var.a == k6.n) {
                    h6Var.l = 4294967296L;
                } else {
                    h6Var.l = iArr6[i7];
                }
            }
            if (iArr7 != null) {
                if (z9 && h6Var.a == k6.n) {
                    h6Var.m = 4294967296L;
                } else {
                    h6Var.m = iArr7[i7];
                }
            }
            h6Var.p = iArr10[i7] / 100.0f;
            h6Var.n = iArr9[i7];
            h6Var.o = strArr[i7];
            if ((k6.l1(h6Var) && j6Var.a.equals("Dark Blue")) || j6Var.a.equals("Night")) {
                h6Var.e = -14316059;
                h6Var.f = -12422433;
                h6Var.g = -8304937;
                h6Var.h = -6340950;
                if (j6Var.a.equals("Night")) {
                    h6Var.p = -0.57f;
                    h6Var.j = -9666650L;
                    h6Var.k = -13749173L;
                    h6Var.l = -8883033L;
                    h6Var.m = -13421992L;
                }
            }
            j6Var.a0.put(h6Var.a, h6Var);
            j6Var.b0.add(h6Var);
        }
        j6Var.X = ((h6) j6Var.a0.get(0)).c;
    }

    public static void c(j6 j6Var, SharedPreferences sharedPreferences) {
        ArrayList arrayList = j6Var.b0;
        if (arrayList == null || arrayList.isEmpty()) {
            j6Var.r(sharedPreferences, null, a8.p0.s(new StringBuilder(), j6Var.a, "_owp"));
            return;
        }
        int size = j6Var.b0.size();
        for (int i7 = 0; i7 < size; i7++) {
            h6 h6Var = (h6) j6Var.b0.get(i7);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(j6Var.a);
            sb2.append("_");
            j6Var.r(sharedPreferences, h6Var, a8.p0.n(h6Var.a, "_owp", sb2));
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
                j6Var.E = jSONObject.getInt("account");
            }
            if (jSONObject.has("info")) {
                try {
                    SerializedData serializedData = new SerializedData(Utilities.v(jSONObject.getString("info")));
                    j6Var.F = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
            }
            if (jSONObject.has("loaded")) {
                j6Var.G = jSONObject.getBoolean("loaded");
            }
            return j6Var;
        } catch (Exception e10) {
            a8.g(e10, true);
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
            h6Var.j = k6.a1(r0);
        }
        TLRPC.WallPaperSettings wallPaperSettings2 = themeSettings.wallpaper.settings;
        if ((wallPaperSettings2.flags & 16) == 0 || wallPaperSettings2.second_background_color != 0) {
            h6Var.k = k6.a1(wallPaperSettings2.second_background_color);
        } else {
            h6Var.k = 4294967296L;
        }
        TLRPC.WallPaperSettings wallPaperSettings3 = themeSettings.wallpaper.settings;
        if ((wallPaperSettings3.flags & 32) == 0 || wallPaperSettings3.third_background_color != 0) {
            h6Var.l = k6.a1(wallPaperSettings3.third_background_color);
        } else {
            h6Var.l = 4294967296L;
        }
        TLRPC.WallPaperSettings wallPaperSettings4 = themeSettings.wallpaper.settings;
        if ((wallPaperSettings4.flags & 64) == 0 || wallPaperSettings4.fourth_background_color != 0) {
            h6Var.m = k6.a1(wallPaperSettings4.fourth_background_color);
        } else {
            h6Var.m = 4294967296L;
        }
        h6Var.n = org.telegram.messenger.g0.s1(themeSettings.wallpaper.settings.rotation, false);
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
        int V0;
        try {
            Bitmap e12 = org.telegram.messenger.g0.e1(org.telegram.messenger.g0.L(640.0f), org.telegram.messenger.g0.L(360.0f), file.getAbsolutePath(), null, 0);
            if (e12 != null && this.r != 0) {
                Bitmap createBitmap = Bitmap.createBitmap(e12.getWidth(), e12.getHeight(), e12.getConfig());
                Canvas canvas = new Canvas(createBitmap);
                int i7 = this.w;
                if (i7 != 0) {
                    V0 = qa0.g(this.r, this.s, i7, this.x);
                } else {
                    int i10 = this.s;
                    if (i10 != 0) {
                        V0 = org.telegram.messenger.g0.w0(this.r, i10);
                        GradientDrawable gradientDrawable = new GradientDrawable(k9.d(this.y), new int[]{this.r, this.s});
                        gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        gradientDrawable.draw(canvas);
                    } else {
                        V0 = org.telegram.messenger.g0.V0(this.r, false);
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
            a8.g(th2, true);
            return false;
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = qs.Y1;
        if (i7 == i11 || i7 == qs.Z1) {
            String str = (String) objArr[0];
            TLRPC.TL_theme tL_theme = this.F;
            if (tL_theme == null || tL_theme.document == null) {
                return;
            }
            if (str.equals(this.g0)) {
                this.g0 = null;
                Utilities.e.c(new p(4, this, (File) objArr[1]));
                return;
            }
            if (str.equals(w7.r(null, this.F.document))) {
                t();
                if (i7 == i11) {
                    File file = new File(this.b);
                    TLRPC.TL_theme tL_theme2 = this.F;
                    j6 m0 = k6.m0(file, tL_theme2.title, tL_theme2);
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
                    ConnectionsManager.getInstance(m0.E).sendRequest(getwallpaper, new bi.j(27, this, m0));
                }
            }
        }
    }

    public final h6 e(long j3, TLRPC.ThemeSettings themeSettings, TLRPC.TL_theme tL_theme, int i7, boolean z9) {
        if (z9) {
            LongSparseArray longSparseArray = this.d0;
            h6 h6Var = (h6) longSparseArray.get(j3);
            if (h6Var != null) {
                return h6Var;
            }
            int i10 = this.e0 + 1;
            this.e0 = i10;
            h6 h6Var2 = new h6();
            i(h6Var2, themeSettings);
            h6Var2.b = this;
            h6Var2.a = i10;
            h6Var2.r = tL_theme;
            h6Var2.t = i7;
            longSparseArray.put(i10, h6Var2);
            return h6Var2;
        }
        h6 h6Var3 = (h6) this.c0.get(j3);
        if (h6Var3 != null) {
            return h6Var3;
        }
        int i11 = this.f0 + 1;
        this.f0 = i11;
        h6 h6Var4 = new h6();
        i(h6Var4, themeSettings);
        h6Var4.b = this;
        h6Var4.a = i11;
        h6Var4.r = tL_theme;
        h6Var4.t = i7;
        this.a0.put(i11, h6Var4);
        this.b0.add(0, h6Var4);
        k6.J1(this);
        this.c0.put(j3, h6Var4);
        return h6Var4;
    }

    public final h6 f(TLRPC.TL_theme tL_theme, int i7, int i10) {
        if (tL_theme == null) {
            return null;
        }
        return e(tL_theme.id, i10 < tL_theme.settings.size() ? tL_theme.settings.get(i10) : null, tL_theme, i7, false);
    }

    public final String j(h6 h6Var, boolean z9) {
        String n10;
        if (h6Var == null) {
            h6Var = k(false);
        }
        if (h6Var == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z9 ? a8.p0.s(new StringBuilder(), this.a, "_wp_o") : a8.p0.s(new StringBuilder(), this.a, "_wp"));
            sb2.append(Utilities.b.nextInt());
            sb2.append(".jpg");
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        if (z9) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.a);
            sb4.append("_");
            n10 = a8.p0.n(h6Var.a, "_wp_o", sb4);
        } else {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(this.a);
            sb5.append("_");
            n10 = a8.p0.n(h6Var.a, "_wp", sb5);
        }
        sb3.append(n10);
        sb3.append(Utilities.b.nextInt());
        sb3.append(".jpg");
        return sb3.toString();
    }

    public final h6 k(boolean z9) {
        h6 h6Var;
        if (this.b0 == null || (h6Var = (h6) this.a0.get(this.Y)) == null) {
            return null;
        }
        if (!z9) {
            return h6Var;
        }
        int i7 = this.f0 + 1;
        this.f0 = i7;
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
        c6 c6Var = this.i0;
        if (c6Var != null) {
            c6 c6Var2 = new c6();
            c6Var2.a = "";
            c6Var2.b = "";
            c6Var2.c = "";
            c6Var2.c = c6Var.c;
            c6Var2.d = c6Var.d;
            c6Var2.e = c6Var.e;
            c6Var2.f = c6Var.f;
            c6Var2.g = c6Var.g;
            c6Var2.h = c6Var.h;
            c6Var2.i = c6Var.i;
            c6Var2.j = c6Var.j;
            c6Var2.k = c6Var.k;
            c6Var2.p = this;
            c6Var2.q = h6Var2;
            if (TextUtils.isEmpty(c6Var.a)) {
                c6Var2.a = "";
            } else {
                try {
                    File file = new File(org.telegram.messenger.t0.h(), c6Var.a);
                    File h = org.telegram.messenger.t0.h();
                    String j3 = c6Var2.p.j(c6Var2.q, false);
                    c6Var2.a = j3;
                    org.telegram.messenger.g0.E(file, new File(h, j3));
                } catch (Exception e10) {
                    c6Var2.a = "";
                    a8.g(e10, true);
                }
            }
            if (TextUtils.isEmpty(c6Var.b)) {
                c6Var2.b = "";
            } else if (c6Var.b.equals(c6Var.a)) {
                c6Var2.b = c6Var2.a;
            } else {
                try {
                    File file2 = new File(org.telegram.messenger.t0.h(), c6Var.b);
                    File h7 = org.telegram.messenger.t0.h();
                    String j10 = c6Var2.p.j(c6Var2.q, true);
                    c6Var2.b = j10;
                    org.telegram.messenger.g0.E(file2, new File(h7, j10));
                } catch (Exception e11) {
                    c6Var2.b = "";
                    a8.g(e11, true);
                }
            }
            h6Var2.y = c6Var2;
        }
        this.Z = this.Y;
        h6Var2.a = i7;
        this.Y = i7;
        this.i0 = h6Var2.y;
        this.a0.put(i7, h6Var2);
        this.b0.add(0, h6Var2);
        k6.J1(this);
        return h6Var2;
    }

    public final int l(int i7) {
        h6 h6Var = (h6) this.a0.get(i7);
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
            return hd.M0(2131744187, null);
        }
        if ("Dark Blue".equals(this.a)) {
            return hd.M0(2131744184, null);
        }
        if ("Arctic Blue".equals(this.a)) {
            return hd.M0(2131744188, null);
        }
        if ("Day".equals(this.a)) {
            return hd.M0(2131744183, null);
        }
        if ("Night".equals(this.a)) {
            return hd.M0(2131744176, null);
        }
        TLRPC.TL_theme tL_theme = this.F;
        return tL_theme != null ? tL_theme.title : this.a;
    }

    public final int o() {
        if (this.S && this.Y == k6.n) {
            return -3155485;
        }
        return this.L;
    }

    public final int p() {
        if (this.S && this.Y == k6.n) {
            return -983328;
        }
        return this.R;
    }

    public final boolean q() {
        int i7 = this.j0;
        if (i7 != -1) {
            return i7 == 1;
        }
        if ("Dark Blue".equals(this.a) || "Night".equals(this.a)) {
            this.j0 = 1;
        } else if ("Blue".equals(this.a) || "Arctic Blue".equals(this.a) || "Day".equals(this.a)) {
            this.j0 = 0;
        }
        if (this.j0 == -1) {
            k6.H(k6.T0(new File(this.b), null, new String[1]), this);
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
            c6 c6Var = new c6();
            c6Var.a = jSONObject.getString("wall");
            c6Var.b = jSONObject.getString("owall");
            c6Var.d = jSONObject.getInt("pColor");
            c6Var.e = jSONObject.getInt("pGrColor");
            c6Var.f = jSONObject.optInt("pGrColor2");
            c6Var.g = jSONObject.optInt("pGrColor3");
            c6Var.h = jSONObject.getInt("pGrAngle");
            c6Var.c = jSONObject.getString("wallSlug");
            c6Var.i = jSONObject.getBoolean("wBlur");
            c6Var.j = jSONObject.getBoolean("wMotion");
            c6Var.k = (float) jSONObject.getDouble("pIntensity");
            c6Var.p = this;
            c6Var.q = h6Var;
            if (h6Var != null) {
                h6Var.y = c6Var;
            } else {
                this.i0 = c6Var;
            }
            if (jSONObject.has("wallId") && jSONObject.getLong("wallId") == 1000001) {
                c6Var.c = "d";
            }
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    public final void s() {
        this.G = true;
        this.T = false;
        k6.y1(true, false);
        if (this == k6.I && k6.M == null) {
            k6.K1(this, this == k6.J, -1, null);
        }
    }

    public final void t() {
        qs.f(this.E).n(this, qs.Y1);
        qs.f(this.E).n(this, qs.Z1);
    }

    public final void u(int i7) {
        this.Y = i7;
        h6 k10 = k(false);
        if (k10 != null) {
            this.i0 = k10.y;
        }
    }

    public final void v(c6 c6Var) {
        if (this.i0 == c6Var) {
            return;
        }
        h6 k10 = k(false);
        c6 c6Var2 = this.i0;
        if (c6Var2 != null) {
            c6.a(c6Var2);
        }
        if (c6Var != null) {
            c6Var.q = k10;
            c6Var.p = this;
            c6Var.c();
        }
        this.i0 = c6Var;
        if (k10 != null) {
            k10.y = c6Var;
        }
    }

    public j6(j6 j6Var) {
        this.y = 45;
        this.G = true;
        this.U = true;
        this.Z = -1;
        this.d0 = new LongSparseArray();
        this.e0 = 0;
        this.f0 = 100;
        this.j0 = -1;
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
        this.w = j6Var.w;
        this.x = j6Var.x;
        this.y = j6Var.y;
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
        this.a0 = j6Var.a0;
        this.b0 = j6Var.b0;
        this.c0 = j6Var.c0;
        this.f0 = j6Var.f0;
        this.g0 = j6Var.g0;
        this.h0 = j6Var.h0;
        this.i0 = j6Var.i0;
    }
}
