package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class vb0 extends FrameLayout {
    public boolean A;
    public float B;
    public final int a;
    public final int b;
    public final org.telegram.ui.ActionBar.c6 c;
    public final LinearLayout d;
    public final TextView e;
    public final TextView f;
    public final TextView h;
    public final long n;
    public final int r;
    public final int s;
    public final int v;
    public final int w;
    public final Runnable x;
    public final int y;

    public vb0(Context context, int i10, MessageObject messageObject, Runnable runnable, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        TLRPC.MessageFwdHeader messageFwdHeader;
        this.A = false;
        this.B = -1.0f;
        this.b = i10;
        int i11 = messageObject.currentAccount;
        this.a = i11;
        this.c = c6Var;
        this.x = runnable;
        this.y = ConnectionsManager.getInstance(i11).getCurrentTime() - messageObject.messageOwner.date;
        this.n = messageObject.getDialogId();
        this.r = messageObject.getId();
        TLRPC.Message message = messageObject.messageOwner;
        this.s = message == null ? 0 : message.date;
        this.v = message == null ? 0 : message.edit_date;
        this.w = (message == null || (messageFwdHeader = message.fwd_from) == null) ? 0 : messageFwdHeader.date;
        ImageView imageView = new ImageView(context);
        addView(imageView, i7.f6.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        Drawable mutate = context.getDrawable(i10 == 1 ? AppGlobalConfig.getInstance(i11).messagePrimaryEditedDate.get() ? R.drawable.outline_message_time_24 : R.drawable.menu_edited_stamp : i10 == 2 ? R.drawable.menu_forward_stamp : messageObject.isVoice() ? R.drawable.msg_played : R.drawable.msg_seen).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.F8, c6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(mutate);
        TextView textView = new TextView(context);
        this.h = textView;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("loading text ");
        spannableStringBuilder.setSpan(new d90(textView, AndroidUtilities.dp(96.0f), AndroidUtilities.dp(2.0f), c6Var), 0, spannableStringBuilder.length() - 1, 17);
        int i12 = org.telegram.ui.ActionBar.g6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.l1(0.7f, org.telegram.ui.ActionBar.g6.v0(i12, c6Var)));
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 13.0f);
        addView(textView, i7.f6.d(96, -2.0f, 19, 40.0f, -1.0f, 8.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setAlpha(0.0f);
        addView(linearLayout, i7.f6.d(-1, -2.0f, 19, 38.0f, 0.0f, 8.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        org.telegram.ui.b.m(i12, c6Var, textView2, 1, 14.0f);
        TextView i13 = org.telegram.ui.th.i(linearLayout, textView2, i7.f6.t(-2, -2, 19, 0, -1, 0, 0), context);
        this.f = i13;
        i13.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.g6.l1(0.75f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d7, c6Var))));
        org.telegram.ui.b.m(i12, c6Var, i13, 1, 11.0f);
        i13.setPadding(AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.33f));
        linearLayout.addView(i13, i7.f6.t(-2, -2, 19, 4, 0, 0, 0));
        a();
    }

    public static void b(final Context context, final int i10, long j10, final boolean z10, Runnable runnable, final Runnable runnable2, final org.telegram.ui.ActionBar.c6 c6Var) {
        final org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(context, c6Var, false, false);
        f3Var.fixNavigationBar(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, c6Var));
        boolean premiumFeaturesBlocked = MessagesController.getInstance(i10).premiumFeaturesBlocked();
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
        g10.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        aj0 aj0Var = new aj0(context);
        aj0Var.setScaleType(ImageView.ScaleType.CENTER);
        aj0Var.f(z10 ? R.raw.large_lastseen : R.raw.large_readtime, 70, 70, null);
        aj0Var.d();
        aj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        aj0Var.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var)));
        g10.addView(aj0Var, i7.f6.t(80, 80, 1, 0, 16, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        int i11 = org.telegram.ui.ActionBar.g6.j5;
        org.telegram.ui.b.m(i11, c6Var, textView, 1, 20.0f);
        textView.setText(LocaleController.getString(z10 ? R.string.PremiumLastSeenHeader1 : R.string.PremiumReadHeader1));
        g10.addView(textView, i7.f6.t(-1, -2, 1, 12, 0, 12, 0));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        org.telegram.ui.b.m(i11, c6Var, textView2, 1, 14.0f);
        String firstName = j10 > 0 ? UserObject.getFirstName(MessagesController.getInstance(i10).getUser(Long.valueOf(j10))) : "";
        org.telegram.ui.b.p(z10 ? premiumFeaturesBlocked ? R.string.PremiumLastSeenText1Locked : R.string.PremiumLastSeenText1 : premiumFeaturesBlocked ? R.string.PremiumReadText1Locked : R.string.PremiumReadText1, new Object[]{firstName}, textView2);
        g10.addView(textView2, i7.f6.t(-1, -2, 1, 32, 9, 32, 19));
        final nh.d o10 = org.telegram.messenger.x3.o(24, context, c6Var, true);
        o10.g(LocaleController.getString(z10 ? R.string.PremiumLastSeenButton1 : R.string.PremiumReadButton1), false, true);
        g10.addView(o10, i7.f6.q(-1, 48, 1));
        o10.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.sb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nh.d dVar = nh.d.this;
                dVar.setLoading(true);
                boolean z11 = z10;
                int i12 = i10;
                org.telegram.ui.ActionBar.f3 f3Var2 = f3Var;
                Runnable runnable3 = runnable2;
                if (z11) {
                    TL_account.setPrivacy setprivacy = new TL_account.setPrivacy();
                    setprivacy.key = new TLRPC.TL_inputPrivacyKeyStatusTimestamp();
                    setprivacy.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                    ConnectionsManager.getInstance(i12).sendRequest(setprivacy, new eg.z(dVar, f3Var2, runnable3, 17));
                    return;
                }
                TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
                TLRPC.GlobalPrivacySettings globalPrivacySettings = ContactsController.getInstance(i12).getGlobalPrivacySettings();
                setglobalprivacysettings.settings = globalPrivacySettings;
                if (globalPrivacySettings == null) {
                    setglobalprivacysettings.settings = new TLRPC.TL_globalPrivacySettings();
                }
                setglobalprivacysettings.settings.hide_read_marks = false;
                ConnectionsManager.getInstance(i12).sendRequest(setglobalprivacysettings, new eg.f0(context, c6Var, dVar, f3Var2, runnable3, 8));
            }
        });
        if (!premiumFeaturesBlocked) {
            ub0 ub0Var = new ub0(context, c6Var);
            ub0Var.setGravity(17);
            ub0Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
            ub0Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.z6, c6Var));
            ub0Var.l(" " + LocaleController.getString(R.string.PremiumOr) + " ", false);
            ub0Var.setTextSize(14);
            g10.addView(ub0Var, i7.f6.t(270, -2, 1, 12, 17, 12, 17));
            TextView textView3 = new TextView(context);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setGravity(17);
            textView3.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
            textView3.setTextSize(1, 20.0f);
            textView3.setText(LocaleController.getString(z10 ? R.string.PremiumLastSeenHeader2 : R.string.PremiumReadHeader2));
            g10.addView(textView3, i7.f6.t(-1, -2, 1, 12, 0, 12, 0));
            TextView textView4 = new TextView(context);
            textView4.setGravity(17);
            org.telegram.ui.b.m(i11, c6Var, textView4, 1, 14.0f);
            org.telegram.ui.b.p(z10 ? R.string.PremiumLastSeenText2 : R.string.PremiumReadText2, new Object[]{firstName}, textView4);
            g10.addView(textView4, i7.f6.t(-1, -2, 1, 32, 9, 32, 19));
            cg.d1 d1Var = new cg.d1(context, c6Var, true);
            d1Var.setOnClickListener(new tb0(z10, f3Var, runnable));
            d1Var.c(LocaleController.getString(z10 ? R.string.PremiumLastSeenButton2 : R.string.PremiumReadButton2), false, false);
            g10.addView(d1Var, i7.f6.t(-1, 48, 1, 0, 0, 0, 4));
        }
        f3Var.setCustomView(g10);
        f3Var.show();
    }

    public final void a() {
        TextView textView = this.e;
        int i10 = this.a;
        TextView textView2 = this.f;
        TextView textView3 = this.h;
        LinearLayout linearLayout = this.d;
        int i11 = this.b;
        if (i11 == 1) {
            linearLayout.setAlpha(1.0f);
            textView3.setAlpha(0.0f);
            textView2.setVisibility(8);
            textView.setText(AppGlobalConfig.getInstance(i10).messagePrimaryEditedDate.get() ? LocaleController.formatPmSentDate(this.s) : LocaleController.formatPmEditedDate(this.v));
            return;
        }
        if (i11 == 2) {
            linearLayout.setAlpha(1.0f);
            textView3.setAlpha(0.0f);
            textView2.setVisibility(8);
            textView.setText(LocaleController.formatPmFwdDate(this.w));
            return;
        }
        setOnClickListener(null);
        linearLayout.setAlpha(0.0f);
        textView3.setAlpha(1.0f);
        textView2.setVisibility(0);
        TLRPC.TL_messages_getOutboxReadDate tL_messages_getOutboxReadDate = new TLRPC.TL_messages_getOutboxReadDate();
        tL_messages_getOutboxReadDate.peer = MessagesController.getInstance(i10).getInputPeer(this.n);
        tL_messages_getOutboxReadDate.msg_id = this.r;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getOutboxReadDate, new a2(this, 8));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        rb rbVar;
        super.onDetachedFromWindow();
        mc mcVar = mc.w;
        if (mcVar == null || (rbVar = mcVar.e) == null || rbVar.getParent() == null || !(mcVar.e.getParent().getParent() instanceof gb)) {
            return;
        }
        mcVar.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        float f9;
        View view = (View) getParent();
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        if (this.B < 0.0f) {
            this.B = 0.0f;
            int i12 = this.b;
            TextView textView = this.e;
            if (i12 == 0) {
                long currentTimeMillis = System.currentTimeMillis();
                float max = Math.max(this.B, AndroidUtilities.dp(144.0f));
                this.B = max;
                float max2 = Math.max(max, textView.getPaint().measureText(LocaleController.getString(R.string.PmReadUnknown)) + AndroidUtilities.dp(48.0f));
                this.B = max2;
                float max3 = Math.max(max2, textView.getPaint().measureText(LocaleController.getString(R.string.PmRead) + this.f.getPaint().measureText(LocaleController.getString(R.string.PmReadShowWhen))) + AndroidUtilities.dp(64.0f));
                this.B = max3;
                float max4 = Math.max(max3, textView.getPaint().measureText(LocaleController.formatString(R.string.PmReadTodayAt, LocaleController.getInstance().getFormatterDay().format(new Date(currentTimeMillis)))) + ((float) AndroidUtilities.dp(48.0f)));
                this.B = max4;
                int i13 = this.y;
                if (i13 > 86400) {
                    f9 = 48.0f;
                    this.B = Math.max(max4, textView.getPaint().measureText(LocaleController.formatString(R.string.PmReadYesterdayAt, LocaleController.getInstance().getFormatterDay().format(new Date(currentTimeMillis)))) + AndroidUtilities.dp(48.0f));
                } else {
                    f9 = 48.0f;
                }
                if (i13 > 172800) {
                    float max5 = Math.max(this.B, textView.getPaint().measureText(LocaleController.formatString(R.string.PmReadDateTimeAt, LocaleController.getInstance().getFormatterDayMonth().format(new Date(currentTimeMillis)), LocaleController.getInstance().getFormatterDay().format(new Date(currentTimeMillis)))) + AndroidUtilities.dp(f9));
                    this.B = max5;
                    this.B = Math.max(max5, textView.getPaint().measureText(LocaleController.formatString(R.string.PmReadDateTimeAt, LocaleController.getInstance().getFormatterYear().format(new Date(currentTimeMillis)), LocaleController.getInstance().getFormatterDay().format(new Date(currentTimeMillis)))) + AndroidUtilities.dp(f9));
                }
            } else {
                this.B = textView.getPaint().measureText(textView.getText().toString()) + AndroidUtilities.dp(48.0f);
            }
        }
        int i14 = TLObject.FLAG_30;
        if (view != null && view.getWidth() > 0) {
            size = view.getWidth();
            mode = TLObject.FLAG_30;
        }
        float f10 = size;
        float f11 = this.B;
        if (f10 < f11 || mode == Integer.MIN_VALUE) {
            size = (int) f11;
        } else {
            i14 = mode;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, i14), i11);
    }
}
