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
import android.graphics.drawable.ShapeDrawable;
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
import org.telegram.ui.md1;
import org.telegram.ui.vg1;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public abstract class f5 {
    public static final Pattern a = Pattern.compile("^([a-zA-Z][a-zA-Z0-9+\\-.]*://)?([a-zA-Z0-9\\-]+\\.)+[a-zA-Z]{2,}(:\\d+)?(/[^\\s]*)?$");

    public static AlertDialog$Builder A(Context context) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String readRes = AndroidUtilities.readRes(R.raw.pip_voice_request);
        o30 o30Var = new o30(0, context, true);
        o30Var.setImportantForAccessibility(2);
        ah.x xVar = new ah.x(context, o30Var);
        xVar.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-15128003, -15118002}));
        xVar.setClipToOutline(true);
        xVar.setOutlineProvider(new ci.n1(11));
        View view = new View(context);
        view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(readRes, AndroidUtilities.dp(320.0f), AndroidUtilities.dp(184.61539f), false)));
        xVar.addView(view, w7.z5.d(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
        xVar.addView(o30Var, w7.z5.c(117.0f, 117));
        alertDialog$Builder.a.V = xVar;
        alertDialog$Builder.a.R = LocaleController.getString(R.string.PermissionDrawAboveOtherAppsGroupCallTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.PermissionDrawAboveOtherAppsGroupCall);
        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new j0(context, 3));
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.l0 = true;
        c2Var.V0 = false;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.a.Q0 = 0.5769231f;
        return alertDialog$Builder;
    }

    public static AlertDialog$Builder B(Activity activity, vg1 vg1Var, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        String readRes = AndroidUtilities.readRes(R.raw.pip_video_request);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-14535089, -14527894}));
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new ci.n1(10));
        View view = new View(activity);
        view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(readRes, AndroidUtilities.dp(320.0f), AndroidUtilities.dp(161.36752f), false)));
        frameLayout.addView(view, w7.z5.d(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
        alertDialog$Builder.a.V = frameLayout;
        alertDialog$Builder.a.R = LocaleController.getString(R.string.PermissionDrawAboveOtherAppsTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.PermissionDrawAboveOtherApps);
        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new ci.f(8, activity, z10));
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.l0 = true;
        c2Var.V0 = false;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), vg1Var);
        alertDialog$Builder.a.Q0 = 0.50427353f;
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.c2 C(LaunchActivity launchActivity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.LowDiskSpaceTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.LowDiskSpaceMessage2);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.LowDiskSpaceButton), new g1(launchActivity, 1));
        return alertDialog$Builder.a;
    }

    public static org.telegram.ui.ActionBar.c2 D(Activity activity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
        int i10 = R.raw.permission_request_location;
        int i11 = org.telegram.ui.ActionBar.k6.L5;
        alertDialog$Builder.m(i10, 72, org.telegram.ui.ActionBar.k6.x0(null, i11, false), null);
        alertDialog$Builder.n(i11, null);
        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new j0(activity, 1));
        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
        return alertDialog$Builder.a;
    }

    public static org.telegram.ui.ActionBar.c2 E(Activity activity, boolean z10, TLRPC.User user, MessagesStorage.IntCallback intCallback, org.telegram.ui.ActionBar.g6 g6Var) {
        int[] iArr = new int[1];
        String[] strArr = {LocaleController.getString(R.string.SendLiveLocationFor15m), LocaleController.getString(R.string.SendLiveLocationFor1h), LocaleController.getString(R.string.SendLiveLocationFor8h), LocaleController.getString(R.string.SendLiveLocationForever)};
        LinearLayout f7 = org.telegram.messenger.v0.f(activity, 1);
        f7.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
        TextView textView = new TextView(activity);
        if (z10) {
            textView.setText(LocaleController.getString(R.string.LiveLocationAlertExpandMessage));
        } else if (user != null) {
            textView.setText(LocaleController.formatString(R.string.LiveLocationAlertPrivate, UserObject.getFirstName(user)));
        } else {
            textView.setText(LocaleController.getString(R.string.LiveLocationAlertGroup));
        }
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.j5, g6Var);
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        f7.addView(textView, w7.z5.t(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 24, z10 ? 4 : 0, 24, 8));
        int i10 = 0;
        while (i10 < 4) {
            org.telegram.ui.Cells.l6 l6Var = new org.telegram.ui.Cells.l6(activity, g6Var);
            l6Var.d = 42;
            l6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            l6Var.setTag(Integer.valueOf(i10));
            a(l6Var, org.telegram.ui.ActionBar.k6.g7, org.telegram.ui.ActionBar.k6.E5, g6Var);
            l6Var.b(strArr[i10], iArr[0] == i10);
            f7.addView(l6Var);
            l6Var.setOnClickListener(new p0(iArr, f7));
            i10++;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, g6Var);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        if (z10) {
            c2Var.R = LocaleController.getString(R.string.LiveLocationAlertExpandTitle);
        } else {
            int i11 = org.telegram.ui.ActionBar.k6.L5;
            int e = g6Var != null ? g6Var.e(i11) : org.telegram.ui.ActionBar.k6.x0(null, i11, false);
            c2Var.b0 = new jr0(activity, 0);
            c2Var.c0 = e;
            c2Var.d0 = -1;
            if (g6Var == null) {
                alertDialog$Builder.n(org.telegram.ui.ActionBar.k6.L5, null);
            }
        }
        alertDialog$Builder.o(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.ShareFile), new m4.w0(26, iArr, intCallback));
        alertDialog$Builder.i(LocaleController.getString(R.string.Cancel), null);
        return c2Var;
    }

    public static org.telegram.ui.ActionBar.h3 F(final long j10, final long j11, final org.telegram.ui.ActionBar.o2 o2Var, final org.telegram.ui.ActionBar.g6 g6Var) {
        if (o2Var.getParentActivity() == null) {
            return null;
        }
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) o2Var.getParentActivity(), g6Var, false);
        h3Var.fixNavigationBar();
        h3Var.title = LocaleController.getString(R.string.Notifications);
        h3Var.bigTitle = true;
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
                NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(j10, j11, i11);
                org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                if (xc.a(o2Var2)) {
                    xc.z(o2Var2, i11, 0, g6Var).j();
                }
            }
        };
        h3Var.items = charSequenceArr;
        h3Var.onClickListener = onClickListener;
        return h3Var;
    }

    public static void G(Context context, org.telegram.ui.ActionBar.g6 g6Var, d5 d5Var) {
        if (context == null) {
            return;
        }
        int i10 = 0;
        int i11 = org.telegram.ui.ActionBar.k6.j5;
        int e = g6Var != null ? g6Var.e(i11) : org.telegram.ui.ActionBar.k6.x0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.k6.h5;
        int e7 = g6Var != null ? g6Var.e(i12) : org.telegram.ui.ActionBar.k6.x0(null, i12, false);
        int i13 = org.telegram.ui.ActionBar.k6.Ji;
        if (g6Var != null) {
            g6Var.e(i13);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.k6.Ni;
        if (g6Var != null) {
            g6Var.e(i14);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.k6.E8;
        if (g6Var != null) {
            g6Var.e(i15);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.k6.G8;
        if (g6Var != null) {
            g6Var.e(i16);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.k6.i6;
        if (g6Var != null) {
            g6Var.e(i17);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i17, false);
        }
        int i18 = org.telegram.ui.ActionBar.k6.Sh;
        int e10 = g6Var != null ? g6Var.e(i18) : org.telegram.ui.ActionBar.k6.x0(null, i18, false);
        int i19 = org.telegram.ui.ActionBar.k6.Oh;
        int e11 = g6Var != null ? g6Var.e(i19) : org.telegram.ui.ActionBar.k6.x0(null, i19, false);
        int e12 = g6Var != null ? g6Var.e(org.telegram.ui.ActionBar.k6.Qh) : org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Qh, false);
        org.telegram.ui.ActionBar.b3 b3Var = new org.telegram.ui.ActionBar.b3(context, g6Var);
        b3Var.a();
        int[] iArr = {30, 60, 120, 180, 480, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        n4 n4Var = new n4(context, g6Var, iArr);
        n4Var.setMinValue(0);
        n4Var.setMaxValue(20);
        n4Var.setTextColor(e);
        n4Var.setValue(0);
        n4Var.setFormatter(new f1(i10, iArr));
        j4 j4Var = new j4(context, n4Var, 1);
        j4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        j4Var.addView(frameLayout, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.MuteForAlert));
        textView.setTextColor(e);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, w7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new di.d(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        j4Var.addView(linearLayout, w7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        ai.wd wdVar = new ai.wd(context, 19);
        linearLayout.addView(n4Var, w7.z5.l(1.0f, 0, 270));
        n4Var.setOnValueChangedListener(new org.telegram.ui.tr(14));
        wdVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        wdVar.setGravity(17);
        wdVar.setTextColor(e10);
        wdVar.setTextSize(1, 14.0f);
        wdVar.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(8.0f);
        wdVar.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, e11, e12, e12));
        wdVar.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
        j4Var.addView(wdVar, w7.z5.t(-1, 48, 83, 16, 15, 16, 16));
        wdVar.setOnClickListener(new ci.b4(iArr, n4Var, d5Var, b3Var, 6));
        b3Var.b(j4Var);
        org.telegram.ui.ActionBar.h3 h3Var = b3Var.a;
        h3Var.show();
        h3Var.setBackgroundColor(e7);
        h3Var.fixNavigationBar(e7);
    }

    public static AlertDialog$Builder H(Context context, String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.a.R = str;
        HashMap hashMap = new HashMap();
        int i10 = org.telegram.ui.ActionBar.k6.L5;
        hashMap.put("info1", Integer.valueOf(org.telegram.ui.ActionBar.k6.x0(null, i10, false)));
        hashMap.put("info2", Integer.valueOf(org.telegram.ui.ActionBar.k6.x0(null, i10, false)));
        alertDialog$Builder.m(R.raw.not_available, 52, org.telegram.ui.ActionBar.k6.x0(null, i10, false), hashMap);
        alertDialog$Builder.n(i10, null);
        alertDialog$Builder.a.W = true;
        alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
        alertDialog$Builder.a.T = str2;
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.c2 I(Activity activity, long j10, final long j11, int i10, final Runnable runnable, org.telegram.ui.ActionBar.g6 g6Var) {
        String[] strArr;
        final long j12 = j10;
        final int i11 = i10;
        final SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
        boolean z10 = true;
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
        LinearLayout f7 = org.telegram.messenger.v0.f(activity, 1);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, g6Var);
        int i14 = 0;
        while (i14 < strArr2.length) {
            org.telegram.ui.Cells.l6 l6Var = new org.telegram.ui.Cells.l6(activity, g6Var);
            l6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            l6Var.setTag(Integer.valueOf(i14));
            a(l6Var, org.telegram.ui.ActionBar.k6.g7, org.telegram.ui.ActionBar.k6.E5, g6Var);
            l6Var.b(strArr2[i14], iArr[0] == i14 ? z10 : false);
            f7.addView(l6Var);
            l6Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.f3
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
                    alertDialog$Builder.a.N0.run();
                    runnable.run();
                }
            });
            i14++;
            j12 = j10;
            i11 = i10;
            z10 = true;
        }
        alertDialog$Builder.a.R = LocaleController.getString(R.string.NotificationsImportance);
        alertDialog$Builder.o(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.a;
    }

    public static void J(int i10, Activity activity, long j10, TLRPC.Photo photo, ci.b bVar) {
        if (activity != null) {
            z2 z2Var = new z2(i10, j10, photo, activity, bVar);
            org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) activity, (org.telegram.ui.ActionBar.g6) bVar, true);
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
    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.View, org.telegram.ui.Components.qd0, org.telegram.ui.Components.v3] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r15v0, types: [android.view.View, org.telegram.ui.Components.qd0] */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r2v21, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View, org.telegram.ui.Components.qd0, org.telegram.ui.Components.u3] */
    /* JADX WARN: Type inference failed for: r4v10, types: [android.view.View, android.widget.TextView, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v8, types: [android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v9, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r9v7, types: [android.view.View] */
    public static org.telegram.ui.ActionBar.b3 K(final Context context, final long j10, long j11, int i10, boolean z10, final d5 d5Var, Runnable runnable, c5 c5Var, org.telegram.ui.ActionBar.g6 g6Var) {
        FrameLayout frameLayout;
        Context context2;
        ViewGroup viewGroup;
        int i11;
        FrameLayout frameLayout2;
        int i12;
        ?? r82;
        boolean[] zArr;
        long j12;
        ViewGroup viewGroup2;
        org.telegram.messenger.camera.i iVar;
        ?? r11;
        org.telegram.ui.ActionBar.u0 u0Var;
        Calendar calendar;
        int i13;
        int i14;
        int[] iArr;
        String[] strArr;
        bk0 bk0Var;
        yj0 yj0Var;
        Calendar calendar2;
        u3 u3Var;
        int[] iArr2;
        org.telegram.ui.ActionBar.u0 u0Var2;
        int i15;
        ?? r22;
        int i16;
        String[] strArr2;
        org.telegram.messenger.camera.i iVar2;
        org.telegram.messenger.camera.i iVar3;
        ?? r42;
        bk0 bk0Var2;
        final org.telegram.ui.ActionBar.h3 h3Var;
        int i17;
        TLRPC.User user;
        TLRPC.UserStatus userStatus;
        if (context == null) {
            return null;
        }
        final int[] iArr3 = {i10};
        long clientUserId = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
        final org.telegram.ui.ActionBar.b3 b3Var = new org.telegram.ui.ActionBar.b3(context, g6Var);
        b3Var.a();
        final ?? qd0Var = new qd0(context, g6Var);
        int i18 = c5Var.a;
        int i19 = c5Var.c;
        int i20 = c5Var.b;
        qd0Var.setTextColor(i18);
        qd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        qd0Var.setItemCount(5);
        final ?? u3Var2 = new u3(context, g6Var);
        u3Var2.setWrapSelectorWheel(true);
        u3Var2.setAllItemsCount(24);
        u3Var2.setItemCount(5);
        u3Var2.setTextColor(i18);
        u3Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        final ?? v3Var = new v3(context, g6Var);
        v3Var.setWrapSelectorWheel(true);
        v3Var.setAllItemsCount(60);
        v3Var.setItemCount(5);
        v3Var.setTextColor(i18);
        v3Var.setTextOffset(-AndroidUtilities.dp(34.0f));
        ?? frameLayout3 = new FrameLayout(context);
        w3 w3Var = new w3(context, qd0Var, u3Var2, v3Var, 0);
        w3Var.setClipToPadding(false);
        w3Var.setClipChildren(false);
        w3Var.setOrientation(1);
        frameLayout3.addView(w3Var, w7.z5.c(-1.0f, -1));
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout3.addView(frameLayout4, w7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
        ViewGroup frameLayout5 = new FrameLayout(context);
        w3Var.addView(frameLayout5, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        if (TextUtils.isEmpty(null)) {
            frameLayout = frameLayout4;
            if (j10 == clientUserId) {
                textView.setText(LocaleController.getString(R.string.SetReminder));
            } else {
                textView.setText(LocaleController.getString(R.string.ScheduleMessage));
            }
        } else {
            frameLayout = frameLayout4;
            textView.setText((CharSequence) null);
        }
        textView.setTextColor(i18);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout5.addView(textView, w7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new di.d(10));
        boolean[] zArr2 = {true};
        if (!DialogObject.isUserDialog(j10) || j10 == clientUserId || (user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j10))) == null || user.bot || (userStatus = user.status) == null || userStatus.expires <= 0) {
            context2 = context;
            viewGroup = frameLayout3;
            i11 = i20;
            frameLayout2 = frameLayout;
            i12 = -1;
            r82 = 0;
            zArr = zArr2;
            j12 = clientUserId;
            viewGroup2 = frameLayout5;
            iVar = null;
            r11 = w3Var;
            u0Var = null;
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
            r11 = w3Var;
            iVar = null;
            i11 = i20;
            zArr = zArr2;
            u0Var = new org.telegram.ui.ActionBar.u0(context, null, 0, c5Var.a, false, g6Var);
            context2 = context;
            u0Var.setLongClickEnabled(false);
            u0Var.setSubMenuOpenSide(2);
            u0Var.setIcon(R.drawable.ic_ab_other);
            u0Var.setBackground(org.telegram.ui.ActionBar.k6.g0(i19, 1, -1));
            viewGroup2.addView(u0Var, w7.z5.d(40, 40.0f, 53, 0.0f, 8.0f, 5.0f, 0.0f));
            u0Var.g(1, LocaleController.formatString(R.string.ScheduleWhenOnline, firstName));
            u0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        }
        if (u0Var != null) {
            u0Var.setOnClickListener(new org.telegram.ui.ActionBar.s1(21, u0Var, c5Var));
            u0Var.setDelegate(new ai.u2(d5Var, zArr, b3Var, 20));
        }
        bk0 bk0Var3 = new bk0(context2);
        yj0 yj0Var2 = new yj0(R.raw.notify_toggle, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        yj0Var2.J(true);
        yj0Var2.h = true;
        yj0Var2.start();
        yj0Var2.M(40);
        yj0Var2.P(40);
        bk0Var3.setScaleType(ImageView.ScaleType.CENTER);
        bk0Var3.setAnimation(yj0Var2);
        bk0Var3.setColorFilter(new PorterDuffColorFilter(i18, PorterDuff.Mode.SRC_IN));
        bk0Var3.setBackground(org.telegram.ui.ActionBar.k6.g0(i19, 1, i12));
        viewGroup2.addView(bk0Var3, w7.z5.d(40, 40.0f, 53, 0.0f, 8.0f, (u0Var != null ? 42 : r82) + 8, 0.0f));
        ?? linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(r82);
        linearLayout.setWeightSum(1.0f);
        r11.addView(linearLayout, w7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar3 = Calendar.getInstance();
        final ai.wd wdVar = new ai.wd(context2, 14);
        linearLayout.addView(qd0Var, w7.z5.l(0.5f, r82, 270));
        qd0Var.setMinValue(r82);
        qd0Var.setMaxValue(365);
        qd0Var.setWrapSelectorWheel(r82);
        qd0Var.setFormatter(new e2(4));
        Object obj = r11;
        final long j13 = j12;
        int i21 = i11;
        final boolean[] zArr3 = zArr;
        od0 od0Var = new od0() { // from class: org.telegram.ui.Components.l2
            @Override // org.telegram.ui.Components.od0
            public final void n(qd0 qd0Var2, int i22) {
                f5.g(ai.wd.this, null, 0L, 0L, j13 == j10 ? 1 : 0, qd0Var, u3Var2, v3Var);
            }
        };
        qd0Var.setOnValueChangedListener(od0Var);
        u3Var2.setMinValue(r82);
        u3Var2.setMaxValue(23);
        org.telegram.ui.ActionBar.u0 u0Var3 = u0Var;
        linearLayout.addView(u3Var2, w7.z5.l(0.2f, r82, 270));
        u3Var2.setFormatter(new e2(5));
        u3Var2.setOnValueChangedListener(od0Var);
        v3Var.setMinValue(r82);
        v3Var.setMaxValue(59);
        v3Var.setValue(r82);
        v3Var.setFormatter(new e2(6));
        linearLayout.addView(v3Var, w7.z5.l(0.3f, r82, 270));
        v3Var.setOnValueChangedListener(od0Var);
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
                v3Var.setValue(calendar.get(12));
                u3Var2.setValue(calendar.get(11));
                qd0Var.setValue(timeInMillis);
            }
        }
        final boolean[] zArr4 = {true};
        g(wdVar, null, 0L, 0L, j13 == j10 ? 1 : 0, qd0Var, u3Var2, v3Var);
        boolean isTestBackend = ConnectionsManager.getInstance(UserConfig.selectedAccount).isTestBackend();
        if (isTestBackend) {
            i13 = 1;
            i14 = 8;
            iArr = new int[]{0, 60, 300, 86400, 604800, 1209600, 2592000, 7862400, 15724800, 31536000};
        } else {
            i13 = 1;
            i14 = 8;
            iArr = new int[]{0, 86400, 604800, 1209600, 2592000, 7862400, 15724800, 31536000};
        }
        if (isTestBackend) {
            strArr = new String[10];
            strArr[0] = LocaleController.getString(R.string.MessageScheduledRepeatOptionNever);
            strArr[i13] = "Every minute";
            strArr[2] = "Every 5 minutes";
            strArr[3] = LocaleController.getString(R.string.MessageScheduledRepeatOptionDaily);
            strArr[4] = LocaleController.getString(R.string.MessageScheduledRepeatOptionWeekly);
            strArr[5] = LocaleController.getString(R.string.MessageScheduledRepeatOptionBiweekly);
            strArr[6] = LocaleController.getString(R.string.MessageScheduledRepeatOptionMonthly);
            strArr[7] = LocaleController.getString(R.string.MessageScheduledRepeatOption3Monthly);
            strArr[i14] = LocaleController.getString(R.string.MessageScheduledRepeatOption6Monthly);
            strArr[9] = LocaleController.getString(R.string.MessageScheduledRepeatOptionYearly);
        } else {
            strArr = new String[i14];
            strArr[0] = LocaleController.getString(R.string.MessageScheduledRepeatOptionNever);
            strArr[i13] = LocaleController.getString(R.string.MessageScheduledRepeatOptionDaily);
            strArr[2] = LocaleController.getString(R.string.MessageScheduledRepeatOptionWeekly);
            strArr[3] = LocaleController.getString(R.string.MessageScheduledRepeatOptionBiweekly);
            strArr[4] = LocaleController.getString(R.string.MessageScheduledRepeatOptionMonthly);
            strArr[5] = LocaleController.getString(R.string.MessageScheduledRepeatOption3Monthly);
            strArr[6] = LocaleController.getString(R.string.MessageScheduledRepeatOption6Monthly);
            strArr[7] = LocaleController.getString(R.string.MessageScheduledRepeatOptionYearly);
        }
        if (z10) {
            bk0Var = bk0Var3;
            yj0Var = yj0Var2;
            calendar2 = calendar;
            u3Var = u3Var2;
            iArr2 = iArr;
            u0Var2 = u0Var3;
            i15 = i21;
            r22 = obj;
            i16 = 17;
            strArr2 = strArr;
            iVar2 = iVar;
            org.telegram.messenger.camera.i iVar4 = iVar2;
            iVar3 = iVar4;
            r42 = iVar4;
        } else {
            calendar2 = calendar;
            ?? frameLayout6 = new FrameLayout(context2);
            u3Var = u3Var2;
            i15 = i21;
            int v = org.telegram.ui.ActionBar.k6.v(i15, org.telegram.ui.ActionBar.k6.o1(0.075f, i18));
            String[] strArr3 = strArr;
            int o12 = org.telegram.ui.ActionBar.k6.o1(0.1f, i18);
            ?? textView2 = new TextView(context2);
            bk0Var = bk0Var3;
            yj0Var = yj0Var2;
            textView2.setTextSize(i13, 13.0f);
            textView2.setTextColor(i18);
            textView2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            int dp = AndroidUtilities.dp(14.0f);
            int v10 = org.telegram.ui.ActionBar.k6.v(v, o12);
            textView2.setBackground(org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, v, v10, v10));
            textView2.setGravity(17);
            int[] iArr4 = iArr;
            i16 = 17;
            strArr2 = strArr3;
            u0Var2 = u0Var3;
            iVar2 = new org.telegram.messenger.camera.i(iArr4, iArr3, strArr2, textView2, 21);
            iArr2 = iArr4;
            iVar2.run();
            frameLayout6.addView(textView2, w7.z5.d(-2, 28.0f, 1, 32.0f, 4.0f, 32.0f, 5.0f));
            r22 = obj;
            r22.addView(frameLayout6, w7.z5.n(-1, -2));
            iVar3 = textView2;
            r42 = frameLayout6;
        }
        org.telegram.messenger.camera.i iVar5 = iVar2;
        String[] strArr4 = strArr2;
        wdVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        wdVar.setGravity(i16);
        wdVar.setTextColor(c5Var.g);
        wdVar.setTextSize(1, 14.0f);
        wdVar.setTypeface(AndroidUtilities.bold());
        wdVar.setBackground(org.telegram.ui.ActionBar.a6.e(new float[]{24.0f}, c5Var.h));
        r22.addView(wdVar, w7.z5.t(-1, 48, 83, 16, 15, 16, 16));
        int i22 = i15;
        bk0 bk0Var4 = bk0Var;
        final u3 u3Var3 = u3Var;
        final Calendar calendar4 = calendar2;
        wdVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.m2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Runnable runnable2;
                zArr4[0] = false;
                int i23 = j13 == j10 ? 1 : 0;
                qd0 qd0Var2 = qd0Var;
                u3 u3Var4 = u3Var3;
                v3 v3Var2 = v3Var;
                boolean g10 = f5.g(null, null, 0L, 0L, i23, qd0Var2, u3Var4, v3Var2);
                long currentTimeMillis = System.currentTimeMillis();
                Calendar calendar5 = calendar4;
                calendar5.setTimeInMillis(currentTimeMillis);
                calendar5.add(6, qd0Var2.getValue());
                calendar5.set(11, u3Var4.getValue());
                calendar5.set(12, v3Var2.getValue());
                if (g10) {
                    calendar5.set(13, 0);
                    calendar5.set(14, 0);
                }
                d5Var.C((int) (calendar5.getTimeInMillis() / 1000), iArr3[0], zArr3[0]);
                runnable2 = b3Var.a.dismissRunnable;
                runnable2.run();
            }
        });
        b3Var.b(viewGroup);
        org.telegram.ui.ActionBar.h3 h3Var2 = b3Var.a;
        h3Var2.show();
        h3Var2.setOnDismissListener(new n2(runnable, zArr4));
        h3Var2.setBackgroundColor(i22);
        h3Var2.fixNavigationBar(i22);
        if (iVar3 != null) {
            bk0Var2 = bk0Var4;
            i17 = 1;
            h3Var = h3Var2;
            iVar3.setOnClickListener(new z1(frameLayout2, g6Var, h3Var2, (FrameLayout) r42, iArr2, strArr4, iArr3, iVar5));
        } else {
            bk0Var2 = bk0Var4;
            h3Var = h3Var2;
            i17 = 1;
        }
        final ei.x3[] x3VarArr = new ei.x3[i17];
        final org.telegram.ui.ActionBar.u0 u0Var4 = u0Var2;
        final yj0 yj0Var3 = yj0Var;
        bk0Var2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.c2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String string;
                boolean[] zArr5 = zArr3;
                boolean z11 = zArr5[0];
                zArr5[0] = !z11;
                yj0 yj0Var4 = yj0Var3;
                if (z11) {
                    if (yj0Var4.a0 < 40) {
                        yj0Var4.M(40);
                    }
                    yj0Var4.P(80);
                    yj0Var4.start();
                } else {
                    if (yj0Var4.a0 >= 40) {
                        yj0Var4.M(0);
                    }
                    yj0Var4.P(40);
                    yj0Var4.start();
                }
                ei.x3[] x3VarArr2 = x3VarArr;
                ei.x3 x3Var = x3VarArr2[0];
                if (x3Var != null) {
                    x3Var.e(true);
                    x3VarArr2[0] = null;
                }
                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                long j15 = j10;
                TLRPC.User user2 = messagesController.getUser(Long.valueOf(j15));
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j15));
                ei.x3 x3Var2 = new ei.x3(context, 3);
                x3VarArr2[0] = x3Var2;
                x3Var2.r();
                x3Var2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                x3Var2.q(20.0f);
                float dp2 = AndroidUtilities.dp(12.0f);
                float dp3 = AndroidUtilities.dp(4.0f);
                int o13 = org.telegram.ui.ActionBar.k6.o1(0.25f, -16777216);
                x3Var2.i0 = dp2;
                x3Var2.j0 = dp3;
                x3Var2.k0 = o13;
                x3Var2.F.setShadowLayer(dp2, 0.0f, dp3, o13);
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    string = LocaleController.getString(zArr5[0] ? R.string.ScheduleNotifyOnChannel : R.string.ScheduleNotifyOffChannel);
                } else if (chat != null || user2 == null) {
                    string = LocaleController.getString(zArr5[0] ? R.string.ScheduleNotifyOnGroup : R.string.ScheduleNotifyOffGroup);
                } else if (j15 == j13) {
                    string = LocaleController.getString(zArr5[0] ? R.string.ScheduleNotifyOnSelf : R.string.ScheduleNotifyOffSelf);
                } else {
                    string = LocaleController.formatString(zArr5[0] ? R.string.ScheduleNotifyOnChat : R.string.ScheduleNotifyOffChat, UserObject.getForcedFirstName(user2));
                }
                x3Var2.s(string);
                x3Var2.d = 5000L;
                x3Var2.l(1.0f, -((u0Var4 != null ? 42 : -8) + 20));
                x3Var2.l0 = new pg(x3Var2, 2);
                org.telegram.ui.ActionBar.h3 h3Var3 = h3Var;
                h3Var3.getContainerView().setClipToPadding(false);
                h3Var3.getContainerView().setClipChildren(false);
                h3Var3.getContainerView().addView(x3Var2, w7.z5.d(-1, 200.0f, 48, 0.0f, -194.0f, 0.0f, 0.0f));
                x3Var2.u();
            }
        });
        return b3Var;
    }

    public static void L(Context context, long j10, d5 d5Var) {
        K(context, j10, -1L, 0, false, d5Var, null, new c5(null), null);
    }

    public static void M(Context context, long j10, d5 d5Var, org.telegram.ui.ActionBar.g6 g6Var) {
        K(context, j10, -1L, 0, false, d5Var, null, new c5(g6Var), g6Var);
    }

    public static AlertDialog$Builder N(Context context, String str, String str2) {
        return O(context, str, str2, null, null, null);
    }

    public static AlertDialog$Builder O(Context context, String str, String str2, String str3, Runnable runnable, org.telegram.ui.ActionBar.g6 g6Var) {
        if (context == null || str2 == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        if (str == null) {
            str = LocaleController.getString(R.string.AppName);
        }
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.R = str;
        c2Var.T = str2;
        if (str3 == null) {
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            return alertDialog$Builder;
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(str3, new z0(6, runnable));
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.c2 P(Context context, org.telegram.ui.ActionBar.g6 g6Var, String str, CharSequence charSequence, String str2, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.R = str;
        c2Var.T = charSequence;
        alertDialog$Builder.k(str2, new z0(5, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.a;
    }

    public static org.telegram.ui.ActionBar.m1 Q(org.telegram.ui.ActionBar.o2 o2Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, View view, float f7, float f10) {
        if (o2Var == null || view == null) {
            return null;
        }
        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        m1Var.e = true;
        m1Var.c = 220;
        m1Var.setOutsideTouchable(true);
        m1Var.setClippingEnabled(true);
        m1Var.setAnimationStyle(R.style.PopupContextAnimation);
        m1Var.setFocusable(true);
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
        m1Var.setInputMethodMode(2);
        m1Var.getContentView().setFocusableInTouchMode(true);
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
        m1Var.showAtLocation(view.getRootView(), 0, (int) ((f11 + f7) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() / 2.0f)), (int) ((f12 + f10) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() / 2.0f)));
        m1Var.b();
        return m1Var;
    }

    public static void R(Context context, org.telegram.ui.ActionBar.o2 o2Var, String str, String str2, String str3, String str4, int i10, String str5, org.telegram.ui.ActionBar.g6 g6Var, MessagesStorage.StringCallback stringCallback) {
        Activity findActivity = AndroidUtilities.findActivity(context);
        View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        String string = str == null ? LocaleController.getString(R.string.AppName) : str;
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.R = string;
        c2Var.T = str2;
        e5 e5Var = new e5(context);
        e5Var.setTextSize(1, 16.0f);
        int i11 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.W(e5Var, i11, g6Var);
        org.telegram.ui.ActionBar.r6.F(e5Var, org.telegram.ui.ActionBar.k6.Xh, g6Var);
        e5Var.setHint(str3);
        e5Var.setFocusable(true);
        e5Var.setInputType(147457);
        e5Var.setImeOptions(6);
        e5Var.setMaxLines(10);
        e5Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(11.0f));
        e5Var.setCursorWidth(1.5f);
        e5Var.i(org.telegram.ui.ActionBar.k6.q6, g6Var);
        if (str4 != null) {
            e5Var.setText(str4);
        }
        e5Var.setOnEditorActionListener(new ig.p(e5Var, i10, stringCallback, c2VarArr, currentFocus, 1));
        e5Var.addTextChangedListener(new y3(i10, e5Var));
        ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.k6.o1(0.06f, org.telegram.ui.ActionBar.k6.w0(i11, g6Var)));
        org.telegram.ui.ActionBar.n6 M = org.telegram.ui.ActionBar.r6.M(0.06f, i11);
        e5Var.setBackground(c02);
        org.telegram.ui.ActionBar.r6.k(e5Var, c02, M, null, g6Var);
        LinearLayout e = org.telegram.messenger.sl.e(context, 1);
        e.addView(e5Var, w7.z5.k(20.0f, 9.0f, 20.0f, 9.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(e);
        alertDialog$Builder.a.a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
        alertDialog$Builder.k(str5, new hg.b2(e5Var, i10, stringCallback, 8));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.tr(24));
        c2VarArr[0] = alertDialog$Builder.a;
        if (o2Var != null) {
            AndroidUtilities.requestAdjustNothing(findActivity, o2Var.getClassGuid());
        }
        org.telegram.ui.ActionBar.c2 c2Var2 = c2VarArr[0];
        c2Var2.j0 = false;
        c2Var2.setOnDismissListener(new gi.r0(e5Var, o2Var, findActivity, 2));
        c2VarArr[0].setOnShowListener(new e1(1, e5Var));
        c2VarArr[0].show();
        e5Var.setSelection(e5Var.getText().length());
    }

    public static void S(Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.g6 g6Var, MessagesStorage.StringCallback stringCallback) {
        R(context, o2Var, LocaleController.getString(R.string.StoriesAlbumCreateNew), LocaleController.getString(R.string.StoriesAlbumAddHint), LocaleController.getString(R.string.StoriesAlbumTitleInputHint), null, 12, LocaleController.getString(R.string.Create), g6Var, stringCallback);
    }

    public static org.telegram.ui.ActionBar.b3 T(Context context, long j10, final d5 d5Var, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        int i11;
        int i12;
        int i13;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.j5, false);
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h5, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ji, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ni, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E8, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G8, false);
        int i14 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.ActionBar.k6.x0(null, i14, false);
        int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Sh, false);
        int x05 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Oh, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Qh, false);
        if (context == null) {
            return null;
        }
        final org.telegram.ui.ActionBar.b3 b3Var = new org.telegram.ui.ActionBar.b3(context, g6Var);
        b3Var.a();
        final qd0 qd0Var = new qd0(context, g6Var);
        qd0Var.setTextColor(x02);
        qd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        qd0Var.setItemCount(5);
        final u4 u4Var = new u4(context, g6Var);
        u4Var.setWrapSelectorWheel(true);
        u4Var.setAllItemsCount(24);
        u4Var.setItemCount(5);
        u4Var.setTextColor(x02);
        u4Var.setTextOffset(-AndroidUtilities.dp(10.0f));
        final v4 v4Var = new v4(context, g6Var);
        v4Var.setWrapSelectorWheel(true);
        v4Var.setAllItemsCount(60);
        v4Var.setItemCount(5);
        v4Var.setTextColor(x02);
        v4Var.setTextOffset(-AndroidUtilities.dp(34.0f));
        w3 w3Var = new w3(context, qd0Var, u4Var, v4Var, 5);
        w3Var.setOrientation(1);
        LinearLayout e = org.telegram.messenger.sl.e(context, 1);
        w3Var.addView(e, w7.z5.t(-1, -2, 51, 22, 0, 22, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(i10 == 1 ? R.string.SuggestedPostAcceptTitle : R.string.PostSuggestionsAddTime));
        textView.setTextColor(x02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        e.addView(textView, w7.z5.t(-2, -2, 51, 0, 12, 0, 0));
        textView.setOnTouchListener(new di.d(10));
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.z6, g6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setText(LocaleController.getString(R.string.PostSuggestionsAddTimeHint));
        e.addView(textView2, w7.z5.t(-2, -2, 51, 0, 2, 0, 0));
        textView2.setOnTouchListener(new di.d(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        w3Var.addView(linearLayout, w7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long currentTimeMillis = System.currentTimeMillis();
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i15 = calendar.get(1);
        AppGlobalConfig.ConfigTime configTime = MessagesController.getInstance(UserConfig.selectedAccount).config.starsSuggestedPostFutureMin;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        final long j11 = configTime.get(timeUnit) * 2;
        final long j12 = MessagesController.getInstance(UserConfig.selectedAccount).config.starsSuggestedPostFutureMax.get(timeUnit) - 86400;
        final ai.wd wdVar = new ai.wd(context, 20);
        linearLayout.addView(qd0Var, w7.z5.l(0.5f, 0, 270));
        qd0Var.setMinValue(0);
        qd0Var.setMaxValue(365);
        qd0Var.setWrapSelectorWheel(false);
        qd0Var.setFormatter(new i2.v(i15, 8));
        final int i16 = i10 == 1 ? 5 : 3;
        od0 od0Var = new od0() { // from class: org.telegram.ui.Components.v1
            @Override // org.telegram.ui.Components.od0
            public final void n(qd0 qd0Var2, int i17) {
                f5.g(ai.wd.this, null, j11, j12, i16, qd0Var, u4Var, v4Var);
            }
        };
        qd0Var.setOnValueChangedListener(od0Var);
        u4Var.setMinValue(0);
        u4Var.setMaxValue(23);
        linearLayout.addView(u4Var, w7.z5.l(0.2f, 0, 270));
        u4Var.setFormatter(new org.telegram.ui.tr(19));
        u4Var.setOnValueChangedListener(od0Var);
        v4Var.setMinValue(0);
        v4Var.setMaxValue(59);
        v4Var.setValue(0);
        v4Var.setFormatter(new org.telegram.ui.tr(20));
        linearLayout.addView(v4Var, w7.z5.l(0.3f, 0, 270));
        v4Var.setOnValueChangedListener(od0Var);
        if (j10 <= 0 || j10 == 2147483646) {
            i11 = x03;
            i12 = i14;
            i13 = x04;
        } else {
            long j13 = j10 * 1000;
            i11 = x03;
            i12 = i14;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            i13 = x04;
            int timeInMillis = (int) ((j13 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j13);
            if (timeInMillis >= 0) {
                v4Var.setValue(calendar.get(12));
                u4Var.setValue(calendar.get(11));
                qd0Var.setValue(timeInMillis);
            }
        }
        final boolean[] zArr = {true};
        g(wdVar, null, j11, j12, i16, qd0Var, u4Var, v4Var);
        wdVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        wdVar.setGravity(17);
        wdVar.setTextColor(i13);
        wdVar.setTextSize(1, 14.0f);
        wdVar.setTypeface(AndroidUtilities.bold());
        wdVar.setBackground(org.telegram.ui.ActionBar.a6.e(new float[]{8.0f}, x05));
        w3Var.addView(wdVar, w7.z5.t(-1, 48, 83, 16, 15, 16, 4));
        final int i17 = i16;
        wdVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.w1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Runnable runnable;
                zArr[0] = false;
                long j14 = j11;
                long j15 = j12;
                int i18 = i17;
                qd0 qd0Var2 = qd0Var;
                u4 u4Var2 = u4Var;
                v4 v4Var2 = v4Var;
                boolean g10 = f5.g(null, null, j14, j15, i18, qd0Var2, u4Var2, v4Var2);
                long epochMilli = LocalDate.now().plusDays(qd0Var2.getValue()).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
                Calendar calendar2 = calendar;
                calendar2.setTimeInMillis(epochMilli);
                calendar2.set(11, u4Var2.getValue());
                calendar2.set(12, v4Var2.getValue());
                if (g10) {
                    calendar2.set(13, 0);
                }
                d5Var.C((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                runnable = b3Var.a.dismissRunnable;
                runnable.run();
            }
        });
        w7.b6.b(wdVar, 0.02f, 1.2f);
        ai.wd wdVar2 = new ai.wd(context, 21);
        wdVar2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        wdVar2.setGravity(17);
        wdVar2.setText(LocaleController.getString(i10 == 1 ? R.string.MessageSuggestionPublishNow : R.string.PostSuggestionsAnytime));
        wdVar2.setTextColor(x05);
        wdVar2.setTextSize(1, 14.0f);
        int dp = AndroidUtilities.dp(8.0f);
        int i18 = org.telegram.ui.ActionBar.k6.d6;
        int x06 = org.telegram.ui.ActionBar.k6.x0(null, i18, false);
        int i19 = i12;
        int x07 = org.telegram.ui.ActionBar.k6.x0(null, i19, false);
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, x06, x07, x07);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i18);
        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i19);
        wdVar2.setBackground(j02);
        org.telegram.ui.ActionBar.r6.k(wdVar2, j02, O, O2, null);
        w3Var.addView(wdVar2, w7.z5.t(-1, 48, 83, 16, 0, 16, 16));
        wdVar2.setOnClickListener(new ai.v0(zArr, d5Var, b3Var, 15));
        w7.b6.b(wdVar2, 0.02f, 1.2f);
        b3Var.b(w3Var);
        org.telegram.ui.ActionBar.h3 h3Var = b3Var.a;
        h3Var.show();
        h3Var.setOnDismissListener(new ei.e1(zArr));
        h3Var.setBackgroundColor(i11);
        h3Var.fixNavigationBar(i11);
        return b3Var;
    }

    public static org.telegram.ui.ActionBar.c2 U(org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        if (o2Var == null || o2Var.getParentActivity() == null) {
            return null;
        }
        y90 y90Var = new y90(o2Var.getParentActivity(), o2Var.getResourceProvider());
        SpannableString spannableString = new SpannableString(Html.fromHtml(LocaleController.getString(R.string.AskAQuestionInfo).replace("\n", "<br>")));
        for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new m4(o2Var, uRLSpan.getURL()), spanStart, spanEnd, 0);
        }
        y90Var.setText(spannableString);
        y90Var.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.I(y90Var, org.telegram.ui.ActionBar.k6.k5, g6Var);
        org.telegram.ui.ActionBar.r6.E(y90Var, org.telegram.ui.ActionBar.k6.l5, g6Var);
        y90Var.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
        y90Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        org.telegram.ui.ActionBar.r6.W(y90Var, org.telegram.ui.ActionBar.k6.j5, g6Var);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity(), 0, g6Var);
        alertDialog$Builder.o(y90Var);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.AskAQuestion);
        alertDialog$Builder.k(LocaleController.getString(R.string.AskButton), new r2(1, o2Var));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.a;
    }

    public static AlertDialog$Builder V(Context context, TLRPC.EncryptedChat encryptedChat, org.telegram.ui.ActionBar.g6 g6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.MessageLifetime);
        qd0 qd0Var = new qd0(context, null);
        qd0Var.setMinValue(0);
        qd0Var.setMaxValue(20);
        int i10 = encryptedChat.ttl;
        if (i10 > 0 && i10 < 16) {
            qd0Var.setValue(i10);
        } else if (i10 == 30) {
            qd0Var.setValue(16);
        } else if (i10 == 60) {
            qd0Var.setValue(17);
        } else if (i10 == 3600) {
            qd0Var.setValue(18);
        } else if (i10 == 86400) {
            qd0Var.setValue(19);
        } else if (i10 == 604800) {
            qd0Var.setValue(20);
        } else if (i10 == 0) {
            qd0Var.setValue(0);
        }
        qd0Var.setFormatter(new e2(10));
        alertDialog$Builder.o(qd0Var);
        alertDialog$Builder.h(LocaleController.getString(R.string.Done), new p2(1, encryptedChat, qd0Var));
        return alertDialog$Builder;
    }

    public static void W(org.telegram.ui.ActionBar.o2 o2Var, int i10, org.telegram.ui.ActionBar.j6 j6Var, org.telegram.ui.ActionBar.i6 i6Var) {
        int i11;
        String sb2;
        if (o2Var.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = o2Var.getParentActivity();
        e5 e5Var = new e5(parentActivity);
        String str = null;
        e5Var.setBackground(null);
        org.telegram.ui.ActionBar.r6.H(e5Var, org.telegram.ui.ActionBar.k6.u5, org.telegram.ui.ActionBar.k6.v5, org.telegram.ui.ActionBar.k6.q7, null);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.NewTheme);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Create), new e2(11));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        TextView textView = new TextView(parentActivity);
        if (i10 != 0) {
            org.telegram.messenger.v0.m(R.string.EnterThemeNameEdit, textView);
        } else {
            textView.setText(LocaleController.getString(R.string.EnterThemeName));
        }
        textView.setTextSize(1, 16.0f);
        textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
        int i12 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.W(textView, i12, null);
        linearLayout.addView(textView, w7.z5.n(-1, -2));
        e5Var.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.W(e5Var, i12, null);
        e5Var.setMaxLines(1);
        e5Var.setLines(1);
        e5Var.setInputType(16385);
        e5Var.setGravity(51);
        e5Var.setSingleLine(true);
        e5Var.setImeOptions(6);
        e5Var.i(org.telegram.ui.ActionBar.k6.G6, null);
        e5Var.setCursorSize(AndroidUtilities.dp(20.0f));
        e5Var.setCursorWidth(1.5f);
        e5Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        linearLayout.addView(e5Var, w7.z5.t(-1, 36, 51, 24, 6, 24, 0));
        e5Var.setOnEditorActionListener(new s2(0));
        List asList = Arrays.asList("Ancient", "Antique", "Autumn", "Baby", "Barely", "Baroque", "Blazing", "Blushing", "Bohemian", "Bubbly", "Burning", "Buttered", "Classic", "Clear", "Cool", "Cosmic", "Cotton", "Cozy", "Crystal", "Dark", "Daring", "Darling", "Dawn", "Dazzling", "Deep", "Deepest", "Delicate", "Delightful", "Divine", "Double", "Downtown", "Dreamy", "Dusky", "Dusty", "Electric", "Enchanted", "Endless", "Evening", "Fantastic", "Flirty", "Forever", "Frigid", "Frosty", "Frozen", "Gentle", "Heavenly", "Hyper", "Icy", "Infinite", "Innocent", "Instant", "Luscious", "Lunar", "Lustrous", "Magic", "Majestic", "Mambo", "Midnight", "Millenium", "Morning", "Mystic", "Natural", "Neon", "Night", "Opaque", "Paradise", "Perfect", "Perky", "Polished", "Powerful", "Rich", "Royal", "Sheer", "Simply", "Sizzling", "Solar", "Sparkling", "Splendid", "Spicy", "Spring", "Stellar", "Sugared", "Summer", "Sunny", "Super", "Sweet", "Tender", "Tenacious", "Tidal", "Toasted", "Totally", "Tranquil", "Tropical", "True", "Twilight", "Twinkling", "Ultimate", "Ultra", "Velvety", "Vibrant", "Vintage", "Virtual", "Warm", "Warmest", "Whipped", "Wild", "Winsome");
        List asList2 = Arrays.asList("Ambrosia", "Attack", "Avalanche", "Blast", "Bliss", "Blossom", "Blush", "Burst", "Butter", "Candy", "Carnival", "Charm", "Chiffon", "Cloud", "Comet", "Delight", "Dream", "Dust", "Fantasy", "Flame", "Flash", "Fire", "Freeze", "Frost", "Glade", "Glaze", "Gleam", "Glimmer", "Glitter", "Glow", "Grande", "Haze", "Highlight", "Ice", "Illusion", "Intrigue", "Jewel", "Jubilee", "Kiss", "Lights", "Lollypop", "Love", "Luster", "Madness", "Matte", "Mirage", "Mist", "Moon", "Muse", "Myth", "Nectar", "Nova", "Parfait", "Passion", "Pop", "Rain", "Reflection", "Rhapsody", "Romance", "Satin", "Sensation", "Silk", "Shine", "Shadow", "Shimmer", "Sky", "Spice", "Star", "Sugar", "Sunrise", "Sunset", "Sun", "Twist", "Unbound", "Velvet", "Vibrant", "Waters", "Wine", "Wink", "Wonder", "Zone");
        HashMap hashMap = new HashMap();
        i2.o1.r(9306112, hashMap, "Berry", 14598550, "Brandy");
        i2.o1.r(8391495, hashMap, "Cherry", 16744272, "Coral");
        i2.o1.r(14372985, hashMap, "Cranberry", 14423100, "Crimson");
        i2.o1.r(14725375, hashMap, "Mauve", 16761035, "Pink");
        i2.o1.r(16711680, hashMap, "Red", 16711807, "Rose");
        i2.o1.r(8406555, hashMap, "Russet", 16720896, "Scarlet");
        i2.o1.r(15856113, hashMap, "Seashell", 16724889, "Strawberry");
        i2.o1.r(16760576, hashMap, "Amber", 15438707, "Apricot");
        i2.o1.r(16508850, hashMap, "Banana", 10601738, "Citrus");
        i2.o1.r(11560192, hashMap, "Ginger", 16766720, "Gold");
        i2.o1.r(16640272, hashMap, "Lemon", 16753920, "Orange");
        i2.o1.r(16770484, hashMap, "Peach", 16739155, "Persimmon");
        i2.o1.r(14996514, hashMap, "Sunflower", 15893760, "Tangerine");
        i2.o1.r(16763004, hashMap, "Topaz", 16776960, "Yellow");
        i2.o1.r(3688720, hashMap, "Clover", 8628829, "Cucumber");
        i2.o1.r(5294200, hashMap, "Emerald", 11907932, "Olive");
        i2.o1.r(65280, hashMap, "Green", 43115, "Jade");
        i2.o1.r(2730887, hashMap, "Jungle", 12582656, "Lime");
        i2.o1.r(776785, hashMap, "Malachite", 10026904, "Mint");
        i2.o1.r(11394989, hashMap, "Moss", 3234721, "Azure");
        i2.o1.r(255, hashMap, "Blue", 18347, "Cobalt");
        i2.o1.r(5204422, hashMap, "Indigo", 96647, "Lagoon");
        i2.o1.r(7461346, hashMap, "Aquamarine", 1182351, "Ultramarine");
        i2.o1.r(128, hashMap, "Navy", 3101086, "Sapphire");
        i2.o1.r(7788522, hashMap, "Sky", 32896, "Teal");
        i2.o1.r(4251856, hashMap, "Turquoise", 10053324, "Amethyst");
        i2.o1.r(5046581, hashMap, "Blackberry", 6373457, "Eggplant");
        i2.o1.r(13148872, hashMap, "Lilac", 11894492, "Lavender");
        i2.o1.r(13421823, hashMap, "Periwinkle", 8663417, "Plum");
        i2.o1.r(6684825, hashMap, "Purple", 14204888, "Thistle");
        i2.o1.r(14315734, hashMap, "Orchid", 2361920, "Violet");
        i2.o1.r(4137225, hashMap, "Bronze", 3604994, "Chocolate");
        i2.o1.r(8077056, hashMap, "Cinnamon", 3153694, "Cocoa");
        i2.o1.r(7365973, hashMap, "Coffee", 7956873, "Rum");
        i2.o1.r(5113350, hashMap, "Mahogany", 7875865, "Mocha");
        i2.o1.r(12759680, hashMap, "Sand", 8924439, "Sienna");
        i2.o1.r(7864585, hashMap, "Maple", 15787660, "Khaki");
        i2.o1.r(12088115, hashMap, "Copper", 12144200, "Chestnut");
        i2.o1.r(15653316, hashMap, "Almond", 16776656, "Cream");
        i2.o1.r(12186367, hashMap, "Diamond", 11109127, "Honey");
        i2.o1.r(16777200, hashMap, "Ivory", 15392968, "Pearl");
        i2.o1.r(15725299, hashMap, "Porcelain", 13745832, "Vanilla");
        i2.o1.r(16777215, hashMap, "White", 8421504, "Gray");
        i2.o1.r(0, hashMap, "Black", 15266260, "Chrome");
        i2.o1.r(3556687, hashMap, "Charcoal", 789277, "Ebony");
        i2.o1.r(12632256, hashMap, "Silver", 16119285, "Smoke");
        i2.o1.r(2499381, hashMap, "Steel", 5220413, "Apple");
        i2.o1.r(8434628, hashMap, "Glacier", 16693933, "Melon");
        i2.o1.r(12929932, hashMap, "Mulberry", 11126466, "Opal");
        hashMap.put(5547512, "Blue");
        org.telegram.ui.ActionBar.i6 k10 = i6Var == null ? org.telegram.ui.ActionBar.k6.C0().k(false) : i6Var;
        if (k10 == null || (i11 = k10.c) == 0) {
            i11 = AndroidUtilities.calcDrawableColor(org.telegram.ui.ActionBar.k6.s0())[0];
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
            sb2 = a1.g.q((String) asList.get(Utilities.random.nextInt(asList.size())), " ", str, new StringBuilder());
        } else {
            StringBuilder i17 = si.o0.i(str, " ");
            i17.append((String) asList2.get(Utilities.random.nextInt(asList2.size())));
            sb2 = i17.toString();
        }
        e5Var.setText(sb2);
        e5Var.setSelection(e5Var.length());
        e1 e1Var = new e1(2, e5Var);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.setOnShowListener(e1Var);
        o2Var.showDialog(c2Var);
        e5Var.requestFocus();
        c2Var.d(-1).setOnClickListener(new ci.e0(o2Var, e5Var, i6Var, j6Var, c2Var, 9));
    }

    public static void X(Activity activity, String str, int i10, int i11, int i12, Utilities.Callback callback) {
        if (activity == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.j5, false);
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h5, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ji, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ni, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E8, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G8, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.i6, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Sh, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Oh, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Qh, false);
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) activity, (org.telegram.ui.ActionBar.g6) null, false);
        h3Var.fixNavigationBar();
        h3Var.applyBottomPadding = false;
        q3 q3Var = new q3(activity, null);
        r3 r3Var = new r3(activity, q3Var);
        r3Var.setOrientation(0);
        r3Var.setWeightSum(1.0f);
        q3Var.setAllItemsCount(24);
        q3Var.setItemCount(5);
        q3Var.setTextColor(x02);
        q3Var.setGravity(5);
        q3Var.setTextOffset(-AndroidUtilities.dp(12.0f));
        s3 s3Var = new s3(activity, null);
        s3Var.setWrapSelectorWheel(true);
        s3Var.setAllItemsCount(60);
        s3Var.setItemCount(5);
        s3Var.setTextColor(x02);
        s3Var.setGravity(3);
        s3Var.setTextOffset(AndroidUtilities.dp(12.0f));
        final ai.y4 y4Var = new ai.y4(i11, i12, q3Var, s3Var, i10, r3Var);
        r3Var.addView(q3Var, w7.z5.l(0.5f, 0, 270));
        q3Var.setFormatter(new e2(2));
        final int i13 = 0;
        q3Var.setOnValueChangedListener(new od0() { // from class: org.telegram.ui.Components.j2
            @Override // org.telegram.ui.Components.od0
            public final void n(qd0 qd0Var, int i14) {
                switch (i13) {
                    case 0:
                        y4Var.run(Boolean.TRUE);
                        break;
                    default:
                        y4Var.run(Boolean.TRUE);
                        break;
                }
            }
        });
        r3Var.addView(s3Var, w7.z5.l(0.5f, 0, 270));
        s3Var.setFormatter(new e2(3));
        final int i14 = 1;
        s3Var.setOnValueChangedListener(new od0() { // from class: org.telegram.ui.Components.j2
            @Override // org.telegram.ui.Components.od0
            public final void n(qd0 qd0Var, int i142) {
                switch (i14) {
                    case 0:
                        y4Var.run(Boolean.TRUE);
                        break;
                    default:
                        y4Var.run(Boolean.TRUE);
                        break;
                }
            }
        });
        y4Var.run(Boolean.FALSE);
        t3 t3Var = new t3(activity, q3Var, s3Var);
        t3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextColor(x02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, w7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new di.d(10));
        t3Var.addView(frameLayout, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
        t3Var.addView(r3Var, w7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        ei.d dVar = new ei.d(activity, null, true);
        dVar.setRoundRadius(24);
        dVar.i(LocaleController.getString(R.string.Select), false, true);
        dVar.setOnClickListener(new k2(r1, 0));
        t3Var.addView(dVar, w7.z5.t(-1, 48, 0, 16, 12, 16, 12));
        h3Var.customView = t3Var;
        h3Var.show();
        h3Var.setOnDismissListener(new gi.r0(callback, q3Var, s3Var, 3));
        h3Var.setBackgroundColor(x03);
        h3Var.fixNavigationBar(x03);
        org.telegram.ui.ActionBar.h3[] h3VarArr = {h3Var};
    }

    public static org.telegram.ui.ActionBar.c2 Y(Activity activity, final long j10, final long j11, String str, final Runnable runnable, org.telegram.ui.ActionBar.g6 g6Var) {
        String[] strArr;
        final String str2 = str;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
        boolean z10 = true;
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
        LinearLayout f7 = org.telegram.messenger.v0.f(activity, 1);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, g6Var);
        int i12 = 0;
        while (i12 < strArr2.length) {
            org.telegram.ui.Cells.l6 l6Var = new org.telegram.ui.Cells.l6(activity, g6Var);
            l6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            l6Var.setTag(Integer.valueOf(i12));
            a(l6Var, org.telegram.ui.ActionBar.k6.g7, org.telegram.ui.ActionBar.k6.E5, g6Var);
            l6Var.b(strArr2[i12], iArr[0] == i12 ? z10 : false);
            f7.addView(l6Var);
            l6Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.c3
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
                    alertDialog$Builder.a.N0.run();
                    runnable.run();
                }
            });
            i12++;
            str2 = str;
            z10 = true;
        }
        alertDialog$Builder.a.R = LocaleController.getString(R.string.Vibrate);
        alertDialog$Builder.o(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.a;
    }

    public static org.telegram.ui.ActionBar.c2 Z(Context context, org.telegram.ui.ActionBar.g6 g6Var, String[] strArr, int i10, String str, String str2, q0.a aVar) {
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
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        int i11 = org.telegram.ui.ActionBar.k6.L5;
        alertDialog$Builder.m(i10, 72, org.telegram.ui.ActionBar.k6.x0(null, i11, false), null);
        alertDialog$Builder.n(i11, null);
        if (z10) {
            str = str2;
        }
        alertDialog$Builder.a.T = AndroidUtilities.replaceTags(str);
        alertDialog$Builder.k(LocaleController.getString(z10 ? R.string.PermissionOpenSettings : R.string.BotWebViewRequestAllow), new da.b(z10, context, atomicBoolean, aVar, 4));
        alertDialog$Builder.h(LocaleController.getString(R.string.BotWebViewRequestDontAllow), new m4.w0(25, atomicBoolean, aVar));
        alertDialog$Builder.a.setOnDismissListener(new ai.z3(7, atomicBoolean, aVar));
        return alertDialog$Builder.a;
    }

    public static void a(org.telegram.ui.Cells.l6 l6Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        for (int i12 = 0; i12 < l6Var.getChildCount(); i12++) {
            View childAt = l6Var.getChildAt(i12);
            if (childAt instanceof RadioButton) {
                org.telegram.ui.ActionBar.r6.Q((RadioButton) childAt, i10, i11, g6Var);
                return;
            }
        }
        l6Var.a(org.telegram.ui.ActionBar.k6.w0(i10, g6Var), org.telegram.ui.ActionBar.k6.w0(i11, g6Var));
    }

    public static void a0(int i10, int i11, long j10, Utilities.Callback callback) {
        b0(i10, j10, i11, callback, 0L);
    }

    public static void b(qd0 qd0Var, qd0 qd0Var2, qd0 qd0Var3) {
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
        qd0Var3.setMaxValue(i14);
        qd0Var3.setMinValue(i11);
        int value = qd0Var3.getValue();
        qd0Var2.setMaxValue(value == i14 ? i15 : 11);
        qd0Var2.setMinValue(value == i11 ? i12 : 0);
        int value2 = qd0Var2.getValue();
        calendar.set(1, value);
        calendar.set(2, value2);
        int actualMaximum = calendar.getActualMaximum(5);
        if (value == i14 && value2 == i15) {
            actualMaximum = Math.min(i16, actualMaximum);
        }
        qd0Var.setMaxValue(actualMaximum);
        if (value == i11 && value2 == i12) {
            i10 = i13;
        }
        qd0Var.setMinValue(i10);
    }

    public static boolean b0(final int i10, final long j10, int i11, Utilities.Callback callback, long j11) {
        TLRPC.Chat chat;
        long sendPaidMessagesStars = MessagesController.getInstance(i10).getSendPaidMessagesStars(j10);
        if (sendPaidMessagesStars <= 0 && j10 > 0) {
            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i10).isUserContactBlocked(j10));
        }
        long j12 = i11 * sendPaidMessagesStars;
        ai.ha.y(i10, false).P.put(Long.valueOf(j10), Integer.valueOf(i11));
        if (j12 <= 0 || j11 == j12) {
            callback.run(Long.valueOf(j12));
            return false;
        }
        final long j13 = sendPaidMessagesStars;
        final u2 u2Var = new u2(i10, j12, j10, callback, j13, 0);
        if (j13 <= MessagesController.getInstance(i10).getMainSettings().getLong(org.telegram.ui.Cells.b1.k(j10, "ask_paid_message_", "_price"), 0L)) {
            u2Var.run();
            return true;
        }
        Activity activity = AndroidUtilities.getActivity();
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        org.telegram.ui.ActionBar.g6 bVar = (PhotoViewer.u1().T1() || (U != null && U.hasShownSheet())) ? new ci.b() : U != null ? U.getResourceProvider() : null;
        String shortName = DialogObject.getShortName(i10, j10);
        if (ChatObject.isMonoForum(i10, j10)) {
            shortName = og.d.h(i10, j10);
        } else if (U instanceof org.telegram.ui.sn) {
            org.telegram.ui.sn snVar = (org.telegram.ui.sn) U;
            if (snVar.s4 && snVar.a() == j10 && (chat = snVar.r4) != null) {
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
                    edit.putLong(org.telegram.ui.Cells.b1.k(j14, "ask_paid_message_", "_price"), j13).apply();
                    ai.ha.y(i13, false).O.put(Long.valueOf(j14), Long.valueOf(System.currentTimeMillis()));
                }
                AndroidUtilities.runOnUIThread(u2Var);
            }
        }, bVar, true);
        return true;
    }

    public static long c(ei.d dVar, qd0 qd0Var, qd0 qd0Var2, qd0 qd0Var3, qd0 qd0Var4) {
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i10 = 1;
        int i11 = calendar.get(1);
        int value = ((qd0Var2.getValue() - 120) / 12) + i11;
        calendar.clear();
        calendar.set(1, value);
        calendar.set(2, (qd0Var2.getValue() - 120) % 12);
        qd0Var.setMinValue(1);
        qd0Var.setMaxValue(calendar.getActualMaximum(5));
        int value2 = qd0Var.getValue();
        int value3 = qd0Var3.getValue();
        int value4 = qd0Var4.getValue();
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
        int i12 = 0;
        int i13 = 0;
        long j10 = 0;
        boolean z11 = true;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            Long l4 = (Long) obj;
            long j11 = j10;
            long longValue = l4.longValue();
            long sendPaidMessagesStars = MessagesController.getInstance(i10).getSendPaidMessagesStars(longValue);
            if (sendPaidMessagesStars <= 0 && longValue > 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i10).isUserContactBlocked(longValue));
            }
            hashMap.put(l4, Long.valueOf(sendPaidMessagesStars));
            long j12 = j11 + sendPaidMessagesStars;
            boolean z12 = z10;
            ai.ha.y(i10, z10).P.put(l4, Integer.valueOf(i11));
            if (sendPaidMessagesStars > 0) {
                i12++;
            }
            if (sendPaidMessagesStars > 0 && z11 && MessagesController.getInstance(i10).getMainSettings().getLong(org.telegram.ui.Cells.b1.k(longValue, "ask_paid_message_", "_price"), 0L) < sendPaidMessagesStars) {
                z11 = z12;
            }
            j10 = j12;
            z10 = z12;
        }
        boolean z13 = z10;
        long max = Math.max(1, i11) * j10;
        if (z11 || max <= 0) {
            callback.run(hashMap);
            return z13;
        }
        Activity activity = AndroidUtilities.getActivity();
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        org.telegram.ui.ActionBar.g6 bVar = (PhotoViewer.u1().T1() || (U != null && U.hasShownSheet())) ? new ci.b() : U != null ? U.getResourceProvider() : null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti1", i12)));
        spannableStringBuilder.append((CharSequence) " ");
        Object[] objArr = new Object[1];
        objArr[z13 ? 1 : 0] = LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i12) * i11);
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti2", (int) max, objArr)));
        i0(activity, LocaleController.getString(R.string.MessageLockedStarsConfirmTitle), spannableStringBuilder, LocaleController.getString(R.string.MessageLockedStarsConfirmMessageDontAsk), LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessagePay", i11), new org.telegram.ui.nq(i10, max, activity, arrayList, hashMap, callback, bVar), bVar, true);
        return true;
    }

    public static void d(qd0 qd0Var, qd0 qd0Var2, qd0 qd0Var3) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i10 = 1;
        int i11 = calendar.get(1);
        int i12 = calendar.get(2);
        int i13 = calendar.get(5);
        qd0Var3.setMinValue(i11);
        int value = qd0Var3.getValue();
        qd0Var2.setMinValue(value == i11 ? i12 : 0);
        int value2 = qd0Var2.getValue();
        if (value == i11 && value2 == i12) {
            i10 = i13;
        }
        qd0Var.setMinValue(i10);
    }

    public static boolean d0(int i10, long j10) {
        long sendPaidMessagesStars = MessagesController.getInstance(i10).getSendPaidMessagesStars(j10);
        if (sendPaidMessagesStars <= 0 && j10 > 0) {
            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i10).isUserContactBlocked(j10));
        }
        return sendPaidMessagesStars > 0 && sendPaidMessagesStars > MessagesController.getInstance(i10).getMainSettings().getLong(org.telegram.ui.Cells.b1.k(j10, "ask_paid_message_", "_price"), 0L);
    }

    public static void e(TextView textView, qd0 qd0Var, d4 d4Var, e4 e4Var) {
        int value = qd0Var.getValue();
        int value2 = d4Var.getValue();
        int value3 = e4Var.getValue();
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

    public static void e0(e5 e5Var, org.telegram.ui.ActionBar.c2 c2Var, org.telegram.ui.ActionBar.o2 o2Var) {
        if (o2Var.getParentActivity() == null) {
            return;
        }
        AndroidUtilities.hideKeyboard(e5Var);
        String obj = e5Var.getText().toString();
        int i10 = org.telegram.ui.ActionBar.k6.a;
        org.telegram.ui.ActionBar.j6 j6Var = new org.telegram.ui.ActionBar.j6();
        j6Var.b = new File(ApplicationLoader.getFilesDirFixed(), "theme" + Utilities.random.nextLong() + ".attheme").getAbsolutePath();
        j6Var.a = obj;
        org.telegram.ui.ActionBar.k6.h0 = org.telegram.ui.ActionBar.k6.a1(org.telegram.ui.ActionBar.k6.I.i0);
        j6Var.E = UserConfig.selectedAccount;
        org.telegram.ui.ActionBar.k6.u1(j6Var, true, true, false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
        new ThemeEditorView().d(o2Var.getParentActivity(), j6Var);
        c2Var.dismiss();
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("themehint", false)) {
            return;
        }
        globalMainSettings.edit().putBoolean("themehint", true).commit();
        try {
            Toast.makeText(o2Var.getParentActivity(), LocaleController.getString(R.string.CreateNewThemeHelp), 1).show();
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
        AndroidUtilities.runOnUIThread(new ai.vb(i10, chat, arrayList, arrayList2, arrayList3), 200L);
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
    public static org.telegram.ui.ActionBar.c2 f0(final int i10, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.o2 o2Var, TLObject tLObject, Object... objArr) {
        String str;
        String str2;
        final long j10;
        long peerDialogId;
        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
        if (tL_error != null && tL_error.code != 406 && (str = tL_error.text) != null) {
            if ("BALANCE_TOO_LOW".equalsIgnoreCase(str)) {
                final long o10 = ai.ha.o(tLObject);
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
                        ai.ha.y(i10, false).q(true, true, new Runnable() { // from class: org.telegram.ui.Components.o2
                            @Override // java.lang.Runnable
                            public final void run() {
                                Activity activity = AndroidUtilities.getActivity();
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                org.telegram.ui.ActionBar.g6 bVar = (PhotoViewer.u1().T1() || (U != null && U.hasShownSheet())) ? new ci.b() : U != null ? U.getResourceProvider() : null;
                                int i11 = i10;
                                long j11 = j10;
                                new ai.dd(activity, bVar, o10, 13, DialogObject.getShortName(i11, j11), new ah.j(26), j11).show();
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
                    u0(o2Var2, LocaleController.getString(R.string.GuardBotTimeoutTitle), LocaleController.getString(R.string.GuardBotTimeout), null);
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
                    if (o2Var2 == null) {
                        o2Var2 = LaunchActivity.R();
                    }
                    u0(o2Var2, LocaleController.getString(R.string.MessagePremiumErrorTitle), LocaleController.formatString(R.string.MessagePremiumErrorMessage, str2), null);
                    MessagesController.getInstance(i10).invalidateUserPremiumBlocked(peerDialogId2, 0);
                    return null;
                }
                boolean z11 = tLObject instanceof TLRPC.TL_messages_initHistoryImport;
                if (z11 || (tLObject instanceof TLRPC.TL_messages_checkHistoryImportPeer) || (tLObject instanceof TLRPC.TL_messages_checkHistoryImport) || (tLObject instanceof TLRPC.TL_messages_startHistoryImport)) {
                    TLRPC.InputPeer inputPeer = z11 ? ((TLRPC.TL_messages_initHistoryImport) tLObject).peer : tLObject instanceof TLRPC.TL_messages_startHistoryImport ? ((TLRPC.TL_messages_startHistoryImport) tLObject).peer : null;
                    org.telegram.ui.ActionBar.o2 R = o2Var2 == null ? LaunchActivity.R() : o2Var2;
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
                    org.telegram.ui.Cells.b1.o(R.string.ErrorOccurred, "\n", sb2);
                    sb2.append(tL_error.text);
                    u0(R, string, sb2.toString(), null);
                } else {
                    if ((tLObject instanceof TL_account.saveSecureValue) || (tLObject instanceof TL_account.getAuthorizationForm)) {
                        org.telegram.ui.ActionBar.o2 R2 = o2Var2 == null ? LaunchActivity.R() : o2Var2;
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
                        org.telegram.ui.Cells.b1.o(R.string.ErrorOccurred, "\n", sb3);
                        sb3.append(tL_error.text);
                        u0(R2, null, sb3.toString(), null);
                        return null;
                    }
                    boolean z12 = tLObject instanceof TLRPC.TL_channels_joinChannel;
                    if (!z12 && !(tLObject instanceof TLRPC.TL_channels_editAdmin) && !(tLObject instanceof TLRPC.TL_channels_inviteToChannel) && !(tLObject instanceof TLRPC.TL_messages_addChatUser) && !(tLObject instanceof TLRPC.TL_messages_startBot) && !(tLObject instanceof TLRPC.TL_channels_editBanned) && !(tLObject instanceof TLRPC.TL_messages_editChatDefaultBannedRights) && !(tLObject instanceof TLRPC.TL_messages_editChatAdmin) && !(tLObject instanceof TLRPC.TL_messages_migrateChat) && !(tLObject instanceof TL_phone.inviteToGroupCall)) {
                        char c10 = 2;
                        if (tLObject instanceof TLRPC.TL_messages_createChat) {
                            org.telegram.ui.ActionBar.o2 R3 = o2Var2 == null ? LaunchActivity.R() : o2Var2;
                            if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                                if (R3.getParentActivity() != null) {
                                    R3.showDialog(new sg.j0(5, i10, R3.getParentActivity(), R3, null));
                                    return null;
                                }
                                R3.presentFragment(new md1(2));
                                return null;
                            }
                            org.telegram.ui.ActionBar.o2 o2Var3 = R3;
                            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                m0(o2Var3, tL_error.text);
                                return null;
                            }
                            h0(tL_error, o2Var3, false, false, tLObject);
                            return null;
                        }
                        if (tLObject instanceof TLRPC.TL_channels_createChannel) {
                            org.telegram.ui.ActionBar.o2 R4 = o2Var2 == null ? LaunchActivity.R() : o2Var2;
                            if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                                if (R4.getParentActivity() != null) {
                                    R4.showDialog(new sg.j0(5, i10, R4.getParentActivity(), R4, null));
                                    return null;
                                }
                                R4.presentFragment(new md1(2));
                                return null;
                            }
                            org.telegram.ui.ActionBar.o2 o2Var4 = R4;
                            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                m0(o2Var4, tL_error.text);
                                return null;
                            }
                            h0(tL_error, o2Var4, false, false, tLObject);
                            return null;
                        }
                        if (tLObject instanceof TLRPC.TL_messages_editMessage) {
                            if (!tL_error.text.equals("MESSAGE_NOT_MODIFIED")) {
                                if (o2Var2 != null) {
                                    u0(o2Var2, null, LocaleController.getString(R.string.EditMessageError), null);
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
                                            w0(o2Var2, LocaleController.getString(R.string.MessageScheduledLimitReached));
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
                                org.telegram.ui.ActionBar.o2 R5 = o2Var2 == null ? LaunchActivity.R() : o2Var2;
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
                                        R5.showDialog(new sg.j0(5, i10, R5.getParentActivity(), R5, null));
                                        return null;
                                    }
                                    R5.presentFragment(new md1(0));
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
                                if (o2Var2 != null && o2Var2.getParentActivity() != null) {
                                    Activity parentActivity = o2Var2.getParentActivity();
                                    StringBuilder sb4 = new StringBuilder();
                                    org.telegram.ui.Cells.b1.o(R.string.ErrorOccurred, "\n", sb4);
                                    sb4.append(tL_error.text);
                                    Toast.makeText(parentActivity, sb4.toString(), 0).show();
                                    return null;
                                }
                            } else {
                                if ((tLObject instanceof TL_account.confirmPhone) || (tLObject instanceof TL_account.verifyPhone) || (tLObject instanceof TL_account.verifyEmail)) {
                                    return (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID") || tL_error.text.contains("CODE_INVALID") || tL_error.text.contains("CODE_EMPTY")) ? u0(o2Var2, null, LocaleController.getString(R.string.InvalidCode), null) : (tL_error.text.contains("PHONE_CODE_EXPIRED") || tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) ? u0(o2Var2, null, LocaleController.getString(R.string.CodeExpired), null) : tL_error.text.startsWith("FLOOD_WAIT") ? u0(o2Var2, null, LocaleController.getString(R.string.FloodWait), null) : u0(o2Var2, null, tL_error.text, null);
                                }
                                if (tLObject instanceof TLRPC.TL_auth_resendCode) {
                                    if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                                        return u0(o2Var2, null, LocaleController.getString(R.string.InvalidPhoneNumber), null);
                                    }
                                    if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                                        return u0(o2Var2, null, LocaleController.getString(R.string.InvalidCode), null);
                                    }
                                    if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                        return u0(o2Var2, null, LocaleController.getString(R.string.CodeExpired), null);
                                    }
                                    if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                        return u0(o2Var2, null, LocaleController.getString(R.string.FloodWait), null);
                                    }
                                    if (tL_error.code != -1000) {
                                        StringBuilder sb5 = new StringBuilder();
                                        org.telegram.ui.Cells.b1.o(R.string.ErrorOccurred, "\n", sb5);
                                        sb5.append(tL_error.text);
                                        return u0(o2Var2, null, sb5.toString(), null);
                                    }
                                } else {
                                    if (tLObject instanceof TL_account.sendConfirmPhoneCode) {
                                        return tL_error.code == 400 ? u0(o2Var2, null, LocaleController.getString(R.string.CancelLinkExpired), null) : tL_error.text.startsWith("FLOOD_WAIT") ? u0(o2Var2, null, LocaleController.getString(R.string.FloodWait), null) : u0(o2Var2, null, LocaleController.getString(R.string.ErrorOccurred), null);
                                    }
                                    if (tLObject instanceof TL_account.changePhone) {
                                        if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                                            u0(o2Var2, null, LocaleController.getString(R.string.InvalidPhoneNumber), null);
                                            return null;
                                        }
                                        if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                                            u0(o2Var2, null, LocaleController.getString(R.string.InvalidCode), null);
                                            return null;
                                        }
                                        if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                            u0(o2Var2, null, LocaleController.getString(R.string.CodeExpired), null);
                                            return null;
                                        }
                                        if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                            u0(o2Var2, null, LocaleController.getString(R.string.FloodWait), null);
                                            return null;
                                        }
                                        if (tL_error.text.contains("FRESH_CHANGE_PHONE_FORBIDDEN")) {
                                            u0(o2Var2, LocaleController.getString(R.string.FreshChangePhoneForbiddenTitle), LocaleController.getString(R.string.FreshChangePhoneForbidden), null);
                                            return null;
                                        }
                                        u0(o2Var2, null, tL_error.text, null);
                                        return null;
                                    }
                                    if (tLObject instanceof TL_account.sendChangePhoneCode) {
                                        if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                                            org.telegram.ui.ig0.q1(o2Var2, (String) objArr[0], null, false);
                                            return null;
                                        }
                                        if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                                            u0(o2Var2, null, LocaleController.getString(R.string.InvalidCode), null);
                                            return null;
                                        }
                                        if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                            u0(o2Var2, null, LocaleController.getString(R.string.CodeExpired), null);
                                            return null;
                                        }
                                        if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                            u0(o2Var2, null, LocaleController.getString(R.string.FloodWait), null);
                                            return null;
                                        }
                                        if (tL_error.text.startsWith("PHONE_NUMBER_OCCUPIED")) {
                                            u0(o2Var2, null, LocaleController.formatString("ChangePhoneNumberOccupied", R.string.ChangePhoneNumberOccupied, objArr[0]), null);
                                            return null;
                                        }
                                        if (tL_error.text.startsWith("PHONE_NUMBER_BANNED")) {
                                            org.telegram.ui.ig0.q1(o2Var2, (String) objArr[0], null, true);
                                            return null;
                                        }
                                        u0(o2Var2, null, LocaleController.getString(R.string.ErrorOccurred), null);
                                        return null;
                                    }
                                    if (tLObject instanceof TL_account.updateUsername) {
                                        String str7 = tL_error.text;
                                        str7.getClass();
                                        if (str7.equals("USERNAME_INVALID")) {
                                            u0(o2Var2, null, LocaleController.getString(R.string.UsernameInvalid), null);
                                            return null;
                                        }
                                        if (str7.equals("USERNAME_OCCUPIED")) {
                                            u0(o2Var2, null, LocaleController.getString(R.string.UsernameInUse), null);
                                            return null;
                                        }
                                        u0(o2Var2, null, LocaleController.getString(R.string.ErrorOccurred), null);
                                        return null;
                                    }
                                    if (tLObject instanceof TLRPC.TL_contacts_importContacts) {
                                        if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                            u0(o2Var2, null, LocaleController.getString(R.string.FloodWait), null);
                                            return null;
                                        }
                                        StringBuilder sb6 = new StringBuilder();
                                        org.telegram.ui.Cells.b1.o(R.string.ErrorOccurred, "\n", sb6);
                                        sb6.append(tL_error.text);
                                        u0(o2Var2, null, sb6.toString(), null);
                                        return null;
                                    }
                                    if ((tLObject instanceof TL_account.getPassword) || (tLObject instanceof TL_account.getTmpPassword)) {
                                        if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                                            w0(o2Var2, tL_error.text);
                                            return null;
                                        }
                                        int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                                        w0(o2Var2, LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                                        return null;
                                    }
                                    if (tLObject instanceof TLRPC.TL_payments_sendPaymentForm) {
                                        String str8 = tL_error.text;
                                        str8.getClass();
                                        if (str8.equals("BOT_PRECHECKOUT_FAILED")) {
                                            w0(o2Var2, LocaleController.getString(R.string.PaymentPrecheckoutFailed));
                                            return null;
                                        }
                                        if (str8.equals("PAYMENT_FAILED")) {
                                            w0(o2Var2, LocaleController.getString(R.string.PaymentFailed));
                                            return null;
                                        }
                                        w0(o2Var2, tL_error.text);
                                        return null;
                                    }
                                    if (tLObject instanceof TLRPC.TL_payments_validateRequestedInfo) {
                                        String str9 = tL_error.text;
                                        str9.getClass();
                                        if (str9.equals("SHIPPING_NOT_AVAILABLE")) {
                                            w0(o2Var2, LocaleController.getString(R.string.PaymentNoShippingMethod));
                                            return null;
                                        }
                                        w0(o2Var2, tL_error.text);
                                        return null;
                                    }
                                    if (tLObject instanceof TLRPC.TL_payments_assignPlayMarketTransaction) {
                                        StringBuilder sb7 = new StringBuilder();
                                        org.telegram.ui.Cells.b1.o(R.string.PaymentConfirmationError, "\n", sb7);
                                        sb7.append(tL_error.text);
                                        u0(o2Var2, null, sb7.toString(), null);
                                        return null;
                                    }
                                }
                            }
                        }
                    } else {
                        if (o2Var2 != null && tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                            if (o2Var2.getParentActivity() != null) {
                                o2Var2.showDialog(new sg.j0(5, i10, o2Var2.getParentActivity(), o2Var2, null));
                                return null;
                            }
                            if (z12 || (tLObject instanceof TLRPC.TL_channels_inviteToChannel)) {
                                o2Var2.presentFragment(new md1(0));
                                return null;
                            }
                            o2Var2.presentFragment(new md1(1));
                            return null;
                        }
                        if (o2Var2 != null) {
                            h0(tL_error, o2Var2, objArr.length > 0 ? ((Boolean) objArr[0]).booleanValue() : false, objArr.length > 1 ? ((Boolean) objArr[1]).booleanValue() : false, tLObject);
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

    public static boolean g(TextView textView, TextView textView2, long j10, long j11, int i10, qd0 qd0Var, qd0 qd0Var2, qd0 qd0Var3) {
        long j12;
        int i11;
        long j13;
        int i12;
        int i13;
        int i14;
        boolean z10;
        boolean z11;
        String formatPluralString;
        int value = qd0Var.getValue();
        int value2 = qd0Var2.getValue();
        int value3 = qd0Var3.getValue();
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
            i12 = (int) ChronoUnit.DAYS.between(Instant.ofEpochMilli(currentTimeMillis).atZone(ZoneId.systemDefault()).f(), Instant.ofEpochMilli(calendar.getTimeInMillis()).atZone(ZoneId.systemDefault()).f());
            j13 = calendar.getTimeInMillis();
            i13 = 23;
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
        qd0Var.setMinValue(0);
        if (j15 > 0) {
            qd0Var.setMaxValue(i12);
        }
        int value4 = qd0Var.getValue();
        qd0Var2.setMinValue(value4 == 0 ? i17 : 0);
        if (j15 > 0) {
            qd0Var2.setMaxValue(value4 == i12 ? i13 : 23);
        }
        int value5 = qd0Var2.getValue();
        qd0Var3.setMinValue((value4 == 0 && value5 == i17) ? i18 : 0);
        if (j15 > 0) {
            qd0Var3.setMaxValue((value4 == i12 && value5 == i13) ? i16 : 59);
        }
        int value6 = qd0Var3.getValue();
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

    public static void g0(Context context, org.telegram.ui.ActionBar.g6 g6Var, String str, TLRPC.WebPage webPage, final Utilities.Callback callback, dn dnVar) {
        Activity findActivity = AndroidUtilities.findActivity(context);
        final View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        final org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
        int i10 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        String string = LocaleController.getString(R.string.PollV2AddLinkTitle);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.R = string;
        c2Var.T = LocaleController.getString(R.string.PollV2AddLinkMessage);
        final f4 f4Var = new f4(context);
        f4Var.setTextSize(1, 16.0f);
        int i11 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.W(f4Var, i11, g6Var);
        org.telegram.ui.ActionBar.r6.F(f4Var, org.telegram.ui.ActionBar.k6.Xh, g6Var);
        f4Var.setHint(LocaleController.getString(R.string.PollV2AddLinkUrlHint));
        f4Var.setInputType(17);
        f4Var.setImeOptions(6);
        f4Var.setMaxLines(10);
        f4Var.setSingleLine(false);
        f4Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f));
        f4Var.setCursorWidth(1.5f);
        f4Var.i(org.telegram.ui.ActionBar.k6.q6, g6Var);
        if (str != null) {
            f4Var.setText(str);
            f4Var.setSelection(str.length());
        }
        f4Var.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.Components.h2
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i12, KeyEvent keyEvent) {
                if (i12 != 6) {
                    return false;
                }
                f4 f4Var2 = f4.this;
                String trim = f4Var2.getText().toString().trim();
                if (!(TextUtils.isEmpty(trim) ? false : f5.a.matcher(trim.trim()).matches())) {
                    AndroidUtilities.shakeView(f4Var2);
                    return true;
                }
                callback.run(trim);
                org.telegram.ui.ActionBar.c2 c2Var2 = c2VarArr[0];
                if (c2Var2 != null) {
                    c2Var2.dismiss();
                }
                View view = currentFocus;
                if (view != null) {
                    view.requestFocus();
                }
                return true;
            }
        });
        ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.k6.o1(0.06f, org.telegram.ui.ActionBar.k6.w0(i11, g6Var)));
        org.telegram.ui.ActionBar.n6 M = org.telegram.ui.ActionBar.r6.M(0.06f, i11);
        f4Var.setBackground(c02);
        org.telegram.ui.ActionBar.r6.k(f4Var, c02, M, null, g6Var);
        LinearLayout e = org.telegram.messenger.sl.e(context, 1);
        e.addView(f4Var, w7.z5.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
        int i12 = t91.f;
        if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
            t91 t91Var = new t91(context, g6Var);
            t91Var.setWebPage(webPage);
            e.addView(t91Var, w7.z5.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
        }
        alertDialog$Builder.c();
        alertDialog$Builder.o(e);
        c2Var.a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
        alertDialog$Builder.k(LocaleController.getString(R.string.Done), new m4.w0(29, f4Var, callback));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new e2(1));
        if (dnVar != null) {
            alertDialog$Builder.i(LocaleController.getString(R.string.Delete), new z0(4, dnVar));
        }
        c2VarArr[0] = c2Var;
        c2Var.j0 = false;
        c2Var.setOnDismissListener(new a1(f4Var, 2));
        c2VarArr[0].setOnShowListener(new i2(f4Var, i10));
        c2VarArr[0].show();
        TextView textView = (TextView) c2VarArr[0].d(-3);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.q7, null);
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
        N(context, chat.title, LocaleController.getString(R.string.SlowmodeSendError)).p();
        return true;
    }

    public static void h0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, boolean z11, TLObject tLObject) {
        AlertDialog$Builder alertDialog$Builder;
        org.telegram.ui.ActionBar.c2 c2Var;
        int i10;
        if (tL_error == null || tL_error.code == 406 || tL_error.text == null || o2Var == null || o2Var.getParentActivity() == null) {
            return;
        }
        alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        c2Var = alertDialog$Builder.a;
        c2Var.R = string;
        String str = tL_error.text;
        str.getClass();
        i10 = 0;
        switch (str) {
            case "CHANNELS_ADMIN_LOCATED_TOO_MUCH":
                c2Var.T = LocaleController.getString(R.string.LocatedChannelsTooMuch);
                break;
            case "CHANNELS_ADMIN_PUBLIC_TOO_MUCH":
                c2Var.T = LocaleController.getString(R.string.PublicChannelsTooMuch);
                break;
            case "USERS_TOO_FEW":
                c2Var.T = LocaleController.getString(R.string.CreateGroupError);
                break;
            case "USER_BLOCKED":
            case "USER_BOT":
            case "USER_ID_INVALID":
                if (!z10) {
                    c2Var.T = LocaleController.getString(R.string.GroupUserCantAdd);
                    break;
                } else {
                    c2Var.T = LocaleController.getString(R.string.ChannelUserCantAdd);
                    break;
                }
            case "USER_RESTRICTED":
                c2Var.T = LocaleController.getString(R.string.UserRestricted);
                break;
            case "PEER_FLOOD":
                c2Var.T = LocaleController.getString(R.string.NobodyLikesSpam2);
                alertDialog$Builder.h(LocaleController.getString(R.string.MoreInfo), new r2(i10, o2Var));
                break;
            case "BOTS_TOO_MUCH":
                if (!z10) {
                    c2Var.T = LocaleController.getString(R.string.GroupUserCantBot);
                    break;
                } else {
                    c2Var.T = LocaleController.getString(R.string.ChannelUserCantBot);
                    break;
                }
            case "USER_KICKED":
            case "CHAT_ADMIN_BAN_REQUIRED":
                if (!(tLObject instanceof TLRPC.TL_channels_inviteToChannel)) {
                    c2Var.T = LocaleController.getString(R.string.AddAdminErrorBlacklisted);
                    break;
                } else {
                    c2Var.T = LocaleController.getString(R.string.AddUserErrorBlacklisted);
                    break;
                }
            case "YOU_BLOCKED_USER":
                c2Var.T = LocaleController.getString(R.string.YouBlockedUser);
                break;
            case "USER_ADMIN_INVALID":
                c2Var.T = LocaleController.getString(R.string.AddBannedErrorAdmin);
                break;
            case "USERS_TOO_MUCH":
                if (!z10) {
                    c2Var.T = LocaleController.getString(R.string.GroupUserAddLimit);
                    break;
                } else {
                    c2Var.T = LocaleController.getString(R.string.ChannelUserAddLimit);
                    break;
                }
            case "ADMINS_TOO_MUCH":
                if (!z10) {
                    c2Var.T = LocaleController.getString(R.string.GroupUserCantAdmin);
                    break;
                } else {
                    c2Var.T = LocaleController.getString(R.string.ChannelUserCantAdmin);
                    break;
                }
            case "CHANNELS_TOO_MUCH":
                c2Var.R = LocaleController.getString(R.string.ChannelTooMuchTitle);
                if (!(tLObject instanceof TLRPC.TL_channels_createChannel)) {
                    c2Var.T = LocaleController.getString(R.string.ChannelTooMuchJoin);
                    break;
                } else {
                    c2Var.T = LocaleController.getString(R.string.ChannelTooMuch);
                    break;
                }
            case "USER_CHANNELS_TOO_MUCH":
                c2Var.R = LocaleController.getString(R.string.ChannelTooMuchTitle);
                c2Var.T = LocaleController.getString(R.string.UserChannelTooMuchJoin);
                break;
            case "USER_NOT_MUTUAL_CONTACT":
                if (!z10) {
                    c2Var.T = LocaleController.getString(R.string.GroupUserLeftError);
                    break;
                } else {
                    c2Var.T = LocaleController.getString(R.string.ChannelUserLeftError);
                    break;
                }
            case "CHAT_ADMIN_INVITE_REQUIRED":
                c2Var.T = LocaleController.getString(R.string.AddAdminErrorNotAMember);
                break;
            case "USER_PRIVACY_RESTRICTED":
                if (!z11) {
                    if (!z10) {
                        c2Var.T = LocaleController.getString(R.string.InviteToGroupError);
                        break;
                    } else {
                        c2Var.T = LocaleController.getString(R.string.InviteToChannelError);
                        break;
                    }
                } else {
                    c2Var.T = LocaleController.getString(R.string.InviteToCommunityError);
                    break;
                }
            case "USER_ALREADY_PARTICIPANT":
                c2Var.R = LocaleController.getString(R.string.VoipGroupVoiceChat);
                c2Var.T = LocaleController.getString(R.string.VoipGroupInviteAlreadyParticipant);
                break;
            default:
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.b1.o(R.string.ErrorOccurred, "\n", sb2);
                sb2.append(tL_error.text);
                c2Var.T = sb2.toString();
                break;
        }
        org.telegram.messenger.v0.o(R.string.OK, alertDialog$Builder, null);
    }

    public static org.telegram.ui.ActionBar.c2 i(Activity activity, b5 b5Var) {
        if (UserConfig.getActivatedAccountsCount() < 2) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        org.telegram.ui.ActionBar.p1 p1Var = alertDialog$Builder.a.N0;
        org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
        LinearLayout f7 = org.telegram.messenger.v0.f(activity, 1);
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).getCurrentUser() != null) {
                org.telegram.ui.Cells.k kVar = new org.telegram.ui.Cells.k(activity, false);
                kVar.f = i10;
                TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
                h9 h9Var = kVar.e;
                h9Var.m(i10, currentUser);
                kVar.a.l(ContactsController.formatName(currentUser.first_name, currentUser.last_name), false);
                w9 w9Var = kVar.c;
                w9Var.getImageReceiver().setCurrentAccount(i10);
                w9Var.e(currentUser, h9Var);
                kVar.d.setVisibility(4);
                kVar.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                kVar.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.M0(false));
                f7.addView(kVar, w7.z5.n(-1, 50));
                kVar.setOnClickListener(new ai.v0(c2VarArr, p1Var, b5Var, 16));
            }
        }
        alertDialog$Builder.a.R = LocaleController.getString(R.string.SelectAccount);
        alertDialog$Builder.o(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2VarArr[0] = c2Var;
        return c2Var;
    }

    public static org.telegram.ui.ActionBar.c2 i0(Activity activity, String str, CharSequence charSequence, CharSequence charSequence2, String str2, Utilities.Callback callback, org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        if (activity == null) {
            callback.run(Boolean.FALSE);
            return null;
        }
        int i10 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, g6Var);
        org.telegram.ui.Cells.z1[] z1VarArr = new org.telegram.ui.Cells.z1[1];
        boolean[] zArr = {false};
        z4 z4Var = new z4(activity);
        NotificationCenter.listenEmojiLoading(z4Var);
        org.telegram.ui.ActionBar.r6.W(z4Var, org.telegram.ui.ActionBar.k6.j5, g6Var);
        z4Var.setTextSize(1, 16.0f);
        z4Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        z4Var.setText(charSequence);
        a5 a5Var = new a5(activity, z1VarArr);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.G = 6;
        alertDialog$Builder.o(a5Var);
        TextView textView = new TextView(activity);
        org.telegram.messenger.v0.q(textView, org.telegram.ui.ActionBar.k6.E8, g6Var, 1, 20.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(str);
        a5Var.addView(textView, w7.z5.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 8.0f, 24.0f, 0.0f));
        a5Var.addView(z4Var, w7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 48.0f, 24.0f, 6.0f));
        if (!TextUtils.isEmpty(charSequence2)) {
            org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(activity, 1, g6Var);
            z1VarArr[0] = z1Var;
            int i11 = org.telegram.ui.ActionBar.k6.i6;
            org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i11, g6Var), 7, AndroidUtilities.dp(12.0f));
            org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i11);
            z1Var.setBackground(g02);
            org.telegram.ui.ActionBar.r6.k(z1Var, g02, null, O, g6Var);
            z1VarArr[0].setMultiline(true);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) z1VarArr[0].getCheckBoxView().getLayoutParams();
            layoutParams.topMargin = 0;
            layoutParams.gravity = (LocaleController.isRTL ? 5 : 3) | 16;
            z1VarArr[0].getCheckBoxView().setLayoutParams(layoutParams);
            z1VarArr[0].e(charSequence2, "", false, false, false);
            z1VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(4.0f) : 0, AndroidUtilities.dp(12.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f));
            a5Var.addView(z1VarArr[0], w7.z5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 0.0f));
            z1VarArr[0].setOnClickListener(new s0(5, zArr));
        }
        alertDialog$Builder.k(str2, new b3(i10, callback, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        if (z10) {
            c2Var.Z0 = true;
        }
        c2Var.show();
        return c2Var;
    }

    public static org.telegram.ui.ActionBar.c2 j(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.ApkRestricted);
        int i10 = R.raw.permission_request_apk;
        int i11 = org.telegram.ui.ActionBar.k6.L5;
        alertDialog$Builder.m(i10, 72, org.telegram.ui.ActionBar.k6.x0(null, i11, false), null);
        alertDialog$Builder.n(i11, null);
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
    public static void j0(org.telegram.ui.ActionBar.o2 o2Var, long j10, final TLRPC.User user, final TLRPC.Chat chat, final TLRPC.EncryptedChat encryptedChat, final boolean z10, TLRPC.ChatFull chatFull, final MessagesStorage.IntCallback intCallback, org.telegram.ui.ActionBar.g6 g6Var) {
        long j11;
        boolean z11;
        String string;
        final org.telegram.ui.Cells.z1[] z1VarArr;
        TextView textView;
        if (o2Var.getParentActivity() == null) {
            return;
        }
        final AccountInstance accountInstance = o2Var.getAccountInstance();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity(), 0, g6Var);
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(o2Var.getCurrentAccount());
        int i10 = 1;
        if (encryptedChat == null) {
            j11 = j10;
            if (!org.telegram.messenger.v0.v("dialog_bar_report", j11, notificationsSettings, false)) {
                z11 = false;
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                if (user == null) {
                    c2Var.R = LocaleController.formatString("BlockUserTitle", R.string.BlockUserTitle, UserObject.getFirstName(user));
                    c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserAlert", R.string.BlockUserAlert, UserObject.getFirstName(user)));
                    string = LocaleController.getString(R.string.BlockContact);
                    org.telegram.ui.Cells.z1[] z1VarArr2 = new org.telegram.ui.Cells.z1[2];
                    LinearLayout linearLayout = new LinearLayout(o2Var.getParentActivity());
                    linearLayout.setOrientation(1);
                    int i11 = 0;
                    for (int i12 = 2; i11 < i12; i12 = 2) {
                        if (i11 != 0 || z11) {
                            org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(o2Var.getParentActivity(), i10, g6Var);
                            z1VarArr2[i11] = z1Var;
                            z1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.M0(false));
                            z1VarArr2[i11].setTag(Integer.valueOf(i11));
                            if (i11 == 0) {
                                z1VarArr2[i11].e(LocaleController.getString(R.string.DeleteReportSpam), "", true, false, false);
                            } else {
                                z1VarArr2[i11].e(LocaleController.formatString("DeleteThisChat", R.string.DeleteThisChat, new Object[0]), "", true, false, false);
                            }
                            z1VarArr2[i11].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                            linearLayout.addView(z1VarArr2[i11], w7.z5.n(-1, -2));
                            z1VarArr2[i11].setOnClickListener(new b1(z1VarArr2, 1));
                        }
                        i11++;
                        i10 = 1;
                    }
                    alertDialog$Builder.o(linearLayout);
                    z1VarArr = z1VarArr2;
                } else {
                    if (chat == null || !z10) {
                        c2Var.R = LocaleController.getString(R.string.ReportSpamTitle);
                        if (!ChatObject.isChannel(chat) || chat.megagroup) {
                            c2Var.T = LocaleController.getString(R.string.ReportSpamAlertGroup);
                        } else {
                            c2Var.T = LocaleController.getString(R.string.ReportSpamAlertChannel);
                        }
                    } else {
                        c2Var.R = LocaleController.getString(R.string.ReportUnrelatedGroup);
                        if (chatFull != null) {
                            TLRPC.ChannelLocation channelLocation = chatFull.location;
                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("ReportUnrelatedGroupText", R.string.ReportUnrelatedGroupText, ((TLRPC.TL_channelLocation) channelLocation).address));
                            }
                        }
                        c2Var.T = LocaleController.getString(R.string.ReportUnrelatedGroupTextNoAddress);
                    }
                    string = LocaleController.getString(R.string.ReportChat);
                    z1VarArr = null;
                }
                final long j12 = j11;
                alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.Components.g3
                    @Override // org.telegram.ui.ActionBar.z1
                    public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i13) {
                        org.telegram.ui.Cells.z1 z1Var2;
                        TLRPC.User user2 = TLRPC.User.this;
                        AccountInstance accountInstance2 = accountInstance;
                        if (user2 != null) {
                            accountInstance2.getMessagesController().blockPeer(user2.id);
                        }
                        org.telegram.ui.Cells.z1[] z1VarArr3 = z1VarArr;
                        long j13 = j12;
                        TLRPC.Chat chat2 = chat;
                        if (z1VarArr3 == null || ((z1Var2 = z1VarArr3[0]) != null && z1Var2.b())) {
                            accountInstance2.getMessagesController().reportSpam(j13, user2, chat2, encryptedChat, chat2 != null && z10);
                        }
                        MessagesStorage.IntCallback intCallback2 = intCallback;
                        if (z1VarArr3 != null && !z1VarArr3[1].b()) {
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
                o2Var.showDialog(c2Var);
                textView = (TextView) c2Var.d(-1);
                if (textView == null) {
                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.q7, null);
                    return;
                }
                return;
            }
        } else {
            j11 = j10;
        }
        z11 = true;
        org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder.a;
        if (user == null) {
        }
        final long j122 = j11;
        alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.Components.g3
            @Override // org.telegram.ui.ActionBar.z1
            public final void g(org.telegram.ui.ActionBar.c2 c2Var22, int i13) {
                org.telegram.ui.Cells.z1 z1Var2;
                TLRPC.User user2 = TLRPC.User.this;
                AccountInstance accountInstance2 = accountInstance;
                if (user2 != null) {
                    accountInstance2.getMessagesController().blockPeer(user2.id);
                }
                org.telegram.ui.Cells.z1[] z1VarArr3 = z1VarArr;
                long j13 = j122;
                TLRPC.Chat chat2 = chat;
                if (z1VarArr3 == null || ((z1Var2 = z1VarArr3[0]) != null && z1Var2.b())) {
                    accountInstance2.getMessagesController().reportSpam(j13, user2, chat2, encryptedChat, chat2 != null && z10);
                }
                MessagesStorage.IntCallback intCallback2 = intCallback;
                if (z1VarArr3 != null && !z1VarArr3[1].b()) {
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
        o2Var.showDialog(c2Var2);
        textView = (TextView) c2Var2.d(-1);
        if (textView == null) {
        }
    }

    public static void k(Context context, org.telegram.ui.ActionBar.g6 g6Var, d5 d5Var) {
        if (context == null) {
            return;
        }
        boolean z10 = false;
        int i10 = org.telegram.ui.ActionBar.k6.j5;
        int e = g6Var != null ? g6Var.e(i10) : org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.k6.h5;
        int e7 = g6Var != null ? g6Var.e(i11) : org.telegram.ui.ActionBar.k6.x0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.k6.Ji;
        if (g6Var != null) {
            g6Var.e(i12);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i12, false);
        }
        int i13 = org.telegram.ui.ActionBar.k6.Ni;
        if (g6Var != null) {
            g6Var.e(i13);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.k6.E8;
        if (g6Var != null) {
            g6Var.e(i14);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.k6.G8;
        if (g6Var != null) {
            g6Var.e(i15);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.k6.i6;
        if (g6Var != null) {
            g6Var.e(i16);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.k6.Sh;
        int e10 = g6Var != null ? g6Var.e(i17) : org.telegram.ui.ActionBar.k6.x0(null, i17, false);
        int i18 = org.telegram.ui.ActionBar.k6.Oh;
        int e11 = g6Var != null ? g6Var.e(i18) : org.telegram.ui.ActionBar.k6.x0(null, i18, false);
        int e12 = g6Var != null ? g6Var.e(org.telegram.ui.ActionBar.k6.Qh) : org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Qh, false);
        org.telegram.ui.ActionBar.b3 b3Var = new org.telegram.ui.ActionBar.b3(context, g6Var);
        b3Var.a();
        int[] iArr = {0, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        i4 i4Var = new i4(context, g6Var, iArr);
        i4Var.setMinValue(0);
        i4Var.setMaxValue(16);
        i4Var.setTextColor(e);
        i4Var.setValue(0);
        i4Var.setFormatter(new f1(1, iArr));
        j4 j4Var = new j4(context, i4Var, 0);
        j4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        j4Var.addView(frameLayout, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.AutoDeleteAfteTitle));
        textView.setTextColor(e);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, w7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new di.d(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        j4Var.addView(linearLayout, w7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        org.telegram.ui.Cells.t3 t3Var = new org.telegram.ui.Cells.t3(context, 1 == true ? 1 : 0, 1 == true ? 1 : 0, z10, 1);
        linearLayout.addView(i4Var, w7.z5.l(1.0f, 0, 270));
        t3Var.setPadding(0, 0, 0, 0);
        t3Var.setGravity(17);
        t3Var.setTextColor(e10);
        t3Var.setTextSize(AndroidUtilities.dp(14.0f));
        t3Var.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(8.0f);
        t3Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, e11, e12, e12));
        j4Var.addView(t3Var, w7.z5.t(-1, 48, 83, 16, 15, 16, 16));
        t3Var.setText(LocaleController.getString(R.string.DisableAutoDeleteTimer));
        i4Var.setOnValueChangedListener(new s(t3Var, 10));
        t3Var.setOnClickListener(new ci.b4(iArr, i4Var, d5Var, b3Var, 8));
        b3Var.b(j4Var);
        org.telegram.ui.ActionBar.h3 h3Var = b3Var.a;
        h3Var.show();
        h3Var.setBackgroundColor(e7);
        h3Var.fixNavigationBar(e7);
    }

    public static void k0(org.telegram.ui.sn snVar, MessageObject messageObject, long j10, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.kg kgVar) {
        if (snVar.getParentActivity() == null || messageObject == null) {
            return;
        }
        AccountInstance accountInstance = snVar.getAccountInstance();
        TLRPC.User user = j10 > 0 ? accountInstance.getMessagesController().getUser(Long.valueOf(j10)) : null;
        TLRPC.Chat chat = j10 < 0 ? accountInstance.getMessagesController().getChat(Long.valueOf(-j10)) : null;
        if (user == null && chat == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(snVar.getParentActivity(), 0, g6Var);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.R0 = false;
        c2Var.N = new a1(kgVar, 0);
        c2Var.R = LocaleController.getString(R.string.BlockUser);
        if (user != null) {
            c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserReplyAlert", R.string.BlockUserReplyAlert, UserObject.getFirstName(user)));
        } else {
            c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserReplyAlert", R.string.BlockUserReplyAlert, chat.title));
        }
        LinearLayout linearLayout = new LinearLayout(snVar.getParentActivity());
        linearLayout.setOrientation(1);
        org.telegram.ui.Cells.z1[] z1VarArr = {new org.telegram.ui.Cells.z1(snVar.getParentActivity(), 1, g6Var)};
        z1VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.k6.M0(false));
        z1VarArr[0].setTag(0);
        z1VarArr[0].e(LocaleController.getString(R.string.DeleteReportSpam), "", true, false, false);
        z1VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
        linearLayout.addView(z1VarArr[0], w7.z5.n(-1, -2));
        z1VarArr[0].setOnClickListener(new b1(z1VarArr, 0));
        alertDialog$Builder.o(linearLayout);
        alertDialog$Builder.k(LocaleController.getString(R.string.BlockAndDeleteReplies), new c1(user, accountInstance, snVar, chat, messageObject, z1VarArr, g6Var));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        snVar.showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.q7, null);
        }
    }

    public static AlertDialog$Builder l(Activity activity, TLRPC.User user, Runnable runnable, org.telegram.ui.ActionBar.g6 g6Var) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, g6Var);
        String readRes = AndroidUtilities.readRes(org.telegram.ui.ActionBar.k6.C0().q() ? R.raw.permission_map_dark : R.raw.permission_map);
        String readRes2 = AndroidUtilities.readRes(org.telegram.ui.ActionBar.k6.C0().q() ? R.raw.permission_pin_dark : R.raw.permission_pin);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new r4());
        View view = new View(activity);
        view.setBackground(SvgHelper.getDrawable(readRes));
        frameLayout.addView(view, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view2 = new View(activity);
        view2.setBackground(SvgHelper.getDrawable(readRes2));
        frameLayout.addView(view2, w7.z5.d(60, 82.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
        w9 w9Var = new w9(activity);
        w9Var.setRoundRadius(AndroidUtilities.dp(26.0f));
        w9Var.e(user, new h9(0, user));
        frameLayout.addView(w9Var, w7.z5.d(52, 52.0f, 17, 0.0f, 0.0f, 0.0f, 11.0f));
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.V = frameLayout;
        c2Var.Q0 = 0.37820512f;
        alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionBackgroundLocation));
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new j1(activity, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new z0(1, runnable));
        return alertDialog$Builder;
    }

    public static void l0(Context context, int i10, long j10) {
        org.telegram.ui.ActionBar.h3 j11 = org.telegram.messenger.sl.j(1, context, null, false);
        LinearLayout e = org.telegram.messenger.sl.e(context, 1);
        e.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        e.addView(frameLayout, w7.z5.t(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.story_link);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, w7.z5.e(-1, -1, 17));
        int dp = AndroidUtilities.dp(80.0f);
        int i11 = org.telegram.ui.ActionBar.k6.Oh;
        ShapeDrawable K = org.telegram.ui.ActionBar.k6.K(dp, org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i11);
        frameLayout2.setBackground(K);
        org.telegram.ui.ActionBar.r6.k(frameLayout2, K, O, null, null);
        frameLayout.addView(frameLayout2, w7.z5.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.messenger.v0.q(textView, i12, null, 1, 20.0f);
        org.telegram.messenger.sl.m(R.string.CallForbiddenInviteLinkTitle, textView, 17);
        TextView f7 = org.telegram.messenger.sl.f(e, textView, w7.z5.k(32.0f, 16.0f, 32.0f, 8.0f, -1, -2), context);
        org.telegram.ui.ActionBar.r6.W(f7, i12, null);
        f7.setTextSize(1, 14.0f);
        f7.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CallForbiddenInviteLinkText, DialogObject.getName(i10, j10))));
        f7.setGravity(17);
        e.addView(f7, w7.z5.k(32.0f, 0.0f, 32.0f, 18.0f, -1, -2));
        ei.d dVar = new ei.d(context, null, true);
        dVar.i(LocaleController.getString(R.string.CallForbiddenInviteLinkButton), false, true);
        e.addView(dVar, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
        j11.customView = e;
        dVar.setOnClickListener(new org.telegram.ui.qd(i10, dVar, j11, j10));
        j11.fixNavigationBar();
        j11.show();
    }

    public static org.telegram.ui.ActionBar.b3 m(Context context, String str, String str2, TL_account.TL_birthday tL_birthday, Utilities.Callback callback, Runnable runnable, boolean z10, boolean z11, org.telegram.ui.ActionBar.g6 g6Var) {
        if (context == null) {
            return null;
        }
        org.telegram.ui.ActionBar.b3 b3Var = new org.telegram.ui.ActionBar.b3(context, g6Var);
        b3Var.a();
        qd0 qd0Var = new qd0(context, g6Var);
        qd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        qd0Var.setItemCount(5);
        qd0 qd0Var2 = new qd0(context, g6Var);
        qd0Var2.setItemCount(5);
        qd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        qd0 qd0Var3 = new qd0(context, g6Var);
        qd0Var3.setItemCount(5);
        qd0Var3.setTextOffset(-AndroidUtilities.dp(24.0f));
        a4 a4Var = new a4(context, qd0Var, qd0Var2, qd0Var3);
        a4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        a4Var.addView(frameLayout, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        org.telegram.messenger.v0.q(textView, org.telegram.ui.ActionBar.k6.j5, g6Var, 1, 20.0f);
        frameLayout.addView(textView, w7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new di.d(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        a4Var.addView(linearLayout, w7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        int i10 = calendar.get(1) - 149;
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i11 = calendar.get(5);
        int i12 = calendar.get(2);
        int i13 = calendar.get(1);
        int i14 = i13 + 1;
        x2 x2Var = new x2(qd0Var3, i14, qd0Var, qd0Var2, i13, i12, i11);
        System.currentTimeMillis();
        b4 b4Var = new b4(context);
        linearLayout.addView(qd0Var, w7.z5.l(0.25f, 0, 270));
        qd0Var.setMinValue(1);
        qd0Var.setMaxValue(31);
        qd0Var.setWrapSelectorWheel(false);
        qd0Var.setFormatter(new e2(12));
        s sVar = new s(x2Var, 9);
        qd0Var.setOnScrollListener(sVar);
        qd0Var2.setMinValue(0);
        qd0Var2.setMaxValue(11);
        qd0Var2.setWrapSelectorWheel(false);
        linearLayout.addView(qd0Var2, w7.z5.l(0.5f, 0, 270));
        qd0Var2.setFormatter(new e2(13));
        qd0Var2.setOnScrollListener(sVar);
        qd0Var3.setMinValue(i10);
        qd0Var3.setMaxValue(i14);
        qd0Var3.setWrapSelectorWheel(false);
        qd0Var3.setFormatter(new i2.v(i14, 9));
        linearLayout.addView(qd0Var3, w7.z5.l(0.25f, 0, 270));
        qd0Var3.setOnScrollListener(sVar);
        if (tL_birthday != null) {
            qd0Var.setValue(tL_birthday.day);
            qd0Var2.setValue(tL_birthday.month - 1);
            if ((tL_birthday.flags & 1) != 0) {
                qd0Var3.setValue(tL_birthday.year);
            } else {
                qd0Var3.setValue(i14);
            }
        } else {
            qd0Var.setValue(calendar.get(5));
            qd0Var2.setValue(calendar.get(2));
            qd0Var3.setValue(i14);
        }
        x2Var.run();
        if (runnable != null) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            y90 y90Var = new y90(context, null);
            y90Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            y90Var.setTextSize(1, 13.0f);
            org.telegram.ui.ActionBar.r6.W(y90Var, org.telegram.ui.ActionBar.k6.q5, g6Var);
            org.telegram.ui.ActionBar.r6.I(y90Var, org.telegram.ui.ActionBar.k6.gc, g6Var);
            y90Var.setGravity(17);
            frameLayout2.addView(y90Var, w7.z5.e(-2, -2, 17));
            a4Var.addView(frameLayout2, w7.z5.n(-1, -2));
            int i15 = UserConfig.selectedAccount;
            d2 d2Var = new d2(i15, y90Var, 1);
            d2Var.run();
            NotificationCenter.getInstance(i15).listen(frameLayout2, NotificationCenter.privacyRulesUpdated, new y2(d2Var, 0));
            ContactsController.getInstance(i15).loadPrivacySettings();
        }
        if (z10) {
            ei.d dVar = new ei.d(context, g6Var, false);
            dVar.i(LocaleController.getString(R.string.DateOfBirthHideYear), false, true);
            dVar.setOnClickListener(new ai.ia(qd0Var3, i14, x2Var, 6));
            a4Var.addView(dVar, w7.z5.t(-1, 48, 83, 16, 15, 16, 4));
        }
        b4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        b4Var.setGravity(17);
        org.telegram.ui.ActionBar.r6.W(b4Var, org.telegram.ui.ActionBar.k6.Sh, g6Var);
        b4Var.setTextSize(1, 14.0f);
        b4Var.setTypeface(AndroidUtilities.bold());
        b4Var.setText(str2);
        int dp = AndroidUtilities.dp(24.0f);
        int i16 = org.telegram.ui.ActionBar.k6.Oh;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i16, g6Var);
        int i17 = org.telegram.ui.ActionBar.k6.Qh;
        int w03 = org.telegram.ui.ActionBar.k6.w0(i17, g6Var);
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, w02, w03, w03);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i16);
        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i17);
        b4Var.setBackground(j02);
        org.telegram.ui.ActionBar.r6.k(b4Var, j02, O, O2, g6Var);
        w7.b6.b(b4Var, 0.02f, 1.2f);
        a4Var.addView(b4Var, w7.z5.t(-1, 48, 83, 16, z10 ? 0 : 15, 16, z11 ? 0 : 16));
        b4Var.setOnClickListener(new ai.ob(qd0Var, qd0Var2, qd0Var3, i14, b3Var, callback));
        if (z11) {
            ei.d dVar2 = new ei.d(context, g6Var, false);
            dVar2.i(LocaleController.getString(R.string.BirthdayRemove), false, true);
            dVar2.f();
            dVar2.setOnClickListener(new org.telegram.ui.ActionBar.s1(24, b3Var, callback));
            a4Var.addView(dVar2, w7.z5.t(-1, 48, 83, 16, 4, 16, 16));
        }
        b3Var.b(a4Var);
        return b3Var;
    }

    public static void m0(org.telegram.ui.ActionBar.o2 o2Var, String str) {
        if (str == null || !str.startsWith("FLOOD_WAIT") || o2Var == null || o2Var.getParentActivity() == null) {
            return;
        }
        int intValue = Utilities.parseInt((CharSequence) str).intValue();
        String formatPluralString = intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.R = string;
        c2Var.T = LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        o2Var.showDialog(c2Var, true, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void n(org.telegram.ui.ActionBar.o2 o2Var, AtomicBoolean atomicBoolean, TLRPC.User user, Runnable runnable) {
        org.telegram.ui.Cells.z1[] z1VarArr;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.Cells.z1 z1Var;
        if (o2Var == null) {
            return;
        }
        Context context = o2Var.getContext();
        org.telegram.ui.Cells.z1[] z1VarArr2 = new org.telegram.ui.Cells.z1[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        x4 x4Var = new x4(context, null);
        NotificationCenter.listenEmojiLoading(x4Var);
        org.telegram.ui.ActionBar.r6.W(x4Var, org.telegram.ui.ActionBar.k6.j5, null);
        org.telegram.ui.ActionBar.r6.I(x4Var, org.telegram.ui.ActionBar.k6.gc, null);
        x4Var.setTextSize(1, 16.0f);
        x4Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        y4 y4Var = new y4(context, z1VarArr2);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.G = 6;
        alertDialog$Builder.o(y4Var);
        h9 h9Var = new h9((org.telegram.ui.ActionBar.g6) null);
        h9Var.u(AndroidUtilities.dp(18.0f));
        w9 w9Var = new w9(context);
        w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        y4Var.addView(w9Var, w7.z5.d(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        org.telegram.ui.ActionBar.r6.Z(n5Var, org.telegram.ui.ActionBar.k6.E8, null);
        n5Var.setTextSize(20);
        n5Var.setTypeface(AndroidUtilities.bold());
        n5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        n5Var.setEllipsizeByGradient(true);
        n5Var.l(user.first_name, false);
        if (user.scam) {
            n5Var.i(org.telegram.ui.ActionBar.k6.g1);
        } else if (user.fake) {
            n5Var.i(org.telegram.ui.ActionBar.k6.h1);
        } else if (user.verified) {
            Drawable mutate = context.getResources().getDrawable(R.drawable.verified_area).mutate();
            int i10 = org.telegram.ui.ActionBar.k6.z9;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.r6.z(n5Var, mutate, i10, null, mode);
            Drawable mutate2 = context.getResources().getDrawable(R.drawable.verified_check).mutate();
            z1VarArr = z1VarArr2;
            g6Var = null;
            org.telegram.ui.ActionBar.r6.z(n5Var, mutate2, org.telegram.ui.ActionBar.k6.A9, null, mode);
            n5Var.i(new yq(mutate, mutate2));
            TextView textView = new TextView(context);
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.m5, g6Var);
            int i11 = 1;
            org.telegram.messenger.sl.u(textView, 1, 14.0f, 1, 1);
            textView.setSingleLine(true);
            textView.setGravity((!LocaleController.isRTL ? 5 : 3) | 16);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setOnClickListener(new t0(user, o2Var, alertDialog$Builder, i11));
            SpannableString valueOf = SpannableString.valueOf(LocaleController.getString(R.string.MoreAboutThisBot) + "  ");
            xq xqVar = new xq(R.drawable.attach_arrow_right, 0);
            xqVar.setTopOffset(1);
            xqVar.setSize(AndroidUtilities.dp(10.0f));
            valueOf.setSpan(xqVar, valueOf.length() - 1, valueOf.length(), 33);
            textView.setText(valueOf);
            boolean z10 = LocaleController.isRTL;
            y4Var.addView(n5Var, w7.z5.d(-1, -2.0f, (!z10 ? 5 : 3) | 48, !z10 ? 21 : 76, 0.0f, !z10 ? 76 : 21, 0.0f));
            boolean z11 = LocaleController.isRTL;
            y4Var.addView(textView, w7.z5.d(-1, -2.0f, (!z11 ? 5 : 3) | 48, !z11 ? 21 : 76, 24.0f, z11 ? 76 : 21, 0.0f));
            y4Var.addView(x4Var, w7.z5.d(-2, -2.0f, (!LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
            atomicBoolean.set(true);
            z1Var = new org.telegram.ui.Cells.z1(context, 1, o2Var.getResourceProvider());
            z1VarArr[0] = z1Var;
            if (!z1Var.H) {
                org.telegram.ui.Cells.x1 x1Var = z1Var.c;
                x1Var.setLines(3);
                x1Var.setMaxLines(3);
                x1Var.setSingleLine(false);
            }
            z1VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.k6.M0(false));
            z1VarArr[0].e(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.OpenUrlOption2, UserObject.getUserName(user))), "", true, false, false);
            z1VarArr[0].setPadding(!LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, !LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
            z1VarArr[0].c(true, false);
            y4Var.addView(z1VarArr[0], w7.z5.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
            z1VarArr[0].setOnClickListener(new f0(atomicBoolean, 1));
            if (UserObject.isReplyUser(user)) {
                h9Var.p = 1.0f;
                h9Var.m(o2Var.getCurrentAccount(), user);
                w9Var.e(user, h9Var);
            } else {
                h9Var.p = 0.8f;
                h9Var.g(12);
                w9Var.h(null, null, h9Var, user);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.Start), new z0(3, runnable));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            o2Var.showDialog(c2Var);
            x4Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebViewStartPermission2), new k1(1, context, c2Var)));
        }
        z1VarArr = z1VarArr2;
        g6Var = null;
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.m5, g6Var);
        int i112 = 1;
        org.telegram.messenger.sl.u(textView2, 1, 14.0f, 1, 1);
        textView2.setSingleLine(true);
        textView2.setGravity((!LocaleController.isRTL ? 5 : 3) | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setOnClickListener(new t0(user, o2Var, alertDialog$Builder, i112));
        SpannableString valueOf2 = SpannableString.valueOf(LocaleController.getString(R.string.MoreAboutThisBot) + "  ");
        xq xqVar2 = new xq(R.drawable.attach_arrow_right, 0);
        xqVar2.setTopOffset(1);
        xqVar2.setSize(AndroidUtilities.dp(10.0f));
        valueOf2.setSpan(xqVar2, valueOf2.length() - 1, valueOf2.length(), 33);
        textView2.setText(valueOf2);
        boolean z102 = LocaleController.isRTL;
        y4Var.addView(n5Var, w7.z5.d(-1, -2.0f, (!z102 ? 5 : 3) | 48, !z102 ? 21 : 76, 0.0f, !z102 ? 76 : 21, 0.0f));
        boolean z112 = LocaleController.isRTL;
        y4Var.addView(textView2, w7.z5.d(-1, -2.0f, (!z112 ? 5 : 3) | 48, !z112 ? 21 : 76, 24.0f, z112 ? 76 : 21, 0.0f));
        y4Var.addView(x4Var, w7.z5.d(-2, -2.0f, (!LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
        atomicBoolean.set(true);
        z1Var = new org.telegram.ui.Cells.z1(context, 1, o2Var.getResourceProvider());
        z1VarArr[0] = z1Var;
        if (!z1Var.H) {
        }
        z1VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.k6.M0(false));
        z1VarArr[0].e(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.OpenUrlOption2, UserObject.getUserName(user))), "", true, false, false);
        z1VarArr[0].setPadding(!LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, !LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
        z1VarArr[0].c(true, false);
        y4Var.addView(z1VarArr[0], w7.z5.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        z1VarArr[0].setOnClickListener(new f0(atomicBoolean, 1));
        if (UserObject.isReplyUser(user)) {
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Start), new z0(3, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        o2Var.showDialog(c2Var);
        x4Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebViewStartPermission2), new k1(1, context, c2Var)));
    }

    public static void n0(Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, Runnable runnable) {
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(j10);
        LinearLayout e = org.telegram.messenger.sl.e(context, 1);
        e.addView(new ai.f6(context, tL_starGiftUnique, userOrChat), w7.z5.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.j5, g6Var);
        textView.setTextSize(1, 16.0f);
        org.telegram.messenger.sl.r(R.string.GiftThemesSetInReuseInfo, new Object[]{DialogObject.getDialogTitle(userOrChat)}, textView);
        e.addView(textView, w7.z5.t(-1, -2, 48, 24, 0, 24, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        alertDialog$Builder.o(e);
        alertDialog$Builder.k(LocaleController.getString(R.string.GiftThemesSetInReuseConfirm), new z0(2, runnable));
        i2.o1.s(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void o(org.telegram.ui.ActionBar.o2 o2Var, TLRPC.User user, Runnable runnable, Runnable runnable2) {
        Context context = o2Var.getContext();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        s4 s4Var = new s4(context, null);
        NotificationCenter.listenEmojiLoading(s4Var);
        org.telegram.ui.ActionBar.r6.W(s4Var, org.telegram.ui.ActionBar.k6.j5, null);
        org.telegram.ui.ActionBar.r6.I(s4Var, org.telegram.ui.ActionBar.k6.gc, null);
        s4Var.setTextSize(1, 16.0f);
        s4Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        FrameLayout frameLayout = new FrameLayout(context);
        alertDialog$Builder.a.G = 6;
        alertDialog$Builder.o(frameLayout);
        h9 h9Var = new h9((org.telegram.ui.ActionBar.g6) null);
        h9Var.u(AndroidUtilities.dp(18.0f));
        w9 w9Var = new w9(context);
        w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        frameLayout.addView(w9Var, w7.z5.d(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        org.telegram.ui.ActionBar.r6.Z(n5Var, org.telegram.ui.ActionBar.k6.E8, null);
        n5Var.setTextSize(20);
        n5Var.setTypeface(AndroidUtilities.bold());
        n5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        n5Var.setEllipsizeByGradient(true);
        n5Var.l(user.first_name, false);
        if (user.scam) {
            n5Var.i(org.telegram.ui.ActionBar.k6.g1);
        } else if (user.fake) {
            n5Var.i(org.telegram.ui.ActionBar.k6.h1);
        } else if (user.verified) {
            Drawable mutate = context.getResources().getDrawable(R.drawable.verified_area).mutate();
            int i10 = org.telegram.ui.ActionBar.k6.z9;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.r6.z(n5Var, mutate, i10, null, mode);
            Drawable mutate2 = context.getResources().getDrawable(R.drawable.verified_check).mutate();
            org.telegram.ui.ActionBar.r6.z(n5Var, mutate2, org.telegram.ui.ActionBar.k6.A9, null, mode);
            n5Var.i(new yq(mutate, mutate2));
        }
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.m5, null);
        org.telegram.messenger.sl.u(textView, 1, 14.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new t0(user, o2Var, alertDialog$Builder, 0));
        SpannableString valueOf = SpannableString.valueOf(LocaleController.getString(R.string.MoreAboutThisBot) + "  ");
        xq xqVar = new xq(R.drawable.attach_arrow_right, 0);
        xqVar.setTopOffset(1);
        xqVar.setSize(AndroidUtilities.dp(10.0f));
        valueOf.setSpan(xqVar, valueOf.length() - 1, valueOf.length(), 33);
        textView.setText(valueOf);
        boolean z10 = LocaleController.isRTL;
        frameLayout.addView(n5Var, w7.z5.d(-1, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 21 : 76, 0.0f, z10 ? 76 : 21, 0.0f));
        boolean z11 = LocaleController.isRTL;
        frameLayout.addView(textView, w7.z5.d(-1, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 21 : 76, 24.0f, z11 ? 76 : 21, 0.0f));
        frameLayout.addView(s4Var, w7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
        if (UserObject.isReplyUser(user)) {
            h9Var.p = 0.8f;
            h9Var.g(12);
            w9Var.h(null, null, h9Var, user);
        } else {
            h9Var.p = 1.0f;
            h9Var.m(o2Var.getCurrentAccount(), user);
            w9Var.e(user, h9Var);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Start), new z0(0, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        DialogInterface.OnDismissListener r0Var = new r0(3, runnable2);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        o2Var.showDialog(c2Var, false, r0Var);
        s4Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebViewStartPermission2), new k1(0, context, c2Var)));
    }

    public static void o0(Context context, org.telegram.ui.ActionBar.g6 g6Var, String str, boolean z10, final Utilities.Callback2 callback2) {
        if (AndroidUtilities.isContextSafe(context)) {
            final org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
            alertDialog$Builder.a.R = LocaleController.getString(R.string.OpenUrlTitle);
            TextView textView = new TextView(context);
            textView.setText(str);
            textView.setTextSize(1, 14.0f);
            int i10 = org.telegram.ui.ActionBar.k6.j5;
            org.telegram.ui.ActionBar.r6.W(textView, i10, g6Var);
            textView.setGravity(17);
            textView.setMaxLines(5);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
            ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.k6.o1(0.06f, org.telegram.ui.ActionBar.k6.w0(i10, g6Var)));
            org.telegram.ui.ActionBar.n6 M = org.telegram.ui.ActionBar.r6.M(0.06f, i10);
            textView.setBackground(c02);
            org.telegram.ui.ActionBar.r6.k(textView, c02, M, null, g6Var);
            final org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(context, 1, g6Var);
            z1Var.setMultiline(true);
            z1Var.getTextView().getLayoutParams().width = -1;
            z1Var.getTextView().setSingleLine(false);
            z1Var.getTextView().setMaxLines(3);
            z1Var.getTextView().setTextSize(1, 16.0f);
            z1Var.e(LocaleController.getString(z10 ? R.string.BrowserAlwaysOpenExternal : R.string.BrowserAlwaysOpenInApp), "", false, false, false);
            z1Var.setOnClickListener(new h1(z1Var, 0));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.addView(textView, w7.z5.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
            linearLayout.addView(z1Var, w7.z5.t(-1, -2, 3, 8, 6, 8, 4));
            alertDialog$Builder.o(linearLayout);
            alertDialog$Builder.a.a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
            final int i11 = 0;
            alertDialog$Builder.k(LocaleController.getString(R.string.Open), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.Components.i1
                @Override // org.telegram.ui.ActionBar.z1
                public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i12) {
                    switch (i11) {
                        case 0:
                            callback2.run(Boolean.TRUE, Boolean.valueOf(z1Var.b()));
                            org.telegram.ui.ActionBar.c2 c2Var2 = c2VarArr[0];
                            if (c2Var2 != null) {
                                c2Var2.dismiss();
                                break;
                            }
                            break;
                        default:
                            callback2.run(Boolean.FALSE, Boolean.valueOf(z1Var.b()));
                            org.telegram.ui.ActionBar.c2 c2Var3 = c2VarArr[0];
                            if (c2Var3 != null) {
                                c2Var3.dismiss();
                                break;
                            }
                            break;
                    }
                }
            });
            final int i12 = 1;
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.Components.i1
                @Override // org.telegram.ui.ActionBar.z1
                public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i122) {
                    switch (i12) {
                        case 0:
                            callback2.run(Boolean.TRUE, Boolean.valueOf(z1Var.b()));
                            org.telegram.ui.ActionBar.c2 c2Var2 = c2VarArr[0];
                            if (c2Var2 != null) {
                                c2Var2.dismiss();
                                break;
                            }
                            break;
                        default:
                            callback2.run(Boolean.FALSE, Boolean.valueOf(z1Var.b()));
                            org.telegram.ui.ActionBar.c2 c2Var3 = c2VarArr[0];
                            if (c2Var3 != null) {
                                c2Var3.dismiss();
                                break;
                            }
                            break;
                    }
                }
            });
            c2VarArr[0] = alertDialog$Builder.p();
        }
    }

    public static org.telegram.ui.ActionBar.b3 p(Activity activity, MessagesStorage.IntCallback intCallback, org.telegram.ui.ActionBar.g6 g6Var) {
        if (activity == null) {
            return null;
        }
        org.telegram.ui.ActionBar.b3 b3Var = new org.telegram.ui.ActionBar.b3(activity, g6Var);
        b3Var.a();
        qd0 qd0Var = new qd0(activity, g6Var);
        qd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        qd0Var.setItemCount(5);
        qd0 qd0Var2 = new qd0(activity, g6Var);
        qd0Var2.setItemCount(5);
        qd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        qd0 qd0Var3 = new qd0(activity, g6Var);
        qd0Var3.setItemCount(5);
        qd0Var3.setTextOffset(-AndroidUtilities.dp(24.0f));
        o4 o4Var = new o4(activity, qd0Var, qd0Var2, qd0Var3);
        o4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        o4Var.addView(frameLayout, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(activity);
        textView.setText(LocaleController.getString(R.string.ChooseDate));
        org.telegram.messenger.v0.q(textView, org.telegram.ui.ActionBar.k6.j5, g6Var, 1, 20.0f);
        frameLayout.addView(textView, w7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new di.d(10));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        o4Var.addView(linearLayout, w7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        System.currentTimeMillis();
        p4 p4Var = new p4(activity);
        linearLayout.addView(qd0Var, w7.z5.l(0.25f, 0, 270));
        qd0Var.setMinValue(1);
        qd0Var.setMaxValue(31);
        qd0Var.setWrapSelectorWheel(false);
        qd0Var.setFormatter(new org.telegram.ui.tr(10));
        l0 l0Var = new l0(qd0Var, qd0Var2, qd0Var3, 0);
        qd0Var.setOnValueChangedListener(l0Var);
        qd0Var2.setMinValue(0);
        qd0Var2.setMaxValue(11);
        qd0Var2.setWrapSelectorWheel(false);
        linearLayout.addView(qd0Var2, w7.z5.l(0.5f, 0, 270));
        qd0Var2.setFormatter(new org.telegram.ui.tr(11));
        qd0Var2.setOnValueChangedListener(l0Var);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(1375315200000L);
        int i10 = calendar.get(1);
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i11 = calendar.get(1);
        qd0Var3.setMinValue(i10);
        qd0Var3.setMaxValue(i11);
        qd0Var3.setWrapSelectorWheel(false);
        qd0Var3.setFormatter(new org.telegram.ui.tr(12));
        linearLayout.addView(qd0Var3, w7.z5.l(0.25f, 0, 270));
        qd0Var3.setOnValueChangedListener(l0Var);
        qd0Var.setValue(31);
        qd0Var2.setValue(12);
        qd0Var3.setValue(i11);
        b(qd0Var, qd0Var2, qd0Var3);
        p4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        p4Var.setGravity(17);
        org.telegram.ui.ActionBar.r6.W(p4Var, org.telegram.ui.ActionBar.k6.Sh, g6Var);
        p4Var.setTextSize(1, 14.0f);
        p4Var.setTypeface(AndroidUtilities.bold());
        p4Var.setText(LocaleController.getString(R.string.JumpToDate));
        int dp = AndroidUtilities.dp(8.0f);
        int i12 = org.telegram.ui.ActionBar.k6.Oh;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i12, g6Var);
        int i13 = org.telegram.ui.ActionBar.k6.Qh;
        int w03 = org.telegram.ui.ActionBar.k6.w0(i13, g6Var);
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, w02, w03, w03);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i12);
        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i13);
        p4Var.setBackground(j02);
        org.telegram.ui.ActionBar.r6.k(p4Var, j02, O, O2, g6Var);
        o4Var.addView(p4Var, w7.z5.t(-1, 48, 83, 16, 15, 16, 16));
        p4Var.setOnClickListener(new m0(qd0Var, qd0Var2, qd0Var3, calendar, intCallback, b3Var, 0));
        b3Var.b(o4Var);
        return b3Var;
    }

    public static void p0(Context context, String str, boolean z10, boolean z11, boolean z12, boolean z13, long j10, pf.c cVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.g6 g6Var) {
        String u10;
        LinearLayout e;
        if (AndroidUtilities.isContextSafe(context)) {
            String scheme = str == null ? null : Uri.parse(str).getScheme();
            if (pf.d.e(Uri.parse(str), false, null) || !z12 || "mailto".equalsIgnoreCase(scheme)) {
                pf.d.q(context, Uri.parse(str), j10 == 0, z11, z13 && Uri.parse(str).getPath().matches("^/\\w*/[^\\d]*(?:\\?startapp=.*?|)$"), cVar, null, false, true, false);
                return;
            }
            if (z10) {
                try {
                    Uri parse = Uri.parse(str);
                    u10 = pf.d.u(parse, null, null, pf.d.a(parse.getHost()), null);
                } catch (Exception e7) {
                    FileLog.e((Throwable) e7, false);
                }
                q2 q2Var = new q2(context, str, j10, z11, cVar);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
                String string = LocaleController.getString(R.string.OpenUrlTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                c2Var.R = string;
                TextView textView = new TextView(context);
                textView.setText(u10);
                textView.setTextSize(1, 14.0f);
                int i10 = org.telegram.ui.ActionBar.k6.j5;
                org.telegram.ui.ActionBar.r6.W(textView, i10, g6Var);
                textView.setGravity(17);
                textView.setMaxLines(5);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
                ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.k6.o1(0.06f, org.telegram.ui.ActionBar.k6.w0(i10, g6Var)));
                org.telegram.ui.ActionBar.n6 M = org.telegram.ui.ActionBar.r6.M(0.06f, i10);
                textView.setBackground(c02);
                org.telegram.ui.ActionBar.r6.k(textView, c02, M, null, g6Var);
                e = org.telegram.messenger.sl.e(context, 1);
                e.addView(textView, w7.z5.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
                int i11 = t91.f;
                if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
                    t91 t91Var = new t91(context, g6Var);
                    t91Var.setWebPage(webPage);
                    e.addView(t91Var, w7.z5.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
                }
                alertDialog$Builder.o(e);
                c2Var.a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
                alertDialog$Builder.k(LocaleController.getString(R.string.Open), new s(q2Var, 8));
                i2.o1.s(R.string.Cancel, alertDialog$Builder, null);
            }
            u10 = str;
            q2 q2Var2 = new q2(context, str, j10, z11, cVar);
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context, 0, g6Var);
            String string2 = LocaleController.getString(R.string.OpenUrlTitle);
            org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
            c2Var2.R = string2;
            TextView textView2 = new TextView(context);
            textView2.setText(u10);
            textView2.setTextSize(1, 14.0f);
            int i102 = org.telegram.ui.ActionBar.k6.j5;
            org.telegram.ui.ActionBar.r6.W(textView2, i102, g6Var);
            textView2.setGravity(17);
            textView2.setMaxLines(5);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
            ShapeDrawable c022 = org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.k6.o1(0.06f, org.telegram.ui.ActionBar.k6.w0(i102, g6Var)));
            org.telegram.ui.ActionBar.n6 M2 = org.telegram.ui.ActionBar.r6.M(0.06f, i102);
            textView2.setBackground(c022);
            org.telegram.ui.ActionBar.r6.k(textView2, c022, M2, null, g6Var);
            e = org.telegram.messenger.sl.e(context, 1);
            e.addView(textView2, w7.z5.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
            int i112 = t91.f;
            if (webPage != null) {
                t91 t91Var2 = new t91(context, g6Var);
                t91Var2.setWebPage(webPage);
                e.addView(t91Var2, w7.z5.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
            }
            alertDialog$Builder2.o(e);
            c2Var2.a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Open), new s(q2Var2, 8));
            i2.o1.s(R.string.Cancel, alertDialog$Builder2, null);
        }
    }

    public static void q(org.telegram.ui.ActionBar.o2 o2Var, TLRPC.User user, boolean z10) {
        String string;
        String formatString;
        if (o2Var.getParentActivity() == null || user == null || UserObject.isDeleted(user) || UserConfig.getInstance(o2Var.getCurrentAccount()).getClientUserId() == user.id) {
            return;
        }
        o2Var.getCurrentAccount();
        Activity parentActivity = o2Var.getParentActivity();
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        if (z10) {
            string = LocaleController.getString(R.string.VideoCallAlertTitle);
            formatString = LocaleController.formatString("VideoCallAlert", R.string.VideoCallAlert, UserObject.getUserName(user));
        } else {
            string = LocaleController.getString(R.string.CallAlertTitle);
            formatString = LocaleController.formatString("CallAlert", R.string.CallAlert, UserObject.getUserName(user));
        }
        n3 n3Var = new n3(parentActivity);
        NotificationCenter.listenEmojiLoading(n3Var);
        org.telegram.ui.ActionBar.r6.W(n3Var, org.telegram.ui.ActionBar.k6.j5, null);
        n3Var.setTextSize(1, 16.0f);
        n3Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        n3Var.setText(AndroidUtilities.replaceTags(formatString));
        h9 h9Var = new h9((org.telegram.ui.ActionBar.g6) null);
        h9Var.u(AndroidUtilities.dp(12.0f));
        h9Var.p = 1.0f;
        h9Var.m(o2Var.getCurrentAccount(), user);
        w9 w9Var = new w9(parentActivity);
        w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        w9Var.e(user, h9Var);
        frameLayout.addView(w9Var, w7.z5.d(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        TextView textView = new TextView(parentActivity);
        org.telegram.messenger.v0.q(textView, org.telegram.ui.ActionBar.k6.E8, null, 1, 20.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(string);
        boolean z11 = LocaleController.isRTL;
        frameLayout.addView(textView, w7.z5.d(-1, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 21 : 76, 11.0f, z11 ? 76 : 21, 0.0f));
        frameLayout.addView(n3Var, w7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
        alertDialog$Builder.o(frameLayout);
        alertDialog$Builder.k(LocaleController.getString(R.string.Call), new ai.e4(o2Var, user, z10, 6));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        o2Var.showDialog(alertDialog$Builder.a);
    }

    public static void q0(org.telegram.ui.ActionBar.o2 o2Var, String str, boolean z10, boolean z11) {
        r0(o2Var, str, z10, true, z11, false, null, null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x017c, code lost:
    
        if (org.telegram.messenger.ChatObject.isMonoForum(r35) == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0194, code lost:
    
        r9 = new org.telegram.ui.Cells.z1(r6, 1, r38);
        r11[0] = r9;
        r9.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.M0(false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01a4, code lost:
    
        if (r35 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01a6, code lost:
    
        r11[0].e(org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.DeleteMessagesOptionAlsoChat), "", false, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01d7, code lost:
    
        r2 = r11[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01dd, code lost:
    
        if (org.telegram.messenger.LocaleController.isRTL == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01df, code lost:
    
        r4 = org.telegram.messenger.AndroidUtilities.dp(16.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01ea, code lost:
    
        if (org.telegram.messenger.LocaleController.isRTL == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01ec, code lost:
    
        r5 = org.telegram.messenger.AndroidUtilities.dp(8.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01f7, code lost:
    
        r2.setPadding(r4, 0, r5, 0);
        r15.addView(r11[0], w7.z5.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        r11[0].c(false, false);
        r11[0].setOnClickListener(new org.telegram.ui.Components.s0(4, r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01f2, code lost:
    
        r5 = org.telegram.messenger.AndroidUtilities.dp(16.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01e4, code lost:
    
        r4 = org.telegram.messenger.AndroidUtilities.dp(8.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01ba, code lost:
    
        r11[0].e(org.telegram.messenger.LocaleController.formatString("DeleteMessagesOptionAlso", org.telegram.messenger.R.string.DeleteMessagesOptionAlso, org.telegram.messenger.UserObject.getFirstName(r34)), "", false, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0192, code lost:
    
        if (org.telegram.messenger.ChatObject.isMonoForum(r35) == false) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void r(org.telegram.ui.ActionBar.o2 o2Var, int i10, TLRPC.User user, TLRPC.Chat chat, boolean z10, MessagesStorage.BooleanCallback booleanCallback, org.telegram.ui.ActionBar.g6 g6Var) {
        boolean z11;
        if (o2Var == null || o2Var.getParentActivity() == null) {
            return;
        }
        if (user == null && chat == null) {
            return;
        }
        int currentAccount = o2Var.getCurrentAccount();
        Activity parentActivity = o2Var.getParentActivity();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, g6Var);
        long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
        org.telegram.ui.Cells.z1[] z1VarArr = new org.telegram.ui.Cells.z1[1];
        l3 l3Var = new l3(parentActivity);
        NotificationCenter.listenEmojiLoading(l3Var);
        org.telegram.ui.ActionBar.r6.W(l3Var, org.telegram.ui.ActionBar.k6.j5, null);
        l3Var.setTextSize(1, 16.0f);
        l3Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        m3 m3Var = new m3(parentActivity, z1VarArr);
        alertDialog$Builder.o(m3Var);
        TextView textView = new TextView(parentActivity);
        org.telegram.messenger.v0.q(textView, org.telegram.ui.ActionBar.k6.E8, null, 1, 20.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        m3Var.addView(textView, w7.z5.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 11.0f, 24.0f, 0.0f));
        m3Var.addView(l3Var, w7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 48.0f, 24.0f, 18.0f));
        if (i10 == -1) {
            textView.setText(LocaleController.formatString("ClearHistory", R.string.ClearHistory, new Object[0]));
            if (user != null) {
                l3Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureClearHistoryWithUser", R.string.AreYouSureClearHistoryWithUser, UserObject.getUserName(user))));
            } else if (z10) {
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    l3Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureClearHistoryWithChannel", R.string.AreYouSureClearHistoryWithChannel, chat.title)));
                    z11 = false;
                } else {
                    l3Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureClearHistoryWithChat", R.string.AreYouSureClearHistoryWithChat, chat.title)));
                }
            } else if (chat.megagroup) {
                l3Var.setText(LocaleController.getString(R.string.AreYouSureClearHistoryGroup));
            } else {
                l3Var.setText(LocaleController.getString(R.string.AreYouSureClearHistoryChannel));
            }
            z11 = false;
        } else {
            z11 = false;
            textView.setText(LocaleController.formatPluralString("DeleteDays", i10, new Object[0]));
            l3Var.setText(LocaleController.getString(R.string.DeleteHistoryByDaysMessage));
        }
        boolean[] zArr = new boolean[1];
        zArr[z11 ? 1 : 0] = z11;
        if (chat != null && z10 && ChatObject.isPublic(chat)) {
            zArr[z11 ? 1 : 0] = true;
        }
        int i11 = 4;
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
        CharSequence string = LocaleController.getString(R.string.Delete);
        if (chat != null && z10 && ChatObject.isPublic(chat) && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            string = LocaleController.getString(R.string.ClearForAll);
        }
        alertDialog$Builder.k(string, new p2(i11, booleanCallback, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        o2Var.showDialog(c2Var);
        TextView textView2 = (TextView) c2Var.d(-1);
        if (textView2 != null) {
            org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.q7, null);
        }
    }

    public static void r0(org.telegram.ui.ActionBar.o2 o2Var, String str, boolean z10, boolean z11, boolean z12, boolean z13, pf.c cVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.g6 g6Var) {
        if (o2Var == null || o2Var.getParentActivity() == null) {
            return;
        }
        p0(o2Var.getParentActivity(), str, z10, z11, z12, z13, o2Var instanceof org.telegram.ui.sn ? ((org.telegram.ui.sn) o2Var).r8 : 0L, cVar, webPage, g6Var);
    }

    public static void s(org.telegram.ui.ActionBar.o2 o2Var, boolean z10, TLRPC.Chat chat, TLRPC.User user, boolean z11, boolean z12, boolean z13, boolean z14, MessagesStorage.BooleanCallback booleanCallback) {
        t(o2Var, z10, false, chat, user, z11, z12, z13, z14, booleanCallback, o2Var != null ? o2Var.getResourceProvider() : null);
    }

    public static void s0(Activity activity, int i10, Runnable runnable, boolean z10, org.telegram.ui.ActionBar.g6 g6Var) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i11 = MessagesController.getInstance(i10).availableMapProviders;
        if ((i11 & 1) != 0) {
            org.telegram.ui.Cells.b1.v(R.string.MapPreviewProviderTelegram, 0, arrayList, arrayList2);
        }
        if ((i11 & 2) != 0) {
            org.telegram.ui.Cells.b1.v(R.string.MapPreviewProviderGoogle, 1, arrayList, arrayList2);
        }
        if ((i11 & 4) != 0) {
            org.telegram.ui.Cells.b1.v(R.string.MapPreviewProviderYandex, 3, arrayList, arrayList2);
        }
        arrayList.add(LocaleController.getString(R.string.MapPreviewProviderNobody));
        arrayList2.add(2);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, g6Var);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.MapPreviewProviderTitle);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            org.telegram.ui.Cells.l6 l6Var = new org.telegram.ui.Cells.l6(activity, g6Var);
            l6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            l6Var.setTag(Integer.valueOf(i12));
            a(l6Var, org.telegram.ui.ActionBar.k6.g7, org.telegram.ui.ActionBar.k6.E5, null);
            l6Var.b((CharSequence) arrayList.get(i12), SharedConfig.mapPreviewType == ((Integer) arrayList2.get(i12)).intValue());
            int i13 = org.telegram.ui.ActionBar.k6.i6;
            org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.x0(null, i13, false), 2, -1);
            org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i13);
            l6Var.setBackground(g02);
            org.telegram.ui.ActionBar.r6.k(l6Var, g02, null, O, null);
            linearLayout.addView(l6Var);
            l6Var.setOnClickListener(new ai.v0(arrayList2, runnable, alertDialog$Builder, 17));
        }
        if (!z10) {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        org.telegram.ui.ActionBar.c2 p5 = alertDialog$Builder.p();
        if (z10) {
            p5.setCanceledOnTouchOutside(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x05e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void t(final org.telegram.ui.ActionBar.o2 o2Var, final boolean z10, final boolean z11, TLRPC.Chat chat, final TLRPC.User user, final boolean z12, final boolean z13, boolean z14, final boolean z15, final MessagesStorage.BooleanCallback booleanCallback, final org.telegram.ui.ActionBar.g6 g6Var) {
        long j10;
        boolean z16;
        org.telegram.ui.Cells.z1[] z1VarArr;
        h3 h3Var;
        TLRPC.Chat chat2;
        TLRPC.Chat chat3;
        boolean z17;
        ArrayList arrayList;
        float f7;
        float f10;
        final TLRPC.Chat chat4;
        boolean z18;
        org.telegram.ui.ActionBar.c2 c2Var;
        boolean z19;
        float f11;
        org.telegram.ui.Cells.z1[] z1VarArr2;
        boolean z20;
        Object obj;
        CharSequence string;
        TextView textView;
        if (o2Var == null || o2Var.getParentActivity() == null) {
            return;
        }
        if (chat == null && user == null) {
            return;
        }
        final int currentAccount = o2Var.getCurrentAccount();
        final Activity parentActivity = o2Var.getParentActivity();
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, g6Var);
        long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
        org.telegram.ui.Cells.z1[] z1VarArr3 = new org.telegram.ui.Cells.z1[1];
        h3 h3Var2 = new h3(parentActivity);
        NotificationCenter.listenEmojiLoading(h3Var2);
        org.telegram.ui.ActionBar.r6.W(h3Var2, org.telegram.ui.ActionBar.k6.j5, null);
        h3Var2.setTextSize(1, 16.0f);
        h3Var2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        if (!z15 && ChatObject.isChannel(chat) && ChatObject.isPublic(chat)) {
            j10 = clientUserId;
            z16 = true;
        } else {
            j10 = clientUserId;
            z16 = false;
        }
        i3 i3Var = new i3(parentActivity, z1VarArr3);
        org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder.a;
        c2Var2.G = 6;
        alertDialog$Builder.o(i3Var);
        h9 h9Var = new h9((org.telegram.ui.ActionBar.g6) null);
        h9Var.u(AndroidUtilities.dp(18.0f));
        w9 w9Var = new w9(parentActivity);
        w9Var.setRoundRadius(AndroidUtilities.dp(15.0f));
        i3Var.addView(w9Var, w7.z5.d(30, 30.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        q6 q6Var = new q6(parentActivity, false, false, false);
        org.telegram.ui.ActionBar.r6.a0(q6Var, org.telegram.ui.ActionBar.k6.E8, null);
        q6Var.setTextSize(AndroidUtilities.dp(20.0f));
        q6Var.setTypeface(AndroidUtilities.bold());
        q6Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        q6Var.setEllipsizeByGradient(true);
        if (z10) {
            if (z16) {
                q6Var.setText(LocaleController.getString(R.string.ClearHistoryCache));
            } else {
                q6Var.setText(LocaleController.getString(R.string.ClearHistory));
            }
        } else if (chat == null) {
            q6Var.setText(LocaleController.getString(R.string.DeleteChatUser));
        } else if (ChatObject.isCommunity(chat)) {
            q6Var.setText(LocaleController.getString(R.string.CommunityDelete));
        } else if (!ChatObject.isChannel(chat)) {
            q6Var.setText(LocaleController.getString(R.string.LeaveMega));
        } else if (chat.monoforum) {
            q6Var.setText(LocaleController.getString(R.string.LeaveConversationMenu));
        } else if (chat.megagroup) {
            q6Var.setText(LocaleController.getString(R.string.LeaveMega));
        } else {
            q6Var.setText(LocaleController.getString(R.string.LeaveChannel));
        }
        boolean z21 = LocaleController.isRTL;
        i3Var.addView(q6Var, w7.z5.d(-1, 24.0f, (z21 ? 5 : 3) | 48, z21 ? 22 : 65, 7.66f, z21 ? 65 : 22, 0.0f));
        i3Var.addView(h3Var2, w7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 49.0f, 24.0f, 1.0f));
        if (ChatObject.isMonoForum(chat)) {
            z1VarArr = z1VarArr3;
            h3Var = h3Var2;
            chat2 = o2Var.getMessagesController().getMonoForumLinkedChat(chat.id);
        } else {
            z1VarArr = z1VarArr3;
            h3Var = h3Var2;
            chat2 = null;
        }
        boolean z22 = !z12 && user != null && (user != null && !user.bot && (user.id > j10 ? 1 : (user.id == j10 ? 0 : -1)) != 0 && MessagesController.getInstance(currentAccount).canRevokePmInbox) && (user != null ? MessagesController.getInstance(currentAccount).revokeTimePmLimit : MessagesController.getInstance(currentAccount).revokeTimeLimit) == Integer.MAX_VALUE;
        h3 h3Var3 = h3Var;
        final boolean[] zArr = new boolean[1];
        if (user != null) {
            chat3 = chat2;
            z17 = z16;
            arrayList = (ArrayList) MessagesController.getInstance(currentAccount).dialogMessage.f(user.id);
        } else {
            chat3 = chat2;
            z17 = z16;
            arrayList = null;
        }
        boolean z23 = (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((MessageObject) arrayList.get(0)).messageOwner == null || (!(((MessageObject) arrayList.get(0)).messageOwner.action instanceof TLRPC.TL_messageActionUserJoined) && !(((MessageObject) arrayList.get(0)).messageOwner.action instanceof TLRPC.TL_messageActionContactSignUp))) ? false : true;
        if (user != null) {
            f10 = 10.0f;
            if (user.bot) {
                f7 = 8.0f;
                if (user.id != UserObject.VERIFY) {
                    org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(parentActivity, 1, g6Var);
                    z1VarArr[0] = z1Var;
                    z1Var.setBackground(org.telegram.ui.ActionBar.k6.M0(false));
                    z1VarArr[0].e(LocaleController.getString(R.string.BlockBot), "", false, false, false);
                    z1VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f), LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), AndroidUtilities.dp(10.0f));
                    org.telegram.ui.Cells.z1 z1Var2 = z1VarArr[0];
                    zArr[0] = true;
                    z1Var2.c(true, false);
                    z1VarArr[0].setMultiline(true);
                    i3Var.addView(z1VarArr[0], w7.z5.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                    z1VarArr[0].setOnClickListener(new s0(3, zArr));
                    chat4 = chat;
                    c2Var = c2Var2;
                    z19 = false;
                    if (user != null) {
                        obj = null;
                        h9Var.k(o2Var.getCurrentAccount(), chat3 != null ? chat3 : chat4);
                        w9Var.e(chat3 != null ? chat3 : chat4, h9Var);
                    } else if (UserObject.isReplyUser(user)) {
                        h9Var.p = 0.8f;
                        h9Var.g(12);
                        obj = null;
                        w9Var.h(null, null, h9Var, user);
                    } else {
                        obj = null;
                        if (user.id == j10) {
                            h9Var.p = 0.8f;
                            h9Var.g(1);
                            w9Var.h(null, null, h9Var, user);
                        } else {
                            h9Var.p = 1.0f;
                            h9Var.m(o2Var.getCurrentAccount(), user);
                            w9Var.e(user, h9Var);
                        }
                    }
                    if (z11) {
                        if (!z10) {
                            TLRPC.Chat chat5 = chat3;
                            if (user != null) {
                                if (z12) {
                                    h3Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteThisChatWithSecretUser, UserObject.getUserName(user))));
                                } else if (user.id == j10) {
                                    h3Var3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AreYouSureDeleteThisChatSavedMessages)));
                                } else if (!user.bot || user.support) {
                                    h3Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteThisChatWithUser, UserObject.getUserName(user))));
                                } else {
                                    h3Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteThisChatWithBotWithCheckmark, UserObject.getUserName(user))));
                                }
                            } else if (ChatObject.isChannel(chat4)) {
                                String formatString = chat5 != null ? LocaleController.formatString(R.string.MonoforumTitle, chat5.title) : chat4.title;
                                if (chat4.megagroup) {
                                    h3Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.MegaLeaveAlertWithName, formatString)));
                                } else {
                                    h3Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.ChannelLeaveAlertWithName, formatString)));
                                }
                            } else {
                                h3Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteAndExitName, chat4.title)));
                            }
                        } else if (user == null) {
                            String formatString2 = chat3 != null ? LocaleController.formatString(R.string.MonoforumTitle, chat3.title) : chat4.title;
                            if (!ChatObject.isChannel(chat4) || (chat4.megagroup && !ChatObject.isPublic(chat4))) {
                                h3Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithChat, formatString2)));
                            } else if (chat4.megagroup) {
                                h3Var3.setText(LocaleController.getString(R.string.AreYouSureClearHistoryGroup));
                            } else {
                                h3Var3.setText(LocaleController.getString(R.string.AreYouSureClearHistoryChannel));
                            }
                        } else if (z12) {
                            h3Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithSecretUser, UserObject.getUserName(user))));
                        } else if (user.id == j10) {
                            h3Var3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AreYouSureClearHistorySavedMessages)));
                        } else {
                            h3Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithUser, UserObject.getUserName(user))));
                        }
                    } else if (UserObject.isUserSelf(user)) {
                        h3Var3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DeleteAllMessagesSavedAlert)));
                    } else if (chat4 == null || !ChatObject.isChannelAndNotMegaGroup(chat4)) {
                        h3Var3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DeleteAllMessagesAlert)));
                    } else {
                        h3Var3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DeleteAllMessagesChannelAlert)));
                    }
                    if (!z11) {
                        string = LocaleController.getString(R.string.DeleteAll);
                    } else if (z10) {
                        string = z17 ? LocaleController.getString(R.string.ClearHistoryCache) : LocaleController.getString(R.string.ClearForMe);
                    } else if (z19 && zArr[0]) {
                        string = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat4) ? R.string.ChannelDelete : R.string.DeleteMega);
                    } else {
                        string = ChatObject.isChannel(chat4) ? chat4.monoforum ? LocaleController.getString(R.string.LeaveConversationMenu) : chat4.megagroup ? LocaleController.getString(R.string.LeaveMegaMenu) : LocaleController.getString(R.string.LeaveChannelMenu) : LocaleController.getString(R.string.DeleteChatUser);
                    }
                    CharSequence charSequence = string;
                    org.telegram.ui.ActionBar.c2 c2Var3 = c2Var;
                    final boolean z24 = z17;
                    alertDialog$Builder.k(charSequence, new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.Components.v2
                        @Override // org.telegram.ui.ActionBar.z1
                        public final void g(org.telegram.ui.ActionBar.c2 c2Var4, int i10) {
                            final boolean[] zArr2;
                            boolean z25 = z24;
                            final boolean z26 = z11;
                            final boolean[] zArr3 = zArr;
                            final MessagesStorage.BooleanCallback booleanCallback2 = booleanCallback;
                            boolean z27 = true;
                            if (z25 || z26 || z12) {
                                zArr2 = zArr3;
                            } else {
                                final TLRPC.User user2 = user;
                                boolean isUserSelf = UserObject.isUserSelf(user2);
                                final org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                                final boolean z28 = z10;
                                final TLRPC.Chat chat6 = chat4;
                                final boolean z29 = z13;
                                final boolean z30 = z15;
                                final org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
                                if (isUserSelf) {
                                    f5.t(o2Var2, z28, true, chat6, user2, false, z29, zArr3[0], z30, booleanCallback2, g6Var2);
                                    return;
                                }
                                if (user2 != null && zArr3[0]) {
                                    MessagesStorage.getInstance(o2Var2.getCurrentAccount()).getMessagesCount(user2.id, new MessagesStorage.IntCallback() { // from class: org.telegram.ui.Components.o1
                                        @Override // org.telegram.messenger.MessagesStorage.IntCallback
                                        public final void run(int i11) {
                                            boolean[] zArr4 = zArr3;
                                            MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                            if (i11 >= 50) {
                                                f5.t(org.telegram.ui.ActionBar.o2.this, z28, true, chat6, user2, false, z29, zArr4[0], z30, booleanCallback3, g6Var2);
                                            } else if (booleanCallback3 != null) {
                                                booleanCallback3.run(zArr4[0]);
                                            }
                                        }
                                    });
                                    return;
                                }
                                zArr2 = zArr3;
                                if (ChatObject.isChannel(chat6) && chat6.creator && !zArr2[0]) {
                                    final pf.c h = alertDialog$Builder.a.h(-1, true, true);
                                    h.d();
                                    TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                                    tL_channels_getFutureCreatorAfterLeave.channel = MessagesController.getInputChannel(chat6);
                                    final int i11 = currentAccount;
                                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                                    org.telegram.messenger.a aVar = new org.telegram.messenger.a();
                                    final Context context = parentActivity;
                                    connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, aVar, new Utilities.Callback2() { // from class: org.telegram.ui.Components.p1
                                        @Override // org.telegram.messenger.Utilities.Callback2
                                        public final void run(Object obj2, Object obj3) {
                                            TLRPC.User user3 = (TLRPC.User) obj2;
                                            pf.c.this.c(false);
                                            TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                            MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                            if (user4 == null) {
                                                booleanCallback3.run(z26 || zArr2[0]);
                                                return;
                                            }
                                            Context context2 = context;
                                            TLRPC.Chat chat7 = chat6;
                                            ai.wb wbVar = new ai.wb(context2, chat7, user4, i11, booleanCallback3, g6Var2);
                                            t1 t1Var = new t1(booleanCallback3, 0);
                                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var2;
                                            if (o2Var3 == null || o2Var3.getParentActivity() == null || chat7 == null) {
                                                return;
                                            }
                                            Context context3 = o2Var3.getContext();
                                            TLRPC.User currentUser = UserConfig.getInstance(o2Var3.getCurrentAccount()).getCurrentUser();
                                            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat7);
                                            FrameLayout frameLayout = new FrameLayout(context3);
                                            frameLayout.setClipToPadding(false);
                                            frameLayout.setClipChildren(false);
                                            w9 w9Var2 = new w9(context3);
                                            h9 h9Var2 = new h9((org.telegram.ui.ActionBar.g6) null);
                                            h9Var2.r(currentUser);
                                            w9Var2.setRoundRadius(AndroidUtilities.dp(30.0f));
                                            w9Var2.e(currentUser, h9Var2);
                                            frameLayout.addView(w9Var2, w7.z5.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                            ImageView imageView = new ImageView(context3);
                                            imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                            org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.d7, o2Var3.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                                            frameLayout.addView(imageView, w7.z5.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                            j3 j3Var = new j3(context3);
                                            h9 h9Var3 = new h9((org.telegram.ui.ActionBar.g6) null);
                                            h9Var3.r(user4);
                                            j3Var.setRoundRadius(AndroidUtilities.dp(30.0f));
                                            j3Var.e(user4, h9Var3);
                                            frameLayout.addView(j3Var, w7.z5.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                            w9 w9Var3 = new w9(context3);
                                            h9 h9Var4 = new h9((org.telegram.ui.ActionBar.g6) null);
                                            h9Var4.q(chat7);
                                            w9Var3.setRoundRadius(AndroidUtilities.dp(12.0f));
                                            w9Var3.e(chat7, h9Var4);
                                            frameLayout.addView(w9Var3, w7.z5.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                            org.telegram.ui.ActionBar.c2 c2Var5 = alertDialog$Builder2.a;
                                            c2Var5.Q0 = -1.0f;
                                            c2Var5.V = frameLayout;
                                            c2Var5.R = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannelTitle : R.string.LeaveGroupTitle);
                                            c2Var5.T = AndroidUtilities.replaceTags(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.LeaveChannelNewOwnerText : R.string.LeaveGroupNewOwnerText, UserObject.getUserName(user4), chat7.title));
                                            alertDialog$Builder2.h(LocaleController.getString(R.string.AppointNewOwner), new s(wbVar, 4));
                                            alertDialog$Builder2.i(LocaleController.getString(R.string.Cancel), null);
                                            alertDialog$Builder2.k(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannel : R.string.LeaveMegaMenu), new s(t1Var, 5));
                                            c2Var5.show();
                                            View d = c2Var5.d(-1);
                                            if (d instanceof TextView) {
                                                org.telegram.ui.ActionBar.r6.W((TextView) d, org.telegram.ui.ActionBar.k6.q7, null);
                                            }
                                        }
                                    });
                                    return;
                                }
                                booleanCallback2 = booleanCallback2;
                            }
                            if (!z26 && !zArr2[0]) {
                                z27 = false;
                            }
                            booleanCallback2.run(z27);
                        }
                    });
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    o2Var.showDialog(c2Var3);
                    textView = (TextView) c2Var3.d(-1);
                    if (textView == null) {
                        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.q7, null);
                        return;
                    }
                    return;
                }
            } else {
                f7 = 8.0f;
            }
        } else {
            f7 = 8.0f;
            f10 = 10.0f;
        }
        if (z11 || (((!z12 || z10) && !z22) || UserObject.isDeleted(user) || z23)) {
            if (!z13 || z10 || chat == null) {
                chat4 = chat;
            } else {
                chat4 = chat;
                if (chat4.creator) {
                    z18 = true;
                    if (!z18) {
                        c2Var = c2Var2;
                        z19 = z18;
                        if (user != null) {
                        }
                        if (z11) {
                        }
                        if (!z11) {
                        }
                        CharSequence charSequence2 = string;
                        org.telegram.ui.ActionBar.c2 c2Var32 = c2Var;
                        final boolean z242 = z17;
                        alertDialog$Builder.k(charSequence2, new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.Components.v2
                            @Override // org.telegram.ui.ActionBar.z1
                            public final void g(org.telegram.ui.ActionBar.c2 c2Var4, int i10) {
                                final boolean[] zArr2;
                                boolean z25 = z242;
                                final boolean z26 = z11;
                                final boolean[] zArr3 = zArr;
                                final MessagesStorage.BooleanCallback booleanCallback2 = booleanCallback;
                                boolean z27 = true;
                                if (z25 || z26 || z12) {
                                    zArr2 = zArr3;
                                } else {
                                    final TLRPC.User user2 = user;
                                    boolean isUserSelf = UserObject.isUserSelf(user2);
                                    final org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                                    final boolean z28 = z10;
                                    final TLRPC.Chat chat6 = chat4;
                                    final boolean z29 = z13;
                                    final boolean z30 = z15;
                                    final org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
                                    if (isUserSelf) {
                                        f5.t(o2Var2, z28, true, chat6, user2, false, z29, zArr3[0], z30, booleanCallback2, g6Var2);
                                        return;
                                    }
                                    if (user2 != null && zArr3[0]) {
                                        MessagesStorage.getInstance(o2Var2.getCurrentAccount()).getMessagesCount(user2.id, new MessagesStorage.IntCallback() { // from class: org.telegram.ui.Components.o1
                                            @Override // org.telegram.messenger.MessagesStorage.IntCallback
                                            public final void run(int i11) {
                                                boolean[] zArr4 = zArr3;
                                                MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                                if (i11 >= 50) {
                                                    f5.t(org.telegram.ui.ActionBar.o2.this, z28, true, chat6, user2, false, z29, zArr4[0], z30, booleanCallback3, g6Var2);
                                                } else if (booleanCallback3 != null) {
                                                    booleanCallback3.run(zArr4[0]);
                                                }
                                            }
                                        });
                                        return;
                                    }
                                    zArr2 = zArr3;
                                    if (ChatObject.isChannel(chat6) && chat6.creator && !zArr2[0]) {
                                        final pf.c h = alertDialog$Builder.a.h(-1, true, true);
                                        h.d();
                                        TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                                        tL_channels_getFutureCreatorAfterLeave.channel = MessagesController.getInputChannel(chat6);
                                        final int i11 = currentAccount;
                                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                                        org.telegram.messenger.a aVar = new org.telegram.messenger.a();
                                        final Context context = parentActivity;
                                        connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, aVar, new Utilities.Callback2() { // from class: org.telegram.ui.Components.p1
                                            @Override // org.telegram.messenger.Utilities.Callback2
                                            public final void run(Object obj2, Object obj3) {
                                                TLRPC.User user3 = (TLRPC.User) obj2;
                                                pf.c.this.c(false);
                                                TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                                MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                                if (user4 == null) {
                                                    booleanCallback3.run(z26 || zArr2[0]);
                                                    return;
                                                }
                                                Context context2 = context;
                                                TLRPC.Chat chat7 = chat6;
                                                ai.wb wbVar = new ai.wb(context2, chat7, user4, i11, booleanCallback3, g6Var2);
                                                t1 t1Var = new t1(booleanCallback3, 0);
                                                org.telegram.ui.ActionBar.o2 o2Var3 = o2Var2;
                                                if (o2Var3 == null || o2Var3.getParentActivity() == null || chat7 == null) {
                                                    return;
                                                }
                                                Context context3 = o2Var3.getContext();
                                                TLRPC.User currentUser = UserConfig.getInstance(o2Var3.getCurrentAccount()).getCurrentUser();
                                                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat7);
                                                FrameLayout frameLayout = new FrameLayout(context3);
                                                frameLayout.setClipToPadding(false);
                                                frameLayout.setClipChildren(false);
                                                w9 w9Var2 = new w9(context3);
                                                h9 h9Var2 = new h9((org.telegram.ui.ActionBar.g6) null);
                                                h9Var2.r(currentUser);
                                                w9Var2.setRoundRadius(AndroidUtilities.dp(30.0f));
                                                w9Var2.e(currentUser, h9Var2);
                                                frameLayout.addView(w9Var2, w7.z5.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                                ImageView imageView = new ImageView(context3);
                                                imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                                org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.d7, o2Var3.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                                                frameLayout.addView(imageView, w7.z5.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                                j3 j3Var = new j3(context3);
                                                h9 h9Var3 = new h9((org.telegram.ui.ActionBar.g6) null);
                                                h9Var3.r(user4);
                                                j3Var.setRoundRadius(AndroidUtilities.dp(30.0f));
                                                j3Var.e(user4, h9Var3);
                                                frameLayout.addView(j3Var, w7.z5.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                                w9 w9Var3 = new w9(context3);
                                                h9 h9Var4 = new h9((org.telegram.ui.ActionBar.g6) null);
                                                h9Var4.q(chat7);
                                                w9Var3.setRoundRadius(AndroidUtilities.dp(12.0f));
                                                w9Var3.e(chat7, h9Var4);
                                                frameLayout.addView(w9Var3, w7.z5.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                                org.telegram.ui.ActionBar.c2 c2Var5 = alertDialog$Builder2.a;
                                                c2Var5.Q0 = -1.0f;
                                                c2Var5.V = frameLayout;
                                                c2Var5.R = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannelTitle : R.string.LeaveGroupTitle);
                                                c2Var5.T = AndroidUtilities.replaceTags(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.LeaveChannelNewOwnerText : R.string.LeaveGroupNewOwnerText, UserObject.getUserName(user4), chat7.title));
                                                alertDialog$Builder2.h(LocaleController.getString(R.string.AppointNewOwner), new s(wbVar, 4));
                                                alertDialog$Builder2.i(LocaleController.getString(R.string.Cancel), null);
                                                alertDialog$Builder2.k(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannel : R.string.LeaveMegaMenu), new s(t1Var, 5));
                                                c2Var5.show();
                                                View d = c2Var5.d(-1);
                                                if (d instanceof TextView) {
                                                    org.telegram.ui.ActionBar.r6.W((TextView) d, org.telegram.ui.ActionBar.k6.q7, null);
                                                }
                                            }
                                        });
                                        return;
                                    }
                                    booleanCallback2 = booleanCallback2;
                                }
                                if (!z26 && !zArr2[0]) {
                                    z27 = false;
                                }
                                booleanCallback2.run(z27);
                            }
                        });
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        o2Var.showDialog(c2Var32);
                        textView = (TextView) c2Var32.d(-1);
                        if (textView == null) {
                        }
                    }
                }
            }
            z18 = false;
            if (!z18) {
            }
        } else {
            chat4 = chat;
            z18 = false;
        }
        org.telegram.ui.Cells.z1 z1Var3 = new org.telegram.ui.Cells.z1(parentActivity, 1, g6Var);
        z1VarArr[0] = z1Var3;
        z1Var3.setBackground(org.telegram.ui.ActionBar.k6.M0(false));
        if (z18) {
            if (!ChatObject.isChannel(chat4) || chat4.megagroup) {
                z1VarArr[0].e(LocaleController.getString(R.string.DeleteGroupForAll), "", false, false, false);
            } else {
                z1VarArr[0].e(LocaleController.getString(R.string.DeleteChannelForAll), "", false, false, false);
            }
            f11 = f7;
            z1VarArr2 = z1VarArr;
        } else if (z10) {
            f11 = f7;
            z1VarArr2 = z1VarArr;
            z1VarArr[0].e(LocaleController.formatString(R.string.ClearHistoryOptionAlso, UserObject.getFirstName(user)), "", false, false, false);
        } else {
            f11 = f7;
            z1VarArr2 = z1VarArr;
            z20 = true;
            z1VarArr2[0].e(LocaleController.formatString(R.string.DeleteMessagesOptionAlso, UserObject.getFirstName(user)), "", false, false, false);
            z1VarArr2[0].setMultiline(z20);
            org.telegram.ui.Cells.z1 z1Var4 = z1VarArr2[0];
            int dp = !LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(f11);
            int dp2 = AndroidUtilities.dp(f10);
            int dp3 = !LocaleController.isRTL ? AndroidUtilities.dp(f11) : AndroidUtilities.dp(16.0f);
            c2Var = c2Var2;
            z1Var4.setPadding(dp, dp2, dp3, AndroidUtilities.dp(f10));
            i3Var.addView(z1VarArr2[0], w7.z5.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
            ai.x9 x9Var = new ai.x9(z18, chat4, alertDialog$Builder, zArr);
            z1VarArr2[0].setOnClickListener(new org.telegram.ui.ActionBar.s1(22, zArr, x9Var));
            if (z14) {
                org.telegram.ui.Cells.z1 z1Var5 = z1VarArr2[0];
                zArr[0] = true;
                z1Var5.c(true, false);
                x9Var.run();
            }
            z19 = z18;
            if (user != null) {
            }
            if (z11) {
            }
            if (!z11) {
            }
            CharSequence charSequence22 = string;
            org.telegram.ui.ActionBar.c2 c2Var322 = c2Var;
            final boolean z2422 = z17;
            alertDialog$Builder.k(charSequence22, new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.Components.v2
                @Override // org.telegram.ui.ActionBar.z1
                public final void g(org.telegram.ui.ActionBar.c2 c2Var4, int i10) {
                    final boolean[] zArr2;
                    boolean z25 = z2422;
                    final boolean z26 = z11;
                    final boolean[] zArr3 = zArr;
                    final MessagesStorage.BooleanCallback booleanCallback2 = booleanCallback;
                    boolean z27 = true;
                    if (z25 || z26 || z12) {
                        zArr2 = zArr3;
                    } else {
                        final TLRPC.User user2 = user;
                        boolean isUserSelf = UserObject.isUserSelf(user2);
                        final org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        final boolean z28 = z10;
                        final TLRPC.Chat chat6 = chat4;
                        final boolean z29 = z13;
                        final boolean z30 = z15;
                        final org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
                        if (isUserSelf) {
                            f5.t(o2Var2, z28, true, chat6, user2, false, z29, zArr3[0], z30, booleanCallback2, g6Var2);
                            return;
                        }
                        if (user2 != null && zArr3[0]) {
                            MessagesStorage.getInstance(o2Var2.getCurrentAccount()).getMessagesCount(user2.id, new MessagesStorage.IntCallback() { // from class: org.telegram.ui.Components.o1
                                @Override // org.telegram.messenger.MessagesStorage.IntCallback
                                public final void run(int i11) {
                                    boolean[] zArr4 = zArr3;
                                    MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                    if (i11 >= 50) {
                                        f5.t(org.telegram.ui.ActionBar.o2.this, z28, true, chat6, user2, false, z29, zArr4[0], z30, booleanCallback3, g6Var2);
                                    } else if (booleanCallback3 != null) {
                                        booleanCallback3.run(zArr4[0]);
                                    }
                                }
                            });
                            return;
                        }
                        zArr2 = zArr3;
                        if (ChatObject.isChannel(chat6) && chat6.creator && !zArr2[0]) {
                            final pf.c h = alertDialog$Builder.a.h(-1, true, true);
                            h.d();
                            TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                            tL_channels_getFutureCreatorAfterLeave.channel = MessagesController.getInputChannel(chat6);
                            final int i11 = currentAccount;
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                            org.telegram.messenger.a aVar = new org.telegram.messenger.a();
                            final Context context = parentActivity;
                            connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, aVar, new Utilities.Callback2() { // from class: org.telegram.ui.Components.p1
                                @Override // org.telegram.messenger.Utilities.Callback2
                                public final void run(Object obj2, Object obj3) {
                                    TLRPC.User user3 = (TLRPC.User) obj2;
                                    pf.c.this.c(false);
                                    TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                    MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                    if (user4 == null) {
                                        booleanCallback3.run(z26 || zArr2[0]);
                                        return;
                                    }
                                    Context context2 = context;
                                    TLRPC.Chat chat7 = chat6;
                                    ai.wb wbVar = new ai.wb(context2, chat7, user4, i11, booleanCallback3, g6Var2);
                                    t1 t1Var = new t1(booleanCallback3, 0);
                                    org.telegram.ui.ActionBar.o2 o2Var3 = o2Var2;
                                    if (o2Var3 == null || o2Var3.getParentActivity() == null || chat7 == null) {
                                        return;
                                    }
                                    Context context3 = o2Var3.getContext();
                                    TLRPC.User currentUser = UserConfig.getInstance(o2Var3.getCurrentAccount()).getCurrentUser();
                                    boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat7);
                                    FrameLayout frameLayout = new FrameLayout(context3);
                                    frameLayout.setClipToPadding(false);
                                    frameLayout.setClipChildren(false);
                                    w9 w9Var2 = new w9(context3);
                                    h9 h9Var2 = new h9((org.telegram.ui.ActionBar.g6) null);
                                    h9Var2.r(currentUser);
                                    w9Var2.setRoundRadius(AndroidUtilities.dp(30.0f));
                                    w9Var2.e(currentUser, h9Var2);
                                    frameLayout.addView(w9Var2, w7.z5.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                    ImageView imageView = new ImageView(context3);
                                    imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                    org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.d7, o2Var3.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                                    frameLayout.addView(imageView, w7.z5.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                    j3 j3Var = new j3(context3);
                                    h9 h9Var3 = new h9((org.telegram.ui.ActionBar.g6) null);
                                    h9Var3.r(user4);
                                    j3Var.setRoundRadius(AndroidUtilities.dp(30.0f));
                                    j3Var.e(user4, h9Var3);
                                    frameLayout.addView(j3Var, w7.z5.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                    w9 w9Var3 = new w9(context3);
                                    h9 h9Var4 = new h9((org.telegram.ui.ActionBar.g6) null);
                                    h9Var4.q(chat7);
                                    w9Var3.setRoundRadius(AndroidUtilities.dp(12.0f));
                                    w9Var3.e(chat7, h9Var4);
                                    frameLayout.addView(w9Var3, w7.z5.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                    org.telegram.ui.ActionBar.c2 c2Var5 = alertDialog$Builder2.a;
                                    c2Var5.Q0 = -1.0f;
                                    c2Var5.V = frameLayout;
                                    c2Var5.R = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannelTitle : R.string.LeaveGroupTitle);
                                    c2Var5.T = AndroidUtilities.replaceTags(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.LeaveChannelNewOwnerText : R.string.LeaveGroupNewOwnerText, UserObject.getUserName(user4), chat7.title));
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.AppointNewOwner), new s(wbVar, 4));
                                    alertDialog$Builder2.i(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder2.k(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannel : R.string.LeaveMegaMenu), new s(t1Var, 5));
                                    c2Var5.show();
                                    View d = c2Var5.d(-1);
                                    if (d instanceof TextView) {
                                        org.telegram.ui.ActionBar.r6.W((TextView) d, org.telegram.ui.ActionBar.k6.q7, null);
                                    }
                                }
                            });
                            return;
                        }
                        booleanCallback2 = booleanCallback2;
                    }
                    if (!z26 && !zArr2[0]) {
                        z27 = false;
                    }
                    booleanCallback2.run(z27);
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            o2Var.showDialog(c2Var322);
            textView = (TextView) c2Var322.d(-1);
            if (textView == null) {
            }
        }
        z20 = true;
        z1VarArr2[0].setMultiline(z20);
        org.telegram.ui.Cells.z1 z1Var42 = z1VarArr2[0];
        if (!LocaleController.isRTL) {
        }
        int dp22 = AndroidUtilities.dp(f10);
        if (!LocaleController.isRTL) {
        }
        c2Var = c2Var2;
        z1Var42.setPadding(dp, dp22, dp3, AndroidUtilities.dp(f10));
        i3Var.addView(z1VarArr2[0], w7.z5.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        ai.x9 x9Var2 = new ai.x9(z18, chat4, alertDialog$Builder, zArr);
        z1VarArr2[0].setOnClickListener(new org.telegram.ui.ActionBar.s1(22, zArr, x9Var2));
        if (z14) {
        }
        z19 = z18;
        if (user != null) {
        }
        if (z11) {
        }
        if (!z11) {
        }
        CharSequence charSequence222 = string;
        org.telegram.ui.ActionBar.c2 c2Var3222 = c2Var;
        final boolean z24222 = z17;
        alertDialog$Builder.k(charSequence222, new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.Components.v2
            @Override // org.telegram.ui.ActionBar.z1
            public final void g(org.telegram.ui.ActionBar.c2 c2Var4, int i10) {
                final boolean[] zArr2;
                boolean z25 = z24222;
                final boolean z26 = z11;
                final boolean[] zArr3 = zArr;
                final MessagesStorage.BooleanCallback booleanCallback2 = booleanCallback;
                boolean z27 = true;
                if (z25 || z26 || z12) {
                    zArr2 = zArr3;
                } else {
                    final TLRPC.User user2 = user;
                    boolean isUserSelf = UserObject.isUserSelf(user2);
                    final org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                    final boolean z28 = z10;
                    final TLRPC.Chat chat6 = chat4;
                    final boolean z29 = z13;
                    final boolean z30 = z15;
                    final org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
                    if (isUserSelf) {
                        f5.t(o2Var2, z28, true, chat6, user2, false, z29, zArr3[0], z30, booleanCallback2, g6Var2);
                        return;
                    }
                    if (user2 != null && zArr3[0]) {
                        MessagesStorage.getInstance(o2Var2.getCurrentAccount()).getMessagesCount(user2.id, new MessagesStorage.IntCallback() { // from class: org.telegram.ui.Components.o1
                            @Override // org.telegram.messenger.MessagesStorage.IntCallback
                            public final void run(int i11) {
                                boolean[] zArr4 = zArr3;
                                MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                if (i11 >= 50) {
                                    f5.t(org.telegram.ui.ActionBar.o2.this, z28, true, chat6, user2, false, z29, zArr4[0], z30, booleanCallback3, g6Var2);
                                } else if (booleanCallback3 != null) {
                                    booleanCallback3.run(zArr4[0]);
                                }
                            }
                        });
                        return;
                    }
                    zArr2 = zArr3;
                    if (ChatObject.isChannel(chat6) && chat6.creator && !zArr2[0]) {
                        final pf.c h = alertDialog$Builder.a.h(-1, true, true);
                        h.d();
                        TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                        tL_channels_getFutureCreatorAfterLeave.channel = MessagesController.getInputChannel(chat6);
                        final int i11 = currentAccount;
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                        org.telegram.messenger.a aVar = new org.telegram.messenger.a();
                        final Context context = parentActivity;
                        connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, aVar, new Utilities.Callback2() { // from class: org.telegram.ui.Components.p1
                            @Override // org.telegram.messenger.Utilities.Callback2
                            public final void run(Object obj2, Object obj3) {
                                TLRPC.User user3 = (TLRPC.User) obj2;
                                pf.c.this.c(false);
                                TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                if (user4 == null) {
                                    booleanCallback3.run(z26 || zArr2[0]);
                                    return;
                                }
                                Context context2 = context;
                                TLRPC.Chat chat7 = chat6;
                                ai.wb wbVar = new ai.wb(context2, chat7, user4, i11, booleanCallback3, g6Var2);
                                t1 t1Var = new t1(booleanCallback3, 0);
                                org.telegram.ui.ActionBar.o2 o2Var3 = o2Var2;
                                if (o2Var3 == null || o2Var3.getParentActivity() == null || chat7 == null) {
                                    return;
                                }
                                Context context3 = o2Var3.getContext();
                                TLRPC.User currentUser = UserConfig.getInstance(o2Var3.getCurrentAccount()).getCurrentUser();
                                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat7);
                                FrameLayout frameLayout = new FrameLayout(context3);
                                frameLayout.setClipToPadding(false);
                                frameLayout.setClipChildren(false);
                                w9 w9Var2 = new w9(context3);
                                h9 h9Var2 = new h9((org.telegram.ui.ActionBar.g6) null);
                                h9Var2.r(currentUser);
                                w9Var2.setRoundRadius(AndroidUtilities.dp(30.0f));
                                w9Var2.e(currentUser, h9Var2);
                                frameLayout.addView(w9Var2, w7.z5.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                ImageView imageView = new ImageView(context3);
                                imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.d7, o2Var3.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                                frameLayout.addView(imageView, w7.z5.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                j3 j3Var = new j3(context3);
                                h9 h9Var3 = new h9((org.telegram.ui.ActionBar.g6) null);
                                h9Var3.r(user4);
                                j3Var.setRoundRadius(AndroidUtilities.dp(30.0f));
                                j3Var.e(user4, h9Var3);
                                frameLayout.addView(j3Var, w7.z5.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                w9 w9Var3 = new w9(context3);
                                h9 h9Var4 = new h9((org.telegram.ui.ActionBar.g6) null);
                                h9Var4.q(chat7);
                                w9Var3.setRoundRadius(AndroidUtilities.dp(12.0f));
                                w9Var3.e(chat7, h9Var4);
                                frameLayout.addView(w9Var3, w7.z5.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                org.telegram.ui.ActionBar.c2 c2Var5 = alertDialog$Builder2.a;
                                c2Var5.Q0 = -1.0f;
                                c2Var5.V = frameLayout;
                                c2Var5.R = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannelTitle : R.string.LeaveGroupTitle);
                                c2Var5.T = AndroidUtilities.replaceTags(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.LeaveChannelNewOwnerText : R.string.LeaveGroupNewOwnerText, UserObject.getUserName(user4), chat7.title));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.AppointNewOwner), new s(wbVar, 4));
                                alertDialog$Builder2.i(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder2.k(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.LeaveChannel : R.string.LeaveMegaMenu), new s(t1Var, 5));
                                c2Var5.show();
                                View d = c2Var5.d(-1);
                                if (d instanceof TextView) {
                                    org.telegram.ui.ActionBar.r6.W((TextView) d, org.telegram.ui.ActionBar.k6.q7, null);
                                }
                            }
                        });
                        return;
                    }
                    booleanCallback2 = booleanCallback2;
                }
                if (!z26 && !zArr2[0]) {
                    z27 = false;
                }
                booleanCallback2.run(z27);
            }
        });
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        o2Var.showDialog(c2Var3222);
        textView = (TextView) c2Var3222.d(-1);
        if (textView == null) {
        }
    }

    public static void t0(int i10, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        if (i10 == 0 || o2Var == null || o2Var.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity(), 0, g6Var);
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
        o2Var.showDialog(alertDialog$Builder.a, true, null);
    }

    public static org.telegram.ui.ActionBar.c2 u(Activity activity, final long j10, final long j11, final int i10, final Runnable runnable, org.telegram.ui.ActionBar.g6 g6Var) {
        int i11;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
        final String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j11);
        if (j10 != 0) {
            StringBuilder sb2 = new StringBuilder("color_");
            sb2.append(sharedPrefKey);
            i11 = notificationsSettings.contains(sb2.toString()) ? org.telegram.messenger.v0.c("color_", sharedPrefKey, notificationsSettings, -16776961) : DialogObject.isChatDialog(j10) ? notificationsSettings.getInt("GroupLed", -16776961) : notificationsSettings.getInt("MessagesLed", -16776961);
        } else {
            i11 = i10 == 1 ? notificationsSettings.getInt("MessagesLed", -16776961) : i10 == 0 ? notificationsSettings.getInt("GroupLed", -16776961) : i10 == 3 ? notificationsSettings.getInt("StoriesLed", -16776961) : (i10 == 5 || i10 == 4) ? notificationsSettings.getInt("ReactionsLed", -16776961) : notificationsSettings.getInt("ChannelLed", -16776961);
        }
        LinearLayout f7 = org.telegram.messenger.v0.f(activity, 1);
        String[] strArr = {LocaleController.getString(R.string.ColorRed), LocaleController.getString(R.string.ColorOrange), LocaleController.getString(R.string.ColorYellow), LocaleController.getString(R.string.ColorGreen), LocaleController.getString(R.string.ColorCyan), LocaleController.getString(R.string.ColorBlue), LocaleController.getString(R.string.ColorViolet), LocaleController.getString(R.string.ColorPink), LocaleController.getString(R.string.ColorWhite)};
        final int[] iArr = {i11};
        for (int i12 = 0; i12 < 9; i12++) {
            org.telegram.ui.Cells.l6 l6Var = new org.telegram.ui.Cells.l6(activity, g6Var);
            l6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            l6Var.setTag(Integer.valueOf(i12));
            int i13 = org.telegram.ui.Cells.y8.e[i12];
            l6Var.a(i13, i13);
            l6Var.b(strArr[i12], i11 == org.telegram.ui.Cells.y8.f[i12]);
            f7.addView(l6Var);
            l6Var.setOnClickListener(new p0(f7, iArr));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, g6Var);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.LedColor);
        alertDialog$Builder.o(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.Set), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.Components.w2
            @Override // org.telegram.ui.ActionBar.z1
            public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i14) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                long j12 = j10;
                int[] iArr2 = iArr;
                if (j12 != 0) {
                    edit.putInt(si.o0.h("color_", sharedPrefKey), iArr2[0]);
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
        alertDialog$Builder.i(LocaleController.getString(R.string.LedDisabled), new j2.c(j10, i10, runnable, 5));
        if (j10 != 0) {
            alertDialog$Builder.h(LocaleController.getString(R.string.Default), new p2(3, sharedPrefKey, runnable));
        }
        return alertDialog$Builder.a;
    }

    public static org.telegram.ui.ActionBar.c2 u0(org.telegram.ui.ActionBar.o2 o2Var, String str, String str2, org.telegram.ui.ActionBar.g6 g6Var) {
        if (o2Var == null) {
            o2Var = LaunchActivity.U();
        }
        if (str2 == null || o2Var == null || o2Var.getParentActivity() == null) {
            return null;
        }
        org.telegram.ui.ActionBar.c2 c2Var = O(o2Var.getParentActivity(), str, str2, null, null, g6Var).a;
        o2Var.showDialog(c2Var);
        return c2Var;
    }

    public static void v(org.telegram.ui.ActionBar.o2 o2Var, String str, String str2, String str3) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity());
        String string = LocaleController.getString(R.string.ContactNotRegisteredTitle);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.R = string;
        c2Var.T = LocaleController.formatString("ContactNotRegistered", R.string.ContactNotRegistered, ContactsController.formatName(str, str2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Invite), new p2(0, str3, o2Var));
        o2Var.showDialog(c2Var);
    }

    public static org.telegram.ui.ActionBar.c2 v0(org.telegram.ui.ActionBar.o2 o2Var, String str, CharSequence charSequence, String str2, boolean z10, Runnable runnable) {
        TextView textView;
        org.telegram.ui.ActionBar.c2 P = P(o2Var.getContext(), o2Var.getResourceProvider(), str, charSequence, str2, runnable);
        o2Var.showDialog(P);
        if (z10 && (textView = (TextView) P.d(-1)) != null) {
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.q7, null);
        }
        return P;
    }

    public static AlertDialog$Builder w(Activity activity, final MessagesStorage.IntCallback intCallback) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        int i10 = R.raw.permission_request_contacts;
        int i11 = org.telegram.ui.ActionBar.k6.L5;
        alertDialog$Builder.m(i10, 72, org.telegram.ui.ActionBar.k6.x0(null, i11, false), null);
        alertDialog$Builder.n(i11, null);
        alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.ContactsPermissionAlert));
        final int i12 = 1;
        alertDialog$Builder.k(LocaleController.getString(R.string.ContactsPermissionAlertContinue), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.Components.o0
            @Override // org.telegram.ui.ActionBar.z1
            public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i13) {
                switch (i12) {
                    case 0:
                        intCallback.run(0);
                        break;
                    default:
                        intCallback.run(1);
                        break;
                }
            }
        });
        final int i13 = 0;
        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.Components.o0
            @Override // org.telegram.ui.ActionBar.z1
            public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i132) {
                switch (i13) {
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

    public static void w0(org.telegram.ui.ActionBar.o2 o2Var, String str) {
        if (str == null) {
            return;
        }
        Toast.makeText((o2Var == null || o2Var.getParentActivity() == null) ? ApplicationLoader.applicationContext : o2Var.getParentActivity(), str, 1).show();
    }

    public static AlertDialog$Builder x(Context context, int i10, int i11, int i12, int i13, int i14, int i15, String str, final boolean z10, hg.b2 b2Var) {
        if (context == null) {
            return null;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        final qd0 qd0Var = new qd0(context, null);
        final qd0 qd0Var2 = new qd0(context, null);
        final qd0 qd0Var3 = new qd0(context, null);
        linearLayout.addView(qd0Var2, w7.z5.l(0.3f, 0, -2));
        final int i16 = 0;
        qd0Var2.setOnScrollListener(new nd0() { // from class: org.telegram.ui.Components.u1
            @Override // org.telegram.ui.Components.nd0
            public final void i(int i17) {
                switch (i16) {
                    case 0:
                        if (z10 && i17 == 0) {
                            f5.d(qd0Var2, qd0Var, qd0Var3);
                            break;
                        }
                        break;
                    case 1:
                        if (z10 && i17 == 0) {
                            f5.d(qd0Var2, qd0Var, qd0Var3);
                            break;
                        }
                        break;
                    default:
                        if (z10 && i17 == 0) {
                            f5.d(qd0Var2, qd0Var, qd0Var3);
                            break;
                        }
                        break;
                }
            }
        });
        qd0Var.setMinValue(0);
        qd0Var.setMaxValue(11);
        linearLayout.addView(qd0Var, w7.z5.l(0.3f, 0, -2));
        qd0Var.setFormatter(new org.telegram.ui.tr(18));
        qd0Var.setOnValueChangedListener(new l0(qd0Var2, qd0Var, qd0Var3, 1));
        final int i17 = 1;
        qd0Var.setOnScrollListener(new nd0() { // from class: org.telegram.ui.Components.u1
            @Override // org.telegram.ui.Components.nd0
            public final void i(int i172) {
                switch (i17) {
                    case 0:
                        if (z10 && i172 == 0) {
                            f5.d(qd0Var2, qd0Var, qd0Var3);
                            break;
                        }
                        break;
                    case 1:
                        if (z10 && i172 == 0) {
                            f5.d(qd0Var2, qd0Var, qd0Var3);
                            break;
                        }
                        break;
                    default:
                        if (z10 && i172 == 0) {
                            f5.d(qd0Var2, qd0Var, qd0Var3);
                            break;
                        }
                        break;
                }
            }
        });
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i18 = calendar.get(1);
        qd0Var3.setMinValue(i10 + i18);
        qd0Var3.setMaxValue(i11 + i18);
        qd0Var3.setValue(i18 + i12);
        linearLayout.addView(qd0Var3, w7.z5.l(0.4f, 0, -2));
        qd0Var3.setOnValueChangedListener(new l0(qd0Var2, qd0Var, qd0Var3, 2));
        final int i19 = 2;
        qd0Var3.setOnScrollListener(new nd0() { // from class: org.telegram.ui.Components.u1
            @Override // org.telegram.ui.Components.nd0
            public final void i(int i172) {
                switch (i19) {
                    case 0:
                        if (z10 && i172 == 0) {
                            f5.d(qd0Var2, qd0Var, qd0Var3);
                            break;
                        }
                        break;
                    case 1:
                        if (z10 && i172 == 0) {
                            f5.d(qd0Var2, qd0Var, qd0Var3);
                            break;
                        }
                        break;
                    default:
                        if (z10 && i172 == 0) {
                            f5.d(qd0Var2, qd0Var, qd0Var3);
                            break;
                        }
                        break;
                }
            }
        });
        y0(qd0Var2, qd0Var, qd0Var3);
        if (z10) {
            d(qd0Var2, qd0Var, qd0Var3);
        }
        if (i13 != -1) {
            qd0Var2.setValue(i13);
            qd0Var.setValue(i14);
            qd0Var3.setValue(i15);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.a.R = str;
        alertDialog$Builder.o(linearLayout);
        alertDialog$Builder.k(LocaleController.getString(R.string.Set), new org.telegram.messenger.kk(z10, qd0Var2, qd0Var, qd0Var3, b2Var));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.c2 x0(Context context, String str, boolean z10) {
        if (context == null || str == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.R = string;
        c2Var.T = str;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        if (z10) {
            alertDialog$Builder.h(LocaleController.getString(R.string.UpdateApp), new j0(context, 2));
        }
        return alertDialog$Builder.p();
    }

    public static void y(Context context, String str, String str2, long j10, d5 d5Var) {
        if (context == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.j5, false);
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h5, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ji, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ni, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E8, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G8, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.i6, false);
        int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Sh, false);
        int x05 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Oh, false);
        int x06 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Qh, false);
        org.telegram.ui.ActionBar.b3 b3Var = new org.telegram.ui.ActionBar.b3(context, null);
        b3Var.a();
        qd0 qd0Var = new qd0(context, null);
        qd0Var.setTextColor(x02);
        qd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        qd0Var.setItemCount(5);
        x3 x3Var = new x3(context, null);
        x3Var.setItemCount(5);
        x3Var.setTextColor(x02);
        x3Var.setTextOffset(-AndroidUtilities.dp(10.0f));
        z3 z3Var = new z3(context, null);
        z3Var.setItemCount(5);
        z3Var.setTextColor(x02);
        z3Var.setTextOffset(-AndroidUtilities.dp(34.0f));
        qd0 qd0Var2 = qd0Var;
        w3 w3Var = new w3(context, qd0Var2, x3Var, z3Var, 1);
        w3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        w3Var.addView(frameLayout, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextColor(x02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, w7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new di.d(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        w3Var.addView(linearLayout, w7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        ai.wd wdVar = new ai.wd(context, 15);
        linearLayout.addView(qd0Var2, w7.z5.l(0.5f, 0, 270));
        qd0Var2.setMinValue(0);
        qd0Var2.setMaxValue(365);
        qd0Var2.setWrapSelectorWheel(false);
        qd0Var2.setFormatter(new org.telegram.ui.tr(21));
        ai.u2 u2Var = new ai.u2(qd0Var2, x3Var, z3Var, 19);
        qd0Var2.setOnValueChangedListener(u2Var);
        x3Var.setMinValue(0);
        x3Var.setMaxValue(23);
        linearLayout.addView(x3Var, w7.z5.l(0.2f, 0, 270));
        x3Var.setFormatter(new org.telegram.ui.tr(22));
        x3Var.setOnValueChangedListener(u2Var);
        z3Var.setMinValue(0);
        z3Var.setMaxValue(59);
        z3Var.setValue(0);
        z3Var.setFormatter(new org.telegram.ui.tr(23));
        linearLayout.addView(z3Var, w7.z5.l(0.3f, 0, 270));
        z3Var.setOnValueChangedListener(u2Var);
        if (j10 > 0 && j10 != 2147483646) {
            long j11 = j10 * 1000;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j11 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j11);
            if (timeInMillis >= 0) {
                z3Var.setValue(calendar.get(12));
                x3Var.setValue(calendar.get(11));
                qd0Var2 = qd0Var2;
                qd0Var2.setValue(timeInMillis);
            } else {
                qd0Var2 = qd0Var2;
            }
        }
        g(null, null, 0L, 0L, 0, qd0Var2, x3Var, z3Var);
        wdVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        wdVar.setGravity(17);
        wdVar.setTextColor(x04);
        wdVar.setTextSize(1, 14.0f);
        wdVar.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(8.0f);
        wdVar.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, x05, x06, x06));
        wdVar.setText(str2);
        w3Var.addView(wdVar, w7.z5.t(-1, 48, 83, 16, 15, 16, 16));
        wdVar.setOnClickListener(new m0(qd0Var2, x3Var, z3Var, calendar, d5Var, b3Var, 2));
        b3Var.b(w3Var);
        org.telegram.ui.ActionBar.h3 h3Var = b3Var.a;
        h3Var.show();
        h3Var.setBackgroundColor(x03);
        h3Var.fixNavigationBar(x03);
    }

    public static void y0(qd0 qd0Var, qd0 qd0Var2, qd0 qd0Var3) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2, qd0Var2.getValue());
        calendar.set(1, qd0Var3.getValue());
        qd0Var.setMinValue(1);
        qd0Var.setMaxValue(calendar.getActualMaximum(5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:413:0x020b, code lost:
    
        if (java.lang.Math.abs(r11 - r0.messageOwner.date) > 86400) goto L95;
     */
    /* JADX WARN: Removed duplicated region for block: B:154:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x071d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x07e7  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0882  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x094d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x095b  */
    /* JADX WARN: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x08bb  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0824  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x06f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void z(final org.telegram.ui.ActionBar.o2 o2Var, final TLRPC.User user, final TLRPC.Chat chat, final TLRPC.EncryptedChat encryptedChat, final TLRPC.ChatFull chatFull, final long j10, final MessageObject messageObject, final SparseArray[] sparseArrayArr, final MessageObject.GroupedMessages groupedMessages, final int i10, final int i11, TLRPC.ChannelParticipant[] channelParticipantArr, final Runnable runnable, Runnable runnable2, final org.telegram.ui.ActionBar.g6 g6Var) {
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
        int i16;
        org.telegram.ui.ActionBar.c2 c2Var;
        int i17;
        boolean z16;
        boolean z17;
        boolean z18;
        org.telegram.ui.Cells.z1 z1Var;
        int i18;
        TLRPC.MessageAction messageAction;
        final boolean z19;
        int i19;
        org.telegram.ui.ActionBar.c2 c2Var2;
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
        if (o2Var == null) {
            return;
        }
        if ((user == null && chat == null && encryptedChat == null) || (parentActivity = o2Var.getParentActivity()) == null) {
            return;
        }
        final int currentAccount = o2Var.getCurrentAccount();
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(parentActivity, 0, g6Var);
        float f7 = runnable2 != null ? 0.5f : 0.6f;
        org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder2.a;
        c2Var3.S0 = f7;
        int size = groupedMessages != null ? groupedMessages.messages.size() : messageObject2 != null ? 1 : sparseArrayArr[1].size() + sparseArrayArr[0].size();
        if (encryptedChat != null) {
            z10 = z23;
            j11 = DialogObject.makeEncryptedDialogId(encryptedChat.id);
        } else {
            z10 = z23;
            j11 = user != null ? user.id : -chat.id;
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
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(parentActivity, 0, g6Var);
                String string = LocaleController.getString(R.string.MessageScheduledRepeatDeleteTitle);
                org.telegram.ui.ActionBar.c2 c2Var4 = alertDialog$Builder3.a;
                c2Var4.R = string;
                c2Var4.T = LocaleController.getString(R.string.MessageScheduledRepeatDeleteText);
                final int i26 = i24;
                alertDialog$Builder3.h(str2, new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.Components.q0
                    @Override // org.telegram.ui.ActionBar.z1
                    public final void g(org.telegram.ui.ActionBar.c2 c2Var5, int i27) {
                        MessageObject.GroupedMessages groupedMessages2 = MessageObject.GroupedMessages.this;
                        int i28 = currentAccount;
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        int i29 = i26;
                        int i30 = i23;
                        if (groupedMessages2 != null && !groupedMessages2.messages.isEmpty()) {
                            SendMessagesHelper.getInstance(i28).editMessage(groupedMessages2.messages.get(0), null, false, o2Var2, null, i29 + i30, i30);
                        } else {
                            SendMessagesHelper.getInstance(i28).editMessage(messageObject, null, false, o2Var2, null, i29 + i30, i30);
                        }
                    }
                });
                final long j12 = j11;
                final boolean z24 = z10;
                alertDialog$Builder3.i(LocaleController.getString(R.string.MessageScheduledRepeatDeleteAll), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.Components.v0
                    @Override // org.telegram.ui.ActionBar.z1
                    public final void g(org.telegram.ui.ActionBar.c2 c2Var5, int i27) {
                        SparseArray[] sparseArrayArr2;
                        ArrayList<Long> arrayList;
                        int i28;
                        long j13;
                        ArrayList<Long> arrayList2;
                        TLRPC.Peer peer;
                        int i29;
                        long j14;
                        ArrayList<Integer> arrayList3;
                        boolean z25 = z24;
                        int i30 = currentAccount;
                        long clientUserId = z25 ? UserConfig.getInstance(i30).getClientUserId() : j12;
                        MessageObject messageObject3 = messageObject;
                        TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                        long j15 = j10;
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
                                            j14 = clientUserId;
                                        } else {
                                            if (arrayList4 == null) {
                                                arrayList4 = new ArrayList<>();
                                            }
                                            ArrayList<Long> arrayList6 = arrayList4;
                                            i29 = i30;
                                            j14 = clientUserId;
                                            arrayList6.add(Long.valueOf(messageObject4.messageOwner.random_id));
                                            arrayList4 = arrayList6;
                                        }
                                    } else {
                                        i29 = i30;
                                        j14 = clientUserId;
                                        arrayList3 = arrayList5;
                                    }
                                    i33++;
                                    arrayList5 = arrayList3;
                                    i30 = i29;
                                    clientUserId = j14;
                                }
                                i28 = i30;
                                j13 = clientUserId;
                            } else {
                                i28 = i30;
                                j13 = clientUserId;
                                arrayList5.add(Integer.valueOf(messageObject3.getId()));
                                if (encryptedChat2 != null && messageObject3.messageOwner.random_id != 0 && messageObject3.type != 10) {
                                    ArrayList<Long> arrayList7 = new ArrayList<>();
                                    arrayList7.add(Long.valueOf(messageObject3.messageOwner.random_id));
                                    arrayList2 = arrayList7;
                                    MessagesController.getInstance(i28).deleteMessages(arrayList5, arrayList2, encryptedChat2, (j15 == 0 && (peer = messageObject3.messageOwner.peer_id) != null && peer.chat_id == (-j15)) ? j15 : j13, i31, true, i32);
                                }
                            }
                            arrayList2 = arrayList4;
                            MessagesController.getInstance(i28).deleteMessages(arrayList5, arrayList2, encryptedChat2, (j15 == 0 && (peer = messageObject3.messageOwner.peer_id) != null && peer.chat_id == (-j15)) ? j15 : j13, i31, true, i32);
                        } else {
                            long j16 = clientUserId;
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
                                        long j17 = messageObject5.messageOwner.random_id;
                                        if (j17 != 0 && messageObject5.type != 10) {
                                            arrayList9.add(Long.valueOf(j17));
                                        }
                                    }
                                    arrayList = arrayList9;
                                } else {
                                    arrayList = null;
                                }
                                MessagesController.getInstance(i30).deleteMessages(arrayList8, arrayList, encryptedChat2, (i34 != 1 || j15 == 0) ? j16 : j15, i31, true, i32);
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
                c2Var4.N = new r0(2, runnable2);
                alertDialog$Builder3.p();
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
                        c2Var = c2Var3;
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
                            c2Var = c2Var3;
                            z16 = z18;
                        } else {
                            FrameLayout frameLayout = new FrameLayout(parentActivity);
                            org.telegram.ui.Cells.z1 z1Var2 = new org.telegram.ui.Cells.z1(parentActivity, 1, g6Var);
                            z1Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.M0(false));
                            if (z15) {
                                z1Var = z1Var2;
                                z1Var.e(LocaleController.formatString("DeleteMessagesOptionAlso", R.string.DeleteMessagesOptionAlso, UserObject.getFirstName(user)), "", false, false, false);
                            } else {
                                z1Var = z1Var2;
                                if (chat == null || !(z18 || i17 == size)) {
                                    z1Var.e(LocaleController.getString(R.string.DeleteMessagesOption), "", false, false, false);
                                } else {
                                    z1Var.e(LocaleController.getString(R.string.DeleteForAll), "", false, false, false);
                                }
                            }
                            org.telegram.ui.Cells.z1 z1Var3 = z1Var;
                            z1Var3.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                            frameLayout.addView(z1Var3, w7.z5.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                            i16 = 1;
                            z1Var3.setOnClickListener(new s0(1, zArr));
                            alertDialog$Builder2.o(frameLayout);
                            c2Var3.G = 9;
                            c2Var = c2Var3;
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
                        i21 = (!messageObject2.isSendError() && messageObject2.getDialogId() == j10 && ((messageAction2 = messageObject2.messageOwner.action) == null || (messageAction2 instanceof TLRPC.TL_messageActionEmpty)) && messageObject2.isOut() && currentTime - messageObject2.messageOwner.date <= i31) ? 1 : 0;
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
                    ArrayList arrayList2 = (ArrayList) Collection.-EL.stream(arrayList).filter(new org.telegram.ui.bb(1)).mapToLong(new w0(0)).distinct().mapToObj(new LongFunction() { // from class: org.telegram.ui.Components.x0
                        @Override // java.util.function.LongFunction
                        public final Object apply(long j13) {
                            int i43 = i27;
                            return j13 > 0 ? MessagesController.getInstance(i43).getUser(Long.valueOf(j13)) : MessagesController.getInstance(i43).getChat(Long.valueOf(-j13));
                        }
                    }).filter(new org.telegram.ui.bb(i42)).filter(new org.telegram.ui.s8(UserConfig.getInstance(i27).getClientUserId(), i42)).collect(Collectors.toCollection(new org.telegram.ui.wf()));
                    if (!arrayList2.isEmpty()) {
                        if (channelParticipantArr != null) {
                            ps psVar = new ps(o2Var, chat, arrayList, arrayList2, channelParticipantArr, j10, i10, i11, false, runnable);
                            if (runnable3 != null) {
                                psVar.setOnHideListener(new r0(0, runnable3));
                            }
                            psVar.show();
                            return;
                        }
                        final org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(parentActivity, 3, null)};
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
                            RequestDelegate requestDelegate = new RequestDelegate() { // from class: org.telegram.ui.Components.y0
                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                                    final int[] iArr5 = iArr3;
                                    final int[] iArr6 = iArr4;
                                    final int i44 = i43;
                                    final TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                    final int i45 = size2;
                                    final org.telegram.ui.ActionBar.c2[] c2VarArr2 = c2VarArr;
                                    final org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                                    final TLRPC.User user2 = user;
                                    final TLRPC.Chat chat2 = chat;
                                    final TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                                    final TLRPC.ChatFull chatFull2 = chatFull;
                                    final long j13 = j10;
                                    final MessageObject messageObject7 = messageObject;
                                    final SparseArray[] sparseArrayArr2 = sparseArrayArr;
                                    final MessageObject.GroupedMessages groupedMessages2 = groupedMessages;
                                    final int i46 = i10;
                                    final int i47 = i11;
                                    final Runnable runnable5 = runnable;
                                    final Runnable runnable6 = runnable4;
                                    final org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.r1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            org.telegram.ui.ActionBar.c2[] c2VarArr3 = c2VarArr2;
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
                                                    c2VarArr3[0].dismiss();
                                                } catch (Throwable unused) {
                                                }
                                                c2VarArr3[0] = null;
                                                f5.z(o2Var2, user2, chat2, encryptedChat2, chatFull2, j13, messageObject7, sparseArrayArr2, groupedMessages2, i46, i47, channelParticipantArr4, runnable5, runnable6, g6Var2);
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
                        AndroidUtilities.runOnUIThread(new ai.vb(c2VarArr, iArr, i27, runnable2, o2Var, 20), 1000L);
                        return;
                    }
                    if (i41 <= 0 || !z29) {
                        z20 = false;
                    } else {
                        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                        org.telegram.ui.Cells.z1 z1Var4 = new org.telegram.ui.Cells.z1(parentActivity, 1, g6Var);
                        z1Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.M0(false));
                        z1Var4.e(LocaleController.getString(R.string.DeleteMessagesOption), "", false, false, false);
                        z1Var4.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                        frameLayout2.addView(z1Var4, w7.z5.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                        z1Var4.setOnClickListener(new s0(0, zArr));
                        alertDialog$Builder2.o(frameLayout2);
                        c2Var3.G = 9;
                        z20 = true;
                    }
                    c2Var = c2Var3;
                    z17 = z20;
                    i15 = i27;
                    i17 = i41;
                    i16 = 1;
                    z16 = false;
                }
                final int i45 = i15;
                org.telegram.ui.ActionBar.c2 c2Var5 = c2Var;
                int i46 = i17;
                final long j13 = j11;
                int i47 = size;
                boolean z31 = z11;
                z19 = z10;
                int i48 = i16;
                org.telegram.ui.ActionBar.z1 z1Var5 = new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.Components.u0
                    @Override // org.telegram.ui.ActionBar.z1
                    public final void g(org.telegram.ui.ActionBar.c2 c2Var6, int i49) {
                        SparseArray[] sparseArrayArr2;
                        ArrayList<Long> arrayList4;
                        boolean z32;
                        long j14;
                        int i50;
                        long j15;
                        long j16;
                        ArrayList arrayList5;
                        TLRPC.Peer peer;
                        int i51;
                        long j17;
                        boolean z33 = z19;
                        int i52 = i45;
                        long clientUserId = z33 ? UserConfig.getInstance(i52).getClientUserId() : j13;
                        MessageObject messageObject7 = messageObject;
                        TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                        long j18 = j10;
                        int i53 = i10;
                        boolean[] zArr2 = zArr;
                        int i54 = i11;
                        ArrayList<Long> arrayList6 = null;
                        if (messageObject7 != null) {
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList<Integer> arrayList8 = new ArrayList<>();
                            MessageObject.GroupedMessages groupedMessages2 = groupedMessages;
                            if (groupedMessages2 != null) {
                                int i55 = 0;
                                while (i55 < groupedMessages2.messages.size()) {
                                    MessageObject messageObject8 = groupedMessages2.messages.get(i55);
                                    if (messageObject8.isEphemeral()) {
                                        arrayList7.add(messageObject8);
                                        i51 = i52;
                                    } else {
                                        i51 = i52;
                                        arrayList8.add(Integer.valueOf(messageObject8.getId()));
                                        if (encryptedChat2 != null) {
                                            j17 = clientUserId;
                                            if (messageObject8.messageOwner.random_id != 0 && messageObject8.type != 10) {
                                                if (arrayList6 == null) {
                                                    arrayList6 = new ArrayList<>();
                                                }
                                                ArrayList<Long> arrayList9 = arrayList6;
                                                arrayList9.add(Long.valueOf(messageObject8.messageOwner.random_id));
                                                arrayList6 = arrayList9;
                                            }
                                            i55++;
                                            i52 = i51;
                                            clientUserId = j17;
                                        }
                                    }
                                    j17 = clientUserId;
                                    i55++;
                                    i52 = i51;
                                    clientUserId = j17;
                                }
                                i50 = i52;
                                j15 = clientUserId;
                            } else {
                                i50 = i52;
                                j15 = clientUserId;
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
                            long j19 = (j18 == 0 || (peer = messageObject7.messageOwner.peer_id) == null || peer.chat_id != (-j18)) ? j15 : j18;
                            if (arrayList8.isEmpty()) {
                                j16 = j19;
                                arrayList5 = arrayList7;
                            } else {
                                arrayList5 = arrayList7;
                                j16 = j19;
                                MessagesController.getInstance(i50).deleteMessages(arrayList8, arrayList6, encryptedChat2, j16, i53, zArr2[0], i54);
                            }
                            int size3 = arrayList5.size();
                            int i56 = 0;
                            while (i56 < size3) {
                                Object obj = arrayList5.get(i56);
                                i56++;
                                MessagesController.getInstance(i50).deleteEphemeralMessage(j16, i53, (MessageObject) obj);
                            }
                        } else {
                            long j20 = clientUserId;
                            int i57 = 1;
                            while (i57 >= 0) {
                                ArrayList<Integer> arrayList11 = new ArrayList<>();
                                int i58 = 0;
                                while (true) {
                                    sparseArrayArr2 = sparseArrayArr;
                                    if (i58 >= sparseArrayArr2[i57].size()) {
                                        break;
                                    }
                                    arrayList11.add(Integer.valueOf(sparseArrayArr2[i57].keyAt(i58)));
                                    i58++;
                                }
                                if (encryptedChat2 != null) {
                                    ArrayList<Long> arrayList12 = new ArrayList<>();
                                    int i59 = 0;
                                    while (i59 < sparseArrayArr2[i57].size()) {
                                        MessageObject messageObject9 = (MessageObject) sparseArrayArr2[i57].valueAt(i59);
                                        int i60 = i57;
                                        long j21 = messageObject9.messageOwner.random_id;
                                        if (j21 != 0 && messageObject9.type != 10) {
                                            arrayList12.add(Long.valueOf(j21));
                                        }
                                        i59++;
                                        i57 = i60;
                                    }
                                    arrayList4 = arrayList12;
                                } else {
                                    arrayList4 = null;
                                }
                                int i61 = i57;
                                MessagesController messagesController = MessagesController.getInstance(i52);
                                if (i61 != 1 || j18 == 0) {
                                    z32 = 10;
                                    j14 = j20;
                                } else {
                                    z32 = 10;
                                    j14 = j18;
                                }
                                messagesController.deleteMessages(arrayList11, arrayList4, encryptedChat2, j14, i53, zArr2[0], i54);
                                sparseArrayArr2[i61].clear();
                                i57 = i61 - 1;
                            }
                        }
                        Runnable runnable5 = runnable;
                        if (runnable5 != null) {
                            runnable5.run();
                        }
                    }
                };
                if (z19) {
                    i19 = i47;
                    c2Var2 = c2Var5;
                    if (i19 == i48) {
                        c2Var2.R = LocaleController.getString(R.string.DeleteSingleMessagesTitle);
                    } else {
                        int i49 = R.string.DeleteMessagesTitle;
                        Object[] objArr = new Object[i48];
                        objArr[0] = LocaleController.formatPluralString("messages", i19, new Object[0]);
                        c2Var2.R = LocaleController.formatString(i49, objArr);
                    }
                } else {
                    i19 = i47;
                    if (i19 == i48) {
                        c2Var2 = c2Var5;
                        c2Var2.R = LocaleController.getString(R.string.UnsaveSingleMessagesTitle);
                    } else {
                        c2Var2 = c2Var5;
                        int i50 = R.string.UnsaveMessagesTitle;
                        Object[] objArr2 = new Object[i48];
                        objArr2[0] = LocaleController.formatPluralString("messages", i19, new Object[0]);
                        c2Var2.R = LocaleController.formatString(i50, objArr2);
                    }
                }
                if (z19) {
                    if (chat == null || !z16) {
                        if (!z17 || z15 || i46 == i19) {
                            if (chat == null || !chat.megagroup || z22) {
                                if (i19 == i48) {
                                    c2Var2.T = LocaleController.getString(R.string.AreYouSureDeleteSingleMessage);
                                } else {
                                    c2Var2.T = LocaleController.getString(R.string.AreYouSureDeleteFewMessages);
                                }
                            } else if (i19 == i48) {
                                c2Var2.T = LocaleController.getString((messageObject == null || !messageObject.isEphemeral()) ? R.string.AreYouSureDeleteSingleMessageMega : R.string.AreYouSureDeleteSingleMessage);
                            } else {
                                c2Var2.T = LocaleController.getString(R.string.AreYouSureDeleteFewMessagesMega);
                            }
                        } else if (chat != null) {
                            int i51 = R.string.DeleteMessagesTextGroup;
                            Object[] objArr3 = new Object[i48];
                            objArr3[0] = LocaleController.formatPluralString("messages", i46, new Object[0]);
                            c2Var2.T = LocaleController.formatString("DeleteMessagesTextGroup", i51, objArr3);
                        } else {
                            int i52 = R.string.DeleteMessagesText;
                            String formatPluralString = LocaleController.formatPluralString("messages", i46, new Object[0]);
                            String firstName = UserObject.getFirstName(user);
                            Object[] objArr4 = new Object[2];
                            objArr4[0] = formatPluralString;
                            objArr4[i48] = firstName;
                            c2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatString("DeleteMessagesText", i52, objArr4));
                        }
                    } else if (z17 && i46 != i19) {
                        int i53 = R.string.DeleteMessagesTextGroupPart;
                        Object[] objArr5 = new Object[i48];
                        objArr5[0] = LocaleController.formatPluralString("messages", i46, new Object[0]);
                        c2Var2.T = LocaleController.formatString(i53, objArr5);
                    } else if (i19 == i48) {
                        c2Var2.T = LocaleController.getString(R.string.AreYouSureDeleteSingleMessage);
                    } else {
                        c2Var2.T = LocaleController.getString(R.string.AreYouSureDeleteFewMessages);
                    }
                } else if (i19 == i48) {
                    c2Var2.T = LocaleController.getString(R.string.AreYouSureUnsaveSingleMessage);
                } else {
                    c2Var2.T = LocaleController.getString(R.string.AreYouSureUnsaveFewMessages);
                }
                if (messageObject == null) {
                    i20 = (!messageObject.isGiveaway() || messageObject.isForwarded()) ? 0 : i48;
                    if (i20 != 0) {
                        long j14 = ((TLRPC.TL_messageMediaGiveaway) messageObject.messageOwner.media).until_date * 1000;
                        str = LocaleController.getInstance().getFormatterGiveawayMonthDayYear().format(new Date(j14));
                        i20 = System.currentTimeMillis() < j14 ? i48 : 0;
                    }
                    str = null;
                } else if (i19 == i48) {
                    int i54 = 0;
                    str = null;
                    for (int i55 = i48; i55 >= 0; i55--) {
                        for (int i56 = 0; i56 < sparseArrayArr[i55].size(); i56++) {
                            MessageObject messageObject7 = (MessageObject) sparseArrayArr[i55].valueAt(i56);
                            int i57 = (!messageObject7.isGiveaway() || messageObject7.isForwarded()) ? 0 : i48;
                            if (i57 != 0) {
                                long j15 = ((TLRPC.TL_messageMediaGiveaway) messageObject7.messageOwner.media).until_date * 1000;
                                str = LocaleController.getInstance().getFormatterGiveawayMonthDayYear().format(new Date(j15));
                                i54 = System.currentTimeMillis() < j15 ? i48 : 0;
                            } else {
                                i54 = i57;
                            }
                        }
                    }
                    i20 = i54;
                } else {
                    i20 = 0;
                    str = null;
                }
                if (z27) {
                    alertDialog$Builder = alertDialog$Builder2;
                    if (z31) {
                        int i58 = (int) MessagesController.getInstance(i45).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS);
                        c2Var2.R = LocaleController.getString(R.string.SuggestionTONWillBeLost);
                        int i59 = R.string.SuggestionTONWillBeLostInfo;
                        Object[] objArr6 = new Object[i48];
                        objArr6[0] = Integer.valueOf(i58);
                        c2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatString(i59, objArr6));
                        alertDialog$Builder.k(LocaleController.getString(R.string.SuggestionStarsWillBeLostDelete), z1Var5);
                    } else if (i20 == 0 || z19) {
                        alertDialog$Builder.k(LocaleController.getString(z19 ? R.string.Remove : R.string.Delete), z1Var5);
                    } else {
                        c2Var2.R = LocaleController.getString(R.string.BoostingGiveawayDeleteMsgTitle);
                        int i60 = R.string.BoostingGiveawayDeleteMsgText;
                        Object[] objArr7 = new Object[i48];
                        objArr7[0] = str;
                        c2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatString(i60, objArr7));
                        alertDialog$Builder.i(LocaleController.getString(R.string.Delete), z1Var5);
                    }
                } else {
                    int i61 = (int) MessagesController.getInstance(i45).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS);
                    c2Var2.R = LocaleController.getString(R.string.SuggestionStarsWillBeLost);
                    int i62 = R.string.SuggestionStarsWillBeLostInfo;
                    Object[] objArr8 = new Object[i48];
                    objArr8[0] = Integer.valueOf(i61);
                    c2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatString(i62, objArr8));
                    alertDialog$Builder = alertDialog$Builder2;
                    alertDialog$Builder.k(LocaleController.getString(R.string.SuggestionStarsWillBeLostDelete), z1Var5);
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                c2Var2.N = new r0(i48, runnable2);
                o2Var.showDialog(c2Var2);
                textView = (TextView) c2Var2.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.q7, null);
                }
                textView2 = (TextView) c2Var2.d(-3);
                if (textView2 == null) {
                    c2Var2.v0.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f));
                    ((ViewGroup.MarginLayoutParams) c2Var2.v0.getLayoutParams()).topMargin = AndroidUtilities.dp(-8.0f);
                    org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.q7, null);
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
        c2Var = c2Var3;
        i17 = 0;
        z16 = false;
        z17 = false;
        final int i452 = i15;
        org.telegram.ui.ActionBar.c2 c2Var52 = c2Var;
        int i462 = i17;
        final long j132 = j11;
        int i472 = size;
        boolean z312 = z11;
        z19 = z10;
        int i482 = i16;
        org.telegram.ui.ActionBar.z1 z1Var52 = new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.Components.u0
            @Override // org.telegram.ui.ActionBar.z1
            public final void g(org.telegram.ui.ActionBar.c2 c2Var6, int i492) {
                SparseArray[] sparseArrayArr2;
                ArrayList<Long> arrayList4;
                boolean z32;
                long j142;
                int i502;
                long j152;
                long j16;
                ArrayList arrayList5;
                TLRPC.Peer peer;
                int i512;
                long j17;
                boolean z33 = z19;
                int i522 = i452;
                long clientUserId = z33 ? UserConfig.getInstance(i522).getClientUserId() : j132;
                MessageObject messageObject72 = messageObject;
                TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                long j18 = j10;
                int i532 = i10;
                boolean[] zArr2 = zArr;
                int i542 = i11;
                ArrayList<Long> arrayList6 = null;
                if (messageObject72 != null) {
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList<Integer> arrayList8 = new ArrayList<>();
                    MessageObject.GroupedMessages groupedMessages2 = groupedMessages;
                    if (groupedMessages2 != null) {
                        int i552 = 0;
                        while (i552 < groupedMessages2.messages.size()) {
                            MessageObject messageObject8 = groupedMessages2.messages.get(i552);
                            if (messageObject8.isEphemeral()) {
                                arrayList7.add(messageObject8);
                                i512 = i522;
                            } else {
                                i512 = i522;
                                arrayList8.add(Integer.valueOf(messageObject8.getId()));
                                if (encryptedChat2 != null) {
                                    j17 = clientUserId;
                                    if (messageObject8.messageOwner.random_id != 0 && messageObject8.type != 10) {
                                        if (arrayList6 == null) {
                                            arrayList6 = new ArrayList<>();
                                        }
                                        ArrayList<Long> arrayList9 = arrayList6;
                                        arrayList9.add(Long.valueOf(messageObject8.messageOwner.random_id));
                                        arrayList6 = arrayList9;
                                    }
                                    i552++;
                                    i522 = i512;
                                    clientUserId = j17;
                                }
                            }
                            j17 = clientUserId;
                            i552++;
                            i522 = i512;
                            clientUserId = j17;
                        }
                        i502 = i522;
                        j152 = clientUserId;
                    } else {
                        i502 = i522;
                        j152 = clientUserId;
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
                    long j19 = (j18 == 0 || (peer = messageObject72.messageOwner.peer_id) == null || peer.chat_id != (-j18)) ? j152 : j18;
                    if (arrayList8.isEmpty()) {
                        j16 = j19;
                        arrayList5 = arrayList7;
                    } else {
                        arrayList5 = arrayList7;
                        j16 = j19;
                        MessagesController.getInstance(i502).deleteMessages(arrayList8, arrayList6, encryptedChat2, j16, i532, zArr2[0], i542);
                    }
                    int size3 = arrayList5.size();
                    int i562 = 0;
                    while (i562 < size3) {
                        Object obj = arrayList5.get(i562);
                        i562++;
                        MessagesController.getInstance(i502).deleteEphemeralMessage(j16, i532, (MessageObject) obj);
                    }
                } else {
                    long j20 = clientUserId;
                    int i572 = 1;
                    while (i572 >= 0) {
                        ArrayList<Integer> arrayList11 = new ArrayList<>();
                        int i582 = 0;
                        while (true) {
                            sparseArrayArr2 = sparseArrayArr;
                            if (i582 >= sparseArrayArr2[i572].size()) {
                                break;
                            }
                            arrayList11.add(Integer.valueOf(sparseArrayArr2[i572].keyAt(i582)));
                            i582++;
                        }
                        if (encryptedChat2 != null) {
                            ArrayList<Long> arrayList12 = new ArrayList<>();
                            int i592 = 0;
                            while (i592 < sparseArrayArr2[i572].size()) {
                                MessageObject messageObject9 = (MessageObject) sparseArrayArr2[i572].valueAt(i592);
                                int i602 = i572;
                                long j21 = messageObject9.messageOwner.random_id;
                                if (j21 != 0 && messageObject9.type != 10) {
                                    arrayList12.add(Long.valueOf(j21));
                                }
                                i592++;
                                i572 = i602;
                            }
                            arrayList4 = arrayList12;
                        } else {
                            arrayList4 = null;
                        }
                        int i612 = i572;
                        MessagesController messagesController = MessagesController.getInstance(i522);
                        if (i612 != 1 || j18 == 0) {
                            z32 = 10;
                            j142 = j20;
                        } else {
                            z32 = 10;
                            j142 = j18;
                        }
                        messagesController.deleteMessages(arrayList11, arrayList4, encryptedChat2, j142, i532, zArr2[0], i542);
                        sparseArrayArr2[i612].clear();
                        i572 = i612 - 1;
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
        c2Var2.N = new r0(i482, runnable2);
        o2Var.showDialog(c2Var2);
        textView = (TextView) c2Var2.d(-1);
        if (textView != null) {
        }
        textView2 = (TextView) c2Var2.d(-3);
        if (textView2 == null) {
        }
    }
}
