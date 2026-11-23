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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class DataAutoDownloadActivity extends org.telegram.ui.ActionBar.g2 {
    public final org.telegram.messenger.z5 E;
    public final org.telegram.messenger.z5 F;
    public final org.telegram.messenger.z5 G;
    public final org.telegram.messenger.z5 H;
    public final org.telegram.messenger.z5 I;
    public boolean J;
    public final String K;
    public final String L;
    public l4 a;
    private int autoDownloadRow;
    public org.telegram.ui.Components.ek0 b;
    public final ArrayList c;
    public int d;
    public int e;
    public final int f;
    private int filesRow;
    public boolean h;
    public int n;
    private int photosRow;
    public int r;
    public int s;
    private int storiesRow;
    private int usageProgressRow;
    private int videosRow;
    public int w;
    public int x;
    public int y;

    public DataAutoDownloadActivity(int i7) {
        super(null);
        this.c = new ArrayList();
        this.d = 1;
        this.f = i7;
        org.telegram.messenger.z5 z5Var = org.telegram.messenger.a6.q(this.currentAccount).K;
        this.E = z5Var;
        org.telegram.messenger.z5 z5Var2 = org.telegram.messenger.a6.q(this.currentAccount).L;
        this.F = z5Var2;
        org.telegram.messenger.z5 z5Var3 = org.telegram.messenger.a6.q(this.currentAccount).M;
        this.G = z5Var3;
        if (i7 == 0) {
            this.e = org.telegram.messenger.a6.q(this.currentAccount).Q;
            this.H = org.telegram.messenger.a6.q(this.currentAccount).N;
            this.I = z5Var2;
            this.K = "mobilePreset";
            this.L = "currentMobilePreset";
            return;
        }
        if (i7 == 1) {
            this.e = org.telegram.messenger.a6.q(this.currentAccount).R;
            this.H = org.telegram.messenger.a6.q(this.currentAccount).O;
            this.I = z5Var3;
            this.K = "wifiPreset";
            this.L = "currentWifiPreset";
            return;
        }
        this.e = org.telegram.messenger.a6.q(this.currentAccount).S;
        this.H = org.telegram.messenger.a6.q(this.currentAccount).P;
        this.I = z5Var;
        this.K = "roamingPreset";
        this.L = "currentRoamingPreset";
    }

    public static void Z(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.n8 n8Var, org.telegram.ui.Cells.n8[] n8VarArr, int i7, org.telegram.ui.Cells.c5[] c5VarArr, org.telegram.ui.Cells.r8[] r8VarArr, AnimatorSet[] animatorSetArr, View view) {
        if (view.isEnabled()) {
            boolean z10 = true;
            n8Var.setChecked(!n8Var.b.h);
            int i10 = 0;
            while (true) {
                if (i10 >= n8VarArr.length) {
                    z10 = false;
                    break;
                } else if (n8VarArr[i10].b.h) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i7 != dataAutoDownloadActivity.videosRow || c5VarArr[0].isEnabled() == z10) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            c5VarArr[0].a(arrayList, z10);
            if (c5VarArr[0].getSize() > 2097152) {
                r8VarArr[0].e(arrayList, z10);
            }
            AnimatorSet animatorSet = animatorSetArr[0];
            if (animatorSet != null) {
                animatorSet.cancel();
                animatorSetArr[0] = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSetArr[0] = animatorSet2;
            animatorSet2.playTogether(arrayList);
            animatorSetArr[0].addListener(new org.telegram.ui.Cells.x9(animatorSetArr, 22));
            animatorSetArr[0].setDuration(150L);
            animatorSetArr[0].start();
        }
    }

    public static void a0(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.n8[] n8VarArr, int i7, org.telegram.ui.Cells.c5[] c5VarArr, int i10, org.telegram.ui.Cells.r8[] r8VarArr, int i11, String str, String str2, h6.o oVar, View view) {
        org.telegram.messenger.z5 z5Var = dataAutoDownloadActivity.H;
        int i12 = dataAutoDownloadActivity.e;
        if (i12 != 3) {
            if (i12 == 0) {
                z5Var.c(dataAutoDownloadActivity.E);
            } else if (i12 == 1) {
                z5Var.c(dataAutoDownloadActivity.F);
            } else if (i12 == 2) {
                z5Var.c(dataAutoDownloadActivity.G);
            }
        }
        for (int i13 = 0; i13 < 4; i13++) {
            if (n8VarArr[i13].b.h) {
                int[] iArr = z5Var.a;
                iArr[i13] = iArr[i13] | i7;
            } else {
                int[] iArr2 = z5Var.a;
                iArr2[i13] = iArr2[i13] & (~i7);
            }
        }
        org.telegram.ui.Cells.c5 c5Var = c5VarArr[0];
        if (c5Var != null) {
            c5Var.getSize();
            z5Var.b[i10] = (int) c5VarArr[0].getSize();
        }
        org.telegram.ui.Cells.r8 r8Var = r8VarArr[0];
        if (r8Var != null) {
            Switch r92 = r8Var.e;
            if (i11 == dataAutoDownloadActivity.videosRow) {
                z5Var.c = r92.h;
            } else {
                z5Var.d = r92.h;
            }
        }
        SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(dataAutoDownloadActivity.currentAccount).h7.edit();
        edit.putString(str, z5Var.toString());
        dataAutoDownloadActivity.e = 3;
        edit.putInt(str2, 3);
        int i14 = dataAutoDownloadActivity.f;
        if (i14 == 0) {
            org.telegram.messenger.a6.q(dataAutoDownloadActivity.currentAccount).Q = dataAutoDownloadActivity.e;
        } else if (i14 == 1) {
            org.telegram.messenger.a6.q(dataAutoDownloadActivity.currentAccount).R = dataAutoDownloadActivity.e;
        } else {
            org.telegram.messenger.a6.q(dataAutoDownloadActivity.currentAccount).S = dataAutoDownloadActivity.e;
        }
        edit.commit();
        ((org.telegram.ui.ActionBar.w2) oVar.b).y0.run();
        v4.f1 G = dataAutoDownloadActivity.b.G(view);
        if (G != null) {
            dataAutoDownloadActivity.h = true;
            dataAutoDownloadActivity.a.t(G, i11);
            dataAutoDownloadActivity.h = false;
        }
        org.telegram.messenger.a6.q(dataAutoDownloadActivity.currentAccount).g();
        dataAutoDownloadActivity.J = true;
        dataAutoDownloadActivity.q0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v9 */
    public static void b0(final DataAutoDownloadActivity dataAutoDownloadActivity, final View view, int i7, float f10) {
        org.telegram.messenger.z5 o4;
        String str;
        String str2;
        boolean z10;
        int i10;
        h6.o oVar;
        final org.telegram.ui.Cells.r8[] r8VarArr;
        ?? r15;
        ArrayList arrayList;
        int i11 = i7;
        org.telegram.messenger.z5 z5Var = dataAutoDownloadActivity.G;
        org.telegram.messenger.z5 z5Var2 = dataAutoDownloadActivity.F;
        org.telegram.messenger.z5 z5Var3 = dataAutoDownloadActivity.E;
        int i12 = dataAutoDownloadActivity.f;
        org.telegram.messenger.z5 z5Var4 = dataAutoDownloadActivity.H;
        org.telegram.ui.ActionBar.i6 i6Var = null;
        if (i11 == dataAutoDownloadActivity.autoDownloadRow) {
            int i13 = dataAutoDownloadActivity.e;
            if (i13 != 3) {
                if (i13 == 0) {
                    z5Var4.c(z5Var3);
                } else if (i13 == 1) {
                    z5Var4.c(z5Var2);
                } else if (i13 == 2) {
                    z5Var4.c(z5Var);
                }
            }
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            boolean z11 = r8Var.e.h;
            if (z11 || !z5Var4.g) {
                z5Var4.g = !z5Var4.g;
            } else {
                System.arraycopy(dataAutoDownloadActivity.I.a, 0, z5Var4.a, 0, 4);
            }
            view.setTag(Integer.valueOf(z5Var4.g ? org.telegram.ui.ActionBar.n6.f6 : org.telegram.ui.ActionBar.n6.e6));
            boolean z12 = !z11;
            r8Var.b(org.telegram.ui.ActionBar.n6.x0(null, z5Var4.g ? org.telegram.ui.ActionBar.n6.f6 : org.telegram.ui.ActionBar.n6.e6, false), z12);
            dataAutoDownloadActivity.s0();
            if (z5Var4.g) {
                dataAutoDownloadActivity.a.o(dataAutoDownloadActivity.n + 1, 9);
            } else {
                dataAutoDownloadActivity.a.p(dataAutoDownloadActivity.n + 1, 9);
            }
            dataAutoDownloadActivity.a.g(dataAutoDownloadActivity.n);
            SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(dataAutoDownloadActivity.currentAccount).h7.edit();
            edit.putString(dataAutoDownloadActivity.K, z5Var4.toString());
            String str3 = dataAutoDownloadActivity.L;
            dataAutoDownloadActivity.e = 3;
            edit.putInt(str3, 3);
            if (i12 == 0) {
                org.telegram.messenger.a6.q(dataAutoDownloadActivity.currentAccount).Q = dataAutoDownloadActivity.e;
            } else if (i12 == 1) {
                org.telegram.messenger.a6.q(dataAutoDownloadActivity.currentAccount).R = dataAutoDownloadActivity.e;
            } else {
                org.telegram.messenger.a6.q(dataAutoDownloadActivity.currentAccount).S = dataAutoDownloadActivity.e;
            }
            edit.commit();
            r8Var.setChecked(z12);
            org.telegram.messenger.a6.q(dataAutoDownloadActivity.currentAccount).g();
            dataAutoDownloadActivity.J = true;
            return;
        }
        if ((i11 == dataAutoDownloadActivity.photosRow || i11 == dataAutoDownloadActivity.videosRow || i11 == dataAutoDownloadActivity.filesRow || i11 == dataAutoDownloadActivity.storiesRow) && view.isEnabled()) {
            int i14 = i11 == dataAutoDownloadActivity.photosRow ? 1 : i11 == dataAutoDownloadActivity.videosRow ? 4 : i11 == dataAutoDownloadActivity.storiesRow ? -1 : 8;
            final int x10 = org.telegram.messenger.a6.x(i14);
            if (i12 == 0) {
                o4 = org.telegram.messenger.a6.q(dataAutoDownloadActivity.currentAccount).n();
                str = "mobilePreset";
                str2 = "currentMobilePreset";
            } else if (i12 == 1) {
                o4 = org.telegram.messenger.a6.q(dataAutoDownloadActivity.currentAccount).p();
                str = "wifiPreset";
                str2 = "currentWifiPreset";
            } else {
                o4 = org.telegram.messenger.a6.q(dataAutoDownloadActivity.currentAccount).o();
                str = "roamingPreset";
                str2 = "currentRoamingPreset";
            }
            org.telegram.ui.Cells.i5 i5Var = (org.telegram.ui.Cells.i5) view;
            boolean z13 = i5Var.e.h;
            if (i11 == dataAutoDownloadActivity.storiesRow || ((org.telegram.messenger.gd.a0 && f10 <= org.telegram.messenger.g0.L(76.0f)) || (!org.telegram.messenger.gd.a0 && f10 >= view.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f)))) {
                org.telegram.messenger.z5 z5Var5 = o4;
                int i15 = i14;
                String str4 = str;
                String str5 = str2;
                int i16 = dataAutoDownloadActivity.e;
                if (i16 != 3) {
                    if (i16 == 0) {
                        z5Var4.c(z5Var3);
                    } else if (i16 == 1) {
                        z5Var4.c(z5Var2);
                    } else if (i16 == 2) {
                        z5Var4.c(z5Var);
                    }
                }
                if (i11 != dataAutoDownloadActivity.storiesRow) {
                    int i17 = 0;
                    while (true) {
                        if (i17 >= z5Var4.a.length) {
                            z10 = false;
                            break;
                        } else {
                            if ((z5Var5.a[i17] & i15) != 0) {
                                z10 = true;
                                break;
                            }
                            i17++;
                        }
                    }
                    int i18 = 0;
                    while (true) {
                        int[] iArr = z5Var4.a;
                        if (i18 >= iArr.length) {
                            break;
                        }
                        if (z13) {
                            iArr[i18] = iArr[i18] & (~i15);
                        } else if (!z10) {
                            iArr[i18] = iArr[i18] | i15;
                        }
                        i18++;
                    }
                } else {
                    z5Var4.e = !z13;
                }
                SharedPreferences.Editor edit2 = org.telegram.messenger.mp.u1(dataAutoDownloadActivity.currentAccount).h7.edit();
                edit2.putString(str4, z5Var4.toString());
                dataAutoDownloadActivity.e = 3;
                edit2.putInt(str5, 3);
                if (i12 == 0) {
                    org.telegram.messenger.a6.q(dataAutoDownloadActivity.currentAccount).Q = dataAutoDownloadActivity.e;
                } else if (i12 == 1) {
                    org.telegram.messenger.a6.q(dataAutoDownloadActivity.currentAccount).R = dataAutoDownloadActivity.e;
                } else {
                    org.telegram.messenger.a6.q(dataAutoDownloadActivity.currentAccount).S = dataAutoDownloadActivity.e;
                }
                edit2.commit();
                i5Var.setChecked(!z13);
                org.telegram.ui.Components.ek0 ek0Var = dataAutoDownloadActivity.b;
                View F = ek0Var.F(view);
                v4.f1 T = F == null ? null : ek0Var.T(F);
                if (T != null) {
                    dataAutoDownloadActivity.a.t(T, i11);
                }
                org.telegram.messenger.a6.q(dataAutoDownloadActivity.currentAccount).g();
                dataAutoDownloadActivity.J = true;
                dataAutoDownloadActivity.q0();
                return;
            }
            if (dataAutoDownloadActivity.getParentActivity() == null) {
                return;
            }
            h6.o oVar2 = new h6.o(dataAutoDownloadActivity.getParentActivity(), (org.telegram.ui.ActionBar.i6) null);
            org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) oVar2.b;
            w2Var.v0 = false;
            w2Var.w0 = false;
            LinearLayout linearLayout = new LinearLayout(dataAutoDownloadActivity.getParentActivity());
            linearLayout.setOrientation(1);
            ((org.telegram.ui.ActionBar.w2) oVar2.b).O = linearLayout;
            org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(dataAutoDownloadActivity.getParentActivity(), org.telegram.ui.ActionBar.n6.n5, 21, 15, false, null);
            if (i11 == dataAutoDownloadActivity.photosRow) {
                o4Var.setText(org.telegram.messenger.gd.N0(2131753812, null));
            } else if (i11 == dataAutoDownloadActivity.videosRow) {
                o4Var.setText(org.telegram.messenger.gd.N0(2131753801, null));
            } else {
                o4Var.setText(org.telegram.messenger.gd.N0(2131753833, null));
            }
            linearLayout.addView(o4Var, c8.na.c(-2.0f, -1));
            org.telegram.ui.Cells.c5[] c5VarArr = new org.telegram.ui.Cells.c5[1];
            org.telegram.ui.Cells.r8[] r8VarArr2 = new org.telegram.ui.Cells.r8[1];
            AnimatorSet[] animatorSetArr = new AnimatorSet[1];
            int i19 = 4;
            org.telegram.ui.Cells.n8[] n8VarArr = new org.telegram.ui.Cells.n8[4];
            int i20 = 0;
            while (true) {
                i10 = 16;
                if (i20 >= i19) {
                    break;
                }
                Activity parentActivity = dataAutoDownloadActivity.getParentActivity();
                org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(parentActivity);
                boolean z14 = org.telegram.messenger.gd.a0;
                TextView textView = new TextView(parentActivity);
                n8Var.a = textView;
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.j5, i6Var);
                org.telegram.messenger.m10.q(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                textView.setGravity((org.telegram.messenger.gd.a0 ? 5 : 3) | 16);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                n8Var.addView(textView, c8.na.d(-1, -1.0f, (z14 ? 5 : 3) | 48, z14 ? 66.0f : 21.0f, 0.0f, z14 ? 21.0f : 66.0f, 0.0f));
                CheckBoxSquare checkBoxSquare = new CheckBoxSquare(parentActivity, null, true);
                n8Var.b = checkBoxSquare;
                checkBoxSquare.setDuplicateParentStateEnabled(false);
                checkBoxSquare.setFocusable(false);
                checkBoxSquare.setFocusableInTouchMode(false);
                checkBoxSquare.setClickable(false);
                n8Var.addView(checkBoxSquare, c8.na.d(18, 18.0f, (z14 ? 3 : 5) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
                n8VarArr[i20] = n8Var;
                if (i20 == 0) {
                    n8Var.a(org.telegram.messenger.gd.N0(2131753773, null), (o4.a[0] & i14) != 0, true);
                } else if (i20 == 1) {
                    n8Var.a(org.telegram.messenger.gd.N0(2131753771, null), (o4.a[1] & i14) != 0, true);
                } else if (i20 == 2) {
                    n8Var.a(org.telegram.messenger.gd.N0(2131753772, null), (o4.a[2] & i14) != 0, true);
                } else {
                    n8Var.a(org.telegram.messenger.gd.N0(2131753774, null), (o4.a[3] & i14) != 0, i11 != dataAutoDownloadActivity.photosRow);
                }
                n8VarArr[i20].setBackgroundDrawable(org.telegram.ui.ActionBar.n6.N0(false));
                org.telegram.ui.Cells.n8 n8Var2 = n8VarArr[i20];
                org.telegram.messenger.z5 z5Var6 = o4;
                AnimatorSet[] animatorSetArr2 = animatorSetArr;
                org.telegram.ui.Cells.c5[] c5VarArr2 = c5VarArr;
                int i21 = i11;
                org.telegram.ui.Cells.n8[] n8VarArr2 = n8VarArr;
                di.ba baVar = new di.ba(dataAutoDownloadActivity, n8Var, n8VarArr2, i21, c5VarArr2, r8VarArr2, animatorSetArr2);
                i11 = i21;
                animatorSetArr = animatorSetArr2;
                n8Var2.setOnClickListener(baVar);
                linearLayout.addView(n8VarArr2[i20], c8.na.c(50.0f, -1));
                i20++;
                c5VarArr = c5VarArr2;
                o4 = z5Var6;
                n8VarArr = n8VarArr2;
                i19 = 4;
                i6Var = null;
            }
            final org.telegram.ui.Cells.n8[] n8VarArr3 = n8VarArr;
            org.telegram.messenger.z5 z5Var7 = o4;
            final org.telegram.ui.Cells.c5[] c5VarArr3 = c5VarArr;
            if (i11 != dataAutoDownloadActivity.photosRow) {
                org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(dataAutoDownloadActivity.getParentActivity());
                ys ysVar = new ys(dataAutoDownloadActivity, dataAutoDownloadActivity.getParentActivity(), i11, z8Var, r8VarArr2, animatorSetArr);
                org.telegram.ui.Cells.r8[] r8VarArr3 = r8VarArr2;
                c5VarArr3[0] = ysVar;
                ysVar.setSize(z5Var7.b[x10]);
                linearLayout.addView(c5VarArr3[0], c8.na.o(-1, 50));
                View r8Var2 = new org.telegram.ui.Cells.r8(21, dataAutoDownloadActivity.getParentActivity(), null, true);
                r8VarArr3[0] = r8Var2;
                linearLayout.addView(r8Var2, c8.na.o(-1, 48));
                r8VarArr3[0].setOnClickListener(new a(r8VarArr3, i10));
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.a7, z8Var, null);
                linearLayout.addView(z8Var, c8.na.o(-1, -2));
                i11 = i7;
                if (i11 == dataAutoDownloadActivity.videosRow) {
                    c5VarArr3[0].setText(org.telegram.messenger.gd.N0(2131753828, null));
                    r8VarArr3[0].f(org.telegram.messenger.gd.N0(2131753808, null), z5Var7.c, false);
                    oVar = oVar2;
                    z8Var.setText(org.telegram.messenger.gd.a0("AutoDownloadPreloadVideoInfo", null, 2131753807, org.telegram.messenger.g0.i0(z5Var7.b[x10], false, false)));
                    r8VarArr = r8VarArr3;
                } else {
                    oVar = oVar2;
                    c5VarArr3[0].setText(org.telegram.messenger.gd.N0(2131753829, null));
                    r8VarArr3[0].f(org.telegram.messenger.gd.N0(2131753810, null), z5Var7.d, false);
                    z8Var.setText(org.telegram.messenger.gd.N0(2131753809, null));
                    r8VarArr = r8VarArr3;
                }
            } else {
                oVar = oVar2;
                c5VarArr3[0] = null;
                r8VarArr2[0] = null;
                View view2 = new View(dataAutoDownloadActivity.getParentActivity());
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d7, view2, null);
                linearLayout.addView(view2, new LinearLayout.LayoutParams(-1, 1));
                r8VarArr = r8VarArr2;
            }
            if (i11 == dataAutoDownloadActivity.videosRow) {
                int i22 = 0;
                while (true) {
                    if (i22 >= 4) {
                        r15 = 0;
                        arrayList = null;
                        c5VarArr3[0].a(null, false);
                        r8VarArr[0].e(null, false);
                        break;
                    }
                    if (n8VarArr3[i22].b.h) {
                        arrayList = null;
                        r15 = 0;
                        break;
                    }
                    i22++;
                }
                if (z5Var7.b[x10] <= 2097152) {
                    r8VarArr[r15].e(arrayList, r15);
                }
            }
            FrameLayout frameLayout = new FrameLayout(dataAutoDownloadActivity.getParentActivity());
            frameLayout.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            linearLayout.addView(frameLayout, c8.na.o(-1, 52));
            TextView textView2 = new TextView(dataAutoDownloadActivity.getParentActivity());
            textView2.setTextSize(1, 14.0f);
            int i23 = org.telegram.ui.ActionBar.n6.n5;
            org.telegram.ui.ActionBar.u6.U(textView2, i23, null);
            textView2.setGravity(17);
            textView2.setTypeface(org.telegram.messenger.g0.o());
            textView2.setText(org.telegram.messenger.gd.N0(2131752577, null).toUpperCase());
            textView2.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
            frameLayout.addView(textView2, c8.na.e(-2, 36, 51));
            final h6.o oVar3 = oVar;
            textView2.setOnClickListener(new a(oVar3, 17));
            TextView textView3 = new TextView(dataAutoDownloadActivity.getParentActivity());
            textView3.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.u6.U(textView3, i23, null);
            textView3.setGravity(17);
            textView3.setTypeface(org.telegram.messenger.g0.o());
            textView3.setText(org.telegram.messenger.gd.N0(2131745750, null).toUpperCase());
            textView3.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
            frameLayout.addView(textView3, c8.na.e(-2, 36, 53));
            final String str6 = str;
            final String str7 = str2;
            final int i24 = i11;
            final int i25 = i14;
            textView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.xs
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    DataAutoDownloadActivity.a0(DataAutoDownloadActivity.this, n8VarArr3, i25, c5VarArr3, x10, r8VarArr, i24, str6, str7, oVar3, view);
                }
            });
            dataAutoDownloadActivity.showDialog((org.telegram.ui.ActionBar.w2) oVar3.b);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.N6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.M6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.g6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.e6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.s8));
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i7 = 2;
        int i10 = this.f;
        if (i10 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131753821, null));
        } else if (i10 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131753816, null));
        } else if (i10 == 2) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131753819, null));
        }
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new y7(this, 26));
        this.a = new l4(8, this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.b = ek0Var;
        ek0Var.r1();
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setSectionsDrawBackground(true);
        ((v4.l) this.b.getItemAnimator()).C = false;
        this.b.setLayoutManager(new v4.c0(1, false));
        frameLayout.addView(this.b, c8.na.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new zr(this, i7));
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 16, new Class[]{org.telegram.ui.Cells.o4.class, org.telegram.ui.Cells.i5.class, org.telegram.ui.Components.gu0.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.O6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.P6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Q6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.R6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.S6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.T6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.N6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        q0();
        s0();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onPause() {
        super.onPause();
        if (this.J) {
            org.telegram.messenger.a6.q(this.currentAccount).w(this.f);
            this.J = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onResume() {
        super.onResume();
        l4 l4Var = this.a;
        if (l4Var != null) {
            l4Var.f();
        }
    }

    public final void q0() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        org.telegram.messenger.z5 z5Var = this.E;
        arrayList.add(z5Var);
        org.telegram.messenger.z5 z5Var2 = this.F;
        arrayList.add(z5Var2);
        org.telegram.messenger.z5 z5Var3 = this.G;
        arrayList.add(z5Var3);
        org.telegram.messenger.z5 z5Var4 = this.H;
        if (!z5Var4.a(z5Var) && !z5Var4.a(z5Var2) && !z5Var4.a(z5Var3)) {
            arrayList.add(z5Var4);
        }
        Collections.sort(arrayList, new pe(21));
        int i7 = this.e;
        if (i7 == 0 || (i7 == 3 && z5Var4.a(z5Var))) {
            this.d = arrayList.indexOf(z5Var);
        } else {
            int i10 = this.e;
            if (i10 == 1 || (i10 == 3 && z5Var4.a(z5Var2))) {
                this.d = arrayList.indexOf(z5Var2);
            } else {
                int i11 = this.e;
                if (i11 == 2 || (i11 == 3 && z5Var4.a(z5Var3))) {
                    this.d = arrayList.indexOf(z5Var3);
                } else {
                    this.d = arrayList.indexOf(z5Var4);
                }
            }
        }
        org.telegram.ui.Components.ek0 ek0Var = this.b;
        if (ek0Var != null) {
            v4.f1 K = ek0Var.K(this.usageProgressRow);
            if (K != null) {
                View view = K.a;
                if (view instanceof org.telegram.ui.Components.gu0) {
                    r0((org.telegram.ui.Components.gu0) view);
                    return;
                }
            }
            this.a.g(this.usageProgressRow);
        }
    }

    public final void r0(org.telegram.ui.Components.gu0 gu0Var) {
        ArrayList arrayList = this.c;
        String[] strArr = new String[arrayList.size()];
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            org.telegram.messenger.z5 z5Var = (org.telegram.messenger.z5) arrayList.get(i7);
            if (z5Var == this.E) {
                strArr[i7] = org.telegram.messenger.gd.N0(2131753830, null);
            } else if (z5Var == this.F) {
                strArr[i7] = org.telegram.messenger.gd.N0(2131753826, null);
            } else if (z5Var == this.G) {
                strArr[i7] = org.telegram.messenger.gd.N0(2131753831, null);
            } else {
                strArr[i7] = org.telegram.messenger.gd.N0(2131753837, null);
            }
        }
        gu0Var.b(this.d, null, strArr);
    }

    public final void s0() {
        this.autoDownloadRow = 0;
        int i7 = 1 + 1;
        this.y = i7;
        this.n = 1;
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
        this.r = i7;
        this.usageProgressRow = i7 + 1;
        this.s = i7 + 2;
        this.w = i7 + 3;
        this.photosRow = i7 + 4;
        this.videosRow = i7 + 5;
        this.filesRow = i7 + 6;
        this.storiesRow = i7 + 7;
        this.y = i7 + 9;
        this.x = i7 + 8;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
