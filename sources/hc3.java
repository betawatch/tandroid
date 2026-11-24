// default package

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.util.LongSparseArray;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class hc3 extends LinearLayout implements tjb {
    public int E;
    public final rkb a;
    public t26 b;
    public final vd2 c;
    public final oy8 d;
    public final wgb e;
    public final wgb f;
    public int h;
    public final byte n;
    public byte r;
    public Boolean s;
    public akb w;
    public boolean x;
    public ff0 y;

    /* JADX WARN: Multi-variable type inference failed */
    public hc3(Context context, d dVar, int i) {
        super(context);
        t26 t26Var;
        wjb wjbVar = null;
        this.b = null;
        this.h = -1;
        this.s = null;
        this.n = i;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, nme.c(-2.0f, -1));
        vd2 vd2Var = new vd2(dVar.getCurrentAccount(), 0L, null, (i == 0 || i == -1) ? 0 : 1);
        this.c = vd2Var;
        rkb rkbVar = new rkb(getContext(), wjbVar, (byte) 5);
        this.a = rkbVar;
        rkbVar.setAdapter(vd2Var);
        rkbVar.setSelectorDrawableColor(0);
        rkbVar.setClipChildren(false);
        rkbVar.setClipToPadding(false);
        rkbVar.setHasFixedSize(true);
        rkbVar.setItemAnimator(null);
        rkbVar.setNestedScrollingEnabled(false);
        b();
        rkbVar.setFocusable(false);
        rkbVar.setPadding(gl.L(12.0f), 0, gl.L(12.0f), 0);
        rkbVar.setOnItemClickListener(new k0(this, dVar, (byte) 11));
        pi4 pi4Var = new pi4(getContext(), null);
        pi4Var.setViewType(14);
        pi4Var.setVisibility(0);
        if (i == 0 || i == -1) {
            frameLayout.addView(pi4Var, nme.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(rkbVar, nme.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        } else {
            frameLayout.addView(pi4Var, nme.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(rkbVar, nme.d(-1, -2.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        }
        rkbVar.setEmptyView(pi4Var);
        rkbVar.X1 = true;
        rkbVar.Y1 = false;
        if (i == 0) {
            oy8 oy8Var = new oy8(R.raw.sun_outline, gl.L(28.0f), gl.L(28.0f), true, null);
            this.d = oy8Var;
            oy8Var.h = true;
            oy8Var.a0 = true;
            oy8Var.j();
            wgb wgbVar = new wgb(context);
            this.e = wgbVar;
            int i2 = bkb.h6;
            ff0 f0 = bkb.f0(bkb.w0(null, i2, false), 2, -1);
            vkb M = zkb.M(i2);
            wgbVar.setBackground(f0);
            zkb.j(wgbVar, f0, null, M, null);
            addView(wgbVar, nme.c(-2.0f, -1));
            wgb wgbVar2 = new wgb(context);
            this.f = wgbVar2;
            wgbVar2.o(R.drawable.msg_colors, k96.M0(2131745299, null), false);
            addView(wgbVar2, nme.c(-2.0f, -1));
            wgbVar.setOnClickListener(new fc3(this, dVar, r9));
            oy8Var.h = true;
            wgbVar2.setOnClickListener(new x91(dVar, (byte) 25));
            if (bkb.i1()) {
                wgbVar.p(k96.M0(2131745274, null), oy8Var, true);
                wgbVar.x += 2;
            } else {
                oy8Var.H(oy8Var.e[0] - 1);
                wgbVar.p(k96.M0(2131745275, null), oy8Var, true);
                wgbVar.x += 2;
            }
        }
        if (!hq6.d0(dVar.getCurrentAccount()).B0.isEmpty()) {
            ArrayList arrayList = new ArrayList(hq6.d0(dVar.getCurrentAccount()).B0);
            if (i == 0) {
                jy3 jy3Var = new jy3(dVar.getCurrentAccount());
                jy3Var.e = "🎨";
                jy3Var.c = elb.d("🎨");
                jy3Var.d = TLRPC.ChatTheme.ofEmoticon(jy3Var.e);
                SharedPreferences sharedPreferences = a.b.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayCustomTheme", null);
                int i3 = sharedPreferences.getInt("lastDayCustomThemeAccentId", -1);
                int i4 = 99;
                String str = "Blue";
                if (string == null || bkb.O0(string) == null) {
                    string = sharedPreferences.getString("lastDayTheme", "Blue");
                    akb O0 = bkb.O0(string);
                    if (O0 == null) {
                        i3 = 99;
                        string = "Blue";
                    } else {
                        i3 = O0.Z;
                    }
                    sharedPreferences.edit().putString("lastDayCustomTheme", string).apply();
                } else if (i3 == -1) {
                    i3 = bkb.O0(string).g0;
                }
                if (i3 != -1) {
                    str = string;
                    i4 = i3;
                }
                String string2 = sharedPreferences.getString("lastDarkCustomTheme", null);
                int i5 = sharedPreferences.getInt("lastDarkCustomThemeAccentId", -1);
                String str2 = "Dark Blue";
                if (string2 == null || bkb.O0(string2) == null) {
                    string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    akb O02 = bkb.O0(string2);
                    if (O02 == null) {
                        i5 = 0;
                        string2 = "Dark Blue";
                    } else {
                        i5 = O02.Z;
                    }
                    sharedPreferences.edit().putString("lastDarkCustomTheme", string2).apply();
                } else if (i5 == -1) {
                    i5 = bkb.O0(str).g0;
                }
                if (i5 == -1) {
                    i5 = 0;
                } else {
                    str2 = string2;
                }
                iy3 iy3Var = new iy3();
                iy3Var.a = bkb.O0(str);
                iy3Var.e = i4;
                jy3Var.f.add(iy3Var);
                jy3Var.f.add(null);
                iy3 iy3Var2 = new iy3();
                iy3Var2.a = bkb.O0(str2);
                iy3Var2.e = i5;
                jy3Var.f.add(iy3Var2);
                jy3Var.f.add(null);
                jy3Var.m(dVar.getCurrentAccount());
                wd2 wd2Var = new wd2(jy3Var);
                wd2Var.c = bkb.i1() ? (byte) 0 : (byte) 2;
                arrayList.add(wd2Var);
            }
            vd2Var.d = arrayList;
            vd2Var.f();
        }
        a();
        c();
        updateColors();
        int i6 = this.h;
        if (i6 < 0 || (t26Var = this.b) == null) {
            return;
        }
        t26Var.g1(i6, gl.L(16.0f));
    }

    public final void a() {
        ArrayList arrayList;
        byte b;
        byte b2;
        this.w = bkb.I;
        this.x = bkb.i1();
        byte b3 = this.n;
        if (b3 == 0 || b3 == -1) {
            this.r = bkb.i1() ? (byte) 0 : (byte) 2;
        } else if (bkb.I.k().equals("Blue")) {
            this.r = (byte) 0;
        } else if (bkb.I.k().equals("Day")) {
            this.r = (byte) 1;
        } else if (bkb.I.k().equals("Night")) {
            this.r = (byte) 2;
        } else if (bkb.I.k().equals("Dark Blue")) {
            this.r = (byte) 3;
        } else {
            if (bkb.i1() && ((b2 = this.r) == 2 || b2 == 3)) {
                this.r = (byte) 0;
            }
            if (!bkb.i1() && ((b = this.r) == 0 || b == 1)) {
                this.r = (byte) 2;
            }
        }
        vd2 vd2Var = this.c;
        if (vd2Var.d != null) {
            int i = 0;
            while (true) {
                int size = vd2Var.d.size();
                arrayList = vd2Var.d;
                if (i >= size) {
                    break;
                }
                ((wd2) arrayList.get(i)).c = this.r;
                i++;
            }
            vd2Var.l(0, arrayList.size());
        }
        c();
    }

    public final void b() {
        Point point = gl.q;
        boolean z = point.y > point.x;
        Boolean bool = this.s;
        if (bool == null || bool.booleanValue() != z) {
            rkb rkbVar = this.a;
            byte b = this.n;
            if (b != 0 && b != -1) {
                int i = z ? 3 : 9;
                t26 t26Var = this.b;
                if (t26Var instanceof r35) {
                    ((r35) t26Var).x1(i);
                } else {
                    rkbVar.setHasFixedSize(false);
                    getContext();
                    r35 r35Var = new r35(i);
                    r35Var.O = new gc3((byte) 0);
                    this.b = r35Var;
                    rkbVar.setLayoutManager(r35Var);
                }
            } else if (this.b == null) {
                getContext();
                t26 t26Var2 = new t26(0, false);
                this.b = t26Var2;
                rkbVar.setLayoutManager(t26Var2);
            }
            this.s = Boolean.valueOf(z);
        }
    }

    public final void c() {
        vd2 vd2Var = this.c;
        if (vd2Var.d == null) {
            return;
        }
        this.h = -1;
        int i = 0;
        while (true) {
            if (i >= vd2Var.d.size()) {
                break;
            }
            TLRPC.TL_theme tL_theme = ((iy3) ((wd2) vd2Var.d.get(i)).a.f.get(this.r)).b;
            akb i2 = ((wd2) vd2Var.d.get(i)).a.i(this.r);
            if (tL_theme != null) {
                if (bkb.I.a.equals(bkb.q0(tL_theme.settings.get(((iy3) ((wd2) vd2Var.d.get(i)).a.f.get(this.r)).d)))) {
                    LongSparseArray longSparseArray = bkb.I.d0;
                    if (longSparseArray != null) {
                        zjb zjbVar = (zjb) longSparseArray.get(tL_theme.id);
                        if (zjbVar != null && zjbVar.a == bkb.I.Z) {
                            this.h = i;
                            break;
                        }
                    } else {
                        this.h = i;
                        break;
                    }
                } else {
                    continue;
                }
                i++;
            } else {
                if (i2 != null) {
                    if (bkb.I.a.equals(i2.k())) {
                        if (((iy3) ((wd2) vd2Var.d.get(i)).a.f.get(this.r)).e == bkb.I.Z) {
                            this.h = i;
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
                i++;
            }
        }
        if (this.h == -1 && this.n != 3) {
            this.h = vd2Var.d.size() - 1;
        }
        int i3 = 0;
        while (i3 < vd2Var.d.size()) {
            ((wd2) vd2Var.d.get(i3)).d = i3 == this.h;
            i3++;
        }
        vd2Var.E(this.h);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        b();
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        updateColors();
    }

    @Override // tjb
    public final void updateColors() {
        akb akbVar;
        oy8 oy8Var;
        if (this.c != null && (akbVar = this.w) != null && (akbVar != bkb.I || this.x != bkb.i1())) {
            a();
            if (this.e != null && (oy8Var = this.d) != null) {
                if (!oy8Var.l0) {
                    this.d.H(bkb.i1() ? 0 : this.d.e[0] - 1);
                }
                this.e.p(k96.M0(bkb.i1() ? 2131745274 : 2131745275, null), this.d, true);
                this.e.x += 2;
            }
        }
        byte b = this.n;
        if (b == 0 || b == -1) {
            oy8 oy8Var2 = this.d;
            if (oy8Var2 != null) {
                oy8Var2.setColorFilter(new PorterDuffColorFilter(bkb.w0(null, bkb.p6, false), PorterDuff.Mode.SRC_IN));
            }
            wgb wgbVar = this.e;
            if (wgbVar != null) {
                bkb.F1(wgbVar.getBackground(), bkb.w0(null, bkb.h6, false), true);
                this.e.g(-1, bkb.p6);
            }
            if (this.f != null) {
                int w0 = bkb.w0(null, bkb.c6, false);
                int w02 = bkb.w0(null, bkb.h6, false);
                ff0 ff0Var = this.y;
                if (ug8.A(ff0Var) && this.f.getBackground() == ff0Var && ff0Var.getNumberOfLayers() > 0 && (ff0Var.getDrawable(0) instanceof ColorDrawable)) {
                    ((ColorDrawable) ff0Var.getDrawable(0)).setColor(w0);
                    if (w02 != this.E) {
                        this.E = w02;
                        ff0Var.setColor(ColorStateList.valueOf(w02));
                    }
                } else {
                    wgb wgbVar2 = this.f;
                    ff0 g0 = bkb.g0(w0, w02);
                    this.y = g0;
                    wgbVar2.setBackground(g0);
                    this.E = w02;
                }
                wgb wgbVar3 = this.f;
                int i = bkb.p6;
                wgbVar3.g(i, i);
            }
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
