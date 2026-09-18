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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class h41 extends za {
    public final ImageView X;
    public final FrameLayout Y;
    public final ci.d Z;
    public CharSequence a0;
    public boolean b0;
    public CharSequence c0;
    public ut d0;
    public String e0;
    public String f0;
    public int g0;
    public final String[] h0;
    public final String[] i0;
    public x51 j0;
    public boolean k0;
    public int l0;

    public h41(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, false, false, 2, f6Var);
        this.g0 = 1;
        this.h0 = new String[]{"formal", "neutral", "casual"};
        this.i0 = new String[]{"Formal", "Neutral", "Casual"};
        this.k0 = true;
        this.l0 = -1;
        ImageView imageView = new ImageView(context);
        this.X = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        imageView.setColorFilter(getThemedColor(i10));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.l1(0.1f, getThemedColor(i10)), 1, -1));
        this.e.addView(imageView, w7.x5.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        w7.z5.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new y31(this, 2));
        String A = w31.A();
        this.f0 = A;
        if (A == null) {
            this.f0 = TranslateController.currentLanguage();
        }
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        int i11 = org.telegram.ui.ActionBar.j6.a7;
        setBackgroundColor(getThemedColor(i11));
        FrameLayout frameLayout = new FrameLayout(context);
        this.Y = frameLayout;
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.j6.l1(0.0f, getThemedColor(i11)), getThemedColor(i11), getThemedColor(i11)}));
        ci.d dVar = new ci.d(context, f6Var, true);
        dVar.setRoundRadius(24);
        this.Z = dVar;
        dVar.setText(LocaleController.getString(R.string.OK));
        FrameLayout.LayoutParams d = w7.x5.d(-1, 48.0f, 119, 12.0f, 6.0f, 12.0f, 12.0f);
        int i12 = d.leftMargin;
        int i13 = this.backgroundPaddingLeft;
        d.leftMargin = i12 + i13;
        d.rightMargin += i13;
        frameLayout.addView(dVar, d);
        this.containerView.addView(frameLayout, w7.x5.e(-1, -2, 80));
        ml0 ml0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        ml0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.q1();
        this.d.setOnItemClickListener(new ai.o6(14, this, f6Var));
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(qr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        this.j0.N(false);
    }

    public static void P(final h41 h41Var, View view) {
        n70 F = n70.F(h41Var.container, h41Var.resourcesProvider, view);
        F.X = AndroidUtilities.dp(450.0f);
        int i10 = 0;
        F.t = false;
        F.Y = true;
        ScrollView scrollView = new ScrollView(h41Var.getContext());
        LinearLayout linearLayout = new LinearLayout(h41Var.getContext());
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        F.q(scrollView);
        int i11 = 0;
        while (i11 < h41Var.h0.length) {
            h41Var.T(F, linearLayout, h41Var.g0 == i11, h41Var.i0[i11], new id(h41Var, i11, 11));
            i11++;
        }
        View l1Var = new org.telegram.ui.ActionBar.l1(h41Var.getContext(), h41Var.resourcesProvider);
        l1Var.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(l1Var, w7.x5.n(-1, 8));
        ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(null);
        ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
        if (!TextUtils.isEmpty(h41Var.f0)) {
            h41Var.T(F, linearLayout, true, w31.y(w31.E(h41Var.f0, null, null)), null);
        }
        int size = suggestedLanguages.size();
        int i12 = 0;
        while (i12 < size) {
            int i13 = i12 + 1;
            final TranslateController.Language language = suggestedLanguages.get(i12);
            if (!TextUtils.equals(language.code, h41Var.f0)) {
                final int i14 = 0;
                h41Var.T(F, linearLayout, false, language.displayName, new Runnable(h41Var) { // from class: org.telegram.ui.Components.x31
                    public final /* synthetic */ h41 b;

                    {
                        this.b = h41Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                h41 h41Var2 = this.b;
                                h41Var2.U();
                                String str = language.code;
                                h41Var2.f0 = str;
                                w31.I(str);
                                h41Var2.V();
                                break;
                            default:
                                h41 h41Var3 = this.b;
                                h41Var3.U();
                                String str2 = language.code;
                                h41Var3.f0 = str2;
                                w31.I(str2);
                                h41Var3.V();
                                break;
                        }
                    }
                });
            }
            i12 = i13;
        }
        View l1Var2 = new org.telegram.ui.ActionBar.l1(h41Var.getContext(), h41Var.resourcesProvider);
        l1Var2.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(l1Var2, w7.x5.n(-1, 8));
        int size2 = languages.size();
        while (i10 < size2) {
            TranslateController.Language language2 = languages.get(i10);
            i10++;
            final TranslateController.Language language3 = language2;
            final int i15 = 1;
            h41Var.T(F, linearLayout, TextUtils.equals(language3.code, h41Var.f0), language3.displayName, new Runnable(h41Var) { // from class: org.telegram.ui.Components.x31
                public final /* synthetic */ h41 b;

                {
                    this.b = h41Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i15) {
                        case 0:
                            h41 h41Var2 = this.b;
                            h41Var2.U();
                            String str = language3.code;
                            h41Var2.f0 = str;
                            w31.I(str);
                            h41Var2.V();
                            break;
                        default:
                            h41 h41Var3 = this.b;
                            h41Var3.U();
                            String str2 = language3.code;
                            h41Var3.f0 = str2;
                            w31.I(str2);
                            h41Var3.V();
                            break;
                    }
                }
            });
        }
        F.Z();
    }

    public static void Q(h41 h41Var, ClickableSpan clickableSpan) {
        if (clickableSpan == null) {
            return;
        }
        clickableSpan.onClick(h41Var.containerView);
    }

    public static void R(h41 h41Var, TLRPC.TL_messages_translateResult tL_messages_translateResult, TLRPC.TL_error tL_error) {
        h41Var.l0 = -1;
        ci.d dVar = h41Var.Z;
        dVar.setLoading(false);
        if (tL_error != null) {
            org.telegram.ui.Cells.p6.q(h41Var.topBulletinContainer, h41Var.resourcesProvider, tL_error, false);
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new y31(h41Var, 0));
        } else if (tL_messages_translateResult == null || tL_messages_translateResult.result.isEmpty()) {
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new y31(h41Var, 1));
        } else {
            h41Var.c0 = MessageObject.formatTextWithEntities(tL_messages_translateResult.result.get(0));
            h41Var.b0 = false;
            h41Var.j0.N(true);
        }
    }

    public static /* synthetic */ void S(h41 h41Var, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        j51 G = h41Var.j0.G(i10 - 1);
        if (G == null) {
            return;
        }
        int i11 = G.d;
        if (i11 == 1) {
            CharSequence charSequence = h41Var.c0;
            if (charSequence == null || h41Var.b0) {
                return;
            }
            AndroidUtilities.addToClipboard(charSequence);
            return;
        }
        if (i11 == 2) {
            if (UserConfig.getInstance(h41Var.currentAccount).isPremium()) {
                MessagesController.getInstance(h41Var.currentAccount).getTranslateController().toggleTranslatingDialog(0L);
                h41Var.dismiss();
            } else {
                if (LaunchActivity.U() == null) {
                    return;
                }
                new rg.x0(h41Var.getContext(), 13, f6Var).show();
            }
        }
    }

    @Override // org.telegram.ui.Components.za
    public final void A(float f7) {
        float f10 = 1.0f - f7;
        ImageView imageView = this.X;
        imageView.setAlpha(f10);
        imageView.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f10));
        imageView.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f10));
    }

    public final void T(n70 n70Var, LinearLayout linearLayout, boolean z10, String str, Runnable runnable) {
        int i10 = org.telegram.ui.ActionBar.j6.E8;
        int i11 = org.telegram.ui.ActionBar.j6.F8;
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(1, getContext(), this.resourcesProvider, false, false);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        g1Var.setText(str);
        g1Var.setChecked(z10);
        g1Var.c(org.telegram.ui.ActionBar.j6.v0(i10, this.resourcesProvider), org.telegram.ui.ActionBar.j6.v0(i11, this.resourcesProvider));
        g1Var.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i10, this.resourcesProvider)));
        g1Var.setOnClickListener(new h(n70Var, z10, runnable, 1));
        linearLayout.addView(g1Var, w7.x5.n(-1, -2));
    }

    public final void U() {
        if (this.l0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.l0, true);
            this.l0 = -1;
        }
    }

    public final void V() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        int i10 = 1;
        CharSequence[] charSequenceArr = {this.a0};
        tL_textWithEntities.entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
        CharSequence charSequence = charSequenceArr[0];
        tL_textWithEntities.text = charSequence == null ? "" : charSequence.toString();
        if (this.d0 != null) {
            this.Z.setLoading(true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Loading));
        spannableStringBuilder.setSpan(new h90(null, AndroidUtilities.dp(120.0f), 0, null), 0, spannableStringBuilder.length(), 33);
        this.c0 = spannableStringBuilder;
        this.b0 = true;
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        tL_messages_translateText.to_lang = this.f0;
        tL_messages_translateText.flags |= 2;
        tL_messages_translateText.text.add(tL_textWithEntities);
        int i11 = this.g0;
        if (i11 != 1) {
            tL_messages_translateText.flags |= 4;
            tL_messages_translateText.tone = this.h0[i11];
        }
        this.l0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_translateText, new org.telegram.messenger.a(), new z31(this, i10));
        this.j0.N(true);
    }

    @Override // org.telegram.ui.Components.za, org.telegram.ui.ActionBar.g3
    public final void onContainerViewTranslation() {
        super.onContainerViewTranslation();
        ValueAnimator valueAnimator = this.keyboardContentAnimator;
        FrameLayout frameLayout = this.Y;
        if (valueAnimator != null) {
            frameLayout.setTranslationY(-((Float) valueAnimator.getAnimatedValue()).floatValue());
        } else {
            frameLayout.setTranslationY(0.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
    public final void show() {
        super.show();
        va vaVar = this.e;
        if (vaVar != null) {
            vaVar.setTitle("Translate");
        }
        this.j0.N(false);
        V();
        if (this.d0 != null) {
            ci.d dVar = this.Z;
            dVar.setText("Use This Translation");
            dVar.setOnClickListener(new y31(this, 3));
        }
    }

    @Override // org.telegram.ui.Components.za
    public final ll0 v(ml0 ml0Var) {
        x51 x51Var = new x51(ml0Var, getContext(), this.currentAccount, 0, true, new z31(this, 0), this.resourcesProvider);
        this.j0 = x51Var;
        x51Var.r = false;
        return x51Var;
    }

    @Override // org.telegram.ui.Components.za
    public final CharSequence y() {
        return "Translate";
    }
}
