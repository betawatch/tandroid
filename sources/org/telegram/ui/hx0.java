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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class hx0 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs {
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
    public fx0 c;
    public boolean c0;
    public AnimatorSet d;
    public final org.telegram.ui.ActionBar.i6 e;
    public final long f;
    public final long h;
    public final boolean n;
    public boolean r;
    public gx0 s;
    public org.telegram.ui.Components.zn w;
    public int x;
    public int y;

    public hx0(Bundle bundle, org.telegram.ui.ActionBar.i6 i6Var) {
        super(bundle);
        this.e = i6Var;
        this.f = bundle.getLong("dialog_id");
        this.h = bundle.getLong("topic_id");
        this.n = bundle.getBoolean("exception", false);
    }

    public static void Z(hx0 hx0Var, String str, int i7, int i10) {
        org.telegram.messenger.mp.u1(hx0Var.currentAccount).g7.edit().putInt("smart_max_count_" + str, i7).putInt("smart_delay_" + str, i10).apply();
        fx0 fx0Var = hx0Var.c;
        if (fx0Var != null) {
            fx0Var.g(hx0Var.J);
        }
    }

    public static void a0(final hx0 hx0Var, Context context, String str, View view, int i7) {
        org.telegram.ui.ActionBar.i6 i6Var = hx0Var.e;
        if (view.isEnabled()) {
            final int i10 = 0;
            Parcelable parcelable = null;
            if (i7 == hx0Var.Y) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
                String N0 = org.telegram.messenger.gd.N0(2131745906, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = N0;
                t1Var.U = org.telegram.messenger.gd.N0(2131745907, null);
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131745922, null), new cx0(hx0Var, str));
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                hx0Var.showDialog(t1Var);
                TextView textView = (TextView) t1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, null);
                    return;
                }
                return;
            }
            if (i7 == hx0Var.H) {
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", hx0Var.f);
                bundle.putLong("topic_id", hx0Var.h);
                hx0Var.presentFragment(new wh0(bundle, i6Var));
                return;
            }
            final int i11 = 1;
            if (i7 == hx0Var.S) {
                try {
                    Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                    intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                    intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                    SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(hx0Var.currentAccount).g7;
                    Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
                    String path = uri != null ? uri.getPath() : null;
                    String string = sharedPreferences.getString("ringtone_path_" + str, path);
                    if (string != null && !string.equals("NoSound")) {
                        parcelable = string.equals(path) ? uri : Uri.parse(string);
                    }
                    intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", parcelable);
                    hx0Var.startActivityForResult(intent, 13);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            }
            if (i7 == hx0Var.I) {
                Activity parentActivity = hx0Var.getParentActivity();
                long j3 = hx0Var.f;
                long j10 = hx0Var.h;
                Runnable runnable = new Runnable(hx0Var) { // from class: org.telegram.ui.dx0
                    public final /* synthetic */ hx0 b;

                    {
                        this.b = hx0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                hx0 hx0Var2 = this.b;
                                fx0 fx0Var = hx0Var2.c;
                                if (fx0Var != null) {
                                    fx0Var.g(hx0Var2.I);
                                    break;
                                }
                                break;
                            case 1:
                                hx0 hx0Var3 = this.b;
                                fx0 fx0Var2 = hx0Var3.c;
                                if (fx0Var2 != null) {
                                    fx0Var2.g(hx0Var3.T);
                                    break;
                                }
                                break;
                            case 2:
                                hx0 hx0Var4 = this.b;
                                fx0 fx0Var3 = hx0Var4.c;
                                if (fx0Var3 != null) {
                                    fx0Var3.g(hx0Var4.K);
                                    break;
                                }
                                break;
                            default:
                                hx0 hx0Var5 = this.b;
                                fx0 fx0Var4 = hx0Var5.c;
                                if (fx0Var4 != null) {
                                    fx0Var4.g(hx0Var5.W);
                                    break;
                                }
                                break;
                        }
                    }
                };
                org.telegram.ui.ActionBar.i6 i6Var2 = hx0Var.e;
                Pattern pattern = org.telegram.ui.Components.b5.a;
                hx0Var.showDialog(org.telegram.ui.Components.b5.V(parentActivity, j3, j10, j3 != 0 ? a8.p0.o(j3, "vibrate_") : "vibrate_messages", runnable, i6Var2));
                return;
            }
            final int i12 = 3;
            if (i7 == hx0Var.F) {
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                boolean z10 = !r8Var.e.h;
                hx0Var.r = z10;
                r8Var.setChecked(z10);
                int childCount = hx0Var.b.getChildCount();
                ArrayList arrayList = new ArrayList();
                while (i10 < childCount) {
                    org.telegram.ui.Components.mj0 mj0Var = (org.telegram.ui.Components.mj0) hx0Var.b.T(hx0Var.b.getChildAt(i10));
                    int i13 = mj0Var.f;
                    View view2 = mj0Var.a;
                    int b10 = mj0Var.b();
                    if (b10 != hx0Var.F && b10 != hx0Var.Y) {
                        if (i13 == 0) {
                            ((org.telegram.ui.Cells.o4) view2).a(arrayList, hx0Var.r);
                        } else if (i13 == 1) {
                            ((org.telegram.ui.Cells.w9) view2).a(arrayList, hx0Var.r);
                        } else if (i13 == 2) {
                            ((org.telegram.ui.Cells.z8) view2).c(arrayList, hx0Var.r);
                        } else if (i13 == 3) {
                            ((org.telegram.ui.Cells.t8) view2).a(arrayList, hx0Var.r);
                        } else if (i13 == 4) {
                            ((org.telegram.ui.Cells.i6) view2).b(arrayList, hx0Var.r);
                        } else if (i13 == 7 && b10 == hx0Var.G) {
                            ((org.telegram.ui.Cells.r8) view2).e(arrayList, hx0Var.r);
                        }
                    }
                    i10++;
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                AnimatorSet animatorSet = hx0Var.d;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                hx0Var.d = animatorSet2;
                animatorSet2.playTogether(arrayList);
                hx0Var.d.addListener(new zx(hx0Var, 24));
                hx0Var.d.setDuration(150L);
                hx0Var.d.start();
                return;
            }
            if (i7 == hx0Var.G) {
                org.telegram.ui.Cells.r8 r8Var2 = (org.telegram.ui.Cells.r8) view;
                Switch r32 = r8Var2.e;
                org.telegram.messenger.mp.u1(hx0Var.currentAccount).g7.edit().putBoolean(p5.c.k("content_preview_", str), !r32.h).apply();
                r8Var2.setChecked(!r32.h);
                return;
            }
            if (i7 == hx0Var.T) {
                hx0Var.showDialog(org.telegram.ui.Components.b5.V(hx0Var.getParentActivity(), hx0Var.f, hx0Var.h, p5.c.k("calls_vibrate_", str), new Runnable(hx0Var) { // from class: org.telegram.ui.dx0
                    public final /* synthetic */ hx0 b;

                    {
                        this.b = hx0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                hx0 hx0Var2 = this.b;
                                fx0 fx0Var = hx0Var2.c;
                                if (fx0Var != null) {
                                    fx0Var.g(hx0Var2.I);
                                    break;
                                }
                                break;
                            case 1:
                                hx0 hx0Var3 = this.b;
                                fx0 fx0Var2 = hx0Var3.c;
                                if (fx0Var2 != null) {
                                    fx0Var2.g(hx0Var3.T);
                                    break;
                                }
                                break;
                            case 2:
                                hx0 hx0Var4 = this.b;
                                fx0 fx0Var3 = hx0Var4.c;
                                if (fx0Var3 != null) {
                                    fx0Var3.g(hx0Var4.K);
                                    break;
                                }
                                break;
                            default:
                                hx0 hx0Var5 = this.b;
                                fx0 fx0Var4 = hx0Var5.c;
                                if (fx0Var4 != null) {
                                    fx0Var4.g(hx0Var5.W);
                                    break;
                                }
                                break;
                        }
                    }
                }, hx0Var.e));
                return;
            }
            if (i7 == hx0Var.K) {
                hx0Var.showDialog(org.telegram.ui.Components.b5.F(hx0Var.getParentActivity(), hx0Var.f, hx0Var.h, -1, new Runnable(hx0Var) { // from class: org.telegram.ui.dx0
                    public final /* synthetic */ hx0 b;

                    {
                        this.b = hx0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (r2) {
                            case 0:
                                hx0 hx0Var2 = this.b;
                                fx0 fx0Var = hx0Var2.c;
                                if (fx0Var != null) {
                                    fx0Var.g(hx0Var2.I);
                                    break;
                                }
                                break;
                            case 1:
                                hx0 hx0Var3 = this.b;
                                fx0 fx0Var2 = hx0Var3.c;
                                if (fx0Var2 != null) {
                                    fx0Var2.g(hx0Var3.T);
                                    break;
                                }
                                break;
                            case 2:
                                hx0 hx0Var4 = this.b;
                                fx0 fx0Var3 = hx0Var4.c;
                                if (fx0Var3 != null) {
                                    fx0Var3.g(hx0Var4.K);
                                    break;
                                }
                                break;
                            default:
                                hx0 hx0Var5 = this.b;
                                fx0 fx0Var4 = hx0Var5.c;
                                if (fx0Var4 != null) {
                                    fx0Var4.g(hx0Var5.W);
                                    break;
                                }
                                break;
                        }
                    }
                }, hx0Var.e));
                return;
            }
            if (i7 != hx0Var.J) {
                if (i7 == hx0Var.W) {
                    if (hx0Var.getParentActivity() == null) {
                        return;
                    }
                    hx0Var.showDialog(org.telegram.ui.Components.b5.t(hx0Var.getParentActivity(), hx0Var.f, hx0Var.h, -1, new Runnable(hx0Var) { // from class: org.telegram.ui.dx0
                        public final /* synthetic */ hx0 b;

                        {
                            this.b = hx0Var;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i12) {
                                case 0:
                                    hx0 hx0Var2 = this.b;
                                    fx0 fx0Var = hx0Var2.c;
                                    if (fx0Var != null) {
                                        fx0Var.g(hx0Var2.I);
                                        break;
                                    }
                                    break;
                                case 1:
                                    hx0 hx0Var3 = this.b;
                                    fx0 fx0Var2 = hx0Var3.c;
                                    if (fx0Var2 != null) {
                                        fx0Var2.g(hx0Var3.T);
                                        break;
                                    }
                                    break;
                                case 2:
                                    hx0 hx0Var4 = this.b;
                                    fx0 fx0Var3 = hx0Var4.c;
                                    if (fx0Var3 != null) {
                                        fx0Var3.g(hx0Var4.K);
                                        break;
                                    }
                                    break;
                                default:
                                    hx0 hx0Var5 = this.b;
                                    fx0 fx0Var4 = hx0Var5.c;
                                    if (fx0Var4 != null) {
                                        fx0Var4.g(hx0Var5.W);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, hx0Var.e));
                    return;
                }
                if (i7 == hx0Var.N) {
                    org.telegram.messenger.mp.u1(hx0Var.currentAccount).g7.edit().putInt("popup_" + str, 1).apply();
                    ((org.telegram.ui.Cells.i6) view).a(true, true);
                    View findViewWithTag = hx0Var.b.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((org.telegram.ui.Cells.i6) findViewWithTag).a(false, true);
                        return;
                    }
                    return;
                }
                if (i7 == hx0Var.O) {
                    org.telegram.messenger.mp.u1(hx0Var.currentAccount).g7.edit().putInt("popup_" + str, 2).apply();
                    ((org.telegram.ui.Cells.i6) view).a(true, true);
                    View findViewWithTag2 = hx0Var.b.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((org.telegram.ui.Cells.i6) findViewWithTag2).a(false, true);
                        return;
                    }
                    return;
                }
                if (i7 == hx0Var.Q) {
                    org.telegram.ui.Cells.r8 r8Var3 = (org.telegram.ui.Cells.r8) view;
                    boolean z11 = r8Var3.e.h;
                    boolean z12 = !z11;
                    r8Var3.setChecked(z12);
                    SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(hx0Var.currentAccount).g7.edit();
                    if (!hx0Var.b0 || z11) {
                        edit.putBoolean("stories_" + str, z12);
                    } else {
                        edit.remove("stories_" + str);
                    }
                    edit.apply();
                    hx0Var.getNotificationsController().c0(hx0Var.f, hx0Var.h, true);
                    return;
                }
                return;
            }
            if (hx0Var.getParentActivity() == null) {
                return;
            }
            SharedPreferences sharedPreferences2 = org.telegram.messenger.mp.u1(hx0Var.currentAccount).g7;
            int c10 = org.telegram.messenger.f3.c("smart_max_count_", str, sharedPreferences2, 2);
            int c11 = org.telegram.messenger.f3.c("smart_delay_", str, sharedPreferences2, org.telegram.messenger.ks.K2);
            r9 = c10 != 0 ? c10 : 2;
            Activity parentActivity2 = hx0Var.getParentActivity();
            cx0 cx0Var = new cx0(hx0Var, str);
            Pattern pattern2 = org.telegram.ui.Components.b5.a;
            if (parentActivity2 == null) {
                return;
            }
            int i14 = org.telegram.ui.ActionBar.n6.j5;
            int g10 = i6Var != null ? i6Var.g(i14) : org.telegram.ui.ActionBar.n6.x0(null, i14, false);
            int i15 = org.telegram.ui.ActionBar.n6.h5;
            int g11 = i6Var != null ? i6Var.g(i15) : org.telegram.ui.ActionBar.n6.x0(null, i15, false);
            int i16 = org.telegram.ui.ActionBar.n6.Aj;
            if (i6Var != null) {
                i6Var.g(i16);
            } else {
                org.telegram.ui.ActionBar.n6.x0(null, i16, false);
            }
            int i17 = org.telegram.ui.ActionBar.n6.Ej;
            if (i6Var != null) {
                i6Var.g(i17);
            } else {
                org.telegram.ui.ActionBar.n6.x0(null, i17, false);
            }
            int i18 = org.telegram.ui.ActionBar.n6.E8;
            if (i6Var != null) {
                i6Var.g(i18);
            } else {
                org.telegram.ui.ActionBar.n6.x0(null, i18, false);
            }
            int i19 = org.telegram.ui.ActionBar.n6.G8;
            if (i6Var != null) {
                i6Var.g(i19);
            } else {
                org.telegram.ui.ActionBar.n6.x0(null, i19, false);
            }
            int i20 = org.telegram.ui.ActionBar.n6.i6;
            if (i6Var != null) {
                i6Var.g(i20);
            } else {
                org.telegram.ui.ActionBar.n6.x0(null, i20, false);
            }
            int i21 = org.telegram.ui.ActionBar.n6.Ji;
            int g12 = i6Var != null ? i6Var.g(i21) : org.telegram.ui.ActionBar.n6.x0(null, i21, false);
            int i22 = org.telegram.ui.ActionBar.n6.Fi;
            int g13 = i6Var != null ? i6Var.g(i22) : org.telegram.ui.ActionBar.n6.x0(null, i22, false);
            int i23 = org.telegram.ui.ActionBar.n6.Hi;
            int g14 = i6Var != null ? i6Var.g(i23) : org.telegram.ui.ActionBar.n6.x0(null, i23, false);
            h6.o oVar = new h6.o(parentActivity2, i6Var);
            ((org.telegram.ui.ActionBar.w2) oVar.b).w0 = false;
            org.telegram.ui.Components.m4 m4Var = new org.telegram.ui.Components.m4(parentActivity2, i6Var);
            m4Var.setMinValue(0);
            m4Var.setMaxValue(10);
            m4Var.setTextColor(g10);
            m4Var.setValue(r9 - 1);
            m4Var.setWrapSelectorWheel(false);
            m4Var.setFormatter(new cr(25));
            org.telegram.ui.Components.n4 n4Var = new org.telegram.ui.Components.n4(parentActivity2, i6Var);
            n4Var.setMinValue(0);
            n4Var.setMaxValue(10);
            n4Var.setTextColor(g10);
            n4Var.setValue((c11 / 60) - 1);
            n4Var.setWrapSelectorWheel(false);
            n4Var.setFormatter(new cr(26));
            org.telegram.ui.Components.qb0 qb0Var = new org.telegram.ui.Components.qb0(parentActivity2, i6Var);
            qb0Var.setMinValue(0);
            qb0Var.setMaxValue(0);
            qb0Var.setTextColor(g10);
            qb0Var.setValue(0);
            qb0Var.setWrapSelectorWheel(false);
            qb0Var.setFormatter(new cr(27));
            org.telegram.ui.Components.v3 v3Var = new org.telegram.ui.Components.v3(parentActivity2, m4Var, n4Var, qb0Var, 5);
            v3Var.setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(parentActivity2);
            v3Var.addView(frameLayout, c8.na.t(-1, -2, 51, 22, 0, 0, 4));
            TextView textView2 = new TextView(parentActivity2);
            textView2.setText(org.telegram.messenger.gd.N0(2131747927, null));
            textView2.setTextColor(g10);
            i5.c.x(textView2, 1, 20.0f);
            frameLayout.addView(textView2, c8.na.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
            textView2.setOnTouchListener(new gi.a(10));
            LinearLayout linearLayout = new LinearLayout(parentActivity2);
            linearLayout.setOrientation(0);
            linearLayout.setWeightSum(1.0f);
            v3Var.addView(linearLayout, c8.na.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
            di.xb xbVar = new di.xb(parentActivity2, 18);
            linearLayout.addView(m4Var, c8.na.l(0.4f, 0, org.telegram.messenger.ks.t4));
            linearLayout.addView(qb0Var, c8.na.p(0, -2, 0.2f, 16));
            linearLayout.addView(n4Var, c8.na.l(0.4f, 0, org.telegram.messenger.ks.t4));
            xbVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
            xbVar.setGravity(17);
            xbVar.setTextColor(g12);
            xbVar.setTextSize(1, 14.0f);
            xbVar.setTypeface(org.telegram.messenger.g0.o());
            int L = org.telegram.messenger.g0.L(8.0f);
            xbVar.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.k0(L, L, L, L, g13, g14, g14));
            xbVar.setText(org.telegram.messenger.gd.N0(2131753863, null));
            v3Var.addView(xbVar, c8.na.t(-1, 48, 83, 16, 15, 16, 16));
            cr crVar = new cr(11);
            m4Var.setOnValueChangedListener(crVar);
            n4Var.setOnValueChangedListener(crVar);
            xbVar.setOnClickListener(new bi.s6(m4Var, n4Var, cx0Var, oVar, 8));
            org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) oVar.b;
            w2Var.O = v3Var;
            w2Var.show();
            w2Var.v0(g11);
            w2Var.P(g11);
        }
    }

    public static void b0(hx0 hx0Var, String str) {
        hx0Var.c0 = true;
        org.telegram.messenger.mp.u1(hx0Var.currentAccount).g7.edit().putBoolean("custom_" + str, false).remove("notify2_" + str).apply();
        hx0Var.finishFragment();
        gx0 gx0Var = hx0Var.s;
        if (gx0Var != null) {
            gx0Var.Q();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.d6));
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        long j3 = this.f;
        long j10 = this.h;
        String v = org.telegram.messenger.xs.v(j3, j10, false);
        this.simpleActionBar.setActionBarMenuOnItemClick(new ex0(this, v));
        org.telegram.ui.ActionBar.i6 i6Var = this.e;
        org.telegram.ui.Components.zn znVar = new org.telegram.ui.Components.zn(context, null, false, i6Var);
        this.w = znVar;
        znVar.setOccupyStatusBar(!org.telegram.messenger.g0.Q1());
        if (j3 >= 0) {
            TLRPC.User c22 = getMessagesController().c2(Long.valueOf(j3));
            if (c22 != null) {
                this.w.setUserAvatar(c22);
                this.simpleActionBar.setTitle(org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name));
            }
        } else if (j10 != 0) {
            TLRPC.TL_forumTopic f10 = getMessagesController().t7.f(-j3, j10);
            qg.c.q(this.w.getAvatarImageView(), f10, false, true, i6Var);
            this.simpleActionBar.setTitle(f10.title);
        } else {
            TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(-j3));
            this.w.setChatAvatar(O0);
            this.simpleActionBar.setTitle(O0.title);
        }
        if (this.n) {
            this.simpleActionBar.setSubtitle(org.telegram.messenger.gd.N0(2131747701, null));
            this.simpleActionBar.s(org.telegram.messenger.gd.N0(2131745750, null));
        } else {
            this.simpleActionBar.setSubtitle(org.telegram.messenger.gd.N0(2131751672, null));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.b = ek0Var;
        ek0Var.r1();
        this.b.setSectionsDrawBackground(true);
        frameLayout.addView(this.b, c8.na.c(-1.0f, -1));
        org.telegram.ui.Components.ek0 ek0Var2 = this.b;
        fx0 fx0Var = new fx0(this, context);
        this.c = fx0Var;
        ek0Var2.setAdapter(fx0Var);
        this.b.setItemAnimator(null);
        this.b.setLayoutAnimation(null);
        this.b.setLayoutManager(new jg.b0(17));
        this.b.setOnItemClickListener(new y51(this, context, v, i7));
        this.a = frameLayout;
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.f0) {
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
    public final org.telegram.ui.ActionBar.i6 getResourceProvider() {
        return this.e;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(19, this);
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, new Class[]{org.telegram.ui.Cells.ra.class}, new String[]{"statusColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.n6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, new Class[]{org.telegram.ui.Cells.ra.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.n6.n6));
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
            str = i7 == 13 ? uri.equals(Settings.System.DEFAULT_RINGTONE_URI) ? org.telegram.messenger.gd.N0(2131751587, null) : ringtone.getTitle(getParentActivity()) : uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI) ? org.telegram.messenger.gd.N0(2131745084, null) : ringtone.getTitle(getParentActivity());
            ringtone.stop();
        }
        SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(this.currentAccount).g7.edit();
        String v = org.telegram.messenger.xs.v(this.f, this.h, false);
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
        fx0 fx0Var = this.c;
        if (fx0Var != null) {
            fx0Var.g(i7 == 13 ? this.S : this.H);
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
            TLRPC.Chat O0 = org.telegram.messenger.mp.u1(this.currentAccount).O0(Long.valueOf(-j3));
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
                boolean D = org.telegram.messenger.xs.t(this.currentAccount).D(this.f, null, false, false);
                if (z11) {
                    SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(this.currentAccount).g7;
                    String v = org.telegram.messenger.xs.v(j3, j10, false);
                    boolean contains = sharedPreferences.contains("notify2_" + v);
                    int c10 = org.telegram.messenger.f3.c("notify2_", v, sharedPreferences, 0);
                    if (c10 == 0) {
                        if (contains) {
                            this.r = true;
                        } else {
                            this.r = org.telegram.messenger.xs.t(this.currentAccount).D(this.f, null, false, false);
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
                org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f0);
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
        boolean D2 = org.telegram.messenger.xs.t(this.currentAccount).D(this.f, null, false, false);
        if (z11) {
        }
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f0);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.c0) {
            String v = org.telegram.messenger.xs.v(this.f, this.h, false);
            org.telegram.messenger.mp.u1(this.currentAccount).g7.edit().putBoolean("custom_" + v, true).apply();
        }
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f0);
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
            this.a.addView(this.w.e, c8.na.e(42, 42, 53));
        }
        org.telegram.messenger.g0.z3(this.w.e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(42.0f)) / 2) + this.mSystemInsets.b, org.telegram.messenger.g0.L(6.0f), 0);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
