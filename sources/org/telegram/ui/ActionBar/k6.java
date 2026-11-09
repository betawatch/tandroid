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
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.ra0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class k6 implements ls {
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
    public d6 i0;
    public int j0;
    public boolean n;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;

    public k6() {
        this.y = 45;
        this.G = true;
        this.U = true;
        this.Z = -1;
        this.d0 = new LongSparseArray();
        this.e0 = 0;
        this.f0 = 100;
        this.j0 = -1;
    }

    public static boolean a(i6 i6Var, TLRPC.ThemeSettings themeSettings) {
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
            i7 = l6.a1(wallPaperSettings.background_color);
            j3 = themeSettings.wallpaper.settings.second_background_color == 0 ? 4294967296L : l6.a1(r11);
            j10 = themeSettings.wallpaper.settings.third_background_color == 0 ? 4294967296L : l6.a1(r11);
            j11 = themeSettings.wallpaper.settings.fourth_background_color != 0 ? l6.a1(r11) : 4294967296L;
            i10 = org.telegram.messenger.g0.s1(themeSettings.wallpaper.settings.rotation, false);
            z9 = false;
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            z10 = true;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                str = wallPaper2.slug;
                f10 = wallPaper2.settings.intensity / 100.0f;
                return (themeSettings.accent_color != i6Var.c && themeSettings.outbox_accent_color == i6Var.d && intValue == i6Var.e && intValue2 == i6Var.f && intValue3 == i6Var.g && intValue4 == i6Var.h && themeSettings.message_colors_animated == i6Var.i && ((long) i7) == i6Var.j && j3 == i6Var.k && j10 == i6Var.l && j11 == i6Var.m && i10 == i6Var.n && TextUtils.equals(str, i6Var.o) && ((double) Math.abs(f10 - i6Var.p)) < 0.001d) ? z10 : z9;
            }
        }
        str = null;
        f10 = 0.0f;
        if (themeSettings.accent_color != i6Var.c) {
        }
    }

    public static void b(k6 k6Var, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, String[] strArr, int[] iArr9, int[] iArr10) {
        k6Var.W = iArr.length;
        k6Var.b0 = new ArrayList();
        k6Var.a0 = new SparseArray();
        k6Var.c0 = new LongSparseArray();
        for (int i7 = 0; i7 < iArr.length; i7++) {
            i6 i6Var = new i6();
            i6Var.a = iArr8[i7];
            if (l6.l1(i6Var)) {
                i6Var.z = true;
            }
            i6Var.c = iArr[i7];
            i6Var.b = k6Var;
            i6Var.e = iArr2[i7];
            i6Var.f = iArr3[i7];
            long j3 = iArr4[i7];
            i6Var.j = j3;
            boolean z9 = k6Var.S;
            if (z9 && i6Var.a == l6.n) {
                i6Var.j = 4294967296L;
            } else {
                i6Var.j = j3;
            }
            if (z9 && i6Var.a == l6.n) {
                i6Var.k = 4294967296L;
            } else {
                i6Var.k = iArr5[i7];
            }
            if (iArr6 != null) {
                if (z9 && i6Var.a == l6.n) {
                    i6Var.l = 4294967296L;
                } else {
                    i6Var.l = iArr6[i7];
                }
            }
            if (iArr7 != null) {
                if (z9 && i6Var.a == l6.n) {
                    i6Var.m = 4294967296L;
                } else {
                    i6Var.m = iArr7[i7];
                }
            }
            i6Var.p = iArr10[i7] / 100.0f;
            i6Var.n = iArr9[i7];
            i6Var.o = strArr[i7];
            if ((l6.l1(i6Var) && k6Var.a.equals("Dark Blue")) || k6Var.a.equals("Night")) {
                i6Var.e = -14316059;
                i6Var.f = -12422433;
                i6Var.g = -8304937;
                i6Var.h = -6340950;
                if (k6Var.a.equals("Night")) {
                    i6Var.p = -0.57f;
                    i6Var.j = -9666650L;
                    i6Var.k = -13749173L;
                    i6Var.l = -8883033L;
                    i6Var.m = -13421992L;
                }
            }
            k6Var.a0.put(i6Var.a, i6Var);
            k6Var.b0.add(i6Var);
        }
        k6Var.X = ((i6) k6Var.a0.get(0)).c;
    }

    public static void c(k6 k6Var, SharedPreferences sharedPreferences) {
        ArrayList arrayList = k6Var.b0;
        if (arrayList == null || arrayList.isEmpty()) {
            k6Var.r(sharedPreferences, null, a8.p0.s(new StringBuilder(), k6Var.a, "_owp"));
            return;
        }
        int size = k6Var.b0.size();
        for (int i7 = 0; i7 < size; i7++) {
            i6 i6Var = (i6) k6Var.b0.get(i7);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(k6Var.a);
            sb2.append("_");
            k6Var.r(sharedPreferences, i6Var, a8.p0.n(i6Var.a, "_owp", sb2));
        }
    }

    public static k6 g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            k6 k6Var = new k6();
            k6Var.a = jSONObject.getString("name");
            k6Var.b = jSONObject.getString("path");
            if (jSONObject.has("account")) {
                k6Var.E = jSONObject.getInt("account");
            }
            if (jSONObject.has("info")) {
                try {
                    SerializedData serializedData = new SerializedData(Utilities.v(jSONObject.getString("info")));
                    k6Var.F = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
            }
            if (jSONObject.has("loaded")) {
                k6Var.G = jSONObject.getBoolean("loaded");
            }
            return k6Var;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static k6 h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("\\|");
        if (split.length != 2) {
            return null;
        }
        k6 k6Var = new k6();
        k6Var.a = split[0];
        k6Var.b = split[1];
        return k6Var;
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
            i6Var.j = l6.a1(r0);
        }
        TLRPC.WallPaperSettings wallPaperSettings2 = themeSettings.wallpaper.settings;
        if ((wallPaperSettings2.flags & 16) == 0 || wallPaperSettings2.second_background_color != 0) {
            i6Var.k = l6.a1(wallPaperSettings2.second_background_color);
        } else {
            i6Var.k = 4294967296L;
        }
        TLRPC.WallPaperSettings wallPaperSettings3 = themeSettings.wallpaper.settings;
        if ((wallPaperSettings3.flags & 32) == 0 || wallPaperSettings3.third_background_color != 0) {
            i6Var.l = l6.a1(wallPaperSettings3.third_background_color);
        } else {
            i6Var.l = 4294967296L;
        }
        TLRPC.WallPaperSettings wallPaperSettings4 = themeSettings.wallpaper.settings;
        if ((wallPaperSettings4.flags & 64) == 0 || wallPaperSettings4.fourth_background_color != 0) {
            i6Var.m = l6.a1(wallPaperSettings4.fourth_background_color);
        } else {
            i6Var.m = 4294967296L;
        }
        i6Var.n = org.telegram.messenger.g0.s1(themeSettings.wallpaper.settings.rotation, false);
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
                    k6 m0 = l6.m0(file, tL_theme2.title, tL_theme2);
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

    public final i6 e(long j3, TLRPC.ThemeSettings themeSettings, TLRPC.TL_theme tL_theme, int i7, boolean z9) {
        if (z9) {
            LongSparseArray longSparseArray = this.d0;
            i6 i6Var = (i6) longSparseArray.get(j3);
            if (i6Var != null) {
                return i6Var;
            }
            int i10 = this.e0 + 1;
            this.e0 = i10;
            i6 i6Var2 = new i6();
            i(i6Var2, themeSettings);
            i6Var2.b = this;
            i6Var2.a = i10;
            i6Var2.r = tL_theme;
            i6Var2.t = i7;
            longSparseArray.put(i10, i6Var2);
            return i6Var2;
        }
        i6 i6Var3 = (i6) this.c0.get(j3);
        if (i6Var3 != null) {
            return i6Var3;
        }
        int i11 = this.f0 + 1;
        this.f0 = i11;
        i6 i6Var4 = new i6();
        i(i6Var4, themeSettings);
        i6Var4.b = this;
        i6Var4.a = i11;
        i6Var4.r = tL_theme;
        i6Var4.t = i7;
        this.a0.put(i11, i6Var4);
        this.b0.add(0, i6Var4);
        l6.J1(this);
        this.c0.put(j3, i6Var4);
        return i6Var4;
    }

    public final i6 f(TLRPC.TL_theme tL_theme, int i7, int i10) {
        if (tL_theme == null) {
            return null;
        }
        return e(tL_theme.id, i10 < tL_theme.settings.size() ? tL_theme.settings.get(i10) : null, tL_theme, i7, false);
    }

    public final String j(i6 i6Var, boolean z9) {
        String n10;
        if (i6Var == null) {
            i6Var = k(false);
        }
        if (i6Var == null) {
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
            n10 = a8.p0.n(i6Var.a, "_wp_o", sb4);
        } else {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(this.a);
            sb5.append("_");
            n10 = a8.p0.n(i6Var.a, "_wp", sb5);
        }
        sb3.append(n10);
        sb3.append(Utilities.b.nextInt());
        sb3.append(".jpg");
        return sb3.toString();
    }

    public final i6 k(boolean z9) {
        i6 i6Var;
        if (this.b0 == null || (i6Var = (i6) this.a0.get(this.Y)) == null) {
            return null;
        }
        if (!z9) {
            return i6Var;
        }
        int i7 = this.f0 + 1;
        this.f0 = i7;
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
        d6 d6Var = this.i0;
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
                    File file = new File(org.telegram.messenger.t0.h(), d6Var.a);
                    File h = org.telegram.messenger.t0.h();
                    String j3 = d6Var2.p.j(d6Var2.q, false);
                    d6Var2.a = j3;
                    org.telegram.messenger.g0.E(file, new File(h, j3));
                } catch (Exception e10) {
                    d6Var2.a = "";
                    a8.g(e10, true);
                }
            }
            if (TextUtils.isEmpty(d6Var.b)) {
                d6Var2.b = "";
            } else if (d6Var.b.equals(d6Var.a)) {
                d6Var2.b = d6Var2.a;
            } else {
                try {
                    File file2 = new File(org.telegram.messenger.t0.h(), d6Var.b);
                    File h7 = org.telegram.messenger.t0.h();
                    String j10 = d6Var2.p.j(d6Var2.q, true);
                    d6Var2.b = j10;
                    org.telegram.messenger.g0.E(file2, new File(h7, j10));
                } catch (Exception e11) {
                    d6Var2.b = "";
                    a8.g(e11, true);
                }
            }
            i6Var2.y = d6Var2;
        }
        this.Z = this.Y;
        i6Var2.a = i7;
        this.Y = i7;
        this.i0 = i6Var2.y;
        this.a0.put(i7, i6Var2);
        this.b0.add(0, i6Var2);
        l6.J1(this);
        return i6Var2;
    }

    public final int l(int i7) {
        i6 i6Var = (i6) this.a0.get(i7);
        if (i6Var != null) {
            return i6Var.c;
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
            return id.M0(2131744186, null);
        }
        if ("Dark Blue".equals(this.a)) {
            return id.M0(2131744183, null);
        }
        if ("Arctic Blue".equals(this.a)) {
            return id.M0(2131744187, null);
        }
        if ("Day".equals(this.a)) {
            return id.M0(2131744182, null);
        }
        if ("Night".equals(this.a)) {
            return id.M0(2131744175, null);
        }
        TLRPC.TL_theme tL_theme = this.F;
        return tL_theme != null ? tL_theme.title : this.a;
    }

    public final int o() {
        if (this.S && this.Y == l6.n) {
            return -3155485;
        }
        return this.L;
    }

    public final int p() {
        if (this.S && this.Y == l6.n) {
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
            l6.H(l6.T0(new File(this.b), null, new String[1]), this);
        }
        return this.j0 == 1;
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
                this.i0 = d6Var;
            }
            if (jSONObject.has("wallId") && jSONObject.getLong("wallId") == 1000001) {
                d6Var.c = "d";
            }
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    public final void s() {
        this.G = true;
        this.T = false;
        l6.y1(true, false);
        if (this == l6.I && l6.M == null) {
            l6.K1(this, this == l6.J, -1, null);
        }
    }

    public final void t() {
        qs.f(this.E).n(this, qs.Y1);
        qs.f(this.E).n(this, qs.Z1);
    }

    public final void u(int i7) {
        this.Y = i7;
        i6 k10 = k(false);
        if (k10 != null) {
            this.i0 = k10.y;
        }
    }

    public final void v(d6 d6Var) {
        if (this.i0 == d6Var) {
            return;
        }
        i6 k10 = k(false);
        d6 d6Var2 = this.i0;
        if (d6Var2 != null) {
            d6.a(d6Var2);
        }
        if (d6Var != null) {
            d6Var.q = k10;
            d6Var.p = this;
            d6Var.c();
        }
        this.i0 = d6Var;
        if (k10 != null) {
            k10.y = d6Var;
        }
    }

    public k6(k6 k6Var) {
        this.y = 45;
        this.G = true;
        this.U = true;
        this.Z = -1;
        this.d0 = new LongSparseArray();
        this.e0 = 0;
        this.f0 = 100;
        this.j0 = -1;
        this.a = k6Var.a;
        this.b = k6Var.b;
        this.c = k6Var.c;
        this.d = k6Var.d;
        this.e = k6Var.e;
        this.f = k6Var.f;
        this.h = k6Var.h;
        this.n = k6Var.n;
        this.r = k6Var.r;
        this.s = k6Var.s;
        this.w = k6Var.w;
        this.x = k6Var.x;
        this.y = k6Var.y;
        this.D = k6Var.D;
        this.E = k6Var.E;
        this.F = k6Var.F;
        this.G = k6Var.G;
        this.H = k6Var.H;
        this.I = k6Var.I;
        this.J = k6Var.J;
        this.K = k6Var.K;
        this.L = k6Var.L;
        this.M = k6Var.M;
        this.N = k6Var.N;
        this.O = k6Var.O;
        this.P = k6Var.P;
        this.Q = k6Var.Q;
        this.R = k6Var.R;
        this.S = k6Var.S;
        this.T = k6Var.T;
        this.U = k6Var.U;
        this.V = k6Var.V;
        this.W = k6Var.W;
        this.X = k6Var.X;
        this.Y = k6Var.Y;
        this.Z = k6Var.Z;
        this.a0 = k6Var.a0;
        this.b0 = k6Var.b0;
        this.c0 = k6Var.c0;
        this.f0 = k6Var.f0;
        this.g0 = k6Var.g0;
        this.h0 = k6Var.h0;
        this.i0 = k6Var.i0;
    }
}
