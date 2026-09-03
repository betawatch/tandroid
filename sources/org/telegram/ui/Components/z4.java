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
import org.telegram.ui.ge1;
import org.telegram.ui.qh1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class z4 {
    public static final Pattern a = Pattern.compile("^([a-zA-Z][a-zA-Z0-9+\\-.]*://)?([a-zA-Z0-9\\-]+\\.)+[a-zA-Z]{2,}(:\\d+)?(/[^\\s]*)?$");

    public static AlertDialog$Builder A(Context context) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String readRes = AndroidUtilities.readRes(R.raw.pip_voice_request);
        h30 h30Var = new h30(0, context, true);
        h30Var.setImportantForAccessibility(2);
        dg.u2 u2Var = new dg.u2(context, h30Var);
        u2Var.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-15128003, -15118002}));
        u2Var.setClipToOutline(true);
        u2Var.setOutlineProvider(new gg.j1(9));
        View view = new View(context);
        view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(readRes, AndroidUtilities.dp(320.0f), AndroidUtilities.dp(184.61539f), false)));
        u2Var.addView(view, k7.b6.d(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
        u2Var.addView(h30Var, k7.b6.c(117.0f, 117));
        alertDialog$Builder.a.S = u2Var;
        alertDialog$Builder.a.O = LocaleController.getString(R.string.PermissionDrawAboveOtherAppsGroupCallTitle);
        alertDialog$Builder.a.Q = LocaleController.getString(R.string.PermissionDrawAboveOtherAppsGroupCall);
        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new k0(context, 3));
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.g0 = true;
        d2Var.Q0 = false;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.a.L0 = 0.5769231f;
        return alertDialog$Builder;
    }

    public static AlertDialog$Builder B(Activity activity, qh1 qh1Var, boolean z4) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        String readRes = AndroidUtilities.readRes(R.raw.pip_video_request);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-14535089, -14527894}));
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new gg.j1(8));
        View view = new View(activity);
        view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(readRes, AndroidUtilities.dp(320.0f), AndroidUtilities.dp(161.36752f), false)));
        frameLayout.addView(view, k7.b6.d(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
        alertDialog$Builder.a.S = frameLayout;
        alertDialog$Builder.a.O = LocaleController.getString(R.string.PermissionDrawAboveOtherAppsTitle);
        alertDialog$Builder.a.Q = LocaleController.getString(R.string.PermissionDrawAboveOtherApps);
        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new ih.q(5, activity, z4));
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.g0 = true;
        d2Var.Q0 = false;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), qh1Var);
        alertDialog$Builder.a.L0 = 0.50427353f;
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.d2 C(LaunchActivity launchActivity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
        alertDialog$Builder.a.O = LocaleController.getString(R.string.LowDiskSpaceTitle);
        alertDialog$Builder.a.Q = LocaleController.getString(R.string.LowDiskSpaceMessage2);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.LowDiskSpaceButton), new g1(launchActivity, 1));
        return alertDialog$Builder.a;
    }

    public static org.telegram.ui.ActionBar.d2 D(Activity activity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
        alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new k0(activity, 1));
        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
        return alertDialog$Builder.a;
    }

    public static org.telegram.ui.ActionBar.d2 E(Activity activity, boolean z4, TLRPC.User user, MessagesStorage.IntCallback intCallback, org.telegram.ui.ActionBar.f6 f6Var) {
        int[] iArr = new int[1];
        String[] strArr = {LocaleController.getString(R.string.SendLiveLocationFor15m), LocaleController.getString(R.string.SendLiveLocationFor1h), LocaleController.getString(R.string.SendLiveLocationFor8h), LocaleController.getString(R.string.SendLiveLocationForever)};
        LinearLayout h = kf.k0.h(activity, 1);
        h.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
        TextView textView = new TextView(activity);
        if (z4) {
            textView.setText(LocaleController.getString(R.string.LiveLocationAlertExpandMessage));
        } else if (user != null) {
            textView.setText(LocaleController.formatString(R.string.LiveLocationAlertPrivate, UserObject.getFirstName(user)));
        } else {
            textView.setText(LocaleController.getString(R.string.LiveLocationAlertGroup));
        }
        int i10 = org.telegram.ui.ActionBar.j6.j5;
        textView.setTextColor(f6Var != null ? f6Var.d0(i10) : org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        h.addView(textView, k7.b6.t(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 24, z4 ? 4 : 0, 24, 8));
        int i11 = 0;
        while (i11 < 4) {
            org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(activity, f6Var);
            j6Var.d = 42;
            j6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            j6Var.setTag(Integer.valueOf(i11));
            int i12 = org.telegram.ui.ActionBar.j6.g7;
            int d02 = f6Var != null ? f6Var.d0(i12) : org.telegram.ui.ActionBar.j6.w0(null, i12, false);
            int i13 = org.telegram.ui.ActionBar.j6.E5;
            j6Var.a(d02, f6Var != null ? f6Var.d0(i13) : org.telegram.ui.ActionBar.j6.w0(null, i13, false));
            j6Var.b(strArr[i11], iArr[0] == i11);
            h.addView(j6Var);
            j6Var.setOnClickListener(new q0(iArr, h));
            i11++;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, f6Var);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        if (z4) {
            d2Var.O = LocaleController.getString(R.string.LiveLocationAlertExpandTitle);
        } else {
            int d03 = f6Var != null ? f6Var.d0(org.telegram.ui.ActionBar.j6.L5) : org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false);
            d2Var.Y = new mq0(activity, 0);
            d2Var.Z = d03;
        }
        alertDialog$Builder.n(h);
        alertDialog$Builder.k(LocaleController.getString(R.string.ShareFile), new mg.w(28, iArr, intCallback));
        alertDialog$Builder.i(LocaleController.getString(R.string.Cancel), null);
        return d2Var;
    }

    public static org.telegram.ui.ActionBar.g3 F(final long j10, final long j11, final org.telegram.ui.ActionBar.p2 p2Var, final org.telegram.ui.ActionBar.f6 f6Var) {
        if (p2Var.getParentActivity() == null) {
            return null;
        }
        org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(p2Var.getParentActivity(), f6Var, false, false);
        g3Var.fixNavigationBar();
        g3Var.title = LocaleController.getString(R.string.Notifications);
        g3Var.bigTitle = true;
        CharSequence[] charSequenceArr = {LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Hours", 1, new Object[0])), LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Hours", 8, new Object[0])), LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Days", 2, new Object[0])), LocaleController.getString(R.string.MuteDisable)};
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Components.l0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                int i11 = i10 == 0 ? 0 : i10 == 1 ? 1 : i10 == 2 ? 2 : 3;
                NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(j10, j11, i11);
                org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                if (qc.a(p2Var2)) {
                    qc.z(p2Var2, i11, 0, f6Var).j();
                }
            }
        };
        g3Var.items = charSequenceArr;
        g3Var.onClickListener = onClickListener;
        return g3Var;
    }

    public static void G(Context context, org.telegram.ui.ActionBar.f6 f6Var, y4 y4Var) {
        if (context == null) {
            return;
        }
        int i10 = 0;
        int i11 = org.telegram.ui.ActionBar.j6.j5;
        int d02 = f6Var != null ? f6Var.d0(i11) : org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.j6.h5;
        int d03 = f6Var != null ? f6Var.d0(i12) : org.telegram.ui.ActionBar.j6.w0(null, i12, false);
        int i13 = org.telegram.ui.ActionBar.j6.Ji;
        if (f6Var != null) {
            f6Var.d0(i13);
        } else {
            org.telegram.ui.ActionBar.j6.w0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.j6.Ni;
        if (f6Var != null) {
            f6Var.d0(i14);
        } else {
            org.telegram.ui.ActionBar.j6.w0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.j6.E8;
        if (f6Var != null) {
            f6Var.d0(i15);
        } else {
            org.telegram.ui.ActionBar.j6.w0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.j6.G8;
        if (f6Var != null) {
            f6Var.d0(i16);
        } else {
            org.telegram.ui.ActionBar.j6.w0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.j6.i6;
        if (f6Var != null) {
            f6Var.d0(i17);
        } else {
            org.telegram.ui.ActionBar.j6.w0(null, i17, false);
        }
        int i18 = org.telegram.ui.ActionBar.j6.Sh;
        int d04 = f6Var != null ? f6Var.d0(i18) : org.telegram.ui.ActionBar.j6.w0(null, i18, false);
        int i19 = org.telegram.ui.ActionBar.j6.Oh;
        int d05 = f6Var != null ? f6Var.d0(i19) : org.telegram.ui.ActionBar.j6.w0(null, i19, false);
        int d06 = f6Var != null ? f6Var.d0(org.telegram.ui.ActionBar.j6.Qh) : org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
        org.telegram.ui.ActionBar.b3 b3Var = new org.telegram.ui.ActionBar.b3(context, f6Var);
        b3Var.a();
        int[] iArr = {30, 60, 120, 180, 480, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        i4 i4Var = new i4(context, f6Var, iArr);
        i4Var.setMinValue(0);
        i4Var.setMaxValue(20);
        i4Var.setTextColor(d02);
        i4Var.setValue(0);
        i4Var.setFormatter(new f1(i10, iArr));
        e4 e4Var = new e4(context, i4Var, 1);
        e4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        e4Var.addView(frameLayout, k7.b6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.MuteForAlert));
        textView.setTextColor(d02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, k7.b6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new oh.d(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        e4Var.addView(linearLayout, k7.b6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        gg.q qVar = new gg.q(context, 18);
        linearLayout.addView(i4Var, k7.b6.l(1.0f, 0, 270));
        i4Var.setOnValueChangedListener(new org.telegram.ui.bs(9));
        qVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        qVar.setGravity(17);
        qVar.setTextColor(d04);
        qVar.setTextSize(1, 14.0f);
        qVar.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(8.0f);
        qVar.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, d05, d06, d06));
        qVar.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
        e4Var.addView(qVar, k7.b6.t(-1, 48, 83, 16, 15, 16, 16));
        qVar.setOnClickListener(new kh.t3(iArr, i4Var, y4Var, b3Var, 4));
        b3Var.b(e4Var);
        org.telegram.ui.ActionBar.g3 g3Var = b3Var.a;
        g3Var.show();
        g3Var.setBackgroundColor(d03);
        g3Var.fixNavigationBar(d03);
    }

    public static AlertDialog$Builder H(Context context, String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.a.O = str;
        HashMap hashMap = new HashMap();
        int i10 = org.telegram.ui.ActionBar.j6.L5;
        hashMap.put("info1", Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(null, i10, false)));
        hashMap.put("info2", Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(null, i10, false)));
        alertDialog$Builder.m(R.raw.not_available, 52, org.telegram.ui.ActionBar.j6.w0(null, i10, false), hashMap);
        alertDialog$Builder.a.T = true;
        alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
        alertDialog$Builder.a.Q = str2;
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.d2 I(Activity activity, long j10, final long j11, int i10, final Runnable runnable, org.telegram.ui.ActionBar.f6 f6Var) {
        String[] strArr;
        final long j12 = j10;
        final int i11 = i10;
        final SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
        final int[] iArr = new int[1];
        if (j12 != 0) {
            int i12 = notificationsSettings.getInt("priority_" + j12, 3);
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
        LinearLayout h = kf.k0.h(activity, 1);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, f6Var);
        int i14 = 0;
        while (i14 < strArr2.length) {
            org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(activity, f6Var);
            j6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            j6Var.setTag(Integer.valueOf(i14));
            j6Var.a(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.g7, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E5, f6Var));
            j6Var.b(strArr2[i14], iArr[0] == i14);
            h.addView(j6Var);
            j6Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.b3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    int i15 = 0;
                    iArr2[0] = intValue;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                    long j13 = j12;
                    if (j13 != 0) {
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
                        edit.putInt("priority_" + j13, i15);
                        NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannel(j13, j11);
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
                    alertDialog$Builder.a.I0.run();
                    runnable.run();
                }
            });
            i14++;
            j12 = j10;
            i11 = i10;
        }
        alertDialog$Builder.a.O = LocaleController.getString(R.string.NotificationsImportance);
        alertDialog$Builder.n(h);
        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.a;
    }

    public static void J(int i10, Activity activity, long j10, TLRPC.Photo photo, nh.b bVar) {
        if (activity != null) {
            kh.t tVar = new kh.t(i10, j10, photo, activity, bVar);
            org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(activity, bVar, true, false);
            g3Var.fixNavigationBar();
            g3Var.title = LocaleController.getString(R.string.ReportProfilePhoto);
            g3Var.bigTitle = true;
            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.ReportChatSpam), LocaleController.getString(R.string.ReportChatFakeAccount), LocaleController.getString(R.string.ReportChatViolence), LocaleController.getString(R.string.ReportChatChild), LocaleController.getString(R.string.ReportChatIllegalDrugs), LocaleController.getString(R.string.ReportChatPersonalDetails), LocaleController.getString(R.string.ReportChatPornography), LocaleController.getString(R.string.ReportChatOther)};
            int[] iArr = {R.drawable.msg_clearcache, R.drawable.msg_report_fake, R.drawable.msg_report_violence, R.drawable.msg_block2, R.drawable.msg_report_drugs, R.drawable.msg_report_personal, R.drawable.msg_report_xxx, R.drawable.msg_report_other};
            x2 x2Var = new x2(new int[]{0, 6, 1, 2, 3, 4, 5, 100}, activity, bVar, tVar, 0);
            g3Var.items = charSequenceArr;
            g3Var.itemIcons = iArr;
            g3Var.onClickListener = x2Var;
            g3Var.show();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [org.telegram.ui.kh] */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.View, org.telegram.ui.Components.r3, org.telegram.ui.Components.xc0] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r13v35, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r15v0, types: [android.view.View, org.telegram.ui.Components.xc0] */
    /* JADX WARN: Type inference failed for: r2v15, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r2v27, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View, org.telegram.ui.Components.q3, org.telegram.ui.Components.xc0] */
    /* JADX WARN: Type inference failed for: r56v1, types: [android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v7, types: [org.telegram.ui.kh] */
    public static org.telegram.ui.ActionBar.b3 K(final Context context, final long j10, long j11, int i10, boolean z4, final y4 y4Var, Runnable runnable, x4 x4Var, org.telegram.ui.ActionBar.f6 f6Var) {
        FrameLayout frameLayout;
        Context context2;
        ViewGroup viewGroup;
        int i11;
        FrameLayout frameLayout2;
        ?? r82;
        int i12;
        boolean[] zArr;
        long j12;
        ViewGroup viewGroup2;
        TextView textView;
        ?? r11;
        org.telegram.ui.ActionBar.w0 w0Var;
        q3 q3Var;
        Calendar calendar;
        char c3;
        int i13;
        int[] iArr;
        String[] strArr;
        Calendar calendar2;
        jj0 jj0Var;
        int i14;
        int[] iArr2;
        org.telegram.ui.ActionBar.w0 w0Var2;
        ViewGroup viewGroup3;
        String[] strArr2;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        final org.telegram.ui.ActionBar.g3 g3Var;
        jj0 jj0Var2;
        int i15;
        TLRPC.User user;
        TLRPC.UserStatus userStatus;
        if (context == null) {
            return null;
        }
        final int[] iArr3 = {i10};
        long clientUserId = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
        final org.telegram.ui.ActionBar.b3 b3Var = new org.telegram.ui.ActionBar.b3(context, f6Var);
        b3Var.a();
        final ?? xc0Var = new xc0(context, f6Var);
        int i16 = x4Var.a;
        int i17 = x4Var.c;
        int i18 = x4Var.b;
        xc0Var.setTextColor(i16);
        xc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        xc0Var.setItemCount(5);
        final ?? q3Var2 = new q3(context, f6Var);
        q3Var2.setWrapSelectorWheel(true);
        q3Var2.setAllItemsCount(24);
        q3Var2.setItemCount(5);
        q3Var2.setTextColor(i16);
        q3Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        final ?? r3Var = new r3(context, f6Var);
        r3Var.setWrapSelectorWheel(true);
        r3Var.setAllItemsCount(60);
        r3Var.setItemCount(5);
        r3Var.setTextColor(i16);
        r3Var.setTextOffset(-AndroidUtilities.dp(34.0f));
        ?? frameLayout3 = new FrameLayout(context);
        s3 s3Var = new s3(context, xc0Var, q3Var2, r3Var, 0);
        s3Var.setClipToPadding(false);
        s3Var.setClipChildren(false);
        s3Var.setOrientation(1);
        frameLayout3.addView(s3Var, k7.b6.c(-1.0f, -1));
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout3.addView(frameLayout4, k7.b6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
        ViewGroup frameLayout5 = new FrameLayout(context);
        s3Var.addView(frameLayout5, k7.b6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView5 = new TextView(context);
        if (TextUtils.isEmpty(null)) {
            frameLayout = frameLayout4;
            if (j10 == clientUserId) {
                textView5.setText(LocaleController.getString(R.string.SetReminder));
            } else {
                textView5.setText(LocaleController.getString(R.string.ScheduleMessage));
            }
        } else {
            frameLayout = frameLayout4;
            textView5.setText((CharSequence) null);
        }
        org.telegram.messenger.y3.t(textView5, i16, 1, 20.0f);
        frameLayout5.addView(textView5, k7.b6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView5.setOnTouchListener(new oh.d(10));
        boolean[] zArr2 = {true};
        if (!DialogObject.isUserDialog(j10) || j10 == clientUserId || (user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j10))) == null || user.bot || (userStatus = user.status) == null || userStatus.expires <= 0) {
            context2 = context;
            viewGroup = frameLayout3;
            i11 = i18;
            frameLayout2 = frameLayout;
            r82 = 0;
            i12 = -1;
            zArr = zArr2;
            j12 = clientUserId;
            viewGroup2 = frameLayout5;
            textView = null;
            r11 = s3Var;
            w0Var = null;
        } else {
            String firstName = UserObject.getFirstName(user);
            if (firstName.length() > 10) {
                firstName = firstName.substring(0, 10) + "…";
            }
            viewGroup = frameLayout3;
            frameLayout2 = frameLayout;
            r82 = 0;
            i12 = -1;
            j12 = clientUserId;
            viewGroup2 = frameLayout5;
            r11 = s3Var;
            textView = null;
            i11 = i18;
            zArr = zArr2;
            w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, x4Var.a, false, f6Var);
            context2 = context;
            w0Var.setLongClickEnabled(false);
            w0Var.setSubMenuOpenSide(2);
            w0Var.setIcon(R.drawable.ic_ab_other);
            w0Var.setBackground(org.telegram.ui.ActionBar.j6.f0(i17, 1, -1));
            viewGroup2.addView(w0Var, k7.b6.d(40, 40.0f, 53, 0.0f, 8.0f, 5.0f, 0.0f));
            w0Var.g(1, LocaleController.formatString(R.string.ScheduleWhenOnline, firstName));
            w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        }
        int i19 = 14;
        if (w0Var != null) {
            w0Var.setOnClickListener(new org.telegram.messenger.video.g(26, w0Var, x4Var));
            w0Var.setDelegate(new androidx.car.app.utils.a(y4Var, zArr, b3Var, i19));
        }
        jj0 jj0Var3 = new jj0(context2);
        final gj0 gj0Var = new gj0(R.raw.notify_toggle, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        gj0Var.H(true);
        gj0Var.h = true;
        gj0Var.start();
        gj0Var.K(40);
        gj0Var.N(40);
        jj0Var3.setScaleType(ImageView.ScaleType.CENTER);
        jj0Var3.setAnimation(gj0Var);
        jj0Var3.setColorFilter(new PorterDuffColorFilter(i16, PorterDuff.Mode.SRC_IN));
        jj0Var3.setBackground(org.telegram.ui.ActionBar.j6.f0(i17, 1, i12));
        viewGroup2.addView(jj0Var3, k7.b6.d(40, 40.0f, 53, 0.0f, 8.0f, (w0Var != null ? 42 : 0) + 8, 0.0f));
        ?? linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(r82);
        linearLayout.setWeightSum(1.0f);
        r11.addView(linearLayout, k7.b6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar3 = Calendar.getInstance();
        final gg.q qVar = new gg.q(context2, 13);
        linearLayout.addView(xc0Var, k7.b6.l(0.5f, r82, 270));
        xc0Var.setMinValue(r82);
        xc0Var.setMaxValue(365);
        xc0Var.setWrapSelectorWheel(r82);
        xc0Var.setFormatter(new org.telegram.ui.bs(29));
        ViewGroup viewGroup4 = r11;
        final boolean[] zArr3 = zArr;
        final long j13 = j12;
        int i20 = i11;
        vc0 vc0Var = new vc0() { // from class: org.telegram.ui.Components.j2
            @Override // org.telegram.ui.Components.vc0
            public final void q(xc0 xc0Var2, int i21) {
                z4.g(gg.q.this, null, 0L, 0L, j13 == j10 ? 1 : 0, xc0Var, q3Var2, r3Var);
            }
        };
        xc0Var.setOnValueChangedListener(vc0Var);
        q3Var2.setMinValue(r82);
        q3Var2.setMaxValue(23);
        org.telegram.ui.ActionBar.w0 w0Var3 = w0Var;
        linearLayout.addView(q3Var2, k7.b6.l(0.2f, r82, 270));
        q3Var2.setFormatter(new k2(r82));
        q3Var2.setOnValueChangedListener(vc0Var);
        r3Var.setMinValue(r82);
        r3Var.setMaxValue(59);
        r3Var.setValue(r82);
        r3Var.setFormatter(new k2(1));
        linearLayout.addView(r3Var, k7.b6.l(0.3f, r82, 270));
        r3Var.setOnValueChangedListener(vc0Var);
        if (j11 <= 0 || j11 == 2147483646) {
            q3Var = q3Var2;
            calendar = calendar3;
        } else {
            long j14 = 1000 * j11;
            q3Var = q3Var2;
            calendar = calendar3;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j14 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j14);
            if (timeInMillis >= 0) {
                r3Var.setValue(calendar.get(12));
                q3Var.setValue(calendar.get(11));
                xc0Var.setValue(timeInMillis);
            }
        }
        final boolean[] zArr4 = {true};
        final q3 q3Var3 = q3Var;
        g(qVar, null, 0L, 0L, j13 == j10 ? 1 : 0, xc0Var, q3Var3, r3Var);
        boolean isTestBackend = ConnectionsManager.getInstance(UserConfig.selectedAccount).isTestBackend();
        if (isTestBackend) {
            c3 = '\t';
            i13 = 8;
            iArr = new int[]{0, 60, 300, 86400, 604800, 1209600, 2592000, 7862400, 15724800, 31536000};
        } else {
            c3 = '\t';
            i13 = 8;
            iArr = new int[]{0, 86400, 604800, 1209600, 2592000, 7862400, 15724800, 31536000};
        }
        if (isTestBackend) {
            strArr = new String[10];
            strArr[0] = LocaleController.getString(R.string.MessageScheduledRepeatOptionNever);
            strArr[1] = "Every minute";
            strArr[2] = "Every 5 minutes";
            strArr[3] = LocaleController.getString(R.string.MessageScheduledRepeatOptionDaily);
            strArr[4] = LocaleController.getString(R.string.MessageScheduledRepeatOptionWeekly);
            strArr[5] = LocaleController.getString(R.string.MessageScheduledRepeatOptionBiweekly);
            strArr[6] = LocaleController.getString(R.string.MessageScheduledRepeatOptionMonthly);
            strArr[7] = LocaleController.getString(R.string.MessageScheduledRepeatOption3Monthly);
            strArr[i13] = LocaleController.getString(R.string.MessageScheduledRepeatOption6Monthly);
            strArr[c3] = LocaleController.getString(R.string.MessageScheduledRepeatOptionYearly);
        } else {
            strArr = new String[i13];
            strArr[0] = LocaleController.getString(R.string.MessageScheduledRepeatOptionNever);
            strArr[1] = LocaleController.getString(R.string.MessageScheduledRepeatOptionDaily);
            strArr[2] = LocaleController.getString(R.string.MessageScheduledRepeatOptionWeekly);
            strArr[3] = LocaleController.getString(R.string.MessageScheduledRepeatOptionBiweekly);
            strArr[4] = LocaleController.getString(R.string.MessageScheduledRepeatOptionMonthly);
            strArr[5] = LocaleController.getString(R.string.MessageScheduledRepeatOption3Monthly);
            strArr[6] = LocaleController.getString(R.string.MessageScheduledRepeatOption6Monthly);
            strArr[7] = LocaleController.getString(R.string.MessageScheduledRepeatOptionYearly);
        }
        if (z4) {
            calendar2 = calendar;
            jj0Var = jj0Var3;
            i14 = i20;
            iArr2 = iArr;
            w0Var2 = w0Var3;
            viewGroup3 = viewGroup4;
            strArr2 = strArr;
            textView2 = textView;
            textView3 = textView2;
            textView4 = textView3;
        } else {
            ?? frameLayout6 = new FrameLayout(context2);
            String[] strArr3 = strArr;
            int v = org.telegram.ui.ActionBar.j6.v(i20, org.telegram.ui.ActionBar.j6.l1(0.075f, i16));
            calendar2 = calendar;
            int l1 = org.telegram.ui.ActionBar.j6.l1(0.1f, i16);
            textView4 = new TextView(context2);
            jj0Var = jj0Var3;
            textView4.setTextSize(1, 13.0f);
            textView4.setTextColor(i16);
            textView4.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            int dp = AndroidUtilities.dp(14.0f);
            int v10 = org.telegram.ui.ActionBar.j6.v(v, l1);
            textView4.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, v, v10, v10));
            textView4.setGravity(17);
            strArr2 = strArr3;
            int[] iArr4 = iArr;
            w0Var2 = w0Var3;
            i14 = i20;
            ?? khVar = new org.telegram.ui.kh(iArr4, iArr3, strArr2, textView4, 8);
            iArr2 = iArr4;
            khVar.run();
            frameLayout6.addView(textView4, k7.b6.d(-2, 28.0f, 1, 32.0f, 4.0f, 32.0f, 5.0f));
            ?? r22 = viewGroup4;
            r22.addView(frameLayout6, k7.b6.n(-1, -2));
            textView3 = khVar;
            textView2 = frameLayout6;
            viewGroup3 = r22;
        }
        ?? r56 = textView2;
        qVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        qVar.setGravity(17);
        qVar.setTextColor(x4Var.g);
        qVar.setTextSize(1, 14.0f);
        qVar.setTypeface(AndroidUtilities.bold());
        qVar.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{24.0f}, x4Var.h));
        viewGroup3.addView(qVar, k7.b6.t(-1, 48, 83, 16, 15, 16, 16));
        int i21 = i14;
        final Calendar calendar4 = calendar2;
        qVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.l2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zArr4[0] = false;
                int i22 = j13 == j10 ? 1 : 0;
                xc0 xc0Var2 = xc0Var;
                q3 q3Var4 = q3Var3;
                r3 r3Var2 = r3Var;
                boolean g10 = z4.g(null, null, 0L, 0L, i22, xc0Var2, q3Var4, r3Var2);
                long currentTimeMillis = System.currentTimeMillis();
                Calendar calendar5 = calendar4;
                calendar5.setTimeInMillis(currentTimeMillis);
                calendar5.add(6, xc0Var2.getValue());
                calendar5.set(11, q3Var4.getValue());
                calendar5.set(12, r3Var2.getValue());
                if (g10) {
                    calendar5.set(13, 0);
                    calendar5.set(14, 0);
                }
                y4Var.J((int) (calendar5.getTimeInMillis() / 1000), iArr3[0], zArr3[0]);
                b3Var.a.dismissRunnable.run();
            }
        });
        b3Var.b(viewGroup);
        String[] strArr4 = strArr2;
        org.telegram.ui.ActionBar.g3 g3Var2 = b3Var.a;
        g3Var2.show();
        g3Var2.setOnDismissListener(new m2(runnable, zArr4));
        g3Var2.setBackgroundColor(i21);
        g3Var2.fixNavigationBar(i21);
        if (textView4 != null) {
            jj0Var2 = jj0Var;
            i15 = 1;
            g3Var = g3Var2;
            textView4.setOnClickListener(new a2(frameLayout2, f6Var, g3Var2, (FrameLayout) r56, iArr2, strArr4, iArr3, (org.telegram.ui.kh) textView3));
        } else {
            g3Var = g3Var2;
            jj0Var2 = jj0Var;
            i15 = 1;
        }
        final ph.f3[] f3VarArr = new ph.f3[i15];
        final org.telegram.ui.ActionBar.w0 w0Var4 = w0Var2;
        jj0Var2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.d2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String string;
                boolean[] zArr5 = zArr3;
                boolean z10 = zArr5[0];
                zArr5[0] = !z10;
                gj0 gj0Var2 = gj0Var;
                if (z10) {
                    if (gj0Var2.Y < 40) {
                        gj0Var2.K(40);
                    }
                    gj0Var2.N(80);
                    gj0Var2.start();
                } else {
                    if (gj0Var2.Y >= 40) {
                        gj0Var2.K(0);
                    }
                    gj0Var2.N(40);
                    gj0Var2.start();
                }
                ph.f3[] f3VarArr2 = f3VarArr;
                ph.f3 f3Var = f3VarArr2[0];
                if (f3Var != null) {
                    f3Var.e(true);
                    f3VarArr2[0] = null;
                }
                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                long j15 = j10;
                TLRPC.User user2 = messagesController.getUser(Long.valueOf(j15));
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j15));
                ph.f3 f3Var2 = new ph.f3(context, 3);
                f3VarArr2[0] = f3Var2;
                f3Var2.r();
                f3Var2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                f3Var2.q(20.0f);
                float dp2 = AndroidUtilities.dp(12.0f);
                float dp3 = AndroidUtilities.dp(4.0f);
                int l12 = org.telegram.ui.ActionBar.j6.l1(0.25f, -16777216);
                f3Var2.f0 = dp2;
                f3Var2.g0 = dp3;
                f3Var2.h0 = l12;
                f3Var2.C.setShadowLayer(dp2, 0.0f, dp3, l12);
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    string = LocaleController.getString(zArr5[0] ? R.string.ScheduleNotifyOnChannel : R.string.ScheduleNotifyOffChannel);
                } else if (chat != null || user2 == null) {
                    string = LocaleController.getString(zArr5[0] ? R.string.ScheduleNotifyOnGroup : R.string.ScheduleNotifyOffGroup);
                } else if (j15 == j13) {
                    string = LocaleController.getString(zArr5[0] ? R.string.ScheduleNotifyOnSelf : R.string.ScheduleNotifyOffSelf);
                } else {
                    string = LocaleController.formatString(zArr5[0] ? R.string.ScheduleNotifyOnChat : R.string.ScheduleNotifyOffChat, UserObject.getForcedFirstName(user2));
                }
                f3Var2.s(string);
                f3Var2.d = 5000L;
                f3Var2.l(1.0f, -((w0Var4 != null ? 42 : -8) + 20));
                f3Var2.i0 = new fg(f3Var2, 2);
                org.telegram.ui.ActionBar.g3 g3Var3 = g3Var;
                g3Var3.getContainerView().setClipToPadding(false);
                g3Var3.getContainerView().setClipChildren(false);
                g3Var3.getContainerView().addView(f3Var2, k7.b6.d(-1, 200.0f, 48, 0.0f, -194.0f, 0.0f, 0.0f));
                f3Var2.u();
            }
        });
        return b3Var;
    }

    public static void L(Context context, long j10, y4 y4Var) {
        K(context, j10, -1L, 0, false, y4Var, null, new x4(null), null);
    }

    public static void M(Context context, long j10, y4 y4Var, org.telegram.ui.ActionBar.f6 f6Var) {
        K(context, j10, -1L, 0, false, y4Var, null, new x4(f6Var), f6Var);
    }

    public static AlertDialog$Builder N(Context context, String str, String str2) {
        return O(context, str, str2, null, null, null);
    }

    public static AlertDialog$Builder O(Context context, String str, String str2, String str3, Runnable runnable, org.telegram.ui.ActionBar.f6 f6Var) {
        if (context == null || str2 == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        if (str == null) {
            str = LocaleController.getString(R.string.AppName);
        }
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.O = str;
        d2Var.Q = str2;
        if (str3 == null) {
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            return alertDialog$Builder;
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(str3, new z0(6, runnable));
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.d2 P(Context context, org.telegram.ui.ActionBar.f6 f6Var, String str, CharSequence charSequence, String str2, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.O = str;
        d2Var.Q = charSequence;
        alertDialog$Builder.k(str2, new z0(5, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.a;
    }

    public static org.telegram.ui.ActionBar.p1 Q(org.telegram.ui.ActionBar.p2 p2Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, View view, float f10, float f11) {
        if (p2Var == null || view == null) {
            return null;
        }
        org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        p1Var.e = true;
        p1Var.c = 220;
        p1Var.setOutsideTouchable(true);
        p1Var.setClippingEnabled(true);
        p1Var.setAnimationStyle(R.style.PopupContextAnimation);
        p1Var.setFocusable(true);
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
        p1Var.setInputMethodMode(2);
        p1Var.getContentView().setFocusableInTouchMode(true);
        float f12 = 0.0f;
        View view2 = view;
        float f13 = 0.0f;
        while (view2 != view.getRootView()) {
            f12 += view2.getX();
            f13 += view2.getY();
            view2 = (View) view2.getParent();
            if (view2 == null) {
                break;
            }
        }
        p1Var.showAtLocation(view.getRootView(), 0, (int) ((f12 + f10) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() / 2.0f)), (int) ((f13 + f11) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() / 2.0f)));
        p1Var.b();
        return p1Var;
    }

    public static void R(Context context, org.telegram.ui.ActionBar.p2 p2Var, String str, String str2, String str3, String str4, int i10, String str5, org.telegram.ui.ActionBar.f6 f6Var, MessagesStorage.StringCallback stringCallback) {
        Activity findActivity = AndroidUtilities.findActivity(context);
        View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        org.telegram.ui.ActionBar.d2[] d2VarArr = new org.telegram.ui.ActionBar.d2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        String string = str == null ? LocaleController.getString(R.string.AppName) : str;
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.O = string;
        d2Var.Q = str2;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i11 = org.telegram.ui.ActionBar.j6.j5;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xh, f6Var));
        editTextBoldCursor.setHint(str3);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setInputType(147457);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setMaxLines(10);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(11.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q6, f6Var));
        if (str4 != null) {
            editTextBoldCursor.setText(str4);
        }
        editTextBoldCursor.setOnEditorActionListener(new b2(editTextBoldCursor, i10, stringCallback, d2VarArr, currentFocus, 0));
        editTextBoldCursor.addTextChangedListener(new u3(i10, editTextBoldCursor));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
        gradientDrawable.setColor(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(i11, f6Var)));
        editTextBoldCursor.setBackground(gradientDrawable);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(editTextBoldCursor, k7.b6.k(20.0f, 9.0f, 20.0f, 9.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.a.a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
        alertDialog$Builder.k(str5, new e3.d(editTextBoldCursor, i10, stringCallback, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.bs(19));
        d2VarArr[0] = alertDialog$Builder.a;
        if (p2Var != null) {
            AndroidUtilities.requestAdjustNothing(findActivity, p2Var.getClassGuid());
        }
        org.telegram.ui.ActionBar.d2 d2Var2 = d2VarArr[0];
        d2Var2.e0 = false;
        d2Var2.setOnDismissListener(new kh.i(editTextBoldCursor, p2Var, findActivity, 2));
        d2VarArr[0].setOnShowListener(new e1(1, editTextBoldCursor));
        d2VarArr[0].show();
        editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
    }

    public static void S(Context context, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var, MessagesStorage.StringCallback stringCallback) {
        R(context, p2Var, LocaleController.getString(R.string.StoriesAlbumCreateNew), LocaleController.getString(R.string.StoriesAlbumAddHint), LocaleController.getString(R.string.StoriesAlbumTitleInputHint), null, 12, LocaleController.getString(R.string.Create), f6Var, stringCallback);
    }

    public static org.telegram.ui.ActionBar.b3 T(Context context, long j10, final y4 y4Var, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        int i11;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false);
        int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ji, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ni, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G8, false);
        int i12 = org.telegram.ui.ActionBar.j6.i6;
        org.telegram.ui.ActionBar.j6.w0(null, i12, false);
        int w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false);
        int w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
        if (context == null) {
            return null;
        }
        final org.telegram.ui.ActionBar.b3 b3Var = new org.telegram.ui.ActionBar.b3(context, f6Var);
        b3Var.a();
        final xc0 xc0Var = new xc0(context, f6Var);
        xc0Var.setTextColor(w02);
        xc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        xc0Var.setItemCount(5);
        final p4 p4Var = new p4(context, f6Var);
        p4Var.setWrapSelectorWheel(true);
        p4Var.setAllItemsCount(24);
        p4Var.setItemCount(5);
        p4Var.setTextColor(w02);
        p4Var.setTextOffset(-AndroidUtilities.dp(10.0f));
        final q4 q4Var = new q4(context, f6Var);
        q4Var.setWrapSelectorWheel(true);
        q4Var.setAllItemsCount(60);
        q4Var.setItemCount(5);
        q4Var.setTextColor(w02);
        q4Var.setTextOffset(-AndroidUtilities.dp(34.0f));
        s3 s3Var = new s3(context, xc0Var, p4Var, q4Var, 5);
        s3Var.setOrientation(1);
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        s3Var.addView(f10, k7.b6.t(-1, -2, 51, 22, 0, 22, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(i10 == 1 ? R.string.SuggestedPostAcceptTitle : R.string.PostSuggestionsAddTime));
        textView.setTextColor(w02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        f10.addView(textView, k7.b6.t(-2, -2, 51, 0, 12, 0, 0));
        textView.setOnTouchListener(new oh.d(10));
        TextView textView2 = new TextView(context);
        org.telegram.ui.b.l(org.telegram.ui.ActionBar.j6.z6, f6Var, textView2, 1, 14.0f);
        textView2.setText(LocaleController.getString(R.string.PostSuggestionsAddTimeHint));
        f10.addView(textView2, k7.b6.t(-2, -2, 51, 0, 2, 0, 0));
        textView2.setOnTouchListener(new oh.d(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        s3Var.addView(linearLayout, k7.b6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long currentTimeMillis = System.currentTimeMillis();
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i13 = calendar.get(1);
        AppGlobalConfig.ConfigTime configTime = MessagesController.getInstance(UserConfig.selectedAccount).config.starsSuggestedPostFutureMin;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        final long j11 = configTime.get(timeUnit) * 2;
        final long j12 = MessagesController.getInstance(UserConfig.selectedAccount).config.starsSuggestedPostFutureMax.get(timeUnit) - 86400;
        final gg.q qVar = new gg.q(context, 19);
        linearLayout.addView(xc0Var, k7.b6.l(0.5f, 0, 270));
        xc0Var.setMinValue(0);
        xc0Var.setMaxValue(365);
        xc0Var.setWrapSelectorWheel(false);
        xc0Var.setFormatter(new d4.b(i13, 4));
        final int i14 = i10 == 1 ? 5 : 3;
        vc0 vc0Var = new vc0() { // from class: org.telegram.ui.Components.w1
            @Override // org.telegram.ui.Components.vc0
            public final void q(xc0 xc0Var2, int i15) {
                z4.g(gg.q.this, null, j11, j12, i14, xc0Var, p4Var, q4Var);
            }
        };
        xc0Var.setOnValueChangedListener(vc0Var);
        p4Var.setMinValue(0);
        p4Var.setMaxValue(23);
        linearLayout.addView(p4Var, k7.b6.l(0.2f, 0, 270));
        p4Var.setFormatter(new org.telegram.ui.bs(14));
        p4Var.setOnValueChangedListener(vc0Var);
        q4Var.setMinValue(0);
        q4Var.setMaxValue(59);
        q4Var.setValue(0);
        q4Var.setFormatter(new org.telegram.ui.bs(15));
        linearLayout.addView(q4Var, k7.b6.l(0.3f, 0, 270));
        q4Var.setOnValueChangedListener(vc0Var);
        if (j10 <= 0 || j10 == 2147483646) {
            i11 = w03;
        } else {
            long j13 = 1000 * j10;
            i11 = w03;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j13 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j13);
            if (timeInMillis >= 0) {
                q4Var.setValue(calendar.get(12));
                p4Var.setValue(calendar.get(11));
                xc0Var.setValue(timeInMillis);
            }
        }
        final boolean[] zArr = {true};
        g(qVar, null, j11, j12, i14, xc0Var, p4Var, q4Var);
        qVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        qVar.setGravity(17);
        qVar.setTextColor(w04);
        qVar.setTextSize(1, 14.0f);
        qVar.setTypeface(AndroidUtilities.bold());
        qVar.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{8.0f}, w05));
        s3Var.addView(qVar, k7.b6.t(-1, 48, 83, 16, 15, 16, 4));
        final int i15 = i14;
        int i16 = 15;
        qVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.x1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zArr[0] = false;
                long j14 = j11;
                long j15 = j12;
                int i17 = i15;
                xc0 xc0Var2 = xc0Var;
                p4 p4Var2 = p4Var;
                q4 q4Var2 = q4Var;
                boolean g10 = z4.g(null, null, j14, j15, i17, xc0Var2, p4Var2, q4Var2);
                long epochMilli = LocalDate.now().plusDays(xc0Var2.getValue()).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
                Calendar calendar2 = calendar;
                calendar2.setTimeInMillis(epochMilli);
                calendar2.set(11, p4Var2.getValue());
                calendar2.set(12, q4Var2.getValue());
                if (g10) {
                    calendar2.set(13, 0);
                }
                y4Var.J((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                b3Var.a.dismissRunnable.run();
            }
        });
        k7.d6.b(qVar, 0.02f, 1.2f);
        gg.q qVar2 = new gg.q(context, 20);
        qVar2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        qVar2.setGravity(17);
        qVar2.setText(LocaleController.getString(i10 == 1 ? R.string.MessageSuggestionPublishNow : R.string.PostSuggestionsAnytime));
        qVar2.setTextColor(w05);
        qVar2.setTextSize(1, 14.0f);
        int dp = AndroidUtilities.dp(8.0f);
        int w06 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false);
        int w07 = org.telegram.ui.ActionBar.j6.w0(null, i12, false);
        qVar2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, w06, w07, w07));
        s3Var.addView(qVar2, k7.b6.t(-1, 48, 83, 16, 0, 16, 16));
        qVar2.setOnClickListener(new dg.p(zArr, y4Var, b3Var, i16));
        k7.d6.b(qVar2, 0.02f, 1.2f);
        b3Var.b(s3Var);
        org.telegram.ui.ActionBar.g3 g3Var = b3Var.a;
        g3Var.show();
        g3Var.setOnDismissListener(new dg.e0(zArr));
        g3Var.setBackgroundColor(i11);
        g3Var.fixNavigationBar(i11);
        return b3Var;
    }

    public static org.telegram.ui.ActionBar.d2 U(org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        if (p2Var == null || p2Var.getParentActivity() == null) {
            return null;
        }
        f90 f90Var = new f90(p2Var.getParentActivity(), p2Var.getResourceProvider());
        SpannableString spannableString = new SpannableString(Html.fromHtml(LocaleController.getString(R.string.AskAQuestionInfo).replace("\n", "<br>")));
        for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new h4(p2Var, uRLSpan.getURL()), spanStart, spanEnd, 0);
        }
        f90Var.setText(spannableString);
        f90Var.setTextSize(1, 16.0f);
        f90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.k5, f6Var));
        f90Var.setHighlightColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.l5, f6Var));
        f90Var.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
        f90Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        f90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j5, f6Var));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getParentActivity(), 0, f6Var);
        alertDialog$Builder.n(f90Var);
        alertDialog$Builder.a.O = LocaleController.getString(R.string.AskAQuestion);
        alertDialog$Builder.k(LocaleController.getString(R.string.AskButton), new p2(1, p2Var));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.a;
    }

    public static AlertDialog$Builder V(Context context, TLRPC.EncryptedChat encryptedChat, org.telegram.ui.ActionBar.f6 f6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        alertDialog$Builder.a.O = LocaleController.getString(R.string.MessageLifetime);
        xc0 xc0Var = new xc0(context, null);
        xc0Var.setMinValue(0);
        xc0Var.setMaxValue(20);
        int i10 = encryptedChat.ttl;
        if (i10 > 0 && i10 < 16) {
            xc0Var.setValue(i10);
        } else if (i10 == 30) {
            xc0Var.setValue(16);
        } else if (i10 == 60) {
            xc0Var.setValue(17);
        } else if (i10 == 3600) {
            xc0Var.setValue(18);
        } else if (i10 == 86400) {
            xc0Var.setValue(19);
        } else if (i10 == 604800) {
            xc0Var.setValue(20);
        } else if (i10 == 0) {
            xc0Var.setValue(0);
        }
        xc0Var.setFormatter(new k2(5));
        alertDialog$Builder.n(xc0Var);
        alertDialog$Builder.h(LocaleController.getString(R.string.Done), new o1(3, encryptedChat, xc0Var));
        return alertDialog$Builder;
    }

    public static void W(org.telegram.ui.ActionBar.p2 p2Var, int i10, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.ActionBar.h6 h6Var) {
        int i11;
        String sb;
        if (p2Var.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = p2Var.getParentActivity();
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(parentActivity);
        String str = null;
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.u5, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.v5, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
        alertDialog$Builder.a.O = LocaleController.getString(R.string.NewTheme);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Create), new k2(6));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        TextView textView = new TextView(parentActivity);
        if (i10 != 0) {
            org.telegram.messenger.y3.q(R.string.EnterThemeNameEdit, textView);
        } else {
            textView.setText(LocaleController.getString(R.string.EnterThemeName));
        }
        textView.setTextSize(1, 16.0f);
        textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
        int i12 = org.telegram.ui.ActionBar.j6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        linearLayout.addView(textView, k7.b6.n(-1, -2));
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        linearLayout.addView(editTextBoldCursor, k7.b6.t(-1, 36, 51, 24, 6, 24, 0));
        editTextBoldCursor.setOnEditorActionListener(new cg.a0(2));
        List asList = Arrays.asList("Ancient", "Antique", "Autumn", "Baby", "Barely", "Baroque", "Blazing", "Blushing", "Bohemian", "Bubbly", "Burning", "Buttered", "Classic", "Clear", "Cool", "Cosmic", "Cotton", "Cozy", "Crystal", "Dark", "Daring", "Darling", "Dawn", "Dazzling", "Deep", "Deepest", "Delicate", "Delightful", "Divine", "Double", "Downtown", "Dreamy", "Dusky", "Dusty", "Electric", "Enchanted", "Endless", "Evening", "Fantastic", "Flirty", "Forever", "Frigid", "Frosty", "Frozen", "Gentle", "Heavenly", "Hyper", "Icy", "Infinite", "Innocent", "Instant", "Luscious", "Lunar", "Lustrous", "Magic", "Majestic", "Mambo", "Midnight", "Millenium", "Morning", "Mystic", "Natural", "Neon", "Night", "Opaque", "Paradise", "Perfect", "Perky", "Polished", "Powerful", "Rich", "Royal", "Sheer", "Simply", "Sizzling", "Solar", "Sparkling", "Splendid", "Spicy", "Spring", "Stellar", "Sugared", "Summer", "Sunny", "Super", "Sweet", "Tender", "Tenacious", "Tidal", "Toasted", "Totally", "Tranquil", "Tropical", "True", "Twilight", "Twinkling", "Ultimate", "Ultra", "Velvety", "Vibrant", "Vintage", "Virtual", "Warm", "Warmest", "Whipped", "Wild", "Winsome");
        List asList2 = Arrays.asList("Ambrosia", "Attack", "Avalanche", "Blast", "Bliss", "Blossom", "Blush", "Burst", "Butter", "Candy", "Carnival", "Charm", "Chiffon", "Cloud", "Comet", "Delight", "Dream", "Dust", "Fantasy", "Flame", "Flash", "Fire", "Freeze", "Frost", "Glade", "Glaze", "Gleam", "Glimmer", "Glitter", "Glow", "Grande", "Haze", "Highlight", "Ice", "Illusion", "Intrigue", "Jewel", "Jubilee", "Kiss", "Lights", "Lollypop", "Love", "Luster", "Madness", "Matte", "Mirage", "Mist", "Moon", "Muse", "Myth", "Nectar", "Nova", "Parfait", "Passion", "Pop", "Rain", "Reflection", "Rhapsody", "Romance", "Satin", "Sensation", "Silk", "Shine", "Shadow", "Shimmer", "Sky", "Spice", "Star", "Sugar", "Sunrise", "Sunset", "Sun", "Twist", "Unbound", "Velvet", "Vibrant", "Waters", "Wine", "Wink", "Wonder", "Zone");
        HashMap hashMap = new HashMap();
        vh.w2.l(9306112, hashMap, "Berry", 14598550, "Brandy");
        vh.w2.l(8391495, hashMap, "Cherry", 16744272, "Coral");
        vh.w2.l(14372985, hashMap, "Cranberry", 14423100, "Crimson");
        vh.w2.l(14725375, hashMap, "Mauve", 16761035, "Pink");
        vh.w2.l(16711680, hashMap, "Red", 16711807, "Rose");
        vh.w2.l(8406555, hashMap, "Russet", 16720896, "Scarlet");
        vh.w2.l(15856113, hashMap, "Seashell", 16724889, "Strawberry");
        vh.w2.l(16760576, hashMap, "Amber", 15438707, "Apricot");
        vh.w2.l(16508850, hashMap, "Banana", 10601738, "Citrus");
        vh.w2.l(11560192, hashMap, "Ginger", 16766720, "Gold");
        vh.w2.l(16640272, hashMap, "Lemon", 16753920, "Orange");
        vh.w2.l(16770484, hashMap, "Peach", 16739155, "Persimmon");
        vh.w2.l(14996514, hashMap, "Sunflower", 15893760, "Tangerine");
        vh.w2.l(16763004, hashMap, "Topaz", 16776960, "Yellow");
        vh.w2.l(3688720, hashMap, "Clover", 8628829, "Cucumber");
        vh.w2.l(5294200, hashMap, "Emerald", 11907932, "Olive");
        vh.w2.l(65280, hashMap, "Green", 43115, "Jade");
        vh.w2.l(2730887, hashMap, "Jungle", 12582656, "Lime");
        vh.w2.l(776785, hashMap, "Malachite", 10026904, "Mint");
        vh.w2.l(11394989, hashMap, "Moss", 3234721, "Azure");
        vh.w2.l(255, hashMap, "Blue", 18347, "Cobalt");
        vh.w2.l(5204422, hashMap, "Indigo", 96647, "Lagoon");
        vh.w2.l(7461346, hashMap, "Aquamarine", 1182351, "Ultramarine");
        vh.w2.l(128, hashMap, "Navy", 3101086, "Sapphire");
        vh.w2.l(7788522, hashMap, "Sky", 32896, "Teal");
        vh.w2.l(4251856, hashMap, "Turquoise", 10053324, "Amethyst");
        vh.w2.l(5046581, hashMap, "Blackberry", 6373457, "Eggplant");
        vh.w2.l(13148872, hashMap, "Lilac", 11894492, "Lavender");
        vh.w2.l(13421823, hashMap, "Periwinkle", 8663417, "Plum");
        vh.w2.l(6684825, hashMap, "Purple", 14204888, "Thistle");
        vh.w2.l(14315734, hashMap, "Orchid", 2361920, "Violet");
        vh.w2.l(4137225, hashMap, "Bronze", 3604994, "Chocolate");
        vh.w2.l(8077056, hashMap, "Cinnamon", 3153694, "Cocoa");
        vh.w2.l(7365973, hashMap, "Coffee", 7956873, "Rum");
        vh.w2.l(5113350, hashMap, "Mahogany", 7875865, "Mocha");
        vh.w2.l(12759680, hashMap, "Sand", 8924439, "Sienna");
        vh.w2.l(7864585, hashMap, "Maple", 15787660, "Khaki");
        vh.w2.l(12088115, hashMap, "Copper", 12144200, "Chestnut");
        vh.w2.l(15653316, hashMap, "Almond", 16776656, "Cream");
        vh.w2.l(12186367, hashMap, "Diamond", 11109127, "Honey");
        vh.w2.l(16777200, hashMap, "Ivory", 15392968, "Pearl");
        vh.w2.l(15725299, hashMap, "Porcelain", 13745832, "Vanilla");
        vh.w2.l(16777215, hashMap, "White", 8421504, "Gray");
        vh.w2.l(0, hashMap, "Black", 15266260, "Chrome");
        vh.w2.l(3556687, hashMap, "Charcoal", 789277, "Ebony");
        vh.w2.l(12632256, hashMap, "Silver", 16119285, "Smoke");
        vh.w2.l(2499381, hashMap, "Steel", 5220413, "Apple");
        vh.w2.l(8434628, hashMap, "Glacier", 16693933, "Melon");
        vh.w2.l(12929932, hashMap, "Mulberry", 11126466, "Opal");
        hashMap.put(5547512, "Blue");
        org.telegram.ui.ActionBar.h6 k10 = h6Var == null ? org.telegram.ui.ActionBar.j6.A0().k(false) : h6Var;
        if (k10 == null || (i11 = k10.c) == 0) {
            i11 = AndroidUtilities.calcDrawableColor(org.telegram.ui.ActionBar.j6.r0())[0];
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
            sb = android.support.v4.media.a.p((String) asList.get(Utilities.random.nextInt(asList.size())), " ", str, new StringBuilder());
        } else {
            StringBuilder f10 = vh.w2.f(str, " ");
            f10.append((String) asList2.get(Utilities.random.nextInt(asList2.size())));
            sb = f10.toString();
        }
        editTextBoldCursor.setText(sb);
        editTextBoldCursor.setSelection(editTextBoldCursor.length());
        e1 e1Var = new e1(2, editTextBoldCursor);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.setOnShowListener(e1Var);
        p2Var.showDialog(d2Var);
        editTextBoldCursor.requestFocus();
        d2Var.d(-1).setOnClickListener(new nh.c0(p2Var, editTextBoldCursor, h6Var, i6Var, d2Var, 8));
    }

    public static void X(Activity activity, String str, int i10, int i11, int i12, Utilities.Callback callback) {
        if (activity == null) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false);
        int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ji, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ni, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G8, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
        org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(activity, null, false, false);
        g3Var.fixNavigationBar();
        g3Var.applyBottomPadding = false;
        m3 m3Var = new m3(activity, null);
        n3 n3Var = new n3(activity, m3Var);
        n3Var.setOrientation(0);
        n3Var.setWeightSum(1.0f);
        m3Var.setAllItemsCount(24);
        m3Var.setItemCount(5);
        m3Var.setTextColor(w02);
        m3Var.setGravity(5);
        m3Var.setTextOffset(-AndroidUtilities.dp(12.0f));
        o3 o3Var = new o3(activity, null);
        o3Var.setWrapSelectorWheel(true);
        o3Var.setAllItemsCount(60);
        o3Var.setItemCount(5);
        o3Var.setTextColor(w02);
        o3Var.setGravity(3);
        o3Var.setTextOffset(AndroidUtilities.dp(12.0f));
        final lh.h3 h3Var = new lh.h3(i11, i12, m3Var, o3Var, i10, n3Var);
        n3Var.addView(m3Var, k7.b6.l(0.5f, 0, 270));
        m3Var.setFormatter(new org.telegram.ui.bs(27));
        final int i13 = 0;
        m3Var.setOnValueChangedListener(new vc0() { // from class: org.telegram.ui.Components.h2
            @Override // org.telegram.ui.Components.vc0
            public final void q(xc0 xc0Var, int i14) {
                switch (i13) {
                    case 0:
                        h3Var.run(Boolean.TRUE);
                        break;
                    default:
                        h3Var.run(Boolean.TRUE);
                        break;
                }
            }
        });
        n3Var.addView(o3Var, k7.b6.l(0.5f, 0, 270));
        o3Var.setFormatter(new org.telegram.ui.bs(28));
        final int i14 = 1;
        o3Var.setOnValueChangedListener(new vc0() { // from class: org.telegram.ui.Components.h2
            @Override // org.telegram.ui.Components.vc0
            public final void q(xc0 xc0Var, int i142) {
                switch (i14) {
                    case 0:
                        h3Var.run(Boolean.TRUE);
                        break;
                    default:
                        h3Var.run(Boolean.TRUE);
                        break;
                }
            }
        });
        h3Var.run(Boolean.FALSE);
        p3 p3Var = new p3(activity, m3Var, o3Var);
        p3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextColor(w02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, k7.b6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new oh.d(10));
        p3Var.addView(frameLayout, k7.b6.t(-1, -2, 51, 22, 0, 0, 4));
        p3Var.addView(n3Var, k7.b6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        ph.d dVar = new ph.d(activity, null, true);
        dVar.setRoundRadius(24);
        dVar.g(LocaleController.getString(R.string.Select), false, true);
        dVar.setOnClickListener(new i2(r1, 0));
        p3Var.addView(dVar, k7.b6.t(-1, 48, 0, 16, 12, 16, 12));
        g3Var.customView = p3Var;
        g3Var.show();
        g3Var.setOnDismissListener(new kh.i(callback, m3Var, o3Var, 3));
        g3Var.setBackgroundColor(w03);
        g3Var.fixNavigationBar(w03);
        org.telegram.ui.ActionBar.g3[] g3VarArr = {g3Var};
    }

    public static org.telegram.ui.ActionBar.d2 Y(Activity activity, final long j10, final long j11, String str, final Runnable runnable, org.telegram.ui.ActionBar.f6 f6Var) {
        String[] strArr;
        final String str2 = str;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
        final int[] iArr = new int[1];
        if (j10 != 0) {
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
        LinearLayout h = kf.k0.h(activity, 1);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, f6Var);
        int i12 = 0;
        while (i12 < strArr2.length) {
            org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(activity, f6Var);
            j6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            j6Var.setTag(Integer.valueOf(i12));
            j6Var.a(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.g7, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E5, f6Var));
            j6Var.b(strArr2[i12], iArr[0] == i12);
            h.addView(j6Var);
            j6Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.y2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    iArr2[0] = intValue;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                    long j12 = j10;
                    String str3 = str2;
                    if (j12 != 0) {
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
                        NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannel(j12, j11);
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
                    alertDialog$Builder.a.I0.run();
                    runnable.run();
                }
            });
            i12++;
            str2 = str;
        }
        alertDialog$Builder.a.O = LocaleController.getString(R.string.Vibrate);
        alertDialog$Builder.n(h);
        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.a;
    }

    public static org.telegram.ui.ActionBar.d2 Z(Context context, org.telegram.ui.ActionBar.f6 f6Var, String[] strArr, int i10, String str, String str2, q0.a aVar) {
        boolean z4;
        if ((context instanceof Activity) && Build.VERSION.SDK_INT >= 23) {
            Activity activity = (Activity) context;
            for (String str3 : strArr) {
                if (activity.checkSelfPermission(str3) != 0 && activity.shouldShowRequestPermissionRationale(str3)) {
                    z4 = true;
                    break;
                }
            }
        }
        z4 = false;
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        alertDialog$Builder.m(i10, 72, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
        if (z4) {
            str = str2;
        }
        alertDialog$Builder.a.Q = AndroidUtilities.replaceTags(str);
        alertDialog$Builder.k(LocaleController.getString(z4 ? R.string.PermissionOpenSettings : R.string.BotWebViewRequestAllow), new o9.b(z4, context, atomicBoolean, aVar, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.BotWebViewRequestDontAllow), new mg.w(27, atomicBoolean, aVar));
        alertDialog$Builder.a.setOnDismissListener(new gg.g(4, atomicBoolean, aVar));
        return alertDialog$Builder.a;
    }

    public static /* synthetic */ void a(Activity activity) {
        if (activity.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
            activity.requestPermissions(new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION"}, 30);
        }
    }

    public static void a0(int i10, int i11, long j10, Utilities.Callback callback) {
        b0(i10, j10, i11, callback, 0L);
    }

    public static void b(xc0 xc0Var, xc0 xc0Var2, xc0 xc0Var3) {
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
        xc0Var3.setMaxValue(i14);
        xc0Var3.setMinValue(i11);
        int value = xc0Var3.getValue();
        xc0Var2.setMaxValue(value == i14 ? i15 : 11);
        xc0Var2.setMinValue(value == i11 ? i12 : 0);
        int value2 = xc0Var2.getValue();
        calendar.set(1, value);
        calendar.set(2, value2);
        int actualMaximum = calendar.getActualMaximum(5);
        if (value == i14 && value2 == i15) {
            actualMaximum = Math.min(i16, actualMaximum);
        }
        xc0Var.setMaxValue(actualMaximum);
        if (value == i11 && value2 == i12) {
            i10 = i13;
        }
        xc0Var.setMinValue(i10);
    }

    public static boolean b0(final int i10, final long j10, int i11, Utilities.Callback callback, long j11) {
        TLRPC.Chat chat;
        long sendPaidMessagesStars = MessagesController.getInstance(i10).getSendPaidMessagesStars(j10);
        if (sendPaidMessagesStars <= 0 && j10 > 0) {
            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i10).isUserContactBlocked(j10));
        }
        long j12 = i11 * sendPaidMessagesStars;
        lh.t7.y(i10, false).P.put(Long.valueOf(j10), Integer.valueOf(i11));
        if (j12 <= 0 || j11 == j12) {
            callback.run(Long.valueOf(j12));
            return false;
        }
        final long j13 = sendPaidMessagesStars;
        final r2 r2Var = new r2(i10, j12, j10, callback, j13, 0);
        if (j13 <= MessagesController.getInstance(i10).getMainSettings().getLong(e2.c.i(j10, "ask_paid_message_", "_price"), 0L)) {
            r2Var.run();
            return true;
        }
        Activity activity = AndroidUtilities.getActivity();
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        org.telegram.ui.ActionBar.f6 bVar = (PhotoViewer.t1().Q1() || (U != null && U.hasShownSheet())) ? new nh.b() : U != null ? U.getResourceProvider() : null;
        String shortName = DialogObject.getShortName(i10, j10);
        if (ChatObject.isMonoForum(i10, j10)) {
            shortName = ag.f.h(i10, j10);
        } else if (U instanceof org.telegram.ui.zn) {
            org.telegram.ui.zn znVar = (org.telegram.ui.zn) U;
            if (znVar.d4 && znVar.a() == j10 && (chat = znVar.c4) != null) {
                shortName = DialogObject.getShortName(i10, -chat.id);
            }
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i12 = (int) j13;
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessage1", i12, shortName)));
        spannableStringBuilder.append((CharSequence) " ");
        if (i11 == 1) {
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessage2One", i12)));
        } else {
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessage2Many1", (int) j12)));
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessage2Many2", i11)));
        }
        i0(activity, LocaleController.getString(R.string.MessageLockedStarsConfirmTitle), spannableStringBuilder, LocaleController.getString(R.string.MessageLockedStarsConfirmMessageDontAsk), LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessagePay", i11), new Utilities.Callback() { // from class: org.telegram.ui.Components.n0
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    int i13 = i10;
                    SharedPreferences.Editor edit = MessagesController.getInstance(i13).getMainSettings().edit();
                    long j14 = j10;
                    edit.putLong(e2.c.i(j14, "ask_paid_message_", "_price"), j13).apply();
                    lh.t7.y(i13, false).O.put(Long.valueOf(j14), Long.valueOf(System.currentTimeMillis()));
                }
                AndroidUtilities.runOnUIThread(r2Var);
            }
        }, bVar, true);
        return true;
    }

    public static long c(ph.d dVar, xc0 xc0Var, xc0 xc0Var2, xc0 xc0Var3, xc0 xc0Var4) {
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i10 = 1;
        int i11 = calendar.get(1);
        int value = ((xc0Var2.getValue() - 120) / 12) + i11;
        calendar.clear();
        calendar.set(1, value);
        calendar.set(2, (xc0Var2.getValue() - 120) % 12);
        xc0Var.setMinValue(1);
        xc0Var.setMaxValue(calendar.getActualMaximum(5));
        int value2 = xc0Var.getValue();
        int value3 = xc0Var3.getValue();
        int value4 = xc0Var4.getValue();
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

    public static boolean c0(int i10, ArrayList arrayList, int i11, Utilities.Callback callback) {
        boolean z4 = false;
        if (arrayList.isEmpty()) {
            callback.run(new HashMap());
            return false;
        }
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        long j10 = 0;
        int i12 = 0;
        boolean z10 = true;
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            Long l10 = (Long) obj;
            long j11 = j10;
            long longValue = l10.longValue();
            long sendPaidMessagesStars = MessagesController.getInstance(i10).getSendPaidMessagesStars(longValue);
            if (sendPaidMessagesStars <= 0 && longValue > 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i10).isUserContactBlocked(longValue));
            }
            hashMap.put(l10, Long.valueOf(sendPaidMessagesStars));
            long j12 = j11 + sendPaidMessagesStars;
            lh.t7.y(i10, z4).P.put(l10, Integer.valueOf(i11));
            if (sendPaidMessagesStars > 0) {
                i12++;
            }
            if (sendPaidMessagesStars > 0 && z10 && MessagesController.getInstance(i10).getMainSettings().getLong(e2.c.i(longValue, "ask_paid_message_", "_price"), 0L) < sendPaidMessagesStars) {
                z10 = false;
            }
            j10 = j12;
            z4 = false;
        }
        long max = Math.max(1, i11) * j10;
        if (z10 || max <= 0) {
            callback.run(hashMap);
            return false;
        }
        Activity activity = AndroidUtilities.getActivity();
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        org.telegram.ui.ActionBar.f6 bVar = (PhotoViewer.t1().Q1() || (U != null && U.hasShownSheet())) ? new nh.b() : U != null ? U.getResourceProvider() : null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti1", i12)));
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti2", (int) max, LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i12) * i11))));
        i0(activity, LocaleController.getString(R.string.MessageLockedStarsConfirmTitle), spannableStringBuilder, LocaleController.getString(R.string.MessageLockedStarsConfirmMessageDontAsk), LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessagePay", i11), new org.telegram.ui.vq(i10, max, activity, arrayList, hashMap, callback, bVar), bVar, true);
        return true;
    }

    public static void d(xc0 xc0Var, xc0 xc0Var2, xc0 xc0Var3) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i10 = 1;
        int i11 = calendar.get(1);
        int i12 = calendar.get(2);
        int i13 = calendar.get(5);
        xc0Var3.setMinValue(i11);
        int value = xc0Var3.getValue();
        xc0Var2.setMinValue(value == i11 ? i12 : 0);
        int value2 = xc0Var2.getValue();
        if (value == i11 && value2 == i12) {
            i10 = i13;
        }
        xc0Var.setMinValue(i10);
    }

    public static boolean d0(int i10, long j10) {
        long sendPaidMessagesStars = MessagesController.getInstance(i10).getSendPaidMessagesStars(j10);
        if (sendPaidMessagesStars <= 0 && j10 > 0) {
            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i10).isUserContactBlocked(j10));
        }
        return sendPaidMessagesStars > 0 && sendPaidMessagesStars > MessagesController.getInstance(i10).getMainSettings().getLong(e2.c.i(j10, "ask_paid_message_", "_price"), 0L);
    }

    public static void e(TextView textView, xc0 xc0Var, y3 y3Var, z3 z3Var) {
        int value = xc0Var.getValue();
        int value2 = y3Var.getValue();
        int value3 = z3Var.getValue();
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

    public static void e0(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.ActionBar.p2 p2Var) {
        if (p2Var.getParentActivity() == null) {
            return;
        }
        AndroidUtilities.hideKeyboard(editTextBoldCursor);
        String obj = editTextBoldCursor.getText().toString();
        int i10 = org.telegram.ui.ActionBar.j6.a;
        org.telegram.ui.ActionBar.i6 i6Var = new org.telegram.ui.ActionBar.i6();
        i6Var.b = new File(ApplicationLoader.getFilesDirFixed(), "theme" + Utilities.random.nextLong() + ".attheme").getAbsolutePath();
        i6Var.a = obj;
        org.telegram.ui.ActionBar.j6.h0 = org.telegram.ui.ActionBar.j6.Y0(org.telegram.ui.ActionBar.j6.I.f0);
        i6Var.B = UserConfig.selectedAccount;
        org.telegram.ui.ActionBar.j6.r1(i6Var, true, true, false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
        new ThemeEditorView().c(p2Var.getParentActivity(), i6Var);
        d2Var.dismiss();
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("themehint", false)) {
            return;
        }
        globalMainSettings.edit().putBoolean("themehint", true).commit();
        try {
            Toast.makeText(p2Var.getParentActivity(), LocaleController.getString(R.string.CreateNewThemeHelp), 1).show();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void f(int i10, TLRPC.Chat chat, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers) {
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
        AndroidUtilities.runOnUIThread(new dg.f3(i10, chat, arrayList, arrayList2, arrayList3), 200L);
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
    public static org.telegram.ui.ActionBar.d2 f0(final int i10, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.p2 p2Var, TLObject tLObject, Object... objArr) {
        String str;
        String str2;
        final long j10;
        long peerDialogId;
        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
        if (tL_error != null && tL_error.code != 406 && (str = tL_error.text) != null) {
            if ("BALANCE_TOO_LOW".equalsIgnoreCase(str)) {
                final long o10 = lh.t7.o(tLObject);
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
                    j10 = 0;
                    if (o10 > 0) {
                        lh.t7.y(i10, false).q(true, true, new Runnable() { // from class: org.telegram.ui.Components.n2
                            @Override // java.lang.Runnable
                            public final void run() {
                                Activity activity = AndroidUtilities.getActivity();
                                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                                org.telegram.ui.ActionBar.f6 bVar = (PhotoViewer.t1().Q1() || (U != null && U.hasShownSheet())) ? new nh.b() : U != null ? U.getResourceProvider() : null;
                                int i11 = i10;
                                long j11 = j10;
                                new lh.z9(activity, bVar, o10, 13, DialogObject.getShortName(i11, j11), new cg.n0(24), j11).show();
                            }
                        });
                        return null;
                    }
                }
                j10 = peerDialogId;
                if (o10 > 0) {
                }
            } else {
                if (tL_error.text.equals("JOIN_GUARD_TIMEOUT")) {
                    u0(p2Var2, LocaleController.getString(R.string.GuardBotTimeoutTitle), LocaleController.getString(R.string.GuardBotTimeout), null);
                    return null;
                }
                boolean z4 = tLObject instanceof TLRPC.TL_messages_sendMessage;
                if (z4 && tL_error.text.contains("PRIVACY_PREMIUM_REQUIRED")) {
                    long peerDialogId2 = DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendMessage) tLObject).peer);
                    if (peerDialogId2 >= 0) {
                        str2 = UserObject.getFirstName(MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId2)));
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId2));
                        str2 = chat != null ? chat.title : "";
                    }
                    if (p2Var2 == null) {
                        p2Var2 = LaunchActivity.R();
                    }
                    u0(p2Var2, LocaleController.getString(R.string.MessagePremiumErrorTitle), LocaleController.formatString(R.string.MessagePremiumErrorMessage, str2), null);
                    MessagesController.getInstance(i10).invalidateUserPremiumBlocked(peerDialogId2, 0);
                    return null;
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_initHistoryImport;
                if (z10 || (tLObject instanceof TLRPC.TL_messages_checkHistoryImportPeer) || (tLObject instanceof TLRPC.TL_messages_checkHistoryImport) || (tLObject instanceof TLRPC.TL_messages_startHistoryImport)) {
                    TLRPC.InputPeer inputPeer = z10 ? ((TLRPC.TL_messages_initHistoryImport) tLObject).peer : tLObject instanceof TLRPC.TL_messages_startHistoryImport ? ((TLRPC.TL_messages_startHistoryImport) tLObject).peer : null;
                    org.telegram.ui.ActionBar.p2 R = p2Var2 == null ? LaunchActivity.R() : p2Var2;
                    if (tL_error.text.contains("USER_IS_BLOCKED")) {
                        u0(R, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportErrorUserBlocked), null);
                        return null;
                    }
                    if (tL_error.text.contains("USER_NOT_MUTUAL_CONTACT")) {
                        u0(R, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportMutualError), null);
                        return null;
                    }
                    if (tL_error.text.contains("IMPORT_PEER_TYPE_INVALID")) {
                        if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                            u0(R, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportErrorChatInvalidUser), null);
                            return null;
                        }
                        u0(R, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportErrorChatInvalidGroup), null);
                        return null;
                    }
                    if (tL_error.text.contains("CHAT_ADMIN_REQUIRED")) {
                        u0(R, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportErrorNotAdmin), null);
                        return null;
                    }
                    if (tL_error.text.startsWith("IMPORT_FORMAT")) {
                        u0(R, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportErrorFileFormatInvalid), null);
                        return null;
                    }
                    if (tL_error.text.startsWith("PEER_ID_INVALID")) {
                        u0(R, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportErrorPeerInvalid), null);
                        return null;
                    }
                    if (tL_error.text.contains("IMPORT_LANG_NOT_FOUND")) {
                        u0(R, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportErrorFileLang), null);
                        return null;
                    }
                    if (tL_error.text.contains("IMPORT_UPLOAD_FAILED")) {
                        u0(R, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportFailedToUpload), null);
                        return null;
                    }
                    if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        m0(R, tL_error.text);
                        return null;
                    }
                    String string = LocaleController.getString(R.string.ImportErrorTitle);
                    StringBuilder sb = new StringBuilder();
                    org.telegram.ui.b.i(R.string.ErrorOccurred, "\n", sb);
                    sb.append(tL_error.text);
                    u0(R, string, sb.toString(), null);
                } else {
                    if ((tLObject instanceof TL_account.saveSecureValue) || (tLObject instanceof TL_account.getAuthorizationForm)) {
                        org.telegram.ui.ActionBar.p2 R2 = p2Var2 == null ? LaunchActivity.R() : p2Var2;
                        if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                            u0(R2, null, LocaleController.getString(R.string.InvalidPhoneNumber), null);
                            return null;
                        }
                        if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            u0(R2, null, LocaleController.getString(R.string.FloodWait), null);
                            return null;
                        }
                        if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                            x0(R2.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                            return null;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        org.telegram.ui.b.i(R.string.ErrorOccurred, "\n", sb2);
                        sb2.append(tL_error.text);
                        u0(R2, null, sb2.toString(), null);
                        return null;
                    }
                    boolean z11 = tLObject instanceof TLRPC.TL_channels_joinChannel;
                    if (!z11 && !(tLObject instanceof TLRPC.TL_channels_editAdmin) && !(tLObject instanceof TLRPC.TL_channels_inviteToChannel) && !(tLObject instanceof TLRPC.TL_messages_addChatUser) && !(tLObject instanceof TLRPC.TL_messages_startBot) && !(tLObject instanceof TLRPC.TL_channels_editBanned) && !(tLObject instanceof TLRPC.TL_messages_editChatDefaultBannedRights) && !(tLObject instanceof TLRPC.TL_messages_editChatAdmin) && !(tLObject instanceof TLRPC.TL_messages_migrateChat) && !(tLObject instanceof TL_phone.inviteToGroupCall)) {
                        char c3 = 2;
                        if (tLObject instanceof TLRPC.TL_messages_createChat) {
                            org.telegram.ui.ActionBar.p2 R3 = p2Var2 == null ? LaunchActivity.R() : p2Var2;
                            if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                                if (R3.getParentActivity() != null) {
                                    R3.showDialog(new eg.v0(5, i10, R3.getParentActivity(), R3, null));
                                    return null;
                                }
                                R3.presentFragment(new ge1(2));
                                return null;
                            }
                            org.telegram.ui.ActionBar.p2 p2Var3 = R3;
                            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                m0(p2Var3, tL_error.text);
                                return null;
                            }
                            h0(tL_error, p2Var3, false, false, tLObject);
                            return null;
                        }
                        if (tLObject instanceof TLRPC.TL_channels_createChannel) {
                            org.telegram.ui.ActionBar.p2 R4 = p2Var2 == null ? LaunchActivity.R() : p2Var2;
                            if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                                if (R4.getParentActivity() != null) {
                                    R4.showDialog(new eg.v0(5, i10, R4.getParentActivity(), R4, null));
                                    return null;
                                }
                                R4.presentFragment(new ge1(2));
                                return null;
                            }
                            org.telegram.ui.ActionBar.p2 p2Var4 = R4;
                            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                m0(p2Var4, tL_error.text);
                                return null;
                            }
                            h0(tL_error, p2Var4, false, false, tLObject);
                            return null;
                        }
                        if (tLObject instanceof TLRPC.TL_messages_editMessage) {
                            if (!tL_error.text.equals("MESSAGE_NOT_MODIFIED")) {
                                if (p2Var2 != null) {
                                    u0(p2Var2, null, LocaleController.getString(R.string.EditMessageError), null);
                                    return null;
                                }
                                w0(null, LocaleController.getString(R.string.EditMessageError));
                                return null;
                            }
                        } else {
                            if (z4 || (tLObject instanceof TL_ephemeral.TL_sendMessage) || (tLObject instanceof TLRPC.TL_messages_sendMedia) || (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) || (tLObject instanceof TLRPC.TL_messages_forwardMessages) || (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) || (tLObject instanceof TLRPC.TL_messages_sendScheduledMessages)) {
                                long peerDialogId3 = z4 ? DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendMessage) tLObject).peer) : tLObject instanceof TLRPC.TL_messages_sendMedia ? DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendMedia) tLObject).peer) : tLObject instanceof TL_ephemeral.TL_sendMessage ? DialogObject.getPeerDialogId(((TL_ephemeral.TL_sendMessage) tLObject).peer) : tLObject instanceof TLRPC.TL_messages_sendInlineBotResult ? DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendInlineBotResult) tLObject).peer) : tLObject instanceof TLRPC.TL_messages_forwardMessages ? DialogObject.getPeerDialogId(((TLRPC.TL_messages_forwardMessages) tLObject).to_peer) : tLObject instanceof TLRPC.TL_messages_sendMultiMedia ? DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendMultiMedia) tLObject).peer) : tLObject instanceof TLRPC.TL_messages_sendScheduledMessages ? DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendScheduledMessages) tLObject).peer) : 0L;
                                String str3 = tL_error.text;
                                char c10 = 5;
                                if (str3 == null || !str3.startsWith("CHAT_SEND_") || !tL_error.text.endsWith("FORBIDDEN")) {
                                    String str4 = tL_error.text;
                                    str4.getClass();
                                    switch (str4.hashCode()) {
                                        case -1809401834:
                                            if (str4.equals("USER_BANNED_IN_CHANNEL")) {
                                                c3 = 0;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case -454039871:
                                            if (str4.equals("PEER_FLOOD")) {
                                                c3 = 1;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 1169786080:
                                            break;
                                        default:
                                            c3 = 65535;
                                            break;
                                    }
                                    switch (c3) {
                                        case 0:
                                            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 5);
                                            break;
                                        case 1:
                                            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 0);
                                            break;
                                        case 2:
                                            w0(p2Var2, LocaleController.getString(R.string.MessageScheduledLimitReached));
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
                                            c10 = 0;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -1755013292:
                                        if (str6.equals("CHAT_SEND_PLAIN_FORBIDDEN")) {
                                            c10 = 1;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -1463451737:
                                        if (str6.equals("CHAT_SEND_AUDIOS_FORBIDDEN")) {
                                            c10 = 2;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -446466679:
                                        if (str6.equals("CHAT_SEND_POLL_FORBIDDEN")) {
                                            c10 = 3;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 469767429:
                                        if (str6.equals("CHAT_SEND_DOCS_FORBIDDEN")) {
                                            c10 = 4;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 788688112:
                                        break;
                                    case 963091938:
                                        if (str6.equals("CHAT_SEND_VIDEOS_FORBIDDEN")) {
                                            c10 = 6;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 1100757753:
                                        if (str6.equals("CHAT_SEND_GIFS_FORBIDDEN")) {
                                            c10 = 7;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 1146489803:
                                        if (str6.equals("CHAT_SEND_PHOTOS_FORBIDDEN")) {
                                            c10 = '\b';
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 1701620704:
                                        if (str6.equals("CHAT_SEND_STICKERS_FORBIDDEN")) {
                                            c10 = '\t';
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    default:
                                        c10 = 65535;
                                        break;
                                }
                                switch (c10) {
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
                                org.telegram.ui.ActionBar.p2 R5 = p2Var2 == null ? LaunchActivity.R() : p2Var2;
                                if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                    u0(R5, null, LocaleController.getString(R.string.FloodWait), null);
                                    return null;
                                }
                                if (tL_error.text.equals("USERS_TOO_MUCH")) {
                                    u0(R5, null, LocaleController.getString(R.string.JoinToGroupErrorFull), null);
                                    return null;
                                }
                                if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                                    if (R5.getParentActivity() != null) {
                                        R5.showDialog(new eg.v0(5, i10, R5.getParentActivity(), R5, null));
                                        return null;
                                    }
                                    R5.presentFragment(new ge1(0));
                                    return null;
                                }
                                if (tL_error.text.equals("INVITE_HASH_EXPIRED")) {
                                    u0(R5, LocaleController.getString(R.string.ExpiredLink), LocaleController.getString(R.string.InviteExpired), null);
                                    return null;
                                }
                                u0(R5, null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
                                return null;
                            }
                            if (tLObject instanceof TLRPC.TL_messages_getAttachedStickers) {
                                if (p2Var2 != null && p2Var2.getParentActivity() != null) {
                                    Activity parentActivity = p2Var2.getParentActivity();
                                    StringBuilder sb3 = new StringBuilder();
                                    org.telegram.ui.b.i(R.string.ErrorOccurred, "\n", sb3);
                                    sb3.append(tL_error.text);
                                    Toast.makeText(parentActivity, sb3.toString(), 0).show();
                                    return null;
                                }
                            } else {
                                if ((tLObject instanceof TL_account.confirmPhone) || (tLObject instanceof TL_account.verifyPhone) || (tLObject instanceof TL_account.verifyEmail)) {
                                    return (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID") || tL_error.text.contains("CODE_INVALID") || tL_error.text.contains("CODE_EMPTY")) ? u0(p2Var2, null, LocaleController.getString(R.string.InvalidCode), null) : (tL_error.text.contains("PHONE_CODE_EXPIRED") || tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) ? u0(p2Var2, null, LocaleController.getString(R.string.CodeExpired), null) : tL_error.text.startsWith("FLOOD_WAIT") ? u0(p2Var2, null, LocaleController.getString(R.string.FloodWait), null) : u0(p2Var2, null, tL_error.text, null);
                                }
                                if (tLObject instanceof TLRPC.TL_auth_resendCode) {
                                    if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                                        return u0(p2Var2, null, LocaleController.getString(R.string.InvalidPhoneNumber), null);
                                    }
                                    if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                                        return u0(p2Var2, null, LocaleController.getString(R.string.InvalidCode), null);
                                    }
                                    if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                        return u0(p2Var2, null, LocaleController.getString(R.string.CodeExpired), null);
                                    }
                                    if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                        return u0(p2Var2, null, LocaleController.getString(R.string.FloodWait), null);
                                    }
                                    if (tL_error.code != -1000) {
                                        StringBuilder sb4 = new StringBuilder();
                                        org.telegram.ui.b.i(R.string.ErrorOccurred, "\n", sb4);
                                        sb4.append(tL_error.text);
                                        return u0(p2Var2, null, sb4.toString(), null);
                                    }
                                } else {
                                    if (tLObject instanceof TL_account.sendConfirmPhoneCode) {
                                        return tL_error.code == 400 ? u0(p2Var2, null, LocaleController.getString(R.string.CancelLinkExpired), null) : tL_error.text.startsWith("FLOOD_WAIT") ? u0(p2Var2, null, LocaleController.getString(R.string.FloodWait), null) : u0(p2Var2, null, LocaleController.getString(R.string.ErrorOccurred), null);
                                    }
                                    if (tLObject instanceof TL_account.changePhone) {
                                        if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                                            u0(p2Var2, null, LocaleController.getString(R.string.InvalidPhoneNumber), null);
                                            return null;
                                        }
                                        if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                                            u0(p2Var2, null, LocaleController.getString(R.string.InvalidCode), null);
                                            return null;
                                        }
                                        if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                            u0(p2Var2, null, LocaleController.getString(R.string.CodeExpired), null);
                                            return null;
                                        }
                                        if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                            u0(p2Var2, null, LocaleController.getString(R.string.FloodWait), null);
                                            return null;
                                        }
                                        if (tL_error.text.contains("FRESH_CHANGE_PHONE_FORBIDDEN")) {
                                            u0(p2Var2, LocaleController.getString(R.string.FreshChangePhoneForbiddenTitle), LocaleController.getString(R.string.FreshChangePhoneForbidden), null);
                                            return null;
                                        }
                                        u0(p2Var2, null, tL_error.text, null);
                                        return null;
                                    }
                                    if (tLObject instanceof TL_account.sendChangePhoneCode) {
                                        if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                                            org.telegram.ui.pg0.m1(p2Var2, (String) objArr[0], null, false);
                                            return null;
                                        }
                                        if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                                            u0(p2Var2, null, LocaleController.getString(R.string.InvalidCode), null);
                                            return null;
                                        }
                                        if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                            u0(p2Var2, null, LocaleController.getString(R.string.CodeExpired), null);
                                            return null;
                                        }
                                        if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                            u0(p2Var2, null, LocaleController.getString(R.string.FloodWait), null);
                                            return null;
                                        }
                                        if (tL_error.text.startsWith("PHONE_NUMBER_OCCUPIED")) {
                                            u0(p2Var2, null, LocaleController.formatString("ChangePhoneNumberOccupied", R.string.ChangePhoneNumberOccupied, objArr[0]), null);
                                            return null;
                                        }
                                        if (tL_error.text.startsWith("PHONE_NUMBER_BANNED")) {
                                            org.telegram.ui.pg0.m1(p2Var2, (String) objArr[0], null, true);
                                            return null;
                                        }
                                        u0(p2Var2, null, LocaleController.getString(R.string.ErrorOccurred), null);
                                        return null;
                                    }
                                    if (tLObject instanceof TL_account.updateUsername) {
                                        String str7 = tL_error.text;
                                        str7.getClass();
                                        if (str7.equals("USERNAME_INVALID")) {
                                            u0(p2Var2, null, LocaleController.getString(R.string.UsernameInvalid), null);
                                            return null;
                                        }
                                        if (str7.equals("USERNAME_OCCUPIED")) {
                                            u0(p2Var2, null, LocaleController.getString(R.string.UsernameInUse), null);
                                            return null;
                                        }
                                        u0(p2Var2, null, LocaleController.getString(R.string.ErrorOccurred), null);
                                        return null;
                                    }
                                    if (tLObject instanceof TLRPC.TL_contacts_importContacts) {
                                        if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                            u0(p2Var2, null, LocaleController.getString(R.string.FloodWait), null);
                                            return null;
                                        }
                                        StringBuilder sb5 = new StringBuilder();
                                        org.telegram.ui.b.i(R.string.ErrorOccurred, "\n", sb5);
                                        sb5.append(tL_error.text);
                                        u0(p2Var2, null, sb5.toString(), null);
                                        return null;
                                    }
                                    if ((tLObject instanceof TL_account.getPassword) || (tLObject instanceof TL_account.getTmpPassword)) {
                                        if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                                            w0(p2Var2, tL_error.text);
                                            return null;
                                        }
                                        int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                                        w0(p2Var2, LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                                        return null;
                                    }
                                    if (tLObject instanceof TLRPC.TL_payments_sendPaymentForm) {
                                        String str8 = tL_error.text;
                                        str8.getClass();
                                        if (str8.equals("BOT_PRECHECKOUT_FAILED")) {
                                            w0(p2Var2, LocaleController.getString(R.string.PaymentPrecheckoutFailed));
                                            return null;
                                        }
                                        if (str8.equals("PAYMENT_FAILED")) {
                                            w0(p2Var2, LocaleController.getString(R.string.PaymentFailed));
                                            return null;
                                        }
                                        w0(p2Var2, tL_error.text);
                                        return null;
                                    }
                                    if (tLObject instanceof TLRPC.TL_payments_validateRequestedInfo) {
                                        String str9 = tL_error.text;
                                        str9.getClass();
                                        if (str9.equals("SHIPPING_NOT_AVAILABLE")) {
                                            w0(p2Var2, LocaleController.getString(R.string.PaymentNoShippingMethod));
                                            return null;
                                        }
                                        w0(p2Var2, tL_error.text);
                                        return null;
                                    }
                                    if (tLObject instanceof TLRPC.TL_payments_assignPlayMarketTransaction) {
                                        StringBuilder sb6 = new StringBuilder();
                                        org.telegram.ui.b.i(R.string.PaymentConfirmationError, "\n", sb6);
                                        sb6.append(tL_error.text);
                                        u0(p2Var2, null, sb6.toString(), null);
                                        return null;
                                    }
                                }
                            }
                        }
                    } else {
                        if (p2Var2 != null && tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                            if (p2Var2.getParentActivity() != null) {
                                p2Var2.showDialog(new eg.v0(5, i10, p2Var2.getParentActivity(), p2Var2, null));
                                return null;
                            }
                            if (z11 || (tLObject instanceof TLRPC.TL_channels_inviteToChannel)) {
                                p2Var2.presentFragment(new ge1(0));
                                return null;
                            }
                            p2Var2.presentFragment(new ge1(1));
                            return null;
                        }
                        if (p2Var2 != null) {
                            h0(tL_error, p2Var2, objArr.length > 0 ? ((Boolean) objArr[0]).booleanValue() : false, objArr.length > 1 ? ((Boolean) objArr[1]).booleanValue() : false, tLObject);
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

    public static boolean g(TextView textView, TextView textView2, long j10, long j11, int i10, xc0 xc0Var, xc0 xc0Var2, xc0 xc0Var3) {
        long j12;
        int i11;
        long j13;
        int i12;
        int i13;
        int i14;
        boolean z4;
        boolean z10;
        String formatPluralString;
        int value = xc0Var.getValue();
        int value2 = xc0Var2.getValue();
        int value3 = xc0Var3.getValue();
        Calendar calendar = Calendar.getInstance();
        long currentTimeMillis = System.currentTimeMillis();
        calendar.setTimeInMillis(currentTimeMillis);
        int i15 = calendar.get(1);
        calendar.get(6);
        if (j11 > 0) {
            i11 = i15;
            calendar.setTimeInMillis((j11 * 1000) + currentTimeMillis);
            calendar.set(11, 23);
            calendar.set(12, 59);
            calendar.set(13, 59);
            calendar.set(14, 0);
            j12 = currentTimeMillis;
            i13 = (int) ChronoUnit.DAYS.between(Instant.ofEpochMilli(currentTimeMillis).atZone(ZoneId.systemDefault()).f(), Instant.ofEpochMilli(calendar.getTimeInMillis()).atZone(ZoneId.systemDefault()).f());
            j13 = calendar.getTimeInMillis();
            i12 = 23;
            i14 = 59;
        } else {
            j12 = currentTimeMillis;
            i11 = i15;
            j13 = j11;
            i12 = 0;
            i13 = 0;
            i14 = 0;
        }
        int i16 = i14;
        long millis = j10 > 0 ? TimeUnit.SECONDS.toMillis(j10) : 60000L;
        long j14 = j12 + millis;
        calendar.setTimeInMillis(j14);
        int i17 = calendar.get(11);
        int i18 = calendar.get(12);
        long j15 = j13;
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(6, value);
        calendar.set(11, value2);
        calendar.set(12, value3);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        xc0Var.setMinValue(0);
        if (j15 > 0) {
            xc0Var.setMaxValue(i13);
        }
        int value4 = xc0Var.getValue();
        xc0Var2.setMinValue(value4 == 0 ? i17 : 0);
        if (j15 > 0) {
            xc0Var2.setMaxValue(value4 == i13 ? i12 : 23);
        }
        int value5 = xc0Var2.getValue();
        xc0Var3.setMinValue((value4 == 0 && value5 == i17) ? i18 : 0);
        if (j15 > 0) {
            xc0Var3.setMaxValue((value4 == i13 && value5 == i12) ? i16 : 59);
        }
        int value6 = xc0Var3.getValue();
        if (timeInMillis <= j14) {
            calendar.setTimeInMillis(j14);
        } else if (j15 > 0 && timeInMillis > j15) {
            calendar.setTimeInMillis(j15);
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
            int i20 = (int) ((timeInMillis2 - j12) / 1000);
            if (i20 > 86400) {
                z10 = false;
                formatPluralString = LocaleController.formatPluralString("DaysSchedule", Math.round(i20 / 86400.0f), new Object[0]);
            } else {
                z10 = false;
                z10 = false;
                z10 = false;
                formatPluralString = i20 >= 3600 ? LocaleController.formatPluralString("HoursSchedule", Math.round(i20 / 3600.0f), new Object[0]) : i20 >= 60 ? LocaleController.formatPluralString("MinutesSchedule", Math.round(i20 / 60.0f), new Object[0]) : LocaleController.formatPluralString("SecondsSchedule", i20, new Object[0]);
            }
            if (textView2.getTag() != null) {
                int i21 = R.string.VoipChannelScheduleInfo;
                z4 = true;
                Object[] objArr = new Object[1];
                objArr[z10 ? 1 : 0] = formatPluralString;
                textView2.setText(LocaleController.formatString("VoipChannelScheduleInfo", i21, objArr));
            } else {
                z4 = true;
                int i22 = R.string.VoipGroupScheduleInfo;
                Object[] objArr2 = new Object[1];
                objArr2[z10 ? 1 : 0] = formatPluralString;
                textView2.setText(LocaleController.formatString("VoipGroupScheduleInfo", i22, objArr2));
            }
        } else {
            z4 = true;
            z10 = false;
        }
        return timeInMillis - j12 > millis ? z4 : z10;
    }

    public static void g0(Context context, org.telegram.ui.ActionBar.f6 f6Var, String str, TLRPC.WebPage webPage, final Utilities.Callback callback, pm pmVar) {
        Activity findActivity = AndroidUtilities.findActivity(context);
        final View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        final org.telegram.ui.ActionBar.d2[] d2VarArr = new org.telegram.ui.ActionBar.d2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        String string = LocaleController.getString(R.string.PollV2AddLinkTitle);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.O = string;
        d2Var.Q = LocaleController.getString(R.string.PollV2AddLinkMessage);
        final a4 a4Var = new a4(context);
        a4Var.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.j6.j5;
        a4Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        a4Var.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xh, f6Var));
        a4Var.setHint(LocaleController.getString(R.string.PollV2AddLinkUrlHint));
        a4Var.setInputType(17);
        a4Var.setImeOptions(6);
        a4Var.setMaxLines(10);
        a4Var.setSingleLine(false);
        a4Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f));
        a4Var.setCursorWidth(1.5f);
        a4Var.setCursorColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q6, f6Var));
        if (str != null) {
            a4Var.setText(str);
            a4Var.setSelection(str.length());
        }
        a4Var.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.Components.g2
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                if (i11 != 6) {
                    return false;
                }
                a4 a4Var2 = a4.this;
                String trim = a4Var2.getText().toString().trim();
                if (!(TextUtils.isEmpty(trim) ? false : z4.a.matcher(trim.trim()).matches())) {
                    AndroidUtilities.shakeView(a4Var2);
                    return true;
                }
                callback.run(trim);
                org.telegram.ui.ActionBar.d2 d2Var2 = d2VarArr[0];
                if (d2Var2 != null) {
                    d2Var2.dismiss();
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
        gradientDrawable.setColor(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var)));
        a4Var.setBackground(gradientDrawable);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(a4Var, k7.b6.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
        int i11 = t81.f;
        if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
            t81 t81Var = new t81(context, f6Var);
            t81Var.setWebPage(webPage);
            linearLayout.addView(t81Var, k7.b6.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
        }
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        d2Var.a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
        alertDialog$Builder.k(LocaleController.getString(R.string.Done), new o1(1, a4Var, callback));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.bs(26));
        if (pmVar != null) {
            alertDialog$Builder.i(LocaleController.getString(R.string.Delete), new z0(4, pmVar));
        }
        d2VarArr[0] = d2Var;
        d2Var.e0 = false;
        int i12 = 2;
        d2Var.setOnDismissListener(new b1(a4Var, i12));
        d2VarArr[0].setOnShowListener(new qt(i12, a4Var));
        d2VarArr[0].show();
        TextView textView = (TextView) d2VarArr[0].d(-3);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
        }
    }

    public static boolean h(Context context, int i10, long j10, boolean z4) {
        TLRPC.Chat chat;
        if (!DialogObject.isChatDialog(j10) || (chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10))) == null || !chat.slowmode_enabled || ChatObject.hasAdminRights(chat)) {
            return false;
        }
        if (!z4) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(chat.id);
            if (chatFull == null) {
                chatFull = MessagesStorage.getInstance(i10).loadChatInfo(chat.id, ChatObject.isChannel(chat), new CountDownLatch(1), false, false);
            }
            if (chatFull != null && chatFull.slowmode_next_send_date >= ConnectionsManager.getInstance(i10).getCurrentTime()) {
                z4 = true;
            }
        }
        if (!z4) {
            return false;
        }
        N(context, chat.title, LocaleController.getString(R.string.SlowmodeSendError)).o();
        return true;
    }

    public static void h0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.p2 p2Var, boolean z4, boolean z10, TLObject tLObject) {
        AlertDialog$Builder alertDialog$Builder;
        org.telegram.ui.ActionBar.d2 d2Var;
        int i10;
        if (tL_error == null || tL_error.code == 406 || tL_error.text == null || p2Var == null || p2Var.getParentActivity() == null) {
            return;
        }
        alertDialog$Builder = new AlertDialog$Builder(p2Var.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        d2Var = alertDialog$Builder.a;
        d2Var.O = string;
        String str = tL_error.text;
        str.getClass();
        i10 = 0;
        switch (str) {
            case "CHANNELS_ADMIN_LOCATED_TOO_MUCH":
                d2Var.Q = LocaleController.getString(R.string.LocatedChannelsTooMuch);
                break;
            case "CHANNELS_ADMIN_PUBLIC_TOO_MUCH":
                d2Var.Q = LocaleController.getString(R.string.PublicChannelsTooMuch);
                break;
            case "USERS_TOO_FEW":
                d2Var.Q = LocaleController.getString(R.string.CreateGroupError);
                break;
            case "USER_BLOCKED":
            case "USER_BOT":
            case "USER_ID_INVALID":
                if (!z4) {
                    d2Var.Q = LocaleController.getString(R.string.GroupUserCantAdd);
                    break;
                } else {
                    d2Var.Q = LocaleController.getString(R.string.ChannelUserCantAdd);
                    break;
                }
            case "USER_RESTRICTED":
                d2Var.Q = LocaleController.getString(R.string.UserRestricted);
                break;
            case "PEER_FLOOD":
                d2Var.Q = LocaleController.getString(R.string.NobodyLikesSpam2);
                alertDialog$Builder.h(LocaleController.getString(R.string.MoreInfo), new p2(i10, p2Var));
                break;
            case "BOTS_TOO_MUCH":
                if (!z4) {
                    d2Var.Q = LocaleController.getString(R.string.GroupUserCantBot);
                    break;
                } else {
                    d2Var.Q = LocaleController.getString(R.string.ChannelUserCantBot);
                    break;
                }
            case "USER_KICKED":
            case "CHAT_ADMIN_BAN_REQUIRED":
                if (!(tLObject instanceof TLRPC.TL_channels_inviteToChannel)) {
                    d2Var.Q = LocaleController.getString(R.string.AddAdminErrorBlacklisted);
                    break;
                } else {
                    d2Var.Q = LocaleController.getString(R.string.AddUserErrorBlacklisted);
                    break;
                }
            case "YOU_BLOCKED_USER":
                d2Var.Q = LocaleController.getString(R.string.YouBlockedUser);
                break;
            case "USER_ADMIN_INVALID":
                d2Var.Q = LocaleController.getString(R.string.AddBannedErrorAdmin);
                break;
            case "USERS_TOO_MUCH":
                if (!z4) {
                    d2Var.Q = LocaleController.getString(R.string.GroupUserAddLimit);
                    break;
                } else {
                    d2Var.Q = LocaleController.getString(R.string.ChannelUserAddLimit);
                    break;
                }
            case "ADMINS_TOO_MUCH":
                if (!z4) {
                    d2Var.Q = LocaleController.getString(R.string.GroupUserCantAdmin);
                    break;
                } else {
                    d2Var.Q = LocaleController.getString(R.string.ChannelUserCantAdmin);
                    break;
                }
            case "CHANNELS_TOO_MUCH":
                d2Var.O = LocaleController.getString(R.string.ChannelTooMuchTitle);
                if (!(tLObject instanceof TLRPC.TL_channels_createChannel)) {
                    d2Var.Q = LocaleController.getString(R.string.ChannelTooMuchJoin);
                    break;
                } else {
                    d2Var.Q = LocaleController.getString(R.string.ChannelTooMuch);
                    break;
                }
            case "USER_CHANNELS_TOO_MUCH":
                d2Var.O = LocaleController.getString(R.string.ChannelTooMuchTitle);
                d2Var.Q = LocaleController.getString(R.string.UserChannelTooMuchJoin);
                break;
            case "USER_NOT_MUTUAL_CONTACT":
                if (!z4) {
                    d2Var.Q = LocaleController.getString(R.string.GroupUserLeftError);
                    break;
                } else {
                    d2Var.Q = LocaleController.getString(R.string.ChannelUserLeftError);
                    break;
                }
            case "CHAT_ADMIN_INVITE_REQUIRED":
                d2Var.Q = LocaleController.getString(R.string.AddAdminErrorNotAMember);
                break;
            case "USER_PRIVACY_RESTRICTED":
                if (!z10) {
                    if (!z4) {
                        d2Var.Q = LocaleController.getString(R.string.InviteToGroupError);
                        break;
                    } else {
                        d2Var.Q = LocaleController.getString(R.string.InviteToChannelError);
                        break;
                    }
                } else {
                    d2Var.Q = LocaleController.getString(R.string.InviteToCommunityError);
                    break;
                }
            case "USER_ALREADY_PARTICIPANT":
                d2Var.O = LocaleController.getString(R.string.VoipGroupVoiceChat);
                d2Var.Q = LocaleController.getString(R.string.VoipGroupInviteAlreadyParticipant);
                break;
            default:
                StringBuilder sb = new StringBuilder();
                org.telegram.ui.b.i(R.string.ErrorOccurred, "\n", sb);
                sb.append(tL_error.text);
                d2Var.Q = sb.toString();
                break;
        }
        kf.k0.C(R.string.OK, alertDialog$Builder, null);
    }

    public static org.telegram.ui.ActionBar.d2 i(Activity activity, w4 w4Var) {
        if (UserConfig.getActivatedAccountsCount() < 2) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a.I0;
        org.telegram.ui.ActionBar.d2[] d2VarArr = new org.telegram.ui.ActionBar.d2[1];
        LinearLayout h = kf.k0.h(activity, 1);
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).getCurrentUser() != null) {
                org.telegram.ui.Cells.k kVar = new org.telegram.ui.Cells.k(activity, false);
                kVar.f = i10;
                TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
                z8 z8Var = kVar.e;
                z8Var.m(i10, currentUser);
                kVar.a.l(ContactsController.formatName(currentUser.first_name, currentUser.last_name), false);
                p9 p9Var = kVar.c;
                p9Var.getImageReceiver().setCurrentAccount(i10);
                p9Var.e(currentUser, z8Var);
                kVar.d.setVisibility(4);
                kVar.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                kVar.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                h.addView(kVar, k7.b6.n(-1, 50));
                kVar.setOnClickListener(new dg.p(d2VarArr, s1Var, w4Var, 16));
            }
        }
        alertDialog$Builder.a.O = LocaleController.getString(R.string.SelectAccount);
        alertDialog$Builder.n(h);
        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2VarArr[0] = d2Var;
        return d2Var;
    }

    public static org.telegram.ui.ActionBar.d2 i0(Activity activity, String str, CharSequence charSequence, CharSequence charSequence2, String str2, Utilities.Callback callback, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        if (activity == null) {
            callback.run(Boolean.FALSE);
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, f6Var);
        org.telegram.ui.Cells.y1[] y1VarArr = new org.telegram.ui.Cells.y1[1];
        boolean[] zArr = new boolean[1];
        u4 u4Var = new u4(activity);
        NotificationCenter.listenEmojiLoading(u4Var);
        u4Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j5, f6Var));
        u4Var.setTextSize(1, 16.0f);
        u4Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        u4Var.setText(charSequence);
        v4 v4Var = new v4(activity, y1VarArr);
        alertDialog$Builder.a.D = 6;
        alertDialog$Builder.n(v4Var);
        TextView textView = new TextView(activity);
        org.telegram.ui.b.w(org.telegram.ui.ActionBar.j6.E8, f6Var, textView, 1, 20.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(str);
        v4Var.addView(textView, k7.b6.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 8.0f, 24.0f, 0.0f));
        v4Var.addView(u4Var, k7.b6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 48.0f, 24.0f, 6.0f));
        if (!TextUtils.isEmpty(charSequence2)) {
            org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(activity, 1, f6Var);
            y1VarArr[0] = y1Var;
            y1Var.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var), 7, AndroidUtilities.dp(12.0f)));
            y1VarArr[0].setMultiline(true);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) y1VarArr[0].getCheckBoxView().getLayoutParams();
            layoutParams.topMargin = 0;
            layoutParams.gravity = (LocaleController.isRTL ? 5 : 3) | 16;
            y1VarArr[0].getCheckBoxView().setLayoutParams(layoutParams);
            y1VarArr[0].e(charSequence2, "", false, false, false);
            y1VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(4.0f) : 0, AndroidUtilities.dp(12.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f));
            v4Var.addView(y1VarArr[0], k7.b6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 0.0f));
            y1VarArr[0].setOnClickListener(new t0(5, zArr));
        }
        alertDialog$Builder.k(str2, new o1(7, callback, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        if (z4) {
            d2Var.U0 = true;
        }
        d2Var.show();
        return d2Var;
    }

    public static org.telegram.ui.ActionBar.d2 j(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        alertDialog$Builder.a.Q = LocaleController.getString(R.string.ApkRestricted);
        alertDialog$Builder.m(R.raw.permission_request_apk, 72, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new k0(context, 0));
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
    public static void j0(org.telegram.ui.ActionBar.p2 p2Var, long j10, final TLRPC.User user, final TLRPC.Chat chat, final TLRPC.EncryptedChat encryptedChat, final boolean z4, TLRPC.ChatFull chatFull, final MessagesStorage.IntCallback intCallback, org.telegram.ui.ActionBar.f6 f6Var) {
        long j11;
        boolean z10;
        String string;
        final org.telegram.ui.Cells.y1[] y1VarArr;
        TextView textView;
        if (p2Var.getParentActivity() == null) {
            return;
        }
        final AccountInstance accountInstance = p2Var.getAccountInstance();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getParentActivity(), 0, f6Var);
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(p2Var.getCurrentAccount());
        int i10 = 1;
        if (encryptedChat == null) {
            j11 = j10;
            if (!org.telegram.messenger.y3.v("dialog_bar_report", j11, notificationsSettings, false)) {
                z10 = false;
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                if (user == null) {
                    d2Var.O = LocaleController.formatString("BlockUserTitle", R.string.BlockUserTitle, UserObject.getFirstName(user));
                    d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserAlert", R.string.BlockUserAlert, UserObject.getFirstName(user)));
                    string = LocaleController.getString(R.string.BlockContact);
                    org.telegram.ui.Cells.y1[] y1VarArr2 = new org.telegram.ui.Cells.y1[2];
                    LinearLayout linearLayout = new LinearLayout(p2Var.getParentActivity());
                    linearLayout.setOrientation(1);
                    int i11 = 0;
                    for (int i12 = 2; i11 < i12; i12 = 2) {
                        if (i11 != 0 || z10) {
                            org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(p2Var.getParentActivity(), i10, f6Var);
                            y1VarArr2[i11] = y1Var;
                            y1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                            y1VarArr2[i11].setTag(Integer.valueOf(i11));
                            if (i11 == 0) {
                                y1VarArr2[i11].e(LocaleController.getString(R.string.DeleteReportSpam), "", true, false, false);
                            } else {
                                y1VarArr2[i11].e(LocaleController.formatString("DeleteThisChat", R.string.DeleteThisChat, new Object[0]), "", true, false, false);
                            }
                            y1VarArr2[i11].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                            linearLayout.addView(y1VarArr2[i11], k7.b6.n(-1, -2));
                            y1VarArr2[i11].setOnClickListener(new c1(y1VarArr2, 1));
                        }
                        i11++;
                        i10 = 1;
                    }
                    alertDialog$Builder.n(linearLayout);
                    y1VarArr = y1VarArr2;
                } else {
                    if (chat == null || !z4) {
                        d2Var.O = LocaleController.getString(R.string.ReportSpamTitle);
                        if (!ChatObject.isChannel(chat) || chat.megagroup) {
                            d2Var.Q = LocaleController.getString(R.string.ReportSpamAlertGroup);
                        } else {
                            d2Var.Q = LocaleController.getString(R.string.ReportSpamAlertChannel);
                        }
                    } else {
                        d2Var.O = LocaleController.getString(R.string.ReportUnrelatedGroup);
                        if (chatFull != null) {
                            TLRPC.ChannelLocation channelLocation = chatFull.location;
                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("ReportUnrelatedGroupText", R.string.ReportUnrelatedGroupText, ((TLRPC.TL_channelLocation) channelLocation).address));
                            }
                        }
                        d2Var.Q = LocaleController.getString(R.string.ReportUnrelatedGroupTextNoAddress);
                    }
                    string = LocaleController.getString(R.string.ReportChat);
                    y1VarArr = null;
                }
                final long j12 = j11;
                alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.Components.c3
                    @Override // org.telegram.ui.ActionBar.c2
                    public final void l(org.telegram.ui.ActionBar.d2 d2Var2, int i13) {
                        org.telegram.ui.Cells.y1 y1Var2;
                        TLRPC.User user2 = TLRPC.User.this;
                        AccountInstance accountInstance2 = accountInstance;
                        if (user2 != null) {
                            accountInstance2.getMessagesController().blockPeer(user2.id);
                        }
                        org.telegram.ui.Cells.y1[] y1VarArr3 = y1VarArr;
                        long j13 = j12;
                        TLRPC.Chat chat2 = chat;
                        if (y1VarArr3 == null || ((y1Var2 = y1VarArr3[0]) != null && y1Var2.b())) {
                            accountInstance2.getMessagesController().reportSpam(j13, user2, chat2, encryptedChat, chat2 != null && z4);
                        }
                        MessagesStorage.IntCallback intCallback2 = intCallback;
                        if (y1VarArr3 != null && !y1VarArr3[1].b()) {
                            intCallback2.run(0);
                            return;
                        }
                        if (chat2 == null) {
                            accountInstance2.getMessagesController().deleteDialog(j13, 0);
                        } else if (ChatObject.isNotInChat(chat2)) {
                            accountInstance2.getMessagesController().deleteDialog(j13, 0);
                        } else {
                            accountInstance2.getMessagesController().deleteParticipantFromChat(-j13, accountInstance2.getMessagesController().getUser(Long.valueOf(accountInstance2.getUserConfig().getClientUserId())));
                        }
                        intCallback2.run(1);
                    }
                });
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                p2Var.showDialog(d2Var);
                textView = (TextView) d2Var.d(-1);
                if (textView == null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                    return;
                }
                return;
            }
        } else {
            j11 = j10;
        }
        z10 = true;
        org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder.a;
        if (user == null) {
        }
        final long j122 = j11;
        alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.Components.c3
            @Override // org.telegram.ui.ActionBar.c2
            public final void l(org.telegram.ui.ActionBar.d2 d2Var22, int i13) {
                org.telegram.ui.Cells.y1 y1Var2;
                TLRPC.User user2 = TLRPC.User.this;
                AccountInstance accountInstance2 = accountInstance;
                if (user2 != null) {
                    accountInstance2.getMessagesController().blockPeer(user2.id);
                }
                org.telegram.ui.Cells.y1[] y1VarArr3 = y1VarArr;
                long j13 = j122;
                TLRPC.Chat chat2 = chat;
                if (y1VarArr3 == null || ((y1Var2 = y1VarArr3[0]) != null && y1Var2.b())) {
                    accountInstance2.getMessagesController().reportSpam(j13, user2, chat2, encryptedChat, chat2 != null && z4);
                }
                MessagesStorage.IntCallback intCallback2 = intCallback;
                if (y1VarArr3 != null && !y1VarArr3[1].b()) {
                    intCallback2.run(0);
                    return;
                }
                if (chat2 == null) {
                    accountInstance2.getMessagesController().deleteDialog(j13, 0);
                } else if (ChatObject.isNotInChat(chat2)) {
                    accountInstance2.getMessagesController().deleteDialog(j13, 0);
                } else {
                    accountInstance2.getMessagesController().deleteParticipantFromChat(-j13, accountInstance2.getMessagesController().getUser(Long.valueOf(accountInstance2.getUserConfig().getClientUserId())));
                }
                intCallback2.run(1);
            }
        });
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        p2Var.showDialog(d2Var2);
        textView = (TextView) d2Var2.d(-1);
        if (textView == null) {
        }
    }

    public static void k(Context context, org.telegram.ui.ActionBar.f6 f6Var, y4 y4Var) {
        if (context == null) {
            return;
        }
        boolean z4 = false;
        int i10 = org.telegram.ui.ActionBar.j6.j5;
        int d02 = f6Var != null ? f6Var.d0(i10) : org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.j6.h5;
        int d03 = f6Var != null ? f6Var.d0(i11) : org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.j6.Ji;
        if (f6Var != null) {
            f6Var.d0(i12);
        } else {
            org.telegram.ui.ActionBar.j6.w0(null, i12, false);
        }
        int i13 = org.telegram.ui.ActionBar.j6.Ni;
        if (f6Var != null) {
            f6Var.d0(i13);
        } else {
            org.telegram.ui.ActionBar.j6.w0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.j6.E8;
        if (f6Var != null) {
            f6Var.d0(i14);
        } else {
            org.telegram.ui.ActionBar.j6.w0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.j6.G8;
        if (f6Var != null) {
            f6Var.d0(i15);
        } else {
            org.telegram.ui.ActionBar.j6.w0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.j6.i6;
        if (f6Var != null) {
            f6Var.d0(i16);
        } else {
            org.telegram.ui.ActionBar.j6.w0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.j6.Sh;
        int d04 = f6Var != null ? f6Var.d0(i17) : org.telegram.ui.ActionBar.j6.w0(null, i17, false);
        int i18 = org.telegram.ui.ActionBar.j6.Oh;
        int d05 = f6Var != null ? f6Var.d0(i18) : org.telegram.ui.ActionBar.j6.w0(null, i18, false);
        int d06 = f6Var != null ? f6Var.d0(org.telegram.ui.ActionBar.j6.Qh) : org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
        org.telegram.ui.ActionBar.b3 b3Var = new org.telegram.ui.ActionBar.b3(context, f6Var);
        b3Var.a();
        int[] iArr = {0, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        d4 d4Var = new d4(context, f6Var, iArr);
        d4Var.setMinValue(0);
        d4Var.setMaxValue(16);
        d4Var.setTextColor(d02);
        d4Var.setValue(0);
        d4Var.setFormatter(new f1(1, iArr));
        e4 e4Var = new e4(context, d4Var, 0);
        e4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        e4Var.addView(frameLayout, k7.b6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.AutoDeleteAfteTitle));
        textView.setTextColor(d02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, k7.b6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new oh.d(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        e4Var.addView(linearLayout, k7.b6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        org.telegram.ui.Cells.s3 s3Var = new org.telegram.ui.Cells.s3(context, 1 == true ? 1 : 0, 1 == true ? 1 : 0, z4, 1);
        linearLayout.addView(d4Var, k7.b6.l(1.0f, 0, 270));
        s3Var.setPadding(0, 0, 0, 0);
        s3Var.setGravity(17);
        s3Var.setTextColor(d04);
        s3Var.setTextSize(AndroidUtilities.dp(14.0f));
        s3Var.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(8.0f);
        s3Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, d05, d06, d06));
        e4Var.addView(s3Var, k7.b6.t(-1, 48, 83, 16, 15, 16, 16));
        s3Var.setText(LocaleController.getString(R.string.DisableAutoDeleteTimer));
        d4Var.setOnValueChangedListener(new t(s3Var, 10));
        s3Var.setOnClickListener(new kh.t3(iArr, d4Var, y4Var, b3Var, 6));
        b3Var.b(e4Var);
        org.telegram.ui.ActionBar.g3 g3Var = b3Var.a;
        g3Var.show();
        g3Var.setBackgroundColor(d03);
        g3Var.fixNavigationBar(d03);
    }

    public static void k0(org.telegram.ui.zn znVar, MessageObject messageObject, long j10, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.pg pgVar) {
        if (znVar.getParentActivity() == null || messageObject == null) {
            return;
        }
        AccountInstance accountInstance = znVar.getAccountInstance();
        TLRPC.User user = j10 > 0 ? accountInstance.getMessagesController().getUser(Long.valueOf(j10)) : null;
        TLRPC.Chat chat = j10 < 0 ? accountInstance.getMessagesController().getChat(Long.valueOf(-j10)) : null;
        if (user == null && chat == null) {
            return;
        }
        int i10 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar.getParentActivity(), 0, f6Var);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.M0 = false;
        d2Var.K = new b1(pgVar, i10);
        d2Var.O = LocaleController.getString(R.string.BlockUser);
        if (user != null) {
            d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserReplyAlert", R.string.BlockUserReplyAlert, UserObject.getFirstName(user)));
        } else {
            d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserReplyAlert", R.string.BlockUserReplyAlert, chat.title));
        }
        LinearLayout linearLayout = new LinearLayout(znVar.getParentActivity());
        linearLayout.setOrientation(1);
        org.telegram.ui.Cells.y1[] y1VarArr = {new org.telegram.ui.Cells.y1(znVar.getParentActivity(), 1, f6Var)};
        y1VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
        y1VarArr[0].setTag(0);
        y1VarArr[0].e(LocaleController.getString(R.string.DeleteReportSpam), "", true, false, false);
        y1VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
        linearLayout.addView(y1VarArr[0], k7.b6.n(-1, -2));
        y1VarArr[0].setOnClickListener(new c1(y1VarArr, i10));
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.k(LocaleController.getString(R.string.BlockAndDeleteReplies), new gg.d0(user, accountInstance, znVar, chat, messageObject, y1VarArr, f6Var));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        znVar.showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
        }
    }

    public static AlertDialog$Builder l(Activity activity, TLRPC.User user, Runnable runnable, org.telegram.ui.ActionBar.f6 f6Var) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, f6Var);
        String readRes = AndroidUtilities.readRes(org.telegram.ui.ActionBar.j6.A0().q() ? R.raw.permission_map_dark : R.raw.permission_map);
        String readRes2 = AndroidUtilities.readRes(org.telegram.ui.ActionBar.j6.A0().q() ? R.raw.permission_pin_dark : R.raw.permission_pin);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new m4());
        View view = new View(activity);
        view.setBackground(SvgHelper.getDrawable(readRes));
        frameLayout.addView(view, k7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view2 = new View(activity);
        view2.setBackground(SvgHelper.getDrawable(readRes2));
        frameLayout.addView(view2, k7.b6.d(60, 82.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
        p9 p9Var = new p9(activity);
        p9Var.setRoundRadius(AndroidUtilities.dp(26.0f));
        p9Var.e(user, new z8(0, user));
        frameLayout.addView(p9Var, k7.b6.d(52, 52.0f, 17, 0.0f, 0.0f, 0.0f, 11.0f));
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.S = frameLayout;
        d2Var.L0 = 0.37820512f;
        alertDialog$Builder.a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionBackgroundLocation));
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new i1(activity, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new z0(1, runnable));
        return alertDialog$Builder;
    }

    public static void l0(Context context, int i10, long j10) {
        org.telegram.ui.ActionBar.g3 o10 = org.telegram.messenger.y3.o(context, null, false, false);
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        f10.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        f10.addView(frameLayout, k7.b6.t(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.story_link);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, k7.b6.e(-1, -1, 17));
        frameLayout2.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false)));
        frameLayout.addView(frameLayout2, k7.b6.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.messenger.y3.t(textView, org.telegram.ui.ActionBar.j6.w0(null, i11, false), 1, 20.0f);
        org.telegram.messenger.y3.r(R.string.CallForbiddenInviteLinkTitle, textView, 17);
        TextView i12 = org.telegram.ui.ai.i(f10, textView, k7.b6.k(32.0f, 16.0f, 32.0f, 8.0f, -1, -2), context);
        i12.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        i12.setTextSize(1, 14.0f);
        i12.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CallForbiddenInviteLinkText, DialogObject.getName(i10, j10))));
        i12.setGravity(17);
        f10.addView(i12, k7.b6.k(32.0f, 0.0f, 32.0f, 18.0f, -1, -2));
        ph.d dVar = new ph.d(context, null, true);
        dVar.g(LocaleController.getString(R.string.CallForbiddenInviteLinkButton), false, true);
        f10.addView(dVar, k7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
        o10.customView = f10;
        dVar.setOnClickListener(new org.telegram.ui.td(i10, dVar, o10, j10));
        o10.fixNavigationBar();
        o10.show();
    }

    public static org.telegram.ui.ActionBar.b3 m(Context context, String str, String str2, TL_account.TL_birthday tL_birthday, Utilities.Callback callback, Runnable runnable, boolean z4, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        float f10;
        if (context == null) {
            return null;
        }
        org.telegram.ui.ActionBar.b3 b3Var = new org.telegram.ui.ActionBar.b3(context, f6Var);
        b3Var.a();
        xc0 xc0Var = new xc0(context, f6Var);
        xc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        xc0Var.setItemCount(5);
        xc0 xc0Var2 = new xc0(context, f6Var);
        xc0Var2.setItemCount(5);
        xc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        xc0 xc0Var3 = new xc0(context, f6Var);
        xc0Var3.setItemCount(5);
        xc0Var3.setTextOffset(-AndroidUtilities.dp(24.0f));
        w3 w3Var = new w3(context, xc0Var, xc0Var2, xc0Var3);
        w3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        w3Var.addView(frameLayout, k7.b6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        org.telegram.ui.b.w(org.telegram.ui.ActionBar.j6.j5, f6Var, textView, 1, 20.0f);
        frameLayout.addView(textView, k7.b6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new oh.d(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        w3Var.addView(linearLayout, k7.b6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        int i10 = calendar.get(1) - 149;
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i11 = calendar.get(5);
        int i12 = calendar.get(2);
        int i13 = calendar.get(1);
        int i14 = i13 + 1;
        u2 u2Var = new u2(xc0Var3, i14, xc0Var, xc0Var2, i13, i12, i11);
        System.currentTimeMillis();
        x3 x3Var = new x3(context);
        linearLayout.addView(xc0Var, k7.b6.l(0.25f, 0, 270));
        xc0Var.setMinValue(1);
        xc0Var.setMaxValue(31);
        xc0Var.setWrapSelectorWheel(false);
        xc0Var.setFormatter(new k2(7));
        t tVar = new t(u2Var, 9);
        xc0Var.setOnScrollListener(tVar);
        xc0Var2.setMinValue(0);
        xc0Var2.setMaxValue(11);
        xc0Var2.setWrapSelectorWheel(false);
        linearLayout.addView(xc0Var2, k7.b6.l(0.5f, 0, 270));
        xc0Var2.setFormatter(new k2(8));
        xc0Var2.setOnScrollListener(tVar);
        xc0Var3.setMinValue(i10);
        xc0Var3.setMaxValue(i14);
        xc0Var3.setWrapSelectorWheel(false);
        xc0Var3.setFormatter(new d4.b(i14, 5));
        linearLayout.addView(xc0Var3, k7.b6.l(0.25f, 0, 270));
        xc0Var3.setOnScrollListener(tVar);
        if (tL_birthday != null) {
            xc0Var.setValue(tL_birthday.day);
            xc0Var2.setValue(tL_birthday.month - 1);
            if ((tL_birthday.flags & 1) != 0) {
                xc0Var3.setValue(tL_birthday.year);
            } else {
                xc0Var3.setValue(i14);
            }
        } else {
            xc0Var.setValue(calendar.get(5));
            xc0Var2.setValue(calendar.get(2));
            xc0Var3.setValue(i14);
        }
        u2Var.run();
        if (runnable != null) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            f90 f90Var = new f90(context, null);
            f90Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            f90Var.setTextSize(1, 13.0f);
            f90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q5, f6Var));
            f90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
            f90Var.setGravity(17);
            frameLayout2.addView(f90Var, k7.b6.e(-2, -2, 17));
            w3Var.addView(frameLayout2, k7.b6.n(-1, -2));
            int i15 = UserConfig.selectedAccount;
            ah.b bVar = new ah.b(i15, f90Var, 25);
            bVar.run();
            f10 = 8.0f;
            NotificationCenter.getInstance(i15).listen(frameLayout2, NotificationCenter.privacyRulesUpdated, new v2(bVar, 0));
            ContactsController.getInstance(i15).loadPrivacySettings();
        } else {
            f10 = 8.0f;
        }
        if (z4) {
            ph.d dVar = new ph.d(context, f6Var, false);
            dVar.g(LocaleController.getString(R.string.DateOfBirthHideYear), false, true);
            dVar.setOnClickListener(new dg.m2(xc0Var3, i14, u2Var, 9));
            w3Var.addView(dVar, k7.b6.t(-1, 48, 83, 16, 15, 16, 4));
        }
        x3Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        x3Var.setGravity(17);
        x3Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sh, f6Var));
        x3Var.setTextSize(1, 14.0f);
        x3Var.setTypeface(AndroidUtilities.bold());
        x3Var.setText(str2);
        int dp = AndroidUtilities.dp(f10);
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var);
        int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Qh, f6Var);
        x3Var.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, v02, v03, v03));
        k7.d6.a(x3Var);
        w3Var.addView(x3Var, k7.b6.t(-1, 48, 83, 16, z4 ? 0 : 15, 16, z10 ? 0 : 16));
        x3Var.setOnClickListener(new lh.s8(xc0Var, xc0Var2, xc0Var3, i14, b3Var, callback));
        if (z10) {
            ph.d dVar2 = new ph.d(context, f6Var, false);
            dVar2.g(LocaleController.getString(R.string.BirthdayRemove), false, true);
            dVar2.setOnClickListener(new org.telegram.messenger.video.g(29, b3Var, callback));
            w3Var.addView(dVar2, k7.b6.t(-1, 48, 83, 16, 4, 16, 16));
        }
        b3Var.b(w3Var);
        return b3Var;
    }

    public static void m0(org.telegram.ui.ActionBar.p2 p2Var, String str) {
        if (str == null || !str.startsWith("FLOOD_WAIT") || p2Var == null || p2Var.getParentActivity() == null) {
            return;
        }
        int intValue = Utilities.parseInt((CharSequence) str).intValue();
        String formatPluralString = intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.O = string;
        d2Var.Q = LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        p2Var.showDialog(d2Var, true, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void n(org.telegram.ui.ActionBar.p2 p2Var, AtomicBoolean atomicBoolean, TLRPC.User user, Runnable runnable) {
        org.telegram.ui.Cells.y1[] y1VarArr;
        org.telegram.ui.ActionBar.d2 d2Var;
        p9 p9Var;
        boolean[] zArr;
        org.telegram.ui.Cells.y1 y1Var;
        if (p2Var == null) {
            return;
        }
        Context context = p2Var.getContext();
        org.telegram.ui.Cells.y1[] y1VarArr2 = new org.telegram.ui.Cells.y1[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        s4 s4Var = new s4(context, null);
        NotificationCenter.listenEmojiLoading(s4Var);
        s4Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
        s4Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gc, false));
        s4Var.setTextSize(1, 16.0f);
        s4Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        t4 t4Var = new t4(context, y1VarArr2);
        org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder.a;
        d2Var2.D = 6;
        alertDialog$Builder.n(t4Var);
        z8 z8Var = new z8((org.telegram.ui.ActionBar.f6) null);
        z8Var.u(AndroidUtilities.dp(18.0f));
        p9 p9Var2 = new p9(context);
        p9Var2.setRoundRadius(AndroidUtilities.dp(20.0f));
        t4Var.addView(p9Var2, k7.b6.d(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        k5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
        k5Var.setTextSize(20);
        k5Var.setTypeface(AndroidUtilities.bold());
        k5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        k5Var.setEllipsizeByGradient(true);
        k5Var.l(user.first_name, false);
        if (user.scam) {
            k5Var.i(org.telegram.ui.ActionBar.j6.g1);
        } else if (user.fake) {
            k5Var.i(org.telegram.ui.ActionBar.j6.h1);
        } else if (user.verified) {
            Drawable mutate = context.getResources().getDrawable(R.drawable.verified_area).mutate();
            y1VarArr = y1VarArr2;
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.z9, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(w02, mode));
            Drawable mutate2 = context.getResources().getDrawable(R.drawable.verified_check).mutate();
            d2Var = d2Var2;
            p9Var = p9Var2;
            zArr = null;
            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A9, false), mode));
            k5Var.i(new mq(mutate, mutate2));
            TextView textView = new TextView(context);
            int w03 = org.telegram.ui.ActionBar.j6.w0(zArr, org.telegram.ui.ActionBar.j6.m5, false);
            int i10 = 1;
            org.telegram.ui.b.q(textView, w03, 1, 14.0f, 1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setGravity((!LocaleController.isRTL ? 5 : 3) | 16);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setOnClickListener(new u0(user, p2Var, alertDialog$Builder, i10));
            SpannableString valueOf = SpannableString.valueOf(LocaleController.getString(R.string.MoreAboutThisBot) + "  ");
            lq lqVar = new lq(R.drawable.attach_arrow_right, 0);
            lqVar.setTopOffset(1);
            lqVar.setSize(AndroidUtilities.dp(10.0f));
            valueOf.setSpan(lqVar, valueOf.length() - 1, valueOf.length(), 33);
            textView.setText(valueOf);
            boolean z4 = LocaleController.isRTL;
            t4Var.addView(k5Var, k7.b6.d(-1, -2.0f, (!z4 ? 5 : 3) | 48, !z4 ? 21 : 76, 0.0f, !z4 ? 76 : 21, 0.0f));
            boolean z10 = LocaleController.isRTL;
            t4Var.addView(textView, k7.b6.d(-1, -2.0f, (!z10 ? 5 : 3) | 48, !z10 ? 21 : 76, 24.0f, z10 ? 76 : 21, 0.0f));
            t4Var.addView(s4Var, k7.b6.d(-2, -2.0f, (!LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
            atomicBoolean.set(true);
            y1Var = new org.telegram.ui.Cells.y1(context, 1, p2Var.getResourceProvider());
            y1VarArr[0] = y1Var;
            if (!y1Var.E) {
                org.telegram.ui.Cells.w1 w1Var = y1Var.c;
                w1Var.setLines(3);
                w1Var.setMaxLines(3);
                w1Var.setSingleLine(false);
            }
            y1VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
            y1VarArr[0].e(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.OpenUrlOption2, UserObject.getUserName(user))), "", true, false, false);
            y1VarArr[0].setPadding(!LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, !LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
            y1VarArr[0].c(true, false);
            t4Var.addView(y1VarArr[0], k7.b6.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
            y1VarArr[0].setOnClickListener(new g0(atomicBoolean, 2));
            if (UserObject.isReplyUser(user)) {
                z8Var.p = 1.0f;
                z8Var.m(p2Var.getCurrentAccount(), user);
                p9Var.e(user, z8Var);
            } else {
                z8Var.p = 0.8f;
                z8Var.g(12);
                p9Var.h(null, null, z8Var, user);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.Start), new z0(3, runnable));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
            p2Var.showDialog(d2Var3);
            s4Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebViewStartPermission2), new j1(1, context, d2Var3)));
        }
        y1VarArr = y1VarArr2;
        p9Var = p9Var2;
        d2Var = d2Var2;
        zArr = null;
        TextView textView2 = new TextView(context);
        int w032 = org.telegram.ui.ActionBar.j6.w0(zArr, org.telegram.ui.ActionBar.j6.m5, false);
        int i102 = 1;
        org.telegram.ui.b.q(textView2, w032, 1, 14.0f, 1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity((!LocaleController.isRTL ? 5 : 3) | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setOnClickListener(new u0(user, p2Var, alertDialog$Builder, i102));
        SpannableString valueOf2 = SpannableString.valueOf(LocaleController.getString(R.string.MoreAboutThisBot) + "  ");
        lq lqVar2 = new lq(R.drawable.attach_arrow_right, 0);
        lqVar2.setTopOffset(1);
        lqVar2.setSize(AndroidUtilities.dp(10.0f));
        valueOf2.setSpan(lqVar2, valueOf2.length() - 1, valueOf2.length(), 33);
        textView2.setText(valueOf2);
        boolean z42 = LocaleController.isRTL;
        t4Var.addView(k5Var, k7.b6.d(-1, -2.0f, (!z42 ? 5 : 3) | 48, !z42 ? 21 : 76, 0.0f, !z42 ? 76 : 21, 0.0f));
        boolean z102 = LocaleController.isRTL;
        t4Var.addView(textView2, k7.b6.d(-1, -2.0f, (!z102 ? 5 : 3) | 48, !z102 ? 21 : 76, 24.0f, z102 ? 76 : 21, 0.0f));
        t4Var.addView(s4Var, k7.b6.d(-2, -2.0f, (!LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
        atomicBoolean.set(true);
        y1Var = new org.telegram.ui.Cells.y1(context, 1, p2Var.getResourceProvider());
        y1VarArr[0] = y1Var;
        if (!y1Var.E) {
        }
        y1VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
        y1VarArr[0].e(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.OpenUrlOption2, UserObject.getUserName(user))), "", true, false, false);
        y1VarArr[0].setPadding(!LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, !LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
        y1VarArr[0].c(true, false);
        t4Var.addView(y1VarArr[0], k7.b6.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        y1VarArr[0].setOnClickListener(new g0(atomicBoolean, 2));
        if (UserObject.isReplyUser(user)) {
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Start), new z0(3, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.d2 d2Var32 = d2Var;
        p2Var.showDialog(d2Var32);
        s4Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebViewStartPermission2), new j1(1, context, d2Var32)));
    }

    public static void n0(Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, Runnable runnable) {
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(j10);
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        f10.addView(new lh.g4(context, tL_starGiftUnique, userOrChat), k7.b6.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.ui.b.l(org.telegram.ui.ActionBar.j6.j5, f6Var, textView, 1, 16.0f);
        org.telegram.ui.b.o(R.string.GiftThemesSetInReuseInfo, new Object[]{DialogObject.getDialogTitle(userOrChat)}, textView);
        f10.addView(textView, k7.b6.t(-1, -2, 48, 24, 0, 24, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        alertDialog$Builder.n(f10);
        alertDialog$Builder.k(LocaleController.getString(R.string.GiftThemesSetInReuseConfirm), new z0(2, runnable));
        kf.k0.u(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void o(org.telegram.ui.ActionBar.p2 p2Var, TLRPC.User user, Runnable runnable, Runnable runnable2) {
        Context context = p2Var.getContext();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        n4 n4Var = new n4(context, null);
        NotificationCenter.listenEmojiLoading(n4Var);
        n4Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
        n4Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gc, false));
        n4Var.setTextSize(1, 16.0f);
        n4Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        FrameLayout frameLayout = new FrameLayout(context);
        alertDialog$Builder.a.D = 6;
        alertDialog$Builder.n(frameLayout);
        z8 z8Var = new z8((org.telegram.ui.ActionBar.f6) null);
        z8Var.u(AndroidUtilities.dp(18.0f));
        p9 p9Var = new p9(context);
        p9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        frameLayout.addView(p9Var, k7.b6.d(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        k5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
        k5Var.setTextSize(20);
        k5Var.setTypeface(AndroidUtilities.bold());
        k5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        k5Var.setEllipsizeByGradient(true);
        k5Var.l(user.first_name, false);
        if (user.scam) {
            k5Var.i(org.telegram.ui.ActionBar.j6.g1);
        } else if (user.fake) {
            k5Var.i(org.telegram.ui.ActionBar.j6.h1);
        } else if (user.verified) {
            Drawable mutate = context.getResources().getDrawable(R.drawable.verified_area).mutate();
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.z9, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(w02, mode));
            Drawable mutate2 = context.getResources().getDrawable(R.drawable.verified_check).mutate();
            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A9, false), mode));
            k5Var.i(new mq(mutate, mutate2));
        }
        TextView textView = new TextView(context);
        org.telegram.ui.b.q(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.m5, false), 1, 14.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new u0(user, p2Var, alertDialog$Builder, 0));
        SpannableString valueOf = SpannableString.valueOf(LocaleController.getString(R.string.MoreAboutThisBot) + "  ");
        lq lqVar = new lq(R.drawable.attach_arrow_right, 0);
        lqVar.setTopOffset(1);
        lqVar.setSize(AndroidUtilities.dp(10.0f));
        valueOf.setSpan(lqVar, valueOf.length() - 1, valueOf.length(), 33);
        textView.setText(valueOf);
        boolean z4 = LocaleController.isRTL;
        frameLayout.addView(k5Var, k7.b6.d(-1, -2.0f, (z4 ? 5 : 3) | 48, z4 ? 21 : 76, 0.0f, z4 ? 76 : 21, 0.0f));
        boolean z10 = LocaleController.isRTL;
        frameLayout.addView(textView, k7.b6.d(-1, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 21 : 76, 24.0f, z10 ? 76 : 21, 0.0f));
        frameLayout.addView(n4Var, k7.b6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
        if (UserObject.isReplyUser(user)) {
            z8Var.p = 0.8f;
            z8Var.g(12);
            p9Var.h(null, null, z8Var, user);
        } else {
            z8Var.p = 1.0f;
            z8Var.m(p2Var.getCurrentAccount(), user);
            p9Var.e(user, z8Var);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Start), new z0(0, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        DialogInterface.OnDismissListener s0Var = new s0(3, runnable2);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        p2Var.showDialog(d2Var, false, s0Var);
        n4Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebViewStartPermission2), new j1(0, context, d2Var)));
    }

    public static void o0(Context context, org.telegram.ui.ActionBar.f6 f6Var, String str, boolean z4, final Utilities.Callback2 callback2) {
        if (AndroidUtilities.isContextSafe(context)) {
            final org.telegram.ui.ActionBar.d2[] d2VarArr = new org.telegram.ui.ActionBar.d2[1];
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
            alertDialog$Builder.a.O = LocaleController.getString(R.string.OpenUrlTitle);
            TextView textView = new TextView(context);
            textView.setText(str);
            textView.setTextSize(1, 14.0f);
            int i10 = org.telegram.ui.ActionBar.j6.j5;
            textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
            textView.setGravity(17);
            textView.setMaxLines(5);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
            gradientDrawable.setColor(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var)));
            textView.setBackground(gradientDrawable);
            final org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(context, 1, f6Var);
            y1Var.setMultiline(true);
            y1Var.getTextView().getLayoutParams().width = -1;
            y1Var.getTextView().setSingleLine(false);
            y1Var.getTextView().setMaxLines(3);
            y1Var.getTextView().setTextSize(1, 16.0f);
            y1Var.e(LocaleController.getString(z4 ? R.string.BrowserAlwaysOpenExternal : R.string.BrowserAlwaysOpenInApp), "", false, false, false);
            y1Var.setOnClickListener(new g0(y1Var, 1));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.addView(textView, k7.b6.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
            linearLayout.addView(y1Var, k7.b6.t(-1, -2, 3, 8, 6, 8, 4));
            alertDialog$Builder.n(linearLayout);
            alertDialog$Builder.a.a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
            final int i11 = 0;
            alertDialog$Builder.k(LocaleController.getString(R.string.Open), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.Components.h1
                @Override // org.telegram.ui.ActionBar.c2
                public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i12) {
                    switch (i11) {
                        case 0:
                            callback2.run(Boolean.TRUE, Boolean.valueOf(y1Var.b()));
                            org.telegram.ui.ActionBar.d2 d2Var2 = d2VarArr[0];
                            if (d2Var2 != null) {
                                d2Var2.dismiss();
                                break;
                            }
                            break;
                        default:
                            callback2.run(Boolean.FALSE, Boolean.valueOf(y1Var.b()));
                            org.telegram.ui.ActionBar.d2 d2Var3 = d2VarArr[0];
                            if (d2Var3 != null) {
                                d2Var3.dismiss();
                                break;
                            }
                            break;
                    }
                }
            });
            final int i12 = 1;
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.Components.h1
                @Override // org.telegram.ui.ActionBar.c2
                public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i122) {
                    switch (i12) {
                        case 0:
                            callback2.run(Boolean.TRUE, Boolean.valueOf(y1Var.b()));
                            org.telegram.ui.ActionBar.d2 d2Var2 = d2VarArr[0];
                            if (d2Var2 != null) {
                                d2Var2.dismiss();
                                break;
                            }
                            break;
                        default:
                            callback2.run(Boolean.FALSE, Boolean.valueOf(y1Var.b()));
                            org.telegram.ui.ActionBar.d2 d2Var3 = d2VarArr[0];
                            if (d2Var3 != null) {
                                d2Var3.dismiss();
                                break;
                            }
                            break;
                    }
                }
            });
            d2VarArr[0] = alertDialog$Builder.o();
        }
    }

    public static org.telegram.ui.ActionBar.b3 p(Activity activity, MessagesStorage.IntCallback intCallback, org.telegram.ui.ActionBar.f6 f6Var) {
        if (activity == null) {
            return null;
        }
        org.telegram.ui.ActionBar.b3 b3Var = new org.telegram.ui.ActionBar.b3(activity, f6Var);
        b3Var.a();
        xc0 xc0Var = new xc0(activity, f6Var);
        xc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        xc0Var.setItemCount(5);
        xc0 xc0Var2 = new xc0(activity, f6Var);
        xc0Var2.setItemCount(5);
        xc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        xc0 xc0Var3 = new xc0(activity, f6Var);
        xc0Var3.setItemCount(5);
        xc0Var3.setTextOffset(-AndroidUtilities.dp(24.0f));
        j4 j4Var = new j4(activity, xc0Var, xc0Var2, xc0Var3);
        j4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        j4Var.addView(frameLayout, k7.b6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(activity);
        textView.setText(LocaleController.getString(R.string.ChooseDate));
        org.telegram.ui.b.w(org.telegram.ui.ActionBar.j6.j5, f6Var, textView, 1, 20.0f);
        frameLayout.addView(textView, k7.b6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new oh.d(10));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        j4Var.addView(linearLayout, k7.b6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        System.currentTimeMillis();
        k4 k4Var = new k4(activity);
        linearLayout.addView(xc0Var, k7.b6.l(0.25f, 0, 270));
        xc0Var.setMinValue(1);
        xc0Var.setMaxValue(31);
        xc0Var.setWrapSelectorWheel(false);
        xc0Var.setFormatter(new org.telegram.ui.bs(5));
        m0 m0Var = new m0(xc0Var, xc0Var2, xc0Var3, 0);
        xc0Var.setOnValueChangedListener(m0Var);
        xc0Var2.setMinValue(0);
        xc0Var2.setMaxValue(11);
        xc0Var2.setWrapSelectorWheel(false);
        linearLayout.addView(xc0Var2, k7.b6.l(0.5f, 0, 270));
        xc0Var2.setFormatter(new org.telegram.ui.bs(6));
        xc0Var2.setOnValueChangedListener(m0Var);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(1375315200000L);
        int i10 = calendar.get(1);
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i11 = calendar.get(1);
        xc0Var3.setMinValue(i10);
        xc0Var3.setMaxValue(i11);
        xc0Var3.setWrapSelectorWheel(false);
        xc0Var3.setFormatter(new org.telegram.ui.bs(7));
        linearLayout.addView(xc0Var3, k7.b6.l(0.25f, 0, 270));
        xc0Var3.setOnValueChangedListener(m0Var);
        xc0Var.setValue(31);
        xc0Var2.setValue(12);
        xc0Var3.setValue(i11);
        b(xc0Var, xc0Var2, xc0Var3);
        k4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        k4Var.setGravity(17);
        k4Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sh, f6Var));
        k4Var.setTextSize(1, 14.0f);
        k4Var.setTypeface(AndroidUtilities.bold());
        k4Var.setText(LocaleController.getString(R.string.JumpToDate));
        int dp = AndroidUtilities.dp(8.0f);
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var);
        int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Qh, f6Var);
        k4Var.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, v02, v03, v03));
        j4Var.addView(k4Var, k7.b6.t(-1, 48, 83, 16, 15, 16, 16));
        k4Var.setOnClickListener(new gg.e(xc0Var, xc0Var2, xc0Var3, calendar, (Object) intCallback, b3Var, 1));
        b3Var.b(j4Var);
        return b3Var;
    }

    public static void p0(Context context, String str, boolean z4, boolean z10, boolean z11, boolean z12, long j10, ze.c cVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.f6 f6Var) {
        String v;
        LinearLayout linearLayout;
        if (AndroidUtilities.isContextSafe(context)) {
            String scheme = str == null ? null : Uri.parse(str).getScheme();
            if (ze.d.f(Uri.parse(str), false, null) || !z11 || "mailto".equalsIgnoreCase(scheme)) {
                ze.d.r(context, Uri.parse(str), j10 == 0, z10, z12 && Uri.parse(str).getPath().matches("^/\\w*/[^\\d]*(?:\\?startapp=.*?|)$"), cVar, null, false, true, false);
                return;
            }
            if (z4) {
                try {
                    Uri parse = Uri.parse(str);
                    v = ze.d.v(parse, null, null, ze.d.a(parse.getHost()), null);
                } catch (Exception e) {
                    FileLog.e((Throwable) e, false);
                }
                o2 o2Var = new o2(context, str, j10, z10, cVar);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
                String string = LocaleController.getString(R.string.OpenUrlTitle);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                d2Var.O = string;
                TextView textView = new TextView(context);
                textView.setText(v);
                textView.setTextSize(1, 14.0f);
                int i10 = org.telegram.ui.ActionBar.j6.j5;
                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
                textView.setGravity(17);
                textView.setMaxLines(5);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
                gradientDrawable.setColor(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var)));
                textView.setBackground(gradientDrawable);
                linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.addView(textView, k7.b6.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
                int i11 = t81.f;
                if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
                    t81 t81Var = new t81(context, f6Var);
                    t81Var.setWebPage(webPage);
                    linearLayout.addView(t81Var, k7.b6.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
                }
                alertDialog$Builder.n(linearLayout);
                d2Var.a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
                alertDialog$Builder.k(LocaleController.getString(R.string.Open), new t(o2Var, 8));
                kf.k0.u(R.string.Cancel, alertDialog$Builder, null);
            }
            v = str;
            o2 o2Var2 = new o2(context, str, j10, z10, cVar);
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context, 0, f6Var);
            String string2 = LocaleController.getString(R.string.OpenUrlTitle);
            org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.a;
            d2Var2.O = string2;
            TextView textView2 = new TextView(context);
            textView2.setText(v);
            textView2.setTextSize(1, 14.0f);
            int i102 = org.telegram.ui.ActionBar.j6.j5;
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i102, f6Var));
            textView2.setGravity(17);
            textView2.setMaxLines(5);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(AndroidUtilities.dp(22.0f));
            gradientDrawable2.setColor(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(i102, f6Var)));
            textView2.setBackground(gradientDrawable2);
            linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.addView(textView2, k7.b6.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
            int i112 = t81.f;
            if (webPage != null) {
                t81 t81Var2 = new t81(context, f6Var);
                t81Var2.setWebPage(webPage);
                linearLayout.addView(t81Var2, k7.b6.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
            }
            alertDialog$Builder2.n(linearLayout);
            d2Var2.a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Open), new t(o2Var2, 8));
            kf.k0.u(R.string.Cancel, alertDialog$Builder2, null);
        }
    }

    public static void q(org.telegram.ui.ActionBar.p2 p2Var, TLRPC.User user, boolean z4) {
        String string;
        String formatString;
        if (p2Var.getParentActivity() == null || user == null || UserObject.isDeleted(user) || UserConfig.getInstance(p2Var.getCurrentAccount()).getClientUserId() == user.id) {
            return;
        }
        p2Var.getCurrentAccount();
        Activity parentActivity = p2Var.getParentActivity();
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        if (z4) {
            string = LocaleController.getString(R.string.VideoCallAlertTitle);
            formatString = LocaleController.formatString("VideoCallAlert", R.string.VideoCallAlert, UserObject.getUserName(user));
        } else {
            string = LocaleController.getString(R.string.CallAlertTitle);
            formatString = LocaleController.formatString("CallAlert", R.string.CallAlert, UserObject.getUserName(user));
        }
        j3 j3Var = new j3(parentActivity);
        NotificationCenter.listenEmojiLoading(j3Var);
        j3Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
        j3Var.setTextSize(1, 16.0f);
        int i10 = 5;
        j3Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        j3Var.setText(AndroidUtilities.replaceTags(formatString));
        z8 z8Var = new z8((org.telegram.ui.ActionBar.f6) null);
        z8Var.u(AndroidUtilities.dp(12.0f));
        z8Var.p = 1.0f;
        z8Var.m(p2Var.getCurrentAccount(), user);
        p9 p9Var = new p9(parentActivity);
        p9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        p9Var.e(user, z8Var);
        frameLayout.addView(p9Var, k7.b6.d(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        TextView textView = new TextView(parentActivity);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(string);
        boolean z10 = LocaleController.isRTL;
        frameLayout.addView(textView, k7.b6.d(-1, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 21 : 76, 11.0f, z10 ? 76 : 21, 0.0f));
        frameLayout.addView(j3Var, k7.b6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
        alertDialog$Builder.n(frameLayout);
        alertDialog$Builder.k(LocaleController.getString(R.string.Call), new com.google.firebase.messaging.i(p2Var, user, z4, i10));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        p2Var.showDialog(alertDialog$Builder.a);
    }

    public static void q0(org.telegram.ui.ActionBar.p2 p2Var, String str, boolean z4, boolean z10) {
        r0(p2Var, str, z4, true, z10, false, null, null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0180, code lost:
    
        if (org.telegram.messenger.ChatObject.isMonoForum(r34) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0198, code lost:
    
        r5 = new org.telegram.ui.Cells.y1(r6, 1, r37);
        r11[0] = r5;
        r5.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01a7, code lost:
    
        if (r34 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01a9, code lost:
    
        r11[0].e(org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.DeleteMessagesOptionAlsoChat), "", false, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01db, code lost:
    
        r2 = r11[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01e1, code lost:
    
        if (org.telegram.messenger.LocaleController.isRTL == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01e3, code lost:
    
        r4 = org.telegram.messenger.AndroidUtilities.dp(16.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01ee, code lost:
    
        if (org.telegram.messenger.LocaleController.isRTL == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01f0, code lost:
    
        r5 = org.telegram.messenger.AndroidUtilities.dp(8.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01f9, code lost:
    
        r2.setPadding(r4, 0, r5, 0);
        r15.addView(r11[0], k7.b6.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        r11[0].c(false, false);
        r11[0].setOnClickListener(new org.telegram.ui.Components.t0(4, r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01f5, code lost:
    
        r5 = org.telegram.messenger.AndroidUtilities.dp(16.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01e8, code lost:
    
        r4 = org.telegram.messenger.AndroidUtilities.dp(8.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01bd, code lost:
    
        r11[0].e(org.telegram.messenger.LocaleController.formatString("DeleteMessagesOptionAlso", org.telegram.messenger.R.string.DeleteMessagesOptionAlso, org.telegram.messenger.UserObject.getFirstName(r33)), "", false, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0196, code lost:
    
        if (org.telegram.messenger.ChatObject.isMonoForum(r34) == false) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0184  */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void r(org.telegram.ui.ActionBar.p2 p2Var, int i10, TLRPC.User user, TLRPC.Chat chat, boolean z4, MessagesStorage.BooleanCallback booleanCallback, org.telegram.ui.ActionBar.f6 f6Var) {
        int i11;
        boolean[] zArr;
        String string;
        TextView textView;
        if (p2Var == null || p2Var.getParentActivity() == null) {
            return;
        }
        if (user == null && chat == null) {
            return;
        }
        int currentAccount = p2Var.getCurrentAccount();
        Activity parentActivity = p2Var.getParentActivity();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, f6Var);
        long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
        org.telegram.ui.Cells.y1[] y1VarArr = new org.telegram.ui.Cells.y1[1];
        h3 h3Var = new h3(parentActivity);
        NotificationCenter.listenEmojiLoading(h3Var);
        h3Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
        h3Var.setTextSize(1, 16.0f);
        h3Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        i3 i3Var = new i3(parentActivity, y1VarArr);
        alertDialog$Builder.n(i3Var);
        TextView textView2 = new TextView(parentActivity);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
        textView2.setTextSize(1, 20.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        i3Var.addView(textView2, k7.b6.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 11.0f, 24.0f, 0.0f));
        i3Var.addView(h3Var, k7.b6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 48.0f, 24.0f, 18.0f));
        if (i10 == -1) {
            textView2.setText(LocaleController.formatString("ClearHistory", R.string.ClearHistory, new Object[0]));
            if (user != null) {
                h3Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureClearHistoryWithUser", R.string.AreYouSureClearHistoryWithUser, UserObject.getUserName(user))));
            } else if (z4) {
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    i11 = 1;
                    h3Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureClearHistoryWithChannel", R.string.AreYouSureClearHistoryWithChannel, chat.title)));
                    zArr = new boolean[i11];
                    zArr[0] = false;
                    if (chat != null && z4 && ChatObject.isPublic(chat)) {
                        zArr[0] = i11;
                    }
                    if (user != null) {
                        long j10 = user.id;
                        if (j10 != clientUserId) {
                            if (j10 != UserObject.VERIFY) {
                            }
                        }
                    }
                    if (chat != null) {
                        if (z4) {
                            if (!ChatObject.isPublic(chat)) {
                                if (!ChatObject.isChannelAndNotMegaGroup(chat)) {
                                }
                            }
                        }
                    }
                    string = LocaleController.getString(R.string.Delete);
                    if (chat != null && z4 && ChatObject.isPublic(chat) && !ChatObject.isChannelAndNotMegaGroup(chat)) {
                        string = LocaleController.getString(R.string.ClearForAll);
                    }
                    alertDialog$Builder.k(string, new o1(6, booleanCallback, zArr));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                    p2Var.showDialog(d2Var);
                    textView = (TextView) d2Var.d(-1);
                    if (textView == null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                        return;
                    }
                    return;
                }
                h3Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureClearHistoryWithChat", R.string.AreYouSureClearHistoryWithChat, chat.title)));
            } else if (chat.megagroup) {
                h3Var.setText(LocaleController.getString(R.string.AreYouSureClearHistoryGroup));
            } else {
                h3Var.setText(LocaleController.getString(R.string.AreYouSureClearHistoryChannel));
            }
        } else {
            textView2.setText(LocaleController.formatPluralString("DeleteDays", i10, new Object[0]));
            h3Var.setText(LocaleController.getString(R.string.DeleteHistoryByDaysMessage));
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
        alertDialog$Builder.k(string, new o1(6, booleanCallback, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder.a;
        p2Var.showDialog(d2Var2);
        textView = (TextView) d2Var2.d(-1);
        if (textView == null) {
        }
    }

    public static void r0(org.telegram.ui.ActionBar.p2 p2Var, String str, boolean z4, boolean z10, boolean z11, boolean z12, ze.c cVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.f6 f6Var) {
        if (p2Var == null || p2Var.getParentActivity() == null) {
            return;
        }
        p0(p2Var.getParentActivity(), str, z4, z10, z11, z12, p2Var instanceof org.telegram.ui.zn ? ((org.telegram.ui.zn) p2Var).c8 : 0L, cVar, webPage, f6Var);
    }

    public static void s(org.telegram.ui.ActionBar.p2 p2Var, boolean z4, TLRPC.Chat chat, TLRPC.User user, boolean z10, boolean z11, boolean z12, boolean z13, MessagesStorage.BooleanCallback booleanCallback) {
        t(p2Var, z4, false, chat, user, z10, z11, z12, z13, booleanCallback, p2Var != null ? p2Var.getResourceProvider() : null);
    }

    public static void s0(Activity activity, int i10, Runnable runnable, boolean z4, org.telegram.ui.ActionBar.f6 f6Var) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i11 = MessagesController.getInstance(i10).availableMapProviders;
        if ((i11 & 1) != 0) {
            org.telegram.ui.ai.p(R.string.MapPreviewProviderTelegram, 0, arrayList, arrayList2);
        }
        if ((i11 & 2) != 0) {
            org.telegram.ui.ai.p(R.string.MapPreviewProviderGoogle, 1, arrayList, arrayList2);
        }
        if ((i11 & 4) != 0) {
            org.telegram.ui.ai.p(R.string.MapPreviewProviderYandex, 3, arrayList, arrayList2);
        }
        arrayList.add(LocaleController.getString(R.string.MapPreviewProviderNobody));
        arrayList2.add(2);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, f6Var);
        alertDialog$Builder.a.O = LocaleController.getString(R.string.MapPreviewProviderTitle);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(activity, f6Var);
            j6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            j6Var.setTag(Integer.valueOf(i12));
            j6Var.a(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.g7, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E5, false));
            j6Var.b((CharSequence) arrayList.get(i12), SharedConfig.mapPreviewType == ((Integer) arrayList2.get(i12)).intValue());
            j6Var.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), 2, -1));
            linearLayout.addView(j6Var);
            j6Var.setOnClickListener(new dg.p(arrayList2, runnable, alertDialog$Builder, 17));
        }
        if (!z4) {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        org.telegram.ui.ActionBar.d2 o10 = alertDialog$Builder.o();
        if (z4) {
            o10.setCanceledOnTouchOutside(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x05fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void t(final org.telegram.ui.ActionBar.p2 p2Var, final boolean z4, final boolean z10, TLRPC.Chat chat, final TLRPC.User user, final boolean z11, final boolean z12, boolean z13, final boolean z14, final MessagesStorage.BooleanCallback booleanCallback, final org.telegram.ui.ActionBar.f6 f6Var) {
        long j10;
        boolean z15;
        org.telegram.ui.Cells.y1[] y1VarArr;
        d3 d3Var;
        TLRPC.Chat chat2;
        org.telegram.ui.Cells.y1[] y1VarArr2;
        p9 p9Var;
        float f10;
        float f11;
        final TLRPC.Chat chat3;
        boolean z16;
        p9 p9Var2;
        org.telegram.ui.ActionBar.d2 d2Var;
        boolean z17;
        boolean z18;
        CharSequence string;
        TextView textView;
        if (p2Var == null || p2Var.getParentActivity() == null) {
            return;
        }
        if (chat == null && user == null) {
            return;
        }
        final int currentAccount = p2Var.getCurrentAccount();
        final Activity parentActivity = p2Var.getParentActivity();
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, f6Var);
        long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
        org.telegram.ui.Cells.y1[] y1VarArr3 = new org.telegram.ui.Cells.y1[1];
        d3 d3Var2 = new d3(parentActivity);
        NotificationCenter.listenEmojiLoading(d3Var2);
        d3Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
        d3Var2.setTextSize(1, 16.0f);
        d3Var2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        if (!z14 && ChatObject.isChannel(chat) && ChatObject.isPublic(chat)) {
            j10 = clientUserId;
            z15 = true;
        } else {
            j10 = clientUserId;
            z15 = false;
        }
        e3 e3Var = new e3(parentActivity, y1VarArr3);
        org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder.a;
        d2Var2.D = 6;
        alertDialog$Builder.n(e3Var);
        z8 z8Var = new z8((org.telegram.ui.ActionBar.f6) null);
        z8Var.u(AndroidUtilities.dp(18.0f));
        p9 p9Var3 = new p9(parentActivity);
        p9Var3.setRoundRadius(AndroidUtilities.dp(15.0f));
        e3Var.addView(p9Var3, k7.b6.d(30, 30.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        k6 k6Var = new k6(parentActivity, false, false, false);
        final boolean z19 = z15;
        k6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
        k6Var.setTextSize(AndroidUtilities.dp(20.0f));
        k6Var.setTypeface(AndroidUtilities.bold());
        k6Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        k6Var.setEllipsizeByGradient(true);
        if (z4) {
            if (z19) {
                k6Var.setText(LocaleController.getString(R.string.ClearHistoryCache));
            } else {
                k6Var.setText(LocaleController.getString(R.string.ClearHistory));
            }
        } else if (chat == null) {
            k6Var.setText(LocaleController.getString(R.string.DeleteChatUser));
        } else if (ChatObject.isCommunity(chat)) {
            k6Var.setText(LocaleController.getString(R.string.CommunityDelete));
        } else if (!ChatObject.isChannel(chat)) {
            k6Var.setText(LocaleController.getString(R.string.LeaveMega));
        } else if (chat.monoforum) {
            k6Var.setText(LocaleController.getString(R.string.LeaveConversationMenu));
        } else if (chat.megagroup) {
            k6Var.setText(LocaleController.getString(R.string.LeaveMega));
        } else {
            k6Var.setText(LocaleController.getString(R.string.LeaveChannel));
        }
        boolean z20 = LocaleController.isRTL;
        e3Var.addView(k6Var, k7.b6.d(-1, 24.0f, (z20 ? 5 : 3) | 48, z20 ? 22 : 65, 7.66f, z20 ? 65 : 22, 0.0f));
        e3Var.addView(d3Var2, k7.b6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 49.0f, 24.0f, 1.0f));
        if (ChatObject.isMonoForum(chat)) {
            y1VarArr = y1VarArr3;
            d3Var = d3Var2;
            chat2 = p2Var.getMessagesController().getMonoForumLinkedChat(chat.id);
        } else {
            y1VarArr = y1VarArr3;
            d3Var = d3Var2;
            chat2 = null;
        }
        boolean z21 = !z11 && user != null && (user != null && !user.bot && (user.id > j10 ? 1 : (user.id == j10 ? 0 : -1)) != 0 && MessagesController.getInstance(currentAccount).canRevokePmInbox) && (user != null ? MessagesController.getInstance(currentAccount).revokeTimePmLimit : MessagesController.getInstance(currentAccount).revokeTimeLimit) == Integer.MAX_VALUE;
        d3 d3Var3 = d3Var;
        final boolean[] zArr = new boolean[1];
        ArrayList arrayList = user != null ? (ArrayList) MessagesController.getInstance(currentAccount).dialogMessage.f(user.id) : null;
        boolean z22 = (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((MessageObject) arrayList.get(0)).messageOwner == null || (!(((MessageObject) arrayList.get(0)).messageOwner.action instanceof TLRPC.TL_messageActionUserJoined) && !(((MessageObject) arrayList.get(0)).messageOwner.action instanceof TLRPC.TL_messageActionContactSignUp))) ? false : true;
        if (user != null) {
            f10 = 10.0f;
            if (user.bot) {
                p9Var = p9Var3;
                f11 = 8.0f;
                if (user.id != UserObject.VERIFY) {
                    org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(parentActivity, 1, f6Var);
                    y1VarArr[0] = y1Var;
                    y1Var.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                    y1VarArr[0].e(LocaleController.getString(R.string.BlockBot), "", false, false, false);
                    org.telegram.ui.Cells.y1[] y1VarArr4 = y1VarArr;
                    y1VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f), LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), AndroidUtilities.dp(10.0f));
                    org.telegram.ui.Cells.y1 y1Var2 = y1VarArr4[0];
                    zArr[0] = true;
                    y1Var2.c(true, false);
                    y1VarArr4[0].setMultiline(true);
                    e3Var.addView(y1VarArr4[0], k7.b6.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                    y1VarArr4[0].setOnClickListener(new t0(3, zArr));
                    chat3 = chat;
                    p9Var2 = p9Var;
                    d2Var = d2Var2;
                    z17 = false;
                    if (user == null) {
                        p9 p9Var4 = p9Var2;
                        z8Var.k(p2Var.getCurrentAccount(), chat2 != null ? chat2 : chat3);
                        p9Var4.e(chat2 != null ? chat2 : chat3, z8Var);
                    } else if (UserObject.isReplyUser(user)) {
                        z8Var.p = 0.8f;
                        z8Var.g(12);
                        p9Var2.h(null, null, z8Var, user);
                    } else {
                        p9 p9Var5 = p9Var2;
                        if (user.id == j10) {
                            z8Var.p = 0.8f;
                            z8Var.g(1);
                            p9Var5.h(null, null, z8Var, user);
                        } else {
                            z8Var.p = 1.0f;
                            z8Var.m(p2Var.getCurrentAccount(), user);
                            p9Var5.e(user, z8Var);
                        }
                    }
                    if (z10) {
                        if (UserObject.isUserSelf(user)) {
                            d3Var3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DeleteAllMessagesSavedAlert)));
                        } else if (chat3 == null || !ChatObject.isChannelAndNotMegaGroup(chat3)) {
                            d3Var3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DeleteAllMessagesAlert)));
                        } else {
                            d3Var3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DeleteAllMessagesChannelAlert)));
                        }
                    } else if (z4) {
                        if (user == null) {
                            String formatString = chat2 != null ? LocaleController.formatString(R.string.MonoforumTitle, chat2.title) : chat3.title;
                            if (!ChatObject.isChannel(chat3) || (chat3.megagroup && !ChatObject.isPublic(chat3))) {
                                d3Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithChat, formatString)));
                            } else if (chat3.megagroup) {
                                d3Var3.setText(LocaleController.getString(R.string.AreYouSureClearHistoryGroup));
                            } else {
                                d3Var3.setText(LocaleController.getString(R.string.AreYouSureClearHistoryChannel));
                            }
                        } else if (z11) {
                            d3Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithSecretUser, UserObject.getUserName(user))));
                        } else if (user.id == j10) {
                            d3Var3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AreYouSureClearHistorySavedMessages)));
                        } else {
                            d3Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithUser, UserObject.getUserName(user))));
                        }
                    } else if (user != null) {
                        if (z11) {
                            d3Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteThisChatWithSecretUser, UserObject.getUserName(user))));
                        } else if (user.id == j10) {
                            d3Var3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AreYouSureDeleteThisChatSavedMessages)));
                        } else if (!user.bot || user.support) {
                            d3Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteThisChatWithUser, UserObject.getUserName(user))));
                        } else {
                            d3Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteThisChatWithBotWithCheckmark, UserObject.getUserName(user))));
                        }
                    } else if (ChatObject.isChannel(chat3)) {
                        String formatString2 = chat2 != null ? LocaleController.formatString(R.string.MonoforumTitle, chat2.title) : chat3.title;
                        if (chat3.megagroup) {
                            d3Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.MegaLeaveAlertWithName, formatString2)));
                        } else {
                            d3Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.ChannelLeaveAlertWithName, formatString2)));
                        }
                    } else {
                        d3Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteAndExitName, chat3.title)));
                    }
                    if (z10) {
                        string = LocaleController.getString(R.string.DeleteAll);
                    } else {
                        if (!z4) {
                            if (z17 && zArr[0]) {
                                string = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat3) ? R.string.ChannelDelete : R.string.DeleteMega);
                            } else {
                                string = ChatObject.isChannel(chat3) ? chat3.monoforum ? LocaleController.getString(R.string.LeaveConversationMenu) : chat3.megagroup ? LocaleController.getString(R.string.LeaveMegaMenu) : LocaleController.getString(R.string.LeaveChannelMenu) : LocaleController.getString(R.string.DeleteChatUser);
                            }
                            org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                            alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.Components.s2
                                @Override // org.telegram.ui.ActionBar.c2
                                public final void l(org.telegram.ui.ActionBar.d2 d2Var4, int i10) {
                                    final boolean[] zArr2;
                                    boolean z23 = z19;
                                    final boolean z24 = z10;
                                    final boolean[] zArr3 = zArr;
                                    final MessagesStorage.BooleanCallback booleanCallback2 = booleanCallback;
                                    boolean z25 = true;
                                    if (z23 || z24 || z11) {
                                        zArr2 = zArr3;
                                    } else {
                                        final TLRPC.User user2 = user;
                                        boolean isUserSelf = UserObject.isUserSelf(user2);
                                        final org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                                        final boolean z26 = z4;
                                        final TLRPC.Chat chat4 = chat3;
                                        final boolean z27 = z12;
                                        final boolean z28 = z14;
                                        final org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                                        if (isUserSelf) {
                                            z4.t(p2Var2, z26, true, chat4, user2, false, z27, zArr3[0], z28, booleanCallback2, f6Var2);
                                            return;
                                        }
                                        if (user2 != null && zArr3[0]) {
                                            MessagesStorage.getInstance(p2Var2.getCurrentAccount()).getMessagesCount(user2.id, new MessagesStorage.IntCallback() { // from class: org.telegram.ui.Components.m1
                                                @Override // org.telegram.messenger.MessagesStorage.IntCallback
                                                public final void run(int i11) {
                                                    boolean[] zArr4 = zArr3;
                                                    MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                                    if (i11 >= 50) {
                                                        z4.t(org.telegram.ui.ActionBar.p2.this, z26, true, chat4, user2, false, z27, zArr4[0], z28, booleanCallback3, f6Var2);
                                                    } else if (booleanCallback3 != null) {
                                                        booleanCallback3.run(zArr4[0]);
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                        zArr2 = zArr3;
                                        if (ChatObject.isChannel(chat4) && chat4.creator && !zArr2[0]) {
                                            final ze.c g10 = alertDialog$Builder.a.g(-1, true, true);
                                            g10.d();
                                            TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                                            tL_channels_getFutureCreatorAfterLeave.channel = MessagesController.getInputChannel(chat4);
                                            final int i11 = currentAccount;
                                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                                            org.telegram.messenger.a aVar = new org.telegram.messenger.a();
                                            final Context context = parentActivity;
                                            connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, aVar, new Utilities.Callback2() { // from class: org.telegram.ui.Components.n1
                                                @Override // org.telegram.messenger.Utilities.Callback2
                                                public final void run(Object obj, Object obj2) {
                                                    TLRPC.User user3 = (TLRPC.User) obj;
                                                    ze.c.this.c(false);
                                                    TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                                    MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                                    if (user4 == null) {
                                                        booleanCallback3.run(z24 || zArr2[0]);
                                                        return;
                                                    }
                                                    Context context2 = context;
                                                    TLRPC.Chat chat5 = chat4;
                                                    kf.j0 j0Var = new kf.j0(context2, chat5, user4, i11, booleanCallback3, f6Var2, 8);
                                                    u1 u1Var = new u1(booleanCallback3, 0);
                                                    org.telegram.ui.ActionBar.p2 p2Var3 = p2Var2;
                                                    if (p2Var3 == null || p2Var3.getParentActivity() == null || chat5 == null) {
                                                        return;
                                                    }
                                                    Context context3 = p2Var3.getContext();
                                                    TLRPC.User currentUser = UserConfig.getInstance(p2Var3.getCurrentAccount()).getCurrentUser();
                                                    boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat5);
                                                    FrameLayout frameLayout = new FrameLayout(context3);
                                                    frameLayout.setClipToPadding(false);
                                                    frameLayout.setClipChildren(false);
                                                    p9 p9Var6 = new p9(context3);
                                                    z8 z8Var2 = new z8((org.telegram.ui.ActionBar.f6) null);
                                                    z8Var2.r(currentUser);
                                                    p9Var6.setRoundRadius(AndroidUtilities.dp(30.0f));
                                                    p9Var6.e(currentUser, z8Var2);
                                                    frameLayout.addView(p9Var6, k7.b6.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                                    ImageView imageView = new ImageView(context3);
                                                    imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                                    imageView.setColorFilter(new PorterDuffColorFilter(p2Var3.getThemedColor(org.telegram.ui.ActionBar.j6.d7), PorterDuff.Mode.SRC_IN));
                                                    frameLayout.addView(imageView, k7.b6.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                                    f3 f3Var = new f3(context3);
                                                    z8 z8Var3 = new z8((org.telegram.ui.ActionBar.f6) null);
                                                    z8Var3.r(user4);
                                                    f3Var.setRoundRadius(AndroidUtilities.dp(30.0f));
                                                    f3Var.e(user4, z8Var3);
                                                    frameLayout.addView(f3Var, k7.b6.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                                    p9 p9Var7 = new p9(context3);
                                                    z8 z8Var4 = new z8((org.telegram.ui.ActionBar.f6) null);
                                                    z8Var4.q(chat5);
                                                    p9Var7.setRoundRadius(AndroidUtilities.dp(12.0f));
                                                    p9Var7.e(chat5, z8Var4);
                                                    frameLayout.addView(p9Var7, k7.b6.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                                    org.telegram.ui.ActionBar.d2 d2Var5 = alertDialog$Builder2.a;
                                                    d2Var5.L0 = -1.0f;
                                                    d2Var5.S = frameLayout;
                                                    d2Var5.O = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannelTitle : R.string.LeaveGroupTitle);
                                                    d2Var5.Q = AndroidUtilities.replaceTags(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.LeaveChannelNewOwnerText : R.string.LeaveGroupNewOwnerText, UserObject.getUserName(user4), chat5.title));
                                                    alertDialog$Builder2.h(LocaleController.getString(R.string.AppointNewOwner), new t(j0Var, 4));
                                                    alertDialog$Builder2.i(LocaleController.getString(R.string.Cancel), null);
                                                    alertDialog$Builder2.k(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannel : R.string.LeaveMegaMenu), new t(u1Var, 5));
                                                    d2Var5.show();
                                                    View d = d2Var5.d(-1);
                                                    if (d instanceof TextView) {
                                                        ((TextView) d).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                        booleanCallback2 = booleanCallback2;
                                    }
                                    if (!z24 && !zArr2[0]) {
                                        z25 = false;
                                    }
                                    booleanCallback2.run(z25);
                                }
                            });
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            p2Var.showDialog(d2Var3);
                            textView = (TextView) d2Var3.d(-1);
                            if (textView == null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                                return;
                            }
                            return;
                        }
                        string = z19 ? LocaleController.getString(R.string.ClearHistoryCache) : LocaleController.getString(R.string.ClearForMe);
                    }
                    org.telegram.ui.ActionBar.d2 d2Var32 = d2Var;
                    alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.Components.s2
                        @Override // org.telegram.ui.ActionBar.c2
                        public final void l(org.telegram.ui.ActionBar.d2 d2Var4, int i10) {
                            final boolean[] zArr2;
                            boolean z23 = z19;
                            final boolean z24 = z10;
                            final boolean[] zArr3 = zArr;
                            final MessagesStorage.BooleanCallback booleanCallback2 = booleanCallback;
                            boolean z25 = true;
                            if (z23 || z24 || z11) {
                                zArr2 = zArr3;
                            } else {
                                final TLRPC.User user2 = user;
                                boolean isUserSelf = UserObject.isUserSelf(user2);
                                final org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                                final boolean z26 = z4;
                                final TLRPC.Chat chat4 = chat3;
                                final boolean z27 = z12;
                                final boolean z28 = z14;
                                final org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                                if (isUserSelf) {
                                    z4.t(p2Var2, z26, true, chat4, user2, false, z27, zArr3[0], z28, booleanCallback2, f6Var2);
                                    return;
                                }
                                if (user2 != null && zArr3[0]) {
                                    MessagesStorage.getInstance(p2Var2.getCurrentAccount()).getMessagesCount(user2.id, new MessagesStorage.IntCallback() { // from class: org.telegram.ui.Components.m1
                                        @Override // org.telegram.messenger.MessagesStorage.IntCallback
                                        public final void run(int i11) {
                                            boolean[] zArr4 = zArr3;
                                            MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                            if (i11 >= 50) {
                                                z4.t(org.telegram.ui.ActionBar.p2.this, z26, true, chat4, user2, false, z27, zArr4[0], z28, booleanCallback3, f6Var2);
                                            } else if (booleanCallback3 != null) {
                                                booleanCallback3.run(zArr4[0]);
                                            }
                                        }
                                    });
                                    return;
                                }
                                zArr2 = zArr3;
                                if (ChatObject.isChannel(chat4) && chat4.creator && !zArr2[0]) {
                                    final ze.c g10 = alertDialog$Builder.a.g(-1, true, true);
                                    g10.d();
                                    TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                                    tL_channels_getFutureCreatorAfterLeave.channel = MessagesController.getInputChannel(chat4);
                                    final int i11 = currentAccount;
                                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                                    org.telegram.messenger.a aVar = new org.telegram.messenger.a();
                                    final Context context = parentActivity;
                                    connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, aVar, new Utilities.Callback2() { // from class: org.telegram.ui.Components.n1
                                        @Override // org.telegram.messenger.Utilities.Callback2
                                        public final void run(Object obj, Object obj2) {
                                            TLRPC.User user3 = (TLRPC.User) obj;
                                            ze.c.this.c(false);
                                            TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                            MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                            if (user4 == null) {
                                                booleanCallback3.run(z24 || zArr2[0]);
                                                return;
                                            }
                                            Context context2 = context;
                                            TLRPC.Chat chat5 = chat4;
                                            kf.j0 j0Var = new kf.j0(context2, chat5, user4, i11, booleanCallback3, f6Var2, 8);
                                            u1 u1Var = new u1(booleanCallback3, 0);
                                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var2;
                                            if (p2Var3 == null || p2Var3.getParentActivity() == null || chat5 == null) {
                                                return;
                                            }
                                            Context context3 = p2Var3.getContext();
                                            TLRPC.User currentUser = UserConfig.getInstance(p2Var3.getCurrentAccount()).getCurrentUser();
                                            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat5);
                                            FrameLayout frameLayout = new FrameLayout(context3);
                                            frameLayout.setClipToPadding(false);
                                            frameLayout.setClipChildren(false);
                                            p9 p9Var6 = new p9(context3);
                                            z8 z8Var2 = new z8((org.telegram.ui.ActionBar.f6) null);
                                            z8Var2.r(currentUser);
                                            p9Var6.setRoundRadius(AndroidUtilities.dp(30.0f));
                                            p9Var6.e(currentUser, z8Var2);
                                            frameLayout.addView(p9Var6, k7.b6.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                            ImageView imageView = new ImageView(context3);
                                            imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                            imageView.setColorFilter(new PorterDuffColorFilter(p2Var3.getThemedColor(org.telegram.ui.ActionBar.j6.d7), PorterDuff.Mode.SRC_IN));
                                            frameLayout.addView(imageView, k7.b6.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                            f3 f3Var = new f3(context3);
                                            z8 z8Var3 = new z8((org.telegram.ui.ActionBar.f6) null);
                                            z8Var3.r(user4);
                                            f3Var.setRoundRadius(AndroidUtilities.dp(30.0f));
                                            f3Var.e(user4, z8Var3);
                                            frameLayout.addView(f3Var, k7.b6.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                            p9 p9Var7 = new p9(context3);
                                            z8 z8Var4 = new z8((org.telegram.ui.ActionBar.f6) null);
                                            z8Var4.q(chat5);
                                            p9Var7.setRoundRadius(AndroidUtilities.dp(12.0f));
                                            p9Var7.e(chat5, z8Var4);
                                            frameLayout.addView(p9Var7, k7.b6.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                            org.telegram.ui.ActionBar.d2 d2Var5 = alertDialog$Builder2.a;
                                            d2Var5.L0 = -1.0f;
                                            d2Var5.S = frameLayout;
                                            d2Var5.O = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannelTitle : R.string.LeaveGroupTitle);
                                            d2Var5.Q = AndroidUtilities.replaceTags(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.LeaveChannelNewOwnerText : R.string.LeaveGroupNewOwnerText, UserObject.getUserName(user4), chat5.title));
                                            alertDialog$Builder2.h(LocaleController.getString(R.string.AppointNewOwner), new t(j0Var, 4));
                                            alertDialog$Builder2.i(LocaleController.getString(R.string.Cancel), null);
                                            alertDialog$Builder2.k(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannel : R.string.LeaveMegaMenu), new t(u1Var, 5));
                                            d2Var5.show();
                                            View d = d2Var5.d(-1);
                                            if (d instanceof TextView) {
                                                ((TextView) d).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                                            }
                                        }
                                    });
                                    return;
                                }
                                booleanCallback2 = booleanCallback2;
                            }
                            if (!z24 && !zArr2[0]) {
                                z25 = false;
                            }
                            booleanCallback2.run(z25);
                        }
                    });
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    p2Var.showDialog(d2Var32);
                    textView = (TextView) d2Var32.d(-1);
                    if (textView == null) {
                    }
                } else {
                    y1VarArr2 = y1VarArr;
                    if (!z10 || (((!z11 || z4) && !z21) || UserObject.isDeleted(user) || z22)) {
                        if (z12 || z4 || chat == null) {
                            chat3 = chat;
                        } else {
                            chat3 = chat;
                            if (chat3.creator) {
                                z16 = true;
                                if (!z16) {
                                    p9Var2 = p9Var;
                                    d2Var = d2Var2;
                                    z17 = z16;
                                    if (user == null) {
                                    }
                                    if (z10) {
                                    }
                                    if (z10) {
                                    }
                                    org.telegram.ui.ActionBar.d2 d2Var322 = d2Var;
                                    alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.Components.s2
                                        @Override // org.telegram.ui.ActionBar.c2
                                        public final void l(org.telegram.ui.ActionBar.d2 d2Var4, int i10) {
                                            final boolean[] zArr2;
                                            boolean z23 = z19;
                                            final boolean z24 = z10;
                                            final boolean[] zArr3 = zArr;
                                            final MessagesStorage.BooleanCallback booleanCallback2 = booleanCallback;
                                            boolean z25 = true;
                                            if (z23 || z24 || z11) {
                                                zArr2 = zArr3;
                                            } else {
                                                final TLRPC.User user2 = user;
                                                boolean isUserSelf = UserObject.isUserSelf(user2);
                                                final org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                                                final boolean z26 = z4;
                                                final TLRPC.Chat chat4 = chat3;
                                                final boolean z27 = z12;
                                                final boolean z28 = z14;
                                                final org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                                                if (isUserSelf) {
                                                    z4.t(p2Var2, z26, true, chat4, user2, false, z27, zArr3[0], z28, booleanCallback2, f6Var2);
                                                    return;
                                                }
                                                if (user2 != null && zArr3[0]) {
                                                    MessagesStorage.getInstance(p2Var2.getCurrentAccount()).getMessagesCount(user2.id, new MessagesStorage.IntCallback() { // from class: org.telegram.ui.Components.m1
                                                        @Override // org.telegram.messenger.MessagesStorage.IntCallback
                                                        public final void run(int i11) {
                                                            boolean[] zArr4 = zArr3;
                                                            MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                                            if (i11 >= 50) {
                                                                z4.t(org.telegram.ui.ActionBar.p2.this, z26, true, chat4, user2, false, z27, zArr4[0], z28, booleanCallback3, f6Var2);
                                                            } else if (booleanCallback3 != null) {
                                                                booleanCallback3.run(zArr4[0]);
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                                zArr2 = zArr3;
                                                if (ChatObject.isChannel(chat4) && chat4.creator && !zArr2[0]) {
                                                    final ze.c g10 = alertDialog$Builder.a.g(-1, true, true);
                                                    g10.d();
                                                    TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                                                    tL_channels_getFutureCreatorAfterLeave.channel = MessagesController.getInputChannel(chat4);
                                                    final int i11 = currentAccount;
                                                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                                                    org.telegram.messenger.a aVar = new org.telegram.messenger.a();
                                                    final Context context = parentActivity;
                                                    connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, aVar, new Utilities.Callback2() { // from class: org.telegram.ui.Components.n1
                                                        @Override // org.telegram.messenger.Utilities.Callback2
                                                        public final void run(Object obj, Object obj2) {
                                                            TLRPC.User user3 = (TLRPC.User) obj;
                                                            ze.c.this.c(false);
                                                            TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                                            MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                                            if (user4 == null) {
                                                                booleanCallback3.run(z24 || zArr2[0]);
                                                                return;
                                                            }
                                                            Context context2 = context;
                                                            TLRPC.Chat chat5 = chat4;
                                                            kf.j0 j0Var = new kf.j0(context2, chat5, user4, i11, booleanCallback3, f6Var2, 8);
                                                            u1 u1Var = new u1(booleanCallback3, 0);
                                                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var2;
                                                            if (p2Var3 == null || p2Var3.getParentActivity() == null || chat5 == null) {
                                                                return;
                                                            }
                                                            Context context3 = p2Var3.getContext();
                                                            TLRPC.User currentUser = UserConfig.getInstance(p2Var3.getCurrentAccount()).getCurrentUser();
                                                            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat5);
                                                            FrameLayout frameLayout = new FrameLayout(context3);
                                                            frameLayout.setClipToPadding(false);
                                                            frameLayout.setClipChildren(false);
                                                            p9 p9Var6 = new p9(context3);
                                                            z8 z8Var2 = new z8((org.telegram.ui.ActionBar.f6) null);
                                                            z8Var2.r(currentUser);
                                                            p9Var6.setRoundRadius(AndroidUtilities.dp(30.0f));
                                                            p9Var6.e(currentUser, z8Var2);
                                                            frameLayout.addView(p9Var6, k7.b6.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                                            ImageView imageView = new ImageView(context3);
                                                            imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                                            imageView.setColorFilter(new PorterDuffColorFilter(p2Var3.getThemedColor(org.telegram.ui.ActionBar.j6.d7), PorterDuff.Mode.SRC_IN));
                                                            frameLayout.addView(imageView, k7.b6.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                                            f3 f3Var = new f3(context3);
                                                            z8 z8Var3 = new z8((org.telegram.ui.ActionBar.f6) null);
                                                            z8Var3.r(user4);
                                                            f3Var.setRoundRadius(AndroidUtilities.dp(30.0f));
                                                            f3Var.e(user4, z8Var3);
                                                            frameLayout.addView(f3Var, k7.b6.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                                            p9 p9Var7 = new p9(context3);
                                                            z8 z8Var4 = new z8((org.telegram.ui.ActionBar.f6) null);
                                                            z8Var4.q(chat5);
                                                            p9Var7.setRoundRadius(AndroidUtilities.dp(12.0f));
                                                            p9Var7.e(chat5, z8Var4);
                                                            frameLayout.addView(p9Var7, k7.b6.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                                            org.telegram.ui.ActionBar.d2 d2Var5 = alertDialog$Builder2.a;
                                                            d2Var5.L0 = -1.0f;
                                                            d2Var5.S = frameLayout;
                                                            d2Var5.O = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannelTitle : R.string.LeaveGroupTitle);
                                                            d2Var5.Q = AndroidUtilities.replaceTags(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.LeaveChannelNewOwnerText : R.string.LeaveGroupNewOwnerText, UserObject.getUserName(user4), chat5.title));
                                                            alertDialog$Builder2.h(LocaleController.getString(R.string.AppointNewOwner), new t(j0Var, 4));
                                                            alertDialog$Builder2.i(LocaleController.getString(R.string.Cancel), null);
                                                            alertDialog$Builder2.k(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannel : R.string.LeaveMegaMenu), new t(u1Var, 5));
                                                            d2Var5.show();
                                                            View d = d2Var5.d(-1);
                                                            if (d instanceof TextView) {
                                                                ((TextView) d).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                                booleanCallback2 = booleanCallback2;
                                            }
                                            if (!z24 && !zArr2[0]) {
                                                z25 = false;
                                            }
                                            booleanCallback2.run(z25);
                                        }
                                    });
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    p2Var.showDialog(d2Var322);
                                    textView = (TextView) d2Var322.d(-1);
                                    if (textView == null) {
                                    }
                                }
                            }
                        }
                        z16 = false;
                        if (!z16) {
                        }
                    } else {
                        chat3 = chat;
                        z16 = false;
                    }
                    org.telegram.ui.Cells.y1 y1Var3 = new org.telegram.ui.Cells.y1(parentActivity, 1, f6Var);
                    y1VarArr2[0] = y1Var3;
                    y1Var3.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                    if (z16) {
                        if (z4) {
                            y1VarArr2[0].e(LocaleController.formatString(R.string.ClearHistoryOptionAlso, UserObject.getFirstName(user)), "", false, false, false);
                        } else {
                            z18 = true;
                            y1VarArr2[0].e(LocaleController.formatString(R.string.DeleteMessagesOptionAlso, UserObject.getFirstName(user)), "", false, false, false);
                            y1VarArr2[0].setMultiline(z18);
                            p9Var2 = p9Var;
                            d2Var = d2Var2;
                            y1VarArr2[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(f11), AndroidUtilities.dp(f10), LocaleController.isRTL ? AndroidUtilities.dp(f11) : AndroidUtilities.dp(16.0f), AndroidUtilities.dp(f10));
                            e3Var.addView(y1VarArr2[0], k7.b6.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                            cg.u0 u0Var = new cg.u0(z16, chat3, alertDialog$Builder, zArr);
                            y1VarArr2[0].setOnClickListener(new org.telegram.messenger.video.g(27, zArr, u0Var));
                            if (z13) {
                                org.telegram.ui.Cells.y1 y1Var4 = y1VarArr2[0];
                                zArr[0] = true;
                                y1Var4.c(true, false);
                                u0Var.run();
                            }
                            z17 = z16;
                            if (user == null) {
                            }
                            if (z10) {
                            }
                            if (z10) {
                            }
                            org.telegram.ui.ActionBar.d2 d2Var3222 = d2Var;
                            alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.Components.s2
                                @Override // org.telegram.ui.ActionBar.c2
                                public final void l(org.telegram.ui.ActionBar.d2 d2Var4, int i10) {
                                    final boolean[] zArr2;
                                    boolean z23 = z19;
                                    final boolean z24 = z10;
                                    final boolean[] zArr3 = zArr;
                                    final MessagesStorage.BooleanCallback booleanCallback2 = booleanCallback;
                                    boolean z25 = true;
                                    if (z23 || z24 || z11) {
                                        zArr2 = zArr3;
                                    } else {
                                        final TLRPC.User user2 = user;
                                        boolean isUserSelf = UserObject.isUserSelf(user2);
                                        final org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                                        final boolean z26 = z4;
                                        final TLRPC.Chat chat4 = chat3;
                                        final boolean z27 = z12;
                                        final boolean z28 = z14;
                                        final org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                                        if (isUserSelf) {
                                            z4.t(p2Var2, z26, true, chat4, user2, false, z27, zArr3[0], z28, booleanCallback2, f6Var2);
                                            return;
                                        }
                                        if (user2 != null && zArr3[0]) {
                                            MessagesStorage.getInstance(p2Var2.getCurrentAccount()).getMessagesCount(user2.id, new MessagesStorage.IntCallback() { // from class: org.telegram.ui.Components.m1
                                                @Override // org.telegram.messenger.MessagesStorage.IntCallback
                                                public final void run(int i11) {
                                                    boolean[] zArr4 = zArr3;
                                                    MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                                    if (i11 >= 50) {
                                                        z4.t(org.telegram.ui.ActionBar.p2.this, z26, true, chat4, user2, false, z27, zArr4[0], z28, booleanCallback3, f6Var2);
                                                    } else if (booleanCallback3 != null) {
                                                        booleanCallback3.run(zArr4[0]);
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                        zArr2 = zArr3;
                                        if (ChatObject.isChannel(chat4) && chat4.creator && !zArr2[0]) {
                                            final ze.c g10 = alertDialog$Builder.a.g(-1, true, true);
                                            g10.d();
                                            TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                                            tL_channels_getFutureCreatorAfterLeave.channel = MessagesController.getInputChannel(chat4);
                                            final int i11 = currentAccount;
                                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                                            org.telegram.messenger.a aVar = new org.telegram.messenger.a();
                                            final Context context = parentActivity;
                                            connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, aVar, new Utilities.Callback2() { // from class: org.telegram.ui.Components.n1
                                                @Override // org.telegram.messenger.Utilities.Callback2
                                                public final void run(Object obj, Object obj2) {
                                                    TLRPC.User user3 = (TLRPC.User) obj;
                                                    ze.c.this.c(false);
                                                    TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                                    MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                                    if (user4 == null) {
                                                        booleanCallback3.run(z24 || zArr2[0]);
                                                        return;
                                                    }
                                                    Context context2 = context;
                                                    TLRPC.Chat chat5 = chat4;
                                                    kf.j0 j0Var = new kf.j0(context2, chat5, user4, i11, booleanCallback3, f6Var2, 8);
                                                    u1 u1Var = new u1(booleanCallback3, 0);
                                                    org.telegram.ui.ActionBar.p2 p2Var3 = p2Var2;
                                                    if (p2Var3 == null || p2Var3.getParentActivity() == null || chat5 == null) {
                                                        return;
                                                    }
                                                    Context context3 = p2Var3.getContext();
                                                    TLRPC.User currentUser = UserConfig.getInstance(p2Var3.getCurrentAccount()).getCurrentUser();
                                                    boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat5);
                                                    FrameLayout frameLayout = new FrameLayout(context3);
                                                    frameLayout.setClipToPadding(false);
                                                    frameLayout.setClipChildren(false);
                                                    p9 p9Var6 = new p9(context3);
                                                    z8 z8Var2 = new z8((org.telegram.ui.ActionBar.f6) null);
                                                    z8Var2.r(currentUser);
                                                    p9Var6.setRoundRadius(AndroidUtilities.dp(30.0f));
                                                    p9Var6.e(currentUser, z8Var2);
                                                    frameLayout.addView(p9Var6, k7.b6.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                                    ImageView imageView = new ImageView(context3);
                                                    imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                                    imageView.setColorFilter(new PorterDuffColorFilter(p2Var3.getThemedColor(org.telegram.ui.ActionBar.j6.d7), PorterDuff.Mode.SRC_IN));
                                                    frameLayout.addView(imageView, k7.b6.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                                    f3 f3Var = new f3(context3);
                                                    z8 z8Var3 = new z8((org.telegram.ui.ActionBar.f6) null);
                                                    z8Var3.r(user4);
                                                    f3Var.setRoundRadius(AndroidUtilities.dp(30.0f));
                                                    f3Var.e(user4, z8Var3);
                                                    frameLayout.addView(f3Var, k7.b6.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                                    p9 p9Var7 = new p9(context3);
                                                    z8 z8Var4 = new z8((org.telegram.ui.ActionBar.f6) null);
                                                    z8Var4.q(chat5);
                                                    p9Var7.setRoundRadius(AndroidUtilities.dp(12.0f));
                                                    p9Var7.e(chat5, z8Var4);
                                                    frameLayout.addView(p9Var7, k7.b6.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                                    org.telegram.ui.ActionBar.d2 d2Var5 = alertDialog$Builder2.a;
                                                    d2Var5.L0 = -1.0f;
                                                    d2Var5.S = frameLayout;
                                                    d2Var5.O = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannelTitle : R.string.LeaveGroupTitle);
                                                    d2Var5.Q = AndroidUtilities.replaceTags(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.LeaveChannelNewOwnerText : R.string.LeaveGroupNewOwnerText, UserObject.getUserName(user4), chat5.title));
                                                    alertDialog$Builder2.h(LocaleController.getString(R.string.AppointNewOwner), new t(j0Var, 4));
                                                    alertDialog$Builder2.i(LocaleController.getString(R.string.Cancel), null);
                                                    alertDialog$Builder2.k(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannel : R.string.LeaveMegaMenu), new t(u1Var, 5));
                                                    d2Var5.show();
                                                    View d = d2Var5.d(-1);
                                                    if (d instanceof TextView) {
                                                        ((TextView) d).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                        booleanCallback2 = booleanCallback2;
                                    }
                                    if (!z24 && !zArr2[0]) {
                                        z25 = false;
                                    }
                                    booleanCallback2.run(z25);
                                }
                            });
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            p2Var.showDialog(d2Var3222);
                            textView = (TextView) d2Var3222.d(-1);
                            if (textView == null) {
                            }
                        }
                    } else if (!ChatObject.isChannel(chat3) || chat3.megagroup) {
                        y1VarArr2[0].e(LocaleController.getString(R.string.DeleteGroupForAll), "", false, false, false);
                    } else {
                        y1VarArr2[0].e(LocaleController.getString(R.string.DeleteChannelForAll), "", false, false, false);
                    }
                    z18 = true;
                    y1VarArr2[0].setMultiline(z18);
                    p9Var2 = p9Var;
                    d2Var = d2Var2;
                    y1VarArr2[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(f11), AndroidUtilities.dp(f10), LocaleController.isRTL ? AndroidUtilities.dp(f11) : AndroidUtilities.dp(16.0f), AndroidUtilities.dp(f10));
                    e3Var.addView(y1VarArr2[0], k7.b6.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                    cg.u0 u0Var2 = new cg.u0(z16, chat3, alertDialog$Builder, zArr);
                    y1VarArr2[0].setOnClickListener(new org.telegram.messenger.video.g(27, zArr, u0Var2));
                    if (z13) {
                    }
                    z17 = z16;
                    if (user == null) {
                    }
                    if (z10) {
                    }
                    if (z10) {
                    }
                    org.telegram.ui.ActionBar.d2 d2Var32222 = d2Var;
                    alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.Components.s2
                        @Override // org.telegram.ui.ActionBar.c2
                        public final void l(org.telegram.ui.ActionBar.d2 d2Var4, int i10) {
                            final boolean[] zArr2;
                            boolean z23 = z19;
                            final boolean z24 = z10;
                            final boolean[] zArr3 = zArr;
                            final MessagesStorage.BooleanCallback booleanCallback2 = booleanCallback;
                            boolean z25 = true;
                            if (z23 || z24 || z11) {
                                zArr2 = zArr3;
                            } else {
                                final TLRPC.User user2 = user;
                                boolean isUserSelf = UserObject.isUserSelf(user2);
                                final org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                                final boolean z26 = z4;
                                final TLRPC.Chat chat4 = chat3;
                                final boolean z27 = z12;
                                final boolean z28 = z14;
                                final org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                                if (isUserSelf) {
                                    z4.t(p2Var2, z26, true, chat4, user2, false, z27, zArr3[0], z28, booleanCallback2, f6Var2);
                                    return;
                                }
                                if (user2 != null && zArr3[0]) {
                                    MessagesStorage.getInstance(p2Var2.getCurrentAccount()).getMessagesCount(user2.id, new MessagesStorage.IntCallback() { // from class: org.telegram.ui.Components.m1
                                        @Override // org.telegram.messenger.MessagesStorage.IntCallback
                                        public final void run(int i11) {
                                            boolean[] zArr4 = zArr3;
                                            MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                            if (i11 >= 50) {
                                                z4.t(org.telegram.ui.ActionBar.p2.this, z26, true, chat4, user2, false, z27, zArr4[0], z28, booleanCallback3, f6Var2);
                                            } else if (booleanCallback3 != null) {
                                                booleanCallback3.run(zArr4[0]);
                                            }
                                        }
                                    });
                                    return;
                                }
                                zArr2 = zArr3;
                                if (ChatObject.isChannel(chat4) && chat4.creator && !zArr2[0]) {
                                    final ze.c g10 = alertDialog$Builder.a.g(-1, true, true);
                                    g10.d();
                                    TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                                    tL_channels_getFutureCreatorAfterLeave.channel = MessagesController.getInputChannel(chat4);
                                    final int i11 = currentAccount;
                                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                                    org.telegram.messenger.a aVar = new org.telegram.messenger.a();
                                    final Context context = parentActivity;
                                    connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, aVar, new Utilities.Callback2() { // from class: org.telegram.ui.Components.n1
                                        @Override // org.telegram.messenger.Utilities.Callback2
                                        public final void run(Object obj, Object obj2) {
                                            TLRPC.User user3 = (TLRPC.User) obj;
                                            ze.c.this.c(false);
                                            TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                            MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                            if (user4 == null) {
                                                booleanCallback3.run(z24 || zArr2[0]);
                                                return;
                                            }
                                            Context context2 = context;
                                            TLRPC.Chat chat5 = chat4;
                                            kf.j0 j0Var = new kf.j0(context2, chat5, user4, i11, booleanCallback3, f6Var2, 8);
                                            u1 u1Var = new u1(booleanCallback3, 0);
                                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var2;
                                            if (p2Var3 == null || p2Var3.getParentActivity() == null || chat5 == null) {
                                                return;
                                            }
                                            Context context3 = p2Var3.getContext();
                                            TLRPC.User currentUser = UserConfig.getInstance(p2Var3.getCurrentAccount()).getCurrentUser();
                                            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat5);
                                            FrameLayout frameLayout = new FrameLayout(context3);
                                            frameLayout.setClipToPadding(false);
                                            frameLayout.setClipChildren(false);
                                            p9 p9Var6 = new p9(context3);
                                            z8 z8Var2 = new z8((org.telegram.ui.ActionBar.f6) null);
                                            z8Var2.r(currentUser);
                                            p9Var6.setRoundRadius(AndroidUtilities.dp(30.0f));
                                            p9Var6.e(currentUser, z8Var2);
                                            frameLayout.addView(p9Var6, k7.b6.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                            ImageView imageView = new ImageView(context3);
                                            imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                            imageView.setColorFilter(new PorterDuffColorFilter(p2Var3.getThemedColor(org.telegram.ui.ActionBar.j6.d7), PorterDuff.Mode.SRC_IN));
                                            frameLayout.addView(imageView, k7.b6.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                            f3 f3Var = new f3(context3);
                                            z8 z8Var3 = new z8((org.telegram.ui.ActionBar.f6) null);
                                            z8Var3.r(user4);
                                            f3Var.setRoundRadius(AndroidUtilities.dp(30.0f));
                                            f3Var.e(user4, z8Var3);
                                            frameLayout.addView(f3Var, k7.b6.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                            p9 p9Var7 = new p9(context3);
                                            z8 z8Var4 = new z8((org.telegram.ui.ActionBar.f6) null);
                                            z8Var4.q(chat5);
                                            p9Var7.setRoundRadius(AndroidUtilities.dp(12.0f));
                                            p9Var7.e(chat5, z8Var4);
                                            frameLayout.addView(p9Var7, k7.b6.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                            org.telegram.ui.ActionBar.d2 d2Var5 = alertDialog$Builder2.a;
                                            d2Var5.L0 = -1.0f;
                                            d2Var5.S = frameLayout;
                                            d2Var5.O = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannelTitle : R.string.LeaveGroupTitle);
                                            d2Var5.Q = AndroidUtilities.replaceTags(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.LeaveChannelNewOwnerText : R.string.LeaveGroupNewOwnerText, UserObject.getUserName(user4), chat5.title));
                                            alertDialog$Builder2.h(LocaleController.getString(R.string.AppointNewOwner), new t(j0Var, 4));
                                            alertDialog$Builder2.i(LocaleController.getString(R.string.Cancel), null);
                                            alertDialog$Builder2.k(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannel : R.string.LeaveMegaMenu), new t(u1Var, 5));
                                            d2Var5.show();
                                            View d = d2Var5.d(-1);
                                            if (d instanceof TextView) {
                                                ((TextView) d).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                                            }
                                        }
                                    });
                                    return;
                                }
                                booleanCallback2 = booleanCallback2;
                            }
                            if (!z24 && !zArr2[0]) {
                                z25 = false;
                            }
                            booleanCallback2.run(z25);
                        }
                    });
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    p2Var.showDialog(d2Var32222);
                    textView = (TextView) d2Var32222.d(-1);
                    if (textView == null) {
                    }
                }
            } else {
                y1VarArr2 = y1VarArr;
                p9Var = p9Var3;
            }
        } else {
            y1VarArr2 = y1VarArr;
            p9Var = p9Var3;
            f10 = 10.0f;
        }
        f11 = 8.0f;
        if (z10) {
        }
        if (z12) {
        }
        chat3 = chat;
        z16 = false;
        if (!z16) {
        }
        org.telegram.ui.Cells.y1 y1Var32 = new org.telegram.ui.Cells.y1(parentActivity, 1, f6Var);
        y1VarArr2[0] = y1Var32;
        y1Var32.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
        if (z16) {
        }
        z18 = true;
        y1VarArr2[0].setMultiline(z18);
        p9Var2 = p9Var;
        d2Var = d2Var2;
        y1VarArr2[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(f11), AndroidUtilities.dp(f10), LocaleController.isRTL ? AndroidUtilities.dp(f11) : AndroidUtilities.dp(16.0f), AndroidUtilities.dp(f10));
        e3Var.addView(y1VarArr2[0], k7.b6.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        cg.u0 u0Var22 = new cg.u0(z16, chat3, alertDialog$Builder, zArr);
        y1VarArr2[0].setOnClickListener(new org.telegram.messenger.video.g(27, zArr, u0Var22));
        if (z13) {
        }
        z17 = z16;
        if (user == null) {
        }
        if (z10) {
        }
        if (z10) {
        }
        org.telegram.ui.ActionBar.d2 d2Var322222 = d2Var;
        alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.Components.s2
            @Override // org.telegram.ui.ActionBar.c2
            public final void l(org.telegram.ui.ActionBar.d2 d2Var4, int i10) {
                final boolean[] zArr2;
                boolean z23 = z19;
                final boolean z24 = z10;
                final boolean[] zArr3 = zArr;
                final MessagesStorage.BooleanCallback booleanCallback2 = booleanCallback;
                boolean z25 = true;
                if (z23 || z24 || z11) {
                    zArr2 = zArr3;
                } else {
                    final TLRPC.User user2 = user;
                    boolean isUserSelf = UserObject.isUserSelf(user2);
                    final org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                    final boolean z26 = z4;
                    final TLRPC.Chat chat4 = chat3;
                    final boolean z27 = z12;
                    final boolean z28 = z14;
                    final org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                    if (isUserSelf) {
                        z4.t(p2Var2, z26, true, chat4, user2, false, z27, zArr3[0], z28, booleanCallback2, f6Var2);
                        return;
                    }
                    if (user2 != null && zArr3[0]) {
                        MessagesStorage.getInstance(p2Var2.getCurrentAccount()).getMessagesCount(user2.id, new MessagesStorage.IntCallback() { // from class: org.telegram.ui.Components.m1
                            @Override // org.telegram.messenger.MessagesStorage.IntCallback
                            public final void run(int i11) {
                                boolean[] zArr4 = zArr3;
                                MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                if (i11 >= 50) {
                                    z4.t(org.telegram.ui.ActionBar.p2.this, z26, true, chat4, user2, false, z27, zArr4[0], z28, booleanCallback3, f6Var2);
                                } else if (booleanCallback3 != null) {
                                    booleanCallback3.run(zArr4[0]);
                                }
                            }
                        });
                        return;
                    }
                    zArr2 = zArr3;
                    if (ChatObject.isChannel(chat4) && chat4.creator && !zArr2[0]) {
                        final ze.c g10 = alertDialog$Builder.a.g(-1, true, true);
                        g10.d();
                        TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                        tL_channels_getFutureCreatorAfterLeave.channel = MessagesController.getInputChannel(chat4);
                        final int i11 = currentAccount;
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                        org.telegram.messenger.a aVar = new org.telegram.messenger.a();
                        final Context context = parentActivity;
                        connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, aVar, new Utilities.Callback2() { // from class: org.telegram.ui.Components.n1
                            @Override // org.telegram.messenger.Utilities.Callback2
                            public final void run(Object obj, Object obj2) {
                                TLRPC.User user3 = (TLRPC.User) obj;
                                ze.c.this.c(false);
                                TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                if (user4 == null) {
                                    booleanCallback3.run(z24 || zArr2[0]);
                                    return;
                                }
                                Context context2 = context;
                                TLRPC.Chat chat5 = chat4;
                                kf.j0 j0Var = new kf.j0(context2, chat5, user4, i11, booleanCallback3, f6Var2, 8);
                                u1 u1Var = new u1(booleanCallback3, 0);
                                org.telegram.ui.ActionBar.p2 p2Var3 = p2Var2;
                                if (p2Var3 == null || p2Var3.getParentActivity() == null || chat5 == null) {
                                    return;
                                }
                                Context context3 = p2Var3.getContext();
                                TLRPC.User currentUser = UserConfig.getInstance(p2Var3.getCurrentAccount()).getCurrentUser();
                                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat5);
                                FrameLayout frameLayout = new FrameLayout(context3);
                                frameLayout.setClipToPadding(false);
                                frameLayout.setClipChildren(false);
                                p9 p9Var6 = new p9(context3);
                                z8 z8Var2 = new z8((org.telegram.ui.ActionBar.f6) null);
                                z8Var2.r(currentUser);
                                p9Var6.setRoundRadius(AndroidUtilities.dp(30.0f));
                                p9Var6.e(currentUser, z8Var2);
                                frameLayout.addView(p9Var6, k7.b6.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                ImageView imageView = new ImageView(context3);
                                imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                imageView.setColorFilter(new PorterDuffColorFilter(p2Var3.getThemedColor(org.telegram.ui.ActionBar.j6.d7), PorterDuff.Mode.SRC_IN));
                                frameLayout.addView(imageView, k7.b6.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                f3 f3Var = new f3(context3);
                                z8 z8Var3 = new z8((org.telegram.ui.ActionBar.f6) null);
                                z8Var3.r(user4);
                                f3Var.setRoundRadius(AndroidUtilities.dp(30.0f));
                                f3Var.e(user4, z8Var3);
                                frameLayout.addView(f3Var, k7.b6.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                p9 p9Var7 = new p9(context3);
                                z8 z8Var4 = new z8((org.telegram.ui.ActionBar.f6) null);
                                z8Var4.q(chat5);
                                p9Var7.setRoundRadius(AndroidUtilities.dp(12.0f));
                                p9Var7.e(chat5, z8Var4);
                                frameLayout.addView(p9Var7, k7.b6.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                org.telegram.ui.ActionBar.d2 d2Var5 = alertDialog$Builder2.a;
                                d2Var5.L0 = -1.0f;
                                d2Var5.S = frameLayout;
                                d2Var5.O = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannelTitle : R.string.LeaveGroupTitle);
                                d2Var5.Q = AndroidUtilities.replaceTags(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.LeaveChannelNewOwnerText : R.string.LeaveGroupNewOwnerText, UserObject.getUserName(user4), chat5.title));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.AppointNewOwner), new t(j0Var, 4));
                                alertDialog$Builder2.i(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder2.k(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannel : R.string.LeaveMegaMenu), new t(u1Var, 5));
                                d2Var5.show();
                                View d = d2Var5.d(-1);
                                if (d instanceof TextView) {
                                    ((TextView) d).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                                }
                            }
                        });
                        return;
                    }
                    booleanCallback2 = booleanCallback2;
                }
                if (!z24 && !zArr2[0]) {
                    z25 = false;
                }
                booleanCallback2.run(z25);
            }
        });
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        p2Var.showDialog(d2Var322222);
        textView = (TextView) d2Var322222.d(-1);
        if (textView == null) {
        }
    }

    public static void t0(int i10, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        if (i10 == 0 || p2Var == null || p2Var.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getParentActivity(), 0, f6Var);
        alertDialog$Builder.a.O = LocaleController.getString(R.string.UnableForward);
        if (i10 == 1) {
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.ErrorSendRestrictedStickers);
        } else if (i10 == 2) {
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.ErrorSendRestrictedMedia);
        } else if (i10 == 3) {
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.ErrorSendRestrictedPolls);
        } else if (i10 == 4) {
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.ErrorSendRestrictedStickersAll);
        } else if (i10 == 5) {
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.ErrorSendRestrictedMediaAll);
        } else if (i10 == 6) {
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.ErrorSendRestrictedPollsAll);
        } else if (i10 == 7) {
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.ErrorSendRestrictedPrivacyVoiceMessages);
        } else if (i10 == 8) {
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.ErrorSendRestrictedPrivacyVideoMessages);
        } else if (i10 == 9) {
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.ErrorSendRestrictedVideoAll);
        } else if (i10 == 10) {
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.ErrorSendRestrictedPhotoAll);
        } else if (i10 == 11) {
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.ErrorSendRestrictedVideo);
        } else if (i10 == 12) {
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.ErrorSendRestrictedPhoto);
        } else if (i10 == 13) {
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.ErrorSendRestrictedVoiceAll);
        } else if (i10 == 14) {
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.ErrorSendRestrictedVoice);
        } else if (i10 == 15) {
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.ErrorSendRestrictedRoundAll);
        } else if (i10 == 16) {
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.ErrorSendRestrictedRound);
        } else if (i10 == 17) {
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.ErrorSendRestrictedDocumentsAll);
        } else if (i10 == 18) {
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.ErrorSendRestrictedDocuments);
        } else if (i10 == 19) {
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.ErrorSendRestrictedMusicAll);
        } else if (i10 == 20) {
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.ErrorSendRestrictedMusic);
        } else if (i10 == 21) {
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.ErrorSendRestrictedTodoAll);
        } else if (i10 == 22) {
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.ErrorSendRestrictedTodo);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        p2Var.showDialog(alertDialog$Builder.a, true, null);
    }

    public static org.telegram.ui.ActionBar.d2 u(Activity activity, final long j10, final long j11, final int i10, final Runnable runnable, org.telegram.ui.ActionBar.f6 f6Var) {
        int i11;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
        final String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j11);
        if (j10 != 0) {
            StringBuilder sb = new StringBuilder("color_");
            sb.append(sharedPrefKey);
            i11 = notificationsSettings.contains(sb.toString()) ? org.telegram.messenger.y3.c("color_", sharedPrefKey, notificationsSettings, -16776961) : DialogObject.isChatDialog(j10) ? notificationsSettings.getInt("GroupLed", -16776961) : notificationsSettings.getInt("MessagesLed", -16776961);
        } else {
            i11 = i10 == 1 ? notificationsSettings.getInt("MessagesLed", -16776961) : i10 == 0 ? notificationsSettings.getInt("GroupLed", -16776961) : i10 == 3 ? notificationsSettings.getInt("StoriesLed", -16776961) : (i10 == 5 || i10 == 4) ? notificationsSettings.getInt("ReactionsLed", -16776961) : notificationsSettings.getInt("ChannelLed", -16776961);
        }
        LinearLayout h = kf.k0.h(activity, 1);
        String[] strArr = {LocaleController.getString(R.string.ColorRed), LocaleController.getString(R.string.ColorOrange), LocaleController.getString(R.string.ColorYellow), LocaleController.getString(R.string.ColorGreen), LocaleController.getString(R.string.ColorCyan), LocaleController.getString(R.string.ColorBlue), LocaleController.getString(R.string.ColorViolet), LocaleController.getString(R.string.ColorPink), LocaleController.getString(R.string.ColorWhite)};
        final int[] iArr = {i11};
        for (int i12 = 0; i12 < 9; i12++) {
            org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(activity, f6Var);
            j6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            j6Var.setTag(Integer.valueOf(i12));
            int i13 = org.telegram.ui.Cells.t8.e[i12];
            j6Var.a(i13, i13);
            j6Var.b(strArr[i12], i11 == org.telegram.ui.Cells.t8.f[i12]);
            h.addView(j6Var);
            j6Var.setOnClickListener(new q0(h, iArr));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, f6Var);
        alertDialog$Builder.a.O = LocaleController.getString(R.string.LedColor);
        alertDialog$Builder.n(h);
        alertDialog$Builder.k(LocaleController.getString(R.string.Set), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.Components.t2
            @Override // org.telegram.ui.ActionBar.c2
            public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i14) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                long j12 = j10;
                int[] iArr2 = iArr;
                if (j12 != 0) {
                    edit.putInt(vh.w2.e("color_", sharedPrefKey), iArr2[0]);
                    NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannel(j12, j11);
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
        alertDialog$Builder.i(LocaleController.getString(R.string.LedDisabled), new k3.d(runnable, i10, j10, 3));
        if (j10 != 0) {
            alertDialog$Builder.h(LocaleController.getString(R.string.Default), new o1(5, sharedPrefKey, runnable));
        }
        return alertDialog$Builder.a;
    }

    public static org.telegram.ui.ActionBar.d2 u0(org.telegram.ui.ActionBar.p2 p2Var, String str, String str2, org.telegram.ui.ActionBar.f6 f6Var) {
        if (p2Var == null) {
            p2Var = LaunchActivity.U();
        }
        if (str2 == null || p2Var == null || p2Var.getParentActivity() == null) {
            return null;
        }
        org.telegram.ui.ActionBar.d2 d2Var = O(p2Var.getParentActivity(), str, str2, null, null, f6Var).a;
        p2Var.showDialog(d2Var);
        return d2Var;
    }

    public static void v(org.telegram.ui.ActionBar.p2 p2Var, String str, String str2, String str3) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getParentActivity());
        String string = LocaleController.getString(R.string.ContactNotRegisteredTitle);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.O = string;
        d2Var.Q = LocaleController.formatString("ContactNotRegistered", R.string.ContactNotRegistered, ContactsController.formatName(str, str2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Invite), new o1(2, str3, p2Var));
        p2Var.showDialog(d2Var);
    }

    public static org.telegram.ui.ActionBar.d2 v0(org.telegram.ui.ActionBar.p2 p2Var, String str, CharSequence charSequence, String str2, boolean z4, Runnable runnable) {
        TextView textView;
        org.telegram.ui.ActionBar.d2 P = P(p2Var.getContext(), p2Var.getResourceProvider(), str, charSequence, str2, runnable);
        p2Var.showDialog(P);
        if (z4 && (textView = (TextView) P.d(-1)) != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
        }
        return P;
    }

    public static AlertDialog$Builder w(Activity activity, final MessagesStorage.IntCallback intCallback) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.m(R.raw.permission_request_contacts, 72, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
        alertDialog$Builder.a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.ContactsPermissionAlert));
        final int i10 = 1;
        alertDialog$Builder.k(LocaleController.getString(R.string.ContactsPermissionAlertContinue), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.Components.o0
            @Override // org.telegram.ui.ActionBar.c2
            public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
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
        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.Components.o0
            @Override // org.telegram.ui.ActionBar.c2
            public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i112) {
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

    public static void w0(org.telegram.ui.ActionBar.p2 p2Var, String str) {
        if (str == null) {
            return;
        }
        Toast.makeText((p2Var == null || p2Var.getParentActivity() == null) ? ApplicationLoader.applicationContext : p2Var.getParentActivity(), str, 1).show();
    }

    public static AlertDialog$Builder x(Context context, int i10, int i11, int i12, int i13, int i14, int i15, String str, final boolean z4, e3.d dVar) {
        if (context == null) {
            return null;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        final xc0 xc0Var = new xc0(context, null);
        final xc0 xc0Var2 = new xc0(context, null);
        final xc0 xc0Var3 = new xc0(context, null);
        linearLayout.addView(xc0Var2, k7.b6.l(0.3f, 0, -2));
        final int i16 = 0;
        xc0Var2.setOnScrollListener(new uc0() { // from class: org.telegram.ui.Components.v1
            @Override // org.telegram.ui.Components.uc0
            public final void k(int i17) {
                switch (i16) {
                    case 0:
                        if (z4 && i17 == 0) {
                            z4.d(xc0Var2, xc0Var, xc0Var3);
                            break;
                        }
                        break;
                    case 1:
                        if (z4 && i17 == 0) {
                            z4.d(xc0Var2, xc0Var, xc0Var3);
                            break;
                        }
                        break;
                    default:
                        if (z4 && i17 == 0) {
                            z4.d(xc0Var2, xc0Var, xc0Var3);
                            break;
                        }
                        break;
                }
            }
        });
        xc0Var.setMinValue(0);
        xc0Var.setMaxValue(11);
        linearLayout.addView(xc0Var, k7.b6.l(0.3f, 0, -2));
        xc0Var.setFormatter(new org.telegram.ui.bs(13));
        xc0Var.setOnValueChangedListener(new m0(xc0Var2, xc0Var, xc0Var3, 1));
        final int i17 = 1;
        xc0Var.setOnScrollListener(new uc0() { // from class: org.telegram.ui.Components.v1
            @Override // org.telegram.ui.Components.uc0
            public final void k(int i172) {
                switch (i17) {
                    case 0:
                        if (z4 && i172 == 0) {
                            z4.d(xc0Var2, xc0Var, xc0Var3);
                            break;
                        }
                        break;
                    case 1:
                        if (z4 && i172 == 0) {
                            z4.d(xc0Var2, xc0Var, xc0Var3);
                            break;
                        }
                        break;
                    default:
                        if (z4 && i172 == 0) {
                            z4.d(xc0Var2, xc0Var, xc0Var3);
                            break;
                        }
                        break;
                }
            }
        });
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i18 = calendar.get(1);
        xc0Var3.setMinValue(i10 + i18);
        xc0Var3.setMaxValue(i11 + i18);
        xc0Var3.setValue(i18 + i12);
        linearLayout.addView(xc0Var3, k7.b6.l(0.4f, 0, -2));
        xc0Var3.setOnValueChangedListener(new m0(xc0Var2, xc0Var, xc0Var3, 2));
        final int i19 = 2;
        xc0Var3.setOnScrollListener(new uc0() { // from class: org.telegram.ui.Components.v1
            @Override // org.telegram.ui.Components.uc0
            public final void k(int i172) {
                switch (i19) {
                    case 0:
                        if (z4 && i172 == 0) {
                            z4.d(xc0Var2, xc0Var, xc0Var3);
                            break;
                        }
                        break;
                    case 1:
                        if (z4 && i172 == 0) {
                            z4.d(xc0Var2, xc0Var, xc0Var3);
                            break;
                        }
                        break;
                    default:
                        if (z4 && i172 == 0) {
                            z4.d(xc0Var2, xc0Var, xc0Var3);
                            break;
                        }
                        break;
                }
            }
        });
        y0(xc0Var2, xc0Var, xc0Var3);
        if (z4) {
            d(xc0Var2, xc0Var, xc0Var3);
        }
        if (i13 != -1) {
            xc0Var2.setValue(i13);
            xc0Var.setValue(i14);
            xc0Var3.setValue(i15);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.a.O = str;
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.k(LocaleController.getString(R.string.Set), new org.telegram.messenger.dk(z4, xc0Var2, xc0Var, xc0Var3, dVar));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.d2 x0(Context context, String str, boolean z4) {
        if (context == null || str == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.O = string;
        d2Var.Q = str;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        if (z4) {
            alertDialog$Builder.h(LocaleController.getString(R.string.UpdateApp), new k0(context, 2));
        }
        return alertDialog$Builder.o();
    }

    public static void y(Context context, String str, String str2, long j10, y4 y4Var) {
        xc0 xc0Var;
        if (context == null) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false);
        int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ji, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ni, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G8, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false);
        int w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false);
        int w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false);
        int w06 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
        org.telegram.ui.ActionBar.b3 b3Var = new org.telegram.ui.ActionBar.b3(context, null);
        b3Var.a();
        xc0 xc0Var2 = new xc0(context, null);
        xc0Var2.setTextColor(w02);
        xc0Var2.setTextOffset(AndroidUtilities.dp(10.0f));
        xc0Var2.setItemCount(5);
        t3 t3Var = new t3(context, null);
        t3Var.setItemCount(5);
        t3Var.setTextColor(w02);
        t3Var.setTextOffset(-AndroidUtilities.dp(10.0f));
        v3 v3Var = new v3(context, null);
        v3Var.setItemCount(5);
        v3Var.setTextColor(w02);
        v3Var.setTextOffset(-AndroidUtilities.dp(34.0f));
        s3 s3Var = new s3(context, xc0Var2, t3Var, v3Var, 1);
        s3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        s3Var.addView(frameLayout, k7.b6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        org.telegram.messenger.y3.t(textView, w02, 1, 20.0f);
        frameLayout.addView(textView, k7.b6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new oh.d(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        s3Var.addView(linearLayout, k7.b6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        gg.q qVar = new gg.q(context, 14);
        linearLayout.addView(xc0Var2, k7.b6.l(0.5f, 0, 270));
        xc0Var2.setMinValue(0);
        xc0Var2.setMaxValue(365);
        xc0Var2.setWrapSelectorWheel(false);
        xc0Var2.setFormatter(new org.telegram.ui.bs(16));
        androidx.car.app.utils.a aVar = new androidx.car.app.utils.a(xc0Var2, t3Var, v3Var, 13);
        xc0Var2.setOnValueChangedListener(aVar);
        t3Var.setMinValue(0);
        t3Var.setMaxValue(23);
        linearLayout.addView(t3Var, k7.b6.l(0.2f, 0, 270));
        t3Var.setFormatter(new org.telegram.ui.bs(17));
        t3Var.setOnValueChangedListener(aVar);
        v3Var.setMinValue(0);
        v3Var.setMaxValue(59);
        v3Var.setValue(0);
        v3Var.setFormatter(new org.telegram.ui.bs(18));
        linearLayout.addView(v3Var, k7.b6.l(0.3f, 0, 270));
        v3Var.setOnValueChangedListener(aVar);
        if (j10 <= 0 || j10 == 2147483646) {
            xc0Var = xc0Var2;
        } else {
            long j11 = j10 * 1000;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j11 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j11);
            if (timeInMillis >= 0) {
                v3Var.setValue(calendar.get(12));
                t3Var.setValue(calendar.get(11));
                xc0Var = xc0Var2;
                xc0Var.setValue(timeInMillis);
            } else {
                xc0Var = xc0Var2;
            }
        }
        xc0 xc0Var3 = xc0Var;
        g(null, null, 0L, 0L, 0, xc0Var3, t3Var, v3Var);
        qVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        qVar.setGravity(17);
        qVar.setTextColor(w04);
        qVar.setTextSize(1, 14.0f);
        qVar.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(8.0f);
        qVar.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, w05, w06, w06));
        qVar.setText(str2);
        s3Var.addView(qVar, k7.b6.t(-1, 48, 83, 16, 15, 16, 16));
        qVar.setOnClickListener(new gg.e(xc0Var3, (xc0) t3Var, (xc0) v3Var, calendar, (Object) y4Var, b3Var, 3));
        b3Var.b(s3Var);
        org.telegram.ui.ActionBar.g3 g3Var = b3Var.a;
        g3Var.show();
        g3Var.setBackgroundColor(w03);
        g3Var.fixNavigationBar(w03);
    }

    public static void y0(xc0 xc0Var, xc0 xc0Var2, xc0 xc0Var3) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2, xc0Var2.getValue());
        calendar.set(1, xc0Var3.getValue());
        xc0Var.setMinValue(1);
        xc0Var.setMaxValue(calendar.getActualMaximum(5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:413:0x020b, code lost:
    
        if (java.lang.Math.abs(r11 - r0.messageOwner.date) > 86400) goto L95;
     */
    /* JADX WARN: Removed duplicated region for block: B:154:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x07e8  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0882  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x094d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0960  */
    /* JADX WARN: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x08bb  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0824  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x06fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void z(final org.telegram.ui.ActionBar.p2 p2Var, final TLRPC.User user, final TLRPC.Chat chat, final TLRPC.EncryptedChat encryptedChat, final TLRPC.ChatFull chatFull, final long j10, final MessageObject messageObject, final SparseArray[] sparseArrayArr, final MessageObject.GroupedMessages groupedMessages, final int i10, final int i11, TLRPC.ChannelParticipant[] channelParticipantArr, final Runnable runnable, Runnable runnable2, final org.telegram.ui.ActionBar.f6 f6Var) {
        Activity parentActivity;
        boolean z4;
        long j11;
        boolean z10;
        boolean z11;
        boolean z12;
        int i12;
        int i13;
        boolean z13;
        boolean z14;
        int i14;
        int i15;
        org.telegram.ui.ActionBar.d2 d2Var;
        int i16;
        boolean z15;
        boolean z16;
        boolean z17;
        org.telegram.ui.Cells.y1 y1Var;
        int i17;
        TLRPC.MessageAction messageAction;
        final boolean z18;
        int i18;
        org.telegram.ui.ActionBar.d2 d2Var2;
        boolean z19;
        String str;
        AlertDialog$Builder alertDialog$Builder;
        TextView textView;
        TextView textView2;
        int i19;
        int i20;
        boolean z20;
        TLRPC.MessageAction messageAction2;
        boolean z21;
        final int i21;
        int i22;
        TLRPC.Message message;
        int i23;
        MessageObject messageObject2 = messageObject;
        boolean z22 = i11 == 1;
        boolean z23 = i11 == 3;
        if (p2Var == null) {
            return;
        }
        if ((user == null && chat == null && encryptedChat == null) || (parentActivity = p2Var.getParentActivity()) == null) {
            return;
        }
        final int currentAccount = p2Var.getCurrentAccount();
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(parentActivity, 0, f6Var);
        float f10 = runnable2 != null ? 0.5f : 0.6f;
        org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder2.a;
        d2Var3.N0 = f10;
        int size = groupedMessages != null ? groupedMessages.messages.size() : messageObject2 != null ? 1 : sparseArrayArr[1].size() + sparseArrayArr[0].size();
        if (encryptedChat != null) {
            z4 = z23;
            j11 = DialogObject.makeEncryptedDialogId(encryptedChat.id);
        } else {
            z4 = z23;
            j11 = user != null ? user.id : -chat.id;
        }
        if (z22) {
            if (messageObject2 != null && (message = messageObject2.messageOwner) != null && (i23 = message.schedule_repeat_period) > 0) {
                i21 = i23;
                i22 = message.date;
            } else if (groupedMessages == null || groupedMessages.messages.isEmpty() || groupedMessages.messages.get(0) == null || groupedMessages.messages.get(0).messageOwner == null || groupedMessages.messages.get(0).messageOwner.schedule_repeat_period <= 0) {
                i21 = 0;
                i22 = 0;
            } else {
                i22 = groupedMessages.messages.get(0).messageOwner.date;
                i21 = groupedMessages.messages.get(0).messageOwner.schedule_repeat_period;
            }
            if (i22 > 0 && i21 > 0) {
                String formatString = LocaleController.formatString(R.string.MessageScheduledRepeatDeletePostponeSeconds, Integer.valueOf(i21));
                if (i21 == 31536000) {
                    formatString = LocaleController.getString(R.string.MessageScheduledRepeatDeletePostponeYear);
                } else if (i21 >= 2592000) {
                    formatString = LocaleController.formatPluralString("MessageScheduledRepeatDeletePostponeMonths", i21 / 2592000, new Object[0]);
                } else if (i21 >= 604800) {
                    formatString = LocaleController.formatPluralString("MessageScheduledRepeatDeletePostponeWeeks", i21 / 604800, new Object[0]);
                } else if (i21 >= 86400) {
                    formatString = LocaleController.formatPluralString("MessageScheduledRepeatDeletePostponeDays", i21 / 86400, new Object[0]);
                }
                String str2 = formatString;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(parentActivity, 0, f6Var);
                String string = LocaleController.getString(R.string.MessageScheduledRepeatDeleteTitle);
                org.telegram.ui.ActionBar.d2 d2Var4 = alertDialog$Builder3.a;
                d2Var4.O = string;
                d2Var4.Q = LocaleController.getString(R.string.MessageScheduledRepeatDeleteText);
                final int i24 = i22;
                alertDialog$Builder3.h(str2, new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.Components.r0
                    @Override // org.telegram.ui.ActionBar.c2
                    public final void l(org.telegram.ui.ActionBar.d2 d2Var5, int i25) {
                        MessageObject.GroupedMessages groupedMessages2 = MessageObject.GroupedMessages.this;
                        int i26 = currentAccount;
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        int i27 = i24;
                        int i28 = i21;
                        if (groupedMessages2 != null && !groupedMessages2.messages.isEmpty()) {
                            SendMessagesHelper.getInstance(i26).editMessage(groupedMessages2.messages.get(0), null, false, p2Var2, null, i27 + i28, i28);
                        } else {
                            SendMessagesHelper.getInstance(i26).editMessage(messageObject, null, false, p2Var2, null, i27 + i28, i28);
                        }
                    }
                });
                final long j12 = j11;
                final boolean z24 = z4;
                alertDialog$Builder3.i(LocaleController.getString(R.string.MessageScheduledRepeatDeleteAll), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.Components.w0
                    @Override // org.telegram.ui.ActionBar.c2
                    public final void l(org.telegram.ui.ActionBar.d2 d2Var5, int i25) {
                        SparseArray[] sparseArrayArr2;
                        ArrayList<Long> arrayList;
                        int i26;
                        long j13;
                        ArrayList<Long> arrayList2;
                        TLRPC.Peer peer;
                        int i27;
                        long j14;
                        ArrayList<Integer> arrayList3;
                        boolean z25 = z24;
                        int i28 = currentAccount;
                        long clientUserId = z25 ? UserConfig.getInstance(i28).getClientUserId() : j12;
                        MessageObject messageObject3 = messageObject;
                        TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                        long j15 = j10;
                        int i29 = i10;
                        int i30 = i11;
                        ArrayList<Long> arrayList4 = null;
                        if (messageObject3 != null) {
                            ArrayList<Integer> arrayList5 = new ArrayList<>();
                            MessageObject.GroupedMessages groupedMessages2 = groupedMessages;
                            if (groupedMessages2 != null) {
                                int i31 = 0;
                                while (i31 < groupedMessages2.messages.size()) {
                                    MessageObject messageObject4 = groupedMessages2.messages.get(i31);
                                    arrayList5.add(Integer.valueOf(messageObject4.getId()));
                                    if (encryptedChat2 != null) {
                                        arrayList3 = arrayList5;
                                        if (messageObject4.messageOwner.random_id == 0 || messageObject4.type == 10) {
                                            i27 = i28;
                                            j14 = clientUserId;
                                        } else {
                                            if (arrayList4 == null) {
                                                arrayList4 = new ArrayList<>();
                                            }
                                            ArrayList<Long> arrayList6 = arrayList4;
                                            i27 = i28;
                                            j14 = clientUserId;
                                            arrayList6.add(Long.valueOf(messageObject4.messageOwner.random_id));
                                            arrayList4 = arrayList6;
                                        }
                                    } else {
                                        i27 = i28;
                                        j14 = clientUserId;
                                        arrayList3 = arrayList5;
                                    }
                                    i31++;
                                    arrayList5 = arrayList3;
                                    i28 = i27;
                                    clientUserId = j14;
                                }
                                i26 = i28;
                                j13 = clientUserId;
                            } else {
                                i26 = i28;
                                j13 = clientUserId;
                                arrayList5.add(Integer.valueOf(messageObject3.getId()));
                                if (encryptedChat2 != null && messageObject3.messageOwner.random_id != 0 && messageObject3.type != 10) {
                                    ArrayList<Long> arrayList7 = new ArrayList<>();
                                    arrayList7.add(Long.valueOf(messageObject3.messageOwner.random_id));
                                    arrayList2 = arrayList7;
                                    MessagesController.getInstance(i26).deleteMessages(arrayList5, arrayList2, encryptedChat2, (j15 == 0 && (peer = messageObject3.messageOwner.peer_id) != null && peer.chat_id == (-j15)) ? j15 : j13, i29, true, i30);
                                }
                            }
                            arrayList2 = arrayList4;
                            MessagesController.getInstance(i26).deleteMessages(arrayList5, arrayList2, encryptedChat2, (j15 == 0 && (peer = messageObject3.messageOwner.peer_id) != null && peer.chat_id == (-j15)) ? j15 : j13, i29, true, i30);
                        } else {
                            long j16 = clientUserId;
                            int i32 = 1;
                            while (i32 >= 0) {
                                ArrayList<Integer> arrayList8 = new ArrayList<>();
                                int i33 = 0;
                                while (true) {
                                    sparseArrayArr2 = sparseArrayArr;
                                    if (i33 >= sparseArrayArr2[i32].size()) {
                                        break;
                                    }
                                    arrayList8.add(Integer.valueOf(sparseArrayArr2[i32].keyAt(i33)));
                                    i33++;
                                }
                                if (encryptedChat2 != null) {
                                    ArrayList<Long> arrayList9 = new ArrayList<>();
                                    for (int i34 = 0; i34 < sparseArrayArr2[i32].size(); i34++) {
                                        MessageObject messageObject5 = (MessageObject) sparseArrayArr2[i32].valueAt(i34);
                                        long j17 = messageObject5.messageOwner.random_id;
                                        if (j17 != 0 && messageObject5.type != 10) {
                                            arrayList9.add(Long.valueOf(j17));
                                        }
                                    }
                                    arrayList = arrayList9;
                                } else {
                                    arrayList = null;
                                }
                                MessagesController.getInstance(i28).deleteMessages(arrayList8, arrayList, encryptedChat2, (i32 != 1 || j15 == 0) ? j16 : j15, i29, true, i30);
                                sparseArrayArr2[i32].clear();
                                i32--;
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
                d2Var4.K = new s0(2, runnable2);
                alertDialog$Builder3.o();
                return;
            }
            messageObject2 = messageObject;
        }
        Runnable runnable3 = runnable2;
        final int i25 = currentAccount;
        int currentTime = ConnectionsManager.getInstance(i25).getCurrentTime();
        MessagesController.getInstance(i25).config.starsSuggestedPostAgeMin.get(TimeUnit.SECONDS);
        if (messageObject2 != null) {
            z11 = !messageObject2.isDice() || Math.abs(currentTime - messageObject2.messageOwner.date) > 86400;
            if (messageObject2.isPaidSuggestedPostProtected()) {
                TLRPC.Message message2 = messageObject2.messageOwner;
                z12 = message2.paid_suggested_post_stars;
                z10 = message2.paid_suggested_post_ton;
            } else {
                z12 = false;
                z10 = false;
            }
        } else {
            int i26 = 0;
            z10 = false;
            boolean z25 = false;
            boolean z26 = false;
            while (i26 < 2) {
                int i27 = 0;
                while (true) {
                    i12 = i26;
                    if (i27 < sparseArrayArr[i26].size()) {
                        MessageObject messageObject3 = (MessageObject) sparseArrayArr[i12].valueAt(i27);
                        if (messageObject3.isDice()) {
                            i13 = i27;
                        } else {
                            i13 = i27;
                        }
                        z25 = true;
                        if (messageObject3.isPaidSuggestedPostProtected()) {
                            TLRPC.Message message3 = messageObject3.messageOwner;
                            z26 |= message3.paid_suggested_post_stars;
                            z10 |= message3.paid_suggested_post_ton;
                        }
                        i27 = i13 + 1;
                        i26 = i12;
                    }
                }
                i26 = i12 + 1;
            }
            z11 = z25;
            z12 = z26;
        }
        boolean z27 = z12;
        if (groupedMessages != null) {
            int i28 = 0;
            while (i28 < groupedMessages.messages.size()) {
                MessageObject messageObject4 = groupedMessages.messages.get(i28);
                if (messageObject4.isPaidSuggestedPostProtected()) {
                    TLRPC.Message message4 = messageObject4.messageOwner;
                    z21 = z11;
                    boolean z28 = z27 | message4.paid_suggested_post_stars;
                    z10 = message4.paid_suggested_post_ton | z10;
                    z27 = z28;
                } else {
                    z21 = z11;
                }
                i28++;
                z11 = z21;
            }
        }
        boolean z29 = z11;
        final boolean[] zArr = new boolean[1];
        boolean z30 = user != null && MessagesController.getInstance(i25).canRevokePmInbox;
        int i29 = user != null ? MessagesController.getInstance(i25).revokeTimePmLimit : MessagesController.getInstance(i25).revokeTimeLimit;
        if (encryptedChat == null && user != null && z30) {
            z13 = z30;
            if (i29 == Integer.MAX_VALUE) {
                z14 = true;
                if (chat != null || !chat.megagroup || z22 || z4) {
                    i14 = i25;
                    if (!z22 || z4 || ChatObject.isChannel(chat) || encryptedChat != null) {
                        i15 = i14;
                        d2Var = d2Var3;
                        i16 = 0;
                        z15 = false;
                    } else {
                        if ((user == null || user.id == UserConfig.getInstance(i14).getClientUserId() || (user.bot && !user.support)) && chat == null) {
                            i15 = i14;
                            i16 = 0;
                            z17 = false;
                        } else if (messageObject2 != null) {
                            i16 = (messageObject2.isSendError() || !((messageAction = messageObject2.messageOwner.action) == null || (messageAction instanceof TLRPC.TL_messageActionEmpty) || (messageAction instanceof TLRPC.TL_messageActionPhoneCall) || (messageAction instanceof TLRPC.TL_messageActionPinMessage) || (messageAction instanceof TLRPC.TL_messageActionGeoProximityReached) || (messageAction instanceof TLRPC.TL_messageActionSetChatTheme)) || (!(messageObject2.isOut() || z13 || ChatObject.hasAdminRights(chat)) || currentTime - messageObject2.messageOwner.date > i29)) ? 0 : 1;
                            z17 = !messageObject2.isOut();
                            i15 = i14;
                        } else {
                            int i30 = 1;
                            z17 = false;
                            int i31 = 0;
                            while (i30 >= 0) {
                                int i32 = 0;
                                while (true) {
                                    i17 = i14;
                                    if (i32 < sparseArrayArr[i30].size()) {
                                        MessageObject messageObject5 = (MessageObject) sparseArrayArr[i30].valueAt(i32);
                                        int i33 = i32;
                                        TLRPC.MessageAction messageAction3 = messageObject5.messageOwner.action;
                                        if ((messageAction3 == null || (messageAction3 instanceof TLRPC.TL_messageActionEmpty) || (messageAction3 instanceof TLRPC.TL_messageActionPhoneCall) || (messageAction3 instanceof TLRPC.TL_messageActionPinMessage) || (messageAction3 instanceof TLRPC.TL_messageActionGeoProximityReached)) && ((messageObject5.isOut() || z13 || (chat != null && ChatObject.canBlockUsers(chat))) && currentTime - messageObject5.messageOwner.date <= i29)) {
                                            i31++;
                                            if (!z17 && !messageObject5.isOut()) {
                                                z17 = true;
                                            }
                                        }
                                        i32 = i33 + 1;
                                        i14 = i17;
                                    }
                                }
                                i30--;
                                i14 = i17;
                            }
                            i15 = i14;
                            i16 = i31;
                        }
                        if (i16 <= 0 || !z29 || (user != null && UserObject.isDeleted(user))) {
                            d2Var = d2Var3;
                            z15 = z17;
                        } else {
                            FrameLayout frameLayout = new FrameLayout(parentActivity);
                            org.telegram.ui.Cells.y1 y1Var2 = new org.telegram.ui.Cells.y1(parentActivity, 1, f6Var);
                            y1Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                            if (z14) {
                                y1Var = y1Var2;
                                y1Var.e(LocaleController.formatString("DeleteMessagesOptionAlso", R.string.DeleteMessagesOptionAlso, UserObject.getFirstName(user)), "", false, false, false);
                            } else {
                                y1Var = y1Var2;
                                if (chat == null || !(z17 || i16 == size)) {
                                    y1Var.e(LocaleController.getString(R.string.DeleteMessagesOption), "", false, false, false);
                                } else {
                                    y1Var.e(LocaleController.getString(R.string.DeleteForAll), "", false, false, false);
                                }
                            }
                            org.telegram.ui.Cells.y1 y1Var3 = y1Var;
                            y1Var3.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                            frameLayout.addView(y1Var3, k7.b6.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                            y1Var3.setOnClickListener(new t0(1, zArr));
                            alertDialog$Builder2.n(frameLayout);
                            d2Var3.D = 9;
                            d2Var = d2Var3;
                            z15 = z17;
                            z16 = true;
                        }
                    }
                    z16 = false;
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
                        i19 = (!messageObject2.isSendError() && messageObject2.getDialogId() == j10 && ((messageAction2 = messageObject2.messageOwner.action) == null || (messageAction2 instanceof TLRPC.TL_messageActionEmpty)) && messageObject2.isOut() && currentTime - messageObject2.messageOwner.date <= i29) ? 1 : 0;
                    } else {
                        int i34 = 1;
                        int i35 = 0;
                        while (i34 >= 0) {
                            int i36 = i35;
                            int i37 = 0;
                            while (i37 < sparseArrayArr[i34].size()) {
                                MessageObject messageObject6 = (MessageObject) sparseArrayArr[i34].valueAt(i37);
                                int i38 = i37;
                                if (i34 == 1 && messageObject6.isOut()) {
                                    TLRPC.Message message5 = messageObject6.messageOwner;
                                    i20 = i34;
                                    if (message5.action == null && currentTime - message5.date <= i29) {
                                        i36++;
                                    }
                                } else {
                                    i20 = i34;
                                }
                                arrayList.add(messageObject6);
                                i37 = i38 + 1;
                                i34 = i20;
                            }
                            i34--;
                            i35 = i36;
                        }
                        i19 = i35;
                    }
                    int i39 = i19;
                    ArrayList arrayList2 = (ArrayList) Collection.-EL.stream(arrayList).filter(new kh.c1(2)).mapToLong(new x0(0)).distinct().mapToObj(new LongFunction() { // from class: org.telegram.ui.Components.y0
                        @Override // java.util.function.LongFunction
                        public final Object apply(long j13) {
                            int i40 = i25;
                            return j13 > 0 ? MessagesController.getInstance(i40).getUser(Long.valueOf(j13)) : MessagesController.getInstance(i40).getChat(Long.valueOf(-j13));
                        }
                    }).filter(new kh.c1(3)).filter(new org.telegram.ui.u8(UserConfig.getInstance(i25).getClientUserId(), 2)).collect(Collectors.toCollection(new org.telegram.ui.zf()));
                    if (!arrayList2.isEmpty()) {
                        if (channelParticipantArr != null) {
                            ds dsVar = new ds(p2Var, chat, arrayList, arrayList2, channelParticipantArr, j10, i10, i11, false, runnable);
                            if (runnable3 != null) {
                                dsVar.setOnHideListener(new s0(0, runnable3));
                            }
                            dsVar.show();
                            return;
                        }
                        final org.telegram.ui.ActionBar.d2[] d2VarArr = {new org.telegram.ui.ActionBar.d2(parentActivity, 3, null)};
                        final int size2 = arrayList2.size();
                        final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[size2];
                        int[] iArr = new int[size2];
                        int[] iArr2 = new int[1];
                        final int i40 = 0;
                        while (i40 < size2) {
                            TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                            tL_channels_getParticipant.channel = MessagesController.getInputChannel(chat);
                            tL_channels_getParticipant.participant = MessagesController.getInputPeer((TLObject) arrayList2.get(i40));
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i25);
                            ArrayList arrayList3 = arrayList2;
                            final int[] iArr3 = iArr2;
                            final int[] iArr4 = iArr;
                            final Runnable runnable4 = runnable3;
                            RequestDelegate requestDelegate = new RequestDelegate() { // from class: org.telegram.ui.Components.a1
                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                                    final int[] iArr5 = iArr3;
                                    final int[] iArr6 = iArr4;
                                    final int i41 = i40;
                                    final TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                    final int i42 = size2;
                                    final org.telegram.ui.ActionBar.d2[] d2VarArr2 = d2VarArr;
                                    final org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                                    final TLRPC.User user2 = user;
                                    final TLRPC.Chat chat2 = chat;
                                    final TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                                    final TLRPC.ChatFull chatFull2 = chatFull;
                                    final long j13 = j10;
                                    final MessageObject messageObject7 = messageObject;
                                    final SparseArray[] sparseArrayArr2 = sparseArrayArr;
                                    final MessageObject.GroupedMessages groupedMessages2 = groupedMessages;
                                    final int i43 = i10;
                                    final int i44 = i11;
                                    final Runnable runnable5 = runnable;
                                    final Runnable runnable6 = runnable4;
                                    final org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.r1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            org.telegram.ui.ActionBar.d2[] d2VarArr3 = d2VarArr2;
                                            int[] iArr7 = iArr5;
                                            iArr7[0] = iArr7[0] + 1;
                                            int[] iArr8 = iArr6;
                                            int i45 = i41;
                                            iArr8[i45] = 0;
                                            TLObject tLObject2 = tLObject;
                                            TLRPC.ChannelParticipant[] channelParticipantArr4 = channelParticipantArr3;
                                            if (tLObject2 != null) {
                                                channelParticipantArr4[i45] = ((TLRPC.TL_channels_channelParticipant) tLObject2).participant;
                                            }
                                            if (iArr7[0] == i42) {
                                                try {
                                                    d2VarArr3[0].dismiss();
                                                } catch (Throwable unused) {
                                                }
                                                d2VarArr3[0] = null;
                                                z4.z(p2Var2, user2, chat2, encryptedChat2, chatFull2, j13, messageObject7, sparseArrayArr2, groupedMessages2, i43, i44, channelParticipantArr4, runnable5, runnable6, f6Var2);
                                            }
                                        }
                                    });
                                }
                            };
                            int i41 = i40;
                            iArr4[i41] = connectionsManager.sendRequest(tL_channels_getParticipant, requestDelegate);
                            runnable3 = runnable2;
                            size2 = size2;
                            iArr = iArr4;
                            iArr2 = iArr3;
                            i40 = i41 + 1;
                            i25 = i25;
                            arrayList2 = arrayList3;
                        }
                        AndroidUtilities.runOnUIThread(new dg.f3(d2VarArr, iArr, i25, runnable2, p2Var, 15), 1000L);
                        return;
                    }
                    if (i39 <= 0 || !z29) {
                        z20 = false;
                    } else {
                        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                        org.telegram.ui.Cells.y1 y1Var4 = new org.telegram.ui.Cells.y1(parentActivity, 1, f6Var);
                        y1Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                        y1Var4.e(LocaleController.getString(R.string.DeleteMessagesOption), "", false, false, false);
                        int i42 = 0;
                        y1Var4.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                        frameLayout2.addView(y1Var4, k7.b6.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                        y1Var4.setOnClickListener(new t0(i42, zArr));
                        alertDialog$Builder2.n(frameLayout2);
                        d2Var3.D = 9;
                        z20 = true;
                    }
                    d2Var = d2Var3;
                    z16 = z20;
                    i15 = i25;
                    i16 = i39;
                    z15 = false;
                }
                final int i43 = i15;
                org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                int i44 = i16;
                final long j13 = j11;
                int i45 = size;
                boolean z31 = z10;
                z18 = z4;
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.Components.v0
                    @Override // org.telegram.ui.ActionBar.c2
                    public final void l(org.telegram.ui.ActionBar.d2 d2Var6, int i46) {
                        SparseArray[] sparseArrayArr2;
                        ArrayList<Long> arrayList4;
                        int i47;
                        long j14;
                        long j15;
                        ArrayList arrayList5;
                        TLRPC.Peer peer;
                        int i48;
                        long j16;
                        boolean z32 = z18;
                        int i49 = i43;
                        long clientUserId = z32 ? UserConfig.getInstance(i49).getClientUserId() : j13;
                        MessageObject messageObject7 = messageObject;
                        TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                        long j17 = j10;
                        int i50 = i10;
                        boolean[] zArr2 = zArr;
                        int i51 = i11;
                        ArrayList<Long> arrayList6 = null;
                        if (messageObject7 != null) {
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList<Integer> arrayList8 = new ArrayList<>();
                            MessageObject.GroupedMessages groupedMessages2 = groupedMessages;
                            if (groupedMessages2 != null) {
                                int i52 = 0;
                                while (i52 < groupedMessages2.messages.size()) {
                                    MessageObject messageObject8 = groupedMessages2.messages.get(i52);
                                    if (messageObject8.isEphemeral()) {
                                        arrayList7.add(messageObject8);
                                        i48 = i49;
                                    } else {
                                        i48 = i49;
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
                                            i52++;
                                            i49 = i48;
                                            clientUserId = j16;
                                        }
                                    }
                                    j16 = clientUserId;
                                    i52++;
                                    i49 = i48;
                                    clientUserId = j16;
                                }
                                i47 = i49;
                                j14 = clientUserId;
                            } else {
                                i47 = i49;
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
                                MessagesController.getInstance(i47).deleteMessages(arrayList8, arrayList6, encryptedChat2, j15, i50, zArr2[0], i51);
                            }
                            int size3 = arrayList5.size();
                            int i53 = 0;
                            while (i53 < size3) {
                                Object obj = arrayList5.get(i53);
                                i53++;
                                MessagesController.getInstance(i47).deleteEphemeralMessage(j15, i50, (MessageObject) obj);
                            }
                        } else {
                            long j19 = clientUserId;
                            int i54 = 1;
                            while (i54 >= 0) {
                                ArrayList<Integer> arrayList11 = new ArrayList<>();
                                int i55 = 0;
                                while (true) {
                                    sparseArrayArr2 = sparseArrayArr;
                                    if (i55 >= sparseArrayArr2[i54].size()) {
                                        break;
                                    }
                                    arrayList11.add(Integer.valueOf(sparseArrayArr2[i54].keyAt(i55)));
                                    i55++;
                                }
                                if (encryptedChat2 != null) {
                                    ArrayList<Long> arrayList12 = new ArrayList<>();
                                    int i56 = 0;
                                    while (i56 < sparseArrayArr2[i54].size()) {
                                        MessageObject messageObject9 = (MessageObject) sparseArrayArr2[i54].valueAt(i56);
                                        int i57 = i54;
                                        long j20 = messageObject9.messageOwner.random_id;
                                        if (j20 != 0 && messageObject9.type != 10) {
                                            arrayList12.add(Long.valueOf(j20));
                                        }
                                        i56++;
                                        i54 = i57;
                                    }
                                    arrayList4 = arrayList12;
                                } else {
                                    arrayList4 = null;
                                }
                                int i58 = i54;
                                MessagesController.getInstance(i49).deleteMessages(arrayList11, arrayList4, encryptedChat2, (i58 != 1 || j17 == 0) ? j19 : j17, i50, zArr2[0], i51);
                                sparseArrayArr2[i58].clear();
                                i54 = i58 - 1;
                            }
                        }
                        Runnable runnable5 = runnable;
                        if (runnable5 != null) {
                            runnable5.run();
                        }
                    }
                };
                if (z18) {
                    i18 = i45;
                    d2Var2 = d2Var5;
                    if (i18 == 1) {
                        d2Var2.O = LocaleController.getString(R.string.DeleteSingleMessagesTitle);
                    } else {
                        d2Var2.O = LocaleController.formatString(R.string.DeleteMessagesTitle, LocaleController.formatPluralString("messages", i18, new Object[0]));
                    }
                } else {
                    i18 = i45;
                    if (i18 == 1) {
                        d2Var2 = d2Var5;
                        d2Var2.O = LocaleController.getString(R.string.UnsaveSingleMessagesTitle);
                    } else {
                        d2Var2 = d2Var5;
                        d2Var2.O = LocaleController.formatString(R.string.UnsaveMessagesTitle, LocaleController.formatPluralString("messages", i18, new Object[0]));
                    }
                }
                if (z18) {
                    if (chat == null || !z15) {
                        if (!z16 || z14 || i44 == i18) {
                            if (chat == null || !chat.megagroup || z22) {
                                if (i18 == 1) {
                                    d2Var2.Q = LocaleController.getString(R.string.AreYouSureDeleteSingleMessage);
                                } else {
                                    d2Var2.Q = LocaleController.getString(R.string.AreYouSureDeleteFewMessages);
                                }
                            } else if (i18 == 1) {
                                d2Var2.Q = LocaleController.getString((messageObject == null || !messageObject.isEphemeral()) ? R.string.AreYouSureDeleteSingleMessageMega : R.string.AreYouSureDeleteSingleMessage);
                            } else {
                                d2Var2.Q = LocaleController.getString(R.string.AreYouSureDeleteFewMessagesMega);
                            }
                        } else if (chat != null) {
                            d2Var2.Q = LocaleController.formatString("DeleteMessagesTextGroup", R.string.DeleteMessagesTextGroup, LocaleController.formatPluralString("messages", i44, new Object[0]));
                        } else {
                            d2Var2.Q = AndroidUtilities.replaceTags(LocaleController.formatString("DeleteMessagesText", R.string.DeleteMessagesText, LocaleController.formatPluralString("messages", i44, new Object[0]), UserObject.getFirstName(user)));
                        }
                    } else if (z16 && i44 != i18) {
                        d2Var2.Q = LocaleController.formatString(R.string.DeleteMessagesTextGroupPart, LocaleController.formatPluralString("messages", i44, new Object[0]));
                    } else if (i18 == 1) {
                        d2Var2.Q = LocaleController.getString(R.string.AreYouSureDeleteSingleMessage);
                    } else {
                        d2Var2.Q = LocaleController.getString(R.string.AreYouSureDeleteFewMessages);
                    }
                } else if (i18 == 1) {
                    d2Var2.Q = LocaleController.getString(R.string.AreYouSureUnsaveSingleMessage);
                } else {
                    d2Var2.Q = LocaleController.getString(R.string.AreYouSureUnsaveFewMessages);
                }
                if (messageObject == null) {
                    z19 = messageObject.isGiveaway() && !messageObject.isForwarded();
                    if (z19) {
                        long j14 = ((TLRPC.TL_messageMediaGiveaway) messageObject.messageOwner.media).until_date * 1000;
                        str = LocaleController.getInstance().getFormatterGiveawayMonthDayYear().format(new Date(j14));
                        z19 = System.currentTimeMillis() < j14;
                    }
                    str = null;
                } else if (i18 == 1) {
                    boolean z32 = false;
                    str = null;
                    for (int i46 = 1; i46 >= 0; i46--) {
                        for (int i47 = 0; i47 < sparseArrayArr[i46].size(); i47++) {
                            MessageObject messageObject7 = (MessageObject) sparseArrayArr[i46].valueAt(i47);
                            boolean z33 = messageObject7.isGiveaway() && !messageObject7.isForwarded();
                            if (z33) {
                                long j15 = ((TLRPC.TL_messageMediaGiveaway) messageObject7.messageOwner.media).until_date * 1000;
                                str = LocaleController.getInstance().getFormatterGiveawayMonthDayYear().format(new Date(j15));
                                z32 = System.currentTimeMillis() < j15;
                            } else {
                                z32 = z33;
                            }
                        }
                    }
                    z19 = z32;
                } else {
                    z19 = false;
                    str = null;
                }
                if (z27) {
                    alertDialog$Builder = alertDialog$Builder2;
                    if (z31) {
                        int i48 = (int) MessagesController.getInstance(i43).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS);
                        d2Var2.O = LocaleController.getString(R.string.SuggestionTONWillBeLost);
                        d2Var2.Q = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestionTONWillBeLostInfo, Integer.valueOf(i48)));
                        alertDialog$Builder.k(LocaleController.getString(R.string.SuggestionStarsWillBeLostDelete), c2Var);
                    } else if (!z19 || z18) {
                        alertDialog$Builder.k(LocaleController.getString(z18 ? R.string.Remove : R.string.Delete), c2Var);
                    } else {
                        d2Var2.O = LocaleController.getString(R.string.BoostingGiveawayDeleteMsgTitle);
                        d2Var2.Q = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BoostingGiveawayDeleteMsgText, str));
                        alertDialog$Builder.i(LocaleController.getString(R.string.Delete), c2Var);
                    }
                } else {
                    int i49 = (int) MessagesController.getInstance(i43).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS);
                    d2Var2.O = LocaleController.getString(R.string.SuggestionStarsWillBeLost);
                    d2Var2.Q = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestionStarsWillBeLostInfo, Integer.valueOf(i49)));
                    alertDialog$Builder = alertDialog$Builder2;
                    alertDialog$Builder.k(LocaleController.getString(R.string.SuggestionStarsWillBeLostDelete), c2Var);
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                d2Var2.K = new s0(1, runnable2);
                p2Var.showDialog(d2Var2);
                textView = (TextView) d2Var2.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                }
                textView2 = (TextView) d2Var2.d(-3);
                if (textView2 == null) {
                    d2Var2.q0.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f));
                    ((ViewGroup.MarginLayoutParams) d2Var2.q0.getLayoutParams()).topMargin = AndroidUtilities.dp(-8.0f);
                    textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                    return;
                }
                return;
            }
        } else {
            z13 = z30;
        }
        z14 = false;
        if (chat != null) {
        }
        i14 = i25;
        if (z22) {
        }
        i15 = i14;
        d2Var = d2Var3;
        i16 = 0;
        z15 = false;
        z16 = false;
        final int i432 = i15;
        org.telegram.ui.ActionBar.d2 d2Var52 = d2Var;
        int i442 = i16;
        final long j132 = j11;
        int i452 = size;
        boolean z312 = z10;
        z18 = z4;
        org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.Components.v0
            @Override // org.telegram.ui.ActionBar.c2
            public final void l(org.telegram.ui.ActionBar.d2 d2Var6, int i462) {
                SparseArray[] sparseArrayArr2;
                ArrayList<Long> arrayList4;
                int i472;
                long j142;
                long j152;
                ArrayList arrayList5;
                TLRPC.Peer peer;
                int i482;
                long j16;
                boolean z322 = z18;
                int i492 = i432;
                long clientUserId = z322 ? UserConfig.getInstance(i492).getClientUserId() : j132;
                MessageObject messageObject72 = messageObject;
                TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                long j17 = j10;
                int i50 = i10;
                boolean[] zArr2 = zArr;
                int i51 = i11;
                ArrayList<Long> arrayList6 = null;
                if (messageObject72 != null) {
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList<Integer> arrayList8 = new ArrayList<>();
                    MessageObject.GroupedMessages groupedMessages2 = groupedMessages;
                    if (groupedMessages2 != null) {
                        int i52 = 0;
                        while (i52 < groupedMessages2.messages.size()) {
                            MessageObject messageObject8 = groupedMessages2.messages.get(i52);
                            if (messageObject8.isEphemeral()) {
                                arrayList7.add(messageObject8);
                                i482 = i492;
                            } else {
                                i482 = i492;
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
                                    i52++;
                                    i492 = i482;
                                    clientUserId = j16;
                                }
                            }
                            j16 = clientUserId;
                            i52++;
                            i492 = i482;
                            clientUserId = j16;
                        }
                        i472 = i492;
                        j142 = clientUserId;
                    } else {
                        i472 = i492;
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
                        j152 = j18;
                        arrayList5 = arrayList7;
                    } else {
                        arrayList5 = arrayList7;
                        j152 = j18;
                        MessagesController.getInstance(i472).deleteMessages(arrayList8, arrayList6, encryptedChat2, j152, i50, zArr2[0], i51);
                    }
                    int size3 = arrayList5.size();
                    int i53 = 0;
                    while (i53 < size3) {
                        Object obj = arrayList5.get(i53);
                        i53++;
                        MessagesController.getInstance(i472).deleteEphemeralMessage(j152, i50, (MessageObject) obj);
                    }
                } else {
                    long j19 = clientUserId;
                    int i54 = 1;
                    while (i54 >= 0) {
                        ArrayList<Integer> arrayList11 = new ArrayList<>();
                        int i55 = 0;
                        while (true) {
                            sparseArrayArr2 = sparseArrayArr;
                            if (i55 >= sparseArrayArr2[i54].size()) {
                                break;
                            }
                            arrayList11.add(Integer.valueOf(sparseArrayArr2[i54].keyAt(i55)));
                            i55++;
                        }
                        if (encryptedChat2 != null) {
                            ArrayList<Long> arrayList12 = new ArrayList<>();
                            int i56 = 0;
                            while (i56 < sparseArrayArr2[i54].size()) {
                                MessageObject messageObject9 = (MessageObject) sparseArrayArr2[i54].valueAt(i56);
                                int i57 = i54;
                                long j20 = messageObject9.messageOwner.random_id;
                                if (j20 != 0 && messageObject9.type != 10) {
                                    arrayList12.add(Long.valueOf(j20));
                                }
                                i56++;
                                i54 = i57;
                            }
                            arrayList4 = arrayList12;
                        } else {
                            arrayList4 = null;
                        }
                        int i58 = i54;
                        MessagesController.getInstance(i492).deleteMessages(arrayList11, arrayList4, encryptedChat2, (i58 != 1 || j17 == 0) ? j19 : j17, i50, zArr2[0], i51);
                        sparseArrayArr2[i58].clear();
                        i54 = i58 - 1;
                    }
                }
                Runnable runnable5 = runnable;
                if (runnable5 != null) {
                    runnable5.run();
                }
            }
        };
        if (z18) {
        }
        if (z18) {
        }
        if (messageObject == null) {
        }
        if (z27) {
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        d2Var2.K = new s0(1, runnable2);
        p2Var.showDialog(d2Var2);
        textView = (TextView) d2Var2.d(-1);
        if (textView != null) {
        }
        textView2 = (TextView) d2Var2.d(-3);
        if (textView2 == null) {
        }
    }
}
