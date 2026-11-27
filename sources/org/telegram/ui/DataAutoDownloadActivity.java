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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class DataAutoDownloadActivity extends org.telegram.ui.ActionBar.e {
    public final kq3 E;
    public final kq3 F;
    public final kq3 G;
    public final kq3 H;
    public final kq3 I;
    public boolean J;
    public final String K;
    public final String L;
    public t20 a;
    private int autoDownloadRow;
    public d79 b;
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
        kq3 kq3Var = lq3.q(this.currentAccount).K;
        this.E = kq3Var;
        kq3 kq3Var2 = lq3.q(this.currentAccount).L;
        this.F = kq3Var2;
        kq3 kq3Var3 = lq3.q(this.currentAccount).M;
        this.G = kq3Var3;
        if (i == 0) {
            this.e = lq3.q(this.currentAccount).Q;
            this.H = lq3.q(this.currentAccount).N;
            this.I = kq3Var2;
            this.K = "mobilePreset";
            this.L = "currentMobilePreset";
            return;
        }
        int i2 = this.currentAccount;
        if (i == 1) {
            this.e = lq3.q(i2).R;
            this.H = lq3.q(this.currentAccount).O;
            this.I = kq3Var3;
            this.K = "wifiPreset";
            this.L = "currentWifiPreset";
            return;
        }
        this.e = lq3.q(i2).S;
        this.H = lq3.q(this.currentAccount).P;
        this.I = kq3Var;
        this.K = "roamingPreset";
        this.L = "currentRoamingPreset";
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.y6));
        hashSet.add(Integer.valueOf(aob.N6));
        hashSet.add(Integer.valueOf(aob.M6));
        hashSet.add(Integer.valueOf(aob.B6));
        hashSet.add(Integer.valueOf(aob.z6));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.g6));
        hashSet.add(Integer.valueOf(aob.e6));
        hashSet.add(Integer.valueOf(aob.f6));
        hashSet.add(Integer.valueOf(aob.L6));
        hashSet.add(Integer.valueOf(aob.i6));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        byte b = 2;
        int i = this.f;
        if (i == 0) {
            this.simpleActionBar.setTitle(ob6.M0(2131753817, null));
        } else if (i == 1) {
            this.simpleActionBar.setTitle(ob6.M0(2131753812, null));
        } else if (i == 2) {
            this.simpleActionBar.setTitle(ob6.M0(2131753815, null));
        }
        wk5 wk5Var = this.parentLayout;
        if (wk5Var != null && ((ActionBarLayout) wk5Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new kg2(this, (byte) 9));
        this.a = new t20(this, context, b);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        d79 d79Var = new d79(context, null);
        this.b = d79Var;
        d79Var.s1();
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setSectionsDrawBackground(true);
        ((zb3) this.b.getItemAnimator()).C = false;
        this.b.setLayoutManager(new x46(1, false));
        frameLayout.addView(this.b, tre.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new ht2(this, (byte) 13));
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final d79 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new apb(this.b, 16, new Class[]{mf5.class, uo7.class, zma.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.d6));
        arrayList.add(new apb(this.b, 0, new Class[]{wkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.O6));
        arrayList.add(new apb(this.b, 0, new Class[]{wkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.P6));
        arrayList.add(new apb(this.b, 0, new Class[]{wkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.Q6));
        arrayList.add(new apb(this.b, 0, new Class[]{wkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.R6));
        arrayList.add(new apb(this.b, 0, new Class[]{wkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.S6));
        arrayList.add(new apb(this.b, 0, new Class[]{wkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.T6));
        arrayList.add(new apb(this.b, 0, new Class[]{uo7.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.M6));
        arrayList.add(new apb(this.b, 0, new Class[]{uo7.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.N6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void m0() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        kq3 kq3Var = this.E;
        arrayList.add(kq3Var);
        kq3 kq3Var2 = this.F;
        arrayList.add(kq3Var2);
        kq3 kq3Var3 = this.G;
        arrayList.add(kq3Var3);
        kq3 kq3Var4 = this.H;
        if (!kq3Var4.a(kq3Var) && !kq3Var4.a(kq3Var2) && !kq3Var4.a(kq3Var3)) {
            arrayList.add(kq3Var4);
        }
        Collections.sort(arrayList, new f03((byte) 2));
        int i = this.e;
        if (i == 0 || (i == 3 && kq3Var4.a(kq3Var))) {
            this.d = arrayList.indexOf(kq3Var);
        } else {
            int i2 = this.e;
            if (i2 == 1 || (i2 == 3 && kq3Var4.a(kq3Var2))) {
                this.d = arrayList.indexOf(kq3Var2);
            } else {
                int i3 = this.e;
                if (i3 == 2 || (i3 == 3 && kq3Var4.a(kq3Var3))) {
                    this.d = arrayList.indexOf(kq3Var3);
                } else {
                    this.d = arrayList.indexOf(kq3Var4);
                }
            }
        }
        d79 d79Var = this.b;
        if (d79Var != null) {
            f89 L = d79Var.L(this.usageProgressRow);
            if (L != null) {
                View view = L.a;
                if (view instanceof zma) {
                    q0((zma) view);
                    return;
                }
            }
            this.a.g(this.usageProgressRow);
        }
    }

    public final void n0(tkb tkbVar, tkb[] tkbVarArr, int i, wl6[] wl6VarArr, wkb[] wkbVarArr, AnimatorSet[] animatorSetArr, View view) {
        if (view.isEnabled()) {
            boolean z = true;
            tkbVar.setChecked(!tkbVar.b.h);
            int i2 = 0;
            while (true) {
                if (i2 >= tkbVarArr.length) {
                    z = false;
                    break;
                } else if (tkbVarArr[i2].b.h) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i != this.videosRow || wl6VarArr[0].isEnabled() == z) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            wl6VarArr[0].a(arrayList, z);
            if (wl6VarArr[0].getSize() > 2097152) {
                wkbVarArr[0].e(arrayList, z);
            }
            AnimatorSet animatorSet = animatorSetArr[0];
            if (animatorSet != null) {
                animatorSet.cancel();
                animatorSetArr[0] = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSetArr[0] = animatorSet2;
            animatorSet2.playTogether(arrayList);
            animatorSetArr[0].addListener(new cn2(animatorSetArr, (byte) 3));
            animatorSetArr[0].setDuration(150L);
            animatorSetArr[0].start();
        }
    }

    public final void o0(tkb[] tkbVarArr, int i, wl6[] wl6VarArr, int i2, wkb[] wkbVarArr, int i3, String str, String str2, z8d z8dVar, View view) {
        int i4 = this.e;
        kq3 kq3Var = this.H;
        if (i4 != 3) {
            if (i4 == 0) {
                kq3Var.c(this.E);
            } else if (i4 == 1) {
                kq3Var.c(this.F);
            } else if (i4 == 2) {
                kq3Var.c(this.G);
            }
        }
        for (int i5 = 0; i5 < 4; i5++) {
            if (tkbVarArr[i5].b.h) {
                int[] iArr = kq3Var.a;
                iArr[i5] = iArr[i5] | i;
            } else {
                int[] iArr2 = kq3Var.a;
                iArr2[i5] = iArr2[i5] & (~i);
            }
        }
        wl6 wl6Var = wl6VarArr[0];
        if (wl6Var != null) {
            wl6Var.getSize();
            kq3Var.b[i2] = (int) wl6VarArr[0].getSize();
        }
        wkb wkbVar = wkbVarArr[0];
        if (wkbVar != null) {
            int i6 = this.videosRow;
            Switch r9 = wkbVar.e;
            if (i3 == i6) {
                kq3Var.c = r9.h;
            } else {
                kq3Var.d = r9.h;
            }
        }
        SharedPreferences.Editor edit = uc7.s1(this.currentAccount).X3.edit();
        edit.putString(str, kq3Var.toString());
        this.e = 3;
        edit.putInt(str2, 3);
        int i7 = this.currentAccount;
        int i8 = this.f;
        if (i8 == 0) {
            lq3.q(i7).Q = this.e;
        } else if (i8 == 1) {
            lq3.q(i7).R = this.e;
        } else {
            lq3.q(i7).S = this.e;
        }
        edit.commit();
        ((nx0) z8dVar.b).y0.run();
        f89 H = this.b.H(view);
        if (H != null) {
            this.h = true;
            this.a.t(H, i3);
            this.h = false;
        }
        lq3.q(this.currentAccount).g();
        this.J = true;
        m0();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        m0();
        r0();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onPause() {
        super.onPause();
        if (this.J) {
            lq3.q(this.currentAccount).w(this.f);
            this.J = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onResume() {
        super.onResume();
        t20 t20Var = this.a;
        if (t20Var != null) {
            t20Var.f();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v17 */
    public final void p0(float f, int i, final View view) {
        kq3 o;
        String str;
        String str2;
        boolean z;
        boolean z2;
        z8d z8dVar;
        final wkb[] wkbVarArr;
        ?? r15;
        ArrayList arrayList;
        int i2 = i;
        int i3 = this.autoDownloadRow;
        kq3 kq3Var = this.G;
        kq3 kq3Var2 = this.F;
        kq3 kq3Var3 = this.E;
        int i4 = this.f;
        kq3 kq3Var4 = this.H;
        vnb vnbVar = null;
        if (i2 == i3) {
            int i5 = this.e;
            if (i5 != 3) {
                if (i5 == 0) {
                    kq3Var4.c(kq3Var3);
                } else if (i5 == 1) {
                    kq3Var4.c(kq3Var2);
                } else if (i5 == 2) {
                    kq3Var4.c(kq3Var);
                }
            }
            wkb wkbVar = (wkb) view;
            boolean z3 = wkbVar.e.h;
            if (z3 || !kq3Var4.g) {
                kq3Var4.g = !kq3Var4.g;
            } else {
                System.arraycopy(this.I.a, 0, kq3Var4.a, 0, 4);
            }
            view.setTag(Integer.valueOf(kq3Var4.g ? aob.f6 : aob.e6));
            boolean z4 = !z3;
            wkbVar.b(aob.w0(null, kq3Var4.g ? aob.f6 : aob.e6, false), z4);
            r0();
            boolean z5 = kq3Var4.g;
            t20 t20Var = this.a;
            int i6 = (this.n ? 1 : 0) + 1;
            if (z5) {
                t20Var.p(i6, 9);
            } else {
                t20Var.q(i6, 9);
            }
            this.a.g(this.n ? 1 : 0);
            SharedPreferences.Editor edit = uc7.s1(this.currentAccount).X3.edit();
            edit.putString(this.K, kq3Var4.toString());
            this.e = 3;
            edit.putInt(this.L, 3);
            int i7 = this.currentAccount;
            if (i4 == 0) {
                lq3.q(i7).Q = this.e;
            } else if (i4 == 1) {
                lq3.q(i7).R = this.e;
            } else {
                lq3.q(i7).S = this.e;
            }
            edit.commit();
            wkbVar.setChecked(z4);
            lq3.q(this.currentAccount).g();
            this.J = true;
            return;
        }
        if ((i2 == this.photosRow || i2 == this.videosRow || i2 == this.filesRow || i2 == this.storiesRow) && view.isEnabled()) {
            int i8 = i2 == this.photosRow ? 1 : i2 == this.videosRow ? 4 : i2 == this.storiesRow ? -1 : 8;
            final int x = lq3.x(i8);
            int i9 = this.currentAccount;
            if (i4 == 0) {
                o = lq3.q(i9).n();
                str = "mobilePreset";
                str2 = "currentMobilePreset";
            } else if (i4 == 1) {
                o = lq3.q(i9).p();
                str = "wifiPreset";
                str2 = "currentWifiPreset";
            } else {
                o = lq3.q(i9).o();
                str = "roamingPreset";
                str2 = "currentRoamingPreset";
            }
            uo7 uo7Var = (uo7) view;
            boolean z6 = uo7Var.e.h;
            if (i2 == this.storiesRow || ((ob6.a0 && f <= hl.L(76.0f)) || (!ob6.a0 && f >= view.getMeasuredWidth() - hl.L(76.0f)))) {
                kq3 kq3Var5 = o;
                int i10 = i8;
                String str3 = str;
                String str4 = str2;
                int i11 = this.e;
                if (i11 != 3) {
                    if (i11 == 0) {
                        kq3Var4.c(kq3Var3);
                    } else if (i11 == 1) {
                        kq3Var4.c(kq3Var2);
                    } else if (i11 == 2) {
                        kq3Var4.c(kq3Var);
                    }
                }
                if (i2 != this.storiesRow) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= kq3Var4.a.length) {
                            z = false;
                            break;
                        } else {
                            if ((kq3Var5.a[i12] & i10) != 0) {
                                z = true;
                                break;
                            }
                            i12++;
                        }
                    }
                    int i13 = 0;
                    while (true) {
                        int[] iArr = kq3Var4.a;
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
                    kq3Var4.e = !z6;
                }
                SharedPreferences.Editor edit2 = uc7.s1(this.currentAccount).X3.edit();
                edit2.putString(str3, kq3Var4.toString());
                this.e = 3;
                edit2.putInt(str4, 3);
                int i14 = this.currentAccount;
                if (i4 == 0) {
                    lq3.q(i14).Q = this.e;
                    z2 = true;
                } else {
                    z2 = true;
                    if (i4 == 1) {
                        lq3.q(i14).R = this.e;
                    } else {
                        lq3.q(i14).S = this.e;
                    }
                }
                edit2.commit();
                uo7Var.setChecked(z6 ^ z2);
                d79 d79Var = this.b;
                View G = d79Var.G(view);
                f89 U = G == null ? null : d79Var.U(G);
                if (U != null) {
                    this.a.t(U, i2);
                }
                lq3.q(this.currentAccount).g();
                this.J = true;
                m0();
                return;
            }
            if (getParentActivity() == null) {
                return;
            }
            z8d z8dVar2 = new z8d(getParentActivity(), (vnb) null);
            nx0 nx0Var = (nx0) z8dVar2.b;
            nx0Var.v0 = false;
            nx0Var.w0 = false;
            LinearLayout linearLayout = new LinearLayout(getParentActivity());
            linearLayout.setOrientation(1);
            ((nx0) z8dVar2.b).O = linearLayout;
            mf5 mf5Var = new mf5(getParentActivity(), aob.n5, 21, 15, false, null);
            if (i2 == this.photosRow) {
                mf5Var.setText(ob6.M0(2131753808, null));
            } else if (i2 == this.videosRow) {
                mf5Var.setText(ob6.M0(2131753797, null));
            } else {
                mf5Var.setText(ob6.M0(2131753829, null));
            }
            linearLayout.addView(mf5Var, tre.c(-2.0f, -1));
            wl6[] wl6VarArr = new wl6[1];
            wkb[] wkbVarArr2 = new wkb[1];
            AnimatorSet[] animatorSetArr = new AnimatorSet[1];
            int i15 = 4;
            tkb[] tkbVarArr = new tkb[4];
            int i16 = 0;
            while (i16 < i15) {
                Activity parentActivity = getParentActivity();
                tkb tkbVar = new tkb(parentActivity);
                boolean z7 = ob6.a0;
                TextView textView = new TextView(parentActivity);
                tkbVar.a = textView;
                yob.X(textView, aob.j5, vnbVar);
                ik8.w(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                textView.setGravity((ob6.a0 ? 5 : 3) | 16);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                tkbVar.addView(textView, tre.d(-1, -1.0f, (z7 ? 5 : 3) | 48, z7 ? 66.0f : 21.0f, 0.0f, z7 ? 21.0f : 66.0f, 0.0f));
                CheckBoxSquare checkBoxSquare = new CheckBoxSquare(null, parentActivity, true);
                tkbVar.b = checkBoxSquare;
                checkBoxSquare.setDuplicateParentStateEnabled(false);
                checkBoxSquare.setFocusable(false);
                checkBoxSquare.setFocusableInTouchMode(false);
                checkBoxSquare.setClickable(false);
                tkbVar.addView(checkBoxSquare, tre.d(18, 18.0f, (z7 ? 3 : 5) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
                tkbVarArr[i16] = tkbVar;
                if (i16 == 0) {
                    tkbVar.a(ob6.M0(2131753769, null), (o.a[0] & i8) != 0, true);
                } else if (i16 == 1) {
                    tkbVar.a(ob6.M0(2131753767, null), (o.a[1] & i8) != 0, true);
                } else if (i16 == 2) {
                    tkbVar.a(ob6.M0(2131753768, null), (o.a[2] & i8) != 0, true);
                } else {
                    tkbVar.a(ob6.M0(2131753770, null), (o.a[3] & i8) != 0, i2 != this.photosRow);
                }
                tkbVarArr[i16].setBackgroundDrawable(aob.L0(false));
                tkb tkbVar2 = tkbVarArr[i16];
                kq3 kq3Var6 = o;
                wl6[] wl6VarArr2 = wl6VarArr;
                int i17 = i2;
                tkb[] tkbVarArr2 = tkbVarArr;
                l63 l63Var = new l63(this, tkbVar, tkbVarArr2, i17, wl6VarArr2, wkbVarArr2, animatorSetArr);
                i2 = i17;
                tkbVar2.setOnClickListener(l63Var);
                linearLayout.addView(tkbVarArr2[i16], tre.c(50.0f, -1));
                i16++;
                wl6VarArr = wl6VarArr2;
                tkbVarArr = tkbVarArr2;
                i15 = 4;
                vnbVar = null;
                animatorSetArr = animatorSetArr;
                o = kq3Var6;
            }
            kq3 kq3Var7 = o;
            final tkb[] tkbVarArr3 = tkbVarArr;
            AnimatorSet[] animatorSetArr2 = animatorSetArr;
            final wl6[] wl6VarArr3 = wl6VarArr;
            if (i2 != this.photosRow) {
                ilb ilbVar = new ilb(getParentActivity());
                n63 n63Var = new n63(this, getParentActivity(), i2, ilbVar, wkbVarArr2, animatorSetArr2);
                wkb[] wkbVarArr3 = wkbVarArr2;
                wl6VarArr3[0] = n63Var;
                n63Var.setSize(kq3Var7.b[x]);
                linearLayout.addView(wl6VarArr3[0], tre.o(-1, 50));
                View wkbVar2 = new wkb(21, null, getParentActivity(), true);
                wkbVarArr3[0] = wkbVar2;
                linearLayout.addView(wkbVar2, tre.o(-1, 48));
                wkbVarArr3[0].setOnClickListener(new r81(wkbVarArr3, (byte) 25));
                yob.h(aob.a7, null, ilbVar);
                linearLayout.addView(ilbVar, tre.o(-1, -2));
                i2 = i;
                if (i2 == this.videosRow) {
                    wl6VarArr3[0].setText(ob6.M0(2131753824, null));
                    wkbVarArr3[0].f(ob6.M0(2131753804, null), kq3Var7.c, false);
                    z8dVar = z8dVar2;
                    ilbVar.setText(ob6.a0("AutoDownloadPreloadVideoInfo", null, 2131753803, hl.i0(kq3Var7.b[x], false, false)));
                    wkbVarArr = wkbVarArr3;
                } else {
                    z8dVar = z8dVar2;
                    wl6VarArr3[0].setText(ob6.M0(2131753825, null));
                    wkbVarArr3[0].f(ob6.M0(2131753806, null), kq3Var7.d, false);
                    ilbVar.setText(ob6.M0(2131753805, null));
                    wkbVarArr = wkbVarArr3;
                }
            } else {
                z8dVar = z8dVar2;
                wl6VarArr3[0] = null;
                wkbVarArr2[0] = null;
                View view2 = new View(getParentActivity());
                yob.h(aob.d7, null, view2);
                linearLayout.addView(view2, new LinearLayout.LayoutParams(-1, 1));
                wkbVarArr = wkbVarArr2;
            }
            if (i2 == this.videosRow) {
                int i18 = 0;
                while (true) {
                    if (i18 >= 4) {
                        r15 = 0;
                        arrayList = null;
                        wl6VarArr3[0].a(null, false);
                        wkbVarArr[0].e(null, false);
                        break;
                    }
                    if (tkbVarArr3[i18].b.h) {
                        arrayList = null;
                        r15 = 0;
                        break;
                    }
                    i18++;
                }
                if (kq3Var7.b[x] <= 2097152) {
                    wkbVarArr[r15].e(arrayList, r15);
                }
            }
            FrameLayout frameLayout = new FrameLayout(getParentActivity());
            frameLayout.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
            linearLayout.addView(frameLayout, tre.o(-1, 52));
            TextView textView2 = new TextView(getParentActivity());
            textView2.setTextSize(1, 14.0f);
            int i19 = aob.n5;
            yob.X(textView2, i19, null);
            textView2.setGravity(17);
            textView2.setTypeface(hl.o());
            textView2.setText(ob6.M0(2131752570, null).toUpperCase());
            textView2.setPadding(hl.L(10.0f), 0, hl.L(10.0f), 0);
            frameLayout.addView(textView2, tre.e(-2, 36, 51));
            final z8d z8dVar3 = z8dVar;
            textView2.setOnClickListener(new r81(z8dVar3, (byte) 26));
            TextView textView3 = new TextView(getParentActivity());
            textView3.setTextSize(1, 14.0f);
            yob.X(textView3, i19, null);
            textView3.setGravity(17);
            textView3.setTypeface(hl.o());
            textView3.setText(ob6.M0(2131745674, null).toUpperCase());
            textView3.setPadding(hl.L(10.0f), 0, hl.L(10.0f), 0);
            frameLayout.addView(textView3, tre.e(-2, 36, 53));
            final String str5 = str;
            final String str6 = str2;
            final int i20 = i2;
            final int i21 = i8;
            textView3.setOnClickListener(new View.OnClickListener() { // from class: m63
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    DataAutoDownloadActivity.this.o0(tkbVarArr3, i21, wl6VarArr3, x, wkbVarArr, i20, str5, str6, z8dVar3, view);
                }
            });
            showDialog((nx0) z8dVar3.b);
        }
    }

    public final void q0(zma zmaVar) {
        ArrayList arrayList = this.c;
        String[] strArr = new String[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            kq3 kq3Var = (kq3) arrayList.get(i);
            if (kq3Var == this.E) {
                strArr[i] = ob6.M0(2131753826, null);
            } else if (kq3Var == this.F) {
                strArr[i] = ob6.M0(2131753822, null);
            } else if (kq3Var == this.G) {
                strArr[i] = ob6.M0(2131753827, null);
            } else {
                strArr[i] = ob6.M0(2131753833, null);
            }
        }
        zmaVar.b(this.d, null, strArr);
    }

    public final void r0() {
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

    @Override // org.telegram.ui.ActionBar.e
    public final boolean useSimpleActionBar() {
        return true;
    }
}
