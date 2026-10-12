package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.LongSparseArray;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class kv extends LinearLayout {
    public final kc1 a;
    public s4.b0 b;
    public final org.telegram.ui.Components.xp c;
    public final org.telegram.ui.Components.yj0 d;
    public final org.telegram.ui.Cells.r8 e;
    public final org.telegram.ui.Cells.r8 f;
    public ValueAnimator h;
    public int n;
    public int r;
    public final int s;
    public int v;
    public Boolean w;

    public kv(int i10, Context context, org.telegram.ui.ActionBar.m2 m2Var) {
        super(context);
        s4.b0 b0Var;
        org.telegram.ui.ActionBar.c6 c6Var = null;
        this.b = null;
        this.r = -1;
        this.w = null;
        this.s = i10;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, w7.a6.d(-2.0f, -1));
        org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(m2Var.getCurrentAccount(), (i10 == 0 || i10 == -1) ? 0 : 1, null);
        this.c = xpVar;
        kc1 kc1Var = new kc1(getContext(), 8, c6Var);
        this.a = kc1Var;
        kc1Var.setAdapter(xpVar);
        kc1Var.setSelectorDrawableColor(0);
        kc1Var.setClipChildren(false);
        kc1Var.setClipToPadding(false);
        kc1Var.setHasFixedSize(true);
        kc1Var.setItemAnimator(null);
        kc1Var.setNestedScrollingEnabled(false);
        c();
        kc1Var.setFocusable(false);
        kc1Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        kc1Var.setOnItemClickListener(new bi.z5(15, this, m2Var));
        org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(getContext(), null);
        f10Var.setViewType(14);
        f10Var.setVisibility(0);
        if (i10 == 0 || i10 == -1) {
            frameLayout.addView(f10Var, w7.a6.a(104.0f, 0.0f, 8.0f, 0.0f, 8.0f, -1, 8388611));
            frameLayout.addView(kc1Var, w7.a6.a(104.0f, 0.0f, 8.0f, 0.0f, 8.0f, -1, 8388611));
        } else {
            frameLayout.addView(f10Var, w7.a6.a(104.0f, 0.0f, 8.0f, 0.0f, 8.0f, -1, 8388611));
            frameLayout.addView(kc1Var, w7.a6.a(-2.0f, 0.0f, 8.0f, 0.0f, 8.0f, -1, 8388611));
        }
        kc1Var.setEmptyView(f10Var);
        kc1Var.W1 = true;
        kc1Var.X1 = 0;
        if (i10 == 0) {
            org.telegram.ui.Components.yj0 yj0Var = new org.telegram.ui.Components.yj0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.d = yj0Var;
            yj0Var.h = true;
            yj0Var.Z = true;
            yj0Var.o();
            org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context);
            this.e = r8Var;
            r8Var.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.i6, false), 2, -1));
            r8Var.w = 21;
            addView(r8Var, w7.a6.d(-2.0f, -1));
            org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(context);
            this.f = r8Var2;
            r8Var2.m(R.drawable.msg_colors, LocaleController.getString(R.string.SettingsBrowseThemes), false);
            addView(r8Var2, w7.a6.d(-2.0f, -1));
            r8Var.setOnClickListener(new iv(this, context, m2Var));
            yj0Var.h = true;
            r8Var2.setOnClickListener(new a(m2Var, 17));
            if (org.telegram.ui.ActionBar.g6.g1()) {
                r8Var.n(LocaleController.getString(R.string.SettingsSwitchToNightMode), yj0Var, true);
            } else {
                yj0Var.M(yj0Var.e[0] - 1);
                r8Var.n(LocaleController.getString(R.string.SettingsSwitchToDayMode), yj0Var, true);
            }
        }
        if (!MediaDataController.getInstance(m2Var.getCurrentAccount()).defaultEmojiThemes.isEmpty()) {
            ArrayList arrayList = new ArrayList(MediaDataController.getInstance(m2Var.getCurrentAccount()).defaultEmojiThemes);
            if (i10 == 0) {
                org.telegram.ui.ActionBar.b4 b4Var = new org.telegram.ui.ActionBar.b4(m2Var.getCurrentAccount());
                b4Var.e = "🎨";
                b4Var.c = gg.b.d("🎨");
                b4Var.d = TLRPC.ChatTheme.ofEmoticon(b4Var.e);
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayCustomTheme", null);
                int i11 = sharedPreferences.getInt("lastDayCustomThemeAccentId", -1);
                int i12 = 99;
                String str = "Blue";
                if (string == null || org.telegram.ui.ActionBar.g6.O0(string) == null) {
                    string = sharedPreferences.getString("lastDayTheme", "Blue");
                    org.telegram.ui.ActionBar.f6 O0 = org.telegram.ui.ActionBar.g6.O0(string);
                    if (O0 == null) {
                        i11 = 99;
                        string = "Blue";
                    } else {
                        i11 = O0.Y;
                    }
                    sharedPreferences.edit().putString("lastDayCustomTheme", string).apply();
                } else if (i11 == -1) {
                    i11 = org.telegram.ui.ActionBar.g6.O0(string).f0;
                }
                if (i11 != -1) {
                    str = string;
                    i12 = i11;
                }
                String string2 = sharedPreferences.getString("lastDarkCustomTheme", null);
                int i13 = sharedPreferences.getInt("lastDarkCustomThemeAccentId", -1);
                String str2 = "Dark Blue";
                if (string2 == null || org.telegram.ui.ActionBar.g6.O0(string2) == null) {
                    string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    org.telegram.ui.ActionBar.f6 O02 = org.telegram.ui.ActionBar.g6.O0(string2);
                    if (O02 == null) {
                        i13 = 0;
                        string2 = "Dark Blue";
                    } else {
                        i13 = O02.Y;
                    }
                    sharedPreferences.edit().putString("lastDarkCustomTheme", string2).apply();
                } else if (i13 == -1) {
                    i13 = org.telegram.ui.ActionBar.g6.O0(str).f0;
                }
                if (i13 == -1) {
                    i13 = 0;
                } else {
                    str2 = string2;
                }
                org.telegram.ui.ActionBar.a4 a4Var = new org.telegram.ui.ActionBar.a4();
                a4Var.a = org.telegram.ui.ActionBar.g6.O0(str);
                a4Var.e = i12;
                b4Var.f.add(a4Var);
                b4Var.f.add(null);
                org.telegram.ui.ActionBar.a4 a4Var2 = new org.telegram.ui.ActionBar.a4();
                a4Var2.a = org.telegram.ui.ActionBar.g6.O0(str2);
                a4Var2.e = i13;
                b4Var.f.add(a4Var2);
                b4Var.f.add(null);
                b4Var.n(m2Var.getCurrentAccount());
                org.telegram.ui.Components.yp ypVar = new org.telegram.ui.Components.yp(b4Var);
                ypVar.c = org.telegram.ui.ActionBar.g6.g1() ? 0 : 2;
                arrayList.add(ypVar);
            }
            xpVar.d = arrayList;
            xpVar.l();
        }
        b();
        d();
        a();
        int i14 = this.r;
        if (i14 < 0 || (b0Var = this.b) == null) {
            return;
        }
        b0Var.h1(i14, AndroidUtilities.dp(16.0f));
    }

    public final void a() {
        int i10 = this.s;
        if (i10 == 0 || i10 == -1) {
            org.telegram.ui.Components.yj0 yj0Var = this.d;
            if (yj0Var != null) {
                yj0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.q6, false), PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Cells.r8 r8Var = this.e;
            if (r8Var != null) {
                org.telegram.ui.ActionBar.g6.C1(r8Var.getBackground(), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.i6, false), true);
                r8Var.e(-1, org.telegram.ui.ActionBar.g6.q6);
            }
            org.telegram.ui.Cells.r8 r8Var2 = this.f;
            if (r8Var2 != null) {
                r8Var2.setBackground(org.telegram.ui.ActionBar.g6.h0(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.i6, false)));
                int i11 = org.telegram.ui.ActionBar.g6.q6;
                r8Var2.e(i11, i11);
            }
        }
    }

    public final void b() {
        int i10;
        int i11;
        int i12 = this.s;
        if (i12 == 0 || i12 == -1) {
            this.v = org.telegram.ui.ActionBar.g6.g1() ? 0 : 2;
        } else if (org.telegram.ui.ActionBar.g6.I.m().equals("Blue")) {
            this.v = 0;
        } else if (org.telegram.ui.ActionBar.g6.I.m().equals("Day")) {
            this.v = 1;
        } else if (org.telegram.ui.ActionBar.g6.I.m().equals("Night")) {
            this.v = 2;
        } else if (org.telegram.ui.ActionBar.g6.I.m().equals("Dark Blue")) {
            this.v = 3;
        } else {
            if (org.telegram.ui.ActionBar.g6.g1() && ((i11 = this.v) == 2 || i11 == 3)) {
                this.v = 0;
            }
            if (!org.telegram.ui.ActionBar.g6.g1() && ((i10 = this.v) == 0 || i10 == 1)) {
                this.v = 2;
            }
        }
        org.telegram.ui.Components.xp xpVar = this.c;
        if (xpVar.d != null) {
            for (int i13 = 0; i13 < xpVar.d.size(); i13++) {
                ((org.telegram.ui.Components.yp) xpVar.d.get(i13)).c = this.v;
            }
            xpVar.q(0, xpVar.d.size());
        }
        d();
    }

    public final void c() {
        Point point = AndroidUtilities.displaySize;
        boolean z10 = point.y > point.x;
        Boolean bool = this.w;
        if (bool == null || bool.booleanValue() != z10) {
            kc1 kc1Var = this.a;
            int i10 = this.s;
            if (i10 != 0 && i10 != -1) {
                int i11 = z10 ? 3 : 9;
                s4.b0 b0Var = this.b;
                if (b0Var instanceof s4.s) {
                    ((s4.s) b0Var).y1(i11);
                } else {
                    kc1Var.setHasFixedSize(false);
                    getContext();
                    s4.s sVar = new s4.s(i11);
                    sVar.O = new jv(0);
                    this.b = sVar;
                    kc1Var.setLayoutManager(sVar);
                }
            } else if (this.b == null) {
                getContext();
                s4.b0 b0Var2 = new s4.b0(0, false);
                this.b = b0Var2;
                kc1Var.setLayoutManager(b0Var2);
            }
            this.w = Boolean.valueOf(z10);
        }
    }

    public final void d() {
        org.telegram.ui.Components.xp xpVar = this.c;
        if (xpVar.d == null) {
            return;
        }
        this.r = -1;
        int i10 = 0;
        while (true) {
            if (i10 >= xpVar.d.size()) {
                break;
            }
            TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.a4) ((org.telegram.ui.Components.yp) xpVar.d.get(i10)).a.f.get(this.v)).b;
            org.telegram.ui.ActionBar.f6 j10 = ((org.telegram.ui.Components.yp) xpVar.d.get(i10)).a.j(this.v);
            if (tL_theme != null) {
                if (org.telegram.ui.ActionBar.g6.I.a.equals(org.telegram.ui.ActionBar.g6.r0(tL_theme.settings.get(((org.telegram.ui.ActionBar.a4) ((org.telegram.ui.Components.yp) xpVar.d.get(i10)).a.f.get(this.v)).d)))) {
                    LongSparseArray longSparseArray = org.telegram.ui.ActionBar.g6.I.c0;
                    if (longSparseArray != null) {
                        org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) longSparseArray.get(tL_theme.id);
                        if (e6Var != null && e6Var.a == org.telegram.ui.ActionBar.g6.I.Y) {
                            this.r = i10;
                            break;
                        }
                    } else {
                        this.r = i10;
                        break;
                    }
                } else {
                    continue;
                }
                i10++;
            } else {
                if (j10 != null) {
                    if (org.telegram.ui.ActionBar.g6.I.a.equals(j10.m())) {
                        if (((org.telegram.ui.ActionBar.a4) ((org.telegram.ui.Components.yp) xpVar.d.get(i10)).a.f.get(this.v)).e == org.telegram.ui.ActionBar.g6.I.Y) {
                            this.r = i10;
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
                i10++;
            }
        }
        if (this.r == -1 && this.s != 3) {
            this.r = xpVar.d.size() - 1;
        }
        int i11 = 0;
        while (i11 < xpVar.d.size()) {
            ((org.telegram.ui.Components.yp) xpVar.d.get(i11)).d = i11 == this.r;
            i11++;
        }
        xpVar.E(this.r);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        c();
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        super.setBackgroundColor(i10);
        a();
    }
}
