package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class r31 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final int a;
    public final long b;
    public final org.telegram.ui.rn c;
    public final org.telegram.ui.ActionBar.c6 d;
    public final org.telegram.ui.Cells.r3 e;
    public final Drawable f;
    public final SpannableString h;
    public final ImageView n;
    public final boolean[] r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r31(Context context, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.rn rnVar) {
        super(context);
        final int currentAccount = rnVar.getCurrentAccount();
        final long a2 = rnVar.a();
        boolean z10 = true;
        this.r = new boolean[1];
        this.a = currentAccount;
        this.b = a2;
        this.c = rnVar;
        this.d = c6Var;
        org.telegram.ui.Cells.r3 r3Var = new org.telegram.ui.Cells.r3(context, z10, z10, false, 2);
        this.e = r3Var;
        r3Var.b(0.3f, 450L, er.h);
        r3Var.setTextSize(AndroidUtilities.dp(14.0f));
        r3Var.setTypeface(AndroidUtilities.bold());
        r3Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        r3Var.setGravity(1);
        r3Var.setIgnoreRTL(!LocaleController.isRTL);
        r3Var.n = false;
        final org.telegram.ui.pk pkVar = (org.telegram.ui.pk) this;
        r3Var.setOnClickListener(new l70(pkVar, 24));
        addView(r3Var, h7.z5.d(-1, -1.0f, 3, 0.0f, 0.0f, 34.0f, 0.0f));
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_translate).mutate();
        this.f = mutate;
        mutate.setBounds(0, AndroidUtilities.dp(-6.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(14.0f));
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        spannableString.setSpan(new ImageSpan(mutate, 0), 0, 1, 33);
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_mini_customize);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.o31
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10;
                int i11 = currentAccount;
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-a2));
                boolean isPremium = UserConfig.getInstance(i11).isPremium();
                org.telegram.ui.pk pkVar2 = org.telegram.ui.pk.this;
                if (!isPremium && (chat == null || !chat.autotranslation)) {
                    org.telegram.ui.rn rnVar2 = pkVar2.s;
                    i10 = ((org.telegram.ui.ActionBar.n2) rnVar2).currentAccount;
                    MessagesController.getNotificationsSettings(i10).edit().putInt("dialog_show_translate_count" + rnVar2.a(), 140).commit();
                    rnVar2.Qc(true);
                    return;
                }
                int i12 = pkVar2.a;
                TranslateController translateController = MessagesController.getInstance(i12).getTranslateController();
                Context context2 = pkVar2.getContext();
                int i13 = R.drawable.popup_fixed_alert4;
                org.telegram.ui.ActionBar.c6 c6Var2 = pkVar2.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(i13, 1, context2, c6Var2);
                org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, c6Var2));
                LinearLayout linearLayout = new LinearLayout(pkVar2.getContext());
                linearLayout.setOrientation(1);
                q31 q31Var = new q31(pkVar2.getContext());
                q31Var.b = new y5(q31Var, 350L, er.h);
                LinearLayout linearLayout2 = new LinearLayout(pkVar2.getContext());
                q31Var.addView(linearLayout2);
                linearLayout2.setOrientation(1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.c = true;
                int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout);
                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, pkVar2.getContext(), pkVar2.d, true, false);
                f1Var.g(LocaleController.getString(R.string.TranslateTo), R.drawable.msg_translate, null);
                long j10 = pkVar2.b;
                f1Var.setSubtext(b31.z(b31.E(translateController.getDialogTranslateTo(j10), null, null)));
                f1Var.setItemHeight(56);
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
                org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(0, pkVar2.getContext(), pkVar2.d, true, false);
                f1Var2.g(LocaleController.getString(R.string.Back), R.drawable.ic_ab_back, null);
                f1Var2.setOnClickListener(new l70(actionBarPopupWindow$ActionBarPopupWindowLayout, 25));
                linearLayout.addView(f1Var2);
                linearLayout.addView(q31Var, h7.z5.n(-1, 420));
                String dialogDetectedLanguage = translateController.getDialogDetectedLanguage(j10);
                b31.E(dialogDetectedLanguage, null, null);
                boolean[] zArr = pkVar2.r;
                String E = b31.E(dialogDetectedLanguage, zArr, null);
                String dialogTranslateTo = translateController.getDialogTranslateTo(j10);
                ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(dialogTranslateTo);
                ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
                linearLayout2.addView(new org.telegram.ui.ActionBar.k1(pkVar2.getContext(), c6Var2), h7.z5.n(-1, 8));
                f1Var.setOnClickListener(new gh.v2(new p31(pkVar2, new boolean[1], dialogTranslateTo, linearLayout2, suggestedLanguages, dialogDetectedLanguage, translateController, n1Var, languages), actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 13));
                if (UserConfig.getInstance(i12).isPremium() && E != null) {
                    org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(0, pkVar2.getContext(), pkVar2.d, false, false);
                    String formatString = zArr[0] ? LocaleController.formatString(R.string.DoNotTranslateLanguage, E) : LocaleController.formatString(R.string.DoNotTranslateLanguageOther, E);
                    f1Var3.setMultiline(false);
                    f1Var3.g(lh.w3.b(formatString, f1Var3.getTextView().getPaint()), R.drawable.msg_block2, null);
                    f1Var3.setOnClickListener(new jh.b0(pkVar2, dialogDetectedLanguage, translateController, E, n1Var, 11));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var3);
                }
                org.telegram.ui.ActionBar.f1 f1Var4 = new org.telegram.ui.ActionBar.f1(0, pkVar2.getContext(), pkVar2.d, false, false);
                f1Var4.g(LocaleController.getString(R.string.Hide), R.drawable.msg_cancel, null);
                f1Var4.setOnClickListener(new ld0(pkVar2, translateController, n1Var, 3));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var4);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.k1(pkVar2.getContext(), c6Var2), h7.z5.n(-1, 8));
                p80 p80Var = new p80(pkVar2.getContext(), null);
                p80Var.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.33f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.33f));
                p80Var.setDisablePaddingsOffsetY(true);
                int i14 = org.telegram.ui.ActionBar.g6.j5;
                p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, c6Var2));
                p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var2));
                p80Var.setEmojiColor(org.telegram.ui.ActionBar.g6.v0(i14, c6Var2));
                CharSequence concat = TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.getString(R.string.CocoonPoweredBy)), " ", AndroidUtilities.premiumText(LocaleController.getString(R.string.CocoonPoweredByLink), new lg0(24, pkVar2, n1Var)));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("🥚");
                spannableStringBuilder.setSpan(new t5(5197252827247841976L, p80Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                spannableStringBuilder2.append((CharSequence) " ");
                p80Var.setText(lh.w3.b(AndroidUtilities.replaceCharSequence("🥚", AndroidUtilities.replaceCharSequence("🥚 ", concat, spannableStringBuilder2), spannableStringBuilder), p80Var.getPaint()));
                p80Var.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i6, c6Var2), 0, 12));
                p80Var.setOnClickListener(new xh0(8, pkVar2, n1Var));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(p80Var);
                n1Var.e = true;
                n1Var.c = 220;
                n1Var.setOutsideTouchable(true);
                n1Var.setClippingEnabled(true);
                n1Var.setAnimationStyle(R.style.PopupContextAnimation);
                n1Var.setFocusable(true);
                n1Var.setInputMethodMode(2);
                n1Var.setSoftInputMode(0);
                ImageView imageView2 = pkVar2.n;
                n1Var.showAsDropDown(imageView2, 0, (-imageView2.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
            }
        });
        addView(imageView, h7.z5.d(30, 30.0f, 21, 0.0f, 0.0f, 7.0f, 0.0f));
        d();
    }

    public static void a(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(context, c6Var, false, false);
        e3Var.fixNavigationBar();
        e3Var.applyBottomPadding = false;
        e3Var.applyTopPadding = false;
        org.telegram.ui.ActionBar.e3[] e3VarArr = new org.telegram.ui.ActionBar.e3[1];
        LinearLayout g10 = org.telegram.messenger.y1.g(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(1);
        gradientDrawable.setColors(new int[]{-15982491, -16379606});
        gradientDrawable.setGradientRadius(AndroidUtilities.dp(150.0f));
        float dp = AndroidUtilities.dp(12.0f);
        gradientDrawable.setCornerRadii(new float[]{dp, dp, dp, dp, 0.0f, 0.0f, 0.0f, 0.0f});
        frameLayout.setBackground(gradientDrawable);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout, h7.z5.e(-1, -1, 119));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.cocoon_logo);
        linearLayout.addView(imageView, h7.z5.t(132, 132, 49, 0, 33, 0, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.cocoon_text);
        linearLayout.addView(imageView2, h7.z5.t(-2, -2, 49, 32, 12, 32, 0));
        TextView textView = new TextView(context);
        textView.setTextColor(-4666897);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.CocoonSubtitle));
        k41[] k41VarArr = (k41[]) replaceTags.getSpans(0, replaceTags.length(), k41.class);
        for (int i10 = 0; i10 < k41VarArr.length; i10++) {
            replaceTags.setSpan(new ForegroundColorSpan(-1), replaceTags.getSpanStart(k41VarArr[i10]), replaceTags.getSpanEnd(k41VarArr[i10]), replaceTags.getSpanFlags(k41VarArr[i10]));
        }
        textView.setText(replaceTags);
        linearLayout.addView(textView, h7.z5.d(-1, -2.0f, 49, 32.0f, 14.0f, 32.0f, 20.0f));
        g10.addView(frameLayout, h7.z5.c(-2.0f, -1));
        g10.addView(new ag.d(context, R.drawable.menu_privacy, LocaleController.getString(R.string.CocoonFeature1Title), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFeature1Text), new hh.e8(e3VarArr, context, 1)), c6Var), h7.z5.t(-1, -2, 49, 32, 16, 32, 16));
        g10.addView(new ag.d(context, R.drawable.msg_stats, LocaleController.getString(R.string.CocoonFeature2Title), LocaleController.getString(R.string.CocoonFeature2Text), c6Var), h7.z5.t(-1, -2, 49, 32, 0, 32, 16));
        g10.addView(new ag.d(context, R.drawable.menu_gift, LocaleController.getString(R.string.CocoonFeature3Title), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFeature3Text), new hh.e8(e3VarArr, context, 2)), c6Var), h7.z5.t(-1, -2, 49, 32, 0, 32, 16));
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d7, c6Var));
        g10.addView(view, h7.z5.s(-1, 7, 24, 0, 24, 1.0f / AndroidUtilities.density, 0));
        p80 p80Var = new p80(context, null);
        p80Var.setTextSize(1, 12.0f);
        p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.y6, c6Var));
        p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var));
        p80Var.setGravity(17);
        p80Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFooter), new hh.e8(e3VarArr, context, 3)));
        p80Var.setPadding(0, AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f));
        p80Var.setDisablePaddingsOffsetY(true);
        g10.addView(p80Var, h7.z5.t(-1, -2, 7, 32, 0, 32, 0));
        lh.d g11 = org.telegram.messenger.rl.g(24, context, c6Var, true);
        g11.setText(hh.i5.g2(LocaleController.getString(R.string.Understood)));
        g11.setOnClickListener(new h2(e3VarArr, 3));
        g10.addView(g11, h7.z5.t(-1, 48, 7, 16, 0, 16, 16));
        e3Var.customView = g10;
        e3VarArr[0] = e3Var;
        e3Var.fixNavigationBar();
        e3VarArr[0].show();
    }

    public final void b() {
        int i10 = this.a;
        TranslateController translateController = MessagesController.getInstance(i10).getTranslateController();
        MessagesController messagesController = MessagesController.getInstance(i10);
        long j10 = this.b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j10));
        boolean isTranslatingDialog = translateController.isTranslatingDialog(j10);
        SpannableString spannableString = this.h;
        org.telegram.ui.Cells.r3 r3Var = this.e;
        if (isTranslatingDialog) {
            String E = b31.E(translateController.getDialogDetectedLanguage(j10), null, null);
            if (TextUtils.isEmpty(E)) {
                r3Var.setText(TextUtils.concat(spannableString, " ", LocaleController.getString(R.string.ShowOriginalButton)));
            } else {
                r3Var.setText(TextUtils.concat(spannableString, " ", LocaleController.formatString(R.string.ShowOriginalButtonLanguage, E)));
            }
        } else {
            String dialogTranslateTo = translateController.getDialogTranslateTo(j10);
            if (dialogTranslateTo == null) {
                dialogTranslateTo = "en";
            }
            boolean[] zArr = this.r;
            String E2 = b31.E(dialogTranslateTo, zArr, null);
            r3Var.setText(TextUtils.concat(spannableString, " ", zArr[0] ? LocaleController.formatString(R.string.TranslateToButton, E2) : LocaleController.formatString(R.string.TranslateToButtonOther, E2)));
        }
        this.n.setImageResource((UserConfig.getInstance(i10).isPremium() || (chat != null && chat.autotranslation)) ? R.drawable.msg_mini_customize : R.drawable.msg_close);
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void d() {
        int i10 = org.telegram.ui.ActionBar.g6.he;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        int v02 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
        org.telegram.ui.Cells.r3 r3Var = this.e;
        r3Var.setTextColor(v02);
        int v03 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var) & 436207615;
        float dp = AndroidUtilities.dp(15.0f);
        int dp2 = AndroidUtilities.dp(3.0f);
        r3Var.setBackground(org.telegram.ui.ActionBar.g6.W(dp, v03, dp2, dp2, dp2, dp2));
        org.telegram.ui.Cells.z M = org.telegram.ui.ActionBar.g6.M(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i6, c6Var), 0, 0);
        ImageView imageView = this.n;
        imageView.setBackground(M);
        int v04 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.de, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(v04, mode));
        this.f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), mode));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public void setLeftMargin(float f10) {
        this.e.setTranslationX(f10 / 2.0f);
    }
}
