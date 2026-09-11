package org.telegram.ui.Components;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Path;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class oo {
    public final org.telegram.ui.ActionBar.f1 a;
    public final org.telegram.ui.ActionBar.f1 b;
    public final org.telegram.ui.ActionBar.f1 c;
    public final org.telegram.ui.ActionBar.f1 d;
    public final org.telegram.ui.ActionBar.f1 e;
    public final mo f;
    public final int g;
    public org.telegram.ui.ActionBar.n1 h;
    public final no i;
    public long j;
    public int k;
    public int l;
    public final FrameLayout m;
    public final TextView n;
    public int o;

    public oo(Context context, int i10, ug0 ug0Var, boolean z10, final no noVar, org.telegram.ui.ActionBar.f6 f6Var) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        Integer num;
        this.g = i10;
        this.i = noVar;
        mo moVar = new mo(context, z10 ? R.drawable.popup_fixed_alert : 0, 0, f6Var, 0);
        moVar.U = new Path();
        this.f = moVar;
        moVar.setFitItems(true);
        if (ug0Var != null) {
            num = 1;
            actionBarPopupWindow$ActionBarPopupWindowLayout = moVar;
            org.telegram.ui.ActionBar.f1 c10 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, f6Var);
            this.a = c10;
            c10.setOnClickListener(new n8(ug0Var, 1));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout = moVar;
            num = 1;
        }
        org.telegram.ui.ActionBar.f1 c11 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), false, f6Var);
        this.b = c11;
        final int i11 = 0;
        c11.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ko
            public final /* synthetic */ oo b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.b.a();
                        noVar.s();
                        break;
                    case 1:
                        oo ooVar = this.b;
                        ooVar.a();
                        noVar.x(ooVar.l);
                        break;
                    case 2:
                        oo ooVar2 = this.b;
                        ooVar2.a();
                        noVar.x(ooVar2.k);
                        break;
                    case 3:
                        this.b.a();
                        noVar.p();
                        break;
                    case 4:
                        this.b.a();
                        AndroidUtilities.runOnUIThread(new pg(noVar, 27));
                        break;
                    default:
                        noVar.m();
                        this.b.a();
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.f1 c12 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute_1h, LocaleController.getString(R.string.MuteFor1h), false, f6Var);
        this.d = c12;
        final int i12 = 1;
        c12.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ko
            public final /* synthetic */ oo b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.b.a();
                        noVar.s();
                        break;
                    case 1:
                        oo ooVar = this.b;
                        ooVar.a();
                        noVar.x(ooVar.l);
                        break;
                    case 2:
                        oo ooVar2 = this.b;
                        ooVar2.a();
                        noVar.x(ooVar2.k);
                        break;
                    case 3:
                        this.b.a();
                        noVar.p();
                        break;
                    case 4:
                        this.b.a();
                        AndroidUtilities.runOnUIThread(new pg(noVar, 27));
                        break;
                    default:
                        noVar.m();
                        this.b.a();
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.f1 c13 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute_1h, LocaleController.getString(R.string.MuteFor1h), false, f6Var);
        this.e = c13;
        final int i13 = 2;
        c13.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ko
            public final /* synthetic */ oo b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.b.a();
                        noVar.s();
                        break;
                    case 1:
                        oo ooVar = this.b;
                        ooVar.a();
                        noVar.x(ooVar.l);
                        break;
                    case 2:
                        oo ooVar2 = this.b;
                        ooVar2.a();
                        noVar.x(ooVar2.k);
                        break;
                    case 3:
                        this.b.a();
                        noVar.p();
                        break;
                    case 4:
                        this.b.a();
                        AndroidUtilities.runOnUIThread(new pg(noVar, 27));
                        break;
                    default:
                        noVar.m();
                        this.b.a();
                        break;
                }
            }
        });
        Integer num2 = num;
        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), false, f6Var).setOnClickListener(new lo(this, context, f6Var, i10, noVar, 0));
        final int i14 = 3;
        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), false, f6Var).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ko
            public final /* synthetic */ oo b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        this.b.a();
                        noVar.s();
                        break;
                    case 1:
                        oo ooVar = this.b;
                        ooVar.a();
                        noVar.x(ooVar.l);
                        break;
                    case 2:
                        oo ooVar2 = this.b;
                        ooVar2.a();
                        noVar.x(ooVar2.k);
                        break;
                    case 3:
                        this.b.a();
                        noVar.p();
                        break;
                    case 4:
                        this.b.a();
                        AndroidUtilities.runOnUIThread(new pg(noVar, 27));
                        break;
                    default:
                        noVar.m();
                        this.b.a();
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.f1 c14 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, "", false, f6Var);
        this.c = c14;
        final int i15 = 4;
        c14.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ko
            public final /* synthetic */ oo b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        this.b.a();
                        noVar.s();
                        break;
                    case 1:
                        oo ooVar = this.b;
                        ooVar.a();
                        noVar.x(ooVar.l);
                        break;
                    case 2:
                        oo ooVar2 = this.b;
                        ooVar2.a();
                        noVar.x(ooVar2.k);
                        break;
                    case 3:
                        this.b.a();
                        noVar.p();
                        break;
                    case 4:
                        this.b.a();
                        AndroidUtilities.runOnUIThread(new pg(noVar, 27));
                        break;
                    default:
                        noVar.m();
                        this.b.a();
                        break;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.m = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.H8, f6Var));
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, w7.x5.n(-1, 8));
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var));
        frameLayout.setTag(R.id.fit_width_tag, num2);
        textView.setTag(R.id.fit_width_tag, num2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, w7.x5.n(-2, -2));
        textView.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I5, f6Var), 0, 6));
        final int i16 = 5;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ko
            public final /* synthetic */ oo b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        this.b.a();
                        noVar.s();
                        break;
                    case 1:
                        oo ooVar = this.b;
                        ooVar.a();
                        noVar.x(ooVar.l);
                        break;
                    case 2:
                        oo ooVar2 = this.b;
                        ooVar2.a();
                        noVar.x(ooVar2.k);
                        break;
                    case 3:
                        this.b.a();
                        noVar.p();
                        break;
                    case 4:
                        this.b.a();
                        AndroidUtilities.runOnUIThread(new pg(noVar, 27));
                        break;
                    default:
                        noVar.m();
                        this.b.a();
                        break;
                }
            }
        });
    }

    public static String b(int i10) {
        StringBuilder sb2 = new StringBuilder();
        int i11 = i10 / 86400;
        int i12 = i10 - (86400 * i11);
        int i13 = i12 / 3600;
        int i14 = (i12 - (i13 * 3600)) / 60;
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append(LocaleController.getString(R.string.SecretChatTimerDays));
        }
        if (i13 != 0) {
            if (sb2.length() > 0) {
                sb2.append(" ");
            }
            sb2.append(i13);
            sb2.append(LocaleController.getString(R.string.SecretChatTimerHours));
        }
        if (i14 != 0) {
            if (sb2.length() > 0) {
                sb2.append(" ");
            }
            sb2.append(i14);
            sb2.append(LocaleController.getString(R.string.SecretChatTimerMinutes));
        }
        return LocaleController.formatString("MuteForButton", R.string.MuteForButton, sb2.toString());
    }

    public final void a() {
        org.telegram.ui.ActionBar.n1 n1Var = this.h;
        if (n1Var != null) {
            n1Var.d(true);
            this.h.d(true);
        }
        this.i.dismiss();
        this.j = System.currentTimeMillis();
    }

    public final void c(org.telegram.ui.ActionBar.n2 n2Var, View view, float f7, float f10, boolean z10) {
        float measuredWidth;
        float measuredHeight;
        if (n2Var.getFragmentView() == null) {
            return;
        }
        mo moVar = this.f;
        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(moVar, -2, -2);
        this.h = n1Var;
        n1Var.e = true;
        n1Var.c = 220;
        n1Var.setOutsideTouchable(true);
        this.h.setClippingEnabled(true);
        this.h.setAnimationStyle(R.style.PopupContextAnimation);
        this.h.setFocusable(true);
        moVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
        this.h.setInputMethodMode(2);
        this.h.getContentView().setFocusableInTouchMode(true);
        while (view != n2Var.getFragmentView()) {
            if (view.getParent() == null) {
                return;
            }
            f7 += view.getX();
            f10 += view.getY();
            view = (View) view.getParent();
        }
        if (z10) {
            measuredWidth = f7 - AndroidUtilities.dpf2(8.0f);
            measuredHeight = AndroidUtilities.dpf2(16.0f);
        } else {
            measuredWidth = f7 - (moVar.getMeasuredWidth() / 2.0f);
            measuredHeight = moVar.getMeasuredHeight() / 2.0f;
        }
        this.h.showAtLocation(n2Var.getFragmentView(), 0, (int) measuredWidth, (int) (f10 - measuredHeight));
        this.h.b();
    }

    public final void d(long j3, long j10, HashSet hashSet) {
        int i10;
        int i11;
        int i12;
        if (System.currentTimeMillis() - this.j < 200) {
            AndroidUtilities.runOnUIThread(new a3.f0(this, j3, j10, hashSet, 11));
            return;
        }
        int i13 = this.g;
        boolean isDialogMuted = MessagesController.getInstance(i13).isDialogMuted(j3, j10);
        org.telegram.ui.ActionBar.f1 f1Var = this.b;
        org.telegram.ui.ActionBar.f1 f1Var2 = this.c;
        if (isDialogMuted) {
            f1Var2.g(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute, null);
            i10 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.x6, false);
            f1Var.setVisibility(8);
        } else {
            f1Var2.g(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute, null);
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false);
            f1Var.setVisibility(0);
            if (MessagesController.getInstance(i13).isDialogNotificationsSoundEnabled(j3, j10)) {
                f1Var.g(LocaleController.getString(R.string.SoundOff), R.drawable.msg_tone_off, null);
            } else {
                f1Var.g(LocaleController.getString(R.string.SoundOn), R.drawable.msg_tone_on, null);
            }
            i10 = w02;
        }
        if (this.o == 1) {
            this.a.setVisibility(8);
        }
        if (isDialogMuted || this.o == 1) {
            i11 = 0;
            i12 = 0;
        } else {
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i13);
            i12 = notificationsSettings.getInt("last_selected_mute_until_time", 0);
            i11 = notificationsSettings.getInt("last_selected_mute_until_time2", 0);
        }
        org.telegram.ui.ActionBar.f1 f1Var3 = this.d;
        if (i12 != 0) {
            this.l = i12;
            f1Var3.setVisibility(0);
            f1Var3.getImageView().setImageDrawable(u11.a(i12));
            f1Var3.setText(b(i12));
        } else {
            f1Var3.setVisibility(8);
        }
        org.telegram.ui.ActionBar.f1 f1Var4 = this.e;
        if (i11 != 0) {
            this.k = i11;
            f1Var4.setVisibility(0);
            f1Var4.getImageView().setImageDrawable(u11.a(i11));
            f1Var4.setText(b(i11));
        } else {
            f1Var4.setVisibility(8);
        }
        f1Var2.c(i10, i10);
        f1Var2.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.1f, i10));
        FrameLayout frameLayout = this.m;
        TextView textView = this.n;
        if (hashSet == null || hashSet.isEmpty()) {
            frameLayout.setVisibility(8);
            textView.setVisibility(8);
        } else {
            frameLayout.setVisibility(0);
            textView.setVisibility(0);
            textView.setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("TopicNotificationsExceptions", hashSet.size(), new Object[0]), org.telegram.ui.ActionBar.j6.n6, 1, null));
        }
    }
}
