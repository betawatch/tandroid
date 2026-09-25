package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class n11 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
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
    public org.telegram.ui.Components.wl0 a;
    public boolean a0;
    public l11 b;
    public AnimatorSet c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final long e;
    public final long f;
    public final boolean h;
    public boolean n;
    public m11 r;
    public org.telegram.ui.Components.fo s;
    public int v;
    public int w;
    public int x;
    public int y;

    public n11(Bundle bundle, org.telegram.ui.ActionBar.d6 d6Var) {
        super(bundle);
        this.d = d6Var;
        this.e = bundle.getLong("dialog_id");
        this.f = bundle.getLong("topic_id");
        this.h = bundle.getBoolean("exception", false);
    }

    public static /* synthetic */ void U(n11 n11Var, String str, int i10, int i11) {
        MessagesController.getNotificationsSettings(n11Var.currentAccount).edit().putInt("smart_max_count_" + str, i10).putInt("smart_delay_" + str, i11).apply();
        l11 l11Var = n11Var.b;
        if (l11Var != null) {
            l11Var.m(n11Var.H);
        }
    }

    public static void V(final n11 n11Var, Context context, String str, View view, int i10) {
        long j3 = n11Var.f;
        long j10 = n11Var.e;
        org.telegram.ui.ActionBar.d6 d6Var = n11Var.d;
        if (view.isEnabled()) {
            Parcelable parcelable = null;
            final int i11 = 0;
            if (i10 == n11Var.W) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
                String string = LocaleController.getString(R.string.ResetCustomNotificationsAlertTitle);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                a2Var.R = string;
                a2Var.T = LocaleController.getString(R.string.ResetCustomNotificationsAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new i11(n11Var, str));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                n11Var.showDialog(a2Var);
                TextView textView = (TextView) a2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q7, false));
                    return;
                }
                return;
            }
            if (i10 == n11Var.F) {
                Bundle e = v7.j.e(j10, "dialog_id");
                e.putLong("topic_id", j3);
                n11Var.presentFragment(new sk0(e, d6Var));
                return;
            }
            final int i12 = 1;
            if (i10 == n11Var.Q) {
                try {
                    Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                    intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                    intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(n11Var.currentAccount);
                    Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
                    String path = uri != null ? uri.getPath() : null;
                    String string2 = notificationsSettings.getString("ringtone_path_" + str, path);
                    if (string2 != null && !string2.equals("NoSound")) {
                        parcelable = string2.equals(path) ? uri : Uri.parse(string2);
                    }
                    intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", parcelable);
                    n11Var.startActivityForResult(intent, 13);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            }
            if (i10 == n11Var.G) {
                Activity parentActivity = n11Var.getParentActivity();
                long j11 = n11Var.e;
                long j12 = n11Var.f;
                Runnable runnable = new Runnable(n11Var) { // from class: org.telegram.ui.j11
                    public final /* synthetic */ n11 b;

                    {
                        this.b = n11Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                n11 n11Var2 = this.b;
                                l11 l11Var = n11Var2.b;
                                if (l11Var != null) {
                                    l11Var.m(n11Var2.G);
                                    break;
                                }
                                break;
                            case 1:
                                n11 n11Var3 = this.b;
                                l11 l11Var2 = n11Var3.b;
                                if (l11Var2 != null) {
                                    l11Var2.m(n11Var3.R);
                                    break;
                                }
                                break;
                            case 2:
                                n11 n11Var4 = this.b;
                                l11 l11Var3 = n11Var4.b;
                                if (l11Var3 != null) {
                                    l11Var3.m(n11Var4.I);
                                    break;
                                }
                                break;
                            default:
                                n11 n11Var5 = this.b;
                                l11 l11Var4 = n11Var5.b;
                                if (l11Var4 != null) {
                                    l11Var4.m(n11Var5.U);
                                    break;
                                }
                                break;
                        }
                    }
                };
                org.telegram.ui.ActionBar.d6 d6Var2 = n11Var.d;
                Pattern pattern = org.telegram.ui.Components.e5.a;
                n11Var.showDialog(org.telegram.ui.Components.e5.Y(parentActivity, j11, j12, j11 != 0 ? a4.a.p(j11, "vibrate_") : "vibrate_messages", runnable, d6Var2));
                return;
            }
            int i13 = 16;
            int i14 = 4;
            final int i15 = 3;
            if (i10 == n11Var.y) {
                org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                boolean z10 = !w8Var.e.h;
                n11Var.n = z10;
                w8Var.setChecked(z10);
                int childCount = n11Var.a.getChildCount();
                ArrayList arrayList = new ArrayList();
                while (i11 < childCount) {
                    org.telegram.ui.Components.gl0 gl0Var = (org.telegram.ui.Components.gl0) n11Var.a.T(n11Var.a.getChildAt(i11));
                    int i16 = gl0Var.f;
                    View view2 = gl0Var.a;
                    int b10 = gl0Var.b();
                    if (b10 != n11Var.y && b10 != n11Var.W) {
                        if (i16 == 0) {
                            ((org.telegram.ui.Cells.m4) view2).a(arrayList, n11Var.n);
                        } else if (i16 == 1) {
                            ((org.telegram.ui.Cells.ea) view2).a(arrayList, n11Var.n);
                        } else if (i16 == 2) {
                            ((org.telegram.ui.Cells.e9) view2).c(arrayList, n11Var.n);
                        } else if (i16 == 3) {
                            ((org.telegram.ui.Cells.y8) view2).a(arrayList, n11Var.n);
                        } else if (i16 == 4) {
                            ((org.telegram.ui.Cells.k6) view2).b(arrayList, n11Var.n);
                        } else if (i16 == 7 && b10 == n11Var.E) {
                            ((org.telegram.ui.Cells.w8) view2).e(arrayList, n11Var.n);
                        }
                    }
                    i11++;
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                AnimatorSet animatorSet = n11Var.c;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                n11Var.c = animatorSet2;
                animatorSet2.playTogether(arrayList);
                n11Var.c.addListener(new xo0(n11Var, i13));
                n11Var.c.setDuration(150L);
                n11Var.c.start();
                return;
            }
            if (i10 == n11Var.E) {
                org.telegram.ui.Cells.w8 w8Var2 = (org.telegram.ui.Cells.w8) view;
                Switch r32 = w8Var2.e;
                MessagesController.getNotificationsSettings(n11Var.currentAccount).edit().putBoolean(v7.j.g(NotificationsSettingsFacade.PROPERTY_CONTENT_PREVIEW, str), !r32.h).apply();
                w8Var2.setChecked(!r32.h);
                return;
            }
            if (i10 == n11Var.R) {
                n11Var.showDialog(org.telegram.ui.Components.e5.Y(n11Var.getParentActivity(), n11Var.e, n11Var.f, v7.j.g("calls_vibrate_", str), new Runnable(n11Var) { // from class: org.telegram.ui.j11
                    public final /* synthetic */ n11 b;

                    {
                        this.b = n11Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                n11 n11Var2 = this.b;
                                l11 l11Var = n11Var2.b;
                                if (l11Var != null) {
                                    l11Var.m(n11Var2.G);
                                    break;
                                }
                                break;
                            case 1:
                                n11 n11Var3 = this.b;
                                l11 l11Var2 = n11Var3.b;
                                if (l11Var2 != null) {
                                    l11Var2.m(n11Var3.R);
                                    break;
                                }
                                break;
                            case 2:
                                n11 n11Var4 = this.b;
                                l11 l11Var3 = n11Var4.b;
                                if (l11Var3 != null) {
                                    l11Var3.m(n11Var4.I);
                                    break;
                                }
                                break;
                            default:
                                n11 n11Var5 = this.b;
                                l11 l11Var4 = n11Var5.b;
                                if (l11Var4 != null) {
                                    l11Var4.m(n11Var5.U);
                                    break;
                                }
                                break;
                        }
                    }
                }, n11Var.d));
                return;
            }
            if (i10 == n11Var.I) {
                n11Var.showDialog(org.telegram.ui.Components.e5.I(n11Var.getParentActivity(), n11Var.e, n11Var.f, -1, new Runnable(n11Var) { // from class: org.telegram.ui.j11
                    public final /* synthetic */ n11 b;

                    {
                        this.b = n11Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (r2) {
                            case 0:
                                n11 n11Var2 = this.b;
                                l11 l11Var = n11Var2.b;
                                if (l11Var != null) {
                                    l11Var.m(n11Var2.G);
                                    break;
                                }
                                break;
                            case 1:
                                n11 n11Var3 = this.b;
                                l11 l11Var2 = n11Var3.b;
                                if (l11Var2 != null) {
                                    l11Var2.m(n11Var3.R);
                                    break;
                                }
                                break;
                            case 2:
                                n11 n11Var4 = this.b;
                                l11 l11Var3 = n11Var4.b;
                                if (l11Var3 != null) {
                                    l11Var3.m(n11Var4.I);
                                    break;
                                }
                                break;
                            default:
                                n11 n11Var5 = this.b;
                                l11 l11Var4 = n11Var5.b;
                                if (l11Var4 != null) {
                                    l11Var4.m(n11Var5.U);
                                    break;
                                }
                                break;
                        }
                    }
                }, n11Var.d));
                return;
            }
            if (i10 != n11Var.H) {
                if (i10 == n11Var.U) {
                    if (n11Var.getParentActivity() == null) {
                        return;
                    }
                    n11Var.showDialog(org.telegram.ui.Components.e5.u(n11Var.getParentActivity(), n11Var.e, n11Var.f, -1, new Runnable(n11Var) { // from class: org.telegram.ui.j11
                        public final /* synthetic */ n11 b;

                        {
                            this.b = n11Var;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i15) {
                                case 0:
                                    n11 n11Var2 = this.b;
                                    l11 l11Var = n11Var2.b;
                                    if (l11Var != null) {
                                        l11Var.m(n11Var2.G);
                                        break;
                                    }
                                    break;
                                case 1:
                                    n11 n11Var3 = this.b;
                                    l11 l11Var2 = n11Var3.b;
                                    if (l11Var2 != null) {
                                        l11Var2.m(n11Var3.R);
                                        break;
                                    }
                                    break;
                                case 2:
                                    n11 n11Var4 = this.b;
                                    l11 l11Var3 = n11Var4.b;
                                    if (l11Var3 != null) {
                                        l11Var3.m(n11Var4.I);
                                        break;
                                    }
                                    break;
                                default:
                                    n11 n11Var5 = this.b;
                                    l11 l11Var4 = n11Var5.b;
                                    if (l11Var4 != null) {
                                        l11Var4.m(n11Var5.U);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, n11Var.d));
                    return;
                }
                if (i10 == n11Var.L) {
                    MessagesController.getNotificationsSettings(n11Var.currentAccount).edit().putInt("popup_" + str, 1).apply();
                    ((org.telegram.ui.Cells.k6) view).a(true, true);
                    View findViewWithTag = n11Var.a.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((org.telegram.ui.Cells.k6) findViewWithTag).a(false, true);
                        return;
                    }
                    return;
                }
                if (i10 == n11Var.M) {
                    MessagesController.getNotificationsSettings(n11Var.currentAccount).edit().putInt("popup_" + str, 2).apply();
                    ((org.telegram.ui.Cells.k6) view).a(true, true);
                    View findViewWithTag2 = n11Var.a.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((org.telegram.ui.Cells.k6) findViewWithTag2).a(false, true);
                        return;
                    }
                    return;
                }
                if (i10 == n11Var.O) {
                    org.telegram.ui.Cells.w8 w8Var3 = (org.telegram.ui.Cells.w8) view;
                    boolean z11 = w8Var3.e.h;
                    boolean z12 = !z11;
                    w8Var3.setChecked(z12);
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(n11Var.currentAccount).edit();
                    if (!n11Var.Z || z11) {
                        edit.putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, z12);
                    } else {
                        edit.remove(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str);
                    }
                    edit.apply();
                    n11Var.getNotificationsController().updateServerNotificationsSettings(j10, j3);
                    return;
                }
                return;
            }
            if (n11Var.getParentActivity() == null) {
                return;
            }
            SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(n11Var.currentAccount);
            int c10 = org.telegram.messenger.f0.c("smart_max_count_", str, notificationsSettings2, 2);
            int c11 = org.telegram.messenger.f0.c("smart_delay_", str, notificationsSettings2, 180);
            r15 = c10 != 0 ? c10 : 2;
            Activity parentActivity2 = n11Var.getParentActivity();
            i11 i11Var = new i11(n11Var, str);
            Pattern pattern2 = org.telegram.ui.Components.e5.a;
            if (parentActivity2 == null) {
                return;
            }
            int i17 = org.telegram.ui.ActionBar.h6.j5;
            int g02 = d6Var != null ? d6Var.g0(i17) : org.telegram.ui.ActionBar.h6.w0(null, i17, false);
            int i18 = org.telegram.ui.ActionBar.h6.h5;
            int g03 = d6Var != null ? d6Var.g0(i18) : org.telegram.ui.ActionBar.h6.w0(null, i18, false);
            int i19 = org.telegram.ui.ActionBar.h6.Ji;
            if (d6Var != null) {
                d6Var.g0(i19);
            } else {
                org.telegram.ui.ActionBar.h6.w0(null, i19, false);
            }
            int i20 = org.telegram.ui.ActionBar.h6.Ni;
            if (d6Var != null) {
                d6Var.g0(i20);
            } else {
                org.telegram.ui.ActionBar.h6.w0(null, i20, false);
            }
            int i21 = org.telegram.ui.ActionBar.h6.E8;
            if (d6Var != null) {
                d6Var.g0(i21);
            } else {
                org.telegram.ui.ActionBar.h6.w0(null, i21, false);
            }
            int i22 = org.telegram.ui.ActionBar.h6.G8;
            if (d6Var != null) {
                d6Var.g0(i22);
            } else {
                org.telegram.ui.ActionBar.h6.w0(null, i22, false);
            }
            int i23 = org.telegram.ui.ActionBar.h6.i6;
            if (d6Var != null) {
                d6Var.g0(i23);
            } else {
                org.telegram.ui.ActionBar.h6.w0(null, i23, false);
            }
            int i24 = org.telegram.ui.ActionBar.h6.Sh;
            int g04 = d6Var != null ? d6Var.g0(i24) : org.telegram.ui.ActionBar.h6.w0(null, i24, false);
            int i25 = org.telegram.ui.ActionBar.h6.Oh;
            int g05 = d6Var != null ? d6Var.g0(i25) : org.telegram.ui.ActionBar.h6.w0(null, i25, false);
            int i26 = org.telegram.ui.ActionBar.h6.Qh;
            int g06 = d6Var != null ? d6Var.g0(i26) : org.telegram.ui.ActionBar.h6.w0(null, i26, false);
            org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(parentActivity2, d6Var);
            z2Var.a();
            org.telegram.ui.Components.k4 k4Var = new org.telegram.ui.Components.k4(parentActivity2, d6Var);
            k4Var.setMinValue(0);
            k4Var.setMaxValue(10);
            k4Var.setTextColor(g02);
            k4Var.setValue(r15 - 1);
            k4Var.setWrapSelectorWheel(false);
            k4Var.setFormatter(new org.telegram.ui.Components.x1(i14));
            org.telegram.ui.Components.l4 l4Var = new org.telegram.ui.Components.l4(parentActivity2, d6Var);
            l4Var.setMinValue(0);
            l4Var.setMaxValue(10);
            l4Var.setTextColor(g02);
            l4Var.setValue((c11 / 60) - 1);
            l4Var.setWrapSelectorWheel(false);
            l4Var.setFormatter(new org.telegram.ui.Components.x1(5));
            org.telegram.ui.Components.ed0 ed0Var = new org.telegram.ui.Components.ed0(parentActivity2, d6Var);
            ed0Var.setMinValue(0);
            ed0Var.setMaxValue(0);
            ed0Var.setTextColor(g02);
            ed0Var.setValue(0);
            ed0Var.setWrapSelectorWheel(false);
            ed0Var.setFormatter(new org.telegram.ui.Components.x1(6));
            org.telegram.ui.Components.w3 w3Var = new org.telegram.ui.Components.w3(parentActivity2, k4Var, l4Var, ed0Var);
            w3Var.setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(parentActivity2);
            w3Var.addView(frameLayout, w7.y5.t(-1, -2, 51, 22, 0, 0, 4));
            TextView textView2 = new TextView(parentActivity2);
            textView2.setText(LocaleController.getString(R.string.NotfificationsFrequencyTitle));
            textView2.setTextColor(g02);
            textView2.setTextSize(1, 20.0f);
            textView2.setTypeface(AndroidUtilities.bold());
            frameLayout.addView(textView2, w7.y5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
            textView2.setOnTouchListener(new bi.d(10));
            LinearLayout linearLayout = new LinearLayout(parentActivity2);
            linearLayout.setOrientation(0);
            linearLayout.setWeightSum(1.0f);
            w3Var.addView(linearLayout, w7.y5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
            ai.p4 p4Var = new ai.p4(parentActivity2, 18);
            linearLayout.addView(k4Var, w7.y5.l(0.4f, 0, 270));
            linearLayout.addView(ed0Var, w7.y5.o(0, -2, 0.2f, 16));
            linearLayout.addView(l4Var, w7.y5.l(0.4f, 0, 270));
            p4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            p4Var.setGravity(17);
            p4Var.setTextColor(g04);
            p4Var.setTextSize(1, 14.0f);
            p4Var.setTypeface(AndroidUtilities.bold());
            int dp = AndroidUtilities.dp(8.0f);
            p4Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.i0(dp, dp, dp, dp, g05, g06, g06));
            p4Var.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
            w3Var.addView(p4Var, w7.y5.t(-1, 48, 83, 16, 15, 16, 16));
            u6 u6Var = new u6(23);
            k4Var.setOnValueChangedListener(u6Var);
            l4Var.setOnValueChangedListener(u6Var);
            p4Var.setOnClickListener(new ai.o5(k4Var, l4Var, i11Var, z2Var, 7));
            z2Var.b(w3Var);
            org.telegram.ui.ActionBar.e3 e3Var = z2Var.a;
            e3Var.show();
            e3Var.setBackgroundColor(g03);
            e3Var.fixNavigationBar(g03);
        }
    }

    public static /* synthetic */ void W(n11 n11Var, String str) {
        n11Var.a0 = true;
        MessagesController.getNotificationsSettings(n11Var.currentAccount).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_CUSTOM + str, false).remove(NotificationsSettingsFacade.PROPERTY_NOTIFY + str).apply();
        n11Var.finishFragment();
        m11 m11Var = n11Var.r;
        if (m11Var != null) {
            m11Var.c0();
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f8;
        org.telegram.ui.ActionBar.d6 d6Var = this.d;
        kVar.A(org.telegram.ui.ActionBar.h6.v0(i10, d6Var), false);
        this.actionBar.B(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.v8, d6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        long j3 = this.e;
        long j10 = this.f;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j3, j10);
        this.actionBar.setActionBarMenuOnItemClick(new k11(this, sharedPrefKey));
        org.telegram.ui.Components.fo foVar = new org.telegram.ui.Components.fo(context, null, false, d6Var);
        this.s = foVar;
        foVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.actionBar.addView(this.s, 0, w7.y5.d(-2, -1.0f, 51, !this.inPreviewMode ? 56.0f : 0.0f, 0.0f, 40.0f, 0.0f));
        this.actionBar.setAllowOverlayTitle(false);
        if (j3 >= 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
            if (user != null) {
                this.s.setUserAvatar(user);
                this.s.setTitle(ContactsController.formatName(user.first_name, user.last_name));
            }
        } else if (j10 != 0) {
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-j3, j10);
            ng.d.p(this.s.getAvatarImageView(), findTopic, false, true, d6Var);
            this.s.setTitle(findTopic.title);
        } else {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j3));
            this.s.setChatAvatar(chat);
            this.s.setTitle(chat.title);
        }
        if (this.h) {
            this.s.setSubtitle(LocaleController.getString(R.string.NotificationsNewException));
            this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        } else {
            this.s.setSubtitle(LocaleController.getString(R.string.CustomNotifications));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.a7, d6Var));
        org.telegram.ui.Components.wl0 wl0Var = new org.telegram.ui.Components.wl0(context, null);
        this.a = wl0Var;
        wl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.a);
        frameLayout.addView(this.a, w7.y5.c(-1.0f, -1));
        org.telegram.ui.Components.wl0 wl0Var2 = this.a;
        l11 l11Var = new l11(this, context);
        this.b = l11Var;
        wl0Var2.setAdapter(l11Var);
        this.a.setItemAnimator(null);
        this.a.setLayoutAnimation(null);
        this.a.setLayoutManager(new gg.b0(17));
        this.a.setOnItemClickListener(new rb1(this, context, sharedPrefKey, 1));
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

    @Override // org.telegram.ui.ActionBar.m2
    public final org.telegram.ui.ActionBar.d6 getResourceProvider() {
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        oy0 oy0Var = new oy0(1, this);
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.ea.class, org.telegram.ui.Cells.y8.class, org.telegram.ui.Cells.k6.class, org.telegram.ui.Cells.ya.class, org.telegram.ui.Cells.w8.class, org.telegram.ui.Cells.s8.class}, null, null, null, org.telegram.ui.ActionBar.h6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.k0, null, null, org.telegram.ui.ActionBar.h6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 0, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 8192, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.g7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 16384, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.h7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 0, new Class[]{org.telegram.ui.Cells.ya.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 0, new Class[]{org.telegram.ui.Cells.ya.class}, new String[]{"statusColor"}, null, null, -1, oy0Var, org.telegram.ui.ActionBar.h6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 0, new Class[]{org.telegram.ui.Cells.ya.class}, new String[]{"statusOnlineColor"}, null, null, -1, oy0Var, org.telegram.ui.ActionBar.h6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 0, new Class[]{org.telegram.ui.Cells.ya.class}, null, org.telegram.ui.ActionBar.h6.r0, null, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, oy0Var, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, oy0Var, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, oy0Var, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, oy0Var, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, oy0Var, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, oy0Var, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, oy0Var, org.telegram.ui.ActionBar.h6.U7));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.m2
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
        l11 l11Var = this.b;
        if (l11Var != null) {
            l11Var.m(i10 == 13 ? this.Q : this.F);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010f  */
    @Override // org.telegram.ui.ActionBar.m2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        boolean z10;
        long j3 = this.e;
        if (DialogObject.isUserDialog(j3)) {
            ArrayList<TLRPC.TL_topPeer> arrayList = getMediaDataController().hints;
            int i10 = 0;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                TLRPC.Peer peer = arrayList.get(i10).peer;
                if ((peer instanceof TLRPC.TL_peerUser) && peer.user_id == j3) {
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
        long j10 = this.f;
        if (z11 || j10 != 0) {
            this.Y = i11 + 2;
            this.y = i12;
        } else {
            this.y = -1;
        }
        this.O = -1;
        if (DialogObject.isEncryptedDialog(j3)) {
            this.E = -1;
        } else {
            int i13 = this.Y;
            this.Y = i13 + 1;
            this.E = i13;
            if (DialogObject.isUserDialog(j3)) {
                int i14 = this.Y;
                this.Y = i14 + 1;
                this.O = i14;
            }
        }
        int i15 = this.Y;
        this.F = i15;
        this.Y = i15 + 2;
        this.G = i15 + 1;
        if (DialogObject.isChatDialog(j3)) {
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
        if (DialogObject.isChatDialog(j3)) {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                z10 = true;
                if (!DialogObject.isEncryptedDialog(j3) || z10) {
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
                if (DialogObject.isUserDialog(j3)) {
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
                boolean isGlobalNotificationsEnabled = NotificationsController.getInstance(this.currentAccount).isGlobalNotificationsEnabled(j3, false, false);
                if (z11) {
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.currentAccount);
                    String sharedPrefKey = NotificationsController.getSharedPrefKey(j3, j10);
                    boolean contains = notificationsSettings.contains(NotificationsSettingsFacade.PROPERTY_NOTIFY + sharedPrefKey);
                    int c10 = org.telegram.messenger.f0.c(NotificationsSettingsFacade.PROPERTY_NOTIFY, sharedPrefKey, notificationsSettings, 0);
                    if (c10 == 0) {
                        if (contains) {
                            this.n = true;
                        } else {
                            this.n = NotificationsController.getInstance(this.currentAccount).isGlobalNotificationsEnabled(j3, false, false);
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
        if (DialogObject.isEncryptedDialog(j3)) {
        }
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        if (DialogObject.isUserDialog(j3)) {
        }
        int i202 = this.Y;
        this.T = i202;
        this.U = i202 + 1;
        int i212 = i202 + 3;
        this.Y = i212;
        this.V = i202 + 2;
        if (z11) {
        }
        boolean isGlobalNotificationsEnabled2 = NotificationsController.getInstance(this.currentAccount).isGlobalNotificationsEnabled(j3, false, false);
        if (z11) {
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.notificationsSettingsUpdated);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.a0) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.e, this.f);
            MessagesController.getNotificationsSettings(this.currentAccount).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_CUSTOM + sharedPrefKey, true).apply();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.a.setPadding(0, 0, 0, i13);
        this.a.setClipToPadding(false);
    }
}
