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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class j11 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
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
    public org.telegram.ui.Components.nm0 b;
    public boolean b0;
    public h11 c;
    public AnimatorSet d;
    public final org.telegram.ui.ActionBar.u6 e;
    public final long f;
    public final long h;
    public final boolean n;
    public boolean r;
    public i11 s;
    public org.telegram.ui.Components.po v;
    public int w;
    public int x;
    public int y;

    public j11(Bundle bundle, org.telegram.ui.ActionBar.u6 u6Var) {
        super(bundle);
        this.e = u6Var;
        this.f = bundle.getLong("dialog_id");
        this.h = bundle.getLong("topic_id");
        this.n = bundle.getBoolean("exception", false);
    }

    public static /* synthetic */ void V(j11 j11Var, String str, int i10, int i11) {
        MessagesController.getNotificationsSettings(j11Var.currentAccount).edit().putInt("smart_max_count_" + str, i10).putInt("smart_delay_" + str, i11).apply();
        h11 h11Var = j11Var.c;
        if (h11Var != null) {
            h11Var.m(j11Var.I);
        }
    }

    public static void W(final j11 j11Var, Context context, String str, View view, int i10) {
        long j10 = j11Var.h;
        long j11 = j11Var.f;
        org.telegram.ui.ActionBar.u6 u6Var = j11Var.e;
        if (view.isEnabled()) {
            Parcelable parcelable = null;
            final int i11 = 0;
            if (i10 == j11Var.X) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, u6Var);
                String string = LocaleController.getString(R.string.ResetCustomNotificationsAlertTitle);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                e2Var.R = string;
                e2Var.T = LocaleController.getString(R.string.ResetCustomNotificationsAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new e11(j11Var, str));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                j11Var.showDialog(e2Var);
                TextView textView = (TextView) e2Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, null);
                    return;
                }
                return;
            }
            if (i10 == j11Var.G) {
                Bundle h = a1.g.h(j11, "dialog_id");
                h.putLong("topic_id", j10);
                j11Var.presentFragment(new vk0(h, u6Var));
                return;
            }
            final int i12 = 1;
            if (i10 == j11Var.R) {
                try {
                    Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                    intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                    intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(j11Var.currentAccount);
                    Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
                    String path = uri != null ? uri.getPath() : null;
                    String string2 = notificationsSettings.getString("ringtone_path_" + str, path);
                    if (string2 != null && !string2.equals("NoSound")) {
                        parcelable = string2.equals(path) ? uri : Uri.parse(string2);
                    }
                    intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", parcelable);
                    j11Var.startActivityForResult(intent, 13);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            }
            if (i10 == j11Var.H) {
                Activity parentActivity = j11Var.getParentActivity();
                long j12 = j11Var.f;
                long j13 = j11Var.h;
                Runnable runnable = new Runnable(j11Var) { // from class: org.telegram.ui.f11
                    public final /* synthetic */ j11 b;

                    {
                        this.b = j11Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                j11 j11Var2 = this.b;
                                h11 h11Var = j11Var2.c;
                                if (h11Var != null) {
                                    h11Var.m(j11Var2.H);
                                    break;
                                }
                                break;
                            case 1:
                                j11 j11Var3 = this.b;
                                h11 h11Var2 = j11Var3.c;
                                if (h11Var2 != null) {
                                    h11Var2.m(j11Var3.S);
                                    break;
                                }
                                break;
                            case 2:
                                j11 j11Var4 = this.b;
                                h11 h11Var3 = j11Var4.c;
                                if (h11Var3 != null) {
                                    h11Var3.m(j11Var4.J);
                                    break;
                                }
                                break;
                            default:
                                j11 j11Var5 = this.b;
                                h11 h11Var4 = j11Var5.c;
                                if (h11Var4 != null) {
                                    h11Var4.m(j11Var5.V);
                                    break;
                                }
                                break;
                        }
                    }
                };
                org.telegram.ui.ActionBar.u6 u6Var2 = j11Var.e;
                Pattern pattern = org.telegram.ui.Components.g5.a;
                j11Var.showDialog(org.telegram.ui.Components.g5.X(parentActivity, j12, j13, j12 != 0 ? a1.g.o(j12, "vibrate_") : "vibrate_messages", runnable, u6Var2));
                return;
            }
            final int i13 = 3;
            if (i10 == j11Var.E) {
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                boolean z10 = !a9Var.e.h;
                j11Var.r = z10;
                a9Var.setChecked(z10);
                int childCount = j11Var.b.getChildCount();
                ArrayList arrayList = new ArrayList();
                while (i11 < childCount) {
                    org.telegram.ui.Components.wl0 wl0Var = (org.telegram.ui.Components.wl0) j11Var.b.T(j11Var.b.getChildAt(i11));
                    int i14 = wl0Var.f;
                    View view2 = wl0Var.a;
                    int b10 = wl0Var.b();
                    if (b10 != j11Var.E && b10 != j11Var.X) {
                        if (i14 == 0) {
                            ((org.telegram.ui.Cells.q4) view2).a(arrayList, j11Var.r);
                        } else if (i14 == 1) {
                            ((org.telegram.ui.Cells.ga) view2).a(arrayList, j11Var.r);
                        } else if (i14 == 2) {
                            ((org.telegram.ui.Cells.i9) view2).c(arrayList, j11Var.r);
                        } else if (i14 == 3) {
                            ((org.telegram.ui.Cells.c9) view2).a(arrayList, j11Var.r);
                        } else if (i14 == 4) {
                            ((org.telegram.ui.Cells.o6) view2).b(arrayList, j11Var.r);
                        } else if (i14 == 7 && b10 == j11Var.F) {
                            ((org.telegram.ui.Cells.a9) view2).e(arrayList, j11Var.r);
                        }
                    }
                    i11++;
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                AnimatorSet animatorSet = j11Var.d;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                j11Var.d = animatorSet2;
                animatorSet2.playTogether(arrayList);
                j11Var.d.addListener(new k50(j11Var, 24));
                j11Var.d.setDuration(150L);
                j11Var.d.start();
                return;
            }
            if (i10 == j11Var.F) {
                org.telegram.ui.Cells.a9 a9Var2 = (org.telegram.ui.Cells.a9) view;
                Switch r32 = a9Var2.e;
                MessagesController.getNotificationsSettings(j11Var.currentAccount).edit().putBoolean(org.telegram.ui.Components.b10.j(NotificationsSettingsFacade.PROPERTY_CONTENT_PREVIEW, str), !r32.h).apply();
                a9Var2.setChecked(!r32.h);
                return;
            }
            if (i10 == j11Var.S) {
                j11Var.showDialog(org.telegram.ui.Components.g5.X(j11Var.getParentActivity(), j11Var.f, j11Var.h, org.telegram.ui.Components.b10.j("calls_vibrate_", str), new Runnable(j11Var) { // from class: org.telegram.ui.f11
                    public final /* synthetic */ j11 b;

                    {
                        this.b = j11Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                j11 j11Var2 = this.b;
                                h11 h11Var = j11Var2.c;
                                if (h11Var != null) {
                                    h11Var.m(j11Var2.H);
                                    break;
                                }
                                break;
                            case 1:
                                j11 j11Var3 = this.b;
                                h11 h11Var2 = j11Var3.c;
                                if (h11Var2 != null) {
                                    h11Var2.m(j11Var3.S);
                                    break;
                                }
                                break;
                            case 2:
                                j11 j11Var4 = this.b;
                                h11 h11Var3 = j11Var4.c;
                                if (h11Var3 != null) {
                                    h11Var3.m(j11Var4.J);
                                    break;
                                }
                                break;
                            default:
                                j11 j11Var5 = this.b;
                                h11 h11Var4 = j11Var5.c;
                                if (h11Var4 != null) {
                                    h11Var4.m(j11Var5.V);
                                    break;
                                }
                                break;
                        }
                    }
                }, j11Var.e));
                return;
            }
            if (i10 == j11Var.J) {
                j11Var.showDialog(org.telegram.ui.Components.g5.H(j11Var.getParentActivity(), j11Var.f, j11Var.h, -1, new Runnable(j11Var) { // from class: org.telegram.ui.f11
                    public final /* synthetic */ j11 b;

                    {
                        this.b = j11Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (r2) {
                            case 0:
                                j11 j11Var2 = this.b;
                                h11 h11Var = j11Var2.c;
                                if (h11Var != null) {
                                    h11Var.m(j11Var2.H);
                                    break;
                                }
                                break;
                            case 1:
                                j11 j11Var3 = this.b;
                                h11 h11Var2 = j11Var3.c;
                                if (h11Var2 != null) {
                                    h11Var2.m(j11Var3.S);
                                    break;
                                }
                                break;
                            case 2:
                                j11 j11Var4 = this.b;
                                h11 h11Var3 = j11Var4.c;
                                if (h11Var3 != null) {
                                    h11Var3.m(j11Var4.J);
                                    break;
                                }
                                break;
                            default:
                                j11 j11Var5 = this.b;
                                h11 h11Var4 = j11Var5.c;
                                if (h11Var4 != null) {
                                    h11Var4.m(j11Var5.V);
                                    break;
                                }
                                break;
                        }
                    }
                }, j11Var.e));
                return;
            }
            if (i10 != j11Var.I) {
                if (i10 == j11Var.V) {
                    if (j11Var.getParentActivity() == null) {
                        return;
                    }
                    j11Var.showDialog(org.telegram.ui.Components.g5.t(j11Var.getParentActivity(), j11Var.f, j11Var.h, -1, new Runnable(j11Var) { // from class: org.telegram.ui.f11
                        public final /* synthetic */ j11 b;

                        {
                            this.b = j11Var;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i13) {
                                case 0:
                                    j11 j11Var2 = this.b;
                                    h11 h11Var = j11Var2.c;
                                    if (h11Var != null) {
                                        h11Var.m(j11Var2.H);
                                        break;
                                    }
                                    break;
                                case 1:
                                    j11 j11Var3 = this.b;
                                    h11 h11Var2 = j11Var3.c;
                                    if (h11Var2 != null) {
                                        h11Var2.m(j11Var3.S);
                                        break;
                                    }
                                    break;
                                case 2:
                                    j11 j11Var4 = this.b;
                                    h11 h11Var3 = j11Var4.c;
                                    if (h11Var3 != null) {
                                        h11Var3.m(j11Var4.J);
                                        break;
                                    }
                                    break;
                                default:
                                    j11 j11Var5 = this.b;
                                    h11 h11Var4 = j11Var5.c;
                                    if (h11Var4 != null) {
                                        h11Var4.m(j11Var5.V);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, j11Var.e));
                    return;
                }
                if (i10 == j11Var.M) {
                    MessagesController.getNotificationsSettings(j11Var.currentAccount).edit().putInt("popup_" + str, 1).apply();
                    ((org.telegram.ui.Cells.o6) view).a(true, true);
                    View findViewWithTag = j11Var.b.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((org.telegram.ui.Cells.o6) findViewWithTag).a(false, true);
                        return;
                    }
                    return;
                }
                if (i10 == j11Var.N) {
                    MessagesController.getNotificationsSettings(j11Var.currentAccount).edit().putInt("popup_" + str, 2).apply();
                    ((org.telegram.ui.Cells.o6) view).a(true, true);
                    View findViewWithTag2 = j11Var.b.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((org.telegram.ui.Cells.o6) findViewWithTag2).a(false, true);
                        return;
                    }
                    return;
                }
                if (i10 == j11Var.P) {
                    org.telegram.ui.Cells.a9 a9Var3 = (org.telegram.ui.Cells.a9) view;
                    boolean z11 = a9Var3.e.h;
                    boolean z12 = !z11;
                    a9Var3.setChecked(z12);
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(j11Var.currentAccount).edit();
                    if (!j11Var.a0 || z11) {
                        edit.putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, z12);
                    } else {
                        edit.remove(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str);
                    }
                    edit.apply();
                    j11Var.getNotificationsController().updateServerNotificationsSettings(j11, j10);
                    return;
                }
                return;
            }
            if (j11Var.getParentActivity() == null) {
                return;
            }
            SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(j11Var.currentAccount);
            int d = org.telegram.messenger.t.d("smart_max_count_", str, notificationsSettings2, 2);
            int d10 = org.telegram.messenger.t.d("smart_delay_", str, notificationsSettings2, 180);
            r13 = d != 0 ? d : 2;
            Activity parentActivity2 = j11Var.getParentActivity();
            e11 e11Var = new e11(j11Var, str);
            Pattern pattern2 = org.telegram.ui.Components.g5.a;
            if (parentActivity2 == null) {
                return;
            }
            int i15 = org.telegram.ui.ActionBar.y6.j5;
            int e10 = u6Var != null ? u6Var.e(i15) : org.telegram.ui.ActionBar.y6.x0(null, i15, false);
            int i16 = org.telegram.ui.ActionBar.y6.h5;
            int e11 = u6Var != null ? u6Var.e(i16) : org.telegram.ui.ActionBar.y6.x0(null, i16, false);
            int i17 = org.telegram.ui.ActionBar.y6.Ji;
            if (u6Var != null) {
                u6Var.e(i17);
            } else {
                org.telegram.ui.ActionBar.y6.x0(null, i17, false);
            }
            int i18 = org.telegram.ui.ActionBar.y6.Ni;
            if (u6Var != null) {
                u6Var.e(i18);
            } else {
                org.telegram.ui.ActionBar.y6.x0(null, i18, false);
            }
            int i19 = org.telegram.ui.ActionBar.y6.E8;
            if (u6Var != null) {
                u6Var.e(i19);
            } else {
                org.telegram.ui.ActionBar.y6.x0(null, i19, false);
            }
            int i20 = org.telegram.ui.ActionBar.y6.G8;
            if (u6Var != null) {
                u6Var.e(i20);
            } else {
                org.telegram.ui.ActionBar.y6.x0(null, i20, false);
            }
            int i21 = org.telegram.ui.ActionBar.y6.i6;
            if (u6Var != null) {
                u6Var.e(i21);
            } else {
                org.telegram.ui.ActionBar.y6.x0(null, i21, false);
            }
            int i22 = org.telegram.ui.ActionBar.y6.Sh;
            int e12 = u6Var != null ? u6Var.e(i22) : org.telegram.ui.ActionBar.y6.x0(null, i22, false);
            int i23 = org.telegram.ui.ActionBar.y6.Oh;
            int e13 = u6Var != null ? u6Var.e(i23) : org.telegram.ui.ActionBar.y6.x0(null, i23, false);
            int i24 = org.telegram.ui.ActionBar.y6.Qh;
            int e14 = u6Var != null ? u6Var.e(i24) : org.telegram.ui.ActionBar.y6.x0(null, i24, false);
            org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(parentActivity2, u6Var);
            e3Var.a();
            org.telegram.ui.Components.m4 m4Var = new org.telegram.ui.Components.m4(parentActivity2, u6Var);
            m4Var.setMinValue(0);
            m4Var.setMaxValue(10);
            m4Var.setTextColor(e10);
            m4Var.setValue(r13 - 1);
            m4Var.setWrapSelectorWheel(false);
            m4Var.setFormatter(new cg(29));
            org.telegram.ui.Components.n4 n4Var = new org.telegram.ui.Components.n4(parentActivity2, u6Var);
            n4Var.setMinValue(0);
            n4Var.setMaxValue(10);
            n4Var.setTextColor(e10);
            n4Var.setValue((d10 / 60) - 1);
            n4Var.setWrapSelectorWheel(false);
            n4Var.setFormatter(new org.telegram.ui.Components.f2(i11));
            org.telegram.ui.Components.nd0 nd0Var = new org.telegram.ui.Components.nd0(parentActivity2, u6Var);
            nd0Var.setMinValue(0);
            nd0Var.setMaxValue(0);
            nd0Var.setTextColor(e10);
            nd0Var.setValue(0);
            nd0Var.setWrapSelectorWheel(false);
            nd0Var.setFormatter(new org.telegram.ui.Components.f2(i12));
            org.telegram.ui.Components.y3 y3Var = new org.telegram.ui.Components.y3(parentActivity2, m4Var, n4Var, nd0Var);
            y3Var.setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(parentActivity2);
            y3Var.addView(frameLayout, org.telegram.ui.Components.kb1.x(-1, -2, 51, 22, 0, 0, 4));
            TextView textView2 = new TextView(parentActivity2);
            textView2.setText(LocaleController.getString(R.string.NotfificationsFrequencyTitle));
            textView2.setTextColor(e10);
            textView2.setTextSize(1, 20.0f);
            textView2.setTypeface(AndroidUtilities.bold());
            frameLayout.addView(textView2, org.telegram.ui.Components.kb1.h(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
            textView2.setOnTouchListener(new ei.d(10));
            LinearLayout linearLayout = new LinearLayout(parentActivity2);
            linearLayout.setOrientation(0);
            linearLayout.setWeightSum(1.0f);
            y3Var.addView(linearLayout, org.telegram.ui.Components.kb1.t(-1, -2, 1.0f, 0, 0, 12, 0, 12));
            bi.md mdVar = new bi.md(parentActivity2, 18);
            linearLayout.addView(m4Var, org.telegram.ui.Components.kb1.p(0.4f, 0, 270));
            linearLayout.addView(nd0Var, org.telegram.ui.Components.kb1.s(0, -2, 0.2f, 16));
            linearLayout.addView(n4Var, org.telegram.ui.Components.kb1.p(0.4f, 0, 270));
            mdVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            mdVar.setGravity(17);
            mdVar.setTextColor(e12);
            mdVar.setTextSize(1, 14.0f);
            mdVar.setTypeface(AndroidUtilities.bold());
            int dp = AndroidUtilities.dp(8.0f);
            mdVar.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, e13, e14, e14));
            mdVar.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
            y3Var.addView(mdVar, org.telegram.ui.Components.kb1.x(-1, 48, 83, 16, 15, 16, 16));
            cg cgVar = new cg(18);
            m4Var.setOnValueChangedListener(cgVar);
            n4Var.setOnValueChangedListener(cgVar);
            mdVar.setOnClickListener(new di.c4(m4Var, n4Var, e11Var, e3Var, 7));
            e3Var.b(y3Var);
            org.telegram.ui.ActionBar.k3 k3Var = e3Var.a;
            k3Var.show();
            k3Var.setBackgroundColor(e11);
            k3Var.fixNavigationBar(e11);
        }
    }

    public static /* synthetic */ void X(j11 j11Var, String str) {
        j11Var.b0 = true;
        MessagesController.getNotificationsSettings(j11Var.currentAccount).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_CUSTOM + str, false).remove(NotificationsSettingsFacade.PROPERTY_NOTIFY + str).apply();
        j11Var.finishFragment();
        i11 i11Var = j11Var.s;
        if (i11Var != null) {
            i11Var.Y();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d6));
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        long j10 = this.f;
        long j11 = this.h;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j11);
        this.simpleActionBar.setActionBarMenuOnItemClick(new g11(this, sharedPrefKey));
        org.telegram.ui.ActionBar.u6 u6Var = this.e;
        org.telegram.ui.Components.po poVar = new org.telegram.ui.Components.po(context, null, false, u6Var);
        this.v = poVar;
        poVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        if (j10 >= 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
            if (user != null) {
                this.v.setUserAvatar(user);
                this.simpleActionBar.setTitle(ContactsController.formatName(user.first_name, user.last_name));
            }
        } else if (j11 != 0) {
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-j10, j11);
            pg.d.p(this.v.getAvatarImageView(), findTopic, false, true, u6Var);
            this.simpleActionBar.setTitle(findTopic.title);
        } else {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
            this.v.setChatAvatar(chat);
            this.simpleActionBar.setTitle(chat.title);
        }
        if (this.n) {
            this.simpleActionBar.setSubtitle(LocaleController.getString(R.string.NotificationsNewException));
            this.simpleActionBar.i(LocaleController.getString(R.string.Save));
        } else {
            this.simpleActionBar.setSubtitle(LocaleController.getString(R.string.CustomNotifications));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(context, null);
        this.b = nm0Var;
        nm0Var.u1();
        this.b.setSectionsDrawBackground(true);
        frameLayout.addView(this.b, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        org.telegram.ui.Components.nm0 nm0Var2 = this.b;
        h11 h11Var = new h11(this, context);
        this.c = h11Var;
        nm0Var2.setAdapter(h11Var);
        this.b.setItemAnimator(null);
        this.b.setLayoutAnimation(null);
        this.b.setLayoutManager(new ig.a0(17));
        this.b.setOnItemClickListener(new wa1(this, context, sharedPrefKey, 1));
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

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.Components.nm0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.ActionBar.u6 getResourceProvider() {
        return this.e;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        j6 j6Var = new j6(20, this);
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.b, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.b, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.b, 0, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"statusColor"}, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.b, 0, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.n6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
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
        h11 h11Var = this.c;
        if (h11Var != null) {
            h11Var.m(i10 == 13 ? this.R : this.G);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010f  */
    @Override // org.telegram.ui.ActionBar.r2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        boolean z10;
        long j10 = this.f;
        if (DialogObject.isUserDialog(j10)) {
            ArrayList<TLRPC.TL_topPeer> arrayList = getMediaDataController().hints;
            int i10 = 0;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                TLRPC.Peer peer = arrayList.get(i10).peer;
                if ((peer instanceof TLRPC.TL_peerUser) && peer.user_id == j10) {
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
        long j11 = this.h;
        if (z11 || j11 != 0) {
            this.Z = i11 + 2;
            this.E = i12;
        } else {
            this.E = -1;
        }
        this.P = -1;
        if (DialogObject.isEncryptedDialog(j10)) {
            this.F = -1;
        } else {
            int i13 = this.Z;
            this.Z = i13 + 1;
            this.F = i13;
            if (DialogObject.isUserDialog(j10)) {
                int i14 = this.Z;
                this.Z = i14 + 1;
                this.P = i14;
            }
        }
        int i15 = this.Z;
        this.G = i15;
        this.Z = i15 + 2;
        this.H = i15 + 1;
        if (DialogObject.isChatDialog(j10)) {
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
        if (DialogObject.isChatDialog(j10)) {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                z10 = true;
                if (!DialogObject.isEncryptedDialog(j10) || z10) {
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
                if (DialogObject.isUserDialog(j10)) {
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
                boolean isGlobalNotificationsEnabled = NotificationsController.getInstance(this.currentAccount).isGlobalNotificationsEnabled(j10, false, false);
                if (z11) {
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.currentAccount);
                    String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j11);
                    boolean contains = notificationsSettings.contains(NotificationsSettingsFacade.PROPERTY_NOTIFY + sharedPrefKey);
                    int d = org.telegram.messenger.t.d(NotificationsSettingsFacade.PROPERTY_NOTIFY, sharedPrefKey, notificationsSettings, 0);
                    if (d == 0) {
                        if (contains) {
                            this.r = true;
                        } else {
                            this.r = NotificationsController.getInstance(this.currentAccount).isGlobalNotificationsEnabled(j10, false, false);
                        }
                    } else if (d == 1) {
                        this.r = true;
                    } else if (d == 2) {
                        this.r = false;
                    } else {
                        this.r = false;
                    }
                } else {
                    this.r = !isGlobalNotificationsEnabled;
                }
                NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.notificationsSettingsUpdated);
                return super.onFragmentCreate();
            }
        }
        z10 = false;
        if (DialogObject.isEncryptedDialog(j10)) {
        }
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        if (DialogObject.isUserDialog(j10)) {
        }
        int i202 = this.Z;
        this.U = i202;
        this.V = i202 + 1;
        int i212 = i202 + 3;
        this.Z = i212;
        this.W = i202 + 2;
        if (z11) {
        }
        boolean isGlobalNotificationsEnabled2 = NotificationsController.getInstance(this.currentAccount).isGlobalNotificationsEnabled(j10, false, false);
        if (z11) {
        }
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.notificationsSettingsUpdated);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.b0) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.f, this.h);
            MessagesController.getNotificationsSettings(this.currentAccount).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_CUSTOM + sharedPrefKey, true).apply();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        super.onInsets(i10, i11, i12, i13);
        AndroidUtilities.setViewLayoutMargins(this.v.e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(42.0f)) / 2) + this.mSystemInsets.b, AndroidUtilities.dp(6.0f), 0);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        AndroidUtilities.removeFromParent(this.v.e);
        if (!this.n) {
            this.a.addView(this.v.e, org.telegram.ui.Components.kb1.i(42, 42, 53));
        }
        AndroidUtilities.setViewLayoutMargins(this.v.e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(42.0f)) / 2) + this.mSystemInsets.b, AndroidUtilities.dp(6.0f), 0);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
