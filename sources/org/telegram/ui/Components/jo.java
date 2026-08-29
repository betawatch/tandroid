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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class jo {
    public final org.telegram.ui.ActionBar.g1 a;
    public final org.telegram.ui.ActionBar.g1 b;
    public final org.telegram.ui.ActionBar.g1 c;
    public final org.telegram.ui.ActionBar.g1 d;
    public final org.telegram.ui.ActionBar.g1 e;
    public final ho f;
    public final int g;
    public org.telegram.ui.ActionBar.o1 h;
    public final io i;
    public long j;
    public int k;
    public int l;
    public final FrameLayout m;
    public final TextView n;
    public int o;

    public jo(Context context, int i10, qg0 qg0Var, boolean z10, final io ioVar, org.telegram.ui.ActionBar.c6 c6Var) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        Integer num;
        this.g = i10;
        this.i = ioVar;
        ho hoVar = new ho(context, z10 ? R.drawable.popup_fixed_alert : 0, 0, c6Var, 0);
        hoVar.Q = new Path();
        this.f = hoVar;
        hoVar.setFitItems(true);
        if (qg0Var != null) {
            num = 1;
            actionBarPopupWindow$ActionBarPopupWindowLayout = hoVar;
            org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, c6Var);
            this.a = c3;
            c3.setOnClickListener(new j8(qg0Var, 1));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout = hoVar;
            num = 1;
        }
        org.telegram.ui.ActionBar.g1 c6 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), false, c6Var);
        this.b = c6;
        final int i11 = 0;
        c6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fo
            public final /* synthetic */ jo b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.b.a();
                        ioVar.u();
                        break;
                    case 1:
                        jo joVar = this.b;
                        joVar.a();
                        ioVar.w(joVar.l);
                        break;
                    case 2:
                        jo joVar2 = this.b;
                        joVar2.a();
                        ioVar.w(joVar2.k);
                        break;
                    case 3:
                        this.b.a();
                        ioVar.l();
                        break;
                    case 4:
                        this.b.a();
                        AndroidUtilities.runOnUIThread(new ig(ioVar, 27));
                        break;
                    default:
                        ioVar.j();
                        this.b.a();
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute_1h, LocaleController.getString(R.string.MuteFor1h), false, c6Var);
        this.d = c10;
        final int i12 = 1;
        c10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fo
            public final /* synthetic */ jo b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.b.a();
                        ioVar.u();
                        break;
                    case 1:
                        jo joVar = this.b;
                        joVar.a();
                        ioVar.w(joVar.l);
                        break;
                    case 2:
                        jo joVar2 = this.b;
                        joVar2.a();
                        ioVar.w(joVar2.k);
                        break;
                    case 3:
                        this.b.a();
                        ioVar.l();
                        break;
                    case 4:
                        this.b.a();
                        AndroidUtilities.runOnUIThread(new ig(ioVar, 27));
                        break;
                    default:
                        ioVar.j();
                        this.b.a();
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute_1h, LocaleController.getString(R.string.MuteFor1h), false, c6Var);
        this.e = c11;
        final int i13 = 2;
        c11.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fo
            public final /* synthetic */ jo b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.b.a();
                        ioVar.u();
                        break;
                    case 1:
                        jo joVar = this.b;
                        joVar.a();
                        ioVar.w(joVar.l);
                        break;
                    case 2:
                        jo joVar2 = this.b;
                        joVar2.a();
                        ioVar.w(joVar2.k);
                        break;
                    case 3:
                        this.b.a();
                        ioVar.l();
                        break;
                    case 4:
                        this.b.a();
                        AndroidUtilities.runOnUIThread(new ig(ioVar, 27));
                        break;
                    default:
                        ioVar.j();
                        this.b.a();
                        break;
                }
            }
        });
        Integer num2 = num;
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), false, c6Var).setOnClickListener(new go(this, context, c6Var, i10, ioVar, 0));
        final int i14 = 3;
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), false, c6Var).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fo
            public final /* synthetic */ jo b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        this.b.a();
                        ioVar.u();
                        break;
                    case 1:
                        jo joVar = this.b;
                        joVar.a();
                        ioVar.w(joVar.l);
                        break;
                    case 2:
                        jo joVar2 = this.b;
                        joVar2.a();
                        ioVar.w(joVar2.k);
                        break;
                    case 3:
                        this.b.a();
                        ioVar.l();
                        break;
                    case 4:
                        this.b.a();
                        AndroidUtilities.runOnUIThread(new ig(ioVar, 27));
                        break;
                    default:
                        ioVar.j();
                        this.b.a();
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.g1 c12 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, "", false, c6Var);
        this.c = c12;
        final int i15 = 4;
        c12.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fo
            public final /* synthetic */ jo b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        this.b.a();
                        ioVar.u();
                        break;
                    case 1:
                        jo joVar = this.b;
                        joVar.a();
                        ioVar.w(joVar.l);
                        break;
                    case 2:
                        jo joVar2 = this.b;
                        joVar2.a();
                        ioVar.w(joVar2.k);
                        break;
                    case 3:
                        this.b.a();
                        ioVar.l();
                        break;
                    case 4:
                        this.b.a();
                        AndroidUtilities.runOnUIThread(new ig(ioVar, 27));
                        break;
                    default:
                        ioVar.j();
                        this.b.a();
                        break;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.m = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.H8, c6Var));
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, i7.f6.n(-1, 8));
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, c6Var));
        frameLayout.setTag(R.id.fit_width_tag, num2);
        textView.setTag(R.id.fit_width_tag, num2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, i7.f6.n(-2, -2));
        textView.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.I5, c6Var), 0, 6));
        final int i16 = 5;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fo
            public final /* synthetic */ jo b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        this.b.a();
                        ioVar.u();
                        break;
                    case 1:
                        jo joVar = this.b;
                        joVar.a();
                        ioVar.w(joVar.l);
                        break;
                    case 2:
                        jo joVar2 = this.b;
                        joVar2.a();
                        ioVar.w(joVar2.k);
                        break;
                    case 3:
                        this.b.a();
                        ioVar.l();
                        break;
                    case 4:
                        this.b.a();
                        AndroidUtilities.runOnUIThread(new ig(ioVar, 27));
                        break;
                    default:
                        ioVar.j();
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
        org.telegram.ui.ActionBar.o1 o1Var = this.h;
        if (o1Var != null) {
            o1Var.d(true);
            this.h.d(true);
        }
        this.i.dismiss();
        this.j = System.currentTimeMillis();
    }

    public final void c(org.telegram.ui.ActionBar.o2 o2Var, View view, float f9, float f10, boolean z10) {
        float measuredWidth;
        float measuredHeight;
        if (o2Var.getFragmentView() == null) {
            return;
        }
        ho hoVar = this.f;
        org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(hoVar, -2, -2);
        this.h = o1Var;
        o1Var.e = true;
        o1Var.c = 220;
        o1Var.setOutsideTouchable(true);
        this.h.setClippingEnabled(true);
        this.h.setAnimationStyle(R.style.PopupContextAnimation);
        this.h.setFocusable(true);
        hoVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
        this.h.setInputMethodMode(2);
        this.h.getContentView().setFocusableInTouchMode(true);
        while (view != o2Var.getFragmentView()) {
            if (view.getParent() == null) {
                return;
            }
            f9 += view.getX();
            f10 += view.getY();
            view = (View) view.getParent();
        }
        if (z10) {
            measuredWidth = f9 - AndroidUtilities.dpf2(8.0f);
            measuredHeight = AndroidUtilities.dpf2(16.0f);
        } else {
            measuredWidth = f9 - (hoVar.getMeasuredWidth() / 2.0f);
            measuredHeight = hoVar.getMeasuredHeight() / 2.0f;
        }
        this.h.showAtLocation(o2Var.getFragmentView(), 0, (int) measuredWidth, (int) (f10 - measuredHeight));
        this.h.b();
    }

    public final void d(long j10, long j11, HashSet hashSet) {
        int i10;
        int i11;
        int i12;
        if (System.currentTimeMillis() - this.j < 200) {
            AndroidUtilities.runOnUIThread(new g5.x(this, j10, j11, hashSet, 12));
            return;
        }
        int i13 = this.g;
        boolean isDialogMuted = MessagesController.getInstance(i13).isDialogMuted(j10, j11);
        org.telegram.ui.ActionBar.g1 g1Var = this.b;
        org.telegram.ui.ActionBar.g1 g1Var2 = this.c;
        if (isDialogMuted) {
            g1Var2.g(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute, null);
            i10 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.x6, false);
            g1Var.setVisibility(8);
        } else {
            g1Var2.g(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute, null);
            int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false);
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
            g1Var3.getImageView().setImageDrawable(m11.a(i12));
            g1Var3.setText(b(i12));
        } else {
            g1Var3.setVisibility(8);
        }
        org.telegram.ui.ActionBar.g1 g1Var4 = this.e;
        if (i11 != 0) {
            this.k = i11;
            g1Var4.setVisibility(0);
            g1Var4.getImageView().setImageDrawable(m11.a(i11));
            g1Var4.setText(b(i11));
        } else {
            g1Var4.setVisibility(8);
        }
        g1Var2.c(i10, i10);
        g1Var2.setSelectorColor(org.telegram.ui.ActionBar.g6.l1(0.1f, i10));
        FrameLayout frameLayout = this.m;
        TextView textView = this.n;
        if (hashSet == null || hashSet.isEmpty()) {
            frameLayout.setVisibility(8);
            textView.setVisibility(8);
        } else {
            frameLayout.setVisibility(0);
            textView.setVisibility(0);
            textView.setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("TopicNotificationsExceptions", hashSet.size(), new Object[0]), org.telegram.ui.ActionBar.g6.n6, 1, null));
        }
    }
}
