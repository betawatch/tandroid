package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.Settings;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class kx0 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public FrameLayout a;
    public boolean a0;
    public org.telegram.ui.Components.qj0 b;
    public boolean b0;
    public ix0 c;
    public AnimatorSet d;
    public final org.telegram.ui.ActionBar.g6 e;
    public final long f;
    public final long h;
    public final boolean n;
    public boolean r;
    public jx0 s;
    public org.telegram.ui.Components.kn w;
    public int x;
    public int y;

    public kx0(Bundle bundle, org.telegram.ui.ActionBar.g6 g6Var) {
        super(bundle);
        this.e = g6Var;
        this.f = bundle.getLong("dialog_id");
        this.h = bundle.getLong("topic_id");
        this.n = bundle.getBoolean("exception", false);
    }

    public static void Z(kx0 kx0Var, String str, int i7, int i10) {
        org.telegram.messenger.qp.s1(kx0Var.currentAccount).d7.edit().putInt("smart_max_count_" + str, i7).putInt("smart_delay_" + str, i10).apply();
        ix0 ix0Var = kx0Var.c;
        if (ix0Var != null) {
            ix0Var.g(kx0Var.I);
        }
    }

    public static void a0(final kx0 kx0Var, Context context, String str, View view, int i7) {
        org.telegram.ui.ActionBar.g6 g6Var = kx0Var.e;
        if (view.isEnabled()) {
            final int i10 = 0;
            Parcelable parcelable = null;
            if (i7 == kx0Var.X) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, g6Var);
                String M0 = org.telegram.messenger.id.M0(2131746102, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.id.M0(2131746103, null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746118, null), new fx0(kx0Var, str));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                kx0Var.showDialog(u1Var);
                TextView textView = (TextView) u1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.q7, null);
                    return;
                }
                return;
            }
            if (i7 == kx0Var.G) {
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", kx0Var.f);
                bundle.putLong("topic_id", kx0Var.h);
                kx0Var.presentFragment(new uh0(bundle, g6Var));
                return;
            }
            final int i11 = 1;
            if (i7 == kx0Var.R) {
                try {
                    Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                    intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                    intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                    SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(kx0Var.currentAccount).d7;
                    Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
                    String path = uri != null ? uri.getPath() : null;
                    String string = sharedPreferences.getString("ringtone_path_" + str, path);
                    if (string != null && !string.equals("NoSound")) {
                        parcelable = string.equals(path) ? uri : Uri.parse(string);
                    }
                    intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", parcelable);
                    kx0Var.startActivityForResult(intent, 13);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            }
            if (i7 == kx0Var.H) {
                Activity parentActivity = kx0Var.getParentActivity();
                long j3 = kx0Var.f;
                long j10 = kx0Var.h;
                Runnable runnable = new Runnable(kx0Var) { // from class: org.telegram.ui.gx0
                    public final /* synthetic */ kx0 b;

                    {
                        this.b = kx0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                kx0 kx0Var2 = this.b;
                                ix0 ix0Var = kx0Var2.c;
                                if (ix0Var != null) {
                                    ix0Var.g(kx0Var2.H);
                                    break;
                                }
                                break;
                            case 1:
                                kx0 kx0Var3 = this.b;
                                ix0 ix0Var2 = kx0Var3.c;
                                if (ix0Var2 != null) {
                                    ix0Var2.g(kx0Var3.S);
                                    break;
                                }
                                break;
                            case 2:
                                kx0 kx0Var4 = this.b;
                                ix0 ix0Var3 = kx0Var4.c;
                                if (ix0Var3 != null) {
                                    ix0Var3.g(kx0Var4.J);
                                    break;
                                }
                                break;
                            default:
                                kx0 kx0Var5 = this.b;
                                ix0 ix0Var4 = kx0Var5.c;
                                if (ix0Var4 != null) {
                                    ix0Var4.g(kx0Var5.V);
                                    break;
                                }
                                break;
                        }
                    }
                };
                org.telegram.ui.ActionBar.g6 g6Var2 = kx0Var.e;
                Pattern pattern = org.telegram.ui.Components.v4.a;
                kx0Var.showDialog(org.telegram.ui.Components.v4.V(parentActivity, j3, j10, j3 != 0 ? a8.p0.o(j3, "vibrate_") : "vibrate_messages", runnable, g6Var2));
                return;
            }
            final int i12 = 3;
            if (i7 == kx0Var.E) {
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                boolean z9 = !r8Var.e.h;
                kx0Var.r = z9;
                r8Var.setChecked(z9);
                int childCount = kx0Var.b.getChildCount();
                ArrayList arrayList = new ArrayList();
                while (i10 < childCount) {
                    org.telegram.ui.Components.yi0 yi0Var = (org.telegram.ui.Components.yi0) kx0Var.b.T(kx0Var.b.getChildAt(i10));
                    int i13 = yi0Var.f;
                    View view2 = yi0Var.a;
                    int b10 = yi0Var.b();
                    if (b10 != kx0Var.E && b10 != kx0Var.X) {
                        if (i13 == 0) {
                            ((org.telegram.ui.Cells.n4) view2).a(arrayList, kx0Var.r);
                        } else if (i13 == 1) {
                            ((org.telegram.ui.Cells.w9) view2).a(arrayList, kx0Var.r);
                        } else if (i13 == 2) {
                            ((org.telegram.ui.Cells.z8) view2).c(arrayList, kx0Var.r);
                        } else if (i13 == 3) {
                            ((org.telegram.ui.Cells.t8) view2).a(arrayList, kx0Var.r);
                        } else if (i13 == 4) {
                            ((org.telegram.ui.Cells.i6) view2).b(arrayList, kx0Var.r);
                        } else if (i13 == 7 && b10 == kx0Var.F) {
                            ((org.telegram.ui.Cells.r8) view2).e(arrayList, kx0Var.r);
                        }
                    }
                    i10++;
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                AnimatorSet animatorSet = kx0Var.d;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                kx0Var.d = animatorSet2;
                animatorSet2.playTogether(arrayList);
                kx0Var.d.addListener(new f30(kx0Var, 23));
                kx0Var.d.setDuration(150L);
                kx0Var.d.start();
                return;
            }
            if (i7 == kx0Var.F) {
                org.telegram.ui.Cells.r8 r8Var2 = (org.telegram.ui.Cells.r8) view;
                Switch r32 = r8Var2.e;
                org.telegram.messenger.qp.s1(kx0Var.currentAccount).d7.edit().putBoolean(rf.b.i("content_preview_", str), !r32.h).apply();
                r8Var2.setChecked(!r32.h);
                return;
            }
            if (i7 == kx0Var.S) {
                kx0Var.showDialog(org.telegram.ui.Components.v4.V(kx0Var.getParentActivity(), kx0Var.f, kx0Var.h, rf.b.i("calls_vibrate_", str), new Runnable(kx0Var) { // from class: org.telegram.ui.gx0
                    public final /* synthetic */ kx0 b;

                    {
                        this.b = kx0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                kx0 kx0Var2 = this.b;
                                ix0 ix0Var = kx0Var2.c;
                                if (ix0Var != null) {
                                    ix0Var.g(kx0Var2.H);
                                    break;
                                }
                                break;
                            case 1:
                                kx0 kx0Var3 = this.b;
                                ix0 ix0Var2 = kx0Var3.c;
                                if (ix0Var2 != null) {
                                    ix0Var2.g(kx0Var3.S);
                                    break;
                                }
                                break;
                            case 2:
                                kx0 kx0Var4 = this.b;
                                ix0 ix0Var3 = kx0Var4.c;
                                if (ix0Var3 != null) {
                                    ix0Var3.g(kx0Var4.J);
                                    break;
                                }
                                break;
                            default:
                                kx0 kx0Var5 = this.b;
                                ix0 ix0Var4 = kx0Var5.c;
                                if (ix0Var4 != null) {
                                    ix0Var4.g(kx0Var5.V);
                                    break;
                                }
                                break;
                        }
                    }
                }, kx0Var.e));
                return;
            }
            if (i7 == kx0Var.J) {
                kx0Var.showDialog(org.telegram.ui.Components.v4.F(kx0Var.getParentActivity(), kx0Var.f, kx0Var.h, -1, new Runnable(kx0Var) { // from class: org.telegram.ui.gx0
                    public final /* synthetic */ kx0 b;

                    {
                        this.b = kx0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (r2) {
                            case 0:
                                kx0 kx0Var2 = this.b;
                                ix0 ix0Var = kx0Var2.c;
                                if (ix0Var != null) {
                                    ix0Var.g(kx0Var2.H);
                                    break;
                                }
                                break;
                            case 1:
                                kx0 kx0Var3 = this.b;
                                ix0 ix0Var2 = kx0Var3.c;
                                if (ix0Var2 != null) {
                                    ix0Var2.g(kx0Var3.S);
                                    break;
                                }
                                break;
                            case 2:
                                kx0 kx0Var4 = this.b;
                                ix0 ix0Var3 = kx0Var4.c;
                                if (ix0Var3 != null) {
                                    ix0Var3.g(kx0Var4.J);
                                    break;
                                }
                                break;
                            default:
                                kx0 kx0Var5 = this.b;
                                ix0 ix0Var4 = kx0Var5.c;
                                if (ix0Var4 != null) {
                                    ix0Var4.g(kx0Var5.V);
                                    break;
                                }
                                break;
                        }
                    }
                }, kx0Var.e));
                return;
            }
            if (i7 != kx0Var.I) {
                if (i7 == kx0Var.V) {
                    if (kx0Var.getParentActivity() == null) {
                        return;
                    }
                    kx0Var.showDialog(org.telegram.ui.Components.v4.t(kx0Var.getParentActivity(), kx0Var.f, kx0Var.h, -1, new Runnable(kx0Var) { // from class: org.telegram.ui.gx0
                        public final /* synthetic */ kx0 b;

                        {
                            this.b = kx0Var;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i12) {
                                case 0:
                                    kx0 kx0Var2 = this.b;
                                    ix0 ix0Var = kx0Var2.c;
                                    if (ix0Var != null) {
                                        ix0Var.g(kx0Var2.H);
                                        break;
                                    }
                                    break;
                                case 1:
                                    kx0 kx0Var3 = this.b;
                                    ix0 ix0Var2 = kx0Var3.c;
                                    if (ix0Var2 != null) {
                                        ix0Var2.g(kx0Var3.S);
                                        break;
                                    }
                                    break;
                                case 2:
                                    kx0 kx0Var4 = this.b;
                                    ix0 ix0Var3 = kx0Var4.c;
                                    if (ix0Var3 != null) {
                                        ix0Var3.g(kx0Var4.J);
                                        break;
                                    }
                                    break;
                                default:
                                    kx0 kx0Var5 = this.b;
                                    ix0 ix0Var4 = kx0Var5.c;
                                    if (ix0Var4 != null) {
                                        ix0Var4.g(kx0Var5.V);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, kx0Var.e));
                    return;
                }
                if (i7 == kx0Var.M) {
                    org.telegram.messenger.qp.s1(kx0Var.currentAccount).d7.edit().putInt("popup_" + str, 1).apply();
                    ((org.telegram.ui.Cells.i6) view).a(true, true);
                    View findViewWithTag = kx0Var.b.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((org.telegram.ui.Cells.i6) findViewWithTag).a(false, true);
                        return;
                    }
                    return;
                }
                if (i7 == kx0Var.N) {
                    org.telegram.messenger.qp.s1(kx0Var.currentAccount).d7.edit().putInt("popup_" + str, 2).apply();
                    ((org.telegram.ui.Cells.i6) view).a(true, true);
                    View findViewWithTag2 = kx0Var.b.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((org.telegram.ui.Cells.i6) findViewWithTag2).a(false, true);
                        return;
                    }
                    return;
                }
                if (i7 == kx0Var.P) {
                    org.telegram.ui.Cells.r8 r8Var3 = (org.telegram.ui.Cells.r8) view;
                    boolean z10 = r8Var3.e.h;
                    boolean z11 = !z10;
                    r8Var3.setChecked(z11);
                    SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(kx0Var.currentAccount).d7.edit();
                    if (!kx0Var.a0 || z10) {
                        edit.putBoolean("stories_" + str, z11);
                    } else {
                        edit.remove("stories_" + str);
                    }
                    edit.apply();
                    kx0Var.getNotificationsController().c0(kx0Var.f, kx0Var.h, true);
                    return;
                }
                return;
            }
            if (kx0Var.getParentActivity() == null) {
                return;
            }
            SharedPreferences sharedPreferences2 = org.telegram.messenger.qp.s1(kx0Var.currentAccount).d7;
            int c10 = org.telegram.messenger.k5.c("smart_max_count_", str, sharedPreferences2, 2);
            int c11 = org.telegram.messenger.k5.c("smart_delay_", str, sharedPreferences2, org.telegram.messenger.qs.K2);
            r9 = c10 != 0 ? c10 : 2;
            Activity parentActivity2 = kx0Var.getParentActivity();
            fx0 fx0Var = new fx0(kx0Var, str);
            Pattern pattern2 = org.telegram.ui.Components.v4.a;
            if (parentActivity2 == null) {
                return;
            }
            int i14 = org.telegram.ui.ActionBar.l6.j5;
            int f10 = g6Var != null ? g6Var.f(i14) : org.telegram.ui.ActionBar.l6.x0(null, i14, false);
            int i15 = org.telegram.ui.ActionBar.l6.h5;
            int f11 = g6Var != null ? g6Var.f(i15) : org.telegram.ui.ActionBar.l6.x0(null, i15, false);
            int i16 = org.telegram.ui.ActionBar.l6.xj;
            if (g6Var != null) {
                g6Var.f(i16);
            } else {
                org.telegram.ui.ActionBar.l6.x0(null, i16, false);
            }
            int i17 = org.telegram.ui.ActionBar.l6.Bj;
            if (g6Var != null) {
                g6Var.f(i17);
            } else {
                org.telegram.ui.ActionBar.l6.x0(null, i17, false);
            }
            int i18 = org.telegram.ui.ActionBar.l6.E8;
            if (g6Var != null) {
                g6Var.f(i18);
            } else {
                org.telegram.ui.ActionBar.l6.x0(null, i18, false);
            }
            int i19 = org.telegram.ui.ActionBar.l6.G8;
            if (g6Var != null) {
                g6Var.f(i19);
            } else {
                org.telegram.ui.ActionBar.l6.x0(null, i19, false);
            }
            int i20 = org.telegram.ui.ActionBar.l6.i6;
            if (g6Var != null) {
                g6Var.f(i20);
            } else {
                org.telegram.ui.ActionBar.l6.x0(null, i20, false);
            }
            int i21 = org.telegram.ui.ActionBar.l6.Gi;
            int f12 = g6Var != null ? g6Var.f(i21) : org.telegram.ui.ActionBar.l6.x0(null, i21, false);
            int i22 = org.telegram.ui.ActionBar.l6.Ci;
            int f13 = g6Var != null ? g6Var.f(i22) : org.telegram.ui.ActionBar.l6.x0(null, i22, false);
            int i23 = org.telegram.ui.ActionBar.l6.Ei;
            int f14 = g6Var != null ? g6Var.f(i23) : org.telegram.ui.ActionBar.l6.x0(null, i23, false);
            h9.f1 f1Var = new h9.f1(parentActivity2, g6Var);
            ((org.telegram.ui.ActionBar.v2) f1Var.b).v0 = false;
            org.telegram.ui.Components.g4 g4Var = new org.telegram.ui.Components.g4(parentActivity2, g6Var);
            g4Var.setMinValue(0);
            g4Var.setMaxValue(10);
            g4Var.setTextColor(f10);
            g4Var.setValue(r9 - 1);
            g4Var.setWrapSelectorWheel(false);
            g4Var.setFormatter(new br(20));
            org.telegram.ui.Components.h4 h4Var = new org.telegram.ui.Components.h4(parentActivity2, g6Var);
            h4Var.setMinValue(0);
            h4Var.setMaxValue(10);
            h4Var.setTextColor(f10);
            h4Var.setValue((c11 / 60) - 1);
            h4Var.setWrapSelectorWheel(false);
            h4Var.setFormatter(new br(21));
            org.telegram.ui.Components.ib0 ib0Var = new org.telegram.ui.Components.ib0(parentActivity2, g6Var);
            ib0Var.setMinValue(0);
            ib0Var.setMaxValue(0);
            ib0Var.setTextColor(f10);
            ib0Var.setValue(0);
            ib0Var.setWrapSelectorWheel(false);
            ib0Var.setFormatter(new br(22));
            org.telegram.ui.Components.p3 p3Var = new org.telegram.ui.Components.p3(parentActivity2, g4Var, h4Var, ib0Var, 5);
            p3Var.setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(parentActivity2);
            p3Var.addView(frameLayout, c8.ha.t(-1, -2, 51, 22, 0, 0, 4));
            TextView textView2 = new TextView(parentActivity2);
            textView2.setText(org.telegram.messenger.id.M0(2131748120, null));
            textView2.setTextColor(f10);
            com.google.android.recaptcha.internal.a.q(textView2, 1, 20.0f);
            frameLayout.addView(textView2, c8.ha.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
            textView2.setOnTouchListener(new ei.b(10));
            LinearLayout linearLayout = new LinearLayout(parentActivity2);
            linearLayout.setOrientation(0);
            linearLayout.setWeightSum(1.0f);
            p3Var.addView(linearLayout, c8.ha.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
            bi.md mdVar = new bi.md(parentActivity2, 18);
            linearLayout.addView(g4Var, c8.ha.l(0.4f, 0, org.telegram.messenger.qs.t4));
            linearLayout.addView(ib0Var, c8.ha.p(0, -2, 0.2f, 16));
            linearLayout.addView(h4Var, c8.ha.l(0.4f, 0, org.telegram.messenger.qs.t4));
            mdVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
            mdVar.setGravity(17);
            mdVar.setTextColor(f12);
            mdVar.setTextSize(1, 14.0f);
            mdVar.setTypeface(org.telegram.messenger.g0.o());
            int L = org.telegram.messenger.g0.L(8.0f);
            mdVar.setBackgroundDrawable(org.telegram.ui.ActionBar.l6.k0(L, L, L, L, f13, f14, f14));
            mdVar.setText(org.telegram.messenger.id.M0(2131753866, null));
            p3Var.addView(mdVar, c8.ha.t(-1, 48, 83, 16, 15, 16, 16));
            br brVar = new br(6);
            g4Var.setOnValueChangedListener(brVar);
            h4Var.setOnValueChangedListener(brVar);
            mdVar.setOnClickListener(new di.v3(g4Var, h4Var, fx0Var, f1Var, 7));
            org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) f1Var.b;
            v2Var.N = p3Var;
            v2Var.show();
            v2Var.v0(f11);
            v2Var.O(f11);
        }
    }

    public static void b0(kx0 kx0Var, String str) {
        kx0Var.b0 = true;
        org.telegram.messenger.qp.s1(kx0Var.currentAccount).d7.edit().putBoolean("custom_" + str, false).remove("notify2_" + str).apply();
        kx0Var.finishFragment();
        jx0 jx0Var = kx0Var.s;
        if (jx0Var != null) {
            jx0Var.c0();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.d6));
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        long j3 = this.f;
        long j10 = this.h;
        String v = org.telegram.messenger.dt.v(j3, j10, false);
        this.simpleActionBar.setActionBarMenuOnItemClick(new hx0(this, v));
        org.telegram.ui.ActionBar.g6 g6Var = this.e;
        org.telegram.ui.Components.kn knVar = new org.telegram.ui.Components.kn(context, null, false, g6Var);
        this.w = knVar;
        knVar.setOccupyStatusBar(!org.telegram.messenger.g0.Q1());
        if (j3 >= 0) {
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j3));
            if (a22 != null) {
                this.w.setUserAvatar(a22);
                this.simpleActionBar.setTitle(org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
            }
        } else if (j10 != 0) {
            TLRPC.TL_forumTopic f10 = getMessagesController().q7.f(-j3, j10);
            qg.d.p(this.w.getAvatarImageView(), f10, false, true, g6Var);
            this.simpleActionBar.setTitle(f10.title);
        } else {
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j3));
            this.w.setChatAvatar(M0);
            this.simpleActionBar.setTitle(M0.title);
        }
        if (this.n) {
            this.simpleActionBar.setSubtitle(org.telegram.messenger.id.M0(2131747895, null));
            this.simpleActionBar.o(org.telegram.messenger.id.M0(2131745946, null));
        } else {
            this.simpleActionBar.setSubtitle(org.telegram.messenger.id.M0(2131751684, null));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.qj0 qj0Var = new org.telegram.ui.Components.qj0(context, null);
        this.b = qj0Var;
        qj0Var.r1();
        this.b.setSectionsDrawBackground(true);
        frameLayout.addView(this.b, c8.ha.c(-1.0f, -1));
        org.telegram.ui.Components.qj0 qj0Var2 = this.b;
        ix0 ix0Var = new ix0(this, context);
        this.c = ix0Var;
        qj0Var2.setAdapter(ix0Var);
        this.b.setItemAnimator(null);
        this.b.setLayoutAnimation(null);
        this.b.setLayoutManager(new jg.b0(17));
        this.b.setOnItemClickListener(new a61(this, context, v, i7));
        this.a = frameLayout;
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f0) {
            try {
                this.c.f();
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.Components.qj0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.ActionBar.g6 getResourceProvider() {
        return this.e;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(19, this);
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.b, 0, new Class[]{org.telegram.ui.Cells.oa.class}, new String[]{"statusColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.l6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.b, 0, new Class[]{org.telegram.ui.Cells.oa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.l6.n6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        Ringtone ringtone;
        if (i10 != -1 || intent == null) {
            return;
        }
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
        String str = null;
        if (uri != null && (ringtone = RingtoneManager.getRingtone(org.telegram.messenger.t0.b, uri)) != null) {
            str = i7 == 13 ? uri.equals(Settings.System.DEFAULT_RINGTONE_URI) ? org.telegram.messenger.id.M0(2131751599, null) : ringtone.getTitle(getParentActivity()) : uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI) ? org.telegram.messenger.id.M0(2131745280, null) : ringtone.getTitle(getParentActivity());
            ringtone.stop();
        }
        SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(this.currentAccount).d7.edit();
        String v = org.telegram.messenger.dt.v(this.f, this.h, false);
        if (i7 == 12) {
            if (str != null) {
                edit.putString("sound_" + v, str);
                edit.putString("sound_path_" + v, uri.toString());
            } else {
                edit.putString("sound_" + v, "NoSound");
                edit.putString("sound_path_" + v, "NoSound");
            }
            getNotificationsController().l(this.f, this.h);
        } else if (i7 == 13) {
            if (str != null) {
                edit.putString("ringtone_" + v, str);
                edit.putString("ringtone_path_" + v, uri.toString());
            } else {
                edit.putString("ringtone_" + v, "NoSound");
                edit.putString("ringtone_path_" + v, "NoSound");
            }
        }
        edit.apply();
        ix0 ix0Var = this.c;
        if (ix0Var != null) {
            ix0Var.g(i7 == 13 ? this.R : this.G);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010f  */
    @Override // org.telegram.ui.ActionBar.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        boolean z9;
        long j3 = this.f;
        if (org.telegram.messenger.m5.E(j3)) {
            ArrayList arrayList = getMediaDataController().i1;
            int i7 = 0;
            while (true) {
                if (i7 >= arrayList.size()) {
                    break;
                }
                TLRPC.Peer peer = ((TLRPC.TL_topPeer) arrayList.get(i7)).peer;
                if ((peer instanceof TLRPC.TL_peerUser) && peer.user_id == j3) {
                    this.a0 = i7 < 5;
                } else {
                    i7++;
                }
            }
        }
        this.Z = 0;
        boolean z10 = this.n;
        if (z10) {
            this.y = 0;
            this.Z = 2;
            this.D = 1;
        } else {
            this.y = -1;
            this.D = -1;
        }
        int i10 = this.Z;
        int i11 = i10 + 1;
        this.Z = i11;
        this.x = i10;
        long j10 = this.h;
        if (z10 || j10 != 0) {
            this.Z = i10 + 2;
            this.E = i11;
        } else {
            this.E = -1;
        }
        this.P = -1;
        if (org.telegram.messenger.m5.C(j3)) {
            this.F = -1;
        } else {
            int i12 = this.Z;
            this.Z = i12 + 1;
            this.F = i12;
            if (org.telegram.messenger.m5.E(j3)) {
                int i13 = this.Z;
                this.Z = i13 + 1;
                this.P = i13;
            }
        }
        int i14 = this.Z;
        this.G = i14;
        this.Z = i14 + 2;
        this.H = i14 + 1;
        if (org.telegram.messenger.m5.z(j3)) {
            int i15 = this.Z;
            this.Z = i15 + 1;
            this.I = i15;
        } else {
            this.I = -1;
        }
        int i16 = this.Z;
        this.J = i16;
        this.Z = i16 + 2;
        this.K = i16 + 1;
        if (org.telegram.messenger.m5.z(j3)) {
            TLRPC.Chat M0 = org.telegram.messenger.qp.s1(this.currentAccount).M0(Long.valueOf(-j3));
            if (org.telegram.messenger.t3.T(M0) && !M0.megagroup) {
                z9 = true;
                if (!org.telegram.messenger.m5.C(j3) || z9) {
                    this.L = -1;
                    this.M = -1;
                    this.N = -1;
                    this.O = -1;
                } else {
                    int i17 = this.Z;
                    this.L = i17;
                    this.M = i17 + 1;
                    this.N = i17 + 2;
                    this.Z = i17 + 4;
                    this.O = i17 + 3;
                }
                if (org.telegram.messenger.m5.E(j3)) {
                    this.Q = -1;
                    this.S = -1;
                    this.R = -1;
                    this.T = -1;
                } else {
                    int i18 = this.Z;
                    this.Q = i18;
                    this.S = i18 + 1;
                    this.R = i18 + 2;
                    this.Z = i18 + 4;
                    this.T = i18 + 3;
                }
                int i19 = this.Z;
                this.U = i19;
                this.V = i19 + 1;
                int i20 = i19 + 3;
                this.Z = i20;
                this.W = i19 + 2;
                if (z10) {
                    this.X = i20;
                    this.Z = i19 + 5;
                    this.Y = i19 + 4;
                } else {
                    this.X = -1;
                    this.Y = -1;
                }
                boolean D = org.telegram.messenger.dt.t(this.currentAccount).D(this.f, null, false, false);
                if (z10) {
                    SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(this.currentAccount).d7;
                    String v = org.telegram.messenger.dt.v(j3, j10, false);
                    boolean contains = sharedPreferences.contains("notify2_" + v);
                    int c10 = org.telegram.messenger.k5.c("notify2_", v, sharedPreferences, 0);
                    if (c10 == 0) {
                        if (contains) {
                            this.r = true;
                        } else {
                            this.r = org.telegram.messenger.dt.t(this.currentAccount).D(this.f, null, false, false);
                        }
                    } else if (c10 == 1) {
                        this.r = true;
                    } else if (c10 == 2) {
                        this.r = false;
                    } else {
                        this.r = false;
                    }
                } else {
                    this.r = !D;
                }
                org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f0);
                return super.onFragmentCreate();
            }
        }
        z9 = false;
        if (org.telegram.messenger.m5.C(j3)) {
        }
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        if (org.telegram.messenger.m5.E(j3)) {
        }
        int i192 = this.Z;
        this.U = i192;
        this.V = i192 + 1;
        int i202 = i192 + 3;
        this.Z = i202;
        this.W = i192 + 2;
        if (z10) {
        }
        boolean D2 = org.telegram.messenger.dt.t(this.currentAccount).D(this.f, null, false, false);
        if (z10) {
        }
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f0);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.b0) {
            String v = org.telegram.messenger.dt.v(this.f, this.h, false);
            org.telegram.messenger.qp.s1(this.currentAccount).d7.edit().putBoolean("custom_" + v, true).apply();
        }
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f0);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        super.onInsets(i7, i10, i11, i12);
        org.telegram.messenger.g0.B3(this.w.e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(42.0f)) / 2) + this.mSystemInsets.b, org.telegram.messenger.g0.L(6.0f), 0);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        org.telegram.messenger.g0.E2(this.w.e);
        if (!this.n) {
            this.a.addView(this.w.e, c8.ha.e(42, 42, 53));
        }
        org.telegram.messenger.g0.B3(this.w.e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(42.0f)) / 2) + this.mSystemInsets.b, org.telegram.messenger.g0.L(6.0f), 0);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
