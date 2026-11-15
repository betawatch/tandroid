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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class fx0 extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
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
    public org.telegram.ui.Components.uj0 b;
    public boolean b0;
    public dx0 c;
    public boolean c0;
    public AnimatorSet d;
    public final org.telegram.ui.ActionBar.e6 e;
    public final long f;
    public final long h;
    public final boolean n;
    public boolean r;
    public ex0 s;
    public org.telegram.ui.Components.sn w;
    public int x;
    public int y;

    public fx0(Bundle bundle, org.telegram.ui.ActionBar.e6 e6Var) {
        super(bundle);
        this.e = e6Var;
        this.f = bundle.getLong("dialog_id");
        this.h = bundle.getLong("topic_id");
        this.n = bundle.getBoolean("exception", false);
    }

    public static void Z(fx0 fx0Var, String str, int i7, int i10) {
        org.telegram.messenger.np.s1(fx0Var.currentAccount).e7.edit().putInt("smart_max_count_" + str, i7).putInt("smart_delay_" + str, i10).apply();
        dx0 dx0Var = fx0Var.c;
        if (dx0Var != null) {
            dx0Var.g(fx0Var.J);
        }
    }

    public static void a0(final fx0 fx0Var, Context context, String str, View view, int i7) {
        org.telegram.ui.ActionBar.e6 e6Var = fx0Var.e;
        if (view.isEnabled()) {
            final int i10 = 0;
            Parcelable parcelable = null;
            if (i7 == fx0Var.Y) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
                String M0 = org.telegram.messenger.hd.M0(2131746102, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = M0;
                t1Var.U = org.telegram.messenger.hd.M0(2131746103, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746118, null), new ax0(fx0Var, str));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                fx0Var.showDialog(t1Var);
                TextView textView = (TextView) t1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.q7, null);
                    return;
                }
                return;
            }
            if (i7 == fx0Var.H) {
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", fx0Var.f);
                bundle.putLong("topic_id", fx0Var.h);
                fx0Var.presentFragment(new uh0(bundle, e6Var));
                return;
            }
            final int i11 = 1;
            if (i7 == fx0Var.S) {
                try {
                    Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                    intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                    intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                    SharedPreferences sharedPreferences = org.telegram.messenger.np.s1(fx0Var.currentAccount).e7;
                    Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
                    String path = uri != null ? uri.getPath() : null;
                    String string = sharedPreferences.getString("ringtone_path_" + str, path);
                    if (string != null && !string.equals("NoSound")) {
                        parcelable = string.equals(path) ? uri : Uri.parse(string);
                    }
                    intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", parcelable);
                    fx0Var.startActivityForResult(intent, 13);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            }
            if (i7 == fx0Var.I) {
                Activity parentActivity = fx0Var.getParentActivity();
                long j3 = fx0Var.f;
                long j10 = fx0Var.h;
                Runnable runnable = new Runnable(fx0Var) { // from class: org.telegram.ui.bx0
                    public final /* synthetic */ fx0 b;

                    {
                        this.b = fx0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                fx0 fx0Var2 = this.b;
                                dx0 dx0Var = fx0Var2.c;
                                if (dx0Var != null) {
                                    dx0Var.g(fx0Var2.I);
                                    break;
                                }
                                break;
                            case 1:
                                fx0 fx0Var3 = this.b;
                                dx0 dx0Var2 = fx0Var3.c;
                                if (dx0Var2 != null) {
                                    dx0Var2.g(fx0Var3.T);
                                    break;
                                }
                                break;
                            case 2:
                                fx0 fx0Var4 = this.b;
                                dx0 dx0Var3 = fx0Var4.c;
                                if (dx0Var3 != null) {
                                    dx0Var3.g(fx0Var4.K);
                                    break;
                                }
                                break;
                            default:
                                fx0 fx0Var5 = this.b;
                                dx0 dx0Var4 = fx0Var5.c;
                                if (dx0Var4 != null) {
                                    dx0Var4.g(fx0Var5.W);
                                    break;
                                }
                                break;
                        }
                    }
                };
                org.telegram.ui.ActionBar.e6 e6Var2 = fx0Var.e;
                Pattern pattern = org.telegram.ui.Components.t4.a;
                fx0Var.showDialog(org.telegram.ui.Components.t4.V(parentActivity, j3, j10, j3 != 0 ? a8.p0.o(j3, "vibrate_") : "vibrate_messages", runnable, e6Var2));
                return;
            }
            int i12 = 24;
            final int i13 = 3;
            if (i7 == fx0Var.F) {
                org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                boolean z10 = !q8Var.e.h;
                fx0Var.r = z10;
                q8Var.setChecked(z10);
                int childCount = fx0Var.b.getChildCount();
                ArrayList arrayList = new ArrayList();
                while (i10 < childCount) {
                    org.telegram.ui.Components.cj0 cj0Var = (org.telegram.ui.Components.cj0) fx0Var.b.T(fx0Var.b.getChildAt(i10));
                    int i14 = cj0Var.f;
                    View view2 = cj0Var.a;
                    int b10 = cj0Var.b();
                    if (b10 != fx0Var.F && b10 != fx0Var.Y) {
                        if (i14 == 0) {
                            ((org.telegram.ui.Cells.n4) view2).a(arrayList, fx0Var.r);
                        } else if (i14 == 1) {
                            ((org.telegram.ui.Cells.v9) view2).a(arrayList, fx0Var.r);
                        } else if (i14 == 2) {
                            ((org.telegram.ui.Cells.y8) view2).c(arrayList, fx0Var.r);
                        } else if (i14 == 3) {
                            ((org.telegram.ui.Cells.s8) view2).a(arrayList, fx0Var.r);
                        } else if (i14 == 4) {
                            ((org.telegram.ui.Cells.h6) view2).b(arrayList, fx0Var.r);
                        } else if (i14 == 7 && b10 == fx0Var.G) {
                            ((org.telegram.ui.Cells.q8) view2).e(arrayList, fx0Var.r);
                        }
                    }
                    i10++;
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                AnimatorSet animatorSet = fx0Var.d;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                fx0Var.d = animatorSet2;
                animatorSet2.playTogether(arrayList);
                fx0Var.d.addListener(new xx(fx0Var, i12));
                fx0Var.d.setDuration(150L);
                fx0Var.d.start();
                return;
            }
            if (i7 == fx0Var.G) {
                org.telegram.ui.Cells.q8 q8Var2 = (org.telegram.ui.Cells.q8) view;
                Switch r32 = q8Var2.e;
                org.telegram.messenger.np.s1(fx0Var.currentAccount).e7.edit().putBoolean(r.b.k("content_preview_", str), !r32.h).apply();
                q8Var2.setChecked(!r32.h);
                return;
            }
            if (i7 == fx0Var.T) {
                fx0Var.showDialog(org.telegram.ui.Components.t4.V(fx0Var.getParentActivity(), fx0Var.f, fx0Var.h, r.b.k("calls_vibrate_", str), new Runnable(fx0Var) { // from class: org.telegram.ui.bx0
                    public final /* synthetic */ fx0 b;

                    {
                        this.b = fx0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                fx0 fx0Var2 = this.b;
                                dx0 dx0Var = fx0Var2.c;
                                if (dx0Var != null) {
                                    dx0Var.g(fx0Var2.I);
                                    break;
                                }
                                break;
                            case 1:
                                fx0 fx0Var3 = this.b;
                                dx0 dx0Var2 = fx0Var3.c;
                                if (dx0Var2 != null) {
                                    dx0Var2.g(fx0Var3.T);
                                    break;
                                }
                                break;
                            case 2:
                                fx0 fx0Var4 = this.b;
                                dx0 dx0Var3 = fx0Var4.c;
                                if (dx0Var3 != null) {
                                    dx0Var3.g(fx0Var4.K);
                                    break;
                                }
                                break;
                            default:
                                fx0 fx0Var5 = this.b;
                                dx0 dx0Var4 = fx0Var5.c;
                                if (dx0Var4 != null) {
                                    dx0Var4.g(fx0Var5.W);
                                    break;
                                }
                                break;
                        }
                    }
                }, fx0Var.e));
                return;
            }
            if (i7 == fx0Var.K) {
                fx0Var.showDialog(org.telegram.ui.Components.t4.F(fx0Var.getParentActivity(), fx0Var.f, fx0Var.h, -1, new Runnable(fx0Var) { // from class: org.telegram.ui.bx0
                    public final /* synthetic */ fx0 b;

                    {
                        this.b = fx0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (r2) {
                            case 0:
                                fx0 fx0Var2 = this.b;
                                dx0 dx0Var = fx0Var2.c;
                                if (dx0Var != null) {
                                    dx0Var.g(fx0Var2.I);
                                    break;
                                }
                                break;
                            case 1:
                                fx0 fx0Var3 = this.b;
                                dx0 dx0Var2 = fx0Var3.c;
                                if (dx0Var2 != null) {
                                    dx0Var2.g(fx0Var3.T);
                                    break;
                                }
                                break;
                            case 2:
                                fx0 fx0Var4 = this.b;
                                dx0 dx0Var3 = fx0Var4.c;
                                if (dx0Var3 != null) {
                                    dx0Var3.g(fx0Var4.K);
                                    break;
                                }
                                break;
                            default:
                                fx0 fx0Var5 = this.b;
                                dx0 dx0Var4 = fx0Var5.c;
                                if (dx0Var4 != null) {
                                    dx0Var4.g(fx0Var5.W);
                                    break;
                                }
                                break;
                        }
                    }
                }, fx0Var.e));
                return;
            }
            if (i7 != fx0Var.J) {
                if (i7 == fx0Var.W) {
                    if (fx0Var.getParentActivity() == null) {
                        return;
                    }
                    fx0Var.showDialog(org.telegram.ui.Components.t4.t(fx0Var.getParentActivity(), fx0Var.f, fx0Var.h, -1, new Runnable(fx0Var) { // from class: org.telegram.ui.bx0
                        public final /* synthetic */ fx0 b;

                        {
                            this.b = fx0Var;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i13) {
                                case 0:
                                    fx0 fx0Var2 = this.b;
                                    dx0 dx0Var = fx0Var2.c;
                                    if (dx0Var != null) {
                                        dx0Var.g(fx0Var2.I);
                                        break;
                                    }
                                    break;
                                case 1:
                                    fx0 fx0Var3 = this.b;
                                    dx0 dx0Var2 = fx0Var3.c;
                                    if (dx0Var2 != null) {
                                        dx0Var2.g(fx0Var3.T);
                                        break;
                                    }
                                    break;
                                case 2:
                                    fx0 fx0Var4 = this.b;
                                    dx0 dx0Var3 = fx0Var4.c;
                                    if (dx0Var3 != null) {
                                        dx0Var3.g(fx0Var4.K);
                                        break;
                                    }
                                    break;
                                default:
                                    fx0 fx0Var5 = this.b;
                                    dx0 dx0Var4 = fx0Var5.c;
                                    if (dx0Var4 != null) {
                                        dx0Var4.g(fx0Var5.W);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, fx0Var.e));
                    return;
                }
                if (i7 == fx0Var.N) {
                    org.telegram.messenger.np.s1(fx0Var.currentAccount).e7.edit().putInt("popup_" + str, 1).apply();
                    ((org.telegram.ui.Cells.h6) view).a(true, true);
                    View findViewWithTag = fx0Var.b.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((org.telegram.ui.Cells.h6) findViewWithTag).a(false, true);
                        return;
                    }
                    return;
                }
                if (i7 == fx0Var.O) {
                    org.telegram.messenger.np.s1(fx0Var.currentAccount).e7.edit().putInt("popup_" + str, 2).apply();
                    ((org.telegram.ui.Cells.h6) view).a(true, true);
                    View findViewWithTag2 = fx0Var.b.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((org.telegram.ui.Cells.h6) findViewWithTag2).a(false, true);
                        return;
                    }
                    return;
                }
                if (i7 == fx0Var.Q) {
                    org.telegram.ui.Cells.q8 q8Var3 = (org.telegram.ui.Cells.q8) view;
                    boolean z11 = q8Var3.e.h;
                    boolean z12 = !z11;
                    q8Var3.setChecked(z12);
                    SharedPreferences.Editor edit = org.telegram.messenger.np.s1(fx0Var.currentAccount).e7.edit();
                    if (!fx0Var.b0 || z11) {
                        edit.putBoolean("stories_" + str, z12);
                    } else {
                        edit.remove("stories_" + str);
                    }
                    edit.apply();
                    fx0Var.getNotificationsController().c0(fx0Var.f, fx0Var.h, true);
                    return;
                }
                return;
            }
            if (fx0Var.getParentActivity() == null) {
                return;
            }
            SharedPreferences sharedPreferences2 = org.telegram.messenger.np.s1(fx0Var.currentAccount).e7;
            int c10 = org.telegram.messenger.k5.c("smart_max_count_", str, sharedPreferences2, 2);
            int c11 = org.telegram.messenger.k5.c("smart_delay_", str, sharedPreferences2, org.telegram.messenger.ns.K2);
            r10 = c10 != 0 ? c10 : 2;
            Activity parentActivity2 = fx0Var.getParentActivity();
            ax0 ax0Var = new ax0(fx0Var, str);
            Pattern pattern2 = org.telegram.ui.Components.t4.a;
            if (parentActivity2 == null) {
                return;
            }
            int i15 = org.telegram.ui.ActionBar.j6.j5;
            int f10 = e6Var != null ? e6Var.f(i15) : org.telegram.ui.ActionBar.j6.x0(null, i15, false);
            int i16 = org.telegram.ui.ActionBar.j6.h5;
            int f11 = e6Var != null ? e6Var.f(i16) : org.telegram.ui.ActionBar.j6.x0(null, i16, false);
            int i17 = org.telegram.ui.ActionBar.j6.Aj;
            if (e6Var != null) {
                e6Var.f(i17);
            } else {
                org.telegram.ui.ActionBar.j6.x0(null, i17, false);
            }
            int i18 = org.telegram.ui.ActionBar.j6.Ej;
            if (e6Var != null) {
                e6Var.f(i18);
            } else {
                org.telegram.ui.ActionBar.j6.x0(null, i18, false);
            }
            int i19 = org.telegram.ui.ActionBar.j6.E8;
            if (e6Var != null) {
                e6Var.f(i19);
            } else {
                org.telegram.ui.ActionBar.j6.x0(null, i19, false);
            }
            int i20 = org.telegram.ui.ActionBar.j6.G8;
            if (e6Var != null) {
                e6Var.f(i20);
            } else {
                org.telegram.ui.ActionBar.j6.x0(null, i20, false);
            }
            int i21 = org.telegram.ui.ActionBar.j6.i6;
            if (e6Var != null) {
                e6Var.f(i21);
            } else {
                org.telegram.ui.ActionBar.j6.x0(null, i21, false);
            }
            int i22 = org.telegram.ui.ActionBar.j6.Ji;
            int f12 = e6Var != null ? e6Var.f(i22) : org.telegram.ui.ActionBar.j6.x0(null, i22, false);
            int i23 = org.telegram.ui.ActionBar.j6.Fi;
            int f13 = e6Var != null ? e6Var.f(i23) : org.telegram.ui.ActionBar.j6.x0(null, i23, false);
            int i24 = org.telegram.ui.ActionBar.j6.Hi;
            int f14 = e6Var != null ? e6Var.f(i24) : org.telegram.ui.ActionBar.j6.x0(null, i24, false);
            org.telegram.messenger.ou ouVar = new org.telegram.messenger.ou(parentActivity2, e6Var);
            ((org.telegram.ui.ActionBar.u2) ouVar.b).w0 = false;
            org.telegram.ui.Components.e4 e4Var = new org.telegram.ui.Components.e4(parentActivity2, e6Var);
            e4Var.setMinValue(0);
            e4Var.setMaxValue(10);
            e4Var.setTextColor(f10);
            e4Var.setValue(r10 - 1);
            e4Var.setWrapSelectorWheel(false);
            e4Var.setFormatter(new br(i12));
            org.telegram.ui.Components.f4 f4Var = new org.telegram.ui.Components.f4(parentActivity2, e6Var);
            f4Var.setMinValue(0);
            f4Var.setMaxValue(10);
            f4Var.setTextColor(f10);
            f4Var.setValue((c11 / 60) - 1);
            f4Var.setWrapSelectorWheel(false);
            f4Var.setFormatter(new br(25));
            org.telegram.ui.Components.ib0 ib0Var = new org.telegram.ui.Components.ib0(parentActivity2, e6Var);
            ib0Var.setMinValue(0);
            ib0Var.setMaxValue(0);
            ib0Var.setTextColor(f10);
            ib0Var.setValue(0);
            ib0Var.setWrapSelectorWheel(false);
            ib0Var.setFormatter(new br(26));
            org.telegram.ui.Components.n3 n3Var = new org.telegram.ui.Components.n3(parentActivity2, e4Var, f4Var, ib0Var, 5);
            n3Var.setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(parentActivity2);
            n3Var.addView(frameLayout, c8.ja.t(-1, -2, 51, 22, 0, 0, 4));
            TextView textView2 = new TextView(parentActivity2);
            textView2.setText(org.telegram.messenger.hd.M0(2131748120, null));
            textView2.setTextColor(f10);
            i5.c.v(textView2, 1, 20.0f);
            frameLayout.addView(textView2, c8.ja.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
            textView2.setOnTouchListener(new gi.a(10));
            LinearLayout linearLayout = new LinearLayout(parentActivity2);
            linearLayout.setOrientation(0);
            linearLayout.setWeightSum(1.0f);
            n3Var.addView(linearLayout, c8.ja.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
            di.tb tbVar = new di.tb(parentActivity2, 18);
            linearLayout.addView(e4Var, c8.ja.l(0.4f, 0, org.telegram.messenger.ns.t4));
            linearLayout.addView(ib0Var, c8.ja.p(0, -2, 0.2f, 16));
            linearLayout.addView(f4Var, c8.ja.l(0.4f, 0, org.telegram.messenger.ns.t4));
            tbVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
            tbVar.setGravity(17);
            tbVar.setTextColor(f12);
            tbVar.setTextSize(1, 14.0f);
            tbVar.setTypeface(org.telegram.messenger.g0.o());
            int L = org.telegram.messenger.g0.L(8.0f);
            tbVar.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.k0(L, L, L, L, f13, f14, f14));
            tbVar.setText(org.telegram.messenger.hd.M0(2131753866, null));
            n3Var.addView(tbVar, c8.ja.t(-1, 48, 83, 16, 15, 16, 16));
            br brVar = new br(10);
            e4Var.setOnValueChangedListener(brVar);
            f4Var.setOnValueChangedListener(brVar);
            tbVar.setOnClickListener(new bi.f4(e4Var, f4Var, ax0Var, ouVar, 8));
            org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) ouVar.b;
            u2Var.O = n3Var;
            u2Var.show();
            u2Var.v0(f11);
            u2Var.P(f11);
        }
    }

    public static void b0(fx0 fx0Var, String str) {
        fx0Var.c0 = true;
        org.telegram.messenger.np.s1(fx0Var.currentAccount).e7.edit().putBoolean("custom_" + str, false).remove("notify2_" + str).apply();
        fx0Var.finishFragment();
        ex0 ex0Var = fx0Var.s;
        if (ex0Var != null) {
            ex0Var.b0();
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.d6));
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        long j3 = this.f;
        long j10 = this.h;
        String v = org.telegram.messenger.at.v(j3, j10, false);
        this.simpleActionBar.setActionBarMenuOnItemClick(new cx0(this, v));
        org.telegram.ui.ActionBar.e6 e6Var = this.e;
        org.telegram.ui.Components.sn snVar = new org.telegram.ui.Components.sn(context, null, false, e6Var);
        this.w = snVar;
        snVar.setOccupyStatusBar(!org.telegram.messenger.g0.Q1());
        if (j3 >= 0) {
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j3));
            if (a22 != null) {
                this.w.setUserAvatar(a22);
                this.simpleActionBar.setTitle(org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
            }
        } else if (j10 != 0) {
            TLRPC.TL_forumTopic f10 = getMessagesController().r7.f(-j3, j10);
            qg.c.p(this.w.getAvatarImageView(), f10, false, true, e6Var);
            this.simpleActionBar.setTitle(f10.title);
        } else {
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j3));
            this.w.setChatAvatar(M0);
            this.simpleActionBar.setTitle(M0.title);
        }
        if (this.n) {
            this.simpleActionBar.setSubtitle(org.telegram.messenger.hd.M0(2131747895, null));
            this.simpleActionBar.q(org.telegram.messenger.hd.M0(2131745946, null));
        } else {
            this.simpleActionBar.setSubtitle(org.telegram.messenger.hd.M0(2131751684, null));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.b = uj0Var;
        uj0Var.r1();
        this.b.setSectionsDrawBackground(true);
        frameLayout.addView(this.b, c8.ja.c(-1.0f, -1));
        org.telegram.ui.Components.uj0 uj0Var2 = this.b;
        dx0 dx0Var = new dx0(this, context);
        this.c = dx0Var;
        uj0Var2.setAdapter(dx0Var);
        this.b.setItemAnimator(null);
        this.b.setLayoutAnimation(null);
        this.b.setLayoutManager(new jg.b0(17));
        this.b.setOnItemClickListener(new w51(this, context, v, i7));
        this.a = frameLayout;
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.f0) {
            try {
                this.c.f();
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        return this.e;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(19, this);
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.b, 0, new Class[]{org.telegram.ui.Cells.oa.class}, new String[]{"statusColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.j6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.b, 0, new Class[]{org.telegram.ui.Cells.oa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.j6.n6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        Ringtone ringtone;
        if (i10 != -1 || intent == null) {
            return;
        }
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
        String str = null;
        if (uri != null && (ringtone = RingtoneManager.getRingtone(org.telegram.messenger.t0.b, uri)) != null) {
            str = i7 == 13 ? uri.equals(Settings.System.DEFAULT_RINGTONE_URI) ? org.telegram.messenger.hd.M0(2131751599, null) : ringtone.getTitle(getParentActivity()) : uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI) ? org.telegram.messenger.hd.M0(2131745280, null) : ringtone.getTitle(getParentActivity());
            ringtone.stop();
        }
        SharedPreferences.Editor edit = org.telegram.messenger.np.s1(this.currentAccount).e7.edit();
        String v = org.telegram.messenger.at.v(this.f, this.h, false);
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
        dx0 dx0Var = this.c;
        if (dx0Var != null) {
            dx0Var.g(i7 == 13 ? this.S : this.H);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010f  */
    @Override // org.telegram.ui.ActionBar.e2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        boolean z10;
        long j3 = this.f;
        if (org.telegram.messenger.m5.E(j3)) {
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
        if (org.telegram.messenger.m5.C(j3)) {
            this.G = -1;
        } else {
            int i12 = this.a0;
            this.a0 = i12 + 1;
            this.G = i12;
            if (org.telegram.messenger.m5.E(j3)) {
                int i13 = this.a0;
                this.a0 = i13 + 1;
                this.Q = i13;
            }
        }
        int i14 = this.a0;
        this.H = i14;
        this.a0 = i14 + 2;
        this.I = i14 + 1;
        if (org.telegram.messenger.m5.z(j3)) {
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
        if (org.telegram.messenger.m5.z(j3)) {
            TLRPC.Chat M0 = org.telegram.messenger.np.s1(this.currentAccount).M0(Long.valueOf(-j3));
            if (org.telegram.messenger.t3.T(M0) && !M0.megagroup) {
                z10 = true;
                if (!org.telegram.messenger.m5.C(j3) || z10) {
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
                if (org.telegram.messenger.m5.E(j3)) {
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
                boolean D = org.telegram.messenger.at.t(this.currentAccount).D(this.f, null, false, false);
                if (z11) {
                    SharedPreferences sharedPreferences = org.telegram.messenger.np.s1(this.currentAccount).e7;
                    String v = org.telegram.messenger.at.v(j3, j10, false);
                    boolean contains = sharedPreferences.contains("notify2_" + v);
                    int c10 = org.telegram.messenger.k5.c("notify2_", v, sharedPreferences, 0);
                    if (c10 == 0) {
                        if (contains) {
                            this.r = true;
                        } else {
                            this.r = org.telegram.messenger.at.t(this.currentAccount).D(this.f, null, false, false);
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
                org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.f0);
                return super.onFragmentCreate();
            }
        }
        z10 = false;
        if (org.telegram.messenger.m5.C(j3)) {
        }
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.P = -1;
        if (org.telegram.messenger.m5.E(j3)) {
        }
        int i192 = this.a0;
        this.V = i192;
        this.W = i192 + 1;
        int i202 = i192 + 3;
        this.a0 = i202;
        this.X = i192 + 2;
        if (z11) {
        }
        boolean D2 = org.telegram.messenger.at.t(this.currentAccount).D(this.f, null, false, false);
        if (z11) {
        }
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.f0);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.c0) {
            String v = org.telegram.messenger.at.v(this.f, this.h, false);
            org.telegram.messenger.np.s1(this.currentAccount).e7.edit().putBoolean("custom_" + v, true).apply();
        }
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.f0);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        super.onInsets(i7, i10, i11, i12);
        org.telegram.messenger.g0.A3(this.w.e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(42.0f)) / 2) + this.mSystemInsets.b, org.telegram.messenger.g0.L(6.0f), 0);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        org.telegram.messenger.g0.E2(this.w.e);
        if (!this.n) {
            this.a.addView(this.w.e, c8.ja.e(42, 42, 53));
        }
        org.telegram.messenger.g0.A3(this.w.e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(42.0f)) / 2) + this.mSystemInsets.b, org.telegram.messenger.g0.L(6.0f), 0);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
