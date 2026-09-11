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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class gv extends LinearLayout {
    public final ec1 a;
    public s4.c0 b;
    public final org.telegram.ui.Components.jp c;
    public final org.telegram.ui.Components.xi0 d;
    public final org.telegram.ui.Cells.r8 e;
    public final org.telegram.ui.Cells.r8 f;
    public ValueAnimator h;
    public int n;
    public int r;
    public final int s;
    public int v;
    public Boolean w;

    public gv(int i10, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context);
        s4.c0 c0Var;
        org.telegram.ui.ActionBar.f6 f6Var = null;
        this.b = null;
        this.r = -1;
        this.w = null;
        this.s = i10;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, w7.x5.c(-2.0f, -1));
        org.telegram.ui.Components.jp jpVar = new org.telegram.ui.Components.jp(n2Var.getCurrentAccount(), (i10 == 0 || i10 == -1) ? 0 : 1, null);
        this.c = jpVar;
        ec1 ec1Var = new ec1(getContext(), 8, f6Var);
        this.a = ec1Var;
        ec1Var.setAdapter(jpVar);
        ec1Var.setSelectorDrawableColor(0);
        ec1Var.setClipChildren(false);
        ec1Var.setClipToPadding(false);
        ec1Var.setHasFixedSize(true);
        ec1Var.setItemAnimator(null);
        ec1Var.setNestedScrollingEnabled(false);
        c();
        ec1Var.setFocusable(false);
        ec1Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        ec1Var.setOnItemClickListener(new bi.x5(15, this, n2Var));
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(getContext(), null);
        t00Var.setViewType(14);
        t00Var.setVisibility(0);
        if (i10 == 0 || i10 == -1) {
            frameLayout.addView(t00Var, w7.x5.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(ec1Var, w7.x5.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        } else {
            frameLayout.addView(t00Var, w7.x5.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(ec1Var, w7.x5.d(-1, -2.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        }
        ec1Var.setEmptyView(t00Var);
        ec1Var.Y1 = true;
        ec1Var.Z1 = 0;
        if (i10 == 0) {
            org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.d = xi0Var;
            xi0Var.h = true;
            xi0Var.a0 = true;
            xi0Var.m();
            org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context);
            this.e = r8Var;
            r8Var.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), 2, -1));
            r8Var.w = 21;
            addView(r8Var, w7.x5.c(-2.0f, -1));
            org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(context);
            this.f = r8Var2;
            r8Var2.m(R.drawable.msg_colors, LocaleController.getString(R.string.SettingsBrowseThemes), false);
            addView(r8Var2, w7.x5.c(-2.0f, -1));
            r8Var.setOnClickListener(new ev(this, context, n2Var));
            xi0Var.h = true;
            r8Var2.setOnClickListener(new a(n2Var, 18));
            if (org.telegram.ui.ActionBar.j6.f1()) {
                r8Var.n(LocaleController.getString(R.string.SettingsSwitchToNightMode), xi0Var, true);
            } else {
                xi0Var.K(xi0Var.e[0] - 1);
                r8Var.n(LocaleController.getString(R.string.SettingsSwitchToDayMode), xi0Var, true);
            }
        }
        if (!MediaDataController.getInstance(n2Var.getCurrentAccount()).defaultEmojiThemes.isEmpty()) {
            ArrayList arrayList = new ArrayList(MediaDataController.getInstance(n2Var.getCurrentAccount()).defaultEmojiThemes);
            if (i10 == 0) {
                org.telegram.ui.ActionBar.d4 d4Var = new org.telegram.ui.ActionBar.d4(n2Var.getCurrentAccount());
                d4Var.e = "🎨";
                d4Var.c = gg.b.d("🎨");
                d4Var.d = TLRPC.ChatTheme.ofEmoticon(d4Var.e);
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayCustomTheme", null);
                int i11 = sharedPreferences.getInt("lastDayCustomThemeAccentId", -1);
                int i12 = 99;
                String str = "Blue";
                if (string == null || org.telegram.ui.ActionBar.j6.N0(string) == null) {
                    string = sharedPreferences.getString("lastDayTheme", "Blue");
                    org.telegram.ui.ActionBar.i6 N0 = org.telegram.ui.ActionBar.j6.N0(string);
                    if (N0 == null) {
                        string = "Blue";
                        i11 = 99;
                    } else {
                        i11 = N0.Y;
                    }
                    sharedPreferences.edit().putString("lastDayCustomTheme", string).apply();
                } else if (i11 == -1) {
                    i11 = org.telegram.ui.ActionBar.j6.N0(string).f0;
                }
                if (i11 != -1) {
                    str = string;
                    i12 = i11;
                }
                String string2 = sharedPreferences.getString("lastDarkCustomTheme", null);
                int i13 = sharedPreferences.getInt("lastDarkCustomThemeAccentId", -1);
                String str2 = "Dark Blue";
                if (string2 == null || org.telegram.ui.ActionBar.j6.N0(string2) == null) {
                    string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    org.telegram.ui.ActionBar.i6 N02 = org.telegram.ui.ActionBar.j6.N0(string2);
                    if (N02 == null) {
                        string2 = "Dark Blue";
                        i13 = 0;
                    } else {
                        i13 = N02.Y;
                    }
                    sharedPreferences.edit().putString("lastDarkCustomTheme", string2).apply();
                } else if (i13 == -1) {
                    i13 = org.telegram.ui.ActionBar.j6.N0(str).f0;
                }
                if (i13 == -1) {
                    i13 = 0;
                } else {
                    str2 = string2;
                }
                org.telegram.ui.ActionBar.c4 c4Var = new org.telegram.ui.ActionBar.c4();
                c4Var.a = org.telegram.ui.ActionBar.j6.N0(str);
                c4Var.e = i12;
                d4Var.f.add(c4Var);
                d4Var.f.add(null);
                org.telegram.ui.ActionBar.c4 c4Var2 = new org.telegram.ui.ActionBar.c4();
                c4Var2.a = org.telegram.ui.ActionBar.j6.N0(str2);
                c4Var2.e = i13;
                d4Var.f.add(c4Var2);
                d4Var.f.add(null);
                d4Var.n(n2Var.getCurrentAccount());
                org.telegram.ui.Components.kp kpVar = new org.telegram.ui.Components.kp(d4Var);
                kpVar.c = org.telegram.ui.ActionBar.j6.f1() ? 0 : 2;
                arrayList.add(kpVar);
            }
            jpVar.d = arrayList;
            jpVar.l();
        }
        b();
        d();
        a();
        int i14 = this.r;
        if (i14 < 0 || (c0Var = this.b) == null) {
            return;
        }
        c0Var.h1(i14, AndroidUtilities.dp(16.0f));
    }

    public final void a() {
        int i10 = this.s;
        if (i10 == 0 || i10 == -1) {
            org.telegram.ui.Components.xi0 xi0Var = this.d;
            if (xi0Var != null) {
                xi0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false), PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Cells.r8 r8Var = this.e;
            if (r8Var != null) {
                org.telegram.ui.ActionBar.j6.B1(r8Var.getBackground(), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), true);
                r8Var.e(-1, org.telegram.ui.ActionBar.j6.q6);
            }
            org.telegram.ui.Cells.r8 r8Var2 = this.f;
            if (r8Var2 != null) {
                r8Var2.setBackground(org.telegram.ui.ActionBar.j6.g0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false)));
                int i11 = org.telegram.ui.ActionBar.j6.q6;
                r8Var2.e(i11, i11);
            }
        }
    }

    public final void b() {
        int i10;
        int i11;
        int i12 = this.s;
        if (i12 == 0 || i12 == -1) {
            this.v = org.telegram.ui.ActionBar.j6.f1() ? 0 : 2;
        } else if (org.telegram.ui.ActionBar.j6.I.m().equals("Blue")) {
            this.v = 0;
        } else if (org.telegram.ui.ActionBar.j6.I.m().equals("Day")) {
            this.v = 1;
        } else if (org.telegram.ui.ActionBar.j6.I.m().equals("Night")) {
            this.v = 2;
        } else if (org.telegram.ui.ActionBar.j6.I.m().equals("Dark Blue")) {
            this.v = 3;
        } else {
            if (org.telegram.ui.ActionBar.j6.f1() && ((i11 = this.v) == 2 || i11 == 3)) {
                this.v = 0;
            }
            if (!org.telegram.ui.ActionBar.j6.f1() && ((i10 = this.v) == 0 || i10 == 1)) {
                this.v = 2;
            }
        }
        org.telegram.ui.Components.jp jpVar = this.c;
        if (jpVar.d != null) {
            for (int i13 = 0; i13 < jpVar.d.size(); i13++) {
                ((org.telegram.ui.Components.kp) jpVar.d.get(i13)).c = this.v;
            }
            jpVar.q(0, jpVar.d.size());
        }
        d();
    }

    public final void c() {
        Point point = AndroidUtilities.displaySize;
        boolean z10 = point.y > point.x;
        Boolean bool = this.w;
        if (bool == null || bool.booleanValue() != z10) {
            ec1 ec1Var = this.a;
            int i10 = this.s;
            if (i10 != 0 && i10 != -1) {
                int i11 = z10 ? 3 : 9;
                s4.c0 c0Var = this.b;
                if (c0Var instanceof s4.s) {
                    ((s4.s) c0Var).y1(i11);
                } else {
                    ec1Var.setHasFixedSize(false);
                    getContext();
                    s4.s sVar = new s4.s(i11);
                    sVar.O = new fv(0);
                    this.b = sVar;
                    ec1Var.setLayoutManager(sVar);
                }
            } else if (this.b == null) {
                getContext();
                s4.c0 c0Var2 = new s4.c0(0, false);
                this.b = c0Var2;
                ec1Var.setLayoutManager(c0Var2);
            }
            this.w = Boolean.valueOf(z10);
        }
    }

    public final void d() {
        org.telegram.ui.Components.jp jpVar = this.c;
        if (jpVar.d == null) {
            return;
        }
        this.r = -1;
        int i10 = 0;
        while (true) {
            if (i10 >= jpVar.d.size()) {
                break;
            }
            TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.c4) ((org.telegram.ui.Components.kp) jpVar.d.get(i10)).a.f.get(this.v)).b;
            org.telegram.ui.ActionBar.i6 j3 = ((org.telegram.ui.Components.kp) jpVar.d.get(i10)).a.j(this.v);
            if (tL_theme != null) {
                if (org.telegram.ui.ActionBar.j6.I.a.equals(org.telegram.ui.ActionBar.j6.q0(tL_theme.settings.get(((org.telegram.ui.ActionBar.c4) ((org.telegram.ui.Components.kp) jpVar.d.get(i10)).a.f.get(this.v)).d)))) {
                    LongSparseArray longSparseArray = org.telegram.ui.ActionBar.j6.I.c0;
                    if (longSparseArray != null) {
                        org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) longSparseArray.get(tL_theme.id);
                        if (h6Var != null && h6Var.a == org.telegram.ui.ActionBar.j6.I.Y) {
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
                if (j3 != null) {
                    if (org.telegram.ui.ActionBar.j6.I.a.equals(j3.m())) {
                        if (((org.telegram.ui.ActionBar.c4) ((org.telegram.ui.Components.kp) jpVar.d.get(i10)).a.f.get(this.v)).e == org.telegram.ui.ActionBar.j6.I.Y) {
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
            this.r = jpVar.d.size() - 1;
        }
        int i11 = 0;
        while (i11 < jpVar.d.size()) {
            ((org.telegram.ui.Components.kp) jpVar.d.get(i11)).d = i11 == this.r;
            i11++;
        }
        jpVar.E(this.r);
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
