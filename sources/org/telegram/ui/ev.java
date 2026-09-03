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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ev extends LinearLayout {
    public final rb1 a;
    public f2.i0 b;
    public final org.telegram.ui.Components.hp c;
    public final org.telegram.ui.Components.gj0 d;
    public final org.telegram.ui.Cells.n8 e;
    public final org.telegram.ui.Cells.n8 f;
    public ValueAnimator h;
    public int n;
    public int r;
    public final int s;
    public int v;
    public Boolean w;

    public ev(int i10, Context context, org.telegram.ui.ActionBar.p2 p2Var) {
        super(context);
        f2.i0 i0Var;
        org.telegram.ui.ActionBar.f6 f6Var = null;
        this.b = null;
        this.r = -1;
        this.w = null;
        this.s = i10;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, k7.b6.c(-2.0f, -1));
        org.telegram.ui.Components.hp hpVar = new org.telegram.ui.Components.hp(p2Var.getCurrentAccount(), (i10 == 0 || i10 == -1) ? 0 : 1, null);
        this.c = hpVar;
        rb1 rb1Var = new rb1(getContext(), 7, f6Var);
        this.a = rb1Var;
        rb1Var.setAdapter(hpVar);
        rb1Var.setSelectorDrawableColor(0);
        rb1Var.setClipChildren(false);
        rb1Var.setClipToPadding(false);
        rb1Var.setHasFixedSize(true);
        rb1Var.setItemAnimator(null);
        rb1Var.setNestedScrollingEnabled(false);
        c();
        rb1Var.setFocusable(false);
        rb1Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        rb1Var.setOnItemClickListener(new gg.v0(16, this, p2Var));
        org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(getContext(), null);
        u00Var.setViewType(14);
        u00Var.setVisibility(0);
        if (i10 == 0 || i10 == -1) {
            frameLayout.addView(u00Var, k7.b6.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(rb1Var, k7.b6.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        } else {
            frameLayout.addView(u00Var, k7.b6.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(rb1Var, k7.b6.d(-1, -2.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        }
        rb1Var.setEmptyView(u00Var);
        rb1Var.V1 = true;
        rb1Var.W1 = 0;
        if (i10 == 0) {
            org.telegram.ui.Components.gj0 gj0Var = new org.telegram.ui.Components.gj0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.d = gj0Var;
            gj0Var.h = true;
            gj0Var.X = true;
            gj0Var.m();
            org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(context);
            this.e = n8Var;
            n8Var.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), 2, -1));
            n8Var.w = 21;
            addView(n8Var, k7.b6.c(-2.0f, -1));
            org.telegram.ui.Cells.n8 n8Var2 = new org.telegram.ui.Cells.n8(context);
            this.f = n8Var2;
            n8Var2.m(R.drawable.msg_colors, LocaleController.getString(R.string.SettingsBrowseThemes), false);
            addView(n8Var2, k7.b6.c(-2.0f, -1));
            n8Var.setOnClickListener(new dv(this, context, p2Var));
            gj0Var.h = true;
            n8Var2.setOnClickListener(new a(p2Var, 18));
            if (org.telegram.ui.ActionBar.j6.f1()) {
                n8Var.n(LocaleController.getString(R.string.SettingsSwitchToNightMode), gj0Var, true);
            } else {
                gj0Var.K(gj0Var.e[0] - 1);
                n8Var.n(LocaleController.getString(R.string.SettingsSwitchToDayMode), gj0Var, true);
            }
        }
        if (!MediaDataController.getInstance(p2Var.getCurrentAccount()).defaultEmojiThemes.isEmpty()) {
            ArrayList arrayList = new ArrayList(MediaDataController.getInstance(p2Var.getCurrentAccount()).defaultEmojiThemes);
            if (i10 == 0) {
                org.telegram.ui.ActionBar.e4 e4Var = new org.telegram.ui.ActionBar.e4(p2Var.getCurrentAccount());
                e4Var.e = "🎨";
                e4Var.c = sf.b.d("🎨");
                e4Var.d = TLRPC.ChatTheme.ofEmoticon(e4Var.e);
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
                        i11 = N0.V;
                    }
                    sharedPreferences.edit().putString("lastDayCustomTheme", string).apply();
                } else if (i11 == -1) {
                    i11 = org.telegram.ui.ActionBar.j6.N0(string).c0;
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
                        i13 = N02.V;
                    }
                    sharedPreferences.edit().putString("lastDarkCustomTheme", string2).apply();
                } else if (i13 == -1) {
                    i13 = org.telegram.ui.ActionBar.j6.N0(str).c0;
                }
                if (i13 == -1) {
                    i13 = 0;
                } else {
                    str2 = string2;
                }
                org.telegram.ui.ActionBar.d4 d4Var = new org.telegram.ui.ActionBar.d4();
                d4Var.a = org.telegram.ui.ActionBar.j6.N0(str);
                d4Var.e = i12;
                e4Var.f.add(d4Var);
                e4Var.f.add(null);
                org.telegram.ui.ActionBar.d4 d4Var2 = new org.telegram.ui.ActionBar.d4();
                d4Var2.a = org.telegram.ui.ActionBar.j6.N0(str2);
                d4Var2.e = i13;
                e4Var.f.add(d4Var2);
                e4Var.f.add(null);
                e4Var.n(p2Var.getCurrentAccount());
                org.telegram.ui.Components.ip ipVar = new org.telegram.ui.Components.ip(e4Var);
                ipVar.c = org.telegram.ui.ActionBar.j6.f1() ? 0 : 2;
                arrayList.add(ipVar);
            }
            hpVar.d = arrayList;
            hpVar.l();
        }
        b();
        d();
        a();
        int i14 = this.r;
        if (i14 < 0 || (i0Var = this.b) == null) {
            return;
        }
        i0Var.h1(i14, AndroidUtilities.dp(16.0f));
    }

    public final void a() {
        int i10 = this.s;
        if (i10 == 0 || i10 == -1) {
            org.telegram.ui.Components.gj0 gj0Var = this.d;
            if (gj0Var != null) {
                gj0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false), PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Cells.n8 n8Var = this.e;
            if (n8Var != null) {
                org.telegram.ui.ActionBar.j6.B1(n8Var.getBackground(), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), true);
                n8Var.e(-1, org.telegram.ui.ActionBar.j6.q6);
            }
            org.telegram.ui.Cells.n8 n8Var2 = this.f;
            if (n8Var2 != null) {
                n8Var2.setBackground(org.telegram.ui.ActionBar.j6.g0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false)));
                int i11 = org.telegram.ui.ActionBar.j6.q6;
                n8Var2.e(i11, i11);
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
        org.telegram.ui.Components.hp hpVar = this.c;
        if (hpVar.d != null) {
            for (int i13 = 0; i13 < hpVar.d.size(); i13++) {
                ((org.telegram.ui.Components.ip) hpVar.d.get(i13)).c = this.v;
            }
            hpVar.q(0, hpVar.d.size());
        }
        d();
    }

    public final void c() {
        Point point = AndroidUtilities.displaySize;
        boolean z4 = point.y > point.x;
        Boolean bool = this.w;
        if (bool == null || bool.booleanValue() != z4) {
            rb1 rb1Var = this.a;
            int i10 = this.s;
            if (i10 != 0 && i10 != -1) {
                int i11 = z4 ? 3 : 9;
                f2.i0 i0Var = this.b;
                if (i0Var instanceof f2.w) {
                    ((f2.w) i0Var).y1(i11);
                } else {
                    rb1Var.setHasFixedSize(false);
                    getContext();
                    f2.w wVar = new f2.w(i11);
                    wVar.O = new f2.t(1);
                    this.b = wVar;
                    rb1Var.setLayoutManager(wVar);
                }
            } else if (this.b == null) {
                getContext();
                f2.i0 i0Var2 = new f2.i0(0, false);
                this.b = i0Var2;
                rb1Var.setLayoutManager(i0Var2);
            }
            this.w = Boolean.valueOf(z4);
        }
    }

    public final void d() {
        org.telegram.ui.Components.hp hpVar = this.c;
        if (hpVar.d == null) {
            return;
        }
        this.r = -1;
        int i10 = 0;
        while (true) {
            if (i10 >= hpVar.d.size()) {
                break;
            }
            TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.d4) ((org.telegram.ui.Components.ip) hpVar.d.get(i10)).a.f.get(this.v)).b;
            org.telegram.ui.ActionBar.i6 j10 = ((org.telegram.ui.Components.ip) hpVar.d.get(i10)).a.j(this.v);
            if (tL_theme != null) {
                if (org.telegram.ui.ActionBar.j6.I.a.equals(org.telegram.ui.ActionBar.j6.q0(tL_theme.settings.get(((org.telegram.ui.ActionBar.d4) ((org.telegram.ui.Components.ip) hpVar.d.get(i10)).a.f.get(this.v)).d)))) {
                    LongSparseArray longSparseArray = org.telegram.ui.ActionBar.j6.I.Z;
                    if (longSparseArray != null) {
                        org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) longSparseArray.get(tL_theme.id);
                        if (h6Var != null && h6Var.a == org.telegram.ui.ActionBar.j6.I.V) {
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
                    if (org.telegram.ui.ActionBar.j6.I.a.equals(j10.m())) {
                        if (((org.telegram.ui.ActionBar.d4) ((org.telegram.ui.Components.ip) hpVar.d.get(i10)).a.f.get(this.v)).e == org.telegram.ui.ActionBar.j6.I.V) {
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
            this.r = hpVar.d.size() - 1;
        }
        int i11 = 0;
        while (i11 < hpVar.d.size()) {
            ((org.telegram.ui.Components.ip) hpVar.d.get(i11)).d = i11 == this.r;
            i11++;
        }
        hpVar.E(this.r);
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
