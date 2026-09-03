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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class l11 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public int B;
    public int C;
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
    public boolean W;
    public boolean X;
    public org.telegram.ui.Components.rl0 a;
    public j11 b;
    public AnimatorSet c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final long e;
    public final long f;
    public final boolean h;
    public boolean n;
    public k11 r;
    public org.telegram.ui.Components.yn s;
    public int v;
    public int w;
    public int x;
    public int y;

    public l11(Bundle bundle, org.telegram.ui.ActionBar.f6 f6Var) {
        super(bundle);
        this.d = f6Var;
        this.e = bundle.getLong("dialog_id");
        this.f = bundle.getLong("topic_id");
        this.h = bundle.getBoolean("exception", false);
    }

    public static /* synthetic */ void U(l11 l11Var, String str, int i10, int i11) {
        MessagesController.getNotificationsSettings(l11Var.currentAccount).edit().putInt("smart_max_count_" + str, i10).putInt("smart_delay_" + str, i11).apply();
        j11 j11Var = l11Var.b;
        if (j11Var != null) {
            j11Var.m(l11Var.E);
        }
    }

    public static void V(final l11 l11Var, Context context, String str, View view, int i10) {
        long j10 = l11Var.f;
        long j11 = l11Var.e;
        org.telegram.ui.ActionBar.f6 f6Var = l11Var.d;
        if (view.isEnabled()) {
            Parcelable parcelable = null;
            final int i11 = 0;
            if (i10 == l11Var.T) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
                String string = LocaleController.getString(R.string.ResetCustomNotificationsAlertTitle);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                d2Var.O = string;
                d2Var.Q = LocaleController.getString(R.string.ResetCustomNotificationsAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new g11(l11Var, str));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                l11Var.showDialog(d2Var);
                TextView textView = (TextView) d2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                    return;
                }
                return;
            }
            if (i10 == l11Var.C) {
                Bundle g10 = kf.k0.g(j11, "dialog_id");
                g10.putLong("topic_id", j10);
                l11Var.presentFragment(new qk0(g10, f6Var));
                return;
            }
            final int i12 = 1;
            if (i10 == l11Var.N) {
                try {
                    Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                    intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                    intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(l11Var.currentAccount);
                    Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
                    String path = uri != null ? uri.getPath() : null;
                    String string2 = notificationsSettings.getString("ringtone_path_" + str, path);
                    if (string2 != null && !string2.equals("NoSound")) {
                        parcelable = string2.equals(path) ? uri : Uri.parse(string2);
                    }
                    intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", parcelable);
                    l11Var.startActivityForResult(intent, 13);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            }
            if (i10 == l11Var.D) {
                Activity parentActivity = l11Var.getParentActivity();
                long j12 = l11Var.e;
                long j13 = l11Var.f;
                Runnable runnable = new Runnable(l11Var) { // from class: org.telegram.ui.h11
                    public final /* synthetic */ l11 b;

                    {
                        this.b = l11Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                l11 l11Var2 = this.b;
                                j11 j11Var = l11Var2.b;
                                if (j11Var != null) {
                                    j11Var.m(l11Var2.D);
                                    break;
                                }
                                break;
                            case 1:
                                l11 l11Var3 = this.b;
                                j11 j11Var2 = l11Var3.b;
                                if (j11Var2 != null) {
                                    j11Var2.m(l11Var3.O);
                                    break;
                                }
                                break;
                            case 2:
                                l11 l11Var4 = this.b;
                                j11 j11Var3 = l11Var4.b;
                                if (j11Var3 != null) {
                                    j11Var3.m(l11Var4.F);
                                    break;
                                }
                                break;
                            default:
                                l11 l11Var5 = this.b;
                                j11 j11Var4 = l11Var5.b;
                                if (j11Var4 != null) {
                                    j11Var4.m(l11Var5.R);
                                    break;
                                }
                                break;
                        }
                    }
                };
                org.telegram.ui.ActionBar.f6 f6Var2 = l11Var.d;
                Pattern pattern = org.telegram.ui.Components.z4.a;
                l11Var.showDialog(org.telegram.ui.Components.z4.Y(parentActivity, j12, j13, j12 != 0 ? android.support.v4.media.a.n(j12, "vibrate_") : "vibrate_messages", runnable, f6Var2));
                return;
            }
            final int i13 = 3;
            if (i10 == l11Var.y) {
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                boolean z4 = !r8Var.e.h;
                l11Var.n = z4;
                r8Var.setChecked(z4);
                int childCount = l11Var.a.getChildCount();
                ArrayList arrayList = new ArrayList();
                while (i11 < childCount) {
                    org.telegram.ui.Components.dl0 dl0Var = (org.telegram.ui.Components.dl0) l11Var.a.T(l11Var.a.getChildAt(i11));
                    int i14 = dl0Var.f;
                    View view2 = dl0Var.a;
                    int b10 = dl0Var.b();
                    if (b10 != l11Var.y && b10 != l11Var.T) {
                        if (i14 == 0) {
                            ((org.telegram.ui.Cells.l4) view2).a(arrayList, l11Var.n);
                        } else if (i14 == 1) {
                            ((org.telegram.ui.Cells.z9) view2).a(arrayList, l11Var.n);
                        } else if (i14 == 2) {
                            ((org.telegram.ui.Cells.z8) view2).c(arrayList, l11Var.n);
                        } else if (i14 == 3) {
                            ((org.telegram.ui.Cells.t8) view2).a(arrayList, l11Var.n);
                        } else if (i14 == 4) {
                            ((org.telegram.ui.Cells.i6) view2).b(arrayList, l11Var.n);
                        } else if (i14 == 7 && b10 == l11Var.B) {
                            ((org.telegram.ui.Cells.r8) view2).e(arrayList, l11Var.n);
                        }
                    }
                    i11++;
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                AnimatorSet animatorSet = l11Var.c;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                l11Var.c = animatorSet2;
                animatorSet2.playTogether(arrayList);
                l11Var.c.addListener(new ss0(l11Var, 14));
                l11Var.c.setDuration(150L);
                l11Var.c.start();
                return;
            }
            if (i10 == l11Var.B) {
                org.telegram.ui.Cells.r8 r8Var2 = (org.telegram.ui.Cells.r8) view;
                Switch r32 = r8Var2.e;
                MessagesController.getNotificationsSettings(l11Var.currentAccount).edit().putBoolean(vh.w2.e(NotificationsSettingsFacade.PROPERTY_CONTENT_PREVIEW, str), !r32.h).apply();
                r8Var2.setChecked(!r32.h);
                return;
            }
            if (i10 == l11Var.O) {
                l11Var.showDialog(org.telegram.ui.Components.z4.Y(l11Var.getParentActivity(), l11Var.e, l11Var.f, vh.w2.e("calls_vibrate_", str), new Runnable(l11Var) { // from class: org.telegram.ui.h11
                    public final /* synthetic */ l11 b;

                    {
                        this.b = l11Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                l11 l11Var2 = this.b;
                                j11 j11Var = l11Var2.b;
                                if (j11Var != null) {
                                    j11Var.m(l11Var2.D);
                                    break;
                                }
                                break;
                            case 1:
                                l11 l11Var3 = this.b;
                                j11 j11Var2 = l11Var3.b;
                                if (j11Var2 != null) {
                                    j11Var2.m(l11Var3.O);
                                    break;
                                }
                                break;
                            case 2:
                                l11 l11Var4 = this.b;
                                j11 j11Var3 = l11Var4.b;
                                if (j11Var3 != null) {
                                    j11Var3.m(l11Var4.F);
                                    break;
                                }
                                break;
                            default:
                                l11 l11Var5 = this.b;
                                j11 j11Var4 = l11Var5.b;
                                if (j11Var4 != null) {
                                    j11Var4.m(l11Var5.R);
                                    break;
                                }
                                break;
                        }
                    }
                }, l11Var.d));
                return;
            }
            if (i10 == l11Var.F) {
                l11Var.showDialog(org.telegram.ui.Components.z4.I(l11Var.getParentActivity(), l11Var.e, l11Var.f, -1, new Runnable(l11Var) { // from class: org.telegram.ui.h11
                    public final /* synthetic */ l11 b;

                    {
                        this.b = l11Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (r2) {
                            case 0:
                                l11 l11Var2 = this.b;
                                j11 j11Var = l11Var2.b;
                                if (j11Var != null) {
                                    j11Var.m(l11Var2.D);
                                    break;
                                }
                                break;
                            case 1:
                                l11 l11Var3 = this.b;
                                j11 j11Var2 = l11Var3.b;
                                if (j11Var2 != null) {
                                    j11Var2.m(l11Var3.O);
                                    break;
                                }
                                break;
                            case 2:
                                l11 l11Var4 = this.b;
                                j11 j11Var3 = l11Var4.b;
                                if (j11Var3 != null) {
                                    j11Var3.m(l11Var4.F);
                                    break;
                                }
                                break;
                            default:
                                l11 l11Var5 = this.b;
                                j11 j11Var4 = l11Var5.b;
                                if (j11Var4 != null) {
                                    j11Var4.m(l11Var5.R);
                                    break;
                                }
                                break;
                        }
                    }
                }, l11Var.d));
                return;
            }
            if (i10 != l11Var.E) {
                if (i10 == l11Var.R) {
                    if (l11Var.getParentActivity() == null) {
                        return;
                    }
                    l11Var.showDialog(org.telegram.ui.Components.z4.u(l11Var.getParentActivity(), l11Var.e, l11Var.f, -1, new Runnable(l11Var) { // from class: org.telegram.ui.h11
                        public final /* synthetic */ l11 b;

                        {
                            this.b = l11Var;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i13) {
                                case 0:
                                    l11 l11Var2 = this.b;
                                    j11 j11Var = l11Var2.b;
                                    if (j11Var != null) {
                                        j11Var.m(l11Var2.D);
                                        break;
                                    }
                                    break;
                                case 1:
                                    l11 l11Var3 = this.b;
                                    j11 j11Var2 = l11Var3.b;
                                    if (j11Var2 != null) {
                                        j11Var2.m(l11Var3.O);
                                        break;
                                    }
                                    break;
                                case 2:
                                    l11 l11Var4 = this.b;
                                    j11 j11Var3 = l11Var4.b;
                                    if (j11Var3 != null) {
                                        j11Var3.m(l11Var4.F);
                                        break;
                                    }
                                    break;
                                default:
                                    l11 l11Var5 = this.b;
                                    j11 j11Var4 = l11Var5.b;
                                    if (j11Var4 != null) {
                                        j11Var4.m(l11Var5.R);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, l11Var.d));
                    return;
                }
                if (i10 == l11Var.I) {
                    MessagesController.getNotificationsSettings(l11Var.currentAccount).edit().putInt("popup_" + str, 1).apply();
                    ((org.telegram.ui.Cells.i6) view).a(true, true);
                    View findViewWithTag = l11Var.a.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((org.telegram.ui.Cells.i6) findViewWithTag).a(false, true);
                        return;
                    }
                    return;
                }
                if (i10 == l11Var.J) {
                    MessagesController.getNotificationsSettings(l11Var.currentAccount).edit().putInt("popup_" + str, 2).apply();
                    ((org.telegram.ui.Cells.i6) view).a(true, true);
                    View findViewWithTag2 = l11Var.a.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((org.telegram.ui.Cells.i6) findViewWithTag2).a(false, true);
                        return;
                    }
                    return;
                }
                if (i10 == l11Var.L) {
                    org.telegram.ui.Cells.r8 r8Var3 = (org.telegram.ui.Cells.r8) view;
                    boolean z10 = r8Var3.e.h;
                    boolean z11 = !z10;
                    r8Var3.setChecked(z11);
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(l11Var.currentAccount).edit();
                    if (!l11Var.W || z10) {
                        edit.putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, z11);
                    } else {
                        edit.remove(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str);
                    }
                    edit.apply();
                    l11Var.getNotificationsController().updateServerNotificationsSettings(j11, j10);
                    return;
                }
                return;
            }
            if (l11Var.getParentActivity() == null) {
                return;
            }
            SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(l11Var.currentAccount);
            int c3 = org.telegram.messenger.y3.c("smart_max_count_", str, notificationsSettings2, 2);
            int c10 = org.telegram.messenger.y3.c("smart_delay_", str, notificationsSettings2, 180);
            r13 = c3 != 0 ? c3 : 2;
            Activity parentActivity2 = l11Var.getParentActivity();
            g11 g11Var = new g11(l11Var, str);
            Pattern pattern2 = org.telegram.ui.Components.z4.a;
            if (parentActivity2 == null) {
                return;
            }
            int i15 = org.telegram.ui.ActionBar.j6.j5;
            int d02 = f6Var != null ? f6Var.d0(i15) : org.telegram.ui.ActionBar.j6.w0(null, i15, false);
            int i16 = org.telegram.ui.ActionBar.j6.h5;
            int d03 = f6Var != null ? f6Var.d0(i16) : org.telegram.ui.ActionBar.j6.w0(null, i16, false);
            int i17 = org.telegram.ui.ActionBar.j6.Ji;
            if (f6Var != null) {
                f6Var.d0(i17);
            } else {
                org.telegram.ui.ActionBar.j6.w0(null, i17, false);
            }
            int i18 = org.telegram.ui.ActionBar.j6.Ni;
            if (f6Var != null) {
                f6Var.d0(i18);
            } else {
                org.telegram.ui.ActionBar.j6.w0(null, i18, false);
            }
            int i19 = org.telegram.ui.ActionBar.j6.E8;
            if (f6Var != null) {
                f6Var.d0(i19);
            } else {
                org.telegram.ui.ActionBar.j6.w0(null, i19, false);
            }
            int i20 = org.telegram.ui.ActionBar.j6.G8;
            if (f6Var != null) {
                f6Var.d0(i20);
            } else {
                org.telegram.ui.ActionBar.j6.w0(null, i20, false);
            }
            int i21 = org.telegram.ui.ActionBar.j6.i6;
            if (f6Var != null) {
                f6Var.d0(i21);
            } else {
                org.telegram.ui.ActionBar.j6.w0(null, i21, false);
            }
            int i22 = org.telegram.ui.ActionBar.j6.Sh;
            int d04 = f6Var != null ? f6Var.d0(i22) : org.telegram.ui.ActionBar.j6.w0(null, i22, false);
            int i23 = org.telegram.ui.ActionBar.j6.Oh;
            int d05 = f6Var != null ? f6Var.d0(i23) : org.telegram.ui.ActionBar.j6.w0(null, i23, false);
            int i24 = org.telegram.ui.ActionBar.j6.Qh;
            int d06 = f6Var != null ? f6Var.d0(i24) : org.telegram.ui.ActionBar.j6.w0(null, i24, false);
            org.telegram.ui.ActionBar.b3 b3Var = new org.telegram.ui.ActionBar.b3(parentActivity2, f6Var);
            b3Var.a();
            org.telegram.ui.Components.f4 f4Var = new org.telegram.ui.Components.f4(parentActivity2, f6Var);
            f4Var.setMinValue(0);
            f4Var.setMaxValue(10);
            f4Var.setTextColor(d02);
            f4Var.setValue(r13 - 1);
            f4Var.setWrapSelectorWheel(false);
            f4Var.setFormatter(new bs(20));
            org.telegram.ui.Components.g4 g4Var = new org.telegram.ui.Components.g4(parentActivity2, f6Var);
            g4Var.setMinValue(0);
            g4Var.setMaxValue(10);
            g4Var.setTextColor(d02);
            g4Var.setValue((c10 / 60) - 1);
            g4Var.setWrapSelectorWheel(false);
            g4Var.setFormatter(new bs(21));
            org.telegram.ui.Components.xc0 xc0Var = new org.telegram.ui.Components.xc0(parentActivity2, f6Var);
            xc0Var.setMinValue(0);
            xc0Var.setMaxValue(0);
            xc0Var.setTextColor(d02);
            xc0Var.setValue(0);
            xc0Var.setWrapSelectorWheel(false);
            xc0Var.setFormatter(new bs(22));
            org.telegram.ui.Components.s3 s3Var = new org.telegram.ui.Components.s3(parentActivity2, f4Var, g4Var, xc0Var);
            s3Var.setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(parentActivity2);
            s3Var.addView(frameLayout, k7.b6.t(-1, -2, 51, 22, 0, 0, 4));
            TextView textView2 = new TextView(parentActivity2);
            textView2.setText(LocaleController.getString(R.string.NotfificationsFrequencyTitle));
            textView2.setTextColor(d02);
            textView2.setTextSize(1, 20.0f);
            textView2.setTypeface(AndroidUtilities.bold());
            frameLayout.addView(textView2, k7.b6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
            textView2.setOnTouchListener(new oh.d(10));
            LinearLayout linearLayout = new LinearLayout(parentActivity2);
            linearLayout.setOrientation(0);
            linearLayout.setWeightSum(1.0f);
            s3Var.addView(linearLayout, k7.b6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
            gg.q qVar = new gg.q(parentActivity2, 17);
            linearLayout.addView(f4Var, k7.b6.l(0.4f, 0, 270));
            linearLayout.addView(xc0Var, k7.b6.o(0, -2, 0.2f, 16));
            linearLayout.addView(g4Var, k7.b6.l(0.4f, 0, 270));
            qVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            qVar.setGravity(17);
            qVar.setTextColor(d04);
            qVar.setTextSize(1, 14.0f);
            qVar.setTypeface(AndroidUtilities.bold());
            int dp = AndroidUtilities.dp(8.0f);
            qVar.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, d05, d06, d06));
            qVar.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
            s3Var.addView(qVar, k7.b6.t(-1, 48, 83, 16, 15, 16, 16));
            bs bsVar = new bs(9);
            f4Var.setOnValueChangedListener(bsVar);
            g4Var.setOnValueChangedListener(bsVar);
            qVar.setOnClickListener(new kh.t3(f4Var, g4Var, g11Var, b3Var, 5));
            b3Var.b(s3Var);
            org.telegram.ui.ActionBar.g3 g3Var = b3Var.a;
            g3Var.show();
            g3Var.setBackgroundColor(d03);
            g3Var.fixNavigationBar(d03);
        }
    }

    public static /* synthetic */ void W(l11 l11Var, String str) {
        l11Var.X = true;
        MessagesController.getNotificationsSettings(l11Var.currentAccount).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_CUSTOM + str, false).remove(NotificationsSettingsFacade.PROPERTY_NOTIFY + str).apply();
        l11Var.finishFragment();
        k11 k11Var = l11Var.r;
        if (k11Var != null) {
            k11Var.b0();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f8;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        kVar.B(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), false);
        this.actionBar.C(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v8, f6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        long j10 = this.e;
        long j11 = this.f;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j11);
        this.actionBar.setActionBarMenuOnItemClick(new i11(this, sharedPrefKey));
        org.telegram.ui.Components.yn ynVar = new org.telegram.ui.Components.yn(context, null, false, f6Var);
        this.s = ynVar;
        ynVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.actionBar.addView(this.s, 0, k7.b6.d(-2, -1.0f, 51, !this.inPreviewMode ? 56.0f : 0.0f, 0.0f, 40.0f, 0.0f));
        this.actionBar.setAllowOverlayTitle(false);
        if (j10 >= 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
            if (user != null) {
                this.s.setUserAvatar(user);
                this.s.setTitle(ContactsController.formatName(user.first_name, user.last_name));
            }
        } else if (j11 != 0) {
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-j10, j11);
            ag.f.p(this.s.getAvatarImageView(), findTopic, false, true, f6Var);
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
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, f6Var));
        org.telegram.ui.Components.rl0 rl0Var = new org.telegram.ui.Components.rl0(context, null);
        this.a = rl0Var;
        rl0Var.o1();
        this.actionBar.setAdaptiveBackground(this.a);
        frameLayout.addView(this.a, k7.b6.c(-1.0f, -1));
        org.telegram.ui.Components.rl0 rl0Var2 = this.a;
        j11 j11Var = new j11(this, context);
        this.b = j11Var;
        rl0Var2.setAdapter(j11Var);
        this.a.setItemAnimator(null);
        this.a.setLayoutAnimation(null);
        this.a.setLayoutManager(new k(15));
        this.a.setOnItemClickListener(new mb1(this, context, sharedPrefKey, 1));
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
        jy0 jy0Var = new jy0(1, this);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 16, new Class[]{org.telegram.ui.Cells.l4.class, org.telegram.ui.Cells.z9.class, org.telegram.ui.Cells.t8.class, org.telegram.ui.Cells.i6.class, org.telegram.ui.Cells.ta.class, org.telegram.ui.Cells.r8.class, org.telegram.ui.Cells.o8.class}, null, null, null, org.telegram.ui.ActionBar.j6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.z9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.z9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 8192, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.g7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 16384, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.h7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.ta.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.ta.class}, new String[]{"statusColor"}, null, null, -1, jy0Var, org.telegram.ui.ActionBar.j6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.ta.class}, new String[]{"statusOnlineColor"}, null, null, -1, jy0Var, org.telegram.ui.ActionBar.j6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.ta.class}, null, org.telegram.ui.ActionBar.j6.r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, jy0Var, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, jy0Var, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, jy0Var, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, jy0Var, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, jy0Var, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, jy0Var, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, jy0Var, org.telegram.ui.ActionBar.j6.U7));
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
        j11 j11Var = this.b;
        if (j11Var != null) {
            j11Var.m(i10 == 13 ? this.N : this.C);
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
        boolean z4;
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
                    this.W = i10 < 5;
                } else {
                    i10++;
                }
            }
        }
        this.V = 0;
        boolean z10 = this.h;
        if (z10) {
            this.w = 0;
            this.V = 1 + 1;
            this.x = 1;
        } else {
            this.w = -1;
            this.x = -1;
        }
        int i11 = this.V;
        int i12 = i11 + 1;
        this.V = i12;
        this.v = i11;
        long j11 = this.f;
        if (z10 || j11 != 0) {
            this.V = i11 + 2;
            this.y = i12;
        } else {
            this.y = -1;
        }
        this.L = -1;
        if (DialogObject.isEncryptedDialog(j10)) {
            this.B = -1;
        } else {
            int i13 = this.V;
            this.V = i13 + 1;
            this.B = i13;
            if (DialogObject.isUserDialog(j10)) {
                int i14 = this.V;
                this.V = i14 + 1;
                this.L = i14;
            }
        }
        int i15 = this.V;
        this.C = i15;
        this.V = i15 + 2;
        this.D = i15 + 1;
        if (DialogObject.isChatDialog(j10)) {
            int i16 = this.V;
            this.V = i16 + 1;
            this.E = i16;
        } else {
            this.E = -1;
        }
        int i17 = this.V;
        this.F = i17;
        this.V = i17 + 2;
        this.G = i17 + 1;
        if (DialogObject.isChatDialog(j10)) {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                z4 = true;
                if (!DialogObject.isEncryptedDialog(j10) || z4) {
                    this.H = -1;
                    this.I = -1;
                    this.J = -1;
                    this.K = -1;
                } else {
                    int i18 = this.V;
                    this.H = i18;
                    this.I = i18 + 1;
                    this.J = i18 + 2;
                    this.V = i18 + 4;
                    this.K = i18 + 3;
                }
                if (DialogObject.isUserDialog(j10)) {
                    this.M = -1;
                    this.O = -1;
                    this.N = -1;
                    this.P = -1;
                } else {
                    int i19 = this.V;
                    this.M = i19;
                    this.O = i19 + 1;
                    this.N = i19 + 2;
                    this.V = i19 + 4;
                    this.P = i19 + 3;
                }
                int i20 = this.V;
                this.Q = i20;
                this.R = i20 + 1;
                int i21 = i20 + 3;
                this.V = i21;
                this.S = i20 + 2;
                if (z10) {
                    this.T = i21;
                    this.V = i20 + 5;
                    this.U = i20 + 4;
                } else {
                    this.T = -1;
                    this.U = -1;
                }
                boolean isGlobalNotificationsEnabled = NotificationsController.getInstance(this.currentAccount).isGlobalNotificationsEnabled(j10, false, false);
                if (z10) {
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.currentAccount);
                    String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j11);
                    boolean contains = notificationsSettings.contains(NotificationsSettingsFacade.PROPERTY_NOTIFY + sharedPrefKey);
                    int c3 = org.telegram.messenger.y3.c(NotificationsSettingsFacade.PROPERTY_NOTIFY, sharedPrefKey, notificationsSettings, 0);
                    if (c3 == 0) {
                        if (contains) {
                            this.n = true;
                        } else {
                            this.n = NotificationsController.getInstance(this.currentAccount).isGlobalNotificationsEnabled(j10, false, false);
                        }
                    } else if (c3 == 1) {
                        this.n = true;
                    } else if (c3 == 2) {
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
        z4 = false;
        if (DialogObject.isEncryptedDialog(j10)) {
        }
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        if (DialogObject.isUserDialog(j10)) {
        }
        int i202 = this.V;
        this.Q = i202;
        this.R = i202 + 1;
        int i212 = i202 + 3;
        this.V = i212;
        this.S = i202 + 2;
        if (z10) {
        }
        boolean isGlobalNotificationsEnabled2 = NotificationsController.getInstance(this.currentAccount).isGlobalNotificationsEnabled(j10, false, false);
        if (z10) {
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.notificationsSettingsUpdated);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.X) {
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
