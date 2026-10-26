package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ak0 extends org.telegram.ui.ActionBar.k3 implements NotificationCenter.NotificationCenterDelegate {
    public final zj0 b;
    public final org.telegram.ui.Components.ak0 c;
    public Utilities.Callback d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak0(Context context, boolean z10, Utilities.Callback callback) {
        super(context, false);
        final int i10 = 0;
        this.d = callback;
        final int i11 = 1;
        LinearLayout d = org.telegram.messenger.vh.d(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.ak0 ak0Var = new org.telegram.ui.Components.ak0(context);
        this.c = ak0Var;
        ak0Var.setScaleType(ImageView.ScaleType.CENTER);
        ak0Var.f(R.raw.silent_unmute, 46, 46, null);
        ak0Var.d();
        int dp = AndroidUtilities.dp(72.0f);
        int i12 = org.telegram.ui.ActionBar.y6.Oh;
        ShapeDrawable K = org.telegram.ui.ActionBar.y6.K(dp, org.telegram.ui.ActionBar.y6.x0(null, i12, false));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
        ak0Var.setBackground(K);
        org.telegram.ui.ActionBar.f7.k(ak0Var, K, N, null, null);
        frameLayout.addView(ak0Var, org.telegram.ui.Components.gb1.i(72, 72, 17));
        zj0 zj0Var = new zj0(context);
        this.b = zj0Var;
        frameLayout.addView(zj0Var, org.telegram.ui.Components.gb1.h(64, 32.0f, 49, 29.0f, 16.0f, 0.0f, 0.0f));
        zj0Var.a(0);
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.yj0
            public final /* synthetic */ ak0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        org.telegram.ui.Components.ak0 ak0Var2 = this.b.c;
                        if (!ak0Var2.b()) {
                            ak0Var2.setProgress(0.0f);
                            ak0Var2.d();
                            break;
                        }
                        break;
                    default:
                        ak0 ak0Var3 = this.b;
                        Utilities.Callback callback2 = ak0Var3.d;
                        if (callback2 != null) {
                            callback2.run(Boolean.TRUE);
                            ak0Var3.d = null;
                        }
                        ak0Var3.dismiss();
                        break;
                }
            }
        });
        d.addView(frameLayout, org.telegram.ui.Components.gb1.r(-1, 110));
        TextView textView = new TextView(context);
        int i13 = org.telegram.ui.ActionBar.y6.j5;
        org.telegram.ui.ActionBar.f7.V(textView, i13, null);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        textView.setPadding(d3.h(30.0f, R.string.NotificationsPermissionAlertTitle, textView), 0, AndroidUtilities.dp(30.0f), 0);
        d.addView(textView, org.telegram.ui.Components.gb1.r(-1, -2));
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.f7.V(textView2, i13, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setPadding(d3.h(30.0f, R.string.NotificationsPermissionAlertSubtitle, textView2), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(21.0f));
        d.addView(textView2, org.telegram.ui.Components.gb1.r(-1, -2));
        d.addView(new di.i4(context, LocaleController.getString(R.string.NotificationsPermissionAlert1), R.drawable.msg_message_s), org.telegram.ui.Components.gb1.r(-1, -2));
        d.addView(new di.i4(context, LocaleController.getString(R.string.NotificationsPermissionAlert2), R.drawable.msg_members_list2), org.telegram.ui.Components.gb1.r(-1, -2));
        d.addView(new di.i4(context, LocaleController.getString(R.string.NotificationsPermissionAlert3), R.drawable.msg_customize_s), org.telegram.ui.Components.gb1.r(-1, -2));
        setCustomView(d);
        fixNavigationBarKey(org.telegram.ui.ActionBar.y6.h5);
        TextView textView3 = new TextView(context);
        textView3.setText(LocaleController.getString(z10 ? R.string.NotificationsPermissionSettings : R.string.NotificationsPermissionContinue));
        textView3.setGravity(17);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(textView3, org.telegram.ui.ActionBar.y6.Sh, null);
        org.telegram.ui.Cells.y e = org.telegram.ui.ActionBar.o6.e(new float[]{24.0f}, org.telegram.ui.ActionBar.y6.x0(null, i12, false));
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i12);
        org.telegram.ui.ActionBar.b7 f7 = org.telegram.ui.ActionBar.f7.f(i12);
        textView3.setBackground(e);
        org.telegram.ui.ActionBar.f7.k(textView3, e, N2, f7, null);
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.yj0
            public final /* synthetic */ ak0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        org.telegram.ui.Components.ak0 ak0Var2 = this.b.c;
                        if (!ak0Var2.b()) {
                            ak0Var2.setProgress(0.0f);
                            ak0Var2.d();
                            break;
                        }
                        break;
                    default:
                        ak0 ak0Var3 = this.b;
                        Utilities.Callback callback2 = ak0Var3.d;
                        if (callback2 != null) {
                            callback2.run(Boolean.TRUE);
                            ak0Var3.d = null;
                        }
                        ak0Var3.dismiss();
                        break;
                }
            }
        });
        d.addView(textView3, org.telegram.ui.Components.gb1.o(14.0f, 14.0f, 14.0f, 10.0f, -1, 48));
        while (i10 < 4) {
            try {
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.updateInterfaces);
            } catch (Exception unused) {
            }
            i10++;
        }
    }

    public static void m() {
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

    public static boolean n(Activity activity) {
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
                    org.telegram.ui.Components.ak0 ak0Var = this.c;
                    if (ak0Var.b()) {
                        return;
                    }
                    ak0Var.setProgress(0.0f);
                    ak0Var.d();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public final void dismiss() {
        super.dismiss();
        Utilities.Callback callback = this.d;
        if (callback != null) {
            callback.run(Boolean.FALSE);
            this.d = null;
            m();
        }
        for (int i10 = 0; i10 < 4; i10++) {
            try {
                NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.updateInterfaces);
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog
    public final void show() {
        super.show();
        System.currentTimeMillis();
    }
}
