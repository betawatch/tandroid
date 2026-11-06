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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public class DataAutoDownloadActivity extends org.telegram.ui.ActionBar.f2 {
    public final org.telegram.messenger.y5 D;
    public final org.telegram.messenger.y5 E;
    public final org.telegram.messenger.y5 F;
    public final org.telegram.messenger.y5 G;
    public final org.telegram.messenger.y5 H;
    public boolean I;
    public final String J;
    public final String K;
    public l4 a;
    private int autoDownloadRow;
    public org.telegram.ui.Components.pj0 b;
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
        org.telegram.messenger.y5 y5Var = org.telegram.messenger.z5.q(this.currentAccount).J;
        this.D = y5Var;
        org.telegram.messenger.y5 y5Var2 = org.telegram.messenger.z5.q(this.currentAccount).K;
        this.E = y5Var2;
        org.telegram.messenger.y5 y5Var3 = org.telegram.messenger.z5.q(this.currentAccount).L;
        this.F = y5Var3;
        if (i7 == 0) {
            this.e = org.telegram.messenger.z5.q(this.currentAccount).P;
            this.G = org.telegram.messenger.z5.q(this.currentAccount).M;
            this.H = y5Var2;
            this.J = "mobilePreset";
            this.K = "currentMobilePreset";
            return;
        }
        if (i7 == 1) {
            this.e = org.telegram.messenger.z5.q(this.currentAccount).Q;
            this.G = org.telegram.messenger.z5.q(this.currentAccount).N;
            this.H = y5Var3;
            this.J = "wifiPreset";
            this.K = "currentWifiPreset";
            return;
        }
        this.e = org.telegram.messenger.z5.q(this.currentAccount).R;
        this.G = org.telegram.messenger.z5.q(this.currentAccount).O;
        this.H = y5Var;
        this.J = "roamingPreset";
        this.K = "currentRoamingPreset";
    }

    public static void Z(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.n8 n8Var, org.telegram.ui.Cells.n8[] n8VarArr, int i7, org.telegram.ui.Cells.b5[] b5VarArr, org.telegram.ui.Cells.r8[] r8VarArr, AnimatorSet[] animatorSetArr, View view) {
        if (view.isEnabled()) {
            boolean z9 = true;
            n8Var.setChecked(!n8Var.b.h);
            int i10 = 0;
            while (true) {
                if (i10 >= n8VarArr.length) {
                    z9 = false;
                    break;
                } else if (n8VarArr[i10].b.h) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i7 != dataAutoDownloadActivity.videosRow || b5VarArr[0].isEnabled() == z9) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            b5VarArr[0].a(arrayList, z9);
            if (b5VarArr[0].getSize() > 2097152) {
                r8VarArr[0].e(arrayList, z9);
            }
            AnimatorSet animatorSet = animatorSetArr[0];
            if (animatorSet != null) {
                animatorSet.cancel();
                animatorSetArr[0] = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSetArr[0] = animatorSet2;
            animatorSet2.playTogether(arrayList);
            animatorSetArr[0].addListener(new va(animatorSetArr, 21));
            animatorSetArr[0].setDuration(150L);
            animatorSetArr[0].start();
        }
    }

    public static void a0(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.n8[] n8VarArr, int i7, org.telegram.ui.Cells.b5[] b5VarArr, int i10, org.telegram.ui.Cells.r8[] r8VarArr, int i11, String str, String str2, h9.f1 f1Var, View view) {
        org.telegram.messenger.y5 y5Var = dataAutoDownloadActivity.G;
        int i12 = dataAutoDownloadActivity.e;
        if (i12 != 3) {
            if (i12 == 0) {
                y5Var.c(dataAutoDownloadActivity.D);
            } else if (i12 == 1) {
                y5Var.c(dataAutoDownloadActivity.E);
            } else if (i12 == 2) {
                y5Var.c(dataAutoDownloadActivity.F);
            }
        }
        for (int i13 = 0; i13 < 4; i13++) {
            if (n8VarArr[i13].b.h) {
                int[] iArr = y5Var.a;
                iArr[i13] = iArr[i13] | i7;
            } else {
                int[] iArr2 = y5Var.a;
                iArr2[i13] = iArr2[i13] & (~i7);
            }
        }
        org.telegram.ui.Cells.b5 b5Var = b5VarArr[0];
        if (b5Var != null) {
            b5Var.getSize();
            y5Var.b[i10] = (int) b5VarArr[0].getSize();
        }
        org.telegram.ui.Cells.r8 r8Var = r8VarArr[0];
        if (r8Var != null) {
            Switch r92 = r8Var.e;
            if (i11 == dataAutoDownloadActivity.videosRow) {
                y5Var.c = r92.h;
            } else {
                y5Var.d = r92.h;
            }
        }
        SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(dataAutoDownloadActivity.currentAccount).e7.edit();
        edit.putString(str, y5Var.toString());
        dataAutoDownloadActivity.e = 3;
        edit.putInt(str2, 3);
        int i14 = dataAutoDownloadActivity.f;
        if (i14 == 0) {
            org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).P = dataAutoDownloadActivity.e;
        } else if (i14 == 1) {
            org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).Q = dataAutoDownloadActivity.e;
        } else {
            org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).R = dataAutoDownloadActivity.e;
        }
        edit.commit();
        ((org.telegram.ui.ActionBar.v2) f1Var.b).x0.run();
        v4.d1 G = dataAutoDownloadActivity.b.G(view);
        if (G != null) {
            dataAutoDownloadActivity.h = true;
            dataAutoDownloadActivity.a.t(G, i11);
            dataAutoDownloadActivity.h = false;
        }
        org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).g();
        dataAutoDownloadActivity.I = true;
        dataAutoDownloadActivity.q0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v9 */
    public static void b0(final DataAutoDownloadActivity dataAutoDownloadActivity, final View view, int i7, float f10) {
        org.telegram.messenger.y5 o4;
        String str;
        String str2;
        boolean z9;
        int i10;
        h9.f1 f1Var;
        final org.telegram.ui.Cells.r8[] r8VarArr;
        ?? r15;
        ArrayList arrayList;
        int i11 = i7;
        org.telegram.messenger.y5 y5Var = dataAutoDownloadActivity.F;
        org.telegram.messenger.y5 y5Var2 = dataAutoDownloadActivity.E;
        org.telegram.messenger.y5 y5Var3 = dataAutoDownloadActivity.D;
        int i12 = dataAutoDownloadActivity.f;
        org.telegram.messenger.y5 y5Var4 = dataAutoDownloadActivity.G;
        org.telegram.ui.ActionBar.f6 f6Var = null;
        if (i11 == dataAutoDownloadActivity.autoDownloadRow) {
            int i13 = dataAutoDownloadActivity.e;
            if (i13 != 3) {
                if (i13 == 0) {
                    y5Var4.c(y5Var3);
                } else if (i13 == 1) {
                    y5Var4.c(y5Var2);
                } else if (i13 == 2) {
                    y5Var4.c(y5Var);
                }
            }
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            boolean z10 = r8Var.e.h;
            if (z10 || !y5Var4.g) {
                y5Var4.g = !y5Var4.g;
            } else {
                System.arraycopy(dataAutoDownloadActivity.H.a, 0, y5Var4.a, 0, 4);
            }
            view.setTag(Integer.valueOf(y5Var4.g ? org.telegram.ui.ActionBar.k6.f6 : org.telegram.ui.ActionBar.k6.e6));
            boolean z11 = !z10;
            r8Var.b(org.telegram.ui.ActionBar.k6.x0(null, y5Var4.g ? org.telegram.ui.ActionBar.k6.f6 : org.telegram.ui.ActionBar.k6.e6, false), z11);
            dataAutoDownloadActivity.s0();
            if (y5Var4.g) {
                dataAutoDownloadActivity.a.o(dataAutoDownloadActivity.n + 1, 9);
            } else {
                dataAutoDownloadActivity.a.p(dataAutoDownloadActivity.n + 1, 9);
            }
            dataAutoDownloadActivity.a.g(dataAutoDownloadActivity.n);
            SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(dataAutoDownloadActivity.currentAccount).e7.edit();
            edit.putString(dataAutoDownloadActivity.J, y5Var4.toString());
            String str3 = dataAutoDownloadActivity.K;
            dataAutoDownloadActivity.e = 3;
            edit.putInt(str3, 3);
            if (i12 == 0) {
                org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).P = dataAutoDownloadActivity.e;
            } else if (i12 == 1) {
                org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).Q = dataAutoDownloadActivity.e;
            } else {
                org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).R = dataAutoDownloadActivity.e;
            }
            edit.commit();
            r8Var.setChecked(z11);
            org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).g();
            dataAutoDownloadActivity.I = true;
            return;
        }
        if ((i11 == dataAutoDownloadActivity.photosRow || i11 == dataAutoDownloadActivity.videosRow || i11 == dataAutoDownloadActivity.filesRow || i11 == dataAutoDownloadActivity.storiesRow) && view.isEnabled()) {
            int i14 = i11 == dataAutoDownloadActivity.photosRow ? 1 : i11 == dataAutoDownloadActivity.videosRow ? 4 : i11 == dataAutoDownloadActivity.storiesRow ? -1 : 8;
            final int x10 = org.telegram.messenger.z5.x(i14);
            if (i12 == 0) {
                o4 = org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).n();
                str = "mobilePreset";
                str2 = "currentMobilePreset";
            } else if (i12 == 1) {
                o4 = org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).p();
                str = "wifiPreset";
                str2 = "currentWifiPreset";
            } else {
                o4 = org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).o();
                str = "roamingPreset";
                str2 = "currentRoamingPreset";
            }
            org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view;
            boolean z12 = h5Var.e.h;
            if (i11 == dataAutoDownloadActivity.storiesRow || ((org.telegram.messenger.hd.a0 && f10 <= org.telegram.messenger.g0.L(76.0f)) || (!org.telegram.messenger.hd.a0 && f10 >= view.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f)))) {
                org.telegram.messenger.y5 y5Var5 = o4;
                int i15 = i14;
                String str4 = str;
                String str5 = str2;
                int i16 = dataAutoDownloadActivity.e;
                if (i16 != 3) {
                    if (i16 == 0) {
                        y5Var4.c(y5Var3);
                    } else if (i16 == 1) {
                        y5Var4.c(y5Var2);
                    } else if (i16 == 2) {
                        y5Var4.c(y5Var);
                    }
                }
                if (i11 != dataAutoDownloadActivity.storiesRow) {
                    int i17 = 0;
                    while (true) {
                        if (i17 >= y5Var4.a.length) {
                            z9 = false;
                            break;
                        } else {
                            if ((y5Var5.a[i17] & i15) != 0) {
                                z9 = true;
                                break;
                            }
                            i17++;
                        }
                    }
                    int i18 = 0;
                    while (true) {
                        int[] iArr = y5Var4.a;
                        if (i18 >= iArr.length) {
                            break;
                        }
                        if (z12) {
                            iArr[i18] = iArr[i18] & (~i15);
                        } else if (!z9) {
                            iArr[i18] = iArr[i18] | i15;
                        }
                        i18++;
                    }
                } else {
                    y5Var4.e = !z12;
                }
                SharedPreferences.Editor edit2 = org.telegram.messenger.qp.s1(dataAutoDownloadActivity.currentAccount).e7.edit();
                edit2.putString(str4, y5Var4.toString());
                dataAutoDownloadActivity.e = 3;
                edit2.putInt(str5, 3);
                if (i12 == 0) {
                    org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).P = dataAutoDownloadActivity.e;
                } else if (i12 == 1) {
                    org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).Q = dataAutoDownloadActivity.e;
                } else {
                    org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).R = dataAutoDownloadActivity.e;
                }
                edit2.commit();
                h5Var.setChecked(!z12);
                org.telegram.ui.Components.pj0 pj0Var = dataAutoDownloadActivity.b;
                View F = pj0Var.F(view);
                v4.d1 T = F == null ? null : pj0Var.T(F);
                if (T != null) {
                    dataAutoDownloadActivity.a.t(T, i11);
                }
                org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).g();
                dataAutoDownloadActivity.I = true;
                dataAutoDownloadActivity.q0();
                return;
            }
            if (dataAutoDownloadActivity.getParentActivity() == null) {
                return;
            }
            h9.f1 f1Var2 = new h9.f1(dataAutoDownloadActivity.getParentActivity(), (org.telegram.ui.ActionBar.f6) null);
            org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) f1Var2.b;
            v2Var.u0 = false;
            v2Var.v0 = false;
            LinearLayout linearLayout = new LinearLayout(dataAutoDownloadActivity.getParentActivity());
            linearLayout.setOrientation(1);
            ((org.telegram.ui.ActionBar.v2) f1Var2.b).N = linearLayout;
            org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(dataAutoDownloadActivity.getParentActivity(), org.telegram.ui.ActionBar.k6.n5, 21, 15, false, null);
            if (i11 == dataAutoDownloadActivity.photosRow) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131753815, null));
            } else if (i11 == dataAutoDownloadActivity.videosRow) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131753804, null));
            } else {
                n4Var.setText(org.telegram.messenger.hd.M0(2131753836, null));
            }
            linearLayout.addView(n4Var, c8.ha.c(-2.0f, -1));
            org.telegram.ui.Cells.b5[] b5VarArr = new org.telegram.ui.Cells.b5[1];
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
                boolean z13 = org.telegram.messenger.hd.a0;
                TextView textView = new TextView(parentActivity);
                n8Var.a = textView;
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, f6Var);
                org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                textView.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                n8Var.addView(textView, c8.ha.d(-1, -1.0f, (z13 ? 5 : 3) | 48, z13 ? 66.0f : 21.0f, 0.0f, z13 ? 21.0f : 66.0f, 0.0f));
                CheckBoxSquare checkBoxSquare = new CheckBoxSquare(parentActivity, null, true);
                n8Var.b = checkBoxSquare;
                checkBoxSquare.setDuplicateParentStateEnabled(false);
                checkBoxSquare.setFocusable(false);
                checkBoxSquare.setFocusableInTouchMode(false);
                checkBoxSquare.setClickable(false);
                n8Var.addView(checkBoxSquare, c8.ha.d(18, 18.0f, (z13 ? 3 : 5) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
                n8VarArr[i20] = n8Var;
                if (i20 == 0) {
                    n8Var.a(org.telegram.messenger.hd.M0(2131753776, null), (o4.a[0] & i14) != 0, true);
                } else if (i20 == 1) {
                    n8Var.a(org.telegram.messenger.hd.M0(2131753774, null), (o4.a[1] & i14) != 0, true);
                } else if (i20 == 2) {
                    n8Var.a(org.telegram.messenger.hd.M0(2131753775, null), (o4.a[2] & i14) != 0, true);
                } else {
                    n8Var.a(org.telegram.messenger.hd.M0(2131753777, null), (o4.a[3] & i14) != 0, i11 != dataAutoDownloadActivity.photosRow);
                }
                n8VarArr[i20].setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
                org.telegram.ui.Cells.n8 n8Var2 = n8VarArr[i20];
                org.telegram.messenger.y5 y5Var6 = o4;
                AnimatorSet[] animatorSetArr2 = animatorSetArr;
                org.telegram.ui.Cells.b5[] b5VarArr2 = b5VarArr;
                int i21 = i11;
                org.telegram.ui.Cells.n8[] n8VarArr2 = n8VarArr;
                bi.lb lbVar = new bi.lb(dataAutoDownloadActivity, n8Var, n8VarArr2, i21, b5VarArr2, r8VarArr2, animatorSetArr2);
                i11 = i21;
                animatorSetArr = animatorSetArr2;
                n8Var2.setOnClickListener(lbVar);
                linearLayout.addView(n8VarArr2[i20], c8.ha.c(50.0f, -1));
                i20++;
                b5VarArr = b5VarArr2;
                o4 = y5Var6;
                n8VarArr = n8VarArr2;
                i19 = 4;
                f6Var = null;
            }
            final org.telegram.ui.Cells.n8[] n8VarArr3 = n8VarArr;
            org.telegram.messenger.y5 y5Var7 = o4;
            final org.telegram.ui.Cells.b5[] b5VarArr3 = b5VarArr;
            if (i11 != dataAutoDownloadActivity.photosRow) {
                org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(dataAutoDownloadActivity.getParentActivity());
                vs vsVar = new vs(dataAutoDownloadActivity, dataAutoDownloadActivity.getParentActivity(), i11, z8Var, r8VarArr2, animatorSetArr);
                org.telegram.ui.Cells.r8[] r8VarArr3 = r8VarArr2;
                b5VarArr3[0] = vsVar;
                vsVar.setSize(y5Var7.b[x10]);
                linearLayout.addView(b5VarArr3[0], c8.ha.o(-1, 50));
                View r8Var2 = new org.telegram.ui.Cells.r8(21, dataAutoDownloadActivity.getParentActivity(), null, true);
                r8VarArr3[0] = r8Var2;
                linearLayout.addView(r8Var2, c8.ha.o(-1, 48));
                r8VarArr3[0].setOnClickListener(new a(r8VarArr3, i10));
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, z8Var, null);
                linearLayout.addView(z8Var, c8.ha.o(-1, -2));
                i11 = i7;
                if (i11 == dataAutoDownloadActivity.videosRow) {
                    b5VarArr3[0].setText(org.telegram.messenger.hd.M0(2131753831, null));
                    r8VarArr3[0].f(org.telegram.messenger.hd.M0(2131753811, null), y5Var7.c, false);
                    f1Var = f1Var2;
                    z8Var.setText(org.telegram.messenger.hd.a0("AutoDownloadPreloadVideoInfo", null, 2131753810, org.telegram.messenger.g0.i0(y5Var7.b[x10], false, false)));
                    r8VarArr = r8VarArr3;
                } else {
                    f1Var = f1Var2;
                    b5VarArr3[0].setText(org.telegram.messenger.hd.M0(2131753832, null));
                    r8VarArr3[0].f(org.telegram.messenger.hd.M0(2131753813, null), y5Var7.d, false);
                    z8Var.setText(org.telegram.messenger.hd.M0(2131753812, null));
                    r8VarArr = r8VarArr3;
                }
            } else {
                f1Var = f1Var2;
                b5VarArr3[0] = null;
                r8VarArr2[0] = null;
                View view2 = new View(dataAutoDownloadActivity.getParentActivity());
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d7, view2, null);
                linearLayout.addView(view2, new LinearLayout.LayoutParams(-1, 1));
                r8VarArr = r8VarArr2;
            }
            if (i11 == dataAutoDownloadActivity.videosRow) {
                int i22 = 0;
                while (true) {
                    if (i22 >= 4) {
                        r15 = 0;
                        arrayList = null;
                        b5VarArr3[0].a(null, false);
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
                if (y5Var7.b[x10] <= 2097152) {
                    r8VarArr[r15].e(arrayList, r15);
                }
            }
            FrameLayout frameLayout = new FrameLayout(dataAutoDownloadActivity.getParentActivity());
            frameLayout.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            linearLayout.addView(frameLayout, c8.ha.o(-1, 52));
            TextView textView2 = new TextView(dataAutoDownloadActivity.getParentActivity());
            textView2.setTextSize(1, 14.0f);
            int i23 = org.telegram.ui.ActionBar.k6.n5;
            org.telegram.ui.ActionBar.r6.V(textView2, i23, null);
            textView2.setGravity(17);
            textView2.setTypeface(org.telegram.messenger.g0.o());
            textView2.setText(org.telegram.messenger.hd.M0(2131752589, null).toUpperCase());
            textView2.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
            frameLayout.addView(textView2, c8.ha.e(-2, 36, 51));
            final h9.f1 f1Var3 = f1Var;
            textView2.setOnClickListener(new a(f1Var3, 17));
            TextView textView3 = new TextView(dataAutoDownloadActivity.getParentActivity());
            textView3.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.r6.V(textView3, i23, null);
            textView3.setGravity(17);
            textView3.setTypeface(org.telegram.messenger.g0.o());
            textView3.setText(org.telegram.messenger.hd.M0(2131745947, null).toUpperCase());
            textView3.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
            frameLayout.addView(textView3, c8.ha.e(-2, 36, 53));
            final String str6 = str;
            final String str7 = str2;
            final int i24 = i11;
            final int i25 = i14;
            textView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.us
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    DataAutoDownloadActivity.a0(DataAutoDownloadActivity.this, n8VarArr3, i25, b5VarArr3, x10, r8VarArr, i24, str6, str7, f1Var3, view);
                }
            });
            dataAutoDownloadActivity.showDialog((org.telegram.ui.ActionBar.v2) f1Var3.b);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.N6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.M6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.g6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.e6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i7 = 2;
        int i10 = this.f;
        if (i10 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131753824, null));
        } else if (i10 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131753819, null));
        } else if (i10 == 2) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131753822, null));
        }
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).S0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new w9(this, 23));
        this.a = new l4(8, this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.b = pj0Var;
        pj0Var.r1();
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setSectionsDrawBackground(true);
        ((v4.k) this.b.getItemAnimator()).C = false;
        this.b.setLayoutManager(new v4.b0(1, false));
        frameLayout.addView(this.b, c8.ha.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new wr(this, i7));
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 16, new Class[]{org.telegram.ui.Cells.n4.class, org.telegram.ui.Cells.h5.class, org.telegram.ui.Components.vt0.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.O6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.P6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Q6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.R6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.S6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.T6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        q0();
        s0();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onPause() {
        super.onPause();
        if (this.I) {
            org.telegram.messenger.z5.q(this.currentAccount).w(this.f);
            this.I = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
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
        org.telegram.messenger.y5 y5Var = this.D;
        arrayList.add(y5Var);
        org.telegram.messenger.y5 y5Var2 = this.E;
        arrayList.add(y5Var2);
        org.telegram.messenger.y5 y5Var3 = this.F;
        arrayList.add(y5Var3);
        org.telegram.messenger.y5 y5Var4 = this.G;
        if (!y5Var4.a(y5Var) && !y5Var4.a(y5Var2) && !y5Var4.a(y5Var3)) {
            arrayList.add(y5Var4);
        }
        Collections.sort(arrayList, new oe(23));
        int i7 = this.e;
        if (i7 == 0 || (i7 == 3 && y5Var4.a(y5Var))) {
            this.d = arrayList.indexOf(y5Var);
        } else {
            int i10 = this.e;
            if (i10 == 1 || (i10 == 3 && y5Var4.a(y5Var2))) {
                this.d = arrayList.indexOf(y5Var2);
            } else {
                int i11 = this.e;
                if (i11 == 2 || (i11 == 3 && y5Var4.a(y5Var3))) {
                    this.d = arrayList.indexOf(y5Var3);
                } else {
                    this.d = arrayList.indexOf(y5Var4);
                }
            }
        }
        org.telegram.ui.Components.pj0 pj0Var = this.b;
        if (pj0Var != null) {
            v4.d1 K = pj0Var.K(this.usageProgressRow);
            if (K != null) {
                View view = K.a;
                if (view instanceof org.telegram.ui.Components.vt0) {
                    r0((org.telegram.ui.Components.vt0) view);
                    return;
                }
            }
            this.a.g(this.usageProgressRow);
        }
    }

    public final void r0(org.telegram.ui.Components.vt0 vt0Var) {
        ArrayList arrayList = this.c;
        String[] strArr = new String[arrayList.size()];
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            org.telegram.messenger.y5 y5Var = (org.telegram.messenger.y5) arrayList.get(i7);
            if (y5Var == this.D) {
                strArr[i7] = org.telegram.messenger.hd.M0(2131753833, null);
            } else if (y5Var == this.E) {
                strArr[i7] = org.telegram.messenger.hd.M0(2131753829, null);
            } else if (y5Var == this.F) {
                strArr[i7] = org.telegram.messenger.hd.M0(2131753834, null);
            } else {
                strArr[i7] = org.telegram.messenger.hd.M0(2131753840, null);
            }
        }
        vt0Var.b(this.d, null, strArr);
    }

    public final void s0() {
        this.autoDownloadRow = 0;
        int i7 = 1 + 1;
        this.y = i7;
        this.n = 1;
        if (!this.G.g) {
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

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
