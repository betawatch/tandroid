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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class DataAutoDownloadActivity extends org.telegram.ui.ActionBar.d2 {
    public final org.telegram.messenger.y5 E;
    public final org.telegram.messenger.y5 F;
    public final org.telegram.messenger.y5 G;
    public final org.telegram.messenger.y5 H;
    public final org.telegram.messenger.y5 I;
    public boolean J;
    public final String K;
    public final String L;
    public n4 a;
    private int autoDownloadRow;
    public org.telegram.ui.Components.tj0 b;
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

    public DataAutoDownloadActivity(int i3) {
        super(null);
        this.c = new ArrayList();
        this.d = 1;
        this.f = i3;
        org.telegram.messenger.y5 y5Var = org.telegram.messenger.z5.q(this.currentAccount).K;
        this.E = y5Var;
        org.telegram.messenger.y5 y5Var2 = org.telegram.messenger.z5.q(this.currentAccount).L;
        this.F = y5Var2;
        org.telegram.messenger.y5 y5Var3 = org.telegram.messenger.z5.q(this.currentAccount).M;
        this.G = y5Var3;
        if (i3 == 0) {
            this.e = org.telegram.messenger.z5.q(this.currentAccount).Q;
            this.H = org.telegram.messenger.z5.q(this.currentAccount).N;
            this.I = y5Var2;
            this.K = "mobilePreset";
            this.L = "currentMobilePreset";
            return;
        }
        if (i3 == 1) {
            this.e = org.telegram.messenger.z5.q(this.currentAccount).R;
            this.H = org.telegram.messenger.z5.q(this.currentAccount).O;
            this.I = y5Var3;
            this.K = "wifiPreset";
            this.L = "currentWifiPreset";
            return;
        }
        this.e = org.telegram.messenger.z5.q(this.currentAccount).S;
        this.H = org.telegram.messenger.z5.q(this.currentAccount).P;
        this.I = y5Var;
        this.K = "roamingPreset";
        this.L = "currentRoamingPreset";
    }

    public static void Z(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.m8 m8Var, org.telegram.ui.Cells.m8[] m8VarArr, int i3, org.telegram.ui.Cells.b5[] b5VarArr, org.telegram.ui.Cells.q8[] q8VarArr, AnimatorSet[] animatorSetArr, View view) {
        if (view.isEnabled()) {
            boolean z10 = true;
            m8Var.setChecked(!m8Var.b.h);
            int i10 = 0;
            while (true) {
                if (i10 >= m8VarArr.length) {
                    z10 = false;
                    break;
                } else if (m8VarArr[i10].b.h) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i3 != dataAutoDownloadActivity.videosRow || b5VarArr[0].isEnabled() == z10) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            b5VarArr[0].a(arrayList, z10);
            if (b5VarArr[0].getSize() > 2097152) {
                q8VarArr[0].e(arrayList, z10);
            }
            AnimatorSet animatorSet = animatorSetArr[0];
            if (animatorSet != null) {
                animatorSet.cancel();
                animatorSetArr[0] = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSetArr[0] = animatorSet2;
            animatorSet2.playTogether(arrayList);
            animatorSetArr[0].addListener(new org.telegram.ui.Cells.w9(animatorSetArr, 21));
            animatorSetArr[0].setDuration(150L);
            animatorSetArr[0].start();
        }
    }

    public static void a0(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.m8[] m8VarArr, int i3, org.telegram.ui.Cells.b5[] b5VarArr, int i10, org.telegram.ui.Cells.q8[] q8VarArr, int i11, String str, String str2, hi.d dVar, View view) {
        org.telegram.messenger.y5 y5Var = dataAutoDownloadActivity.H;
        int i12 = dataAutoDownloadActivity.e;
        if (i12 != 3) {
            if (i12 == 0) {
                y5Var.c(dataAutoDownloadActivity.E);
            } else if (i12 == 1) {
                y5Var.c(dataAutoDownloadActivity.F);
            } else if (i12 == 2) {
                y5Var.c(dataAutoDownloadActivity.G);
            }
        }
        for (int i13 = 0; i13 < 4; i13++) {
            if (m8VarArr[i13].b.h) {
                int[] iArr = y5Var.a;
                iArr[i13] = iArr[i13] | i3;
            } else {
                int[] iArr2 = y5Var.a;
                iArr2[i13] = iArr2[i13] & (~i3);
            }
        }
        org.telegram.ui.Cells.b5 b5Var = b5VarArr[0];
        if (b5Var != null) {
            b5Var.getSize();
            y5Var.b[i10] = (int) b5VarArr[0].getSize();
        }
        org.telegram.ui.Cells.q8 q8Var = q8VarArr[0];
        if (q8Var != null) {
            Switch r9 = q8Var.e;
            if (i11 == dataAutoDownloadActivity.videosRow) {
                y5Var.c = r9.h;
            } else {
                y5Var.d = r9.h;
            }
        }
        SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(dataAutoDownloadActivity.currentAccount).e7.edit();
        edit.putString(str, y5Var.toString());
        dataAutoDownloadActivity.e = 3;
        edit.putInt(str2, 3);
        int i14 = dataAutoDownloadActivity.f;
        if (i14 == 0) {
            org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).Q = dataAutoDownloadActivity.e;
        } else if (i14 == 1) {
            org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).R = dataAutoDownloadActivity.e;
        } else {
            org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).S = dataAutoDownloadActivity.e;
        }
        edit.commit();
        ((org.telegram.ui.ActionBar.t2) dVar.b).y0.run();
        u4.d1 G = dataAutoDownloadActivity.b.G(view);
        if (G != null) {
            dataAutoDownloadActivity.h = true;
            dataAutoDownloadActivity.a.t(G, i11);
            dataAutoDownloadActivity.h = false;
        }
        org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).g();
        dataAutoDownloadActivity.J = true;
        dataAutoDownloadActivity.q0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v9 */
    public static void b0(final DataAutoDownloadActivity dataAutoDownloadActivity, final View view, int i3, float f10) {
        org.telegram.messenger.y5 o10;
        String str;
        String str2;
        boolean z10;
        int i10;
        hi.d dVar;
        final org.telegram.ui.Cells.q8[] q8VarArr;
        ?? r15;
        ArrayList arrayList;
        int i11 = i3;
        org.telegram.messenger.y5 y5Var = dataAutoDownloadActivity.G;
        org.telegram.messenger.y5 y5Var2 = dataAutoDownloadActivity.F;
        org.telegram.messenger.y5 y5Var3 = dataAutoDownloadActivity.E;
        int i12 = dataAutoDownloadActivity.f;
        org.telegram.messenger.y5 y5Var4 = dataAutoDownloadActivity.H;
        org.telegram.ui.ActionBar.e6 e6Var = null;
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
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
            boolean z11 = q8Var.e.h;
            if (z11 || !y5Var4.g) {
                y5Var4.g = !y5Var4.g;
            } else {
                System.arraycopy(dataAutoDownloadActivity.I.a, 0, y5Var4.a, 0, 4);
            }
            view.setTag(Integer.valueOf(y5Var4.g ? org.telegram.ui.ActionBar.k6.f6 : org.telegram.ui.ActionBar.k6.e6));
            boolean z12 = !z11;
            q8Var.b(org.telegram.ui.ActionBar.k6.x0(null, y5Var4.g ? org.telegram.ui.ActionBar.k6.f6 : org.telegram.ui.ActionBar.k6.e6, false), z12);
            dataAutoDownloadActivity.s0();
            if (y5Var4.g) {
                dataAutoDownloadActivity.a.o(dataAutoDownloadActivity.n + 1, 9);
            } else {
                dataAutoDownloadActivity.a.p(dataAutoDownloadActivity.n + 1, 9);
            }
            dataAutoDownloadActivity.a.g(dataAutoDownloadActivity.n);
            SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(dataAutoDownloadActivity.currentAccount).e7.edit();
            edit.putString(dataAutoDownloadActivity.K, y5Var4.toString());
            String str3 = dataAutoDownloadActivity.L;
            dataAutoDownloadActivity.e = 3;
            edit.putInt(str3, 3);
            if (i12 == 0) {
                org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).Q = dataAutoDownloadActivity.e;
            } else if (i12 == 1) {
                org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).R = dataAutoDownloadActivity.e;
            } else {
                org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).S = dataAutoDownloadActivity.e;
            }
            edit.commit();
            q8Var.setChecked(z12);
            org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).g();
            dataAutoDownloadActivity.J = true;
            return;
        }
        if ((i11 == dataAutoDownloadActivity.photosRow || i11 == dataAutoDownloadActivity.videosRow || i11 == dataAutoDownloadActivity.filesRow || i11 == dataAutoDownloadActivity.storiesRow) && view.isEnabled()) {
            int i14 = i11 == dataAutoDownloadActivity.photosRow ? 1 : i11 == dataAutoDownloadActivity.videosRow ? 4 : i11 == dataAutoDownloadActivity.storiesRow ? -1 : 8;
            final int x10 = org.telegram.messenger.z5.x(i14);
            if (i12 == 0) {
                o10 = org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).n();
                str = "mobilePreset";
                str2 = "currentMobilePreset";
            } else if (i12 == 1) {
                o10 = org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).p();
                str = "wifiPreset";
                str2 = "currentWifiPreset";
            } else {
                o10 = org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).o();
                str = "roamingPreset";
                str2 = "currentRoamingPreset";
            }
            org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view;
            boolean z13 = h5Var.e.h;
            if (i11 == dataAutoDownloadActivity.storiesRow || ((org.telegram.messenger.bd.a0 && f10 <= org.telegram.messenger.g0.L(76.0f)) || (!org.telegram.messenger.bd.a0 && f10 >= view.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f)))) {
                org.telegram.messenger.y5 y5Var5 = o10;
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
                            z10 = false;
                            break;
                        } else {
                            if ((y5Var5.a[i17] & i15) != 0) {
                                z10 = true;
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
                        if (z13) {
                            iArr[i18] = iArr[i18] & (~i15);
                        } else if (!z10) {
                            iArr[i18] = iArr[i18] | i15;
                        }
                        i18++;
                    }
                } else {
                    y5Var4.e = !z13;
                }
                SharedPreferences.Editor edit2 = org.telegram.messenger.hp.s1(dataAutoDownloadActivity.currentAccount).e7.edit();
                edit2.putString(str4, y5Var4.toString());
                dataAutoDownloadActivity.e = 3;
                edit2.putInt(str5, 3);
                if (i12 == 0) {
                    org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).Q = dataAutoDownloadActivity.e;
                } else if (i12 == 1) {
                    org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).R = dataAutoDownloadActivity.e;
                } else {
                    org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).S = dataAutoDownloadActivity.e;
                }
                edit2.commit();
                h5Var.setChecked(!z13);
                org.telegram.ui.Components.tj0 tj0Var = dataAutoDownloadActivity.b;
                View F = tj0Var.F(view);
                u4.d1 T = F == null ? null : tj0Var.T(F);
                if (T != null) {
                    dataAutoDownloadActivity.a.t(T, i11);
                }
                org.telegram.messenger.z5.q(dataAutoDownloadActivity.currentAccount).g();
                dataAutoDownloadActivity.J = true;
                dataAutoDownloadActivity.q0();
                return;
            }
            if (dataAutoDownloadActivity.getParentActivity() == null) {
                return;
            }
            hi.d dVar2 = new hi.d(dataAutoDownloadActivity.getParentActivity(), (org.telegram.ui.ActionBar.e6) null);
            org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) dVar2.b;
            t2Var.v0 = false;
            t2Var.w0 = false;
            LinearLayout linearLayout = new LinearLayout(dataAutoDownloadActivity.getParentActivity());
            linearLayout.setOrientation(1);
            ((org.telegram.ui.ActionBar.t2) dVar2.b).O = linearLayout;
            org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(dataAutoDownloadActivity.getParentActivity(), org.telegram.ui.ActionBar.k6.n5, 21, 15, false, null);
            if (i11 == dataAutoDownloadActivity.photosRow) {
                n4Var.setText(org.telegram.messenger.bd.M0(2131753815, null));
            } else if (i11 == dataAutoDownloadActivity.videosRow) {
                n4Var.setText(org.telegram.messenger.bd.M0(2131753804, null));
            } else {
                n4Var.setText(org.telegram.messenger.bd.M0(2131753836, null));
            }
            linearLayout.addView(n4Var, b8.mf.c(-2.0f, -1));
            org.telegram.ui.Cells.b5[] b5VarArr = new org.telegram.ui.Cells.b5[1];
            org.telegram.ui.Cells.q8[] q8VarArr2 = new org.telegram.ui.Cells.q8[1];
            AnimatorSet[] animatorSetArr = new AnimatorSet[1];
            int i19 = 4;
            org.telegram.ui.Cells.m8[] m8VarArr = new org.telegram.ui.Cells.m8[4];
            int i20 = 0;
            while (true) {
                i10 = 16;
                if (i20 >= i19) {
                    break;
                }
                Activity parentActivity = dataAutoDownloadActivity.getParentActivity();
                org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(parentActivity);
                boolean z14 = org.telegram.messenger.bd.a0;
                TextView textView = new TextView(parentActivity);
                m8Var.a = textView;
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, e6Var);
                org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                textView.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 16);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                m8Var.addView(textView, b8.mf.d(-1, -1.0f, (z14 ? 5 : 3) | 48, z14 ? 66.0f : 21.0f, 0.0f, z14 ? 21.0f : 66.0f, 0.0f));
                CheckBoxSquare checkBoxSquare = new CheckBoxSquare(parentActivity, null, true);
                m8Var.b = checkBoxSquare;
                checkBoxSquare.setDuplicateParentStateEnabled(false);
                checkBoxSquare.setFocusable(false);
                checkBoxSquare.setFocusableInTouchMode(false);
                checkBoxSquare.setClickable(false);
                m8Var.addView(checkBoxSquare, b8.mf.d(18, 18.0f, (z14 ? 3 : 5) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
                m8VarArr[i20] = m8Var;
                if (i20 == 0) {
                    m8Var.a(org.telegram.messenger.bd.M0(2131753776, null), (o10.a[0] & i14) != 0, true);
                } else if (i20 == 1) {
                    m8Var.a(org.telegram.messenger.bd.M0(2131753774, null), (o10.a[1] & i14) != 0, true);
                } else if (i20 == 2) {
                    m8Var.a(org.telegram.messenger.bd.M0(2131753775, null), (o10.a[2] & i14) != 0, true);
                } else {
                    m8Var.a(org.telegram.messenger.bd.M0(2131753777, null), (o10.a[3] & i14) != 0, i11 != dataAutoDownloadActivity.photosRow);
                }
                m8VarArr[i20].setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
                org.telegram.ui.Cells.m8 m8Var2 = m8VarArr[i20];
                org.telegram.messenger.y5 y5Var6 = o10;
                AnimatorSet[] animatorSetArr2 = animatorSetArr;
                org.telegram.ui.Cells.b5[] b5VarArr2 = b5VarArr;
                int i21 = i11;
                org.telegram.ui.Cells.m8[] m8VarArr2 = m8VarArr;
                ci.ia iaVar = new ci.ia(dataAutoDownloadActivity, m8Var, m8VarArr2, i21, b5VarArr2, q8VarArr2, animatorSetArr2);
                i11 = i21;
                animatorSetArr = animatorSetArr2;
                m8Var2.setOnClickListener(iaVar);
                linearLayout.addView(m8VarArr2[i20], b8.mf.c(50.0f, -1));
                i20++;
                b5VarArr = b5VarArr2;
                o10 = y5Var6;
                m8VarArr = m8VarArr2;
                i19 = 4;
                e6Var = null;
            }
            final org.telegram.ui.Cells.m8[] m8VarArr3 = m8VarArr;
            org.telegram.messenger.y5 y5Var7 = o10;
            final org.telegram.ui.Cells.b5[] b5VarArr3 = b5VarArr;
            if (i11 != dataAutoDownloadActivity.photosRow) {
                org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(dataAutoDownloadActivity.getParentActivity());
                ts tsVar = new ts(dataAutoDownloadActivity, dataAutoDownloadActivity.getParentActivity(), i11, y8Var, q8VarArr2, animatorSetArr);
                org.telegram.ui.Cells.q8[] q8VarArr3 = q8VarArr2;
                b5VarArr3[0] = tsVar;
                tsVar.setSize(y5Var7.b[x10]);
                linearLayout.addView(b5VarArr3[0], b8.mf.o(-1, 50));
                View q8Var2 = new org.telegram.ui.Cells.q8(21, dataAutoDownloadActivity.getParentActivity(), null, true);
                q8VarArr3[0] = q8Var2;
                linearLayout.addView(q8Var2, b8.mf.o(-1, 48));
                q8VarArr3[0].setOnClickListener(new a(q8VarArr3, i10));
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, y8Var, null);
                linearLayout.addView(y8Var, b8.mf.o(-1, -2));
                i11 = i3;
                if (i11 == dataAutoDownloadActivity.videosRow) {
                    b5VarArr3[0].setText(org.telegram.messenger.bd.M0(2131753831, null));
                    q8VarArr3[0].f(org.telegram.messenger.bd.M0(2131753811, null), y5Var7.c, false);
                    dVar = dVar2;
                    y8Var.setText(org.telegram.messenger.bd.a0("AutoDownloadPreloadVideoInfo", null, 2131753810, org.telegram.messenger.g0.i0(y5Var7.b[x10], false, false)));
                    q8VarArr = q8VarArr3;
                } else {
                    dVar = dVar2;
                    b5VarArr3[0].setText(org.telegram.messenger.bd.M0(2131753832, null));
                    q8VarArr3[0].f(org.telegram.messenger.bd.M0(2131753813, null), y5Var7.d, false);
                    y8Var.setText(org.telegram.messenger.bd.M0(2131753812, null));
                    q8VarArr = q8VarArr3;
                }
            } else {
                dVar = dVar2;
                b5VarArr3[0] = null;
                q8VarArr2[0] = null;
                View view2 = new View(dataAutoDownloadActivity.getParentActivity());
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d7, view2, null);
                linearLayout.addView(view2, new LinearLayout.LayoutParams(-1, 1));
                q8VarArr = q8VarArr2;
            }
            if (i11 == dataAutoDownloadActivity.videosRow) {
                int i22 = 0;
                while (true) {
                    if (i22 >= 4) {
                        r15 = 0;
                        arrayList = null;
                        b5VarArr3[0].a(null, false);
                        q8VarArr[0].e(null, false);
                        break;
                    }
                    if (m8VarArr3[i22].b.h) {
                        arrayList = null;
                        r15 = 0;
                        break;
                    }
                    i22++;
                }
                if (y5Var7.b[x10] <= 2097152) {
                    q8VarArr[r15].e(arrayList, r15);
                }
            }
            FrameLayout frameLayout = new FrameLayout(dataAutoDownloadActivity.getParentActivity());
            frameLayout.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            linearLayout.addView(frameLayout, b8.mf.o(-1, 52));
            TextView textView2 = new TextView(dataAutoDownloadActivity.getParentActivity());
            textView2.setTextSize(1, 14.0f);
            int i23 = org.telegram.ui.ActionBar.k6.n5;
            org.telegram.ui.ActionBar.r6.V(textView2, i23, null);
            textView2.setGravity(17);
            textView2.setTypeface(org.telegram.messenger.g0.o());
            textView2.setText(org.telegram.messenger.bd.M0(2131752589, null).toUpperCase());
            textView2.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
            frameLayout.addView(textView2, b8.mf.e(-2, 36, 51));
            final hi.d dVar3 = dVar;
            textView2.setOnClickListener(new a(dVar3, 17));
            TextView textView3 = new TextView(dataAutoDownloadActivity.getParentActivity());
            textView3.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.r6.V(textView3, i23, null);
            textView3.setGravity(17);
            textView3.setTypeface(org.telegram.messenger.g0.o());
            textView3.setText(org.telegram.messenger.bd.M0(2131745956, null).toUpperCase());
            textView3.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
            frameLayout.addView(textView3, b8.mf.e(-2, 36, 53));
            final String str6 = str;
            final String str7 = str2;
            final int i24 = i11;
            final int i25 = i14;
            textView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ss
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    DataAutoDownloadActivity.a0(DataAutoDownloadActivity.this, m8VarArr3, i25, b5VarArr3, x10, q8VarArr, i24, str6, str7, dVar3, view);
                }
            });
            dataAutoDownloadActivity.showDialog((org.telegram.ui.ActionBar.t2) dVar3.b);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
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

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i3 = 2;
        int i10 = this.f;
        if (i10 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131753824, null));
        } else if (i10 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131753819, null));
        } else if (i10 == 2) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131753822, null));
        }
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new o9(this, 24));
        this.a = new n4(8, this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.b = tj0Var;
        tj0Var.r1();
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setSectionsDrawBackground(true);
        ((u4.k) this.b.getItemAnimator()).C = false;
        this.b.setLayoutManager(new u4.b0(1, false));
        frameLayout.addView(this.b, b8.mf.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new ur(this, i3));
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 16, new Class[]{org.telegram.ui.Cells.n4.class, org.telegram.ui.Cells.h5.class, org.telegram.ui.Components.ut0.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.O6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.P6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Q6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.R6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.S6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.T6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        q0();
        s0();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onPause() {
        super.onPause();
        if (this.J) {
            org.telegram.messenger.z5.q(this.currentAccount).w(this.f);
            this.J = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        n4 n4Var = this.a;
        if (n4Var != null) {
            n4Var.f();
        }
    }

    public final void q0() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        org.telegram.messenger.y5 y5Var = this.E;
        arrayList.add(y5Var);
        org.telegram.messenger.y5 y5Var2 = this.F;
        arrayList.add(y5Var2);
        org.telegram.messenger.y5 y5Var3 = this.G;
        arrayList.add(y5Var3);
        org.telegram.messenger.y5 y5Var4 = this.H;
        if (!y5Var4.a(y5Var) && !y5Var4.a(y5Var2) && !y5Var4.a(y5Var3)) {
            arrayList.add(y5Var4);
        }
        Collections.sort(arrayList, new org.telegram.ui.Components.d80(10));
        int i3 = this.e;
        if (i3 == 0 || (i3 == 3 && y5Var4.a(y5Var))) {
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
        org.telegram.ui.Components.tj0 tj0Var = this.b;
        if (tj0Var != null) {
            u4.d1 K = tj0Var.K(this.usageProgressRow);
            if (K != null) {
                View view = K.a;
                if (view instanceof org.telegram.ui.Components.ut0) {
                    r0((org.telegram.ui.Components.ut0) view);
                    return;
                }
            }
            this.a.g(this.usageProgressRow);
        }
    }

    public final void r0(org.telegram.ui.Components.ut0 ut0Var) {
        ArrayList arrayList = this.c;
        String[] strArr = new String[arrayList.size()];
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            org.telegram.messenger.y5 y5Var = (org.telegram.messenger.y5) arrayList.get(i3);
            if (y5Var == this.E) {
                strArr[i3] = org.telegram.messenger.bd.M0(2131753833, null);
            } else if (y5Var == this.F) {
                strArr[i3] = org.telegram.messenger.bd.M0(2131753829, null);
            } else if (y5Var == this.G) {
                strArr[i3] = org.telegram.messenger.bd.M0(2131753834, null);
            } else {
                strArr[i3] = org.telegram.messenger.bd.M0(2131753840, null);
            }
        }
        ut0Var.b(this.d, null, strArr);
    }

    public final void s0() {
        this.autoDownloadRow = 0;
        int i3 = 1 + 1;
        this.y = i3;
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
        this.r = i3;
        this.usageProgressRow = i3 + 1;
        this.s = i3 + 2;
        this.w = i3 + 3;
        this.photosRow = i3 + 4;
        this.videosRow = i3 + 5;
        this.filesRow = i3 + 6;
        this.storiesRow = i3 + 7;
        this.y = i3 + 9;
        this.x = i3 + 8;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
