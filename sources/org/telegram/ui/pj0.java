package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class pj0 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public final oj0 b;
    public final org.telegram.ui.Components.xj0 c;
    public Utilities.Callback d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj0(Context context, boolean z10, Utilities.Callback callback) {
        super(context, false);
        final int i10 = 0;
        this.d = callback;
        final int i11 = 1;
        LinearLayout e = org.telegram.messenger.kk.e(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.xj0 xj0Var = new org.telegram.ui.Components.xj0(context);
        this.c = xj0Var;
        xj0Var.setScaleType(ImageView.ScaleType.CENTER);
        xj0Var.f(R.raw.silent_unmute, 46, 46, null);
        xj0Var.d();
        int dp = AndroidUtilities.dp(72.0f);
        int i12 = org.telegram.ui.ActionBar.h6.Oh;
        xj0Var.setBackground(org.telegram.ui.ActionBar.h6.K(dp, org.telegram.ui.ActionBar.h6.x0(null, i12, false)));
        frameLayout.addView(xj0Var, w7.z5.e(72, 72, 17));
        oj0 oj0Var = new oj0(context);
        this.b = oj0Var;
        frameLayout.addView(oj0Var, w7.z5.d(64, 32.0f, 49, 29.0f, 16.0f, 0.0f, 0.0f));
        oj0Var.a(0);
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.nj0
            public final /* synthetic */ pj0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        org.telegram.ui.Components.xj0 xj0Var2 = this.b.c;
                        if (!xj0Var2.b()) {
                            xj0Var2.setProgress(0.0f);
                            xj0Var2.d();
                            break;
                        }
                        break;
                    default:
                        pj0 pj0Var = this.b;
                        Utilities.Callback callback2 = pj0Var.d;
                        if (callback2 != null) {
                            callback2.run(Boolean.TRUE);
                            pj0Var.d = null;
                        }
                        pj0Var.dismiss();
                        break;
                }
            }
        });
        e.addView(frameLayout, w7.z5.n(-1, 110));
        TextView textView = new TextView(context);
        int i13 = org.telegram.ui.ActionBar.h6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        textView.setPadding(org.telegram.ui.Cells.c1.e(30.0f, R.string.NotificationsPermissionAlertTitle, textView), 0, AndroidUtilities.dp(30.0f), 0);
        e.addView(textView, w7.z5.n(-1, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setPadding(org.telegram.ui.Cells.c1.e(30.0f, R.string.NotificationsPermissionAlertSubtitle, textView2), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(21.0f));
        e.addView(textView2, w7.z5.n(-1, -2));
        e.addView(new ci.i4(context, LocaleController.getString(R.string.NotificationsPermissionAlert1), R.drawable.msg_message_s), w7.z5.n(-1, -2));
        e.addView(new ci.i4(context, LocaleController.getString(R.string.NotificationsPermissionAlert2), R.drawable.msg_members_list2), w7.z5.n(-1, -2));
        e.addView(new ci.i4(context, LocaleController.getString(R.string.NotificationsPermissionAlert3), R.drawable.msg_customize_s), w7.z5.n(-1, -2));
        setCustomView(e);
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.h6.h5));
        TextView textView3 = new TextView(context);
        textView3.setText(LocaleController.getString(z10 ? R.string.NotificationsPermissionSettings : R.string.NotificationsPermissionContinue));
        textView3.setGravity(17);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false));
        textView3.setBackground(org.telegram.ui.ActionBar.x5.e(new float[]{24.0f}, org.telegram.ui.ActionBar.h6.x0(null, i12, false)));
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.nj0
            public final /* synthetic */ pj0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        org.telegram.ui.Components.xj0 xj0Var2 = this.b.c;
                        if (!xj0Var2.b()) {
                            xj0Var2.setProgress(0.0f);
                            xj0Var2.d();
                            break;
                        }
                        break;
                    default:
                        pj0 pj0Var = this.b;
                        Utilities.Callback callback2 = pj0Var.d;
                        if (callback2 != null) {
                            callback2.run(Boolean.TRUE);
                            pj0Var.d = null;
                        }
                        pj0Var.dismiss();
                        break;
                }
            }
        });
        e.addView(textView3, w7.z5.k(14.0f, 14.0f, 14.0f, 10.0f, -1, 48));
        while (i10 < 4) {
            try {
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.updateInterfaces);
            } catch (Exception unused) {
            }
            i10++;
        }
    }

    public static void n() {
        long j10 = MessagesController.getGlobalMainSettings().getLong("askNotificationsDuration", 86400000L);
        long currentTimeMillis = System.currentTimeMillis() + j10;
        long j11 = 259200000;
        if (j10 >= 259200000) {
            j11 = 604800000;
            if (j10 >= 604800000) {
                j11 = 2592000000L;
            }
        }
        MessagesController.getGlobalMainSettings().edit().putLong("askNotificationsAfter", currentTimeMillis).putLong("askNotificationsDuration", j11).apply();
    }

    public static boolean o(Activity activity) {
        if (activity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
            return false;
        }
        long j10 = MessagesController.getGlobalMainSettings().getLong("askNotificationsAfter", -1L);
        if (j10 != -2) {
            return j10 < 0 || System.currentTimeMillis() >= j10;
        }
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.updateInterfaces) {
            if ((((Integer) objArr[0]).intValue() & MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE) >= 0) {
                int i12 = 0;
                for (int i13 = 0; i13 < 4; i13++) {
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i13);
                    if (messagesStorage != null) {
                        i12 = messagesStorage.getMainUnreadCount() + i12;
                    }
                }
                if (this.b.a(i12)) {
                    org.telegram.ui.Components.xj0 xj0Var = this.c;
                    if (xj0Var.b()) {
                        return;
                    }
                    xj0Var.setProgress(0.0f);
                    xj0Var.d();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        Utilities.Callback callback = this.d;
        if (callback != null) {
            callback.run(Boolean.FALSE);
            this.d = null;
            n();
        }
        for (int i10 = 0; i10 < 4; i10++) {
            try {
                NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.updateInterfaces);
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        super.show();
        System.currentTimeMillis();
    }
}
