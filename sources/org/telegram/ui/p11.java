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

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class p11 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
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
    public org.telegram.ui.Components.zl0 b;
    public boolean b0;
    public n11 c;
    public AnimatorSet d;
    public final org.telegram.ui.ActionBar.d6 e;
    public final long f;
    public final long h;
    public final boolean n;
    public boolean r;
    public o11 s;
    public org.telegram.ui.Components.ho v;
    public int w;
    public int x;
    public int y;

    public p11(Bundle bundle, org.telegram.ui.ActionBar.d6 d6Var) {
        super(bundle);
        this.e = d6Var;
        this.f = bundle.getLong("dialog_id");
        this.h = bundle.getLong("topic_id");
        this.n = bundle.getBoolean("exception", false);
    }

    public static /* synthetic */ void S(p11 p11Var, String str, int i10, int i11) {
        MessagesController.getNotificationsSettings(p11Var.currentAccount).edit().putInt("smart_max_count_" + str, i10).putInt("smart_delay_" + str, i11).apply();
        n11 n11Var = p11Var.c;
        if (n11Var != null) {
            n11Var.m(p11Var.I);
        }
    }

    public static void T(final p11 p11Var, Context context, String str, View view, int i10) {
        long j3 = p11Var.h;
        long j10 = p11Var.f;
        org.telegram.ui.ActionBar.d6 d6Var = p11Var.e;
        if (view.isEnabled()) {
            Parcelable parcelable = null;
            final int i11 = 0;
            if (i10 == p11Var.X) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
                String string = LocaleController.getString(R.string.ResetCustomNotificationsAlertTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.R = string;
                b2Var.T = LocaleController.getString(R.string.ResetCustomNotificationsAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new k11(p11Var, str));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                p11Var.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q7, false));
                    return;
                }
                return;
            }
            if (i10 == p11Var.G) {
                Bundle f7 = sa.e.f(j10, "dialog_id");
                f7.putLong("topic_id", j3);
                p11Var.presentFragment(new wk0(f7, d6Var));
                return;
            }
            final int i12 = 1;
            if (i10 == p11Var.R) {
                try {
                    Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                    intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                    intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(p11Var.currentAccount);
                    Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
                    String path = uri != null ? uri.getPath() : null;
                    String string2 = notificationsSettings.getString("ringtone_path_" + str, path);
                    if (string2 != null && !string2.equals("NoSound")) {
                        parcelable = string2.equals(path) ? uri : Uri.parse(string2);
                    }
                    intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", parcelable);
                    p11Var.startActivityForResult(intent, 13);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            }
            if (i10 == p11Var.H) {
                Activity parentActivity = p11Var.getParentActivity();
                long j11 = p11Var.f;
                long j12 = p11Var.h;
                Runnable runnable = new Runnable(p11Var) { // from class: org.telegram.ui.l11
                    public final /* synthetic */ p11 b;

                    {
                        this.b = p11Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                p11 p11Var2 = this.b;
                                n11 n11Var = p11Var2.c;
                                if (n11Var != null) {
                                    n11Var.m(p11Var2.H);
                                    break;
                                }
                                break;
                            case 1:
                                p11 p11Var3 = this.b;
                                n11 n11Var2 = p11Var3.c;
                                if (n11Var2 != null) {
                                    n11Var2.m(p11Var3.S);
                                    break;
                                }
                                break;
                            case 2:
                                p11 p11Var4 = this.b;
                                n11 n11Var3 = p11Var4.c;
                                if (n11Var3 != null) {
                                    n11Var3.m(p11Var4.J);
                                    break;
                                }
                                break;
                            default:
                                p11 p11Var5 = this.b;
                                n11 n11Var4 = p11Var5.c;
                                if (n11Var4 != null) {
                                    n11Var4.m(p11Var5.V);
                                    break;
                                }
                                break;
                        }
                    }
                };
                org.telegram.ui.ActionBar.d6 d6Var2 = p11Var.e;
                Pattern pattern = org.telegram.ui.Components.e5.a;
                p11Var.showDialog(org.telegram.ui.Components.e5.Y(parentActivity, j11, j12, j11 != 0 ? a4.a.p(j11, "vibrate_") : "vibrate_messages", runnable, d6Var2));
                return;
            }
            int i13 = 16;
            int i14 = 7;
            final int i15 = 3;
            if (i10 == p11Var.E) {
                org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                boolean z10 = !w8Var.e.h;
                p11Var.r = z10;
                w8Var.setChecked(z10);
                int childCount = p11Var.b.getChildCount();
                ArrayList arrayList = new ArrayList();
                while (i11 < childCount) {
                    org.telegram.ui.Components.il0 il0Var = (org.telegram.ui.Components.il0) p11Var.b.T(p11Var.b.getChildAt(i11));
                    int i16 = il0Var.f;
                    View view2 = il0Var.a;
                    int b10 = il0Var.b();
                    if (b10 != p11Var.E && b10 != p11Var.X) {
                        if (i16 == 0) {
                            ((org.telegram.ui.Cells.m4) view2).a(arrayList, p11Var.r);
                        } else if (i16 == 1) {
                            ((org.telegram.ui.Cells.ea) view2).a(arrayList, p11Var.r);
                        } else if (i16 == 2) {
                            ((org.telegram.ui.Cells.e9) view2).c(arrayList, p11Var.r);
                        } else if (i16 == 3) {
                            ((org.telegram.ui.Cells.y8) view2).a(arrayList, p11Var.r);
                        } else if (i16 == 4) {
                            ((org.telegram.ui.Cells.k6) view2).b(arrayList, p11Var.r);
                        } else if (i16 == 7 && b10 == p11Var.F) {
                            ((org.telegram.ui.Cells.w8) view2).e(arrayList, p11Var.r);
                        }
                    }
                    i11++;
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                AnimatorSet animatorSet = p11Var.d;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                p11Var.d = animatorSet2;
                animatorSet2.playTogether(arrayList);
                p11Var.d.addListener(new ap0(p11Var, i13));
                p11Var.d.setDuration(150L);
                p11Var.d.start();
                return;
            }
            if (i10 == p11Var.F) {
                org.telegram.ui.Cells.w8 w8Var2 = (org.telegram.ui.Cells.w8) view;
                Switch r32 = w8Var2.e;
                MessagesController.getNotificationsSettings(p11Var.currentAccount).edit().putBoolean(sa.e.i(NotificationsSettingsFacade.PROPERTY_CONTENT_PREVIEW, str), !r32.h).apply();
                w8Var2.setChecked(!r32.h);
                return;
            }
            if (i10 == p11Var.S) {
                p11Var.showDialog(org.telegram.ui.Components.e5.Y(p11Var.getParentActivity(), p11Var.f, p11Var.h, sa.e.i("calls_vibrate_", str), new Runnable(p11Var) { // from class: org.telegram.ui.l11
                    public final /* synthetic */ p11 b;

                    {
                        this.b = p11Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                p11 p11Var2 = this.b;
                                n11 n11Var = p11Var2.c;
                                if (n11Var != null) {
                                    n11Var.m(p11Var2.H);
                                    break;
                                }
                                break;
                            case 1:
                                p11 p11Var3 = this.b;
                                n11 n11Var2 = p11Var3.c;
                                if (n11Var2 != null) {
                                    n11Var2.m(p11Var3.S);
                                    break;
                                }
                                break;
                            case 2:
                                p11 p11Var4 = this.b;
                                n11 n11Var3 = p11Var4.c;
                                if (n11Var3 != null) {
                                    n11Var3.m(p11Var4.J);
                                    break;
                                }
                                break;
                            default:
                                p11 p11Var5 = this.b;
                                n11 n11Var4 = p11Var5.c;
                                if (n11Var4 != null) {
                                    n11Var4.m(p11Var5.V);
                                    break;
                                }
                                break;
                        }
                    }
                }, p11Var.e));
                return;
            }
            if (i10 == p11Var.J) {
                p11Var.showDialog(org.telegram.ui.Components.e5.I(p11Var.getParentActivity(), p11Var.f, p11Var.h, -1, new Runnable(p11Var) { // from class: org.telegram.ui.l11
                    public final /* synthetic */ p11 b;

                    {
                        this.b = p11Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (r2) {
                            case 0:
                                p11 p11Var2 = this.b;
                                n11 n11Var = p11Var2.c;
                                if (n11Var != null) {
                                    n11Var.m(p11Var2.H);
                                    break;
                                }
                                break;
                            case 1:
                                p11 p11Var3 = this.b;
                                n11 n11Var2 = p11Var3.c;
                                if (n11Var2 != null) {
                                    n11Var2.m(p11Var3.S);
                                    break;
                                }
                                break;
                            case 2:
                                p11 p11Var4 = this.b;
                                n11 n11Var3 = p11Var4.c;
                                if (n11Var3 != null) {
                                    n11Var3.m(p11Var4.J);
                                    break;
                                }
                                break;
                            default:
                                p11 p11Var5 = this.b;
                                n11 n11Var4 = p11Var5.c;
                                if (n11Var4 != null) {
                                    n11Var4.m(p11Var5.V);
                                    break;
                                }
                                break;
                        }
                    }
                }, p11Var.e));
                return;
            }
            if (i10 != p11Var.I) {
                if (i10 == p11Var.V) {
                    if (p11Var.getParentActivity() == null) {
                        return;
                    }
                    p11Var.showDialog(org.telegram.ui.Components.e5.u(p11Var.getParentActivity(), p11Var.f, p11Var.h, -1, new Runnable(p11Var) { // from class: org.telegram.ui.l11
                        public final /* synthetic */ p11 b;

                        {
                            this.b = p11Var;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i15) {
                                case 0:
                                    p11 p11Var2 = this.b;
                                    n11 n11Var = p11Var2.c;
                                    if (n11Var != null) {
                                        n11Var.m(p11Var2.H);
                                        break;
                                    }
                                    break;
                                case 1:
                                    p11 p11Var3 = this.b;
                                    n11 n11Var2 = p11Var3.c;
                                    if (n11Var2 != null) {
                                        n11Var2.m(p11Var3.S);
                                        break;
                                    }
                                    break;
                                case 2:
                                    p11 p11Var4 = this.b;
                                    n11 n11Var3 = p11Var4.c;
                                    if (n11Var3 != null) {
                                        n11Var3.m(p11Var4.J);
                                        break;
                                    }
                                    break;
                                default:
                                    p11 p11Var5 = this.b;
                                    n11 n11Var4 = p11Var5.c;
                                    if (n11Var4 != null) {
                                        n11Var4.m(p11Var5.V);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, p11Var.e));
                    return;
                }
                if (i10 == p11Var.M) {
                    MessagesController.getNotificationsSettings(p11Var.currentAccount).edit().putInt("popup_" + str, 1).apply();
                    ((org.telegram.ui.Cells.k6) view).a(true, true);
                    View findViewWithTag = p11Var.b.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((org.telegram.ui.Cells.k6) findViewWithTag).a(false, true);
                        return;
                    }
                    return;
                }
                if (i10 == p11Var.N) {
                    MessagesController.getNotificationsSettings(p11Var.currentAccount).edit().putInt("popup_" + str, 2).apply();
                    ((org.telegram.ui.Cells.k6) view).a(true, true);
                    View findViewWithTag2 = p11Var.b.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((org.telegram.ui.Cells.k6) findViewWithTag2).a(false, true);
                        return;
                    }
                    return;
                }
                if (i10 == p11Var.P) {
                    org.telegram.ui.Cells.w8 w8Var3 = (org.telegram.ui.Cells.w8) view;
                    boolean z11 = w8Var3.e.h;
                    boolean z12 = !z11;
                    w8Var3.setChecked(z12);
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(p11Var.currentAccount).edit();
                    if (!p11Var.a0 || z11) {
                        edit.putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, z12);
                    } else {
                        edit.remove(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str);
                    }
                    edit.apply();
                    p11Var.getNotificationsController().updateServerNotificationsSettings(j10, j3);
                    return;
                }
                return;
            }
            if (p11Var.getParentActivity() == null) {
                return;
            }
            SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(p11Var.currentAccount);
            int c10 = org.telegram.messenger.q.c("smart_max_count_", str, notificationsSettings2, 2);
            int c11 = org.telegram.messenger.q.c("smart_delay_", str, notificationsSettings2, 180);
            r15 = c10 != 0 ? c10 : 2;
            Activity parentActivity2 = p11Var.getParentActivity();
            k11 k11Var = new k11(p11Var, str);
            Pattern pattern2 = org.telegram.ui.Components.e5.a;
            if (parentActivity2 == null) {
                return;
            }
            int i17 = org.telegram.ui.ActionBar.i6.j5;
            int j02 = d6Var != null ? d6Var.j0(i17) : org.telegram.ui.ActionBar.i6.w0(null, i17, false);
            int i18 = org.telegram.ui.ActionBar.i6.h5;
            int j03 = d6Var != null ? d6Var.j0(i18) : org.telegram.ui.ActionBar.i6.w0(null, i18, false);
            int i19 = org.telegram.ui.ActionBar.i6.Ji;
            if (d6Var != null) {
                d6Var.j0(i19);
            } else {
                org.telegram.ui.ActionBar.i6.w0(null, i19, false);
            }
            int i20 = org.telegram.ui.ActionBar.i6.Ni;
            if (d6Var != null) {
                d6Var.j0(i20);
            } else {
                org.telegram.ui.ActionBar.i6.w0(null, i20, false);
            }
            int i21 = org.telegram.ui.ActionBar.i6.E8;
            if (d6Var != null) {
                d6Var.j0(i21);
            } else {
                org.telegram.ui.ActionBar.i6.w0(null, i21, false);
            }
            int i22 = org.telegram.ui.ActionBar.i6.G8;
            if (d6Var != null) {
                d6Var.j0(i22);
            } else {
                org.telegram.ui.ActionBar.i6.w0(null, i22, false);
            }
            int i23 = org.telegram.ui.ActionBar.i6.i6;
            if (d6Var != null) {
                d6Var.j0(i23);
            } else {
                org.telegram.ui.ActionBar.i6.w0(null, i23, false);
            }
            int i24 = org.telegram.ui.ActionBar.i6.Sh;
            int j04 = d6Var != null ? d6Var.j0(i24) : org.telegram.ui.ActionBar.i6.w0(null, i24, false);
            int i25 = org.telegram.ui.ActionBar.i6.Oh;
            int j05 = d6Var != null ? d6Var.j0(i25) : org.telegram.ui.ActionBar.i6.w0(null, i25, false);
            int i26 = org.telegram.ui.ActionBar.i6.Qh;
            int j06 = d6Var != null ? d6Var.j0(i26) : org.telegram.ui.ActionBar.i6.w0(null, i26, false);
            org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(parentActivity2, d6Var);
            a3Var.a();
            org.telegram.ui.Components.k4 k4Var = new org.telegram.ui.Components.k4(parentActivity2, d6Var);
            k4Var.setMinValue(0);
            k4Var.setMaxValue(10);
            k4Var.setTextColor(j02);
            k4Var.setValue(r15 - 1);
            k4Var.setWrapSelectorWheel(false);
            k4Var.setFormatter(new org.telegram.ui.Components.w1(6));
            org.telegram.ui.Components.l4 l4Var = new org.telegram.ui.Components.l4(parentActivity2, d6Var);
            l4Var.setMinValue(0);
            l4Var.setMaxValue(10);
            l4Var.setTextColor(j02);
            l4Var.setValue((c11 / 60) - 1);
            l4Var.setWrapSelectorWheel(false);
            l4Var.setFormatter(new org.telegram.ui.Components.w1(i14));
            org.telegram.ui.Components.gd0 gd0Var = new org.telegram.ui.Components.gd0(parentActivity2, d6Var);
            gd0Var.setMinValue(0);
            gd0Var.setMaxValue(0);
            gd0Var.setTextColor(j02);
            gd0Var.setValue(0);
            gd0Var.setWrapSelectorWheel(false);
            gd0Var.setFormatter(new org.telegram.ui.Components.w1(8));
            org.telegram.ui.Components.w3 w3Var = new org.telegram.ui.Components.w3(parentActivity2, k4Var, l4Var, gd0Var);
            w3Var.setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(parentActivity2);
            w3Var.addView(frameLayout, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
            TextView textView2 = new TextView(parentActivity2);
            textView2.setText(LocaleController.getString(R.string.NotfificationsFrequencyTitle));
            textView2.setTextColor(j02);
            textView2.setTextSize(1, 20.0f);
            textView2.setTypeface(AndroidUtilities.bold());
            frameLayout.addView(textView2, w7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
            textView2.setOnTouchListener(new bi.d(10));
            LinearLayout linearLayout = new LinearLayout(parentActivity2);
            linearLayout.setOrientation(0);
            linearLayout.setWeightSum(1.0f);
            w3Var.addView(linearLayout, w7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
            ai.p4 p4Var = new ai.p4(parentActivity2, 18);
            linearLayout.addView(k4Var, w7.z5.l(0.4f, 0, 270));
            linearLayout.addView(gd0Var, w7.z5.o(0, -2, 0.2f, 16));
            linearLayout.addView(l4Var, w7.z5.l(0.4f, 0, 270));
            p4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            p4Var.setGravity(17);
            p4Var.setTextColor(j04);
            p4Var.setTextSize(1, 14.0f);
            p4Var.setTypeface(AndroidUtilities.bold());
            int dp = AndroidUtilities.dp(8.0f);
            p4Var.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.i0(dp, dp, dp, dp, j05, j06, j06));
            p4Var.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
            w3Var.addView(p4Var, w7.z5.t(-1, 48, 83, 16, 15, 16, 16));
            m4 m4Var = new m4(25);
            k4Var.setOnValueChangedListener(m4Var);
            l4Var.setOnValueChangedListener(m4Var);
            p4Var.setOnClickListener(new ai.o5(k4Var, l4Var, k11Var, a3Var, 7));
            a3Var.b(w3Var);
            org.telegram.ui.ActionBar.f3 f3Var = a3Var.a;
            f3Var.show();
            f3Var.setBackgroundColor(j03);
            f3Var.fixNavigationBar(j03);
        }
    }

    public static /* synthetic */ void U(p11 p11Var, String str) {
        p11Var.b0 = true;
        MessagesController.getNotificationsSettings(p11Var.currentAccount).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_CUSTOM + str, false).remove(NotificationsSettingsFacade.PROPERTY_NOTIFY + str).apply();
        p11Var.finishFragment();
        o11 o11Var = p11Var.s;
        if (o11Var != null) {
            o11Var.d0();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.f8;
        org.telegram.ui.ActionBar.d6 d6Var = this.e;
        kVar.z(org.telegram.ui.ActionBar.i6.v0(i10, d6Var), false);
        this.actionBar.A(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.v8, d6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        long j3 = this.f;
        long j10 = this.h;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j3, j10);
        this.actionBar.setActionBarMenuOnItemClick(new m11(this, sharedPrefKey));
        org.telegram.ui.Components.ho hoVar = new org.telegram.ui.Components.ho(context, null, false, d6Var);
        this.v = hoVar;
        hoVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.actionBar.addView(this.v, 0, w7.z5.d(-2, -1.0f, 51, !this.inPreviewMode ? 56.0f : 0.0f, 0.0f, 40.0f, 0.0f));
        this.actionBar.setAllowOverlayTitle(false);
        if (j3 >= 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
            if (user != null) {
                this.v.setUserAvatar(user);
                this.actionBar.setTitle(ContactsController.formatName(user.first_name, user.last_name));
            }
        } else if (j10 != 0) {
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-j3, j10);
            ng.d.p(this.v.getAvatarImageView(), findTopic, false, true, d6Var);
            this.actionBar.setTitle(findTopic.title);
        } else {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j3));
            this.v.setChatAvatar(chat);
            this.actionBar.setTitle(chat.title);
        }
        if (this.n) {
            this.actionBar.setSubtitle(LocaleController.getString(R.string.NotificationsNewException));
            this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        } else {
            this.actionBar.setSubtitle(LocaleController.getString(R.string.CustomNotifications));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(context, null);
        this.b = zl0Var;
        zl0Var.r1();
        this.b.setSectionsDrawBackground(true);
        frameLayout.addView(this.b, w7.z5.c(-1.0f, -1));
        org.telegram.ui.Components.zl0 zl0Var2 = this.b;
        n11 n11Var = new n11(this, context);
        this.c = n11Var;
        zl0Var2.setAdapter(n11Var);
        this.b.setItemAnimator(null);
        this.b.setLayoutAnimation(null);
        this.b.setLayoutManager(new gg.b0(17));
        this.b.setOnItemClickListener(new sb1(this, context, sharedPrefKey, 1));
        this.a = frameLayout;
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.notificationsSettingsUpdated) {
            try {
                this.c.l();
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final org.telegram.ui.Components.zl0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final org.telegram.ui.ActionBar.d6 getResourceProvider() {
        return this.e;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        qy0 qy0Var = new qy0(1, this);
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.ea.class, org.telegram.ui.Cells.y8.class, org.telegram.ui.Cells.k6.class, org.telegram.ui.Cells.ya.class, org.telegram.ui.Cells.w8.class, org.telegram.ui.Cells.s8.class}, null, null, null, org.telegram.ui.ActionBar.i6.d6));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.k6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.k0, null, null, org.telegram.ui.ActionBar.i6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.L6));
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 8192, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.g7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 16384, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.h7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{org.telegram.ui.Cells.ya.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{org.telegram.ui.Cells.ya.class}, new String[]{"statusColor"}, null, null, -1, qy0Var, org.telegram.ui.ActionBar.i6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{org.telegram.ui.Cells.ya.class}, new String[]{"statusOnlineColor"}, null, null, -1, qy0Var, org.telegram.ui.ActionBar.i6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{org.telegram.ui.Cells.ya.class}, null, org.telegram.ui.ActionBar.i6.r0, null, org.telegram.ui.ActionBar.i6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.i6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.i6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.i6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.i6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.i6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.i6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.i6.U7));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
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
        String sharedPrefKey = NotificationsController.getSharedPrefKey(this.f, this.h);
        if (i10 == 12) {
            if (str != null) {
                edit.putString("sound_" + sharedPrefKey, str);
                edit.putString("sound_path_" + sharedPrefKey, uri.toString());
            } else {
                edit.putString("sound_" + sharedPrefKey, "NoSound");
                edit.putString("sound_path_" + sharedPrefKey, "NoSound");
            }
            getNotificationsController().deleteNotificationChannel(this.f, this.h);
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
        n11 n11Var = this.c;
        if (n11Var != null) {
            n11Var.m(i10 == 13 ? this.R : this.G);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010f  */
    @Override // org.telegram.ui.ActionBar.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        boolean z10;
        long j3 = this.f;
        if (DialogObject.isUserDialog(j3)) {
            ArrayList<TLRPC.TL_topPeer> arrayList = getMediaDataController().hints;
            int i10 = 0;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                TLRPC.Peer peer = arrayList.get(i10).peer;
                if ((peer instanceof TLRPC.TL_peerUser) && peer.user_id == j3) {
                    this.a0 = i10 < 5;
                } else {
                    i10++;
                }
            }
        }
        this.Z = 0;
        boolean z11 = this.n;
        if (z11) {
            this.x = 0;
            this.Z = 1 + 1;
            this.y = 1;
        } else {
            this.x = -1;
            this.y = -1;
        }
        int i11 = this.Z;
        int i12 = i11 + 1;
        this.Z = i12;
        this.w = i11;
        long j10 = this.h;
        if (z11 || j10 != 0) {
            this.Z = i11 + 2;
            this.E = i12;
        } else {
            this.E = -1;
        }
        this.P = -1;
        if (DialogObject.isEncryptedDialog(j3)) {
            this.F = -1;
        } else {
            int i13 = this.Z;
            this.Z = i13 + 1;
            this.F = i13;
            if (DialogObject.isUserDialog(j3)) {
                int i14 = this.Z;
                this.Z = i14 + 1;
                this.P = i14;
            }
        }
        int i15 = this.Z;
        this.G = i15;
        this.Z = i15 + 2;
        this.H = i15 + 1;
        if (DialogObject.isChatDialog(j3)) {
            int i16 = this.Z;
            this.Z = i16 + 1;
            this.I = i16;
        } else {
            this.I = -1;
        }
        int i17 = this.Z;
        this.J = i17;
        this.Z = i17 + 2;
        this.K = i17 + 1;
        if (DialogObject.isChatDialog(j3)) {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                z10 = true;
                if (!DialogObject.isEncryptedDialog(j3) || z10) {
                    this.L = -1;
                    this.M = -1;
                    this.N = -1;
                    this.O = -1;
                } else {
                    int i18 = this.Z;
                    this.L = i18;
                    this.M = i18 + 1;
                    this.N = i18 + 2;
                    this.Z = i18 + 4;
                    this.O = i18 + 3;
                }
                if (DialogObject.isUserDialog(j3)) {
                    this.Q = -1;
                    this.S = -1;
                    this.R = -1;
                    this.T = -1;
                } else {
                    int i19 = this.Z;
                    this.Q = i19;
                    this.S = i19 + 1;
                    this.R = i19 + 2;
                    this.Z = i19 + 4;
                    this.T = i19 + 3;
                }
                int i20 = this.Z;
                this.U = i20;
                this.V = i20 + 1;
                int i21 = i20 + 3;
                this.Z = i21;
                this.W = i20 + 2;
                if (z11) {
                    this.X = i21;
                    this.Z = i20 + 5;
                    this.Y = i20 + 4;
                } else {
                    this.X = -1;
                    this.Y = -1;
                }
                boolean isGlobalNotificationsEnabled = NotificationsController.getInstance(this.currentAccount).isGlobalNotificationsEnabled(j3, false, false);
                if (z11) {
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.currentAccount);
                    String sharedPrefKey = NotificationsController.getSharedPrefKey(j3, j10);
                    boolean contains = notificationsSettings.contains(NotificationsSettingsFacade.PROPERTY_NOTIFY + sharedPrefKey);
                    int c10 = org.telegram.messenger.q.c(NotificationsSettingsFacade.PROPERTY_NOTIFY, sharedPrefKey, notificationsSettings, 0);
                    if (c10 == 0) {
                        if (contains) {
                            this.r = true;
                        } else {
                            this.r = NotificationsController.getInstance(this.currentAccount).isGlobalNotificationsEnabled(j3, false, false);
                        }
                    } else if (c10 == 1) {
                        this.r = true;
                    } else if (c10 == 2) {
                        this.r = false;
                    } else {
                        this.r = false;
                    }
                } else {
                    this.r = !isGlobalNotificationsEnabled;
                }
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.notificationsSettingsUpdated);
                return super.onFragmentCreate();
            }
        }
        z10 = false;
        if (DialogObject.isEncryptedDialog(j3)) {
        }
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        if (DialogObject.isUserDialog(j3)) {
        }
        int i202 = this.Z;
        this.U = i202;
        this.V = i202 + 1;
        int i212 = i202 + 3;
        this.Z = i212;
        this.W = i202 + 2;
        if (z11) {
        }
        boolean isGlobalNotificationsEnabled2 = NotificationsController.getInstance(this.currentAccount).isGlobalNotificationsEnabled(j3, false, false);
        if (z11) {
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.notificationsSettingsUpdated);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.b0) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.f, this.h);
            MessagesController.getNotificationsSettings(this.currentAccount).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_CUSTOM + sharedPrefKey, true).apply();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        super.onInsets(i10, i11, i12, i13);
        AndroidUtilities.setViewLayoutMargins(this.v.e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(42.0f)) / 2) + this.mSystemInsets.b, AndroidUtilities.dp(6.0f), 0);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        AndroidUtilities.removeFromParent(this.v.e);
        if (!this.n) {
            this.a.addView(this.v.e, w7.z5.e(42, 42, 53));
        }
        AndroidUtilities.setViewLayoutMargins(this.v.e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(42.0f)) / 2) + this.mSystemInsets.b, AndroidUtilities.dp(6.0f), 0);
    }
}
