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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class no {
    public final org.telegram.ui.ActionBar.g1 a;
    public final org.telegram.ui.ActionBar.g1 b;
    public final org.telegram.ui.ActionBar.g1 c;
    public final org.telegram.ui.ActionBar.g1 d;
    public final org.telegram.ui.ActionBar.g1 e;
    public final lo f;
    public final int g;
    public org.telegram.ui.ActionBar.p1 h;
    public final mo i;
    public long j;
    public int k;
    public int l;
    public final FrameLayout m;
    public final TextView n;
    public int o;

    public no(Context context, int i10, ch0 ch0Var, boolean z4, final mo moVar, org.telegram.ui.ActionBar.g6 g6Var) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        Integer num;
        this.g = i10;
        this.i = moVar;
        lo loVar = new lo(context, z4 ? R.drawable.popup_fixed_alert : 0, 0, g6Var, 0);
        loVar.R = new Path();
        this.f = loVar;
        loVar.setFitItems(true);
        if (ch0Var != null) {
            num = 1;
            actionBarPopupWindow$ActionBarPopupWindowLayout = loVar;
            org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, g6Var);
            this.a = c3;
            c3.setOnClickListener(new e8(ch0Var, 1));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout = loVar;
            num = 1;
        }
        org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), false, g6Var);
        this.b = c10;
        final int i11 = 0;
        c10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jo
            public final /* synthetic */ no b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.b.a();
                        moVar.u();
                        break;
                    case 1:
                        no noVar = this.b;
                        noVar.a();
                        moVar.v(noVar.l);
                        break;
                    case 2:
                        no noVar2 = this.b;
                        noVar2.a();
                        moVar.v(noVar2.k);
                        break;
                    case 3:
                        this.b.a();
                        moVar.o();
                        break;
                    case 4:
                        this.b.a();
                        AndroidUtilities.runOnUIThread(new fg(moVar, 27));
                        break;
                    default:
                        moVar.j();
                        this.b.a();
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute_1h, LocaleController.getString(R.string.MuteFor1h), false, g6Var);
        this.d = c11;
        final int i12 = 1;
        c11.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jo
            public final /* synthetic */ no b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.b.a();
                        moVar.u();
                        break;
                    case 1:
                        no noVar = this.b;
                        noVar.a();
                        moVar.v(noVar.l);
                        break;
                    case 2:
                        no noVar2 = this.b;
                        noVar2.a();
                        moVar.v(noVar2.k);
                        break;
                    case 3:
                        this.b.a();
                        moVar.o();
                        break;
                    case 4:
                        this.b.a();
                        AndroidUtilities.runOnUIThread(new fg(moVar, 27));
                        break;
                    default:
                        moVar.j();
                        this.b.a();
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.g1 c12 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute_1h, LocaleController.getString(R.string.MuteFor1h), false, g6Var);
        this.e = c12;
        final int i13 = 2;
        c12.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jo
            public final /* synthetic */ no b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.b.a();
                        moVar.u();
                        break;
                    case 1:
                        no noVar = this.b;
                        noVar.a();
                        moVar.v(noVar.l);
                        break;
                    case 2:
                        no noVar2 = this.b;
                        noVar2.a();
                        moVar.v(noVar2.k);
                        break;
                    case 3:
                        this.b.a();
                        moVar.o();
                        break;
                    case 4:
                        this.b.a();
                        AndroidUtilities.runOnUIThread(new fg(moVar, 27));
                        break;
                    default:
                        moVar.j();
                        this.b.a();
                        break;
                }
            }
        });
        Integer num2 = num;
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), false, g6Var).setOnClickListener(new ko(this, context, g6Var, i10, moVar, 0));
        final int i14 = 3;
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), false, g6Var).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jo
            public final /* synthetic */ no b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        this.b.a();
                        moVar.u();
                        break;
                    case 1:
                        no noVar = this.b;
                        noVar.a();
                        moVar.v(noVar.l);
                        break;
                    case 2:
                        no noVar2 = this.b;
                        noVar2.a();
                        moVar.v(noVar2.k);
                        break;
                    case 3:
                        this.b.a();
                        moVar.o();
                        break;
                    case 4:
                        this.b.a();
                        AndroidUtilities.runOnUIThread(new fg(moVar, 27));
                        break;
                    default:
                        moVar.j();
                        this.b.a();
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.g1 c13 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, "", false, g6Var);
        this.c = c13;
        final int i15 = 4;
        c13.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jo
            public final /* synthetic */ no b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        this.b.a();
                        moVar.u();
                        break;
                    case 1:
                        no noVar = this.b;
                        noVar.a();
                        moVar.v(noVar.l);
                        break;
                    case 2:
                        no noVar2 = this.b;
                        noVar2.a();
                        moVar.v(noVar2.k);
                        break;
                    case 3:
                        this.b.a();
                        moVar.o();
                        break;
                    case 4:
                        this.b.a();
                        AndroidUtilities.runOnUIThread(new fg(moVar, 27));
                        break;
                    default:
                        moVar.j();
                        this.b.a();
                        break;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.m = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.H8, g6Var));
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, k7.c6.n(-1, 8));
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.E8, g6Var));
        frameLayout.setTag(R.id.fit_width_tag, num2);
        textView.setTag(R.id.fit_width_tag, num2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, k7.c6.n(-2, -2));
        textView.setBackground(org.telegram.ui.ActionBar.k6.Y(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.I5, g6Var), 0, 6));
        final int i16 = 5;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jo
            public final /* synthetic */ no b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        this.b.a();
                        moVar.u();
                        break;
                    case 1:
                        no noVar = this.b;
                        noVar.a();
                        moVar.v(noVar.l);
                        break;
                    case 2:
                        no noVar2 = this.b;
                        noVar2.a();
                        moVar.v(noVar2.k);
                        break;
                    case 3:
                        this.b.a();
                        moVar.o();
                        break;
                    case 4:
                        this.b.a();
                        AndroidUtilities.runOnUIThread(new fg(moVar, 27));
                        break;
                    default:
                        moVar.j();
                        this.b.a();
                        break;
                }
            }
        });
    }

    public static String b(int i10) {
        StringBuilder sb = new StringBuilder();
        int i11 = i10 / 86400;
        int i12 = i10 - (86400 * i11);
        int i13 = i12 / 3600;
        int i14 = (i12 - (i13 * 3600)) / 60;
        if (i11 != 0) {
            sb.append(i11);
            sb.append(LocaleController.getString(R.string.SecretChatTimerDays));
        }
        if (i13 != 0) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(i13);
            sb.append(LocaleController.getString(R.string.SecretChatTimerHours));
        }
        if (i14 != 0) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(i14);
            sb.append(LocaleController.getString(R.string.SecretChatTimerMinutes));
        }
        return LocaleController.formatString("MuteForButton", R.string.MuteForButton, sb.toString());
    }

    public final void a() {
        org.telegram.ui.ActionBar.p1 p1Var = this.h;
        if (p1Var != null) {
            p1Var.d(true);
            this.h.d(true);
        }
        this.i.dismiss();
        this.j = System.currentTimeMillis();
    }

    public final void c(org.telegram.ui.ActionBar.p2 p2Var, View view, float f10, float f11, boolean z4) {
        float measuredWidth;
        float measuredHeight;
        if (p2Var.getFragmentView() == null) {
            return;
        }
        lo loVar = this.f;
        org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(loVar, -2, -2);
        this.h = p1Var;
        p1Var.e = true;
        p1Var.c = 220;
        p1Var.setOutsideTouchable(true);
        this.h.setClippingEnabled(true);
        this.h.setAnimationStyle(R.style.PopupContextAnimation);
        this.h.setFocusable(true);
        loVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
        this.h.setInputMethodMode(2);
        this.h.getContentView().setFocusableInTouchMode(true);
        while (view != p2Var.getFragmentView()) {
            if (view.getParent() == null) {
                return;
            }
            f10 += view.getX();
            f11 += view.getY();
            view = (View) view.getParent();
        }
        if (z4) {
            measuredWidth = f10 - AndroidUtilities.dpf2(8.0f);
            measuredHeight = AndroidUtilities.dpf2(16.0f);
        } else {
            measuredWidth = f10 - (loVar.getMeasuredWidth() / 2.0f);
            measuredHeight = loVar.getMeasuredHeight() / 2.0f;
        }
        this.h.showAtLocation(p2Var.getFragmentView(), 0, (int) measuredWidth, (int) (f11 - measuredHeight));
        this.h.b();
    }

    public final void d(long j10, long j11, HashSet hashSet) {
        int i10;
        int i11;
        int i12;
        if (System.currentTimeMillis() - this.j < 200) {
            AndroidUtilities.runOnUIThread(new i5.x(this, j10, j11, hashSet, 12));
            return;
        }
        int i13 = this.g;
        boolean isDialogMuted = MessagesController.getInstance(i13).isDialogMuted(j10, j11);
        org.telegram.ui.ActionBar.g1 g1Var = this.b;
        org.telegram.ui.ActionBar.g1 g1Var2 = this.c;
        if (isDialogMuted) {
            g1Var2.g(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute, null);
            i10 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.x6, false);
            g1Var.setVisibility(8);
        } else {
            g1Var2.g(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute, null);
            int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.q7, false);
            g1Var.setVisibility(0);
            if (MessagesController.getInstance(i13).isDialogNotificationsSoundEnabled(j10, j11)) {
                g1Var.g(LocaleController.getString(R.string.SoundOff), R.drawable.msg_tone_off, null);
            } else {
                g1Var.g(LocaleController.getString(R.string.SoundOn), R.drawable.msg_tone_on, null);
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
        org.telegram.ui.ActionBar.g1 g1Var3 = this.d;
        if (i12 != 0) {
            this.l = i12;
            g1Var3.setVisibility(0);
            g1Var3.getImageView().setImageDrawable(x11.a(i12));
            g1Var3.setText(b(i12));
        } else {
            g1Var3.setVisibility(8);
        }
        org.telegram.ui.ActionBar.g1 g1Var4 = this.e;
        if (i11 != 0) {
            this.k = i11;
            g1Var4.setVisibility(0);
            g1Var4.getImageView().setImageDrawable(x11.a(i11));
            g1Var4.setText(b(i11));
        } else {
            g1Var4.setVisibility(8);
        }
        g1Var2.c(i10, i10);
        g1Var2.setSelectorColor(org.telegram.ui.ActionBar.k6.l1(0.1f, i10));
        FrameLayout frameLayout = this.m;
        TextView textView = this.n;
        if (hashSet == null || hashSet.isEmpty()) {
            frameLayout.setVisibility(8);
            textView.setVisibility(8);
        } else {
            frameLayout.setVisibility(0);
            textView.setVisibility(0);
            textView.setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("TopicNotificationsExceptions", hashSet.size(), new Object[0]), org.telegram.ui.ActionBar.k6.n6, 1, null));
        }
    }
}
