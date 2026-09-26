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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class qo {
    public final org.telegram.ui.ActionBar.e1 a;
    public final org.telegram.ui.ActionBar.e1 b;
    public final org.telegram.ui.ActionBar.e1 c;
    public final org.telegram.ui.ActionBar.e1 d;
    public final org.telegram.ui.ActionBar.e1 e;
    public final oo f;
    public final int g;
    public org.telegram.ui.ActionBar.m1 h;
    public final po i;
    public long j;
    public int k;
    public int l;
    public final FrameLayout m;
    public final TextView n;
    public int o;

    public qo(Context context, int i10, fh0 fh0Var, boolean z10, final po poVar, org.telegram.ui.ActionBar.d6 d6Var) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        Integer num;
        this.g = i10;
        this.i = poVar;
        oo ooVar = new oo(context, z10 ? R.drawable.popup_fixed_alert : 0, 0, d6Var, 0);
        ooVar.U = new Path();
        this.f = ooVar;
        ooVar.setFitItems(true);
        if (fh0Var != null) {
            num = 1;
            actionBarPopupWindow$ActionBarPopupWindowLayout = ooVar;
            org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, d6Var);
            this.a = c10;
            c10.setOnClickListener(new l8(fh0Var, 1));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout = ooVar;
            num = 1;
        }
        org.telegram.ui.ActionBar.e1 c11 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), false, d6Var);
        this.b = c11;
        final int i11 = 0;
        c11.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.mo
            public final /* synthetic */ qo b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.b.a();
                        poVar.r();
                        break;
                    case 1:
                        qo qoVar = this.b;
                        qoVar.a();
                        poVar.u(qoVar.l);
                        break;
                    case 2:
                        qo qoVar2 = this.b;
                        qoVar2.a();
                        poVar.u(qoVar2.k);
                        break;
                    case 3:
                        this.b.a();
                        poVar.o();
                        break;
                    case 4:
                        this.b.a();
                        AndroidUtilities.runOnUIThread(new pg(poVar, 27));
                        break;
                    default:
                        poVar.m();
                        this.b.a();
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.e1 c12 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute_1h, LocaleController.getString(R.string.MuteFor1h), false, d6Var);
        this.d = c12;
        final int i12 = 1;
        c12.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.mo
            public final /* synthetic */ qo b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.b.a();
                        poVar.r();
                        break;
                    case 1:
                        qo qoVar = this.b;
                        qoVar.a();
                        poVar.u(qoVar.l);
                        break;
                    case 2:
                        qo qoVar2 = this.b;
                        qoVar2.a();
                        poVar.u(qoVar2.k);
                        break;
                    case 3:
                        this.b.a();
                        poVar.o();
                        break;
                    case 4:
                        this.b.a();
                        AndroidUtilities.runOnUIThread(new pg(poVar, 27));
                        break;
                    default:
                        poVar.m();
                        this.b.a();
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.e1 c13 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute_1h, LocaleController.getString(R.string.MuteFor1h), false, d6Var);
        this.e = c13;
        final int i13 = 2;
        c13.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.mo
            public final /* synthetic */ qo b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.b.a();
                        poVar.r();
                        break;
                    case 1:
                        qo qoVar = this.b;
                        qoVar.a();
                        poVar.u(qoVar.l);
                        break;
                    case 2:
                        qo qoVar2 = this.b;
                        qoVar2.a();
                        poVar.u(qoVar2.k);
                        break;
                    case 3:
                        this.b.a();
                        poVar.o();
                        break;
                    case 4:
                        this.b.a();
                        AndroidUtilities.runOnUIThread(new pg(poVar, 27));
                        break;
                    default:
                        poVar.m();
                        this.b.a();
                        break;
                }
            }
        });
        Integer num2 = num;
        org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), false, d6Var).setOnClickListener(new no(this, context, d6Var, i10, poVar, 0));
        final int i14 = 3;
        org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), false, d6Var).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.mo
            public final /* synthetic */ qo b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        this.b.a();
                        poVar.r();
                        break;
                    case 1:
                        qo qoVar = this.b;
                        qoVar.a();
                        poVar.u(qoVar.l);
                        break;
                    case 2:
                        qo qoVar2 = this.b;
                        qoVar2.a();
                        poVar.u(qoVar2.k);
                        break;
                    case 3:
                        this.b.a();
                        poVar.o();
                        break;
                    case 4:
                        this.b.a();
                        AndroidUtilities.runOnUIThread(new pg(poVar, 27));
                        break;
                    default:
                        poVar.m();
                        this.b.a();
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.e1 c14 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, "", false, d6Var);
        this.c = c14;
        final int i15 = 4;
        c14.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.mo
            public final /* synthetic */ qo b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        this.b.a();
                        poVar.r();
                        break;
                    case 1:
                        qo qoVar = this.b;
                        qoVar.a();
                        poVar.u(qoVar.l);
                        break;
                    case 2:
                        qo qoVar2 = this.b;
                        qoVar2.a();
                        poVar.u(qoVar2.k);
                        break;
                    case 3:
                        this.b.a();
                        poVar.o();
                        break;
                    case 4:
                        this.b.a();
                        AndroidUtilities.runOnUIThread(new pg(poVar, 27));
                        break;
                    default:
                        poVar.m();
                        this.b.a();
                        break;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.m = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.H8, d6Var));
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, w7.y5.n(-1, 8));
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.E8, d6Var));
        frameLayout.setTag(R.id.fit_width_tag, num2);
        textView.setTag(R.id.fit_width_tag, num2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, w7.y5.n(-2, -2));
        textView.setBackground(org.telegram.ui.ActionBar.h6.Y(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.I5, d6Var), 0, 6));
        final int i16 = 5;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.mo
            public final /* synthetic */ qo b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        this.b.a();
                        poVar.r();
                        break;
                    case 1:
                        qo qoVar = this.b;
                        qoVar.a();
                        poVar.u(qoVar.l);
                        break;
                    case 2:
                        qo qoVar2 = this.b;
                        qoVar2.a();
                        poVar.u(qoVar2.k);
                        break;
                    case 3:
                        this.b.a();
                        poVar.o();
                        break;
                    case 4:
                        this.b.a();
                        AndroidUtilities.runOnUIThread(new pg(poVar, 27));
                        break;
                    default:
                        poVar.m();
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
        org.telegram.ui.ActionBar.m1 m1Var = this.h;
        if (m1Var != null) {
            m1Var.d(true);
            this.h.d(true);
        }
        this.i.dismiss();
        this.j = System.currentTimeMillis();
    }

    public final void c(org.telegram.ui.ActionBar.m2 m2Var, View view, float f7, float f10, boolean z10) {
        float measuredWidth;
        float measuredHeight;
        if (m2Var.getFragmentView() == null) {
            return;
        }
        oo ooVar = this.f;
        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(ooVar, -2, -2);
        this.h = m1Var;
        m1Var.e = true;
        m1Var.c = 220;
        m1Var.setOutsideTouchable(true);
        this.h.setClippingEnabled(true);
        this.h.setAnimationStyle(R.style.PopupContextAnimation);
        this.h.setFocusable(true);
        ooVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
        this.h.setInputMethodMode(2);
        this.h.getContentView().setFocusableInTouchMode(true);
        while (view != m2Var.getFragmentView()) {
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
            measuredWidth = f7 - (ooVar.getMeasuredWidth() / 2.0f);
            measuredHeight = ooVar.getMeasuredHeight() / 2.0f;
        }
        this.h.showAtLocation(m2Var.getFragmentView(), 0, (int) measuredWidth, (int) (f10 - measuredHeight));
        this.h.b();
    }

    public final void d(long j3, long j10, HashSet hashSet) {
        int i10;
        int i11;
        int i12;
        if (System.currentTimeMillis() - this.j < 200) {
            AndroidUtilities.runOnUIThread(new a3.g0(this, j3, j10, hashSet, 13));
            return;
        }
        int i13 = this.g;
        boolean isDialogMuted = MessagesController.getInstance(i13).isDialogMuted(j3, j10);
        org.telegram.ui.ActionBar.e1 e1Var = this.b;
        org.telegram.ui.ActionBar.e1 e1Var2 = this.c;
        if (isDialogMuted) {
            e1Var2.g(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute, null);
            i10 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.x6, false);
            e1Var.setVisibility(8);
        } else {
            e1Var2.g(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute, null);
            int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q7, false);
            e1Var.setVisibility(0);
            if (MessagesController.getInstance(i13).isDialogNotificationsSoundEnabled(j3, j10)) {
                e1Var.g(LocaleController.getString(R.string.SoundOff), R.drawable.msg_tone_off, null);
            } else {
                e1Var.g(LocaleController.getString(R.string.SoundOn), R.drawable.msg_tone_on, null);
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
        org.telegram.ui.ActionBar.e1 e1Var3 = this.d;
        if (i12 != 0) {
            this.l = i12;
            e1Var3.setVisibility(0);
            e1Var3.getImageView().setImageDrawable(i21.a(i12));
            e1Var3.setText(b(i12));
        } else {
            e1Var3.setVisibility(8);
        }
        org.telegram.ui.ActionBar.e1 e1Var4 = this.e;
        if (i11 != 0) {
            this.k = i11;
            e1Var4.setVisibility(0);
            e1Var4.getImageView().setImageDrawable(i21.a(i11));
            e1Var4.setText(b(i11));
        } else {
            e1Var4.setVisibility(8);
        }
        e1Var2.c(i10, i10);
        e1Var2.setSelectorColor(org.telegram.ui.ActionBar.h6.l1(0.1f, i10));
        FrameLayout frameLayout = this.m;
        TextView textView = this.n;
        if (hashSet == null || hashSet.isEmpty()) {
            frameLayout.setVisibility(8);
            textView.setVisibility(8);
        } else {
            frameLayout.setVisibility(0);
            textView.setVisibility(0);
            textView.setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("TopicNotificationsExceptions", hashSet.size(), new Object[0]), org.telegram.ui.ActionBar.h6.n6, 1, null));
        }
    }
}
