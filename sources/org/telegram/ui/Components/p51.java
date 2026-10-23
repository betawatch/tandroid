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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public abstract class p51 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final int a;
    public final long b;
    public final org.telegram.ui.sn c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final org.telegram.ui.Cells.t3 e;
    public final Drawable f;
    public final SpannableString h;
    public final ImageView n;
    public final boolean[] r;
    public int s;
    public int v;
    public int w;
    public boolean x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p51(Context context, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.sn snVar) {
        super(context);
        final int currentAccount = snVar.getCurrentAccount();
        final long a2 = snVar.a();
        boolean z10 = true;
        this.r = new boolean[1];
        this.a = currentAccount;
        this.b = a2;
        this.c = snVar;
        this.d = g6Var;
        org.telegram.ui.Cells.t3 t3Var = new org.telegram.ui.Cells.t3(context, z10, z10, false, 2);
        this.e = t3Var;
        t3Var.b(0.3f, 450L, bs.h);
        t3Var.setTextSize(AndroidUtilities.dp(14.0f));
        t3Var.setTypeface(AndroidUtilities.bold());
        t3Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        t3Var.setGravity(1);
        t3Var.setIgnoreRTL(!LocaleController.isRTL);
        t3Var.n = false;
        final org.telegram.ui.sk skVar = (org.telegram.ui.sk) this;
        t3Var.setOnClickListener(new v80(skVar, 23));
        addView(t3Var, w7.z5.d(-1, -1.0f, 3, 0.0f, 0.0f, 34.0f, 0.0f));
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
        imageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.m51
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10;
                int i11 = currentAccount;
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-a2));
                boolean isPremium = UserConfig.getInstance(i11).isPremium();
                org.telegram.ui.sk skVar2 = org.telegram.ui.sk.this;
                if (!isPremium && (chat == null || !chat.autotranslation)) {
                    org.telegram.ui.sn snVar2 = skVar2.y;
                    i10 = ((org.telegram.ui.ActionBar.o2) snVar2).currentAccount;
                    MessagesController.getNotificationsSettings(i10).edit().putInt("dialog_show_translate_count" + snVar2.a(), 140).commit();
                    snVar2.Xc(true);
                    return;
                }
                int i12 = skVar2.a;
                TranslateController translateController = MessagesController.getInstance(i12).getTranslateController();
                Context context2 = skVar2.getContext();
                int i13 = R.drawable.popup_fixed_alert4;
                org.telegram.ui.ActionBar.g6 g6Var2 = skVar2.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(i13, 1, context2, g6Var2);
                org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, g6Var2);
                LinearLayout linearLayout = new LinearLayout(skVar2.getContext());
                linearLayout.setOrientation(1);
                o51 o51Var = new o51(skVar2.getContext());
                o51Var.b = new f6(o51Var, 350L, bs.h);
                LinearLayout linearLayout2 = new LinearLayout(skVar2.getContext());
                o51Var.addView(linearLayout2);
                linearLayout2.setOrientation(1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.c = true;
                int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout);
                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, skVar2.getContext(), skVar2.d, true, false);
                e1Var.j(LocaleController.getString(R.string.TranslateTo), R.drawable.msg_translate, null);
                long j10 = skVar2.b;
                e1Var.setSubtext(y41.J(y41.N(translateController.getDialogTranslateTo(j10), null, null)));
                e1Var.setItemHeight(56);
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(0, skVar2.getContext(), skVar2.d, true, false);
                e1Var2.j(LocaleController.getString(R.string.Back), R.drawable.ic_ab_back, null);
                e1Var2.setOnClickListener(new v80(actionBarPopupWindow$ActionBarPopupWindowLayout, 24));
                linearLayout.addView(e1Var2);
                linearLayout.addView(o51Var, w7.z5.n(-1, 420));
                String dialogDetectedLanguage = translateController.getDialogDetectedLanguage(j10);
                y41.N(dialogDetectedLanguage, null, null);
                boolean[] zArr = skVar2.r;
                String N = y41.N(dialogDetectedLanguage, zArr, null);
                String dialogTranslateTo = translateController.getDialogTranslateTo(j10);
                ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(dialogTranslateTo);
                ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
                linearLayout2.addView(new org.telegram.ui.ActionBar.j1(skVar2.getContext(), g6Var2), w7.z5.n(-1, 8));
                e1Var.setOnClickListener(new ai.ia(new n51(skVar2, new boolean[1], dialogTranslateTo, linearLayout2, suggestedLanguages, dialogDetectedLanguage, translateController, m1Var, languages), actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 12));
                if (UserConfig.getInstance(i12).isPremium() && N != null) {
                    org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(0, skVar2.getContext(), skVar2.d, false, false);
                    String formatString = zArr[0] ? LocaleController.formatString(R.string.DoNotTranslateLanguage, N) : LocaleController.formatString(R.string.DoNotTranslateLanguageOther, N);
                    e1Var3.setMultiline(false);
                    e1Var3.j(ei.x3.b(formatString, e1Var3.getTextView().getPaint()), R.drawable.msg_block2, null);
                    e1Var3.setOnClickListener(new ci.e0(skVar2, dialogDetectedLanguage, translateController, N, m1Var, 12));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var3);
                }
                org.telegram.ui.ActionBar.e1 e1Var4 = new org.telegram.ui.ActionBar.e1(0, skVar2.getContext(), skVar2.d, false, false);
                e1Var4.j(LocaleController.getString(R.string.Hide), R.drawable.msg_cancel, null);
                e1Var4.setOnClickListener(new t41(skVar2, translateController, m1Var, 1));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var4);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.j1(skVar2.getContext(), g6Var2), w7.z5.n(-1, 8));
                y90 y90Var = new y90(skVar2.getContext(), null);
                y90Var.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.33f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.33f));
                y90Var.setDisablePaddingsOffsetY(true);
                int i14 = org.telegram.ui.ActionBar.k6.j5;
                org.telegram.ui.ActionBar.r6.W(y90Var, i14, g6Var2);
                org.telegram.ui.ActionBar.r6.I(y90Var, org.telegram.ui.ActionBar.k6.gc, g6Var2);
                y90Var.setEmojiColor(org.telegram.ui.ActionBar.k6.w0(i14, g6Var2));
                CharSequence concat = TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.getString(R.string.CocoonPoweredBy)), " ", AndroidUtilities.premiumText(LocaleController.getString(R.string.CocoonPoweredByLink), new ko0(17, skVar2, m1Var)));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("🥚");
                spannableStringBuilder.setSpan(new a6(5197252827247841976L, y90Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                spannableStringBuilder2.append((CharSequence) " ");
                y90Var.setText(ei.x3.b(AndroidUtilities.replaceCharSequence("🥚", AndroidUtilities.replaceCharSequence("🥚 ", concat, spannableStringBuilder2), spannableStringBuilder), y90Var.getPaint()));
                int i15 = org.telegram.ui.ActionBar.k6.i6;
                org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.k6.Z(org.telegram.ui.ActionBar.k6.w0(i15, g6Var2), 0, 12);
                org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i15);
                y90Var.setBackground(Z);
                org.telegram.ui.ActionBar.r6.k(y90Var, Z, null, O, g6Var2);
                y90Var.setOnClickListener(new d51(1, skVar2, m1Var));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y90Var);
                m1Var.e = true;
                m1Var.c = 220;
                m1Var.setOutsideTouchable(true);
                m1Var.setClippingEnabled(true);
                m1Var.setAnimationStyle(R.style.PopupContextAnimation);
                m1Var.setFocusable(true);
                m1Var.setInputMethodMode(2);
                m1Var.setSoftInputMode(0);
                ImageView imageView2 = skVar2.n;
                m1Var.showAsDropDown(imageView2, 0, (-imageView2.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
            }
        });
        addView(imageView, w7.z5.d(30, 30.0f, 21, 0.0f, 0.0f, 7.0f, 0.0f));
        updateColors();
    }

    public static void a(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, context, g6Var, false);
        h3Var.fixNavigationBar();
        h3Var.applyBottomPadding = false;
        h3Var.applyTopPadding = false;
        org.telegram.ui.ActionBar.h3[] h3VarArr = new org.telegram.ui.ActionBar.h3[1];
        LinearLayout e = org.telegram.messenger.sl.e(context, 1);
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
        frameLayout.addView(linearLayout, w7.z5.e(-1, -1, 119));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.cocoon_logo);
        linearLayout.addView(imageView, w7.z5.t(132, 132, 49, 0, 33, 0, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.cocoon_text);
        linearLayout.addView(imageView2, w7.z5.t(-2, -2, 49, 32, 12, 32, 0));
        TextView textView = new TextView(context);
        textView.setTextColor(-4666897);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.CocoonSubtitle));
        j61[] j61VarArr = (j61[]) replaceTags.getSpans(0, replaceTags.length(), j61.class);
        for (int i10 = 0; i10 < j61VarArr.length; i10++) {
            replaceTags.setSpan(new ForegroundColorSpan(-1), replaceTags.getSpanStart(j61VarArr[i10]), replaceTags.getSpanEnd(j61VarArr[i10]), replaceTags.getSpanFlags(j61VarArr[i10]));
        }
        textView.setText(replaceTags);
        linearLayout.addView(textView, w7.z5.d(-1, -2.0f, 49, 32.0f, 14.0f, 32.0f, 20.0f));
        e.addView(frameLayout, w7.z5.c(-2.0f, -1));
        e.addView(new ci.h4(context, R.drawable.menu_privacy, LocaleController.getString(R.string.CocoonFeature1Title), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFeature1Text), new ai.ua(h3VarArr, context, 1)), g6Var), w7.z5.t(-1, -2, 49, 32, 16, 32, 16));
        e.addView(new ci.h4(context, R.drawable.msg_stats, LocaleController.getString(R.string.CocoonFeature2Title), LocaleController.getString(R.string.CocoonFeature2Text), g6Var), w7.z5.t(-1, -2, 49, 32, 0, 32, 16));
        e.addView(new ci.h4(context, R.drawable.menu_gift, LocaleController.getString(R.string.CocoonFeature3Title), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFeature3Text), new ai.ua(h3VarArr, context, 2)), g6Var), w7.z5.t(-1, -2, 49, 32, 0, 32, 16));
        View view = new View(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d7, view, g6Var);
        e.addView(view, w7.z5.s(-1, 7, 24, 0, 24, 1.0f / AndroidUtilities.density, 0));
        y90 y90Var = new y90(context, null);
        y90Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.r6.W(y90Var, org.telegram.ui.ActionBar.k6.y6, g6Var);
        org.telegram.ui.ActionBar.r6.I(y90Var, org.telegram.ui.ActionBar.k6.gc, g6Var);
        y90Var.setGravity(17);
        y90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFooter), new ai.ua(h3VarArr, context, 3)));
        y90Var.setPadding(0, AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f));
        y90Var.setDisablePaddingsOffsetY(true);
        e.addView(y90Var, w7.z5.t(-1, -2, 7, 32, 0, 32, 0));
        ei.d g10 = org.telegram.messenger.sl.g(24, context, g6Var, true);
        g10.setText(ai.l7.H2(LocaleController.getString(R.string.Understood)));
        g10.setOnClickListener(new k2(h3VarArr, 3));
        e.addView(g10, w7.z5.t(-1, 48, 7, 16, 0, 16, 16));
        h3Var.customView = e;
        h3VarArr[0] = h3Var;
        h3Var.fixNavigationBar();
        h3VarArr[0].show();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.he));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.de));
    }

    public final void b() {
        int i10 = this.a;
        TranslateController translateController = MessagesController.getInstance(i10).getTranslateController();
        MessagesController messagesController = MessagesController.getInstance(i10);
        long j10 = this.b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j10));
        boolean isTranslatingDialog = translateController.isTranslatingDialog(j10);
        SpannableString spannableString = this.h;
        org.telegram.ui.Cells.t3 t3Var = this.e;
        if (isTranslatingDialog) {
            String N = y41.N(translateController.getDialogDetectedLanguage(j10), null, null);
            if (TextUtils.isEmpty(N)) {
                t3Var.setText(TextUtils.concat(spannableString, " ", LocaleController.getString(R.string.ShowOriginalButton)));
            } else {
                t3Var.setText(TextUtils.concat(spannableString, " ", LocaleController.formatString(R.string.ShowOriginalButtonLanguage, N)));
            }
        } else {
            String dialogTranslateTo = translateController.getDialogTranslateTo(j10);
            if (dialogTranslateTo == null) {
                dialogTranslateTo = "en";
            }
            boolean[] zArr = this.r;
            String N2 = y41.N(dialogTranslateTo, zArr, null);
            t3Var.setText(TextUtils.concat(spannableString, " ", zArr[0] ? LocaleController.formatString(R.string.TranslateToButton, N2) : LocaleController.formatString(R.string.TranslateToButtonOther, N2)));
        }
        this.n.setImageResource((UserConfig.getInstance(i10).isPremium() || (chat != null && chat.autotranslation)) ? R.drawable.msg_mini_customize : R.drawable.msg_close);
    }

    public void setLeftMargin(float f7) {
        this.e.setTranslationX(f7 / 2.0f);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.k6.he;
        org.telegram.ui.ActionBar.g6 g6Var = this.d;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
        int i11 = org.telegram.ui.ActionBar.k6.i6;
        int w03 = org.telegram.ui.ActionBar.k6.w0(i11, g6Var);
        int i12 = org.telegram.ui.ActionBar.k6.de;
        int w04 = org.telegram.ui.ActionBar.k6.w0(i12, g6Var);
        if (this.x && w02 == this.s && w03 == this.v && w04 == this.w) {
            return;
        }
        this.x = true;
        this.s = w02;
        this.v = w03;
        this.w = w04;
        int w05 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
        org.telegram.ui.Cells.t3 t3Var = this.e;
        t3Var.setTextColor(w05);
        int w06 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var) & 436207615;
        float dp = AndroidUtilities.dp(15.0f);
        int dp2 = AndroidUtilities.dp(3.0f);
        t3Var.setBackground(org.telegram.ui.ActionBar.k6.X(dp, w06, dp2, dp2, dp2, dp2));
        org.telegram.ui.Cells.y N = org.telegram.ui.ActionBar.k6.N(org.telegram.ui.ActionBar.k6.w0(i11, g6Var), 0, 0);
        ImageView imageView = this.n;
        imageView.setBackground(N);
        int w07 = org.telegram.ui.ActionBar.k6.w0(i12, g6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w07, mode));
        this.f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i10, g6Var), mode));
    }
}
