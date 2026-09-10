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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class c21 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
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
    public org.telegram.ui.Components.vl0 a;
    public boolean a0;
    public a21 b;
    public AnimatorSet c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final long e;
    public final long f;
    public final boolean h;
    public boolean n;
    public b21 r;
    public org.telegram.ui.Components.jo s;
    public int v;
    public int w;
    public int x;
    public int y;

    public c21(Bundle bundle, org.telegram.ui.ActionBar.f6 f6Var) {
        super(bundle);
        this.d = f6Var;
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
        long j3 = c21Var.f;
        long j10 = c21Var.e;
        org.telegram.ui.ActionBar.f6 f6Var = c21Var.d;
        if (view.isEnabled()) {
            Parcelable parcelable = null;
            final int i11 = 0;
            if (i10 == c21Var.W) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
                String string = LocaleController.getString(R.string.ResetCustomNotificationsAlertTitle);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                d2Var.R = string;
                d2Var.T = LocaleController.getString(R.string.ResetCustomNotificationsAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new x11(c21Var, str));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                c21Var.showDialog(d2Var);
                TextView textView = (TextView) d2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                    return;
                }
                return;
            }
            if (i10 == c21Var.F) {
                Bundle e = w.f.e(j10, "dialog_id");
                e.putLong("topic_id", j3);
                c21Var.presentFragment(new al0(e, f6Var));
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
                long j11 = c21Var.e;
                long j12 = c21Var.f;
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
                org.telegram.ui.ActionBar.f6 f6Var2 = c21Var.d;
                Pattern pattern = org.telegram.ui.Components.d5.a;
                c21Var.showDialog(org.telegram.ui.Components.d5.Y(parentActivity, j11, j12, j11 != 0 ? a4.a.o(j11, "vibrate_") : "vibrate_messages", runnable, f6Var2));
                return;
            }
            final int i13 = 3;
            if (i10 == c21Var.y) {
                org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                boolean z10 = !x8Var.e.h;
                c21Var.n = z10;
                x8Var.setChecked(z10);
                int childCount = c21Var.a.getChildCount();
                ArrayList arrayList = new ArrayList();
                while (i11 < childCount) {
                    org.telegram.ui.Components.fl0 fl0Var = (org.telegram.ui.Components.fl0) c21Var.a.T(c21Var.a.getChildAt(i11));
                    int i14 = fl0Var.f;
                    View view2 = fl0Var.a;
                    int b10 = fl0Var.b();
                    if (b10 != c21Var.y && b10 != c21Var.W) {
                        if (i14 == 0) {
                            ((org.telegram.ui.Cells.m4) view2).a(arrayList, c21Var.n);
                        } else if (i14 == 1) {
                            ((org.telegram.ui.Cells.ga) view2).a(arrayList, c21Var.n);
                        } else if (i14 == 2) {
                            ((org.telegram.ui.Cells.f9) view2).c(arrayList, c21Var.n);
                        } else if (i14 == 3) {
                            ((org.telegram.ui.Cells.z8) view2).a(arrayList, c21Var.n);
                        } else if (i14 == 4) {
                            ((org.telegram.ui.Cells.l6) view2).b(arrayList, c21Var.n);
                        } else if (i14 == 7 && b10 == c21Var.E) {
                            ((org.telegram.ui.Cells.x8) view2).e(arrayList, c21Var.n);
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
                c21Var.c.addListener(new mv0(c21Var, 5));
                c21Var.c.setDuration(150L);
                c21Var.c.start();
                return;
            }
            if (i10 == c21Var.E) {
                org.telegram.ui.Cells.x8 x8Var2 = (org.telegram.ui.Cells.x8) view;
                Switch r32 = x8Var2.e;
                MessagesController.getNotificationsSettings(c21Var.currentAccount).edit().putBoolean(org.telegram.ui.Cells.r6.i(NotificationsSettingsFacade.PROPERTY_CONTENT_PREVIEW, str), !r32.h).apply();
                x8Var2.setChecked(!r32.h);
                return;
            }
            if (i10 == c21Var.R) {
                c21Var.showDialog(org.telegram.ui.Components.d5.Y(c21Var.getParentActivity(), c21Var.e, c21Var.f, org.telegram.ui.Cells.r6.i("calls_vibrate_", str), new Runnable(c21Var) { // from class: org.telegram.ui.y11
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
                c21Var.showDialog(org.telegram.ui.Components.d5.I(c21Var.getParentActivity(), c21Var.e, c21Var.f, -1, new Runnable(c21Var) { // from class: org.telegram.ui.y11
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
                    c21Var.showDialog(org.telegram.ui.Components.d5.u(c21Var.getParentActivity(), c21Var.e, c21Var.f, -1, new Runnable(c21Var) { // from class: org.telegram.ui.y11
                        public final /* synthetic */ c21 b;

                        {
                            this.b = c21Var;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i13) {
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
                    ((org.telegram.ui.Cells.l6) view).a(true, true);
                    View findViewWithTag = c21Var.a.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((org.telegram.ui.Cells.l6) findViewWithTag).a(false, true);
                        return;
                    }
                    return;
                }
                if (i10 == c21Var.M) {
                    MessagesController.getNotificationsSettings(c21Var.currentAccount).edit().putInt("popup_" + str, 2).apply();
                    ((org.telegram.ui.Cells.l6) view).a(true, true);
                    View findViewWithTag2 = c21Var.a.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((org.telegram.ui.Cells.l6) findViewWithTag2).a(false, true);
                        return;
                    }
                    return;
                }
                if (i10 == c21Var.O) {
                    org.telegram.ui.Cells.x8 x8Var3 = (org.telegram.ui.Cells.x8) view;
                    boolean z11 = x8Var3.e.h;
                    boolean z12 = !z11;
                    x8Var3.setChecked(z12);
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(c21Var.currentAccount).edit();
                    if (!c21Var.Z || z11) {
                        edit.putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, z12);
                    } else {
                        edit.remove(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str);
                    }
                    edit.apply();
                    c21Var.getNotificationsController().updateServerNotificationsSettings(j10, j3);
                    return;
                }
                return;
            }
            if (c21Var.getParentActivity() == null) {
                return;
            }
            SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(c21Var.currentAccount);
            int c10 = org.telegram.messenger.a2.c("smart_max_count_", str, notificationsSettings2, 2);
            int c11 = org.telegram.messenger.a2.c("smart_delay_", str, notificationsSettings2, 180);
            r13 = c10 != 0 ? c10 : 2;
            Activity parentActivity2 = c21Var.getParentActivity();
            x11 x11Var = new x11(c21Var, str);
            Pattern pattern2 = org.telegram.ui.Components.d5.a;
            if (parentActivity2 == null) {
                return;
            }
            int i15 = org.telegram.ui.ActionBar.j6.j5;
            int e02 = f6Var != null ? f6Var.e0(i15) : org.telegram.ui.ActionBar.j6.w0(null, i15, false);
            int i16 = org.telegram.ui.ActionBar.j6.h5;
            int e03 = f6Var != null ? f6Var.e0(i16) : org.telegram.ui.ActionBar.j6.w0(null, i16, false);
            int i17 = org.telegram.ui.ActionBar.j6.Ji;
            if (f6Var != null) {
                f6Var.e0(i17);
            } else {
                org.telegram.ui.ActionBar.j6.w0(null, i17, false);
            }
            int i18 = org.telegram.ui.ActionBar.j6.Ni;
            if (f6Var != null) {
                f6Var.e0(i18);
            } else {
                org.telegram.ui.ActionBar.j6.w0(null, i18, false);
            }
            int i19 = org.telegram.ui.ActionBar.j6.E8;
            if (f6Var != null) {
                f6Var.e0(i19);
            } else {
                org.telegram.ui.ActionBar.j6.w0(null, i19, false);
            }
            int i20 = org.telegram.ui.ActionBar.j6.G8;
            if (f6Var != null) {
                f6Var.e0(i20);
            } else {
                org.telegram.ui.ActionBar.j6.w0(null, i20, false);
            }
            int i21 = org.telegram.ui.ActionBar.j6.i6;
            if (f6Var != null) {
                f6Var.e0(i21);
            } else {
                org.telegram.ui.ActionBar.j6.w0(null, i21, false);
            }
            int i22 = org.telegram.ui.ActionBar.j6.Sh;
            int e04 = f6Var != null ? f6Var.e0(i22) : org.telegram.ui.ActionBar.j6.w0(null, i22, false);
            int i23 = org.telegram.ui.ActionBar.j6.Oh;
            int e05 = f6Var != null ? f6Var.e0(i23) : org.telegram.ui.ActionBar.j6.w0(null, i23, false);
            int i24 = org.telegram.ui.ActionBar.j6.Qh;
            int e06 = f6Var != null ? f6Var.e0(i24) : org.telegram.ui.ActionBar.j6.w0(null, i24, false);
            org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3(parentActivity2, f6Var);
            c3Var.a();
            org.telegram.ui.Components.j4 j4Var = new org.telegram.ui.Components.j4(parentActivity2, f6Var);
            j4Var.setMinValue(0);
            j4Var.setMaxValue(10);
            j4Var.setTextColor(e02);
            j4Var.setValue(r13 - 1);
            j4Var.setWrapSelectorWheel(false);
            j4Var.setFormatter(new org.telegram.ui.Components.b(17));
            org.telegram.ui.Components.k4 k4Var = new org.telegram.ui.Components.k4(parentActivity2, f6Var);
            k4Var.setMinValue(0);
            k4Var.setMaxValue(10);
            k4Var.setTextColor(e02);
            k4Var.setValue((c11 / 60) - 1);
            k4Var.setWrapSelectorWheel(false);
            k4Var.setFormatter(new org.telegram.ui.Components.b(18));
            org.telegram.ui.Components.dd0 dd0Var = new org.telegram.ui.Components.dd0(parentActivity2, f6Var);
            dd0Var.setMinValue(0);
            dd0Var.setMaxValue(0);
            dd0Var.setTextColor(e02);
            dd0Var.setValue(0);
            dd0Var.setWrapSelectorWheel(false);
            dd0Var.setFormatter(new org.telegram.ui.Components.b(19));
            org.telegram.ui.Components.v3 v3Var = new org.telegram.ui.Components.v3(parentActivity2, j4Var, k4Var, dd0Var);
            v3Var.setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(parentActivity2);
            v3Var.addView(frameLayout, w7.a6.t(-1, -2, 51, 22, 0, 0, 4));
            TextView textView2 = new TextView(parentActivity2);
            textView2.setText(LocaleController.getString(R.string.NotfificationsFrequencyTitle));
            textView2.setTextColor(e02);
            textView2.setTextSize(1, 20.0f);
            textView2.setTypeface(AndroidUtilities.bold());
            frameLayout.addView(textView2, w7.a6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
            textView2.setOnTouchListener(new ai.h(10));
            LinearLayout linearLayout = new LinearLayout(parentActivity2);
            linearLayout.setOrientation(0);
            linearLayout.setWeightSum(1.0f);
            v3Var.addView(linearLayout, w7.a6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
            di.h hVar = new di.h(parentActivity2, 17);
            linearLayout.addView(j4Var, w7.a6.l(0.4f, 0, 270));
            linearLayout.addView(dd0Var, w7.a6.o(0, -2, 0.2f, 16));
            linearLayout.addView(k4Var, w7.a6.l(0.4f, 0, 270));
            hVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            hVar.setGravity(17);
            hVar.setTextColor(e04);
            hVar.setTextSize(1, 14.0f);
            hVar.setTypeface(AndroidUtilities.bold());
            int dp = AndroidUtilities.dp(8.0f);
            hVar.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, e05, e06, e06));
            hVar.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
            v3Var.addView(hVar, w7.a6.t(-1, 48, 83, 16, 15, 16, 16));
            org.telegram.ui.Components.b bVar = new org.telegram.ui.Components.b(6);
            j4Var.setOnValueChangedListener(bVar);
            k4Var.setOnValueChangedListener(bVar);
            hVar.setOnClickListener(new di.o(j4Var, k4Var, x11Var, c3Var, 6));
            c3Var.b(v3Var);
            org.telegram.ui.ActionBar.h3 h3Var = c3Var.a;
            h3Var.show();
            h3Var.setBackgroundColor(e03);
            h3Var.fixNavigationBar(e03);
        }
    }

    public static /* synthetic */ void W(c21 c21Var, String str) {
        c21Var.a0 = true;
        MessagesController.getNotificationsSettings(c21Var.currentAccount).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_CUSTOM + str, false).remove(NotificationsSettingsFacade.PROPERTY_NOTIFY + str).apply();
        c21Var.finishFragment();
        b21 b21Var = c21Var.r;
        if (b21Var != null) {
            b21Var.Z();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f8;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        lVar.A(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), false);
        this.actionBar.C(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v8, f6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        long j3 = this.e;
        long j10 = this.f;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j3, j10);
        this.actionBar.setActionBarMenuOnItemClick(new z11(this, sharedPrefKey));
        org.telegram.ui.Components.jo joVar = new org.telegram.ui.Components.jo(context, null, false, f6Var);
        this.s = joVar;
        joVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.actionBar.addView(this.s, 0, w7.a6.d(-2, -1.0f, 51, !this.inPreviewMode ? 56.0f : 0.0f, 0.0f, 40.0f, 0.0f));
        this.actionBar.setAllowOverlayTitle(false);
        if (j3 >= 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
            if (user != null) {
                this.s.setUserAvatar(user);
                this.s.setTitle(ContactsController.formatName(user.first_name, user.last_name));
            }
        } else if (j10 != 0) {
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-j3, j10);
            mg.d.p(this.s.getAvatarImageView(), findTopic, false, true, f6Var);
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
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, f6Var));
        org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(context, null);
        this.a = vl0Var;
        vl0Var.o1();
        this.actionBar.setAdaptiveBackground(this.a);
        frameLayout.addView(this.a, w7.a6.c(-1.0f, -1));
        org.telegram.ui.Components.vl0 vl0Var2 = this.a;
        a21 a21Var = new a21(this, context);
        this.b = a21Var;
        vl0Var2.setAdapter(a21Var);
        this.a.setItemAnimator(null);
        this.a.setLayoutAnimation(null);
        this.a.setLayoutManager(new fg.a0(17));
        this.a.setOnItemClickListener(new dc1(this, context, sharedPrefKey, 1));
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

    @Override // org.telegram.ui.ActionBar.p2
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        zy0 zy0Var = new zy0(1, this);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.ga.class, org.telegram.ui.Cells.z8.class, org.telegram.ui.Cells.l6.class, org.telegram.ui.Cells.ab.class, org.telegram.ui.Cells.x8.class, org.telegram.ui.Cells.t8.class}, null, null, null, org.telegram.ui.ActionBar.j6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.a7));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(lVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.ga.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.ga.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.l6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 8192, new Class[]{org.telegram.ui.Cells.l6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.g7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 16384, new Class[]{org.telegram.ui.Cells.l6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.h7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.ab.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.ab.class}, new String[]{"statusColor"}, null, null, -1, zy0Var, org.telegram.ui.ActionBar.j6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.ab.class}, new String[]{"statusOnlineColor"}, null, null, -1, zy0Var, org.telegram.ui.ActionBar.j6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.ab.class}, null, org.telegram.ui.ActionBar.j6.r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, zy0Var, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, zy0Var, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, zy0Var, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, zy0Var, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, zy0Var, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, zy0Var, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, zy0Var, org.telegram.ui.ActionBar.j6.U7));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
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
    @Override // org.telegram.ui.ActionBar.p2
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
                    int c10 = org.telegram.messenger.a2.c(NotificationsSettingsFacade.PROPERTY_NOTIFY, sharedPrefKey, notificationsSettings, 0);
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

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.a0) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.e, this.f);
            MessagesController.getNotificationsSettings(this.currentAccount).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_CUSTOM + sharedPrefKey, true).apply();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.a.setPadding(0, 0, 0, i13);
        this.a.setClipToPadding(false);
    }
}
