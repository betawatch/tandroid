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
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.qa0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class l6 implements ls {
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
    public e6 i0;
    public int j0;
    public boolean n;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;

    public l6() {
        this.y = 45;
        this.G = true;
        this.U = true;
        this.Z = -1;
        this.d0 = new LongSparseArray();
        this.e0 = 0;
        this.f0 = 100;
        this.j0 = -1;
    }

    public static boolean a(j6 j6Var, TLRPC.ThemeSettings themeSettings) {
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
            i7 = m6.a1(wallPaperSettings.background_color);
            j3 = themeSettings.wallpaper.settings.second_background_color == 0 ? 4294967296L : m6.a1(r11);
            j10 = themeSettings.wallpaper.settings.third_background_color == 0 ? 4294967296L : m6.a1(r11);
            j11 = themeSettings.wallpaper.settings.fourth_background_color != 0 ? m6.a1(r11) : 4294967296L;
            i10 = org.telegram.messenger.g0.s1(themeSettings.wallpaper.settings.rotation, false);
            z9 = false;
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            z10 = true;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                str = wallPaper2.slug;
                f10 = wallPaper2.settings.intensity / 100.0f;
                return (themeSettings.accent_color != j6Var.c && themeSettings.outbox_accent_color == j6Var.d && intValue == j6Var.e && intValue2 == j6Var.f && intValue3 == j6Var.g && intValue4 == j6Var.h && themeSettings.message_colors_animated == j6Var.i && ((long) i7) == j6Var.j && j3 == j6Var.k && j10 == j6Var.l && j11 == j6Var.m && i10 == j6Var.n && TextUtils.equals(str, j6Var.o) && ((double) Math.abs(f10 - j6Var.p)) < 0.001d) ? z10 : z9;
            }
        }
        str = null;
        f10 = 0.0f;
        if (themeSettings.accent_color != j6Var.c) {
        }
    }

    public static void b(l6 l6Var, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, String[] strArr, int[] iArr9, int[] iArr10) {
        l6Var.W = iArr.length;
        l6Var.b0 = new ArrayList();
        l6Var.a0 = new SparseArray();
        l6Var.c0 = new LongSparseArray();
        for (int i7 = 0; i7 < iArr.length; i7++) {
            j6 j6Var = new j6();
            j6Var.a = iArr8[i7];
            if (m6.l1(j6Var)) {
                j6Var.z = true;
            }
            j6Var.c = iArr[i7];
            j6Var.b = l6Var;
            j6Var.e = iArr2[i7];
            j6Var.f = iArr3[i7];
            long j3 = iArr4[i7];
            j6Var.j = j3;
            boolean z9 = l6Var.S;
            if (z9 && j6Var.a == m6.n) {
                j6Var.j = 4294967296L;
            } else {
                j6Var.j = j3;
            }
            if (z9 && j6Var.a == m6.n) {
                j6Var.k = 4294967296L;
            } else {
                j6Var.k = iArr5[i7];
            }
            if (iArr6 != null) {
                if (z9 && j6Var.a == m6.n) {
                    j6Var.l = 4294967296L;
                } else {
                    j6Var.l = iArr6[i7];
                }
            }
            if (iArr7 != null) {
                if (z9 && j6Var.a == m6.n) {
                    j6Var.m = 4294967296L;
                } else {
                    j6Var.m = iArr7[i7];
                }
            }
            j6Var.p = iArr10[i7] / 100.0f;
            j6Var.n = iArr9[i7];
            j6Var.o = strArr[i7];
            if ((m6.l1(j6Var) && l6Var.a.equals("Dark Blue")) || l6Var.a.equals("Night")) {
                j6Var.e = -14316059;
                j6Var.f = -12422433;
                j6Var.g = -8304937;
                j6Var.h = -6340950;
                if (l6Var.a.equals("Night")) {
                    j6Var.p = -0.57f;
                    j6Var.j = -9666650L;
                    j6Var.k = -13749173L;
                    j6Var.l = -8883033L;
                    j6Var.m = -13421992L;
                }
            }
            l6Var.a0.put(j6Var.a, j6Var);
            l6Var.b0.add(j6Var);
        }
        l6Var.X = ((j6) l6Var.a0.get(0)).c;
    }

    public static void c(l6 l6Var, SharedPreferences sharedPreferences) {
        ArrayList arrayList = l6Var.b0;
        if (arrayList == null || arrayList.isEmpty()) {
            l6Var.r(sharedPreferences, null, a8.p0.s(new StringBuilder(), l6Var.a, "_owp"));
            return;
        }
        int size = l6Var.b0.size();
        for (int i7 = 0; i7 < size; i7++) {
            j6 j6Var = (j6) l6Var.b0.get(i7);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(l6Var.a);
            sb2.append("_");
            l6Var.r(sharedPreferences, j6Var, a8.p0.n(j6Var.a, "_owp", sb2));
        }
    }

    public static l6 g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            l6 l6Var = new l6();
            l6Var.a = jSONObject.getString("name");
            l6Var.b = jSONObject.getString("path");
            if (jSONObject.has("account")) {
                l6Var.E = jSONObject.getInt("account");
            }
            if (jSONObject.has("info")) {
                try {
                    SerializedData serializedData = new SerializedData(Utilities.v(jSONObject.getString("info")));
                    l6Var.F = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
            }
            if (jSONObject.has("loaded")) {
                l6Var.G = jSONObject.getBoolean("loaded");
            }
            return l6Var;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static l6 h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("\\|");
        if (split.length != 2) {
            return null;
        }
        l6 l6Var = new l6();
        l6Var.a = split[0];
        l6Var.b = split[1];
        return l6Var;
    }

    public static void i(j6 j6Var, TLRPC.ThemeSettings themeSettings) {
        TLRPC.WallPaperSettings wallPaperSettings;
        j6Var.c = themeSettings.accent_color;
        j6Var.d = themeSettings.outbox_accent_color;
        j6Var.e = themeSettings.message_colors.size() > 0 ? themeSettings.message_colors.get(0).intValue() | (-16777216) : 0;
        int intValue = themeSettings.message_colors.size() > 1 ? themeSettings.message_colors.get(1).intValue() | (-16777216) : 0;
        j6Var.f = intValue;
        if (j6Var.e == intValue) {
            j6Var.f = 0;
        }
        j6Var.g = themeSettings.message_colors.size() > 2 ? themeSettings.message_colors.get(2).intValue() | (-16777216) : 0;
        j6Var.h = themeSettings.message_colors.size() > 3 ? themeSettings.message_colors.get(3).intValue() | (-16777216) : 0;
        j6Var.i = themeSettings.message_colors_animated;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null) {
            return;
        }
        if (wallPaperSettings.background_color == 0) {
            j6Var.j = 4294967296L;
        } else {
            j6Var.j = m6.a1(r0);
        }
        TLRPC.WallPaperSettings wallPaperSettings2 = themeSettings.wallpaper.settings;
        if ((wallPaperSettings2.flags & 16) == 0 || wallPaperSettings2.second_background_color != 0) {
            j6Var.k = m6.a1(wallPaperSettings2.second_background_color);
        } else {
            j6Var.k = 4294967296L;
        }
        TLRPC.WallPaperSettings wallPaperSettings3 = themeSettings.wallpaper.settings;
        if ((wallPaperSettings3.flags & 32) == 0 || wallPaperSettings3.third_background_color != 0) {
            j6Var.l = m6.a1(wallPaperSettings3.third_background_color);
        } else {
            j6Var.l = 4294967296L;
        }
        TLRPC.WallPaperSettings wallPaperSettings4 = themeSettings.wallpaper.settings;
        if ((wallPaperSettings4.flags & 64) == 0 || wallPaperSettings4.fourth_background_color != 0) {
            j6Var.m = m6.a1(wallPaperSettings4.fourth_background_color);
        } else {
            j6Var.m = 4294967296L;
        }
        j6Var.n = org.telegram.messenger.g0.s1(themeSettings.wallpaper.settings.rotation, false);
        TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
        if ((wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) || !wallPaper2.pattern) {
            return;
        }
        j6Var.o = wallPaper2.slug;
        TLRPC.WallPaperSettings wallPaperSettings5 = wallPaper2.settings;
        j6Var.p = wallPaperSettings5.intensity / 100.0f;
        j6Var.q = wallPaperSettings5.motion;
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
                        GradientDrawable gradientDrawable = new GradientDrawable(j9.d(this.y), new int[]{this.r, this.s});
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
                Utilities.e.c(new c(5, this, (File) objArr[1]));
                return;
            }
            if (str.equals(w7.r(null, this.F.document))) {
                t();
                if (i7 == i11) {
                    File file = new File(this.b);
                    TLRPC.TL_theme tL_theme2 = this.F;
                    l6 m0 = m6.m0(file, tL_theme2.title, tL_theme2);
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

    public final j6 e(long j3, TLRPC.ThemeSettings themeSettings, TLRPC.TL_theme tL_theme, int i7, boolean z9) {
        if (z9) {
            LongSparseArray longSparseArray = this.d0;
            j6 j6Var = (j6) longSparseArray.get(j3);
            if (j6Var != null) {
                return j6Var;
            }
            int i10 = this.e0 + 1;
            this.e0 = i10;
            j6 j6Var2 = new j6();
            i(j6Var2, themeSettings);
            j6Var2.b = this;
            j6Var2.a = i10;
            j6Var2.r = tL_theme;
            j6Var2.t = i7;
            longSparseArray.put(i10, j6Var2);
            return j6Var2;
        }
        j6 j6Var3 = (j6) this.c0.get(j3);
        if (j6Var3 != null) {
            return j6Var3;
        }
        int i11 = this.f0 + 1;
        this.f0 = i11;
        j6 j6Var4 = new j6();
        i(j6Var4, themeSettings);
        j6Var4.b = this;
        j6Var4.a = i11;
        j6Var4.r = tL_theme;
        j6Var4.t = i7;
        this.a0.put(i11, j6Var4);
        this.b0.add(0, j6Var4);
        m6.J1(this);
        this.c0.put(j3, j6Var4);
        return j6Var4;
    }

    public final j6 f(TLRPC.TL_theme tL_theme, int i7, int i10) {
        if (tL_theme == null) {
            return null;
        }
        return e(tL_theme.id, i10 < tL_theme.settings.size() ? tL_theme.settings.get(i10) : null, tL_theme, i7, false);
    }

    public final String j(j6 j6Var, boolean z9) {
        String n10;
        if (j6Var == null) {
            j6Var = k(false);
        }
        if (j6Var == null) {
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
            n10 = a8.p0.n(j6Var.a, "_wp_o", sb4);
        } else {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(this.a);
            sb5.append("_");
            n10 = a8.p0.n(j6Var.a, "_wp", sb5);
        }
        sb3.append(n10);
        sb3.append(Utilities.b.nextInt());
        sb3.append(".jpg");
        return sb3.toString();
    }

    public final j6 k(boolean z9) {
        j6 j6Var;
        if (this.b0 == null || (j6Var = (j6) this.a0.get(this.Y)) == null) {
            return null;
        }
        if (!z9) {
            return j6Var;
        }
        int i7 = this.f0 + 1;
        this.f0 = i7;
        j6 j6Var2 = new j6();
        j6Var2.c = j6Var.c;
        j6Var2.d = j6Var.d;
        j6Var2.e = j6Var.e;
        j6Var2.f = j6Var.f;
        j6Var2.g = j6Var.g;
        j6Var2.h = j6Var.h;
        j6Var2.i = j6Var.i;
        j6Var2.j = j6Var.j;
        j6Var2.k = j6Var.k;
        j6Var2.l = j6Var.l;
        j6Var2.m = j6Var.m;
        j6Var2.n = j6Var.n;
        j6Var2.o = j6Var.o;
        j6Var2.p = j6Var.p;
        j6Var2.q = j6Var.q;
        j6Var2.b = this;
        e6 e6Var = this.i0;
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
            e6Var2.q = j6Var2;
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
            j6Var2.y = e6Var2;
        }
        this.Z = this.Y;
        j6Var2.a = i7;
        this.Y = i7;
        this.i0 = j6Var2.y;
        this.a0.put(i7, j6Var2);
        this.b0.add(0, j6Var2);
        m6.J1(this);
        return j6Var2;
    }

    public final int l(int i7) {
        j6 j6Var = (j6) this.a0.get(i7);
        if (j6Var != null) {
            return j6Var.c;
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
        if (this.S && this.Y == m6.n) {
            return -3155485;
        }
        return this.L;
    }

    public final int p() {
        if (this.S && this.Y == m6.n) {
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
            m6.H(m6.T0(new File(this.b), null, new String[1]), this);
        }
        return this.j0 == 1;
    }

    public final void r(SharedPreferences sharedPreferences, j6 j6Var, String str) {
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
            e6Var.q = j6Var;
            if (j6Var != null) {
                j6Var.y = e6Var;
            } else {
                this.i0 = e6Var;
            }
            if (jSONObject.has("wallId") && jSONObject.getLong("wallId") == 1000001) {
                e6Var.c = "d";
            }
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    public final void s() {
        this.G = true;
        this.T = false;
        m6.y1(true, false);
        if (this == m6.I && m6.M == null) {
            m6.K1(this, this == m6.J, -1, null);
        }
    }

    public final void t() {
        qs.f(this.E).n(this, qs.Y1);
        qs.f(this.E).n(this, qs.Z1);
    }

    public final void u(int i7) {
        this.Y = i7;
        j6 k10 = k(false);
        if (k10 != null) {
            this.i0 = k10.y;
        }
    }

    public final void v(e6 e6Var) {
        if (this.i0 == e6Var) {
            return;
        }
        j6 k10 = k(false);
        e6 e6Var2 = this.i0;
        if (e6Var2 != null) {
            e6.a(e6Var2);
        }
        if (e6Var != null) {
            e6Var.q = k10;
            e6Var.p = this;
            e6Var.c();
        }
        this.i0 = e6Var;
        if (k10 != null) {
            k10.y = e6Var;
        }
    }

    public l6(l6 l6Var) {
        this.y = 45;
        this.G = true;
        this.U = true;
        this.Z = -1;
        this.d0 = new LongSparseArray();
        this.e0 = 0;
        this.f0 = 100;
        this.j0 = -1;
        this.a = l6Var.a;
        this.b = l6Var.b;
        this.c = l6Var.c;
        this.d = l6Var.d;
        this.e = l6Var.e;
        this.f = l6Var.f;
        this.h = l6Var.h;
        this.n = l6Var.n;
        this.r = l6Var.r;
        this.s = l6Var.s;
        this.w = l6Var.w;
        this.x = l6Var.x;
        this.y = l6Var.y;
        this.D = l6Var.D;
        this.E = l6Var.E;
        this.F = l6Var.F;
        this.G = l6Var.G;
        this.H = l6Var.H;
        this.I = l6Var.I;
        this.J = l6Var.J;
        this.K = l6Var.K;
        this.L = l6Var.L;
        this.M = l6Var.M;
        this.N = l6Var.N;
        this.O = l6Var.O;
        this.P = l6Var.P;
        this.Q = l6Var.Q;
        this.R = l6Var.R;
        this.S = l6Var.S;
        this.T = l6Var.T;
        this.U = l6Var.U;
        this.V = l6Var.V;
        this.W = l6Var.W;
        this.X = l6Var.X;
        this.Y = l6Var.Y;
        this.Z = l6Var.Z;
        this.a0 = l6Var.a0;
        this.b0 = l6Var.b0;
        this.c0 = l6Var.c0;
        this.f0 = l6Var.f0;
        this.g0 = l6Var.g0;
        this.h0 = l6Var.h0;
        this.i0 = l6Var.i0;
    }
}
