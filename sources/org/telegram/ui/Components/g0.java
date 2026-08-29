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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class g0 extends xa implements NotificationCenter.NotificationCenterDelegate {
    public final nh.d A0;
    public final nh.d B0;
    public final FrameLayout C0;
    public boolean D0;
    public String E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public String I0;
    public xi0 J0;
    public k51 K0;
    public boolean L0;
    public int M0;
    public boolean N0;
    public final TLRPC.TL_messages_composeMessageWithAI[] O0;
    public final TLRPC.TL_messages_composeRichMessageWithAI[] P0;
    public CharSequence T;
    public TL_iv.RichMessage U;
    public boolean V;
    public CharSequence W;
    public TL_iv.RichMessage X;
    public boolean Y;
    public CharSequence Z;
    public TL_iv.RichMessage a0;
    public boolean b0;
    public CharSequence c0;
    public TL_iv.RichMessage d0;
    public CharSequence e0;
    public Utilities.Callback f0;
    public Utilities.Callback g0;
    public long h0;
    public boolean i0;
    public Utilities.Callback4 j0;
    public wd k0;
    public final boolean[] l0;
    public final boolean[] m0;
    public String n0;
    public String o0;
    public boolean p0;
    public final AiTonesController q0;
    public final FrameLayout r0;
    public final f0 s0;
    public final f0 t0;
    public final ImageView u0;
    public final FrameLayout v0;
    public final org.telegram.ui.Cells.g3 w0;
    public nh.t3 x0;
    public final LinearLayout y0;
    public final nh.d z0;

    public g0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null, true, false, false, false, false, 2, c6Var);
        this.l0 = new boolean[1];
        this.m0 = new boolean[1];
        this.L0 = true;
        this.M0 = -1;
        this.O0 = new TLRPC.TL_messages_composeMessageWithAI[3];
        this.P0 = new TLRPC.TL_messages_composeRichMessageWithAI[3];
        AiTonesController tonesController = MessagesController.getInstance(this.currentAccount).getTonesController();
        this.q0 = tonesController;
        tonesController.load();
        tonesController.open = true;
        ImageView imageView = new ImageView(context);
        this.u0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        imageView.setColorFilter(getThemedColor(i10));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.l1(0.1f, getThemedColor(i10)), 1, -1));
        this.e.addView(imageView, i7.f6.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        i7.h6.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new b(this, 8));
        FrameLayout frameLayout = new FrameLayout(context);
        this.r0 = frameLayout;
        f0 f0Var = new f0(this.currentAccount, context, c6Var, false);
        this.s0 = f0Var;
        f0Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        int dp = AndroidUtilities.dp(28.0f);
        int i11 = org.telegram.ui.ActionBar.g6.d6;
        f0Var.setBackground(org.telegram.ui.ActionBar.g6.b0(dp, org.telegram.ui.ActionBar.g6.v0(i11, c6Var)));
        f0Var.setRoundRadius(28);
        f0Var.a(R.drawable.outline_ai_translate2, LocaleController.getString(R.string.AIEditorTabTranslate), new e(this, 3));
        f0Var.a(R.drawable.menu_rewrite, LocaleController.getString(R.string.AIEditorTabStyle), new e(this, 3));
        f0Var.a(R.drawable.menu_proofread, LocaleController.getString(R.string.AIEditorTabFix), new e(this, 3));
        f0Var.c(1);
        frameLayout.addView(f0Var, i7.f6.d(-1, -1.0f, 119, 12.0f, 0.0f, 12.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.v0 = frameLayout2;
        org.telegram.ui.Cells.g3 g3Var = new org.telegram.ui.Cells.g3(context, LocaleController.getString(R.string.ArticleAIPrompt), true, false, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get(), c6Var);
        this.w0 = g3Var;
        org.telegram.ui.Cells.e3 e3Var = g3Var.b;
        e3Var.setImeOptions(6);
        e3Var.setMaxLines(5);
        g3Var.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.g6.v0(i11, c6Var)));
        e3Var.addTextChangedListener(new l(this));
        frameLayout2.addView(g3Var, i7.f6.c(-2.0f, -1));
        frameLayout2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        e3Var.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(53.0f), AndroidUtilities.dp(15.0f));
        f0 f0Var2 = new f0(this.currentAccount, context, c6Var, true);
        this.t0 = f0Var2;
        f0Var2.setDivider(true);
        f0Var2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        f0Var2.setRoundRadius(12);
        f0Var2.n = new nh.v4(this, c6Var, context, 1);
        s0();
        f0Var2.c(-1);
        String B = k31.B();
        this.o0 = B;
        if (B == null) {
            this.o0 = TranslateController.currentLanguage();
        }
        this.H = false;
        this.G = AndroidUtilities.dp(12.0f);
        this.v = 0.35f;
        int i12 = org.telegram.ui.ActionBar.g6.a7;
        setBackgroundColor(getThemedColor(i12));
        LinearLayout linearLayout = new LinearLayout(context);
        this.y0 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        linearLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.g6.l1(0.0f, getThemedColor(i12)), getThemedColor(i12), getThemedColor(i12)}));
        nh.d dVar = new nh.d(context, c6Var, true);
        dVar.setRoundRadius(24);
        this.A0 = dVar;
        linearLayout.addView(dVar, i7.f6.o(-1, 48, 1.0f, 119));
        nh.d o10 = org.telegram.messenger.x3.o(24, context, c6Var, true);
        this.B0 = o10;
        o10.setOnClickListener(new b(this, 9));
        o10.setOnLongClickListener(new j(this, c6Var, context, 0));
        linearLayout.addView(o10, i7.f6.t(48, 48, 5, 10, 0, 0, 0));
        nh.d o11 = org.telegram.messenger.x3.o(24, context, c6Var, true);
        this.z0 = o11;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.AIEditorLimitButton));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "x50");
        spannableStringBuilder.setSpan(new b0(), length, spannableStringBuilder.length(), 33);
        o11.setText(spannableStringBuilder);
        o11.setOnClickListener(new nh.r7(26, this, c6Var));
        FrameLayout.LayoutParams e10 = i7.f6.e(-1, -2, 80);
        int i13 = e10.leftMargin;
        int i14 = this.backgroundPaddingLeft;
        e10.leftMargin = i13 + i14;
        e10.rightMargin += i14;
        this.containerView.addView(linearLayout, e10);
        FrameLayout.LayoutParams d = i7.f6.d(-1, 48.0f, 80, 12.0f, 6.0f, 12.0f, 12.0f);
        int i15 = d.leftMargin;
        int i16 = this.backgroundPaddingLeft;
        d.leftMargin = i15 + i16;
        d.rightMargin += i16;
        this.containerView.addView(o11, d);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.C0 = frameLayout3;
        FrameLayout.LayoutParams d10 = i7.f6.d(-1, 200.0f, 80, 0.0f, 0.0f, 0.0f, 60.0f);
        int i17 = d10.leftMargin;
        int i18 = this.backgroundPaddingLeft;
        d10.leftMargin = i17 + i18;
        d10.rightMargin += i18;
        this.containerView.addView(frameLayout3, d10);
        p0(false);
        jl0 jl0Var = this.d;
        int i19 = this.backgroundPaddingLeft;
        jl0Var.setPadding(i19, 0, i19, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.p1();
        this.d.setOnItemClickListener(new k(this, 0));
        this.K = true;
        o oVar = new o(this);
        oVar.m = false;
        oVar.C = false;
        oVar.o(jr.h);
        oVar.n(350L);
        this.d.setItemAnimator(oVar);
        this.d.setOnScrollListener(new cg.g2(this, 16));
        this.K0.N(false);
        AndroidUtilities.runOnUIThread(new c(this, 4));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.loadedAiComposeTones);
    }

    public static void P(g0 g0Var, TL_aicompose.TL_aiComposeTone tL_aiComposeTone, org.telegram.ui.ActionBar.c2 c2Var) {
        ye.c g10 = c2Var.g(-1, true, true);
        g10.d();
        TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
        deletetone.tone = TL_aicompose.InputAiComposeTone.from(tL_aiComposeTone);
        ConnectionsManager.getInstance(g0Var.currentAccount).sendRequestTyped(deletetone, new org.telegram.messenger.a(), new ih.b0(g0Var, g10, tL_aiComposeTone, 5));
    }

    public static void Q(g0 g0Var) {
        nh.t3 t3Var = g0Var.x0;
        if (t3Var != null) {
            t3Var.e(true);
            g0Var.x0 = null;
        }
        nh.t3 t3Var2 = new nh.t3(g0Var.getContext(), 1);
        g0Var.x0 = t3Var2;
        t3Var2.s();
        g0Var.x0.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        g0Var.x0.r(20.0f);
        nh.t3 t3Var3 = g0Var.x0;
        float dp = AndroidUtilities.dp(12.0f);
        float dp2 = AndroidUtilities.dp(4.0f);
        int l1 = org.telegram.ui.ActionBar.g6.l1(0.25f, -16777216);
        Paint paint = t3Var3.B;
        t3Var3.e0 = dp;
        t3Var3.f0 = dp2;
        t3Var3.g0 = l1;
        paint.setShadowLayer(dp, 0.0f, dp2, l1);
        g0Var.x0.t(LocaleController.getString(R.string.AIEditorChooseStyle));
        g0Var.x0.m(0.5f, 0.0f);
        nh.t3 t3Var4 = g0Var.x0;
        t3Var4.d = 8000L;
        g0Var.containerView.addView(t3Var4, i7.f6.d(-1, 200.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        g0Var.x0.v();
        g0Var.r0();
    }

    public static void R(g0 g0Var, View view) {
        g0Var.p0 = !g0Var.p0;
        g0Var.k0();
        if (view instanceof LinearLayout) {
            LinearLayout linearLayout = (LinearLayout) view;
            if (linearLayout.getChildAt(0) instanceof hp) {
                ((hp) linearLayout.getChildAt(0)).a(g0Var.p0, true);
            }
        }
    }

    public static void S(g0 g0Var, int i10) {
        f0 f0Var = g0Var.s0;
        if (f0Var.getSelectedTab() == i10) {
            return;
        }
        nh.t3 t3Var = g0Var.x0;
        if (t3Var != null) {
            t3Var.e(true);
        }
        f0Var.c(i10);
        g0Var.k0();
        g0Var.K0.N(true);
    }

    public static void T(g0 g0Var, TL_aicompose.AiComposeTone aiComposeTone) {
        g0Var.q0.tones.add(0, aiComposeTone);
        g0Var.s0();
        new tc(g0Var.C0, g0Var.resourcesProvider).p(aiComposeTone.emoji_id, LocaleController.formatString(R.string.AIEditorToneCreatedTitle, aiComposeTone.title), LocaleController.getString(R.string.AIEditorToneCreatedText)).j();
    }

    public static void U(g0 g0Var, TL_aicompose.AiComposeTone aiComposeTone) {
        f0 f0Var = g0Var.t0;
        nh.t3 t3Var = g0Var.x0;
        if (t3Var != null) {
            t3Var.e(true);
        }
        if (aiComposeTone instanceof c0) {
            f0Var.d(aiComposeTone);
            g0Var.K0.N(true);
            AndroidUtilities.runOnUIThread(new c(g0Var, 2), 150L);
        } else {
            if (aiComposeTone != null) {
                if (f0Var.getSelectedTone() == aiComposeTone) {
                    return;
                }
                f0Var.d(aiComposeTone);
                g0Var.k0();
                g0Var.K0.N(true);
                return;
            }
            if (g0Var.q0.getSavedTonesCount() + 1 > (UserConfig.getInstance(g0Var.currentAccount).isPremium() ? MessagesController.getInstance(g0Var.currentAccount).config.aicomposeToneSavedLimitPremium.get() : MessagesController.getInstance(g0Var.currentAccount).config.aicomposeToneSavedLimitDefault.get())) {
                o0(g0Var.currentAccount, new tc(g0Var.C0, g0Var.resourcesProvider));
                return;
            }
            a0 a0Var = new a0(g0Var.getContext(), g0Var.resourcesProvider);
            a0Var.g0 = new e(g0Var, 1);
            a0Var.show();
        }
    }

    public static void V(g0 g0Var, org.telegram.ui.ActionBar.h5 h5Var, int i10, TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI, TLRPC.TL_composedRichMessageWithAI tL_composedRichMessageWithAI, TLRPC.TL_error tL_error) {
        FrameLayout frameLayout = g0Var.C0;
        g0Var.M0 = -1;
        g0Var.N0 = false;
        if (tL_error != null && ("SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text) || "AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text))) {
            new tc(frameLayout, g0Var.resourcesProvider).M(LocaleController.getString(R.string.AIEditorLimitTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.AIEditorLimitText)), R.raw.star_premium_2).j();
            g0Var.G0 = true;
            g0Var.p0(true);
            return;
        }
        if (tL_error != null) {
            org.telegram.ui.th.t(frameLayout, g0Var.resourcesProvider, tL_error, false);
            h5Var.i(null);
            g0Var.F0 = true;
            g0Var.G0 = false;
            g0Var.p0(true);
            return;
        }
        if (tL_composedRichMessageWithAI == null) {
            h5Var.i(null);
            g0Var.F0 = true;
            g0Var.G0 = false;
            g0Var.p0(true);
            return;
        }
        h5Var.i(null);
        g0Var.G0 = false;
        g0Var.p0(true);
        g0Var.P0[i10] = tL_messages_composeRichMessageWithAI;
        if (i10 == 0) {
            g0Var.V = false;
            g0Var.X = tL_composedRichMessageWithAI.result;
        } else if (i10 == 1) {
            g0Var.Y = false;
            g0Var.a0 = tL_composedRichMessageWithAI.result;
        } else if (i10 == 2) {
            g0Var.b0 = false;
            g0Var.d0 = tL_composedRichMessageWithAI.result;
        }
        g0Var.K0.N(true);
    }

    public static void W(g0 g0Var, ye.c cVar, TL_aicompose.TL_aiComposeTone tL_aiComposeTone) {
        cVar.c(false);
        MessagesController.getInstance(g0Var.currentAccount).getTonesController().remove(tL_aiComposeTone);
        g0Var.s0();
    }

    public static boolean X(g0 g0Var, org.telegram.ui.ActionBar.c6 c6Var, Context context) {
        if (g0Var.i0 || (g0Var.k0 == null ? g0Var.j0 == null || g0Var.h0() == null : g0Var.g0() == null)) {
            return false;
        }
        boolean z10 = g0Var.h0 == UserConfig.getInstance(g0Var.currentAccount).getClientUserId();
        j70 F = j70.F(g0Var.container, c6Var, g0Var.B0);
        F.l(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new c(g0Var, 3), !z10);
        F.c(R.drawable.msg_calendar2, LocaleController.getString(z10 ? R.string.SetReminder : R.string.ScheduleMessage), new g(g0Var, context, c6Var, 0), false);
        F.Z();
        return true;
    }

    public static void Y(g0 g0Var, View view) {
        final g0 g0Var2;
        j70 F = j70.F(g0Var.container, g0Var.resourcesProvider, view);
        F.X = AndroidUtilities.dp(450.0f);
        int i10 = 0;
        F.t = false;
        F.Y = true;
        ScrollView scrollView = new ScrollView(g0Var.getContext());
        LinearLayout linearLayout = new LinearLayout(g0Var.getContext());
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        F.q(scrollView);
        ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(null);
        ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
        if (TextUtils.isEmpty(g0Var.o0)) {
            g0Var2 = g0Var;
        } else {
            g0Var2 = g0Var;
            g0Var2.b0(F, linearLayout, true, k31.y(k31.D(g0Var.o0, null, null)), null);
        }
        int size = suggestedLanguages.size();
        int i11 = 0;
        while (i11 < size) {
            TranslateController.Language language = suggestedLanguages.get(i11);
            i11++;
            final TranslateController.Language language2 = language;
            if (!TextUtils.equals(language2.code, g0Var2.o0)) {
                final int i12 = 0;
                g0Var2.b0(F, linearLayout, false, language2.displayName, new Runnable(g0Var2) { // from class: org.telegram.ui.Components.h
                    public final /* synthetic */ g0 b;

                    {
                        this.b = g0Var2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                g0 g0Var3 = this.b;
                                g0Var3.c0();
                                String str = language2.code;
                                g0Var3.o0 = str;
                                k31.H(str);
                                g0Var3.k0();
                                break;
                            default:
                                g0 g0Var4 = this.b;
                                g0Var4.c0();
                                String str2 = language2.code;
                                g0Var4.o0 = str2;
                                k31.H(str2);
                                g0Var4.k0();
                                break;
                        }
                    }
                });
            }
        }
        org.telegram.ui.ActionBar.l1 l1Var = new org.telegram.ui.ActionBar.l1(g0Var2.getContext(), g0Var2.resourcesProvider);
        l1Var.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(l1Var, i7.f6.n(-1, 8));
        int size2 = languages.size();
        while (i10 < size2) {
            TranslateController.Language language3 = languages.get(i10);
            i10++;
            final TranslateController.Language language4 = language3;
            final int i13 = 1;
            g0Var2.b0(F, linearLayout, TextUtils.equals(language4.code, g0Var2.o0), language4.displayName, new Runnable(g0Var2) { // from class: org.telegram.ui.Components.h
                public final /* synthetic */ g0 b;

                {
                    this.b = g0Var2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i13) {
                        case 0:
                            g0 g0Var3 = this.b;
                            g0Var3.c0();
                            String str = language4.code;
                            g0Var3.o0 = str;
                            k31.H(str);
                            g0Var3.k0();
                            break;
                        default:
                            g0 g0Var4 = this.b;
                            g0Var4.c0();
                            String str2 = language4.code;
                            g0Var4.o0 = str2;
                            k31.H(str2);
                            g0Var4.k0();
                            break;
                    }
                }
            });
        }
        F.Z();
    }

    public static void Z(g0 g0Var, org.telegram.ui.ActionBar.h5 h5Var, int i10, TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI, TLRPC.TL_composedMessageWithAI tL_composedMessageWithAI, TLRPC.TL_error tL_error) {
        FrameLayout frameLayout = g0Var.C0;
        g0Var.M0 = -1;
        g0Var.N0 = false;
        if (tL_error != null && ("SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text) || "AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text))) {
            new tc(frameLayout, g0Var.resourcesProvider).M(LocaleController.getString(R.string.AIEditorLimitTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.AIEditorLimitText)), R.raw.star_premium_2).j();
            g0Var.G0 = true;
            g0Var.p0(true);
            return;
        }
        if (tL_error != null) {
            org.telegram.ui.th.t(frameLayout, g0Var.resourcesProvider, tL_error, false);
            h5Var.i(null);
            g0Var.F0 = true;
            g0Var.G0 = false;
            g0Var.p0(true);
            return;
        }
        if (tL_composedMessageWithAI == null) {
            h5Var.i(null);
            g0Var.F0 = true;
            g0Var.G0 = false;
            g0Var.p0(true);
            return;
        }
        h5Var.i(null);
        g0Var.G0 = false;
        g0Var.p0(true);
        g0Var.O0[i10] = tL_messages_composeMessageWithAI;
        if (i10 == 0) {
            g0Var.V = false;
            g0Var.W = MessageObject.formatTextWithEntities(tL_composedMessageWithAI.result_text);
        } else if (i10 == 1) {
            g0Var.Y = false;
            g0Var.Z = MessageObject.formatTextWithEntities(tL_composedMessageWithAI.result_text);
        } else if (i10 == 2) {
            g0Var.b0 = false;
            TLRPC.TL_textWithEntities tL_textWithEntities = tL_composedMessageWithAI.diff_text;
            if (tL_textWithEntities != null) {
                g0Var.c0 = MessageObject.formatTextWithEntities(tL_textWithEntities);
                g0Var.e0 = MessageObject.formatTextWithEntities(tL_composedMessageWithAI.result_text);
            } else {
                CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(tL_composedMessageWithAI.result_text);
                g0Var.e0 = formatTextWithEntities;
                g0Var.c0 = formatTextWithEntities;
            }
        }
        g0Var.K0.N(true);
    }

    public static void d0(TL_iv.PageBlock pageBlock, StringBuilder sb2) {
        if ((pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6) || (pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockFooter)) {
            e0(pageBlock.text, sb2);
            return;
        }
        if ((pageBlock instanceof TL_iv.pageBlockMap) || (pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument) || (pageBlock instanceof TL_iv.pageBlockVideo) || (pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockSlideshow) || (pageBlock instanceof TL_iv.pageBlockCollage)) {
            TL_iv.PageCaption pageCaption = pageBlock.caption;
            if (pageCaption != null) {
                e0(pageCaption.text, sb2);
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            TL_iv.RichText richText = ((TL_iv.pageBlockTable) pageBlock).title;
            if (richText != null) {
                e0(richText, sb2);
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockList) {
            TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
            for (int i10 = 0; i10 < pageblocklist.items.size(); i10++) {
                if (i10 > 0) {
                    sb2.append("\n");
                }
                TL_iv.PageListItem pageListItem = pageblocklist.items.get(i10);
                if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                    e0(((TL_iv.TL_pageListItemText) pageListItem).text, sb2);
                } else if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                    ArrayList<TL_iv.PageBlock> arrayList = ((TL_iv.TL_pageListItemBlocks) pageListItem).blocks;
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (i11 > 0) {
                            sb2.append("\n");
                        }
                        d0(arrayList.get(i11), sb2);
                    }
                }
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
            TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) pageBlock;
            for (int i12 = 0; i12 < pageblockorderedlist.items.size(); i12++) {
                if (i12 > 0) {
                    sb2.append("\n");
                }
                TL_iv.PageListOrderedItem pageListOrderedItem = pageblockorderedlist.items.get(i12);
                if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemText) {
                    e0(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem).text, sb2);
                } else if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                    ArrayList<TL_iv.PageBlock> arrayList2 = ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem).blocks;
                    for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                        if (i13 > 0) {
                            sb2.append("\n");
                        }
                        d0(arrayList2.get(i13), sb2);
                    }
                }
            }
        }
    }

    public static void e0(TL_iv.RichText richText, StringBuilder sb2) {
        if (richText instanceof TL_iv.textPlain) {
            sb2.append(((TL_iv.textPlain) richText).text);
            return;
        }
        if (!(richText instanceof TL_iv.textConcat)) {
            if (richText != null) {
                e0(richText.text, sb2);
            }
        } else {
            TL_iv.textConcat textconcat = (TL_iv.textConcat) richText;
            for (int i10 = 0; i10 < textconcat.texts.size(); i10++) {
                e0(textconcat.texts.get(i10), sb2);
            }
        }
    }

    public static void f0(TL_iv.PageBlock pageBlock, SpannableStringBuilder spannableStringBuilder) {
        if ((pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6) || (pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockFooter)) {
            spannableStringBuilder.append((CharSequence) th.v5.r(pageBlock.text, pageBlock, true));
            return;
        }
        if ((pageBlock instanceof TL_iv.pageBlockMap) || (pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument) || (pageBlock instanceof TL_iv.pageBlockVideo) || (pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockSlideshow) || (pageBlock instanceof TL_iv.pageBlockCollage)) {
            TL_iv.PageCaption pageCaption = pageBlock.caption;
            if (pageCaption != null) {
                spannableStringBuilder.append((CharSequence) th.v5.r(pageCaption.text, null, true));
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            TL_iv.RichText richText = ((TL_iv.pageBlockTable) pageBlock).title;
            if (richText != null) {
                spannableStringBuilder.append((CharSequence) th.v5.r(richText, null, true));
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
                    spannableStringBuilder.append((CharSequence) th.v5.r(((TL_iv.TL_pageListItemText) pageListItem).text, null, true));
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
                    spannableStringBuilder.append((CharSequence) th.v5.r(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem).text, null, true));
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

    public static void o0(int i10, tc tcVar) {
        if (tcVar.W() == null) {
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(i10);
        boolean isPremium = UserConfig.getInstance(i10).isPremium();
        tcVar.M(LocaleController.getString(R.string.AIEditorStyleLimitTitle), AndroidUtilities.replaceSingleTag(!isPremium ? LocaleController.formatString(R.string.AIEditorStyleLimitTextPremium, Integer.valueOf(messagesController.config.aicomposeToneSavedLimitDefault.get()), Integer.valueOf(messagesController.config.aicomposeToneSavedLimitPremium.get())) : LocaleController.formatString(R.string.AIEditorStyleLimitText, Integer.valueOf(messagesController.config.aicomposeToneSavedLimitPremium.get())), new ig(tcVar, 1)), !isPremium ? R.raw.star_premium_2 : R.raw.error).j();
    }

    @Override // org.telegram.ui.Components.xa
    public final void B(float f9) {
        float f10 = 1.0f - f9;
        ImageView imageView = this.u0;
        imageView.setAlpha(f10);
        imageView.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f10));
        imageView.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f10));
    }

    public final void b0(j70 j70Var, LinearLayout linearLayout, boolean z10, String str, Runnable runnable) {
        int i10 = org.telegram.ui.ActionBar.g6.E8;
        int i11 = org.telegram.ui.ActionBar.g6.F8;
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(1, getContext(), this.resourcesProvider, false, false);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        g1Var.setText(str);
        g1Var.setChecked(z10);
        g1Var.c(org.telegram.ui.ActionBar.g6.v0(i10, this.resourcesProvider), org.telegram.ui.ActionBar.g6.v0(i11, this.resourcesProvider));
        g1Var.setSelectorColor(org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.v0(i10, this.resourcesProvider)));
        g1Var.setOnClickListener(new i(j70Var, z10, runnable, 0));
        linearLayout.addView(g1Var, i7.f6.n(-1, -2));
    }

    public final void c0() {
        if (this.M0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.M0, true);
            this.M0 = -1;
        }
        this.N0 = false;
        org.telegram.ui.ActionBar.h5 titleTextView = this.e.getTitleTextView();
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

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.loadedAiComposeTones);
        AiTonesController aiTonesController = this.q0;
        if (aiTonesController != null) {
            aiTonesController.open = false;
        }
        super.dismiss();
    }

    public final TL_iv.RichMessage g0() {
        if (this.N0) {
            return null;
        }
        int selectedTab = this.s0.getSelectedTab();
        if (selectedTab == 0) {
            if (this.V) {
                return null;
            }
            return this.X;
        }
        if (selectedTab == 2) {
            if (this.b0) {
                return null;
            }
            return this.d0;
        }
        if (this.Y) {
            return null;
        }
        TL_iv.RichMessage richMessage = this.a0;
        return richMessage == null ? this.U : richMessage;
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
        if (this.N0) {
            return null;
        }
        int selectedTab = this.s0.getSelectedTab();
        if (selectedTab == 0) {
            if (this.V) {
                return null;
            }
            return this.W;
        }
        if (selectedTab == 2) {
            if (this.b0) {
                return null;
            }
            return this.e0;
        }
        if (this.Y) {
            return null;
        }
        CharSequence charSequence = this.Z;
        return charSequence == null ? this.T : charSequence;
    }

    public final boolean i0() {
        return this.U != null;
    }

    public final w41 j0(int i10, TL_iv.RichMessage richMessage, boolean z10) {
        if (richMessage == null) {
            richMessage = this.U;
        }
        w41 of2 = RichMessageLayout.PreviewView.Factory.of(richMessage);
        of2.d = i10;
        of2.e = z10;
        return of2;
    }

    public final void k0() {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        String str;
        String str2;
        boolean i02 = i0();
        ua uaVar = this.e;
        f0 f0Var = this.t0;
        f0 f0Var2 = this.s0;
        if (!i02) {
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            CharSequence[] charSequenceArr = {this.T};
            tL_textWithEntities.entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
            CharSequence charSequence4 = charSequenceArr[0];
            tL_textWithEntities.text = charSequence4 == null ? "" : charSequence4.toString();
            int selectedTab = f0Var2.getSelectedTab();
            TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = new TLRPC.TL_messages_composeMessageWithAI();
            tL_messages_composeMessageWithAI.text = tL_textWithEntities;
            if (selectedTab == 0) {
                tL_messages_composeMessageWithAI.translate_to_lang = TranslateController.normalizeLanguage(this.o0);
                tL_messages_composeMessageWithAI.tone = TL_aicompose.InputAiComposeTone.fromDefault(null);
                tL_messages_composeMessageWithAI.emojify = this.p0;
            } else if (selectedTab == 1) {
                TL_aicompose.AiComposeTone selectedTone = f0Var.getSelectedTone();
                if (selectedTone instanceof c0) {
                    TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                    inputaicomposetonesingleuse.custom_prompt = TextUtils.isEmpty(this.E0) ? "" : this.E0;
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
                tL_messages_composeMessageWithAI.emojify = this.p0;
            } else if (selectedTab == 2) {
                tL_messages_composeMessageWithAI.proofread = true;
            }
            TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI2 = this.O0[selectedTab];
            if (tL_messages_composeMessageWithAI2 != null && tL_messages_composeMessageWithAI2.proofread == tL_messages_composeMessageWithAI.proofread && tL_messages_composeMessageWithAI2.emojify == tL_messages_composeMessageWithAI.emojify && TL_aicompose.InputAiComposeTone.equals(tL_messages_composeMessageWithAI2.tone, tL_messages_composeMessageWithAI.tone) && TextUtils.equals(tL_messages_composeMessageWithAI2.translate_to_lang, tL_messages_composeMessageWithAI.translate_to_lang)) {
                return;
            }
            if (tL_messages_composeMessageWithAI.emojify || tL_messages_composeMessageWithAI.proofread || tL_messages_composeMessageWithAI.tone != null || tL_messages_composeMessageWithAI.translate_to_lang != null) {
                this.N0 = true;
                this.F0 = false;
                p0(true);
                org.telegram.ui.ActionBar.h5 titleTextView = uaVar.getTitleTextView();
                titleTextView.i(this.J0);
                this.J0.start();
                int selectedTab2 = f0Var2.getSelectedTab();
                CharSequence charSequence5 = this.T;
                if (selectedTab2 == 0 && (charSequence3 = this.W) != null) {
                    charSequence5 = charSequence3;
                }
                if (selectedTab2 == 1 && (charSequence2 = this.Z) != null) {
                    charSequence5 = charSequence2;
                }
                CharSequence charSequence6 = (selectedTab2 != 2 || (charSequence = this.c0) == null) ? charSequence5 : charSequence;
                TextPaint textPaint = new TextPaint();
                textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(64.0f);
                int i10 = this.backgroundPaddingLeft;
                int b10 = i7.w.b(new StaticLayout(charSequence6, textPaint, (dp - i10) - i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount(), 1, 10);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                for (int i11 = 0; i11 < b10; i11++) {
                    if (i11 > 0) {
                        spannableStringBuilder.append((CharSequence) "\n");
                    }
                    int dp2 = AndroidUtilities.dp((int) (Math.random() * 50.0d));
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Loading));
                    d90 d90Var = new d90(null, dp2, 0, null);
                    d90Var.f = AndroidUtilities.dp(6.0f);
                    d90Var.h = 0.5f;
                    d90Var.n = true;
                    spannableStringBuilder.setSpan(d90Var, length, spannableStringBuilder.length(), 33);
                }
                if (selectedTab == 0) {
                    this.V = true;
                    this.W = spannableStringBuilder;
                } else if (selectedTab == 1) {
                    this.Y = true;
                    this.Z = spannableStringBuilder;
                } else if (selectedTab == 2) {
                    this.b0 = true;
                    this.c0 = spannableStringBuilder;
                }
                this.M0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_composeMessageWithAI, new org.telegram.messenger.a(), new jh.i0(this, titleTextView, selectedTab, tL_messages_composeMessageWithAI, 2));
                this.K0.N(true);
                return;
            }
            return;
        }
        int selectedTab3 = f0Var2.getSelectedTab();
        String str3 = "";
        TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
        tL_messages_composeRichMessageWithAI.flags |= 16;
        TL_iv.RichMessage richMessage = this.U;
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
            tL_messages_composeRichMessageWithAI.translate_to_lang = TranslateController.normalizeLanguage(this.o0);
            tL_messages_composeRichMessageWithAI.tone = TL_aicompose.InputAiComposeTone.fromDefault(str2);
            tL_messages_composeRichMessageWithAI.emojify = this.p0;
        } else if (selectedTab3 == 1) {
            TL_aicompose.AiComposeTone selectedTone2 = f0Var.getSelectedTone();
            if (selectedTone2 instanceof c0) {
                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse2 = new TL_aicompose.inputAiComposeToneSingleUse();
                inputaicomposetonesingleuse2.custom_prompt = TextUtils.isEmpty(this.E0) ? str : this.E0;
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
            tL_messages_composeRichMessageWithAI.emojify = this.p0;
        } else if (selectedTab3 == 2) {
            tL_messages_composeRichMessageWithAI.proofread = true;
        }
        TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI2 = this.P0[selectedTab3];
        if (tL_messages_composeRichMessageWithAI2 != null && tL_messages_composeRichMessageWithAI2.proofread == tL_messages_composeRichMessageWithAI.proofread && tL_messages_composeRichMessageWithAI2.emojify == tL_messages_composeRichMessageWithAI.emojify && TL_aicompose.InputAiComposeTone.equals(tL_messages_composeRichMessageWithAI2.tone, tL_messages_composeRichMessageWithAI.tone) && TextUtils.equals(tL_messages_composeRichMessageWithAI2.translate_to_lang, tL_messages_composeRichMessageWithAI.translate_to_lang)) {
            return;
        }
        if (tL_messages_composeRichMessageWithAI.emojify || tL_messages_composeRichMessageWithAI.proofread || tL_messages_composeRichMessageWithAI.tone != null || tL_messages_composeRichMessageWithAI.translate_to_lang != null) {
            this.N0 = true;
            this.F0 = false;
            p0(true);
            org.telegram.ui.ActionBar.h5 titleTextView2 = uaVar.getTitleTextView();
            titleTextView2.i(this.J0);
            this.J0.start();
            if (selectedTab3 == 0) {
                this.V = true;
            } else if (selectedTab3 == 1) {
                this.Y = true;
            } else if (selectedTab3 == 2) {
                this.b0 = true;
            }
            this.M0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_composeRichMessageWithAI, new org.telegram.messenger.a(), new jh.i0(this, titleTextView2, selectedTab3, tL_messages_composeRichMessageWithAI, 3));
            this.K0.N(true);
        }
    }

    public final void l0(int i10, int i11, boolean z10) {
        if (this.k0 != null) {
            TL_iv.RichMessage g02 = g0();
            if (g02 != null) {
                this.k0.run(g02, Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10));
                return;
            }
            return;
        }
        if (this.j0 == null || h0() == null) {
            return;
        }
        this.j0.run(h0(), Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.String] */
    public final void m0(Editable editable) {
        ?? spannableStringBuilder;
        int i10 = 0;
        if (com.google.android.recaptcha.internal.a.u(editable)) {
            spannableStringBuilder = new SpannableStringBuilder(editable.toString());
            Class[] clsArr = {i01.class, CodeHighlighting.Span.class, tv0.class, d51.class, c51.class, z41.class, a51.class, d10.class, y41.class, x41.class, y5.class};
            for (int i11 = 0; i11 < 11; i11++) {
                for (Object obj : editable.getSpans(0, editable.length(), clsArr[i11])) {
                    spannableStringBuilder.setSpan(obj, editable.getSpanStart(obj), editable.getSpanEnd(obj), 33);
                }
            }
        } else {
            spannableStringBuilder = editable.toString();
        }
        this.T = spannableStringBuilder;
        if (LanguageDetector.hasSupport()) {
            LanguageDetector.detectLanguage(editable.toString(), new a(this, i10), new m4.a(28));
        }
    }

    public final void n0(TL_iv.RichMessage richMessage) {
        this.U = richMessage;
        if (LanguageDetector.hasSupport()) {
            TL_iv.RichMessage richMessage2 = this.U;
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < richMessage2.blocks.size(); i10++) {
                if (i10 > 0) {
                    sb2.append("\n");
                }
                d0(richMessage2.blocks.get(i10), sb2);
            }
            LanguageDetector.detectLanguage(sb2.toString(), new a(this, 1), new m4.a(29));
        }
        s0();
    }

    @Override // org.telegram.ui.Components.xa, org.telegram.ui.ActionBar.f3
    public final void onContainerViewTranslation() {
        super.onContainerViewTranslation();
        ValueAnimator valueAnimator = this.keyboardContentAnimator;
        LinearLayout linearLayout = this.y0;
        if (valueAnimator != null) {
            linearLayout.setTranslationY(-((Float) valueAnimator.getAnimatedValue()).floatValue());
        } else {
            linearLayout.setTranslationY(0.0f);
        }
    }

    public final void p0(boolean z10) {
        boolean z11 = this.F0;
        nh.d dVar = this.A0;
        if (z11) {
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new b(this, 0));
        } else {
            f0 f0Var = this.s0;
            if ((f0Var != null ? f0Var.getSelectedTab() : 0) == 1 && (this.t0.getSelectedTone() instanceof c0) && !TextUtils.equals(this.w0.getText().toString(), this.E0)) {
                dVar.setText(LocaleController.getString(R.string.ArticleAIGenerate));
                dVar.setOnClickListener(new b(this, 1));
            } else if (this.g0 == null && this.f0 == null) {
                dVar.setText(LocaleController.getString(R.string.OK));
                dVar.setOnClickListener(new b(this, 3));
            } else {
                dVar.setText(LocaleController.getString(R.string.AIEditorApply));
                dVar.setOnClickListener(new b(this, 2));
            }
        }
        dVar.setLoading(this.N0);
        if (z10 && this.H0 == this.G0) {
            return;
        }
        boolean z12 = this.G0;
        this.H0 = z12;
        LinearLayout linearLayout = this.y0;
        nh.d dVar2 = this.z0;
        if (!z10) {
            dVar2.setVisibility(z12 ? 0 : 8);
            dVar2.setAlpha(this.G0 ? 1.0f : 0.0f);
            linearLayout.setVisibility(this.G0 ? 8 : 0);
            linearLayout.setAlpha(this.G0 ? 0.0f : 1.0f);
            return;
        }
        dVar2.setVisibility(0);
        linearLayout.setVisibility(0);
        ViewPropertyAnimator alpha = dVar2.animate().alpha(this.G0 ? 1.0f : 0.0f);
        jr jrVar = jr.h;
        alpha.setInterpolator(jrVar).setDuration(320L).withEndAction(new c(this, 0)).start();
        linearLayout.animate().alpha(this.G0 ? 0.0f : 1.0f).setInterpolator(jrVar).setDuration(320L).withEndAction(new c(this, 1)).start();
    }

    public final void q0() {
        String str = this.E0;
        org.telegram.ui.Cells.g3 g3Var = this.w0;
        boolean equals = TextUtils.equals(str, g3Var.b.getText().toString());
        boolean z10 = !equals;
        if (this.D0 == z10) {
            return;
        }
        ViewPropertyAnimator animate = g3Var.b.animate();
        this.D0 = z10;
        animate.alpha(!equals ? 1.0f : 0.5f).setDuration(320L).start();
        this.K0.N(true);
    }

    public final void r0() {
        jl0 jl0Var;
        View view;
        if (this.x0 == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            jl0Var = this.d;
            if (i10 >= jl0Var.getChildCount()) {
                view = null;
                break;
            }
            view = jl0Var.getChildAt(i10);
            w41 G = this.K0.G(RecyclerView.R(view) - 1);
            if (G != null && G.c == this.t0) {
                break;
            } else {
                i10++;
            }
        }
        if (view == null) {
            this.x0.setVisibility(4);
            this.x0.e(true);
        } else {
            this.x0.setVisibility(0);
            this.x0.setTranslationY(view.getY() + jl0Var.getY() + view.getHeight());
        }
    }

    public final void s0() {
        f0 f0Var = this.t0;
        TL_aicompose.AiComposeTone selectedTone = f0Var.getSelectedTone();
        f0Var.c.removeAllViews();
        if (i0()) {
            f0Var.b(new c0(), new e(this, 0));
        }
        f0Var.b(null, new e(this, 0));
        ArrayList<TL_aicompose.AiComposeTone> arrayList = this.q0.tones;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TL_aicompose.AiComposeTone aiComposeTone = arrayList.get(i10);
            i10++;
            f0Var.b(aiComposeTone, new e(this, 0));
        }
        if (selectedTone != f0Var.getSelectedTone()) {
            f0Var.d(null);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        super.show();
        ua uaVar = this.e;
        if (uaVar != null) {
            uaVar.setTitle(y());
        }
        int i10 = (this.i0 || (this.k0 == null && this.j0 == null)) ? 8 : 0;
        nh.d dVar = this.B0;
        dVar.setVisibility(i10);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Send));
        iq iqVar = new iq(this.i0 ? R.drawable.filled_profile_edit_24 : R.drawable.send_plane_24, 0);
        iqVar.setTranslateY(AndroidUtilities.dp(1.0f));
        spannableStringBuilder.setSpan(iqVar, 0, spannableStringBuilder.length(), 33);
        dVar.setText(spannableStringBuilder);
        this.K0.N(false);
        k0();
        p0(true);
    }

    @Override // org.telegram.ui.Components.xa
    public final il0 v(jl0 jl0Var) {
        k51 k51Var = new k51(jl0Var, getContext(), this.currentAccount, 0, true, new d(this, 0), this.resourcesProvider);
        this.K0 = k51Var;
        k51Var.r = false;
        return k51Var;
    }

    @Override // org.telegram.ui.Components.xa
    public final CharSequence y() {
        if (this.I0 == null) {
            this.I0 = LocaleController.getString(R.string.AIEditor);
            xi0 xi0Var = new xi0(R.raw.emoji_stars, AndroidUtilities.dp(24.0f), "emoji_stars", AndroidUtilities.dp(24.0f));
            this.J0 = xi0Var;
            xi0Var.H(true);
            this.J0.I(1);
        }
        return this.I0;
    }
}
