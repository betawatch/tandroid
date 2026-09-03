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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class dv extends LinearLayout {
    public final qb1 a;
    public f2.j0 b;
    public final org.telegram.ui.Components.kp c;
    public final org.telegram.ui.Components.hj0 d;
    public final org.telegram.ui.Cells.o8 e;
    public final org.telegram.ui.Cells.o8 f;
    public ValueAnimator h;
    public int n;
    public int r;
    public final int s;
    public int v;
    public Boolean w;

    public dv(int i10, Context context, org.telegram.ui.ActionBar.p2 p2Var) {
        super(context);
        f2.j0 j0Var;
        org.telegram.ui.ActionBar.g6 g6Var = null;
        this.b = null;
        this.r = -1;
        this.w = null;
        this.s = i10;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, k7.c6.c(-2.0f, -1));
        org.telegram.ui.Components.kp kpVar = new org.telegram.ui.Components.kp(p2Var.getCurrentAccount(), (i10 == 0 || i10 == -1) ? 0 : 1, null);
        this.c = kpVar;
        qb1 qb1Var = new qb1(getContext(), 7, g6Var);
        this.a = qb1Var;
        qb1Var.setAdapter(kpVar);
        qb1Var.setSelectorDrawableColor(0);
        qb1Var.setClipChildren(false);
        qb1Var.setClipToPadding(false);
        qb1Var.setHasFixedSize(true);
        qb1Var.setItemAnimator(null);
        qb1Var.setNestedScrollingEnabled(false);
        c();
        qb1Var.setFocusable(false);
        qb1Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        qb1Var.setOnItemClickListener(new hg.v0(15, this, p2Var));
        org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(getContext(), null);
        u00Var.setViewType(14);
        u00Var.setVisibility(0);
        if (i10 == 0 || i10 == -1) {
            frameLayout.addView(u00Var, k7.c6.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(qb1Var, k7.c6.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        } else {
            frameLayout.addView(u00Var, k7.c6.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(qb1Var, k7.c6.d(-1, -2.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        }
        qb1Var.setEmptyView(u00Var);
        qb1Var.V1 = true;
        qb1Var.W1 = 0;
        if (i10 == 0) {
            org.telegram.ui.Components.hj0 hj0Var = new org.telegram.ui.Components.hj0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.d = hj0Var;
            hj0Var.h = true;
            hj0Var.X = true;
            hj0Var.m();
            org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(context);
            this.e = o8Var;
            o8Var.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.i6, false), 2, -1));
            o8Var.w = 21;
            addView(o8Var, k7.c6.c(-2.0f, -1));
            org.telegram.ui.Cells.o8 o8Var2 = new org.telegram.ui.Cells.o8(context);
            this.f = o8Var2;
            o8Var2.m(R.drawable.msg_colors, LocaleController.getString(R.string.SettingsBrowseThemes), false);
            addView(o8Var2, k7.c6.c(-2.0f, -1));
            o8Var.setOnClickListener(new cv(this, context, p2Var));
            hj0Var.h = true;
            o8Var2.setOnClickListener(new a(p2Var, 18));
            if (org.telegram.ui.ActionBar.k6.f1()) {
                o8Var.n(LocaleController.getString(R.string.SettingsSwitchToNightMode), hj0Var, true);
            } else {
                hj0Var.K(hj0Var.e[0] - 1);
                o8Var.n(LocaleController.getString(R.string.SettingsSwitchToDayMode), hj0Var, true);
            }
        }
        if (!MediaDataController.getInstance(p2Var.getCurrentAccount()).defaultEmojiThemes.isEmpty()) {
            ArrayList arrayList = new ArrayList(MediaDataController.getInstance(p2Var.getCurrentAccount()).defaultEmojiThemes);
            if (i10 == 0) {
                org.telegram.ui.ActionBar.f4 f4Var = new org.telegram.ui.ActionBar.f4(p2Var.getCurrentAccount());
                f4Var.e = "🎨";
                f4Var.c = tf.b.d("🎨");
                f4Var.d = TLRPC.ChatTheme.ofEmoticon(f4Var.e);
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayCustomTheme", null);
                int i11 = sharedPreferences.getInt("lastDayCustomThemeAccentId", -1);
                int i12 = 99;
                String str = "Blue";
                if (string == null || org.telegram.ui.ActionBar.k6.N0(string) == null) {
                    string = sharedPreferences.getString("lastDayTheme", "Blue");
                    org.telegram.ui.ActionBar.j6 N0 = org.telegram.ui.ActionBar.k6.N0(string);
                    if (N0 == null) {
                        string = "Blue";
                        i11 = 99;
                    } else {
                        i11 = N0.V;
                    }
                    sharedPreferences.edit().putString("lastDayCustomTheme", string).apply();
                } else if (i11 == -1) {
                    i11 = org.telegram.ui.ActionBar.k6.N0(string).c0;
                }
                if (i11 != -1) {
                    str = string;
                    i12 = i11;
                }
                String string2 = sharedPreferences.getString("lastDarkCustomTheme", null);
                int i13 = sharedPreferences.getInt("lastDarkCustomThemeAccentId", -1);
                String str2 = "Dark Blue";
                if (string2 == null || org.telegram.ui.ActionBar.k6.N0(string2) == null) {
                    string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    org.telegram.ui.ActionBar.j6 N02 = org.telegram.ui.ActionBar.k6.N0(string2);
                    if (N02 == null) {
                        string2 = "Dark Blue";
                        i13 = 0;
                    } else {
                        i13 = N02.V;
                    }
                    sharedPreferences.edit().putString("lastDarkCustomTheme", string2).apply();
                } else if (i13 == -1) {
                    i13 = org.telegram.ui.ActionBar.k6.N0(str).c0;
                }
                if (i13 == -1) {
                    i13 = 0;
                } else {
                    str2 = string2;
                }
                org.telegram.ui.ActionBar.e4 e4Var = new org.telegram.ui.ActionBar.e4();
                e4Var.a = org.telegram.ui.ActionBar.k6.N0(str);
                e4Var.e = i12;
                f4Var.f.add(e4Var);
                f4Var.f.add(null);
                org.telegram.ui.ActionBar.e4 e4Var2 = new org.telegram.ui.ActionBar.e4();
                e4Var2.a = org.telegram.ui.ActionBar.k6.N0(str2);
                e4Var2.e = i13;
                f4Var.f.add(e4Var2);
                f4Var.f.add(null);
                f4Var.n(p2Var.getCurrentAccount());
                org.telegram.ui.Components.lp lpVar = new org.telegram.ui.Components.lp(f4Var);
                lpVar.c = org.telegram.ui.ActionBar.k6.f1() ? 0 : 2;
                arrayList.add(lpVar);
            }
            kpVar.d = arrayList;
            kpVar.l();
        }
        b();
        d();
        a();
        int i14 = this.r;
        if (i14 < 0 || (j0Var = this.b) == null) {
            return;
        }
        j0Var.h1(i14, AndroidUtilities.dp(16.0f));
    }

    public final void a() {
        int i10 = this.s;
        if (i10 == 0 || i10 == -1) {
            org.telegram.ui.Components.hj0 hj0Var = this.d;
            if (hj0Var != null) {
                hj0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.q6, false), PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Cells.o8 o8Var = this.e;
            if (o8Var != null) {
                org.telegram.ui.ActionBar.k6.B1(o8Var.getBackground(), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.i6, false), true);
                o8Var.e(-1, org.telegram.ui.ActionBar.k6.q6);
            }
            org.telegram.ui.Cells.o8 o8Var2 = this.f;
            if (o8Var2 != null) {
                o8Var2.setBackground(org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.i6, false)));
                int i11 = org.telegram.ui.ActionBar.k6.q6;
                o8Var2.e(i11, i11);
            }
        }
    }

    public final void b() {
        int i10;
        int i11;
        int i12 = this.s;
        if (i12 == 0 || i12 == -1) {
            this.v = org.telegram.ui.ActionBar.k6.f1() ? 0 : 2;
        } else if (org.telegram.ui.ActionBar.k6.I.m().equals("Blue")) {
            this.v = 0;
        } else if (org.telegram.ui.ActionBar.k6.I.m().equals("Day")) {
            this.v = 1;
        } else if (org.telegram.ui.ActionBar.k6.I.m().equals("Night")) {
            this.v = 2;
        } else if (org.telegram.ui.ActionBar.k6.I.m().equals("Dark Blue")) {
            this.v = 3;
        } else {
            if (org.telegram.ui.ActionBar.k6.f1() && ((i11 = this.v) == 2 || i11 == 3)) {
                this.v = 0;
            }
            if (!org.telegram.ui.ActionBar.k6.f1() && ((i10 = this.v) == 0 || i10 == 1)) {
                this.v = 2;
            }
        }
        org.telegram.ui.Components.kp kpVar = this.c;
        if (kpVar.d != null) {
            for (int i13 = 0; i13 < kpVar.d.size(); i13++) {
                ((org.telegram.ui.Components.lp) kpVar.d.get(i13)).c = this.v;
            }
            kpVar.q(0, kpVar.d.size());
        }
        d();
    }

    public final void c() {
        Point point = AndroidUtilities.displaySize;
        boolean z4 = point.y > point.x;
        Boolean bool = this.w;
        if (bool == null || bool.booleanValue() != z4) {
            qb1 qb1Var = this.a;
            int i10 = this.s;
            if (i10 != 0 && i10 != -1) {
                int i11 = z4 ? 3 : 9;
                f2.j0 j0Var = this.b;
                if (j0Var instanceof f2.w) {
                    ((f2.w) j0Var).y1(i11);
                } else {
                    qb1Var.setHasFixedSize(false);
                    getContext();
                    f2.w wVar = new f2.w(i11);
                    wVar.O = new f2.t(1);
                    this.b = wVar;
                    qb1Var.setLayoutManager(wVar);
                }
            } else if (this.b == null) {
                getContext();
                f2.j0 j0Var2 = new f2.j0(0, false);
                this.b = j0Var2;
                qb1Var.setLayoutManager(j0Var2);
            }
            this.w = Boolean.valueOf(z4);
        }
    }

    public final void d() {
        org.telegram.ui.Components.kp kpVar = this.c;
        if (kpVar.d == null) {
            return;
        }
        this.r = -1;
        int i10 = 0;
        while (true) {
            if (i10 >= kpVar.d.size()) {
                break;
            }
            TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.e4) ((org.telegram.ui.Components.lp) kpVar.d.get(i10)).a.f.get(this.v)).b;
            org.telegram.ui.ActionBar.j6 j10 = ((org.telegram.ui.Components.lp) kpVar.d.get(i10)).a.j(this.v);
            if (tL_theme != null) {
                if (org.telegram.ui.ActionBar.k6.I.a.equals(org.telegram.ui.ActionBar.k6.q0(tL_theme.settings.get(((org.telegram.ui.ActionBar.e4) ((org.telegram.ui.Components.lp) kpVar.d.get(i10)).a.f.get(this.v)).d)))) {
                    LongSparseArray longSparseArray = org.telegram.ui.ActionBar.k6.I.Z;
                    if (longSparseArray != null) {
                        org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) longSparseArray.get(tL_theme.id);
                        if (i6Var != null && i6Var.a == org.telegram.ui.ActionBar.k6.I.V) {
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
                    if (org.telegram.ui.ActionBar.k6.I.a.equals(j10.m())) {
                        if (((org.telegram.ui.ActionBar.e4) ((org.telegram.ui.Components.lp) kpVar.d.get(i10)).a.f.get(this.v)).e == org.telegram.ui.ActionBar.k6.I.V) {
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
            this.r = kpVar.d.size() - 1;
        }
        int i11 = 0;
        while (i11 < kpVar.d.size()) {
            ((org.telegram.ui.Components.lp) kpVar.d.get(i11)).d = i11 == this.r;
            i11++;
        }
        kpVar.E(this.r);
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
