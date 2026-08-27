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
import org.telegram.ui.ld1;
import org.telegram.ui.tg1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class y4 {
    public static final Pattern a = Pattern.compile("^([a-zA-Z][a-zA-Z0-9+\\-.]*://)?([a-zA-Z0-9\\-]+\\.)+[a-zA-Z]{2,}(:\\d+)?(/[^\\s]*)?$");

    public static AlertDialog$Builder A(Context context) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String readRes = AndroidUtilities.readRes(R.raw.pip_voice_request);
        t20 t20Var = new t20(0, context, true);
        t20Var.setImportantForAccessibility(2);
        ag.p1 p1Var = new ag.p1(context, t20Var);
        p1Var.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-15128003, -15118002}));
        p1Var.setClipToOutline(true);
        p1Var.setOutlineProvider(new cg.l1(11));
        View view = new View(context);
        view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(readRes, AndroidUtilities.dp(320.0f), AndroidUtilities.dp(184.61539f), false)));
        p1Var.addView(view, h7.z5.d(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
        p1Var.addView(t20Var, h7.z5.c(117.0f, 117));
        alertDialog$Builder.a.R = p1Var;
        alertDialog$Builder.a.N = LocaleController.getString(R.string.PermissionDrawAboveOtherAppsGroupCallTitle);
        alertDialog$Builder.a.P = LocaleController.getString(R.string.PermissionDrawAboveOtherAppsGroupCall);
        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new j0(context, 3));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.f0 = true;
        b2Var.P0 = false;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.a.K0 = 0.5769231f;
        return alertDialog$Builder;
    }

    public static AlertDialog$Builder B(Activity activity, tg1 tg1Var, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        String readRes = AndroidUtilities.readRes(R.raw.pip_video_request);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-14535089, -14527894}));
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new cg.l1(10));
        View view = new View(activity);
        view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(readRes, AndroidUtilities.dp(320.0f), AndroidUtilities.dp(161.36752f), false)));
        frameLayout.addView(view, h7.z5.d(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
        alertDialog$Builder.a.R = frameLayout;
        alertDialog$Builder.a.N = LocaleController.getString(R.string.PermissionDrawAboveOtherAppsTitle);
        alertDialog$Builder.a.P = LocaleController.getString(R.string.PermissionDrawAboveOtherApps);
        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new eh.q(5, activity, z10));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.f0 = true;
        b2Var.P0 = false;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), tg1Var);
        alertDialog$Builder.a.K0 = 0.50427353f;
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.b2 C(LaunchActivity launchActivity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.LowDiskSpaceTitle);
        alertDialog$Builder.a.P = LocaleController.getString(R.string.LowDiskSpaceMessage2);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.LowDiskSpaceButton), new f1(launchActivity, 1));
        return alertDialog$Builder.a;
    }

    public static org.telegram.ui.ActionBar.b2 D(Activity activity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
        alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new j0(activity, 1));
        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
        return alertDialog$Builder.a;
    }

    public static org.telegram.ui.ActionBar.b2 E(Activity activity, boolean z10, TLRPC.User user, MessagesStorage.IntCallback intCallback, org.telegram.ui.ActionBar.c6 c6Var) {
        int[] iArr = new int[1];
        String[] strArr = {LocaleController.getString(R.string.SendLiveLocationFor15m), LocaleController.getString(R.string.SendLiveLocationFor1h), LocaleController.getString(R.string.SendLiveLocationFor8h), LocaleController.getString(R.string.SendLiveLocationForever)};
        LinearLayout f10 = org.telegram.messenger.y1.f(activity, 1);
        f10.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
        TextView textView = new TextView(activity);
        if (z10) {
            textView.setText(LocaleController.getString(R.string.LiveLocationAlertExpandMessage));
        } else if (user != null) {
            textView.setText(LocaleController.formatString(R.string.LiveLocationAlertPrivate, UserObject.getFirstName(user)));
        } else {
            textView.setText(LocaleController.getString(R.string.LiveLocationAlertGroup));
        }
        int i10 = org.telegram.ui.ActionBar.g6.j5;
        textView.setTextColor(c6Var != null ? c6Var.q0(i10) : org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        f10.addView(textView, h7.z5.t(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 24, z10 ? 4 : 0, 24, 8));
        int i11 = 0;
        while (i11 < 4) {
            org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(activity, c6Var);
            h6Var.d = 42;
            h6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            h6Var.setTag(Integer.valueOf(i11));
            int i12 = org.telegram.ui.ActionBar.g6.g7;
            int q02 = c6Var != null ? c6Var.q0(i12) : org.telegram.ui.ActionBar.g6.w0(null, i12, false);
            int i13 = org.telegram.ui.ActionBar.g6.E5;
            h6Var.a(q02, c6Var != null ? c6Var.q0(i13) : org.telegram.ui.ActionBar.g6.w0(null, i13, false));
            h6Var.b(strArr[i11], iArr[0] == i11);
            f10.addView(h6Var);
            h6Var.setOnClickListener(new p0(iArr, f10));
            i11++;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, c6Var);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        if (z10) {
            b2Var.N = LocaleController.getString(R.string.LiveLocationAlertExpandTitle);
        } else {
            int q03 = c6Var != null ? c6Var.q0(org.telegram.ui.ActionBar.g6.L5) : org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false);
            b2Var.X = new tp0(activity, 0);
            b2Var.Y = q03;
        }
        alertDialog$Builder.n(f10);
        alertDialog$Builder.k(LocaleController.getString(R.string.ShareFile), new jh.z1(29, iArr, intCallback));
        alertDialog$Builder.i(LocaleController.getString(R.string.Cancel), null);
        return b2Var;
    }

    public static org.telegram.ui.ActionBar.e3 F(final long j10, final long j11, final org.telegram.ui.ActionBar.n2 n2Var, final org.telegram.ui.ActionBar.c6 c6Var) {
        if (n2Var.getParentActivity() == null) {
            return null;
        }
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(n2Var.getParentActivity(), c6Var, false, false);
        e3Var.fixNavigationBar();
        e3Var.title = LocaleController.getString(R.string.Notifications);
        e3Var.bigTitle = true;
        CharSequence[] charSequenceArr = {LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Hours", 1, new Object[0])), LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Hours", 8, new Object[0])), LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Days", 2, new Object[0])), LocaleController.getString(R.string.MuteDisable)};
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Components.k0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                int i11 = i10 == 0 ? 0 : i10 == 1 ? 1 : i10 == 2 ? 2 : 3;
                NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(j10, j11, i11);
                org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                if (mc.a(n2Var2)) {
                    mc.z(n2Var2, i11, 0, c6Var).j();
                }
            }
        };
        e3Var.items = charSequenceArr;
        e3Var.onClickListener = onClickListener;
        return e3Var;
    }

    public static void G(Context context, org.telegram.ui.ActionBar.c6 c6Var, x4 x4Var) {
        if (context == null) {
            return;
        }
        int i10 = 0;
        int i11 = org.telegram.ui.ActionBar.g6.j5;
        int q02 = c6Var != null ? c6Var.q0(i11) : org.telegram.ui.ActionBar.g6.w0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.g6.h5;
        int q03 = c6Var != null ? c6Var.q0(i12) : org.telegram.ui.ActionBar.g6.w0(null, i12, false);
        int i13 = org.telegram.ui.ActionBar.g6.Ji;
        if (c6Var != null) {
            c6Var.q0(i13);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.g6.Ni;
        if (c6Var != null) {
            c6Var.q0(i14);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.g6.E8;
        if (c6Var != null) {
            c6Var.q0(i15);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.g6.G8;
        if (c6Var != null) {
            c6Var.q0(i16);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.g6.i6;
        if (c6Var != null) {
            c6Var.q0(i17);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i17, false);
        }
        int i18 = org.telegram.ui.ActionBar.g6.Sh;
        int q04 = c6Var != null ? c6Var.q0(i18) : org.telegram.ui.ActionBar.g6.w0(null, i18, false);
        int i19 = org.telegram.ui.ActionBar.g6.Oh;
        int q05 = c6Var != null ? c6Var.q0(i19) : org.telegram.ui.ActionBar.g6.w0(null, i19, false);
        int q06 = c6Var != null ? c6Var.q0(org.telegram.ui.ActionBar.g6.Qh) : org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false);
        org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(context, c6Var);
        z2Var.a();
        int[] iArr = {30, 60, 120, 180, 480, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        h4 h4Var = new h4(context, c6Var, iArr);
        h4Var.setMinValue(0);
        h4Var.setMaxValue(20);
        h4Var.setTextColor(q02);
        h4Var.setValue(0);
        h4Var.setFormatter(new e1(i10, iArr));
        d4 d4Var = new d4(context, h4Var, 1);
        d4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        d4Var.addView(frameLayout, h7.z5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.MuteForAlert));
        textView.setTextColor(q02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, h7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new kh.e(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        d4Var.addView(linearLayout, h7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        cg.q qVar = new cg.q(context, 20);
        linearLayout.addView(h4Var, h7.z5.l(1.0f, 0, 270));
        h4Var.setOnValueChangedListener(new org.telegram.ui.fr(15));
        qVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        qVar.setGravity(17);
        qVar.setTextColor(q04);
        qVar.setTextSize(1, 14.0f);
        qVar.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(8.0f);
        qVar.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, q05, q06, q06));
        qVar.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
        d4Var.addView(qVar, h7.z5.t(-1, 48, 83, 16, 15, 16, 16));
        qVar.setOnClickListener(new gh.a4(iArr, h4Var, x4Var, z2Var, 7));
        z2Var.b(d4Var);
        org.telegram.ui.ActionBar.e3 e3Var = z2Var.a;
        e3Var.show();
        e3Var.setBackgroundColor(q03);
        e3Var.fixNavigationBar(q03);
    }

    public static AlertDialog$Builder H(Context context, String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.a.N = str;
        HashMap hashMap = new HashMap();
        int i10 = org.telegram.ui.ActionBar.g6.L5;
        hashMap.put("info1", Integer.valueOf(org.telegram.ui.ActionBar.g6.w0(null, i10, false)));
        hashMap.put("info2", Integer.valueOf(org.telegram.ui.ActionBar.g6.w0(null, i10, false)));
        alertDialog$Builder.m(R.raw.not_available, 52, org.telegram.ui.ActionBar.g6.w0(null, i10, false), hashMap);
        alertDialog$Builder.a.S = true;
        alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
        alertDialog$Builder.a.P = str2;
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.b2 I(Activity activity, long j10, final long j11, int i10, final Runnable runnable, org.telegram.ui.ActionBar.c6 c6Var) {
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
        LinearLayout f10 = org.telegram.messenger.y1.f(activity, 1);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, c6Var);
        int i14 = 0;
        while (i14 < strArr2.length) {
            org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(activity, c6Var);
            h6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            h6Var.setTag(Integer.valueOf(i14));
            h6Var.a(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.g7, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E5, c6Var));
            h6Var.b(strArr2[i14], iArr[0] == i14);
            f10.addView(h6Var);
            h6Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.a3
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
                    alertDialog$Builder.a.H0.run();
                    runnable.run();
                }
            });
            i14++;
            j12 = j10;
            i11 = i10;
        }
        alertDialog$Builder.a.N = LocaleController.getString(R.string.NotificationsImportance);
        alertDialog$Builder.n(f10);
        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.a;
    }

    public static void J(int i10, Activity activity, long j10, TLRPC.Photo photo, jh.b bVar) {
        if (activity != null) {
            gh.w wVar = new gh.w(i10, j10, photo, activity, bVar);
            org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(activity, bVar, true, false);
            e3Var.fixNavigationBar();
            e3Var.title = LocaleController.getString(R.string.ReportProfilePhoto);
            e3Var.bigTitle = true;
            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.ReportChatSpam), LocaleController.getString(R.string.ReportChatFakeAccount), LocaleController.getString(R.string.ReportChatViolence), LocaleController.getString(R.string.ReportChatChild), LocaleController.getString(R.string.ReportChatIllegalDrugs), LocaleController.getString(R.string.ReportChatPersonalDetails), LocaleController.getString(R.string.ReportChatPornography), LocaleController.getString(R.string.ReportChatOther)};
            int[] iArr = {R.drawable.msg_clearcache, R.drawable.msg_report_fake, R.drawable.msg_report_violence, R.drawable.msg_block2, R.drawable.msg_report_drugs, R.drawable.msg_report_personal, R.drawable.msg_report_xxx, R.drawable.msg_report_other};
            w2 w2Var = new w2(new int[]{0, 6, 1, 2, 3, 4, 5, 100}, activity, bVar, wVar, 0);
            e3Var.items = charSequenceArr;
            e3Var.itemIcons = iArr;
            e3Var.onClickListener = w2Var;
            e3Var.show();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [org.telegram.ui.yf] */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.View, org.telegram.ui.Components.fc0, org.telegram.ui.Components.q3] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r15v0, types: [android.view.View, org.telegram.ui.Components.fc0] */
    /* JADX WARN: Type inference failed for: r15v14, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r2v20, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View, org.telegram.ui.Components.fc0, org.telegram.ui.Components.p3] */
    /* JADX WARN: Type inference failed for: r4v10, types: [android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v8, types: [org.telegram.ui.yf] */
    public static org.telegram.ui.ActionBar.z2 K(final Context context, final long j10, long j11, int i10, boolean z10, final x4 x4Var, Runnable runnable, w4 w4Var, org.telegram.ui.ActionBar.c6 c6Var) {
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
        org.telegram.ui.ActionBar.v0 v0Var;
        Calendar calendar;
        char c10;
        int i13;
        int[] iArr;
        String[] strArr;
        org.telegram.ui.ActionBar.v0 v0Var2;
        ri0 ri0Var;
        oi0 oi0Var;
        Calendar calendar2;
        int[] iArr2;
        int i14;
        ViewGroup viewGroup3;
        String[] strArr2;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        final org.telegram.ui.ActionBar.e3 e3Var;
        ri0 ri0Var2;
        int i15;
        TLRPC.User user;
        TLRPC.UserStatus userStatus;
        if (context == null) {
            return null;
        }
        final int[] iArr3 = {i10};
        long clientUserId = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
        final org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(context, c6Var);
        z2Var.a();
        final ?? fc0Var = new fc0(context, c6Var);
        int i16 = w4Var.a;
        int i17 = w4Var.c;
        int i18 = w4Var.b;
        fc0Var.setTextColor(i16);
        fc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        fc0Var.setItemCount(5);
        final ?? p3Var = new p3(context, c6Var);
        p3Var.setWrapSelectorWheel(true);
        p3Var.setAllItemsCount(24);
        p3Var.setItemCount(5);
        p3Var.setTextColor(i16);
        p3Var.setTextOffset(-AndroidUtilities.dp(10.0f));
        final ?? q3Var = new q3(context, c6Var);
        q3Var.setWrapSelectorWheel(true);
        q3Var.setAllItemsCount(60);
        q3Var.setItemCount(5);
        q3Var.setTextColor(i16);
        q3Var.setTextOffset(-AndroidUtilities.dp(34.0f));
        ?? frameLayout3 = new FrameLayout(context);
        r3 r3Var = new r3(context, fc0Var, p3Var, q3Var, 0);
        r3Var.setClipToPadding(false);
        r3Var.setClipChildren(false);
        r3Var.setOrientation(1);
        frameLayout3.addView(r3Var, h7.z5.c(-1.0f, -1));
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout3.addView(frameLayout4, h7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
        ViewGroup frameLayout5 = new FrameLayout(context);
        r3Var.addView(frameLayout5, h7.z5.t(-1, -2, 51, 22, 0, 0, 4));
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
        org.telegram.messenger.y1.s(textView5, i16, 1, 20.0f);
        frameLayout5.addView(textView5, h7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView5.setOnTouchListener(new kh.e(10));
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
            r11 = r3Var;
            v0Var = null;
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
            r11 = r3Var;
            textView = null;
            i11 = i18;
            zArr = zArr2;
            v0Var = new org.telegram.ui.ActionBar.v0(context, null, 0, w4Var.a, false, c6Var);
            context2 = context;
            v0Var.setLongClickEnabled(false);
            v0Var.setSubMenuOpenSide(2);
            v0Var.setIcon(R.drawable.ic_ab_other);
            v0Var.setBackground(org.telegram.ui.ActionBar.g6.f0(i17, 1, -1));
            viewGroup2.addView(v0Var, h7.z5.d(40, 40.0f, 53, 0.0f, 8.0f, 5.0f, 0.0f));
            v0Var.g(1, LocaleController.formatString(R.string.ScheduleWhenOnline, firstName));
            v0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        }
        if (v0Var != null) {
            v0Var.setOnClickListener(new nh.x1(29, v0Var, w4Var));
            v0Var.setDelegate(new ag.l0(x4Var, zArr, z2Var, 18));
        }
        ri0 ri0Var3 = new ri0(context2);
        oi0 oi0Var2 = new oi0(R.raw.notify_toggle, "notify_toggle", AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        oi0Var2.H(true);
        oi0Var2.h = true;
        oi0Var2.start();
        oi0Var2.K(40);
        oi0Var2.N(40);
        ri0Var3.setScaleType(ImageView.ScaleType.CENTER);
        ri0Var3.setAnimation(oi0Var2);
        ri0Var3.setColorFilter(new PorterDuffColorFilter(i16, PorterDuff.Mode.SRC_IN));
        ri0Var3.setBackground(org.telegram.ui.ActionBar.g6.f0(i17, 1, i12));
        viewGroup2.addView(ri0Var3, h7.z5.d(40, 40.0f, 53, 0.0f, 8.0f, (v0Var != null ? 42 : 0) + 8, 0.0f));
        ?? linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(r82);
        linearLayout.setWeightSum(1.0f);
        r11.addView(linearLayout, h7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar3 = Calendar.getInstance();
        final cg.q qVar = new cg.q(context2, 15);
        org.telegram.ui.ActionBar.v0 v0Var3 = v0Var;
        linearLayout.addView(fc0Var, h7.z5.l(0.5f, r82, 270));
        fc0Var.setMinValue(r82);
        fc0Var.setMaxValue(365);
        fc0Var.setWrapSelectorWheel(r82);
        fc0Var.setFormatter(new c2(5));
        ViewGroup viewGroup4 = r11;
        final boolean[] zArr3 = zArr;
        final long j13 = j12;
        int i19 = i11;
        dc0 dc0Var = new dc0() { // from class: org.telegram.ui.Components.i2
            @Override // org.telegram.ui.Components.dc0
            public final void m(fc0 fc0Var2, int i20) {
                y4.g(cg.q.this, null, 0L, 0L, j13 == j10 ? 1 : 0, fc0Var, p3Var, q3Var);
            }
        };
        fc0Var.setOnValueChangedListener(dc0Var);
        p3Var.setMinValue(r82);
        p3Var.setMaxValue(23);
        linearLayout.addView(p3Var, h7.z5.l(0.2f, r82, 270));
        p3Var.setFormatter(new c2(6));
        p3Var.setOnValueChangedListener(dc0Var);
        q3Var.setMinValue(r82);
        q3Var.setMaxValue(59);
        q3Var.setValue(r82);
        q3Var.setFormatter(new c2(7));
        linearLayout.addView(q3Var, h7.z5.l(0.3f, r82, 270));
        q3Var.setOnValueChangedListener(dc0Var);
        if (j11 <= 0 || j11 == 2147483646) {
            calendar = calendar3;
        } else {
            long j14 = 1000 * j11;
            calendar = calendar3;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j14 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j14);
            if (timeInMillis >= 0) {
                q3Var.setValue(calendar.get(12));
                p3Var.setValue(calendar.get(11));
                fc0Var.setValue(timeInMillis);
            }
        }
        final boolean[] zArr4 = {true};
        g(qVar, null, 0L, 0L, j13 == j10 ? 1 : 0, fc0Var, p3Var, q3Var);
        boolean isTestBackend = ConnectionsManager.getInstance(UserConfig.selectedAccount).isTestBackend();
        if (isTestBackend) {
            c10 = '\t';
            i13 = 10;
            iArr = new int[]{0, 60, 300, 86400, 604800, 1209600, 2592000, 7862400, 15724800, 31536000};
        } else {
            c10 = '\t';
            i13 = 10;
            iArr = new int[]{0, 86400, 604800, 1209600, 2592000, 7862400, 15724800, 31536000};
        }
        if (isTestBackend) {
            strArr = new String[i13];
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
            v0Var2 = v0Var3;
            ri0Var = ri0Var3;
            oi0Var = oi0Var2;
            calendar2 = calendar;
            iArr2 = iArr;
            i14 = i19;
            viewGroup3 = viewGroup4;
            strArr2 = strArr;
            textView2 = textView;
            textView3 = textView2;
            textView4 = textView3;
        } else {
            ?? frameLayout6 = new FrameLayout(context2);
            calendar2 = calendar;
            i14 = i19;
            int v = org.telegram.ui.ActionBar.g6.v(i14, org.telegram.ui.ActionBar.g6.l1(0.075f, i16));
            String[] strArr3 = strArr;
            int l1 = org.telegram.ui.ActionBar.g6.l1(0.1f, i16);
            textView4 = new TextView(context2);
            ri0Var = ri0Var3;
            oi0Var = oi0Var2;
            textView4.setTextSize(1, 13.0f);
            textView4.setTextColor(i16);
            textView4.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            int dp = AndroidUtilities.dp(14.0f);
            int v4 = org.telegram.ui.ActionBar.g6.v(v, l1);
            textView4.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, v, v4, v4));
            textView4.setGravity(17);
            v0Var2 = v0Var3;
            int[] iArr4 = iArr;
            strArr2 = strArr3;
            ?? yfVar = new org.telegram.ui.yf(iArr4, iArr3, strArr2, textView4, 12);
            iArr2 = iArr4;
            yfVar.run();
            frameLayout6.addView(textView4, h7.z5.d(-2, 28.0f, 1, 32.0f, 4.0f, 32.0f, 5.0f));
            ?? r22 = viewGroup4;
            r22.addView(frameLayout6, h7.z5.n(-1, -2));
            textView3 = yfVar;
            textView2 = frameLayout6;
            viewGroup3 = r22;
        }
        qVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        qVar.setGravity(17);
        qVar.setTextColor(w4Var.g);
        qVar.setTextSize(1, 14.0f);
        qVar.setTypeface(AndroidUtilities.bold());
        qVar.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{24.0f}, w4Var.h));
        viewGroup3.addView(qVar, h7.z5.t(-1, 48, 83, 16, 15, 16, 16));
        final Calendar calendar4 = calendar2;
        qVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.j2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Runnable runnable2;
                zArr4[0] = false;
                int i20 = j13 == j10 ? 1 : 0;
                fc0 fc0Var2 = fc0Var;
                p3 p3Var2 = p3Var;
                q3 q3Var2 = q3Var;
                boolean g10 = y4.g(null, null, 0L, 0L, i20, fc0Var2, p3Var2, q3Var2);
                long currentTimeMillis = System.currentTimeMillis();
                Calendar calendar5 = calendar4;
                calendar5.setTimeInMillis(currentTimeMillis);
                calendar5.add(6, fc0Var2.getValue());
                calendar5.set(11, p3Var2.getValue());
                calendar5.set(12, q3Var2.getValue());
                if (g10) {
                    calendar5.set(13, 0);
                    calendar5.set(14, 0);
                }
                x4Var.I((int) (calendar5.getTimeInMillis() / 1000), iArr3[0], zArr3[0]);
                runnable2 = z2Var.a.dismissRunnable;
                runnable2.run();
            }
        });
        z2Var.b(viewGroup);
        String[] strArr4 = strArr2;
        org.telegram.ui.ActionBar.e3 e3Var2 = z2Var.a;
        e3Var2.show();
        e3Var2.setOnDismissListener(new k2(runnable, zArr4));
        e3Var2.setBackgroundColor(i14);
        e3Var2.fixNavigationBar(i14);
        if (textView4 != null) {
            ri0Var2 = ri0Var;
            i15 = 1;
            e3Var = e3Var2;
            textView4.setOnClickListener(new y1(frameLayout2, c6Var, e3Var2, (FrameLayout) textView2, iArr2, strArr4, iArr3, (org.telegram.ui.yf) textView3));
        } else {
            e3Var = e3Var2;
            ri0Var2 = ri0Var;
            i15 = 1;
        }
        final lh.w3[] w3VarArr = new lh.w3[i15];
        final org.telegram.ui.ActionBar.v0 v0Var4 = v0Var2;
        final oi0 oi0Var3 = oi0Var;
        ri0Var2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.b2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String string;
                boolean[] zArr5 = zArr3;
                boolean z11 = zArr5[0];
                zArr5[0] = !z11;
                oi0 oi0Var4 = oi0Var3;
                if (z11) {
                    if (oi0Var4.X < 40) {
                        oi0Var4.K(40);
                    }
                    oi0Var4.N(80);
                    oi0Var4.start();
                } else {
                    if (oi0Var4.X >= 40) {
                        oi0Var4.K(0);
                    }
                    oi0Var4.N(40);
                    oi0Var4.start();
                }
                lh.w3[] w3VarArr2 = w3VarArr;
                lh.w3 w3Var = w3VarArr2[0];
                if (w3Var != null) {
                    w3Var.e(true);
                    w3VarArr2[0] = null;
                }
                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                long j15 = j10;
                TLRPC.User user2 = messagesController.getUser(Long.valueOf(j15));
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j15));
                lh.w3 w3Var2 = new lh.w3(context, 3);
                w3VarArr2[0] = w3Var2;
                w3Var2.s();
                w3Var2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                w3Var2.r(20.0f);
                float dp2 = AndroidUtilities.dp(12.0f);
                float dp3 = AndroidUtilities.dp(4.0f);
                int l12 = org.telegram.ui.ActionBar.g6.l1(0.25f, -16777216);
                w3Var2.e0 = dp2;
                w3Var2.f0 = dp3;
                w3Var2.g0 = l12;
                w3Var2.B.setShadowLayer(dp2, 0.0f, dp3, l12);
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    string = LocaleController.getString(zArr5[0] ? R.string.ScheduleNotifyOnChannel : R.string.ScheduleNotifyOffChannel);
                } else if (chat != null || user2 == null) {
                    string = LocaleController.getString(zArr5[0] ? R.string.ScheduleNotifyOnGroup : R.string.ScheduleNotifyOffGroup);
                } else if (j15 == j13) {
                    string = LocaleController.getString(zArr5[0] ? R.string.ScheduleNotifyOnSelf : R.string.ScheduleNotifyOffSelf);
                } else {
                    string = LocaleController.formatString(zArr5[0] ? R.string.ScheduleNotifyOnChat : R.string.ScheduleNotifyOffChat, UserObject.getForcedFirstName(user2));
                }
                w3Var2.t(string);
                w3Var2.d = 5000L;
                w3Var2.m(1.0f, -((v0Var4 != null ? 42 : -8) + 20));
                w3Var2.h0 = new bg(w3Var2, 2);
                org.telegram.ui.ActionBar.e3 e3Var3 = e3Var;
                e3Var3.getContainerView().setClipToPadding(false);
                e3Var3.getContainerView().setClipChildren(false);
                e3Var3.getContainerView().addView(w3Var2, h7.z5.d(-1, 200.0f, 48, 0.0f, -194.0f, 0.0f, 0.0f));
                w3Var2.v();
            }
        });
        return z2Var;
    }

    public static void L(Context context, long j10, x4 x4Var) {
        K(context, j10, -1L, 0, false, x4Var, null, new w4(null), null);
    }

    public static void M(Context context, long j10, x4 x4Var, org.telegram.ui.ActionBar.c6 c6Var) {
        K(context, j10, -1L, 0, false, x4Var, null, new w4(c6Var), c6Var);
    }

    public static AlertDialog$Builder N(Context context, String str, String str2) {
        return O(context, str, str2, null, null, null);
    }

    public static AlertDialog$Builder O(Context context, String str, String str2, String str3, Runnable runnable, org.telegram.ui.ActionBar.c6 c6Var) {
        if (context == null || str2 == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        if (str == null) {
            str = LocaleController.getString(R.string.AppName);
        }
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.N = str;
        b2Var.P = str2;
        if (str3 == null) {
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            return alertDialog$Builder;
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(str3, new y0(6, runnable));
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.b2 P(Context context, org.telegram.ui.ActionBar.c6 c6Var, String str, CharSequence charSequence, String str2, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.N = str;
        b2Var.P = charSequence;
        alertDialog$Builder.k(str2, new y0(5, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.a;
    }

    public static org.telegram.ui.ActionBar.n1 Q(org.telegram.ui.ActionBar.n2 n2Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, View view, float f10, float f11) {
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
        n1Var.showAtLocation(view.getRootView(), 0, (int) ((f12 + f10) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() / 2.0f)), (int) ((f13 + f11) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() / 2.0f)));
        n1Var.b();
        return n1Var;
    }

    public static void R(Context context, org.telegram.ui.ActionBar.n2 n2Var, String str, String str2, String str3, String str4, int i10, String str5, org.telegram.ui.ActionBar.c6 c6Var, MessagesStorage.StringCallback stringCallback) {
        Activity findActivity = AndroidUtilities.findActivity(context);
        View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        String string = str == null ? LocaleController.getString(R.string.AppName) : str;
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.N = string;
        b2Var.P = str2;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i11 = org.telegram.ui.ActionBar.g6.j5;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Xh, c6Var));
        editTextBoldCursor.setHint(str3);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setInputType(147457);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setMaxLines(10);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(11.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q6, c6Var));
        if (str4 != null) {
            editTextBoldCursor.setText(str4);
        }
        editTextBoldCursor.setOnEditorActionListener(new z1(editTextBoldCursor, i10, stringCallback, b2VarArr, currentFocus, 0));
        editTextBoldCursor.addTextChangedListener(new t3(i10, editTextBoldCursor));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
        gradientDrawable.setColor(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(i11, c6Var)));
        editTextBoldCursor.setBackground(gradientDrawable);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(editTextBoldCursor, h7.z5.k(20.0f, 9.0f, 20.0f, 9.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.a.a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
        alertDialog$Builder.k(str5, new c3.d(editTextBoldCursor, i10, stringCallback, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.fr(25));
        b2VarArr[0] = alertDialog$Builder.a;
        if (n2Var != null) {
            AndroidUtilities.requestAdjustNothing(findActivity, n2Var.getClassGuid());
        }
        org.telegram.ui.ActionBar.b2 b2Var2 = b2VarArr[0];
        b2Var2.d0 = false;
        b2Var2.setOnDismissListener(new gh.j(editTextBoldCursor, n2Var, findActivity, 4));
        b2VarArr[0].setOnShowListener(new d1(1, editTextBoldCursor));
        b2VarArr[0].show();
        editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
    }

    public static void S(Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.c6 c6Var, MessagesStorage.StringCallback stringCallback) {
        R(context, n2Var, LocaleController.getString(R.string.StoriesAlbumCreateNew), LocaleController.getString(R.string.StoriesAlbumAddHint), LocaleController.getString(R.string.StoriesAlbumTitleInputHint), null, 12, LocaleController.getString(R.string.Create), c6Var, stringCallback);
    }

    public static org.telegram.ui.ActionBar.z2 T(Context context, long j10, final x4 x4Var, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        int i11;
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.j5, false);
        int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.h5, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ji, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ni, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G8, false);
        int i12 = org.telegram.ui.ActionBar.g6.i6;
        org.telegram.ui.ActionBar.g6.w0(null, i12, false);
        int w04 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false);
        int w05 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false);
        if (context == null) {
            return null;
        }
        final org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(context, c6Var);
        z2Var.a();
        final fc0 fc0Var = new fc0(context, c6Var);
        fc0Var.setTextColor(w02);
        fc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        fc0Var.setItemCount(5);
        final o4 o4Var = new o4(context, c6Var);
        o4Var.setWrapSelectorWheel(true);
        o4Var.setAllItemsCount(24);
        o4Var.setItemCount(5);
        o4Var.setTextColor(w02);
        o4Var.setTextOffset(-AndroidUtilities.dp(10.0f));
        final p4 p4Var = new p4(context, c6Var);
        p4Var.setWrapSelectorWheel(true);
        p4Var.setAllItemsCount(60);
        p4Var.setItemCount(5);
        p4Var.setTextColor(w02);
        p4Var.setTextOffset(-AndroidUtilities.dp(34.0f));
        r3 r3Var = new r3(context, fc0Var, o4Var, p4Var, 5);
        r3Var.setOrientation(1);
        LinearLayout g10 = org.telegram.messenger.y1.g(context, 1);
        r3Var.addView(g10, h7.z5.t(-1, -2, 51, 22, 0, 22, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(i10 == 1 ? R.string.SuggestedPostAcceptTitle : R.string.PostSuggestionsAddTime));
        textView.setTextColor(w02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        g10.addView(textView, h7.z5.t(-2, -2, 51, 0, 12, 0, 0));
        textView.setOnTouchListener(new kh.e(10));
        TextView textView2 = new TextView(context);
        org.telegram.messenger.rl.l(org.telegram.ui.ActionBar.g6.z6, c6Var, textView2, 1, 14.0f);
        textView2.setText(LocaleController.getString(R.string.PostSuggestionsAddTimeHint));
        g10.addView(textView2, h7.z5.t(-2, -2, 51, 0, 2, 0, 0));
        textView2.setOnTouchListener(new kh.e(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        r3Var.addView(linearLayout, h7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long currentTimeMillis = System.currentTimeMillis();
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i13 = calendar.get(1);
        AppGlobalConfig.ConfigTime configTime = MessagesController.getInstance(UserConfig.selectedAccount).config.starsSuggestedPostFutureMin;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        final long j11 = configTime.get(timeUnit) * 2;
        final long j12 = MessagesController.getInstance(UserConfig.selectedAccount).config.starsSuggestedPostFutureMax.get(timeUnit) - 86400;
        final cg.q qVar = new cg.q(context, 21);
        linearLayout.addView(fc0Var, h7.z5.l(0.5f, 0, 270));
        fc0Var.setMinValue(0);
        fc0Var.setMaxValue(365);
        fc0Var.setWrapSelectorWheel(false);
        fc0Var.setFormatter(new h3.y(i13, 3));
        final int i14 = i10 == 1 ? 5 : 3;
        dc0 dc0Var = new dc0() { // from class: org.telegram.ui.Components.u1
            @Override // org.telegram.ui.Components.dc0
            public final void m(fc0 fc0Var2, int i15) {
                y4.g(cg.q.this, null, j11, j12, i14, fc0Var, o4Var, p4Var);
            }
        };
        fc0Var.setOnValueChangedListener(dc0Var);
        o4Var.setMinValue(0);
        o4Var.setMaxValue(23);
        linearLayout.addView(o4Var, h7.z5.l(0.2f, 0, 270));
        o4Var.setFormatter(new org.telegram.ui.fr(20));
        o4Var.setOnValueChangedListener(dc0Var);
        p4Var.setMinValue(0);
        p4Var.setMaxValue(59);
        p4Var.setValue(0);
        p4Var.setFormatter(new org.telegram.ui.fr(21));
        linearLayout.addView(p4Var, h7.z5.l(0.3f, 0, 270));
        p4Var.setOnValueChangedListener(dc0Var);
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
                p4Var.setValue(calendar.get(12));
                o4Var.setValue(calendar.get(11));
                fc0Var.setValue(timeInMillis);
            }
        }
        final boolean[] zArr = {true};
        g(qVar, null, j11, j12, i14, fc0Var, o4Var, p4Var);
        qVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        int i15 = 17;
        qVar.setGravity(17);
        qVar.setTextColor(w04);
        qVar.setTextSize(1, 14.0f);
        qVar.setTypeface(AndroidUtilities.bold());
        qVar.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{8.0f}, w05));
        r3Var.addView(qVar, h7.z5.t(-1, 48, 83, 16, 15, 16, 4));
        final int i16 = i14;
        qVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.v1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Runnable runnable;
                zArr[0] = false;
                long j14 = j11;
                long j15 = j12;
                int i17 = i16;
                fc0 fc0Var2 = fc0Var;
                o4 o4Var2 = o4Var;
                p4 p4Var2 = p4Var;
                boolean g11 = y4.g(null, null, j14, j15, i17, fc0Var2, o4Var2, p4Var2);
                long epochMilli = LocalDate.now().plusDays(fc0Var2.getValue()).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
                Calendar calendar2 = calendar;
                calendar2.setTimeInMillis(epochMilli);
                calendar2.set(11, o4Var2.getValue());
                calendar2.set(12, p4Var2.getValue());
                if (g11) {
                    calendar2.set(13, 0);
                }
                x4Var.I((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                runnable = z2Var.a.dismissRunnable;
                runnable.run();
            }
        });
        h7.b6.b(qVar, 0.02f, 1.2f);
        cg.q qVar2 = new cg.q(context, 22);
        qVar2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        qVar2.setGravity(17);
        qVar2.setText(LocaleController.getString(i10 == 1 ? R.string.MessageSuggestionPublishNow : R.string.PostSuggestionsAnytime));
        qVar2.setTextColor(w05);
        qVar2.setTextSize(1, 14.0f);
        int dp = AndroidUtilities.dp(8.0f);
        int w06 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false);
        int w07 = org.telegram.ui.ActionBar.g6.w0(null, i12, false);
        qVar2.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, w06, w07, w07));
        r3Var.addView(qVar2, h7.z5.t(-1, 48, 83, 16, 0, 16, 16));
        qVar2.setOnClickListener(new gg.f(zArr, x4Var, z2Var, i15));
        h7.b6.b(qVar2, 0.02f, 1.2f);
        z2Var.b(r3Var);
        org.telegram.ui.ActionBar.e3 e3Var = z2Var.a;
        e3Var.show();
        e3Var.setOnDismissListener(new lh.e1(zArr));
        e3Var.setBackgroundColor(i11);
        e3Var.fixNavigationBar(i11);
        return z2Var;
    }

    public static org.telegram.ui.ActionBar.b2 U(org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        if (n2Var == null || n2Var.getParentActivity() == null) {
            return null;
        }
        p80 p80Var = new p80(n2Var.getParentActivity(), n2Var.getResourceProvider());
        SpannableString spannableString = new SpannableString(Html.fromHtml(LocaleController.getString(R.string.AskAQuestionInfo).replace("\n", "<br>")));
        for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new g4(n2Var, uRLSpan.getURL()), spanStart, spanEnd, 0);
        }
        p80Var.setText(spannableString);
        p80Var.setTextSize(1, 16.0f);
        p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.k5, c6Var));
        p80Var.setHighlightColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.l5, c6Var));
        p80Var.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
        p80Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.j5, c6Var));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity(), 0, c6Var);
        alertDialog$Builder.n(p80Var);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.AskAQuestion);
        alertDialog$Builder.k(LocaleController.getString(R.string.AskButton), new n2(1, n2Var));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.a;
    }

    public static AlertDialog$Builder V(Context context, TLRPC.EncryptedChat encryptedChat, org.telegram.ui.ActionBar.c6 c6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.MessageLifetime);
        fc0 fc0Var = new fc0(context, null);
        fc0Var.setMinValue(0);
        fc0Var.setMaxValue(20);
        int i10 = encryptedChat.ttl;
        if (i10 > 0 && i10 < 16) {
            fc0Var.setValue(i10);
        } else if (i10 == 30) {
            fc0Var.setValue(16);
        } else if (i10 == 60) {
            fc0Var.setValue(17);
        } else if (i10 == 3600) {
            fc0Var.setValue(18);
        } else if (i10 == 86400) {
            fc0Var.setValue(19);
        } else if (i10 == 604800) {
            fc0Var.setValue(20);
        } else if (i10 == 0) {
            fc0Var.setValue(0);
        }
        fc0Var.setFormatter(new c2(11));
        alertDialog$Builder.n(fc0Var);
        alertDialog$Builder.h(LocaleController.getString(R.string.Done), new g1(4, encryptedChat, fc0Var));
        return alertDialog$Builder;
    }

    public static void W(org.telegram.ui.ActionBar.n2 n2Var, int i10, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.e6 e6Var) {
        int i11;
        String sb2;
        if (n2Var.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = n2Var.getParentActivity();
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(parentActivity);
        String str = null;
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.u5, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.v5, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.NewTheme);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Create), new c2(12));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        TextView textView = new TextView(parentActivity);
        if (i10 != 0) {
            org.telegram.messenger.y1.p(R.string.EnterThemeNameEdit, textView);
        } else {
            textView.setText(LocaleController.getString(R.string.EnterThemeName));
        }
        textView.setTextSize(1, 16.0f);
        textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
        int i12 = org.telegram.ui.ActionBar.g6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        linearLayout.addView(textView, h7.z5.n(-1, -2));
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        linearLayout.addView(editTextBoldCursor, h7.z5.t(-1, 36, 51, 24, 6, 24, 0));
        editTextBoldCursor.setOnEditorActionListener(new o2(0));
        List asList = Arrays.asList("Ancient", "Antique", "Autumn", "Baby", "Barely", "Baroque", "Blazing", "Blushing", "Bohemian", "Bubbly", "Burning", "Buttered", "Classic", "Clear", "Cool", "Cosmic", "Cotton", "Cozy", "Crystal", "Dark", "Daring", "Darling", "Dawn", "Dazzling", "Deep", "Deepest", "Delicate", "Delightful", "Divine", "Double", "Downtown", "Dreamy", "Dusky", "Dusty", "Electric", "Enchanted", "Endless", "Evening", "Fantastic", "Flirty", "Forever", "Frigid", "Frosty", "Frozen", "Gentle", "Heavenly", "Hyper", "Icy", "Infinite", "Innocent", "Instant", "Luscious", "Lunar", "Lustrous", "Magic", "Majestic", "Mambo", "Midnight", "Millenium", "Morning", "Mystic", "Natural", "Neon", "Night", "Opaque", "Paradise", "Perfect", "Perky", "Polished", "Powerful", "Rich", "Royal", "Sheer", "Simply", "Sizzling", "Solar", "Sparkling", "Splendid", "Spicy", "Spring", "Stellar", "Sugared", "Summer", "Sunny", "Super", "Sweet", "Tender", "Tenacious", "Tidal", "Toasted", "Totally", "Tranquil", "Tropical", "True", "Twilight", "Twinkling", "Ultimate", "Ultra", "Velvety", "Vibrant", "Vintage", "Virtual", "Warm", "Warmest", "Whipped", "Wild", "Winsome");
        List asList2 = Arrays.asList("Ambrosia", "Attack", "Avalanche", "Blast", "Bliss", "Blossom", "Blush", "Burst", "Butter", "Candy", "Carnival", "Charm", "Chiffon", "Cloud", "Comet", "Delight", "Dream", "Dust", "Fantasy", "Flame", "Flash", "Fire", "Freeze", "Frost", "Glade", "Glaze", "Gleam", "Glimmer", "Glitter", "Glow", "Grande", "Haze", "Highlight", "Ice", "Illusion", "Intrigue", "Jewel", "Jubilee", "Kiss", "Lights", "Lollypop", "Love", "Luster", "Madness", "Matte", "Mirage", "Mist", "Moon", "Muse", "Myth", "Nectar", "Nova", "Parfait", "Passion", "Pop", "Rain", "Reflection", "Rhapsody", "Romance", "Satin", "Sensation", "Silk", "Shine", "Shadow", "Shimmer", "Sky", "Spice", "Star", "Sugar", "Sunrise", "Sunset", "Sun", "Twist", "Unbound", "Velvet", "Vibrant", "Waters", "Wine", "Wink", "Wonder", "Zone");
        HashMap hashMap = new HashMap();
        s3.c.m(9306112, hashMap, "Berry", 14598550, "Brandy");
        s3.c.m(8391495, hashMap, "Cherry", 16744272, "Coral");
        s3.c.m(14372985, hashMap, "Cranberry", 14423100, "Crimson");
        s3.c.m(14725375, hashMap, "Mauve", 16761035, "Pink");
        s3.c.m(16711680, hashMap, "Red", 16711807, "Rose");
        s3.c.m(8406555, hashMap, "Russet", 16720896, "Scarlet");
        s3.c.m(15856113, hashMap, "Seashell", 16724889, "Strawberry");
        s3.c.m(16760576, hashMap, "Amber", 15438707, "Apricot");
        s3.c.m(16508850, hashMap, "Banana", 10601738, "Citrus");
        s3.c.m(11560192, hashMap, "Ginger", 16766720, "Gold");
        s3.c.m(16640272, hashMap, "Lemon", 16753920, "Orange");
        s3.c.m(16770484, hashMap, "Peach", 16739155, "Persimmon");
        s3.c.m(14996514, hashMap, "Sunflower", 15893760, "Tangerine");
        s3.c.m(16763004, hashMap, "Topaz", 16776960, "Yellow");
        s3.c.m(3688720, hashMap, "Clover", 8628829, "Cucumber");
        s3.c.m(5294200, hashMap, "Emerald", 11907932, "Olive");
        s3.c.m(65280, hashMap, "Green", 43115, "Jade");
        s3.c.m(2730887, hashMap, "Jungle", 12582656, "Lime");
        s3.c.m(776785, hashMap, "Malachite", 10026904, "Mint");
        s3.c.m(11394989, hashMap, "Moss", 3234721, "Azure");
        s3.c.m(255, hashMap, "Blue", 18347, "Cobalt");
        s3.c.m(5204422, hashMap, "Indigo", 96647, "Lagoon");
        s3.c.m(7461346, hashMap, "Aquamarine", 1182351, "Ultramarine");
        s3.c.m(128, hashMap, "Navy", 3101086, "Sapphire");
        s3.c.m(7788522, hashMap, "Sky", 32896, "Teal");
        s3.c.m(4251856, hashMap, "Turquoise", 10053324, "Amethyst");
        s3.c.m(5046581, hashMap, "Blackberry", 6373457, "Eggplant");
        s3.c.m(13148872, hashMap, "Lilac", 11894492, "Lavender");
        s3.c.m(13421823, hashMap, "Periwinkle", 8663417, "Plum");
        s3.c.m(6684825, hashMap, "Purple", 14204888, "Thistle");
        s3.c.m(14315734, hashMap, "Orchid", 2361920, "Violet");
        s3.c.m(4137225, hashMap, "Bronze", 3604994, "Chocolate");
        s3.c.m(8077056, hashMap, "Cinnamon", 3153694, "Cocoa");
        s3.c.m(7365973, hashMap, "Coffee", 7956873, "Rum");
        s3.c.m(5113350, hashMap, "Mahogany", 7875865, "Mocha");
        s3.c.m(12759680, hashMap, "Sand", 8924439, "Sienna");
        s3.c.m(7864585, hashMap, "Maple", 15787660, "Khaki");
        s3.c.m(12088115, hashMap, "Copper", 12144200, "Chestnut");
        s3.c.m(15653316, hashMap, "Almond", 16776656, "Cream");
        s3.c.m(12186367, hashMap, "Diamond", 11109127, "Honey");
        s3.c.m(16777200, hashMap, "Ivory", 15392968, "Pearl");
        s3.c.m(15725299, hashMap, "Porcelain", 13745832, "Vanilla");
        s3.c.m(16777215, hashMap, "White", 8421504, "Gray");
        s3.c.m(0, hashMap, "Black", 15266260, "Chrome");
        s3.c.m(3556687, hashMap, "Charcoal", 789277, "Ebony");
        s3.c.m(12632256, hashMap, "Silver", 16119285, "Smoke");
        s3.c.m(2499381, hashMap, "Steel", 5220413, "Apple");
        s3.c.m(8434628, hashMap, "Glacier", 16693933, "Melon");
        s3.c.m(12929932, hashMap, "Mulberry", 11126466, "Opal");
        hashMap.put(5547512, "Blue");
        org.telegram.ui.ActionBar.e6 k10 = e6Var == null ? org.telegram.ui.ActionBar.g6.A0().k(false) : e6Var;
        if (k10 == null || (i11 = k10.c) == 0) {
            i11 = AndroidUtilities.calcDrawableColor(org.telegram.ui.ActionBar.g6.r0())[0];
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
            sb2 = a9.p.n((String) asList.get(Utilities.random.nextInt(asList.size())), " ", str, new StringBuilder());
        } else {
            StringBuilder f10 = s3.c.f(str, " ");
            f10.append((String) asList2.get(Utilities.random.nextInt(asList2.size())));
            sb2 = f10.toString();
        }
        editTextBoldCursor.setText(sb2);
        editTextBoldCursor.setSelection(editTextBoldCursor.length());
        d1 d1Var = new d1(2, editTextBoldCursor);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.setOnShowListener(d1Var);
        n2Var.showDialog(b2Var);
        editTextBoldCursor.requestFocus();
        b2Var.d(-1).setOnClickListener(new jh.b0(n2Var, editTextBoldCursor, e6Var, f6Var, b2Var, 8));
    }

    public static void X(Activity activity, String str, int i10, int i11, int i12, Utilities.Callback callback) {
        if (activity == null) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.j5, false);
        int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.h5, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ji, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ni, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G8, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.i6, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false);
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(activity, null, false, false);
        e3Var.fixNavigationBar();
        e3Var.applyBottomPadding = false;
        l3 l3Var = new l3(activity, null);
        m3 m3Var = new m3(activity, l3Var);
        m3Var.setOrientation(0);
        m3Var.setWeightSum(1.0f);
        l3Var.setAllItemsCount(24);
        l3Var.setItemCount(5);
        l3Var.setTextColor(w02);
        l3Var.setGravity(5);
        l3Var.setTextOffset(-AndroidUtilities.dp(12.0f));
        n3 n3Var = new n3(activity, null);
        n3Var.setWrapSelectorWheel(true);
        n3Var.setAllItemsCount(60);
        n3Var.setItemCount(5);
        n3Var.setTextColor(w02);
        n3Var.setGravity(3);
        n3Var.setTextOffset(AndroidUtilities.dp(12.0f));
        final hh.i3 i3Var = new hh.i3(i11, i12, l3Var, n3Var, i10, m3Var);
        m3Var.addView(l3Var, h7.z5.l(0.5f, 0, 270));
        l3Var.setFormatter(new c2(3));
        final int i13 = 0;
        l3Var.setOnValueChangedListener(new dc0() { // from class: org.telegram.ui.Components.g2
            @Override // org.telegram.ui.Components.dc0
            public final void m(fc0 fc0Var, int i14) {
                switch (i13) {
                    case 0:
                        i3Var.run(Boolean.TRUE);
                        break;
                    default:
                        i3Var.run(Boolean.TRUE);
                        break;
                }
            }
        });
        m3Var.addView(n3Var, h7.z5.l(0.5f, 0, 270));
        n3Var.setFormatter(new c2(4));
        final int i14 = 1;
        n3Var.setOnValueChangedListener(new dc0() { // from class: org.telegram.ui.Components.g2
            @Override // org.telegram.ui.Components.dc0
            public final void m(fc0 fc0Var, int i142) {
                switch (i14) {
                    case 0:
                        i3Var.run(Boolean.TRUE);
                        break;
                    default:
                        i3Var.run(Boolean.TRUE);
                        break;
                }
            }
        });
        i3Var.run(Boolean.FALSE);
        o3 o3Var = new o3(activity, l3Var, n3Var);
        o3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextColor(w02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, h7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new kh.e(10));
        o3Var.addView(frameLayout, h7.z5.t(-1, -2, 51, 22, 0, 0, 4));
        o3Var.addView(m3Var, h7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        lh.d dVar = new lh.d(activity, null, true);
        dVar.setRoundRadius(24);
        dVar.g(LocaleController.getString(R.string.Select), false, true);
        dVar.setOnClickListener(new h2(r1, 0));
        o3Var.addView(dVar, h7.z5.t(-1, 48, 0, 16, 12, 16, 12));
        e3Var.customView = o3Var;
        e3Var.show();
        e3Var.setOnDismissListener(new gh.j(callback, l3Var, n3Var, 5));
        e3Var.setBackgroundColor(w03);
        e3Var.fixNavigationBar(w03);
        org.telegram.ui.ActionBar.e3[] e3VarArr = {e3Var};
    }

    public static org.telegram.ui.ActionBar.b2 Y(Activity activity, final long j10, final long j11, String str, final Runnable runnable, org.telegram.ui.ActionBar.c6 c6Var) {
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
        LinearLayout f10 = org.telegram.messenger.y1.f(activity, 1);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, c6Var);
        int i12 = 0;
        while (i12 < strArr2.length) {
            org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(activity, c6Var);
            h6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            h6Var.setTag(Integer.valueOf(i12));
            h6Var.a(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.g7, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E5, c6Var));
            h6Var.b(strArr2[i12], iArr[0] == i12);
            f10.addView(h6Var);
            h6Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.x2
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
                    alertDialog$Builder.a.H0.run();
                    runnable.run();
                }
            });
            i12++;
            str2 = str;
        }
        alertDialog$Builder.a.N = LocaleController.getString(R.string.Vibrate);
        alertDialog$Builder.n(f10);
        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.a;
    }

    public static org.telegram.ui.ActionBar.b2 Z(Context context, org.telegram.ui.ActionBar.c6 c6Var, String[] strArr, int i10, String str, String str2, q0.a aVar) {
        boolean z10;
        if ((context instanceof Activity) && Build.VERSION.SDK_INT >= 23) {
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
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        alertDialog$Builder.m(i10, 72, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
        if (z10) {
            str = str2;
        }
        alertDialog$Builder.a.P = AndroidUtilities.replaceTags(str);
        alertDialog$Builder.k(LocaleController.getString(z10 ? R.string.PermissionOpenSettings : R.string.BotWebViewRequestAllow), new l9.b(z10, context, atomicBoolean, aVar, 3));
        alertDialog$Builder.h(LocaleController.getString(R.string.BotWebViewRequestDontAllow), new jh.z1(28, atomicBoolean, aVar));
        alertDialog$Builder.a.setOnDismissListener(new cg.g(6, atomicBoolean, aVar));
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

    public static void b(fc0 fc0Var, fc0 fc0Var2, fc0 fc0Var3) {
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
        fc0Var3.setMaxValue(i14);
        fc0Var3.setMinValue(i11);
        int value = fc0Var3.getValue();
        fc0Var2.setMaxValue(value == i14 ? i15 : 11);
        fc0Var2.setMinValue(value == i11 ? i12 : 0);
        int value2 = fc0Var2.getValue();
        calendar.set(1, value);
        calendar.set(2, value2);
        int actualMaximum = calendar.getActualMaximum(5);
        if (value == i14 && value2 == i15) {
            actualMaximum = Math.min(i16, actualMaximum);
        }
        fc0Var.setMaxValue(actualMaximum);
        if (value == i11 && value2 == i12) {
            i10 = i13;
        }
        fc0Var.setMinValue(i10);
    }

    public static boolean b0(final int i10, final long j10, int i11, Utilities.Callback callback, long j11) {
        TLRPC.Chat chat;
        long sendPaidMessagesStars = MessagesController.getInstance(i10).getSendPaidMessagesStars(j10);
        if (sendPaidMessagesStars <= 0 && j10 > 0) {
            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i10).isUserContactBlocked(j10));
        }
        long j12 = i11 * sendPaidMessagesStars;
        hh.u7.y(i10, false).P.put(Long.valueOf(j10), Integer.valueOf(i11));
        if (j12 <= 0 || j11 == j12) {
            callback.run(Long.valueOf(j12));
            return false;
        }
        final long j13 = sendPaidMessagesStars;
        final r2 r2Var = new r2(i10, j12, j10, callback, j13, 0);
        if (j13 <= MessagesController.getInstance(i10).getMainSettings().getLong(com.google.android.recaptcha.internal.a.m(j10, "ask_paid_message_", "_price"), 0L)) {
            r2Var.run();
            return true;
        }
        Activity activity = AndroidUtilities.getActivity();
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        org.telegram.ui.ActionBar.c6 bVar = (PhotoViewer.t1().Q1() || (U != null && U.hasShownSheet())) ? new jh.b() : U != null ? U.getResourceProvider() : null;
        String shortName = DialogObject.getShortName(i10, j10);
        if (ChatObject.isMonoForum(i10, j10)) {
            shortName = wf.c.h(i10, j10);
        } else if (U instanceof org.telegram.ui.rn) {
            org.telegram.ui.rn rnVar = (org.telegram.ui.rn) U;
            if (rnVar.c4 && rnVar.a() == j10 && (chat = rnVar.b4) != null) {
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
        i0(activity, LocaleController.getString(R.string.MessageLockedStarsConfirmTitle), spannableStringBuilder, LocaleController.getString(R.string.MessageLockedStarsConfirmMessageDontAsk), LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessagePay", i11), new Utilities.Callback() { // from class: org.telegram.ui.Components.m0
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    int i13 = i10;
                    SharedPreferences.Editor edit = MessagesController.getInstance(i13).getMainSettings().edit();
                    long j14 = j10;
                    edit.putLong(com.google.android.recaptcha.internal.a.m(j14, "ask_paid_message_", "_price"), j13).apply();
                    hh.u7.y(i13, false).O.put(Long.valueOf(j14), Long.valueOf(System.currentTimeMillis()));
                }
                AndroidUtilities.runOnUIThread(r2Var);
            }
        }, bVar, true);
        return true;
    }

    public static long c(lh.d dVar, fc0 fc0Var, fc0 fc0Var2, fc0 fc0Var3, fc0 fc0Var4) {
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i10 = 1;
        int i11 = calendar.get(1);
        int value = ((fc0Var2.getValue() - 120) / 12) + i11;
        calendar.clear();
        calendar.set(1, value);
        calendar.set(2, (fc0Var2.getValue() - 120) % 12);
        fc0Var.setMinValue(1);
        fc0Var.setMaxValue(calendar.getActualMaximum(5));
        int value2 = fc0Var.getValue();
        int value3 = fc0Var3.getValue();
        int value4 = fc0Var4.getValue();
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
        boolean z10 = false;
        if (arrayList.isEmpty()) {
            callback.run(new HashMap());
            return false;
        }
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        long j10 = 0;
        int i12 = 0;
        boolean z11 = true;
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
            hh.u7.y(i10, z10).P.put(l10, Integer.valueOf(i11));
            if (sendPaidMessagesStars > 0) {
                i12++;
            }
            if (sendPaidMessagesStars > 0 && z11 && MessagesController.getInstance(i10).getMainSettings().getLong(com.google.android.recaptcha.internal.a.m(longValue, "ask_paid_message_", "_price"), 0L) < sendPaidMessagesStars) {
                z11 = false;
            }
            j10 = j12;
            z10 = false;
        }
        long max = Math.max(1, i11) * j10;
        if (z11 || max <= 0) {
            callback.run(hashMap);
            return false;
        }
        Activity activity = AndroidUtilities.getActivity();
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        org.telegram.ui.ActionBar.c6 bVar = (PhotoViewer.t1().Q1() || (U != null && U.hasShownSheet())) ? new jh.b() : U != null ? U.getResourceProvider() : null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti1", i12)));
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti2", (int) max, LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i12) * i11))));
        i0(activity, LocaleController.getString(R.string.MessageLockedStarsConfirmTitle), spannableStringBuilder, LocaleController.getString(R.string.MessageLockedStarsConfirmMessageDontAsk), LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessagePay", i11), new org.telegram.ui.nq(i10, max, activity, arrayList, hashMap, callback, bVar), bVar, true);
        return true;
    }

    public static void d(fc0 fc0Var, fc0 fc0Var2, fc0 fc0Var3) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i10 = 1;
        int i11 = calendar.get(1);
        int i12 = calendar.get(2);
        int i13 = calendar.get(5);
        fc0Var3.setMinValue(i11);
        int value = fc0Var3.getValue();
        fc0Var2.setMinValue(value == i11 ? i12 : 0);
        int value2 = fc0Var2.getValue();
        if (value == i11 && value2 == i12) {
            i10 = i13;
        }
        fc0Var.setMinValue(i10);
    }

    public static boolean d0(int i10, long j10) {
        long sendPaidMessagesStars = MessagesController.getInstance(i10).getSendPaidMessagesStars(j10);
        if (sendPaidMessagesStars <= 0 && j10 > 0) {
            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i10).isUserContactBlocked(j10));
        }
        return sendPaidMessagesStars > 0 && sendPaidMessagesStars > MessagesController.getInstance(i10).getMainSettings().getLong(com.google.android.recaptcha.internal.a.m(j10, "ask_paid_message_", "_price"), 0L);
    }

    public static void e(TextView textView, fc0 fc0Var, x3 x3Var, y3 y3Var) {
        int value = fc0Var.getValue();
        int value2 = x3Var.getValue();
        int value3 = y3Var.getValue();
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

    public static void e0(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.b2 b2Var, org.telegram.ui.ActionBar.n2 n2Var) {
        if (n2Var.getParentActivity() == null) {
            return;
        }
        AndroidUtilities.hideKeyboard(editTextBoldCursor);
        String obj = editTextBoldCursor.getText().toString();
        int i10 = org.telegram.ui.ActionBar.g6.a;
        org.telegram.ui.ActionBar.f6 f6Var = new org.telegram.ui.ActionBar.f6();
        f6Var.b = new File(ApplicationLoader.getFilesDirFixed(), "theme" + Utilities.random.nextLong() + ".attheme").getAbsolutePath();
        f6Var.a = obj;
        org.telegram.ui.ActionBar.g6.h0 = org.telegram.ui.ActionBar.g6.Y0(org.telegram.ui.ActionBar.g6.I.e0);
        f6Var.A = UserConfig.selectedAccount;
        org.telegram.ui.ActionBar.g6.r1(f6Var, true, true, false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
        new ThemeEditorView().c(n2Var.getParentActivity(), f6Var);
        b2Var.dismiss();
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("themehint", false)) {
            return;
        }
        globalMainSettings.edit().putBoolean("themehint", true).commit();
        try {
            Toast.makeText(n2Var.getParentActivity(), LocaleController.getString(R.string.CreateNewThemeHelp), 1).show();
        } catch (Exception e9) {
            FileLog.e(e9);
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
        AndroidUtilities.runOnUIThread(new gh.e1(i10, chat, arrayList, arrayList2, arrayList3), 200L);
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
    public static org.telegram.ui.ActionBar.b2 f0(final int i10, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLObject tLObject, Object... objArr) {
        String str;
        String str2;
        final long j10;
        long peerDialogId;
        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
        if (tL_error != null && tL_error.code != 406 && (str = tL_error.text) != null) {
            if ("BALANCE_TOO_LOW".equalsIgnoreCase(str)) {
                final long o10 = hh.u7.o(tLObject);
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
                        hh.u7.y(i10, false).q(true, true, new Runnable() { // from class: org.telegram.ui.Components.l2
                            @Override // java.lang.Runnable
                            public final void run() {
                                Activity activity = AndroidUtilities.getActivity();
                                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                org.telegram.ui.ActionBar.c6 bVar = (PhotoViewer.t1().Q1() || (U != null && U.hasShownSheet())) ? new jh.b() : U != null ? U.getResourceProvider() : null;
                                int i11 = i10;
                                long j11 = j10;
                                new hh.ea(activity, bVar, o10, 13, DialogObject.getShortName(i11, j11), new ag.l3(25), j11).show();
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
                    u0(n2Var2, LocaleController.getString(R.string.GuardBotTimeoutTitle), LocaleController.getString(R.string.GuardBotTimeout), null);
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
                    u0(n2Var2, LocaleController.getString(R.string.MessagePremiumErrorTitle), LocaleController.formatString(R.string.MessagePremiumErrorMessage, str2), null);
                    MessagesController.getInstance(i10).invalidateUserPremiumBlocked(peerDialogId2, 0);
                    return null;
                }
                boolean z11 = tLObject instanceof TLRPC.TL_messages_initHistoryImport;
                if (z11 || (tLObject instanceof TLRPC.TL_messages_checkHistoryImportPeer) || (tLObject instanceof TLRPC.TL_messages_checkHistoryImport) || (tLObject instanceof TLRPC.TL_messages_startHistoryImport)) {
                    TLRPC.InputPeer inputPeer = z11 ? ((TLRPC.TL_messages_initHistoryImport) tLObject).peer : tLObject instanceof TLRPC.TL_messages_startHistoryImport ? ((TLRPC.TL_messages_startHistoryImport) tLObject).peer : null;
                    org.telegram.ui.ActionBar.n2 R = n2Var2 == null ? LaunchActivity.R() : n2Var2;
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
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.messenger.rl.j(R.string.ErrorOccurred, "\n", sb2);
                    sb2.append(tL_error.text);
                    u0(R, string, sb2.toString(), null);
                } else {
                    if ((tLObject instanceof TL_account.saveSecureValue) || (tLObject instanceof TL_account.getAuthorizationForm)) {
                        org.telegram.ui.ActionBar.n2 R2 = n2Var2 == null ? LaunchActivity.R() : n2Var2;
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
                        StringBuilder sb3 = new StringBuilder();
                        org.telegram.messenger.rl.j(R.string.ErrorOccurred, "\n", sb3);
                        sb3.append(tL_error.text);
                        u0(R2, null, sb3.toString(), null);
                        return null;
                    }
                    boolean z12 = tLObject instanceof TLRPC.TL_channels_joinChannel;
                    if (!z12 && !(tLObject instanceof TLRPC.TL_channels_editAdmin) && !(tLObject instanceof TLRPC.TL_channels_inviteToChannel) && !(tLObject instanceof TLRPC.TL_messages_addChatUser) && !(tLObject instanceof TLRPC.TL_messages_startBot) && !(tLObject instanceof TLRPC.TL_channels_editBanned) && !(tLObject instanceof TLRPC.TL_messages_editChatDefaultBannedRights) && !(tLObject instanceof TLRPC.TL_messages_editChatAdmin) && !(tLObject instanceof TLRPC.TL_messages_migrateChat) && !(tLObject instanceof TL_phone.inviteToGroupCall)) {
                        char c10 = 2;
                        if (tLObject instanceof TLRPC.TL_messages_createChat) {
                            org.telegram.ui.ActionBar.n2 R3 = n2Var2 == null ? LaunchActivity.R() : n2Var2;
                            if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                                if (R3.getParentActivity() != null) {
                                    R3.showDialog(new ag.i1(5, i10, R3.getParentActivity(), R3, null));
                                    return null;
                                }
                                R3.presentFragment(new ld1(2));
                                return null;
                            }
                            org.telegram.ui.ActionBar.n2 n2Var3 = R3;
                            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                m0(n2Var3, tL_error.text);
                                return null;
                            }
                            h0(tL_error, n2Var3, false, false, tLObject);
                            return null;
                        }
                        if (tLObject instanceof TLRPC.TL_channels_createChannel) {
                            org.telegram.ui.ActionBar.n2 R4 = n2Var2 == null ? LaunchActivity.R() : n2Var2;
                            if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                                if (R4.getParentActivity() != null) {
                                    R4.showDialog(new ag.i1(5, i10, R4.getParentActivity(), R4, null));
                                    return null;
                                }
                                R4.presentFragment(new ld1(2));
                                return null;
                            }
                            org.telegram.ui.ActionBar.n2 n2Var4 = R4;
                            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                m0(n2Var4, tL_error.text);
                                return null;
                            }
                            h0(tL_error, n2Var4, false, false, tLObject);
                            return null;
                        }
                        if (tLObject instanceof TLRPC.TL_messages_editMessage) {
                            if (!tL_error.text.equals("MESSAGE_NOT_MODIFIED")) {
                                if (n2Var2 != null) {
                                    u0(n2Var2, null, LocaleController.getString(R.string.EditMessageError), null);
                                    return null;
                                }
                                w0(null, LocaleController.getString(R.string.EditMessageError));
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
                                            w0(n2Var2, LocaleController.getString(R.string.MessageScheduledLimitReached));
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
                                    u0(R5, null, LocaleController.getString(R.string.FloodWait), null);
                                    return null;
                                }
                                if (tL_error.text.equals("USERS_TOO_MUCH")) {
                                    u0(R5, null, LocaleController.getString(R.string.JoinToGroupErrorFull), null);
                                    return null;
                                }
                                if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                                    if (R5.getParentActivity() != null) {
                                        R5.showDialog(new ag.i1(5, i10, R5.getParentActivity(), R5, null));
                                        return null;
                                    }
                                    R5.presentFragment(new ld1(0));
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
                                if (n2Var2 != null && n2Var2.getParentActivity() != null) {
                                    Activity parentActivity = n2Var2.getParentActivity();
                                    StringBuilder sb4 = new StringBuilder();
                                    org.telegram.messenger.rl.j(R.string.ErrorOccurred, "\n", sb4);
                                    sb4.append(tL_error.text);
                                    Toast.makeText(parentActivity, sb4.toString(), 0).show();
                                    return null;
                                }
                            } else {
                                if ((tLObject instanceof TL_account.confirmPhone) || (tLObject instanceof TL_account.verifyPhone) || (tLObject instanceof TL_account.verifyEmail)) {
                                    return (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID") || tL_error.text.contains("CODE_INVALID") || tL_error.text.contains("CODE_EMPTY")) ? u0(n2Var2, null, LocaleController.getString(R.string.InvalidCode), null) : (tL_error.text.contains("PHONE_CODE_EXPIRED") || tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) ? u0(n2Var2, null, LocaleController.getString(R.string.CodeExpired), null) : tL_error.text.startsWith("FLOOD_WAIT") ? u0(n2Var2, null, LocaleController.getString(R.string.FloodWait), null) : u0(n2Var2, null, tL_error.text, null);
                                }
                                if (tLObject instanceof TLRPC.TL_auth_resendCode) {
                                    if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                                        return u0(n2Var2, null, LocaleController.getString(R.string.InvalidPhoneNumber), null);
                                    }
                                    if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                                        return u0(n2Var2, null, LocaleController.getString(R.string.InvalidCode), null);
                                    }
                                    if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                        return u0(n2Var2, null, LocaleController.getString(R.string.CodeExpired), null);
                                    }
                                    if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                        return u0(n2Var2, null, LocaleController.getString(R.string.FloodWait), null);
                                    }
                                    if (tL_error.code != -1000) {
                                        StringBuilder sb5 = new StringBuilder();
                                        org.telegram.messenger.rl.j(R.string.ErrorOccurred, "\n", sb5);
                                        sb5.append(tL_error.text);
                                        return u0(n2Var2, null, sb5.toString(), null);
                                    }
                                } else {
                                    if (tLObject instanceof TL_account.sendConfirmPhoneCode) {
                                        return tL_error.code == 400 ? u0(n2Var2, null, LocaleController.getString(R.string.CancelLinkExpired), null) : tL_error.text.startsWith("FLOOD_WAIT") ? u0(n2Var2, null, LocaleController.getString(R.string.FloodWait), null) : u0(n2Var2, null, LocaleController.getString(R.string.ErrorOccurred), null);
                                    }
                                    if (tLObject instanceof TL_account.changePhone) {
                                        if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                                            u0(n2Var2, null, LocaleController.getString(R.string.InvalidPhoneNumber), null);
                                            return null;
                                        }
                                        if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                                            u0(n2Var2, null, LocaleController.getString(R.string.InvalidCode), null);
                                            return null;
                                        }
                                        if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                            u0(n2Var2, null, LocaleController.getString(R.string.CodeExpired), null);
                                            return null;
                                        }
                                        if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                            u0(n2Var2, null, LocaleController.getString(R.string.FloodWait), null);
                                            return null;
                                        }
                                        if (tL_error.text.contains("FRESH_CHANGE_PHONE_FORBIDDEN")) {
                                            u0(n2Var2, LocaleController.getString(R.string.FreshChangePhoneForbiddenTitle), LocaleController.getString(R.string.FreshChangePhoneForbidden), null);
                                            return null;
                                        }
                                        u0(n2Var2, null, tL_error.text, null);
                                        return null;
                                    }
                                    if (tLObject instanceof TL_account.sendChangePhoneCode) {
                                        if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                                            org.telegram.ui.ig0.m1(n2Var2, (String) objArr[0], null, false);
                                            return null;
                                        }
                                        if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                                            u0(n2Var2, null, LocaleController.getString(R.string.InvalidCode), null);
                                            return null;
                                        }
                                        if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                            u0(n2Var2, null, LocaleController.getString(R.string.CodeExpired), null);
                                            return null;
                                        }
                                        if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                            u0(n2Var2, null, LocaleController.getString(R.string.FloodWait), null);
                                            return null;
                                        }
                                        if (tL_error.text.startsWith("PHONE_NUMBER_OCCUPIED")) {
                                            u0(n2Var2, null, LocaleController.formatString("ChangePhoneNumberOccupied", R.string.ChangePhoneNumberOccupied, objArr[0]), null);
                                            return null;
                                        }
                                        if (tL_error.text.startsWith("PHONE_NUMBER_BANNED")) {
                                            org.telegram.ui.ig0.m1(n2Var2, (String) objArr[0], null, true);
                                            return null;
                                        }
                                        u0(n2Var2, null, LocaleController.getString(R.string.ErrorOccurred), null);
                                        return null;
                                    }
                                    if (tLObject instanceof TL_account.updateUsername) {
                                        String str7 = tL_error.text;
                                        str7.getClass();
                                        if (str7.equals("USERNAME_INVALID")) {
                                            u0(n2Var2, null, LocaleController.getString(R.string.UsernameInvalid), null);
                                            return null;
                                        }
                                        if (str7.equals("USERNAME_OCCUPIED")) {
                                            u0(n2Var2, null, LocaleController.getString(R.string.UsernameInUse), null);
                                            return null;
                                        }
                                        u0(n2Var2, null, LocaleController.getString(R.string.ErrorOccurred), null);
                                        return null;
                                    }
                                    if (tLObject instanceof TLRPC.TL_contacts_importContacts) {
                                        if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                            u0(n2Var2, null, LocaleController.getString(R.string.FloodWait), null);
                                            return null;
                                        }
                                        StringBuilder sb6 = new StringBuilder();
                                        org.telegram.messenger.rl.j(R.string.ErrorOccurred, "\n", sb6);
                                        sb6.append(tL_error.text);
                                        u0(n2Var2, null, sb6.toString(), null);
                                        return null;
                                    }
                                    if ((tLObject instanceof TL_account.getPassword) || (tLObject instanceof TL_account.getTmpPassword)) {
                                        if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                                            w0(n2Var2, tL_error.text);
                                            return null;
                                        }
                                        int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                                        w0(n2Var2, LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                                        return null;
                                    }
                                    if (tLObject instanceof TLRPC.TL_payments_sendPaymentForm) {
                                        String str8 = tL_error.text;
                                        str8.getClass();
                                        if (str8.equals("BOT_PRECHECKOUT_FAILED")) {
                                            w0(n2Var2, LocaleController.getString(R.string.PaymentPrecheckoutFailed));
                                            return null;
                                        }
                                        if (str8.equals("PAYMENT_FAILED")) {
                                            w0(n2Var2, LocaleController.getString(R.string.PaymentFailed));
                                            return null;
                                        }
                                        w0(n2Var2, tL_error.text);
                                        return null;
                                    }
                                    if (tLObject instanceof TLRPC.TL_payments_validateRequestedInfo) {
                                        String str9 = tL_error.text;
                                        str9.getClass();
                                        if (str9.equals("SHIPPING_NOT_AVAILABLE")) {
                                            w0(n2Var2, LocaleController.getString(R.string.PaymentNoShippingMethod));
                                            return null;
                                        }
                                        w0(n2Var2, tL_error.text);
                                        return null;
                                    }
                                    if (tLObject instanceof TLRPC.TL_payments_assignPlayMarketTransaction) {
                                        StringBuilder sb7 = new StringBuilder();
                                        org.telegram.messenger.rl.j(R.string.PaymentConfirmationError, "\n", sb7);
                                        sb7.append(tL_error.text);
                                        u0(n2Var2, null, sb7.toString(), null);
                                        return null;
                                    }
                                }
                            }
                        }
                    } else {
                        if (n2Var2 != null && tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                            if (n2Var2.getParentActivity() != null) {
                                n2Var2.showDialog(new ag.i1(5, i10, n2Var2.getParentActivity(), n2Var2, null));
                                return null;
                            }
                            if (z12 || (tLObject instanceof TLRPC.TL_channels_inviteToChannel)) {
                                n2Var2.presentFragment(new ld1(0));
                                return null;
                            }
                            n2Var2.presentFragment(new ld1(1));
                            return null;
                        }
                        if (n2Var2 != null) {
                            h0(tL_error, n2Var2, objArr.length > 0 ? ((Boolean) objArr[0]).booleanValue() : false, objArr.length > 1 ? ((Boolean) objArr[1]).booleanValue() : false, tLObject);
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

    public static boolean g(TextView textView, TextView textView2, long j10, long j11, int i10, fc0 fc0Var, fc0 fc0Var2, fc0 fc0Var3) {
        long j12;
        int i11;
        long j13;
        int i12;
        int i13;
        int i14;
        boolean z10;
        boolean z11;
        String formatPluralString;
        int value = fc0Var.getValue();
        int value2 = fc0Var2.getValue();
        int value3 = fc0Var3.getValue();
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
        fc0Var.setMinValue(0);
        if (j15 > 0) {
            fc0Var.setMaxValue(i13);
        }
        int value4 = fc0Var.getValue();
        fc0Var2.setMinValue(value4 == 0 ? i17 : 0);
        if (j15 > 0) {
            fc0Var2.setMaxValue(value4 == i13 ? i12 : 23);
        }
        int value5 = fc0Var2.getValue();
        fc0Var3.setMinValue((value4 == 0 && value5 == i17) ? i18 : 0);
        if (j15 > 0) {
            fc0Var3.setMaxValue((value4 == i13 && value5 == i12) ? i16 : 59);
        }
        int value6 = fc0Var3.getValue();
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
        return timeInMillis - j12 > millis ? z10 : z11;
    }

    public static void g0(Context context, org.telegram.ui.ActionBar.c6 c6Var, String str, TLRPC.WebPage webPage, final Utilities.Callback callback, gm gmVar) {
        Activity findActivity = AndroidUtilities.findActivity(context);
        final View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        final org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        String string = LocaleController.getString(R.string.PollV2AddLinkTitle);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.N = string;
        b2Var.P = LocaleController.getString(R.string.PollV2AddLinkMessage);
        final z3 z3Var = new z3(context);
        z3Var.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.g6.j5;
        z3Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        z3Var.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Xh, c6Var));
        z3Var.setHint(LocaleController.getString(R.string.PollV2AddLinkUrlHint));
        z3Var.setInputType(17);
        z3Var.setImeOptions(6);
        z3Var.setMaxLines(10);
        z3Var.setSingleLine(false);
        z3Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f));
        z3Var.setCursorWidth(1.5f);
        z3Var.setCursorColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q6, c6Var));
        if (str != null) {
            z3Var.setText(str);
            z3Var.setSelection(str.length());
        }
        z3Var.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.Components.f2
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                if (i11 != 6) {
                    return false;
                }
                z3 z3Var2 = z3.this;
                String trim = z3Var2.getText().toString().trim();
                if (!(TextUtils.isEmpty(trim) ? false : y4.a.matcher(trim.trim()).matches())) {
                    AndroidUtilities.shakeView(z3Var2);
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
        gradientDrawable.setColor(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var)));
        z3Var.setBackground(gradientDrawable);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(z3Var, h7.z5.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
        int i11 = x71.f;
        if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
            x71 x71Var = new x71(context, c6Var);
            x71Var.setWebPage(webPage);
            linearLayout.addView(x71Var, h7.z5.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
        }
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        b2Var.a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
        int i12 = 2;
        alertDialog$Builder.k(LocaleController.getString(R.string.Done), new g1(i12, z3Var, callback));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new c2(i12));
        if (gmVar != null) {
            alertDialog$Builder.i(LocaleController.getString(R.string.Delete), new y0(4, gmVar));
        }
        b2VarArr[0] = b2Var;
        b2Var.d0 = false;
        b2Var.setOnDismissListener(new a1(z3Var, i12));
        b2VarArr[0].setOnShowListener(new gt(i12, z3Var));
        b2VarArr[0].show();
        TextView textView = (TextView) b2VarArr[0].d(-3);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
        }
    }

    public static boolean h(Context context, int i10, long j10, boolean z10) {
        TLRPC.Chat chat;
        if (!DialogObject.isChatDialog(j10) || (chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10))) == null || !chat.slowmode_enabled || ChatObject.hasAdminRights(chat)) {
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
        N(context, chat.title, LocaleController.getString(R.string.SlowmodeSendError)).o();
        return true;
    }

    public static void h0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, boolean z11, TLObject tLObject) {
        AlertDialog$Builder alertDialog$Builder;
        org.telegram.ui.ActionBar.b2 b2Var;
        int i10;
        if (tL_error == null || tL_error.code == 406 || tL_error.text == null || n2Var == null || n2Var.getParentActivity() == null) {
            return;
        }
        alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        b2Var = alertDialog$Builder.a;
        b2Var.N = string;
        String str = tL_error.text;
        str.getClass();
        i10 = 0;
        switch (str) {
            case "CHANNELS_ADMIN_LOCATED_TOO_MUCH":
                b2Var.P = LocaleController.getString(R.string.LocatedChannelsTooMuch);
                break;
            case "CHANNELS_ADMIN_PUBLIC_TOO_MUCH":
                b2Var.P = LocaleController.getString(R.string.PublicChannelsTooMuch);
                break;
            case "USERS_TOO_FEW":
                b2Var.P = LocaleController.getString(R.string.CreateGroupError);
                break;
            case "USER_BLOCKED":
            case "USER_BOT":
            case "USER_ID_INVALID":
                if (!z10) {
                    b2Var.P = LocaleController.getString(R.string.GroupUserCantAdd);
                    break;
                } else {
                    b2Var.P = LocaleController.getString(R.string.ChannelUserCantAdd);
                    break;
                }
            case "USER_RESTRICTED":
                b2Var.P = LocaleController.getString(R.string.UserRestricted);
                break;
            case "PEER_FLOOD":
                b2Var.P = LocaleController.getString(R.string.NobodyLikesSpam2);
                alertDialog$Builder.h(LocaleController.getString(R.string.MoreInfo), new n2(i10, n2Var));
                break;
            case "BOTS_TOO_MUCH":
                if (!z10) {
                    b2Var.P = LocaleController.getString(R.string.GroupUserCantBot);
                    break;
                } else {
                    b2Var.P = LocaleController.getString(R.string.ChannelUserCantBot);
                    break;
                }
            case "USER_KICKED":
            case "CHAT_ADMIN_BAN_REQUIRED":
                if (!(tLObject instanceof TLRPC.TL_channels_inviteToChannel)) {
                    b2Var.P = LocaleController.getString(R.string.AddAdminErrorBlacklisted);
                    break;
                } else {
                    b2Var.P = LocaleController.getString(R.string.AddUserErrorBlacklisted);
                    break;
                }
            case "YOU_BLOCKED_USER":
                b2Var.P = LocaleController.getString(R.string.YouBlockedUser);
                break;
            case "USER_ADMIN_INVALID":
                b2Var.P = LocaleController.getString(R.string.AddBannedErrorAdmin);
                break;
            case "USERS_TOO_MUCH":
                if (!z10) {
                    b2Var.P = LocaleController.getString(R.string.GroupUserAddLimit);
                    break;
                } else {
                    b2Var.P = LocaleController.getString(R.string.ChannelUserAddLimit);
                    break;
                }
            case "ADMINS_TOO_MUCH":
                if (!z10) {
                    b2Var.P = LocaleController.getString(R.string.GroupUserCantAdmin);
                    break;
                } else {
                    b2Var.P = LocaleController.getString(R.string.ChannelUserCantAdmin);
                    break;
                }
            case "CHANNELS_TOO_MUCH":
                b2Var.N = LocaleController.getString(R.string.ChannelTooMuchTitle);
                if (!(tLObject instanceof TLRPC.TL_channels_createChannel)) {
                    b2Var.P = LocaleController.getString(R.string.ChannelTooMuchJoin);
                    break;
                } else {
                    b2Var.P = LocaleController.getString(R.string.ChannelTooMuch);
                    break;
                }
            case "USER_CHANNELS_TOO_MUCH":
                b2Var.N = LocaleController.getString(R.string.ChannelTooMuchTitle);
                b2Var.P = LocaleController.getString(R.string.UserChannelTooMuchJoin);
                break;
            case "USER_NOT_MUTUAL_CONTACT":
                if (!z10) {
                    b2Var.P = LocaleController.getString(R.string.GroupUserLeftError);
                    break;
                } else {
                    b2Var.P = LocaleController.getString(R.string.ChannelUserLeftError);
                    break;
                }
            case "CHAT_ADMIN_INVITE_REQUIRED":
                b2Var.P = LocaleController.getString(R.string.AddAdminErrorNotAMember);
                break;
            case "USER_PRIVACY_RESTRICTED":
                if (!z11) {
                    if (!z10) {
                        b2Var.P = LocaleController.getString(R.string.InviteToGroupError);
                        break;
                    } else {
                        b2Var.P = LocaleController.getString(R.string.InviteToChannelError);
                        break;
                    }
                } else {
                    b2Var.P = LocaleController.getString(R.string.InviteToCommunityError);
                    break;
                }
            case "USER_ALREADY_PARTICIPANT":
                b2Var.N = LocaleController.getString(R.string.VoipGroupVoiceChat);
                b2Var.P = LocaleController.getString(R.string.VoipGroupInviteAlreadyParticipant);
                break;
            default:
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.rl.j(R.string.ErrorOccurred, "\n", sb2);
                sb2.append(tL_error.text);
                b2Var.P = sb2.toString();
                break;
        }
        i0.a.C(R.string.OK, alertDialog$Builder, null);
    }

    public static org.telegram.ui.ActionBar.b2 i(Activity activity, v4 v4Var) {
        if (UserConfig.getActivatedAccountsCount() < 2) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        org.telegram.ui.ActionBar.q1 q1Var = alertDialog$Builder.a.H0;
        org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        LinearLayout f10 = org.telegram.messenger.y1.f(activity, 1);
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).getCurrentUser() != null) {
                org.telegram.ui.Cells.k kVar = new org.telegram.ui.Cells.k(activity, false);
                kVar.f = i10;
                TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
                y8 y8Var = kVar.e;
                y8Var.m(i10, currentUser);
                kVar.a.l(ContactsController.formatName(currentUser.first_name, currentUser.last_name), false);
                n9 n9Var = kVar.c;
                n9Var.getImageReceiver().setCurrentAccount(i10);
                n9Var.e(currentUser, y8Var);
                kVar.d.setVisibility(4);
                kVar.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                kVar.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
                f10.addView(kVar, h7.z5.n(-1, 50));
                kVar.setOnClickListener(new gg.f((Object) b2VarArr, (Runnable) q1Var, (Object) v4Var, 18));
            }
        }
        alertDialog$Builder.a.N = LocaleController.getString(R.string.SelectAccount);
        alertDialog$Builder.n(f10);
        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2VarArr[0] = b2Var;
        return b2Var;
    }

    public static org.telegram.ui.ActionBar.b2 i0(Activity activity, String str, CharSequence charSequence, CharSequence charSequence2, String str2, Utilities.Callback callback, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        if (activity == null) {
            callback.run(Boolean.FALSE);
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, c6Var);
        org.telegram.ui.Cells.y1[] y1VarArr = new org.telegram.ui.Cells.y1[1];
        boolean[] zArr = new boolean[1];
        t4 t4Var = new t4(activity);
        NotificationCenter.listenEmojiLoading(t4Var);
        t4Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.j5, c6Var));
        t4Var.setTextSize(1, 16.0f);
        t4Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        t4Var.setText(charSequence);
        u4 u4Var = new u4(activity, y1VarArr);
        alertDialog$Builder.a.C = 6;
        alertDialog$Builder.n(u4Var);
        TextView textView = new TextView(activity);
        org.telegram.messenger.rl.w(org.telegram.ui.ActionBar.g6.E8, c6Var, textView, 1, 20.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(str);
        u4Var.addView(textView, h7.z5.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 8.0f, 24.0f, 0.0f));
        u4Var.addView(t4Var, h7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 48.0f, 24.0f, 6.0f));
        if (!TextUtils.isEmpty(charSequence2)) {
            org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(activity, 1, c6Var);
            y1VarArr[0] = y1Var;
            y1Var.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i6, c6Var), 7, AndroidUtilities.dp(12.0f)));
            y1VarArr[0].setMultiline(true);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) y1VarArr[0].getCheckBoxView().getLayoutParams();
            layoutParams.topMargin = 0;
            layoutParams.gravity = (LocaleController.isRTL ? 5 : 3) | 16;
            y1VarArr[0].getCheckBoxView().setLayoutParams(layoutParams);
            y1VarArr[0].e(charSequence2, "", false, false, false);
            y1VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(4.0f) : 0, AndroidUtilities.dp(12.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f));
            u4Var.addView(y1VarArr[0], h7.z5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 0.0f));
            y1VarArr[0].setOnClickListener(new s0(5, zArr));
        }
        alertDialog$Builder.k(str2, new g1(8, callback, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        if (z10) {
            b2Var.T0 = true;
        }
        b2Var.show();
        return b2Var;
    }

    public static org.telegram.ui.ActionBar.b2 j(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        alertDialog$Builder.a.P = LocaleController.getString(R.string.ApkRestricted);
        alertDialog$Builder.m(R.raw.permission_request_apk, 72, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
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
    public static void j0(org.telegram.ui.ActionBar.n2 n2Var, long j10, final TLRPC.User user, final TLRPC.Chat chat, final TLRPC.EncryptedChat encryptedChat, final boolean z10, TLRPC.ChatFull chatFull, final MessagesStorage.IntCallback intCallback, org.telegram.ui.ActionBar.c6 c6Var) {
        long j11;
        boolean z11;
        String string;
        final org.telegram.ui.Cells.y1[] y1VarArr;
        TextView textView;
        if (n2Var.getParentActivity() == null) {
            return;
        }
        final AccountInstance accountInstance = n2Var.getAccountInstance();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity(), 0, c6Var);
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(n2Var.getCurrentAccount());
        int i10 = 1;
        if (encryptedChat == null) {
            j11 = j10;
            if (!org.telegram.messenger.y1.w("dialog_bar_report", j11, notificationsSettings, false)) {
                z11 = false;
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                if (user == null) {
                    b2Var.N = LocaleController.formatString("BlockUserTitle", R.string.BlockUserTitle, UserObject.getFirstName(user));
                    b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserAlert", R.string.BlockUserAlert, UserObject.getFirstName(user)));
                    string = LocaleController.getString(R.string.BlockContact);
                    org.telegram.ui.Cells.y1[] y1VarArr2 = new org.telegram.ui.Cells.y1[2];
                    LinearLayout linearLayout = new LinearLayout(n2Var.getParentActivity());
                    linearLayout.setOrientation(1);
                    int i11 = 0;
                    for (int i12 = 2; i11 < i12; i12 = 2) {
                        if (i11 != 0 || z11) {
                            org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(n2Var.getParentActivity(), i10, c6Var);
                            y1VarArr2[i11] = y1Var;
                            y1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
                            y1VarArr2[i11].setTag(Integer.valueOf(i11));
                            if (i11 == 0) {
                                y1VarArr2[i11].e(LocaleController.getString(R.string.DeleteReportSpam), "", true, false, false);
                            } else {
                                y1VarArr2[i11].e(LocaleController.formatString("DeleteThisChat", R.string.DeleteThisChat, new Object[0]), "", true, false, false);
                            }
                            y1VarArr2[i11].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                            linearLayout.addView(y1VarArr2[i11], h7.z5.n(-1, -2));
                            y1VarArr2[i11].setOnClickListener(new b1(y1VarArr2, 1));
                        }
                        i11++;
                        i10 = 1;
                    }
                    alertDialog$Builder.n(linearLayout);
                    y1VarArr = y1VarArr2;
                } else {
                    if (chat == null || !z10) {
                        b2Var.N = LocaleController.getString(R.string.ReportSpamTitle);
                        if (!ChatObject.isChannel(chat) || chat.megagroup) {
                            b2Var.P = LocaleController.getString(R.string.ReportSpamAlertGroup);
                        } else {
                            b2Var.P = LocaleController.getString(R.string.ReportSpamAlertChannel);
                        }
                    } else {
                        b2Var.N = LocaleController.getString(R.string.ReportUnrelatedGroup);
                        if (chatFull != null) {
                            TLRPC.ChannelLocation channelLocation = chatFull.location;
                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("ReportUnrelatedGroupText", R.string.ReportUnrelatedGroupText, ((TLRPC.TL_channelLocation) channelLocation).address));
                            }
                        }
                        b2Var.P = LocaleController.getString(R.string.ReportUnrelatedGroupTextNoAddress);
                    }
                    string = LocaleController.getString(R.string.ReportChat);
                    y1VarArr = null;
                }
                final long j12 = j11;
                alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.Components.b3
                    @Override // org.telegram.ui.ActionBar.a2
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var2, int i13) {
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
                            accountInstance2.getMessagesController().reportSpam(j13, user2, chat2, encryptedChat, chat2 != null && z10);
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
                n2Var.showDialog(b2Var);
                textView = (TextView) b2Var.d(-1);
                if (textView == null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
                    return;
                }
                return;
            }
        } else {
            j11 = j10;
        }
        z11 = true;
        org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.a;
        if (user == null) {
        }
        final long j122 = j11;
        alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.Components.b3
            @Override // org.telegram.ui.ActionBar.a2
            public final void f(org.telegram.ui.ActionBar.b2 b2Var22, int i13) {
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
                    accountInstance2.getMessagesController().reportSpam(j13, user2, chat2, encryptedChat, chat2 != null && z10);
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
        n2Var.showDialog(b2Var2);
        textView = (TextView) b2Var2.d(-1);
        if (textView == null) {
        }
    }

    public static void k(Context context, org.telegram.ui.ActionBar.c6 c6Var, x4 x4Var) {
        if (context == null) {
            return;
        }
        boolean z10 = false;
        int i10 = org.telegram.ui.ActionBar.g6.j5;
        int q02 = c6Var != null ? c6Var.q0(i10) : org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.g6.h5;
        int q03 = c6Var != null ? c6Var.q0(i11) : org.telegram.ui.ActionBar.g6.w0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.g6.Ji;
        if (c6Var != null) {
            c6Var.q0(i12);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i12, false);
        }
        int i13 = org.telegram.ui.ActionBar.g6.Ni;
        if (c6Var != null) {
            c6Var.q0(i13);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.g6.E8;
        if (c6Var != null) {
            c6Var.q0(i14);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.g6.G8;
        if (c6Var != null) {
            c6Var.q0(i15);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.g6.i6;
        if (c6Var != null) {
            c6Var.q0(i16);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.g6.Sh;
        int q04 = c6Var != null ? c6Var.q0(i17) : org.telegram.ui.ActionBar.g6.w0(null, i17, false);
        int i18 = org.telegram.ui.ActionBar.g6.Oh;
        int q05 = c6Var != null ? c6Var.q0(i18) : org.telegram.ui.ActionBar.g6.w0(null, i18, false);
        int q06 = c6Var != null ? c6Var.q0(org.telegram.ui.ActionBar.g6.Qh) : org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false);
        org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(context, c6Var);
        z2Var.a();
        int[] iArr = {0, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        c4 c4Var = new c4(context, c6Var, iArr);
        c4Var.setMinValue(0);
        c4Var.setMaxValue(16);
        c4Var.setTextColor(q02);
        c4Var.setValue(0);
        c4Var.setFormatter(new e1(1, iArr));
        d4 d4Var = new d4(context, c4Var, 0);
        d4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        d4Var.addView(frameLayout, h7.z5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.AutoDeleteAfteTitle));
        textView.setTextColor(q02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, h7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new kh.e(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        d4Var.addView(linearLayout, h7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        org.telegram.ui.Cells.r3 r3Var = new org.telegram.ui.Cells.r3(context, 1 == true ? 1 : 0, 1 == true ? 1 : 0, z10, 1);
        linearLayout.addView(c4Var, h7.z5.l(1.0f, 0, 270));
        r3Var.setPadding(0, 0, 0, 0);
        r3Var.setGravity(17);
        r3Var.setTextColor(q04);
        r3Var.setTextSize(AndroidUtilities.dp(14.0f));
        r3Var.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(8.0f);
        r3Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, q05, q06, q06));
        d4Var.addView(r3Var, h7.z5.t(-1, 48, 83, 16, 15, 16, 16));
        r3Var.setText(LocaleController.getString(R.string.DisableAutoDeleteTimer));
        c4Var.setOnValueChangedListener(new s(r3Var, 10));
        r3Var.setOnClickListener(new gh.a4(iArr, c4Var, x4Var, z2Var, 9));
        z2Var.b(d4Var);
        org.telegram.ui.ActionBar.e3 e3Var = z2Var.a;
        e3Var.show();
        e3Var.setBackgroundColor(q03);
        e3Var.fixNavigationBar(q03);
    }

    public static void k0(org.telegram.ui.rn rnVar, MessageObject messageObject, long j10, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.lg lgVar) {
        if (rnVar.getParentActivity() == null || messageObject == null) {
            return;
        }
        AccountInstance accountInstance = rnVar.getAccountInstance();
        TLRPC.User user = j10 > 0 ? accountInstance.getMessagesController().getUser(Long.valueOf(j10)) : null;
        TLRPC.Chat chat = j10 < 0 ? accountInstance.getMessagesController().getChat(Long.valueOf(-j10)) : null;
        if (user == null && chat == null) {
            return;
        }
        int i10 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rnVar.getParentActivity(), 0, c6Var);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.L0 = false;
        b2Var.J = new a1(lgVar, i10);
        b2Var.N = LocaleController.getString(R.string.BlockUser);
        if (user != null) {
            b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserReplyAlert", R.string.BlockUserReplyAlert, UserObject.getFirstName(user)));
        } else {
            b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserReplyAlert", R.string.BlockUserReplyAlert, chat.title));
        }
        LinearLayout linearLayout = new LinearLayout(rnVar.getParentActivity());
        linearLayout.setOrientation(1);
        org.telegram.ui.Cells.y1[] y1VarArr = {new org.telegram.ui.Cells.y1(rnVar.getParentActivity(), 1, c6Var)};
        y1VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
        y1VarArr[0].setTag(0);
        y1VarArr[0].e(LocaleController.getString(R.string.DeleteReportSpam), "", true, false, false);
        y1VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
        linearLayout.addView(y1VarArr[0], h7.z5.n(-1, -2));
        y1VarArr[0].setOnClickListener(new b1(y1VarArr, i10));
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.k(LocaleController.getString(R.string.BlockAndDeleteReplies), new cg.d0(user, accountInstance, rnVar, chat, messageObject, y1VarArr, c6Var));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        rnVar.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
        }
    }

    public static AlertDialog$Builder l(Activity activity, TLRPC.User user, Runnable runnable, org.telegram.ui.ActionBar.c6 c6Var) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, c6Var);
        String readRes = AndroidUtilities.readRes(org.telegram.ui.ActionBar.g6.A0().q() ? R.raw.permission_map_dark : R.raw.permission_map);
        String readRes2 = AndroidUtilities.readRes(org.telegram.ui.ActionBar.g6.A0().q() ? R.raw.permission_pin_dark : R.raw.permission_pin);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new l4());
        View view = new View(activity);
        view.setBackground(SvgHelper.getDrawable(readRes));
        frameLayout.addView(view, h7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view2 = new View(activity);
        view2.setBackground(SvgHelper.getDrawable(readRes2));
        frameLayout.addView(view2, h7.z5.d(60, 82.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
        n9 n9Var = new n9(activity);
        n9Var.setRoundRadius(AndroidUtilities.dp(26.0f));
        n9Var.e(user, new y8(0, user));
        frameLayout.addView(n9Var, h7.z5.d(52, 52.0f, 17, 0.0f, 0.0f, 0.0f, 11.0f));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.R = frameLayout;
        b2Var.K0 = 0.37820512f;
        alertDialog$Builder.a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionBackgroundLocation));
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new i1(activity, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new y0(1, runnable));
        return alertDialog$Builder;
    }

    public static void l0(Context context, int i10, long j10) {
        org.telegram.ui.ActionBar.e3 o10 = org.telegram.messenger.y1.o(context, null, false, false);
        LinearLayout g10 = org.telegram.messenger.y1.g(context, 1);
        g10.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        g10.addView(frameLayout, h7.z5.t(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.story_link);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, h7.z5.e(-1, -1, 17));
        frameLayout2.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false)));
        frameLayout.addView(frameLayout2, h7.z5.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.messenger.y1.s(textView, org.telegram.ui.ActionBar.g6.w0(null, i11, false), 1, 20.0f);
        org.telegram.messenger.rl.i(R.string.CallForbiddenInviteLinkTitle, textView, 17);
        TextView i12 = org.telegram.ui.Cells.pa.i(g10, textView, h7.z5.k(32.0f, 16.0f, 32.0f, 8.0f, -1, -2), context);
        i12.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        i12.setTextSize(1, 14.0f);
        i12.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CallForbiddenInviteLinkText, DialogObject.getName(i10, j10))));
        i12.setGravity(17);
        g10.addView(i12, h7.z5.k(32.0f, 0.0f, 32.0f, 18.0f, -1, -2));
        lh.d dVar = new lh.d(context, null, true);
        dVar.g(LocaleController.getString(R.string.CallForbiddenInviteLinkButton), false, true);
        g10.addView(dVar, h7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
        o10.customView = g10;
        dVar.setOnClickListener(new org.telegram.ui.md(i10, dVar, o10, j10));
        o10.fixNavigationBar();
        o10.show();
    }

    public static org.telegram.ui.ActionBar.z2 m(Context context, String str, String str2, TL_account.TL_birthday tL_birthday, Utilities.Callback callback, Runnable runnable, boolean z10, boolean z11, org.telegram.ui.ActionBar.c6 c6Var) {
        float f10;
        if (context == null) {
            return null;
        }
        org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(context, c6Var);
        z2Var.a();
        fc0 fc0Var = new fc0(context, c6Var);
        fc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        fc0Var.setItemCount(5);
        fc0 fc0Var2 = new fc0(context, c6Var);
        fc0Var2.setItemCount(5);
        fc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        fc0 fc0Var3 = new fc0(context, c6Var);
        fc0Var3.setItemCount(5);
        fc0Var3.setTextOffset(-AndroidUtilities.dp(24.0f));
        v3 v3Var = new v3(context, fc0Var, fc0Var2, fc0Var3);
        v3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        v3Var.addView(frameLayout, h7.z5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        org.telegram.messenger.rl.w(org.telegram.ui.ActionBar.g6.j5, c6Var, textView, 1, 20.0f);
        frameLayout.addView(textView, h7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new kh.e(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        v3Var.addView(linearLayout, h7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        int i10 = calendar.get(1) - 149;
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i11 = calendar.get(5);
        int i12 = calendar.get(2);
        int i13 = calendar.get(1);
        int i14 = i13 + 1;
        u2 u2Var = new u2(fc0Var3, i14, fc0Var, fc0Var2, i13, i12, i11);
        System.currentTimeMillis();
        w3 w3Var = new w3(context);
        linearLayout.addView(fc0Var, h7.z5.l(0.25f, 0, 270));
        fc0Var.setMinValue(1);
        fc0Var.setMaxValue(31);
        fc0Var.setWrapSelectorWheel(false);
        fc0Var.setFormatter(new c2(13));
        s sVar = new s(u2Var, 9);
        fc0Var.setOnScrollListener(sVar);
        fc0Var2.setMinValue(0);
        fc0Var2.setMaxValue(11);
        fc0Var2.setWrapSelectorWheel(false);
        linearLayout.addView(fc0Var2, h7.z5.l(0.5f, 0, 270));
        fc0Var2.setFormatter(new c2(14));
        fc0Var2.setOnScrollListener(sVar);
        fc0Var3.setMinValue(i10);
        fc0Var3.setMaxValue(i14);
        fc0Var3.setWrapSelectorWheel(false);
        fc0Var3.setFormatter(new h3.y(i14, 4));
        linearLayout.addView(fc0Var3, h7.z5.l(0.25f, 0, 270));
        fc0Var3.setOnScrollListener(sVar);
        if (tL_birthday != null) {
            fc0Var.setValue(tL_birthday.day);
            fc0Var2.setValue(tL_birthday.month - 1);
            if ((tL_birthday.flags & 1) != 0) {
                fc0Var3.setValue(tL_birthday.year);
            } else {
                fc0Var3.setValue(i14);
            }
        } else {
            fc0Var.setValue(calendar.get(5));
            fc0Var2.setValue(calendar.get(2));
            fc0Var3.setValue(i14);
        }
        u2Var.run();
        if (runnable != null) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            p80 p80Var = new p80(context, null);
            p80Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            p80Var.setTextSize(1, 13.0f);
            p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q5, c6Var));
            p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var));
            p80Var.setGravity(17);
            frameLayout2.addView(p80Var, h7.z5.e(-2, -2, 17));
            v3Var.addView(frameLayout2, h7.z5.n(-1, -2));
            int i15 = UserConfig.selectedAccount;
            cg.w1 w1Var = new cg.w1(i15, p80Var, 26);
            w1Var.run();
            f10 = 8.0f;
            NotificationCenter.getInstance(i15).listen(frameLayout2, NotificationCenter.privacyRulesUpdated, new v2(w1Var, 0));
            ContactsController.getInstance(i15).loadPrivacySettings();
        } else {
            f10 = 8.0f;
        }
        if (z10) {
            lh.d dVar = new lh.d(context, c6Var, false);
            dVar.g(LocaleController.getString(R.string.DateOfBirthHideYear), false, true);
            dVar.setOnClickListener(new gh.v2(fc0Var3, i14, u2Var, 8));
            v3Var.addView(dVar, h7.z5.t(-1, 48, 83, 16, 15, 16, 4));
        }
        w3Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        w3Var.setGravity(17);
        w3Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Sh, c6Var));
        w3Var.setTextSize(1, 14.0f);
        w3Var.setTypeface(AndroidUtilities.bold());
        w3Var.setText(str2);
        int dp = AndroidUtilities.dp(f10);
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var);
        int v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Qh, c6Var);
        w3Var.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, v02, v03, v03));
        h7.b6.a(w3Var);
        v3Var.addView(w3Var, h7.z5.t(-1, 48, 83, 16, z10 ? 0 : 15, 16, z11 ? 0 : 16));
        w3Var.setOnClickListener(new hh.u8(fc0Var, fc0Var2, fc0Var3, i14, z2Var, callback));
        if (z11) {
            lh.d dVar2 = new lh.d(context, c6Var, false);
            dVar2.g(LocaleController.getString(R.string.BirthdayRemove), false, true);
            dVar2.setOnClickListener(new q2(2, z2Var, callback));
            v3Var.addView(dVar2, h7.z5.t(-1, 48, 83, 16, 4, 16, 16));
        }
        z2Var.b(v3Var);
        return z2Var;
    }

    public static void m0(org.telegram.ui.ActionBar.n2 n2Var, String str) {
        if (str == null || !str.startsWith("FLOOD_WAIT") || n2Var == null || n2Var.getParentActivity() == null) {
            return;
        }
        int intValue = Utilities.parseInt((CharSequence) str).intValue();
        String formatPluralString = intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.N = string;
        b2Var.P = LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        n2Var.showDialog(b2Var, true, null);
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
    public static void n(org.telegram.ui.ActionBar.n2 n2Var, AtomicBoolean atomicBoolean, TLRPC.User user, Runnable runnable) {
        org.telegram.ui.Cells.y1[] y1VarArr;
        org.telegram.ui.ActionBar.b2 b2Var;
        n9 n9Var;
        boolean[] zArr;
        org.telegram.ui.Cells.y1 y1Var;
        if (n2Var == null) {
            return;
        }
        Context context = n2Var.getContext();
        org.telegram.ui.Cells.y1[] y1VarArr2 = new org.telegram.ui.Cells.y1[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        r4 r4Var = new r4(context, null);
        NotificationCenter.listenEmojiLoading(r4Var);
        r4Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.j5, false));
        r4Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.gc, false));
        r4Var.setTextSize(1, 16.0f);
        r4Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        s4 s4Var = new s4(context, y1VarArr2);
        org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.a;
        b2Var2.C = 6;
        alertDialog$Builder.n(s4Var);
        y8 y8Var = new y8((org.telegram.ui.ActionBar.c6) null);
        y8Var.u(AndroidUtilities.dp(18.0f));
        n9 n9Var2 = new n9(context);
        n9Var2.setRoundRadius(AndroidUtilities.dp(20.0f));
        s4Var.addView(n9Var2, h7.z5.d(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false));
        h5Var.setTextSize(20);
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        h5Var.setEllipsizeByGradient(true);
        h5Var.l(user.first_name, false);
        if (user.scam) {
            h5Var.i(org.telegram.ui.ActionBar.g6.g1);
        } else if (user.fake) {
            h5Var.i(org.telegram.ui.ActionBar.g6.h1);
        } else if (user.verified) {
            Drawable mutate = context.getResources().getDrawable(R.drawable.verified_area).mutate();
            y1VarArr = y1VarArr2;
            int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.z9, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(w02, mode));
            Drawable mutate2 = context.getResources().getDrawable(R.drawable.verified_check).mutate();
            b2Var = b2Var2;
            n9Var = n9Var2;
            zArr = null;
            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.A9, false), mode));
            h5Var.i(new dq(mutate, mutate2));
            TextView textView = new TextView(context);
            int w03 = org.telegram.ui.ActionBar.g6.w0(zArr, org.telegram.ui.ActionBar.g6.m5, false);
            int i10 = 1;
            org.telegram.messenger.rl.p(textView, w03, 1, 14.0f, 1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setGravity((!LocaleController.isRTL ? 5 : 3) | 16);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setOnClickListener(new t0(user, n2Var, alertDialog$Builder, i10));
            SpannableString valueOf = SpannableString.valueOf(LocaleController.getString(R.string.MoreAboutThisBot) + "  ");
            cq cqVar = new cq(R.drawable.attach_arrow_right, 0);
            cqVar.setTopOffset(1);
            cqVar.setSize(AndroidUtilities.dp(10.0f));
            valueOf.setSpan(cqVar, valueOf.length() - 1, valueOf.length(), 33);
            textView.setText(valueOf);
            boolean z10 = LocaleController.isRTL;
            s4Var.addView(h5Var, h7.z5.d(-1, -2.0f, (!z10 ? 5 : 3) | 48, !z10 ? 21 : 76, 0.0f, !z10 ? 76 : 21, 0.0f));
            boolean z11 = LocaleController.isRTL;
            s4Var.addView(textView, h7.z5.d(-1, -2.0f, (!z11 ? 5 : 3) | 48, !z11 ? 21 : 76, 24.0f, z11 ? 76 : 21, 0.0f));
            s4Var.addView(r4Var, h7.z5.d(-2, -2.0f, (!LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
            atomicBoolean.set(true);
            y1Var = new org.telegram.ui.Cells.y1(context, 1, n2Var.getResourceProvider());
            y1VarArr[0] = y1Var;
            if (!y1Var.D) {
                org.telegram.ui.Cells.w1 w1Var = y1Var.c;
                w1Var.setLines(3);
                w1Var.setMaxLines(3);
                w1Var.setSingleLine(false);
            }
            y1VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
            y1VarArr[0].e(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.OpenUrlOption2, UserObject.getUserName(user))), "", true, false, false);
            y1VarArr[0].setPadding(!LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, !LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
            y1VarArr[0].c(true, false);
            s4Var.addView(y1VarArr[0], h7.z5.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
            y1VarArr[0].setOnClickListener(new f0(atomicBoolean, 2));
            if (UserObject.isReplyUser(user)) {
                y8Var.p = 1.0f;
                y8Var.m(n2Var.getCurrentAccount(), user);
                n9Var.e(user, y8Var);
            } else {
                y8Var.p = 0.8f;
                y8Var.g(12);
                n9Var.h(null, null, y8Var, user);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.Start), new y0(3, runnable));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var3 = b2Var;
            n2Var.showDialog(b2Var3);
            r4Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebViewStartPermission2), new j1(1, context, b2Var3)));
        }
        y1VarArr = y1VarArr2;
        n9Var = n9Var2;
        b2Var = b2Var2;
        zArr = null;
        TextView textView2 = new TextView(context);
        int w032 = org.telegram.ui.ActionBar.g6.w0(zArr, org.telegram.ui.ActionBar.g6.m5, false);
        int i102 = 1;
        org.telegram.messenger.rl.p(textView2, w032, 1, 14.0f, 1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity((!LocaleController.isRTL ? 5 : 3) | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setOnClickListener(new t0(user, n2Var, alertDialog$Builder, i102));
        SpannableString valueOf2 = SpannableString.valueOf(LocaleController.getString(R.string.MoreAboutThisBot) + "  ");
        cq cqVar2 = new cq(R.drawable.attach_arrow_right, 0);
        cqVar2.setTopOffset(1);
        cqVar2.setSize(AndroidUtilities.dp(10.0f));
        valueOf2.setSpan(cqVar2, valueOf2.length() - 1, valueOf2.length(), 33);
        textView2.setText(valueOf2);
        boolean z102 = LocaleController.isRTL;
        s4Var.addView(h5Var, h7.z5.d(-1, -2.0f, (!z102 ? 5 : 3) | 48, !z102 ? 21 : 76, 0.0f, !z102 ? 76 : 21, 0.0f));
        boolean z112 = LocaleController.isRTL;
        s4Var.addView(textView2, h7.z5.d(-1, -2.0f, (!z112 ? 5 : 3) | 48, !z112 ? 21 : 76, 24.0f, z112 ? 76 : 21, 0.0f));
        s4Var.addView(r4Var, h7.z5.d(-2, -2.0f, (!LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
        atomicBoolean.set(true);
        y1Var = new org.telegram.ui.Cells.y1(context, 1, n2Var.getResourceProvider());
        y1VarArr[0] = y1Var;
        if (!y1Var.D) {
        }
        y1VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
        y1VarArr[0].e(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.OpenUrlOption2, UserObject.getUserName(user))), "", true, false, false);
        y1VarArr[0].setPadding(!LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, !LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
        y1VarArr[0].c(true, false);
        s4Var.addView(y1VarArr[0], h7.z5.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        y1VarArr[0].setOnClickListener(new f0(atomicBoolean, 2));
        if (UserObject.isReplyUser(user)) {
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Start), new y0(3, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var32 = b2Var;
        n2Var.showDialog(b2Var32);
        r4Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebViewStartPermission2), new j1(1, context, b2Var32)));
    }

    public static void n0(Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, Runnable runnable) {
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(j10);
        LinearLayout g10 = org.telegram.messenger.y1.g(context, 1);
        g10.addView(new hh.h4(context, tL_starGiftUnique, userOrChat), h7.z5.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.messenger.rl.l(org.telegram.ui.ActionBar.g6.j5, c6Var, textView, 1, 16.0f);
        org.telegram.messenger.rl.n(R.string.GiftThemesSetInReuseInfo, new Object[]{DialogObject.getDialogTitle(userOrChat)}, textView);
        g10.addView(textView, h7.z5.t(-1, -2, 48, 24, 0, 24, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        alertDialog$Builder.n(g10);
        alertDialog$Builder.k(LocaleController.getString(R.string.GiftThemesSetInReuseConfirm), new y0(2, runnable));
        i0.a.w(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void o(org.telegram.ui.ActionBar.n2 n2Var, TLRPC.User user, Runnable runnable, Runnable runnable2) {
        Context context = n2Var.getContext();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        m4 m4Var = new m4(context, null);
        NotificationCenter.listenEmojiLoading(m4Var);
        m4Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.j5, false));
        m4Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.gc, false));
        m4Var.setTextSize(1, 16.0f);
        m4Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        FrameLayout frameLayout = new FrameLayout(context);
        alertDialog$Builder.a.C = 6;
        alertDialog$Builder.n(frameLayout);
        y8 y8Var = new y8((org.telegram.ui.ActionBar.c6) null);
        y8Var.u(AndroidUtilities.dp(18.0f));
        n9 n9Var = new n9(context);
        n9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        frameLayout.addView(n9Var, h7.z5.d(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false));
        h5Var.setTextSize(20);
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        h5Var.setEllipsizeByGradient(true);
        h5Var.l(user.first_name, false);
        if (user.scam) {
            h5Var.i(org.telegram.ui.ActionBar.g6.g1);
        } else if (user.fake) {
            h5Var.i(org.telegram.ui.ActionBar.g6.h1);
        } else if (user.verified) {
            Drawable mutate = context.getResources().getDrawable(R.drawable.verified_area).mutate();
            int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.z9, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(w02, mode));
            Drawable mutate2 = context.getResources().getDrawable(R.drawable.verified_check).mutate();
            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.A9, false), mode));
            h5Var.i(new dq(mutate, mutate2));
        }
        TextView textView = new TextView(context);
        org.telegram.messenger.rl.p(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.m5, false), 1, 14.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new t0(user, n2Var, alertDialog$Builder, 0));
        SpannableString valueOf = SpannableString.valueOf(LocaleController.getString(R.string.MoreAboutThisBot) + "  ");
        cq cqVar = new cq(R.drawable.attach_arrow_right, 0);
        cqVar.setTopOffset(1);
        cqVar.setSize(AndroidUtilities.dp(10.0f));
        valueOf.setSpan(cqVar, valueOf.length() - 1, valueOf.length(), 33);
        textView.setText(valueOf);
        boolean z10 = LocaleController.isRTL;
        frameLayout.addView(h5Var, h7.z5.d(-1, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 21 : 76, 0.0f, z10 ? 76 : 21, 0.0f));
        boolean z11 = LocaleController.isRTL;
        frameLayout.addView(textView, h7.z5.d(-1, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 21 : 76, 24.0f, z11 ? 76 : 21, 0.0f));
        frameLayout.addView(m4Var, h7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
        if (UserObject.isReplyUser(user)) {
            y8Var.p = 0.8f;
            y8Var.g(12);
            n9Var.h(null, null, y8Var, user);
        } else {
            y8Var.p = 1.0f;
            y8Var.m(n2Var.getCurrentAccount(), user);
            n9Var.e(user, y8Var);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Start), new y0(0, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        DialogInterface.OnDismissListener r0Var = new r0(3, runnable2);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        n2Var.showDialog(b2Var, false, r0Var);
        m4Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebViewStartPermission2), new j1(0, context, b2Var)));
    }

    public static void o0(Context context, org.telegram.ui.ActionBar.c6 c6Var, String str, boolean z10, final Utilities.Callback2 callback2) {
        if (AndroidUtilities.isContextSafe(context)) {
            final org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
            alertDialog$Builder.a.N = LocaleController.getString(R.string.OpenUrlTitle);
            TextView textView = new TextView(context);
            textView.setText(str);
            textView.setTextSize(1, 14.0f);
            int i10 = org.telegram.ui.ActionBar.g6.j5;
            textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
            textView.setGravity(17);
            textView.setMaxLines(5);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
            gradientDrawable.setColor(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var)));
            textView.setBackground(gradientDrawable);
            final org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(context, 1, c6Var);
            y1Var.setMultiline(true);
            y1Var.getTextView().getLayoutParams().width = -1;
            y1Var.getTextView().setSingleLine(false);
            y1Var.getTextView().setMaxLines(3);
            y1Var.getTextView().setTextSize(1, 16.0f);
            y1Var.e(LocaleController.getString(z10 ? R.string.BrowserAlwaysOpenExternal : R.string.BrowserAlwaysOpenInApp), "", false, false, false);
            y1Var.setOnClickListener(new f0(y1Var, 1));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.addView(textView, h7.z5.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
            linearLayout.addView(y1Var, h7.z5.t(-1, -2, 3, 8, 6, 8, 4));
            alertDialog$Builder.n(linearLayout);
            alertDialog$Builder.a.a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
            final int i11 = 0;
            alertDialog$Builder.k(LocaleController.getString(R.string.Open), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.Components.h1
                @Override // org.telegram.ui.ActionBar.a2
                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i12) {
                    switch (i11) {
                        case 0:
                            callback2.run(Boolean.TRUE, Boolean.valueOf(y1Var.b()));
                            org.telegram.ui.ActionBar.b2 b2Var2 = b2VarArr[0];
                            if (b2Var2 != null) {
                                b2Var2.dismiss();
                                break;
                            }
                            break;
                        default:
                            callback2.run(Boolean.FALSE, Boolean.valueOf(y1Var.b()));
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
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.Components.h1
                @Override // org.telegram.ui.ActionBar.a2
                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i122) {
                    switch (i12) {
                        case 0:
                            callback2.run(Boolean.TRUE, Boolean.valueOf(y1Var.b()));
                            org.telegram.ui.ActionBar.b2 b2Var2 = b2VarArr[0];
                            if (b2Var2 != null) {
                                b2Var2.dismiss();
                                break;
                            }
                            break;
                        default:
                            callback2.run(Boolean.FALSE, Boolean.valueOf(y1Var.b()));
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

    public static org.telegram.ui.ActionBar.z2 p(Activity activity, MessagesStorage.IntCallback intCallback, org.telegram.ui.ActionBar.c6 c6Var) {
        if (activity == null) {
            return null;
        }
        org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(activity, c6Var);
        z2Var.a();
        fc0 fc0Var = new fc0(activity, c6Var);
        fc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        fc0Var.setItemCount(5);
        fc0 fc0Var2 = new fc0(activity, c6Var);
        fc0Var2.setItemCount(5);
        fc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        fc0 fc0Var3 = new fc0(activity, c6Var);
        fc0Var3.setItemCount(5);
        fc0Var3.setTextOffset(-AndroidUtilities.dp(24.0f));
        i4 i4Var = new i4(activity, fc0Var, fc0Var2, fc0Var3);
        i4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        i4Var.addView(frameLayout, h7.z5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(activity);
        textView.setText(LocaleController.getString(R.string.ChooseDate));
        org.telegram.messenger.rl.w(org.telegram.ui.ActionBar.g6.j5, c6Var, textView, 1, 20.0f);
        frameLayout.addView(textView, h7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new kh.e(10));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        i4Var.addView(linearLayout, h7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        System.currentTimeMillis();
        j4 j4Var = new j4(activity);
        linearLayout.addView(fc0Var, h7.z5.l(0.25f, 0, 270));
        fc0Var.setMinValue(1);
        fc0Var.setMaxValue(31);
        fc0Var.setWrapSelectorWheel(false);
        fc0Var.setFormatter(new org.telegram.ui.fr(11));
        l0 l0Var = new l0(fc0Var, fc0Var2, fc0Var3, 0);
        fc0Var.setOnValueChangedListener(l0Var);
        fc0Var2.setMinValue(0);
        fc0Var2.setMaxValue(11);
        fc0Var2.setWrapSelectorWheel(false);
        linearLayout.addView(fc0Var2, h7.z5.l(0.5f, 0, 270));
        fc0Var2.setFormatter(new org.telegram.ui.fr(12));
        fc0Var2.setOnValueChangedListener(l0Var);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(1375315200000L);
        int i10 = calendar.get(1);
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i11 = calendar.get(1);
        fc0Var3.setMinValue(i10);
        fc0Var3.setMaxValue(i11);
        fc0Var3.setWrapSelectorWheel(false);
        fc0Var3.setFormatter(new org.telegram.ui.fr(13));
        linearLayout.addView(fc0Var3, h7.z5.l(0.25f, 0, 270));
        fc0Var3.setOnValueChangedListener(l0Var);
        fc0Var.setValue(31);
        fc0Var2.setValue(12);
        fc0Var3.setValue(i11);
        b(fc0Var, fc0Var2, fc0Var3);
        j4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        j4Var.setGravity(17);
        j4Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Sh, c6Var));
        j4Var.setTextSize(1, 14.0f);
        j4Var.setTypeface(AndroidUtilities.bold());
        j4Var.setText(LocaleController.getString(R.string.JumpToDate));
        int dp = AndroidUtilities.dp(8.0f);
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var);
        int v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Qh, c6Var);
        j4Var.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, v02, v03, v03));
        i4Var.addView(j4Var, h7.z5.t(-1, 48, 83, 16, 15, 16, 16));
        j4Var.setOnClickListener(new cg.f(fc0Var, fc0Var2, fc0Var3, calendar, (Object) intCallback, z2Var, 1));
        z2Var.b(i4Var);
        return z2Var;
    }

    public static void p0(Context context, String str, boolean z10, boolean z11, boolean z12, boolean z13, long j10, we.d dVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.c6 c6Var) {
        String v;
        LinearLayout linearLayout;
        if (AndroidUtilities.isContextSafe(context)) {
            String scheme = str == null ? null : Uri.parse(str).getScheme();
            if (we.e.f(Uri.parse(str), false, null) || !z12 || "mailto".equalsIgnoreCase(scheme)) {
                we.e.r(context, Uri.parse(str), j10 == 0, z11, z13 && Uri.parse(str).getPath().matches("^/\\w*/[^\\d]*(?:\\?startapp=.*?|)$"), dVar, null, false, true, false);
                return;
            }
            if (z10) {
                try {
                    Uri parse = Uri.parse(str);
                    v = we.e.v(parse, null, null, we.e.a(parse.getHost()), null);
                } catch (Exception e9) {
                    FileLog.e((Throwable) e9, false);
                }
                m2 m2Var = new m2(context, str, j10, z11, dVar);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
                String string = LocaleController.getString(R.string.OpenUrlTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.N = string;
                TextView textView = new TextView(context);
                textView.setText(v);
                textView.setTextSize(1, 14.0f);
                int i10 = org.telegram.ui.ActionBar.g6.j5;
                textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
                textView.setGravity(17);
                textView.setMaxLines(5);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
                gradientDrawable.setColor(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var)));
                textView.setBackground(gradientDrawable);
                linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.addView(textView, h7.z5.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
                int i11 = x71.f;
                if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
                    x71 x71Var = new x71(context, c6Var);
                    x71Var.setWebPage(webPage);
                    linearLayout.addView(x71Var, h7.z5.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
                }
                alertDialog$Builder.n(linearLayout);
                b2Var.a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
                alertDialog$Builder.k(LocaleController.getString(R.string.Open), new s(m2Var, 8));
                i0.a.w(R.string.Cancel, alertDialog$Builder, null);
            }
            v = str;
            m2 m2Var2 = new m2(context, str, j10, z11, dVar);
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context, 0, c6Var);
            String string2 = LocaleController.getString(R.string.OpenUrlTitle);
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
            b2Var2.N = string2;
            TextView textView2 = new TextView(context);
            textView2.setText(v);
            textView2.setTextSize(1, 14.0f);
            int i102 = org.telegram.ui.ActionBar.g6.j5;
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i102, c6Var));
            textView2.setGravity(17);
            textView2.setMaxLines(5);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(AndroidUtilities.dp(22.0f));
            gradientDrawable2.setColor(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(i102, c6Var)));
            textView2.setBackground(gradientDrawable2);
            linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.addView(textView2, h7.z5.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
            int i112 = x71.f;
            if (webPage != null) {
                x71 x71Var2 = new x71(context, c6Var);
                x71Var2.setWebPage(webPage);
                linearLayout.addView(x71Var2, h7.z5.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
            }
            alertDialog$Builder2.n(linearLayout);
            b2Var2.a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Open), new s(m2Var2, 8));
            i0.a.w(R.string.Cancel, alertDialog$Builder2, null);
        }
    }

    public static void q(org.telegram.ui.ActionBar.n2 n2Var, TLRPC.User user, boolean z10) {
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
        i3 i3Var = new i3(parentActivity);
        NotificationCenter.listenEmojiLoading(i3Var);
        i3Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.j5, false));
        i3Var.setTextSize(1, 16.0f);
        int i10 = 5;
        i3Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        i3Var.setText(AndroidUtilities.replaceTags(formatString));
        y8 y8Var = new y8((org.telegram.ui.ActionBar.c6) null);
        y8Var.u(AndroidUtilities.dp(12.0f));
        y8Var.p = 1.0f;
        y8Var.m(n2Var.getCurrentAccount(), user);
        n9 n9Var = new n9(parentActivity);
        n9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        n9Var.e(user, y8Var);
        frameLayout.addView(n9Var, h7.z5.d(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        TextView textView = new TextView(parentActivity);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(string);
        boolean z11 = LocaleController.isRTL;
        frameLayout.addView(textView, h7.z5.d(-1, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 21 : 76, 11.0f, z11 ? 76 : 21, 0.0f));
        frameLayout.addView(i3Var, h7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
        alertDialog$Builder.n(frameLayout);
        alertDialog$Builder.k(LocaleController.getString(R.string.Call), new b5.d(n2Var, user, z10, i10));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        n2Var.showDialog(alertDialog$Builder.a);
    }

    public static void q0(org.telegram.ui.ActionBar.n2 n2Var, String str, boolean z10, boolean z11) {
        r0(n2Var, str, z10, true, z11, false, null, null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0180, code lost:
    
        if (org.telegram.messenger.ChatObject.isMonoForum(r34) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0198, code lost:
    
        r5 = new org.telegram.ui.Cells.y1(r6, 1, r37);
        r11[0] = r5;
        r5.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
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
        r15.addView(r11[0], h7.z5.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        r11[0].c(false, false);
        r11[0].setOnClickListener(new org.telegram.ui.Components.s0(4, r1));
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
    public static void r(org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.User user, TLRPC.Chat chat, boolean z10, MessagesStorage.BooleanCallback booleanCallback, org.telegram.ui.ActionBar.c6 c6Var) {
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
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, c6Var);
        long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
        org.telegram.ui.Cells.y1[] y1VarArr = new org.telegram.ui.Cells.y1[1];
        g3 g3Var = new g3(parentActivity);
        NotificationCenter.listenEmojiLoading(g3Var);
        g3Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.j5, false));
        g3Var.setTextSize(1, 16.0f);
        g3Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        h3 h3Var = new h3(parentActivity, y1VarArr);
        alertDialog$Builder.n(h3Var);
        TextView textView2 = new TextView(parentActivity);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false));
        textView2.setTextSize(1, 20.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        h3Var.addView(textView2, h7.z5.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 11.0f, 24.0f, 0.0f));
        h3Var.addView(g3Var, h7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 48.0f, 24.0f, 18.0f));
        if (i10 == -1) {
            textView2.setText(LocaleController.formatString("ClearHistory", R.string.ClearHistory, new Object[0]));
            if (user != null) {
                g3Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureClearHistoryWithUser", R.string.AreYouSureClearHistoryWithUser, UserObject.getUserName(user))));
            } else if (z10) {
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    i11 = 1;
                    g3Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureClearHistoryWithChannel", R.string.AreYouSureClearHistoryWithChannel, chat.title)));
                    zArr = new boolean[i11];
                    zArr[0] = false;
                    if (chat != null && z10 && ChatObject.isPublic(chat)) {
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
                    alertDialog$Builder.k(string, new g1(7, booleanCallback, zArr));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                    n2Var.showDialog(b2Var);
                    textView = (TextView) b2Var.d(-1);
                    if (textView == null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
                        return;
                    }
                    return;
                }
                g3Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureClearHistoryWithChat", R.string.AreYouSureClearHistoryWithChat, chat.title)));
            } else if (chat.megagroup) {
                g3Var.setText(LocaleController.getString(R.string.AreYouSureClearHistoryGroup));
            } else {
                g3Var.setText(LocaleController.getString(R.string.AreYouSureClearHistoryChannel));
            }
        } else {
            textView2.setText(LocaleController.formatPluralString("DeleteDays", i10, new Object[0]));
            g3Var.setText(LocaleController.getString(R.string.DeleteHistoryByDaysMessage));
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
        alertDialog$Builder.k(string, new g1(7, booleanCallback, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.a;
        n2Var.showDialog(b2Var2);
        textView = (TextView) b2Var2.d(-1);
        if (textView == null) {
        }
    }

    public static void r0(org.telegram.ui.ActionBar.n2 n2Var, String str, boolean z10, boolean z11, boolean z12, boolean z13, we.d dVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.c6 c6Var) {
        if (n2Var == null || n2Var.getParentActivity() == null) {
            return;
        }
        p0(n2Var.getParentActivity(), str, z10, z11, z12, z13, n2Var instanceof org.telegram.ui.rn ? ((org.telegram.ui.rn) n2Var).b8 : 0L, dVar, webPage, c6Var);
    }

    public static void s(org.telegram.ui.ActionBar.n2 n2Var, boolean z10, TLRPC.Chat chat, TLRPC.User user, boolean z11, boolean z12, boolean z13, boolean z14, MessagesStorage.BooleanCallback booleanCallback) {
        t(n2Var, z10, false, chat, user, z11, z12, z13, z14, booleanCallback, n2Var != null ? n2Var.getResourceProvider() : null);
    }

    public static void s0(Activity activity, int i10, Runnable runnable, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i11 = MessagesController.getInstance(i10).availableMapProviders;
        if ((i11 & 1) != 0) {
            org.telegram.ui.Cells.pa.z(R.string.MapPreviewProviderTelegram, 0, arrayList, arrayList2);
        }
        if ((i11 & 2) != 0) {
            org.telegram.ui.Cells.pa.z(R.string.MapPreviewProviderGoogle, 1, arrayList, arrayList2);
        }
        if ((i11 & 4) != 0) {
            org.telegram.ui.Cells.pa.z(R.string.MapPreviewProviderYandex, 3, arrayList, arrayList2);
        }
        arrayList.add(LocaleController.getString(R.string.MapPreviewProviderNobody));
        arrayList2.add(2);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, c6Var);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.MapPreviewProviderTitle);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(activity, c6Var);
            h6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            h6Var.setTag(Integer.valueOf(i12));
            h6Var.a(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.g7, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E5, false));
            h6Var.b((CharSequence) arrayList.get(i12), SharedConfig.mapPreviewType == ((Integer) arrayList2.get(i12)).intValue());
            h6Var.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.i6, false), 2, -1));
            linearLayout.addView(h6Var);
            h6Var.setOnClickListener(new gg.f((Object) arrayList2, runnable, (Object) alertDialog$Builder, 19));
        }
        if (!z10) {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        org.telegram.ui.ActionBar.b2 o10 = alertDialog$Builder.o();
        if (z10) {
            o10.setCanceledOnTouchOutside(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x05f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void t(final org.telegram.ui.ActionBar.n2 n2Var, final boolean z10, final boolean z11, TLRPC.Chat chat, final TLRPC.User user, final boolean z12, final boolean z13, boolean z14, final boolean z15, final MessagesStorage.BooleanCallback booleanCallback, final org.telegram.ui.ActionBar.c6 c6Var) {
        long j10;
        boolean z16;
        org.telegram.ui.Cells.y1[] y1VarArr;
        c3 c3Var;
        TLRPC.Chat chat2;
        org.telegram.ui.Cells.y1[] y1VarArr2;
        n9 n9Var;
        float f10;
        float f11;
        final TLRPC.Chat chat3;
        boolean z17;
        n9 n9Var2;
        org.telegram.ui.ActionBar.b2 b2Var;
        boolean z18;
        boolean z19;
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
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, c6Var);
        long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
        org.telegram.ui.Cells.y1[] y1VarArr3 = new org.telegram.ui.Cells.y1[1];
        c3 c3Var2 = new c3(parentActivity);
        NotificationCenter.listenEmojiLoading(c3Var2);
        c3Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.j5, false));
        c3Var2.setTextSize(1, 16.0f);
        c3Var2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        if (!z15 && ChatObject.isChannel(chat) && ChatObject.isPublic(chat)) {
            j10 = clientUserId;
            z16 = true;
        } else {
            j10 = clientUserId;
            z16 = false;
        }
        d3 d3Var = new d3(parentActivity, y1VarArr3);
        org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.a;
        b2Var2.C = 6;
        alertDialog$Builder.n(d3Var);
        y8 y8Var = new y8((org.telegram.ui.ActionBar.c6) null);
        y8Var.u(AndroidUtilities.dp(18.0f));
        n9 n9Var3 = new n9(parentActivity);
        n9Var3.setRoundRadius(AndroidUtilities.dp(15.0f));
        d3Var.addView(n9Var3, h7.z5.d(30, 30.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        j6 j6Var = new j6(parentActivity, false, false, false);
        final boolean z20 = z16;
        j6Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false));
        j6Var.setTextSize(AndroidUtilities.dp(20.0f));
        j6Var.setTypeface(AndroidUtilities.bold());
        j6Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        j6Var.setEllipsizeByGradient(true);
        if (z10) {
            if (z20) {
                j6Var.setText(LocaleController.getString(R.string.ClearHistoryCache));
            } else {
                j6Var.setText(LocaleController.getString(R.string.ClearHistory));
            }
        } else if (chat == null) {
            j6Var.setText(LocaleController.getString(R.string.DeleteChatUser));
        } else if (ChatObject.isCommunity(chat)) {
            j6Var.setText(LocaleController.getString(R.string.CommunityDelete));
        } else if (!ChatObject.isChannel(chat)) {
            j6Var.setText(LocaleController.getString(R.string.LeaveMega));
        } else if (chat.monoforum) {
            j6Var.setText(LocaleController.getString(R.string.LeaveConversationMenu));
        } else if (chat.megagroup) {
            j6Var.setText(LocaleController.getString(R.string.LeaveMega));
        } else {
            j6Var.setText(LocaleController.getString(R.string.LeaveChannel));
        }
        boolean z21 = LocaleController.isRTL;
        d3Var.addView(j6Var, h7.z5.d(-1, 24.0f, (z21 ? 5 : 3) | 48, z21 ? 22 : 65, 7.66f, z21 ? 65 : 22, 0.0f));
        d3Var.addView(c3Var2, h7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 49.0f, 24.0f, 1.0f));
        if (ChatObject.isMonoForum(chat)) {
            y1VarArr = y1VarArr3;
            c3Var = c3Var2;
            chat2 = n2Var.getMessagesController().getMonoForumLinkedChat(chat.id);
        } else {
            y1VarArr = y1VarArr3;
            c3Var = c3Var2;
            chat2 = null;
        }
        boolean z22 = !z12 && user != null && (user != null && !user.bot && (user.id > j10 ? 1 : (user.id == j10 ? 0 : -1)) != 0 && MessagesController.getInstance(currentAccount).canRevokePmInbox) && (user != null ? MessagesController.getInstance(currentAccount).revokeTimePmLimit : MessagesController.getInstance(currentAccount).revokeTimeLimit) == Integer.MAX_VALUE;
        c3 c3Var3 = c3Var;
        final boolean[] zArr = new boolean[1];
        ArrayList arrayList = user != null ? (ArrayList) MessagesController.getInstance(currentAccount).dialogMessage.f(user.id) : null;
        boolean z23 = (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((MessageObject) arrayList.get(0)).messageOwner == null || (!(((MessageObject) arrayList.get(0)).messageOwner.action instanceof TLRPC.TL_messageActionUserJoined) && !(((MessageObject) arrayList.get(0)).messageOwner.action instanceof TLRPC.TL_messageActionContactSignUp))) ? false : true;
        if (user != null) {
            f10 = 10.0f;
            if (user.bot) {
                n9Var = n9Var3;
                f11 = 8.0f;
                if (user.id != UserObject.VERIFY) {
                    org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(parentActivity, 1, c6Var);
                    y1VarArr[0] = y1Var;
                    y1Var.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
                    y1VarArr[0].e(LocaleController.getString(R.string.BlockBot), "", false, false, false);
                    org.telegram.ui.Cells.y1[] y1VarArr4 = y1VarArr;
                    y1VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f), LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), AndroidUtilities.dp(10.0f));
                    org.telegram.ui.Cells.y1 y1Var2 = y1VarArr4[0];
                    zArr[0] = true;
                    y1Var2.c(true, false);
                    y1VarArr4[0].setMultiline(true);
                    d3Var.addView(y1VarArr4[0], h7.z5.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                    y1VarArr4[0].setOnClickListener(new s0(3, zArr));
                    chat3 = chat;
                    n9Var2 = n9Var;
                    b2Var = b2Var2;
                    z18 = false;
                    if (user == null) {
                        n9 n9Var4 = n9Var2;
                        y8Var.k(n2Var.getCurrentAccount(), chat2 != null ? chat2 : chat3);
                        n9Var4.e(chat2 != null ? chat2 : chat3, y8Var);
                    } else if (UserObject.isReplyUser(user)) {
                        y8Var.p = 0.8f;
                        y8Var.g(12);
                        n9Var2.h(null, null, y8Var, user);
                    } else {
                        n9 n9Var5 = n9Var2;
                        if (user.id == j10) {
                            y8Var.p = 0.8f;
                            y8Var.g(1);
                            n9Var5.h(null, null, y8Var, user);
                        } else {
                            y8Var.p = 1.0f;
                            y8Var.m(n2Var.getCurrentAccount(), user);
                            n9Var5.e(user, y8Var);
                        }
                    }
                    if (z11) {
                        if (UserObject.isUserSelf(user)) {
                            c3Var3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DeleteAllMessagesSavedAlert)));
                        } else if (chat3 == null || !ChatObject.isChannelAndNotMegaGroup(chat3)) {
                            c3Var3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DeleteAllMessagesAlert)));
                        } else {
                            c3Var3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DeleteAllMessagesChannelAlert)));
                        }
                    } else if (z10) {
                        if (user == null) {
                            String formatString = chat2 != null ? LocaleController.formatString(R.string.MonoforumTitle, chat2.title) : chat3.title;
                            if (!ChatObject.isChannel(chat3) || (chat3.megagroup && !ChatObject.isPublic(chat3))) {
                                c3Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithChat, formatString)));
                            } else if (chat3.megagroup) {
                                c3Var3.setText(LocaleController.getString(R.string.AreYouSureClearHistoryGroup));
                            } else {
                                c3Var3.setText(LocaleController.getString(R.string.AreYouSureClearHistoryChannel));
                            }
                        } else if (z12) {
                            c3Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithSecretUser, UserObject.getUserName(user))));
                        } else if (user.id == j10) {
                            c3Var3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AreYouSureClearHistorySavedMessages)));
                        } else {
                            c3Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithUser, UserObject.getUserName(user))));
                        }
                    } else if (user != null) {
                        if (z12) {
                            c3Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteThisChatWithSecretUser, UserObject.getUserName(user))));
                        } else if (user.id == j10) {
                            c3Var3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AreYouSureDeleteThisChatSavedMessages)));
                        } else if (!user.bot || user.support) {
                            c3Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteThisChatWithUser, UserObject.getUserName(user))));
                        } else {
                            c3Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteThisChatWithBotWithCheckmark, UserObject.getUserName(user))));
                        }
                    } else if (ChatObject.isChannel(chat3)) {
                        String formatString2 = chat2 != null ? LocaleController.formatString(R.string.MonoforumTitle, chat2.title) : chat3.title;
                        if (chat3.megagroup) {
                            c3Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.MegaLeaveAlertWithName, formatString2)));
                        } else {
                            c3Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.ChannelLeaveAlertWithName, formatString2)));
                        }
                    } else {
                        c3Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteAndExitName, chat3.title)));
                    }
                    if (z11) {
                        string = LocaleController.getString(R.string.DeleteAll);
                    } else {
                        if (!z10) {
                            if (z18 && zArr[0]) {
                                string = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat3) ? R.string.ChannelDelete : R.string.DeleteMega);
                            } else {
                                string = ChatObject.isChannel(chat3) ? chat3.monoforum ? LocaleController.getString(R.string.LeaveConversationMenu) : chat3.megagroup ? LocaleController.getString(R.string.LeaveMegaMenu) : LocaleController.getString(R.string.LeaveChannelMenu) : LocaleController.getString(R.string.DeleteChatUser);
                            }
                            org.telegram.ui.ActionBar.b2 b2Var3 = b2Var;
                            alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.Components.s2
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
                                        final org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                                        if (isUserSelf) {
                                            y4.t(n2Var2, z27, true, chat4, user2, false, z28, zArr3[0], z29, booleanCallback2, c6Var2);
                                            return;
                                        }
                                        if (user2 != null && zArr3[0]) {
                                            MessagesStorage.getInstance(n2Var2.getCurrentAccount()).getMessagesCount(user2.id, new MessagesStorage.IntCallback() { // from class: org.telegram.ui.Components.m1
                                                @Override // org.telegram.messenger.MessagesStorage.IntCallback
                                                public final void run(int i11) {
                                                    boolean[] zArr4 = zArr3;
                                                    MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                                    if (i11 >= 50) {
                                                        y4.t(org.telegram.ui.ActionBar.n2.this, z27, true, chat4, user2, false, z28, zArr4[0], z29, booleanCallback3, c6Var2);
                                                    } else if (booleanCallback3 != null) {
                                                        booleanCallback3.run(zArr4[0]);
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                        zArr2 = zArr3;
                                        if (ChatObject.isChannel(chat4) && chat4.creator && !zArr2[0]) {
                                            final we.d g10 = alertDialog$Builder.a.g(-1, true, true);
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
                                                    we.d.this.c(false);
                                                    TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                                    MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                                    if (user4 == null) {
                                                        booleanCallback3.run(z25 || zArr2[0]);
                                                        return;
                                                    }
                                                    Context context2 = context;
                                                    TLRPC.Chat chat5 = chat4;
                                                    gf.k0 k0Var = new gf.k0(context2, chat5, user4, i11, booleanCallback3, c6Var2, 8);
                                                    s1 s1Var = new s1(booleanCallback3, 0);
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
                                                    n9 n9Var6 = new n9(context3);
                                                    y8 y8Var2 = new y8((org.telegram.ui.ActionBar.c6) null);
                                                    y8Var2.r(currentUser);
                                                    n9Var6.setRoundRadius(AndroidUtilities.dp(30.0f));
                                                    n9Var6.e(currentUser, y8Var2);
                                                    frameLayout.addView(n9Var6, h7.z5.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                                    ImageView imageView = new ImageView(context3);
                                                    imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                                    imageView.setColorFilter(new PorterDuffColorFilter(n2Var3.getThemedColor(org.telegram.ui.ActionBar.g6.d7), PorterDuff.Mode.SRC_IN));
                                                    frameLayout.addView(imageView, h7.z5.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                                    e3 e3Var = new e3(context3);
                                                    y8 y8Var3 = new y8((org.telegram.ui.ActionBar.c6) null);
                                                    y8Var3.r(user4);
                                                    e3Var.setRoundRadius(AndroidUtilities.dp(30.0f));
                                                    e3Var.e(user4, y8Var3);
                                                    frameLayout.addView(e3Var, h7.z5.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                                    n9 n9Var7 = new n9(context3);
                                                    y8 y8Var4 = new y8((org.telegram.ui.ActionBar.c6) null);
                                                    y8Var4.q(chat5);
                                                    n9Var7.setRoundRadius(AndroidUtilities.dp(12.0f));
                                                    n9Var7.e(chat5, y8Var4);
                                                    frameLayout.addView(n9Var7, h7.z5.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                                    org.telegram.ui.ActionBar.b2 b2Var5 = alertDialog$Builder2.a;
                                                    b2Var5.K0 = -1.0f;
                                                    b2Var5.R = frameLayout;
                                                    b2Var5.N = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannelTitle : R.string.LeaveGroupTitle);
                                                    b2Var5.P = AndroidUtilities.replaceTags(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.LeaveChannelNewOwnerText : R.string.LeaveGroupNewOwnerText, UserObject.getUserName(user4), chat5.title));
                                                    alertDialog$Builder2.h(LocaleController.getString(R.string.AppointNewOwner), new s(k0Var, 4));
                                                    alertDialog$Builder2.i(LocaleController.getString(R.string.Cancel), null);
                                                    alertDialog$Builder2.k(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannel : R.string.LeaveMegaMenu), new s(s1Var, 5));
                                                    b2Var5.show();
                                                    View d = b2Var5.d(-1);
                                                    if (d instanceof TextView) {
                                                        ((TextView) d).setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
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
                            if (textView == null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
                                return;
                            }
                            return;
                        }
                        string = z20 ? LocaleController.getString(R.string.ClearHistoryCache) : LocaleController.getString(R.string.ClearForMe);
                    }
                    org.telegram.ui.ActionBar.b2 b2Var32 = b2Var;
                    alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.Components.s2
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
                                final org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                                if (isUserSelf) {
                                    y4.t(n2Var2, z27, true, chat4, user2, false, z28, zArr3[0], z29, booleanCallback2, c6Var2);
                                    return;
                                }
                                if (user2 != null && zArr3[0]) {
                                    MessagesStorage.getInstance(n2Var2.getCurrentAccount()).getMessagesCount(user2.id, new MessagesStorage.IntCallback() { // from class: org.telegram.ui.Components.m1
                                        @Override // org.telegram.messenger.MessagesStorage.IntCallback
                                        public final void run(int i11) {
                                            boolean[] zArr4 = zArr3;
                                            MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                            if (i11 >= 50) {
                                                y4.t(org.telegram.ui.ActionBar.n2.this, z27, true, chat4, user2, false, z28, zArr4[0], z29, booleanCallback3, c6Var2);
                                            } else if (booleanCallback3 != null) {
                                                booleanCallback3.run(zArr4[0]);
                                            }
                                        }
                                    });
                                    return;
                                }
                                zArr2 = zArr3;
                                if (ChatObject.isChannel(chat4) && chat4.creator && !zArr2[0]) {
                                    final we.d g10 = alertDialog$Builder.a.g(-1, true, true);
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
                                            we.d.this.c(false);
                                            TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                            MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                            if (user4 == null) {
                                                booleanCallback3.run(z25 || zArr2[0]);
                                                return;
                                            }
                                            Context context2 = context;
                                            TLRPC.Chat chat5 = chat4;
                                            gf.k0 k0Var = new gf.k0(context2, chat5, user4, i11, booleanCallback3, c6Var2, 8);
                                            s1 s1Var = new s1(booleanCallback3, 0);
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
                                            n9 n9Var6 = new n9(context3);
                                            y8 y8Var2 = new y8((org.telegram.ui.ActionBar.c6) null);
                                            y8Var2.r(currentUser);
                                            n9Var6.setRoundRadius(AndroidUtilities.dp(30.0f));
                                            n9Var6.e(currentUser, y8Var2);
                                            frameLayout.addView(n9Var6, h7.z5.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                            ImageView imageView = new ImageView(context3);
                                            imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                            imageView.setColorFilter(new PorterDuffColorFilter(n2Var3.getThemedColor(org.telegram.ui.ActionBar.g6.d7), PorterDuff.Mode.SRC_IN));
                                            frameLayout.addView(imageView, h7.z5.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                            e3 e3Var = new e3(context3);
                                            y8 y8Var3 = new y8((org.telegram.ui.ActionBar.c6) null);
                                            y8Var3.r(user4);
                                            e3Var.setRoundRadius(AndroidUtilities.dp(30.0f));
                                            e3Var.e(user4, y8Var3);
                                            frameLayout.addView(e3Var, h7.z5.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                            n9 n9Var7 = new n9(context3);
                                            y8 y8Var4 = new y8((org.telegram.ui.ActionBar.c6) null);
                                            y8Var4.q(chat5);
                                            n9Var7.setRoundRadius(AndroidUtilities.dp(12.0f));
                                            n9Var7.e(chat5, y8Var4);
                                            frameLayout.addView(n9Var7, h7.z5.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                            org.telegram.ui.ActionBar.b2 b2Var5 = alertDialog$Builder2.a;
                                            b2Var5.K0 = -1.0f;
                                            b2Var5.R = frameLayout;
                                            b2Var5.N = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannelTitle : R.string.LeaveGroupTitle);
                                            b2Var5.P = AndroidUtilities.replaceTags(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.LeaveChannelNewOwnerText : R.string.LeaveGroupNewOwnerText, UserObject.getUserName(user4), chat5.title));
                                            alertDialog$Builder2.h(LocaleController.getString(R.string.AppointNewOwner), new s(k0Var, 4));
                                            alertDialog$Builder2.i(LocaleController.getString(R.string.Cancel), null);
                                            alertDialog$Builder2.k(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannel : R.string.LeaveMegaMenu), new s(s1Var, 5));
                                            b2Var5.show();
                                            View d = b2Var5.d(-1);
                                            if (d instanceof TextView) {
                                                ((TextView) d).setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
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
                    if (textView == null) {
                    }
                } else {
                    y1VarArr2 = y1VarArr;
                    if (!z11 || (((!z12 || z10) && !z22) || UserObject.isDeleted(user) || z23)) {
                        if (z13 || z10 || chat == null) {
                            chat3 = chat;
                        } else {
                            chat3 = chat;
                            if (chat3.creator) {
                                z17 = true;
                                if (!z17) {
                                    n9Var2 = n9Var;
                                    b2Var = b2Var2;
                                    z18 = z17;
                                    if (user == null) {
                                    }
                                    if (z11) {
                                    }
                                    if (z11) {
                                    }
                                    org.telegram.ui.ActionBar.b2 b2Var322 = b2Var;
                                    alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.Components.s2
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
                                                final org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                                                if (isUserSelf) {
                                                    y4.t(n2Var2, z27, true, chat4, user2, false, z28, zArr3[0], z29, booleanCallback2, c6Var2);
                                                    return;
                                                }
                                                if (user2 != null && zArr3[0]) {
                                                    MessagesStorage.getInstance(n2Var2.getCurrentAccount()).getMessagesCount(user2.id, new MessagesStorage.IntCallback() { // from class: org.telegram.ui.Components.m1
                                                        @Override // org.telegram.messenger.MessagesStorage.IntCallback
                                                        public final void run(int i11) {
                                                            boolean[] zArr4 = zArr3;
                                                            MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                                            if (i11 >= 50) {
                                                                y4.t(org.telegram.ui.ActionBar.n2.this, z27, true, chat4, user2, false, z28, zArr4[0], z29, booleanCallback3, c6Var2);
                                                            } else if (booleanCallback3 != null) {
                                                                booleanCallback3.run(zArr4[0]);
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                                zArr2 = zArr3;
                                                if (ChatObject.isChannel(chat4) && chat4.creator && !zArr2[0]) {
                                                    final we.d g10 = alertDialog$Builder.a.g(-1, true, true);
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
                                                            we.d.this.c(false);
                                                            TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                                            MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                                            if (user4 == null) {
                                                                booleanCallback3.run(z25 || zArr2[0]);
                                                                return;
                                                            }
                                                            Context context2 = context;
                                                            TLRPC.Chat chat5 = chat4;
                                                            gf.k0 k0Var = new gf.k0(context2, chat5, user4, i11, booleanCallback3, c6Var2, 8);
                                                            s1 s1Var = new s1(booleanCallback3, 0);
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
                                                            n9 n9Var6 = new n9(context3);
                                                            y8 y8Var2 = new y8((org.telegram.ui.ActionBar.c6) null);
                                                            y8Var2.r(currentUser);
                                                            n9Var6.setRoundRadius(AndroidUtilities.dp(30.0f));
                                                            n9Var6.e(currentUser, y8Var2);
                                                            frameLayout.addView(n9Var6, h7.z5.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                                            ImageView imageView = new ImageView(context3);
                                                            imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                                            imageView.setColorFilter(new PorterDuffColorFilter(n2Var3.getThemedColor(org.telegram.ui.ActionBar.g6.d7), PorterDuff.Mode.SRC_IN));
                                                            frameLayout.addView(imageView, h7.z5.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                                            e3 e3Var = new e3(context3);
                                                            y8 y8Var3 = new y8((org.telegram.ui.ActionBar.c6) null);
                                                            y8Var3.r(user4);
                                                            e3Var.setRoundRadius(AndroidUtilities.dp(30.0f));
                                                            e3Var.e(user4, y8Var3);
                                                            frameLayout.addView(e3Var, h7.z5.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                                            n9 n9Var7 = new n9(context3);
                                                            y8 y8Var4 = new y8((org.telegram.ui.ActionBar.c6) null);
                                                            y8Var4.q(chat5);
                                                            n9Var7.setRoundRadius(AndroidUtilities.dp(12.0f));
                                                            n9Var7.e(chat5, y8Var4);
                                                            frameLayout.addView(n9Var7, h7.z5.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                                            org.telegram.ui.ActionBar.b2 b2Var5 = alertDialog$Builder2.a;
                                                            b2Var5.K0 = -1.0f;
                                                            b2Var5.R = frameLayout;
                                                            b2Var5.N = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannelTitle : R.string.LeaveGroupTitle);
                                                            b2Var5.P = AndroidUtilities.replaceTags(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.LeaveChannelNewOwnerText : R.string.LeaveGroupNewOwnerText, UserObject.getUserName(user4), chat5.title));
                                                            alertDialog$Builder2.h(LocaleController.getString(R.string.AppointNewOwner), new s(k0Var, 4));
                                                            alertDialog$Builder2.i(LocaleController.getString(R.string.Cancel), null);
                                                            alertDialog$Builder2.k(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannel : R.string.LeaveMegaMenu), new s(s1Var, 5));
                                                            b2Var5.show();
                                                            View d = b2Var5.d(-1);
                                                            if (d instanceof TextView) {
                                                                ((TextView) d).setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
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
                                    if (textView == null) {
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
                    org.telegram.ui.Cells.y1 y1Var3 = new org.telegram.ui.Cells.y1(parentActivity, 1, c6Var);
                    y1VarArr2[0] = y1Var3;
                    y1Var3.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
                    if (z17) {
                        if (z10) {
                            y1VarArr2[0].e(LocaleController.formatString(R.string.ClearHistoryOptionAlso, UserObject.getFirstName(user)), "", false, false, false);
                        } else {
                            z19 = true;
                            y1VarArr2[0].e(LocaleController.formatString(R.string.DeleteMessagesOptionAlso, UserObject.getFirstName(user)), "", false, false, false);
                            y1VarArr2[0].setMultiline(z19);
                            n9Var2 = n9Var;
                            b2Var = b2Var2;
                            y1VarArr2[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(f11), AndroidUtilities.dp(f10), LocaleController.isRTL ? AndroidUtilities.dp(f11) : AndroidUtilities.dp(16.0f), AndroidUtilities.dp(f10));
                            d3Var.addView(y1VarArr2[0], h7.z5.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                            cg.c cVar = new cg.c(z17, chat3, alertDialog$Builder, zArr);
                            y1VarArr2[0].setOnClickListener(new q2(0, zArr, cVar));
                            if (z14) {
                                org.telegram.ui.Cells.y1 y1Var4 = y1VarArr2[0];
                                zArr[0] = true;
                                y1Var4.c(true, false);
                                cVar.run();
                            }
                            z18 = z17;
                            if (user == null) {
                            }
                            if (z11) {
                            }
                            if (z11) {
                            }
                            org.telegram.ui.ActionBar.b2 b2Var3222 = b2Var;
                            alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.Components.s2
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
                                        final org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                                        if (isUserSelf) {
                                            y4.t(n2Var2, z27, true, chat4, user2, false, z28, zArr3[0], z29, booleanCallback2, c6Var2);
                                            return;
                                        }
                                        if (user2 != null && zArr3[0]) {
                                            MessagesStorage.getInstance(n2Var2.getCurrentAccount()).getMessagesCount(user2.id, new MessagesStorage.IntCallback() { // from class: org.telegram.ui.Components.m1
                                                @Override // org.telegram.messenger.MessagesStorage.IntCallback
                                                public final void run(int i11) {
                                                    boolean[] zArr4 = zArr3;
                                                    MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                                    if (i11 >= 50) {
                                                        y4.t(org.telegram.ui.ActionBar.n2.this, z27, true, chat4, user2, false, z28, zArr4[0], z29, booleanCallback3, c6Var2);
                                                    } else if (booleanCallback3 != null) {
                                                        booleanCallback3.run(zArr4[0]);
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                        zArr2 = zArr3;
                                        if (ChatObject.isChannel(chat4) && chat4.creator && !zArr2[0]) {
                                            final we.d g10 = alertDialog$Builder.a.g(-1, true, true);
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
                                                    we.d.this.c(false);
                                                    TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                                    MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                                    if (user4 == null) {
                                                        booleanCallback3.run(z25 || zArr2[0]);
                                                        return;
                                                    }
                                                    Context context2 = context;
                                                    TLRPC.Chat chat5 = chat4;
                                                    gf.k0 k0Var = new gf.k0(context2, chat5, user4, i11, booleanCallback3, c6Var2, 8);
                                                    s1 s1Var = new s1(booleanCallback3, 0);
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
                                                    n9 n9Var6 = new n9(context3);
                                                    y8 y8Var2 = new y8((org.telegram.ui.ActionBar.c6) null);
                                                    y8Var2.r(currentUser);
                                                    n9Var6.setRoundRadius(AndroidUtilities.dp(30.0f));
                                                    n9Var6.e(currentUser, y8Var2);
                                                    frameLayout.addView(n9Var6, h7.z5.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                                    ImageView imageView = new ImageView(context3);
                                                    imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                                    imageView.setColorFilter(new PorterDuffColorFilter(n2Var3.getThemedColor(org.telegram.ui.ActionBar.g6.d7), PorterDuff.Mode.SRC_IN));
                                                    frameLayout.addView(imageView, h7.z5.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                                    e3 e3Var = new e3(context3);
                                                    y8 y8Var3 = new y8((org.telegram.ui.ActionBar.c6) null);
                                                    y8Var3.r(user4);
                                                    e3Var.setRoundRadius(AndroidUtilities.dp(30.0f));
                                                    e3Var.e(user4, y8Var3);
                                                    frameLayout.addView(e3Var, h7.z5.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                                    n9 n9Var7 = new n9(context3);
                                                    y8 y8Var4 = new y8((org.telegram.ui.ActionBar.c6) null);
                                                    y8Var4.q(chat5);
                                                    n9Var7.setRoundRadius(AndroidUtilities.dp(12.0f));
                                                    n9Var7.e(chat5, y8Var4);
                                                    frameLayout.addView(n9Var7, h7.z5.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                                    org.telegram.ui.ActionBar.b2 b2Var5 = alertDialog$Builder2.a;
                                                    b2Var5.K0 = -1.0f;
                                                    b2Var5.R = frameLayout;
                                                    b2Var5.N = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannelTitle : R.string.LeaveGroupTitle);
                                                    b2Var5.P = AndroidUtilities.replaceTags(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.LeaveChannelNewOwnerText : R.string.LeaveGroupNewOwnerText, UserObject.getUserName(user4), chat5.title));
                                                    alertDialog$Builder2.h(LocaleController.getString(R.string.AppointNewOwner), new s(k0Var, 4));
                                                    alertDialog$Builder2.i(LocaleController.getString(R.string.Cancel), null);
                                                    alertDialog$Builder2.k(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannel : R.string.LeaveMegaMenu), new s(s1Var, 5));
                                                    b2Var5.show();
                                                    View d = b2Var5.d(-1);
                                                    if (d instanceof TextView) {
                                                        ((TextView) d).setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
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
                            if (textView == null) {
                            }
                        }
                    } else if (!ChatObject.isChannel(chat3) || chat3.megagroup) {
                        y1VarArr2[0].e(LocaleController.getString(R.string.DeleteGroupForAll), "", false, false, false);
                    } else {
                        y1VarArr2[0].e(LocaleController.getString(R.string.DeleteChannelForAll), "", false, false, false);
                    }
                    z19 = true;
                    y1VarArr2[0].setMultiline(z19);
                    n9Var2 = n9Var;
                    b2Var = b2Var2;
                    y1VarArr2[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(f11), AndroidUtilities.dp(f10), LocaleController.isRTL ? AndroidUtilities.dp(f11) : AndroidUtilities.dp(16.0f), AndroidUtilities.dp(f10));
                    d3Var.addView(y1VarArr2[0], h7.z5.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                    cg.c cVar2 = new cg.c(z17, chat3, alertDialog$Builder, zArr);
                    y1VarArr2[0].setOnClickListener(new q2(0, zArr, cVar2));
                    if (z14) {
                    }
                    z18 = z17;
                    if (user == null) {
                    }
                    if (z11) {
                    }
                    if (z11) {
                    }
                    org.telegram.ui.ActionBar.b2 b2Var32222 = b2Var;
                    alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.Components.s2
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
                                final org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                                if (isUserSelf) {
                                    y4.t(n2Var2, z27, true, chat4, user2, false, z28, zArr3[0], z29, booleanCallback2, c6Var2);
                                    return;
                                }
                                if (user2 != null && zArr3[0]) {
                                    MessagesStorage.getInstance(n2Var2.getCurrentAccount()).getMessagesCount(user2.id, new MessagesStorage.IntCallback() { // from class: org.telegram.ui.Components.m1
                                        @Override // org.telegram.messenger.MessagesStorage.IntCallback
                                        public final void run(int i11) {
                                            boolean[] zArr4 = zArr3;
                                            MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                            if (i11 >= 50) {
                                                y4.t(org.telegram.ui.ActionBar.n2.this, z27, true, chat4, user2, false, z28, zArr4[0], z29, booleanCallback3, c6Var2);
                                            } else if (booleanCallback3 != null) {
                                                booleanCallback3.run(zArr4[0]);
                                            }
                                        }
                                    });
                                    return;
                                }
                                zArr2 = zArr3;
                                if (ChatObject.isChannel(chat4) && chat4.creator && !zArr2[0]) {
                                    final we.d g10 = alertDialog$Builder.a.g(-1, true, true);
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
                                            we.d.this.c(false);
                                            TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                            MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                            if (user4 == null) {
                                                booleanCallback3.run(z25 || zArr2[0]);
                                                return;
                                            }
                                            Context context2 = context;
                                            TLRPC.Chat chat5 = chat4;
                                            gf.k0 k0Var = new gf.k0(context2, chat5, user4, i11, booleanCallback3, c6Var2, 8);
                                            s1 s1Var = new s1(booleanCallback3, 0);
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
                                            n9 n9Var6 = new n9(context3);
                                            y8 y8Var2 = new y8((org.telegram.ui.ActionBar.c6) null);
                                            y8Var2.r(currentUser);
                                            n9Var6.setRoundRadius(AndroidUtilities.dp(30.0f));
                                            n9Var6.e(currentUser, y8Var2);
                                            frameLayout.addView(n9Var6, h7.z5.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                            ImageView imageView = new ImageView(context3);
                                            imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                            imageView.setColorFilter(new PorterDuffColorFilter(n2Var3.getThemedColor(org.telegram.ui.ActionBar.g6.d7), PorterDuff.Mode.SRC_IN));
                                            frameLayout.addView(imageView, h7.z5.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                            e3 e3Var = new e3(context3);
                                            y8 y8Var3 = new y8((org.telegram.ui.ActionBar.c6) null);
                                            y8Var3.r(user4);
                                            e3Var.setRoundRadius(AndroidUtilities.dp(30.0f));
                                            e3Var.e(user4, y8Var3);
                                            frameLayout.addView(e3Var, h7.z5.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                            n9 n9Var7 = new n9(context3);
                                            y8 y8Var4 = new y8((org.telegram.ui.ActionBar.c6) null);
                                            y8Var4.q(chat5);
                                            n9Var7.setRoundRadius(AndroidUtilities.dp(12.0f));
                                            n9Var7.e(chat5, y8Var4);
                                            frameLayout.addView(n9Var7, h7.z5.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                            org.telegram.ui.ActionBar.b2 b2Var5 = alertDialog$Builder2.a;
                                            b2Var5.K0 = -1.0f;
                                            b2Var5.R = frameLayout;
                                            b2Var5.N = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannelTitle : R.string.LeaveGroupTitle);
                                            b2Var5.P = AndroidUtilities.replaceTags(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.LeaveChannelNewOwnerText : R.string.LeaveGroupNewOwnerText, UserObject.getUserName(user4), chat5.title));
                                            alertDialog$Builder2.h(LocaleController.getString(R.string.AppointNewOwner), new s(k0Var, 4));
                                            alertDialog$Builder2.i(LocaleController.getString(R.string.Cancel), null);
                                            alertDialog$Builder2.k(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannel : R.string.LeaveMegaMenu), new s(s1Var, 5));
                                            b2Var5.show();
                                            View d = b2Var5.d(-1);
                                            if (d instanceof TextView) {
                                                ((TextView) d).setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
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
                    if (textView == null) {
                    }
                }
            } else {
                y1VarArr2 = y1VarArr;
                n9Var = n9Var3;
            }
        } else {
            y1VarArr2 = y1VarArr;
            n9Var = n9Var3;
            f10 = 10.0f;
        }
        f11 = 8.0f;
        if (z11) {
        }
        if (z13) {
        }
        chat3 = chat;
        z17 = false;
        if (!z17) {
        }
        org.telegram.ui.Cells.y1 y1Var32 = new org.telegram.ui.Cells.y1(parentActivity, 1, c6Var);
        y1VarArr2[0] = y1Var32;
        y1Var32.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
        if (z17) {
        }
        z19 = true;
        y1VarArr2[0].setMultiline(z19);
        n9Var2 = n9Var;
        b2Var = b2Var2;
        y1VarArr2[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(f11), AndroidUtilities.dp(f10), LocaleController.isRTL ? AndroidUtilities.dp(f11) : AndroidUtilities.dp(16.0f), AndroidUtilities.dp(f10));
        d3Var.addView(y1VarArr2[0], h7.z5.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        cg.c cVar22 = new cg.c(z17, chat3, alertDialog$Builder, zArr);
        y1VarArr2[0].setOnClickListener(new q2(0, zArr, cVar22));
        if (z14) {
        }
        z18 = z17;
        if (user == null) {
        }
        if (z11) {
        }
        if (z11) {
        }
        org.telegram.ui.ActionBar.b2 b2Var322222 = b2Var;
        alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.Components.s2
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
                    final org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                    if (isUserSelf) {
                        y4.t(n2Var2, z27, true, chat4, user2, false, z28, zArr3[0], z29, booleanCallback2, c6Var2);
                        return;
                    }
                    if (user2 != null && zArr3[0]) {
                        MessagesStorage.getInstance(n2Var2.getCurrentAccount()).getMessagesCount(user2.id, new MessagesStorage.IntCallback() { // from class: org.telegram.ui.Components.m1
                            @Override // org.telegram.messenger.MessagesStorage.IntCallback
                            public final void run(int i11) {
                                boolean[] zArr4 = zArr3;
                                MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                if (i11 >= 50) {
                                    y4.t(org.telegram.ui.ActionBar.n2.this, z27, true, chat4, user2, false, z28, zArr4[0], z29, booleanCallback3, c6Var2);
                                } else if (booleanCallback3 != null) {
                                    booleanCallback3.run(zArr4[0]);
                                }
                            }
                        });
                        return;
                    }
                    zArr2 = zArr3;
                    if (ChatObject.isChannel(chat4) && chat4.creator && !zArr2[0]) {
                        final we.d g10 = alertDialog$Builder.a.g(-1, true, true);
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
                                we.d.this.c(false);
                                TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                if (user4 == null) {
                                    booleanCallback3.run(z25 || zArr2[0]);
                                    return;
                                }
                                Context context2 = context;
                                TLRPC.Chat chat5 = chat4;
                                gf.k0 k0Var = new gf.k0(context2, chat5, user4, i11, booleanCallback3, c6Var2, 8);
                                s1 s1Var = new s1(booleanCallback3, 0);
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
                                n9 n9Var6 = new n9(context3);
                                y8 y8Var2 = new y8((org.telegram.ui.ActionBar.c6) null);
                                y8Var2.r(currentUser);
                                n9Var6.setRoundRadius(AndroidUtilities.dp(30.0f));
                                n9Var6.e(currentUser, y8Var2);
                                frameLayout.addView(n9Var6, h7.z5.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                ImageView imageView = new ImageView(context3);
                                imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                imageView.setColorFilter(new PorterDuffColorFilter(n2Var3.getThemedColor(org.telegram.ui.ActionBar.g6.d7), PorterDuff.Mode.SRC_IN));
                                frameLayout.addView(imageView, h7.z5.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                e3 e3Var = new e3(context3);
                                y8 y8Var3 = new y8((org.telegram.ui.ActionBar.c6) null);
                                y8Var3.r(user4);
                                e3Var.setRoundRadius(AndroidUtilities.dp(30.0f));
                                e3Var.e(user4, y8Var3);
                                frameLayout.addView(e3Var, h7.z5.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                n9 n9Var7 = new n9(context3);
                                y8 y8Var4 = new y8((org.telegram.ui.ActionBar.c6) null);
                                y8Var4.q(chat5);
                                n9Var7.setRoundRadius(AndroidUtilities.dp(12.0f));
                                n9Var7.e(chat5, y8Var4);
                                frameLayout.addView(n9Var7, h7.z5.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                org.telegram.ui.ActionBar.b2 b2Var5 = alertDialog$Builder2.a;
                                b2Var5.K0 = -1.0f;
                                b2Var5.R = frameLayout;
                                b2Var5.N = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannelTitle : R.string.LeaveGroupTitle);
                                b2Var5.P = AndroidUtilities.replaceTags(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.LeaveChannelNewOwnerText : R.string.LeaveGroupNewOwnerText, UserObject.getUserName(user4), chat5.title));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.AppointNewOwner), new s(k0Var, 4));
                                alertDialog$Builder2.i(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder2.k(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannel : R.string.LeaveMegaMenu), new s(s1Var, 5));
                                b2Var5.show();
                                View d = b2Var5.d(-1);
                                if (d instanceof TextView) {
                                    ((TextView) d).setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
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
        n2Var.showDialog(b2Var322222);
        textView = (TextView) b2Var322222.d(-1);
        if (textView == null) {
        }
    }

    public static void t0(int i10, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        if (i10 == 0 || n2Var == null || n2Var.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity(), 0, c6Var);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.UnableForward);
        if (i10 == 1) {
            alertDialog$Builder.a.P = LocaleController.getString(R.string.ErrorSendRestrictedStickers);
        } else if (i10 == 2) {
            alertDialog$Builder.a.P = LocaleController.getString(R.string.ErrorSendRestrictedMedia);
        } else if (i10 == 3) {
            alertDialog$Builder.a.P = LocaleController.getString(R.string.ErrorSendRestrictedPolls);
        } else if (i10 == 4) {
            alertDialog$Builder.a.P = LocaleController.getString(R.string.ErrorSendRestrictedStickersAll);
        } else if (i10 == 5) {
            alertDialog$Builder.a.P = LocaleController.getString(R.string.ErrorSendRestrictedMediaAll);
        } else if (i10 == 6) {
            alertDialog$Builder.a.P = LocaleController.getString(R.string.ErrorSendRestrictedPollsAll);
        } else if (i10 == 7) {
            alertDialog$Builder.a.P = LocaleController.getString(R.string.ErrorSendRestrictedPrivacyVoiceMessages);
        } else if (i10 == 8) {
            alertDialog$Builder.a.P = LocaleController.getString(R.string.ErrorSendRestrictedPrivacyVideoMessages);
        } else if (i10 == 9) {
            alertDialog$Builder.a.P = LocaleController.getString(R.string.ErrorSendRestrictedVideoAll);
        } else if (i10 == 10) {
            alertDialog$Builder.a.P = LocaleController.getString(R.string.ErrorSendRestrictedPhotoAll);
        } else if (i10 == 11) {
            alertDialog$Builder.a.P = LocaleController.getString(R.string.ErrorSendRestrictedVideo);
        } else if (i10 == 12) {
            alertDialog$Builder.a.P = LocaleController.getString(R.string.ErrorSendRestrictedPhoto);
        } else if (i10 == 13) {
            alertDialog$Builder.a.P = LocaleController.getString(R.string.ErrorSendRestrictedVoiceAll);
        } else if (i10 == 14) {
            alertDialog$Builder.a.P = LocaleController.getString(R.string.ErrorSendRestrictedVoice);
        } else if (i10 == 15) {
            alertDialog$Builder.a.P = LocaleController.getString(R.string.ErrorSendRestrictedRoundAll);
        } else if (i10 == 16) {
            alertDialog$Builder.a.P = LocaleController.getString(R.string.ErrorSendRestrictedRound);
        } else if (i10 == 17) {
            alertDialog$Builder.a.P = LocaleController.getString(R.string.ErrorSendRestrictedDocumentsAll);
        } else if (i10 == 18) {
            alertDialog$Builder.a.P = LocaleController.getString(R.string.ErrorSendRestrictedDocuments);
        } else if (i10 == 19) {
            alertDialog$Builder.a.P = LocaleController.getString(R.string.ErrorSendRestrictedMusicAll);
        } else if (i10 == 20) {
            alertDialog$Builder.a.P = LocaleController.getString(R.string.ErrorSendRestrictedMusic);
        } else if (i10 == 21) {
            alertDialog$Builder.a.P = LocaleController.getString(R.string.ErrorSendRestrictedTodoAll);
        } else if (i10 == 22) {
            alertDialog$Builder.a.P = LocaleController.getString(R.string.ErrorSendRestrictedTodo);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        n2Var.showDialog(alertDialog$Builder.a, true, null);
    }

    public static org.telegram.ui.ActionBar.b2 u(Activity activity, final long j10, final long j11, final int i10, final Runnable runnable, org.telegram.ui.ActionBar.c6 c6Var) {
        int i11;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
        final String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j11);
        if (j10 != 0) {
            StringBuilder sb2 = new StringBuilder("color_");
            sb2.append(sharedPrefKey);
            i11 = notificationsSettings.contains(sb2.toString()) ? org.telegram.messenger.y1.c("color_", sharedPrefKey, notificationsSettings, -16776961) : DialogObject.isChatDialog(j10) ? notificationsSettings.getInt("GroupLed", -16776961) : notificationsSettings.getInt("MessagesLed", -16776961);
        } else {
            i11 = i10 == 1 ? notificationsSettings.getInt("MessagesLed", -16776961) : i10 == 0 ? notificationsSettings.getInt("GroupLed", -16776961) : i10 == 3 ? notificationsSettings.getInt("StoriesLed", -16776961) : (i10 == 5 || i10 == 4) ? notificationsSettings.getInt("ReactionsLed", -16776961) : notificationsSettings.getInt("ChannelLed", -16776961);
        }
        LinearLayout f10 = org.telegram.messenger.y1.f(activity, 1);
        String[] strArr = {LocaleController.getString(R.string.ColorRed), LocaleController.getString(R.string.ColorOrange), LocaleController.getString(R.string.ColorYellow), LocaleController.getString(R.string.ColorGreen), LocaleController.getString(R.string.ColorCyan), LocaleController.getString(R.string.ColorBlue), LocaleController.getString(R.string.ColorViolet), LocaleController.getString(R.string.ColorPink), LocaleController.getString(R.string.ColorWhite)};
        final int[] iArr = {i11};
        for (int i12 = 0; i12 < 9; i12++) {
            org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(activity, c6Var);
            h6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            h6Var.setTag(Integer.valueOf(i12));
            int i13 = org.telegram.ui.Cells.r8.e[i12];
            h6Var.a(i13, i13);
            h6Var.b(strArr[i12], i11 == org.telegram.ui.Cells.r8.f[i12]);
            f10.addView(h6Var);
            h6Var.setOnClickListener(new p0(f10, iArr));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, c6Var);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.LedColor);
        alertDialog$Builder.n(f10);
        alertDialog$Builder.k(LocaleController.getString(R.string.Set), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.Components.t2
            @Override // org.telegram.ui.ActionBar.a2
            public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i14) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                long j12 = j10;
                int[] iArr2 = iArr;
                if (j12 != 0) {
                    edit.putInt(s3.c.e("color_", sharedPrefKey), iArr2[0]);
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
        alertDialog$Builder.i(LocaleController.getString(R.string.LedDisabled), new i3.e(runnable, i10, j10, 3));
        if (j10 != 0) {
            alertDialog$Builder.h(LocaleController.getString(R.string.Default), new g1(6, sharedPrefKey, runnable));
        }
        return alertDialog$Builder.a;
    }

    public static org.telegram.ui.ActionBar.b2 u0(org.telegram.ui.ActionBar.n2 n2Var, String str, String str2, org.telegram.ui.ActionBar.c6 c6Var) {
        if (n2Var == null) {
            n2Var = LaunchActivity.U();
        }
        if (str2 == null || n2Var == null || n2Var.getParentActivity() == null) {
            return null;
        }
        org.telegram.ui.ActionBar.b2 b2Var = O(n2Var.getParentActivity(), str, str2, null, null, c6Var).a;
        n2Var.showDialog(b2Var);
        return b2Var;
    }

    public static void v(org.telegram.ui.ActionBar.n2 n2Var, String str, String str2, String str3) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity());
        String string = LocaleController.getString(R.string.ContactNotRegisteredTitle);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.N = string;
        b2Var.P = LocaleController.formatString("ContactNotRegistered", R.string.ContactNotRegistered, ContactsController.formatName(str, str2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Invite), new g1(3, str3, n2Var));
        n2Var.showDialog(b2Var);
    }

    public static org.telegram.ui.ActionBar.b2 v0(org.telegram.ui.ActionBar.n2 n2Var, String str, CharSequence charSequence, String str2, boolean z10, Runnable runnable) {
        TextView textView;
        org.telegram.ui.ActionBar.b2 P = P(n2Var.getContext(), n2Var.getResourceProvider(), str, charSequence, str2, runnable);
        n2Var.showDialog(P);
        if (z10 && (textView = (TextView) P.d(-1)) != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
        }
        return P;
    }

    public static AlertDialog$Builder w(Activity activity, final MessagesStorage.IntCallback intCallback) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.m(R.raw.permission_request_contacts, 72, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
        alertDialog$Builder.a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.ContactsPermissionAlert));
        final int i10 = 1;
        alertDialog$Builder.k(LocaleController.getString(R.string.ContactsPermissionAlertContinue), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.Components.n0
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
        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.Components.n0
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

    public static void w0(org.telegram.ui.ActionBar.n2 n2Var, String str) {
        if (str == null) {
            return;
        }
        Toast.makeText((n2Var == null || n2Var.getParentActivity() == null) ? ApplicationLoader.applicationContext : n2Var.getParentActivity(), str, 1).show();
    }

    public static AlertDialog$Builder x(Context context, int i10, int i11, int i12, int i13, int i14, int i15, String str, final boolean z10, c3.d dVar) {
        if (context == null) {
            return null;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        final fc0 fc0Var = new fc0(context, null);
        final fc0 fc0Var2 = new fc0(context, null);
        final fc0 fc0Var3 = new fc0(context, null);
        linearLayout.addView(fc0Var2, h7.z5.l(0.3f, 0, -2));
        final int i16 = 0;
        fc0Var2.setOnScrollListener(new cc0() { // from class: org.telegram.ui.Components.t1
            @Override // org.telegram.ui.Components.cc0
            public final void j(int i17) {
                switch (i16) {
                    case 0:
                        if (z10 && i17 == 0) {
                            y4.d(fc0Var2, fc0Var, fc0Var3);
                            break;
                        }
                        break;
                    case 1:
                        if (z10 && i17 == 0) {
                            y4.d(fc0Var2, fc0Var, fc0Var3);
                            break;
                        }
                        break;
                    default:
                        if (z10 && i17 == 0) {
                            y4.d(fc0Var2, fc0Var, fc0Var3);
                            break;
                        }
                        break;
                }
            }
        });
        fc0Var.setMinValue(0);
        fc0Var.setMaxValue(11);
        linearLayout.addView(fc0Var, h7.z5.l(0.3f, 0, -2));
        fc0Var.setFormatter(new org.telegram.ui.fr(19));
        fc0Var.setOnValueChangedListener(new l0(fc0Var2, fc0Var, fc0Var3, 1));
        final int i17 = 1;
        fc0Var.setOnScrollListener(new cc0() { // from class: org.telegram.ui.Components.t1
            @Override // org.telegram.ui.Components.cc0
            public final void j(int i172) {
                switch (i17) {
                    case 0:
                        if (z10 && i172 == 0) {
                            y4.d(fc0Var2, fc0Var, fc0Var3);
                            break;
                        }
                        break;
                    case 1:
                        if (z10 && i172 == 0) {
                            y4.d(fc0Var2, fc0Var, fc0Var3);
                            break;
                        }
                        break;
                    default:
                        if (z10 && i172 == 0) {
                            y4.d(fc0Var2, fc0Var, fc0Var3);
                            break;
                        }
                        break;
                }
            }
        });
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i18 = calendar.get(1);
        fc0Var3.setMinValue(i10 + i18);
        fc0Var3.setMaxValue(i11 + i18);
        fc0Var3.setValue(i18 + i12);
        linearLayout.addView(fc0Var3, h7.z5.l(0.4f, 0, -2));
        fc0Var3.setOnValueChangedListener(new l0(fc0Var2, fc0Var, fc0Var3, 2));
        final int i19 = 2;
        fc0Var3.setOnScrollListener(new cc0() { // from class: org.telegram.ui.Components.t1
            @Override // org.telegram.ui.Components.cc0
            public final void j(int i172) {
                switch (i19) {
                    case 0:
                        if (z10 && i172 == 0) {
                            y4.d(fc0Var2, fc0Var, fc0Var3);
                            break;
                        }
                        break;
                    case 1:
                        if (z10 && i172 == 0) {
                            y4.d(fc0Var2, fc0Var, fc0Var3);
                            break;
                        }
                        break;
                    default:
                        if (z10 && i172 == 0) {
                            y4.d(fc0Var2, fc0Var, fc0Var3);
                            break;
                        }
                        break;
                }
            }
        });
        y0(fc0Var2, fc0Var, fc0Var3);
        if (z10) {
            d(fc0Var2, fc0Var, fc0Var3);
        }
        if (i13 != -1) {
            fc0Var2.setValue(i13);
            fc0Var.setValue(i14);
            fc0Var3.setValue(i15);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.a.N = str;
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.k(LocaleController.getString(R.string.Set), new org.telegram.messenger.wj(z10, fc0Var2, fc0Var, fc0Var3, dVar));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.b2 x0(Context context, String str, boolean z10) {
        if (context == null || str == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.N = string;
        b2Var.P = str;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        if (z10) {
            alertDialog$Builder.h(LocaleController.getString(R.string.UpdateApp), new j0(context, 2));
        }
        return alertDialog$Builder.o();
    }

    public static void y(Context context, String str, String str2, long j10, x4 x4Var) {
        fc0 fc0Var;
        if (context == null) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.j5, false);
        int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.h5, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ji, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ni, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G8, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.i6, false);
        int w04 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false);
        int w05 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false);
        int w06 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false);
        org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(context, null);
        z2Var.a();
        fc0 fc0Var2 = new fc0(context, null);
        fc0Var2.setTextColor(w02);
        fc0Var2.setTextOffset(AndroidUtilities.dp(10.0f));
        fc0Var2.setItemCount(5);
        s3 s3Var = new s3(context, null);
        s3Var.setItemCount(5);
        s3Var.setTextColor(w02);
        s3Var.setTextOffset(-AndroidUtilities.dp(10.0f));
        u3 u3Var = new u3(context, null);
        u3Var.setItemCount(5);
        u3Var.setTextColor(w02);
        u3Var.setTextOffset(-AndroidUtilities.dp(34.0f));
        r3 r3Var = new r3(context, fc0Var2, s3Var, u3Var, 1);
        r3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        r3Var.addView(frameLayout, h7.z5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        org.telegram.messenger.y1.s(textView, w02, 1, 20.0f);
        frameLayout.addView(textView, h7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new kh.e(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        r3Var.addView(linearLayout, h7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        cg.q qVar = new cg.q(context, 16);
        linearLayout.addView(fc0Var2, h7.z5.l(0.5f, 0, 270));
        fc0Var2.setMinValue(0);
        fc0Var2.setMaxValue(365);
        fc0Var2.setWrapSelectorWheel(false);
        fc0Var2.setFormatter(new org.telegram.ui.fr(22));
        ag.l0 l0Var = new ag.l0(fc0Var2, s3Var, u3Var, 17);
        fc0Var2.setOnValueChangedListener(l0Var);
        s3Var.setMinValue(0);
        s3Var.setMaxValue(23);
        linearLayout.addView(s3Var, h7.z5.l(0.2f, 0, 270));
        s3Var.setFormatter(new org.telegram.ui.fr(23));
        s3Var.setOnValueChangedListener(l0Var);
        u3Var.setMinValue(0);
        u3Var.setMaxValue(59);
        u3Var.setValue(0);
        u3Var.setFormatter(new org.telegram.ui.fr(24));
        linearLayout.addView(u3Var, h7.z5.l(0.3f, 0, 270));
        u3Var.setOnValueChangedListener(l0Var);
        if (j10 <= 0 || j10 == 2147483646) {
            fc0Var = fc0Var2;
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
                u3Var.setValue(calendar.get(12));
                s3Var.setValue(calendar.get(11));
                fc0Var = fc0Var2;
                fc0Var.setValue(timeInMillis);
            } else {
                fc0Var = fc0Var2;
            }
        }
        fc0 fc0Var3 = fc0Var;
        g(null, null, 0L, 0L, 0, fc0Var3, s3Var, u3Var);
        qVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        qVar.setGravity(17);
        qVar.setTextColor(w04);
        qVar.setTextSize(1, 14.0f);
        qVar.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(8.0f);
        qVar.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, w05, w06, w06));
        qVar.setText(str2);
        r3Var.addView(qVar, h7.z5.t(-1, 48, 83, 16, 15, 16, 16));
        qVar.setOnClickListener(new cg.f(fc0Var3, (fc0) s3Var, (fc0) u3Var, calendar, (Object) x4Var, z2Var, 3));
        z2Var.b(r3Var);
        org.telegram.ui.ActionBar.e3 e3Var = z2Var.a;
        e3Var.show();
        e3Var.setBackgroundColor(w03);
        e3Var.fixNavigationBar(w03);
    }

    public static void y0(fc0 fc0Var, fc0 fc0Var2, fc0 fc0Var3) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2, fc0Var2.getValue());
        calendar.set(1, fc0Var3.getValue());
        fc0Var.setMinValue(1);
        fc0Var.setMaxValue(calendar.getActualMaximum(5));
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
    public static void z(final org.telegram.ui.ActionBar.n2 n2Var, final TLRPC.User user, final TLRPC.Chat chat, final TLRPC.EncryptedChat encryptedChat, final TLRPC.ChatFull chatFull, final long j10, final MessageObject messageObject, final SparseArray[] sparseArrayArr, final MessageObject.GroupedMessages groupedMessages, final int i10, final int i11, TLRPC.ChannelParticipant[] channelParticipantArr, final Runnable runnable, Runnable runnable2, final org.telegram.ui.ActionBar.c6 c6Var) {
        Activity parentActivity;
        boolean z10;
        long j11;
        boolean z11;
        boolean z12;
        boolean z13;
        int i12;
        int i13;
        boolean z14;
        boolean z15;
        int i14;
        int i15;
        org.telegram.ui.ActionBar.b2 b2Var;
        int i16;
        boolean z16;
        boolean z17;
        boolean z18;
        org.telegram.ui.Cells.y1 y1Var;
        int i17;
        TLRPC.MessageAction messageAction;
        final boolean z19;
        int i18;
        org.telegram.ui.ActionBar.b2 b2Var2;
        boolean z20;
        String str;
        AlertDialog$Builder alertDialog$Builder;
        TextView textView;
        TextView textView2;
        int i19;
        int i20;
        boolean z21;
        TLRPC.MessageAction messageAction2;
        boolean z22;
        final int i21;
        int i22;
        TLRPC.Message message;
        int i23;
        MessageObject messageObject2 = messageObject;
        boolean z23 = i11 == 1;
        boolean z24 = i11 == 3;
        if (n2Var == null) {
            return;
        }
        if ((user == null && chat == null && encryptedChat == null) || (parentActivity = n2Var.getParentActivity()) == null) {
            return;
        }
        final int currentAccount = n2Var.getCurrentAccount();
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(parentActivity, 0, c6Var);
        float f10 = runnable2 != null ? 0.5f : 0.6f;
        org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder2.a;
        b2Var3.M0 = f10;
        int size = groupedMessages != null ? groupedMessages.messages.size() : messageObject2 != null ? 1 : sparseArrayArr[1].size() + sparseArrayArr[0].size();
        if (encryptedChat != null) {
            z10 = z24;
            j11 = DialogObject.makeEncryptedDialogId(encryptedChat.id);
        } else {
            z10 = z24;
            j11 = user != null ? user.id : -chat.id;
        }
        if (z23) {
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
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(parentActivity, 0, c6Var);
                String string = LocaleController.getString(R.string.MessageScheduledRepeatDeleteTitle);
                org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder3.a;
                b2Var4.N = string;
                b2Var4.P = LocaleController.getString(R.string.MessageScheduledRepeatDeleteText);
                final int i24 = i22;
                alertDialog$Builder3.h(str2, new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.Components.q0
                    @Override // org.telegram.ui.ActionBar.a2
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var5, int i25) {
                        MessageObject.GroupedMessages groupedMessages2 = MessageObject.GroupedMessages.this;
                        int i26 = currentAccount;
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        int i27 = i24;
                        int i28 = i21;
                        if (groupedMessages2 != null && !groupedMessages2.messages.isEmpty()) {
                            SendMessagesHelper.getInstance(i26).editMessage(groupedMessages2.messages.get(0), null, false, n2Var2, null, i27 + i28, i28);
                        } else {
                            SendMessagesHelper.getInstance(i26).editMessage(messageObject, null, false, n2Var2, null, i27 + i28, i28);
                        }
                    }
                });
                final long j12 = j11;
                final boolean z25 = z10;
                alertDialog$Builder3.i(LocaleController.getString(R.string.MessageScheduledRepeatDeleteAll), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.Components.v0
                    @Override // org.telegram.ui.ActionBar.a2
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var5, int i25) {
                        SparseArray[] sparseArrayArr2;
                        ArrayList<Long> arrayList;
                        int i26;
                        long j13;
                        ArrayList<Long> arrayList2;
                        TLRPC.Peer peer;
                        int i27;
                        long j14;
                        ArrayList<Integer> arrayList3;
                        boolean z26 = z25;
                        int i28 = currentAccount;
                        long clientUserId = z26 ? UserConfig.getInstance(i28).getClientUserId() : j12;
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
                b2Var4.J = new r0(2, runnable2);
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
            int i26 = 0;
            z11 = false;
            boolean z26 = false;
            boolean z27 = false;
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
                        z26 = true;
                        if (messageObject3.isPaidSuggestedPostProtected()) {
                            TLRPC.Message message3 = messageObject3.messageOwner;
                            z27 |= message3.paid_suggested_post_stars;
                            z11 |= message3.paid_suggested_post_ton;
                        }
                        i27 = i13 + 1;
                        i26 = i12;
                    }
                }
                i26 = i12 + 1;
            }
            z12 = z26;
            z13 = z27;
        }
        boolean z28 = z13;
        if (groupedMessages != null) {
            int i28 = 0;
            while (i28 < groupedMessages.messages.size()) {
                MessageObject messageObject4 = groupedMessages.messages.get(i28);
                if (messageObject4.isPaidSuggestedPostProtected()) {
                    TLRPC.Message message4 = messageObject4.messageOwner;
                    z22 = z12;
                    boolean z29 = z28 | message4.paid_suggested_post_stars;
                    z11 = message4.paid_suggested_post_ton | z11;
                    z28 = z29;
                } else {
                    z22 = z12;
                }
                i28++;
                z12 = z22;
            }
        }
        boolean z30 = z12;
        final boolean[] zArr = new boolean[1];
        boolean z31 = user != null && MessagesController.getInstance(i25).canRevokePmInbox;
        int i29 = user != null ? MessagesController.getInstance(i25).revokeTimePmLimit : MessagesController.getInstance(i25).revokeTimeLimit;
        if (encryptedChat == null && user != null && z31) {
            z14 = z31;
            if (i29 == Integer.MAX_VALUE) {
                z15 = true;
                if (chat != null || !chat.megagroup || z23 || z10) {
                    i14 = i25;
                    if (!z23 || z10 || ChatObject.isChannel(chat) || encryptedChat != null) {
                        i15 = i14;
                        b2Var = b2Var3;
                        i16 = 0;
                        z16 = false;
                    } else {
                        if ((user == null || user.id == UserConfig.getInstance(i14).getClientUserId() || (user.bot && !user.support)) && chat == null) {
                            i15 = i14;
                            i16 = 0;
                            z18 = false;
                        } else if (messageObject2 != null) {
                            i16 = (messageObject2.isSendError() || !((messageAction = messageObject2.messageOwner.action) == null || (messageAction instanceof TLRPC.TL_messageActionEmpty) || (messageAction instanceof TLRPC.TL_messageActionPhoneCall) || (messageAction instanceof TLRPC.TL_messageActionPinMessage) || (messageAction instanceof TLRPC.TL_messageActionGeoProximityReached) || (messageAction instanceof TLRPC.TL_messageActionSetChatTheme)) || (!(messageObject2.isOut() || z14 || ChatObject.hasAdminRights(chat)) || currentTime - messageObject2.messageOwner.date > i29)) ? 0 : 1;
                            z18 = !messageObject2.isOut();
                            i15 = i14;
                        } else {
                            int i30 = 1;
                            z18 = false;
                            int i31 = 0;
                            while (i30 >= 0) {
                                int i32 = 0;
                                while (true) {
                                    i17 = i14;
                                    if (i32 < sparseArrayArr[i30].size()) {
                                        MessageObject messageObject5 = (MessageObject) sparseArrayArr[i30].valueAt(i32);
                                        int i33 = i32;
                                        TLRPC.MessageAction messageAction3 = messageObject5.messageOwner.action;
                                        if ((messageAction3 == null || (messageAction3 instanceof TLRPC.TL_messageActionEmpty) || (messageAction3 instanceof TLRPC.TL_messageActionPhoneCall) || (messageAction3 instanceof TLRPC.TL_messageActionPinMessage) || (messageAction3 instanceof TLRPC.TL_messageActionGeoProximityReached)) && ((messageObject5.isOut() || z14 || (chat != null && ChatObject.canBlockUsers(chat))) && currentTime - messageObject5.messageOwner.date <= i29)) {
                                            i31++;
                                            if (!z18 && !messageObject5.isOut()) {
                                                z18 = true;
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
                        if (i16 <= 0 || !z30 || (user != null && UserObject.isDeleted(user))) {
                            b2Var = b2Var3;
                            z16 = z18;
                        } else {
                            FrameLayout frameLayout = new FrameLayout(parentActivity);
                            org.telegram.ui.Cells.y1 y1Var2 = new org.telegram.ui.Cells.y1(parentActivity, 1, c6Var);
                            y1Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
                            if (z15) {
                                y1Var = y1Var2;
                                y1Var.e(LocaleController.formatString("DeleteMessagesOptionAlso", R.string.DeleteMessagesOptionAlso, UserObject.getFirstName(user)), "", false, false, false);
                            } else {
                                y1Var = y1Var2;
                                if (chat == null || !(z18 || i16 == size)) {
                                    y1Var.e(LocaleController.getString(R.string.DeleteMessagesOption), "", false, false, false);
                                } else {
                                    y1Var.e(LocaleController.getString(R.string.DeleteForAll), "", false, false, false);
                                }
                            }
                            org.telegram.ui.Cells.y1 y1Var3 = y1Var;
                            y1Var3.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                            frameLayout.addView(y1Var3, h7.z5.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                            y1Var3.setOnClickListener(new s0(1, zArr));
                            alertDialog$Builder2.n(frameLayout);
                            b2Var3.C = 9;
                            b2Var = b2Var3;
                            z16 = z18;
                            z17 = true;
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
                    ArrayList arrayList2 = (ArrayList) Collection.-EL.stream(arrayList).filter(new gh.g1(2)).mapToLong(new w0(0)).distinct().mapToObj(new LongFunction() { // from class: org.telegram.ui.Components.x0
                        @Override // java.util.function.LongFunction
                        public final Object apply(long j13) {
                            int i40 = i25;
                            return j13 > 0 ? MessagesController.getInstance(i40).getUser(Long.valueOf(j13)) : MessagesController.getInstance(i40).getChat(Long.valueOf(-j13));
                        }
                    }).filter(new gh.g1(3)).filter(new org.telegram.ui.q8(UserConfig.getInstance(i25).getClientUserId(), 2)).collect(Collectors.toCollection(new org.telegram.ui.tf()));
                    if (!arrayList2.isEmpty()) {
                        if (channelParticipantArr != null) {
                            ur urVar = new ur(n2Var, chat, arrayList, arrayList2, channelParticipantArr, j10, i10, i11, false, runnable);
                            if (runnable3 != null) {
                                urVar.setOnHideListener(new r0(0, runnable3));
                            }
                            urVar.show();
                            return;
                        }
                        final org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(parentActivity, 3, null)};
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
                            RequestDelegate requestDelegate = new RequestDelegate() { // from class: org.telegram.ui.Components.z0
                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                                    final int[] iArr5 = iArr3;
                                    final int[] iArr6 = iArr4;
                                    final int i41 = i40;
                                    final TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                    final int i42 = size2;
                                    final org.telegram.ui.ActionBar.b2[] b2VarArr2 = b2VarArr;
                                    final org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
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
                                    final org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.q1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            org.telegram.ui.ActionBar.b2[] b2VarArr3 = b2VarArr2;
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
                                                    b2VarArr3[0].dismiss();
                                                } catch (Throwable unused) {
                                                }
                                                b2VarArr3[0] = null;
                                                y4.z(n2Var2, user2, chat2, encryptedChat2, chatFull2, j13, messageObject7, sparseArrayArr2, groupedMessages2, i43, i44, channelParticipantArr4, runnable5, runnable6, c6Var2);
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
                        AndroidUtilities.runOnUIThread(new gh.e1(b2VarArr, iArr, i25, runnable2, n2Var, 16), 1000L);
                        return;
                    }
                    if (i39 <= 0 || !z30) {
                        z21 = false;
                    } else {
                        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                        org.telegram.ui.Cells.y1 y1Var4 = new org.telegram.ui.Cells.y1(parentActivity, 1, c6Var);
                        y1Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
                        y1Var4.e(LocaleController.getString(R.string.DeleteMessagesOption), "", false, false, false);
                        int i42 = 0;
                        y1Var4.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                        frameLayout2.addView(y1Var4, h7.z5.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                        y1Var4.setOnClickListener(new s0(i42, zArr));
                        alertDialog$Builder2.n(frameLayout2);
                        b2Var3.C = 9;
                        z21 = true;
                    }
                    b2Var = b2Var3;
                    z17 = z21;
                    i15 = i25;
                    i16 = i39;
                    z16 = false;
                }
                final int i43 = i15;
                org.telegram.ui.ActionBar.b2 b2Var5 = b2Var;
                int i44 = i16;
                final long j13 = j11;
                int i45 = size;
                boolean z32 = z11;
                z19 = z10;
                org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.Components.u0
                    @Override // org.telegram.ui.ActionBar.a2
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var6, int i46) {
                        SparseArray[] sparseArrayArr2;
                        ArrayList<Long> arrayList4;
                        int i47;
                        long j14;
                        long j15;
                        ArrayList arrayList5;
                        TLRPC.Peer peer;
                        int i48;
                        long j16;
                        boolean z33 = z19;
                        int i49 = i43;
                        long clientUserId = z33 ? UserConfig.getInstance(i49).getClientUserId() : j13;
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
                if (z19) {
                    i18 = i45;
                    b2Var2 = b2Var5;
                    if (i18 == 1) {
                        b2Var2.N = LocaleController.getString(R.string.DeleteSingleMessagesTitle);
                    } else {
                        b2Var2.N = LocaleController.formatString(R.string.DeleteMessagesTitle, LocaleController.formatPluralString("messages", i18, new Object[0]));
                    }
                } else {
                    i18 = i45;
                    if (i18 == 1) {
                        b2Var2 = b2Var5;
                        b2Var2.N = LocaleController.getString(R.string.UnsaveSingleMessagesTitle);
                    } else {
                        b2Var2 = b2Var5;
                        b2Var2.N = LocaleController.formatString(R.string.UnsaveMessagesTitle, LocaleController.formatPluralString("messages", i18, new Object[0]));
                    }
                }
                if (z19) {
                    if (chat == null || !z16) {
                        if (!z17 || z15 || i44 == i18) {
                            if (chat == null || !chat.megagroup || z23) {
                                if (i18 == 1) {
                                    b2Var2.P = LocaleController.getString(R.string.AreYouSureDeleteSingleMessage);
                                } else {
                                    b2Var2.P = LocaleController.getString(R.string.AreYouSureDeleteFewMessages);
                                }
                            } else if (i18 == 1) {
                                b2Var2.P = LocaleController.getString((messageObject == null || !messageObject.isEphemeral()) ? R.string.AreYouSureDeleteSingleMessageMega : R.string.AreYouSureDeleteSingleMessage);
                            } else {
                                b2Var2.P = LocaleController.getString(R.string.AreYouSureDeleteFewMessagesMega);
                            }
                        } else if (chat != null) {
                            b2Var2.P = LocaleController.formatString("DeleteMessagesTextGroup", R.string.DeleteMessagesTextGroup, LocaleController.formatPluralString("messages", i44, new Object[0]));
                        } else {
                            b2Var2.P = AndroidUtilities.replaceTags(LocaleController.formatString("DeleteMessagesText", R.string.DeleteMessagesText, LocaleController.formatPluralString("messages", i44, new Object[0]), UserObject.getFirstName(user)));
                        }
                    } else if (z17 && i44 != i18) {
                        b2Var2.P = LocaleController.formatString(R.string.DeleteMessagesTextGroupPart, LocaleController.formatPluralString("messages", i44, new Object[0]));
                    } else if (i18 == 1) {
                        b2Var2.P = LocaleController.getString(R.string.AreYouSureDeleteSingleMessage);
                    } else {
                        b2Var2.P = LocaleController.getString(R.string.AreYouSureDeleteFewMessages);
                    }
                } else if (i18 == 1) {
                    b2Var2.P = LocaleController.getString(R.string.AreYouSureUnsaveSingleMessage);
                } else {
                    b2Var2.P = LocaleController.getString(R.string.AreYouSureUnsaveFewMessages);
                }
                if (messageObject == null) {
                    z20 = messageObject.isGiveaway() && !messageObject.isForwarded();
                    if (z20) {
                        long j14 = ((TLRPC.TL_messageMediaGiveaway) messageObject.messageOwner.media).until_date * 1000;
                        str = LocaleController.getInstance().getFormatterGiveawayMonthDayYear().format(new Date(j14));
                        z20 = System.currentTimeMillis() < j14;
                    }
                    str = null;
                } else if (i18 == 1) {
                    boolean z33 = false;
                    str = null;
                    for (int i46 = 1; i46 >= 0; i46--) {
                        for (int i47 = 0; i47 < sparseArrayArr[i46].size(); i47++) {
                            MessageObject messageObject7 = (MessageObject) sparseArrayArr[i46].valueAt(i47);
                            boolean z34 = messageObject7.isGiveaway() && !messageObject7.isForwarded();
                            if (z34) {
                                long j15 = ((TLRPC.TL_messageMediaGiveaway) messageObject7.messageOwner.media).until_date * 1000;
                                str = LocaleController.getInstance().getFormatterGiveawayMonthDayYear().format(new Date(j15));
                                z33 = System.currentTimeMillis() < j15;
                            } else {
                                z33 = z34;
                            }
                        }
                    }
                    z20 = z33;
                } else {
                    z20 = false;
                    str = null;
                }
                if (z28) {
                    alertDialog$Builder = alertDialog$Builder2;
                    if (z32) {
                        int i48 = (int) MessagesController.getInstance(i43).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS);
                        b2Var2.N = LocaleController.getString(R.string.SuggestionTONWillBeLost);
                        b2Var2.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestionTONWillBeLostInfo, Integer.valueOf(i48)));
                        alertDialog$Builder.k(LocaleController.getString(R.string.SuggestionStarsWillBeLostDelete), a2Var);
                    } else if (!z20 || z19) {
                        alertDialog$Builder.k(LocaleController.getString(z19 ? R.string.Remove : R.string.Delete), a2Var);
                    } else {
                        b2Var2.N = LocaleController.getString(R.string.BoostingGiveawayDeleteMsgTitle);
                        b2Var2.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BoostingGiveawayDeleteMsgText, str));
                        alertDialog$Builder.i(LocaleController.getString(R.string.Delete), a2Var);
                    }
                } else {
                    int i49 = (int) MessagesController.getInstance(i43).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS);
                    b2Var2.N = LocaleController.getString(R.string.SuggestionStarsWillBeLost);
                    b2Var2.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestionStarsWillBeLostInfo, Integer.valueOf(i49)));
                    alertDialog$Builder = alertDialog$Builder2;
                    alertDialog$Builder.k(LocaleController.getString(R.string.SuggestionStarsWillBeLostDelete), a2Var);
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                b2Var2.J = new r0(1, runnable2);
                n2Var.showDialog(b2Var2);
                textView = (TextView) b2Var2.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
                }
                textView2 = (TextView) b2Var2.d(-3);
                if (textView2 == null) {
                    b2Var2.p0.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f));
                    ((ViewGroup.MarginLayoutParams) b2Var2.p0.getLayoutParams()).topMargin = AndroidUtilities.dp(-8.0f);
                    textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
                    return;
                }
                return;
            }
        } else {
            z14 = z31;
        }
        z15 = false;
        if (chat != null) {
        }
        i14 = i25;
        if (z23) {
        }
        i15 = i14;
        b2Var = b2Var3;
        i16 = 0;
        z16 = false;
        z17 = false;
        final int i432 = i15;
        org.telegram.ui.ActionBar.b2 b2Var52 = b2Var;
        int i442 = i16;
        final long j132 = j11;
        int i452 = size;
        boolean z322 = z11;
        z19 = z10;
        org.telegram.ui.ActionBar.a2 a2Var2 = new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.Components.u0
            @Override // org.telegram.ui.ActionBar.a2
            public final void f(org.telegram.ui.ActionBar.b2 b2Var6, int i462) {
                SparseArray[] sparseArrayArr2;
                ArrayList<Long> arrayList4;
                int i472;
                long j142;
                long j152;
                ArrayList arrayList5;
                TLRPC.Peer peer;
                int i482;
                long j16;
                boolean z332 = z19;
                int i492 = i432;
                long clientUserId = z332 ? UserConfig.getInstance(i492).getClientUserId() : j132;
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
        if (z19) {
        }
        if (z19) {
        }
        if (messageObject == null) {
        }
        if (z28) {
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        b2Var2.J = new r0(1, runnable2);
        n2Var.showDialog(b2Var2);
        textView = (TextView) b2Var2.d(-1);
        if (textView != null) {
        }
        textView2 = (TextView) b2Var2.d(-3);
        if (textView2 == null) {
        }
    }
}
