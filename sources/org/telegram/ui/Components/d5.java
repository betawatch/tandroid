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
import org.telegram.ui.hi1;
import org.telegram.ui.xe1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class d5 {
    public static final Pattern a = Pattern.compile("^([a-zA-Z][a-zA-Z0-9+\\-.]*://)?([a-zA-Z0-9\\-]+\\.)+[a-zA-Z]{2,}(:\\d+)?(/[^\\s]*)?$");

    public static AlertDialog$Builder A(Context context) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String readRes = AndroidUtilities.readRes(R.raw.pip_voice_request);
        p30 p30Var = new p30(0, context, true);
        p30Var.setImportantForAccessibility(2);
        bi.ld ldVar = new bi.ld(context, p30Var);
        ldVar.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-15128003, -15118002}));
        ldVar.setClipToOutline(true);
        ldVar.setOutlineProvider(new bi.g(10));
        View view = new View(context);
        view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(readRes, AndroidUtilities.dp(320.0f), AndroidUtilities.dp(184.61539f), false)));
        ldVar.addView(view, w7.a6.d(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
        ldVar.addView(p30Var, w7.a6.c(117.0f, 117));
        alertDialog$Builder.a.V = ldVar;
        alertDialog$Builder.a.R = LocaleController.getString(R.string.PermissionDrawAboveOtherAppsGroupCallTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.PermissionDrawAboveOtherAppsGroupCall);
        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new l0(context, 3));
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.j0 = true;
        d2Var.T0 = false;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.a.O0 = 0.5769231f;
        return alertDialog$Builder;
    }

    public static AlertDialog$Builder B(Activity activity, hi1 hi1Var, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        String readRes = AndroidUtilities.readRes(R.raw.pip_video_request);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-14535089, -14527894}));
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new bi.g(9));
        View view = new View(activity);
        view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(readRes, AndroidUtilities.dp(320.0f), AndroidUtilities.dp(161.36752f), false)));
        frameLayout.addView(view, w7.a6.d(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
        alertDialog$Builder.a.V = frameLayout;
        alertDialog$Builder.a.R = LocaleController.getString(R.string.PermissionDrawAboveOtherAppsTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.PermissionDrawAboveOtherApps);
        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new gg.d0(6, activity, z10));
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.j0 = true;
        d2Var.T0 = false;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), hi1Var);
        alertDialog$Builder.a.O0 = 0.50427353f;
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.d2 C(LaunchActivity launchActivity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.LowDiskSpaceTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.LowDiskSpaceMessage2);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.LowDiskSpaceButton), new j1(launchActivity, 1));
        return alertDialog$Builder.a;
    }

    public static org.telegram.ui.ActionBar.d2 D(Activity activity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
        alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new l0(activity, 1));
        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
        return alertDialog$Builder.a;
    }

    public static org.telegram.ui.ActionBar.d2 E(Activity activity, boolean z10, TLRPC.User user, MessagesStorage.IntCallback intCallback, org.telegram.ui.ActionBar.f6 f6Var) {
        int[] iArr = new int[1];
        String[] strArr = {LocaleController.getString(R.string.SendLiveLocationFor15m), LocaleController.getString(R.string.SendLiveLocationFor1h), LocaleController.getString(R.string.SendLiveLocationFor8h), LocaleController.getString(R.string.SendLiveLocationForever)};
        LinearLayout f7 = org.telegram.messenger.a2.f(activity, 1);
        f7.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
        TextView textView = new TextView(activity);
        if (z10) {
            textView.setText(LocaleController.getString(R.string.LiveLocationAlertExpandMessage));
        } else if (user != null) {
            textView.setText(LocaleController.formatString(R.string.LiveLocationAlertPrivate, UserObject.getFirstName(user)));
        } else {
            textView.setText(LocaleController.getString(R.string.LiveLocationAlertGroup));
        }
        int i10 = org.telegram.ui.ActionBar.j6.j5;
        textView.setTextColor(f6Var != null ? f6Var.e0(i10) : org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        f7.addView(textView, w7.a6.t(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 24, z10 ? 4 : 0, 24, 8));
        int i11 = 0;
        while (i11 < 4) {
            org.telegram.ui.Cells.m6 m6Var = new org.telegram.ui.Cells.m6(activity, f6Var);
            m6Var.d = 42;
            m6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            m6Var.setTag(Integer.valueOf(i11));
            int i12 = org.telegram.ui.ActionBar.j6.g7;
            int e02 = f6Var != null ? f6Var.e0(i12) : org.telegram.ui.ActionBar.j6.w0(null, i12, false);
            int i13 = org.telegram.ui.ActionBar.j6.E5;
            m6Var.a(e02, f6Var != null ? f6Var.e0(i13) : org.telegram.ui.ActionBar.j6.w0(null, i13, false));
            m6Var.b(strArr[i11], iArr[0] == i11);
            f7.addView(m6Var);
            m6Var.setOnClickListener(new s0(iArr, f7));
            i11++;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, f6Var);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        if (z10) {
            d2Var.R = LocaleController.getString(R.string.LiveLocationAlertExpandTitle);
        } else {
            int e03 = f6Var != null ? f6Var.e0(org.telegram.ui.ActionBar.j6.L5) : org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false);
            d2Var.b0 = new tq0(activity, 0);
            d2Var.c0 = e03;
        }
        alertDialog$Builder.n(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.ShareFile), new org.telegram.ui.oe(15, iArr, intCallback));
        alertDialog$Builder.i(LocaleController.getString(R.string.Cancel), null);
        return d2Var;
    }

    public static org.telegram.ui.ActionBar.h3 F(final long j3, final long j10, final org.telegram.ui.ActionBar.p2 p2Var, final org.telegram.ui.ActionBar.f6 f6Var) {
        if (p2Var.getParentActivity() == null) {
            return null;
        }
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) p2Var.getParentActivity(), f6Var, false);
        h3Var.fixNavigationBar();
        h3Var.title = LocaleController.getString(R.string.Notifications);
        h3Var.bigTitle = true;
        CharSequence[] charSequenceArr = {LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Hours", 1, new Object[0])), LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Hours", 8, new Object[0])), LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Days", 2, new Object[0])), LocaleController.getString(R.string.MuteDisable)};
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Components.m0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                int i11 = i10 == 0 ? 0 : i10 == 1 ? 1 : i10 == 2 ? 2 : 3;
                NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(j3, j10, i11);
                org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                if (wc.a(p2Var2)) {
                    wc.z(p2Var2, i11, 0, f6Var).j();
                }
            }
        };
        h3Var.items = charSequenceArr;
        h3Var.onClickListener = onClickListener;
        return h3Var;
    }

    public static void G(Context context, org.telegram.ui.ActionBar.f6 f6Var, c5 c5Var) {
        if (context == null) {
            return;
        }
        int i10 = 0;
        int i11 = org.telegram.ui.ActionBar.j6.j5;
        int e02 = f6Var != null ? f6Var.e0(i11) : org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.j6.h5;
        int e03 = f6Var != null ? f6Var.e0(i12) : org.telegram.ui.ActionBar.j6.w0(null, i12, false);
        int i13 = org.telegram.ui.ActionBar.j6.Ji;
        if (f6Var != null) {
            f6Var.e0(i13);
        } else {
            org.telegram.ui.ActionBar.j6.w0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.j6.Ni;
        if (f6Var != null) {
            f6Var.e0(i14);
        } else {
            org.telegram.ui.ActionBar.j6.w0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.j6.E8;
        if (f6Var != null) {
            f6Var.e0(i15);
        } else {
            org.telegram.ui.ActionBar.j6.w0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.j6.G8;
        if (f6Var != null) {
            f6Var.e0(i16);
        } else {
            org.telegram.ui.ActionBar.j6.w0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.j6.i6;
        if (f6Var != null) {
            f6Var.e0(i17);
        } else {
            org.telegram.ui.ActionBar.j6.w0(null, i17, false);
        }
        int i18 = org.telegram.ui.ActionBar.j6.Sh;
        int e04 = f6Var != null ? f6Var.e0(i18) : org.telegram.ui.ActionBar.j6.w0(null, i18, false);
        int i19 = org.telegram.ui.ActionBar.j6.Oh;
        int e05 = f6Var != null ? f6Var.e0(i19) : org.telegram.ui.ActionBar.j6.w0(null, i19, false);
        int e06 = f6Var != null ? f6Var.e0(org.telegram.ui.ActionBar.j6.Qh) : org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
        org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3(context, f6Var);
        c3Var.a();
        int[] iArr = {30, 60, 120, 180, 480, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        m4 m4Var = new m4(context, f6Var, iArr);
        m4Var.setMinValue(0);
        m4Var.setMaxValue(20);
        m4Var.setTextColor(e02);
        m4Var.setValue(0);
        m4Var.setFormatter(new i1(i10, iArr));
        i4 i4Var = new i4(context, m4Var, 1);
        i4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        i4Var.addView(frameLayout, w7.a6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.MuteForAlert));
        textView.setTextColor(e02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, w7.a6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ai.h(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        i4Var.addView(linearLayout, w7.a6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        di.h hVar = new di.h(context, 18);
        linearLayout.addView(m4Var, w7.a6.l(1.0f, 0, 270));
        m4Var.setOnValueChangedListener(new b(6));
        hVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        hVar.setGravity(17);
        hVar.setTextColor(e04);
        hVar.setTextSize(1, 14.0f);
        hVar.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(8.0f);
        hVar.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, e05, e06, e06));
        hVar.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
        i4Var.addView(hVar, w7.a6.t(-1, 48, 83, 16, 15, 16, 16));
        hVar.setOnClickListener(new di.o(iArr, m4Var, c5Var, c3Var, 5));
        c3Var.b(i4Var);
        org.telegram.ui.ActionBar.h3 h3Var = c3Var.a;
        h3Var.show();
        h3Var.setBackgroundColor(e03);
        h3Var.fixNavigationBar(e03);
    }

    public static AlertDialog$Builder H(Context context, String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.a.R = str;
        HashMap hashMap = new HashMap();
        int i10 = org.telegram.ui.ActionBar.j6.L5;
        hashMap.put("info1", Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(null, i10, false)));
        hashMap.put("info2", Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(null, i10, false)));
        alertDialog$Builder.m(R.raw.not_available, 52, org.telegram.ui.ActionBar.j6.w0(null, i10, false), hashMap);
        alertDialog$Builder.a.W = true;
        alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
        alertDialog$Builder.a.T = str2;
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.d2 I(Activity activity, long j3, final long j10, int i10, final Runnable runnable, org.telegram.ui.ActionBar.f6 f6Var) {
        String[] strArr;
        final long j11 = j3;
        final int i11 = i10;
        final SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
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
        LinearLayout f7 = org.telegram.messenger.a2.f(activity, 1);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, f6Var);
        int i14 = 0;
        while (i14 < strArr2.length) {
            org.telegram.ui.Cells.m6 m6Var = new org.telegram.ui.Cells.m6(activity, f6Var);
            m6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            m6Var.setTag(Integer.valueOf(i14));
            m6Var.a(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.g7, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E5, f6Var));
            m6Var.b(strArr2[i14], iArr[0] == i14);
            f7.addView(m6Var);
            m6Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.e3
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
        }
        alertDialog$Builder.a.R = LocaleController.getString(R.string.NotificationsImportance);
        alertDialog$Builder.n(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.a;
    }

    public static void J(int i10, Activity activity, long j3, TLRPC.Photo photo, zh.b bVar) {
        if (activity != null) {
            z2 z2Var = new z2(i10, j3, photo, activity, bVar);
            org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) activity, (org.telegram.ui.ActionBar.f6) bVar, true);
            h3Var.fixNavigationBar();
            h3Var.title = LocaleController.getString(R.string.ReportProfilePhoto);
            h3Var.bigTitle = true;
            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.ReportChatSpam), LocaleController.getString(R.string.ReportChatFakeAccount), LocaleController.getString(R.string.ReportChatViolence), LocaleController.getString(R.string.ReportChatChild), LocaleController.getString(R.string.ReportChatIllegalDrugs), LocaleController.getString(R.string.ReportChatPersonalDetails), LocaleController.getString(R.string.ReportChatPornography), LocaleController.getString(R.string.ReportChatOther)};
            int[] iArr = {R.drawable.msg_clearcache, R.drawable.msg_report_fake, R.drawable.msg_report_violence, R.drawable.msg_block2, R.drawable.msg_report_drugs, R.drawable.msg_report_personal, R.drawable.msg_report_xxx, R.drawable.msg_report_other};
            a3 a3Var = new a3(new int[]{0, 6, 1, 2, 3, 4, 5, 100}, activity, bVar, z2Var, 0);
            h3Var.items = charSequenceArr;
            h3Var.itemIcons = iArr;
            h3Var.onClickListener = a3Var;
            h3Var.show();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39, types: [org.telegram.ui.da] */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.View, org.telegram.ui.Components.dd0, org.telegram.ui.Components.u3] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r15v0, types: [android.view.View, org.telegram.ui.Components.dd0] */
    /* JADX WARN: Type inference failed for: r15v15, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r2v15, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r2v47, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View, org.telegram.ui.Components.dd0, org.telegram.ui.Components.t3] */
    /* JADX WARN: Type inference failed for: r53v2, types: [android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r54v1, types: [org.telegram.ui.da] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    public static org.telegram.ui.ActionBar.c3 K(final Context context, final long j3, long j10, int i10, boolean z10, final c5 c5Var, Runnable runnable, b5 b5Var, org.telegram.ui.ActionBar.f6 f6Var) {
        FrameLayout frameLayout;
        Context context2;
        ViewGroup viewGroup;
        int i11;
        FrameLayout frameLayout2;
        ?? r82;
        int i12;
        boolean[] zArr;
        long j11;
        ViewGroup viewGroup2;
        TextView textView;
        ?? r11;
        org.telegram.ui.ActionBar.w0 w0Var;
        t3 t3Var;
        char c10;
        int i13;
        int[] iArr;
        String[] strArr;
        int i14;
        final Calendar calendar;
        int[] iArr2;
        org.telegram.ui.ActionBar.w0 w0Var2;
        ViewGroup viewGroup3;
        int i15;
        float f7;
        String[] strArr2;
        kj0 kj0Var;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        kj0 kj0Var2;
        final org.telegram.ui.ActionBar.h3 h3Var;
        int i16;
        TLRPC.User user;
        TLRPC.UserStatus userStatus;
        if (context == null) {
            return null;
        }
        final int[] iArr3 = {i10};
        long clientUserId = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
        final org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3(context, f6Var);
        c3Var.a();
        final ?? dd0Var = new dd0(context, f6Var);
        int i17 = b5Var.a;
        int i18 = b5Var.c;
        int i19 = b5Var.b;
        dd0Var.setTextColor(i17);
        dd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        dd0Var.setItemCount(5);
        final ?? t3Var2 = new t3(context, f6Var);
        t3Var2.setWrapSelectorWheel(true);
        t3Var2.setAllItemsCount(24);
        t3Var2.setItemCount(5);
        t3Var2.setTextColor(i17);
        t3Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        final ?? u3Var = new u3(context, f6Var);
        u3Var.setWrapSelectorWheel(true);
        u3Var.setAllItemsCount(60);
        u3Var.setItemCount(5);
        u3Var.setTextColor(i17);
        u3Var.setTextOffset(-AndroidUtilities.dp(34.0f));
        ?? frameLayout3 = new FrameLayout(context);
        v3 v3Var = new v3(context, dd0Var, t3Var2, u3Var, 0);
        v3Var.setClipToPadding(false);
        v3Var.setClipChildren(false);
        v3Var.setOrientation(1);
        frameLayout3.addView(v3Var, w7.a6.c(-1.0f, -1));
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout3.addView(frameLayout4, w7.a6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
        ViewGroup frameLayout5 = new FrameLayout(context);
        v3Var.addView(frameLayout5, w7.a6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView5 = new TextView(context);
        if (TextUtils.isEmpty(null)) {
            frameLayout = frameLayout4;
            if (j3 == clientUserId) {
                textView5.setText(LocaleController.getString(R.string.SetReminder));
            } else {
                textView5.setText(LocaleController.getString(R.string.ScheduleMessage));
            }
        } else {
            frameLayout = frameLayout4;
            textView5.setText((CharSequence) null);
        }
        org.telegram.messenger.a2.q(textView5, i17, 1, 20.0f);
        frameLayout5.addView(textView5, w7.a6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView5.setOnTouchListener(new ai.h(10));
        boolean[] zArr2 = {true};
        if (!DialogObject.isUserDialog(j3) || j3 == clientUserId || (user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j3))) == null || user.bot || (userStatus = user.status) == null || userStatus.expires <= 0) {
            context2 = context;
            viewGroup = frameLayout3;
            i11 = i19;
            frameLayout2 = frameLayout;
            r82 = 0;
            i12 = -1;
            zArr = zArr2;
            j11 = clientUserId;
            viewGroup2 = frameLayout5;
            textView = null;
            r11 = v3Var;
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
            j11 = clientUserId;
            viewGroup2 = frameLayout5;
            r11 = v3Var;
            textView = null;
            i11 = i19;
            zArr = zArr2;
            w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, b5Var.a, false, f6Var);
            context2 = context;
            w0Var.setLongClickEnabled(false);
            w0Var.setSubMenuOpenSide(2);
            w0Var.setIcon(R.drawable.ic_ab_other);
            w0Var.setBackground(org.telegram.ui.ActionBar.j6.f0(i18, 1, -1));
            viewGroup2.addView(w0Var, w7.a6.d(40, 40.0f, 53, 0.0f, 8.0f, 5.0f, 0.0f));
            w0Var.g(1, LocaleController.formatString(R.string.ScheduleWhenOnline, firstName));
            w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        }
        int i20 = 17;
        int i21 = 8;
        if (w0Var != null) {
            w0Var.setOnClickListener(new org.telegram.ui.sh(i21, w0Var, b5Var));
            w0Var.setDelegate(new androidx.car.app.utils.a(c5Var, zArr, c3Var, i20));
        }
        kj0 kj0Var3 = new kj0(context2);
        final hj0 hj0Var = new hj0(R.raw.notify_toggle, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        hj0Var.J(true);
        hj0Var.h = true;
        hj0Var.start();
        hj0Var.M(40);
        hj0Var.P(40);
        kj0Var3.setScaleType(ImageView.ScaleType.CENTER);
        kj0Var3.setAnimation(hj0Var);
        kj0Var3.setColorFilter(new PorterDuffColorFilter(i17, PorterDuff.Mode.SRC_IN));
        kj0Var3.setBackground(org.telegram.ui.ActionBar.j6.f0(i18, 1, i12));
        viewGroup2.addView(kj0Var3, w7.a6.d(40, 40.0f, 53, 0.0f, 8.0f, (w0Var != null ? 42 : 0) + 8, 0.0f));
        ?? linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(r82);
        linearLayout.setWeightSum(1.0f);
        r11.addView(linearLayout, w7.a6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar2 = Calendar.getInstance();
        final di.h hVar = new di.h(context2, 13);
        linearLayout.addView(dd0Var, w7.a6.l(0.5f, r82, 270));
        dd0Var.setMinValue(r82);
        dd0Var.setMaxValue(365);
        dd0Var.setWrapSelectorWheel(r82);
        dd0Var.setFormatter(new b(26));
        ViewGroup viewGroup4 = r11;
        final boolean[] zArr3 = zArr;
        final long j12 = j11;
        int i22 = i11;
        bd0 bd0Var = new bd0() { // from class: org.telegram.ui.Components.m2
            @Override // org.telegram.ui.Components.bd0
            public final void q(dd0 dd0Var2, int i23) {
                d5.g(di.h.this, null, 0L, 0L, j12 == j3 ? 1 : 0, dd0Var, t3Var2, u3Var);
            }
        };
        dd0Var.setOnValueChangedListener(bd0Var);
        t3Var2.setMinValue(r82);
        t3Var2.setMaxValue(23);
        org.telegram.ui.ActionBar.w0 w0Var3 = w0Var;
        linearLayout.addView(t3Var2, w7.a6.l(0.2f, r82, 270));
        t3Var2.setFormatter(new b(27));
        t3Var2.setOnValueChangedListener(bd0Var);
        u3Var.setMinValue(r82);
        u3Var.setMaxValue(59);
        u3Var.setValue(r82);
        u3Var.setFormatter(new b(28));
        linearLayout.addView(u3Var, w7.a6.l(0.3f, r82, 270));
        u3Var.setOnValueChangedListener(bd0Var);
        if (j10 <= 0 || j10 == 2147483646) {
            t3Var = t3Var2;
        } else {
            long j13 = 1000 * j10;
            calendar2.setTimeInMillis(System.currentTimeMillis());
            calendar2.set(12, 0);
            calendar2.set(13, 0);
            calendar2.set(14, 0);
            calendar2.set(11, 0);
            int timeInMillis = (int) ((j13 - calendar2.getTimeInMillis()) / 86400000);
            calendar2.setTimeInMillis(j13);
            if (timeInMillis >= 0) {
                u3Var.setValue(calendar2.get(12));
                t3Var = t3Var2;
                t3Var.setValue(calendar2.get(11));
                dd0Var.setValue(timeInMillis);
            } else {
                t3Var = t3Var2;
            }
        }
        final boolean[] zArr4 = {true};
        final t3 t3Var3 = t3Var;
        g(hVar, null, 0L, 0L, j12 == j3 ? 1 : 0, dd0Var, t3Var3, u3Var);
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
            i14 = i22;
            calendar = calendar2;
            iArr2 = iArr;
            w0Var2 = w0Var3;
            viewGroup3 = viewGroup4;
            i15 = 17;
            f7 = 34.0f;
            strArr2 = strArr;
            kj0Var = kj0Var3;
            textView2 = textView;
            textView3 = textView2;
            textView4 = textView3;
        } else {
            ?? frameLayout6 = new FrameLayout(context2);
            int v = org.telegram.ui.ActionBar.j6.v(i22, org.telegram.ui.ActionBar.j6.l1(0.075f, i17));
            int l1 = org.telegram.ui.ActionBar.j6.l1(0.1f, i17);
            textView4 = new TextView(context2);
            textView4.setTextSize(1, 13.0f);
            textView4.setTextColor(i17);
            textView4.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            int dp = AndroidUtilities.dp(14.0f);
            int v9 = org.telegram.ui.ActionBar.j6.v(v, l1);
            textView4.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, v, v9, v9));
            textView4.setGravity(17);
            calendar = calendar2;
            i14 = i22;
            int[] iArr4 = iArr;
            w0Var2 = w0Var3;
            kj0Var = kj0Var3;
            i15 = 17;
            f7 = 34.0f;
            strArr2 = strArr;
            ?? daVar = new org.telegram.ui.da(iArr4, iArr3, strArr2, textView4, 13);
            iArr2 = iArr4;
            daVar.run();
            frameLayout6.addView(textView4, w7.a6.d(-2, 28.0f, 1, 32.0f, 4.0f, 32.0f, 5.0f));
            ?? r22 = viewGroup4;
            r22.addView(frameLayout6, w7.a6.n(-1, -2));
            textView3 = daVar;
            textView2 = frameLayout6;
            viewGroup3 = r22;
        }
        ?? r53 = textView2;
        ?? r54 = textView3;
        hVar.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        hVar.setGravity(i15);
        hVar.setTextColor(b5Var.g);
        hVar.setTextSize(1, 14.0f);
        hVar.setTypeface(AndroidUtilities.bold());
        hVar.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{24.0f}, b5Var.h));
        viewGroup3.addView(hVar, w7.a6.t(-1, 48, 83, 16, 15, 16, 16));
        kj0 kj0Var4 = kj0Var;
        hVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.n2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Runnable runnable2;
                zArr4[0] = false;
                int i23 = j12 == j3 ? 1 : 0;
                dd0 dd0Var2 = dd0Var;
                t3 t3Var4 = t3Var3;
                u3 u3Var2 = u3Var;
                boolean g10 = d5.g(null, null, 0L, 0L, i23, dd0Var2, t3Var4, u3Var2);
                long currentTimeMillis = System.currentTimeMillis();
                Calendar calendar3 = calendar;
                calendar3.setTimeInMillis(currentTimeMillis);
                calendar3.add(6, dd0Var2.getValue());
                calendar3.set(11, t3Var4.getValue());
                calendar3.set(12, u3Var2.getValue());
                if (g10) {
                    calendar3.set(13, 0);
                    calendar3.set(14, 0);
                }
                c5Var.I((int) (calendar3.getTimeInMillis() / 1000), iArr3[0], zArr3[0]);
                runnable2 = c3Var.a.dismissRunnable;
                runnable2.run();
            }
        });
        c3Var.b(viewGroup);
        String[] strArr3 = strArr2;
        org.telegram.ui.ActionBar.h3 h3Var2 = c3Var.a;
        h3Var2.show();
        h3Var2.setOnDismissListener(new o2(runnable, zArr4));
        h3Var2.setBackgroundColor(i14);
        h3Var2.fixNavigationBar(i14);
        if (textView4 != null) {
            kj0Var2 = kj0Var4;
            i16 = 1;
            h3Var = h3Var2;
            textView4.setOnClickListener(new b2(frameLayout2, f6Var, h3Var2, (FrameLayout) r53, iArr2, strArr3, iArr3, (org.telegram.ui.da) r54));
        } else {
            kj0Var2 = kj0Var4;
            h3Var = h3Var2;
            i16 = 1;
        }
        final bi.x4[] x4VarArr = new bi.x4[i16];
        final org.telegram.ui.ActionBar.w0 w0Var4 = w0Var2;
        kj0Var2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.e2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String string;
                boolean[] zArr5 = zArr3;
                boolean z11 = zArr5[0];
                zArr5[0] = !z11;
                hj0 hj0Var2 = hj0Var;
                if (z11) {
                    if (hj0Var2.b0 < 40) {
                        hj0Var2.M(40);
                    }
                    hj0Var2.P(80);
                    hj0Var2.start();
                } else {
                    if (hj0Var2.b0 >= 40) {
                        hj0Var2.M(0);
                    }
                    hj0Var2.P(40);
                    hj0Var2.start();
                }
                bi.x4[] x4VarArr2 = x4VarArr;
                bi.x4 x4Var = x4VarArr2[0];
                if (x4Var != null) {
                    x4Var.e(true);
                    x4VarArr2[0] = null;
                }
                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                long j14 = j3;
                TLRPC.User user2 = messagesController.getUser(Long.valueOf(j14));
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j14));
                bi.x4 x4Var2 = new bi.x4(context, 3);
                x4VarArr2[0] = x4Var2;
                x4Var2.r();
                x4Var2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                x4Var2.q(20.0f);
                float dp2 = AndroidUtilities.dp(12.0f);
                float dp3 = AndroidUtilities.dp(4.0f);
                int l12 = org.telegram.ui.ActionBar.j6.l1(0.25f, -16777216);
                x4Var2.i0 = dp2;
                x4Var2.j0 = dp3;
                x4Var2.k0 = l12;
                x4Var2.F.setShadowLayer(dp2, 0.0f, dp3, l12);
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    string = LocaleController.getString(zArr5[0] ? R.string.ScheduleNotifyOnChannel : R.string.ScheduleNotifyOffChannel);
                } else if (chat != null || user2 == null) {
                    string = LocaleController.getString(zArr5[0] ? R.string.ScheduleNotifyOnGroup : R.string.ScheduleNotifyOffGroup);
                } else if (j14 == j12) {
                    string = LocaleController.getString(zArr5[0] ? R.string.ScheduleNotifyOnSelf : R.string.ScheduleNotifyOffSelf);
                } else {
                    string = LocaleController.formatString(zArr5[0] ? R.string.ScheduleNotifyOnChat : R.string.ScheduleNotifyOffChat, UserObject.getForcedFirstName(user2));
                }
                x4Var2.s(string);
                x4Var2.d = 5000L;
                x4Var2.l(1.0f, -((w0Var4 != null ? 42 : -8) + 20));
                x4Var2.l0 = new rg(x4Var2, 2);
                org.telegram.ui.ActionBar.h3 h3Var3 = h3Var;
                h3Var3.getContainerView().setClipToPadding(false);
                h3Var3.getContainerView().setClipChildren(false);
                h3Var3.getContainerView().addView(x4Var2, w7.a6.d(-1, 200.0f, 48, 0.0f, -194.0f, 0.0f, 0.0f));
                x4Var2.u();
            }
        });
        return c3Var;
    }

    public static void L(Context context, long j3, c5 c5Var) {
        K(context, j3, -1L, 0, false, c5Var, null, new b5(null), null);
    }

    public static void M(Context context, long j3, c5 c5Var, org.telegram.ui.ActionBar.f6 f6Var) {
        K(context, j3, -1L, 0, false, c5Var, null, new b5(f6Var), f6Var);
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
        d2Var.R = str;
        d2Var.T = str2;
        if (str3 == null) {
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            return alertDialog$Builder;
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(str3, new b1(6, runnable));
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.d2 P(Context context, org.telegram.ui.ActionBar.f6 f6Var, String str, CharSequence charSequence, String str2, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.R = str;
        d2Var.T = charSequence;
        alertDialog$Builder.k(str2, new b1(5, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.a;
    }

    public static org.telegram.ui.ActionBar.p1 Q(org.telegram.ui.ActionBar.p2 p2Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, View view, float f7, float f10) {
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
        p1Var.showAtLocation(view.getRootView(), 0, (int) ((f11 + f7) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() / 2.0f)), (int) ((f12 + f10) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() / 2.0f)));
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
        d2Var.R = string;
        d2Var.T = str2;
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
        editTextBoldCursor.setOnEditorActionListener(new gg.r(editTextBoldCursor, i10, stringCallback, d2VarArr, currentFocus, 1));
        editTextBoldCursor.addTextChangedListener(new x3(i10, editTextBoldCursor));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
        gradientDrawable.setColor(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(i11, f6Var)));
        editTextBoldCursor.setBackground(gradientDrawable);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(editTextBoldCursor, w7.a6.k(20.0f, 9.0f, 20.0f, 9.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.a.a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
        alertDialog$Builder.k(str5, new fg.e2(editTextBoldCursor, i10, stringCallback, 7));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new b(16));
        d2VarArr[0] = alertDialog$Builder.a;
        if (p2Var != null) {
            AndroidUtilities.requestAdjustNothing(findActivity, p2Var.getClassGuid());
        }
        org.telegram.ui.ActionBar.d2 d2Var2 = d2VarArr[0];
        d2Var2.h0 = false;
        d2Var2.setOnDismissListener(new di.w0(editTextBoldCursor, p2Var, findActivity, 2));
        d2VarArr[0].setOnShowListener(new h1(1, editTextBoldCursor));
        d2VarArr[0].show();
        editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
    }

    public static void S(Context context, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var, MessagesStorage.StringCallback stringCallback) {
        R(context, p2Var, LocaleController.getString(R.string.StoriesAlbumCreateNew), LocaleController.getString(R.string.StoriesAlbumAddHint), LocaleController.getString(R.string.StoriesAlbumTitleInputHint), null, 12, LocaleController.getString(R.string.Create), f6Var, stringCallback);
    }

    public static org.telegram.ui.ActionBar.c3 T(Context context, long j3, final c5 c5Var, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        int i11;
        int i12;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false);
        int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ji, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ni, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G8, false);
        int i13 = org.telegram.ui.ActionBar.j6.i6;
        org.telegram.ui.ActionBar.j6.w0(null, i13, false);
        int w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false);
        int w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
        if (context == null) {
            return null;
        }
        final org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3(context, f6Var);
        c3Var.a();
        final dd0 dd0Var = new dd0(context, f6Var);
        dd0Var.setTextColor(w02);
        dd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        dd0Var.setItemCount(5);
        final t4 t4Var = new t4(context, f6Var);
        t4Var.setWrapSelectorWheel(true);
        t4Var.setAllItemsCount(24);
        t4Var.setItemCount(5);
        t4Var.setTextColor(w02);
        t4Var.setTextOffset(-AndroidUtilities.dp(10.0f));
        final u4 u4Var = new u4(context, f6Var);
        u4Var.setWrapSelectorWheel(true);
        u4Var.setAllItemsCount(60);
        u4Var.setItemCount(5);
        u4Var.setTextColor(w02);
        u4Var.setTextOffset(-AndroidUtilities.dp(34.0f));
        v3 v3Var = new v3(context, dd0Var, t4Var, u4Var, 5);
        v3Var.setOrientation(1);
        LinearLayout f7 = org.telegram.messenger.em.f(context, 1);
        v3Var.addView(f7, w7.a6.t(-1, -2, 51, 22, 0, 22, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(i10 == 1 ? R.string.SuggestedPostAcceptTitle : R.string.PostSuggestionsAddTime));
        textView.setTextColor(w02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        f7.addView(textView, w7.a6.t(-2, -2, 51, 0, 12, 0, 0));
        textView.setOnTouchListener(new ai.h(10));
        TextView textView2 = new TextView(context);
        org.telegram.messenger.em.n(org.telegram.ui.ActionBar.j6.z6, f6Var, textView2, 1, 14.0f);
        textView2.setText(LocaleController.getString(R.string.PostSuggestionsAddTimeHint));
        f7.addView(textView2, w7.a6.t(-2, -2, 51, 0, 2, 0, 0));
        textView2.setOnTouchListener(new ai.h(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        v3Var.addView(linearLayout, w7.a6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long currentTimeMillis = System.currentTimeMillis();
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i14 = calendar.get(1);
        AppGlobalConfig.ConfigTime configTime = MessagesController.getInstance(UserConfig.selectedAccount).config.starsSuggestedPostFutureMin;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        final long j10 = configTime.get(timeUnit) * 2;
        final long j11 = MessagesController.getInstance(UserConfig.selectedAccount).config.starsSuggestedPostFutureMax.get(timeUnit) - 86400;
        final di.h hVar = new di.h(context, 19);
        linearLayout.addView(dd0Var, w7.a6.l(0.5f, 0, 270));
        dd0Var.setMinValue(0);
        dd0Var.setMaxValue(365);
        dd0Var.setWrapSelectorWheel(false);
        dd0Var.setFormatter(new i2.v(i14, 4));
        final int i15 = i10 == 1 ? 5 : 3;
        bd0 bd0Var = new bd0() { // from class: org.telegram.ui.Components.x1
            @Override // org.telegram.ui.Components.bd0
            public final void q(dd0 dd0Var2, int i16) {
                d5.g(di.h.this, null, j10, j11, i15, dd0Var, t4Var, u4Var);
            }
        };
        dd0Var.setOnValueChangedListener(bd0Var);
        t4Var.setMinValue(0);
        t4Var.setMaxValue(23);
        linearLayout.addView(t4Var, w7.a6.l(0.2f, 0, 270));
        t4Var.setFormatter(new b(11));
        t4Var.setOnValueChangedListener(bd0Var);
        u4Var.setMinValue(0);
        u4Var.setMaxValue(59);
        u4Var.setValue(0);
        u4Var.setFormatter(new b(12));
        linearLayout.addView(u4Var, w7.a6.l(0.3f, 0, 270));
        u4Var.setOnValueChangedListener(bd0Var);
        if (j3 <= 0 || j3 == 2147483646) {
            i11 = w03;
            i12 = i13;
        } else {
            long j12 = 1000 * j3;
            i11 = w03;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            i12 = i13;
            int timeInMillis = (int) ((j12 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j12);
            if (timeInMillis >= 0) {
                u4Var.setValue(calendar.get(12));
                t4Var.setValue(calendar.get(11));
                dd0Var.setValue(timeInMillis);
            }
        }
        final boolean[] zArr = {true};
        g(hVar, null, j10, j11, i15, dd0Var, t4Var, u4Var);
        hVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        hVar.setGravity(17);
        hVar.setTextColor(w04);
        hVar.setTextSize(1, 14.0f);
        hVar.setTypeface(AndroidUtilities.bold());
        hVar.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{8.0f}, w05));
        v3Var.addView(hVar, w7.a6.t(-1, 48, 83, 16, 15, 16, 4));
        final int i16 = i15;
        hVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.y1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Runnable runnable;
                zArr[0] = false;
                long j13 = j10;
                long j14 = j11;
                int i17 = i16;
                dd0 dd0Var2 = dd0Var;
                t4 t4Var2 = t4Var;
                u4 u4Var2 = u4Var;
                boolean g10 = d5.g(null, null, j13, j14, i17, dd0Var2, t4Var2, u4Var2);
                long epochMilli = LocalDate.now().plusDays(dd0Var2.getValue()).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
                Calendar calendar2 = calendar;
                calendar2.setTimeInMillis(epochMilli);
                calendar2.set(11, t4Var2.getValue());
                calendar2.set(12, u4Var2.getValue());
                if (g10) {
                    calendar2.set(13, 0);
                }
                c5Var.I((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                runnable = c3Var.a.dismissRunnable;
                runnable.run();
            }
        });
        w7.c6.b(hVar, 0.02f, 1.2f);
        di.h hVar2 = new di.h(context, 20);
        hVar2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        hVar2.setGravity(17);
        hVar2.setText(LocaleController.getString(i10 == 1 ? R.string.MessageSuggestionPublishNow : R.string.PostSuggestionsAnytime));
        hVar2.setTextColor(w05);
        hVar2.setTextSize(1, 14.0f);
        int dp = AndroidUtilities.dp(8.0f);
        int w06 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false);
        int w07 = org.telegram.ui.ActionBar.j6.w0(null, i12, false);
        hVar2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, w06, w07, w07));
        v3Var.addView(hVar2, w7.a6.t(-1, 48, 83, 16, 0, 16, 16));
        hVar2.setOnClickListener(new bi.q(zArr, c5Var, c3Var, 8));
        w7.c6.b(hVar2, 0.02f, 1.2f);
        c3Var.b(v3Var);
        org.telegram.ui.ActionBar.h3 h3Var = c3Var.a;
        h3Var.show();
        h3Var.setOnDismissListener(new bi.k1(zArr));
        h3Var.setBackgroundColor(i11);
        h3Var.fixNavigationBar(i11);
        return c3Var;
    }

    public static org.telegram.ui.ActionBar.d2 U(org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        if (p2Var == null || p2Var.getParentActivity() == null) {
            return null;
        }
        m90 m90Var = new m90(p2Var.getParentActivity(), p2Var.getResourceProvider());
        SpannableString spannableString = new SpannableString(Html.fromHtml(LocaleController.getString(R.string.AskAQuestionInfo).replace("\n", "<br>")));
        for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new l4(p2Var, uRLSpan.getURL()), spanStart, spanEnd, 0);
        }
        m90Var.setText(spannableString);
        m90Var.setTextSize(1, 16.0f);
        m90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.k5, f6Var));
        m90Var.setHighlightColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.l5, f6Var));
        m90Var.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
        m90Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        m90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j5, f6Var));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getParentActivity(), 0, f6Var);
        alertDialog$Builder.n(m90Var);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.AskAQuestion);
        alertDialog$Builder.k(LocaleController.getString(R.string.AskButton), new s2(1, p2Var));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.a;
    }

    public static AlertDialog$Builder V(Context context, TLRPC.EncryptedChat encryptedChat, org.telegram.ui.ActionBar.f6 f6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.MessageLifetime);
        dd0 dd0Var = new dd0(context, null);
        dd0Var.setMinValue(0);
        dd0Var.setMaxValue(20);
        int i10 = encryptedChat.ttl;
        if (i10 > 0 && i10 < 16) {
            dd0Var.setValue(i10);
        } else if (i10 == 30) {
            dd0Var.setValue(16);
        } else if (i10 == 60) {
            dd0Var.setValue(17);
        } else if (i10 == 3600) {
            dd0Var.setValue(18);
        } else if (i10 == 86400) {
            dd0Var.setValue(19);
        } else if (i10 == 604800) {
            dd0Var.setValue(20);
        } else if (i10 == 0) {
            dd0Var.setValue(0);
        }
        dd0Var.setFormatter(new q2(2));
        alertDialog$Builder.n(dd0Var);
        alertDialog$Builder.h(LocaleController.getString(R.string.Done), new org.telegram.ui.oe(20, encryptedChat, dd0Var));
        return alertDialog$Builder;
    }

    public static void W(org.telegram.ui.ActionBar.p2 p2Var, int i10, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.ActionBar.h6 h6Var) {
        int i11;
        String sb2;
        if (p2Var.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = p2Var.getParentActivity();
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(parentActivity);
        String str = null;
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.u5, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.v5, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.NewTheme);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Create), new q2(3));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        TextView textView = new TextView(parentActivity);
        if (i10 != 0) {
            org.telegram.messenger.a2.n(R.string.EnterThemeNameEdit, textView);
        } else {
            textView.setText(LocaleController.getString(R.string.EnterThemeName));
        }
        textView.setTextSize(1, 16.0f);
        textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
        int i12 = org.telegram.ui.ActionBar.j6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        linearLayout.addView(textView, w7.a6.n(-1, -2));
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
        linearLayout.addView(editTextBoldCursor, w7.a6.t(-1, 36, 51, 24, 6, 24, 0));
        editTextBoldCursor.setOnEditorActionListener(new og.w(2));
        List asList = Arrays.asList("Ancient", "Antique", "Autumn", "Baby", "Barely", "Baroque", "Blazing", "Blushing", "Bohemian", "Bubbly", "Burning", "Buttered", "Classic", "Clear", "Cool", "Cosmic", "Cotton", "Cozy", "Crystal", "Dark", "Daring", "Darling", "Dawn", "Dazzling", "Deep", "Deepest", "Delicate", "Delightful", "Divine", "Double", "Downtown", "Dreamy", "Dusky", "Dusty", "Electric", "Enchanted", "Endless", "Evening", "Fantastic", "Flirty", "Forever", "Frigid", "Frosty", "Frozen", "Gentle", "Heavenly", "Hyper", "Icy", "Infinite", "Innocent", "Instant", "Luscious", "Lunar", "Lustrous", "Magic", "Majestic", "Mambo", "Midnight", "Millenium", "Morning", "Mystic", "Natural", "Neon", "Night", "Opaque", "Paradise", "Perfect", "Perky", "Polished", "Powerful", "Rich", "Royal", "Sheer", "Simply", "Sizzling", "Solar", "Sparkling", "Splendid", "Spicy", "Spring", "Stellar", "Sugared", "Summer", "Sunny", "Super", "Sweet", "Tender", "Tenacious", "Tidal", "Toasted", "Totally", "Tranquil", "Tropical", "True", "Twilight", "Twinkling", "Ultimate", "Ultra", "Velvety", "Vibrant", "Vintage", "Virtual", "Warm", "Warmest", "Whipped", "Wild", "Winsome");
        List asList2 = Arrays.asList("Ambrosia", "Attack", "Avalanche", "Blast", "Bliss", "Blossom", "Blush", "Burst", "Butter", "Candy", "Carnival", "Charm", "Chiffon", "Cloud", "Comet", "Delight", "Dream", "Dust", "Fantasy", "Flame", "Flash", "Fire", "Freeze", "Frost", "Glade", "Glaze", "Gleam", "Glimmer", "Glitter", "Glow", "Grande", "Haze", "Highlight", "Ice", "Illusion", "Intrigue", "Jewel", "Jubilee", "Kiss", "Lights", "Lollypop", "Love", "Luster", "Madness", "Matte", "Mirage", "Mist", "Moon", "Muse", "Myth", "Nectar", "Nova", "Parfait", "Passion", "Pop", "Rain", "Reflection", "Rhapsody", "Romance", "Satin", "Sensation", "Silk", "Shine", "Shadow", "Shimmer", "Sky", "Spice", "Star", "Sugar", "Sunrise", "Sunset", "Sun", "Twist", "Unbound", "Velvet", "Vibrant", "Waters", "Wine", "Wink", "Wonder", "Zone");
        HashMap hashMap = new HashMap();
        hc.b.r(9306112, hashMap, "Berry", 14598550, "Brandy");
        hc.b.r(8391495, hashMap, "Cherry", 16744272, "Coral");
        hc.b.r(14372985, hashMap, "Cranberry", 14423100, "Crimson");
        hc.b.r(14725375, hashMap, "Mauve", 16761035, "Pink");
        hc.b.r(16711680, hashMap, "Red", 16711807, "Rose");
        hc.b.r(8406555, hashMap, "Russet", 16720896, "Scarlet");
        hc.b.r(15856113, hashMap, "Seashell", 16724889, "Strawberry");
        hc.b.r(16760576, hashMap, "Amber", 15438707, "Apricot");
        hc.b.r(16508850, hashMap, "Banana", 10601738, "Citrus");
        hc.b.r(11560192, hashMap, "Ginger", 16766720, "Gold");
        hc.b.r(16640272, hashMap, "Lemon", 16753920, "Orange");
        hc.b.r(16770484, hashMap, "Peach", 16739155, "Persimmon");
        hc.b.r(14996514, hashMap, "Sunflower", 15893760, "Tangerine");
        hc.b.r(16763004, hashMap, "Topaz", 16776960, "Yellow");
        hc.b.r(3688720, hashMap, "Clover", 8628829, "Cucumber");
        hc.b.r(5294200, hashMap, "Emerald", 11907932, "Olive");
        hc.b.r(65280, hashMap, "Green", 43115, "Jade");
        hc.b.r(2730887, hashMap, "Jungle", 12582656, "Lime");
        hc.b.r(776785, hashMap, "Malachite", 10026904, "Mint");
        hc.b.r(11394989, hashMap, "Moss", 3234721, "Azure");
        hc.b.r(255, hashMap, "Blue", 18347, "Cobalt");
        hc.b.r(5204422, hashMap, "Indigo", 96647, "Lagoon");
        hc.b.r(7461346, hashMap, "Aquamarine", 1182351, "Ultramarine");
        hc.b.r(128, hashMap, "Navy", 3101086, "Sapphire");
        hc.b.r(7788522, hashMap, "Sky", 32896, "Teal");
        hc.b.r(4251856, hashMap, "Turquoise", 10053324, "Amethyst");
        hc.b.r(5046581, hashMap, "Blackberry", 6373457, "Eggplant");
        hc.b.r(13148872, hashMap, "Lilac", 11894492, "Lavender");
        hc.b.r(13421823, hashMap, "Periwinkle", 8663417, "Plum");
        hc.b.r(6684825, hashMap, "Purple", 14204888, "Thistle");
        hc.b.r(14315734, hashMap, "Orchid", 2361920, "Violet");
        hc.b.r(4137225, hashMap, "Bronze", 3604994, "Chocolate");
        hc.b.r(8077056, hashMap, "Cinnamon", 3153694, "Cocoa");
        hc.b.r(7365973, hashMap, "Coffee", 7956873, "Rum");
        hc.b.r(5113350, hashMap, "Mahogany", 7875865, "Mocha");
        hc.b.r(12759680, hashMap, "Sand", 8924439, "Sienna");
        hc.b.r(7864585, hashMap, "Maple", 15787660, "Khaki");
        hc.b.r(12088115, hashMap, "Copper", 12144200, "Chestnut");
        hc.b.r(15653316, hashMap, "Almond", 16776656, "Cream");
        hc.b.r(12186367, hashMap, "Diamond", 11109127, "Honey");
        hc.b.r(16777200, hashMap, "Ivory", 15392968, "Pearl");
        hc.b.r(15725299, hashMap, "Porcelain", 13745832, "Vanilla");
        hc.b.r(16777215, hashMap, "White", 8421504, "Gray");
        hc.b.r(0, hashMap, "Black", 15266260, "Chrome");
        hc.b.r(3556687, hashMap, "Charcoal", 789277, "Ebony");
        hc.b.r(12632256, hashMap, "Silver", 16119285, "Smoke");
        hc.b.r(2499381, hashMap, "Steel", 5220413, "Apple");
        hc.b.r(8434628, hashMap, "Glacier", 16693933, "Melon");
        hc.b.r(12929932, hashMap, "Mulberry", 11126466, "Opal");
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
            sb2 = a4.a.q((String) asList.get(Utilities.random.nextInt(asList.size())), " ", str, new StringBuilder());
        } else {
            StringBuilder g10 = w.f.g(str, " ");
            g10.append((String) asList2.get(Utilities.random.nextInt(asList2.size())));
            sb2 = g10.toString();
        }
        editTextBoldCursor.setText(sb2);
        editTextBoldCursor.setSelection(editTextBoldCursor.length());
        h1 h1Var = new h1(2, editTextBoldCursor);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.setOnShowListener(h1Var);
        p2Var.showDialog(d2Var);
        editTextBoldCursor.requestFocus();
        d2Var.d(-1).setOnClickListener(new hi.c(p2Var, editTextBoldCursor, h6Var, i6Var, d2Var, 5));
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
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) activity, (org.telegram.ui.ActionBar.f6) null, false);
        h3Var.fixNavigationBar();
        h3Var.applyBottomPadding = false;
        p3 p3Var = new p3(activity, null);
        q3 q3Var = new q3(activity, p3Var);
        q3Var.setOrientation(0);
        q3Var.setWeightSum(1.0f);
        p3Var.setAllItemsCount(24);
        p3Var.setItemCount(5);
        p3Var.setTextColor(w02);
        p3Var.setGravity(5);
        p3Var.setTextOffset(-AndroidUtilities.dp(12.0f));
        r3 r3Var = new r3(activity, null);
        r3Var.setWrapSelectorWheel(true);
        r3Var.setAllItemsCount(60);
        r3Var.setItemCount(5);
        r3Var.setTextColor(w02);
        r3Var.setGravity(3);
        r3Var.setTextOffset(AndroidUtilities.dp(12.0f));
        final j2 j2Var = new j2(i11, i12, p3Var, r3Var, i10, q3Var);
        q3Var.addView(p3Var, w7.a6.l(0.5f, 0, 270));
        p3Var.setFormatter(new b(24));
        final int i13 = 0;
        p3Var.setOnValueChangedListener(new bd0() { // from class: org.telegram.ui.Components.k2
            @Override // org.telegram.ui.Components.bd0
            public final void q(dd0 dd0Var, int i14) {
                switch (i13) {
                    case 0:
                        j2Var.run(Boolean.TRUE);
                        break;
                    default:
                        j2Var.run(Boolean.TRUE);
                        break;
                }
            }
        });
        q3Var.addView(r3Var, w7.a6.l(0.5f, 0, 270));
        r3Var.setFormatter(new b(25));
        final int i14 = 1;
        r3Var.setOnValueChangedListener(new bd0() { // from class: org.telegram.ui.Components.k2
            @Override // org.telegram.ui.Components.bd0
            public final void q(dd0 dd0Var, int i142) {
                switch (i14) {
                    case 0:
                        j2Var.run(Boolean.TRUE);
                        break;
                    default:
                        j2Var.run(Boolean.TRUE);
                        break;
                }
            }
        });
        j2Var.run(Boolean.FALSE);
        s3 s3Var = new s3(activity, p3Var, r3Var);
        s3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextColor(w02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, w7.a6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ai.h(10));
        s3Var.addView(frameLayout, w7.a6.t(-1, -2, 51, 22, 0, 0, 4));
        s3Var.addView(q3Var, w7.a6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        bi.d dVar = new bi.d(activity, null, true);
        dVar.setRoundRadius(24);
        dVar.g(LocaleController.getString(R.string.Select), false, true);
        dVar.setOnClickListener(new l2(r1, 0));
        s3Var.addView(dVar, w7.a6.t(-1, 48, 0, 16, 12, 16, 12));
        h3Var.customView = s3Var;
        h3Var.show();
        h3Var.setOnDismissListener(new di.w0(callback, p3Var, r3Var, 3));
        h3Var.setBackgroundColor(w03);
        h3Var.fixNavigationBar(w03);
        org.telegram.ui.ActionBar.h3[] h3VarArr = {h3Var};
    }

    public static org.telegram.ui.ActionBar.d2 Y(Activity activity, final long j3, final long j10, String str, final Runnable runnable, org.telegram.ui.ActionBar.f6 f6Var) {
        String[] strArr;
        final String str2 = str;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
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
        LinearLayout f7 = org.telegram.messenger.a2.f(activity, 1);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, f6Var);
        int i12 = 0;
        while (i12 < strArr2.length) {
            org.telegram.ui.Cells.m6 m6Var = new org.telegram.ui.Cells.m6(activity, f6Var);
            m6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            m6Var.setTag(Integer.valueOf(i12));
            m6Var.a(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.g7, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E5, f6Var));
            m6Var.b(strArr2[i12], iArr[0] == i12);
            f7.addView(m6Var);
            m6Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.b3
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
        }
        alertDialog$Builder.a.R = LocaleController.getString(R.string.Vibrate);
        alertDialog$Builder.n(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.a;
    }

    public static org.telegram.ui.ActionBar.d2 Z(Context context, org.telegram.ui.ActionBar.f6 f6Var, String[] strArr, int i10, String str, String str2, q0.a aVar) {
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
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        alertDialog$Builder.m(i10, 72, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
        if (z10) {
            str = str2;
        }
        alertDialog$Builder.a.T = AndroidUtilities.replaceTags(str);
        alertDialog$Builder.k(LocaleController.getString(z10 ? R.string.PermissionOpenSettings : R.string.BotWebViewRequestAllow), new ca.b(z10, context, atomicBoolean, aVar, 4));
        alertDialog$Builder.h(LocaleController.getString(R.string.BotWebViewRequestDontAllow), new org.telegram.ui.oe(14, atomicBoolean, aVar));
        alertDialog$Builder.a.setOnDismissListener(new di.h0(5, atomicBoolean, aVar));
        return alertDialog$Builder.a;
    }

    public static /* synthetic */ void a(Activity activity) {
        if (activity.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
            activity.requestPermissions(new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION"}, 30);
        }
    }

    public static void a0(int i10, int i11, long j3, Utilities.Callback callback) {
        b0(i10, j3, i11, callback, 0L);
    }

    public static void b(dd0 dd0Var, dd0 dd0Var2, dd0 dd0Var3) {
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
        dd0Var3.setMaxValue(i14);
        dd0Var3.setMinValue(i11);
        int value = dd0Var3.getValue();
        dd0Var2.setMaxValue(value == i14 ? i15 : 11);
        dd0Var2.setMinValue(value == i11 ? i12 : 0);
        int value2 = dd0Var2.getValue();
        calendar.set(1, value);
        calendar.set(2, value2);
        int actualMaximum = calendar.getActualMaximum(5);
        if (value == i14 && value2 == i15) {
            actualMaximum = Math.min(i16, actualMaximum);
        }
        dd0Var.setMaxValue(actualMaximum);
        if (value == i11 && value2 == i12) {
            i10 = i13;
        }
        dd0Var.setMinValue(i10);
    }

    public static boolean b0(final int i10, final long j3, int i11, Utilities.Callback callback, long j10) {
        TLRPC.Chat chat;
        long sendPaidMessagesStars = MessagesController.getInstance(i10).getSendPaidMessagesStars(j3);
        if (sendPaidMessagesStars <= 0 && j3 > 0) {
            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i10).isUserContactBlocked(j3));
        }
        long j11 = i11 * sendPaidMessagesStars;
        xh.v5.y(i10, false).P.put(Long.valueOf(j3), Integer.valueOf(i11));
        if (j11 <= 0 || j10 == j11) {
            callback.run(Long.valueOf(j11));
            return false;
        }
        final long j12 = sendPaidMessagesStars;
        final u2 u2Var = new u2(i10, j11, j3, callback, j12, 0);
        if (j12 <= MessagesController.getInstance(i10).getMainSettings().getLong(org.telegram.ui.Cells.r6.h(j3, "ask_paid_message_", "_price"), 0L)) {
            u2Var.run();
            return true;
        }
        Activity activity = AndroidUtilities.getActivity();
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        org.telegram.ui.ActionBar.f6 bVar = (PhotoViewer.t1().Q1() || (U != null && U.hasShownSheet())) ? new zh.b() : U != null ? U.getResourceProvider() : null;
        String shortName = DialogObject.getShortName(i10, j3);
        if (ChatObject.isMonoForum(i10, j3)) {
            shortName = mg.d.h(i10, j3);
        } else if (U instanceof org.telegram.ui.eo) {
            org.telegram.ui.eo eoVar = (org.telegram.ui.eo) U;
            if (eoVar.g4 && eoVar.a() == j3 && (chat = eoVar.f4) != null) {
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
        i0(activity, LocaleController.getString(R.string.MessageLockedStarsConfirmTitle), spannableStringBuilder, LocaleController.getString(R.string.MessageLockedStarsConfirmMessageDontAsk), LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessagePay", i11), new Utilities.Callback() { // from class: org.telegram.ui.Components.p0
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    int i13 = i10;
                    SharedPreferences.Editor edit = MessagesController.getInstance(i13).getMainSettings().edit();
                    long j13 = j3;
                    edit.putLong(org.telegram.ui.Cells.r6.h(j13, "ask_paid_message_", "_price"), j12).apply();
                    xh.v5.y(i13, false).O.put(Long.valueOf(j13), Long.valueOf(System.currentTimeMillis()));
                }
                AndroidUtilities.runOnUIThread(u2Var);
            }
        }, bVar, true);
        return true;
    }

    public static long c(bi.d dVar, dd0 dd0Var, dd0 dd0Var2, dd0 dd0Var3, dd0 dd0Var4) {
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i10 = 1;
        int i11 = calendar.get(1);
        int value = ((dd0Var2.getValue() - 120) / 12) + i11;
        calendar.clear();
        calendar.set(1, value);
        calendar.set(2, (dd0Var2.getValue() - 120) % 12);
        dd0Var.setMinValue(1);
        dd0Var.setMaxValue(calendar.getActualMaximum(5));
        int value2 = dd0Var.getValue();
        int value3 = dd0Var3.getValue();
        int value4 = dd0Var4.getValue();
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
        long j3 = 0;
        int i12 = 0;
        boolean z11 = true;
        int i13 = 0;
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
            xh.v5.y(i10, z10).P.put(l4, Integer.valueOf(i11));
            if (sendPaidMessagesStars > 0) {
                i12++;
            }
            if (sendPaidMessagesStars > 0 && z11 && MessagesController.getInstance(i10).getMainSettings().getLong(org.telegram.ui.Cells.r6.h(longValue, "ask_paid_message_", "_price"), 0L) < sendPaidMessagesStars) {
                z11 = false;
            }
            j3 = j11;
            z10 = false;
        }
        long max = Math.max(1, i11) * j3;
        if (z11 || max <= 0) {
            callback.run(hashMap);
            return false;
        }
        Activity activity = AndroidUtilities.getActivity();
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        org.telegram.ui.ActionBar.f6 bVar = (PhotoViewer.t1().Q1() || (U != null && U.hasShownSheet())) ? new zh.b() : U != null ? U.getResourceProvider() : null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti1", i12)));
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti2", (int) max, LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i12) * i11))));
        i0(activity, LocaleController.getString(R.string.MessageLockedStarsConfirmTitle), spannableStringBuilder, LocaleController.getString(R.string.MessageLockedStarsConfirmMessageDontAsk), LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessagePay", i11), new org.telegram.ui.br(i10, max, activity, arrayList, hashMap, callback, bVar), bVar, true);
        return true;
    }

    public static void d(dd0 dd0Var, dd0 dd0Var2, dd0 dd0Var3) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i10 = 1;
        int i11 = calendar.get(1);
        int i12 = calendar.get(2);
        int i13 = calendar.get(5);
        dd0Var3.setMinValue(i11);
        int value = dd0Var3.getValue();
        dd0Var2.setMinValue(value == i11 ? i12 : 0);
        int value2 = dd0Var2.getValue();
        if (value == i11 && value2 == i12) {
            i10 = i13;
        }
        dd0Var.setMinValue(i10);
    }

    public static boolean d0(int i10, long j3) {
        long sendPaidMessagesStars = MessagesController.getInstance(i10).getSendPaidMessagesStars(j3);
        if (sendPaidMessagesStars <= 0 && j3 > 0) {
            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i10).isUserContactBlocked(j3));
        }
        return sendPaidMessagesStars > 0 && sendPaidMessagesStars > MessagesController.getInstance(i10).getMainSettings().getLong(org.telegram.ui.Cells.r6.h(j3, "ask_paid_message_", "_price"), 0L);
    }

    public static void e(TextView textView, dd0 dd0Var, c4 c4Var, d4 d4Var) {
        int value = dd0Var.getValue();
        int value2 = c4Var.getValue();
        int value3 = d4Var.getValue();
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
        org.telegram.ui.ActionBar.j6.h0 = org.telegram.ui.ActionBar.j6.Y0(org.telegram.ui.ActionBar.j6.I.i0);
        i6Var.E = UserConfig.selectedAccount;
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
        AndroidUtilities.runOnUIThread(new di.o3(i10, chat, arrayList, arrayList2, arrayList3), 200L);
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
        final long j3;
        long peerDialogId;
        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
        if (tL_error != null && tL_error.code != 406 && (str = tL_error.text) != null) {
            if ("BALANCE_TOO_LOW".equalsIgnoreCase(str)) {
                final long o9 = xh.v5.o(tLObject);
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
                        xh.v5.y(i10, false).q(true, true, new Runnable() { // from class: org.telegram.ui.Components.p2
                            @Override // java.lang.Runnable
                            public final void run() {
                                Activity activity = AndroidUtilities.getActivity();
                                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                                org.telegram.ui.ActionBar.f6 bVar = (PhotoViewer.t1().Q1() || (U != null && U.hasShownSheet())) ? new zh.b() : U != null ? U.getResourceProvider() : null;
                                int i11 = i10;
                                long j10 = j3;
                                new xh.o7(activity, bVar, o9, 13, DialogObject.getShortName(i11, j10), new bi.f0(16), j10).show();
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
                    u0(p2Var2, LocaleController.getString(R.string.GuardBotTimeoutTitle), LocaleController.getString(R.string.GuardBotTimeout), null);
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
                    if (p2Var2 == null) {
                        p2Var2 = LaunchActivity.R();
                    }
                    u0(p2Var2, LocaleController.getString(R.string.MessagePremiumErrorTitle), LocaleController.formatString(R.string.MessagePremiumErrorMessage, str2), null);
                    MessagesController.getInstance(i10).invalidateUserPremiumBlocked(peerDialogId2, 0);
                    return null;
                }
                boolean z11 = tLObject instanceof TLRPC.TL_messages_initHistoryImport;
                if (z11 || (tLObject instanceof TLRPC.TL_messages_checkHistoryImportPeer) || (tLObject instanceof TLRPC.TL_messages_checkHistoryImport) || (tLObject instanceof TLRPC.TL_messages_startHistoryImport)) {
                    TLRPC.InputPeer inputPeer = z11 ? ((TLRPC.TL_messages_initHistoryImport) tLObject).peer : tLObject instanceof TLRPC.TL_messages_startHistoryImport ? ((TLRPC.TL_messages_startHistoryImport) tLObject).peer : null;
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
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.messenger.em.l(R.string.ErrorOccurred, "\n", sb2);
                    sb2.append(tL_error.text);
                    u0(R, string, sb2.toString(), null);
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
                        StringBuilder sb3 = new StringBuilder();
                        org.telegram.messenger.em.l(R.string.ErrorOccurred, "\n", sb3);
                        sb3.append(tL_error.text);
                        u0(R2, null, sb3.toString(), null);
                        return null;
                    }
                    boolean z12 = tLObject instanceof TLRPC.TL_channels_joinChannel;
                    if (!z12 && !(tLObject instanceof TLRPC.TL_channels_editAdmin) && !(tLObject instanceof TLRPC.TL_channels_inviteToChannel) && !(tLObject instanceof TLRPC.TL_messages_addChatUser) && !(tLObject instanceof TLRPC.TL_messages_startBot) && !(tLObject instanceof TLRPC.TL_channels_editBanned) && !(tLObject instanceof TLRPC.TL_messages_editChatDefaultBannedRights) && !(tLObject instanceof TLRPC.TL_messages_editChatAdmin) && !(tLObject instanceof TLRPC.TL_messages_migrateChat) && !(tLObject instanceof TL_phone.inviteToGroupCall)) {
                        char c10 = 2;
                        if (tLObject instanceof TLRPC.TL_messages_createChat) {
                            org.telegram.ui.ActionBar.p2 R3 = p2Var2 == null ? LaunchActivity.R() : p2Var2;
                            if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                                if (R3.getParentActivity() != null) {
                                    R3.showDialog(new qg.k0(5, i10, R3.getParentActivity(), R3, null));
                                    return null;
                                }
                                R3.presentFragment(new xe1(2));
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
                                    R4.showDialog(new qg.k0(5, i10, R4.getParentActivity(), R4, null));
                                    return null;
                                }
                                R4.presentFragment(new xe1(2));
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
                                        R5.showDialog(new qg.k0(5, i10, R5.getParentActivity(), R5, null));
                                        return null;
                                    }
                                    R5.presentFragment(new xe1(0));
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
                                    StringBuilder sb4 = new StringBuilder();
                                    org.telegram.messenger.em.l(R.string.ErrorOccurred, "\n", sb4);
                                    sb4.append(tL_error.text);
                                    Toast.makeText(parentActivity, sb4.toString(), 0).show();
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
                                        StringBuilder sb5 = new StringBuilder();
                                        org.telegram.messenger.em.l(R.string.ErrorOccurred, "\n", sb5);
                                        sb5.append(tL_error.text);
                                        return u0(p2Var2, null, sb5.toString(), null);
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
                                            org.telegram.ui.xg0.m1(p2Var2, (String) objArr[0], null, false);
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
                                            org.telegram.ui.xg0.m1(p2Var2, (String) objArr[0], null, true);
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
                                        StringBuilder sb6 = new StringBuilder();
                                        org.telegram.messenger.em.l(R.string.ErrorOccurred, "\n", sb6);
                                        sb6.append(tL_error.text);
                                        u0(p2Var2, null, sb6.toString(), null);
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
                                        StringBuilder sb7 = new StringBuilder();
                                        org.telegram.messenger.em.l(R.string.PaymentConfirmationError, "\n", sb7);
                                        sb7.append(tL_error.text);
                                        u0(p2Var2, null, sb7.toString(), null);
                                        return null;
                                    }
                                }
                            }
                        }
                    } else {
                        if (p2Var2 != null && tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                            if (p2Var2.getParentActivity() != null) {
                                p2Var2.showDialog(new qg.k0(5, i10, p2Var2.getParentActivity(), p2Var2, null));
                                return null;
                            }
                            if (z12 || (tLObject instanceof TLRPC.TL_channels_inviteToChannel)) {
                                p2Var2.presentFragment(new xe1(0));
                                return null;
                            }
                            p2Var2.presentFragment(new xe1(1));
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

    public static boolean g(TextView textView, TextView textView2, long j3, long j10, int i10, dd0 dd0Var, dd0 dd0Var2, dd0 dd0Var3) {
        long j11;
        int i11;
        long j12;
        int i12;
        int i13;
        int i14;
        boolean z10;
        boolean z11;
        String formatPluralString;
        int value = dd0Var.getValue();
        int value2 = dd0Var2.getValue();
        int value3 = dd0Var3.getValue();
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
            i13 = (int) ChronoUnit.DAYS.between(Instant.ofEpochMilli(currentTimeMillis).atZone(ZoneId.systemDefault()).f(), Instant.ofEpochMilli(calendar.getTimeInMillis()).atZone(ZoneId.systemDefault()).f());
            j12 = calendar.getTimeInMillis();
            i12 = 23;
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
        dd0Var.setMinValue(0);
        if (j14 > 0) {
            dd0Var.setMaxValue(i13);
        }
        int value4 = dd0Var.getValue();
        dd0Var2.setMinValue(value4 == 0 ? i17 : 0);
        if (j14 > 0) {
            dd0Var2.setMaxValue(value4 == i13 ? i12 : 23);
        }
        int value5 = dd0Var2.getValue();
        dd0Var3.setMinValue((value4 == 0 && value5 == i17) ? i18 : 0);
        if (j14 > 0) {
            dd0Var3.setMaxValue((value4 == i13 && value5 == i12) ? i16 : 59);
        }
        int value6 = dd0Var3.getValue();
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

    public static void g0(Context context, org.telegram.ui.ActionBar.f6 f6Var, String str, TLRPC.WebPage webPage, final Utilities.Callback callback, zm zmVar) {
        Activity findActivity = AndroidUtilities.findActivity(context);
        final View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        final org.telegram.ui.ActionBar.d2[] d2VarArr = new org.telegram.ui.ActionBar.d2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        String string = LocaleController.getString(R.string.PollV2AddLinkTitle);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.R = string;
        d2Var.T = LocaleController.getString(R.string.PollV2AddLinkMessage);
        final e4 e4Var = new e4(context);
        e4Var.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.j6.j5;
        e4Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        e4Var.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xh, f6Var));
        e4Var.setHint(LocaleController.getString(R.string.PollV2AddLinkUrlHint));
        e4Var.setInputType(17);
        e4Var.setImeOptions(6);
        e4Var.setMaxLines(10);
        e4Var.setSingleLine(false);
        e4Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f));
        e4Var.setCursorWidth(1.5f);
        e4Var.setCursorColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q6, f6Var));
        if (str != null) {
            e4Var.setText(str);
            e4Var.setSelection(str.length());
        }
        e4Var.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.Components.i2
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                if (i11 != 6) {
                    return false;
                }
                e4 e4Var2 = e4.this;
                String trim = e4Var2.getText().toString().trim();
                if (!(TextUtils.isEmpty(trim) ? false : d5.a.matcher(trim.trim()).matches())) {
                    AndroidUtilities.shakeView(e4Var2);
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
        e4Var.setBackground(gradientDrawable);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(e4Var, w7.a6.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
        int i11 = d91.f;
        if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
            d91 d91Var = new d91(context, f6Var);
            d91Var.setWebPage(webPage);
            linearLayout.addView(d91Var, w7.a6.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
        }
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        d2Var.a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
        alertDialog$Builder.k(LocaleController.getString(R.string.Done), new org.telegram.ui.oe(18, e4Var, callback));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new b(23));
        if (zmVar != null) {
            alertDialog$Builder.i(LocaleController.getString(R.string.Delete), new b1(4, zmVar));
        }
        d2VarArr[0] = d2Var;
        d2Var.h0 = false;
        int i12 = 2;
        d2Var.setOnDismissListener(new d1(e4Var, i12));
        d2VarArr[0].setOnShowListener(new bu(i12, e4Var));
        d2VarArr[0].show();
        TextView textView = (TextView) d2VarArr[0].d(-3);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
        }
    }

    public static boolean h(Context context, int i10, long j3, boolean z10) {
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
        N(context, chat.title, LocaleController.getString(R.string.SlowmodeSendError)).o();
        return true;
    }

    public static void h0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.p2 p2Var, boolean z10, boolean z11, TLObject tLObject) {
        AlertDialog$Builder alertDialog$Builder;
        org.telegram.ui.ActionBar.d2 d2Var;
        int i10;
        if (tL_error == null || tL_error.code == 406 || tL_error.text == null || p2Var == null || p2Var.getParentActivity() == null) {
            return;
        }
        alertDialog$Builder = new AlertDialog$Builder(p2Var.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        d2Var = alertDialog$Builder.a;
        d2Var.R = string;
        String str = tL_error.text;
        str.getClass();
        i10 = 0;
        switch (str) {
            case "CHANNELS_ADMIN_LOCATED_TOO_MUCH":
                d2Var.T = LocaleController.getString(R.string.LocatedChannelsTooMuch);
                break;
            case "CHANNELS_ADMIN_PUBLIC_TOO_MUCH":
                d2Var.T = LocaleController.getString(R.string.PublicChannelsTooMuch);
                break;
            case "USERS_TOO_FEW":
                d2Var.T = LocaleController.getString(R.string.CreateGroupError);
                break;
            case "USER_BLOCKED":
            case "USER_BOT":
            case "USER_ID_INVALID":
                if (!z10) {
                    d2Var.T = LocaleController.getString(R.string.GroupUserCantAdd);
                    break;
                } else {
                    d2Var.T = LocaleController.getString(R.string.ChannelUserCantAdd);
                    break;
                }
            case "USER_RESTRICTED":
                d2Var.T = LocaleController.getString(R.string.UserRestricted);
                break;
            case "PEER_FLOOD":
                d2Var.T = LocaleController.getString(R.string.NobodyLikesSpam2);
                alertDialog$Builder.h(LocaleController.getString(R.string.MoreInfo), new s2(i10, p2Var));
                break;
            case "BOTS_TOO_MUCH":
                if (!z10) {
                    d2Var.T = LocaleController.getString(R.string.GroupUserCantBot);
                    break;
                } else {
                    d2Var.T = LocaleController.getString(R.string.ChannelUserCantBot);
                    break;
                }
            case "USER_KICKED":
            case "CHAT_ADMIN_BAN_REQUIRED":
                if (!(tLObject instanceof TLRPC.TL_channels_inviteToChannel)) {
                    d2Var.T = LocaleController.getString(R.string.AddAdminErrorBlacklisted);
                    break;
                } else {
                    d2Var.T = LocaleController.getString(R.string.AddUserErrorBlacklisted);
                    break;
                }
            case "YOU_BLOCKED_USER":
                d2Var.T = LocaleController.getString(R.string.YouBlockedUser);
                break;
            case "USER_ADMIN_INVALID":
                d2Var.T = LocaleController.getString(R.string.AddBannedErrorAdmin);
                break;
            case "USERS_TOO_MUCH":
                if (!z10) {
                    d2Var.T = LocaleController.getString(R.string.GroupUserAddLimit);
                    break;
                } else {
                    d2Var.T = LocaleController.getString(R.string.ChannelUserAddLimit);
                    break;
                }
            case "ADMINS_TOO_MUCH":
                if (!z10) {
                    d2Var.T = LocaleController.getString(R.string.GroupUserCantAdmin);
                    break;
                } else {
                    d2Var.T = LocaleController.getString(R.string.ChannelUserCantAdmin);
                    break;
                }
            case "CHANNELS_TOO_MUCH":
                d2Var.R = LocaleController.getString(R.string.ChannelTooMuchTitle);
                if (!(tLObject instanceof TLRPC.TL_channels_createChannel)) {
                    d2Var.T = LocaleController.getString(R.string.ChannelTooMuchJoin);
                    break;
                } else {
                    d2Var.T = LocaleController.getString(R.string.ChannelTooMuch);
                    break;
                }
            case "USER_CHANNELS_TOO_MUCH":
                d2Var.R = LocaleController.getString(R.string.ChannelTooMuchTitle);
                d2Var.T = LocaleController.getString(R.string.UserChannelTooMuchJoin);
                break;
            case "USER_NOT_MUTUAL_CONTACT":
                if (!z10) {
                    d2Var.T = LocaleController.getString(R.string.GroupUserLeftError);
                    break;
                } else {
                    d2Var.T = LocaleController.getString(R.string.ChannelUserLeftError);
                    break;
                }
            case "CHAT_ADMIN_INVITE_REQUIRED":
                d2Var.T = LocaleController.getString(R.string.AddAdminErrorNotAMember);
                break;
            case "USER_PRIVACY_RESTRICTED":
                if (!z11) {
                    if (!z10) {
                        d2Var.T = LocaleController.getString(R.string.InviteToGroupError);
                        break;
                    } else {
                        d2Var.T = LocaleController.getString(R.string.InviteToChannelError);
                        break;
                    }
                } else {
                    d2Var.T = LocaleController.getString(R.string.InviteToCommunityError);
                    break;
                }
            case "USER_ALREADY_PARTICIPANT":
                d2Var.R = LocaleController.getString(R.string.VoipGroupVoiceChat);
                d2Var.T = LocaleController.getString(R.string.VoipGroupInviteAlreadyParticipant);
                break;
            default:
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.em.l(R.string.ErrorOccurred, "\n", sb2);
                sb2.append(tL_error.text);
                d2Var.T = sb2.toString();
                break;
        }
        hc.b.A(R.string.OK, alertDialog$Builder, null);
    }

    public static org.telegram.ui.ActionBar.d2 i(Activity activity, a5 a5Var) {
        if (UserConfig.getActivatedAccountsCount() < 2) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a.L0;
        org.telegram.ui.ActionBar.d2[] d2VarArr = new org.telegram.ui.ActionBar.d2[1];
        LinearLayout f7 = org.telegram.messenger.a2.f(activity, 1);
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).getCurrentUser() != null) {
                org.telegram.ui.Cells.k kVar = new org.telegram.ui.Cells.k(activity, false);
                kVar.f = i10;
                TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
                g9 g9Var = kVar.e;
                g9Var.m(i10, currentUser);
                kVar.a.l(ContactsController.formatName(currentUser.first_name, currentUser.last_name), false);
                w9 w9Var = kVar.c;
                w9Var.getImageReceiver().setCurrentAccount(i10);
                w9Var.e(currentUser, g9Var);
                kVar.d.setVisibility(4);
                kVar.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                kVar.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                f7.addView(kVar, w7.a6.n(-1, 50));
                kVar.setOnClickListener(new bi.q(d2VarArr, s1Var, a5Var, 9));
            }
        }
        alertDialog$Builder.a.R = LocaleController.getString(R.string.SelectAccount);
        alertDialog$Builder.n(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2VarArr[0] = d2Var;
        return d2Var;
    }

    public static org.telegram.ui.ActionBar.d2 i0(Activity activity, String str, CharSequence charSequence, CharSequence charSequence2, String str2, Utilities.Callback callback, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        if (activity == null) {
            callback.run(Boolean.FALSE);
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, f6Var);
        org.telegram.ui.Cells.z1[] z1VarArr = new org.telegram.ui.Cells.z1[1];
        boolean[] zArr = new boolean[1];
        y4 y4Var = new y4(activity);
        NotificationCenter.listenEmojiLoading(y4Var);
        y4Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j5, f6Var));
        y4Var.setTextSize(1, 16.0f);
        y4Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        y4Var.setText(charSequence);
        z4 z4Var = new z4(activity, z1VarArr);
        alertDialog$Builder.a.G = 6;
        alertDialog$Builder.n(z4Var);
        TextView textView = new TextView(activity);
        org.telegram.messenger.em.x(org.telegram.ui.ActionBar.j6.E8, f6Var, textView, 1, 20.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(str);
        z4Var.addView(textView, w7.a6.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 8.0f, 24.0f, 0.0f));
        z4Var.addView(y4Var, w7.a6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 48.0f, 24.0f, 6.0f));
        if (!TextUtils.isEmpty(charSequence2)) {
            org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(activity, 1, f6Var);
            z1VarArr[0] = z1Var;
            z1Var.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var), 7, AndroidUtilities.dp(12.0f)));
            z1VarArr[0].setMultiline(true);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) z1VarArr[0].getCheckBoxView().getLayoutParams();
            layoutParams.topMargin = 0;
            layoutParams.gravity = (LocaleController.isRTL ? 5 : 3) | 16;
            z1VarArr[0].getCheckBoxView().setLayoutParams(layoutParams);
            z1VarArr[0].e(charSequence2, "", false, false, false);
            z1VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(4.0f) : 0, AndroidUtilities.dp(12.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f));
            z4Var.addView(z1VarArr[0], w7.a6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 0.0f));
            z1VarArr[0].setOnClickListener(new v0(5, zArr));
        }
        alertDialog$Builder.k(str2, new org.telegram.ui.oe(24, callback, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        if (z10) {
            d2Var.X0 = true;
        }
        d2Var.show();
        return d2Var;
    }

    public static org.telegram.ui.ActionBar.d2 j(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.ApkRestricted);
        alertDialog$Builder.m(R.raw.permission_request_apk, 72, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new l0(context, 0));
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
    public static void j0(org.telegram.ui.ActionBar.p2 p2Var, long j3, final TLRPC.User user, final TLRPC.Chat chat, final TLRPC.EncryptedChat encryptedChat, final boolean z10, TLRPC.ChatFull chatFull, final MessagesStorage.IntCallback intCallback, org.telegram.ui.ActionBar.f6 f6Var) {
        long j10;
        boolean z11;
        String string;
        final org.telegram.ui.Cells.z1[] z1VarArr;
        TextView textView;
        if (p2Var.getParentActivity() == null) {
            return;
        }
        final AccountInstance accountInstance = p2Var.getAccountInstance();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getParentActivity(), 0, f6Var);
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(p2Var.getCurrentAccount());
        int i10 = 1;
        if (encryptedChat == null) {
            j10 = j3;
            if (!org.telegram.messenger.a2.v("dialog_bar_report", j10, notificationsSettings, false)) {
                z11 = false;
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                if (user == null) {
                    d2Var.R = LocaleController.formatString("BlockUserTitle", R.string.BlockUserTitle, UserObject.getFirstName(user));
                    d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserAlert", R.string.BlockUserAlert, UserObject.getFirstName(user)));
                    string = LocaleController.getString(R.string.BlockContact);
                    org.telegram.ui.Cells.z1[] z1VarArr2 = new org.telegram.ui.Cells.z1[2];
                    LinearLayout linearLayout = new LinearLayout(p2Var.getParentActivity());
                    linearLayout.setOrientation(1);
                    int i11 = 0;
                    for (int i12 = 2; i11 < i12; i12 = 2) {
                        if (i11 != 0 || z11) {
                            org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(p2Var.getParentActivity(), i10, f6Var);
                            z1VarArr2[i11] = z1Var;
                            z1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                            z1VarArr2[i11].setTag(Integer.valueOf(i11));
                            if (i11 == 0) {
                                z1VarArr2[i11].e(LocaleController.getString(R.string.DeleteReportSpam), "", true, false, false);
                            } else {
                                z1VarArr2[i11].e(LocaleController.formatString("DeleteThisChat", R.string.DeleteThisChat, new Object[0]), "", true, false, false);
                            }
                            z1VarArr2[i11].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                            linearLayout.addView(z1VarArr2[i11], w7.a6.n(-1, -2));
                            z1VarArr2[i11].setOnClickListener(new e1(z1VarArr2, 1));
                        }
                        i11++;
                        i10 = 1;
                    }
                    alertDialog$Builder.n(linearLayout);
                    z1VarArr = z1VarArr2;
                } else {
                    if (chat == null || !z10) {
                        d2Var.R = LocaleController.getString(R.string.ReportSpamTitle);
                        if (!ChatObject.isChannel(chat) || chat.megagroup) {
                            d2Var.T = LocaleController.getString(R.string.ReportSpamAlertGroup);
                        } else {
                            d2Var.T = LocaleController.getString(R.string.ReportSpamAlertChannel);
                        }
                    } else {
                        d2Var.R = LocaleController.getString(R.string.ReportUnrelatedGroup);
                        if (chatFull != null) {
                            TLRPC.ChannelLocation channelLocation = chatFull.location;
                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("ReportUnrelatedGroupText", R.string.ReportUnrelatedGroupText, ((TLRPC.TL_channelLocation) channelLocation).address));
                            }
                        }
                        d2Var.T = LocaleController.getString(R.string.ReportUnrelatedGroupTextNoAddress);
                    }
                    string = LocaleController.getString(R.string.ReportChat);
                    z1VarArr = null;
                }
                final long j11 = j10;
                alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.Components.f3
                    @Override // org.telegram.ui.ActionBar.c2
                    public final void f(org.telegram.ui.ActionBar.d2 d2Var2, int i13) {
                        org.telegram.ui.Cells.z1 z1Var2;
                        TLRPC.User user2 = TLRPC.User.this;
                        AccountInstance accountInstance2 = accountInstance;
                        if (user2 != null) {
                            accountInstance2.getMessagesController().blockPeer(user2.id);
                        }
                        org.telegram.ui.Cells.z1[] z1VarArr3 = z1VarArr;
                        long j12 = j11;
                        TLRPC.Chat chat2 = chat;
                        if (z1VarArr3 == null || ((z1Var2 = z1VarArr3[0]) != null && z1Var2.b())) {
                            accountInstance2.getMessagesController().reportSpam(j12, user2, chat2, encryptedChat, chat2 != null && z10);
                        }
                        MessagesStorage.IntCallback intCallback2 = intCallback;
                        if (z1VarArr3 != null && !z1VarArr3[1].b()) {
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
                p2Var.showDialog(d2Var);
                textView = (TextView) d2Var.d(-1);
                if (textView == null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                    return;
                }
                return;
            }
        } else {
            j10 = j3;
        }
        z11 = true;
        org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder.a;
        if (user == null) {
        }
        final long j112 = j10;
        alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.Components.f3
            @Override // org.telegram.ui.ActionBar.c2
            public final void f(org.telegram.ui.ActionBar.d2 d2Var22, int i13) {
                org.telegram.ui.Cells.z1 z1Var2;
                TLRPC.User user2 = TLRPC.User.this;
                AccountInstance accountInstance2 = accountInstance;
                if (user2 != null) {
                    accountInstance2.getMessagesController().blockPeer(user2.id);
                }
                org.telegram.ui.Cells.z1[] z1VarArr3 = z1VarArr;
                long j12 = j112;
                TLRPC.Chat chat2 = chat;
                if (z1VarArr3 == null || ((z1Var2 = z1VarArr3[0]) != null && z1Var2.b())) {
                    accountInstance2.getMessagesController().reportSpam(j12, user2, chat2, encryptedChat, chat2 != null && z10);
                }
                MessagesStorage.IntCallback intCallback2 = intCallback;
                if (z1VarArr3 != null && !z1VarArr3[1].b()) {
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
        p2Var.showDialog(d2Var2);
        textView = (TextView) d2Var2.d(-1);
        if (textView == null) {
        }
    }

    public static void k(Context context, org.telegram.ui.ActionBar.f6 f6Var, c5 c5Var) {
        if (context == null) {
            return;
        }
        boolean z10 = false;
        int i10 = org.telegram.ui.ActionBar.j6.j5;
        int e02 = f6Var != null ? f6Var.e0(i10) : org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.j6.h5;
        int e03 = f6Var != null ? f6Var.e0(i11) : org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.j6.Ji;
        if (f6Var != null) {
            f6Var.e0(i12);
        } else {
            org.telegram.ui.ActionBar.j6.w0(null, i12, false);
        }
        int i13 = org.telegram.ui.ActionBar.j6.Ni;
        if (f6Var != null) {
            f6Var.e0(i13);
        } else {
            org.telegram.ui.ActionBar.j6.w0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.j6.E8;
        if (f6Var != null) {
            f6Var.e0(i14);
        } else {
            org.telegram.ui.ActionBar.j6.w0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.j6.G8;
        if (f6Var != null) {
            f6Var.e0(i15);
        } else {
            org.telegram.ui.ActionBar.j6.w0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.j6.i6;
        if (f6Var != null) {
            f6Var.e0(i16);
        } else {
            org.telegram.ui.ActionBar.j6.w0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.j6.Sh;
        int e04 = f6Var != null ? f6Var.e0(i17) : org.telegram.ui.ActionBar.j6.w0(null, i17, false);
        int i18 = org.telegram.ui.ActionBar.j6.Oh;
        int e05 = f6Var != null ? f6Var.e0(i18) : org.telegram.ui.ActionBar.j6.w0(null, i18, false);
        int e06 = f6Var != null ? f6Var.e0(org.telegram.ui.ActionBar.j6.Qh) : org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
        org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3(context, f6Var);
        c3Var.a();
        int[] iArr = {0, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        h4 h4Var = new h4(context, f6Var, iArr);
        h4Var.setMinValue(0);
        h4Var.setMaxValue(16);
        h4Var.setTextColor(e02);
        h4Var.setValue(0);
        h4Var.setFormatter(new i1(1, iArr));
        i4 i4Var = new i4(context, h4Var, 0);
        i4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        i4Var.addView(frameLayout, w7.a6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.AutoDeleteAfteTitle));
        textView.setTextColor(e02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, w7.a6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ai.h(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        i4Var.addView(linearLayout, w7.a6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        org.telegram.ui.Cells.t3 t3Var = new org.telegram.ui.Cells.t3(context, 1 == true ? 1 : 0, 1 == true ? 1 : 0, z10, 1);
        linearLayout.addView(h4Var, w7.a6.l(1.0f, 0, 270));
        t3Var.setPadding(0, 0, 0, 0);
        t3Var.setGravity(17);
        t3Var.setTextColor(e04);
        t3Var.setTextSize(AndroidUtilities.dp(14.0f));
        t3Var.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(8.0f);
        t3Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, e05, e06, e06));
        i4Var.addView(t3Var, w7.a6.t(-1, 48, 83, 16, 15, 16, 16));
        t3Var.setText(LocaleController.getString(R.string.DisableAutoDeleteTimer));
        h4Var.setOnValueChangedListener(new t(t3Var, 10));
        t3Var.setOnClickListener(new di.o(iArr, h4Var, c5Var, c3Var, 7));
        c3Var.b(i4Var);
        org.telegram.ui.ActionBar.h3 h3Var = c3Var.a;
        h3Var.show();
        h3Var.setBackgroundColor(e03);
        h3Var.fixNavigationBar(e03);
    }

    public static void k0(org.telegram.ui.eo eoVar, MessageObject messageObject, long j3, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.vg vgVar) {
        if (eoVar.getParentActivity() == null || messageObject == null) {
            return;
        }
        AccountInstance accountInstance = eoVar.getAccountInstance();
        TLRPC.User user = j3 > 0 ? accountInstance.getMessagesController().getUser(Long.valueOf(j3)) : null;
        TLRPC.Chat chat = j3 < 0 ? accountInstance.getMessagesController().getChat(Long.valueOf(-j3)) : null;
        if (user == null && chat == null) {
            return;
        }
        int i10 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eoVar.getParentActivity(), 0, f6Var);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.P0 = false;
        d2Var.N = new d1(vgVar, i10);
        d2Var.R = LocaleController.getString(R.string.BlockUser);
        if (user != null) {
            d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserReplyAlert", R.string.BlockUserReplyAlert, UserObject.getFirstName(user)));
        } else {
            d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserReplyAlert", R.string.BlockUserReplyAlert, chat.title));
        }
        LinearLayout linearLayout = new LinearLayout(eoVar.getParentActivity());
        linearLayout.setOrientation(1);
        org.telegram.ui.Cells.z1[] z1VarArr = {new org.telegram.ui.Cells.z1(eoVar.getParentActivity(), 1, f6Var)};
        z1VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
        z1VarArr[0].setTag(0);
        z1VarArr[0].e(LocaleController.getString(R.string.DeleteReportSpam), "", true, false, false);
        z1VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
        linearLayout.addView(z1VarArr[0], w7.a6.n(-1, -2));
        z1VarArr[0].setOnClickListener(new e1(z1VarArr, i10));
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.k(LocaleController.getString(R.string.BlockAndDeleteReplies), new f1(user, accountInstance, eoVar, chat, messageObject, z1VarArr, f6Var));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        eoVar.showDialog(d2Var);
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
        frameLayout.setOutlineProvider(new q4());
        View view = new View(activity);
        view.setBackground(SvgHelper.getDrawable(readRes));
        frameLayout.addView(view, w7.a6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view2 = new View(activity);
        view2.setBackground(SvgHelper.getDrawable(readRes2));
        frameLayout.addView(view2, w7.a6.d(60, 82.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
        w9 w9Var = new w9(activity);
        w9Var.setRoundRadius(AndroidUtilities.dp(26.0f));
        w9Var.e(user, new g9(0, user));
        frameLayout.addView(w9Var, w7.a6.d(52, 52.0f, 17, 0.0f, 0.0f, 0.0f, 11.0f));
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.V = frameLayout;
        d2Var.O0 = 0.37820512f;
        alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionBackgroundLocation));
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new l1(activity, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new b1(1, runnable));
        return alertDialog$Builder;
    }

    public static void l0(Context context, int i10, long j3) {
        org.telegram.ui.ActionBar.h3 i11 = org.telegram.messenger.em.i(1, context, null, false);
        LinearLayout f7 = org.telegram.messenger.em.f(context, 1);
        f7.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        f7.addView(frameLayout, w7.a6.t(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.story_link);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, w7.a6.e(-1, -1, 17));
        frameLayout2.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false)));
        frameLayout.addView(frameLayout2, w7.a6.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.messenger.a2.q(textView, org.telegram.ui.ActionBar.j6.w0(null, i12, false), 1, 20.0f);
        org.telegram.messenger.em.k(R.string.CallForbiddenInviteLinkTitle, textView, 17);
        TextView g10 = com.google.android.gms.internal.vision.e2.g(f7, textView, w7.a6.k(32.0f, 16.0f, 32.0f, 8.0f, -1, -2), context);
        g10.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        g10.setTextSize(1, 14.0f);
        g10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CallForbiddenInviteLinkText, DialogObject.getName(i10, j3))));
        g10.setGravity(17);
        f7.addView(g10, w7.a6.k(32.0f, 0.0f, 32.0f, 18.0f, -1, -2));
        bi.d dVar = new bi.d(context, null, true);
        dVar.g(LocaleController.getString(R.string.CallForbiddenInviteLinkButton), false, true);
        f7.addView(dVar, w7.a6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
        i11.customView = f7;
        dVar.setOnClickListener(new org.telegram.ui.rd(i10, dVar, i11, j3));
        i11.fixNavigationBar();
        i11.show();
    }

    public static org.telegram.ui.ActionBar.c3 m(Context context, String str, String str2, TL_account.TL_birthday tL_birthday, Utilities.Callback callback, Runnable runnable, boolean z10, boolean z11, org.telegram.ui.ActionBar.f6 f6Var) {
        float f7;
        if (context == null) {
            return null;
        }
        org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3(context, f6Var);
        c3Var.a();
        dd0 dd0Var = new dd0(context, f6Var);
        dd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        dd0Var.setItemCount(5);
        dd0 dd0Var2 = new dd0(context, f6Var);
        dd0Var2.setItemCount(5);
        dd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        dd0 dd0Var3 = new dd0(context, f6Var);
        dd0Var3.setItemCount(5);
        dd0Var3.setTextOffset(-AndroidUtilities.dp(24.0f));
        z3 z3Var = new z3(context, dd0Var, dd0Var2, dd0Var3);
        z3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        z3Var.addView(frameLayout, w7.a6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        org.telegram.messenger.em.x(org.telegram.ui.ActionBar.j6.j5, f6Var, textView, 1, 20.0f);
        frameLayout.addView(textView, w7.a6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ai.h(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        z3Var.addView(linearLayout, w7.a6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        int i10 = calendar.get(1) - 149;
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i11 = calendar.get(5);
        int i12 = calendar.get(2);
        int i13 = calendar.get(1);
        int i14 = i13 + 1;
        x2 x2Var = new x2(dd0Var3, i14, dd0Var, dd0Var2, i13, i12, i11);
        System.currentTimeMillis();
        a4 a4Var = new a4(context);
        linearLayout.addView(dd0Var, w7.a6.l(0.25f, 0, 270));
        dd0Var.setMinValue(1);
        dd0Var.setMaxValue(31);
        dd0Var.setWrapSelectorWheel(false);
        dd0Var.setFormatter(new q2(4));
        t tVar = new t(x2Var, 9);
        dd0Var.setOnScrollListener(tVar);
        dd0Var2.setMinValue(0);
        dd0Var2.setMaxValue(11);
        dd0Var2.setWrapSelectorWheel(false);
        linearLayout.addView(dd0Var2, w7.a6.l(0.5f, 0, 270));
        int i15 = 5;
        dd0Var2.setFormatter(new q2(i15));
        dd0Var2.setOnScrollListener(tVar);
        dd0Var3.setMinValue(i10);
        dd0Var3.setMaxValue(i14);
        dd0Var3.setWrapSelectorWheel(false);
        dd0Var3.setFormatter(new i2.v(i14, i15));
        linearLayout.addView(dd0Var3, w7.a6.l(0.25f, 0, 270));
        dd0Var3.setOnScrollListener(tVar);
        if (tL_birthday != null) {
            dd0Var.setValue(tL_birthday.day);
            dd0Var2.setValue(tL_birthday.month - 1);
            if ((tL_birthday.flags & 1) != 0) {
                dd0Var3.setValue(tL_birthday.year);
            } else {
                dd0Var3.setValue(i14);
            }
        } else {
            dd0Var.setValue(calendar.get(5));
            dd0Var2.setValue(calendar.get(2));
            dd0Var3.setValue(i14);
        }
        x2Var.run();
        if (runnable != null) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            m90 m90Var = new m90(context, null);
            m90Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            m90Var.setTextSize(1, 13.0f);
            m90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q5, f6Var));
            m90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
            m90Var.setGravity(17);
            frameLayout2.addView(m90Var, w7.a6.e(-2, -2, 17));
            z3Var.addView(frameLayout2, w7.a6.n(-1, -2));
            int i16 = UserConfig.selectedAccount;
            bi.s sVar = new bi.s(i16, m90Var, 27);
            sVar.run();
            f7 = 8.0f;
            NotificationCenter.getInstance(i16).listen(frameLayout2, NotificationCenter.privacyRulesUpdated, new y2(sVar, 0));
            ContactsController.getInstance(i16).loadPrivacySettings();
        } else {
            f7 = 8.0f;
        }
        if (z10) {
            bi.d dVar = new bi.d(context, f6Var, false);
            dVar.g(LocaleController.getString(R.string.DateOfBirthHideYear), false, true);
            dVar.setOnClickListener(new org.telegram.ui.Cells.wa(dd0Var3, i14, x2Var, 5));
            z3Var.addView(dVar, w7.a6.t(-1, 48, 83, 16, 15, 16, 4));
        }
        a4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        a4Var.setGravity(17);
        a4Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sh, f6Var));
        a4Var.setTextSize(1, 14.0f);
        a4Var.setTypeface(AndroidUtilities.bold());
        a4Var.setText(str2);
        int dp = AndroidUtilities.dp(f7);
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var);
        int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Qh, f6Var);
        a4Var.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, v02, v03, v03));
        w7.c6.a(a4Var);
        z3Var.addView(a4Var, w7.a6.t(-1, 48, 83, 16, z10 ? 0 : 15, 16, z11 ? 0 : 16));
        a4Var.setOnClickListener(new di.p3(dd0Var, dd0Var2, dd0Var3, i14, c3Var, callback));
        if (z11) {
            bi.d dVar2 = new bi.d(context, f6Var, false);
            dVar2.g(LocaleController.getString(R.string.BirthdayRemove), false, true);
            dVar2.setOnClickListener(new org.telegram.ui.sh(11, c3Var, callback));
            z3Var.addView(dVar2, w7.a6.t(-1, 48, 83, 16, 4, 16, 16));
        }
        c3Var.b(z3Var);
        return c3Var;
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
        d2Var.R = string;
        d2Var.T = LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString);
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
        org.telegram.ui.Cells.z1[] z1VarArr;
        org.telegram.ui.ActionBar.d2 d2Var;
        w9 w9Var;
        boolean[] zArr;
        org.telegram.ui.Cells.z1 z1Var;
        if (p2Var == null) {
            return;
        }
        Context context = p2Var.getContext();
        org.telegram.ui.Cells.z1[] z1VarArr2 = new org.telegram.ui.Cells.z1[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        w4 w4Var = new w4(context, null);
        NotificationCenter.listenEmojiLoading(w4Var);
        w4Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
        w4Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gc, false));
        w4Var.setTextSize(1, 16.0f);
        w4Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        x4 x4Var = new x4(context, z1VarArr2);
        org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder.a;
        d2Var2.G = 6;
        alertDialog$Builder.n(x4Var);
        g9 g9Var = new g9((org.telegram.ui.ActionBar.f6) null);
        g9Var.u(AndroidUtilities.dp(18.0f));
        w9 w9Var2 = new w9(context);
        w9Var2.setRoundRadius(AndroidUtilities.dp(20.0f));
        x4Var.addView(w9Var2, w7.a6.d(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        l5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
        l5Var.setTextSize(20);
        l5Var.setTypeface(AndroidUtilities.bold());
        l5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        l5Var.setEllipsizeByGradient(true);
        l5Var.l(user.first_name, false);
        if (user.scam) {
            l5Var.i(org.telegram.ui.ActionBar.j6.g1);
        } else if (user.fake) {
            l5Var.i(org.telegram.ui.ActionBar.j6.h1);
        } else if (user.verified) {
            Drawable mutate = context.getResources().getDrawable(R.drawable.verified_area).mutate();
            z1VarArr = z1VarArr2;
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.z9, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(w02, mode));
            Drawable mutate2 = context.getResources().getDrawable(R.drawable.verified_check).mutate();
            d2Var = d2Var2;
            w9Var = w9Var2;
            zArr = null;
            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A9, false), mode));
            l5Var.i(new vq(mutate, mutate2));
            TextView textView = new TextView(context);
            int w03 = org.telegram.ui.ActionBar.j6.w0(zArr, org.telegram.ui.ActionBar.j6.m5, false);
            int i10 = 1;
            org.telegram.messenger.em.r(textView, w03, 1, 14.0f, 1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setGravity((!LocaleController.isRTL ? 5 : 3) | 16);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setOnClickListener(new w0(user, p2Var, alertDialog$Builder, i10));
            SpannableString valueOf = SpannableString.valueOf(LocaleController.getString(R.string.MoreAboutThisBot) + "  ");
            uq uqVar = new uq(R.drawable.attach_arrow_right, 0);
            uqVar.setTopOffset(1);
            uqVar.setSize(AndroidUtilities.dp(10.0f));
            valueOf.setSpan(uqVar, valueOf.length() - 1, valueOf.length(), 33);
            textView.setText(valueOf);
            boolean z10 = LocaleController.isRTL;
            x4Var.addView(l5Var, w7.a6.d(-1, -2.0f, (!z10 ? 5 : 3) | 48, !z10 ? 21 : 76, 0.0f, !z10 ? 76 : 21, 0.0f));
            boolean z11 = LocaleController.isRTL;
            x4Var.addView(textView, w7.a6.d(-1, -2.0f, (!z11 ? 5 : 3) | 48, !z11 ? 21 : 76, 24.0f, z11 ? 76 : 21, 0.0f));
            x4Var.addView(w4Var, w7.a6.d(-2, -2.0f, (!LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
            atomicBoolean.set(true);
            z1Var = new org.telegram.ui.Cells.z1(context, 1, p2Var.getResourceProvider());
            z1VarArr[0] = z1Var;
            if (!z1Var.H) {
                org.telegram.ui.Cells.x1 x1Var = z1Var.c;
                x1Var.setLines(3);
                x1Var.setMaxLines(3);
                x1Var.setSingleLine(false);
            }
            z1VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
            z1VarArr[0].e(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.OpenUrlOption2, UserObject.getUserName(user))), "", true, false, false);
            z1VarArr[0].setPadding(!LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, !LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
            z1VarArr[0].c(true, false);
            x4Var.addView(z1VarArr[0], w7.a6.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
            z1VarArr[0].setOnClickListener(new h0(atomicBoolean, 2));
            if (UserObject.isReplyUser(user)) {
                g9Var.p = 1.0f;
                g9Var.m(p2Var.getCurrentAccount(), user);
                w9Var.e(user, g9Var);
            } else {
                g9Var.p = 0.8f;
                g9Var.g(12);
                w9Var.h(null, null, g9Var, user);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.Start), new b1(3, runnable));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
            p2Var.showDialog(d2Var3);
            w4Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebViewStartPermission2), new m1(1, context, d2Var3)));
        }
        z1VarArr = z1VarArr2;
        w9Var = w9Var2;
        d2Var = d2Var2;
        zArr = null;
        TextView textView2 = new TextView(context);
        int w032 = org.telegram.ui.ActionBar.j6.w0(zArr, org.telegram.ui.ActionBar.j6.m5, false);
        int i102 = 1;
        org.telegram.messenger.em.r(textView2, w032, 1, 14.0f, 1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity((!LocaleController.isRTL ? 5 : 3) | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setOnClickListener(new w0(user, p2Var, alertDialog$Builder, i102));
        SpannableString valueOf2 = SpannableString.valueOf(LocaleController.getString(R.string.MoreAboutThisBot) + "  ");
        uq uqVar2 = new uq(R.drawable.attach_arrow_right, 0);
        uqVar2.setTopOffset(1);
        uqVar2.setSize(AndroidUtilities.dp(10.0f));
        valueOf2.setSpan(uqVar2, valueOf2.length() - 1, valueOf2.length(), 33);
        textView2.setText(valueOf2);
        boolean z102 = LocaleController.isRTL;
        x4Var.addView(l5Var, w7.a6.d(-1, -2.0f, (!z102 ? 5 : 3) | 48, !z102 ? 21 : 76, 0.0f, !z102 ? 76 : 21, 0.0f));
        boolean z112 = LocaleController.isRTL;
        x4Var.addView(textView2, w7.a6.d(-1, -2.0f, (!z112 ? 5 : 3) | 48, !z112 ? 21 : 76, 24.0f, z112 ? 76 : 21, 0.0f));
        x4Var.addView(w4Var, w7.a6.d(-2, -2.0f, (!LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
        atomicBoolean.set(true);
        z1Var = new org.telegram.ui.Cells.z1(context, 1, p2Var.getResourceProvider());
        z1VarArr[0] = z1Var;
        if (!z1Var.H) {
        }
        z1VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
        z1VarArr[0].e(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.OpenUrlOption2, UserObject.getUserName(user))), "", true, false, false);
        z1VarArr[0].setPadding(!LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, !LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
        z1VarArr[0].c(true, false);
        x4Var.addView(z1VarArr[0], w7.a6.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        z1VarArr[0].setOnClickListener(new h0(atomicBoolean, 2));
        if (UserObject.isReplyUser(user)) {
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Start), new b1(3, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.d2 d2Var32 = d2Var;
        p2Var.showDialog(d2Var32);
        w4Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebViewStartPermission2), new m1(1, context, d2Var32)));
    }

    public static void n0(Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, Runnable runnable) {
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(j3);
        LinearLayout f7 = org.telegram.messenger.em.f(context, 1);
        f7.addView(new xh.y2(context, tL_starGiftUnique, userOrChat), w7.a6.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.messenger.em.n(org.telegram.ui.ActionBar.j6.j5, f6Var, textView, 1, 16.0f);
        org.telegram.messenger.em.p(R.string.GiftThemesSetInReuseInfo, new Object[]{DialogObject.getDialogTitle(userOrChat)}, textView);
        f7.addView(textView, w7.a6.t(-1, -2, 48, 24, 0, 24, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        alertDialog$Builder.n(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.GiftThemesSetInReuseConfirm), new b1(2, runnable));
        hc.b.s(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void o(org.telegram.ui.ActionBar.p2 p2Var, TLRPC.User user, Runnable runnable, Runnable runnable2) {
        Context context = p2Var.getContext();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        r4 r4Var = new r4(context, null);
        NotificationCenter.listenEmojiLoading(r4Var);
        r4Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
        r4Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gc, false));
        r4Var.setTextSize(1, 16.0f);
        r4Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        FrameLayout frameLayout = new FrameLayout(context);
        alertDialog$Builder.a.G = 6;
        alertDialog$Builder.n(frameLayout);
        g9 g9Var = new g9((org.telegram.ui.ActionBar.f6) null);
        g9Var.u(AndroidUtilities.dp(18.0f));
        w9 w9Var = new w9(context);
        w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        frameLayout.addView(w9Var, w7.a6.d(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        l5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
        l5Var.setTextSize(20);
        l5Var.setTypeface(AndroidUtilities.bold());
        l5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        l5Var.setEllipsizeByGradient(true);
        l5Var.l(user.first_name, false);
        if (user.scam) {
            l5Var.i(org.telegram.ui.ActionBar.j6.g1);
        } else if (user.fake) {
            l5Var.i(org.telegram.ui.ActionBar.j6.h1);
        } else if (user.verified) {
            Drawable mutate = context.getResources().getDrawable(R.drawable.verified_area).mutate();
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.z9, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(w02, mode));
            Drawable mutate2 = context.getResources().getDrawable(R.drawable.verified_check).mutate();
            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A9, false), mode));
            l5Var.i(new vq(mutate, mutate2));
        }
        TextView textView = new TextView(context);
        org.telegram.messenger.em.r(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.m5, false), 1, 14.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new w0(user, p2Var, alertDialog$Builder, 0));
        SpannableString valueOf = SpannableString.valueOf(LocaleController.getString(R.string.MoreAboutThisBot) + "  ");
        uq uqVar = new uq(R.drawable.attach_arrow_right, 0);
        uqVar.setTopOffset(1);
        uqVar.setSize(AndroidUtilities.dp(10.0f));
        valueOf.setSpan(uqVar, valueOf.length() - 1, valueOf.length(), 33);
        textView.setText(valueOf);
        boolean z10 = LocaleController.isRTL;
        frameLayout.addView(l5Var, w7.a6.d(-1, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 21 : 76, 0.0f, z10 ? 76 : 21, 0.0f));
        boolean z11 = LocaleController.isRTL;
        frameLayout.addView(textView, w7.a6.d(-1, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 21 : 76, 24.0f, z11 ? 76 : 21, 0.0f));
        frameLayout.addView(r4Var, w7.a6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
        if (UserObject.isReplyUser(user)) {
            g9Var.p = 0.8f;
            g9Var.g(12);
            w9Var.h(null, null, g9Var, user);
        } else {
            g9Var.p = 1.0f;
            g9Var.m(p2Var.getCurrentAccount(), user);
            w9Var.e(user, g9Var);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Start), new b1(0, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        DialogInterface.OnDismissListener u0Var = new u0(3, runnable2);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        p2Var.showDialog(d2Var, false, u0Var);
        r4Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebViewStartPermission2), new m1(0, context, d2Var)));
    }

    public static void o0(Context context, org.telegram.ui.ActionBar.f6 f6Var, String str, boolean z10, final Utilities.Callback2 callback2) {
        if (AndroidUtilities.isContextSafe(context)) {
            final org.telegram.ui.ActionBar.d2[] d2VarArr = new org.telegram.ui.ActionBar.d2[1];
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
            alertDialog$Builder.a.R = LocaleController.getString(R.string.OpenUrlTitle);
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
            final org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(context, 1, f6Var);
            z1Var.setMultiline(true);
            z1Var.getTextView().getLayoutParams().width = -1;
            z1Var.getTextView().setSingleLine(false);
            z1Var.getTextView().setMaxLines(3);
            z1Var.getTextView().setTextSize(1, 16.0f);
            z1Var.e(LocaleController.getString(z10 ? R.string.BrowserAlwaysOpenExternal : R.string.BrowserAlwaysOpenInApp), "", false, false, false);
            z1Var.setOnClickListener(new h0(z1Var, 1));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.addView(textView, w7.a6.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
            linearLayout.addView(z1Var, w7.a6.t(-1, -2, 3, 8, 6, 8, 4));
            alertDialog$Builder.n(linearLayout);
            alertDialog$Builder.a.a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
            final int i11 = 0;
            alertDialog$Builder.k(LocaleController.getString(R.string.Open), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.Components.k1
                @Override // org.telegram.ui.ActionBar.c2
                public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i12) {
                    switch (i11) {
                        case 0:
                            callback2.run(Boolean.TRUE, Boolean.valueOf(z1Var.b()));
                            org.telegram.ui.ActionBar.d2 d2Var2 = d2VarArr[0];
                            if (d2Var2 != null) {
                                d2Var2.dismiss();
                                break;
                            }
                            break;
                        default:
                            callback2.run(Boolean.FALSE, Boolean.valueOf(z1Var.b()));
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
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.Components.k1
                @Override // org.telegram.ui.ActionBar.c2
                public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i122) {
                    switch (i12) {
                        case 0:
                            callback2.run(Boolean.TRUE, Boolean.valueOf(z1Var.b()));
                            org.telegram.ui.ActionBar.d2 d2Var2 = d2VarArr[0];
                            if (d2Var2 != null) {
                                d2Var2.dismiss();
                                break;
                            }
                            break;
                        default:
                            callback2.run(Boolean.FALSE, Boolean.valueOf(z1Var.b()));
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

    public static org.telegram.ui.ActionBar.c3 p(Activity activity, MessagesStorage.IntCallback intCallback, org.telegram.ui.ActionBar.f6 f6Var) {
        if (activity == null) {
            return null;
        }
        org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3(activity, f6Var);
        c3Var.a();
        dd0 dd0Var = new dd0(activity, f6Var);
        dd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        dd0Var.setItemCount(5);
        dd0 dd0Var2 = new dd0(activity, f6Var);
        dd0Var2.setItemCount(5);
        dd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        dd0 dd0Var3 = new dd0(activity, f6Var);
        dd0Var3.setItemCount(5);
        dd0Var3.setTextOffset(-AndroidUtilities.dp(24.0f));
        n4 n4Var = new n4(activity, dd0Var, dd0Var2, dd0Var3);
        n4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        n4Var.addView(frameLayout, w7.a6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(activity);
        textView.setText(LocaleController.getString(R.string.ChooseDate));
        org.telegram.messenger.em.x(org.telegram.ui.ActionBar.j6.j5, f6Var, textView, 1, 20.0f);
        frameLayout.addView(textView, w7.a6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ai.h(10));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        n4Var.addView(linearLayout, w7.a6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        System.currentTimeMillis();
        o4 o4Var = new o4(activity);
        linearLayout.addView(dd0Var, w7.a6.l(0.25f, 0, 270));
        dd0Var.setMinValue(1);
        dd0Var.setMaxValue(31);
        dd0Var.setWrapSelectorWheel(false);
        dd0Var.setFormatter(new b(2));
        n0 n0Var = new n0(dd0Var, dd0Var2, dd0Var3, 0);
        dd0Var.setOnValueChangedListener(n0Var);
        dd0Var2.setMinValue(0);
        dd0Var2.setMaxValue(11);
        dd0Var2.setWrapSelectorWheel(false);
        linearLayout.addView(dd0Var2, w7.a6.l(0.5f, 0, 270));
        dd0Var2.setFormatter(new b(3));
        dd0Var2.setOnValueChangedListener(n0Var);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(1375315200000L);
        int i10 = calendar.get(1);
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i11 = calendar.get(1);
        dd0Var3.setMinValue(i10);
        dd0Var3.setMaxValue(i11);
        dd0Var3.setWrapSelectorWheel(false);
        dd0Var3.setFormatter(new b(4));
        linearLayout.addView(dd0Var3, w7.a6.l(0.25f, 0, 270));
        dd0Var3.setOnValueChangedListener(n0Var);
        dd0Var.setValue(31);
        dd0Var2.setValue(12);
        dd0Var3.setValue(i11);
        b(dd0Var, dd0Var2, dd0Var3);
        o4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        o4Var.setGravity(17);
        o4Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sh, f6Var));
        o4Var.setTextSize(1, 14.0f);
        o4Var.setTypeface(AndroidUtilities.bold());
        o4Var.setText(LocaleController.getString(R.string.JumpToDate));
        int dp = AndroidUtilities.dp(8.0f);
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var);
        int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Qh, f6Var);
        o4Var.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, v02, v03, v03));
        n4Var.addView(o4Var, w7.a6.t(-1, 48, 83, 16, 15, 16, 16));
        o4Var.setOnClickListener(new o0(dd0Var, dd0Var2, dd0Var3, calendar, intCallback, c3Var, 0));
        c3Var.b(n4Var);
        return c3Var;
    }

    public static void p0(Context context, String str, boolean z10, boolean z11, boolean z12, boolean z13, long j3, nf.e eVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.f6 f6Var) {
        String v;
        LinearLayout linearLayout;
        if (AndroidUtilities.isContextSafe(context)) {
            String scheme = str == null ? null : Uri.parse(str).getScheme();
            if (nf.f.f(Uri.parse(str), false, null) || !z12 || "mailto".equalsIgnoreCase(scheme)) {
                nf.f.r(context, Uri.parse(str), j3 == 0, z11, z13 && Uri.parse(str).getPath().matches("^/\\w*/[^\\d]*(?:\\?startapp=.*?|)$"), eVar, null, false, true, false);
                return;
            }
            if (z10) {
                try {
                    Uri parse = Uri.parse(str);
                    v = nf.f.v(parse, null, null, nf.f.a(parse.getHost()), null);
                } catch (Exception e) {
                    FileLog.e((Throwable) e, false);
                }
                r2 r2Var = new r2(context, str, j3, z11, eVar);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
                String string = LocaleController.getString(R.string.OpenUrlTitle);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                d2Var.R = string;
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
                linearLayout.addView(textView, w7.a6.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
                int i11 = d91.f;
                if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
                    d91 d91Var = new d91(context, f6Var);
                    d91Var.setWebPage(webPage);
                    linearLayout.addView(d91Var, w7.a6.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
                }
                alertDialog$Builder.n(linearLayout);
                d2Var.a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
                alertDialog$Builder.k(LocaleController.getString(R.string.Open), new t(r2Var, 8));
                hc.b.s(R.string.Cancel, alertDialog$Builder, null);
            }
            v = str;
            r2 r2Var2 = new r2(context, str, j3, z11, eVar);
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context, 0, f6Var);
            String string2 = LocaleController.getString(R.string.OpenUrlTitle);
            org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.a;
            d2Var2.R = string2;
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
            linearLayout.addView(textView2, w7.a6.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
            int i112 = d91.f;
            if (webPage != null) {
                d91 d91Var2 = new d91(context, f6Var);
                d91Var2.setWebPage(webPage);
                linearLayout.addView(d91Var2, w7.a6.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
            }
            alertDialog$Builder2.n(linearLayout);
            d2Var2.a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Open), new t(r2Var2, 8));
            hc.b.s(R.string.Cancel, alertDialog$Builder2, null);
        }
    }

    public static void q(org.telegram.ui.ActionBar.p2 p2Var, TLRPC.User user, boolean z10) {
        String string;
        String formatString;
        if (p2Var.getParentActivity() == null || user == null || UserObject.isDeleted(user) || UserConfig.getInstance(p2Var.getCurrentAccount()).getClientUserId() == user.id) {
            return;
        }
        p2Var.getCurrentAccount();
        Activity parentActivity = p2Var.getParentActivity();
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        if (z10) {
            string = LocaleController.getString(R.string.VideoCallAlertTitle);
            formatString = LocaleController.formatString("VideoCallAlert", R.string.VideoCallAlert, UserObject.getUserName(user));
        } else {
            string = LocaleController.getString(R.string.CallAlertTitle);
            formatString = LocaleController.formatString("CallAlert", R.string.CallAlert, UserObject.getUserName(user));
        }
        m3 m3Var = new m3(parentActivity);
        NotificationCenter.listenEmojiLoading(m3Var);
        m3Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
        m3Var.setTextSize(1, 16.0f);
        m3Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        m3Var.setText(AndroidUtilities.replaceTags(formatString));
        g9 g9Var = new g9((org.telegram.ui.ActionBar.f6) null);
        g9Var.u(AndroidUtilities.dp(12.0f));
        g9Var.p = 1.0f;
        g9Var.m(p2Var.getCurrentAccount(), user);
        w9 w9Var = new w9(parentActivity);
        w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        w9Var.e(user, g9Var);
        frameLayout.addView(w9Var, w7.a6.d(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
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
        boolean z11 = LocaleController.isRTL;
        frameLayout.addView(textView, w7.a6.d(-1, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 21 : 76, 11.0f, z11 ? 76 : 21, 0.0f));
        frameLayout.addView(m3Var, w7.a6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
        alertDialog$Builder.n(frameLayout);
        alertDialog$Builder.k(LocaleController.getString(R.string.Call), new com.google.firebase.messaging.i(p2Var, user, z10, 6));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        p2Var.showDialog(alertDialog$Builder.a);
    }

    public static void q0(org.telegram.ui.ActionBar.p2 p2Var, String str, boolean z10, boolean z11) {
        r0(p2Var, str, z10, true, z11, false, null, null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0180, code lost:
    
        if (org.telegram.messenger.ChatObject.isMonoForum(r34) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0198, code lost:
    
        r5 = new org.telegram.ui.Cells.z1(r6, 1, r37);
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
        r15.addView(r11[0], w7.a6.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        r11[0].c(false, false);
        r11[0].setOnClickListener(new org.telegram.ui.Components.v0(4, r1));
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
    /* JADX WARN: Removed duplicated region for block: B:60:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0184  */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void r(org.telegram.ui.ActionBar.p2 p2Var, int i10, TLRPC.User user, TLRPC.Chat chat, boolean z10, MessagesStorage.BooleanCallback booleanCallback, org.telegram.ui.ActionBar.f6 f6Var) {
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
        org.telegram.ui.Cells.z1[] z1VarArr = new org.telegram.ui.Cells.z1[1];
        k3 k3Var = new k3(parentActivity);
        NotificationCenter.listenEmojiLoading(k3Var);
        k3Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
        k3Var.setTextSize(1, 16.0f);
        k3Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        l3 l3Var = new l3(parentActivity, z1VarArr);
        alertDialog$Builder.n(l3Var);
        TextView textView2 = new TextView(parentActivity);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
        textView2.setTextSize(1, 20.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        l3Var.addView(textView2, w7.a6.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 11.0f, 24.0f, 0.0f));
        l3Var.addView(k3Var, w7.a6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 48.0f, 24.0f, 18.0f));
        if (i10 == -1) {
            textView2.setText(LocaleController.formatString("ClearHistory", R.string.ClearHistory, new Object[0]));
            if (user != null) {
                k3Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureClearHistoryWithUser", R.string.AreYouSureClearHistoryWithUser, UserObject.getUserName(user))));
            } else if (z10) {
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    i11 = 1;
                    k3Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureClearHistoryWithChannel", R.string.AreYouSureClearHistoryWithChannel, chat.title)));
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
                    alertDialog$Builder.k(string, new org.telegram.ui.oe(23, booleanCallback, zArr));
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
                k3Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureClearHistoryWithChat", R.string.AreYouSureClearHistoryWithChat, chat.title)));
            } else if (chat.megagroup) {
                k3Var.setText(LocaleController.getString(R.string.AreYouSureClearHistoryGroup));
            } else {
                k3Var.setText(LocaleController.getString(R.string.AreYouSureClearHistoryChannel));
            }
        } else {
            textView2.setText(LocaleController.formatPluralString("DeleteDays", i10, new Object[0]));
            k3Var.setText(LocaleController.getString(R.string.DeleteHistoryByDaysMessage));
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
        alertDialog$Builder.k(string, new org.telegram.ui.oe(23, booleanCallback, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder.a;
        p2Var.showDialog(d2Var2);
        textView = (TextView) d2Var2.d(-1);
        if (textView == null) {
        }
    }

    public static void r0(org.telegram.ui.ActionBar.p2 p2Var, String str, boolean z10, boolean z11, boolean z12, boolean z13, nf.e eVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.f6 f6Var) {
        if (p2Var == null || p2Var.getParentActivity() == null) {
            return;
        }
        p0(p2Var.getParentActivity(), str, z10, z11, z12, z13, p2Var instanceof org.telegram.ui.eo ? ((org.telegram.ui.eo) p2Var).f8 : 0L, eVar, webPage, f6Var);
    }

    public static void s(org.telegram.ui.ActionBar.p2 p2Var, boolean z10, TLRPC.Chat chat, TLRPC.User user, boolean z11, boolean z12, boolean z13, boolean z14, MessagesStorage.BooleanCallback booleanCallback) {
        t(p2Var, z10, false, chat, user, z11, z12, z13, z14, booleanCallback, p2Var != null ? p2Var.getResourceProvider() : null);
    }

    public static void s0(Activity activity, int i10, Runnable runnable, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i11 = MessagesController.getInstance(i10).availableMapProviders;
        if ((i11 & 1) != 0) {
            org.telegram.ui.Cells.r6.u(R.string.MapPreviewProviderTelegram, 0, arrayList, arrayList2);
        }
        if ((i11 & 2) != 0) {
            org.telegram.ui.Cells.r6.u(R.string.MapPreviewProviderGoogle, 1, arrayList, arrayList2);
        }
        if ((i11 & 4) != 0) {
            org.telegram.ui.Cells.r6.u(R.string.MapPreviewProviderYandex, 3, arrayList, arrayList2);
        }
        arrayList.add(LocaleController.getString(R.string.MapPreviewProviderNobody));
        arrayList2.add(2);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, f6Var);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.MapPreviewProviderTitle);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            org.telegram.ui.Cells.m6 m6Var = new org.telegram.ui.Cells.m6(activity, f6Var);
            m6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            m6Var.setTag(Integer.valueOf(i12));
            m6Var.a(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.g7, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E5, false));
            m6Var.b((CharSequence) arrayList.get(i12), SharedConfig.mapPreviewType == ((Integer) arrayList2.get(i12)).intValue());
            m6Var.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), 2, -1));
            linearLayout.addView(m6Var);
            m6Var.setOnClickListener(new bi.q(arrayList2, runnable, alertDialog$Builder, 10));
        }
        if (!z10) {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        org.telegram.ui.ActionBar.d2 o9 = alertDialog$Builder.o();
        if (z10) {
            o9.setCanceledOnTouchOutside(false);
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
    public static void t(final org.telegram.ui.ActionBar.p2 p2Var, final boolean z10, final boolean z11, TLRPC.Chat chat, final TLRPC.User user, final boolean z12, final boolean z13, boolean z14, final boolean z15, final MessagesStorage.BooleanCallback booleanCallback, final org.telegram.ui.ActionBar.f6 f6Var) {
        long j3;
        boolean z16;
        org.telegram.ui.Cells.z1[] z1VarArr;
        g3 g3Var;
        TLRPC.Chat chat2;
        org.telegram.ui.Cells.z1[] z1VarArr2;
        w9 w9Var;
        float f7;
        float f10;
        final TLRPC.Chat chat3;
        boolean z17;
        w9 w9Var2;
        org.telegram.ui.ActionBar.d2 d2Var;
        boolean z18;
        boolean z19;
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
        org.telegram.ui.Cells.z1[] z1VarArr3 = new org.telegram.ui.Cells.z1[1];
        g3 g3Var2 = new g3(parentActivity);
        NotificationCenter.listenEmojiLoading(g3Var2);
        g3Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
        g3Var2.setTextSize(1, 16.0f);
        g3Var2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        if (!z15 && ChatObject.isChannel(chat) && ChatObject.isPublic(chat)) {
            j3 = clientUserId;
            z16 = true;
        } else {
            j3 = clientUserId;
            z16 = false;
        }
        h3 h3Var = new h3(parentActivity, z1VarArr3);
        org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder.a;
        d2Var2.G = 6;
        alertDialog$Builder.n(h3Var);
        g9 g9Var = new g9((org.telegram.ui.ActionBar.f6) null);
        g9Var.u(AndroidUtilities.dp(18.0f));
        w9 w9Var3 = new w9(parentActivity);
        w9Var3.setRoundRadius(AndroidUtilities.dp(15.0f));
        h3Var.addView(w9Var3, w7.a6.d(30, 30.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        o6 o6Var = new o6(parentActivity, false, false, false);
        final boolean z20 = z16;
        o6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
        o6Var.setTextSize(AndroidUtilities.dp(20.0f));
        o6Var.setTypeface(AndroidUtilities.bold());
        o6Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        o6Var.setEllipsizeByGradient(true);
        if (z10) {
            if (z20) {
                o6Var.setText(LocaleController.getString(R.string.ClearHistoryCache));
            } else {
                o6Var.setText(LocaleController.getString(R.string.ClearHistory));
            }
        } else if (chat == null) {
            o6Var.setText(LocaleController.getString(R.string.DeleteChatUser));
        } else if (ChatObject.isCommunity(chat)) {
            o6Var.setText(LocaleController.getString(R.string.CommunityDelete));
        } else if (!ChatObject.isChannel(chat)) {
            o6Var.setText(LocaleController.getString(R.string.LeaveMega));
        } else if (chat.monoforum) {
            o6Var.setText(LocaleController.getString(R.string.LeaveConversationMenu));
        } else if (chat.megagroup) {
            o6Var.setText(LocaleController.getString(R.string.LeaveMega));
        } else {
            o6Var.setText(LocaleController.getString(R.string.LeaveChannel));
        }
        boolean z21 = LocaleController.isRTL;
        h3Var.addView(o6Var, w7.a6.d(-1, 24.0f, (z21 ? 5 : 3) | 48, z21 ? 22 : 65, 7.66f, z21 ? 65 : 22, 0.0f));
        h3Var.addView(g3Var2, w7.a6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 49.0f, 24.0f, 1.0f));
        if (ChatObject.isMonoForum(chat)) {
            z1VarArr = z1VarArr3;
            g3Var = g3Var2;
            chat2 = p2Var.getMessagesController().getMonoForumLinkedChat(chat.id);
        } else {
            z1VarArr = z1VarArr3;
            g3Var = g3Var2;
            chat2 = null;
        }
        boolean z22 = !z12 && user != null && (user != null && !user.bot && (user.id > j3 ? 1 : (user.id == j3 ? 0 : -1)) != 0 && MessagesController.getInstance(currentAccount).canRevokePmInbox) && (user != null ? MessagesController.getInstance(currentAccount).revokeTimePmLimit : MessagesController.getInstance(currentAccount).revokeTimeLimit) == Integer.MAX_VALUE;
        g3 g3Var3 = g3Var;
        final boolean[] zArr = new boolean[1];
        ArrayList arrayList = user != null ? (ArrayList) MessagesController.getInstance(currentAccount).dialogMessage.f(user.id) : null;
        boolean z23 = (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((MessageObject) arrayList.get(0)).messageOwner == null || (!(((MessageObject) arrayList.get(0)).messageOwner.action instanceof TLRPC.TL_messageActionUserJoined) && !(((MessageObject) arrayList.get(0)).messageOwner.action instanceof TLRPC.TL_messageActionContactSignUp))) ? false : true;
        if (user != null) {
            f7 = 10.0f;
            if (user.bot) {
                w9Var = w9Var3;
                f10 = 8.0f;
                if (user.id != UserObject.VERIFY) {
                    org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(parentActivity, 1, f6Var);
                    z1VarArr[0] = z1Var;
                    z1Var.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                    z1VarArr[0].e(LocaleController.getString(R.string.BlockBot), "", false, false, false);
                    org.telegram.ui.Cells.z1[] z1VarArr4 = z1VarArr;
                    z1VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f), LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), AndroidUtilities.dp(10.0f));
                    org.telegram.ui.Cells.z1 z1Var2 = z1VarArr4[0];
                    zArr[0] = true;
                    z1Var2.c(true, false);
                    z1VarArr4[0].setMultiline(true);
                    h3Var.addView(z1VarArr4[0], w7.a6.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                    z1VarArr4[0].setOnClickListener(new v0(3, zArr));
                    chat3 = chat;
                    w9Var2 = w9Var;
                    d2Var = d2Var2;
                    z18 = false;
                    if (user == null) {
                        w9 w9Var4 = w9Var2;
                        g9Var.k(p2Var.getCurrentAccount(), chat2 != null ? chat2 : chat3);
                        w9Var4.e(chat2 != null ? chat2 : chat3, g9Var);
                    } else if (UserObject.isReplyUser(user)) {
                        g9Var.p = 0.8f;
                        g9Var.g(12);
                        w9Var2.h(null, null, g9Var, user);
                    } else {
                        w9 w9Var5 = w9Var2;
                        if (user.id == j3) {
                            g9Var.p = 0.8f;
                            g9Var.g(1);
                            w9Var5.h(null, null, g9Var, user);
                        } else {
                            g9Var.p = 1.0f;
                            g9Var.m(p2Var.getCurrentAccount(), user);
                            w9Var5.e(user, g9Var);
                        }
                    }
                    if (z11) {
                        if (UserObject.isUserSelf(user)) {
                            g3Var3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DeleteAllMessagesSavedAlert)));
                        } else if (chat3 == null || !ChatObject.isChannelAndNotMegaGroup(chat3)) {
                            g3Var3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DeleteAllMessagesAlert)));
                        } else {
                            g3Var3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DeleteAllMessagesChannelAlert)));
                        }
                    } else if (z10) {
                        if (user == null) {
                            String formatString = chat2 != null ? LocaleController.formatString(R.string.MonoforumTitle, chat2.title) : chat3.title;
                            if (!ChatObject.isChannel(chat3) || (chat3.megagroup && !ChatObject.isPublic(chat3))) {
                                g3Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithChat, formatString)));
                            } else if (chat3.megagroup) {
                                g3Var3.setText(LocaleController.getString(R.string.AreYouSureClearHistoryGroup));
                            } else {
                                g3Var3.setText(LocaleController.getString(R.string.AreYouSureClearHistoryChannel));
                            }
                        } else if (z12) {
                            g3Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithSecretUser, UserObject.getUserName(user))));
                        } else if (user.id == j3) {
                            g3Var3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AreYouSureClearHistorySavedMessages)));
                        } else {
                            g3Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithUser, UserObject.getUserName(user))));
                        }
                    } else if (user != null) {
                        if (z12) {
                            g3Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteThisChatWithSecretUser, UserObject.getUserName(user))));
                        } else if (user.id == j3) {
                            g3Var3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AreYouSureDeleteThisChatSavedMessages)));
                        } else if (!user.bot || user.support) {
                            g3Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteThisChatWithUser, UserObject.getUserName(user))));
                        } else {
                            g3Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteThisChatWithBotWithCheckmark, UserObject.getUserName(user))));
                        }
                    } else if (ChatObject.isChannel(chat3)) {
                        String formatString2 = chat2 != null ? LocaleController.formatString(R.string.MonoforumTitle, chat2.title) : chat3.title;
                        if (chat3.megagroup) {
                            g3Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.MegaLeaveAlertWithName, formatString2)));
                        } else {
                            g3Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.ChannelLeaveAlertWithName, formatString2)));
                        }
                    } else {
                        g3Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteAndExitName, chat3.title)));
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
                            org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                            alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.Components.v2
                                @Override // org.telegram.ui.ActionBar.c2
                                public final void f(org.telegram.ui.ActionBar.d2 d2Var4, int i10) {
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
                                        final org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                                        final boolean z27 = z10;
                                        final TLRPC.Chat chat4 = chat3;
                                        final boolean z28 = z13;
                                        final boolean z29 = z15;
                                        final org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                                        if (isUserSelf) {
                                            d5.t(p2Var2, z27, true, chat4, user2, false, z28, zArr3[0], z29, booleanCallback2, f6Var2);
                                            return;
                                        }
                                        if (user2 != null && zArr3[0]) {
                                            MessagesStorage.getInstance(p2Var2.getCurrentAccount()).getMessagesCount(user2.id, new MessagesStorage.IntCallback() { // from class: org.telegram.ui.Components.p1
                                                @Override // org.telegram.messenger.MessagesStorage.IntCallback
                                                public final void run(int i11) {
                                                    boolean[] zArr4 = zArr3;
                                                    MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                                    if (i11 >= 50) {
                                                        d5.t(org.telegram.ui.ActionBar.p2.this, z27, true, chat4, user2, false, z28, zArr4[0], z29, booleanCallback3, f6Var2);
                                                    } else if (booleanCallback3 != null) {
                                                        booleanCallback3.run(zArr4[0]);
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                        zArr2 = zArr3;
                                        if (ChatObject.isChannel(chat4) && chat4.creator && !zArr2[0]) {
                                            final nf.e g10 = alertDialog$Builder.a.g(-1, true, true);
                                            g10.d();
                                            TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                                            tL_channels_getFutureCreatorAfterLeave.channel = MessagesController.getInputChannel(chat4);
                                            final int i11 = currentAccount;
                                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                                            org.telegram.messenger.a aVar = new org.telegram.messenger.a();
                                            final Context context = parentActivity;
                                            connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, aVar, new Utilities.Callback2() { // from class: org.telegram.ui.Components.q1
                                                @Override // org.telegram.messenger.Utilities.Callback2
                                                public final void run(Object obj, Object obj2) {
                                                    TLRPC.User user3 = (TLRPC.User) obj;
                                                    nf.e.this.c(false);
                                                    TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                                    MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                                    if (user4 == null) {
                                                        booleanCallback3.run(z25 || zArr2[0]);
                                                        return;
                                                    }
                                                    Context context2 = context;
                                                    TLRPC.Chat chat5 = chat4;
                                                    org.telegram.messenger.w0 w0Var = new org.telegram.messenger.w0(context2, chat5, user4, i11, booleanCallback3, f6Var2, 5);
                                                    v1 v1Var = new v1(booleanCallback3, 0);
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
                                                    w9 w9Var6 = new w9(context3);
                                                    g9 g9Var2 = new g9((org.telegram.ui.ActionBar.f6) null);
                                                    g9Var2.r(currentUser);
                                                    w9Var6.setRoundRadius(AndroidUtilities.dp(30.0f));
                                                    w9Var6.e(currentUser, g9Var2);
                                                    frameLayout.addView(w9Var6, w7.a6.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                                    ImageView imageView = new ImageView(context3);
                                                    imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                                    imageView.setColorFilter(new PorterDuffColorFilter(p2Var3.getThemedColor(org.telegram.ui.ActionBar.j6.d7), PorterDuff.Mode.SRC_IN));
                                                    frameLayout.addView(imageView, w7.a6.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                                    i3 i3Var = new i3(context3);
                                                    g9 g9Var3 = new g9((org.telegram.ui.ActionBar.f6) null);
                                                    g9Var3.r(user4);
                                                    i3Var.setRoundRadius(AndroidUtilities.dp(30.0f));
                                                    i3Var.e(user4, g9Var3);
                                                    frameLayout.addView(i3Var, w7.a6.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                                    w9 w9Var7 = new w9(context3);
                                                    g9 g9Var4 = new g9((org.telegram.ui.ActionBar.f6) null);
                                                    g9Var4.q(chat5);
                                                    w9Var7.setRoundRadius(AndroidUtilities.dp(12.0f));
                                                    w9Var7.e(chat5, g9Var4);
                                                    frameLayout.addView(w9Var7, w7.a6.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                                    org.telegram.ui.ActionBar.d2 d2Var5 = alertDialog$Builder2.a;
                                                    d2Var5.O0 = -1.0f;
                                                    d2Var5.V = frameLayout;
                                                    d2Var5.R = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannelTitle : R.string.LeaveGroupTitle);
                                                    d2Var5.T = AndroidUtilities.replaceTags(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.LeaveChannelNewOwnerText : R.string.LeaveGroupNewOwnerText, UserObject.getUserName(user4), chat5.title));
                                                    alertDialog$Builder2.h(LocaleController.getString(R.string.AppointNewOwner), new t(w0Var, 4));
                                                    alertDialog$Builder2.i(LocaleController.getString(R.string.Cancel), null);
                                                    alertDialog$Builder2.k(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannel : R.string.LeaveMegaMenu), new t(v1Var, 5));
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
                                    if (!z25 && !zArr2[0]) {
                                        z26 = false;
                                    }
                                    booleanCallback2.run(z26);
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
                        string = z20 ? LocaleController.getString(R.string.ClearHistoryCache) : LocaleController.getString(R.string.ClearForMe);
                    }
                    org.telegram.ui.ActionBar.d2 d2Var32 = d2Var;
                    alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.Components.v2
                        @Override // org.telegram.ui.ActionBar.c2
                        public final void f(org.telegram.ui.ActionBar.d2 d2Var4, int i10) {
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
                                final org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                                final boolean z27 = z10;
                                final TLRPC.Chat chat4 = chat3;
                                final boolean z28 = z13;
                                final boolean z29 = z15;
                                final org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                                if (isUserSelf) {
                                    d5.t(p2Var2, z27, true, chat4, user2, false, z28, zArr3[0], z29, booleanCallback2, f6Var2);
                                    return;
                                }
                                if (user2 != null && zArr3[0]) {
                                    MessagesStorage.getInstance(p2Var2.getCurrentAccount()).getMessagesCount(user2.id, new MessagesStorage.IntCallback() { // from class: org.telegram.ui.Components.p1
                                        @Override // org.telegram.messenger.MessagesStorage.IntCallback
                                        public final void run(int i11) {
                                            boolean[] zArr4 = zArr3;
                                            MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                            if (i11 >= 50) {
                                                d5.t(org.telegram.ui.ActionBar.p2.this, z27, true, chat4, user2, false, z28, zArr4[0], z29, booleanCallback3, f6Var2);
                                            } else if (booleanCallback3 != null) {
                                                booleanCallback3.run(zArr4[0]);
                                            }
                                        }
                                    });
                                    return;
                                }
                                zArr2 = zArr3;
                                if (ChatObject.isChannel(chat4) && chat4.creator && !zArr2[0]) {
                                    final nf.e g10 = alertDialog$Builder.a.g(-1, true, true);
                                    g10.d();
                                    TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                                    tL_channels_getFutureCreatorAfterLeave.channel = MessagesController.getInputChannel(chat4);
                                    final int i11 = currentAccount;
                                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                                    org.telegram.messenger.a aVar = new org.telegram.messenger.a();
                                    final Context context = parentActivity;
                                    connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, aVar, new Utilities.Callback2() { // from class: org.telegram.ui.Components.q1
                                        @Override // org.telegram.messenger.Utilities.Callback2
                                        public final void run(Object obj, Object obj2) {
                                            TLRPC.User user3 = (TLRPC.User) obj;
                                            nf.e.this.c(false);
                                            TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                            MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                            if (user4 == null) {
                                                booleanCallback3.run(z25 || zArr2[0]);
                                                return;
                                            }
                                            Context context2 = context;
                                            TLRPC.Chat chat5 = chat4;
                                            org.telegram.messenger.w0 w0Var = new org.telegram.messenger.w0(context2, chat5, user4, i11, booleanCallback3, f6Var2, 5);
                                            v1 v1Var = new v1(booleanCallback3, 0);
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
                                            w9 w9Var6 = new w9(context3);
                                            g9 g9Var2 = new g9((org.telegram.ui.ActionBar.f6) null);
                                            g9Var2.r(currentUser);
                                            w9Var6.setRoundRadius(AndroidUtilities.dp(30.0f));
                                            w9Var6.e(currentUser, g9Var2);
                                            frameLayout.addView(w9Var6, w7.a6.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                            ImageView imageView = new ImageView(context3);
                                            imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                            imageView.setColorFilter(new PorterDuffColorFilter(p2Var3.getThemedColor(org.telegram.ui.ActionBar.j6.d7), PorterDuff.Mode.SRC_IN));
                                            frameLayout.addView(imageView, w7.a6.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                            i3 i3Var = new i3(context3);
                                            g9 g9Var3 = new g9((org.telegram.ui.ActionBar.f6) null);
                                            g9Var3.r(user4);
                                            i3Var.setRoundRadius(AndroidUtilities.dp(30.0f));
                                            i3Var.e(user4, g9Var3);
                                            frameLayout.addView(i3Var, w7.a6.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                            w9 w9Var7 = new w9(context3);
                                            g9 g9Var4 = new g9((org.telegram.ui.ActionBar.f6) null);
                                            g9Var4.q(chat5);
                                            w9Var7.setRoundRadius(AndroidUtilities.dp(12.0f));
                                            w9Var7.e(chat5, g9Var4);
                                            frameLayout.addView(w9Var7, w7.a6.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                            org.telegram.ui.ActionBar.d2 d2Var5 = alertDialog$Builder2.a;
                                            d2Var5.O0 = -1.0f;
                                            d2Var5.V = frameLayout;
                                            d2Var5.R = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannelTitle : R.string.LeaveGroupTitle);
                                            d2Var5.T = AndroidUtilities.replaceTags(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.LeaveChannelNewOwnerText : R.string.LeaveGroupNewOwnerText, UserObject.getUserName(user4), chat5.title));
                                            alertDialog$Builder2.h(LocaleController.getString(R.string.AppointNewOwner), new t(w0Var, 4));
                                            alertDialog$Builder2.i(LocaleController.getString(R.string.Cancel), null);
                                            alertDialog$Builder2.k(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannel : R.string.LeaveMegaMenu), new t(v1Var, 5));
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
                            if (!z25 && !zArr2[0]) {
                                z26 = false;
                            }
                            booleanCallback2.run(z26);
                        }
                    });
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    p2Var.showDialog(d2Var32);
                    textView = (TextView) d2Var32.d(-1);
                    if (textView == null) {
                    }
                } else {
                    z1VarArr2 = z1VarArr;
                    if (!z11 || (((!z12 || z10) && !z22) || UserObject.isDeleted(user) || z23)) {
                        if (z13 || z10 || chat == null) {
                            chat3 = chat;
                        } else {
                            chat3 = chat;
                            if (chat3.creator) {
                                z17 = true;
                                if (!z17) {
                                    w9Var2 = w9Var;
                                    d2Var = d2Var2;
                                    z18 = z17;
                                    if (user == null) {
                                    }
                                    if (z11) {
                                    }
                                    if (z11) {
                                    }
                                    org.telegram.ui.ActionBar.d2 d2Var322 = d2Var;
                                    alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.Components.v2
                                        @Override // org.telegram.ui.ActionBar.c2
                                        public final void f(org.telegram.ui.ActionBar.d2 d2Var4, int i10) {
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
                                                final org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                                                final boolean z27 = z10;
                                                final TLRPC.Chat chat4 = chat3;
                                                final boolean z28 = z13;
                                                final boolean z29 = z15;
                                                final org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                                                if (isUserSelf) {
                                                    d5.t(p2Var2, z27, true, chat4, user2, false, z28, zArr3[0], z29, booleanCallback2, f6Var2);
                                                    return;
                                                }
                                                if (user2 != null && zArr3[0]) {
                                                    MessagesStorage.getInstance(p2Var2.getCurrentAccount()).getMessagesCount(user2.id, new MessagesStorage.IntCallback() { // from class: org.telegram.ui.Components.p1
                                                        @Override // org.telegram.messenger.MessagesStorage.IntCallback
                                                        public final void run(int i11) {
                                                            boolean[] zArr4 = zArr3;
                                                            MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                                            if (i11 >= 50) {
                                                                d5.t(org.telegram.ui.ActionBar.p2.this, z27, true, chat4, user2, false, z28, zArr4[0], z29, booleanCallback3, f6Var2);
                                                            } else if (booleanCallback3 != null) {
                                                                booleanCallback3.run(zArr4[0]);
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                                zArr2 = zArr3;
                                                if (ChatObject.isChannel(chat4) && chat4.creator && !zArr2[0]) {
                                                    final nf.e g10 = alertDialog$Builder.a.g(-1, true, true);
                                                    g10.d();
                                                    TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                                                    tL_channels_getFutureCreatorAfterLeave.channel = MessagesController.getInputChannel(chat4);
                                                    final int i11 = currentAccount;
                                                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                                                    org.telegram.messenger.a aVar = new org.telegram.messenger.a();
                                                    final Context context = parentActivity;
                                                    connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, aVar, new Utilities.Callback2() { // from class: org.telegram.ui.Components.q1
                                                        @Override // org.telegram.messenger.Utilities.Callback2
                                                        public final void run(Object obj, Object obj2) {
                                                            TLRPC.User user3 = (TLRPC.User) obj;
                                                            nf.e.this.c(false);
                                                            TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                                            MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                                            if (user4 == null) {
                                                                booleanCallback3.run(z25 || zArr2[0]);
                                                                return;
                                                            }
                                                            Context context2 = context;
                                                            TLRPC.Chat chat5 = chat4;
                                                            org.telegram.messenger.w0 w0Var = new org.telegram.messenger.w0(context2, chat5, user4, i11, booleanCallback3, f6Var2, 5);
                                                            v1 v1Var = new v1(booleanCallback3, 0);
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
                                                            w9 w9Var6 = new w9(context3);
                                                            g9 g9Var2 = new g9((org.telegram.ui.ActionBar.f6) null);
                                                            g9Var2.r(currentUser);
                                                            w9Var6.setRoundRadius(AndroidUtilities.dp(30.0f));
                                                            w9Var6.e(currentUser, g9Var2);
                                                            frameLayout.addView(w9Var6, w7.a6.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                                            ImageView imageView = new ImageView(context3);
                                                            imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                                            imageView.setColorFilter(new PorterDuffColorFilter(p2Var3.getThemedColor(org.telegram.ui.ActionBar.j6.d7), PorterDuff.Mode.SRC_IN));
                                                            frameLayout.addView(imageView, w7.a6.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                                            i3 i3Var = new i3(context3);
                                                            g9 g9Var3 = new g9((org.telegram.ui.ActionBar.f6) null);
                                                            g9Var3.r(user4);
                                                            i3Var.setRoundRadius(AndroidUtilities.dp(30.0f));
                                                            i3Var.e(user4, g9Var3);
                                                            frameLayout.addView(i3Var, w7.a6.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                                            w9 w9Var7 = new w9(context3);
                                                            g9 g9Var4 = new g9((org.telegram.ui.ActionBar.f6) null);
                                                            g9Var4.q(chat5);
                                                            w9Var7.setRoundRadius(AndroidUtilities.dp(12.0f));
                                                            w9Var7.e(chat5, g9Var4);
                                                            frameLayout.addView(w9Var7, w7.a6.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                                            org.telegram.ui.ActionBar.d2 d2Var5 = alertDialog$Builder2.a;
                                                            d2Var5.O0 = -1.0f;
                                                            d2Var5.V = frameLayout;
                                                            d2Var5.R = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannelTitle : R.string.LeaveGroupTitle);
                                                            d2Var5.T = AndroidUtilities.replaceTags(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.LeaveChannelNewOwnerText : R.string.LeaveGroupNewOwnerText, UserObject.getUserName(user4), chat5.title));
                                                            alertDialog$Builder2.h(LocaleController.getString(R.string.AppointNewOwner), new t(w0Var, 4));
                                                            alertDialog$Builder2.i(LocaleController.getString(R.string.Cancel), null);
                                                            alertDialog$Builder2.k(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannel : R.string.LeaveMegaMenu), new t(v1Var, 5));
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
                                            if (!z25 && !zArr2[0]) {
                                                z26 = false;
                                            }
                                            booleanCallback2.run(z26);
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
                        z17 = false;
                        if (!z17) {
                        }
                    } else {
                        chat3 = chat;
                        z17 = false;
                    }
                    org.telegram.ui.Cells.z1 z1Var3 = new org.telegram.ui.Cells.z1(parentActivity, 1, f6Var);
                    z1VarArr2[0] = z1Var3;
                    z1Var3.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                    if (z17) {
                        if (z10) {
                            z1VarArr2[0].e(LocaleController.formatString(R.string.ClearHistoryOptionAlso, UserObject.getFirstName(user)), "", false, false, false);
                        } else {
                            z19 = true;
                            z1VarArr2[0].e(LocaleController.formatString(R.string.DeleteMessagesOptionAlso, UserObject.getFirstName(user)), "", false, false, false);
                            z1VarArr2[0].setMultiline(z19);
                            w9Var2 = w9Var;
                            d2Var = d2Var2;
                            z1VarArr2[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(f10), AndroidUtilities.dp(f7), LocaleController.isRTL ? AndroidUtilities.dp(f10) : AndroidUtilities.dp(16.0f), AndroidUtilities.dp(f7));
                            h3Var.addView(z1VarArr2[0], w7.a6.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                            bi.g2 g2Var = new bi.g2(z17, chat3, alertDialog$Builder, zArr);
                            z1VarArr2[0].setOnClickListener(new org.telegram.ui.sh(9, zArr, g2Var));
                            if (z14) {
                                org.telegram.ui.Cells.z1 z1Var4 = z1VarArr2[0];
                                zArr[0] = true;
                                z1Var4.c(true, false);
                                g2Var.run();
                            }
                            z18 = z17;
                            if (user == null) {
                            }
                            if (z11) {
                            }
                            if (z11) {
                            }
                            org.telegram.ui.ActionBar.d2 d2Var3222 = d2Var;
                            alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.Components.v2
                                @Override // org.telegram.ui.ActionBar.c2
                                public final void f(org.telegram.ui.ActionBar.d2 d2Var4, int i10) {
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
                                        final org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                                        final boolean z27 = z10;
                                        final TLRPC.Chat chat4 = chat3;
                                        final boolean z28 = z13;
                                        final boolean z29 = z15;
                                        final org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                                        if (isUserSelf) {
                                            d5.t(p2Var2, z27, true, chat4, user2, false, z28, zArr3[0], z29, booleanCallback2, f6Var2);
                                            return;
                                        }
                                        if (user2 != null && zArr3[0]) {
                                            MessagesStorage.getInstance(p2Var2.getCurrentAccount()).getMessagesCount(user2.id, new MessagesStorage.IntCallback() { // from class: org.telegram.ui.Components.p1
                                                @Override // org.telegram.messenger.MessagesStorage.IntCallback
                                                public final void run(int i11) {
                                                    boolean[] zArr4 = zArr3;
                                                    MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                                    if (i11 >= 50) {
                                                        d5.t(org.telegram.ui.ActionBar.p2.this, z27, true, chat4, user2, false, z28, zArr4[0], z29, booleanCallback3, f6Var2);
                                                    } else if (booleanCallback3 != null) {
                                                        booleanCallback3.run(zArr4[0]);
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                        zArr2 = zArr3;
                                        if (ChatObject.isChannel(chat4) && chat4.creator && !zArr2[0]) {
                                            final nf.e g10 = alertDialog$Builder.a.g(-1, true, true);
                                            g10.d();
                                            TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                                            tL_channels_getFutureCreatorAfterLeave.channel = MessagesController.getInputChannel(chat4);
                                            final int i11 = currentAccount;
                                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                                            org.telegram.messenger.a aVar = new org.telegram.messenger.a();
                                            final Context context = parentActivity;
                                            connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, aVar, new Utilities.Callback2() { // from class: org.telegram.ui.Components.q1
                                                @Override // org.telegram.messenger.Utilities.Callback2
                                                public final void run(Object obj, Object obj2) {
                                                    TLRPC.User user3 = (TLRPC.User) obj;
                                                    nf.e.this.c(false);
                                                    TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                                    MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                                    if (user4 == null) {
                                                        booleanCallback3.run(z25 || zArr2[0]);
                                                        return;
                                                    }
                                                    Context context2 = context;
                                                    TLRPC.Chat chat5 = chat4;
                                                    org.telegram.messenger.w0 w0Var = new org.telegram.messenger.w0(context2, chat5, user4, i11, booleanCallback3, f6Var2, 5);
                                                    v1 v1Var = new v1(booleanCallback3, 0);
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
                                                    w9 w9Var6 = new w9(context3);
                                                    g9 g9Var2 = new g9((org.telegram.ui.ActionBar.f6) null);
                                                    g9Var2.r(currentUser);
                                                    w9Var6.setRoundRadius(AndroidUtilities.dp(30.0f));
                                                    w9Var6.e(currentUser, g9Var2);
                                                    frameLayout.addView(w9Var6, w7.a6.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                                    ImageView imageView = new ImageView(context3);
                                                    imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                                    imageView.setColorFilter(new PorterDuffColorFilter(p2Var3.getThemedColor(org.telegram.ui.ActionBar.j6.d7), PorterDuff.Mode.SRC_IN));
                                                    frameLayout.addView(imageView, w7.a6.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                                    i3 i3Var = new i3(context3);
                                                    g9 g9Var3 = new g9((org.telegram.ui.ActionBar.f6) null);
                                                    g9Var3.r(user4);
                                                    i3Var.setRoundRadius(AndroidUtilities.dp(30.0f));
                                                    i3Var.e(user4, g9Var3);
                                                    frameLayout.addView(i3Var, w7.a6.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                                    w9 w9Var7 = new w9(context3);
                                                    g9 g9Var4 = new g9((org.telegram.ui.ActionBar.f6) null);
                                                    g9Var4.q(chat5);
                                                    w9Var7.setRoundRadius(AndroidUtilities.dp(12.0f));
                                                    w9Var7.e(chat5, g9Var4);
                                                    frameLayout.addView(w9Var7, w7.a6.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                                    org.telegram.ui.ActionBar.d2 d2Var5 = alertDialog$Builder2.a;
                                                    d2Var5.O0 = -1.0f;
                                                    d2Var5.V = frameLayout;
                                                    d2Var5.R = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannelTitle : R.string.LeaveGroupTitle);
                                                    d2Var5.T = AndroidUtilities.replaceTags(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.LeaveChannelNewOwnerText : R.string.LeaveGroupNewOwnerText, UserObject.getUserName(user4), chat5.title));
                                                    alertDialog$Builder2.h(LocaleController.getString(R.string.AppointNewOwner), new t(w0Var, 4));
                                                    alertDialog$Builder2.i(LocaleController.getString(R.string.Cancel), null);
                                                    alertDialog$Builder2.k(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannel : R.string.LeaveMegaMenu), new t(v1Var, 5));
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
                                    if (!z25 && !zArr2[0]) {
                                        z26 = false;
                                    }
                                    booleanCallback2.run(z26);
                                }
                            });
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            p2Var.showDialog(d2Var3222);
                            textView = (TextView) d2Var3222.d(-1);
                            if (textView == null) {
                            }
                        }
                    } else if (!ChatObject.isChannel(chat3) || chat3.megagroup) {
                        z1VarArr2[0].e(LocaleController.getString(R.string.DeleteGroupForAll), "", false, false, false);
                    } else {
                        z1VarArr2[0].e(LocaleController.getString(R.string.DeleteChannelForAll), "", false, false, false);
                    }
                    z19 = true;
                    z1VarArr2[0].setMultiline(z19);
                    w9Var2 = w9Var;
                    d2Var = d2Var2;
                    z1VarArr2[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(f10), AndroidUtilities.dp(f7), LocaleController.isRTL ? AndroidUtilities.dp(f10) : AndroidUtilities.dp(16.0f), AndroidUtilities.dp(f7));
                    h3Var.addView(z1VarArr2[0], w7.a6.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                    bi.g2 g2Var2 = new bi.g2(z17, chat3, alertDialog$Builder, zArr);
                    z1VarArr2[0].setOnClickListener(new org.telegram.ui.sh(9, zArr, g2Var2));
                    if (z14) {
                    }
                    z18 = z17;
                    if (user == null) {
                    }
                    if (z11) {
                    }
                    if (z11) {
                    }
                    org.telegram.ui.ActionBar.d2 d2Var32222 = d2Var;
                    alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.Components.v2
                        @Override // org.telegram.ui.ActionBar.c2
                        public final void f(org.telegram.ui.ActionBar.d2 d2Var4, int i10) {
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
                                final org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                                final boolean z27 = z10;
                                final TLRPC.Chat chat4 = chat3;
                                final boolean z28 = z13;
                                final boolean z29 = z15;
                                final org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                                if (isUserSelf) {
                                    d5.t(p2Var2, z27, true, chat4, user2, false, z28, zArr3[0], z29, booleanCallback2, f6Var2);
                                    return;
                                }
                                if (user2 != null && zArr3[0]) {
                                    MessagesStorage.getInstance(p2Var2.getCurrentAccount()).getMessagesCount(user2.id, new MessagesStorage.IntCallback() { // from class: org.telegram.ui.Components.p1
                                        @Override // org.telegram.messenger.MessagesStorage.IntCallback
                                        public final void run(int i11) {
                                            boolean[] zArr4 = zArr3;
                                            MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                            if (i11 >= 50) {
                                                d5.t(org.telegram.ui.ActionBar.p2.this, z27, true, chat4, user2, false, z28, zArr4[0], z29, booleanCallback3, f6Var2);
                                            } else if (booleanCallback3 != null) {
                                                booleanCallback3.run(zArr4[0]);
                                            }
                                        }
                                    });
                                    return;
                                }
                                zArr2 = zArr3;
                                if (ChatObject.isChannel(chat4) && chat4.creator && !zArr2[0]) {
                                    final nf.e g10 = alertDialog$Builder.a.g(-1, true, true);
                                    g10.d();
                                    TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                                    tL_channels_getFutureCreatorAfterLeave.channel = MessagesController.getInputChannel(chat4);
                                    final int i11 = currentAccount;
                                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                                    org.telegram.messenger.a aVar = new org.telegram.messenger.a();
                                    final Context context = parentActivity;
                                    connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, aVar, new Utilities.Callback2() { // from class: org.telegram.ui.Components.q1
                                        @Override // org.telegram.messenger.Utilities.Callback2
                                        public final void run(Object obj, Object obj2) {
                                            TLRPC.User user3 = (TLRPC.User) obj;
                                            nf.e.this.c(false);
                                            TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                            MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                            if (user4 == null) {
                                                booleanCallback3.run(z25 || zArr2[0]);
                                                return;
                                            }
                                            Context context2 = context;
                                            TLRPC.Chat chat5 = chat4;
                                            org.telegram.messenger.w0 w0Var = new org.telegram.messenger.w0(context2, chat5, user4, i11, booleanCallback3, f6Var2, 5);
                                            v1 v1Var = new v1(booleanCallback3, 0);
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
                                            w9 w9Var6 = new w9(context3);
                                            g9 g9Var2 = new g9((org.telegram.ui.ActionBar.f6) null);
                                            g9Var2.r(currentUser);
                                            w9Var6.setRoundRadius(AndroidUtilities.dp(30.0f));
                                            w9Var6.e(currentUser, g9Var2);
                                            frameLayout.addView(w9Var6, w7.a6.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                            ImageView imageView = new ImageView(context3);
                                            imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                            imageView.setColorFilter(new PorterDuffColorFilter(p2Var3.getThemedColor(org.telegram.ui.ActionBar.j6.d7), PorterDuff.Mode.SRC_IN));
                                            frameLayout.addView(imageView, w7.a6.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                            i3 i3Var = new i3(context3);
                                            g9 g9Var3 = new g9((org.telegram.ui.ActionBar.f6) null);
                                            g9Var3.r(user4);
                                            i3Var.setRoundRadius(AndroidUtilities.dp(30.0f));
                                            i3Var.e(user4, g9Var3);
                                            frameLayout.addView(i3Var, w7.a6.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                            w9 w9Var7 = new w9(context3);
                                            g9 g9Var4 = new g9((org.telegram.ui.ActionBar.f6) null);
                                            g9Var4.q(chat5);
                                            w9Var7.setRoundRadius(AndroidUtilities.dp(12.0f));
                                            w9Var7.e(chat5, g9Var4);
                                            frameLayout.addView(w9Var7, w7.a6.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                            org.telegram.ui.ActionBar.d2 d2Var5 = alertDialog$Builder2.a;
                                            d2Var5.O0 = -1.0f;
                                            d2Var5.V = frameLayout;
                                            d2Var5.R = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannelTitle : R.string.LeaveGroupTitle);
                                            d2Var5.T = AndroidUtilities.replaceTags(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.LeaveChannelNewOwnerText : R.string.LeaveGroupNewOwnerText, UserObject.getUserName(user4), chat5.title));
                                            alertDialog$Builder2.h(LocaleController.getString(R.string.AppointNewOwner), new t(w0Var, 4));
                                            alertDialog$Builder2.i(LocaleController.getString(R.string.Cancel), null);
                                            alertDialog$Builder2.k(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannel : R.string.LeaveMegaMenu), new t(v1Var, 5));
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
                            if (!z25 && !zArr2[0]) {
                                z26 = false;
                            }
                            booleanCallback2.run(z26);
                        }
                    });
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    p2Var.showDialog(d2Var32222);
                    textView = (TextView) d2Var32222.d(-1);
                    if (textView == null) {
                    }
                }
            } else {
                z1VarArr2 = z1VarArr;
                w9Var = w9Var3;
            }
        } else {
            z1VarArr2 = z1VarArr;
            w9Var = w9Var3;
            f7 = 10.0f;
        }
        f10 = 8.0f;
        if (z11) {
        }
        if (z13) {
        }
        chat3 = chat;
        z17 = false;
        if (!z17) {
        }
        org.telegram.ui.Cells.z1 z1Var32 = new org.telegram.ui.Cells.z1(parentActivity, 1, f6Var);
        z1VarArr2[0] = z1Var32;
        z1Var32.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
        if (z17) {
        }
        z19 = true;
        z1VarArr2[0].setMultiline(z19);
        w9Var2 = w9Var;
        d2Var = d2Var2;
        z1VarArr2[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(f10), AndroidUtilities.dp(f7), LocaleController.isRTL ? AndroidUtilities.dp(f10) : AndroidUtilities.dp(16.0f), AndroidUtilities.dp(f7));
        h3Var.addView(z1VarArr2[0], w7.a6.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        bi.g2 g2Var22 = new bi.g2(z17, chat3, alertDialog$Builder, zArr);
        z1VarArr2[0].setOnClickListener(new org.telegram.ui.sh(9, zArr, g2Var22));
        if (z14) {
        }
        z18 = z17;
        if (user == null) {
        }
        if (z11) {
        }
        if (z11) {
        }
        org.telegram.ui.ActionBar.d2 d2Var322222 = d2Var;
        alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.Components.v2
            @Override // org.telegram.ui.ActionBar.c2
            public final void f(org.telegram.ui.ActionBar.d2 d2Var4, int i10) {
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
                    final org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                    final boolean z27 = z10;
                    final TLRPC.Chat chat4 = chat3;
                    final boolean z28 = z13;
                    final boolean z29 = z15;
                    final org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                    if (isUserSelf) {
                        d5.t(p2Var2, z27, true, chat4, user2, false, z28, zArr3[0], z29, booleanCallback2, f6Var2);
                        return;
                    }
                    if (user2 != null && zArr3[0]) {
                        MessagesStorage.getInstance(p2Var2.getCurrentAccount()).getMessagesCount(user2.id, new MessagesStorage.IntCallback() { // from class: org.telegram.ui.Components.p1
                            @Override // org.telegram.messenger.MessagesStorage.IntCallback
                            public final void run(int i11) {
                                boolean[] zArr4 = zArr3;
                                MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                if (i11 >= 50) {
                                    d5.t(org.telegram.ui.ActionBar.p2.this, z27, true, chat4, user2, false, z28, zArr4[0], z29, booleanCallback3, f6Var2);
                                } else if (booleanCallback3 != null) {
                                    booleanCallback3.run(zArr4[0]);
                                }
                            }
                        });
                        return;
                    }
                    zArr2 = zArr3;
                    if (ChatObject.isChannel(chat4) && chat4.creator && !zArr2[0]) {
                        final nf.e g10 = alertDialog$Builder.a.g(-1, true, true);
                        g10.d();
                        TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                        tL_channels_getFutureCreatorAfterLeave.channel = MessagesController.getInputChannel(chat4);
                        final int i11 = currentAccount;
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                        org.telegram.messenger.a aVar = new org.telegram.messenger.a();
                        final Context context = parentActivity;
                        connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, aVar, new Utilities.Callback2() { // from class: org.telegram.ui.Components.q1
                            @Override // org.telegram.messenger.Utilities.Callback2
                            public final void run(Object obj, Object obj2) {
                                TLRPC.User user3 = (TLRPC.User) obj;
                                nf.e.this.c(false);
                                TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                if (user4 == null) {
                                    booleanCallback3.run(z25 || zArr2[0]);
                                    return;
                                }
                                Context context2 = context;
                                TLRPC.Chat chat5 = chat4;
                                org.telegram.messenger.w0 w0Var = new org.telegram.messenger.w0(context2, chat5, user4, i11, booleanCallback3, f6Var2, 5);
                                v1 v1Var = new v1(booleanCallback3, 0);
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
                                w9 w9Var6 = new w9(context3);
                                g9 g9Var2 = new g9((org.telegram.ui.ActionBar.f6) null);
                                g9Var2.r(currentUser);
                                w9Var6.setRoundRadius(AndroidUtilities.dp(30.0f));
                                w9Var6.e(currentUser, g9Var2);
                                frameLayout.addView(w9Var6, w7.a6.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                ImageView imageView = new ImageView(context3);
                                imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                imageView.setColorFilter(new PorterDuffColorFilter(p2Var3.getThemedColor(org.telegram.ui.ActionBar.j6.d7), PorterDuff.Mode.SRC_IN));
                                frameLayout.addView(imageView, w7.a6.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                i3 i3Var = new i3(context3);
                                g9 g9Var3 = new g9((org.telegram.ui.ActionBar.f6) null);
                                g9Var3.r(user4);
                                i3Var.setRoundRadius(AndroidUtilities.dp(30.0f));
                                i3Var.e(user4, g9Var3);
                                frameLayout.addView(i3Var, w7.a6.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                w9 w9Var7 = new w9(context3);
                                g9 g9Var4 = new g9((org.telegram.ui.ActionBar.f6) null);
                                g9Var4.q(chat5);
                                w9Var7.setRoundRadius(AndroidUtilities.dp(12.0f));
                                w9Var7.e(chat5, g9Var4);
                                frameLayout.addView(w9Var7, w7.a6.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                org.telegram.ui.ActionBar.d2 d2Var5 = alertDialog$Builder2.a;
                                d2Var5.O0 = -1.0f;
                                d2Var5.V = frameLayout;
                                d2Var5.R = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannelTitle : R.string.LeaveGroupTitle);
                                d2Var5.T = AndroidUtilities.replaceTags(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.LeaveChannelNewOwnerText : R.string.LeaveGroupNewOwnerText, UserObject.getUserName(user4), chat5.title));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.AppointNewOwner), new t(w0Var, 4));
                                alertDialog$Builder2.i(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder2.k(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannel : R.string.LeaveMegaMenu), new t(v1Var, 5));
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
                if (!z25 && !zArr2[0]) {
                    z26 = false;
                }
                booleanCallback2.run(z26);
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
        p2Var.showDialog(alertDialog$Builder.a, true, null);
    }

    public static org.telegram.ui.ActionBar.d2 u(Activity activity, final long j3, final long j10, final int i10, final Runnable runnable, org.telegram.ui.ActionBar.f6 f6Var) {
        int i11;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
        final String sharedPrefKey = NotificationsController.getSharedPrefKey(j3, j10);
        if (j3 != 0) {
            StringBuilder sb2 = new StringBuilder("color_");
            sb2.append(sharedPrefKey);
            i11 = notificationsSettings.contains(sb2.toString()) ? org.telegram.messenger.a2.c("color_", sharedPrefKey, notificationsSettings, -16776961) : DialogObject.isChatDialog(j3) ? notificationsSettings.getInt("GroupLed", -16776961) : notificationsSettings.getInt("MessagesLed", -16776961);
        } else {
            i11 = i10 == 1 ? notificationsSettings.getInt("MessagesLed", -16776961) : i10 == 0 ? notificationsSettings.getInt("GroupLed", -16776961) : i10 == 3 ? notificationsSettings.getInt("StoriesLed", -16776961) : (i10 == 5 || i10 == 4) ? notificationsSettings.getInt("ReactionsLed", -16776961) : notificationsSettings.getInt("ChannelLed", -16776961);
        }
        LinearLayout f7 = org.telegram.messenger.a2.f(activity, 1);
        String[] strArr = {LocaleController.getString(R.string.ColorRed), LocaleController.getString(R.string.ColorOrange), LocaleController.getString(R.string.ColorYellow), LocaleController.getString(R.string.ColorGreen), LocaleController.getString(R.string.ColorCyan), LocaleController.getString(R.string.ColorBlue), LocaleController.getString(R.string.ColorViolet), LocaleController.getString(R.string.ColorPink), LocaleController.getString(R.string.ColorWhite)};
        final int[] iArr = {i11};
        for (int i12 = 0; i12 < 9; i12++) {
            org.telegram.ui.Cells.m6 m6Var = new org.telegram.ui.Cells.m6(activity, f6Var);
            m6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            m6Var.setTag(Integer.valueOf(i12));
            int i13 = org.telegram.ui.Cells.z8.e[i12];
            m6Var.a(i13, i13);
            m6Var.b(strArr[i12], i11 == org.telegram.ui.Cells.z8.f[i12]);
            f7.addView(m6Var);
            m6Var.setOnClickListener(new s0(f7, iArr));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, f6Var);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.LedColor);
        alertDialog$Builder.n(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.Set), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.Components.w2
            @Override // org.telegram.ui.ActionBar.c2
            public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i14) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                long j11 = j3;
                int[] iArr2 = iArr;
                if (j11 != 0) {
                    edit.putInt(org.telegram.ui.Cells.r6.i("color_", sharedPrefKey), iArr2[0]);
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
        alertDialog$Builder.i(LocaleController.getString(R.string.LedDisabled), new j2.c(j3, i10, runnable, 5));
        if (j3 != 0) {
            alertDialog$Builder.h(LocaleController.getString(R.string.Default), new org.telegram.ui.oe(22, sharedPrefKey, runnable));
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
        d2Var.R = string;
        d2Var.T = LocaleController.formatString("ContactNotRegistered", R.string.ContactNotRegistered, ContactsController.formatName(str, str2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Invite), new org.telegram.ui.oe(19, str3, p2Var));
        p2Var.showDialog(d2Var);
    }

    public static org.telegram.ui.ActionBar.d2 v0(org.telegram.ui.ActionBar.p2 p2Var, String str, CharSequence charSequence, String str2, boolean z10, Runnable runnable) {
        TextView textView;
        org.telegram.ui.ActionBar.d2 P = P(p2Var.getContext(), p2Var.getResourceProvider(), str, charSequence, str2, runnable);
        p2Var.showDialog(P);
        if (z10 && (textView = (TextView) P.d(-1)) != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
        }
        return P;
    }

    public static AlertDialog$Builder w(Activity activity, final MessagesStorage.IntCallback intCallback) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.m(R.raw.permission_request_contacts, 72, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
        alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.ContactsPermissionAlert));
        final int i10 = 1;
        alertDialog$Builder.k(LocaleController.getString(R.string.ContactsPermissionAlertContinue), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.Components.q0
            @Override // org.telegram.ui.ActionBar.c2
            public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
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
        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.Components.q0
            @Override // org.telegram.ui.ActionBar.c2
            public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i112) {
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

    public static AlertDialog$Builder x(Context context, int i10, int i11, int i12, int i13, int i14, int i15, String str, final boolean z10, fg.e2 e2Var) {
        if (context == null) {
            return null;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        final dd0 dd0Var = new dd0(context, null);
        final dd0 dd0Var2 = new dd0(context, null);
        final dd0 dd0Var3 = new dd0(context, null);
        linearLayout.addView(dd0Var2, w7.a6.l(0.3f, 0, -2));
        final int i16 = 0;
        dd0Var2.setOnScrollListener(new ad0() { // from class: org.telegram.ui.Components.w1
            @Override // org.telegram.ui.Components.ad0
            public final void n(int i17) {
                switch (i16) {
                    case 0:
                        if (z10 && i17 == 0) {
                            d5.d(dd0Var2, dd0Var, dd0Var3);
                            break;
                        }
                        break;
                    case 1:
                        if (z10 && i17 == 0) {
                            d5.d(dd0Var2, dd0Var, dd0Var3);
                            break;
                        }
                        break;
                    default:
                        if (z10 && i17 == 0) {
                            d5.d(dd0Var2, dd0Var, dd0Var3);
                            break;
                        }
                        break;
                }
            }
        });
        dd0Var.setMinValue(0);
        dd0Var.setMaxValue(11);
        linearLayout.addView(dd0Var, w7.a6.l(0.3f, 0, -2));
        dd0Var.setFormatter(new b(10));
        dd0Var.setOnValueChangedListener(new n0(dd0Var2, dd0Var, dd0Var3, 1));
        final int i17 = 1;
        dd0Var.setOnScrollListener(new ad0() { // from class: org.telegram.ui.Components.w1
            @Override // org.telegram.ui.Components.ad0
            public final void n(int i172) {
                switch (i17) {
                    case 0:
                        if (z10 && i172 == 0) {
                            d5.d(dd0Var2, dd0Var, dd0Var3);
                            break;
                        }
                        break;
                    case 1:
                        if (z10 && i172 == 0) {
                            d5.d(dd0Var2, dd0Var, dd0Var3);
                            break;
                        }
                        break;
                    default:
                        if (z10 && i172 == 0) {
                            d5.d(dd0Var2, dd0Var, dd0Var3);
                            break;
                        }
                        break;
                }
            }
        });
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i18 = calendar.get(1);
        dd0Var3.setMinValue(i10 + i18);
        dd0Var3.setMaxValue(i11 + i18);
        dd0Var3.setValue(i18 + i12);
        linearLayout.addView(dd0Var3, w7.a6.l(0.4f, 0, -2));
        dd0Var3.setOnValueChangedListener(new n0(dd0Var2, dd0Var, dd0Var3, 2));
        final int i19 = 2;
        dd0Var3.setOnScrollListener(new ad0() { // from class: org.telegram.ui.Components.w1
            @Override // org.telegram.ui.Components.ad0
            public final void n(int i172) {
                switch (i19) {
                    case 0:
                        if (z10 && i172 == 0) {
                            d5.d(dd0Var2, dd0Var, dd0Var3);
                            break;
                        }
                        break;
                    case 1:
                        if (z10 && i172 == 0) {
                            d5.d(dd0Var2, dd0Var, dd0Var3);
                            break;
                        }
                        break;
                    default:
                        if (z10 && i172 == 0) {
                            d5.d(dd0Var2, dd0Var, dd0Var3);
                            break;
                        }
                        break;
                }
            }
        });
        y0(dd0Var2, dd0Var, dd0Var3);
        if (z10) {
            d(dd0Var2, dd0Var, dd0Var3);
        }
        if (i13 != -1) {
            dd0Var2.setValue(i13);
            dd0Var.setValue(i14);
            dd0Var3.setValue(i15);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.a.R = str;
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.k(LocaleController.getString(R.string.Set), new org.telegram.messenger.jk(z10, dd0Var2, dd0Var, dd0Var3, e2Var));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.d2 x0(Context context, String str, boolean z10) {
        if (context == null || str == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.R = string;
        d2Var.T = str;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        if (z10) {
            alertDialog$Builder.h(LocaleController.getString(R.string.UpdateApp), new l0(context, 2));
        }
        return alertDialog$Builder.o();
    }

    public static void y(Context context, String str, String str2, long j3, c5 c5Var) {
        dd0 dd0Var;
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
        org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3(context, null);
        c3Var.a();
        dd0 dd0Var2 = new dd0(context, null);
        dd0Var2.setTextColor(w02);
        dd0Var2.setTextOffset(AndroidUtilities.dp(10.0f));
        dd0Var2.setItemCount(5);
        w3 w3Var = new w3(context, null);
        w3Var.setItemCount(5);
        w3Var.setTextColor(w02);
        w3Var.setTextOffset(-AndroidUtilities.dp(10.0f));
        y3 y3Var = new y3(context, null);
        y3Var.setItemCount(5);
        y3Var.setTextColor(w02);
        y3Var.setTextOffset(-AndroidUtilities.dp(34.0f));
        v3 v3Var = new v3(context, dd0Var2, w3Var, y3Var, 1);
        v3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        v3Var.addView(frameLayout, w7.a6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        org.telegram.messenger.a2.q(textView, w02, 1, 20.0f);
        frameLayout.addView(textView, w7.a6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ai.h(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        v3Var.addView(linearLayout, w7.a6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        di.h hVar = new di.h(context, 14);
        linearLayout.addView(dd0Var2, w7.a6.l(0.5f, 0, 270));
        dd0Var2.setMinValue(0);
        dd0Var2.setMaxValue(365);
        dd0Var2.setWrapSelectorWheel(false);
        dd0Var2.setFormatter(new b(13));
        androidx.car.app.utils.a aVar = new androidx.car.app.utils.a(dd0Var2, w3Var, y3Var, 16);
        dd0Var2.setOnValueChangedListener(aVar);
        w3Var.setMinValue(0);
        w3Var.setMaxValue(23);
        linearLayout.addView(w3Var, w7.a6.l(0.2f, 0, 270));
        w3Var.setFormatter(new b(14));
        w3Var.setOnValueChangedListener(aVar);
        y3Var.setMinValue(0);
        y3Var.setMaxValue(59);
        y3Var.setValue(0);
        y3Var.setFormatter(new b(15));
        linearLayout.addView(y3Var, w7.a6.l(0.3f, 0, 270));
        y3Var.setOnValueChangedListener(aVar);
        if (j3 <= 0 || j3 == 2147483646) {
            dd0Var = dd0Var2;
        } else {
            long j10 = j3 * 1000;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j10 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j10);
            if (timeInMillis >= 0) {
                y3Var.setValue(calendar.get(12));
                w3Var.setValue(calendar.get(11));
                dd0Var = dd0Var2;
                dd0Var.setValue(timeInMillis);
            } else {
                dd0Var = dd0Var2;
            }
        }
        dd0 dd0Var3 = dd0Var;
        g(null, null, 0L, 0L, 0, dd0Var3, w3Var, y3Var);
        hVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        hVar.setGravity(17);
        hVar.setTextColor(w04);
        hVar.setTextSize(1, 14.0f);
        hVar.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(8.0f);
        hVar.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, w05, w06, w06));
        hVar.setText(str2);
        v3Var.addView(hVar, w7.a6.t(-1, 48, 83, 16, 15, 16, 16));
        hVar.setOnClickListener(new o0(dd0Var3, w3Var, y3Var, calendar, c5Var, c3Var, 2));
        c3Var.b(v3Var);
        org.telegram.ui.ActionBar.h3 h3Var = c3Var.a;
        h3Var.show();
        h3Var.setBackgroundColor(w03);
        h3Var.fixNavigationBar(w03);
    }

    public static void y0(dd0 dd0Var, dd0 dd0Var2, dd0 dd0Var3) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2, dd0Var2.getValue());
        calendar.set(1, dd0Var3.getValue());
        dd0Var.setMinValue(1);
        dd0Var.setMaxValue(calendar.getActualMaximum(5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:413:0x020b, code lost:
    
        if (java.lang.Math.abs(r11 - r0.messageOwner.date) > 86400) goto L95;
     */
    /* JADX WARN: Removed duplicated region for block: B:154:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x071d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x07e7  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0881  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x094c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x095f  */
    /* JADX WARN: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x08ba  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0823  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x06f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void z(final org.telegram.ui.ActionBar.p2 p2Var, final TLRPC.User user, final TLRPC.Chat chat, final TLRPC.EncryptedChat encryptedChat, final TLRPC.ChatFull chatFull, final long j3, final MessageObject messageObject, final SparseArray[] sparseArrayArr, final MessageObject.GroupedMessages groupedMessages, final int i10, final int i11, TLRPC.ChannelParticipant[] channelParticipantArr, final Runnable runnable, Runnable runnable2, final org.telegram.ui.ActionBar.f6 f6Var) {
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
        org.telegram.ui.ActionBar.d2 d2Var;
        int i16;
        boolean z16;
        boolean z17;
        boolean z18;
        org.telegram.ui.Cells.z1 z1Var;
        int i17;
        TLRPC.MessageAction messageAction;
        final boolean z19;
        int i18;
        org.telegram.ui.ActionBar.d2 d2Var2;
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
        if (p2Var == null) {
            return;
        }
        if ((user == null && chat == null && encryptedChat == null) || (parentActivity = p2Var.getParentActivity()) == null) {
            return;
        }
        final int currentAccount = p2Var.getCurrentAccount();
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(parentActivity, 0, f6Var);
        float f7 = runnable2 != null ? 0.5f : 0.6f;
        org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder2.a;
        d2Var3.Q0 = f7;
        int size = groupedMessages != null ? groupedMessages.messages.size() : messageObject2 != null ? 1 : sparseArrayArr[1].size() + sparseArrayArr[0].size();
        if (encryptedChat != null) {
            z10 = z24;
            j10 = DialogObject.makeEncryptedDialogId(encryptedChat.id);
        } else {
            z10 = z24;
            j10 = user != null ? user.id : -chat.id;
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
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(parentActivity, 0, f6Var);
                String string = LocaleController.getString(R.string.MessageScheduledRepeatDeleteTitle);
                org.telegram.ui.ActionBar.d2 d2Var4 = alertDialog$Builder3.a;
                d2Var4.R = string;
                d2Var4.T = LocaleController.getString(R.string.MessageScheduledRepeatDeleteText);
                final int i24 = i22;
                alertDialog$Builder3.h(str2, new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.Components.t0
                    @Override // org.telegram.ui.ActionBar.c2
                    public final void f(org.telegram.ui.ActionBar.d2 d2Var5, int i25) {
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
                final long j11 = j10;
                final boolean z25 = z10;
                alertDialog$Builder3.i(LocaleController.getString(R.string.MessageScheduledRepeatDeleteAll), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.Components.y0
                    @Override // org.telegram.ui.ActionBar.c2
                    public final void f(org.telegram.ui.ActionBar.d2 d2Var5, int i25) {
                        SparseArray[] sparseArrayArr2;
                        ArrayList<Long> arrayList;
                        int i26;
                        long j12;
                        ArrayList<Long> arrayList2;
                        TLRPC.Peer peer;
                        int i27;
                        long j13;
                        ArrayList<Integer> arrayList3;
                        boolean z26 = z25;
                        int i28 = currentAccount;
                        long clientUserId = z26 ? UserConfig.getInstance(i28).getClientUserId() : j11;
                        MessageObject messageObject3 = messageObject;
                        TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                        long j14 = j3;
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
                                            j13 = clientUserId;
                                        } else {
                                            if (arrayList4 == null) {
                                                arrayList4 = new ArrayList<>();
                                            }
                                            ArrayList<Long> arrayList6 = arrayList4;
                                            i27 = i28;
                                            j13 = clientUserId;
                                            arrayList6.add(Long.valueOf(messageObject4.messageOwner.random_id));
                                            arrayList4 = arrayList6;
                                        }
                                    } else {
                                        i27 = i28;
                                        j13 = clientUserId;
                                        arrayList3 = arrayList5;
                                    }
                                    i31++;
                                    arrayList5 = arrayList3;
                                    i28 = i27;
                                    clientUserId = j13;
                                }
                                i26 = i28;
                                j12 = clientUserId;
                            } else {
                                i26 = i28;
                                j12 = clientUserId;
                                arrayList5.add(Integer.valueOf(messageObject3.getId()));
                                if (encryptedChat2 != null && messageObject3.messageOwner.random_id != 0 && messageObject3.type != 10) {
                                    ArrayList<Long> arrayList7 = new ArrayList<>();
                                    arrayList7.add(Long.valueOf(messageObject3.messageOwner.random_id));
                                    arrayList2 = arrayList7;
                                    MessagesController.getInstance(i26).deleteMessages(arrayList5, arrayList2, encryptedChat2, (j14 == 0 && (peer = messageObject3.messageOwner.peer_id) != null && peer.chat_id == (-j14)) ? j14 : j12, i29, true, i30);
                                }
                            }
                            arrayList2 = arrayList4;
                            MessagesController.getInstance(i26).deleteMessages(arrayList5, arrayList2, encryptedChat2, (j14 == 0 && (peer = messageObject3.messageOwner.peer_id) != null && peer.chat_id == (-j14)) ? j14 : j12, i29, true, i30);
                        } else {
                            long j15 = clientUserId;
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
                                        long j16 = messageObject5.messageOwner.random_id;
                                        if (j16 != 0 && messageObject5.type != 10) {
                                            arrayList9.add(Long.valueOf(j16));
                                        }
                                    }
                                    arrayList = arrayList9;
                                } else {
                                    arrayList = null;
                                }
                                MessagesController.getInstance(i28).deleteMessages(arrayList8, arrayList, encryptedChat2, (i32 != 1 || j14 == 0) ? j15 : j14, i29, true, i30);
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
                d2Var4.N = new u0(2, runnable2);
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
                        d2Var = d2Var3;
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
                            d2Var = d2Var3;
                            z16 = z18;
                        } else {
                            FrameLayout frameLayout = new FrameLayout(parentActivity);
                            org.telegram.ui.Cells.z1 z1Var2 = new org.telegram.ui.Cells.z1(parentActivity, 1, f6Var);
                            z1Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                            if (z15) {
                                z1Var = z1Var2;
                                z1Var.e(LocaleController.formatString("DeleteMessagesOptionAlso", R.string.DeleteMessagesOptionAlso, UserObject.getFirstName(user)), "", false, false, false);
                            } else {
                                z1Var = z1Var2;
                                if (chat == null || !(z18 || i16 == size)) {
                                    z1Var.e(LocaleController.getString(R.string.DeleteMessagesOption), "", false, false, false);
                                } else {
                                    z1Var.e(LocaleController.getString(R.string.DeleteForAll), "", false, false, false);
                                }
                            }
                            org.telegram.ui.Cells.z1 z1Var3 = z1Var;
                            z1Var3.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                            frameLayout.addView(z1Var3, w7.a6.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                            z1Var3.setOnClickListener(new v0(1, zArr));
                            alertDialog$Builder2.n(frameLayout);
                            d2Var3.G = 9;
                            d2Var = d2Var3;
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
                        i19 = (!messageObject2.isSendError() && messageObject2.getDialogId() == j3 && ((messageAction2 = messageObject2.messageOwner.action) == null || (messageAction2 instanceof TLRPC.TL_messageActionEmpty)) && messageObject2.isOut() && currentTime - messageObject2.messageOwner.date <= i29) ? 1 : 0;
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
                    int i40 = 2;
                    ArrayList arrayList2 = (ArrayList) Collection.-EL.stream(arrayList).filter(new org.telegram.ui.bb(1)).mapToLong(new z0(0)).distinct().mapToObj(new LongFunction() { // from class: org.telegram.ui.Components.a1
                        @Override // java.util.function.LongFunction
                        public final Object apply(long j12) {
                            int i41 = i25;
                            return j12 > 0 ? MessagesController.getInstance(i41).getUser(Long.valueOf(j12)) : MessagesController.getInstance(i41).getChat(Long.valueOf(-j12));
                        }
                    }).filter(new org.telegram.ui.bb(i40)).filter(new org.telegram.ui.q8(UserConfig.getInstance(i25).getClientUserId(), i40)).collect(Collectors.toCollection(new org.telegram.ui.eg()));
                    if (!arrayList2.isEmpty()) {
                        if (channelParticipantArr != null) {
                            ls lsVar = new ls(p2Var, chat, arrayList, arrayList2, channelParticipantArr, j3, i10, i11, false, runnable);
                            if (runnable3 != null) {
                                lsVar.setOnHideListener(new u0(0, runnable3));
                            }
                            lsVar.show();
                            return;
                        }
                        final org.telegram.ui.ActionBar.d2[] d2VarArr = {new org.telegram.ui.ActionBar.d2(parentActivity, 3, null)};
                        final int size2 = arrayList2.size();
                        final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[size2];
                        int[] iArr = new int[size2];
                        int[] iArr2 = new int[1];
                        final int i41 = 0;
                        while (i41 < size2) {
                            TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                            tL_channels_getParticipant.channel = MessagesController.getInputChannel(chat);
                            tL_channels_getParticipant.participant = MessagesController.getInputPeer((TLObject) arrayList2.get(i41));
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i25);
                            ArrayList arrayList3 = arrayList2;
                            final int[] iArr3 = iArr2;
                            final int[] iArr4 = iArr;
                            final Runnable runnable4 = runnable3;
                            RequestDelegate requestDelegate = new RequestDelegate() { // from class: org.telegram.ui.Components.c1
                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                                    final int[] iArr5 = iArr3;
                                    final int[] iArr6 = iArr4;
                                    final int i42 = i41;
                                    final TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                    final int i43 = size2;
                                    final org.telegram.ui.ActionBar.d2[] d2VarArr2 = d2VarArr;
                                    final org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                                    final TLRPC.User user2 = user;
                                    final TLRPC.Chat chat2 = chat;
                                    final TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                                    final TLRPC.ChatFull chatFull2 = chatFull;
                                    final long j12 = j3;
                                    final MessageObject messageObject7 = messageObject;
                                    final SparseArray[] sparseArrayArr2 = sparseArrayArr;
                                    final MessageObject.GroupedMessages groupedMessages2 = groupedMessages;
                                    final int i44 = i10;
                                    final int i45 = i11;
                                    final Runnable runnable5 = runnable;
                                    final Runnable runnable6 = runnable4;
                                    final org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.t1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            org.telegram.ui.ActionBar.d2[] d2VarArr3 = d2VarArr2;
                                            int[] iArr7 = iArr5;
                                            iArr7[0] = iArr7[0] + 1;
                                            int[] iArr8 = iArr6;
                                            int i46 = i42;
                                            iArr8[i46] = 0;
                                            TLObject tLObject2 = tLObject;
                                            TLRPC.ChannelParticipant[] channelParticipantArr4 = channelParticipantArr3;
                                            if (tLObject2 != null) {
                                                channelParticipantArr4[i46] = ((TLRPC.TL_channels_channelParticipant) tLObject2).participant;
                                            }
                                            if (iArr7[0] == i43) {
                                                try {
                                                    d2VarArr3[0].dismiss();
                                                } catch (Throwable unused) {
                                                }
                                                d2VarArr3[0] = null;
                                                d5.z(p2Var2, user2, chat2, encryptedChat2, chatFull2, j12, messageObject7, sparseArrayArr2, groupedMessages2, i44, i45, channelParticipantArr4, runnable5, runnable6, f6Var2);
                                            }
                                        }
                                    });
                                }
                            };
                            int i42 = i41;
                            iArr4[i42] = connectionsManager.sendRequest(tL_channels_getParticipant, requestDelegate);
                            runnable3 = runnable2;
                            size2 = size2;
                            iArr = iArr4;
                            iArr2 = iArr3;
                            i41 = i42 + 1;
                            i25 = i25;
                            arrayList2 = arrayList3;
                        }
                        AndroidUtilities.runOnUIThread(new di.o3(d2VarArr, iArr, i25, runnable2, p2Var, 18), 1000L);
                        return;
                    }
                    if (i39 <= 0 || !z30) {
                        z21 = false;
                    } else {
                        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                        org.telegram.ui.Cells.z1 z1Var4 = new org.telegram.ui.Cells.z1(parentActivity, 1, f6Var);
                        z1Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                        z1Var4.e(LocaleController.getString(R.string.DeleteMessagesOption), "", false, false, false);
                        int i43 = 0;
                        z1Var4.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                        frameLayout2.addView(z1Var4, w7.a6.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                        z1Var4.setOnClickListener(new v0(i43, zArr));
                        alertDialog$Builder2.n(frameLayout2);
                        d2Var3.G = 9;
                        z21 = true;
                    }
                    d2Var = d2Var3;
                    z17 = z21;
                    i15 = i25;
                    i16 = i39;
                    z16 = false;
                }
                final int i44 = i15;
                org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                int i45 = i16;
                final long j12 = j10;
                int i46 = size;
                boolean z32 = z11;
                z19 = z10;
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.Components.x0
                    @Override // org.telegram.ui.ActionBar.c2
                    public final void f(org.telegram.ui.ActionBar.d2 d2Var6, int i47) {
                        SparseArray[] sparseArrayArr2;
                        ArrayList<Long> arrayList4;
                        int i48;
                        long j13;
                        long j14;
                        ArrayList arrayList5;
                        TLRPC.Peer peer;
                        int i49;
                        long j15;
                        boolean z33 = z19;
                        int i50 = i44;
                        long clientUserId = z33 ? UserConfig.getInstance(i50).getClientUserId() : j12;
                        MessageObject messageObject7 = messageObject;
                        TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                        long j16 = j3;
                        int i51 = i10;
                        boolean[] zArr2 = zArr;
                        int i52 = i11;
                        ArrayList<Long> arrayList6 = null;
                        if (messageObject7 != null) {
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList<Integer> arrayList8 = new ArrayList<>();
                            MessageObject.GroupedMessages groupedMessages2 = groupedMessages;
                            if (groupedMessages2 != null) {
                                int i53 = 0;
                                while (i53 < groupedMessages2.messages.size()) {
                                    MessageObject messageObject8 = groupedMessages2.messages.get(i53);
                                    if (messageObject8.isEphemeral()) {
                                        arrayList7.add(messageObject8);
                                        i49 = i50;
                                    } else {
                                        i49 = i50;
                                        arrayList8.add(Integer.valueOf(messageObject8.getId()));
                                        if (encryptedChat2 != null) {
                                            j15 = clientUserId;
                                            if (messageObject8.messageOwner.random_id != 0 && messageObject8.type != 10) {
                                                if (arrayList6 == null) {
                                                    arrayList6 = new ArrayList<>();
                                                }
                                                ArrayList<Long> arrayList9 = arrayList6;
                                                arrayList9.add(Long.valueOf(messageObject8.messageOwner.random_id));
                                                arrayList6 = arrayList9;
                                            }
                                            i53++;
                                            i50 = i49;
                                            clientUserId = j15;
                                        }
                                    }
                                    j15 = clientUserId;
                                    i53++;
                                    i50 = i49;
                                    clientUserId = j15;
                                }
                                i48 = i50;
                                j13 = clientUserId;
                            } else {
                                i48 = i50;
                                j13 = clientUserId;
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
                            long j17 = (j16 == 0 || (peer = messageObject7.messageOwner.peer_id) == null || peer.chat_id != (-j16)) ? j13 : j16;
                            if (arrayList8.isEmpty()) {
                                j14 = j17;
                                arrayList5 = arrayList7;
                            } else {
                                arrayList5 = arrayList7;
                                j14 = j17;
                                MessagesController.getInstance(i48).deleteMessages(arrayList8, arrayList6, encryptedChat2, j14, i51, zArr2[0], i52);
                            }
                            int size3 = arrayList5.size();
                            int i54 = 0;
                            while (i54 < size3) {
                                Object obj = arrayList5.get(i54);
                                i54++;
                                MessagesController.getInstance(i48).deleteEphemeralMessage(j14, i51, (MessageObject) obj);
                            }
                        } else {
                            long j18 = clientUserId;
                            int i55 = 1;
                            while (i55 >= 0) {
                                ArrayList<Integer> arrayList11 = new ArrayList<>();
                                int i56 = 0;
                                while (true) {
                                    sparseArrayArr2 = sparseArrayArr;
                                    if (i56 >= sparseArrayArr2[i55].size()) {
                                        break;
                                    }
                                    arrayList11.add(Integer.valueOf(sparseArrayArr2[i55].keyAt(i56)));
                                    i56++;
                                }
                                if (encryptedChat2 != null) {
                                    ArrayList<Long> arrayList12 = new ArrayList<>();
                                    int i57 = 0;
                                    while (i57 < sparseArrayArr2[i55].size()) {
                                        MessageObject messageObject9 = (MessageObject) sparseArrayArr2[i55].valueAt(i57);
                                        int i58 = i55;
                                        long j19 = messageObject9.messageOwner.random_id;
                                        if (j19 != 0 && messageObject9.type != 10) {
                                            arrayList12.add(Long.valueOf(j19));
                                        }
                                        i57++;
                                        i55 = i58;
                                    }
                                    arrayList4 = arrayList12;
                                } else {
                                    arrayList4 = null;
                                }
                                int i59 = i55;
                                MessagesController.getInstance(i50).deleteMessages(arrayList11, arrayList4, encryptedChat2, (i59 != 1 || j16 == 0) ? j18 : j16, i51, zArr2[0], i52);
                                sparseArrayArr2[i59].clear();
                                i55 = i59 - 1;
                            }
                        }
                        Runnable runnable5 = runnable;
                        if (runnable5 != null) {
                            runnable5.run();
                        }
                    }
                };
                if (z19) {
                    i18 = i46;
                    d2Var2 = d2Var5;
                    if (i18 == 1) {
                        d2Var2.R = LocaleController.getString(R.string.DeleteSingleMessagesTitle);
                    } else {
                        d2Var2.R = LocaleController.formatString(R.string.DeleteMessagesTitle, LocaleController.formatPluralString("messages", i18, new Object[0]));
                    }
                } else {
                    i18 = i46;
                    if (i18 == 1) {
                        d2Var2 = d2Var5;
                        d2Var2.R = LocaleController.getString(R.string.UnsaveSingleMessagesTitle);
                    } else {
                        d2Var2 = d2Var5;
                        d2Var2.R = LocaleController.formatString(R.string.UnsaveMessagesTitle, LocaleController.formatPluralString("messages", i18, new Object[0]));
                    }
                }
                if (z19) {
                    if (chat == null || !z16) {
                        if (!z17 || z15 || i45 == i18) {
                            if (chat == null || !chat.megagroup || z23) {
                                if (i18 == 1) {
                                    d2Var2.T = LocaleController.getString(R.string.AreYouSureDeleteSingleMessage);
                                } else {
                                    d2Var2.T = LocaleController.getString(R.string.AreYouSureDeleteFewMessages);
                                }
                            } else if (i18 == 1) {
                                d2Var2.T = LocaleController.getString((messageObject == null || !messageObject.isEphemeral()) ? R.string.AreYouSureDeleteSingleMessageMega : R.string.AreYouSureDeleteSingleMessage);
                            } else {
                                d2Var2.T = LocaleController.getString(R.string.AreYouSureDeleteFewMessagesMega);
                            }
                        } else if (chat != null) {
                            d2Var2.T = LocaleController.formatString("DeleteMessagesTextGroup", R.string.DeleteMessagesTextGroup, LocaleController.formatPluralString("messages", i45, new Object[0]));
                        } else {
                            d2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatString("DeleteMessagesText", R.string.DeleteMessagesText, LocaleController.formatPluralString("messages", i45, new Object[0]), UserObject.getFirstName(user)));
                        }
                    } else if (z17 && i45 != i18) {
                        d2Var2.T = LocaleController.formatString(R.string.DeleteMessagesTextGroupPart, LocaleController.formatPluralString("messages", i45, new Object[0]));
                    } else if (i18 == 1) {
                        d2Var2.T = LocaleController.getString(R.string.AreYouSureDeleteSingleMessage);
                    } else {
                        d2Var2.T = LocaleController.getString(R.string.AreYouSureDeleteFewMessages);
                    }
                } else if (i18 == 1) {
                    d2Var2.T = LocaleController.getString(R.string.AreYouSureUnsaveSingleMessage);
                } else {
                    d2Var2.T = LocaleController.getString(R.string.AreYouSureUnsaveFewMessages);
                }
                if (messageObject == null) {
                    z20 = messageObject.isGiveaway() && !messageObject.isForwarded();
                    if (z20) {
                        long j13 = ((TLRPC.TL_messageMediaGiveaway) messageObject.messageOwner.media).until_date * 1000;
                        str = LocaleController.getInstance().getFormatterGiveawayMonthDayYear().format(new Date(j13));
                        z20 = System.currentTimeMillis() < j13;
                    }
                    str = null;
                } else if (i18 == 1) {
                    boolean z33 = false;
                    str = null;
                    for (int i47 = 1; i47 >= 0; i47--) {
                        for (int i48 = 0; i48 < sparseArrayArr[i47].size(); i48++) {
                            MessageObject messageObject7 = (MessageObject) sparseArrayArr[i47].valueAt(i48);
                            boolean z34 = messageObject7.isGiveaway() && !messageObject7.isForwarded();
                            if (z34) {
                                long j14 = ((TLRPC.TL_messageMediaGiveaway) messageObject7.messageOwner.media).until_date * 1000;
                                str = LocaleController.getInstance().getFormatterGiveawayMonthDayYear().format(new Date(j14));
                                z33 = System.currentTimeMillis() < j14;
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
                        int i49 = (int) MessagesController.getInstance(i44).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS);
                        d2Var2.R = LocaleController.getString(R.string.SuggestionTONWillBeLost);
                        d2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestionTONWillBeLostInfo, Integer.valueOf(i49)));
                        alertDialog$Builder.k(LocaleController.getString(R.string.SuggestionStarsWillBeLostDelete), c2Var);
                    } else if (!z20 || z19) {
                        alertDialog$Builder.k(LocaleController.getString(z19 ? R.string.Remove : R.string.Delete), c2Var);
                    } else {
                        d2Var2.R = LocaleController.getString(R.string.BoostingGiveawayDeleteMsgTitle);
                        d2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BoostingGiveawayDeleteMsgText, str));
                        alertDialog$Builder.i(LocaleController.getString(R.string.Delete), c2Var);
                    }
                } else {
                    int i50 = (int) MessagesController.getInstance(i44).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS);
                    d2Var2.R = LocaleController.getString(R.string.SuggestionStarsWillBeLost);
                    d2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestionStarsWillBeLostInfo, Integer.valueOf(i50)));
                    alertDialog$Builder = alertDialog$Builder2;
                    alertDialog$Builder.k(LocaleController.getString(R.string.SuggestionStarsWillBeLostDelete), c2Var);
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                d2Var2.N = new u0(1, runnable2);
                p2Var.showDialog(d2Var2);
                textView = (TextView) d2Var2.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                }
                textView2 = (TextView) d2Var2.d(-3);
                if (textView2 == null) {
                    d2Var2.t0.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f));
                    ((ViewGroup.MarginLayoutParams) d2Var2.t0.getLayoutParams()).topMargin = AndroidUtilities.dp(-8.0f);
                    textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
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
        d2Var = d2Var3;
        i16 = 0;
        z16 = false;
        z17 = false;
        final int i442 = i15;
        org.telegram.ui.ActionBar.d2 d2Var52 = d2Var;
        int i452 = i16;
        final long j122 = j10;
        int i462 = size;
        boolean z322 = z11;
        z19 = z10;
        org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.Components.x0
            @Override // org.telegram.ui.ActionBar.c2
            public final void f(org.telegram.ui.ActionBar.d2 d2Var6, int i472) {
                SparseArray[] sparseArrayArr2;
                ArrayList<Long> arrayList4;
                int i482;
                long j132;
                long j142;
                ArrayList arrayList5;
                TLRPC.Peer peer;
                int i492;
                long j15;
                boolean z332 = z19;
                int i502 = i442;
                long clientUserId = z332 ? UserConfig.getInstance(i502).getClientUserId() : j122;
                MessageObject messageObject72 = messageObject;
                TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                long j16 = j3;
                int i51 = i10;
                boolean[] zArr2 = zArr;
                int i52 = i11;
                ArrayList<Long> arrayList6 = null;
                if (messageObject72 != null) {
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList<Integer> arrayList8 = new ArrayList<>();
                    MessageObject.GroupedMessages groupedMessages2 = groupedMessages;
                    if (groupedMessages2 != null) {
                        int i53 = 0;
                        while (i53 < groupedMessages2.messages.size()) {
                            MessageObject messageObject8 = groupedMessages2.messages.get(i53);
                            if (messageObject8.isEphemeral()) {
                                arrayList7.add(messageObject8);
                                i492 = i502;
                            } else {
                                i492 = i502;
                                arrayList8.add(Integer.valueOf(messageObject8.getId()));
                                if (encryptedChat2 != null) {
                                    j15 = clientUserId;
                                    if (messageObject8.messageOwner.random_id != 0 && messageObject8.type != 10) {
                                        if (arrayList6 == null) {
                                            arrayList6 = new ArrayList<>();
                                        }
                                        ArrayList<Long> arrayList9 = arrayList6;
                                        arrayList9.add(Long.valueOf(messageObject8.messageOwner.random_id));
                                        arrayList6 = arrayList9;
                                    }
                                    i53++;
                                    i502 = i492;
                                    clientUserId = j15;
                                }
                            }
                            j15 = clientUserId;
                            i53++;
                            i502 = i492;
                            clientUserId = j15;
                        }
                        i482 = i502;
                        j132 = clientUserId;
                    } else {
                        i482 = i502;
                        j132 = clientUserId;
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
                    long j17 = (j16 == 0 || (peer = messageObject72.messageOwner.peer_id) == null || peer.chat_id != (-j16)) ? j132 : j16;
                    if (arrayList8.isEmpty()) {
                        j142 = j17;
                        arrayList5 = arrayList7;
                    } else {
                        arrayList5 = arrayList7;
                        j142 = j17;
                        MessagesController.getInstance(i482).deleteMessages(arrayList8, arrayList6, encryptedChat2, j142, i51, zArr2[0], i52);
                    }
                    int size3 = arrayList5.size();
                    int i54 = 0;
                    while (i54 < size3) {
                        Object obj = arrayList5.get(i54);
                        i54++;
                        MessagesController.getInstance(i482).deleteEphemeralMessage(j142, i51, (MessageObject) obj);
                    }
                } else {
                    long j18 = clientUserId;
                    int i55 = 1;
                    while (i55 >= 0) {
                        ArrayList<Integer> arrayList11 = new ArrayList<>();
                        int i56 = 0;
                        while (true) {
                            sparseArrayArr2 = sparseArrayArr;
                            if (i56 >= sparseArrayArr2[i55].size()) {
                                break;
                            }
                            arrayList11.add(Integer.valueOf(sparseArrayArr2[i55].keyAt(i56)));
                            i56++;
                        }
                        if (encryptedChat2 != null) {
                            ArrayList<Long> arrayList12 = new ArrayList<>();
                            int i57 = 0;
                            while (i57 < sparseArrayArr2[i55].size()) {
                                MessageObject messageObject9 = (MessageObject) sparseArrayArr2[i55].valueAt(i57);
                                int i58 = i55;
                                long j19 = messageObject9.messageOwner.random_id;
                                if (j19 != 0 && messageObject9.type != 10) {
                                    arrayList12.add(Long.valueOf(j19));
                                }
                                i57++;
                                i55 = i58;
                            }
                            arrayList4 = arrayList12;
                        } else {
                            arrayList4 = null;
                        }
                        int i59 = i55;
                        MessagesController.getInstance(i502).deleteMessages(arrayList11, arrayList4, encryptedChat2, (i59 != 1 || j16 == 0) ? j18 : j16, i51, zArr2[0], i52);
                        sparseArrayArr2[i59].clear();
                        i55 = i59 - 1;
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
        d2Var2.N = new u0(1, runnable2);
        p2Var.showDialog(d2Var2);
        textView = (TextView) d2Var2.d(-1);
        if (textView != null) {
        }
        textView2 = (TextView) d2Var2.d(-3);
        if (textView2 == null) {
        }
    }
}
