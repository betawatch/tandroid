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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class c21 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
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
    public a21 b;
    public AnimatorSet c;
    public final org.telegram.ui.ActionBar.c6 d;
    public final long e;
    public final long f;
    public final boolean h;
    public boolean n;
    public b21 r;
    public org.telegram.ui.Components.ro s;
    public int v;
    public int w;
    public int x;
    public int y;

    public c21(Bundle bundle, org.telegram.ui.ActionBar.c6 c6Var) {
        super(bundle);
        this.d = c6Var;
        this.e = bundle.getLong("dialog_id");
        this.f = bundle.getLong("topic_id");
        this.h = bundle.getBoolean("exception", false);
    }

    public static /* synthetic */ void U(c21 c21Var, String str, int i10, int i11) {
        MessagesController.getNotificationsSettings(c21Var.currentAccount).edit().putInt("smart_max_count_" + str, i10).putInt("smart_delay_" + str, i11).apply();
        a21 a21Var = c21Var.b;
        if (a21Var != null) {
            a21Var.m(c21Var.H);
        }
    }

    public static void V(final c21 c21Var, Context context, String str, View view, int i10) {
        long j10 = c21Var.f;
        long j11 = c21Var.e;
        org.telegram.ui.ActionBar.c6 c6Var = c21Var.d;
        if (view.isEnabled()) {
            Parcelable parcelable = null;
            final int i11 = 0;
            if (i10 == c21Var.W) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
                String string = LocaleController.getString(R.string.ResetCustomNotificationsAlertTitle);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                a2Var.R = string;
                a2Var.T = LocaleController.getString(R.string.ResetCustomNotificationsAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new x11(c21Var, str));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                c21Var.showDialog(a2Var);
                TextView textView = (TextView) a2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.q7, false));
                    return;
                }
                return;
            }
            if (i10 == c21Var.F) {
                Bundle e = t8.b.e(j11, "dialog_id");
                e.putLong("topic_id", j10);
                c21Var.presentFragment(new el0(e, c6Var));
                return;
            }
            final int i12 = 1;
            if (i10 == c21Var.Q) {
                try {
                    Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                    intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                    intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(c21Var.currentAccount);
                    Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
                    String path = uri != null ? uri.getPath() : null;
                    String string2 = notificationsSettings.getString("ringtone_path_" + str, path);
                    if (string2 != null && !string2.equals("NoSound")) {
                        parcelable = string2.equals(path) ? uri : Uri.parse(string2);
                    }
                    intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", parcelable);
                    c21Var.startActivityForResult(intent, 13);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            }
            if (i10 == c21Var.G) {
                Activity parentActivity = c21Var.getParentActivity();
                long j12 = c21Var.e;
                long j13 = c21Var.f;
                Runnable runnable = new Runnable(c21Var) { // from class: org.telegram.ui.y11
                    public final /* synthetic */ c21 b;

                    {
                        this.b = c21Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                c21 c21Var2 = this.b;
                                a21 a21Var = c21Var2.b;
                                if (a21Var != null) {
                                    a21Var.m(c21Var2.G);
                                    break;
                                }
                                break;
                            case 1:
                                c21 c21Var3 = this.b;
                                a21 a21Var2 = c21Var3.b;
                                if (a21Var2 != null) {
                                    a21Var2.m(c21Var3.R);
                                    break;
                                }
                                break;
                            case 2:
                                c21 c21Var4 = this.b;
                                a21 a21Var3 = c21Var4.b;
                                if (a21Var3 != null) {
                                    a21Var3.m(c21Var4.I);
                                    break;
                                }
                                break;
                            default:
                                c21 c21Var5 = this.b;
                                a21 a21Var4 = c21Var5.b;
                                if (a21Var4 != null) {
                                    a21Var4.m(c21Var5.U);
                                    break;
                                }
                                break;
                        }
                    }
                };
                org.telegram.ui.ActionBar.c6 c6Var2 = c21Var.d;
                Pattern pattern = org.telegram.ui.Components.g5.a;
                c21Var.showDialog(org.telegram.ui.Components.g5.X(parentActivity, j12, j13, j12 != 0 ? a1.g.o(j12, "vibrate_") : "vibrate_messages", runnable, c6Var2));
                return;
            }
            int i13 = 19;
            final int i14 = 3;
            if (i10 == c21Var.y) {
                org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                boolean z10 = !w8Var.e.h;
                c21Var.n = z10;
                w8Var.setChecked(z10);
                int childCount = c21Var.a.getChildCount();
                ArrayList arrayList = new ArrayList();
                while (i11 < childCount) {
                    org.telegram.ui.Components.wl0 wl0Var = (org.telegram.ui.Components.wl0) c21Var.a.T(c21Var.a.getChildAt(i11));
                    int i15 = wl0Var.f;
                    View view2 = wl0Var.a;
                    int b10 = wl0Var.b();
                    if (b10 != c21Var.y && b10 != c21Var.W) {
                        if (i15 == 0) {
                            ((org.telegram.ui.Cells.m4) view2).a(arrayList, c21Var.n);
                        } else if (i15 == 1) {
                            ((org.telegram.ui.Cells.ca) view2).a(arrayList, c21Var.n);
                        } else if (i15 == 2) {
                            ((org.telegram.ui.Cells.e9) view2).c(arrayList, c21Var.n);
                        } else if (i15 == 3) {
                            ((org.telegram.ui.Cells.y8) view2).a(arrayList, c21Var.n);
                        } else if (i15 == 4) {
                            ((org.telegram.ui.Cells.k6) view2).b(arrayList, c21Var.n);
                        } else if (i15 == 7 && b10 == c21Var.E) {
                            ((org.telegram.ui.Cells.w8) view2).e(arrayList, c21Var.n);
                        }
                    }
                    i11++;
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                AnimatorSet animatorSet = c21Var.c;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                c21Var.c = animatorSet2;
                animatorSet2.playTogether(arrayList);
                c21Var.c.addListener(new kj0(c21Var, i13));
                c21Var.c.setDuration(150L);
                c21Var.c.start();
                return;
            }
            if (i10 == c21Var.E) {
                org.telegram.ui.Cells.w8 w8Var2 = (org.telegram.ui.Cells.w8) view;
                Switch r32 = w8Var2.e;
                MessagesController.getNotificationsSettings(c21Var.currentAccount).edit().putBoolean(t8.b.h(NotificationsSettingsFacade.PROPERTY_CONTENT_PREVIEW, str), !r32.h).apply();
                w8Var2.setChecked(!r32.h);
                return;
            }
            if (i10 == c21Var.R) {
                c21Var.showDialog(org.telegram.ui.Components.g5.X(c21Var.getParentActivity(), c21Var.e, c21Var.f, t8.b.h("calls_vibrate_", str), new Runnable(c21Var) { // from class: org.telegram.ui.y11
                    public final /* synthetic */ c21 b;

                    {
                        this.b = c21Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                c21 c21Var2 = this.b;
                                a21 a21Var = c21Var2.b;
                                if (a21Var != null) {
                                    a21Var.m(c21Var2.G);
                                    break;
                                }
                                break;
                            case 1:
                                c21 c21Var3 = this.b;
                                a21 a21Var2 = c21Var3.b;
                                if (a21Var2 != null) {
                                    a21Var2.m(c21Var3.R);
                                    break;
                                }
                                break;
                            case 2:
                                c21 c21Var4 = this.b;
                                a21 a21Var3 = c21Var4.b;
                                if (a21Var3 != null) {
                                    a21Var3.m(c21Var4.I);
                                    break;
                                }
                                break;
                            default:
                                c21 c21Var5 = this.b;
                                a21 a21Var4 = c21Var5.b;
                                if (a21Var4 != null) {
                                    a21Var4.m(c21Var5.U);
                                    break;
                                }
                                break;
                        }
                    }
                }, c21Var.d));
                return;
            }
            if (i10 == c21Var.I) {
                c21Var.showDialog(org.telegram.ui.Components.g5.H(c21Var.getParentActivity(), c21Var.e, c21Var.f, -1, new Runnable(c21Var) { // from class: org.telegram.ui.y11
                    public final /* synthetic */ c21 b;

                    {
                        this.b = c21Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (r2) {
                            case 0:
                                c21 c21Var2 = this.b;
                                a21 a21Var = c21Var2.b;
                                if (a21Var != null) {
                                    a21Var.m(c21Var2.G);
                                    break;
                                }
                                break;
                            case 1:
                                c21 c21Var3 = this.b;
                                a21 a21Var2 = c21Var3.b;
                                if (a21Var2 != null) {
                                    a21Var2.m(c21Var3.R);
                                    break;
                                }
                                break;
                            case 2:
                                c21 c21Var4 = this.b;
                                a21 a21Var3 = c21Var4.b;
                                if (a21Var3 != null) {
                                    a21Var3.m(c21Var4.I);
                                    break;
                                }
                                break;
                            default:
                                c21 c21Var5 = this.b;
                                a21 a21Var4 = c21Var5.b;
                                if (a21Var4 != null) {
                                    a21Var4.m(c21Var5.U);
                                    break;
                                }
                                break;
                        }
                    }
                }, c21Var.d));
                return;
            }
            if (i10 != c21Var.H) {
                if (i10 == c21Var.U) {
                    if (c21Var.getParentActivity() == null) {
                        return;
                    }
                    c21Var.showDialog(org.telegram.ui.Components.g5.t(c21Var.getParentActivity(), c21Var.e, c21Var.f, -1, new Runnable(c21Var) { // from class: org.telegram.ui.y11
                        public final /* synthetic */ c21 b;

                        {
                            this.b = c21Var;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i14) {
                                case 0:
                                    c21 c21Var2 = this.b;
                                    a21 a21Var = c21Var2.b;
                                    if (a21Var != null) {
                                        a21Var.m(c21Var2.G);
                                        break;
                                    }
                                    break;
                                case 1:
                                    c21 c21Var3 = this.b;
                                    a21 a21Var2 = c21Var3.b;
                                    if (a21Var2 != null) {
                                        a21Var2.m(c21Var3.R);
                                        break;
                                    }
                                    break;
                                case 2:
                                    c21 c21Var4 = this.b;
                                    a21 a21Var3 = c21Var4.b;
                                    if (a21Var3 != null) {
                                        a21Var3.m(c21Var4.I);
                                        break;
                                    }
                                    break;
                                default:
                                    c21 c21Var5 = this.b;
                                    a21 a21Var4 = c21Var5.b;
                                    if (a21Var4 != null) {
                                        a21Var4.m(c21Var5.U);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, c21Var.d));
                    return;
                }
                if (i10 == c21Var.L) {
                    MessagesController.getNotificationsSettings(c21Var.currentAccount).edit().putInt("popup_" + str, 1).apply();
                    ((org.telegram.ui.Cells.k6) view).a(true, true);
                    View findViewWithTag = c21Var.a.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((org.telegram.ui.Cells.k6) findViewWithTag).a(false, true);
                        return;
                    }
                    return;
                }
                if (i10 == c21Var.M) {
                    MessagesController.getNotificationsSettings(c21Var.currentAccount).edit().putInt("popup_" + str, 2).apply();
                    ((org.telegram.ui.Cells.k6) view).a(true, true);
                    View findViewWithTag2 = c21Var.a.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((org.telegram.ui.Cells.k6) findViewWithTag2).a(false, true);
                        return;
                    }
                    return;
                }
                if (i10 == c21Var.O) {
                    org.telegram.ui.Cells.w8 w8Var3 = (org.telegram.ui.Cells.w8) view;
                    boolean z11 = w8Var3.e.h;
                    boolean z12 = !z11;
                    w8Var3.setChecked(z12);
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(c21Var.currentAccount).edit();
                    if (!c21Var.Z || z11) {
                        edit.putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, z12);
                    } else {
                        edit.remove(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str);
                    }
                    edit.apply();
                    c21Var.getNotificationsController().updateServerNotificationsSettings(j11, j10);
                    return;
                }
                return;
            }
            if (c21Var.getParentActivity() == null) {
                return;
            }
            SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(c21Var.currentAccount);
            int c10 = org.telegram.messenger.g0.c("smart_max_count_", str, notificationsSettings2, 2);
            int c11 = org.telegram.messenger.g0.c("smart_delay_", str, notificationsSettings2, 180);
            r14 = c10 != 0 ? c10 : 2;
            Activity parentActivity2 = c21Var.getParentActivity();
            x11 x11Var = new x11(c21Var, str);
            Pattern pattern2 = org.telegram.ui.Components.g5.a;
            if (parentActivity2 == null) {
                return;
            }
            int i16 = org.telegram.ui.ActionBar.g6.j5;
            int b02 = c6Var != null ? c6Var.b0(i16) : org.telegram.ui.ActionBar.g6.x0(null, i16, false);
            int i17 = org.telegram.ui.ActionBar.g6.h5;
            int b03 = c6Var != null ? c6Var.b0(i17) : org.telegram.ui.ActionBar.g6.x0(null, i17, false);
            int i18 = org.telegram.ui.ActionBar.g6.Ji;
            if (c6Var != null) {
                c6Var.b0(i18);
            } else {
                org.telegram.ui.ActionBar.g6.x0(null, i18, false);
            }
            int i19 = org.telegram.ui.ActionBar.g6.Ni;
            if (c6Var != null) {
                c6Var.b0(i19);
            } else {
                org.telegram.ui.ActionBar.g6.x0(null, i19, false);
            }
            int i20 = org.telegram.ui.ActionBar.g6.E8;
            if (c6Var != null) {
                c6Var.b0(i20);
            } else {
                org.telegram.ui.ActionBar.g6.x0(null, i20, false);
            }
            int i21 = org.telegram.ui.ActionBar.g6.G8;
            if (c6Var != null) {
                c6Var.b0(i21);
            } else {
                org.telegram.ui.ActionBar.g6.x0(null, i21, false);
            }
            int i22 = org.telegram.ui.ActionBar.g6.i6;
            if (c6Var != null) {
                c6Var.b0(i22);
            } else {
                org.telegram.ui.ActionBar.g6.x0(null, i22, false);
            }
            int i23 = org.telegram.ui.ActionBar.g6.Sh;
            int b04 = c6Var != null ? c6Var.b0(i23) : org.telegram.ui.ActionBar.g6.x0(null, i23, false);
            int i24 = org.telegram.ui.ActionBar.g6.Oh;
            int b05 = c6Var != null ? c6Var.b0(i24) : org.telegram.ui.ActionBar.g6.x0(null, i24, false);
            int i25 = org.telegram.ui.ActionBar.g6.Qh;
            int b06 = c6Var != null ? c6Var.b0(i25) : org.telegram.ui.ActionBar.g6.x0(null, i25, false);
            org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(parentActivity2, c6Var);
            z2Var.a();
            org.telegram.ui.Components.m4 m4Var = new org.telegram.ui.Components.m4(parentActivity2, c6Var);
            m4Var.setMinValue(0);
            m4Var.setMaxValue(10);
            m4Var.setTextColor(b02);
            m4Var.setValue(r14 - 1);
            m4Var.setWrapSelectorWheel(false);
            m4Var.setFormatter(new is(i13));
            org.telegram.ui.Components.n4 n4Var = new org.telegram.ui.Components.n4(parentActivity2, c6Var);
            n4Var.setMinValue(0);
            n4Var.setMaxValue(10);
            n4Var.setTextColor(b02);
            n4Var.setValue((c11 / 60) - 1);
            n4Var.setWrapSelectorWheel(false);
            n4Var.setFormatter(new is(20));
            org.telegram.ui.Components.ud0 ud0Var = new org.telegram.ui.Components.ud0(parentActivity2, c6Var);
            ud0Var.setMinValue(0);
            ud0Var.setMaxValue(0);
            ud0Var.setTextColor(b02);
            ud0Var.setValue(0);
            ud0Var.setWrapSelectorWheel(false);
            ud0Var.setFormatter(new is(21));
            org.telegram.ui.Components.y3 y3Var = new org.telegram.ui.Components.y3(parentActivity2, m4Var, n4Var, ud0Var);
            y3Var.setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(parentActivity2);
            y3Var.addView(frameLayout, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
            TextView textView2 = new TextView(parentActivity2);
            textView2.setText(LocaleController.getString(R.string.NotfificationsFrequencyTitle));
            textView2.setTextColor(b02);
            textView2.setTextSize(1, 20.0f);
            textView2.setTypeface(AndroidUtilities.bold());
            frameLayout.addView(textView2, w7.z5.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
            textView2.setOnTouchListener(new ci.d(10));
            LinearLayout linearLayout = new LinearLayout(parentActivity2);
            linearLayout.setOrientation(0);
            linearLayout.setWeightSum(1.0f);
            y3Var.addView(linearLayout, w7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
            bi.f4 f4Var = new bi.f4(parentActivity2, 18);
            linearLayout.addView(m4Var, w7.z5.l(0.4f, 0, 270));
            linearLayout.addView(ud0Var, w7.z5.o(0, -2, 0.2f, 16));
            linearLayout.addView(n4Var, w7.z5.l(0.4f, 0, 270));
            f4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            f4Var.setGravity(17);
            f4Var.setTextColor(b04);
            f4Var.setTextSize(1, 14.0f);
            f4Var.setTypeface(AndroidUtilities.bold());
            int dp = AndroidUtilities.dp(8.0f);
            f4Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, b05, b06, b06));
            f4Var.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
            y3Var.addView(f4Var, w7.z5.t(-1, 48, 83, 16, 15, 16, 16));
            is isVar = new is(8);
            m4Var.setOnValueChangedListener(isVar);
            n4Var.setOnValueChangedListener(isVar);
            f4Var.setOnClickListener(new bi.b5(m4Var, n4Var, x11Var, z2Var, 7));
            z2Var.b(y3Var);
            org.telegram.ui.ActionBar.e3 e3Var = z2Var.a;
            e3Var.show();
            e3Var.setBackgroundColor(b03);
            e3Var.fixNavigationBar(b03);
        }
    }

    public static /* synthetic */ void W(c21 c21Var, String str) {
        c21Var.a0 = true;
        MessagesController.getNotificationsSettings(c21Var.currentAccount).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_CUSTOM + str, false).remove(NotificationsSettingsFacade.PROPERTY_NOTIFY + str).apply();
        c21Var.finishFragment();
        b21 b21Var = c21Var.r;
        if (b21Var != null) {
            b21Var.a0();
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f8;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        kVar.C(org.telegram.ui.ActionBar.g6.w0(i10, c6Var), false);
        this.actionBar.D(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.v8, c6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        long j10 = this.e;
        long j11 = this.f;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j11);
        this.actionBar.setActionBarMenuOnItemClick(new z11(this, sharedPrefKey));
        org.telegram.ui.Components.ro roVar = new org.telegram.ui.Components.ro(context, null, false, c6Var);
        this.s = roVar;
        roVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.actionBar.addView(this.s, 0, w7.z5.a(-1.0f, !this.inPreviewMode ? 56.0f : 0.0f, 0.0f, 40.0f, 0.0f, -2, 51));
        this.actionBar.setAllowOverlayTitle(false);
        if (j10 >= 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
            if (user != null) {
                this.s.setUserAvatar(user);
                this.s.setTitle(ContactsController.formatName(user.first_name, user.last_name));
            }
        } else if (j11 != 0) {
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-j10, j11);
            og.d.p(this.s.getAvatarImageView(), findTopic, false, true, c6Var);
            this.s.setTitle(findTopic.title);
        } else {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
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
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.a7, c6Var));
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.a = mm0Var;
        mm0Var.p1();
        this.actionBar.setAdaptiveBackground(this.a);
        frameLayout.addView(this.a, w7.z5.d(-1.0f, -1));
        org.telegram.ui.Components.mm0 mm0Var2 = this.a;
        a21 a21Var = new a21(this, context);
        this.b = a21Var;
        mm0Var2.setAdapter(a21Var);
        this.a.setItemAnimator(null);
        this.a.setLayoutAnimation(null);
        this.a.setLayoutManager(new hg.a0(17));
        this.a.setOnItemClickListener(new fc1(this, context, sharedPrefKey, 1));
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
    public final org.telegram.ui.ActionBar.c6 getResourceProvider() {
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        cz0 cz0Var = new cz0(1, this);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.ca.class, org.telegram.ui.Cells.y8.class, org.telegram.ui.Cells.k6.class, org.telegram.ui.Cells.wa.class, org.telegram.ui.Cells.w8.class, org.telegram.ui.Cells.s8.class}, null, null, null, org.telegram.ui.ActionBar.g6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.k0, null, null, org.telegram.ui.ActionBar.g6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 0, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 8192, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.g7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 16384, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.h7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 0, new Class[]{org.telegram.ui.Cells.wa.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 0, new Class[]{org.telegram.ui.Cells.wa.class}, new String[]{"statusColor"}, null, null, -1, cz0Var, org.telegram.ui.ActionBar.g6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 0, new Class[]{org.telegram.ui.Cells.wa.class}, new String[]{"statusOnlineColor"}, null, null, -1, cz0Var, org.telegram.ui.ActionBar.g6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 0, new Class[]{org.telegram.ui.Cells.wa.class}, null, org.telegram.ui.ActionBar.g6.r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, cz0Var, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, cz0Var, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, cz0Var, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, cz0Var, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, cz0Var, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, cz0Var, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, cz0Var, org.telegram.ui.ActionBar.g6.U7));
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
        a21 a21Var = this.b;
        if (a21Var != null) {
            a21Var.m(i10 == 13 ? this.Q : this.F);
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
                    int c10 = org.telegram.messenger.g0.c(NotificationsSettingsFacade.PROPERTY_NOTIFY, sharedPrefKey, notificationsSettings, 0);
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
