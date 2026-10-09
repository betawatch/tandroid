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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ev extends LinearLayout {
    public final fc1 a;
    public s4.d0 b;
    public final org.telegram.ui.Components.aq c;
    public final org.telegram.ui.Components.ck0 d;
    public final org.telegram.ui.Cells.r8 e;
    public final org.telegram.ui.Cells.r8 f;
    public ValueAnimator h;
    public int n;
    public int r;
    public final int s;
    public int v;
    public Boolean w;

    public ev(int i10, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context);
        s4.d0 d0Var;
        org.telegram.ui.ActionBar.e6 e6Var = null;
        this.b = null;
        this.r = -1;
        this.w = null;
        this.s = i10;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, w7.x5.d(-2.0f, -1));
        org.telegram.ui.Components.aq aqVar = new org.telegram.ui.Components.aq(n2Var.getCurrentAccount(), (i10 == 0 || i10 == -1) ? 0 : 1, null);
        this.c = aqVar;
        fc1 fc1Var = new fc1(getContext(), 8, e6Var);
        this.a = fc1Var;
        fc1Var.setAdapter(aqVar);
        fc1Var.setSelectorDrawableColor(0);
        fc1Var.setClipChildren(false);
        fc1Var.setClipToPadding(false);
        fc1Var.setHasFixedSize(true);
        fc1Var.setItemAnimator(null);
        fc1Var.setNestedScrollingEnabled(false);
        c();
        fc1Var.setFocusable(false);
        fc1Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        fc1Var.setOnItemClickListener(new ai.o6(15, this, n2Var));
        org.telegram.ui.Components.j10 j10Var = new org.telegram.ui.Components.j10(getContext(), null);
        j10Var.setViewType(14);
        j10Var.setVisibility(0);
        if (i10 == 0 || i10 == -1) {
            frameLayout.addView(j10Var, w7.x5.a(104.0f, 0.0f, 8.0f, 0.0f, 8.0f, -1, 8388611));
            frameLayout.addView(fc1Var, w7.x5.a(104.0f, 0.0f, 8.0f, 0.0f, 8.0f, -1, 8388611));
        } else {
            frameLayout.addView(j10Var, w7.x5.a(104.0f, 0.0f, 8.0f, 0.0f, 8.0f, -1, 8388611));
            frameLayout.addView(fc1Var, w7.x5.a(-2.0f, 0.0f, 8.0f, 0.0f, 8.0f, -1, 8388611));
        }
        fc1Var.setEmptyView(j10Var);
        fc1Var.W1 = true;
        fc1Var.X1 = 0;
        if (i10 == 0) {
            org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.d = ck0Var;
            ck0Var.h = true;
            ck0Var.Z = true;
            ck0Var.o();
            org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context);
            this.e = r8Var;
            r8Var.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.i6, false), 2, -1));
            r8Var.w = 21;
            addView(r8Var, w7.x5.d(-2.0f, -1));
            org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(context);
            this.f = r8Var2;
            r8Var2.m(R.drawable.msg_colors, LocaleController.getString(R.string.SettingsBrowseThemes), false);
            addView(r8Var2, w7.x5.d(-2.0f, -1));
            r8Var.setOnClickListener(new cv(this, context, n2Var));
            ck0Var.h = true;
            r8Var2.setOnClickListener(new a(n2Var, 17));
            if (org.telegram.ui.ActionBar.i6.g1()) {
                r8Var.n(LocaleController.getString(R.string.SettingsSwitchToNightMode), ck0Var, true);
            } else {
                ck0Var.M(ck0Var.e[0] - 1);
                r8Var.n(LocaleController.getString(R.string.SettingsSwitchToDayMode), ck0Var, true);
            }
        }
        if (!MediaDataController.getInstance(n2Var.getCurrentAccount()).defaultEmojiThemes.isEmpty()) {
            ArrayList arrayList = new ArrayList(MediaDataController.getInstance(n2Var.getCurrentAccount()).defaultEmojiThemes);
            if (i10 == 0) {
                org.telegram.ui.ActionBar.c4 c4Var = new org.telegram.ui.ActionBar.c4(n2Var.getCurrentAccount());
                c4Var.e = "🎨";
                c4Var.c = fg.b.d("🎨");
                c4Var.d = TLRPC.ChatTheme.ofEmoticon(c4Var.e);
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayCustomTheme", null);
                int i11 = sharedPreferences.getInt("lastDayCustomThemeAccentId", -1);
                int i12 = 99;
                String str = "Blue";
                if (string == null || org.telegram.ui.ActionBar.i6.O0(string) == null) {
                    string = sharedPreferences.getString("lastDayTheme", "Blue");
                    org.telegram.ui.ActionBar.h6 O0 = org.telegram.ui.ActionBar.i6.O0(string);
                    if (O0 == null) {
                        i11 = 99;
                        string = "Blue";
                    } else {
                        i11 = O0.Y;
                    }
                    sharedPreferences.edit().putString("lastDayCustomTheme", string).apply();
                } else if (i11 == -1) {
                    i11 = org.telegram.ui.ActionBar.i6.O0(string).f0;
                }
                if (i11 != -1) {
                    str = string;
                    i12 = i11;
                }
                String string2 = sharedPreferences.getString("lastDarkCustomTheme", null);
                int i13 = sharedPreferences.getInt("lastDarkCustomThemeAccentId", -1);
                String str2 = "Dark Blue";
                if (string2 == null || org.telegram.ui.ActionBar.i6.O0(string2) == null) {
                    string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    org.telegram.ui.ActionBar.h6 O02 = org.telegram.ui.ActionBar.i6.O0(string2);
                    if (O02 == null) {
                        i13 = 0;
                        string2 = "Dark Blue";
                    } else {
                        i13 = O02.Y;
                    }
                    sharedPreferences.edit().putString("lastDarkCustomTheme", string2).apply();
                } else if (i13 == -1) {
                    i13 = org.telegram.ui.ActionBar.i6.O0(str).f0;
                }
                if (i13 == -1) {
                    i13 = 0;
                } else {
                    str2 = string2;
                }
                org.telegram.ui.ActionBar.b4 b4Var = new org.telegram.ui.ActionBar.b4();
                b4Var.a = org.telegram.ui.ActionBar.i6.O0(str);
                b4Var.e = i12;
                c4Var.f.add(b4Var);
                c4Var.f.add(null);
                org.telegram.ui.ActionBar.b4 b4Var2 = new org.telegram.ui.ActionBar.b4();
                b4Var2.a = org.telegram.ui.ActionBar.i6.O0(str2);
                b4Var2.e = i13;
                c4Var.f.add(b4Var2);
                c4Var.f.add(null);
                c4Var.n(n2Var.getCurrentAccount());
                org.telegram.ui.Components.bq bqVar = new org.telegram.ui.Components.bq(c4Var);
                bqVar.c = org.telegram.ui.ActionBar.i6.g1() ? 0 : 2;
                arrayList.add(bqVar);
            }
            aqVar.d = arrayList;
            aqVar.l();
        }
        b();
        d();
        a();
        int i14 = this.r;
        if (i14 < 0 || (d0Var = this.b) == null) {
            return;
        }
        d0Var.h1(i14, AndroidUtilities.dp(16.0f));
    }

    public final void a() {
        int i10 = this.s;
        if (i10 == 0 || i10 == -1) {
            org.telegram.ui.Components.ck0 ck0Var = this.d;
            if (ck0Var != null) {
                ck0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.q6, false), PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Cells.r8 r8Var = this.e;
            if (r8Var != null) {
                org.telegram.ui.ActionBar.i6.C1(r8Var.getBackground(), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.i6, false), true);
                r8Var.e(-1, org.telegram.ui.ActionBar.i6.q6);
            }
            org.telegram.ui.Cells.r8 r8Var2 = this.f;
            if (r8Var2 != null) {
                r8Var2.setBackground(org.telegram.ui.ActionBar.i6.h0(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.d6, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.i6, false)));
                int i11 = org.telegram.ui.ActionBar.i6.q6;
                r8Var2.e(i11, i11);
            }
        }
    }

    public final void b() {
        int i10;
        int i11;
        int i12 = this.s;
        if (i12 == 0 || i12 == -1) {
            this.v = org.telegram.ui.ActionBar.i6.g1() ? 0 : 2;
        } else if (org.telegram.ui.ActionBar.i6.I.m().equals("Blue")) {
            this.v = 0;
        } else if (org.telegram.ui.ActionBar.i6.I.m().equals("Day")) {
            this.v = 1;
        } else if (org.telegram.ui.ActionBar.i6.I.m().equals("Night")) {
            this.v = 2;
        } else if (org.telegram.ui.ActionBar.i6.I.m().equals("Dark Blue")) {
            this.v = 3;
        } else {
            if (org.telegram.ui.ActionBar.i6.g1() && ((i11 = this.v) == 2 || i11 == 3)) {
                this.v = 0;
            }
            if (!org.telegram.ui.ActionBar.i6.g1() && ((i10 = this.v) == 0 || i10 == 1)) {
                this.v = 2;
            }
        }
        org.telegram.ui.Components.aq aqVar = this.c;
        if (aqVar.d != null) {
            for (int i13 = 0; i13 < aqVar.d.size(); i13++) {
                ((org.telegram.ui.Components.bq) aqVar.d.get(i13)).c = this.v;
            }
            aqVar.q(0, aqVar.d.size());
        }
        d();
    }

    public final void c() {
        Point point = AndroidUtilities.displaySize;
        boolean z10 = point.y > point.x;
        Boolean bool = this.w;
        if (bool == null || bool.booleanValue() != z10) {
            fc1 fc1Var = this.a;
            int i10 = this.s;
            if (i10 != 0 && i10 != -1) {
                int i11 = z10 ? 3 : 9;
                s4.d0 d0Var = this.b;
                if (d0Var instanceof s4.s) {
                    ((s4.s) d0Var).y1(i11);
                } else {
                    fc1Var.setHasFixedSize(false);
                    getContext();
                    s4.s sVar = new s4.s(i11);
                    sVar.O = new dv(0);
                    this.b = sVar;
                    fc1Var.setLayoutManager(sVar);
                }
            } else if (this.b == null) {
                getContext();
                s4.d0 d0Var2 = new s4.d0(0, false);
                this.b = d0Var2;
                fc1Var.setLayoutManager(d0Var2);
            }
            this.w = Boolean.valueOf(z10);
        }
    }

    public final void d() {
        org.telegram.ui.Components.aq aqVar = this.c;
        if (aqVar.d == null) {
            return;
        }
        this.r = -1;
        int i10 = 0;
        while (true) {
            if (i10 >= aqVar.d.size()) {
                break;
            }
            TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.b4) ((org.telegram.ui.Components.bq) aqVar.d.get(i10)).a.f.get(this.v)).b;
            org.telegram.ui.ActionBar.h6 j3 = ((org.telegram.ui.Components.bq) aqVar.d.get(i10)).a.j(this.v);
            if (tL_theme != null) {
                if (org.telegram.ui.ActionBar.i6.I.a.equals(org.telegram.ui.ActionBar.i6.r0(tL_theme.settings.get(((org.telegram.ui.ActionBar.b4) ((org.telegram.ui.Components.bq) aqVar.d.get(i10)).a.f.get(this.v)).d)))) {
                    LongSparseArray longSparseArray = org.telegram.ui.ActionBar.i6.I.c0;
                    if (longSparseArray != null) {
                        org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) longSparseArray.get(tL_theme.id);
                        if (g6Var != null && g6Var.a == org.telegram.ui.ActionBar.i6.I.Y) {
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
                    if (org.telegram.ui.ActionBar.i6.I.a.equals(j3.m())) {
                        if (((org.telegram.ui.ActionBar.b4) ((org.telegram.ui.Components.bq) aqVar.d.get(i10)).a.f.get(this.v)).e == org.telegram.ui.ActionBar.i6.I.Y) {
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
            this.r = aqVar.d.size() - 1;
        }
        int i11 = 0;
        while (i11 < aqVar.d.size()) {
            ((org.telegram.ui.Components.bq) aqVar.d.get(i11)).d = i11 == this.r;
            i11++;
        }
        aqVar.E(this.r);
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
