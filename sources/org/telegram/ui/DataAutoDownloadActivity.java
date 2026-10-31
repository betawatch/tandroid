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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class DataAutoDownloadActivity extends org.telegram.ui.ActionBar.k2 {
    public final org.telegram.messenger.a6 D;
    public final org.telegram.messenger.a6 E;
    public final org.telegram.messenger.a6 F;
    public final org.telegram.messenger.a6 G;
    public final org.telegram.messenger.a6 H;
    public boolean I;
    public final String J;
    public final String K;
    public fg.j a;
    private int autoDownloadRow;
    public org.telegram.ui.Components.tk0 b;
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

    public DataAutoDownloadActivity(int i10) {
        super(null);
        this.c = new ArrayList();
        this.d = 1;
        this.f = i10;
        org.telegram.messenger.a6 a6Var = org.telegram.messenger.b6.q(this.currentAccount).J;
        this.D = a6Var;
        org.telegram.messenger.a6 a6Var2 = org.telegram.messenger.b6.q(this.currentAccount).K;
        this.E = a6Var2;
        org.telegram.messenger.a6 a6Var3 = org.telegram.messenger.b6.q(this.currentAccount).L;
        this.F = a6Var3;
        if (i10 == 0) {
            this.e = org.telegram.messenger.b6.q(this.currentAccount).P;
            this.G = org.telegram.messenger.b6.q(this.currentAccount).M;
            this.H = a6Var2;
            this.J = "mobilePreset";
            this.K = "currentMobilePreset";
            return;
        }
        if (i10 == 1) {
            this.e = org.telegram.messenger.b6.q(this.currentAccount).Q;
            this.G = org.telegram.messenger.b6.q(this.currentAccount).N;
            this.H = a6Var3;
            this.J = "wifiPreset";
            this.K = "currentWifiPreset";
            return;
        }
        this.e = org.telegram.messenger.b6.q(this.currentAccount).R;
        this.G = org.telegram.messenger.b6.q(this.currentAccount).O;
        this.H = a6Var;
        this.J = "roamingPreset";
        this.K = "currentRoamingPreset";
    }

    public static void Y(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.q8 q8Var, org.telegram.ui.Cells.q8[] q8VarArr, int i10, org.telegram.ui.Cells.f5[] f5VarArr, org.telegram.ui.Cells.t8[] t8VarArr, AnimatorSet[] animatorSetArr, View view) {
        if (view.isEnabled()) {
            boolean z10 = true;
            q8Var.setChecked(!q8Var.b.h);
            int i11 = 0;
            while (true) {
                if (i11 >= q8VarArr.length) {
                    z10 = false;
                    break;
                } else if (q8VarArr[i11].b.h) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i10 != dataAutoDownloadActivity.videosRow || f5VarArr[0].isEnabled() == z10) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            f5VarArr[0].a(arrayList, z10);
            if (f5VarArr[0].getSize() > 2097152) {
                t8VarArr[0].e(arrayList, z10);
            }
            AnimatorSet animatorSet = animatorSetArr[0];
            if (animatorSet != null) {
                animatorSet.cancel();
                animatorSetArr[0] = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSetArr[0] = animatorSet2;
            animatorSet2.playTogether(arrayList);
            animatorSetArr[0].addListener(new org.telegram.ui.Components.voip.h2(animatorSetArr, 2));
            animatorSetArr[0].setDuration(150L);
            animatorSetArr[0].start();
        }
    }

    public static void Z(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.q8[] q8VarArr, int i10, org.telegram.ui.Cells.f5[] f5VarArr, int i11, org.telegram.ui.Cells.t8[] t8VarArr, int i12, String str, String str2, l2.f fVar, View view) {
        org.telegram.messenger.a6 a6Var = dataAutoDownloadActivity.G;
        int i13 = dataAutoDownloadActivity.e;
        if (i13 != 3) {
            if (i13 == 0) {
                a6Var.c(dataAutoDownloadActivity.D);
            } else if (i13 == 1) {
                a6Var.c(dataAutoDownloadActivity.E);
            } else if (i13 == 2) {
                a6Var.c(dataAutoDownloadActivity.F);
            }
        }
        for (int i14 = 0; i14 < 4; i14++) {
            if (q8VarArr[i14].b.h) {
                int[] iArr = a6Var.a;
                iArr[i14] = iArr[i14] | i10;
            } else {
                int[] iArr2 = a6Var.a;
                iArr2[i14] = iArr2[i14] & (~i10);
            }
        }
        org.telegram.ui.Cells.f5 f5Var = f5VarArr[0];
        if (f5Var != null) {
            f5Var.getSize();
            a6Var.b[i11] = (int) f5VarArr[0].getSize();
        }
        org.telegram.ui.Cells.t8 t8Var = t8VarArr[0];
        if (t8Var != null) {
            Switch r92 = t8Var.e;
            if (i12 == dataAutoDownloadActivity.videosRow) {
                a6Var.c = r92.h;
            } else {
                a6Var.d = r92.h;
            }
        }
        SharedPreferences.Editor edit = org.telegram.messenger.vp.r1(dataAutoDownloadActivity.currentAccount).f7.edit();
        edit.putString(str, a6Var.toString());
        dataAutoDownloadActivity.e = 3;
        edit.putInt(str2, 3);
        int i15 = dataAutoDownloadActivity.f;
        if (i15 == 0) {
            org.telegram.messenger.b6.q(dataAutoDownloadActivity.currentAccount).P = dataAutoDownloadActivity.e;
        } else if (i15 == 1) {
            org.telegram.messenger.b6.q(dataAutoDownloadActivity.currentAccount).Q = dataAutoDownloadActivity.e;
        } else {
            org.telegram.messenger.b6.q(dataAutoDownloadActivity.currentAccount).R = dataAutoDownloadActivity.e;
        }
        edit.commit();
        ((org.telegram.ui.ActionBar.z2) fVar.b).x0.run();
        s4.c1 G = dataAutoDownloadActivity.b.G(view);
        if (G != null) {
            dataAutoDownloadActivity.h = true;
            dataAutoDownloadActivity.a.t(G, i12);
            dataAutoDownloadActivity.h = false;
        }
        org.telegram.messenger.b6.q(dataAutoDownloadActivity.currentAccount).g();
        dataAutoDownloadActivity.I = true;
        dataAutoDownloadActivity.p0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v9 */
    public static void a0(final DataAutoDownloadActivity dataAutoDownloadActivity, final View view, int i10, float f7) {
        org.telegram.messenger.a6 o10;
        String str;
        String str2;
        boolean z10;
        int i11;
        l2.f fVar;
        final org.telegram.ui.Cells.t8[] t8VarArr;
        ?? r15;
        ArrayList arrayList;
        int i12 = i10;
        org.telegram.messenger.a6 a6Var = dataAutoDownloadActivity.F;
        org.telegram.messenger.a6 a6Var2 = dataAutoDownloadActivity.E;
        org.telegram.messenger.a6 a6Var3 = dataAutoDownloadActivity.D;
        int i13 = dataAutoDownloadActivity.f;
        org.telegram.messenger.a6 a6Var4 = dataAutoDownloadActivity.G;
        org.telegram.ui.ActionBar.p6 p6Var = null;
        if (i12 == dataAutoDownloadActivity.autoDownloadRow) {
            int i14 = dataAutoDownloadActivity.e;
            if (i14 != 3) {
                if (i14 == 0) {
                    a6Var4.c(a6Var3);
                } else if (i14 == 1) {
                    a6Var4.c(a6Var2);
                } else if (i14 == 2) {
                    a6Var4.c(a6Var);
                }
            }
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
            boolean z11 = t8Var.e.h;
            if (z11 || !a6Var4.g) {
                a6Var4.g = !a6Var4.g;
            } else {
                System.arraycopy(dataAutoDownloadActivity.H.a, 0, a6Var4.a, 0, 4);
            }
            view.setTag(Integer.valueOf(a6Var4.g ? org.telegram.ui.ActionBar.t6.f6 : org.telegram.ui.ActionBar.t6.e6));
            boolean z12 = !z11;
            t8Var.b(org.telegram.ui.ActionBar.t6.x0(null, a6Var4.g ? org.telegram.ui.ActionBar.t6.f6 : org.telegram.ui.ActionBar.t6.e6, false), z12);
            dataAutoDownloadActivity.r0();
            if (a6Var4.g) {
                dataAutoDownloadActivity.a.o(dataAutoDownloadActivity.n + 1, 9);
            } else {
                dataAutoDownloadActivity.a.p(dataAutoDownloadActivity.n + 1, 9);
            }
            dataAutoDownloadActivity.a.g(dataAutoDownloadActivity.n);
            SharedPreferences.Editor edit = org.telegram.messenger.vp.r1(dataAutoDownloadActivity.currentAccount).f7.edit();
            edit.putString(dataAutoDownloadActivity.J, a6Var4.toString());
            String str3 = dataAutoDownloadActivity.K;
            dataAutoDownloadActivity.e = 3;
            edit.putInt(str3, 3);
            if (i13 == 0) {
                org.telegram.messenger.b6.q(dataAutoDownloadActivity.currentAccount).P = dataAutoDownloadActivity.e;
            } else if (i13 == 1) {
                org.telegram.messenger.b6.q(dataAutoDownloadActivity.currentAccount).Q = dataAutoDownloadActivity.e;
            } else {
                org.telegram.messenger.b6.q(dataAutoDownloadActivity.currentAccount).R = dataAutoDownloadActivity.e;
            }
            edit.commit();
            t8Var.setChecked(z12);
            org.telegram.messenger.b6.q(dataAutoDownloadActivity.currentAccount).g();
            dataAutoDownloadActivity.I = true;
            return;
        }
        if ((i12 == dataAutoDownloadActivity.photosRow || i12 == dataAutoDownloadActivity.videosRow || i12 == dataAutoDownloadActivity.filesRow || i12 == dataAutoDownloadActivity.storiesRow) && view.isEnabled()) {
            int i15 = i12 == dataAutoDownloadActivity.photosRow ? 1 : i12 == dataAutoDownloadActivity.videosRow ? 4 : i12 == dataAutoDownloadActivity.storiesRow ? -1 : 8;
            final int x10 = org.telegram.messenger.b6.x(i15);
            if (i13 == 0) {
                o10 = org.telegram.messenger.b6.q(dataAutoDownloadActivity.currentAccount).n();
                str = "mobilePreset";
                str2 = "currentMobilePreset";
            } else if (i13 == 1) {
                o10 = org.telegram.messenger.b6.q(dataAutoDownloadActivity.currentAccount).p();
                str = "wifiPreset";
                str2 = "currentWifiPreset";
            } else {
                o10 = org.telegram.messenger.b6.q(dataAutoDownloadActivity.currentAccount).o();
                str = "roamingPreset";
                str2 = "currentRoamingPreset";
            }
            org.telegram.ui.Cells.l5 l5Var = (org.telegram.ui.Cells.l5) view;
            boolean z13 = l5Var.e.h;
            if (i12 == dataAutoDownloadActivity.storiesRow || ((org.telegram.messenger.cd.X && f7 <= org.telegram.messenger.i0.L(76.0f)) || (!org.telegram.messenger.cd.X && f7 >= view.getMeasuredWidth() - org.telegram.messenger.i0.L(76.0f)))) {
                org.telegram.messenger.a6 a6Var5 = o10;
                int i16 = i15;
                String str4 = str;
                String str5 = str2;
                int i17 = dataAutoDownloadActivity.e;
                if (i17 != 3) {
                    if (i17 == 0) {
                        a6Var4.c(a6Var3);
                    } else if (i17 == 1) {
                        a6Var4.c(a6Var2);
                    } else if (i17 == 2) {
                        a6Var4.c(a6Var);
                    }
                }
                if (i12 != dataAutoDownloadActivity.storiesRow) {
                    int i18 = 0;
                    while (true) {
                        if (i18 >= a6Var4.a.length) {
                            z10 = false;
                            break;
                        } else {
                            if ((a6Var5.a[i18] & i16) != 0) {
                                z10 = true;
                                break;
                            }
                            i18++;
                        }
                    }
                    int i19 = 0;
                    while (true) {
                        int[] iArr = a6Var4.a;
                        if (i19 >= iArr.length) {
                            break;
                        }
                        if (z13) {
                            iArr[i19] = iArr[i19] & (~i16);
                        } else if (!z10) {
                            iArr[i19] = iArr[i19] | i16;
                        }
                        i19++;
                    }
                } else {
                    a6Var4.e = !z13;
                }
                SharedPreferences.Editor edit2 = org.telegram.messenger.vp.r1(dataAutoDownloadActivity.currentAccount).f7.edit();
                edit2.putString(str4, a6Var4.toString());
                dataAutoDownloadActivity.e = 3;
                edit2.putInt(str5, 3);
                if (i13 == 0) {
                    org.telegram.messenger.b6.q(dataAutoDownloadActivity.currentAccount).P = dataAutoDownloadActivity.e;
                } else if (i13 == 1) {
                    org.telegram.messenger.b6.q(dataAutoDownloadActivity.currentAccount).Q = dataAutoDownloadActivity.e;
                } else {
                    org.telegram.messenger.b6.q(dataAutoDownloadActivity.currentAccount).R = dataAutoDownloadActivity.e;
                }
                edit2.commit();
                l5Var.setChecked(!z13);
                org.telegram.ui.Components.tk0 tk0Var = dataAutoDownloadActivity.b;
                View F = tk0Var.F(view);
                s4.c1 T = F == null ? null : tk0Var.T(F);
                if (T != null) {
                    dataAutoDownloadActivity.a.t(T, i12);
                }
                org.telegram.messenger.b6.q(dataAutoDownloadActivity.currentAccount).g();
                dataAutoDownloadActivity.I = true;
                dataAutoDownloadActivity.p0();
                return;
            }
            if (dataAutoDownloadActivity.getParentActivity() == null) {
                return;
            }
            l2.f fVar2 = new l2.f(dataAutoDownloadActivity.getParentActivity(), (org.telegram.ui.ActionBar.p6) null);
            org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) fVar2.b;
            z2Var.u0 = false;
            z2Var.v0 = false;
            LinearLayout linearLayout = new LinearLayout(dataAutoDownloadActivity.getParentActivity());
            linearLayout.setOrientation(1);
            ((org.telegram.ui.ActionBar.z2) fVar2.b).N = linearLayout;
            org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(dataAutoDownloadActivity.getParentActivity(), org.telegram.ui.ActionBar.t6.n5, 21, 15, false, null);
            if (i12 == dataAutoDownloadActivity.photosRow) {
                p4Var.setText(org.telegram.messenger.cd.L0(2131753815, null));
            } else if (i12 == dataAutoDownloadActivity.videosRow) {
                p4Var.setText(org.telegram.messenger.cd.L0(2131753804, null));
            } else {
                p4Var.setText(org.telegram.messenger.cd.L0(2131753836, null));
            }
            linearLayout.addView(p4Var, w7.b6.c(-2.0f, -1));
            org.telegram.ui.Cells.f5[] f5VarArr = new org.telegram.ui.Cells.f5[1];
            org.telegram.ui.Cells.t8[] t8VarArr2 = new org.telegram.ui.Cells.t8[1];
            AnimatorSet[] animatorSetArr = new AnimatorSet[1];
            int i20 = 4;
            org.telegram.ui.Cells.q8[] q8VarArr = new org.telegram.ui.Cells.q8[4];
            int i21 = 0;
            while (true) {
                i11 = 16;
                if (i21 >= i20) {
                    break;
                }
                Activity parentActivity = dataAutoDownloadActivity.getParentActivity();
                org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(parentActivity);
                boolean z14 = org.telegram.messenger.cd.X;
                TextView textView = new TextView(parentActivity);
                q8Var.a = textView;
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.j5, p6Var);
                org.telegram.messenger.z20.o(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                textView.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 16);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                q8Var.addView(textView, w7.b6.d(-1, -1.0f, (z14 ? 5 : 3) | 48, z14 ? 66.0f : 21.0f, 0.0f, z14 ? 21.0f : 66.0f, 0.0f));
                CheckBoxSquare checkBoxSquare = new CheckBoxSquare(parentActivity, null, true);
                q8Var.b = checkBoxSquare;
                checkBoxSquare.setDuplicateParentStateEnabled(false);
                checkBoxSquare.setFocusable(false);
                checkBoxSquare.setFocusableInTouchMode(false);
                checkBoxSquare.setClickable(false);
                q8Var.addView(checkBoxSquare, w7.b6.d(18, 18.0f, (z14 ? 3 : 5) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
                q8VarArr[i21] = q8Var;
                if (i21 == 0) {
                    q8Var.a(org.telegram.messenger.cd.L0(2131753776, null), (o10.a[0] & i15) != 0, true);
                } else if (i21 == 1) {
                    q8Var.a(org.telegram.messenger.cd.L0(2131753774, null), (o10.a[1] & i15) != 0, true);
                } else if (i21 == 2) {
                    q8Var.a(org.telegram.messenger.cd.L0(2131753775, null), (o10.a[2] & i15) != 0, true);
                } else {
                    q8Var.a(org.telegram.messenger.cd.L0(2131753777, null), (o10.a[3] & i15) != 0, i12 != dataAutoDownloadActivity.photosRow);
                }
                q8VarArr[i21].setBackgroundDrawable(org.telegram.ui.ActionBar.t6.N0(false));
                org.telegram.ui.Cells.q8 q8Var2 = q8VarArr[i21];
                org.telegram.messenger.a6 a6Var6 = o10;
                AnimatorSet[] animatorSetArr2 = animatorSetArr;
                org.telegram.ui.Cells.f5[] f5VarArr2 = f5VarArr;
                int i22 = i12;
                org.telegram.ui.Cells.q8[] q8VarArr2 = q8VarArr;
                wt wtVar = new wt(dataAutoDownloadActivity, q8Var, q8VarArr2, i22, f5VarArr2, t8VarArr2, animatorSetArr2);
                i12 = i22;
                animatorSetArr = animatorSetArr2;
                q8Var2.setOnClickListener(wtVar);
                linearLayout.addView(q8VarArr2[i21], w7.b6.c(50.0f, -1));
                i21++;
                f5VarArr = f5VarArr2;
                o10 = a6Var6;
                q8VarArr = q8VarArr2;
                i20 = 4;
                p6Var = null;
            }
            final org.telegram.ui.Cells.q8[] q8VarArr3 = q8VarArr;
            org.telegram.messenger.a6 a6Var7 = o10;
            final org.telegram.ui.Cells.f5[] f5VarArr3 = f5VarArr;
            if (i12 != dataAutoDownloadActivity.photosRow) {
                org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(dataAutoDownloadActivity.getParentActivity());
                yt ytVar = new yt(dataAutoDownloadActivity, dataAutoDownloadActivity.getParentActivity(), i12, b9Var, t8VarArr2, animatorSetArr);
                org.telegram.ui.Cells.t8[] t8VarArr3 = t8VarArr2;
                f5VarArr3[0] = ytVar;
                ytVar.setSize(a6Var7.b[x10]);
                linearLayout.addView(f5VarArr3[0], w7.b6.o(-1, 50));
                View t8Var2 = new org.telegram.ui.Cells.t8(21, dataAutoDownloadActivity.getParentActivity(), null, true);
                t8VarArr3[0] = t8Var2;
                linearLayout.addView(t8Var2, w7.b6.o(-1, 48));
                t8VarArr3[0].setOnClickListener(new a(t8VarArr3, i11));
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.a7, b9Var, null);
                linearLayout.addView(b9Var, w7.b6.o(-1, -2));
                i12 = i10;
                if (i12 == dataAutoDownloadActivity.videosRow) {
                    f5VarArr3[0].setText(org.telegram.messenger.cd.L0(2131753831, null));
                    t8VarArr3[0].f(org.telegram.messenger.cd.L0(2131753811, null), a6Var7.c, false);
                    fVar = fVar2;
                    b9Var.setText(org.telegram.messenger.cd.a0("AutoDownloadPreloadVideoInfo", null, 2131753810, org.telegram.messenger.i0.i0(a6Var7.b[x10], false, false)));
                    t8VarArr = t8VarArr3;
                } else {
                    fVar = fVar2;
                    f5VarArr3[0].setText(org.telegram.messenger.cd.L0(2131753832, null));
                    t8VarArr3[0].f(org.telegram.messenger.cd.L0(2131753813, null), a6Var7.d, false);
                    b9Var.setText(org.telegram.messenger.cd.L0(2131753812, null));
                    t8VarArr = t8VarArr3;
                }
            } else {
                fVar = fVar2;
                f5VarArr3[0] = null;
                t8VarArr2[0] = null;
                View view2 = new View(dataAutoDownloadActivity.getParentActivity());
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d7, view2, null);
                linearLayout.addView(view2, new LinearLayout.LayoutParams(-1, 1));
                t8VarArr = t8VarArr2;
            }
            if (i12 == dataAutoDownloadActivity.videosRow) {
                int i23 = 0;
                while (true) {
                    if (i23 >= 4) {
                        r15 = 0;
                        arrayList = null;
                        f5VarArr3[0].a(null, false);
                        t8VarArr[0].e(null, false);
                        break;
                    }
                    if (q8VarArr3[i23].b.h) {
                        arrayList = null;
                        r15 = 0;
                        break;
                    }
                    i23++;
                }
                if (a6Var7.b[x10] <= 2097152) {
                    t8VarArr[r15].e(arrayList, r15);
                }
            }
            FrameLayout frameLayout = new FrameLayout(dataAutoDownloadActivity.getParentActivity());
            frameLayout.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
            linearLayout.addView(frameLayout, w7.b6.o(-1, 52));
            TextView textView2 = new TextView(dataAutoDownloadActivity.getParentActivity());
            textView2.setTextSize(1, 14.0f);
            int i24 = org.telegram.ui.ActionBar.t6.n5;
            org.telegram.ui.ActionBar.a7.V(textView2, i24, null);
            textView2.setGravity(17);
            textView2.setTypeface(org.telegram.messenger.i0.o());
            textView2.setText(org.telegram.messenger.cd.L0(2131752589, null).toUpperCase());
            textView2.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
            frameLayout.addView(textView2, w7.b6.e(-2, 36, 51));
            final l2.f fVar3 = fVar;
            textView2.setOnClickListener(new a(fVar3, 17));
            TextView textView3 = new TextView(dataAutoDownloadActivity.getParentActivity());
            textView3.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.a7.V(textView3, i24, null);
            textView3.setGravity(17);
            textView3.setTypeface(org.telegram.messenger.i0.o());
            textView3.setText(org.telegram.messenger.cd.L0(2131745963, null).toUpperCase());
            textView3.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
            frameLayout.addView(textView3, w7.b6.e(-2, 36, 53));
            final String str6 = str;
            final String str7 = str2;
            final int i25 = i12;
            final int i26 = i15;
            textView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.xt
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    DataAutoDownloadActivity.Z(DataAutoDownloadActivity.this, q8VarArr3, i26, f5VarArr3, x10, t8VarArr, i25, str6, str7, fVar3, view);
                }
            });
            dataAutoDownloadActivity.showDialog((org.telegram.ui.ActionBar.z2) fVar3.b);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.N6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.M6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.g6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.e6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        int i10 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i11 = this.f;
        if (i11 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131753824, null));
        } else if (i11 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131753819, null));
        } else if (i11 == 2) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131753822, null));
        }
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var != null && ((ActionBarLayout) z4Var).S0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new ar(this, 14));
        this.a = new fg.j(9, this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.b = tk0Var;
        tk0Var.r1();
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setSectionsDrawBackground(true);
        ((s4.j) this.b.getItemAnimator()).C = false;
        this.b.setLayoutManager(new s4.a0(1, false));
        frameLayout.addView(this.b, w7.b6.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new tt(this, i10));
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 16, new Class[]{org.telegram.ui.Cells.p4.class, org.telegram.ui.Cells.l5.class, org.telegram.ui.Components.yu0.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.O6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.P6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Q6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.R6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.S6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.T6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{org.telegram.ui.Cells.l5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{org.telegram.ui.Cells.l5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.N6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        p0();
        r0();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onPause() {
        super.onPause();
        if (this.I) {
            org.telegram.messenger.b6.q(this.currentAccount).w(this.f);
            this.I = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        fg.j jVar = this.a;
        if (jVar != null) {
            jVar.f();
        }
    }

    public final void p0() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        org.telegram.messenger.a6 a6Var = this.D;
        arrayList.add(a6Var);
        org.telegram.messenger.a6 a6Var2 = this.E;
        arrayList.add(a6Var2);
        org.telegram.messenger.a6 a6Var3 = this.F;
        arrayList.add(a6Var3);
        org.telegram.messenger.a6 a6Var4 = this.G;
        if (!a6Var4.a(a6Var) && !a6Var4.a(a6Var2) && !a6Var4.a(a6Var3)) {
            arrayList.add(a6Var4);
        }
        Collections.sort(arrayList, new f6(22));
        int i10 = this.e;
        if (i10 == 0 || (i10 == 3 && a6Var4.a(a6Var))) {
            this.d = arrayList.indexOf(a6Var);
        } else {
            int i11 = this.e;
            if (i11 == 1 || (i11 == 3 && a6Var4.a(a6Var2))) {
                this.d = arrayList.indexOf(a6Var2);
            } else {
                int i12 = this.e;
                if (i12 == 2 || (i12 == 3 && a6Var4.a(a6Var3))) {
                    this.d = arrayList.indexOf(a6Var3);
                } else {
                    this.d = arrayList.indexOf(a6Var4);
                }
            }
        }
        org.telegram.ui.Components.tk0 tk0Var = this.b;
        if (tk0Var != null) {
            s4.c1 K = tk0Var.K(this.usageProgressRow);
            if (K != null) {
                View view = K.a;
                if (view instanceof org.telegram.ui.Components.yu0) {
                    q0((org.telegram.ui.Components.yu0) view);
                    return;
                }
            }
            this.a.g(this.usageProgressRow);
        }
    }

    public final void q0(org.telegram.ui.Components.yu0 yu0Var) {
        ArrayList arrayList = this.c;
        String[] strArr = new String[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            org.telegram.messenger.a6 a6Var = (org.telegram.messenger.a6) arrayList.get(i10);
            if (a6Var == this.D) {
                strArr[i10] = org.telegram.messenger.cd.L0(2131753833, null);
            } else if (a6Var == this.E) {
                strArr[i10] = org.telegram.messenger.cd.L0(2131753829, null);
            } else if (a6Var == this.F) {
                strArr[i10] = org.telegram.messenger.cd.L0(2131753834, null);
            } else {
                strArr[i10] = org.telegram.messenger.cd.L0(2131753840, null);
            }
        }
        yu0Var.b(this.d, null, strArr);
    }

    public final void r0() {
        this.autoDownloadRow = 0;
        int i10 = 1 + 1;
        this.y = i10;
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
        this.r = i10;
        this.usageProgressRow = i10 + 1;
        this.s = i10 + 2;
        this.w = i10 + 3;
        this.photosRow = i10 + 4;
        this.videosRow = i10 + 5;
        this.filesRow = i10 + 6;
        this.storiesRow = i10 + 7;
        this.y = i10 + 9;
        this.x = i10 + 8;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
