package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.DataAutoDownloadActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class DataAutoDownloadActivity extends org.telegram.ui.ActionBar.d {
    public final dr3 E;
    public final dr3 F;
    public final dr3 G;
    public final dr3 H;
    public final dr3 I;
    public boolean J;
    public final String K;
    public final String L;
    public s30 a;
    private int autoDownloadRow;
    public r59 b;
    public final ArrayList c;
    public int d;
    public int e;
    public final int f;
    private int filesRow;
    public boolean h;
    public boolean n;
    private int photosRow;
    public int r;
    public int s;
    private int storiesRow;
    private int usageProgressRow;
    private int videosRow;
    public int w;
    public int x;
    public int y;

    public DataAutoDownloadActivity(int i) {
        super(null);
        this.c = new ArrayList();
        this.d = 1;
        this.f = i;
        dr3 dr3Var = er3.q(this.currentAccount).K;
        this.E = dr3Var;
        dr3 dr3Var2 = er3.q(this.currentAccount).L;
        this.F = dr3Var2;
        dr3 dr3Var3 = er3.q(this.currentAccount).M;
        this.G = dr3Var3;
        if (i == 0) {
            this.e = er3.q(this.currentAccount).Q;
            this.H = er3.q(this.currentAccount).N;
            this.I = dr3Var2;
            this.K = "mobilePreset";
            this.L = "currentMobilePreset";
            return;
        }
        int i2 = this.currentAccount;
        if (i == 1) {
            this.e = er3.q(i2).R;
            this.H = er3.q(this.currentAccount).O;
            this.I = dr3Var3;
            this.K = "wifiPreset";
            this.L = "currentWifiPreset";
            return;
        }
        this.e = er3.q(i2).S;
        this.H = er3.q(this.currentAccount).P;
        this.I = dr3Var;
        this.K = "roamingPreset";
        this.L = "currentRoamingPreset";
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.x6));
        hashSet.add(Integer.valueOf(cmb.M6));
        hashSet.add(Integer.valueOf(cmb.L6));
        hashSet.add(Integer.valueOf(cmb.A6));
        hashSet.add(Integer.valueOf(cmb.y6));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.f6));
        hashSet.add(Integer.valueOf(cmb.d6));
        hashSet.add(Integer.valueOf(cmb.e6));
        hashSet.add(Integer.valueOf(cmb.K6));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        byte b = 2;
        int i = this.f;
        if (i == 0) {
            this.simpleActionBar.setTitle(jb6.M0(2131753789, null));
        } else if (i == 1) {
            this.simpleActionBar.setTitle(jb6.M0(2131753784, null));
        } else if (i == 2) {
            this.simpleActionBar.setTitle(jb6.M0(2131753787, null));
        }
        tk5 tk5Var = this.parentLayout;
        if (tk5Var != null && ((ActionBarLayout) tk5Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new fh2(this, (byte) 9));
        this.a = new s30(this, context, b);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        r59 r59Var = new r59(context, null);
        this.b = r59Var;
        r59Var.r1();
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setSectionsDrawBackground(true);
        ((sc3) this.b.getItemAnimator()).C = false;
        this.b.setLayoutManager(new u46(1, false));
        frameLayout.addView(this.b, qoe.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new wm2(this, (byte) 14));
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final r59 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cnb(this.b, 16, new Class[]{jf5.class, yn7.class, hla.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.c6));
        arrayList.add(new cnb(this.b, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.N6));
        arrayList.add(new cnb(this.b, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.O6));
        arrayList.add(new cnb(this.b, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.P6));
        arrayList.add(new cnb(this.b, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.Q6));
        arrayList.add(new cnb(this.b, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.R6));
        arrayList.add(new cnb(this.b, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.S6));
        arrayList.add(new cnb(this.b, 0, new Class[]{yn7.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.L6));
        arrayList.add(new cnb(this.b, 0, new Class[]{yn7.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.M6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void n0() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        dr3 dr3Var = this.E;
        arrayList.add(dr3Var);
        dr3 dr3Var2 = this.F;
        arrayList.add(dr3Var2);
        dr3 dr3Var3 = this.G;
        arrayList.add(dr3Var3);
        dr3 dr3Var4 = this.H;
        if (!dr3Var4.a(dr3Var) && !dr3Var4.a(dr3Var2) && !dr3Var4.a(dr3Var3)) {
            arrayList.add(dr3Var4);
        }
        Collections.sort(arrayList, new x03((byte) 2));
        int i = this.e;
        if (i == 0 || (i == 3 && dr3Var4.a(dr3Var))) {
            this.d = arrayList.indexOf(dr3Var);
        } else {
            int i2 = this.e;
            if (i2 == 1 || (i2 == 3 && dr3Var4.a(dr3Var2))) {
                this.d = arrayList.indexOf(dr3Var2);
            } else {
                int i3 = this.e;
                if (i3 == 2 || (i3 == 3 && dr3Var4.a(dr3Var3))) {
                    this.d = arrayList.indexOf(dr3Var3);
                } else {
                    this.d = arrayList.indexOf(dr3Var4);
                }
            }
        }
        r59 r59Var = this.b;
        if (r59Var != null) {
            u69 K = r59Var.K(this.usageProgressRow);
            if (K != null) {
                View view = K.a;
                if (view instanceof hla) {
                    r0((hla) view);
                    return;
                }
            }
            this.a.g(this.usageProgressRow);
        }
    }

    public final void o0(yib yibVar, yib[] yibVarArr, int i, ul6[] ul6VarArr, bjb[] bjbVarArr, AnimatorSet[] animatorSetArr, View view) {
        if (view.isEnabled()) {
            boolean z = true;
            yibVar.setChecked(!yibVar.b.h);
            int i2 = 0;
            while (true) {
                if (i2 >= yibVarArr.length) {
                    z = false;
                    break;
                } else if (yibVarArr[i2].b.h) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i != this.videosRow || ul6VarArr[0].isEnabled() == z) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            ul6VarArr[0].a(arrayList, z);
            if (ul6VarArr[0].getSize() > 2097152) {
                bjbVarArr[0].e(arrayList, z);
            }
            AnimatorSet animatorSet = animatorSetArr[0];
            if (animatorSet != null) {
                animatorSet.cancel();
                animatorSetArr[0] = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSetArr[0] = animatorSet2;
            animatorSet2.playTogether(arrayList);
            animatorSetArr[0].addListener(new kh2(animatorSetArr, (byte) 5));
            animatorSetArr[0].setDuration(150L);
            animatorSetArr[0].start();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        n0();
        s0();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onPause() {
        super.onPause();
        if (this.J) {
            er3.q(this.currentAccount).w(this.f);
            this.J = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        s30 s30Var = this.a;
        if (s30Var != null) {
            s30Var.f();
        }
    }

    public final void p0(yib[] yibVarArr, int i, ul6[] ul6VarArr, int i2, bjb[] bjbVarArr, int i3, String str, String str2, k6d k6dVar, View view) {
        int i4 = this.e;
        dr3 dr3Var = this.H;
        if (i4 != 3) {
            if (i4 == 0) {
                dr3Var.c(this.E);
            } else if (i4 == 1) {
                dr3Var.c(this.F);
            } else if (i4 == 2) {
                dr3Var.c(this.G);
            }
        }
        for (int i5 = 0; i5 < 4; i5++) {
            if (yibVarArr[i5].b.h) {
                int[] iArr = dr3Var.a;
                iArr[i5] = iArr[i5] | i;
            } else {
                int[] iArr2 = dr3Var.a;
                iArr2[i5] = iArr2[i5] & (~i);
            }
        }
        ul6 ul6Var = ul6VarArr[0];
        if (ul6Var != null) {
            ul6Var.getSize();
            dr3Var.b[i2] = (int) ul6VarArr[0].getSize();
        }
        bjb bjbVar = bjbVarArr[0];
        if (bjbVar != null) {
            int i6 = this.videosRow;
            Switch r9 = bjbVar.e;
            if (i3 == i6) {
                dr3Var.c = r9.h;
            } else {
                dr3Var.d = r9.h;
            }
        }
        SharedPreferences.Editor edit = oc7.r1(this.currentAccount).X3.edit();
        edit.putString(str, dr3Var.toString());
        this.e = 3;
        edit.putInt(str2, 3);
        int i7 = this.currentAccount;
        int i8 = this.f;
        if (i8 == 0) {
            er3.q(i7).Q = this.e;
        } else if (i8 == 1) {
            er3.q(i7).R = this.e;
        } else {
            er3.q(i7).S = this.e;
        }
        edit.commit();
        ((my0) k6dVar.b).y0.run();
        u69 G = this.b.G(view);
        if (G != null) {
            this.h = true;
            this.a.t(G, i3);
            this.h = false;
        }
        er3.q(this.currentAccount).g();
        this.J = true;
        n0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v20 */
    public final void q0(float f, int i, final View view) {
        dr3 o;
        String str;
        String str2;
        boolean z;
        boolean z2;
        final bjb[] bjbVarArr;
        ?? r12;
        ArrayList arrayList;
        int i2 = i;
        int i3 = this.autoDownloadRow;
        dr3 dr3Var = this.G;
        dr3 dr3Var2 = this.F;
        dr3 dr3Var3 = this.E;
        int i4 = this.f;
        dr3 dr3Var4 = this.H;
        ylb ylbVar = null;
        if (i2 == i3) {
            int i5 = this.e;
            if (i5 != 3) {
                if (i5 == 0) {
                    dr3Var4.c(dr3Var3);
                } else if (i5 == 1) {
                    dr3Var4.c(dr3Var2);
                } else if (i5 == 2) {
                    dr3Var4.c(dr3Var);
                }
            }
            bjb bjbVar = (bjb) view;
            boolean z3 = bjbVar.e.h;
            if (z3 || !dr3Var4.g) {
                dr3Var4.g = !dr3Var4.g;
            } else {
                System.arraycopy(this.I.a, 0, dr3Var4.a, 0, 4);
            }
            view.setTag(Integer.valueOf(dr3Var4.g ? cmb.e6 : cmb.d6));
            boolean z4 = !z3;
            bjbVar.b(cmb.w0(null, dr3Var4.g ? cmb.e6 : cmb.d6, false), z4);
            s0();
            boolean z5 = dr3Var4.g;
            s30 s30Var = this.a;
            int i6 = (this.n ? 1 : 0) + 1;
            if (z5) {
                s30Var.p(i6, 9);
            } else {
                s30Var.q(i6, 9);
            }
            this.a.g(this.n ? 1 : 0);
            SharedPreferences.Editor edit = oc7.r1(this.currentAccount).X3.edit();
            edit.putString(this.K, dr3Var4.toString());
            this.e = 3;
            edit.putInt(this.L, 3);
            int i7 = this.currentAccount;
            if (i4 == 0) {
                er3.q(i7).Q = this.e;
            } else if (i4 == 1) {
                er3.q(i7).R = this.e;
            } else {
                er3.q(i7).S = this.e;
            }
            edit.commit();
            bjbVar.setChecked(z4);
            er3.q(this.currentAccount).g();
            this.J = true;
            return;
        }
        if ((i2 == this.photosRow || i2 == this.videosRow || i2 == this.filesRow || i2 == this.storiesRow) && view.isEnabled()) {
            int i8 = i2 == this.photosRow ? 1 : i2 == this.videosRow ? 4 : i2 == this.storiesRow ? -1 : 8;
            final int x = er3.x(i8);
            int i9 = this.currentAccount;
            if (i4 == 0) {
                o = er3.q(i9).n();
                str = "mobilePreset";
                str2 = "currentMobilePreset";
            } else if (i4 == 1) {
                o = er3.q(i9).p();
                str = "wifiPreset";
                str2 = "currentWifiPreset";
            } else {
                o = er3.q(i9).o();
                str = "roamingPreset";
                str2 = "currentRoamingPreset";
            }
            yn7 yn7Var = (yn7) view;
            boolean z6 = yn7Var.e.h;
            if (i2 == this.storiesRow || ((jb6.a0 && f <= gm.L(76.0f)) || (!jb6.a0 && f >= view.getMeasuredWidth() - gm.L(76.0f)))) {
                dr3 dr3Var5 = o;
                int i10 = i8;
                String str3 = str;
                String str4 = str2;
                int i11 = this.e;
                if (i11 != 3) {
                    if (i11 == 0) {
                        dr3Var4.c(dr3Var3);
                    } else if (i11 == 1) {
                        dr3Var4.c(dr3Var2);
                    } else if (i11 == 2) {
                        dr3Var4.c(dr3Var);
                    }
                }
                if (i2 != this.storiesRow) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= dr3Var4.a.length) {
                            z = false;
                            break;
                        } else {
                            if ((dr3Var5.a[i12] & i10) != 0) {
                                z = true;
                                break;
                            }
                            i12++;
                        }
                    }
                    int i13 = 0;
                    while (true) {
                        int[] iArr = dr3Var4.a;
                        if (i13 >= iArr.length) {
                            break;
                        }
                        if (z6) {
                            iArr[i13] = iArr[i13] & (~i10);
                        } else if (!z) {
                            iArr[i13] = iArr[i13] | i10;
                        }
                        i13++;
                    }
                } else {
                    dr3Var4.e = !z6;
                }
                SharedPreferences.Editor edit2 = oc7.r1(this.currentAccount).X3.edit();
                edit2.putString(str3, dr3Var4.toString());
                this.e = 3;
                edit2.putInt(str4, 3);
                int i14 = this.currentAccount;
                if (i4 == 0) {
                    er3.q(i14).Q = this.e;
                    z2 = true;
                } else {
                    z2 = true;
                    if (i4 == 1) {
                        er3.q(i14).R = this.e;
                    } else {
                        er3.q(i14).S = this.e;
                    }
                }
                edit2.commit();
                yn7Var.setChecked(z6 ^ z2);
                r59 r59Var = this.b;
                View F = r59Var.F(view);
                u69 T = F == null ? null : r59Var.T(F);
                if (T != null) {
                    this.a.t(T, i2);
                }
                er3.q(this.currentAccount).g();
                this.J = true;
                n0();
                return;
            }
            if (getParentActivity() == null) {
                return;
            }
            final k6d k6dVar = new k6d(getParentActivity(), (ylb) null);
            Object obj = k6dVar.b;
            my0 my0Var = (my0) obj;
            my0Var.v0 = false;
            my0Var.w0 = false;
            LinearLayout linearLayout = new LinearLayout(getParentActivity());
            linearLayout.setOrientation(1);
            ((my0) obj).O = linearLayout;
            jf5 jf5Var = new jf5(getParentActivity(), cmb.m5, 21, 15, false, null);
            if (i2 == this.photosRow) {
                jf5Var.setText(jb6.M0(2131753780, null));
            } else if (i2 == this.videosRow) {
                jf5Var.setText(jb6.M0(2131753769, null));
            } else {
                jf5Var.setText(jb6.M0(2131753801, null));
            }
            linearLayout.addView(jf5Var, qoe.c(-2.0f, -1));
            ul6[] ul6VarArr = new ul6[1];
            bjb[] bjbVarArr2 = new bjb[1];
            AnimatorSet[] animatorSetArr = new AnimatorSet[1];
            int i15 = 4;
            yib[] yibVarArr = new yib[4];
            int i16 = 0;
            while (i16 < i15) {
                Activity parentActivity = getParentActivity();
                yib yibVar = new yib(parentActivity);
                boolean z7 = jb6.a0;
                TextView textView = new TextView(parentActivity);
                yibVar.a = textView;
                ul6[] ul6VarArr2 = ul6VarArr;
                anb.X(textView, cmb.i5, ylbVar);
                wi8.w(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                textView.setGravity((jb6.a0 ? 5 : 3) | 16);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                yibVar.addView(textView, qoe.d(-1, -1.0f, (z7 ? 5 : 3) | 48, z7 ? 66.0f : 21.0f, 0.0f, z7 ? 21.0f : 66.0f, 0.0f));
                CheckBoxSquare checkBoxSquare = new CheckBoxSquare(null, parentActivity, true);
                yibVar.b = checkBoxSquare;
                checkBoxSquare.setDuplicateParentStateEnabled(false);
                checkBoxSquare.setFocusable(false);
                checkBoxSquare.setFocusableInTouchMode(false);
                checkBoxSquare.setClickable(false);
                yibVar.addView(checkBoxSquare, qoe.d(18, 18.0f, (z7 ? 3 : 5) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
                yibVarArr[i16] = yibVar;
                if (i16 == 0) {
                    yibVar.a(jb6.M0(2131753741, null), (o.a[0] & i8) != 0, true);
                } else if (i16 == 1) {
                    yibVar.a(jb6.M0(2131753739, null), (o.a[1] & i8) != 0, true);
                } else if (i16 == 2) {
                    yibVar.a(jb6.M0(2131753740, null), (o.a[2] & i8) != 0, true);
                } else {
                    yibVar.a(jb6.M0(2131753742, null), (o.a[3] & i8) != 0, i2 != this.photosRow);
                }
                yibVarArr[i16].setBackgroundDrawable(cmb.L0(false));
                yib yibVar2 = yibVarArr[i16];
                dr3 dr3Var6 = o;
                int i17 = i2;
                yib[] yibVarArr2 = yibVarArr;
                f73 f73Var = new f73(this, yibVar, yibVarArr2, i17, ul6VarArr2, bjbVarArr2, animatorSetArr);
                i2 = i17;
                yibVar2.setOnClickListener(f73Var);
                linearLayout.addView(yibVarArr2[i16], qoe.c(50.0f, -1));
                i16++;
                o = dr3Var6;
                yibVarArr = yibVarArr2;
                ul6VarArr = ul6VarArr2;
                i15 = 4;
                ylbVar = null;
            }
            dr3 dr3Var7 = o;
            final ul6[] ul6VarArr3 = ul6VarArr;
            final yib[] yibVarArr3 = yibVarArr;
            if (i2 != this.photosRow) {
                njb njbVar = new njb(getParentActivity());
                h73 h73Var = new h73(this, getParentActivity(), i2, njbVar, bjbVarArr2, animatorSetArr);
                bjb[] bjbVarArr3 = bjbVarArr2;
                ul6VarArr3[0] = h73Var;
                h73Var.setSize(dr3Var7.b[x]);
                linearLayout.addView(ul6VarArr3[0], qoe.o(-1, 50));
                View bjbVar2 = new bjb(21, null, getParentActivity(), true);
                bjbVarArr3[0] = bjbVar2;
                linearLayout.addView(bjbVar2, qoe.o(-1, 48));
                bjbVarArr3[0].setOnClickListener(new k81(bjbVarArr3, (byte) 26));
                anb.h(cmb.Z6, null, njbVar);
                linearLayout.addView(njbVar, qoe.o(-1, -2));
                i2 = i;
                if (i2 == this.videosRow) {
                    ul6VarArr3[0].setText(jb6.M0(2131753796, null));
                    bjbVarArr3[0].f(jb6.M0(2131753776, null), dr3Var7.c, false);
                    njbVar.setText(jb6.a0("AutoDownloadPreloadVideoInfo", null, 2131753775, gm.i0(dr3Var7.b[x], false, false)));
                    dr3Var7 = dr3Var7;
                    bjbVarArr = bjbVarArr3;
                } else {
                    ul6VarArr3[0].setText(jb6.M0(2131753797, null));
                    bjbVarArr3[0].f(jb6.M0(2131753778, null), dr3Var7.d, false);
                    njbVar.setText(jb6.M0(2131753777, null));
                    bjbVarArr = bjbVarArr3;
                }
            } else {
                ul6VarArr3[0] = null;
                bjbVarArr2[0] = null;
                View view2 = new View(getParentActivity());
                anb.h(cmb.c7, null, view2);
                linearLayout.addView(view2, new LinearLayout.LayoutParams(-1, 1));
                bjbVarArr = bjbVarArr2;
            }
            if (i2 == this.videosRow) {
                int i18 = 0;
                while (true) {
                    if (i18 >= 4) {
                        r12 = 0;
                        arrayList = null;
                        ul6VarArr3[0].a(null, false);
                        bjbVarArr[0].e(null, false);
                        break;
                    }
                    if (yibVarArr3[i18].b.h) {
                        arrayList = null;
                        r12 = 0;
                        break;
                    }
                    i18++;
                }
                if (dr3Var7.b[x] <= 2097152) {
                    bjbVarArr[r12].e(arrayList, r12);
                }
            }
            FrameLayout frameLayout = new FrameLayout(getParentActivity());
            frameLayout.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
            linearLayout.addView(frameLayout, qoe.o(-1, 52));
            TextView textView2 = new TextView(getParentActivity());
            textView2.setTextSize(1, 14.0f);
            int i19 = cmb.m5;
            anb.X(textView2, i19, null);
            textView2.setGravity(17);
            textView2.setTypeface(gm.o());
            textView2.setText(jb6.M0(2131752542, null).toUpperCase());
            textView2.setPadding(gm.L(10.0f), 0, gm.L(10.0f), 0);
            frameLayout.addView(textView2, qoe.e(-2, 36, 51));
            textView2.setOnClickListener(new k81(k6dVar, (byte) 27));
            TextView textView3 = new TextView(getParentActivity());
            textView3.setTextSize(1, 14.0f);
            anb.X(textView3, i19, null);
            textView3.setGravity(17);
            textView3.setTypeface(gm.o());
            textView3.setText(jb6.M0(2131745680, null).toUpperCase());
            textView3.setPadding(gm.L(10.0f), 0, gm.L(10.0f), 0);
            frameLayout.addView(textView3, qoe.e(-2, 36, 53));
            final int i20 = i2;
            final int i21 = i8;
            final String str5 = str;
            final String str6 = str2;
            textView3.setOnClickListener(new View.OnClickListener() { // from class: g73
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    DataAutoDownloadActivity.this.p0(yibVarArr3, i21, ul6VarArr3, x, bjbVarArr, i20, str5, str6, k6dVar, view);
                }
            });
            showDialog((my0) obj);
        }
    }

    public final void r0(hla hlaVar) {
        ArrayList arrayList = this.c;
        String[] strArr = new String[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            dr3 dr3Var = (dr3) arrayList.get(i);
            if (dr3Var == this.E) {
                strArr[i] = jb6.M0(2131753798, null);
            } else if (dr3Var == this.F) {
                strArr[i] = jb6.M0(2131753794, null);
            } else if (dr3Var == this.G) {
                strArr[i] = jb6.M0(2131753799, null);
            } else {
                strArr[i] = jb6.M0(2131753805, null);
            }
        }
        hlaVar.b(this.d, null, strArr);
    }

    public final void s0() {
        this.autoDownloadRow = 0;
        this.y = 2;
        this.n = true;
        if (!this.H.g) {
            this.r = -1;
            this.usageProgressRow = -1;
            this.s = -1;
            this.w = -1;
            this.photosRow = -1;
            this.videosRow = -1;
            this.filesRow = -1;
            this.storiesRow = -1;
            this.x = -1;
            return;
        }
        this.r = 2;
        this.usageProgressRow = 3;
        this.s = 4;
        this.w = 5;
        this.photosRow = 6;
        this.videosRow = 7;
        this.filesRow = 8;
        this.storiesRow = 9;
        this.y = 11;
        this.x = 10;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
