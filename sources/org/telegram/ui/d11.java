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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.NotificationsSettingsFacade;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class d11 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
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
    public boolean Z;
    public org.telegram.ui.Components.mm0 a;
    public boolean a0;
    public b11 b;
    public AnimatorSet c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final long e;
    public final long f;
    public final boolean h;
    public boolean n;
    public c11 r;
    public org.telegram.ui.Components.oo s;
    public int v;
    public int w;
    public int x;
    public int y;

    public d11(Bundle bundle, org.telegram.ui.ActionBar.g6 g6Var) {
        super(bundle);
        this.d = g6Var;
        this.e = bundle.getLong("dialog_id");
        this.f = bundle.getLong("topic_id");
        this.h = bundle.getBoolean("exception", false);
    }

    public static /* synthetic */ void U(d11 d11Var, String str, int i10, int i11) {
        MessagesController.getNotificationsSettings(d11Var.currentAccount).edit().putInt("smart_max_count_" + str, i10).putInt("smart_delay_" + str, i11).apply();
        b11 b11Var = d11Var.b;
        if (b11Var != null) {
            b11Var.m(d11Var.H);
        }
    }

    public static void V(final d11 d11Var, Context context, String str, View view, int i10) {
        long j10 = d11Var.f;
        long j11 = d11Var.e;
        org.telegram.ui.ActionBar.g6 g6Var = d11Var.d;
        if (view.isEnabled()) {
            Parcelable parcelable = null;
            final int i11 = 0;
            if (i10 == d11Var.W) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
                String string = LocaleController.getString(R.string.ResetCustomNotificationsAlertTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                c2Var.R = string;
                c2Var.T = LocaleController.getString(R.string.ResetCustomNotificationsAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new y01(d11Var, str));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                d11Var.showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.q7, null);
                    return;
                }
                return;
            }
            if (i10 == d11Var.F) {
                Bundle e = si.o0.e(j11, "dialog_id");
                e.putLong("topic_id", j10);
                d11Var.presentFragment(new nk0(e, g6Var));
                return;
            }
            final int i12 = 1;
            if (i10 == d11Var.Q) {
                try {
                    Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                    intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                    intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(d11Var.currentAccount);
                    Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
                    String path = uri != null ? uri.getPath() : null;
                    String string2 = notificationsSettings.getString("ringtone_path_" + str, path);
                    if (string2 != null && !string2.equals("NoSound")) {
                        parcelable = string2.equals(path) ? uri : Uri.parse(string2);
                    }
                    intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", parcelable);
                    d11Var.startActivityForResult(intent, 13);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            }
            if (i10 == d11Var.G) {
                Activity parentActivity = d11Var.getParentActivity();
                long j12 = d11Var.e;
                long j13 = d11Var.f;
                Runnable runnable = new Runnable(d11Var) { // from class: org.telegram.ui.z01
                    public final /* synthetic */ d11 b;

                    {
                        this.b = d11Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                d11 d11Var2 = this.b;
                                b11 b11Var = d11Var2.b;
                                if (b11Var != null) {
                                    b11Var.m(d11Var2.G);
                                    break;
                                }
                                break;
                            case 1:
                                d11 d11Var3 = this.b;
                                b11 b11Var2 = d11Var3.b;
                                if (b11Var2 != null) {
                                    b11Var2.m(d11Var3.R);
                                    break;
                                }
                                break;
                            case 2:
                                d11 d11Var4 = this.b;
                                b11 b11Var3 = d11Var4.b;
                                if (b11Var3 != null) {
                                    b11Var3.m(d11Var4.I);
                                    break;
                                }
                                break;
                            default:
                                d11 d11Var5 = this.b;
                                b11 b11Var4 = d11Var5.b;
                                if (b11Var4 != null) {
                                    b11Var4.m(d11Var5.U);
                                    break;
                                }
                                break;
                        }
                    }
                };
                org.telegram.ui.ActionBar.g6 g6Var2 = d11Var.d;
                Pattern pattern = org.telegram.ui.Components.f5.a;
                d11Var.showDialog(org.telegram.ui.Components.f5.Y(parentActivity, j12, j13, j12 != 0 ? a1.g.o(j12, "vibrate_") : "vibrate_messages", runnable, g6Var2));
                return;
            }
            final int i13 = 3;
            if (i10 == d11Var.y) {
                org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                boolean z10 = !w8Var.e.h;
                d11Var.n = z10;
                w8Var.setChecked(z10);
                int childCount = d11Var.a.getChildCount();
                ArrayList arrayList = new ArrayList();
                while (i11 < childCount) {
                    org.telegram.ui.Components.wl0 wl0Var = (org.telegram.ui.Components.wl0) d11Var.a.T(d11Var.a.getChildAt(i11));
                    int i14 = wl0Var.f;
                    View view2 = wl0Var.a;
                    int b10 = wl0Var.b();
                    if (b10 != d11Var.y && b10 != d11Var.W) {
                        if (i14 == 0) {
                            ((org.telegram.ui.Cells.l4) view2).a(arrayList, d11Var.n);
                        } else if (i14 == 1) {
                            ((org.telegram.ui.Cells.ca) view2).a(arrayList, d11Var.n);
                        } else if (i14 == 2) {
                            ((org.telegram.ui.Cells.e9) view2).c(arrayList, d11Var.n);
                        } else if (i14 == 3) {
                            ((org.telegram.ui.Cells.y8) view2).a(arrayList, d11Var.n);
                        } else if (i14 == 4) {
                            ((org.telegram.ui.Cells.k6) view2).b(arrayList, d11Var.n);
                        } else if (i14 == 7 && b10 == d11Var.E) {
                            ((org.telegram.ui.Cells.w8) view2).e(arrayList, d11Var.n);
                        }
                    }
                    i11++;
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                AnimatorSet animatorSet = d11Var.c;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                d11Var.c = animatorSet2;
                animatorSet2.playTogether(arrayList);
                d11Var.c.addListener(new v70(d11Var, 22));
                d11Var.c.setDuration(150L);
                d11Var.c.start();
                return;
            }
            if (i10 == d11Var.E) {
                org.telegram.ui.Cells.w8 w8Var2 = (org.telegram.ui.Cells.w8) view;
                Switch r32 = w8Var2.e;
                MessagesController.getNotificationsSettings(d11Var.currentAccount).edit().putBoolean(si.o0.h(NotificationsSettingsFacade.PROPERTY_CONTENT_PREVIEW, str), !r32.h).apply();
                w8Var2.setChecked(!r32.h);
                return;
            }
            if (i10 == d11Var.R) {
                d11Var.showDialog(org.telegram.ui.Components.f5.Y(d11Var.getParentActivity(), d11Var.e, d11Var.f, si.o0.h("calls_vibrate_", str), new Runnable(d11Var) { // from class: org.telegram.ui.z01
                    public final /* synthetic */ d11 b;

                    {
                        this.b = d11Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                d11 d11Var2 = this.b;
                                b11 b11Var = d11Var2.b;
                                if (b11Var != null) {
                                    b11Var.m(d11Var2.G);
                                    break;
                                }
                                break;
                            case 1:
                                d11 d11Var3 = this.b;
                                b11 b11Var2 = d11Var3.b;
                                if (b11Var2 != null) {
                                    b11Var2.m(d11Var3.R);
                                    break;
                                }
                                break;
                            case 2:
                                d11 d11Var4 = this.b;
                                b11 b11Var3 = d11Var4.b;
                                if (b11Var3 != null) {
                                    b11Var3.m(d11Var4.I);
                                    break;
                                }
                                break;
                            default:
                                d11 d11Var5 = this.b;
                                b11 b11Var4 = d11Var5.b;
                                if (b11Var4 != null) {
                                    b11Var4.m(d11Var5.U);
                                    break;
                                }
                                break;
                        }
                    }
                }, d11Var.d));
                return;
            }
            if (i10 == d11Var.I) {
                d11Var.showDialog(org.telegram.ui.Components.f5.I(d11Var.getParentActivity(), d11Var.e, d11Var.f, -1, new Runnable(d11Var) { // from class: org.telegram.ui.z01
                    public final /* synthetic */ d11 b;

                    {
                        this.b = d11Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (r2) {
                            case 0:
                                d11 d11Var2 = this.b;
                                b11 b11Var = d11Var2.b;
                                if (b11Var != null) {
                                    b11Var.m(d11Var2.G);
                                    break;
                                }
                                break;
                            case 1:
                                d11 d11Var3 = this.b;
                                b11 b11Var2 = d11Var3.b;
                                if (b11Var2 != null) {
                                    b11Var2.m(d11Var3.R);
                                    break;
                                }
                                break;
                            case 2:
                                d11 d11Var4 = this.b;
                                b11 b11Var3 = d11Var4.b;
                                if (b11Var3 != null) {
                                    b11Var3.m(d11Var4.I);
                                    break;
                                }
                                break;
                            default:
                                d11 d11Var5 = this.b;
                                b11 b11Var4 = d11Var5.b;
                                if (b11Var4 != null) {
                                    b11Var4.m(d11Var5.U);
                                    break;
                                }
                                break;
                        }
                    }
                }, d11Var.d));
                return;
            }
            if (i10 != d11Var.H) {
                if (i10 == d11Var.U) {
                    if (d11Var.getParentActivity() == null) {
                        return;
                    }
                    d11Var.showDialog(org.telegram.ui.Components.f5.u(d11Var.getParentActivity(), d11Var.e, d11Var.f, -1, new Runnable(d11Var) { // from class: org.telegram.ui.z01
                        public final /* synthetic */ d11 b;

                        {
                            this.b = d11Var;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i13) {
                                case 0:
                                    d11 d11Var2 = this.b;
                                    b11 b11Var = d11Var2.b;
                                    if (b11Var != null) {
                                        b11Var.m(d11Var2.G);
                                        break;
                                    }
                                    break;
                                case 1:
                                    d11 d11Var3 = this.b;
                                    b11 b11Var2 = d11Var3.b;
                                    if (b11Var2 != null) {
                                        b11Var2.m(d11Var3.R);
                                        break;
                                    }
                                    break;
                                case 2:
                                    d11 d11Var4 = this.b;
                                    b11 b11Var3 = d11Var4.b;
                                    if (b11Var3 != null) {
                                        b11Var3.m(d11Var4.I);
                                        break;
                                    }
                                    break;
                                default:
                                    d11 d11Var5 = this.b;
                                    b11 b11Var4 = d11Var5.b;
                                    if (b11Var4 != null) {
                                        b11Var4.m(d11Var5.U);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, d11Var.d));
                    return;
                }
                if (i10 == d11Var.L) {
                    MessagesController.getNotificationsSettings(d11Var.currentAccount).edit().putInt("popup_" + str, 1).apply();
                    ((org.telegram.ui.Cells.k6) view).a(true, true);
                    View findViewWithTag = d11Var.a.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((org.telegram.ui.Cells.k6) findViewWithTag).a(false, true);
                        return;
                    }
                    return;
                }
                if (i10 == d11Var.M) {
                    MessagesController.getNotificationsSettings(d11Var.currentAccount).edit().putInt("popup_" + str, 2).apply();
                    ((org.telegram.ui.Cells.k6) view).a(true, true);
                    View findViewWithTag2 = d11Var.a.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((org.telegram.ui.Cells.k6) findViewWithTag2).a(false, true);
                        return;
                    }
                    return;
                }
                if (i10 == d11Var.O) {
                    org.telegram.ui.Cells.w8 w8Var3 = (org.telegram.ui.Cells.w8) view;
                    boolean z11 = w8Var3.e.h;
                    boolean z12 = !z11;
                    w8Var3.setChecked(z12);
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(d11Var.currentAccount).edit();
                    if (!d11Var.Z || z11) {
                        edit.putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, z12);
                    } else {
                        edit.remove(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str);
                    }
                    edit.apply();
                    d11Var.getNotificationsController().updateServerNotificationsSettings(j11, j10);
                    return;
                }
                return;
            }
            if (d11Var.getParentActivity() == null) {
                return;
            }
            SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(d11Var.currentAccount);
            int c10 = org.telegram.messenger.v0.c("smart_max_count_", str, notificationsSettings2, 2);
            int c11 = org.telegram.messenger.v0.c("smart_delay_", str, notificationsSettings2, 180);
            r13 = c10 != 0 ? c10 : 2;
            Activity parentActivity2 = d11Var.getParentActivity();
            y01 y01Var = new y01(d11Var, str);
            Pattern pattern2 = org.telegram.ui.Components.f5.a;
            if (parentActivity2 == null) {
                return;
            }
            int i15 = org.telegram.ui.ActionBar.k6.j5;
            int e10 = g6Var != null ? g6Var.e(i15) : org.telegram.ui.ActionBar.k6.x0(null, i15, false);
            int i16 = org.telegram.ui.ActionBar.k6.h5;
            int e11 = g6Var != null ? g6Var.e(i16) : org.telegram.ui.ActionBar.k6.x0(null, i16, false);
            int i17 = org.telegram.ui.ActionBar.k6.Ji;
            if (g6Var != null) {
                g6Var.e(i17);
            } else {
                org.telegram.ui.ActionBar.k6.x0(null, i17, false);
            }
            int i18 = org.telegram.ui.ActionBar.k6.Ni;
            if (g6Var != null) {
                g6Var.e(i18);
            } else {
                org.telegram.ui.ActionBar.k6.x0(null, i18, false);
            }
            int i19 = org.telegram.ui.ActionBar.k6.E8;
            if (g6Var != null) {
                g6Var.e(i19);
            } else {
                org.telegram.ui.ActionBar.k6.x0(null, i19, false);
            }
            int i20 = org.telegram.ui.ActionBar.k6.G8;
            if (g6Var != null) {
                g6Var.e(i20);
            } else {
                org.telegram.ui.ActionBar.k6.x0(null, i20, false);
            }
            int i21 = org.telegram.ui.ActionBar.k6.i6;
            if (g6Var != null) {
                g6Var.e(i21);
            } else {
                org.telegram.ui.ActionBar.k6.x0(null, i21, false);
            }
            int i22 = org.telegram.ui.ActionBar.k6.Sh;
            int e12 = g6Var != null ? g6Var.e(i22) : org.telegram.ui.ActionBar.k6.x0(null, i22, false);
            int i23 = org.telegram.ui.ActionBar.k6.Oh;
            int e13 = g6Var != null ? g6Var.e(i23) : org.telegram.ui.ActionBar.k6.x0(null, i23, false);
            int i24 = org.telegram.ui.ActionBar.k6.Qh;
            int e14 = g6Var != null ? g6Var.e(i24) : org.telegram.ui.ActionBar.k6.x0(null, i24, false);
            org.telegram.ui.ActionBar.b3 b3Var = new org.telegram.ui.ActionBar.b3(parentActivity2, g6Var);
            b3Var.a();
            org.telegram.ui.Components.k4 k4Var = new org.telegram.ui.Components.k4(parentActivity2, g6Var);
            k4Var.setMinValue(0);
            k4Var.setMaxValue(10);
            k4Var.setTextColor(e10);
            k4Var.setValue(r13 - 1);
            k4Var.setWrapSelectorWheel(false);
            k4Var.setFormatter(new tr(25));
            org.telegram.ui.Components.l4 l4Var = new org.telegram.ui.Components.l4(parentActivity2, g6Var);
            l4Var.setMinValue(0);
            l4Var.setMaxValue(10);
            l4Var.setTextColor(e10);
            l4Var.setValue((c11 / 60) - 1);
            l4Var.setWrapSelectorWheel(false);
            l4Var.setFormatter(new tr(26));
            org.telegram.ui.Components.qd0 qd0Var = new org.telegram.ui.Components.qd0(parentActivity2, g6Var);
            qd0Var.setMinValue(0);
            qd0Var.setMaxValue(0);
            qd0Var.setTextColor(e10);
            qd0Var.setValue(0);
            qd0Var.setWrapSelectorWheel(false);
            qd0Var.setFormatter(new tr(27));
            org.telegram.ui.Components.w3 w3Var = new org.telegram.ui.Components.w3(parentActivity2, k4Var, l4Var, qd0Var);
            w3Var.setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(parentActivity2);
            w3Var.addView(frameLayout, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
            TextView textView2 = new TextView(parentActivity2);
            textView2.setText(LocaleController.getString(R.string.NotfificationsFrequencyTitle));
            textView2.setTextColor(e10);
            textView2.setTextSize(1, 20.0f);
            textView2.setTypeface(AndroidUtilities.bold());
            frameLayout.addView(textView2, w7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
            textView2.setOnTouchListener(new di.d(10));
            LinearLayout linearLayout = new LinearLayout(parentActivity2);
            linearLayout.setOrientation(0);
            linearLayout.setWeightSum(1.0f);
            w3Var.addView(linearLayout, w7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
            ai.wd wdVar = new ai.wd(parentActivity2, 18);
            linearLayout.addView(k4Var, w7.z5.l(0.4f, 0, 270));
            linearLayout.addView(qd0Var, w7.z5.o(0, -2, 0.2f, 16));
            linearLayout.addView(l4Var, w7.z5.l(0.4f, 0, 270));
            wdVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            wdVar.setGravity(17);
            wdVar.setTextColor(e12);
            wdVar.setTextSize(1, 14.0f);
            wdVar.setTypeface(AndroidUtilities.bold());
            int dp = AndroidUtilities.dp(8.0f);
            wdVar.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, e13, e14, e14));
            wdVar.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
            w3Var.addView(wdVar, w7.z5.t(-1, 48, 83, 16, 15, 16, 16));
            tr trVar = new tr(14);
            k4Var.setOnValueChangedListener(trVar);
            l4Var.setOnValueChangedListener(trVar);
            wdVar.setOnClickListener(new ci.b4(k4Var, l4Var, y01Var, b3Var, 7));
            b3Var.b(w3Var);
            org.telegram.ui.ActionBar.h3 h3Var = b3Var.a;
            h3Var.show();
            h3Var.setBackgroundColor(e11);
            h3Var.fixNavigationBar(e11);
        }
    }

    public static /* synthetic */ void W(d11 d11Var, String str) {
        d11Var.a0 = true;
        MessagesController.getNotificationsSettings(d11Var.currentAccount).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_CUSTOM + str, false).remove(NotificationsSettingsFacade.PROPERTY_NOTIFY + str).apply();
        d11Var.finishFragment();
        c11 c11Var = d11Var.r;
        if (c11Var != null) {
            c11Var.O();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d6));
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.f8;
        org.telegram.ui.ActionBar.g6 g6Var = this.d;
        org.telegram.ui.ActionBar.r6.m(kVar, 3, i10, g6Var);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 1, org.telegram.ui.ActionBar.k6.v8, g6Var);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        long j10 = this.e;
        long j11 = this.f;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j11);
        this.actionBar.setActionBarMenuOnItemClick(new a11(this, sharedPrefKey));
        org.telegram.ui.Components.oo ooVar = new org.telegram.ui.Components.oo(context, null, false, g6Var);
        this.s = ooVar;
        ooVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.actionBar.addView(this.s, 0, w7.z5.d(-2, -1.0f, 51, !this.inPreviewMode ? 56.0f : 0.0f, 0.0f, 40.0f, 0.0f));
        this.actionBar.setAllowOverlayTitle(false);
        if (j10 >= 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
            if (user != null) {
                this.s.setUserAvatar(user);
                this.s.setTitle(ContactsController.formatName(user.first_name, user.last_name));
            }
        } else if (j11 != 0) {
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-j10, j11);
            og.d.p(this.s.getAvatarImageView(), findTopic, false, true, g6Var);
            this.s.setTitle(findTopic.title);
        } else {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
            this.s.setChatAvatar(chat);
            this.s.setTitle(chat.title);
        }
        if (this.h) {
            this.s.setSubtitle(LocaleController.getString(R.string.NotificationsNewException));
            this.actionBar.m().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        } else {
            this.s.setSubtitle(LocaleController.getString(R.string.CustomNotifications));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, frameLayout, g6Var);
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.a = mm0Var;
        mm0Var.t1();
        this.actionBar.setAdaptiveBackground(this.a);
        frameLayout.addView(this.a, w7.z5.c(-1.0f, -1));
        org.telegram.ui.Components.mm0 mm0Var2 = this.a;
        b11 b11Var = new b11(this, context);
        this.b = b11Var;
        mm0Var2.setAdapter(b11Var);
        this.a.setItemAnimator(null);
        this.a.setLayoutAnimation(null);
        this.a.setLayoutManager(new hg.a0(17));
        this.a.setOnItemClickListener(new sa1(this, context, sharedPrefKey, 1));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.notificationsSettingsUpdated) {
            try {
                this.b.l();
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final org.telegram.ui.ActionBar.g6 getResourceProvider() {
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        i6 i6Var = new i6(20, this);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusColor"}, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.n6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        String str;
        Ringtone ringtone;
        if (i11 != -1 || intent == null) {
            return;
        }
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
        if (uri == null || (ringtone = RingtoneManager.getRingtone(ApplicationLoader.applicationContext, uri)) == null) {
            str = null;
        } else {
            str = i10 == 13 ? uri.equals(Settings.System.DEFAULT_RINGTONE_URI) ? LocaleController.getString(R.string.DefaultRingtone) : ringtone.getTitle(getParentActivity()) : uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI) ? LocaleController.getString(R.string.SoundDefault) : ringtone.getTitle(getParentActivity());
            ringtone.stop();
        }
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
        String sharedPrefKey = NotificationsController.getSharedPrefKey(this.e, this.f);
        if (i10 == 12) {
            if (str != null) {
                edit.putString("sound_" + sharedPrefKey, str);
                edit.putString("sound_path_" + sharedPrefKey, uri.toString());
            } else {
                edit.putString("sound_" + sharedPrefKey, "NoSound");
                edit.putString("sound_path_" + sharedPrefKey, "NoSound");
            }
            getNotificationsController().deleteNotificationChannel(this.e, this.f);
        } else if (i10 == 13) {
            if (str != null) {
                edit.putString("ringtone_" + sharedPrefKey, str);
                edit.putString("ringtone_path_" + sharedPrefKey, uri.toString());
            } else {
                edit.putString("ringtone_" + sharedPrefKey, "NoSound");
                edit.putString("ringtone_path_" + sharedPrefKey, "NoSound");
            }
        }
        edit.apply();
        b11 b11Var = this.b;
        if (b11Var != null) {
            b11Var.m(i10 == 13 ? this.Q : this.F);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010f  */
    @Override // org.telegram.ui.ActionBar.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        boolean z10;
        long j10 = this.e;
        if (DialogObject.isUserDialog(j10)) {
            ArrayList<TLRPC.TL_topPeer> arrayList = getMediaDataController().hints;
            int i10 = 0;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                TLRPC.Peer peer = arrayList.get(i10).peer;
                if ((peer instanceof TLRPC.TL_peerUser) && peer.user_id == j10) {
                    this.Z = i10 < 5;
                } else {
                    i10++;
                }
            }
        }
        this.Y = 0;
        boolean z11 = this.h;
        if (z11) {
            this.w = 0;
            this.Y = 1 + 1;
            this.x = 1;
        } else {
            this.w = -1;
            this.x = -1;
        }
        int i11 = this.Y;
        int i12 = i11 + 1;
        this.Y = i12;
        this.v = i11;
        long j11 = this.f;
        if (z11 || j11 != 0) {
            this.Y = i11 + 2;
            this.y = i12;
        } else {
            this.y = -1;
        }
        this.O = -1;
        if (DialogObject.isEncryptedDialog(j10)) {
            this.E = -1;
        } else {
            int i13 = this.Y;
            this.Y = i13 + 1;
            this.E = i13;
            if (DialogObject.isUserDialog(j10)) {
                int i14 = this.Y;
                this.Y = i14 + 1;
                this.O = i14;
            }
        }
        int i15 = this.Y;
        this.F = i15;
        this.Y = i15 + 2;
        this.G = i15 + 1;
        if (DialogObject.isChatDialog(j10)) {
            int i16 = this.Y;
            this.Y = i16 + 1;
            this.H = i16;
        } else {
            this.H = -1;
        }
        int i17 = this.Y;
        this.I = i17;
        this.Y = i17 + 2;
        this.J = i17 + 1;
        if (DialogObject.isChatDialog(j10)) {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                z10 = true;
                if (!DialogObject.isEncryptedDialog(j10) || z10) {
                    this.K = -1;
                    this.L = -1;
                    this.M = -1;
                    this.N = -1;
                } else {
                    int i18 = this.Y;
                    this.K = i18;
                    this.L = i18 + 1;
                    this.M = i18 + 2;
                    this.Y = i18 + 4;
                    this.N = i18 + 3;
                }
                if (DialogObject.isUserDialog(j10)) {
                    this.P = -1;
                    this.R = -1;
                    this.Q = -1;
                    this.S = -1;
                } else {
                    int i19 = this.Y;
                    this.P = i19;
                    this.R = i19 + 1;
                    this.Q = i19 + 2;
                    this.Y = i19 + 4;
                    this.S = i19 + 3;
                }
                int i20 = this.Y;
                this.T = i20;
                this.U = i20 + 1;
                int i21 = i20 + 3;
                this.Y = i21;
                this.V = i20 + 2;
                if (z11) {
                    this.W = i21;
                    this.Y = i20 + 5;
                    this.X = i20 + 4;
                } else {
                    this.W = -1;
                    this.X = -1;
                }
                boolean isGlobalNotificationsEnabled = NotificationsController.getInstance(this.currentAccount).isGlobalNotificationsEnabled(j10, false, false);
                if (z11) {
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.currentAccount);
                    String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j11);
                    boolean contains = notificationsSettings.contains(NotificationsSettingsFacade.PROPERTY_NOTIFY + sharedPrefKey);
                    int c10 = org.telegram.messenger.v0.c(NotificationsSettingsFacade.PROPERTY_NOTIFY, sharedPrefKey, notificationsSettings, 0);
                    if (c10 == 0) {
                        if (contains) {
                            this.n = true;
                        } else {
                            this.n = NotificationsController.getInstance(this.currentAccount).isGlobalNotificationsEnabled(j10, false, false);
                        }
                    } else if (c10 == 1) {
                        this.n = true;
                    } else if (c10 == 2) {
                        this.n = false;
                    } else {
                        this.n = false;
                    }
                } else {
                    this.n = !isGlobalNotificationsEnabled;
                }
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.notificationsSettingsUpdated);
                return super.onFragmentCreate();
            }
        }
        z10 = false;
        if (DialogObject.isEncryptedDialog(j10)) {
        }
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        if (DialogObject.isUserDialog(j10)) {
        }
        int i202 = this.Y;
        this.T = i202;
        this.U = i202 + 1;
        int i212 = i202 + 3;
        this.Y = i212;
        this.V = i202 + 2;
        if (z11) {
        }
        boolean isGlobalNotificationsEnabled2 = NotificationsController.getInstance(this.currentAccount).isGlobalNotificationsEnabled(j10, false, false);
        if (z11) {
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.notificationsSettingsUpdated);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.a0) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.e, this.f);
            MessagesController.getNotificationsSettings(this.currentAccount).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_CUSTOM + sharedPrefKey, true).apply();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.a.setPadding(0, 0, 0, i13);
        this.a.setClipToPadding(false);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
