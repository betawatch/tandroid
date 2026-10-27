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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class bp {
    public final org.telegram.ui.ActionBar.g1 a;
    public final org.telegram.ui.ActionBar.g1 b;
    public final org.telegram.ui.ActionBar.g1 c;
    public final org.telegram.ui.ActionBar.g1 d;
    public final org.telegram.ui.ActionBar.g1 e;
    public final zo f;
    public final int g;
    public org.telegram.ui.ActionBar.o1 h;
    public final ap i;
    public long j;
    public int k;
    public int l;
    public final FrameLayout m;
    public final TextView n;
    public int o;

    public bp(Context context, int i10, th0 th0Var, boolean z10, final ap apVar, org.telegram.ui.ActionBar.u6 u6Var) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        int i11;
        Integer num;
        this.g = i10;
        this.i = apVar;
        zo zoVar = new zo(context, z10 ? R.drawable.popup_fixed_alert : 0, 0, u6Var, 0);
        zoVar.U = new Path();
        this.f = zoVar;
        zoVar.setFitItems(true);
        if (th0Var != null) {
            i11 = 1;
            num = 1;
            actionBarPopupWindow$ActionBarPopupWindowLayout = zoVar;
            org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, u6Var);
            this.a = c10;
            c10.setOnClickListener(new o8(th0Var, 1));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout = zoVar;
            i11 = 1;
            num = 1;
        }
        org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), false, u6Var);
        this.b = c11;
        final int i12 = 0;
        c11.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xo
            public final /* synthetic */ bp b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.b.a();
                        apVar.s();
                        break;
                    case 1:
                        bp bpVar = this.b;
                        bpVar.a();
                        apVar.w(bpVar.l);
                        break;
                    case 2:
                        bp bpVar2 = this.b;
                        bpVar2.a();
                        apVar.w(bpVar2.k);
                        break;
                    case 3:
                        this.b.a();
                        apVar.o();
                        break;
                    case 4:
                        this.b.a();
                        AndroidUtilities.runOnUIThread(new pg(apVar, 29));
                        break;
                    default:
                        apVar.m();
                        this.b.a();
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.g1 c12 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute_1h, LocaleController.getString(R.string.MuteFor1h), false, u6Var);
        this.d = c12;
        final int i13 = 1;
        c12.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xo
            public final /* synthetic */ bp b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.b.a();
                        apVar.s();
                        break;
                    case 1:
                        bp bpVar = this.b;
                        bpVar.a();
                        apVar.w(bpVar.l);
                        break;
                    case 2:
                        bp bpVar2 = this.b;
                        bpVar2.a();
                        apVar.w(bpVar2.k);
                        break;
                    case 3:
                        this.b.a();
                        apVar.o();
                        break;
                    case 4:
                        this.b.a();
                        AndroidUtilities.runOnUIThread(new pg(apVar, 29));
                        break;
                    default:
                        apVar.m();
                        this.b.a();
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.g1 c13 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute_1h, LocaleController.getString(R.string.MuteFor1h), false, u6Var);
        this.e = c13;
        final int i14 = 2;
        c13.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xo
            public final /* synthetic */ bp b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        this.b.a();
                        apVar.s();
                        break;
                    case 1:
                        bp bpVar = this.b;
                        bpVar.a();
                        apVar.w(bpVar.l);
                        break;
                    case 2:
                        bp bpVar2 = this.b;
                        bpVar2.a();
                        apVar.w(bpVar2.k);
                        break;
                    case 3:
                        this.b.a();
                        apVar.o();
                        break;
                    case 4:
                        this.b.a();
                        AndroidUtilities.runOnUIThread(new pg(apVar, 29));
                        break;
                    default:
                        apVar.m();
                        this.b.a();
                        break;
                }
            }
        });
        Integer num2 = num;
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), false, u6Var).setOnClickListener(new yo(this, context, u6Var, i10, apVar, 0));
        final int i15 = 3;
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), false, u6Var).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xo
            public final /* synthetic */ bp b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        this.b.a();
                        apVar.s();
                        break;
                    case 1:
                        bp bpVar = this.b;
                        bpVar.a();
                        apVar.w(bpVar.l);
                        break;
                    case 2:
                        bp bpVar2 = this.b;
                        bpVar2.a();
                        apVar.w(bpVar2.k);
                        break;
                    case 3:
                        this.b.a();
                        apVar.o();
                        break;
                    case 4:
                        this.b.a();
                        AndroidUtilities.runOnUIThread(new pg(apVar, 29));
                        break;
                    default:
                        apVar.m();
                        this.b.a();
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.g1 c14 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, "", false, u6Var);
        this.c = c14;
        final int i16 = 4;
        c14.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xo
            public final /* synthetic */ bp b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        this.b.a();
                        apVar.s();
                        break;
                    case 1:
                        bp bpVar = this.b;
                        bpVar.a();
                        apVar.w(bpVar.l);
                        break;
                    case 2:
                        bp bpVar2 = this.b;
                        bpVar2.a();
                        apVar.w(bpVar2.k);
                        break;
                    case 3:
                        this.b.a();
                        apVar.o();
                        break;
                    case 4:
                        this.b.a();
                        AndroidUtilities.runOnUIThread(new pg(apVar, 29));
                        break;
                    default:
                        apVar.m();
                        this.b.a();
                        break;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.m = frameLayout;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.H8, frameLayout, u6Var);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, kb1.r(-1, 8));
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setTextSize(i11, 13.0f);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.E8, u6Var);
        frameLayout.setTag(R.id.fit_width_tag, num2);
        textView.setTag(R.id.fit_width_tag, num2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, kb1.r(-2, -2));
        int i17 = org.telegram.ui.ActionBar.y6.I5;
        org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.y6.Z(org.telegram.ui.ActionBar.y6.w0(i17, u6Var), 0, 6);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i17);
        textView.setBackground(Z);
        org.telegram.ui.ActionBar.f7.k(textView, Z, null, N, u6Var);
        final int i18 = 5;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xo
            public final /* synthetic */ bp b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        this.b.a();
                        apVar.s();
                        break;
                    case 1:
                        bp bpVar = this.b;
                        bpVar.a();
                        apVar.w(bpVar.l);
                        break;
                    case 2:
                        bp bpVar2 = this.b;
                        bpVar2.a();
                        apVar.w(bpVar2.k);
                        break;
                    case 3:
                        this.b.a();
                        apVar.o();
                        break;
                    case 4:
                        this.b.a();
                        AndroidUtilities.runOnUIThread(new pg(apVar, 29));
                        break;
                    default:
                        apVar.m();
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

    public static void c(org.telegram.ui.ActionBar.g1 g1Var, int i10) {
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
        g1Var.c(i10, i10);
        g1Var.h(0.1f, i10);
        if (g1Var.getTextView() == null || g1Var.getTextView().getCurrentTextColor() != x02) {
            g1Var.d(x02, x02);
            g1Var.setSelectorColor(org.telegram.ui.ActionBar.y6.o1(0.1f, x02));
        }
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

    public final void d(org.telegram.ui.ActionBar.r2 r2Var, View view, float f7, float f10, boolean z10) {
        float measuredWidth;
        float measuredHeight;
        if (r2Var.getFragmentView() == null) {
            return;
        }
        zo zoVar = this.f;
        org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(zoVar, -2, -2);
        this.h = o1Var;
        o1Var.e = true;
        o1Var.c = 220;
        o1Var.setOutsideTouchable(true);
        this.h.setClippingEnabled(true);
        this.h.setAnimationStyle(R.style.PopupContextAnimation);
        this.h.setFocusable(true);
        zoVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
        this.h.setInputMethodMode(2);
        this.h.getContentView().setFocusableInTouchMode(true);
        while (view != r2Var.getFragmentView()) {
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
            measuredWidth = f7 - (zoVar.getMeasuredWidth() / 2.0f);
            measuredHeight = zoVar.getMeasuredHeight() / 2.0f;
        }
        this.h.showAtLocation(r2Var.getFragmentView(), 0, (int) measuredWidth, (int) (f10 - measuredHeight));
        this.h.b();
    }

    public final void e(long j10, long j11, HashSet hashSet) {
        int i10;
        int i11;
        int i12;
        if (System.currentTimeMillis() - this.j < 200) {
            AndroidUtilities.runOnUIThread(new a3.h0(this, j10, j11, hashSet, 13));
            return;
        }
        int i13 = this.g;
        boolean isDialogMuted = MessagesController.getInstance(i13).isDialogMuted(j10, j11);
        org.telegram.ui.ActionBar.g1 g1Var = this.c;
        org.telegram.ui.ActionBar.g1 g1Var2 = this.b;
        if (isDialogMuted) {
            g1Var.j(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute, null);
            i10 = org.telegram.ui.ActionBar.y6.x6;
            g1Var2.setVisibility(8);
        } else {
            g1Var.j(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute, null);
            int i14 = org.telegram.ui.ActionBar.y6.q7;
            g1Var2.setVisibility(0);
            if (MessagesController.getInstance(i13).isDialogNotificationsSoundEnabled(j10, j11)) {
                g1Var2.j(LocaleController.getString(R.string.SoundOff), R.drawable.msg_tone_off, null);
            } else {
                g1Var2.j(LocaleController.getString(R.string.SoundOn), R.drawable.msg_tone_on, null);
            }
            i10 = i14;
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
            g1Var3.getImageView().setImageDrawable(f31.a(i12));
            g1Var3.setText(b(i12));
        } else {
            g1Var3.setVisibility(8);
        }
        org.telegram.ui.ActionBar.g1 g1Var4 = this.e;
        if (i11 != 0) {
            this.k = i11;
            g1Var4.setVisibility(0);
            g1Var4.getImageView().setImageDrawable(f31.a(i11));
            g1Var4.setText(b(i11));
        } else {
            g1Var4.setVisibility(8);
        }
        c(g1Var, i10);
        FrameLayout frameLayout = this.m;
        TextView textView = this.n;
        if (hashSet == null || hashSet.isEmpty()) {
            frameLayout.setVisibility(8);
            textView.setVisibility(8);
        } else {
            frameLayout.setVisibility(0);
            textView.setVisibility(0);
            textView.setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("TopicNotificationsExceptions", hashSet.size(), new Object[0]), org.telegram.ui.ActionBar.y6.n6, 1, null));
        }
    }
}
