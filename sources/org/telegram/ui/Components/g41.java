package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class g41 extends sa {
    public final ImageView U;
    public final FrameLayout V;
    public final ph.d W;
    public CharSequence X;
    public boolean Y;
    public CharSequence Z;
    public pt a0;
    public String b0;
    public String c0;
    public int d0;
    public final String[] e0;
    public final String[] f0;
    public w51 g0;
    public boolean h0;
    public int i0;

    public g41(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, false, false, false, false, false, 2, f6Var);
        this.d0 = 1;
        this.e0 = new String[]{"formal", "neutral", "casual"};
        this.f0 = new String[]{"Formal", "Neutral", "Casual"};
        this.h0 = true;
        this.i0 = -1;
        ImageView imageView = new ImageView(context);
        this.U = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        imageView.setColorFilter(getThemedColor(i10));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.l1(0.1f, getThemedColor(i10)), 1, -1));
        this.e.addView(imageView, k7.b6.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        k7.d6.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new x31(this, 2));
        String B = v31.B();
        this.c0 = B;
        if (B == null) {
            this.c0 = TranslateController.currentLanguage();
        }
        this.I = false;
        this.H = AndroidUtilities.dp(12.0f);
        int i11 = org.telegram.ui.ActionBar.j6.a7;
        setBackgroundColor(getThemedColor(i11));
        FrameLayout frameLayout = new FrameLayout(context);
        this.V = frameLayout;
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.j6.l1(0.0f, getThemedColor(i11)), getThemedColor(i11), getThemedColor(i11)}));
        ph.d dVar = new ph.d(context, f6Var, true);
        dVar.setRoundRadius(24);
        this.W = dVar;
        dVar.setText(LocaleController.getString(R.string.OK));
        FrameLayout.LayoutParams d = k7.b6.d(-1, 48.0f, 119, 12.0f, 6.0f, 12.0f, 12.0f);
        int i12 = d.leftMargin;
        int i13 = this.backgroundPaddingLeft;
        d.leftMargin = i12 + i13;
        d.rightMargin += i13;
        frameLayout.addView(dVar, d);
        this.containerView.addView(frameLayout, k7.b6.e(-1, -2, 80));
        rl0 rl0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        rl0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.o1();
        this.d.setOnItemClickListener(new gg.v0(15, this, f6Var));
        f2.l lVar = new f2.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(mr.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        this.g0.N(false);
    }

    public static void P(final g41 g41Var, View view) {
        p70 F = p70.F(g41Var.container, g41Var.resourcesProvider, view);
        F.X = AndroidUtilities.dp(450.0f);
        int i10 = 0;
        F.t = false;
        F.Y = true;
        ScrollView scrollView = new ScrollView(g41Var.getContext());
        LinearLayout linearLayout = new LinearLayout(g41Var.getContext());
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        F.q(scrollView);
        int i11 = 0;
        while (i11 < g41Var.e0.length) {
            g41Var.T(F, linearLayout, g41Var.d0 == i11, g41Var.f0[i11], new dw(g41Var, i11, 8));
            i11++;
        }
        View m1Var = new org.telegram.ui.ActionBar.m1(g41Var.getContext(), g41Var.resourcesProvider);
        m1Var.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(m1Var, k7.b6.n(-1, 8));
        ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(null);
        ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
        if (!TextUtils.isEmpty(g41Var.c0)) {
            g41Var.T(F, linearLayout, true, v31.y(v31.D(g41Var.c0, null, null)), null);
        }
        int size = suggestedLanguages.size();
        int i12 = 0;
        while (i12 < size) {
            int i13 = i12 + 1;
            final TranslateController.Language language = suggestedLanguages.get(i12);
            if (!TextUtils.equals(language.code, g41Var.c0)) {
                final int i14 = 0;
                g41Var.T(F, linearLayout, false, language.displayName, new Runnable(g41Var) { // from class: org.telegram.ui.Components.w31
                    public final /* synthetic */ g41 b;

                    {
                        this.b = g41Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                g41 g41Var2 = this.b;
                                g41Var2.U();
                                String str = language.code;
                                g41Var2.c0 = str;
                                v31.H(str);
                                g41Var2.V();
                                break;
                            default:
                                g41 g41Var3 = this.b;
                                g41Var3.U();
                                String str2 = language.code;
                                g41Var3.c0 = str2;
                                v31.H(str2);
                                g41Var3.V();
                                break;
                        }
                    }
                });
            }
            i12 = i13;
        }
        View m1Var2 = new org.telegram.ui.ActionBar.m1(g41Var.getContext(), g41Var.resourcesProvider);
        m1Var2.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(m1Var2, k7.b6.n(-1, 8));
        int size2 = languages.size();
        while (i10 < size2) {
            TranslateController.Language language2 = languages.get(i10);
            i10++;
            final TranslateController.Language language3 = language2;
            final int i15 = 1;
            g41Var.T(F, linearLayout, TextUtils.equals(language3.code, g41Var.c0), language3.displayName, new Runnable(g41Var) { // from class: org.telegram.ui.Components.w31
                public final /* synthetic */ g41 b;

                {
                    this.b = g41Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i15) {
                        case 0:
                            g41 g41Var2 = this.b;
                            g41Var2.U();
                            String str = language3.code;
                            g41Var2.c0 = str;
                            v31.H(str);
                            g41Var2.V();
                            break;
                        default:
                            g41 g41Var3 = this.b;
                            g41Var3.U();
                            String str2 = language3.code;
                            g41Var3.c0 = str2;
                            v31.H(str2);
                            g41Var3.V();
                            break;
                    }
                }
            });
        }
        F.Z();
    }

    public static void Q(g41 g41Var, ClickableSpan clickableSpan) {
        if (clickableSpan == null) {
            return;
        }
        clickableSpan.onClick(g41Var.containerView);
    }

    public static void R(g41 g41Var, TLRPC.TL_messages_translateResult tL_messages_translateResult, TLRPC.TL_error tL_error) {
        g41Var.i0 = -1;
        ph.d dVar = g41Var.W;
        dVar.setLoading(false);
        if (tL_error != null) {
            org.telegram.ui.ai.u(g41Var.topBulletinContainer, g41Var.resourcesProvider, tL_error, false);
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new x31(g41Var, 0));
        } else if (tL_messages_translateResult == null || tL_messages_translateResult.result.isEmpty()) {
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new x31(g41Var, 1));
        } else {
            g41Var.Z = MessageObject.formatTextWithEntities(tL_messages_translateResult.result.get(0));
            g41Var.Y = false;
            g41Var.g0.N(true);
        }
    }

    public static /* synthetic */ void S(g41 g41Var, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        i51 G = g41Var.g0.G(i10 - 1);
        if (G == null) {
            return;
        }
        int i11 = G.d;
        if (i11 == 1) {
            CharSequence charSequence = g41Var.Z;
            if (charSequence == null || g41Var.Y) {
                return;
            }
            AndroidUtilities.addToClipboard(charSequence);
            return;
        }
        if (i11 == 2) {
            if (UserConfig.getInstance(g41Var.currentAccount).isPremium()) {
                MessagesController.getInstance(g41Var.currentAccount).getTranslateController().toggleTranslatingDialog(0L);
                g41Var.dismiss();
            } else {
                if (LaunchActivity.U() == null) {
                    return;
                }
                new eg.o1(g41Var.getContext(), 13, f6Var).show();
            }
        }
    }

    @Override // org.telegram.ui.Components.sa
    public final void B(float f10) {
        float f11 = 1.0f - f10;
        ImageView imageView = this.U;
        imageView.setAlpha(f11);
        imageView.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f11));
        imageView.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f11));
    }

    public final void T(p70 p70Var, LinearLayout linearLayout, boolean z4, String str, Runnable runnable) {
        int i10 = org.telegram.ui.ActionBar.j6.E8;
        int i11 = org.telegram.ui.ActionBar.j6.F8;
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(1, getContext(), this.resourcesProvider, false, false);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        g1Var.setText(str);
        g1Var.setChecked(z4);
        g1Var.c(org.telegram.ui.ActionBar.j6.v0(i10, this.resourcesProvider), org.telegram.ui.ActionBar.j6.v0(i11, this.resourcesProvider));
        g1Var.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i10, this.resourcesProvider)));
        g1Var.setOnClickListener(new h(p70Var, z4, runnable, 1));
        linearLayout.addView(g1Var, k7.b6.n(-1, -2));
    }

    public final void U() {
        if (this.i0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.i0, true);
            this.i0 = -1;
        }
    }

    public final void V() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        int i10 = 1;
        CharSequence[] charSequenceArr = {this.X};
        tL_textWithEntities.entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
        CharSequence charSequence = charSequenceArr[0];
        tL_textWithEntities.text = charSequence == null ? "" : charSequence.toString();
        if (this.a0 != null) {
            this.W.setLoading(true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Loading));
        spannableStringBuilder.setSpan(new k90(null, AndroidUtilities.dp(120.0f), 0, null), 0, spannableStringBuilder.length(), 33);
        this.Z = spannableStringBuilder;
        this.Y = true;
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        tL_messages_translateText.to_lang = this.c0;
        tL_messages_translateText.flags |= 2;
        tL_messages_translateText.text.add(tL_textWithEntities);
        int i11 = this.d0;
        if (i11 != 1) {
            tL_messages_translateText.flags |= 4;
            tL_messages_translateText.tone = this.e0[i11];
        }
        this.i0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_translateText, new org.telegram.messenger.a(), new y31(this, i10));
        this.g0.N(true);
    }

    @Override // org.telegram.ui.Components.sa, org.telegram.ui.ActionBar.g3
    public final void onContainerViewTranslation() {
        super.onContainerViewTranslation();
        ValueAnimator valueAnimator = this.keyboardContentAnimator;
        FrameLayout frameLayout = this.V;
        if (valueAnimator != null) {
            frameLayout.setTranslationY(-((Float) valueAnimator.getAnimatedValue()).floatValue());
        } else {
            frameLayout.setTranslationY(0.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
    public final void show() {
        super.show();
        pa paVar = this.e;
        if (paVar != null) {
            paVar.setTitle("Translate");
        }
        this.g0.N(false);
        V();
        if (this.a0 != null) {
            ph.d dVar = this.W;
            dVar.setText("Use This Translation");
            dVar.setOnClickListener(new x31(this, 3));
        }
    }

    @Override // org.telegram.ui.Components.sa
    public final ql0 v(rl0 rl0Var) {
        w51 w51Var = new w51(rl0Var, getContext(), this.currentAccount, 0, true, new y31(this, 0), this.resourcesProvider);
        this.g0 = w51Var;
        w51Var.r = false;
        return w51Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return "Translate";
    }
}
