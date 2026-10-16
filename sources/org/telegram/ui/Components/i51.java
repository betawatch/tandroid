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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class i51 extends db {
    public final ImageView X;
    public final FrameLayout Y;
    public final di.d Z;
    public CharSequence a0;
    public boolean b0;
    public CharSequence c0;
    public hu d0;
    public String e0;
    public String f0;
    public int g0;
    public final String[] h0;
    public final String[] i0;
    public a71 j0;
    public boolean k0;
    public int l0;

    public i51(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null, false, false, 2, c6Var);
        this.g0 = 1;
        this.h0 = new String[]{"formal", "neutral", "casual"};
        this.i0 = new String[]{"Formal", "Neutral", "Casual"};
        this.k0 = true;
        this.l0 = -1;
        ImageView imageView = new ImageView(context);
        this.X = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        imageView.setColorFilter(getThemedColor(i10));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.m1(0.1f, getThemedColor(i10)), 1, -1));
        this.e.addView(imageView, w7.z5.a(54.0f, 0.0f, 0.0f, 8.0f, 0.0f, 54, 85));
        w7.b6.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new z41(this, 2));
        String D = x41.D();
        this.f0 = D;
        if (D == null) {
            this.f0 = TranslateController.currentLanguage();
        }
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        int i11 = org.telegram.ui.ActionBar.g6.a7;
        setBackgroundColor(getThemedColor(i11));
        FrameLayout frameLayout = new FrameLayout(context);
        this.Y = frameLayout;
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.g6.m1(0.0f, getThemedColor(i11)), getThemedColor(i11), getThemedColor(i11)}));
        di.d dVar = new di.d(context, c6Var, true);
        dVar.setRoundRadius(24);
        this.Z = dVar;
        dVar.setText(LocaleController.getString(R.string.OK));
        FrameLayout.LayoutParams a2 = w7.z5.a(48.0f, 12.0f, 6.0f, 12.0f, 12.0f, -1, 119);
        int i12 = a2.leftMargin;
        int i13 = this.backgroundPaddingLeft;
        a2.leftMargin = i12 + i13;
        a2.rightMargin += i13;
        frameLayout.addView(dVar, a2);
        this.containerView.addView(frameLayout, w7.z5.e(-1, -2, 80));
        mm0 mm0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.p1();
        this.d.setOnItemClickListener(new bi.z5(14, this, c6Var));
        s4.k kVar = new s4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(es.h);
        kVar.n(350L);
        this.d.setItemAnimator(kVar);
        this.j0.N(false);
    }

    public static void Q(final i51 i51Var, View view) {
        l80 F = l80.F(i51Var.container, i51Var.resourcesProvider, view);
        F.X = AndroidUtilities.dp(450.0f);
        int i10 = 0;
        F.t = false;
        F.Y = true;
        ScrollView scrollView = new ScrollView(i51Var.getContext());
        LinearLayout linearLayout = new LinearLayout(i51Var.getContext());
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        F.q(scrollView);
        int i11 = 0;
        while (i11 < i51Var.h0.length) {
            i51Var.U(F, linearLayout, i51Var.g0 == i11, i51Var.i0[i11], new o8(i51Var, i11, 12));
            i11++;
        }
        View j1Var = new org.telegram.ui.ActionBar.j1(i51Var.getContext(), i51Var.resourcesProvider);
        j1Var.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(j1Var, w7.z5.n(-1, 8));
        ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(null);
        ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
        if (!TextUtils.isEmpty(i51Var.f0)) {
            i51Var.U(F, linearLayout, true, x41.B(x41.F(i51Var.f0, null, null)), null);
        }
        int size = suggestedLanguages.size();
        int i12 = 0;
        while (i12 < size) {
            int i13 = i12 + 1;
            final TranslateController.Language language = suggestedLanguages.get(i12);
            if (!TextUtils.equals(language.code, i51Var.f0)) {
                final int i14 = 0;
                i51Var.U(F, linearLayout, false, language.displayName, new Runnable(i51Var) { // from class: org.telegram.ui.Components.y41
                    public final /* synthetic */ i51 b;

                    {
                        this.b = i51Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                i51 i51Var2 = this.b;
                                i51Var2.V();
                                String str = language.code;
                                i51Var2.f0 = str;
                                x41.J(str);
                                i51Var2.W();
                                break;
                            default:
                                i51 i51Var3 = this.b;
                                i51Var3.V();
                                String str2 = language.code;
                                i51Var3.f0 = str2;
                                x41.J(str2);
                                i51Var3.W();
                                break;
                        }
                    }
                });
            }
            i12 = i13;
        }
        View j1Var2 = new org.telegram.ui.ActionBar.j1(i51Var.getContext(), i51Var.resourcesProvider);
        j1Var2.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(j1Var2, w7.z5.n(-1, 8));
        int size2 = languages.size();
        while (i10 < size2) {
            TranslateController.Language language2 = languages.get(i10);
            i10++;
            final TranslateController.Language language3 = language2;
            final int i15 = 1;
            i51Var.U(F, linearLayout, TextUtils.equals(language3.code, i51Var.f0), language3.displayName, new Runnable(i51Var) { // from class: org.telegram.ui.Components.y41
                public final /* synthetic */ i51 b;

                {
                    this.b = i51Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i15) {
                        case 0:
                            i51 i51Var2 = this.b;
                            i51Var2.V();
                            String str = language3.code;
                            i51Var2.f0 = str;
                            x41.J(str);
                            i51Var2.W();
                            break;
                        default:
                            i51 i51Var3 = this.b;
                            i51Var3.V();
                            String str2 = language3.code;
                            i51Var3.f0 = str2;
                            x41.J(str2);
                            i51Var3.W();
                            break;
                    }
                }
            });
        }
        F.Z();
    }

    public static void R(i51 i51Var, ClickableSpan clickableSpan) {
        if (clickableSpan == null) {
            return;
        }
        clickableSpan.onClick(i51Var.containerView);
    }

    public static void S(i51 i51Var, TLRPC.TL_messages_translateResult tL_messages_translateResult, TLRPC.TL_error tL_error) {
        i51Var.l0 = -1;
        di.d dVar = i51Var.Z;
        dVar.setLoading(false);
        if (tL_error != null) {
            org.telegram.ui.Cells.c1.p(i51Var.topBulletinContainer, i51Var.resourcesProvider, tL_error, false);
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new z41(i51Var, 0));
        } else if (tL_messages_translateResult == null || tL_messages_translateResult.result.isEmpty()) {
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new z41(i51Var, 1));
        } else {
            i51Var.c0 = MessageObject.formatTextWithEntities(tL_messages_translateResult.result.get(0));
            i51Var.b0 = false;
            i51Var.j0.N(true);
        }
    }

    public static /* synthetic */ void T(i51 i51Var, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        m61 G = i51Var.j0.G(i10 - 1);
        if (G == null) {
            return;
        }
        int i11 = G.d;
        if (i11 == 1) {
            CharSequence charSequence = i51Var.c0;
            if (charSequence == null || i51Var.b0) {
                return;
            }
            AndroidUtilities.addToClipboard(charSequence);
            return;
        }
        if (i11 == 2) {
            if (UserConfig.getInstance(i51Var.currentAccount).isPremium()) {
                MessagesController.getInstance(i51Var.currentAccount).getTranslateController().toggleTranslatingDialog(0L);
                i51Var.dismiss();
            } else {
                if (LaunchActivity.U() == null) {
                    return;
                }
                new sg.y0(i51Var.getContext(), 13, c6Var).show();
            }
        }
    }

    @Override // org.telegram.ui.Components.db
    public final CharSequence B() {
        return "Translate";
    }

    @Override // org.telegram.ui.Components.db
    public final void D(float f7) {
        float f10 = 1.0f - f7;
        ImageView imageView = this.X;
        imageView.setAlpha(f10);
        imageView.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f10));
        imageView.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f10));
    }

    public final void U(l80 l80Var, LinearLayout linearLayout, boolean z10, String str, Runnable runnable) {
        int i10 = org.telegram.ui.ActionBar.g6.E8;
        int i11 = org.telegram.ui.ActionBar.g6.F8;
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(1, getContext(), this.resourcesProvider, false, false);
        e1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        e1Var.setText(str);
        e1Var.setChecked(z10);
        e1Var.c(org.telegram.ui.ActionBar.g6.w0(i10, this.resourcesProvider), org.telegram.ui.ActionBar.g6.w0(i11, this.resourcesProvider));
        e1Var.setSelectorColor(org.telegram.ui.ActionBar.g6.m1(0.12f, org.telegram.ui.ActionBar.g6.w0(i10, this.resourcesProvider)));
        e1Var.setOnClickListener(new h(l80Var, z10, runnable, 1));
        linearLayout.addView(e1Var, w7.z5.n(-1, -2));
    }

    public final void V() {
        if (this.l0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.l0, true);
            this.l0 = -1;
        }
    }

    public final void W() {
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
        spannableStringBuilder.setSpan(new ia0(null, AndroidUtilities.dp(120.0f), 0, null), 0, spannableStringBuilder.length(), 33);
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
        this.l0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_translateText, new org.telegram.messenger.a(), new a51(this, i10));
        this.j0.N(true);
    }

    @Override // org.telegram.ui.Components.db, org.telegram.ui.ActionBar.e3
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

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void show() {
        super.show();
        za zaVar = this.e;
        if (zaVar != null) {
            zaVar.setTitle("Translate");
        }
        this.j0.N(false);
        W();
        if (this.d0 != null) {
            di.d dVar = this.Z;
            dVar.setText("Use This Translation");
            dVar.setOnClickListener(new z41(this, 3));
        }
    }

    @Override // org.telegram.ui.Components.db
    public final lm0 x(mm0 mm0Var) {
        a71 a71Var = new a71(mm0Var, getContext(), this.currentAccount, 0, true, new a51(this, 0), this.resourcesProvider);
        this.j0 = a71Var;
        a71Var.r = false;
        return a71Var;
    }
}
