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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class g41 extends za {
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
    public w51 j0;
    public boolean k0;
    public int l0;

    public g41(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, false, false, 2, e6Var);
        this.g0 = 1;
        this.h0 = new String[]{"formal", "neutral", "casual"};
        this.i0 = new String[]{"Formal", "Neutral", "Casual"};
        this.k0 = true;
        this.l0 = -1;
        ImageView imageView = new ImageView(context);
        this.X = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        imageView.setColorFilter(getThemedColor(i10));
        imageView.setBackground(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.l1(0.1f, getThemedColor(i10)), 1, -1));
        this.e.addView(imageView, w7.x5.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        w7.z5.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new x31(this, 2));
        String A = v31.A();
        this.f0 = A;
        if (A == null) {
            this.f0 = TranslateController.currentLanguage();
        }
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        int i11 = org.telegram.ui.ActionBar.i6.a7;
        setBackgroundColor(getThemedColor(i11));
        FrameLayout frameLayout = new FrameLayout(context);
        this.Y = frameLayout;
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.i6.l1(0.0f, getThemedColor(i11)), getThemedColor(i11), getThemedColor(i11)}));
        ci.d dVar = new ci.d(context, e6Var, true);
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
        ll0 ll0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        ll0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.p1();
        this.d.setOnItemClickListener(new ai.o6(14, this, e6Var));
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(qr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        this.j0.N(false);
    }

    public static void P(final g41 g41Var, View view) {
        n70 F = n70.F(g41Var.container, g41Var.resourcesProvider, view);
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
        while (i11 < g41Var.h0.length) {
            g41Var.T(F, linearLayout, g41Var.g0 == i11, g41Var.i0[i11], new id(g41Var, i11, 11));
            i11++;
        }
        View k1Var = new org.telegram.ui.ActionBar.k1(g41Var.getContext(), g41Var.resourcesProvider);
        k1Var.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(k1Var, w7.x5.n(-1, 8));
        ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(null);
        ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
        if (!TextUtils.isEmpty(g41Var.f0)) {
            g41Var.T(F, linearLayout, true, v31.y(v31.E(g41Var.f0, null, null)), null);
        }
        int size = suggestedLanguages.size();
        int i12 = 0;
        while (i12 < size) {
            int i13 = i12 + 1;
            final TranslateController.Language language = suggestedLanguages.get(i12);
            if (!TextUtils.equals(language.code, g41Var.f0)) {
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
                                g41Var2.f0 = str;
                                v31.I(str);
                                g41Var2.V();
                                break;
                            default:
                                g41 g41Var3 = this.b;
                                g41Var3.U();
                                String str2 = language.code;
                                g41Var3.f0 = str2;
                                v31.I(str2);
                                g41Var3.V();
                                break;
                        }
                    }
                });
            }
            i12 = i13;
        }
        View k1Var2 = new org.telegram.ui.ActionBar.k1(g41Var.getContext(), g41Var.resourcesProvider);
        k1Var2.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(k1Var2, w7.x5.n(-1, 8));
        int size2 = languages.size();
        while (i10 < size2) {
            TranslateController.Language language2 = languages.get(i10);
            i10++;
            final TranslateController.Language language3 = language2;
            final int i15 = 1;
            g41Var.T(F, linearLayout, TextUtils.equals(language3.code, g41Var.f0), language3.displayName, new Runnable(g41Var) { // from class: org.telegram.ui.Components.w31
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
                            g41Var2.f0 = str;
                            v31.I(str);
                            g41Var2.V();
                            break;
                        default:
                            g41 g41Var3 = this.b;
                            g41Var3.U();
                            String str2 = language3.code;
                            g41Var3.f0 = str2;
                            v31.I(str2);
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
        g41Var.l0 = -1;
        ci.d dVar = g41Var.Z;
        dVar.setLoading(false);
        if (tL_error != null) {
            org.telegram.ui.Cells.q3.r(g41Var.topBulletinContainer, g41Var.resourcesProvider, tL_error, false);
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new x31(g41Var, 0));
        } else if (tL_messages_translateResult == null || tL_messages_translateResult.result.isEmpty()) {
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new x31(g41Var, 1));
        } else {
            g41Var.c0 = MessageObject.formatTextWithEntities(tL_messages_translateResult.result.get(0));
            g41Var.b0 = false;
            g41Var.j0.N(true);
        }
    }

    public static /* synthetic */ void S(g41 g41Var, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        i51 G = g41Var.j0.G(i10 - 1);
        if (G == null) {
            return;
        }
        int i11 = G.d;
        if (i11 == 1) {
            CharSequence charSequence = g41Var.c0;
            if (charSequence == null || g41Var.b0) {
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
                new rg.x0(g41Var.getContext(), 13, e6Var).show();
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
        int i10 = org.telegram.ui.ActionBar.i6.E8;
        int i11 = org.telegram.ui.ActionBar.i6.F8;
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(1, getContext(), this.resourcesProvider, false, false);
        f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        f1Var.setText(str);
        f1Var.setChecked(z10);
        f1Var.c(org.telegram.ui.ActionBar.i6.v0(i10, this.resourcesProvider), org.telegram.ui.ActionBar.i6.v0(i11, this.resourcesProvider));
        f1Var.setSelectorColor(org.telegram.ui.ActionBar.i6.l1(0.12f, org.telegram.ui.ActionBar.i6.v0(i10, this.resourcesProvider)));
        f1Var.setOnClickListener(new h(n70Var, z10, runnable, 1));
        linearLayout.addView(f1Var, w7.x5.n(-1, -2));
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
        this.l0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_translateText, new org.telegram.messenger.a(), new y31(this, i10));
        this.j0.N(true);
    }

    @Override // org.telegram.ui.Components.za, org.telegram.ui.ActionBar.f3
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

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
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
            dVar.setOnClickListener(new x31(this, 3));
        }
    }

    @Override // org.telegram.ui.Components.za
    public final kl0 v(ll0 ll0Var) {
        w51 w51Var = new w51(ll0Var, getContext(), this.currentAccount, 0, true, new y31(this, 0), this.resourcesProvider);
        this.j0 = w51Var;
        w51Var.r = false;
        return w51Var;
    }

    @Override // org.telegram.ui.Components.za
    public final CharSequence y() {
        return "Translate";
    }
}
