package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AiTonesController;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class f0 extends sa implements NotificationCenter.NotificationCenterDelegate {
    public final ph.d A0;
    public final ph.d B0;
    public final ph.d C0;
    public final FrameLayout D0;
    public boolean E0;
    public String F0;
    public boolean G0;
    public boolean H0;
    public boolean I0;
    public String J0;
    public gj0 K0;
    public w51 L0;
    public boolean M0;
    public int N0;
    public boolean O0;
    public final TLRPC.TL_messages_composeMessageWithAI[] P0;
    public final TLRPC.TL_messages_composeRichMessageWithAI[] Q0;
    public CharSequence U;
    public TL_iv.RichMessage V;
    public boolean W;
    public CharSequence X;
    public TL_iv.RichMessage Y;
    public boolean Z;
    public CharSequence a0;
    public TL_iv.RichMessage b0;
    public boolean c0;
    public CharSequence d0;
    public TL_iv.RichMessage e0;
    public CharSequence f0;
    public Utilities.Callback g0;
    public Utilities.Callback h0;
    public long i0;
    public boolean j0;
    public Utilities.Callback4 k0;
    public td l0;
    public final boolean[] m0;
    public final boolean[] n0;
    public String o0;
    public String p0;
    public boolean q0;
    public final AiTonesController r0;
    public final FrameLayout s0;
    public final e0 t0;
    public final e0 u0;
    public final ImageView v0;
    public final FrameLayout w0;
    public final org.telegram.ui.Cells.h3 x0;
    public ph.f3 y0;
    public final LinearLayout z0;

    public f0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, true, false, false, false, false, 2, f6Var);
        this.m0 = new boolean[1];
        this.n0 = new boolean[1];
        this.M0 = true;
        this.N0 = -1;
        this.P0 = new TLRPC.TL_messages_composeMessageWithAI[3];
        this.Q0 = new TLRPC.TL_messages_composeRichMessageWithAI[3];
        AiTonesController tonesController = MessagesController.getInstance(this.currentAccount).getTonesController();
        this.r0 = tonesController;
        tonesController.load();
        tonesController.open = true;
        ImageView imageView = new ImageView(context);
        this.v0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        imageView.setColorFilter(getThemedColor(i10));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.l1(0.1f, getThemedColor(i10)), 1, -1));
        this.e.addView(imageView, k7.b6.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        k7.d6.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new b(this, 8));
        FrameLayout frameLayout = new FrameLayout(context);
        this.s0 = frameLayout;
        e0 e0Var = new e0(this.currentAccount, context, f6Var, false);
        this.t0 = e0Var;
        e0Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        int dp = AndroidUtilities.dp(28.0f);
        int i11 = org.telegram.ui.ActionBar.j6.d6;
        e0Var.setBackground(org.telegram.ui.ActionBar.j6.b0(dp, org.telegram.ui.ActionBar.j6.v0(i11, f6Var)));
        e0Var.setRoundRadius(28);
        e0Var.a(R.drawable.outline_ai_translate2, LocaleController.getString(R.string.AIEditorTabTranslate), new e(this, 3));
        e0Var.a(R.drawable.menu_rewrite, LocaleController.getString(R.string.AIEditorTabStyle), new e(this, 3));
        e0Var.a(R.drawable.menu_proofread, LocaleController.getString(R.string.AIEditorTabFix), new e(this, 3));
        e0Var.c(1);
        frameLayout.addView(e0Var, k7.b6.d(-1, -1.0f, 119, 12.0f, 0.0f, 12.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.w0 = frameLayout2;
        org.telegram.ui.Cells.h3 h3Var = new org.telegram.ui.Cells.h3(context, LocaleController.getString(R.string.ArticleAIPrompt), true, false, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get(), f6Var);
        this.x0 = h3Var;
        org.telegram.ui.Cells.f3 f3Var = h3Var.b;
        f3Var.setImeOptions(6);
        f3Var.setMaxLines(5);
        h3Var.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.j6.v0(i11, f6Var)));
        f3Var.addTextChangedListener(new l(this));
        frameLayout2.addView(h3Var, k7.b6.c(-2.0f, -1));
        frameLayout2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        f3Var.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(53.0f), AndroidUtilities.dp(15.0f));
        e0 e0Var2 = new e0(this.currentAccount, context, f6Var, true);
        this.u0 = e0Var2;
        e0Var2.setDivider(true);
        e0Var2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        e0Var2.setRoundRadius(12);
        e0Var2.n = new i(this, f6Var, context, 0);
        s0();
        e0Var2.c(-1);
        String B = v31.B();
        this.p0 = B;
        if (B == null) {
            this.p0 = TranslateController.currentLanguage();
        }
        this.I = false;
        this.H = AndroidUtilities.dp(12.0f);
        this.v = 0.35f;
        int i12 = org.telegram.ui.ActionBar.j6.a7;
        setBackgroundColor(getThemedColor(i12));
        LinearLayout linearLayout = new LinearLayout(context);
        this.z0 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        linearLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.j6.l1(0.0f, getThemedColor(i12)), getThemedColor(i12), getThemedColor(i12)}));
        ph.d dVar = new ph.d(context, f6Var, true);
        dVar.setRoundRadius(24);
        this.B0 = dVar;
        linearLayout.addView(dVar, k7.b6.o(-1, 48, 1.0f, 119));
        ph.d p10 = org.telegram.messenger.y3.p(24, context, f6Var, true);
        this.C0 = p10;
        p10.setOnClickListener(new b(this, 9));
        p10.setOnLongClickListener(new j(this, f6Var, context, 0));
        linearLayout.addView(p10, k7.b6.t(48, 48, 5, 10, 0, 0, 0));
        ph.d p11 = org.telegram.messenger.y3.p(24, context, f6Var, true);
        this.A0 = p11;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.AIEditorLimitButton));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "x50");
        spannableStringBuilder.setSpan(new a0(), length, spannableStringBuilder.length(), 33);
        p11.setText(spannableStringBuilder);
        p11.setOnClickListener(new org.telegram.messenger.video.g(23, this, f6Var));
        FrameLayout.LayoutParams e = k7.b6.e(-1, -2, 80);
        int i13 = e.leftMargin;
        int i14 = this.backgroundPaddingLeft;
        e.leftMargin = i13 + i14;
        e.rightMargin += i14;
        this.containerView.addView(linearLayout, e);
        FrameLayout.LayoutParams d = k7.b6.d(-1, 48.0f, 80, 12.0f, 6.0f, 12.0f, 12.0f);
        int i15 = d.leftMargin;
        int i16 = this.backgroundPaddingLeft;
        d.leftMargin = i15 + i16;
        d.rightMargin += i16;
        this.containerView.addView(p11, d);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.D0 = frameLayout3;
        FrameLayout.LayoutParams d10 = k7.b6.d(-1, 200.0f, 80, 0.0f, 0.0f, 0.0f, 60.0f);
        int i17 = d10.leftMargin;
        int i18 = this.backgroundPaddingLeft;
        d10.leftMargin = i17 + i18;
        d10.rightMargin += i18;
        this.containerView.addView(frameLayout3, d10);
        p0(false);
        rl0 rl0Var = this.d;
        int i19 = this.backgroundPaddingLeft;
        rl0Var.setPadding(i19, 0, i19, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.o1();
        this.d.setOnItemClickListener(new k(this, 0));
        this.L = true;
        n nVar = new n(this);
        nVar.m = false;
        nVar.C = false;
        nVar.o(mr.h);
        nVar.n(350L);
        this.d.setItemAnimator(nVar);
        this.d.setOnScrollListener(new eg.f2(this, 14));
        this.L0.N(false);
        AndroidUtilities.runOnUIThread(new c(this, 4));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.loadedAiComposeTones);
    }

    public static void P(f0 f0Var, TL_aicompose.TL_aiComposeTone tL_aiComposeTone, org.telegram.ui.ActionBar.d2 d2Var) {
        ze.c g10 = d2Var.g(-1, true, true);
        g10.d();
        TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
        deletetone.tone = TL_aicompose.InputAiComposeTone.from(tL_aiComposeTone);
        ConnectionsManager.getInstance(f0Var.currentAccount).sendRequestTyped(deletetone, new org.telegram.messenger.a(), new kh.a0(f0Var, g10, tL_aiComposeTone, 5));
    }

    public static void Q(f0 f0Var) {
        ph.f3 f3Var = f0Var.y0;
        if (f3Var != null) {
            f3Var.e(true);
            f0Var.y0 = null;
        }
        ph.f3 f3Var2 = new ph.f3(f0Var.getContext(), 1);
        f0Var.y0 = f3Var2;
        f3Var2.r();
        f0Var.y0.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        f0Var.y0.q(20.0f);
        ph.f3 f3Var3 = f0Var.y0;
        float dp = AndroidUtilities.dp(12.0f);
        float dp2 = AndroidUtilities.dp(4.0f);
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.25f, -16777216);
        Paint paint = f3Var3.C;
        f3Var3.f0 = dp;
        f3Var3.g0 = dp2;
        f3Var3.h0 = l1;
        paint.setShadowLayer(dp, 0.0f, dp2, l1);
        f0Var.y0.s(LocaleController.getString(R.string.AIEditorChooseStyle));
        f0Var.y0.l(0.5f, 0.0f);
        ph.f3 f3Var4 = f0Var.y0;
        f3Var4.d = 8000L;
        f0Var.containerView.addView(f3Var4, k7.b6.d(-1, 200.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        f0Var.y0.u();
        f0Var.r0();
    }

    public static void R(f0 f0Var, View view) {
        f0Var.q0 = !f0Var.q0;
        f0Var.k0();
        if (view instanceof LinearLayout) {
            LinearLayout linearLayout = (LinearLayout) view;
            if (linearLayout.getChildAt(0) instanceof kp) {
                ((kp) linearLayout.getChildAt(0)).a(f0Var.q0, true);
            }
        }
    }

    public static void S(f0 f0Var, int i10) {
        e0 e0Var = f0Var.t0;
        if (e0Var.getSelectedTab() == i10) {
            return;
        }
        ph.f3 f3Var = f0Var.y0;
        if (f3Var != null) {
            f3Var.e(true);
        }
        e0Var.c(i10);
        f0Var.k0();
        f0Var.L0.N(true);
    }

    public static void T(f0 f0Var, TL_aicompose.AiComposeTone aiComposeTone) {
        f0Var.r0.tones.add(0, aiComposeTone);
        f0Var.s0();
        new qc(f0Var.D0, f0Var.resourcesProvider).p(aiComposeTone.emoji_id, LocaleController.formatString(R.string.AIEditorToneCreatedTitle, aiComposeTone.title), LocaleController.getString(R.string.AIEditorToneCreatedText)).j();
    }

    public static void U(f0 f0Var, TL_aicompose.AiComposeTone aiComposeTone) {
        e0 e0Var = f0Var.u0;
        ph.f3 f3Var = f0Var.y0;
        if (f3Var != null) {
            f3Var.e(true);
        }
        if (aiComposeTone instanceof b0) {
            e0Var.d(aiComposeTone);
            f0Var.L0.N(true);
            AndroidUtilities.runOnUIThread(new c(f0Var, 2), 150L);
        } else {
            if (aiComposeTone != null) {
                if (e0Var.getSelectedTone() == aiComposeTone) {
                    return;
                }
                e0Var.d(aiComposeTone);
                f0Var.k0();
                f0Var.L0.N(true);
                return;
            }
            if (f0Var.r0.getSavedTonesCount() + 1 > (UserConfig.getInstance(f0Var.currentAccount).isPremium() ? MessagesController.getInstance(f0Var.currentAccount).config.aicomposeToneSavedLimitPremium.get() : MessagesController.getInstance(f0Var.currentAccount).config.aicomposeToneSavedLimitDefault.get())) {
                o0(f0Var.currentAccount, new qc(f0Var.D0, f0Var.resourcesProvider));
                return;
            }
            z zVar = new z(f0Var.getContext(), f0Var.resourcesProvider);
            zVar.h0 = new e(f0Var, 1);
            zVar.show();
        }
    }

    public static void V(f0 f0Var, org.telegram.ui.ActionBar.k5 k5Var, int i10, TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI, TLRPC.TL_composedRichMessageWithAI tL_composedRichMessageWithAI, TLRPC.TL_error tL_error) {
        FrameLayout frameLayout = f0Var.D0;
        f0Var.N0 = -1;
        f0Var.O0 = false;
        if (tL_error != null && ("SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text) || "AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text))) {
            new qc(frameLayout, f0Var.resourcesProvider).M(LocaleController.getString(R.string.AIEditorLimitTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.AIEditorLimitText)), R.raw.star_premium_2).j();
            f0Var.H0 = true;
            f0Var.p0(true);
            return;
        }
        if (tL_error != null) {
            org.telegram.ui.ai.u(frameLayout, f0Var.resourcesProvider, tL_error, false);
            k5Var.i(null);
            f0Var.G0 = true;
            f0Var.H0 = false;
            f0Var.p0(true);
            return;
        }
        if (tL_composedRichMessageWithAI == null) {
            k5Var.i(null);
            f0Var.G0 = true;
            f0Var.H0 = false;
            f0Var.p0(true);
            return;
        }
        k5Var.i(null);
        f0Var.H0 = false;
        f0Var.p0(true);
        f0Var.Q0[i10] = tL_messages_composeRichMessageWithAI;
        if (i10 == 0) {
            f0Var.W = false;
            f0Var.Y = tL_composedRichMessageWithAI.result;
        } else if (i10 == 1) {
            f0Var.Z = false;
            f0Var.b0 = tL_composedRichMessageWithAI.result;
        } else if (i10 == 2) {
            f0Var.c0 = false;
            f0Var.e0 = tL_composedRichMessageWithAI.result;
        }
        f0Var.L0.N(true);
    }

    public static void W(f0 f0Var, ze.c cVar, TL_aicompose.TL_aiComposeTone tL_aiComposeTone) {
        cVar.c(false);
        MessagesController.getInstance(f0Var.currentAccount).getTonesController().remove(tL_aiComposeTone);
        f0Var.s0();
    }

    public static boolean X(f0 f0Var, org.telegram.ui.ActionBar.f6 f6Var, Context context) {
        if (f0Var.j0 || (f0Var.l0 == null ? f0Var.k0 == null || f0Var.h0() == null : f0Var.g0() == null)) {
            return false;
        }
        boolean z4 = f0Var.i0 == UserConfig.getInstance(f0Var.currentAccount).getClientUserId();
        p70 F = p70.F(f0Var.container, f6Var, f0Var.C0);
        F.l(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new c(f0Var, 3), !z4);
        F.c(R.drawable.msg_calendar2, LocaleController.getString(z4 ? R.string.SetReminder : R.string.ScheduleMessage), new lh.p6(f0Var, context, f6Var, 23), false);
        F.Z();
        return true;
    }

    public static void Y(f0 f0Var, View view) {
        final f0 f0Var2;
        p70 F = p70.F(f0Var.container, f0Var.resourcesProvider, view);
        F.X = AndroidUtilities.dp(450.0f);
        int i10 = 0;
        F.t = false;
        F.Y = true;
        ScrollView scrollView = new ScrollView(f0Var.getContext());
        LinearLayout linearLayout = new LinearLayout(f0Var.getContext());
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        F.q(scrollView);
        ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(null);
        ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
        if (TextUtils.isEmpty(f0Var.p0)) {
            f0Var2 = f0Var;
        } else {
            f0Var2 = f0Var;
            f0Var2.b0(F, linearLayout, true, v31.y(v31.D(f0Var.p0, null, null)), null);
        }
        int size = suggestedLanguages.size();
        int i11 = 0;
        while (i11 < size) {
            TranslateController.Language language = suggestedLanguages.get(i11);
            i11++;
            final TranslateController.Language language2 = language;
            if (!TextUtils.equals(language2.code, f0Var2.p0)) {
                final int i12 = 0;
                f0Var2.b0(F, linearLayout, false, language2.displayName, new Runnable(f0Var2) { // from class: org.telegram.ui.Components.g
                    public final /* synthetic */ f0 b;

                    {
                        this.b = f0Var2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                f0 f0Var3 = this.b;
                                f0Var3.c0();
                                String str = language2.code;
                                f0Var3.p0 = str;
                                v31.H(str);
                                f0Var3.k0();
                                break;
                            default:
                                f0 f0Var4 = this.b;
                                f0Var4.c0();
                                String str2 = language2.code;
                                f0Var4.p0 = str2;
                                v31.H(str2);
                                f0Var4.k0();
                                break;
                        }
                    }
                });
            }
        }
        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(f0Var2.getContext(), f0Var2.resourcesProvider);
        m1Var.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(m1Var, k7.b6.n(-1, 8));
        int size2 = languages.size();
        while (i10 < size2) {
            TranslateController.Language language3 = languages.get(i10);
            i10++;
            final TranslateController.Language language4 = language3;
            final int i13 = 1;
            f0Var2.b0(F, linearLayout, TextUtils.equals(language4.code, f0Var2.p0), language4.displayName, new Runnable(f0Var2) { // from class: org.telegram.ui.Components.g
                public final /* synthetic */ f0 b;

                {
                    this.b = f0Var2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i13) {
                        case 0:
                            f0 f0Var3 = this.b;
                            f0Var3.c0();
                            String str = language4.code;
                            f0Var3.p0 = str;
                            v31.H(str);
                            f0Var3.k0();
                            break;
                        default:
                            f0 f0Var4 = this.b;
                            f0Var4.c0();
                            String str2 = language4.code;
                            f0Var4.p0 = str2;
                            v31.H(str2);
                            f0Var4.k0();
                            break;
                    }
                }
            });
        }
        F.Z();
    }

    public static void Z(f0 f0Var, org.telegram.ui.ActionBar.k5 k5Var, int i10, TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI, TLRPC.TL_composedMessageWithAI tL_composedMessageWithAI, TLRPC.TL_error tL_error) {
        FrameLayout frameLayout = f0Var.D0;
        f0Var.N0 = -1;
        f0Var.O0 = false;
        if (tL_error != null && ("SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text) || "AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text))) {
            new qc(frameLayout, f0Var.resourcesProvider).M(LocaleController.getString(R.string.AIEditorLimitTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.AIEditorLimitText)), R.raw.star_premium_2).j();
            f0Var.H0 = true;
            f0Var.p0(true);
            return;
        }
        if (tL_error != null) {
            org.telegram.ui.ai.u(frameLayout, f0Var.resourcesProvider, tL_error, false);
            k5Var.i(null);
            f0Var.G0 = true;
            f0Var.H0 = false;
            f0Var.p0(true);
            return;
        }
        if (tL_composedMessageWithAI == null) {
            k5Var.i(null);
            f0Var.G0 = true;
            f0Var.H0 = false;
            f0Var.p0(true);
            return;
        }
        k5Var.i(null);
        f0Var.H0 = false;
        f0Var.p0(true);
        f0Var.P0[i10] = tL_messages_composeMessageWithAI;
        if (i10 == 0) {
            f0Var.W = false;
            f0Var.X = MessageObject.formatTextWithEntities(tL_composedMessageWithAI.result_text);
        } else if (i10 == 1) {
            f0Var.Z = false;
            f0Var.a0 = MessageObject.formatTextWithEntities(tL_composedMessageWithAI.result_text);
        } else if (i10 == 2) {
            f0Var.c0 = false;
            TLRPC.TL_textWithEntities tL_textWithEntities = tL_composedMessageWithAI.diff_text;
            if (tL_textWithEntities != null) {
                f0Var.d0 = MessageObject.formatTextWithEntities(tL_textWithEntities);
                f0Var.f0 = MessageObject.formatTextWithEntities(tL_composedMessageWithAI.result_text);
            } else {
                CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(tL_composedMessageWithAI.result_text);
                f0Var.f0 = formatTextWithEntities;
                f0Var.d0 = formatTextWithEntities;
            }
        }
        f0Var.L0.N(true);
    }

    public static void d0(TL_iv.PageBlock pageBlock, StringBuilder sb) {
        if ((pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6) || (pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockFooter)) {
            e0(pageBlock.text, sb);
            return;
        }
        if ((pageBlock instanceof TL_iv.pageBlockMap) || (pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument) || (pageBlock instanceof TL_iv.pageBlockVideo) || (pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockSlideshow) || (pageBlock instanceof TL_iv.pageBlockCollage)) {
            TL_iv.PageCaption pageCaption = pageBlock.caption;
            if (pageCaption != null) {
                e0(pageCaption.text, sb);
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            TL_iv.RichText richText = ((TL_iv.pageBlockTable) pageBlock).title;
            if (richText != null) {
                e0(richText, sb);
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockList) {
            TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
            for (int i10 = 0; i10 < pageblocklist.items.size(); i10++) {
                if (i10 > 0) {
                    sb.append("\n");
                }
                TL_iv.PageListItem pageListItem = pageblocklist.items.get(i10);
                if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                    e0(((TL_iv.TL_pageListItemText) pageListItem).text, sb);
                } else if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                    ArrayList<TL_iv.PageBlock> arrayList = ((TL_iv.TL_pageListItemBlocks) pageListItem).blocks;
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (i11 > 0) {
                            sb.append("\n");
                        }
                        d0(arrayList.get(i11), sb);
                    }
                }
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
            TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) pageBlock;
            for (int i12 = 0; i12 < pageblockorderedlist.items.size(); i12++) {
                if (i12 > 0) {
                    sb.append("\n");
                }
                TL_iv.PageListOrderedItem pageListOrderedItem = pageblockorderedlist.items.get(i12);
                if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemText) {
                    e0(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem).text, sb);
                } else if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                    ArrayList<TL_iv.PageBlock> arrayList2 = ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem).blocks;
                    for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                        if (i13 > 0) {
                            sb.append("\n");
                        }
                        d0(arrayList2.get(i13), sb);
                    }
                }
            }
        }
    }

    public static void e0(TL_iv.RichText richText, StringBuilder sb) {
        if (richText instanceof TL_iv.textPlain) {
            sb.append(((TL_iv.textPlain) richText).text);
            return;
        }
        if (!(richText instanceof TL_iv.textConcat)) {
            if (richText != null) {
                e0(richText.text, sb);
            }
        } else {
            TL_iv.textConcat textconcat = (TL_iv.textConcat) richText;
            for (int i10 = 0; i10 < textconcat.texts.size(); i10++) {
                e0(textconcat.texts.get(i10), sb);
            }
        }
    }

    public static void f0(TL_iv.PageBlock pageBlock, SpannableStringBuilder spannableStringBuilder) {
        if ((pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6) || (pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockFooter)) {
            spannableStringBuilder.append((CharSequence) vh.y5.r(pageBlock.text, pageBlock, true));
            return;
        }
        if ((pageBlock instanceof TL_iv.pageBlockMap) || (pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument) || (pageBlock instanceof TL_iv.pageBlockVideo) || (pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockSlideshow) || (pageBlock instanceof TL_iv.pageBlockCollage)) {
            TL_iv.PageCaption pageCaption = pageBlock.caption;
            if (pageCaption != null) {
                spannableStringBuilder.append((CharSequence) vh.y5.r(pageCaption.text, null, true));
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            TL_iv.RichText richText = ((TL_iv.pageBlockTable) pageBlock).title;
            if (richText != null) {
                spannableStringBuilder.append((CharSequence) vh.y5.r(richText, null, true));
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockList) {
            TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
            for (int i10 = 0; i10 < pageblocklist.items.size(); i10++) {
                if (i10 > 0) {
                    spannableStringBuilder.append("\n");
                }
                TL_iv.PageListItem pageListItem = pageblocklist.items.get(i10);
                if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                    spannableStringBuilder.append((CharSequence) vh.y5.r(((TL_iv.TL_pageListItemText) pageListItem).text, null, true));
                } else if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                    ArrayList<TL_iv.PageBlock> arrayList = ((TL_iv.TL_pageListItemBlocks) pageListItem).blocks;
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (i11 > 0) {
                            spannableStringBuilder.append("\n");
                        }
                        f0(arrayList.get(i11), spannableStringBuilder);
                    }
                }
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
            TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) pageBlock;
            for (int i12 = 0; i12 < pageblockorderedlist.items.size(); i12++) {
                if (i12 > 0) {
                    spannableStringBuilder.append("\n");
                }
                TL_iv.PageListOrderedItem pageListOrderedItem = pageblockorderedlist.items.get(i12);
                if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemText) {
                    spannableStringBuilder.append((CharSequence) vh.y5.r(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem).text, null, true));
                } else if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                    ArrayList<TL_iv.PageBlock> arrayList2 = ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem).blocks;
                    for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                        if (i13 > 0) {
                            spannableStringBuilder.append("\n");
                        }
                        f0(arrayList2.get(i13), spannableStringBuilder);
                    }
                }
            }
        }
    }

    public static void o0(int i10, qc qcVar) {
        if (qcVar.W() == null) {
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(i10);
        boolean isPremium = UserConfig.getInstance(i10).isPremium();
        qcVar.M(LocaleController.getString(R.string.AIEditorStyleLimitTitle), AndroidUtilities.replaceSingleTag(!isPremium ? LocaleController.formatString(R.string.AIEditorStyleLimitTextPremium, Integer.valueOf(messagesController.config.aicomposeToneSavedLimitDefault.get()), Integer.valueOf(messagesController.config.aicomposeToneSavedLimitPremium.get())) : LocaleController.formatString(R.string.AIEditorStyleLimitText, Integer.valueOf(messagesController.config.aicomposeToneSavedLimitPremium.get())), new fg(qcVar, 1)), !isPremium ? R.raw.star_premium_2 : R.raw.error).j();
    }

    @Override // org.telegram.ui.Components.sa
    public final void B(float f10) {
        float f11 = 1.0f - f10;
        ImageView imageView = this.v0;
        imageView.setAlpha(f11);
        imageView.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f11));
        imageView.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f11));
    }

    public final void b0(p70 p70Var, LinearLayout linearLayout, boolean z4, String str, Runnable runnable) {
        int i10 = org.telegram.ui.ActionBar.j6.E8;
        int i11 = org.telegram.ui.ActionBar.j6.F8;
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(1, getContext(), this.resourcesProvider, false, false);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        g1Var.setText(str);
        g1Var.setChecked(z4);
        g1Var.c(org.telegram.ui.ActionBar.j6.v0(i10, this.resourcesProvider), org.telegram.ui.ActionBar.j6.v0(i11, this.resourcesProvider));
        g1Var.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i10, this.resourcesProvider)));
        g1Var.setOnClickListener(new h(p70Var, z4, runnable, 0));
        linearLayout.addView(g1Var, k7.b6.n(-1, -2));
    }

    public final void c0() {
        if (this.N0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.N0, true);
            this.N0 = -1;
        }
        this.O0 = false;
        org.telegram.ui.ActionBar.k5 titleTextView = this.e.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.i(null);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.loadedAiComposeTones) {
            s0();
        }
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.loadedAiComposeTones);
        AiTonesController aiTonesController = this.r0;
        if (aiTonesController != null) {
            aiTonesController.open = false;
        }
        super.dismiss();
    }

    public final TL_iv.RichMessage g0() {
        if (this.O0) {
            return null;
        }
        int selectedTab = this.t0.getSelectedTab();
        if (selectedTab == 0) {
            if (this.W) {
                return null;
            }
            return this.Y;
        }
        if (selectedTab == 2) {
            if (this.c0) {
                return null;
            }
            return this.e0;
        }
        if (this.Z) {
            return null;
        }
        TL_iv.RichMessage richMessage = this.b0;
        return richMessage == null ? this.V : richMessage;
    }

    public final CharSequence h0() {
        if (i0()) {
            TL_iv.RichMessage g02 = g0();
            if (g02 == null) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i10 = 0; i10 < g02.blocks.size(); i10++) {
                if (i10 > 0) {
                    spannableStringBuilder.append((CharSequence) "\n");
                }
                f0(g02.blocks.get(i10), spannableStringBuilder);
            }
            return spannableStringBuilder;
        }
        if (this.O0) {
            return null;
        }
        int selectedTab = this.t0.getSelectedTab();
        if (selectedTab == 0) {
            if (this.W) {
                return null;
            }
            return this.X;
        }
        if (selectedTab == 2) {
            if (this.c0) {
                return null;
            }
            return this.f0;
        }
        if (this.Z) {
            return null;
        }
        CharSequence charSequence = this.a0;
        return charSequence == null ? this.U : charSequence;
    }

    public final boolean i0() {
        return this.V != null;
    }

    public final i51 j0(int i10, TL_iv.RichMessage richMessage, boolean z4) {
        if (richMessage == null) {
            richMessage = this.V;
        }
        i51 of2 = RichMessageLayout.PreviewView.Factory.of(richMessage);
        of2.d = i10;
        of2.e = z4;
        return of2;
    }

    public final void k0() {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        String str;
        String str2;
        boolean i02 = i0();
        pa paVar = this.e;
        e0 e0Var = this.u0;
        e0 e0Var2 = this.t0;
        if (!i02) {
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            CharSequence[] charSequenceArr = {this.U};
            tL_textWithEntities.entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
            CharSequence charSequence4 = charSequenceArr[0];
            tL_textWithEntities.text = charSequence4 == null ? "" : charSequence4.toString();
            int selectedTab = e0Var2.getSelectedTab();
            TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = new TLRPC.TL_messages_composeMessageWithAI();
            tL_messages_composeMessageWithAI.text = tL_textWithEntities;
            if (selectedTab == 0) {
                tL_messages_composeMessageWithAI.translate_to_lang = TranslateController.normalizeLanguage(this.p0);
                tL_messages_composeMessageWithAI.tone = TL_aicompose.InputAiComposeTone.fromDefault(null);
                tL_messages_composeMessageWithAI.emojify = this.q0;
            } else if (selectedTab == 1) {
                TL_aicompose.AiComposeTone selectedTone = e0Var.getSelectedTone();
                if (selectedTone instanceof b0) {
                    TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                    inputaicomposetonesingleuse.custom_prompt = TextUtils.isEmpty(this.F0) ? "" : this.F0;
                    tL_messages_composeMessageWithAI.tone = inputaicomposetonesingleuse;
                } else if (selectedTone instanceof TL_aicompose.TL_aiComposeTone) {
                    TL_aicompose.inputAiComposeToneID inputaicomposetoneid = new TL_aicompose.inputAiComposeToneID();
                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) selectedTone;
                    inputaicomposetoneid.id = tL_aiComposeTone.id;
                    inputaicomposetoneid.access_hash = tL_aiComposeTone.access_hash;
                    tL_messages_composeMessageWithAI.tone = inputaicomposetoneid;
                } else if (selectedTone instanceof TL_aicompose.TL_aiComposeToneDefault) {
                    TL_aicompose.inputAiComposeToneDefault inputaicomposetonedefault = new TL_aicompose.inputAiComposeToneDefault();
                    inputaicomposetonedefault.tone = ((TL_aicompose.TL_aiComposeToneDefault) selectedTone).tone;
                    tL_messages_composeMessageWithAI.tone = inputaicomposetonedefault;
                }
                tL_messages_composeMessageWithAI.emojify = this.q0;
            } else if (selectedTab == 2) {
                tL_messages_composeMessageWithAI.proofread = true;
            }
            TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI2 = this.P0[selectedTab];
            if (tL_messages_composeMessageWithAI2 != null && tL_messages_composeMessageWithAI2.proofread == tL_messages_composeMessageWithAI.proofread && tL_messages_composeMessageWithAI2.emojify == tL_messages_composeMessageWithAI.emojify && TL_aicompose.InputAiComposeTone.equals(tL_messages_composeMessageWithAI2.tone, tL_messages_composeMessageWithAI.tone) && TextUtils.equals(tL_messages_composeMessageWithAI2.translate_to_lang, tL_messages_composeMessageWithAI.translate_to_lang)) {
                return;
            }
            if (tL_messages_composeMessageWithAI.emojify || tL_messages_composeMessageWithAI.proofread || tL_messages_composeMessageWithAI.tone != null || tL_messages_composeMessageWithAI.translate_to_lang != null) {
                this.O0 = true;
                this.G0 = false;
                p0(true);
                org.telegram.ui.ActionBar.k5 titleTextView = paVar.getTitleTextView();
                titleTextView.i(this.K0);
                this.K0.start();
                int selectedTab2 = e0Var2.getSelectedTab();
                CharSequence charSequence5 = this.U;
                if (selectedTab2 == 0 && (charSequence3 = this.X) != null) {
                    charSequence5 = charSequence3;
                }
                if (selectedTab2 == 1 && (charSequence2 = this.a0) != null) {
                    charSequence5 = charSequence2;
                }
                CharSequence charSequence6 = (selectedTab2 != 2 || (charSequence = this.d0) == null) ? charSequence5 : charSequence;
                TextPaint textPaint = new TextPaint();
                textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(64.0f);
                int i10 = this.backgroundPaddingLeft;
                int b10 = k7.n.b(new StaticLayout(charSequence6, textPaint, (dp - i10) - i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount(), 1, 10);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                for (int i11 = 0; i11 < b10; i11++) {
                    if (i11 > 0) {
                        spannableStringBuilder.append((CharSequence) "\n");
                    }
                    int dp2 = AndroidUtilities.dp((int) (Math.random() * 50.0d));
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Loading));
                    k90 k90Var = new k90(null, dp2, 0, null);
                    k90Var.f = AndroidUtilities.dp(6.0f);
                    k90Var.h = 0.5f;
                    k90Var.n = true;
                    spannableStringBuilder.setSpan(k90Var, length, spannableStringBuilder.length(), 33);
                }
                if (selectedTab == 0) {
                    this.W = true;
                    this.X = spannableStringBuilder;
                } else if (selectedTab == 1) {
                    this.Z = true;
                    this.a0 = spannableStringBuilder;
                } else if (selectedTab == 2) {
                    this.c0 = true;
                    this.d0 = spannableStringBuilder;
                }
                this.N0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_composeMessageWithAI, new org.telegram.messenger.a(), new lh.i0(this, titleTextView, selectedTab, tL_messages_composeMessageWithAI, 2));
                this.L0.N(true);
                return;
            }
            return;
        }
        int selectedTab3 = e0Var2.getSelectedTab();
        String str3 = "";
        TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
        tL_messages_composeRichMessageWithAI.flags |= 16;
        TL_iv.RichMessage richMessage = this.V;
        TL_iv.TL_inputRichMessage tL_inputRichMessage = new TL_iv.TL_inputRichMessage();
        if (richMessage == null) {
            str = str3;
            str2 = null;
        } else {
            tL_inputRichMessage.rtl = richMessage.rtl;
            tL_inputRichMessage.blocks = new ArrayList<>(richMessage.blocks.size());
            for (int i12 = 0; i12 < richMessage.blocks.size(); i12++) {
                tL_inputRichMessage.blocks.add(SendMessagesHelper.toInputPageBlock(richMessage.blocks.get(i12)));
            }
            ArrayList<TLRPC.Photo> arrayList = richMessage.photos;
            if (arrayList != null && !arrayList.isEmpty()) {
                tL_inputRichMessage.flags |= 4;
                ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
                int size = arrayList2.size();
                int i13 = 0;
                while (i13 < size) {
                    TLRPC.Photo photo = arrayList2.get(i13);
                    i13++;
                    TLRPC.Photo photo2 = photo;
                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                    String str4 = str3;
                    tL_inputPhoto.id = photo2.id;
                    tL_inputPhoto.access_hash = photo2.access_hash;
                    byte[] bArr = photo2.file_reference;
                    if (bArr == null) {
                        bArr = new byte[0];
                    }
                    tL_inputPhoto.file_reference = bArr;
                    tL_inputRichMessage.photos.add(tL_inputPhoto);
                    str3 = str4;
                }
            }
            str = str3;
            str2 = null;
            ArrayList<TLRPC.Document> arrayList3 = richMessage.documents;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                tL_inputRichMessage.flags |= 8;
                ArrayList<TLRPC.Document> arrayList4 = richMessage.documents;
                int size2 = arrayList4.size();
                int i14 = 0;
                while (i14 < size2) {
                    TLRPC.Document document = arrayList4.get(i14);
                    i14++;
                    TLRPC.Document document2 = document;
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputDocument.id = document2.id;
                    tL_inputDocument.access_hash = document2.access_hash;
                    byte[] bArr2 = document2.file_reference;
                    if (bArr2 == null) {
                        bArr2 = new byte[0];
                    }
                    tL_inputDocument.file_reference = bArr2;
                    tL_inputRichMessage.documents.add(tL_inputDocument);
                }
            }
        }
        tL_messages_composeRichMessageWithAI.text = tL_inputRichMessage;
        if (selectedTab3 == 0) {
            tL_messages_composeRichMessageWithAI.translate_to_lang = TranslateController.normalizeLanguage(this.p0);
            tL_messages_composeRichMessageWithAI.tone = TL_aicompose.InputAiComposeTone.fromDefault(str2);
            tL_messages_composeRichMessageWithAI.emojify = this.q0;
        } else if (selectedTab3 == 1) {
            TL_aicompose.AiComposeTone selectedTone2 = e0Var.getSelectedTone();
            if (selectedTone2 instanceof b0) {
                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse2 = new TL_aicompose.inputAiComposeToneSingleUse();
                inputaicomposetonesingleuse2.custom_prompt = TextUtils.isEmpty(this.F0) ? str : this.F0;
                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse2;
            } else if (selectedTone2 instanceof TL_aicompose.TL_aiComposeTone) {
                TL_aicompose.inputAiComposeToneID inputaicomposetoneid2 = new TL_aicompose.inputAiComposeToneID();
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = (TL_aicompose.TL_aiComposeTone) selectedTone2;
                inputaicomposetoneid2.id = tL_aiComposeTone2.id;
                inputaicomposetoneid2.access_hash = tL_aiComposeTone2.access_hash;
                tL_messages_composeRichMessageWithAI.tone = inputaicomposetoneid2;
            } else if (selectedTone2 instanceof TL_aicompose.TL_aiComposeToneDefault) {
                TL_aicompose.inputAiComposeToneDefault inputaicomposetonedefault2 = new TL_aicompose.inputAiComposeToneDefault();
                inputaicomposetonedefault2.tone = ((TL_aicompose.TL_aiComposeToneDefault) selectedTone2).tone;
                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonedefault2;
            }
            tL_messages_composeRichMessageWithAI.emojify = this.q0;
        } else if (selectedTab3 == 2) {
            tL_messages_composeRichMessageWithAI.proofread = true;
        }
        TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI2 = this.Q0[selectedTab3];
        if (tL_messages_composeRichMessageWithAI2 != null && tL_messages_composeRichMessageWithAI2.proofread == tL_messages_composeRichMessageWithAI.proofread && tL_messages_composeRichMessageWithAI2.emojify == tL_messages_composeRichMessageWithAI.emojify && TL_aicompose.InputAiComposeTone.equals(tL_messages_composeRichMessageWithAI2.tone, tL_messages_composeRichMessageWithAI.tone) && TextUtils.equals(tL_messages_composeRichMessageWithAI2.translate_to_lang, tL_messages_composeRichMessageWithAI.translate_to_lang)) {
            return;
        }
        if (tL_messages_composeRichMessageWithAI.emojify || tL_messages_composeRichMessageWithAI.proofread || tL_messages_composeRichMessageWithAI.tone != null || tL_messages_composeRichMessageWithAI.translate_to_lang != null) {
            this.O0 = true;
            this.G0 = false;
            p0(true);
            org.telegram.ui.ActionBar.k5 titleTextView2 = paVar.getTitleTextView();
            titleTextView2.i(this.K0);
            this.K0.start();
            if (selectedTab3 == 0) {
                this.W = true;
            } else if (selectedTab3 == 1) {
                this.Z = true;
            } else if (selectedTab3 == 2) {
                this.c0 = true;
            }
            this.N0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_composeRichMessageWithAI, new org.telegram.messenger.a(), new lh.i0(this, titleTextView2, selectedTab3, tL_messages_composeRichMessageWithAI, 3));
            this.L0.N(true);
        }
    }

    public final void l0(int i10, int i11, boolean z4) {
        if (this.l0 != null) {
            TL_iv.RichMessage g02 = g0();
            if (g02 != null) {
                this.l0.run(g02, Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z4));
                return;
            }
            return;
        }
        if (this.k0 == null || h0() == null) {
            return;
        }
        this.k0.run(h0(), Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.String] */
    public final void m0(Editable editable) {
        ?? spannableStringBuilder;
        int i10 = 3;
        int i11 = 0;
        if (e2.c.s(editable)) {
            spannableStringBuilder = new SpannableStringBuilder(editable.toString());
            Class[] clsArr = {t01.class, CodeHighlighting.Span.class, cw0.class, p51.class, o51.class, l51.class, m51.class, i10.class, k51.class, j51.class, u5.class};
            for (int i12 = 0; i12 < 11; i12++) {
                for (Object obj : editable.getSpans(0, editable.length(), clsArr[i12])) {
                    spannableStringBuilder.setSpan(obj, editable.getSpanStart(obj), editable.getSpanEnd(obj), 33);
                }
            }
        } else {
            spannableStringBuilder = editable.toString();
        }
        this.U = spannableStringBuilder;
        if (LanguageDetector.hasSupport()) {
            LanguageDetector.detectLanguage(editable.toString(), new a(this, i11), new org.telegram.ui.bs(i10));
        }
    }

    public final void n0(TL_iv.RichMessage richMessage) {
        this.V = richMessage;
        if (LanguageDetector.hasSupport()) {
            TL_iv.RichMessage richMessage2 = this.V;
            StringBuilder sb = new StringBuilder();
            for (int i10 = 0; i10 < richMessage2.blocks.size(); i10++) {
                if (i10 > 0) {
                    sb.append("\n");
                }
                d0(richMessage2.blocks.get(i10), sb);
            }
            LanguageDetector.detectLanguage(sb.toString(), new a(this, 1), new org.telegram.ui.bs(4));
        }
        s0();
    }

    @Override // org.telegram.ui.Components.sa, org.telegram.ui.ActionBar.g3
    public final void onContainerViewTranslation() {
        super.onContainerViewTranslation();
        ValueAnimator valueAnimator = this.keyboardContentAnimator;
        LinearLayout linearLayout = this.z0;
        if (valueAnimator != null) {
            linearLayout.setTranslationY(-((Float) valueAnimator.getAnimatedValue()).floatValue());
        } else {
            linearLayout.setTranslationY(0.0f);
        }
    }

    public final void p0(boolean z4) {
        boolean z10 = this.G0;
        ph.d dVar = this.B0;
        if (z10) {
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new b(this, 0));
        } else {
            e0 e0Var = this.t0;
            if ((e0Var != null ? e0Var.getSelectedTab() : 0) == 1 && (this.u0.getSelectedTone() instanceof b0) && !TextUtils.equals(this.x0.getText().toString(), this.F0)) {
                dVar.setText(LocaleController.getString(R.string.ArticleAIGenerate));
                dVar.setOnClickListener(new b(this, 1));
            } else if (this.h0 == null && this.g0 == null) {
                dVar.setText(LocaleController.getString(R.string.OK));
                dVar.setOnClickListener(new b(this, 3));
            } else {
                dVar.setText(LocaleController.getString(R.string.AIEditorApply));
                dVar.setOnClickListener(new b(this, 2));
            }
        }
        dVar.setLoading(this.O0);
        if (z4 && this.I0 == this.H0) {
            return;
        }
        boolean z11 = this.H0;
        this.I0 = z11;
        LinearLayout linearLayout = this.z0;
        ph.d dVar2 = this.A0;
        if (!z4) {
            dVar2.setVisibility(z11 ? 0 : 8);
            dVar2.setAlpha(this.H0 ? 1.0f : 0.0f);
            linearLayout.setVisibility(this.H0 ? 8 : 0);
            linearLayout.setAlpha(this.H0 ? 0.0f : 1.0f);
            return;
        }
        dVar2.setVisibility(0);
        linearLayout.setVisibility(0);
        ViewPropertyAnimator alpha = dVar2.animate().alpha(this.H0 ? 1.0f : 0.0f);
        mr mrVar = mr.h;
        alpha.setInterpolator(mrVar).setDuration(320L).withEndAction(new c(this, 0)).start();
        linearLayout.animate().alpha(this.H0 ? 0.0f : 1.0f).setInterpolator(mrVar).setDuration(320L).withEndAction(new c(this, 1)).start();
    }

    public final void q0() {
        String str = this.F0;
        org.telegram.ui.Cells.h3 h3Var = this.x0;
        boolean equals = TextUtils.equals(str, h3Var.b.getText().toString());
        boolean z4 = !equals;
        if (this.E0 == z4) {
            return;
        }
        ViewPropertyAnimator animate = h3Var.b.animate();
        this.E0 = z4;
        animate.alpha(!equals ? 1.0f : 0.5f).setDuration(320L).start();
        this.L0.N(true);
    }

    public final void r0() {
        rl0 rl0Var;
        View view;
        if (this.y0 == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            rl0Var = this.d;
            if (i10 >= rl0Var.getChildCount()) {
                view = null;
                break;
            }
            view = rl0Var.getChildAt(i10);
            i51 G = this.L0.G(RecyclerView.R(view) - 1);
            if (G != null && G.c == this.u0) {
                break;
            } else {
                i10++;
            }
        }
        if (view == null) {
            this.y0.setVisibility(4);
            this.y0.e(true);
        } else {
            this.y0.setVisibility(0);
            this.y0.setTranslationY(view.getY() + rl0Var.getY() + view.getHeight());
        }
    }

    public final void s0() {
        e0 e0Var = this.u0;
        TL_aicompose.AiComposeTone selectedTone = e0Var.getSelectedTone();
        e0Var.c.removeAllViews();
        if (i0()) {
            e0Var.b(new b0(), new e(this, 0));
        }
        e0Var.b(null, new e(this, 0));
        ArrayList<TL_aicompose.AiComposeTone> arrayList = this.r0.tones;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TL_aicompose.AiComposeTone aiComposeTone = arrayList.get(i10);
            i10++;
            e0Var.b(aiComposeTone, new e(this, 0));
        }
        if (selectedTone != e0Var.getSelectedTone()) {
            e0Var.d(null);
        }
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
    public final void show() {
        super.show();
        pa paVar = this.e;
        if (paVar != null) {
            paVar.setTitle(y());
        }
        int i10 = (this.j0 || (this.l0 == null && this.k0 == null)) ? 8 : 0;
        ph.d dVar = this.C0;
        dVar.setVisibility(i10);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Send));
        lq lqVar = new lq(this.j0 ? R.drawable.filled_profile_edit_24 : R.drawable.send_plane_24, 0);
        lqVar.setTranslateY(AndroidUtilities.dp(1.0f));
        spannableStringBuilder.setSpan(lqVar, 0, spannableStringBuilder.length(), 33);
        dVar.setText(spannableStringBuilder);
        this.L0.N(false);
        k0();
        p0(true);
    }

    @Override // org.telegram.ui.Components.sa
    public final ql0 v(rl0 rl0Var) {
        w51 w51Var = new w51(rl0Var, getContext(), this.currentAccount, 0, true, new d(this, 0), this.resourcesProvider);
        this.L0 = w51Var;
        w51Var.r = false;
        return w51Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        if (this.J0 == null) {
            this.J0 = LocaleController.getString(R.string.AIEditor);
            gj0 gj0Var = new gj0(R.raw.emoji_stars, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
            this.K0 = gj0Var;
            gj0Var.H(true);
            this.K0.I(1);
        }
        return this.J0;
    }
}
