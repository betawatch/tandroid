package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.LongFunction;
import java.util.regex.Pattern;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.di1;
import org.telegram.ui.ue1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public abstract class g5 {
    public static final Pattern a = Pattern.compile("^([a-zA-Z][a-zA-Z0-9+\\-.]*://)?([a-zA-Z0-9\\-]+\\.)+[a-zA-Z]{2,}(:\\d+)?(/[^\\s]*)?$");

    public static AlertDialog$Builder A(Activity activity, di1 di1Var, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        String readRes = AndroidUtilities.readRes(R.raw.pip_video_request);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-14535089, -14527894}));
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new ai.l2(10));
        View view = new View(activity);
        view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(readRes, AndroidUtilities.dp(320.0f), AndroidUtilities.dp(161.36752f), false)));
        frameLayout.addView(view, w7.x5.a(-1.0f, -1.0f, -1.0f, -1.0f, -1.0f, -1, 0));
        alertDialog$Builder.a.V = frameLayout;
        alertDialog$Builder.a.R = LocaleController.getString(R.string.PermissionDrawAboveOtherAppsTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.PermissionDrawAboveOtherApps);
        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new ai.k(8, activity, z10));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.j0 = true;
        b2Var.T0 = false;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), di1Var);
        alertDialog$Builder.a.O0 = 0.50427353f;
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.b2 B(LaunchActivity launchActivity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.LowDiskSpaceTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.LowDiskSpaceMessage2);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.LowDiskSpaceButton), new h1(launchActivity, 1));
        return alertDialog$Builder.a;
    }

    public static org.telegram.ui.ActionBar.b2 C(Activity activity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
        alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.L5, false), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new j0(activity, 1));
        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
        return alertDialog$Builder.a;
    }

    public static org.telegram.ui.ActionBar.b2 D(Activity activity, boolean z10, TLRPC.User user, MessagesStorage.IntCallback intCallback, org.telegram.ui.ActionBar.e6 e6Var) {
        int[] iArr = new int[1];
        String[] strArr = {LocaleController.getString(R.string.SendLiveLocationFor15m), LocaleController.getString(R.string.SendLiveLocationFor1h), LocaleController.getString(R.string.SendLiveLocationFor8h), LocaleController.getString(R.string.SendLiveLocationForever)};
        LinearLayout e7 = org.telegram.messenger.q.e(activity, 1);
        e7.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
        TextView textView = new TextView(activity);
        if (z10) {
            textView.setText(LocaleController.getString(R.string.LiveLocationAlertExpandMessage));
        } else if (user != null) {
            textView.setText(LocaleController.formatString(R.string.LiveLocationAlertPrivate, UserObject.getFirstName(user)));
        } else {
            textView.setText(LocaleController.getString(R.string.LiveLocationAlertGroup));
        }
        int i10 = org.telegram.ui.ActionBar.i6.j5;
        textView.setTextColor(e6Var != null ? e6Var.c0(i10) : org.telegram.ui.ActionBar.i6.x0(null, i10, false));
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        e7.addView(textView, w7.x5.t(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 24, z10 ? 4 : 0, 24, 8));
        int i11 = 0;
        while (i11 < 4) {
            org.telegram.ui.Cells.l6 l6Var = new org.telegram.ui.Cells.l6(activity, e6Var);
            l6Var.d = 42;
            l6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            l6Var.setTag(Integer.valueOf(i11));
            int i12 = org.telegram.ui.ActionBar.i6.g7;
            int c02 = e6Var != null ? e6Var.c0(i12) : org.telegram.ui.ActionBar.i6.x0(null, i12, false);
            int i13 = org.telegram.ui.ActionBar.i6.E5;
            l6Var.a(c02, e6Var != null ? e6Var.c0(i13) : org.telegram.ui.ActionBar.i6.x0(null, i13, false));
            l6Var.b(strArr[i11], iArr[0] == i11);
            e7.addView(l6Var);
            l6Var.setOnClickListener(new q0(iArr, e7));
            i11++;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, e6Var);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        if (z10) {
            b2Var.R = LocaleController.getString(R.string.LiveLocationAlertExpandTitle);
        } else {
            int c03 = e6Var != null ? e6Var.c0(org.telegram.ui.ActionBar.i6.L5) : org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.L5, false);
            b2Var.b0 = new nr0(activity, 0);
            b2Var.c0 = c03;
        }
        alertDialog$Builder.n(e7);
        alertDialog$Builder.k(LocaleController.getString(R.string.ShareFile), new org.telegram.ui.o(22, iArr, intCallback));
        alertDialog$Builder.i(LocaleController.getString(R.string.Cancel), null);
        return b2Var;
    }

    public static org.telegram.ui.ActionBar.f3 E(final long j3, final long j10, final org.telegram.ui.ActionBar.n2 n2Var, final org.telegram.ui.ActionBar.e6 e6Var) {
        if (n2Var.getParentActivity() == null) {
            return null;
        }
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) n2Var.getParentActivity(), e6Var, false);
        f3Var.fixNavigationBar();
        f3Var.title = LocaleController.getString(R.string.Notifications);
        f3Var.bigTitle = true;
        CharSequence[] charSequenceArr = {LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Hours", 1, new Object[0])), LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Hours", 8, new Object[0])), LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Days", 2, new Object[0])), LocaleController.getString(R.string.MuteDisable)};
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Components.k0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                int i11;
                if (i10 == 0) {
                    i11 = 0;
                } else {
                    int i12 = 1;
                    if (i10 != 1) {
                        i12 = 2;
                        if (i10 != 2) {
                            i12 = 3;
                        }
                    }
                    i11 = i12;
                }
                NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(j3, j10, i11);
                org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                if (ad.a(n2Var2)) {
                    ad.z(n2Var2, i11, 0, e6Var).j();
                }
            }
        };
        f3Var.items = charSequenceArr;
        f3Var.onClickListener = onClickListener;
        return f3Var;
    }

    public static void F(Context context, org.telegram.ui.ActionBar.e6 e6Var, f5 f5Var) {
        if (context == null) {
            return;
        }
        int i10 = 0;
        int i11 = org.telegram.ui.ActionBar.i6.j5;
        int c02 = e6Var != null ? e6Var.c0(i11) : org.telegram.ui.ActionBar.i6.x0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.i6.h5;
        int c03 = e6Var != null ? e6Var.c0(i12) : org.telegram.ui.ActionBar.i6.x0(null, i12, false);
        int i13 = org.telegram.ui.ActionBar.i6.Ji;
        if (e6Var != null) {
            e6Var.c0(i13);
        } else {
            org.telegram.ui.ActionBar.i6.x0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.i6.Ni;
        if (e6Var != null) {
            e6Var.c0(i14);
        } else {
            org.telegram.ui.ActionBar.i6.x0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.i6.E8;
        if (e6Var != null) {
            e6Var.c0(i15);
        } else {
            org.telegram.ui.ActionBar.i6.x0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.i6.G8;
        if (e6Var != null) {
            e6Var.c0(i16);
        } else {
            org.telegram.ui.ActionBar.i6.x0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.i6.i6;
        if (e6Var != null) {
            e6Var.c0(i17);
        } else {
            org.telegram.ui.ActionBar.i6.x0(null, i17, false);
        }
        int i18 = org.telegram.ui.ActionBar.i6.Sh;
        int c04 = e6Var != null ? e6Var.c0(i18) : org.telegram.ui.ActionBar.i6.x0(null, i18, false);
        int i19 = org.telegram.ui.ActionBar.i6.Oh;
        int c05 = e6Var != null ? e6Var.c0(i19) : org.telegram.ui.ActionBar.i6.x0(null, i19, false);
        int c06 = e6Var != null ? e6Var.c0(org.telegram.ui.ActionBar.i6.Qh) : org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Qh, false);
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, e6Var);
        a3Var.a();
        int[] iArr = {30, 60, 120, 180, 480, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        p4 p4Var = new p4(context, e6Var, iArr);
        p4Var.setMinValue(0);
        p4Var.setMaxValue(20);
        p4Var.setTextColor(c02);
        p4Var.setValue(0);
        p4Var.setFormatter(new g1(i10, iArr));
        l4 l4Var = new l4(context, p4Var, 1);
        l4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        l4Var.addView(frameLayout, w7.x5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.MuteForAlert));
        textView.setTextColor(c02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, w7.x5.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
        textView.setOnTouchListener(new bi.d(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        l4Var.addView(linearLayout, w7.x5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        ai.q4 q4Var = new ai.q4(context, 19);
        linearLayout.addView(p4Var, w7.x5.l(1.0f, 0, 270));
        p4Var.setOnValueChangedListener(new org.telegram.ui.nr(15));
        q4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        q4Var.setGravity(17);
        q4Var.setTextColor(c04);
        q4Var.setTextSize(1, 14.0f);
        q4Var.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(8.0f);
        q4Var.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.j0(dp, dp, dp, dp, c05, c06, c06));
        q4Var.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
        l4Var.addView(q4Var, w7.x5.t(-1, 48, 83, 16, 15, 16, 16));
        q4Var.setOnClickListener(new ai.p5(iArr, p4Var, f5Var, a3Var, 6));
        a3Var.b(l4Var);
        org.telegram.ui.ActionBar.f3 f3Var = a3Var.a;
        f3Var.show();
        f3Var.setBackgroundColor(c03);
        f3Var.fixNavigationBar(c03);
    }

    public static AlertDialog$Builder G(Context context, String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.a.R = str;
        HashMap hashMap = new HashMap();
        int i10 = org.telegram.ui.ActionBar.i6.L5;
        hashMap.put("info1", Integer.valueOf(org.telegram.ui.ActionBar.i6.x0(null, i10, false)));
        hashMap.put("info2", Integer.valueOf(org.telegram.ui.ActionBar.i6.x0(null, i10, false)));
        alertDialog$Builder.m(R.raw.not_available, 52, org.telegram.ui.ActionBar.i6.x0(null, i10, false), hashMap);
        alertDialog$Builder.a.W = true;
        alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
        alertDialog$Builder.a.T = str2;
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.b2 H(Activity activity, long j3, final long j10, int i10, final Runnable runnable, org.telegram.ui.ActionBar.e6 e6Var) {
        String[] strArr;
        final long j11 = j3;
        final int i11 = i10;
        final SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
        boolean z10 = true;
        final int[] iArr = new int[1];
        if (j11 != 0) {
            int i12 = notificationsSettings.getInt("priority_" + j11, 3);
            iArr[0] = i12;
            if (i12 == 3) {
                iArr[0] = 0;
            } else if (i12 == 4) {
                iArr[0] = 1;
            } else if (i12 == 5) {
                iArr[0] = 2;
            } else if (i12 == 0) {
                iArr[0] = 3;
            } else {
                iArr[0] = 4;
            }
            strArr = new String[]{LocaleController.getString(R.string.NotificationsPrioritySettings), LocaleController.getString(R.string.NotificationsPriorityLow), LocaleController.getString(R.string.NotificationsPriorityMedium), LocaleController.getString(R.string.NotificationsPriorityHigh), LocaleController.getString(R.string.NotificationsPriorityUrgent)};
        } else {
            if (i11 == 1) {
                iArr[0] = notificationsSettings.getInt("priority_messages", 1);
            } else if (i11 == 0) {
                iArr[0] = notificationsSettings.getInt("priority_group", 1);
            } else if (i11 == 2) {
                iArr[0] = notificationsSettings.getInt("priority_channel", 1);
            } else if (i11 == 3) {
                iArr[0] = notificationsSettings.getInt("priority_stories", 1);
            } else if (i11 == 4 || i11 == 5) {
                iArr[0] = notificationsSettings.getInt("priority_react", 1);
            }
            int i13 = iArr[0];
            if (i13 == 4) {
                iArr[0] = 0;
            } else if (i13 == 5) {
                iArr[0] = 1;
            } else if (i13 == 0) {
                iArr[0] = 2;
            } else {
                iArr[0] = 3;
            }
            strArr = new String[]{LocaleController.getString(R.string.NotificationsPriorityLow), LocaleController.getString(R.string.NotificationsPriorityMedium), LocaleController.getString(R.string.NotificationsPriorityHigh), LocaleController.getString(R.string.NotificationsPriorityUrgent)};
        }
        String[] strArr2 = strArr;
        LinearLayout e7 = org.telegram.messenger.q.e(activity, 1);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, e6Var);
        int i14 = 0;
        while (i14 < strArr2.length) {
            org.telegram.ui.Cells.l6 l6Var = new org.telegram.ui.Cells.l6(activity, e6Var);
            l6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            l6Var.setTag(Integer.valueOf(i14));
            l6Var.a(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.g7, e6Var), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.E5, e6Var));
            l6Var.b(strArr2[i14], iArr[0] == i14 ? z10 : false);
            e7.addView(l6Var);
            l6Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.h3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    int i15 = 0;
                    iArr2[0] = intValue;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                    long j12 = j11;
                    if (j12 != 0) {
                        int i16 = iArr2[0];
                        if (i16 == 0) {
                            i15 = 3;
                        } else if (i16 == 1) {
                            i15 = 4;
                        } else if (i16 == 2) {
                            i15 = 5;
                        } else if (i16 != 3) {
                            i15 = 1;
                        }
                        edit.putInt("priority_" + j12, i15);
                        NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannel(j12, j10);
                    } else {
                        int i17 = iArr2[0];
                        int i18 = i17 == 0 ? 4 : i17 == 1 ? 5 : i17 == 2 ? 0 : 1;
                        int i19 = i11;
                        SharedPreferences sharedPreferences = notificationsSettings;
                        if (i19 == 1) {
                            edit.putInt("priority_messages", i18);
                            iArr2[0] = sharedPreferences.getInt("priority_messages", 1);
                        } else if (i19 == 0) {
                            edit.putInt("priority_group", i18);
                            iArr2[0] = sharedPreferences.getInt("priority_group", 1);
                        } else if (i19 == 2) {
                            edit.putInt("priority_channel", i18);
                            iArr2[0] = sharedPreferences.getInt("priority_channel", 1);
                        } else if (i19 == 3) {
                            edit.putInt("priority_stories", i18);
                            iArr2[0] = sharedPreferences.getInt("priority_stories", 1);
                        } else if (i19 == 4 || i19 == 5) {
                            edit.putInt("priority_react", i18);
                            iArr2[0] = sharedPreferences.getInt("priority_react", 1);
                        }
                        NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannelGlobal(i19);
                    }
                    edit.commit();
                    alertDialog$Builder.a.L0.run();
                    runnable.run();
                }
            });
            i14++;
            j11 = j3;
            i11 = i10;
            z10 = true;
        }
        alertDialog$Builder.a.R = LocaleController.getString(R.string.NotificationsImportance);
        alertDialog$Builder.n(e7);
        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.a;
    }

    public static void I(int i10, Activity activity, long j3, TLRPC.Photo photo, ai.d dVar) {
        if (activity != null) {
            b3 b3Var = new b3(i10, j3, photo, activity, dVar);
            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) activity, (org.telegram.ui.ActionBar.e6) dVar, true);
            f3Var.fixNavigationBar();
            f3Var.title = LocaleController.getString(R.string.ReportProfilePhoto);
            f3Var.bigTitle = true;
            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.ReportChatSpam), LocaleController.getString(R.string.ReportChatFakeAccount), LocaleController.getString(R.string.ReportChatViolence), LocaleController.getString(R.string.ReportChatChild), LocaleController.getString(R.string.ReportChatIllegalDrugs), LocaleController.getString(R.string.ReportChatPersonalDetails), LocaleController.getString(R.string.ReportChatPornography), LocaleController.getString(R.string.ReportChatOther)};
            int[] iArr = {R.drawable.msg_clearcache, R.drawable.msg_report_fake, R.drawable.msg_report_violence, R.drawable.msg_block2, R.drawable.msg_report_drugs, R.drawable.msg_report_personal, R.drawable.msg_report_xxx, R.drawable.msg_report_other};
            c3 c3Var = new c3(new int[]{0, 6, 1, 2, 3, 4, 5, 100}, activity, dVar, b3Var, 0);
            f3Var.items = charSequenceArr;
            f3Var.itemIcons = iArr;
            f3Var.onClickListener = c3Var;
            f3Var.show();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r2v18, types: [android.view.View, org.telegram.ui.Components.ud0] */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r5v13, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r5v34, types: [android.view.View, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r8v10, types: [org.telegram.ui.ActionBar.n5] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v8, types: [org.telegram.ui.ActionBar.n5] */
    /* JADX WARN: Type inference failed for: r9v9, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    public static org.telegram.ui.ActionBar.a3 J(final Context context, final long j3, long j10, int i10, boolean z10, final f5 f5Var, Runnable runnable, e5 e5Var, org.telegram.ui.ActionBar.e6 e6Var) {
        FrameLayout frameLayout;
        ViewGroup viewGroup;
        int[] iArr;
        FrameLayout frameLayout2;
        ViewGroup viewGroup2;
        FrameLayout frameLayout3;
        ?? r82;
        boolean[] zArr;
        ud0 ud0Var;
        long j11;
        int i11;
        ?? r12;
        org.telegram.ui.ActionBar.v0 v0Var;
        char c10;
        int i12;
        int[] iArr2;
        String[] strArr;
        final Calendar calendar;
        int i13;
        int[] iArr3;
        float f7;
        int[] iArr4;
        FrameLayout frameLayout4;
        String[] strArr2;
        FrameLayout frameLayout5;
        int i14;
        fk0 fk0Var;
        TLRPC.User user;
        TLRPC.UserStatus userStatus;
        if (context == null) {
            return null;
        }
        int[] iArr5 = {i10};
        long clientUserId = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
        final org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, e6Var);
        a3Var.a();
        ud0 ud0Var2 = new ud0(context, e6Var);
        int i15 = e5Var.a;
        int i16 = e5Var.c;
        int i17 = e5Var.b;
        ud0Var2.setTextColor(i15);
        ud0Var2.setTextOffset(AndroidUtilities.dp(10.0f));
        ud0Var2.setItemCount(5);
        final w3 w3Var = new w3(context, e6Var);
        w3Var.setWrapSelectorWheel(true);
        w3Var.setAllItemsCount(24);
        w3Var.setItemCount(5);
        w3Var.setTextColor(i15);
        w3Var.setTextOffset(-AndroidUtilities.dp(10.0f));
        final x3 x3Var = new x3(context, e6Var);
        x3Var.setWrapSelectorWheel(true);
        x3Var.setAllItemsCount(60);
        x3Var.setItemCount(5);
        x3Var.setTextColor(i15);
        x3Var.setTextOffset(-AndroidUtilities.dp(34.0f));
        ?? frameLayout6 = new FrameLayout(context);
        y3 y3Var = new y3(context, ud0Var2, w3Var, x3Var, 0);
        y3Var.setClipToPadding(false);
        y3Var.setClipChildren(false);
        y3Var.setOrientation(1);
        frameLayout6.addView(y3Var, w7.x5.d(-1.0f, -1));
        FrameLayout frameLayout7 = new FrameLayout(context);
        frameLayout6.addView(frameLayout7, w7.x5.a(100.0f, 0.0f, 0.0f, 0.0f, 120.0f, -1, 87));
        ViewGroup frameLayout8 = new FrameLayout(context);
        y3Var.addView(frameLayout8, w7.x5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        if (TextUtils.isEmpty(null)) {
            frameLayout = frameLayout7;
            if (j3 == clientUserId) {
                textView.setText(LocaleController.getString(R.string.SetReminder));
            } else {
                textView.setText(LocaleController.getString(R.string.ScheduleMessage));
            }
        } else {
            frameLayout = frameLayout7;
            textView.setText((CharSequence) null);
        }
        org.telegram.messenger.q.m(20.0f, i15, 1, textView);
        frameLayout8.addView(textView, w7.x5.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
        textView.setOnTouchListener(new bi.d(10));
        boolean[] zArr2 = {true};
        if (!DialogObject.isUserDialog(j3) || j3 == clientUserId || (user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j3))) == null || user.bot || (userStatus = user.status) == null || userStatus.expires <= 0) {
            viewGroup = frameLayout6;
            iArr = iArr5;
            frameLayout2 = frameLayout;
            viewGroup2 = frameLayout8;
            frameLayout3 = null;
            r82 = 0;
            zArr = zArr2;
            ud0Var = ud0Var2;
            j11 = clientUserId;
            i11 = -1;
            r12 = y3Var;
            v0Var = null;
        } else {
            String firstName = UserObject.getFirstName(user);
            if (firstName.length() > 10) {
                firstName = firstName.substring(0, 10) + "…";
            }
            viewGroup = frameLayout6;
            iArr = iArr5;
            viewGroup2 = frameLayout8;
            r82 = 0;
            zArr = zArr2;
            frameLayout3 = null;
            ud0Var = ud0Var2;
            frameLayout2 = frameLayout;
            j11 = clientUserId;
            r12 = y3Var;
            i11 = -1;
            v0Var = new org.telegram.ui.ActionBar.v0(context, null, 0, e5Var.a, false, e6Var);
            v0Var.setLongClickEnabled(false);
            v0Var.setSubMenuOpenSide(2);
            v0Var.setIcon(R.drawable.ic_ab_other);
            v0Var.setBackground(org.telegram.ui.ActionBar.i6.g0(i16, 1, -1));
            viewGroup2.addView(v0Var, w7.x5.a(40.0f, 0.0f, 8.0f, 5.0f, 0.0f, 40, 53));
            v0Var.g(1, LocaleController.formatString(R.string.ScheduleWhenOnline, firstName));
            v0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        }
        int i18 = 11;
        if (v0Var != null) {
            v0Var.setOnClickListener(new org.telegram.ui.sf(i18, v0Var, e5Var));
            v0Var.setDelegate(new ai.r5(f5Var, zArr, a3Var, 19));
        }
        fk0 fk0Var2 = new fk0(context);
        final ck0 ck0Var = new ck0(R.raw.notify_toggle, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        ck0Var.J(true);
        ck0Var.h = true;
        ck0Var.start();
        ck0Var.M(40);
        ck0Var.P(40);
        fk0Var2.setScaleType(ImageView.ScaleType.CENTER);
        fk0Var2.setAnimation(ck0Var);
        fk0Var2.setColorFilter(new PorterDuffColorFilter(i15, PorterDuff.Mode.SRC_IN));
        fk0Var2.setBackground(org.telegram.ui.ActionBar.i6.g0(i16, 1, i11));
        viewGroup2.addView(fk0Var2, w7.x5.a(40.0f, 0.0f, 8.0f, (v0Var != null ? 42 : r82) + 8, 0.0f, 40, 53));
        ?? linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(r82);
        linearLayout.setWeightSum(1.0f);
        r12.addView(linearLayout, w7.x5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar2 = Calendar.getInstance();
        final ai.q4 q4Var = new ai.q4(context, 14);
        final ?? r22 = ud0Var;
        linearLayout.addView(r22, w7.x5.l(0.5f, r82, 270));
        r22.setMinValue(r82);
        r22.setMaxValue(365);
        r22.setWrapSelectorWheel(r82);
        r22.setFormatter(new f2(5));
        final org.telegram.ui.ActionBar.v0 v0Var2 = v0Var;
        ?? r02 = r12;
        final long j12 = j11;
        sd0 sd0Var = new sd0() { // from class: org.telegram.ui.Components.n2
            @Override // org.telegram.ui.Components.sd0
            public final void r(ud0 ud0Var3, int i19) {
                g5.f(ai.q4.this, null, 0L, 0L, j12 == j3 ? 1 : 0, r22, w3Var, x3Var);
            }
        };
        r22.setOnValueChangedListener(sd0Var);
        w3Var.setMinValue(0);
        w3Var.setMaxValue(23);
        final boolean[] zArr3 = zArr;
        linearLayout.addView(w3Var, w7.x5.l(0.2f, 0, 270));
        w3Var.setFormatter(new f2(6));
        w3Var.setOnValueChangedListener(sd0Var);
        x3Var.setMinValue(0);
        x3Var.setMaxValue(59);
        x3Var.setValue(0);
        x3Var.setFormatter(new f2(7));
        linearLayout.addView(x3Var, w7.x5.l(0.3f, 0, 270));
        x3Var.setOnValueChangedListener(sd0Var);
        if (j10 > 0 && j10 != 2147483646) {
            long j13 = 1000 * j10;
            calendar2.setTimeInMillis(System.currentTimeMillis());
            calendar2.set(12, 0);
            calendar2.set(13, 0);
            calendar2.set(14, 0);
            calendar2.set(11, 0);
            int timeInMillis = (int) ((j13 - calendar2.getTimeInMillis()) / 86400000);
            calendar2.setTimeInMillis(j13);
            if (timeInMillis >= 0) {
                x3Var.setValue(calendar2.get(12));
                w3Var.setValue(calendar2.get(11));
                r22.setValue(timeInMillis);
            }
        }
        final boolean[] zArr4 = {true};
        f(q4Var, null, 0L, 0L, j12 == j3 ? 1 : 0, r22, w3Var, x3Var);
        boolean isTestBackend = ConnectionsManager.getInstance(UserConfig.selectedAccount).isTestBackend();
        if (isTestBackend) {
            c10 = '\t';
            i12 = 10;
            iArr2 = new int[]{0, 60, 300, 86400, 604800, 1209600, 2592000, 7862400, 15724800, 31536000};
        } else {
            c10 = '\t';
            i12 = 10;
            iArr2 = new int[]{0, 86400, 604800, 1209600, 2592000, 7862400, 15724800, 31536000};
        }
        if (isTestBackend) {
            strArr = new String[i12];
            strArr[0] = LocaleController.getString(R.string.MessageScheduledRepeatOptionNever);
            strArr[1] = "Every minute";
            strArr[2] = "Every 5 minutes";
            strArr[3] = LocaleController.getString(R.string.MessageScheduledRepeatOptionDaily);
            strArr[4] = LocaleController.getString(R.string.MessageScheduledRepeatOptionWeekly);
            strArr[5] = LocaleController.getString(R.string.MessageScheduledRepeatOptionBiweekly);
            strArr[6] = LocaleController.getString(R.string.MessageScheduledRepeatOptionMonthly);
            strArr[7] = LocaleController.getString(R.string.MessageScheduledRepeatOption3Monthly);
            strArr[8] = LocaleController.getString(R.string.MessageScheduledRepeatOption6Monthly);
            strArr[c10] = LocaleController.getString(R.string.MessageScheduledRepeatOptionYearly);
        } else {
            strArr = new String[]{LocaleController.getString(R.string.MessageScheduledRepeatOptionNever), LocaleController.getString(R.string.MessageScheduledRepeatOptionDaily), LocaleController.getString(R.string.MessageScheduledRepeatOptionWeekly), LocaleController.getString(R.string.MessageScheduledRepeatOptionBiweekly), LocaleController.getString(R.string.MessageScheduledRepeatOptionMonthly), LocaleController.getString(R.string.MessageScheduledRepeatOption3Monthly), LocaleController.getString(R.string.MessageScheduledRepeatOption6Monthly), LocaleController.getString(R.string.MessageScheduledRepeatOptionYearly)};
        }
        if (z10) {
            calendar = calendar2;
            i13 = i17;
            iArr3 = iArr;
            f7 = 14.0f;
            iArr4 = iArr2;
            frameLayout4 = frameLayout3;
            strArr2 = strArr;
            frameLayout5 = frameLayout4;
        } else {
            ?? frameLayout9 = new FrameLayout(context);
            i13 = i17;
            int v = org.telegram.ui.ActionBar.i6.v(i13, org.telegram.ui.ActionBar.i6.m1(0.075f, i15));
            f7 = 14.0f;
            int m12 = org.telegram.ui.ActionBar.i6.m1(0.1f, i15);
            ?? textView2 = new TextView(context);
            calendar = calendar2;
            textView2.setTextSize(1, 13.0f);
            textView2.setTextColor(i15);
            textView2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            int dp = AndroidUtilities.dp(14.0f);
            int v9 = org.telegram.ui.ActionBar.i6.v(v, m12);
            textView2.setBackground(org.telegram.ui.ActionBar.i6.j0(dp, dp, dp, dp, v, v9, v9));
            textView2.setGravity(17);
            iArr3 = iArr;
            ?? n5Var = new org.telegram.ui.ActionBar.n5(iArr2, iArr3, strArr, (TextView) textView2);
            n5Var.run();
            frameLayout9.addView(textView2, w7.x5.a(28.0f, 32.0f, 4.0f, 32.0f, 5.0f, -2, 1));
            r02.addView(frameLayout9, w7.x5.n(-1, -2));
            frameLayout3 = n5Var;
            frameLayout4 = textView2;
            iArr4 = iArr2;
            strArr2 = strArr;
            frameLayout5 = frameLayout9;
        }
        q4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        q4Var.setGravity(17);
        q4Var.setTextColor(e5Var.g);
        q4Var.setTextSize(1, f7);
        q4Var.setTypeface(AndroidUtilities.bold());
        q4Var.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{24.0f}, e5Var.h));
        r02.addView(q4Var, w7.x5.t(-1, 48, 83, 16, 15, 16, 16));
        int i19 = i13;
        final int[] iArr6 = iArr3;
        q4Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.o2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Runnable runnable2;
                zArr4[0] = false;
                int i20 = j12 == j3 ? 1 : 0;
                ud0 ud0Var3 = r22;
                w3 w3Var2 = w3Var;
                x3 x3Var2 = x3Var;
                boolean f10 = g5.f(null, null, 0L, 0L, i20, ud0Var3, w3Var2, x3Var2);
                long currentTimeMillis = System.currentTimeMillis();
                Calendar calendar3 = calendar;
                calendar3.setTimeInMillis(currentTimeMillis);
                calendar3.add(6, ud0Var3.getValue());
                calendar3.set(11, w3Var2.getValue());
                calendar3.set(12, x3Var2.getValue());
                if (f10) {
                    calendar3.set(13, 0);
                    calendar3.set(14, 0);
                }
                f5Var.J((int) (calendar3.getTimeInMillis() / 1000), iArr6[0], zArr3[0]);
                runnable2 = a3Var.a.dismissRunnable;
                runnable2.run();
            }
        });
        a3Var.b(viewGroup);
        final org.telegram.ui.ActionBar.f3 f3Var = a3Var.a;
        f3Var.show();
        f3Var.setOnDismissListener(new p2(runnable, zArr4));
        f3Var.setBackgroundColor(i19);
        f3Var.fixNavigationBar(i19);
        if (frameLayout4 != null) {
            i14 = 1;
            fk0Var = fk0Var2;
            frameLayout4.setOnClickListener(new a2(frameLayout2, e6Var, f3Var, frameLayout5, iArr4, strArr2, iArr3, (org.telegram.ui.ActionBar.n5) frameLayout3));
        } else {
            i14 = 1;
            fk0Var = fk0Var2;
        }
        final ci.d4[] d4VarArr = new ci.d4[i14];
        fk0Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.d2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String string;
                boolean[] zArr5 = zArr3;
                boolean z11 = zArr5[0];
                zArr5[0] = !z11;
                ck0 ck0Var2 = ck0Var;
                if (z11) {
                    if (ck0Var2.a0 < 40) {
                        ck0Var2.M(40);
                    }
                    ck0Var2.P(80);
                    ck0Var2.start();
                } else {
                    if (ck0Var2.a0 >= 40) {
                        ck0Var2.M(0);
                    }
                    ck0Var2.P(40);
                    ck0Var2.start();
                }
                ci.d4[] d4VarArr2 = d4VarArr;
                ci.d4 d4Var = d4VarArr2[0];
                if (d4Var != null) {
                    d4Var.e(true);
                    d4VarArr2[0] = null;
                }
                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                long j14 = j3;
                TLRPC.User user2 = messagesController.getUser(Long.valueOf(j14));
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j14));
                ci.d4 d4Var2 = new ci.d4(context, 3);
                d4VarArr2[0] = d4Var2;
                d4Var2.r();
                d4Var2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                d4Var2.q(20.0f);
                float dp2 = AndroidUtilities.dp(12.0f);
                float dp3 = AndroidUtilities.dp(4.0f);
                int m13 = org.telegram.ui.ActionBar.i6.m1(0.25f, -16777216);
                d4Var2.i0 = dp2;
                d4Var2.j0 = dp3;
                d4Var2.k0 = m13;
                d4Var2.F.setShadowLayer(dp2, 0.0f, dp3, m13);
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    string = LocaleController.getString(zArr5[0] ? R.string.ScheduleNotifyOnChannel : R.string.ScheduleNotifyOffChannel);
                } else if (chat != null || user2 == null) {
                    string = LocaleController.getString(zArr5[0] ? R.string.ScheduleNotifyOnGroup : R.string.ScheduleNotifyOffGroup);
                } else if (j14 == j12) {
                    string = LocaleController.getString(zArr5[0] ? R.string.ScheduleNotifyOnSelf : R.string.ScheduleNotifyOffSelf);
                } else {
                    string = LocaleController.formatString(zArr5[0] ? R.string.ScheduleNotifyOnChat : R.string.ScheduleNotifyOffChat, UserObject.getForcedFirstName(user2));
                }
                d4Var2.s(string);
                d4Var2.d = 5000L;
                d4Var2.l(1.0f, -((v0Var2 != null ? 42 : -8) + 20));
                d4Var2.l0 = new rg(d4Var2, 2);
                org.telegram.ui.ActionBar.f3 f3Var2 = f3Var;
                f3Var2.getContainerView().setClipToPadding(false);
                f3Var2.getContainerView().setClipChildren(false);
                f3Var2.getContainerView().addView(d4Var2, w7.x5.a(200.0f, 0.0f, -194.0f, 0.0f, 0.0f, -1, 48));
                d4Var2.u();
            }
        });
        return a3Var;
    }

    public static void K(Context context, long j3, f5 f5Var) {
        J(context, j3, -1L, 0, false, f5Var, null, new e5(null), null);
    }

    public static void L(Context context, long j3, f5 f5Var, org.telegram.ui.ActionBar.e6 e6Var) {
        J(context, j3, -1L, 0, false, f5Var, null, new e5(e6Var), e6Var);
    }

    public static AlertDialog$Builder M(Context context, String str, String str2) {
        return N(context, str, str2, null, null, null);
    }

    public static AlertDialog$Builder N(Context context, String str, String str2, String str3, Runnable runnable, org.telegram.ui.ActionBar.e6 e6Var) {
        if (context == null || str2 == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
        if (str == null) {
            str = LocaleController.getString(R.string.AppName);
        }
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.R = str;
        b2Var.T = str2;
        if (str3 == null) {
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            return alertDialog$Builder;
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(str3, new z0(6, runnable));
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.b2 O(Context context, org.telegram.ui.ActionBar.e6 e6Var, String str, CharSequence charSequence, String str2, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.R = str;
        b2Var.T = charSequence;
        alertDialog$Builder.k(str2, new z0(5, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.a;
    }

    public static org.telegram.ui.ActionBar.n1 P(org.telegram.ui.ActionBar.n2 n2Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, View view, float f7, float f10) {
        if (n2Var == null || view == null) {
            return null;
        }
        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        n1Var.e = true;
        n1Var.c = 220;
        n1Var.setOutsideTouchable(true);
        n1Var.setClippingEnabled(true);
        n1Var.setAnimationStyle(R.style.PopupContextAnimation);
        n1Var.setFocusable(true);
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
        n1Var.setInputMethodMode(2);
        n1Var.getContentView().setFocusableInTouchMode(true);
        float f11 = 0.0f;
        View view2 = view;
        float f12 = 0.0f;
        while (view2 != view.getRootView()) {
            f11 += view2.getX();
            f12 += view2.getY();
            view2 = (View) view2.getParent();
            if (view2 == null) {
                break;
            }
        }
        n1Var.showAtLocation(view.getRootView(), 0, (int) ((f11 + f7) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() / 2.0f)), (int) ((f12 + f10) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() / 2.0f)));
        n1Var.b();
        return n1Var;
    }

    public static void Q(Context context, org.telegram.ui.ActionBar.n2 n2Var, String str, String str2, String str3, String str4, int i10, String str5, org.telegram.ui.ActionBar.e6 e6Var, MessagesStorage.StringCallback stringCallback) {
        Activity findActivity = AndroidUtilities.findActivity(context);
        View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
        String string = str == null ? LocaleController.getString(R.string.AppName) : str;
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.R = string;
        b2Var.T = str2;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i11 = org.telegram.ui.ActionBar.i6.j5;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Xh, e6Var));
        editTextBoldCursor.setHint(str3);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setInputType(147457);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setMaxLines(10);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(11.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.q6, e6Var));
        if (str4 != null) {
            editTextBoldCursor.setText(str4);
        }
        editTextBoldCursor.setOnEditorActionListener(new hg.q(editTextBoldCursor, i10, stringCallback, b2VarArr, currentFocus, 1));
        editTextBoldCursor.addTextChangedListener(new a4(i10, editTextBoldCursor));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
        gradientDrawable.setColor(org.telegram.ui.ActionBar.i6.m1(0.06f, org.telegram.ui.ActionBar.i6.w0(i11, e6Var)));
        editTextBoldCursor.setBackground(gradientDrawable);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(editTextBoldCursor, w7.x5.k(20.0f, 9.0f, 20.0f, 9.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.a.a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
        alertDialog$Builder.k(str5, new gg.c2(editTextBoldCursor, i10, stringCallback, 8));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.nr(25));
        b2VarArr[0] = alertDialog$Builder.a;
        if (n2Var != null) {
            AndroidUtilities.requestAdjustNothing(findActivity, n2Var.getClassGuid());
        }
        org.telegram.ui.ActionBar.b2 b2Var2 = b2VarArr[0];
        b2Var2.h0 = false;
        b2Var2.setOnDismissListener(new ei.t0(editTextBoldCursor, n2Var, findActivity, 2));
        b2VarArr[0].setOnShowListener(new f1(1, editTextBoldCursor));
        b2VarArr[0].show();
        editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
    }

    public static void R(Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.e6 e6Var, MessagesStorage.StringCallback stringCallback) {
        Q(context, n2Var, LocaleController.getString(R.string.StoriesAlbumCreateNew), LocaleController.getString(R.string.StoriesAlbumAddHint), LocaleController.getString(R.string.StoriesAlbumTitleInputHint), null, 12, LocaleController.getString(R.string.Create), e6Var, stringCallback);
    }

    public static org.telegram.ui.ActionBar.a3 S(Context context, long j3, final f5 f5Var, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        int i11;
        int i12;
        int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.j5, false);
        int x03 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.h5, false);
        org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Ji, false);
        org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Ni, false);
        org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.E8, false);
        org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.G8, false);
        int i13 = org.telegram.ui.ActionBar.i6.i6;
        org.telegram.ui.ActionBar.i6.x0(null, i13, false);
        int x04 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Sh, false);
        int x05 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Oh, false);
        org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Qh, false);
        if (context == null) {
            return null;
        }
        final org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, e6Var);
        a3Var.a();
        final ud0 ud0Var = new ud0(context, e6Var);
        ud0Var.setTextColor(x02);
        ud0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        ud0Var.setItemCount(5);
        final w4 w4Var = new w4(context, e6Var);
        w4Var.setWrapSelectorWheel(true);
        w4Var.setAllItemsCount(24);
        w4Var.setItemCount(5);
        w4Var.setTextColor(x02);
        w4Var.setTextOffset(-AndroidUtilities.dp(10.0f));
        final x4 x4Var = new x4(context, e6Var);
        x4Var.setWrapSelectorWheel(true);
        x4Var.setAllItemsCount(60);
        x4Var.setItemCount(5);
        x4Var.setTextColor(x02);
        x4Var.setTextOffset(-AndroidUtilities.dp(34.0f));
        y3 y3Var = new y3(context, ud0Var, w4Var, x4Var, 5);
        y3Var.setOrientation(1);
        LinearLayout e7 = org.telegram.messenger.bi.e(context, 1);
        y3Var.addView(e7, w7.x5.t(-1, -2, 51, 22, 0, 22, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(i10 == 1 ? R.string.SuggestedPostAcceptTitle : R.string.PostSuggestionsAddTime));
        textView.setTextColor(x02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        e7.addView(textView, w7.x5.t(-2, -2, 51, 0, 12, 0, 0));
        textView.setOnTouchListener(new bi.d(10));
        TextView textView2 = new TextView(context);
        org.telegram.messenger.bi.o(org.telegram.ui.ActionBar.i6.z6, e6Var, textView2, 1, 14.0f);
        textView2.setText(LocaleController.getString(R.string.PostSuggestionsAddTimeHint));
        e7.addView(textView2, w7.x5.t(-2, -2, 51, 0, 2, 0, 0));
        textView2.setOnTouchListener(new bi.d(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        y3Var.addView(linearLayout, w7.x5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long currentTimeMillis = System.currentTimeMillis();
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i14 = calendar.get(1);
        AppGlobalConfig.ConfigTime configTime = MessagesController.getInstance(UserConfig.selectedAccount).config.starsSuggestedPostFutureMin;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        final long j10 = configTime.get(timeUnit) * 2;
        final long j11 = MessagesController.getInstance(UserConfig.selectedAccount).config.starsSuggestedPostFutureMax.get(timeUnit) - 86400;
        final ai.q4 q4Var = new ai.q4(context, 20);
        linearLayout.addView(ud0Var, w7.x5.l(0.5f, 0, 270));
        ud0Var.setMinValue(0);
        ud0Var.setMaxValue(365);
        ud0Var.setWrapSelectorWheel(false);
        ud0Var.setFormatter(new i2.w(i14, 8));
        final int i15 = i10 == 1 ? 5 : 3;
        sd0 sd0Var = new sd0() { // from class: org.telegram.ui.Components.w1
            @Override // org.telegram.ui.Components.sd0
            public final void r(ud0 ud0Var2, int i16) {
                g5.f(ai.q4.this, null, j10, j11, i15, ud0Var, w4Var, x4Var);
            }
        };
        ud0Var.setOnValueChangedListener(sd0Var);
        w4Var.setMinValue(0);
        w4Var.setMaxValue(23);
        linearLayout.addView(w4Var, w7.x5.l(0.2f, 0, 270));
        w4Var.setFormatter(new org.telegram.ui.nr(20));
        w4Var.setOnValueChangedListener(sd0Var);
        x4Var.setMinValue(0);
        x4Var.setMaxValue(59);
        x4Var.setValue(0);
        x4Var.setFormatter(new org.telegram.ui.nr(21));
        linearLayout.addView(x4Var, w7.x5.l(0.3f, 0, 270));
        x4Var.setOnValueChangedListener(sd0Var);
        int i16 = 12;
        if (j3 <= 0 || j3 == 2147483646) {
            i11 = x03;
            i12 = i13;
        } else {
            long j12 = 1000 * j3;
            i11 = x03;
            i12 = i13;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j12 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j12);
            if (timeInMillis >= 0) {
                x4Var.setValue(calendar.get(12));
                w4Var.setValue(calendar.get(11));
                ud0Var.setValue(timeInMillis);
            }
        }
        final boolean[] zArr = {true};
        f(q4Var, null, j10, j11, i15, ud0Var, w4Var, x4Var);
        q4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        q4Var.setGravity(17);
        q4Var.setTextColor(x04);
        q4Var.setTextSize(1, 14.0f);
        q4Var.setTypeface(AndroidUtilities.bold());
        q4Var.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{8.0f}, x05));
        y3Var.addView(q4Var, w7.x5.t(-1, 48, 83, 16, 15, 16, 4));
        final int i17 = i15;
        q4Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.x1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Runnable runnable;
                zArr[0] = false;
                long j13 = j10;
                long j14 = j11;
                int i18 = i17;
                ud0 ud0Var2 = ud0Var;
                w4 w4Var2 = w4Var;
                x4 x4Var2 = x4Var;
                boolean f7 = g5.f(null, null, j13, j14, i18, ud0Var2, w4Var2, x4Var2);
                long epochMilli = LocalDate.now().plusDays(ud0Var2.getValue()).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
                Calendar calendar2 = calendar;
                calendar2.setTimeInMillis(epochMilli);
                calendar2.set(11, w4Var2.getValue());
                calendar2.set(12, x4Var2.getValue());
                if (f7) {
                    calendar2.set(13, 0);
                }
                f5Var.J((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                runnable = a3Var.a.dismissRunnable;
                runnable.run();
            }
        });
        w7.z5.b(q4Var, 0.02f, 1.2f);
        ai.q4 q4Var2 = new ai.q4(context, 21);
        q4Var2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        q4Var2.setGravity(17);
        q4Var2.setText(LocaleController.getString(i10 == 1 ? R.string.MessageSuggestionPublishNow : R.string.PostSuggestionsAnytime));
        q4Var2.setTextColor(x05);
        q4Var2.setTextSize(1, 14.0f);
        int dp = AndroidUtilities.dp(8.0f);
        int x06 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.d6, false);
        int x07 = org.telegram.ui.ActionBar.i6.x0(null, i12, false);
        q4Var2.setBackground(org.telegram.ui.ActionBar.i6.j0(dp, dp, dp, dp, x06, x07, x07));
        y3Var.addView(q4Var2, w7.x5.t(-1, 48, 83, 16, 0, 16, 16));
        q4Var2.setOnClickListener(new ai.d0(zArr, f5Var, a3Var, i16));
        w7.z5.b(q4Var2, 0.02f, 1.2f);
        a3Var.b(y3Var);
        org.telegram.ui.ActionBar.f3 f3Var = a3Var.a;
        f3Var.show();
        f3Var.setOnDismissListener(new ci.e1(zArr));
        f3Var.setBackgroundColor(i11);
        f3Var.fixNavigationBar(i11);
        return a3Var;
    }

    public static org.telegram.ui.ActionBar.b2 T(org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        if (n2Var == null || n2Var.getParentActivity() == null) {
            return null;
        }
        ea0 ea0Var = new ea0(n2Var.getParentActivity(), n2Var.getResourceProvider());
        SpannableString spannableString = new SpannableString(Html.fromHtml(LocaleController.getString(R.string.AskAQuestionInfo).replace("\n", "<br>")));
        for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new o4(n2Var, uRLSpan.getURL()), spanStart, spanEnd, 0);
        }
        ea0Var.setText(spannableString);
        ea0Var.setTextSize(1, 16.0f);
        ea0Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.k5, e6Var));
        ea0Var.setHighlightColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.l5, e6Var));
        ea0Var.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
        ea0Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        ea0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.j5, e6Var));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity(), 0, e6Var);
        alertDialog$Builder.n(ea0Var);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.AskAQuestion);
        alertDialog$Builder.k(LocaleController.getString(R.string.AskButton), new s2(1, n2Var));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.a;
    }

    public static AlertDialog$Builder U(Context context, TLRPC.EncryptedChat encryptedChat, org.telegram.ui.ActionBar.e6 e6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.MessageLifetime);
        ud0 ud0Var = new ud0(context, null);
        ud0Var.setMinValue(0);
        ud0Var.setMaxValue(20);
        int i10 = encryptedChat.ttl;
        if (i10 > 0 && i10 < 16) {
            ud0Var.setValue(i10);
        } else if (i10 == 30) {
            ud0Var.setValue(16);
        } else if (i10 == 60) {
            ud0Var.setValue(17);
        } else if (i10 == 3600) {
            ud0Var.setValue(18);
        } else if (i10 == 86400) {
            ud0Var.setValue(19);
        } else if (i10 == 604800) {
            ud0Var.setValue(20);
        } else if (i10 == 0) {
            ud0Var.setValue(0);
        }
        ud0Var.setFormatter(new f2(11));
        alertDialog$Builder.n(ud0Var);
        alertDialog$Builder.h(LocaleController.getString(R.string.Done), new org.telegram.ui.o(27, encryptedChat, ud0Var));
        return alertDialog$Builder;
    }

    public static void V(org.telegram.ui.ActionBar.n2 n2Var, int i10, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.ActionBar.g6 g6Var) {
        int i11;
        String sb2;
        if (n2Var.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = n2Var.getParentActivity();
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(parentActivity);
        String str = null;
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.u5, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.v5, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.q7, false));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.NewTheme);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Create), new f2(12));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        TextView textView = new TextView(parentActivity);
        if (i10 != 0) {
            org.telegram.messenger.q.n(R.string.EnterThemeNameEdit, textView);
        } else {
            textView.setText(LocaleController.getString(R.string.EnterThemeName));
        }
        textView.setTextSize(1, 16.0f);
        textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
        int i12 = org.telegram.ui.ActionBar.i6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i12, false));
        linearLayout.addView(textView, w7.x5.n(-1, -2));
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i12, false));
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.G6, false));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        linearLayout.addView(editTextBoldCursor, w7.x5.t(-1, 36, 51, 24, 6, 24, 0));
        editTextBoldCursor.setOnEditorActionListener(new t2(0));
        List asList = Arrays.asList("Ancient", "Antique", "Autumn", "Baby", "Barely", "Baroque", "Blazing", "Blushing", "Bohemian", "Bubbly", "Burning", "Buttered", "Classic", "Clear", "Cool", "Cosmic", "Cotton", "Cozy", "Crystal", "Dark", "Daring", "Darling", "Dawn", "Dazzling", "Deep", "Deepest", "Delicate", "Delightful", "Divine", "Double", "Downtown", "Dreamy", "Dusky", "Dusty", "Electric", "Enchanted", "Endless", "Evening", "Fantastic", "Flirty", "Forever", "Frigid", "Frosty", "Frozen", "Gentle", "Heavenly", "Hyper", "Icy", "Infinite", "Innocent", "Instant", "Luscious", "Lunar", "Lustrous", "Magic", "Majestic", "Mambo", "Midnight", "Millenium", "Morning", "Mystic", "Natural", "Neon", "Night", "Opaque", "Paradise", "Perfect", "Perky", "Polished", "Powerful", "Rich", "Royal", "Sheer", "Simply", "Sizzling", "Solar", "Sparkling", "Splendid", "Spicy", "Spring", "Stellar", "Sugared", "Summer", "Sunny", "Super", "Sweet", "Tender", "Tenacious", "Tidal", "Toasted", "Totally", "Tranquil", "Tropical", "True", "Twilight", "Twinkling", "Ultimate", "Ultra", "Velvety", "Vibrant", "Vintage", "Virtual", "Warm", "Warmest", "Whipped", "Wild", "Winsome");
        List asList2 = Arrays.asList("Ambrosia", "Attack", "Avalanche", "Blast", "Bliss", "Blossom", "Blush", "Burst", "Butter", "Candy", "Carnival", "Charm", "Chiffon", "Cloud", "Comet", "Delight", "Dream", "Dust", "Fantasy", "Flame", "Flash", "Fire", "Freeze", "Frost", "Glade", "Glaze", "Gleam", "Glimmer", "Glitter", "Glow", "Grande", "Haze", "Highlight", "Ice", "Illusion", "Intrigue", "Jewel", "Jubilee", "Kiss", "Lights", "Lollypop", "Love", "Luster", "Madness", "Matte", "Mirage", "Mist", "Moon", "Muse", "Myth", "Nectar", "Nova", "Parfait", "Passion", "Pop", "Rain", "Reflection", "Rhapsody", "Romance", "Satin", "Sensation", "Silk", "Shine", "Shadow", "Shimmer", "Sky", "Spice", "Star", "Sugar", "Sunrise", "Sunset", "Sun", "Twist", "Unbound", "Velvet", "Vibrant", "Waters", "Wine", "Wink", "Wonder", "Zone");
        HashMap hashMap = new HashMap();
        hg.c.o(9306112, hashMap, "Berry", 14598550, "Brandy");
        hg.c.o(8391495, hashMap, "Cherry", 16744272, "Coral");
        hg.c.o(14372985, hashMap, "Cranberry", 14423100, "Crimson");
        hg.c.o(14725375, hashMap, "Mauve", 16761035, "Pink");
        hg.c.o(16711680, hashMap, "Red", 16711807, "Rose");
        hg.c.o(8406555, hashMap, "Russet", 16720896, "Scarlet");
        hg.c.o(15856113, hashMap, "Seashell", 16724889, "Strawberry");
        hg.c.o(16760576, hashMap, "Amber", 15438707, "Apricot");
        hg.c.o(16508850, hashMap, "Banana", 10601738, "Citrus");
        hg.c.o(11560192, hashMap, "Ginger", 16766720, "Gold");
        hg.c.o(16640272, hashMap, "Lemon", 16753920, "Orange");
        hg.c.o(16770484, hashMap, "Peach", 16739155, "Persimmon");
        hg.c.o(14996514, hashMap, "Sunflower", 15893760, "Tangerine");
        hg.c.o(16763004, hashMap, "Topaz", 16776960, "Yellow");
        hg.c.o(3688720, hashMap, "Clover", 8628829, "Cucumber");
        hg.c.o(5294200, hashMap, "Emerald", 11907932, "Olive");
        hg.c.o(65280, hashMap, "Green", 43115, "Jade");
        hg.c.o(2730887, hashMap, "Jungle", 12582656, "Lime");
        hg.c.o(776785, hashMap, "Malachite", 10026904, "Mint");
        hg.c.o(11394989, hashMap, "Moss", 3234721, "Azure");
        hg.c.o(255, hashMap, "Blue", 18347, "Cobalt");
        hg.c.o(5204422, hashMap, "Indigo", 96647, "Lagoon");
        hg.c.o(7461346, hashMap, "Aquamarine", 1182351, "Ultramarine");
        hg.c.o(128, hashMap, "Navy", 3101086, "Sapphire");
        hg.c.o(7788522, hashMap, "Sky", 32896, "Teal");
        hg.c.o(4251856, hashMap, "Turquoise", 10053324, "Amethyst");
        hg.c.o(5046581, hashMap, "Blackberry", 6373457, "Eggplant");
        hg.c.o(13148872, hashMap, "Lilac", 11894492, "Lavender");
        hg.c.o(13421823, hashMap, "Periwinkle", 8663417, "Plum");
        hg.c.o(6684825, hashMap, "Purple", 14204888, "Thistle");
        hg.c.o(14315734, hashMap, "Orchid", 2361920, "Violet");
        hg.c.o(4137225, hashMap, "Bronze", 3604994, "Chocolate");
        hg.c.o(8077056, hashMap, "Cinnamon", 3153694, "Cocoa");
        hg.c.o(7365973, hashMap, "Coffee", 7956873, "Rum");
        hg.c.o(5113350, hashMap, "Mahogany", 7875865, "Mocha");
        hg.c.o(12759680, hashMap, "Sand", 8924439, "Sienna");
        hg.c.o(7864585, hashMap, "Maple", 15787660, "Khaki");
        hg.c.o(12088115, hashMap, "Copper", 12144200, "Chestnut");
        hg.c.o(15653316, hashMap, "Almond", 16776656, "Cream");
        hg.c.o(12186367, hashMap, "Diamond", 11109127, "Honey");
        hg.c.o(16777200, hashMap, "Ivory", 15392968, "Pearl");
        hg.c.o(15725299, hashMap, "Porcelain", 13745832, "Vanilla");
        hg.c.o(16777215, hashMap, "White", 8421504, "Gray");
        hg.c.o(0, hashMap, "Black", 15266260, "Chrome");
        hg.c.o(3556687, hashMap, "Charcoal", 789277, "Ebony");
        hg.c.o(12632256, hashMap, "Silver", 16119285, "Smoke");
        hg.c.o(2499381, hashMap, "Steel", 5220413, "Apple");
        hg.c.o(8434628, hashMap, "Glacier", 16693933, "Melon");
        hg.c.o(12929932, hashMap, "Mulberry", 11126466, "Opal");
        hashMap.put(5547512, "Blue");
        org.telegram.ui.ActionBar.g6 k10 = g6Var == null ? org.telegram.ui.ActionBar.i6.B0().k(false) : g6Var;
        if (k10 == null || (i11 = k10.c) == 0) {
            i11 = AndroidUtilities.calcDrawableColor(org.telegram.ui.ActionBar.i6.s0())[0];
        }
        int red = Color.red(i11);
        int green = Color.green(i11);
        int blue = Color.blue(i11);
        int i13 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (Map.Entry entry : hashMap.entrySet()) {
            Integer num = (Integer) entry.getKey();
            int red2 = Color.red(num.intValue());
            int i14 = (red + red2) / 2;
            int i15 = red - red2;
            int green2 = green - Color.green(num.intValue());
            int blue2 = blue - Color.blue(num.intValue());
            int i16 = (green2 * 4 * green2) + ((((i14 + 512) * i15) * i15) >> 8) + ((((767 - i14) * blue2) * blue2) >> 8);
            if (i16 < i13) {
                str = (String) entry.getValue();
                i13 = i16;
            }
        }
        if (Utilities.random.nextInt() % 2 == 0) {
            sb2 = a1.g.r((String) asList.get(Utilities.random.nextInt(asList.size())), " ", str, new StringBuilder());
        } else {
            StringBuilder j3 = sc.v.j(str, " ");
            j3.append((String) asList2.get(Utilities.random.nextInt(asList2.size())));
            sb2 = j3.toString();
        }
        editTextBoldCursor.setText(sb2);
        editTextBoldCursor.setSelection(editTextBoldCursor.length());
        f1 f1Var = new f1(2, editTextBoldCursor);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.setOnShowListener(f1Var);
        n2Var.showDialog(b2Var);
        editTextBoldCursor.requestFocus();
        b2Var.d(-1).setOnClickListener(new ai.s0(n2Var, editTextBoldCursor, g6Var, h6Var, b2Var, 9));
    }

    public static void W(Activity activity, String str, int i10, int i11, int i12, Utilities.Callback callback) {
        if (activity == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.j5, false);
        int x03 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.h5, false);
        org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Ji, false);
        org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Ni, false);
        org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.E8, false);
        org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.G8, false);
        org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.i6, false);
        org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Sh, false);
        org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Oh, false);
        org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Qh, false);
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) activity, (org.telegram.ui.ActionBar.e6) null, false);
        f3Var.fixNavigationBar();
        f3Var.applyBottomPadding = false;
        s3 s3Var = new s3(activity, null);
        t3 t3Var = new t3(activity, s3Var);
        t3Var.setOrientation(0);
        t3Var.setWeightSum(1.0f);
        s3Var.setAllItemsCount(24);
        s3Var.setItemCount(5);
        s3Var.setTextColor(x02);
        s3Var.setGravity(5);
        s3Var.setTextOffset(-AndroidUtilities.dp(12.0f));
        u3 u3Var = new u3(activity, null);
        u3Var.setWrapSelectorWheel(true);
        u3Var.setAllItemsCount(60);
        u3Var.setItemCount(5);
        u3Var.setTextColor(x02);
        u3Var.setGravity(3);
        u3Var.setTextOffset(AndroidUtilities.dp(12.0f));
        final k2 k2Var = new k2(i11, i12, s3Var, u3Var, i10, t3Var);
        t3Var.addView(s3Var, w7.x5.l(0.5f, 0, 270));
        s3Var.setFormatter(new f2(3));
        final int i13 = 0;
        s3Var.setOnValueChangedListener(new sd0() { // from class: org.telegram.ui.Components.l2
            @Override // org.telegram.ui.Components.sd0
            public final void r(ud0 ud0Var, int i14) {
                switch (i13) {
                    case 0:
                        k2Var.run(Boolean.TRUE);
                        break;
                    default:
                        k2Var.run(Boolean.TRUE);
                        break;
                }
            }
        });
        t3Var.addView(u3Var, w7.x5.l(0.5f, 0, 270));
        u3Var.setFormatter(new f2(4));
        final int i14 = 1;
        u3Var.setOnValueChangedListener(new sd0() { // from class: org.telegram.ui.Components.l2
            @Override // org.telegram.ui.Components.sd0
            public final void r(ud0 ud0Var, int i142) {
                switch (i14) {
                    case 0:
                        k2Var.run(Boolean.TRUE);
                        break;
                    default:
                        k2Var.run(Boolean.TRUE);
                        break;
                }
            }
        });
        k2Var.run(Boolean.FALSE);
        v3 v3Var = new v3(activity, s3Var, u3Var);
        v3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextColor(x02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, w7.x5.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
        textView.setOnTouchListener(new bi.d(10));
        v3Var.addView(frameLayout, w7.x5.t(-1, -2, 51, 22, 0, 0, 4));
        v3Var.addView(t3Var, w7.x5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        ci.d dVar = new ci.d(activity, null, true);
        dVar.setRoundRadius(24);
        dVar.g(LocaleController.getString(R.string.Select), false, true);
        dVar.setOnClickListener(new m2(r1, 0));
        v3Var.addView(dVar, w7.x5.t(-1, 48, 0, 16, 12, 16, 12));
        f3Var.customView = v3Var;
        f3Var.show();
        f3Var.setOnDismissListener(new ei.t0(callback, s3Var, u3Var, 3));
        f3Var.setBackgroundColor(x03);
        f3Var.fixNavigationBar(x03);
        org.telegram.ui.ActionBar.f3[] f3VarArr = {f3Var};
    }

    public static org.telegram.ui.ActionBar.b2 X(Activity activity, final long j3, final long j10, String str, final Runnable runnable, org.telegram.ui.ActionBar.e6 e6Var) {
        String[] strArr;
        final String str2 = str;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
        boolean z10 = true;
        final int[] iArr = new int[1];
        if (j3 != 0) {
            int i10 = notificationsSettings.getInt(str2, 0);
            iArr[0] = i10;
            if (i10 == 3) {
                iArr[0] = 2;
            } else if (i10 == 2) {
                iArr[0] = 3;
            }
            strArr = new String[]{LocaleController.getString(R.string.VibrationDefault), LocaleController.getString(R.string.Short), LocaleController.getString(R.string.Long), LocaleController.getString(R.string.VibrationDisabled)};
        } else {
            int i11 = notificationsSettings.getInt(str2, 0);
            iArr[0] = i11;
            if (i11 == 0) {
                iArr[0] = 1;
            } else if (i11 == 1) {
                iArr[0] = 2;
            } else if (i11 == 2) {
                iArr[0] = 0;
            }
            strArr = new String[]{LocaleController.getString(R.string.VibrationDisabled), LocaleController.getString(R.string.VibrationDefault), LocaleController.getString(R.string.Short), LocaleController.getString(R.string.Long), LocaleController.getString(R.string.OnlyIfSilent)};
        }
        String[] strArr2 = strArr;
        LinearLayout e7 = org.telegram.messenger.q.e(activity, 1);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, e6Var);
        int i12 = 0;
        while (i12 < strArr2.length) {
            org.telegram.ui.Cells.l6 l6Var = new org.telegram.ui.Cells.l6(activity, e6Var);
            l6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            l6Var.setTag(Integer.valueOf(i12));
            l6Var.a(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.g7, e6Var), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.E5, e6Var));
            l6Var.b(strArr2[i12], iArr[0] == i12 ? z10 : false);
            e7.addView(l6Var);
            l6Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.e3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    iArr2[0] = intValue;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                    long j11 = j3;
                    String str3 = str2;
                    if (j11 != 0) {
                        int i13 = iArr2[0];
                        if (i13 == 0) {
                            edit.putInt(str3, 0);
                        } else if (i13 == 1) {
                            edit.putInt(str3, 1);
                        } else if (i13 == 2) {
                            edit.putInt(str3, 3);
                        } else if (i13 == 3) {
                            edit.putInt(str3, 2);
                        }
                        NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannel(j11, j10);
                    } else {
                        int i14 = iArr2[0];
                        if (i14 == 0) {
                            edit.putInt(str3, 2);
                        } else if (i14 == 1) {
                            edit.putInt(str3, 0);
                        } else if (i14 == 2) {
                            edit.putInt(str3, 1);
                        } else if (i14 == 3) {
                            edit.putInt(str3, 3);
                        } else if (i14 == 4) {
                            edit.putInt(str3, 4);
                        }
                        if (str3.equals("vibrate_channel")) {
                            NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannelGlobal(2);
                        } else if (str3.equals("vibrate_group")) {
                            NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannelGlobal(0);
                        } else if (str3.equals("vibrate_react")) {
                            NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannelGlobal(4);
                        } else {
                            NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannelGlobal(1);
                        }
                    }
                    edit.commit();
                    alertDialog$Builder.a.L0.run();
                    runnable.run();
                }
            });
            i12++;
            str2 = str;
            z10 = true;
        }
        alertDialog$Builder.a.R = LocaleController.getString(R.string.Vibrate);
        alertDialog$Builder.n(e7);
        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.a;
    }

    public static org.telegram.ui.ActionBar.b2 Y(Context context, org.telegram.ui.ActionBar.e6 e6Var, String[] strArr, int i10, String str, String str2, q0.a aVar) {
        boolean z10;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            for (String str3 : strArr) {
                if (activity.checkSelfPermission(str3) != 0 && activity.shouldShowRequestPermissionRationale(str3)) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
        alertDialog$Builder.m(i10, 72, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.L5, false), null);
        if (z10) {
            str = str2;
        }
        alertDialog$Builder.a.T = AndroidUtilities.replaceTags(str);
        alertDialog$Builder.k(LocaleController.getString(z10 ? R.string.PermissionOpenSettings : R.string.BotWebViewRequestAllow), new ca.b(z10, context, atomicBoolean, aVar, 4));
        alertDialog$Builder.h(LocaleController.getString(R.string.BotWebViewRequestDontAllow), new org.telegram.ui.o(21, atomicBoolean, aVar));
        alertDialog$Builder.a.setOnDismissListener(new ei.e0(5, atomicBoolean, aVar));
        return alertDialog$Builder.a;
    }

    public static void Z(int i10, int i11, long j3, Utilities.Callback callback) {
        a0(i10, j3, i11, callback, 0L);
    }

    public static void a(ud0 ud0Var, ud0 ud0Var2, ud0 ud0Var3) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(1375315200000L);
        int i10 = 1;
        int i11 = calendar.get(1);
        int i12 = calendar.get(2);
        int i13 = calendar.get(5);
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i14 = calendar.get(1);
        int i15 = calendar.get(2);
        int i16 = calendar.get(5);
        ud0Var3.setMaxValue(i14);
        ud0Var3.setMinValue(i11);
        int value = ud0Var3.getValue();
        ud0Var2.setMaxValue(value == i14 ? i15 : 11);
        ud0Var2.setMinValue(value == i11 ? i12 : 0);
        int value2 = ud0Var2.getValue();
        calendar.set(1, value);
        calendar.set(2, value2);
        int actualMaximum = calendar.getActualMaximum(5);
        if (value == i14 && value2 == i15) {
            actualMaximum = Math.min(i16, actualMaximum);
        }
        ud0Var.setMaxValue(actualMaximum);
        if (value == i11 && value2 == i12) {
            i10 = i13;
        }
        ud0Var.setMinValue(i10);
    }

    public static boolean a0(final int i10, final long j3, int i11, Utilities.Callback callback, long j10) {
        TLRPC.Chat chat;
        long sendPaidMessagesStars = MessagesController.getInstance(i10).getSendPaidMessagesStars(j3);
        if (sendPaidMessagesStars <= 0 && j3 > 0) {
            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i10).isUserContactBlocked(j3));
        }
        long j11 = i11 * sendPaidMessagesStars;
        yh.m5.y(i10, false).P.put(Long.valueOf(j3), Integer.valueOf(i11));
        if (j11 <= 0 || j10 == j11) {
            callback.run(Long.valueOf(j11));
            return false;
        }
        final long j12 = sendPaidMessagesStars;
        final v2 v2Var = new v2(i10, j11, j3, callback, j12, 0);
        if (j12 <= MessagesController.getInstance(i10).getMainSettings().getLong(org.telegram.ui.Cells.c1.h(j3, "ask_paid_message_", "_price"), 0L)) {
            v2Var.run();
            return true;
        }
        Activity activity = AndroidUtilities.getActivity();
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        org.telegram.ui.ActionBar.e6 dVar = (PhotoViewer.t1().R1() || (U != null && U.hasShownSheet())) ? new ai.d() : U != null ? U.getResourceProvider() : null;
        String shortName = DialogObject.getShortName(i10, j3);
        if (ChatObject.isMonoForum(i10, j3)) {
            shortName = ng.d.h(i10, j3);
        } else if (U instanceof org.telegram.ui.zn) {
            org.telegram.ui.zn znVar = (org.telegram.ui.zn) U;
            if (znVar.g4 && znVar.a() == j3 && (chat = znVar.f4) != null) {
                shortName = DialogObject.getShortName(i10, -chat.id);
            }
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i12 = (int) j12;
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessage1", i12, shortName)));
        spannableStringBuilder.append((CharSequence) " ");
        if (i11 == 1) {
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessage2One", i12)));
        } else {
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessage2Many1", (int) j11)));
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessage2Many2", i11)));
        }
        h0(activity, LocaleController.getString(R.string.MessageLockedStarsConfirmTitle), spannableStringBuilder, LocaleController.getString(R.string.MessageLockedStarsConfirmMessageDontAsk), LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessagePay", i11), new Utilities.Callback() { // from class: org.telegram.ui.Components.n0
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    int i13 = i10;
                    SharedPreferences.Editor edit = MessagesController.getInstance(i13).getMainSettings().edit();
                    long j13 = j3;
                    edit.putLong(org.telegram.ui.Cells.c1.h(j13, "ask_paid_message_", "_price"), j12).apply();
                    yh.m5.y(i13, false).O.put(Long.valueOf(j13), Long.valueOf(System.currentTimeMillis()));
                }
                AndroidUtilities.runOnUIThread(v2Var);
            }
        }, dVar, true);
        return true;
    }

    public static long b(ci.d dVar, ud0 ud0Var, ud0 ud0Var2, ud0 ud0Var3, ud0 ud0Var4) {
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i10 = 1;
        int i11 = calendar.get(1);
        int value = ((ud0Var2.getValue() - 120) / 12) + i11;
        calendar.clear();
        calendar.set(1, value);
        calendar.set(2, (ud0Var2.getValue() - 120) % 12);
        ud0Var.setMinValue(1);
        ud0Var.setMaxValue(calendar.getActualMaximum(5));
        int value2 = ud0Var.getValue();
        int value3 = ud0Var3.getValue();
        int value4 = ud0Var4.getValue();
        calendar.set(5, value2);
        calendar.set(11, value3);
        calendar.set(12, value4);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.setTimeInMillis(timeInMillis);
        if (dVar != null) {
            if (value2 == 0) {
                i10 = 0;
            } else if (i11 != value) {
                i10 = 2;
            }
            dVar.setText(LocaleController.getInstance().getFormatterScheduleSend(i10 + 9).format(timeInMillis));
        }
        return timeInMillis;
    }

    public static boolean b0(int i10, ArrayList arrayList, int i11, Utilities.Callback callback) {
        boolean z10 = false;
        if (arrayList.isEmpty()) {
            callback.run(new HashMap());
            return false;
        }
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        int i12 = 0;
        int i13 = 0;
        long j3 = 0;
        boolean z11 = true;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            Long l4 = (Long) obj;
            long j10 = j3;
            long longValue = l4.longValue();
            long sendPaidMessagesStars = MessagesController.getInstance(i10).getSendPaidMessagesStars(longValue);
            if (sendPaidMessagesStars <= 0 && longValue > 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i10).isUserContactBlocked(longValue));
            }
            hashMap.put(l4, Long.valueOf(sendPaidMessagesStars));
            long j11 = j10 + sendPaidMessagesStars;
            boolean z12 = z10;
            yh.m5.y(i10, z10).P.put(l4, Integer.valueOf(i11));
            if (sendPaidMessagesStars > 0) {
                i12++;
            }
            if (sendPaidMessagesStars > 0 && z11 && MessagesController.getInstance(i10).getMainSettings().getLong(org.telegram.ui.Cells.c1.h(longValue, "ask_paid_message_", "_price"), 0L) < sendPaidMessagesStars) {
                z11 = z12;
            }
            j3 = j11;
            z10 = z12;
        }
        boolean z13 = z10;
        long max = Math.max(1, i11) * j3;
        if (z11 || max <= 0) {
            callback.run(hashMap);
            return z13;
        }
        Activity activity = AndroidUtilities.getActivity();
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        org.telegram.ui.ActionBar.e6 dVar = (PhotoViewer.t1().R1() || (U != null && U.hasShownSheet())) ? new ai.d() : U != null ? U.getResourceProvider() : null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti1", i12)));
        spannableStringBuilder.append((CharSequence) " ");
        Object[] objArr = new Object[1];
        objArr[z13 ? 1 : 0] = LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i12) * i11);
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti2", (int) max, objArr)));
        h0(activity, LocaleController.getString(R.string.MessageLockedStarsConfirmTitle), spannableStringBuilder, LocaleController.getString(R.string.MessageLockedStarsConfirmMessageDontAsk), LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessagePay", i11), new org.telegram.ui.xq(i10, max, activity, arrayList, hashMap, callback, dVar), dVar, true);
        return true;
    }

    public static void c(ud0 ud0Var, ud0 ud0Var2, ud0 ud0Var3) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i10 = 1;
        int i11 = calendar.get(1);
        int i12 = calendar.get(2);
        int i13 = calendar.get(5);
        ud0Var3.setMinValue(i11);
        int value = ud0Var3.getValue();
        ud0Var2.setMinValue(value == i11 ? i12 : 0);
        int value2 = ud0Var2.getValue();
        if (value == i11 && value2 == i12) {
            i10 = i13;
        }
        ud0Var.setMinValue(i10);
    }

    public static boolean c0(int i10, long j3) {
        long sendPaidMessagesStars = MessagesController.getInstance(i10).getSendPaidMessagesStars(j3);
        if (sendPaidMessagesStars <= 0 && j3 > 0) {
            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i10).isUserContactBlocked(j3));
        }
        return sendPaidMessagesStars > 0 && sendPaidMessagesStars > MessagesController.getInstance(i10).getMainSettings().getLong(org.telegram.ui.Cells.c1.h(j3, "ask_paid_message_", "_price"), 0L);
    }

    public static void d(TextView textView, ud0 ud0Var, f4 f4Var, g4 g4Var) {
        int value = ud0Var.getValue();
        int value2 = f4Var.getValue();
        int value3 = g4Var.getValue();
        Calendar calendar = Calendar.getInstance();
        long currentTimeMillis = System.currentTimeMillis();
        calendar.setTimeInMillis(currentTimeMillis);
        calendar.add(6, value);
        calendar.set(11, value2);
        calendar.set(12, value3);
        calendar.set(13, 0);
        calendar.set(14, 0);
        int timeInMillis = (int) ((calendar.getTimeInMillis() - currentTimeMillis) / 1000);
        int i10 = timeInMillis / 86400;
        int i11 = (timeInMillis % 86400) / 3600;
        int i12 = (timeInMillis % 3600) / 60;
        textView.setText(LocaleController.formatString(R.string.PollCustomDeadlineClosesIn, LocaleController.formatString(R.string.PollCustomDeadlineClosesInFmt, i10 > 0 ? LocaleController.formatPluralString("Days", i10, new Object[0]) : "", i11 > 0 ? LocaleController.formatPluralString("Hours", i11, new Object[0]) : "", i12 > 0 ? LocaleController.formatPluralString("Minutes", i12, new Object[0]) : "").trim()));
    }

    public static void d0(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.b2 b2Var, org.telegram.ui.ActionBar.n2 n2Var) {
        if (n2Var.getParentActivity() == null) {
            return;
        }
        AndroidUtilities.hideKeyboard(editTextBoldCursor);
        String obj = editTextBoldCursor.getText().toString();
        int i10 = org.telegram.ui.ActionBar.i6.a;
        org.telegram.ui.ActionBar.h6 h6Var = new org.telegram.ui.ActionBar.h6();
        h6Var.b = new File(ApplicationLoader.getFilesDirFixed(), "theme" + Utilities.random.nextLong() + ".attheme").getAbsolutePath();
        h6Var.a = obj;
        org.telegram.ui.ActionBar.i6.h0 = org.telegram.ui.ActionBar.i6.Z0(org.telegram.ui.ActionBar.i6.I.i0);
        h6Var.E = UserConfig.selectedAccount;
        org.telegram.ui.ActionBar.i6.s1(h6Var, true, true, false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
        new ThemeEditorView().c(n2Var.getParentActivity(), h6Var);
        b2Var.dismiss();
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("themehint", false)) {
            return;
        }
        globalMainSettings.edit().putBoolean("themehint", true).commit();
        try {
            Toast.makeText(n2Var.getParentActivity(), LocaleController.getString(R.string.CreateNewThemeHelp), 1).show();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public static void e(int i10, TLRPC.Chat chat, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers) {
        TLRPC.User user;
        if (tL_messages_invitedUsers == null || tL_messages_invitedUsers.missing_invitees.isEmpty() || chat == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList<TLRPC.TL_missingInvitee> arrayList4 = tL_messages_invitedUsers.missing_invitees;
        int size = arrayList4.size();
        int i11 = 0;
        while (i11 < size) {
            TLRPC.TL_missingInvitee tL_missingInvitee = arrayList4.get(i11);
            i11++;
            TLRPC.TL_missingInvitee tL_missingInvitee2 = tL_missingInvitee;
            if (tL_messages_invitedUsers.updates != null) {
                for (int i12 = 0; i12 < tL_messages_invitedUsers.updates.users.size(); i12++) {
                    user = tL_messages_invitedUsers.updates.users.get(i12);
                    if (user.id == tL_missingInvitee2.user_id) {
                        break;
                    }
                }
            }
            user = null;
            if (user == null) {
                user = MessagesController.getInstance(i10).getUser(Long.valueOf(tL_missingInvitee2.user_id));
            }
            if (user != null) {
                arrayList.add(user);
                if (tL_missingInvitee2.premium_required_for_pm) {
                    arrayList2.add(Long.valueOf(user.id));
                }
                if (tL_missingInvitee2.premium_would_allow_invite) {
                    arrayList3.add(Long.valueOf(user.id));
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new ei.l3(i10, chat, arrayList, arrayList2, arrayList3), 200L);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x06f7, code lost:
    
        if (r0.equals("CHAT_SEND_ROUNDVIDEOS_FORBIDDEN") == false) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x079b, code lost:
    
        if (r0.equals("SCHEDULE_TOO_MUCH") == false) goto L455;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static org.telegram.ui.ActionBar.b2 e0(final int i10, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLObject tLObject, Object... objArr) {
        String str;
        String str2;
        final long j3;
        long peerDialogId;
        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
        if (tL_error != null && tL_error.code != 406 && (str = tL_error.text) != null) {
            if ("BALANCE_TOO_LOW".equalsIgnoreCase(str)) {
                final long o9 = yh.m5.o(tLObject);
                if (tLObject instanceof TLRPC.TL_messages_sendMessage) {
                    peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendMessage) tLObject).peer);
                } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                    peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendMultiMedia) tLObject).peer);
                } else if (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) {
                    peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendInlineBotResult) tLObject).peer);
                } else if (tLObject instanceof TLRPC.TL_messages_forwardMessages) {
                    peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_messages_forwardMessages) tLObject).to_peer);
                } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
                    peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendMedia) tLObject).peer);
                } else {
                    j3 = 0;
                    if (o9 > 0) {
                        yh.m5.y(i10, false).q(true, true, new Runnable() { // from class: org.telegram.ui.Components.q2
                            @Override // java.lang.Runnable
                            public final void run() {
                                Activity activity = AndroidUtilities.getActivity();
                                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                org.telegram.ui.ActionBar.e6 dVar = (PhotoViewer.t1().R1() || (U != null && U.hasShownSheet())) ? new ai.d() : U != null ? U.getResourceProvider() : null;
                                int i11 = i10;
                                long j10 = j3;
                                new yh.e7(activity, dVar, o9, 13, DialogObject.getShortName(i11, j10), new ai.f(21), j10).show();
                            }
                        });
                        return null;
                    }
                }
                j3 = peerDialogId;
                if (o9 > 0) {
                }
            } else {
                if (tL_error.text.equals("JOIN_GUARD_TIMEOUT")) {
                    t0(n2Var2, LocaleController.getString(R.string.GuardBotTimeoutTitle), LocaleController.getString(R.string.GuardBotTimeout), null);
                    return null;
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_sendMessage;
                if (z10 && tL_error.text.contains("PRIVACY_PREMIUM_REQUIRED")) {
                    long peerDialogId2 = DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendMessage) tLObject).peer);
                    if (peerDialogId2 >= 0) {
                        str2 = UserObject.getFirstName(MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId2)));
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId2));
                        str2 = chat != null ? chat.title : "";
                    }
                    if (n2Var2 == null) {
                        n2Var2 = LaunchActivity.R();
                    }
                    t0(n2Var2, LocaleController.getString(R.string.MessagePremiumErrorTitle), LocaleController.formatString(R.string.MessagePremiumErrorMessage, str2), null);
                    MessagesController.getInstance(i10).invalidateUserPremiumBlocked(peerDialogId2, 0);
                    return null;
                }
                boolean z11 = tLObject instanceof TLRPC.TL_messages_initHistoryImport;
                if (z11 || (tLObject instanceof TLRPC.TL_messages_checkHistoryImportPeer) || (tLObject instanceof TLRPC.TL_messages_checkHistoryImport) || (tLObject instanceof TLRPC.TL_messages_startHistoryImport)) {
                    TLRPC.InputPeer inputPeer = z11 ? ((TLRPC.TL_messages_initHistoryImport) tLObject).peer : tLObject instanceof TLRPC.TL_messages_startHistoryImport ? ((TLRPC.TL_messages_startHistoryImport) tLObject).peer : null;
                    org.telegram.ui.ActionBar.n2 R = n2Var2 == null ? LaunchActivity.R() : n2Var2;
                    if (tL_error.text.contains("USER_IS_BLOCKED")) {
                        t0(R, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportErrorUserBlocked), null);
                        return null;
                    }
                    if (tL_error.text.contains("USER_NOT_MUTUAL_CONTACT")) {
                        t0(R, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportMutualError), null);
                        return null;
                    }
                    if (tL_error.text.contains("IMPORT_PEER_TYPE_INVALID")) {
                        if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                            t0(R, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportErrorChatInvalidUser), null);
                            return null;
                        }
                        t0(R, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportErrorChatInvalidGroup), null);
                        return null;
                    }
                    if (tL_error.text.contains("CHAT_ADMIN_REQUIRED")) {
                        t0(R, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportErrorNotAdmin), null);
                        return null;
                    }
                    if (tL_error.text.startsWith("IMPORT_FORMAT")) {
                        t0(R, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportErrorFileFormatInvalid), null);
                        return null;
                    }
                    if (tL_error.text.startsWith("PEER_ID_INVALID")) {
                        t0(R, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportErrorPeerInvalid), null);
                        return null;
                    }
                    if (tL_error.text.contains("IMPORT_LANG_NOT_FOUND")) {
                        t0(R, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportErrorFileLang), null);
                        return null;
                    }
                    if (tL_error.text.contains("IMPORT_UPLOAD_FAILED")) {
                        t0(R, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportFailedToUpload), null);
                        return null;
                    }
                    if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        l0(R, tL_error.text);
                        return null;
                    }
                    String string = LocaleController.getString(R.string.ImportErrorTitle);
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.ui.Cells.c1.l(R.string.ErrorOccurred, "\n", sb2);
                    sb2.append(tL_error.text);
                    t0(R, string, sb2.toString(), null);
                } else {
                    if ((tLObject instanceof TL_account.saveSecureValue) || (tLObject instanceof TL_account.getAuthorizationForm)) {
                        org.telegram.ui.ActionBar.n2 R2 = n2Var2 == null ? LaunchActivity.R() : n2Var2;
                        if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                            t0(R2, null, LocaleController.getString(R.string.InvalidPhoneNumber), null);
                            return null;
                        }
                        if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            t0(R2, null, LocaleController.getString(R.string.FloodWait), null);
                            return null;
                        }
                        if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                            w0(R2.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                            return null;
                        }
                        StringBuilder sb3 = new StringBuilder();
                        org.telegram.ui.Cells.c1.l(R.string.ErrorOccurred, "\n", sb3);
                        sb3.append(tL_error.text);
                        t0(R2, null, sb3.toString(), null);
                        return null;
                    }
                    boolean z12 = tLObject instanceof TLRPC.TL_channels_joinChannel;
                    if (!z12 && !(tLObject instanceof TLRPC.TL_channels_editAdmin) && !(tLObject instanceof TLRPC.TL_channels_inviteToChannel) && !(tLObject instanceof TLRPC.TL_messages_addChatUser) && !(tLObject instanceof TLRPC.TL_messages_startBot) && !(tLObject instanceof TLRPC.TL_channels_editBanned) && !(tLObject instanceof TLRPC.TL_messages_editChatDefaultBannedRights) && !(tLObject instanceof TLRPC.TL_messages_editChatAdmin) && !(tLObject instanceof TLRPC.TL_messages_migrateChat) && !(tLObject instanceof TL_phone.inviteToGroupCall)) {
                        char c10 = 2;
                        if (tLObject instanceof TLRPC.TL_messages_createChat) {
                            org.telegram.ui.ActionBar.n2 R3 = n2Var2 == null ? LaunchActivity.R() : n2Var2;
                            if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                                if (R3.getParentActivity() != null) {
                                    R3.showDialog(new rg.j0(5, i10, R3.getParentActivity(), R3, null));
                                    return null;
                                }
                                R3.presentFragment(new ue1(2));
                                return null;
                            }
                            org.telegram.ui.ActionBar.n2 n2Var3 = R3;
                            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                l0(n2Var3, tL_error.text);
                                return null;
                            }
                            g0(tL_error, n2Var3, false, false, tLObject);
                            return null;
                        }
                        if (tLObject instanceof TLRPC.TL_channels_createChannel) {
                            org.telegram.ui.ActionBar.n2 R4 = n2Var2 == null ? LaunchActivity.R() : n2Var2;
                            if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                                if (R4.getParentActivity() != null) {
                                    R4.showDialog(new rg.j0(5, i10, R4.getParentActivity(), R4, null));
                                    return null;
                                }
                                R4.presentFragment(new ue1(2));
                                return null;
                            }
                            org.telegram.ui.ActionBar.n2 n2Var4 = R4;
                            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                l0(n2Var4, tL_error.text);
                                return null;
                            }
                            g0(tL_error, n2Var4, false, false, tLObject);
                            return null;
                        }
                        if (tLObject instanceof TLRPC.TL_messages_editMessage) {
                            if (!tL_error.text.equals("MESSAGE_NOT_MODIFIED")) {
                                if (n2Var2 != null) {
                                    t0(n2Var2, null, LocaleController.getString(R.string.EditMessageError), null);
                                    return null;
                                }
                                v0(null, LocaleController.getString(R.string.EditMessageError));
                                return null;
                            }
                        } else {
                            if (z10 || (tLObject instanceof TL_ephemeral.TL_sendMessage) || (tLObject instanceof TLRPC.TL_messages_sendMedia) || (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) || (tLObject instanceof TLRPC.TL_messages_forwardMessages) || (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) || (tLObject instanceof TLRPC.TL_messages_sendScheduledMessages)) {
                                long peerDialogId3 = z10 ? DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendMessage) tLObject).peer) : tLObject instanceof TLRPC.TL_messages_sendMedia ? DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendMedia) tLObject).peer) : tLObject instanceof TL_ephemeral.TL_sendMessage ? DialogObject.getPeerDialogId(((TL_ephemeral.TL_sendMessage) tLObject).peer) : tLObject instanceof TLRPC.TL_messages_sendInlineBotResult ? DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendInlineBotResult) tLObject).peer) : tLObject instanceof TLRPC.TL_messages_forwardMessages ? DialogObject.getPeerDialogId(((TLRPC.TL_messages_forwardMessages) tLObject).to_peer) : tLObject instanceof TLRPC.TL_messages_sendMultiMedia ? DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendMultiMedia) tLObject).peer) : tLObject instanceof TLRPC.TL_messages_sendScheduledMessages ? DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendScheduledMessages) tLObject).peer) : 0L;
                                String str3 = tL_error.text;
                                char c11 = 5;
                                if (str3 == null || !str3.startsWith("CHAT_SEND_") || !tL_error.text.endsWith("FORBIDDEN")) {
                                    String str4 = tL_error.text;
                                    str4.getClass();
                                    switch (str4.hashCode()) {
                                        case -1809401834:
                                            if (str4.equals("USER_BANNED_IN_CHANNEL")) {
                                                c10 = 0;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -454039871:
                                            if (str4.equals("PEER_FLOOD")) {
                                                c10 = 1;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1169786080:
                                            break;
                                        default:
                                            c10 = 65535;
                                            break;
                                    }
                                    switch (c10) {
                                        case 0:
                                            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 5);
                                            break;
                                        case 1:
                                            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 0);
                                            break;
                                        case 2:
                                            v0(n2Var2, LocaleController.getString(R.string.MessageScheduledLimitReached));
                                            break;
                                    }
                                    return null;
                                }
                                String str5 = tL_error.text;
                                TLRPC.Chat chat2 = peerDialogId3 < 0 ? MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId3)) : null;
                                String str6 = tL_error.text;
                                str6.getClass();
                                switch (str6.hashCode()) {
                                    case -1813346101:
                                        if (str6.equals("CHAT_SEND_VOICES_FORBIDDEN")) {
                                            c11 = 0;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case -1755013292:
                                        if (str6.equals("CHAT_SEND_PLAIN_FORBIDDEN")) {
                                            c11 = 1;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case -1463451737:
                                        if (str6.equals("CHAT_SEND_AUDIOS_FORBIDDEN")) {
                                            c11 = 2;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case -446466679:
                                        if (str6.equals("CHAT_SEND_POLL_FORBIDDEN")) {
                                            c11 = 3;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case 469767429:
                                        if (str6.equals("CHAT_SEND_DOCS_FORBIDDEN")) {
                                            c11 = 4;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case 788688112:
                                        break;
                                    case 963091938:
                                        if (str6.equals("CHAT_SEND_VIDEOS_FORBIDDEN")) {
                                            c11 = 6;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case 1100757753:
                                        if (str6.equals("CHAT_SEND_GIFS_FORBIDDEN")) {
                                            c11 = 7;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case 1146489803:
                                        if (str6.equals("CHAT_SEND_PHOTOS_FORBIDDEN")) {
                                            c11 = '\b';
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case 1701620704:
                                        if (str6.equals("CHAT_SEND_STICKERS_FORBIDDEN")) {
                                            c11 = '\t';
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    default:
                                        c11 = 65535;
                                        break;
                                }
                                switch (c11) {
                                    case 0:
                                        str5 = ChatObject.getRestrictedErrorText(chat2, 20);
                                        break;
                                    case 1:
                                        str5 = ChatObject.getRestrictedErrorText(chat2, 22);
                                        break;
                                    case 2:
                                        str5 = ChatObject.getRestrictedErrorText(chat2, 18);
                                        break;
                                    case 3:
                                        str5 = ChatObject.getRestrictedErrorText(chat2, 10);
                                        break;
                                    case 4:
                                        str5 = ChatObject.getRestrictedErrorText(chat2, 19);
                                        break;
                                    case 5:
                                        str5 = ChatObject.getRestrictedErrorText(chat2, 21);
                                        break;
                                    case 6:
                                        str5 = ChatObject.getRestrictedErrorText(chat2, 17);
                                        break;
                                    case 7:
                                        str5 = ChatObject.getRestrictedErrorText(chat2, 23);
                                        break;
                                    case '\b':
                                        str5 = ChatObject.getRestrictedErrorText(chat2, 16);
                                        break;
                                    case '\t':
                                        str5 = ChatObject.getRestrictedErrorText(chat2, 8);
                                        break;
                                }
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, str5);
                                return null;
                            }
                            if (tLObject instanceof TLRPC.TL_messages_importChatInvite) {
                                org.telegram.ui.ActionBar.n2 R5 = n2Var2 == null ? LaunchActivity.R() : n2Var2;
                                if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                    t0(R5, null, LocaleController.getString(R.string.FloodWait), null);
                                    return null;
                                }
                                if (tL_error.text.equals("USERS_TOO_MUCH")) {
                                    t0(R5, null, LocaleController.getString(R.string.JoinToGroupErrorFull), null);
                                    return null;
                                }
                                if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                                    if (R5.getParentActivity() != null) {
                                        R5.showDialog(new rg.j0(5, i10, R5.getParentActivity(), R5, null));
                                        return null;
                                    }
                                    R5.presentFragment(new ue1(0));
                                    return null;
                                }
                                if (tL_error.text.equals("INVITE_HASH_EXPIRED")) {
                                    t0(R5, LocaleController.getString(R.string.ExpiredLink), LocaleController.getString(R.string.InviteExpired), null);
                                    return null;
                                }
                                t0(R5, null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
                                return null;
                            }
                            if (tLObject instanceof TLRPC.TL_messages_getAttachedStickers) {
                                if (n2Var2 != null && n2Var2.getParentActivity() != null) {
                                    Activity parentActivity = n2Var2.getParentActivity();
                                    StringBuilder sb4 = new StringBuilder();
                                    org.telegram.ui.Cells.c1.l(R.string.ErrorOccurred, "\n", sb4);
                                    sb4.append(tL_error.text);
                                    Toast.makeText(parentActivity, sb4.toString(), 0).show();
                                    return null;
                                }
                            } else {
                                if ((tLObject instanceof TL_account.confirmPhone) || (tLObject instanceof TL_account.verifyPhone) || (tLObject instanceof TL_account.verifyEmail)) {
                                    return (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID") || tL_error.text.contains("CODE_INVALID") || tL_error.text.contains("CODE_EMPTY")) ? t0(n2Var2, null, LocaleController.getString(R.string.InvalidCode), null) : (tL_error.text.contains("PHONE_CODE_EXPIRED") || tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) ? t0(n2Var2, null, LocaleController.getString(R.string.CodeExpired), null) : tL_error.text.startsWith("FLOOD_WAIT") ? t0(n2Var2, null, LocaleController.getString(R.string.FloodWait), null) : t0(n2Var2, null, tL_error.text, null);
                                }
                                if (tLObject instanceof TLRPC.TL_auth_resendCode) {
                                    if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                                        return t0(n2Var2, null, LocaleController.getString(R.string.InvalidPhoneNumber), null);
                                    }
                                    if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                                        return t0(n2Var2, null, LocaleController.getString(R.string.InvalidCode), null);
                                    }
                                    if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                        return t0(n2Var2, null, LocaleController.getString(R.string.CodeExpired), null);
                                    }
                                    if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                        return t0(n2Var2, null, LocaleController.getString(R.string.FloodWait), null);
                                    }
                                    if (tL_error.code != -1000) {
                                        StringBuilder sb5 = new StringBuilder();
                                        org.telegram.ui.Cells.c1.l(R.string.ErrorOccurred, "\n", sb5);
                                        sb5.append(tL_error.text);
                                        return t0(n2Var2, null, sb5.toString(), null);
                                    }
                                } else {
                                    if (tLObject instanceof TL_account.sendConfirmPhoneCode) {
                                        return tL_error.code == 400 ? t0(n2Var2, null, LocaleController.getString(R.string.CancelLinkExpired), null) : tL_error.text.startsWith("FLOOD_WAIT") ? t0(n2Var2, null, LocaleController.getString(R.string.FloodWait), null) : t0(n2Var2, null, LocaleController.getString(R.string.ErrorOccurred), null);
                                    }
                                    if (tLObject instanceof TL_account.changePhone) {
                                        if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                                            t0(n2Var2, null, LocaleController.getString(R.string.InvalidPhoneNumber), null);
                                            return null;
                                        }
                                        if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                                            t0(n2Var2, null, LocaleController.getString(R.string.InvalidCode), null);
                                            return null;
                                        }
                                        if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                            t0(n2Var2, null, LocaleController.getString(R.string.CodeExpired), null);
                                            return null;
                                        }
                                        if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                            t0(n2Var2, null, LocaleController.getString(R.string.FloodWait), null);
                                            return null;
                                        }
                                        if (tL_error.text.contains("FRESH_CHANGE_PHONE_FORBIDDEN")) {
                                            t0(n2Var2, LocaleController.getString(R.string.FreshChangePhoneForbiddenTitle), LocaleController.getString(R.string.FreshChangePhoneForbidden), null);
                                            return null;
                                        }
                                        t0(n2Var2, null, tL_error.text, null);
                                        return null;
                                    }
                                    if (tLObject instanceof TL_account.sendChangePhoneCode) {
                                        if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                                            org.telegram.ui.wg0.m1(n2Var2, (String) objArr[0], null, false);
                                            return null;
                                        }
                                        if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                                            t0(n2Var2, null, LocaleController.getString(R.string.InvalidCode), null);
                                            return null;
                                        }
                                        if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                            t0(n2Var2, null, LocaleController.getString(R.string.CodeExpired), null);
                                            return null;
                                        }
                                        if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                            t0(n2Var2, null, LocaleController.getString(R.string.FloodWait), null);
                                            return null;
                                        }
                                        if (tL_error.text.startsWith("PHONE_NUMBER_OCCUPIED")) {
                                            t0(n2Var2, null, LocaleController.formatString("ChangePhoneNumberOccupied", R.string.ChangePhoneNumberOccupied, objArr[0]), null);
                                            return null;
                                        }
                                        if (tL_error.text.startsWith("PHONE_NUMBER_BANNED")) {
                                            org.telegram.ui.wg0.m1(n2Var2, (String) objArr[0], null, true);
                                            return null;
                                        }
                                        t0(n2Var2, null, LocaleController.getString(R.string.ErrorOccurred), null);
                                        return null;
                                    }
                                    if (tLObject instanceof TL_account.updateUsername) {
                                        String str7 = tL_error.text;
                                        str7.getClass();
                                        if (str7.equals("USERNAME_INVALID")) {
                                            t0(n2Var2, null, LocaleController.getString(R.string.UsernameInvalid), null);
                                            return null;
                                        }
                                        if (str7.equals("USERNAME_OCCUPIED")) {
                                            t0(n2Var2, null, LocaleController.getString(R.string.UsernameInUse), null);
                                            return null;
                                        }
                                        t0(n2Var2, null, LocaleController.getString(R.string.ErrorOccurred), null);
                                        return null;
                                    }
                                    if (tLObject instanceof TLRPC.TL_contacts_importContacts) {
                                        if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                            t0(n2Var2, null, LocaleController.getString(R.string.FloodWait), null);
                                            return null;
                                        }
                                        StringBuilder sb6 = new StringBuilder();
                                        org.telegram.ui.Cells.c1.l(R.string.ErrorOccurred, "\n", sb6);
                                        sb6.append(tL_error.text);
                                        t0(n2Var2, null, sb6.toString(), null);
                                        return null;
                                    }
                                    if ((tLObject instanceof TL_account.getPassword) || (tLObject instanceof TL_account.getTmpPassword)) {
                                        if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                                            v0(n2Var2, tL_error.text);
                                            return null;
                                        }
                                        int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                                        v0(n2Var2, LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                                        return null;
                                    }
                                    if (tLObject instanceof TLRPC.TL_payments_sendPaymentForm) {
                                        String str8 = tL_error.text;
                                        str8.getClass();
                                        if (str8.equals("BOT_PRECHECKOUT_FAILED")) {
                                            v0(n2Var2, LocaleController.getString(R.string.PaymentPrecheckoutFailed));
                                            return null;
                                        }
                                        if (str8.equals("PAYMENT_FAILED")) {
                                            v0(n2Var2, LocaleController.getString(R.string.PaymentFailed));
                                            return null;
                                        }
                                        v0(n2Var2, tL_error.text);
                                        return null;
                                    }
                                    if (tLObject instanceof TLRPC.TL_payments_validateRequestedInfo) {
                                        String str9 = tL_error.text;
                                        str9.getClass();
                                        if (str9.equals("SHIPPING_NOT_AVAILABLE")) {
                                            v0(n2Var2, LocaleController.getString(R.string.PaymentNoShippingMethod));
                                            return null;
                                        }
                                        v0(n2Var2, tL_error.text);
                                        return null;
                                    }
                                    if (tLObject instanceof TLRPC.TL_payments_assignPlayMarketTransaction) {
                                        StringBuilder sb7 = new StringBuilder();
                                        org.telegram.ui.Cells.c1.l(R.string.PaymentConfirmationError, "\n", sb7);
                                        sb7.append(tL_error.text);
                                        t0(n2Var2, null, sb7.toString(), null);
                                        return null;
                                    }
                                }
                            }
                        }
                    } else {
                        if (n2Var2 != null && tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                            if (n2Var2.getParentActivity() != null) {
                                n2Var2.showDialog(new rg.j0(5, i10, n2Var2.getParentActivity(), n2Var2, null));
                                return null;
                            }
                            if (z12 || (tLObject instanceof TLRPC.TL_channels_inviteToChannel)) {
                                n2Var2.presentFragment(new ue1(0));
                                return null;
                            }
                            n2Var2.presentFragment(new ue1(1));
                            return null;
                        }
                        if (n2Var2 != null) {
                            g0(tL_error, n2Var2, objArr.length > 0 ? ((Boolean) objArr[0]).booleanValue() : false, objArr.length > 1 ? ((Boolean) objArr[1]).booleanValue() : false, tLObject);
                            return null;
                        }
                        if (tL_error.text.equals("PEER_FLOOD")) {
                            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 1);
                            return null;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static boolean f(TextView textView, TextView textView2, long j3, long j10, int i10, ud0 ud0Var, ud0 ud0Var2, ud0 ud0Var3) {
        long j11;
        int i11;
        long j12;
        int i12;
        int i13;
        int i14;
        boolean z10;
        boolean z11;
        String formatPluralString;
        int value = ud0Var.getValue();
        int value2 = ud0Var2.getValue();
        int value3 = ud0Var3.getValue();
        Calendar calendar = Calendar.getInstance();
        long currentTimeMillis = System.currentTimeMillis();
        calendar.setTimeInMillis(currentTimeMillis);
        int i15 = calendar.get(1);
        calendar.get(6);
        if (j10 > 0) {
            i11 = i15;
            calendar.setTimeInMillis((j10 * 1000) + currentTimeMillis);
            calendar.set(11, 23);
            calendar.set(12, 59);
            calendar.set(13, 59);
            calendar.set(14, 0);
            j11 = currentTimeMillis;
            i12 = (int) ChronoUnit.DAYS.between(Instant.ofEpochMilli(currentTimeMillis).atZone(ZoneId.systemDefault()).f(), Instant.ofEpochMilli(calendar.getTimeInMillis()).atZone(ZoneId.systemDefault()).f());
            j12 = calendar.getTimeInMillis();
            i13 = 23;
            i14 = 59;
        } else {
            j11 = currentTimeMillis;
            i11 = i15;
            j12 = j10;
            i12 = 0;
            i13 = 0;
            i14 = 0;
        }
        int i16 = i14;
        long millis = j3 > 0 ? TimeUnit.SECONDS.toMillis(j3) : 60000L;
        long j13 = j11 + millis;
        calendar.setTimeInMillis(j13);
        int i17 = calendar.get(11);
        int i18 = calendar.get(12);
        long j14 = j12;
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(6, value);
        calendar.set(11, value2);
        calendar.set(12, value3);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        ud0Var.setMinValue(0);
        if (j14 > 0) {
            ud0Var.setMaxValue(i12);
        }
        int value4 = ud0Var.getValue();
        ud0Var2.setMinValue(value4 == 0 ? i17 : 0);
        if (j14 > 0) {
            ud0Var2.setMaxValue(value4 == i12 ? i13 : 23);
        }
        int value5 = ud0Var2.getValue();
        ud0Var3.setMinValue((value4 == 0 && value5 == i17) ? i18 : 0);
        if (j14 > 0) {
            ud0Var3.setMaxValue((value4 == i12 && value5 == i13) ? i16 : 59);
        }
        int value6 = ud0Var3.getValue();
        if (timeInMillis <= j13) {
            calendar.setTimeInMillis(j13);
        } else if (j14 > 0 && timeInMillis > j14) {
            calendar.setTimeInMillis(j14);
        }
        int i19 = calendar.get(1);
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(6, value4);
        calendar.set(11, value5);
        calendar.set(12, value6);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis2 = calendar.getTimeInMillis();
        if (textView != null) {
            textView.setText(LocaleController.getInstance().getFormatterScheduleSend((i10 * 3) + (value4 == 0 ? 0 : i11 == i19 ? 1 : 2)).format(timeInMillis2));
        }
        if (textView2 != null) {
            int i20 = (int) ((timeInMillis2 - j11) / 1000);
            if (i20 > 86400) {
                z11 = false;
                formatPluralString = LocaleController.formatPluralString("DaysSchedule", Math.round(i20 / 86400.0f), new Object[0]);
            } else {
                z11 = false;
                z11 = false;
                z11 = false;
                formatPluralString = i20 >= 3600 ? LocaleController.formatPluralString("HoursSchedule", Math.round(i20 / 3600.0f), new Object[0]) : i20 >= 60 ? LocaleController.formatPluralString("MinutesSchedule", Math.round(i20 / 60.0f), new Object[0]) : LocaleController.formatPluralString("SecondsSchedule", i20, new Object[0]);
            }
            if (textView2.getTag() != null) {
                int i21 = R.string.VoipChannelScheduleInfo;
                z10 = true;
                Object[] objArr = new Object[1];
                objArr[z11 ? 1 : 0] = formatPluralString;
                textView2.setText(LocaleController.formatString("VoipChannelScheduleInfo", i21, objArr));
            } else {
                z10 = true;
                int i22 = R.string.VoipGroupScheduleInfo;
                Object[] objArr2 = new Object[1];
                objArr2[z11 ? 1 : 0] = formatPluralString;
                textView2.setText(LocaleController.formatString("VoipGroupScheduleInfo", i22, objArr2));
            }
        } else {
            z10 = true;
            z11 = false;
        }
        return timeInMillis - j11 > millis ? z10 : z11;
    }

    public static void f0(Context context, org.telegram.ui.ActionBar.e6 e6Var, String str, TLRPC.WebPage webPage, final Utilities.Callback callback, jn jnVar) {
        Activity findActivity = AndroidUtilities.findActivity(context);
        final View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        final org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        int i10 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
        String string = LocaleController.getString(R.string.PollV2AddLinkTitle);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.R = string;
        b2Var.T = LocaleController.getString(R.string.PollV2AddLinkMessage);
        final h4 h4Var = new h4(context);
        h4Var.setTextSize(1, 16.0f);
        int i11 = org.telegram.ui.ActionBar.i6.j5;
        h4Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        h4Var.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Xh, e6Var));
        h4Var.setHint(LocaleController.getString(R.string.PollV2AddLinkUrlHint));
        h4Var.setInputType(17);
        h4Var.setImeOptions(6);
        h4Var.setMaxLines(10);
        h4Var.setSingleLine(false);
        h4Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f));
        h4Var.setCursorWidth(1.5f);
        h4Var.setCursorColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.q6, e6Var));
        if (str != null) {
            h4Var.setText(str);
            h4Var.setSelection(str.length());
        }
        h4Var.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.Components.i2
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i12, KeyEvent keyEvent) {
                if (i12 != 6) {
                    return false;
                }
                h4 h4Var2 = h4.this;
                String trim = h4Var2.getText().toString().trim();
                if (!(TextUtils.isEmpty(trim) ? false : g5.a.matcher(trim.trim()).matches())) {
                    AndroidUtilities.shakeView(h4Var2);
                    return true;
                }
                callback.run(trim);
                org.telegram.ui.ActionBar.b2 b2Var2 = b2VarArr[0];
                if (b2Var2 != null) {
                    b2Var2.dismiss();
                }
                View view = currentFocus;
                if (view != null) {
                    view.requestFocus();
                }
                return true;
            }
        });
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
        gradientDrawable.setColor(org.telegram.ui.ActionBar.i6.m1(0.06f, org.telegram.ui.ActionBar.i6.w0(i11, e6Var)));
        h4Var.setBackground(gradientDrawable);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(h4Var, w7.x5.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
        int i12 = w91.f;
        if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
            w91 w91Var = new w91(context, e6Var);
            w91Var.setWebPage(webPage);
            linearLayout.addView(w91Var, w7.x5.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
        }
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        b2Var.a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
        alertDialog$Builder.k(LocaleController.getString(R.string.Done), new org.telegram.ui.o(25, h4Var, callback));
        int i13 = 2;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new f2(i13));
        if (jnVar != null) {
            alertDialog$Builder.i(LocaleController.getString(R.string.Delete), new z0(4, jnVar));
        }
        b2VarArr[0] = b2Var;
        b2Var.h0 = false;
        b2Var.setOnDismissListener(new b1(h4Var, i13));
        b2VarArr[0].setOnShowListener(new j2(i10, h4Var));
        b2VarArr[0].show();
        TextView textView = (TextView) b2VarArr[0].d(-3);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.q7, false));
        }
    }

    public static boolean g(Context context, int i10, long j3, boolean z10) {
        TLRPC.Chat chat;
        if (!DialogObject.isChatDialog(j3) || (chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3))) == null || !chat.slowmode_enabled || ChatObject.hasAdminRights(chat)) {
            return false;
        }
        if (!z10) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(chat.id);
            if (chatFull == null) {
                chatFull = MessagesStorage.getInstance(i10).loadChatInfo(chat.id, ChatObject.isChannel(chat), new CountDownLatch(1), false, false);
            }
            if (chatFull != null && chatFull.slowmode_next_send_date >= ConnectionsManager.getInstance(i10).getCurrentTime()) {
                z10 = true;
            }
        }
        if (!z10) {
            return false;
        }
        M(context, chat.title, LocaleController.getString(R.string.SlowmodeSendError)).o();
        return true;
    }

    public static void g0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, boolean z11, TLObject tLObject) {
        AlertDialog$Builder alertDialog$Builder;
        org.telegram.ui.ActionBar.b2 b2Var;
        int i10;
        if (tL_error == null || tL_error.code == 406 || tL_error.text == null || n2Var == null || n2Var.getParentActivity() == null) {
            return;
        }
        alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        b2Var = alertDialog$Builder.a;
        b2Var.R = string;
        String str = tL_error.text;
        str.getClass();
        i10 = 0;
        switch (str) {
            case "CHANNELS_ADMIN_LOCATED_TOO_MUCH":
                b2Var.T = LocaleController.getString(R.string.LocatedChannelsTooMuch);
                break;
            case "CHANNELS_ADMIN_PUBLIC_TOO_MUCH":
                b2Var.T = LocaleController.getString(R.string.PublicChannelsTooMuch);
                break;
            case "USERS_TOO_FEW":
                b2Var.T = LocaleController.getString(R.string.CreateGroupError);
                break;
            case "USER_BLOCKED":
            case "USER_BOT":
            case "USER_ID_INVALID":
                if (!z10) {
                    b2Var.T = LocaleController.getString(R.string.GroupUserCantAdd);
                    break;
                } else {
                    b2Var.T = LocaleController.getString(R.string.ChannelUserCantAdd);
                    break;
                }
            case "USER_RESTRICTED":
                b2Var.T = LocaleController.getString(R.string.UserRestricted);
                break;
            case "PEER_FLOOD":
                b2Var.T = LocaleController.getString(R.string.NobodyLikesSpam2);
                alertDialog$Builder.h(LocaleController.getString(R.string.MoreInfo), new s2(i10, n2Var));
                break;
            case "BOTS_TOO_MUCH":
                if (!z10) {
                    b2Var.T = LocaleController.getString(R.string.GroupUserCantBot);
                    break;
                } else {
                    b2Var.T = LocaleController.getString(R.string.ChannelUserCantBot);
                    break;
                }
            case "USER_KICKED":
            case "CHAT_ADMIN_BAN_REQUIRED":
                if (!(tLObject instanceof TLRPC.TL_channels_inviteToChannel)) {
                    b2Var.T = LocaleController.getString(R.string.AddAdminErrorBlacklisted);
                    break;
                } else {
                    b2Var.T = LocaleController.getString(R.string.AddUserErrorBlacklisted);
                    break;
                }
            case "YOU_BLOCKED_USER":
                b2Var.T = LocaleController.getString(R.string.YouBlockedUser);
                break;
            case "USER_ADMIN_INVALID":
                b2Var.T = LocaleController.getString(R.string.AddBannedErrorAdmin);
                break;
            case "USERS_TOO_MUCH":
                if (!z10) {
                    b2Var.T = LocaleController.getString(R.string.GroupUserAddLimit);
                    break;
                } else {
                    b2Var.T = LocaleController.getString(R.string.ChannelUserAddLimit);
                    break;
                }
            case "ADMINS_TOO_MUCH":
                if (!z10) {
                    b2Var.T = LocaleController.getString(R.string.GroupUserCantAdmin);
                    break;
                } else {
                    b2Var.T = LocaleController.getString(R.string.ChannelUserCantAdmin);
                    break;
                }
            case "CHANNELS_TOO_MUCH":
                b2Var.R = LocaleController.getString(R.string.ChannelTooMuchTitle);
                if (!(tLObject instanceof TLRPC.TL_channels_createChannel)) {
                    b2Var.T = LocaleController.getString(R.string.ChannelTooMuchJoin);
                    break;
                } else {
                    b2Var.T = LocaleController.getString(R.string.ChannelTooMuch);
                    break;
                }
            case "USER_CHANNELS_TOO_MUCH":
                b2Var.R = LocaleController.getString(R.string.ChannelTooMuchTitle);
                b2Var.T = LocaleController.getString(R.string.UserChannelTooMuchJoin);
                break;
            case "USER_NOT_MUTUAL_CONTACT":
                if (!z10) {
                    b2Var.T = LocaleController.getString(R.string.GroupUserLeftError);
                    break;
                } else {
                    b2Var.T = LocaleController.getString(R.string.ChannelUserLeftError);
                    break;
                }
            case "CHAT_ADMIN_INVITE_REQUIRED":
                b2Var.T = LocaleController.getString(R.string.AddAdminErrorNotAMember);
                break;
            case "USER_PRIVACY_RESTRICTED":
                if (!z11) {
                    if (!z10) {
                        b2Var.T = LocaleController.getString(R.string.InviteToGroupError);
                        break;
                    } else {
                        b2Var.T = LocaleController.getString(R.string.InviteToChannelError);
                        break;
                    }
                } else {
                    b2Var.T = LocaleController.getString(R.string.InviteToCommunityError);
                    break;
                }
            case "USER_ALREADY_PARTICIPANT":
                b2Var.R = LocaleController.getString(R.string.VoipGroupVoiceChat);
                b2Var.T = LocaleController.getString(R.string.VoipGroupInviteAlreadyParticipant);
                break;
            default:
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c1.l(R.string.ErrorOccurred, "\n", sb2);
                sb2.append(tL_error.text);
                b2Var.T = sb2.toString();
                break;
        }
        org.telegram.messenger.q.p(R.string.OK, alertDialog$Builder, null);
    }

    public static org.telegram.ui.ActionBar.b2 h(Activity activity, d5 d5Var) {
        if (UserConfig.getActivatedAccountsCount() < 2) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        org.telegram.ui.ActionBar.q1 q1Var = alertDialog$Builder.a.L0;
        org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        LinearLayout e7 = org.telegram.messenger.q.e(activity, 1);
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).getCurrentUser() != null) {
                org.telegram.ui.Cells.k kVar = new org.telegram.ui.Cells.k(activity, false);
                kVar.f = i10;
                TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
                j9 j9Var = kVar.e;
                j9Var.m(i10, currentUser);
                kVar.a.l(ContactsController.formatName(currentUser.first_name, currentUser.last_name), false);
                y9 y9Var = kVar.c;
                y9Var.getImageReceiver().setCurrentAccount(i10);
                y9Var.e(currentUser, j9Var);
                kVar.d.setVisibility(4);
                kVar.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                kVar.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.L0(false));
                e7.addView(kVar, w7.x5.n(-1, 50));
                kVar.setOnClickListener(new ai.d0(b2VarArr, q1Var, d5Var, 13));
            }
        }
        alertDialog$Builder.a.R = LocaleController.getString(R.string.SelectAccount);
        alertDialog$Builder.n(e7);
        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2VarArr[0] = b2Var;
        return b2Var;
    }

    public static org.telegram.ui.ActionBar.b2 h0(Activity activity, String str, CharSequence charSequence, CharSequence charSequence2, String str2, Utilities.Callback callback, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        if (activity == null) {
            callback.run(Boolean.FALSE);
            return null;
        }
        int i10 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, e6Var);
        org.telegram.ui.Cells.a2[] a2VarArr = new org.telegram.ui.Cells.a2[1];
        boolean[] zArr = {false};
        b5 b5Var = new b5(activity);
        NotificationCenter.listenEmojiLoading(b5Var);
        b5Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.j5, e6Var));
        b5Var.setTextSize(1, 16.0f);
        int i11 = 5;
        b5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        b5Var.setText(charSequence);
        c5 c5Var = new c5(activity, a2VarArr);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.G = 6;
        alertDialog$Builder.n(c5Var);
        TextView textView = new TextView(activity);
        org.telegram.ui.Cells.c1.n(org.telegram.ui.ActionBar.i6.E8, e6Var, textView, 1, 20.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(str);
        c5Var.addView(textView, w7.x5.a(-2.0f, 24.0f, 8.0f, 24.0f, 0.0f, -1, (LocaleController.isRTL ? 5 : 3) | 48));
        c5Var.addView(b5Var, w7.x5.a(-2.0f, 24.0f, 48.0f, 24.0f, 6.0f, -2, (LocaleController.isRTL ? 5 : 3) | 48));
        if (!TextUtils.isEmpty(charSequence2)) {
            org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(activity, 1, e6Var);
            a2VarArr[0] = a2Var;
            a2Var.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.i6, e6Var), 7, AndroidUtilities.dp(12.0f)));
            a2VarArr[0].setMultiline(true);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a2VarArr[0].getCheckBoxView().getLayoutParams();
            layoutParams.topMargin = 0;
            layoutParams.gravity = (LocaleController.isRTL ? 5 : 3) | 16;
            a2VarArr[0].getCheckBoxView().setLayoutParams(layoutParams);
            a2VarArr[0].e(charSequence2, "", false, false, false);
            a2VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(4.0f) : 0, AndroidUtilities.dp(12.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f));
            c5Var.addView(a2VarArr[0], w7.x5.a(-2.0f, 8.0f, 0.0f, 8.0f, 0.0f, -1, 83));
            a2VarArr[0].setOnClickListener(new t0(i11, zArr));
        }
        alertDialog$Builder.k(str2, new d3(i10, callback, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        if (z10) {
            b2Var.X0 = true;
        }
        b2Var.show();
        return b2Var;
    }

    public static org.telegram.ui.ActionBar.b2 i(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.ApkRestricted);
        alertDialog$Builder.m(R.raw.permission_request_apk, 72, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.L5, false), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new j0(context, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
        return alertDialog$Builder.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void i0(org.telegram.ui.ActionBar.n2 n2Var, long j3, final TLRPC.User user, final TLRPC.Chat chat, final TLRPC.EncryptedChat encryptedChat, final boolean z10, TLRPC.ChatFull chatFull, final MessagesStorage.IntCallback intCallback, org.telegram.ui.ActionBar.e6 e6Var) {
        long j10;
        boolean z11;
        String string;
        final org.telegram.ui.Cells.a2[] a2VarArr;
        TextView textView;
        if (n2Var.getParentActivity() == null) {
            return;
        }
        final AccountInstance accountInstance = n2Var.getAccountInstance();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity(), 0, e6Var);
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(n2Var.getCurrentAccount());
        int i10 = 1;
        if (encryptedChat == null) {
            j10 = j3;
            if (!org.telegram.messenger.q.w("dialog_bar_report", j10, notificationsSettings, false)) {
                z11 = false;
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                if (user == null) {
                    b2Var.R = LocaleController.formatString("BlockUserTitle", R.string.BlockUserTitle, UserObject.getFirstName(user));
                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserAlert", R.string.BlockUserAlert, UserObject.getFirstName(user)));
                    string = LocaleController.getString(R.string.BlockContact);
                    org.telegram.ui.Cells.a2[] a2VarArr2 = new org.telegram.ui.Cells.a2[2];
                    LinearLayout linearLayout = new LinearLayout(n2Var.getParentActivity());
                    linearLayout.setOrientation(1);
                    int i11 = 0;
                    for (int i12 = 2; i11 < i12; i12 = 2) {
                        if (i11 != 0 || z11) {
                            org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(n2Var.getParentActivity(), i10, e6Var);
                            a2VarArr2[i11] = a2Var;
                            a2Var.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.L0(false));
                            a2VarArr2[i11].setTag(Integer.valueOf(i11));
                            if (i11 == 0) {
                                a2VarArr2[i11].e(LocaleController.getString(R.string.DeleteReportSpam), "", true, false, false);
                            } else {
                                a2VarArr2[i11].e(LocaleController.formatString("DeleteThisChat", R.string.DeleteThisChat, new Object[0]), "", true, false, false);
                            }
                            a2VarArr2[i11].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                            linearLayout.addView(a2VarArr2[i11], w7.x5.n(-1, -2));
                            a2VarArr2[i11].setOnClickListener(new c1(a2VarArr2, 1));
                        }
                        i11++;
                        i10 = 1;
                    }
                    alertDialog$Builder.n(linearLayout);
                    a2VarArr = a2VarArr2;
                } else {
                    if (chat == null || !z10) {
                        b2Var.R = LocaleController.getString(R.string.ReportSpamTitle);
                        if (!ChatObject.isChannel(chat) || chat.megagroup) {
                            b2Var.T = LocaleController.getString(R.string.ReportSpamAlertGroup);
                        } else {
                            b2Var.T = LocaleController.getString(R.string.ReportSpamAlertChannel);
                        }
                    } else {
                        b2Var.R = LocaleController.getString(R.string.ReportUnrelatedGroup);
                        if (chatFull != null) {
                            TLRPC.ChannelLocation channelLocation = chatFull.location;
                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("ReportUnrelatedGroupText", R.string.ReportUnrelatedGroupText, ((TLRPC.TL_channelLocation) channelLocation).address));
                            }
                        }
                        b2Var.T = LocaleController.getString(R.string.ReportUnrelatedGroupTextNoAddress);
                    }
                    string = LocaleController.getString(R.string.ReportChat);
                    a2VarArr = null;
                }
                final long j11 = j10;
                alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.Components.i3
                    @Override // org.telegram.ui.ActionBar.a2
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var2, int i13) {
                        org.telegram.ui.Cells.a2 a2Var2;
                        TLRPC.User user2 = TLRPC.User.this;
                        AccountInstance accountInstance2 = accountInstance;
                        if (user2 != null) {
                            accountInstance2.getMessagesController().blockPeer(user2.id);
                        }
                        org.telegram.ui.Cells.a2[] a2VarArr3 = a2VarArr;
                        long j12 = j11;
                        TLRPC.Chat chat2 = chat;
                        if (a2VarArr3 == null || ((a2Var2 = a2VarArr3[0]) != null && a2Var2.b())) {
                            accountInstance2.getMessagesController().reportSpam(j12, user2, chat2, encryptedChat, chat2 != null && z10);
                        }
                        MessagesStorage.IntCallback intCallback2 = intCallback;
                        if (a2VarArr3 != null && !a2VarArr3[1].b()) {
                            intCallback2.run(0);
                            return;
                        }
                        if (chat2 == null) {
                            accountInstance2.getMessagesController().deleteDialog(j12, 0);
                        } else if (ChatObject.isNotInChat(chat2)) {
                            accountInstance2.getMessagesController().deleteDialog(j12, 0);
                        } else {
                            accountInstance2.getMessagesController().deleteParticipantFromChat(-j12, accountInstance2.getMessagesController().getUser(Long.valueOf(accountInstance2.getUserConfig().getClientUserId())));
                        }
                        intCallback2.run(1);
                    }
                });
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                n2Var.showDialog(b2Var);
                textView = (TextView) b2Var.d(-1);
                if (textView == null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.q7, false));
                    return;
                }
                return;
            }
        } else {
            j10 = j3;
        }
        z11 = true;
        org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.a;
        if (user == null) {
        }
        final long j112 = j10;
        alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.Components.i3
            @Override // org.telegram.ui.ActionBar.a2
            public final void f(org.telegram.ui.ActionBar.b2 b2Var22, int i13) {
                org.telegram.ui.Cells.a2 a2Var2;
                TLRPC.User user2 = TLRPC.User.this;
                AccountInstance accountInstance2 = accountInstance;
                if (user2 != null) {
                    accountInstance2.getMessagesController().blockPeer(user2.id);
                }
                org.telegram.ui.Cells.a2[] a2VarArr3 = a2VarArr;
                long j12 = j112;
                TLRPC.Chat chat2 = chat;
                if (a2VarArr3 == null || ((a2Var2 = a2VarArr3[0]) != null && a2Var2.b())) {
                    accountInstance2.getMessagesController().reportSpam(j12, user2, chat2, encryptedChat, chat2 != null && z10);
                }
                MessagesStorage.IntCallback intCallback2 = intCallback;
                if (a2VarArr3 != null && !a2VarArr3[1].b()) {
                    intCallback2.run(0);
                    return;
                }
                if (chat2 == null) {
                    accountInstance2.getMessagesController().deleteDialog(j12, 0);
                } else if (ChatObject.isNotInChat(chat2)) {
                    accountInstance2.getMessagesController().deleteDialog(j12, 0);
                } else {
                    accountInstance2.getMessagesController().deleteParticipantFromChat(-j12, accountInstance2.getMessagesController().getUser(Long.valueOf(accountInstance2.getUserConfig().getClientUserId())));
                }
                intCallback2.run(1);
            }
        });
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        n2Var.showDialog(b2Var2);
        textView = (TextView) b2Var2.d(-1);
        if (textView == null) {
        }
    }

    public static void j(Context context, org.telegram.ui.ActionBar.e6 e6Var, f5 f5Var) {
        if (context == null) {
            return;
        }
        boolean z10 = false;
        int i10 = org.telegram.ui.ActionBar.i6.j5;
        int c02 = e6Var != null ? e6Var.c0(i10) : org.telegram.ui.ActionBar.i6.x0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.i6.h5;
        int c03 = e6Var != null ? e6Var.c0(i11) : org.telegram.ui.ActionBar.i6.x0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.i6.Ji;
        if (e6Var != null) {
            e6Var.c0(i12);
        } else {
            org.telegram.ui.ActionBar.i6.x0(null, i12, false);
        }
        int i13 = org.telegram.ui.ActionBar.i6.Ni;
        if (e6Var != null) {
            e6Var.c0(i13);
        } else {
            org.telegram.ui.ActionBar.i6.x0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.i6.E8;
        if (e6Var != null) {
            e6Var.c0(i14);
        } else {
            org.telegram.ui.ActionBar.i6.x0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.i6.G8;
        if (e6Var != null) {
            e6Var.c0(i15);
        } else {
            org.telegram.ui.ActionBar.i6.x0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.i6.i6;
        if (e6Var != null) {
            e6Var.c0(i16);
        } else {
            org.telegram.ui.ActionBar.i6.x0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.i6.Sh;
        int c04 = e6Var != null ? e6Var.c0(i17) : org.telegram.ui.ActionBar.i6.x0(null, i17, false);
        int i18 = org.telegram.ui.ActionBar.i6.Oh;
        int c05 = e6Var != null ? e6Var.c0(i18) : org.telegram.ui.ActionBar.i6.x0(null, i18, false);
        int c06 = e6Var != null ? e6Var.c0(org.telegram.ui.ActionBar.i6.Qh) : org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Qh, false);
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, e6Var);
        a3Var.a();
        int[] iArr = {0, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        k4 k4Var = new k4(context, e6Var, iArr);
        k4Var.setMinValue(0);
        k4Var.setMaxValue(16);
        k4Var.setTextColor(c02);
        k4Var.setValue(0);
        k4Var.setFormatter(new g1(1, iArr));
        l4 l4Var = new l4(context, k4Var, 0);
        l4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        l4Var.addView(frameLayout, w7.x5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.AutoDeleteAfteTitle));
        textView.setTextColor(c02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, w7.x5.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
        textView.setOnTouchListener(new bi.d(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        l4Var.addView(linearLayout, w7.x5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(context, 1 == true ? 1 : 0, 1 == true ? 1 : 0, z10, 1);
        linearLayout.addView(k4Var, w7.x5.l(1.0f, 0, 270));
        u3Var.setPadding(0, 0, 0, 0);
        u3Var.setGravity(17);
        u3Var.setTextColor(c04);
        u3Var.setTextSize(AndroidUtilities.dp(14.0f));
        u3Var.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(8.0f);
        u3Var.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.j0(dp, dp, dp, dp, c05, c06, c06));
        l4Var.addView(u3Var, w7.x5.t(-1, 48, 83, 16, 15, 16, 16));
        u3Var.setText(LocaleController.getString(R.string.DisableAutoDeleteTimer));
        k4Var.setOnValueChangedListener(new s(u3Var, 10));
        u3Var.setOnClickListener(new ai.p5(iArr, k4Var, f5Var, a3Var, 8));
        a3Var.b(l4Var);
        org.telegram.ui.ActionBar.f3 f3Var = a3Var.a;
        f3Var.show();
        f3Var.setBackgroundColor(c03);
        f3Var.fixNavigationBar(c03);
    }

    public static void j0(org.telegram.ui.zn znVar, MessageObject messageObject, long j3, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.tg tgVar) {
        if (znVar.getParentActivity() == null || messageObject == null) {
            return;
        }
        AccountInstance accountInstance = znVar.getAccountInstance();
        TLRPC.User user = j3 > 0 ? accountInstance.getMessagesController().getUser(Long.valueOf(j3)) : null;
        TLRPC.Chat chat = j3 < 0 ? accountInstance.getMessagesController().getChat(Long.valueOf(-j3)) : null;
        if (user == null && chat == null) {
            return;
        }
        int i10 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar.getParentActivity(), 0, e6Var);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.P0 = false;
        b2Var.N = new b1(tgVar, i10);
        b2Var.R = LocaleController.getString(R.string.BlockUser);
        if (user != null) {
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserReplyAlert", R.string.BlockUserReplyAlert, UserObject.getFirstName(user)));
        } else {
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserReplyAlert", R.string.BlockUserReplyAlert, chat.title));
        }
        LinearLayout linearLayout = new LinearLayout(znVar.getParentActivity());
        linearLayout.setOrientation(1);
        org.telegram.ui.Cells.a2[] a2VarArr = {new org.telegram.ui.Cells.a2(znVar.getParentActivity(), 1, e6Var)};
        a2VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.i6.L0(false));
        a2VarArr[0].setTag(0);
        a2VarArr[0].e(LocaleController.getString(R.string.DeleteReportSpam), "", true, false, false);
        a2VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
        linearLayout.addView(a2VarArr[0], w7.x5.n(-1, -2));
        a2VarArr[0].setOnClickListener(new c1(a2VarArr, i10));
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.k(LocaleController.getString(R.string.BlockAndDeleteReplies), new d1(user, accountInstance, znVar, chat, messageObject, a2VarArr, e6Var));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        znVar.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.q7, false));
        }
    }

    public static AlertDialog$Builder k(Activity activity, TLRPC.User user, Runnable runnable, org.telegram.ui.ActionBar.e6 e6Var) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, e6Var);
        String readRes = AndroidUtilities.readRes(org.telegram.ui.ActionBar.i6.B0().q() ? R.raw.permission_map_dark : R.raw.permission_map);
        String readRes2 = AndroidUtilities.readRes(org.telegram.ui.ActionBar.i6.B0().q() ? R.raw.permission_pin_dark : R.raw.permission_pin);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new t4());
        View view = new View(activity);
        view.setBackground(SvgHelper.getDrawable(readRes));
        frameLayout.addView(view, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        View view2 = new View(activity);
        view2.setBackground(SvgHelper.getDrawable(readRes2));
        frameLayout.addView(view2, w7.x5.a(82.0f, 0.0f, 0.0f, 0.0f, 0.0f, 60, 17));
        y9 y9Var = new y9(activity);
        y9Var.setRoundRadius(AndroidUtilities.dp(26.0f));
        y9Var.e(user, new j9(0, user));
        frameLayout.addView(y9Var, w7.x5.a(52.0f, 0.0f, 0.0f, 0.0f, 11.0f, 52, 17));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.V = frameLayout;
        b2Var.O0 = 0.37820512f;
        alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionBackgroundLocation));
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new k1(activity, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new z0(1, runnable));
        return alertDialog$Builder;
    }

    public static void k0(Context context, int i10, long j3) {
        org.telegram.ui.ActionBar.f3 i11 = org.telegram.messenger.bi.i(1, context, null, false);
        LinearLayout e7 = org.telegram.messenger.bi.e(context, 1);
        e7.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        e7.addView(frameLayout, w7.x5.t(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.story_link);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, w7.x5.e(-1, -1, 17));
        frameLayout2.setBackground(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Oh, false)));
        frameLayout.addView(frameLayout2, w7.x5.a(80.0f, 0.0f, 12.0f, 0.0f, 0.0f, 80, 1));
        TextView textView = new TextView(context);
        int i12 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.messenger.q.m(20.0f, org.telegram.ui.ActionBar.i6.x0(null, i12, false), 1, textView);
        org.telegram.messenger.bi.m(R.string.CallForbiddenInviteLinkTitle, textView, 17);
        TextView h = com.google.android.gms.internal.vision.e2.h(e7, textView, w7.x5.k(32.0f, 16.0f, 32.0f, 8.0f, -1, -2), context);
        h.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i12, false));
        h.setTextSize(1, 14.0f);
        h.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CallForbiddenInviteLinkText, DialogObject.getName(i10, j3))));
        h.setGravity(17);
        e7.addView(h, w7.x5.k(32.0f, 0.0f, 32.0f, 18.0f, -1, -2));
        ci.d dVar = new ci.d(context, null, true);
        dVar.g(LocaleController.getString(R.string.CallForbiddenInviteLinkButton), false, true);
        e7.addView(dVar, w7.x5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
        i11.customView = e7;
        dVar.setOnClickListener(new org.telegram.ui.qd(i10, dVar, i11, j3));
        i11.fixNavigationBar();
        i11.show();
    }

    public static org.telegram.ui.ActionBar.a3 l(Context context, String str, String str2, TL_account.TL_birthday tL_birthday, Utilities.Callback callback, Runnable runnable, boolean z10, boolean z11, org.telegram.ui.ActionBar.e6 e6Var) {
        if (context == null) {
            return null;
        }
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, e6Var);
        a3Var.a();
        ud0 ud0Var = new ud0(context, e6Var);
        ud0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        ud0Var.setItemCount(5);
        ud0 ud0Var2 = new ud0(context, e6Var);
        ud0Var2.setItemCount(5);
        ud0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        ud0 ud0Var3 = new ud0(context, e6Var);
        ud0Var3.setItemCount(5);
        ud0Var3.setTextOffset(-AndroidUtilities.dp(24.0f));
        c4 c4Var = new c4(context, ud0Var, ud0Var2, ud0Var3);
        c4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        c4Var.addView(frameLayout, w7.x5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        org.telegram.ui.Cells.c1.n(org.telegram.ui.ActionBar.i6.j5, e6Var, textView, 1, 20.0f);
        frameLayout.addView(textView, w7.x5.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
        textView.setOnTouchListener(new bi.d(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        c4Var.addView(linearLayout, w7.x5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        int i10 = calendar.get(1) - 149;
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i11 = calendar.get(5);
        int i12 = calendar.get(2);
        int i13 = calendar.get(1);
        int i14 = i13 + 1;
        z2 z2Var = new z2(ud0Var3, i14, ud0Var, ud0Var2, i13, i12, i11);
        System.currentTimeMillis();
        d4 d4Var = new d4(context);
        linearLayout.addView(ud0Var, w7.x5.l(0.25f, 0, 270));
        ud0Var.setMinValue(1);
        ud0Var.setMaxValue(31);
        ud0Var.setWrapSelectorWheel(false);
        ud0Var.setFormatter(new f2(13));
        s sVar = new s(z2Var, 9);
        ud0Var.setOnScrollListener(sVar);
        ud0Var2.setMinValue(0);
        ud0Var2.setMaxValue(11);
        ud0Var2.setWrapSelectorWheel(false);
        linearLayout.addView(ud0Var2, w7.x5.l(0.5f, 0, 270));
        ud0Var2.setFormatter(new f2(14));
        ud0Var2.setOnScrollListener(sVar);
        ud0Var3.setMinValue(i10);
        ud0Var3.setMaxValue(i14);
        ud0Var3.setWrapSelectorWheel(false);
        ud0Var3.setFormatter(new i2.w(i14, 9));
        linearLayout.addView(ud0Var3, w7.x5.l(0.25f, 0, 270));
        ud0Var3.setOnScrollListener(sVar);
        if (tL_birthday != null) {
            ud0Var.setValue(tL_birthday.day);
            ud0Var2.setValue(tL_birthday.month - 1);
            if ((tL_birthday.flags & 1) != 0) {
                ud0Var3.setValue(tL_birthday.year);
            } else {
                ud0Var3.setValue(i14);
            }
        } else {
            ud0Var.setValue(calendar.get(5));
            ud0Var2.setValue(calendar.get(2));
            ud0Var3.setValue(i14);
        }
        z2Var.run();
        if (runnable != null) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            ea0 ea0Var = new ea0(context, null);
            ea0Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            ea0Var.setTextSize(1, 13.0f);
            ea0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.q5, e6Var));
            ea0Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.gc, e6Var));
            ea0Var.setGravity(17);
            frameLayout2.addView(ea0Var, w7.x5.e(-2, -2, 17));
            c4Var.addView(frameLayout2, w7.x5.n(-1, -2));
            int i15 = UserConfig.selectedAccount;
            ai.p8 p8Var = new ai.p8(i15, ea0Var, 28);
            p8Var.run();
            NotificationCenter.getInstance(i15).listen(frameLayout2, NotificationCenter.privacyRulesUpdated, new a3(p8Var, 0));
            ContactsController.getInstance(i15).loadPrivacySettings();
        }
        if (z10) {
            ci.d dVar = new ci.d(context, e6Var, false);
            dVar.g(LocaleController.getString(R.string.DateOfBirthHideYear), false, true);
            dVar.setOnClickListener(new org.telegram.ui.Cells.sa(ud0Var3, i14, z2Var, 5));
            c4Var.addView(dVar, w7.x5.t(-1, 48, 83, 16, 15, 16, 4));
        }
        d4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        d4Var.setGravity(17);
        d4Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Sh, e6Var));
        d4Var.setTextSize(1, 14.0f);
        d4Var.setTypeface(AndroidUtilities.bold());
        d4Var.setText(str2);
        int dp = AndroidUtilities.dp(24.0f);
        int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, e6Var);
        int w03 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Qh, e6Var);
        d4Var.setBackground(org.telegram.ui.ActionBar.i6.j0(dp, dp, dp, dp, w02, w03, w03));
        w7.z5.b(d4Var, 0.02f, 1.2f);
        c4Var.addView(d4Var, w7.x5.t(-1, 48, 83, 16, z10 ? 0 : 15, 16, z11 ? 0 : 16));
        d4Var.setOnClickListener(new ei.m3(ud0Var, ud0Var2, ud0Var3, i14, a3Var, callback));
        if (z11) {
            ci.d dVar2 = new ci.d(context, e6Var, false);
            dVar2.g(LocaleController.getString(R.string.BirthdayRemove), false, true);
            dVar2.e();
            dVar2.setOnClickListener(new org.telegram.ui.sf(14, a3Var, callback));
            c4Var.addView(dVar2, w7.x5.t(-1, 48, 83, 16, 4, 16, 16));
        }
        a3Var.b(c4Var);
        return a3Var;
    }

    public static void l0(org.telegram.ui.ActionBar.n2 n2Var, String str) {
        if (str == null || !str.startsWith("FLOOD_WAIT") || n2Var == null || n2Var.getParentActivity() == null) {
            return;
        }
        int intValue = Utilities.parseInt((CharSequence) str).intValue();
        String formatPluralString = intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.R = string;
        b2Var.T = LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        n2Var.showDialog(b2Var, true, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m(org.telegram.ui.ActionBar.n2 n2Var, AtomicBoolean atomicBoolean, TLRPC.User user, Runnable runnable) {
        org.telegram.ui.Cells.a2[] a2VarArr;
        org.telegram.ui.ActionBar.b2 b2Var;
        y9 y9Var;
        boolean[] zArr;
        org.telegram.ui.Cells.a2 a2Var;
        if (n2Var == null) {
            return;
        }
        Context context = n2Var.getContext();
        org.telegram.ui.Cells.a2[] a2VarArr2 = new org.telegram.ui.Cells.a2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        z4 z4Var = new z4(context, null);
        NotificationCenter.listenEmojiLoading(z4Var);
        z4Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.j5, false));
        z4Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.gc, false));
        z4Var.setTextSize(1, 16.0f);
        z4Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        a5 a5Var = new a5(context, a2VarArr2);
        org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.a;
        b2Var2.G = 6;
        alertDialog$Builder.n(a5Var);
        j9 j9Var = new j9((org.telegram.ui.ActionBar.e6) null);
        j9Var.u(AndroidUtilities.dp(18.0f));
        y9 y9Var2 = new y9(context);
        y9Var2.setRoundRadius(AndroidUtilities.dp(20.0f));
        a5Var.addView(y9Var2, w7.x5.a(40.0f, 22.0f, 5.0f, 22.0f, 0.0f, 40, (LocaleController.isRTL ? 5 : 3) | 48));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        j5Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.E8, false));
        j5Var.setTextSize(20);
        j5Var.setTypeface(AndroidUtilities.bold());
        j5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        j5Var.setEllipsizeByGradient(true);
        j5Var.l(user.first_name, false);
        if (user.scam) {
            j5Var.i(org.telegram.ui.ActionBar.i6.g1);
        } else if (user.fake) {
            j5Var.i(org.telegram.ui.ActionBar.i6.h1);
        } else if (user.verified) {
            Drawable mutate = context.getResources().getDrawable(R.drawable.verified_area).mutate();
            a2VarArr = a2VarArr2;
            int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.z9, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(x02, mode));
            Drawable mutate2 = context.getResources().getDrawable(R.drawable.verified_check).mutate();
            b2Var = b2Var2;
            y9Var = y9Var2;
            zArr = null;
            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.A9, false), mode));
            j5Var.i(new fr(mutate, mutate2));
            TextView textView = new TextView(context);
            int x03 = org.telegram.ui.ActionBar.i6.x0(zArr, org.telegram.ui.ActionBar.i6.m5, false);
            int i10 = 1;
            org.telegram.messenger.bi.u(textView, x03, 1, 14.0f, 1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setGravity((!LocaleController.isRTL ? 5 : 3) | 16);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setOnClickListener(new u0(user, n2Var, alertDialog$Builder, i10));
            SpannableString valueOf = SpannableString.valueOf(LocaleController.getString(R.string.MoreAboutThisBot) + "  ");
            er erVar = new er(R.drawable.attach_arrow_right, 0);
            erVar.setTopOffset(1);
            erVar.setSize(AndroidUtilities.dp(10.0f));
            valueOf.setSpan(erVar, valueOf.length() - 1, valueOf.length(), 33);
            textView.setText(valueOf);
            boolean z10 = LocaleController.isRTL;
            a5Var.addView(j5Var, w7.x5.a(-2.0f, !z10 ? 21 : 76, 0.0f, !z10 ? 76 : 21, 0.0f, -1, (!z10 ? 5 : 3) | 48));
            boolean z11 = LocaleController.isRTL;
            a5Var.addView(textView, w7.x5.a(-2.0f, !z11 ? 21 : 76, 24.0f, z11 ? 76 : 21, 0.0f, -1, (!z11 ? 5 : 3) | 48));
            a5Var.addView(z4Var, w7.x5.a(-2.0f, 24.0f, 57.0f, 24.0f, 1.0f, -2, (!LocaleController.isRTL ? 5 : 3) | 48));
            atomicBoolean.set(true);
            a2Var = new org.telegram.ui.Cells.a2(context, 1, n2Var.getResourceProvider());
            a2VarArr[0] = a2Var;
            if (!a2Var.H) {
                org.telegram.ui.Cells.y1 y1Var = a2Var.c;
                y1Var.setLines(3);
                y1Var.setMaxLines(3);
                y1Var.setSingleLine(false);
            }
            a2VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.i6.L0(false));
            a2VarArr[0].e(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.OpenUrlOption2, UserObject.getUserName(user))), "", true, false, false);
            a2VarArr[0].setPadding(!LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, !LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
            a2VarArr[0].c(true, false);
            a5Var.addView(a2VarArr[0], w7.x5.a(48.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 83));
            a2VarArr[0].setOnClickListener(new f0(atomicBoolean, 1));
            if (UserObject.isReplyUser(user)) {
                j9Var.p = 1.0f;
                j9Var.m(n2Var.getCurrentAccount(), user);
                y9Var.e(user, j9Var);
            } else {
                j9Var.p = 0.8f;
                j9Var.g(12);
                y9Var.h(null, null, j9Var, user);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.Start), new z0(3, runnable));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var3 = b2Var;
            n2Var.showDialog(b2Var3);
            z4Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebViewStartPermission2), new l1(1, context, b2Var3)));
        }
        a2VarArr = a2VarArr2;
        y9Var = y9Var2;
        b2Var = b2Var2;
        zArr = null;
        TextView textView2 = new TextView(context);
        int x032 = org.telegram.ui.ActionBar.i6.x0(zArr, org.telegram.ui.ActionBar.i6.m5, false);
        int i102 = 1;
        org.telegram.messenger.bi.u(textView2, x032, 1, 14.0f, 1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity((!LocaleController.isRTL ? 5 : 3) | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setOnClickListener(new u0(user, n2Var, alertDialog$Builder, i102));
        SpannableString valueOf2 = SpannableString.valueOf(LocaleController.getString(R.string.MoreAboutThisBot) + "  ");
        er erVar2 = new er(R.drawable.attach_arrow_right, 0);
        erVar2.setTopOffset(1);
        erVar2.setSize(AndroidUtilities.dp(10.0f));
        valueOf2.setSpan(erVar2, valueOf2.length() - 1, valueOf2.length(), 33);
        textView2.setText(valueOf2);
        boolean z102 = LocaleController.isRTL;
        a5Var.addView(j5Var, w7.x5.a(-2.0f, !z102 ? 21 : 76, 0.0f, !z102 ? 76 : 21, 0.0f, -1, (!z102 ? 5 : 3) | 48));
        boolean z112 = LocaleController.isRTL;
        a5Var.addView(textView2, w7.x5.a(-2.0f, !z112 ? 21 : 76, 24.0f, z112 ? 76 : 21, 0.0f, -1, (!z112 ? 5 : 3) | 48));
        a5Var.addView(z4Var, w7.x5.a(-2.0f, 24.0f, 57.0f, 24.0f, 1.0f, -2, (!LocaleController.isRTL ? 5 : 3) | 48));
        atomicBoolean.set(true);
        a2Var = new org.telegram.ui.Cells.a2(context, 1, n2Var.getResourceProvider());
        a2VarArr[0] = a2Var;
        if (!a2Var.H) {
        }
        a2VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.i6.L0(false));
        a2VarArr[0].e(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.OpenUrlOption2, UserObject.getUserName(user))), "", true, false, false);
        a2VarArr[0].setPadding(!LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, !LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
        a2VarArr[0].c(true, false);
        a5Var.addView(a2VarArr[0], w7.x5.a(48.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 83));
        a2VarArr[0].setOnClickListener(new f0(atomicBoolean, 1));
        if (UserObject.isReplyUser(user)) {
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Start), new z0(3, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var32 = b2Var;
        n2Var.showDialog(b2Var32);
        z4Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebViewStartPermission2), new l1(1, context, b2Var32)));
    }

    public static void m0(Context context, org.telegram.ui.ActionBar.e6 e6Var, int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, Runnable runnable) {
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(j3);
        LinearLayout e7 = org.telegram.messenger.bi.e(context, 1);
        e7.addView(new yh.u2(context, tL_starGiftUnique, userOrChat), w7.x5.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.messenger.bi.o(org.telegram.ui.ActionBar.i6.j5, e6Var, textView, 1, 16.0f);
        org.telegram.messenger.bi.r(R.string.GiftThemesSetInReuseInfo, new Object[]{DialogObject.getDialogTitle(userOrChat)}, textView);
        e7.addView(textView, w7.x5.t(-1, -2, 48, 24, 0, 24, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
        alertDialog$Builder.n(e7);
        alertDialog$Builder.k(LocaleController.getString(R.string.GiftThemesSetInReuseConfirm), new z0(2, runnable));
        hg.c.p(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void n(org.telegram.ui.ActionBar.n2 n2Var, TLRPC.User user, Runnable runnable, Runnable runnable2) {
        Context context = n2Var.getContext();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        u4 u4Var = new u4(context, null);
        NotificationCenter.listenEmojiLoading(u4Var);
        u4Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.j5, false));
        u4Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.gc, false));
        u4Var.setTextSize(1, 16.0f);
        u4Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        FrameLayout frameLayout = new FrameLayout(context);
        alertDialog$Builder.a.G = 6;
        alertDialog$Builder.n(frameLayout);
        j9 j9Var = new j9((org.telegram.ui.ActionBar.e6) null);
        j9Var.u(AndroidUtilities.dp(18.0f));
        y9 y9Var = new y9(context);
        y9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        frameLayout.addView(y9Var, w7.x5.a(40.0f, 22.0f, 5.0f, 22.0f, 0.0f, 40, (LocaleController.isRTL ? 5 : 3) | 48));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        j5Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.E8, false));
        j5Var.setTextSize(20);
        j5Var.setTypeface(AndroidUtilities.bold());
        j5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        j5Var.setEllipsizeByGradient(true);
        j5Var.l(user.first_name, false);
        if (user.scam) {
            j5Var.i(org.telegram.ui.ActionBar.i6.g1);
        } else if (user.fake) {
            j5Var.i(org.telegram.ui.ActionBar.i6.h1);
        } else if (user.verified) {
            Drawable mutate = context.getResources().getDrawable(R.drawable.verified_area).mutate();
            int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.z9, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(x02, mode));
            Drawable mutate2 = context.getResources().getDrawable(R.drawable.verified_check).mutate();
            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.A9, false), mode));
            j5Var.i(new fr(mutate, mutate2));
        }
        TextView textView = new TextView(context);
        org.telegram.messenger.bi.u(textView, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.m5, false), 1, 14.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new u0(user, n2Var, alertDialog$Builder, 0));
        SpannableString valueOf = SpannableString.valueOf(LocaleController.getString(R.string.MoreAboutThisBot) + "  ");
        er erVar = new er(R.drawable.attach_arrow_right, 0);
        erVar.setTopOffset(1);
        erVar.setSize(AndroidUtilities.dp(10.0f));
        valueOf.setSpan(erVar, valueOf.length() - 1, valueOf.length(), 33);
        textView.setText(valueOf);
        boolean z10 = LocaleController.isRTL;
        frameLayout.addView(j5Var, w7.x5.a(-2.0f, z10 ? 21 : 76, 0.0f, z10 ? 76 : 21, 0.0f, -1, (z10 ? 5 : 3) | 48));
        boolean z11 = LocaleController.isRTL;
        frameLayout.addView(textView, w7.x5.a(-2.0f, z11 ? 21 : 76, 24.0f, z11 ? 76 : 21, 0.0f, -1, (z11 ? 5 : 3) | 48));
        frameLayout.addView(u4Var, w7.x5.a(-2.0f, 24.0f, 57.0f, 24.0f, 1.0f, -2, (LocaleController.isRTL ? 5 : 3) | 48));
        if (UserObject.isReplyUser(user)) {
            j9Var.p = 0.8f;
            j9Var.g(12);
            y9Var.h(null, null, j9Var, user);
        } else {
            j9Var.p = 1.0f;
            j9Var.m(n2Var.getCurrentAccount(), user);
            y9Var.e(user, j9Var);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Start), new z0(0, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        DialogInterface.OnDismissListener s0Var = new s0(3, runnable2);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        n2Var.showDialog(b2Var, false, s0Var);
        u4Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebViewStartPermission2), new l1(0, context, b2Var)));
    }

    public static void n0(Context context, org.telegram.ui.ActionBar.e6 e6Var, String str, boolean z10, final Utilities.Callback2 callback2) {
        if (AndroidUtilities.isContextSafe(context)) {
            final org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
            alertDialog$Builder.a.R = LocaleController.getString(R.string.OpenUrlTitle);
            TextView textView = new TextView(context);
            textView.setText(str);
            textView.setTextSize(1, 14.0f);
            int i10 = org.telegram.ui.ActionBar.i6.j5;
            textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
            textView.setGravity(17);
            textView.setMaxLines(5);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
            gradientDrawable.setColor(org.telegram.ui.ActionBar.i6.m1(0.06f, org.telegram.ui.ActionBar.i6.w0(i10, e6Var)));
            textView.setBackground(gradientDrawable);
            final org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(context, 1, e6Var);
            a2Var.setMultiline(true);
            a2Var.getTextView().getLayoutParams().width = -1;
            a2Var.getTextView().setSingleLine(false);
            a2Var.getTextView().setMaxLines(3);
            a2Var.getTextView().setTextSize(1, 16.0f);
            a2Var.e(LocaleController.getString(z10 ? R.string.BrowserAlwaysOpenExternal : R.string.BrowserAlwaysOpenInApp), "", false, false, false);
            a2Var.setOnClickListener(new i1(a2Var, 0));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.addView(textView, w7.x5.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
            linearLayout.addView(a2Var, w7.x5.t(-1, -2, 3, 8, 6, 8, 4));
            alertDialog$Builder.n(linearLayout);
            alertDialog$Builder.a.a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
            final int i11 = 0;
            alertDialog$Builder.k(LocaleController.getString(R.string.Open), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.Components.j1
                @Override // org.telegram.ui.ActionBar.a2
                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i12) {
                    switch (i11) {
                        case 0:
                            callback2.run(Boolean.TRUE, Boolean.valueOf(a2Var.b()));
                            org.telegram.ui.ActionBar.b2 b2Var2 = b2VarArr[0];
                            if (b2Var2 != null) {
                                b2Var2.dismiss();
                                break;
                            }
                            break;
                        default:
                            callback2.run(Boolean.FALSE, Boolean.valueOf(a2Var.b()));
                            org.telegram.ui.ActionBar.b2 b2Var3 = b2VarArr[0];
                            if (b2Var3 != null) {
                                b2Var3.dismiss();
                                break;
                            }
                            break;
                    }
                }
            });
            final int i12 = 1;
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.Components.j1
                @Override // org.telegram.ui.ActionBar.a2
                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i122) {
                    switch (i12) {
                        case 0:
                            callback2.run(Boolean.TRUE, Boolean.valueOf(a2Var.b()));
                            org.telegram.ui.ActionBar.b2 b2Var2 = b2VarArr[0];
                            if (b2Var2 != null) {
                                b2Var2.dismiss();
                                break;
                            }
                            break;
                        default:
                            callback2.run(Boolean.FALSE, Boolean.valueOf(a2Var.b()));
                            org.telegram.ui.ActionBar.b2 b2Var3 = b2VarArr[0];
                            if (b2Var3 != null) {
                                b2Var3.dismiss();
                                break;
                            }
                            break;
                    }
                }
            });
            b2VarArr[0] = alertDialog$Builder.o();
        }
    }

    public static org.telegram.ui.ActionBar.a3 o(Activity activity, MessagesStorage.IntCallback intCallback, org.telegram.ui.ActionBar.e6 e6Var) {
        if (activity == null) {
            return null;
        }
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(activity, e6Var);
        a3Var.a();
        ud0 ud0Var = new ud0(activity, e6Var);
        ud0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        ud0Var.setItemCount(5);
        ud0 ud0Var2 = new ud0(activity, e6Var);
        ud0Var2.setItemCount(5);
        ud0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        ud0 ud0Var3 = new ud0(activity, e6Var);
        ud0Var3.setItemCount(5);
        ud0Var3.setTextOffset(-AndroidUtilities.dp(24.0f));
        q4 q4Var = new q4(activity, ud0Var, ud0Var2, ud0Var3);
        q4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        q4Var.addView(frameLayout, w7.x5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(activity);
        textView.setText(LocaleController.getString(R.string.ChooseDate));
        org.telegram.ui.Cells.c1.n(org.telegram.ui.ActionBar.i6.j5, e6Var, textView, 1, 20.0f);
        frameLayout.addView(textView, w7.x5.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
        textView.setOnTouchListener(new bi.d(10));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        q4Var.addView(linearLayout, w7.x5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        System.currentTimeMillis();
        r4 r4Var = new r4(activity);
        linearLayout.addView(ud0Var, w7.x5.l(0.25f, 0, 270));
        ud0Var.setMinValue(1);
        ud0Var.setMaxValue(31);
        ud0Var.setWrapSelectorWheel(false);
        ud0Var.setFormatter(new org.telegram.ui.nr(11));
        l0 l0Var = new l0(ud0Var, ud0Var2, ud0Var3, 0);
        ud0Var.setOnValueChangedListener(l0Var);
        ud0Var2.setMinValue(0);
        ud0Var2.setMaxValue(11);
        ud0Var2.setWrapSelectorWheel(false);
        linearLayout.addView(ud0Var2, w7.x5.l(0.5f, 0, 270));
        ud0Var2.setFormatter(new org.telegram.ui.nr(12));
        ud0Var2.setOnValueChangedListener(l0Var);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(1375315200000L);
        int i10 = calendar.get(1);
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i11 = calendar.get(1);
        ud0Var3.setMinValue(i10);
        ud0Var3.setMaxValue(i11);
        ud0Var3.setWrapSelectorWheel(false);
        ud0Var3.setFormatter(new org.telegram.ui.nr(13));
        linearLayout.addView(ud0Var3, w7.x5.l(0.25f, 0, 270));
        ud0Var3.setOnValueChangedListener(l0Var);
        ud0Var.setValue(31);
        ud0Var2.setValue(12);
        ud0Var3.setValue(i11);
        a(ud0Var, ud0Var2, ud0Var3);
        r4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        r4Var.setGravity(17);
        r4Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Sh, e6Var));
        r4Var.setTextSize(1, 14.0f);
        r4Var.setTypeface(AndroidUtilities.bold());
        r4Var.setText(LocaleController.getString(R.string.JumpToDate));
        int dp = AndroidUtilities.dp(8.0f);
        int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, e6Var);
        int w03 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Qh, e6Var);
        r4Var.setBackground(org.telegram.ui.ActionBar.i6.j0(dp, dp, dp, dp, w02, w03, w03));
        q4Var.addView(r4Var, w7.x5.t(-1, 48, 83, 16, 15, 16, 16));
        r4Var.setOnClickListener(new m0(ud0Var, ud0Var2, ud0Var3, calendar, intCallback, a3Var, 0));
        a3Var.b(q4Var);
        return a3Var;
    }

    public static void o0(Context context, String str, boolean z10, boolean z11, boolean z12, boolean z13, long j3, of.e eVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.e6 e6Var) {
        String v;
        LinearLayout linearLayout;
        if (AndroidUtilities.isContextSafe(context)) {
            String scheme = str == null ? null : Uri.parse(str).getScheme();
            if (of.f.f(Uri.parse(str), false, null) || !z12 || "mailto".equalsIgnoreCase(scheme)) {
                of.f.r(context, Uri.parse(str), j3 == 0, z11, z13 && Uri.parse(str).getPath().matches("^/\\w*/[^\\d]*(?:\\?startapp=.*?|)$"), eVar, null, false, true, false);
                return;
            }
            if (z10) {
                try {
                    Uri parse = Uri.parse(str);
                    v = of.f.v(parse, null, null, of.f.a(parse.getHost()), null);
                } catch (Exception e7) {
                    FileLog.e((Throwable) e7, false);
                }
                r2 r2Var = new r2(context, str, j3, z11, eVar);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
                String string = LocaleController.getString(R.string.OpenUrlTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.R = string;
                TextView textView = new TextView(context);
                textView.setText(v);
                textView.setTextSize(1, 14.0f);
                int i10 = org.telegram.ui.ActionBar.i6.j5;
                textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
                textView.setGravity(17);
                textView.setMaxLines(5);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
                gradientDrawable.setColor(org.telegram.ui.ActionBar.i6.m1(0.06f, org.telegram.ui.ActionBar.i6.w0(i10, e6Var)));
                textView.setBackground(gradientDrawable);
                linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.addView(textView, w7.x5.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
                int i11 = w91.f;
                if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
                    w91 w91Var = new w91(context, e6Var);
                    w91Var.setWebPage(webPage);
                    linearLayout.addView(w91Var, w7.x5.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
                }
                alertDialog$Builder.n(linearLayout);
                b2Var.a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
                alertDialog$Builder.k(LocaleController.getString(R.string.Open), new s(r2Var, 8));
                hg.c.p(R.string.Cancel, alertDialog$Builder, null);
            }
            v = str;
            r2 r2Var2 = new r2(context, str, j3, z11, eVar);
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context, 0, e6Var);
            String string2 = LocaleController.getString(R.string.OpenUrlTitle);
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
            b2Var2.R = string2;
            TextView textView2 = new TextView(context);
            textView2.setText(v);
            textView2.setTextSize(1, 14.0f);
            int i102 = org.telegram.ui.ActionBar.i6.j5;
            textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(i102, e6Var));
            textView2.setGravity(17);
            textView2.setMaxLines(5);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(AndroidUtilities.dp(22.0f));
            gradientDrawable2.setColor(org.telegram.ui.ActionBar.i6.m1(0.06f, org.telegram.ui.ActionBar.i6.w0(i102, e6Var)));
            textView2.setBackground(gradientDrawable2);
            linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.addView(textView2, w7.x5.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
            int i112 = w91.f;
            if (webPage != null) {
                w91 w91Var2 = new w91(context, e6Var);
                w91Var2.setWebPage(webPage);
                linearLayout.addView(w91Var2, w7.x5.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
            }
            alertDialog$Builder2.n(linearLayout);
            b2Var2.a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Open), new s(r2Var2, 8));
            hg.c.p(R.string.Cancel, alertDialog$Builder2, null);
        }
    }

    public static void p(org.telegram.ui.ActionBar.n2 n2Var, TLRPC.User user, boolean z10) {
        String string;
        String formatString;
        if (n2Var.getParentActivity() == null || user == null || UserObject.isDeleted(user) || UserConfig.getInstance(n2Var.getCurrentAccount()).getClientUserId() == user.id) {
            return;
        }
        n2Var.getCurrentAccount();
        Activity parentActivity = n2Var.getParentActivity();
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        if (z10) {
            string = LocaleController.getString(R.string.VideoCallAlertTitle);
            formatString = LocaleController.formatString("VideoCallAlert", R.string.VideoCallAlert, UserObject.getUserName(user));
        } else {
            string = LocaleController.getString(R.string.CallAlertTitle);
            formatString = LocaleController.formatString("CallAlert", R.string.CallAlert, UserObject.getUserName(user));
        }
        p3 p3Var = new p3(parentActivity);
        NotificationCenter.listenEmojiLoading(p3Var);
        p3Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.j5, false));
        p3Var.setTextSize(1, 16.0f);
        p3Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        p3Var.setText(AndroidUtilities.replaceTags(formatString));
        j9 j9Var = new j9((org.telegram.ui.ActionBar.e6) null);
        j9Var.u(AndroidUtilities.dp(12.0f));
        j9Var.p = 1.0f;
        j9Var.m(n2Var.getCurrentAccount(), user);
        y9 y9Var = new y9(parentActivity);
        y9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        y9Var.e(user, j9Var);
        frameLayout.addView(y9Var, w7.x5.a(40.0f, 22.0f, 5.0f, 22.0f, 0.0f, 40, (LocaleController.isRTL ? 5 : 3) | 48));
        TextView textView = new TextView(parentActivity);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.E8, false));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(string);
        boolean z11 = LocaleController.isRTL;
        frameLayout.addView(textView, w7.x5.a(-2.0f, z11 ? 21 : 76, 11.0f, z11 ? 76 : 21, 0.0f, -1, (z11 ? 5 : 3) | 48));
        frameLayout.addView(p3Var, w7.x5.a(-2.0f, 24.0f, 57.0f, 24.0f, 9.0f, -2, (LocaleController.isRTL ? 5 : 3) | 48));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
        alertDialog$Builder.n(frameLayout);
        alertDialog$Builder.k(LocaleController.getString(R.string.Call), new com.google.firebase.messaging.i(n2Var, user, z10, 6));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        n2Var.showDialog(alertDialog$Builder.a);
    }

    public static void p0(org.telegram.ui.ActionBar.n2 n2Var, String str, boolean z10, boolean z11) {
        q0(n2Var, str, z10, true, z11, false, null, null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0186, code lost:
    
        if (org.telegram.messenger.ChatObject.isMonoForum(r34) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x019e, code lost:
    
        r5 = new org.telegram.ui.Cells.a2(r6, 1, r37);
        r11[0] = r5;
        r5.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.L0(false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01ad, code lost:
    
        if (r34 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01af, code lost:
    
        r11[0].e(org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.DeleteMessagesOptionAlsoChat), "", false, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01e1, code lost:
    
        r2 = r11[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01e7, code lost:
    
        if (org.telegram.messenger.LocaleController.isRTL == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01e9, code lost:
    
        r4 = org.telegram.messenger.AndroidUtilities.dp(16.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01f4, code lost:
    
        if (org.telegram.messenger.LocaleController.isRTL == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01f6, code lost:
    
        r5 = org.telegram.messenger.AndroidUtilities.dp(8.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01ff, code lost:
    
        r2.setPadding(r4, 0, r5, 0);
        r15.addView(r11[0], w7.x5.a(48.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 83));
        r11[0].c(false, false);
        r11[0].setOnClickListener(new org.telegram.ui.Components.t0(4, r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01fb, code lost:
    
        r5 = org.telegram.messenger.AndroidUtilities.dp(16.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01ee, code lost:
    
        r4 = org.telegram.messenger.AndroidUtilities.dp(8.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01c3, code lost:
    
        r11[0].e(org.telegram.messenger.LocaleController.formatString("DeleteMessagesOptionAlso", org.telegram.messenger.R.string.DeleteMessagesOptionAlso, org.telegram.messenger.UserObject.getFirstName(r33)), "", false, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x019c, code lost:
    
        if (org.telegram.messenger.ChatObject.isMonoForum(r34) == false) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018a  */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void q(org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.User user, TLRPC.Chat chat, boolean z10, MessagesStorage.BooleanCallback booleanCallback, org.telegram.ui.ActionBar.e6 e6Var) {
        int i11;
        boolean[] zArr;
        String string;
        TextView textView;
        if (n2Var == null || n2Var.getParentActivity() == null) {
            return;
        }
        if (user == null && chat == null) {
            return;
        }
        int currentAccount = n2Var.getCurrentAccount();
        Activity parentActivity = n2Var.getParentActivity();
        int i12 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, e6Var);
        long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
        org.telegram.ui.Cells.a2[] a2VarArr = new org.telegram.ui.Cells.a2[1];
        n3 n3Var = new n3(parentActivity);
        NotificationCenter.listenEmojiLoading(n3Var);
        n3Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.j5, false));
        n3Var.setTextSize(1, 16.0f);
        n3Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        o3 o3Var = new o3(parentActivity, a2VarArr);
        alertDialog$Builder.n(o3Var);
        TextView textView2 = new TextView(parentActivity);
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.E8, false));
        textView2.setTextSize(1, 20.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        o3Var.addView(textView2, w7.x5.a(-2.0f, 24.0f, 11.0f, 24.0f, 0.0f, -1, (LocaleController.isRTL ? 5 : 3) | 48));
        o3Var.addView(n3Var, w7.x5.a(-2.0f, 24.0f, 48.0f, 24.0f, 18.0f, -2, (LocaleController.isRTL ? 5 : 3) | 48));
        if (i10 == -1) {
            textView2.setText(LocaleController.formatString("ClearHistory", R.string.ClearHistory, new Object[0]));
            if (user != null) {
                n3Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureClearHistoryWithUser", R.string.AreYouSureClearHistoryWithUser, UserObject.getUserName(user))));
            } else if (z10) {
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    i11 = 1;
                    n3Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureClearHistoryWithChannel", R.string.AreYouSureClearHistoryWithChannel, chat.title)));
                    zArr = new boolean[i11];
                    zArr[0] = false;
                    if (chat != null && z10 && ChatObject.isPublic(chat)) {
                        zArr[0] = i11;
                    }
                    if (user != null) {
                        long j3 = user.id;
                        if (j3 != clientUserId) {
                            if (j3 != UserObject.VERIFY) {
                            }
                        }
                    }
                    if (chat != null) {
                        if (z10) {
                            if (!ChatObject.isPublic(chat)) {
                                if (!ChatObject.isChannelAndNotMegaGroup(chat)) {
                                }
                            }
                        }
                    }
                    string = LocaleController.getString(R.string.Delete);
                    if (chat != null && z10 && ChatObject.isPublic(chat) && !ChatObject.isChannelAndNotMegaGroup(chat)) {
                        string = LocaleController.getString(R.string.ClearForAll);
                    }
                    alertDialog$Builder.k(string, new y2(i12, booleanCallback, zArr));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                    n2Var.showDialog(b2Var);
                    textView = (TextView) b2Var.d(-1);
                    if (textView == null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.q7, false));
                        return;
                    }
                    return;
                }
                n3Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureClearHistoryWithChat", R.string.AreYouSureClearHistoryWithChat, chat.title)));
            } else if (chat.megagroup) {
                n3Var.setText(LocaleController.getString(R.string.AreYouSureClearHistoryGroup));
            } else {
                n3Var.setText(LocaleController.getString(R.string.AreYouSureClearHistoryChannel));
            }
        } else {
            textView2.setText(LocaleController.formatPluralString("DeleteDays", i10, new Object[0]));
            n3Var.setText(LocaleController.getString(R.string.DeleteHistoryByDaysMessage));
        }
        i11 = 1;
        zArr = new boolean[i11];
        zArr[0] = false;
        if (chat != null) {
            zArr[0] = i11;
        }
        if (user != null) {
        }
        if (chat != null) {
        }
        string = LocaleController.getString(R.string.Delete);
        if (chat != null) {
            string = LocaleController.getString(R.string.ClearForAll);
        }
        alertDialog$Builder.k(string, new y2(i12, booleanCallback, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.a;
        n2Var.showDialog(b2Var2);
        textView = (TextView) b2Var2.d(-1);
        if (textView == null) {
        }
    }

    public static void q0(org.telegram.ui.ActionBar.n2 n2Var, String str, boolean z10, boolean z11, boolean z12, boolean z13, of.e eVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.e6 e6Var) {
        if (n2Var == null || n2Var.getParentActivity() == null) {
            return;
        }
        o0(n2Var.getParentActivity(), str, z10, z11, z12, z13, n2Var instanceof org.telegram.ui.zn ? ((org.telegram.ui.zn) n2Var).f8 : 0L, eVar, webPage, e6Var);
    }

    public static void r(org.telegram.ui.ActionBar.n2 n2Var, boolean z10, TLRPC.Chat chat, TLRPC.User user, boolean z11, boolean z12, boolean z13, boolean z14, MessagesStorage.BooleanCallback booleanCallback) {
        s(n2Var, z10, false, chat, user, z11, z12, z13, z14, booleanCallback, n2Var != null ? n2Var.getResourceProvider() : null);
    }

    public static void r0(Activity activity, int i10, Runnable runnable, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i11 = MessagesController.getInstance(i10).availableMapProviders;
        if ((i11 & 1) != 0) {
            org.telegram.ui.Cells.c1.t(R.string.MapPreviewProviderTelegram, 0, arrayList, arrayList2);
        }
        if ((i11 & 2) != 0) {
            org.telegram.ui.Cells.c1.t(R.string.MapPreviewProviderGoogle, 1, arrayList, arrayList2);
        }
        if ((i11 & 4) != 0) {
            org.telegram.ui.Cells.c1.t(R.string.MapPreviewProviderYandex, 3, arrayList, arrayList2);
        }
        arrayList.add(LocaleController.getString(R.string.MapPreviewProviderNobody));
        arrayList2.add(2);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, e6Var);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.MapPreviewProviderTitle);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            org.telegram.ui.Cells.l6 l6Var = new org.telegram.ui.Cells.l6(activity, e6Var);
            l6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            l6Var.setTag(Integer.valueOf(i12));
            l6Var.a(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.g7, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.E5, false));
            l6Var.b((CharSequence) arrayList.get(i12), SharedConfig.mapPreviewType == ((Integer) arrayList2.get(i12)).intValue());
            l6Var.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.i6, false), 2, -1));
            linearLayout.addView(l6Var);
            l6Var.setOnClickListener(new ai.d0(arrayList2, runnable, alertDialog$Builder, 14));
        }
        if (!z10) {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        org.telegram.ui.ActionBar.b2 o9 = alertDialog$Builder.o();
        if (z10) {
            o9.setCanceledOnTouchOutside(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x05e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void s(final org.telegram.ui.ActionBar.n2 n2Var, final boolean z10, final boolean z11, TLRPC.Chat chat, final TLRPC.User user, final boolean z12, final boolean z13, boolean z14, final boolean z15, final MessagesStorage.BooleanCallback booleanCallback, final org.telegram.ui.ActionBar.e6 e6Var) {
        long j3;
        boolean z16;
        org.telegram.ui.Cells.a2[] a2VarArr;
        j3 j3Var;
        TLRPC.Chat chat2;
        org.telegram.ui.Cells.a2[] a2VarArr2;
        float f7;
        final TLRPC.Chat chat3;
        boolean z17;
        org.telegram.ui.ActionBar.b2 b2Var;
        boolean z18;
        boolean z19;
        Object obj;
        CharSequence string;
        TextView textView;
        if (n2Var == null || n2Var.getParentActivity() == null) {
            return;
        }
        if (chat == null && user == null) {
            return;
        }
        final int currentAccount = n2Var.getCurrentAccount();
        final Activity parentActivity = n2Var.getParentActivity();
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, e6Var);
        long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
        org.telegram.ui.Cells.a2[] a2VarArr3 = new org.telegram.ui.Cells.a2[1];
        j3 j3Var2 = new j3(parentActivity);
        NotificationCenter.listenEmojiLoading(j3Var2);
        j3Var2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.j5, false));
        j3Var2.setTextSize(1, 16.0f);
        j3Var2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        if (!z15 && ChatObject.isChannel(chat) && ChatObject.isPublic(chat)) {
            j3 = clientUserId;
            z16 = true;
        } else {
            j3 = clientUserId;
            z16 = false;
        }
        k3 k3Var = new k3(parentActivity, a2VarArr3);
        org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.a;
        b2Var2.G = 6;
        alertDialog$Builder.n(k3Var);
        j9 j9Var = new j9((org.telegram.ui.ActionBar.e6) null);
        j9Var.u(AndroidUtilities.dp(18.0f));
        y9 y9Var = new y9(parentActivity);
        y9Var.setRoundRadius(AndroidUtilities.dp(15.0f));
        k3Var.addView(y9Var, w7.x5.a(30.0f, 22.0f, 5.0f, 22.0f, 0.0f, 30, (LocaleController.isRTL ? 5 : 3) | 48));
        r6 r6Var = new r6(parentActivity, false, false, false);
        final boolean z20 = z16;
        r6Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.E8, false));
        r6Var.setTextSize(AndroidUtilities.dp(20.0f));
        r6Var.setTypeface(AndroidUtilities.bold());
        r6Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        r6Var.setEllipsizeByGradient(true);
        if (z10) {
            if (z20) {
                r6Var.setText(LocaleController.getString(R.string.ClearHistoryCache));
            } else {
                r6Var.setText(LocaleController.getString(R.string.ClearHistory));
            }
        } else if (chat == null) {
            r6Var.setText(LocaleController.getString(R.string.DeleteChatUser));
        } else if (ChatObject.isCommunity(chat)) {
            r6Var.setText(LocaleController.getString(R.string.CommunityDelete));
        } else if (!ChatObject.isChannel(chat)) {
            r6Var.setText(LocaleController.getString(R.string.LeaveMega));
        } else if (chat.monoforum) {
            r6Var.setText(LocaleController.getString(R.string.LeaveConversationMenu));
        } else if (chat.megagroup) {
            r6Var.setText(LocaleController.getString(R.string.LeaveMega));
        } else {
            r6Var.setText(LocaleController.getString(R.string.LeaveChannel));
        }
        boolean z21 = LocaleController.isRTL;
        k3Var.addView(r6Var, w7.x5.a(24.0f, z21 ? 22 : 65, 7.66f, z21 ? 65 : 22, 0.0f, -1, (z21 ? 5 : 3) | 48));
        k3Var.addView(j3Var2, w7.x5.a(-2.0f, 24.0f, 49.0f, 24.0f, 1.0f, -2, (LocaleController.isRTL ? 5 : 3) | 48));
        if (ChatObject.isMonoForum(chat)) {
            a2VarArr = a2VarArr3;
            j3Var = j3Var2;
            chat2 = n2Var.getMessagesController().getMonoForumLinkedChat(chat.id);
        } else {
            a2VarArr = a2VarArr3;
            j3Var = j3Var2;
            chat2 = null;
        }
        boolean z22 = !z12 && user != null && (user != null && !user.bot && (user.id > j3 ? 1 : (user.id == j3 ? 0 : -1)) != 0 && MessagesController.getInstance(currentAccount).canRevokePmInbox) && (user != null ? MessagesController.getInstance(currentAccount).revokeTimePmLimit : MessagesController.getInstance(currentAccount).revokeTimeLimit) == Integer.MAX_VALUE;
        j3 j3Var3 = j3Var;
        final boolean[] zArr = new boolean[1];
        ArrayList arrayList = user != null ? (ArrayList) MessagesController.getInstance(currentAccount).dialogMessage.f(user.id) : null;
        boolean z23 = (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((MessageObject) arrayList.get(0)).messageOwner == null || (!(((MessageObject) arrayList.get(0)).messageOwner.action instanceof TLRPC.TL_messageActionUserJoined) && !(((MessageObject) arrayList.get(0)).messageOwner.action instanceof TLRPC.TL_messageActionContactSignUp))) ? false : true;
        if (user != null) {
            f7 = 10.0f;
            if (!user.bot || user.id == UserObject.VERIFY) {
                a2VarArr2 = a2VarArr;
            } else {
                org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(parentActivity, 1, e6Var);
                a2VarArr[0] = a2Var;
                a2Var.setBackground(org.telegram.ui.ActionBar.i6.L0(false));
                a2VarArr[0].e(LocaleController.getString(R.string.BlockBot), "", false, false, false);
                org.telegram.ui.Cells.a2[] a2VarArr4 = a2VarArr;
                a2VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f), LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), AndroidUtilities.dp(10.0f));
                org.telegram.ui.Cells.a2 a2Var2 = a2VarArr4[0];
                zArr[0] = true;
                a2Var2.c(true, false);
                a2VarArr4[0].setMultiline(true);
                k3Var.addView(a2VarArr4[0], w7.x5.a(48.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 83));
                a2VarArr4[0].setOnClickListener(new t0(3, zArr));
                chat3 = chat;
                b2Var = b2Var2;
                z18 = false;
                if (user != null) {
                    obj = null;
                    j9Var.k(n2Var.getCurrentAccount(), chat2 != null ? chat2 : chat3);
                    y9Var.e(chat2 != null ? chat2 : chat3, j9Var);
                } else if (UserObject.isReplyUser(user)) {
                    j9Var.p = 0.8f;
                    j9Var.g(12);
                    obj = null;
                    y9Var.h(null, null, j9Var, user);
                } else {
                    obj = null;
                    if (user.id == j3) {
                        j9Var.p = 0.8f;
                        j9Var.g(1);
                        y9Var.h(null, null, j9Var, user);
                    } else {
                        j9Var.p = 1.0f;
                        j9Var.m(n2Var.getCurrentAccount(), user);
                        y9Var.e(user, j9Var);
                    }
                }
                if (z11) {
                    if (z10) {
                        if (user == null) {
                            String formatString = chat2 != null ? LocaleController.formatString(R.string.MonoforumTitle, chat2.title) : chat3.title;
                            if (!ChatObject.isChannel(chat3) || (chat3.megagroup && !ChatObject.isPublic(chat3))) {
                                j3Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithChat, formatString)));
                            } else if (chat3.megagroup) {
                                j3Var3.setText(LocaleController.getString(R.string.AreYouSureClearHistoryGroup));
                            } else {
                                j3Var3.setText(LocaleController.getString(R.string.AreYouSureClearHistoryChannel));
                            }
                        } else if (z12) {
                            j3Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithSecretUser, UserObject.getUserName(user))));
                        } else if (user.id == j3) {
                            j3Var3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AreYouSureClearHistorySavedMessages)));
                        } else {
                            j3Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithUser, UserObject.getUserName(user))));
                        }
                    } else if (user != null) {
                        if (z12) {
                            j3Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteThisChatWithSecretUser, UserObject.getUserName(user))));
                        } else if (user.id == j3) {
                            j3Var3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AreYouSureDeleteThisChatSavedMessages)));
                        } else if (!user.bot || user.support) {
                            j3Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteThisChatWithUser, UserObject.getUserName(user))));
                        } else {
                            j3Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteThisChatWithBotWithCheckmark, UserObject.getUserName(user))));
                        }
                    } else if (ChatObject.isChannel(chat3)) {
                        String formatString2 = chat2 != null ? LocaleController.formatString(R.string.MonoforumTitle, chat2.title) : chat3.title;
                        if (chat3.megagroup) {
                            j3Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.MegaLeaveAlertWithName, formatString2)));
                        } else {
                            j3Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.ChannelLeaveAlertWithName, formatString2)));
                        }
                    } else {
                        j3Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteAndExitName, chat3.title)));
                    }
                } else if (UserObject.isUserSelf(user)) {
                    j3Var3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DeleteAllMessagesSavedAlert)));
                } else if (chat3 == null || !ChatObject.isChannelAndNotMegaGroup(chat3)) {
                    j3Var3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DeleteAllMessagesAlert)));
                } else {
                    j3Var3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DeleteAllMessagesChannelAlert)));
                }
                if (!z11) {
                    string = LocaleController.getString(R.string.DeleteAll);
                } else {
                    if (!z10) {
                        if (z18 && zArr[0]) {
                            string = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat3) ? R.string.ChannelDelete : R.string.DeleteMega);
                        } else {
                            string = ChatObject.isChannel(chat3) ? chat3.monoforum ? LocaleController.getString(R.string.LeaveConversationMenu) : chat3.megagroup ? LocaleController.getString(R.string.LeaveMegaMenu) : LocaleController.getString(R.string.LeaveChannelMenu) : LocaleController.getString(R.string.DeleteChatUser);
                        }
                        org.telegram.ui.ActionBar.b2 b2Var3 = b2Var;
                        alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.Components.w2
                            @Override // org.telegram.ui.ActionBar.a2
                            public final void f(org.telegram.ui.ActionBar.b2 b2Var4, int i10) {
                                final boolean[] zArr2;
                                boolean z24 = z20;
                                final boolean z25 = z11;
                                final boolean[] zArr3 = zArr;
                                final MessagesStorage.BooleanCallback booleanCallback2 = booleanCallback;
                                boolean z26 = true;
                                if (z24 || z25 || z12) {
                                    zArr2 = zArr3;
                                } else {
                                    final TLRPC.User user2 = user;
                                    boolean isUserSelf = UserObject.isUserSelf(user2);
                                    final org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                                    final boolean z27 = z10;
                                    final TLRPC.Chat chat4 = chat3;
                                    final boolean z28 = z13;
                                    final boolean z29 = z15;
                                    final org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                                    if (isUserSelf) {
                                        g5.s(n2Var2, z27, true, chat4, user2, false, z28, zArr3[0], z29, booleanCallback2, e6Var2);
                                        return;
                                    }
                                    if (user2 != null && zArr3[0]) {
                                        MessagesStorage.getInstance(n2Var2.getCurrentAccount()).getMessagesCount(user2.id, new MessagesStorage.IntCallback() { // from class: org.telegram.ui.Components.o1
                                            @Override // org.telegram.messenger.MessagesStorage.IntCallback
                                            public final void run(int i11) {
                                                boolean[] zArr4 = zArr3;
                                                MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                                if (i11 >= 50) {
                                                    g5.s(org.telegram.ui.ActionBar.n2.this, z27, true, chat4, user2, false, z28, zArr4[0], z29, booleanCallback3, e6Var2);
                                                } else if (booleanCallback3 != null) {
                                                    booleanCallback3.run(zArr4[0]);
                                                }
                                            }
                                        });
                                        return;
                                    }
                                    zArr2 = zArr3;
                                    if (ChatObject.isChannel(chat4) && chat4.creator && !zArr2[0]) {
                                        final of.e g10 = alertDialog$Builder.a.g(-1, true, true);
                                        g10.d();
                                        TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                                        tL_channels_getFutureCreatorAfterLeave.channel = MessagesController.getInputChannel(chat4);
                                        final int i11 = currentAccount;
                                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                                        org.telegram.messenger.a aVar = new org.telegram.messenger.a();
                                        final Context context = parentActivity;
                                        connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, aVar, new Utilities.Callback2() { // from class: org.telegram.ui.Components.p1
                                            @Override // org.telegram.messenger.Utilities.Callback2
                                            public final void run(Object obj2, Object obj3) {
                                                TLRPC.User user3 = (TLRPC.User) obj2;
                                                of.e.this.c(false);
                                                TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                                MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                                if (user4 == null) {
                                                    booleanCallback3.run(z25 || zArr2[0]);
                                                    return;
                                                }
                                                Context context2 = context;
                                                TLRPC.Chat chat5 = chat4;
                                                ai.db dbVar = new ai.db(context2, chat5, user4, i11, booleanCallback3, e6Var2, 6);
                                                u1 u1Var = new u1(booleanCallback3, 0);
                                                org.telegram.ui.ActionBar.n2 n2Var3 = n2Var2;
                                                if (n2Var3 == null || n2Var3.getParentActivity() == null || chat5 == null) {
                                                    return;
                                                }
                                                Context context3 = n2Var3.getContext();
                                                TLRPC.User currentUser = UserConfig.getInstance(n2Var3.getCurrentAccount()).getCurrentUser();
                                                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat5);
                                                FrameLayout frameLayout = new FrameLayout(context3);
                                                frameLayout.setClipToPadding(false);
                                                frameLayout.setClipChildren(false);
                                                y9 y9Var2 = new y9(context3);
                                                j9 j9Var2 = new j9((org.telegram.ui.ActionBar.e6) null);
                                                j9Var2.r(currentUser);
                                                y9Var2.setRoundRadius(AndroidUtilities.dp(30.0f));
                                                y9Var2.e(currentUser, j9Var2);
                                                frameLayout.addView(y9Var2, w7.x5.a(60.0f, -48.0f, 15.0f, 0.0f, 12.0f, 60, 17));
                                                ImageView imageView = new ImageView(context3);
                                                imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                                imageView.setColorFilter(new PorterDuffColorFilter(n2Var3.getThemedColor(org.telegram.ui.ActionBar.i6.d7), PorterDuff.Mode.SRC_IN));
                                                frameLayout.addView(imageView, w7.x5.a(24.0f, 0.0f, 15.0f, 0.0f, 12.0f, 24, 17));
                                                l3 l3Var = new l3(context3);
                                                j9 j9Var3 = new j9((org.telegram.ui.ActionBar.e6) null);
                                                j9Var3.r(user4);
                                                l3Var.setRoundRadius(AndroidUtilities.dp(30.0f));
                                                l3Var.e(user4, j9Var3);
                                                frameLayout.addView(l3Var, w7.x5.a(60.0f, 48.0f, 15.0f, 0.0f, 12.0f, 60, 17));
                                                y9 y9Var3 = new y9(context3);
                                                j9 j9Var4 = new j9((org.telegram.ui.ActionBar.e6) null);
                                                j9Var4.q(chat5);
                                                y9Var3.setRoundRadius(AndroidUtilities.dp(12.0f));
                                                y9Var3.e(chat5, j9Var4);
                                                frameLayout.addView(y9Var3, w7.x5.a(24.0f, 72.0f, 26.0f, 0.0f, 0.0f, 24, 17));
                                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                                org.telegram.ui.ActionBar.b2 b2Var5 = alertDialog$Builder2.a;
                                                b2Var5.O0 = -1.0f;
                                                b2Var5.V = frameLayout;
                                                b2Var5.R = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannelTitle : R.string.LeaveGroupTitle);
                                                b2Var5.T = AndroidUtilities.replaceTags(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.LeaveChannelNewOwnerText : R.string.LeaveGroupNewOwnerText, UserObject.getUserName(user4), chat5.title));
                                                alertDialog$Builder2.h(LocaleController.getString(R.string.AppointNewOwner), new s(dbVar, 4));
                                                alertDialog$Builder2.i(LocaleController.getString(R.string.Cancel), null);
                                                alertDialog$Builder2.k(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannel : R.string.LeaveMegaMenu), new s(u1Var, 5));
                                                b2Var5.show();
                                                View d = b2Var5.d(-1);
                                                if (d instanceof TextView) {
                                                    ((TextView) d).setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.q7, false));
                                                }
                                            }
                                        });
                                        return;
                                    }
                                    booleanCallback2 = booleanCallback2;
                                }
                                if (!z25 && !zArr2[0]) {
                                    z26 = false;
                                }
                                booleanCallback2.run(z26);
                            }
                        });
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        n2Var.showDialog(b2Var3);
                        textView = (TextView) b2Var3.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.q7, false));
                            return;
                        }
                        return;
                    }
                    string = z20 ? LocaleController.getString(R.string.ClearHistoryCache) : LocaleController.getString(R.string.ClearForMe);
                }
                org.telegram.ui.ActionBar.b2 b2Var32 = b2Var;
                alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.Components.w2
                    @Override // org.telegram.ui.ActionBar.a2
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var4, int i10) {
                        final boolean[] zArr2;
                        boolean z24 = z20;
                        final boolean z25 = z11;
                        final boolean[] zArr3 = zArr;
                        final MessagesStorage.BooleanCallback booleanCallback2 = booleanCallback;
                        boolean z26 = true;
                        if (z24 || z25 || z12) {
                            zArr2 = zArr3;
                        } else {
                            final TLRPC.User user2 = user;
                            boolean isUserSelf = UserObject.isUserSelf(user2);
                            final org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            final boolean z27 = z10;
                            final TLRPC.Chat chat4 = chat3;
                            final boolean z28 = z13;
                            final boolean z29 = z15;
                            final org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                            if (isUserSelf) {
                                g5.s(n2Var2, z27, true, chat4, user2, false, z28, zArr3[0], z29, booleanCallback2, e6Var2);
                                return;
                            }
                            if (user2 != null && zArr3[0]) {
                                MessagesStorage.getInstance(n2Var2.getCurrentAccount()).getMessagesCount(user2.id, new MessagesStorage.IntCallback() { // from class: org.telegram.ui.Components.o1
                                    @Override // org.telegram.messenger.MessagesStorage.IntCallback
                                    public final void run(int i11) {
                                        boolean[] zArr4 = zArr3;
                                        MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                        if (i11 >= 50) {
                                            g5.s(org.telegram.ui.ActionBar.n2.this, z27, true, chat4, user2, false, z28, zArr4[0], z29, booleanCallback3, e6Var2);
                                        } else if (booleanCallback3 != null) {
                                            booleanCallback3.run(zArr4[0]);
                                        }
                                    }
                                });
                                return;
                            }
                            zArr2 = zArr3;
                            if (ChatObject.isChannel(chat4) && chat4.creator && !zArr2[0]) {
                                final of.e g10 = alertDialog$Builder.a.g(-1, true, true);
                                g10.d();
                                TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                                tL_channels_getFutureCreatorAfterLeave.channel = MessagesController.getInputChannel(chat4);
                                final int i11 = currentAccount;
                                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                                org.telegram.messenger.a aVar = new org.telegram.messenger.a();
                                final Context context = parentActivity;
                                connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, aVar, new Utilities.Callback2() { // from class: org.telegram.ui.Components.p1
                                    @Override // org.telegram.messenger.Utilities.Callback2
                                    public final void run(Object obj2, Object obj3) {
                                        TLRPC.User user3 = (TLRPC.User) obj2;
                                        of.e.this.c(false);
                                        TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                        MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                        if (user4 == null) {
                                            booleanCallback3.run(z25 || zArr2[0]);
                                            return;
                                        }
                                        Context context2 = context;
                                        TLRPC.Chat chat5 = chat4;
                                        ai.db dbVar = new ai.db(context2, chat5, user4, i11, booleanCallback3, e6Var2, 6);
                                        u1 u1Var = new u1(booleanCallback3, 0);
                                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var2;
                                        if (n2Var3 == null || n2Var3.getParentActivity() == null || chat5 == null) {
                                            return;
                                        }
                                        Context context3 = n2Var3.getContext();
                                        TLRPC.User currentUser = UserConfig.getInstance(n2Var3.getCurrentAccount()).getCurrentUser();
                                        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat5);
                                        FrameLayout frameLayout = new FrameLayout(context3);
                                        frameLayout.setClipToPadding(false);
                                        frameLayout.setClipChildren(false);
                                        y9 y9Var2 = new y9(context3);
                                        j9 j9Var2 = new j9((org.telegram.ui.ActionBar.e6) null);
                                        j9Var2.r(currentUser);
                                        y9Var2.setRoundRadius(AndroidUtilities.dp(30.0f));
                                        y9Var2.e(currentUser, j9Var2);
                                        frameLayout.addView(y9Var2, w7.x5.a(60.0f, -48.0f, 15.0f, 0.0f, 12.0f, 60, 17));
                                        ImageView imageView = new ImageView(context3);
                                        imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                        imageView.setColorFilter(new PorterDuffColorFilter(n2Var3.getThemedColor(org.telegram.ui.ActionBar.i6.d7), PorterDuff.Mode.SRC_IN));
                                        frameLayout.addView(imageView, w7.x5.a(24.0f, 0.0f, 15.0f, 0.0f, 12.0f, 24, 17));
                                        l3 l3Var = new l3(context3);
                                        j9 j9Var3 = new j9((org.telegram.ui.ActionBar.e6) null);
                                        j9Var3.r(user4);
                                        l3Var.setRoundRadius(AndroidUtilities.dp(30.0f));
                                        l3Var.e(user4, j9Var3);
                                        frameLayout.addView(l3Var, w7.x5.a(60.0f, 48.0f, 15.0f, 0.0f, 12.0f, 60, 17));
                                        y9 y9Var3 = new y9(context3);
                                        j9 j9Var4 = new j9((org.telegram.ui.ActionBar.e6) null);
                                        j9Var4.q(chat5);
                                        y9Var3.setRoundRadius(AndroidUtilities.dp(12.0f));
                                        y9Var3.e(chat5, j9Var4);
                                        frameLayout.addView(y9Var3, w7.x5.a(24.0f, 72.0f, 26.0f, 0.0f, 0.0f, 24, 17));
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                        org.telegram.ui.ActionBar.b2 b2Var5 = alertDialog$Builder2.a;
                                        b2Var5.O0 = -1.0f;
                                        b2Var5.V = frameLayout;
                                        b2Var5.R = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannelTitle : R.string.LeaveGroupTitle);
                                        b2Var5.T = AndroidUtilities.replaceTags(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.LeaveChannelNewOwnerText : R.string.LeaveGroupNewOwnerText, UserObject.getUserName(user4), chat5.title));
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.AppointNewOwner), new s(dbVar, 4));
                                        alertDialog$Builder2.i(LocaleController.getString(R.string.Cancel), null);
                                        alertDialog$Builder2.k(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannel : R.string.LeaveMegaMenu), new s(u1Var, 5));
                                        b2Var5.show();
                                        View d = b2Var5.d(-1);
                                        if (d instanceof TextView) {
                                            ((TextView) d).setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.q7, false));
                                        }
                                    }
                                });
                                return;
                            }
                            booleanCallback2 = booleanCallback2;
                        }
                        if (!z25 && !zArr2[0]) {
                            z26 = false;
                        }
                        booleanCallback2.run(z26);
                    }
                });
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                n2Var.showDialog(b2Var32);
                textView = (TextView) b2Var32.d(-1);
                if (textView != null) {
                }
            }
        } else {
            a2VarArr2 = a2VarArr;
            f7 = 10.0f;
        }
        if (z11 || (((!z12 || z10) && !z22) || UserObject.isDeleted(user) || z23)) {
            if (!z13 || z10 || chat == null) {
                chat3 = chat;
            } else {
                chat3 = chat;
                if (chat3.creator) {
                    z17 = true;
                    if (!z17) {
                        b2Var = b2Var2;
                        z18 = z17;
                        if (user != null) {
                        }
                        if (z11) {
                        }
                        if (!z11) {
                        }
                        org.telegram.ui.ActionBar.b2 b2Var322 = b2Var;
                        alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.Components.w2
                            @Override // org.telegram.ui.ActionBar.a2
                            public final void f(org.telegram.ui.ActionBar.b2 b2Var4, int i10) {
                                final boolean[] zArr2;
                                boolean z24 = z20;
                                final boolean z25 = z11;
                                final boolean[] zArr3 = zArr;
                                final MessagesStorage.BooleanCallback booleanCallback2 = booleanCallback;
                                boolean z26 = true;
                                if (z24 || z25 || z12) {
                                    zArr2 = zArr3;
                                } else {
                                    final TLRPC.User user2 = user;
                                    boolean isUserSelf = UserObject.isUserSelf(user2);
                                    final org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                                    final boolean z27 = z10;
                                    final TLRPC.Chat chat4 = chat3;
                                    final boolean z28 = z13;
                                    final boolean z29 = z15;
                                    final org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                                    if (isUserSelf) {
                                        g5.s(n2Var2, z27, true, chat4, user2, false, z28, zArr3[0], z29, booleanCallback2, e6Var2);
                                        return;
                                    }
                                    if (user2 != null && zArr3[0]) {
                                        MessagesStorage.getInstance(n2Var2.getCurrentAccount()).getMessagesCount(user2.id, new MessagesStorage.IntCallback() { // from class: org.telegram.ui.Components.o1
                                            @Override // org.telegram.messenger.MessagesStorage.IntCallback
                                            public final void run(int i11) {
                                                boolean[] zArr4 = zArr3;
                                                MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                                if (i11 >= 50) {
                                                    g5.s(org.telegram.ui.ActionBar.n2.this, z27, true, chat4, user2, false, z28, zArr4[0], z29, booleanCallback3, e6Var2);
                                                } else if (booleanCallback3 != null) {
                                                    booleanCallback3.run(zArr4[0]);
                                                }
                                            }
                                        });
                                        return;
                                    }
                                    zArr2 = zArr3;
                                    if (ChatObject.isChannel(chat4) && chat4.creator && !zArr2[0]) {
                                        final of.e g10 = alertDialog$Builder.a.g(-1, true, true);
                                        g10.d();
                                        TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                                        tL_channels_getFutureCreatorAfterLeave.channel = MessagesController.getInputChannel(chat4);
                                        final int i11 = currentAccount;
                                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                                        org.telegram.messenger.a aVar = new org.telegram.messenger.a();
                                        final Context context = parentActivity;
                                        connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, aVar, new Utilities.Callback2() { // from class: org.telegram.ui.Components.p1
                                            @Override // org.telegram.messenger.Utilities.Callback2
                                            public final void run(Object obj2, Object obj3) {
                                                TLRPC.User user3 = (TLRPC.User) obj2;
                                                of.e.this.c(false);
                                                TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                                MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                                if (user4 == null) {
                                                    booleanCallback3.run(z25 || zArr2[0]);
                                                    return;
                                                }
                                                Context context2 = context;
                                                TLRPC.Chat chat5 = chat4;
                                                ai.db dbVar = new ai.db(context2, chat5, user4, i11, booleanCallback3, e6Var2, 6);
                                                u1 u1Var = new u1(booleanCallback3, 0);
                                                org.telegram.ui.ActionBar.n2 n2Var3 = n2Var2;
                                                if (n2Var3 == null || n2Var3.getParentActivity() == null || chat5 == null) {
                                                    return;
                                                }
                                                Context context3 = n2Var3.getContext();
                                                TLRPC.User currentUser = UserConfig.getInstance(n2Var3.getCurrentAccount()).getCurrentUser();
                                                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat5);
                                                FrameLayout frameLayout = new FrameLayout(context3);
                                                frameLayout.setClipToPadding(false);
                                                frameLayout.setClipChildren(false);
                                                y9 y9Var2 = new y9(context3);
                                                j9 j9Var2 = new j9((org.telegram.ui.ActionBar.e6) null);
                                                j9Var2.r(currentUser);
                                                y9Var2.setRoundRadius(AndroidUtilities.dp(30.0f));
                                                y9Var2.e(currentUser, j9Var2);
                                                frameLayout.addView(y9Var2, w7.x5.a(60.0f, -48.0f, 15.0f, 0.0f, 12.0f, 60, 17));
                                                ImageView imageView = new ImageView(context3);
                                                imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                                imageView.setColorFilter(new PorterDuffColorFilter(n2Var3.getThemedColor(org.telegram.ui.ActionBar.i6.d7), PorterDuff.Mode.SRC_IN));
                                                frameLayout.addView(imageView, w7.x5.a(24.0f, 0.0f, 15.0f, 0.0f, 12.0f, 24, 17));
                                                l3 l3Var = new l3(context3);
                                                j9 j9Var3 = new j9((org.telegram.ui.ActionBar.e6) null);
                                                j9Var3.r(user4);
                                                l3Var.setRoundRadius(AndroidUtilities.dp(30.0f));
                                                l3Var.e(user4, j9Var3);
                                                frameLayout.addView(l3Var, w7.x5.a(60.0f, 48.0f, 15.0f, 0.0f, 12.0f, 60, 17));
                                                y9 y9Var3 = new y9(context3);
                                                j9 j9Var4 = new j9((org.telegram.ui.ActionBar.e6) null);
                                                j9Var4.q(chat5);
                                                y9Var3.setRoundRadius(AndroidUtilities.dp(12.0f));
                                                y9Var3.e(chat5, j9Var4);
                                                frameLayout.addView(y9Var3, w7.x5.a(24.0f, 72.0f, 26.0f, 0.0f, 0.0f, 24, 17));
                                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                                org.telegram.ui.ActionBar.b2 b2Var5 = alertDialog$Builder2.a;
                                                b2Var5.O0 = -1.0f;
                                                b2Var5.V = frameLayout;
                                                b2Var5.R = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannelTitle : R.string.LeaveGroupTitle);
                                                b2Var5.T = AndroidUtilities.replaceTags(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.LeaveChannelNewOwnerText : R.string.LeaveGroupNewOwnerText, UserObject.getUserName(user4), chat5.title));
                                                alertDialog$Builder2.h(LocaleController.getString(R.string.AppointNewOwner), new s(dbVar, 4));
                                                alertDialog$Builder2.i(LocaleController.getString(R.string.Cancel), null);
                                                alertDialog$Builder2.k(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannel : R.string.LeaveMegaMenu), new s(u1Var, 5));
                                                b2Var5.show();
                                                View d = b2Var5.d(-1);
                                                if (d instanceof TextView) {
                                                    ((TextView) d).setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.q7, false));
                                                }
                                            }
                                        });
                                        return;
                                    }
                                    booleanCallback2 = booleanCallback2;
                                }
                                if (!z25 && !zArr2[0]) {
                                    z26 = false;
                                }
                                booleanCallback2.run(z26);
                            }
                        });
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        n2Var.showDialog(b2Var322);
                        textView = (TextView) b2Var322.d(-1);
                        if (textView != null) {
                        }
                    }
                }
            }
            z17 = false;
            if (!z17) {
            }
        } else {
            chat3 = chat;
            z17 = false;
        }
        org.telegram.ui.Cells.a2 a2Var3 = new org.telegram.ui.Cells.a2(parentActivity, 1, e6Var);
        a2VarArr2[0] = a2Var3;
        a2Var3.setBackground(org.telegram.ui.ActionBar.i6.L0(false));
        if (z17) {
            if (!ChatObject.isChannel(chat3) || chat3.megagroup) {
                a2VarArr2[0].e(LocaleController.getString(R.string.DeleteGroupForAll), "", false, false, false);
            } else {
                a2VarArr2[0].e(LocaleController.getString(R.string.DeleteChannelForAll), "", false, false, false);
            }
        } else if (z10) {
            a2VarArr2[0].e(LocaleController.formatString(R.string.ClearHistoryOptionAlso, UserObject.getFirstName(user)), "", false, false, false);
        } else {
            z19 = true;
            a2VarArr2[0].e(LocaleController.formatString(R.string.DeleteMessagesOptionAlso, UserObject.getFirstName(user)), "", false, false, false);
            a2VarArr2[0].setMultiline(z19);
            b2Var = b2Var2;
            a2VarArr2[0].setPadding(!LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), AndroidUtilities.dp(f7), !LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), AndroidUtilities.dp(f7));
            k3Var.addView(a2VarArr2[0], w7.x5.a(48.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 83));
            ai.t4 t4Var = new ai.t4(z17, chat3, alertDialog$Builder, zArr);
            a2VarArr2[0].setOnClickListener(new org.telegram.ui.sf(12, zArr, t4Var));
            if (z14) {
                org.telegram.ui.Cells.a2 a2Var4 = a2VarArr2[0];
                zArr[0] = true;
                a2Var4.c(true, false);
                t4Var.run();
            }
            z18 = z17;
            if (user != null) {
            }
            if (z11) {
            }
            if (!z11) {
            }
            org.telegram.ui.ActionBar.b2 b2Var3222 = b2Var;
            alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.Components.w2
                @Override // org.telegram.ui.ActionBar.a2
                public final void f(org.telegram.ui.ActionBar.b2 b2Var4, int i10) {
                    final boolean[] zArr2;
                    boolean z24 = z20;
                    final boolean z25 = z11;
                    final boolean[] zArr3 = zArr;
                    final MessagesStorage.BooleanCallback booleanCallback2 = booleanCallback;
                    boolean z26 = true;
                    if (z24 || z25 || z12) {
                        zArr2 = zArr3;
                    } else {
                        final TLRPC.User user2 = user;
                        boolean isUserSelf = UserObject.isUserSelf(user2);
                        final org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        final boolean z27 = z10;
                        final TLRPC.Chat chat4 = chat3;
                        final boolean z28 = z13;
                        final boolean z29 = z15;
                        final org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                        if (isUserSelf) {
                            g5.s(n2Var2, z27, true, chat4, user2, false, z28, zArr3[0], z29, booleanCallback2, e6Var2);
                            return;
                        }
                        if (user2 != null && zArr3[0]) {
                            MessagesStorage.getInstance(n2Var2.getCurrentAccount()).getMessagesCount(user2.id, new MessagesStorage.IntCallback() { // from class: org.telegram.ui.Components.o1
                                @Override // org.telegram.messenger.MessagesStorage.IntCallback
                                public final void run(int i11) {
                                    boolean[] zArr4 = zArr3;
                                    MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                    if (i11 >= 50) {
                                        g5.s(org.telegram.ui.ActionBar.n2.this, z27, true, chat4, user2, false, z28, zArr4[0], z29, booleanCallback3, e6Var2);
                                    } else if (booleanCallback3 != null) {
                                        booleanCallback3.run(zArr4[0]);
                                    }
                                }
                            });
                            return;
                        }
                        zArr2 = zArr3;
                        if (ChatObject.isChannel(chat4) && chat4.creator && !zArr2[0]) {
                            final of.e g10 = alertDialog$Builder.a.g(-1, true, true);
                            g10.d();
                            TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                            tL_channels_getFutureCreatorAfterLeave.channel = MessagesController.getInputChannel(chat4);
                            final int i11 = currentAccount;
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                            org.telegram.messenger.a aVar = new org.telegram.messenger.a();
                            final Context context = parentActivity;
                            connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, aVar, new Utilities.Callback2() { // from class: org.telegram.ui.Components.p1
                                @Override // org.telegram.messenger.Utilities.Callback2
                                public final void run(Object obj2, Object obj3) {
                                    TLRPC.User user3 = (TLRPC.User) obj2;
                                    of.e.this.c(false);
                                    TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                    MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                    if (user4 == null) {
                                        booleanCallback3.run(z25 || zArr2[0]);
                                        return;
                                    }
                                    Context context2 = context;
                                    TLRPC.Chat chat5 = chat4;
                                    ai.db dbVar = new ai.db(context2, chat5, user4, i11, booleanCallback3, e6Var2, 6);
                                    u1 u1Var = new u1(booleanCallback3, 0);
                                    org.telegram.ui.ActionBar.n2 n2Var3 = n2Var2;
                                    if (n2Var3 == null || n2Var3.getParentActivity() == null || chat5 == null) {
                                        return;
                                    }
                                    Context context3 = n2Var3.getContext();
                                    TLRPC.User currentUser = UserConfig.getInstance(n2Var3.getCurrentAccount()).getCurrentUser();
                                    boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat5);
                                    FrameLayout frameLayout = new FrameLayout(context3);
                                    frameLayout.setClipToPadding(false);
                                    frameLayout.setClipChildren(false);
                                    y9 y9Var2 = new y9(context3);
                                    j9 j9Var2 = new j9((org.telegram.ui.ActionBar.e6) null);
                                    j9Var2.r(currentUser);
                                    y9Var2.setRoundRadius(AndroidUtilities.dp(30.0f));
                                    y9Var2.e(currentUser, j9Var2);
                                    frameLayout.addView(y9Var2, w7.x5.a(60.0f, -48.0f, 15.0f, 0.0f, 12.0f, 60, 17));
                                    ImageView imageView = new ImageView(context3);
                                    imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                    imageView.setColorFilter(new PorterDuffColorFilter(n2Var3.getThemedColor(org.telegram.ui.ActionBar.i6.d7), PorterDuff.Mode.SRC_IN));
                                    frameLayout.addView(imageView, w7.x5.a(24.0f, 0.0f, 15.0f, 0.0f, 12.0f, 24, 17));
                                    l3 l3Var = new l3(context3);
                                    j9 j9Var3 = new j9((org.telegram.ui.ActionBar.e6) null);
                                    j9Var3.r(user4);
                                    l3Var.setRoundRadius(AndroidUtilities.dp(30.0f));
                                    l3Var.e(user4, j9Var3);
                                    frameLayout.addView(l3Var, w7.x5.a(60.0f, 48.0f, 15.0f, 0.0f, 12.0f, 60, 17));
                                    y9 y9Var3 = new y9(context3);
                                    j9 j9Var4 = new j9((org.telegram.ui.ActionBar.e6) null);
                                    j9Var4.q(chat5);
                                    y9Var3.setRoundRadius(AndroidUtilities.dp(12.0f));
                                    y9Var3.e(chat5, j9Var4);
                                    frameLayout.addView(y9Var3, w7.x5.a(24.0f, 72.0f, 26.0f, 0.0f, 0.0f, 24, 17));
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                    org.telegram.ui.ActionBar.b2 b2Var5 = alertDialog$Builder2.a;
                                    b2Var5.O0 = -1.0f;
                                    b2Var5.V = frameLayout;
                                    b2Var5.R = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannelTitle : R.string.LeaveGroupTitle);
                                    b2Var5.T = AndroidUtilities.replaceTags(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.LeaveChannelNewOwnerText : R.string.LeaveGroupNewOwnerText, UserObject.getUserName(user4), chat5.title));
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.AppointNewOwner), new s(dbVar, 4));
                                    alertDialog$Builder2.i(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder2.k(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannel : R.string.LeaveMegaMenu), new s(u1Var, 5));
                                    b2Var5.show();
                                    View d = b2Var5.d(-1);
                                    if (d instanceof TextView) {
                                        ((TextView) d).setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.q7, false));
                                    }
                                }
                            });
                            return;
                        }
                        booleanCallback2 = booleanCallback2;
                    }
                    if (!z25 && !zArr2[0]) {
                        z26 = false;
                    }
                    booleanCallback2.run(z26);
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            n2Var.showDialog(b2Var3222);
            textView = (TextView) b2Var3222.d(-1);
            if (textView != null) {
            }
        }
        z19 = true;
        a2VarArr2[0].setMultiline(z19);
        b2Var = b2Var2;
        a2VarArr2[0].setPadding(!LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), AndroidUtilities.dp(f7), !LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), AndroidUtilities.dp(f7));
        k3Var.addView(a2VarArr2[0], w7.x5.a(48.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 83));
        ai.t4 t4Var2 = new ai.t4(z17, chat3, alertDialog$Builder, zArr);
        a2VarArr2[0].setOnClickListener(new org.telegram.ui.sf(12, zArr, t4Var2));
        if (z14) {
        }
        z18 = z17;
        if (user != null) {
        }
        if (z11) {
        }
        if (!z11) {
        }
        org.telegram.ui.ActionBar.b2 b2Var32222 = b2Var;
        alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.Components.w2
            @Override // org.telegram.ui.ActionBar.a2
            public final void f(org.telegram.ui.ActionBar.b2 b2Var4, int i10) {
                final boolean[] zArr2;
                boolean z24 = z20;
                final boolean z25 = z11;
                final boolean[] zArr3 = zArr;
                final MessagesStorage.BooleanCallback booleanCallback2 = booleanCallback;
                boolean z26 = true;
                if (z24 || z25 || z12) {
                    zArr2 = zArr3;
                } else {
                    final TLRPC.User user2 = user;
                    boolean isUserSelf = UserObject.isUserSelf(user2);
                    final org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                    final boolean z27 = z10;
                    final TLRPC.Chat chat4 = chat3;
                    final boolean z28 = z13;
                    final boolean z29 = z15;
                    final org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                    if (isUserSelf) {
                        g5.s(n2Var2, z27, true, chat4, user2, false, z28, zArr3[0], z29, booleanCallback2, e6Var2);
                        return;
                    }
                    if (user2 != null && zArr3[0]) {
                        MessagesStorage.getInstance(n2Var2.getCurrentAccount()).getMessagesCount(user2.id, new MessagesStorage.IntCallback() { // from class: org.telegram.ui.Components.o1
                            @Override // org.telegram.messenger.MessagesStorage.IntCallback
                            public final void run(int i11) {
                                boolean[] zArr4 = zArr3;
                                MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                if (i11 >= 50) {
                                    g5.s(org.telegram.ui.ActionBar.n2.this, z27, true, chat4, user2, false, z28, zArr4[0], z29, booleanCallback3, e6Var2);
                                } else if (booleanCallback3 != null) {
                                    booleanCallback3.run(zArr4[0]);
                                }
                            }
                        });
                        return;
                    }
                    zArr2 = zArr3;
                    if (ChatObject.isChannel(chat4) && chat4.creator && !zArr2[0]) {
                        final of.e g10 = alertDialog$Builder.a.g(-1, true, true);
                        g10.d();
                        TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                        tL_channels_getFutureCreatorAfterLeave.channel = MessagesController.getInputChannel(chat4);
                        final int i11 = currentAccount;
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                        org.telegram.messenger.a aVar = new org.telegram.messenger.a();
                        final Context context = parentActivity;
                        connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, aVar, new Utilities.Callback2() { // from class: org.telegram.ui.Components.p1
                            @Override // org.telegram.messenger.Utilities.Callback2
                            public final void run(Object obj2, Object obj3) {
                                TLRPC.User user3 = (TLRPC.User) obj2;
                                of.e.this.c(false);
                                TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                if (user4 == null) {
                                    booleanCallback3.run(z25 || zArr2[0]);
                                    return;
                                }
                                Context context2 = context;
                                TLRPC.Chat chat5 = chat4;
                                ai.db dbVar = new ai.db(context2, chat5, user4, i11, booleanCallback3, e6Var2, 6);
                                u1 u1Var = new u1(booleanCallback3, 0);
                                org.telegram.ui.ActionBar.n2 n2Var3 = n2Var2;
                                if (n2Var3 == null || n2Var3.getParentActivity() == null || chat5 == null) {
                                    return;
                                }
                                Context context3 = n2Var3.getContext();
                                TLRPC.User currentUser = UserConfig.getInstance(n2Var3.getCurrentAccount()).getCurrentUser();
                                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat5);
                                FrameLayout frameLayout = new FrameLayout(context3);
                                frameLayout.setClipToPadding(false);
                                frameLayout.setClipChildren(false);
                                y9 y9Var2 = new y9(context3);
                                j9 j9Var2 = new j9((org.telegram.ui.ActionBar.e6) null);
                                j9Var2.r(currentUser);
                                y9Var2.setRoundRadius(AndroidUtilities.dp(30.0f));
                                y9Var2.e(currentUser, j9Var2);
                                frameLayout.addView(y9Var2, w7.x5.a(60.0f, -48.0f, 15.0f, 0.0f, 12.0f, 60, 17));
                                ImageView imageView = new ImageView(context3);
                                imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                imageView.setColorFilter(new PorterDuffColorFilter(n2Var3.getThemedColor(org.telegram.ui.ActionBar.i6.d7), PorterDuff.Mode.SRC_IN));
                                frameLayout.addView(imageView, w7.x5.a(24.0f, 0.0f, 15.0f, 0.0f, 12.0f, 24, 17));
                                l3 l3Var = new l3(context3);
                                j9 j9Var3 = new j9((org.telegram.ui.ActionBar.e6) null);
                                j9Var3.r(user4);
                                l3Var.setRoundRadius(AndroidUtilities.dp(30.0f));
                                l3Var.e(user4, j9Var3);
                                frameLayout.addView(l3Var, w7.x5.a(60.0f, 48.0f, 15.0f, 0.0f, 12.0f, 60, 17));
                                y9 y9Var3 = new y9(context3);
                                j9 j9Var4 = new j9((org.telegram.ui.ActionBar.e6) null);
                                j9Var4.q(chat5);
                                y9Var3.setRoundRadius(AndroidUtilities.dp(12.0f));
                                y9Var3.e(chat5, j9Var4);
                                frameLayout.addView(y9Var3, w7.x5.a(24.0f, 72.0f, 26.0f, 0.0f, 0.0f, 24, 17));
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                org.telegram.ui.ActionBar.b2 b2Var5 = alertDialog$Builder2.a;
                                b2Var5.O0 = -1.0f;
                                b2Var5.V = frameLayout;
                                b2Var5.R = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannelTitle : R.string.LeaveGroupTitle);
                                b2Var5.T = AndroidUtilities.replaceTags(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.LeaveChannelNewOwnerText : R.string.LeaveGroupNewOwnerText, UserObject.getUserName(user4), chat5.title));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.AppointNewOwner), new s(dbVar, 4));
                                alertDialog$Builder2.i(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder2.k(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannel : R.string.LeaveMegaMenu), new s(u1Var, 5));
                                b2Var5.show();
                                View d = b2Var5.d(-1);
                                if (d instanceof TextView) {
                                    ((TextView) d).setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.q7, false));
                                }
                            }
                        });
                        return;
                    }
                    booleanCallback2 = booleanCallback2;
                }
                if (!z25 && !zArr2[0]) {
                    z26 = false;
                }
                booleanCallback2.run(z26);
            }
        });
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        n2Var.showDialog(b2Var32222);
        textView = (TextView) b2Var32222.d(-1);
        if (textView != null) {
        }
    }

    public static void s0(int i10, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        if (i10 == 0 || n2Var == null || n2Var.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity(), 0, e6Var);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.UnableForward);
        if (i10 == 1) {
            alertDialog$Builder.a.T = LocaleController.getString(R.string.ErrorSendRestrictedStickers);
        } else if (i10 == 2) {
            alertDialog$Builder.a.T = LocaleController.getString(R.string.ErrorSendRestrictedMedia);
        } else if (i10 == 3) {
            alertDialog$Builder.a.T = LocaleController.getString(R.string.ErrorSendRestrictedPolls);
        } else if (i10 == 4) {
            alertDialog$Builder.a.T = LocaleController.getString(R.string.ErrorSendRestrictedStickersAll);
        } else if (i10 == 5) {
            alertDialog$Builder.a.T = LocaleController.getString(R.string.ErrorSendRestrictedMediaAll);
        } else if (i10 == 6) {
            alertDialog$Builder.a.T = LocaleController.getString(R.string.ErrorSendRestrictedPollsAll);
        } else if (i10 == 7) {
            alertDialog$Builder.a.T = LocaleController.getString(R.string.ErrorSendRestrictedPrivacyVoiceMessages);
        } else if (i10 == 8) {
            alertDialog$Builder.a.T = LocaleController.getString(R.string.ErrorSendRestrictedPrivacyVideoMessages);
        } else if (i10 == 9) {
            alertDialog$Builder.a.T = LocaleController.getString(R.string.ErrorSendRestrictedVideoAll);
        } else if (i10 == 10) {
            alertDialog$Builder.a.T = LocaleController.getString(R.string.ErrorSendRestrictedPhotoAll);
        } else if (i10 == 11) {
            alertDialog$Builder.a.T = LocaleController.getString(R.string.ErrorSendRestrictedVideo);
        } else if (i10 == 12) {
            alertDialog$Builder.a.T = LocaleController.getString(R.string.ErrorSendRestrictedPhoto);
        } else if (i10 == 13) {
            alertDialog$Builder.a.T = LocaleController.getString(R.string.ErrorSendRestrictedVoiceAll);
        } else if (i10 == 14) {
            alertDialog$Builder.a.T = LocaleController.getString(R.string.ErrorSendRestrictedVoice);
        } else if (i10 == 15) {
            alertDialog$Builder.a.T = LocaleController.getString(R.string.ErrorSendRestrictedRoundAll);
        } else if (i10 == 16) {
            alertDialog$Builder.a.T = LocaleController.getString(R.string.ErrorSendRestrictedRound);
        } else if (i10 == 17) {
            alertDialog$Builder.a.T = LocaleController.getString(R.string.ErrorSendRestrictedDocumentsAll);
        } else if (i10 == 18) {
            alertDialog$Builder.a.T = LocaleController.getString(R.string.ErrorSendRestrictedDocuments);
        } else if (i10 == 19) {
            alertDialog$Builder.a.T = LocaleController.getString(R.string.ErrorSendRestrictedMusicAll);
        } else if (i10 == 20) {
            alertDialog$Builder.a.T = LocaleController.getString(R.string.ErrorSendRestrictedMusic);
        } else if (i10 == 21) {
            alertDialog$Builder.a.T = LocaleController.getString(R.string.ErrorSendRestrictedTodoAll);
        } else if (i10 == 22) {
            alertDialog$Builder.a.T = LocaleController.getString(R.string.ErrorSendRestrictedTodo);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        n2Var.showDialog(alertDialog$Builder.a, true, null);
    }

    public static org.telegram.ui.ActionBar.b2 t(Activity activity, final long j3, final long j10, final int i10, final Runnable runnable, org.telegram.ui.ActionBar.e6 e6Var) {
        int i11;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
        final String sharedPrefKey = NotificationsController.getSharedPrefKey(j3, j10);
        if (j3 != 0) {
            StringBuilder sb2 = new StringBuilder("color_");
            sb2.append(sharedPrefKey);
            i11 = notificationsSettings.contains(sb2.toString()) ? org.telegram.messenger.q.c("color_", sharedPrefKey, notificationsSettings, -16776961) : DialogObject.isChatDialog(j3) ? notificationsSettings.getInt("GroupLed", -16776961) : notificationsSettings.getInt("MessagesLed", -16776961);
        } else {
            i11 = i10 == 1 ? notificationsSettings.getInt("MessagesLed", -16776961) : i10 == 0 ? notificationsSettings.getInt("GroupLed", -16776961) : i10 == 3 ? notificationsSettings.getInt("StoriesLed", -16776961) : (i10 == 5 || i10 == 4) ? notificationsSettings.getInt("ReactionsLed", -16776961) : notificationsSettings.getInt("ChannelLed", -16776961);
        }
        LinearLayout e7 = org.telegram.messenger.q.e(activity, 1);
        String[] strArr = {LocaleController.getString(R.string.ColorRed), LocaleController.getString(R.string.ColorOrange), LocaleController.getString(R.string.ColorYellow), LocaleController.getString(R.string.ColorGreen), LocaleController.getString(R.string.ColorCyan), LocaleController.getString(R.string.ColorBlue), LocaleController.getString(R.string.ColorViolet), LocaleController.getString(R.string.ColorPink), LocaleController.getString(R.string.ColorWhite)};
        final int[] iArr = {i11};
        for (int i12 = 0; i12 < 9; i12++) {
            org.telegram.ui.Cells.l6 l6Var = new org.telegram.ui.Cells.l6(activity, e6Var);
            l6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            l6Var.setTag(Integer.valueOf(i12));
            int i13 = org.telegram.ui.Cells.y8.e[i12];
            l6Var.a(i13, i13);
            l6Var.b(strArr[i12], i11 == org.telegram.ui.Cells.y8.f[i12]);
            e7.addView(l6Var);
            l6Var.setOnClickListener(new q0(e7, iArr));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, e6Var);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.LedColor);
        alertDialog$Builder.n(e7);
        alertDialog$Builder.k(LocaleController.getString(R.string.Set), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.Components.x2
            @Override // org.telegram.ui.ActionBar.a2
            public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i14) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                long j11 = j3;
                int[] iArr2 = iArr;
                if (j11 != 0) {
                    edit.putInt(sc.v.i("color_", sharedPrefKey), iArr2[0]);
                    NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannel(j11, j10);
                } else {
                    int i15 = i10;
                    if (i15 == 1) {
                        edit.putInt("MessagesLed", iArr2[0]);
                    } else if (i15 == 0) {
                        edit.putInt("GroupLed", iArr2[0]);
                    } else if (i15 == 3) {
                        edit.putInt("StoriesLed", iArr2[0]);
                    } else if (i15 == 5 || i15 == 4) {
                        edit.putInt("ReactionLed", iArr2[0]);
                    } else {
                        edit.putInt("ChannelLed", iArr2[0]);
                    }
                    NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannelGlobal(i15);
                }
                edit.commit();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        alertDialog$Builder.i(LocaleController.getString(R.string.LedDisabled), new j2.d(j3, i10, runnable, 5));
        if (j3 != 0) {
            alertDialog$Builder.h(LocaleController.getString(R.string.Default), new org.telegram.ui.o(29, sharedPrefKey, runnable));
        }
        return alertDialog$Builder.a;
    }

    public static org.telegram.ui.ActionBar.b2 t0(org.telegram.ui.ActionBar.n2 n2Var, String str, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        if (n2Var == null) {
            n2Var = LaunchActivity.U();
        }
        if (str2 == null || n2Var == null || n2Var.getParentActivity() == null) {
            return null;
        }
        org.telegram.ui.ActionBar.b2 b2Var = N(n2Var.getParentActivity(), str, str2, null, null, e6Var).a;
        n2Var.showDialog(b2Var);
        return b2Var;
    }

    public static void u(org.telegram.ui.ActionBar.n2 n2Var, String str, String str2, String str3) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity());
        String string = LocaleController.getString(R.string.ContactNotRegisteredTitle);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.R = string;
        b2Var.T = LocaleController.formatString("ContactNotRegistered", R.string.ContactNotRegistered, ContactsController.formatName(str, str2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Invite), new org.telegram.ui.o(26, str3, n2Var));
        n2Var.showDialog(b2Var);
    }

    public static org.telegram.ui.ActionBar.b2 u0(org.telegram.ui.ActionBar.n2 n2Var, String str, CharSequence charSequence, String str2, boolean z10, Runnable runnable) {
        TextView textView;
        org.telegram.ui.ActionBar.b2 O = O(n2Var.getContext(), n2Var.getResourceProvider(), str, charSequence, str2, runnable);
        n2Var.showDialog(O);
        if (z10 && (textView = (TextView) O.d(-1)) != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.q7, false));
        }
        return O;
    }

    public static AlertDialog$Builder v(Activity activity, final MessagesStorage.IntCallback intCallback) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.m(R.raw.permission_request_contacts, 72, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.L5, false), null);
        alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.ContactsPermissionAlert));
        final int i10 = 1;
        alertDialog$Builder.k(LocaleController.getString(R.string.ContactsPermissionAlertContinue), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.Components.o0
            @Override // org.telegram.ui.ActionBar.a2
            public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                switch (i10) {
                    case 0:
                        intCallback.run(0);
                        break;
                    default:
                        intCallback.run(1);
                        break;
                }
            }
        });
        final int i11 = 0;
        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.Components.o0
            @Override // org.telegram.ui.ActionBar.a2
            public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i112) {
                switch (i11) {
                    case 0:
                        intCallback.run(0);
                        break;
                    default:
                        intCallback.run(1);
                        break;
                }
            }
        });
        return alertDialog$Builder;
    }

    public static void v0(org.telegram.ui.ActionBar.n2 n2Var, String str) {
        if (str == null) {
            return;
        }
        Toast.makeText((n2Var == null || n2Var.getParentActivity() == null) ? ApplicationLoader.applicationContext : n2Var.getParentActivity(), str, 1).show();
    }

    public static AlertDialog$Builder w(Context context, int i10, int i11, int i12, int i13, int i14, int i15, String str, final boolean z10, gg.c2 c2Var) {
        if (context == null) {
            return null;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        final ud0 ud0Var = new ud0(context, null);
        final ud0 ud0Var2 = new ud0(context, null);
        final ud0 ud0Var3 = new ud0(context, null);
        linearLayout.addView(ud0Var2, w7.x5.l(0.3f, 0, -2));
        final int i16 = 0;
        ud0Var2.setOnScrollListener(new rd0() { // from class: org.telegram.ui.Components.v1
            @Override // org.telegram.ui.Components.rd0
            public final void n(int i17) {
                switch (i16) {
                    case 0:
                        if (z10 && i17 == 0) {
                            g5.c(ud0Var2, ud0Var, ud0Var3);
                            break;
                        }
                        break;
                    case 1:
                        if (z10 && i17 == 0) {
                            g5.c(ud0Var2, ud0Var, ud0Var3);
                            break;
                        }
                        break;
                    default:
                        if (z10 && i17 == 0) {
                            g5.c(ud0Var2, ud0Var, ud0Var3);
                            break;
                        }
                        break;
                }
            }
        });
        ud0Var.setMinValue(0);
        ud0Var.setMaxValue(11);
        linearLayout.addView(ud0Var, w7.x5.l(0.3f, 0, -2));
        ud0Var.setFormatter(new org.telegram.ui.nr(19));
        ud0Var.setOnValueChangedListener(new l0(ud0Var2, ud0Var, ud0Var3, 1));
        final int i17 = 1;
        ud0Var.setOnScrollListener(new rd0() { // from class: org.telegram.ui.Components.v1
            @Override // org.telegram.ui.Components.rd0
            public final void n(int i172) {
                switch (i17) {
                    case 0:
                        if (z10 && i172 == 0) {
                            g5.c(ud0Var2, ud0Var, ud0Var3);
                            break;
                        }
                        break;
                    case 1:
                        if (z10 && i172 == 0) {
                            g5.c(ud0Var2, ud0Var, ud0Var3);
                            break;
                        }
                        break;
                    default:
                        if (z10 && i172 == 0) {
                            g5.c(ud0Var2, ud0Var, ud0Var3);
                            break;
                        }
                        break;
                }
            }
        });
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i18 = calendar.get(1);
        ud0Var3.setMinValue(i10 + i18);
        ud0Var3.setMaxValue(i11 + i18);
        ud0Var3.setValue(i18 + i12);
        linearLayout.addView(ud0Var3, w7.x5.l(0.4f, 0, -2));
        ud0Var3.setOnValueChangedListener(new l0(ud0Var2, ud0Var, ud0Var3, 2));
        final int i19 = 2;
        ud0Var3.setOnScrollListener(new rd0() { // from class: org.telegram.ui.Components.v1
            @Override // org.telegram.ui.Components.rd0
            public final void n(int i172) {
                switch (i19) {
                    case 0:
                        if (z10 && i172 == 0) {
                            g5.c(ud0Var2, ud0Var, ud0Var3);
                            break;
                        }
                        break;
                    case 1:
                        if (z10 && i172 == 0) {
                            g5.c(ud0Var2, ud0Var, ud0Var3);
                            break;
                        }
                        break;
                    default:
                        if (z10 && i172 == 0) {
                            g5.c(ud0Var2, ud0Var, ud0Var3);
                            break;
                        }
                        break;
                }
            }
        });
        x0(ud0Var2, ud0Var, ud0Var3);
        if (z10) {
            c(ud0Var2, ud0Var, ud0Var3);
        }
        if (i13 != -1) {
            ud0Var2.setValue(i13);
            ud0Var.setValue(i14);
            ud0Var3.setValue(i15);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.a.R = str;
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.k(LocaleController.getString(R.string.Set), new org.telegram.messenger.mk(z10, ud0Var2, ud0Var, ud0Var3, c2Var));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.b2 w0(Context context, String str, boolean z10) {
        if (context == null || str == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.R = string;
        b2Var.T = str;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        if (z10) {
            alertDialog$Builder.h(LocaleController.getString(R.string.UpdateApp), new j0(context, 2));
        }
        return alertDialog$Builder.o();
    }

    public static void x(Context context, String str, String str2, long j3, f5 f5Var) {
        if (context == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.j5, false);
        int x03 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.h5, false);
        org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Ji, false);
        org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Ni, false);
        org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.E8, false);
        org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.G8, false);
        org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.i6, false);
        int x04 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Sh, false);
        int x05 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Oh, false);
        int x06 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Qh, false);
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, null);
        a3Var.a();
        ud0 ud0Var = new ud0(context, null);
        ud0Var.setTextColor(x02);
        ud0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        ud0Var.setItemCount(5);
        z3 z3Var = new z3(context, null);
        z3Var.setItemCount(5);
        z3Var.setTextColor(x02);
        z3Var.setTextOffset(-AndroidUtilities.dp(10.0f));
        b4 b4Var = new b4(context, null);
        b4Var.setItemCount(5);
        b4Var.setTextColor(x02);
        b4Var.setTextOffset(-AndroidUtilities.dp(34.0f));
        ud0 ud0Var2 = ud0Var;
        y3 y3Var = new y3(context, ud0Var2, z3Var, b4Var, 1);
        y3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        y3Var.addView(frameLayout, w7.x5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        org.telegram.messenger.q.m(20.0f, x02, 1, textView);
        frameLayout.addView(textView, w7.x5.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
        textView.setOnTouchListener(new bi.d(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        y3Var.addView(linearLayout, w7.x5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        ai.q4 q4Var = new ai.q4(context, 15);
        linearLayout.addView(ud0Var2, w7.x5.l(0.5f, 0, 270));
        ud0Var2.setMinValue(0);
        ud0Var2.setMaxValue(365);
        ud0Var2.setWrapSelectorWheel(false);
        ud0Var2.setFormatter(new org.telegram.ui.nr(22));
        ai.r5 r5Var = new ai.r5(ud0Var2, z3Var, b4Var, 18);
        ud0Var2.setOnValueChangedListener(r5Var);
        z3Var.setMinValue(0);
        z3Var.setMaxValue(23);
        linearLayout.addView(z3Var, w7.x5.l(0.2f, 0, 270));
        z3Var.setFormatter(new org.telegram.ui.nr(23));
        z3Var.setOnValueChangedListener(r5Var);
        b4Var.setMinValue(0);
        b4Var.setMaxValue(59);
        b4Var.setValue(0);
        b4Var.setFormatter(new org.telegram.ui.nr(24));
        linearLayout.addView(b4Var, w7.x5.l(0.3f, 0, 270));
        b4Var.setOnValueChangedListener(r5Var);
        if (j3 > 0 && j3 != 2147483646) {
            long j10 = j3 * 1000;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j10 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j10);
            if (timeInMillis >= 0) {
                b4Var.setValue(calendar.get(12));
                z3Var.setValue(calendar.get(11));
                ud0Var2 = ud0Var2;
                ud0Var2.setValue(timeInMillis);
            } else {
                ud0Var2 = ud0Var2;
            }
        }
        f(null, null, 0L, 0L, 0, ud0Var2, z3Var, b4Var);
        q4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        q4Var.setGravity(17);
        q4Var.setTextColor(x04);
        q4Var.setTextSize(1, 14.0f);
        q4Var.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(8.0f);
        q4Var.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.j0(dp, dp, dp, dp, x05, x06, x06));
        q4Var.setText(str2);
        y3Var.addView(q4Var, w7.x5.t(-1, 48, 83, 16, 15, 16, 16));
        q4Var.setOnClickListener(new m0(ud0Var2, z3Var, b4Var, calendar, f5Var, a3Var, 2));
        a3Var.b(y3Var);
        org.telegram.ui.ActionBar.f3 f3Var = a3Var.a;
        f3Var.show();
        f3Var.setBackgroundColor(x03);
        f3Var.fixNavigationBar(x03);
    }

    public static void x0(ud0 ud0Var, ud0 ud0Var2, ud0 ud0Var3) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2, ud0Var2.getValue());
        calendar.set(1, ud0Var3.getValue());
        ud0Var.setMinValue(1);
        ud0Var.setMaxValue(calendar.getActualMaximum(5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:413:0x020b, code lost:
    
        if (java.lang.Math.abs(r11 - r0.messageOwner.date) > 86400) goto L95;
     */
    /* JADX WARN: Removed duplicated region for block: B:154:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x071d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x07e7  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0882  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x094d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0960  */
    /* JADX WARN: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x08bb  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0824  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x06f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void y(final org.telegram.ui.ActionBar.n2 n2Var, final TLRPC.User user, final TLRPC.Chat chat, final TLRPC.EncryptedChat encryptedChat, final TLRPC.ChatFull chatFull, final long j3, final MessageObject messageObject, final SparseArray[] sparseArrayArr, final MessageObject.GroupedMessages groupedMessages, final int i10, final int i11, TLRPC.ChannelParticipant[] channelParticipantArr, final Runnable runnable, Runnable runnable2, final org.telegram.ui.ActionBar.e6 e6Var) {
        Activity parentActivity;
        boolean z10;
        long j10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i12;
        int i13;
        boolean z14;
        boolean z15;
        int i14;
        int i15;
        int i16;
        org.telegram.ui.ActionBar.b2 b2Var;
        int i17;
        boolean z16;
        boolean z17;
        boolean z18;
        org.telegram.ui.Cells.a2 a2Var;
        int i18;
        TLRPC.MessageAction messageAction;
        final boolean z19;
        int i19;
        org.telegram.ui.ActionBar.b2 b2Var2;
        int i20;
        String str;
        AlertDialog$Builder alertDialog$Builder;
        TextView textView;
        TextView textView2;
        int i21;
        int i22;
        boolean z20;
        TLRPC.MessageAction messageAction2;
        boolean z21;
        final int i23;
        int i24;
        TLRPC.Message message;
        int i25;
        MessageObject messageObject2 = messageObject;
        boolean z22 = i11 == 1;
        boolean z23 = i11 == 3;
        if (n2Var == null) {
            return;
        }
        if ((user == null && chat == null && encryptedChat == null) || (parentActivity = n2Var.getParentActivity()) == null) {
            return;
        }
        final int currentAccount = n2Var.getCurrentAccount();
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(parentActivity, 0, e6Var);
        float f7 = runnable2 != null ? 0.5f : 0.6f;
        org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder2.a;
        b2Var3.Q0 = f7;
        int size = groupedMessages != null ? groupedMessages.messages.size() : messageObject2 != null ? 1 : sparseArrayArr[1].size() + sparseArrayArr[0].size();
        if (encryptedChat != null) {
            z10 = z23;
            j10 = DialogObject.makeEncryptedDialogId(encryptedChat.id);
        } else {
            z10 = z23;
            j10 = user != null ? user.id : -chat.id;
        }
        if (z22) {
            if (messageObject2 != null && (message = messageObject2.messageOwner) != null && (i25 = message.schedule_repeat_period) > 0) {
                i23 = i25;
                i24 = message.date;
            } else if (groupedMessages == null || groupedMessages.messages.isEmpty() || groupedMessages.messages.get(0) == null || groupedMessages.messages.get(0).messageOwner == null || groupedMessages.messages.get(0).messageOwner.schedule_repeat_period <= 0) {
                i23 = 0;
                i24 = 0;
            } else {
                i24 = groupedMessages.messages.get(0).messageOwner.date;
                i23 = groupedMessages.messages.get(0).messageOwner.schedule_repeat_period;
            }
            if (i24 > 0 && i23 > 0) {
                String formatString = LocaleController.formatString(R.string.MessageScheduledRepeatDeletePostponeSeconds, Integer.valueOf(i23));
                if (i23 == 31536000) {
                    formatString = LocaleController.getString(R.string.MessageScheduledRepeatDeletePostponeYear);
                } else if (i23 >= 2592000) {
                    formatString = LocaleController.formatPluralString("MessageScheduledRepeatDeletePostponeMonths", i23 / 2592000, new Object[0]);
                } else if (i23 >= 604800) {
                    formatString = LocaleController.formatPluralString("MessageScheduledRepeatDeletePostponeWeeks", i23 / 604800, new Object[0]);
                } else if (i23 >= 86400) {
                    formatString = LocaleController.formatPluralString("MessageScheduledRepeatDeletePostponeDays", i23 / 86400, new Object[0]);
                }
                String str2 = formatString;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(parentActivity, 0, e6Var);
                String string = LocaleController.getString(R.string.MessageScheduledRepeatDeleteTitle);
                org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder3.a;
                b2Var4.R = string;
                b2Var4.T = LocaleController.getString(R.string.MessageScheduledRepeatDeleteText);
                final int i26 = i24;
                alertDialog$Builder3.h(str2, new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.Components.r0
                    @Override // org.telegram.ui.ActionBar.a2
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var5, int i27) {
                        MessageObject.GroupedMessages groupedMessages2 = MessageObject.GroupedMessages.this;
                        int i28 = currentAccount;
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        int i29 = i26;
                        int i30 = i23;
                        if (groupedMessages2 != null && !groupedMessages2.messages.isEmpty()) {
                            SendMessagesHelper.getInstance(i28).editMessage(groupedMessages2.messages.get(0), null, false, n2Var2, null, i29 + i30, i30);
                        } else {
                            SendMessagesHelper.getInstance(i28).editMessage(messageObject, null, false, n2Var2, null, i29 + i30, i30);
                        }
                    }
                });
                final long j11 = j10;
                final boolean z24 = z10;
                alertDialog$Builder3.i(LocaleController.getString(R.string.MessageScheduledRepeatDeleteAll), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.Components.w0
                    @Override // org.telegram.ui.ActionBar.a2
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var5, int i27) {
                        SparseArray[] sparseArrayArr2;
                        ArrayList<Long> arrayList;
                        int i28;
                        long j12;
                        ArrayList<Long> arrayList2;
                        TLRPC.Peer peer;
                        int i29;
                        long j13;
                        ArrayList<Integer> arrayList3;
                        boolean z25 = z24;
                        int i30 = currentAccount;
                        long clientUserId = z25 ? UserConfig.getInstance(i30).getClientUserId() : j11;
                        MessageObject messageObject3 = messageObject;
                        TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                        long j14 = j3;
                        int i31 = i10;
                        int i32 = i11;
                        ArrayList<Long> arrayList4 = null;
                        if (messageObject3 != null) {
                            ArrayList<Integer> arrayList5 = new ArrayList<>();
                            MessageObject.GroupedMessages groupedMessages2 = groupedMessages;
                            if (groupedMessages2 != null) {
                                int i33 = 0;
                                while (i33 < groupedMessages2.messages.size()) {
                                    MessageObject messageObject4 = groupedMessages2.messages.get(i33);
                                    arrayList5.add(Integer.valueOf(messageObject4.getId()));
                                    if (encryptedChat2 != null) {
                                        arrayList3 = arrayList5;
                                        if (messageObject4.messageOwner.random_id == 0 || messageObject4.type == 10) {
                                            i29 = i30;
                                            j13 = clientUserId;
                                        } else {
                                            if (arrayList4 == null) {
                                                arrayList4 = new ArrayList<>();
                                            }
                                            ArrayList<Long> arrayList6 = arrayList4;
                                            i29 = i30;
                                            j13 = clientUserId;
                                            arrayList6.add(Long.valueOf(messageObject4.messageOwner.random_id));
                                            arrayList4 = arrayList6;
                                        }
                                    } else {
                                        i29 = i30;
                                        j13 = clientUserId;
                                        arrayList3 = arrayList5;
                                    }
                                    i33++;
                                    arrayList5 = arrayList3;
                                    i30 = i29;
                                    clientUserId = j13;
                                }
                                i28 = i30;
                                j12 = clientUserId;
                            } else {
                                i28 = i30;
                                j12 = clientUserId;
                                arrayList5.add(Integer.valueOf(messageObject3.getId()));
                                if (encryptedChat2 != null && messageObject3.messageOwner.random_id != 0 && messageObject3.type != 10) {
                                    ArrayList<Long> arrayList7 = new ArrayList<>();
                                    arrayList7.add(Long.valueOf(messageObject3.messageOwner.random_id));
                                    arrayList2 = arrayList7;
                                    MessagesController.getInstance(i28).deleteMessages(arrayList5, arrayList2, encryptedChat2, (j14 == 0 && (peer = messageObject3.messageOwner.peer_id) != null && peer.chat_id == (-j14)) ? j14 : j12, i31, true, i32);
                                }
                            }
                            arrayList2 = arrayList4;
                            MessagesController.getInstance(i28).deleteMessages(arrayList5, arrayList2, encryptedChat2, (j14 == 0 && (peer = messageObject3.messageOwner.peer_id) != null && peer.chat_id == (-j14)) ? j14 : j12, i31, true, i32);
                        } else {
                            long j15 = clientUserId;
                            int i34 = 1;
                            while (i34 >= 0) {
                                ArrayList<Integer> arrayList8 = new ArrayList<>();
                                int i35 = 0;
                                while (true) {
                                    sparseArrayArr2 = sparseArrayArr;
                                    if (i35 >= sparseArrayArr2[i34].size()) {
                                        break;
                                    }
                                    arrayList8.add(Integer.valueOf(sparseArrayArr2[i34].keyAt(i35)));
                                    i35++;
                                }
                                if (encryptedChat2 != null) {
                                    ArrayList<Long> arrayList9 = new ArrayList<>();
                                    for (int i36 = 0; i36 < sparseArrayArr2[i34].size(); i36++) {
                                        MessageObject messageObject5 = (MessageObject) sparseArrayArr2[i34].valueAt(i36);
                                        long j16 = messageObject5.messageOwner.random_id;
                                        if (j16 != 0 && messageObject5.type != 10) {
                                            arrayList9.add(Long.valueOf(j16));
                                        }
                                    }
                                    arrayList = arrayList9;
                                } else {
                                    arrayList = null;
                                }
                                MessagesController.getInstance(i30).deleteMessages(arrayList8, arrayList, encryptedChat2, (i34 != 1 || j14 == 0) ? j15 : j14, i31, true, i32);
                                sparseArrayArr2[i34].clear();
                                i34--;
                            }
                        }
                        Runnable runnable3 = runnable;
                        if (runnable3 != null) {
                            runnable3.run();
                        }
                    }
                });
                alertDialog$Builder3.k(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder3.d(-2);
                alertDialog$Builder3.d(-3);
                b2Var4.N = new s0(2, runnable2);
                alertDialog$Builder3.o();
                return;
            }
            messageObject2 = messageObject;
        }
        Runnable runnable3 = runnable2;
        final int i27 = currentAccount;
        int currentTime = ConnectionsManager.getInstance(i27).getCurrentTime();
        MessagesController.getInstance(i27).config.starsSuggestedPostAgeMin.get(TimeUnit.SECONDS);
        if (messageObject2 != null) {
            z12 = !messageObject2.isDice() || Math.abs(currentTime - messageObject2.messageOwner.date) > 86400;
            if (messageObject2.isPaidSuggestedPostProtected()) {
                TLRPC.Message message2 = messageObject2.messageOwner;
                z13 = message2.paid_suggested_post_stars;
                z11 = message2.paid_suggested_post_ton;
            } else {
                z13 = false;
                z11 = false;
            }
        } else {
            int i28 = 0;
            z11 = false;
            boolean z25 = false;
            boolean z26 = false;
            while (i28 < 2) {
                int i29 = 0;
                while (true) {
                    i12 = i28;
                    if (i29 < sparseArrayArr[i28].size()) {
                        MessageObject messageObject3 = (MessageObject) sparseArrayArr[i12].valueAt(i29);
                        if (messageObject3.isDice()) {
                            i13 = i29;
                        } else {
                            i13 = i29;
                        }
                        z25 = true;
                        if (messageObject3.isPaidSuggestedPostProtected()) {
                            TLRPC.Message message3 = messageObject3.messageOwner;
                            z26 |= message3.paid_suggested_post_stars;
                            z11 |= message3.paid_suggested_post_ton;
                        }
                        i29 = i13 + 1;
                        i28 = i12;
                    }
                }
                i28 = i12 + 1;
            }
            z12 = z25;
            z13 = z26;
        }
        boolean z27 = z13;
        if (groupedMessages != null) {
            int i30 = 0;
            while (i30 < groupedMessages.messages.size()) {
                MessageObject messageObject4 = groupedMessages.messages.get(i30);
                if (messageObject4.isPaidSuggestedPostProtected()) {
                    TLRPC.Message message4 = messageObject4.messageOwner;
                    z21 = z12;
                    boolean z28 = z27 | message4.paid_suggested_post_stars;
                    z11 = message4.paid_suggested_post_ton | z11;
                    z27 = z28;
                } else {
                    z21 = z12;
                }
                i30++;
                z12 = z21;
            }
        }
        boolean z29 = z12;
        final boolean[] zArr = new boolean[1];
        boolean z30 = user != null && MessagesController.getInstance(i27).canRevokePmInbox;
        int i31 = user != null ? MessagesController.getInstance(i27).revokeTimePmLimit : MessagesController.getInstance(i27).revokeTimeLimit;
        if (encryptedChat == null && user != null && z30) {
            z14 = z30;
            if (i31 == Integer.MAX_VALUE) {
                z15 = true;
                if (chat != null || !chat.megagroup || z22 || z10) {
                    i14 = i27;
                    if (!z22 || z10 || ChatObject.isChannel(chat) || encryptedChat != null) {
                        i15 = i14;
                        i16 = 1;
                        b2Var = b2Var3;
                        i17 = 0;
                        z16 = false;
                    } else {
                        if ((user == null || user.id == UserConfig.getInstance(i14).getClientUserId() || (user.bot && !user.support)) && chat == null) {
                            i15 = i14;
                            i17 = 0;
                            z18 = false;
                        } else if (messageObject2 != null) {
                            i17 = (messageObject2.isSendError() || !((messageAction = messageObject2.messageOwner.action) == null || (messageAction instanceof TLRPC.TL_messageActionEmpty) || (messageAction instanceof TLRPC.TL_messageActionPhoneCall) || (messageAction instanceof TLRPC.TL_messageActionPinMessage) || (messageAction instanceof TLRPC.TL_messageActionGeoProximityReached) || (messageAction instanceof TLRPC.TL_messageActionSetChatTheme)) || (!(messageObject2.isOut() || z14 || ChatObject.hasAdminRights(chat)) || currentTime - messageObject2.messageOwner.date > i31)) ? 0 : 1;
                            z18 = !messageObject2.isOut();
                            i15 = i14;
                        } else {
                            int i32 = 1;
                            z18 = false;
                            int i33 = 0;
                            while (i32 >= 0) {
                                int i34 = 0;
                                while (true) {
                                    i18 = i14;
                                    if (i34 < sparseArrayArr[i32].size()) {
                                        MessageObject messageObject5 = (MessageObject) sparseArrayArr[i32].valueAt(i34);
                                        int i35 = i34;
                                        TLRPC.MessageAction messageAction3 = messageObject5.messageOwner.action;
                                        if ((messageAction3 == null || (messageAction3 instanceof TLRPC.TL_messageActionEmpty) || (messageAction3 instanceof TLRPC.TL_messageActionPhoneCall) || (messageAction3 instanceof TLRPC.TL_messageActionPinMessage) || (messageAction3 instanceof TLRPC.TL_messageActionGeoProximityReached)) && ((messageObject5.isOut() || z14 || (chat != null && ChatObject.canBlockUsers(chat))) && currentTime - messageObject5.messageOwner.date <= i31)) {
                                            i33++;
                                            if (!z18 && !messageObject5.isOut()) {
                                                z18 = true;
                                            }
                                        }
                                        i34 = i35 + 1;
                                        i14 = i18;
                                    }
                                }
                                i32--;
                                i14 = i18;
                            }
                            i15 = i14;
                            i17 = i33;
                        }
                        if (i17 <= 0 || !z29 || (user != null && UserObject.isDeleted(user))) {
                            i16 = 1;
                            b2Var = b2Var3;
                            z16 = z18;
                        } else {
                            FrameLayout frameLayout = new FrameLayout(parentActivity);
                            org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(parentActivity, 1, e6Var);
                            a2Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.L0(false));
                            if (z15) {
                                a2Var = a2Var2;
                                a2Var.e(LocaleController.formatString("DeleteMessagesOptionAlso", R.string.DeleteMessagesOptionAlso, UserObject.getFirstName(user)), "", false, false, false);
                            } else {
                                a2Var = a2Var2;
                                if (chat == null || !(z18 || i17 == size)) {
                                    a2Var.e(LocaleController.getString(R.string.DeleteMessagesOption), "", false, false, false);
                                } else {
                                    a2Var.e(LocaleController.getString(R.string.DeleteForAll), "", false, false, false);
                                }
                            }
                            org.telegram.ui.Cells.a2 a2Var3 = a2Var;
                            a2Var3.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                            frameLayout.addView(a2Var3, w7.x5.a(48.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 51));
                            i16 = 1;
                            a2Var3.setOnClickListener(new t0(i16, zArr));
                            alertDialog$Builder2.n(frameLayout);
                            b2Var3.G = 9;
                            b2Var = b2Var3;
                            z17 = true;
                            z16 = z18;
                        }
                    }
                    z17 = false;
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (messageObject2 != null) {
                        TLRPC.MessageAction messageAction4 = messageObject2.messageOwner.action;
                        if (messageAction4 == null || (messageAction4 instanceof TLRPC.TL_messageActionEmpty) || (messageAction4 instanceof TLRPC.TL_messageActionChatDeleteUser) || (messageAction4 instanceof TLRPC.TL_messageActionChatJoinedByLink) || (messageAction4 instanceof TLRPC.TL_messageActionChatAddUser)) {
                            if (groupedMessages != null) {
                                arrayList.addAll(groupedMessages.messages);
                            } else {
                                arrayList.add(messageObject2);
                            }
                        }
                        i21 = (!messageObject2.isSendError() && messageObject2.getDialogId() == j3 && ((messageAction2 = messageObject2.messageOwner.action) == null || (messageAction2 instanceof TLRPC.TL_messageActionEmpty)) && messageObject2.isOut() && currentTime - messageObject2.messageOwner.date <= i31) ? 1 : 0;
                    } else {
                        int i36 = 1;
                        int i37 = 0;
                        while (i36 >= 0) {
                            int i38 = i37;
                            int i39 = 0;
                            while (i39 < sparseArrayArr[i36].size()) {
                                MessageObject messageObject6 = (MessageObject) sparseArrayArr[i36].valueAt(i39);
                                int i40 = i39;
                                if (i36 == 1 && messageObject6.isOut()) {
                                    TLRPC.Message message5 = messageObject6.messageOwner;
                                    i22 = i36;
                                    if (message5.action == null && currentTime - message5.date <= i31) {
                                        i38++;
                                    }
                                } else {
                                    i22 = i36;
                                }
                                arrayList.add(messageObject6);
                                i39 = i40 + 1;
                                i36 = i22;
                            }
                            i36--;
                            i37 = i38;
                        }
                        i21 = i37;
                    }
                    int i41 = i21;
                    int i42 = 2;
                    ArrayList arrayList2 = (ArrayList) Collection.-EL.stream(arrayList).filter(new org.telegram.ui.bb(1)).mapToLong(new x0(0)).distinct().mapToObj(new LongFunction() { // from class: org.telegram.ui.Components.y0
                        @Override // java.util.function.LongFunction
                        public final Object apply(long j12) {
                            int i43 = i27;
                            return j12 > 0 ? MessagesController.getInstance(i43).getUser(Long.valueOf(j12)) : MessagesController.getInstance(i43).getChat(Long.valueOf(-j12));
                        }
                    }).filter(new org.telegram.ui.bb(i42)).filter(new org.telegram.ui.p8(UserConfig.getInstance(i27).getClientUserId(), i42)).collect(Collectors.toCollection(new org.telegram.ui.eg()));
                    if (!arrayList2.isEmpty()) {
                        if (channelParticipantArr != null) {
                            vs vsVar = new vs(n2Var, chat, arrayList, arrayList2, channelParticipantArr, j3, i10, i11, false, runnable);
                            if (runnable3 != null) {
                                vsVar.setOnHideListener(new s0(0, runnable3));
                            }
                            vsVar.show();
                            return;
                        }
                        final org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(parentActivity, 3, null)};
                        final int size2 = arrayList2.size();
                        final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[size2];
                        int[] iArr = new int[size2];
                        int[] iArr2 = new int[1];
                        final int i43 = 0;
                        while (i43 < size2) {
                            TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                            tL_channels_getParticipant.channel = MessagesController.getInputChannel(chat);
                            tL_channels_getParticipant.participant = MessagesController.getInputPeer((TLObject) arrayList2.get(i43));
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i27);
                            ArrayList arrayList3 = arrayList2;
                            final int[] iArr3 = iArr2;
                            final int[] iArr4 = iArr;
                            final Runnable runnable4 = runnable3;
                            RequestDelegate requestDelegate = new RequestDelegate() { // from class: org.telegram.ui.Components.a1
                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                                    final int[] iArr5 = iArr3;
                                    final int[] iArr6 = iArr4;
                                    final int i44 = i43;
                                    final TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                    final int i45 = size2;
                                    final org.telegram.ui.ActionBar.b2[] b2VarArr2 = b2VarArr;
                                    final org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                                    final TLRPC.User user2 = user;
                                    final TLRPC.Chat chat2 = chat;
                                    final TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                                    final TLRPC.ChatFull chatFull2 = chatFull;
                                    final long j12 = j3;
                                    final MessageObject messageObject7 = messageObject;
                                    final SparseArray[] sparseArrayArr2 = sparseArrayArr;
                                    final MessageObject.GroupedMessages groupedMessages2 = groupedMessages;
                                    final int i46 = i10;
                                    final int i47 = i11;
                                    final Runnable runnable5 = runnable;
                                    final Runnable runnable6 = runnable4;
                                    final org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.s1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            org.telegram.ui.ActionBar.b2[] b2VarArr3 = b2VarArr2;
                                            int[] iArr7 = iArr5;
                                            iArr7[0] = iArr7[0] + 1;
                                            int[] iArr8 = iArr6;
                                            int i48 = i44;
                                            iArr8[i48] = 0;
                                            TLObject tLObject2 = tLObject;
                                            TLRPC.ChannelParticipant[] channelParticipantArr4 = channelParticipantArr3;
                                            if (tLObject2 != null) {
                                                channelParticipantArr4[i48] = ((TLRPC.TL_channels_channelParticipant) tLObject2).participant;
                                            }
                                            if (iArr7[0] == i45) {
                                                try {
                                                    b2VarArr3[0].dismiss();
                                                } catch (Throwable unused) {
                                                }
                                                b2VarArr3[0] = null;
                                                g5.y(n2Var2, user2, chat2, encryptedChat2, chatFull2, j12, messageObject7, sparseArrayArr2, groupedMessages2, i46, i47, channelParticipantArr4, runnable5, runnable6, e6Var2);
                                            }
                                        }
                                    });
                                }
                            };
                            int i44 = i43;
                            iArr4[i44] = connectionsManager.sendRequest(tL_channels_getParticipant, requestDelegate);
                            runnable3 = runnable2;
                            size2 = size2;
                            iArr = iArr4;
                            iArr2 = iArr3;
                            i43 = i44 + 1;
                            i27 = i27;
                            arrayList2 = arrayList3;
                        }
                        AndroidUtilities.runOnUIThread(new ei.l3(b2VarArr, iArr, i27, runnable2, n2Var, 19), 1000L);
                        return;
                    }
                    if (i41 <= 0 || !z29) {
                        z20 = false;
                    } else {
                        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                        org.telegram.ui.Cells.a2 a2Var4 = new org.telegram.ui.Cells.a2(parentActivity, 1, e6Var);
                        a2Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.L0(false));
                        a2Var4.e(LocaleController.getString(R.string.DeleteMessagesOption), "", false, false, false);
                        int i45 = 0;
                        a2Var4.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                        frameLayout2.addView(a2Var4, w7.x5.a(48.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 51));
                        a2Var4.setOnClickListener(new t0(i45, zArr));
                        alertDialog$Builder2.n(frameLayout2);
                        b2Var3.G = 9;
                        z20 = true;
                    }
                    b2Var = b2Var3;
                    z17 = z20;
                    i15 = i27;
                    i17 = i41;
                    i16 = 1;
                    z16 = false;
                }
                final int i46 = i15;
                org.telegram.ui.ActionBar.b2 b2Var5 = b2Var;
                int i47 = i17;
                final long j12 = j10;
                int i48 = size;
                boolean z31 = z11;
                z19 = z10;
                int i49 = i16;
                org.telegram.ui.ActionBar.a2 a2Var5 = new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.Components.v0
                    @Override // org.telegram.ui.ActionBar.a2
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var6, int i50) {
                        SparseArray[] sparseArrayArr2;
                        ArrayList<Long> arrayList4;
                        boolean z32;
                        long j13;
                        int i51;
                        long j14;
                        long j15;
                        ArrayList arrayList5;
                        TLRPC.Peer peer;
                        int i52;
                        long j16;
                        boolean z33 = z19;
                        int i53 = i46;
                        long clientUserId = z33 ? UserConfig.getInstance(i53).getClientUserId() : j12;
                        MessageObject messageObject7 = messageObject;
                        TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                        long j17 = j3;
                        int i54 = i10;
                        boolean[] zArr2 = zArr;
                        int i55 = i11;
                        ArrayList<Long> arrayList6 = null;
                        if (messageObject7 != null) {
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList<Integer> arrayList8 = new ArrayList<>();
                            MessageObject.GroupedMessages groupedMessages2 = groupedMessages;
                            if (groupedMessages2 != null) {
                                int i56 = 0;
                                while (i56 < groupedMessages2.messages.size()) {
                                    MessageObject messageObject8 = groupedMessages2.messages.get(i56);
                                    if (messageObject8.isEphemeral()) {
                                        arrayList7.add(messageObject8);
                                        i52 = i53;
                                    } else {
                                        i52 = i53;
                                        arrayList8.add(Integer.valueOf(messageObject8.getId()));
                                        if (encryptedChat2 != null) {
                                            j16 = clientUserId;
                                            if (messageObject8.messageOwner.random_id != 0 && messageObject8.type != 10) {
                                                if (arrayList6 == null) {
                                                    arrayList6 = new ArrayList<>();
                                                }
                                                ArrayList<Long> arrayList9 = arrayList6;
                                                arrayList9.add(Long.valueOf(messageObject8.messageOwner.random_id));
                                                arrayList6 = arrayList9;
                                            }
                                            i56++;
                                            i53 = i52;
                                            clientUserId = j16;
                                        }
                                    }
                                    j16 = clientUserId;
                                    i56++;
                                    i53 = i52;
                                    clientUserId = j16;
                                }
                                i51 = i53;
                                j14 = clientUserId;
                            } else {
                                i51 = i53;
                                j14 = clientUserId;
                                if (messageObject7.isEphemeral()) {
                                    arrayList7.add(messageObject7);
                                } else {
                                    arrayList8.add(Integer.valueOf(messageObject7.getId()));
                                    if (encryptedChat2 != null && messageObject7.messageOwner.random_id != 0 && messageObject7.type != 10) {
                                        ArrayList<Long> arrayList10 = new ArrayList<>();
                                        arrayList10.add(Long.valueOf(messageObject7.messageOwner.random_id));
                                        arrayList6 = arrayList10;
                                    }
                                }
                            }
                            long j18 = (j17 == 0 || (peer = messageObject7.messageOwner.peer_id) == null || peer.chat_id != (-j17)) ? j14 : j17;
                            if (arrayList8.isEmpty()) {
                                j15 = j18;
                                arrayList5 = arrayList7;
                            } else {
                                arrayList5 = arrayList7;
                                j15 = j18;
                                MessagesController.getInstance(i51).deleteMessages(arrayList8, arrayList6, encryptedChat2, j15, i54, zArr2[0], i55);
                            }
                            int size3 = arrayList5.size();
                            int i57 = 0;
                            while (i57 < size3) {
                                Object obj = arrayList5.get(i57);
                                i57++;
                                MessagesController.getInstance(i51).deleteEphemeralMessage(j15, i54, (MessageObject) obj);
                            }
                        } else {
                            long j19 = clientUserId;
                            int i58 = 1;
                            while (i58 >= 0) {
                                ArrayList<Integer> arrayList11 = new ArrayList<>();
                                int i59 = 0;
                                while (true) {
                                    sparseArrayArr2 = sparseArrayArr;
                                    if (i59 >= sparseArrayArr2[i58].size()) {
                                        break;
                                    }
                                    arrayList11.add(Integer.valueOf(sparseArrayArr2[i58].keyAt(i59)));
                                    i59++;
                                }
                                if (encryptedChat2 != null) {
                                    ArrayList<Long> arrayList12 = new ArrayList<>();
                                    int i60 = 0;
                                    while (i60 < sparseArrayArr2[i58].size()) {
                                        MessageObject messageObject9 = (MessageObject) sparseArrayArr2[i58].valueAt(i60);
                                        int i61 = i58;
                                        long j20 = messageObject9.messageOwner.random_id;
                                        if (j20 != 0 && messageObject9.type != 10) {
                                            arrayList12.add(Long.valueOf(j20));
                                        }
                                        i60++;
                                        i58 = i61;
                                    }
                                    arrayList4 = arrayList12;
                                } else {
                                    arrayList4 = null;
                                }
                                int i62 = i58;
                                MessagesController messagesController = MessagesController.getInstance(i53);
                                if (i62 != 1 || j17 == 0) {
                                    z32 = 10;
                                    j13 = j19;
                                } else {
                                    z32 = 10;
                                    j13 = j17;
                                }
                                messagesController.deleteMessages(arrayList11, arrayList4, encryptedChat2, j13, i54, zArr2[0], i55);
                                sparseArrayArr2[i62].clear();
                                i58 = i62 - 1;
                            }
                        }
                        Runnable runnable5 = runnable;
                        if (runnable5 != null) {
                            runnable5.run();
                        }
                    }
                };
                if (z19) {
                    i19 = i48;
                    b2Var2 = b2Var5;
                    if (i19 == i49) {
                        b2Var2.R = LocaleController.getString(R.string.DeleteSingleMessagesTitle);
                    } else {
                        int i50 = R.string.DeleteMessagesTitle;
                        Object[] objArr = new Object[i49];
                        objArr[0] = LocaleController.formatPluralString("messages", i19, new Object[0]);
                        b2Var2.R = LocaleController.formatString(i50, objArr);
                    }
                } else {
                    i19 = i48;
                    if (i19 == i49) {
                        b2Var2 = b2Var5;
                        b2Var2.R = LocaleController.getString(R.string.UnsaveSingleMessagesTitle);
                    } else {
                        b2Var2 = b2Var5;
                        int i51 = R.string.UnsaveMessagesTitle;
                        Object[] objArr2 = new Object[i49];
                        objArr2[0] = LocaleController.formatPluralString("messages", i19, new Object[0]);
                        b2Var2.R = LocaleController.formatString(i51, objArr2);
                    }
                }
                if (z19) {
                    if (chat == null || !z16) {
                        if (!z17 || z15 || i47 == i19) {
                            if (chat == null || !chat.megagroup || z22) {
                                if (i19 == i49) {
                                    b2Var2.T = LocaleController.getString(R.string.AreYouSureDeleteSingleMessage);
                                } else {
                                    b2Var2.T = LocaleController.getString(R.string.AreYouSureDeleteFewMessages);
                                }
                            } else if (i19 == i49) {
                                b2Var2.T = LocaleController.getString((messageObject == null || !messageObject.isEphemeral()) ? R.string.AreYouSureDeleteSingleMessageMega : R.string.AreYouSureDeleteSingleMessage);
                            } else {
                                b2Var2.T = LocaleController.getString(R.string.AreYouSureDeleteFewMessagesMega);
                            }
                        } else if (chat != null) {
                            int i52 = R.string.DeleteMessagesTextGroup;
                            Object[] objArr3 = new Object[i49];
                            objArr3[0] = LocaleController.formatPluralString("messages", i47, new Object[0]);
                            b2Var2.T = LocaleController.formatString("DeleteMessagesTextGroup", i52, objArr3);
                        } else {
                            int i53 = R.string.DeleteMessagesText;
                            String formatPluralString = LocaleController.formatPluralString("messages", i47, new Object[0]);
                            String firstName = UserObject.getFirstName(user);
                            Object[] objArr4 = new Object[2];
                            objArr4[0] = formatPluralString;
                            objArr4[i49] = firstName;
                            b2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatString("DeleteMessagesText", i53, objArr4));
                        }
                    } else if (z17 && i47 != i19) {
                        int i54 = R.string.DeleteMessagesTextGroupPart;
                        Object[] objArr5 = new Object[i49];
                        objArr5[0] = LocaleController.formatPluralString("messages", i47, new Object[0]);
                        b2Var2.T = LocaleController.formatString(i54, objArr5);
                    } else if (i19 == i49) {
                        b2Var2.T = LocaleController.getString(R.string.AreYouSureDeleteSingleMessage);
                    } else {
                        b2Var2.T = LocaleController.getString(R.string.AreYouSureDeleteFewMessages);
                    }
                } else if (i19 == i49) {
                    b2Var2.T = LocaleController.getString(R.string.AreYouSureUnsaveSingleMessage);
                } else {
                    b2Var2.T = LocaleController.getString(R.string.AreYouSureUnsaveFewMessages);
                }
                if (messageObject == null) {
                    i20 = (!messageObject.isGiveaway() || messageObject.isForwarded()) ? 0 : i49;
                    if (i20 != 0) {
                        long j13 = ((TLRPC.TL_messageMediaGiveaway) messageObject.messageOwner.media).until_date * 1000;
                        str = LocaleController.getInstance().getFormatterGiveawayMonthDayYear().format(new Date(j13));
                        i20 = System.currentTimeMillis() < j13 ? i49 : 0;
                    }
                    str = null;
                } else if (i19 == i49) {
                    int i55 = 0;
                    str = null;
                    for (int i56 = i49; i56 >= 0; i56--) {
                        for (int i57 = 0; i57 < sparseArrayArr[i56].size(); i57++) {
                            MessageObject messageObject7 = (MessageObject) sparseArrayArr[i56].valueAt(i57);
                            int i58 = (!messageObject7.isGiveaway() || messageObject7.isForwarded()) ? 0 : i49;
                            if (i58 != 0) {
                                long j14 = ((TLRPC.TL_messageMediaGiveaway) messageObject7.messageOwner.media).until_date * 1000;
                                str = LocaleController.getInstance().getFormatterGiveawayMonthDayYear().format(new Date(j14));
                                i55 = System.currentTimeMillis() < j14 ? i49 : 0;
                            } else {
                                i55 = i58;
                            }
                        }
                    }
                    i20 = i55;
                } else {
                    i20 = 0;
                    str = null;
                }
                if (z27) {
                    alertDialog$Builder = alertDialog$Builder2;
                    if (z31) {
                        int i59 = (int) MessagesController.getInstance(i46).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS);
                        b2Var2.R = LocaleController.getString(R.string.SuggestionTONWillBeLost);
                        int i60 = R.string.SuggestionTONWillBeLostInfo;
                        Object[] objArr6 = new Object[i49];
                        objArr6[0] = Integer.valueOf(i59);
                        b2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatString(i60, objArr6));
                        alertDialog$Builder.k(LocaleController.getString(R.string.SuggestionStarsWillBeLostDelete), a2Var5);
                    } else if (i20 == 0 || z19) {
                        alertDialog$Builder.k(LocaleController.getString(z19 ? R.string.Remove : R.string.Delete), a2Var5);
                    } else {
                        b2Var2.R = LocaleController.getString(R.string.BoostingGiveawayDeleteMsgTitle);
                        int i61 = R.string.BoostingGiveawayDeleteMsgText;
                        Object[] objArr7 = new Object[i49];
                        objArr7[0] = str;
                        b2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatString(i61, objArr7));
                        alertDialog$Builder.i(LocaleController.getString(R.string.Delete), a2Var5);
                    }
                } else {
                    int i62 = (int) MessagesController.getInstance(i46).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS);
                    b2Var2.R = LocaleController.getString(R.string.SuggestionStarsWillBeLost);
                    int i63 = R.string.SuggestionStarsWillBeLostInfo;
                    Object[] objArr8 = new Object[i49];
                    objArr8[0] = Integer.valueOf(i62);
                    b2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatString(i63, objArr8));
                    alertDialog$Builder = alertDialog$Builder2;
                    alertDialog$Builder.k(LocaleController.getString(R.string.SuggestionStarsWillBeLostDelete), a2Var5);
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                b2Var2.N = new s0(i49, runnable2);
                n2Var.showDialog(b2Var2);
                textView = (TextView) b2Var2.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.q7, false));
                }
                textView2 = (TextView) b2Var2.d(-3);
                if (textView2 == null) {
                    b2Var2.t0.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f));
                    ((ViewGroup.MarginLayoutParams) b2Var2.t0.getLayoutParams()).topMargin = AndroidUtilities.dp(-8.0f);
                    textView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.q7, false));
                    return;
                }
                return;
            }
        } else {
            z14 = z30;
        }
        z15 = false;
        if (chat != null) {
        }
        i14 = i27;
        if (z22) {
        }
        i15 = i14;
        i16 = 1;
        b2Var = b2Var3;
        i17 = 0;
        z16 = false;
        z17 = false;
        final int i462 = i15;
        org.telegram.ui.ActionBar.b2 b2Var52 = b2Var;
        int i472 = i17;
        final long j122 = j10;
        int i482 = size;
        boolean z312 = z11;
        z19 = z10;
        int i492 = i16;
        org.telegram.ui.ActionBar.a2 a2Var52 = new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.Components.v0
            @Override // org.telegram.ui.ActionBar.a2
            public final void f(org.telegram.ui.ActionBar.b2 b2Var6, int i502) {
                SparseArray[] sparseArrayArr2;
                ArrayList<Long> arrayList4;
                boolean z32;
                long j132;
                int i512;
                long j142;
                long j15;
                ArrayList arrayList5;
                TLRPC.Peer peer;
                int i522;
                long j16;
                boolean z33 = z19;
                int i532 = i462;
                long clientUserId = z33 ? UserConfig.getInstance(i532).getClientUserId() : j122;
                MessageObject messageObject72 = messageObject;
                TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                long j17 = j3;
                int i542 = i10;
                boolean[] zArr2 = zArr;
                int i552 = i11;
                ArrayList<Long> arrayList6 = null;
                if (messageObject72 != null) {
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList<Integer> arrayList8 = new ArrayList<>();
                    MessageObject.GroupedMessages groupedMessages2 = groupedMessages;
                    if (groupedMessages2 != null) {
                        int i562 = 0;
                        while (i562 < groupedMessages2.messages.size()) {
                            MessageObject messageObject8 = groupedMessages2.messages.get(i562);
                            if (messageObject8.isEphemeral()) {
                                arrayList7.add(messageObject8);
                                i522 = i532;
                            } else {
                                i522 = i532;
                                arrayList8.add(Integer.valueOf(messageObject8.getId()));
                                if (encryptedChat2 != null) {
                                    j16 = clientUserId;
                                    if (messageObject8.messageOwner.random_id != 0 && messageObject8.type != 10) {
                                        if (arrayList6 == null) {
                                            arrayList6 = new ArrayList<>();
                                        }
                                        ArrayList<Long> arrayList9 = arrayList6;
                                        arrayList9.add(Long.valueOf(messageObject8.messageOwner.random_id));
                                        arrayList6 = arrayList9;
                                    }
                                    i562++;
                                    i532 = i522;
                                    clientUserId = j16;
                                }
                            }
                            j16 = clientUserId;
                            i562++;
                            i532 = i522;
                            clientUserId = j16;
                        }
                        i512 = i532;
                        j142 = clientUserId;
                    } else {
                        i512 = i532;
                        j142 = clientUserId;
                        if (messageObject72.isEphemeral()) {
                            arrayList7.add(messageObject72);
                        } else {
                            arrayList8.add(Integer.valueOf(messageObject72.getId()));
                            if (encryptedChat2 != null && messageObject72.messageOwner.random_id != 0 && messageObject72.type != 10) {
                                ArrayList<Long> arrayList10 = new ArrayList<>();
                                arrayList10.add(Long.valueOf(messageObject72.messageOwner.random_id));
                                arrayList6 = arrayList10;
                            }
                        }
                    }
                    long j18 = (j17 == 0 || (peer = messageObject72.messageOwner.peer_id) == null || peer.chat_id != (-j17)) ? j142 : j17;
                    if (arrayList8.isEmpty()) {
                        j15 = j18;
                        arrayList5 = arrayList7;
                    } else {
                        arrayList5 = arrayList7;
                        j15 = j18;
                        MessagesController.getInstance(i512).deleteMessages(arrayList8, arrayList6, encryptedChat2, j15, i542, zArr2[0], i552);
                    }
                    int size3 = arrayList5.size();
                    int i572 = 0;
                    while (i572 < size3) {
                        Object obj = arrayList5.get(i572);
                        i572++;
                        MessagesController.getInstance(i512).deleteEphemeralMessage(j15, i542, (MessageObject) obj);
                    }
                } else {
                    long j19 = clientUserId;
                    int i582 = 1;
                    while (i582 >= 0) {
                        ArrayList<Integer> arrayList11 = new ArrayList<>();
                        int i592 = 0;
                        while (true) {
                            sparseArrayArr2 = sparseArrayArr;
                            if (i592 >= sparseArrayArr2[i582].size()) {
                                break;
                            }
                            arrayList11.add(Integer.valueOf(sparseArrayArr2[i582].keyAt(i592)));
                            i592++;
                        }
                        if (encryptedChat2 != null) {
                            ArrayList<Long> arrayList12 = new ArrayList<>();
                            int i602 = 0;
                            while (i602 < sparseArrayArr2[i582].size()) {
                                MessageObject messageObject9 = (MessageObject) sparseArrayArr2[i582].valueAt(i602);
                                int i612 = i582;
                                long j20 = messageObject9.messageOwner.random_id;
                                if (j20 != 0 && messageObject9.type != 10) {
                                    arrayList12.add(Long.valueOf(j20));
                                }
                                i602++;
                                i582 = i612;
                            }
                            arrayList4 = arrayList12;
                        } else {
                            arrayList4 = null;
                        }
                        int i622 = i582;
                        MessagesController messagesController = MessagesController.getInstance(i532);
                        if (i622 != 1 || j17 == 0) {
                            z32 = 10;
                            j132 = j19;
                        } else {
                            z32 = 10;
                            j132 = j17;
                        }
                        messagesController.deleteMessages(arrayList11, arrayList4, encryptedChat2, j132, i542, zArr2[0], i552);
                        sparseArrayArr2[i622].clear();
                        i582 = i622 - 1;
                    }
                }
                Runnable runnable5 = runnable;
                if (runnable5 != null) {
                    runnable5.run();
                }
            }
        };
        if (z19) {
        }
        if (z19) {
        }
        if (messageObject == null) {
        }
        if (z27) {
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        b2Var2.N = new s0(i492, runnable2);
        n2Var.showDialog(b2Var2);
        textView = (TextView) b2Var2.d(-1);
        if (textView != null) {
        }
        textView2 = (TextView) b2Var2.d(-3);
        if (textView2 == null) {
        }
    }

    public static AlertDialog$Builder z(Context context) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String readRes = AndroidUtilities.readRes(R.raw.pip_voice_request);
        w30 w30Var = new w30(0, context, true);
        w30Var.setImportantForAccessibility(2);
        ai.f0 f0Var = new ai.f0(context, w30Var);
        f0Var.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-15128003, -15118002}));
        f0Var.setClipToOutline(true);
        f0Var.setOutlineProvider(new ai.l2(11));
        View view = new View(context);
        view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(readRes, AndroidUtilities.dp(320.0f), AndroidUtilities.dp(184.61539f), false)));
        f0Var.addView(view, w7.x5.a(-1.0f, -1.0f, -1.0f, -1.0f, -1.0f, -1, 0));
        f0Var.addView(w30Var, w7.x5.d(117.0f, 117));
        alertDialog$Builder.a.V = f0Var;
        alertDialog$Builder.a.R = LocaleController.getString(R.string.PermissionDrawAboveOtherAppsGroupCallTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.PermissionDrawAboveOtherAppsGroupCall);
        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new j0(context, 3));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.j0 = true;
        b2Var.T0 = false;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.a.O0 = 0.5769231f;
        return alertDialog$Builder;
    }
}
