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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class jx0 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.gs {
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
    public int a0;
    public org.telegram.ui.Components.ek0 b;
    public boolean b0;
    public hx0 c;
    public boolean c0;
    public AnimatorSet d;
    public final org.telegram.ui.ActionBar.h6 e;
    public final long f;
    public final long h;
    public final boolean n;
    public boolean r;
    public ix0 s;
    public org.telegram.ui.Components.co w;
    public int x;
    public int y;

    public jx0(Bundle bundle, org.telegram.ui.ActionBar.h6 h6Var) {
        super(bundle);
        this.e = h6Var;
        this.f = bundle.getLong("dialog_id");
        this.h = bundle.getLong("topic_id");
        this.n = bundle.getBoolean("exception", false);
    }

    public static void Z(jx0 jx0Var, String str, int i7, int i10) {
        org.telegram.messenger.np.u1(jx0Var.currentAccount).g7.edit().putInt("smart_max_count_" + str, i7).putInt("smart_delay_" + str, i10).apply();
        hx0 hx0Var = jx0Var.c;
        if (hx0Var != null) {
            hx0Var.g(jx0Var.J);
        }
    }

    public static void a0(final jx0 jx0Var, Context context, String str, View view, int i7) {
        org.telegram.ui.ActionBar.h6 h6Var = jx0Var.e;
        if (view.isEnabled()) {
            final int i10 = 0;
            Parcelable parcelable = null;
            if (i7 == jx0Var.Y) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
                String N0 = org.telegram.messenger.hd.N0(2131745906, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = N0;
                t1Var.U = org.telegram.messenger.hd.N0(2131745907, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131745922, null), new ex0(jx0Var, str));
                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                jx0Var.showDialog(t1Var);
                TextView textView = (TextView) t1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, null);
                    return;
                }
                return;
            }
            if (i7 == jx0Var.H) {
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", jx0Var.f);
                bundle.putLong("topic_id", jx0Var.h);
                jx0Var.presentFragment(new yh0(bundle, h6Var));
                return;
            }
            final int i11 = 1;
            if (i7 == jx0Var.S) {
                try {
                    Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                    intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                    intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                    SharedPreferences sharedPreferences = org.telegram.messenger.np.u1(jx0Var.currentAccount).g7;
                    Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
                    String path = uri != null ? uri.getPath() : null;
                    String string = sharedPreferences.getString("ringtone_path_" + str, path);
                    if (string != null && !string.equals("NoSound")) {
                        parcelable = string.equals(path) ? uri : Uri.parse(string);
                    }
                    intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", parcelable);
                    jx0Var.startActivityForResult(intent, 13);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            }
            if (i7 == jx0Var.I) {
                Activity parentActivity = jx0Var.getParentActivity();
                long j3 = jx0Var.f;
                long j10 = jx0Var.h;
                Runnable runnable = new Runnable(jx0Var) { // from class: org.telegram.ui.fx0
                    public final /* synthetic */ jx0 b;

                    {
                        this.b = jx0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                jx0 jx0Var2 = this.b;
                                hx0 hx0Var = jx0Var2.c;
                                if (hx0Var != null) {
                                    hx0Var.g(jx0Var2.I);
                                    break;
                                }
                                break;
                            case 1:
                                jx0 jx0Var3 = this.b;
                                hx0 hx0Var2 = jx0Var3.c;
                                if (hx0Var2 != null) {
                                    hx0Var2.g(jx0Var3.T);
                                    break;
                                }
                                break;
                            case 2:
                                jx0 jx0Var4 = this.b;
                                hx0 hx0Var3 = jx0Var4.c;
                                if (hx0Var3 != null) {
                                    hx0Var3.g(jx0Var4.K);
                                    break;
                                }
                                break;
                            default:
                                jx0 jx0Var5 = this.b;
                                hx0 hx0Var4 = jx0Var5.c;
                                if (hx0Var4 != null) {
                                    hx0Var4.g(jx0Var5.W);
                                    break;
                                }
                                break;
                        }
                    }
                };
                org.telegram.ui.ActionBar.h6 h6Var2 = jx0Var.e;
                Pattern pattern = org.telegram.ui.Components.c5.a;
                jx0Var.showDialog(org.telegram.ui.Components.c5.V(parentActivity, j3, j10, j3 != 0 ? a8.p0.o(j3, "vibrate_") : "vibrate_messages", runnable, h6Var2));
                return;
            }
            final int i12 = 3;
            if (i7 == jx0Var.F) {
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                boolean z10 = !s8Var.e.h;
                jx0Var.r = z10;
                s8Var.setChecked(z10);
                int childCount = jx0Var.b.getChildCount();
                ArrayList arrayList = new ArrayList();
                while (i10 < childCount) {
                    org.telegram.ui.Components.mj0 mj0Var = (org.telegram.ui.Components.mj0) jx0Var.b.T(jx0Var.b.getChildAt(i10));
                    int i13 = mj0Var.f;
                    View view2 = mj0Var.a;
                    int b10 = mj0Var.b();
                    if (b10 != jx0Var.F && b10 != jx0Var.Y) {
                        if (i13 == 0) {
                            ((org.telegram.ui.Cells.o4) view2).a(arrayList, jx0Var.r);
                        } else if (i13 == 1) {
                            ((org.telegram.ui.Cells.x9) view2).a(arrayList, jx0Var.r);
                        } else if (i13 == 2) {
                            ((org.telegram.ui.Cells.a9) view2).c(arrayList, jx0Var.r);
                        } else if (i13 == 3) {
                            ((org.telegram.ui.Cells.u8) view2).a(arrayList, jx0Var.r);
                        } else if (i13 == 4) {
                            ((org.telegram.ui.Cells.j6) view2).b(arrayList, jx0Var.r);
                        } else if (i13 == 7 && b10 == jx0Var.G) {
                            ((org.telegram.ui.Cells.s8) view2).e(arrayList, jx0Var.r);
                        }
                    }
                    i10++;
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                AnimatorSet animatorSet = jx0Var.d;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                jx0Var.d = animatorSet2;
                animatorSet2.playTogether(arrayList);
                jx0Var.d.addListener(new ay(jx0Var, 24));
                jx0Var.d.setDuration(150L);
                jx0Var.d.start();
                return;
            }
            if (i7 == jx0Var.G) {
                org.telegram.ui.Cells.s8 s8Var2 = (org.telegram.ui.Cells.s8) view;
                Switch r32 = s8Var2.e;
                org.telegram.messenger.np.u1(jx0Var.currentAccount).g7.edit().putBoolean(p5.c.k("content_preview_", str), !r32.h).apply();
                s8Var2.setChecked(!r32.h);
                return;
            }
            if (i7 == jx0Var.T) {
                jx0Var.showDialog(org.telegram.ui.Components.c5.V(jx0Var.getParentActivity(), jx0Var.f, jx0Var.h, p5.c.k("calls_vibrate_", str), new Runnable(jx0Var) { // from class: org.telegram.ui.fx0
                    public final /* synthetic */ jx0 b;

                    {
                        this.b = jx0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                jx0 jx0Var2 = this.b;
                                hx0 hx0Var = jx0Var2.c;
                                if (hx0Var != null) {
                                    hx0Var.g(jx0Var2.I);
                                    break;
                                }
                                break;
                            case 1:
                                jx0 jx0Var3 = this.b;
                                hx0 hx0Var2 = jx0Var3.c;
                                if (hx0Var2 != null) {
                                    hx0Var2.g(jx0Var3.T);
                                    break;
                                }
                                break;
                            case 2:
                                jx0 jx0Var4 = this.b;
                                hx0 hx0Var3 = jx0Var4.c;
                                if (hx0Var3 != null) {
                                    hx0Var3.g(jx0Var4.K);
                                    break;
                                }
                                break;
                            default:
                                jx0 jx0Var5 = this.b;
                                hx0 hx0Var4 = jx0Var5.c;
                                if (hx0Var4 != null) {
                                    hx0Var4.g(jx0Var5.W);
                                    break;
                                }
                                break;
                        }
                    }
                }, jx0Var.e));
                return;
            }
            if (i7 == jx0Var.K) {
                jx0Var.showDialog(org.telegram.ui.Components.c5.F(jx0Var.getParentActivity(), jx0Var.f, jx0Var.h, -1, new Runnable(jx0Var) { // from class: org.telegram.ui.fx0
                    public final /* synthetic */ jx0 b;

                    {
                        this.b = jx0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (r2) {
                            case 0:
                                jx0 jx0Var2 = this.b;
                                hx0 hx0Var = jx0Var2.c;
                                if (hx0Var != null) {
                                    hx0Var.g(jx0Var2.I);
                                    break;
                                }
                                break;
                            case 1:
                                jx0 jx0Var3 = this.b;
                                hx0 hx0Var2 = jx0Var3.c;
                                if (hx0Var2 != null) {
                                    hx0Var2.g(jx0Var3.T);
                                    break;
                                }
                                break;
                            case 2:
                                jx0 jx0Var4 = this.b;
                                hx0 hx0Var3 = jx0Var4.c;
                                if (hx0Var3 != null) {
                                    hx0Var3.g(jx0Var4.K);
                                    break;
                                }
                                break;
                            default:
                                jx0 jx0Var5 = this.b;
                                hx0 hx0Var4 = jx0Var5.c;
                                if (hx0Var4 != null) {
                                    hx0Var4.g(jx0Var5.W);
                                    break;
                                }
                                break;
                        }
                    }
                }, jx0Var.e));
                return;
            }
            if (i7 != jx0Var.J) {
                if (i7 == jx0Var.W) {
                    if (jx0Var.getParentActivity() == null) {
                        return;
                    }
                    jx0Var.showDialog(org.telegram.ui.Components.c5.t(jx0Var.getParentActivity(), jx0Var.f, jx0Var.h, -1, new Runnable(jx0Var) { // from class: org.telegram.ui.fx0
                        public final /* synthetic */ jx0 b;

                        {
                            this.b = jx0Var;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i12) {
                                case 0:
                                    jx0 jx0Var2 = this.b;
                                    hx0 hx0Var = jx0Var2.c;
                                    if (hx0Var != null) {
                                        hx0Var.g(jx0Var2.I);
                                        break;
                                    }
                                    break;
                                case 1:
                                    jx0 jx0Var3 = this.b;
                                    hx0 hx0Var2 = jx0Var3.c;
                                    if (hx0Var2 != null) {
                                        hx0Var2.g(jx0Var3.T);
                                        break;
                                    }
                                    break;
                                case 2:
                                    jx0 jx0Var4 = this.b;
                                    hx0 hx0Var3 = jx0Var4.c;
                                    if (hx0Var3 != null) {
                                        hx0Var3.g(jx0Var4.K);
                                        break;
                                    }
                                    break;
                                default:
                                    jx0 jx0Var5 = this.b;
                                    hx0 hx0Var4 = jx0Var5.c;
                                    if (hx0Var4 != null) {
                                        hx0Var4.g(jx0Var5.W);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, jx0Var.e));
                    return;
                }
                if (i7 == jx0Var.N) {
                    org.telegram.messenger.np.u1(jx0Var.currentAccount).g7.edit().putInt("popup_" + str, 1).apply();
                    ((org.telegram.ui.Cells.j6) view).a(true, true);
                    View findViewWithTag = jx0Var.b.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((org.telegram.ui.Cells.j6) findViewWithTag).a(false, true);
                        return;
                    }
                    return;
                }
                if (i7 == jx0Var.O) {
                    org.telegram.messenger.np.u1(jx0Var.currentAccount).g7.edit().putInt("popup_" + str, 2).apply();
                    ((org.telegram.ui.Cells.j6) view).a(true, true);
                    View findViewWithTag2 = jx0Var.b.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((org.telegram.ui.Cells.j6) findViewWithTag2).a(false, true);
                        return;
                    }
                    return;
                }
                if (i7 == jx0Var.Q) {
                    org.telegram.ui.Cells.s8 s8Var3 = (org.telegram.ui.Cells.s8) view;
                    boolean z11 = s8Var3.e.h;
                    boolean z12 = !z11;
                    s8Var3.setChecked(z12);
                    SharedPreferences.Editor edit = org.telegram.messenger.np.u1(jx0Var.currentAccount).g7.edit();
                    if (!jx0Var.b0 || z11) {
                        edit.putBoolean("stories_" + str, z12);
                    } else {
                        edit.remove("stories_" + str);
                    }
                    edit.apply();
                    jx0Var.getNotificationsController().c0(jx0Var.f, jx0Var.h, true);
                    return;
                }
                return;
            }
            if (jx0Var.getParentActivity() == null) {
                return;
            }
            SharedPreferences sharedPreferences2 = org.telegram.messenger.np.u1(jx0Var.currentAccount).g7;
            int c10 = org.telegram.messenger.f3.c("smart_max_count_", str, sharedPreferences2, 2);
            int c11 = org.telegram.messenger.f3.c("smart_delay_", str, sharedPreferences2, org.telegram.messenger.ls.K2);
            r9 = c10 != 0 ? c10 : 2;
            Activity parentActivity2 = jx0Var.getParentActivity();
            ex0 ex0Var = new ex0(jx0Var, str);
            Pattern pattern2 = org.telegram.ui.Components.c5.a;
            if (parentActivity2 == null) {
                return;
            }
            int i14 = org.telegram.ui.ActionBar.m6.j5;
            int i15 = h6Var != null ? h6Var.i(i14) : org.telegram.ui.ActionBar.m6.x0(null, i14, false);
            int i16 = org.telegram.ui.ActionBar.m6.h5;
            int i17 = h6Var != null ? h6Var.i(i16) : org.telegram.ui.ActionBar.m6.x0(null, i16, false);
            int i18 = org.telegram.ui.ActionBar.m6.Aj;
            if (h6Var != null) {
                h6Var.i(i18);
            } else {
                org.telegram.ui.ActionBar.m6.x0(null, i18, false);
            }
            int i19 = org.telegram.ui.ActionBar.m6.Ej;
            if (h6Var != null) {
                h6Var.i(i19);
            } else {
                org.telegram.ui.ActionBar.m6.x0(null, i19, false);
            }
            int i20 = org.telegram.ui.ActionBar.m6.E8;
            if (h6Var != null) {
                h6Var.i(i20);
            } else {
                org.telegram.ui.ActionBar.m6.x0(null, i20, false);
            }
            int i21 = org.telegram.ui.ActionBar.m6.G8;
            if (h6Var != null) {
                h6Var.i(i21);
            } else {
                org.telegram.ui.ActionBar.m6.x0(null, i21, false);
            }
            int i22 = org.telegram.ui.ActionBar.m6.i6;
            if (h6Var != null) {
                h6Var.i(i22);
            } else {
                org.telegram.ui.ActionBar.m6.x0(null, i22, false);
            }
            int i23 = org.telegram.ui.ActionBar.m6.Ji;
            int i24 = h6Var != null ? h6Var.i(i23) : org.telegram.ui.ActionBar.m6.x0(null, i23, false);
            int i25 = org.telegram.ui.ActionBar.m6.Fi;
            int i26 = h6Var != null ? h6Var.i(i25) : org.telegram.ui.ActionBar.m6.x0(null, i25, false);
            int i27 = org.telegram.ui.ActionBar.m6.Hi;
            int i28 = h6Var != null ? h6Var.i(i27) : org.telegram.ui.ActionBar.m6.x0(null, i27, false);
            hi.w4 w4Var = new hi.w4(parentActivity2, h6Var);
            ((org.telegram.ui.ActionBar.w2) w4Var.b).w0 = false;
            org.telegram.ui.Components.n4 n4Var = new org.telegram.ui.Components.n4(parentActivity2, h6Var);
            n4Var.setMinValue(0);
            n4Var.setMaxValue(10);
            n4Var.setTextColor(i15);
            n4Var.setValue(r9 - 1);
            n4Var.setWrapSelectorWheel(false);
            n4Var.setFormatter(new cr(25));
            org.telegram.ui.Components.o4 o4Var = new org.telegram.ui.Components.o4(parentActivity2, h6Var);
            o4Var.setMinValue(0);
            o4Var.setMaxValue(10);
            o4Var.setTextColor(i15);
            o4Var.setValue((c11 / 60) - 1);
            o4Var.setWrapSelectorWheel(false);
            o4Var.setFormatter(new cr(26));
            org.telegram.ui.Components.tb0 tb0Var = new org.telegram.ui.Components.tb0(parentActivity2, h6Var);
            tb0Var.setMinValue(0);
            tb0Var.setMaxValue(0);
            tb0Var.setTextColor(i15);
            tb0Var.setValue(0);
            tb0Var.setWrapSelectorWheel(false);
            tb0Var.setFormatter(new cr(27));
            org.telegram.ui.Components.w3 w3Var = new org.telegram.ui.Components.w3(parentActivity2, n4Var, o4Var, tb0Var, 5);
            w3Var.setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(parentActivity2);
            w3Var.addView(frameLayout, c8.ma.t(-1, -2, 51, 22, 0, 0, 4));
            TextView textView2 = new TextView(parentActivity2);
            textView2.setText(org.telegram.messenger.hd.N0(2131747927, null));
            textView2.setTextColor(i15);
            i5.c.x(textView2, 1, 20.0f);
            frameLayout.addView(textView2, c8.ma.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
            textView2.setOnTouchListener(new gi.a(10));
            LinearLayout linearLayout = new LinearLayout(parentActivity2);
            linearLayout.setOrientation(0);
            linearLayout.setWeightSum(1.0f);
            w3Var.addView(linearLayout, c8.ma.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
            di.xb xbVar = new di.xb(parentActivity2, 18);
            linearLayout.addView(n4Var, c8.ma.l(0.4f, 0, org.telegram.messenger.ls.t4));
            linearLayout.addView(tb0Var, c8.ma.p(0, -2, 0.2f, 16));
            linearLayout.addView(o4Var, c8.ma.l(0.4f, 0, org.telegram.messenger.ls.t4));
            xbVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
            xbVar.setGravity(17);
            xbVar.setTextColor(i24);
            xbVar.setTextSize(1, 14.0f);
            xbVar.setTypeface(org.telegram.messenger.g0.o());
            int L = org.telegram.messenger.g0.L(8.0f);
            xbVar.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.k0(L, L, L, L, i26, i28, i28));
            xbVar.setText(org.telegram.messenger.hd.N0(2131753863, null));
            w3Var.addView(xbVar, c8.ma.t(-1, 48, 83, 16, 15, 16, 16));
            cr crVar = new cr(11);
            n4Var.setOnValueChangedListener(crVar);
            o4Var.setOnValueChangedListener(crVar);
            xbVar.setOnClickListener(new bi.p6(n4Var, o4Var, ex0Var, w4Var, 8));
            org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) w4Var.b;
            w2Var.O = w3Var;
            w2Var.show();
            w2Var.v0(i17);
            w2Var.P(i17);
        }
    }

    public static void b0(jx0 jx0Var, String str) {
        jx0Var.c0 = true;
        org.telegram.messenger.np.u1(jx0Var.currentAccount).g7.edit().putBoolean("custom_" + str, false).remove("notify2_" + str).apply();
        jx0Var.finishFragment();
        ix0 ix0Var = jx0Var.s;
        if (ix0Var != null) {
            ix0Var.a0();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.d6));
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        long j3 = this.f;
        long j10 = this.h;
        String v = org.telegram.messenger.ys.v(j3, j10, false);
        this.simpleActionBar.setActionBarMenuOnItemClick(new gx0(this, v));
        org.telegram.ui.ActionBar.h6 h6Var = this.e;
        org.telegram.ui.Components.co coVar = new org.telegram.ui.Components.co(context, null, false, h6Var);
        this.w = coVar;
        coVar.setOccupyStatusBar(!org.telegram.messenger.g0.Q1());
        if (j3 >= 0) {
            TLRPC.User c22 = getMessagesController().c2(Long.valueOf(j3));
            if (c22 != null) {
                this.w.setUserAvatar(c22);
                this.simpleActionBar.setTitle(org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name));
            }
        } else if (j10 != 0) {
            TLRPC.TL_forumTopic f10 = getMessagesController().t7.f(-j3, j10);
            qg.c.q(this.w.getAvatarImageView(), f10, false, true, h6Var);
            this.simpleActionBar.setTitle(f10.title);
        } else {
            TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(-j3));
            this.w.setChatAvatar(O0);
            this.simpleActionBar.setTitle(O0.title);
        }
        if (this.n) {
            this.simpleActionBar.setSubtitle(org.telegram.messenger.hd.N0(2131747701, null));
            this.simpleActionBar.s(org.telegram.messenger.hd.N0(2131745750, null));
        } else {
            this.simpleActionBar.setSubtitle(org.telegram.messenger.hd.N0(2131751672, null));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.b = ek0Var;
        ek0Var.r1();
        this.b.setSectionsDrawBackground(true);
        frameLayout.addView(this.b, c8.ma.c(-1.0f, -1));
        org.telegram.ui.Components.ek0 ek0Var2 = this.b;
        hx0 hx0Var = new hx0(this, context);
        this.c = hx0Var;
        ek0Var2.setAdapter(hx0Var);
        this.b.setItemAnimator(null);
        this.b.setLayoutAnimation(null);
        this.b.setLayoutManager(new jg.b0(17));
        this.b.setOnItemClickListener(new a61(this, context, v, i7));
        this.a = frameLayout;
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.f0) {
            try {
                this.c.f();
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final org.telegram.ui.ActionBar.h6 getResourceProvider() {
        return this.e;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(19, this);
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.b, 0, new Class[]{org.telegram.ui.Cells.qa.class}, new String[]{"statusColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.b, 0, new Class[]{org.telegram.ui.Cells.qa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.n6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        Ringtone ringtone;
        if (i10 != -1 || intent == null) {
            return;
        }
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
        String str = null;
        if (uri != null && (ringtone = RingtoneManager.getRingtone(org.telegram.messenger.t0.b, uri)) != null) {
            str = i7 == 13 ? uri.equals(Settings.System.DEFAULT_RINGTONE_URI) ? org.telegram.messenger.hd.N0(2131751587, null) : ringtone.getTitle(getParentActivity()) : uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI) ? org.telegram.messenger.hd.N0(2131745084, null) : ringtone.getTitle(getParentActivity());
            ringtone.stop();
        }
        SharedPreferences.Editor edit = org.telegram.messenger.np.u1(this.currentAccount).g7.edit();
        String v = org.telegram.messenger.ys.v(this.f, this.h, false);
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
        hx0 hx0Var = this.c;
        if (hx0Var != null) {
            hx0Var.g(i7 == 13 ? this.S : this.H);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010f  */
    @Override // org.telegram.ui.ActionBar.g2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        boolean z10;
        long j3 = this.f;
        if (org.telegram.messenger.n5.E(j3)) {
            ArrayList arrayList = getMediaDataController().j1;
            int i7 = 0;
            while (true) {
                if (i7 >= arrayList.size()) {
                    break;
                }
                TLRPC.Peer peer = ((TLRPC.TL_topPeer) arrayList.get(i7)).peer;
                if ((peer instanceof TLRPC.TL_peerUser) && peer.user_id == j3) {
                    this.b0 = i7 < 5;
                } else {
                    i7++;
                }
            }
        }
        this.a0 = 0;
        boolean z11 = this.n;
        if (z11) {
            this.y = 0;
            this.a0 = 2;
            this.E = 1;
        } else {
            this.y = -1;
            this.E = -1;
        }
        int i10 = this.a0;
        int i11 = i10 + 1;
        this.a0 = i11;
        this.x = i10;
        long j10 = this.h;
        if (z11 || j10 != 0) {
            this.a0 = i10 + 2;
            this.F = i11;
        } else {
            this.F = -1;
        }
        this.Q = -1;
        if (org.telegram.messenger.n5.C(j3)) {
            this.G = -1;
        } else {
            int i12 = this.a0;
            this.a0 = i12 + 1;
            this.G = i12;
            if (org.telegram.messenger.n5.E(j3)) {
                int i13 = this.a0;
                this.a0 = i13 + 1;
                this.Q = i13;
            }
        }
        int i14 = this.a0;
        this.H = i14;
        this.a0 = i14 + 2;
        this.I = i14 + 1;
        if (org.telegram.messenger.n5.z(j3)) {
            int i15 = this.a0;
            this.a0 = i15 + 1;
            this.J = i15;
        } else {
            this.J = -1;
        }
        int i16 = this.a0;
        this.K = i16;
        this.a0 = i16 + 2;
        this.L = i16 + 1;
        if (org.telegram.messenger.n5.z(j3)) {
            TLRPC.Chat O0 = org.telegram.messenger.np.u1(this.currentAccount).O0(Long.valueOf(-j3));
            if (org.telegram.messenger.v3.T(O0) && !O0.megagroup) {
                z10 = true;
                if (!org.telegram.messenger.n5.C(j3) || z10) {
                    this.M = -1;
                    this.N = -1;
                    this.O = -1;
                    this.P = -1;
                } else {
                    int i17 = this.a0;
                    this.M = i17;
                    this.N = i17 + 1;
                    this.O = i17 + 2;
                    this.a0 = i17 + 4;
                    this.P = i17 + 3;
                }
                if (org.telegram.messenger.n5.E(j3)) {
                    this.R = -1;
                    this.T = -1;
                    this.S = -1;
                    this.U = -1;
                } else {
                    int i18 = this.a0;
                    this.R = i18;
                    this.T = i18 + 1;
                    this.S = i18 + 2;
                    this.a0 = i18 + 4;
                    this.U = i18 + 3;
                }
                int i19 = this.a0;
                this.V = i19;
                this.W = i19 + 1;
                int i20 = i19 + 3;
                this.a0 = i20;
                this.X = i19 + 2;
                if (z11) {
                    this.Y = i20;
                    this.a0 = i19 + 5;
                    this.Z = i19 + 4;
                } else {
                    this.Y = -1;
                    this.Z = -1;
                }
                boolean D = org.telegram.messenger.ys.t(this.currentAccount).D(this.f, null, false, false);
                if (z11) {
                    SharedPreferences sharedPreferences = org.telegram.messenger.np.u1(this.currentAccount).g7;
                    String v = org.telegram.messenger.ys.v(j3, j10, false);
                    boolean contains = sharedPreferences.contains("notify2_" + v);
                    int c10 = org.telegram.messenger.f3.c("notify2_", v, sharedPreferences, 0);
                    if (c10 == 0) {
                        if (contains) {
                            this.r = true;
                        } else {
                            this.r = org.telegram.messenger.ys.t(this.currentAccount).D(this.f, null, false, false);
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
                org.telegram.messenger.ls.f(this.currentAccount).c(this, org.telegram.messenger.ls.f0);
                return super.onFragmentCreate();
            }
        }
        z10 = false;
        if (org.telegram.messenger.n5.C(j3)) {
        }
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.P = -1;
        if (org.telegram.messenger.n5.E(j3)) {
        }
        int i192 = this.a0;
        this.V = i192;
        this.W = i192 + 1;
        int i202 = i192 + 3;
        this.a0 = i202;
        this.X = i192 + 2;
        if (z11) {
        }
        boolean D2 = org.telegram.messenger.ys.t(this.currentAccount).D(this.f, null, false, false);
        if (z11) {
        }
        org.telegram.messenger.ls.f(this.currentAccount).c(this, org.telegram.messenger.ls.f0);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.c0) {
            String v = org.telegram.messenger.ys.v(this.f, this.h, false);
            org.telegram.messenger.np.u1(this.currentAccount).g7.edit().putBoolean("custom_" + v, true).apply();
        }
        org.telegram.messenger.ls.f(this.currentAccount).n(this, org.telegram.messenger.ls.f0);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        super.onInsets(i7, i10, i11, i12);
        org.telegram.messenger.g0.z3(this.w.e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(42.0f)) / 2) + this.mSystemInsets.b, org.telegram.messenger.g0.L(6.0f), 0);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        org.telegram.messenger.g0.E2(this.w.e);
        if (!this.n) {
            this.a.addView(this.w.e, c8.ma.e(42, 42, 53));
        }
        org.telegram.messenger.g0.z3(this.w.e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(42.0f)) / 2) + this.mSystemInsets.b, org.telegram.messenger.g0.L(6.0f), 0);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
