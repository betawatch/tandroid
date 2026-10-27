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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ck0 extends org.telegram.ui.ActionBar.k3 implements NotificationCenter.NotificationCenterDelegate {
    public final bk0 b;
    public final org.telegram.ui.Components.bk0 c;
    public Utilities.Callback d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck0(Context context, boolean z10, Utilities.Callback callback) {
        super(context, false);
        final int i10 = 0;
        this.d = callback;
        final int i11 = 1;
        LinearLayout d = org.telegram.messenger.wh.d(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.bk0 bk0Var = new org.telegram.ui.Components.bk0(context);
        this.c = bk0Var;
        bk0Var.setScaleType(ImageView.ScaleType.CENTER);
        bk0Var.f(R.raw.silent_unmute, 46, 46, null);
        bk0Var.d();
        int dp = AndroidUtilities.dp(72.0f);
        int i12 = org.telegram.ui.ActionBar.y6.Oh;
        ShapeDrawable K = org.telegram.ui.ActionBar.y6.K(dp, org.telegram.ui.ActionBar.y6.x0(null, i12, false));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
        bk0Var.setBackground(K);
        org.telegram.ui.ActionBar.f7.k(bk0Var, K, N, null, null);
        frameLayout.addView(bk0Var, org.telegram.ui.Components.kb1.i(72, 72, 17));
        bk0 bk0Var2 = new bk0(context);
        this.b = bk0Var2;
        frameLayout.addView(bk0Var2, org.telegram.ui.Components.kb1.h(64, 32.0f, 49, 29.0f, 16.0f, 0.0f, 0.0f));
        bk0Var2.a(0);
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ak0
            public final /* synthetic */ ck0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        org.telegram.ui.Components.bk0 bk0Var3 = this.b.c;
                        if (!bk0Var3.b()) {
                            bk0Var3.setProgress(0.0f);
                            bk0Var3.d();
                            break;
                        }
                        break;
                    default:
                        ck0 ck0Var = this.b;
                        Utilities.Callback callback2 = ck0Var.d;
                        if (callback2 != null) {
                            callback2.run(Boolean.TRUE);
                            ck0Var.d = null;
                        }
                        ck0Var.dismiss();
                        break;
                }
            }
        });
        d.addView(frameLayout, org.telegram.ui.Components.kb1.r(-1, 110));
        TextView textView = new TextView(context);
        int i13 = org.telegram.ui.ActionBar.y6.j5;
        org.telegram.ui.ActionBar.f7.V(textView, i13, null);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        textView.setPadding(d3.h(30.0f, R.string.NotificationsPermissionAlertTitle, textView), 0, AndroidUtilities.dp(30.0f), 0);
        d.addView(textView, org.telegram.ui.Components.kb1.r(-1, -2));
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.f7.V(textView2, i13, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setPadding(d3.h(30.0f, R.string.NotificationsPermissionAlertSubtitle, textView2), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(21.0f));
        d.addView(textView2, org.telegram.ui.Components.kb1.r(-1, -2));
        d.addView(new di.i4(context, LocaleController.getString(R.string.NotificationsPermissionAlert1), R.drawable.msg_message_s), org.telegram.ui.Components.kb1.r(-1, -2));
        d.addView(new di.i4(context, LocaleController.getString(R.string.NotificationsPermissionAlert2), R.drawable.msg_members_list2), org.telegram.ui.Components.kb1.r(-1, -2));
        d.addView(new di.i4(context, LocaleController.getString(R.string.NotificationsPermissionAlert3), R.drawable.msg_customize_s), org.telegram.ui.Components.kb1.r(-1, -2));
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
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ak0
            public final /* synthetic */ ck0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        org.telegram.ui.Components.bk0 bk0Var3 = this.b.c;
                        if (!bk0Var3.b()) {
                            bk0Var3.setProgress(0.0f);
                            bk0Var3.d();
                            break;
                        }
                        break;
                    default:
                        ck0 ck0Var = this.b;
                        Utilities.Callback callback2 = ck0Var.d;
                        if (callback2 != null) {
                            callback2.run(Boolean.TRUE);
                            ck0Var.d = null;
                        }
                        ck0Var.dismiss();
                        break;
                }
            }
        });
        d.addView(textView3, org.telegram.ui.Components.kb1.o(14.0f, 14.0f, 14.0f, 10.0f, -1, 48));
        while (i10 < 4) {
            try {
                NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.updateInterfaces);
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
                    org.telegram.ui.Components.bk0 bk0Var = this.c;
                    if (bk0Var.b()) {
                        return;
                    }
                    bk0Var.setProgress(0.0f);
                    bk0Var.d();
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
